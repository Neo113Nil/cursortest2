package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.tm0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class oz {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final tm0 f30232a;

    public oz(@NotNull si1 playerVolumeProvider) {
        Intrinsics.checkNotNullParameter(playerVolumeProvider, "playerVolumeProvider");
        tm0.a aVar = new tm0.a();
        float volume = playerVolumeProvider.getVolume();
        if (volume == 0.0f) {
            aVar.a(1.0f);
            aVar.b(true);
        } else {
            aVar.a(volume);
            aVar.b(false);
        }
        this.f30232a = aVar.a();
    }

    @NotNull
    public final tm0 a() {
        return this.f30232a;
    }
}
