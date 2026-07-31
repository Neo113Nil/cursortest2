package com.yandex.mobile.ads.impl;

import androidx.media3.common.Player;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: com.yandex.mobile.ads.impl.z5, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2381z5 implements ul1 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final C1800a9 f35467a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final mi1 f35468b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final q60 f35469c;

    public C2381z5(@NotNull C1800a9 adStateHolder, @NotNull ki1 playerStateController, @NotNull mi1 playerStateHolder, @NotNull q60 playerProvider) {
        Intrinsics.checkNotNullParameter(adStateHolder, "adStateHolder");
        Intrinsics.checkNotNullParameter(playerStateController, "playerStateController");
        Intrinsics.checkNotNullParameter(playerStateHolder, "playerStateHolder");
        Intrinsics.checkNotNullParameter(playerProvider, "playerProvider");
        this.f35467a = adStateHolder;
        this.f35468b = playerStateHolder;
        this.f35469c = playerProvider;
    }

    @Override // com.yandex.mobile.ads.impl.ul1
    @NotNull
    public final vh1 a() {
        on0 d4;
        Player a4;
        ti1 c4 = this.f35467a.c();
        if (c4 == null || (d4 = c4.d()) == null) {
            return vh1.f33627c;
        }
        return (dm0.f24678b == this.f35467a.a(d4) || !this.f35468b.c() || (a4 = this.f35469c.a()) == null) ? vh1.f33627c : new vh1(a4.getCurrentPosition(), a4.getDuration());
    }
}
