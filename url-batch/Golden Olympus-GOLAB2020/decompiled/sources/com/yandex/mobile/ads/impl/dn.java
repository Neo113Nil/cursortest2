package com.yandex.mobile.ads.impl;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class dn implements nm0 {
    @Override // com.yandex.mobile.ads.impl.nm0
    public final void a(@NotNull db2 uiElements) {
        Intrinsics.checkNotNullParameter(uiElements, "uiElements");
        View c4 = uiElements.c();
        TextView f4 = uiElements.f();
        ImageView g4 = uiElements.g();
        if (f4 == null || f4.getVisibility() != 8 || g4 == null || g4.getVisibility() != 8 || c4 == null) {
            return;
        }
        c4.setBackground(null);
    }
}
