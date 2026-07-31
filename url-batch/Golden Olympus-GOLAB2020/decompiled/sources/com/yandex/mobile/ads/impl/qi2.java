package com.yandex.mobile.ads.impl;

import android.view.View;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class qi2 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final p31 f30795a;

    public qi2(@NotNull p31 muteControlResources) {
        Intrinsics.checkNotNullParameter(muteControlResources, "muteControlResources");
        this.f30795a = muteControlResources;
    }

    public final void a(@NotNull View volumeControl, boolean z4) {
        int c4;
        Intrinsics.checkNotNullParameter(volumeControl, "volumeControl");
        int b4 = z4 ? this.f30795a.b() : this.f30795a.d();
        if (z4) {
            c4 = this.f30795a.a();
        } else {
            if (z4) {
                throw new W1.m();
            }
            c4 = this.f30795a.c();
        }
        volumeControl.setBackground(androidx.core.content.a.g(volumeControl.getContext(), b4));
        volumeControl.setContentDescription(androidx.core.content.a.k(volumeControl.getContext(), c4));
    }
}
