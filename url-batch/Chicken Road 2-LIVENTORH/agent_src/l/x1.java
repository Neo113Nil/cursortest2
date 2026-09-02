package l;

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

/* compiled from: r8-map-id-fb2637cf2a71147074b02d847622f707cfc12821f1b81d08e7915f8e7b9519ab */
/* loaded from: classes.dex */
public abstract class x1 extends ViewGroup {

    /* renamed from: f, reason: collision with root package name */
    public boolean f2492f;

    /* renamed from: g, reason: collision with root package name */
    public int f2493g;

    /* renamed from: h, reason: collision with root package name */
    public int f2494h;
    public int i;

    /* renamed from: j, reason: collision with root package name */
    public int f2495j;

    /* renamed from: k, reason: collision with root package name */
    public int f2496k;

    /* renamed from: l, reason: collision with root package name */
    public float f2497l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f2498m;

    /* renamed from: n, reason: collision with root package name */
    public int[] f2499n;

    /* renamed from: o, reason: collision with root package name */
    public int[] f2500o;

    /* renamed from: p, reason: collision with root package name */
    public Drawable f2501p;

    /* renamed from: q, reason: collision with root package name */
    public int f2502q;

    /* renamed from: r, reason: collision with root package name */
    public int f2503r;

    /* renamed from: s, reason: collision with root package name */
    public int f2504s;

    /* renamed from: t, reason: collision with root package name */
    public int f2505t;

    public x1(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, 0);
        this.f2492f = true;
        this.f2493g = -1;
        this.f2494h = 0;
        this.f2495j = 8388659;
        int[] iArr = f.a.f1251n;
        androidx.emoji2.text.t w3 = androidx.emoji2.text.t.w(context, attributeSet, iArr, 0);
        n0.l0.l(this, context, iArr, attributeSet, (TypedArray) w3.f356c, 0);
        TypedArray typedArray = (TypedArray) w3.f356c;
        int i4 = typedArray.getInt(1, -1);
        if (i4 >= 0) {
            setOrientation(i4);
        }
        int i5 = typedArray.getInt(0, -1);
        if (i5 >= 0) {
            setGravity(i5);
        }
        boolean z3 = typedArray.getBoolean(2, true);
        if (!z3) {
            setBaselineAligned(z3);
        }
        this.f2497l = typedArray.getFloat(4, -1.0f);
        this.f2493g = typedArray.getInt(3, -1);
        this.f2498m = typedArray.getBoolean(7, false);
        setDividerDrawable(w3.n(5));
        this.f2504s = typedArray.getInt(8, 0);
        this.f2505t = typedArray.getDimensionPixelSize(6, 0);
        w3.y();
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof w1;
    }

    public final void d(Canvas canvas, int i) {
        this.f2501p.setBounds(getPaddingLeft() + this.f2505t, i, (getWidth() - getPaddingRight()) - this.f2505t, this.f2503r + i);
        this.f2501p.draw(canvas);
    }

    public final void e(Canvas canvas, int i) {
        this.f2501p.setBounds(i, getPaddingTop() + this.f2505t, this.f2502q + i, (getHeight() - getPaddingBottom()) - this.f2505t);
        this.f2501p.draw(canvas);
    }

    @Override // android.view.ViewGroup
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public w1 generateDefaultLayoutParams() {
        int i = this.i;
        if (i == 0) {
            return new w1(-2, -2);
        }
        if (i == 1) {
            return new w1(-1, -2);
        }
        return null;
    }

    @Override // android.view.ViewGroup
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public w1 generateLayoutParams(AttributeSet attributeSet) {
        return new w1(getContext(), attributeSet);
    }

    @Override // android.view.View
    public int getBaseline() {
        int i;
        if (this.f2493g < 0) {
            return super.getBaseline();
        }
        int childCount = getChildCount();
        int i4 = this.f2493g;
        if (childCount <= i4) {
            throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout set to an index that is out of bounds.");
        }
        View childAt = getChildAt(i4);
        int baseline = childAt.getBaseline();
        if (baseline == -1) {
            if (this.f2493g == 0) {
                return -1;
            }
            throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout points to a View that doesn't know how to get its baseline.");
        }
        int i5 = this.f2494h;
        if (this.i == 1 && (i = this.f2495j & 112) != 48) {
            if (i == 16) {
                i5 += ((((getBottom() - getTop()) - getPaddingTop()) - getPaddingBottom()) - this.f2496k) / 2;
            } else if (i == 80) {
                i5 = ((getBottom() - getTop()) - getPaddingBottom()) - this.f2496k;
            }
        }
        return i5 + ((LinearLayout.LayoutParams) ((w1) childAt.getLayoutParams())).topMargin + baseline;
    }

    public int getBaselineAlignedChildIndex() {
        return this.f2493g;
    }

    public Drawable getDividerDrawable() {
        return this.f2501p;
    }

    public int getDividerPadding() {
        return this.f2505t;
    }

    public int getDividerWidth() {
        return this.f2502q;
    }

    public int getGravity() {
        return this.f2495j;
    }

    public int getOrientation() {
        return this.i;
    }

    public int getShowDividers() {
        return this.f2504s;
    }

    public int getVirtualChildCount() {
        return getChildCount();
    }

    public float getWeightSum() {
        return this.f2497l;
    }

    @Override // android.view.ViewGroup
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public w1 generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof w1 ? new w1((w1) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new w1((ViewGroup.MarginLayoutParams) layoutParams) : new w1(layoutParams);
    }

    public final boolean i(int i) {
        if (i == 0) {
            return (this.f2504s & 1) != 0;
        }
        if (i == getChildCount()) {
            return (this.f2504s & 4) != 0;
        }
        if ((this.f2504s & 2) != 0) {
            for (int i4 = i - 1; i4 >= 0; i4--) {
                if (getChildAt(i4).getVisibility() != 8) {
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
        int i;
        if (this.f2501p == null) {
            return;
        }
        int i4 = 0;
        if (this.i == 1) {
            int virtualChildCount = getVirtualChildCount();
            while (i4 < virtualChildCount) {
                View childAt = getChildAt(i4);
                if (childAt != null && childAt.getVisibility() != 8 && i(i4)) {
                    d(canvas, (childAt.getTop() - ((LinearLayout.LayoutParams) ((w1) childAt.getLayoutParams())).topMargin) - this.f2503r);
                }
                i4++;
            }
            if (i(virtualChildCount)) {
                View childAt2 = getChildAt(virtualChildCount - 1);
                d(canvas, childAt2 == null ? (getHeight() - getPaddingBottom()) - this.f2503r : childAt2.getBottom() + ((LinearLayout.LayoutParams) ((w1) childAt2.getLayoutParams())).bottomMargin);
                return;
            }
            return;
        }
        int virtualChildCount2 = getVirtualChildCount();
        boolean z3 = l3.f2381a;
        boolean z4 = getLayoutDirection() == 1;
        while (i4 < virtualChildCount2) {
            View childAt3 = getChildAt(i4);
            if (childAt3 != null && childAt3.getVisibility() != 8 && i(i4)) {
                w1 w1Var = (w1) childAt3.getLayoutParams();
                e(canvas, z4 ? childAt3.getRight() + ((LinearLayout.LayoutParams) w1Var).rightMargin : (childAt3.getLeft() - ((LinearLayout.LayoutParams) w1Var).leftMargin) - this.f2502q);
            }
            i4++;
        }
        if (i(virtualChildCount2)) {
            View childAt4 = getChildAt(virtualChildCount2 - 1);
            if (childAt4 != null) {
                w1 w1Var2 = (w1) childAt4.getLayoutParams();
                if (z4) {
                    left = childAt4.getLeft() - ((LinearLayout.LayoutParams) w1Var2).leftMargin;
                    i = this.f2502q;
                    right = left - i;
                } else {
                    right = childAt4.getRight() + ((LinearLayout.LayoutParams) w1Var2).rightMargin;
                }
            } else if (z4) {
                right = getPaddingLeft();
            } else {
                left = getWidth() - getPaddingRight();
                i = this.f2502q;
                right = left - i;
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
    public void onLayout(boolean z3, int i, int i4, int i5, int i6) {
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        char c4;
        int i16;
        int i17;
        int i18;
        int i19 = 8;
        char c5 = 2;
        if (this.i == 1) {
            int paddingLeft = getPaddingLeft();
            int i20 = i5 - i;
            int paddingRight = i20 - getPaddingRight();
            int paddingRight2 = (i20 - paddingLeft) - getPaddingRight();
            int virtualChildCount = getVirtualChildCount();
            int i21 = this.f2495j;
            int i22 = i21 & 112;
            int i23 = 8388615 & i21;
            int paddingTop = i22 != 16 ? i22 != 80 ? getPaddingTop() : ((getPaddingTop() + i6) - i4) - this.f2496k : getPaddingTop() + (((i6 - i4) - this.f2496k) / 2);
            int i24 = 0;
            while (i24 < virtualChildCount) {
                View childAt = getChildAt(i24);
                if (childAt == null || childAt.getVisibility() == i19) {
                    c4 = c5;
                } else {
                    int measuredWidth = childAt.getMeasuredWidth();
                    int measuredHeight = childAt.getMeasuredHeight();
                    w1 w1Var = (w1) childAt.getLayoutParams();
                    c4 = c5;
                    int i25 = ((LinearLayout.LayoutParams) w1Var).gravity;
                    if (i25 < 0) {
                        i25 = i23;
                    }
                    int absoluteGravity = Gravity.getAbsoluteGravity(i25, getLayoutDirection()) & 7;
                    if (absoluteGravity == 1) {
                        i16 = ((paddingRight2 - measuredWidth) / 2) + paddingLeft + ((LinearLayout.LayoutParams) w1Var).leftMargin;
                        i17 = ((LinearLayout.LayoutParams) w1Var).rightMargin;
                    } else if (absoluteGravity != 5) {
                        i18 = ((LinearLayout.LayoutParams) w1Var).leftMargin + paddingLeft;
                        if (i(i24)) {
                            paddingTop += this.f2503r;
                        }
                        int i26 = paddingTop + ((LinearLayout.LayoutParams) w1Var).topMargin;
                        childAt.layout(i18, i26, measuredWidth + i18, i26 + measuredHeight);
                        paddingTop = measuredHeight + ((LinearLayout.LayoutParams) w1Var).bottomMargin + i26;
                    } else {
                        i16 = paddingRight - measuredWidth;
                        i17 = ((LinearLayout.LayoutParams) w1Var).rightMargin;
                    }
                    i18 = i16 - i17;
                    if (i(i24)) {
                    }
                    int i262 = paddingTop + ((LinearLayout.LayoutParams) w1Var).topMargin;
                    childAt.layout(i18, i262, measuredWidth + i18, i262 + measuredHeight);
                    paddingTop = measuredHeight + ((LinearLayout.LayoutParams) w1Var).bottomMargin + i262;
                }
                i24++;
                c5 = c4;
                i19 = 8;
            }
            return;
        }
        boolean z4 = l3.f2381a;
        boolean z5 = getLayoutDirection() == 1;
        int paddingTop2 = getPaddingTop();
        int i27 = i6 - i4;
        int paddingBottom = i27 - getPaddingBottom();
        int paddingBottom2 = (i27 - paddingTop2) - getPaddingBottom();
        int virtualChildCount2 = getVirtualChildCount();
        int i28 = this.f2495j;
        int i29 = 8388615 & i28;
        int i30 = i28 & 112;
        boolean z6 = this.f2492f;
        int[] iArr = this.f2499n;
        int[] iArr2 = this.f2500o;
        int absoluteGravity2 = Gravity.getAbsoluteGravity(i29, getLayoutDirection());
        int paddingLeft2 = absoluteGravity2 != 1 ? absoluteGravity2 != 5 ? getPaddingLeft() : ((getPaddingLeft() + i5) - i) - this.f2496k : getPaddingLeft() + (((i5 - i) - this.f2496k) / 2);
        if (z5) {
            i8 = virtualChildCount2 - 1;
            i7 = -1;
        } else {
            i7 = 1;
            i8 = 0;
        }
        int i31 = 0;
        while (i31 < virtualChildCount2) {
            int i32 = (i7 * i31) + i8;
            View childAt2 = getChildAt(i32);
            if (childAt2 == null) {
                i9 = i8;
            } else {
                i9 = i8;
                if (childAt2.getVisibility() != 8) {
                    int measuredWidth2 = childAt2.getMeasuredWidth();
                    int measuredHeight2 = childAt2.getMeasuredHeight();
                    w1 w1Var2 = (w1) childAt2.getLayoutParams();
                    int i33 = paddingLeft2;
                    if (z6) {
                        i10 = paddingTop2;
                        if (((LinearLayout.LayoutParams) w1Var2).height != -1) {
                            i11 = childAt2.getBaseline();
                            i12 = ((LinearLayout.LayoutParams) w1Var2).gravity;
                            if (i12 < 0) {
                                i12 = i30;
                            }
                            i13 = i12 & 112;
                            if (i13 == 16) {
                                if (i13 == 48) {
                                    i14 = i10 + ((LinearLayout.LayoutParams) w1Var2).topMargin;
                                    if (i11 != -1) {
                                        i14 = (iArr[1] - i11) + i14;
                                    }
                                } else if (i13 != 80) {
                                    i14 = i10;
                                } else {
                                    i14 = (paddingBottom - measuredHeight2) - ((LinearLayout.LayoutParams) w1Var2).bottomMargin;
                                    if (i11 != -1) {
                                        i15 = iArr2[2] - (childAt2.getMeasuredHeight() - i11);
                                    }
                                }
                                int i34 = (i(i32) ? i33 + this.f2502q : i33) + ((LinearLayout.LayoutParams) w1Var2).leftMargin;
                                childAt2.layout(i34, i14, i34 + measuredWidth2, i14 + measuredHeight2);
                                paddingLeft2 = measuredWidth2 + ((LinearLayout.LayoutParams) w1Var2).rightMargin + i34;
                                i31++;
                                i8 = i9;
                                paddingTop2 = i10;
                            } else {
                                i14 = ((paddingBottom2 - measuredHeight2) / 2) + i10 + ((LinearLayout.LayoutParams) w1Var2).topMargin;
                                i15 = ((LinearLayout.LayoutParams) w1Var2).bottomMargin;
                            }
                            i14 -= i15;
                            int i342 = (i(i32) ? i33 + this.f2502q : i33) + ((LinearLayout.LayoutParams) w1Var2).leftMargin;
                            childAt2.layout(i342, i14, i342 + measuredWidth2, i14 + measuredHeight2);
                            paddingLeft2 = measuredWidth2 + ((LinearLayout.LayoutParams) w1Var2).rightMargin + i342;
                            i31++;
                            i8 = i9;
                            paddingTop2 = i10;
                        }
                    } else {
                        i10 = paddingTop2;
                    }
                    i11 = -1;
                    i12 = ((LinearLayout.LayoutParams) w1Var2).gravity;
                    if (i12 < 0) {
                    }
                    i13 = i12 & 112;
                    if (i13 == 16) {
                    }
                    i14 -= i15;
                    int i3422 = (i(i32) ? i33 + this.f2502q : i33) + ((LinearLayout.LayoutParams) w1Var2).leftMargin;
                    childAt2.layout(i3422, i14, i3422 + measuredWidth2, i14 + measuredHeight2);
                    paddingLeft2 = measuredWidth2 + ((LinearLayout.LayoutParams) w1Var2).rightMargin + i3422;
                    i31++;
                    i8 = i9;
                    paddingTop2 = i10;
                }
            }
            i10 = paddingTop2;
            i31++;
            i8 = i9;
            paddingTop2 = i10;
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
    public void onMeasure(int i, int i4) {
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        boolean z3;
        int baseline;
        int i11;
        int i12;
        int[] iArr;
        int i13;
        int i14;
        boolean z4;
        boolean z5;
        w1 w1Var;
        int i15;
        int[] iArr2;
        int i16;
        View view;
        int i17;
        boolean z6;
        boolean z7;
        int max;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        int i24;
        int i25;
        boolean z8;
        int i26;
        int i27;
        int i28;
        View view2;
        boolean z9;
        boolean z10;
        x1 x1Var = this;
        int i29 = -2;
        int i30 = 0;
        int i31 = 1073741824;
        int i32 = 8;
        if (x1Var.i == 1) {
            x1Var.f2496k = 0;
            int virtualChildCount = x1Var.getVirtualChildCount();
            int mode = View.MeasureSpec.getMode(i);
            int mode2 = View.MeasureSpec.getMode(i4);
            int i33 = x1Var.f2493g;
            boolean z11 = x1Var.f2498m;
            int i34 = 0;
            int i35 = 0;
            int i36 = 0;
            boolean z12 = false;
            int i37 = 0;
            boolean z13 = false;
            boolean z14 = true;
            float f2 = 0.0f;
            int i38 = 0;
            while (i34 < virtualChildCount) {
                int i39 = mode;
                View childAt = x1Var.getChildAt(i34);
                if (childAt == null) {
                    x1Var.f2496k = x1Var.f2496k;
                } else if (childAt.getVisibility() != i32) {
                    if (x1Var.i(i34)) {
                        x1Var.f2496k += x1Var.f2503r;
                    }
                    w1 w1Var2 = (w1) childAt.getLayoutParams();
                    float f4 = ((LinearLayout.LayoutParams) w1Var2).weight;
                    f2 += f4;
                    if (mode2 == i31 && ((LinearLayout.LayoutParams) w1Var2).height == 0 && f4 > 0.0f) {
                        int i40 = x1Var.f2496k;
                        x1Var.f2496k = Math.max(i40, ((LinearLayout.LayoutParams) w1Var2).topMargin + i40 + ((LinearLayout.LayoutParams) w1Var2).bottomMargin);
                        view2 = childAt;
                        i25 = mode2;
                        i26 = i33;
                        z8 = z11;
                        i27 = i34;
                        z12 = true;
                        i28 = i39;
                    } else {
                        if (((LinearLayout.LayoutParams) w1Var2).height != 0 || f4 <= 0.0f) {
                            i22 = Integer.MIN_VALUE;
                        } else {
                            ((LinearLayout.LayoutParams) w1Var2).height = i29;
                            i22 = 0;
                        }
                        if (f2 == 0.0f) {
                            i23 = i34;
                            i24 = x1Var.f2496k;
                        } else {
                            i23 = i34;
                            i24 = 0;
                        }
                        i25 = mode2;
                        z8 = z11;
                        i26 = i33;
                        i27 = i23;
                        i28 = i39;
                        x1Var.measureChildWithMargins(childAt, i, 0, i4, i24);
                        if (i22 != Integer.MIN_VALUE) {
                            ((LinearLayout.LayoutParams) w1Var2).height = i22;
                        }
                        int measuredHeight = childAt.getMeasuredHeight();
                        int i41 = x1Var.f2496k;
                        view2 = childAt;
                        x1Var.f2496k = Math.max(i41, i41 + measuredHeight + ((LinearLayout.LayoutParams) w1Var2).topMargin + ((LinearLayout.LayoutParams) w1Var2).bottomMargin);
                        if (z8) {
                            i38 = Math.max(measuredHeight, i38);
                        }
                    }
                    if (i26 >= 0 && i26 == i27 + 1) {
                        x1Var.f2494h = x1Var.f2496k;
                    }
                    if (i27 < i26 && ((LinearLayout.LayoutParams) w1Var2).weight > 0.0f) {
                        throw new RuntimeException("A child of LinearLayout with index less than mBaselineAlignedChildIndex has weight > 0, which won't work.  Either remove the weight, or don't set mBaselineAlignedChildIndex.");
                    }
                    if (i28 == 1073741824 || ((LinearLayout.LayoutParams) w1Var2).width != -1) {
                        z9 = false;
                    } else {
                        z9 = true;
                        z13 = true;
                    }
                    int i42 = ((LinearLayout.LayoutParams) w1Var2).leftMargin + ((LinearLayout.LayoutParams) w1Var2).rightMargin;
                    int measuredWidth = view2.getMeasuredWidth() + i42;
                    i30 = Math.max(i30, measuredWidth);
                    int measuredState = view2.getMeasuredState();
                    boolean z15 = z9;
                    int combineMeasuredStates = View.combineMeasuredStates(i37, measuredState);
                    if (z14) {
                        i37 = combineMeasuredStates;
                        if (((LinearLayout.LayoutParams) w1Var2).width == -1) {
                            z10 = true;
                            if (((LinearLayout.LayoutParams) w1Var2).weight <= 0.0f) {
                                if (!z15) {
                                    i42 = measuredWidth;
                                }
                                i36 = Math.max(i36, i42);
                            } else {
                                if (!z15) {
                                    i42 = measuredWidth;
                                }
                                i35 = Math.max(i35, i42);
                            }
                            z14 = z10;
                            i34 = i27 + 1;
                            i33 = i26;
                            mode = i28;
                            z11 = z8;
                            mode2 = i25;
                            i29 = -2;
                            i31 = 1073741824;
                            i32 = 8;
                        }
                    } else {
                        i37 = combineMeasuredStates;
                    }
                    z10 = false;
                    if (((LinearLayout.LayoutParams) w1Var2).weight <= 0.0f) {
                    }
                    z14 = z10;
                    i34 = i27 + 1;
                    i33 = i26;
                    mode = i28;
                    z11 = z8;
                    mode2 = i25;
                    i29 = -2;
                    i31 = 1073741824;
                    i32 = 8;
                }
                i25 = mode2;
                i26 = i33;
                z8 = z11;
                i27 = i34;
                i28 = i39;
                i34 = i27 + 1;
                i33 = i26;
                mode = i28;
                z11 = z8;
                mode2 = i25;
                i29 = -2;
                i31 = 1073741824;
                i32 = 8;
            }
            int i43 = mode;
            int i44 = mode2;
            boolean z16 = z11;
            int i45 = i37;
            int i46 = i4;
            if (x1Var.f2496k > 0 && x1Var.i(virtualChildCount)) {
                x1Var.f2496k += x1Var.f2503r;
            }
            if (z16 && (i44 == Integer.MIN_VALUE || i44 == 0)) {
                x1Var.f2496k = 0;
                for (int i47 = 0; i47 < virtualChildCount; i47++) {
                    View childAt2 = x1Var.getChildAt(i47);
                    if (childAt2 == null) {
                        x1Var.f2496k = x1Var.f2496k;
                    } else if (childAt2.getVisibility() != 8) {
                        w1 w1Var3 = (w1) childAt2.getLayoutParams();
                        int i48 = x1Var.f2496k;
                        x1Var.f2496k = Math.max(i48, i48 + i38 + ((LinearLayout.LayoutParams) w1Var3).topMargin + ((LinearLayout.LayoutParams) w1Var3).bottomMargin);
                    }
                }
            }
            int paddingBottom = x1Var.getPaddingBottom() + x1Var.getPaddingTop() + x1Var.f2496k;
            x1Var.f2496k = paddingBottom;
            int resolveSizeAndState = View.resolveSizeAndState(Math.max(paddingBottom, x1Var.getSuggestedMinimumHeight()), i46, 0);
            int i49 = (resolveSizeAndState & 16777215) - x1Var.f2496k;
            if (z12 || (i49 != 0 && f2 > 0.0f)) {
                float f5 = x1Var.f2497l;
                if (f5 > 0.0f) {
                    f2 = f5;
                }
                x1Var.f2496k = 0;
                int i50 = i45;
                int i51 = 0;
                while (i51 < virtualChildCount) {
                    View childAt3 = x1Var.getChildAt(i51);
                    if (childAt3.getVisibility() == 8) {
                        i19 = i51;
                    } else {
                        w1 w1Var4 = (w1) childAt3.getLayoutParams();
                        float f6 = ((LinearLayout.LayoutParams) w1Var4).weight;
                        if (f6 > 0.0f) {
                            int i52 = (int) ((i49 * f6) / f2);
                            f2 -= f6;
                            i49 -= i52;
                            i19 = i51;
                            int childMeasureSpec = ViewGroup.getChildMeasureSpec(i, x1Var.getPaddingRight() + x1Var.getPaddingLeft() + ((LinearLayout.LayoutParams) w1Var4).leftMargin + ((LinearLayout.LayoutParams) w1Var4).rightMargin, ((LinearLayout.LayoutParams) w1Var4).width);
                            if (((LinearLayout.LayoutParams) w1Var4).height == 0) {
                                i21 = 1073741824;
                                if (i44 == 1073741824) {
                                    if (i52 <= 0) {
                                        i52 = 0;
                                    }
                                    childAt3.measure(childMeasureSpec, View.MeasureSpec.makeMeasureSpec(i52, 1073741824));
                                    i50 = View.combineMeasuredStates(i50, childAt3.getMeasuredState() & (-256));
                                }
                            } else {
                                i21 = 1073741824;
                            }
                            int measuredHeight2 = childAt3.getMeasuredHeight() + i52;
                            if (measuredHeight2 < 0) {
                                measuredHeight2 = 0;
                            }
                            childAt3.measure(childMeasureSpec, View.MeasureSpec.makeMeasureSpec(measuredHeight2, i21));
                            i50 = View.combineMeasuredStates(i50, childAt3.getMeasuredState() & (-256));
                        } else {
                            i19 = i51;
                        }
                        int i53 = ((LinearLayout.LayoutParams) w1Var4).leftMargin + ((LinearLayout.LayoutParams) w1Var4).rightMargin;
                        int measuredWidth2 = childAt3.getMeasuredWidth() + i53;
                        i30 = Math.max(i30, measuredWidth2);
                        if (i43 != 1073741824) {
                            i20 = -1;
                            if (((LinearLayout.LayoutParams) w1Var4).width == -1) {
                                measuredWidth2 = i53;
                            }
                        } else {
                            i20 = -1;
                        }
                        i35 = Math.max(i35, measuredWidth2);
                        boolean z17 = z14 && ((LinearLayout.LayoutParams) w1Var4).width == i20;
                        int i54 = x1Var.f2496k;
                        x1Var.f2496k = Math.max(i54, childAt3.getMeasuredHeight() + i54 + ((LinearLayout.LayoutParams) w1Var4).topMargin + ((LinearLayout.LayoutParams) w1Var4).bottomMargin);
                        z14 = z17;
                    }
                    i51 = i19 + 1;
                }
                x1Var.f2496k = x1Var.getPaddingBottom() + x1Var.getPaddingTop() + x1Var.f2496k;
                i45 = i50;
            } else {
                i35 = Math.max(i35, i36);
                if (z16 && i44 != 1073741824) {
                    for (int i55 = 0; i55 < virtualChildCount; i55++) {
                        View childAt4 = x1Var.getChildAt(i55);
                        if (childAt4 != null && childAt4.getVisibility() != 8 && ((LinearLayout.LayoutParams) ((w1) childAt4.getLayoutParams())).weight > 0.0f) {
                            childAt4.measure(View.MeasureSpec.makeMeasureSpec(childAt4.getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(i38, 1073741824));
                        }
                    }
                }
            }
            if (z14 || i43 == 1073741824) {
                i35 = i30;
            }
            x1Var.setMeasuredDimension(View.resolveSizeAndState(Math.max(x1Var.getPaddingRight() + x1Var.getPaddingLeft() + i35, x1Var.getSuggestedMinimumWidth()), i, i45), resolveSizeAndState);
            if (z13) {
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(x1Var.getMeasuredWidth(), 1073741824);
                int i56 = 0;
                while (i56 < virtualChildCount) {
                    View childAt5 = x1Var.getChildAt(i56);
                    if (childAt5.getVisibility() != 8) {
                        w1 w1Var5 = (w1) childAt5.getLayoutParams();
                        if (((LinearLayout.LayoutParams) w1Var5).width == -1) {
                            int i57 = ((LinearLayout.LayoutParams) w1Var5).height;
                            ((LinearLayout.LayoutParams) w1Var5).height = childAt5.getMeasuredHeight();
                            x1Var.measureChildWithMargins(childAt5, makeMeasureSpec, 0, i46, 0);
                            ((LinearLayout.LayoutParams) w1Var5).height = i57;
                        }
                    }
                    i56++;
                    i46 = i4;
                }
                return;
            }
            return;
        }
        int i58 = i;
        x1Var.f2496k = 0;
        int virtualChildCount2 = x1Var.getVirtualChildCount();
        int mode3 = View.MeasureSpec.getMode(i58);
        int mode4 = View.MeasureSpec.getMode(i4);
        if (x1Var.f2499n == null || x1Var.f2500o == null) {
            x1Var.f2499n = new int[4];
            x1Var.f2500o = new int[4];
        }
        int[] iArr3 = x1Var.f2499n;
        int[] iArr4 = x1Var.f2500o;
        iArr3[3] = -1;
        char c4 = 2;
        iArr3[2] = -1;
        iArr3[1] = -1;
        iArr3[0] = -1;
        iArr4[3] = -1;
        iArr4[2] = -1;
        iArr4[1] = -1;
        iArr4[0] = -1;
        boolean z18 = x1Var.f2492f;
        boolean z19 = x1Var.f2498m;
        boolean z20 = mode3 == 1073741824;
        float f7 = 0.0f;
        boolean z21 = true;
        int i59 = 0;
        int i60 = 0;
        int i61 = 0;
        int i62 = 0;
        int i63 = 0;
        int i64 = 0;
        boolean z22 = false;
        boolean z23 = false;
        while (i59 < virtualChildCount2) {
            char c5 = c4;
            View childAt6 = x1Var.getChildAt(i59);
            if (childAt6 == null) {
                x1Var.f2496k = x1Var.f2496k;
                i14 = i59;
                i18 = i61;
                iArr2 = iArr3;
                iArr = iArr4;
                z4 = z18;
                z5 = z19;
            } else {
                int i65 = i60;
                if (childAt6.getVisibility() == 8) {
                    i58 = i;
                    i14 = i59;
                    i18 = i61;
                    iArr = iArr4;
                    z4 = z18;
                    z5 = z19;
                    i60 = i65;
                    iArr2 = iArr3;
                } else {
                    if (x1Var.i(i59)) {
                        x1Var.f2496k += x1Var.f2502q;
                    }
                    w1 w1Var6 = (w1) childAt6.getLayoutParams();
                    float f8 = ((LinearLayout.LayoutParams) w1Var6).weight;
                    f7 += f8;
                    int i66 = i59;
                    if (mode3 == 1073741824 && ((LinearLayout.LayoutParams) w1Var6).width == 0 && f8 > 0.0f) {
                        if (z20) {
                            x1Var.f2496k = ((LinearLayout.LayoutParams) w1Var6).leftMargin + ((LinearLayout.LayoutParams) w1Var6).rightMargin + x1Var.f2496k;
                        } else {
                            int i67 = x1Var.f2496k;
                            x1Var.f2496k = Math.max(i67, ((LinearLayout.LayoutParams) w1Var6).leftMargin + i67 + ((LinearLayout.LayoutParams) w1Var6).rightMargin);
                        }
                        if (z18) {
                            int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 0);
                            childAt6.measure(makeMeasureSpec2, makeMeasureSpec2);
                            view = childAt6;
                            z4 = z18;
                            z5 = z19;
                            i15 = i65;
                            i14 = i66;
                            w1Var = w1Var6;
                            iArr2 = iArr3;
                            iArr = iArr4;
                            i58 = i;
                            i16 = i61;
                            i13 = i62;
                        } else {
                            view = childAt6;
                            z4 = z18;
                            z5 = z19;
                            z23 = true;
                            i15 = i65;
                            i14 = i66;
                            i17 = 1073741824;
                            w1Var = w1Var6;
                            iArr2 = iArr3;
                            iArr = iArr4;
                            i58 = i;
                            i16 = i61;
                            i13 = i62;
                            if (mode4 == i17 && ((LinearLayout.LayoutParams) w1Var).height == -1) {
                                z6 = true;
                                z22 = true;
                            } else {
                                z6 = false;
                            }
                            int i68 = ((LinearLayout.LayoutParams) w1Var).topMargin + ((LinearLayout.LayoutParams) w1Var).bottomMargin;
                            int measuredHeight3 = view.getMeasuredHeight() + i68;
                            i64 = View.combineMeasuredStates(i64, view.getMeasuredState());
                            if (z4) {
                                z7 = z6;
                            } else {
                                int baseline2 = view.getBaseline();
                                z7 = z6;
                                if (baseline2 != -1) {
                                    int i69 = ((LinearLayout.LayoutParams) w1Var).gravity;
                                    if (i69 < 0) {
                                        i69 = x1Var.f2495j;
                                    }
                                    int i70 = (((i69 & 112) >> 4) & (-2)) >> 1;
                                    iArr2[i70] = Math.max(iArr2[i70], baseline2);
                                    iArr[i70] = Math.max(iArr[i70], measuredHeight3 - baseline2);
                                }
                            }
                            int max2 = Math.max(i15, measuredHeight3);
                            boolean z24 = !z21 && ((LinearLayout.LayoutParams) w1Var).height == -1;
                            if (((LinearLayout.LayoutParams) w1Var).weight <= 0.0f) {
                                if (!z7) {
                                    i68 = measuredHeight3;
                                }
                                i62 = Math.max(i13, i68);
                                max = i16;
                            } else {
                                if (!z7) {
                                    i68 = measuredHeight3;
                                }
                                max = Math.max(i16, i68);
                                i62 = i13;
                            }
                            int i71 = max;
                            i60 = max2;
                            i18 = i71;
                            z21 = z24;
                        }
                    } else {
                        if (((LinearLayout.LayoutParams) w1Var6).width != 0 || f8 <= 0.0f) {
                            i12 = Integer.MIN_VALUE;
                        } else {
                            ((LinearLayout.LayoutParams) w1Var6).width = -2;
                            i12 = 0;
                        }
                        iArr = iArr4;
                        i13 = i62;
                        i14 = i66;
                        z4 = z18;
                        z5 = z19;
                        int i72 = i12;
                        w1Var = w1Var6;
                        i15 = i65;
                        i58 = i;
                        iArr2 = iArr3;
                        i16 = i61;
                        x1Var.measureChildWithMargins(childAt6, i58, f7 == 0.0f ? x1Var.f2496k : 0, i4, 0);
                        if (i72 != Integer.MIN_VALUE) {
                            ((LinearLayout.LayoutParams) w1Var).width = i72;
                        }
                        int measuredWidth3 = childAt6.getMeasuredWidth();
                        if (z20) {
                            view = childAt6;
                            x1Var.f2496k = ((LinearLayout.LayoutParams) w1Var).leftMargin + measuredWidth3 + ((LinearLayout.LayoutParams) w1Var).rightMargin + x1Var.f2496k;
                        } else {
                            view = childAt6;
                            int i73 = x1Var.f2496k;
                            x1Var.f2496k = Math.max(i73, i73 + measuredWidth3 + ((LinearLayout.LayoutParams) w1Var).leftMargin + ((LinearLayout.LayoutParams) w1Var).rightMargin);
                        }
                        if (z5) {
                            i63 = Math.max(measuredWidth3, i63);
                        }
                    }
                    i17 = 1073741824;
                    if (mode4 == i17) {
                    }
                    z6 = false;
                    int i682 = ((LinearLayout.LayoutParams) w1Var).topMargin + ((LinearLayout.LayoutParams) w1Var).bottomMargin;
                    int measuredHeight32 = view.getMeasuredHeight() + i682;
                    i64 = View.combineMeasuredStates(i64, view.getMeasuredState());
                    if (z4) {
                    }
                    int max22 = Math.max(i15, measuredHeight32);
                    if (z21) {
                    }
                    if (((LinearLayout.LayoutParams) w1Var).weight <= 0.0f) {
                    }
                    int i712 = max;
                    i60 = max22;
                    i18 = i712;
                    z21 = z24;
                }
            }
            i61 = i18;
            i59 = i14 + 1;
            c4 = c5;
            iArr3 = iArr2;
            iArr4 = iArr;
            z18 = z4;
            z19 = z5;
        }
        int[] iArr5 = iArr3;
        int[] iArr6 = iArr4;
        char c6 = c4;
        boolean z25 = z18;
        boolean z26 = z19;
        int i74 = i60;
        int i75 = i61;
        int i76 = i62;
        if (x1Var.f2496k > 0 && x1Var.i(virtualChildCount2)) {
            x1Var.f2496k += x1Var.f2502q;
        }
        int i77 = iArr5[1];
        int max3 = (i77 == -1 && iArr5[0] == -1 && iArr5[c6] == -1 && iArr5[3] == -1) ? i74 : Math.max(i74, Math.max(iArr6[3], Math.max(iArr6[0], Math.max(iArr6[1], iArr6[c6]))) + Math.max(iArr5[3], Math.max(iArr5[0], Math.max(i77, iArr5[c6]))));
        if (z26 && (mode3 == Integer.MIN_VALUE || mode3 == 0)) {
            x1Var.f2496k = 0;
            for (int i78 = 0; i78 < virtualChildCount2; i78++) {
                View childAt7 = x1Var.getChildAt(i78);
                if (childAt7 == null) {
                    x1Var.f2496k = x1Var.f2496k;
                } else if (childAt7.getVisibility() != 8) {
                    w1 w1Var7 = (w1) childAt7.getLayoutParams();
                    if (z20) {
                        x1Var.f2496k = ((LinearLayout.LayoutParams) w1Var7).leftMargin + i63 + ((LinearLayout.LayoutParams) w1Var7).rightMargin + x1Var.f2496k;
                    } else {
                        int i79 = x1Var.f2496k;
                        x1Var.f2496k = Math.max(i79, i79 + i63 + ((LinearLayout.LayoutParams) w1Var7).leftMargin + ((LinearLayout.LayoutParams) w1Var7).rightMargin);
                    }
                }
            }
        }
        int paddingRight = x1Var.getPaddingRight() + x1Var.getPaddingLeft() + x1Var.f2496k;
        x1Var.f2496k = paddingRight;
        int resolveSizeAndState2 = View.resolveSizeAndState(Math.max(paddingRight, x1Var.getSuggestedMinimumWidth()), i58, 0);
        int i80 = (resolveSizeAndState2 & 16777215) - x1Var.f2496k;
        if (z23 || (i80 != 0 && f7 > 0.0f)) {
            float f9 = x1Var.f2497l;
            if (f9 > 0.0f) {
                f7 = f9;
            }
            iArr5[3] = -1;
            iArr5[c6] = -1;
            iArr5[1] = -1;
            iArr5[0] = -1;
            iArr6[3] = -1;
            iArr6[c6] = -1;
            iArr6[1] = -1;
            iArr6[0] = -1;
            x1Var.f2496k = 0;
            max3 = -1;
            int i81 = 0;
            while (i81 < virtualChildCount2) {
                View childAt8 = x1Var.getChildAt(i81);
                if (childAt8 == null || childAt8.getVisibility() == 8) {
                    i9 = resolveSizeAndState2;
                } else {
                    w1 w1Var8 = (w1) childAt8.getLayoutParams();
                    float f10 = ((LinearLayout.LayoutParams) w1Var8).weight;
                    if (f10 > 0.0f) {
                        int i82 = (int) ((i80 * f10) / f7);
                        f7 -= f10;
                        i80 -= i82;
                        i9 = resolveSizeAndState2;
                        int childMeasureSpec2 = ViewGroup.getChildMeasureSpec(i4, x1Var.getPaddingBottom() + x1Var.getPaddingTop() + ((LinearLayout.LayoutParams) w1Var8).topMargin + ((LinearLayout.LayoutParams) w1Var8).bottomMargin, ((LinearLayout.LayoutParams) w1Var8).height);
                        if (((LinearLayout.LayoutParams) w1Var8).width == 0) {
                            i11 = 1073741824;
                            if (mode3 == 1073741824) {
                                if (i82 <= 0) {
                                    i82 = 0;
                                }
                                childAt8.measure(View.MeasureSpec.makeMeasureSpec(i82, 1073741824), childMeasureSpec2);
                                i64 = View.combineMeasuredStates(i64, childAt8.getMeasuredState() & (-16777216));
                            }
                        } else {
                            i11 = 1073741824;
                        }
                        int measuredWidth4 = childAt8.getMeasuredWidth() + i82;
                        if (measuredWidth4 < 0) {
                            measuredWidth4 = 0;
                        }
                        childAt8.measure(View.MeasureSpec.makeMeasureSpec(measuredWidth4, i11), childMeasureSpec2);
                        i64 = View.combineMeasuredStates(i64, childAt8.getMeasuredState() & (-16777216));
                    } else {
                        i9 = resolveSizeAndState2;
                    }
                    if (z20) {
                        x1Var.f2496k = childAt8.getMeasuredWidth() + ((LinearLayout.LayoutParams) w1Var8).leftMargin + ((LinearLayout.LayoutParams) w1Var8).rightMargin + x1Var.f2496k;
                    } else {
                        int i83 = x1Var.f2496k;
                        x1Var.f2496k = Math.max(i83, childAt8.getMeasuredWidth() + i83 + ((LinearLayout.LayoutParams) w1Var8).leftMargin + ((LinearLayout.LayoutParams) w1Var8).rightMargin);
                    }
                    boolean z27 = mode4 != 1073741824 && ((LinearLayout.LayoutParams) w1Var8).height == -1;
                    int i84 = ((LinearLayout.LayoutParams) w1Var8).topMargin + ((LinearLayout.LayoutParams) w1Var8).bottomMargin;
                    int measuredHeight4 = childAt8.getMeasuredHeight() + i84;
                    max3 = Math.max(max3, measuredHeight4);
                    if (!z27) {
                        i84 = measuredHeight4;
                    }
                    int max4 = Math.max(i75, i84);
                    if (z21) {
                        i10 = -1;
                        if (((LinearLayout.LayoutParams) w1Var8).height == -1) {
                            z3 = true;
                            if (!z25 && (baseline = childAt8.getBaseline()) != i10) {
                                int i85 = ((LinearLayout.LayoutParams) w1Var8).gravity;
                                if (i85 < 0) {
                                    i85 = x1Var.f2495j;
                                }
                                int i86 = (((i85 & 112) >> 4) & (-2)) >> 1;
                                iArr5[i86] = Math.max(iArr5[i86], baseline);
                                iArr6[i86] = Math.max(iArr6[i86], measuredHeight4 - baseline);
                            }
                            z21 = z3;
                            i75 = max4;
                        }
                    } else {
                        i10 = -1;
                    }
                    z3 = false;
                    if (!z25) {
                    }
                    z21 = z3;
                    i75 = max4;
                }
                i81++;
                resolveSizeAndState2 = i9;
            }
            i5 = resolveSizeAndState2;
            i6 = -16777216;
            x1Var.f2496k = x1Var.getPaddingRight() + x1Var.getPaddingLeft() + x1Var.f2496k;
            int i87 = iArr5[1];
            if (i87 == -1 && iArr5[0] == -1 && iArr5[c6] == -1 && iArr5[3] == -1) {
                i7 = 0;
            } else {
                i7 = 0;
                max3 = Math.max(max3, Math.max(iArr6[3], Math.max(iArr6[0], Math.max(iArr6[1], iArr6[c6]))) + Math.max(iArr5[3], Math.max(iArr5[0], Math.max(i87, iArr5[c6]))));
            }
            i8 = i75;
        } else {
            i8 = Math.max(i75, i76);
            if (z26 && mode3 != 1073741824) {
                for (int i88 = 0; i88 < virtualChildCount2; i88++) {
                    View childAt9 = x1Var.getChildAt(i88);
                    if (childAt9 != null && childAt9.getVisibility() != 8 && ((LinearLayout.LayoutParams) ((w1) childAt9.getLayoutParams())).weight > 0.0f) {
                        childAt9.measure(View.MeasureSpec.makeMeasureSpec(i63, 1073741824), View.MeasureSpec.makeMeasureSpec(childAt9.getMeasuredHeight(), 1073741824));
                    }
                }
            }
            i5 = resolveSizeAndState2;
            i6 = -16777216;
            i7 = 0;
        }
        if (!z21 && mode4 != 1073741824) {
            max3 = i8;
        }
        x1Var.setMeasuredDimension(i5 | (i64 & i6), View.resolveSizeAndState(Math.max(x1Var.getPaddingBottom() + x1Var.getPaddingTop() + max3, x1Var.getSuggestedMinimumHeight()), i4, i64 << 16));
        if (z22) {
            int makeMeasureSpec3 = View.MeasureSpec.makeMeasureSpec(x1Var.getMeasuredHeight(), 1073741824);
            int i89 = i7;
            while (i89 < virtualChildCount2) {
                View childAt10 = x1Var.getChildAt(i89);
                if (childAt10.getVisibility() != 8) {
                    w1 w1Var9 = (w1) childAt10.getLayoutParams();
                    if (((LinearLayout.LayoutParams) w1Var9).height == -1) {
                        int i90 = ((LinearLayout.LayoutParams) w1Var9).width;
                        ((LinearLayout.LayoutParams) w1Var9).width = childAt10.getMeasuredWidth();
                        x1Var.measureChildWithMargins(childAt10, i58, 0, makeMeasureSpec3, 0);
                        ((LinearLayout.LayoutParams) w1Var9).width = i90;
                    }
                }
                i89++;
                x1Var = this;
                i58 = i;
            }
        }
    }

    public void setBaselineAligned(boolean z3) {
        this.f2492f = z3;
    }

    public void setBaselineAlignedChildIndex(int i) {
        if (i >= 0 && i < getChildCount()) {
            this.f2493g = i;
            return;
        }
        throw new IllegalArgumentException("base aligned child index out of range (0, " + getChildCount() + ")");
    }

    public void setDividerDrawable(Drawable drawable) {
        if (drawable == this.f2501p) {
            return;
        }
        this.f2501p = drawable;
        if (drawable != null) {
            this.f2502q = drawable.getIntrinsicWidth();
            this.f2503r = drawable.getIntrinsicHeight();
        } else {
            this.f2502q = 0;
            this.f2503r = 0;
        }
        setWillNotDraw(drawable == null);
        requestLayout();
    }

    public void setDividerPadding(int i) {
        this.f2505t = i;
    }

    public void setGravity(int i) {
        if (this.f2495j != i) {
            if ((8388615 & i) == 0) {
                i |= 8388611;
            }
            if ((i & 112) == 0) {
                i |= 48;
            }
            this.f2495j = i;
            requestLayout();
        }
    }

    public void setHorizontalGravity(int i) {
        int i4 = i & 8388615;
        int i5 = this.f2495j;
        if ((8388615 & i5) != i4) {
            this.f2495j = i4 | ((-8388616) & i5);
            requestLayout();
        }
    }

    public void setMeasureWithLargestChildEnabled(boolean z3) {
        this.f2498m = z3;
    }

    public void setOrientation(int i) {
        if (this.i != i) {
            this.i = i;
            requestLayout();
        }
    }

    public void setShowDividers(int i) {
        if (i != this.f2504s) {
            requestLayout();
        }
        this.f2504s = i;
    }

    public void setVerticalGravity(int i) {
        int i4 = i & 112;
        int i5 = this.f2495j;
        if ((i5 & 112) != i4) {
            this.f2495j = i4 | (i5 & (-113));
            requestLayout();
        }
    }

    public void setWeightSum(float f2) {
        this.f2497l = Math.max(0.0f, f2);
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }
}
