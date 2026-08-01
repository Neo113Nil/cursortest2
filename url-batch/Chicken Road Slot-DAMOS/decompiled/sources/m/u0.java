package m;

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

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public abstract class u0 extends ViewGroup {
    public int A;
    public int B;
    public int C;

    /* renamed from: d, reason: collision with root package name */
    public boolean f6187d;

    /* renamed from: e, reason: collision with root package name */
    public int f6188e;

    /* renamed from: i, reason: collision with root package name */
    public int f6189i;

    /* renamed from: r, reason: collision with root package name */
    public int f6190r;

    /* renamed from: s, reason: collision with root package name */
    public int f6191s;

    /* renamed from: t, reason: collision with root package name */
    public int f6192t;

    /* renamed from: u, reason: collision with root package name */
    public float f6193u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f6194v;

    /* renamed from: w, reason: collision with root package name */
    public int[] f6195w;

    /* renamed from: x, reason: collision with root package name */
    public int[] f6196x;

    /* renamed from: y, reason: collision with root package name */
    public Drawable f6197y;

    /* renamed from: z, reason: collision with root package name */
    public int f6198z;

    public u0(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.f6187d = true;
        this.f6188e = -1;
        this.f6189i = 0;
        this.f6191s = 8388659;
        int[] iArr = i.a.j;
        a1.n z10 = a1.n.z(context, attributeSet, iArr, 0);
        o3.c0.c(this, context, iArr, attributeSet, (TypedArray) z10.f40e, 0);
        TypedArray typedArray = (TypedArray) z10.f40e;
        int i3 = typedArray.getInt(1, -1);
        if (i3 >= 0) {
            setOrientation(i3);
        }
        int i10 = typedArray.getInt(0, -1);
        if (i10 >= 0) {
            setGravity(i10);
        }
        boolean z11 = typedArray.getBoolean(2, true);
        if (!z11) {
            setBaselineAligned(z11);
        }
        this.f6193u = typedArray.getFloat(4, -1.0f);
        this.f6188e = typedArray.getInt(3, -1);
        this.f6194v = typedArray.getBoolean(7, false);
        setDividerDrawable(z10.r(5));
        this.B = typedArray.getInt(8, 0);
        this.C = typedArray.getDimensionPixelSize(6, 0);
        z10.D();
    }

    public final void b(Canvas canvas, int i3) {
        this.f6197y.setBounds(getPaddingLeft() + this.C, i3, (getWidth() - getPaddingRight()) - this.C, this.A + i3);
        this.f6197y.draw(canvas);
    }

    public final void c(Canvas canvas, int i3) {
        this.f6197y.setBounds(i3, getPaddingTop() + this.C, this.f6198z + i3, (getHeight() - getPaddingBottom()) - this.C);
        this.f6197y.draw(canvas);
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof t0;
    }

    @Override // android.view.ViewGroup
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public t0 generateDefaultLayoutParams() {
        int i3 = this.f6190r;
        if (i3 == 0) {
            return new t0(-2, -2);
        }
        if (i3 == 1) {
            return new t0(-1, -2);
        }
        return null;
    }

    @Override // android.view.ViewGroup
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public t0 generateLayoutParams(AttributeSet attributeSet) {
        return new t0(getContext(), attributeSet);
    }

    @Override // android.view.ViewGroup
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public t0 generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof t0 ? new t0((t0) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new t0((ViewGroup.MarginLayoutParams) layoutParams) : new t0(layoutParams);
    }

    public final boolean g(int i3) {
        if (i3 == 0) {
            return (this.B & 1) != 0;
        }
        int childCount = getChildCount();
        int i10 = this.B;
        if (i3 == childCount) {
            return (i10 & 4) != 0;
        }
        if ((i10 & 2) != 0) {
            for (int i11 = i3 - 1; i11 >= 0; i11--) {
                if (getChildAt(i11).getVisibility() != 8) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // android.view.View
    public int getBaseline() {
        int i3;
        if (this.f6188e < 0) {
            return super.getBaseline();
        }
        int childCount = getChildCount();
        int i10 = this.f6188e;
        if (childCount <= i10) {
            throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout set to an index that is out of bounds.");
        }
        View childAt = getChildAt(i10);
        int baseline = childAt.getBaseline();
        if (baseline == -1) {
            if (this.f6188e == 0) {
                return -1;
            }
            throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout points to a View that doesn't know how to get its baseline.");
        }
        int i11 = this.f6189i;
        if (this.f6190r == 1 && (i3 = this.f6191s & 112) != 48) {
            if (i3 == 16) {
                i11 += ((((getBottom() - getTop()) - getPaddingTop()) - getPaddingBottom()) - this.f6192t) / 2;
            } else if (i3 == 80) {
                i11 = ((getBottom() - getTop()) - getPaddingBottom()) - this.f6192t;
            }
        }
        return i11 + ((LinearLayout.LayoutParams) ((t0) childAt.getLayoutParams())).topMargin + baseline;
    }

    public int getBaselineAlignedChildIndex() {
        return this.f6188e;
    }

    public Drawable getDividerDrawable() {
        return this.f6197y;
    }

    public int getDividerPadding() {
        return this.C;
    }

    public int getDividerWidth() {
        return this.f6198z;
    }

    public int getGravity() {
        return this.f6191s;
    }

    public int getOrientation() {
        return this.f6190r;
    }

    public int getShowDividers() {
        return this.B;
    }

    public int getVirtualChildCount() {
        return getChildCount();
    }

    public float getWeightSum() {
        return this.f6193u;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        int right;
        int left;
        int i3;
        if (this.f6197y == null) {
            return;
        }
        int i10 = 0;
        if (this.f6190r == 1) {
            int virtualChildCount = getVirtualChildCount();
            while (i10 < virtualChildCount) {
                View childAt = getChildAt(i10);
                if (childAt != null && childAt.getVisibility() != 8 && g(i10)) {
                    b(canvas, (childAt.getTop() - ((LinearLayout.LayoutParams) ((t0) childAt.getLayoutParams())).topMargin) - this.A);
                }
                i10++;
            }
            if (g(virtualChildCount)) {
                View childAt2 = getChildAt(virtualChildCount - 1);
                b(canvas, childAt2 == null ? (getHeight() - getPaddingBottom()) - this.A : childAt2.getBottom() + ((LinearLayout.LayoutParams) ((t0) childAt2.getLayoutParams())).bottomMargin);
                return;
            }
            return;
        }
        int virtualChildCount2 = getVirtualChildCount();
        boolean z10 = j2.f6117a;
        boolean z11 = getLayoutDirection() == 1;
        while (i10 < virtualChildCount2) {
            View childAt3 = getChildAt(i10);
            if (childAt3 != null && childAt3.getVisibility() != 8 && g(i10)) {
                t0 t0Var = (t0) childAt3.getLayoutParams();
                c(canvas, z11 ? childAt3.getRight() + ((LinearLayout.LayoutParams) t0Var).rightMargin : (childAt3.getLeft() - ((LinearLayout.LayoutParams) t0Var).leftMargin) - this.f6198z);
            }
            i10++;
        }
        if (g(virtualChildCount2)) {
            View childAt4 = getChildAt(virtualChildCount2 - 1);
            if (childAt4 != null) {
                t0 t0Var2 = (t0) childAt4.getLayoutParams();
                if (z11) {
                    left = childAt4.getLeft() - ((LinearLayout.LayoutParams) t0Var2).leftMargin;
                    i3 = this.f6198z;
                    right = left - i3;
                } else {
                    right = childAt4.getRight() + ((LinearLayout.LayoutParams) t0Var2).rightMargin;
                }
            } else if (z11) {
                right = getPaddingLeft();
            } else {
                left = getWidth() - getPaddingRight();
                i3 = this.f6198z;
                right = left - i3;
            }
            c(canvas, right);
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
    public void onLayout(boolean z10, int i3, int i10, int i11, int i12) {
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        char c10;
        int i22;
        int i23;
        int i24;
        int i25 = 8;
        char c11 = 2;
        if (this.f6190r == 1) {
            int paddingLeft = getPaddingLeft();
            int i26 = i11 - i3;
            int paddingRight = i26 - getPaddingRight();
            int paddingRight2 = (i26 - paddingLeft) - getPaddingRight();
            int virtualChildCount = getVirtualChildCount();
            int i27 = this.f6191s;
            int i28 = i27 & 112;
            int i29 = 8388615 & i27;
            int paddingTop = i28 != 16 ? i28 != 80 ? getPaddingTop() : ((getPaddingTop() + i12) - i10) - this.f6192t : getPaddingTop() + (((i12 - i10) - this.f6192t) / 2);
            int i30 = 0;
            while (i30 < virtualChildCount) {
                View childAt = getChildAt(i30);
                if (childAt == null || childAt.getVisibility() == i25) {
                    c10 = c11;
                } else {
                    int measuredWidth = childAt.getMeasuredWidth();
                    int measuredHeight = childAt.getMeasuredHeight();
                    t0 t0Var = (t0) childAt.getLayoutParams();
                    c10 = c11;
                    int i31 = ((LinearLayout.LayoutParams) t0Var).gravity;
                    if (i31 < 0) {
                        i31 = i29;
                    }
                    int absoluteGravity = Gravity.getAbsoluteGravity(i31, getLayoutDirection()) & 7;
                    if (absoluteGravity == 1) {
                        i22 = ((paddingRight2 - measuredWidth) / 2) + paddingLeft + ((LinearLayout.LayoutParams) t0Var).leftMargin;
                        i23 = ((LinearLayout.LayoutParams) t0Var).rightMargin;
                    } else if (absoluteGravity != 5) {
                        i24 = ((LinearLayout.LayoutParams) t0Var).leftMargin + paddingLeft;
                        if (g(i30)) {
                            paddingTop += this.A;
                        }
                        int i32 = paddingTop + ((LinearLayout.LayoutParams) t0Var).topMargin;
                        childAt.layout(i24, i32, measuredWidth + i24, i32 + measuredHeight);
                        paddingTop = measuredHeight + ((LinearLayout.LayoutParams) t0Var).bottomMargin + i32;
                    } else {
                        i22 = paddingRight - measuredWidth;
                        i23 = ((LinearLayout.LayoutParams) t0Var).rightMargin;
                    }
                    i24 = i22 - i23;
                    if (g(i30)) {
                    }
                    int i322 = paddingTop + ((LinearLayout.LayoutParams) t0Var).topMargin;
                    childAt.layout(i24, i322, measuredWidth + i24, i322 + measuredHeight);
                    paddingTop = measuredHeight + ((LinearLayout.LayoutParams) t0Var).bottomMargin + i322;
                }
                i30++;
                c11 = c10;
                i25 = 8;
            }
            return;
        }
        boolean z11 = j2.f6117a;
        boolean z12 = getLayoutDirection() == 1;
        int paddingTop2 = getPaddingTop();
        int i33 = i12 - i10;
        int paddingBottom = i33 - getPaddingBottom();
        int paddingBottom2 = (i33 - paddingTop2) - getPaddingBottom();
        int virtualChildCount2 = getVirtualChildCount();
        int i34 = this.f6191s;
        int i35 = 8388615 & i34;
        int i36 = i34 & 112;
        boolean z13 = this.f6187d;
        int[] iArr = this.f6195w;
        int[] iArr2 = this.f6196x;
        int absoluteGravity2 = Gravity.getAbsoluteGravity(i35, getLayoutDirection());
        int paddingLeft2 = absoluteGravity2 != 1 ? absoluteGravity2 != 5 ? getPaddingLeft() : ((getPaddingLeft() + i11) - i3) - this.f6192t : getPaddingLeft() + (((i11 - i3) - this.f6192t) / 2);
        if (z12) {
            i14 = virtualChildCount2 - 1;
            i13 = -1;
        } else {
            i13 = 1;
            i14 = 0;
        }
        int i37 = 0;
        while (i37 < virtualChildCount2) {
            int i38 = (i13 * i37) + i14;
            View childAt2 = getChildAt(i38);
            if (childAt2 == null) {
                i15 = i14;
            } else {
                i15 = i14;
                if (childAt2.getVisibility() != 8) {
                    int measuredWidth2 = childAt2.getMeasuredWidth();
                    int measuredHeight2 = childAt2.getMeasuredHeight();
                    t0 t0Var2 = (t0) childAt2.getLayoutParams();
                    int i39 = paddingLeft2;
                    if (z13) {
                        i16 = paddingTop2;
                        if (((LinearLayout.LayoutParams) t0Var2).height != -1) {
                            i17 = childAt2.getBaseline();
                            i18 = ((LinearLayout.LayoutParams) t0Var2).gravity;
                            if (i18 < 0) {
                                i18 = i36;
                            }
                            i19 = i18 & 112;
                            if (i19 == 16) {
                                if (i19 == 48) {
                                    i20 = i16 + ((LinearLayout.LayoutParams) t0Var2).topMargin;
                                    if (i17 != -1) {
                                        i20 = (iArr[1] - i17) + i20;
                                    }
                                } else if (i19 != 80) {
                                    i20 = i16;
                                } else {
                                    i20 = (paddingBottom - measuredHeight2) - ((LinearLayout.LayoutParams) t0Var2).bottomMargin;
                                    if (i17 != -1) {
                                        i21 = iArr2[2] - (childAt2.getMeasuredHeight() - i17);
                                    }
                                }
                                int i40 = (g(i38) ? i39 + this.f6198z : i39) + ((LinearLayout.LayoutParams) t0Var2).leftMargin;
                                childAt2.layout(i40, i20, i40 + measuredWidth2, i20 + measuredHeight2);
                                paddingLeft2 = measuredWidth2 + ((LinearLayout.LayoutParams) t0Var2).rightMargin + i40;
                                i37++;
                                i14 = i15;
                                paddingTop2 = i16;
                            } else {
                                i20 = ((paddingBottom2 - measuredHeight2) / 2) + i16 + ((LinearLayout.LayoutParams) t0Var2).topMargin;
                                i21 = ((LinearLayout.LayoutParams) t0Var2).bottomMargin;
                            }
                            i20 -= i21;
                            int i402 = (g(i38) ? i39 + this.f6198z : i39) + ((LinearLayout.LayoutParams) t0Var2).leftMargin;
                            childAt2.layout(i402, i20, i402 + measuredWidth2, i20 + measuredHeight2);
                            paddingLeft2 = measuredWidth2 + ((LinearLayout.LayoutParams) t0Var2).rightMargin + i402;
                            i37++;
                            i14 = i15;
                            paddingTop2 = i16;
                        }
                    } else {
                        i16 = paddingTop2;
                    }
                    i17 = -1;
                    i18 = ((LinearLayout.LayoutParams) t0Var2).gravity;
                    if (i18 < 0) {
                    }
                    i19 = i18 & 112;
                    if (i19 == 16) {
                    }
                    i20 -= i21;
                    int i4022 = (g(i38) ? i39 + this.f6198z : i39) + ((LinearLayout.LayoutParams) t0Var2).leftMargin;
                    childAt2.layout(i4022, i20, i4022 + measuredWidth2, i20 + measuredHeight2);
                    paddingLeft2 = measuredWidth2 + ((LinearLayout.LayoutParams) t0Var2).rightMargin + i4022;
                    i37++;
                    i14 = i15;
                    paddingTop2 = i16;
                }
            }
            i16 = paddingTop2;
            i37++;
            i14 = i15;
            paddingTop2 = i16;
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
    public void onMeasure(int i3, int i10) {
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        boolean z10;
        int baseline;
        int i17;
        int i18;
        int[] iArr;
        int i19;
        int i20;
        boolean z11;
        boolean z12;
        t0 t0Var;
        int i21;
        int[] iArr2;
        int i22;
        View view;
        int i23;
        boolean z13;
        boolean z14;
        int max;
        int i24;
        int i25;
        int i26;
        int i27;
        int i28;
        int i29;
        int i30;
        int i31;
        boolean z15;
        int i32;
        int i33;
        int i34;
        View view2;
        boolean z16;
        boolean z17;
        u0 u0Var = this;
        int i35 = -2;
        int i36 = 0;
        int i37 = 1073741824;
        int i38 = 8;
        if (u0Var.f6190r == 1) {
            u0Var.f6192t = 0;
            int virtualChildCount = u0Var.getVirtualChildCount();
            int mode = View.MeasureSpec.getMode(i3);
            int mode2 = View.MeasureSpec.getMode(i10);
            int i39 = u0Var.f6188e;
            boolean z18 = u0Var.f6194v;
            int i40 = 0;
            int i41 = 0;
            int i42 = 0;
            boolean z19 = false;
            int i43 = 0;
            boolean z20 = false;
            boolean z21 = true;
            float f3 = 0.0f;
            int i44 = 0;
            while (i40 < virtualChildCount) {
                int i45 = mode;
                View childAt = u0Var.getChildAt(i40);
                if (childAt == null) {
                    u0Var.f6192t = u0Var.f6192t;
                } else if (childAt.getVisibility() != i38) {
                    if (u0Var.g(i40)) {
                        u0Var.f6192t += u0Var.A;
                    }
                    t0 t0Var2 = (t0) childAt.getLayoutParams();
                    float f10 = ((LinearLayout.LayoutParams) t0Var2).weight;
                    f3 += f10;
                    if (mode2 == i37 && ((LinearLayout.LayoutParams) t0Var2).height == 0 && f10 > 0.0f) {
                        int i46 = u0Var.f6192t;
                        u0Var.f6192t = Math.max(i46, ((LinearLayout.LayoutParams) t0Var2).topMargin + i46 + ((LinearLayout.LayoutParams) t0Var2).bottomMargin);
                        view2 = childAt;
                        i31 = mode2;
                        i32 = i39;
                        z15 = z18;
                        i33 = i40;
                        z19 = true;
                        i34 = i45;
                    } else {
                        if (((LinearLayout.LayoutParams) t0Var2).height != 0 || f10 <= 0.0f) {
                            i28 = Integer.MIN_VALUE;
                        } else {
                            ((LinearLayout.LayoutParams) t0Var2).height = i35;
                            i28 = 0;
                        }
                        if (f3 == 0.0f) {
                            i29 = i40;
                            i30 = u0Var.f6192t;
                        } else {
                            i29 = i40;
                            i30 = 0;
                        }
                        i31 = mode2;
                        z15 = z18;
                        i32 = i39;
                        i33 = i29;
                        i34 = i45;
                        u0Var.measureChildWithMargins(childAt, i3, 0, i10, i30);
                        if (i28 != Integer.MIN_VALUE) {
                            ((LinearLayout.LayoutParams) t0Var2).height = i28;
                        }
                        int measuredHeight = childAt.getMeasuredHeight();
                        int i47 = u0Var.f6192t;
                        view2 = childAt;
                        u0Var.f6192t = Math.max(i47, i47 + measuredHeight + ((LinearLayout.LayoutParams) t0Var2).topMargin + ((LinearLayout.LayoutParams) t0Var2).bottomMargin);
                        if (z15) {
                            i44 = Math.max(measuredHeight, i44);
                        }
                    }
                    if (i32 >= 0 && i32 == i33 + 1) {
                        u0Var.f6189i = u0Var.f6192t;
                    }
                    if (i33 < i32 && ((LinearLayout.LayoutParams) t0Var2).weight > 0.0f) {
                        throw new RuntimeException("A child of LinearLayout with index less than mBaselineAlignedChildIndex has weight > 0, which won't work.  Either remove the weight, or don't set mBaselineAlignedChildIndex.");
                    }
                    if (i34 == 1073741824 || ((LinearLayout.LayoutParams) t0Var2).width != -1) {
                        z16 = false;
                    } else {
                        z16 = true;
                        z20 = true;
                    }
                    int i48 = ((LinearLayout.LayoutParams) t0Var2).leftMargin + ((LinearLayout.LayoutParams) t0Var2).rightMargin;
                    int measuredWidth = view2.getMeasuredWidth() + i48;
                    i36 = Math.max(i36, measuredWidth);
                    int measuredState = view2.getMeasuredState();
                    boolean z22 = z16;
                    int combineMeasuredStates = View.combineMeasuredStates(i43, measuredState);
                    if (z21) {
                        i43 = combineMeasuredStates;
                        if (((LinearLayout.LayoutParams) t0Var2).width == -1) {
                            z17 = true;
                            if (((LinearLayout.LayoutParams) t0Var2).weight <= 0.0f) {
                                if (!z22) {
                                    i48 = measuredWidth;
                                }
                                i42 = Math.max(i42, i48);
                            } else {
                                if (!z22) {
                                    i48 = measuredWidth;
                                }
                                i41 = Math.max(i41, i48);
                            }
                            z21 = z17;
                            i40 = i33 + 1;
                            i39 = i32;
                            mode = i34;
                            z18 = z15;
                            mode2 = i31;
                            i35 = -2;
                            i37 = 1073741824;
                            i38 = 8;
                        }
                    } else {
                        i43 = combineMeasuredStates;
                    }
                    z17 = false;
                    if (((LinearLayout.LayoutParams) t0Var2).weight <= 0.0f) {
                    }
                    z21 = z17;
                    i40 = i33 + 1;
                    i39 = i32;
                    mode = i34;
                    z18 = z15;
                    mode2 = i31;
                    i35 = -2;
                    i37 = 1073741824;
                    i38 = 8;
                }
                i31 = mode2;
                i32 = i39;
                z15 = z18;
                i33 = i40;
                i34 = i45;
                i40 = i33 + 1;
                i39 = i32;
                mode = i34;
                z18 = z15;
                mode2 = i31;
                i35 = -2;
                i37 = 1073741824;
                i38 = 8;
            }
            int i49 = mode;
            int i50 = mode2;
            boolean z23 = z18;
            int i51 = i43;
            int i52 = i10;
            if (u0Var.f6192t > 0 && u0Var.g(virtualChildCount)) {
                u0Var.f6192t += u0Var.A;
            }
            if (z23 && (i50 == Integer.MIN_VALUE || i50 == 0)) {
                u0Var.f6192t = 0;
                for (int i53 = 0; i53 < virtualChildCount; i53++) {
                    View childAt2 = u0Var.getChildAt(i53);
                    if (childAt2 == null) {
                        u0Var.f6192t = u0Var.f6192t;
                    } else if (childAt2.getVisibility() != 8) {
                        t0 t0Var3 = (t0) childAt2.getLayoutParams();
                        int i54 = u0Var.f6192t;
                        u0Var.f6192t = Math.max(i54, i54 + i44 + ((LinearLayout.LayoutParams) t0Var3).topMargin + ((LinearLayout.LayoutParams) t0Var3).bottomMargin);
                    }
                }
            }
            int paddingBottom = u0Var.getPaddingBottom() + u0Var.getPaddingTop() + u0Var.f6192t;
            u0Var.f6192t = paddingBottom;
            int resolveSizeAndState = View.resolveSizeAndState(Math.max(paddingBottom, u0Var.getSuggestedMinimumHeight()), i52, 0);
            int i55 = (resolveSizeAndState & 16777215) - u0Var.f6192t;
            if (z19 || (i55 != 0 && f3 > 0.0f)) {
                float f11 = u0Var.f6193u;
                if (f11 > 0.0f) {
                    f3 = f11;
                }
                u0Var.f6192t = 0;
                int i56 = i51;
                int i57 = 0;
                while (i57 < virtualChildCount) {
                    View childAt3 = u0Var.getChildAt(i57);
                    if (childAt3.getVisibility() == 8) {
                        i25 = i57;
                    } else {
                        t0 t0Var4 = (t0) childAt3.getLayoutParams();
                        float f12 = ((LinearLayout.LayoutParams) t0Var4).weight;
                        if (f12 > 0.0f) {
                            int i58 = (int) ((i55 * f12) / f3);
                            f3 -= f12;
                            i55 -= i58;
                            i25 = i57;
                            int childMeasureSpec = ViewGroup.getChildMeasureSpec(i3, u0Var.getPaddingRight() + u0Var.getPaddingLeft() + ((LinearLayout.LayoutParams) t0Var4).leftMargin + ((LinearLayout.LayoutParams) t0Var4).rightMargin, ((LinearLayout.LayoutParams) t0Var4).width);
                            if (((LinearLayout.LayoutParams) t0Var4).height == 0) {
                                i27 = 1073741824;
                                if (i50 == 1073741824) {
                                    if (i58 <= 0) {
                                        i58 = 0;
                                    }
                                    childAt3.measure(childMeasureSpec, View.MeasureSpec.makeMeasureSpec(i58, 1073741824));
                                    i56 = View.combineMeasuredStates(i56, childAt3.getMeasuredState() & (-256));
                                }
                            } else {
                                i27 = 1073741824;
                            }
                            int measuredHeight2 = childAt3.getMeasuredHeight() + i58;
                            if (measuredHeight2 < 0) {
                                measuredHeight2 = 0;
                            }
                            childAt3.measure(childMeasureSpec, View.MeasureSpec.makeMeasureSpec(measuredHeight2, i27));
                            i56 = View.combineMeasuredStates(i56, childAt3.getMeasuredState() & (-256));
                        } else {
                            i25 = i57;
                        }
                        int i59 = ((LinearLayout.LayoutParams) t0Var4).leftMargin + ((LinearLayout.LayoutParams) t0Var4).rightMargin;
                        int measuredWidth2 = childAt3.getMeasuredWidth() + i59;
                        i36 = Math.max(i36, measuredWidth2);
                        if (i49 != 1073741824) {
                            i26 = -1;
                            if (((LinearLayout.LayoutParams) t0Var4).width == -1) {
                                measuredWidth2 = i59;
                            }
                        } else {
                            i26 = -1;
                        }
                        i41 = Math.max(i41, measuredWidth2);
                        boolean z24 = z21 && ((LinearLayout.LayoutParams) t0Var4).width == i26;
                        int i60 = u0Var.f6192t;
                        u0Var.f6192t = Math.max(i60, childAt3.getMeasuredHeight() + i60 + ((LinearLayout.LayoutParams) t0Var4).topMargin + ((LinearLayout.LayoutParams) t0Var4).bottomMargin);
                        z21 = z24;
                    }
                    i57 = i25 + 1;
                }
                u0Var.f6192t = u0Var.getPaddingBottom() + u0Var.getPaddingTop() + u0Var.f6192t;
                i51 = i56;
            } else {
                i41 = Math.max(i41, i42);
                if (z23 && i50 != 1073741824) {
                    for (int i61 = 0; i61 < virtualChildCount; i61++) {
                        View childAt4 = u0Var.getChildAt(i61);
                        if (childAt4 != null && childAt4.getVisibility() != 8 && ((LinearLayout.LayoutParams) ((t0) childAt4.getLayoutParams())).weight > 0.0f) {
                            childAt4.measure(View.MeasureSpec.makeMeasureSpec(childAt4.getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(i44, 1073741824));
                        }
                    }
                }
            }
            if (z21 || i49 == 1073741824) {
                i41 = i36;
            }
            u0Var.setMeasuredDimension(View.resolveSizeAndState(Math.max(u0Var.getPaddingRight() + u0Var.getPaddingLeft() + i41, u0Var.getSuggestedMinimumWidth()), i3, i51), resolveSizeAndState);
            if (z20) {
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(u0Var.getMeasuredWidth(), 1073741824);
                int i62 = 0;
                while (i62 < virtualChildCount) {
                    View childAt5 = u0Var.getChildAt(i62);
                    if (childAt5.getVisibility() != 8) {
                        t0 t0Var5 = (t0) childAt5.getLayoutParams();
                        if (((LinearLayout.LayoutParams) t0Var5).width == -1) {
                            int i63 = ((LinearLayout.LayoutParams) t0Var5).height;
                            ((LinearLayout.LayoutParams) t0Var5).height = childAt5.getMeasuredHeight();
                            u0Var.measureChildWithMargins(childAt5, makeMeasureSpec, 0, i52, 0);
                            ((LinearLayout.LayoutParams) t0Var5).height = i63;
                        }
                    }
                    i62++;
                    i52 = i10;
                }
                return;
            }
            return;
        }
        int i64 = i3;
        u0Var.f6192t = 0;
        int virtualChildCount2 = u0Var.getVirtualChildCount();
        int mode3 = View.MeasureSpec.getMode(i64);
        int mode4 = View.MeasureSpec.getMode(i10);
        if (u0Var.f6195w == null || u0Var.f6196x == null) {
            u0Var.f6195w = new int[4];
            u0Var.f6196x = new int[4];
        }
        int[] iArr3 = u0Var.f6195w;
        int[] iArr4 = u0Var.f6196x;
        iArr3[3] = -1;
        char c10 = 2;
        iArr3[2] = -1;
        iArr3[1] = -1;
        iArr3[0] = -1;
        iArr4[3] = -1;
        iArr4[2] = -1;
        iArr4[1] = -1;
        iArr4[0] = -1;
        boolean z25 = u0Var.f6187d;
        boolean z26 = u0Var.f6194v;
        boolean z27 = mode3 == 1073741824;
        float f13 = 0.0f;
        boolean z28 = true;
        int i65 = 0;
        int i66 = 0;
        int i67 = 0;
        int i68 = 0;
        int i69 = 0;
        int i70 = 0;
        boolean z29 = false;
        boolean z30 = false;
        while (i65 < virtualChildCount2) {
            char c11 = c10;
            View childAt6 = u0Var.getChildAt(i65);
            if (childAt6 == null) {
                u0Var.f6192t = u0Var.f6192t;
                i20 = i65;
                i24 = i67;
                iArr2 = iArr3;
                iArr = iArr4;
                z11 = z25;
                z12 = z26;
            } else {
                int i71 = i66;
                if (childAt6.getVisibility() == 8) {
                    i64 = i3;
                    i20 = i65;
                    i24 = i67;
                    iArr = iArr4;
                    z11 = z25;
                    z12 = z26;
                    i66 = i71;
                    iArr2 = iArr3;
                } else {
                    if (u0Var.g(i65)) {
                        u0Var.f6192t += u0Var.f6198z;
                    }
                    t0 t0Var6 = (t0) childAt6.getLayoutParams();
                    float f14 = ((LinearLayout.LayoutParams) t0Var6).weight;
                    f13 += f14;
                    int i72 = i65;
                    if (mode3 == 1073741824 && ((LinearLayout.LayoutParams) t0Var6).width == 0 && f14 > 0.0f) {
                        int i73 = u0Var.f6192t;
                        int i74 = ((LinearLayout.LayoutParams) t0Var6).leftMargin;
                        if (z27) {
                            u0Var.f6192t = i74 + ((LinearLayout.LayoutParams) t0Var6).rightMargin + i73;
                        } else {
                            u0Var.f6192t = Math.max(i73, i73 + i74 + ((LinearLayout.LayoutParams) t0Var6).rightMargin);
                        }
                        if (z25) {
                            int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 0);
                            childAt6.measure(makeMeasureSpec2, makeMeasureSpec2);
                            view = childAt6;
                            z11 = z25;
                            z12 = z26;
                            i21 = i71;
                            i20 = i72;
                            t0Var = t0Var6;
                            iArr2 = iArr3;
                            iArr = iArr4;
                            i64 = i3;
                            i22 = i67;
                            i19 = i68;
                        } else {
                            view = childAt6;
                            z11 = z25;
                            z12 = z26;
                            z30 = true;
                            i21 = i71;
                            i20 = i72;
                            i23 = 1073741824;
                            t0Var = t0Var6;
                            iArr2 = iArr3;
                            iArr = iArr4;
                            i64 = i3;
                            i22 = i67;
                            i19 = i68;
                            if (mode4 == i23 && ((LinearLayout.LayoutParams) t0Var).height == -1) {
                                z13 = true;
                                z29 = true;
                            } else {
                                z13 = false;
                            }
                            int i75 = ((LinearLayout.LayoutParams) t0Var).topMargin + ((LinearLayout.LayoutParams) t0Var).bottomMargin;
                            int measuredHeight3 = view.getMeasuredHeight() + i75;
                            i70 = View.combineMeasuredStates(i70, view.getMeasuredState());
                            if (z11) {
                                z14 = z13;
                            } else {
                                int baseline2 = view.getBaseline();
                                z14 = z13;
                                if (baseline2 != -1) {
                                    int i76 = ((LinearLayout.LayoutParams) t0Var).gravity;
                                    if (i76 < 0) {
                                        i76 = u0Var.f6191s;
                                    }
                                    int i77 = (((i76 & 112) >> 4) & (-2)) >> 1;
                                    iArr2[i77] = Math.max(iArr2[i77], baseline2);
                                    iArr[i77] = Math.max(iArr[i77], measuredHeight3 - baseline2);
                                }
                            }
                            int max2 = Math.max(i21, measuredHeight3);
                            boolean z31 = !z28 && ((LinearLayout.LayoutParams) t0Var).height == -1;
                            if (((LinearLayout.LayoutParams) t0Var).weight <= 0.0f) {
                                if (!z14) {
                                    i75 = measuredHeight3;
                                }
                                i68 = Math.max(i19, i75);
                                max = i22;
                            } else {
                                if (!z14) {
                                    i75 = measuredHeight3;
                                }
                                max = Math.max(i22, i75);
                                i68 = i19;
                            }
                            int i78 = max;
                            i66 = max2;
                            i24 = i78;
                            z28 = z31;
                        }
                    } else {
                        if (((LinearLayout.LayoutParams) t0Var6).width != 0 || f14 <= 0.0f) {
                            i18 = Integer.MIN_VALUE;
                        } else {
                            ((LinearLayout.LayoutParams) t0Var6).width = -2;
                            i18 = 0;
                        }
                        iArr = iArr4;
                        i19 = i68;
                        i20 = i72;
                        z11 = z25;
                        z12 = z26;
                        int i79 = i18;
                        t0Var = t0Var6;
                        i21 = i71;
                        i64 = i3;
                        iArr2 = iArr3;
                        i22 = i67;
                        u0Var.measureChildWithMargins(childAt6, i64, f13 == 0.0f ? u0Var.f6192t : 0, i10, 0);
                        if (i79 != Integer.MIN_VALUE) {
                            ((LinearLayout.LayoutParams) t0Var).width = i79;
                        }
                        int measuredWidth3 = childAt6.getMeasuredWidth();
                        int i80 = u0Var.f6192t;
                        int i81 = ((LinearLayout.LayoutParams) t0Var).leftMargin;
                        if (z27) {
                            view = childAt6;
                            u0Var.f6192t = i81 + measuredWidth3 + ((LinearLayout.LayoutParams) t0Var).rightMargin + i80;
                        } else {
                            view = childAt6;
                            u0Var.f6192t = Math.max(i80, i80 + measuredWidth3 + i81 + ((LinearLayout.LayoutParams) t0Var).rightMargin);
                        }
                        if (z12) {
                            i69 = Math.max(measuredWidth3, i69);
                        }
                    }
                    i23 = 1073741824;
                    if (mode4 == i23) {
                    }
                    z13 = false;
                    int i752 = ((LinearLayout.LayoutParams) t0Var).topMargin + ((LinearLayout.LayoutParams) t0Var).bottomMargin;
                    int measuredHeight32 = view.getMeasuredHeight() + i752;
                    i70 = View.combineMeasuredStates(i70, view.getMeasuredState());
                    if (z11) {
                    }
                    int max22 = Math.max(i21, measuredHeight32);
                    if (z28) {
                    }
                    if (((LinearLayout.LayoutParams) t0Var).weight <= 0.0f) {
                    }
                    int i782 = max;
                    i66 = max22;
                    i24 = i782;
                    z28 = z31;
                }
            }
            i67 = i24;
            i65 = i20 + 1;
            c10 = c11;
            iArr3 = iArr2;
            iArr4 = iArr;
            z25 = z11;
            z26 = z12;
        }
        int[] iArr5 = iArr3;
        int[] iArr6 = iArr4;
        char c12 = c10;
        boolean z32 = z25;
        boolean z33 = z26;
        int i82 = i66;
        int i83 = i67;
        int i84 = i68;
        if (u0Var.f6192t > 0 && u0Var.g(virtualChildCount2)) {
            u0Var.f6192t += u0Var.f6198z;
        }
        int i85 = iArr5[1];
        int max3 = (i85 == -1 && iArr5[0] == -1 && iArr5[c12] == -1 && iArr5[3] == -1) ? i82 : Math.max(i82, Math.max(iArr6[3], Math.max(iArr6[0], Math.max(iArr6[1], iArr6[c12]))) + Math.max(iArr5[3], Math.max(iArr5[0], Math.max(i85, iArr5[c12]))));
        if (z33 && (mode3 == Integer.MIN_VALUE || mode3 == 0)) {
            u0Var.f6192t = 0;
            for (int i86 = 0; i86 < virtualChildCount2; i86++) {
                View childAt7 = u0Var.getChildAt(i86);
                if (childAt7 == null) {
                    u0Var.f6192t = u0Var.f6192t;
                } else if (childAt7.getVisibility() != 8) {
                    t0 t0Var7 = (t0) childAt7.getLayoutParams();
                    int i87 = u0Var.f6192t;
                    if (z27) {
                        u0Var.f6192t = ((LinearLayout.LayoutParams) t0Var7).leftMargin + i69 + ((LinearLayout.LayoutParams) t0Var7).rightMargin + i87;
                    } else {
                        u0Var.f6192t = Math.max(i87, i87 + i69 + ((LinearLayout.LayoutParams) t0Var7).leftMargin + ((LinearLayout.LayoutParams) t0Var7).rightMargin);
                    }
                }
            }
        }
        int paddingRight = u0Var.getPaddingRight() + u0Var.getPaddingLeft() + u0Var.f6192t;
        u0Var.f6192t = paddingRight;
        int resolveSizeAndState2 = View.resolveSizeAndState(Math.max(paddingRight, u0Var.getSuggestedMinimumWidth()), i64, 0);
        int i88 = (resolveSizeAndState2 & 16777215) - u0Var.f6192t;
        if (z30 || (i88 != 0 && f13 > 0.0f)) {
            float f15 = u0Var.f6193u;
            if (f15 > 0.0f) {
                f13 = f15;
            }
            iArr5[3] = -1;
            iArr5[c12] = -1;
            iArr5[1] = -1;
            iArr5[0] = -1;
            iArr6[3] = -1;
            iArr6[c12] = -1;
            iArr6[1] = -1;
            iArr6[0] = -1;
            u0Var.f6192t = 0;
            max3 = -1;
            int i89 = 0;
            while (i89 < virtualChildCount2) {
                View childAt8 = u0Var.getChildAt(i89);
                if (childAt8 == null || childAt8.getVisibility() == 8) {
                    i15 = resolveSizeAndState2;
                } else {
                    t0 t0Var8 = (t0) childAt8.getLayoutParams();
                    float f16 = ((LinearLayout.LayoutParams) t0Var8).weight;
                    if (f16 > 0.0f) {
                        int i90 = (int) ((i88 * f16) / f13);
                        f13 -= f16;
                        i88 -= i90;
                        i15 = resolveSizeAndState2;
                        int childMeasureSpec2 = ViewGroup.getChildMeasureSpec(i10, u0Var.getPaddingBottom() + u0Var.getPaddingTop() + ((LinearLayout.LayoutParams) t0Var8).topMargin + ((LinearLayout.LayoutParams) t0Var8).bottomMargin, ((LinearLayout.LayoutParams) t0Var8).height);
                        if (((LinearLayout.LayoutParams) t0Var8).width == 0) {
                            i17 = 1073741824;
                            if (mode3 == 1073741824) {
                                if (i90 <= 0) {
                                    i90 = 0;
                                }
                                childAt8.measure(View.MeasureSpec.makeMeasureSpec(i90, 1073741824), childMeasureSpec2);
                                i70 = View.combineMeasuredStates(i70, childAt8.getMeasuredState() & (-16777216));
                            }
                        } else {
                            i17 = 1073741824;
                        }
                        int measuredWidth4 = childAt8.getMeasuredWidth() + i90;
                        if (measuredWidth4 < 0) {
                            measuredWidth4 = 0;
                        }
                        childAt8.measure(View.MeasureSpec.makeMeasureSpec(measuredWidth4, i17), childMeasureSpec2);
                        i70 = View.combineMeasuredStates(i70, childAt8.getMeasuredState() & (-16777216));
                    } else {
                        i15 = resolveSizeAndState2;
                    }
                    int i91 = u0Var.f6192t;
                    if (z27) {
                        u0Var.f6192t = childAt8.getMeasuredWidth() + ((LinearLayout.LayoutParams) t0Var8).leftMargin + ((LinearLayout.LayoutParams) t0Var8).rightMargin + i91;
                    } else {
                        u0Var.f6192t = Math.max(i91, childAt8.getMeasuredWidth() + i91 + ((LinearLayout.LayoutParams) t0Var8).leftMargin + ((LinearLayout.LayoutParams) t0Var8).rightMargin);
                    }
                    boolean z34 = mode4 != 1073741824 && ((LinearLayout.LayoutParams) t0Var8).height == -1;
                    int i92 = ((LinearLayout.LayoutParams) t0Var8).topMargin + ((LinearLayout.LayoutParams) t0Var8).bottomMargin;
                    int measuredHeight4 = childAt8.getMeasuredHeight() + i92;
                    max3 = Math.max(max3, measuredHeight4);
                    if (!z34) {
                        i92 = measuredHeight4;
                    }
                    int max4 = Math.max(i83, i92);
                    if (z28) {
                        i16 = -1;
                        if (((LinearLayout.LayoutParams) t0Var8).height == -1) {
                            z10 = true;
                            if (!z32 && (baseline = childAt8.getBaseline()) != i16) {
                                int i93 = ((LinearLayout.LayoutParams) t0Var8).gravity;
                                if (i93 < 0) {
                                    i93 = u0Var.f6191s;
                                }
                                int i94 = (((i93 & 112) >> 4) & (-2)) >> 1;
                                iArr5[i94] = Math.max(iArr5[i94], baseline);
                                iArr6[i94] = Math.max(iArr6[i94], measuredHeight4 - baseline);
                            }
                            z28 = z10;
                            i83 = max4;
                        }
                    } else {
                        i16 = -1;
                    }
                    z10 = false;
                    if (!z32) {
                    }
                    z28 = z10;
                    i83 = max4;
                }
                i89++;
                resolveSizeAndState2 = i15;
            }
            i11 = resolveSizeAndState2;
            i12 = -16777216;
            u0Var.f6192t = u0Var.getPaddingRight() + u0Var.getPaddingLeft() + u0Var.f6192t;
            int i95 = iArr5[1];
            if (i95 == -1 && iArr5[0] == -1 && iArr5[c12] == -1 && iArr5[3] == -1) {
                i13 = 0;
            } else {
                i13 = 0;
                max3 = Math.max(max3, Math.max(iArr6[3], Math.max(iArr6[0], Math.max(iArr6[1], iArr6[c12]))) + Math.max(iArr5[3], Math.max(iArr5[0], Math.max(i95, iArr5[c12]))));
            }
            i14 = i83;
        } else {
            i14 = Math.max(i83, i84);
            if (z33 && mode3 != 1073741824) {
                for (int i96 = 0; i96 < virtualChildCount2; i96++) {
                    View childAt9 = u0Var.getChildAt(i96);
                    if (childAt9 != null && childAt9.getVisibility() != 8 && ((LinearLayout.LayoutParams) ((t0) childAt9.getLayoutParams())).weight > 0.0f) {
                        childAt9.measure(View.MeasureSpec.makeMeasureSpec(i69, 1073741824), View.MeasureSpec.makeMeasureSpec(childAt9.getMeasuredHeight(), 1073741824));
                    }
                }
            }
            i11 = resolveSizeAndState2;
            i12 = -16777216;
            i13 = 0;
        }
        if (!z28 && mode4 != 1073741824) {
            max3 = i14;
        }
        u0Var.setMeasuredDimension(i11 | (i70 & i12), View.resolveSizeAndState(Math.max(u0Var.getPaddingBottom() + u0Var.getPaddingTop() + max3, u0Var.getSuggestedMinimumHeight()), i10, i70 << 16));
        if (z29) {
            int makeMeasureSpec3 = View.MeasureSpec.makeMeasureSpec(u0Var.getMeasuredHeight(), 1073741824);
            int i97 = i13;
            while (i97 < virtualChildCount2) {
                View childAt10 = u0Var.getChildAt(i97);
                if (childAt10.getVisibility() != 8) {
                    t0 t0Var9 = (t0) childAt10.getLayoutParams();
                    if (((LinearLayout.LayoutParams) t0Var9).height == -1) {
                        int i98 = ((LinearLayout.LayoutParams) t0Var9).width;
                        ((LinearLayout.LayoutParams) t0Var9).width = childAt10.getMeasuredWidth();
                        u0Var.measureChildWithMargins(childAt10, i64, 0, makeMeasureSpec3, 0);
                        ((LinearLayout.LayoutParams) t0Var9).width = i98;
                    }
                }
                i97++;
                u0Var = this;
                i64 = i3;
            }
        }
    }

    public void setBaselineAligned(boolean z10) {
        this.f6187d = z10;
    }

    public void setBaselineAlignedChildIndex(int i3) {
        if (i3 >= 0 && i3 < getChildCount()) {
            this.f6188e = i3;
            return;
        }
        throw new IllegalArgumentException("base aligned child index out of range (0, " + getChildCount() + ")");
    }

    public void setDividerDrawable(Drawable drawable) {
        if (drawable == this.f6197y) {
            return;
        }
        this.f6197y = drawable;
        if (drawable != null) {
            this.f6198z = drawable.getIntrinsicWidth();
            this.A = drawable.getIntrinsicHeight();
        } else {
            this.f6198z = 0;
            this.A = 0;
        }
        setWillNotDraw(drawable == null);
        requestLayout();
    }

    public void setDividerPadding(int i3) {
        this.C = i3;
    }

    public void setGravity(int i3) {
        if (this.f6191s != i3) {
            if ((8388615 & i3) == 0) {
                i3 |= 8388611;
            }
            if ((i3 & 112) == 0) {
                i3 |= 48;
            }
            this.f6191s = i3;
            requestLayout();
        }
    }

    public void setHorizontalGravity(int i3) {
        int i10 = i3 & 8388615;
        int i11 = this.f6191s;
        if ((8388615 & i11) != i10) {
            this.f6191s = i10 | ((-8388616) & i11);
            requestLayout();
        }
    }

    public void setMeasureWithLargestChildEnabled(boolean z10) {
        this.f6194v = z10;
    }

    public void setOrientation(int i3) {
        if (this.f6190r != i3) {
            this.f6190r = i3;
            requestLayout();
        }
    }

    public void setShowDividers(int i3) {
        if (i3 != this.B) {
            requestLayout();
        }
        this.B = i3;
    }

    public void setVerticalGravity(int i3) {
        int i10 = i3 & 112;
        int i11 = this.f6191s;
        if ((i11 & 112) != i10) {
            this.f6191s = i10 | (i11 & (-113));
            requestLayout();
        }
    }

    public void setWeightSum(float f3) {
        this.f6193u = Math.max(0.0f, f3);
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }
}
