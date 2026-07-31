package com.yandex.mobile.ads.impl;

import android.content.Context;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class h01 implements InterfaceC1967h8, zi1, InterfaceC1841c2 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final C1937g2 f26504a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final re2 f26505b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final cb2 f26506c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final g01 f26507d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final a f26508e;

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    private final xi1 f26509f;

    /* renamed from: g, reason: collision with root package name */
    @Nullable
    private InterfaceC1991i8 f26510g;

    /* renamed from: h, reason: collision with root package name */
    @Nullable
    private C1817b2 f26511h;

    private final class a implements te2 {
        public a() {
        }

        @Override // com.yandex.mobile.ads.impl.te2
        public final void a() {
            h01.this.f26509f.b();
            C1817b2 c1817b2 = h01.this.f26511h;
            if (c1817b2 != null) {
                c1817b2.c();
            }
        }

        @Override // com.yandex.mobile.ads.impl.te2
        public final void onVideoCompleted() {
            h01.e(h01.this);
            h01.this.f26509f.b();
            h01.this.f26505b.a(null);
            InterfaceC1991i8 interfaceC1991i8 = h01.this.f26510g;
            if (interfaceC1991i8 != null) {
                interfaceC1991i8.c();
            }
        }

        @Override // com.yandex.mobile.ads.impl.te2
        public final void onVideoError() {
            h01.this.f26509f.b();
            h01.this.f26505b.a(null);
            C1817b2 c1817b2 = h01.this.f26511h;
            if (c1817b2 != null) {
                c1817b2.c();
            }
            InterfaceC1991i8 interfaceC1991i8 = h01.this.f26510g;
            if (interfaceC1991i8 != null) {
                interfaceC1991i8.a();
            }
        }

        @Override // com.yandex.mobile.ads.impl.te2
        public final void onVideoPaused() {
            h01.this.f26509f.b();
        }

        @Override // com.yandex.mobile.ads.impl.te2
        public final void onVideoResumed() {
            h01.this.f26509f.a();
        }
    }

    public h01(@NotNull Context context, @NotNull wl0 instreamAdPlaylist, @NotNull C1937g2 adBreakStatusController, @NotNull rl0 instreamAdPlayerController, @NotNull gm0 interfaceElementsManager, @NotNull km0 instreamAdViewsHolderManager, @NotNull ve2 videoPlayerController, @NotNull re2 videoPlaybackController, @NotNull cb2 videoAdCreativePlaybackProxyListener, @NotNull yi1 schedulerCreator) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(instreamAdPlaylist, "instreamAdPlaylist");
        Intrinsics.checkNotNullParameter(adBreakStatusController, "adBreakStatusController");
        Intrinsics.checkNotNullParameter(instreamAdPlayerController, "instreamAdPlayerController");
        Intrinsics.checkNotNullParameter(interfaceElementsManager, "interfaceElementsManager");
        Intrinsics.checkNotNullParameter(instreamAdViewsHolderManager, "instreamAdViewsHolderManager");
        Intrinsics.checkNotNullParameter(videoPlayerController, "videoPlayerController");
        Intrinsics.checkNotNullParameter(videoPlaybackController, "videoPlaybackController");
        Intrinsics.checkNotNullParameter(videoAdCreativePlaybackProxyListener, "videoAdCreativePlaybackProxyListener");
        Intrinsics.checkNotNullParameter(schedulerCreator, "schedulerCreator");
        this.f26504a = adBreakStatusController;
        this.f26505b = videoPlaybackController;
        this.f26506c = videoAdCreativePlaybackProxyListener;
        this.f26507d = new g01(context, adBreakStatusController, instreamAdPlayerController, interfaceElementsManager, instreamAdViewsHolderManager, videoAdCreativePlaybackProxyListener);
        this.f26508e = new a();
        this.f26509f = schedulerCreator.a(instreamAdPlaylist, this);
    }

    public static final void e(h01 h01Var) {
        C1817b2 c1817b2 = h01Var.f26511h;
        if (c1817b2 != null) {
            c1817b2.a((InterfaceC1841c2) null);
        }
        C1817b2 c1817b22 = h01Var.f26511h;
        if (c1817b22 != null) {
            c1817b22.e();
        }
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC1841c2
    public final void a() {
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC1841c2
    public final void b() {
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC1967h8
    public final void f() {
        this.f26509f.b();
        C1817b2 c1817b2 = this.f26511h;
        if (c1817b2 != null) {
            c1817b2.c();
        }
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC1841c2
    public final void g() {
        this.f26511h = null;
        this.f26505b.e();
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC1967h8
    public final void prepare() {
        InterfaceC1991i8 interfaceC1991i8 = this.f26510g;
        if (interfaceC1991i8 != null) {
            interfaceC1991i8.b();
        }
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC1967h8
    public final void resume() {
        Unit unit;
        C1817b2 c1817b2 = this.f26511h;
        if (c1817b2 != null) {
            if (this.f26504a.a()) {
                this.f26505b.c();
                c1817b2.f();
            } else {
                this.f26505b.e();
                c1817b2.d();
            }
            unit = Unit.f41027a;
        } else {
            unit = null;
        }
        if (unit == null) {
            this.f26505b.e();
        }
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC1967h8
    public final void start() {
        this.f26505b.a(this.f26508e);
        this.f26505b.e();
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC1967h8
    public final void c() {
        this.f26509f.b();
        C1817b2 c1817b2 = this.f26511h;
        if (c1817b2 != null) {
            c1817b2.b();
        }
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC1841c2
    public final void d() {
        this.f26505b.c();
    }

    @Override // com.yandex.mobile.ads.impl.zi1
    public final void a(@NotNull ss adBreak) {
        Intrinsics.checkNotNullParameter(adBreak, "adBreak");
        C1817b2 a4 = this.f26507d.a(adBreak);
        if (!Intrinsics.areEqual(a4, this.f26511h)) {
            C1817b2 c1817b2 = this.f26511h;
            if (c1817b2 != null) {
                c1817b2.a((InterfaceC1841c2) null);
            }
            C1817b2 c1817b22 = this.f26511h;
            if (c1817b22 != null) {
                c1817b22.e();
            }
        }
        a4.a(this);
        a4.g();
        this.f26511h = a4;
    }

    @Override // com.yandex.mobile.ads.impl.zi1
    public final void b(@NotNull ss adBreak) {
        Intrinsics.checkNotNullParameter(adBreak, "adBreak");
        C1817b2 a4 = this.f26507d.a(adBreak);
        if (!Intrinsics.areEqual(a4, this.f26511h)) {
            C1817b2 c1817b2 = this.f26511h;
            if (c1817b2 != null) {
                c1817b2.a((InterfaceC1841c2) null);
            }
            C1817b2 c1817b22 = this.f26511h;
            if (c1817b22 != null) {
                c1817b22.e();
            }
        }
        a4.a(this);
        a4.d();
        this.f26511h = a4;
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC1841c2
    public final void e() {
        this.f26511h = null;
        this.f26505b.e();
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC1967h8
    public final void a(@Nullable tn0 tn0Var) {
        this.f26506c.a(tn0Var);
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC1967h8
    public final void a(@Nullable InterfaceC1991i8 interfaceC1991i8) {
        this.f26510g = interfaceC1991i8;
    }
}
