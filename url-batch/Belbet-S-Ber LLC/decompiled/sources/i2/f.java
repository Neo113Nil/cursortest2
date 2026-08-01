package i2;

import android.view.View;
import android.view.ViewGroup;
import com.gdmhkmf.belbet.R;
import com.google.android.material.chip.ChipGroup;

/* compiled from: r8-map-id-cbdb90155a17acee3f5e5c838b1038a1056cff151b1a2a170c159711c8afb558 */
/* loaded from: classes.dex */
public abstract class f extends ViewGroup {

    /* renamed from: f, reason: collision with root package name */
    public int f2039f;

    /* renamed from: g, reason: collision with root package name */
    public int f2040g;
    public boolean h;
    public int i;

    public int getItemSpacing() {
        return this.f2040g;
    }

    public int getLineSpacing() {
        return this.f2039f;
    }

    public int getRowCount() {
        return this.i;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z4, int i, int i4, int i5, int i6) {
        int i7;
        int i8;
        boolean z5;
        int i9 = 0;
        if (getChildCount() == 0) {
            this.i = 0;
            return;
        }
        boolean z6 = true;
        this.i = 1;
        boolean z7 = getLayoutDirection() == 1;
        int paddingRight = z7 ? getPaddingRight() : getPaddingLeft();
        int paddingLeft = z7 ? getPaddingLeft() : getPaddingRight();
        int paddingTop = getPaddingTop();
        int i10 = 0;
        int i11 = paddingRight;
        int i12 = paddingTop;
        while (i10 < getChildCount()) {
            View childAt = getChildAt(i10);
            if (childAt.getVisibility() == 8) {
                childAt.setTag(R.id.row_index_key, -1);
                z5 = z6;
            } else {
                ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                    i8 = marginLayoutParams.getMarginStart();
                    i7 = marginLayoutParams.getMarginEnd();
                } else {
                    i7 = i9;
                    i8 = i7;
                }
                int measuredWidth = childAt.getMeasuredWidth() + i11 + i8;
                int i13 = i5 - i;
                z5 = z6;
                int i14 = i13 - paddingLeft;
                if (!this.h && measuredWidth > i14) {
                    measuredWidth = childAt.getMeasuredWidth() + paddingRight + i8;
                    i12 = paddingTop + this.f2039f;
                    this.i++;
                    i11 = paddingRight;
                }
                childAt.setTag(R.id.row_index_key, Integer.valueOf(this.i - 1));
                int measuredHeight = childAt.getMeasuredHeight() + i12;
                if (z7) {
                    childAt.layout(i13 - measuredWidth, i12, (i13 - i11) - i8, measuredHeight);
                } else {
                    childAt.layout(i11 + i8, i12, measuredWidth, measuredHeight);
                }
                i11 += childAt.getMeasuredWidth() + i8 + i7 + this.f2040g;
                paddingTop = measuredHeight;
            }
            i10++;
            z6 = z5;
            i9 = 0;
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i4) {
        int i5;
        int i6;
        int i7;
        int size = View.MeasureSpec.getSize(i);
        int mode = View.MeasureSpec.getMode(i);
        int size2 = View.MeasureSpec.getSize(i4);
        int mode2 = View.MeasureSpec.getMode(i4);
        int i8 = (mode == Integer.MIN_VALUE || mode == 1073741824) ? size : Integer.MAX_VALUE;
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingRight = i8 - getPaddingRight();
        int i9 = paddingTop;
        int i10 = 0;
        for (int i11 = 0; i11 < getChildCount(); i11++) {
            View childAt = getChildAt(i11);
            if (childAt.getVisibility() != 8) {
                measureChild(childAt, i, i4);
                ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                    i7 = marginLayoutParams.leftMargin;
                    i6 = marginLayoutParams.rightMargin;
                } else {
                    i6 = 0;
                    i7 = 0;
                }
                int i12 = i6;
                if (childAt.getMeasuredWidth() + paddingLeft + i7 > paddingRight && !((ChipGroup) this).h) {
                    paddingLeft = getPaddingLeft();
                    i9 = paddingTop + this.f2039f;
                }
                int measuredWidth = childAt.getMeasuredWidth() + paddingLeft + i7;
                int measuredHeight = childAt.getMeasuredHeight() + i9;
                if (measuredWidth > i10) {
                    i10 = measuredWidth;
                }
                int measuredWidth2 = childAt.getMeasuredWidth() + i7 + i12 + this.f2040g + paddingLeft;
                if (i11 == getChildCount() - 1) {
                    i10 += i12;
                }
                paddingLeft = measuredWidth2;
                paddingTop = measuredHeight;
            }
        }
        int paddingRight2 = getPaddingRight() + i10;
        int paddingBottom = getPaddingBottom() + paddingTop;
        if (mode != Integer.MIN_VALUE) {
            i5 = 1073741824;
            if (mode != 1073741824) {
                size = paddingRight2;
            }
        } else {
            i5 = 1073741824;
            size = Math.min(paddingRight2, size);
        }
        if (mode2 == Integer.MIN_VALUE) {
            size2 = Math.min(paddingBottom, size2);
        } else if (mode2 != i5) {
            size2 = paddingBottom;
        }
        setMeasuredDimension(size, size2);
    }

    public void setItemSpacing(int i) {
        this.f2040g = i;
    }

    public void setLineSpacing(int i) {
        this.f2039f = i;
    }

    public void setSingleLine(boolean z4) {
        this.h = z4;
    }
}
