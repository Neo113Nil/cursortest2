package com.appsflyer.internal;

import android.os.Build;
import android.widget.ExpandableListView;
import com.appsflyer.AFLogger;
import com.appsflyer.internal.AFd1vSDK;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.ironsource.InterfaceC1490j3;
import com.ironsource.ge;
import io.appmetrica.analytics.BuildConfig;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class AFd1uSDK implements AFd1vSDK {
    private static int $10 = 0;
    private static int $11 = 1;
    private static int AFLogger = 1;
    private static int copydefault;
    private final W1.h AFAdRevenueData;
    private final W1.h areAllFieldsValid;
    private final String component1;
    private AFd1vSDK.AFa1ySDK component2;
    private final W1.h component3;
    private final W1.h component4;
    private final W1.h getCurrencyIso4217Code;
    private AFc1dSDK getMediationNetwork;
    private final W1.h getMonetizationNetwork;
    private final W1.h getRevenue;
    private static char[] hashCode = {8636, 8652, 8639, 8648, 8626};
    private static int equals = -771284898;
    private static boolean toString = true;
    private static boolean copy = true;

    @Metadata
    /* renamed from: com.appsflyer.internal.AFd1uSDK$1, reason: invalid class name */
    static final class AnonymousClass1 extends kotlin.jvm.internal.s implements Function0<AFc1bSDK> {
        AnonymousClass1() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: getRevenue, reason: merged with bridge method [inline-methods] */
        public final AFc1bSDK invoke() {
            AFc1iSDK AFInAppEventType = AFd1uSDK.getCurrencyIso4217Code(AFd1uSDK.this).AFInAppEventType();
            Intrinsics.checkNotNullExpressionValue(AFInAppEventType, "");
            return new AFc1bSDK(AFInAppEventType);
        }
    }

    @Metadata
    /* renamed from: com.appsflyer.internal.AFd1uSDK$10, reason: invalid class name */
    static final class AnonymousClass10 extends kotlin.jvm.internal.s implements Function0<AFf1gSDK> {
        AnonymousClass10() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: getRevenue, reason: merged with bridge method [inline-methods] */
        public final AFf1gSDK invoke() {
            AFf1gSDK registerClient = AFd1uSDK.getCurrencyIso4217Code(AFd1uSDK.this).registerClient();
            Intrinsics.checkNotNullExpressionValue(registerClient, "");
            return registerClient;
        }
    }

    @Metadata
    /* renamed from: com.appsflyer.internal.AFd1uSDK$2, reason: invalid class name */
    static final class AnonymousClass2 extends kotlin.jvm.internal.s implements Function0<AFc1pSDK> {
        AnonymousClass2() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: getCurrencyIso4217Code, reason: merged with bridge method [inline-methods] */
        public final AFc1pSDK invoke() {
            AFc1pSDK revenue = AFd1uSDK.getCurrencyIso4217Code(AFd1uSDK.this).getRevenue();
            Intrinsics.checkNotNullExpressionValue(revenue, "");
            return revenue;
        }
    }

    @Metadata
    /* renamed from: com.appsflyer.internal.AFd1uSDK$3, reason: invalid class name */
    static final class AnonymousClass3 extends kotlin.jvm.internal.s implements Function0<ExecutorService> {
        AnonymousClass3() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: AFAdRevenueData, reason: merged with bridge method [inline-methods] */
        public final ExecutorService invoke() {
            ExecutorService monetizationNetwork = AFd1uSDK.getCurrencyIso4217Code(AFd1uSDK.this).getMonetizationNetwork();
            Intrinsics.checkNotNullExpressionValue(monetizationNetwork, "");
            return monetizationNetwork;
        }
    }

    @Metadata
    /* renamed from: com.appsflyer.internal.AFd1uSDK$4, reason: invalid class name */
    static final class AnonymousClass4 extends kotlin.jvm.internal.s implements Function0<AFc1qSDK> {
        AnonymousClass4() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: AFAdRevenueData, reason: merged with bridge method [inline-methods] */
        public final AFc1qSDK invoke() {
            AFc1qSDK component2 = AFd1uSDK.getCurrencyIso4217Code(AFd1uSDK.this).component2();
            Intrinsics.checkNotNullExpressionValue(component2, "");
            return component2;
        }
    }

    @Metadata
    /* renamed from: com.appsflyer.internal.AFd1uSDK$5, reason: invalid class name */
    static final class AnonymousClass5 extends kotlin.jvm.internal.s implements Function0<AFf1oSDK> {
        AnonymousClass5() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: getCurrencyIso4217Code, reason: merged with bridge method [inline-methods] */
        public final AFf1oSDK invoke() {
            AFf1oSDK component1 = AFd1uSDK.getCurrencyIso4217Code(AFd1uSDK.this).component1();
            Intrinsics.checkNotNullExpressionValue(component1, "");
            return component1;
        }
    }

    @Metadata
    /* renamed from: com.appsflyer.internal.AFd1uSDK$6, reason: invalid class name */
    static final class AnonymousClass6 extends kotlin.jvm.internal.s implements Function0<AFd1ySDK> {
        AnonymousClass6() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: AFAdRevenueData, reason: merged with bridge method [inline-methods] */
        public final AFd1ySDK invoke() {
            return new AFd1ySDK(AFd1uSDK.this.getRevenue());
        }
    }

    public AFd1uSDK(AFc1dSDK aFc1dSDK) {
        Intrinsics.checkNotNullParameter(aFc1dSDK, "");
        this.getMediationNetwork = aFc1dSDK;
        this.AFAdRevenueData = W1.i.b(new AnonymousClass5());
        this.getMonetizationNetwork = W1.i.b(new AnonymousClass2());
        this.getRevenue = W1.i.b(new AnonymousClass4());
        this.getCurrencyIso4217Code = W1.i.b(new AnonymousClass10());
        this.areAllFieldsValid = W1.i.b(new AnonymousClass3());
        this.component1 = "6.17.0";
        this.component4 = W1.i.b(new AnonymousClass1());
        this.component3 = W1.i.b(new AnonymousClass6());
    }

    private final ExecutorService areAllFieldsValid() {
        AFLogger = (copydefault + 47) % UserVerificationMethods.USER_VERIFY_PATTERN;
        ExecutorService executorService = (ExecutorService) this.areAllFieldsValid.getValue();
        AFLogger = (copydefault + 37) % UserVerificationMethods.USER_VERIFY_PATTERN;
        return executorService;
    }

    private final AFh1dSDK component1() {
        return (AFh1dSDK) getMediationNetwork(new Object[]{this}, 855295870, -855295867, System.identityHashCode(this));
    }

    private final AFc1qSDK component2() {
        int i4 = copydefault + 19;
        AFLogger = i4 % UserVerificationMethods.USER_VERIFY_PATTERN;
        if (i4 % 2 != 0) {
            return (AFc1qSDK) this.getRevenue.getValue();
        }
        throw null;
    }

    private AFd1xSDK component3() {
        return (AFd1xSDK) getMediationNetwork(new Object[]{this}, -704520981, 704520985, System.identityHashCode(this));
    }

    private final AFf1gSDK component4() {
        int i4 = AFLogger + 17;
        copydefault = i4 % UserVerificationMethods.USER_VERIFY_PATTERN;
        if (i4 % 2 != 0) {
            throw null;
        }
        AFf1gSDK aFf1gSDK = (AFf1gSDK) this.getCurrencyIso4217Code.getValue();
        AFLogger = (copydefault + 117) % UserVerificationMethods.USER_VERIFY_PATTERN;
        return aFf1gSDK;
    }

    private final synchronized void copy() {
        boolean z4;
        try {
            AFh1dSDK aFh1dSDK = (AFh1dSDK) getMediationNetwork(new Object[]{this}, 855295870, -855295867, System.identityHashCode(this));
            if (aFh1dSDK != null) {
                int i4 = copydefault + 57;
                AFLogger = i4 % UserVerificationMethods.USER_VERIFY_PATTERN;
                if (i4 % 2 == 0) {
                    int i5 = aFh1dSDK.AFAdRevenueData;
                    throw null;
                }
                if (aFh1dSDK.AFAdRevenueData == -1) {
                    component2().getMonetizationNetwork("af_send_exc_to_server_window");
                } else if (component2().getCurrencyIso4217Code("af_send_exc_to_server_window", -1L) == -1) {
                    AFLogger = (copydefault + 119) % UserVerificationMethods.USER_VERIFY_PATTERN;
                    getRevenue(aFh1dSDK);
                }
                z4 = getMonetizationNetwork(aFh1dSDK);
            } else {
                z4 = false;
            }
            AFd1vSDK.AFa1ySDK aFa1ySDK = this.component2;
            if (aFa1ySDK == null) {
                copydefault = (AFLogger + 107) % UserVerificationMethods.USER_VERIFY_PATTERN;
            } else {
                copydefault = (AFLogger + 73) % UserVerificationMethods.USER_VERIFY_PATTERN;
                aFa1ySDK.onConfigurationChanged(z4);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x00af, code lost:
    
        if (r0 != null) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00b8, code lost:
    
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, "");
        r0 = new kotlin.text.Regex("(\\d+).(\\d+).(\\d+).*").c(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00c8, code lost:
    
        if (r0 == null) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00ca, code lost:
    
        r5 = r0.a().get(1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00d2, code lost:
    
        if (r5 == null) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00d4, code lost:
    
        r5 = r5.a();
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00d8, code lost:
    
        if (r5 == null) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00da, code lost:
    
        com.appsflyer.internal.AFd1uSDK.AFLogger = (com.appsflyer.internal.AFd1uSDK.copydefault + 119) % com.google.android.gms.fido.fido2.api.common.UserVerificationMethods.USER_VERIFY_PATTERN;
        r5 = kotlin.text.StringsKt.toIntOrNull(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00e6, code lost:
    
        if (r5 == null) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00e8, code lost:
    
        r5 = r5.intValue();
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00ee, code lost:
    
        r5 = r5 * 1000000;
        r1 = r0.a().get(2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00fa, code lost:
    
        if (r1 == null) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00fc, code lost:
    
        com.appsflyer.internal.AFd1uSDK.AFLogger = (com.appsflyer.internal.AFd1uSDK.copydefault + 95) % com.google.android.gms.fido.fido2.api.common.UserVerificationMethods.USER_VERIFY_PATTERN;
        r1 = r1.a();
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0108, code lost:
    
        if (r1 == null) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x010a, code lost:
    
        com.appsflyer.internal.AFd1uSDK.AFLogger = (com.appsflyer.internal.AFd1uSDK.copydefault + 113) % com.google.android.gms.fido.fido2.api.common.UserVerificationMethods.USER_VERIFY_PATTERN;
        r1 = kotlin.text.StringsKt.toIntOrNull(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0116, code lost:
    
        if (r1 == null) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0118, code lost:
    
        r1 = r1.intValue();
        com.appsflyer.internal.AFd1uSDK.copydefault = (com.appsflyer.internal.AFd1uSDK.AFLogger + 87) % com.google.android.gms.fido.fido2.api.common.UserVerificationMethods.USER_VERIFY_PATTERN;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0126, code lost:
    
        r5 = r5 + (r1 * 1000);
        r0 = r0.a().get(3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0132, code lost:
    
        if (r0 == null) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0134, code lost:
    
        r0 = r0.a();
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0138, code lost:
    
        if (r0 == null) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x013a, code lost:
    
        r0 = kotlin.text.StringsKt.toIntOrNull(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x013e, code lost:
    
        if (r0 == null) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0140, code lost:
    
        com.appsflyer.internal.AFd1uSDK.AFLogger = (com.appsflyer.internal.AFd1uSDK.copydefault + 123) % com.google.android.gms.fido.fido2.api.common.UserVerificationMethods.USER_VERIFY_PATTERN;
        r0 = r0.intValue();
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0156, code lost:
    
        r5 = r5 + r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0159, code lost:
    
        r0 = java.lang.Integer.valueOf(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x0198, code lost:
    
        if (r0.intValue() == (-1)) goto L83;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x014d, code lost:
    
        com.appsflyer.internal.AFd1uSDK.AFLogger = (com.appsflyer.internal.AFd1uSDK.copydefault + 85) % com.google.android.gms.fido.fido2.api.common.UserVerificationMethods.USER_VERIFY_PATTERN;
        r0 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x0125, code lost:
    
        r1 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x00ed, code lost:
    
        r5 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x0158, code lost:
    
        r5 = -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x00b6, code lost:
    
        if (r0 != null) goto L36;
     */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x019c A[Catch: all -> 0x001a, TryCatch #1 {all -> 0x001a, blocks: (B:3:0x0001, B:5:0x0017, B:6:0x001f, B:8:0x002e, B:10:0x0039, B:14:0x0057, B:17:0x0075, B:19:0x0086, B:21:0x008d, B:23:0x009f, B:25:0x00aa, B:30:0x00b8, B:32:0x00ca, B:34:0x00d4, B:36:0x00da, B:38:0x00e8, B:39:0x00ee, B:41:0x00fc, B:43:0x010a, B:45:0x0118, B:46:0x0126, B:48:0x0134, B:50:0x013a, B:52:0x0140, B:53:0x0156, B:54:0x0159, B:55:0x015f, B:57:0x016f, B:59:0x0173, B:60:0x0179, B:62:0x0189, B:64:0x018d, B:68:0x019c, B:69:0x0207, B:71:0x020b, B:73:0x021b, B:74:0x0227, B:80:0x01ac, B:82:0x01ca, B:83:0x01e6, B:84:0x0194, B:87:0x014d, B:93:0x00b3, B:94:0x00b4, B:97:0x01f7, B:28:0x00ae), top: B:2:0x0001, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01ac A[Catch: all -> 0x001a, TryCatch #1 {all -> 0x001a, blocks: (B:3:0x0001, B:5:0x0017, B:6:0x001f, B:8:0x002e, B:10:0x0039, B:14:0x0057, B:17:0x0075, B:19:0x0086, B:21:0x008d, B:23:0x009f, B:25:0x00aa, B:30:0x00b8, B:32:0x00ca, B:34:0x00d4, B:36:0x00da, B:38:0x00e8, B:39:0x00ee, B:41:0x00fc, B:43:0x010a, B:45:0x0118, B:46:0x0126, B:48:0x0134, B:50:0x013a, B:52:0x0140, B:53:0x0156, B:54:0x0159, B:55:0x015f, B:57:0x016f, B:59:0x0173, B:60:0x0179, B:62:0x0189, B:64:0x018d, B:68:0x019c, B:69:0x0207, B:71:0x020b, B:73:0x021b, B:74:0x0227, B:80:0x01ac, B:82:0x01ca, B:83:0x01e6, B:84:0x0194, B:87:0x014d, B:93:0x00b3, B:94:0x00b4, B:97:0x01f7, B:28:0x00ae), top: B:2:0x0001, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01c8  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0194 A[Catch: all -> 0x001a, TryCatch #1 {all -> 0x001a, blocks: (B:3:0x0001, B:5:0x0017, B:6:0x001f, B:8:0x002e, B:10:0x0039, B:14:0x0057, B:17:0x0075, B:19:0x0086, B:21:0x008d, B:23:0x009f, B:25:0x00aa, B:30:0x00b8, B:32:0x00ca, B:34:0x00d4, B:36:0x00da, B:38:0x00e8, B:39:0x00ee, B:41:0x00fc, B:43:0x010a, B:45:0x0118, B:46:0x0126, B:48:0x0134, B:50:0x013a, B:52:0x0140, B:53:0x0156, B:54:0x0159, B:55:0x015f, B:57:0x016f, B:59:0x0173, B:60:0x0179, B:62:0x0189, B:64:0x018d, B:68:0x019c, B:69:0x0207, B:71:0x020b, B:73:0x021b, B:74:0x0227, B:80:0x01ac, B:82:0x01ca, B:83:0x01e6, B:84:0x0194, B:87:0x014d, B:93:0x00b3, B:94:0x00b4, B:97:0x01f7, B:28:0x00ae), top: B:2:0x0001, inners: #0 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final synchronized void copydefault() {
        Integer num;
        Pair<Integer, Integer> revenue;
        AFh1dSDK aFh1dSDK;
        String str;
        String str2;
        String str3;
        try {
            AFh1dSDK aFh1dSDK2 = (AFh1dSDK) getMediationNetwork(new Object[]{this}, 855295870, -855295867, System.identityHashCode(this));
            if ((aFh1dSDK2 != null ? aFh1dSDK2.getMediationNetwork : -1L) < TimeUnit.MILLISECONDS.toSeconds(System.currentTimeMillis())) {
                int i4 = AFLogger + 47;
                copydefault = i4 % UserVerificationMethods.USER_VERIFY_PATTERN;
                if (i4 % 2 != 0) {
                    AFg1gSDK.v$default(AFLogger.INSTANCE, AFg1cSDK.EXCEPTION_MANAGER, "TTL is already passed", false, 4, null);
                    component2().getMonetizationNetwork("af_send_exc_to_server_window");
                    getRevenue().getMonetizationNetwork();
                    return;
                } else {
                    AFg1gSDK.v$default(AFLogger.INSTANCE, AFg1cSDK.EXCEPTION_MANAGER, "TTL is already passed", false, 4, null);
                    component2().getMonetizationNetwork("af_send_exc_to_server_window");
                    getRevenue().getMonetizationNetwork();
                    return;
                }
            }
            AFh1dSDK aFh1dSDK3 = (AFh1dSDK) getMediationNetwork(new Object[]{this}, 855295870, -855295867, System.identityHashCode(this));
            boolean z4 = false;
            if (aFh1dSDK3 == null || !getMediationNetwork(aFh1dSDK3)) {
                component2().getMonetizationNetwork("af_send_exc_to_server_window");
                getRevenue().getMonetizationNetwork();
            } else {
                AFh1dSDK aFh1dSDK4 = (AFh1dSDK) getMediationNetwork(new Object[]{this}, 855295870, -855295867, System.identityHashCode(this));
                Pair<Integer, Integer> pair = null;
                if (aFh1dSDK4 != null) {
                    int i5 = AFLogger + InterfaceC1490j3.d.b.f16817i;
                    copydefault = i5 % UserVerificationMethods.USER_VERIFY_PATTERN;
                    if (i5 % 2 != 0) {
                        str3 = aFh1dSDK4.getRevenue;
                        int i6 = 76 / 0;
                    } else {
                        str3 = aFh1dSDK4.getRevenue;
                    }
                    AFh1dSDK aFh1dSDK5 = (AFh1dSDK) getMediationNetwork(new Object[]{this}, 855295870, -855295867, System.identityHashCode(this));
                    revenue = (aFh1dSDK5 != null || (str2 = aFh1dSDK5.getRevenue) == null) ? null : AFd1rSDK.getRevenue(str2);
                    aFh1dSDK = (AFh1dSDK) getMediationNetwork(new Object[]{this}, 855295870, -855295867, System.identityHashCode(this));
                    if (aFh1dSDK != null && (str = aFh1dSDK.getRevenue) != null) {
                        pair = AFd1rSDK.getMediationNetwork(str);
                    }
                    if (num != null) {
                    }
                    if (revenue == null) {
                        getRevenue().getRevenue(this.component1);
                    }
                    if (revenue == null) {
                        getRevenue().AFAdRevenueData(revenue.getFirst().intValue(), revenue.getSecond().intValue());
                    } else if (pair != null) {
                        getRevenue().AFAdRevenueData(pair.getFirst().intValue(), pair.getSecond().intValue());
                    } else {
                        component2().getMonetizationNetwork("af_send_exc_to_server_window");
                        getRevenue().getMonetizationNetwork();
                    }
                }
                num = null;
                AFh1dSDK aFh1dSDK52 = (AFh1dSDK) getMediationNetwork(new Object[]{this}, 855295870, -855295867, System.identityHashCode(this));
                if (aFh1dSDK52 != null) {
                }
                aFh1dSDK = (AFh1dSDK) getMediationNetwork(new Object[]{this}, 855295870, -855295867, System.identityHashCode(this));
                if (aFh1dSDK != null) {
                    pair = AFd1rSDK.getMediationNetwork(str);
                }
                if (num != null) {
                }
                if (revenue == null) {
                }
                if (revenue == null) {
                }
            }
            AFd1vSDK.AFa1ySDK aFa1ySDK = this.component2;
            if (aFa1ySDK != null) {
                AFh1dSDK aFh1dSDK6 = (AFh1dSDK) getMediationNetwork(new Object[]{this}, 855295870, -855295867, System.identityHashCode(this));
                if (aFh1dSDK6 != null) {
                    copydefault = (AFLogger + 71) % UserVerificationMethods.USER_VERIFY_PATTERN;
                    z4 = getMonetizationNetwork(aFh1dSDK6);
                }
                aFa1ySDK.onConfigurationChanged(z4);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    private final void equals() {
        AFh1dSDK aFh1dSDK;
        int i4 = copydefault + 119;
        AFLogger = i4 % UserVerificationMethods.USER_VERIFY_PATTERN;
        if (i4 % 2 == 0) {
            aFh1dSDK = (AFh1dSDK) getMediationNetwork(new Object[]{this}, 855295870, -855295867, System.identityHashCode(this));
            int i5 = 59 / 0;
            if (aFh1dSDK == null) {
                return;
            }
        } else {
            aFh1dSDK = (AFh1dSDK) getMediationNetwork(new Object[]{this}, 855295870, -855295867, System.identityHashCode(this));
            if (aFh1dSDK == null) {
                return;
            }
        }
        if (!getCurrencyIso4217Code(aFh1dSDK)) {
            AFg1gSDK.v$default(AFLogger.INSTANCE, AFg1cSDK.EXCEPTION_MANAGER, "skipping", false, 4, null);
            return;
        }
        int i6 = AFLogger + 33;
        copydefault = i6 % UserVerificationMethods.USER_VERIFY_PATTERN;
        if (i6 % 2 != 0) {
            component4().getMediationNetwork();
            throw null;
        }
        String mediationNetwork = component4().getMediationNetwork();
        if (mediationNetwork != null) {
            String jSONObject = new JSONObject((Map) getMediationNetwork(new Object[]{AFAdRevenueData(aFh1dSDK), getRevenue().getMediationNetwork()}, -1072478634, 1072478634, (int) System.currentTimeMillis())).toString();
            Intrinsics.checkNotNullExpressionValue(jSONObject, "");
            Intrinsics.checkNotNullExpressionValue(mediationNetwork, "");
            getCurrencyIso4217Code(jSONObject, mediationNetwork);
        }
    }

    public static final /* synthetic */ AFc1dSDK getCurrencyIso4217Code(AFd1uSDK aFd1uSDK) {
        int i4 = AFLogger + 117;
        int i5 = i4 % UserVerificationMethods.USER_VERIFY_PATTERN;
        copydefault = i5;
        int i6 = i4 % 2;
        AFc1dSDK aFc1dSDK = aFd1uSDK.getMediationNetwork;
        if (i6 != 0) {
            throw null;
        }
        AFLogger = (i5 + 47) % UserVerificationMethods.USER_VERIFY_PATTERN;
        return aFc1dSDK;
    }

    public static /* synthetic */ Object getMediationNetwork(Object[] objArr, int i4, int i5, int i6) {
        int i7 = (i4 * (-344)) + (i5 * (-344));
        int i8 = ~i4;
        int i9 = ~i5;
        int i10 = i8 | i9;
        int i11 = i7 + (((~i10) | (~(i8 | i6))) * 345) + (((~(i4 | i9)) | (~(i8 | (~i6)))) * 345) + ((~(i10 | i6)) * 345);
        if (i11 == 1) {
            return getCurrencyIso4217Code(objArr);
        }
        if (i11 == 2) {
            return AFAdRevenueData(objArr);
        }
        if (i11 == 3) {
            return getRevenue(objArr);
        }
        if (i11 == 4) {
            AFd1uSDK aFd1uSDK = (AFd1uSDK) objArr[0];
            copydefault = (AFLogger + 59) % UserVerificationMethods.USER_VERIFY_PATTERN;
            AFd1xSDK aFd1xSDK = (AFd1xSDK) aFd1uSDK.component3.getValue();
            AFLogger = (copydefault + 5) % UserVerificationMethods.USER_VERIFY_PATTERN;
            return aFd1xSDK;
        }
        Map map = (Map) objArr[0];
        List list = (List) objArr[1];
        int i12 = AFLogger + 43;
        copydefault = i12 % UserVerificationMethods.USER_VERIFY_PATTERN;
        if (i12 % 2 == 0) {
            return MapsKt.mapOf(TuplesKt.to("deviceInfo", map), TuplesKt.to("excs", AFd1tSDK.getCurrencyIso4217Code(list)));
        }
        Pair[] pairArr = new Pair[2];
        pairArr[0] = TuplesKt.to("deviceInfo", map);
        pairArr[0] = TuplesKt.to("excs", AFd1tSDK.getCurrencyIso4217Code(list));
        return MapsKt.mapOf(pairArr);
    }

    private final AFf1oSDK getMonetizationNetwork() {
        AFLogger = (copydefault + 99) % UserVerificationMethods.USER_VERIFY_PATTERN;
        AFf1oSDK aFf1oSDK = (AFf1oSDK) this.AFAdRevenueData.getValue();
        copydefault = (AFLogger + 11) % UserVerificationMethods.USER_VERIFY_PATTERN;
        return aFf1oSDK;
    }

    private static /* synthetic */ Object getRevenue(Object[] objArr) {
        AFd1uSDK aFd1uSDK = (AFd1uSDK) objArr[0];
        AFLogger = (copydefault + 29) % UserVerificationMethods.USER_VERIFY_PATTERN;
        AFi1wSDK aFi1wSDK = aFd1uSDK.getMonetizationNetwork().getMediationNetwork.getCurrencyIso4217Code;
        if (aFi1wSDK != null) {
            int i4 = AFLogger + 37;
            copydefault = i4 % UserVerificationMethods.USER_VERIFY_PATTERN;
            if (i4 % 2 != 0) {
                AFh1cSDK aFh1cSDK = aFi1wSDK.getMonetizationNetwork;
                throw null;
            }
            AFh1cSDK aFh1cSDK2 = aFi1wSDK.getMonetizationNetwork;
            if (aFh1cSDK2 != null) {
                return aFh1cSDK2.getRevenue;
            }
        }
        return null;
    }

    @Override // com.appsflyer.internal.AFd1vSDK
    public final void AFAdRevenueData(AFd1vSDK.AFa1ySDK aFa1ySDK) {
        int i4 = AFLogger + 21;
        copydefault = i4 % UserVerificationMethods.USER_VERIFY_PATTERN;
        if (i4 % 2 == 0) {
            this.component2 = aFa1ySDK;
            areAllFieldsValid().execute(new Runnable() { // from class: com.appsflyer.internal.s
                @Override // java.lang.Runnable
                public final void run() {
                    AFd1uSDK.getMediationNetwork(AFd1uSDK.this);
                }
            });
        } else {
            this.component2 = aFa1ySDK;
            areAllFieldsValid().execute(new Runnable() { // from class: com.appsflyer.internal.s
                @Override // java.lang.Runnable
                public final void run() {
                    AFd1uSDK.getMediationNetwork(AFd1uSDK.this);
                }
            });
            throw null;
        }
    }

    private static void a(String str, int[] iArr, String str2, int i4, Object[] objArr) {
        int length;
        char[] cArr;
        int i5;
        char[] cArr2 = str2;
        if (str2 != null) {
            $10 = ($11 + 39) % UserVerificationMethods.USER_VERIFY_PATTERN;
            cArr2 = str2.toCharArray();
        }
        char[] cArr3 = cArr2;
        byte[] bArr = str;
        if (str != null) {
            bArr = str.getBytes("ISO-8859-1");
        }
        byte[] bArr2 = bArr;
        AFk1nSDK aFk1nSDK = new AFk1nSDK();
        char[] cArr4 = hashCode;
        if (cArr4 != null) {
            int i6 = $11 + 61;
            $10 = i6 % UserVerificationMethods.USER_VERIFY_PATTERN;
            if (i6 % 2 != 0) {
                length = cArr4.length;
                cArr = new char[length];
                i5 = 1;
            } else {
                length = cArr4.length;
                cArr = new char[length];
                i5 = 0;
            }
            while (i5 < length) {
                $10 = ($11 + 97) % UserVerificationMethods.USER_VERIFY_PATTERN;
                cArr[i5] = (char) (cArr4[i5] ^ (-5879130172463570806L));
                i5++;
            }
            cArr4 = cArr;
        }
        int i7 = (int) ((-5879130172463570806L) ^ equals);
        if (copy) {
            int length2 = bArr2.length;
            aFk1nSDK.getMonetizationNetwork = length2;
            char[] cArr5 = new char[length2];
            aFk1nSDK.AFAdRevenueData = 0;
            while (true) {
                int i8 = aFk1nSDK.AFAdRevenueData;
                int i9 = aFk1nSDK.getMonetizationNetwork;
                if (i8 >= i9) {
                    objArr[0] = new String(cArr5);
                    return;
                } else {
                    $11 = ($10 + 19) % UserVerificationMethods.USER_VERIFY_PATTERN;
                    cArr5[i8] = (char) (cArr4[bArr2[(i9 - 1) - i8] + i4] - i7);
                    aFk1nSDK.AFAdRevenueData = i8 + 1;
                }
            }
        } else {
            if (toString) {
                int length3 = cArr3.length;
                aFk1nSDK.getMonetizationNetwork = length3;
                char[] cArr6 = new char[length3];
                aFk1nSDK.AFAdRevenueData = 0;
                while (true) {
                    int i10 = aFk1nSDK.AFAdRevenueData;
                    int i11 = aFk1nSDK.getMonetizationNetwork;
                    if (i10 >= i11) {
                        break;
                    }
                    cArr6[i10] = (char) (cArr4[cArr3[(i11 - 1) - i10] - i4] - i7);
                    aFk1nSDK.AFAdRevenueData = i10 + 1;
                }
                String str3 = new String(cArr6);
                int i12 = $11 + 27;
                $10 = i12 % UserVerificationMethods.USER_VERIFY_PATTERN;
                if (i12 % 2 == 0) {
                    objArr[0] = str3;
                    return;
                } else {
                    int i13 = 15 / 0;
                    objArr[0] = str3;
                    return;
                }
            }
            int length4 = iArr.length;
            aFk1nSDK.getMonetizationNetwork = length4;
            char[] cArr7 = new char[length4];
            aFk1nSDK.AFAdRevenueData = 0;
            while (true) {
                int i14 = aFk1nSDK.AFAdRevenueData;
                int i15 = aFk1nSDK.getMonetizationNetwork;
                if (i14 >= i15) {
                    objArr[0] = new String(cArr7);
                    return;
                } else {
                    cArr7[i14] = (char) (cArr4[iArr[(i15 - 1) - i14] - i4] - i7);
                    aFk1nSDK.AFAdRevenueData = i14 + 1;
                }
            }
        }
    }

    private static /* synthetic */ Object getCurrencyIso4217Code(Object[] objArr) {
        AFd1uSDK aFd1uSDK = (AFd1uSDK) objArr[0];
        copydefault = (AFLogger + 43) % UserVerificationMethods.USER_VERIFY_PATTERN;
        Intrinsics.checkNotNullParameter(aFd1uSDK, "");
        aFd1uSDK.equals();
        int i4 = copydefault + 69;
        AFLogger = i4 % UserVerificationMethods.USER_VERIFY_PATTERN;
        if (i4 % 2 == 0) {
            int i5 = 22 / 0;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void getMonetizationNetwork(AFd1uSDK aFd1uSDK) {
        AFLogger = (copydefault + 9) % UserVerificationMethods.USER_VERIFY_PATTERN;
        Intrinsics.checkNotNullParameter(aFd1uSDK, "");
        aFd1uSDK.copy();
        AFLogger = (copydefault + 51) % UserVerificationMethods.USER_VERIFY_PATTERN;
    }

    private final void getCurrencyIso4217Code(String str, String str2) {
        AFLogger = (copydefault + 53) % UserVerificationMethods.USER_VERIFY_PATTERN;
        byte[] bytes = str.getBytes(Charsets.UTF_8);
        Intrinsics.checkNotNullExpressionValue(bytes, "");
        ((AFd1xSDK) getMediationNetwork(new Object[]{this}, -704520981, 704520985, System.identityHashCode(this))).getMediationNetwork(bytes, MapsKt.mapOf(TuplesKt.to("Authorization", AFj1cSDK.getRevenue(str, str2))), 2000);
        int i4 = copydefault + 95;
        AFLogger = i4 % UserVerificationMethods.USER_VERIFY_PATTERN;
        if (i4 % 2 == 0) {
            int i5 = 81 / 0;
        }
    }

    private final AFc1pSDK getMediationNetwork() {
        copydefault = (AFLogger + 87) % UserVerificationMethods.USER_VERIFY_PATTERN;
        AFc1pSDK aFc1pSDK = (AFc1pSDK) this.getMonetizationNetwork.getValue();
        AFLogger = (copydefault + 59) % UserVerificationMethods.USER_VERIFY_PATTERN;
        return aFc1pSDK;
    }

    private final boolean getMonetizationNetwork(AFh1dSDK aFh1dSDK) {
        copydefault = (AFLogger + 67) % UserVerificationMethods.USER_VERIFY_PATTERN;
        long currentTimeMillis = System.currentTimeMillis();
        long currencyIso4217Code = component2().getCurrencyIso4217Code("af_send_exc_to_server_window", -1L);
        if (aFh1dSDK.getMediationNetwork < TimeUnit.MILLISECONDS.toSeconds(currentTimeMillis)) {
            copydefault = (AFLogger + 25) % UserVerificationMethods.USER_VERIFY_PATTERN;
            return false;
        }
        if (currencyIso4217Code == -1 || currencyIso4217Code < currentTimeMillis) {
            return false;
        }
        return getMediationNetwork(aFh1dSDK);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void getMediationNetwork(AFd1uSDK aFd1uSDK, Throwable th, String str) {
        AFh1dSDK aFh1dSDK;
        int i4 = copydefault + InterfaceC1490j3.d.b.f16810b;
        AFLogger = i4 % UserVerificationMethods.USER_VERIFY_PATTERN;
        if (i4 % 2 == 0) {
            Intrinsics.checkNotNullParameter(aFd1uSDK, "");
            Intrinsics.checkNotNullParameter(th, "");
            Intrinsics.checkNotNullParameter(str, "");
            aFh1dSDK = (AFh1dSDK) getMediationNetwork(new Object[]{aFd1uSDK}, 855295870, -855295867, System.identityHashCode(aFd1uSDK));
            int i5 = 90 / 0;
            if (aFh1dSDK == null) {
                return;
            }
        } else {
            Intrinsics.checkNotNullParameter(aFd1uSDK, "");
            Intrinsics.checkNotNullParameter(th, "");
            Intrinsics.checkNotNullParameter(str, "");
            aFh1dSDK = (AFh1dSDK) getMediationNetwork(new Object[]{aFd1uSDK}, 855295870, -855295867, System.identityHashCode(aFd1uSDK));
            if (aFh1dSDK == null) {
                return;
            }
        }
        if (aFd1uSDK.getMonetizationNetwork(aFh1dSDK)) {
            aFd1uSDK.getRevenue().AFAdRevenueData(th, str);
            AFLogger = (copydefault + 91) % UserVerificationMethods.USER_VERIFY_PATTERN;
        }
    }

    @Override // com.appsflyer.internal.AFd1vSDK
    public final void AFAdRevenueData() {
        int i4 = copydefault + 61;
        AFLogger = i4 % UserVerificationMethods.USER_VERIFY_PATTERN;
        if (i4 % 2 != 0) {
            areAllFieldsValid().execute(new Runnable() { // from class: com.appsflyer.internal.r
                @Override // java.lang.Runnable
                public final void run() {
                    AFd1uSDK.AFAdRevenueData(AFd1uSDK.this);
                }
            });
            copydefault = (AFLogger + 81) % UserVerificationMethods.USER_VERIFY_PATTERN;
        } else {
            areAllFieldsValid().execute(new Runnable() { // from class: com.appsflyer.internal.r
                @Override // java.lang.Runnable
                public final void run() {
                    AFd1uSDK.AFAdRevenueData(AFd1uSDK.this);
                }
            });
            throw null;
        }
    }

    public final AFc1aSDK getRevenue() {
        int i4 = copydefault + 41;
        AFLogger = i4 % UserVerificationMethods.USER_VERIFY_PATTERN;
        if (i4 % 2 != 0) {
            return (AFc1aSDK) this.component4.getValue();
        }
        throw null;
    }

    private final void getRevenue(AFh1dSDK aFh1dSDK) {
        int i4;
        long currentTimeMillis;
        int i5 = copydefault + BuildConfig.API_LEVEL;
        AFLogger = i5 % UserVerificationMethods.USER_VERIFY_PATTERN;
        if (i5 % 2 == 0) {
            i4 = aFh1dSDK.getCurrencyIso4217Code;
            currentTimeMillis = System.currentTimeMillis() ^ TimeUnit.DAYS.toMillis(aFh1dSDK.AFAdRevenueData);
        } else {
            i4 = aFh1dSDK.getCurrencyIso4217Code;
            currentTimeMillis = System.currentTimeMillis() + TimeUnit.DAYS.toMillis(aFh1dSDK.AFAdRevenueData);
        }
        AFc1qSDK component2 = component2();
        component2.getMonetizationNetwork("af_send_exc_to_server_window", currentTimeMillis);
        component2.getMediationNetwork("af_send_exc_min", i4);
    }

    private static /* synthetic */ Object AFAdRevenueData(Object[] objArr) {
        final AFd1uSDK aFd1uSDK = (AFd1uSDK) objArr[0];
        int i4 = AFLogger + 79;
        copydefault = i4 % UserVerificationMethods.USER_VERIFY_PATTERN;
        if (i4 % 2 != 0) {
            aFd1uSDK.areAllFieldsValid().execute(new Runnable() { // from class: com.appsflyer.internal.t
                @Override // java.lang.Runnable
                public final void run() {
                    AFd1uSDK.getMonetizationNetwork(AFd1uSDK.this);
                }
            });
            int i5 = 76 / 0;
        } else {
            aFd1uSDK.areAllFieldsValid().execute(new Runnable() { // from class: com.appsflyer.internal.t
                @Override // java.lang.Runnable
                public final void run() {
                    AFd1uSDK.getMonetizationNetwork(AFd1uSDK.this);
                }
            });
        }
        int i6 = copydefault + 21;
        AFLogger = i6 % UserVerificationMethods.USER_VERIFY_PATTERN;
        if (i6 % 2 == 0) {
            int i7 = 93 / 0;
        }
        return null;
    }

    private final boolean getCurrencyIso4217Code(AFh1dSDK aFh1dSDK) {
        long currentTimeMillis = System.currentTimeMillis();
        long currencyIso4217Code = component2().getCurrencyIso4217Code("af_send_exc_to_server_window", -1L);
        if (aFh1dSDK.getMediationNetwork < TimeUnit.MILLISECONDS.toSeconds(currentTimeMillis)) {
            return false;
        }
        if (currencyIso4217Code != -1) {
            copydefault = (AFLogger + 27) % UserVerificationMethods.USER_VERIFY_PATTERN;
            if (currencyIso4217Code >= currentTimeMillis) {
                int AFAdRevenueData = component2().AFAdRevenueData("af_send_exc_min", -1);
                if (AFAdRevenueData == -1 || getRevenue().getCurrencyIso4217Code() < AFAdRevenueData) {
                    return false;
                }
                return getMediationNetwork(aFh1dSDK);
            }
        }
        copydefault = (AFLogger + 13) % UserVerificationMethods.USER_VERIFY_PATTERN;
        return false;
    }

    @Override // com.appsflyer.internal.AFd1vSDK
    public final void getMediationNetwork(final Throwable th, final String str) {
        copydefault = (AFLogger + 75) % UserVerificationMethods.USER_VERIFY_PATTERN;
        Intrinsics.checkNotNullParameter(th, "");
        Intrinsics.checkNotNullParameter(str, "");
        areAllFieldsValid().execute(new Runnable() { // from class: com.appsflyer.internal.q
            @Override // java.lang.Runnable
            public final void run() {
                AFd1uSDK.getMediationNetwork(AFd1uSDK.this, th, str);
            }
        });
        AFLogger = (copydefault + 53) % UserVerificationMethods.USER_VERIFY_PATTERN;
    }

    private final Map<String, String> AFAdRevenueData(AFh1dSDK aFh1dSDK) {
        Object[] objArr = new Object[1];
        a("\u0085\u0084\u0083\u0082\u0081", null, null, ExpandableListView.getPackedPositionType(0L) + 127, objArr);
        Map<String, String> mapOf = MapsKt.mapOf(TuplesKt.to(((String) objArr[0]).intern(), Build.BRAND), TuplesKt.to("model", Build.MODEL), TuplesKt.to("app_id", getMediationNetwork().getRevenue.getMonetizationNetwork.getPackageName()), TuplesKt.to("p_ex", new AFa1vSDK().getMonetizationNetwork()), TuplesKt.to("api", String.valueOf(Build.VERSION.SDK_INT)), TuplesKt.to(ge.f16386A1, this.component1), TuplesKt.to("uid", AFb1iSDK.getRevenue(getMediationNetwork().getMonetizationNetwork)), TuplesKt.to("exc_config", aFh1dSDK.getMonetizationNetwork()));
        int i4 = copydefault + 125;
        AFLogger = i4 % UserVerificationMethods.USER_VERIFY_PATTERN;
        if (i4 % 2 != 0) {
            return mapOf;
        }
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void getMediationNetwork(AFd1uSDK aFd1uSDK) {
        copydefault = (AFLogger + 83) % UserVerificationMethods.USER_VERIFY_PATTERN;
        Intrinsics.checkNotNullParameter(aFd1uSDK, "");
        aFd1uSDK.copydefault();
        AFLogger = (copydefault + 105) % UserVerificationMethods.USER_VERIFY_PATTERN;
    }

    private final boolean getMediationNetwork(AFh1dSDK aFh1dSDK) {
        new AFd1sSDK();
        String str = this.component1;
        String str2 = aFh1dSDK.getRevenue;
        Intrinsics.checkNotNullExpressionValue(str2, "");
        boolean mediationNetwork = AFd1sSDK.getMediationNetwork(str, str2);
        AFLogger = (copydefault + 79) % UserVerificationMethods.USER_VERIFY_PATTERN;
        return mediationNetwork;
    }

    @Override // com.appsflyer.internal.AFd1vSDK
    public final void getCurrencyIso4217Code() {
        getMediationNetwork(new Object[]{this}, 58037992, -58037990, System.identityHashCode(this));
    }

    private static Map<String, Object> getMediationNetwork(Map<String, ? extends Object> map, List<AFc1cSDK> list) {
        return (Map) getMediationNetwork(new Object[]{map, list}, -1072478634, 1072478634, (int) System.currentTimeMillis());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void AFAdRevenueData(AFd1uSDK aFd1uSDK) {
        getMediationNetwork(new Object[]{aFd1uSDK}, 801406437, -801406436, (int) System.currentTimeMillis());
    }
}
