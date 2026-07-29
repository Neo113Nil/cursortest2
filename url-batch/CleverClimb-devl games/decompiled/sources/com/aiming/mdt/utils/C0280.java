package com.aiming.mdt.utils;

import android.content.pm.PackageInfo;
import android.support.v4.app.NotificationCompat;
import android.text.TextUtils;
import com.aiming.mdt.a.C0045;
import com.aiming.mdt.a.C0131;
import com.aiming.mdt.a.C0162;
import com.aiming.mdt.adt.C0226;
import com.aiming.mdt.adt.C0239;
import com.cmplay.base.util.webview.util.WebUtils;
import com.tapjoy.TapjoyConstants;
import com.umeng.commonsdk.proguard.d;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.regex.Pattern;
import org.json.JSONObject;

/* renamed from: com.aiming.mdt.utils.ʻʽʾ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C0280 {

    /* renamed from: ʻ, reason: contains not printable characters */
    private List<C0281> f820;

    /* renamed from: com.aiming.mdt.utils.ʻʽʾ$ʻʽ, reason: contains not printable characters */
    static class C0281 {

        /* renamed from: ʻʽ, reason: contains not printable characters */
        private String f821;

        /* renamed from: ʽ, reason: contains not printable characters */
        private String f822;

        private C0281(String str, Object obj) {
            this.f822 = str;
            this.f821 = obj == null ? "" : obj.toString();
        }

        /* synthetic */ C0281(String str, Object obj, byte b2) {
            this(str, obj);
        }
    }

    static {
        Pattern.compile("(?i)%(?![\\da-f]{2})");
    }

    public C0280() {
        this.f820 = new ArrayList();
    }

    private C0280(int i) {
        this.f820 = new ArrayList(2);
    }

    /* renamed from: ʻ, reason: contains not printable characters */
    private static byte[] m954() {
        String join = TextUtils.join("\u0001", new Object[]{C0162.m619().m622("Device", String.class), C0162.m619().m622("Model", String.class), C0162.m619().m622("Product", String.class), C0162.m619().m622("Manufacturer", String.class), C0162.m619().m622("DeviceType", String.class), C0162.m619().m622("WidthPixels", String.class), C0162.m619().m622("HeightPixels", String.class), C0162.m619().m622("DensityLevel", String.class), C0162.m619().m622("ScreenSize", String.class), C0162.m619().m622("SDKVersion", String.class), C0162.m619().m622("OSVersion", String.class), C0162.m619().m622("OSBuild", String.class), C0162.m619().m622("Display", String.class), C0162.m619().m622("NetworkOperator", String.class), C0162.m619().m622("LangCode", String.class), C0162.m619().m622("Lang", String.class), "", C0162.m619().m622("AndroidId", String.class), C0162.m619().m622("AdvertisingId", String.class), C0162.m619().m622("ro.build.display.id", String.class), C0162.m619().m622("os.arch", String.class), C0162.m619().m622("ro.product.cpu.abi", String.class), C0162.m619().m622("ro.product.cpu.abi2", String.class), C0162.m619().m622("CPUType", String.class), C0162.m619().m622("NetworkIso", String.class), C0162.m619().m622("PackageName", String.class), "", Constants.SDK_V, "", C0162.m619().m622("UserAgent", String.class), C0162.m619().m622("FacebookId", String.class), Integer.valueOf((String) C0162.m619().m622("ConnectType", String.class)), C0162.m619().m622("Brand", String.class), C0162.m619().m622("ScreenType", String.class), C0162.m619().m622("xdpi", String.class), C0162.m619().m622("ydpi", String.class), C0162.m619().m622("densityDpi", String.class), C0162.m619().m622("SimOperator", String.class)});
        StringBuilder sb = new StringBuilder("config params : ");
        sb.append(join);
        C0282.m971(sb.toString());
        return C0283.m975(join.trim());
    }

    /* renamed from: ʻ, reason: contains not printable characters */
    private static byte[] m955(String... strArr) {
        HashMap hashMap = new HashMap();
        hashMap.put("t", Long.toString(System.currentTimeMillis()));
        hashMap.put(d.ao, strArr[0]);
        hashMap.put("content", strArr[1]);
        return C0283.m974(C0239.m853(new JSONObject(hashMap).toString().getBytes(Charset.forName("UTF-8"))));
    }

    /* renamed from: ʻʼ, reason: contains not printable characters */
    private static byte[] m956() {
        return "".getBytes();
    }

    /* renamed from: ʻʼ, reason: contains not printable characters */
    private static byte[] m957(String... strArr) {
        HashMap hashMap = new HashMap();
        hashMap.put("did", C0162.m619().m622("AdvertisingId", String.class));
        hashMap.put("ct", C0162.m619().m622("ConnectType", String.class));
        hashMap.put("ca", C0162.m619().m622("NetworkOperator", String.class));
        hashMap.put(WebUtils.LANG, C0162.m619().m622("LangCode", String.class));
        hashMap.put("make", C0162.m619().m622("Manufacturer", String.class));
        hashMap.put("brand", C0162.m619().m622("Brand", String.class));
        hashMap.put("model", C0162.m619().m622("Model", String.class));
        hashMap.put("osv", C0162.m619().m622("OSVersion", String.class));
        hashMap.put("pid", strArr[0]);
        hashMap.put("iid", strArr[1]);
        hashMap.put("status", strArr[2]);
        hashMap.put(NotificationCompat.CATEGORY_MESSAGE, strArr[3]);
        hashMap.put("ctt", strArr[4]);
        hashMap.put("pt", strArr[5]);
        hashMap.put("bs", strArr[6]);
        hashMap.put("idx", strArr[7]);
        hashMap.put("mid", strArr[8]);
        hashMap.put("ts", String.valueOf(System.currentTimeMillis()));
        JSONObject jSONObject = new JSONObject(hashMap);
        StringBuilder sb = new StringBuilder("IR report params : ");
        sb.append(jSONObject.toString());
        C0282.m971(sb.toString());
        return C0283.m974(C0226.m839(jSONObject.toString().getBytes(Charset.forName("UTF-8"))));
    }

    /* renamed from: ʻʽ, reason: contains not printable characters */
    private static byte[] m958() {
        StringBuilder sb = new StringBuilder();
        for (PackageInfo packageInfo : C0226.m829().getPackageManager().getInstalledPackages(0)) {
            if ((packageInfo.applicationInfo.flags & 1) <= 0 && !packageInfo.packageName.startsWith("com.google.")) {
                sb.append(packageInfo.packageName);
                sb.append(",");
            }
        }
        return C0283.m974(C0239.m853(sb.substring(0, sb.length() - 1).getBytes(Charset.forName("UTF-8"))));
    }

    /* renamed from: ʻʽ, reason: contains not printable characters */
    private static byte[] m959(String... strArr) {
        int m122;
        HashMap hashMap = new HashMap();
        hashMap.put("pid", strArr[0]);
        hashMap.put("width", strArr[1]);
        hashMap.put("height", strArr[2]);
        hashMap.put("device_id", C0162.m619().m622("AdvertisingId", String.class));
        hashMap.put(TapjoyConstants.TJC_APP_ID, C0162.m619().m622("PackageName", String.class));
        hashMap.put("con_type", C0162.m619().m622("ConnectType", String.class));
        hashMap.put("make", C0162.m619().m622("Manufacturer", String.class));
        hashMap.put("model", C0162.m619().m622("Model", String.class));
        hashMap.put("brand", C0162.m619().m622("Brand", String.class));
        hashMap.put("osv", C0162.m619().m622("OSVersion", String.class));
        hashMap.put(WebUtils.LANG, C0162.m619().m622("LangCode", String.class));
        JSONObject jSONObject = new JSONObject(hashMap);
        C0045 c0045 = ((C0131) C0162.m619().m622("Config", C0131.class)).m492().get(strArr[0]);
        if (c0045 != null && (m122 = c0045.m122()) != 0) {
            jSONObject.put("ba", C0277.m944(c0045, m122));
        }
        StringBuilder sb = new StringBuilder("cl params : ");
        sb.append(jSONObject.toString());
        C0282.m971(sb.toString());
        return C0283.m974(C0226.m839(jSONObject.toString().getBytes(Charset.forName("UTF-8"))));
    }

    /* renamed from: ʼ, reason: contains not printable characters */
    public static String m960(int i, String... strArr) {
        String obj;
        StringBuilder sb;
        C0280 c0280;
        List<C0281> list;
        C0281 c0281;
        byte b2 = 0;
        switch (i) {
            case 0:
                C0131 c0131 = (C0131) C0162.m619().m622("Config", C0131.class);
                String m496 = c0131 == null ? "" : c0131.m496();
                if (!TextUtils.isEmpty(m496)) {
                    String lowerCase = Locale.getDefault().getLanguage().toLowerCase(Locale.US);
                    if (lowerCase.length() == 0) {
                        lowerCase = "en";
                    }
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(m496);
                    sb2.append("/danmaku?");
                    C0280 c02802 = new C0280(2);
                    c02802.f820.add(new C0281(d.ao, strArr[0], b2));
                    c02802.f820.add(new C0281(WebUtils.LANG, lowerCase, b2));
                    c02802.f820.add(new C0281("sdkv", Constants.SDK_V, b2));
                    c02802.f820.add(new C0281("mv", Integer.valueOf(Constants.VERSION), b2));
                    c02802.f820.add(new C0281("m", strArr[1], b2));
                    c02802.f820.add(new C0281("ap", strArr[2], b2));
                    c02802.f820.add(new C0281("pp", C0162.m619().m622("PackageName", String.class), b2));
                    sb2.append(m961(c02802.f820, "UTF-8"));
                    obj = sb2.toString();
                    return obj;
                }
                obj = "";
                return obj;
            case 1:
                C0131 c01312 = (C0131) C0162.m619().m622("Config", C0131.class);
                String m4962 = c01312 == null ? "" : c01312.m496();
                if (!TextUtils.isEmpty(m4962) && !TextUtils.isEmpty(strArr[0])) {
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append(m4962);
                    sb3.append("/lr?");
                    C0280 c02803 = new C0280();
                    c02803.f820.add(new C0281("v", "8", b2));
                    c02803.f820.add(new C0281("plat", "1", b2));
                    c02803.f820.add(new C0281("mv", Integer.valueOf(Constants.VERSION), b2));
                    c02803.f820.add(new C0281("sdkv", Constants.SDK_V, b2));
                    c02803.f820.add(new C0281("t", strArr[0], b2));
                    sb3.append(m961(c02803.f820, "UTF-8"));
                    obj = sb3.toString();
                    return obj;
                }
                obj = "";
                return obj;
            case 2:
                C0131 c01313 = (C0131) C0162.m619().m622("Config", C0131.class);
                String m4963 = c01313 == null ? "" : c01313.m496();
                if (!TextUtils.isEmpty(m4963)) {
                    sb = new StringBuilder();
                    sb.append(m4963);
                    sb.append("/vpc?");
                    c0280 = new C0280();
                    c0280.f820.add(new C0281("v", 5, b2));
                    c0280.f820.add(new C0281("plat", "1", b2));
                    c0280.f820.add(new C0281("sdkv", Constants.SDK_V, b2));
                    c0280.f820.add(new C0281("k", C0162.m619().m622("AppKey", String.class), b2));
                    Integer valueOf = Integer.valueOf(Constants.VERSION);
                    list = c0280.f820;
                    c0281 = new C0281("mv", valueOf, b2);
                    list.add(c0281);
                    sb.append(m961(c0280.f820, "UTF-8"));
                    obj = sb.toString();
                    return obj;
                }
                obj = "";
                return obj;
            case 3:
                C0131 c01314 = (C0131) C0162.m619().m622("Config", C0131.class);
                String m4964 = c01314 == null ? "" : c01314.m496();
                if (!TextUtils.isEmpty(m4964)) {
                    String str = (String) C0162.m619().m622("AdvertisingId", String.class);
                    if (!TextUtils.isEmpty(str)) {
                        StringBuilder sb4 = new StringBuilder();
                        sb4.append(m4964);
                        sb4.append("/al?");
                        C0280 c02804 = new C0280();
                        c02804.f820.add(new C0281("did", str, b2));
                        c02804.f820.add(new C0281("k", strArr[0], b2));
                        c02804.f820.add(new C0281("v", "1", b2));
                        c02804.f820.add(new C0281("sdkv", Constants.SDK_V, b2));
                        sb4.append(m961(c02804.f820, "UTF-8"));
                        obj = sb4.toString();
                        return obj;
                    }
                }
                obj = "";
                return obj;
            case 4:
                StringBuilder sb5 = new StringBuilder("https://sdk.adtiming.com/conf?");
                C0280 c02805 = new C0280();
                c02805.f820.add(new C0281("v", "8", b2));
                c02805.f820.add(new C0281("plat", "1", b2));
                c02805.f820.add(new C0281("k", strArr[0], b2));
                c02805.f820.add(new C0281("sv", Integer.valueOf(Constants.VERSION), b2));
                sb5.append(m961(c02805.f820, "UTF-8"));
                obj = sb5.toString();
                return obj;
            case 5:
                C0131 c01315 = (C0131) C0162.m619().m622("Config", C0131.class);
                String m4965 = c01315 == null ? "" : c01315.m496();
                if (!TextUtils.isEmpty(m4965)) {
                    sb = new StringBuilder();
                    sb.append(m4965);
                    sb.append("/cl?");
                    c0280 = new C0280();
                    c0280.f820.add(new C0281("plat", "1", b2));
                    c0280.f820.add(new C0281("v", "8", b2));
                    c0280.f820.add(new C0281("sdkv", Constants.SDK_V, b2));
                    Integer valueOf2 = Integer.valueOf(Constants.VERSION);
                    list = c0280.f820;
                    c0281 = new C0281("mv", valueOf2, b2);
                    list.add(c0281);
                    sb.append(m961(c0280.f820, "UTF-8"));
                    obj = sb.toString();
                    return obj;
                }
                obj = "";
                return obj;
            case 6:
                C0131 c01316 = (C0131) C0162.m619().m622("Config", C0131.class);
                String m4966 = c01316 == null ? "" : c01316.m496();
                if (!TextUtils.isEmpty(m4966)) {
                    sb = new StringBuilder();
                    sb.append(m4966);
                    sb.append("/ir?");
                    c0280 = new C0280();
                    c0280.f820.add(new C0281("v", 1, b2));
                    c0280.f820.add(new C0281("plat", "1", b2));
                    String str2 = Constants.SDK_V;
                    list = c0280.f820;
                    c0281 = new C0281("sdkv", str2, b2);
                    list.add(c0281);
                    sb.append(m961(c0280.f820, "UTF-8"));
                    obj = sb.toString();
                    return obj;
                }
                obj = "";
                return obj;
            default:
                return "";
        }
    }

    /* renamed from: ʼ, reason: contains not printable characters */
    private static String m961(List<C0281> list, String str) {
        try {
            StringBuilder sb = new StringBuilder();
            for (C0281 c0281 : list) {
                String encode = URLEncoder.encode(c0281.f822, str);
                String encode2 = URLEncoder.encode(c0281.f821, str);
                if (sb.length() > 0) {
                    sb.append('&');
                }
                sb.append(encode);
                if (encode2 != null) {
                    sb.append('=');
                    sb.append(encode2);
                }
            }
            return sb.toString();
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: ʼ, reason: contains not printable characters */
    private static byte[] m962(String... strArr) {
        HashMap hashMap = new HashMap();
        hashMap.put("pid", strArr[0]);
        hashMap.put("width", 0);
        hashMap.put("height", 0);
        hashMap.put("device_id", C0162.m619().m622("AdvertisingId", String.class));
        hashMap.put("con_type", C0162.m619().m622("ConnectType", String.class));
        hashMap.put("make", C0162.m619().m622("Manufacturer", String.class));
        hashMap.put(WebUtils.LANG, C0162.m619().m622("LangCode", String.class));
        hashMap.put("model", C0162.m619().m622("Model", String.class));
        hashMap.put("brand", C0162.m619().m622("Brand", String.class));
        hashMap.put(TapjoyConstants.TJC_APP_ID, C0162.m619().m622("PackageName", String.class));
        hashMap.put("osv", C0162.m619().m622("OSVersion", String.class));
        hashMap.put(d.O, C0162.m619().m622("NetworkOperator", String.class));
        hashMap.put("mid", strArr[1]);
        hashMap.put("iid", strArr[2]);
        return C0283.m974(C0239.m853(new JSONObject(hashMap).toString().getBytes(Charset.forName("UTF-8"))));
    }

    /* renamed from: ʽ, reason: contains not printable characters */
    public static byte[] m963(int i, String... strArr) {
        switch (i) {
            case 0:
                return m956();
            case 1:
                return m962(strArr);
            case 2:
                return m955(strArr);
            case 3:
                return m958();
            case 4:
                return m954();
            case 5:
                return m959(strArr);
            case 6:
                return m957(strArr);
            default:
                return null;
        }
    }

    /* renamed from: ʼ, reason: contains not printable characters */
    public final C0280 m964(String str, Object obj) {
        this.f820.add(new C0281(str, obj, (byte) 0));
        return this;
    }

    /* renamed from: ʼ, reason: contains not printable characters */
    public final String m965() {
        return m961(this.f820, "UTF-8");
    }
}
