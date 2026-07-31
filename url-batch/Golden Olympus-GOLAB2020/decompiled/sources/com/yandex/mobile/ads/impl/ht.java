package com.yandex.mobile.ads.impl;

import a2.AbstractC1241b;
import android.content.Context;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import o2.AbstractC3337k;
import o2.InterfaceC3316J;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class ht {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final vu1 f26895a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final Context f26896b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final InterfaceC3316J f26897c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final x51 f26898d;

    @kotlin.coroutines.jvm.internal.f(c = "com.monetization.ads.nativeads.CoreNativeAdLoader$loadAd$1", f = "CoreNativeAdLoader.kt", l = {}, m = "invokeSuspend")
    static final class a extends kotlin.coroutines.jvm.internal.l implements Function2<InterfaceC3316J, kotlin.coroutines.d, Object> {

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ C1918f7 f26900c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(C1918f7 c1918f7, kotlin.coroutines.d dVar) {
            super(2, dVar);
            this.f26900c = c1918f7;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @NotNull
        public final kotlin.coroutines.d create(@Nullable Object obj, @NotNull kotlin.coroutines.d dVar) {
            return ht.this.new a(this.f26900c, dVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return ht.this.new a(this.f26900c, (kotlin.coroutines.d) obj2).invokeSuspend(Unit.f41027a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            AbstractC1241b.f();
            ResultKt.a(obj);
            k61 k61Var = new k61(ht.this.f26896b, ht.this.f26895a.c());
            x51 x51Var = ht.this.f26898d;
            C1918f7 c1918f7 = this.f26900c;
            p91 p91Var = p91.f30362c;
            s91 s91Var = s91.f31631c;
            x51Var.a(c1918f7, k61Var);
            return Unit.f41027a;
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.monetization.ads.nativeads.CoreNativeAdLoader$loadAds$1", f = "CoreNativeAdLoader.kt", l = {}, m = "invokeSuspend")
    static final class b extends kotlin.coroutines.jvm.internal.l implements Function2<InterfaceC3316J, kotlin.coroutines.d, Object> {

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ C1918f7 f26902c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f26903d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(C1918f7 c1918f7, int i4, kotlin.coroutines.d dVar) {
            super(2, dVar);
            this.f26902c = c1918f7;
            this.f26903d = i4;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @NotNull
        public final kotlin.coroutines.d create(@Nullable Object obj, @NotNull kotlin.coroutines.d dVar) {
            return ht.this.new b(this.f26902c, this.f26903d, dVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return ((b) create((InterfaceC3316J) obj, (kotlin.coroutines.d) obj2)).invokeSuspend(Unit.f41027a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            AbstractC1241b.f();
            ResultKt.a(obj);
            k61 k61Var = new k61(ht.this.f26896b, ht.this.f26895a.c());
            x51 x51Var = ht.this.f26898d;
            C1918f7 c1918f7 = this.f26902c;
            p91 p91Var = p91.f30362c;
            s91 s91Var = s91.f31631c;
            x51Var.a(c1918f7, k61Var, this.f26903d);
            return Unit.f41027a;
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.monetization.ads.nativeads.CoreNativeAdLoader$loadSlider$1", f = "CoreNativeAdLoader.kt", l = {}, m = "invokeSuspend")
    static final class c extends kotlin.coroutines.jvm.internal.l implements Function2<InterfaceC3316J, kotlin.coroutines.d, Object> {

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ C1918f7 f26905c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(C1918f7 c1918f7, kotlin.coroutines.d dVar) {
            super(2, dVar);
            this.f26905c = c1918f7;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @NotNull
        public final kotlin.coroutines.d create(@Nullable Object obj, @NotNull kotlin.coroutines.d dVar) {
            return ht.this.new c(this.f26905c, dVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return ht.this.new c(this.f26905c, (kotlin.coroutines.d) obj2).invokeSuspend(Unit.f41027a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            AbstractC1241b.f();
            ResultKt.a(obj);
            k61 k61Var = new k61(ht.this.f26896b, ht.this.f26895a.c());
            x51 x51Var = ht.this.f26898d;
            C1918f7 c1918f7 = this.f26905c;
            p91 p91Var = p91.f30362c;
            s91 s91Var = s91.f31631c;
            x51Var.b(c1918f7, k61Var);
            return Unit.f41027a;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ ht(Context context, um2 um2Var) {
        this(context, um2Var, r3, r4, fu.a((mp1) um2Var.c()), new x51(r4, um2Var, r3));
        gs gsVar = gs.f26283g;
        Context applicationContext = context.getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
    }

    public final void a() {
        this.f26898d.a();
        o2.K.f(this.f26897c, null, 1, null);
    }

    public final void b(@NotNull C1918f7 adRequestData) {
        Intrinsics.checkNotNullParameter(adRequestData, "adRequestData");
        AbstractC3337k.d(this.f26897c, null, null, new c(adRequestData, null), 3, null);
    }

    public final void a(@NotNull C1918f7 adRequestData) {
        Intrinsics.checkNotNullParameter(adRequestData, "adRequestData");
        AbstractC3337k.d(this.f26897c, null, null, new a(adRequestData, null), 3, null);
    }

    public ht(@NotNull Context context, @NotNull um2 sdkEnvironmentModule, @NotNull gs adType, @NotNull Context appContext, @NotNull InterfaceC3316J coroutineScope, @NotNull x51 adLoadingController) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(sdkEnvironmentModule, "sdkEnvironmentModule");
        Intrinsics.checkNotNullParameter(adType, "adType");
        Intrinsics.checkNotNullParameter(appContext, "appContext");
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        Intrinsics.checkNotNullParameter(adLoadingController, "adLoadingController");
        this.f26895a = sdkEnvironmentModule;
        this.f26896b = appContext;
        this.f26897c = coroutineScope;
        this.f26898d = adLoadingController;
    }

    public final void a(@NotNull C1918f7 adRequestData, int i4) {
        Intrinsics.checkNotNullParameter(adRequestData, "adRequestData");
        AbstractC3337k.d(this.f26897c, null, null, new b(adRequestData, i4, null), 3, null);
    }

    public final void a(@Nullable gt gtVar) {
        this.f26898d.a(gtVar);
    }

    public final void a(@Nullable om2 om2Var) {
        this.f26898d.a(om2Var);
    }

    public final void a(@Nullable xm2 xm2Var) {
        this.f26898d.a(xm2Var);
    }
}
