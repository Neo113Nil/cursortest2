package com.yandex.mobile.ads.impl;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class ba2<T> implements rc2 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final bg2 f23646a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final lc2<T> f23647b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final ig2 f23648c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f23649d;

    public /* synthetic */ ba2(hg2 hg2Var, cg2 cg2Var, lc2 lc2Var) {
        this(hg2Var, cg2Var, lc2Var, new ig2(hg2Var));
    }

    @Override // com.yandex.mobile.ads.impl.rc2
    public final void a(long j4, long j5) {
        if (this.f23649d || j5 <= 0 || !this.f23648c.a()) {
            return;
        }
        this.f23649d = true;
        this.f23646a.a(this.f23647b.getVolume(), j4);
    }

    public ba2(@NotNull hg2 videoViewProvider, @NotNull cg2 videoTracker, @NotNull lc2 videoAdPlayer, @NotNull ig2 singlePercentAreaValidator) {
        Intrinsics.checkNotNullParameter(videoViewProvider, "videoViewProvider");
        Intrinsics.checkNotNullParameter(videoTracker, "videoTracker");
        Intrinsics.checkNotNullParameter(videoAdPlayer, "videoAdPlayer");
        Intrinsics.checkNotNullParameter(singlePercentAreaValidator, "singlePercentAreaValidator");
        this.f23646a = videoTracker;
        this.f23647b = videoAdPlayer;
        this.f23648c = singlePercentAreaValidator;
    }
}
