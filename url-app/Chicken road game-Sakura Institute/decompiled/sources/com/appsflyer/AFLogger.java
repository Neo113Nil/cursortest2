package com.appsflyer;

import C.t;
import M2.p;
import com.appsflyer.internal.AFg1aSDK;
import com.appsflyer.internal.AFg1fSDK;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.y;
import y2.C1336k;
import y2.InterfaceC1329d;
import y2.InterfaceC1335j;
import z2.C1436t;
import z2.C1439w;

@Metadata
/* loaded from: classes.dex */
public final class AFLogger extends AFg1fSDK {
    public static final AFLogger INSTANCE = new AFLogger();
    private static final InterfaceC1335j valueOf = C1336k.a(AnonymousClass10.values);
    private static final InterfaceC1335j AFInAppEventType = C1336k.a(AnonymousClass1.AFKeystoreWrapper);

    @Metadata
    /* renamed from: com.appsflyer.AFLogger$1, reason: invalid class name */
    public static final class AnonymousClass1 extends p implements Function0<ExecutorService> {
        public static final AnonymousClass1 AFKeystoreWrapper = new AnonymousClass1();

        public AnonymousClass1() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: AFKeystoreWrapper, reason: merged with bridge method [inline-methods] */
        public final ExecutorService invoke() {
            return Executors.newSingleThreadExecutor();
        }
    }

    @Metadata
    /* renamed from: com.appsflyer.AFLogger$10, reason: invalid class name */
    public static final class AnonymousClass10 extends p implements Function0<Set<AFg1fSDK>> {
        public static final AnonymousClass10 values = new AnonymousClass10();

        public AnonymousClass10() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: AFKeystoreWrapper, reason: merged with bridge method [inline-methods] */
        public final Set<AFg1fSDK> invoke() {
            return Collections.synchronizedSet(new LinkedHashSet());
        }
    }

    @Metadata
    /* renamed from: com.appsflyer.AFLogger$2, reason: invalid class name */
    public static final class AnonymousClass2 extends p implements Function1<AFg1fSDK, Unit> {
        private /* synthetic */ boolean $AFInAppEventType;
        private /* synthetic */ String $AFKeystoreWrapper;
        private /* synthetic */ AFg1aSDK $values;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(AFg1aSDK aFg1aSDK, String str, boolean z4) {
            super(1);
            this.$values = aFg1aSDK;
            this.$AFKeystoreWrapper = str;
            this.$AFInAppEventType = z4;
        }

        public final void AFInAppEventType(AFg1fSDK aFg1fSDK) {
            Intrinsics.checkNotNullParameter(aFg1fSDK, "");
            aFg1fSDK.i(this.$values, this.$AFKeystoreWrapper, this.$AFInAppEventType);
        }

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ Object invoke(Object obj) {
            AFInAppEventType((AFg1fSDK) obj);
            return Unit.f7487a;
        }
    }

    @Metadata
    /* renamed from: com.appsflyer.AFLogger$3, reason: invalid class name */
    public static final class AnonymousClass3 extends p implements Function1<AFg1fSDK, Unit> {
        private /* synthetic */ boolean $AFInAppEventParameterName;
        private /* synthetic */ boolean $AFInAppEventType;
        private /* synthetic */ Throwable $AFKeystoreWrapper;
        private /* synthetic */ boolean $AFLogger;
        private /* synthetic */ boolean $e;
        private /* synthetic */ String $valueOf;
        private /* synthetic */ AFg1aSDK $values;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(AFg1aSDK aFg1aSDK, String str, Throwable th, boolean z4, boolean z5, boolean z6, boolean z7) {
            super(1);
            this.$values = aFg1aSDK;
            this.$valueOf = str;
            this.$AFKeystoreWrapper = th;
            this.$AFInAppEventParameterName = z4;
            this.$AFInAppEventType = z5;
            this.$AFLogger = z6;
            this.$e = z7;
        }

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ Object invoke(Object obj) {
            valueOf((AFg1fSDK) obj);
            return Unit.f7487a;
        }

        public final void valueOf(AFg1fSDK aFg1fSDK) {
            Intrinsics.checkNotNullParameter(aFg1fSDK, "");
            aFg1fSDK.e(this.$values, this.$valueOf, this.$AFKeystoreWrapper, this.$AFInAppEventParameterName, this.$AFInAppEventType, this.$AFLogger, this.$e);
        }
    }

    @Metadata
    /* renamed from: com.appsflyer.AFLogger$4, reason: invalid class name */
    public static final class AnonymousClass4 extends p implements Function1<AFg1fSDK, Unit> {
        private /* synthetic */ AFg1aSDK $AFKeystoreWrapper;
        private /* synthetic */ String $values;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass4(AFg1aSDK aFg1aSDK, String str) {
            super(1);
            this.$AFKeystoreWrapper = aFg1aSDK;
            this.$values = str;
        }

        public final void AFKeystoreWrapper(AFg1fSDK aFg1fSDK) {
            Intrinsics.checkNotNullParameter(aFg1fSDK, "");
            aFg1fSDK.force(this.$AFKeystoreWrapper, this.$values);
        }

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ Object invoke(Object obj) {
            AFKeystoreWrapper((AFg1fSDK) obj);
            return Unit.f7487a;
        }
    }

    @Metadata
    /* renamed from: com.appsflyer.AFLogger$5, reason: invalid class name */
    public static final class AnonymousClass5 extends p implements Function1<AFg1fSDK, Unit> {
        private /* synthetic */ boolean $AFInAppEventParameterName;
        private /* synthetic */ AFg1aSDK $AFKeystoreWrapper;
        private /* synthetic */ String $valueOf;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass5(AFg1aSDK aFg1aSDK, String str, boolean z4) {
            super(1);
            this.$AFKeystoreWrapper = aFg1aSDK;
            this.$valueOf = str;
            this.$AFInAppEventParameterName = z4;
        }

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ Object invoke(Object obj) {
            valueOf((AFg1fSDK) obj);
            return Unit.f7487a;
        }

        public final void valueOf(AFg1fSDK aFg1fSDK) {
            Intrinsics.checkNotNullParameter(aFg1fSDK, "");
            aFg1fSDK.d(this.$AFKeystoreWrapper, this.$valueOf, this.$AFInAppEventParameterName);
        }
    }

    @Metadata
    /* renamed from: com.appsflyer.AFLogger$7, reason: invalid class name */
    public static final class AnonymousClass7 extends p implements Function1<AFg1fSDK, Unit> {
        private /* synthetic */ AFg1aSDK $AFInAppEventParameterName;
        private /* synthetic */ String $AFInAppEventType;
        private /* synthetic */ boolean $values;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass7(AFg1aSDK aFg1aSDK, String str, boolean z4) {
            super(1);
            this.$AFInAppEventParameterName = aFg1aSDK;
            this.$AFInAppEventType = str;
            this.$values = z4;
        }

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ Object invoke(Object obj) {
            valueOf((AFg1fSDK) obj);
            return Unit.f7487a;
        }

        public final void valueOf(AFg1fSDK aFg1fSDK) {
            Intrinsics.checkNotNullParameter(aFg1fSDK, "");
            aFg1fSDK.v(this.$AFInAppEventParameterName, this.$AFInAppEventType, this.$values);
        }
    }

    @Metadata
    /* renamed from: com.appsflyer.AFLogger$9, reason: invalid class name */
    public static final class AnonymousClass9 extends p implements Function1<AFg1fSDK, Unit> {
        private /* synthetic */ boolean $AFInAppEventParameterName;
        private /* synthetic */ String $AFKeystoreWrapper;
        private /* synthetic */ AFg1aSDK $values;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass9(AFg1aSDK aFg1aSDK, String str, boolean z4) {
            super(1);
            this.$values = aFg1aSDK;
            this.$AFKeystoreWrapper = str;
            this.$AFInAppEventParameterName = z4;
        }

        public final void AFInAppEventParameterName(AFg1fSDK aFg1fSDK) {
            Intrinsics.checkNotNullParameter(aFg1fSDK, "");
            aFg1fSDK.w(this.$values, this.$AFKeystoreWrapper, this.$AFInAppEventParameterName);
        }

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ Object invoke(Object obj) {
            AFInAppEventParameterName((AFg1fSDK) obj);
            return Unit.f7487a;
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

        private final int values;

        LogLevel(int i2) {
            this.values = i2;
        }

        public final int getLevel() {
            return this.values;
        }
    }

    private AFLogger() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void AFInAppEventType(AFg1fSDK[] elements) {
        Intrinsics.checkNotNullParameter(elements, "");
        InterfaceC1335j interfaceC1335j = valueOf;
        Object value = interfaceC1335j.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "");
        synchronized (((Set) value)) {
            Object value2 = interfaceC1335j.getValue();
            Intrinsics.checkNotNullExpressionValue(value2, "");
            Set set = (Set) value2;
            Intrinsics.checkNotNullParameter(set, "<this>");
            Intrinsics.checkNotNullParameter(elements, "elements");
            set.addAll(C1436t.b(elements));
            Unit unit = Unit.f7487a;
        }
    }

    @InterfaceC1329d
    public static final void afDebugLog(String str, boolean z4) {
        Intrinsics.checkNotNullParameter(str, "");
        INSTANCE.d(AFg1aSDK.OTHER, str, z4);
    }

    @InterfaceC1329d
    public static final void afErrorLog(String str, Throwable th, boolean z4, boolean z5, boolean z6) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(th, "");
        AFg1fSDK.e$default(INSTANCE, AFg1aSDK.OTHER, str, th, z4, z5, z6, false, 64, null);
    }

    @InterfaceC1329d
    public static final void afErrorLogForExcManagerOnly(String str, Throwable th) {
        AFLogger aFLogger = INSTANCE;
        AFg1aSDK aFg1aSDK = AFg1aSDK.OTHER;
        if (str == null || y.x(str)) {
            str = "null";
        }
        String str2 = str;
        if (th == null) {
            th = new NullPointerException("Invoked with null Throwable");
        }
        AFg1fSDK.e$default(aFLogger, aFg1aSDK, str2, th, false, false, true, false, 64, null);
    }

    @InterfaceC1329d
    public static final void afInfoLog(String str, boolean z4) {
        Intrinsics.checkNotNullParameter(str, "");
        INSTANCE.i(AFg1aSDK.OTHER, str, z4);
    }

    @InterfaceC1329d
    public static final void afLogForce(String str) {
        Intrinsics.checkNotNullParameter(str, "");
        INSTANCE.force(AFg1aSDK.OTHER, str);
    }

    @InterfaceC1329d
    public static final void afRDLog(String str) {
        Intrinsics.checkNotNullParameter(str, "");
        INSTANCE.v(AFg1aSDK.OTHER, str, true);
    }

    @InterfaceC1329d
    public static final void afVerboseLog(String str) {
        Intrinsics.checkNotNullParameter(str, "");
        INSTANCE.v(AFg1aSDK.OTHER, str, false);
    }

    @InterfaceC1329d
    public static final void afWarnLog(String str, boolean z4) {
        Intrinsics.checkNotNullParameter(str, "");
        INSTANCE.w(AFg1aSDK.OTHER, str, z4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void valueOf(AFg1fSDK[] aFg1fSDKArr) {
        Intrinsics.checkNotNullParameter(aFg1fSDKArr, "");
        InterfaceC1335j interfaceC1335j = valueOf;
        Object value = interfaceC1335j.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "");
        synchronized (((Set) value)) {
            Object value2 = interfaceC1335j.getValue();
            Intrinsics.checkNotNullExpressionValue(value2, "");
            ((Set) value2).removeAll(C1439w.A(aFg1fSDKArr));
            Unit unit = Unit.f7487a;
        }
    }

    @Override // com.appsflyer.internal.AFg1fSDK
    public final void d(AFg1aSDK aFg1aSDK, String str, boolean z4) {
        Intrinsics.checkNotNullParameter(aFg1aSDK, "");
        Intrinsics.checkNotNullParameter(str, "");
        ((ExecutorService) AFInAppEventType.getValue()).execute(new t(7, new AnonymousClass5(aFg1aSDK, str, z4)));
    }

    @Override // com.appsflyer.internal.AFg1fSDK
    public final void e(AFg1aSDK aFg1aSDK, String str, Throwable th, boolean z4, boolean z5, boolean z6, boolean z7) {
        Intrinsics.checkNotNullParameter(aFg1aSDK, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(th, "");
        ((ExecutorService) AFInAppEventType.getValue()).execute(new t(7, new AnonymousClass3(aFg1aSDK, str, th, z4, z5, z6, z7)));
    }

    @Override // com.appsflyer.internal.AFg1fSDK
    public final void force(AFg1aSDK aFg1aSDK, String str) {
        Intrinsics.checkNotNullParameter(aFg1aSDK, "");
        Intrinsics.checkNotNullParameter(str, "");
        ((ExecutorService) AFInAppEventType.getValue()).execute(new t(7, new AnonymousClass4(aFg1aSDK, str)));
    }

    @Override // com.appsflyer.internal.AFg1fSDK
    public final void i(AFg1aSDK aFg1aSDK, String str, boolean z4) {
        Intrinsics.checkNotNullParameter(aFg1aSDK, "");
        Intrinsics.checkNotNullParameter(str, "");
        ((ExecutorService) AFInAppEventType.getValue()).execute(new t(7, new AnonymousClass2(aFg1aSDK, str, z4)));
    }

    public final void registerClient(AFg1fSDK... aFg1fSDKArr) {
        Intrinsics.checkNotNullParameter(aFg1fSDKArr, "");
        ((ExecutorService) AFInAppEventType.getValue()).execute(new a(aFg1fSDKArr, 1));
    }

    public final void unregisterClient(AFg1fSDK... aFg1fSDKArr) {
        Intrinsics.checkNotNullParameter(aFg1fSDKArr, "");
        ((ExecutorService) AFInAppEventType.getValue()).execute(new a(aFg1fSDKArr, 0));
    }

    @Override // com.appsflyer.internal.AFg1fSDK
    public final void v(AFg1aSDK aFg1aSDK, String str, boolean z4) {
        Intrinsics.checkNotNullParameter(aFg1aSDK, "");
        Intrinsics.checkNotNullParameter(str, "");
        ((ExecutorService) AFInAppEventType.getValue()).execute(new t(7, new AnonymousClass7(aFg1aSDK, str, z4)));
    }

    @Override // com.appsflyer.internal.AFg1fSDK
    public final void w(AFg1aSDK aFg1aSDK, String str, boolean z4) {
        Intrinsics.checkNotNullParameter(aFg1aSDK, "");
        Intrinsics.checkNotNullParameter(str, "");
        ((ExecutorService) AFInAppEventType.getValue()).execute(new t(7, new AnonymousClass9(aFg1aSDK, str, z4)));
    }

    @InterfaceC1329d
    public static final void afDebugLog(String str) {
        Intrinsics.checkNotNullParameter(str, "");
        INSTANCE.d(AFg1aSDK.OTHER, str, true);
    }

    @InterfaceC1329d
    public static final void afInfoLog(String str) {
        Intrinsics.checkNotNullParameter(str, "");
        INSTANCE.i(AFg1aSDK.OTHER, str, true);
    }

    @InterfaceC1329d
    public static final void afWarnLog(String str) {
        Intrinsics.checkNotNullParameter(str, "");
        AFg1fSDK.w$default(INSTANCE, AFg1aSDK.OTHER, str, false, 4, null);
    }

    @InterfaceC1329d
    public static final void afErrorLog(String str, Throwable th) {
        AFLogger aFLogger = INSTANCE;
        AFg1aSDK aFg1aSDK = AFg1aSDK.OTHER;
        if (str == null || y.x(str)) {
            str = "null";
        }
        String str2 = str;
        if (th == null) {
            th = new NullPointerException("Invoked with null Throwable");
        }
        AFg1fSDK.e$default(aFLogger, aFg1aSDK, str2, th, false, false, false, false, 120, null);
    }

    @InterfaceC1329d
    public static final void afErrorLogForExcManagerOnly(String str, Throwable th, boolean z4) {
        AFLogger aFLogger = INSTANCE;
        AFg1aSDK aFg1aSDK = AFg1aSDK.OTHER;
        if (str == null || y.x(str)) {
            str = "null";
        }
        String str2 = str;
        if (th == null) {
            th = new NullPointerException("Invoked with null Throwable");
        }
        AFg1fSDK.e$default(aFLogger, aFg1aSDK, str2, th, false, false, !z4, false, 64, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void AFInAppEventType(Function1 function1) {
        Intrinsics.checkNotNullParameter(function1, "");
        InterfaceC1335j interfaceC1335j = valueOf;
        Object value = interfaceC1335j.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "");
        synchronized (((Set) value)) {
            try {
                Object value2 = interfaceC1335j.getValue();
                Intrinsics.checkNotNullExpressionValue(value2, "");
                Iterator it = ((Set) value2).iterator();
                while (it.hasNext()) {
                    function1.invoke((AFg1fSDK) it.next());
                }
                Unit unit = Unit.f7487a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @InterfaceC1329d
    public static final void afErrorLog(String str, Throwable th, boolean z4) {
        AFLogger aFLogger = INSTANCE;
        AFg1aSDK aFg1aSDK = AFg1aSDK.OTHER;
        if (str == null || y.x(str)) {
            str = "null";
        }
        String str2 = str;
        if (th == null) {
            th = new NullPointerException("Invoked with null Throwable");
        }
        AFg1fSDK.e$default(aFLogger, aFg1aSDK, str2, th, false, z4, false, false, 104, null);
    }

    @InterfaceC1329d
    public static final void afErrorLog(String str, Throwable th, boolean z4, boolean z5) {
        AFLogger aFLogger = INSTANCE;
        AFg1aSDK aFg1aSDK = AFg1aSDK.OTHER;
        if (str == null || y.x(str)) {
            str = "null";
        }
        String str2 = str;
        if (th == null) {
            th = new NullPointerException("Invoked with null Throwable");
        }
        AFg1fSDK.e$default(aFLogger, aFg1aSDK, str2, th, false, z4, z5, false, 72, null);
    }
}
