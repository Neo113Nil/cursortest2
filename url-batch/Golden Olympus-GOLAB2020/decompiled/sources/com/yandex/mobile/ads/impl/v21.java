package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.monetization.ads.fullscreen.template.view.ExtendedViewContainer;
import com.yandex.mobile.ads.impl.au0;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class v21 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final b31 f33489a = new b31();

    @NotNull
    public final ExtendedViewContainer a(@NotNull Context context, @NotNull List<ej0> imageValues) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(imageValues, "imageValues");
        ExtendedViewContainer extendedViewContainer = new ExtendedViewContainer(context, null, 0, 6, null);
        this.f33489a.getClass();
        extendedViewContainer.setMeasureSpecProvider(new fm1((float) b31.a(imageValues), new au0.a()));
        return extendedViewContainer;
    }
}
