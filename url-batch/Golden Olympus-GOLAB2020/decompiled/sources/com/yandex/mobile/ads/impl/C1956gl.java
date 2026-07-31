package com.yandex.mobile.ads.impl;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: com.yandex.mobile.ads.impl.gl, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1956gl {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final nv0 f26205a;

    public C1956gl(@NotNull nv0 referenceMediaFileInfo) {
        Intrinsics.checkNotNullParameter(referenceMediaFileInfo, "referenceMediaFileInfo");
        this.f26205a = referenceMediaFileInfo;
    }

    public final int a(@NotNull mv0 mediaFile) {
        Intrinsics.checkNotNullParameter(mediaFile, "mediaFile");
        int b4 = mediaFile.b();
        if (b4 != 0) {
            return b4;
        }
        return (int) (((mediaFile.d() * mediaFile.h()) / (this.f26205a.b() * this.f26205a.c())) * this.f26205a.a());
    }
}
