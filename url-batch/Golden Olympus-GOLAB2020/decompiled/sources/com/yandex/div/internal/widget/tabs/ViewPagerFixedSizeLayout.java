package com.yandex.div.internal.widget.tabs;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* loaded from: classes2.dex */
public final class ViewPagerFixedSizeLayout extends FrameLayout {
    private int _collapsiblePaddingBottom;
    private boolean animateOnScroll;

    @Nullable
    private HeightCalculator heightCalculator;

    @Nullable
    private Integer lastHeightMeasureSpec;

    @Nullable
    private Rect visibleRect;

    @Metadata
    public interface HeightCalculator {
        void dropMeasureCache();

        int measureHeight(int i4, int i5);

        void setPositionAndOffsetForMeasure(int i4, float f4);

        boolean shouldRequestLayoutOnScroll(int i4, float f4);
    }

    public /* synthetic */ ViewPagerFixedSizeLayout(Context context, AttributeSet attributeSet, int i4, int i5, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i5 & 2) != 0 ? null : attributeSet, (i5 & 4) != 0 ? 0 : i4);
    }

    public final boolean getAnimateOnScroll() {
        return this.animateOnScroll;
    }

    public final int getCollapsiblePaddingBottom() {
        return this._collapsiblePaddingBottom;
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int i4, int i5) {
        this.lastHeightMeasureSpec = Integer.valueOf(i5);
        HeightCalculator heightCalculator = this.heightCalculator;
        if (heightCalculator != null) {
            Intrinsics.checkNotNull(heightCalculator);
            i5 = View.MeasureSpec.makeMeasureSpec(heightCalculator.measureHeight(i4, i5), 1073741824);
        }
        super.onMeasure(i4, i5);
    }

    public final void setAnimateOnScroll(boolean z4) {
        this.animateOnScroll = z4;
    }

    public final void setCollapsiblePaddingBottom(int i4) {
        if (this._collapsiblePaddingBottom != i4) {
            this._collapsiblePaddingBottom = i4;
        }
    }

    public final void setHeightCalculator(@Nullable HeightCalculator heightCalculator) {
        this.heightCalculator = heightCalculator;
    }

    public final boolean shouldRequestLayoutOnScroll(int i4, float f4) {
        HeightCalculator heightCalculator;
        if (this.animateOnScroll && (heightCalculator = this.heightCalculator) != null && heightCalculator.shouldRequestLayoutOnScroll(i4, f4)) {
            Rect rect = this.visibleRect;
            if (rect == null) {
                rect = new Rect();
                this.visibleRect = rect;
            }
            getLocalVisibleRect(rect);
            if (rect.height() == getHeight()) {
                return true;
            }
            int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getWidth(), 1073741824);
            Integer num = this.lastHeightMeasureSpec;
            int measureHeight = heightCalculator.measureHeight(makeMeasureSpec, num != null ? num.intValue() : View.MeasureSpec.makeMeasureSpec(0, 0));
            if (measureHeight != getHeight()) {
                int i5 = rect.top;
                if (measureHeight <= rect.bottom && i5 <= measureHeight) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ViewPagerFixedSizeLayout(@NotNull Context context, @Nullable AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
        Intrinsics.checkNotNullParameter(context, "context");
        this.animateOnScroll = true;
    }
}
