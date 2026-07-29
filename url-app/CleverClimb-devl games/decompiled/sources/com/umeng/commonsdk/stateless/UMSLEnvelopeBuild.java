package com.umeng.commonsdk.stateless;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import android.util.Base64;
import com.tapjoy.TapjoyConstants;
import com.umeng.commonsdk.framework.UMEnvelopeBuild;
import com.umeng.commonsdk.proguard.r;
import com.umeng.commonsdk.statistics.SdkVersion;
import com.umeng.commonsdk.statistics.common.DeviceConfig;
import com.umeng.commonsdk.utils.UMUtils;
import java.util.Iterator;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class UMSLEnvelopeBuild {
    private static final String TAG = "UMSLEnvelopeBuild";
    private static String cacheSystemheader;
    private static boolean isEncryptEnabled;
    public static Context mContext;
    public static String module;

    /* JADX WARN: Removed duplicated region for block: B:51:0x021e A[Catch: Exception -> 0x0223, Throwable -> 0x0294, all -> 0x02b8, TRY_LEAVE, TryCatch #5 {Throwable -> 0x0294, blocks: (B:11:0x002a, B:91:0x0032, B:41:0x01e2, B:43:0x01f4, B:49:0x0218, B:51:0x021e, B:57:0x0223, B:59:0x022f, B:62:0x0234, B:64:0x0238, B:66:0x023e, B:69:0x0247, B:71:0x0257, B:73:0x025d, B:13:0x003e, B:15:0x0090, B:16:0x009d, B:18:0x00a7, B:19:0x00ac, B:21:0x00b6, B:22:0x00bb, B:24:0x00c5, B:25:0x00ca, B:27:0x0128, B:28:0x0145, B:30:0x0189, B:31:0x01aa, B:33:0x01b4, B:34:0x01bb, B:36:0x01d1, B:37:0x01d8, B:85:0x0191, B:87:0x019b, B:88:0x01a3, B:89:0x0096), top: B:10:0x002a, outer: #2 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public synchronized JSONObject buildSLBaseHeader(Context context) {
        JSONObject jSONObject;
        String str;
        Class<?> cls;
        com.umeng.commonsdk.statistics.common.d.a("walle", "[stateless] begin build hader, thread is " + Thread.currentThread());
        if (context == null) {
            return null;
        }
        Context applicationContext = context.getApplicationContext();
        try {
            if (!TextUtils.isEmpty(cacheSystemheader)) {
                try {
                    jSONObject = new JSONObject(cacheSystemheader);
                } catch (Exception unused) {
                    jSONObject = null;
                }
            } else {
                jSONObject = new JSONObject();
                jSONObject.put(com.umeng.commonsdk.proguard.d.o, DeviceConfig.getAppMD5Signature(applicationContext));
                jSONObject.put(com.umeng.commonsdk.proguard.d.p, DeviceConfig.getAppSHA1Key(applicationContext));
                jSONObject.put(com.umeng.commonsdk.proguard.d.q, DeviceConfig.getAppHashKey(applicationContext));
                jSONObject.put("app_version", DeviceConfig.getAppVersionName(applicationContext));
                jSONObject.put("version_code", Integer.parseInt(DeviceConfig.getAppVersionCode(applicationContext)));
                jSONObject.put(com.umeng.commonsdk.proguard.d.u, DeviceConfig.getDeviceIdUmengMD5(applicationContext));
                jSONObject.put(com.umeng.commonsdk.proguard.d.v, DeviceConfig.getCPU());
                String mccmnc = DeviceConfig.getMCCMNC(applicationContext);
                if (!TextUtils.isEmpty(mccmnc)) {
                    jSONObject.put(com.umeng.commonsdk.proguard.d.A, mccmnc);
                } else {
                    jSONObject.put(com.umeng.commonsdk.proguard.d.A, "");
                }
                String subOSName = DeviceConfig.getSubOSName(applicationContext);
                if (!TextUtils.isEmpty(subOSName)) {
                    jSONObject.put(com.umeng.commonsdk.proguard.d.J, subOSName);
                }
                String subOSVersion = DeviceConfig.getSubOSVersion(applicationContext);
                if (!TextUtils.isEmpty(subOSVersion)) {
                    jSONObject.put(com.umeng.commonsdk.proguard.d.K, subOSVersion);
                }
                String deviceType = DeviceConfig.getDeviceType(applicationContext);
                if (!TextUtils.isEmpty(deviceType)) {
                    jSONObject.put("device_type", deviceType);
                }
                jSONObject.put(com.umeng.commonsdk.proguard.d.n, DeviceConfig.getPackageName(applicationContext));
                jSONObject.put("sdk_type", "Android");
                jSONObject.put("device_id", DeviceConfig.getDeviceId(applicationContext));
                jSONObject.put("device_model", Build.MODEL);
                jSONObject.put(com.umeng.commonsdk.proguard.d.D, Build.BOARD);
                jSONObject.put(com.umeng.commonsdk.proguard.d.E, Build.BRAND);
                jSONObject.put(com.umeng.commonsdk.proguard.d.F, Build.TIME);
                jSONObject.put("device_manufacturer", Build.MANUFACTURER);
                jSONObject.put(com.umeng.commonsdk.proguard.d.H, Build.ID);
                jSONObject.put("device_name", Build.DEVICE);
                jSONObject.put(com.umeng.commonsdk.proguard.d.w, "Android");
                jSONObject.put("os_version", Build.VERSION.RELEASE);
                int[] resolutionArray = DeviceConfig.getResolutionArray(applicationContext);
                if (resolutionArray != null) {
                    jSONObject.put(com.umeng.commonsdk.proguard.d.y, resolutionArray[1] + "*" + resolutionArray[0]);
                }
                jSONObject.put(com.umeng.commonsdk.proguard.d.z, DeviceConfig.getMac(applicationContext));
                jSONObject.put("timezone", DeviceConfig.getTimeZone(applicationContext));
                String[] localeInfo = DeviceConfig.getLocaleInfo(applicationContext);
                jSONObject.put(com.umeng.commonsdk.proguard.d.N, localeInfo[0]);
                jSONObject.put(com.umeng.commonsdk.proguard.d.M, localeInfo[1]);
                jSONObject.put(com.umeng.commonsdk.proguard.d.O, DeviceConfig.getNetworkOperatorName(applicationContext));
                jSONObject.put(com.umeng.commonsdk.proguard.d.r, DeviceConfig.getAppName(applicationContext));
                String[] networkAccessMode = DeviceConfig.getNetworkAccessMode(applicationContext);
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
                if (!TextUtils.isEmpty(module)) {
                    jSONObject.put(com.umeng.commonsdk.proguard.d.f9054d, module);
                }
                cacheSystemheader = jSONObject.toString();
            }
        } catch (Throwable th) {
            com.umeng.commonsdk.proguard.b.a(applicationContext, th);
        }
        if (jSONObject == null) {
            return null;
        }
        jSONObject.put("channel", UMUtils.getChannel(applicationContext));
        jSONObject.put("appkey", UMUtils.getAppkey(applicationContext));
        try {
            if (SdkVersion.SDK_TYPE != 1) {
                try {
                    cls = Class.forName("com.umeng.commonsdk.internal.utils.SDStorageAgent");
                } catch (Throwable unused2) {
                }
                if (cls != null) {
                    str = (String) cls.getMethod("getUmtt", Context.class).invoke(cls, applicationContext);
                    if (!TextUtils.isEmpty(str)) {
                        jSONObject.put(com.umeng.commonsdk.proguard.d.e, str);
                    }
                }
                str = null;
                if (!TextUtils.isEmpty(str)) {
                }
            }
        } catch (Exception unused3) {
        }
        try {
            String imprintProperty = UMEnvelopeBuild.imprintProperty(applicationContext, com.umeng.commonsdk.proguard.d.f, null);
            if (!TextUtils.isEmpty(imprintProperty)) {
                jSONObject.put(com.umeng.commonsdk.proguard.d.f, imprintProperty);
            }
        } catch (Exception unused4) {
        }
        try {
            if (SdkVersion.SDK_TYPE != 1 && com.umeng.commonsdk.proguard.a.b(applicationContext) != null) {
                jSONObject.put(com.umeng.commonsdk.proguard.d.g, com.umeng.commonsdk.proguard.a.b(applicationContext));
            }
        } catch (Exception unused5) {
        }
        try {
            jSONObject.put("wrapper_type", a.f9096a);
            jSONObject.put("wrapper_version", a.f9097b);
        } catch (Exception unused6) {
        }
        if (jSONObject != null && jSONObject.length() > 0) {
            JSONObject jSONObject2 = new JSONObject();
            com.umeng.commonsdk.statistics.common.d.a("walle", "[stateless] build header end , header is " + jSONObject.toString() + ", thread is " + Thread.currentThread());
            return jSONObject2.put("header", jSONObject);
        }
        com.umeng.commonsdk.statistics.common.d.a("walle", "[stateless] build header end , header is null !!! thread is " + Thread.currentThread());
        return null;
    }

    private synchronized JSONObject makeErrorResult(int i, JSONObject jSONObject) {
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

    public synchronized JSONObject buildSLEnvelope(Context context, JSONObject jSONObject, JSONObject jSONObject2, String str) {
        Context context2;
        Throwable th;
        c cVar;
        String str2;
        com.umeng.commonsdk.statistics.common.d.a("walle", "[stateless] build envelope, heade is " + jSONObject.toString());
        com.umeng.commonsdk.statistics.common.d.a("walle", "[stateless] build envelope, body is " + jSONObject2.toString());
        com.umeng.commonsdk.statistics.common.d.a("walle", "[stateless] build envelope, thread is " + Thread.currentThread());
        if (context == null || jSONObject == null || jSONObject2 == null || str == null) {
            com.umeng.commonsdk.statistics.common.d.a("walle", "[stateless] build envelope, context is null or header is null or body is null");
            return makeErrorResult(110, null);
        }
        try {
            context2 = context.getApplicationContext();
            if (jSONObject != null && jSONObject2 != null) {
                try {
                    Iterator<String> keys = jSONObject2.keys();
                    while (keys.hasNext()) {
                        String next = keys.next();
                        if (next != null && (next instanceof String) && (str2 = next) != null && jSONObject2.opt(str2) != null) {
                            try {
                                jSONObject.put(str2, jSONObject2.opt(str2));
                            } catch (Exception unused) {
                            }
                        }
                    }
                } catch (Throwable th2) {
                    th = th2;
                    com.umeng.commonsdk.proguard.b.a(context2, th);
                    com.umeng.commonsdk.statistics.common.d.a("walle", "build envelope end, thread is " + Thread.currentThread());
                    return makeErrorResult(110, null);
                }
            }
            if (jSONObject != null) {
                try {
                    com.umeng.commonsdk.statistics.idtracking.d a2 = com.umeng.commonsdk.statistics.idtracking.d.a(context2);
                    if (a2 != null) {
                        a2.a();
                        String encodeToString = Base64.encodeToString(new r().a(a2.b()), 0);
                        if (!TextUtils.isEmpty(encodeToString)) {
                            JSONObject jSONObject3 = jSONObject.getJSONObject("header");
                            jSONObject3.put(com.umeng.commonsdk.proguard.d.V, encodeToString);
                            jSONObject.put("header", jSONObject3);
                        }
                    }
                } catch (Exception unused2) {
                }
            }
            if (jSONObject != null && f.a(jSONObject.toString().getBytes().length, a.f9098c)) {
                com.umeng.commonsdk.statistics.common.d.a("walle", "[stateless] build envelope, json overstep!!!! size is " + jSONObject.toString().getBytes().length);
                return makeErrorResult(113, jSONObject);
            }
            com.umeng.commonsdk.statistics.common.d.a("walle", "[stateless] build envelope, json size is " + jSONObject.toString().getBytes().length);
            if (jSONObject != null) {
                cVar = constructEnvelope(context2, jSONObject.toString().getBytes());
                if (cVar == null) {
                    com.umeng.commonsdk.statistics.common.d.a("walle", "[stateless] build envelope, envelope is null !!!!");
                    return makeErrorResult(111, jSONObject);
                }
            } else {
                cVar = null;
            }
            if (cVar != null && f.a(cVar.b().length, a.f9099d)) {
                com.umeng.commonsdk.statistics.common.d.a("walle", "[stateless] build envelope, envelope overstep!!!! size is " + cVar.b().length);
                return makeErrorResult(114, jSONObject);
            }
            if (!f.a(context2, Base64.encodeToString(str.getBytes(), 0), Base64.encodeToString((str + "_" + System.currentTimeMillis()).getBytes(), 0), cVar.b())) {
                com.umeng.commonsdk.statistics.common.d.a("walle", "[stateless] build envelope, save fail ----->>>>>");
                return makeErrorResult(101, jSONObject);
            }
            com.umeng.commonsdk.statistics.common.d.a("walle", "[stateless] build envelope, save ok ----->>>>>");
            com.umeng.commonsdk.statistics.common.d.a("walle", "[stateless] envelope file size is " + jSONObject.toString().getBytes().length);
            new d(context2);
            d.b(d.f9112a);
            com.umeng.commonsdk.statistics.common.d.a("walle", "[stateless] build envelope end, thread is " + Thread.currentThread());
            return jSONObject;
        } catch (Throwable th3) {
            context2 = context;
            th = th3;
        }
    }

    private synchronized c constructEnvelope(Context context, byte[] bArr) {
        c a2;
        int i = -1;
        String imprintProperty = UMEnvelopeBuild.imprintProperty(context, "slcodex", null);
        com.umeng.commonsdk.statistics.common.d.a("walle", "[stateless] build envelope, codexStr is " + imprintProperty);
        try {
            if (!TextUtils.isEmpty(imprintProperty)) {
                i = Integer.valueOf(imprintProperty).intValue();
            }
        } catch (NumberFormatException e) {
            com.umeng.commonsdk.proguard.b.a(context, e);
        }
        if (i == 0) {
            com.umeng.commonsdk.statistics.common.d.a("walle", "[stateless] build envelope, codexValue is 0");
            a2 = c.a(context, UMUtils.getAppkey(context), bArr);
        } else if (i == 1) {
            com.umeng.commonsdk.statistics.common.d.a("walle", "[stateless] build envelope, codexValue is 1");
            a2 = c.b(context, UMUtils.getAppkey(context), bArr);
        } else if (isEncryptEnabled) {
            com.umeng.commonsdk.statistics.common.d.a("walle", "[stateless] build envelope, isEncryptEnabled is true");
            a2 = c.b(context, UMUtils.getAppkey(context), bArr);
        } else {
            com.umeng.commonsdk.statistics.common.d.a("walle", "[stateless] build envelope, isEncryptEnabled is false");
            a2 = c.a(context, UMUtils.getAppkey(context), bArr);
        }
        return a2;
    }

    public static void setEncryptEnabled(boolean z) {
        isEncryptEnabled = z;
    }
}
