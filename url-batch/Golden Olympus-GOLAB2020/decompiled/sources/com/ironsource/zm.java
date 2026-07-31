package com.ironsource;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes2.dex */
public final class zm implements InterfaceC1487j0 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final rm f20560a;

    public zm(@NotNull rm nativeAdBinder) {
        Intrinsics.checkNotNullParameter(nativeAdBinder, "nativeAdBinder");
        this.f20560a = nativeAdBinder;
    }

    @Override // com.ironsource.InterfaceC1487j0
    public void a(@NotNull ym nativeAdInstance) {
        Intrinsics.checkNotNullParameter(nativeAdInstance, "nativeAdInstance");
        nativeAdInstance.a(this.f20560a);
    }
}
