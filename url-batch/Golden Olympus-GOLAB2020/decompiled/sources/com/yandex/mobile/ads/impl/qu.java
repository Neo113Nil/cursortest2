package com.yandex.mobile.ads.impl;

import android.view.View;
import com.yandex.mobile.ads.impl.bg2;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class qu implements bg2 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final hu f30892a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final zf2 f30893b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final ge2 f30894c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final vn0 f30895d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f30896e;

    public qu(@NotNull hu creative, @NotNull zf2 eventsTracker, @NotNull ge2 videoEventUrlsTracker) {
        Intrinsics.checkNotNullParameter(creative, "creative");
        Intrinsics.checkNotNullParameter(eventsTracker, "eventsTracker");
        Intrinsics.checkNotNullParameter(videoEventUrlsTracker, "videoEventUrlsTracker");
        this.f30892a = creative;
        this.f30893b = eventsTracker;
        this.f30894c = videoEventUrlsTracker;
        this.f30895d = new vn0(new iu());
    }

    @Override // com.yandex.mobile.ads.impl.bg2
    public final void a(float f4) {
    }

    @Override // com.yandex.mobile.ads.impl.bg2
    public final void b() {
        this.f30893b.a(this.f30892a, "complete");
    }

    @Override // com.yandex.mobile.ads.impl.bg2
    public final void c() {
        this.f30893b.a(this.f30892a, "resume");
    }

    @Override // com.yandex.mobile.ads.impl.bg2
    public final void d() {
        this.f30893b.a(this.f30892a, "pause");
    }

    @Override // com.yandex.mobile.ads.impl.bg2
    public final void e() {
        this.f30893b.a(this.f30892a, "skip");
    }

    @Override // com.yandex.mobile.ads.impl.bg2
    public final void f() {
    }

    @Override // com.yandex.mobile.ads.impl.bg2
    public final void g() {
    }

    @Override // com.yandex.mobile.ads.impl.bg2
    public final void h() {
        this.f30893b.a(this.f30892a, "creativeView");
    }

    @Override // com.yandex.mobile.ads.impl.bg2
    public final void i() {
        hu creative = this.f30892a;
        Intrinsics.checkNotNullParameter(creative, "creative");
        this.f30893b.a(new mu(creative), "creativeRenderingStart");
    }

    @Override // com.yandex.mobile.ads.impl.bg2
    public final void j() {
    }

    @Override // com.yandex.mobile.ads.impl.bg2
    public final void k() {
        this.f30896e = false;
    }

    @Override // com.yandex.mobile.ads.impl.bg2
    public final void l() {
        this.f30893b.a(this.f30892a, "mute");
    }

    @Override // com.yandex.mobile.ads.impl.bg2
    public final void m() {
        if (!this.f30896e) {
            this.f30896e = true;
            this.f30893b.a(this.f30892a, "start");
        }
        this.f30893b.a(this.f30892a, "clickTracking");
    }

    @Override // com.yandex.mobile.ads.impl.bg2
    public final void n() {
    }

    @Override // com.yandex.mobile.ads.impl.bg2
    public final void a(@NotNull View view, @NotNull List<mb2> friendlyOverlays) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(friendlyOverlays, "friendlyOverlays");
    }

    @Override // com.yandex.mobile.ads.impl.bg2
    public final void a(@NotNull String assetName) {
        Intrinsics.checkNotNullParameter(assetName, "assetName");
        if (!this.f30896e) {
            this.f30896e = true;
            this.f30893b.a(this.f30892a, "start");
        }
        this.f30894c.a(this.f30895d.a(this.f30892a, assetName).b(), null);
    }

    @Override // com.yandex.mobile.ads.impl.bg2
    public final void a(@NotNull mc2 error) {
        Intrinsics.checkNotNullParameter(error, "error");
    }

    @Override // com.yandex.mobile.ads.impl.bg2
    public final void a(@NotNull bg2.a quartile) {
        String str;
        Intrinsics.checkNotNullParameter(quartile, "quartile");
        int ordinal = quartile.ordinal();
        if (ordinal == 0) {
            str = "firstQuartile";
        } else if (ordinal == 1) {
            str = "midpoint";
        } else {
            if (ordinal != 2) {
                throw new W1.m();
            }
            str = "thirdQuartile";
        }
        this.f30893b.a(this.f30892a, str);
    }

    @Override // com.yandex.mobile.ads.impl.bg2
    public final void a(float f4, long j4) {
        if (this.f30896e) {
            return;
        }
        this.f30896e = true;
        this.f30893b.a(this.f30892a, "start");
    }

    @Override // com.yandex.mobile.ads.impl.bg2
    public final void a() {
        this.f30893b.a(this.f30892a, "unmute");
    }
}
