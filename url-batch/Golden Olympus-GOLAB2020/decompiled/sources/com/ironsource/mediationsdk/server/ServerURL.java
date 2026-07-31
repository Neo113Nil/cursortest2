package com.ironsource.mediationsdk.server;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import android.util.Pair;
import com.ironsource.C1442c4;
import com.ironsource.C1495k1;
import com.ironsource.ge;
import com.ironsource.mb;
import com.ironsource.mediationsdk.config.ConfigFile;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.metadata.a;
import com.ironsource.mediationsdk.utils.IronSourceAES;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import com.ironsource.nm;
import com.ironsource.o9;
import com.ironsource.of;
import com.ironsource.rk;
import com.ironsource.x8;
import com.ironsource.y8;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes2.dex */
public class ServerURL {
    private static final String AMPERSAND = "&";
    private static final String ANDROID = "android";
    private static final String APPLICATION_KEY = "applicationKey";
    private static final String APPLICATION_USER_ID = "applicationUserId";
    private static final String APPLICATION_VERSION = "appVer";
    private static final String AUID = "auid";
    private static String BASE_URL_PREFIX = "https://i-sdk.mediation.unity3d.com/sdk/v";
    private static final String BASE_URL_SUFFIX = "?request=";
    private static final String BROWSER_USER_AGENT = "browserUserAgent";
    private static final String BUNDLE_ID = "bundleId";
    private static final String CONNECTION_TYPE = "connType";
    private static final String COPPA = "coppa";
    private static final String DEVICE_LANG = "deviceLang";
    private static final String DEVICE_MAKE = "devMake";
    private static final String DEVICE_MODEL = "devModel";
    private static final String EQUAL = "=";
    private static final String FIRST_SESSION = "fs";
    private static final String GAID = "advId";
    private static final String GOOGLE_FAMILY_SUPPORT = "dff";
    private static final String IMPRESSION = "impression";
    private static final String ISO_COUNTRY_CODE = "icc";
    private static final String IS_DEMAND_ONLY = "isDemandOnly";
    private static final String MEDIATION_TYPE = "mt";
    private static final String MOBILE_CARRIER = "mCar";
    private static final String MOBILE_COUNTRY_CODE = "mcc";
    private static final String MOBILE_NETWORK_CODE = "mnc";
    private static final String OS_VERSION = "osVer";
    private static final String PLACEMENT = "placementId";
    private static final String PLATFORM_KEY = "platform";
    private static final String PLUGIN_FW_VERSION = "plugin_fw_v";
    private static final String PLUGIN_TYPE = "pluginType";
    private static final String PLUGIN_VERSION = "pluginVersion";
    private static final String RAW_CONNECTION_TYPE = "rawConnType";
    private static final String REWARDED_VIDEO_MANUAL_MODE = "rvManual";
    private static final String SDK_VERSION = "sdkVersion";
    private static final String SERR = "serr";
    private static final String TEST_SUITE = "ts";
    private static final String TIME_ZONE_ID = "tz";
    private static final String TIME_ZONE_OFFSET = "tzOff";

    public static String buildInitURL(Context context, String str, String str2, String str3, String str4, boolean z4, List<Pair<String, String>> list, boolean z5) {
        String str5;
        List<String> list2;
        of f4 = nm.S().f();
        ArrayList arrayList = new ArrayList();
        arrayList.add(new Pair("platform", "android"));
        arrayList.add(new Pair("applicationKey", str));
        if (!TextUtils.isEmpty(str2)) {
            arrayList.add(new Pair("applicationUserId", str2));
        }
        arrayList.add(new Pair("sdkVersion", IronSourceUtils.getSDKVersion()));
        if (z4) {
            arrayList.add(new Pair(REWARDED_VIDEO_MANUAL_MODE, "1"));
        }
        if (!IronSourceUtils.isEncryptedResponse()) {
            arrayList.add(new Pair(SERR, "0"));
        }
        if (!TextUtils.isEmpty(ConfigFile.getConfigFile().getPluginType())) {
            arrayList.add(new Pair(PLUGIN_TYPE, ConfigFile.getConfigFile().getPluginType()));
        }
        if (!TextUtils.isEmpty(ConfigFile.getConfigFile().getPluginVersion())) {
            arrayList.add(new Pair(PLUGIN_VERSION, ConfigFile.getConfigFile().getPluginVersion()));
        }
        if (!TextUtils.isEmpty(ConfigFile.getConfigFile().getPluginFrameworkVersion())) {
            arrayList.add(new Pair(PLUGIN_FW_VERSION, ConfigFile.getConfigFile().getPluginFrameworkVersion()));
        }
        if (!TextUtils.isEmpty(str3)) {
            arrayList.add(new Pair(GAID, str3));
        }
        if (!TextUtils.isEmpty(str4)) {
            arrayList.add(new Pair("mt", str4));
        }
        String b4 = C1442c4.b(context, context.getPackageName());
        if (!TextUtils.isEmpty(b4)) {
            arrayList.add(new Pair(APPLICATION_VERSION, b4));
        }
        arrayList.add(new Pair(OS_VERSION, Build.VERSION.SDK_INT + ""));
        arrayList.add(new Pair(DEVICE_MAKE, Build.MANUFACTURER));
        arrayList.add(new Pair(DEVICE_MODEL, Build.MODEL));
        arrayList.add(new Pair("fs", (IronSourceUtils.getFirstSession(context) ? 1 : 0) + ""));
        ConcurrentHashMap<String, List<String>> c4 = rk.b().c();
        if (c4.containsKey(a.f17676b)) {
            arrayList.add(new Pair(COPPA, c4.get(a.f17676b).get(0)));
        }
        if (c4.containsKey(a.f17680f)) {
            String str6 = c4.get(a.f17680f).get(0);
            if (!TextUtils.isEmpty(str6) && str6.equalsIgnoreCase(a.f17684j)) {
                arrayList.add(new Pair("ts", "1"));
            }
        }
        if (c4.containsKey(a.f17678d)) {
            String str7 = c4.get(a.f17678d).get(0);
            if (!TextUtils.isEmpty(str7) && str7.equalsIgnoreCase(a.f17681g)) {
                arrayList.add(new Pair(GOOGLE_FAMILY_SUPPORT, "1"));
            }
        }
        if (c4.containsKey(a.f17679e) && (list2 = c4.get(a.f17679e)) != null) {
            arrayList.add(new Pair(a.f17679e, list2.get(0)));
        }
        String connectionType = IronSourceUtils.getConnectionType(context);
        if (!TextUtils.isEmpty(connectionType)) {
            arrayList.add(new Pair(CONNECTION_TYPE, connectionType));
        }
        String d4 = y8.d(context);
        if (!TextUtils.isEmpty(d4)) {
            arrayList.add(new Pair(RAW_CONNECTION_TYPE, d4));
        }
        if (list != null) {
            arrayList.addAll(list);
        }
        String t4 = f4.t();
        if (t4.length() != 0) {
            arrayList.add(new Pair(BROWSER_USER_AGENT, t4));
        }
        try {
            str5 = f4.b(context) + "-" + f4.I(context);
        } catch (Exception e4) {
            o9.d().a(e4);
            IronLog.INTERNAL.error(e4.toString());
            str5 = null;
        }
        if (str5 != null && str5.length() != 0) {
            arrayList.add(new Pair(DEVICE_LANG, str5));
        }
        arrayList.add(new Pair("bundleId", context.getPackageName()));
        arrayList.add(new Pair("mcc", "" + x8.b(context)));
        arrayList.add(new Pair("mnc", "" + x8.c(context)));
        String n4 = f4.n(context);
        if (!TextUtils.isEmpty(n4)) {
            arrayList.add(new Pair("icc", n4));
        }
        String j4 = f4.j(context);
        if (!TextUtils.isEmpty(j4)) {
            arrayList.add(new Pair(MOBILE_CARRIER, j4));
        }
        String b5 = f4.b();
        if (!TextUtils.isEmpty(b5)) {
            arrayList.add(new Pair("tz", b5));
        }
        arrayList.add(new Pair(TIME_ZONE_OFFSET, "" + f4.q()));
        String t5 = f4.t(context);
        if (!TextUtils.isEmpty(t5)) {
            arrayList.add(new Pair("auid", t5));
        }
        if (z5) {
            arrayList.add(new Pair("isDemandOnly", "1"));
        }
        arrayList.add(new Pair(ge.f16458g0, String.valueOf(C1495k1.a())));
        return getBaseUrl(IronSourceUtils.getSDKVersion()) + URLEncoder.encode(IronSourceAES.encode(mb.b().c(), createURLParams(arrayList)), "UTF-8");
    }

    private static String createURLParams(List<Pair<String, String>> list) {
        String str = "";
        for (Pair<String, String> pair : list) {
            if (str.length() > 0) {
                str = str + "&";
            }
            str = str + ((String) pair.first) + "=" + URLEncoder.encode((String) pair.second, "UTF-8");
        }
        return str;
    }

    private static String getBaseUrl(String str) {
        return BASE_URL_PREFIX + str + BASE_URL_SUFFIX;
    }

    public static String getRequestURL(String str, boolean z4, int i4) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new Pair("impression", Boolean.toString(z4)));
        arrayList.add(new Pair("placementId", Integer.toString(i4)));
        return str + "&" + createURLParams(arrayList);
    }

    private static void setBaseUrlPrefix(String str) {
        BASE_URL_PREFIX = str;
    }
}
