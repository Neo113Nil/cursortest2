package io.invertase.googlemobileads;

import android.app.Activity;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.ViewGroup;
import androidx.core.os.EnvironmentCompat;
import com.facebook.common.util.UriUtil;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableMap;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.admanager.AdManagerAdRequest;
import io.invertase.googlemobileads.common.ReactNativeAdView;
import io.invertase.googlemobileads.common.ReactNativeEventEmitter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.annotation.Nullable;

/* loaded from: classes3.dex */
public class ReactNativeGoogleMobileAdsCommon {
    static AdSize getAdSizeForAdaptiveBanner(String str, ViewGroup viewGroup) {
        try {
            Display defaultDisplay = ((Activity) Objects.requireNonNull(((ReactContext) viewGroup.getContext()).getCurrentActivity())).getWindowManager().getDefaultDisplay();
            DisplayMetrics displayMetrics = new DisplayMetrics();
            defaultDisplay.getMetrics(displayMetrics);
            float adWidth = ((ReactNativeAdView) viewGroup).getAdWidth();
            int i = (int) (displayMetrics.widthPixels / displayMetrics.density);
            if (adWidth > 0.0f) {
                i = Math.min(Math.round(adWidth), i);
            }
            float maxAdHeight = ((ReactNativeAdView) viewGroup).getMaxAdHeight();
            if (!"INLINE_ADAPTIVE_BANNER".equals(str)) {
                return AdSize.getCurrentOrientationAnchoredAdaptiveBannerAdSize(viewGroup.getContext(), i);
            }
            if (maxAdHeight > 0.0f) {
                return AdSize.getInlineAdaptiveBannerAdSize(i, Math.round(Math.max(maxAdHeight, 32.0f)));
            }
            return AdSize.getCurrentOrientationInlineAdaptiveBannerAdSize(viewGroup.getContext(), i);
        } catch (Exception unused) {
            return AdSize.BANNER;
        }
    }

    static AdSize getAdSize(String str, ViewGroup viewGroup) {
        if (str.matches("ADAPTIVE_BANNER|ANCHORED_ADAPTIVE_BANNER|INLINE_ADAPTIVE_BANNER")) {
            return getAdSizeForAdaptiveBanner(str, viewGroup);
        }
        return stringToAdSize(str);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    static AdSize stringToAdSize(String str) {
        Matcher matcher = Pattern.compile("([0-9]+)x([0-9]+)").matcher(str);
        if (matcher.find()) {
            return new AdSize(Integer.parseInt(matcher.group(1)), Integer.parseInt(matcher.group(2)));
        }
        String upperCase = str.toUpperCase();
        switch (upperCase.hashCode()) {
            case -1966536496:
                if (upperCase.equals("LARGE_BANNER")) {
                    return AdSize.LARGE_BANNER;
                }
                break;
            case -1008851236:
                if (upperCase.equals("FULL_BANNER")) {
                    return AdSize.FULL_BANNER;
                }
                break;
            case -96588539:
                if (upperCase.equals("MEDIUM_RECTANGLE")) {
                    return AdSize.MEDIUM_RECTANGLE;
                }
                break;
            case -14796567:
                if (upperCase.equals("WIDE_SKYSCRAPER")) {
                    return AdSize.WIDE_SKYSCRAPER;
                }
                break;
            case 66994602:
                if (upperCase.equals("FLUID")) {
                    return AdSize.FLUID;
                }
                break;
            case 446888797:
                if (upperCase.equals("LEADERBOARD")) {
                    return AdSize.LEADERBOARD;
                }
                break;
            case 1951953708:
                upperCase.equals("BANNER");
                break;
        }
        return AdSize.BANNER;
    }

    static WritableMap errorCodeToMap(int i) {
        WritableMap createMap = Arguments.createMap();
        if (i == 0) {
            createMap.putString("code", "error-code-internal-error");
            createMap.putString("message", "Something happened internally; for instance, an invalid response was received from the ad server.");
            return createMap;
        }
        if (i == 1) {
            createMap.putString("code", "error-code-invalid-request");
            createMap.putString("message", "The ad request was invalid; for instance, the ad unit ID was incorrect.");
            return createMap;
        }
        if (i == 2) {
            createMap.putString("code", "error-code-network-error");
            createMap.putString("message", "The ad request was unsuccessful due to network connectivity.");
            return createMap;
        }
        if (i != 3) {
            return createMap;
        }
        createMap.putString("code", "error-code-no-fill");
        createMap.putString("message", "The ad request was successful, but no ad was returned due to lack of ad inventory.");
        return createMap;
    }

    public static AdManagerAdRequest buildAdRequest(ReadableMap readableMap) {
        AdManagerAdRequest.Builder builder = new AdManagerAdRequest.Builder();
        Bundle bundle = new Bundle();
        if (readableMap.hasKey("requestNonPersonalizedAdsOnly") && readableMap.getBoolean("requestNonPersonalizedAdsOnly")) {
            bundle.putString("npa", "1");
        }
        if (readableMap.hasKey("networkExtras")) {
            for (Map.Entry<String, Object> entry : readableMap.getMap("networkExtras").toHashMap().entrySet()) {
                bundle.putString(entry.getKey(), (String) entry.getValue());
            }
        }
        builder.addNetworkExtrasBundle(AdMobAdapter.class, bundle);
        if (readableMap.hasKey("keywords")) {
            Iterator<Object> it = ((ReadableArray) Objects.requireNonNull(readableMap.getArray("keywords"))).toArrayList().iterator();
            while (it.hasNext()) {
                builder.addKeyword((String) it.next());
            }
        }
        if (readableMap.hasKey("contentUrl")) {
            builder.setContentUrl((String) Objects.requireNonNull(readableMap.getString("contentUrl")));
        }
        if (readableMap.hasKey("requestAgent")) {
            builder.setRequestAgent((String) Objects.requireNonNull(readableMap.getString("requestAgent")));
        }
        if (readableMap.hasKey("customTargeting")) {
            for (Map.Entry<String, Object> entry2 : readableMap.getMap("customTargeting").toHashMap().entrySet()) {
                String key = entry2.getKey();
                Object value = entry2.getValue();
                if (value instanceof String) {
                    builder.addCustomTargeting(key, (String) value);
                } else {
                    builder.addCustomTargeting(key, (ArrayList) value);
                }
            }
        }
        if (readableMap.hasKey("publisherProvidedId")) {
            builder.setPublisherProvidedId((String) Objects.requireNonNull(readableMap.getString("publisherProvidedId")));
        }
        return builder.build();
    }

    public static void sendAdEvent(String str, int i, String str2, String str3, @Nullable WritableMap writableMap) {
        ReactNativeEventEmitter sharedInstance = ReactNativeEventEmitter.getSharedInstance();
        WritableMap createMap = Arguments.createMap();
        createMap.putString("type", str2);
        if (writableMap != null) {
            createMap.putMap(ReactNativeGoogleMobileAdsEvent.GOOGLE_MOBILE_ADS_EVENT_ERROR, writableMap);
        }
        sharedInstance.sendEvent(new ReactNativeGoogleMobileAdsEvent(str, i, str3, createMap));
    }

    public static void sendAdEvent(String str, int i, String str2, String str3, @Nullable WritableMap writableMap, @Nullable WritableMap writableMap2) {
        ReactNativeEventEmitter sharedInstance = ReactNativeEventEmitter.getSharedInstance();
        WritableMap createMap = Arguments.createMap();
        createMap.putString("type", str2);
        if (writableMap != null) {
            createMap.putMap(ReactNativeGoogleMobileAdsEvent.GOOGLE_MOBILE_ADS_EVENT_ERROR, writableMap);
        }
        if (writableMap2 != null) {
            createMap.putMap(UriUtil.DATA_SCHEME, writableMap2);
        }
        sharedInstance.sendEvent(new ReactNativeGoogleMobileAdsEvent(str, i, str3, createMap));
    }

    public static String[] getCodeAndMessageFromAdError(AdError adError) {
        String str;
        String message = adError.getMessage();
        int code = adError.getCode();
        if (code == 0) {
            str = "internal-error";
        } else if (code == 1) {
            str = "invalid-request";
        } else if (code == 2) {
            str = "network-error";
        } else if (code != 3) {
            switch (code) {
                case 8:
                    str = "app-id-missing";
                    break;
                case 9:
                    str = "mediation-no-fill";
                    break;
                case 10:
                    str = "request-id-mismatch";
                    break;
                case 11:
                    str = "invalid-ad-string";
                    break;
                default:
                    str = EnvironmentCompat.MEDIA_UNKNOWN;
                    break;
            }
        } else {
            str = "no-fill";
        }
        return new String[]{str, message};
    }

    public static boolean isAdManagerUnit(String str) {
        if (str == null) {
            return false;
        }
        return str.startsWith("/");
    }
}
