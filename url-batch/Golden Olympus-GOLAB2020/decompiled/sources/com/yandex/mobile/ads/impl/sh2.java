package com.yandex.mobile.ads.impl;

import android.view.View;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class sh2 implements bp {
    @Override // com.yandex.mobile.ads.impl.bp
    public final void a(@NotNull View closeView) {
        Intrinsics.checkNotNullParameter(closeView, "closeView");
        closeView.setVisibility(8);
    }

    @Override // com.yandex.mobile.ads.impl.bp
    public final void b(@NotNull View closeView) {
        Intrinsics.checkNotNullParameter(closeView, "closeView");
        closeView.setVisibility(0);
    }
}
