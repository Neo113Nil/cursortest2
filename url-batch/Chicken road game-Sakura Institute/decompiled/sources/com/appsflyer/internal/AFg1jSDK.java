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
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.View;
import androidx.autofill.HintConstants;
import androidx.compose.material3.MenuKt;
import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerProperties;
import com.appsflyer.internal.AFd1vSDK;
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
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class AFg1jSDK implements AFg1mSDK {
    private static int $10 = 0;
    private static int $11 = 1;
    private static int afErrorLog = 0;
    private static int afVerboseLog = 1;
    private final AFd1vSDK AFInAppEventParameterName;
    private final AFa1bSDK AFInAppEventType;
    private final Context AFKeystoreWrapper;
    private final AFd1qSDK AFLogger;
    private final AFd1pSDK afInfoLog;
    private final Lazy afRDLog;
    private final AFg1wSDK d;
    private final AFh1wSDK e;
    private final AFd1lSDK force;
    private final Lazy i;
    private final AFh1cSDK registerClient;
    private final AFd1sSDK unregisterClient;
    private final AFg1rSDK v;
    private final AFi1sSDK valueOf;
    private final AFi1cSDK values;
    private final AFb1hSDK w;
    private static char[] afDebugLog = {35987, 35999, 35977, 35989, 35983, 35976, 35995, 35986, 35993, 35992, 36022, 35988, 35996, 35982, 36030, 35998};
    private static char afWarnLog = 47460;

    public AFg1jSDK(Context context, AFi1sSDK aFi1sSDK, AFd1vSDK aFd1vSDK, AFi1cSDK aFi1cSDK, AFa1bSDK aFa1bSDK, AFh1wSDK aFh1wSDK, AFd1qSDK aFd1qSDK, AFd1sSDK aFd1sSDK, AFh1cSDK aFh1cSDK, AFg1wSDK aFg1wSDK, AFb1hSDK aFb1hSDK, AFd1lSDK aFd1lSDK, AFg1rSDK aFg1rSDK, AFd1pSDK aFd1pSDK) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(aFi1sSDK, "");
        Intrinsics.checkNotNullParameter(aFd1vSDK, "");
        Intrinsics.checkNotNullParameter(aFi1cSDK, "");
        Intrinsics.checkNotNullParameter(aFa1bSDK, "");
        Intrinsics.checkNotNullParameter(aFh1wSDK, "");
        Intrinsics.checkNotNullParameter(aFd1qSDK, "");
        Intrinsics.checkNotNullParameter(aFd1sSDK, "");
        Intrinsics.checkNotNullParameter(aFh1cSDK, "");
        Intrinsics.checkNotNullParameter(aFg1wSDK, "");
        Intrinsics.checkNotNullParameter(aFb1hSDK, "");
        Intrinsics.checkNotNullParameter(aFd1lSDK, "");
        Intrinsics.checkNotNullParameter(aFg1rSDK, "");
        Intrinsics.checkNotNullParameter(aFd1pSDK, "");
        this.AFKeystoreWrapper = context;
        this.valueOf = aFi1sSDK;
        this.AFInAppEventParameterName = aFd1vSDK;
        this.values = aFi1cSDK;
        this.AFInAppEventType = aFa1bSDK;
        this.e = aFh1wSDK;
        this.AFLogger = aFd1qSDK;
        this.unregisterClient = aFd1sSDK;
        this.registerClient = aFh1cSDK;
        this.d = aFg1wSDK;
        this.w = aFb1hSDK;
        this.force = aFd1lSDK;
        this.v = aFg1rSDK;
        this.afInfoLog = aFd1pSDK;
        this.i = LazyKt.lazy(new Function0<AppsFlyerProperties>() { // from class: com.appsflyer.internal.AFg1jSDK.5
            @Override // kotlin.jvm.functions.Function0
            /* renamed from: AFKeystoreWrapper, reason: merged with bridge method [inline-methods] */
            public final AppsFlyerProperties invoke() {
                return AppsFlyerProperties.getInstance();
            }
        });
        this.afRDLog = LazyKt.lazy(new Function0<SimpleDateFormat>() { // from class: com.appsflyer.internal.AFg1jSDK.1
            @Override // kotlin.jvm.functions.Function0
            /* renamed from: AFInAppEventType, reason: merged with bridge method [inline-methods] */
            public final SimpleDateFormat invoke() {
                return new SimpleDateFormat("yyyy-MM-dd_HHmmssZ", Locale.US);
            }
        });
    }

    private final AppsFlyerProperties AFKeystoreWrapper() {
        int i = 2 % 2;
        int i2 = afErrorLog + 43;
        afVerboseLog = i2 % 128;
        int i3 = i2 % 2;
        AppsFlyerProperties appsFlyerProperties = (AppsFlyerProperties) this.i.getValue();
        if (i3 != 0) {
            return appsFlyerProperties;
        }
        throw null;
    }

    private final SimpleDateFormat values() {
        int i = 2 % 2;
        int i2 = afVerboseLog + 41;
        afErrorLog = i2 % 128;
        int i3 = i2 % 2;
        SimpleDateFormat simpleDateFormat = (SimpleDateFormat) this.afRDLog.getValue();
        int i4 = afVerboseLog + 111;
        afErrorLog = i4 % 128;
        if (i4 % 2 == 0) {
            return simpleDateFormat;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // com.appsflyer.internal.AFg1mSDK
    public final void values(AFa1qSDK aFa1qSDK) {
        int i = 2 % 2;
        int i2 = afErrorLog + 1;
        afVerboseLog = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(aFa1qSDK, "");
        Map<String, Object> AFInAppEventParameterName = aFa1qSDK.AFInAppEventParameterName();
        if (!(!aFa1qSDK.AFInAppEventType())) {
            int i4 = afVerboseLog + 39;
            afErrorLog = i4 % 128;
            int i5 = i4 % 2;
            AFInAppEventType(aFa1qSDK, aFa1qSDK.unregisterClient, this.afInfoLog.valueOf, this.afInfoLog.AFInAppEventParameterName);
        } else if (!(aFa1qSDK instanceof AFh1kSDK)) {
            Intrinsics.checkNotNullExpressionValue(AFInAppEventParameterName, "");
            String str = aFa1qSDK.e;
            Intrinsics.checkNotNullExpressionValue(str, "");
            AFKeystoreWrapper(AFInAppEventParameterName, str);
            int i6 = afVerboseLog + 41;
            afErrorLog = i6 % 128;
            int i7 = i6 % 2;
        }
        Intrinsics.checkNotNullExpressionValue(AFInAppEventParameterName, "");
        AFPurchaseDetails(AFInAppEventParameterName);
        afInfoLog(AFInAppEventParameterName);
        afDebugLog(AFInAppEventParameterName);
        afVerboseLog(AFInAppEventParameterName);
        afErrorLog(AFInAppEventParameterName);
        values(AFInAppEventParameterName, aFa1qSDK.AFInAppEventType());
        afLogForce(AFInAppEventParameterName);
        afErrorLogForExcManagerOnly(AFInAppEventParameterName);
        AFInAppEventParameterName(AFInAppEventParameterName, aFa1qSDK);
        AFInAppEventParameterName.put("af_events_api", "1");
    }

    @Override // com.appsflyer.internal.AFg1mSDK
    public final void AFInAppEventType(Map<String, Object> map, boolean z, Function0<String> function0) {
        int i = 2 % 2;
        int i2 = afErrorLog + 45;
        afVerboseLog = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(map, "");
        Intrinsics.checkNotNullParameter(function0, "");
        AFInAppEventParameterName(map);
        AFKeystoreWrapper(map);
        afRDLog(map);
        valueOf(map, z);
        valueOf(map, function0);
        int i4 = afErrorLog + 45;
        afVerboseLog = i4 % 128;
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
            int i2 = afErrorLog + 19;
            afVerboseLog = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 60 / 0;
            }
        } catch (Exception e) {
            AFLogger.afErrorLog("Exception while collecting install date. ", e);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x004a, code lost:
    
        if (r2.versionCode > r10.AFLogger.valueOf("versionCode", 0)) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void AFKeystoreWrapper(Map<String, Object> map) {
        PackageInfo packageInfo;
        int i = 2 % 2;
        int i2 = afErrorLog + 55;
        afVerboseLog = i2 % 128;
        try {
            if (i2 % 2 == 0) {
                packageInfo = this.AFKeystoreWrapper.getPackageManager().getPackageInfo(this.AFKeystoreWrapper.getPackageName(), 0);
                if (packageInfo.versionCode > this.AFLogger.valueOf("versionCode", 1)) {
                    int i3 = afVerboseLog + 117;
                    afErrorLog = i3 % 128;
                    int i4 = i3 % 2;
                    this.AFLogger.AFInAppEventParameterName("versionCode", packageInfo.versionCode);
                    int i5 = afVerboseLog + 7;
                    afErrorLog = i5 % 128;
                    int i6 = i5 % 2;
                }
                map.put("app_version_code", String.valueOf(packageInfo.versionCode));
                AFd1sSDK aFd1sSDK = this.unregisterClient;
                map.put("app_version_name", AFb1uSDK.AFInAppEventType(aFd1sSDK.valueOf.AFKeystoreWrapper, aFd1sSDK.valueOf.AFKeystoreWrapper.getPackageName()));
                map.put("targetSDKver", Integer.valueOf(this.unregisterClient.valueOf.AFKeystoreWrapper.getApplicationInfo().targetSdkVersion));
                long j = packageInfo.firstInstallTime;
                long j2 = packageInfo.lastUpdateTime;
                map.put("date1", values().format(new Date(j)));
                map.put("date2", values().format(new Date(j2)));
                Object[] objArr = new Object[1];
                a("\u0000\u0004\u0006\u0001\u000e\t\u0007\u0005\b\t\u0006\u000f\u0005\u000e㘉", TextUtils.getOffsetAfter("", 0) + 15, (byte) (10 - View.resolveSize(0, 0)), objArr);
                String intern = ((String) objArr[0]).intern();
                SimpleDateFormat values = values();
                Intrinsics.checkNotNullExpressionValue(values, "");
                map.put(intern, AFInAppEventParameterName(values));
                return;
            }
            packageInfo = this.AFKeystoreWrapper.getPackageManager().getPackageInfo(this.AFKeystoreWrapper.getPackageName(), 0);
        } catch (Throwable th) {
            AFLogger.afErrorLog("Exception while collecting app version data ", th, true);
        }
        AFLogger.afErrorLog("Exception while collecting app version data ", th, true);
    }

    @Override // com.appsflyer.internal.AFg1mSDK
    public final void AFInAppEventType(AFa1qSDK aFa1qSDK) {
        int i = 2 % 2;
        int i2 = afVerboseLog + 9;
        afErrorLog = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(aFa1qSDK, "");
        Map<String, Object> AFInAppEventParameterName = aFa1qSDK.AFInAppEventParameterName();
        Intrinsics.checkNotNullExpressionValue(AFInAppEventParameterName, "");
        AFInAppEventType(AFInAppEventParameterName, aFa1qSDK.AFInAppEventType());
        registerClient(AFInAppEventParameterName);
        afWarnLog(AFInAppEventParameterName);
        values(AFInAppEventParameterName);
        AFInAppEventParameterName(AFInAppEventParameterName, this.afInfoLog.AFInAppEventType);
        AFLogger$LogLevel(AFInAppEventParameterName);
        AFInAppEventParameterName.put("cell", MapsKt.mapOf(TuplesKt.to("mcc", Integer.valueOf(this.AFKeystoreWrapper.getResources().getConfiguration().mcc)), TuplesKt.to("mnc", Integer.valueOf(this.AFKeystoreWrapper.getResources().getConfiguration().mnc))));
        AFInAppEventParameterName.put("sig", valueOf());
        AFInAppEventParameterName.put("last_boot_time", Long.valueOf(AFLogger()));
        AFInAppEventParameterName.put("disk", unregisterClient());
        int i4 = afErrorLog + 81;
        afVerboseLog = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // com.appsflyer.internal.AFg1mSDK
    public final void AFInAppEventType(Map<String, Object> map) {
        String[] strArr;
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(map, "");
        String string = AFKeystoreWrapper().getString(AppsFlyerProperties.APP_ID);
        if (string != null) {
            map.put(AppsFlyerProperties.APP_ID, string);
            int i2 = afErrorLog + 21;
            afVerboseLog = i2 % 128;
            int i3 = i2 % 2;
        }
        String string2 = AFKeystoreWrapper().getString(AppsFlyerProperties.CURRENCY_CODE);
        if (string2 != null) {
            int i4 = afVerboseLog + 47;
            afErrorLog = i4 % 128;
            if (i4 % 2 == 0 ? string2.length() != 3 : string2.length() != 3) {
                String obj = new StringBuilder("WARNING: currency code should be 3 characters!!! '").append(string2).append("' is not a legal value.").toString();
                Intrinsics.checkNotNullExpressionValue(obj, "");
                AFLogger.afWarnLog(obj);
            }
            map.put("currency", string2);
        }
        String string3 = AFKeystoreWrapper().getString(AppsFlyerProperties.IS_UPDATE);
        if (string3 != null) {
            int i5 = afVerboseLog + 117;
            afErrorLog = i5 % 128;
            int i6 = i5 % 2;
            map.put("isUpdate", string3);
        }
        String string4 = AFKeystoreWrapper().getString(AppsFlyerProperties.ADDITIONAL_CUSTOM_DATA);
        if (string4 != null) {
            map.put("customData", string4);
        }
        String string5 = AFKeystoreWrapper().getString(AppsFlyerProperties.APP_USER_ID);
        if (string5 != null) {
            map.put("appUserId", string5);
        }
        String string6 = AFKeystoreWrapper().getString(AppsFlyerProperties.USER_EMAILS);
        if (string6 != null) {
            map.put("user_emails", string6);
        }
        AFd1wSDK aFd1wSDK = this.afInfoLog.AFKeystoreWrapper;
        if (aFd1wSDK != null) {
            int i7 = afVerboseLog + 105;
            afErrorLog = i7 % 128;
            if (i7 % 2 != 0) {
                strArr = aFd1wSDK.AFInAppEventType;
                int i8 = 72 / 0;
                if (strArr == null) {
                    return;
                }
            } else {
                strArr = aFd1wSDK.AFInAppEventType;
                if (strArr == null) {
                    return;
                }
            }
            map.put("sharing_filter", strArr);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x005c, code lost:
    
        if (r4.length() == 0) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0066, code lost:
    
        r8.AFKeystoreWrapper("gaidError", r2.AFKeystoreWrapper);
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0063, code lost:
    
        if (r4.length() == 0) goto L22;
     */
    @Override // com.appsflyer.internal.AFg1mSDK
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void AFKeystoreWrapper(AFa1qSDK aFa1qSDK) {
        boolean z;
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(aFa1qSDK, "");
        if (this.unregisterClient.unregisterClient()) {
            AFh1uSDK aFh1uSDK = this.unregisterClient.AFInAppEventType.AFLogger;
            if (aFh1uSDK == null) {
                int i2 = afErrorLog + 91;
                afVerboseLog = i2 % 128;
                if (i2 % 2 == 0) {
                    int i3 = 59 / 0;
                    return;
                }
                return;
            }
            String str = aFh1uSDK.AFKeystoreWrapper;
            if (str != null) {
                int i4 = afVerboseLog + 57;
                afErrorLog = i4 % 128;
                if (i4 % 2 != 0) {
                    int i5 = 54 / 0;
                }
            }
            if (aFh1uSDK.values != null && aFh1uSDK.AFInAppEventParameterName != null) {
                aFa1qSDK.AFKeystoreWrapper("advertiserId", aFh1uSDK.values);
                aFa1qSDK.AFKeystoreWrapper("advertiserIdEnabled", String.valueOf(aFh1uSDK.AFInAppEventParameterName));
                aFa1qSDK.AFKeystoreWrapper("isGaidWithGps", String.valueOf(aFh1uSDK.AFInAppEventType));
            }
        } else {
            int i6 = afErrorLog + 111;
            afVerboseLog = i6 % 128;
            int i7 = i6 % 2;
            Map<String, Object> AFInAppEventParameterName = AFb1vSDK.AFInAppEventParameterName(aFa1qSDK.AFInAppEventParameterName());
            Intrinsics.checkNotNullExpressionValue(AFInAppEventParameterName, "");
            AFInAppEventParameterName.put("ad_ids_disabled", Boolean.TRUE);
        }
        AFh1uSDK aFh1uSDK2 = this.unregisterClient.AFInAppEventType.AFLogger;
        Object obj = null;
        if (aFh1uSDK2 != null) {
            int i8 = afErrorLog + 41;
            afVerboseLog = i8 % 128;
            if (i8 % 2 == 0) {
                Intrinsics.areEqual(aFh1uSDK2.unregisterClient, Boolean.TRUE);
                obj.hashCode();
                throw null;
            }
            z = Intrinsics.areEqual(aFh1uSDK2.unregisterClient, Boolean.TRUE);
        } else {
            z = false;
        }
        aFa1qSDK.AFKeystoreWrapper("GAID_retry", String.valueOf(z));
        if (CollectionsKt.listOf((Object[]) new AFf1zSDK[]{AFf1zSDK.CONVERSION, AFf1zSDK.LAUNCH}).contains(aFa1qSDK.values())) {
            int i9 = afVerboseLog + 7;
            afErrorLog = i9 % 128;
            int i10 = i9 % 2;
            AFe1mSDK aFe1mSDK = this.afInfoLog.registerClient;
            if (aFe1mSDK != null) {
                Map<String, Object> AFInAppEventParameterName2 = AFb1vSDK.AFInAppEventParameterName(aFa1qSDK.AFInAppEventParameterName());
                Intrinsics.checkNotNullExpressionValue(AFInAppEventParameterName2, "");
                AFInAppEventParameterName2.put("fetchAdIdLatency", Long.valueOf(aFe1mSDK.AFKeystoreWrapper));
                return;
            }
        }
        int i11 = afVerboseLog + 55;
        afErrorLog = i11 % 128;
        if (i11 % 2 == 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    private static PackageInfo values(PackageManager packageManager, String str) {
        int i = 2 % 2;
        int i2 = afVerboseLog + 59;
        afErrorLog = i2 % 128;
        if (i2 % 2 == 0 ? Build.VERSION.SDK_INT >= 33 : Build.VERSION.SDK_INT >= 28) {
            PackageInfo packageInfo = packageManager.getPackageInfo(str, PackageManager.PackageInfoFlags.of(0L));
            Intrinsics.checkNotNullExpressionValue(packageInfo, "");
            int i3 = afErrorLog + 77;
            afVerboseLog = i3 % 128;
            int i4 = i3 % 2;
            return packageInfo;
        }
        PackageInfo packageInfo2 = packageManager.getPackageInfo(str, 0);
        Intrinsics.checkNotNullExpressionValue(packageInfo2, "");
        return packageInfo2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0027, code lost:
    
        r5 = com.appsflyer.internal.AFg1jSDK.afVerboseLog + 113;
        com.appsflyer.internal.AFg1jSDK.afErrorLog = r5 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0032, code lost:
    
        if ((r5 % 2) != 0) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0034, code lost:
    
        r1 = r1.getPackageName();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, "");
        r1 = values(r3, r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x003f, code lost:
    
        if (r1 == null) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0047, code lost:
    
        return java.lang.Long.valueOf(r1.firstInstallTime);
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0048, code lost:
    
        r0 = r1.getPackageName();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, "");
        values(r3, r0);
        r2.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0055, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0025, code lost:
    
        if (r3 != null) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x001e, code lost:
    
        if (r3 != null) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0056, code lost:
    
        r1 = com.appsflyer.internal.AFg1jSDK.afVerboseLog + 57;
        com.appsflyer.internal.AFg1jSDK.afErrorLog = r1 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x005f, code lost:
    
        if ((r1 % 2) == 0) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0061, code lost:
    
        r4 = 73 / 0;
     */
    @Override // com.appsflyer.internal.AFg1mSDK
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Long AFInAppEventParameterName() {
        PackageManager packageManager;
        int i = 2 % 2;
        Context context = this.force.AFKeystoreWrapper;
        Object obj = null;
        if (context != null) {
            int i2 = afVerboseLog + 73;
            afErrorLog = i2 % 128;
            if (i2 % 2 != 0) {
                packageManager = context.getPackageManager();
                int i3 = 92 / 0;
            } else {
                packageManager = context.getPackageManager();
            }
        }
        return null;
    }

    private String valueOf() throws CertificateException, NoSuchAlgorithmException, PackageManager.NameNotFoundException {
        int i = 2 % 2;
        int i2 = afErrorLog + 125;
        afVerboseLog = i2 % 128;
        int i3 = i2 % 2;
        String AFInAppEventParameterName = AFb1uSDK.AFInAppEventParameterName(this.AFKeystoreWrapper.getApplicationContext().getPackageManager(), this.AFKeystoreWrapper.getApplicationContext().getPackageName());
        int i4 = afErrorLog + 117;
        afVerboseLog = i4 % 128;
        if (i4 % 2 != 0) {
            return AFInAppEventParameterName;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static long AFLogger() {
        int i = 2 % 2;
        int i2 = afVerboseLog + 35;
        afErrorLog = i2 % 128;
        return i2 % 2 != 0 ? System.currentTimeMillis() & SystemClock.elapsedRealtime() : System.currentTimeMillis() - SystemClock.elapsedRealtime();
    }

    @Override // com.appsflyer.internal.AFg1mSDK
    public final long AFInAppEventType() {
        int i = 2 % 2;
        int i2 = afVerboseLog + 23;
        afErrorLog = i2 % 128;
        int i3 = i2 % 2;
        long currentTimeMillis = System.currentTimeMillis();
        int i4 = afErrorLog + 51;
        afVerboseLog = i4 % 128;
        int i5 = i4 % 2;
        return currentTimeMillis;
    }

    private static String unregisterClient() {
        int i = 2 % 2;
        StatFs statFs = new StatFs(Environment.getDataDirectory().getAbsolutePath());
        long blockSizeLong = statFs.getBlockSizeLong();
        long availableBlocksLong = statFs.getAvailableBlocksLong() * blockSizeLong;
        long blockCountLong = statFs.getBlockCountLong() * blockSizeLong;
        double pow = Math.pow(2.0d, 20.0d);
        String obj = new StringBuilder().append((long) (availableBlocksLong / pow)).append('/').append((long) (blockCountLong / pow)).toString();
        int i2 = afErrorLog + 35;
        afVerboseLog = i2 % 128;
        if (i2 % 2 != 0) {
            return obj;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    private void values(Map<String, Object> map, boolean z) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(map, "");
        map.put("platformextension", this.w.valueOf());
        if (!z) {
            return;
        }
        int i2 = afErrorLog + 75;
        afVerboseLog = i2 % 128;
        int i3 = i2 % 2;
        map.put("platform_extension_v2", this.valueOf.values());
        int i4 = afErrorLog + 13;
        afVerboseLog = i4 % 128;
        int i5 = i4 % 2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0056, code lost:
    
        if (r4.unregisterClient.AFKeystoreWrapper.valueOf("appsFlyerCount", 1) <= 2) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0067, code lost:
    
        r1.putAll(r4.values.valueOf());
        r6 = com.appsflyer.internal.AFg1jSDK.afVerboseLog + 27;
        com.appsflyer.internal.AFg1jSDK.afErrorLog = r6 % 128;
        r6 = r6 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0065, code lost:
    
        if (r4.unregisterClient.AFKeystoreWrapper.valueOf("appsFlyerCount", 0) <= 2) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void AFInAppEventType(Map<String, Object> map, boolean z) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(map, "");
        HashMap hashMap = new HashMap();
        hashMap.put("cpu_abi", AFInAppEventType("ro.product.cpu.abi"));
        hashMap.put("cpu_abi2", AFInAppEventType("ro.product.cpu.abi2"));
        hashMap.put("arch", AFInAppEventType("os.arch"));
        hashMap.put("build_display_id", AFInAppEventType("ro.build.display.id"));
        if (z) {
            int i2 = afErrorLog + 5;
            afVerboseLog = i2 % 128;
            if (i2 % 2 == 0) {
                e(hashMap);
            } else {
                e(hashMap);
            }
        }
        hashMap.put("dim", this.AFInAppEventType.valueOf(this.AFKeystoreWrapper));
        map.put("deviceData", hashMap);
    }

    @Override // com.appsflyer.internal.AFg1mSDK
    public final void values(Map<String, Object> map) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(map, "");
        AFi1xSDK aFi1xSDK = this.registerClient.valueOf;
        AFi1wSDK AFInAppEventType = aFi1xSDK != null ? aFi1xSDK.AFInAppEventType() : null;
        if (AFInAppEventType == null) {
            int i2 = afVerboseLog + 61;
            afErrorLog = i2 % 128;
            int i3 = i2 % 2;
            return;
        }
        map.put("network", AFInAppEventType.AFInAppEventParameterName);
        map.put("ivc", Boolean.valueOf(AFInAppEventType.values()));
        if (!(!AFKeystoreWrapper().getBoolean(AppsFlyerProperties.DISABLE_NETWORK_DATA, false))) {
            return;
        }
        String str = AFInAppEventType.AFKeystoreWrapper;
        if (str != null) {
            map.put("operator", str);
        }
        String str2 = AFInAppEventType.values;
        if (str2 != null) {
            map.put("carrier", str2);
            int i4 = afVerboseLog + 71;
            afErrorLog = i4 % 128;
            int i5 = i4 % 2;
        }
    }

    @Override // com.appsflyer.internal.AFg1mSDK
    public final void valueOf(Map<String, Object> map, int i, int i2) {
        int i3 = 2 % 2;
        int i4 = afErrorLog + 57;
        afVerboseLog = i4 % 128;
        if (i4 % 2 == 0) {
            Intrinsics.checkNotNullParameter(map, "");
            map.put("counter", String.valueOf(i));
            map.put("iaecounter", String.valueOf(i2));
            afInfoLog();
            throw null;
        }
        Intrinsics.checkNotNullParameter(map, "");
        map.put("counter", String.valueOf(i));
        map.put("iaecounter", String.valueOf(i2));
        map.put("isFirstCall", String.valueOf(!afInfoLog()));
        int i5 = afErrorLog + 95;
        afVerboseLog = i5 % 128;
        int i6 = i5 % 2;
    }

    @Override // com.appsflyer.internal.AFg1mSDK
    public final void valueOf(AFa1qSDK aFa1qSDK) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(aFa1qSDK, "");
        Map<String, Object> AFInAppEventParameterName = aFa1qSDK.AFInAppEventParameterName();
        Intrinsics.checkNotNullExpressionValue(AFInAppEventParameterName, "");
        AFInAppEventParameterName.put("open_referrer", aFa1qSDK.valueOf);
        String str = aFa1qSDK.d;
        if (str != null) {
            int i2 = afErrorLog + 37;
            afVerboseLog = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 18 / 0;
                if (!(!StringsKt.isBlank(str))) {
                    return;
                }
            } else if (StringsKt.isBlank(str)) {
                return;
            }
            int i4 = afVerboseLog + 79;
            afErrorLog = i4 % 128;
            if (i4 % 2 == 0) {
                AFInAppEventParameterName.put("af_web_referrer", aFa1qSDK.d);
                return;
            }
            AFInAppEventParameterName.put("af_web_referrer", aFa1qSDK.d);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    private final void e(Map<String, Object> map) {
        int i = 2 % 2;
        int i2 = afVerboseLog + 21;
        afErrorLog = i2 % 128;
        int i3 = i2 % 2;
        AFd1vSDK.AFa1uSDK AFInAppEventParameterName = this.AFInAppEventParameterName.AFInAppEventParameterName(this.AFKeystoreWrapper);
        float f = AFInAppEventParameterName.valueOf;
        String str = AFInAppEventParameterName.values;
        map.put("btl", String.valueOf(f));
        if (str != null) {
            int i4 = afErrorLog + 43;
            afVerboseLog = i4 % 128;
            int i5 = i4 % 2;
            map.put("btch", str);
            if (i5 == 0) {
                int i6 = 91 / 0;
            }
        }
        int i7 = afVerboseLog + 91;
        afErrorLog = i7 % 128;
        if (i7 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private void d(Map<String, Object> map) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(map, "");
        String string = AFKeystoreWrapper().getString(AppsFlyerProperties.ONELINK_ID);
        String string2 = AFKeystoreWrapper().getString(AppsFlyerProperties.ONELINK_VERSION);
        Object obj = null;
        if (string != null) {
            int i2 = afVerboseLog + 51;
            afErrorLog = i2 % 128;
            if (i2 % 2 != 0) {
                map.put("onelink_id", string);
                throw null;
            }
            map.put("onelink_id", string);
        }
        if (string2 != null) {
            map.put("onelink_ver", string2);
        }
        int i3 = afErrorLog + 125;
        afVerboseLog = i3 % 128;
        if (i3 % 2 != 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    private void unregisterClient(Map<String, ? extends Object> map) {
        boolean z;
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(map, "");
        AFh1wSDK aFh1wSDK = this.e;
        HashMap hashMap = new HashMap(aFh1wSDK.AFInAppEventType);
        aFh1wSDK.AFInAppEventType.clear();
        this.e.AFInAppEventParameterName.AFKeystoreWrapper("gcd");
        Intrinsics.checkNotNullExpressionValue(hashMap, "");
        if (hashMap.isEmpty()) {
            int i2 = afErrorLog + 3;
            afVerboseLog = i2 % 128;
            int i3 = i2 % 2;
            z = false;
        } else {
            int i4 = afVerboseLog + 125;
            afErrorLog = i4 % 128;
            int i5 = i4 % 2;
            z = true;
        }
        if (!z) {
            return;
        }
        int i6 = afVerboseLog + 85;
        afErrorLog = i6 % 128;
        if (i6 % 2 == 0) {
            Map<String, Object> AFInAppEventParameterName = AFb1vSDK.AFInAppEventParameterName(map);
            Intrinsics.checkNotNullExpressionValue(AFInAppEventParameterName, "");
            AFInAppEventParameterName.put("gcd", hashMap);
        } else {
            Map<String, Object> AFInAppEventParameterName2 = AFb1vSDK.AFInAppEventParameterName(map);
            Intrinsics.checkNotNullExpressionValue(AFInAppEventParameterName2, "");
            AFInAppEventParameterName2.put("gcd", hashMap);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    private void AFKeystoreWrapper(Map<String, Object> map, String str) {
        int i = 2 % 2;
        int i2 = afVerboseLog + 43;
        afErrorLog = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(map, "");
        Intrinsics.checkNotNullParameter(str, "");
        try {
            String AFKeystoreWrapper = this.AFLogger.AFKeystoreWrapper("prev_event_name", (String) null);
            if (AFKeystoreWrapper != null) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("prev_event_timestamp", this.AFLogger.values("prev_event_timestamp", -1L));
                jSONObject.put("prev_event_name", AFKeystoreWrapper);
                map.put("prev_event", jSONObject);
            }
            this.AFLogger.AFInAppEventParameterName("prev_event_name", str);
            this.AFLogger.AFKeystoreWrapper("prev_event_timestamp", System.currentTimeMillis());
            int i4 = afErrorLog + 59;
            afVerboseLog = i4 % 128;
            int i5 = i4 % 2;
        } catch (Exception e) {
            AFLogger.afErrorLog("Error while processing previous event.", e);
        }
    }

    private String d() {
        int i = 2 % 2;
        int i2 = afVerboseLog + 103;
        afErrorLog = i2 % 128;
        if (i2 % 2 == 0) {
            if (!this.AFLogger.values("INSTALL_STORE")) {
                r3 = !(registerClient() ^ true) ? e() : null;
                this.AFLogger.AFInAppEventParameterName("INSTALL_STORE", r3);
                return r3;
            }
            int i3 = afVerboseLog + 97;
            afErrorLog = i3 % 128;
            if (i3 % 2 == 0) {
                return this.AFLogger.AFKeystoreWrapper("INSTALL_STORE", (String) null);
            }
            this.AFLogger.AFKeystoreWrapper("INSTALL_STORE", (String) null);
            r3.hashCode();
            throw null;
        }
        this.AFLogger.values("INSTALL_STORE");
        r3.hashCode();
        throw null;
    }

    private String e() {
        int i = 2 % 2;
        String string = AFKeystoreWrapper().getString(AppsFlyerProperties.AF_STORE_FROM_API);
        if (string == null) {
            int i2 = afErrorLog + 55;
            afVerboseLog = i2 % 128;
            int i3 = i2 % 2;
            string = valueOf("AF_STORE");
        }
        int i4 = afErrorLog + 121;
        afVerboseLog = i4 % 128;
        int i5 = i4 % 2;
        return string;
    }

    private String AFInAppEventParameterName(SimpleDateFormat simpleDateFormat) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(simpleDateFormat, "");
        String AFKeystoreWrapper = this.AFLogger.AFKeystoreWrapper("appsFlyerFirstInstall", (String) null);
        if (AFKeystoreWrapper == null) {
            int i2 = afErrorLog + 3;
            afVerboseLog = i2 % 128;
            if (i2 % 2 == 0) {
                registerClient();
                throw null;
            }
            if (registerClient()) {
                AFLogger.afDebugLog("AppsFlyer: first launch detected");
                AFKeystoreWrapper = simpleDateFormat.format(new Date());
            } else {
                AFKeystoreWrapper = "";
            }
            this.AFLogger.AFInAppEventParameterName("appsFlyerFirstInstall", AFKeystoreWrapper);
        }
        AFg1fSDK.i$default(AFLogger.INSTANCE, AFg1aSDK.GENERAL, "AppsFlyer: first launch date: ".concat(String.valueOf(AFKeystoreWrapper)), false, 4, null);
        Intrinsics.checkNotNullExpressionValue(AFKeystoreWrapper, "");
        int i3 = afVerboseLog + 59;
        afErrorLog = i3 % 128;
        int i4 = i3 % 2;
        return AFKeystoreWrapper;
    }

    private boolean registerClient() {
        int i = 2 % 2;
        int i2 = afVerboseLog + 59;
        afErrorLog = i2 % 128;
        int i3 = i2 % 2;
        if (!(!this.AFLogger.values("appsFlyerCount"))) {
            return false;
        }
        int i4 = afVerboseLog + 41;
        afErrorLog = i4 % 128;
        return i4 % 2 == 0;
    }

    private boolean afInfoLog() {
        int i = 2 % 2;
        int i2 = afErrorLog + 93;
        afVerboseLog = i2 % 128;
        int i3 = i2 % 2;
        boolean parseBoolean = Boolean.parseBoolean(this.AFLogger.AFKeystoreWrapper("sentSuccessfully", (String) null));
        int i4 = afVerboseLog + 41;
        afErrorLog = i4 % 128;
        if (i4 % 2 == 0) {
            return parseBoolean;
        }
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0042, code lost:
    
        if (r1 == null) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x004b, code lost:
    
        r1 = valueOf("AF_PRE_INSTALL_NAME");
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0049, code lost:
    
        if (r1 == null) goto L17;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private String w() {
        int i = 2 % 2;
        int i2 = afErrorLog + 63;
        afVerboseLog = i2 % 128;
        int i3 = i2 % 2;
        String string = AFKeystoreWrapper().getString("preInstallName");
        if (string != null) {
            return string;
        }
        if (this.AFLogger.values("preInstallName")) {
            string = this.AFLogger.AFKeystoreWrapper("preInstallName", (String) null);
        } else {
            if (registerClient()) {
                int i4 = afErrorLog + 63;
                afVerboseLog = i4 % 128;
                if (i4 % 2 == 0) {
                    string = v();
                    int i5 = 13 / 0;
                } else {
                    string = v();
                }
            }
            if (string != null) {
                this.AFLogger.AFInAppEventParameterName("preInstallName", string);
            }
        }
        if (string != null) {
            AFKeystoreWrapper().set("preInstallName", string);
        }
        int i6 = afVerboseLog + 27;
        afErrorLog = i6 % 128;
        int i7 = i6 % 2;
        return string;
    }

    private void AFInAppEventParameterName(Map<String, Object> map, String str) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(map, "");
        if (AFKeystoreWrapper().getBoolean(AppsFlyerProperties.DEVICE_TRACKING_DISABLED, false)) {
            int i2 = afVerboseLog + 67;
            afErrorLog = i2 % 128;
            if (i2 % 2 == 0) {
                map.put(AppsFlyerProperties.DEVICE_TRACKING_DISABLED, "true");
                return;
            } else {
                map.put(AppsFlyerProperties.DEVICE_TRACKING_DISABLED, "true");
                int i3 = 50 / 0;
                return;
            }
        }
        Object AFInAppEventParameterName = this.d.AFInAppEventParameterName(this.AFLogger);
        String str2 = (CharSequence) AFInAppEventParameterName;
        if (str2 != null && str2.length() != 0) {
            int i4 = afVerboseLog;
            int i5 = i4 + 5;
            afErrorLog = i5 % 128;
            int i6 = i5 % 2;
            int i7 = i4 + 59;
            afErrorLog = i7 % 128;
            if (i7 % 2 != 0) {
                map.put("imei", AFInAppEventParameterName);
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            map.put("imei", AFInAppEventParameterName);
        }
        String AFKeystoreWrapper = AFKeystoreWrapper(str);
        if (AFKeystoreWrapper != null) {
            int i8 = afErrorLog + 49;
            afVerboseLog = i8 % 128;
            int i9 = i8 % 2;
            this.AFLogger.AFInAppEventParameterName("androidIdCached", AFKeystoreWrapper);
            map.put("android_id", AFKeystoreWrapper);
        } else {
            AFLogger.afInfoLog("Android ID was not collected.");
        }
        AFb1zSDK AFInAppEventType = AFb1rSDK.AFInAppEventType(this.AFKeystoreWrapper);
        if (AFInAppEventType != null) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            Boolean bool = AFInAppEventType.values;
            Intrinsics.checkNotNullExpressionValue(bool, "");
            linkedHashMap.put("isManual", bool);
            String str3 = AFInAppEventType.AFInAppEventParameterName;
            Intrinsics.checkNotNullExpressionValue(str3, "");
            linkedHashMap.put("val", str3);
            Boolean bool2 = AFInAppEventType.AFKeystoreWrapper;
            if (bool2 != null) {
                linkedHashMap.put("isLat", bool2);
            }
            map.put("oaid", linkedHashMap);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0041, code lost:
    
        if (r1 == 0) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0044, code lost:
    
        if (r1 == 0) goto L18;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final String AFKeystoreWrapper(String str) {
        int i = 2 % 2;
        int i2 = afVerboseLog + 93;
        afErrorLog = i2 % 128;
        boolean z = false;
        if (i2 % 2 == 0 ? !(!AFKeystoreWrapper().getBoolean(AppsFlyerProperties.COLLECT_ANDROID_ID, false)) : AFKeystoreWrapper().getBoolean(AppsFlyerProperties.COLLECT_ANDROID_ID, true)) {
            String str2 = str;
            if (str2 != null) {
                int i3 = afVerboseLog + 11;
                afErrorLog = i3 % 128;
                int i4 = i3 % 2;
                int length = str2.length();
                if (i4 != 0) {
                    int i5 = 99 / 0;
                }
            }
            z = true;
            if (z) {
                if (force()) {
                    return i();
                }
                return null;
            }
        }
        if (str != null) {
            int i6 = afErrorLog + 99;
            afVerboseLog = i6 % 128;
            int i7 = i6 % 2;
            return str;
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final String i() {
        String str;
        int i = 2 % 2;
        int i2 = afErrorLog + 7;
        afVerboseLog = i2 % 128;
        int i3 = i2 % 2;
        try {
        } catch (Exception e) {
            AFLogger.afErrorLog(e.getMessage(), e);
            str = i3;
        }
        if (i3 != 0) {
            String AFKeystoreWrapper = this.AFLogger.AFKeystoreWrapper("androidIdCached", (String) null);
            String string = Settings.Secure.getString(this.AFKeystoreWrapper.getContentResolver(), "android_id");
            str = AFKeystoreWrapper;
            if (string != null) {
                return string;
            }
            if (str == 0) {
                return null;
            }
            int i4 = afVerboseLog + 61;
            afErrorLog = i4 % 128;
            int i5 = i4 % 2;
            AFLogger.afDebugLog("use cached AndroidId: ".concat(String.valueOf(str)));
            return str;
        }
        this.AFLogger.AFKeystoreWrapper("androidIdCached", (String) null);
        Settings.Secure.getString(this.AFKeystoreWrapper.getContentResolver(), "android_id");
        throw null;
    }

    private static void registerClient(Map<String, Object> map) {
        int i = 2 % 2;
        int i2 = afErrorLog + 75;
        afVerboseLog = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(map, "");
        Object[] objArr = new Object[1];
        a("\r\t\u0007\n㙑", 4 - TextUtils.lastIndexOf("", '0'), (byte) ((TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 83), objArr);
        map.put(((String) objArr[0]).intern(), Build.BRAND);
        map.put("device", Build.DEVICE);
        map.put("product", Build.PRODUCT);
        map.put("sdk", String.valueOf(Build.VERSION.SDK_INT));
        map.put("model", Build.MODEL);
        map.put("deviceType", Build.TYPE);
        int i4 = afVerboseLog + 93;
        afErrorLog = i4 % 128;
        int i5 = i4 % 2;
    }

    private void AFInAppEventType(AFa1qSDK aFa1qSDK, String str, String str2, AFc1cSDK aFc1cSDK) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(aFa1qSDK, "");
        Map<String, Object> AFInAppEventParameterName = aFa1qSDK.AFInAppEventParameterName();
        if (aFa1qSDK.values() == AFf1zSDK.CONVERSION) {
            int i2 = afVerboseLog + 115;
            afErrorLog = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.checkNotNullExpressionValue(AFInAppEventParameterName, "");
            AFLogger(AFInAppEventParameterName);
            force(AFInAppEventParameterName);
            i(AFInAppEventParameterName);
            AFb1cSDK.valueOf(this.force, this.AFLogger);
        }
        Intrinsics.checkNotNullExpressionValue(AFInAppEventParameterName, "");
        w(AFInAppEventParameterName);
        d(AFInAppEventParameterName);
        unregisterClient(AFInAppEventParameterName);
        valueOf(AFInAppEventParameterName, str2);
        AFInAppEventType(AFInAppEventParameterName, str);
        v(AFInAppEventParameterName);
        if (aFc1cSDK != null) {
            aFc1cSDK.values(AFInAppEventParameterName);
            int i4 = afErrorLog + 35;
            afVerboseLog = i4 % 128;
            if (i4 % 2 == 0) {
                throw null;
            }
        }
    }

    private final void AFLogger(Map<String, Object> map) {
        int i = 2 % 2;
        int i2 = afVerboseLog + 25;
        afErrorLog = i2 % 128;
        int i3 = i2 % 2;
        if (!AFKeystoreWrapper().isOtherSdkStringDisabled()) {
            map.put("batteryLevel", String.valueOf(this.AFInAppEventParameterName.AFInAppEventParameterName(this.AFKeystoreWrapper).valueOf));
        }
        int i4 = afErrorLog + 13;
        afVerboseLog = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private final void force(Map<String, Object> map) {
        int i = 2 % 2;
        UiModeManager uiModeManager = (UiModeManager) this.AFKeystoreWrapper.getSystemService(UiModeManager.class);
        if (uiModeManager == null || uiModeManager.getCurrentModeType() != 4) {
            return;
        }
        int i2 = afErrorLog + 103;
        afVerboseLog = i2 % 128;
        if (i2 % 2 != 0) {
            map.put("tv", Boolean.TRUE);
        } else {
            map.put("tv", Boolean.TRUE);
            int i3 = 12 / 0;
        }
    }

    private final void i(Map<String, Object> map) {
        int i = 2 % 2;
        if (AFg1dSDK.values(this.AFKeystoreWrapper)) {
            int i2 = afErrorLog + 115;
            afVerboseLog = i2 % 128;
            int i3 = i2 % 2;
            map.put("inst_app", Boolean.TRUE);
            int i4 = afVerboseLog + 51;
            afErrorLog = i4 % 128;
            int i5 = i4 % 2;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x003f, code lost:
    
        if (r1 > 0) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0028, code lost:
    
        if (r1 > 0) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0052, code lost:
    
        r1 = -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0041, code lost:
    
        r1 = java.util.concurrent.TimeUnit.MILLISECONDS.toSeconds(r6 - r1);
        r3 = com.appsflyer.internal.AFg1jSDK.afVerboseLog + 95;
        com.appsflyer.internal.AFg1jSDK.afErrorLog = r3 % 128;
        r3 = r3 % 2;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void w(Map<String, Object> map) {
        long values;
        long currentTimeMillis;
        long seconds;
        int i = 2 % 2;
        int i2 = afErrorLog + 59;
        afVerboseLog = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(map, "");
            values = this.AFLogger.values("AppsFlyerTimePassedSincePrevLaunch", 0L);
            currentTimeMillis = System.currentTimeMillis();
            this.AFLogger.AFKeystoreWrapper("AppsFlyerTimePassedSincePrevLaunch", currentTimeMillis);
        } else {
            Intrinsics.checkNotNullParameter(map, "");
            values = this.AFLogger.values("AppsFlyerTimePassedSincePrevLaunch", 0L);
            currentTimeMillis = System.currentTimeMillis();
            this.AFLogger.AFKeystoreWrapper("AppsFlyerTimePassedSincePrevLaunch", currentTimeMillis);
        }
        map.put("timepassedsincelastlaunch", String.valueOf(seconds));
    }

    private static void valueOf(Map<String, Object> map, String str) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(map, "");
        if (str != null) {
            int i2 = afErrorLog + 125;
            afVerboseLog = i2 % 128;
            int i3 = i2 % 2;
            map.put(HintConstants.AUTOFILL_HINT_PHONE, str);
            int i4 = afErrorLog + 81;
            afVerboseLog = i4 % 128;
            int i5 = i4 % 2;
        }
    }

    private void AFInAppEventType(Map<String, Object> map, String str) {
        int i = 2 % 2;
        int i2 = afErrorLog + 95;
        afVerboseLog = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(map, "");
        String str2 = str;
        if (!(str2 == null || str2.length() == 0)) {
            map.put("referrer", str);
        }
        String AFKeystoreWrapper = this.AFLogger.AFKeystoreWrapper("extraReferrers", (String) null);
        if (AFKeystoreWrapper != null) {
            int i4 = afVerboseLog + 93;
            afErrorLog = i4 % 128;
            if (i4 % 2 != 0) {
                map.put("extraReferrers", AFKeystoreWrapper);
                int i5 = 25 / 0;
            } else {
                map.put("extraReferrers", AFKeystoreWrapper);
            }
        }
        String referrer = AFKeystoreWrapper().getReferrer(this.AFLogger);
        String str3 = referrer;
        if (str3 == null || str3.length() == 0) {
            int i6 = afVerboseLog + 25;
            afErrorLog = i6 % 128;
            int i7 = i6 % 2;
        } else if (map.get("referrer") == null) {
            int i8 = afVerboseLog + 51;
            afErrorLog = i8 % 128;
            if (i8 % 2 == 0) {
                map.put("referrer", referrer);
            } else {
                map.put("referrer", referrer);
                int i9 = 32 / 0;
            }
        }
    }

    private void v(Map<String, Object> map) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(map, "");
        long j = this.e.v;
        if (j != 0) {
            int i2 = afVerboseLog + 41;
            afErrorLog = i2 % 128;
            int i3 = i2 % 2;
            map.put("prev_session_dur", Long.valueOf(j));
            int i4 = afVerboseLog + 63;
            afErrorLog = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 3 / 5;
            }
        }
        int i6 = afVerboseLog + 117;
        afErrorLog = i6 % 128;
        if (i6 % 2 != 0) {
            int i7 = 76 / 0;
        }
    }

    private static void afInfoLog(Map<String, Object> map) {
        int i = 2 % 2;
        int i2 = afErrorLog + 93;
        afVerboseLog = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(map, "");
        AFb1cSDK aFb1cSDK = AFb1cSDK.INSTANCE;
        Object AFInAppEventType = AFb1cSDK.AFInAppEventType();
        AFb1cSDK aFb1cSDK2 = AFb1cSDK.INSTANCE;
        String AFKeystoreWrapper = AFb1cSDK.AFKeystoreWrapper();
        if (AFInAppEventType != null) {
            int i4 = afErrorLog + 31;
            afVerboseLog = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 29 / 0;
                if (AFKeystoreWrapper == null) {
                    return;
                }
            } else if (AFKeystoreWrapper == null) {
                return;
            }
            if (Integer.parseInt(AFKeystoreWrapper) > 0) {
                map.put("reinstallCounter", AFKeystoreWrapper);
                map.put("originalAppsflyerId", AFInAppEventType);
                int i6 = afErrorLog + 99;
                afVerboseLog = i6 % 128;
                int i7 = i6 % 2;
            }
        }
    }

    private void afDebugLog(Map<String, Object> map) {
        int i = 2 % 2;
        int i2 = afVerboseLog + 27;
        afErrorLog = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(map, "");
        map.putAll(this.v.values());
        int i4 = afErrorLog + 117;
        afVerboseLog = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    private void afVerboseLog(Map<String, Object> map) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(map, "");
        String string = AFKeystoreWrapper().getString(AppsFlyerProperties.EXTENSION);
        String str = string;
        if (!(!(str == null || str.length() == 0))) {
            return;
        }
        int i2 = afVerboseLog + 45;
        afErrorLog = i2 % 128;
        int i3 = i2 % 2;
        map.put(AppsFlyerProperties.EXTENSION, string);
        int i4 = afErrorLog + 119;
        afVerboseLog = i4 % 128;
        int i5 = i4 % 2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x004a, code lost:
    
        if ((r3 % 2) == 0) goto L17;
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00c0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void afRDLog(Map<String, Object> map) {
        boolean z;
        String d;
        String w;
        String e;
        int i = 2 % 2;
        int i2 = afVerboseLog + 99;
        afErrorLog = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(map, "");
        String d2 = this.unregisterClient.d();
        String values = values(this.AFLogger, d2);
        boolean z2 = true;
        Object obj = null;
        if (values != null) {
            int i4 = afErrorLog + 87;
            afVerboseLog = i4 % 128;
            if (i4 % 2 == 0) {
                Intrinsics.areEqual(values, d2);
                obj.hashCode();
                throw null;
            }
            if (!Intrinsics.areEqual(values, d2)) {
                z = true;
                if (values == null && d2 != null) {
                    int i5 = afVerboseLog + 117;
                    afErrorLog = i5 % 128;
                }
                z2 = false;
                if (!z || z2) {
                    map.put("af_latestchannel", d2);
                }
                d = d();
                if (d != null) {
                    int i6 = afVerboseLog + 25;
                    afErrorLog = i6 % 128;
                    if (i6 % 2 != 0) {
                        Locale locale = Locale.getDefault();
                        Intrinsics.checkNotNullExpressionValue(locale, "");
                        Object lowerCase = d.toLowerCase(locale);
                        Intrinsics.checkNotNullExpressionValue(lowerCase, "");
                        map.put("af_installstore", lowerCase);
                        throw null;
                    }
                    Locale locale2 = Locale.getDefault();
                    Intrinsics.checkNotNullExpressionValue(locale2, "");
                    Object lowerCase2 = d.toLowerCase(locale2);
                    Intrinsics.checkNotNullExpressionValue(lowerCase2, "");
                    map.put("af_installstore", lowerCase2);
                }
                w = w();
                if (w != null) {
                    Locale locale3 = Locale.getDefault();
                    Intrinsics.checkNotNullExpressionValue(locale3, "");
                    Object lowerCase3 = w.toLowerCase(locale3);
                    Intrinsics.checkNotNullExpressionValue(lowerCase3, "");
                    map.put("af_preinstall_name", lowerCase3);
                }
                e = e();
                if (e != null) {
                    int i7 = afErrorLog + 85;
                    afVerboseLog = i7 % 128;
                    int i8 = i7 % 2;
                    return;
                } else {
                    Locale locale4 = Locale.getDefault();
                    Intrinsics.checkNotNullExpressionValue(locale4, "");
                    Object lowerCase4 = e.toLowerCase(locale4);
                    Intrinsics.checkNotNullExpressionValue(lowerCase4, "");
                    map.put("af_currentstore", lowerCase4);
                    return;
                }
            }
        }
        z = false;
        if (values == null) {
            int i52 = afVerboseLog + 117;
            afErrorLog = i52 % 128;
        }
        z2 = false;
        if (!z) {
        }
        map.put("af_latestchannel", d2);
        d = d();
        if (d != null) {
        }
        w = w();
        if (w != null) {
        }
        e = e();
        if (e != null) {
        }
    }

    private static void valueOf(Map<String, Object> map, boolean z) {
        int i = 2 % 2;
        int i2 = afErrorLog + 71;
        afVerboseLog = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(map, "");
            map.put("af_preinstalled", String.valueOf(z));
            obj.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(map, "");
        map.put("af_preinstalled", String.valueOf(z));
        int i3 = afErrorLog + 105;
        afVerboseLog = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
    }

    private static void afWarnLog(Map<String, Object> map) {
        int i = 2 % 2;
        int i2 = afVerboseLog + 41;
        afErrorLog = i2 % 128;
        try {
            if (i2 % 2 != 0) {
                Intrinsics.checkNotNullParameter(map, "");
                map.put("lang", Locale.getDefault().getDisplayLanguage());
                int i3 = 37 / 0;
            } else {
                Intrinsics.checkNotNullParameter(map, "");
                map.put("lang", Locale.getDefault().getDisplayLanguage());
            }
        } catch (Exception e) {
            AFLogger.afErrorLog("Exception while collecting display language name. ", e);
        }
        try {
            map.put("lang_code", Locale.getDefault().getLanguage());
            int i4 = afErrorLog + 117;
            afVerboseLog = i4 % 128;
            int i5 = i4 % 2;
        } catch (Exception e2) {
            AFLogger.afErrorLog("Exception while collecting display language code. ", e2);
        }
        try {
            map.put("country", Locale.getDefault().getCountry());
        } catch (Exception e3) {
            AFLogger.afErrorLog("Exception while collecting country name. ", e3);
        }
    }

    private void afErrorLog(Map<String, Object> map) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(map, "");
        try {
            String valueOf = AFb1kSDK.valueOf(this.force, this.AFLogger);
            if (valueOf != null) {
                int i2 = afVerboseLog + 87;
                afErrorLog = i2 % 128;
                int i3 = i2 % 2;
                map.put("uid", valueOf);
                return;
            }
        } catch (Throwable th) {
            String obj = new StringBuilder("ERROR: could not get uid ").append(th.getMessage()).toString();
            Intrinsics.checkNotNullExpressionValue(obj, "");
            AFLogger.afErrorLog(obj, th);
        }
        int i4 = afErrorLog + 41;
        afVerboseLog = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    private void afLogForce(Map<String, Object> map) {
        int i = 2 % 2;
        int i2 = afErrorLog + 79;
        afVerboseLog = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(map, "");
            AFLogger.afDebugLog("didConfigureTokenRefreshService=".concat(String.valueOf(AFg1nSDK.AFInAppEventParameterName(this.AFKeystoreWrapper))));
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(map, "");
        boolean AFInAppEventParameterName = AFg1nSDK.AFInAppEventParameterName(this.AFKeystoreWrapper);
        AFLogger.afDebugLog("didConfigureTokenRefreshService=".concat(String.valueOf(AFInAppEventParameterName)));
        if (!AFInAppEventParameterName) {
            map.put("tokenRefreshConfigured", Boolean.FALSE);
            int i3 = afVerboseLog + 23;
            afErrorLog = i3 % 128;
            int i4 = i3 % 2;
        }
        map.put("registeredUninstall", Boolean.valueOf(AFg1nSDK.valueOf(this.AFLogger)));
    }

    private void AFLogger$LogLevel(Map<String, Object> map) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(map, "");
        AFb1zSDK AFInAppEventParameterName = AFb1rSDK.AFInAppEventParameterName(this.AFKeystoreWrapper.getContentResolver());
        if (AFInAppEventParameterName != null) {
            int i2 = afVerboseLog + 33;
            afErrorLog = i2 % 128;
            int i3 = i2 % 2;
            map.put("amazon_aid", AFInAppEventParameterName.AFInAppEventParameterName);
            map.put("amazon_aid_limit", String.valueOf(AFInAppEventParameterName.AFKeystoreWrapper));
            int i4 = afErrorLog + 15;
            afVerboseLog = i4 % 128;
            if (i4 % 2 == 0) {
                throw null;
            }
        }
    }

    private void afErrorLogForExcManagerOnly(Map<String, Object> map) {
        int i = 2 % 2;
        int i2 = afVerboseLog + 45;
        afErrorLog = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(map, "");
        if (this.AFLogger.values("is_stop_tracking_used")) {
            int i4 = afErrorLog + 75;
            afVerboseLog = i4 % 128;
            int i5 = i4 % 2;
            map.put("istu", String.valueOf(this.AFLogger.AFInAppEventType("is_stop_tracking_used")));
            int i6 = afVerboseLog + 71;
            afErrorLog = i6 % 128;
            int i7 = i6 % 2;
        }
    }

    private void AFPurchaseDetails(Map<String, Object> map) {
        int i = 2 % 2;
        int i2 = afErrorLog + 117;
        afVerboseLog = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(map, "");
            String str = this.d.AFLogger;
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(map, "");
        String str2 = this.d.AFLogger;
        String str3 = str2;
        if (str3 == null || str3.length() == 0) {
            return;
        }
        int i3 = afErrorLog + 23;
        afVerboseLog = i3 % 128;
        int i4 = i3 % 2;
        map.put("appsflyerKey", str2);
        int i5 = afErrorLog + 123;
        afVerboseLog = i5 % 128;
        int i6 = i5 % 2;
    }

    private void valueOf(Map<String, Object> map, Function0<String> function0) {
        String invoke;
        int i = 2 % 2;
        int i2 = afErrorLog + 33;
        afVerboseLog = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(map, "");
        Intrinsics.checkNotNullParameter(function0, "");
        if (AFKeystoreWrapper().getBoolean(AppsFlyerProperties.COLLECT_FACEBOOK_ATTR_ID, true)) {
            int i4 = afErrorLog + 103;
            afVerboseLog = i4 % 128;
            String str = null;
            try {
                if (i4 % 2 == 0) {
                    this.AFKeystoreWrapper.getPackageManager().getApplicationInfo("com.facebook.katana", 1);
                    invoke = function0.invoke();
                } else {
                    this.AFKeystoreWrapper.getPackageManager().getApplicationInfo("com.facebook.katana", 0);
                    invoke = function0.invoke();
                }
                str = invoke;
            } catch (PackageManager.NameNotFoundException e) {
                AFLogger.afErrorLogForExcManagerOnly("com.facebook.katana not found", e, true);
                AFLogger.afWarnLog("Exception while collecting facebook's attribution ID. ");
            } catch (Throwable th) {
                AFLogger.afErrorLog("Exception while collecting facebook's attribution ID. ", th);
            }
            if (str != null) {
                int i5 = afVerboseLog + 25;
                afErrorLog = i5 % 128;
                int i6 = i5 % 2;
                map.put("fb", str);
            }
        }
    }

    private static String values(AFd1qSDK aFd1qSDK, String str) {
        int i = 2 % 2;
        String AFKeystoreWrapper = aFd1qSDK.AFKeystoreWrapper("CACHED_CHANNEL", (String) null);
        if (AFKeystoreWrapper == null) {
            aFd1qSDK.AFInAppEventParameterName("CACHED_CHANNEL", str);
            int i2 = afErrorLog + 97;
            afVerboseLog = i2 % 128;
            int i3 = i2 % 2;
            return str;
        }
        int i4 = afErrorLog + 39;
        afVerboseLog = i4 % 128;
        int i5 = i4 % 2;
        return AFKeystoreWrapper;
    }

    private static String AFInAppEventType(String str) {
        int i = 2 % 2;
        int i2 = afVerboseLog + 73;
        afErrorLog = i2 % 128;
        int i3 = i2 % 2;
        try {
            Object invoke = Class.forName("android.os.SystemProperties").getMethod("get", String.class).invoke(null, str);
            if (invoke != null) {
                String str2 = (String) invoke;
                int i4 = afVerboseLog + 35;
                afErrorLog = i4 % 128;
                int i5 = i4 % 2;
                return str2;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
        } catch (Throwable th) {
            AFLogger.afErrorLog(th.getMessage(), th);
            return null;
        }
    }

    private final String valueOf(String str) {
        int i = 2 % 2;
        int i2 = afVerboseLog + 3;
        afErrorLog = i2 % 128;
        int i3 = i2 % 2;
        String AFInAppEventType = this.unregisterClient.AFInAppEventType(str);
        int i4 = afErrorLog + 73;
        afVerboseLog = i4 % 128;
        int i5 = i4 % 2;
        return AFInAppEventType;
    }

    private final String v() {
        int i = 2 % 2;
        int i2 = afErrorLog + 109;
        afVerboseLog = i2 % 128;
        int i3 = i2 % 2;
        File AFInAppEventParameterName = AFInAppEventParameterName(AFInAppEventType("ro.appsflyer.preinstall.path"));
        if (!(!AFKeystoreWrapper(AFInAppEventParameterName))) {
            int i4 = afErrorLog + 93;
            afVerboseLog = i4 % 128;
            if (i4 % 2 == 0) {
                AFInAppEventParameterName = AFInAppEventParameterName(valueOf("AF_PRE_INSTALL_PATH"));
                int i5 = 93 / 0;
            } else {
                AFInAppEventParameterName = AFInAppEventParameterName(valueOf("AF_PRE_INSTALL_PATH"));
            }
        }
        Object obj = null;
        if (AFKeystoreWrapper(AFInAppEventParameterName)) {
            int i6 = afVerboseLog + 37;
            afErrorLog = i6 % 128;
            if (i6 % 2 != 0) {
                AFInAppEventParameterName("/data/local/tmp/pre_install.appsflyer");
                throw null;
            }
            AFInAppEventParameterName = AFInAppEventParameterName("/data/local/tmp/pre_install.appsflyer");
        }
        if (AFKeystoreWrapper(AFInAppEventParameterName)) {
            AFInAppEventParameterName = AFInAppEventParameterName("/etc/pre_install.appsflyer");
        }
        if (AFKeystoreWrapper(AFInAppEventParameterName)) {
            return null;
        }
        String packageName = this.AFKeystoreWrapper.getPackageName();
        Intrinsics.checkNotNullExpressionValue(packageName, "");
        String valueOf = valueOf(AFInAppEventParameterName, packageName);
        int i7 = afVerboseLog + 97;
        afErrorLog = i7 % 128;
        if (i7 % 2 == 0) {
            return valueOf;
        }
        obj.hashCode();
        throw null;
    }

    private static File AFInAppEventParameterName(String str) {
        int i = 2 % 2;
        if (str == null) {
            return null;
        }
        int i2 = afVerboseLog + 101;
        afErrorLog = i2 % 128;
        int i3 = i2 % 2;
        try {
            if (StringsKt.trim((CharSequence) str).toString().length() > 0) {
                int i4 = afVerboseLog + 125;
                afErrorLog = i4 % 128;
                int i5 = i4 % 2;
                return new File(StringsKt.trim((CharSequence) str).toString());
            }
            int i6 = afVerboseLog + 79;
            afErrorLog = i6 % 128;
            int i7 = i6 % 2;
            return null;
        } catch (Throwable th) {
            AFLogger.afErrorLog(th.getMessage(), th);
            return null;
        }
    }

    private static boolean AFKeystoreWrapper(File file) {
        int i = 2 % 2;
        int i2 = afErrorLog + 31;
        int i3 = i2 % 128;
        afVerboseLog = i3;
        if (i2 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        if (file == null) {
            return true;
        }
        int i4 = i3 + 65;
        afErrorLog = i4 % 128;
        int i5 = i4 % 2;
        boolean exists = file.exists();
        if (i5 != 0) {
            int i6 = 30 / 0;
            if (!exists) {
                return true;
            }
        } else if (!exists) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:28:0x008e  */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.util.Properties] */
    /* JADX WARN: Type inference failed for: r3v0, types: [int] */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v10, types: [java.io.Reader] */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.io.Reader] */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Type inference failed for: r3v6, types: [java.io.Reader] */
    /* JADX WARN: Type inference failed for: r3v7 */
    /* JADX WARN: Type inference failed for: r3v8, types: [java.io.Reader] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static String valueOf(File file, String str) {
        int i;
        int i2 = 2 % 2;
        int i3 = afVerboseLog;
        int i4 = i3 + 9;
        InputStreamReader inputStreamReader = i4 % 128;
        afErrorLog = inputStreamReader;
        int i5 = i4 % 2;
        try {
            try {
                if (file == null) {
                    int i6 = i3 + 45;
                    afErrorLog = i6 % 128;
                    if (i6 % 2 != 0) {
                        int i7 = 9 / 0;
                    }
                    return null;
                }
                try {
                    ?? properties = new Properties();
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
                        return property;
                    } catch (FileNotFoundException unused) {
                        AFLogger.afDebugLog(new StringBuilder("PreInstall file wasn't found: ").append(file.getAbsolutePath()).toString());
                        if (inputStreamReader != 0) {
                            inputStreamReader.close();
                            inputStreamReader = inputStreamReader;
                        }
                        i = afErrorLog + 97;
                        afVerboseLog = i % 128;
                        if (i % 2 == 0) {
                            int i8 = 43 / 0;
                        }
                        return null;
                    } catch (Throwable th2) {
                        th = th2;
                        AFLogger.afErrorLog(th.getMessage(), th);
                        if (inputStreamReader != 0) {
                            inputStreamReader.close();
                            inputStreamReader = inputStreamReader;
                        }
                        i = afErrorLog + 97;
                        afVerboseLog = i % 128;
                        if (i % 2 == 0) {
                        }
                        return null;
                    }
                } catch (FileNotFoundException unused2) {
                    inputStreamReader = 0;
                } catch (Throwable th3) {
                    th = th3;
                    inputStreamReader = 0;
                }
            } catch (Throwable th4) {
                if (inputStreamReader != 0) {
                    try {
                        inputStreamReader.close();
                    } catch (Throwable th5) {
                        AFLogger.afErrorLog(th5.getMessage(), th5);
                    }
                }
                throw th4;
            }
        } catch (Throwable th6) {
            AFLogger.afErrorLog(th6.getMessage(), th6);
        }
    }

    private final boolean force() {
        int i = 2 % 2;
        if (AFKeystoreWrapper().getBoolean(AppsFlyerProperties.COLLECT_ANDROID_ID_FORCE_BY_USER, false) || AFKeystoreWrapper().getBoolean(AppsFlyerProperties.COLLECT_IMEI_FORCE_BY_USER, false)) {
            return true;
        }
        int i2 = afVerboseLog + 69;
        int i3 = i2 % 128;
        afErrorLog = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 55;
        afVerboseLog = i5 % 128;
        int i6 = i5 % 2;
        AFb1vSDK.AFKeystoreWrapper();
        Context context = this.AFKeystoreWrapper;
        if (i6 != 0) {
            return !AFb1vSDK.values(context);
        }
        AFb1vSDK.values(context);
        throw null;
    }

    @Override // com.appsflyer.internal.AFg1mSDK
    public final void valueOf(Map<String, Object> map) {
        Object m6819constructorimpl;
        AFLogger aFLogger;
        AFg1aSDK aFg1aSDK;
        int i;
        Object obj;
        String str;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(map, "");
        String str2 = this.afInfoLog.values;
        if (str2 != null) {
            if (map.get("af_deeplink") != null) {
                int i3 = afVerboseLog + 105;
                afErrorLog = i3 % 128;
                if (i3 % 2 != 0) {
                    AFLogger.afDebugLog("Skip 'af' payload as deeplink was found by path");
                    throw null;
                }
                AFLogger.afDebugLog("Skip 'af' payload as deeplink was found by path");
            } else {
                try {
                    Result.Companion companion = Result.INSTANCE;
                    AFg1jSDK aFg1jSDK = this;
                    JSONObject jSONObject = new JSONObject(str2);
                    jSONObject.put("isPush", "true");
                    map.put("af_deeplink", jSONObject.toString());
                    m6819constructorimpl = Result.m6819constructorimpl(Unit.INSTANCE);
                } catch (Throwable th) {
                    Result.Companion companion2 = Result.INSTANCE;
                    m6819constructorimpl = Result.m6819constructorimpl(ResultKt.createFailure(th));
                }
                Throwable m6822exceptionOrNullimpl = Result.m6822exceptionOrNullimpl(m6819constructorimpl);
                if (m6822exceptionOrNullimpl != null) {
                    int i4 = afErrorLog + 71;
                    afVerboseLog = i4 % 128;
                    if (i4 % 2 == 0) {
                        aFLogger = AFLogger.INSTANCE;
                        aFg1aSDK = AFg1aSDK.GENERAL;
                        i = 31;
                        obj = null;
                        str = "Exception while trying to create JSONObject from pushPayload";
                        z = false;
                        z2 = false;
                        z3 = false;
                        z4 = true;
                    } else {
                        aFLogger = AFLogger.INSTANCE;
                        aFg1aSDK = AFg1aSDK.GENERAL;
                        i = MenuKt.InTransitionDuration;
                        obj = null;
                        str = "Exception while trying to create JSONObject from pushPayload";
                        z = false;
                        z2 = false;
                        z3 = false;
                        z4 = false;
                    }
                    AFg1fSDK.e$default(aFLogger, aFg1aSDK, str, m6822exceptionOrNullimpl, z, z2, z3, z4, i, obj);
                }
                Result.m6818boximpl(m6819constructorimpl);
            }
        }
        this.afInfoLog.values = null;
    }

    private static void AFInAppEventParameterName(Map<String, Object> map, AFa1qSDK aFa1qSDK) {
        Intrinsics.checkNotNullParameter(map, "");
        Intrinsics.checkNotNullParameter(aFa1qSDK, "");
        String str = aFa1qSDK.e;
        if (str != null) {
            map.put("eventName", str);
            map.put("eventValue", new JSONObject(aFa1qSDK.AFInAppEventParameterName == null ? new HashMap() : aFa1qSDK.AFInAppEventParameterName).toString());
        }
    }

    private static void a(String str, int i, byte b, Object[] objArr) {
        int i2;
        int i3 = 2 % 2;
        char[] cArr = str;
        if (str != null) {
            cArr = str.toCharArray();
        }
        char[] cArr2 = cArr;
        AFk1wSDK aFk1wSDK = new AFk1wSDK();
        char[] cArr3 = afDebugLog;
        if (cArr3 != null) {
            int length = cArr3.length;
            char[] cArr4 = new char[length];
            for (int i4 = 0; i4 < length; i4++) {
                cArr4[i4] = (char) (cArr3[i4] ^ 8472772857875446112L);
            }
            int i5 = $11 + 9;
            $10 = i5 % 128;
            int i6 = i5 % 2;
            cArr3 = cArr4;
        }
        char c = (char) (8472772857875446112L ^ afWarnLog);
        char[] cArr5 = new char[i];
        if (i % 2 != 0) {
            int i7 = $10 + 57;
            $11 = i7 % 128;
            if (i7 % 2 == 0) {
                i2 = i + 103;
                cArr5[i2] = (char) (cArr2[i2] / b);
            } else {
                i2 = i - 1;
                cArr5[i2] = (char) (cArr2[i2] - b);
            }
        } else {
            i2 = i;
        }
        if (i2 > 1) {
            aFk1wSDK.AFInAppEventType = 0;
            while (aFk1wSDK.AFInAppEventType < i2) {
                aFk1wSDK.AFInAppEventParameterName = cArr2[aFk1wSDK.AFInAppEventType];
                aFk1wSDK.AFKeystoreWrapper = cArr2[aFk1wSDK.AFInAppEventType + 1];
                if (aFk1wSDK.AFInAppEventParameterName == aFk1wSDK.AFKeystoreWrapper) {
                    cArr5[aFk1wSDK.AFInAppEventType] = (char) (aFk1wSDK.AFInAppEventParameterName - b);
                    cArr5[aFk1wSDK.AFInAppEventType + 1] = (char) (aFk1wSDK.AFKeystoreWrapper - b);
                    int i8 = $10 + 9;
                    $11 = i8 % 128;
                    int i9 = i8 % 2;
                } else {
                    aFk1wSDK.valueOf = aFk1wSDK.AFInAppEventParameterName / c;
                    aFk1wSDK.registerClient = aFk1wSDK.AFInAppEventParameterName % c;
                    aFk1wSDK.values = aFk1wSDK.AFKeystoreWrapper / c;
                    aFk1wSDK.unregisterClient = aFk1wSDK.AFKeystoreWrapper % c;
                    if (aFk1wSDK.registerClient == aFk1wSDK.unregisterClient) {
                        int i10 = $10 + 67;
                        $11 = i10 % 128;
                        int i11 = i10 % 2;
                        aFk1wSDK.valueOf = ((aFk1wSDK.valueOf + c) - 1) % c;
                        aFk1wSDK.values = ((aFk1wSDK.values + c) - 1) % c;
                        int i12 = (aFk1wSDK.valueOf * c) + aFk1wSDK.registerClient;
                        int i13 = (aFk1wSDK.values * c) + aFk1wSDK.unregisterClient;
                        cArr5[aFk1wSDK.AFInAppEventType] = cArr3[i12];
                        cArr5[aFk1wSDK.AFInAppEventType + 1] = cArr3[i13];
                    } else if (aFk1wSDK.valueOf == aFk1wSDK.values) {
                        aFk1wSDK.registerClient = ((aFk1wSDK.registerClient + c) - 1) % c;
                        aFk1wSDK.unregisterClient = ((aFk1wSDK.unregisterClient + c) - 1) % c;
                        int i14 = (aFk1wSDK.valueOf * c) + aFk1wSDK.registerClient;
                        int i15 = (aFk1wSDK.values * c) + aFk1wSDK.unregisterClient;
                        cArr5[aFk1wSDK.AFInAppEventType] = cArr3[i14];
                        cArr5[aFk1wSDK.AFInAppEventType + 1] = cArr3[i15];
                    } else {
                        int i16 = (aFk1wSDK.valueOf * c) + aFk1wSDK.unregisterClient;
                        int i17 = (aFk1wSDK.values * c) + aFk1wSDK.registerClient;
                        cArr5[aFk1wSDK.AFInAppEventType] = cArr3[i16];
                        cArr5[aFk1wSDK.AFInAppEventType + 1] = cArr3[i17];
                    }
                }
                aFk1wSDK.AFInAppEventType += 2;
            }
        }
        for (int i18 = 0; i18 < i; i18++) {
            cArr5[i18] = (char) (cArr5[i18] ^ 13722);
        }
        String str2 = new String(cArr5);
        int i19 = $10 + 83;
        $11 = i19 % 128;
        int i20 = i19 % 2;
        objArr[0] = str2;
    }
}
