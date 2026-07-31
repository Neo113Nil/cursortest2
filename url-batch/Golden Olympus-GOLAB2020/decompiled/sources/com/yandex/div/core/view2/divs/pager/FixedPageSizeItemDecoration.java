package com.yandex.div.core.view2.divs.pager;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import j2.AbstractC3185a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes2.dex */
public final class FixedPageSizeItemDecoration extends RecyclerView.o {
    private final int offsetBottom;
    private final int offsetLeft;
    private final int offsetRight;
    private final int offsetTop;

    @NotNull
    private final FixedPageSizeProvider sizeProvider;

    public FixedPageSizeItemDecoration(@NotNull DivPagerPaddingsHolder paddings, @NotNull FixedPageSizeProvider sizeProvider) {
        Intrinsics.checkNotNullParameter(paddings, "paddings");
        Intrinsics.checkNotNullParameter(sizeProvider, "sizeProvider");
        this.sizeProvider = sizeProvider;
        this.offsetLeft = toOffset(paddings.getAlignedLeft());
        this.offsetTop = toOffset(paddings.getAlignedTop());
        this.offsetRight = toOffset(paddings.getAlignedRight());
        this.offsetBottom = toOffset(paddings.getAlignedBottom());
    }

    private final int toOffset(Integer num) {
        return num != null ? num.intValue() : AbstractC3185a.c(this.sizeProvider.getNeighbourSize());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void getItemOffsets(@NotNull Rect outRect, @NotNull View view, @NotNull RecyclerView parent, @NotNull RecyclerView.A state) {
        Intrinsics.checkNotNullParameter(outRect, "outRect");
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(parent, "parent");
        Intrinsics.checkNotNullParameter(state, "state");
        outRect.set(this.offsetLeft, this.offsetTop, this.offsetRight, this.offsetBottom);
    }
}
