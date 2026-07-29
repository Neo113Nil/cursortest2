package com.mopub.mobileads;

import android.support.v4.os.EnvironmentCompat;
import com.mopub.common.AdFormat;
import com.mopub.common.AdType;
import com.mopub.common.util.ResponseHeader;
import com.mopub.network.HeaderUtils;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class AdTypeTranslator {
    public static final String BANNER_SUFFIX = "_banner";
    public static final String INTERSTITIAL_SUFFIX = "_interstitial";

    public enum CustomEventType {
        GOOGLE_PLAY_SERVICES_BANNER("admob_native_banner", "com.mopub.mobileads.GooglePlayServicesBanner", false),
        GOOGLE_PLAY_SERVICES_INTERSTITIAL("admob_full_interstitial", "com.mopub.mobileads.GooglePlayServicesInterstitial", false),
        MILLENNIAL_BANNER("millennial_native_banner", "com.mopub.mobileads.MillennialBanner", false),
        MILLENNIAL_INTERSTITIAL("millennial_full_interstitial", "com.mopub.mobileads.MillennialInterstitial", false),
        MRAID_BANNER("mraid_banner", "com.mopub.mraid.MraidBanner", true),
        MRAID_INTERSTITIAL("mraid_interstitial", "com.mopub.mraid.MraidInterstitial", true),
        HTML_BANNER("html_banner", "com.mopub.mobileads.HtmlBanner", true),
        HTML_INTERSTITIAL("html_interstitial", "com.mopub.mobileads.HtmlInterstitial", true),
        VAST_VIDEO_INTERSTITIAL("vast_interstitial", "com.mopub.mobileads.VastVideoInterstitial", true),
        MOPUB_NATIVE("mopub_native", "com.mopub.nativeads.MoPubCustomEventNative", true),
        MOPUB_VIDEO_NATIVE("mopub_video_native", "com.mopub.nativeads.MoPubCustomEventVideoNative", true),
        MOPUB_REWARDED_VIDEO(AdType.REWARDED_VIDEO, "com.mopub.mobileads.MoPubRewardedVideo", true),
        MOPUB_REWARDED_PLAYABLE(AdType.REWARDED_PLAYABLE, "com.mopub.mobileads.MoPubRewardedPlayable", true),
        UNSPECIFIED("", null, false);

        private final String mClassName;
        private final boolean mIsMoPubSpecific;
        private final String mKey;

        CustomEventType(String str, String str2, boolean z) {
            this.mKey = str;
            this.mClassName = str2;
            this.mIsMoPubSpecific = z;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static CustomEventType fromString(String str) {
            for (CustomEventType customEventType : values()) {
                if (customEventType.mKey.equals(str)) {
                    return customEventType;
                }
            }
            return UNSPECIFIED;
        }

        private static CustomEventType fromClassName(String str) {
            for (CustomEventType customEventType : values()) {
                if (customEventType.mClassName != null && customEventType.mClassName.equals(str)) {
                    return customEventType;
                }
            }
            return UNSPECIFIED;
        }

        @Override // java.lang.Enum
        public String toString() {
            return this.mClassName;
        }

        public static boolean isMoPubSpecific(String str) {
            return fromClassName(str).mIsMoPubSpecific;
        }
    }

    static String getAdNetworkType(String str, String str2) {
        if (AdType.INTERSTITIAL.equals(str)) {
            str = str2;
        }
        return str != null ? str : EnvironmentCompat.MEDIA_UNKNOWN;
    }

    public static String getCustomEventName(AdFormat adFormat, String str, String str2, JSONObject jSONObject) {
        CustomEventType fromString;
        if (AdType.CUSTOM.equalsIgnoreCase(str)) {
            return HeaderUtils.extractHeader(jSONObject, ResponseHeader.CUSTOM_EVENT_NAME);
        }
        if (AdType.STATIC_NATIVE.equalsIgnoreCase(str)) {
            return CustomEventType.MOPUB_NATIVE.toString();
        }
        if (AdType.VIDEO_NATIVE.equalsIgnoreCase(str)) {
            return CustomEventType.MOPUB_VIDEO_NATIVE.toString();
        }
        if (AdType.REWARDED_VIDEO.equalsIgnoreCase(str)) {
            return CustomEventType.MOPUB_REWARDED_VIDEO.toString();
        }
        if (AdType.REWARDED_PLAYABLE.equalsIgnoreCase(str)) {
            return CustomEventType.MOPUB_REWARDED_PLAYABLE.toString();
        }
        if ("html".equalsIgnoreCase(str) || AdType.MRAID.equalsIgnoreCase(str)) {
            if (AdFormat.INTERSTITIAL.equals(adFormat)) {
                fromString = CustomEventType.fromString(str + INTERSTITIAL_SUFFIX);
            } else {
                fromString = CustomEventType.fromString(str + BANNER_SUFFIX);
            }
            return fromString.toString();
        }
        if (AdType.INTERSTITIAL.equalsIgnoreCase(str)) {
            return CustomEventType.fromString(str2 + INTERSTITIAL_SUFFIX).toString();
        }
        return CustomEventType.fromString(str + BANNER_SUFFIX).toString();
    }
}
