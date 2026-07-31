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

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public abstract class b1 extends ViewGroup {

    /* renamed from: d, reason: collision with root package name */
    public boolean f4208d;

    /* renamed from: e, reason: collision with root package name */
    public int f4209e;

    /* renamed from: f, reason: collision with root package name */
    public int f4210f;

    /* renamed from: g, reason: collision with root package name */
    public int f4211g;

    /* renamed from: h, reason: collision with root package name */
    public int f4212h;
    public int i;

    /* renamed from: j, reason: collision with root package name */
    public float f4213j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f4214k;

    /* renamed from: l, reason: collision with root package name */
    public int[] f4215l;

    /* renamed from: m, reason: collision with root package name */
    public int[] f4216m;

    /* renamed from: n, reason: collision with root package name */
    public Drawable f4217n;

    /* renamed from: o, reason: collision with root package name */
    public int f4218o;

    /* renamed from: p, reason: collision with root package name */
    public int f4219p;

    /* renamed from: q, reason: collision with root package name */
    public int f4220q;

    /* renamed from: r, reason: collision with root package name */
    public int f4221r;

    public b1(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, 0);
        this.f4208d = true;
        this.f4209e = -1;
        this.f4210f = 0;
        this.f4212h = 8388659;
        int[] iArr = h.a.f3058k;
        a0.g1 E = a0.g1.E(context, attributeSet, iArr, 0);
        q3.k0.j(this, context, iArr, attributeSet, (TypedArray) E.f85c, 0);
        TypedArray typedArray = (TypedArray) E.f85c;
        int i8 = typedArray.getInt(1, -1);
        if (i8 >= 0) {
            setOrientation(i8);
        }
        int i9 = typedArray.getInt(0, -1);
        if (i9 >= 0) {
            setGravity(i9);
        }
        boolean z3 = typedArray.getBoolean(2, true);
        if (!z3) {
            setBaselineAligned(z3);
        }
        this.f4213j = typedArray.getFloat(4, -1.0f);
        this.f4209e = typedArray.getInt(3, -1);
        this.f4214k = typedArray.getBoolean(7, false);
        setDividerDrawable(E.q(5));
        this.f4220q = typedArray.getInt(8, 0);
        this.f4221r = typedArray.getDimensionPixelSize(6, 0);
        E.G();
    }

    public final void c(Canvas canvas, int i) {
        this.f4217n.setBounds(getPaddingLeft() + this.f4221r, i, (getWidth() - getPaddingRight()) - this.f4221r, this.f4219p + i);
        this.f4217n.draw(canvas);
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof a1;
    }

    public final void d(Canvas canvas, int i) {
        this.f4217n.setBounds(i, getPaddingTop() + this.f4221r, this.f4218o + i, (getHeight() - getPaddingBottom()) - this.f4221r);
        this.f4217n.draw(canvas);
    }

    @Override // android.view.ViewGroup
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public a1 generateDefaultLayoutParams() {
        int i = this.f4211g;
        if (i == 0) {
            return new a1(-2, -2);
        }
        if (i == 1) {
            return new a1(-1, -2);
        }
        return null;
    }

    @Override // android.view.ViewGroup
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public a1 generateLayoutParams(AttributeSet attributeSet) {
        return new a1(getContext(), attributeSet);
    }

    @Override // android.view.ViewGroup
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public a1 generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof a1 ? new a1((a1) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new a1((ViewGroup.MarginLayoutParams) layoutParams) : new a1(layoutParams);
    }

    @Override // android.view.View
    public int getBaseline() {
        int i;
        if (this.f4209e < 0) {
            return super.getBaseline();
        }
        int childCount = getChildCount();
        int i8 = this.f4209e;
        if (childCount <= i8) {
            throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout set to an index that is out of bounds.");
        }
        View childAt = getChildAt(i8);
        int baseline = childAt.getBaseline();
        if (baseline == -1) {
            if (this.f4209e == 0) {
                return -1;
            }
            throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout points to a View that doesn't know how to get its baseline.");
        }
        int i9 = this.f4210f;
        if (this.f4211g == 1 && (i = this.f4212h & 112) != 48) {
            if (i == 16) {
                i9 += ((((getBottom() - getTop()) - getPaddingTop()) - getPaddingBottom()) - this.i) / 2;
            } else if (i == 80) {
                i9 = ((getBottom() - getTop()) - getPaddingBottom()) - this.i;
            }
        }
        return i9 + ((LinearLayout.LayoutParams) ((a1) childAt.getLayoutParams())).topMargin + baseline;
    }

    public int getBaselineAlignedChildIndex() {
        return this.f4209e;
    }

    public Drawable getDividerDrawable() {
        return this.f4217n;
    }

    public int getDividerPadding() {
        return this.f4221r;
    }

    public int getDividerWidth() {
        return this.f4218o;
    }

    public int getGravity() {
        return this.f4212h;
    }

    public int getOrientation() {
        return this.f4211g;
    }

    public int getShowDividers() {
        return this.f4220q;
    }

    public int getVirtualChildCount() {
        return getChildCount();
    }

    public float getWeightSum() {
        return this.f4213j;
    }

    public final boolean h(int i) {
        if (i == 0) {
            return (this.f4220q & 1) != 0;
        }
        if (i == getChildCount()) {
            return (this.f4220q & 4) != 0;
        }
        if ((this.f4220q & 2) != 0) {
            for (int i8 = i - 1; i8 >= 0; i8--) {
                if (getChildAt(i8).getVisibility() != 8) {
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
        if (this.f4217n == null) {
            return;
        }
        int i8 = 0;
        if (this.f4211g == 1) {
            int virtualChildCount = getVirtualChildCount();
            while (i8 < virtualChildCount) {
                View childAt = getChildAt(i8);
                if (childAt != null && childAt.getVisibility() != 8 && h(i8)) {
                    c(canvas, (childAt.getTop() - ((LinearLayout.LayoutParams) ((a1) childAt.getLayoutParams())).topMargin) - this.f4219p);
                }
                i8++;
            }
            if (h(virtualChildCount)) {
                View childAt2 = getChildAt(virtualChildCount - 1);
                c(canvas, childAt2 == null ? (getHeight() - getPaddingBottom()) - this.f4219p : childAt2.getBottom() + ((LinearLayout.LayoutParams) ((a1) childAt2.getLayoutParams())).bottomMargin);
                return;
            }
            return;
        }
        int virtualChildCount2 = getVirtualChildCount();
        boolean z3 = p2.f4378a;
        boolean z7 = getLayoutDirection() == 1;
        while (i8 < virtualChildCount2) {
            View childAt3 = getChildAt(i8);
            if (childAt3 != null && childAt3.getVisibility() != 8 && h(i8)) {
                a1 a1Var = (a1) childAt3.getLayoutParams();
                d(canvas, z7 ? childAt3.getRight() + ((LinearLayout.LayoutParams) a1Var).rightMargin : (childAt3.getLeft() - ((LinearLayout.LayoutParams) a1Var).leftMargin) - this.f4218o);
            }
            i8++;
        }
        if (h(virtualChildCount2)) {
            View childAt4 = getChildAt(virtualChildCount2 - 1);
            if (childAt4 != null) {
                a1 a1Var2 = (a1) childAt4.getLayoutParams();
                if (z7) {
                    left = childAt4.getLeft() - ((LinearLayout.LayoutParams) a1Var2).leftMargin;
                    i = this.f4218o;
                    right = left - i;
                } else {
                    right = childAt4.getRight() + ((LinearLayout.LayoutParams) a1Var2).rightMargin;
                }
            } else if (z7) {
                right = getPaddingLeft();
            } else {
                left = getWidth() - getPaddingRight();
                i = this.f4218o;
                right = left - i;
            }
            d(canvas, right);
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
    public void onLayout(boolean z3, int i, int i8, int i9, int i10) {
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        char c8;
        int i20;
        int i21;
        int i22;
        int i23 = 8;
        char c9 = 2;
        if (this.f4211g == 1) {
            int paddingLeft = getPaddingLeft();
            int i24 = i9 - i;
            int paddingRight = i24 - getPaddingRight();
            int paddingRight2 = (i24 - paddingLeft) - getPaddingRight();
            int virtualChildCount = getVirtualChildCount();
            int i25 = this.f4212h;
            int i26 = i25 & 112;
            int i27 = 8388615 & i25;
            int paddingTop = i26 != 16 ? i26 != 80 ? getPaddingTop() : ((getPaddingTop() + i10) - i8) - this.i : getPaddingTop() + (((i10 - i8) - this.i) / 2);
            int i28 = 0;
            while (i28 < virtualChildCount) {
                View childAt = getChildAt(i28);
                if (childAt == null || childAt.getVisibility() == i23) {
                    c8 = c9;
                } else {
                    int measuredWidth = childAt.getMeasuredWidth();
                    int measuredHeight = childAt.getMeasuredHeight();
                    a1 a1Var = (a1) childAt.getLayoutParams();
                    c8 = c9;
                    int i29 = ((LinearLayout.LayoutParams) a1Var).gravity;
                    if (i29 < 0) {
                        i29 = i27;
                    }
                    int absoluteGravity = Gravity.getAbsoluteGravity(i29, getLayoutDirection()) & 7;
                    if (absoluteGravity == 1) {
                        i20 = ((paddingRight2 - measuredWidth) / 2) + paddingLeft + ((LinearLayout.LayoutParams) a1Var).leftMargin;
                        i21 = ((LinearLayout.LayoutParams) a1Var).rightMargin;
                    } else if (absoluteGravity != 5) {
                        i22 = ((LinearLayout.LayoutParams) a1Var).leftMargin + paddingLeft;
                        if (h(i28)) {
                            paddingTop += this.f4219p;
                        }
                        int i30 = paddingTop + ((LinearLayout.LayoutParams) a1Var).topMargin;
                        childAt.layout(i22, i30, measuredWidth + i22, i30 + measuredHeight);
                        paddingTop = measuredHeight + ((LinearLayout.LayoutParams) a1Var).bottomMargin + i30;
                    } else {
                        i20 = paddingRight - measuredWidth;
                        i21 = ((LinearLayout.LayoutParams) a1Var).rightMargin;
                    }
                    i22 = i20 - i21;
                    if (h(i28)) {
                    }
                    int i302 = paddingTop + ((LinearLayout.LayoutParams) a1Var).topMargin;
                    childAt.layout(i22, i302, measuredWidth + i22, i302 + measuredHeight);
                    paddingTop = measuredHeight + ((LinearLayout.LayoutParams) a1Var).bottomMargin + i302;
                }
                i28++;
                c9 = c8;
                i23 = 8;
            }
            return;
        }
        boolean z7 = p2.f4378a;
        boolean z8 = getLayoutDirection() == 1;
        int paddingTop2 = getPaddingTop();
        int i31 = i10 - i8;
        int paddingBottom = i31 - getPaddingBottom();
        int paddingBottom2 = (i31 - paddingTop2) - getPaddingBottom();
        int virtualChildCount2 = getVirtualChildCount();
        int i32 = this.f4212h;
        int i33 = 8388615 & i32;
        int i34 = i32 & 112;
        boolean z9 = this.f4208d;
        int[] iArr = this.f4215l;
        int[] iArr2 = this.f4216m;
        int absoluteGravity2 = Gravity.getAbsoluteGravity(i33, getLayoutDirection());
        int paddingLeft2 = absoluteGravity2 != 1 ? absoluteGravity2 != 5 ? getPaddingLeft() : ((getPaddingLeft() + i9) - i) - this.i : getPaddingLeft() + (((i9 - i) - this.i) / 2);
        if (z8) {
            i12 = virtualChildCount2 - 1;
            i11 = -1;
        } else {
            i11 = 1;
            i12 = 0;
        }
        int i35 = 0;
        while (i35 < virtualChildCount2) {
            int i36 = (i11 * i35) + i12;
            View childAt2 = getChildAt(i36);
            if (childAt2 == null) {
                i13 = i12;
            } else {
                i13 = i12;
                if (childAt2.getVisibility() != 8) {
                    int measuredWidth2 = childAt2.getMeasuredWidth();
                    int measuredHeight2 = childAt2.getMeasuredHeight();
                    a1 a1Var2 = (a1) childAt2.getLayoutParams();
                    int i37 = paddingLeft2;
                    if (z9) {
                        i14 = paddingTop2;
                        if (((LinearLayout.LayoutParams) a1Var2).height != -1) {
                            i15 = childAt2.getBaseline();
                            i16 = ((LinearLayout.LayoutParams) a1Var2).gravity;
                            if (i16 < 0) {
                                i16 = i34;
                            }
                            i17 = i16 & 112;
                            if (i17 == 16) {
                                if (i17 == 48) {
                                    i18 = i14 + ((LinearLayout.LayoutParams) a1Var2).topMargin;
                                    if (i15 != -1) {
                                        i18 = (iArr[1] - i15) + i18;
                                    }
                                } else if (i17 != 80) {
                                    i18 = i14;
                                } else {
                                    i18 = (paddingBottom - measuredHeight2) - ((LinearLayout.LayoutParams) a1Var2).bottomMargin;
                                    if (i15 != -1) {
                                        i19 = iArr2[2] - (childAt2.getMeasuredHeight() - i15);
                                    }
                                }
                                int i38 = (h(i36) ? i37 + this.f4218o : i37) + ((LinearLayout.LayoutParams) a1Var2).leftMargin;
                                childAt2.layout(i38, i18, i38 + measuredWidth2, i18 + measuredHeight2);
                                paddingLeft2 = measuredWidth2 + ((LinearLayout.LayoutParams) a1Var2).rightMargin + i38;
                                i35++;
                                i12 = i13;
                                paddingTop2 = i14;
                            } else {
                                i18 = ((paddingBottom2 - measuredHeight2) / 2) + i14 + ((LinearLayout.LayoutParams) a1Var2).topMargin;
                                i19 = ((LinearLayout.LayoutParams) a1Var2).bottomMargin;
                            }
                            i18 -= i19;
                            int i382 = (h(i36) ? i37 + this.f4218o : i37) + ((LinearLayout.LayoutParams) a1Var2).leftMargin;
                            childAt2.layout(i382, i18, i382 + measuredWidth2, i18 + measuredHeight2);
                            paddingLeft2 = measuredWidth2 + ((LinearLayout.LayoutParams) a1Var2).rightMargin + i382;
                            i35++;
                            i12 = i13;
                            paddingTop2 = i14;
                        }
                    } else {
                        i14 = paddingTop2;
                    }
                    i15 = -1;
                    i16 = ((LinearLayout.LayoutParams) a1Var2).gravity;
                    if (i16 < 0) {
                    }
                    i17 = i16 & 112;
                    if (i17 == 16) {
                    }
                    i18 -= i19;
                    int i3822 = (h(i36) ? i37 + this.f4218o : i37) + ((LinearLayout.LayoutParams) a1Var2).leftMargin;
                    childAt2.layout(i3822, i18, i3822 + measuredWidth2, i18 + measuredHeight2);
                    paddingLeft2 = measuredWidth2 + ((LinearLayout.LayoutParams) a1Var2).rightMargin + i3822;
                    i35++;
                    i12 = i13;
                    paddingTop2 = i14;
                }
            }
            i14 = paddingTop2;
            i35++;
            i12 = i13;
            paddingTop2 = i14;
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
    public void onMeasure(int i, int i8) {
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        boolean z3;
        int baseline;
        int i15;
        int i16;
        int[] iArr;
        int i17;
        int i18;
        boolean z7;
        boolean z8;
        a1 a1Var;
        int i19;
        int[] iArr2;
        int i20;
        View view;
        int i21;
        boolean z9;
        boolean z10;
        int max;
        int i22;
        int i23;
        int i24;
        int i25;
        int i26;
        int i27;
        int i28;
        int i29;
        boolean z11;
        int i30;
        int i31;
        int i32;
        View view2;
        boolean z12;
        boolean z13;
        b1 b1Var = this;
        int i33 = -2;
        int i34 = 0;
        int i35 = 1073741824;
        int i36 = 8;
        if (b1Var.f4211g == 1) {
            b1Var.i = 0;
            int virtualChildCount = b1Var.getVirtualChildCount();
            int mode = View.MeasureSpec.getMode(i);
            int mode2 = View.MeasureSpec.getMode(i8);
            int i37 = b1Var.f4209e;
            boolean z14 = b1Var.f4214k;
            int i38 = 0;
            int i39 = 0;
            int i40 = 0;
            boolean z15 = false;
            int i41 = 0;
            boolean z16 = false;
            boolean z17 = true;
            float f6 = 0.0f;
            int i42 = 0;
            while (i38 < virtualChildCount) {
                int i43 = mode;
                View childAt = b1Var.getChildAt(i38);
                if (childAt == null) {
                    b1Var.i = b1Var.i;
                } else if (childAt.getVisibility() != i36) {
                    if (b1Var.h(i38)) {
                        b1Var.i += b1Var.f4219p;
                    }
                    a1 a1Var2 = (a1) childAt.getLayoutParams();
                    float f8 = ((LinearLayout.LayoutParams) a1Var2).weight;
                    f6 += f8;
                    if (mode2 == i35 && ((LinearLayout.LayoutParams) a1Var2).height == 0 && f8 > 0.0f) {
                        int i44 = b1Var.i;
                        b1Var.i = Math.max(i44, ((LinearLayout.LayoutParams) a1Var2).topMargin + i44 + ((LinearLayout.LayoutParams) a1Var2).bottomMargin);
                        view2 = childAt;
                        i29 = mode2;
                        i30 = i37;
                        z11 = z14;
                        i31 = i38;
                        z15 = true;
                        i32 = i43;
                    } else {
                        if (((LinearLayout.LayoutParams) a1Var2).height != 0 || f8 <= 0.0f) {
                            i26 = Integer.MIN_VALUE;
                        } else {
                            ((LinearLayout.LayoutParams) a1Var2).height = i33;
                            i26 = 0;
                        }
                        if (f6 == 0.0f) {
                            i27 = i38;
                            i28 = b1Var.i;
                        } else {
                            i27 = i38;
                            i28 = 0;
                        }
                        i29 = mode2;
                        z11 = z14;
                        i30 = i37;
                        i31 = i27;
                        i32 = i43;
                        b1Var.measureChildWithMargins(childAt, i, 0, i8, i28);
                        if (i26 != Integer.MIN_VALUE) {
                            ((LinearLayout.LayoutParams) a1Var2).height = i26;
                        }
                        int measuredHeight = childAt.getMeasuredHeight();
                        int i45 = b1Var.i;
                        view2 = childAt;
                        b1Var.i = Math.max(i45, i45 + measuredHeight + ((LinearLayout.LayoutParams) a1Var2).topMargin + ((LinearLayout.LayoutParams) a1Var2).bottomMargin);
                        if (z11) {
                            i42 = Math.max(measuredHeight, i42);
                        }
                    }
                    if (i30 >= 0 && i30 == i31 + 1) {
                        b1Var.f4210f = b1Var.i;
                    }
                    if (i31 < i30 && ((LinearLayout.LayoutParams) a1Var2).weight > 0.0f) {
                        throw new RuntimeException("A child of LinearLayout with index less than mBaselineAlignedChildIndex has weight > 0, which won't work.  Either remove the weight, or don't set mBaselineAlignedChildIndex.");
                    }
                    if (i32 == 1073741824 || ((LinearLayout.LayoutParams) a1Var2).width != -1) {
                        z12 = false;
                    } else {
                        z12 = true;
                        z16 = true;
                    }
                    int i46 = ((LinearLayout.LayoutParams) a1Var2).leftMargin + ((LinearLayout.LayoutParams) a1Var2).rightMargin;
                    int measuredWidth = view2.getMeasuredWidth() + i46;
                    i34 = Math.max(i34, measuredWidth);
                    int measuredState = view2.getMeasuredState();
                    boolean z18 = z12;
                    int combineMeasuredStates = View.combineMeasuredStates(i41, measuredState);
                    if (z17) {
                        i41 = combineMeasuredStates;
                        if (((LinearLayout.LayoutParams) a1Var2).width == -1) {
                            z13 = true;
                            if (((LinearLayout.LayoutParams) a1Var2).weight <= 0.0f) {
                                if (!z18) {
                                    i46 = measuredWidth;
                                }
                                i40 = Math.max(i40, i46);
                            } else {
                                if (!z18) {
                                    i46 = measuredWidth;
                                }
                                i39 = Math.max(i39, i46);
                            }
                            z17 = z13;
                            i38 = i31 + 1;
                            i37 = i30;
                            mode = i32;
                            z14 = z11;
                            mode2 = i29;
                            i33 = -2;
                            i35 = 1073741824;
                            i36 = 8;
                        }
                    } else {
                        i41 = combineMeasuredStates;
                    }
                    z13 = false;
                    if (((LinearLayout.LayoutParams) a1Var2).weight <= 0.0f) {
                    }
                    z17 = z13;
                    i38 = i31 + 1;
                    i37 = i30;
                    mode = i32;
                    z14 = z11;
                    mode2 = i29;
                    i33 = -2;
                    i35 = 1073741824;
                    i36 = 8;
                }
                i29 = mode2;
                i30 = i37;
                z11 = z14;
                i31 = i38;
                i32 = i43;
                i38 = i31 + 1;
                i37 = i30;
                mode = i32;
                z14 = z11;
                mode2 = i29;
                i33 = -2;
                i35 = 1073741824;
                i36 = 8;
            }
            int i47 = mode;
            int i48 = mode2;
            boolean z19 = z14;
            int i49 = i41;
            int i50 = i8;
            if (b1Var.i > 0 && b1Var.h(virtualChildCount)) {
                b1Var.i += b1Var.f4219p;
            }
            if (z19 && (i48 == Integer.MIN_VALUE || i48 == 0)) {
                b1Var.i = 0;
                for (int i51 = 0; i51 < virtualChildCount; i51++) {
                    View childAt2 = b1Var.getChildAt(i51);
                    if (childAt2 == null) {
                        b1Var.i = b1Var.i;
                    } else if (childAt2.getVisibility() != 8) {
                        a1 a1Var3 = (a1) childAt2.getLayoutParams();
                        int i52 = b1Var.i;
                        b1Var.i = Math.max(i52, i52 + i42 + ((LinearLayout.LayoutParams) a1Var3).topMargin + ((LinearLayout.LayoutParams) a1Var3).bottomMargin);
                    }
                }
            }
            int paddingBottom = b1Var.getPaddingBottom() + b1Var.getPaddingTop() + b1Var.i;
            b1Var.i = paddingBottom;
            int resolveSizeAndState = View.resolveSizeAndState(Math.max(paddingBottom, b1Var.getSuggestedMinimumHeight()), i50, 0);
            int i53 = (resolveSizeAndState & 16777215) - b1Var.i;
            if (z15 || (i53 != 0 && f6 > 0.0f)) {
                float f9 = b1Var.f4213j;
                if (f9 > 0.0f) {
                    f6 = f9;
                }
                b1Var.i = 0;
                int i54 = i49;
                int i55 = 0;
                while (i55 < virtualChildCount) {
                    View childAt3 = b1Var.getChildAt(i55);
                    if (childAt3.getVisibility() == 8) {
                        i23 = i55;
                    } else {
                        a1 a1Var4 = (a1) childAt3.getLayoutParams();
                        float f10 = ((LinearLayout.LayoutParams) a1Var4).weight;
                        if (f10 > 0.0f) {
                            int i56 = (int) ((i53 * f10) / f6);
                            f6 -= f10;
                            i53 -= i56;
                            i23 = i55;
                            int childMeasureSpec = ViewGroup.getChildMeasureSpec(i, b1Var.getPaddingRight() + b1Var.getPaddingLeft() + ((LinearLayout.LayoutParams) a1Var4).leftMargin + ((LinearLayout.LayoutParams) a1Var4).rightMargin, ((LinearLayout.LayoutParams) a1Var4).width);
                            if (((LinearLayout.LayoutParams) a1Var4).height == 0) {
                                i25 = 1073741824;
                                if (i48 == 1073741824) {
                                    if (i56 <= 0) {
                                        i56 = 0;
                                    }
                                    childAt3.measure(childMeasureSpec, View.MeasureSpec.makeMeasureSpec(i56, 1073741824));
                                    i54 = View.combineMeasuredStates(i54, childAt3.getMeasuredState() & (-256));
                                }
                            } else {
                                i25 = 1073741824;
                            }
                            int measuredHeight2 = childAt3.getMeasuredHeight() + i56;
                            if (measuredHeight2 < 0) {
                                measuredHeight2 = 0;
                            }
                            childAt3.measure(childMeasureSpec, View.MeasureSpec.makeMeasureSpec(measuredHeight2, i25));
                            i54 = View.combineMeasuredStates(i54, childAt3.getMeasuredState() & (-256));
                        } else {
                            i23 = i55;
                        }
                        int i57 = ((LinearLayout.LayoutParams) a1Var4).leftMargin + ((LinearLayout.LayoutParams) a1Var4).rightMargin;
                        int measuredWidth2 = childAt3.getMeasuredWidth() + i57;
                        i34 = Math.max(i34, measuredWidth2);
                        if (i47 != 1073741824) {
                            i24 = -1;
                            if (((LinearLayout.LayoutParams) a1Var4).width == -1) {
                                measuredWidth2 = i57;
                            }
                        } else {
                            i24 = -1;
                        }
                        i39 = Math.max(i39, measuredWidth2);
                        boolean z20 = z17 && ((LinearLayout.LayoutParams) a1Var4).width == i24;
                        int i58 = b1Var.i;
                        b1Var.i = Math.max(i58, childAt3.getMeasuredHeight() + i58 + ((LinearLayout.LayoutParams) a1Var4).topMargin + ((LinearLayout.LayoutParams) a1Var4).bottomMargin);
                        z17 = z20;
                    }
                    i55 = i23 + 1;
                }
                b1Var.i = b1Var.getPaddingBottom() + b1Var.getPaddingTop() + b1Var.i;
                i49 = i54;
            } else {
                i39 = Math.max(i39, i40);
                if (z19 && i48 != 1073741824) {
                    for (int i59 = 0; i59 < virtualChildCount; i59++) {
                        View childAt4 = b1Var.getChildAt(i59);
                        if (childAt4 != null && childAt4.getVisibility() != 8 && ((LinearLayout.LayoutParams) ((a1) childAt4.getLayoutParams())).weight > 0.0f) {
                            childAt4.measure(View.MeasureSpec.makeMeasureSpec(childAt4.getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(i42, 1073741824));
                        }
                    }
                }
            }
            if (z17 || i47 == 1073741824) {
                i39 = i34;
            }
            b1Var.setMeasuredDimension(View.resolveSizeAndState(Math.max(b1Var.getPaddingRight() + b1Var.getPaddingLeft() + i39, b1Var.getSuggestedMinimumWidth()), i, i49), resolveSizeAndState);
            if (z16) {
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(b1Var.getMeasuredWidth(), 1073741824);
                int i60 = 0;
                while (i60 < virtualChildCount) {
                    View childAt5 = b1Var.getChildAt(i60);
                    if (childAt5.getVisibility() != 8) {
                        a1 a1Var5 = (a1) childAt5.getLayoutParams();
                        if (((LinearLayout.LayoutParams) a1Var5).width == -1) {
                            int i61 = ((LinearLayout.LayoutParams) a1Var5).height;
                            ((LinearLayout.LayoutParams) a1Var5).height = childAt5.getMeasuredHeight();
                            b1Var.measureChildWithMargins(childAt5, makeMeasureSpec, 0, i50, 0);
                            ((LinearLayout.LayoutParams) a1Var5).height = i61;
                        }
                    }
                    i60++;
                    i50 = i8;
                }
                return;
            }
            return;
        }
        int i62 = i;
        b1Var.i = 0;
        int virtualChildCount2 = b1Var.getVirtualChildCount();
        int mode3 = View.MeasureSpec.getMode(i62);
        int mode4 = View.MeasureSpec.getMode(i8);
        if (b1Var.f4215l == null || b1Var.f4216m == null) {
            b1Var.f4215l = new int[4];
            b1Var.f4216m = new int[4];
        }
        int[] iArr3 = b1Var.f4215l;
        int[] iArr4 = b1Var.f4216m;
        iArr3[3] = -1;
        char c8 = 2;
        iArr3[2] = -1;
        iArr3[1] = -1;
        iArr3[0] = -1;
        iArr4[3] = -1;
        iArr4[2] = -1;
        iArr4[1] = -1;
        iArr4[0] = -1;
        boolean z21 = b1Var.f4208d;
        boolean z22 = b1Var.f4214k;
        boolean z23 = mode3 == 1073741824;
        float f11 = 0.0f;
        boolean z24 = true;
        int i63 = 0;
        int i64 = 0;
        int i65 = 0;
        int i66 = 0;
        int i67 = 0;
        int i68 = 0;
        boolean z25 = false;
        boolean z26 = false;
        while (i63 < virtualChildCount2) {
            char c9 = c8;
            View childAt6 = b1Var.getChildAt(i63);
            if (childAt6 == null) {
                b1Var.i = b1Var.i;
                i18 = i63;
                i22 = i65;
                iArr2 = iArr3;
                iArr = iArr4;
                z7 = z21;
                z8 = z22;
            } else {
                int i69 = i64;
                if (childAt6.getVisibility() == 8) {
                    i62 = i;
                    i18 = i63;
                    i22 = i65;
                    iArr = iArr4;
                    z7 = z21;
                    z8 = z22;
                    i64 = i69;
                    iArr2 = iArr3;
                } else {
                    if (b1Var.h(i63)) {
                        b1Var.i += b1Var.f4218o;
                    }
                    a1 a1Var6 = (a1) childAt6.getLayoutParams();
                    float f12 = ((LinearLayout.LayoutParams) a1Var6).weight;
                    f11 += f12;
                    int i70 = i63;
                    if (mode3 == 1073741824 && ((LinearLayout.LayoutParams) a1Var6).width == 0 && f12 > 0.0f) {
                        if (z23) {
                            b1Var.i = ((LinearLayout.LayoutParams) a1Var6).leftMargin + ((LinearLayout.LayoutParams) a1Var6).rightMargin + b1Var.i;
                        } else {
                            int i71 = b1Var.i;
                            b1Var.i = Math.max(i71, ((LinearLayout.LayoutParams) a1Var6).leftMargin + i71 + ((LinearLayout.LayoutParams) a1Var6).rightMargin);
                        }
                        if (z21) {
                            int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 0);
                            childAt6.measure(makeMeasureSpec2, makeMeasureSpec2);
                            view = childAt6;
                            z7 = z21;
                            z8 = z22;
                            i19 = i69;
                            i18 = i70;
                            a1Var = a1Var6;
                            iArr2 = iArr3;
                            iArr = iArr4;
                            i62 = i;
                            i20 = i65;
                            i17 = i66;
                        } else {
                            view = childAt6;
                            z7 = z21;
                            z8 = z22;
                            z26 = true;
                            i19 = i69;
                            i18 = i70;
                            i21 = 1073741824;
                            a1Var = a1Var6;
                            iArr2 = iArr3;
                            iArr = iArr4;
                            i62 = i;
                            i20 = i65;
                            i17 = i66;
                            if (mode4 == i21 && ((LinearLayout.LayoutParams) a1Var).height == -1) {
                                z9 = true;
                                z25 = true;
                            } else {
                                z9 = false;
                            }
                            int i72 = ((LinearLayout.LayoutParams) a1Var).topMargin + ((LinearLayout.LayoutParams) a1Var).bottomMargin;
                            int measuredHeight3 = view.getMeasuredHeight() + i72;
                            i68 = View.combineMeasuredStates(i68, view.getMeasuredState());
                            if (z7) {
                                z10 = z9;
                            } else {
                                int baseline2 = view.getBaseline();
                                z10 = z9;
                                if (baseline2 != -1) {
                                    int i73 = ((LinearLayout.LayoutParams) a1Var).gravity;
                                    if (i73 < 0) {
                                        i73 = b1Var.f4212h;
                                    }
                                    int i74 = (((i73 & 112) >> 4) & (-2)) >> 1;
                                    iArr2[i74] = Math.max(iArr2[i74], baseline2);
                                    iArr[i74] = Math.max(iArr[i74], measuredHeight3 - baseline2);
                                }
                            }
                            int max2 = Math.max(i19, measuredHeight3);
                            boolean z27 = !z24 && ((LinearLayout.LayoutParams) a1Var).height == -1;
                            if (((LinearLayout.LayoutParams) a1Var).weight <= 0.0f) {
                                if (!z10) {
                                    i72 = measuredHeight3;
                                }
                                i66 = Math.max(i17, i72);
                                max = i20;
                            } else {
                                if (!z10) {
                                    i72 = measuredHeight3;
                                }
                                max = Math.max(i20, i72);
                                i66 = i17;
                            }
                            int i75 = max;
                            i64 = max2;
                            i22 = i75;
                            z24 = z27;
                        }
                    } else {
                        if (((LinearLayout.LayoutParams) a1Var6).width != 0 || f12 <= 0.0f) {
                            i16 = Integer.MIN_VALUE;
                        } else {
                            ((LinearLayout.LayoutParams) a1Var6).width = -2;
                            i16 = 0;
                        }
                        iArr = iArr4;
                        i17 = i66;
                        i18 = i70;
                        z7 = z21;
                        z8 = z22;
                        int i76 = i16;
                        a1Var = a1Var6;
                        i19 = i69;
                        i62 = i;
                        iArr2 = iArr3;
                        i20 = i65;
                        b1Var.measureChildWithMargins(childAt6, i62, f11 == 0.0f ? b1Var.i : 0, i8, 0);
                        if (i76 != Integer.MIN_VALUE) {
                            ((LinearLayout.LayoutParams) a1Var).width = i76;
                        }
                        int measuredWidth3 = childAt6.getMeasuredWidth();
                        if (z23) {
                            view = childAt6;
                            b1Var.i = ((LinearLayout.LayoutParams) a1Var).leftMargin + measuredWidth3 + ((LinearLayout.LayoutParams) a1Var).rightMargin + b1Var.i;
                        } else {
                            view = childAt6;
                            int i77 = b1Var.i;
                            b1Var.i = Math.max(i77, i77 + measuredWidth3 + ((LinearLayout.LayoutParams) a1Var).leftMargin + ((LinearLayout.LayoutParams) a1Var).rightMargin);
                        }
                        if (z8) {
                            i67 = Math.max(measuredWidth3, i67);
                        }
                    }
                    i21 = 1073741824;
                    if (mode4 == i21) {
                    }
                    z9 = false;
                    int i722 = ((LinearLayout.LayoutParams) a1Var).topMargin + ((LinearLayout.LayoutParams) a1Var).bottomMargin;
                    int measuredHeight32 = view.getMeasuredHeight() + i722;
                    i68 = View.combineMeasuredStates(i68, view.getMeasuredState());
                    if (z7) {
                    }
                    int max22 = Math.max(i19, measuredHeight32);
                    if (z24) {
                    }
                    if (((LinearLayout.LayoutParams) a1Var).weight <= 0.0f) {
                    }
                    int i752 = max;
                    i64 = max22;
                    i22 = i752;
                    z24 = z27;
                }
            }
            i65 = i22;
            i63 = i18 + 1;
            c8 = c9;
            iArr3 = iArr2;
            iArr4 = iArr;
            z21 = z7;
            z22 = z8;
        }
        int[] iArr5 = iArr3;
        int[] iArr6 = iArr4;
        char c10 = c8;
        boolean z28 = z21;
        boolean z29 = z22;
        int i78 = i64;
        int i79 = i65;
        int i80 = i66;
        if (b1Var.i > 0 && b1Var.h(virtualChildCount2)) {
            b1Var.i += b1Var.f4218o;
        }
        int i81 = iArr5[1];
        int max3 = (i81 == -1 && iArr5[0] == -1 && iArr5[c10] == -1 && iArr5[3] == -1) ? i78 : Math.max(i78, Math.max(iArr6[3], Math.max(iArr6[0], Math.max(iArr6[1], iArr6[c10]))) + Math.max(iArr5[3], Math.max(iArr5[0], Math.max(i81, iArr5[c10]))));
        if (z29 && (mode3 == Integer.MIN_VALUE || mode3 == 0)) {
            b1Var.i = 0;
            for (int i82 = 0; i82 < virtualChildCount2; i82++) {
                View childAt7 = b1Var.getChildAt(i82);
                if (childAt7 == null) {
                    b1Var.i = b1Var.i;
                } else if (childAt7.getVisibility() != 8) {
                    a1 a1Var7 = (a1) childAt7.getLayoutParams();
                    if (z23) {
                        b1Var.i = ((LinearLayout.LayoutParams) a1Var7).leftMargin + i67 + ((LinearLayout.LayoutParams) a1Var7).rightMargin + b1Var.i;
                    } else {
                        int i83 = b1Var.i;
                        b1Var.i = Math.max(i83, i83 + i67 + ((LinearLayout.LayoutParams) a1Var7).leftMargin + ((LinearLayout.LayoutParams) a1Var7).rightMargin);
                    }
                }
            }
        }
        int paddingRight = b1Var.getPaddingRight() + b1Var.getPaddingLeft() + b1Var.i;
        b1Var.i = paddingRight;
        int resolveSizeAndState2 = View.resolveSizeAndState(Math.max(paddingRight, b1Var.getSuggestedMinimumWidth()), i62, 0);
        int i84 = (resolveSizeAndState2 & 16777215) - b1Var.i;
        if (z26 || (i84 != 0 && f11 > 0.0f)) {
            float f13 = b1Var.f4213j;
            if (f13 > 0.0f) {
                f11 = f13;
            }
            iArr5[3] = -1;
            iArr5[c10] = -1;
            iArr5[1] = -1;
            iArr5[0] = -1;
            iArr6[3] = -1;
            iArr6[c10] = -1;
            iArr6[1] = -1;
            iArr6[0] = -1;
            b1Var.i = 0;
            max3 = -1;
            int i85 = 0;
            while (i85 < virtualChildCount2) {
                View childAt8 = b1Var.getChildAt(i85);
                if (childAt8 == null || childAt8.getVisibility() == 8) {
                    i13 = resolveSizeAndState2;
                } else {
                    a1 a1Var8 = (a1) childAt8.getLayoutParams();
                    float f14 = ((LinearLayout.LayoutParams) a1Var8).weight;
                    if (f14 > 0.0f) {
                        int i86 = (int) ((i84 * f14) / f11);
                        f11 -= f14;
                        i84 -= i86;
                        i13 = resolveSizeAndState2;
                        int childMeasureSpec2 = ViewGroup.getChildMeasureSpec(i8, b1Var.getPaddingBottom() + b1Var.getPaddingTop() + ((LinearLayout.LayoutParams) a1Var8).topMargin + ((LinearLayout.LayoutParams) a1Var8).bottomMargin, ((LinearLayout.LayoutParams) a1Var8).height);
                        if (((LinearLayout.LayoutParams) a1Var8).width == 0) {
                            i15 = 1073741824;
                            if (mode3 == 1073741824) {
                                if (i86 <= 0) {
                                    i86 = 0;
                                }
                                childAt8.measure(View.MeasureSpec.makeMeasureSpec(i86, 1073741824), childMeasureSpec2);
                                i68 = View.combineMeasuredStates(i68, childAt8.getMeasuredState() & (-16777216));
                            }
                        } else {
                            i15 = 1073741824;
                        }
                        int measuredWidth4 = childAt8.getMeasuredWidth() + i86;
                        if (measuredWidth4 < 0) {
                            measuredWidth4 = 0;
                        }
                        childAt8.measure(View.MeasureSpec.makeMeasureSpec(measuredWidth4, i15), childMeasureSpec2);
                        i68 = View.combineMeasuredStates(i68, childAt8.getMeasuredState() & (-16777216));
                    } else {
                        i13 = resolveSizeAndState2;
                    }
                    if (z23) {
                        b1Var.i = childAt8.getMeasuredWidth() + ((LinearLayout.LayoutParams) a1Var8).leftMargin + ((LinearLayout.LayoutParams) a1Var8).rightMargin + b1Var.i;
                    } else {
                        int i87 = b1Var.i;
                        b1Var.i = Math.max(i87, childAt8.getMeasuredWidth() + i87 + ((LinearLayout.LayoutParams) a1Var8).leftMargin + ((LinearLayout.LayoutParams) a1Var8).rightMargin);
                    }
                    boolean z30 = mode4 != 1073741824 && ((LinearLayout.LayoutParams) a1Var8).height == -1;
                    int i88 = ((LinearLayout.LayoutParams) a1Var8).topMargin + ((LinearLayout.LayoutParams) a1Var8).bottomMargin;
                    int measuredHeight4 = childAt8.getMeasuredHeight() + i88;
                    max3 = Math.max(max3, measuredHeight4);
                    if (!z30) {
                        i88 = measuredHeight4;
                    }
                    int max4 = Math.max(i79, i88);
                    if (z24) {
                        i14 = -1;
                        if (((LinearLayout.LayoutParams) a1Var8).height == -1) {
                            z3 = true;
                            if (!z28 && (baseline = childAt8.getBaseline()) != i14) {
                                int i89 = ((LinearLayout.LayoutParams) a1Var8).gravity;
                                if (i89 < 0) {
                                    i89 = b1Var.f4212h;
                                }
                                int i90 = (((i89 & 112) >> 4) & (-2)) >> 1;
                                iArr5[i90] = Math.max(iArr5[i90], baseline);
                                iArr6[i90] = Math.max(iArr6[i90], measuredHeight4 - baseline);
                            }
                            z24 = z3;
                            i79 = max4;
                        }
                    } else {
                        i14 = -1;
                    }
                    z3 = false;
                    if (!z28) {
                    }
                    z24 = z3;
                    i79 = max4;
                }
                i85++;
                resolveSizeAndState2 = i13;
            }
            i9 = resolveSizeAndState2;
            i10 = -16777216;
            b1Var.i = b1Var.getPaddingRight() + b1Var.getPaddingLeft() + b1Var.i;
            int i91 = iArr5[1];
            if (i91 == -1 && iArr5[0] == -1 && iArr5[c10] == -1 && iArr5[3] == -1) {
                i11 = 0;
            } else {
                i11 = 0;
                max3 = Math.max(max3, Math.max(iArr6[3], Math.max(iArr6[0], Math.max(iArr6[1], iArr6[c10]))) + Math.max(iArr5[3], Math.max(iArr5[0], Math.max(i91, iArr5[c10]))));
            }
            i12 = i79;
        } else {
            i12 = Math.max(i79, i80);
            if (z29 && mode3 != 1073741824) {
                for (int i92 = 0; i92 < virtualChildCount2; i92++) {
                    View childAt9 = b1Var.getChildAt(i92);
                    if (childAt9 != null && childAt9.getVisibility() != 8 && ((LinearLayout.LayoutParams) ((a1) childAt9.getLayoutParams())).weight > 0.0f) {
                        childAt9.measure(View.MeasureSpec.makeMeasureSpec(i67, 1073741824), View.MeasureSpec.makeMeasureSpec(childAt9.getMeasuredHeight(), 1073741824));
                    }
                }
            }
            i9 = resolveSizeAndState2;
            i10 = -16777216;
            i11 = 0;
        }
        if (!z24 && mode4 != 1073741824) {
            max3 = i12;
        }
        b1Var.setMeasuredDimension(i9 | (i68 & i10), View.resolveSizeAndState(Math.max(b1Var.getPaddingBottom() + b1Var.getPaddingTop() + max3, b1Var.getSuggestedMinimumHeight()), i8, i68 << 16));
        if (z25) {
            int makeMeasureSpec3 = View.MeasureSpec.makeMeasureSpec(b1Var.getMeasuredHeight(), 1073741824);
            int i93 = i11;
            while (i93 < virtualChildCount2) {
                View childAt10 = b1Var.getChildAt(i93);
                if (childAt10.getVisibility() != 8) {
                    a1 a1Var9 = (a1) childAt10.getLayoutParams();
                    if (((LinearLayout.LayoutParams) a1Var9).height == -1) {
                        int i94 = ((LinearLayout.LayoutParams) a1Var9).width;
                        ((LinearLayout.LayoutParams) a1Var9).width = childAt10.getMeasuredWidth();
                        b1Var.measureChildWithMargins(childAt10, i62, 0, makeMeasureSpec3, 0);
                        ((LinearLayout.LayoutParams) a1Var9).width = i94;
                    }
                }
                i93++;
                b1Var = this;
                i62 = i;
            }
        }
    }

    public void setBaselineAligned(boolean z3) {
        this.f4208d = z3;
    }

    public void setBaselineAlignedChildIndex(int i) {
        if (i >= 0 && i < getChildCount()) {
            this.f4209e = i;
            return;
        }
        throw new IllegalArgumentException("base aligned child index out of range (0, " + getChildCount() + ")");
    }

    public void setDividerDrawable(Drawable drawable) {
        if (drawable == this.f4217n) {
            return;
        }
        this.f4217n = drawable;
        if (drawable != null) {
            this.f4218o = drawable.getIntrinsicWidth();
            this.f4219p = drawable.getIntrinsicHeight();
        } else {
            this.f4218o = 0;
            this.f4219p = 0;
        }
        setWillNotDraw(drawable == null);
        requestLayout();
    }

    public void setDividerPadding(int i) {
        this.f4221r = i;
    }

    public void setGravity(int i) {
        if (this.f4212h != i) {
            if ((8388615 & i) == 0) {
                i |= 8388611;
            }
            if ((i & 112) == 0) {
                i |= 48;
            }
            this.f4212h = i;
            requestLayout();
        }
    }

    public void setHorizontalGravity(int i) {
        int i8 = i & 8388615;
        int i9 = this.f4212h;
        if ((8388615 & i9) != i8) {
            this.f4212h = i8 | ((-8388616) & i9);
            requestLayout();
        }
    }

    public void setMeasureWithLargestChildEnabled(boolean z3) {
        this.f4214k = z3;
    }

    public void setOrientation(int i) {
        if (this.f4211g != i) {
            this.f4211g = i;
            requestLayout();
        }
    }

    public void setShowDividers(int i) {
        if (i != this.f4220q) {
            requestLayout();
        }
        this.f4220q = i;
    }

    public void setVerticalGravity(int i) {
        int i8 = i & 112;
        int i9 = this.f4212h;
        if ((i9 & 112) != i8) {
            this.f4212h = i8 | (i9 & (-113));
            requestLayout();
        }
    }

    public void setWeightSum(float f6) {
        this.f4213j = Math.max(0.0f, f6);
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }
}
