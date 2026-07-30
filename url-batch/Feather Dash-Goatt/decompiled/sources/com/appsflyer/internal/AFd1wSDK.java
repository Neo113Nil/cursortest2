package com.appsflyer.internal;

import android.os.Build;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.View;
import com.android.installreferrer.api.InstallReferrerClient;
import com.appsflyer.AFLogger;
import com.appsflyer.internal.AFd1xSDK;
import defpackage.ae0;
import defpackage.ee0;
import defpackage.hk0;
import defpackage.ik0;
import defpackage.kk0;
import defpackage.lq;
import defpackage.pc0;
import defpackage.ry0;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.text.Charsets;
import kotlin.text.MatchGroup;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import org.json.JSONObject;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class AFd1wSDK implements AFd1xSDK {
    private static int $10 = 0;
    private static int $11 = 1;
    private static int copy = 1;
    private static int copydefault = 0;
    private static int equals = 400809482;
    private final ae0 AFAdRevenueData;
    private final ae0 areAllFieldsValid;
    private final String component1;
    private final ae0 component2;
    private AFd1xSDK.AFa1tSDK component3;
    private final ae0 component4;
    private final ae0 getCurrencyIso4217Code;
    private AFd1zSDK getMediationNetwork;
    private final ae0 getMonetizationNetwork;
    private final ae0 getRevenue;

    /* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lcom/appsflyer/internal/AFd1ySDK;", "getMediationNetwork", "()Lcom/appsflyer/internal/AFd1ySDK;"}, k = 3, mv = {1, ry0.BYTES_FIELD_NUMBER, InstallReferrerClient.InstallReferrerResponse.OK}, xi = 48)
    /* renamed from: com.appsflyer.internal.AFd1wSDK$1, reason: invalid class name */
    public static final class AnonymousClass1 extends pc0 implements Function0<AFd1ySDK> {
        public AnonymousClass1() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: getMediationNetwork, reason: merged with bridge method [inline-methods] */
        public final AFd1ySDK invoke() {
            AFc1fSDK registerClient = AFd1wSDK.getMonetizationNetwork(AFd1wSDK.this).registerClient();
            registerClient.getClass();
            return new AFd1ySDK(registerClient);
        }
    }

    /* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lcom/appsflyer/internal/AFf1kSDK;", "getRevenue", "()Lcom/appsflyer/internal/AFf1kSDK;"}, k = 3, mv = {1, ry0.BYTES_FIELD_NUMBER, InstallReferrerClient.InstallReferrerResponse.OK}, xi = 48)
    /* renamed from: com.appsflyer.internal.AFd1wSDK$10, reason: invalid class name */
    public static final class AnonymousClass10 extends pc0 implements Function0<AFf1kSDK> {
        public AnonymousClass10() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: getRevenue, reason: merged with bridge method [inline-methods] */
        public final AFf1kSDK invoke() {
            AFf1kSDK AFInAppEventParameterName = AFd1wSDK.getMonetizationNetwork(AFd1wSDK.this).AFInAppEventParameterName();
            AFInAppEventParameterName.getClass();
            return AFInAppEventParameterName;
        }
    }

    /* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lcom/appsflyer/internal/AFc1kSDK;", "AFAdRevenueData", "()Lcom/appsflyer/internal/AFc1kSDK;"}, k = 3, mv = {1, ry0.BYTES_FIELD_NUMBER, InstallReferrerClient.InstallReferrerResponse.OK}, xi = 48)
    /* renamed from: com.appsflyer.internal.AFd1wSDK$2, reason: invalid class name */
    public static final class AnonymousClass2 extends pc0 implements Function0<AFc1kSDK> {
        public AnonymousClass2() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: AFAdRevenueData, reason: merged with bridge method [inline-methods] */
        public final AFc1kSDK invoke() {
            AFc1kSDK AFAdRevenueData = AFd1wSDK.getMonetizationNetwork(AFd1wSDK.this).AFAdRevenueData();
            AFAdRevenueData.getClass();
            return AFAdRevenueData;
        }
    }

    /* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lcom/appsflyer/internal/AFf1mSDK;", "getRevenue", "()Lcom/appsflyer/internal/AFf1mSDK;"}, k = 3, mv = {1, ry0.BYTES_FIELD_NUMBER, InstallReferrerClient.InstallReferrerResponse.OK}, xi = 48)
    /* renamed from: com.appsflyer.internal.AFd1wSDK$3, reason: invalid class name */
    public static final class AnonymousClass3 extends pc0 implements Function0<AFf1mSDK> {
        public AnonymousClass3() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: getRevenue, reason: merged with bridge method [inline-methods] */
        public final AFf1mSDK invoke() {
            AFf1mSDK component3 = AFd1wSDK.getMonetizationNetwork(AFd1wSDK.this).component3();
            component3.getClass();
            return component3;
        }
    }

    /* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lcom/appsflyer/internal/AFc1jSDK;", "getMediationNetwork", "()Lcom/appsflyer/internal/AFc1jSDK;"}, k = 3, mv = {1, ry0.BYTES_FIELD_NUMBER, InstallReferrerClient.InstallReferrerResponse.OK}, xi = 48)
    /* renamed from: com.appsflyer.internal.AFd1wSDK$4, reason: invalid class name */
    public static final class AnonymousClass4 extends pc0 implements Function0<AFc1jSDK> {
        public AnonymousClass4() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: getMediationNetwork, reason: merged with bridge method [inline-methods] */
        public final AFc1jSDK invoke() {
            AFc1jSDK mediationNetwork = AFd1wSDK.getMonetizationNetwork(AFd1wSDK.this).getMediationNetwork();
            mediationNetwork.getClass();
            return mediationNetwork;
        }
    }

    /* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ljava/util/concurrent/ExecutorService;", "AFAdRevenueData", "()Ljava/util/concurrent/ExecutorService;"}, k = 3, mv = {1, ry0.BYTES_FIELD_NUMBER, InstallReferrerClient.InstallReferrerResponse.OK}, xi = 48)
    /* renamed from: com.appsflyer.internal.AFd1wSDK$5, reason: invalid class name */
    public static final class AnonymousClass5 extends pc0 implements Function0<ExecutorService> {
        public AnonymousClass5() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: AFAdRevenueData, reason: merged with bridge method [inline-methods] */
        public final ExecutorService invoke() {
            ExecutorService currencyIso4217Code = AFd1wSDK.getMonetizationNetwork(AFd1wSDK.this).getCurrencyIso4217Code();
            currencyIso4217Code.getClass();
            return currencyIso4217Code;
        }
    }

    /* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lcom/appsflyer/internal/AFd1uSDK;", "getRevenue", "()Lcom/appsflyer/internal/AFd1uSDK;"}, k = 3, mv = {1, ry0.BYTES_FIELD_NUMBER, InstallReferrerClient.InstallReferrerResponse.OK}, xi = 48)
    /* renamed from: com.appsflyer.internal.AFd1wSDK$7, reason: invalid class name */
    public static final class AnonymousClass7 extends pc0 implements Function0<AFd1uSDK> {
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
        aFd1zSDK.getClass();
        this.getMediationNetwork = aFd1zSDK;
        this.getRevenue = ee0.b(new AnonymousClass3());
        this.AFAdRevenueData = ee0.b(new AnonymousClass2());
        this.getCurrencyIso4217Code = ee0.b(new AnonymousClass4());
        this.getMonetizationNetwork = ee0.b(new AnonymousClass10());
        this.component4 = ee0.b(new AnonymousClass5());
        this.component1 = "6.18.0";
        this.component2 = ee0.b(new AnonymousClass1());
        this.areAllFieldsValid = ee0.b(new AnonymousClass7());
    }

    private final Map<String, String> AFAdRevenueData(AFh1bSDK aFh1bSDK) {
        Object[] objArr = new Object[1];
        a((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 144, View.MeasureSpec.getMode(0) + 1, false, 5 - TextUtils.indexOf("", "", 0, 0), "�\ufffb\u000b\ufffa\u0007", objArr);
        Map<String, String> c = ik0.c(new Pair(((String) objArr[0]).intern(), Build.BRAND), new Pair("model", Build.MODEL), new Pair("app_id", getMediationNetwork().getRevenue.getCurrencyIso4217Code.getPackageName()), new Pair("p_ex", new AFa1vSDK().getRevenue()), new Pair("api", String.valueOf(Build.VERSION.SDK_INT)), new Pair("sdk", this.component1), new Pair("uid", AFb1iSDK.getCurrencyIso4217Code(getMediationNetwork().getCurrencyIso4217Code)), new Pair("exc_config", aFh1bSDK.getMonetizationNetwork()));
        copy = (copydefault + 99) % 128;
        return c;
    }

    private static void a(int i, int i2, boolean z, int i3, String str, Object[] objArr) {
        $11 = ($10 + 29) % 128;
        char[] cArr = str;
        if (str != null) {
            cArr = str.toCharArray();
        }
        char[] cArr2 = cArr;
        AFk1jSDK aFk1jSDK = new AFk1jSDK();
        char[] cArr3 = new char[i3];
        aFk1jSDK.getMonetizationNetwork = 0;
        while (true) {
            int i4 = aFk1jSDK.getMonetizationNetwork;
            if (i4 >= i3) {
                break;
            }
            $11 = ($10 + 97) % 128;
            char c = cArr2[i4];
            aFk1jSDK.getMediationNetwork = c;
            char c2 = (char) (c + i);
            cArr3[i4] = c2;
            cArr3[i4] = (char) (c2 - ((int) (equals ^ 4333921468659523104L)));
            aFk1jSDK.getMonetizationNetwork = i4 + 1;
        }
        if (i2 > 0) {
            $11 = ($10 + 121) % 128;
            aFk1jSDK.AFAdRevenueData = i2;
            char[] cArr4 = new char[i3];
            System.arraycopy(cArr3, 0, cArr4, 0, i3);
            int i5 = aFk1jSDK.AFAdRevenueData;
            System.arraycopy(cArr4, 0, cArr3, i3 - i5, i5);
            int i6 = aFk1jSDK.AFAdRevenueData;
            System.arraycopy(cArr4, i6, cArr3, 0, i3 - i6);
        }
        if (z) {
            char[] cArr5 = new char[i3];
            aFk1jSDK.getMonetizationNetwork = 0;
            while (true) {
                int i7 = aFk1jSDK.getMonetizationNetwork;
                if (i7 >= i3) {
                    break;
                }
                cArr5[i7] = cArr3[(i3 - i7) - 1];
                aFk1jSDK.getMonetizationNetwork = i7 + 1;
            }
            cArr3 = cArr5;
        }
        objArr[0] = new String(cArr3);
    }

    private final AFc1jSDK areAllFieldsValid() {
        copydefault = (copy + 45) % 128;
        AFc1jSDK aFc1jSDK = (AFc1jSDK) this.getCurrencyIso4217Code.getValue();
        int i = copydefault + 81;
        copy = i % 128;
        if (i % 2 != 0) {
            return aFc1jSDK;
        }
        throw null;
    }

    private final AFf1kSDK component1() {
        copydefault = (copy + 11) % 128;
        AFf1kSDK aFf1kSDK = (AFf1kSDK) this.getMonetizationNetwork.getValue();
        int i = copydefault + 103;
        copy = i % 128;
        if (i % 2 != 0) {
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
        int i = copy + 119;
        copydefault = i % 128;
        int i2 = i % 2;
        AFd1vSDK aFd1vSDK = (AFd1vSDK) this.areAllFieldsValid.getValue();
        if (i2 != 0) {
            int i3 = 28 / 0;
        }
        int i4 = copy + 73;
        copydefault = i4 % 128;
        if (i4 % 2 == 0) {
            return aFd1vSDK;
        }
        throw null;
    }

    private final synchronized void copy() {
        boolean z;
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
                z = getMonetizationNetwork(aFh1bSDK);
            } else {
                z = false;
            }
            AFd1xSDK.AFa1tSDK aFa1tSDK = this.component3;
            if (aFa1tSDK != null) {
                aFa1tSDK.onConfigurationChanged(z);
                copydefault = (copy + 35) % 128;
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:77:0x012c, code lost:
    
        if (r0.intValue() == (-1)) goto L75;
     */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0130 A[Catch: all -> 0x001a, TryCatch #1 {all -> 0x001a, blocks: (B:3:0x0001, B:5:0x0017, B:6:0x0027, B:8:0x0032, B:12:0x0050, B:14:0x0061, B:16:0x0068, B:18:0x007a, B:22:0x008a, B:24:0x0097, B:26:0x009f, B:28:0x00a3, B:30:0x00a9, B:31:0x00af, B:33:0x00bb, B:35:0x00bf, B:37:0x00c5, B:38:0x00cb, B:40:0x00d7, B:42:0x00db, B:44:0x00e1, B:45:0x00e7, B:46:0x00ea, B:47:0x00f3, B:49:0x0103, B:51:0x0107, B:52:0x010d, B:54:0x011d, B:56:0x0121, B:60:0x0130, B:61:0x019b, B:63:0x019f, B:65:0x01af, B:66:0x01b3, B:72:0x0140, B:74:0x015a, B:75:0x0172, B:76:0x0128, B:87:0x00f1, B:89:0x0183, B:90:0x018b, B:91:0x001d, B:84:0x00ef), top: B:2:0x0001, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x019f A[Catch: all -> 0x001a, TryCatch #1 {all -> 0x001a, blocks: (B:3:0x0001, B:5:0x0017, B:6:0x0027, B:8:0x0032, B:12:0x0050, B:14:0x0061, B:16:0x0068, B:18:0x007a, B:22:0x008a, B:24:0x0097, B:26:0x009f, B:28:0x00a3, B:30:0x00a9, B:31:0x00af, B:33:0x00bb, B:35:0x00bf, B:37:0x00c5, B:38:0x00cb, B:40:0x00d7, B:42:0x00db, B:44:0x00e1, B:45:0x00e7, B:46:0x00ea, B:47:0x00f3, B:49:0x0103, B:51:0x0107, B:52:0x010d, B:54:0x011d, B:56:0x0121, B:60:0x0130, B:61:0x019b, B:63:0x019f, B:65:0x01af, B:66:0x01b3, B:72:0x0140, B:74:0x015a, B:75:0x0172, B:76:0x0128, B:87:0x00f1, B:89:0x0183, B:90:0x018b, B:91:0x001d, B:84:0x00ef), top: B:2:0x0001, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x01b8 A[DONT_GENERATE] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0140 A[Catch: all -> 0x001a, TryCatch #1 {all -> 0x001a, blocks: (B:3:0x0001, B:5:0x0017, B:6:0x0027, B:8:0x0032, B:12:0x0050, B:14:0x0061, B:16:0x0068, B:18:0x007a, B:22:0x008a, B:24:0x0097, B:26:0x009f, B:28:0x00a3, B:30:0x00a9, B:31:0x00af, B:33:0x00bb, B:35:0x00bf, B:37:0x00c5, B:38:0x00cb, B:40:0x00d7, B:42:0x00db, B:44:0x00e1, B:45:0x00e7, B:46:0x00ea, B:47:0x00f3, B:49:0x0103, B:51:0x0107, B:52:0x010d, B:54:0x011d, B:56:0x0121, B:60:0x0130, B:61:0x019b, B:63:0x019f, B:65:0x01af, B:66:0x01b3, B:72:0x0140, B:74:0x015a, B:75:0x0172, B:76:0x0128, B:87:0x00f1, B:89:0x0183, B:90:0x018b, B:91:0x001d, B:84:0x00ef), top: B:2:0x0001, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0128 A[Catch: all -> 0x001a, TryCatch #1 {all -> 0x001a, blocks: (B:3:0x0001, B:5:0x0017, B:6:0x0027, B:8:0x0032, B:12:0x0050, B:14:0x0061, B:16:0x0068, B:18:0x007a, B:22:0x008a, B:24:0x0097, B:26:0x009f, B:28:0x00a3, B:30:0x00a9, B:31:0x00af, B:33:0x00bb, B:35:0x00bf, B:37:0x00c5, B:38:0x00cb, B:40:0x00d7, B:42:0x00db, B:44:0x00e1, B:45:0x00e7, B:46:0x00ea, B:47:0x00f3, B:49:0x0103, B:51:0x0107, B:52:0x010d, B:54:0x011d, B:56:0x0121, B:60:0x0130, B:61:0x019b, B:63:0x019f, B:65:0x01af, B:66:0x01b3, B:72:0x0140, B:74:0x015a, B:75:0x0172, B:76:0x0128, B:87:0x00f1, B:89:0x0183, B:90:0x018b, B:91:0x001d, B:84:0x00ef), top: B:2:0x0001, inners: #0 }] */
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
        int i;
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
            if (j < System.currentTimeMillis() / 1000) {
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
                        int i2 = copy + 65;
                        copydefault = i2 % 128;
                        int i3 = i2 % 2;
                        String str6 = aFh1bSDK4.getMonetizationNetwork;
                        if (i3 != 0) {
                            throw null;
                        }
                        if (str6 != null) {
                            kk0 b = new Regex("(\\d+).(\\d+).(\\d+).*").b(str6);
                            if (b != null) {
                                MatchGroup b2 = b.c.b(1);
                                int intValue = ((b2 == null || (str5 = b2.a) == null || (intOrNull3 = StringsKt.toIntOrNull(str5)) == null) ? 0 : intOrNull3.intValue()) * 1000000;
                                MatchGroup b3 = b.c.b(2);
                                int intValue2 = (((b3 == null || (str4 = b3.a) == null || (intOrNull2 = StringsKt.toIntOrNull(str4)) == null) ? 0 : intOrNull2.intValue()) * 1000) + intValue;
                                MatchGroup b4 = b.c.b(3);
                                i = intValue2 + ((b4 == null || (str3 = b4.a) == null || (intOrNull = StringsKt.toIntOrNull(str3)) == null) ? 0 : intOrNull.intValue());
                            } else {
                                i = -1;
                            }
                            num = Integer.valueOf(i);
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
                                AFAdRevenueData().AFAdRevenueData(((Number) mediationNetwork.d).intValue(), ((Number) mediationNetwork.e).intValue());
                            } else if (pair != null) {
                                AFAdRevenueData().AFAdRevenueData(((Number) pair.d).intValue(), ((Number) pair.e).intValue());
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
                jSONObject.getClass();
                getCurrencyIso4217Code(jSONObject, monetizationNetwork);
                int i = copy + 33;
                copydefault = i % 128;
                if (i % 2 != 0) {
                    int i2 = 40 / 0;
                }
            }
        }
    }

    public static /* synthetic */ Object getCurrencyIso4217Code(Object[] objArr, int i, int i2, int i3) {
        int i4 = ~((~i) | i2);
        int i5 = (((~(i | i3)) | (~((~i2) | i)) | i4) * 70) + ((~(i | i2 | i3)) * 70) + (((~(i2 | i3)) | i4) * (-140)) + (i2 * (-69)) + (i * 71);
        if (i5 == 1) {
            return AFAdRevenueData(objArr);
        }
        if (i5 != 2) {
            return i5 != 3 ? i5 != 4 ? getCurrencyIso4217Code(objArr) : getRevenue(objArr) : getMonetizationNetwork(objArr);
        }
        AFd1wSDK aFd1wSDK = (AFd1wSDK) objArr[0];
        AFh1bSDK aFh1bSDK = (AFh1bSDK) objArr[1];
        long currentTimeMillis = System.currentTimeMillis();
        long mediationNetwork = aFd1wSDK.areAllFieldsValid().getMediationNetwork("af_send_exc_to_server_window", -1L);
        if (aFh1bSDK.getMediationNetwork < currentTimeMillis / 1000) {
            int i6 = copydefault + 117;
            copy = i6 % 128;
            return Boolean.valueOf(i6 % 2 == 0);
        }
        if (mediationNetwork != -1) {
            copy = (copydefault + 95) % 128;
            if (mediationNetwork >= currentTimeMillis) {
                return Boolean.valueOf(aFd1wSDK.getRevenue(aFh1bSDK));
            }
        }
        return Boolean.FALSE;
    }

    private final boolean getMediationNetwork(AFh1bSDK aFh1bSDK) {
        int currencyIso4217Code;
        int i = copydefault + 109;
        copy = i % 128;
        if (i % 2 == 0) {
            System.currentTimeMillis();
            areAllFieldsValid().getMediationNetwork("af_send_exc_to_server_window", -1L);
            long j = aFh1bSDK.getMediationNetwork;
            throw null;
        }
        long currentTimeMillis = System.currentTimeMillis();
        long mediationNetwork = areAllFieldsValid().getMediationNetwork("af_send_exc_to_server_window", -1L);
        if (aFh1bSDK.getMediationNetwork < currentTimeMillis / 1000) {
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

    @Override // com.appsflyer.internal.AFd1xSDK
    public final void getMonetizationNetwork(AFd1xSDK.AFa1tSDK aFa1tSDK) {
        int i = copy + 57;
        copydefault = i % 128;
        if (i % 2 != 0) {
            this.component3 = aFa1tSDK;
            ((ExecutorService) getCurrencyIso4217Code(new Object[]{this}, -1790300569, 1790300573, System.identityHashCode(this))).execute(new k(this, 1));
            throw null;
        }
        this.component3 = aFa1tSDK;
        ((ExecutorService) getCurrencyIso4217Code(new Object[]{this}, -1790300569, 1790300573, System.identityHashCode(this))).execute(new k(this, 1));
        int i2 = copy + 121;
        copydefault = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 69 / 0;
        }
    }

    @Override // com.appsflyer.internal.AFd1xSDK
    public final void getRevenue() {
        copy = (copydefault + 47) % 128;
        ((ExecutorService) getCurrencyIso4217Code(new Object[]{this}, -1790300569, 1790300573, System.identityHashCode(this))).execute(new k(this, 0));
        copy = (copydefault + 51) % 128;
    }

    private static /* synthetic */ Object getRevenue(Object[] objArr) {
        AFd1wSDK aFd1wSDK = (AFd1wSDK) objArr[0];
        int i = copy + 57;
        copydefault = i % 128;
        int i2 = i % 2;
        ExecutorService executorService = (ExecutorService) aFd1wSDK.component4.getValue();
        if (i2 != 0) {
            int i3 = 65 / 0;
        }
        return executorService;
    }

    private final boolean getRevenue(AFh1bSDK aFh1bSDK) {
        new AFd1rSDK();
        String str = this.component1;
        String str2 = aFh1bSDK.getMonetizationNetwork;
        str2.getClass();
        boolean revenue = AFd1rSDK.getRevenue(str, str2);
        copy = (copydefault + 107) % 128;
        return revenue;
    }

    private final AFf1mSDK getMonetizationNetwork() {
        copy = (copydefault + 45) % 128;
        AFf1mSDK aFf1mSDK = (AFf1mSDK) this.getRevenue.getValue();
        copy = (copydefault + 77) % 128;
        return aFf1mSDK;
    }

    public static final /* synthetic */ AFd1zSDK getMonetizationNetwork(AFd1wSDK aFd1wSDK) {
        int i = copy;
        copydefault = (i + 113) % 128;
        AFd1zSDK aFd1zSDK = aFd1wSDK.getMediationNetwork;
        int i2 = i + 33;
        copydefault = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 90 / 0;
        }
        return aFd1zSDK;
    }

    private static Object getMonetizationNetwork(Object[] objArr) {
        Map map = (Map) objArr[0];
        List list = (List) objArr[1];
        copydefault = (copy + 71) % 128;
        Map c = ik0.c(new Pair("deviceInfo", map), new Pair("excs", AFd1sSDK.getMediationNetwork((List<AFc1bSDK>) list)));
        int i = copy + 121;
        copydefault = i % 128;
        if (i % 2 == 0) {
            return c;
        }
        throw null;
    }

    private final boolean getMonetizationNetwork(AFh1bSDK aFh1bSDK) {
        return ((Boolean) getCurrencyIso4217Code(new Object[]{this, aFh1bSDK}, 1535825086, -1535825084, System.identityHashCode(this))).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void getMediationNetwork(AFd1wSDK aFd1wSDK) {
        copy = (copydefault + 111) % 128;
        aFd1wSDK.getClass();
        aFd1wSDK.equals();
        int i = copy + 117;
        copydefault = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    private final AFc1kSDK getMediationNetwork() {
        copydefault = (copy + 31) % 128;
        AFc1kSDK aFc1kSDK = (AFc1kSDK) this.AFAdRevenueData.getValue();
        int i = copydefault + 53;
        copy = i % 128;
        if (i % 2 == 0) {
            int i2 = 91 / 0;
        }
        return aFc1kSDK;
    }

    @Override // com.appsflyer.internal.AFd1xSDK
    public final void getMediationNetwork(Throwable th, String str) {
        getCurrencyIso4217Code(new Object[]{this, th, str}, 1429511836, -1429511836, System.identityHashCode(this));
    }

    private static /* synthetic */ Object getCurrencyIso4217Code(Object[] objArr) {
        AFd1wSDK aFd1wSDK = (AFd1wSDK) objArr[0];
        Throwable th = (Throwable) objArr[1];
        String str = (String) objArr[2];
        copy = (copydefault + 119) % 128;
        th.getClass();
        str.getClass();
        ((ExecutorService) getCurrencyIso4217Code(new Object[]{aFd1wSDK}, -1790300569, 1790300573, System.identityHashCode(aFd1wSDK))).execute(new lq(aFd1wSDK, th, str, 4));
        int i = copydefault + 49;
        copy = i % 128;
        if (i % 2 == 0) {
            int i2 = 23 / 0;
        }
        return null;
    }

    @Override // com.appsflyer.internal.AFd1xSDK
    public final void getCurrencyIso4217Code() {
        copydefault = (copy + 123) % 128;
        ((ExecutorService) getCurrencyIso4217Code(new Object[]{this}, -1790300569, 1790300573, System.identityHashCode(this))).execute(new k(this, 2));
        copy = (copydefault + 105) % 128;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void getCurrencyIso4217Code(AFd1wSDK aFd1wSDK) {
        copy = (copydefault + 25) % 128;
        aFd1wSDK.getClass();
        aFd1wSDK.copy();
        copydefault = (copy + 59) % 128;
    }

    private final void getCurrencyIso4217Code(AFh1bSDK aFh1bSDK) {
        int i;
        AFc1jSDK areAllFieldsValid;
        int i2 = copydefault + 13;
        copy = i2 % 128;
        int i3 = i2 % 2;
        TimeUnit timeUnit = TimeUnit.DAYS;
        if (i3 == 0) {
            i = aFh1bSDK.getCurrencyIso4217Code;
            long currentTimeMillis = System.currentTimeMillis() | timeUnit.toMillis(aFh1bSDK.AFAdRevenueData);
            areAllFieldsValid = areAllFieldsValid();
            areAllFieldsValid.getRevenue("af_send_exc_to_server_window", currentTimeMillis);
        } else {
            i = aFh1bSDK.getCurrencyIso4217Code;
            long millis = timeUnit.toMillis(aFh1bSDK.AFAdRevenueData) + System.currentTimeMillis();
            areAllFieldsValid = areAllFieldsValid();
            areAllFieldsValid.getRevenue("af_send_exc_to_server_window", millis);
        }
        areAllFieldsValid.AFAdRevenueData("af_send_exc_min", i);
        int i4 = copy + 117;
        copydefault = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 3 / 0;
        }
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
        int i = copy + 69;
        copydefault = i % 128;
        int i2 = i % 2;
        AFf1mSDK monetizationNetwork = aFd1wSDK.getMonetizationNetwork();
        if (i2 != 0) {
            aFh1cSDK = monetizationNetwork.getCurrencyIso4217Code.AFAdRevenueData;
            int i3 = 52 / 0;
        } else {
            aFh1cSDK = monetizationNetwork.getCurrencyIso4217Code.AFAdRevenueData;
        }
        int i4 = copydefault + 99;
        copy = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 96 / 0;
        }
        return null;
    }

    public final AFc1aSDK AFAdRevenueData() {
        int i = copy + 43;
        copydefault = i % 128;
        int i2 = i % 2;
        AFc1aSDK aFc1aSDK = (AFc1aSDK) this.component2.getValue();
        if (i2 != 0) {
            throw null;
        }
        copy = (copydefault + 89) % 128;
        return aFc1aSDK;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void AFAdRevenueData(AFd1wSDK aFd1wSDK) {
        copy = (copydefault + 85) % 128;
        aFd1wSDK.getClass();
        aFd1wSDK.copydefault();
        copy = (copydefault + 105) % 128;
    }

    private final void getCurrencyIso4217Code(String str, String str2) {
        copydefault = (copy + 97) % 128;
        byte[] bytes = str.getBytes(Charsets.UTF_8);
        bytes.getClass();
        component4().getMediationNetwork(bytes, hk0.b(new Pair("Authorization", AFj1jSDK.getCurrencyIso4217Code(str, str2))), 2000);
        int i = copydefault + 115;
        copy = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void AFAdRevenueData(AFd1wSDK aFd1wSDK, Throwable th, String str) {
        aFd1wSDK.getClass();
        th.getClass();
        str.getClass();
        AFh1bSDK aFh1bSDK = (AFh1bSDK) getCurrencyIso4217Code(new Object[]{aFd1wSDK}, 1447743159, -1447743158, System.identityHashCode(aFd1wSDK));
        if (aFh1bSDK != null) {
            copy = (copydefault + 35) % 128;
            if (aFd1wSDK.getMonetizationNetwork(aFh1bSDK)) {
                aFd1wSDK.AFAdRevenueData().getCurrencyIso4217Code(th, str);
            }
        }
        copydefault = (copy + 7) % 128;
    }

    private static Map<String, Object> getCurrencyIso4217Code(Map<String, ? extends Object> map, List<AFc1bSDK> list) {
        return (Map) getCurrencyIso4217Code(new Object[]{map, list}, -1431128038, 1431128041, (int) System.currentTimeMillis());
    }
}
