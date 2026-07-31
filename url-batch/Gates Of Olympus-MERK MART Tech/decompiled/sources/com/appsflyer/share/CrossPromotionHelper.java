package com.appsflyer.share;

import android.content.Context;
import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerLib;
import com.appsflyer.AppsFlyerProperties;
import com.appsflyer.internal.AFb1tSDK;
import com.appsflyer.internal.AFd1mSDK;
import com.appsflyer.internal.AFe1cSDK;
import com.appsflyer.internal.AFe1cSDK.AnonymousClass5;
import com.appsflyer.internal.AFf1vSDK;
import com.appsflyer.internal.AFg1jSDK;
import com.appsflyer.internal.AFi1aSDK;
import com.appsflyer.internal.AFi1bSDK;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes3.dex */
public class CrossPromotionHelper {
    private static String AFKeystoreWrapper = "https://%simpression.%s";

    public static void logAndOpenStore(Context context, String str, String str2) {
        logAndOpenStore(context, str, str2, null);
    }

    public static void logAndOpenStore(Context context, String str, String str2, Map<String, String> map) {
        LinkGenerator AFInAppEventParameterName = AFInAppEventParameterName(context, str, str2, map, String.format(AFi1bSDK.AFKeystoreWrapper, AppsFlyerLib.getInstance().getHostPrefix(), AFb1tSDK.AFInAppEventType().getHostName()));
        if (AppsFlyerProperties.getInstance().getBoolean(AppsFlyerProperties.AF_WAITFOR_CUSTOMERID, false)) {
            AFLogger.INSTANCE.i(AFg1jSDK.CROSS_PROMOTION, "CustomerUserId not set, track And Open Store is disabled", true);
            return;
        }
        if (AppsFlyerLib.getInstance().isStopped()) {
            AFLogger.INSTANCE.i(AFg1jSDK.CROSS_PROMOTION, "SDK is stopped, track And Open Store is disabled", true);
            return;
        }
        if (map == null) {
            map = new HashMap<>();
        }
        map.put("af_campaign", str2);
        AppsFlyerLib.getInstance().logEvent(context, "af_cross_promotion", map);
        valueOf(AFInAppEventParameterName.generateLink(), context, new AFi1aSDK(context));
    }

    public static void logCrossPromoteImpression(Context context, String str, String str2) {
        logCrossPromoteImpression(context, str, str2, null);
    }

    public static void logCrossPromoteImpression(Context context, String str, String str2, Map<String, String> map) {
        if (AppsFlyerProperties.getInstance().getBoolean(AppsFlyerProperties.AF_WAITFOR_CUSTOMERID, false)) {
            AFLogger.INSTANCE.i(AFg1jSDK.CROSS_PROMOTION, "CustomerUserId not set, Promote Impression is disabled", true);
        } else if (AppsFlyerLib.getInstance().isStopped()) {
            AFLogger.INSTANCE.i(AFg1jSDK.CROSS_PROMOTION, "SDK is stopped, Promote Impression is disabled", true);
        } else {
            valueOf(AFInAppEventParameterName(context, str, str2, map, String.format(AFKeystoreWrapper, AppsFlyerLib.getInstance().getHostPrefix(), AFb1tSDK.AFInAppEventType().getHostName())).generateLink(), context, null);
        }
    }

    private static void valueOf(String str, Context context, AFi1aSDK aFi1aSDK) {
        AFb1tSDK AFInAppEventType = AFb1tSDK.AFInAppEventType();
        AFInAppEventType.valueOf(context);
        AFd1mSDK values = AFInAppEventType.values();
        AFf1vSDK aFf1vSDK = new AFf1vSDK(values, str, aFi1aSDK);
        AFe1cSDK i = values.i();
        i.AFInAppEventParameterName.execute(i.new AnonymousClass5(aFf1vSDK));
    }

    private static LinkGenerator AFInAppEventParameterName(Context context, String str, String str2, Map<String, String> map, String str3) {
        LinkGenerator linkGenerator = new LinkGenerator("af_cross_promotion");
        linkGenerator.AFInAppEventParameterName = str3;
        linkGenerator.values = str;
        linkGenerator.addParameter("af_siteid", context.getPackageName());
        if (str2 != null) {
            linkGenerator.setCampaign(str2);
        }
        if (map != null) {
            linkGenerator.addParameters(map);
        }
        String string = AppsFlyerProperties.getInstance().getString("advertiserId");
        if (string != null) {
            linkGenerator.addParameter("advertising_id", string);
        }
        return linkGenerator;
    }

    public static void setUrl(Map<String, String> map) {
        for (Map.Entry<String, String> entry : map.entrySet()) {
            String value = entry.getValue();
            String key = entry.getKey();
            key.hashCode();
            if (key.equals("app")) {
                AFi1bSDK.AFKeystoreWrapper = value;
            } else if (key.equals("impression")) {
                AFKeystoreWrapper = value;
            }
        }
    }
}
