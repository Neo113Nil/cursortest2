package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.qi0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class r81 implements qi0.a {

    /* renamed from: a, reason: collision with root package name */
    private final boolean f31078a;

    public r81(@NotNull C2360y7<?> adResponse) {
        Intrinsics.checkNotNullParameter(adResponse, "adResponse");
        this.f31078a = Intrinsics.areEqual(adResponse.E(), q81.f30707c.a()) || Intrinsics.areEqual(adResponse.E(), q81.f30708d.a());
    }

    @Override // com.yandex.mobile.ads.impl.qi0.a
    public final boolean a() {
        return this.f31078a;
    }
}
