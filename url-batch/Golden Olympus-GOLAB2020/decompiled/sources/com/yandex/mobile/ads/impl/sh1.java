package com.yandex.mobile.ads.impl;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class sh1 implements rc2 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final xa1 f31753a;

    public sh1(@NotNull xa1 nativeVideoPlaybackEventListener) {
        Intrinsics.checkNotNullParameter(nativeVideoPlaybackEventListener, "nativeVideoPlaybackEventListener");
        this.f31753a = nativeVideoPlaybackEventListener;
    }

    @Override // com.yandex.mobile.ads.impl.rc2
    public final void a(long j4, long j5) {
        this.f31753a.a(j4, j5);
    }
}
