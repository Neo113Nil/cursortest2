package com.yandex.mobile.ads.impl;

import android.view.View;
import com.yandex.mobile.ads.impl.bg2;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class cg2 implements bg2 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final bg2 f24204a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f24205b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f24206c;

    public cg2(@NotNull tq videoTracker) {
        Intrinsics.checkNotNullParameter(videoTracker, "videoTracker");
        this.f24204a = videoTracker;
    }

    @Override // com.yandex.mobile.ads.impl.bg2
    public final void a(@NotNull View view, @NotNull List<mb2> friendlyOverlays) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(friendlyOverlays, "friendlyOverlays");
        this.f24204a.a(view, friendlyOverlays);
        this.f24205b = false;
        this.f24206c = false;
    }

    @Override // com.yandex.mobile.ads.impl.bg2
    public final void b() {
        this.f24204a.b();
        k();
    }

    @Override // com.yandex.mobile.ads.impl.bg2
    public final void c() {
        this.f24204a.c();
    }

    @Override // com.yandex.mobile.ads.impl.bg2
    public final void d() {
        this.f24204a.d();
    }

    @Override // com.yandex.mobile.ads.impl.bg2
    public final void e() {
        this.f24204a.e();
        k();
    }

    @Override // com.yandex.mobile.ads.impl.bg2
    public final void f() {
        this.f24204a.f();
    }

    @Override // com.yandex.mobile.ads.impl.bg2
    public final void g() {
        this.f24204a.g();
        k();
    }

    @Override // com.yandex.mobile.ads.impl.bg2
    public final void h() {
        if (this.f24205b) {
            return;
        }
        this.f24205b = true;
        this.f24204a.h();
    }

    @Override // com.yandex.mobile.ads.impl.bg2
    public final void i() {
        this.f24204a.i();
    }

    @Override // com.yandex.mobile.ads.impl.bg2
    public final void j() {
        this.f24204a.j();
    }

    @Override // com.yandex.mobile.ads.impl.bg2
    public final void k() {
        this.f24204a.k();
        this.f24205b = false;
        this.f24206c = false;
    }

    @Override // com.yandex.mobile.ads.impl.bg2
    public final void l() {
        this.f24204a.l();
    }

    @Override // com.yandex.mobile.ads.impl.bg2
    public final void m() {
        this.f24204a.m();
        h();
        n();
    }

    @Override // com.yandex.mobile.ads.impl.bg2
    public final void n() {
        if (this.f24206c) {
            return;
        }
        this.f24206c = true;
        this.f24204a.n();
    }

    @Override // com.yandex.mobile.ads.impl.bg2
    public final void a(@NotNull String assetName) {
        Intrinsics.checkNotNullParameter(assetName, "assetName");
        this.f24204a.a(assetName);
        h();
        n();
    }

    @Override // com.yandex.mobile.ads.impl.bg2
    public final void a(@NotNull mc2 error) {
        Intrinsics.checkNotNullParameter(error, "error");
        this.f24204a.a(error);
        k();
    }

    @Override // com.yandex.mobile.ads.impl.bg2
    public final void a(@NotNull bg2.a quartile) {
        Intrinsics.checkNotNullParameter(quartile, "quartile");
        this.f24204a.a(quartile);
    }

    @Override // com.yandex.mobile.ads.impl.bg2
    public final void a(float f4, long j4) {
        this.f24204a.a(f4, j4);
    }

    @Override // com.yandex.mobile.ads.impl.bg2
    public final void a() {
        this.f24204a.a();
    }

    @Override // com.yandex.mobile.ads.impl.bg2
    public final void a(float f4) {
        this.f24204a.a(f4);
    }
}
