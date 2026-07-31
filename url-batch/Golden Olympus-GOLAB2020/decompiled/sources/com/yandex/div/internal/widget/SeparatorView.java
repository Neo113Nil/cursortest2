package com.yandex.div.internal.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import com.yandex.div.internal.Assert;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* loaded from: classes2.dex */
public abstract class SeparatorView extends View {
    private int dividerGravity;

    @NotNull
    private final Paint dividerPaint;

    @NotNull
    private final Rect dividerRect;
    private int dividerThickness;
    private boolean isDividerRectChanged;
    private boolean isHorizontal;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SeparatorView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
        Intrinsics.checkNotNullParameter(context, "context");
        Paint paint = new Paint();
        paint.setColor(0);
        this.dividerPaint = paint;
        this.dividerRect = new Rect();
        this.isHorizontal = true;
        this.dividerGravity = 17;
    }

    private final int calcSize(int i4, int i5) {
        int mode = View.MeasureSpec.getMode(i5);
        int size = View.MeasureSpec.getSize(i5);
        return mode != Integer.MIN_VALUE ? mode != 1073741824 ? i4 : size : Math.min(i4, size);
    }

    public static /* synthetic */ void getDividerGravity$annotations() {
    }

    private final boolean isDividerVisible() {
        return Color.alpha(this.dividerPaint.getColor()) > 0;
    }

    private final void updateDividerRect() {
        if (this.isDividerRectChanged) {
            int paddingTop = this.isHorizontal ? getPaddingTop() : getPaddingLeft();
            int paddingBottom = this.isHorizontal ? getPaddingBottom() : getPaddingRight();
            int height = this.isHorizontal ? getHeight() : getWidth();
            int i4 = (height - paddingTop) - paddingBottom;
            int i5 = this.dividerGravity;
            if (i5 == 17) {
                paddingTop += (i4 - this.dividerThickness) / 2;
            } else if (i5 != 8388611) {
                if (i5 != 8388613) {
                    Assert.fail("Unknown divider gravity value");
                    paddingTop = 0;
                } else {
                    paddingTop = (height - paddingBottom) - this.dividerThickness;
                }
            }
            if (this.isHorizontal) {
                Rect rect = this.dividerRect;
                rect.top = paddingTop;
                rect.bottom = paddingTop + Math.min(i4, this.dividerThickness);
                this.dividerRect.left = getPaddingLeft();
                this.dividerRect.right = getWidth() - getPaddingRight();
            } else {
                Rect rect2 = this.dividerRect;
                rect2.left = paddingTop;
                rect2.right = paddingTop + Math.min(i4, this.dividerThickness);
                this.dividerRect.top = getPaddingTop();
                this.dividerRect.bottom = getHeight() - getPaddingBottom();
            }
            this.isDividerRectChanged = false;
        }
    }

    public final int getDividerColor() {
        return this.dividerPaint.getColor();
    }

    public final int getDividerGravity() {
        return this.dividerGravity;
    }

    public final int getDividerThickness() {
        return this.dividerThickness;
    }

    @Override // android.view.View
    protected void onDraw(@NotNull Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        super.onDraw(canvas);
        if (isDividerVisible()) {
            updateDividerRect();
            canvas.drawRect(this.dividerRect, this.dividerPaint);
        }
    }

    @Override // android.view.View
    protected void onMeasure(int i4, int i5) {
        int paddingLeft = getPaddingLeft() + getPaddingRight();
        int paddingTop = getPaddingTop() + getPaddingBottom();
        if (this.isHorizontal) {
            paddingTop += this.dividerThickness;
        } else {
            paddingLeft += this.dividerThickness;
        }
        setMeasuredDimension(calcSize(Math.max(paddingLeft, getSuggestedMinimumWidth()), i4), calcSize(Math.max(paddingTop, getSuggestedMinimumHeight()), i5));
    }

    @Override // android.view.View
    protected void onSizeChanged(int i4, int i5, int i6, int i7) {
        super.onSizeChanged(i4, i5, i6, i7);
        this.isDividerRectChanged = true;
    }

    public final void setDividerColor(int i4) {
        if (this.dividerPaint.getColor() != i4) {
            this.dividerPaint.setColor(i4);
            invalidate();
        }
    }

    public final void setDividerColorResource(int i4) {
        setDividerColor(androidx.core.content.a.d(getContext(), i4));
    }

    public final void setDividerGravity(int i4) {
        if (this.dividerGravity != i4) {
            this.dividerGravity = i4;
            this.isDividerRectChanged = true;
            invalidate();
        }
    }

    public final void setDividerHeightResource(int i4) {
        setDividerThickness(getResources().getDimensionPixelSize(i4));
    }

    public final void setDividerThickness(int i4) {
        if (this.dividerThickness != i4) {
            this.dividerThickness = i4;
            this.isDividerRectChanged = true;
            requestLayout();
        }
    }

    public final void setHorizontal(boolean z4) {
        if (this.isHorizontal != z4) {
            this.isHorizontal = z4;
            this.isDividerRectChanged = true;
            requestLayout();
        }
    }

    @Override // android.view.View
    public void setPadding(int i4, int i5, int i6, int i7) {
        super.setPadding(i4, i5, i6, i7);
        this.isDividerRectChanged = true;
    }
}
