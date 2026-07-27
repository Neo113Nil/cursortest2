package com.appsflyer.internal;

import android.content.Context;
import android.media.AudioTrack;
import android.os.Build;
import android.os.Process;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerLib;
import com.appsflyer.AppsFlyerProperties;
import java.lang.reflect.Method;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;

/* loaded from: classes.dex */
public final class AFe1ySDK {
    private static int $10 = 0;
    private static int $11 = 1;
    private static String AFInAppEventParameterName = null;
    public static String AFKeystoreWrapper = null;
    private static int AFLogger = 0;

    /* renamed from: d, reason: collision with root package name */
    private static long f5888d = 0;

    /* renamed from: i, reason: collision with root package name */
    private static int f5889i = 1;
    private static int registerClient;
    private static char unregisterClient;
    private final AFd1sSDK AFInAppEventType;

    /* renamed from: e, reason: collision with root package name */
    private final AFe1gSDK f5890e;
    private final AFe1xSDK valueOf;
    private final AppsFlyerProperties values;

    static {
        AFInAppEventParameterName();
        AFKeystoreWrapper = "https://%sgcdsdk.%s/install_data/v5.0/";
        AFInAppEventParameterName = "https://%sonelink.%s/shortlink-sdk/v2";
        AFLogger = (f5889i + 43) % 128;
    }

    public AFe1ySDK(AFe1xSDK aFe1xSDK, AFd1sSDK aFd1sSDK, AppsFlyerProperties appsFlyerProperties, AFe1gSDK aFe1gSDK) {
        this.valueOf = aFe1xSDK;
        this.AFInAppEventType = aFd1sSDK;
        this.values = appsFlyerProperties;
        this.f5890e = aFe1gSDK;
    }

    public static void AFInAppEventParameterName() {
        registerClient = 680283152;
        unregisterClient = (char) 54699;
        f5888d = -2499805256334160880L;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static void a(int i2, char c4, String str, String str2, String str3, Object[] objArr) {
        char[] cArr;
        char[] cArr2;
        char[] cArr3;
        if (str3 != null) {
            int i4 = $11 + 37;
            $10 = i4 % 128;
            if (i4 % 2 != 0) {
                cArr = str3.toCharArray();
                int i5 = 35 / 0;
            } else {
                cArr = str3.toCharArray();
            }
        } else {
            cArr = str3;
        }
        char[] cArr4 = cArr;
        if (str2 != null) {
            $11 = ($10 + 9) % 128;
            cArr2 = str2.toCharArray();
        } else {
            cArr2 = str2;
        }
        char[] cArr5 = cArr2;
        if (str != 0) {
            $11 = ($10 + 5) % 128;
            cArr3 = str.toCharArray();
        } else {
            cArr3 = str;
        }
        AFj1eSDK aFj1eSDK = new AFj1eSDK();
        int length = cArr4.length;
        char[] cArr6 = new char[length];
        int length2 = cArr5.length;
        char[] cArr7 = new char[length2];
        System.arraycopy(cArr4, 0, cArr6, 0, length);
        System.arraycopy(cArr5, 0, cArr7, 0, length2);
        cArr6[0] = (char) (cArr6[0] ^ c4);
        cArr7[2] = (char) (cArr7[2] + ((char) i2));
        int length3 = cArr3.length;
        char[] cArr8 = new char[length3];
        aFj1eSDK.valueOf = 0;
        while (true) {
            int i6 = aFj1eSDK.valueOf;
            if (i6 >= length3) {
                objArr[0] = new String(cArr8);
                return;
            }
            $11 = ($10 + 29) % 128;
            int i7 = (i6 + 3) % 4;
            int i8 = cArr6[i6 % 4] * 32718;
            char c5 = cArr7[(i6 + 2) % 4];
            char c6 = (char) ((i8 + c5) % 65535);
            aFj1eSDK.AFKeystoreWrapper = c6;
            cArr7[i7] = (char) (((cArr6[i7] * 32718) + c5) / 65535);
            cArr6[i7] = c6;
            cArr8[i6] = (char) ((((r4[i6] ^ c6) ^ (f5888d ^ (-2499805256334160880L))) ^ ((int) (registerClient ^ (-2499805256334160880L)))) ^ ((char) (unregisterClient ^ (-2499805256334160880L))));
            aFj1eSDK.valueOf = i6 + 1;
        }
    }

    public final AFe1sSDK<String> AFInAppEventType(Map<String, Object> map, String str, String str2) {
        String AFInAppEventParameterName2;
        int i2 = f5889i + 117;
        AFLogger = i2 % 128;
        try {
            if (i2 % 2 != 0) {
                try {
                    Object[] objArr = {map, str};
                    Map<Integer, Object> map2 = AFa1uSDK.afRDLog;
                    Object obj = map2.get(-1459762567);
                    if (obj == null) {
                        obj = ((Class) AFa1uSDK.values((char) (28425 - View.resolveSize(0, 0)), TextUtils.indexOf("", "", 0, 0) + 36, 73 - KeyEvent.getDeadChar(0, 0))).getMethod("AFKeystoreWrapper", Map.class, String.class);
                        map2.put(-1459762567, obj);
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
                Map<Integer, Object> map3 = AFa1uSDK.afRDLog;
                Object obj2 = map3.get(-1459762567);
                if (obj2 == null) {
                    obj2 = ((Class) AFa1uSDK.values((char) (TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 28426), 36 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 72)).getMethod("AFKeystoreWrapper", Map.class, String.class);
                    map3.put(-1459762567, obj2);
                }
                byte[] bArr = (byte[]) ((Method) obj2).invoke(null, objArr2);
                AFj1xSDK aFj1xSDK = new AFj1xSDK(this.AFInAppEventType);
                if (str2 == null || str2.length() == 0 || new Regex("4.?(\\d+)?.?(\\d+)").b(str2) || !(!new Regex("3.?(\\d+)?.?(\\d+)").b(str2))) {
                    f5889i = (AFLogger + 103) % 128;
                    AFInAppEventParameterName2 = aFj1xSDK.AFKeystoreWrapper.AFInAppEventParameterName("https://%sviap.%s/api/v1/android/validate_purchase?app_id=");
                    f5889i = (AFLogger + 77) % 128;
                } else {
                    AFInAppEventParameterName2 = aFj1xSDK.AFKeystoreWrapper.AFInAppEventParameterName("https://%sviap.%s/api/v1/android/validate_purchase_v2?app_id=");
                }
                StringBuilder sb = new StringBuilder();
                sb.append(AFInAppEventParameterName2);
                sb.append(aFj1xSDK.AFInAppEventType.valueOf.AFKeystoreWrapper.getPackageName());
                return AFKeystoreWrapper(new AFe1nSDK(aFj1xSDK.valueOf(sb.toString()), bArr, "POST", Collections.emptyMap(), true), new AFe1pSDK());
            } catch (Throwable th2) {
                Throwable cause2 = th2.getCause();
                if (cause2 != null) {
                    throw cause2;
                }
                throw th2;
            }
        } catch (Exception e4) {
            AFLogger.afErrorLogForExcManagerOnly("AFFinalizer: reflection init failed", e4);
            return null;
        }
        AFLogger.afErrorLogForExcManagerOnly("AFFinalizer: reflection init failed", e4);
        return null;
    }

    public final AFe1sSDK<String> AFKeystoreWrapper(AFa1qSDK aFa1qSDK, String str, AFd1lSDK aFd1lSDK) {
        f5889i = (AFLogger + 9) % 128;
        try {
            Object[] objArr = {aFa1qSDK, str, aFd1lSDK};
            Map<Integer, Object> map = AFa1uSDK.afRDLog;
            Object obj = map.get(943641481);
            if (obj == null) {
                obj = ((Class) AFa1uSDK.values((char) (28426 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1))), (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 36, 73 - ExpandableListView.getPackedPositionType(0L))).getMethod("AFInAppEventType", AFa1qSDK.class, String.class, AFd1lSDK.class);
                map.put(943641481, obj);
            }
            AFe1sSDK<String> AFKeystoreWrapper2 = AFKeystoreWrapper(new AFe1nSDK(aFa1qSDK.registerClient, (byte[]) ((Method) obj).invoke(null, objArr), "POST", Collections.emptyMap(), aFa1qSDK.valueOf()), new AFe1pSDK());
            int i2 = f5889i + 119;
            AFLogger = i2 % 128;
            if (i2 % 2 != 0) {
                int i4 = 27 / 0;
            }
            return AFKeystoreWrapper2;
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

    public final AFe1sSDK<String> valueOf(Map<String, Object> map, String str) {
        int i2 = f5889i + 117;
        AFLogger = i2 % 128;
        try {
            if (i2 % 2 != 0) {
                try {
                    Object[] objArr = {map, str};
                    Map<Integer, Object> map2 = AFa1uSDK.afRDLog;
                    Object obj = map2.get(-1459762567);
                    if (obj == null) {
                        obj = ((Class) AFa1uSDK.values((char) (28424 - MotionEvent.axisFromString("")), View.resolveSizeAndState(0, 0, 0) + 36, 73 - (ViewConfiguration.getWindowTouchSlop() >> 8))).getMethod("AFKeystoreWrapper", Map.class, String.class);
                        map2.put(-1459762567, obj);
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
                Map<Integer, Object> map3 = AFa1uSDK.afRDLog;
                Object obj2 = map3.get(-1459762567);
                if (obj2 == null) {
                    obj2 = ((Class) AFa1uSDK.values((char) (28425 - TextUtils.indexOf("", "", 0)), 36 - View.MeasureSpec.makeMeasureSpec(0, 0), 73 - (ViewConfiguration.getDoubleTapTimeout() >> 16))).getMethod("AFKeystoreWrapper", Map.class, String.class);
                    map3.put(-1459762567, obj2);
                }
                byte[] bArr = (byte[]) ((Method) obj2).invoke(null, objArr2);
                AFj1xSDK aFj1xSDK = new AFj1xSDK(this.AFInAppEventType);
                String AFInAppEventParameterName2 = aFj1xSDK.AFKeystoreWrapper.AFInAppEventParameterName("https://%svalidate-and-log.%s/api/v1.0/android/validateAndLog?app_id=");
                StringBuilder sb = new StringBuilder();
                sb.append(AFInAppEventParameterName2);
                sb.append(aFj1xSDK.AFInAppEventType.valueOf.AFKeystoreWrapper.getPackageName());
                AFe1sSDK<String> AFKeystoreWrapper2 = AFKeystoreWrapper(new AFe1nSDK(sb.toString(), bArr, "POST", Collections.emptyMap(), true), new AFe1pSDK());
                int i4 = f5889i + 47;
                AFLogger = i4 % 128;
                if (i4 % 2 != 0) {
                    int i5 = 15 / 0;
                }
                return AFKeystoreWrapper2;
            } catch (Throwable th2) {
                Throwable cause2 = th2.getCause();
                if (cause2 != null) {
                    throw cause2;
                }
                throw th2;
            }
        } catch (Throwable th3) {
            AFLogger.INSTANCE.e(AFg1aSDK.PURCHASE_VALIDATION, "AFFinalizer: reflection init failed", th3, false, false);
            return null;
        }
        AFLogger.INSTANCE.e(AFg1aSDK.PURCHASE_VALIDATION, "AFFinalizer: reflection init failed", th3, false, false);
        return null;
    }

    public final AFe1sSDK<String> values(Map<String, Object> map, String str, String str2) {
        byte[] bArr;
        AFj1xSDK aFj1xSDK;
        String AFInAppEventParameterName2;
        int i2 = AFLogger + 67;
        f5889i = i2 % 128;
        try {
            if (i2 % 2 != 0) {
                try {
                    Object[] objArr = {map, str};
                    Map<Integer, Object> map2 = AFa1uSDK.afRDLog;
                    Object obj = map2.get(-1459762567);
                    if (obj == null) {
                        obj = ((Class) AFa1uSDK.values((char) (28424 - TextUtils.indexOf((CharSequence) "", '0', 0)), (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 36, (ViewConfiguration.getEdgeSlop() >> 16) + 73)).getMethod("AFKeystoreWrapper", Map.class, String.class);
                        map2.put(-1459762567, obj);
                    }
                    bArr = (byte[]) ((Method) obj).invoke(null, objArr);
                    byte[] bArr2 = bArr;
                    aFj1xSDK = new AFj1xSDK(this.AFInAppEventType);
                    if (str2 != null) {
                        f5889i = (AFLogger + 19) % 128;
                        if (!new Regex("4.?(\\d+)?.?(\\d+)").b(str2)) {
                            AFInAppEventParameterName2 = aFj1xSDK.AFKeystoreWrapper.AFInAppEventParameterName("https://%sars.%s/api/v2/android/validate_subscription_v2?app_id=");
                            StringBuilder sb = new StringBuilder();
                            sb.append(AFInAppEventParameterName2);
                            sb.append(aFj1xSDK.AFInAppEventType.valueOf.AFKeystoreWrapper.getPackageName());
                            return AFKeystoreWrapper(new AFe1nSDK(aFj1xSDK.valueOf(sb.toString()), bArr2, "POST", Collections.emptyMap(), true), new AFe1pSDK());
                        }
                    }
                    AFInAppEventParameterName2 = aFj1xSDK.AFKeystoreWrapper.AFInAppEventParameterName("https://%sars.%s/api/v2/android/validate_subscription?app_id=");
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(AFInAppEventParameterName2);
                    sb2.append(aFj1xSDK.AFInAppEventType.valueOf.AFKeystoreWrapper.getPackageName());
                    return AFKeystoreWrapper(new AFe1nSDK(aFj1xSDK.valueOf(sb2.toString()), bArr2, "POST", Collections.emptyMap(), true), new AFe1pSDK());
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
                Map<Integer, Object> map3 = AFa1uSDK.afRDLog;
                Object obj2 = map3.get(-1459762567);
                if (obj2 == null) {
                    obj2 = ((Class) AFa1uSDK.values((char) (28424 - TextUtils.lastIndexOf("", '0', 0)), 36 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), 73 - Gravity.getAbsoluteGravity(0, 0))).getMethod("AFKeystoreWrapper", Map.class, String.class);
                    map3.put(-1459762567, obj2);
                }
                bArr = (byte[]) ((Method) obj2).invoke(null, objArr2);
                int i4 = 47 / 0;
                byte[] bArr22 = bArr;
                aFj1xSDK = new AFj1xSDK(this.AFInAppEventType);
                if (str2 != null && str2.length() != 0) {
                    f5889i = (AFLogger + 19) % 128;
                    if (!new Regex("4.?(\\d+)?.?(\\d+)").b(str2) && !new Regex("3.?(\\d+)?.?(\\d+)").b(str2)) {
                        AFInAppEventParameterName2 = aFj1xSDK.AFKeystoreWrapper.AFInAppEventParameterName("https://%sars.%s/api/v2/android/validate_subscription_v2?app_id=");
                        StringBuilder sb22 = new StringBuilder();
                        sb22.append(AFInAppEventParameterName2);
                        sb22.append(aFj1xSDK.AFInAppEventType.valueOf.AFKeystoreWrapper.getPackageName());
                        return AFKeystoreWrapper(new AFe1nSDK(aFj1xSDK.valueOf(sb22.toString()), bArr22, "POST", Collections.emptyMap(), true), new AFe1pSDK());
                    }
                }
                AFInAppEventParameterName2 = aFj1xSDK.AFKeystoreWrapper.AFInAppEventParameterName("https://%sars.%s/api/v2/android/validate_subscription?app_id=");
                StringBuilder sb222 = new StringBuilder();
                sb222.append(AFInAppEventParameterName2);
                sb222.append(aFj1xSDK.AFInAppEventType.valueOf.AFKeystoreWrapper.getPackageName());
                return AFKeystoreWrapper(new AFe1nSDK(aFj1xSDK.valueOf(sb222.toString()), bArr22, "POST", Collections.emptyMap(), true), new AFe1pSDK());
            } catch (Throwable th2) {
                Throwable cause2 = th2.getCause();
                if (cause2 != null) {
                    throw cause2;
                }
                throw th2;
            }
        } catch (Exception e4) {
            AFLogger.afErrorLogForExcManagerOnly("AFFinalizer: reflection init failed", e4);
            return null;
        }
    }

    public final AFe1sSDK<String> AFInAppEventParameterName(String str, Map<String, String> map, String str2, UUID uuid, String str3) {
        String obj = uuid.toString();
        HashMap hashMap = new HashMap();
        hashMap.put("ttl", "-1");
        hashMap.put("uuid", obj);
        hashMap.put("data", map);
        hashMap.put("meta", valueOf());
        if (str2 != null) {
            int i2 = f5889i + 117;
            AFLogger = i2 % 128;
            if (i2 % 2 != 0) {
                hashMap.put("brand_domain", str2);
                int i4 = 45 / 0;
            } else {
                hashMap.put("brand_domain", str2);
            }
            f5889i = (AFLogger + 65) % 128;
        }
        String jSONObject = AFa1oSDK.AFInAppEventType((Map<String, ?>) hashMap).toString();
        HashMap hashMap2 = new HashMap();
        Object[] objArr = new Object[1];
        a((AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), (char) (Process.myTid() >> 22), "㰯䃧럯僄蘿侇ᾟ\uf303\ue862腉\ud833凟", "\u0000\u0000\u0000\u0000", "왘됽䆵晻", objArr);
        hashMap2.put(((String) objArr[0]).intern(), AFInAppEventParameterName(str3, obj, "POST", jSONObject));
        StringBuilder sb = new StringBuilder();
        sb.append(String.format(AFInAppEventParameterName, AppsFlyerLib.getInstance().getHostPrefix(), AFb1vSDK.AFKeystoreWrapper().getHostName()));
        sb.append("/");
        sb.append(str);
        return values(new AFe1nSDK(sb.toString(), jSONObject.getBytes(Charset.defaultCharset()), "POST", hashMap2, false), (AFe1iSDK) new AFe1pSDK(), true);
    }

    public final AFe1sSDK<AFc1pSDK> AFKeystoreWrapper(AFc1jSDK aFc1jSDK) {
        AFe1sSDK<AFc1pSDK> AFKeystoreWrapper2 = AFKeystoreWrapper(new AFe1nSDK(aFc1jSDK.registerClient, AFa1oSDK.AFInAppEventType((Map<String, ?>) aFc1jSDK.AFInAppEventParameterName()).toString().getBytes(Charset.defaultCharset()), "POST", Collections.emptyMap(), aFc1jSDK.valueOf()), new AFc1qSDK());
        int i2 = f5889i + 79;
        AFLogger = i2 % 128;
        if (i2 % 2 == 0) {
            return AFKeystoreWrapper2;
        }
        throw null;
    }

    private Map<String, Object> valueOf() {
        HashMap hashMap = new HashMap();
        hashMap.put("build_number", "6.14.0");
        hashMap.put("counter", Integer.valueOf(this.AFInAppEventType.AFKeystoreWrapper.valueOf("appsFlyerCount", 0)));
        hashMap.put("model", Build.MODEL);
        Object[] objArr = new Object[1];
        a(1190071419 - View.resolveSizeAndState(0, 0, 0), (char) (TextUtils.lastIndexOf("", '0') + 54887), "Ǌ䴭ᘙᙛ鄏", "\u0000\u0000\u0000\u0000", "筢\uef0c晆ᯖ", objArr);
        hashMap.put(((String) objArr[0]).intern(), Build.BRAND);
        hashMap.put("sdk", Integer.toString(Build.VERSION.SDK_INT));
        Context context = this.AFInAppEventType.valueOf.AFKeystoreWrapper;
        hashMap.put("app_version_name", AFb1uSDK.AFInAppEventType(context, context.getPackageName()));
        hashMap.put("app_id", this.AFInAppEventType.valueOf.AFKeystoreWrapper.getPackageName());
        hashMap.put("platformextension", new AFb1hSDK().valueOf());
        int i2 = AFLogger + 19;
        f5889i = i2 % 128;
        if (i2 % 2 != 0) {
            return hashMap;
        }
        throw null;
    }

    public final AFe1sSDK<Map<String, Object>> AFKeystoreWrapper(String str, String str2) {
        String packageName = this.AFInAppEventType.valueOf.AFKeystoreWrapper.getPackageName();
        AFd1sSDK aFd1sSDK = this.AFInAppEventType;
        AFe1sSDK<Map<String, Object>> AFKeystoreWrapper2 = AFKeystoreWrapper(AFe1rSDK.AFInAppEventParameterName(packageName, AFb1kSDK.valueOf(aFd1sSDK.valueOf, aFd1sSDK.AFKeystoreWrapper), str, str2), new AFe1tSDK());
        f5889i = (AFLogger + 67) % 128;
        return AFKeystoreWrapper2;
    }

    private static String AFInAppEventParameterName(String str, String str2, String... strArr) {
        ArrayList arrayList = new ArrayList(Arrays.asList(strArr));
        arrayList.add(1, "v2");
        String join = TextUtils.join("\u2063", (String[]) arrayList.toArray(new String[0]));
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(str2);
        sb.append("v2");
        String AFKeystoreWrapper2 = AFb1lSDK.AFKeystoreWrapper(join, sb.toString());
        int i2 = AFLogger + 121;
        f5889i = i2 % 128;
        if (i2 % 2 != 0) {
            return AFKeystoreWrapper2;
        }
        throw null;
    }

    private <T> AFe1sSDK<T> values(AFe1nSDK aFe1nSDK, AFe1iSDK<T> aFe1iSDK, boolean z4) {
        aFe1nSDK.AFInAppEventParameterName = z4;
        AFe1xSDK aFe1xSDK = this.valueOf;
        AFe1sSDK<T> aFe1sSDK = new AFe1sSDK<>(aFe1nSDK, aFe1xSDK.AFInAppEventParameterName, aFe1xSDK.AFInAppEventType, aFe1iSDK);
        AFLogger = (f5889i + 23) % 128;
        return aFe1sSDK;
    }

    public final AFe1sSDK<Map<String, String>> AFKeystoreWrapper(String str, String str2, UUID uuid, String str3) {
        String obj = uuid.toString();
        StringBuilder sb = new StringBuilder();
        sb.append(String.format(AFInAppEventParameterName, AppsFlyerLib.getInstance().getHostPrefix(), AFb1vSDK.AFKeystoreWrapper().getHostName()));
        sb.append("/");
        sb.append(str);
        sb.append("?id=");
        sb.append(str2);
        String obj2 = sb.toString();
        Map<String, Object> valueOf = valueOf();
        String valueOf2 = String.valueOf(valueOf.get("build_number"));
        HashMap hashMap = new HashMap();
        hashMap.put("Af-UUID", uuid.toString());
        hashMap.put("Af-Meta-Sdk-Ver", valueOf2);
        hashMap.put("Af-Meta-Counter", String.valueOf(valueOf.get("counter")));
        hashMap.put("Af-Meta-Model", String.valueOf(valueOf.get("model")));
        hashMap.put("Af-Meta-Platform", String.valueOf(valueOf.get("platformextension")));
        hashMap.put("Af-Meta-System-Version", String.valueOf(valueOf.get("sdk")));
        Object[] objArr = new Object[1];
        a(Gravity.getAbsoluteGravity(0, 0), (char) (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), "㰯䃧럯僄蘿侇ᾟ\uf303\ue862腉\ud833凟", "\u0000\u0000\u0000\u0000", "왘됽䆵晻", objArr);
        hashMap.put(((String) objArr[0]).intern(), AFInAppEventParameterName(str3, obj, "GET", obj, str, str2, valueOf2));
        AFe1sSDK<Map<String, String>> AFKeystoreWrapper2 = AFKeystoreWrapper(new AFe1nSDK(obj2, null, "GET", hashMap, false), new AFe1lSDK());
        int i2 = AFLogger + 9;
        f5889i = i2 % 128;
        if (i2 % 2 == 0) {
            int i4 = 39 / 0;
        }
        return AFKeystoreWrapper2;
    }

    public final AFe1sSDK<AFi1zSDK> AFInAppEventType(boolean z4, boolean z5, String str, int i2) {
        String str2;
        String str3;
        AFLogger = (f5889i + 91) % 128;
        AFe1gSDK aFe1gSDK = this.f5890e;
        Intrinsics.checkNotNullParameter(str, "");
        String str4 = z4 ? AFe1gSDK.AFInAppEventParameterName : AFe1gSDK.AFInAppEventType;
        if (z5) {
            f5889i = (AFLogger + 71) % 128;
            str2 = "stg";
        } else {
            f5889i = (AFLogger + 71) % 128;
            str2 = "";
        }
        if (AFe1gSDK.valueOf()) {
            int i4 = AFLogger + 73;
            f5889i = i4 % 128;
            if (i4 % 2 != 0) {
                str3 = (String) aFe1gSDK.AFKeystoreWrapper.getValue();
                f5889i = (AFLogger + 57) % 128;
            } else {
                throw null;
            }
        } else {
            str3 = "";
        }
        String format = String.format(str4, Arrays.copyOf(new Object[]{str3, str2, aFe1gSDK.AFInAppEventParameterName(), str}, 4));
        Intrinsics.checkNotNullExpressionValue(format, "");
        AFe1nSDK aFe1nSDK = new AFe1nSDK(format, "GET");
        aFe1nSDK.registerClient = 1500;
        return AFKeystoreWrapper(aFe1nSDK, new AFe1oSDK());
    }

    public final AFe1sSDK<String> AFKeystoreWrapper(String str) {
        AFe1nSDK aFe1nSDK = new AFe1nSDK(str, null, "GET", Collections.emptyMap(), false);
        aFe1nSDK.registerClient = 10000;
        aFe1nSDK.AFKeystoreWrapper = false;
        AFe1sSDK<String> AFKeystoreWrapper2 = AFKeystoreWrapper(aFe1nSDK, new AFe1pSDK());
        AFLogger = (f5889i + 57) % 128;
        return AFKeystoreWrapper2;
    }

    public final AFe1sSDK<String> AFInAppEventType(AFh1qSDK aFh1qSDK) {
        AFe1sSDK<String> AFKeystoreWrapper2 = AFKeystoreWrapper(new AFe1nSDK(aFh1qSDK.registerClient, aFh1qSDK.AFKeystoreWrapper(), "POST", Collections.emptyMap(), true), new AFe1pSDK());
        AFLogger = (f5889i + 9) % 128;
        return AFKeystoreWrapper2;
    }

    public final AFe1wSDK AFKeystoreWrapper(Map<String, Object> map, String str) {
        f5889i = (AFLogger + 55) % 128;
        try {
            try {
                Object[] objArr = {map, str};
                Map<Integer, Object> map2 = AFa1uSDK.afRDLog;
                Object obj = map2.get(-1459762567);
                if (obj == null) {
                    obj = ((Class) AFa1uSDK.values((char) ((ViewConfiguration.getDoubleTapTimeout() >> 16) + 28425), View.resolveSizeAndState(0, 0, 0) + 36, (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 73)).getMethod("AFKeystoreWrapper", Map.class, String.class);
                    map2.put(-1459762567, obj);
                }
                byte[] bArr = (byte[]) ((Method) obj).invoke(null, objArr);
                if (bArr == null) {
                    AFLogger.afErrorLogForExcManagerOnly("AFFinalizer: failed to create bytes", new IllegalArgumentException("failed to create bytes from proxyData"));
                    return null;
                }
                AFe1wSDK aFe1wSDK = new AFe1wSDK(this.AFInAppEventType, bArr);
                int i2 = f5889i + 19;
                AFLogger = i2 % 128;
                if (i2 % 2 == 0) {
                    return aFe1wSDK;
                }
                throw null;
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause != null) {
                    throw cause;
                }
                throw th;
            }
        } catch (Exception e4) {
            AFLogger.afErrorLogForExcManagerOnly("AFFinalizer: reflection init failed", e4);
            return null;
        }
    }

    private boolean AFInAppEventType() {
        if (this.values.getBoolean(AppsFlyerProperties.HTTP_CACHE, true)) {
            f5889i = (AFLogger + 83) % 128;
            return false;
        }
        int i2 = f5889i + 85;
        AFLogger = i2 % 128;
        return i2 % 2 == 0;
    }

    private <T> AFe1sSDK<T> AFKeystoreWrapper(AFe1nSDK aFe1nSDK, AFe1iSDK<T> aFe1iSDK) {
        AFLogger = (f5889i + 103) % 128;
        AFe1sSDK<T> values = values(aFe1nSDK, aFe1iSDK, AFInAppEventType());
        int i2 = AFLogger + 15;
        f5889i = i2 % 128;
        if (i2 % 2 != 0) {
            return values;
        }
        throw null;
    }
}
