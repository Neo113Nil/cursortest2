package com.yandex.mobile.ads.impl;

import a2.AbstractC1241b;
import android.os.Looper;
import com.huawei.hms.adapter.internal.AvailableCode;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import o2.AbstractC3337k;
import o2.InterfaceC3316J;
import o2.InterfaceC3359v0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: com.yandex.mobile.ads.impl.td, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2251td {

    /* renamed from: j, reason: collision with root package name */
    @NotNull
    private static final Object f32294j = new Object();

    /* renamed from: k, reason: collision with root package name */
    @Nullable
    private static volatile C2251td f32295k;

    /* renamed from: l, reason: collision with root package name */
    public static final /* synthetic */ int f32296l = 0;

    /* renamed from: a, reason: collision with root package name */
    private final long f32297a;

    /* renamed from: b, reason: collision with root package name */
    private final long f32298b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final Set<u50> f32299c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final InterfaceC3316J f32300d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final C2205rd f32301e;

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    private final C2228sd f32302f;

    /* renamed from: g, reason: collision with root package name */
    @NotNull
    private final m42 f32303g;

    /* renamed from: h, reason: collision with root package name */
    @NotNull
    private final du f32304h;

    /* renamed from: i, reason: collision with root package name */
    @NotNull
    private final AtomicBoolean f32305i;

    @kotlin.coroutines.jvm.internal.f(c = "com.monetization.ads.core.anr.AnrTracker$startTracking$1", f = "AnrTracker.kt", l = {29, AvailableCode.USER_ALREADY_KNOWS_SERVICE_UNAVAILABLE}, m = "invokeSuspend")
    /* renamed from: com.yandex.mobile.ads.impl.td$a */
    static final class a extends kotlin.coroutines.jvm.internal.l implements Function2<InterfaceC3316J, kotlin.coroutines.d, Object> {

        /* renamed from: b, reason: collision with root package name */
        int f32306b;

        a(kotlin.coroutines.d dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @NotNull
        public final kotlin.coroutines.d create(@Nullable Object obj, @NotNull kotlin.coroutines.d dVar) {
            return C2251td.this.new a(dVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return C2251td.this.new a((kotlin.coroutines.d) obj2).invokeSuspend(Unit.f41027a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:12:0x0047, code lost:
        
            if (o2.U.a(r4, r6) == r0) goto L18;
         */
        /* JADX WARN: Code restructure failed: missing block: B:14:0x0030, code lost:
        
            if (r7 == r0) goto L18;
         */
        /* JADX WARN: Code restructure failed: missing block: B:15:0x0049, code lost:
        
            return r0;
         */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x0047 -> B:13:0x001e). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(@NotNull Object obj) {
            Object f4 = AbstractC1241b.f();
            int i4 = this.f32306b;
            if (i4 != 0) {
                if (i4 == 1) {
                    ResultKt.a(obj);
                    if (!((Boolean) obj).booleanValue()) {
                        C2251td.f(C2251td.this);
                        return Unit.f41027a;
                    }
                    long j4 = C2251td.this.f32297a;
                    this.f32306b = 2;
                } else if (i4 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
            ResultKt.a(obj);
            C2205rd c2205rd = C2251td.this.f32301e;
            long j5 = C2251td.this.f32298b;
            this.f32306b = 1;
            obj = c2205rd.a(j5, this);
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.td$b */
    static final class b extends kotlin.jvm.internal.s implements Function1<Throwable, Unit> {
        b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            C2251td.this.f32305i.set(false);
            return Unit.f41027a;
        }
    }

    private C2251td(long j4, long j5, Set<u50> set, InterfaceC3316J interfaceC3316J, C2205rd c2205rd, C2228sd c2228sd, m42 m42Var) {
        this.f32297a = j4;
        this.f32298b = j5;
        this.f32299c = set;
        this.f32300d = interfaceC3316J;
        this.f32301e = c2205rd;
        this.f32302f = c2228sd;
        this.f32303g = m42Var;
        this.f32304h = new du();
        this.f32305i = new AtomicBoolean(false);
    }

    public static final void f(C2251td c2251td) {
        c2251td.f32303g.getClass();
        Map<Thread, StackTraceElement[]> allStackTraces = Thread.getAllStackTraces();
        Intrinsics.checkNotNullExpressionValue(allStackTraces, "getAllStackTraces(...)");
        StackTraceElement[] stackTraceElementArr = allStackTraces.get(Looper.getMainLooper().getThread());
        if (stackTraceElementArr == null || !y12.a(stackTraceElementArr, c2251td.f32299c)) {
            return;
        }
        c2251td.f32302f.a(allStackTraces);
    }

    public final void c() {
        InterfaceC3359v0 d4;
        if (this.f32305i.getAndSet(true)) {
            return;
        }
        d4 = AbstractC3337k.d(this.f32300d, this.f32304h, null, new a(null), 2, null);
        d4.invokeOnCompletion(new b());
    }

    public /* synthetic */ C2251td(long j4, long j5, Set set, InterfaceC3316J interfaceC3316J, C2205rd c2205rd, C2228sd c2228sd, m42 m42Var, int i4) {
        this(j4, j5, set, interfaceC3316J, c2205rd, c2228sd, m42Var);
    }
}
