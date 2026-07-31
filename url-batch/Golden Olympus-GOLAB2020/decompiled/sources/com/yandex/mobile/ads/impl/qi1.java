package com.yandex.mobile.ads.impl;

import androidx.media3.common.Player;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class qi1 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final q60 f30793a;

    /* renamed from: b, reason: collision with root package name */
    @Nullable
    private Float f30794b;

    public qi1(@NotNull q60 playerProvider) {
        Intrinsics.checkNotNullParameter(playerProvider, "playerProvider");
        this.f30793a = playerProvider;
    }

    public final void a(float f4) {
        if (this.f30794b == null) {
            this.f30794b = a();
        }
        Player a4 = this.f30793a.a();
        if (a4 == null) {
            return;
        }
        a4.setVolume(f4);
    }

    public final void b() {
        Float f4 = this.f30794b;
        if (f4 != null) {
            float floatValue = f4.floatValue();
            Player a4 = this.f30793a.a();
            if (a4 != null) {
                a4.setVolume(floatValue);
            }
        }
        this.f30794b = null;
    }

    @Nullable
    public final Float a() {
        Player a4 = this.f30793a.a();
        if (a4 != null) {
            return Float.valueOf(a4.getVolume());
        }
        return null;
    }
}
