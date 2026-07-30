package com.facebook.appevents.iap;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.os.Bundle;
import com.facebook.FacebookSdk;
import com.facebook.appevents.AppEventsConstants;
import com.facebook.appevents.OperationalData;
import com.facebook.appevents.OperationalDataEnum;
import com.facebook.appevents.iap.InAppPurchaseUtils;
import com.facebook.appevents.internal.AutomaticAnalyticsLogger;
import com.facebook.appevents.internal.Constants;
import com.facebook.internal.FeatureManager;
import com.facebook.internal.instrument.crashshield.CrashShieldHandler;
import defpackage.up2;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.b;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class InAppPurchaseManager {
    private static final String GOOGLE_BILLINGCLIENT_VERSION = "com.google.android.play.billingclient.version";
    private static String specificBillingLibraryVersion;
    public static final InAppPurchaseManager INSTANCE = new InAppPurchaseManager();
    private static final ConcurrentHashMap<InAppPurchase, List<Pair<Long, Pair<Bundle, OperationalData>>>> timesOfManualPurchases = new ConcurrentHashMap<>();
    private static final ConcurrentHashMap<InAppPurchase, List<Pair<Long, Pair<Bundle, OperationalData>>>> timesOfImplicitPurchases = new ConcurrentHashMap<>();
    private static final AtomicBoolean enabled = new AtomicBoolean(false);

    /* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[InAppPurchaseUtils.BillingClientVersion.values().length];
            try {
                iArr[InAppPurchaseUtils.BillingClientVersion.NONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[InAppPurchaseUtils.BillingClientVersion.V1.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[InAppPurchaseUtils.BillingClientVersion.V2_V4.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[InAppPurchaseUtils.BillingClientVersion.V5_V7.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private InAppPurchaseManager() {
    }

    public static final void enableAutoLogging() {
        if (CrashShieldHandler.isObjectCrashing(InAppPurchaseManager.class)) {
            return;
        }
        try {
            if (!AutomaticAnalyticsLogger.isImplicitPurchaseLoggingEnabled()) {
                InAppPurchaseLoggerManager.updateLatestPossiblePurchaseTime();
            } else {
                enabled.set(true);
                startTracking();
            }
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, InAppPurchaseManager.class);
        }
    }

    private final InAppPurchaseUtils.BillingClientVersion getBillingClientVersion() {
        try {
            if (CrashShieldHandler.isObjectCrashing(this)) {
                return null;
            }
            try {
                Context applicationContext = FacebookSdk.getApplicationContext();
                ApplicationInfo applicationInfo = applicationContext.getPackageManager().getApplicationInfo(applicationContext.getPackageName(), 128);
                applicationInfo.getClass();
                String string = applicationInfo.metaData.getString(GOOGLE_BILLINGCLIENT_VERSION);
                if (string == null) {
                    return InAppPurchaseUtils.BillingClientVersion.NONE;
                }
                List F = up2.F(3, 2, string, new String[]{"."});
                if (string.length() == 0) {
                    return InAppPurchaseUtils.BillingClientVersion.V5_V7;
                }
                setSpecificBillingLibraryVersion("GPBL.".concat(string));
                Integer f = b.f((String) F.get(0));
                if (f == null) {
                    return InAppPurchaseUtils.BillingClientVersion.V5_V7;
                }
                int intValue = f.intValue();
                return intValue == 1 ? InAppPurchaseUtils.BillingClientVersion.V1 : intValue < 5 ? InAppPurchaseUtils.BillingClientVersion.V2_V4 : InAppPurchaseUtils.BillingClientVersion.V5_V7;
            } catch (Exception unused) {
                return InAppPurchaseUtils.BillingClientVersion.V5_V7;
            }
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
            return null;
        }
    }

    public static /* synthetic */ String getDedupeParameter$default(InAppPurchaseManager inAppPurchaseManager, Bundle bundle, OperationalData operationalData, Bundle bundle2, OperationalData operationalData2, boolean z, boolean z2, int i, Object obj) {
        if (CrashShieldHandler.isObjectCrashing(InAppPurchaseManager.class)) {
            return null;
        }
        try {
            return inAppPurchaseManager.getDedupeParameter(bundle, operationalData, bundle2, operationalData2, z, (i & 32) != 0 ? false : z2);
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, InAppPurchaseManager.class);
            return null;
        }
    }

    public static final String getSpecificBillingLibraryVersion() {
        if (CrashShieldHandler.isObjectCrashing(InAppPurchaseManager.class)) {
            return null;
        }
        try {
            return specificBillingLibraryVersion;
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, InAppPurchaseManager.class);
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0188 A[Catch: all -> 0x0081, TryCatch #0 {all -> 0x0081, blocks: (B:22:0x0065, B:24:0x0078, B:26:0x008e, B:29:0x0096, B:30:0x009f, B:32:0x00a5, B:36:0x00d4, B:39:0x00dc, B:44:0x00f7, B:56:0x0112, B:57:0x0118, B:60:0x0128, B:62:0x012f, B:63:0x0139, B:67:0x0152, B:69:0x015a, B:70:0x0162, B:72:0x016a, B:74:0x01a9, B:78:0x0180, B:80:0x0188, B:81:0x0190, B:83:0x0198, B:89:0x0084, B:98:0x01b4, B:100:0x01bd, B:102:0x01c7, B:105:0x01df, B:106:0x01e4, B:108:0x01ea, B:112:0x0206, B:125:0x020e, B:131:0x0214, B:128:0x021c, B:115:0x0224, B:122:0x022a, B:118:0x0232, B:137:0x01d2), top: B:21:0x0065 }] */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0198 A[Catch: all -> 0x0081, TryCatch #0 {all -> 0x0081, blocks: (B:22:0x0065, B:24:0x0078, B:26:0x008e, B:29:0x0096, B:30:0x009f, B:32:0x00a5, B:36:0x00d4, B:39:0x00dc, B:44:0x00f7, B:56:0x0112, B:57:0x0118, B:60:0x0128, B:62:0x012f, B:63:0x0139, B:67:0x0152, B:69:0x015a, B:70:0x0162, B:72:0x016a, B:74:0x01a9, B:78:0x0180, B:80:0x0188, B:81:0x0190, B:83:0x0198, B:89:0x0084, B:98:0x01b4, B:100:0x01bd, B:102:0x01c7, B:105:0x01df, B:106:0x01e4, B:108:0x01ea, B:112:0x0206, B:125:0x020e, B:131:0x0214, B:128:0x021c, B:115:0x0224, B:122:0x022a, B:118:0x0232, B:137:0x01d2), top: B:21:0x0065 }] */
    /* JADX WARN: Removed duplicated region for block: B:85:0x01a9 A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r11v2 */
    /* JADX WARN: Type inference failed for: r11v3, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r11v4 */
    /* JADX WARN: Type inference failed for: r11v5 */
    /* JADX WARN: Type inference failed for: r11v6 */
    /* JADX WARN: Type inference failed for: r11v7, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r4v22 */
    /* JADX WARN: Type inference failed for: r4v23 */
    /* JADX WARN: Type inference failed for: r4v24 */
    /* JADX WARN: Type inference failed for: r4v25 */
    /* JADX WARN: Type inference failed for: r4v26 */
    /* JADX WARN: Type inference failed for: r4v27 */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r4v8, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1, types: [android.os.Bundle] */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v3 */
    /* JADX WARN: Type inference failed for: r6v4, types: [android.os.BaseBundle] */
    /* JADX WARN: Type inference failed for: r6v5, types: [android.os.Bundle] */
    /* JADX WARN: Type inference failed for: r6v6, types: [android.os.BaseBundle] */
    /* JADX WARN: Type inference failed for: r6v7 */
    /* JADX WARN: Type inference failed for: r6v8 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final synchronized Bundle performDedupe(List<InAppPurchase> list, long j, boolean z, List<Pair<Bundle, OperationalData>> list2) {
        Bundle bundle;
        ?? r4;
        Long l;
        ?? r11;
        boolean z2;
        ConcurrentHashMap<InAppPurchase, List<Pair<Long, Pair<Bundle, OperationalData>>>> concurrentHashMap;
        List<Pair<Long, Pair<Bundle, OperationalData>>> list3;
        synchronized (InAppPurchaseManager.class) {
            Bundle bundle2 = null;
            if (CrashShieldHandler.isObjectCrashing(InAppPurchaseManager.class)) {
                return null;
            }
            try {
                list.getClass();
                list2.getClass();
                if (list2.isEmpty()) {
                    return null;
                }
                if (list.size() != list2.size()) {
                    return null;
                }
                ArrayList arrayList = new ArrayList();
                int size = list.size();
                ?? r6 = 0;
                int i = 0;
                while (i < size) {
                    InAppPurchase inAppPurchase = list.get(i);
                    Pair<Bundle, OperationalData> pair = list2.get(i);
                    Bundle bundle3 = (Bundle) pair.m;
                    OperationalData operationalData = (OperationalData) pair.n;
                    bundle = bundle2;
                    try {
                        int i2 = i;
                        InAppPurchase inAppPurchase2 = new InAppPurchase(inAppPurchase.getEventName(), new BigDecimal(String.valueOf(inAppPurchase.getAmount())).setScale(2, RoundingMode.HALF_UP).doubleValue(), inAppPurchase.getCurrency());
                        List<Pair<Long, Pair<Bundle, OperationalData>>> list4 = z ? timesOfManualPurchases.get(inAppPurchase2) : timesOfImplicitPurchases.get(inAppPurchase2);
                        if (list4 != null && !list4.isEmpty()) {
                            r4 = bundle;
                            l = r4;
                            r11 = l;
                            z2 = false;
                            for (Pair<Long, Pair<Bundle, OperationalData>> pair2 : list4) {
                                long longValue = ((Number) pair2.m).longValue();
                                Pair pair3 = (Pair) pair2.n;
                                Bundle bundle4 = (Bundle) pair3.m;
                                OperationalData operationalData2 = (OperationalData) pair3.n;
                                if (Math.abs(j - longValue) <= InAppPurchaseDedupeConfig.INSTANCE.getDedupeWindow() && (l == null || longValue < l.longValue())) {
                                    InAppPurchaseManager inAppPurchaseManager = INSTANCE;
                                    r11 = getDedupeParameter$default(inAppPurchaseManager, bundle3, operationalData, bundle4, operationalData2, !z, false, 32, null);
                                    String dedupeParameter = inAppPurchaseManager.getDedupeParameter(bundle3, operationalData, bundle4, operationalData2, !z, true);
                                    r4 = r4;
                                    if (dedupeParameter != null) {
                                        r4 = dedupeParameter;
                                    }
                                    if (r11 != 0) {
                                        l = Long.valueOf(longValue);
                                        arrayList.add(new Pair(inAppPurchase2, Long.valueOf(longValue)));
                                        z2 = true;
                                    }
                                }
                            }
                            if (r4 != 0) {
                                if (r6 == 0) {
                                    r6 = new Bundle();
                                }
                                r6.putString(Constants.IAP_TEST_DEDUP_RESULT, AppEventsConstants.EVENT_PARAM_VALUE_YES);
                                r6.putString(Constants.IAP_TEST_DEDUP_KEY_USED, r4);
                            }
                            if (z2) {
                                if (r6 == 0) {
                                    r6 = new Bundle();
                                }
                                r6.putString(Constants.IAP_NON_DEDUPED_EVENT_TIME, String.valueOf(l != null ? l.longValue() / 1000 : 0L));
                                r6.putString(Constants.IAP_ACTUAL_DEDUP_RESULT, AppEventsConstants.EVENT_PARAM_VALUE_YES);
                                r6.putString(Constants.IAP_ACTUAL_DEDUP_KEY_USED, r11);
                            }
                            if (!z && !z2) {
                                ConcurrentHashMap<InAppPurchase, List<Pair<Long, Pair<Bundle, OperationalData>>>> concurrentHashMap2 = timesOfImplicitPurchases;
                                if (concurrentHashMap2.get(inAppPurchase2) == null) {
                                    concurrentHashMap2.put(inAppPurchase2, new ArrayList());
                                }
                                List<Pair<Long, Pair<Bundle, OperationalData>>> list5 = concurrentHashMap2.get(inAppPurchase2);
                                if (list5 != null) {
                                    list5.add(new Pair<>(Long.valueOf(j), new Pair(bundle3, operationalData)));
                                }
                            } else if (!z && !z2) {
                                concurrentHashMap = timesOfManualPurchases;
                                if (concurrentHashMap.get(inAppPurchase2) == null) {
                                    concurrentHashMap.put(inAppPurchase2, new ArrayList());
                                }
                                list3 = concurrentHashMap.get(inAppPurchase2);
                                if (list3 == null) {
                                    list3.add(new Pair<>(Long.valueOf(j), new Pair(bundle3, operationalData)));
                                }
                            }
                            i = i2 + 1;
                            bundle2 = bundle;
                            r6 = r6;
                        }
                        r4 = bundle;
                        l = r4;
                        r11 = l;
                        z2 = false;
                        if (r4 != 0) {
                        }
                        if (z2) {
                        }
                        if (!z) {
                        }
                        if (!z) {
                            concurrentHashMap = timesOfManualPurchases;
                            if (concurrentHashMap.get(inAppPurchase2) == null) {
                            }
                            list3 = concurrentHashMap.get(inAppPurchase2);
                            if (list3 == null) {
                            }
                        }
                        i = i2 + 1;
                        bundle2 = bundle;
                        r6 = r6;
                    } catch (Throwable th) {
                        th = th;
                        CrashShieldHandler.handleThrowable(th, InAppPurchaseManager.class);
                        return bundle;
                    }
                }
                bundle = bundle2;
                int size2 = arrayList.size();
                int i3 = 0;
                while (i3 < size2) {
                    Object obj = arrayList.get(i3);
                    i3++;
                    Pair pair4 = (Pair) obj;
                    List<Pair<Long, Pair<Bundle, OperationalData>>> list6 = z ? timesOfManualPurchases.get(pair4.m) : timesOfImplicitPurchases.get(pair4.m);
                    if (list6 != null) {
                        Iterator<Pair<Long, Pair<Bundle, OperationalData>>> it = list6.iterator();
                        int i4 = 0;
                        while (true) {
                            if (!it.hasNext()) {
                                break;
                            }
                            int i5 = i4 + 1;
                            if (((Number) it.next().m).longValue() == ((Number) pair4.n).longValue()) {
                                list6.remove(i4);
                                break;
                            }
                            i4 = i5;
                        }
                        if (z) {
                            if (list6.isEmpty()) {
                                timesOfManualPurchases.remove(pair4.m);
                            } else {
                                timesOfManualPurchases.put(pair4.m, list6);
                            }
                        } else if (list6.isEmpty()) {
                            timesOfImplicitPurchases.remove(pair4.m);
                        } else {
                            timesOfImplicitPurchases.put(pair4.m, list6);
                        }
                    }
                }
                return r6;
            } catch (Throwable th2) {
                th = th2;
                bundle = bundle2;
            }
        }
    }

    private static final void setSpecificBillingLibraryVersion(String str) {
        if (CrashShieldHandler.isObjectCrashing(InAppPurchaseManager.class)) {
            return;
        }
        try {
            specificBillingLibraryVersion = str;
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, InAppPurchaseManager.class);
        }
    }

    public static final void startTracking() {
        if (CrashShieldHandler.isObjectCrashing(InAppPurchaseManager.class)) {
            return;
        }
        try {
            if (enabled.get()) {
                InAppPurchaseUtils.BillingClientVersion billingClientVersion = INSTANCE.getBillingClientVersion();
                int i = WhenMappings.$EnumSwitchMapping$0[billingClientVersion.ordinal()];
                if (i == 2) {
                    InAppPurchaseActivityLifecycleTracker.startIapLogging(InAppPurchaseUtils.BillingClientVersion.V1);
                    return;
                }
                if (i != 3) {
                    if (i == 4 && FeatureManager.isEnabled(FeatureManager.Feature.IapLoggingLib5To7)) {
                        InAppPurchaseAutoLogger.startIapLogging(FacebookSdk.getApplicationContext(), billingClientVersion);
                        return;
                    }
                    return;
                }
                if (FeatureManager.isEnabled(FeatureManager.Feature.IapLoggingLib2)) {
                    InAppPurchaseAutoLogger.startIapLogging(FacebookSdk.getApplicationContext(), billingClientVersion);
                } else {
                    InAppPurchaseActivityLifecycleTracker.startIapLogging(InAppPurchaseUtils.BillingClientVersion.V2_V4);
                }
            }
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, InAppPurchaseManager.class);
        }
    }

    public final String getDedupeParameter(Bundle bundle, OperationalData operationalData, Bundle bundle2, OperationalData operationalData2, boolean z, boolean z2) {
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return null;
        }
        try {
            List<Pair<String, List<String>>> testDedupeParameters = z2 ? InAppPurchaseDedupeConfig.INSTANCE.getTestDedupeParameters(z) : InAppPurchaseDedupeConfig.INSTANCE.getDedupeParameters(z);
            if (testDedupeParameters == null) {
                return null;
            }
            for (Pair<String, List<String>> pair : testDedupeParameters) {
                Object parameter = OperationalData.Companion.getParameter(OperationalDataEnum.IAPParameters, (String) pair.m, bundle, operationalData);
                String str = parameter instanceof String ? (String) parameter : null;
                if (str != null && str.length() != 0) {
                    for (String str2 : (List) pair.n) {
                        Object parameter2 = OperationalData.Companion.getParameter(OperationalDataEnum.IAPParameters, str2, bundle2, operationalData2);
                        String str3 = parameter2 instanceof String ? (String) parameter2 : null;
                        if (str3 != null && str3.length() != 0 && Intrinsics.b(str3, str)) {
                            return z ? (String) pair.m : str2;
                        }
                    }
                }
            }
            return null;
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
            return null;
        }
    }
}
