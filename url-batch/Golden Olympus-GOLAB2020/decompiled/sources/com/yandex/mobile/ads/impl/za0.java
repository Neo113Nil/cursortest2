package com.yandex.mobile.ads.impl;

import android.view.View;
import com.monetization.ads.video.playback.view.ExtendedVideoAdControlsContainer;
import com.yandex.mobile.ads.impl.au0;
import j2.AbstractC3185a;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class za0 implements au0 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final View f35537a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final au0.a f35538b;

    public za0(@NotNull ExtendedVideoAdControlsContainer container) {
        Intrinsics.checkNotNullParameter(container, "container");
        this.f35537a = container;
        this.f35538b = new au0.a();
    }

    @Override // com.yandex.mobile.ads.impl.au0
    @NotNull
    public final au0.a a(int i4, int i5) {
        int c4 = AbstractC3185a.c(this.f35537a.getHeight() * 0.1f);
        au0.a aVar = this.f35538b;
        aVar.f23449a = i4;
        aVar.f23450b = View.MeasureSpec.makeMeasureSpec(c4, 1073741824);
        return this.f35538b;
    }
}
