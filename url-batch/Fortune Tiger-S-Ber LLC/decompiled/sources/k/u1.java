package k;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.LinearLayout;

/* compiled from: r8-map-id-72a2021f0a77848162657eed404f056d03742612a99b9acca4b8f3bd8ed17555 */
/* loaded from: classes.dex */
public abstract class u1 extends ViewGroup {

    /* renamed from: f, reason: collision with root package name */
    public boolean f2655f;
    public int g;
    public int h;

    /* renamed from: i, reason: collision with root package name */
    public int f2656i;

    /* renamed from: j, reason: collision with root package name */
    public int f2657j;

    /* renamed from: k, reason: collision with root package name */
    public int f2658k;

    /* renamed from: l, reason: collision with root package name */
    public float f2659l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f2660m;

    /* renamed from: n, reason: collision with root package name */
    public int[] f2661n;

    /* renamed from: o, reason: collision with root package name */
    public int[] f2662o;

    /* renamed from: p, reason: collision with root package name */
    public Drawable f2663p;

    /* renamed from: q, reason: collision with root package name */
    public int f2664q;

    /* renamed from: r, reason: collision with root package name */
    public int f2665r;

    /* renamed from: s, reason: collision with root package name */
    public int f2666s;

    /* renamed from: t, reason: collision with root package name */
    public int f2667t;

    public u1(Context context, AttributeSet attributeSet, int i4) {
        super(context, attributeSet, 0);
        this.f2655f = true;
        this.g = -1;
        this.h = 0;
        this.f2657j = 8388659;
        int[] iArr = e.a.f1505n;
        androidx.emoji2.text.s r3 = androidx.emoji2.text.s.r(0, 0, context, attributeSet, iArr);
        k0.j0.l(this, context, iArr, attributeSet, (TypedArray) r3.c, 0);
        TypedArray typedArray = (TypedArray) r3.c;
        int i5 = typedArray.getInt(1, -1);
        if (i5 >= 0) {
            setOrientation(i5);
        }
        int i6 = typedArray.getInt(0, -1);
        if (i6 >= 0) {
            setGravity(i6);
        }
        boolean z3 = typedArray.getBoolean(2, true);
        if (!z3) {
            setBaselineAligned(z3);
        }
        this.f2659l = typedArray.getFloat(4, -1.0f);
        this.g = typedArray.getInt(3, -1);
        this.f2660m = typedArray.getBoolean(7, false);
        setDividerDrawable(r3.i(5));
        this.f2666s = typedArray.getInt(8, 0);
        this.f2667t = typedArray.getDimensionPixelSize(6, 0);
        r3.t();
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof t1;
    }

    public final void d(Canvas canvas, int i4) {
        this.f2663p.setBounds(getPaddingLeft() + this.f2667t, i4, (getWidth() - getPaddingRight()) - this.f2667t, this.f2665r + i4);
        this.f2663p.draw(canvas);
    }

    public final void e(Canvas canvas, int i4) {
        this.f2663p.setBounds(i4, getPaddingTop() + this.f2667t, this.f2664q + i4, (getHeight() - getPaddingBottom()) - this.f2667t);
        this.f2663p.draw(canvas);
    }

    @Override // android.view.ViewGroup
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public t1 generateDefaultLayoutParams() {
        int i4 = this.f2656i;
        if (i4 == 0) {
            return new t1(-2, -2);
        }
        if (i4 == 1) {
            return new t1(-1, -2);
        }
        return null;
    }

    @Override // android.view.ViewGroup
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public t1 generateLayoutParams(AttributeSet attributeSet) {
        return new t1(getContext(), attributeSet);
    }

    @Override // android.view.View
    public int getBaseline() {
        int i4;
        if (this.g < 0) {
            return super.getBaseline();
        }
        int childCount = getChildCount();
        int i5 = this.g;
        if (childCount <= i5) {
            throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout set to an index that is out of bounds.");
        }
        View childAt = getChildAt(i5);
        int baseline = childAt.getBaseline();
        if (baseline == -1) {
            if (this.g == 0) {
                return -1;
            }
            throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout points to a View that doesn't know how to get its baseline.");
        }
        int i6 = this.h;
        if (this.f2656i == 1 && (i4 = this.f2657j & 112) != 48) {
            if (i4 == 16) {
                i6 += ((((getBottom() - getTop()) - getPaddingTop()) - getPaddingBottom()) - this.f2658k) / 2;
            } else if (i4 == 80) {
                i6 = ((getBottom() - getTop()) - getPaddingBottom()) - this.f2658k;
            }
        }
        return i6 + ((LinearLayout.LayoutParams) ((t1) childAt.getLayoutParams())).topMargin + baseline;
    }

    public int getBaselineAlignedChildIndex() {
        return this.g;
    }

    public Drawable getDividerDrawable() {
        return this.f2663p;
    }

    public int getDividerPadding() {
        return this.f2667t;
    }

    public int getDividerWidth() {
        return this.f2664q;
    }

    public int getGravity() {
        return this.f2657j;
    }

    public int getOrientation() {
        return this.f2656i;
    }

    public int getShowDividers() {
        return this.f2666s;
    }

    public int getVirtualChildCount() {
        return getChildCount();
    }

    public float getWeightSum() {
        return this.f2659l;
    }

    @Override // android.view.ViewGroup
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public t1 generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof t1 ? new t1((t1) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new t1((ViewGroup.MarginLayoutParams) layoutParams) : new t1(layoutParams);
    }

    public final boolean i(int i4) {
        if (i4 == 0) {
            return (this.f2666s & 1) != 0;
        }
        if (i4 == getChildCount()) {
            return (this.f2666s & 4) != 0;
        }
        if ((this.f2666s & 2) != 0) {
            for (int i5 = i4 - 1; i5 >= 0; i5--) {
                if (getChildAt(i5).getVisibility() != 8) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        int right;
        int left;
        int i4;
        if (this.f2663p == null) {
            return;
        }
        int i5 = 0;
        if (this.f2656i == 1) {
            int virtualChildCount = getVirtualChildCount();
            while (i5 < virtualChildCount) {
                View childAt = getChildAt(i5);
                if (childAt != null && childAt.getVisibility() != 8 && i(i5)) {
                    d(canvas, (childAt.getTop() - ((LinearLayout.LayoutParams) ((t1) childAt.getLayoutParams())).topMargin) - this.f2665r);
                }
                i5++;
            }
            if (i(virtualChildCount)) {
                View childAt2 = getChildAt(virtualChildCount - 1);
                d(canvas, childAt2 == null ? (getHeight() - getPaddingBottom()) - this.f2665r : childAt2.getBottom() + ((LinearLayout.LayoutParams) ((t1) childAt2.getLayoutParams())).bottomMargin);
                return;
            }
            return;
        }
        int virtualChildCount2 = getVirtualChildCount();
        boolean z3 = e3.f2538a;
        boolean z4 = getLayoutDirection() == 1;
        while (i5 < virtualChildCount2) {
            View childAt3 = getChildAt(i5);
            if (childAt3 != null && childAt3.getVisibility() != 8 && i(i5)) {
                t1 t1Var = (t1) childAt3.getLayoutParams();
                e(canvas, z4 ? childAt3.getRight() + ((LinearLayout.LayoutParams) t1Var).rightMargin : (childAt3.getLeft() - ((LinearLayout.LayoutParams) t1Var).leftMargin) - this.f2664q);
            }
            i5++;
        }
        if (i(virtualChildCount2)) {
            View childAt4 = getChildAt(virtualChildCount2 - 1);
            if (childAt4 != null) {
                t1 t1Var2 = (t1) childAt4.getLayoutParams();
                if (z4) {
                    left = childAt4.getLeft() - ((LinearLayout.LayoutParams) t1Var2).leftMargin;
                    i4 = this.f2664q;
                    right = left - i4;
                } else {
                    right = childAt4.getRight() + ((LinearLayout.LayoutParams) t1Var2).rightMargin;
                }
            } else if (z4) {
                right = getPaddingLeft();
            } else {
                left = getWidth() - getPaddingRight();
                i4 = this.f2664q;
                right = left - i4;
            }
            e(canvas, right);
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName("androidx.appcompat.widget.LinearLayoutCompat");
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("androidx.appcompat.widget.LinearLayoutCompat");
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01a9  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0191  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onLayout(boolean z3, int i4, int i5, int i6, int i7) {
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        char c;
        int i17;
        int i18;
        int i19;
        int i20 = 8;
        char c4 = 2;
        if (this.f2656i == 1) {
            int paddingLeft = getPaddingLeft();
            int i21 = i6 - i4;
            int paddingRight = i21 - getPaddingRight();
            int paddingRight2 = (i21 - paddingLeft) - getPaddingRight();
            int virtualChildCount = getVirtualChildCount();
            int i22 = this.f2657j;
            int i23 = i22 & 112;
            int i24 = 8388615 & i22;
            int paddingTop = i23 != 16 ? i23 != 80 ? getPaddingTop() : ((getPaddingTop() + i7) - i5) - this.f2658k : getPaddingTop() + (((i7 - i5) - this.f2658k) / 2);
            int i25 = 0;
            while (i25 < virtualChildCount) {
                View childAt = getChildAt(i25);
                if (childAt == null || childAt.getVisibility() == i20) {
                    c = c4;
                } else {
                    int measuredWidth = childAt.getMeasuredWidth();
                    int measuredHeight = childAt.getMeasuredHeight();
                    t1 t1Var = (t1) childAt.getLayoutParams();
                    c = c4;
                    int i26 = ((LinearLayout.LayoutParams) t1Var).gravity;
                    if (i26 < 0) {
                        i26 = i24;
                    }
                    int absoluteGravity = Gravity.getAbsoluteGravity(i26, getLayoutDirection()) & 7;
                    if (absoluteGravity == 1) {
                        i17 = ((paddingRight2 - measuredWidth) / 2) + paddingLeft + ((LinearLayout.LayoutParams) t1Var).leftMargin;
                        i18 = ((LinearLayout.LayoutParams) t1Var).rightMargin;
                    } else if (absoluteGravity != 5) {
                        i19 = ((LinearLayout.LayoutParams) t1Var).leftMargin + paddingLeft;
                        if (i(i25)) {
                            paddingTop += this.f2665r;
                        }
                        int i27 = paddingTop + ((LinearLayout.LayoutParams) t1Var).topMargin;
                        childAt.layout(i19, i27, measuredWidth + i19, i27 + measuredHeight);
                        paddingTop = measuredHeight + ((LinearLayout.LayoutParams) t1Var).bottomMargin + i27;
                    } else {
                        i17 = paddingRight - measuredWidth;
                        i18 = ((LinearLayout.LayoutParams) t1Var).rightMargin;
                    }
                    i19 = i17 - i18;
                    if (i(i25)) {
                    }
                    int i272 = paddingTop + ((LinearLayout.LayoutParams) t1Var).topMargin;
                    childAt.layout(i19, i272, measuredWidth + i19, i272 + measuredHeight);
                    paddingTop = measuredHeight + ((LinearLayout.LayoutParams) t1Var).bottomMargin + i272;
                }
                i25++;
                c4 = c;
                i20 = 8;
            }
            return;
        }
        boolean z4 = e3.f2538a;
        boolean z5 = getLayoutDirection() == 1;
        int paddingTop2 = getPaddingTop();
        int i28 = i7 - i5;
        int paddingBottom = i28 - getPaddingBottom();
        int paddingBottom2 = (i28 - paddingTop2) - getPaddingBottom();
        int virtualChildCount2 = getVirtualChildCount();
        int i29 = this.f2657j;
        int i30 = 8388615 & i29;
        int i31 = i29 & 112;
        boolean z6 = this.f2655f;
        int[] iArr = this.f2661n;
        int[] iArr2 = this.f2662o;
        int absoluteGravity2 = Gravity.getAbsoluteGravity(i30, getLayoutDirection());
        int paddingLeft2 = absoluteGravity2 != 1 ? absoluteGravity2 != 5 ? getPaddingLeft() : ((getPaddingLeft() + i6) - i4) - this.f2658k : getPaddingLeft() + (((i6 - i4) - this.f2658k) / 2);
        if (z5) {
            i9 = virtualChildCount2 - 1;
            i8 = -1;
        } else {
            i8 = 1;
            i9 = 0;
        }
        int i32 = 0;
        while (i32 < virtualChildCount2) {
            int i33 = (i8 * i32) + i9;
            View childAt2 = getChildAt(i33);
            if (childAt2 == null) {
                i10 = i9;
            } else {
                i10 = i9;
                if (childAt2.getVisibility() != 8) {
                    int measuredWidth2 = childAt2.getMeasuredWidth();
                    int measuredHeight2 = childAt2.getMeasuredHeight();
                    t1 t1Var2 = (t1) childAt2.getLayoutParams();
                    int i34 = paddingLeft2;
                    if (z6) {
                        i11 = paddingTop2;
                        if (((LinearLayout.LayoutParams) t1Var2).height != -1) {
                            i12 = childAt2.getBaseline();
                            i13 = ((LinearLayout.LayoutParams) t1Var2).gravity;
                            if (i13 < 0) {
                                i13 = i31;
                            }
                            i14 = i13 & 112;
                            if (i14 == 16) {
                                if (i14 == 48) {
                                    i15 = i11 + ((LinearLayout.LayoutParams) t1Var2).topMargin;
                                    if (i12 != -1) {
                                        i15 = (iArr[1] - i12) + i15;
                                    }
                                } else if (i14 != 80) {
                                    i15 = i11;
                                } else {
                                    i15 = (paddingBottom - measuredHeight2) - ((LinearLayout.LayoutParams) t1Var2).bottomMargin;
                                    if (i12 != -1) {
                                        i16 = iArr2[2] - (childAt2.getMeasuredHeight() - i12);
                                    }
                                }
                                int i35 = (i(i33) ? i34 + this.f2664q : i34) + ((LinearLayout.LayoutParams) t1Var2).leftMargin;
                                childAt2.layout(i35, i15, i35 + measuredWidth2, i15 + measuredHeight2);
                                paddingLeft2 = measuredWidth2 + ((LinearLayout.LayoutParams) t1Var2).rightMargin + i35;
                                i32++;
                                i9 = i10;
                                paddingTop2 = i11;
                            } else {
                                i15 = ((paddingBottom2 - measuredHeight2) / 2) + i11 + ((LinearLayout.LayoutParams) t1Var2).topMargin;
                                i16 = ((LinearLayout.LayoutParams) t1Var2).bottomMargin;
                            }
                            i15 -= i16;
                            int i352 = (i(i33) ? i34 + this.f2664q : i34) + ((LinearLayout.LayoutParams) t1Var2).leftMargin;
                            childAt2.layout(i352, i15, i352 + measuredWidth2, i15 + measuredHeight2);
                            paddingLeft2 = measuredWidth2 + ((LinearLayout.LayoutParams) t1Var2).rightMargin + i352;
                            i32++;
                            i9 = i10;
                            paddingTop2 = i11;
                        }
                    } else {
                        i11 = paddingTop2;
                    }
                    i12 = -1;
                    i13 = ((LinearLayout.LayoutParams) t1Var2).gravity;
                    if (i13 < 0) {
                    }
                    i14 = i13 & 112;
                    if (i14 == 16) {
                    }
                    i15 -= i16;
                    int i3522 = (i(i33) ? i34 + this.f2664q : i34) + ((LinearLayout.LayoutParams) t1Var2).leftMargin;
                    childAt2.layout(i3522, i15, i3522 + measuredWidth2, i15 + measuredHeight2);
                    paddingLeft2 = measuredWidth2 + ((LinearLayout.LayoutParams) t1Var2).rightMargin + i3522;
                    i32++;
                    i9 = i10;
                    paddingTop2 = i11;
                }
            }
            i11 = paddingTop2;
            i32++;
            i9 = i10;
            paddingTop2 = i11;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:222:0x04f8  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x053d  */
    /* JADX WARN: Removed duplicated region for block: B:240:0x0547  */
    /* JADX WARN: Removed duplicated region for block: B:244:0x0526  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0148  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onMeasure(int i4, int i5) {
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        boolean z3;
        int baseline;
        int i12;
        int i13;
        int[] iArr;
        int i14;
        int i15;
        boolean z4;
        boolean z5;
        t1 t1Var;
        int i16;
        int[] iArr2;
        int i17;
        View view;
        int i18;
        boolean z6;
        boolean z7;
        int max;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        int i24;
        int i25;
        int i26;
        boolean z8;
        int i27;
        int i28;
        int i29;
        View view2;
        boolean z9;
        boolean z10;
        u1 u1Var = this;
        int i30 = -2;
        int i31 = 0;
        int i32 = 1073741824;
        int i33 = 8;
        if (u1Var.f2656i == 1) {
            u1Var.f2658k = 0;
            int virtualChildCount = u1Var.getVirtualChildCount();
            int mode = View.MeasureSpec.getMode(i4);
            int mode2 = View.MeasureSpec.getMode(i5);
            int i34 = u1Var.g;
            boolean z11 = u1Var.f2660m;
            int i35 = 0;
            int i36 = 0;
            int i37 = 0;
            boolean z12 = false;
            int i38 = 0;
            boolean z13 = false;
            boolean z14 = true;
            float f4 = 0.0f;
            int i39 = 0;
            while (i35 < virtualChildCount) {
                int i40 = mode;
                View childAt = u1Var.getChildAt(i35);
                if (childAt == null) {
                    u1Var.f2658k = u1Var.f2658k;
                } else if (childAt.getVisibility() != i33) {
                    if (u1Var.i(i35)) {
                        u1Var.f2658k += u1Var.f2665r;
                    }
                    t1 t1Var2 = (t1) childAt.getLayoutParams();
                    float f5 = ((LinearLayout.LayoutParams) t1Var2).weight;
                    f4 += f5;
                    if (mode2 == i32 && ((LinearLayout.LayoutParams) t1Var2).height == 0 && f5 > 0.0f) {
                        int i41 = u1Var.f2658k;
                        u1Var.f2658k = Math.max(i41, ((LinearLayout.LayoutParams) t1Var2).topMargin + i41 + ((LinearLayout.LayoutParams) t1Var2).bottomMargin);
                        view2 = childAt;
                        i26 = mode2;
                        i27 = i34;
                        z8 = z11;
                        i28 = i35;
                        z12 = true;
                        i29 = i40;
                    } else {
                        if (((LinearLayout.LayoutParams) t1Var2).height != 0 || f5 <= 0.0f) {
                            i23 = Integer.MIN_VALUE;
                        } else {
                            ((LinearLayout.LayoutParams) t1Var2).height = i30;
                            i23 = 0;
                        }
                        if (f4 == 0.0f) {
                            i24 = i35;
                            i25 = u1Var.f2658k;
                        } else {
                            i24 = i35;
                            i25 = 0;
                        }
                        i26 = mode2;
                        z8 = z11;
                        i27 = i34;
                        i28 = i24;
                        i29 = i40;
                        u1Var.measureChildWithMargins(childAt, i4, 0, i5, i25);
                        if (i23 != Integer.MIN_VALUE) {
                            ((LinearLayout.LayoutParams) t1Var2).height = i23;
                        }
                        int measuredHeight = childAt.getMeasuredHeight();
                        int i42 = u1Var.f2658k;
                        view2 = childAt;
                        u1Var.f2658k = Math.max(i42, i42 + measuredHeight + ((LinearLayout.LayoutParams) t1Var2).topMargin + ((LinearLayout.LayoutParams) t1Var2).bottomMargin);
                        if (z8) {
                            i39 = Math.max(measuredHeight, i39);
                        }
                    }
                    if (i27 >= 0 && i27 == i28 + 1) {
                        u1Var.h = u1Var.f2658k;
                    }
                    if (i28 < i27 && ((LinearLayout.LayoutParams) t1Var2).weight > 0.0f) {
                        throw new RuntimeException("A child of LinearLayout with index less than mBaselineAlignedChildIndex has weight > 0, which won't work.  Either remove the weight, or don't set mBaselineAlignedChildIndex.");
                    }
                    if (i29 == 1073741824 || ((LinearLayout.LayoutParams) t1Var2).width != -1) {
                        z9 = false;
                    } else {
                        z9 = true;
                        z13 = true;
                    }
                    int i43 = ((LinearLayout.LayoutParams) t1Var2).leftMargin + ((LinearLayout.LayoutParams) t1Var2).rightMargin;
                    int measuredWidth = view2.getMeasuredWidth() + i43;
                    i31 = Math.max(i31, measuredWidth);
                    int measuredState = view2.getMeasuredState();
                    boolean z15 = z9;
                    int combineMeasuredStates = View.combineMeasuredStates(i38, measuredState);
                    if (z14) {
                        i38 = combineMeasuredStates;
                        if (((LinearLayout.LayoutParams) t1Var2).width == -1) {
                            z10 = true;
                            if (((LinearLayout.LayoutParams) t1Var2).weight <= 0.0f) {
                                if (!z15) {
                                    i43 = measuredWidth;
                                }
                                i37 = Math.max(i37, i43);
                            } else {
                                if (!z15) {
                                    i43 = measuredWidth;
                                }
                                i36 = Math.max(i36, i43);
                            }
                            z14 = z10;
                            i35 = i28 + 1;
                            i34 = i27;
                            mode = i29;
                            z11 = z8;
                            mode2 = i26;
                            i30 = -2;
                            i32 = 1073741824;
                            i33 = 8;
                        }
                    } else {
                        i38 = combineMeasuredStates;
                    }
                    z10 = false;
                    if (((LinearLayout.LayoutParams) t1Var2).weight <= 0.0f) {
                    }
                    z14 = z10;
                    i35 = i28 + 1;
                    i34 = i27;
                    mode = i29;
                    z11 = z8;
                    mode2 = i26;
                    i30 = -2;
                    i32 = 1073741824;
                    i33 = 8;
                }
                i26 = mode2;
                i27 = i34;
                z8 = z11;
                i28 = i35;
                i29 = i40;
                i35 = i28 + 1;
                i34 = i27;
                mode = i29;
                z11 = z8;
                mode2 = i26;
                i30 = -2;
                i32 = 1073741824;
                i33 = 8;
            }
            int i44 = mode;
            int i45 = mode2;
            boolean z16 = z11;
            int i46 = i38;
            int i47 = i5;
            if (u1Var.f2658k > 0 && u1Var.i(virtualChildCount)) {
                u1Var.f2658k += u1Var.f2665r;
            }
            if (z16 && (i45 == Integer.MIN_VALUE || i45 == 0)) {
                u1Var.f2658k = 0;
                for (int i48 = 0; i48 < virtualChildCount; i48++) {
                    View childAt2 = u1Var.getChildAt(i48);
                    if (childAt2 == null) {
                        u1Var.f2658k = u1Var.f2658k;
                    } else if (childAt2.getVisibility() != 8) {
                        t1 t1Var3 = (t1) childAt2.getLayoutParams();
                        int i49 = u1Var.f2658k;
                        u1Var.f2658k = Math.max(i49, i49 + i39 + ((LinearLayout.LayoutParams) t1Var3).topMargin + ((LinearLayout.LayoutParams) t1Var3).bottomMargin);
                    }
                }
            }
            int paddingBottom = u1Var.getPaddingBottom() + u1Var.getPaddingTop() + u1Var.f2658k;
            u1Var.f2658k = paddingBottom;
            int resolveSizeAndState = View.resolveSizeAndState(Math.max(paddingBottom, u1Var.getSuggestedMinimumHeight()), i47, 0);
            int i50 = (resolveSizeAndState & 16777215) - u1Var.f2658k;
            if (z12 || (i50 != 0 && f4 > 0.0f)) {
                float f6 = u1Var.f2659l;
                if (f6 > 0.0f) {
                    f4 = f6;
                }
                u1Var.f2658k = 0;
                int i51 = i46;
                int i52 = 0;
                while (i52 < virtualChildCount) {
                    View childAt3 = u1Var.getChildAt(i52);
                    if (childAt3.getVisibility() == 8) {
                        i20 = i52;
                    } else {
                        t1 t1Var4 = (t1) childAt3.getLayoutParams();
                        float f7 = ((LinearLayout.LayoutParams) t1Var4).weight;
                        if (f7 > 0.0f) {
                            int i53 = (int) ((i50 * f7) / f4);
                            f4 -= f7;
                            i50 -= i53;
                            i20 = i52;
                            int childMeasureSpec = ViewGroup.getChildMeasureSpec(i4, u1Var.getPaddingRight() + u1Var.getPaddingLeft() + ((LinearLayout.LayoutParams) t1Var4).leftMargin + ((LinearLayout.LayoutParams) t1Var4).rightMargin, ((LinearLayout.LayoutParams) t1Var4).width);
                            if (((LinearLayout.LayoutParams) t1Var4).height == 0) {
                                i22 = 1073741824;
                                if (i45 == 1073741824) {
                                    if (i53 <= 0) {
                                        i53 = 0;
                                    }
                                    childAt3.measure(childMeasureSpec, View.MeasureSpec.makeMeasureSpec(i53, 1073741824));
                                    i51 = View.combineMeasuredStates(i51, childAt3.getMeasuredState() & (-256));
                                }
                            } else {
                                i22 = 1073741824;
                            }
                            int measuredHeight2 = childAt3.getMeasuredHeight() + i53;
                            if (measuredHeight2 < 0) {
                                measuredHeight2 = 0;
                            }
                            childAt3.measure(childMeasureSpec, View.MeasureSpec.makeMeasureSpec(measuredHeight2, i22));
                            i51 = View.combineMeasuredStates(i51, childAt3.getMeasuredState() & (-256));
                        } else {
                            i20 = i52;
                        }
                        int i54 = ((LinearLayout.LayoutParams) t1Var4).leftMargin + ((LinearLayout.LayoutParams) t1Var4).rightMargin;
                        int measuredWidth2 = childAt3.getMeasuredWidth() + i54;
                        i31 = Math.max(i31, measuredWidth2);
                        if (i44 != 1073741824) {
                            i21 = -1;
                            if (((LinearLayout.LayoutParams) t1Var4).width == -1) {
                                measuredWidth2 = i54;
                            }
                        } else {
                            i21 = -1;
                        }
                        i36 = Math.max(i36, measuredWidth2);
                        boolean z17 = z14 && ((LinearLayout.LayoutParams) t1Var4).width == i21;
                        int i55 = u1Var.f2658k;
                        u1Var.f2658k = Math.max(i55, childAt3.getMeasuredHeight() + i55 + ((LinearLayout.LayoutParams) t1Var4).topMargin + ((LinearLayout.LayoutParams) t1Var4).bottomMargin);
                        z14 = z17;
                    }
                    i52 = i20 + 1;
                }
                u1Var.f2658k = u1Var.getPaddingBottom() + u1Var.getPaddingTop() + u1Var.f2658k;
                i46 = i51;
            } else {
                i36 = Math.max(i36, i37);
                if (z16 && i45 != 1073741824) {
                    for (int i56 = 0; i56 < virtualChildCount; i56++) {
                        View childAt4 = u1Var.getChildAt(i56);
                        if (childAt4 != null && childAt4.getVisibility() != 8 && ((LinearLayout.LayoutParams) ((t1) childAt4.getLayoutParams())).weight > 0.0f) {
                            childAt4.measure(View.MeasureSpec.makeMeasureSpec(childAt4.getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(i39, 1073741824));
                        }
                    }
                }
            }
            if (z14 || i44 == 1073741824) {
                i36 = i31;
            }
            u1Var.setMeasuredDimension(View.resolveSizeAndState(Math.max(u1Var.getPaddingRight() + u1Var.getPaddingLeft() + i36, u1Var.getSuggestedMinimumWidth()), i4, i46), resolveSizeAndState);
            if (z13) {
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(u1Var.getMeasuredWidth(), 1073741824);
                int i57 = 0;
                while (i57 < virtualChildCount) {
                    View childAt5 = u1Var.getChildAt(i57);
                    if (childAt5.getVisibility() != 8) {
                        t1 t1Var5 = (t1) childAt5.getLayoutParams();
                        if (((LinearLayout.LayoutParams) t1Var5).width == -1) {
                            int i58 = ((LinearLayout.LayoutParams) t1Var5).height;
                            ((LinearLayout.LayoutParams) t1Var5).height = childAt5.getMeasuredHeight();
                            u1Var.measureChildWithMargins(childAt5, makeMeasureSpec, 0, i47, 0);
                            ((LinearLayout.LayoutParams) t1Var5).height = i58;
                        }
                    }
                    i57++;
                    i47 = i5;
                }
                return;
            }
            return;
        }
        int i59 = i4;
        u1Var.f2658k = 0;
        int virtualChildCount2 = u1Var.getVirtualChildCount();
        int mode3 = View.MeasureSpec.getMode(i59);
        int mode4 = View.MeasureSpec.getMode(i5);
        if (u1Var.f2661n == null || u1Var.f2662o == null) {
            u1Var.f2661n = new int[4];
            u1Var.f2662o = new int[4];
        }
        int[] iArr3 = u1Var.f2661n;
        int[] iArr4 = u1Var.f2662o;
        iArr3[3] = -1;
        char c = 2;
        iArr3[2] = -1;
        iArr3[1] = -1;
        iArr3[0] = -1;
        iArr4[3] = -1;
        iArr4[2] = -1;
        iArr4[1] = -1;
        iArr4[0] = -1;
        boolean z18 = u1Var.f2655f;
        boolean z19 = u1Var.f2660m;
        boolean z20 = mode3 == 1073741824;
        float f8 = 0.0f;
        boolean z21 = true;
        int i60 = 0;
        int i61 = 0;
        int i62 = 0;
        int i63 = 0;
        int i64 = 0;
        int i65 = 0;
        boolean z22 = false;
        boolean z23 = false;
        while (i60 < virtualChildCount2) {
            char c4 = c;
            View childAt6 = u1Var.getChildAt(i60);
            if (childAt6 == null) {
                u1Var.f2658k = u1Var.f2658k;
                i15 = i60;
                i19 = i62;
                iArr2 = iArr3;
                iArr = iArr4;
                z4 = z18;
                z5 = z19;
            } else {
                int i66 = i61;
                if (childAt6.getVisibility() == 8) {
                    i59 = i4;
                    i15 = i60;
                    i19 = i62;
                    iArr = iArr4;
                    z4 = z18;
                    z5 = z19;
                    i61 = i66;
                    iArr2 = iArr3;
                } else {
                    if (u1Var.i(i60)) {
                        u1Var.f2658k += u1Var.f2664q;
                    }
                    t1 t1Var6 = (t1) childAt6.getLayoutParams();
                    float f9 = ((LinearLayout.LayoutParams) t1Var6).weight;
                    f8 += f9;
                    int i67 = i60;
                    if (mode3 == 1073741824 && ((LinearLayout.LayoutParams) t1Var6).width == 0 && f9 > 0.0f) {
                        if (z20) {
                            u1Var.f2658k = ((LinearLayout.LayoutParams) t1Var6).leftMargin + ((LinearLayout.LayoutParams) t1Var6).rightMargin + u1Var.f2658k;
                        } else {
                            int i68 = u1Var.f2658k;
                            u1Var.f2658k = Math.max(i68, ((LinearLayout.LayoutParams) t1Var6).leftMargin + i68 + ((LinearLayout.LayoutParams) t1Var6).rightMargin);
                        }
                        if (z18) {
                            int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 0);
                            childAt6.measure(makeMeasureSpec2, makeMeasureSpec2);
                            view = childAt6;
                            z4 = z18;
                            z5 = z19;
                            i16 = i66;
                            i15 = i67;
                            t1Var = t1Var6;
                            iArr2 = iArr3;
                            iArr = iArr4;
                            i59 = i4;
                            i17 = i62;
                            i14 = i63;
                        } else {
                            view = childAt6;
                            z4 = z18;
                            z5 = z19;
                            z23 = true;
                            i16 = i66;
                            i15 = i67;
                            i18 = 1073741824;
                            t1Var = t1Var6;
                            iArr2 = iArr3;
                            iArr = iArr4;
                            i59 = i4;
                            i17 = i62;
                            i14 = i63;
                            if (mode4 == i18 && ((LinearLayout.LayoutParams) t1Var).height == -1) {
                                z6 = true;
                                z22 = true;
                            } else {
                                z6 = false;
                            }
                            int i69 = ((LinearLayout.LayoutParams) t1Var).topMargin + ((LinearLayout.LayoutParams) t1Var).bottomMargin;
                            int measuredHeight3 = view.getMeasuredHeight() + i69;
                            i65 = View.combineMeasuredStates(i65, view.getMeasuredState());
                            if (z4) {
                                z7 = z6;
                            } else {
                                int baseline2 = view.getBaseline();
                                z7 = z6;
                                if (baseline2 != -1) {
                                    int i70 = ((LinearLayout.LayoutParams) t1Var).gravity;
                                    if (i70 < 0) {
                                        i70 = u1Var.f2657j;
                                    }
                                    int i71 = (((i70 & 112) >> 4) & (-2)) >> 1;
                                    iArr2[i71] = Math.max(iArr2[i71], baseline2);
                                    iArr[i71] = Math.max(iArr[i71], measuredHeight3 - baseline2);
                                }
                            }
                            int max2 = Math.max(i16, measuredHeight3);
                            boolean z24 = !z21 && ((LinearLayout.LayoutParams) t1Var).height == -1;
                            if (((LinearLayout.LayoutParams) t1Var).weight <= 0.0f) {
                                if (!z7) {
                                    i69 = measuredHeight3;
                                }
                                i63 = Math.max(i14, i69);
                                max = i17;
                            } else {
                                if (!z7) {
                                    i69 = measuredHeight3;
                                }
                                max = Math.max(i17, i69);
                                i63 = i14;
                            }
                            int i72 = max;
                            i61 = max2;
                            i19 = i72;
                            z21 = z24;
                        }
                    } else {
                        if (((LinearLayout.LayoutParams) t1Var6).width != 0 || f9 <= 0.0f) {
                            i13 = Integer.MIN_VALUE;
                        } else {
                            ((LinearLayout.LayoutParams) t1Var6).width = -2;
                            i13 = 0;
                        }
                        iArr = iArr4;
                        i14 = i63;
                        i15 = i67;
                        z4 = z18;
                        z5 = z19;
                        int i73 = i13;
                        t1Var = t1Var6;
                        i16 = i66;
                        i59 = i4;
                        iArr2 = iArr3;
                        i17 = i62;
                        u1Var.measureChildWithMargins(childAt6, i59, f8 == 0.0f ? u1Var.f2658k : 0, i5, 0);
                        if (i73 != Integer.MIN_VALUE) {
                            ((LinearLayout.LayoutParams) t1Var).width = i73;
                        }
                        int measuredWidth3 = childAt6.getMeasuredWidth();
                        if (z20) {
                            view = childAt6;
                            u1Var.f2658k = ((LinearLayout.LayoutParams) t1Var).leftMargin + measuredWidth3 + ((LinearLayout.LayoutParams) t1Var).rightMargin + u1Var.f2658k;
                        } else {
                            view = childAt6;
                            int i74 = u1Var.f2658k;
                            u1Var.f2658k = Math.max(i74, i74 + measuredWidth3 + ((LinearLayout.LayoutParams) t1Var).leftMargin + ((LinearLayout.LayoutParams) t1Var).rightMargin);
                        }
                        if (z5) {
                            i64 = Math.max(measuredWidth3, i64);
                        }
                    }
                    i18 = 1073741824;
                    if (mode4 == i18) {
                    }
                    z6 = false;
                    int i692 = ((LinearLayout.LayoutParams) t1Var).topMargin + ((LinearLayout.LayoutParams) t1Var).bottomMargin;
                    int measuredHeight32 = view.getMeasuredHeight() + i692;
                    i65 = View.combineMeasuredStates(i65, view.getMeasuredState());
                    if (z4) {
                    }
                    int max22 = Math.max(i16, measuredHeight32);
                    if (z21) {
                    }
                    if (((LinearLayout.LayoutParams) t1Var).weight <= 0.0f) {
                    }
                    int i722 = max;
                    i61 = max22;
                    i19 = i722;
                    z21 = z24;
                }
            }
            i62 = i19;
            i60 = i15 + 1;
            c = c4;
            iArr3 = iArr2;
            iArr4 = iArr;
            z18 = z4;
            z19 = z5;
        }
        int[] iArr5 = iArr3;
        int[] iArr6 = iArr4;
        char c5 = c;
        boolean z25 = z18;
        boolean z26 = z19;
        int i75 = i61;
        int i76 = i62;
        int i77 = i63;
        if (u1Var.f2658k > 0 && u1Var.i(virtualChildCount2)) {
            u1Var.f2658k += u1Var.f2664q;
        }
        int i78 = iArr5[1];
        int max3 = (i78 == -1 && iArr5[0] == -1 && iArr5[c5] == -1 && iArr5[3] == -1) ? i75 : Math.max(i75, Math.max(iArr6[3], Math.max(iArr6[0], Math.max(iArr6[1], iArr6[c5]))) + Math.max(iArr5[3], Math.max(iArr5[0], Math.max(i78, iArr5[c5]))));
        if (z26 && (mode3 == Integer.MIN_VALUE || mode3 == 0)) {
            u1Var.f2658k = 0;
            for (int i79 = 0; i79 < virtualChildCount2; i79++) {
                View childAt7 = u1Var.getChildAt(i79);
                if (childAt7 == null) {
                    u1Var.f2658k = u1Var.f2658k;
                } else if (childAt7.getVisibility() != 8) {
                    t1 t1Var7 = (t1) childAt7.getLayoutParams();
                    if (z20) {
                        u1Var.f2658k = ((LinearLayout.LayoutParams) t1Var7).leftMargin + i64 + ((LinearLayout.LayoutParams) t1Var7).rightMargin + u1Var.f2658k;
                    } else {
                        int i80 = u1Var.f2658k;
                        u1Var.f2658k = Math.max(i80, i80 + i64 + ((LinearLayout.LayoutParams) t1Var7).leftMargin + ((LinearLayout.LayoutParams) t1Var7).rightMargin);
                    }
                }
            }
        }
        int paddingRight = u1Var.getPaddingRight() + u1Var.getPaddingLeft() + u1Var.f2658k;
        u1Var.f2658k = paddingRight;
        int resolveSizeAndState2 = View.resolveSizeAndState(Math.max(paddingRight, u1Var.getSuggestedMinimumWidth()), i59, 0);
        int i81 = (resolveSizeAndState2 & 16777215) - u1Var.f2658k;
        if (z23 || (i81 != 0 && f8 > 0.0f)) {
            float f10 = u1Var.f2659l;
            if (f10 > 0.0f) {
                f8 = f10;
            }
            iArr5[3] = -1;
            iArr5[c5] = -1;
            iArr5[1] = -1;
            iArr5[0] = -1;
            iArr6[3] = -1;
            iArr6[c5] = -1;
            iArr6[1] = -1;
            iArr6[0] = -1;
            u1Var.f2658k = 0;
            max3 = -1;
            int i82 = 0;
            while (i82 < virtualChildCount2) {
                View childAt8 = u1Var.getChildAt(i82);
                if (childAt8 == null || childAt8.getVisibility() == 8) {
                    i10 = resolveSizeAndState2;
                } else {
                    t1 t1Var8 = (t1) childAt8.getLayoutParams();
                    float f11 = ((LinearLayout.LayoutParams) t1Var8).weight;
                    if (f11 > 0.0f) {
                        int i83 = (int) ((i81 * f11) / f8);
                        f8 -= f11;
                        i81 -= i83;
                        i10 = resolveSizeAndState2;
                        int childMeasureSpec2 = ViewGroup.getChildMeasureSpec(i5, u1Var.getPaddingBottom() + u1Var.getPaddingTop() + ((LinearLayout.LayoutParams) t1Var8).topMargin + ((LinearLayout.LayoutParams) t1Var8).bottomMargin, ((LinearLayout.LayoutParams) t1Var8).height);
                        if (((LinearLayout.LayoutParams) t1Var8).width == 0) {
                            i12 = 1073741824;
                            if (mode3 == 1073741824) {
                                if (i83 <= 0) {
                                    i83 = 0;
                                }
                                childAt8.measure(View.MeasureSpec.makeMeasureSpec(i83, 1073741824), childMeasureSpec2);
                                i65 = View.combineMeasuredStates(i65, childAt8.getMeasuredState() & (-16777216));
                            }
                        } else {
                            i12 = 1073741824;
                        }
                        int measuredWidth4 = childAt8.getMeasuredWidth() + i83;
                        if (measuredWidth4 < 0) {
                            measuredWidth4 = 0;
                        }
                        childAt8.measure(View.MeasureSpec.makeMeasureSpec(measuredWidth4, i12), childMeasureSpec2);
                        i65 = View.combineMeasuredStates(i65, childAt8.getMeasuredState() & (-16777216));
                    } else {
                        i10 = resolveSizeAndState2;
                    }
                    if (z20) {
                        u1Var.f2658k = childAt8.getMeasuredWidth() + ((LinearLayout.LayoutParams) t1Var8).leftMargin + ((LinearLayout.LayoutParams) t1Var8).rightMargin + u1Var.f2658k;
                    } else {
                        int i84 = u1Var.f2658k;
                        u1Var.f2658k = Math.max(i84, childAt8.getMeasuredWidth() + i84 + ((LinearLayout.LayoutParams) t1Var8).leftMargin + ((LinearLayout.LayoutParams) t1Var8).rightMargin);
                    }
                    boolean z27 = mode4 != 1073741824 && ((LinearLayout.LayoutParams) t1Var8).height == -1;
                    int i85 = ((LinearLayout.LayoutParams) t1Var8).topMargin + ((LinearLayout.LayoutParams) t1Var8).bottomMargin;
                    int measuredHeight4 = childAt8.getMeasuredHeight() + i85;
                    max3 = Math.max(max3, measuredHeight4);
                    if (!z27) {
                        i85 = measuredHeight4;
                    }
                    int max4 = Math.max(i76, i85);
                    if (z21) {
                        i11 = -1;
                        if (((LinearLayout.LayoutParams) t1Var8).height == -1) {
                            z3 = true;
                            if (!z25 && (baseline = childAt8.getBaseline()) != i11) {
                                int i86 = ((LinearLayout.LayoutParams) t1Var8).gravity;
                                if (i86 < 0) {
                                    i86 = u1Var.f2657j;
                                }
                                int i87 = (((i86 & 112) >> 4) & (-2)) >> 1;
                                iArr5[i87] = Math.max(iArr5[i87], baseline);
                                iArr6[i87] = Math.max(iArr6[i87], measuredHeight4 - baseline);
                            }
                            z21 = z3;
                            i76 = max4;
                        }
                    } else {
                        i11 = -1;
                    }
                    z3 = false;
                    if (!z25) {
                    }
                    z21 = z3;
                    i76 = max4;
                }
                i82++;
                resolveSizeAndState2 = i10;
            }
            i6 = resolveSizeAndState2;
            i7 = -16777216;
            u1Var.f2658k = u1Var.getPaddingRight() + u1Var.getPaddingLeft() + u1Var.f2658k;
            int i88 = iArr5[1];
            if (i88 == -1 && iArr5[0] == -1 && iArr5[c5] == -1 && iArr5[3] == -1) {
                i8 = 0;
            } else {
                i8 = 0;
                max3 = Math.max(max3, Math.max(iArr6[3], Math.max(iArr6[0], Math.max(iArr6[1], iArr6[c5]))) + Math.max(iArr5[3], Math.max(iArr5[0], Math.max(i88, iArr5[c5]))));
            }
            i9 = i76;
        } else {
            i9 = Math.max(i76, i77);
            if (z26 && mode3 != 1073741824) {
                for (int i89 = 0; i89 < virtualChildCount2; i89++) {
                    View childAt9 = u1Var.getChildAt(i89);
                    if (childAt9 != null && childAt9.getVisibility() != 8 && ((LinearLayout.LayoutParams) ((t1) childAt9.getLayoutParams())).weight > 0.0f) {
                        childAt9.measure(View.MeasureSpec.makeMeasureSpec(i64, 1073741824), View.MeasureSpec.makeMeasureSpec(childAt9.getMeasuredHeight(), 1073741824));
                    }
                }
            }
            i6 = resolveSizeAndState2;
            i7 = -16777216;
            i8 = 0;
        }
        if (!z21 && mode4 != 1073741824) {
            max3 = i9;
        }
        u1Var.setMeasuredDimension(i6 | (i65 & i7), View.resolveSizeAndState(Math.max(u1Var.getPaddingBottom() + u1Var.getPaddingTop() + max3, u1Var.getSuggestedMinimumHeight()), i5, i65 << 16));
        if (z22) {
            int makeMeasureSpec3 = View.MeasureSpec.makeMeasureSpec(u1Var.getMeasuredHeight(), 1073741824);
            int i90 = i8;
            while (i90 < virtualChildCount2) {
                View childAt10 = u1Var.getChildAt(i90);
                if (childAt10.getVisibility() != 8) {
                    t1 t1Var9 = (t1) childAt10.getLayoutParams();
                    if (((LinearLayout.LayoutParams) t1Var9).height == -1) {
                        int i91 = ((LinearLayout.LayoutParams) t1Var9).width;
                        ((LinearLayout.LayoutParams) t1Var9).width = childAt10.getMeasuredWidth();
                        u1Var.measureChildWithMargins(childAt10, i59, 0, makeMeasureSpec3, 0);
                        ((LinearLayout.LayoutParams) t1Var9).width = i91;
                    }
                }
                i90++;
                u1Var = this;
                i59 = i4;
            }
        }
    }

    public void setBaselineAligned(boolean z3) {
        this.f2655f = z3;
    }

    public void setBaselineAlignedChildIndex(int i4) {
        if (i4 >= 0 && i4 < getChildCount()) {
            this.g = i4;
            return;
        }
        throw new IllegalArgumentException("base aligned child index out of range (0, " + getChildCount() + ")");
    }

    public void setDividerDrawable(Drawable drawable) {
        if (drawable == this.f2663p) {
            return;
        }
        this.f2663p = drawable;
        if (drawable != null) {
            this.f2664q = drawable.getIntrinsicWidth();
            this.f2665r = drawable.getIntrinsicHeight();
        } else {
            this.f2664q = 0;
            this.f2665r = 0;
        }
        setWillNotDraw(drawable == null);
        requestLayout();
    }

    public void setDividerPadding(int i4) {
        this.f2667t = i4;
    }

    public void setGravity(int i4) {
        if (this.f2657j != i4) {
            if ((8388615 & i4) == 0) {
                i4 |= 8388611;
            }
            if ((i4 & 112) == 0) {
                i4 |= 48;
            }
            this.f2657j = i4;
            requestLayout();
        }
    }

    public void setHorizontalGravity(int i4) {
        int i5 = i4 & 8388615;
        int i6 = this.f2657j;
        if ((8388615 & i6) != i5) {
            this.f2657j = i5 | ((-8388616) & i6);
            requestLayout();
        }
    }

    public void setMeasureWithLargestChildEnabled(boolean z3) {
        this.f2660m = z3;
    }

    public void setOrientation(int i4) {
        if (this.f2656i != i4) {
            this.f2656i = i4;
            requestLayout();
        }
    }

    public void setShowDividers(int i4) {
        if (i4 != this.f2666s) {
            requestLayout();
        }
        this.f2666s = i4;
    }

    public void setVerticalGravity(int i4) {
        int i5 = i4 & 112;
        int i6 = this.f2657j;
        if ((i6 & 112) != i5) {
            this.f2657j = i5 | (i6 & (-113));
            requestLayout();
        }
    }

    public void setWeightSum(float f4) {
        this.f2659l = Math.max(0.0f, f4);
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }
}
