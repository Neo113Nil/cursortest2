package com.appsflyer.internal;

import R5.InterfaceC0168h;
import android.os.Build;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.View;
import com.appsflyer.AFLogger;
import com.appsflyer.internal.AFd1xSDK;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.H;
import kotlin.collections.I;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlin.text.MatchGroup;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class AFd1wSDK implements AFd1xSDK {
    private static int $10 = 0;
    private static int $11 = 1;
    private static int copy = 1;
    private static int copydefault = 0;
    private static int equals = 400809482;
    private final InterfaceC0168h AFAdRevenueData;
    private final InterfaceC0168h areAllFieldsValid;
    private final String component1;
    private final InterfaceC0168h component2;
    private AFd1xSDK.AFa1tSDK component3;
    private final InterfaceC0168h component4;
    private final InterfaceC0168h getCurrencyIso4217Code;
    private AFd1zSDK getMediationNetwork;
    private final InterfaceC0168h getMonetizationNetwork;
    private final InterfaceC0168h getRevenue;

    @Metadata
    /* renamed from: com.appsflyer.internal.AFd1wSDK$1, reason: invalid class name */
    public static final class AnonymousClass1 extends kotlin.jvm.internal.p implements Function0<AFd1ySDK> {
        public AnonymousClass1() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: getMediationNetwork, reason: merged with bridge method [inline-methods] */
        public final AFd1ySDK invoke() {
            AFc1fSDK registerClient = AFd1wSDK.getMonetizationNetwork(AFd1wSDK.this).registerClient();
            Intrinsics.checkNotNullExpressionValue(registerClient, "");
            return new AFd1ySDK(registerClient);
        }
    }

    @Metadata
    /* renamed from: com.appsflyer.internal.AFd1wSDK$10, reason: invalid class name */
    public static final class AnonymousClass10 extends kotlin.jvm.internal.p implements Function0<AFf1kSDK> {
        public AnonymousClass10() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: getRevenue, reason: merged with bridge method [inline-methods] */
        public final AFf1kSDK invoke() {
            AFf1kSDK AFInAppEventParameterName = AFd1wSDK.getMonetizationNetwork(AFd1wSDK.this).AFInAppEventParameterName();
            Intrinsics.checkNotNullExpressionValue(AFInAppEventParameterName, "");
            return AFInAppEventParameterName;
        }
    }

    @Metadata
    /* renamed from: com.appsflyer.internal.AFd1wSDK$2, reason: invalid class name */
    public static final class AnonymousClass2 extends kotlin.jvm.internal.p implements Function0<AFc1kSDK> {
        public AnonymousClass2() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: AFAdRevenueData, reason: merged with bridge method [inline-methods] */
        public final AFc1kSDK invoke() {
            AFc1kSDK AFAdRevenueData = AFd1wSDK.getMonetizationNetwork(AFd1wSDK.this).AFAdRevenueData();
            Intrinsics.checkNotNullExpressionValue(AFAdRevenueData, "");
            return AFAdRevenueData;
        }
    }

    @Metadata
    /* renamed from: com.appsflyer.internal.AFd1wSDK$3, reason: invalid class name */
    public static final class AnonymousClass3 extends kotlin.jvm.internal.p implements Function0<AFf1mSDK> {
        public AnonymousClass3() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: getRevenue, reason: merged with bridge method [inline-methods] */
        public final AFf1mSDK invoke() {
            AFf1mSDK component3 = AFd1wSDK.getMonetizationNetwork(AFd1wSDK.this).component3();
            Intrinsics.checkNotNullExpressionValue(component3, "");
            return component3;
        }
    }

    @Metadata
    /* renamed from: com.appsflyer.internal.AFd1wSDK$4, reason: invalid class name */
    public static final class AnonymousClass4 extends kotlin.jvm.internal.p implements Function0<AFc1jSDK> {
        public AnonymousClass4() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: getMediationNetwork, reason: merged with bridge method [inline-methods] */
        public final AFc1jSDK invoke() {
            AFc1jSDK mediationNetwork = AFd1wSDK.getMonetizationNetwork(AFd1wSDK.this).getMediationNetwork();
            Intrinsics.checkNotNullExpressionValue(mediationNetwork, "");
            return mediationNetwork;
        }
    }

    @Metadata
    /* renamed from: com.appsflyer.internal.AFd1wSDK$5, reason: invalid class name */
    public static final class AnonymousClass5 extends kotlin.jvm.internal.p implements Function0<ExecutorService> {
        public AnonymousClass5() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: AFAdRevenueData, reason: merged with bridge method [inline-methods] */
        public final ExecutorService invoke() {
            ExecutorService currencyIso4217Code = AFd1wSDK.getMonetizationNetwork(AFd1wSDK.this).getCurrencyIso4217Code();
            Intrinsics.checkNotNullExpressionValue(currencyIso4217Code, "");
            return currencyIso4217Code;
        }
    }

    @Metadata
    /* renamed from: com.appsflyer.internal.AFd1wSDK$7, reason: invalid class name */
    public static final class AnonymousClass7 extends kotlin.jvm.internal.p implements Function0<AFd1uSDK> {
        public AnonymousClass7() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: getRevenue, reason: merged with bridge method [inline-methods] */
        public final AFd1uSDK invoke() {
            return new AFd1uSDK(AFd1wSDK.this.AFAdRevenueData());
        }
    }

    public AFd1wSDK(AFd1zSDK aFd1zSDK) {
        Intrinsics.checkNotNullParameter(aFd1zSDK, "");
        this.getMediationNetwork = aFd1zSDK;
        this.getRevenue = R5.i.b(new AnonymousClass3());
        this.AFAdRevenueData = R5.i.b(new AnonymousClass2());
        this.getCurrencyIso4217Code = R5.i.b(new AnonymousClass4());
        this.getMonetizationNetwork = R5.i.b(new AnonymousClass10());
        this.component4 = R5.i.b(new AnonymousClass5());
        this.component1 = "6.18.0";
        this.component2 = R5.i.b(new AnonymousClass1());
        this.areAllFieldsValid = R5.i.b(new AnonymousClass7());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void AFAdRevenueData(AFd1wSDK aFd1wSDK, Throwable th, String str) {
        Intrinsics.checkNotNullParameter(aFd1wSDK, "");
        Intrinsics.checkNotNullParameter(th, "");
        Intrinsics.checkNotNullParameter(str, "");
        AFh1bSDK aFh1bSDK = (AFh1bSDK) getCurrencyIso4217Code(new Object[]{aFd1wSDK}, 1447743159, -1447743158, System.identityHashCode(aFd1wSDK));
        if (aFh1bSDK != null) {
            copy = (copydefault + 35) % 128;
            if (aFd1wSDK.getMonetizationNetwork(aFh1bSDK)) {
                aFd1wSDK.AFAdRevenueData().getCurrencyIso4217Code(th, str);
            }
        }
        copydefault = (copy + 7) % 128;
    }

    private final AFc1jSDK areAllFieldsValid() {
        copydefault = (copy + 45) % 128;
        AFc1jSDK aFc1jSDK = (AFc1jSDK) this.getCurrencyIso4217Code.getValue();
        int i2 = copydefault + 81;
        copy = i2 % 128;
        if (i2 % 2 != 0) {
            return aFc1jSDK;
        }
        throw null;
    }

    private final AFf1kSDK component1() {
        copydefault = (copy + 11) % 128;
        AFf1kSDK aFf1kSDK = (AFf1kSDK) this.getMonetizationNetwork.getValue();
        int i2 = copydefault + 103;
        copy = i2 % 128;
        if (i2 % 2 != 0) {
            return aFf1kSDK;
        }
        throw null;
    }

    private final ExecutorService component2() {
        return (ExecutorService) getCurrencyIso4217Code(new Object[]{this}, -1790300569, 1790300573, System.identityHashCode(this));
    }

    private final AFh1bSDK component3() {
        return (AFh1bSDK) getCurrencyIso4217Code(new Object[]{this}, 1447743159, -1447743158, System.identityHashCode(this));
    }

    private AFd1vSDK component4() {
        AFd1vSDK aFd1vSDK;
        int i2 = copy + 119;
        copydefault = i2 % 128;
        if (i2 % 2 != 0) {
            aFd1vSDK = (AFd1vSDK) this.areAllFieldsValid.getValue();
            int i5 = 28 / 0;
        } else {
            aFd1vSDK = (AFd1vSDK) this.areAllFieldsValid.getValue();
        }
        int i7 = copy + 73;
        copydefault = i7 % 128;
        if (i7 % 2 == 0) {
            return aFd1vSDK;
        }
        throw null;
    }

    private final synchronized void copy() {
        boolean z7;
        try {
            copy = (copydefault + 39) % 128;
            AFh1bSDK aFh1bSDK = (AFh1bSDK) getCurrencyIso4217Code(new Object[]{this}, 1447743159, -1447743158, System.identityHashCode(this));
            if (aFh1bSDK != null) {
                if (aFh1bSDK.AFAdRevenueData == -1) {
                    areAllFieldsValid().getCurrencyIso4217Code("af_send_exc_to_server_window");
                } else if (areAllFieldsValid().getMediationNetwork("af_send_exc_to_server_window", -1L) == -1) {
                    copy = (copydefault + 57) % 128;
                    getCurrencyIso4217Code(aFh1bSDK);
                }
                z7 = getMonetizationNetwork(aFh1bSDK);
            } else {
                z7 = false;
            }
            AFd1xSDK.AFa1tSDK aFa1tSDK = this.component3;
            if (aFa1tSDK != null) {
                aFa1tSDK.onConfigurationChanged(z7);
                copydefault = (copy + 35) % 128;
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:77:0x013a, code lost:
    
        if (r0.intValue() == (-1)) goto L75;
     */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x013e A[Catch: all -> 0x001a, TryCatch #0 {all -> 0x001a, blocks: (B:3:0x0001, B:5:0x0017, B:6:0x0027, B:8:0x0035, B:12:0x0053, B:14:0x0064, B:16:0x006b, B:18:0x007d, B:20:0x0089, B:22:0x008d, B:24:0x009f, B:26:0x00a9, B:28:0x00ad, B:30:0x00b3, B:31:0x00b9, B:33:0x00c7, B:35:0x00cb, B:37:0x00d1, B:38:0x00d7, B:40:0x00e5, B:42:0x00e9, B:44:0x00ef, B:45:0x00f5, B:46:0x00f8, B:47:0x0101, B:49:0x0111, B:51:0x0115, B:52:0x011b, B:54:0x012b, B:56:0x012f, B:60:0x013e, B:61:0x01a9, B:63:0x01ad, B:65:0x01bd, B:66:0x01c1, B:72:0x014e, B:74:0x0168, B:75:0x0180, B:76:0x0136, B:87:0x00ff, B:89:0x0191, B:90:0x0199, B:91:0x001d, B:84:0x00fd), top: B:2:0x0001, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x01ad A[Catch: all -> 0x001a, TryCatch #0 {all -> 0x001a, blocks: (B:3:0x0001, B:5:0x0017, B:6:0x0027, B:8:0x0035, B:12:0x0053, B:14:0x0064, B:16:0x006b, B:18:0x007d, B:20:0x0089, B:22:0x008d, B:24:0x009f, B:26:0x00a9, B:28:0x00ad, B:30:0x00b3, B:31:0x00b9, B:33:0x00c7, B:35:0x00cb, B:37:0x00d1, B:38:0x00d7, B:40:0x00e5, B:42:0x00e9, B:44:0x00ef, B:45:0x00f5, B:46:0x00f8, B:47:0x0101, B:49:0x0111, B:51:0x0115, B:52:0x011b, B:54:0x012b, B:56:0x012f, B:60:0x013e, B:61:0x01a9, B:63:0x01ad, B:65:0x01bd, B:66:0x01c1, B:72:0x014e, B:74:0x0168, B:75:0x0180, B:76:0x0136, B:87:0x00ff, B:89:0x0191, B:90:0x0199, B:91:0x001d, B:84:0x00fd), top: B:2:0x0001, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x01c6 A[DONT_GENERATE] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x014e A[Catch: all -> 0x001a, TryCatch #0 {all -> 0x001a, blocks: (B:3:0x0001, B:5:0x0017, B:6:0x0027, B:8:0x0035, B:12:0x0053, B:14:0x0064, B:16:0x006b, B:18:0x007d, B:20:0x0089, B:22:0x008d, B:24:0x009f, B:26:0x00a9, B:28:0x00ad, B:30:0x00b3, B:31:0x00b9, B:33:0x00c7, B:35:0x00cb, B:37:0x00d1, B:38:0x00d7, B:40:0x00e5, B:42:0x00e9, B:44:0x00ef, B:45:0x00f5, B:46:0x00f8, B:47:0x0101, B:49:0x0111, B:51:0x0115, B:52:0x011b, B:54:0x012b, B:56:0x012f, B:60:0x013e, B:61:0x01a9, B:63:0x01ad, B:65:0x01bd, B:66:0x01c1, B:72:0x014e, B:74:0x0168, B:75:0x0180, B:76:0x0136, B:87:0x00ff, B:89:0x0191, B:90:0x0199, B:91:0x001d, B:84:0x00fd), top: B:2:0x0001, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0136 A[Catch: all -> 0x001a, TryCatch #0 {all -> 0x001a, blocks: (B:3:0x0001, B:5:0x0017, B:6:0x0027, B:8:0x0035, B:12:0x0053, B:14:0x0064, B:16:0x006b, B:18:0x007d, B:20:0x0089, B:22:0x008d, B:24:0x009f, B:26:0x00a9, B:28:0x00ad, B:30:0x00b3, B:31:0x00b9, B:33:0x00c7, B:35:0x00cb, B:37:0x00d1, B:38:0x00d7, B:40:0x00e5, B:42:0x00e9, B:44:0x00ef, B:45:0x00f5, B:46:0x00f8, B:47:0x0101, B:49:0x0111, B:51:0x0115, B:52:0x011b, B:54:0x012b, B:56:0x012f, B:60:0x013e, B:61:0x01a9, B:63:0x01ad, B:65:0x01bd, B:66:0x01c1, B:72:0x014e, B:74:0x0168, B:75:0x0180, B:76:0x0136, B:87:0x00ff, B:89:0x0191, B:90:0x0199, B:91:0x001d, B:84:0x00fd), top: B:2:0x0001, inners: #1 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final synchronized void copydefault() {
        long j;
        AFd1xSDK.AFa1tSDK aFa1tSDK;
        Integer num;
        Pair<Integer, Integer> mediationNetwork;
        AFh1bSDK aFh1bSDK;
        String str;
        String str2;
        int i2;
        String str3;
        Integer intOrNull;
        String str4;
        Integer intOrNull2;
        String str5;
        Integer intOrNull3;
        try {
            AFh1bSDK aFh1bSDK2 = (AFh1bSDK) getCurrencyIso4217Code(new Object[]{this}, 1447743159, -1447743158, System.identityHashCode(this));
            if (aFh1bSDK2 != null) {
                j = aFh1bSDK2.getMediationNetwork;
            } else {
                copydefault = (copy + 41) % 128;
                j = -1;
            }
            if (j < TimeUnit.MILLISECONDS.toSeconds(System.currentTimeMillis())) {
                AFg1hSDK.v$default(AFLogger.INSTANCE, AFg1cSDK.EXCEPTION_MANAGER, "TTL is already passed", false, 4, null);
                areAllFieldsValid().getCurrencyIso4217Code("af_send_exc_to_server_window");
                AFAdRevenueData().getMediationNetwork();
                return;
            }
            AFh1bSDK aFh1bSDK3 = (AFh1bSDK) getCurrencyIso4217Code(new Object[]{this}, 1447743159, -1447743158, System.identityHashCode(this));
            if (aFh1bSDK3 != null) {
                if (getRevenue(aFh1bSDK3)) {
                    AFh1bSDK aFh1bSDK4 = (AFh1bSDK) getCurrencyIso4217Code(new Object[]{this}, 1447743159, -1447743158, System.identityHashCode(this));
                    Pair<Integer, Integer> pair = null;
                    if (aFh1bSDK4 != null) {
                        int i5 = copy + 65;
                        copydefault = i5 % 128;
                        if (i5 % 2 != 0) {
                            throw null;
                        }
                        String str6 = aFh1bSDK4.getMonetizationNetwork;
                        if (str6 != null) {
                            Intrinsics.checkNotNullParameter(str6, "");
                            D0.j b7 = new Regex("(\\d+).(\\d+).(\\d+).*").b(str6);
                            if (b7 != null) {
                                MatchGroup b8 = ((kotlin.text.g) b7.f331i).b(1);
                                int intValue = ((b8 == null || (str5 = b8.f6178a) == null || (intOrNull3 = StringsKt.toIntOrNull(str5)) == null) ? 0 : intOrNull3.intValue()) * 1000000;
                                MatchGroup b9 = ((kotlin.text.g) b7.f331i).b(2);
                                int intValue2 = (((b9 == null || (str4 = b9.f6178a) == null || (intOrNull2 = StringsKt.toIntOrNull(str4)) == null) ? 0 : intOrNull2.intValue()) * 1000) + intValue;
                                MatchGroup b10 = ((kotlin.text.g) b7.f331i).b(3);
                                i2 = intValue2 + ((b10 == null || (str3 = b10.f6178a) == null || (intOrNull = StringsKt.toIntOrNull(str3)) == null) ? 0 : intOrNull.intValue());
                            } else {
                                i2 = -1;
                            }
                            num = Integer.valueOf(i2);
                            AFh1bSDK aFh1bSDK5 = (AFh1bSDK) getCurrencyIso4217Code(new Object[]{this}, 1447743159, -1447743158, System.identityHashCode(this));
                            mediationNetwork = (aFh1bSDK5 != null || (str2 = aFh1bSDK5.getMonetizationNetwork) == null) ? null : AFd1pSDK.getMediationNetwork(str2);
                            aFh1bSDK = (AFh1bSDK) getCurrencyIso4217Code(new Object[]{this}, 1447743159, -1447743158, System.identityHashCode(this));
                            if (aFh1bSDK != null && (str = aFh1bSDK.getMonetizationNetwork) != null) {
                                pair = AFd1pSDK.getCurrencyIso4217Code(str);
                            }
                            if (num != null) {
                            }
                            if (mediationNetwork == null) {
                                AFAdRevenueData().getRevenue(this.component1);
                                aFa1tSDK = this.component3;
                                if (aFa1tSDK == null) {
                                    AFh1bSDK aFh1bSDK6 = (AFh1bSDK) getCurrencyIso4217Code(new Object[]{this}, 1447743159, -1447743158, System.identityHashCode(this));
                                    aFa1tSDK.onConfigurationChanged(aFh1bSDK6 != null ? getMonetizationNetwork(aFh1bSDK6) : false);
                                    return;
                                }
                                return;
                            }
                            if (mediationNetwork == null) {
                                AFAdRevenueData().AFAdRevenueData(((Number) mediationNetwork.f6112d).intValue(), ((Number) mediationNetwork.f6113e).intValue());
                            } else if (pair != null) {
                                AFAdRevenueData().AFAdRevenueData(((Number) pair.f6112d).intValue(), ((Number) pair.f6113e).intValue());
                            } else {
                                areAllFieldsValid().getCurrencyIso4217Code("af_send_exc_to_server_window");
                                AFAdRevenueData().getMediationNetwork();
                            }
                            aFa1tSDK = this.component3;
                            if (aFa1tSDK == null) {
                            }
                        }
                    }
                    num = null;
                    AFh1bSDK aFh1bSDK52 = (AFh1bSDK) getCurrencyIso4217Code(new Object[]{this}, 1447743159, -1447743158, System.identityHashCode(this));
                    if (aFh1bSDK52 != null) {
                    }
                    aFh1bSDK = (AFh1bSDK) getCurrencyIso4217Code(new Object[]{this}, 1447743159, -1447743158, System.identityHashCode(this));
                    if (aFh1bSDK != null) {
                        pair = AFd1pSDK.getCurrencyIso4217Code(str);
                    }
                    if (num != null) {
                    }
                    if (mediationNetwork == null) {
                    }
                    if (mediationNetwork == null) {
                    }
                    aFa1tSDK = this.component3;
                    if (aFa1tSDK == null) {
                    }
                } else {
                    copydefault = (copy + 109) % 128;
                }
            }
            areAllFieldsValid().getCurrencyIso4217Code("af_send_exc_to_server_window");
            AFAdRevenueData().getMediationNetwork();
            aFa1tSDK = this.component3;
            if (aFa1tSDK == null) {
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    private final void equals() {
        AFh1bSDK aFh1bSDK = (AFh1bSDK) getCurrencyIso4217Code(new Object[]{this}, 1447743159, -1447743158, System.identityHashCode(this));
        if (aFh1bSDK != null) {
            copydefault = (copy + 69) % 128;
            if (!getMediationNetwork(aFh1bSDK)) {
                AFg1hSDK.v$default(AFLogger.INSTANCE, AFg1cSDK.EXCEPTION_MANAGER, "skipping", false, 4, null);
                return;
            }
            String monetizationNetwork = component1().getMonetizationNetwork();
            if (monetizationNetwork != null) {
                String jSONObject = new JSONObject((Map) getCurrencyIso4217Code(new Object[]{AFAdRevenueData(aFh1bSDK), AFAdRevenueData().AFAdRevenueData()}, -1431128038, 1431128041, (int) System.currentTimeMillis())).toString();
                Intrinsics.checkNotNullExpressionValue(jSONObject, "");
                Intrinsics.checkNotNullExpressionValue(monetizationNetwork, "");
                getCurrencyIso4217Code(jSONObject, monetizationNetwork);
                int i2 = copy + 33;
                copydefault = i2 % 128;
                if (i2 % 2 != 0) {
                    int i5 = 40 / 0;
                }
            }
        }
    }

    public static /* synthetic */ Object getCurrencyIso4217Code(Object[] objArr, int i2, int i5, int i7) {
        int i8 = ~((~i2) | i5);
        int i9 = (((~(i2 | i7)) | (~((~i5) | i2)) | i8) * 70) + ((~(i2 | i5 | i7)) * 70) + (((~(i5 | i7)) | i8) * (-140)) + (i5 * (-69)) + (i2 * 71);
        if (i9 == 1) {
            return AFAdRevenueData(objArr);
        }
        if (i9 != 2) {
            return i9 != 3 ? i9 != 4 ? getCurrencyIso4217Code(objArr) : getRevenue(objArr) : getMonetizationNetwork(objArr);
        }
        AFd1wSDK aFd1wSDK = (AFd1wSDK) objArr[0];
        AFh1bSDK aFh1bSDK = (AFh1bSDK) objArr[1];
        long currentTimeMillis = System.currentTimeMillis();
        long mediationNetwork = aFd1wSDK.areAllFieldsValid().getMediationNetwork("af_send_exc_to_server_window", -1L);
        if (aFh1bSDK.getMediationNetwork < TimeUnit.MILLISECONDS.toSeconds(currentTimeMillis)) {
            int i10 = copydefault + 117;
            copy = i10 % 128;
            return Boolean.valueOf(i10 % 2 == 0);
        }
        if (mediationNetwork != -1) {
            copy = (copydefault + 95) % 128;
            if (mediationNetwork >= currentTimeMillis) {
                return Boolean.valueOf(aFd1wSDK.getRevenue(aFh1bSDK));
            }
        }
        return Boolean.FALSE;
    }

    private final AFc1kSDK getMediationNetwork() {
        copydefault = (copy + 31) % 128;
        AFc1kSDK aFc1kSDK = (AFc1kSDK) this.AFAdRevenueData.getValue();
        int i2 = copydefault + 53;
        copy = i2 % 128;
        if (i2 % 2 == 0) {
            int i5 = 91 / 0;
        }
        return aFc1kSDK;
    }

    public static final /* synthetic */ AFd1zSDK getMonetizationNetwork(AFd1wSDK aFd1wSDK) {
        int i2 = copy;
        copydefault = (i2 + 113) % 128;
        AFd1zSDK aFd1zSDK = aFd1wSDK.getMediationNetwork;
        int i5 = i2 + 33;
        copydefault = i5 % 128;
        if (i5 % 2 != 0) {
            int i7 = 90 / 0;
        }
        return aFd1zSDK;
    }

    private static /* synthetic */ Object getRevenue(Object[] objArr) {
        AFd1wSDK aFd1wSDK = (AFd1wSDK) objArr[0];
        int i2 = copy + 57;
        copydefault = i2 % 128;
        int i5 = i2 % 2;
        ExecutorService executorService = (ExecutorService) aFd1wSDK.component4.getValue();
        if (i5 != 0) {
            int i7 = 65 / 0;
        }
        return executorService;
    }

    private static void a(int i2, int i5, boolean z7, int i7, String str, Object[] objArr) {
        $11 = ($10 + 29) % 128;
        char[] cArr = str;
        if (str != null) {
            cArr = str.toCharArray();
        }
        char[] cArr2 = cArr;
        AFk1jSDK aFk1jSDK = new AFk1jSDK();
        char[] cArr3 = new char[i7];
        aFk1jSDK.getMonetizationNetwork = 0;
        while (true) {
            int i8 = aFk1jSDK.getMonetizationNetwork;
            if (i8 >= i7) {
                break;
            }
            $11 = ($10 + 97) % 128;
            char c7 = cArr2[i8];
            aFk1jSDK.getMediationNetwork = c7;
            char c8 = (char) (c7 + i2);
            cArr3[i8] = c8;
            cArr3[i8] = (char) (c8 - ((int) (equals ^ 4333921468659523104L)));
            aFk1jSDK.getMonetizationNetwork = i8 + 1;
        }
        if (i5 > 0) {
            $11 = ($10 + 121) % 128;
            aFk1jSDK.AFAdRevenueData = i5;
            char[] cArr4 = new char[i7];
            System.arraycopy(cArr3, 0, cArr4, 0, i7);
            int i9 = aFk1jSDK.AFAdRevenueData;
            System.arraycopy(cArr4, 0, cArr3, i7 - i9, i9);
            int i10 = aFk1jSDK.AFAdRevenueData;
            System.arraycopy(cArr4, i10, cArr3, 0, i7 - i10);
        }
        if (z7) {
            char[] cArr5 = new char[i7];
            aFk1jSDK.getMonetizationNetwork = 0;
            while (true) {
                int i11 = aFk1jSDK.getMonetizationNetwork;
                if (i11 >= i7) {
                    break;
                }
                cArr5[i11] = cArr3[(i7 - i11) - 1];
                aFk1jSDK.getMonetizationNetwork = i11 + 1;
            }
            cArr3 = cArr5;
        }
        objArr[0] = new String(cArr3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void getMediationNetwork(AFd1wSDK aFd1wSDK) {
        copy = (copydefault + 111) % 128;
        Intrinsics.checkNotNullParameter(aFd1wSDK, "");
        aFd1wSDK.equals();
        int i2 = copy + 117;
        copydefault = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
    }

    private final AFf1mSDK getMonetizationNetwork() {
        copy = (copydefault + 45) % 128;
        AFf1mSDK aFf1mSDK = (AFf1mSDK) this.getRevenue.getValue();
        copy = (copydefault + 77) % 128;
        return aFf1mSDK;
    }

    @Override // com.appsflyer.internal.AFd1xSDK
    public final void getRevenue() {
        copy = (copydefault + 47) % 128;
        ((ExecutorService) getCurrencyIso4217Code(new Object[]{this}, -1790300569, 1790300573, System.identityHashCode(this))).execute(new j(this, 0));
        copy = (copydefault + 51) % 128;
    }

    @Override // com.appsflyer.internal.AFd1xSDK
    public final void getMonetizationNetwork(AFd1xSDK.AFa1tSDK aFa1tSDK) {
        int i2 = copy + 57;
        copydefault = i2 % 128;
        if (i2 % 2 == 0) {
            this.component3 = aFa1tSDK;
            ((ExecutorService) getCurrencyIso4217Code(new Object[]{this}, -1790300569, 1790300573, System.identityHashCode(this))).execute(new j(this, 1));
            int i5 = copy + 121;
            copydefault = i5 % 128;
            if (i5 % 2 != 0) {
                int i7 = 69 / 0;
                return;
            }
            return;
        }
        this.component3 = aFa1tSDK;
        ((ExecutorService) getCurrencyIso4217Code(new Object[]{this}, -1790300569, 1790300573, System.identityHashCode(this))).execute(new j(this, 1));
        throw null;
    }

    private final boolean getRevenue(AFh1bSDK aFh1bSDK) {
        new AFd1rSDK();
        String str = this.component1;
        String str2 = aFh1bSDK.getMonetizationNetwork;
        Intrinsics.checkNotNullExpressionValue(str2, "");
        boolean revenue = AFd1rSDK.getRevenue(str, str2);
        copy = (copydefault + 107) % 128;
        return revenue;
    }

    private final boolean getMediationNetwork(AFh1bSDK aFh1bSDK) {
        int currencyIso4217Code;
        int i2 = copydefault + 109;
        copy = i2 % 128;
        if (i2 % 2 != 0) {
            long currentTimeMillis = System.currentTimeMillis();
            long mediationNetwork = areAllFieldsValid().getMediationNetwork("af_send_exc_to_server_window", -1L);
            if (aFh1bSDK.getMediationNetwork < TimeUnit.MILLISECONDS.toSeconds(currentTimeMillis)) {
                copydefault = (copy + 47) % 128;
                return false;
            }
            if (mediationNetwork != -1 && mediationNetwork >= currentTimeMillis && (currencyIso4217Code = areAllFieldsValid().getCurrencyIso4217Code("af_send_exc_min", -1)) != -1) {
                copy = (copydefault + 71) % 128;
                if (AFAdRevenueData().getRevenue() >= currencyIso4217Code) {
                    return getRevenue(aFh1bSDK);
                }
            }
            return false;
        }
        long currentTimeMillis2 = System.currentTimeMillis();
        areAllFieldsValid().getMediationNetwork("af_send_exc_to_server_window", -1L);
        long j = aFh1bSDK.getMediationNetwork;
        TimeUnit.MILLISECONDS.toSeconds(currentTimeMillis2);
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0025, code lost:
    
        r3 = r3.getMediationNetwork;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0027, code lost:
    
        if (r3 == null) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x002b, code lost:
    
        return r3.getCurrencyIso4217Code;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0023, code lost:
    
        if (r3 != null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x001c, code lost:
    
        if (r3 != null) goto L9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static /* synthetic */ Object AFAdRevenueData(Object[] objArr) {
        AFh1cSDK aFh1cSDK;
        AFd1wSDK aFd1wSDK = (AFd1wSDK) objArr[0];
        int i2 = copy + 69;
        copydefault = i2 % 128;
        int i5 = i2 % 2;
        AFf1mSDK monetizationNetwork = aFd1wSDK.getMonetizationNetwork();
        if (i5 != 0) {
            aFh1cSDK = monetizationNetwork.getCurrencyIso4217Code.AFAdRevenueData;
            int i7 = 52 / 0;
        } else {
            aFh1cSDK = monetizationNetwork.getCurrencyIso4217Code.AFAdRevenueData;
        }
        int i8 = copydefault + 99;
        copy = i8 % 128;
        if (i8 % 2 == 0) {
            int i9 = 96 / 0;
        }
        return null;
    }

    private static /* synthetic */ Object getCurrencyIso4217Code(Object[] objArr) {
        AFd1wSDK aFd1wSDK = (AFd1wSDK) objArr[0];
        Throwable th = (Throwable) objArr[1];
        String str = (String) objArr[2];
        copy = (copydefault + 119) % 128;
        Intrinsics.checkNotNullParameter(th, "");
        Intrinsics.checkNotNullParameter(str, "");
        ((ExecutorService) getCurrencyIso4217Code(new Object[]{aFd1wSDK}, -1790300569, 1790300573, System.identityHashCode(aFd1wSDK))).execute(new B5.b(aFd1wSDK, th, str, 4));
        int i2 = copydefault + 49;
        copy = i2 % 128;
        if (i2 % 2 == 0) {
            int i5 = 23 / 0;
        }
        return null;
    }

    private static Object getMonetizationNetwork(Object[] objArr) {
        Map map = (Map) objArr[0];
        List list = (List) objArr[1];
        copydefault = (copy + 71) % 128;
        Map e7 = I.e(new Pair("deviceInfo", map), new Pair("excs", AFd1sSDK.getMediationNetwork((List<AFc1bSDK>) list)));
        int i2 = copy + 121;
        copydefault = i2 % 128;
        if (i2 % 2 == 0) {
            return e7;
        }
        throw null;
    }

    @Override // com.appsflyer.internal.AFd1xSDK
    public final void getCurrencyIso4217Code() {
        copydefault = (copy + 123) % 128;
        ((ExecutorService) getCurrencyIso4217Code(new Object[]{this}, -1790300569, 1790300573, System.identityHashCode(this))).execute(new j(this, 2));
        copy = (copydefault + 105) % 128;
    }

    private final boolean getMonetizationNetwork(AFh1bSDK aFh1bSDK) {
        return ((Boolean) getCurrencyIso4217Code(new Object[]{this, aFh1bSDK}, 1535825086, -1535825084, System.identityHashCode(this))).booleanValue();
    }

    public final AFc1aSDK AFAdRevenueData() {
        int i2 = copy + 43;
        copydefault = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
        AFc1aSDK aFc1aSDK = (AFc1aSDK) this.component2.getValue();
        copy = (copydefault + 89) % 128;
        return aFc1aSDK;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void AFAdRevenueData(AFd1wSDK aFd1wSDK) {
        copy = (copydefault + 85) % 128;
        Intrinsics.checkNotNullParameter(aFd1wSDK, "");
        aFd1wSDK.copydefault();
        copy = (copydefault + 105) % 128;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void getCurrencyIso4217Code(AFd1wSDK aFd1wSDK) {
        copy = (copydefault + 25) % 128;
        Intrinsics.checkNotNullParameter(aFd1wSDK, "");
        aFd1wSDK.copy();
        copydefault = (copy + 59) % 128;
    }

    @Override // com.appsflyer.internal.AFd1xSDK
    public final void getMediationNetwork(Throwable th, String str) {
        getCurrencyIso4217Code(new Object[]{this, th, str}, 1429511836, -1429511836, System.identityHashCode(this));
    }

    private final Map<String, String> AFAdRevenueData(AFh1bSDK aFh1bSDK) {
        Object[] objArr = new Object[1];
        a((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 144, View.MeasureSpec.getMode(0) + 1, false, 5 - TextUtils.indexOf("", "", 0, 0), "�\ufffb\u000b\ufffa\u0007", objArr);
        Map<String, String> e7 = I.e(new Pair(((String) objArr[0]).intern(), Build.BRAND), new Pair("model", Build.MODEL), new Pair("app_id", getMediationNetwork().getRevenue.getCurrencyIso4217Code.getPackageName()), new Pair("p_ex", new AFa1vSDK().getRevenue()), new Pair("api", String.valueOf(Build.VERSION.SDK_INT)), new Pair("sdk", this.component1), new Pair("uid", AFb1iSDK.getCurrencyIso4217Code(getMediationNetwork().getCurrencyIso4217Code)), new Pair("exc_config", aFh1bSDK.getMonetizationNetwork()));
        copy = (copydefault + 99) % 128;
        return e7;
    }

    private final void getCurrencyIso4217Code(AFh1bSDK aFh1bSDK) {
        int i2;
        AFc1jSDK areAllFieldsValid;
        int i5 = copydefault + 13;
        copy = i5 % 128;
        if (i5 % 2 == 0) {
            i2 = aFh1bSDK.getCurrencyIso4217Code;
            long currentTimeMillis = System.currentTimeMillis() | TimeUnit.DAYS.toMillis(aFh1bSDK.AFAdRevenueData);
            areAllFieldsValid = areAllFieldsValid();
            areAllFieldsValid.getRevenue("af_send_exc_to_server_window", currentTimeMillis);
        } else {
            i2 = aFh1bSDK.getCurrencyIso4217Code;
            long millis = TimeUnit.DAYS.toMillis(aFh1bSDK.AFAdRevenueData) + System.currentTimeMillis();
            areAllFieldsValid = areAllFieldsValid();
            areAllFieldsValid.getRevenue("af_send_exc_to_server_window", millis);
        }
        areAllFieldsValid.AFAdRevenueData("af_send_exc_min", i2);
        int i7 = copy + 117;
        copydefault = i7 % 128;
        if (i7 % 2 != 0) {
            int i8 = 3 / 0;
        }
    }

    private final void getCurrencyIso4217Code(String str, String str2) {
        copydefault = (copy + 97) % 128;
        byte[] bytes = str.getBytes(Charsets.UTF_8);
        Intrinsics.checkNotNullExpressionValue(bytes, "");
        component4().getMediationNetwork(bytes, H.b(new Pair("Authorization", AFj1jSDK.getCurrencyIso4217Code(str, str2))), 2000);
        int i2 = copydefault + 115;
        copy = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
    }

    private static Map<String, Object> getCurrencyIso4217Code(Map<String, ? extends Object> map, List<AFc1bSDK> list) {
        return (Map) getCurrencyIso4217Code(new Object[]{map, list}, -1431128038, 1431128041, (int) System.currentTimeMillis());
    }
}
