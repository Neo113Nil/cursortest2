package com.appsflyer;

import W1.h;
import W1.i;
import com.appsflyer.internal.AFg1cSDK;
import com.appsflyer.internal.AFg1gSDK;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.AbstractC3219i;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import kotlin.text.StringsKt;

@Metadata
/* loaded from: classes.dex */
public final class AFLogger extends AFg1gSDK {
    public static final AFLogger INSTANCE = new AFLogger();
    private static final h getMediationNetwork = i.b(AnonymousClass8.getMediationNetwork);
    private static final h getRevenue = i.b(AnonymousClass3.getMediationNetwork);

    @Metadata
    /* renamed from: com.appsflyer.AFLogger$1, reason: invalid class name */
    static final class AnonymousClass1 extends s implements Function1<AFg1gSDK, Unit> {
        private /* synthetic */ String $getCurrencyIso4217Code;
        private /* synthetic */ AFg1cSDK $getMediationNetwork;
        private /* synthetic */ boolean $getRevenue;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(AFg1cSDK aFg1cSDK, String str, boolean z4) {
            super(1);
            this.$getMediationNetwork = aFg1cSDK;
            this.$getCurrencyIso4217Code = str;
            this.$getRevenue = z4;
        }

        public final void getRevenue(AFg1gSDK aFg1gSDK) {
            Intrinsics.checkNotNullParameter(aFg1gSDK, "");
            aFg1gSDK.d(this.$getMediationNetwork, this.$getCurrencyIso4217Code, this.$getRevenue);
        }

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ Object invoke(Object obj) {
            getRevenue((AFg1gSDK) obj);
            return Unit.f41027a;
        }
    }

    @Metadata
    /* renamed from: com.appsflyer.AFLogger$2, reason: invalid class name */
    static final class AnonymousClass2 extends s implements Function1<AFg1gSDK, Unit> {
        private /* synthetic */ String $AFAdRevenueData;
        private /* synthetic */ boolean $areAllFieldsValid;
        private /* synthetic */ boolean $component2;
        private /* synthetic */ Throwable $getCurrencyIso4217Code;
        private /* synthetic */ AFg1cSDK $getMediationNetwork;
        private /* synthetic */ boolean $getMonetizationNetwork;
        private /* synthetic */ boolean $getRevenue;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(AFg1cSDK aFg1cSDK, String str, Throwable th, boolean z4, boolean z5, boolean z6, boolean z7) {
            super(1);
            this.$getMediationNetwork = aFg1cSDK;
            this.$AFAdRevenueData = str;
            this.$getCurrencyIso4217Code = th;
            this.$getRevenue = z4;
            this.$getMonetizationNetwork = z5;
            this.$areAllFieldsValid = z6;
            this.$component2 = z7;
        }

        public final void getRevenue(AFg1gSDK aFg1gSDK) {
            Intrinsics.checkNotNullParameter(aFg1gSDK, "");
            aFg1gSDK.e(this.$getMediationNetwork, this.$AFAdRevenueData, this.$getCurrencyIso4217Code, this.$getRevenue, this.$getMonetizationNetwork, this.$areAllFieldsValid, this.$component2);
        }

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ Object invoke(Object obj) {
            getRevenue((AFg1gSDK) obj);
            return Unit.f41027a;
        }
    }

    @Metadata
    /* renamed from: com.appsflyer.AFLogger$3, reason: invalid class name */
    static final class AnonymousClass3 extends s implements Function0<ExecutorService> {
        public static final AnonymousClass3 getMediationNetwork = new AnonymousClass3();

        AnonymousClass3() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: getMonetizationNetwork, reason: merged with bridge method [inline-methods] */
        public final ExecutorService invoke() {
            return Executors.newSingleThreadExecutor();
        }
    }

    @Metadata
    /* renamed from: com.appsflyer.AFLogger$4, reason: invalid class name */
    static final class AnonymousClass4 extends s implements Function1<AFg1gSDK, Unit> {
        private /* synthetic */ AFg1cSDK $getMediationNetwork;
        private /* synthetic */ String $getRevenue;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass4(AFg1cSDK aFg1cSDK, String str) {
            super(1);
            this.$getMediationNetwork = aFg1cSDK;
            this.$getRevenue = str;
        }

        public final void getMediationNetwork(AFg1gSDK aFg1gSDK) {
            Intrinsics.checkNotNullParameter(aFg1gSDK, "");
            aFg1gSDK.force(this.$getMediationNetwork, this.$getRevenue);
        }

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ Object invoke(Object obj) {
            getMediationNetwork((AFg1gSDK) obj);
            return Unit.f41027a;
        }
    }

    @Metadata
    /* renamed from: com.appsflyer.AFLogger$5, reason: invalid class name */
    static final class AnonymousClass5 extends s implements Function1<AFg1gSDK, Unit> {
        private /* synthetic */ AFg1cSDK $getCurrencyIso4217Code;
        private /* synthetic */ boolean $getMonetizationNetwork;
        private /* synthetic */ String $getRevenue;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass5(AFg1cSDK aFg1cSDK, String str, boolean z4) {
            super(1);
            this.$getCurrencyIso4217Code = aFg1cSDK;
            this.$getRevenue = str;
            this.$getMonetizationNetwork = z4;
        }

        public final void AFAdRevenueData(AFg1gSDK aFg1gSDK) {
            Intrinsics.checkNotNullParameter(aFg1gSDK, "");
            aFg1gSDK.i(this.$getCurrencyIso4217Code, this.$getRevenue, this.$getMonetizationNetwork);
        }

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ Object invoke(Object obj) {
            AFAdRevenueData((AFg1gSDK) obj);
            return Unit.f41027a;
        }
    }

    @Metadata
    /* renamed from: com.appsflyer.AFLogger$6, reason: invalid class name */
    static final class AnonymousClass6 extends s implements Function1<AFg1gSDK, Unit> {
        private /* synthetic */ AFg1cSDK $getMediationNetwork;
        private /* synthetic */ boolean $getMonetizationNetwork;
        private /* synthetic */ String $getRevenue;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass6(AFg1cSDK aFg1cSDK, String str, boolean z4) {
            super(1);
            this.$getMediationNetwork = aFg1cSDK;
            this.$getRevenue = str;
            this.$getMonetizationNetwork = z4;
        }

        public final void getMonetizationNetwork(AFg1gSDK aFg1gSDK) {
            Intrinsics.checkNotNullParameter(aFg1gSDK, "");
            aFg1gSDK.v(this.$getMediationNetwork, this.$getRevenue, this.$getMonetizationNetwork);
        }

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ Object invoke(Object obj) {
            getMonetizationNetwork((AFg1gSDK) obj);
            return Unit.f41027a;
        }
    }

    @Metadata
    /* renamed from: com.appsflyer.AFLogger$8, reason: invalid class name */
    static final class AnonymousClass8 extends s implements Function0<Set<AFg1gSDK>> {
        public static final AnonymousClass8 getMediationNetwork = new AnonymousClass8();

        AnonymousClass8() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: AFAdRevenueData, reason: merged with bridge method [inline-methods] */
        public final Set<AFg1gSDK> invoke() {
            return Collections.synchronizedSet(new LinkedHashSet());
        }
    }

    @Metadata
    /* renamed from: com.appsflyer.AFLogger$9, reason: invalid class name */
    static final class AnonymousClass9 extends s implements Function1<AFg1gSDK, Unit> {
        private /* synthetic */ boolean $AFAdRevenueData;
        private /* synthetic */ String $getMonetizationNetwork;
        private /* synthetic */ AFg1cSDK $getRevenue;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass9(AFg1cSDK aFg1cSDK, String str, boolean z4) {
            super(1);
            this.$getRevenue = aFg1cSDK;
            this.$getMonetizationNetwork = str;
            this.$AFAdRevenueData = z4;
        }

        public final void getCurrencyIso4217Code(AFg1gSDK aFg1gSDK) {
            Intrinsics.checkNotNullParameter(aFg1gSDK, "");
            aFg1gSDK.w(this.$getRevenue, this.$getMonetizationNetwork, this.$AFAdRevenueData);
        }

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ Object invoke(Object obj) {
            getCurrencyIso4217Code((AFg1gSDK) obj);
            return Unit.f41027a;
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

        LogLevel(int i4) {
            this.level = i4;
        }

        public final int getLevel() {
            return this.level;
        }
    }

    private AFLogger() {
    }

    public static final void afDebugLog(String str, boolean z4) {
        Intrinsics.checkNotNullParameter(str, "");
        INSTANCE.d(AFg1cSDK.OTHER, str, z4);
    }

    public static final void afErrorLog(String str, Throwable th, boolean z4, boolean z5, boolean z6) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(th, "");
        AFg1gSDK.e$default(INSTANCE, AFg1cSDK.OTHER, str, th, z4, z5, z6, false, 64, null);
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
        AFg1gSDK.e$default(aFLogger, aFg1cSDK, str2, th, false, false, true, false, 64, null);
    }

    public static final void afInfoLog(String str, boolean z4) {
        Intrinsics.checkNotNullParameter(str, "");
        INSTANCE.i(AFg1cSDK.OTHER, str, z4);
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

    public static final void afWarnLog(String str, boolean z4) {
        Intrinsics.checkNotNullParameter(str, "");
        INSTANCE.w(AFg1cSDK.OTHER, str, z4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void getCurrencyIso4217Code(AFg1gSDK[] aFg1gSDKArr) {
        Intrinsics.checkNotNullParameter(aFg1gSDKArr, "");
        h hVar = getMediationNetwork;
        Object value = hVar.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "");
        synchronized (((Set) value)) {
            Object value2 = hVar.getValue();
            Intrinsics.checkNotNullExpressionValue(value2, "");
            ((Set) value2).removeAll(AbstractC3219i.P0(aFg1gSDKArr));
            Unit unit = Unit.f41027a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void getMediationNetwork(AFg1gSDK[] aFg1gSDKArr) {
        Intrinsics.checkNotNullParameter(aFg1gSDKArr, "");
        h hVar = getMediationNetwork;
        Object value = hVar.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "");
        synchronized (((Set) value)) {
            Object value2 = hVar.getValue();
            Intrinsics.checkNotNullExpressionValue(value2, "");
            CollectionsKt.addAll((Set) value2, aFg1gSDKArr);
            Unit unit = Unit.f41027a;
        }
    }

    @Override // com.appsflyer.internal.AFg1gSDK
    public final void d(AFg1cSDK aFg1cSDK, String str, boolean z4) {
        Intrinsics.checkNotNullParameter(aFg1cSDK, "");
        Intrinsics.checkNotNullParameter(str, "");
        ((ExecutorService) getRevenue.getValue()).execute(new a(new AnonymousClass1(aFg1cSDK, str, z4)));
    }

    @Override // com.appsflyer.internal.AFg1gSDK
    public final void e(AFg1cSDK aFg1cSDK, String str, Throwable th, boolean z4, boolean z5, boolean z6, boolean z7) {
        Intrinsics.checkNotNullParameter(aFg1cSDK, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(th, "");
        ((ExecutorService) getRevenue.getValue()).execute(new a(new AnonymousClass2(aFg1cSDK, str, th, z4, z5, z6, z7)));
    }

    @Override // com.appsflyer.internal.AFg1gSDK
    public final void force(AFg1cSDK aFg1cSDK, String str) {
        Intrinsics.checkNotNullParameter(aFg1cSDK, "");
        Intrinsics.checkNotNullParameter(str, "");
        ((ExecutorService) getRevenue.getValue()).execute(new a(new AnonymousClass4(aFg1cSDK, str)));
    }

    @Override // com.appsflyer.internal.AFg1gSDK
    public final void i(AFg1cSDK aFg1cSDK, String str, boolean z4) {
        Intrinsics.checkNotNullParameter(aFg1cSDK, "");
        Intrinsics.checkNotNullParameter(str, "");
        ((ExecutorService) getRevenue.getValue()).execute(new a(new AnonymousClass5(aFg1cSDK, str, z4)));
    }

    public final void registerClient(final AFg1gSDK... aFg1gSDKArr) {
        Intrinsics.checkNotNullParameter(aFg1gSDKArr, "");
        ((ExecutorService) getRevenue.getValue()).execute(new Runnable() { // from class: com.appsflyer.b
            @Override // java.lang.Runnable
            public final void run() {
                AFLogger.getMediationNetwork(aFg1gSDKArr);
            }
        });
    }

    public final void unregisterClient(final AFg1gSDK... aFg1gSDKArr) {
        Intrinsics.checkNotNullParameter(aFg1gSDKArr, "");
        ((ExecutorService) getRevenue.getValue()).execute(new Runnable() { // from class: com.appsflyer.c
            @Override // java.lang.Runnable
            public final void run() {
                AFLogger.getCurrencyIso4217Code(aFg1gSDKArr);
            }
        });
    }

    @Override // com.appsflyer.internal.AFg1gSDK
    public final void v(AFg1cSDK aFg1cSDK, String str, boolean z4) {
        Intrinsics.checkNotNullParameter(aFg1cSDK, "");
        Intrinsics.checkNotNullParameter(str, "");
        ((ExecutorService) getRevenue.getValue()).execute(new a(new AnonymousClass6(aFg1cSDK, str, z4)));
    }

    @Override // com.appsflyer.internal.AFg1gSDK
    public final void w(AFg1cSDK aFg1cSDK, String str, boolean z4) {
        Intrinsics.checkNotNullParameter(aFg1cSDK, "");
        Intrinsics.checkNotNullParameter(str, "");
        ((ExecutorService) getRevenue.getValue()).execute(new a(new AnonymousClass9(aFg1cSDK, str, z4)));
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
        AFg1gSDK.w$default(INSTANCE, AFg1cSDK.OTHER, str, false, 4, null);
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
        AFg1gSDK.e$default(aFLogger, aFg1cSDK, str2, th, false, false, false, false, 120, null);
    }

    public static final void afErrorLogForExcManagerOnly(String str, Throwable th, boolean z4) {
        AFLogger aFLogger = INSTANCE;
        AFg1cSDK aFg1cSDK = AFg1cSDK.OTHER;
        if (str == null || StringsKt.z(str)) {
            str = "null";
        }
        String str2 = str;
        if (th == null) {
            th = new NullPointerException("Invoked with null Throwable");
        }
        AFg1gSDK.e$default(aFLogger, aFg1cSDK, str2, th, false, false, !z4, false, 64, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void getMediationNetwork(Function1 function1) {
        Intrinsics.checkNotNullParameter(function1, "");
        h hVar = getMediationNetwork;
        Object value = hVar.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "");
        synchronized (((Set) value)) {
            try {
                Object value2 = hVar.getValue();
                Intrinsics.checkNotNullExpressionValue(value2, "");
                Iterator it = ((Set) value2).iterator();
                while (it.hasNext()) {
                    function1.invoke((AFg1gSDK) it.next());
                }
                Unit unit = Unit.f41027a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static final void afErrorLog(String str, Throwable th, boolean z4) {
        AFLogger aFLogger = INSTANCE;
        AFg1cSDK aFg1cSDK = AFg1cSDK.OTHER;
        if (str == null || StringsKt.z(str)) {
            str = "null";
        }
        String str2 = str;
        if (th == null) {
            th = new NullPointerException("Invoked with null Throwable");
        }
        AFg1gSDK.e$default(aFLogger, aFg1cSDK, str2, th, false, z4, false, false, 104, null);
    }

    public static final void afErrorLog(String str, Throwable th, boolean z4, boolean z5) {
        AFLogger aFLogger = INSTANCE;
        AFg1cSDK aFg1cSDK = AFg1cSDK.OTHER;
        if (str == null || StringsKt.z(str)) {
            str = "null";
        }
        String str2 = str;
        if (th == null) {
            th = new NullPointerException("Invoked with null Throwable");
        }
        AFg1gSDK.e$default(aFLogger, aFg1cSDK, str2, th, false, z4, z5, false, 72, null);
    }
}
