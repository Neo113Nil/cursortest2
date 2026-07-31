package com.yandex.div.core.view2;

import android.graphics.Rect;
import android.view.View;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes2.dex */
public class ViewVisibilityCalculator {

    @NotNull
    private final Rect visibleRect = new Rect();

    public int calculateVisibilityPercentage(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        if (!view.isShown() || !view.getGlobalVisibleRect(this.visibleRect)) {
            return 0;
        }
        return ((this.visibleRect.width() * this.visibleRect.height()) * 100) / (view.getWidth() * view.getHeight());
    }

    public boolean isViewFullyVisible(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        return view.isShown() && view.getGlobalVisibleRect(this.visibleRect) && view.getWidth() == this.visibleRect.width() && view.getHeight() == this.visibleRect.height();
    }
}
