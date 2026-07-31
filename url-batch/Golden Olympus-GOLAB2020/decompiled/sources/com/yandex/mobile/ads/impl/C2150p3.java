package com.yandex.mobile.ads.impl;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: com.yandex.mobile.ads.impl.p3, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2150p3 implements ec2<on0> {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final tn0 f30304a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final xu f30305b;

    /* renamed from: c, reason: collision with root package name */
    @Nullable
    private C1986i3 f30306c;

    public C2150p3(@NotNull cb2 adCreativePlaybackListener, @NotNull xu currentAdCreativePlaybackEventListener) {
        Intrinsics.checkNotNullParameter(adCreativePlaybackListener, "adCreativePlaybackListener");
        Intrinsics.checkNotNullParameter(currentAdCreativePlaybackEventListener, "currentAdCreativePlaybackEventListener");
        this.f30304a = adCreativePlaybackListener;
        this.f30305b = currentAdCreativePlaybackEventListener;
    }

    private final boolean h(ob2<on0> ob2Var) {
        C1986i3 c1986i3 = this.f30306c;
        return Intrinsics.areEqual(c1986i3 != null ? c1986i3.c() : null, ob2Var);
    }

    @Override // com.yandex.mobile.ads.impl.ec2
    public final void a(@NotNull ob2<on0> videoAdInfo, @NotNull mc2 videoAdPlayerError) {
        Intrinsics.checkNotNullParameter(videoAdInfo, "videoAdInfo");
        Intrinsics.checkNotNullParameter(videoAdPlayerError, "videoAdPlayerError");
        this.f30304a.h(videoAdInfo.d());
        this.f30305b.a(videoAdInfo, videoAdPlayerError);
    }

    @Override // com.yandex.mobile.ads.impl.ec2
    public final void b(@NotNull ob2<on0> videoAdInfo) {
        Intrinsics.checkNotNullParameter(videoAdInfo, "videoAdInfo");
        this.f30304a.c(videoAdInfo.d());
        if (h(videoAdInfo)) {
            this.f30305b.b(videoAdInfo);
        }
    }

    @Override // com.yandex.mobile.ads.impl.ec2
    public final void c(@NotNull ob2<on0> videoAdInfo) {
        Intrinsics.checkNotNullParameter(videoAdInfo, "videoAdInfo");
        this.f30304a.d(videoAdInfo.d());
        if (h(videoAdInfo)) {
            this.f30305b.c(videoAdInfo);
        }
    }

    @Override // com.yandex.mobile.ads.impl.ec2
    public final void d(@NotNull ob2<on0> videoAdInfo) {
        Intrinsics.checkNotNullParameter(videoAdInfo, "videoAdInfo");
        this.f30304a.b(videoAdInfo.d());
        if (h(videoAdInfo)) {
            this.f30305b.d(videoAdInfo);
        }
    }

    @Override // com.yandex.mobile.ads.impl.ec2
    public final void e(@NotNull ob2<on0> videoAdInfo) {
        Intrinsics.checkNotNullParameter(videoAdInfo, "videoAdInfo");
        this.f30304a.f(videoAdInfo.d());
        if (h(videoAdInfo)) {
            this.f30305b.e(videoAdInfo);
        }
    }

    @Override // com.yandex.mobile.ads.impl.ec2
    public final void f(@NotNull ob2<on0> videoAdInfo) {
        Intrinsics.checkNotNullParameter(videoAdInfo, "videoAdInfo");
        this.f30304a.e(videoAdInfo.d());
        if (h(videoAdInfo)) {
            this.f30305b.f(videoAdInfo);
        }
    }

    @Override // com.yandex.mobile.ads.impl.ec2
    public final void g(@NotNull ob2<on0> videoAdInfo) {
        Intrinsics.checkNotNullParameter(videoAdInfo, "videoAdInfo");
        this.f30304a.g(videoAdInfo.d());
        if (h(videoAdInfo)) {
            this.f30305b.g(videoAdInfo);
        }
    }

    @Override // com.yandex.mobile.ads.impl.ec2
    public final void i(@NotNull ob2<on0> videoAdInfo) {
        Intrinsics.checkNotNullParameter(videoAdInfo, "videoAdInfo");
        this.f30304a.j(videoAdInfo.d());
    }

    @Override // com.yandex.mobile.ads.impl.ec2
    public final void j(@NotNull ob2<on0> videoAdInfo) {
        C2195r3 a4;
        ln0 a5;
        Intrinsics.checkNotNullParameter(videoAdInfo, "videoAdInfo");
        C1986i3 c1986i3 = this.f30306c;
        if (c1986i3 == null || (a4 = c1986i3.a(videoAdInfo)) == null || (a5 = a4.a()) == null) {
            return;
        }
        a5.e();
    }

    @Override // com.yandex.mobile.ads.impl.ec2
    public final void k(@NotNull ob2<on0> videoAdInfo) {
        Intrinsics.checkNotNullParameter(videoAdInfo, "videoAdInfo");
    }

    @Override // com.yandex.mobile.ads.impl.ec2
    public final void l(@NotNull ob2<on0> videoAdInfo) {
        Intrinsics.checkNotNullParameter(videoAdInfo, "videoAdInfo");
    }

    @Override // com.yandex.mobile.ads.impl.ec2
    public final void a(@NotNull ob2<on0> videoAdInfo) {
        Intrinsics.checkNotNullParameter(videoAdInfo, "videoAdInfo");
        this.f30304a.a(videoAdInfo.d());
        if (h(videoAdInfo)) {
            this.f30305b.a(videoAdInfo);
        }
    }

    @Override // com.yandex.mobile.ads.impl.ec2
    public final void a(@NotNull ob2<on0> videoAdInfo, float f4) {
        Intrinsics.checkNotNullParameter(videoAdInfo, "videoAdInfo");
        this.f30304a.a(videoAdInfo.d(), f4);
    }

    public final void a(@Nullable C1986i3 c1986i3) {
        this.f30306c = c1986i3;
    }
}
