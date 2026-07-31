package com.appsflyer.internal;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Build;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import coil3.network.internal.UtilsKt;
import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerLib;
import com.appsflyer.AppsFlyerProperties;
import com.google.firebase.messaging.Constants;
import java.lang.reflect.Method;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.text.Regex;

/* loaded from: classes3.dex */
public final class AFe1wSDK {
    private static int $10 = 0;
    private static int $11 = 1;
    private static char[] AFLogger = null;
    private static int e = 0;
    private static char registerClient = 0;
    private static int unregisterClient = 1;
    public static String valueOf;
    private static String values;
    private final AFd1pSDK AFInAppEventParameterName;
    private final AppsFlyerProperties AFInAppEventType;
    private final AFe1ySDK AFKeystoreWrapper;
    private final AFe1gSDK d;

    static void AFKeystoreWrapper() {
        AFLogger = new char[]{8064, 10873, 10869, 10879, 10824, 10857, 10866, 10806, 10877, 10863, 10874, 10842, 10876, 10862, 10878, 8067};
        registerClient = (char) 8069;
    }

    static {
        AFKeystoreWrapper();
        valueOf = "https://%sgcdsdk.%s/install_data/v5.0/";
        values = "https://%sonelink.%s/shortlink-sdk/v2";
        int i = e + 99;
        unregisterClient = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
    }

    public AFe1wSDK(AFe1ySDK aFe1ySDK, AFd1pSDK aFd1pSDK, AppsFlyerProperties appsFlyerProperties, AFe1gSDK aFe1gSDK) {
        this.AFKeystoreWrapper = aFe1ySDK;
        this.AFInAppEventParameterName = aFd1pSDK;
        this.AFInAppEventType = appsFlyerProperties;
        this.d = aFe1gSDK;
    }

    public final AFe1xSDK<String> AFInAppEventParameterName(Map<String, Object> map, String str, String str2) {
        String AFKeystoreWrapper;
        int i = 2 % 2;
        int i2 = unregisterClient + 41;
        e = i2 % 128;
        try {
            if (i2 % 2 != 0) {
                try {
                    Object[] objArr = {map, str};
                    Object obj = AFa1uSDK.afVerboseLog.get(1743306104);
                    if (obj == null) {
                        obj = ((Class) AFa1uSDK.valueOf((char) ((ViewConfiguration.getPressedStateDuration() >> 16) + 8620), Color.rgb(0, 0, 0) + 16777253, 73 - Color.red(0))).getMethod("values", Map.class, String.class);
                        AFa1uSDK.afVerboseLog.put(1743306104, obj);
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
            try {
                Object[] objArr2 = {map, str};
                Object obj2 = AFa1uSDK.afVerboseLog.get(1743306104);
                if (obj2 == null) {
                    obj2 = ((Class) AFa1uSDK.valueOf((char) (ExpandableListView.getPackedPositionGroup(0L) + 8620), 37 - TextUtils.getCapsMode("", 0, 0), 74 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)))).getMethod("values", Map.class, String.class);
                    AFa1uSDK.afVerboseLog.put(1743306104, obj2);
                }
                byte[] bArr = (byte[]) ((Method) obj2).invoke(null, objArr2);
                AFi1fSDK aFi1fSDK = new AFi1fSDK(this.AFInAppEventParameterName);
                String str3 = str2;
                if (str3 == null || str3.length() == 0 || new Regex("4.?(\\d+)?.?(\\d+)").matches(str3) || new Regex("3.?(\\d+)?.?(\\d+)").matches(str3)) {
                    int i3 = e + 123;
                    unregisterClient = i3 % 128;
                    if (i3 % 2 == 0) {
                        aFi1fSDK.AFKeystoreWrapper.AFKeystoreWrapper("https://%sars.%s/api/v2/android/validate_subscription?app_id=");
                        throw null;
                    }
                    AFKeystoreWrapper = aFi1fSDK.AFKeystoreWrapper.AFKeystoreWrapper("https://%sars.%s/api/v2/android/validate_subscription?app_id=");
                } else {
                    AFKeystoreWrapper = aFi1fSDK.AFKeystoreWrapper.AFKeystoreWrapper("https://%sars.%s/api/v2/android/validate_subscription_v2?app_id=");
                }
                AFe1xSDK<String> valueOf2 = valueOf(new AFe1nSDK(aFi1fSDK.AFInAppEventType(new StringBuilder().append(AFKeystoreWrapper).append(aFi1fSDK.valueOf.AFInAppEventParameterName.AFKeystoreWrapper.getPackageName()).toString()), bArr, "POST", Collections.emptyMap(), true), new AFe1lSDK());
                int i4 = unregisterClient + 61;
                e = i4 % 128;
                if (i4 % 2 != 0) {
                    int i5 = 63 / 0;
                }
                return valueOf2;
            } catch (Throwable th2) {
                Throwable cause2 = th2.getCause();
                if (cause2 != null) {
                    throw cause2;
                }
                throw th2;
            }
        } catch (Exception e2) {
            AFLogger.afErrorLogForExcManagerOnly("AFFinalizer: reflection init failed", e2);
            return null;
        }
        AFLogger.afErrorLogForExcManagerOnly("AFFinalizer: reflection init failed", e2);
        return null;
    }

    public final AFe1xSDK<String> AFInAppEventType(Map<String, Object> map, String str, String str2) {
        String AFKeystoreWrapper;
        int i = 2 % 2;
        int i2 = unregisterClient + 11;
        e = i2 % 128;
        int i3 = i2 % 2;
        try {
            Object[] objArr = {map, str};
            Object obj = AFa1uSDK.afVerboseLog.get(1743306104);
            if (obj == null) {
                obj = ((Class) AFa1uSDK.valueOf((char) (8620 - (Process.myPid() >> 22)), TextUtils.lastIndexOf("", '0', 0, 0) + 38, 73 - (ViewConfiguration.getScrollBarFadeDuration() >> 16))).getMethod("values", Map.class, String.class);
                AFa1uSDK.afVerboseLog.put(1743306104, obj);
            }
            byte[] bArr = (byte[]) ((Method) obj).invoke(null, objArr);
            AFi1fSDK aFi1fSDK = new AFi1fSDK(this.AFInAppEventParameterName);
            String str3 = str2;
            if (str3 == null || str3.length() == 0 || new Regex("4.?(\\d+)?.?(\\d+)").matches(str3) || new Regex("3.?(\\d+)?.?(\\d+)").matches(str3)) {
                int i4 = unregisterClient + 107;
                int i5 = i4 % 128;
                e = i5;
                int i6 = i4 % 2;
                int i7 = i5 + 9;
                unregisterClient = i7 % 128;
                int i8 = i7 % 2;
                AFKeystoreWrapper = aFi1fSDK.AFKeystoreWrapper.AFKeystoreWrapper("https://%sviap.%s/api/v1/android/validate_purchase?app_id=");
            } else {
                AFKeystoreWrapper = aFi1fSDK.AFKeystoreWrapper.AFKeystoreWrapper("https://%sviap.%s/api/v1/android/validate_purchase_v2?app_id=");
            }
            return valueOf(new AFe1nSDK(aFi1fSDK.AFInAppEventType(new StringBuilder().append(AFKeystoreWrapper).append(aFi1fSDK.valueOf.AFInAppEventParameterName.AFKeystoreWrapper.getPackageName()).toString()), bArr, "POST", Collections.emptyMap(), true), new AFe1lSDK());
        } catch (Throwable th) {
            try {
                Throwable cause = th.getCause();
                if (cause != null) {
                    throw cause;
                }
                throw th;
            } catch (Exception e2) {
                AFLogger.afErrorLogForExcManagerOnly("AFFinalizer: reflection init failed", e2);
                return null;
            }
        }
    }

    public final AFe1xSDK<AFh1oSDK> AFInAppEventType(boolean z, boolean z2, String str, int i) {
        String str2;
        String str3;
        int i2 = 2 % 2;
        AFe1gSDK aFe1gSDK = this.d;
        Intrinsics.checkNotNullParameter(str, "");
        Object obj = null;
        if (z) {
            int i3 = unregisterClient + 11;
            e = i3 % 128;
            if (i3 % 2 != 0) {
                String str4 = AFe1gSDK.AFInAppEventParameterName;
                throw null;
            }
            str2 = AFe1gSDK.AFInAppEventParameterName;
        } else {
            str2 = AFe1gSDK.valueOf;
        }
        if (z2) {
            int i4 = e + 77;
            unregisterClient = i4 % 128;
            if (i4 % 2 == 0) {
                obj.hashCode();
                throw null;
            }
            str3 = "stg";
        } else {
            str3 = "";
        }
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        String format = String.format(str2, Arrays.copyOf(new Object[]{AFe1gSDK.AFInAppEventType() ? (String) aFe1gSDK.AFInAppEventType.getValue() : "", str3, aFe1gSDK.AFKeystoreWrapper(), str}, 4));
        Intrinsics.checkNotNullExpressionValue(format, "");
        AFe1nSDK aFe1nSDK = new AFe1nSDK(format, UtilsKt.HTTP_METHOD_GET);
        aFe1nSDK.d = 1500;
        return valueOf(aFe1nSDK, new AFe1mSDK());
    }

    public final AFe1xSDK<String> AFInAppEventParameterName(AFa1rSDK aFa1rSDK, String str, AFd1nSDK aFd1nSDK) {
        int i = 2 % 2;
        int i2 = unregisterClient + 113;
        e = i2 % 128;
        int i3 = i2 % 2;
        try {
            Object[] objArr = {aFa1rSDK, str, aFd1nSDK};
            Object obj = AFa1uSDK.afVerboseLog.get(-1089382969);
            if (obj == null) {
                obj = ((Class) AFa1uSDK.valueOf((char) (TextUtils.getOffsetAfter("", 0) + 8620), 36 - ImageFormat.getBitsPerPixel(0), ImageFormat.getBitsPerPixel(0) + 74)).getMethod("AFInAppEventType", AFa1rSDK.class, String.class, AFd1nSDK.class);
                AFa1uSDK.afVerboseLog.put(-1089382969, obj);
            }
            AFe1xSDK<String> valueOf2 = valueOf(new AFe1nSDK(aFa1rSDK.registerClient, (byte[]) ((Method) obj).invoke(null, objArr), "POST", Collections.emptyMap(), aFa1rSDK.AFInAppEventType()), new AFe1lSDK());
            int i4 = unregisterClient + 5;
            e = i4 % 128;
            int i5 = i4 % 2;
            return valueOf2;
        } catch (Throwable th) {
            try {
                Throwable cause = th.getCause();
                if (cause != null) {
                    throw cause;
                }
                throw th;
            } catch (Throwable th2) {
                AFLogger.afErrorLogForExcManagerOnly("AFFinalizer: reflection init failed", th2);
                return null;
            }
        }
    }

    public final AFe1xSDK<Map<String, Object>> AFInAppEventParameterName(String str, String str2) {
        int i = 2 % 2;
        String packageName = this.AFInAppEventParameterName.AFInAppEventParameterName.AFKeystoreWrapper.getPackageName();
        AFd1pSDK aFd1pSDK = this.AFInAppEventParameterName;
        AFe1xSDK<Map<String, Object>> valueOf2 = valueOf(AFe1sSDK.AFInAppEventType(packageName, AFb1iSDK.AFKeystoreWrapper(aFd1pSDK.AFInAppEventParameterName, aFd1pSDK.valueOf), str, str2), new AFe1qSDK());
        int i2 = e + 61;
        unregisterClient = i2 % 128;
        if (i2 % 2 != 0) {
            return valueOf2;
        }
        throw null;
    }

    public final AFe1xSDK<String> AFInAppEventParameterName(AFg1cSDK aFg1cSDK) {
        int i = 2 % 2;
        AFe1xSDK<String> valueOf2 = valueOf(new AFe1nSDK(aFg1cSDK.registerClient, aFg1cSDK.values(), "POST", Collections.emptyMap(), true), new AFe1lSDK());
        int i2 = e + 43;
        unregisterClient = i2 % 128;
        if (i2 % 2 != 0) {
            return valueOf2;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final AFe1xSDK<String> AFInAppEventParameterName(String str, Map<String, String> map, String str2, UUID uuid, String str3) {
        int i = 2 % 2;
        String obj = uuid.toString();
        HashMap hashMap = new HashMap();
        hashMap.put("ttl", "-1");
        hashMap.put("uuid", obj);
        hashMap.put(Constants.ScionAnalytics.MessageType.DATA_MESSAGE, map);
        hashMap.put("meta", AFInAppEventType());
        if (str2 != null) {
            int i2 = unregisterClient + 1;
            e = i2 % 128;
            int i3 = i2 % 2;
            hashMap.put("brand_domain", str2);
        }
        String jSONObject = AFa1oSDK.AFInAppEventParameterName(hashMap).toString();
        HashMap hashMap2 = new HashMap();
        Object[] objArr = new Object[1];
        a((Process.myPid() >> 22) + 12, "\b\t\u0004\u0005\u0004\u000e\u0006\u000e\r\u0001\u0006\r", (byte) (Drawable.resolveOpacity(0, 0) + 82), objArr);
        hashMap2.put(((String) objArr[0]).intern(), values(str3, obj, "POST", jSONObject));
        AFe1xSDK<String> AFKeystoreWrapper = AFKeystoreWrapper(new AFe1nSDK(new StringBuilder().append(String.format(values, AppsFlyerLib.getInstance().getHostPrefix(), AFb1tSDK.AFInAppEventType().getHostName())).append("/").append(str).toString(), jSONObject.getBytes(Charset.defaultCharset()), "POST", hashMap2, false), new AFe1lSDK(), true);
        int i4 = unregisterClient + 115;
        e = i4 % 128;
        int i5 = i4 % 2;
        return AFKeystoreWrapper;
    }

    public final AFe1xSDK<Map<String, String>> values(String str, String str2, UUID uuid, String str3) {
        int i = 2 % 2;
        String obj = uuid.toString();
        String obj2 = new StringBuilder().append(String.format(values, AppsFlyerLib.getInstance().getHostPrefix(), AFb1tSDK.AFInAppEventType().getHostName())).append("/").append(str).append("?id=").append(str2).toString();
        Map<String, Object> AFInAppEventType = AFInAppEventType();
        String valueOf2 = String.valueOf(AFInAppEventType.get("build_number"));
        HashMap hashMap = new HashMap();
        hashMap.put("Af-UUID", uuid.toString());
        hashMap.put("Af-Meta-Sdk-Ver", valueOf2);
        hashMap.put("Af-Meta-Counter", String.valueOf(AFInAppEventType.get("counter")));
        hashMap.put("Af-Meta-Model", String.valueOf(AFInAppEventType.get("model")));
        hashMap.put("Af-Meta-Platform", String.valueOf(AFInAppEventType.get("platformextension")));
        hashMap.put("Af-Meta-System-Version", String.valueOf(AFInAppEventType.get("sdk")));
        Object[] objArr = new Object[1];
        a(12 - Color.argb(0, 0, 0, 0), "\b\t\u0004\u0005\u0004\u000e\u0006\u000e\r\u0001\u0006\r", (byte) ((AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 82), objArr);
        hashMap.put(((String) objArr[0]).intern(), values(str3, obj, UtilsKt.HTTP_METHOD_GET, obj, str, str2, valueOf2));
        AFe1xSDK<Map<String, String>> valueOf3 = valueOf(new AFe1nSDK(obj2, null, UtilsKt.HTTP_METHOD_GET, hashMap, false), new AFe1oSDK());
        int i2 = e + 11;
        unregisterClient = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 98 / 0;
        }
        return valueOf3;
    }

    public final AFe1xSDK<String> AFInAppEventParameterName(String str) {
        int i = 2 % 2;
        AFe1nSDK aFe1nSDK = new AFe1nSDK(str, null, UtilsKt.HTTP_METHOD_GET, Collections.emptyMap(), false);
        aFe1nSDK.d = 10000;
        aFe1nSDK.AFInAppEventType = false;
        AFe1xSDK<String> valueOf2 = valueOf(aFe1nSDK, new AFe1lSDK());
        int i2 = e + 57;
        unregisterClient = i2 % 128;
        int i3 = i2 % 2;
        return valueOf2;
    }

    public final AFe1vSDK AFKeystoreWrapper(Map<String, Object> map, String str) {
        int i = 2 % 2;
        int i2 = unregisterClient + 97;
        e = i2 % 128;
        int i3 = i2 % 2;
        try {
            try {
                Object[] objArr = {map, str};
                Object obj = AFa1uSDK.afVerboseLog.get(1743306104);
                if (obj == null) {
                    obj = ((Class) AFa1uSDK.valueOf((char) (8620 - (ViewConfiguration.getMaximumFlingVelocity() >> 16)), Drawable.resolveOpacity(0, 0) + 37, (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 72)).getMethod("values", Map.class, String.class);
                    AFa1uSDK.afVerboseLog.put(1743306104, obj);
                }
                byte[] bArr = (byte[]) ((Method) obj).invoke(null, objArr);
                if (bArr == null) {
                    AFLogger.afErrorLogForExcManagerOnly("AFFinalizer: failed to create bytes", new IllegalArgumentException("failed to create bytes from proxyData"));
                    return null;
                }
                AFe1vSDK aFe1vSDK = new AFe1vSDK(this.AFInAppEventParameterName, bArr);
                int i4 = e + 107;
                unregisterClient = i4 % 128;
                int i5 = i4 % 2;
                return aFe1vSDK;
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause != null) {
                    throw cause;
                }
                throw th;
            }
        } catch (Exception e2) {
            AFLogger.afErrorLogForExcManagerOnly("AFFinalizer: reflection init failed", e2);
            return null;
        }
    }

    private <T> AFe1xSDK<T> valueOf(AFe1nSDK aFe1nSDK, AFe1jSDK<T> aFe1jSDK) {
        int i = 2 % 2;
        int i2 = e + 59;
        unregisterClient = i2 % 128;
        int i3 = i2 % 2;
        AFe1xSDK<T> AFKeystoreWrapper = AFKeystoreWrapper(aFe1nSDK, aFe1jSDK, valueOf());
        int i4 = unregisterClient + 89;
        e = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 65 / 0;
        }
        return AFKeystoreWrapper;
    }

    private Map<String, Object> AFInAppEventType() {
        int i = 2 % 2;
        HashMap hashMap = new HashMap();
        hashMap.put("build_number", "6.12.6");
        hashMap.put("counter", Integer.valueOf(this.AFInAppEventParameterName.valueOf.AFKeystoreWrapper("appsFlyerCount", 0)));
        hashMap.put("model", Build.MODEL);
        Object[] objArr = new Object[1];
        a(Gravity.getAbsoluteGravity(0, 0) + 5, "\u0005\t\u000e\u0006㘌", (byte) ((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 13), objArr);
        hashMap.put(((String) objArr[0]).intern(), Build.BRAND);
        hashMap.put("sdk", Integer.toString(Build.VERSION.SDK_INT));
        AFd1pSDK aFd1pSDK = this.AFInAppEventParameterName;
        hashMap.put("app_version_name", AFb1rSDK.AFInAppEventType(aFd1pSDK.AFInAppEventParameterName.AFKeystoreWrapper, aFd1pSDK.AFInAppEventParameterName.AFKeystoreWrapper.getPackageName()));
        hashMap.put("app_id", this.AFInAppEventParameterName.AFInAppEventParameterName.AFKeystoreWrapper.getPackageName());
        hashMap.put("platformextension", new AFb1aSDK().AFInAppEventParameterName());
        int i2 = unregisterClient + 53;
        e = i2 % 128;
        int i3 = i2 % 2;
        return hashMap;
    }

    private static String values(String str, String str2, String... strArr) {
        int i = 2 % 2;
        ArrayList arrayList = new ArrayList(Arrays.asList(strArr));
        arrayList.add(1, "v2");
        String AFInAppEventParameterName = AFb1lSDK.AFInAppEventParameterName(TextUtils.join("\u2063", (String[]) arrayList.toArray(new String[0])), new StringBuilder().append(str).append(str2).append("v2").toString());
        int i2 = unregisterClient + 113;
        e = i2 % 128;
        int i3 = i2 % 2;
        return AFInAppEventParameterName;
    }

    private boolean valueOf() {
        int i = 2 % 2;
        int i2 = unregisterClient + 115;
        e = i2 % 128;
        int i3 = i2 % 2;
        boolean z = this.AFInAppEventType.getBoolean(AppsFlyerProperties.HTTP_CACHE, true);
        if (i3 == 0 ? z : z) {
            return false;
        }
        int i4 = e + 67;
        unregisterClient = i4 % 128;
        return i4 % 2 != 0;
    }

    private <T> AFe1xSDK<T> AFKeystoreWrapper(AFe1nSDK aFe1nSDK, AFe1jSDK<T> aFe1jSDK, boolean z) {
        int i = 2 % 2;
        aFe1nSDK.AFKeystoreWrapper = z;
        AFe1ySDK aFe1ySDK = this.AFKeystoreWrapper;
        AFe1xSDK<T> aFe1xSDK = new AFe1xSDK<>(aFe1nSDK, aFe1ySDK.values, aFe1ySDK.AFKeystoreWrapper, aFe1jSDK);
        int i2 = e + 69;
        unregisterClient = i2 % 128;
        if (i2 % 2 != 0) {
            return aFe1xSDK;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static void a(int i, String str, byte b, Object[] objArr) {
        int i2;
        int i3 = 2 % 2;
        int i4 = $11 + 23;
        $10 = i4 % 128;
        int i5 = i4 % 2;
        char[] cArr = str;
        if (str != null) {
            cArr = str.toCharArray();
        }
        char[] cArr2 = cArr;
        AFj1qSDK aFj1qSDK = new AFj1qSDK();
        char[] cArr3 = AFLogger;
        if (cArr3 != null) {
            int length = cArr3.length;
            char[] cArr4 = new char[length];
            for (int i6 = 0; i6 < length; i6++) {
                cArr4[i6] = (char) (cArr3[i6] ^ (-5858430825816842367L));
            }
            cArr3 = cArr4;
        }
        char c = (char) ((-5858430825816842367L) ^ registerClient);
        char[] cArr5 = new char[i];
        if (i % 2 != 0) {
            i2 = i - 1;
            cArr5[i2] = (char) (cArr2[i2] - b);
        } else {
            i2 = i;
        }
        if (i2 > 1) {
            aFj1qSDK.values = 0;
            while (aFj1qSDK.values < i2) {
                aFj1qSDK.AFInAppEventType = cArr2[aFj1qSDK.values];
                aFj1qSDK.AFKeystoreWrapper = cArr2[aFj1qSDK.values + 1];
                if (aFj1qSDK.AFInAppEventType == aFj1qSDK.AFKeystoreWrapper) {
                    cArr5[aFj1qSDK.values] = (char) (aFj1qSDK.AFInAppEventType - b);
                    cArr5[aFj1qSDK.values + 1] = (char) (aFj1qSDK.AFKeystoreWrapper - b);
                } else {
                    aFj1qSDK.valueOf = aFj1qSDK.AFInAppEventType / c;
                    aFj1qSDK.unregisterClient = aFj1qSDK.AFInAppEventType % c;
                    aFj1qSDK.AFInAppEventParameterName = aFj1qSDK.AFKeystoreWrapper / c;
                    aFj1qSDK.e = aFj1qSDK.AFKeystoreWrapper % c;
                    if (aFj1qSDK.unregisterClient == aFj1qSDK.e) {
                        aFj1qSDK.valueOf = ((aFj1qSDK.valueOf + c) - 1) % c;
                        aFj1qSDK.AFInAppEventParameterName = ((aFj1qSDK.AFInAppEventParameterName + c) - 1) % c;
                        int i7 = (aFj1qSDK.valueOf * c) + aFj1qSDK.unregisterClient;
                        int i8 = (aFj1qSDK.AFInAppEventParameterName * c) + aFj1qSDK.e;
                        cArr5[aFj1qSDK.values] = cArr3[i7];
                        cArr5[aFj1qSDK.values + 1] = cArr3[i8];
                    } else if (aFj1qSDK.valueOf == aFj1qSDK.AFInAppEventParameterName) {
                        int i9 = $11 + 65;
                        $10 = i9 % 128;
                        int i10 = i9 % 2;
                        aFj1qSDK.unregisterClient = ((aFj1qSDK.unregisterClient + c) - 1) % c;
                        aFj1qSDK.e = ((aFj1qSDK.e + c) - 1) % c;
                        int i11 = (aFj1qSDK.valueOf * c) + aFj1qSDK.unregisterClient;
                        int i12 = (aFj1qSDK.AFInAppEventParameterName * c) + aFj1qSDK.e;
                        cArr5[aFj1qSDK.values] = cArr3[i11];
                        cArr5[aFj1qSDK.values + 1] = cArr3[i12];
                        int i13 = $11 + TypedValues.TYPE_TARGET;
                        $10 = i13 % 128;
                        int i14 = i13 % 2;
                    } else {
                        int i15 = (aFj1qSDK.valueOf * c) + aFj1qSDK.e;
                        int i16 = (aFj1qSDK.AFInAppEventParameterName * c) + aFj1qSDK.unregisterClient;
                        cArr5[aFj1qSDK.values] = cArr3[i15];
                        cArr5[aFj1qSDK.values + 1] = cArr3[i16];
                    }
                }
                aFj1qSDK.values += 2;
            }
        }
        for (int i17 = 0; i17 < i; i17++) {
            cArr5[i17] = (char) (cArr5[i17] ^ 13722);
        }
        objArr[0] = new String(cArr5);
    }
}
