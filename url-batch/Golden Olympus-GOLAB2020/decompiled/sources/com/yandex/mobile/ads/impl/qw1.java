package com.yandex.mobile.ads.impl;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class qw1 implements sb1 {
    @Override // com.yandex.mobile.ads.impl.sb1
    @NotNull
    public final rb1 a(@NotNull u31 nativeAd) {
        Intrinsics.checkNotNullParameter(nativeAd, "nativeAd");
        return new a71(nativeAd);
    }
}
