package com.appsflyer.internal;

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
import androidx.browser.trusted.sharing.ShareTarget;
import com.appsflyer.AppsFlyerLib;
import com.appsflyer.AppsFlyerProperties;
import com.google.android.gms.common.ConnectionResult;
import com.google.firebase.messaging.Constants;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import org.json.JSONObject;

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

    static void AFInAppEventType() {
        afInfoLog = new char[]{'A', 38861, 12155, 51026, 24261, 63024, 36460, 9676, 48428, 21878, 60636, 33852, 55659, 20176, 63038, 7782, 34753};
        afRDLog = -3902864565468424277L;
    }

    static {
        AFInAppEventType();
        AFInAppEventType = "https://%smonitorsdk.%s/remote-debug?app_id=";
        valueOf = "https://%sgcdsdk.%s/install_data/v5.0/";
        values = "https://%sonelink.%s/shortlink-sdk/v2";
        int i = AFLogger$LogLevel + 29;
        afDebugLog = i % 128;
        int i2 = i % 2;
    }

    public AFc1qSDK(AFc1pSDK aFc1pSDK, AFb1cSDK aFb1cSDK, AppsFlyerProperties appsFlyerProperties, AFc1cSDK aFc1cSDK) {
        this.AFKeystoreWrapper = aFc1pSDK;
        this.AFInAppEventParameterName = aFb1cSDK;
        this.afErrorLog = appsFlyerProperties;
        this.AFLogger = aFc1cSDK;
    }

    public final AFc1nSDK<String> values(Map<String, Object> map, String str) {
        int i = 2 % 2;
        try {
            AFc1nSDK<String> values2 = values(new AFb1ySDK(new StringBuilder().append(String.format("https://%sars.%s/api/v2/android/validate_subscription?app_id=", AppsFlyerLib.getInstance().getHostPrefix(), AFa1dSDK.valueOf().getHostName())).append(this.AFInAppEventParameterName.values.AFInAppEventParameterName.getPackageName()).toString(), (byte[]) ((Class) AFa1wSDK.AFKeystoreWrapper((Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 72, 37 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), (char) ((-1) - Process.getGidForName("")))).getMethod("AFInAppEventParameterName", Map.class, String.class).invoke(null, map, str), ShareTarget.METHOD_POST, Collections.emptyMap(), true), new AFc1jSDK());
            int i2 = AFLogger$LogLevel + 111;
            afDebugLog = i2 % 128;
            if (i2 % 2 == 0) {
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

    public final AFc1nSDK<String> AFInAppEventParameterName(Map<String, Object> map, String str) {
        int i = 2 % 2;
        try {
            AFc1nSDK<String> values2 = values(new AFb1ySDK(new StringBuilder().append(String.format("https://%sviap.%s/api/v1/android/validate_purchase?app_id=", AppsFlyerLib.getInstance().getHostPrefix(), AFa1dSDK.valueOf().getHostName())).append(this.AFInAppEventParameterName.values.AFInAppEventParameterName.getPackageName()).toString(), (byte[]) ((Class) AFa1wSDK.AFKeystoreWrapper(73 - Color.alpha(0), 37 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), (char) (KeyEvent.getMaxKeyCode() >> 16))).getMethod("AFInAppEventParameterName", Map.class, String.class).invoke(null, map, str), ShareTarget.METHOD_POST, Collections.emptyMap(), true), new AFc1jSDK());
            int i2 = afDebugLog + 75;
            AFLogger$LogLevel = i2 % 128;
            int i3 = i2 % 2;
            return values2;
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }

    public final AFc1nSDK<String> AFInAppEventParameterName(Map<String, Object> map) {
        int i = 2 % 2;
        AFc1nSDK<String> values2 = values(new AFb1ySDK(new StringBuilder().append(String.format(AFInAppEventType, AppsFlyerLib.getInstance().getHostPrefix(), AFa1dSDK.valueOf().getHostName())).append(this.AFInAppEventParameterName.values.AFInAppEventParameterName.getPackageName()).toString(), new JSONObject(map).toString().getBytes(Charset.defaultCharset()), ShareTarget.METHOD_POST, Collections.emptyMap(), false, false), new AFc1jSDK());
        int i2 = AFLogger$LogLevel + 109;
        afDebugLog = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 18 / 0;
        }
        return values2;
    }

    public final AFc1nSDK<AFf1vSDK> AFInAppEventType(boolean z, boolean z2, String str, int i) {
        String str2;
        String str3;
        int i2 = 2 % 2;
        int i3 = afDebugLog + 95;
        AFLogger$LogLevel = i3 % 128;
        int i4 = i3 % 2;
        AFc1cSDK aFc1cSDK = this.AFLogger;
        Intrinsics.checkNotNullParameter(str, "");
        String str4 = z ? AFc1cSDK.valueOf : AFc1cSDK.AFKeystoreWrapper;
        if (z2) {
            int i5 = afDebugLog + 37;
            AFLogger$LogLevel = i5 % 128;
            int i6 = i5 % 2;
            str2 = "stg";
        } else {
            str2 = "";
        }
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        if (AFc1cSDK.AFInAppEventParameterName()) {
            int i7 = AFLogger$LogLevel + 1;
            afDebugLog = i7 % 128;
            if (i7 % 2 != 0) {
                throw null;
            }
            str3 = (String) aFc1cSDK.AFInAppEventParameterName.getValue();
        } else {
            str3 = "";
        }
        String format = String.format(str4, Arrays.copyOf(new Object[]{str3, str2, aFc1cSDK.AFInAppEventType(), str}, 4));
        Intrinsics.checkNotNullExpressionValue(format, "");
        AFb1ySDK aFb1ySDK = new AFb1ySDK(format, ShareTarget.METHOD_GET);
        aFb1ySDK.afDebugLog = ConnectionResult.DRIVE_EXTERNAL_STORAGE_REQUIRED;
        return values(aFb1ySDK, new AFc1kSDK());
    }

    public final AFc1nSDK<String> AFKeystoreWrapper(AFa1qSDK aFa1qSDK, String str, AFb1bSDK aFb1bSDK) {
        int i = 2 % 2;
        try {
            Object obj = null;
            AFc1nSDK<String> values2 = values(new AFb1ySDK(aFa1qSDK.afInfoLog, (byte[]) ((Class) AFa1wSDK.AFKeystoreWrapper(74 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), 36 - TextUtils.indexOf((CharSequence) "", '0'), (char) (ViewConfiguration.getScrollDefaultDelay() >> 16))).getMethod("AFKeystoreWrapper", AFa1qSDK.class, String.class, AFb1bSDK.class).invoke(null, aFa1qSDK, str, aFb1bSDK), ShareTarget.METHOD_POST, Collections.emptyMap(), aFa1qSDK.AFKeystoreWrapper()), new AFc1jSDK());
            int i2 = afDebugLog + 31;
            AFLogger$LogLevel = i2 % 128;
            if (i2 % 2 != 0) {
                return values2;
            }
            super.hashCode();
            throw null;
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }

    public final AFc1nSDK<Map<String, Object>> AFInAppEventType(String str, String str2) {
        int i = 2 % 2;
        String packageName = this.AFInAppEventParameterName.values.AFInAppEventParameterName.getPackageName();
        AFb1cSDK aFb1cSDK = this.AFInAppEventParameterName;
        AFc1nSDK<Map<String, Object>> values2 = values(AFc1oSDK.AFKeystoreWrapper(packageName, AFa1aSDK.AFInAppEventParameterName(aFb1cSDK.values, aFb1cSDK.AFInAppEventType), str, str2), new AFc1iSDK());
        int i2 = AFLogger$LogLevel + 117;
        afDebugLog = i2 % 128;
        int i3 = i2 % 2;
        return values2;
    }

    public final AFc1nSDK<String> values(AFe1eSDK aFe1eSDK) {
        int i = 2 % 2;
        AFc1nSDK<String> values2 = values(new AFb1ySDK(aFe1eSDK.afInfoLog, aFe1eSDK.valueOf(), ShareTarget.METHOD_POST, Collections.emptyMap(), true), new AFc1jSDK());
        int i2 = afDebugLog + 63;
        AFLogger$LogLevel = i2 % 128;
        if (i2 % 2 != 0) {
            return values2;
        }
        Object obj = null;
        super.hashCode();
        throw null;
    }

    public final AFc1nSDK<String> valueOf(String str, Map<String, String> map, String str2, UUID uuid, String str3) {
        int i = 2 % 2;
        String obj = uuid.toString();
        HashMap hashMap = new HashMap();
        hashMap.put("ttl", "-1");
        hashMap.put("uuid", obj);
        hashMap.put(Constants.ScionAnalytics.MessageType.DATA_MESSAGE, map);
        hashMap.put("meta", AFKeystoreWrapper());
        if (str2 != null) {
            int i2 = AFLogger$LogLevel + 1;
            afDebugLog = i2 % 128;
            if (i2 % 2 != 0) {
                hashMap.put("brand_domain", str2);
                throw null;
            }
            hashMap.put("brand_domain", str2);
            int i3 = AFLogger$LogLevel + 111;
            afDebugLog = i3 % 128;
            int i4 = i3 % 2;
        }
        String jSONObject = AFa1rSDK.values(hashMap).toString();
        HashMap hashMap2 = new HashMap();
        Object[] objArr = new Object[1];
        valueOf((char) View.resolveSize(0, 0), (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 11, Color.blue(0), objArr);
        hashMap2.put(((String) objArr[0]).intern(), values(str3, obj, ShareTarget.METHOD_POST, jSONObject));
        return AFKeystoreWrapper(new AFb1ySDK(new StringBuilder().append(String.format(values, AppsFlyerLib.getInstance().getHostPrefix(), AFa1dSDK.valueOf().getHostName())).append("/").append(str).toString(), jSONObject.getBytes(Charset.defaultCharset()), ShareTarget.METHOD_POST, hashMap2, false), (AFc1fSDK) new AFc1jSDK(), true);
    }

    public final AFc1nSDK<Map<String, String>> AFKeystoreWrapper(String str, String str2, UUID uuid, String str3) {
        int i = 2 % 2;
        String obj = uuid.toString();
        String obj2 = new StringBuilder().append(String.format(values, AppsFlyerLib.getInstance().getHostPrefix(), AFa1dSDK.valueOf().getHostName())).append("/").append(str).append("?id=").append(str2).toString();
        Map<String, Object> AFKeystoreWrapper = AFKeystoreWrapper();
        String valueOf2 = String.valueOf(AFKeystoreWrapper.get("build_number"));
        HashMap hashMap = new HashMap();
        hashMap.put("Af-UUID", uuid.toString());
        hashMap.put("Af-Meta-Sdk-Ver", valueOf2);
        hashMap.put("Af-Meta-Counter", String.valueOf(AFKeystoreWrapper.get("counter")));
        hashMap.put("Af-Meta-Model", String.valueOf(AFKeystoreWrapper.get("model")));
        hashMap.put("Af-Meta-Platform", String.valueOf(AFKeystoreWrapper.get("platformextension")));
        hashMap.put("Af-Meta-System-Version", String.valueOf(AFKeystoreWrapper.get("sdk")));
        Object[] objArr = new Object[1];
        valueOf((char) (TextUtils.indexOf((CharSequence) "", '0') + 1), (Process.myTid() >> 22) + 12, ViewConfiguration.getJumpTapTimeout() >> 16, objArr);
        hashMap.put(((String) objArr[0]).intern(), values(str3, obj, ShareTarget.METHOD_GET, obj, str, str2, valueOf2));
        AFc1nSDK<Map<String, String>> values2 = values(new AFb1ySDK(obj2, null, ShareTarget.METHOD_GET, hashMap, false), new AFc1eSDK());
        int i2 = AFLogger$LogLevel + 5;
        afDebugLog = i2 % 128;
        int i3 = i2 % 2;
        return values2;
    }

    public final AFc1nSDK<String> values(String str) {
        int i = 2 % 2;
        AFb1ySDK aFb1ySDK = new AFb1ySDK(str, null, ShareTarget.METHOD_GET, Collections.emptyMap(), false);
        aFb1ySDK.afDebugLog = 10000;
        aFb1ySDK.AFKeystoreWrapper = false;
        AFc1nSDK<String> values2 = values(aFb1ySDK, new AFc1jSDK());
        int i2 = afDebugLog + 119;
        AFLogger$LogLevel = i2 % 128;
        if (i2 % 2 != 0) {
            return values2;
        }
        throw null;
    }

    private <T> AFc1nSDK<T> values(AFb1ySDK aFb1ySDK, AFc1fSDK<T> aFc1fSDK) {
        int i = 2 % 2;
        int i2 = AFLogger$LogLevel + 29;
        afDebugLog = i2 % 128;
        int i3 = i2 % 2;
        AFc1nSDK<T> AFKeystoreWrapper = AFKeystoreWrapper(aFb1ySDK, aFc1fSDK, valueOf());
        int i4 = AFLogger$LogLevel + 107;
        afDebugLog = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 22 / 0;
        }
        return AFKeystoreWrapper;
    }

    private Map<String, Object> AFKeystoreWrapper() {
        int i = 2 % 2;
        HashMap hashMap = new HashMap();
        hashMap.put("build_number", "6.12.1");
        hashMap.put("counter", Integer.valueOf(this.AFInAppEventParameterName.AFInAppEventType.AFInAppEventType("appsFlyerCount", 0)));
        hashMap.put("model", Build.MODEL);
        Object[] objArr = new Object[1];
        valueOf((char) (55561 - (ViewConfiguration.getScrollBarFadeDuration() >> 16)), (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 5, (ViewConfiguration.getTouchSlop() >> 8) + 12, objArr);
        hashMap.put(((String) objArr[0]).intern(), Build.BRAND);
        hashMap.put("sdk", Integer.toString(Build.VERSION.SDK_INT));
        AFb1cSDK aFb1cSDK = this.AFInAppEventParameterName;
        hashMap.put("app_version_name", AFa1cSDK.AFInAppEventParameterName(aFb1cSDK.values.AFInAppEventParameterName, aFb1cSDK.values.AFInAppEventParameterName.getPackageName()));
        hashMap.put("app_id", this.AFInAppEventParameterName.values.AFInAppEventParameterName.getPackageName());
        hashMap.put("platformextension", new AFb1xSDK().values());
        int i2 = afDebugLog + 103;
        AFLogger$LogLevel = i2 % 128;
        int i3 = i2 % 2;
        return hashMap;
    }

    private static String values(String str, String str2, String... strArr) {
        int i = 2 % 2;
        ArrayList arrayList = new ArrayList(Arrays.asList(strArr));
        arrayList.add(1, "v2");
        String AFKeystoreWrapper = AFb1zSDK.AFKeystoreWrapper(AFb1zSDK.values((String[]) arrayList.toArray(new String[0])), new StringBuilder().append(str).append(str2).append("v2").toString());
        int i2 = AFLogger$LogLevel + 123;
        afDebugLog = i2 % 128;
        if (i2 % 2 == 0) {
            return AFKeystoreWrapper;
        }
        throw null;
    }

    private boolean valueOf() {
        int i = 2 % 2;
        int i2 = AFLogger$LogLevel + 21;
        afDebugLog = i2 % 128;
        int i3 = i2 % 2;
        AppsFlyerProperties appsFlyerProperties = this.afErrorLog;
        if (i3 == 0 ? appsFlyerProperties.getBoolean(AppsFlyerProperties.HTTP_CACHE, true) : appsFlyerProperties.getBoolean(AppsFlyerProperties.HTTP_CACHE, false)) {
            return false;
        }
        int i4 = afDebugLog + 97;
        AFLogger$LogLevel = i4 % 128;
        if (i4 % 2 != 0) {
            return true;
        }
        throw null;
    }

    private <T> AFc1nSDK<T> AFKeystoreWrapper(AFb1ySDK aFb1ySDK, AFc1fSDK<T> aFc1fSDK, boolean z) {
        int i = 2 % 2;
        aFb1ySDK.valueOf = z;
        AFc1pSDK aFc1pSDK = this.AFKeystoreWrapper;
        AFc1nSDK<T> aFc1nSDK = new AFc1nSDK<>(aFb1ySDK, aFc1pSDK.valueOf, aFc1pSDK.values, aFc1fSDK);
        int i2 = afDebugLog + 27;
        AFLogger$LogLevel = i2 % 128;
        if (i2 % 2 != 0) {
            return aFc1nSDK;
        }
        Object obj = null;
        super.hashCode();
        throw null;
    }

    private static void valueOf(char c, int i, int i2, Object[] objArr) {
        String str;
        synchronized (AFg1iSDK.valueOf) {
            char[] cArr = new char[i];
            AFg1iSDK.values = 0;
            while (AFg1iSDK.values < i) {
                cArr[AFg1iSDK.values] = (char) ((afInfoLog[AFg1iSDK.values + i2] ^ (AFg1iSDK.values * afRDLog)) ^ c);
                AFg1iSDK.values++;
            }
            str = new String(cArr);
        }
        objArr[0] = str;
    }
}
