package com.yandex.mobile.ads.impl;

import com.google.android.exoplayer2.Player;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class bi1 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final r60 f23827a;

    public bi1(@NotNull r60 playerProvider) {
        Intrinsics.checkNotNullParameter(playerProvider, "playerProvider");
        this.f23827a = playerProvider;
    }

    public final void a() {
        Player a4 = this.f23827a.a();
        if (a4 == null) {
            return;
        }
        a4.setPlayWhenReady(false);
    }

    public final void b() {
        Player a4 = this.f23827a.a();
        if (a4 == null) {
            return;
        }
        a4.setPlayWhenReady(true);
    }
}
