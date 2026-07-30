package com.appsflyer.internal;

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
import com.google.android.gms.common.ConnectionResult;
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
public final class AFe1ySDK {
    private static int $10 = 0;
    private static int $11 = 1;
    private static String AFInAppEventParameterName = null;
    public static String AFKeystoreWrapper = null;
    private static int AFLogger = 0;
    private static long d = 0;
    private static int i = 1;
    private static int registerClient;
    private static char unregisterClient;
    private final AFd1sSDK AFInAppEventType;
    private final AFe1gSDK e;
    private final AFe1xSDK valueOf;
    private final AppsFlyerProperties values;

    static void AFInAppEventParameterName() {
        registerClient = 680283152;
        unregisterClient = (char) 54699;
        d = -2499805256334160880L;
    }

    static {
        AFInAppEventParameterName();
        AFKeystoreWrapper = "https://%sgcdsdk.%s/install_data/v5.0/";
        AFInAppEventParameterName = "https://%sonelink.%s/shortlink-sdk/v2";
        int i2 = i + 43;
        AFLogger = i2 % 128;
        int i3 = i2 % 2;
    }

    public AFe1ySDK(AFe1xSDK aFe1xSDK, AFd1sSDK aFd1sSDK, AppsFlyerProperties appsFlyerProperties, AFe1gSDK aFe1gSDK) {
        this.valueOf = aFe1xSDK;
        this.AFInAppEventType = aFd1sSDK;
        this.values = appsFlyerProperties;
        this.e = aFe1gSDK;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x00e4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final AFe1sSDK<String> values(Map<String, Object> map, String str, String str2) {
        byte[] bArr;
        AFj1xSDK aFj1xSDK;
        String str3;
        String AFInAppEventParameterName2;
        int i2;
        int i3 = 2 % 2;
        int i4 = AFLogger + 67;
        i = i4 % 128;
        try {
            if (i4 % 2 != 0) {
                try {
                    Object[] objArr = {map, str};
                    Object obj = AFa1uSDK.afRDLog.get(-1459762567);
                    if (obj == null) {
                        obj = ((Class) AFa1uSDK.values((char) (28424 - TextUtils.indexOf((CharSequence) "", '0', 0)), (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 36, (ViewConfiguration.getEdgeSlop() >> 16) + 73)).getMethod("AFKeystoreWrapper", Map.class, String.class);
                        AFa1uSDK.afRDLog.put(-1459762567, obj);
                    }
                    bArr = (byte[]) ((Method) obj).invoke(null, objArr);
                    byte[] bArr2 = bArr;
                    aFj1xSDK = new AFj1xSDK(this.AFInAppEventType);
                    str3 = str2;
                    if (str3 != null) {
                        i2 = AFLogger + 19;
                        i = i2 % 128;
                        if (i2 % 2 == 0) {
                        }
                        if (!new Regex("4.?(\\d+)?.?(\\d+)").matches(str3)) {
                            AFInAppEventParameterName2 = aFj1xSDK.values.AFInAppEventParameterName("https://%sars.%s/api/v2/android/validate_subscription_v2?app_id=");
                            return AFKeystoreWrapper(new AFe1nSDK(aFj1xSDK.valueOf(new StringBuilder().append(AFInAppEventParameterName2).append(aFj1xSDK.valueOf.valueOf.AFKeystoreWrapper.getPackageName()).toString()), bArr2, "POST", Collections.emptyMap(), true), new AFe1pSDK());
                        }
                    }
                    AFInAppEventParameterName2 = aFj1xSDK.values.AFInAppEventParameterName("https://%sars.%s/api/v2/android/validate_subscription?app_id=");
                    return AFKeystoreWrapper(new AFe1nSDK(aFj1xSDK.valueOf(new StringBuilder().append(AFInAppEventParameterName2).append(aFj1xSDK.valueOf.valueOf.AFKeystoreWrapper.getPackageName()).toString()), bArr2, "POST", Collections.emptyMap(), true), new AFe1pSDK());
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
                Object obj2 = AFa1uSDK.afRDLog.get(-1459762567);
                if (obj2 == null) {
                    obj2 = ((Class) AFa1uSDK.values((char) (28424 - TextUtils.lastIndexOf("", '0', 0)), 36 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), 73 - Gravity.getAbsoluteGravity(0, 0))).getMethod("AFKeystoreWrapper", Map.class, String.class);
                    AFa1uSDK.afRDLog.put(-1459762567, obj2);
                }
                bArr = (byte[]) ((Method) obj2).invoke(null, objArr2);
                int i5 = 47 / 0;
                byte[] bArr22 = bArr;
                aFj1xSDK = new AFj1xSDK(this.AFInAppEventType);
                str3 = str2;
                if (str3 != null && str3.length() != 0) {
                    i2 = AFLogger + 19;
                    i = i2 % 128;
                    if (i2 % 2 == 0) {
                        int i6 = 4 / 3;
                    }
                    if (!new Regex("4.?(\\d+)?.?(\\d+)").matches(str3) && !new Regex("3.?(\\d+)?.?(\\d+)").matches(str3)) {
                        AFInAppEventParameterName2 = aFj1xSDK.values.AFInAppEventParameterName("https://%sars.%s/api/v2/android/validate_subscription_v2?app_id=");
                        return AFKeystoreWrapper(new AFe1nSDK(aFj1xSDK.valueOf(new StringBuilder().append(AFInAppEventParameterName2).append(aFj1xSDK.valueOf.valueOf.AFKeystoreWrapper.getPackageName()).toString()), bArr22, "POST", Collections.emptyMap(), true), new AFe1pSDK());
                    }
                }
                AFInAppEventParameterName2 = aFj1xSDK.values.AFInAppEventParameterName("https://%sars.%s/api/v2/android/validate_subscription?app_id=");
                return AFKeystoreWrapper(new AFe1nSDK(aFj1xSDK.valueOf(new StringBuilder().append(AFInAppEventParameterName2).append(aFj1xSDK.valueOf.valueOf.AFKeystoreWrapper.getPackageName()).toString()), bArr22, "POST", Collections.emptyMap(), true), new AFe1pSDK());
            } catch (Throwable th2) {
                Throwable cause2 = th2.getCause();
                if (cause2 != null) {
                    throw cause2;
                }
                throw th2;
            }
        } catch (Exception e) {
            AFLogger.afErrorLogForExcManagerOnly("AFFinalizer: reflection init failed", e);
            return null;
        }
    }

    public final AFe1sSDK<String> AFInAppEventType(Map<String, Object> map, String str, String str2) {
        String str3;
        int i2 = 2 % 2;
        int i3 = i + 117;
        AFLogger = i3 % 128;
        boolean z = false;
        try {
            if (i3 % 2 != 0) {
                try {
                    Object[] objArr = {map, str};
                    Object obj = AFa1uSDK.afRDLog.get(-1459762567);
                    if (obj == null) {
                        obj = ((Class) AFa1uSDK.values((char) (28425 - View.resolveSize(0, 0)), TextUtils.indexOf("", "", 0, 0) + 36, 73 - KeyEvent.getDeadChar(0, 0))).getMethod("AFKeystoreWrapper", Map.class, String.class);
                        AFa1uSDK.afRDLog.put(-1459762567, obj);
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
                Object obj2 = AFa1uSDK.afRDLog.get(-1459762567);
                if (obj2 == null) {
                    obj2 = ((Class) AFa1uSDK.values((char) (TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 28426), 36 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 72)).getMethod("AFKeystoreWrapper", Map.class, String.class);
                    AFa1uSDK.afRDLog.put(-1459762567, obj2);
                }
                byte[] bArr = (byte[]) ((Method) obj2).invoke(null, objArr2);
                AFj1xSDK aFj1xSDK = new AFj1xSDK(this.AFInAppEventType);
                String str4 = str2;
                if (str4 == null || str4.length() == 0 || new Regex("4.?(\\d+)?.?(\\d+)").matches(str4) || !(!new Regex("3.?(\\d+)?.?(\\d+)").matches(str4))) {
                    int i4 = AFLogger + 95;
                    i = i4 % 128;
                    int i5 = i4 % 2;
                    z = true;
                }
                if (!z) {
                    str3 = aFj1xSDK.values.AFInAppEventParameterName("https://%sviap.%s/api/v1/android/validate_purchase_v2?app_id=");
                } else {
                    int i6 = AFLogger + 103;
                    i = i6 % 128;
                    int i7 = i6 % 2;
                    String AFInAppEventParameterName2 = aFj1xSDK.values.AFInAppEventParameterName("https://%sviap.%s/api/v1/android/validate_purchase?app_id=");
                    int i8 = AFLogger + 77;
                    i = i8 % 128;
                    int i9 = i8 % 2;
                    str3 = AFInAppEventParameterName2;
                }
                return AFKeystoreWrapper(new AFe1nSDK(aFj1xSDK.valueOf(new StringBuilder().append(str3).append(aFj1xSDK.valueOf.valueOf.AFKeystoreWrapper.getPackageName()).toString()), bArr, "POST", Collections.emptyMap(), true), new AFe1pSDK());
            } catch (Throwable th2) {
                Throwable cause2 = th2.getCause();
                if (cause2 != null) {
                    throw cause2;
                }
                throw th2;
            }
        } catch (Exception e) {
            AFLogger.afErrorLogForExcManagerOnly("AFFinalizer: reflection init failed", e);
            return null;
        }
        AFLogger.afErrorLogForExcManagerOnly("AFFinalizer: reflection init failed", e);
        return null;
    }

    public final AFe1sSDK<String> valueOf(Map<String, Object> map, String str) {
        int i2 = 2 % 2;
        int i3 = i + 117;
        AFLogger = i3 % 128;
        Object obj = null;
        try {
            if (i3 % 2 != 0) {
                try {
                    Object[] objArr = {map, str};
                    Object obj2 = AFa1uSDK.afRDLog.get(-1459762567);
                    if (obj2 == null) {
                        obj2 = ((Class) AFa1uSDK.values((char) (28424 - MotionEvent.axisFromString("")), View.resolveSizeAndState(0, 0, 0) + 36, 73 - (ViewConfiguration.getWindowTouchSlop() >> 8))).getMethod("AFKeystoreWrapper", Map.class, String.class);
                        AFa1uSDK.afRDLog.put(-1459762567, obj2);
                    }
                    obj.hashCode();
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
                Object obj3 = AFa1uSDK.afRDLog.get(-1459762567);
                if (obj3 == null) {
                    obj3 = ((Class) AFa1uSDK.values((char) (28425 - TextUtils.indexOf("", "", 0)), 36 - View.MeasureSpec.makeMeasureSpec(0, 0), 73 - (ViewConfiguration.getDoubleTapTimeout() >> 16))).getMethod("AFKeystoreWrapper", Map.class, String.class);
                    AFa1uSDK.afRDLog.put(-1459762567, obj3);
                }
                byte[] bArr = (byte[]) ((Method) obj3).invoke(null, objArr2);
                AFj1xSDK aFj1xSDK = new AFj1xSDK(this.AFInAppEventType);
                AFe1sSDK<String> AFKeystoreWrapper2 = AFKeystoreWrapper(new AFe1nSDK(new StringBuilder().append(aFj1xSDK.values.AFInAppEventParameterName("https://%svalidate-and-log.%s/api/v1.0/android/validateAndLog?app_id=")).append(aFj1xSDK.valueOf.valueOf.AFKeystoreWrapper.getPackageName()).toString(), bArr, "POST", Collections.emptyMap(), true), new AFe1pSDK());
                int i4 = i + 47;
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

    public final AFe1sSDK<AFi1zSDK> AFInAppEventType(boolean z, boolean z2, String str, int i2) {
        String str2;
        String str3;
        int i3 = 2 % 2;
        int i4 = i + 91;
        AFLogger = i4 % 128;
        int i5 = i4 % 2;
        AFe1gSDK aFe1gSDK = this.e;
        Intrinsics.checkNotNullParameter(str, "");
        String str4 = z ? AFe1gSDK.AFInAppEventParameterName : AFe1gSDK.AFInAppEventType;
        if (z2) {
            int i6 = AFLogger + 71;
            i = i6 % 128;
            int i7 = i6 % 2;
            str2 = "stg";
        } else {
            int i8 = AFLogger + 71;
            i = i8 % 128;
            if (i8 % 2 == 0) {
                int i9 = 5 / 4;
            }
            str2 = "";
        }
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        if (AFe1gSDK.valueOf()) {
            int i10 = AFLogger + 73;
            i = i10 % 128;
            if (i10 % 2 == 0) {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            str3 = (String) aFe1gSDK.AFInAppEventParameterName.getValue();
            int i11 = AFLogger + 57;
            i = i11 % 128;
            int i12 = i11 % 2;
        } else {
            str3 = "";
        }
        String format = String.format(str4, Arrays.copyOf(new Object[]{str3, str2, aFe1gSDK.AFInAppEventParameterName(), str}, 4));
        Intrinsics.checkNotNullExpressionValue(format, "");
        AFe1nSDK aFe1nSDK = new AFe1nSDK(format, "GET");
        aFe1nSDK.registerClient = ConnectionResult.DRIVE_EXTERNAL_STORAGE_REQUIRED;
        return AFKeystoreWrapper(aFe1nSDK, new AFe1oSDK());
    }

    public final AFe1sSDK<String> AFKeystoreWrapper(AFa1qSDK aFa1qSDK, String str, AFd1lSDK aFd1lSDK) {
        int i2 = 2 % 2;
        int i3 = AFLogger + 9;
        i = i3 % 128;
        int i4 = i3 % 2;
        try {
            Object[] objArr = {aFa1qSDK, str, aFd1lSDK};
            Object obj = AFa1uSDK.afRDLog.get(943641481);
            if (obj == null) {
                obj = ((Class) AFa1uSDK.values((char) (28426 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1))), (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 36, 73 - ExpandableListView.getPackedPositionType(0L))).getMethod("AFInAppEventType", AFa1qSDK.class, String.class, AFd1lSDK.class);
                AFa1uSDK.afRDLog.put(943641481, obj);
            }
            AFe1sSDK<String> AFKeystoreWrapper2 = AFKeystoreWrapper(new AFe1nSDK(aFa1qSDK.registerClient, (byte[]) ((Method) obj).invoke(null, objArr), "POST", Collections.emptyMap(), aFa1qSDK.valueOf()), new AFe1pSDK());
            int i5 = i + 119;
            AFLogger = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 27 / 0;
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

    public final AFe1sSDK<AFc1pSDK> AFKeystoreWrapper(AFc1jSDK aFc1jSDK) {
        int i2 = 2 % 2;
        AFe1sSDK<AFc1pSDK> AFKeystoreWrapper2 = AFKeystoreWrapper(new AFe1nSDK(aFc1jSDK.registerClient, AFa1oSDK.AFInAppEventType((Map<String, ?>) aFc1jSDK.AFInAppEventParameterName()).toString().getBytes(Charset.defaultCharset()), "POST", Collections.emptyMap(), aFc1jSDK.valueOf()), new AFc1qSDK());
        int i3 = i + 79;
        AFLogger = i3 % 128;
        if (i3 % 2 == 0) {
            return AFKeystoreWrapper2;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final AFe1sSDK<Map<String, Object>> AFKeystoreWrapper(String str, String str2) {
        int i2 = 2 % 2;
        String packageName = this.AFInAppEventType.valueOf.AFKeystoreWrapper.getPackageName();
        AFd1sSDK aFd1sSDK = this.AFInAppEventType;
        AFe1sSDK<Map<String, Object>> AFKeystoreWrapper2 = AFKeystoreWrapper(AFe1rSDK.AFInAppEventParameterName(packageName, AFb1kSDK.valueOf(aFd1sSDK.valueOf, aFd1sSDK.AFKeystoreWrapper), str, str2), new AFe1tSDK());
        int i3 = AFLogger + 67;
        i = i3 % 128;
        int i4 = i3 % 2;
        return AFKeystoreWrapper2;
    }

    public final AFe1sSDK<String> AFInAppEventType(AFh1qSDK aFh1qSDK) {
        int i2 = 2 % 2;
        AFe1sSDK<String> AFKeystoreWrapper2 = AFKeystoreWrapper(new AFe1nSDK(aFh1qSDK.registerClient, aFh1qSDK.AFKeystoreWrapper(), "POST", Collections.emptyMap(), true), new AFe1pSDK());
        int i3 = i + 9;
        AFLogger = i3 % 128;
        int i4 = i3 % 2;
        return AFKeystoreWrapper2;
    }

    public final AFe1sSDK<String> AFInAppEventParameterName(String str, Map<String, String> map, String str2, UUID uuid, String str3) {
        int i2 = 2 % 2;
        String obj = uuid.toString();
        HashMap hashMap = new HashMap();
        hashMap.put("ttl", "-1");
        hashMap.put("uuid", obj);
        hashMap.put("data", map);
        hashMap.put("meta", valueOf());
        if (str2 != null) {
            int i3 = i + 117;
            AFLogger = i3 % 128;
            if (i3 % 2 != 0) {
                hashMap.put("brand_domain", str2);
                int i4 = 45 / 0;
            } else {
                hashMap.put("brand_domain", str2);
            }
            int i5 = AFLogger + 65;
            i = i5 % 128;
            int i6 = i5 % 2;
        }
        String jSONObject = AFa1oSDK.AFInAppEventType((Map<String, ?>) hashMap).toString();
        HashMap hashMap2 = new HashMap();
        Object[] objArr = new Object[1];
        a((AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), (char) (Process.myTid() >> 22), "㰯䃧럯僄蘿侇ᾟ\uf303\ue862腉\ud833凟", "\u0000\u0000\u0000\u0000", "왘됽䆵晻", objArr);
        hashMap2.put(((String) objArr[0]).intern(), AFInAppEventParameterName(str3, obj, "POST", jSONObject));
        return values(new AFe1nSDK(new StringBuilder().append(String.format(AFInAppEventParameterName, AppsFlyerLib.getInstance().getHostPrefix(), AFb1vSDK.AFKeystoreWrapper().getHostName())).append("/").append(str).toString(), jSONObject.getBytes(Charset.defaultCharset()), "POST", hashMap2, false), (AFe1iSDK) new AFe1pSDK(), true);
    }

    public final AFe1sSDK<Map<String, String>> AFKeystoreWrapper(String str, String str2, UUID uuid, String str3) {
        int i2 = 2 % 2;
        String obj = uuid.toString();
        String obj2 = new StringBuilder().append(String.format(AFInAppEventParameterName, AppsFlyerLib.getInstance().getHostPrefix(), AFb1vSDK.AFKeystoreWrapper().getHostName())).append("/").append(str).append("?id=").append(str2).toString();
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
        int i3 = AFLogger + 9;
        i = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 39 / 0;
        }
        return AFKeystoreWrapper2;
    }

    public final AFe1sSDK<String> AFKeystoreWrapper(String str) {
        int i2 = 2 % 2;
        AFe1nSDK aFe1nSDK = new AFe1nSDK(str, null, "GET", Collections.emptyMap(), false);
        aFe1nSDK.registerClient = 10000;
        aFe1nSDK.AFKeystoreWrapper = false;
        AFe1sSDK<String> AFKeystoreWrapper2 = AFKeystoreWrapper(aFe1nSDK, new AFe1pSDK());
        int i3 = i + 57;
        AFLogger = i3 % 128;
        int i4 = i3 % 2;
        return AFKeystoreWrapper2;
    }

    public final AFe1wSDK AFKeystoreWrapper(Map<String, Object> map, String str) {
        int i2 = 2 % 2;
        int i3 = AFLogger + 55;
        i = i3 % 128;
        int i4 = i3 % 2;
        Object obj = null;
        try {
            try {
                Object[] objArr = {map, str};
                Object obj2 = AFa1uSDK.afRDLog.get(-1459762567);
                if (obj2 == null) {
                    obj2 = ((Class) AFa1uSDK.values((char) ((ViewConfiguration.getDoubleTapTimeout() >> 16) + 28425), View.resolveSizeAndState(0, 0, 0) + 36, (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 73)).getMethod("AFKeystoreWrapper", Map.class, String.class);
                    AFa1uSDK.afRDLog.put(-1459762567, obj2);
                }
                byte[] bArr = (byte[]) ((Method) obj2).invoke(null, objArr);
                if (bArr == null) {
                    AFLogger.afErrorLogForExcManagerOnly("AFFinalizer: failed to create bytes", new IllegalArgumentException("failed to create bytes from proxyData"));
                    return null;
                }
                AFe1wSDK aFe1wSDK = new AFe1wSDK(this.AFInAppEventType, bArr);
                int i5 = i + 19;
                AFLogger = i5 % 128;
                if (i5 % 2 == 0) {
                    return aFe1wSDK;
                }
                obj.hashCode();
                throw null;
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause != null) {
                    throw cause;
                }
                throw th;
            }
        } catch (Exception e) {
            AFLogger.afErrorLogForExcManagerOnly("AFFinalizer: reflection init failed", e);
            return null;
        }
    }

    private <T> AFe1sSDK<T> AFKeystoreWrapper(AFe1nSDK aFe1nSDK, AFe1iSDK<T> aFe1iSDK) {
        int i2 = 2 % 2;
        int i3 = i + 103;
        AFLogger = i3 % 128;
        int i4 = i3 % 2;
        AFe1sSDK<T> values = values(aFe1nSDK, aFe1iSDK, AFInAppEventType());
        int i5 = AFLogger + 15;
        i = i5 % 128;
        if (i5 % 2 != 0) {
            return values;
        }
        throw null;
    }

    private Map<String, Object> valueOf() {
        int i2 = 2 % 2;
        HashMap hashMap = new HashMap();
        hashMap.put("build_number", "6.14.0");
        hashMap.put("counter", Integer.valueOf(this.AFInAppEventType.AFKeystoreWrapper.valueOf("appsFlyerCount", 0)));
        hashMap.put("model", Build.MODEL);
        Object[] objArr = new Object[1];
        a(1190071419 - View.resolveSizeAndState(0, 0, 0), (char) (TextUtils.lastIndexOf("", '0') + 54887), "Ǌ䴭ᘙᙛ鄏", "\u0000\u0000\u0000\u0000", "筢\uef0c晆ᯖ", objArr);
        hashMap.put(((String) objArr[0]).intern(), Build.BRAND);
        hashMap.put("sdk", Integer.toString(Build.VERSION.SDK_INT));
        AFd1sSDK aFd1sSDK = this.AFInAppEventType;
        hashMap.put("app_version_name", AFb1uSDK.AFInAppEventType(aFd1sSDK.valueOf.AFKeystoreWrapper, aFd1sSDK.valueOf.AFKeystoreWrapper.getPackageName()));
        hashMap.put("app_id", this.AFInAppEventType.valueOf.AFKeystoreWrapper.getPackageName());
        hashMap.put("platformextension", new AFb1hSDK().valueOf());
        int i3 = AFLogger + 19;
        i = i3 % 128;
        if (i3 % 2 != 0) {
            return hashMap;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static String AFInAppEventParameterName(String str, String str2, String... strArr) {
        int i2 = 2 % 2;
        ArrayList arrayList = new ArrayList(Arrays.asList(strArr));
        arrayList.add(1, "v2");
        String AFKeystoreWrapper2 = AFb1lSDK.AFKeystoreWrapper(TextUtils.join("\u2063", (String[]) arrayList.toArray(new String[0])), new StringBuilder().append(str).append(str2).append("v2").toString());
        int i3 = AFLogger + 121;
        i = i3 % 128;
        if (i3 % 2 != 0) {
            return AFKeystoreWrapper2;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private boolean AFInAppEventType() {
        int i2 = 2 % 2;
        if (!this.values.getBoolean(AppsFlyerProperties.HTTP_CACHE, true)) {
            int i3 = i + 85;
            AFLogger = i3 % 128;
            return i3 % 2 == 0;
        }
        int i4 = AFLogger + 83;
        i = i4 % 128;
        int i5 = i4 % 2;
        return false;
    }

    private <T> AFe1sSDK<T> values(AFe1nSDK aFe1nSDK, AFe1iSDK<T> aFe1iSDK, boolean z) {
        int i2 = 2 % 2;
        aFe1nSDK.AFInAppEventParameterName = z;
        AFe1xSDK aFe1xSDK = this.valueOf;
        AFe1sSDK<T> aFe1sSDK = new AFe1sSDK<>(aFe1nSDK, aFe1xSDK.AFInAppEventParameterName, aFe1xSDK.AFInAppEventType, aFe1iSDK);
        int i3 = i + 23;
        AFLogger = i3 % 128;
        int i4 = i3 % 2;
        return aFe1sSDK;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static void a(int i2, char c, String str, String str2, String str3, Object[] objArr) {
        char[] cArr;
        char[] cArr2;
        char[] cArr3;
        int i3 = 2 % 2;
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
            int i6 = $10 + 9;
            $11 = i6 % 128;
            int i7 = i6 % 2;
            cArr2 = str2.toCharArray();
        } else {
            cArr2 = str2;
        }
        char[] cArr5 = cArr2;
        if (str != 0) {
            int i8 = $10 + 5;
            $11 = i8 % 128;
            int i9 = i8 % 2;
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
        cArr6[0] = (char) (cArr6[0] ^ c);
        cArr7[2] = (char) (cArr7[2] + ((char) i2));
        int length3 = cArr3.length;
        char[] cArr8 = new char[length3];
        aFj1eSDK.valueOf = 0;
        while (aFj1eSDK.valueOf < length3) {
            int i10 = $10 + 29;
            $11 = i10 % 128;
            int i11 = i10 % 2;
            int i12 = (aFj1eSDK.valueOf + 2) % 4;
            int i13 = (aFj1eSDK.valueOf + 3) % 4;
            aFj1eSDK.AFKeystoreWrapper = (char) (((cArr6[aFj1eSDK.valueOf % 4] * 32718) + cArr7[i12]) % 65535);
            cArr7[i13] = (char) (((cArr6[i13] * 32718) + cArr7[i12]) / 65535);
            cArr6[i13] = aFj1eSDK.AFKeystoreWrapper;
            cArr8[aFj1eSDK.valueOf] = (char) ((((cArr6[i13] ^ r4[aFj1eSDK.valueOf]) ^ (d ^ (-2499805256334160880L))) ^ ((int) (registerClient ^ (-2499805256334160880L)))) ^ ((char) (unregisterClient ^ (-2499805256334160880L))));
            aFj1eSDK.valueOf++;
        }
        objArr[0] = new String(cArr8);
    }
}
