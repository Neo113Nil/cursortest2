package com.yandex.mobile.ads.impl;

import android.os.Build;
import android.view.View;
import android.view.Window;
import android.widget.RelativeLayout;
import androidx.core.graphics.Insets;
import androidx.core.view.AbstractC1281a0;
import androidx.core.view.AbstractC1309o0;
import androidx.core.view.WindowInsetsCompat;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class xc0 {

    /* renamed from: a, reason: collision with root package name */
    @Nullable
    private final gs f34514a;

    public xc0(@Nullable gs gsVar) {
        this.f34514a = gsVar;
    }

    private static void b(RelativeLayout relativeLayout) {
        AbstractC1281a0.E0(relativeLayout, new androidx.core.view.J() { // from class: com.yandex.mobile.ads.impl.Il
            @Override // androidx.core.view.J
            public final WindowInsetsCompat onApplyWindowInsets(View view, WindowInsetsCompat windowInsetsCompat) {
                WindowInsetsCompat b4;
                b4 = xc0.b(view, windowInsetsCompat);
                return b4;
            }
        });
    }

    public final void a(@NotNull Window window, @NotNull RelativeLayout rootView) {
        Intrinsics.checkNotNullParameter(window, "window");
        Intrinsics.checkNotNullParameter(rootView, "rootView");
        AbstractC1309o0.b(window, false);
        if (C2385z9.a(30)) {
            window.getAttributes().layoutInDisplayCutoutMode = 3;
        } else if (C2385z9.a(28)) {
            window.getAttributes().layoutInDisplayCutoutMode = 1;
        }
        if (this.f34514a != gs.f26285i) {
            if (Build.VERSION.SDK_INT >= 28) {
                a(rootView);
            } else {
                b(rootView);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final WindowInsetsCompat b(View v4, WindowInsetsCompat windowInsets) {
        Intrinsics.checkNotNullParameter(v4, "v");
        Intrinsics.checkNotNullParameter(windowInsets, "windowInsets");
        v4.setPadding(windowInsets.getSystemWindowInsetLeft(), windowInsets.getSystemWindowInsetTop(), windowInsets.getSystemWindowInsetRight(), windowInsets.getSystemWindowInsetBottom());
        return windowInsets;
    }

    private static void a(RelativeLayout relativeLayout) {
        AbstractC1281a0.E0(relativeLayout, new androidx.core.view.J() { // from class: com.yandex.mobile.ads.impl.Hl
            @Override // androidx.core.view.J
            public final WindowInsetsCompat onApplyWindowInsets(View view, WindowInsetsCompat windowInsetsCompat) {
                WindowInsetsCompat a4;
                a4 = xc0.a(view, windowInsetsCompat);
                return a4;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final WindowInsetsCompat a(View v4, WindowInsetsCompat windowInsets) {
        Intrinsics.checkNotNullParameter(v4, "v");
        Intrinsics.checkNotNullParameter(windowInsets, "windowInsets");
        Insets insets = windowInsets.getInsets(WindowInsetsCompat.Type.systemBars() | WindowInsetsCompat.Type.displayCutout());
        Intrinsics.checkNotNullExpressionValue(insets, "getInsets(...)");
        v4.setPadding(insets.left, insets.top, insets.right, insets.bottom);
        return WindowInsetsCompat.CONSUMED;
    }
}
