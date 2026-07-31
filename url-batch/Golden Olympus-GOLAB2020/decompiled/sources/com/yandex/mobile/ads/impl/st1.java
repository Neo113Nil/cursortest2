package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.tt1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class st1 implements InterfaceC2048ki {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ tt1.a f31945a;

    st1(tt1.a aVar) {
        this.f31945a = aVar;
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC2048ki
    public final void a() {
        C1977hi c1977hi;
        c1977hi = this.f31945a.f32689a;
        c1977hi.t();
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC2048ki
    public final void a(@NotNull C1866d3 error) {
        C1977hi c1977hi;
        Intrinsics.checkNotNullParameter(error, "error");
        c1977hi = this.f31945a.f32689a;
        c1977hi.b(error);
    }
}
