package com.umeng.commonsdk.statistics;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import com.tapjoy.TapjoyConstants;
import com.umeng.commonsdk.framework.UMEnvelopeBuild;
import com.umeng.commonsdk.proguard.r;
import com.umeng.commonsdk.statistics.common.DataHelper;
import com.umeng.commonsdk.statistics.common.DeviceConfig;
import com.umeng.commonsdk.statistics.common.d;
import com.umeng.commonsdk.statistics.idtracking.Envelope;
import com.umeng.commonsdk.statistics.idtracking.ImprintHandler;
import com.umeng.commonsdk.statistics.internal.PreferenceWrapper;
import com.umeng.commonsdk.statistics.internal.StatTracer;
import com.umeng.commonsdk.statistics.noise.ImLatent;
import com.umeng.commonsdk.utils.UMUtils;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: EnvelopeManager.java */
/* loaded from: classes2.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    public static String f9127a = null;

    /* renamed from: b, reason: collision with root package name */
    public static String f9128b = "";

    /* renamed from: c, reason: collision with root package name */
    private static final String f9129c = "EnvelopeManager";

    /* renamed from: d, reason: collision with root package name */
    private static StatTracer f9130d;
    private static ImLatent e;
    private static String f;
    private static boolean h;
    private int g = 0;

    public static long a(Context context) {
        long j = DataHelper.ENVELOPE_ENTITY_RAW_LENGTH_MAX - DataHelper.ENVELOPE_EXTRA_LENGTH;
        JSONObject b2 = b(context);
        if (b2 != null && b2.toString() != null && b2.toString().getBytes() != null) {
            long length = b2.toString().getBytes().length;
            if (d.f9145a) {
                Log.i(f9129c, "headerLen size is " + length);
            }
            j -= length;
        }
        if (d.f9145a) {
            Log.i(f9129c, "free size is " + j);
        }
        return j;
    }

    private JSONObject a(int i, JSONObject jSONObject) {
        if (jSONObject != null) {
            try {
                jSONObject.put(com.umeng.analytics.pro.b.ao, i);
            } catch (Exception unused) {
            }
            return jSONObject;
        }
        JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject2.put(com.umeng.analytics.pro.b.ao, i);
        } catch (Exception unused2) {
        }
        return jSONObject2;
    }

    public JSONObject a(Context context, JSONObject jSONObject, JSONObject jSONObject2) {
        JSONObject jSONObject3;
        String str;
        String str2;
        Envelope envelope;
        String str3;
        if (d.f9145a && jSONObject != null && jSONObject2 != null) {
            Log.i(f9129c, "headerJSONObject size is " + jSONObject.toString().getBytes().length);
            Log.i(f9129c, "bodyJSONObject size is " + jSONObject2.toString().getBytes().length);
        }
        JSONObject jSONObject4 = null;
        if (context == null || jSONObject2 == null) {
            return a(110, (JSONObject) null);
        }
        try {
            JSONObject b2 = b(context);
            if (b2 != null && jSONObject != null) {
                b2 = a(b2, jSONObject);
            }
            if (b2 != null && jSONObject2 != null) {
                Iterator<String> keys = jSONObject2.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    if (next != null && (next instanceof String) && (str3 = next) != null && jSONObject2.opt(str3) != null) {
                        try {
                            b2.put(str3, jSONObject2.opt(str3));
                        } catch (Exception unused) {
                        }
                    }
                }
            }
            if (b2 != null) {
                StringBuilder sb = new StringBuilder();
                if (b2.length() > 0) {
                    if (b2.has("push")) {
                        String optString = b2.optJSONObject("header").optString(com.umeng.commonsdk.proguard.d.as);
                        if (!TextUtils.isEmpty(com.umeng.commonsdk.proguard.d.ao) && !TextUtils.isEmpty(optString)) {
                            sb.append(com.umeng.commonsdk.proguard.d.ao);
                            sb.append("==");
                            sb.append(optString);
                            sb.append("&=");
                        }
                    }
                    if (b2.has("share")) {
                        String optString2 = b2.optJSONObject("header").optString(com.umeng.commonsdk.proguard.d.at);
                        if (!TextUtils.isEmpty(com.umeng.commonsdk.proguard.d.ap) && !TextUtils.isEmpty(optString2)) {
                            sb.append(com.umeng.commonsdk.proguard.d.ap);
                            sb.append("==");
                            sb.append(optString2);
                            sb.append("&=");
                        }
                    }
                    if (b2.has("analytics")) {
                        String str4 = b2.has("dplus") ? "ad" : "a";
                        String optString3 = b2.optJSONObject("header").optString("sdk_version");
                        if (!TextUtils.isEmpty(str4) && !TextUtils.isEmpty(optString3)) {
                            sb.append(str4);
                            sb.append("==");
                            sb.append(optString3);
                            sb.append("&=");
                        }
                    }
                    if (b2.has("dplus")) {
                        String optString4 = b2.optJSONObject("header").optString("sdk_version");
                        if (b2.has("analytics")) {
                            if (!sb.toString().contains("ad") && !TextUtils.isEmpty("ad") && !TextUtils.isEmpty(optString4)) {
                                sb.append("ad");
                                sb.append("==");
                                sb.append(optString4);
                                sb.append("&=");
                            }
                        } else if (!TextUtils.isEmpty(com.umeng.commonsdk.proguard.d.am) && !TextUtils.isEmpty(optString4)) {
                            sb.append(com.umeng.commonsdk.proguard.d.am);
                            sb.append("==");
                            sb.append(optString4);
                            sb.append("&=");
                        }
                    }
                    if (b2.has(com.umeng.commonsdk.proguard.d.ak)) {
                        String optString5 = b2.optJSONObject("header").optString(com.umeng.commonsdk.proguard.d.au);
                        if (!TextUtils.isEmpty(com.umeng.commonsdk.proguard.d.aq) && !TextUtils.isEmpty(optString5)) {
                            sb.append(com.umeng.commonsdk.proguard.d.aq);
                            sb.append("==");
                            sb.append(optString5);
                            sb.append("&=");
                        }
                    }
                }
                str2 = sb.toString();
                if (TextUtils.isEmpty(str2)) {
                    return a(101, b2);
                }
                if (str2.endsWith("&=")) {
                    str2 = str2.substring(0, str2.length() - 2);
                }
            } else {
                str2 = null;
            }
            if (b2 != null) {
                try {
                    com.umeng.commonsdk.statistics.idtracking.d a2 = com.umeng.commonsdk.statistics.idtracking.d.a(context);
                    if (a2 != null) {
                        a2.a();
                        String encodeToString = Base64.encodeToString(new r().a(a2.b()), 0);
                        if (!TextUtils.isEmpty(encodeToString)) {
                            JSONObject jSONObject5 = b2.getJSONObject("header");
                            jSONObject5.put(com.umeng.commonsdk.proguard.d.V, encodeToString);
                            b2.put("header", jSONObject5);
                        }
                    }
                } catch (Exception unused2) {
                }
            }
            if (f9130d == null) {
                f9130d = StatTracer.getInstance(context);
                e = ImLatent.getService(context, f9130d);
            }
            if (e != null && e.shouldStartLatency()) {
                long delayTime = e.getDelayTime();
                long elapsedTime = e.getElapsedTime();
                if (b2 != null) {
                    try {
                        JSONObject jSONObject6 = new JSONObject();
                        JSONObject jSONObject7 = new JSONObject();
                        jSONObject7.put("interval", elapsedTime / 1000);
                        jSONObject7.put(com.umeng.commonsdk.proguard.d.ay, delayTime);
                        jSONObject6.put(com.umeng.commonsdk.proguard.d.ax, jSONObject7);
                        JSONObject jSONObject8 = b2.getJSONObject("header");
                        jSONObject8.put(com.umeng.commonsdk.proguard.d.aw, jSONObject6);
                        b2.put("header", jSONObject8);
                    } catch (Exception unused3) {
                    }
                }
            }
            if (b2 != null && DataHelper.largeThanMaxSize(b2.toString().getBytes().length, DataHelper.ENVELOPE_ENTITY_RAW_LENGTH_MAX)) {
                SharedPreferences sharedPreferences = PreferenceWrapper.getDefault(context);
                if (sharedPreferences != null) {
                    sharedPreferences.edit().putInt("serial", sharedPreferences.getInt("serial", 1) + 1).commit();
                }
                return a(113, b2);
            }
            if (b2 != null) {
                envelope = a(context, b2.toString().getBytes());
                if (envelope == null) {
                    return a(111, b2);
                }
            } else {
                envelope = null;
            }
            if (envelope != null && DataHelper.largeThanMaxSize(envelope.toBinary().length, DataHelper.ENVELOPE_LENGTH_MAX)) {
                return a(114, b2);
            }
            int a3 = a(context, envelope, str2, b2 != null ? b2.optJSONObject("header").optString("app_version") : null);
            if (a3 != 0) {
                return a(a3, b2);
            }
            if (d.f9145a) {
                Log.i(f9129c, "constructHeader size is " + b2.toString().getBytes().length);
            }
            return b2;
        } catch (Throwable th) {
            com.umeng.commonsdk.proguard.b.a(context, th);
            if (jSONObject != null) {
                try {
                    jSONObject3 = new JSONObject();
                } catch (Exception e2) {
                    e = e2;
                }
                try {
                    jSONObject3.put("header", jSONObject);
                } catch (JSONException unused4) {
                } catch (Exception e3) {
                    e = e3;
                    jSONObject4 = jSONObject3;
                    com.umeng.commonsdk.proguard.b.a(context, e);
                    return a(110, jSONObject4);
                }
                jSONObject4 = jSONObject3;
            }
            if (jSONObject2 != null) {
                if (jSONObject4 == null) {
                    jSONObject4 = new JSONObject();
                }
                if (jSONObject2 != null) {
                    Iterator<String> keys2 = jSONObject2.keys();
                    while (keys2.hasNext()) {
                        String next2 = keys2.next();
                        if (next2 != null && (next2 instanceof String) && (str = next2) != null && jSONObject2.opt(str) != null) {
                            try {
                                jSONObject4.put(str, jSONObject2.opt(str));
                            } catch (Exception unused5) {
                            }
                        }
                    }
                }
            }
            return a(110, jSONObject4);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:84:0x0231 A[Catch: Exception -> 0x0237, Throwable -> 0x02a7, TRY_LEAVE, TryCatch #4 {Exception -> 0x0237, blocks: (B:43:0x0207, B:79:0x020b, B:81:0x0213, B:82:0x022b, B:84:0x0231), top: B:42:0x0207, outer: #6 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static JSONObject b(Context context) {
        SharedPreferences sharedPreferences;
        JSONObject jSONObject;
        String str;
        Class<?> cls;
        try {
            sharedPreferences = PreferenceWrapper.getDefault(context);
            if (!TextUtils.isEmpty(f)) {
                try {
                    jSONObject = new JSONObject(f);
                } catch (Exception unused) {
                    jSONObject = null;
                }
            } else {
                jSONObject = new JSONObject();
                jSONObject.put(com.umeng.commonsdk.proguard.d.o, DeviceConfig.getAppMD5Signature(context));
                jSONObject.put(com.umeng.commonsdk.proguard.d.p, DeviceConfig.getAppSHA1Key(context));
                jSONObject.put(com.umeng.commonsdk.proguard.d.q, DeviceConfig.getAppHashKey(context));
                jSONObject.put("app_version", DeviceConfig.getAppVersionName(context));
                jSONObject.put("version_code", Integer.parseInt(DeviceConfig.getAppVersionCode(context)));
                jSONObject.put(com.umeng.commonsdk.proguard.d.u, DeviceConfig.getDeviceIdUmengMD5(context));
                jSONObject.put(com.umeng.commonsdk.proguard.d.v, DeviceConfig.getCPU());
                String mccmnc = DeviceConfig.getMCCMNC(context);
                if (!TextUtils.isEmpty(mccmnc)) {
                    jSONObject.put(com.umeng.commonsdk.proguard.d.A, mccmnc);
                    f9128b = mccmnc;
                } else {
                    jSONObject.put(com.umeng.commonsdk.proguard.d.A, "");
                }
                String subOSName = DeviceConfig.getSubOSName(context);
                if (!TextUtils.isEmpty(subOSName)) {
                    jSONObject.put(com.umeng.commonsdk.proguard.d.J, subOSName);
                }
                String subOSVersion = DeviceConfig.getSubOSVersion(context);
                if (!TextUtils.isEmpty(subOSVersion)) {
                    jSONObject.put(com.umeng.commonsdk.proguard.d.K, subOSVersion);
                }
                String deviceType = DeviceConfig.getDeviceType(context);
                if (!TextUtils.isEmpty(deviceType)) {
                    jSONObject.put("device_type", deviceType);
                }
                jSONObject.put(com.umeng.commonsdk.proguard.d.n, DeviceConfig.getPackageName(context));
                jSONObject.put("sdk_type", "Android");
                jSONObject.put("device_id", DeviceConfig.getDeviceId(context));
                jSONObject.put("device_model", Build.MODEL);
                jSONObject.put(com.umeng.commonsdk.proguard.d.D, Build.BOARD);
                jSONObject.put(com.umeng.commonsdk.proguard.d.E, Build.BRAND);
                jSONObject.put(com.umeng.commonsdk.proguard.d.F, Build.TIME);
                jSONObject.put("device_manufacturer", Build.MANUFACTURER);
                jSONObject.put(com.umeng.commonsdk.proguard.d.H, Build.ID);
                jSONObject.put("device_name", Build.DEVICE);
                jSONObject.put(com.umeng.commonsdk.proguard.d.w, "Android");
                jSONObject.put("os_version", Build.VERSION.RELEASE);
                int[] resolutionArray = DeviceConfig.getResolutionArray(context);
                if (resolutionArray != null) {
                    jSONObject.put(com.umeng.commonsdk.proguard.d.y, resolutionArray[1] + "*" + resolutionArray[0]);
                }
                jSONObject.put(com.umeng.commonsdk.proguard.d.z, DeviceConfig.getMac(context));
                jSONObject.put("timezone", DeviceConfig.getTimeZone(context));
                String[] localeInfo = DeviceConfig.getLocaleInfo(context);
                jSONObject.put(com.umeng.commonsdk.proguard.d.N, localeInfo[0]);
                jSONObject.put(com.umeng.commonsdk.proguard.d.M, localeInfo[1]);
                jSONObject.put(com.umeng.commonsdk.proguard.d.O, DeviceConfig.getNetworkOperatorName(context));
                jSONObject.put(com.umeng.commonsdk.proguard.d.r, DeviceConfig.getAppName(context));
                String[] networkAccessMode = DeviceConfig.getNetworkAccessMode(context);
                if ("Wi-Fi".equals(networkAccessMode[0])) {
                    jSONObject.put(com.umeng.commonsdk.proguard.d.P, TapjoyConstants.TJC_CONNECTION_TYPE_WIFI);
                } else if ("2G/3G".equals(networkAccessMode[0])) {
                    jSONObject.put(com.umeng.commonsdk.proguard.d.P, "2G/3G");
                } else {
                    jSONObject.put(com.umeng.commonsdk.proguard.d.P, "unknow");
                }
                if (!"".equals(networkAccessMode[1])) {
                    jSONObject.put(com.umeng.commonsdk.proguard.d.Q, networkAccessMode[1]);
                }
                jSONObject.put(com.umeng.commonsdk.proguard.d.f9052b, SdkVersion.SDK_VERSION);
                jSONObject.put(com.umeng.commonsdk.proguard.d.f9053c, SdkVersion.SDK_TYPE);
                if (!TextUtils.isEmpty(f9127a)) {
                    jSONObject.put(com.umeng.commonsdk.proguard.d.f9054d, f9127a);
                }
                f = jSONObject.toString();
            }
        } catch (Throwable th) {
            com.umeng.commonsdk.proguard.b.a(context, th);
        }
        if (jSONObject == null) {
            return null;
        }
        try {
            jSONObject.put(com.umeng.commonsdk.proguard.d.R, sharedPreferences.getInt("successful_request", 0));
            jSONObject.put(com.umeng.commonsdk.proguard.d.S, sharedPreferences.getInt(com.umeng.commonsdk.proguard.d.S, 0));
            jSONObject.put(com.umeng.commonsdk.proguard.d.T, sharedPreferences.getInt("last_request_spent_ms", 0));
        } catch (Exception unused2) {
        }
        jSONObject.put("channel", UMUtils.getChannel(context));
        jSONObject.put("appkey", UMUtils.getAppkey(context));
        try {
            String deviceToken = UMUtils.getDeviceToken(context);
            if (!TextUtils.isEmpty(deviceToken)) {
                jSONObject.put(com.umeng.commonsdk.proguard.d.f9051a, deviceToken);
            }
        } catch (Exception e2) {
            com.umeng.commonsdk.proguard.b.a(context, e2);
        }
        try {
            if (SdkVersion.SDK_TYPE != 1) {
                try {
                    cls = Class.forName("com.umeng.commonsdk.internal.utils.SDStorageAgent");
                } catch (Throwable unused3) {
                }
                if (cls != null) {
                    str = (String) cls.getMethod("getUmtt", Context.class).invoke(cls, context);
                    if (!TextUtils.isEmpty(str)) {
                        jSONObject.put(com.umeng.commonsdk.proguard.d.e, str);
                    }
                }
                str = null;
                if (!TextUtils.isEmpty(str)) {
                }
            }
        } catch (Exception e3) {
            com.umeng.commonsdk.proguard.b.a(context, e3);
        }
        try {
            String imprintProperty = UMEnvelopeBuild.imprintProperty(context, com.umeng.commonsdk.proguard.d.f, null);
            if (!TextUtils.isEmpty(imprintProperty)) {
                jSONObject.put(com.umeng.commonsdk.proguard.d.f, imprintProperty);
            }
        } catch (Exception e4) {
            com.umeng.commonsdk.proguard.b.a(context, e4);
        }
        try {
            if (SdkVersion.SDK_TYPE != 1 && com.umeng.commonsdk.proguard.a.b(context) != null) {
                jSONObject.put(com.umeng.commonsdk.proguard.d.g, com.umeng.commonsdk.proguard.a.b(context));
            }
        } catch (Exception unused4) {
        }
        try {
            jSONObject.put("wrapper_type", a.f9123a);
            jSONObject.put("wrapper_version", a.f9124b);
        } catch (Exception unused5) {
        }
        try {
            com.umeng.commonsdk.statistics.proto.d a2 = ImprintHandler.getImprintService(context).a();
            if (a2 != null) {
                jSONObject.put(com.umeng.commonsdk.proguard.d.U, Base64.encodeToString(new r().a(a2), 0));
            }
        } catch (Exception e5) {
            com.umeng.commonsdk.proguard.b.a(context, e5);
        }
        if (jSONObject != null && jSONObject.length() > 0) {
            return new JSONObject().put("header", jSONObject);
        }
        return null;
    }

    private JSONObject a(JSONObject jSONObject, JSONObject jSONObject2) {
        String str;
        if (jSONObject != null && jSONObject2 != null && jSONObject.opt("header") != null && (jSONObject.opt("header") instanceof JSONObject)) {
            JSONObject jSONObject3 = (JSONObject) jSONObject.opt("header");
            Iterator<String> keys = jSONObject2.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                if (next != null && (next instanceof String) && (str = next) != null && jSONObject2.opt(str) != null) {
                    try {
                        jSONObject3.put(str, jSONObject2.opt(str));
                        if (str.equals(com.umeng.analytics.pro.b.i) && (jSONObject2.opt(str) instanceof Integer)) {
                            this.g = ((Integer) jSONObject2.opt(str)).intValue();
                        }
                    } catch (Exception unused) {
                    }
                }
            }
        }
        return jSONObject;
    }

    private Envelope a(Context context, byte[] bArr) {
        String imprintProperty = UMEnvelopeBuild.imprintProperty(context, "codex", null);
        int i = -1;
        try {
            if (!TextUtils.isEmpty(imprintProperty)) {
                i = Integer.valueOf(imprintProperty).intValue();
            }
        } catch (NumberFormatException e2) {
            com.umeng.commonsdk.proguard.b.a(context, e2);
        }
        if (i == 0) {
            return Envelope.genEnvelope(context, UMUtils.getAppkey(context), bArr);
        }
        if (i == 1) {
            return Envelope.genEncryptEnvelope(context, UMUtils.getAppkey(context), bArr);
        }
        if (h) {
            return Envelope.genEncryptEnvelope(context, UMUtils.getAppkey(context), bArr);
        }
        return Envelope.genEnvelope(context, UMUtils.getAppkey(context), bArr);
    }

    private int a(Context context, Envelope envelope, String str, String str2) {
        if (context == null || envelope == null || TextUtils.isEmpty(str)) {
            return 101;
        }
        if (TextUtils.isEmpty(str2)) {
            str2 = DeviceConfig.getAppVersionName(context);
        }
        return com.umeng.commonsdk.framework.b.a(context, str + "&&" + str2 + "_" + System.currentTimeMillis() + "_envelope.log", envelope.toBinary());
    }

    public static void a(boolean z) {
        h = z;
    }
}
