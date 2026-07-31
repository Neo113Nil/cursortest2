package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: com.yandex.mobile.ads.impl.w7, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2314w7 {
    @NotNull
    public static RelativeLayout.LayoutParams a(@NotNull Context context, @Nullable vy1 vy1Var) {
        RelativeLayout.LayoutParams layoutParams;
        Intrinsics.checkNotNullParameter(context, "context");
        if (vy1Var != null) {
            layoutParams = new RelativeLayout.LayoutParams(lh2.a(context, vy1Var.c(context)), lh2.a(context, vy1Var.a(context)));
        } else {
            layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        }
        layoutParams.addRule(13);
        return layoutParams;
    }

    @NotNull
    public static final RelativeLayout.LayoutParams a(@NotNull Context context, @NotNull ed0 anchorView) {
        boolean z4;
        int i4;
        int i5;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(anchorView, "anchorView");
        int a4 = lh2.a(context, 25.0f);
        int a5 = lh2.a(context, 64.0f);
        int i6 = a5 >> 1;
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(a5, a5);
        layoutParams.addRule(7, anchorView.getId());
        layoutParams.addRule(6, anchorView.getId());
        ViewGroup.LayoutParams layoutParams2 = anchorView.getLayoutParams();
        int i7 = layoutParams2.width;
        boolean z5 = true;
        if (i7 != -1) {
            int i8 = i7 + a4;
            Intrinsics.checkNotNullParameter(context, "context");
            if (i8 < context.getResources().getDisplayMetrics().widthPixels) {
                z4 = false;
                i4 = layoutParams2.height;
                if (i4 != -1 && i4 + a4 < lh2.c(context)) {
                    z5 = false;
                }
                i5 = (a4 >> 1) - ((a5 - a4) / 2);
                if (!z4 && !z5) {
                    i5 = -i6;
                }
                layoutParams.setMargins(0, i5, i5, 0);
                return layoutParams;
            }
        }
        z4 = true;
        i4 = layoutParams2.height;
        if (i4 != -1) {
            z5 = false;
        }
        i5 = (a4 >> 1) - ((a5 - a4) / 2);
        if (!z4) {
            i5 = -i6;
        }
        layoutParams.setMargins(0, i5, i5, 0);
        return layoutParams;
    }

    @NotNull
    public static final RelativeLayout.LayoutParams a(@NotNull Context context, @Nullable C2360y7<?> c2360y7) {
        RelativeLayout.LayoutParams layoutParams;
        Intrinsics.checkNotNullParameter(context, "context");
        if (c2360y7 != null) {
            layoutParams = new RelativeLayout.LayoutParams(lh2.a(context, c2360y7.r()), lh2.a(context, c2360y7.c()));
        } else {
            layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        }
        layoutParams.addRule(13);
        return layoutParams;
    }
}
