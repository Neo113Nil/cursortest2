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
public final class MultiLineRenderer extends DivTextRangesBackgroundRenderer {

    @NotNull
    private final ExpressionResolver resolver;

    @NotNull
    private final View view;

    public MultiLineRenderer(@NotNull View view, @NotNull ExpressionResolver resolver) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(resolver, "resolver");
        this.view = view;
        this.resolver = resolver;
    }

    @Override // com.yandex.div.core.util.text.DivTextRangesBackgroundRenderer
    public void draw(@NotNull Canvas canvas, @NotNull Layout layout, int i4, int i5, int i6, int i7, @Nullable C0942me c0942me, @Nullable AbstractC0853he abstractC0853he) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        Intrinsics.checkNotNullParameter(layout, "layout");
        int paragraphDirection = layout.getParagraphDirection(i4);
        float lineLeft = paragraphDirection == -1 ? layout.getLineLeft(i4) : layout.getLineRight(i4);
        int lineBottom = getLineBottom(layout, i4);
        int lineTop = getLineTop(layout, i4);
        DisplayMetrics displayMetrics = this.view.getResources().getDisplayMetrics();
        Intrinsics.checkNotNullExpressionValue(displayMetrics, "view.resources.displayMetrics");
        BackgroundDrawer backgroundDrawer = new BackgroundDrawer(displayMetrics, c0942me, abstractC0853he, canvas, this.resolver);
        backgroundDrawer.drawBackgroundStart(i6, lineTop, (int) lineLeft, lineBottom);
        for (int i8 = i4 + 1; i8 < i5; i8++) {
            backgroundDrawer.drawBackgroundMiddle((int) layout.getLineLeft(i8), getLineTop(layout, i8), (int) layout.getLineRight(i8), getLineBottom(layout, i8));
        }
        backgroundDrawer.drawBackgroundEnd((int) (paragraphDirection == -1 ? layout.getLineRight(i4) : layout.getLineLeft(i4)), getLineTop(layout, i5), i7, getLineBottom(layout, i5));
    }
}
