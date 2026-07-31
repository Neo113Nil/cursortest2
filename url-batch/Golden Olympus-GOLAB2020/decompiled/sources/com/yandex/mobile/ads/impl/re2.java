package com.yandex.mobile.ads.impl;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class re2 implements zt {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final ve2 f31149a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final zn0 f31150b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final vf2 f31151c;

    /* renamed from: d, reason: collision with root package name */
    @Nullable
    private te2 f31152d;

    public re2(@NotNull ve2 videoPlayerController, @NotNull zn0 instreamVideoPresenter) {
        Intrinsics.checkNotNullParameter(videoPlayerController, "videoPlayerController");
        Intrinsics.checkNotNullParameter(instreamVideoPresenter, "instreamVideoPresenter");
        this.f31149a = videoPlayerController;
        this.f31150b = instreamVideoPresenter;
        this.f31151c = videoPlayerController.a();
    }

    public final void a() {
        int ordinal = this.f31151c.a().ordinal();
        if (ordinal == 0) {
            this.f31150b.g();
            return;
        }
        if (ordinal == 7) {
            this.f31150b.e();
            return;
        }
        if (ordinal == 4) {
            this.f31149a.d();
            this.f31150b.i();
        } else {
            if (ordinal != 5) {
                return;
            }
            this.f31150b.b();
        }
    }

    public final void b() {
        int ordinal = this.f31151c.a().ordinal();
        if (ordinal == 1 || ordinal == 2 || ordinal == 3 || ordinal == 4 || ordinal == 6 || ordinal == 7) {
            this.f31151c.a(uf2.f33081b);
            te2 te2Var = this.f31152d;
            if (te2Var != null) {
                te2Var.a();
            }
        }
    }

    public final void c() {
        int ordinal = this.f31151c.a().ordinal();
        if (ordinal == 2 || ordinal == 3) {
            this.f31149a.d();
        }
    }

    public final void d() {
        this.f31151c.a(uf2.f33082c);
        this.f31149a.e();
    }

    public final void e() {
        int ordinal = this.f31151c.a().ordinal();
        if (ordinal == 2 || ordinal == 6) {
            this.f31149a.f();
        }
    }

    public final void f() {
        int ordinal = this.f31151c.a().ordinal();
        if (ordinal == 1) {
            this.f31151c.a(uf2.f33081b);
        } else if (ordinal == 2 || ordinal == 3 || ordinal == 6) {
            this.f31151c.a(uf2.f33085f);
        }
    }

    @Override // com.yandex.mobile.ads.impl.zt
    public final void onVideoCompleted() {
        this.f31151c.a(uf2.f33086g);
        te2 te2Var = this.f31152d;
        if (te2Var != null) {
            te2Var.onVideoCompleted();
        }
    }

    @Override // com.yandex.mobile.ads.impl.zt
    public final void onVideoError() {
        this.f31151c.a(uf2.f33088i);
        te2 te2Var = this.f31152d;
        if (te2Var != null) {
            te2Var.onVideoError();
        }
    }

    @Override // com.yandex.mobile.ads.impl.zt
    public final void onVideoPaused() {
        this.f31151c.a(uf2.f33087h);
        te2 te2Var = this.f31152d;
        if (te2Var != null) {
            te2Var.onVideoPaused();
        }
    }

    @Override // com.yandex.mobile.ads.impl.zt
    public final void onVideoPrepared() {
        if (uf2.f33082c == this.f31151c.a()) {
            this.f31151c.a(uf2.f33083d);
            this.f31150b.f();
        }
    }

    @Override // com.yandex.mobile.ads.impl.zt
    public final void onVideoResumed() {
        this.f31151c.a(uf2.f33084e);
        te2 te2Var = this.f31152d;
        if (te2Var != null) {
            te2Var.onVideoResumed();
        }
    }

    public final void a(@Nullable te2 te2Var) {
        this.f31152d = te2Var;
    }
}
