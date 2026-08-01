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

/* compiled from: r8-map-id-cbdb90155a17acee3f5e5c838b1038a1056cff151b1a2a170c159711c8afb558 */
/* loaded from: classes.dex */
public abstract class u1 extends ViewGroup {

    /* renamed from: f, reason: collision with root package name */
    public boolean f2572f;

    /* renamed from: g, reason: collision with root package name */
    public int f2573g;
    public int h;
    public int i;

    /* renamed from: j, reason: collision with root package name */
    public int f2574j;

    /* renamed from: k, reason: collision with root package name */
    public int f2575k;

    /* renamed from: l, reason: collision with root package name */
    public float f2576l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f2577m;

    /* renamed from: n, reason: collision with root package name */
    public int[] f2578n;

    /* renamed from: o, reason: collision with root package name */
    public int[] f2579o;

    /* renamed from: p, reason: collision with root package name */
    public Drawable f2580p;

    /* renamed from: q, reason: collision with root package name */
    public int f2581q;

    /* renamed from: r, reason: collision with root package name */
    public int f2582r;

    /* renamed from: s, reason: collision with root package name */
    public int f2583s;

    /* renamed from: t, reason: collision with root package name */
    public int f2584t;

    public u1(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, 0);
        this.f2572f = true;
        this.f2573g = -1;
        this.h = 0;
        this.f2574j = 8388659;
        int[] iArr = f.a.f1400n;
        androidx.emoji2.text.t i4 = androidx.emoji2.text.t.i(0, 0, context, attributeSet, iArr);
        n0.p0.l(this, context, iArr, attributeSet, (TypedArray) i4.f473b, 0);
        TypedArray typedArray = (TypedArray) i4.f473b;
        int i5 = typedArray.getInt(1, -1);
        if (i5 >= 0) {
            setOrientation(i5);
        }
        int i6 = typedArray.getInt(0, -1);
        if (i6 >= 0) {
            setGravity(i6);
        }
        boolean z4 = typedArray.getBoolean(2, true);
        if (!z4) {
            setBaselineAligned(z4);
        }
        this.f2576l = typedArray.getFloat(4, -1.0f);
        this.f2573g = typedArray.getInt(3, -1);
        this.f2577m = typedArray.getBoolean(7, false);
        setDividerDrawable(i4.d(5));
        this.f2583s = typedArray.getInt(8, 0);
        this.f2584t = typedArray.getDimensionPixelSize(6, 0);
        i4.k();
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof t1;
    }

    public final void d(Canvas canvas, int i) {
        this.f2580p.setBounds(getPaddingLeft() + this.f2584t, i, (getWidth() - getPaddingRight()) - this.f2584t, this.f2582r + i);
        this.f2580p.draw(canvas);
    }

    public final void e(Canvas canvas, int i) {
        this.f2580p.setBounds(i, getPaddingTop() + this.f2584t, this.f2581q + i, (getHeight() - getPaddingBottom()) - this.f2584t);
        this.f2580p.draw(canvas);
    }

    @Override // android.view.ViewGroup
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public t1 generateDefaultLayoutParams() {
        int i = this.i;
        if (i == 0) {
            return new t1(-2, -2);
        }
        if (i == 1) {
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
        int i;
        if (this.f2573g < 0) {
            return super.getBaseline();
        }
        int childCount = getChildCount();
        int i4 = this.f2573g;
        if (childCount <= i4) {
            throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout set to an index that is out of bounds.");
        }
        View childAt = getChildAt(i4);
        int baseline = childAt.getBaseline();
        if (baseline == -1) {
            if (this.f2573g == 0) {
                return -1;
            }
            throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout points to a View that doesn't know how to get its baseline.");
        }
        int i5 = this.h;
        if (this.i == 1 && (i = this.f2574j & 112) != 48) {
            if (i == 16) {
                i5 += ((((getBottom() - getTop()) - getPaddingTop()) - getPaddingBottom()) - this.f2575k) / 2;
            } else if (i == 80) {
                i5 = ((getBottom() - getTop()) - getPaddingBottom()) - this.f2575k;
            }
        }
        return i5 + ((LinearLayout.LayoutParams) ((t1) childAt.getLayoutParams())).topMargin + baseline;
    }

    public int getBaselineAlignedChildIndex() {
        return this.f2573g;
    }

    public Drawable getDividerDrawable() {
        return this.f2580p;
    }

    public int getDividerPadding() {
        return this.f2584t;
    }

    public int getDividerWidth() {
        return this.f2581q;
    }

    public int getGravity() {
        return this.f2574j;
    }

    public int getOrientation() {
        return this.i;
    }

    public int getShowDividers() {
        return this.f2583s;
    }

    public int getVirtualChildCount() {
        return getChildCount();
    }

    public float getWeightSum() {
        return this.f2576l;
    }

    @Override // android.view.ViewGroup
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public t1 generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof t1 ? new t1((t1) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new t1((ViewGroup.MarginLayoutParams) layoutParams) : new t1(layoutParams);
    }

    public final boolean i(int i) {
        if (i == 0) {
            return (this.f2583s & 1) != 0;
        }
        if (i == getChildCount()) {
            return (this.f2583s & 4) != 0;
        }
        if ((this.f2583s & 2) != 0) {
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
        if (this.f2580p == null) {
            return;
        }
        int i4 = 0;
        if (this.i == 1) {
            int virtualChildCount = getVirtualChildCount();
            while (i4 < virtualChildCount) {
                View childAt = getChildAt(i4);
                if (childAt != null && childAt.getVisibility() != 8 && i(i4)) {
                    d(canvas, (childAt.getTop() - ((LinearLayout.LayoutParams) ((t1) childAt.getLayoutParams())).topMargin) - this.f2582r);
                }
                i4++;
            }
            if (i(virtualChildCount)) {
                View childAt2 = getChildAt(virtualChildCount - 1);
                d(canvas, childAt2 == null ? (getHeight() - getPaddingBottom()) - this.f2582r : childAt2.getBottom() + ((LinearLayout.LayoutParams) ((t1) childAt2.getLayoutParams())).bottomMargin);
                return;
            }
            return;
        }
        int virtualChildCount2 = getVirtualChildCount();
        boolean z4 = f3.f2448a;
        boolean z5 = getLayoutDirection() == 1;
        while (i4 < virtualChildCount2) {
            View childAt3 = getChildAt(i4);
            if (childAt3 != null && childAt3.getVisibility() != 8 && i(i4)) {
                t1 t1Var = (t1) childAt3.getLayoutParams();
                e(canvas, z5 ? childAt3.getRight() + ((LinearLayout.LayoutParams) t1Var).rightMargin : (childAt3.getLeft() - ((LinearLayout.LayoutParams) t1Var).leftMargin) - this.f2581q);
            }
            i4++;
        }
        if (i(virtualChildCount2)) {
            View childAt4 = getChildAt(virtualChildCount2 - 1);
            if (childAt4 != null) {
                t1 t1Var2 = (t1) childAt4.getLayoutParams();
                if (z5) {
                    left = childAt4.getLeft() - ((LinearLayout.LayoutParams) t1Var2).leftMargin;
                    i = this.f2581q;
                    right = left - i;
                } else {
                    right = childAt4.getRight() + ((LinearLayout.LayoutParams) t1Var2).rightMargin;
                }
            } else if (z5) {
                right = getPaddingLeft();
            } else {
                left = getWidth() - getPaddingRight();
                i = this.f2581q;
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
    public void onLayout(boolean z4, int i, int i4, int i5, int i6) {
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        char c5;
        int i16;
        int i17;
        int i18;
        int i19 = 8;
        char c6 = 2;
        if (this.i == 1) {
            int paddingLeft = getPaddingLeft();
            int i20 = i5 - i;
            int paddingRight = i20 - getPaddingRight();
            int paddingRight2 = (i20 - paddingLeft) - getPaddingRight();
            int virtualChildCount = getVirtualChildCount();
            int i21 = this.f2574j;
            int i22 = i21 & 112;
            int i23 = 8388615 & i21;
            int paddingTop = i22 != 16 ? i22 != 80 ? getPaddingTop() : ((getPaddingTop() + i6) - i4) - this.f2575k : getPaddingTop() + (((i6 - i4) - this.f2575k) / 2);
            int i24 = 0;
            while (i24 < virtualChildCount) {
                View childAt = getChildAt(i24);
                if (childAt == null || childAt.getVisibility() == i19) {
                    c5 = c6;
                } else {
                    int measuredWidth = childAt.getMeasuredWidth();
                    int measuredHeight = childAt.getMeasuredHeight();
                    t1 t1Var = (t1) childAt.getLayoutParams();
                    c5 = c6;
                    int i25 = ((LinearLayout.LayoutParams) t1Var).gravity;
                    if (i25 < 0) {
                        i25 = i23;
                    }
                    int absoluteGravity = Gravity.getAbsoluteGravity(i25, getLayoutDirection()) & 7;
                    if (absoluteGravity == 1) {
                        i16 = ((paddingRight2 - measuredWidth) / 2) + paddingLeft + ((LinearLayout.LayoutParams) t1Var).leftMargin;
                        i17 = ((LinearLayout.LayoutParams) t1Var).rightMargin;
                    } else if (absoluteGravity != 5) {
                        i18 = ((LinearLayout.LayoutParams) t1Var).leftMargin + paddingLeft;
                        if (i(i24)) {
                            paddingTop += this.f2582r;
                        }
                        int i26 = paddingTop + ((LinearLayout.LayoutParams) t1Var).topMargin;
                        childAt.layout(i18, i26, measuredWidth + i18, i26 + measuredHeight);
                        paddingTop = measuredHeight + ((LinearLayout.LayoutParams) t1Var).bottomMargin + i26;
                    } else {
                        i16 = paddingRight - measuredWidth;
                        i17 = ((LinearLayout.LayoutParams) t1Var).rightMargin;
                    }
                    i18 = i16 - i17;
                    if (i(i24)) {
                    }
                    int i262 = paddingTop + ((LinearLayout.LayoutParams) t1Var).topMargin;
                    childAt.layout(i18, i262, measuredWidth + i18, i262 + measuredHeight);
                    paddingTop = measuredHeight + ((LinearLayout.LayoutParams) t1Var).bottomMargin + i262;
                }
                i24++;
                c6 = c5;
                i19 = 8;
            }
            return;
        }
        boolean z5 = f3.f2448a;
        boolean z6 = getLayoutDirection() == 1;
        int paddingTop2 = getPaddingTop();
        int i27 = i6 - i4;
        int paddingBottom = i27 - getPaddingBottom();
        int paddingBottom2 = (i27 - paddingTop2) - getPaddingBottom();
        int virtualChildCount2 = getVirtualChildCount();
        int i28 = this.f2574j;
        int i29 = 8388615 & i28;
        int i30 = i28 & 112;
        boolean z7 = this.f2572f;
        int[] iArr = this.f2578n;
        int[] iArr2 = this.f2579o;
        int absoluteGravity2 = Gravity.getAbsoluteGravity(i29, getLayoutDirection());
        int paddingLeft2 = absoluteGravity2 != 1 ? absoluteGravity2 != 5 ? getPaddingLeft() : ((getPaddingLeft() + i5) - i) - this.f2575k : getPaddingLeft() + (((i5 - i) - this.f2575k) / 2);
        if (z6) {
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
                    t1 t1Var2 = (t1) childAt2.getLayoutParams();
                    int i33 = paddingLeft2;
                    if (z7) {
                        i10 = paddingTop2;
                        if (((LinearLayout.LayoutParams) t1Var2).height != -1) {
                            i11 = childAt2.getBaseline();
                            i12 = ((LinearLayout.LayoutParams) t1Var2).gravity;
                            if (i12 < 0) {
                                i12 = i30;
                            }
                            i13 = i12 & 112;
                            if (i13 == 16) {
                                if (i13 == 48) {
                                    i14 = i10 + ((LinearLayout.LayoutParams) t1Var2).topMargin;
                                    if (i11 != -1) {
                                        i14 = (iArr[1] - i11) + i14;
                                    }
                                } else if (i13 != 80) {
                                    i14 = i10;
                                } else {
                                    i14 = (paddingBottom - measuredHeight2) - ((LinearLayout.LayoutParams) t1Var2).bottomMargin;
                                    if (i11 != -1) {
                                        i15 = iArr2[2] - (childAt2.getMeasuredHeight() - i11);
                                    }
                                }
                                int i34 = (i(i32) ? i33 + this.f2581q : i33) + ((LinearLayout.LayoutParams) t1Var2).leftMargin;
                                childAt2.layout(i34, i14, i34 + measuredWidth2, i14 + measuredHeight2);
                                paddingLeft2 = measuredWidth2 + ((LinearLayout.LayoutParams) t1Var2).rightMargin + i34;
                                i31++;
                                i8 = i9;
                                paddingTop2 = i10;
                            } else {
                                i14 = ((paddingBottom2 - measuredHeight2) / 2) + i10 + ((LinearLayout.LayoutParams) t1Var2).topMargin;
                                i15 = ((LinearLayout.LayoutParams) t1Var2).bottomMargin;
                            }
                            i14 -= i15;
                            int i342 = (i(i32) ? i33 + this.f2581q : i33) + ((LinearLayout.LayoutParams) t1Var2).leftMargin;
                            childAt2.layout(i342, i14, i342 + measuredWidth2, i14 + measuredHeight2);
                            paddingLeft2 = measuredWidth2 + ((LinearLayout.LayoutParams) t1Var2).rightMargin + i342;
                            i31++;
                            i8 = i9;
                            paddingTop2 = i10;
                        }
                    } else {
                        i10 = paddingTop2;
                    }
                    i11 = -1;
                    i12 = ((LinearLayout.LayoutParams) t1Var2).gravity;
                    if (i12 < 0) {
                    }
                    i13 = i12 & 112;
                    if (i13 == 16) {
                    }
                    i14 -= i15;
                    int i3422 = (i(i32) ? i33 + this.f2581q : i33) + ((LinearLayout.LayoutParams) t1Var2).leftMargin;
                    childAt2.layout(i3422, i14, i3422 + measuredWidth2, i14 + measuredHeight2);
                    paddingLeft2 = measuredWidth2 + ((LinearLayout.LayoutParams) t1Var2).rightMargin + i3422;
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
        boolean z4;
        int baseline;
        int i11;
        int i12;
        int[] iArr;
        int i13;
        int i14;
        boolean z5;
        boolean z6;
        t1 t1Var;
        int i15;
        int[] iArr2;
        int i16;
        View view;
        int i17;
        boolean z7;
        boolean z8;
        int max;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        int i24;
        int i25;
        boolean z9;
        int i26;
        int i27;
        int i28;
        View view2;
        boolean z10;
        boolean z11;
        u1 u1Var = this;
        int i29 = -2;
        int i30 = 0;
        int i31 = 1073741824;
        int i32 = 8;
        if (u1Var.i == 1) {
            u1Var.f2575k = 0;
            int virtualChildCount = u1Var.getVirtualChildCount();
            int mode = View.MeasureSpec.getMode(i);
            int mode2 = View.MeasureSpec.getMode(i4);
            int i33 = u1Var.f2573g;
            boolean z12 = u1Var.f2577m;
            int i34 = 0;
            int i35 = 0;
            int i36 = 0;
            boolean z13 = false;
            int i37 = 0;
            boolean z14 = false;
            boolean z15 = true;
            float f5 = 0.0f;
            int i38 = 0;
            while (i34 < virtualChildCount) {
                int i39 = mode;
                View childAt = u1Var.getChildAt(i34);
                if (childAt == null) {
                    u1Var.f2575k = u1Var.f2575k;
                } else if (childAt.getVisibility() != i32) {
                    if (u1Var.i(i34)) {
                        u1Var.f2575k += u1Var.f2582r;
                    }
                    t1 t1Var2 = (t1) childAt.getLayoutParams();
                    float f6 = ((LinearLayout.LayoutParams) t1Var2).weight;
                    f5 += f6;
                    if (mode2 == i31 && ((LinearLayout.LayoutParams) t1Var2).height == 0 && f6 > 0.0f) {
                        int i40 = u1Var.f2575k;
                        u1Var.f2575k = Math.max(i40, ((LinearLayout.LayoutParams) t1Var2).topMargin + i40 + ((LinearLayout.LayoutParams) t1Var2).bottomMargin);
                        view2 = childAt;
                        i25 = mode2;
                        i26 = i33;
                        z9 = z12;
                        i27 = i34;
                        z13 = true;
                        i28 = i39;
                    } else {
                        if (((LinearLayout.LayoutParams) t1Var2).height != 0 || f6 <= 0.0f) {
                            i22 = Integer.MIN_VALUE;
                        } else {
                            ((LinearLayout.LayoutParams) t1Var2).height = i29;
                            i22 = 0;
                        }
                        if (f5 == 0.0f) {
                            i23 = i34;
                            i24 = u1Var.f2575k;
                        } else {
                            i23 = i34;
                            i24 = 0;
                        }
                        i25 = mode2;
                        z9 = z12;
                        i26 = i33;
                        i27 = i23;
                        i28 = i39;
                        u1Var.measureChildWithMargins(childAt, i, 0, i4, i24);
                        if (i22 != Integer.MIN_VALUE) {
                            ((LinearLayout.LayoutParams) t1Var2).height = i22;
                        }
                        int measuredHeight = childAt.getMeasuredHeight();
                        int i41 = u1Var.f2575k;
                        view2 = childAt;
                        u1Var.f2575k = Math.max(i41, i41 + measuredHeight + ((LinearLayout.LayoutParams) t1Var2).topMargin + ((LinearLayout.LayoutParams) t1Var2).bottomMargin);
                        if (z9) {
                            i38 = Math.max(measuredHeight, i38);
                        }
                    }
                    if (i26 >= 0 && i26 == i27 + 1) {
                        u1Var.h = u1Var.f2575k;
                    }
                    if (i27 < i26 && ((LinearLayout.LayoutParams) t1Var2).weight > 0.0f) {
                        throw new RuntimeException("A child of LinearLayout with index less than mBaselineAlignedChildIndex has weight > 0, which won't work.  Either remove the weight, or don't set mBaselineAlignedChildIndex.");
                    }
                    if (i28 == 1073741824 || ((LinearLayout.LayoutParams) t1Var2).width != -1) {
                        z10 = false;
                    } else {
                        z10 = true;
                        z14 = true;
                    }
                    int i42 = ((LinearLayout.LayoutParams) t1Var2).leftMargin + ((LinearLayout.LayoutParams) t1Var2).rightMargin;
                    int measuredWidth = view2.getMeasuredWidth() + i42;
                    i30 = Math.max(i30, measuredWidth);
                    int measuredState = view2.getMeasuredState();
                    boolean z16 = z10;
                    int combineMeasuredStates = View.combineMeasuredStates(i37, measuredState);
                    if (z15) {
                        i37 = combineMeasuredStates;
                        if (((LinearLayout.LayoutParams) t1Var2).width == -1) {
                            z11 = true;
                            if (((LinearLayout.LayoutParams) t1Var2).weight <= 0.0f) {
                                if (!z16) {
                                    i42 = measuredWidth;
                                }
                                i36 = Math.max(i36, i42);
                            } else {
                                if (!z16) {
                                    i42 = measuredWidth;
                                }
                                i35 = Math.max(i35, i42);
                            }
                            z15 = z11;
                            i34 = i27 + 1;
                            i33 = i26;
                            mode = i28;
                            z12 = z9;
                            mode2 = i25;
                            i29 = -2;
                            i31 = 1073741824;
                            i32 = 8;
                        }
                    } else {
                        i37 = combineMeasuredStates;
                    }
                    z11 = false;
                    if (((LinearLayout.LayoutParams) t1Var2).weight <= 0.0f) {
                    }
                    z15 = z11;
                    i34 = i27 + 1;
                    i33 = i26;
                    mode = i28;
                    z12 = z9;
                    mode2 = i25;
                    i29 = -2;
                    i31 = 1073741824;
                    i32 = 8;
                }
                i25 = mode2;
                i26 = i33;
                z9 = z12;
                i27 = i34;
                i28 = i39;
                i34 = i27 + 1;
                i33 = i26;
                mode = i28;
                z12 = z9;
                mode2 = i25;
                i29 = -2;
                i31 = 1073741824;
                i32 = 8;
            }
            int i43 = mode;
            int i44 = mode2;
            boolean z17 = z12;
            int i45 = i37;
            int i46 = i4;
            if (u1Var.f2575k > 0 && u1Var.i(virtualChildCount)) {
                u1Var.f2575k += u1Var.f2582r;
            }
            if (z17 && (i44 == Integer.MIN_VALUE || i44 == 0)) {
                u1Var.f2575k = 0;
                for (int i47 = 0; i47 < virtualChildCount; i47++) {
                    View childAt2 = u1Var.getChildAt(i47);
                    if (childAt2 == null) {
                        u1Var.f2575k = u1Var.f2575k;
                    } else if (childAt2.getVisibility() != 8) {
                        t1 t1Var3 = (t1) childAt2.getLayoutParams();
                        int i48 = u1Var.f2575k;
                        u1Var.f2575k = Math.max(i48, i48 + i38 + ((LinearLayout.LayoutParams) t1Var3).topMargin + ((LinearLayout.LayoutParams) t1Var3).bottomMargin);
                    }
                }
            }
            int paddingBottom = u1Var.getPaddingBottom() + u1Var.getPaddingTop() + u1Var.f2575k;
            u1Var.f2575k = paddingBottom;
            int resolveSizeAndState = View.resolveSizeAndState(Math.max(paddingBottom, u1Var.getSuggestedMinimumHeight()), i46, 0);
            int i49 = (resolveSizeAndState & 16777215) - u1Var.f2575k;
            if (z13 || (i49 != 0 && f5 > 0.0f)) {
                float f7 = u1Var.f2576l;
                if (f7 > 0.0f) {
                    f5 = f7;
                }
                u1Var.f2575k = 0;
                int i50 = i45;
                int i51 = 0;
                while (i51 < virtualChildCount) {
                    View childAt3 = u1Var.getChildAt(i51);
                    if (childAt3.getVisibility() == 8) {
                        i19 = i51;
                    } else {
                        t1 t1Var4 = (t1) childAt3.getLayoutParams();
                        float f8 = ((LinearLayout.LayoutParams) t1Var4).weight;
                        if (f8 > 0.0f) {
                            int i52 = (int) ((i49 * f8) / f5);
                            f5 -= f8;
                            i49 -= i52;
                            i19 = i51;
                            int childMeasureSpec = ViewGroup.getChildMeasureSpec(i, u1Var.getPaddingRight() + u1Var.getPaddingLeft() + ((LinearLayout.LayoutParams) t1Var4).leftMargin + ((LinearLayout.LayoutParams) t1Var4).rightMargin, ((LinearLayout.LayoutParams) t1Var4).width);
                            if (((LinearLayout.LayoutParams) t1Var4).height == 0) {
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
                        int i53 = ((LinearLayout.LayoutParams) t1Var4).leftMargin + ((LinearLayout.LayoutParams) t1Var4).rightMargin;
                        int measuredWidth2 = childAt3.getMeasuredWidth() + i53;
                        i30 = Math.max(i30, measuredWidth2);
                        if (i43 != 1073741824) {
                            i20 = -1;
                            if (((LinearLayout.LayoutParams) t1Var4).width == -1) {
                                measuredWidth2 = i53;
                            }
                        } else {
                            i20 = -1;
                        }
                        i35 = Math.max(i35, measuredWidth2);
                        boolean z18 = z15 && ((LinearLayout.LayoutParams) t1Var4).width == i20;
                        int i54 = u1Var.f2575k;
                        u1Var.f2575k = Math.max(i54, childAt3.getMeasuredHeight() + i54 + ((LinearLayout.LayoutParams) t1Var4).topMargin + ((LinearLayout.LayoutParams) t1Var4).bottomMargin);
                        z15 = z18;
                    }
                    i51 = i19 + 1;
                }
                u1Var.f2575k = u1Var.getPaddingBottom() + u1Var.getPaddingTop() + u1Var.f2575k;
                i45 = i50;
            } else {
                i35 = Math.max(i35, i36);
                if (z17 && i44 != 1073741824) {
                    for (int i55 = 0; i55 < virtualChildCount; i55++) {
                        View childAt4 = u1Var.getChildAt(i55);
                        if (childAt4 != null && childAt4.getVisibility() != 8 && ((LinearLayout.LayoutParams) ((t1) childAt4.getLayoutParams())).weight > 0.0f) {
                            childAt4.measure(View.MeasureSpec.makeMeasureSpec(childAt4.getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(i38, 1073741824));
                        }
                    }
                }
            }
            if (z15 || i43 == 1073741824) {
                i35 = i30;
            }
            u1Var.setMeasuredDimension(View.resolveSizeAndState(Math.max(u1Var.getPaddingRight() + u1Var.getPaddingLeft() + i35, u1Var.getSuggestedMinimumWidth()), i, i45), resolveSizeAndState);
            if (z14) {
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(u1Var.getMeasuredWidth(), 1073741824);
                int i56 = 0;
                while (i56 < virtualChildCount) {
                    View childAt5 = u1Var.getChildAt(i56);
                    if (childAt5.getVisibility() != 8) {
                        t1 t1Var5 = (t1) childAt5.getLayoutParams();
                        if (((LinearLayout.LayoutParams) t1Var5).width == -1) {
                            int i57 = ((LinearLayout.LayoutParams) t1Var5).height;
                            ((LinearLayout.LayoutParams) t1Var5).height = childAt5.getMeasuredHeight();
                            u1Var.measureChildWithMargins(childAt5, makeMeasureSpec, 0, i46, 0);
                            ((LinearLayout.LayoutParams) t1Var5).height = i57;
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
        u1Var.f2575k = 0;
        int virtualChildCount2 = u1Var.getVirtualChildCount();
        int mode3 = View.MeasureSpec.getMode(i58);
        int mode4 = View.MeasureSpec.getMode(i4);
        if (u1Var.f2578n == null || u1Var.f2579o == null) {
            u1Var.f2578n = new int[4];
            u1Var.f2579o = new int[4];
        }
        int[] iArr3 = u1Var.f2578n;
        int[] iArr4 = u1Var.f2579o;
        iArr3[3] = -1;
        char c5 = 2;
        iArr3[2] = -1;
        iArr3[1] = -1;
        iArr3[0] = -1;
        iArr4[3] = -1;
        iArr4[2] = -1;
        iArr4[1] = -1;
        iArr4[0] = -1;
        boolean z19 = u1Var.f2572f;
        boolean z20 = u1Var.f2577m;
        boolean z21 = mode3 == 1073741824;
        float f9 = 0.0f;
        boolean z22 = true;
        int i59 = 0;
        int i60 = 0;
        int i61 = 0;
        int i62 = 0;
        int i63 = 0;
        int i64 = 0;
        boolean z23 = false;
        boolean z24 = false;
        while (i59 < virtualChildCount2) {
            char c6 = c5;
            View childAt6 = u1Var.getChildAt(i59);
            if (childAt6 == null) {
                u1Var.f2575k = u1Var.f2575k;
                i14 = i59;
                i18 = i61;
                iArr2 = iArr3;
                iArr = iArr4;
                z5 = z19;
                z6 = z20;
            } else {
                int i65 = i60;
                if (childAt6.getVisibility() == 8) {
                    i58 = i;
                    i14 = i59;
                    i18 = i61;
                    iArr = iArr4;
                    z5 = z19;
                    z6 = z20;
                    i60 = i65;
                    iArr2 = iArr3;
                } else {
                    if (u1Var.i(i59)) {
                        u1Var.f2575k += u1Var.f2581q;
                    }
                    t1 t1Var6 = (t1) childAt6.getLayoutParams();
                    float f10 = ((LinearLayout.LayoutParams) t1Var6).weight;
                    f9 += f10;
                    int i66 = i59;
                    if (mode3 == 1073741824 && ((LinearLayout.LayoutParams) t1Var6).width == 0 && f10 > 0.0f) {
                        if (z21) {
                            u1Var.f2575k = ((LinearLayout.LayoutParams) t1Var6).leftMargin + ((LinearLayout.LayoutParams) t1Var6).rightMargin + u1Var.f2575k;
                        } else {
                            int i67 = u1Var.f2575k;
                            u1Var.f2575k = Math.max(i67, ((LinearLayout.LayoutParams) t1Var6).leftMargin + i67 + ((LinearLayout.LayoutParams) t1Var6).rightMargin);
                        }
                        if (z19) {
                            int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 0);
                            childAt6.measure(makeMeasureSpec2, makeMeasureSpec2);
                            view = childAt6;
                            z5 = z19;
                            z6 = z20;
                            i15 = i65;
                            i14 = i66;
                            t1Var = t1Var6;
                            iArr2 = iArr3;
                            iArr = iArr4;
                            i58 = i;
                            i16 = i61;
                            i13 = i62;
                        } else {
                            view = childAt6;
                            z5 = z19;
                            z6 = z20;
                            z24 = true;
                            i15 = i65;
                            i14 = i66;
                            i17 = 1073741824;
                            t1Var = t1Var6;
                            iArr2 = iArr3;
                            iArr = iArr4;
                            i58 = i;
                            i16 = i61;
                            i13 = i62;
                            if (mode4 == i17 && ((LinearLayout.LayoutParams) t1Var).height == -1) {
                                z7 = true;
                                z23 = true;
                            } else {
                                z7 = false;
                            }
                            int i68 = ((LinearLayout.LayoutParams) t1Var).topMargin + ((LinearLayout.LayoutParams) t1Var).bottomMargin;
                            int measuredHeight3 = view.getMeasuredHeight() + i68;
                            i64 = View.combineMeasuredStates(i64, view.getMeasuredState());
                            if (z5) {
                                z8 = z7;
                            } else {
                                int baseline2 = view.getBaseline();
                                z8 = z7;
                                if (baseline2 != -1) {
                                    int i69 = ((LinearLayout.LayoutParams) t1Var).gravity;
                                    if (i69 < 0) {
                                        i69 = u1Var.f2574j;
                                    }
                                    int i70 = (((i69 & 112) >> 4) & (-2)) >> 1;
                                    iArr2[i70] = Math.max(iArr2[i70], baseline2);
                                    iArr[i70] = Math.max(iArr[i70], measuredHeight3 - baseline2);
                                }
                            }
                            int max2 = Math.max(i15, measuredHeight3);
                            boolean z25 = !z22 && ((LinearLayout.LayoutParams) t1Var).height == -1;
                            if (((LinearLayout.LayoutParams) t1Var).weight <= 0.0f) {
                                if (!z8) {
                                    i68 = measuredHeight3;
                                }
                                i62 = Math.max(i13, i68);
                                max = i16;
                            } else {
                                if (!z8) {
                                    i68 = measuredHeight3;
                                }
                                max = Math.max(i16, i68);
                                i62 = i13;
                            }
                            int i71 = max;
                            i60 = max2;
                            i18 = i71;
                            z22 = z25;
                        }
                    } else {
                        if (((LinearLayout.LayoutParams) t1Var6).width != 0 || f10 <= 0.0f) {
                            i12 = Integer.MIN_VALUE;
                        } else {
                            ((LinearLayout.LayoutParams) t1Var6).width = -2;
                            i12 = 0;
                        }
                        iArr = iArr4;
                        i13 = i62;
                        i14 = i66;
                        z5 = z19;
                        z6 = z20;
                        int i72 = i12;
                        t1Var = t1Var6;
                        i15 = i65;
                        i58 = i;
                        iArr2 = iArr3;
                        i16 = i61;
                        u1Var.measureChildWithMargins(childAt6, i58, f9 == 0.0f ? u1Var.f2575k : 0, i4, 0);
                        if (i72 != Integer.MIN_VALUE) {
                            ((LinearLayout.LayoutParams) t1Var).width = i72;
                        }
                        int measuredWidth3 = childAt6.getMeasuredWidth();
                        if (z21) {
                            view = childAt6;
                            u1Var.f2575k = ((LinearLayout.LayoutParams) t1Var).leftMargin + measuredWidth3 + ((LinearLayout.LayoutParams) t1Var).rightMargin + u1Var.f2575k;
                        } else {
                            view = childAt6;
                            int i73 = u1Var.f2575k;
                            u1Var.f2575k = Math.max(i73, i73 + measuredWidth3 + ((LinearLayout.LayoutParams) t1Var).leftMargin + ((LinearLayout.LayoutParams) t1Var).rightMargin);
                        }
                        if (z6) {
                            i63 = Math.max(measuredWidth3, i63);
                        }
                    }
                    i17 = 1073741824;
                    if (mode4 == i17) {
                    }
                    z7 = false;
                    int i682 = ((LinearLayout.LayoutParams) t1Var).topMargin + ((LinearLayout.LayoutParams) t1Var).bottomMargin;
                    int measuredHeight32 = view.getMeasuredHeight() + i682;
                    i64 = View.combineMeasuredStates(i64, view.getMeasuredState());
                    if (z5) {
                    }
                    int max22 = Math.max(i15, measuredHeight32);
                    if (z22) {
                    }
                    if (((LinearLayout.LayoutParams) t1Var).weight <= 0.0f) {
                    }
                    int i712 = max;
                    i60 = max22;
                    i18 = i712;
                    z22 = z25;
                }
            }
            i61 = i18;
            i59 = i14 + 1;
            c5 = c6;
            iArr3 = iArr2;
            iArr4 = iArr;
            z19 = z5;
            z20 = z6;
        }
        int[] iArr5 = iArr3;
        int[] iArr6 = iArr4;
        char c7 = c5;
        boolean z26 = z19;
        boolean z27 = z20;
        int i74 = i60;
        int i75 = i61;
        int i76 = i62;
        if (u1Var.f2575k > 0 && u1Var.i(virtualChildCount2)) {
            u1Var.f2575k += u1Var.f2581q;
        }
        int i77 = iArr5[1];
        int max3 = (i77 == -1 && iArr5[0] == -1 && iArr5[c7] == -1 && iArr5[3] == -1) ? i74 : Math.max(i74, Math.max(iArr6[3], Math.max(iArr6[0], Math.max(iArr6[1], iArr6[c7]))) + Math.max(iArr5[3], Math.max(iArr5[0], Math.max(i77, iArr5[c7]))));
        if (z27 && (mode3 == Integer.MIN_VALUE || mode3 == 0)) {
            u1Var.f2575k = 0;
            for (int i78 = 0; i78 < virtualChildCount2; i78++) {
                View childAt7 = u1Var.getChildAt(i78);
                if (childAt7 == null) {
                    u1Var.f2575k = u1Var.f2575k;
                } else if (childAt7.getVisibility() != 8) {
                    t1 t1Var7 = (t1) childAt7.getLayoutParams();
                    if (z21) {
                        u1Var.f2575k = ((LinearLayout.LayoutParams) t1Var7).leftMargin + i63 + ((LinearLayout.LayoutParams) t1Var7).rightMargin + u1Var.f2575k;
                    } else {
                        int i79 = u1Var.f2575k;
                        u1Var.f2575k = Math.max(i79, i79 + i63 + ((LinearLayout.LayoutParams) t1Var7).leftMargin + ((LinearLayout.LayoutParams) t1Var7).rightMargin);
                    }
                }
            }
        }
        int paddingRight = u1Var.getPaddingRight() + u1Var.getPaddingLeft() + u1Var.f2575k;
        u1Var.f2575k = paddingRight;
        int resolveSizeAndState2 = View.resolveSizeAndState(Math.max(paddingRight, u1Var.getSuggestedMinimumWidth()), i58, 0);
        int i80 = (resolveSizeAndState2 & 16777215) - u1Var.f2575k;
        if (z24 || (i80 != 0 && f9 > 0.0f)) {
            float f11 = u1Var.f2576l;
            if (f11 > 0.0f) {
                f9 = f11;
            }
            iArr5[3] = -1;
            iArr5[c7] = -1;
            iArr5[1] = -1;
            iArr5[0] = -1;
            iArr6[3] = -1;
            iArr6[c7] = -1;
            iArr6[1] = -1;
            iArr6[0] = -1;
            u1Var.f2575k = 0;
            max3 = -1;
            int i81 = 0;
            while (i81 < virtualChildCount2) {
                View childAt8 = u1Var.getChildAt(i81);
                if (childAt8 == null || childAt8.getVisibility() == 8) {
                    i9 = resolveSizeAndState2;
                } else {
                    t1 t1Var8 = (t1) childAt8.getLayoutParams();
                    float f12 = ((LinearLayout.LayoutParams) t1Var8).weight;
                    if (f12 > 0.0f) {
                        int i82 = (int) ((i80 * f12) / f9);
                        f9 -= f12;
                        i80 -= i82;
                        i9 = resolveSizeAndState2;
                        int childMeasureSpec2 = ViewGroup.getChildMeasureSpec(i4, u1Var.getPaddingBottom() + u1Var.getPaddingTop() + ((LinearLayout.LayoutParams) t1Var8).topMargin + ((LinearLayout.LayoutParams) t1Var8).bottomMargin, ((LinearLayout.LayoutParams) t1Var8).height);
                        if (((LinearLayout.LayoutParams) t1Var8).width == 0) {
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
                    if (z21) {
                        u1Var.f2575k = childAt8.getMeasuredWidth() + ((LinearLayout.LayoutParams) t1Var8).leftMargin + ((LinearLayout.LayoutParams) t1Var8).rightMargin + u1Var.f2575k;
                    } else {
                        int i83 = u1Var.f2575k;
                        u1Var.f2575k = Math.max(i83, childAt8.getMeasuredWidth() + i83 + ((LinearLayout.LayoutParams) t1Var8).leftMargin + ((LinearLayout.LayoutParams) t1Var8).rightMargin);
                    }
                    boolean z28 = mode4 != 1073741824 && ((LinearLayout.LayoutParams) t1Var8).height == -1;
                    int i84 = ((LinearLayout.LayoutParams) t1Var8).topMargin + ((LinearLayout.LayoutParams) t1Var8).bottomMargin;
                    int measuredHeight4 = childAt8.getMeasuredHeight() + i84;
                    max3 = Math.max(max3, measuredHeight4);
                    if (!z28) {
                        i84 = measuredHeight4;
                    }
                    int max4 = Math.max(i75, i84);
                    if (z22) {
                        i10 = -1;
                        if (((LinearLayout.LayoutParams) t1Var8).height == -1) {
                            z4 = true;
                            if (!z26 && (baseline = childAt8.getBaseline()) != i10) {
                                int i85 = ((LinearLayout.LayoutParams) t1Var8).gravity;
                                if (i85 < 0) {
                                    i85 = u1Var.f2574j;
                                }
                                int i86 = (((i85 & 112) >> 4) & (-2)) >> 1;
                                iArr5[i86] = Math.max(iArr5[i86], baseline);
                                iArr6[i86] = Math.max(iArr6[i86], measuredHeight4 - baseline);
                            }
                            z22 = z4;
                            i75 = max4;
                        }
                    } else {
                        i10 = -1;
                    }
                    z4 = false;
                    if (!z26) {
                    }
                    z22 = z4;
                    i75 = max4;
                }
                i81++;
                resolveSizeAndState2 = i9;
            }
            i5 = resolveSizeAndState2;
            i6 = -16777216;
            u1Var.f2575k = u1Var.getPaddingRight() + u1Var.getPaddingLeft() + u1Var.f2575k;
            int i87 = iArr5[1];
            if (i87 == -1 && iArr5[0] == -1 && iArr5[c7] == -1 && iArr5[3] == -1) {
                i7 = 0;
            } else {
                i7 = 0;
                max3 = Math.max(max3, Math.max(iArr6[3], Math.max(iArr6[0], Math.max(iArr6[1], iArr6[c7]))) + Math.max(iArr5[3], Math.max(iArr5[0], Math.max(i87, iArr5[c7]))));
            }
            i8 = i75;
        } else {
            i8 = Math.max(i75, i76);
            if (z27 && mode3 != 1073741824) {
                for (int i88 = 0; i88 < virtualChildCount2; i88++) {
                    View childAt9 = u1Var.getChildAt(i88);
                    if (childAt9 != null && childAt9.getVisibility() != 8 && ((LinearLayout.LayoutParams) ((t1) childAt9.getLayoutParams())).weight > 0.0f) {
                        childAt9.measure(View.MeasureSpec.makeMeasureSpec(i63, 1073741824), View.MeasureSpec.makeMeasureSpec(childAt9.getMeasuredHeight(), 1073741824));
                    }
                }
            }
            i5 = resolveSizeAndState2;
            i6 = -16777216;
            i7 = 0;
        }
        if (!z22 && mode4 != 1073741824) {
            max3 = i8;
        }
        u1Var.setMeasuredDimension(i5 | (i64 & i6), View.resolveSizeAndState(Math.max(u1Var.getPaddingBottom() + u1Var.getPaddingTop() + max3, u1Var.getSuggestedMinimumHeight()), i4, i64 << 16));
        if (z23) {
            int makeMeasureSpec3 = View.MeasureSpec.makeMeasureSpec(u1Var.getMeasuredHeight(), 1073741824);
            int i89 = i7;
            while (i89 < virtualChildCount2) {
                View childAt10 = u1Var.getChildAt(i89);
                if (childAt10.getVisibility() != 8) {
                    t1 t1Var9 = (t1) childAt10.getLayoutParams();
                    if (((LinearLayout.LayoutParams) t1Var9).height == -1) {
                        int i90 = ((LinearLayout.LayoutParams) t1Var9).width;
                        ((LinearLayout.LayoutParams) t1Var9).width = childAt10.getMeasuredWidth();
                        u1Var.measureChildWithMargins(childAt10, i58, 0, makeMeasureSpec3, 0);
                        ((LinearLayout.LayoutParams) t1Var9).width = i90;
                    }
                }
                i89++;
                u1Var = this;
                i58 = i;
            }
        }
    }

    public void setBaselineAligned(boolean z4) {
        this.f2572f = z4;
    }

    public void setBaselineAlignedChildIndex(int i) {
        if (i >= 0 && i < getChildCount()) {
            this.f2573g = i;
            return;
        }
        throw new IllegalArgumentException("base aligned child index out of range (0, " + getChildCount() + ")");
    }

    public void setDividerDrawable(Drawable drawable) {
        if (drawable == this.f2580p) {
            return;
        }
        this.f2580p = drawable;
        if (drawable != null) {
            this.f2581q = drawable.getIntrinsicWidth();
            this.f2582r = drawable.getIntrinsicHeight();
        } else {
            this.f2581q = 0;
            this.f2582r = 0;
        }
        setWillNotDraw(drawable == null);
        requestLayout();
    }

    public void setDividerPadding(int i) {
        this.f2584t = i;
    }

    public void setGravity(int i) {
        if (this.f2574j != i) {
            if ((8388615 & i) == 0) {
                i |= 8388611;
            }
            if ((i & 112) == 0) {
                i |= 48;
            }
            this.f2574j = i;
            requestLayout();
        }
    }

    public void setHorizontalGravity(int i) {
        int i4 = i & 8388615;
        int i5 = this.f2574j;
        if ((8388615 & i5) != i4) {
            this.f2574j = i4 | ((-8388616) & i5);
            requestLayout();
        }
    }

    public void setMeasureWithLargestChildEnabled(boolean z4) {
        this.f2577m = z4;
    }

    public void setOrientation(int i) {
        if (this.i != i) {
            this.i = i;
            requestLayout();
        }
    }

    public void setShowDividers(int i) {
        if (i != this.f2583s) {
            requestLayout();
        }
        this.f2583s = i;
    }

    public void setVerticalGravity(int i) {
        int i4 = i & 112;
        int i5 = this.f2574j;
        if ((i5 & 112) != i4) {
            this.f2574j = i4 | (i5 & (-113));
            requestLayout();
        }
    }

    public void setWeightSum(float f5) {
        this.f2576l = Math.max(0.0f, f5);
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }
}
