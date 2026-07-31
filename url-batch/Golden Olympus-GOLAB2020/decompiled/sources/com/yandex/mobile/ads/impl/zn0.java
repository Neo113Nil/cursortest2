package com.yandex.mobile.ads.impl;

import android.content.Context;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class zn0 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final rl0 f35630a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final ve2 f35631b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final cb2 f35632c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final c f35633d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final a f35634e;

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    private final b f35635f;

    /* renamed from: g, reason: collision with root package name */
    @NotNull
    private final re2 f35636g;

    /* renamed from: h, reason: collision with root package name */
    @NotNull
    private final C1943g8 f35637h;

    /* renamed from: i, reason: collision with root package name */
    @Nullable
    private C1895e8 f35638i;

    /* renamed from: j, reason: collision with root package name */
    @Nullable
    private ao0 f35639j;

    /* renamed from: k, reason: collision with root package name */
    private boolean f35640k;

    private final class a implements InterfaceC1991i8 {
        public a() {
        }

        @Override // com.yandex.mobile.ads.impl.InterfaceC1991i8
        public final void a() {
            zn0.this.e();
        }

        @Override // com.yandex.mobile.ads.impl.InterfaceC1991i8
        public final void b() {
            zn0.g(zn0.this);
        }

        @Override // com.yandex.mobile.ads.impl.InterfaceC1991i8
        public final void c() {
            zn0.e(zn0.this);
        }
    }

    private final class b implements InterfaceC1991i8 {
        public b() {
        }

        @Override // com.yandex.mobile.ads.impl.InterfaceC1991i8
        public final void a() {
            zn0.c(zn0.this);
        }

        @Override // com.yandex.mobile.ads.impl.InterfaceC1991i8
        public final void b() {
            zn0.g(zn0.this);
        }

        @Override // com.yandex.mobile.ads.impl.InterfaceC1991i8
        public final void c() {
            zn0.c(zn0.this);
        }
    }

    private final class c implements InterfaceC1991i8 {
        public c() {
        }

        @Override // com.yandex.mobile.ads.impl.InterfaceC1991i8
        public final void a() {
            zn0.this.f35640k = false;
            zn0.d(zn0.this);
        }

        @Override // com.yandex.mobile.ads.impl.InterfaceC1991i8
        public final void b() {
            boolean z4 = zn0.this.f35640k;
            zn0.this.f35640k = false;
            if (z4) {
                zn0.g(zn0.this);
                return;
            }
            ao0 ao0Var = zn0.this.f35639j;
            if (ao0Var != null) {
                ao0Var.onInstreamAdPrepared();
            }
        }

        @Override // com.yandex.mobile.ads.impl.InterfaceC1991i8
        public final void c() {
            zn0.d(zn0.this);
        }
    }

    public /* synthetic */ zn0(Context context, vu1 vu1Var, qs qsVar, rl0 rl0Var, km0 km0Var, ve2 ve2Var, il0 il0Var) {
        this(context, vu1Var, qsVar, rl0Var, km0Var, ve2Var, il0Var, new se2(), new cb2());
    }

    public static final void c(zn0 zn0Var) {
        ao0 ao0Var = zn0Var.f35639j;
        if (ao0Var != null) {
            ao0Var.a();
        }
        zn0Var.f35631b.h();
        zn0Var.f35630a.b();
    }

    public static final void d(zn0 zn0Var) {
        C1895e8 a4 = zn0Var.f35637h.a();
        zn0Var.f35638i = a4;
        a4.a(zn0Var.f35634e);
        C1895e8 c1895e8 = zn0Var.f35638i;
        if (c1895e8 != null) {
            c1895e8.f();
        }
    }

    public static final void e(zn0 zn0Var) {
        C1895e8 b4 = zn0Var.f35637h.b();
        zn0Var.f35638i = b4;
        if (b4 != null) {
            b4.a(zn0Var.f35635f);
            C1895e8 c1895e8 = zn0Var.f35638i;
            if (c1895e8 != null) {
                c1895e8.f();
                return;
            }
            return;
        }
        ao0 ao0Var = zn0Var.f35639j;
        if (ao0Var != null) {
            ao0Var.a();
        }
        zn0Var.f35631b.h();
        zn0Var.f35630a.b();
    }

    public static final void g(zn0 zn0Var) {
        C1895e8 c1895e8 = zn0Var.f35638i;
        if (c1895e8 != null) {
            c1895e8.h();
        }
    }

    public final void h() {
        if (this.f35638i != null) {
            ao0 ao0Var = this.f35639j;
            if (ao0Var != null) {
                ao0Var.onInstreamAdPrepared();
                return;
            }
            return;
        }
        C1895e8 c4 = this.f35637h.c();
        this.f35638i = c4;
        if (c4 == null) {
            ao0 ao0Var2 = this.f35639j;
            if (ao0Var2 != null) {
                ao0Var2.onInstreamAdPrepared();
                return;
            }
            return;
        }
        c4.a(this.f35633d);
        this.f35640k = false;
        C1895e8 c1895e8 = this.f35638i;
        if (c1895e8 != null) {
            c1895e8.f();
        }
    }

    public final void i() {
        C1895e8 c1895e8 = this.f35638i;
        if (c1895e8 != null) {
            c1895e8.g();
        }
    }

    public final void j() {
        this.f35636g.f();
        C1895e8 c1895e8 = this.f35638i;
        if (c1895e8 != null) {
            c1895e8.e();
        }
    }

    public final void a() {
        this.f35636g.a();
    }

    public final void b() {
        C1895e8 c1895e8 = this.f35638i;
        if (c1895e8 != null) {
            c1895e8.g();
            return;
        }
        ao0 ao0Var = this.f35639j;
        if (ao0Var != null) {
            ao0Var.a();
        }
        this.f35631b.h();
        this.f35630a.b();
    }

    public final void f() {
        if (this.f35638i != null) {
            this.f35636g.c();
            C1895e8 c1895e8 = this.f35638i;
            if (c1895e8 != null) {
                c1895e8.h();
                return;
            }
            return;
        }
        C1895e8 c4 = this.f35637h.c();
        this.f35638i = c4;
        if (c4 != null) {
            c4.a(this.f35633d);
            this.f35636g.c();
            this.f35640k = true;
            C1895e8 c1895e82 = this.f35638i;
            if (c1895e82 != null) {
                c1895e82.f();
                return;
            }
            return;
        }
        C1895e8 a4 = this.f35637h.a();
        this.f35638i = a4;
        a4.a(this.f35634e);
        C1895e8 c1895e83 = this.f35638i;
        if (c1895e83 != null) {
            c1895e83.f();
        }
    }

    public final void a(@Nullable tn0 tn0Var) {
        this.f35632c.a(tn0Var);
    }

    public final void g() {
        this.f35631b.a(this.f35636g);
        this.f35636g.d();
    }

    public zn0(@NotNull Context context, @NotNull vu1 sdkEnvironmentModule, @NotNull qs instreamVideoAd, @NotNull rl0 instreamAdPlayerController, @NotNull km0 instreamAdViewsHolderManager, @NotNull ve2 videoPlayerController, @NotNull il0 customUiElementsHolder, @NotNull se2 videoPlaybackControllerFactory, @NotNull cb2 videoAdCreativePlaybackProxyListener) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(sdkEnvironmentModule, "sdkEnvironmentModule");
        Intrinsics.checkNotNullParameter(instreamVideoAd, "instreamVideoAd");
        Intrinsics.checkNotNullParameter(instreamAdPlayerController, "instreamAdPlayerController");
        Intrinsics.checkNotNullParameter(instreamAdViewsHolderManager, "instreamAdViewsHolderManager");
        Intrinsics.checkNotNullParameter(videoPlayerController, "videoPlayerController");
        Intrinsics.checkNotNullParameter(customUiElementsHolder, "customUiElementsHolder");
        Intrinsics.checkNotNullParameter(videoPlaybackControllerFactory, "videoPlaybackControllerFactory");
        Intrinsics.checkNotNullParameter(videoAdCreativePlaybackProxyListener, "videoAdCreativePlaybackProxyListener");
        this.f35630a = instreamAdPlayerController;
        this.f35631b = videoPlayerController;
        this.f35632c = videoAdCreativePlaybackProxyListener;
        this.f35633d = new c();
        this.f35634e = new a();
        this.f35635f = new b();
        videoPlaybackControllerFactory.getClass();
        re2 a4 = se2.a(videoPlayerController, this);
        this.f35636g = a4;
        this.f35637h = new C1943g8(context, sdkEnvironmentModule, instreamVideoAd, instreamAdPlayerController, instreamAdViewsHolderManager, videoPlayerController, a4, videoAdCreativePlaybackProxyListener, customUiElementsHolder);
    }

    public final void a(@Nullable ao0 ao0Var) {
        this.f35639j = ao0Var;
    }

    public final void c() {
        C1895e8 c1895e8 = this.f35638i;
        if (c1895e8 != null) {
            c1895e8.d();
        }
        this.f35630a.b();
    }

    public final void d() {
        c();
        this.f35631b.h();
        this.f35636g.b();
    }

    public final void e() {
        ao0 ao0Var = this.f35639j;
        if (ao0Var != null) {
            ao0Var.b();
        }
        this.f35631b.h();
        this.f35630a.b();
    }
}
