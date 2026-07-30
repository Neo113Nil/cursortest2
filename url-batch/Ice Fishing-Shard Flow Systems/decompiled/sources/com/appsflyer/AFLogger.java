package com.appsflyer;

import A.k;
import R5.InterfaceC0168h;
import R5.i;
import com.appsflyer.internal.AFc1oSDK;
import com.appsflyer.internal.AFg1cSDK;
import com.appsflyer.internal.AFg1hSDK;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.w;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.p;
import kotlin.text.StringsKt;

@Metadata
/* loaded from: classes.dex */
public final class AFLogger extends AFg1hSDK {
    public static final AFLogger INSTANCE = new AFLogger();
    private static final InterfaceC0168h getMediationNetwork = i.b(AnonymousClass8.getMediationNetwork);
    private static final InterfaceC0168h AFAdRevenueData = i.b(AnonymousClass3.getRevenue);

    @Metadata
    /* renamed from: com.appsflyer.AFLogger$1, reason: invalid class name */
    public static final class AnonymousClass1 extends p implements Function1<AFg1hSDK, Unit> {
        private /* synthetic */ AFg1cSDK $AFAdRevenueData;
        private /* synthetic */ String $getMediationNetwork;
        private /* synthetic */ boolean $getRevenue;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(AFg1cSDK aFg1cSDK, String str, boolean z7) {
            super(1);
            this.$AFAdRevenueData = aFg1cSDK;
            this.$getMediationNetwork = str;
            this.$getRevenue = z7;
        }

        public final void getMonetizationNetwork(AFg1hSDK aFg1hSDK) {
            Intrinsics.checkNotNullParameter(aFg1hSDK, "");
            aFg1hSDK.d(this.$AFAdRevenueData, this.$getMediationNetwork, this.$getRevenue);
        }

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ Object invoke(Object obj) {
            getMonetizationNetwork((AFg1hSDK) obj);
            return Unit.f6114a;
        }
    }

    @Metadata
    /* renamed from: com.appsflyer.AFLogger$2, reason: invalid class name */
    public static final class AnonymousClass2 extends p implements Function1<AFg1hSDK, Unit> {
        private /* synthetic */ String $AFAdRevenueData;
        private /* synthetic */ boolean $component2;
        private /* synthetic */ boolean $component3;
        private /* synthetic */ Throwable $getCurrencyIso4217Code;
        private /* synthetic */ boolean $getMediationNetwork;
        private /* synthetic */ boolean $getMonetizationNetwork;
        private /* synthetic */ AFg1cSDK $getRevenue;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(AFg1cSDK aFg1cSDK, String str, Throwable th, boolean z7, boolean z8, boolean z9, boolean z10) {
            super(1);
            this.$getRevenue = aFg1cSDK;
            this.$AFAdRevenueData = str;
            this.$getCurrencyIso4217Code = th;
            this.$getMonetizationNetwork = z7;
            this.$getMediationNetwork = z8;
            this.$component2 = z9;
            this.$component3 = z10;
        }

        public final void AFAdRevenueData(AFg1hSDK aFg1hSDK) {
            Intrinsics.checkNotNullParameter(aFg1hSDK, "");
            aFg1hSDK.e(this.$getRevenue, this.$AFAdRevenueData, this.$getCurrencyIso4217Code, this.$getMonetizationNetwork, this.$getMediationNetwork, this.$component2, this.$component3);
        }

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ Object invoke(Object obj) {
            AFAdRevenueData((AFg1hSDK) obj);
            return Unit.f6114a;
        }
    }

    @Metadata
    /* renamed from: com.appsflyer.AFLogger$3, reason: invalid class name */
    public static final class AnonymousClass3 extends p implements Function0<ExecutorService> {
        public static final AnonymousClass3 getRevenue = new AnonymousClass3();

        public AnonymousClass3() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: getRevenue, reason: merged with bridge method [inline-methods] */
        public final ExecutorService invoke() {
            return AFc1oSDK.AFAdRevenueData();
        }
    }

    @Metadata
    /* renamed from: com.appsflyer.AFLogger$4, reason: invalid class name */
    public static final class AnonymousClass4 extends p implements Function1<AFg1hSDK, Unit> {
        private /* synthetic */ String $getCurrencyIso4217Code;
        private /* synthetic */ AFg1cSDK $getMediationNetwork;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass4(AFg1cSDK aFg1cSDK, String str) {
            super(1);
            this.$getMediationNetwork = aFg1cSDK;
            this.$getCurrencyIso4217Code = str;
        }

        public final void AFAdRevenueData(AFg1hSDK aFg1hSDK) {
            Intrinsics.checkNotNullParameter(aFg1hSDK, "");
            aFg1hSDK.force(this.$getMediationNetwork, this.$getCurrencyIso4217Code);
        }

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ Object invoke(Object obj) {
            AFAdRevenueData((AFg1hSDK) obj);
            return Unit.f6114a;
        }
    }

    @Metadata
    /* renamed from: com.appsflyer.AFLogger$5, reason: invalid class name */
    public static final class AnonymousClass5 extends p implements Function1<AFg1hSDK, Unit> {
        private /* synthetic */ boolean $getCurrencyIso4217Code;
        private /* synthetic */ String $getMediationNetwork;
        private /* synthetic */ AFg1cSDK $getRevenue;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass5(AFg1cSDK aFg1cSDK, String str, boolean z7) {
            super(1);
            this.$getRevenue = aFg1cSDK;
            this.$getMediationNetwork = str;
            this.$getCurrencyIso4217Code = z7;
        }

        public final void getMediationNetwork(AFg1hSDK aFg1hSDK) {
            Intrinsics.checkNotNullParameter(aFg1hSDK, "");
            aFg1hSDK.i(this.$getRevenue, this.$getMediationNetwork, this.$getCurrencyIso4217Code);
        }

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ Object invoke(Object obj) {
            getMediationNetwork((AFg1hSDK) obj);
            return Unit.f6114a;
        }
    }

    @Metadata
    /* renamed from: com.appsflyer.AFLogger$6, reason: invalid class name */
    public static final class AnonymousClass6 extends p implements Function1<AFg1hSDK, Unit> {
        private /* synthetic */ String $getCurrencyIso4217Code;
        private /* synthetic */ boolean $getMediationNetwork;
        private /* synthetic */ AFg1cSDK $getRevenue;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass6(AFg1cSDK aFg1cSDK, String str, boolean z7) {
            super(1);
            this.$getRevenue = aFg1cSDK;
            this.$getCurrencyIso4217Code = str;
            this.$getMediationNetwork = z7;
        }

        public final void getMonetizationNetwork(AFg1hSDK aFg1hSDK) {
            Intrinsics.checkNotNullParameter(aFg1hSDK, "");
            aFg1hSDK.v(this.$getRevenue, this.$getCurrencyIso4217Code, this.$getMediationNetwork);
        }

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ Object invoke(Object obj) {
            getMonetizationNetwork((AFg1hSDK) obj);
            return Unit.f6114a;
        }
    }

    @Metadata
    /* renamed from: com.appsflyer.AFLogger$8, reason: invalid class name */
    public static final class AnonymousClass8 extends p implements Function0<Set<AFg1hSDK>> {
        public static final AnonymousClass8 getMediationNetwork = new AnonymousClass8();

        public AnonymousClass8() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: getMediationNetwork, reason: merged with bridge method [inline-methods] */
        public final Set<AFg1hSDK> invoke() {
            return new LinkedHashSet();
        }
    }

    @Metadata
    /* renamed from: com.appsflyer.AFLogger$9, reason: invalid class name */
    public static final class AnonymousClass9 extends p implements Function1<AFg1hSDK, Unit> {
        private /* synthetic */ String $getMediationNetwork;
        private /* synthetic */ boolean $getMonetizationNetwork;
        private /* synthetic */ AFg1cSDK $getRevenue;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass9(AFg1cSDK aFg1cSDK, String str, boolean z7) {
            super(1);
            this.$getRevenue = aFg1cSDK;
            this.$getMediationNetwork = str;
            this.$getMonetizationNetwork = z7;
        }

        public final void getCurrencyIso4217Code(AFg1hSDK aFg1hSDK) {
            Intrinsics.checkNotNullParameter(aFg1hSDK, "");
            aFg1hSDK.w(this.$getRevenue, this.$getMediationNetwork, this.$getMonetizationNetwork);
        }

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ Object invoke(Object obj) {
            getCurrencyIso4217Code((AFg1hSDK) obj);
            return Unit.f6114a;
        }
    }

    @Metadata
    public enum LogLevel {
        NONE(0),
        ERROR(1),
        WARNING(2),
        INFO(3),
        DEBUG(4),
        VERBOSE(5);

        private final int level;

        LogLevel(int i2) {
            this.level = i2;
        }

        public final int getLevel() {
            return this.level;
        }
    }

    private AFLogger() {
    }

    public static final void afDebugLog(String str, boolean z7) {
        Intrinsics.checkNotNullParameter(str, "");
        INSTANCE.d(AFg1cSDK.OTHER, str, z7);
    }

    public static final void afErrorLog(String str, Throwable th, boolean z7, boolean z8, boolean z9) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(th, "");
        AFg1hSDK.e$default(INSTANCE, AFg1cSDK.OTHER, str, th, z7, z8, z9, false, 64, null);
    }

    public static final void afErrorLogForExcManagerOnly(String str, Throwable th) {
        AFLogger aFLogger = INSTANCE;
        AFg1cSDK aFg1cSDK = AFg1cSDK.OTHER;
        if (str == null || StringsKt.z(str)) {
            str = "null";
        }
        String str2 = str;
        if (th == null) {
            th = new NullPointerException("Invoked with null Throwable");
        }
        AFg1hSDK.e$default(aFLogger, aFg1cSDK, str2, th, false, false, true, false, 64, null);
    }

    public static final void afInfoLog(String str, boolean z7) {
        Intrinsics.checkNotNullParameter(str, "");
        INSTANCE.i(AFg1cSDK.OTHER, str, z7);
    }

    public static final void afLogForce(String str) {
        Intrinsics.checkNotNullParameter(str, "");
        INSTANCE.force(AFg1cSDK.OTHER, str);
    }

    public static final void afRDLog(String str) {
        Intrinsics.checkNotNullParameter(str, "");
        INSTANCE.v(AFg1cSDK.OTHER, str, true);
    }

    public static final void afVerboseLog(String str) {
        Intrinsics.checkNotNullParameter(str, "");
        INSTANCE.v(AFg1cSDK.OTHER, str, false);
    }

    public static final void afWarnLog(String str, boolean z7) {
        Intrinsics.checkNotNullParameter(str, "");
        INSTANCE.w(AFg1cSDK.OTHER, str, z7);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void getMediationNetwork(AFg1hSDK[] aFg1hSDKArr) {
        Intrinsics.checkNotNullParameter(aFg1hSDKArr, "");
        ((Set) getMediationNetwork.getValue()).removeAll(kotlin.collections.p.s(aFg1hSDKArr));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void getMonetizationNetwork(AFg1hSDK[] aFg1hSDKArr) {
        Intrinsics.checkNotNullParameter(aFg1hSDKArr, "");
        w.i((Set) getMediationNetwork.getValue(), aFg1hSDKArr);
    }

    @Override // com.appsflyer.internal.AFg1hSDK
    public final void d(AFg1cSDK aFg1cSDK, String str, boolean z7) {
        Intrinsics.checkNotNullParameter(aFg1cSDK, "");
        Intrinsics.checkNotNullParameter(str, "");
        ((ExecutorService) AFAdRevenueData.getValue()).execute(new k(6, new AnonymousClass1(aFg1cSDK, str, z7)));
    }

    @Override // com.appsflyer.internal.AFg1hSDK
    public final void e(AFg1cSDK aFg1cSDK, String str, Throwable th, boolean z7, boolean z8, boolean z9, boolean z10) {
        Intrinsics.checkNotNullParameter(aFg1cSDK, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(th, "");
        ((ExecutorService) AFAdRevenueData.getValue()).execute(new k(6, new AnonymousClass2(aFg1cSDK, str, th, z7, z8, z9, z10)));
    }

    @Override // com.appsflyer.internal.AFg1hSDK
    public final void force(AFg1cSDK aFg1cSDK, String str) {
        Intrinsics.checkNotNullParameter(aFg1cSDK, "");
        Intrinsics.checkNotNullParameter(str, "");
        ((ExecutorService) AFAdRevenueData.getValue()).execute(new k(6, new AnonymousClass4(aFg1cSDK, str)));
    }

    @Override // com.appsflyer.internal.AFg1hSDK
    public final void i(AFg1cSDK aFg1cSDK, String str, boolean z7) {
        Intrinsics.checkNotNullParameter(aFg1cSDK, "");
        Intrinsics.checkNotNullParameter(str, "");
        ((ExecutorService) AFAdRevenueData.getValue()).execute(new k(6, new AnonymousClass5(aFg1cSDK, str, z7)));
    }

    public final void registerClient(AFg1hSDK... aFg1hSDKArr) {
        Intrinsics.checkNotNullParameter(aFg1hSDKArr, "");
        ((ExecutorService) AFAdRevenueData.getValue()).execute(new a(aFg1hSDKArr, 1));
    }

    public final void unregisterClient(AFg1hSDK... aFg1hSDKArr) {
        Intrinsics.checkNotNullParameter(aFg1hSDKArr, "");
        ((ExecutorService) AFAdRevenueData.getValue()).execute(new a(aFg1hSDKArr, 0));
    }

    @Override // com.appsflyer.internal.AFg1hSDK
    public final void v(AFg1cSDK aFg1cSDK, String str, boolean z7) {
        Intrinsics.checkNotNullParameter(aFg1cSDK, "");
        Intrinsics.checkNotNullParameter(str, "");
        ((ExecutorService) AFAdRevenueData.getValue()).execute(new k(6, new AnonymousClass6(aFg1cSDK, str, z7)));
    }

    @Override // com.appsflyer.internal.AFg1hSDK
    public final void w(AFg1cSDK aFg1cSDK, String str, boolean z7) {
        Intrinsics.checkNotNullParameter(aFg1cSDK, "");
        Intrinsics.checkNotNullParameter(str, "");
        ((ExecutorService) AFAdRevenueData.getValue()).execute(new k(6, new AnonymousClass9(aFg1cSDK, str, z7)));
    }

    public static final void afDebugLog(String str) {
        Intrinsics.checkNotNullParameter(str, "");
        INSTANCE.d(AFg1cSDK.OTHER, str, true);
    }

    public static final void afInfoLog(String str) {
        Intrinsics.checkNotNullParameter(str, "");
        INSTANCE.i(AFg1cSDK.OTHER, str, true);
    }

    public static final void afWarnLog(String str) {
        Intrinsics.checkNotNullParameter(str, "");
        AFg1hSDK.w$default(INSTANCE, AFg1cSDK.OTHER, str, false, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void getMediationNetwork(Function1 function1) {
        Intrinsics.checkNotNullParameter(function1, "");
        Iterator it = ((Set) getMediationNetwork.getValue()).iterator();
        while (it.hasNext()) {
            function1.invoke((AFg1hSDK) it.next());
        }
    }

    public static final void afErrorLog(String str, Throwable th) {
        AFLogger aFLogger = INSTANCE;
        AFg1cSDK aFg1cSDK = AFg1cSDK.OTHER;
        if (str == null || StringsKt.z(str)) {
            str = "null";
        }
        String str2 = str;
        if (th == null) {
            th = new NullPointerException("Invoked with null Throwable");
        }
        AFg1hSDK.e$default(aFLogger, aFg1cSDK, str2, th, false, false, false, false, 120, null);
    }

    public static final void afErrorLogForExcManagerOnly(String str, Throwable th, boolean z7) {
        AFLogger aFLogger = INSTANCE;
        AFg1cSDK aFg1cSDK = AFg1cSDK.OTHER;
        if (str == null || StringsKt.z(str)) {
            str = "null";
        }
        String str2 = str;
        if (th == null) {
            th = new NullPointerException("Invoked with null Throwable");
        }
        AFg1hSDK.e$default(aFLogger, aFg1cSDK, str2, th, false, false, !z7, false, 64, null);
    }

    public static final void afErrorLog(String str, Throwable th, boolean z7) {
        AFLogger aFLogger = INSTANCE;
        AFg1cSDK aFg1cSDK = AFg1cSDK.OTHER;
        if (str == null || StringsKt.z(str)) {
            str = "null";
        }
        String str2 = str;
        if (th == null) {
            th = new NullPointerException("Invoked with null Throwable");
        }
        AFg1hSDK.e$default(aFLogger, aFg1cSDK, str2, th, false, z7, false, false, 104, null);
    }

    public static final void afErrorLog(String str, Throwable th, boolean z7, boolean z8) {
        AFLogger aFLogger = INSTANCE;
        AFg1cSDK aFg1cSDK = AFg1cSDK.OTHER;
        if (str == null || StringsKt.z(str)) {
            str = "null";
        }
        String str2 = str;
        if (th == null) {
            th = new NullPointerException("Invoked with null Throwable");
        }
        AFg1hSDK.e$default(aFLogger, aFg1cSDK, str2, th, false, z7, z8, false, 72, null);
    }
}
