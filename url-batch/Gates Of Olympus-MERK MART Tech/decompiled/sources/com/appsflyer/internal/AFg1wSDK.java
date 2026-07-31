package com.appsflyer.internal;

import android.app.UiModeManager;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Environment;
import android.os.StatFs;
import android.os.SystemClock;
import android.provider.Settings;
import android.view.KeyEvent;
import android.view.View;
import androidx.appcompat.app.AppCompatDelegate;
import androidx.compose.runtime.ComposerImplKt;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import coil3.disk.DiskLruCache;
import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerProperties;
import com.appsflyer.internal.AFd1ySDK;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Properties;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class AFg1wSDK implements AFg1sSDK {
    private static int $10 = 0;
    private static int $11 = 1;
    private static int AFVersionDeclaration = 0;
    private static char afDebugLog = 19447;
    private static char afErrorLog = 23261;
    private static int afErrorLogForExcManagerOnly = 1;
    private static char afRDLog = 57771;
    private static char afWarnLog = 63732;
    private final AFa1cSDK AFInAppEventParameterName;
    private final AFh1bSDK AFInAppEventType;
    private final Context AFKeystoreWrapper;
    private final AFd1pSDK AFLogger;
    private final Lazy afInfoLog;
    private final Lazy afVerboseLog;
    private final AFg1gSDK d;
    private final AFd1xSDK e;
    private final AFd1qSDK force;
    private final AFf1aSDK i;
    private final AFh1lSDK registerClient;
    private final AFg1xSDK unregisterClient;
    private final AFb1aSDK v;
    private final AFd1ySDK valueOf;
    private final AFi1lSDK values;
    private final AFd1nSDK w;

    public AFg1wSDK(Context context, AFh1bSDK aFh1bSDK, AFd1ySDK aFd1ySDK, AFi1lSDK aFi1lSDK, AFa1cSDK aFa1cSDK, AFg1gSDK aFg1gSDK, AFd1xSDK aFd1xSDK, AFd1pSDK aFd1pSDK, AFh1lSDK aFh1lSDK, AFg1xSDK aFg1xSDK, AFb1aSDK aFb1aSDK, AFd1nSDK aFd1nSDK, AFf1aSDK aFf1aSDK, AFd1qSDK aFd1qSDK) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(aFh1bSDK, "");
        Intrinsics.checkNotNullParameter(aFd1ySDK, "");
        Intrinsics.checkNotNullParameter(aFi1lSDK, "");
        Intrinsics.checkNotNullParameter(aFa1cSDK, "");
        Intrinsics.checkNotNullParameter(aFg1gSDK, "");
        Intrinsics.checkNotNullParameter(aFd1xSDK, "");
        Intrinsics.checkNotNullParameter(aFd1pSDK, "");
        Intrinsics.checkNotNullParameter(aFh1lSDK, "");
        Intrinsics.checkNotNullParameter(aFg1xSDK, "");
        Intrinsics.checkNotNullParameter(aFb1aSDK, "");
        Intrinsics.checkNotNullParameter(aFd1nSDK, "");
        Intrinsics.checkNotNullParameter(aFf1aSDK, "");
        Intrinsics.checkNotNullParameter(aFd1qSDK, "");
        this.AFKeystoreWrapper = context;
        this.AFInAppEventType = aFh1bSDK;
        this.valueOf = aFd1ySDK;
        this.values = aFi1lSDK;
        this.AFInAppEventParameterName = aFa1cSDK;
        this.d = aFg1gSDK;
        this.e = aFd1xSDK;
        this.AFLogger = aFd1pSDK;
        this.registerClient = aFh1lSDK;
        this.unregisterClient = aFg1xSDK;
        this.v = aFb1aSDK;
        this.w = aFd1nSDK;
        this.i = aFf1aSDK;
        this.force = aFd1qSDK;
        this.afInfoLog = LazyKt.lazy(new Function0<AppsFlyerProperties>() { // from class: com.appsflyer.internal.AFg1wSDK.1
            @Override // kotlin.jvm.functions.Function0
            /* renamed from: AFInAppEventParameterName, reason: merged with bridge method [inline-methods] */
            public final AppsFlyerProperties invoke() {
                return AppsFlyerProperties.getInstance();
            }
        });
        this.afVerboseLog = LazyKt.lazy(new Function0<SimpleDateFormat>() { // from class: com.appsflyer.internal.AFg1wSDK.2
            @Override // kotlin.jvm.functions.Function0
            /* renamed from: AFInAppEventType, reason: merged with bridge method [inline-methods] */
            public final SimpleDateFormat invoke() {
                return new SimpleDateFormat("yyyy-MM-dd_HHmmssZ", Locale.US);
            }
        });
    }

    private final AppsFlyerProperties AFInAppEventType() {
        int i = 2 % 2;
        int i2 = AFVersionDeclaration + 111;
        afErrorLogForExcManagerOnly = i2 % 128;
        int i3 = i2 % 2;
        AppsFlyerProperties appsFlyerProperties = (AppsFlyerProperties) this.afInfoLog.getValue();
        int i4 = afErrorLogForExcManagerOnly + 75;
        AFVersionDeclaration = i4 % 128;
        int i5 = i4 % 2;
        return appsFlyerProperties;
    }

    private final SimpleDateFormat AFInAppEventParameterName() {
        int i = 2 % 2;
        int i2 = afErrorLogForExcManagerOnly + 5;
        AFVersionDeclaration = i2 % 128;
        int i3 = i2 % 2;
        SimpleDateFormat simpleDateFormat = (SimpleDateFormat) this.afVerboseLog.getValue();
        if (i3 == 0) {
            return simpleDateFormat;
        }
        throw null;
    }

    @Override // com.appsflyer.internal.AFg1sSDK
    public final void valueOf(AFa1rSDK aFa1rSDK) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(aFa1rSDK, "");
        Map<String, Object> AFKeystoreWrapper = aFa1rSDK.AFKeystoreWrapper();
        if (aFa1rSDK.AFInAppEventParameterName()) {
            int i2 = AFVersionDeclaration + 107;
            afErrorLogForExcManagerOnly = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.checkNotNullExpressionValue(AFKeystoreWrapper, "");
            AFInAppEventParameterName(AFKeystoreWrapper, aFa1rSDK.d, this.force.AFKeystoreWrapper, this.force.valueOf);
            int i4 = AFVersionDeclaration + 3;
            afErrorLogForExcManagerOnly = i4 % 128;
            int i5 = i4 % 2;
        } else {
            Intrinsics.checkNotNullExpressionValue(AFKeystoreWrapper, "");
            String str = aFa1rSDK.e;
            Intrinsics.checkNotNullExpressionValue(str, "");
            values(AFKeystoreWrapper, str);
        }
        afLogForce(AFKeystoreWrapper);
        afRDLog(AFKeystoreWrapper);
        afDebugLog(AFKeystoreWrapper);
        afVerboseLog(AFKeystoreWrapper);
        afErrorLogForExcManagerOnly(AFKeystoreWrapper);
        AFKeystoreWrapper(AFKeystoreWrapper, aFa1rSDK.AFInAppEventParameterName());
        AFVersionDeclaration(AFKeystoreWrapper);
        getLevel(AFKeystoreWrapper);
        AFInAppEventType(AFKeystoreWrapper, aFa1rSDK);
        AFKeystoreWrapper.put("af_events_api", DiskLruCache.VERSION);
    }

    @Override // com.appsflyer.internal.AFg1sSDK
    public final void values(Map<String, Object> map, boolean z, Function0<String> function0) {
        int i = 2 % 2;
        int i2 = AFVersionDeclaration + 1;
        afErrorLogForExcManagerOnly = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(map, "");
        Intrinsics.checkNotNullParameter(function0, "");
        AFInAppEventParameterName(map);
        AFLogger(map);
        afWarnLog(map);
        AFInAppEventParameterName(map, z);
        values(map, function0);
        int i4 = AFVersionDeclaration + 63;
        afErrorLogForExcManagerOnly = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private final void AFInAppEventParameterName(Map<String, Object> map) {
        int i = 2 % 2;
        try {
            long j = this.AFKeystoreWrapper.getPackageManager().getPackageInfo(this.AFKeystoreWrapper.getPackageName(), 0).firstInstallTime;
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd_HHmmssZ", Locale.US);
            simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
            map.put("installDate", simpleDateFormat.format(new Date(j)));
            int i2 = afErrorLogForExcManagerOnly + 75;
            AFVersionDeclaration = i2 % 128;
            int i3 = i2 % 2;
        } catch (Exception e) {
            AFLogger.afErrorLog("Exception while collecting install date. ", e);
        }
    }

    private final void AFLogger(Map<String, Object> map) {
        int i = 2 % 2;
        try {
            PackageInfo packageInfo = this.AFKeystoreWrapper.getPackageManager().getPackageInfo(this.AFKeystoreWrapper.getPackageName(), 0);
            if (packageInfo.versionCode > this.e.AFKeystoreWrapper("versionCode", 0)) {
                int i2 = afErrorLogForExcManagerOnly + 13;
                AFVersionDeclaration = i2 % 128;
                if (i2 % 2 != 0) {
                    this.e.AFInAppEventParameterName("versionCode", packageInfo.versionCode);
                    int i3 = 66 / 0;
                } else {
                    this.e.AFInAppEventParameterName("versionCode", packageInfo.versionCode);
                }
            }
            map.put("app_version_code", String.valueOf(packageInfo.versionCode));
            AFd1pSDK aFd1pSDK = this.AFLogger;
            map.put("app_version_name", AFb1rSDK.AFInAppEventType(aFd1pSDK.AFInAppEventParameterName.AFKeystoreWrapper, aFd1pSDK.AFInAppEventParameterName.AFKeystoreWrapper.getPackageName()));
            map.put("targetSDKver", Integer.valueOf(this.AFLogger.AFInAppEventParameterName.AFKeystoreWrapper.getApplicationInfo().targetSdkVersion));
            long j = packageInfo.firstInstallTime;
            long j2 = packageInfo.lastUpdateTime;
            map.put("date1", AFInAppEventParameterName().format(new Date(j)));
            map.put("date2", AFInAppEventParameterName().format(new Date(j2)));
            Object[] objArr = new Object[1];
            a("螐ꇪᙫ\u2b75彔瓥䐹犏Ꟁ⣅璾떣馼駧虔挶", View.MeasureSpec.getMode(0) + 15, objArr);
            String intern = ((String) objArr[0]).intern();
            SimpleDateFormat AFInAppEventParameterName = AFInAppEventParameterName();
            Intrinsics.checkNotNullExpressionValue(AFInAppEventParameterName, "");
            map.put(intern, AFInAppEventType(AFInAppEventParameterName));
            int i4 = afErrorLogForExcManagerOnly + ComposerImplKt.nodeKey;
            AFVersionDeclaration = i4 % 128;
            int i5 = i4 % 2;
        } catch (Throwable th) {
            AFLogger.afErrorLog("Exception while collecting app version data ", th, true);
        }
    }

    @Override // com.appsflyer.internal.AFg1sSDK
    public final void AFInAppEventParameterName(AFa1rSDK aFa1rSDK) {
        int i = 2 % 2;
        int i2 = afErrorLogForExcManagerOnly + 113;
        AFVersionDeclaration = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(aFa1rSDK, "");
        Map<String, Object> AFKeystoreWrapper = aFa1rSDK.AFKeystoreWrapper();
        Intrinsics.checkNotNullExpressionValue(AFKeystoreWrapper, "");
        AFInAppEventType(AFKeystoreWrapper, aFa1rSDK.AFInAppEventParameterName());
        AFKeystoreWrapper(aFa1rSDK);
        e(AFKeystoreWrapper);
        afErrorLog(AFKeystoreWrapper);
        AFKeystoreWrapper(AFKeystoreWrapper);
        AFKeystoreWrapper(AFKeystoreWrapper, this.force.values);
        AFLogger$LogLevel(AFKeystoreWrapper);
        AFKeystoreWrapper.put("cell", MapsKt.mapOf(TuplesKt.to("mcc", Integer.valueOf(this.AFKeystoreWrapper.getResources().getConfiguration().mcc)), TuplesKt.to("mnc", Integer.valueOf(this.AFKeystoreWrapper.getResources().getConfiguration().mnc))));
        AFKeystoreWrapper.put("sig", values());
        AFKeystoreWrapper.put("last_boot_time", Long.valueOf(valueOf()));
        AFKeystoreWrapper.put("disk", unregisterClient());
        int i4 = AFVersionDeclaration + 23;
        afErrorLogForExcManagerOnly = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private final void AFKeystoreWrapper(AFa1rSDK aFa1rSDK) {
        int i = 2 % 2;
        int i2 = AFVersionDeclaration + 1;
        afErrorLogForExcManagerOnly = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            if (!aFa1rSDK.AFInAppEventParameterName()) {
                try {
                    aFa1rSDK.AFKeystoreWrapper().putAll(this.values.AFKeystoreWrapper());
                    return;
                } catch (Exception e) {
                    AFLogger.afErrorLogForExcManagerOnly("error while getting sensors data", e);
                    AFLogger.afRDLog(new StringBuilder("Unexpected exception from AFSensorManager: ").append(e.getMessage()).toString());
                }
            }
            int i3 = AFVersionDeclaration + 71;
            afErrorLogForExcManagerOnly = i3 % 128;
            if (i3 % 2 != 0) {
                return;
            }
            obj.hashCode();
            throw null;
        }
        aFa1rSDK.AFInAppEventParameterName();
        throw null;
    }

    @Override // com.appsflyer.internal.AFg1sSDK
    public final void valueOf(Map<String, Object> map) {
        String[] strArr;
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(map, "");
        String string = AFInAppEventType().getString(AppsFlyerProperties.APP_ID);
        if (string != null) {
            int i2 = afErrorLogForExcManagerOnly + 5;
            AFVersionDeclaration = i2 % 128;
            int i3 = i2 % 2;
            map.put(AppsFlyerProperties.APP_ID, string);
        }
        String string2 = AFInAppEventType().getString(AppsFlyerProperties.CURRENCY_CODE);
        if (string2 != null) {
            if (string2.length() != 3) {
                String obj = new StringBuilder("WARNING: currency code should be 3 characters!!! '").append(string2).append("' is not a legal value.").toString();
                Intrinsics.checkNotNullExpressionValue(obj, "");
                AFLogger.afWarnLog(obj);
            }
            map.put(FirebaseAnalytics.Param.CURRENCY, string2);
        }
        String string3 = AFInAppEventType().getString(AppsFlyerProperties.IS_UPDATE);
        if (string3 != null) {
            map.put("isUpdate", string3);
        }
        String string4 = AFInAppEventType().getString(AppsFlyerProperties.ADDITIONAL_CUSTOM_DATA);
        if (string4 != null) {
            map.put("customData", string4);
        } else {
            int i4 = AFVersionDeclaration + 79;
            afErrorLogForExcManagerOnly = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 5 % 3;
            }
        }
        String string5 = AFInAppEventType().getString(AppsFlyerProperties.APP_USER_ID);
        if (string5 != null) {
            map.put("appUserId", string5);
        }
        String string6 = AFInAppEventType().getString(AppsFlyerProperties.USER_EMAILS);
        if (string6 != null) {
            int i6 = AFVersionDeclaration + 103;
            afErrorLogForExcManagerOnly = i6 % 128;
            if (i6 % 2 == 0) {
                map.put("user_emails", string6);
                throw null;
            }
            map.put("user_emails", string6);
        }
        AFd1zSDK aFd1zSDK = this.force.AFInAppEventType;
        if (aFd1zSDK == null || (strArr = aFd1zSDK.AFInAppEventType) == null) {
            return;
        }
        map.put("sharing_filter", strArr);
    }

    private String values() throws CertificateException, NoSuchAlgorithmException, PackageManager.NameNotFoundException {
        int i = 2 % 2;
        int i2 = AFVersionDeclaration + 65;
        afErrorLogForExcManagerOnly = i2 % 128;
        int i3 = i2 % 2;
        String valueOf = AFb1rSDK.valueOf(this.AFKeystoreWrapper.getApplicationContext().getPackageManager(), this.AFKeystoreWrapper.getApplicationContext().getPackageName());
        int i4 = afErrorLogForExcManagerOnly + 23;
        AFVersionDeclaration = i4 % 128;
        if (i4 % 2 == 0) {
            return valueOf;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static long valueOf() {
        int i = 2 % 2;
        int i2 = afErrorLogForExcManagerOnly + 95;
        AFVersionDeclaration = i2 % 128;
        int i3 = i2 % 2;
        long currentTimeMillis = System.currentTimeMillis() - SystemClock.elapsedRealtime();
        int i4 = AFVersionDeclaration + 35;
        afErrorLogForExcManagerOnly = i4 % 128;
        int i5 = i4 % 2;
        return currentTimeMillis;
    }

    @Override // com.appsflyer.internal.AFg1sSDK
    public final long AFKeystoreWrapper() {
        int i = 2 % 2;
        int i2 = AFVersionDeclaration + 83;
        afErrorLogForExcManagerOnly = i2 % 128;
        int i3 = i2 % 2;
        long currentTimeMillis = System.currentTimeMillis();
        int i4 = afErrorLogForExcManagerOnly + 103;
        AFVersionDeclaration = i4 % 128;
        if (i4 % 2 == 0) {
            return currentTimeMillis;
        }
        throw null;
    }

    private static String unregisterClient() {
        long availableBlocksLong;
        long blockCountLong;
        int i = 2 % 2;
        StatFs statFs = new StatFs(Environment.getDataDirectory().getAbsolutePath());
        int i2 = AFVersionDeclaration + 73;
        afErrorLogForExcManagerOnly = i2 % 128;
        if (i2 % 2 == 0) {
            long blockSizeLong = statFs.getBlockSizeLong();
            availableBlocksLong = statFs.getAvailableBlocksLong() ^ blockSizeLong;
            blockCountLong = statFs.getBlockCountLong() & blockSizeLong;
        } else {
            long blockSizeLong2 = statFs.getBlockSizeLong();
            availableBlocksLong = statFs.getAvailableBlocksLong() * blockSizeLong2;
            blockCountLong = statFs.getBlockCountLong() * blockSizeLong2;
        }
        double pow = Math.pow(2.0d, 20.0d);
        return new StringBuilder().append((long) (availableBlocksLong / pow)).append('/').append((long) (blockCountLong / pow)).toString();
    }

    private void AFKeystoreWrapper(Map<String, Object> map, boolean z) {
        int i = 2 % 2;
        int i2 = AFVersionDeclaration + 83;
        afErrorLogForExcManagerOnly = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(map, "");
        map.put("platformextension", this.v.AFInAppEventParameterName());
        if (z) {
            int i4 = AFVersionDeclaration + 31;
            afErrorLogForExcManagerOnly = i4 % 128;
            int i5 = i4 % 2;
            map.put("platform_extension_v2", this.AFInAppEventType.AFKeystoreWrapper());
            int i6 = afErrorLogForExcManagerOnly + 87;
            AFVersionDeclaration = i6 % 128;
            int i7 = i6 % 2;
        }
        int i8 = afErrorLogForExcManagerOnly + 27;
        AFVersionDeclaration = i8 % 128;
        int i9 = i8 % 2;
    }

    private void AFInAppEventType(Map<String, Object> map, boolean z) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(map, "");
        HashMap hashMap = new HashMap();
        hashMap.put("cpu_abi", AFInAppEventParameterName("ro.product.cpu.abi"));
        hashMap.put("cpu_abi2", AFInAppEventParameterName("ro.product.cpu.abi2"));
        hashMap.put("arch", AFInAppEventParameterName("os.arch"));
        hashMap.put("build_display_id", AFInAppEventParameterName("ro.build.display.id"));
        if (z) {
            int i2 = AFVersionDeclaration + 1;
            afErrorLogForExcManagerOnly = i2 % 128;
            int i3 = i2 % 2;
            d(hashMap);
            if (this.AFLogger.valueOf.AFKeystoreWrapper("appsFlyerCount", 0) <= 2) {
                int i4 = AFVersionDeclaration + 71;
                afErrorLogForExcManagerOnly = i4 % 128;
                if (i4 % 2 == 0) {
                    hashMap.putAll(this.values.AFInAppEventType());
                    throw null;
                }
                hashMap.putAll(this.values.AFInAppEventType());
            }
        }
        hashMap.put("dim", this.AFInAppEventParameterName.values(this.AFKeystoreWrapper));
        map.put("deviceData", hashMap);
        int i5 = AFVersionDeclaration + 47;
        afErrorLogForExcManagerOnly = i5 % 128;
        int i6 = i5 % 2;
    }

    @Override // com.appsflyer.internal.AFg1sSDK
    public final void AFKeystoreWrapper(Map<String, Object> map) {
        int i = 2 % 2;
        int i2 = AFVersionDeclaration + 3;
        afErrorLogForExcManagerOnly = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(map, "");
        AFh1hSDK aFh1hSDK = this.registerClient.values;
        AFh1mSDK AFKeystoreWrapper = aFh1hSDK != null ? aFh1hSDK.AFKeystoreWrapper() : null;
        if (AFKeystoreWrapper != null) {
            map.put("network", AFKeystoreWrapper.AFInAppEventParameterName);
            map.put("ivc", Boolean.valueOf(AFKeystoreWrapper.valueOf()));
            if (AFInAppEventType().getBoolean(AppsFlyerProperties.DISABLE_NETWORK_DATA, false)) {
                return;
            }
            int i4 = afErrorLogForExcManagerOnly + 123;
            AFVersionDeclaration = i4 % 128;
            int i5 = i4 % 2;
            String str = AFKeystoreWrapper.AFKeystoreWrapper;
            if (str != null) {
                map.put("operator", str);
            }
            String str2 = AFKeystoreWrapper.values;
            if (str2 != null) {
                int i6 = AFVersionDeclaration + 59;
                afErrorLogForExcManagerOnly = i6 % 128;
                if (i6 % 2 != 0) {
                    map.put("carrier", str2);
                } else {
                    map.put("carrier", str2);
                    int i7 = 43 / 0;
                }
            }
        }
    }

    @Override // com.appsflyer.internal.AFg1sSDK
    public final void AFInAppEventType(Map<String, Object> map) {
        int i = 2 % 2;
        boolean z = true;
        int i2 = afErrorLogForExcManagerOnly + 1;
        AFVersionDeclaration = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(map, "");
            AFInAppEventType().getString("advertiserId");
            throw null;
        }
        Intrinsics.checkNotNullParameter(map, "");
        if (AFInAppEventType().getString("advertiserId") == null) {
            AFb1qSDK.values(this.AFKeystoreWrapper, map);
            if (AFInAppEventType().getString("advertiserId") != null) {
                int i3 = AFVersionDeclaration + 121;
                afErrorLogForExcManagerOnly = i3 % 128;
                if (i3 % 2 == 0) {
                    int i4 = 3 / 4;
                }
            } else {
                z = false;
            }
            map.put("GAID_retry", String.valueOf(z));
        }
        int i5 = AFVersionDeclaration + AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR_OVERLAY;
        afErrorLogForExcManagerOnly = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 49 / 0;
        }
    }

    @Override // com.appsflyer.internal.AFg1sSDK
    public final void valueOf(Map<String, Object> map, int i, int i2) {
        boolean z;
        int i3 = 2 % 2;
        Intrinsics.checkNotNullParameter(map, "");
        map.put("counter", String.valueOf(i));
        map.put("iaecounter", String.valueOf(i2));
        if (AFLogger()) {
            int i4 = AFVersionDeclaration + 39;
            afErrorLogForExcManagerOnly = i4 % 128;
            int i5 = i4 % 2;
            z = false;
        } else {
            int i6 = afErrorLogForExcManagerOnly;
            int i7 = i6 + 11;
            AFVersionDeclaration = i7 % 128;
            int i8 = i7 % 2;
            int i9 = i6 + 73;
            AFVersionDeclaration = i9 % 128;
            int i10 = i9 % 2;
            z = true;
        }
        map.put("isFirstCall", String.valueOf(z));
    }

    @Override // com.appsflyer.internal.AFg1sSDK
    public final void values(Map<String, Object> map) {
        int i = 2 % 2;
        int i2 = AFVersionDeclaration + 95;
        afErrorLogForExcManagerOnly = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(map, "");
            String str = this.force.AFInAppEventParameterName;
            obj.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(map, "");
        if (this.force.AFInAppEventParameterName != null) {
            if (map.get("af_deeplink") == null) {
                JSONObject jSONObject = new JSONObject(this.force.AFInAppEventParameterName);
                jSONObject.put("isPush", "true");
                map.put("af_deeplink", jSONObject.toString());
                int i3 = afErrorLogForExcManagerOnly + 33;
                AFVersionDeclaration = i3 % 128;
                if (i3 % 2 != 0) {
                    int i4 = 4 % 2;
                    return;
                }
                return;
            }
            int i5 = AFVersionDeclaration + 81;
            afErrorLogForExcManagerOnly = i5 % 128;
            if (i5 % 2 == 0) {
                AFLogger.afDebugLog("Skip 'af' payload as deeplink was found by path");
                obj.hashCode();
                throw null;
            }
            AFLogger.afDebugLog("Skip 'af' payload as deeplink was found by path");
            int i6 = AFVersionDeclaration + 49;
            afErrorLogForExcManagerOnly = i6 % 128;
            if (i6 % 2 != 0) {
                return;
            }
            obj.hashCode();
            throw null;
        }
    }

    @Override // com.appsflyer.internal.AFg1sSDK
    public final void values(AFa1rSDK aFa1rSDK) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(aFa1rSDK, "");
        Map<String, Object> AFKeystoreWrapper = aFa1rSDK.AFKeystoreWrapper();
        Intrinsics.checkNotNullExpressionValue(AFKeystoreWrapper, "");
        AFKeystoreWrapper.put("open_referrer", aFa1rSDK.values);
        String str = aFa1rSDK.unregisterClient;
        if (str != null) {
            int i2 = AFVersionDeclaration + 23;
            afErrorLogForExcManagerOnly = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 74 / 0;
                if (StringsKt.isBlank(str)) {
                    return;
                }
            } else if (StringsKt.isBlank(str)) {
                return;
            }
            int i4 = afErrorLogForExcManagerOnly;
            int i5 = i4 + 9;
            AFVersionDeclaration = i5 % 128;
            int i6 = i5 % 2;
            int i7 = i4 + 19;
            AFVersionDeclaration = i7 % 128;
            if (i7 % 2 == 0) {
                AFKeystoreWrapper.put("af_web_referrer", aFa1rSDK.unregisterClient);
            } else {
                AFKeystoreWrapper.put("af_web_referrer", aFa1rSDK.unregisterClient);
                throw null;
            }
        }
    }

    private final void d(Map<String, Object> map) {
        int i = 2 % 2;
        AFd1ySDK.AFa1uSDK values = this.valueOf.values(this.AFKeystoreWrapper);
        float f = values.values;
        String str = values.AFInAppEventType;
        map.put("btl", String.valueOf(f));
        if (str != null) {
            int i2 = AFVersionDeclaration + 47;
            afErrorLogForExcManagerOnly = i2 % 128;
            int i3 = i2 % 2;
            map.put("btch", str);
            int i4 = AFVersionDeclaration + 55;
            afErrorLogForExcManagerOnly = i4 % 128;
            int i5 = i4 % 2;
        }
    }

    private void unregisterClient(Map<String, Object> map) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(map, "");
        String string = AFInAppEventType().getString(AppsFlyerProperties.ONELINK_ID);
        String string2 = AFInAppEventType().getString(AppsFlyerProperties.ONELINK_VERSION);
        if (string != null) {
            int i2 = afErrorLogForExcManagerOnly + 65;
            AFVersionDeclaration = i2 % 128;
            int i3 = i2 % 2;
            map.put("onelink_id", string);
        }
        if (string2 != null) {
            int i4 = AFVersionDeclaration + 83;
            afErrorLogForExcManagerOnly = i4 % 128;
            int i5 = i4 % 2;
            map.put("onelink_ver", string2);
        }
    }

    private void registerClient(Map<String, ? extends Object> map) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(map, "");
        AFg1gSDK aFg1gSDK = this.d;
        HashMap hashMap = new HashMap(aFg1gSDK.AFInAppEventType);
        aFg1gSDK.AFInAppEventType.clear();
        this.d.valueOf.AFKeystoreWrapper("gcd");
        Intrinsics.checkNotNullExpressionValue(hashMap, "");
        if (hashMap.isEmpty()) {
            return;
        }
        int i2 = afErrorLogForExcManagerOnly + 35;
        AFVersionDeclaration = i2 % 128;
        int i3 = i2 % 2;
        Map<String, Object> AFInAppEventParameterName = AFb1tSDK.AFInAppEventParameterName(map);
        Intrinsics.checkNotNullExpressionValue(AFInAppEventParameterName, "");
        AFInAppEventParameterName.put("gcd", hashMap);
        int i4 = AFVersionDeclaration + 43;
        afErrorLogForExcManagerOnly = i4 % 128;
        int i5 = i4 % 2;
    }

    private void values(Map<String, Object> map, String str) {
        int i = 2 % 2;
        int i2 = afErrorLogForExcManagerOnly + 119;
        AFVersionDeclaration = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(map, "");
        Intrinsics.checkNotNullParameter(str, "");
        try {
            Object obj = null;
            String AFInAppEventType = this.e.AFInAppEventType("prev_event_name", (String) null);
            if (AFInAppEventType != null) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("prev_event_timestamp", this.e.AFInAppEventType("prev_event_timestamp", -1L));
                jSONObject.put("prev_event_name", AFInAppEventType);
                map.put("prev_event", jSONObject);
            }
            this.e.valueOf("prev_event_name", str);
            this.e.AFInAppEventParameterName("prev_event_timestamp", System.currentTimeMillis());
            int i4 = AFVersionDeclaration + 63;
            afErrorLogForExcManagerOnly = i4 % 128;
            if (i4 % 2 != 0) {
                return;
            }
            obj.hashCode();
            throw null;
        } catch (Exception e) {
            AFLogger.afErrorLog("Error while processing previous event.", e);
        }
    }

    private String registerClient() {
        int i = 2 % 2;
        int i2 = afErrorLogForExcManagerOnly + 123;
        AFVersionDeclaration = i2 % 128;
        int i3 = i2 % 2;
        String str = null;
        if (!this.e.valueOf("INSTALL_STORE")) {
            if (e()) {
                str = d();
                int i4 = AFVersionDeclaration + 95;
                afErrorLogForExcManagerOnly = i4 % 128;
                if (i4 % 2 == 0) {
                    int i5 = 2 % 5;
                }
            }
            this.e.valueOf("INSTALL_STORE", str);
            return str;
        }
        int i6 = AFVersionDeclaration + 107;
        afErrorLogForExcManagerOnly = i6 % 128;
        int i7 = i6 % 2;
        return this.e.AFInAppEventType("INSTALL_STORE", (String) null);
    }

    private String d() {
        int i = 2 % 2;
        int i2 = afErrorLogForExcManagerOnly + 51;
        AFVersionDeclaration = i2 % 128;
        if (i2 % 2 != 0) {
            String string = AFInAppEventType().getString(AppsFlyerProperties.AF_STORE_FROM_API);
            int i3 = 13 / 0;
            if (string != null) {
                return string;
            }
        } else {
            String string2 = AFInAppEventType().getString(AppsFlyerProperties.AF_STORE_FROM_API);
            if (string2 != null) {
                return string2;
            }
        }
        String valueOf = valueOf("AF_STORE");
        int i4 = AFVersionDeclaration + 3;
        afErrorLogForExcManagerOnly = i4 % 128;
        int i5 = i4 % 2;
        return valueOf;
    }

    private String AFInAppEventType(SimpleDateFormat simpleDateFormat) {
        int i = 2 % 2;
        int i2 = AFVersionDeclaration + 1;
        afErrorLogForExcManagerOnly = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(simpleDateFormat, "");
            this.e.AFInAppEventType("appsFlyerFirstInstall", (String) null);
            throw null;
        }
        Intrinsics.checkNotNullParameter(simpleDateFormat, "");
        String AFInAppEventType = this.e.AFInAppEventType("appsFlyerFirstInstall", (String) null);
        if (AFInAppEventType == null) {
            if (e()) {
                AFLogger.afDebugLog("AppsFlyer: first launch detected");
                AFInAppEventType = simpleDateFormat.format(new Date());
            } else {
                AFInAppEventType = "";
            }
            this.e.valueOf("appsFlyerFirstInstall", AFInAppEventType);
        }
        AFg1pSDK.i$default(AFLogger.INSTANCE, AFg1jSDK.GENERAL, "AppsFlyer: first launch date: ".concat(String.valueOf(AFInAppEventType)), false, 4, null);
        Intrinsics.checkNotNullExpressionValue(AFInAppEventType, "");
        int i3 = afErrorLogForExcManagerOnly + 21;
        AFVersionDeclaration = i3 % 128;
        int i4 = i3 % 2;
        return AFInAppEventType;
    }

    private boolean e() {
        int i = 2 % 2;
        int i2 = AFVersionDeclaration + 63;
        afErrorLogForExcManagerOnly = i2 % 128;
        int i3 = i2 % 2;
        AFd1xSDK aFd1xSDK = this.e;
        if (i3 == 0) {
            aFd1xSDK.valueOf("appsFlyerCount");
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        if (!aFd1xSDK.valueOf("appsFlyerCount")) {
            return true;
        }
        int i4 = AFVersionDeclaration + 91;
        afErrorLogForExcManagerOnly = i4 % 128;
        int i5 = i4 % 2;
        return false;
    }

    private boolean AFLogger() {
        int i = 2 % 2;
        int i2 = AFVersionDeclaration + 57;
        afErrorLogForExcManagerOnly = i2 % 128;
        int i3 = i2 % 2;
        boolean parseBoolean = Boolean.parseBoolean(this.e.AFInAppEventType("sentSuccessfully", (String) null));
        int i4 = AFVersionDeclaration + 59;
        afErrorLogForExcManagerOnly = i4 % 128;
        int i5 = i4 % 2;
        return parseBoolean;
    }

    private String i() {
        int i = 2 % 2;
        String string = AFInAppEventType().getString("preInstallName");
        if (string != null) {
            int i2 = AFVersionDeclaration;
            int i3 = i2 + 35;
            afErrorLogForExcManagerOnly = i3 % 128;
            int i4 = i3 % 2;
            int i5 = i2 + 29;
            afErrorLogForExcManagerOnly = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 39 / 0;
            }
            return string;
        }
        Object obj = null;
        if (this.e.valueOf("preInstallName")) {
            string = this.e.AFInAppEventType("preInstallName", (String) null);
        } else {
            if (e()) {
                string = w();
                if (string == null) {
                    string = valueOf("AF_PRE_INSTALL_NAME");
                }
                int i7 = afErrorLogForExcManagerOnly + 83;
                AFVersionDeclaration = i7 % 128;
                int i8 = i7 % 2;
            }
            if (string != null) {
                this.e.valueOf("preInstallName", string);
                int i9 = AFVersionDeclaration + 111;
                afErrorLogForExcManagerOnly = i9 % 128;
                int i10 = i9 % 2;
            }
        }
        if (string == null) {
            return string;
        }
        int i11 = AFVersionDeclaration + 19;
        afErrorLogForExcManagerOnly = i11 % 128;
        if (i11 % 2 != 0) {
            AFInAppEventType().set("preInstallName", string);
            return string;
        }
        AFInAppEventType().set("preInstallName", string);
        obj.hashCode();
        throw null;
    }

    private void AFKeystoreWrapper(Map<String, Object> map, String str) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(map, "");
        if (AFInAppEventType().getBoolean(AppsFlyerProperties.DEVICE_TRACKING_DISABLED, false)) {
            map.put(AppsFlyerProperties.DEVICE_TRACKING_DISABLED, "true");
            return;
        }
        Object values = this.unregisterClient.values(this.e);
        String str2 = (CharSequence) values;
        if (str2 != null && str2.length() != 0) {
            map.put("imei", values);
            int i2 = afErrorLogForExcManagerOnly + 83;
            AFVersionDeclaration = i2 % 128;
            int i3 = i2 % 2;
        }
        String AFInAppEventType = AFInAppEventType(str);
        if (AFInAppEventType != null) {
            this.e.valueOf("androidIdCached", AFInAppEventType);
            map.put("android_id", AFInAppEventType);
        } else {
            AFLogger.afInfoLog("Android ID was not collected.");
        }
        AFa1bSDK AFInAppEventType2 = AFb1qSDK.AFInAppEventType(this.AFKeystoreWrapper);
        if (AFInAppEventType2 == null) {
            int i4 = AFVersionDeclaration + 47;
            afErrorLogForExcManagerOnly = i4 % 128;
            int i5 = i4 % 2;
            return;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Boolean bool = AFInAppEventType2.AFKeystoreWrapper;
        Intrinsics.checkNotNullExpressionValue(bool, "");
        linkedHashMap.put("isManual", bool);
        String str3 = AFInAppEventType2.valueOf;
        Intrinsics.checkNotNullExpressionValue(str3, "");
        linkedHashMap.put("val", str3);
        Boolean bool2 = AFInAppEventType2.AFInAppEventType;
        if (bool2 != null) {
            int i6 = AFVersionDeclaration + 95;
            afErrorLogForExcManagerOnly = i6 % 128;
            if (i6 % 2 == 0) {
                linkedHashMap.put("isLat", bool2);
                throw null;
            }
            linkedHashMap.put("isLat", bool2);
            int i7 = AFVersionDeclaration + AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR_OVERLAY;
            afErrorLogForExcManagerOnly = i7 % 128;
            if (i7 % 2 == 0) {
                int i8 = 3 % 2;
            }
        }
        map.put("oaid", linkedHashMap);
    }

    private final String AFInAppEventType(String str) {
        String str2;
        int i = 2 % 2;
        if (!AFInAppEventType().getBoolean(AppsFlyerProperties.COLLECT_ANDROID_ID, false) || ((str2 = str) != null && str2.length() != 0)) {
            if (str == null) {
                return null;
            }
            int i2 = afErrorLogForExcManagerOnly + 81;
            AFVersionDeclaration = i2 % 128;
            int i3 = i2 % 2;
            return str;
        }
        int i4 = AFVersionDeclaration + 111;
        afErrorLogForExcManagerOnly = i4 % 128;
        if (i4 % 2 != 0) {
            if (v()) {
                return afInfoLog();
            }
            return null;
        }
        v();
        throw null;
    }

    private final String afInfoLog() {
        int i = 2 % 2;
        int i2 = AFVersionDeclaration + 103;
        afErrorLogForExcManagerOnly = i2 % 128;
        int i3 = i2 % 2;
        Object obj = null;
        String AFInAppEventType = this.e.AFInAppEventType("androidIdCached", (String) null);
        try {
            String string = Settings.Secure.getString(this.AFKeystoreWrapper.getContentResolver(), "android_id");
            if (string != null) {
                int i4 = afErrorLogForExcManagerOnly + 33;
                AFVersionDeclaration = i4 % 128;
                if (i4 % 2 == 0) {
                    return string;
                }
                obj.hashCode();
                throw null;
            }
        } catch (Exception e) {
            AFLogger.afErrorLog(e.getMessage(), e);
        }
        if (AFInAppEventType == null) {
            return null;
        }
        AFLogger.afDebugLog("use cached AndroidId: ".concat(String.valueOf(AFInAppEventType)));
        int i5 = AFVersionDeclaration + AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR_OVERLAY;
        afErrorLogForExcManagerOnly = i5 % 128;
        int i6 = i5 % 2;
        return AFInAppEventType;
    }

    private static void e(Map<String, Object> map) {
        int i = 2 % 2;
        int i2 = afErrorLogForExcManagerOnly + 51;
        AFVersionDeclaration = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(map, "");
        Object[] objArr = new Object[1];
        a("沍ᔄ檢轎㸼ᯗ", 5 - KeyEvent.normalizeMetaState(0), objArr);
        map.put(((String) objArr[0]).intern(), Build.BRAND);
        map.put("device", Build.DEVICE);
        map.put("product", Build.PRODUCT);
        map.put("sdk", String.valueOf(Build.VERSION.SDK_INT));
        map.put("model", Build.MODEL);
        map.put("deviceType", Build.TYPE);
        int i4 = AFVersionDeclaration + 13;
        afErrorLogForExcManagerOnly = i4 % 128;
        int i5 = i4 % 2;
    }

    private void AFInAppEventParameterName(Map<String, Object> map, String str, String str2, AFc1dSDK aFc1dSDK) {
        int i = 2 % 2;
        int i2 = afErrorLogForExcManagerOnly + 3;
        AFVersionDeclaration = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(map, "");
            e();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(map, "");
        if (e()) {
            afInfoLog(map);
            i(map);
            force(map);
            AFc1uSDK.values(this.w, this.e);
        }
        v(map);
        unregisterClient(map);
        registerClient(map);
        AFInAppEventParameterName(map, str2);
        AFInAppEventType(map, str);
        w(map);
        if (aFc1dSDK != null) {
            aFc1dSDK.valueOf(map);
            int i3 = afErrorLogForExcManagerOnly + 103;
            AFVersionDeclaration = i3 % 128;
            int i4 = i3 % 2;
        }
    }

    private final void afInfoLog(Map<String, Object> map) {
        int i = 2 % 2;
        int i2 = afErrorLogForExcManagerOnly + 17;
        AFVersionDeclaration = i2 % 128;
        int i3 = i2 % 2;
        if (!AFInAppEventType().isOtherSdkStringDisabled()) {
            map.put("batteryLevel", String.valueOf(this.valueOf.values(this.AFKeystoreWrapper).values));
        }
        int i4 = AFVersionDeclaration + 47;
        afErrorLogForExcManagerOnly = i4 % 128;
        int i5 = i4 % 2;
    }

    private final void i(Map<String, Object> map) {
        int i = 2 % 2;
        int i2 = afErrorLogForExcManagerOnly + ComposerImplKt.nodeKey;
        AFVersionDeclaration = i2 % 128;
        int i3 = i2 % 2;
        UiModeManager uiModeManager = (UiModeManager) this.AFKeystoreWrapper.getSystemService(UiModeManager.class);
        if (uiModeManager == null || uiModeManager.getCurrentModeType() != 4) {
            return;
        }
        map.put("tv", Boolean.TRUE);
        int i4 = afErrorLogForExcManagerOnly + 33;
        AFVersionDeclaration = i4 % 128;
        int i5 = i4 % 2;
    }

    private final void force(Map<String, Object> map) {
        int i = 2 % 2;
        int i2 = afErrorLogForExcManagerOnly + 29;
        AFVersionDeclaration = i2 % 128;
        if (i2 % 2 == 0) {
            if (AFg1qSDK.AFKeystoreWrapper(this.AFKeystoreWrapper)) {
                map.put("inst_app", Boolean.TRUE);
                int i3 = afErrorLogForExcManagerOnly + 37;
                AFVersionDeclaration = i3 % 128;
                int i4 = i3 % 2;
                return;
            }
            return;
        }
        AFg1qSDK.AFKeystoreWrapper(this.AFKeystoreWrapper);
        throw null;
    }

    private void v(Map<String, Object> map) {
        long j;
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(map, "");
        long AFInAppEventType = this.e.AFInAppEventType("AppsFlyerTimePassedSincePrevLaunch", 0L);
        long currentTimeMillis = System.currentTimeMillis();
        this.e.AFInAppEventParameterName("AppsFlyerTimePassedSincePrevLaunch", currentTimeMillis);
        if (AFInAppEventType > 0) {
            j = TimeUnit.MILLISECONDS.toSeconds(currentTimeMillis - AFInAppEventType);
            int i2 = afErrorLogForExcManagerOnly + 5;
            AFVersionDeclaration = i2 % 128;
            int i3 = i2 % 2;
        } else {
            j = -1;
        }
        map.put("timepassedsincelastlaunch", String.valueOf(j));
        int i4 = afErrorLogForExcManagerOnly + 65;
        AFVersionDeclaration = i4 % 128;
        int i5 = i4 % 2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001d, code lost:
    
        if (r4 != null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0017, code lost:
    
        if (r4 != null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x001f, code lost:
    
        r3.put(androidx.autofill.HintConstants.AUTOFILL_HINT_PHONE, r4);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void AFInAppEventParameterName(Map<String, Object> map, String str) {
        int i = 2 % 2;
        int i2 = AFVersionDeclaration + 3;
        afErrorLogForExcManagerOnly = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(map, "");
            int i3 = 78 / 0;
        } else {
            Intrinsics.checkNotNullParameter(map, "");
        }
        int i4 = AFVersionDeclaration + 51;
        afErrorLogForExcManagerOnly = i4 % 128;
        int i5 = i4 % 2;
    }

    private void AFInAppEventType(Map<String, Object> map, String str) {
        int i = 2 % 2;
        int i2 = AFVersionDeclaration + 67;
        afErrorLogForExcManagerOnly = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(map, "");
        String str2 = str;
        if (str2 != null) {
            int i4 = AFVersionDeclaration + 11;
            afErrorLogForExcManagerOnly = i4 % 128;
            int i5 = i4 % 2;
            if (str2.length() != 0) {
                int i6 = afErrorLogForExcManagerOnly + 65;
                AFVersionDeclaration = i6 % 128;
                if (i6 % 2 != 0) {
                    map.put("referrer", str);
                    throw null;
                }
                map.put("referrer", str);
            }
        }
        String AFInAppEventType = this.e.AFInAppEventType("extraReferrers", (String) null);
        if (AFInAppEventType != null) {
            int i7 = AFVersionDeclaration + 121;
            afErrorLogForExcManagerOnly = i7 % 128;
            if (i7 % 2 == 0) {
                map.put("extraReferrers", AFInAppEventType);
                throw null;
            }
            map.put("extraReferrers", AFInAppEventType);
            int i8 = afErrorLogForExcManagerOnly + 39;
            AFVersionDeclaration = i8 % 128;
            if (i8 % 2 != 0) {
                int i9 = 2 % 5;
            }
        }
        String referrer = AFInAppEventType().getReferrer(this.e);
        String str3 = referrer;
        if (str3 != null) {
            int i10 = afErrorLogForExcManagerOnly + 61;
            AFVersionDeclaration = i10 % 128;
            int i11 = i10 % 2;
            if (str3.length() != 0 && map.get("referrer") == null) {
                int i12 = AFVersionDeclaration + 69;
                afErrorLogForExcManagerOnly = i12 % 128;
                int i13 = i12 % 2;
                map.put("referrer", referrer);
            }
        }
    }

    private void w(Map<String, Object> map) {
        long j;
        int i = 2 % 2;
        int i2 = AFVersionDeclaration + 115;
        afErrorLogForExcManagerOnly = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(map, "");
            j = this.d.force;
            if (j == 1) {
                return;
            }
        } else {
            Intrinsics.checkNotNullParameter(map, "");
            j = this.d.force;
            if (j == 0) {
                return;
            }
        }
        int i3 = afErrorLogForExcManagerOnly + 47;
        AFVersionDeclaration = i3 % 128;
        int i4 = i3 % 2;
        map.put("prev_session_dur", Long.valueOf(j));
        int i5 = afErrorLogForExcManagerOnly + 123;
        AFVersionDeclaration = i5 % 128;
        int i6 = i5 % 2;
    }

    private static void afRDLog(Map<String, Object> map) {
        int i = 2 % 2;
        int i2 = afErrorLogForExcManagerOnly + 103;
        AFVersionDeclaration = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(map, "");
            AFc1uSDK aFc1uSDK = AFc1uSDK.INSTANCE;
            AFc1uSDK.valueOf();
            AFc1uSDK aFc1uSDK2 = AFc1uSDK.INSTANCE;
            AFc1uSDK.AFInAppEventParameterName();
            throw null;
        }
        Intrinsics.checkNotNullParameter(map, "");
        AFc1uSDK aFc1uSDK3 = AFc1uSDK.INSTANCE;
        Object valueOf = AFc1uSDK.valueOf();
        AFc1uSDK aFc1uSDK4 = AFc1uSDK.INSTANCE;
        String AFInAppEventParameterName = AFc1uSDK.AFInAppEventParameterName();
        if (valueOf != null) {
            int i3 = afErrorLogForExcManagerOnly + 63;
            AFVersionDeclaration = i3 % 128;
            if (i3 % 2 != 0) {
                int i4 = 87 / 0;
                if (AFInAppEventParameterName == null) {
                    return;
                }
            } else if (AFInAppEventParameterName == null) {
                return;
            }
            if (Integer.parseInt(AFInAppEventParameterName) > 0) {
                map.put("reinstallCounter", AFInAppEventParameterName);
                map.put("originalAppsflyerId", valueOf);
            }
        }
    }

    private void afDebugLog(Map<String, Object> map) {
        int i = 2 % 2;
        int i2 = afErrorLogForExcManagerOnly + 33;
        AFVersionDeclaration = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(map, "");
            map.putAll(this.i.AFKeystoreWrapper());
            int i3 = 40 / 0;
        } else {
            Intrinsics.checkNotNullParameter(map, "");
            map.putAll(this.i.AFKeystoreWrapper());
        }
        int i4 = afErrorLogForExcManagerOnly + 21;
        AFVersionDeclaration = i4 % 128;
        int i5 = i4 % 2;
    }

    private void afVerboseLog(Map<String, Object> map) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(map, "");
        String string = AFInAppEventType().getString(AppsFlyerProperties.EXTENSION);
        String str = string;
        if (str != null && str.length() != 0) {
            int i2 = AFVersionDeclaration + 71;
            afErrorLogForExcManagerOnly = i2 % 128;
            int i3 = i2 % 2;
            map.put(AppsFlyerProperties.EXTENSION, string);
        }
        int i4 = afErrorLogForExcManagerOnly + 53;
        AFVersionDeclaration = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0044, code lost:
    
        if (r4 != false) goto L15;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:22:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x003b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void afWarnLog(Map<String, Object> map) {
        boolean z;
        String registerClient;
        String i;
        String d;
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(map, "");
        String AFInAppEventParameterName = this.AFLogger.AFInAppEventParameterName();
        String AFKeystoreWrapper = AFKeystoreWrapper(this.e, AFInAppEventParameterName);
        if (AFKeystoreWrapper != null) {
            int i3 = afErrorLogForExcManagerOnly + 93;
            AFVersionDeclaration = i3 % 128;
            int i4 = i3 % 2;
            if (!Intrinsics.areEqual(AFKeystoreWrapper, AFInAppEventParameterName)) {
                int i5 = AFVersionDeclaration + 7;
                afErrorLogForExcManagerOnly = i5 % 128;
                int i6 = i5 % 2;
                z = true;
                boolean z2 = (AFKeystoreWrapper == null || AFInAppEventParameterName == null) ? false : true;
                if (!z) {
                    int i7 = afErrorLogForExcManagerOnly + 71;
                    AFVersionDeclaration = i7 % 128;
                    int i8 = i7 % 2;
                }
                map.put("af_latestchannel", AFInAppEventParameterName);
                registerClient = registerClient();
                if (registerClient != null) {
                    Locale locale = Locale.getDefault();
                    Intrinsics.checkNotNullExpressionValue(locale, "");
                    Object lowerCase = registerClient.toLowerCase(locale);
                    Intrinsics.checkNotNullExpressionValue(lowerCase, "");
                    map.put("af_installstore", lowerCase);
                }
                i = i();
                if (i != null) {
                    Locale locale2 = Locale.getDefault();
                    Intrinsics.checkNotNullExpressionValue(locale2, "");
                    Object lowerCase2 = i.toLowerCase(locale2);
                    Intrinsics.checkNotNullExpressionValue(lowerCase2, "");
                    map.put("af_preinstall_name", lowerCase2);
                }
                d = d();
                if (d == null) {
                    Locale locale3 = Locale.getDefault();
                    Intrinsics.checkNotNullExpressionValue(locale3, "");
                    Object lowerCase3 = d.toLowerCase(locale3);
                    Intrinsics.checkNotNullExpressionValue(lowerCase3, "");
                    map.put("af_currentstore", lowerCase3);
                    return;
                }
                return;
            }
        }
        z = false;
        if (AFKeystoreWrapper == null) {
        }
        if (!z) {
        }
        map.put("af_latestchannel", AFInAppEventParameterName);
        registerClient = registerClient();
        if (registerClient != null) {
        }
        i = i();
        if (i != null) {
        }
        d = d();
        if (d == null) {
        }
    }

    private static void AFInAppEventParameterName(Map<String, Object> map, boolean z) {
        int i = 2 % 2;
        int i2 = afErrorLogForExcManagerOnly + 55;
        AFVersionDeclaration = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(map, "");
        map.put("af_preinstalled", String.valueOf(z));
        int i4 = AFVersionDeclaration + 55;
        afErrorLogForExcManagerOnly = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static void afErrorLog(Map<String, Object> map) {
        int i = 2 % 2;
        int i2 = AFVersionDeclaration + 69;
        afErrorLogForExcManagerOnly = i2 % 128;
        try {
        } catch (Exception e) {
            AFLogger.afErrorLog("Exception while collecting display language name. ", e);
        }
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(map, "");
            map.put("lang", Locale.getDefault().getDisplayLanguage());
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(map, "");
        map.put("lang", Locale.getDefault().getDisplayLanguage());
        int i3 = AFVersionDeclaration + 31;
        afErrorLogForExcManagerOnly = i3 % 128;
        int i4 = i3 % 2;
        try {
            map.put("lang_code", Locale.getDefault().getLanguage());
        } catch (Exception e2) {
            AFLogger.afErrorLog("Exception while collecting display language code. ", e2);
        }
        try {
            map.put("country", Locale.getDefault().getCountry());
        } catch (Exception e3) {
            AFLogger.afErrorLog("Exception while collecting country name. ", e3);
        }
    }

    private void afErrorLogForExcManagerOnly(Map<String, Object> map) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(map, "");
        try {
            String AFKeystoreWrapper = AFb1iSDK.AFKeystoreWrapper(this.w, this.e);
            if (AFKeystoreWrapper != null) {
                int i2 = afErrorLogForExcManagerOnly + 87;
                AFVersionDeclaration = i2 % 128;
                if (i2 % 2 == 0) {
                    map.put("uid", AFKeystoreWrapper);
                    return;
                }
                map.put("uid", AFKeystoreWrapper);
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        } catch (Throwable th) {
            String obj2 = new StringBuilder("ERROR: could not get uid ").append(th.getMessage()).toString();
            Intrinsics.checkNotNullExpressionValue(obj2, "");
            AFLogger.afErrorLog(obj2, th);
        }
        int i3 = afErrorLogForExcManagerOnly + 89;
        AFVersionDeclaration = i3 % 128;
        int i4 = i3 % 2;
    }

    private void AFVersionDeclaration(Map<String, Object> map) {
        int i = 2 % 2;
        int i2 = afErrorLogForExcManagerOnly + 103;
        AFVersionDeclaration = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(map, "");
            AFLogger.afDebugLog("didConfigureTokenRefreshService=".concat(String.valueOf(AFf1bSDK.values(this.AFKeystoreWrapper))));
            throw null;
        }
        Intrinsics.checkNotNullParameter(map, "");
        boolean values = AFf1bSDK.values(this.AFKeystoreWrapper);
        AFLogger.afDebugLog("didConfigureTokenRefreshService=".concat(String.valueOf(values)));
        if (!values) {
            map.put("tokenRefreshConfigured", Boolean.FALSE);
        }
        map.put("registeredUninstall", Boolean.valueOf(AFf1bSDK.values(this.e)));
        int i3 = afErrorLogForExcManagerOnly + 3;
        AFVersionDeclaration = i3 % 128;
        int i4 = i3 % 2;
    }

    private void AFLogger$LogLevel(Map<String, Object> map) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(map, "");
        AFa1bSDK AFInAppEventType = AFb1qSDK.AFInAppEventType(this.AFKeystoreWrapper.getContentResolver());
        if (AFInAppEventType == null) {
            int i2 = afErrorLogForExcManagerOnly + 25;
            AFVersionDeclaration = i2 % 128;
            int i3 = i2 % 2;
        } else {
            int i4 = AFVersionDeclaration + 63;
            afErrorLogForExcManagerOnly = i4 % 128;
            int i5 = i4 % 2;
            map.put("amazon_aid", AFInAppEventType.valueOf);
            map.put("amazon_aid_limit", String.valueOf(AFInAppEventType.AFInAppEventType));
        }
    }

    private void getLevel(Map<String, Object> map) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(map, "");
        if (this.e.valueOf("is_stop_tracking_used")) {
            int i2 = afErrorLogForExcManagerOnly + 83;
            AFVersionDeclaration = i2 % 128;
            if (i2 % 2 != 0) {
                map.put("istu", String.valueOf(this.e.values("is_stop_tracking_used")));
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            map.put("istu", String.valueOf(this.e.values("is_stop_tracking_used")));
            int i3 = afErrorLogForExcManagerOnly + 33;
            AFVersionDeclaration = i3 % 128;
            int i4 = i3 % 2;
        }
        int i5 = AFVersionDeclaration + 19;
        afErrorLogForExcManagerOnly = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 21 / 0;
        }
    }

    private void afLogForce(Map<String, Object> map) {
        int i = 2 % 2;
        int i2 = AFVersionDeclaration + 11;
        afErrorLogForExcManagerOnly = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(map, "");
        String str = this.unregisterClient.unregisterClient;
        String str2 = str;
        if (str2 != null) {
            int i4 = afErrorLogForExcManagerOnly + 53;
            AFVersionDeclaration = i4 % 128;
            if (i4 % 2 != 0) {
                str2.length();
                throw null;
            }
            if (str2.length() == 0) {
                return;
            }
            map.put("appsflyerKey", str);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0067 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x004a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void values(Map<String, Object> map, Function0<String> function0) {
        int i;
        String str;
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(map, "");
        Intrinsics.checkNotNullParameter(function0, "");
        if (AFInAppEventType().getBoolean(AppsFlyerProperties.COLLECT_FACEBOOK_ATTR_ID, true)) {
            int i3 = afErrorLogForExcManagerOnly + 71;
            AFVersionDeclaration = i3 % 128;
            int i4 = i3 % 2;
            try {
                this.AFKeystoreWrapper.getPackageManager().getApplicationInfo("com.facebook.katana", 0);
                str = function0.invoke();
            } catch (PackageManager.NameNotFoundException e) {
                AFLogger.afErrorLogForExcManagerOnly("com.facebook.katana not found", e, true);
                AFLogger.afWarnLog("Exception while collecting facebook's attribution ID. ");
                str = null;
                if (str != null) {
                }
                i = afErrorLogForExcManagerOnly + 15;
                AFVersionDeclaration = i % 128;
                if (i % 2 != 0) {
                }
            } catch (Throwable th) {
                AFLogger.afErrorLog("Exception while collecting facebook's attribution ID. ", th);
                str = null;
                if (str != null) {
                }
                i = afErrorLogForExcManagerOnly + 15;
                AFVersionDeclaration = i % 128;
                if (i % 2 != 0) {
                }
            }
            if (str != null) {
                int i5 = AFVersionDeclaration + 13;
                afErrorLogForExcManagerOnly = i5 % 128;
                int i6 = i5 % 2;
                map.put("fb", str);
                if (i6 == 0) {
                    throw null;
                }
            }
        }
        i = afErrorLogForExcManagerOnly + 15;
        AFVersionDeclaration = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    private static String AFKeystoreWrapper(AFd1xSDK aFd1xSDK, String str) {
        int i = 2 % 2;
        int i2 = afErrorLogForExcManagerOnly + 39;
        AFVersionDeclaration = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            String AFInAppEventType = aFd1xSDK.AFInAppEventType("CACHED_CHANNEL", (String) null);
            if (AFInAppEventType != null) {
                return AFInAppEventType;
            }
            aFd1xSDK.valueOf("CACHED_CHANNEL", str);
            int i3 = AFVersionDeclaration + 85;
            afErrorLogForExcManagerOnly = i3 % 128;
            int i4 = i3 % 2;
            return str;
        }
        aFd1xSDK.AFInAppEventType("CACHED_CHANNEL", (String) null);
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0044, code lost:
    
        if (r7 != null) goto L9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static String AFInAppEventParameterName(String str) {
        Object invoke;
        int i = 2 % 2;
        int i2 = AFVersionDeclaration + 35;
        afErrorLogForExcManagerOnly = i2 % 128;
        Object obj = null;
        try {
            if (i2 % 2 == 0) {
                invoke = Class.forName("android.os.SystemProperties").getMethod("get", String.class).invoke(null, str);
                if (invoke != null) {
                    String str2 = (String) invoke;
                    int i3 = AFVersionDeclaration + 83;
                    afErrorLogForExcManagerOnly = i3 % 128;
                    if (i3 % 2 != 0) {
                        return str2;
                    }
                    obj.hashCode();
                    throw null;
                }
                throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
            }
            invoke = Class.forName("android.os.SystemProperties").getMethod("get", String.class).invoke(null, str);
        } catch (Throwable th) {
            AFLogger.afErrorLog(th.getMessage(), th);
            return null;
        }
    }

    private final String valueOf(String str) {
        int i = 2 % 2;
        int i2 = afErrorLogForExcManagerOnly + 73;
        AFVersionDeclaration = i2 % 128;
        int i3 = i2 % 2;
        String AFInAppEventParameterName = this.AFLogger.AFInAppEventParameterName(str);
        if (i3 != 0) {
            int i4 = 17 / 0;
        }
        int i5 = AFVersionDeclaration + 21;
        afErrorLogForExcManagerOnly = i5 % 128;
        int i6 = i5 % 2;
        return AFInAppEventParameterName;
    }

    private final String w() {
        int i = 2 % 2;
        int i2 = AFVersionDeclaration + 19;
        afErrorLogForExcManagerOnly = i2 % 128;
        int i3 = i2 % 2;
        File values = values(AFInAppEventParameterName("ro.appsflyer.preinstall.path"));
        if (AFInAppEventParameterName(values)) {
            int i4 = AFVersionDeclaration + 87;
            afErrorLogForExcManagerOnly = i4 % 128;
            int i5 = i4 % 2;
            values = values(valueOf("AF_PRE_INSTALL_PATH"));
        }
        if (AFInAppEventParameterName(values)) {
            values = values("/data/local/tmp/pre_install.appsflyer");
        }
        if (AFInAppEventParameterName(values)) {
            values = values("/etc/pre_install.appsflyer");
        }
        if (AFInAppEventParameterName(values)) {
            int i6 = afErrorLogForExcManagerOnly + 31;
            AFVersionDeclaration = i6 % 128;
            if (i6 % 2 != 0) {
                int i7 = 81 / 0;
            }
            return null;
        }
        String packageName = this.AFKeystoreWrapper.getPackageName();
        Intrinsics.checkNotNullExpressionValue(packageName, "");
        String AFKeystoreWrapper = AFKeystoreWrapper(values, packageName);
        int i8 = AFVersionDeclaration + TypedValues.TYPE_TARGET;
        afErrorLogForExcManagerOnly = i8 % 128;
        int i9 = i8 % 2;
        return AFKeystoreWrapper;
    }

    private static File values(String str) {
        int i = 2 % 2;
        if (str != null) {
            try {
                if (StringsKt.trim((CharSequence) str).toString().length() > 0) {
                    int i2 = AFVersionDeclaration + 27;
                    afErrorLogForExcManagerOnly = i2 % 128;
                    int i3 = i2 % 2;
                    return new File(StringsKt.trim((CharSequence) str).toString());
                }
                int i4 = afErrorLogForExcManagerOnly + 95;
                AFVersionDeclaration = i4 % 128;
                int i5 = i4 % 2;
            } catch (Throwable th) {
                AFLogger.afErrorLog(th.getMessage(), th);
            }
        }
        int i6 = afErrorLogForExcManagerOnly + 63;
        AFVersionDeclaration = i6 % 128;
        if (i6 % 2 == 0) {
            return null;
        }
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001e, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0015, code lost:
    
        if (r3 != null) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0012, code lost:
    
        if (r3 != null) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x001b, code lost:
    
        if (r3.exists() != false) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static boolean AFInAppEventParameterName(File file) {
        int i = 2 % 2;
        int i2 = AFVersionDeclaration + 71;
        afErrorLogForExcManagerOnly = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 23 / 0;
        }
        int i4 = afErrorLogForExcManagerOnly + AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR_OVERLAY;
        AFVersionDeclaration = i4 % 128;
        int i5 = i4 % 2;
        return true;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(6:18|19|(2:21|22)|23|24|22) */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x005a, code lost:
    
        r6 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x005b, code lost:
    
        com.appsflyer.AFLogger.afErrorLog(r6.getMessage(), r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0054, code lost:
    
        if (r3 == null) goto L28;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static String AFKeystoreWrapper(File file, String str) {
        InputStreamReader inputStreamReader;
        int i = 2 % 2;
        int i2 = afErrorLogForExcManagerOnly + 103;
        AFVersionDeclaration = i2 % 128;
        int i3 = i2 % 2;
        try {
            if (file == null) {
                return null;
            }
            try {
                Properties properties = new Properties();
                inputStreamReader = new InputStreamReader(new FileInputStream(file), Charset.defaultCharset());
                try {
                    properties.load(inputStreamReader);
                    AFLogger.afInfoLog("Found PreInstall property!");
                    String property = properties.getProperty(str);
                    try {
                        inputStreamReader.close();
                    } catch (Throwable th) {
                        AFLogger.afErrorLog(th.getMessage(), th);
                    }
                    int i4 = afErrorLogForExcManagerOnly + 15;
                    AFVersionDeclaration = i4 % 128;
                    int i5 = i4 % 2;
                    return property;
                } catch (FileNotFoundException unused) {
                    AFLogger.afDebugLog(new StringBuilder("PreInstall file wasn't found: ").append(file.getAbsolutePath()).toString());
                    if (inputStreamReader == null) {
                        int i6 = AFVersionDeclaration + 37;
                        afErrorLogForExcManagerOnly = i6 % 128;
                        int i7 = i6 % 2;
                        return null;
                    }
                    inputStreamReader.close();
                    return null;
                } catch (Throwable th2) {
                    th = th2;
                    AFLogger.afErrorLog(th.getMessage(), th);
                }
            } catch (FileNotFoundException unused2) {
                inputStreamReader = null;
            } catch (Throwable th3) {
                th = th3;
                inputStreamReader = null;
            }
        } catch (Throwable th4) {
            if (inputStreamReader == null) {
                int i8 = afErrorLogForExcManagerOnly + 11;
                AFVersionDeclaration = i8 % 128;
                int i9 = i8 % 2;
            } else {
                try {
                    inputStreamReader.close();
                } catch (Throwable th5) {
                    AFLogger.afErrorLog(th5.getMessage(), th5);
                }
            }
            throw th4;
        }
    }

    private final boolean v() {
        int i = 2 % 2;
        if (!AFInAppEventType().getBoolean(AppsFlyerProperties.COLLECT_ANDROID_ID_FORCE_BY_USER, false)) {
            int i2 = AFVersionDeclaration + 73;
            afErrorLogForExcManagerOnly = i2 % 128;
            if (i2 % 2 != 0 ? !AFInAppEventType().getBoolean(AppsFlyerProperties.COLLECT_IMEI_FORCE_BY_USER, false) : !AFInAppEventType().getBoolean(AppsFlyerProperties.COLLECT_IMEI_FORCE_BY_USER, true)) {
                int i3 = AFVersionDeclaration + 31;
                int i4 = i3 % 128;
                afErrorLogForExcManagerOnly = i4;
                int i5 = i3 % 2;
                int i6 = i4 + ComposerImplKt.nodeKey;
                AFVersionDeclaration = i6 % 128;
                int i7 = i6 % 2;
                AFb1tSDK.AFInAppEventType();
                if (AFb1tSDK.AFInAppEventParameterName(this.AFKeystoreWrapper)) {
                    return false;
                }
            }
        }
        return true;
    }

    private static void AFInAppEventType(Map<String, Object> map, AFa1rSDK aFa1rSDK) {
        Intrinsics.checkNotNullParameter(map, "");
        Intrinsics.checkNotNullParameter(aFa1rSDK, "");
        String str = aFa1rSDK.e;
        if (str != null) {
            map.put("eventName", str);
            map.put("eventValue", new JSONObject(aFa1rSDK.AFInAppEventType == null ? new HashMap() : aFa1rSDK.AFInAppEventType).toString());
        }
    }

    private static void a(String str, int i, Object[] objArr) {
        char[] cArr;
        int i2 = 2 % 2;
        int i3 = $10 + 31;
        int i4 = i3 % 128;
        $11 = i4;
        if (i3 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        if (str != null) {
            int i5 = i4 + 61;
            $10 = i5 % 128;
            int i6 = i5 % 2;
            cArr = str.toCharArray();
            int i7 = $11 + 15;
            $10 = i7 % 128;
            int i8 = i7 % 2;
        } else {
            cArr = str;
        }
        char[] cArr2 = cArr;
        AFj1uSDK aFj1uSDK = new AFj1uSDK();
        char[] cArr3 = new char[cArr2.length];
        aFj1uSDK.values = 0;
        char[] cArr4 = new char[2];
        while (aFj1uSDK.values < cArr2.length) {
            cArr4[0] = cArr2[aFj1uSDK.values];
            cArr4[1] = cArr2[aFj1uSDK.values + 1];
            int i9 = 58224;
            for (int i10 = 0; i10 < 16; i10++) {
                char c = cArr4[1];
                char c2 = cArr4[0];
                char c3 = (char) (c - (((c2 + i9) ^ ((c2 << 4) + ((char) (afRDLog ^ (-7551638670892174108L))))) ^ ((c2 >>> 5) + ((char) (afDebugLog ^ (-7551638670892174108L))))));
                cArr4[1] = c3;
                cArr4[0] = (char) (c2 - (((c3 >>> 5) + ((char) (afWarnLog ^ (-7551638670892174108L)))) ^ ((c3 + i9) ^ ((c3 << 4) + ((char) (afErrorLog ^ (-7551638670892174108L)))))));
                i9 -= 40503;
            }
            cArr3[aFj1uSDK.values] = cArr4[0];
            cArr3[aFj1uSDK.values + 1] = cArr4[1];
            aFj1uSDK.values += 2;
        }
        objArr[0] = new String(cArr3, 0, i);
    }
}
