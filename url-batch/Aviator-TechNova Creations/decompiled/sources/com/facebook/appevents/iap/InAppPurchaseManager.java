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
import com.facebook.internal.ServerProtocol;
import com.facebook.internal.instrument.crashshield.CrashShieldHandler;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* compiled from: InAppPurchaseManager.kt */
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0007\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0011\u001a\u00020\u0012H\u0007J\b\u0010\u0013\u001a\u00020\u0014H\u0002JB\u0010\u0015\u001a\u0004\u0018\u00010\u00042\b\u0010\u0016\u001a\u0004\u0018\u00010\u000e2\b\u0010\u0017\u001a\u0004\u0018\u00010\u000f2\b\u0010\u0018\u001a\u0004\u0018\u00010\u000e2\b\u0010\u0019\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u001a\u001a\u00020\u001b2\b\b\u0002\u0010\u001c\u001a\u00020\u001bJ\n\u0010\u001d\u001a\u0004\u0018\u00010\u0004H\u0007JF\u0010\u001e\u001a\u0004\u0018\u00010\u000e2\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\n0 2\u0006\u0010!\u001a\u00020\r2\u0006\u0010\"\u001a\u00020\u001b2\u001c\u0010#\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u000e\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\f0 H\u0007J\u0010\u0010$\u001a\u00020\u00122\u0006\u0010%\u001a\u00020\u0004H\u0003J\b\u0010&\u001a\u00020\u0012H\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R<\u0010\b\u001a0\u0012\u0004\u0012\u00020\n\u0012&\u0012$\u0012 \u0012\u001e\u0012\u0004\u0012\u00020\r\u0012\u0014\u0012\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u000e\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\f0\f0\u000b0\tX\u0082\u0004¢\u0006\u0002\n\u0000R<\u0010\u0010\u001a0\u0012\u0004\u0012\u00020\n\u0012&\u0012$\u0012 \u0012\u001e\u0012\u0004\u0012\u00020\r\u0012\u0014\u0012\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u000e\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\f0\f0\u000b0\tX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006'"}, d2 = {"Lcom/facebook/appevents/iap/InAppPurchaseManager;", "", "()V", "GOOGLE_BILLINGCLIENT_VERSION", "", "enabled", "Ljava/util/concurrent/atomic/AtomicBoolean;", "specificBillingLibraryVersion", "timesOfImplicitPurchases", "Ljava/util/concurrent/ConcurrentHashMap;", "Lcom/facebook/appevents/iap/InAppPurchase;", "", "Lkotlin/Pair;", "", "Landroid/os/Bundle;", "Lcom/facebook/appevents/OperationalData;", "timesOfManualPurchases", "enableAutoLogging", "", "getBillingClientVersion", "Lcom/facebook/appevents/iap/InAppPurchaseUtils$BillingClientVersion;", "getDedupeParameter", "newPurchaseParameters", "newPurchaseOperationalData", "oldPurchaseParameters", "oldPurchaseOperationalData", "dedupingWithImplicitlyLoggedHistory", "", "withTestDedupeKeys", "getSpecificBillingLibraryVersion", "performDedupe", "purchases", "", "time", "isImplicitlyLogged", "purchaseParameters", "setSpecificBillingLibraryVersion", ServerProtocol.FALLBACK_DIALOG_PARAM_VERSION, "startTracking", "facebook-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class InAppPurchaseManager {
    private static final String GOOGLE_BILLINGCLIENT_VERSION = "com.google.android.play.billingclient.version";
    private static String specificBillingLibraryVersion;
    public static final InAppPurchaseManager INSTANCE = new InAppPurchaseManager();
    private static final ConcurrentHashMap<InAppPurchase, List<Pair<Long, Pair<Bundle, OperationalData>>>> timesOfManualPurchases = new ConcurrentHashMap<>();
    private static final ConcurrentHashMap<InAppPurchase, List<Pair<Long, Pair<Bundle, OperationalData>>>> timesOfImplicitPurchases = new ConcurrentHashMap<>();
    private static final AtomicBoolean enabled = new AtomicBoolean(false);

    /* compiled from: InAppPurchaseManager.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
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

    @JvmStatic
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

    @JvmStatic
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
                if (i == 3) {
                    if (FeatureManager.isEnabled(FeatureManager.Feature.IapLoggingLib2)) {
                        InAppPurchaseAutoLogger.startIapLogging(FacebookSdk.getApplicationContext(), billingClientVersion);
                        return;
                    } else {
                        InAppPurchaseActivityLifecycleTracker.startIapLogging(InAppPurchaseUtils.BillingClientVersion.V2_V4);
                        return;
                    }
                }
                if (i == 4 && FeatureManager.isEnabled(FeatureManager.Feature.IapLoggingLib5To7)) {
                    InAppPurchaseAutoLogger.startIapLogging(FacebookSdk.getApplicationContext(), billingClientVersion);
                }
            }
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, InAppPurchaseManager.class);
        }
    }

    @JvmStatic
    private static final void setSpecificBillingLibraryVersion(String version) {
        if (CrashShieldHandler.isObjectCrashing(InAppPurchaseManager.class)) {
            return;
        }
        try {
            specificBillingLibraryVersion = version;
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, InAppPurchaseManager.class);
        }
    }

    @JvmStatic
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

    private final InAppPurchaseUtils.BillingClientVersion getBillingClientVersion() {
        try {
            if (CrashShieldHandler.isObjectCrashing(this)) {
                return null;
            }
            try {
                Context applicationContext = FacebookSdk.getApplicationContext();
                ApplicationInfo applicationInfo = applicationContext.getPackageManager().getApplicationInfo(applicationContext.getPackageName(), 128);
                Intrinsics.checkNotNullExpressionValue(applicationInfo, "context.packageManager.g…TA_DATA\n                )");
                String string = applicationInfo.metaData.getString(GOOGLE_BILLINGCLIENT_VERSION);
                if (string == null) {
                    return InAppPurchaseUtils.BillingClientVersion.NONE;
                }
                List split$default = StringsKt.split$default((CharSequence) string, new String[]{"."}, false, 3, 2, (Object) null);
                if (string.length() == 0) {
                    return InAppPurchaseUtils.BillingClientVersion.V5_V7;
                }
                setSpecificBillingLibraryVersion("GPBL." + string);
                Integer intOrNull = StringsKt.toIntOrNull((String) split$default.get(0));
                if (intOrNull == null) {
                    return InAppPurchaseUtils.BillingClientVersion.V5_V7;
                }
                int intValue = intOrNull.intValue();
                if (intValue == 1) {
                    return InAppPurchaseUtils.BillingClientVersion.V1;
                }
                if (intValue < 5) {
                    return InAppPurchaseUtils.BillingClientVersion.V2_V4;
                }
                return InAppPurchaseUtils.BillingClientVersion.V5_V7;
            } catch (Exception unused) {
                return InAppPurchaseUtils.BillingClientVersion.V5_V7;
            }
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01a3 A[Catch: all -> 0x0272, TryCatch #0 {all -> 0x0272, blocks: (B:22:0x0070, B:24:0x0083, B:25:0x0094, B:27:0x0099, B:30:0x00a1, B:31:0x00aa, B:33:0x00b0, B:37:0x00e7, B:40:0x00ef, B:44:0x010b, B:56:0x0128, B:57:0x012d, B:60:0x013d, B:62:0x0144, B:63:0x014f, B:67:0x0168, B:69:0x0170, B:70:0x017d, B:72:0x0185, B:74:0x01c9, B:78:0x019b, B:80:0x01a3, B:81:0x01b0, B:83:0x01b8, B:89:0x008c, B:97:0x01d3, B:98:0x01d9, B:100:0x01df, B:102:0x01e7, B:105:0x0203, B:106:0x0208, B:108:0x020e, B:112:0x022e, B:125:0x0236, B:131:0x023c, B:128:0x0246, B:115:0x0252, B:122:0x0258, B:118:0x0263, B:137:0x01f4), top: B:21:0x0070 }] */
    /* JADX WARN: Removed duplicated region for block: B:83:0x01b8 A[Catch: all -> 0x0272, TryCatch #0 {all -> 0x0272, blocks: (B:22:0x0070, B:24:0x0083, B:25:0x0094, B:27:0x0099, B:30:0x00a1, B:31:0x00aa, B:33:0x00b0, B:37:0x00e7, B:40:0x00ef, B:44:0x010b, B:56:0x0128, B:57:0x012d, B:60:0x013d, B:62:0x0144, B:63:0x014f, B:67:0x0168, B:69:0x0170, B:70:0x017d, B:72:0x0185, B:74:0x01c9, B:78:0x019b, B:80:0x01a3, B:81:0x01b0, B:83:0x01b8, B:89:0x008c, B:97:0x01d3, B:98:0x01d9, B:100:0x01df, B:102:0x01e7, B:105:0x0203, B:106:0x0208, B:108:0x020e, B:112:0x022e, B:125:0x0236, B:131:0x023c, B:128:0x0246, B:115:0x0252, B:122:0x0258, B:118:0x0263, B:137:0x01f4), top: B:21:0x0070 }] */
    /* JADX WARN: Removed duplicated region for block: B:85:0x01c9 A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r11v3 */
    /* JADX WARN: Type inference failed for: r11v4, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r11v5 */
    /* JADX WARN: Type inference failed for: r11v6 */
    /* JADX WARN: Type inference failed for: r11v7 */
    /* JADX WARN: Type inference failed for: r11v9 */
    /* JADX WARN: Type inference failed for: r6v14 */
    /* JADX WARN: Type inference failed for: r6v15 */
    /* JADX WARN: Type inference failed for: r6v16 */
    /* JADX WARN: Type inference failed for: r6v17 */
    /* JADX WARN: Type inference failed for: r6v18 */
    /* JADX WARN: Type inference failed for: r6v19 */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v6, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1, types: [android.os.Bundle] */
    /* JADX WARN: Type inference failed for: r8v2 */
    /* JADX WARN: Type inference failed for: r8v3 */
    /* JADX WARN: Type inference failed for: r8v4, types: [android.os.Bundle] */
    /* JADX WARN: Type inference failed for: r8v5, types: [android.os.Bundle] */
    /* JADX WARN: Type inference failed for: r8v6, types: [android.os.Bundle] */
    /* JADX WARN: Type inference failed for: r8v7, types: [android.os.Bundle] */
    /* JADX WARN: Type inference failed for: r8v8 */
    @JvmStatic
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final synchronized Bundle performDedupe(List<InAppPurchase> purchases, long time, boolean isImplicitlyLogged, List<Pair<Bundle, OperationalData>> purchaseParameters) {
        Bundle bundle;
        List<Pair<Long, Pair<Bundle, OperationalData>>> list;
        List<Pair<Long, Pair<Bundle, OperationalData>>> list2;
        ?? r6;
        Long l;
        ?? r11;
        boolean z;
        ConcurrentHashMap<InAppPurchase, List<Pair<Long, Pair<Bundle, OperationalData>>>> concurrentHashMap;
        List<Pair<Long, Pair<Bundle, OperationalData>>> list3;
        List<InAppPurchase> purchases2 = purchases;
        List<Pair<Bundle, OperationalData>> purchaseParameters2 = purchaseParameters;
        synchronized (InAppPurchaseManager.class) {
            Bundle bundle2 = null;
            if (CrashShieldHandler.isObjectCrashing(InAppPurchaseManager.class)) {
                return null;
            }
            try {
                Intrinsics.checkNotNullParameter(purchases2, "purchases");
                Intrinsics.checkNotNullParameter(purchaseParameters2, "purchaseParameters");
                if (purchaseParameters2.isEmpty()) {
                    return null;
                }
                if (purchases2.size() != purchaseParameters2.size()) {
                    return null;
                }
                ArrayList arrayList = new ArrayList();
                int size = purchases2.size();
                ?? r8 = 0;
                int i = 0;
                while (i < size) {
                    InAppPurchase inAppPurchase = purchases2.get(i);
                    Pair<Bundle, OperationalData> pair = purchaseParameters2.get(i);
                    Bundle component1 = pair.component1();
                    OperationalData component2 = pair.component2();
                    bundle = bundle2;
                    try {
                        int i2 = i;
                        InAppPurchase inAppPurchase2 = new InAppPurchase(inAppPurchase.getEventName(), new BigDecimal(String.valueOf(inAppPurchase.getAmount())).setScale(2, RoundingMode.HALF_UP).doubleValue(), inAppPurchase.getCurrency());
                        if (isImplicitlyLogged) {
                            list2 = timesOfManualPurchases.get(inAppPurchase2);
                        } else {
                            list2 = timesOfImplicitPurchases.get(inAppPurchase2);
                        }
                        List<Pair<Long, Pair<Bundle, OperationalData>>> list4 = list2;
                        if (list4 != null && !list4.isEmpty()) {
                            r6 = bundle;
                            l = r6;
                            r11 = l;
                            z = false;
                            for (Pair<Long, Pair<Bundle, OperationalData>> pair2 : list2) {
                                long longValue = pair2.getFirst().longValue();
                                Pair<Bundle, OperationalData> second = pair2.getSecond();
                                Bundle component12 = second.component1();
                                OperationalData component22 = second.component2();
                                if (Math.abs(time - longValue) <= InAppPurchaseDedupeConfig.INSTANCE.getDedupeWindow() && (l == null || longValue < l.longValue())) {
                                    InAppPurchaseManager inAppPurchaseManager = INSTANCE;
                                    String dedupeParameter$default = getDedupeParameter$default(inAppPurchaseManager, component1, component2, component12, component22, !isImplicitlyLogged, false, 32, null);
                                    String dedupeParameter = inAppPurchaseManager.getDedupeParameter(component1, component2, component12, component22, !isImplicitlyLogged, true);
                                    r6 = r6;
                                    if (dedupeParameter != null) {
                                        r6 = dedupeParameter;
                                    }
                                    if (dedupeParameter$default != null) {
                                        l = Long.valueOf(longValue);
                                        arrayList.add(new Pair(inAppPurchase2, Long.valueOf(longValue)));
                                        z = true;
                                    }
                                    r11 = dedupeParameter$default;
                                }
                            }
                            if (r6 != 0) {
                                if (r8 == 0) {
                                    r8 = new Bundle();
                                }
                                r8.putString(Constants.IAP_TEST_DEDUP_RESULT, AppEventsConstants.EVENT_PARAM_VALUE_YES);
                                r8.putString(Constants.IAP_TEST_DEDUP_KEY_USED, r6);
                            }
                            if (z) {
                                if (r8 == 0) {
                                    r8 = new Bundle();
                                }
                                r8.putString(Constants.IAP_NON_DEDUPED_EVENT_TIME, String.valueOf(l != null ? l.longValue() / 1000 : 0L));
                                r8.putString(Constants.IAP_ACTUAL_DEDUP_RESULT, AppEventsConstants.EVENT_PARAM_VALUE_YES);
                                r8.putString(Constants.IAP_ACTUAL_DEDUP_KEY_USED, r11);
                            }
                            if (!isImplicitlyLogged && !z) {
                                ConcurrentHashMap<InAppPurchase, List<Pair<Long, Pair<Bundle, OperationalData>>>> concurrentHashMap2 = timesOfImplicitPurchases;
                                if (concurrentHashMap2.get(inAppPurchase2) == null) {
                                    concurrentHashMap2.put(inAppPurchase2, new ArrayList());
                                }
                                List<Pair<Long, Pair<Bundle, OperationalData>>> list5 = concurrentHashMap2.get(inAppPurchase2);
                                if (list5 != null) {
                                    list5.add(new Pair<>(Long.valueOf(time), new Pair(component1, component2)));
                                }
                            } else if (!isImplicitlyLogged && !z) {
                                concurrentHashMap = timesOfManualPurchases;
                                if (concurrentHashMap.get(inAppPurchase2) == null) {
                                    concurrentHashMap.put(inAppPurchase2, new ArrayList());
                                }
                                list3 = concurrentHashMap.get(inAppPurchase2);
                                if (list3 == null) {
                                    list3.add(new Pair<>(Long.valueOf(time), new Pair(component1, component2)));
                                }
                            }
                            i = i2 + 1;
                            purchases2 = purchases;
                            purchaseParameters2 = purchaseParameters;
                            bundle2 = bundle;
                            r8 = r8;
                        }
                        r6 = bundle;
                        l = r6;
                        r11 = l;
                        z = false;
                        if (r6 != 0) {
                        }
                        if (z) {
                        }
                        if (!isImplicitlyLogged) {
                        }
                        if (!isImplicitlyLogged) {
                            concurrentHashMap = timesOfManualPurchases;
                            if (concurrentHashMap.get(inAppPurchase2) == null) {
                            }
                            list3 = concurrentHashMap.get(inAppPurchase2);
                            if (list3 == null) {
                            }
                        }
                        i = i2 + 1;
                        purchases2 = purchases;
                        purchaseParameters2 = purchaseParameters;
                        bundle2 = bundle;
                        r8 = r8;
                    } catch (Throwable th) {
                        th = th;
                        CrashShieldHandler.handleThrowable(th, InAppPurchaseManager.class);
                        return bundle;
                    }
                }
                bundle = bundle2;
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    Pair pair3 = (Pair) it.next();
                    if (isImplicitlyLogged) {
                        list = timesOfManualPurchases.get(pair3.getFirst());
                    } else {
                        list = timesOfImplicitPurchases.get(pair3.getFirst());
                    }
                    if (list != null) {
                        Iterator<Pair<Long, Pair<Bundle, OperationalData>>> it2 = list.iterator();
                        int i3 = 0;
                        while (true) {
                            if (!it2.hasNext()) {
                                break;
                            }
                            int i4 = i3 + 1;
                            if (it2.next().getFirst().longValue() == ((Number) pair3.getSecond()).longValue()) {
                                list.remove(i3);
                                break;
                            }
                            i3 = i4;
                        }
                        if (isImplicitlyLogged) {
                            if (list.isEmpty()) {
                                timesOfManualPurchases.remove(pair3.getFirst());
                            } else {
                                timesOfManualPurchases.put(pair3.getFirst(), list);
                            }
                        } else if (list.isEmpty()) {
                            timesOfImplicitPurchases.remove(pair3.getFirst());
                        } else {
                            timesOfImplicitPurchases.put(pair3.getFirst(), list);
                        }
                    }
                }
                return r8;
            } catch (Throwable th2) {
                th = th2;
                bundle = bundle2;
            }
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

    public final String getDedupeParameter(Bundle newPurchaseParameters, OperationalData newPurchaseOperationalData, Bundle oldPurchaseParameters, OperationalData oldPurchaseOperationalData, boolean dedupingWithImplicitlyLoggedHistory, boolean withTestDedupeKeys) {
        List<Pair<String, List<String>>> dedupeParameters;
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return null;
        }
        try {
            if (withTestDedupeKeys) {
                dedupeParameters = InAppPurchaseDedupeConfig.INSTANCE.getTestDedupeParameters(dedupingWithImplicitlyLoggedHistory);
            } else {
                dedupeParameters = InAppPurchaseDedupeConfig.INSTANCE.getDedupeParameters(dedupingWithImplicitlyLoggedHistory);
            }
            if (dedupeParameters == null) {
                return null;
            }
            for (Pair<String, List<String>> pair : dedupeParameters) {
                Object parameter = OperationalData.INSTANCE.getParameter(OperationalDataEnum.IAPParameters, pair.getFirst(), newPurchaseParameters, newPurchaseOperationalData);
                String str = parameter instanceof String ? (String) parameter : null;
                String str2 = str;
                if (str2 != null && str2.length() != 0) {
                    for (String str3 : pair.getSecond()) {
                        Object parameter2 = OperationalData.INSTANCE.getParameter(OperationalDataEnum.IAPParameters, str3, oldPurchaseParameters, oldPurchaseOperationalData);
                        String str4 = parameter2 instanceof String ? (String) parameter2 : null;
                        String str5 = str4;
                        if (str5 != null && str5.length() != 0 && Intrinsics.areEqual(str4, str)) {
                            return dedupingWithImplicitlyLoggedHistory ? pair.getFirst() : str3;
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
