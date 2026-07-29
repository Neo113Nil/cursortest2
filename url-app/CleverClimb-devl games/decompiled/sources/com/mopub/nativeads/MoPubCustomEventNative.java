package com.mopub.nativeads;

import android.content.Context;
import android.view.View;
import com.mopub.common.DataKeys;
import com.mopub.common.VisibleForTesting;
import com.mopub.common.logging.MoPubLog;
import com.mopub.common.util.Numbers;
import com.mopub.nativeads.CustomEventNative;
import com.mopub.nativeads.NativeImageHelper;
import com.tapjoy.TJAdUnitConstants;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class MoPubCustomEventNative extends CustomEventNative {
    @Override // com.mopub.nativeads.CustomEventNative
    protected void loadNativeAd(Context context, CustomEventNative.CustomEventNativeListener customEventNativeListener, Map<String, Object> map, Map<String, String> map2) {
        Object obj = map.get(DataKeys.JSON_BODY_KEY);
        if (!(obj instanceof JSONObject)) {
            customEventNativeListener.onNativeAdFailed(NativeErrorCode.INVALID_RESPONSE);
            return;
        }
        MoPubStaticNativeAd moPubStaticNativeAd = new MoPubStaticNativeAd(context, (JSONObject) obj, new ImpressionTracker(context), new NativeClickHandler(context), customEventNativeListener);
        if (map2.containsKey(DataKeys.IMPRESSION_MIN_VISIBLE_PERCENT)) {
            try {
                moPubStaticNativeAd.setImpressionMinPercentageViewed(Integer.parseInt(map2.get(DataKeys.IMPRESSION_MIN_VISIBLE_PERCENT)));
            } catch (NumberFormatException unused) {
                MoPubLog.d("Unable to format min visible percent: " + map2.get(DataKeys.IMPRESSION_MIN_VISIBLE_PERCENT));
            }
        }
        if (map2.containsKey(DataKeys.IMPRESSION_VISIBLE_MS)) {
            try {
                moPubStaticNativeAd.setImpressionMinTimeViewed(Integer.parseInt(map2.get(DataKeys.IMPRESSION_VISIBLE_MS)));
            } catch (NumberFormatException unused2) {
                MoPubLog.d("Unable to format min time: " + map2.get(DataKeys.IMPRESSION_VISIBLE_MS));
            }
        }
        if (map2.containsKey(DataKeys.IMPRESSION_MIN_VISIBLE_PX)) {
            try {
                moPubStaticNativeAd.setImpressionMinVisiblePx(Integer.valueOf(Integer.parseInt(map2.get(DataKeys.IMPRESSION_MIN_VISIBLE_PX))));
            } catch (NumberFormatException unused3) {
                MoPubLog.d("Unable to format min visible px: " + map2.get(DataKeys.IMPRESSION_MIN_VISIBLE_PX));
            }
        }
        try {
            moPubStaticNativeAd.loadAd();
        } catch (IllegalArgumentException unused4) {
            customEventNativeListener.onNativeAdFailed(NativeErrorCode.UNSPECIFIED);
        }
    }

    static class MoPubStaticNativeAd extends StaticNativeAd {

        @VisibleForTesting
        static final String PRIVACY_INFORMATION_CLICKTHROUGH_URL = "https://www.mopub.com/optout";
        private final Context mContext;
        private final CustomEventNative.CustomEventNativeListener mCustomEventNativeListener;
        private final ImpressionTracker mImpressionTracker;
        private final JSONObject mJsonObject;
        private final NativeClickHandler mNativeClickHandler;

        enum Parameter {
            IMPRESSION_TRACKER("imptracker", true),
            CLICK_TRACKER("clktracker", true),
            TITLE(TJAdUnitConstants.String.TITLE, false),
            TEXT("text", false),
            MAIN_IMAGE("mainimage", false),
            ICON_IMAGE("iconimage", false),
            CLICK_DESTINATION("clk", false),
            FALLBACK("fallback", false),
            CALL_TO_ACTION("ctatext", false),
            STAR_RATING("starrating", false);


            @VisibleForTesting
            static final Set<String> requiredKeys = new HashSet();
            final String name;
            final boolean required;

            static {
                for (Parameter parameter : values()) {
                    if (parameter.required) {
                        requiredKeys.add(parameter.name);
                    }
                }
            }

            Parameter(String str, boolean z) {
                this.name = str;
                this.required = z;
            }

            static Parameter from(String str) {
                for (Parameter parameter : values()) {
                    if (parameter.name.equals(str)) {
                        return parameter;
                    }
                }
                return null;
            }
        }

        MoPubStaticNativeAd(Context context, JSONObject jSONObject, ImpressionTracker impressionTracker, NativeClickHandler nativeClickHandler, CustomEventNative.CustomEventNativeListener customEventNativeListener) {
            this.mJsonObject = jSONObject;
            this.mContext = context.getApplicationContext();
            this.mImpressionTracker = impressionTracker;
            this.mNativeClickHandler = nativeClickHandler;
            this.mCustomEventNativeListener = customEventNativeListener;
        }

        void loadAd() throws IllegalArgumentException {
            if (!containsRequiredKeys(this.mJsonObject)) {
                throw new IllegalArgumentException("JSONObject did not contain required keys.");
            }
            Iterator<String> keys = this.mJsonObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                Parameter from = Parameter.from(next);
                if (from != null) {
                    try {
                        addInstanceVariable(from, this.mJsonObject.opt(next));
                    } catch (ClassCastException unused) {
                        throw new IllegalArgumentException("JSONObject key (" + next + ") contained unexpected value.");
                    }
                } else {
                    addExtra(next, this.mJsonObject.opt(next));
                }
            }
            setPrivacyInformationIconClickThroughUrl(PRIVACY_INFORMATION_CLICKTHROUGH_URL);
            NativeImageHelper.preCacheImages(this.mContext, getAllImageUrls(), new NativeImageHelper.ImageListener() { // from class: com.mopub.nativeads.MoPubCustomEventNative.MoPubStaticNativeAd.1
                @Override // com.mopub.nativeads.NativeImageHelper.ImageListener
                public void onImagesCached() {
                    MoPubStaticNativeAd.this.mCustomEventNativeListener.onNativeAdLoaded(MoPubStaticNativeAd.this);
                }

                @Override // com.mopub.nativeads.NativeImageHelper.ImageListener
                public void onImagesFailedToCache(NativeErrorCode nativeErrorCode) {
                    MoPubStaticNativeAd.this.mCustomEventNativeListener.onNativeAdFailed(nativeErrorCode);
                }
            });
        }

        private boolean containsRequiredKeys(JSONObject jSONObject) {
            HashSet hashSet = new HashSet();
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                hashSet.add(keys.next());
            }
            return hashSet.containsAll(Parameter.requiredKeys);
        }

        private void addInstanceVariable(Parameter parameter, Object obj) throws ClassCastException {
            try {
                switch (parameter) {
                    case MAIN_IMAGE:
                        setMainImageUrl((String) obj);
                        break;
                    case ICON_IMAGE:
                        setIconImageUrl((String) obj);
                        break;
                    case IMPRESSION_TRACKER:
                        addImpressionTrackers(obj);
                        break;
                    case CLICK_DESTINATION:
                        setClickDestinationUrl((String) obj);
                        break;
                    case CLICK_TRACKER:
                        parseClickTrackers(obj);
                        break;
                    case CALL_TO_ACTION:
                        setCallToAction((String) obj);
                        break;
                    case TITLE:
                        setTitle((String) obj);
                        break;
                    case TEXT:
                        setText((String) obj);
                        break;
                    case STAR_RATING:
                        setStarRating(Numbers.parseDouble(obj));
                        break;
                    default:
                        MoPubLog.d("Unable to add JSON key to internal mapping: " + parameter.name);
                        break;
                }
            } catch (ClassCastException e) {
                if (!parameter.required) {
                    MoPubLog.d("Ignoring class cast exception for optional key: " + parameter.name);
                    return;
                }
                throw e;
            }
        }

        private void parseClickTrackers(Object obj) {
            if (obj instanceof JSONArray) {
                addClickTrackers(obj);
            } else {
                addClickTracker((String) obj);
            }
        }

        private boolean isImageKey(String str) {
            return str != null && str.toLowerCase(Locale.US).endsWith("image");
        }

        List<String> getExtrasImageUrls() {
            ArrayList arrayList = new ArrayList(getExtras().size());
            for (Map.Entry<String, Object> entry : getExtras().entrySet()) {
                if (isImageKey(entry.getKey()) && (entry.getValue() instanceof String)) {
                    arrayList.add((String) entry.getValue());
                }
            }
            return arrayList;
        }

        List<String> getAllImageUrls() {
            ArrayList arrayList = new ArrayList();
            if (getMainImageUrl() != null) {
                arrayList.add(getMainImageUrl());
            }
            if (getIconImageUrl() != null) {
                arrayList.add(getIconImageUrl());
            }
            arrayList.addAll(getExtrasImageUrls());
            return arrayList;
        }

        @Override // com.mopub.nativeads.StaticNativeAd, com.mopub.nativeads.BaseNativeAd
        public void prepare(View view) {
            this.mImpressionTracker.addView(view, this);
            this.mNativeClickHandler.setOnClickListener(view, this);
        }

        @Override // com.mopub.nativeads.StaticNativeAd, com.mopub.nativeads.BaseNativeAd
        public void clear(View view) {
            this.mImpressionTracker.removeView(view);
            this.mNativeClickHandler.clearOnClickListener(view);
        }

        @Override // com.mopub.nativeads.StaticNativeAd, com.mopub.nativeads.BaseNativeAd
        public void destroy() {
            this.mImpressionTracker.destroy();
        }

        @Override // com.mopub.nativeads.StaticNativeAd, com.mopub.nativeads.ImpressionInterface
        public void recordImpression(View view) {
            notifyAdImpressed();
        }

        @Override // com.mopub.nativeads.StaticNativeAd, com.mopub.nativeads.ClickInterface
        public void handleClick(View view) {
            notifyAdClicked();
            this.mNativeClickHandler.openClickDestinationUrl(getClickDestinationUrl(), view);
        }
    }
}
