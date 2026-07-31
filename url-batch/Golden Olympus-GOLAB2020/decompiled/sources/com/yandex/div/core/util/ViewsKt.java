package com.yandex.div.core.util;

import android.os.Build;
import android.view.View;
import androidx.core.view.AbstractC1281a0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.d;
import kotlin.ranges.g;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes2.dex */
public abstract class ViewsKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final View farthestLayoutCaller(View view) {
        View view2 = null;
        while (view != null) {
            if (!isActuallyLaidOut(view) || view.isLayoutRequested()) {
                view2 = view;
            }
            Object parent = view.getParent();
            view = parent instanceof View ? (View) parent : null;
        }
        return view2;
    }

    @NotNull
    public static final d getIndices(@NotNull View view, int i4, int i5) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        int i6 = i5 + i4;
        return isLayoutRtl(view) ? g.m(i6 - 1, i4) : g.p(i4, i6);
    }

    public static final boolean isActuallyLaidOut(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        return view.getWidth() > 0 || view.getHeight() > 0;
    }

    public static final boolean isHierarchyLaidOut(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        return farthestLayoutCaller(view) == null;
    }

    public static final boolean isLayoutRtl(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        return AbstractC1281a0.C(view) == 1;
    }

    public static final void makeFocusable(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        view.setFocusable(true);
        view.setFocusableInTouchMode(true);
        if (Build.VERSION.SDK_INT >= 26) {
            view.setDefaultFocusHighlightEnabled(false);
        }
    }
}
