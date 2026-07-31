package com.yandex.mobile.ads.impl;

import com.google.android.exoplayer2.Player;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: com.yandex.mobile.ads.impl.a6, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1797a6 implements vl1 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final C1824b9 f23166a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final ni1 f23167b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final r60 f23168c;

    public C1797a6(@NotNull C1824b9 adStateHolder, @NotNull li1 playerStateController, @NotNull ni1 playerStateHolder, @NotNull r60 playerProvider) {
        Intrinsics.checkNotNullParameter(adStateHolder, "adStateHolder");
        Intrinsics.checkNotNullParameter(playerStateController, "playerStateController");
        Intrinsics.checkNotNullParameter(playerStateHolder, "playerStateHolder");
        Intrinsics.checkNotNullParameter(playerProvider, "playerProvider");
        this.f23166a = adStateHolder;
        this.f23167b = playerStateHolder;
        this.f23168c = playerProvider;
    }

    @Override // com.yandex.mobile.ads.impl.vl1
    @NotNull
    public final uh1 a() {
        on0 d4;
        Player a4;
        ui1 c4 = this.f23166a.c();
        if (c4 == null || (d4 = c4.d()) == null) {
            return uh1.f33135c;
        }
        return (em0.f25351b == this.f23166a.a(d4) || !this.f23167b.c() || (a4 = this.f23168c.a()) == null) ? uh1.f33135c : new uh1(a4.getCurrentPosition(), a4.getDuration());
    }
}
