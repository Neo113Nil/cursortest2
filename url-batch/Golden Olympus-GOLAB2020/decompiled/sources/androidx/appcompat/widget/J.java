package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.LinearLayout;
import androidx.core.view.AbstractC1281a0;
import androidx.core.view.AbstractC1317t;
import com.ironsource.InterfaceC1490j3;

/* loaded from: classes.dex */
public abstract class J extends ViewGroup {
    private boolean mBaselineAligned;
    private int mBaselineAlignedChildIndex;
    private int mBaselineChildTop;
    private Drawable mDivider;
    private int mDividerHeight;
    private int mDividerPadding;
    private int mDividerWidth;
    private int mGravity;
    private int[] mMaxAscent;
    private int[] mMaxDescent;
    private int mOrientation;
    private int mShowDividers;
    private int mTotalLength;
    private boolean mUseLargestChild;
    private float mWeightSum;

    public static class a extends LinearLayout.LayoutParams {
        public a(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public a(int i4, int i5) {
            super(i4, i5);
        }

        public a(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public a(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
        }
    }

    public J(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    private void d(int i4, int i5) {
        int i6;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824);
        int i7 = 0;
        while (i7 < i4) {
            View virtualChildAt = getVirtualChildAt(i7);
            if (virtualChildAt.getVisibility() != 8) {
                a aVar = (a) virtualChildAt.getLayoutParams();
                if (((LinearLayout.LayoutParams) aVar).height == -1) {
                    int i8 = ((LinearLayout.LayoutParams) aVar).width;
                    ((LinearLayout.LayoutParams) aVar).width = virtualChildAt.getMeasuredWidth();
                    i6 = i5;
                    measureChildWithMargins(virtualChildAt, i6, 0, makeMeasureSpec, 0);
                    ((LinearLayout.LayoutParams) aVar).width = i8;
                    i7++;
                    i5 = i6;
                }
            }
            i6 = i5;
            i7++;
            i5 = i6;
        }
    }

    private void e(int i4, int i5) {
        int i6;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824);
        int i7 = 0;
        while (i7 < i4) {
            View virtualChildAt = getVirtualChildAt(i7);
            if (virtualChildAt.getVisibility() != 8) {
                a aVar = (a) virtualChildAt.getLayoutParams();
                if (((LinearLayout.LayoutParams) aVar).width == -1) {
                    int i8 = ((LinearLayout.LayoutParams) aVar).height;
                    ((LinearLayout.LayoutParams) aVar).height = virtualChildAt.getMeasuredHeight();
                    i6 = i5;
                    measureChildWithMargins(virtualChildAt, makeMeasureSpec, 0, i6, 0);
                    ((LinearLayout.LayoutParams) aVar).height = i8;
                    i7++;
                    i5 = i6;
                }
            }
            i6 = i5;
            i7++;
            i5 = i6;
        }
    }

    private void f(View view, int i4, int i5, int i6, int i7) {
        view.layout(i4, i5, i6 + i4, i7 + i5);
    }

    @Override // android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof a;
    }

    void drawDividersHorizontal(Canvas canvas) {
        int right;
        int left;
        int i4;
        int virtualChildCount = getVirtualChildCount();
        boolean b4 = k0.b(this);
        for (int i5 = 0; i5 < virtualChildCount; i5++) {
            View virtualChildAt = getVirtualChildAt(i5);
            if (virtualChildAt != null && virtualChildAt.getVisibility() != 8 && hasDividerBeforeChildAt(i5)) {
                a aVar = (a) virtualChildAt.getLayoutParams();
                drawVerticalDivider(canvas, b4 ? virtualChildAt.getRight() + ((LinearLayout.LayoutParams) aVar).rightMargin : (virtualChildAt.getLeft() - ((LinearLayout.LayoutParams) aVar).leftMargin) - this.mDividerWidth);
            }
        }
        if (hasDividerBeforeChildAt(virtualChildCount)) {
            View virtualChildAt2 = getVirtualChildAt(virtualChildCount - 1);
            if (virtualChildAt2 != null) {
                a aVar2 = (a) virtualChildAt2.getLayoutParams();
                if (b4) {
                    left = virtualChildAt2.getLeft() - ((LinearLayout.LayoutParams) aVar2).leftMargin;
                    i4 = this.mDividerWidth;
                    right = left - i4;
                } else {
                    right = virtualChildAt2.getRight() + ((LinearLayout.LayoutParams) aVar2).rightMargin;
                }
            } else if (b4) {
                right = getPaddingLeft();
            } else {
                left = getWidth() - getPaddingRight();
                i4 = this.mDividerWidth;
                right = left - i4;
            }
            drawVerticalDivider(canvas, right);
        }
    }

    void drawDividersVertical(Canvas canvas) {
        int virtualChildCount = getVirtualChildCount();
        for (int i4 = 0; i4 < virtualChildCount; i4++) {
            View virtualChildAt = getVirtualChildAt(i4);
            if (virtualChildAt != null && virtualChildAt.getVisibility() != 8 && hasDividerBeforeChildAt(i4)) {
                drawHorizontalDivider(canvas, (virtualChildAt.getTop() - ((LinearLayout.LayoutParams) ((a) virtualChildAt.getLayoutParams())).topMargin) - this.mDividerHeight);
            }
        }
        if (hasDividerBeforeChildAt(virtualChildCount)) {
            View virtualChildAt2 = getVirtualChildAt(virtualChildCount - 1);
            drawHorizontalDivider(canvas, virtualChildAt2 == null ? (getHeight() - getPaddingBottom()) - this.mDividerHeight : virtualChildAt2.getBottom() + ((LinearLayout.LayoutParams) ((a) virtualChildAt2.getLayoutParams())).bottomMargin);
        }
    }

    void drawHorizontalDivider(Canvas canvas, int i4) {
        this.mDivider.setBounds(getPaddingLeft() + this.mDividerPadding, i4, (getWidth() - getPaddingRight()) - this.mDividerPadding, this.mDividerHeight + i4);
        this.mDivider.draw(canvas);
    }

    void drawVerticalDivider(Canvas canvas, int i4) {
        this.mDivider.setBounds(i4, getPaddingTop() + this.mDividerPadding, this.mDividerWidth + i4, (getHeight() - getPaddingBottom()) - this.mDividerPadding);
        this.mDivider.draw(canvas);
    }

    @Override // android.view.View
    public int getBaseline() {
        int i4;
        if (this.mBaselineAlignedChildIndex < 0) {
            return super.getBaseline();
        }
        int childCount = getChildCount();
        int i5 = this.mBaselineAlignedChildIndex;
        if (childCount <= i5) {
            throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout set to an index that is out of bounds.");
        }
        View childAt = getChildAt(i5);
        int baseline = childAt.getBaseline();
        if (baseline == -1) {
            if (this.mBaselineAlignedChildIndex == 0) {
                return -1;
            }
            throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout points to a View that doesn't know how to get its baseline.");
        }
        int i6 = this.mBaselineChildTop;
        if (this.mOrientation == 1 && (i4 = this.mGravity & InterfaceC1490j3.d.b.f16818j) != 48) {
            if (i4 == 16) {
                i6 += ((((getBottom() - getTop()) - getPaddingTop()) - getPaddingBottom()) - this.mTotalLength) / 2;
            } else if (i4 == 80) {
                i6 = ((getBottom() - getTop()) - getPaddingBottom()) - this.mTotalLength;
            }
        }
        return i6 + ((LinearLayout.LayoutParams) ((a) childAt.getLayoutParams())).topMargin + baseline;
    }

    public int getBaselineAlignedChildIndex() {
        return this.mBaselineAlignedChildIndex;
    }

    int getChildrenSkipCount(View view, int i4) {
        return 0;
    }

    public Drawable getDividerDrawable() {
        return this.mDivider;
    }

    public int getDividerPadding() {
        return this.mDividerPadding;
    }

    public int getDividerWidth() {
        return this.mDividerWidth;
    }

    public int getGravity() {
        return this.mGravity;
    }

    int getLocationOffset(View view) {
        return 0;
    }

    int getNextLocationOffset(View view) {
        return 0;
    }

    public int getOrientation() {
        return this.mOrientation;
    }

    public int getShowDividers() {
        return this.mShowDividers;
    }

    View getVirtualChildAt(int i4) {
        return getChildAt(i4);
    }

    int getVirtualChildCount() {
        return getChildCount();
    }

    public float getWeightSum() {
        return this.mWeightSum;
    }

    protected boolean hasDividerBeforeChildAt(int i4) {
        if (i4 == 0) {
            return (this.mShowDividers & 1) != 0;
        }
        if (i4 == getChildCount()) {
            return (this.mShowDividers & 4) != 0;
        }
        if ((this.mShowDividers & 2) != 0) {
            for (int i5 = i4 - 1; i5 >= 0; i5--) {
                if (getChildAt(i5).getVisibility() != 8) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00eb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    void layoutHorizontal(int i4, int i5, int i6, int i7) {
        int i8;
        int i9;
        char c4;
        boolean z4;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        boolean b4 = k0.b(this);
        int paddingTop = getPaddingTop();
        int i18 = i7 - i5;
        int paddingBottom = i18 - getPaddingBottom();
        int paddingBottom2 = (i18 - paddingTop) - getPaddingBottom();
        int virtualChildCount = getVirtualChildCount();
        int i19 = this.mGravity;
        int i20 = i19 & InterfaceC1490j3.d.b.f16818j;
        boolean z5 = this.mBaselineAligned;
        int[] iArr = this.mMaxAscent;
        int[] iArr2 = this.mMaxDescent;
        int b5 = AbstractC1317t.b(8388615 & i19, getLayoutDirection());
        char c5 = 2;
        boolean z6 = true;
        int paddingLeft = b5 != 1 ? b5 != 5 ? getPaddingLeft() : ((getPaddingLeft() + i6) - i4) - this.mTotalLength : getPaddingLeft() + (((i6 - i4) - this.mTotalLength) / 2);
        if (b4) {
            i8 = virtualChildCount - 1;
            i9 = -1;
        } else {
            i8 = 0;
            i9 = 1;
        }
        int i21 = 0;
        while (i21 < virtualChildCount) {
            int i22 = i8 + (i9 * i21);
            int i23 = i21;
            View virtualChildAt = getVirtualChildAt(i22);
            if (virtualChildAt == null) {
                paddingLeft += measureNullChild(i22);
                i11 = i23;
                i10 = paddingTop;
                c4 = c5;
                z4 = z6;
            } else {
                c4 = c5;
                z4 = z6;
                if (virtualChildAt.getVisibility() != 8) {
                    int measuredWidth = virtualChildAt.getMeasuredWidth();
                    int measuredHeight = virtualChildAt.getMeasuredHeight();
                    a aVar = (a) virtualChildAt.getLayoutParams();
                    int i24 = paddingLeft;
                    if (z5) {
                        i12 = measuredHeight;
                        if (((LinearLayout.LayoutParams) aVar).height != -1) {
                            i13 = virtualChildAt.getBaseline();
                            i14 = ((LinearLayout.LayoutParams) aVar).gravity;
                            if (i14 < 0) {
                                i14 = i20;
                            }
                            i15 = i14 & InterfaceC1490j3.d.b.f16818j;
                            i10 = paddingTop;
                            if (i15 == 16) {
                                if (i15 == 48) {
                                    i16 = i10 + ((LinearLayout.LayoutParams) aVar).topMargin;
                                    if (i13 != -1) {
                                        i16 += iArr[z4 ? 1 : 0] - i13;
                                    }
                                } else if (i15 != 80) {
                                    i16 = i10;
                                } else {
                                    i16 = (paddingBottom - i12) - ((LinearLayout.LayoutParams) aVar).bottomMargin;
                                    if (i13 != -1) {
                                        i17 = iArr2[c4] - (virtualChildAt.getMeasuredHeight() - i13);
                                    }
                                }
                                int i25 = ((LinearLayout.LayoutParams) aVar).leftMargin + (hasDividerBeforeChildAt(i22) ? i24 + this.mDividerWidth : i24);
                                f(virtualChildAt, getLocationOffset(virtualChildAt) + i25, i16, measuredWidth, i12);
                                int nextLocationOffset = i25 + ((LinearLayout.LayoutParams) aVar).rightMargin + measuredWidth + getNextLocationOffset(virtualChildAt);
                                i11 = getChildrenSkipCount(virtualChildAt, i22) + i23;
                                paddingLeft = nextLocationOffset;
                            } else {
                                i16 = i10 + ((paddingBottom2 - i12) / 2) + ((LinearLayout.LayoutParams) aVar).topMargin;
                                i17 = ((LinearLayout.LayoutParams) aVar).bottomMargin;
                            }
                            i16 -= i17;
                            int i252 = ((LinearLayout.LayoutParams) aVar).leftMargin + (hasDividerBeforeChildAt(i22) ? i24 + this.mDividerWidth : i24);
                            f(virtualChildAt, getLocationOffset(virtualChildAt) + i252, i16, measuredWidth, i12);
                            int nextLocationOffset2 = i252 + ((LinearLayout.LayoutParams) aVar).rightMargin + measuredWidth + getNextLocationOffset(virtualChildAt);
                            i11 = getChildrenSkipCount(virtualChildAt, i22) + i23;
                            paddingLeft = nextLocationOffset2;
                        }
                    } else {
                        i12 = measuredHeight;
                    }
                    i13 = -1;
                    i14 = ((LinearLayout.LayoutParams) aVar).gravity;
                    if (i14 < 0) {
                    }
                    i15 = i14 & InterfaceC1490j3.d.b.f16818j;
                    i10 = paddingTop;
                    if (i15 == 16) {
                    }
                    i16 -= i17;
                    int i2522 = ((LinearLayout.LayoutParams) aVar).leftMargin + (hasDividerBeforeChildAt(i22) ? i24 + this.mDividerWidth : i24);
                    f(virtualChildAt, getLocationOffset(virtualChildAt) + i2522, i16, measuredWidth, i12);
                    int nextLocationOffset22 = i2522 + ((LinearLayout.LayoutParams) aVar).rightMargin + measuredWidth + getNextLocationOffset(virtualChildAt);
                    i11 = getChildrenSkipCount(virtualChildAt, i22) + i23;
                    paddingLeft = nextLocationOffset22;
                } else {
                    i10 = paddingTop;
                    i11 = i23;
                }
            }
            i21 = i11 + 1;
            c5 = c4;
            z6 = z4;
            paddingTop = i10;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0099  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    void layoutVertical(int i4, int i5, int i6, int i7) {
        int i8;
        int i9;
        int i10;
        int paddingLeft = getPaddingLeft();
        int i11 = i6 - i4;
        int paddingRight = i11 - getPaddingRight();
        int paddingRight2 = (i11 - paddingLeft) - getPaddingRight();
        int virtualChildCount = getVirtualChildCount();
        int i12 = this.mGravity;
        int i13 = i12 & InterfaceC1490j3.d.b.f16818j;
        int i14 = i12 & 8388615;
        int paddingTop = i13 != 16 ? i13 != 80 ? getPaddingTop() : ((getPaddingTop() + i7) - i5) - this.mTotalLength : getPaddingTop() + (((i7 - i5) - this.mTotalLength) / 2);
        int i15 = 0;
        while (i15 < virtualChildCount) {
            View virtualChildAt = getVirtualChildAt(i15);
            if (virtualChildAt == null) {
                paddingTop += measureNullChild(i15);
            } else if (virtualChildAt.getVisibility() != 8) {
                int measuredWidth = virtualChildAt.getMeasuredWidth();
                int measuredHeight = virtualChildAt.getMeasuredHeight();
                a aVar = (a) virtualChildAt.getLayoutParams();
                int i16 = ((LinearLayout.LayoutParams) aVar).gravity;
                if (i16 < 0) {
                    i16 = i14;
                }
                int b4 = AbstractC1317t.b(i16, getLayoutDirection()) & 7;
                if (b4 == 1) {
                    i8 = ((paddingRight2 - measuredWidth) / 2) + paddingLeft + ((LinearLayout.LayoutParams) aVar).leftMargin;
                    i9 = ((LinearLayout.LayoutParams) aVar).rightMargin;
                } else if (b4 != 5) {
                    i10 = ((LinearLayout.LayoutParams) aVar).leftMargin + paddingLeft;
                    int i17 = i10;
                    if (hasDividerBeforeChildAt(i15)) {
                        paddingTop += this.mDividerHeight;
                    }
                    int i18 = paddingTop + ((LinearLayout.LayoutParams) aVar).topMargin;
                    f(virtualChildAt, i17, i18 + getLocationOffset(virtualChildAt), measuredWidth, measuredHeight);
                    paddingTop = i18 + measuredHeight + ((LinearLayout.LayoutParams) aVar).bottomMargin + getNextLocationOffset(virtualChildAt);
                    i15 += getChildrenSkipCount(virtualChildAt, i15);
                    i15++;
                } else {
                    i8 = paddingRight - measuredWidth;
                    i9 = ((LinearLayout.LayoutParams) aVar).rightMargin;
                }
                i10 = i8 - i9;
                int i172 = i10;
                if (hasDividerBeforeChildAt(i15)) {
                }
                int i182 = paddingTop + ((LinearLayout.LayoutParams) aVar).topMargin;
                f(virtualChildAt, i172, i182 + getLocationOffset(virtualChildAt), measuredWidth, measuredHeight);
                paddingTop = i182 + measuredHeight + ((LinearLayout.LayoutParams) aVar).bottomMargin + getNextLocationOffset(virtualChildAt);
                i15 += getChildrenSkipCount(virtualChildAt, i15);
                i15++;
            }
            i15++;
        }
    }

    void measureChildBeforeLayout(View view, int i4, int i5, int i6, int i7, int i8) {
        measureChildWithMargins(view, i5, i6, i7, i8);
    }

    /* JADX WARN: Removed duplicated region for block: B:180:0x045e  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x01dd  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x01e6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    void measureHorizontal(int i4, int i5) {
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int max;
        int i11;
        int i12;
        int i13;
        int i14;
        boolean z4;
        int baseline;
        int i15;
        int i16;
        int i17;
        float f4;
        char c4;
        int i18;
        boolean z5;
        int i19;
        int i20;
        int[] iArr;
        int i21;
        boolean z6;
        int[] iArr2;
        View view;
        int i22;
        boolean z7;
        boolean z8;
        int baseline2;
        this.mTotalLength = 0;
        int virtualChildCount = getVirtualChildCount();
        int mode = View.MeasureSpec.getMode(i4);
        int mode2 = View.MeasureSpec.getMode(i5);
        if (this.mMaxAscent == null || this.mMaxDescent == null) {
            this.mMaxAscent = new int[4];
            this.mMaxDescent = new int[4];
        }
        int[] iArr3 = this.mMaxAscent;
        int[] iArr4 = this.mMaxDescent;
        iArr3[3] = -1;
        iArr3[2] = -1;
        iArr3[1] = -1;
        iArr3[0] = -1;
        iArr4[3] = -1;
        iArr4[2] = -1;
        iArr4[1] = -1;
        iArr4[0] = -1;
        boolean z9 = this.mBaselineAligned;
        boolean z10 = this.mUseLargestChild;
        int i23 = 1073741824;
        boolean z11 = mode == 1073741824;
        boolean z12 = z10;
        int i24 = 0;
        int i25 = 0;
        int i26 = 0;
        boolean z13 = false;
        int i27 = 0;
        boolean z14 = false;
        boolean z15 = true;
        float f5 = 0.0f;
        int i28 = 0;
        int i29 = 0;
        while (true) {
            i6 = i25;
            if (i24 >= virtualChildCount) {
                break;
            }
            boolean z16 = z9;
            View virtualChildAt = getVirtualChildAt(i24);
            if (virtualChildAt == null) {
                this.mTotalLength += measureNullChild(i24);
            } else if (virtualChildAt.getVisibility() == 8) {
                i24 += getChildrenSkipCount(virtualChildAt, i24);
            } else {
                if (hasDividerBeforeChildAt(i24)) {
                    this.mTotalLength += this.mDividerWidth;
                }
                a aVar = (a) virtualChildAt.getLayoutParams();
                float f6 = ((LinearLayout.LayoutParams) aVar).weight;
                float f7 = f5 + f6;
                if (mode == i23 && ((LinearLayout.LayoutParams) aVar).width == 0 && f6 > 0.0f) {
                    if (z11) {
                        this.mTotalLength += ((LinearLayout.LayoutParams) aVar).leftMargin + ((LinearLayout.LayoutParams) aVar).rightMargin;
                    } else {
                        int i30 = this.mTotalLength;
                        this.mTotalLength = Math.max(i30, ((LinearLayout.LayoutParams) aVar).leftMargin + i30 + ((LinearLayout.LayoutParams) aVar).rightMargin);
                    }
                    if (z16) {
                        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
                        virtualChildAt.measure(makeMeasureSpec, makeMeasureSpec);
                        i20 = mode;
                        iArr = iArr3;
                        iArr2 = iArr4;
                        i21 = i6;
                        z6 = z12;
                        view = virtualChildAt;
                    } else {
                        i20 = mode;
                        iArr = iArr3;
                        iArr2 = iArr4;
                        z13 = true;
                        i21 = i6;
                        i22 = 1073741824;
                        z6 = z12;
                        view = virtualChildAt;
                        if (mode2 == i22 && ((LinearLayout.LayoutParams) aVar).height == -1) {
                            z7 = true;
                            z14 = true;
                        } else {
                            z7 = false;
                        }
                        int i31 = ((LinearLayout.LayoutParams) aVar).topMargin + ((LinearLayout.LayoutParams) aVar).bottomMargin;
                        int measuredHeight = view.getMeasuredHeight() + i31;
                        i27 = View.combineMeasuredStates(i27, view.getMeasuredState());
                        if (z16 || (baseline2 = view.getBaseline()) == -1) {
                            z8 = z7;
                        } else {
                            int i32 = ((LinearLayout.LayoutParams) aVar).gravity;
                            if (i32 < 0) {
                                i32 = this.mGravity;
                            }
                            int i33 = (((i32 & InterfaceC1490j3.d.b.f16818j) >> 4) & (-2)) >> 1;
                            z8 = z7;
                            iArr[i33] = Math.max(iArr[i33], baseline2);
                            iArr2[i33] = Math.max(iArr2[i33], measuredHeight - baseline2);
                        }
                        i25 = Math.max(i21, measuredHeight);
                        z15 = !z15 && ((LinearLayout.LayoutParams) aVar).height == -1;
                        if (((LinearLayout.LayoutParams) aVar).weight <= 0.0f) {
                            if (z8) {
                                measuredHeight = i31;
                            }
                            i29 = Math.max(i29, measuredHeight);
                        } else {
                            if (z8) {
                                measuredHeight = i31;
                            }
                            i28 = Math.max(i28, measuredHeight);
                        }
                        i24 += getChildrenSkipCount(view, i24);
                        f5 = f7;
                        i24++;
                        z12 = z6;
                        iArr4 = iArr2;
                        z9 = z16;
                        iArr3 = iArr;
                        mode = i20;
                        i23 = 1073741824;
                    }
                } else {
                    if (((LinearLayout.LayoutParams) aVar).width != 0 || f6 <= 0.0f) {
                        c4 = 65534;
                        i18 = Integer.MIN_VALUE;
                    } else {
                        c4 = 65534;
                        ((LinearLayout.LayoutParams) aVar).width = -2;
                        i18 = 0;
                    }
                    if (f7 == 0.0f) {
                        z5 = z12;
                        i19 = this.mTotalLength;
                    } else {
                        z5 = z12;
                        i19 = 0;
                    }
                    i20 = mode;
                    iArr = iArr3;
                    i21 = i6;
                    int i34 = i18;
                    z6 = z5;
                    iArr2 = iArr4;
                    measureChildBeforeLayout(virtualChildAt, i24, i4, i19, i5, 0);
                    view = virtualChildAt;
                    if (i34 != Integer.MIN_VALUE) {
                        ((LinearLayout.LayoutParams) aVar).width = i34;
                    }
                    int measuredWidth = view.getMeasuredWidth();
                    if (z11) {
                        this.mTotalLength += ((LinearLayout.LayoutParams) aVar).leftMargin + measuredWidth + ((LinearLayout.LayoutParams) aVar).rightMargin + getNextLocationOffset(view);
                    } else {
                        int i35 = this.mTotalLength;
                        this.mTotalLength = Math.max(i35, i35 + measuredWidth + ((LinearLayout.LayoutParams) aVar).leftMargin + ((LinearLayout.LayoutParams) aVar).rightMargin + getNextLocationOffset(view));
                    }
                    if (z6) {
                        i26 = Math.max(measuredWidth, i26);
                    }
                }
                i22 = 1073741824;
                if (mode2 == i22) {
                }
                z7 = false;
                int i312 = ((LinearLayout.LayoutParams) aVar).topMargin + ((LinearLayout.LayoutParams) aVar).bottomMargin;
                int measuredHeight2 = view.getMeasuredHeight() + i312;
                i27 = View.combineMeasuredStates(i27, view.getMeasuredState());
                if (z16) {
                }
                z8 = z7;
                i25 = Math.max(i21, measuredHeight2);
                if (z15) {
                }
                if (((LinearLayout.LayoutParams) aVar).weight <= 0.0f) {
                }
                i24 += getChildrenSkipCount(view, i24);
                f5 = f7;
                i24++;
                z12 = z6;
                iArr4 = iArr2;
                z9 = z16;
                iArr3 = iArr;
                mode = i20;
                i23 = 1073741824;
            }
            i20 = mode;
            iArr = iArr3;
            iArr2 = iArr4;
            i25 = i6;
            z6 = z12;
            i24++;
            z12 = z6;
            iArr4 = iArr2;
            z9 = z16;
            iArr3 = iArr;
            mode = i20;
            i23 = 1073741824;
        }
        boolean z17 = z9;
        int i36 = mode;
        int[] iArr5 = iArr3;
        int[] iArr6 = iArr4;
        int i37 = i27;
        boolean z18 = z12;
        if (this.mTotalLength > 0 && hasDividerBeforeChildAt(virtualChildCount)) {
            this.mTotalLength += this.mDividerWidth;
        }
        int i38 = iArr5[1];
        int max2 = (i38 == -1 && iArr5[0] == -1 && iArr5[2] == -1 && iArr5[3] == -1) ? i6 : Math.max(i6, Math.max(iArr5[3], Math.max(iArr5[0], Math.max(i38, iArr5[2]))) + Math.max(iArr6[3], Math.max(iArr6[0], Math.max(iArr6[1], iArr6[2]))));
        if (z18) {
            i8 = i36;
            if (i8 == Integer.MIN_VALUE || i8 == 0) {
                this.mTotalLength = 0;
                int i39 = 0;
                while (i39 < virtualChildCount) {
                    View virtualChildAt2 = getVirtualChildAt(i39);
                    if (virtualChildAt2 == null) {
                        this.mTotalLength += measureNullChild(i39);
                    } else if (virtualChildAt2.getVisibility() == 8) {
                        i39 += getChildrenSkipCount(virtualChildAt2, i39);
                    } else {
                        a aVar2 = (a) virtualChildAt2.getLayoutParams();
                        if (z11) {
                            i17 = max2;
                            this.mTotalLength += ((LinearLayout.LayoutParams) aVar2).leftMargin + i26 + ((LinearLayout.LayoutParams) aVar2).rightMargin + getNextLocationOffset(virtualChildAt2);
                            f4 = f5;
                            i39++;
                            max2 = i17;
                            f5 = f4;
                        } else {
                            i17 = max2;
                            int i40 = this.mTotalLength;
                            f4 = f5;
                            this.mTotalLength = Math.max(i40, i40 + i26 + ((LinearLayout.LayoutParams) aVar2).leftMargin + ((LinearLayout.LayoutParams) aVar2).rightMargin + getNextLocationOffset(virtualChildAt2));
                            i39++;
                            max2 = i17;
                            f5 = f4;
                        }
                    }
                    i17 = max2;
                    f4 = f5;
                    i39++;
                    max2 = i17;
                    f5 = f4;
                }
            }
            i7 = max2;
        } else {
            i7 = max2;
            i8 = i36;
        }
        float f8 = f5;
        int paddingLeft = this.mTotalLength + getPaddingLeft() + getPaddingRight();
        this.mTotalLength = paddingLeft;
        int resolveSizeAndState = View.resolveSizeAndState(Math.max(paddingLeft, getSuggestedMinimumWidth()), i4, 0);
        int i41 = (16777215 & resolveSizeAndState) - this.mTotalLength;
        if (z13 || (i41 != 0 && f8 > 0.0f)) {
            float f9 = this.mWeightSum;
            if (f9 > 0.0f) {
                f8 = f9;
            }
            iArr5[3] = -1;
            iArr5[2] = -1;
            iArr5[1] = -1;
            iArr5[0] = -1;
            iArr6[3] = -1;
            iArr6[2] = -1;
            iArr6[1] = -1;
            iArr6[0] = -1;
            this.mTotalLength = 0;
            int i42 = i37;
            int i43 = -1;
            int i44 = 0;
            while (i44 < virtualChildCount) {
                View virtualChildAt3 = getVirtualChildAt(i44);
                if (virtualChildAt3 == null || virtualChildAt3.getVisibility() == 8) {
                    i13 = resolveSizeAndState;
                } else {
                    a aVar3 = (a) virtualChildAt3.getLayoutParams();
                    float f10 = ((LinearLayout.LayoutParams) aVar3).weight;
                    if (f10 > 0.0f) {
                        int i45 = (int) ((i41 * f10) / f8);
                        f8 -= f10;
                        i41 -= i45;
                        i13 = resolveSizeAndState;
                        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i5, getPaddingTop() + getPaddingBottom() + ((LinearLayout.LayoutParams) aVar3).topMargin + ((LinearLayout.LayoutParams) aVar3).bottomMargin, ((LinearLayout.LayoutParams) aVar3).height);
                        if (((LinearLayout.LayoutParams) aVar3).width == 0) {
                            i16 = 1073741824;
                            if (i8 == 1073741824) {
                                if (i45 <= 0) {
                                    i45 = 0;
                                }
                                virtualChildAt3.measure(View.MeasureSpec.makeMeasureSpec(i45, 1073741824), childMeasureSpec);
                                i42 = View.combineMeasuredStates(i42, virtualChildAt3.getMeasuredState() & (-16777216));
                            }
                        } else {
                            i16 = 1073741824;
                        }
                        int measuredWidth2 = virtualChildAt3.getMeasuredWidth() + i45;
                        if (measuredWidth2 < 0) {
                            measuredWidth2 = 0;
                        }
                        virtualChildAt3.measure(View.MeasureSpec.makeMeasureSpec(measuredWidth2, i16), childMeasureSpec);
                        i42 = View.combineMeasuredStates(i42, virtualChildAt3.getMeasuredState() & (-16777216));
                    } else {
                        i13 = resolveSizeAndState;
                    }
                    if (z11) {
                        this.mTotalLength += virtualChildAt3.getMeasuredWidth() + ((LinearLayout.LayoutParams) aVar3).leftMargin + ((LinearLayout.LayoutParams) aVar3).rightMargin + getNextLocationOffset(virtualChildAt3);
                    } else {
                        int i46 = this.mTotalLength;
                        this.mTotalLength = Math.max(i46, virtualChildAt3.getMeasuredWidth() + i46 + ((LinearLayout.LayoutParams) aVar3).leftMargin + ((LinearLayout.LayoutParams) aVar3).rightMargin + getNextLocationOffset(virtualChildAt3));
                    }
                    boolean z19 = mode2 != 1073741824 && ((LinearLayout.LayoutParams) aVar3).height == -1;
                    int i47 = ((LinearLayout.LayoutParams) aVar3).topMargin + ((LinearLayout.LayoutParams) aVar3).bottomMargin;
                    int measuredHeight3 = virtualChildAt3.getMeasuredHeight() + i47;
                    i43 = Math.max(i43, measuredHeight3);
                    if (!z19) {
                        i47 = measuredHeight3;
                    }
                    int max3 = Math.max(i28, i47);
                    if (z15) {
                        i14 = -1;
                        if (((LinearLayout.LayoutParams) aVar3).height == -1) {
                            z4 = true;
                            if (z17 && (baseline = virtualChildAt3.getBaseline()) != i14) {
                                i15 = ((LinearLayout.LayoutParams) aVar3).gravity;
                                if (i15 < 0) {
                                    i15 = this.mGravity;
                                }
                                int i48 = (((i15 & InterfaceC1490j3.d.b.f16818j) >> 4) & (-2)) >> 1;
                                iArr5[i48] = Math.max(iArr5[i48], baseline);
                                iArr6[i48] = Math.max(iArr6[i48], measuredHeight3 - baseline);
                            }
                            i28 = max3;
                            z15 = z4;
                        }
                    } else {
                        i14 = -1;
                    }
                    z4 = false;
                    if (z17) {
                        i15 = ((LinearLayout.LayoutParams) aVar3).gravity;
                        if (i15 < 0) {
                        }
                        int i482 = (((i15 & InterfaceC1490j3.d.b.f16818j) >> 4) & (-2)) >> 1;
                        iArr5[i482] = Math.max(iArr5[i482], baseline);
                        iArr6[i482] = Math.max(iArr6[i482], measuredHeight3 - baseline);
                    }
                    i28 = max3;
                    z15 = z4;
                }
                i44++;
                resolveSizeAndState = i13;
            }
            i9 = resolveSizeAndState;
            i10 = -16777216;
            this.mTotalLength += getPaddingLeft() + getPaddingRight();
            int i49 = iArr5[1];
            max = (i49 == -1 && iArr5[0] == -1 && iArr5[2] == -1 && iArr5[3] == -1) ? i43 : Math.max(i43, Math.max(iArr5[3], Math.max(iArr5[0], Math.max(i49, iArr5[2]))) + Math.max(iArr6[3], Math.max(iArr6[0], Math.max(iArr6[1], iArr6[2]))));
            i11 = i42;
            i12 = i28;
        } else {
            i12 = Math.max(i28, i29);
            if (z18 && i8 != 1073741824) {
                for (int i50 = 0; i50 < virtualChildCount; i50++) {
                    View virtualChildAt4 = getVirtualChildAt(i50);
                    if (virtualChildAt4 != null && virtualChildAt4.getVisibility() != 8 && ((LinearLayout.LayoutParams) ((a) virtualChildAt4.getLayoutParams())).weight > 0.0f) {
                        virtualChildAt4.measure(View.MeasureSpec.makeMeasureSpec(i26, 1073741824), View.MeasureSpec.makeMeasureSpec(virtualChildAt4.getMeasuredHeight(), 1073741824));
                    }
                }
            }
            i9 = resolveSizeAndState;
            i11 = i37;
            max = i7;
            i10 = -16777216;
        }
        if (!z15 && mode2 != 1073741824) {
            max = i12;
        }
        setMeasuredDimension(i9 | (i11 & i10), View.resolveSizeAndState(Math.max(max + getPaddingTop() + getPaddingBottom(), getSuggestedMinimumHeight()), i5, i11 << 16));
        if (z14) {
            d(virtualChildCount, i4);
        }
    }

    int measureNullChild(int i4) {
        return 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0162  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    void measureVertical(int i4, int i5) {
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        boolean z4;
        int i19;
        View view;
        int max;
        boolean z5;
        int max2;
        int i20;
        this.mTotalLength = 0;
        int virtualChildCount = getVirtualChildCount();
        int mode = View.MeasureSpec.getMode(i4);
        int mode2 = View.MeasureSpec.getMode(i5);
        int i21 = this.mBaselineAlignedChildIndex;
        boolean z6 = this.mUseLargestChild;
        int i22 = 0;
        int i23 = 0;
        int i24 = 0;
        int i25 = 0;
        int i26 = 0;
        int i27 = 0;
        boolean z7 = false;
        boolean z8 = false;
        float f4 = 0.0f;
        boolean z9 = true;
        while (true) {
            int i28 = 8;
            if (i22 >= virtualChildCount) {
                float f5 = f4;
                int i29 = i23;
                int i30 = virtualChildCount;
                int i31 = mode2;
                boolean z10 = z6;
                int i32 = i24;
                int i33 = i25;
                int i34 = i26;
                if (this.mTotalLength > 0) {
                    i6 = i30;
                    if (hasDividerBeforeChildAt(i6)) {
                        this.mTotalLength += this.mDividerHeight;
                    }
                } else {
                    i6 = i30;
                }
                int i35 = i31;
                if (z10 && (i35 == Integer.MIN_VALUE || i35 == 0)) {
                    this.mTotalLength = 0;
                    int i36 = 0;
                    while (i36 < i6) {
                        View virtualChildAt = getVirtualChildAt(i36);
                        if (virtualChildAt == null) {
                            this.mTotalLength += measureNullChild(i36);
                        } else if (virtualChildAt.getVisibility() == i28) {
                            i36 += getChildrenSkipCount(virtualChildAt, i36);
                        } else {
                            a aVar = (a) virtualChildAt.getLayoutParams();
                            int i37 = this.mTotalLength;
                            this.mTotalLength = Math.max(i37, i37 + i32 + ((LinearLayout.LayoutParams) aVar).topMargin + ((LinearLayout.LayoutParams) aVar).bottomMargin + getNextLocationOffset(virtualChildAt));
                        }
                        i36++;
                        i28 = 8;
                    }
                }
                int paddingTop = this.mTotalLength + getPaddingTop() + getPaddingBottom();
                this.mTotalLength = paddingTop;
                int resolveSizeAndState = View.resolveSizeAndState(Math.max(paddingTop, getSuggestedMinimumHeight()), i5, 0);
                int i38 = (16777215 & resolveSizeAndState) - this.mTotalLength;
                if (z7 || (i38 != 0 && f5 > 0.0f)) {
                    float f6 = this.mWeightSum;
                    if (f6 <= 0.0f) {
                        f6 = f5;
                    }
                    this.mTotalLength = 0;
                    float f7 = f6;
                    int i39 = i38;
                    int i40 = 0;
                    while (i40 < i6) {
                        View virtualChildAt2 = getVirtualChildAt(i40);
                        if (virtualChildAt2.getVisibility() == 8) {
                            i8 = i35;
                            i9 = i40;
                        } else {
                            a aVar2 = (a) virtualChildAt2.getLayoutParams();
                            float f8 = ((LinearLayout.LayoutParams) aVar2).weight;
                            if (f8 > 0.0f) {
                                i9 = i40;
                                int i41 = (int) ((i39 * f8) / f7);
                                f7 -= f8;
                                i39 -= i41;
                                int childMeasureSpec = ViewGroup.getChildMeasureSpec(i4, getPaddingLeft() + getPaddingRight() + ((LinearLayout.LayoutParams) aVar2).leftMargin + ((LinearLayout.LayoutParams) aVar2).rightMargin, ((LinearLayout.LayoutParams) aVar2).width);
                                if (((LinearLayout.LayoutParams) aVar2).height == 0) {
                                    i11 = 1073741824;
                                    if (i35 == 1073741824) {
                                        i8 = i35;
                                        virtualChildAt2.measure(childMeasureSpec, View.MeasureSpec.makeMeasureSpec(i41 > 0 ? i41 : 0, 1073741824));
                                        i34 = View.combineMeasuredStates(i34, virtualChildAt2.getMeasuredState() & (-256));
                                    }
                                } else {
                                    i11 = 1073741824;
                                }
                                i8 = i35;
                                int measuredHeight = virtualChildAt2.getMeasuredHeight() + i41;
                                if (measuredHeight < 0) {
                                    measuredHeight = 0;
                                }
                                virtualChildAt2.measure(childMeasureSpec, View.MeasureSpec.makeMeasureSpec(measuredHeight, i11));
                                i34 = View.combineMeasuredStates(i34, virtualChildAt2.getMeasuredState() & (-256));
                            } else {
                                i8 = i35;
                                i9 = i40;
                            }
                            int i42 = ((LinearLayout.LayoutParams) aVar2).leftMargin + ((LinearLayout.LayoutParams) aVar2).rightMargin;
                            int measuredWidth = virtualChildAt2.getMeasuredWidth() + i42;
                            i33 = Math.max(i33, measuredWidth);
                            if (mode != 1073741824) {
                                i10 = -1;
                                if (((LinearLayout.LayoutParams) aVar2).width == -1) {
                                    measuredWidth = i42;
                                }
                            } else {
                                i10 = -1;
                            }
                            int max3 = Math.max(i27, measuredWidth);
                            boolean z11 = z9 && ((LinearLayout.LayoutParams) aVar2).width == i10;
                            int i43 = this.mTotalLength;
                            this.mTotalLength = Math.max(i43, i43 + virtualChildAt2.getMeasuredHeight() + ((LinearLayout.LayoutParams) aVar2).topMargin + ((LinearLayout.LayoutParams) aVar2).bottomMargin + getNextLocationOffset(virtualChildAt2));
                            i27 = max3;
                            z9 = z11;
                        }
                        i40 = i9 + 1;
                        i35 = i8;
                    }
                    this.mTotalLength += getPaddingTop() + getPaddingBottom();
                    i7 = i27;
                } else {
                    i7 = Math.max(i27, i29);
                    if (z10 && i35 != 1073741824) {
                        for (int i44 = 0; i44 < i6; i44++) {
                            View virtualChildAt3 = getVirtualChildAt(i44);
                            if (virtualChildAt3 != null && virtualChildAt3.getVisibility() != 8 && ((LinearLayout.LayoutParams) ((a) virtualChildAt3.getLayoutParams())).weight > 0.0f) {
                                virtualChildAt3.measure(View.MeasureSpec.makeMeasureSpec(virtualChildAt3.getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(i32, 1073741824));
                            }
                        }
                    }
                }
                if (!z9 && mode != 1073741824) {
                    i33 = i7;
                }
                setMeasuredDimension(View.resolveSizeAndState(Math.max(i33 + getPaddingLeft() + getPaddingRight(), getSuggestedMinimumWidth()), i4, i34), resolveSizeAndState);
                if (z8) {
                    e(i6, i5);
                    return;
                }
                return;
            }
            float f9 = f4;
            View virtualChildAt4 = getVirtualChildAt(i22);
            if (virtualChildAt4 == null) {
                this.mTotalLength += measureNullChild(i22);
            } else if (virtualChildAt4.getVisibility() == 8) {
                i22 += getChildrenSkipCount(virtualChildAt4, i22);
            } else {
                if (hasDividerBeforeChildAt(i22)) {
                    this.mTotalLength += this.mDividerHeight;
                }
                a aVar3 = (a) virtualChildAt4.getLayoutParams();
                float f10 = ((LinearLayout.LayoutParams) aVar3).weight;
                float f11 = f9 + f10;
                if (mode2 == 1073741824 && ((LinearLayout.LayoutParams) aVar3).height == 0 && f10 > 0.0f) {
                    int i45 = this.mTotalLength;
                    this.mTotalLength = Math.max(i45, ((LinearLayout.LayoutParams) aVar3).topMargin + i45 + ((LinearLayout.LayoutParams) aVar3).bottomMargin);
                    i19 = i23;
                    max = i24;
                    i15 = virtualChildCount;
                    i16 = mode2;
                    z7 = true;
                    view = virtualChildAt4;
                    i18 = i25;
                    i17 = i26;
                    z4 = z6;
                } else {
                    if (((LinearLayout.LayoutParams) aVar3).height != 0 || f10 <= 0.0f) {
                        i12 = Integer.MIN_VALUE;
                    } else {
                        ((LinearLayout.LayoutParams) aVar3).height = -2;
                        i12 = 0;
                    }
                    if (f11 == 0.0f) {
                        int i46 = i26;
                        i14 = this.mTotalLength;
                        i13 = i46;
                    } else {
                        i13 = i26;
                        i14 = 0;
                    }
                    int i47 = i24;
                    i15 = virtualChildCount;
                    i16 = mode2;
                    i17 = i13;
                    i18 = i25;
                    z4 = z6;
                    i19 = i23;
                    measureChildBeforeLayout(virtualChildAt4, i22, i4, 0, i5, i14);
                    view = virtualChildAt4;
                    if (i12 != Integer.MIN_VALUE) {
                        ((LinearLayout.LayoutParams) aVar3).height = i12;
                    }
                    int measuredHeight2 = view.getMeasuredHeight();
                    int i48 = this.mTotalLength;
                    this.mTotalLength = Math.max(i48, i48 + measuredHeight2 + ((LinearLayout.LayoutParams) aVar3).topMargin + ((LinearLayout.LayoutParams) aVar3).bottomMargin + getNextLocationOffset(view));
                    max = z4 ? Math.max(measuredHeight2, i47) : i47;
                }
                if (i21 >= 0 && i21 == i22 + 1) {
                    this.mBaselineChildTop = this.mTotalLength;
                }
                if (i22 < i21 && ((LinearLayout.LayoutParams) aVar3).weight > 0.0f) {
                    throw new RuntimeException("A child of LinearLayout with index less than mBaselineAlignedChildIndex has weight > 0, which won't work.  Either remove the weight, or don't set mBaselineAlignedChildIndex.");
                }
                if (mode == 1073741824 || ((LinearLayout.LayoutParams) aVar3).width != -1) {
                    z5 = false;
                } else {
                    z5 = true;
                    z8 = true;
                }
                int i49 = ((LinearLayout.LayoutParams) aVar3).leftMargin + ((LinearLayout.LayoutParams) aVar3).rightMargin;
                int measuredWidth2 = view.getMeasuredWidth() + i49;
                max2 = Math.max(i18, measuredWidth2);
                int i50 = max;
                int combineMeasuredStates = View.combineMeasuredStates(i17, view.getMeasuredState());
                if (z9) {
                    i20 = combineMeasuredStates;
                    if (((LinearLayout.LayoutParams) aVar3).width == -1) {
                        z9 = true;
                        if (((LinearLayout.LayoutParams) aVar3).weight <= 0.0f) {
                            if (!z5) {
                                i49 = measuredWidth2;
                            }
                            i19 = Math.max(i19, i49);
                        } else {
                            if (!z5) {
                                i49 = measuredWidth2;
                            }
                            i27 = Math.max(i27, i49);
                        }
                        i22 += getChildrenSkipCount(view, i22);
                        f4 = f11;
                        i24 = i50;
                        i26 = i20;
                        i22++;
                        i25 = max2;
                        i23 = i19;
                        z6 = z4;
                        mode2 = i16;
                        virtualChildCount = i15;
                    }
                } else {
                    i20 = combineMeasuredStates;
                }
                z9 = false;
                if (((LinearLayout.LayoutParams) aVar3).weight <= 0.0f) {
                }
                i22 += getChildrenSkipCount(view, i22);
                f4 = f11;
                i24 = i50;
                i26 = i20;
                i22++;
                i25 = max2;
                i23 = i19;
                z6 = z4;
                mode2 = i16;
                virtualChildCount = i15;
            }
            i19 = i23;
            i15 = virtualChildCount;
            i16 = mode2;
            z4 = z6;
            f4 = f9;
            max2 = i25;
            i22++;
            i25 = max2;
            i23 = i19;
            z6 = z4;
            mode2 = i16;
            virtualChildCount = i15;
        }
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        if (this.mDivider == null) {
            return;
        }
        if (this.mOrientation == 1) {
            drawDividersVertical(canvas);
        } else {
            drawDividersHorizontal(canvas);
        }
    }

    @Override // android.view.View
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName("androidx.appcompat.widget.LinearLayoutCompat");
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("androidx.appcompat.widget.LinearLayoutCompat");
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z4, int i4, int i5, int i6, int i7) {
        if (this.mOrientation == 1) {
            layoutVertical(i4, i5, i6, i7);
        } else {
            layoutHorizontal(i4, i5, i6, i7);
        }
    }

    @Override // android.view.View
    protected void onMeasure(int i4, int i5) {
        if (this.mOrientation == 1) {
            measureVertical(i4, i5);
        } else {
            measureHorizontal(i4, i5);
        }
    }

    public void setBaselineAligned(boolean z4) {
        this.mBaselineAligned = z4;
    }

    public void setBaselineAlignedChildIndex(int i4) {
        if (i4 >= 0 && i4 < getChildCount()) {
            this.mBaselineAlignedChildIndex = i4;
            return;
        }
        throw new IllegalArgumentException("base aligned child index out of range (0, " + getChildCount() + ")");
    }

    public void setDividerDrawable(Drawable drawable) {
        if (drawable == this.mDivider) {
            return;
        }
        this.mDivider = drawable;
        if (drawable != null) {
            this.mDividerWidth = drawable.getIntrinsicWidth();
            this.mDividerHeight = drawable.getIntrinsicHeight();
        } else {
            this.mDividerWidth = 0;
            this.mDividerHeight = 0;
        }
        setWillNotDraw(drawable == null);
        requestLayout();
    }

    public void setDividerPadding(int i4) {
        this.mDividerPadding = i4;
    }

    public void setGravity(int i4) {
        if (this.mGravity != i4) {
            if ((8388615 & i4) == 0) {
                i4 |= 8388611;
            }
            if ((i4 & InterfaceC1490j3.d.b.f16818j) == 0) {
                i4 |= 48;
            }
            this.mGravity = i4;
            requestLayout();
        }
    }

    public void setHorizontalGravity(int i4) {
        int i5 = i4 & 8388615;
        int i6 = this.mGravity;
        if ((8388615 & i6) != i5) {
            this.mGravity = i5 | ((-8388616) & i6);
            requestLayout();
        }
    }

    public void setMeasureWithLargestChildEnabled(boolean z4) {
        this.mUseLargestChild = z4;
    }

    public void setOrientation(int i4) {
        if (this.mOrientation != i4) {
            this.mOrientation = i4;
            requestLayout();
        }
    }

    public void setShowDividers(int i4) {
        if (i4 != this.mShowDividers) {
            requestLayout();
        }
        this.mShowDividers = i4;
    }

    public void setVerticalGravity(int i4) {
        int i5 = i4 & InterfaceC1490j3.d.b.f16818j;
        int i6 = this.mGravity;
        if ((i6 & InterfaceC1490j3.d.b.f16818j) != i5) {
            this.mGravity = i5 | (i6 & (-113));
            requestLayout();
        }
    }

    public void setWeightSum(float f4) {
        this.mWeightSum = Math.max(0.0f, f4);
    }

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return false;
    }

    public J(Context context, AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
        this.mBaselineAligned = true;
        this.mBaselineAlignedChildIndex = -1;
        this.mBaselineChildTop = 0;
        this.mGravity = 8388659;
        Z v4 = Z.v(context, attributeSet, e.j.f36472a1, i4, 0);
        AbstractC1281a0.m0(this, context, e.j.f36472a1, attributeSet, v4.r(), i4, 0);
        int k4 = v4.k(e.j.f36482c1, -1);
        if (k4 >= 0) {
            setOrientation(k4);
        }
        int k5 = v4.k(e.j.f36477b1, -1);
        if (k5 >= 0) {
            setGravity(k5);
        }
        boolean a4 = v4.a(e.j.f36487d1, true);
        if (!a4) {
            setBaselineAligned(a4);
        }
        this.mWeightSum = v4.i(e.j.f36497f1, -1.0f);
        this.mBaselineAlignedChildIndex = v4.k(e.j.f36492e1, -1);
        this.mUseLargestChild = v4.a(e.j.f36512i1, false);
        setDividerDrawable(v4.g(e.j.f36502g1));
        this.mShowDividers = v4.k(e.j.f36517j1, 0);
        this.mDividerPadding = v4.f(e.j.f36507h1, 0);
        v4.x();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.ViewGroup
    public a generateDefaultLayoutParams() {
        int i4 = this.mOrientation;
        if (i4 == 0) {
            return new a(-2, -2);
        }
        if (i4 == 1) {
            return new a(-1, -2);
        }
        return null;
    }

    @Override // android.view.ViewGroup
    public a generateLayoutParams(AttributeSet attributeSet) {
        return new a(getContext(), attributeSet);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.ViewGroup
    public a generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof a) {
            return new a((ViewGroup.MarginLayoutParams) layoutParams);
        }
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return new a((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return new a(layoutParams);
    }
}
