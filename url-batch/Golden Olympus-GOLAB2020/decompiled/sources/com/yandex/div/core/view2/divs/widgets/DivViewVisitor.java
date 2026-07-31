package com.yandex.div.core.view2.divs.widgets;

import android.view.View;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes2.dex */
public abstract class DivViewVisitor {
    public void defaultVisit(@NotNull DivHolderView<?> view) {
        Intrinsics.checkNotNullParameter(view, "view");
    }

    public void visit(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "view");
    }

    public void visit(@NotNull DivWrapLayout view) {
        Intrinsics.checkNotNullParameter(view, "view");
        defaultVisit(view);
    }

    public void visit(@NotNull DivFrameLayout view) {
        Intrinsics.checkNotNullParameter(view, "view");
        defaultVisit(view);
    }

    public void visit(@NotNull DivGifImageView view) {
        Intrinsics.checkNotNullParameter(view, "view");
        defaultVisit(view);
    }

    public void visit(@NotNull DivGridLayout view) {
        Intrinsics.checkNotNullParameter(view, "view");
        defaultVisit(view);
    }

    public void visit(@NotNull DivImageView view) {
        Intrinsics.checkNotNullParameter(view, "view");
        defaultVisit(view);
    }

    public void visit(@NotNull DivLinearLayout view) {
        Intrinsics.checkNotNullParameter(view, "view");
        defaultVisit(view);
    }

    public void visit(@NotNull DivLineHeightTextView view) {
        Intrinsics.checkNotNullParameter(view, "view");
        defaultVisit(view);
    }

    public void visit(@NotNull DivPagerIndicatorView view) {
        Intrinsics.checkNotNullParameter(view, "view");
        defaultVisit(view);
    }

    public void visit(@NotNull DivPagerView view) {
        Intrinsics.checkNotNullParameter(view, "view");
        defaultVisit(view);
    }

    public void visit(@NotNull DivRecyclerView view) {
        Intrinsics.checkNotNullParameter(view, "view");
        defaultVisit(view);
    }

    public void visit(@NotNull DivSeparatorView view) {
        Intrinsics.checkNotNullParameter(view, "view");
        defaultVisit(view);
    }

    public void visit(@NotNull DivStateLayout view) {
        Intrinsics.checkNotNullParameter(view, "view");
        defaultVisit(view);
    }

    public void visit(@NotNull DivTabsLayout view) {
        Intrinsics.checkNotNullParameter(view, "view");
        defaultVisit(view);
    }

    public void visit(@NotNull DivSliderView view) {
        Intrinsics.checkNotNullParameter(view, "view");
        defaultVisit(view);
    }

    public void visit(@NotNull DivSelectView view) {
        Intrinsics.checkNotNullParameter(view, "view");
        defaultVisit(view);
    }

    public void visit(@NotNull DivVideoView view) {
        Intrinsics.checkNotNullParameter(view, "view");
        defaultVisit(view);
    }

    public void visit(@NotNull DivCustomWrapper view) {
        Intrinsics.checkNotNullParameter(view, "view");
        defaultVisit(view);
    }

    public void visit(@NotNull DivSwitchView view) {
        Intrinsics.checkNotNullParameter(view, "view");
        defaultVisit(view);
    }
}
