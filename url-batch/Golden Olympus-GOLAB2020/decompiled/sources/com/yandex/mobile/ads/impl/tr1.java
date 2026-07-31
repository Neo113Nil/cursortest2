package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.eg1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class tr1 {
    @Nullable
    public static nc0 a(@NotNull sl1 progressListener, @NotNull a91 nativeMediaContent, @NotNull t42 timeProviderContainer) {
        Intrinsics.checkNotNullParameter(progressListener, "progressListener");
        Intrinsics.checkNotNullParameter(nativeMediaContent, "nativeMediaContent");
        Intrinsics.checkNotNullParameter(timeProviderContainer, "timeProviderContainer");
        ra1 a4 = nativeMediaContent.a();
        wb1 b4 = nativeMediaContent.b();
        if (a4 != null) {
            return new fb1(a4, progressListener, timeProviderContainer, timeProviderContainer.e(), timeProviderContainer.a());
        }
        if (b4 != null) {
            return null;
        }
        int i4 = eg1.f25287a;
        return new s81(progressListener, timeProviderContainer, eg1.a.a(false), timeProviderContainer.e(), timeProviderContainer.a(), timeProviderContainer.d());
    }
}
