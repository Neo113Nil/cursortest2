package com.yandex.mobile.ads.impl;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class r71 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final fe2 f31062a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final a91 f31063b;

    public r71(@NotNull fe2 videoEventController, @NotNull a91 nativeMediaContent) {
        Intrinsics.checkNotNullParameter(videoEventController, "videoEventController");
        Intrinsics.checkNotNullParameter(nativeMediaContent, "nativeMediaContent");
        this.f31062a = videoEventController;
        this.f31063b = nativeMediaContent;
    }

    @Nullable
    public final s71 a() {
        ra1 a4 = this.f31063b.a();
        if (a4 == null) {
            return null;
        }
        fe2 fe2Var = this.f31062a;
        return new s71(a4, fe2Var, fe2Var);
    }
}
