package com.mopub.mobileads;

import android.content.Context;
import android.graphics.Point;
import android.os.AsyncTask;
import android.text.TextUtils;
import android.view.Display;
import android.view.WindowManager;
import com.mopub.common.MoPubHttpUrlConnection;
import com.mopub.common.Preconditions;
import com.mopub.common.VisibleForTesting;
import com.mopub.common.logging.MoPubLog;
import com.mopub.common.util.Dips;
import com.mopub.common.util.Streams;
import com.mopub.common.util.Strings;
import com.mopub.mobileads.VastResource;
import com.mopub.network.Networking;
import com.mopub.network.TrackingRequest;
import java.io.BufferedInputStream;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.net.HttpURLConnection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
public class VastXmlManagerAggregator extends AsyncTask<String, Void, VastVideoConfig> {
    public static final String ADS_BY_AD_SLOT_ID = "adsBy";
    private static final double AREA_WEIGHT = 30.0d;
    private static final double ASPECT_RATIO_WEIGHT = 70.0d;
    static final int MAX_TIMES_TO_FOLLOW_VAST_REDIRECT = 10;
    private static final int MINIMUM_COMPANION_AD_HEIGHT = 250;
    private static final int MINIMUM_COMPANION_AD_WIDTH = 300;
    private static final String MOPUB = "MoPub";
    public static final String SOCIAL_ACTIONS_AD_SLOT_ID = "socialActions";
    private static final List<String> VIDEO_MIME_TYPES = Arrays.asList("video/mp4", "video/3gpp");
    private final Context mContext;
    private final int mScreenAreaDp;
    private final double mScreenAspectRatio;
    private int mTimesFollowedVastRedirect;
    private final WeakReference<VastXmlManagerAggregatorListener> mVastXmlManagerAggregatorListener;

    enum CompanionOrientation {
        LANDSCAPE,
        PORTRAIT
    }

    interface VastXmlManagerAggregatorListener {
        void onAggregationComplete(VastVideoConfig vastVideoConfig);
    }

    VastXmlManagerAggregator(VastXmlManagerAggregatorListener vastXmlManagerAggregatorListener, double d2, int i, Context context) {
        Preconditions.checkNotNull(vastXmlManagerAggregatorListener);
        Preconditions.checkNotNull(context);
        this.mVastXmlManagerAggregatorListener = new WeakReference<>(vastXmlManagerAggregatorListener);
        this.mScreenAspectRatio = d2;
        this.mScreenAreaDp = i;
        this.mContext = context.getApplicationContext();
    }

    @Override // android.os.AsyncTask
    protected void onPreExecute() {
        Networking.getUserAgent(this.mContext);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.os.AsyncTask
    public VastVideoConfig doInBackground(String... strArr) {
        if (strArr == null || strArr.length == 0 || strArr[0] == null) {
            return null;
        }
        try {
            return evaluateVastXmlManager(strArr[0], new ArrayList());
        } catch (Exception e) {
            MoPubLog.d("Unable to generate VastVideoConfig.", e);
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.os.AsyncTask
    public void onPostExecute(VastVideoConfig vastVideoConfig) {
        VastXmlManagerAggregatorListener vastXmlManagerAggregatorListener = this.mVastXmlManagerAggregatorListener.get();
        if (vastXmlManagerAggregatorListener != null) {
            vastXmlManagerAggregatorListener.onAggregationComplete(vastVideoConfig);
        }
    }

    @Override // android.os.AsyncTask
    protected void onCancelled() {
        VastXmlManagerAggregatorListener vastXmlManagerAggregatorListener = this.mVastXmlManagerAggregatorListener.get();
        if (vastXmlManagerAggregatorListener != null) {
            vastXmlManagerAggregatorListener.onAggregationComplete(null);
        }
    }

    @VisibleForTesting
    VastVideoConfig evaluateVastXmlManager(String str, List<VastTracker> list) {
        VastVideoConfig evaluateVastXmlManager;
        VastVideoConfig evaluateInLineXmlManager;
        Preconditions.checkNotNull(str, "vastXml cannot be null");
        Preconditions.checkNotNull(list, "errorTrackers cannot be null");
        VastXmlManager vastXmlManager = new VastXmlManager();
        try {
            vastXmlManager.parseVastXml(str);
            List<VastAdXmlManager> adXmlManagers = vastXmlManager.getAdXmlManagers();
            if (fireErrorTrackerIfNoAds(adXmlManagers, vastXmlManager, this.mContext)) {
                return null;
            }
            for (VastAdXmlManager vastAdXmlManager : adXmlManagers) {
                if (isValidSequenceNumber(vastAdXmlManager.getSequence())) {
                    VastInLineXmlManager inLineXmlManager = vastAdXmlManager.getInLineXmlManager();
                    if (inLineXmlManager != null && (evaluateInLineXmlManager = evaluateInLineXmlManager(inLineXmlManager, list)) != null) {
                        populateMoPubCustomElements(vastXmlManager, evaluateInLineXmlManager);
                        return evaluateInLineXmlManager;
                    }
                    VastWrapperXmlManager wrapperXmlManager = vastAdXmlManager.getWrapperXmlManager();
                    if (wrapperXmlManager != null) {
                        ArrayList arrayList = new ArrayList(list);
                        arrayList.addAll(wrapperXmlManager.getErrorTrackers());
                        String evaluateWrapperRedirect = evaluateWrapperRedirect(wrapperXmlManager, arrayList);
                        if (evaluateWrapperRedirect != null && (evaluateVastXmlManager = evaluateVastXmlManager(evaluateWrapperRedirect, arrayList)) != null) {
                            evaluateVastXmlManager.addImpressionTrackers(wrapperXmlManager.getImpressionTrackers());
                            Iterator<VastLinearXmlManager> it = wrapperXmlManager.getLinearXmlManagers().iterator();
                            while (it.hasNext()) {
                                populateLinearTrackersAndIcon(it.next(), evaluateVastXmlManager);
                            }
                            populateVideoViewabilityTracker(wrapperXmlManager, evaluateVastXmlManager);
                            populateViewabilityMetadata(wrapperXmlManager, evaluateVastXmlManager);
                            List<VastCompanionAdXmlManager> companionAdXmlManagers = wrapperXmlManager.getCompanionAdXmlManagers();
                            if (!evaluateVastXmlManager.hasCompanionAd()) {
                                evaluateVastXmlManager.setVastCompanionAd(getBestCompanionAd(companionAdXmlManagers, CompanionOrientation.LANDSCAPE), getBestCompanionAd(companionAdXmlManagers, CompanionOrientation.PORTRAIT));
                            } else {
                                VastCompanionAdConfig vastCompanionAd = evaluateVastXmlManager.getVastCompanionAd(2);
                                VastCompanionAdConfig vastCompanionAd2 = evaluateVastXmlManager.getVastCompanionAd(1);
                                if (vastCompanionAd != null && vastCompanionAd2 != null) {
                                    for (VastCompanionAdXmlManager vastCompanionAdXmlManager : companionAdXmlManagers) {
                                        if (!vastCompanionAdXmlManager.hasResources()) {
                                            vastCompanionAd.addClickTrackers(vastCompanionAdXmlManager.getClickTrackers());
                                            vastCompanionAd.addCreativeViewTrackers(vastCompanionAdXmlManager.getCompanionCreativeViewTrackers());
                                            vastCompanionAd2.addClickTrackers(vastCompanionAdXmlManager.getClickTrackers());
                                            vastCompanionAd2.addCreativeViewTrackers(vastCompanionAdXmlManager.getCompanionCreativeViewTrackers());
                                        }
                                    }
                                }
                            }
                            if (evaluateVastXmlManager.getSocialActionsCompanionAds().isEmpty()) {
                                evaluateVastXmlManager.setSocialActionsCompanionAds(getSocialActionsCompanionAds(companionAdXmlManagers));
                            }
                            populateMoPubCustomElements(vastXmlManager, evaluateVastXmlManager);
                            return evaluateVastXmlManager;
                        }
                    } else {
                        continue;
                    }
                }
            }
            return null;
        } catch (Exception e) {
            MoPubLog.d("Failed to parse VAST XML", e);
            TrackingRequest.makeVastTrackingHttpRequest(list, VastErrorCode.XML_PARSING_ERROR, null, null, this.mContext);
            return null;
        }
    }

    private VastVideoConfig evaluateInLineXmlManager(VastInLineXmlManager vastInLineXmlManager, List<VastTracker> list) {
        Preconditions.checkNotNull(vastInLineXmlManager);
        Preconditions.checkNotNull(list);
        for (VastLinearXmlManager vastLinearXmlManager : vastInLineXmlManager.getLinearXmlManagers()) {
            String bestMediaFileUrl = getBestMediaFileUrl(vastLinearXmlManager.getMediaXmlManagers());
            if (bestMediaFileUrl != null) {
                VastVideoConfig vastVideoConfig = new VastVideoConfig();
                vastVideoConfig.addImpressionTrackers(vastInLineXmlManager.getImpressionTrackers());
                populateLinearTrackersAndIcon(vastLinearXmlManager, vastVideoConfig);
                vastVideoConfig.setClickThroughUrl(vastLinearXmlManager.getClickThroughUrl());
                vastVideoConfig.setNetworkMediaFileUrl(bestMediaFileUrl);
                List<VastCompanionAdXmlManager> companionAdXmlManagers = vastInLineXmlManager.getCompanionAdXmlManagers();
                vastVideoConfig.setVastCompanionAd(getBestCompanionAd(companionAdXmlManagers, CompanionOrientation.LANDSCAPE), getBestCompanionAd(companionAdXmlManagers, CompanionOrientation.PORTRAIT));
                vastVideoConfig.setSocialActionsCompanionAds(getSocialActionsCompanionAds(companionAdXmlManagers));
                list.addAll(vastInLineXmlManager.getErrorTrackers());
                vastVideoConfig.addErrorTrackers(list);
                populateVideoViewabilityTracker(vastInLineXmlManager, vastVideoConfig);
                populateViewabilityMetadata(vastInLineXmlManager, vastVideoConfig);
                return vastVideoConfig;
            }
        }
        return null;
    }

    private void populateVideoViewabilityTracker(VastBaseInLineWrapperXmlManager vastBaseInLineWrapperXmlManager, VastVideoConfig vastVideoConfig) {
        VastExtensionParentXmlManager vastExtensionParentXmlManager;
        Preconditions.checkNotNull(vastBaseInLineWrapperXmlManager);
        Preconditions.checkNotNull(vastVideoConfig);
        if (vastVideoConfig.getVideoViewabilityTracker() == null && (vastExtensionParentXmlManager = vastBaseInLineWrapperXmlManager.getVastExtensionParentXmlManager()) != null) {
            for (VastExtensionXmlManager vastExtensionXmlManager : vastExtensionParentXmlManager.getVastExtensionXmlManagers()) {
                if (MOPUB.equals(vastExtensionXmlManager.getType())) {
                    vastVideoConfig.setVideoViewabilityTracker(vastExtensionXmlManager.getVideoViewabilityTracker());
                    return;
                }
            }
        }
    }

    private void populateViewabilityMetadata(VastBaseInLineWrapperXmlManager vastBaseInLineWrapperXmlManager, VastVideoConfig vastVideoConfig) {
        VastExtensionParentXmlManager vastExtensionParentXmlManager = vastBaseInLineWrapperXmlManager.getVastExtensionParentXmlManager();
        if (vastExtensionParentXmlManager != null) {
            for (VastExtensionXmlManager vastExtensionXmlManager : vastExtensionParentXmlManager.getVastExtensionXmlManagers()) {
                if (vastExtensionXmlManager != null) {
                    vastVideoConfig.addAvidJavascriptResources(vastExtensionXmlManager.getAvidJavaScriptResources());
                    vastVideoConfig.addMoatImpressionPixels(vastExtensionXmlManager.getMoatImpressionPixels());
                }
            }
        }
    }

    private String evaluateWrapperRedirect(VastWrapperXmlManager vastWrapperXmlManager, List<VastTracker> list) {
        String vastAdTagURI = vastWrapperXmlManager.getVastAdTagURI();
        if (vastAdTagURI == null) {
            return null;
        }
        try {
            return followVastRedirect(vastAdTagURI);
        } catch (Exception e) {
            MoPubLog.d("Failed to follow VAST redirect", e);
            if (!list.isEmpty()) {
                TrackingRequest.makeVastTrackingHttpRequest(list, VastErrorCode.WRAPPER_TIMEOUT, null, null, this.mContext);
            }
            return null;
        }
    }

    private void populateLinearTrackersAndIcon(VastLinearXmlManager vastLinearXmlManager, VastVideoConfig vastVideoConfig) {
        Preconditions.checkNotNull(vastLinearXmlManager, "linearXmlManager cannot be null");
        Preconditions.checkNotNull(vastVideoConfig, "vastVideoConfig cannot be null");
        vastVideoConfig.addAbsoluteTrackers(vastLinearXmlManager.getAbsoluteProgressTrackers());
        vastVideoConfig.addFractionalTrackers(vastLinearXmlManager.getFractionalProgressTrackers());
        vastVideoConfig.addPauseTrackers(vastLinearXmlManager.getPauseTrackers());
        vastVideoConfig.addResumeTrackers(vastLinearXmlManager.getResumeTrackers());
        vastVideoConfig.addCompleteTrackers(vastLinearXmlManager.getVideoCompleteTrackers());
        vastVideoConfig.addCloseTrackers(vastLinearXmlManager.getVideoCloseTrackers());
        vastVideoConfig.addSkipTrackers(vastLinearXmlManager.getVideoSkipTrackers());
        vastVideoConfig.addClickTrackers(vastLinearXmlManager.getClickTrackers());
        if (vastVideoConfig.getSkipOffsetString() == null) {
            vastVideoConfig.setSkipOffset(vastLinearXmlManager.getSkipOffset());
        }
        if (vastVideoConfig.getVastIconConfig() == null) {
            vastVideoConfig.setVastIconConfig(getBestIcon(vastLinearXmlManager.getIconXmlManagers()));
        }
    }

    private void populateMoPubCustomElements(VastXmlManager vastXmlManager, VastVideoConfig vastVideoConfig) {
        Preconditions.checkNotNull(vastXmlManager, "xmlManager cannot be null");
        Preconditions.checkNotNull(vastVideoConfig, "vastVideoConfig cannot be null");
        vastVideoConfig.addImpressionTrackers(vastXmlManager.getMoPubImpressionTrackers());
        if (vastVideoConfig.getCustomCtaText() == null) {
            vastVideoConfig.setCustomCtaText(vastXmlManager.getCustomCtaText());
        }
        if (vastVideoConfig.getCustomSkipText() == null) {
            vastVideoConfig.setCustomSkipText(vastXmlManager.getCustomSkipText());
        }
        if (vastVideoConfig.getCustomCloseIconUrl() == null) {
            vastVideoConfig.setCustomCloseIconUrl(vastXmlManager.getCustomCloseIconUrl());
        }
        if (vastVideoConfig.isCustomForceOrientationSet()) {
            return;
        }
        vastVideoConfig.setCustomForceOrientation(vastXmlManager.getCustomForceOrientation());
    }

    private boolean fireErrorTrackerIfNoAds(List<VastAdXmlManager> list, VastXmlManager vastXmlManager, Context context) {
        if (!list.isEmpty() || vastXmlManager.getErrorTracker() == null) {
            return false;
        }
        TrackingRequest.makeVastTrackingHttpRequest(Collections.singletonList(vastXmlManager.getErrorTracker()), this.mTimesFollowedVastRedirect > 0 ? VastErrorCode.NO_ADS_VAST_RESPONSE : VastErrorCode.UNDEFINED_ERROR, null, null, context);
        return true;
    }

    @VisibleForTesting
    String getBestMediaFileUrl(List<VastMediaXmlManager> list) {
        Preconditions.checkNotNull(list, "managers cannot be null");
        Iterator it = new ArrayList(list).iterator();
        double d2 = Double.POSITIVE_INFINITY;
        String str = null;
        while (it.hasNext()) {
            VastMediaXmlManager vastMediaXmlManager = (VastMediaXmlManager) it.next();
            String type = vastMediaXmlManager.getType();
            String mediaUrl = vastMediaXmlManager.getMediaUrl();
            if (!VIDEO_MIME_TYPES.contains(type) || mediaUrl == null) {
                it.remove();
            } else {
                Integer width = vastMediaXmlManager.getWidth();
                Integer height = vastMediaXmlManager.getHeight();
                if (width != null && width.intValue() > 0 && height != null && height.intValue() > 0) {
                    double calculateFitness = calculateFitness(width.intValue(), height.intValue());
                    if (calculateFitness < d2) {
                        d2 = calculateFitness;
                        str = mediaUrl;
                    }
                }
            }
        }
        return str;
    }

    @VisibleForTesting
    VastCompanionAdConfig getBestCompanionAd(List<VastCompanionAdXmlManager> list, CompanionOrientation companionOrientation) {
        VastResource.Type[] typeArr;
        ArrayList arrayList;
        int i;
        double calculateFitness;
        Preconditions.checkNotNull(list, "managers cannot be null");
        Preconditions.checkNotNull(companionOrientation, "orientation cannot be null");
        ArrayList<VastCompanionAdXmlManager> arrayList2 = new ArrayList(list);
        VastResource.Type[] values = VastResource.Type.values();
        int length = values.length;
        int i2 = 0;
        double d2 = Double.POSITIVE_INFINITY;
        VastCompanionAdXmlManager vastCompanionAdXmlManager = null;
        VastResource vastResource = null;
        Point point = null;
        while (i2 < length) {
            VastResource.Type type = values[i2];
            for (VastCompanionAdXmlManager vastCompanionAdXmlManager2 : arrayList2) {
                Integer width = vastCompanionAdXmlManager2.getWidth();
                Integer height = vastCompanionAdXmlManager2.getHeight();
                if (width != null) {
                    typeArr = values;
                    if (width.intValue() >= MINIMUM_COMPANION_AD_WIDTH && height != null && height.intValue() >= 250) {
                        Point scaledDimensions = getScaledDimensions(width.intValue(), height.intValue(), type, companionOrientation);
                        arrayList = arrayList2;
                        i = length;
                        VastResource fromVastResourceXmlManager = VastResource.fromVastResourceXmlManager(vastCompanionAdXmlManager2.getResourceXmlManager(), type, scaledDimensions.x, scaledDimensions.y);
                        if (fromVastResourceXmlManager != null) {
                            if (CompanionOrientation.PORTRAIT == companionOrientation) {
                                calculateFitness = calculateFitness(height.intValue(), width.intValue());
                            } else {
                                calculateFitness = calculateFitness(width.intValue(), height.intValue());
                            }
                            if (calculateFitness < d2) {
                                point = scaledDimensions;
                                vastResource = fromVastResourceXmlManager;
                                d2 = calculateFitness;
                                vastCompanionAdXmlManager = vastCompanionAdXmlManager2;
                            }
                        }
                        values = typeArr;
                        arrayList2 = arrayList;
                        length = i;
                    }
                } else {
                    typeArr = values;
                }
                arrayList = arrayList2;
                i = length;
                values = typeArr;
                arrayList2 = arrayList;
                length = i;
            }
            VastResource.Type[] typeArr2 = values;
            ArrayList arrayList3 = arrayList2;
            int i3 = length;
            if (vastCompanionAdXmlManager != null) {
                break;
            }
            i2++;
            values = typeArr2;
            arrayList2 = arrayList3;
            length = i3;
        }
        VastResource vastResource2 = vastResource;
        if (vastCompanionAdXmlManager != null) {
            return new VastCompanionAdConfig(point.x, point.y, vastResource2, vastCompanionAdXmlManager.getClickThroughUrl(), vastCompanionAdXmlManager.getClickTrackers(), vastCompanionAdXmlManager.getCompanionCreativeViewTrackers());
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x008e A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0010 A[SYNTHETIC] */
    @VisibleForTesting
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    Map<String, VastCompanionAdConfig> getSocialActionsCompanionAds(List<VastCompanionAdXmlManager> list) {
        VastResource fromVastResourceXmlManager;
        Preconditions.checkNotNull(list, "managers cannot be null");
        HashMap hashMap = new HashMap();
        for (VastCompanionAdXmlManager vastCompanionAdXmlManager : list) {
            Integer width = vastCompanionAdXmlManager.getWidth();
            Integer height = vastCompanionAdXmlManager.getHeight();
            if (width != null && height != null) {
                String adSlotId = vastCompanionAdXmlManager.getAdSlotId();
                if (ADS_BY_AD_SLOT_ID.equals(adSlotId)) {
                    if (width.intValue() >= 25 && width.intValue() <= 75 && height.intValue() >= 10 && height.intValue() <= 50) {
                        fromVastResourceXmlManager = VastResource.fromVastResourceXmlManager(vastCompanionAdXmlManager.getResourceXmlManager(), VastResource.Type.HTML_RESOURCE, width.intValue(), height.intValue());
                        if (fromVastResourceXmlManager == null) {
                            hashMap.put(adSlotId, new VastCompanionAdConfig(width.intValue(), height.intValue(), fromVastResourceXmlManager, vastCompanionAdXmlManager.getClickThroughUrl(), vastCompanionAdXmlManager.getClickTrackers(), vastCompanionAdXmlManager.getCompanionCreativeViewTrackers()));
                        }
                    }
                } else if (SOCIAL_ACTIONS_AD_SLOT_ID.equals(adSlotId) && width.intValue() >= 50 && width.intValue() <= 150 && height.intValue() >= 10 && height.intValue() <= 50) {
                    fromVastResourceXmlManager = VastResource.fromVastResourceXmlManager(vastCompanionAdXmlManager.getResourceXmlManager(), VastResource.Type.HTML_RESOURCE, width.intValue(), height.intValue());
                    if (fromVastResourceXmlManager == null) {
                    }
                }
            }
        }
        return hashMap;
    }

    @VisibleForTesting
    Point getScaledDimensions(int i, int i2, VastResource.Type type, CompanionOrientation companionOrientation) {
        int min;
        int max;
        Point point = new Point(i, i2);
        Display defaultDisplay = ((WindowManager) this.mContext.getSystemService("window")).getDefaultDisplay();
        int width = defaultDisplay.getWidth();
        int height = defaultDisplay.getHeight();
        int dipsToIntPixels = Dips.dipsToIntPixels(i, this.mContext);
        int dipsToIntPixels2 = Dips.dipsToIntPixels(i2, this.mContext);
        if (CompanionOrientation.LANDSCAPE == companionOrientation) {
            min = Math.max(width, height);
            max = Math.min(width, height);
        } else {
            min = Math.min(width, height);
            max = Math.max(width, height);
        }
        if (dipsToIntPixels <= min - 16 && dipsToIntPixels2 <= max - 16) {
            return point;
        }
        Point point2 = new Point();
        if (VastResource.Type.HTML_RESOURCE == type) {
            point2.x = Math.min(min, dipsToIntPixels);
            point2.y = Math.min(max, dipsToIntPixels2);
        } else {
            float f = dipsToIntPixels;
            float f2 = f / min;
            float f3 = dipsToIntPixels2;
            float f4 = f3 / max;
            if (f2 >= f4) {
                point2.x = min;
                point2.y = (int) (f3 / f2);
            } else {
                point2.x = (int) (f / f4);
                point2.y = max;
            }
        }
        point2.x -= 16;
        point2.y -= 16;
        if (point2.x < 0 || point2.y < 0) {
            return point;
        }
        point2.x = Dips.pixelsToIntDips(point2.x, this.mContext);
        point2.y = Dips.pixelsToIntDips(point2.y, this.mContext);
        return point2;
    }

    @VisibleForTesting
    VastIconConfig getBestIcon(List<VastIconXmlManager> list) {
        VastResource fromVastResourceXmlManager;
        Preconditions.checkNotNull(list, "managers cannot be null");
        ArrayList<VastIconXmlManager> arrayList = new ArrayList(list);
        for (VastResource.Type type : VastResource.Type.values()) {
            for (VastIconXmlManager vastIconXmlManager : arrayList) {
                Integer width = vastIconXmlManager.getWidth();
                Integer height = vastIconXmlManager.getHeight();
                if (width != null && width.intValue() > 0 && width.intValue() <= MINIMUM_COMPANION_AD_WIDTH && height != null && height.intValue() > 0 && height.intValue() <= MINIMUM_COMPANION_AD_WIDTH && (fromVastResourceXmlManager = VastResource.fromVastResourceXmlManager(vastIconXmlManager.getResourceXmlManager(), type, width.intValue(), height.intValue())) != null) {
                    return new VastIconConfig(vastIconXmlManager.getWidth().intValue(), vastIconXmlManager.getHeight().intValue(), vastIconXmlManager.getOffsetMS(), vastIconXmlManager.getDurationMS(), fromVastResourceXmlManager, vastIconXmlManager.getClickTrackingUris(), vastIconXmlManager.getClickThroughUri(), vastIconXmlManager.getViewTrackingUris());
                }
            }
        }
        return null;
    }

    private double calculateFitness(int i, int i2) {
        double d2 = i;
        double d3 = i2;
        Double.isNaN(d2);
        Double.isNaN(d3);
        double d4 = (d2 / d3) / this.mScreenAspectRatio;
        double d5 = i * i2;
        double d6 = this.mScreenAreaDp;
        Double.isNaN(d5);
        Double.isNaN(d6);
        return (Math.abs(Math.log(d4)) * ASPECT_RATIO_WEIGHT) + (Math.abs(Math.log(d5 / d6)) * AREA_WEIGHT);
    }

    static boolean isValidSequenceNumber(String str) {
        if (TextUtils.isEmpty(str)) {
            return true;
        }
        try {
            return Integer.parseInt(str) < 2;
        } catch (NumberFormatException unused) {
            return true;
        }
    }

    private String followVastRedirect(String str) throws IOException {
        Throwable th;
        HttpURLConnection httpURLConnection;
        Preconditions.checkNotNull(str);
        BufferedInputStream bufferedInputStream = null;
        if (this.mTimesFollowedVastRedirect >= 10) {
            return null;
        }
        this.mTimesFollowedVastRedirect++;
        try {
            httpURLConnection = MoPubHttpUrlConnection.getHttpUrlConnection(str);
            try {
                BufferedInputStream bufferedInputStream2 = new BufferedInputStream(httpURLConnection.getInputStream());
                try {
                    String fromStream = Strings.fromStream(bufferedInputStream2);
                    Streams.closeStream(bufferedInputStream2);
                    if (httpURLConnection != null) {
                        httpURLConnection.disconnect();
                    }
                    return fromStream;
                } catch (Throwable th2) {
                    bufferedInputStream = bufferedInputStream2;
                    th = th2;
                    Streams.closeStream(bufferedInputStream);
                    if (httpURLConnection != null) {
                        httpURLConnection.disconnect();
                    }
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
            }
        } catch (Throwable th4) {
            th = th4;
            httpURLConnection = null;
        }
    }

    @VisibleForTesting
    @Deprecated
    void setTimesFollowedVastRedirect(int i) {
        this.mTimesFollowedVastRedirect = i;
    }
}
