package n;

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
import g.AbstractC0122a;

/* loaded from: classes.dex */
public abstract class A0 extends ViewGroup {

    /* renamed from: a, reason: collision with root package name */
    public boolean f3426a;

    /* renamed from: b, reason: collision with root package name */
    public int f3427b;

    /* renamed from: c, reason: collision with root package name */
    public int f3428c;

    /* renamed from: d, reason: collision with root package name */
    public int f3429d;
    public int e;

    /* renamed from: f, reason: collision with root package name */
    public int f3430f;

    /* renamed from: g, reason: collision with root package name */
    public float f3431g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f3432h;
    public int[] i;
    public int[] j;

    /* renamed from: k, reason: collision with root package name */
    public Drawable f3433k;

    /* renamed from: l, reason: collision with root package name */
    public int f3434l;

    /* renamed from: m, reason: collision with root package name */
    public int f3435m;

    /* renamed from: n, reason: collision with root package name */
    public int f3436n;

    /* renamed from: o, reason: collision with root package name */
    public int f3437o;

    public A0(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.f3426a = true;
        this.f3427b = -1;
        this.f3428c = 0;
        this.e = 8388659;
        int[] iArr = AbstractC0122a.f2705n;
        I0.h r2 = I0.h.r(context, attributeSet, iArr, 0);
        M.P.k(this, context, iArr, attributeSet, (TypedArray) r2.f592c, 0);
        TypedArray typedArray = (TypedArray) r2.f592c;
        int i = typedArray.getInt(1, -1);
        if (i >= 0) {
            setOrientation(i);
        }
        int i2 = typedArray.getInt(0, -1);
        if (i2 >= 0) {
            setGravity(i2);
        }
        boolean z2 = typedArray.getBoolean(2, true);
        if (!z2) {
            setBaselineAligned(z2);
        }
        this.f3431g = typedArray.getFloat(4, -1.0f);
        this.f3427b = typedArray.getInt(3, -1);
        this.f3432h = typedArray.getBoolean(7, false);
        setDividerDrawable(r2.h(5));
        this.f3436n = typedArray.getInt(8, 0);
        this.f3437o = typedArray.getDimensionPixelSize(6, 0);
        r2.t();
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C0313z0;
    }

    public final void d(Canvas canvas, int i) {
        this.f3433k.setBounds(getPaddingLeft() + this.f3437o, i, (getWidth() - getPaddingRight()) - this.f3437o, this.f3435m + i);
        this.f3433k.draw(canvas);
    }

    public final void e(Canvas canvas, int i) {
        this.f3433k.setBounds(i, getPaddingTop() + this.f3437o, this.f3434l + i, (getHeight() - getPaddingBottom()) - this.f3437o);
        this.f3433k.draw(canvas);
    }

    @Override // android.view.ViewGroup
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public C0313z0 generateDefaultLayoutParams() {
        int i = this.f3429d;
        if (i == 0) {
            return new C0313z0(-2, -2);
        }
        if (i == 1) {
            return new C0313z0(-1, -2);
        }
        return null;
    }

    @Override // android.view.ViewGroup
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public C0313z0 generateLayoutParams(AttributeSet attributeSet) {
        return new C0313z0(getContext(), attributeSet);
    }

    @Override // android.view.View
    public int getBaseline() {
        int i;
        if (this.f3427b < 0) {
            return super.getBaseline();
        }
        int childCount = getChildCount();
        int i2 = this.f3427b;
        if (childCount <= i2) {
            throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout set to an index that is out of bounds.");
        }
        View childAt = getChildAt(i2);
        int baseline = childAt.getBaseline();
        if (baseline == -1) {
            if (this.f3427b == 0) {
                return -1;
            }
            throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout points to a View that doesn't know how to get its baseline.");
        }
        int i3 = this.f3428c;
        if (this.f3429d == 1 && (i = this.e & 112) != 48) {
            if (i == 16) {
                i3 += ((((getBottom() - getTop()) - getPaddingTop()) - getPaddingBottom()) - this.f3430f) / 2;
            } else if (i == 80) {
                i3 = ((getBottom() - getTop()) - getPaddingBottom()) - this.f3430f;
            }
        }
        return i3 + ((LinearLayout.LayoutParams) ((C0313z0) childAt.getLayoutParams())).topMargin + baseline;
    }

    public int getBaselineAlignedChildIndex() {
        return this.f3427b;
    }

    public Drawable getDividerDrawable() {
        return this.f3433k;
    }

    public int getDividerPadding() {
        return this.f3437o;
    }

    public int getDividerWidth() {
        return this.f3434l;
    }

    public int getGravity() {
        return this.e;
    }

    public int getOrientation() {
        return this.f3429d;
    }

    public int getShowDividers() {
        return this.f3436n;
    }

    public int getVirtualChildCount() {
        return getChildCount();
    }

    public float getWeightSum() {
        return this.f3431g;
    }

    @Override // android.view.ViewGroup
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public C0313z0 generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C0313z0 ? new C0313z0((C0313z0) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new C0313z0((ViewGroup.MarginLayoutParams) layoutParams) : new C0313z0(layoutParams);
    }

    public final boolean i(int i) {
        if (i == 0) {
            return (this.f3436n & 1) != 0;
        }
        if (i == getChildCount()) {
            return (this.f3436n & 4) != 0;
        }
        if ((this.f3436n & 2) == 0) {
            return false;
        }
        for (int i2 = i - 1; i2 >= 0; i2--) {
            if (getChildAt(i2).getVisibility() != 8) {
                return true;
            }
        }
        return false;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        int right;
        int left;
        int i;
        if (this.f3433k == null) {
            return;
        }
        int i2 = 0;
        if (this.f3429d == 1) {
            int virtualChildCount = getVirtualChildCount();
            while (i2 < virtualChildCount) {
                View childAt = getChildAt(i2);
                if (childAt != null && childAt.getVisibility() != 8 && i(i2)) {
                    d(canvas, (childAt.getTop() - ((LinearLayout.LayoutParams) ((C0313z0) childAt.getLayoutParams())).topMargin) - this.f3435m);
                }
                i2++;
            }
            if (i(virtualChildCount)) {
                View childAt2 = getChildAt(virtualChildCount - 1);
                d(canvas, childAt2 == null ? (getHeight() - getPaddingBottom()) - this.f3435m : childAt2.getBottom() + ((LinearLayout.LayoutParams) ((C0313z0) childAt2.getLayoutParams())).bottomMargin);
                return;
            }
            return;
        }
        int virtualChildCount2 = getVirtualChildCount();
        boolean z2 = n1.f3683a;
        boolean z3 = getLayoutDirection() == 1;
        while (i2 < virtualChildCount2) {
            View childAt3 = getChildAt(i2);
            if (childAt3 != null && childAt3.getVisibility() != 8 && i(i2)) {
                C0313z0 c0313z0 = (C0313z0) childAt3.getLayoutParams();
                e(canvas, z3 ? childAt3.getRight() + ((LinearLayout.LayoutParams) c0313z0).rightMargin : (childAt3.getLeft() - ((LinearLayout.LayoutParams) c0313z0).leftMargin) - this.f3434l);
            }
            i2++;
        }
        if (i(virtualChildCount2)) {
            View childAt4 = getChildAt(virtualChildCount2 - 1);
            if (childAt4 != null) {
                C0313z0 c0313z02 = (C0313z0) childAt4.getLayoutParams();
                if (z3) {
                    left = childAt4.getLeft() - ((LinearLayout.LayoutParams) c0313z02).leftMargin;
                    i = this.f3434l;
                    right = left - i;
                } else {
                    right = childAt4.getRight() + ((LinearLayout.LayoutParams) c0313z02).rightMargin;
                }
            } else if (z3) {
                right = getPaddingLeft();
            } else {
                left = getWidth() - getPaddingRight();
                i = this.f3434l;
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

    /* JADX WARN: Removed duplicated region for block: B:22:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x01a1  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x018f  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onLayout(boolean z2, int i, int i2, int i3, int i4) {
        int i5;
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
        int i19 = 8;
        if (this.f3429d == 1) {
            int paddingLeft = getPaddingLeft();
            int i20 = i3 - i;
            int paddingRight = i20 - getPaddingRight();
            int paddingRight2 = (i20 - paddingLeft) - getPaddingRight();
            int virtualChildCount = getVirtualChildCount();
            int i21 = this.e;
            int i22 = i21 & 112;
            int i23 = 8388615 & i21;
            int paddingTop = i22 != 16 ? i22 != 80 ? getPaddingTop() : ((getPaddingTop() + i4) - i2) - this.f3430f : getPaddingTop() + (((i4 - i2) - this.f3430f) / 2);
            int i24 = 0;
            while (i24 < virtualChildCount) {
                View childAt = getChildAt(i24);
                if (childAt != null && childAt.getVisibility() != i19) {
                    int measuredWidth = childAt.getMeasuredWidth();
                    int measuredHeight = childAt.getMeasuredHeight();
                    C0313z0 c0313z0 = (C0313z0) childAt.getLayoutParams();
                    int i25 = ((LinearLayout.LayoutParams) c0313z0).gravity;
                    if (i25 < 0) {
                        i25 = i23;
                    }
                    int absoluteGravity = Gravity.getAbsoluteGravity(i25, getLayoutDirection()) & 7;
                    if (absoluteGravity == 1) {
                        i16 = ((paddingRight2 - measuredWidth) / 2) + paddingLeft + ((LinearLayout.LayoutParams) c0313z0).leftMargin;
                        i17 = ((LinearLayout.LayoutParams) c0313z0).rightMargin;
                    } else if (absoluteGravity != 5) {
                        i18 = ((LinearLayout.LayoutParams) c0313z0).leftMargin + paddingLeft;
                        if (i(i24)) {
                            paddingTop += this.f3435m;
                        }
                        int i26 = paddingTop + ((LinearLayout.LayoutParams) c0313z0).topMargin;
                        childAt.layout(i18, i26, measuredWidth + i18, i26 + measuredHeight);
                        paddingTop = measuredHeight + ((LinearLayout.LayoutParams) c0313z0).bottomMargin + i26;
                    } else {
                        i16 = paddingRight - measuredWidth;
                        i17 = ((LinearLayout.LayoutParams) c0313z0).rightMargin;
                    }
                    i18 = i16 - i17;
                    if (i(i24)) {
                    }
                    int i262 = paddingTop + ((LinearLayout.LayoutParams) c0313z0).topMargin;
                    childAt.layout(i18, i262, measuredWidth + i18, i262 + measuredHeight);
                    paddingTop = measuredHeight + ((LinearLayout.LayoutParams) c0313z0).bottomMargin + i262;
                }
                i24++;
                i19 = 8;
            }
            return;
        }
        boolean z3 = n1.f3683a;
        boolean z4 = getLayoutDirection() == 1;
        int paddingTop2 = getPaddingTop();
        int i27 = i4 - i2;
        int paddingBottom = i27 - getPaddingBottom();
        int paddingBottom2 = (i27 - paddingTop2) - getPaddingBottom();
        int virtualChildCount2 = getVirtualChildCount();
        int i28 = this.e;
        int i29 = 8388615 & i28;
        int i30 = i28 & 112;
        boolean z5 = this.f3426a;
        int[] iArr = this.i;
        int[] iArr2 = this.j;
        int absoluteGravity2 = Gravity.getAbsoluteGravity(i29, getLayoutDirection());
        int paddingLeft2 = absoluteGravity2 != 1 ? absoluteGravity2 != 5 ? getPaddingLeft() : ((getPaddingLeft() + i3) - i) - this.f3430f : getPaddingLeft() + (((i3 - i) - this.f3430f) / 2);
        if (z4) {
            i6 = virtualChildCount2 - 1;
            i5 = -1;
        } else {
            i5 = 1;
            i6 = 0;
        }
        int i31 = 0;
        while (i31 < virtualChildCount2) {
            int i32 = (i5 * i31) + i6;
            View childAt2 = getChildAt(i32);
            if (childAt2 == null) {
                i7 = i6;
                i8 = i5;
                i9 = virtualChildCount2;
                i10 = i30;
                i11 = 1;
            } else {
                i7 = i6;
                if (childAt2.getVisibility() != 8) {
                    int measuredWidth2 = childAt2.getMeasuredWidth();
                    int measuredHeight2 = childAt2.getMeasuredHeight();
                    C0313z0 c0313z02 = (C0313z0) childAt2.getLayoutParams();
                    i8 = i5;
                    if (z5) {
                        i9 = virtualChildCount2;
                        if (((LinearLayout.LayoutParams) c0313z02).height != -1) {
                            i12 = childAt2.getBaseline();
                            i13 = ((LinearLayout.LayoutParams) c0313z02).gravity;
                            if (i13 < 0) {
                                i13 = i30;
                            }
                            i14 = i13 & 112;
                            i10 = i30;
                            if (i14 != 16) {
                                i15 = ((((paddingBottom2 - measuredHeight2) / 2) + paddingTop2) + ((LinearLayout.LayoutParams) c0313z02).topMargin) - ((LinearLayout.LayoutParams) c0313z02).bottomMargin;
                            } else if (i14 == 48) {
                                i15 = ((LinearLayout.LayoutParams) c0313z02).topMargin + paddingTop2;
                                if (i12 != -1) {
                                    i15 = (iArr[1] - i12) + i15;
                                }
                            } else if (i14 != 80) {
                                i15 = paddingTop2;
                            } else {
                                i15 = (paddingBottom - measuredHeight2) - ((LinearLayout.LayoutParams) c0313z02).bottomMargin;
                                if (i12 != -1) {
                                    i15 -= iArr2[2] - (childAt2.getMeasuredHeight() - i12);
                                }
                            }
                            if (i(i32)) {
                                paddingLeft2 += this.f3434l;
                            }
                            int i33 = paddingLeft2 + ((LinearLayout.LayoutParams) c0313z02).leftMargin;
                            childAt2.layout(i33, i15, i33 + measuredWidth2, i15 + measuredHeight2);
                            paddingLeft2 = measuredWidth2 + ((LinearLayout.LayoutParams) c0313z02).rightMargin + i33;
                        }
                    } else {
                        i9 = virtualChildCount2;
                    }
                    i12 = -1;
                    i13 = ((LinearLayout.LayoutParams) c0313z02).gravity;
                    if (i13 < 0) {
                    }
                    i14 = i13 & 112;
                    i10 = i30;
                    if (i14 != 16) {
                    }
                    if (i(i32)) {
                    }
                    int i332 = paddingLeft2 + ((LinearLayout.LayoutParams) c0313z02).leftMargin;
                    childAt2.layout(i332, i15, i332 + measuredWidth2, i15 + measuredHeight2);
                    paddingLeft2 = measuredWidth2 + ((LinearLayout.LayoutParams) c0313z02).rightMargin + i332;
                } else {
                    i8 = i5;
                    i9 = virtualChildCount2;
                    i10 = i30;
                }
                i11 = 1;
            }
            i31 += i11;
            i6 = i7;
            i5 = i8;
            virtualChildCount2 = i9;
            i30 = i10;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:173:0x02e0, code lost:
    
        if (((android.widget.LinearLayout.LayoutParams) r13).width == (-1)) goto L148;
     */
    /* JADX WARN: Removed duplicated region for block: B:238:0x0550  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x055b  */
    /* JADX WARN: Removed duplicated region for block: B:258:0x0486  */
    /* JADX WARN: Removed duplicated region for block: B:261:0x04b3  */
    /* JADX WARN: Removed duplicated region for block: B:264:0x04c0  */
    /* JADX WARN: Removed duplicated region for block: B:266:0x04de  */
    /* JADX WARN: Removed duplicated region for block: B:267:0x04cc  */
    /* JADX WARN: Removed duplicated region for block: B:268:0x04b8  */
    /* JADX WARN: Removed duplicated region for block: B:269:0x048b  */
    /* JADX WARN: Removed duplicated region for block: B:293:0x05e4  */
    /* JADX WARN: Removed duplicated region for block: B:338:0x0860  */
    /* JADX WARN: Removed duplicated region for block: B:352:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:356:0x0698  */
    /* JADX WARN: Removed duplicated region for block: B:359:0x06b4  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onMeasure(int i, int i2) {
        char c2;
        int i3;
        int max;
        float f2;
        int i4;
        int i5;
        int i6;
        int i7;
        char c3;
        int i8;
        int i9;
        int i10;
        int i11;
        float f3;
        int i12;
        int i13;
        boolean z2;
        int baseline;
        int i14;
        int i15;
        float f4;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        boolean z3;
        boolean z4;
        C0313z0 c0313z0;
        boolean z5;
        int i21;
        boolean z6;
        int i22;
        int i23;
        int baseline2;
        int i24;
        int i25;
        int i26;
        int i27;
        int i28;
        int i29;
        int i30;
        int i31;
        int i32;
        boolean z7;
        C0313z0 c0313z02;
        boolean z8;
        int i33;
        boolean z9;
        int max2;
        int i34 = -2;
        int i35 = 1073741824;
        int i36 = 8;
        int i37 = Integer.MIN_VALUE;
        float f5 = 0.0f;
        boolean z10 = true;
        if (this.f3429d == 1) {
            this.f3430f = 0;
            int virtualChildCount = getVirtualChildCount();
            int mode = View.MeasureSpec.getMode(i);
            int mode2 = View.MeasureSpec.getMode(i2);
            int i38 = this.f3427b;
            boolean z11 = this.f3432h;
            boolean z12 = true;
            int i39 = 0;
            int i40 = 0;
            int i41 = 0;
            boolean z13 = false;
            int i42 = 0;
            int i43 = 0;
            int i44 = 0;
            boolean z14 = false;
            float f6 = 0.0f;
            while (i39 < virtualChildCount) {
                View childAt = getChildAt(i39);
                if (childAt == null) {
                    this.f3430f = this.f3430f;
                } else if (childAt.getVisibility() != i36) {
                    if (i(i39)) {
                        this.f3430f += this.f3435m;
                    }
                    C0313z0 c0313z03 = (C0313z0) childAt.getLayoutParams();
                    float f7 = ((LinearLayout.LayoutParams) c0313z03).weight;
                    f6 += f7;
                    if (mode2 == i35 && ((LinearLayout.LayoutParams) c0313z03).height == 0 && f7 > f5) {
                        int i45 = this.f3430f;
                        this.f3430f = Math.max(i45, ((LinearLayout.LayoutParams) c0313z03).topMargin + i45 + ((LinearLayout.LayoutParams) c0313z03).bottomMargin);
                        i29 = i38;
                        i30 = mode2;
                        i31 = mode;
                        i32 = virtualChildCount;
                        c0313z02 = c0313z03;
                        z8 = true;
                        z7 = true;
                    } else {
                        if (((LinearLayout.LayoutParams) c0313z03).height != 0 || f7 <= f5) {
                            i28 = i37;
                        } else {
                            ((LinearLayout.LayoutParams) c0313z03).height = i34;
                            i28 = 0;
                        }
                        int i46 = f6 == f5 ? this.f3430f : 0;
                        i29 = i38;
                        i30 = mode2;
                        i31 = mode;
                        i32 = virtualChildCount;
                        z7 = true;
                        c0313z02 = c0313z03;
                        measureChildWithMargins(childAt, i, 0, i2, i46);
                        if (i28 != i37) {
                            ((LinearLayout.LayoutParams) c0313z02).height = i28;
                        }
                        int measuredHeight = childAt.getMeasuredHeight();
                        int i47 = this.f3430f;
                        this.f3430f = Math.max(i47, i47 + measuredHeight + ((LinearLayout.LayoutParams) c0313z02).topMargin + ((LinearLayout.LayoutParams) c0313z02).bottomMargin);
                        int i48 = i42;
                        if (z11) {
                            i42 = Math.max(measuredHeight, i48);
                        }
                        z8 = z13;
                    }
                    if (i29 >= 0 && i29 == i39 + 1) {
                        this.f3428c = this.f3430f;
                    }
                    if (i39 < i29 && ((LinearLayout.LayoutParams) c0313z02).weight > 0.0f) {
                        throw new RuntimeException("A child of LinearLayout with index less than mBaselineAlignedChildIndex has weight > 0, which won't work.  Either remove the weight, or don't set mBaselineAlignedChildIndex.");
                    }
                    i33 = i31;
                    if (i33 == 1073741824 || ((LinearLayout.LayoutParams) c0313z02).width != -1) {
                        z9 = false;
                    } else {
                        z9 = z7;
                        z14 = z9;
                    }
                    int i49 = ((LinearLayout.LayoutParams) c0313z02).leftMargin + ((LinearLayout.LayoutParams) c0313z02).rightMargin;
                    int measuredWidth = childAt.getMeasuredWidth() + i49;
                    max2 = Math.max(i43, measuredWidth);
                    int combineMeasuredStates = View.combineMeasuredStates(i44, childAt.getMeasuredState());
                    boolean z15 = (z12 && ((LinearLayout.LayoutParams) c0313z02).width == -1) ? z7 : false;
                    if (((LinearLayout.LayoutParams) c0313z02).weight > 0.0f) {
                        if (!z9) {
                            i49 = measuredWidth;
                        }
                        i41 = Math.max(i41, i49);
                    } else {
                        int i50 = i41;
                        if (!z9) {
                            i49 = measuredWidth;
                        }
                        i40 = Math.max(i40, i49);
                        i41 = i50;
                    }
                    z13 = z8;
                    i44 = combineMeasuredStates;
                    z12 = z15;
                    i39++;
                    mode = i33;
                    i43 = max2;
                    i38 = i29;
                    z10 = z7;
                    mode2 = i30;
                    virtualChildCount = i32;
                    i34 = -2;
                    i35 = 1073741824;
                    i36 = 8;
                    i37 = Integer.MIN_VALUE;
                    f5 = 0.0f;
                }
                i29 = i38;
                i30 = mode2;
                i33 = mode;
                i32 = virtualChildCount;
                max2 = i43;
                z7 = true;
                i39++;
                mode = i33;
                i43 = max2;
                i38 = i29;
                z10 = z7;
                mode2 = i30;
                virtualChildCount = i32;
                i34 = -2;
                i35 = 1073741824;
                i36 = 8;
                i37 = Integer.MIN_VALUE;
                f5 = 0.0f;
            }
            int i51 = mode2;
            int i52 = mode;
            int i53 = virtualChildCount;
            boolean z16 = z10;
            int i54 = i40;
            int i55 = i41;
            int i56 = i42;
            int i57 = i43;
            int i58 = i44;
            if (this.f3430f > 0 && i(i53)) {
                this.f3430f += this.f3435m;
            }
            int i59 = i51;
            if (z11 && (i59 == Integer.MIN_VALUE || i59 == 0)) {
                this.f3430f = 0;
                for (int i60 = 0; i60 < i53; i60++) {
                    View childAt2 = getChildAt(i60);
                    if (childAt2 == null) {
                        this.f3430f = this.f3430f;
                    } else if (childAt2.getVisibility() != 8) {
                        C0313z0 c0313z04 = (C0313z0) childAt2.getLayoutParams();
                        int i61 = this.f3430f;
                        this.f3430f = Math.max(i61, i61 + i56 + ((LinearLayout.LayoutParams) c0313z04).topMargin + ((LinearLayout.LayoutParams) c0313z04).bottomMargin);
                    }
                }
            }
            int paddingBottom = getPaddingBottom() + getPaddingTop() + this.f3430f;
            this.f3430f = paddingBottom;
            int resolveSizeAndState = View.resolveSizeAndState(Math.max(paddingBottom, getSuggestedMinimumHeight()), i2, 0);
            int i62 = (16777215 & resolveSizeAndState) - this.f3430f;
            if (z13 || (i62 != 0 && f6 > 0.0f)) {
                float f8 = this.f3431g;
                if (f8 > 0.0f) {
                    f6 = f8;
                }
                this.f3430f = 0;
                int i63 = 0;
                while (i63 < i53) {
                    View childAt3 = getChildAt(i63);
                    if (childAt3.getVisibility() == 8) {
                        i25 = i59;
                    } else {
                        C0313z0 c0313z05 = (C0313z0) childAt3.getLayoutParams();
                        float f9 = ((LinearLayout.LayoutParams) c0313z05).weight;
                        if (f9 > 0.0f) {
                            int i64 = (int) ((i62 * f9) / f6);
                            f6 -= f9;
                            int i65 = i62 - i64;
                            int childMeasureSpec = ViewGroup.getChildMeasureSpec(i, getPaddingRight() + getPaddingLeft() + ((LinearLayout.LayoutParams) c0313z05).leftMargin + ((LinearLayout.LayoutParams) c0313z05).rightMargin, ((LinearLayout.LayoutParams) c0313z05).width);
                            if (((LinearLayout.LayoutParams) c0313z05).height == 0) {
                                i27 = 1073741824;
                                if (i59 == 1073741824) {
                                    if (i64 <= 0) {
                                        i64 = 0;
                                    }
                                    childAt3.measure(childMeasureSpec, View.MeasureSpec.makeMeasureSpec(i64, 1073741824));
                                    i58 = View.combineMeasuredStates(i58, childAt3.getMeasuredState() & (-256));
                                    i62 = i65;
                                }
                            } else {
                                i27 = 1073741824;
                            }
                            int measuredHeight2 = childAt3.getMeasuredHeight() + i64;
                            if (measuredHeight2 < 0) {
                                measuredHeight2 = 0;
                            }
                            childAt3.measure(childMeasureSpec, View.MeasureSpec.makeMeasureSpec(measuredHeight2, i27));
                            i58 = View.combineMeasuredStates(i58, childAt3.getMeasuredState() & (-256));
                            i62 = i65;
                        }
                        int i66 = ((LinearLayout.LayoutParams) c0313z05).leftMargin + ((LinearLayout.LayoutParams) c0313z05).rightMargin;
                        int measuredWidth2 = childAt3.getMeasuredWidth() + i66;
                        int max3 = Math.max(i57, measuredWidth2);
                        if (i52 != 1073741824) {
                            i25 = i59;
                            i26 = -1;
                        } else {
                            i25 = i59;
                            i26 = -1;
                        }
                        i66 = measuredWidth2;
                        i54 = Math.max(i54, i66);
                        boolean z17 = (z12 && ((LinearLayout.LayoutParams) c0313z05).width == i26) ? z16 : false;
                        int i67 = this.f3430f;
                        this.f3430f = Math.max(i67, childAt3.getMeasuredHeight() + i67 + ((LinearLayout.LayoutParams) c0313z05).topMargin + ((LinearLayout.LayoutParams) c0313z05).bottomMargin);
                        z12 = z17;
                        i57 = max3;
                    }
                    i63++;
                    i59 = i25;
                }
                this.f3430f = getPaddingBottom() + getPaddingTop() + this.f3430f;
            } else {
                i54 = Math.max(i54, i55);
                if (z11 && i59 != 1073741824) {
                    for (int i68 = 0; i68 < i53; i68++) {
                        View childAt4 = getChildAt(i68);
                        if (childAt4 != null && childAt4.getVisibility() != 8 && ((LinearLayout.LayoutParams) ((C0313z0) childAt4.getLayoutParams())).weight > 0.0f) {
                            childAt4.measure(View.MeasureSpec.makeMeasureSpec(childAt4.getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(i56, 1073741824));
                        }
                    }
                }
            }
            int i69 = i57;
            if (z12 || i52 == 1073741824) {
                i54 = i69;
            }
            setMeasuredDimension(View.resolveSizeAndState(Math.max(getPaddingRight() + getPaddingLeft() + i54, getSuggestedMinimumWidth()), i, i58), resolveSizeAndState);
            if (z14) {
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824);
                for (int i70 = 0; i70 < i53; i70++) {
                    View childAt5 = getChildAt(i70);
                    if (childAt5.getVisibility() != 8) {
                        C0313z0 c0313z06 = (C0313z0) childAt5.getLayoutParams();
                        if (((LinearLayout.LayoutParams) c0313z06).width == -1) {
                            int i71 = ((LinearLayout.LayoutParams) c0313z06).height;
                            ((LinearLayout.LayoutParams) c0313z06).height = childAt5.getMeasuredHeight();
                            measureChildWithMargins(childAt5, makeMeasureSpec, 0, i2, 0);
                            ((LinearLayout.LayoutParams) c0313z06).height = i71;
                        }
                    }
                }
                return;
            }
            return;
        }
        this.f3430f = 0;
        int virtualChildCount2 = getVirtualChildCount();
        int mode3 = View.MeasureSpec.getMode(i);
        int mode4 = View.MeasureSpec.getMode(i2);
        if (this.i == null || this.j == null) {
            this.i = new int[4];
            this.j = new int[4];
        }
        int[] iArr = this.i;
        int[] iArr2 = this.j;
        iArr[3] = -1;
        iArr[2] = -1;
        iArr[1] = -1;
        iArr[0] = -1;
        iArr2[3] = -1;
        iArr2[2] = -1;
        iArr2[1] = -1;
        iArr2[0] = -1;
        boolean z18 = this.f3426a;
        boolean z19 = this.f3432h;
        boolean z20 = mode3 == 1073741824;
        boolean z21 = true;
        int i72 = 0;
        float f10 = 0.0f;
        int i73 = 0;
        int i74 = 0;
        int i75 = 0;
        int i76 = 0;
        int i77 = 0;
        boolean z22 = false;
        boolean z23 = false;
        while (i74 < virtualChildCount2) {
            View childAt6 = getChildAt(i74);
            if (childAt6 == null) {
                this.f3430f = this.f3430f;
                i20 = i74;
                z3 = z19;
                z4 = z18;
            } else {
                int i78 = i72;
                int i79 = i73;
                if (childAt6.getVisibility() == 8) {
                    z4 = z18;
                    i72 = i78;
                    i73 = i79;
                    i20 = i74;
                    z3 = z19;
                } else {
                    if (i(i74)) {
                        this.f3430f += this.f3434l;
                    }
                    C0313z0 c0313z07 = (C0313z0) childAt6.getLayoutParams();
                    float f11 = ((LinearLayout.LayoutParams) c0313z07).weight;
                    float f12 = f10 + f11;
                    if (mode3 == 1073741824 && ((LinearLayout.LayoutParams) c0313z07).width == 0 && f11 > 0.0f) {
                        if (z20) {
                            i24 = i74;
                            this.f3430f = ((LinearLayout.LayoutParams) c0313z07).leftMargin + ((LinearLayout.LayoutParams) c0313z07).rightMargin + this.f3430f;
                        } else {
                            i24 = i74;
                            int i80 = this.f3430f;
                            this.f3430f = Math.max(i80, ((LinearLayout.LayoutParams) c0313z07).leftMargin + i80 + ((LinearLayout.LayoutParams) c0313z07).rightMargin);
                        }
                        if (z18) {
                            int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 0);
                            childAt6.measure(makeMeasureSpec2, makeMeasureSpec2);
                            c0313z0 = c0313z07;
                            i17 = i78;
                            i18 = i79;
                            i20 = i24;
                            z3 = z19;
                            z4 = z18;
                        } else {
                            c0313z0 = c0313z07;
                            i17 = i78;
                            i18 = i79;
                            i20 = i24;
                            i21 = 1073741824;
                            z3 = z19;
                            z4 = z18;
                            z5 = true;
                            if (mode4 == i21 && ((LinearLayout.LayoutParams) c0313z0).height == -1) {
                                z6 = true;
                                z23 = true;
                            } else {
                                z6 = false;
                            }
                            i22 = ((LinearLayout.LayoutParams) c0313z0).topMargin + ((LinearLayout.LayoutParams) c0313z0).bottomMargin;
                            int measuredHeight3 = childAt6.getMeasuredHeight() + i22;
                            int combineMeasuredStates2 = View.combineMeasuredStates(i75, childAt6.getMeasuredState());
                            if (z4 || (baseline2 = childAt6.getBaseline()) == -1) {
                                i23 = i22;
                            } else {
                                int i81 = ((LinearLayout.LayoutParams) c0313z0).gravity;
                                if (i81 < 0) {
                                    i81 = this.e;
                                }
                                int i82 = (((i81 & 112) >> 4) & (-2)) >> 1;
                                i23 = i22;
                                iArr[i82] = Math.max(iArr[i82], baseline2);
                                iArr2[i82] = Math.max(iArr2[i82], measuredHeight3 - baseline2);
                            }
                            int max4 = Math.max(i18, measuredHeight3);
                            boolean z24 = !z21 && ((LinearLayout.LayoutParams) c0313z0).height == -1;
                            if (((LinearLayout.LayoutParams) c0313z0).weight <= 0.0f) {
                                if (z6) {
                                    measuredHeight3 = i23;
                                }
                                i77 = Math.max(i77, measuredHeight3);
                                i72 = i17;
                            } else {
                                if (z6) {
                                    measuredHeight3 = i23;
                                }
                                i72 = Math.max(i17, measuredHeight3);
                            }
                            i73 = max4;
                            i75 = combineMeasuredStates2;
                            z22 = z5;
                            z21 = z24;
                            f10 = f12;
                        }
                    } else {
                        int i83 = i74;
                        if (((LinearLayout.LayoutParams) c0313z07).width == 0) {
                            f4 = 0.0f;
                            if (f11 > 0.0f) {
                                ((LinearLayout.LayoutParams) c0313z07).width = -2;
                                i16 = 0;
                                i17 = i78;
                                i18 = i79;
                                i19 = i16;
                                i20 = i83;
                                z3 = z19;
                                z4 = z18;
                                measureChildWithMargins(childAt6, i, f12 != f4 ? this.f3430f : 0, i2, 0);
                                if (i19 == Integer.MIN_VALUE) {
                                    c0313z0 = c0313z07;
                                    ((LinearLayout.LayoutParams) c0313z0).width = i19;
                                } else {
                                    c0313z0 = c0313z07;
                                }
                                int measuredWidth3 = childAt6.getMeasuredWidth();
                                if (z20) {
                                    int i84 = this.f3430f;
                                    this.f3430f = Math.max(i84, i84 + measuredWidth3 + ((LinearLayout.LayoutParams) c0313z0).leftMargin + ((LinearLayout.LayoutParams) c0313z0).rightMargin);
                                } else {
                                    this.f3430f = ((LinearLayout.LayoutParams) c0313z0).leftMargin + measuredWidth3 + ((LinearLayout.LayoutParams) c0313z0).rightMargin + this.f3430f;
                                }
                                if (z3) {
                                    i76 = Math.max(measuredWidth3, i76);
                                }
                            }
                        } else {
                            f4 = 0.0f;
                        }
                        i16 = Integer.MIN_VALUE;
                        i17 = i78;
                        i18 = i79;
                        i19 = i16;
                        i20 = i83;
                        z3 = z19;
                        z4 = z18;
                        measureChildWithMargins(childAt6, i, f12 != f4 ? this.f3430f : 0, i2, 0);
                        if (i19 == Integer.MIN_VALUE) {
                        }
                        int measuredWidth32 = childAt6.getMeasuredWidth();
                        if (z20) {
                        }
                        if (z3) {
                        }
                    }
                    z5 = z22;
                    i21 = 1073741824;
                    if (mode4 == i21) {
                    }
                    z6 = false;
                    i22 = ((LinearLayout.LayoutParams) c0313z0).topMargin + ((LinearLayout.LayoutParams) c0313z0).bottomMargin;
                    int measuredHeight32 = childAt6.getMeasuredHeight() + i22;
                    int combineMeasuredStates22 = View.combineMeasuredStates(i75, childAt6.getMeasuredState());
                    if (z4) {
                    }
                    i23 = i22;
                    int max42 = Math.max(i18, measuredHeight32);
                    if (z21) {
                    }
                    if (((LinearLayout.LayoutParams) c0313z0).weight <= 0.0f) {
                    }
                    i73 = max42;
                    i75 = combineMeasuredStates22;
                    z22 = z5;
                    z21 = z24;
                    f10 = f12;
                }
            }
            i74 = i20 + 1;
            z19 = z3;
            z18 = z4;
        }
        int i85 = i73;
        boolean z25 = z19;
        boolean z26 = z18;
        if (this.f3430f > 0 && i(virtualChildCount2)) {
            this.f3430f += this.f3434l;
        }
        int i86 = iArr[1];
        if (i86 == -1 && iArr[0] == -1 && iArr[2] == -1) {
            c2 = 3;
            if (iArr[3] == -1) {
                max = i85;
                i3 = i75;
                if (z25 && (mode3 == Integer.MIN_VALUE || mode3 == 0)) {
                    this.f3430f = 0;
                    for (i15 = 0; i15 < virtualChildCount2; i15++) {
                        View childAt7 = getChildAt(i15);
                        if (childAt7 == null) {
                            this.f3430f = this.f3430f;
                        } else if (childAt7.getVisibility() != 8) {
                            C0313z0 c0313z08 = (C0313z0) childAt7.getLayoutParams();
                            if (z20) {
                                this.f3430f = ((LinearLayout.LayoutParams) c0313z08).leftMargin + i76 + ((LinearLayout.LayoutParams) c0313z08).rightMargin + this.f3430f;
                            } else {
                                int i87 = this.f3430f;
                                this.f3430f = Math.max(i87, i87 + i76 + ((LinearLayout.LayoutParams) c0313z08).leftMargin + ((LinearLayout.LayoutParams) c0313z08).rightMargin);
                            }
                        }
                    }
                }
                int paddingRight = getPaddingRight() + getPaddingLeft() + this.f3430f;
                this.f3430f = paddingRight;
                int resolveSizeAndState2 = View.resolveSizeAndState(Math.max(paddingRight, getSuggestedMinimumWidth()), i, 0);
                int i88 = (16777215 & resolveSizeAndState2) - this.f3430f;
                if (!z22 || (i88 != 0 && f10 > 0.0f)) {
                    f2 = this.f3431g;
                    if (f2 > 0.0f) {
                        f10 = f2;
                    }
                    iArr[3] = -1;
                    iArr[2] = -1;
                    iArr[1] = -1;
                    iArr[0] = -1;
                    iArr2[3] = -1;
                    iArr2[2] = -1;
                    iArr2[1] = -1;
                    iArr2[0] = -1;
                    this.f3430f = 0;
                    int i89 = i3;
                    max = -1;
                    i4 = 0;
                    while (i4 < virtualChildCount2) {
                        View childAt8 = getChildAt(i4);
                        if (childAt8 == null || childAt8.getVisibility() == 8) {
                            i9 = i88;
                            i10 = virtualChildCount2;
                        } else {
                            C0313z0 c0313z09 = (C0313z0) childAt8.getLayoutParams();
                            float f13 = ((LinearLayout.LayoutParams) c0313z09).weight;
                            if (f13 > 0.0f) {
                                i10 = virtualChildCount2;
                                int i90 = (int) ((i88 * f13) / f10);
                                float f14 = f10 - f13;
                                int i91 = i88 - i90;
                                int childMeasureSpec2 = ViewGroup.getChildMeasureSpec(i2, getPaddingBottom() + getPaddingTop() + ((LinearLayout.LayoutParams) c0313z09).topMargin + ((LinearLayout.LayoutParams) c0313z09).bottomMargin, ((LinearLayout.LayoutParams) c0313z09).height);
                                if (((LinearLayout.LayoutParams) c0313z09).width == 0) {
                                    i14 = 1073741824;
                                    if (mode3 == 1073741824) {
                                        if (i90 <= 0) {
                                            i90 = 0;
                                        }
                                        childAt8.measure(View.MeasureSpec.makeMeasureSpec(i90, 1073741824), childMeasureSpec2);
                                        i89 = View.combineMeasuredStates(i89, childAt8.getMeasuredState() & (-16777216));
                                        f10 = f14;
                                        i11 = i91;
                                    }
                                } else {
                                    i14 = 1073741824;
                                }
                                int measuredWidth4 = childAt8.getMeasuredWidth() + i90;
                                if (measuredWidth4 < 0) {
                                    measuredWidth4 = 0;
                                }
                                childAt8.measure(View.MeasureSpec.makeMeasureSpec(measuredWidth4, i14), childMeasureSpec2);
                                i89 = View.combineMeasuredStates(i89, childAt8.getMeasuredState() & (-16777216));
                                f10 = f14;
                                i11 = i91;
                            } else {
                                i11 = i88;
                                i10 = virtualChildCount2;
                            }
                            if (z20) {
                                f3 = f10;
                                this.f3430f = childAt8.getMeasuredWidth() + ((LinearLayout.LayoutParams) c0313z09).leftMargin + ((LinearLayout.LayoutParams) c0313z09).rightMargin + this.f3430f;
                                i12 = i11;
                            } else {
                                f3 = f10;
                                int i92 = this.f3430f;
                                i12 = i11;
                                this.f3430f = Math.max(i92, childAt8.getMeasuredWidth() + i92 + ((LinearLayout.LayoutParams) c0313z09).leftMargin + ((LinearLayout.LayoutParams) c0313z09).rightMargin);
                            }
                            boolean z27 = mode4 != 1073741824 && ((LinearLayout.LayoutParams) c0313z09).height == -1;
                            int i93 = ((LinearLayout.LayoutParams) c0313z09).topMargin + ((LinearLayout.LayoutParams) c0313z09).bottomMargin;
                            int measuredHeight4 = childAt8.getMeasuredHeight() + i93;
                            max = Math.max(max, measuredHeight4);
                            if (!z27) {
                                i93 = measuredHeight4;
                            }
                            i72 = Math.max(i72, i93);
                            if (z21) {
                                i13 = -1;
                                if (((LinearLayout.LayoutParams) c0313z09).height == -1) {
                                    z2 = true;
                                    if (!z26 && (baseline = childAt8.getBaseline()) != i13) {
                                        int i94 = ((LinearLayout.LayoutParams) c0313z09).gravity;
                                        if (i94 < 0) {
                                            i94 = this.e;
                                        }
                                        int i95 = (((i94 & 112) >> 4) & (-2)) >> 1;
                                        iArr[i95] = Math.max(iArr[i95], baseline);
                                        iArr2[i95] = Math.max(iArr2[i95], measuredHeight4 - baseline);
                                    }
                                    z21 = z2;
                                    i9 = i12;
                                    f10 = f3;
                                }
                            } else {
                                i13 = -1;
                            }
                            z2 = false;
                            if (!z26) {
                            }
                            z21 = z2;
                            i9 = i12;
                            f10 = f3;
                        }
                        i4++;
                        i88 = i9;
                        virtualChildCount2 = i10;
                    }
                    i5 = i2;
                    i6 = virtualChildCount2;
                    this.f3430f = getPaddingRight() + getPaddingLeft() + this.f3430f;
                    i7 = iArr[1];
                    if (i7 != -1 && iArr[0] == -1 && iArr[2] == -1) {
                        c3 = 3;
                        if (iArr[3] == -1) {
                            i8 = 0;
                            i3 = i89;
                        }
                    } else {
                        c3 = 3;
                    }
                    i8 = 0;
                    max = Math.max(max, Math.max(iArr2[c3], Math.max(iArr2[0], Math.max(iArr2[1], iArr2[2]))) + Math.max(iArr[c3], Math.max(iArr[0], Math.max(i7, iArr[2]))));
                    i3 = i89;
                } else {
                    i72 = Math.max(i72, i77);
                    if (z25 && mode3 != 1073741824) {
                        for (int i96 = 0; i96 < virtualChildCount2; i96++) {
                            View childAt9 = getChildAt(i96);
                            if (childAt9 != null && childAt9.getVisibility() != 8 && ((LinearLayout.LayoutParams) ((C0313z0) childAt9.getLayoutParams())).weight > 0.0f) {
                                childAt9.measure(View.MeasureSpec.makeMeasureSpec(i76, 1073741824), View.MeasureSpec.makeMeasureSpec(childAt9.getMeasuredHeight(), 1073741824));
                            }
                        }
                    }
                    i5 = i2;
                    i6 = virtualChildCount2;
                    i8 = 0;
                }
                if (!z21 || mode4 == 1073741824) {
                    i72 = max;
                }
                setMeasuredDimension((i3 & (-16777216)) | resolveSizeAndState2, View.resolveSizeAndState(Math.max(getPaddingBottom() + getPaddingTop() + i72, getSuggestedMinimumHeight()), i5, i3 << 16));
                if (z23) {
                    return;
                }
                int makeMeasureSpec3 = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824);
                int i97 = i6;
                while (i8 < i97) {
                    View childAt10 = getChildAt(i8);
                    if (childAt10.getVisibility() != 8) {
                        C0313z0 c0313z010 = (C0313z0) childAt10.getLayoutParams();
                        if (((LinearLayout.LayoutParams) c0313z010).height == -1) {
                            int i98 = ((LinearLayout.LayoutParams) c0313z010).width;
                            ((LinearLayout.LayoutParams) c0313z010).width = childAt10.getMeasuredWidth();
                            measureChildWithMargins(childAt10, i, 0, makeMeasureSpec3, 0);
                            ((LinearLayout.LayoutParams) c0313z010).width = i98;
                        }
                    }
                    i8++;
                }
                return;
            }
        } else {
            c2 = 3;
        }
        i3 = i75;
        max = Math.max(i85, Math.max(iArr2[3], Math.max(iArr2[0], Math.max(iArr2[1], iArr2[2]))) + Math.max(iArr[c2], Math.max(iArr[0], Math.max(i86, iArr[2]))));
        if (z25) {
            this.f3430f = 0;
            while (i15 < virtualChildCount2) {
            }
        }
        int paddingRight2 = getPaddingRight() + getPaddingLeft() + this.f3430f;
        this.f3430f = paddingRight2;
        int resolveSizeAndState22 = View.resolveSizeAndState(Math.max(paddingRight2, getSuggestedMinimumWidth()), i, 0);
        int i882 = (16777215 & resolveSizeAndState22) - this.f3430f;
        if (z22) {
        }
        f2 = this.f3431g;
        if (f2 > 0.0f) {
        }
        iArr[3] = -1;
        iArr[2] = -1;
        iArr[1] = -1;
        iArr[0] = -1;
        iArr2[3] = -1;
        iArr2[2] = -1;
        iArr2[1] = -1;
        iArr2[0] = -1;
        this.f3430f = 0;
        int i892 = i3;
        max = -1;
        i4 = 0;
        while (i4 < virtualChildCount2) {
        }
        i5 = i2;
        i6 = virtualChildCount2;
        this.f3430f = getPaddingRight() + getPaddingLeft() + this.f3430f;
        i7 = iArr[1];
        if (i7 != -1) {
        }
        c3 = 3;
        i8 = 0;
        max = Math.max(max, Math.max(iArr2[c3], Math.max(iArr2[0], Math.max(iArr2[1], iArr2[2]))) + Math.max(iArr[c3], Math.max(iArr[0], Math.max(i7, iArr[2]))));
        i3 = i892;
        if (!z21) {
        }
        i72 = max;
        setMeasuredDimension((i3 & (-16777216)) | resolveSizeAndState22, View.resolveSizeAndState(Math.max(getPaddingBottom() + getPaddingTop() + i72, getSuggestedMinimumHeight()), i5, i3 << 16));
        if (z23) {
        }
    }

    public void setBaselineAligned(boolean z2) {
        this.f3426a = z2;
    }

    public void setBaselineAlignedChildIndex(int i) {
        if (i >= 0 && i < getChildCount()) {
            this.f3427b = i;
            return;
        }
        throw new IllegalArgumentException("base aligned child index out of range (0, " + getChildCount() + ")");
    }

    public void setDividerDrawable(Drawable drawable) {
        if (drawable == this.f3433k) {
            return;
        }
        this.f3433k = drawable;
        if (drawable != null) {
            this.f3434l = drawable.getIntrinsicWidth();
            this.f3435m = drawable.getIntrinsicHeight();
        } else {
            this.f3434l = 0;
            this.f3435m = 0;
        }
        setWillNotDraw(drawable == null);
        requestLayout();
    }

    public void setDividerPadding(int i) {
        this.f3437o = i;
    }

    public void setGravity(int i) {
        if (this.e != i) {
            if ((8388615 & i) == 0) {
                i |= 8388611;
            }
            if ((i & 112) == 0) {
                i |= 48;
            }
            this.e = i;
            requestLayout();
        }
    }

    public void setHorizontalGravity(int i) {
        int i2 = i & 8388615;
        int i3 = this.e;
        if ((8388615 & i3) != i2) {
            this.e = i2 | ((-8388616) & i3);
            requestLayout();
        }
    }

    public void setMeasureWithLargestChildEnabled(boolean z2) {
        this.f3432h = z2;
    }

    public void setOrientation(int i) {
        if (this.f3429d != i) {
            this.f3429d = i;
            requestLayout();
        }
    }

    public void setShowDividers(int i) {
        if (i != this.f3436n) {
            requestLayout();
        }
        this.f3436n = i;
    }

    public void setVerticalGravity(int i) {
        int i2 = i & 112;
        int i3 = this.e;
        if ((i3 & 112) != i2) {
            this.e = i2 | (i3 & (-113));
            requestLayout();
        }
    }

    public void setWeightSum(float f2) {
        this.f3431g = Math.max(0.0f, f2);
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }
}
