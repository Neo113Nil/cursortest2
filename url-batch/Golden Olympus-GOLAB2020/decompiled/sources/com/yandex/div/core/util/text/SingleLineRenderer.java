package com.yandex.div.core.util.text;

import O1.AbstractC0853he;
import O1.C0942me;
import android.graphics.Canvas;
import android.text.Layout;
import android.util.DisplayMetrics;
import android.view.View;
import com.yandex.div.json.expressions.ExpressionResolver;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* loaded from: classes2.dex */
public final class SingleLineRenderer extends DivTextRangesBackgroundRenderer {

    @NotNull
    private final ExpressionResolver resolver;

    @NotNull
    private final View view;

    public SingleLineRenderer(@NotNull View view, @NotNull ExpressionResolver resolver) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(resolver, "resolver");
        this.view = view;
        this.resolver = resolver;
    }

    @Override // com.yandex.div.core.util.text.DivTextRangesBackgroundRenderer
    public void draw(@NotNull Canvas canvas, @NotNull Layout layout, int i4, int i5, int i6, int i7, @Nullable C0942me c0942me, @Nullable AbstractC0853he abstractC0853he) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        Intrinsics.checkNotNullParameter(layout, "layout");
        int lineTop = getLineTop(layout, i4);
        int lineBottom = getLineBottom(layout, i4);
        int min = Math.min(i6, i7);
        int max = Math.max(i6, i7);
        DisplayMetrics displayMetrics = this.view.getResources().getDisplayMetrics();
        Intrinsics.checkNotNullExpressionValue(displayMetrics, "view.resources.displayMetrics");
        new BackgroundDrawer(displayMetrics, c0942me, abstractC0853he, canvas, this.resolver).drawBackground(min, lineTop, max, lineBottom);
    }
}
