package defpackage;

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

/* compiled from: r8-map-id-555d5e190d9a27a9a8404de93c25a29c9fbe11559b3463c92c68ce527c1de619 */
/* loaded from: classes.dex */
public abstract class rx extends ViewGroup {
    public boolean f;
    public int g;
    public int h;
    public int i;
    public int j;
    public int k;
    public float l;
    public boolean m;
    public int[] n;
    public int[] o;
    public Drawable p;
    public int q;
    public int r;
    public int s;
    public int t;

    public rx(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f = true;
        this.g = -1;
        this.h = 0;
        this.j = 8388659;
        int[] iArr = d70.n;
        s6 t = s6.t(i, 0, context, attributeSet, iArr);
        hm0.l(this, context, iArr, attributeSet, (TypedArray) t.b, i);
        TypedArray typedArray = (TypedArray) t.b;
        int i2 = typedArray.getInt(1, -1);
        if (i2 >= 0) {
            setOrientation(i2);
        }
        int i3 = typedArray.getInt(0, -1);
        if (i3 >= 0) {
            setGravity(i3);
        }
        boolean z = typedArray.getBoolean(2, true);
        if (!z) {
            setBaselineAligned(z);
        }
        this.l = typedArray.getFloat(4, -1.0f);
        this.g = typedArray.getInt(3, -1);
        this.m = typedArray.getBoolean(7, false);
        setDividerDrawable(t.j(5));
        this.s = typedArray.getInt(8, 0);
        this.t = typedArray.getDimensionPixelSize(6, 0);
        t.v();
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof qx;
    }

    public final void d(Canvas canvas, int i) {
        this.p.setBounds(getPaddingLeft() + this.t, i, (getWidth() - getPaddingRight()) - this.t, this.r + i);
        this.p.draw(canvas);
    }

    public final void e(Canvas canvas, int i) {
        this.p.setBounds(i, getPaddingTop() + this.t, this.q + i, (getHeight() - getPaddingBottom()) - this.t);
        this.p.draw(canvas);
    }

    @Override // android.view.ViewGroup
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public qx generateDefaultLayoutParams() {
        int i = this.i;
        if (i == 0) {
            return new qx(-2, -2);
        }
        if (i == 1) {
            return new qx(-1, -2);
        }
        return null;
    }

    @Override // android.view.ViewGroup
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public qx generateLayoutParams(AttributeSet attributeSet) {
        return new qx(getContext(), attributeSet);
    }

    @Override // android.view.View
    public int getBaseline() {
        int i;
        if (this.g < 0) {
            return super.getBaseline();
        }
        int childCount = getChildCount();
        int i2 = this.g;
        if (childCount <= i2) {
            throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout set to an index that is out of bounds.");
        }
        View childAt = getChildAt(i2);
        int baseline = childAt.getBaseline();
        if (baseline == -1) {
            if (this.g == 0) {
                return -1;
            }
            throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout points to a View that doesn't know how to get its baseline.");
        }
        int i3 = this.h;
        if (this.i == 1 && (i = this.j & 112) != 48) {
            if (i == 16) {
                i3 += ((((getBottom() - getTop()) - getPaddingTop()) - getPaddingBottom()) - this.k) / 2;
            } else if (i == 80) {
                i3 = ((getBottom() - getTop()) - getPaddingBottom()) - this.k;
            }
        }
        return i3 + ((LinearLayout.LayoutParams) ((qx) childAt.getLayoutParams())).topMargin + baseline;
    }

    public int getBaselineAlignedChildIndex() {
        return this.g;
    }

    public Drawable getDividerDrawable() {
        return this.p;
    }

    public int getDividerPadding() {
        return this.t;
    }

    public int getDividerWidth() {
        return this.q;
    }

    public int getGravity() {
        return this.j;
    }

    public int getOrientation() {
        return this.i;
    }

    public int getShowDividers() {
        return this.s;
    }

    public int getVirtualChildCount() {
        return getChildCount();
    }

    public float getWeightSum() {
        return this.l;
    }

    @Override // android.view.ViewGroup
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public qx generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof qx ? new qx((qx) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new qx((ViewGroup.MarginLayoutParams) layoutParams) : new qx(layoutParams);
    }

    public final boolean i(int i) {
        if (i == 0) {
            return (this.s & 1) != 0;
        }
        int childCount = getChildCount();
        int i2 = this.s;
        if (i == childCount) {
            return (i2 & 4) != 0;
        }
        if ((i2 & 2) != 0) {
            for (int i3 = i - 1; i3 >= 0; i3--) {
                if (getChildAt(i3).getVisibility() != 8) {
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
        if (this.p == null) {
            return;
        }
        int i2 = 0;
        if (this.i == 1) {
            int virtualChildCount = getVirtualChildCount();
            while (i2 < virtualChildCount) {
                View childAt = getChildAt(i2);
                if (childAt != null && childAt.getVisibility() != 8 && i(i2)) {
                    d(canvas, (childAt.getTop() - ((LinearLayout.LayoutParams) ((qx) childAt.getLayoutParams())).topMargin) - this.r);
                }
                i2++;
            }
            if (i(virtualChildCount)) {
                View childAt2 = getChildAt(virtualChildCount - 1);
                d(canvas, childAt2 == null ? (getHeight() - getPaddingBottom()) - this.r : childAt2.getBottom() + ((LinearLayout.LayoutParams) ((qx) childAt2.getLayoutParams())).bottomMargin);
                return;
            }
            return;
        }
        int virtualChildCount2 = getVirtualChildCount();
        boolean z = dn0.a;
        boolean z2 = getLayoutDirection() == 1;
        while (i2 < virtualChildCount2) {
            View childAt3 = getChildAt(i2);
            if (childAt3 != null && childAt3.getVisibility() != 8 && i(i2)) {
                qx qxVar = (qx) childAt3.getLayoutParams();
                e(canvas, z2 ? childAt3.getRight() + ((LinearLayout.LayoutParams) qxVar).rightMargin : (childAt3.getLeft() - ((LinearLayout.LayoutParams) qxVar).leftMargin) - this.q);
            }
            i2++;
        }
        if (i(virtualChildCount2)) {
            View childAt4 = getChildAt(virtualChildCount2 - 1);
            if (childAt4 != null) {
                qx qxVar2 = (qx) childAt4.getLayoutParams();
                if (z2) {
                    left = childAt4.getLeft() - ((LinearLayout.LayoutParams) qxVar2).leftMargin;
                    i = this.q;
                    right = left - i;
                } else {
                    right = childAt4.getRight() + ((LinearLayout.LayoutParams) qxVar2).rightMargin;
                }
            } else if (z2) {
                right = getPaddingLeft();
            } else {
                left = getWidth() - getPaddingRight();
                i = this.q;
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
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        char c;
        int i14;
        int i15;
        int i16;
        int i17 = 8;
        char c2 = 2;
        if (this.i == 1) {
            int paddingLeft = getPaddingLeft();
            int i18 = i3 - i;
            int paddingRight = i18 - getPaddingRight();
            int paddingRight2 = (i18 - paddingLeft) - getPaddingRight();
            int virtualChildCount = getVirtualChildCount();
            int i19 = this.j;
            int i20 = i19 & 112;
            int i21 = 8388615 & i19;
            int paddingTop = i20 != 16 ? i20 != 80 ? getPaddingTop() : ((getPaddingTop() + i4) - i2) - this.k : getPaddingTop() + (((i4 - i2) - this.k) / 2);
            int i22 = 0;
            while (i22 < virtualChildCount) {
                View childAt = getChildAt(i22);
                if (childAt == null || childAt.getVisibility() == i17) {
                    c = c2;
                } else {
                    int measuredWidth = childAt.getMeasuredWidth();
                    int measuredHeight = childAt.getMeasuredHeight();
                    qx qxVar = (qx) childAt.getLayoutParams();
                    c = c2;
                    int i23 = ((LinearLayout.LayoutParams) qxVar).gravity;
                    if (i23 < 0) {
                        i23 = i21;
                    }
                    int absoluteGravity = Gravity.getAbsoluteGravity(i23, getLayoutDirection()) & 7;
                    if (absoluteGravity == 1) {
                        i14 = ((paddingRight2 - measuredWidth) / 2) + paddingLeft + ((LinearLayout.LayoutParams) qxVar).leftMargin;
                        i15 = ((LinearLayout.LayoutParams) qxVar).rightMargin;
                    } else if (absoluteGravity != 5) {
                        i16 = ((LinearLayout.LayoutParams) qxVar).leftMargin + paddingLeft;
                        if (i(i22)) {
                            paddingTop += this.r;
                        }
                        int i24 = paddingTop + ((LinearLayout.LayoutParams) qxVar).topMargin;
                        childAt.layout(i16, i24, measuredWidth + i16, i24 + measuredHeight);
                        paddingTop = measuredHeight + ((LinearLayout.LayoutParams) qxVar).bottomMargin + i24;
                    } else {
                        i14 = paddingRight - measuredWidth;
                        i15 = ((LinearLayout.LayoutParams) qxVar).rightMargin;
                    }
                    i16 = i14 - i15;
                    if (i(i22)) {
                    }
                    int i242 = paddingTop + ((LinearLayout.LayoutParams) qxVar).topMargin;
                    childAt.layout(i16, i242, measuredWidth + i16, i242 + measuredHeight);
                    paddingTop = measuredHeight + ((LinearLayout.LayoutParams) qxVar).bottomMargin + i242;
                }
                i22++;
                c2 = c;
                i17 = 8;
            }
            return;
        }
        boolean z2 = dn0.a;
        boolean z3 = getLayoutDirection() == 1;
        int paddingTop2 = getPaddingTop();
        int i25 = i4 - i2;
        int paddingBottom = i25 - getPaddingBottom();
        int paddingBottom2 = (i25 - paddingTop2) - getPaddingBottom();
        int virtualChildCount2 = getVirtualChildCount();
        int i26 = this.j;
        int i27 = 8388615 & i26;
        int i28 = i26 & 112;
        boolean z4 = this.f;
        int[] iArr = this.n;
        int[] iArr2 = this.o;
        int absoluteGravity2 = Gravity.getAbsoluteGravity(i27, getLayoutDirection());
        int paddingLeft2 = absoluteGravity2 != 1 ? absoluteGravity2 != 5 ? getPaddingLeft() : ((getPaddingLeft() + i3) - i) - this.k : getPaddingLeft() + (((i3 - i) - this.k) / 2);
        if (z3) {
            i6 = virtualChildCount2 - 1;
            i5 = -1;
        } else {
            i5 = 1;
            i6 = 0;
        }
        int i29 = 0;
        while (i29 < virtualChildCount2) {
            int i30 = (i5 * i29) + i6;
            View childAt2 = getChildAt(i30);
            if (childAt2 == null) {
                i7 = i6;
            } else {
                i7 = i6;
                if (childAt2.getVisibility() != 8) {
                    int measuredWidth2 = childAt2.getMeasuredWidth();
                    int measuredHeight2 = childAt2.getMeasuredHeight();
                    qx qxVar2 = (qx) childAt2.getLayoutParams();
                    int i31 = paddingLeft2;
                    if (z4) {
                        i8 = paddingTop2;
                        if (((LinearLayout.LayoutParams) qxVar2).height != -1) {
                            i9 = childAt2.getBaseline();
                            i10 = ((LinearLayout.LayoutParams) qxVar2).gravity;
                            if (i10 < 0) {
                                i10 = i28;
                            }
                            i11 = i10 & 112;
                            if (i11 == 16) {
                                if (i11 == 48) {
                                    i12 = i8 + ((LinearLayout.LayoutParams) qxVar2).topMargin;
                                    if (i9 != -1) {
                                        i12 = (iArr[1] - i9) + i12;
                                    }
                                } else if (i11 != 80) {
                                    i12 = i8;
                                } else {
                                    i12 = (paddingBottom - measuredHeight2) - ((LinearLayout.LayoutParams) qxVar2).bottomMargin;
                                    if (i9 != -1) {
                                        i13 = iArr2[2] - (childAt2.getMeasuredHeight() - i9);
                                    }
                                }
                                int i32 = (i(i30) ? i31 + this.q : i31) + ((LinearLayout.LayoutParams) qxVar2).leftMargin;
                                childAt2.layout(i32, i12, i32 + measuredWidth2, i12 + measuredHeight2);
                                paddingLeft2 = measuredWidth2 + ((LinearLayout.LayoutParams) qxVar2).rightMargin + i32;
                                i29++;
                                i6 = i7;
                                paddingTop2 = i8;
                            } else {
                                i12 = ((paddingBottom2 - measuredHeight2) / 2) + i8 + ((LinearLayout.LayoutParams) qxVar2).topMargin;
                                i13 = ((LinearLayout.LayoutParams) qxVar2).bottomMargin;
                            }
                            i12 -= i13;
                            int i322 = (i(i30) ? i31 + this.q : i31) + ((LinearLayout.LayoutParams) qxVar2).leftMargin;
                            childAt2.layout(i322, i12, i322 + measuredWidth2, i12 + measuredHeight2);
                            paddingLeft2 = measuredWidth2 + ((LinearLayout.LayoutParams) qxVar2).rightMargin + i322;
                            i29++;
                            i6 = i7;
                            paddingTop2 = i8;
                        }
                    } else {
                        i8 = paddingTop2;
                    }
                    i9 = -1;
                    i10 = ((LinearLayout.LayoutParams) qxVar2).gravity;
                    if (i10 < 0) {
                    }
                    i11 = i10 & 112;
                    if (i11 == 16) {
                    }
                    i12 -= i13;
                    int i3222 = (i(i30) ? i31 + this.q : i31) + ((LinearLayout.LayoutParams) qxVar2).leftMargin;
                    childAt2.layout(i3222, i12, i3222 + measuredWidth2, i12 + measuredHeight2);
                    paddingLeft2 = measuredWidth2 + ((LinearLayout.LayoutParams) qxVar2).rightMargin + i3222;
                    i29++;
                    i6 = i7;
                    paddingTop2 = i8;
                }
            }
            i8 = paddingTop2;
            i29++;
            i6 = i7;
            paddingTop2 = i8;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:223:0x04f3  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x0538  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x0542  */
    /* JADX WARN: Removed duplicated region for block: B:245:0x0521  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0148  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onMeasure(int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        boolean z;
        int baseline;
        int i9;
        int i10;
        int[] iArr;
        int i11;
        int i12;
        boolean z2;
        boolean z3;
        qx qxVar;
        int i13;
        int[] iArr2;
        int i14;
        View view;
        int i15;
        boolean z4;
        boolean z5;
        int max;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        boolean z6;
        int i24;
        int i25;
        int i26;
        View view2;
        boolean z7;
        boolean z8;
        rx rxVar = this;
        int i27 = -2;
        int i28 = 0;
        int i29 = 1073741824;
        int i30 = 8;
        if (rxVar.i == 1) {
            rxVar.k = 0;
            int virtualChildCount = rxVar.getVirtualChildCount();
            int mode = View.MeasureSpec.getMode(i);
            int mode2 = View.MeasureSpec.getMode(i2);
            int i31 = rxVar.g;
            boolean z9 = rxVar.m;
            int i32 = 0;
            int i33 = 0;
            int i34 = 0;
            boolean z10 = false;
            int i35 = 0;
            boolean z11 = false;
            boolean z12 = true;
            float f = 0.0f;
            int i36 = 0;
            while (i32 < virtualChildCount) {
                int i37 = mode;
                View childAt = rxVar.getChildAt(i32);
                if (childAt == null) {
                    rxVar.k = rxVar.k;
                } else if (childAt.getVisibility() != i30) {
                    if (rxVar.i(i32)) {
                        rxVar.k += rxVar.r;
                    }
                    qx qxVar2 = (qx) childAt.getLayoutParams();
                    float f2 = ((LinearLayout.LayoutParams) qxVar2).weight;
                    f += f2;
                    if (mode2 == i29 && ((LinearLayout.LayoutParams) qxVar2).height == 0 && f2 > 0.0f) {
                        int i38 = rxVar.k;
                        rxVar.k = Math.max(i38, ((LinearLayout.LayoutParams) qxVar2).topMargin + i38 + ((LinearLayout.LayoutParams) qxVar2).bottomMargin);
                        view2 = childAt;
                        i23 = mode2;
                        i24 = i31;
                        z6 = z9;
                        i25 = i32;
                        z10 = true;
                        i26 = i37;
                    } else {
                        if (((LinearLayout.LayoutParams) qxVar2).height != 0 || f2 <= 0.0f) {
                            i20 = Integer.MIN_VALUE;
                        } else {
                            ((LinearLayout.LayoutParams) qxVar2).height = i27;
                            i20 = 0;
                        }
                        if (f == 0.0f) {
                            i21 = i32;
                            i22 = rxVar.k;
                        } else {
                            i21 = i32;
                            i22 = 0;
                        }
                        i23 = mode2;
                        z6 = z9;
                        i24 = i31;
                        i25 = i21;
                        i26 = i37;
                        rxVar.measureChildWithMargins(childAt, i, 0, i2, i22);
                        if (i20 != Integer.MIN_VALUE) {
                            ((LinearLayout.LayoutParams) qxVar2).height = i20;
                        }
                        int measuredHeight = childAt.getMeasuredHeight();
                        int i39 = rxVar.k;
                        view2 = childAt;
                        rxVar.k = Math.max(i39, i39 + measuredHeight + ((LinearLayout.LayoutParams) qxVar2).topMargin + ((LinearLayout.LayoutParams) qxVar2).bottomMargin);
                        if (z6) {
                            i36 = Math.max(measuredHeight, i36);
                        }
                    }
                    if (i24 >= 0 && i24 == i25 + 1) {
                        rxVar.h = rxVar.k;
                    }
                    if (i25 < i24 && ((LinearLayout.LayoutParams) qxVar2).weight > 0.0f) {
                        throw new RuntimeException("A child of LinearLayout with index less than mBaselineAlignedChildIndex has weight > 0, which won't work.  Either remove the weight, or don't set mBaselineAlignedChildIndex.");
                    }
                    if (i26 == 1073741824 || ((LinearLayout.LayoutParams) qxVar2).width != -1) {
                        z7 = false;
                    } else {
                        z7 = true;
                        z11 = true;
                    }
                    int i40 = ((LinearLayout.LayoutParams) qxVar2).leftMargin + ((LinearLayout.LayoutParams) qxVar2).rightMargin;
                    int measuredWidth = view2.getMeasuredWidth() + i40;
                    i28 = Math.max(i28, measuredWidth);
                    int measuredState = view2.getMeasuredState();
                    boolean z13 = z7;
                    int combineMeasuredStates = View.combineMeasuredStates(i35, measuredState);
                    if (z12) {
                        i35 = combineMeasuredStates;
                        if (((LinearLayout.LayoutParams) qxVar2).width == -1) {
                            z8 = true;
                            if (((LinearLayout.LayoutParams) qxVar2).weight <= 0.0f) {
                                if (!z13) {
                                    i40 = measuredWidth;
                                }
                                i34 = Math.max(i34, i40);
                            } else {
                                if (!z13) {
                                    i40 = measuredWidth;
                                }
                                i33 = Math.max(i33, i40);
                            }
                            z12 = z8;
                            i32 = i25 + 1;
                            i31 = i24;
                            mode = i26;
                            z9 = z6;
                            mode2 = i23;
                            i27 = -2;
                            i29 = 1073741824;
                            i30 = 8;
                        }
                    } else {
                        i35 = combineMeasuredStates;
                    }
                    z8 = false;
                    if (((LinearLayout.LayoutParams) qxVar2).weight <= 0.0f) {
                    }
                    z12 = z8;
                    i32 = i25 + 1;
                    i31 = i24;
                    mode = i26;
                    z9 = z6;
                    mode2 = i23;
                    i27 = -2;
                    i29 = 1073741824;
                    i30 = 8;
                }
                i23 = mode2;
                i24 = i31;
                z6 = z9;
                i25 = i32;
                i26 = i37;
                i32 = i25 + 1;
                i31 = i24;
                mode = i26;
                z9 = z6;
                mode2 = i23;
                i27 = -2;
                i29 = 1073741824;
                i30 = 8;
            }
            int i41 = mode;
            int i42 = mode2;
            boolean z14 = z9;
            int i43 = i35;
            int i44 = i2;
            if (rxVar.k > 0 && rxVar.i(virtualChildCount)) {
                rxVar.k += rxVar.r;
            }
            if (z14 && (i42 == Integer.MIN_VALUE || i42 == 0)) {
                rxVar.k = 0;
                for (int i45 = 0; i45 < virtualChildCount; i45++) {
                    View childAt2 = rxVar.getChildAt(i45);
                    if (childAt2 == null) {
                        rxVar.k = rxVar.k;
                    } else if (childAt2.getVisibility() != 8) {
                        qx qxVar3 = (qx) childAt2.getLayoutParams();
                        int i46 = rxVar.k;
                        rxVar.k = Math.max(i46, i46 + i36 + ((LinearLayout.LayoutParams) qxVar3).topMargin + ((LinearLayout.LayoutParams) qxVar3).bottomMargin);
                    }
                }
            }
            int paddingBottom = rxVar.getPaddingBottom() + rxVar.getPaddingTop() + rxVar.k;
            rxVar.k = paddingBottom;
            int resolveSizeAndState = View.resolveSizeAndState(Math.max(paddingBottom, rxVar.getSuggestedMinimumHeight()), i44, 0);
            int i47 = (resolveSizeAndState & 16777215) - rxVar.k;
            if (z10 || (i47 != 0 && f > 0.0f)) {
                float f3 = rxVar.l;
                if (f3 > 0.0f) {
                    f = f3;
                }
                rxVar.k = 0;
                int i48 = i43;
                int i49 = 0;
                while (i49 < virtualChildCount) {
                    View childAt3 = rxVar.getChildAt(i49);
                    if (childAt3.getVisibility() == 8) {
                        i17 = i49;
                    } else {
                        qx qxVar4 = (qx) childAt3.getLayoutParams();
                        float f4 = ((LinearLayout.LayoutParams) qxVar4).weight;
                        if (f4 > 0.0f) {
                            int i50 = (int) ((i47 * f4) / f);
                            f -= f4;
                            i47 -= i50;
                            i17 = i49;
                            int childMeasureSpec = ViewGroup.getChildMeasureSpec(i, rxVar.getPaddingRight() + rxVar.getPaddingLeft() + ((LinearLayout.LayoutParams) qxVar4).leftMargin + ((LinearLayout.LayoutParams) qxVar4).rightMargin, ((LinearLayout.LayoutParams) qxVar4).width);
                            if (((LinearLayout.LayoutParams) qxVar4).height == 0) {
                                i19 = 1073741824;
                                if (i42 == 1073741824) {
                                    if (i50 <= 0) {
                                        i50 = 0;
                                    }
                                    childAt3.measure(childMeasureSpec, View.MeasureSpec.makeMeasureSpec(i50, 1073741824));
                                    i48 = View.combineMeasuredStates(i48, childAt3.getMeasuredState() & (-256));
                                }
                            } else {
                                i19 = 1073741824;
                            }
                            int measuredHeight2 = childAt3.getMeasuredHeight() + i50;
                            if (measuredHeight2 < 0) {
                                measuredHeight2 = 0;
                            }
                            childAt3.measure(childMeasureSpec, View.MeasureSpec.makeMeasureSpec(measuredHeight2, i19));
                            i48 = View.combineMeasuredStates(i48, childAt3.getMeasuredState() & (-256));
                        } else {
                            i17 = i49;
                        }
                        int i51 = ((LinearLayout.LayoutParams) qxVar4).leftMargin + ((LinearLayout.LayoutParams) qxVar4).rightMargin;
                        int measuredWidth2 = childAt3.getMeasuredWidth() + i51;
                        i28 = Math.max(i28, measuredWidth2);
                        if (i41 != 1073741824) {
                            i18 = -1;
                            if (((LinearLayout.LayoutParams) qxVar4).width == -1) {
                                measuredWidth2 = i51;
                            }
                        } else {
                            i18 = -1;
                        }
                        i33 = Math.max(i33, measuredWidth2);
                        boolean z15 = z12 && ((LinearLayout.LayoutParams) qxVar4).width == i18;
                        int i52 = rxVar.k;
                        rxVar.k = Math.max(i52, childAt3.getMeasuredHeight() + i52 + ((LinearLayout.LayoutParams) qxVar4).topMargin + ((LinearLayout.LayoutParams) qxVar4).bottomMargin);
                        z12 = z15;
                    }
                    i49 = i17 + 1;
                }
                rxVar.k = rxVar.getPaddingBottom() + rxVar.getPaddingTop() + rxVar.k;
                i43 = i48;
            } else {
                i33 = Math.max(i33, i34);
                if (z14 && i42 != 1073741824) {
                    for (int i53 = 0; i53 < virtualChildCount; i53++) {
                        View childAt4 = rxVar.getChildAt(i53);
                        if (childAt4 != null && childAt4.getVisibility() != 8 && ((LinearLayout.LayoutParams) ((qx) childAt4.getLayoutParams())).weight > 0.0f) {
                            childAt4.measure(View.MeasureSpec.makeMeasureSpec(childAt4.getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(i36, 1073741824));
                        }
                    }
                }
            }
            if (z12 || i41 == 1073741824) {
                i33 = i28;
            }
            rxVar.setMeasuredDimension(View.resolveSizeAndState(Math.max(rxVar.getPaddingRight() + rxVar.getPaddingLeft() + i33, rxVar.getSuggestedMinimumWidth()), i, i43), resolveSizeAndState);
            if (z11) {
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(rxVar.getMeasuredWidth(), 1073741824);
                int i54 = 0;
                while (i54 < virtualChildCount) {
                    View childAt5 = rxVar.getChildAt(i54);
                    if (childAt5.getVisibility() != 8) {
                        qx qxVar5 = (qx) childAt5.getLayoutParams();
                        if (((LinearLayout.LayoutParams) qxVar5).width == -1) {
                            int i55 = ((LinearLayout.LayoutParams) qxVar5).height;
                            ((LinearLayout.LayoutParams) qxVar5).height = childAt5.getMeasuredHeight();
                            rxVar.measureChildWithMargins(childAt5, makeMeasureSpec, 0, i44, 0);
                            ((LinearLayout.LayoutParams) qxVar5).height = i55;
                        }
                    }
                    i54++;
                    i44 = i2;
                }
                return;
            }
            return;
        }
        int i56 = i;
        rxVar.k = 0;
        int virtualChildCount2 = rxVar.getVirtualChildCount();
        int mode3 = View.MeasureSpec.getMode(i56);
        int mode4 = View.MeasureSpec.getMode(i2);
        if (rxVar.n == null || rxVar.o == null) {
            rxVar.n = new int[4];
            rxVar.o = new int[4];
        }
        int[] iArr3 = rxVar.n;
        int[] iArr4 = rxVar.o;
        iArr3[3] = -1;
        char c = 2;
        iArr3[2] = -1;
        iArr3[1] = -1;
        iArr3[0] = -1;
        iArr4[3] = -1;
        iArr4[2] = -1;
        iArr4[1] = -1;
        iArr4[0] = -1;
        boolean z16 = rxVar.f;
        boolean z17 = rxVar.m;
        boolean z18 = mode3 == 1073741824;
        float f5 = 0.0f;
        boolean z19 = true;
        int i57 = 0;
        int i58 = 0;
        int i59 = 0;
        int i60 = 0;
        int i61 = 0;
        int i62 = 0;
        boolean z20 = false;
        boolean z21 = false;
        while (i57 < virtualChildCount2) {
            char c2 = c;
            View childAt6 = rxVar.getChildAt(i57);
            if (childAt6 == null) {
                rxVar.k = rxVar.k;
                i12 = i57;
                i16 = i59;
                iArr2 = iArr3;
                iArr = iArr4;
                z2 = z16;
                z3 = z17;
            } else {
                int i63 = i58;
                if (childAt6.getVisibility() == 8) {
                    i56 = i;
                    i12 = i57;
                    i16 = i59;
                    iArr = iArr4;
                    z2 = z16;
                    z3 = z17;
                    i58 = i63;
                    iArr2 = iArr3;
                } else {
                    if (rxVar.i(i57)) {
                        rxVar.k += rxVar.q;
                    }
                    qx qxVar6 = (qx) childAt6.getLayoutParams();
                    float f6 = ((LinearLayout.LayoutParams) qxVar6).weight;
                    f5 += f6;
                    int i64 = i57;
                    if (mode3 == 1073741824 && ((LinearLayout.LayoutParams) qxVar6).width == 0 && f6 > 0.0f) {
                        int i65 = rxVar.k;
                        int i66 = ((LinearLayout.LayoutParams) qxVar6).leftMargin;
                        if (z18) {
                            rxVar.k = i66 + ((LinearLayout.LayoutParams) qxVar6).rightMargin + i65;
                        } else {
                            rxVar.k = Math.max(i65, i65 + i66 + ((LinearLayout.LayoutParams) qxVar6).rightMargin);
                        }
                        if (z16) {
                            int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 0);
                            childAt6.measure(makeMeasureSpec2, makeMeasureSpec2);
                            view = childAt6;
                            z2 = z16;
                            z3 = z17;
                            i13 = i63;
                            i12 = i64;
                            qxVar = qxVar6;
                            iArr2 = iArr3;
                            iArr = iArr4;
                            i56 = i;
                            i14 = i59;
                            i11 = i60;
                        } else {
                            view = childAt6;
                            z2 = z16;
                            z3 = z17;
                            z21 = true;
                            i13 = i63;
                            i12 = i64;
                            i15 = 1073741824;
                            qxVar = qxVar6;
                            iArr2 = iArr3;
                            iArr = iArr4;
                            i56 = i;
                            i14 = i59;
                            i11 = i60;
                            if (mode4 == i15 && ((LinearLayout.LayoutParams) qxVar).height == -1) {
                                z4 = true;
                                z20 = true;
                            } else {
                                z4 = false;
                            }
                            int i67 = ((LinearLayout.LayoutParams) qxVar).topMargin + ((LinearLayout.LayoutParams) qxVar).bottomMargin;
                            int measuredHeight3 = view.getMeasuredHeight() + i67;
                            i62 = View.combineMeasuredStates(i62, view.getMeasuredState());
                            if (z2) {
                                z5 = z4;
                            } else {
                                int baseline2 = view.getBaseline();
                                z5 = z4;
                                if (baseline2 != -1) {
                                    int i68 = ((LinearLayout.LayoutParams) qxVar).gravity;
                                    if (i68 < 0) {
                                        i68 = rxVar.j;
                                    }
                                    int i69 = (((i68 & 112) >> 4) & (-2)) >> 1;
                                    iArr2[i69] = Math.max(iArr2[i69], baseline2);
                                    iArr[i69] = Math.max(iArr[i69], measuredHeight3 - baseline2);
                                }
                            }
                            int max2 = Math.max(i13, measuredHeight3);
                            boolean z22 = !z19 && ((LinearLayout.LayoutParams) qxVar).height == -1;
                            if (((LinearLayout.LayoutParams) qxVar).weight <= 0.0f) {
                                if (!z5) {
                                    i67 = measuredHeight3;
                                }
                                i60 = Math.max(i11, i67);
                                max = i14;
                            } else {
                                if (!z5) {
                                    i67 = measuredHeight3;
                                }
                                max = Math.max(i14, i67);
                                i60 = i11;
                            }
                            int i70 = max;
                            i58 = max2;
                            i16 = i70;
                            z19 = z22;
                        }
                    } else {
                        if (((LinearLayout.LayoutParams) qxVar6).width != 0 || f6 <= 0.0f) {
                            i10 = Integer.MIN_VALUE;
                        } else {
                            ((LinearLayout.LayoutParams) qxVar6).width = -2;
                            i10 = 0;
                        }
                        iArr = iArr4;
                        i11 = i60;
                        i12 = i64;
                        z2 = z16;
                        z3 = z17;
                        int i71 = i10;
                        qxVar = qxVar6;
                        i13 = i63;
                        i56 = i;
                        iArr2 = iArr3;
                        i14 = i59;
                        rxVar.measureChildWithMargins(childAt6, i56, f5 == 0.0f ? rxVar.k : 0, i2, 0);
                        if (i71 != Integer.MIN_VALUE) {
                            ((LinearLayout.LayoutParams) qxVar).width = i71;
                        }
                        int measuredWidth3 = childAt6.getMeasuredWidth();
                        int i72 = rxVar.k;
                        int i73 = ((LinearLayout.LayoutParams) qxVar).leftMargin;
                        if (z18) {
                            view = childAt6;
                            rxVar.k = i73 + measuredWidth3 + ((LinearLayout.LayoutParams) qxVar).rightMargin + i72;
                        } else {
                            view = childAt6;
                            rxVar.k = Math.max(i72, i72 + measuredWidth3 + i73 + ((LinearLayout.LayoutParams) qxVar).rightMargin);
                        }
                        if (z3) {
                            i61 = Math.max(measuredWidth3, i61);
                        }
                    }
                    i15 = 1073741824;
                    if (mode4 == i15) {
                    }
                    z4 = false;
                    int i672 = ((LinearLayout.LayoutParams) qxVar).topMargin + ((LinearLayout.LayoutParams) qxVar).bottomMargin;
                    int measuredHeight32 = view.getMeasuredHeight() + i672;
                    i62 = View.combineMeasuredStates(i62, view.getMeasuredState());
                    if (z2) {
                    }
                    int max22 = Math.max(i13, measuredHeight32);
                    if (z19) {
                    }
                    if (((LinearLayout.LayoutParams) qxVar).weight <= 0.0f) {
                    }
                    int i702 = max;
                    i58 = max22;
                    i16 = i702;
                    z19 = z22;
                }
            }
            i59 = i16;
            i57 = i12 + 1;
            c = c2;
            iArr3 = iArr2;
            iArr4 = iArr;
            z16 = z2;
            z17 = z3;
        }
        int[] iArr5 = iArr3;
        int[] iArr6 = iArr4;
        char c3 = c;
        boolean z23 = z16;
        boolean z24 = z17;
        int i74 = i58;
        int i75 = i59;
        int i76 = i60;
        if (rxVar.k > 0 && rxVar.i(virtualChildCount2)) {
            rxVar.k += rxVar.q;
        }
        int i77 = iArr5[1];
        int max3 = (i77 == -1 && iArr5[0] == -1 && iArr5[c3] == -1 && iArr5[3] == -1) ? i74 : Math.max(i74, Math.max(iArr6[3], Math.max(iArr6[0], Math.max(iArr6[1], iArr6[c3]))) + Math.max(iArr5[3], Math.max(iArr5[0], Math.max(i77, iArr5[c3]))));
        if (z24 && (mode3 == Integer.MIN_VALUE || mode3 == 0)) {
            rxVar.k = 0;
            for (int i78 = 0; i78 < virtualChildCount2; i78++) {
                View childAt7 = rxVar.getChildAt(i78);
                if (childAt7 == null) {
                    rxVar.k = rxVar.k;
                } else if (childAt7.getVisibility() != 8) {
                    qx qxVar7 = (qx) childAt7.getLayoutParams();
                    int i79 = rxVar.k;
                    if (z18) {
                        rxVar.k = ((LinearLayout.LayoutParams) qxVar7).leftMargin + i61 + ((LinearLayout.LayoutParams) qxVar7).rightMargin + i79;
                    } else {
                        rxVar.k = Math.max(i79, i79 + i61 + ((LinearLayout.LayoutParams) qxVar7).leftMargin + ((LinearLayout.LayoutParams) qxVar7).rightMargin);
                    }
                }
            }
        }
        int paddingRight = rxVar.getPaddingRight() + rxVar.getPaddingLeft() + rxVar.k;
        rxVar.k = paddingRight;
        int resolveSizeAndState2 = View.resolveSizeAndState(Math.max(paddingRight, rxVar.getSuggestedMinimumWidth()), i56, 0);
        int i80 = (resolveSizeAndState2 & 16777215) - rxVar.k;
        if (z21 || (i80 != 0 && f5 > 0.0f)) {
            float f7 = rxVar.l;
            if (f7 > 0.0f) {
                f5 = f7;
            }
            iArr5[3] = -1;
            iArr5[c3] = -1;
            iArr5[1] = -1;
            iArr5[0] = -1;
            iArr6[3] = -1;
            iArr6[c3] = -1;
            iArr6[1] = -1;
            iArr6[0] = -1;
            rxVar.k = 0;
            max3 = -1;
            int i81 = 0;
            while (i81 < virtualChildCount2) {
                View childAt8 = rxVar.getChildAt(i81);
                if (childAt8 == null || childAt8.getVisibility() == 8) {
                    i7 = resolveSizeAndState2;
                } else {
                    qx qxVar8 = (qx) childAt8.getLayoutParams();
                    float f8 = ((LinearLayout.LayoutParams) qxVar8).weight;
                    if (f8 > 0.0f) {
                        int i82 = (int) ((i80 * f8) / f5);
                        f5 -= f8;
                        i80 -= i82;
                        i7 = resolveSizeAndState2;
                        int childMeasureSpec2 = ViewGroup.getChildMeasureSpec(i2, rxVar.getPaddingBottom() + rxVar.getPaddingTop() + ((LinearLayout.LayoutParams) qxVar8).topMargin + ((LinearLayout.LayoutParams) qxVar8).bottomMargin, ((LinearLayout.LayoutParams) qxVar8).height);
                        if (((LinearLayout.LayoutParams) qxVar8).width == 0) {
                            i9 = 1073741824;
                            if (mode3 == 1073741824) {
                                if (i82 <= 0) {
                                    i82 = 0;
                                }
                                childAt8.measure(View.MeasureSpec.makeMeasureSpec(i82, 1073741824), childMeasureSpec2);
                                i62 = View.combineMeasuredStates(i62, childAt8.getMeasuredState() & (-16777216));
                            }
                        } else {
                            i9 = 1073741824;
                        }
                        int measuredWidth4 = childAt8.getMeasuredWidth() + i82;
                        if (measuredWidth4 < 0) {
                            measuredWidth4 = 0;
                        }
                        childAt8.measure(View.MeasureSpec.makeMeasureSpec(measuredWidth4, i9), childMeasureSpec2);
                        i62 = View.combineMeasuredStates(i62, childAt8.getMeasuredState() & (-16777216));
                    } else {
                        i7 = resolveSizeAndState2;
                    }
                    int i83 = rxVar.k;
                    if (z18) {
                        rxVar.k = childAt8.getMeasuredWidth() + ((LinearLayout.LayoutParams) qxVar8).leftMargin + ((LinearLayout.LayoutParams) qxVar8).rightMargin + i83;
                    } else {
                        rxVar.k = Math.max(i83, childAt8.getMeasuredWidth() + i83 + ((LinearLayout.LayoutParams) qxVar8).leftMargin + ((LinearLayout.LayoutParams) qxVar8).rightMargin);
                    }
                    boolean z25 = mode4 != 1073741824 && ((LinearLayout.LayoutParams) qxVar8).height == -1;
                    int i84 = ((LinearLayout.LayoutParams) qxVar8).topMargin + ((LinearLayout.LayoutParams) qxVar8).bottomMargin;
                    int measuredHeight4 = childAt8.getMeasuredHeight() + i84;
                    max3 = Math.max(max3, measuredHeight4);
                    if (!z25) {
                        i84 = measuredHeight4;
                    }
                    int max4 = Math.max(i75, i84);
                    if (z19) {
                        i8 = -1;
                        if (((LinearLayout.LayoutParams) qxVar8).height == -1) {
                            z = true;
                            if (!z23 && (baseline = childAt8.getBaseline()) != i8) {
                                int i85 = ((LinearLayout.LayoutParams) qxVar8).gravity;
                                if (i85 < 0) {
                                    i85 = rxVar.j;
                                }
                                int i86 = (((i85 & 112) >> 4) & (-2)) >> 1;
                                iArr5[i86] = Math.max(iArr5[i86], baseline);
                                iArr6[i86] = Math.max(iArr6[i86], measuredHeight4 - baseline);
                            }
                            z19 = z;
                            i75 = max4;
                        }
                    } else {
                        i8 = -1;
                    }
                    z = false;
                    if (!z23) {
                    }
                    z19 = z;
                    i75 = max4;
                }
                i81++;
                resolveSizeAndState2 = i7;
            }
            i3 = resolveSizeAndState2;
            i4 = -16777216;
            rxVar.k = rxVar.getPaddingRight() + rxVar.getPaddingLeft() + rxVar.k;
            int i87 = iArr5[1];
            if (i87 == -1 && iArr5[0] == -1 && iArr5[c3] == -1 && iArr5[3] == -1) {
                i5 = 0;
            } else {
                i5 = 0;
                max3 = Math.max(max3, Math.max(iArr6[3], Math.max(iArr6[0], Math.max(iArr6[1], iArr6[c3]))) + Math.max(iArr5[3], Math.max(iArr5[0], Math.max(i87, iArr5[c3]))));
            }
            i6 = i75;
        } else {
            i6 = Math.max(i75, i76);
            if (z24 && mode3 != 1073741824) {
                for (int i88 = 0; i88 < virtualChildCount2; i88++) {
                    View childAt9 = rxVar.getChildAt(i88);
                    if (childAt9 != null && childAt9.getVisibility() != 8 && ((LinearLayout.LayoutParams) ((qx) childAt9.getLayoutParams())).weight > 0.0f) {
                        childAt9.measure(View.MeasureSpec.makeMeasureSpec(i61, 1073741824), View.MeasureSpec.makeMeasureSpec(childAt9.getMeasuredHeight(), 1073741824));
                    }
                }
            }
            i3 = resolveSizeAndState2;
            i4 = -16777216;
            i5 = 0;
        }
        if (!z19 && mode4 != 1073741824) {
            max3 = i6;
        }
        rxVar.setMeasuredDimension(i3 | (i62 & i4), View.resolveSizeAndState(Math.max(rxVar.getPaddingBottom() + rxVar.getPaddingTop() + max3, rxVar.getSuggestedMinimumHeight()), i2, i62 << 16));
        if (z20) {
            int makeMeasureSpec3 = View.MeasureSpec.makeMeasureSpec(rxVar.getMeasuredHeight(), 1073741824);
            int i89 = i5;
            while (i89 < virtualChildCount2) {
                View childAt10 = rxVar.getChildAt(i89);
                if (childAt10.getVisibility() != 8) {
                    qx qxVar9 = (qx) childAt10.getLayoutParams();
                    if (((LinearLayout.LayoutParams) qxVar9).height == -1) {
                        int i90 = ((LinearLayout.LayoutParams) qxVar9).width;
                        ((LinearLayout.LayoutParams) qxVar9).width = childAt10.getMeasuredWidth();
                        rxVar.measureChildWithMargins(childAt10, i56, 0, makeMeasureSpec3, 0);
                        ((LinearLayout.LayoutParams) qxVar9).width = i90;
                    }
                }
                i89++;
                rxVar = this;
                i56 = i;
            }
        }
    }

    public void setBaselineAligned(boolean z) {
        this.f = z;
    }

    public void setBaselineAlignedChildIndex(int i) {
        if (i >= 0 && i < getChildCount()) {
            this.g = i;
            return;
        }
        throw new IllegalArgumentException("base aligned child index out of range (0, " + getChildCount() + ")");
    }

    public void setDividerDrawable(Drawable drawable) {
        if (drawable == this.p) {
            return;
        }
        this.p = drawable;
        if (drawable != null) {
            this.q = drawable.getIntrinsicWidth();
            this.r = drawable.getIntrinsicHeight();
        } else {
            this.q = 0;
            this.r = 0;
        }
        setWillNotDraw(drawable == null);
        requestLayout();
    }

    public void setDividerPadding(int i) {
        this.t = i;
    }

    public void setGravity(int i) {
        if (this.j != i) {
            if ((8388615 & i) == 0) {
                i |= 8388611;
            }
            if ((i & 112) == 0) {
                i |= 48;
            }
            this.j = i;
            requestLayout();
        }
    }

    public void setHorizontalGravity(int i) {
        int i2 = i & 8388615;
        int i3 = this.j;
        if ((8388615 & i3) != i2) {
            this.j = i2 | ((-8388616) & i3);
            requestLayout();
        }
    }

    public void setMeasureWithLargestChildEnabled(boolean z) {
        this.m = z;
    }

    public void setOrientation(int i) {
        if (this.i != i) {
            this.i = i;
            requestLayout();
        }
    }

    public void setShowDividers(int i) {
        if (i != this.s) {
            requestLayout();
        }
        this.s = i;
    }

    public void setVerticalGravity(int i) {
        int i2 = i & 112;
        int i3 = this.j;
        if ((i3 & 112) != i2) {
            this.j = i2 | (i3 & (-113));
            requestLayout();
        }
    }

    public void setWeightSum(float f) {
        this.l = Math.max(0.0f, f);
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }
}
