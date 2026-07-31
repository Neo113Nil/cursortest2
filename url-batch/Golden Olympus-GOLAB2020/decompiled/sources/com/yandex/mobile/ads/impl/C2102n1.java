package com.yandex.mobile.ads.impl;

import android.app.Activity;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: com.yandex.mobile.ads.impl.n1, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2102n1 implements InterfaceC1984i1 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final Activity f29326a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final C2353y0 f29327b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final C2170q0 f29328c;

    public C2102n1(@NotNull Activity activity, @NotNull C2353y0 adActivityData, @NotNull C2170q0 activityResultRegistrar) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(adActivityData, "adActivityData");
        Intrinsics.checkNotNullParameter(activityResultRegistrar, "activityResultRegistrar");
        this.f29326a = activity;
        this.f29327b = adActivityData;
        this.f29328c = activityResultRegistrar;
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC1984i1
    public final void a() {
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC1984i1
    public final void b() {
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC1984i1
    public final void c() {
        this.f29328c.a(this.f29326a, this.f29327b);
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC1984i1
    public final void d() {
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC1984i1
    public final boolean e() {
        return true;
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC1984i1
    public final void g() {
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC1984i1
    public final void onAdClosed() {
    }
}
