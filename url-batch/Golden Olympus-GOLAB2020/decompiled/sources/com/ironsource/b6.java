package com.ironsource;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes2.dex */
public final class b6 implements InterfaceC1487j0 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final sv f15262a;

    public b6(@NotNull sv viewBinder) {
        Intrinsics.checkNotNullParameter(viewBinder, "viewBinder");
        this.f15262a = viewBinder;
    }

    @Override // com.ironsource.InterfaceC1487j0
    public void a(@NotNull x5 bannerAdInstance) {
        Intrinsics.checkNotNullParameter(bannerAdInstance, "bannerAdInstance");
        bannerAdInstance.a(this.f15262a);
    }
}
