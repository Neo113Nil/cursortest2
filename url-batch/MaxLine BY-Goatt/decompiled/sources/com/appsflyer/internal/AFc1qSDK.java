package com.appsflyer.internal;

import android.content.Context;
import android.graphics.Color;
import android.graphics.PointF;
import android.os.Build;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.appsflyer.AppsFlyerLib;
import com.appsflyer.AppsFlyerProperties;
import com.facebook.devicerequests.internal.DeviceRequestsHelper;
import com.facebook.internal.ServerProtocol;
import com.google.firebase.encoders.json.BuildConfig;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import org.json.JSONObject;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class AFc1qSDK {
    private static String AFInAppEventType = null;
    private static int AFLogger$LogLevel = 1;
    private static int afDebugLog;
    private static char[] afInfoLog;
    private static long afRDLog;
    public static String valueOf;
    private static String values;
    private final AFb1cSDK AFInAppEventParameterName;
    private final AFc1pSDK AFKeystoreWrapper;
    private final AFc1cSDK AFLogger;
    private final AppsFlyerProperties afErrorLog;

    static {
        AFInAppEventType();
        AFInAppEventType = "https://%smonitorsdk.%s/remote-debug?app_id=";
        valueOf = "https://%sgcdsdk.%s/install_data/v5.0/";
        values = "https://%sonelink.%s/shortlink-sdk/v2";
        afDebugLog = (AFLogger$LogLevel + 29) % 128;
    }

    public AFc1qSDK(AFc1pSDK aFc1pSDK, AFb1cSDK aFb1cSDK, AppsFlyerProperties appsFlyerProperties, AFc1cSDK aFc1cSDK) {
        this.AFKeystoreWrapper = aFc1pSDK;
        this.AFInAppEventParameterName = aFb1cSDK;
        this.afErrorLog = appsFlyerProperties;
        this.AFLogger = aFc1cSDK;
    }

    public final AFc1nSDK<String> AFInAppEventParameterName(Map<String, Object> map, String str) {
        StringBuilder sb = new StringBuilder();
        sb.append("https://" + AppsFlyerLib.getInstance().getHostPrefix() + "viap." + AFa1dSDK.valueOf().getHostName() + "/api/v1/android/validate_purchase?app_id=");
        sb.append(this.AFInAppEventParameterName.values.AFInAppEventParameterName.getPackageName());
        try {
            AFc1nSDK<String> values2 = values(new AFb1ySDK(sb.toString(), (byte[]) ((Class) AFa1wSDK.AFKeystoreWrapper(73 - Color.alpha(0), 37 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), (char) (KeyEvent.getMaxKeyCode() >> 16))).getMethod("AFInAppEventParameterName", Map.class, String.class).invoke(null, map, str), "POST", Collections.EMPTY_MAP, true), new AFc1jSDK());
            AFLogger$LogLevel = (afDebugLog + 75) % 128;
            return values2;
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }

    public final AFc1nSDK<AFf1vSDK> AFInAppEventType(boolean z, boolean z2, String str, int i) {
        String str2;
        AFLogger$LogLevel = (afDebugLog + 95) % 128;
        AFc1cSDK aFc1cSDK = this.AFLogger;
        str.getClass();
        String str3 = z ? AFc1cSDK.valueOf : AFc1cSDK.AFKeystoreWrapper;
        String str4 = BuildConfig.FLAVOR;
        if (z2) {
            AFLogger$LogLevel = (afDebugLog + 37) % 128;
            str2 = "stg";
        } else {
            str2 = BuildConfig.FLAVOR;
        }
        if (AFc1cSDK.AFInAppEventParameterName()) {
            int i2 = AFLogger$LogLevel + 1;
            afDebugLog = i2 % 128;
            if (i2 % 2 != 0) {
                throw null;
            }
            str4 = (String) aFc1cSDK.values.getValue();
        }
        AFb1ySDK aFb1ySDK = new AFb1ySDK(String.format(str3, Arrays.copyOf(new Object[]{str4, str2, aFc1cSDK.AFInAppEventType(), str}, 4)), "GET");
        aFb1ySDK.afDebugLog = 1500;
        return values(aFb1ySDK, new AFc1kSDK());
    }

    public final AFc1nSDK<Map<String, String>> AFKeystoreWrapper(String str, String str2, UUID uuid, String str3) {
        String obj = uuid.toString();
        StringBuilder sb = new StringBuilder();
        sb.append(String.format(values, AppsFlyerLib.getInstance().getHostPrefix(), AFa1dSDK.valueOf().getHostName()));
        sb.append("/");
        sb.append(str);
        sb.append("?id=");
        sb.append(str2);
        String obj2 = sb.toString();
        Map<String, Object> AFKeystoreWrapper = AFKeystoreWrapper();
        String valueOf2 = String.valueOf(AFKeystoreWrapper.get("build_number"));
        HashMap hashMap = new HashMap();
        hashMap.put("Af-UUID", uuid.toString());
        hashMap.put("Af-Meta-Sdk-Ver", valueOf2);
        hashMap.put("Af-Meta-Counter", String.valueOf(AFKeystoreWrapper.get("counter")));
        hashMap.put("Af-Meta-Model", String.valueOf(AFKeystoreWrapper.get(DeviceRequestsHelper.DEVICE_INFO_MODEL)));
        hashMap.put("Af-Meta-Platform", String.valueOf(AFKeystoreWrapper.get("platformextension")));
        hashMap.put("Af-Meta-System-Version", String.valueOf(AFKeystoreWrapper.get(ServerProtocol.DIALOG_PARAM_SDK_VERSION)));
        Object[] objArr = new Object[1];
        valueOf((char) (TextUtils.indexOf((CharSequence) BuildConfig.FLAVOR, '0') + 1), (Process.myTid() >> 22) + 12, ViewConfiguration.getJumpTapTimeout() >> 16, objArr);
        hashMap.put(((String) objArr[0]).intern(), values(str3, obj, "GET", obj, str, str2, valueOf2));
        AFc1nSDK<Map<String, String>> values2 = values(new AFb1ySDK(obj2, null, "GET", hashMap, false), new AFc1eSDK());
        afDebugLog = (AFLogger$LogLevel + 5) % 128;
        return values2;
    }

    public final AFc1nSDK<String> valueOf(String str, Map<String, String> map, String str2, UUID uuid, String str3) {
        String obj = uuid.toString();
        HashMap hashMap = new HashMap();
        hashMap.put("ttl", "-1");
        hashMap.put("uuid", obj);
        hashMap.put("data", map);
        hashMap.put("meta", AFKeystoreWrapper());
        if (str2 != null) {
            int i = AFLogger$LogLevel + 1;
            afDebugLog = i % 128;
            if (i % 2 != 0) {
                hashMap.put("brand_domain", str2);
                throw null;
            }
            hashMap.put("brand_domain", str2);
            afDebugLog = (AFLogger$LogLevel + 111) % 128;
        }
        String jSONObject = AFa1rSDK.values(hashMap).toString();
        HashMap hashMap2 = new HashMap();
        Object[] objArr = new Object[1];
        valueOf((char) View.resolveSize(0, 0), (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 11, Color.blue(0), objArr);
        hashMap2.put(((String) objArr[0]).intern(), values(str3, obj, "POST", jSONObject));
        StringBuilder sb = new StringBuilder();
        sb.append(String.format(values, AppsFlyerLib.getInstance().getHostPrefix(), AFa1dSDK.valueOf().getHostName()));
        sb.append("/");
        sb.append(str);
        return AFKeystoreWrapper(new AFb1ySDK(sb.toString(), jSONObject.getBytes(Charset.defaultCharset()), "POST", hashMap2, false), (AFc1fSDK) new AFc1jSDK(), true);
    }

    public final AFc1nSDK<String> values(Map<String, Object> map, String str) {
        StringBuilder sb = new StringBuilder();
        sb.append("https://" + AppsFlyerLib.getInstance().getHostPrefix() + "ars." + AFa1dSDK.valueOf().getHostName() + "/api/v2/android/validate_subscription?app_id=");
        sb.append(this.AFInAppEventParameterName.values.AFInAppEventParameterName.getPackageName());
        try {
            AFc1nSDK<String> values2 = values(new AFb1ySDK(sb.toString(), (byte[]) ((Class) AFa1wSDK.AFKeystoreWrapper((Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 72, 37 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), (char) ((-1) - Process.getGidForName(BuildConfig.FLAVOR)))).getMethod("AFInAppEventParameterName", Map.class, String.class).invoke(null, map, str), "POST", Collections.EMPTY_MAP, true), new AFc1jSDK());
            int i = AFLogger$LogLevel + 111;
            afDebugLog = i % 128;
            if (i % 2 == 0) {
                return values2;
            }
            throw null;
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }

    public static void AFInAppEventType() {
        afInfoLog = new char[]{'A', 38861, 12155, 51026, 24261, 63024, 36460, 9676, 48428, 21878, 60636, 33852, 55659, 20176, 63038, 7782, 34753};
        afRDLog = -3902864565468424277L;
    }

    public final AFc1nSDK<Map<String, Object>> AFInAppEventType(String str, String str2) {
        String packageName = this.AFInAppEventParameterName.values.AFInAppEventParameterName.getPackageName();
        AFb1cSDK aFb1cSDK = this.AFInAppEventParameterName;
        AFc1nSDK<Map<String, Object>> values2 = values(AFc1oSDK.AFKeystoreWrapper(packageName, AFa1aSDK.AFInAppEventParameterName(aFb1cSDK.values, aFb1cSDK.AFInAppEventType), str, str2), new AFc1iSDK());
        afDebugLog = (AFLogger$LogLevel + 117) % 128;
        return values2;
    }

    public final AFc1nSDK<String> AFInAppEventParameterName(Map<String, Object> map) {
        StringBuilder sb = new StringBuilder();
        sb.append(String.format(AFInAppEventType, AppsFlyerLib.getInstance().getHostPrefix(), AFa1dSDK.valueOf().getHostName()));
        sb.append(this.AFInAppEventParameterName.values.AFInAppEventParameterName.getPackageName());
        AFc1nSDK<String> values2 = values(new AFb1ySDK(sb.toString(), new JSONObject(map).toString().getBytes(Charset.defaultCharset()), "POST", Collections.EMPTY_MAP, false, false), new AFc1jSDK());
        int i = AFLogger$LogLevel + 109;
        afDebugLog = i % 128;
        if (i % 2 != 0) {
            int i2 = 18 / 0;
        }
        return values2;
    }

    public final AFc1nSDK<String> values(AFe1eSDK aFe1eSDK) {
        AFc1nSDK<String> values2 = values(new AFb1ySDK(aFe1eSDK.afInfoLog, aFe1eSDK.valueOf(), "POST", Collections.EMPTY_MAP, true), new AFc1jSDK());
        int i = afDebugLog + 63;
        AFLogger$LogLevel = i % 128;
        if (i % 2 != 0) {
            return values2;
        }
        throw null;
    }

    public final AFc1nSDK<String> values(String str) {
        AFb1ySDK aFb1ySDK = new AFb1ySDK(str, null, "GET", Collections.EMPTY_MAP, false);
        aFb1ySDK.afDebugLog = 10000;
        aFb1ySDK.AFKeystoreWrapper = false;
        AFc1nSDK<String> values2 = values(aFb1ySDK, new AFc1jSDK());
        int i = afDebugLog + 119;
        AFLogger$LogLevel = i % 128;
        if (i % 2 != 0) {
            return values2;
        }
        throw null;
    }

    private <T> AFc1nSDK<T> values(AFb1ySDK aFb1ySDK, AFc1fSDK<T> aFc1fSDK) {
        afDebugLog = (AFLogger$LogLevel + 29) % 128;
        AFc1nSDK<T> AFKeystoreWrapper = AFKeystoreWrapper(aFb1ySDK, aFc1fSDK, valueOf());
        int i = AFLogger$LogLevel + 107;
        afDebugLog = i % 128;
        if (i % 2 != 0) {
            int i2 = 22 / 0;
        }
        return AFKeystoreWrapper;
    }

    private static String values(String str, String str2, String... strArr) {
        ArrayList arrayList = new ArrayList(Arrays.asList(strArr));
        arrayList.add(1, "v2");
        String values2 = AFb1zSDK.values((String[]) arrayList.toArray(new String[0]));
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(str2);
        sb.append("v2");
        String AFKeystoreWrapper = AFb1zSDK.AFKeystoreWrapper(values2, sb.toString());
        int i = AFLogger$LogLevel + 123;
        afDebugLog = i % 128;
        if (i % 2 == 0) {
            return AFKeystoreWrapper;
        }
        throw null;
    }

    private boolean valueOf() {
        int i = AFLogger$LogLevel + 21;
        afDebugLog = i % 128;
        int i2 = i % 2;
        AppsFlyerProperties appsFlyerProperties = this.afErrorLog;
        if (i2 == 0 ? appsFlyerProperties.getBoolean(AppsFlyerProperties.HTTP_CACHE, true) : appsFlyerProperties.getBoolean(AppsFlyerProperties.HTTP_CACHE, false)) {
            return false;
        }
        int i3 = afDebugLog + 97;
        AFLogger$LogLevel = i3 % 128;
        if (i3 % 2 != 0) {
            return true;
        }
        throw null;
    }

    private static void valueOf(char c, int i, int i2, Object[] objArr) {
        String str;
        synchronized (AFg1iSDK.valueOf) {
            try {
                char[] cArr = new char[i];
                AFg1iSDK.values = 0;
                while (true) {
                    int i3 = AFg1iSDK.values;
                    if (i3 < i) {
                        cArr[i3] = (char) ((afInfoLog[i2 + i3] ^ (i3 * afRDLog)) ^ c);
                        AFg1iSDK.values = i3 + 1;
                    } else {
                        str = new String(cArr);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        objArr[0] = str;
    }

    public final AFc1nSDK<String> AFKeystoreWrapper(AFa1qSDK aFa1qSDK, String str, AFb1bSDK aFb1bSDK) {
        try {
            AFc1nSDK<String> values2 = values(new AFb1ySDK(aFa1qSDK.afInfoLog, (byte[]) ((Class) AFa1wSDK.AFKeystoreWrapper(74 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), 36 - TextUtils.indexOf((CharSequence) BuildConfig.FLAVOR, '0'), (char) (ViewConfiguration.getScrollDefaultDelay() >> 16))).getMethod("AFKeystoreWrapper", AFa1qSDK.class, String.class, AFb1bSDK.class).invoke(null, aFa1qSDK, str, aFb1bSDK), "POST", Collections.EMPTY_MAP, aFa1qSDK.AFKeystoreWrapper()), new AFc1jSDK());
            int i = afDebugLog + 31;
            AFLogger$LogLevel = i % 128;
            if (i % 2 != 0) {
                return values2;
            }
            throw null;
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }

    private Map<String, Object> AFKeystoreWrapper() {
        HashMap hashMap = new HashMap();
        hashMap.put("build_number", "6.12.1");
        hashMap.put("counter", Integer.valueOf(this.AFInAppEventParameterName.AFInAppEventType.AFInAppEventType("appsFlyerCount", 0)));
        hashMap.put(DeviceRequestsHelper.DEVICE_INFO_MODEL, Build.MODEL);
        Object[] objArr = new Object[1];
        valueOf((char) (55561 - (ViewConfiguration.getScrollBarFadeDuration() >> 16)), (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 5, (ViewConfiguration.getTouchSlop() >> 8) + 12, objArr);
        hashMap.put(((String) objArr[0]).intern(), Build.BRAND);
        hashMap.put(ServerProtocol.DIALOG_PARAM_SDK_VERSION, Integer.toString(Build.VERSION.SDK_INT));
        Context context = this.AFInAppEventParameterName.values.AFInAppEventParameterName;
        hashMap.put("app_version_name", AFa1cSDK.AFInAppEventParameterName(context, context.getPackageName()));
        hashMap.put("app_id", this.AFInAppEventParameterName.values.AFInAppEventParameterName.getPackageName());
        hashMap.put("platformextension", new AFb1xSDK().values());
        AFLogger$LogLevel = (afDebugLog + 103) % 128;
        return hashMap;
    }

    private <T> AFc1nSDK<T> AFKeystoreWrapper(AFb1ySDK aFb1ySDK, AFc1fSDK<T> aFc1fSDK, boolean z) {
        aFb1ySDK.valueOf = z;
        AFc1pSDK aFc1pSDK = this.AFKeystoreWrapper;
        AFc1nSDK<T> aFc1nSDK = new AFc1nSDK<>(aFb1ySDK, aFc1pSDK.valueOf, aFc1pSDK.values, aFc1fSDK);
        int i = afDebugLog + 27;
        AFLogger$LogLevel = i % 128;
        if (i % 2 != 0) {
            return aFc1nSDK;
        }
        throw null;
    }
}
