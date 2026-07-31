package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.bn0;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class mn0 implements ec2<on0>, bn0.a {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final ec2<on0> f29179a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final AtomicInteger f29180b;

    public mn0(@NotNull ec2<on0> listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.f29179a = listener;
        this.f29180b = new AtomicInteger(2);
    }

    private final void m(ob2<on0> ob2Var) {
        if (this.f29180b.decrementAndGet() == 0) {
            this.f29179a.d(ob2Var);
        }
    }

    public final void a() {
        this.f29180b.set(2);
    }

    @Override // com.yandex.mobile.ads.impl.ec2
    public final void b(@NotNull ob2<on0> videoAdInfo) {
        Intrinsics.checkNotNullParameter(videoAdInfo, "videoAdInfo");
        this.f29179a.b(videoAdInfo);
    }

    @Override // com.yandex.mobile.ads.impl.ec2
    public final void c(@NotNull ob2<on0> videoAdInfo) {
        Intrinsics.checkNotNullParameter(videoAdInfo, "videoAdInfo");
        this.f29179a.c(videoAdInfo);
    }

    @Override // com.yandex.mobile.ads.impl.ec2
    public final void d(@NotNull ob2<on0> videoAdInfo) {
        Intrinsics.checkNotNullParameter(videoAdInfo, "videoAdInfo");
        m(videoAdInfo);
    }

    @Override // com.yandex.mobile.ads.impl.ec2
    public final void e(@NotNull ob2<on0> videoAdInfo) {
        Intrinsics.checkNotNullParameter(videoAdInfo, "videoAdInfo");
        this.f29179a.e(videoAdInfo);
    }

    @Override // com.yandex.mobile.ads.impl.ec2
    public final void f(@NotNull ob2<on0> videoAdInfo) {
        Intrinsics.checkNotNullParameter(videoAdInfo, "videoAdInfo");
        this.f29179a.f(videoAdInfo);
    }

    @Override // com.yandex.mobile.ads.impl.ec2
    public final void g(@NotNull ob2<on0> videoAdInfo) {
        Intrinsics.checkNotNullParameter(videoAdInfo, "videoAdInfo");
        this.f29179a.g(videoAdInfo);
    }

    @Override // com.yandex.mobile.ads.impl.bn0.a
    public final void h(@NotNull ob2<on0> videoAdInfo) {
        Intrinsics.checkNotNullParameter(videoAdInfo, "videoAdInfo");
        m(videoAdInfo);
    }

    @Override // com.yandex.mobile.ads.impl.ec2
    public final void i(@NotNull ob2<on0> videoAdInfo) {
        Intrinsics.checkNotNullParameter(videoAdInfo, "videoAdInfo");
        this.f29179a.i(videoAdInfo);
    }

    @Override // com.yandex.mobile.ads.impl.ec2
    public final void j(@NotNull ob2<on0> videoAdInfo) {
        Intrinsics.checkNotNullParameter(videoAdInfo, "videoAdInfo");
        this.f29179a.j(videoAdInfo);
    }

    @Override // com.yandex.mobile.ads.impl.ec2
    public final void k(@NotNull ob2<on0> videoAdInfo) {
        Intrinsics.checkNotNullParameter(videoAdInfo, "videoAdInfo");
        this.f29179a.k(videoAdInfo);
    }

    @Override // com.yandex.mobile.ads.impl.ec2
    public final void l(@NotNull ob2<on0> videoAdInfo) {
        Intrinsics.checkNotNullParameter(videoAdInfo, "videoAdInfo");
        this.f29179a.l(videoAdInfo);
    }

    @Override // com.yandex.mobile.ads.impl.ec2
    public final void a(@NotNull ob2<on0> videoAdInfo, @NotNull mc2 videoAdPlayerError) {
        Intrinsics.checkNotNullParameter(videoAdInfo, "videoAdInfo");
        Intrinsics.checkNotNullParameter(videoAdPlayerError, "videoAdPlayerError");
        this.f29179a.a(videoAdInfo, videoAdPlayerError);
    }

    @Override // com.yandex.mobile.ads.impl.ec2
    public final void a(@NotNull ob2<on0> videoAdInfo) {
        Intrinsics.checkNotNullParameter(videoAdInfo, "videoAdInfo");
        this.f29179a.a(videoAdInfo);
    }

    @Override // com.yandex.mobile.ads.impl.ec2
    public final void a(@NotNull ob2<on0> videoAdInfo, float f4) {
        Intrinsics.checkNotNullParameter(videoAdInfo, "videoAdInfo");
        this.f29179a.a(videoAdInfo, f4);
    }
}
