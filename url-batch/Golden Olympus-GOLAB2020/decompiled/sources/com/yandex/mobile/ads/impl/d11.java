package com.yandex.mobile.ads.impl;

import a2.AbstractC1241b;
import android.content.Context;
import com.yandex.mobile.ads.impl.a11;
import com.yandex.mobile.ads.impl.ew1;
import com.yandex.mobile.ads.impl.i11;
import com.yandex.mobile.ads.impl.s01;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import o2.AbstractC3337k;
import o2.InterfaceC3316J;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class d11 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    public static final d11 f24391a = new d11();

    static final class a extends kotlin.jvm.internal.s implements Function0<Unit> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Context f24392b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ vu1 f24393c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ ps f24394d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(Context context, vu1 vu1Var, ps psVar) {
            super(0);
            this.f24392b = context;
            this.f24393c = vu1Var;
            this.f24394d = psVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            d11.a(d11.f24391a, this.f24392b, this.f24393c, this.f24394d);
            return Unit.f41027a;
        }
    }

    static final class b extends kotlin.jvm.internal.s implements Function0<Unit> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Context f24395b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ vu1 f24396c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ ps f24397d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(Context context, vu1 vu1Var, ps psVar) {
            super(0);
            this.f24395b = context;
            this.f24396c = vu1Var;
            this.f24397d = psVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            d11.b(d11.f24391a, this.f24395b, this.f24396c, this.f24397d);
            return Unit.f41027a;
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.monetization.ads.core.provider.MobileAdsProvider$initializeStabilityTrackers$1", f = "MobileAdsProvider.kt", l = {}, m = "invokeSuspend")
    static final class c extends kotlin.coroutines.jvm.internal.l implements Function2<InterfaceC3316J, kotlin.coroutines.d, Object> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Context f24398b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ vu1 f24399c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(Context context, vu1 vu1Var, kotlin.coroutines.d dVar) {
            super(2, dVar);
            this.f24398b = context;
            this.f24399c = vu1Var;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @NotNull
        public final kotlin.coroutines.d create(@Nullable Object obj, @NotNull kotlin.coroutines.d dVar) {
            return new c(this.f24398b, this.f24399c, dVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return new c(this.f24398b, this.f24399c, (kotlin.coroutines.d) obj2).invokeSuspend(Unit.f41027a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            AbstractC1241b.f();
            ResultKt.a(obj);
            int i4 = v72.f33543c;
            v72.a(this.f24398b, this.f24399c.c());
            C2274ud.a(this.f24398b, this.f24399c.c());
            return Unit.f41027a;
        }
    }

    private d11() {
    }

    public static final void a(d11 d11Var, Context context, vu1 vu1Var, ps psVar) {
        d11Var.getClass();
        if (new C2209rh().a()) {
            return;
        }
        a(context, vu1Var);
        new jj2(new fl1()).a();
        new ts0(context).a();
        int i4 = s01.f31506h;
        s01.a.a(vu1Var).a(context, psVar);
    }

    public static final void b(d11 d11Var, Context context, vu1 vu1Var, ps psVar) {
        d11Var.getClass();
        a(context, vu1Var);
        psVar.onInitializationCompleted();
    }

    public static final void b(boolean z4) {
        int i4 = ew1.f25476l;
        ew1.a.a().c(z4);
    }

    public static final void a(boolean z4) {
        ap0.a(z4);
        po0.a(z4);
        if (z4) {
            return;
        }
        int i4 = i11.f27051d;
        i11.a.a().c();
        int i5 = a11.f23122d;
        a11.a.a().c();
    }

    public static final void a(@NotNull Context context, @NotNull vu1 sdkEnvironmentModule, @NotNull ps initializationListener) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(sdkEnvironmentModule, "sdkEnvironmentModule");
        Intrinsics.checkNotNullParameter(initializationListener, "initializationListener");
        new k80(new qs0()).a(new a(context, sdkEnvironmentModule, initializationListener), new b(context, sdkEnvironmentModule, initializationListener));
    }

    private static void a(Context context, vu1 vu1Var) {
        AbstractC3337k.d(o2.K.a(o2.R0.b(null, 1, null).plus(o2.Z.b()).plus(new eu(vu1Var.c()))), null, null, new c(context, vu1Var, null), 3, null);
    }
}
