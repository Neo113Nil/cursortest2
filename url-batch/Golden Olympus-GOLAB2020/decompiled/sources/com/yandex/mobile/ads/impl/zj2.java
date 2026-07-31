package com.yandex.mobile.ads.impl;

import android.graphics.Rect;
import android.view.View;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class zj2 {
    @NotNull
    public static Rect a(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Rect rect = new Rect();
        try {
            view.getWindowVisibleDisplayFrame(rect);
        } catch (NullPointerException unused) {
        }
        int[] iArr = {r2, r3};
        view.getRootView().getLocationOnScreen(iArr);
        int i4 = -iArr[0];
        int i5 = -iArr[1];
        rect.offset(i4, i5);
        return rect;
    }
}
