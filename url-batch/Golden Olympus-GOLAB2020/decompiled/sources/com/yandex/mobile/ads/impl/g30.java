package com.yandex.mobile.ads.impl;

import a2.AbstractC1241b;
import android.content.Context;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.yandex.mobile.ads.impl.l82;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import o2.AbstractC3313G;
import o2.AbstractC3333i;
import o2.InterfaceC3316J;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class g30 {

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private static final AtomicBoolean f25984e = new AtomicBoolean(true);

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final C2105n4 f25985a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final Context f25986b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final C2264u3 f25987c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final of0 f25988d;

    @kotlin.coroutines.jvm.internal.f(c = "com.monetization.ads.base.dns.DnsPrefetcher", f = "DnsPrefetcher.kt", l = {AvailableCode.APP_IS_BACKGROUND_OR_LOCKED}, m = "prefetch")
    static final class a extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: b, reason: collision with root package name */
        C2105n4 f25989b;

        /* renamed from: c, reason: collision with root package name */
        EnumC2082m4 f25990c;

        /* renamed from: d, reason: collision with root package name */
        /* synthetic */ Object f25991d;

        /* renamed from: f, reason: collision with root package name */
        int f25993f;

        a(kotlin.coroutines.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f25991d = obj;
            this.f25993f |= Integer.MIN_VALUE;
            return g30.this.a(this);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.monetization.ads.base.dns.DnsPrefetcher$prefetch$2$1", f = "DnsPrefetcher.kt", l = {34}, m = "invokeSuspend")
    static final class b extends kotlin.coroutines.jvm.internal.l implements Function2<InterfaceC3316J, kotlin.coroutines.d, Object> {

        /* renamed from: b, reason: collision with root package name */
        int f25994b;

        b(kotlin.coroutines.d dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @NotNull
        public final kotlin.coroutines.d create(@Nullable Object obj, @NotNull kotlin.coroutines.d dVar) {
            return g30.this.new b(dVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return g30.this.new b((kotlin.coroutines.d) obj2).invokeSuspend(Unit.f41027a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object f4 = AbstractC1241b.f();
            int i4 = this.f25994b;
            if (i4 == 0) {
                ResultKt.a(obj);
                List a4 = g30.a(g30.this);
                if (a4.isEmpty()) {
                    ap0.a(new Object[0]);
                    return Unit.f41027a;
                }
                g30 g30Var = g30.this;
                this.f25994b = 1;
                g30Var.getClass();
                Object c4 = o2.W0.c(2500L, new h30(g30Var, a4, null), this);
                if (c4 != AbstractC1241b.f()) {
                    c4 = Unit.f41027a;
                }
                if (c4 == f4) {
                    return f4;
                }
            } else {
                if (i4 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.a(obj);
            }
            return Unit.f41027a;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ g30(Context context, C2105n4 c2105n4) {
        this(context, c2105n4, r3, new C2264u3(), new of0());
        Context applicationContext = context.getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
    }

    public static final List a(g30 g30Var) {
        g30Var.getClass();
        List createListBuilder = CollectionsKt.createListBuilder();
        l82.a aVar = l82.f28461a;
        String a4 = g30Var.f25987c.a(g30Var.f25986b);
        aVar.getClass();
        String a5 = l82.a.a(a4);
        if (a5 != null) {
            createListBuilder.add(a5);
        }
        return CollectionsKt.build(createListBuilder);
    }

    public g30(@NotNull Context context, @NotNull C2105n4 adLoadingPhasesManager, @NotNull Context appContext, @NotNull C2264u3 adHostConfigurator, @NotNull of0 hostReachabilityRepository) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(adLoadingPhasesManager, "adLoadingPhasesManager");
        Intrinsics.checkNotNullParameter(appContext, "appContext");
        Intrinsics.checkNotNullParameter(adHostConfigurator, "adHostConfigurator");
        Intrinsics.checkNotNullParameter(hostReachabilityRepository, "hostReachabilityRepository");
        this.f25985a = adLoadingPhasesManager;
        this.f25986b = appContext;
        this.f25987c = adHostConfigurator;
        this.f25988d = hostReachabilityRepository;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(@NotNull kotlin.coroutines.d dVar) {
        a aVar;
        int i4;
        C2105n4 c2105n4;
        Throwable th;
        EnumC2082m4 enumC2082m4;
        if (dVar instanceof a) {
            aVar = (a) dVar;
            int i5 = aVar.f25993f;
            if ((i5 & Integer.MIN_VALUE) != 0) {
                aVar.f25993f = i5 - Integer.MIN_VALUE;
                Object obj = aVar.f25991d;
                Object f4 = AbstractC1241b.f();
                i4 = aVar.f25993f;
                if (i4 != 0) {
                    ResultKt.a(obj);
                    if (f25984e.getAndSet(false)) {
                        C2105n4 c2105n42 = this.f25985a;
                        EnumC2082m4 enumC2082m42 = EnumC2082m4.f28869z;
                        c2105n42.b(enumC2082m42);
                        try {
                            AbstractC3313G a4 = cu.a();
                            b bVar = new b(null);
                            aVar.f25989b = c2105n42;
                            aVar.f25990c = enumC2082m42;
                            aVar.f25993f = 1;
                            if (AbstractC3333i.g(a4, bVar, aVar) == f4) {
                                return f4;
                            }
                            c2105n4 = c2105n42;
                            enumC2082m4 = enumC2082m42;
                        } catch (Throwable th2) {
                            c2105n4 = c2105n42;
                            th = th2;
                            enumC2082m4 = enumC2082m42;
                            th.getMessage();
                            ap0.a(new Object[0]);
                            Unit unit = Unit.f41027a;
                            c2105n4.a(enumC2082m4);
                            return Unit.f41027a;
                        }
                    }
                    return Unit.f41027a;
                }
                if (i4 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                enumC2082m4 = aVar.f25990c;
                c2105n4 = aVar.f25989b;
                try {
                    ResultKt.a(obj);
                } catch (Throwable th3) {
                    th = th3;
                    th.getMessage();
                    ap0.a(new Object[0]);
                    Unit unit2 = Unit.f41027a;
                    c2105n4.a(enumC2082m4);
                    return Unit.f41027a;
                }
                Unit unit22 = Unit.f41027a;
                c2105n4.a(enumC2082m4);
                return Unit.f41027a;
            }
        }
        aVar = new a(dVar);
        Object obj2 = aVar.f25991d;
        Object f42 = AbstractC1241b.f();
        i4 = aVar.f25993f;
        if (i4 != 0) {
        }
        Unit unit222 = Unit.f41027a;
        c2105n4.a(enumC2082m4);
        return Unit.f41027a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a(String str) {
        if (this.f25988d.a(2000, str)) {
            ap0.a(new Object[0]);
        } else {
            ap0.a(new Object[0]);
        }
    }
}
