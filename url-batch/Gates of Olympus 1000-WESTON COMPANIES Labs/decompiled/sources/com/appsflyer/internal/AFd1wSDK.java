package com.appsflyer.internal;

import android.graphics.PointF;
import android.os.Build;
import androidx.appcompat.app.AppCompatDelegate;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.appsflyer.AFLogger;
import com.appsflyer.internal.AFd1xSDK;
import com.google.common.net.HttpHeaders;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlin.text.MatchGroup;
import kotlin.text.MatchResult;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import kotlin.time.DurationKt;

/* loaded from: classes.dex */
public final class AFd1wSDK implements AFd1xSDK {
    private static int $10 = 0;
    private static int $11 = 1;
    private static int AFKeystoreWrapper = 1;
    private static char copy = 10357;
    private static int copydefault = 0;
    private static char equals = 787;
    private static char hashCode = 7956;
    private static char toString = 48673;
    private AFd1zSDK AFAdRevenueData;
    private final Lazy areAllFieldsValid;
    private AFd1xSDK.AFa1vSDK component1;
    private final Lazy component2;
    private final Lazy component3;
    private final String component4;
    private final Lazy getCurrencyIso4217Code;
    private final Lazy getMediationNetwork;
    private final Lazy getMonetizationNetwork;
    private final Lazy getRevenue;

    public static /* synthetic */ Object getMediationNetwork(Object[] objArr, int i, int i2, int i3) {
        int i4 = ~((~i) | (~i2));
        int i5 = ~i3;
        int i6 = (i * 221) + (i2 * (-219)) + ((i4 | (~(i5 | i | i2))) * 220) + (((~(i5 | i2)) | i) * (-440)) + ((i | i2 | i3) * 220);
        return i6 != 1 ? i6 != 2 ? i6 != 3 ? i6 != 4 ? getMonetizationNetwork(objArr) : AFAdRevenueData(objArr) : getMediationNetwork(objArr) : getRevenue(objArr) : getCurrencyIso4217Code(objArr);
    }

    public AFd1wSDK(AFd1zSDK aFd1zSDK) {
        Intrinsics.checkNotNullParameter(aFd1zSDK, "");
        this.AFAdRevenueData = aFd1zSDK;
        this.getRevenue = LazyKt.lazy(new Function0<AFf1kSDK>() { // from class: com.appsflyer.internal.AFd1wSDK.4
            @Override // kotlin.jvm.functions.Function0
            /* renamed from: getRevenue, reason: merged with bridge method [inline-methods] */
            public final AFf1kSDK invoke() {
                AFf1kSDK component1 = AFd1wSDK.getCurrencyIso4217Code(AFd1wSDK.this).component1();
                Intrinsics.checkNotNullExpressionValue(component1, "");
                return component1;
            }

            {
                super(0);
            }
        });
        this.getMediationNetwork = LazyKt.lazy(new Function0<AFc1oSDK>() { // from class: com.appsflyer.internal.AFd1wSDK.3
            @Override // kotlin.jvm.functions.Function0
            /* renamed from: getCurrencyIso4217Code, reason: merged with bridge method [inline-methods] */
            public final AFc1oSDK invoke() {
                AFc1oSDK AFAdRevenueData = AFd1wSDK.getCurrencyIso4217Code(AFd1wSDK.this).AFAdRevenueData();
                Intrinsics.checkNotNullExpressionValue(AFAdRevenueData, "");
                return AFAdRevenueData;
            }

            {
                super(0);
            }
        });
        this.getMonetizationNetwork = LazyKt.lazy(new Function0<AFc1qSDK>() { // from class: com.appsflyer.internal.AFd1wSDK.2
            @Override // kotlin.jvm.functions.Function0
            /* renamed from: getCurrencyIso4217Code, reason: merged with bridge method [inline-methods] */
            public final AFc1qSDK invoke() {
                AFc1qSDK component4 = AFd1wSDK.getCurrencyIso4217Code(AFd1wSDK.this).component4();
                Intrinsics.checkNotNullExpressionValue(component4, "");
                return component4;
            }

            {
                super(0);
            }
        });
        this.getCurrencyIso4217Code = LazyKt.lazy(new Function0<AFf1eSDK>() { // from class: com.appsflyer.internal.AFd1wSDK.6
            @Override // kotlin.jvm.functions.Function0
            /* renamed from: getRevenue, reason: merged with bridge method [inline-methods] */
            public final AFf1eSDK invoke() {
                AFf1eSDK AFInAppEventType = AFd1wSDK.getCurrencyIso4217Code(AFd1wSDK.this).AFInAppEventType();
                Intrinsics.checkNotNullExpressionValue(AFInAppEventType, "");
                return AFInAppEventType;
            }

            {
                super(0);
            }
        });
        this.component2 = LazyKt.lazy(new Function0<ExecutorService>() { // from class: com.appsflyer.internal.AFd1wSDK.5
            @Override // kotlin.jvm.functions.Function0
            /* renamed from: getMediationNetwork, reason: merged with bridge method [inline-methods] */
            public final ExecutorService invoke() {
                ExecutorService monetizationNetwork = AFd1wSDK.getCurrencyIso4217Code(AFd1wSDK.this).getMonetizationNetwork();
                Intrinsics.checkNotNullExpressionValue(monetizationNetwork, "");
                return monetizationNetwork;
            }

            {
                super(0);
            }
        });
        this.component4 = "6.17.6";
        this.component3 = LazyKt.lazy(new Function0<AFd1ySDK>() { // from class: com.appsflyer.internal.AFd1wSDK.1
            @Override // kotlin.jvm.functions.Function0
            /* renamed from: AFAdRevenueData, reason: merged with bridge method [inline-methods] */
            public final AFd1ySDK invoke() {
                AFc1hSDK AFInAppEventParameterName = AFd1wSDK.getCurrencyIso4217Code(AFd1wSDK.this).AFInAppEventParameterName();
                Intrinsics.checkNotNullExpressionValue(AFInAppEventParameterName, "");
                return new AFd1ySDK(AFInAppEventParameterName);
            }

            {
                super(0);
            }
        });
        this.areAllFieldsValid = LazyKt.lazy(new Function0<AFd1vSDK>() { // from class: com.appsflyer.internal.AFd1wSDK.7
            @Override // kotlin.jvm.functions.Function0
            /* renamed from: getMediationNetwork, reason: merged with bridge method [inline-methods] */
            public final AFd1vSDK invoke() {
                return new AFd1vSDK(AFd1wSDK.this.getRevenue());
            }

            {
                super(0);
            }
        });
    }

    public static final /* synthetic */ AFd1zSDK getCurrencyIso4217Code(AFd1wSDK aFd1wSDK) {
        int i = 2 % 2;
        int i2 = copydefault + TypedValues.TYPE_TARGET;
        AFKeystoreWrapper = i2 % 128;
        int i3 = i2 % 2;
        AFd1zSDK aFd1zSDK = aFd1wSDK.AFAdRevenueData;
        if (i3 != 0) {
            return aFd1zSDK;
        }
        throw null;
    }

    private final AFf1kSDK getCurrencyIso4217Code() {
        int i = 2 % 2;
        int i2 = AFKeystoreWrapper + 1;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        AFf1kSDK aFf1kSDK = (AFf1kSDK) this.getRevenue.getValue();
        int i4 = AFKeystoreWrapper + 1;
        copydefault = i4 % 128;
        if (i4 % 2 == 0) {
            return aFf1kSDK;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private final AFc1oSDK getMediationNetwork() {
        int i = 2 % 2;
        int i2 = AFKeystoreWrapper + 9;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        AFc1oSDK aFc1oSDK = (AFc1oSDK) this.getMediationNetwork.getValue();
        int i4 = AFKeystoreWrapper + 21;
        copydefault = i4 % 128;
        int i5 = i4 % 2;
        return aFc1oSDK;
    }

    private static /* synthetic */ Object getRevenue(Object[] objArr) {
        AFd1wSDK aFd1wSDK = (AFd1wSDK) objArr[0];
        int i = 2 % 2;
        int i2 = copydefault + 25;
        AFKeystoreWrapper = i2 % 128;
        int i3 = i2 % 2;
        AFc1qSDK aFc1qSDK = (AFc1qSDK) aFd1wSDK.getMonetizationNetwork.getValue();
        if (i3 == 0) {
            int i4 = 60 / 0;
        }
        int i5 = copydefault + 51;
        AFKeystoreWrapper = i5 % 128;
        int i6 = i5 % 2;
        return aFc1qSDK;
    }

    private final AFf1eSDK component1() {
        int i = 2 % 2;
        int i2 = copydefault + AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR_OVERLAY;
        AFKeystoreWrapper = i2 % 128;
        int i3 = i2 % 2;
        AFf1eSDK aFf1eSDK = (AFf1eSDK) this.getCurrencyIso4217Code.getValue();
        int i4 = AFKeystoreWrapper + 117;
        copydefault = i4 % 128;
        int i5 = i4 % 2;
        return aFf1eSDK;
    }

    private final ExecutorService areAllFieldsValid() {
        int i = 2 % 2;
        int i2 = AFKeystoreWrapper + 53;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        ExecutorService executorService = (ExecutorService) this.component2.getValue();
        int i4 = copydefault + 119;
        AFKeystoreWrapper = i4 % 128;
        int i5 = i4 % 2;
        return executorService;
    }

    private static /* synthetic */ Object AFAdRevenueData(Object[] objArr) {
        AFi1zSDK aFi1zSDK;
        AFd1wSDK aFd1wSDK = (AFd1wSDK) objArr[0];
        int i = 2 % 2;
        int i2 = copydefault + 77;
        AFKeystoreWrapper = i2 % 128;
        int i3 = i2 % 2;
        AFi1vSDK aFi1vSDK = aFd1wSDK.getCurrencyIso4217Code().AFAdRevenueData.getCurrencyIso4217Code;
        Object obj = null;
        if (aFi1vSDK == null || (aFi1zSDK = aFi1vSDK.getMonetizationNetwork) == null) {
            return null;
        }
        int i4 = AFKeystoreWrapper + AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR_OVERLAY;
        copydefault = i4 % 128;
        if (i4 % 2 != 0) {
            AFh1aSDK aFh1aSDK = aFi1zSDK.getCurrencyIso4217Code;
            obj.hashCode();
            throw null;
        }
        return aFi1zSDK.getCurrencyIso4217Code;
    }

    public final AFc1cSDK getRevenue() {
        int i = 2 % 2;
        int i2 = AFKeystoreWrapper + 93;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        AFc1cSDK aFc1cSDK = (AFc1cSDK) this.component3.getValue();
        int i4 = copydefault + 121;
        AFKeystoreWrapper = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 3 / 0;
        }
        return aFc1cSDK;
    }

    private AFd1uSDK component3() {
        int i = 2 % 2;
        int i2 = AFKeystoreWrapper + 75;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        AFd1uSDK aFd1uSDK = (AFd1uSDK) this.areAllFieldsValid.getValue();
        int i4 = copydefault + 77;
        AFKeystoreWrapper = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 15 / 0;
        }
        return aFd1uSDK;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void getCurrencyIso4217Code(AFd1wSDK aFd1wSDK, Throwable th, String str) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(aFd1wSDK, "");
        Intrinsics.checkNotNullParameter(th, "");
        Intrinsics.checkNotNullParameter(str, "");
        AFh1aSDK aFh1aSDK = (AFh1aSDK) getMediationNetwork(new Object[]{aFd1wSDK}, -2108652204, 2108652208, System.identityHashCode(aFd1wSDK));
        if (aFh1aSDK != null) {
            int i2 = copydefault + 99;
            AFKeystoreWrapper = i2 % 128;
            if (i2 % 2 != 0 ? !aFd1wSDK.AFAdRevenueData(aFh1aSDK) : aFd1wSDK.AFAdRevenueData(aFh1aSDK)) {
                int i3 = copydefault + 49;
                AFKeystoreWrapper = i3 % 128;
                int i4 = i3 % 2;
            } else {
                int i5 = copydefault + 91;
                AFKeystoreWrapper = i5 % 128;
                int i6 = i5 % 2;
                aFd1wSDK.getRevenue().AFAdRevenueData(th, str);
            }
        }
    }

    private static /* synthetic */ Object getMediationNetwork(Object[] objArr) {
        final AFd1wSDK aFd1wSDK = (AFd1wSDK) objArr[0];
        final Throwable th = (Throwable) objArr[1];
        final String str = (String) objArr[2];
        int i = 2 % 2;
        int i2 = copydefault + 49;
        AFKeystoreWrapper = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(th, "");
        Intrinsics.checkNotNullParameter(str, "");
        aFd1wSDK.areAllFieldsValid().execute(new Runnable() { // from class: com.appsflyer.internal.AFd1wSDK$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                AFd1wSDK.getCurrencyIso4217Code(AFd1wSDK.this, th, str);
            }
        });
        int i4 = copydefault + 41;
        AFKeystoreWrapper = i4 % 128;
        Object obj = null;
        if (i4 % 2 != 0) {
            return null;
        }
        obj.hashCode();
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void getMonetizationNetwork(AFd1wSDK aFd1wSDK) {
        int i = 2 % 2;
        int i2 = copydefault + 13;
        AFKeystoreWrapper = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(aFd1wSDK, "");
            aFd1wSDK.copydefault();
        } else {
            Intrinsics.checkNotNullParameter(aFd1wSDK, "");
            aFd1wSDK.copydefault();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    @Override // com.appsflyer.internal.AFd1xSDK
    public final void getMonetizationNetwork(AFd1xSDK.AFa1vSDK aFa1vSDK) {
        int i = 2 % 2;
        int i2 = AFKeystoreWrapper + 31;
        copydefault = i2 % 128;
        if (i2 % 2 == 0) {
            this.component1 = aFa1vSDK;
            areAllFieldsValid().execute(new Runnable() { // from class: com.appsflyer.internal.AFd1wSDK$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    AFd1wSDK.getMonetizationNetwork(AFd1wSDK.this);
                }
            });
        } else {
            this.component1 = aFa1vSDK;
            areAllFieldsValid().execute(new Runnable() { // from class: com.appsflyer.internal.AFd1wSDK$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    AFd1wSDK.getMonetizationNetwork(AFd1wSDK.this);
                }
            });
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void getMediationNetwork(AFd1wSDK aFd1wSDK) {
        int i = 2 % 2;
        int i2 = copydefault + 83;
        AFKeystoreWrapper = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(aFd1wSDK, "");
        aFd1wSDK.copy();
        int i4 = copydefault + 45;
        AFKeystoreWrapper = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override // com.appsflyer.internal.AFd1xSDK
    public final void AFAdRevenueData() {
        int i = 2 % 2;
        int i2 = AFKeystoreWrapper + 97;
        copydefault = i2 % 128;
        if (i2 % 2 != 0) {
            areAllFieldsValid().execute(new Runnable() { // from class: com.appsflyer.internal.AFd1wSDK$$ExternalSyntheticLambda2
                @Override // java.lang.Runnable
                public final void run() {
                    AFd1wSDK.getMediationNetwork(AFd1wSDK.this);
                }
            });
            int i3 = 82 / 0;
        } else {
            areAllFieldsValid().execute(new Runnable() { // from class: com.appsflyer.internal.AFd1wSDK$$ExternalSyntheticLambda2
                @Override // java.lang.Runnable
                public final void run() {
                    AFd1wSDK.getMediationNetwork(AFd1wSDK.this);
                }
            });
        }
        int i4 = AFKeystoreWrapper + 119;
        copydefault = i4 % 128;
        int i5 = i4 % 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void getRevenue(AFd1wSDK aFd1wSDK) {
        int i = 2 % 2;
        int i2 = AFKeystoreWrapper + 61;
        copydefault = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(aFd1wSDK, "");
            aFd1wSDK.equals();
            throw null;
        }
        Intrinsics.checkNotNullParameter(aFd1wSDK, "");
        aFd1wSDK.equals();
        int i3 = AFKeystoreWrapper + 99;
        copydefault = i3 % 128;
        int i4 = i3 % 2;
    }

    private static /* synthetic */ Object getMonetizationNetwork(Object[] objArr) {
        final AFd1wSDK aFd1wSDK = (AFd1wSDK) objArr[0];
        int i = 2 % 2;
        int i2 = AFKeystoreWrapper + 77;
        copydefault = i2 % 128;
        if (i2 % 2 != 0) {
            aFd1wSDK.areAllFieldsValid().execute(new Runnable() { // from class: com.appsflyer.internal.AFd1wSDK$$ExternalSyntheticLambda3
                @Override // java.lang.Runnable
                public final void run() {
                    AFd1wSDK.getRevenue(AFd1wSDK.this);
                }
            });
            int i3 = 69 / 0;
            return null;
        }
        aFd1wSDK.areAllFieldsValid().execute(new Runnable() { // from class: com.appsflyer.internal.AFd1wSDK$$ExternalSyntheticLambda3
            @Override // java.lang.Runnable
            public final void run() {
                AFd1wSDK.getRevenue(AFd1wSDK.this);
            }
        });
        return null;
    }

    private static void a(String str, int i, Object[] objArr) {
        char[] cArr;
        int i2 = 2 % 2;
        if (str != null) {
            int i3 = $10 + 51;
            $11 = i3 % 128;
            int i4 = i3 % 2;
            cArr = str.toCharArray();
        } else {
            cArr = str;
        }
        char[] cArr2 = cArr;
        AFk1qSDK aFk1qSDK = new AFk1qSDK();
        char[] cArr3 = new char[cArr2.length];
        aFk1qSDK.getRevenue = 0;
        char[] cArr4 = new char[2];
        while (aFk1qSDK.getRevenue < cArr2.length) {
            cArr4[0] = cArr2[aFk1qSDK.getRevenue];
            cArr4[1] = cArr2[aFk1qSDK.getRevenue + 1];
            int i5 = 58224;
            for (int i6 = 0; i6 < 16; i6++) {
                char c = cArr4[1];
                char c2 = cArr4[0];
                char c3 = (char) (c - (((c2 + i5) ^ ((c2 << 4) + ((char) (toString ^ (-1199070254561146252L))))) ^ ((c2 >>> 5) + ((char) (copy ^ (-1199070254561146252L))))));
                cArr4[1] = c3;
                cArr4[0] = (char) (c2 - (((c3 >>> 5) + ((char) (hashCode ^ (-1199070254561146252L)))) ^ ((c3 + i5) ^ ((c3 << 4) + ((char) (equals ^ (-1199070254561146252L)))))));
                i5 -= 40503;
            }
            cArr3[aFk1qSDK.getRevenue] = cArr4[0];
            cArr3[aFk1qSDK.getRevenue + 1] = cArr4[1];
            aFk1qSDK.getRevenue += 2;
        }
        String str2 = new String(cArr3, 0, i);
        int i7 = $10 + 97;
        $11 = i7 % 128;
        if (i7 % 2 != 0) {
            objArr[0] = str2;
        } else {
            int i8 = 2 / 0;
            objArr[0] = str2;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:56:0x014e, code lost:
    
        if (r10 != null) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0157, code lost:
    
        r10 = com.appsflyer.internal.AFd1rSDK.getMonetizationNetwork(r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x0191, code lost:
    
        if (r1.intValue() == (-1)) goto L90;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x0155, code lost:
    
        if (r10 != null) goto L70;
     */
    /* JADX WARN: Removed duplicated region for block: B:64:0x017c A[Catch: all -> 0x023d, TryCatch #2 {, blocks: (B:4:0x0002, B:6:0x0023, B:7:0x0028, B:9:0x003c, B:13:0x0067, B:15:0x0078, B:17:0x007f, B:19:0x0091, B:21:0x0095, B:23:0x00a9, B:25:0x00b3, B:27:0x00b9, B:29:0x00c8, B:30:0x00ce, B:32:0x00dc, B:34:0x00e2, B:36:0x00e8, B:38:0x00f3, B:39:0x0103, B:41:0x0111, B:43:0x0117, B:45:0x011d, B:46:0x0123, B:47:0x0126, B:48:0x012e, B:50:0x013e, B:52:0x0149, B:57:0x0157, B:58:0x015d, B:60:0x016d, B:62:0x0171, B:64:0x017c, B:65:0x0181, B:71:0x0189, B:75:0x0195, B:76:0x021e, B:78:0x0222, B:80:0x0232, B:81:0x0236, B:87:0x01af, B:89:0x01cd, B:90:0x01e9, B:91:0x018d, B:95:0x0152, B:96:0x0153, B:100:0x00fa, B:105:0x00ff, B:106:0x0100, B:110:0x0204, B:55:0x014d, B:67:0x0184, B:68:0x0187, B:102:0x00fd), top: B:3:0x0002, inners: #0, #1, #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0181 A[Catch: all -> 0x023d, TRY_LEAVE, TryCatch #2 {, blocks: (B:4:0x0002, B:6:0x0023, B:7:0x0028, B:9:0x003c, B:13:0x0067, B:15:0x0078, B:17:0x007f, B:19:0x0091, B:21:0x0095, B:23:0x00a9, B:25:0x00b3, B:27:0x00b9, B:29:0x00c8, B:30:0x00ce, B:32:0x00dc, B:34:0x00e2, B:36:0x00e8, B:38:0x00f3, B:39:0x0103, B:41:0x0111, B:43:0x0117, B:45:0x011d, B:46:0x0123, B:47:0x0126, B:48:0x012e, B:50:0x013e, B:52:0x0149, B:57:0x0157, B:58:0x015d, B:60:0x016d, B:62:0x0171, B:64:0x017c, B:65:0x0181, B:71:0x0189, B:75:0x0195, B:76:0x021e, B:78:0x0222, B:80:0x0232, B:81:0x0236, B:87:0x01af, B:89:0x01cd, B:90:0x01e9, B:91:0x018d, B:95:0x0152, B:96:0x0153, B:100:0x00fa, B:105:0x00ff, B:106:0x0100, B:110:0x0204, B:55:0x014d, B:67:0x0184, B:68:0x0187, B:102:0x00fd), top: B:3:0x0002, inners: #0, #1, #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0195 A[Catch: all -> 0x023d, TryCatch #2 {, blocks: (B:4:0x0002, B:6:0x0023, B:7:0x0028, B:9:0x003c, B:13:0x0067, B:15:0x0078, B:17:0x007f, B:19:0x0091, B:21:0x0095, B:23:0x00a9, B:25:0x00b3, B:27:0x00b9, B:29:0x00c8, B:30:0x00ce, B:32:0x00dc, B:34:0x00e2, B:36:0x00e8, B:38:0x00f3, B:39:0x0103, B:41:0x0111, B:43:0x0117, B:45:0x011d, B:46:0x0123, B:47:0x0126, B:48:0x012e, B:50:0x013e, B:52:0x0149, B:57:0x0157, B:58:0x015d, B:60:0x016d, B:62:0x0171, B:64:0x017c, B:65:0x0181, B:71:0x0189, B:75:0x0195, B:76:0x021e, B:78:0x0222, B:80:0x0232, B:81:0x0236, B:87:0x01af, B:89:0x01cd, B:90:0x01e9, B:91:0x018d, B:95:0x0152, B:96:0x0153, B:100:0x00fa, B:105:0x00ff, B:106:0x0100, B:110:0x0204, B:55:0x014d, B:67:0x0184, B:68:0x0187, B:102:0x00fd), top: B:3:0x0002, inners: #0, #1, #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:87:0x01af A[Catch: all -> 0x023d, TryCatch #2 {, blocks: (B:4:0x0002, B:6:0x0023, B:7:0x0028, B:9:0x003c, B:13:0x0067, B:15:0x0078, B:17:0x007f, B:19:0x0091, B:21:0x0095, B:23:0x00a9, B:25:0x00b3, B:27:0x00b9, B:29:0x00c8, B:30:0x00ce, B:32:0x00dc, B:34:0x00e2, B:36:0x00e8, B:38:0x00f3, B:39:0x0103, B:41:0x0111, B:43:0x0117, B:45:0x011d, B:46:0x0123, B:47:0x0126, B:48:0x012e, B:50:0x013e, B:52:0x0149, B:57:0x0157, B:58:0x015d, B:60:0x016d, B:62:0x0171, B:64:0x017c, B:65:0x0181, B:71:0x0189, B:75:0x0195, B:76:0x021e, B:78:0x0222, B:80:0x0232, B:81:0x0236, B:87:0x01af, B:89:0x01cd, B:90:0x01e9, B:91:0x018d, B:95:0x0152, B:96:0x0153, B:100:0x00fa, B:105:0x00ff, B:106:0x0100, B:110:0x0204, B:55:0x014d, B:67:0x0184, B:68:0x0187, B:102:0x00fd), top: B:3:0x0002, inners: #0, #1, #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:88:0x01cb  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x018d A[Catch: all -> 0x023d, TryCatch #2 {, blocks: (B:4:0x0002, B:6:0x0023, B:7:0x0028, B:9:0x003c, B:13:0x0067, B:15:0x0078, B:17:0x007f, B:19:0x0091, B:21:0x0095, B:23:0x00a9, B:25:0x00b3, B:27:0x00b9, B:29:0x00c8, B:30:0x00ce, B:32:0x00dc, B:34:0x00e2, B:36:0x00e8, B:38:0x00f3, B:39:0x0103, B:41:0x0111, B:43:0x0117, B:45:0x011d, B:46:0x0123, B:47:0x0126, B:48:0x012e, B:50:0x013e, B:52:0x0149, B:57:0x0157, B:58:0x015d, B:60:0x016d, B:62:0x0171, B:64:0x017c, B:65:0x0181, B:71:0x0189, B:75:0x0195, B:76:0x021e, B:78:0x0222, B:80:0x0232, B:81:0x0236, B:87:0x01af, B:89:0x01cd, B:90:0x01e9, B:91:0x018d, B:95:0x0152, B:96:0x0153, B:100:0x00fa, B:105:0x00ff, B:106:0x0100, B:110:0x0204, B:55:0x014d, B:67:0x0184, B:68:0x0187, B:102:0x00fd), top: B:3:0x0002, inners: #0, #1, #3 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final synchronized void copydefault() {
        Integer num;
        Pair<Integer, Integer> pair;
        AFh1aSDK aFh1aSDK;
        String str;
        int i;
        String str2;
        String str3;
        int i2;
        int i3;
        MatchGroup matchGroup;
        int i4;
        String value;
        Integer intOrNull;
        String value2;
        Integer intOrNull2;
        String value3;
        int i5 = 2 % 2;
        int i6 = AFKeystoreWrapper + 13;
        copydefault = i6 % 128;
        int i7 = i6 % 2;
        AFh1aSDK aFh1aSDK2 = (AFh1aSDK) getMediationNetwork(new Object[]{this}, -2108652204, 2108652208, System.identityHashCode(this));
        if ((aFh1aSDK2 != null ? aFh1aSDK2.getMonetizationNetwork : -1L) < TimeUnit.MILLISECONDS.toSeconds(System.currentTimeMillis())) {
            AFh1ySDK.v$default(AFLogger.INSTANCE, AFg1cSDK.EXCEPTION_MANAGER, "TTL is already passed", false, 4, null);
            ((AFc1qSDK) getMediationNetwork(new Object[]{this}, 1891172040, -1891172038, System.identityHashCode(this))).AFAdRevenueData("af_send_exc_to_server_window");
            getRevenue().getCurrencyIso4217Code();
            return;
        }
        AFh1aSDK aFh1aSDK3 = (AFh1aSDK) getMediationNetwork(new Object[]{this}, -2108652204, 2108652208, System.identityHashCode(this));
        if (aFh1aSDK3 == null || !getMonetizationNetwork(aFh1aSDK3)) {
            ((AFc1qSDK) getMediationNetwork(new Object[]{this}, 1891172040, -1891172038, System.identityHashCode(this))).AFAdRevenueData("af_send_exc_to_server_window");
            getRevenue().getCurrencyIso4217Code();
        } else {
            AFh1aSDK aFh1aSDK4 = (AFh1aSDK) getMediationNetwork(new Object[]{this}, -2108652204, 2108652208, System.identityHashCode(this));
            Pair<Integer, Integer> pair2 = null;
            if (aFh1aSDK4 == null || (str3 = aFh1aSDK4.getRevenue) == null) {
                num = null;
            } else {
                Intrinsics.checkNotNullParameter(str3, "");
                MatchResult matchEntire = new Regex("(\\d+).(\\d+).(\\d+).*").matchEntire(str3);
                if (matchEntire != null) {
                    MatchGroup matchGroup2 = matchEntire.getGroups().get(1);
                    if (matchGroup2 != null && (value3 = matchGroup2.getValue()) != null) {
                        int i8 = AFKeystoreWrapper + AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR_OVERLAY;
                        copydefault = i8 % 128;
                        int i9 = i8 % 2;
                        Integer intOrNull3 = StringsKt.toIntOrNull(value3);
                        if (intOrNull3 != null) {
                            i3 = intOrNull3.intValue();
                            int i10 = i3 * DurationKt.NANOS_IN_MILLIS;
                            matchGroup = matchEntire.getGroups().get(2);
                            if (matchGroup != null || (value2 = matchGroup.getValue()) == null || (intOrNull2 = StringsKt.toIntOrNull(value2)) == null) {
                                int i11 = 2 % 2;
                                i4 = 0;
                            } else {
                                int i12 = copydefault + 123;
                                AFKeystoreWrapper = i12 % 128;
                                if (i12 % 2 == 0) {
                                    intOrNull2.intValue();
                                    throw null;
                                }
                                i4 = intOrNull2.intValue();
                                int i13 = 2 % 2;
                            }
                            int i14 = i10 + (i4 * 1000);
                            MatchGroup matchGroup3 = matchEntire.getGroups().get(3);
                            i2 = i14 + ((matchGroup3 != null || (value = matchGroup3.getValue()) == null || (intOrNull = StringsKt.toIntOrNull(value)) == null) ? 0 : intOrNull.intValue());
                        }
                    }
                    i3 = 0;
                    int i102 = i3 * DurationKt.NANOS_IN_MILLIS;
                    matchGroup = matchEntire.getGroups().get(2);
                    if (matchGroup != null) {
                    }
                    int i112 = 2 % 2;
                    i4 = 0;
                    int i142 = i102 + (i4 * 1000);
                    MatchGroup matchGroup32 = matchEntire.getGroups().get(3);
                    i2 = i142 + ((matchGroup32 != null || (value = matchGroup32.getValue()) == null || (intOrNull = StringsKt.toIntOrNull(value)) == null) ? 0 : intOrNull.intValue());
                } else {
                    i2 = -1;
                }
                num = Integer.valueOf(i2);
                int i15 = 2 % 2;
            }
            AFh1aSDK aFh1aSDK5 = (AFh1aSDK) getMediationNetwork(new Object[]{this}, -2108652204, 2108652208, System.identityHashCode(this));
            if (aFh1aSDK5 != null) {
                int i16 = copydefault + 15;
                AFKeystoreWrapper = i16 % 128;
                if (i16 % 2 == 0) {
                    str2 = aFh1aSDK5.getRevenue;
                    int i17 = 29 / 0;
                } else {
                    str2 = aFh1aSDK5.getRevenue;
                }
                aFh1aSDK = (AFh1aSDK) getMediationNetwork(new Object[]{this}, -2108652204, 2108652208, System.identityHashCode(this));
                if (aFh1aSDK != null && (str = aFh1aSDK.getRevenue) != null) {
                    i = AFKeystoreWrapper + 99;
                    copydefault = i % 128;
                    if (i % 2 == 0) {
                        AFd1rSDK.AFAdRevenueData(str);
                        pair2.hashCode();
                        throw null;
                    }
                    pair2 = AFd1rSDK.AFAdRevenueData(str);
                }
                if (num != null) {
                }
                if (pair == null) {
                    int i18 = copydefault + 59;
                    AFKeystoreWrapper = i18 % 128;
                    int i19 = i18 % 2;
                    getRevenue().getMonetizationNetwork(this.component4);
                    int i20 = 2 % 2;
                }
                if (pair == null) {
                    getRevenue().getCurrencyIso4217Code(pair.getFirst().intValue(), pair.getSecond().intValue());
                } else if (pair2 != null) {
                    getRevenue().getCurrencyIso4217Code(pair2.getFirst().intValue(), pair2.getSecond().intValue());
                } else {
                    ((AFc1qSDK) getMediationNetwork(new Object[]{this}, 1891172040, -1891172038, System.identityHashCode(this))).AFAdRevenueData("af_send_exc_to_server_window");
                    getRevenue().getCurrencyIso4217Code();
                }
            }
            pair = null;
            aFh1aSDK = (AFh1aSDK) getMediationNetwork(new Object[]{this}, -2108652204, 2108652208, System.identityHashCode(this));
            if (aFh1aSDK != null) {
                i = AFKeystoreWrapper + 99;
                copydefault = i % 128;
                if (i % 2 == 0) {
                }
            }
            if (num != null) {
            }
            if (pair == null) {
            }
            if (pair == null) {
            }
        }
        AFd1xSDK.AFa1vSDK aFa1vSDK = this.component1;
        if (aFa1vSDK != null) {
            AFh1aSDK aFh1aSDK6 = (AFh1aSDK) getMediationNetwork(new Object[]{this}, -2108652204, 2108652208, System.identityHashCode(this));
            aFa1vSDK.onConfigurationChanged(aFh1aSDK6 != null ? AFAdRevenueData(aFh1aSDK6) : false);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x003d, code lost:
    
        if (getMediationNetwork(r1) == false) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x003f, code lost:
    
        r2 = com.appsflyer.internal.AFd1wSDK.AFKeystoreWrapper + 121;
        com.appsflyer.internal.AFd1wSDK.copydefault = r2 % 128;
        r2 = r2 % 2;
        r0 = component1().getMediationNetwork();
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0050, code lost:
    
        if (r0 == null) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0052, code lost:
    
        r1 = new org.json.JSONObject(getMonetizationNetwork(getRevenue(r1), getRevenue().getRevenue())).toString();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, "");
        getMediationNetwork(new java.lang.Object[]{r7, r1, r0}, -1856843688, 1856843689, java.lang.System.identityHashCode(r7));
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0084, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0085, code lost:
    
        com.appsflyer.internal.AFh1ySDK.v$default(com.appsflyer.AFLogger.INSTANCE, com.appsflyer.internal.AFg1cSDK.EXCEPTION_MANAGER, "skipping", false, 4, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0094, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0037, code lost:
    
        if (r1 != null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0026, code lost:
    
        if (r1 != null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0095, code lost:
    
        r1 = com.appsflyer.internal.AFd1wSDK.AFKeystoreWrapper + 3;
        com.appsflyer.internal.AFd1wSDK.copydefault = r1 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x009e, code lost:
    
        if ((r1 % 2) == 0) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x00a0, code lost:
    
        r0 = 18 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x00a4, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void copy() {
        AFh1aSDK aFh1aSDK;
        int i = 2 % 2;
        int i2 = copydefault + 15;
        AFKeystoreWrapper = i2 % 128;
        if (i2 % 2 == 0) {
            aFh1aSDK = (AFh1aSDK) getMediationNetwork(new Object[]{this}, -2108652204, 2108652208, System.identityHashCode(this));
            int i3 = 33 / 0;
        } else {
            aFh1aSDK = (AFh1aSDK) getMediationNetwork(new Object[]{this}, -2108652204, 2108652208, System.identityHashCode(this));
        }
    }

    private final synchronized void equals() {
        boolean z;
        int i = 2 % 2;
        int i2 = AFKeystoreWrapper + 119;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        AFh1aSDK aFh1aSDK = (AFh1aSDK) getMediationNetwork(new Object[]{this}, -2108652204, 2108652208, System.identityHashCode(this));
        if (aFh1aSDK != null) {
            if (aFh1aSDK.getMediationNetwork == -1) {
                ((AFc1qSDK) getMediationNetwork(new Object[]{this}, 1891172040, -1891172038, System.identityHashCode(this))).AFAdRevenueData("af_send_exc_to_server_window");
            } else if (((AFc1qSDK) getMediationNetwork(new Object[]{this}, 1891172040, -1891172038, System.identityHashCode(this))).getMonetizationNetwork("af_send_exc_to_server_window", -1L) == -1) {
                int i4 = copydefault + 21;
                AFKeystoreWrapper = i4 % 128;
                int i5 = i4 % 2;
                getCurrencyIso4217Code(aFh1aSDK);
            }
            z = AFAdRevenueData(aFh1aSDK);
        } else {
            int i6 = 2 % 2;
            z = false;
        }
        AFd1xSDK.AFa1vSDK aFa1vSDK = this.component1;
        if (aFa1vSDK != null) {
            aFa1vSDK.onConfigurationChanged(z);
            int i7 = AFKeystoreWrapper + 111;
            copydefault = i7 % 128;
            if (i7 % 2 == 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    private final void getCurrencyIso4217Code(AFh1aSDK aFh1aSDK) {
        int i = 2 % 2;
        int i2 = AFKeystoreWrapper + 97;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        int i4 = aFh1aSDK.getCurrencyIso4217Code;
        long currentTimeMillis = System.currentTimeMillis() + TimeUnit.DAYS.toMillis(aFh1aSDK.getMediationNetwork);
        AFc1qSDK aFc1qSDK = (AFc1qSDK) getMediationNetwork(new Object[]{this}, 1891172040, -1891172038, System.identityHashCode(this));
        aFc1qSDK.AFAdRevenueData("af_send_exc_to_server_window", currentTimeMillis);
        aFc1qSDK.getMediationNetwork("af_send_exc_min", i4);
        int i5 = AFKeystoreWrapper + 17;
        copydefault = i5 % 128;
        if (i5 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private final Map<String, String> getRevenue(AFh1aSDK aFh1aSDK) {
        int i = 2 % 2;
        Object[] objArr = new Object[1];
        a("炜桪ꪴ鐅⠖ᰫ", (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 5, objArr);
        Map<String, String> mapOf = MapsKt.mapOf(TuplesKt.to(((String) objArr[0]).intern(), Build.BRAND), TuplesKt.to("model", Build.MODEL), TuplesKt.to("app_id", getMediationNetwork().getCurrencyIso4217Code.getMonetizationNetwork.getPackageName()), TuplesKt.to("p_ex", new AFa1uSDK().AFAdRevenueData()), TuplesKt.to("api", String.valueOf(Build.VERSION.SDK_INT)), TuplesKt.to("sdk", this.component4), TuplesKt.to("uid", AFb1kSDK.getCurrencyIso4217Code(getMediationNetwork().getMediationNetwork)), TuplesKt.to("exc_config", aFh1aSDK.AFAdRevenueData()));
        int i2 = AFKeystoreWrapper + 111;
        copydefault = i2 % 128;
        if (i2 % 2 == 0) {
            return mapOf;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static Map<String, Object> getMonetizationNetwork(Map<String, ? extends Object> map, List<AFc1aSDK> list) {
        int i = 2 % 2;
        int i2 = copydefault + 121;
        AFKeystoreWrapper = i2 % 128;
        int i3 = i2 % 2;
        Map<String, Object> mapOf = MapsKt.mapOf(TuplesKt.to("deviceInfo", map), TuplesKt.to("excs", AFd1qSDK.getMediationNetwork(list)));
        int i4 = AFKeystoreWrapper + 15;
        copydefault = i4 % 128;
        int i5 = i4 % 2;
        return mapOf;
    }

    private static /* synthetic */ Object getCurrencyIso4217Code(Object[] objArr) {
        AFd1wSDK aFd1wSDK = (AFd1wSDK) objArr[0];
        String str = (String) objArr[1];
        String str2 = (String) objArr[2];
        int i = 2 % 2;
        int i2 = AFKeystoreWrapper + 61;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        byte[] bytes = str.getBytes(Charsets.UTF_8);
        Intrinsics.checkNotNullExpressionValue(bytes, "");
        aFd1wSDK.component3().getMonetizationNetwork(bytes, MapsKt.mapOf(TuplesKt.to(HttpHeaders.AUTHORIZATION, AFj1dSDK.getMonetizationNetwork(str, str2))), 2000);
        int i4 = AFKeystoreWrapper + 69;
        copydefault = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 36 / 0;
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0080, code lost:
    
        if (r1 == (-1)) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0082, code lost:
    
        r2 = com.appsflyer.internal.AFd1wSDK.AFKeystoreWrapper + 31;
        com.appsflyer.internal.AFd1wSDK.copydefault = r2 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x008b, code lost:
    
        if ((r2 % 2) == 0) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x008d, code lost:
    
        r2 = 95 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0098, code lost:
    
        if (getRevenue().getMediationNetwork() >= r1) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x00aa, code lost:
    
        return getMonetizationNetwork(r15);
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x00a3, code lost:
    
        if (getRevenue().getMediationNetwork() >= r1) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x00ab, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x00ac, code lost:
    
        r15 = com.appsflyer.internal.AFd1wSDK.copydefault + 63;
        com.appsflyer.internal.AFd1wSDK.AFKeystoreWrapper = r15 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x00b5, code lost:
    
        if ((r15 % 2) == 0) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00b7, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00b9, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0061, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x005f, code lost:
    
        if (r15.getMonetizationNetwork < java.util.concurrent.TimeUnit.MILLISECONDS.toSeconds(r8)) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x003c, code lost:
    
        if (r15.getMonetizationNetwork < java.util.concurrent.TimeUnit.MILLISECONDS.toSeconds(r8)) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0064, code lost:
    
        if (r1 == (-1)) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0068, code lost:
    
        if (r1 >= r8) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x006b, code lost:
    
        r1 = ((com.appsflyer.internal.AFc1qSDK) getMediationNetwork(new java.lang.Object[]{r14}, 1891172040, -1891172038, java.lang.System.identityHashCode(r14))).getRevenue("af_send_exc_min", -1);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final boolean getMediationNetwork(AFh1aSDK aFh1aSDK) {
        long currentTimeMillis;
        long monetizationNetwork;
        int i = 2 % 2;
        int i2 = copydefault + 19;
        AFKeystoreWrapper = i2 % 128;
        if (i2 % 2 == 0) {
            currentTimeMillis = System.currentTimeMillis();
            monetizationNetwork = ((AFc1qSDK) getMediationNetwork(new Object[]{this}, 1891172040, -1891172038, System.identityHashCode(this))).getMonetizationNetwork("af_send_exc_to_server_window", -1L);
            int i3 = 9 / 0;
        } else {
            currentTimeMillis = System.currentTimeMillis();
            monetizationNetwork = ((AFc1qSDK) getMediationNetwork(new Object[]{this}, 1891172040, -1891172038, System.identityHashCode(this))).getMonetizationNetwork("af_send_exc_to_server_window", -1L);
        }
    }

    private final boolean AFAdRevenueData(AFh1aSDK aFh1aSDK) {
        int i = 2 % 2;
        int i2 = copydefault + 29;
        AFKeystoreWrapper = i2 % 128;
        int i3 = i2 % 2;
        long currentTimeMillis = System.currentTimeMillis();
        long monetizationNetwork = ((AFc1qSDK) getMediationNetwork(new Object[]{this}, 1891172040, -1891172038, System.identityHashCode(this))).getMonetizationNetwork("af_send_exc_to_server_window", -1L);
        if (aFh1aSDK.getMonetizationNetwork >= TimeUnit.MILLISECONDS.toSeconds(currentTimeMillis) && monetizationNetwork != -1) {
            int i4 = copydefault + 123;
            AFKeystoreWrapper = i4 % 128;
            int i5 = i4 % 2;
            if (monetizationNetwork >= currentTimeMillis) {
                return getMonetizationNetwork(aFh1aSDK);
            }
        }
        return false;
    }

    private final boolean getMonetizationNetwork(AFh1aSDK aFh1aSDK) {
        int i = 2 % 2;
        new AFd1pSDK();
        String str = this.component4;
        String str2 = aFh1aSDK.getRevenue;
        Intrinsics.checkNotNullExpressionValue(str2, "");
        boolean currencyIso4217Code = AFd1pSDK.getCurrencyIso4217Code(str, str2);
        int i2 = copydefault + 97;
        AFKeystoreWrapper = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 79 / 0;
        }
        return currencyIso4217Code;
    }

    private final void getMediationNetwork(String str, String str2) {
        getMediationNetwork(new Object[]{this, str, str2}, -1856843688, 1856843689, System.identityHashCode(this));
    }

    @Override // com.appsflyer.internal.AFd1xSDK
    public final void getMonetizationNetwork() {
        getMediationNetwork(new Object[]{this}, 452613973, -452613973, System.identityHashCode(this));
    }

    @Override // com.appsflyer.internal.AFd1xSDK
    public final void getMonetizationNetwork(Throwable th, String str) {
        getMediationNetwork(new Object[]{this, th, str}, -1045855402, 1045855405, System.identityHashCode(this));
    }

    private final AFh1aSDK component4() {
        return (AFh1aSDK) getMediationNetwork(new Object[]{this}, -2108652204, 2108652208, System.identityHashCode(this));
    }

    private final AFc1qSDK component2() {
        return (AFc1qSDK) getMediationNetwork(new Object[]{this}, 1891172040, -1891172038, System.identityHashCode(this));
    }
}
