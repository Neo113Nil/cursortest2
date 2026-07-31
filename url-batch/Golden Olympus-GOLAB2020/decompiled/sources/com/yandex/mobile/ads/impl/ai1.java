package com.yandex.mobile.ads.impl;

import androidx.media3.common.Player;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class ai1 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final q60 f23282a;

    public ai1(@NotNull q60 playerProvider) {
        Intrinsics.checkNotNullParameter(playerProvider, "playerProvider");
        this.f23282a = playerProvider;
    }

    public final void a() {
        Player a4 = this.f23282a.a();
        if (a4 == null) {
            return;
        }
        a4.setPlayWhenReady(false);
    }

    public final void b() {
        Player a4 = this.f23282a.a();
        if (a4 == null) {
            return;
        }
        a4.setPlayWhenReady(true);
    }
}
