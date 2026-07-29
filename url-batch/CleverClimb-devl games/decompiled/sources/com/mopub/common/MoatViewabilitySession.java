package com.mopub.common;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import android.webkit.WebView;
import com.cmplay.base.util.ipc.a;
import com.mopub.common.ExternalViewabilitySession;
import com.mopub.common.logging.MoPubLog;
import com.mopub.common.util.Reflection;
import com.mopub.mobileads.VastExtensionXmlManager;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* loaded from: classes2.dex */
class MoatViewabilitySession implements ExternalViewabilitySession {
    private static final String DEFAULT_PARTNER_CODE = "mopubinapphtmvideo468906546585";
    private static final String MOAT_AD_EVENT_PATH = "com.moat.analytics.mobile.mpub.MoatAdEvent";
    private static final String MOAT_AD_EVENT_TYPE_PATH = "com.moat.analytics.mobile.mpub.MoatAdEventType";
    private static final String MOAT_ANALYTICS_PATH = "com.moat.analytics.mobile.mpub.MoatAnalytics";
    private static final String MOAT_FACTORY_PATH = "com.moat.analytics.mobile.mpub.MoatFactory";
    private static final String MOAT_KEY = "moat";
    private static final String MOAT_OPTIONS_PATH = "com.moat.analytics.mobile.mpub.MoatOptions";
    private static final String MOAT_PLUGIN_PATH = "com.moat.analytics.mobile.mpub.MoatPlugin";
    private static final String MOAT_REACTIVE_VIDEO_TRACKER_PLUGIN_PATH = "com.moat.analytics.mobile.mpub.ReactiveVideoTrackerPlugin";
    private static final String MOAT_VAST_IDS_KEY = "zMoatVASTIDs";
    private static final String PARTNER_CODE_KEY = "partnerCode";
    private static final Map<String, String> QUERY_PARAM_MAPPING = new HashMap();
    private static boolean sIsVendorDisabled;
    private static Boolean sIsViewabilityEnabledViaReflection;
    private static boolean sWasInitialized;
    private Map<String, String> mAdIds = new HashMap();
    private Object mMoatVideoTracker;
    private Object mMoatWebAdTracker;
    private boolean mWasVideoPrepared;

    @Override // com.mopub.common.ExternalViewabilitySession
    public String getName() {
        return VastExtensionXmlManager.MOAT;
    }

    MoatViewabilitySession() {
    }

    static {
        QUERY_PARAM_MAPPING.put("moatClientLevel1", "level1");
        QUERY_PARAM_MAPPING.put("moatClientLevel2", "level2");
        QUERY_PARAM_MAPPING.put("moatClientLevel3", "level3");
        QUERY_PARAM_MAPPING.put("moatClientLevel4", "level4");
        QUERY_PARAM_MAPPING.put("moatClientSlicer1", "slicer1");
        QUERY_PARAM_MAPPING.put("moatClientSlicer2", "slicer2");
    }

    static boolean isEnabled() {
        return !sIsVendorDisabled && isViewabilityEnabledViaReflection();
    }

    static void disable() {
        sIsVendorDisabled = true;
    }

    private static boolean isViewabilityEnabledViaReflection() {
        if (sIsViewabilityEnabledViaReflection == null) {
            sIsViewabilityEnabledViaReflection = Boolean.valueOf(Reflection.classFound(MOAT_FACTORY_PATH));
            StringBuilder sb = new StringBuilder();
            sb.append("Moat is ");
            sb.append(sIsViewabilityEnabledViaReflection.booleanValue() ? "" : "un");
            sb.append("available via reflection.");
            MoPubLog.d(sb.toString());
        }
        return sIsViewabilityEnabledViaReflection.booleanValue();
    }

    @Override // com.mopub.common.ExternalViewabilitySession
    public Boolean initialize(Context context) {
        Application application;
        Preconditions.checkNotNull(context);
        if (!isEnabled()) {
            return null;
        }
        if (sWasInitialized) {
            return true;
        }
        if (context instanceof Activity) {
            application = ((Activity) context).getApplication();
        } else {
            try {
                application = (Application) context.getApplicationContext();
            } catch (ClassCastException unused) {
                MoPubLog.d("Unable to initialize Moat, error obtaining application context.");
                return false;
            }
        }
        try {
            Object instantiateClassWithEmptyConstructor = Reflection.instantiateClassWithEmptyConstructor(MOAT_OPTIONS_PATH, Object.class);
            instantiateClassWithEmptyConstructor.getClass().getField("disableAdIdCollection").setBoolean(instantiateClassWithEmptyConstructor, true);
            instantiateClassWithEmptyConstructor.getClass().getField("disableLocationServices").setBoolean(instantiateClassWithEmptyConstructor, true);
            new Reflection.MethodBuilder(new Reflection.MethodBuilder(null, a.FORCE_STATIC_METHOD).setStatic(MOAT_ANALYTICS_PATH).execute(), "start").addParam(MOAT_OPTIONS_PATH, instantiateClassWithEmptyConstructor).addParam((Class<Class>) Application.class, (Class) application).execute();
            sWasInitialized = true;
            return true;
        } catch (Exception e) {
            MoPubLog.d("Unable to initialize Moat: " + e.getMessage());
            return false;
        }
    }

    @Override // com.mopub.common.ExternalViewabilitySession
    public Boolean invalidate() {
        if (!isEnabled()) {
            return null;
        }
        this.mMoatWebAdTracker = null;
        this.mMoatVideoTracker = null;
        this.mAdIds.clear();
        return true;
    }

    @Override // com.mopub.common.ExternalViewabilitySession
    public Boolean createDisplaySession(Context context, WebView webView, boolean z) {
        Preconditions.checkNotNull(context);
        if (!isEnabled()) {
            return null;
        }
        try {
            this.mMoatWebAdTracker = new Reflection.MethodBuilder(new Reflection.MethodBuilder(null, "create").setStatic(MOAT_FACTORY_PATH).execute(), "createWebAdTracker").addParam((Class<Class>) WebView.class, (Class) webView).execute();
            if (!z) {
                new Reflection.MethodBuilder(this.mMoatWebAdTracker, "startTracking").execute();
            }
            return true;
        } catch (Exception e) {
            MoPubLog.d("Unable to execute Moat start display session: " + e.getMessage());
            return false;
        }
    }

    @Override // com.mopub.common.ExternalViewabilitySession
    public Boolean startDeferredDisplaySession(Activity activity) {
        if (!isEnabled()) {
            return null;
        }
        if (this.mMoatWebAdTracker == null) {
            MoPubLog.d("MoatWebAdTracker unexpectedly null.");
            return false;
        }
        try {
            new Reflection.MethodBuilder(this.mMoatWebAdTracker, "startTracking").execute();
            return true;
        } catch (Exception e) {
            MoPubLog.d("Unable to record deferred display session for Moat: " + e.getMessage());
            return false;
        }
    }

    @Override // com.mopub.common.ExternalViewabilitySession
    public Boolean endDisplaySession() {
        if (!isEnabled()) {
            return null;
        }
        if (this.mMoatWebAdTracker == null) {
            MoPubLog.d("Moat WebAdTracker unexpectedly null.");
            return false;
        }
        try {
            new Reflection.MethodBuilder(this.mMoatWebAdTracker, "stopTracking").execute();
            return true;
        } catch (Exception e) {
            MoPubLog.d("Unable to execute Moat end session: " + e.getMessage());
            return false;
        }
    }

    @Override // com.mopub.common.ExternalViewabilitySession
    public Boolean createVideoSession(Activity activity, View view, Set<String> set, Map<String, String> map) {
        Preconditions.checkNotNull(activity);
        Preconditions.checkNotNull(view);
        Preconditions.checkNotNull(set);
        Preconditions.checkNotNull(map);
        if (!isEnabled()) {
            return null;
        }
        updateAdIdsFromUrlStringAndBuyerResources(map.get(MOAT_KEY), set);
        String str = this.mAdIds.get("partnerCode");
        if (TextUtils.isEmpty(str)) {
            MoPubLog.d("partnerCode was empty when starting Moat video session");
            return false;
        }
        try {
            this.mMoatVideoTracker = new Reflection.MethodBuilder(new Reflection.MethodBuilder(null, "create").setStatic(MOAT_FACTORY_PATH).execute(), "createCustomTracker").addParam(MOAT_PLUGIN_PATH, Reflection.instantiateClassWithConstructor(MOAT_REACTIVE_VIDEO_TRACKER_PLUGIN_PATH, Object.class, new Class[]{String.class}, new Object[]{str})).execute();
            return true;
        } catch (Exception e) {
            MoPubLog.d("Unable to execute Moat start video session: " + e.getMessage());
            return false;
        }
    }

    @Override // com.mopub.common.ExternalViewabilitySession
    public Boolean registerVideoObstruction(View view) {
        Preconditions.checkNotNull(view);
        return !isEnabled() ? null : true;
    }

    @Override // com.mopub.common.ExternalViewabilitySession
    public Boolean onVideoPrepared(View view, int i) {
        Preconditions.checkNotNull(view);
        if (!isEnabled()) {
            return null;
        }
        if (this.mMoatVideoTracker == null) {
            MoPubLog.d("Moat VideoAdTracker unexpectedly null.");
            return false;
        }
        if (this.mWasVideoPrepared) {
            return false;
        }
        try {
            new Reflection.MethodBuilder(this.mMoatVideoTracker, "trackVideoAd").addParam((Class<Class>) Map.class, (Class) this.mAdIds).addParam((Class<Class>) Integer.class, (Class) Integer.valueOf(i)).addParam((Class<Class>) View.class, (Class) view).execute();
            this.mWasVideoPrepared = true;
            return true;
        } catch (Exception e) {
            MoPubLog.d("Unable to execute Moat onVideoPrepared: " + e.getMessage());
            return false;
        }
    }

    @Override // com.mopub.common.ExternalViewabilitySession
    public Boolean recordVideoEvent(ExternalViewabilitySession.VideoEvent videoEvent, int i) {
        Preconditions.checkNotNull(videoEvent);
        if (!isEnabled()) {
            return null;
        }
        if (this.mMoatVideoTracker == null) {
            MoPubLog.d("Moat VideoAdTracker unexpectedly null.");
            return false;
        }
        try {
            switch (videoEvent) {
                case AD_STARTED:
                case AD_STOPPED:
                case AD_PAUSED:
                case AD_PLAYING:
                case AD_SKIPPED:
                case AD_VIDEO_FIRST_QUARTILE:
                case AD_VIDEO_MIDPOINT:
                case AD_VIDEO_THIRD_QUARTILE:
                case AD_COMPLETE:
                    handleVideoEventReflection(videoEvent, i);
                    return true;
                case AD_LOADED:
                case AD_IMPRESSED:
                case AD_CLICK_THRU:
                case RECORD_AD_ERROR:
                    return null;
                default:
                    MoPubLog.d("Unexpected video event: " + videoEvent.getMoatEnumName());
                    return false;
            }
        } catch (Exception e) {
            MoPubLog.d("Video event " + videoEvent.getMoatEnumName() + " failed. " + e.getMessage());
            return false;
        }
    }

    @Override // com.mopub.common.ExternalViewabilitySession
    public Boolean endVideoSession() {
        if (!isEnabled()) {
            return null;
        }
        if (this.mMoatVideoTracker == null) {
            MoPubLog.d("Moat VideoAdTracker unexpectedly null.");
            return false;
        }
        try {
            new Reflection.MethodBuilder(this.mMoatVideoTracker, "stopTracking").execute();
            return true;
        } catch (Exception e) {
            MoPubLog.d("Unable to execute Moat end video session: " + e.getMessage());
            return false;
        }
    }

    private void updateAdIdsFromUrlStringAndBuyerResources(String str, Set<String> set) {
        this.mAdIds.clear();
        this.mAdIds.put("partnerCode", DEFAULT_PARTNER_CODE);
        this.mAdIds.put(MOAT_VAST_IDS_KEY, TextUtils.join(";", set));
        if (TextUtils.isEmpty(str)) {
            return;
        }
        Uri parse = Uri.parse(str);
        List<String> pathSegments = parse.getPathSegments();
        if (pathSegments.size() > 0 && !TextUtils.isEmpty(pathSegments.get(0))) {
            this.mAdIds.put("partnerCode", pathSegments.get(0));
        }
        String fragment = parse.getFragment();
        if (TextUtils.isEmpty(fragment)) {
            return;
        }
        for (String str2 : fragment.split("&")) {
            String[] split = str2.split("=");
            if (split.length >= 2) {
                String str3 = split[0];
                String str4 = split[1];
                if (!TextUtils.isEmpty(str3) && !TextUtils.isEmpty(str4) && QUERY_PARAM_MAPPING.containsKey(str3)) {
                    this.mAdIds.put(QUERY_PARAM_MAPPING.get(str3), str4);
                }
            }
        }
    }

    private boolean handleVideoEventReflection(ExternalViewabilitySession.VideoEvent videoEvent, int i) throws Exception {
        if (videoEvent.getMoatEnumName() == null) {
            return false;
        }
        Class<?> cls = Class.forName(MOAT_AD_EVENT_TYPE_PATH);
        new Reflection.MethodBuilder(this.mMoatVideoTracker, "dispatchEvent").addParam(MOAT_AD_EVENT_PATH, Reflection.instantiateClassWithConstructor(MOAT_AD_EVENT_PATH, Object.class, new Class[]{cls, Integer.class}, new Object[]{Enum.valueOf(cls.asSubclass(Enum.class), videoEvent.getMoatEnumName()), Integer.valueOf(i)})).execute();
        return true;
    }
}
