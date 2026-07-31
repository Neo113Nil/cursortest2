package com.yandex.div.core.view2.divs.pager;

import O1.E9;
import W1.m;
import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.yandex.div.core.widget.ViewsKt;
import j2.AbstractC3185a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes2.dex */
public final class WrapContentPageSizeItemDecoration extends RecyclerView.o {

    @NotNull
    private final E9.c alignment;

    @NotNull
    private final DivPagerPaddingsHolder paddings;
    private final int parentSize;

    @Metadata
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[E9.c.values().length];
            try {
                iArr[E9.c.START.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[E9.c.CENTER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[E9.c.END.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public WrapContentPageSizeItemDecoration(int i4, @NotNull DivPagerPaddingsHolder paddings, @NotNull E9.c alignment) {
        Intrinsics.checkNotNullParameter(paddings, "paddings");
        Intrinsics.checkNotNullParameter(alignment, "alignment");
        this.parentSize = i4;
        this.paddings = paddings;
        this.alignment = alignment;
    }

    private final int getBottomOffset(View view) {
        float start;
        int i4 = WhenMappings.$EnumSwitchMapping$0[this.alignment.ordinal()];
        if (i4 == 1) {
            start = (this.parentSize - this.paddings.getStart()) - view.getMeasuredHeight();
        } else if (i4 == 2) {
            start = (this.parentSize - view.getMeasuredHeight()) / 2.0f;
        } else {
            if (i4 != 3) {
                throw new m();
            }
            start = this.paddings.getEnd();
        }
        return AbstractC3185a.c(start);
    }

    private final int getHorizontalOffset(View view) {
        float start;
        int measuredWidth;
        float f4;
        int i4 = WhenMappings.$EnumSwitchMapping$0[this.alignment.ordinal()];
        if (i4 == 1) {
            start = this.parentSize - this.paddings.getStart();
            measuredWidth = view.getMeasuredWidth();
        } else {
            if (i4 == 2) {
                f4 = (this.parentSize - view.getMeasuredWidth()) / 2.0f;
                return AbstractC3185a.c(f4);
            }
            if (i4 != 3) {
                throw new m();
            }
            start = this.parentSize - this.paddings.getEnd();
            measuredWidth = view.getMeasuredWidth();
        }
        f4 = start - measuredWidth;
        return AbstractC3185a.c(f4);
    }

    private final int getTopOffset(View view) {
        float start;
        int i4 = WhenMappings.$EnumSwitchMapping$0[this.alignment.ordinal()];
        if (i4 == 1) {
            start = this.paddings.getStart();
        } else if (i4 == 2) {
            start = (this.parentSize - view.getMeasuredHeight()) / 2.0f;
        } else {
            if (i4 != 3) {
                throw new m();
            }
            start = (this.parentSize - this.paddings.getEnd()) - view.getMeasuredHeight();
        }
        return AbstractC3185a.c(start);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void getItemOffsets(@NotNull Rect outRect, @NotNull View view, @NotNull RecyclerView parent, @NotNull RecyclerView.A state) {
        View child;
        Intrinsics.checkNotNullParameter(outRect, "outRect");
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(parent, "parent");
        Intrinsics.checkNotNullParameter(state, "state");
        int width = parent.getWidth();
        DivPagerPaddingsHolder divPagerPaddingsHolder = this.paddings;
        int c4 = width - AbstractC3185a.c(divPagerPaddingsHolder.getLeft() + divPagerPaddingsHolder.getRight());
        int height = parent.getHeight();
        DivPagerPaddingsHolder divPagerPaddingsHolder2 = this.paddings;
        view.measure(ViewsKt.makeExactSpec(c4), ViewsKt.makeExactSpec(height - AbstractC3185a.c(divPagerPaddingsHolder2.getTop() + divPagerPaddingsHolder2.getBottom())));
        DivPagerPageLayout divPagerPageLayout = view instanceof DivPagerPageLayout ? (DivPagerPageLayout) view : null;
        if (divPagerPageLayout == null || (child = divPagerPageLayout.getChild()) == null) {
            return;
        }
        Integer alignedLeft = this.paddings.getAlignedLeft();
        int intValue = alignedLeft != null ? alignedLeft.intValue() : getHorizontalOffset(child);
        Integer alignedTop = this.paddings.getAlignedTop();
        int intValue2 = alignedTop != null ? alignedTop.intValue() : getTopOffset(child);
        Integer alignedRight = this.paddings.getAlignedRight();
        int intValue3 = alignedRight != null ? alignedRight.intValue() : getHorizontalOffset(child);
        Integer alignedBottom = this.paddings.getAlignedBottom();
        outRect.set(intValue, intValue2, intValue3, alignedBottom != null ? alignedBottom.intValue() : getBottomOffset(child));
    }
}
