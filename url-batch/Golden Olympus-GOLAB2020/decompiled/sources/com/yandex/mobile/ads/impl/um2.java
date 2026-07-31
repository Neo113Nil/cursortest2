package com.yandex.mobile.ads.impl;

import android.content.Context;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class um2 implements vu1 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final Context f33180a;

    public um2(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f33180a = xr.a(context);
    }

    @Override // com.yandex.mobile.ads.impl.vu1
    @NotNull
    public final bn2 a() {
        return new bn2(new je1());
    }

    @Override // com.yandex.mobile.ads.impl.vu1
    @NotNull
    public final el2 b() {
        return new el2();
    }

    @Override // com.yandex.mobile.ads.impl.vu1
    @NotNull
    public final e01 c() {
        return C1900ed.a(this.f33180a, zm2.f35627a, new el2());
    }

    @Override // com.yandex.mobile.ads.impl.vu1
    @NotNull
    public final en2 d() {
        return new en2(new je1());
    }

    @Override // com.yandex.mobile.ads.impl.vu1
    @NotNull
    public final vm2 e() {
        return new vm2();
    }

    @Override // com.yandex.mobile.ads.impl.vu1
    @NotNull
    public final void f() {
        zm2 zm2Var = zm2.f35627a;
    }
}
