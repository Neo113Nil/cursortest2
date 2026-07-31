package com.yandex.mobile.ads.impl;

import com.google.android.exoplayer2.Player;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class ri1 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final r60 f31232a;

    /* renamed from: b, reason: collision with root package name */
    @Nullable
    private Float f31233b;

    public ri1(@NotNull r60 playerProvider) {
        Intrinsics.checkNotNullParameter(playerProvider, "playerProvider");
        this.f31232a = playerProvider;
    }

    public final void a(float f4) {
        if (this.f31233b == null) {
            this.f31233b = a();
        }
        Player a4 = this.f31232a.a();
        if (a4 == null) {
            return;
        }
        a4.setVolume(f4);
    }

    public final void b() {
        Float f4 = this.f31233b;
        if (f4 != null) {
            float floatValue = f4.floatValue();
            Player a4 = this.f31232a.a();
            if (a4 != null) {
                a4.setVolume(floatValue);
            }
        }
        this.f31233b = null;
    }

    @Nullable
    public final Float a() {
        Player a4 = this.f31232a.a();
        if (a4 != null) {
            return Float.valueOf(a4.getVolume());
        }
        return null;
    }
}
