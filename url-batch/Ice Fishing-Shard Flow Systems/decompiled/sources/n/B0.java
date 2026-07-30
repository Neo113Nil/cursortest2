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
import h.AbstractC0454a;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public abstract class B0 extends ViewGroup {

    /* renamed from: d, reason: collision with root package name */
    public boolean f6611d;

    /* renamed from: e, reason: collision with root package name */
    public int f6612e;

    /* renamed from: i, reason: collision with root package name */
    public int f6613i;

    /* renamed from: l, reason: collision with root package name */
    public int f6614l;

    /* renamed from: m, reason: collision with root package name */
    public int f6615m;

    /* renamed from: n, reason: collision with root package name */
    public int f6616n;

    /* renamed from: o, reason: collision with root package name */
    public float f6617o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f6618p;

    /* renamed from: q, reason: collision with root package name */
    public int[] f6619q;

    /* renamed from: r, reason: collision with root package name */
    public int[] f6620r;

    /* renamed from: s, reason: collision with root package name */
    public Drawable f6621s;

    /* renamed from: t, reason: collision with root package name */
    public int f6622t;

    /* renamed from: u, reason: collision with root package name */
    public int f6623u;

    /* renamed from: v, reason: collision with root package name */
    public int f6624v;

    /* renamed from: w, reason: collision with root package name */
    public int f6625w;

    public B0(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.f6611d = true;
        this.f6612e = -1;
        this.f6613i = 0;
        this.f6615m = 8388659;
        int[] iArr = AbstractC0454a.f5049n;
        D0.j R4 = D0.j.R(context, attributeSet, iArr, i2);
        I.T.h(this, context, iArr, attributeSet, (TypedArray) R4.f331i, i2);
        TypedArray typedArray = (TypedArray) R4.f331i;
        int i5 = typedArray.getInt(1, -1);
        if (i5 >= 0) {
            setOrientation(i5);
        }
        int i7 = typedArray.getInt(0, -1);
        if (i7 >= 0) {
            setGravity(i7);
        }
        boolean z7 = typedArray.getBoolean(2, true);
        if (!z7) {
            setBaselineAligned(z7);
        }
        this.f6617o = typedArray.getFloat(4, -1.0f);
        this.f6612e = typedArray.getInt(3, -1);
        this.f6618p = typedArray.getBoolean(7, false);
        setDividerDrawable(R4.J(5));
        this.f6624v = typedArray.getInt(8, 0);
        this.f6625w = typedArray.getDimensionPixelSize(6, 0);
        R4.W();
    }

    public final void c(Canvas canvas, int i2) {
        this.f6621s.setBounds(getPaddingLeft() + this.f6625w, i2, (getWidth() - getPaddingRight()) - this.f6625w, this.f6623u + i2);
        this.f6621s.draw(canvas);
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof A0;
    }

    public final void d(Canvas canvas, int i2) {
        this.f6621s.setBounds(i2, getPaddingTop() + this.f6625w, this.f6622t + i2, (getHeight() - getPaddingBottom()) - this.f6625w);
        this.f6621s.draw(canvas);
    }

    @Override // android.view.ViewGroup
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public A0 generateDefaultLayoutParams() {
        int i2 = this.f6614l;
        if (i2 == 0) {
            return new A0(-2, -2);
        }
        if (i2 == 1) {
            return new A0(-1, -2);
        }
        return null;
    }

    @Override // android.view.ViewGroup
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public A0 generateLayoutParams(AttributeSet attributeSet) {
        return new A0(getContext(), attributeSet);
    }

    @Override // android.view.ViewGroup
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public A0 generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new A0(layoutParams);
    }

    @Override // android.view.View
    public int getBaseline() {
        int i2;
        if (this.f6612e < 0) {
            return super.getBaseline();
        }
        int childCount = getChildCount();
        int i5 = this.f6612e;
        if (childCount <= i5) {
            throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout set to an index that is out of bounds.");
        }
        View childAt = getChildAt(i5);
        int baseline = childAt.getBaseline();
        if (baseline == -1) {
            if (this.f6612e == 0) {
                return -1;
            }
            throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout points to a View that doesn't know how to get its baseline.");
        }
        int i7 = this.f6613i;
        if (this.f6614l == 1 && (i2 = this.f6615m & 112) != 48) {
            if (i2 == 16) {
                i7 += ((((getBottom() - getTop()) - getPaddingTop()) - getPaddingBottom()) - this.f6616n) / 2;
            } else if (i2 == 80) {
                i7 = ((getBottom() - getTop()) - getPaddingBottom()) - this.f6616n;
            }
        }
        return i7 + ((LinearLayout.LayoutParams) ((A0) childAt.getLayoutParams())).topMargin + baseline;
    }

    public int getBaselineAlignedChildIndex() {
        return this.f6612e;
    }

    public Drawable getDividerDrawable() {
        return this.f6621s;
    }

    public int getDividerPadding() {
        return this.f6625w;
    }

    public int getDividerWidth() {
        return this.f6622t;
    }

    public int getGravity() {
        return this.f6615m;
    }

    public int getOrientation() {
        return this.f6614l;
    }

    public int getShowDividers() {
        return this.f6624v;
    }

    public int getVirtualChildCount() {
        return getChildCount();
    }

    public float getWeightSum() {
        return this.f6617o;
    }

    public final boolean h(int i2) {
        if (i2 == 0) {
            return (this.f6624v & 1) != 0;
        }
        if (i2 == getChildCount()) {
            return (this.f6624v & 4) != 0;
        }
        if ((this.f6624v & 2) != 0) {
            for (int i5 = i2 - 1; i5 >= 0; i5--) {
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
        int i2;
        if (this.f6621s == null) {
            return;
        }
        int i5 = 0;
        if (this.f6614l == 1) {
            int virtualChildCount = getVirtualChildCount();
            while (i5 < virtualChildCount) {
                View childAt = getChildAt(i5);
                if (childAt != null && childAt.getVisibility() != 8 && h(i5)) {
                    c(canvas, (childAt.getTop() - ((LinearLayout.LayoutParams) ((A0) childAt.getLayoutParams())).topMargin) - this.f6623u);
                }
                i5++;
            }
            if (h(virtualChildCount)) {
                View childAt2 = getChildAt(virtualChildCount - 1);
                c(canvas, childAt2 == null ? (getHeight() - getPaddingBottom()) - this.f6623u : childAt2.getBottom() + ((LinearLayout.LayoutParams) ((A0) childAt2.getLayoutParams())).bottomMargin);
                return;
            }
            return;
        }
        int virtualChildCount2 = getVirtualChildCount();
        boolean a7 = z1.a(this);
        while (i5 < virtualChildCount2) {
            View childAt3 = getChildAt(i5);
            if (childAt3 != null && childAt3.getVisibility() != 8 && h(i5)) {
                A0 a02 = (A0) childAt3.getLayoutParams();
                d(canvas, a7 ? childAt3.getRight() + ((LinearLayout.LayoutParams) a02).rightMargin : (childAt3.getLeft() - ((LinearLayout.LayoutParams) a02).leftMargin) - this.f6622t);
            }
            i5++;
        }
        if (h(virtualChildCount2)) {
            View childAt4 = getChildAt(virtualChildCount2 - 1);
            if (childAt4 != null) {
                A0 a03 = (A0) childAt4.getLayoutParams();
                if (a7) {
                    left = childAt4.getLeft() - ((LinearLayout.LayoutParams) a03).leftMargin;
                    i2 = this.f6622t;
                    right = left - i2;
                } else {
                    right = childAt4.getRight() + ((LinearLayout.LayoutParams) a03).rightMargin;
                }
            } else if (a7) {
                right = getPaddingLeft();
            } else {
                left = getWidth() - getPaddingRight();
                i2 = this.f6622t;
                right = left - i2;
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

    /* JADX WARN: Removed duplicated region for block: B:25:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x01a1  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x018e  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onLayout(boolean z7, int i2, int i5, int i7, int i8) {
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        char c7;
        int i18;
        int i19;
        int i20;
        int i21 = 8;
        char c8 = 2;
        if (this.f6614l == 1) {
            int paddingLeft = getPaddingLeft();
            int i22 = i7 - i2;
            int paddingRight = i22 - getPaddingRight();
            int paddingRight2 = (i22 - paddingLeft) - getPaddingRight();
            int virtualChildCount = getVirtualChildCount();
            int i23 = this.f6615m;
            int i24 = i23 & 112;
            int i25 = 8388615 & i23;
            int paddingTop = i24 != 16 ? i24 != 80 ? getPaddingTop() : ((getPaddingTop() + i8) - i5) - this.f6616n : getPaddingTop() + (((i8 - i5) - this.f6616n) / 2);
            int i26 = 0;
            while (i26 < virtualChildCount) {
                View childAt = getChildAt(i26);
                if (childAt == null || childAt.getVisibility() == i21) {
                    c7 = c8;
                } else {
                    int measuredWidth = childAt.getMeasuredWidth();
                    int measuredHeight = childAt.getMeasuredHeight();
                    A0 a02 = (A0) childAt.getLayoutParams();
                    c7 = c8;
                    int i27 = ((LinearLayout.LayoutParams) a02).gravity;
                    if (i27 < 0) {
                        i27 = i25;
                    }
                    WeakHashMap weakHashMap = I.T.f1153a;
                    int absoluteGravity = Gravity.getAbsoluteGravity(i27, getLayoutDirection()) & 7;
                    if (absoluteGravity == 1) {
                        i18 = ((paddingRight2 - measuredWidth) / 2) + paddingLeft + ((LinearLayout.LayoutParams) a02).leftMargin;
                        i19 = ((LinearLayout.LayoutParams) a02).rightMargin;
                    } else if (absoluteGravity != 5) {
                        i20 = ((LinearLayout.LayoutParams) a02).leftMargin + paddingLeft;
                        if (h(i26)) {
                            paddingTop += this.f6623u;
                        }
                        int i28 = paddingTop + ((LinearLayout.LayoutParams) a02).topMargin;
                        childAt.layout(i20, i28, measuredWidth + i20, i28 + measuredHeight);
                        paddingTop = measuredHeight + ((LinearLayout.LayoutParams) a02).bottomMargin + i28;
                    } else {
                        i18 = paddingRight - measuredWidth;
                        i19 = ((LinearLayout.LayoutParams) a02).rightMargin;
                    }
                    i20 = i18 - i19;
                    if (h(i26)) {
                    }
                    int i282 = paddingTop + ((LinearLayout.LayoutParams) a02).topMargin;
                    childAt.layout(i20, i282, measuredWidth + i20, i282 + measuredHeight);
                    paddingTop = measuredHeight + ((LinearLayout.LayoutParams) a02).bottomMargin + i282;
                }
                i26++;
                c8 = c7;
                i21 = 8;
            }
            return;
        }
        boolean a7 = z1.a(this);
        int paddingTop2 = getPaddingTop();
        int i29 = i8 - i5;
        int paddingBottom = i29 - getPaddingBottom();
        int paddingBottom2 = (i29 - paddingTop2) - getPaddingBottom();
        int virtualChildCount2 = getVirtualChildCount();
        int i30 = this.f6615m;
        int i31 = 8388615 & i30;
        int i32 = i30 & 112;
        boolean z8 = this.f6611d;
        int[] iArr = this.f6619q;
        int[] iArr2 = this.f6620r;
        WeakHashMap weakHashMap2 = I.T.f1153a;
        int absoluteGravity2 = Gravity.getAbsoluteGravity(i31, getLayoutDirection());
        int paddingLeft2 = absoluteGravity2 != 1 ? absoluteGravity2 != 5 ? getPaddingLeft() : ((getPaddingLeft() + i7) - i2) - this.f6616n : getPaddingLeft() + (((i7 - i2) - this.f6616n) / 2);
        if (a7) {
            i10 = virtualChildCount2 - 1;
            i9 = -1;
        } else {
            i9 = 1;
            i10 = 0;
        }
        int i33 = 0;
        while (i33 < virtualChildCount2) {
            int i34 = (i9 * i33) + i10;
            View childAt2 = getChildAt(i34);
            if (childAt2 == null) {
                i11 = i10;
            } else {
                i11 = i10;
                if (childAt2.getVisibility() != 8) {
                    int measuredWidth2 = childAt2.getMeasuredWidth();
                    int measuredHeight2 = childAt2.getMeasuredHeight();
                    A0 a03 = (A0) childAt2.getLayoutParams();
                    int i35 = paddingLeft2;
                    if (z8) {
                        i12 = paddingTop2;
                        if (((LinearLayout.LayoutParams) a03).height != -1) {
                            i13 = childAt2.getBaseline();
                            i14 = ((LinearLayout.LayoutParams) a03).gravity;
                            if (i14 < 0) {
                                i14 = i32;
                            }
                            i15 = i14 & 112;
                            if (i15 == 16) {
                                if (i15 == 48) {
                                    i16 = i12 + ((LinearLayout.LayoutParams) a03).topMargin;
                                    if (i13 != -1) {
                                        i16 = (iArr[1] - i13) + i16;
                                    }
                                } else if (i15 != 80) {
                                    i16 = i12;
                                } else {
                                    i16 = (paddingBottom - measuredHeight2) - ((LinearLayout.LayoutParams) a03).bottomMargin;
                                    if (i13 != -1) {
                                        i17 = iArr2[2] - (childAt2.getMeasuredHeight() - i13);
                                    }
                                }
                                int i36 = (h(i34) ? i35 + this.f6622t : i35) + ((LinearLayout.LayoutParams) a03).leftMargin;
                                childAt2.layout(i36, i16, i36 + measuredWidth2, i16 + measuredHeight2);
                                paddingLeft2 = measuredWidth2 + ((LinearLayout.LayoutParams) a03).rightMargin + i36;
                                i33++;
                                i10 = i11;
                                paddingTop2 = i12;
                            } else {
                                i16 = ((paddingBottom2 - measuredHeight2) / 2) + i12 + ((LinearLayout.LayoutParams) a03).topMargin;
                                i17 = ((LinearLayout.LayoutParams) a03).bottomMargin;
                            }
                            i16 -= i17;
                            int i362 = (h(i34) ? i35 + this.f6622t : i35) + ((LinearLayout.LayoutParams) a03).leftMargin;
                            childAt2.layout(i362, i16, i362 + measuredWidth2, i16 + measuredHeight2);
                            paddingLeft2 = measuredWidth2 + ((LinearLayout.LayoutParams) a03).rightMargin + i362;
                            i33++;
                            i10 = i11;
                            paddingTop2 = i12;
                        }
                    } else {
                        i12 = paddingTop2;
                    }
                    i13 = -1;
                    i14 = ((LinearLayout.LayoutParams) a03).gravity;
                    if (i14 < 0) {
                    }
                    i15 = i14 & 112;
                    if (i15 == 16) {
                    }
                    i16 -= i17;
                    int i3622 = (h(i34) ? i35 + this.f6622t : i35) + ((LinearLayout.LayoutParams) a03).leftMargin;
                    childAt2.layout(i3622, i16, i3622 + measuredWidth2, i16 + measuredHeight2);
                    paddingLeft2 = measuredWidth2 + ((LinearLayout.LayoutParams) a03).rightMargin + i3622;
                    i33++;
                    i10 = i11;
                    paddingTop2 = i12;
                }
            }
            i12 = paddingTop2;
            i33++;
            i10 = i11;
            paddingTop2 = i12;
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
    public void onMeasure(int i2, int i5) {
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        boolean z7;
        int baseline;
        int i13;
        int i14;
        int[] iArr;
        int i15;
        int i16;
        boolean z8;
        boolean z9;
        A0 a02;
        int i17;
        int[] iArr2;
        int i18;
        View view;
        int i19;
        boolean z10;
        boolean z11;
        int max;
        int i20;
        int i21;
        int i22;
        int i23;
        int i24;
        int i25;
        int i26;
        int i27;
        boolean z12;
        int i28;
        int i29;
        int i30;
        View view2;
        boolean z13;
        boolean z14;
        B0 b02 = this;
        int i31 = -2;
        int i32 = 0;
        int i33 = 1073741824;
        int i34 = 8;
        if (b02.f6614l == 1) {
            b02.f6616n = 0;
            int virtualChildCount = b02.getVirtualChildCount();
            int mode = View.MeasureSpec.getMode(i2);
            int mode2 = View.MeasureSpec.getMode(i5);
            int i35 = b02.f6612e;
            boolean z15 = b02.f6618p;
            int i36 = 0;
            int i37 = 0;
            int i38 = 0;
            boolean z16 = false;
            int i39 = 0;
            boolean z17 = false;
            boolean z18 = true;
            float f7 = 0.0f;
            int i40 = 0;
            while (i36 < virtualChildCount) {
                int i41 = mode;
                View childAt = b02.getChildAt(i36);
                if (childAt == null) {
                    b02.f6616n = b02.f6616n;
                } else if (childAt.getVisibility() != i34) {
                    if (b02.h(i36)) {
                        b02.f6616n += b02.f6623u;
                    }
                    A0 a03 = (A0) childAt.getLayoutParams();
                    float f8 = ((LinearLayout.LayoutParams) a03).weight;
                    f7 += f8;
                    if (mode2 == i33 && ((LinearLayout.LayoutParams) a03).height == 0 && f8 > 0.0f) {
                        int i42 = b02.f6616n;
                        b02.f6616n = Math.max(i42, ((LinearLayout.LayoutParams) a03).topMargin + i42 + ((LinearLayout.LayoutParams) a03).bottomMargin);
                        view2 = childAt;
                        i27 = mode2;
                        i28 = i35;
                        z12 = z15;
                        i29 = i36;
                        z16 = true;
                        i30 = i41;
                    } else {
                        if (((LinearLayout.LayoutParams) a03).height != 0 || f8 <= 0.0f) {
                            i24 = Integer.MIN_VALUE;
                        } else {
                            ((LinearLayout.LayoutParams) a03).height = i31;
                            i24 = 0;
                        }
                        if (f7 == 0.0f) {
                            i25 = i36;
                            i26 = b02.f6616n;
                        } else {
                            i25 = i36;
                            i26 = 0;
                        }
                        i27 = mode2;
                        z12 = z15;
                        i28 = i35;
                        i29 = i25;
                        i30 = i41;
                        b02.measureChildWithMargins(childAt, i2, 0, i5, i26);
                        if (i24 != Integer.MIN_VALUE) {
                            ((LinearLayout.LayoutParams) a03).height = i24;
                        }
                        int measuredHeight = childAt.getMeasuredHeight();
                        int i43 = b02.f6616n;
                        view2 = childAt;
                        b02.f6616n = Math.max(i43, i43 + measuredHeight + ((LinearLayout.LayoutParams) a03).topMargin + ((LinearLayout.LayoutParams) a03).bottomMargin);
                        if (z12) {
                            i40 = Math.max(measuredHeight, i40);
                        }
                    }
                    if (i28 >= 0 && i28 == i29 + 1) {
                        b02.f6613i = b02.f6616n;
                    }
                    if (i29 < i28 && ((LinearLayout.LayoutParams) a03).weight > 0.0f) {
                        throw new RuntimeException("A child of LinearLayout with index less than mBaselineAlignedChildIndex has weight > 0, which won't work.  Either remove the weight, or don't set mBaselineAlignedChildIndex.");
                    }
                    if (i30 == 1073741824 || ((LinearLayout.LayoutParams) a03).width != -1) {
                        z13 = false;
                    } else {
                        z13 = true;
                        z17 = true;
                    }
                    int i44 = ((LinearLayout.LayoutParams) a03).leftMargin + ((LinearLayout.LayoutParams) a03).rightMargin;
                    int measuredWidth = view2.getMeasuredWidth() + i44;
                    i32 = Math.max(i32, measuredWidth);
                    int measuredState = view2.getMeasuredState();
                    boolean z19 = z13;
                    int combineMeasuredStates = View.combineMeasuredStates(i39, measuredState);
                    if (z18) {
                        i39 = combineMeasuredStates;
                        if (((LinearLayout.LayoutParams) a03).width == -1) {
                            z14 = true;
                            if (((LinearLayout.LayoutParams) a03).weight <= 0.0f) {
                                if (!z19) {
                                    i44 = measuredWidth;
                                }
                                i38 = Math.max(i38, i44);
                            } else {
                                if (!z19) {
                                    i44 = measuredWidth;
                                }
                                i37 = Math.max(i37, i44);
                            }
                            z18 = z14;
                            i36 = i29 + 1;
                            i35 = i28;
                            mode = i30;
                            z15 = z12;
                            mode2 = i27;
                            i31 = -2;
                            i33 = 1073741824;
                            i34 = 8;
                        }
                    } else {
                        i39 = combineMeasuredStates;
                    }
                    z14 = false;
                    if (((LinearLayout.LayoutParams) a03).weight <= 0.0f) {
                    }
                    z18 = z14;
                    i36 = i29 + 1;
                    i35 = i28;
                    mode = i30;
                    z15 = z12;
                    mode2 = i27;
                    i31 = -2;
                    i33 = 1073741824;
                    i34 = 8;
                }
                i27 = mode2;
                i28 = i35;
                z12 = z15;
                i29 = i36;
                i30 = i41;
                i36 = i29 + 1;
                i35 = i28;
                mode = i30;
                z15 = z12;
                mode2 = i27;
                i31 = -2;
                i33 = 1073741824;
                i34 = 8;
            }
            int i45 = mode;
            int i46 = mode2;
            boolean z20 = z15;
            int i47 = i39;
            int i48 = i5;
            if (b02.f6616n > 0 && b02.h(virtualChildCount)) {
                b02.f6616n += b02.f6623u;
            }
            if (z20 && (i46 == Integer.MIN_VALUE || i46 == 0)) {
                b02.f6616n = 0;
                for (int i49 = 0; i49 < virtualChildCount; i49++) {
                    View childAt2 = b02.getChildAt(i49);
                    if (childAt2 == null) {
                        b02.f6616n = b02.f6616n;
                    } else if (childAt2.getVisibility() != 8) {
                        A0 a04 = (A0) childAt2.getLayoutParams();
                        int i50 = b02.f6616n;
                        b02.f6616n = Math.max(i50, i50 + i40 + ((LinearLayout.LayoutParams) a04).topMargin + ((LinearLayout.LayoutParams) a04).bottomMargin);
                    }
                }
            }
            int paddingBottom = b02.getPaddingBottom() + b02.getPaddingTop() + b02.f6616n;
            b02.f6616n = paddingBottom;
            int resolveSizeAndState = View.resolveSizeAndState(Math.max(paddingBottom, b02.getSuggestedMinimumHeight()), i48, 0);
            int i51 = (resolveSizeAndState & 16777215) - b02.f6616n;
            if (z16 || (i51 != 0 && f7 > 0.0f)) {
                float f9 = b02.f6617o;
                if (f9 > 0.0f) {
                    f7 = f9;
                }
                b02.f6616n = 0;
                int i52 = i47;
                int i53 = 0;
                while (i53 < virtualChildCount) {
                    View childAt3 = b02.getChildAt(i53);
                    if (childAt3.getVisibility() == 8) {
                        i21 = i53;
                    } else {
                        A0 a05 = (A0) childAt3.getLayoutParams();
                        float f10 = ((LinearLayout.LayoutParams) a05).weight;
                        if (f10 > 0.0f) {
                            int i54 = (int) ((i51 * f10) / f7);
                            f7 -= f10;
                            i51 -= i54;
                            i21 = i53;
                            int childMeasureSpec = ViewGroup.getChildMeasureSpec(i2, b02.getPaddingRight() + b02.getPaddingLeft() + ((LinearLayout.LayoutParams) a05).leftMargin + ((LinearLayout.LayoutParams) a05).rightMargin, ((LinearLayout.LayoutParams) a05).width);
                            if (((LinearLayout.LayoutParams) a05).height == 0) {
                                i23 = 1073741824;
                                if (i46 == 1073741824) {
                                    if (i54 <= 0) {
                                        i54 = 0;
                                    }
                                    childAt3.measure(childMeasureSpec, View.MeasureSpec.makeMeasureSpec(i54, 1073741824));
                                    i52 = View.combineMeasuredStates(i52, childAt3.getMeasuredState() & (-256));
                                }
                            } else {
                                i23 = 1073741824;
                            }
                            int measuredHeight2 = childAt3.getMeasuredHeight() + i54;
                            if (measuredHeight2 < 0) {
                                measuredHeight2 = 0;
                            }
                            childAt3.measure(childMeasureSpec, View.MeasureSpec.makeMeasureSpec(measuredHeight2, i23));
                            i52 = View.combineMeasuredStates(i52, childAt3.getMeasuredState() & (-256));
                        } else {
                            i21 = i53;
                        }
                        int i55 = ((LinearLayout.LayoutParams) a05).leftMargin + ((LinearLayout.LayoutParams) a05).rightMargin;
                        int measuredWidth2 = childAt3.getMeasuredWidth() + i55;
                        i32 = Math.max(i32, measuredWidth2);
                        if (i45 != 1073741824) {
                            i22 = -1;
                            if (((LinearLayout.LayoutParams) a05).width == -1) {
                                measuredWidth2 = i55;
                            }
                        } else {
                            i22 = -1;
                        }
                        i37 = Math.max(i37, measuredWidth2);
                        boolean z21 = z18 && ((LinearLayout.LayoutParams) a05).width == i22;
                        int i56 = b02.f6616n;
                        b02.f6616n = Math.max(i56, childAt3.getMeasuredHeight() + i56 + ((LinearLayout.LayoutParams) a05).topMargin + ((LinearLayout.LayoutParams) a05).bottomMargin);
                        z18 = z21;
                    }
                    i53 = i21 + 1;
                }
                b02.f6616n = b02.getPaddingBottom() + b02.getPaddingTop() + b02.f6616n;
                i47 = i52;
            } else {
                i37 = Math.max(i37, i38);
                if (z20 && i46 != 1073741824) {
                    for (int i57 = 0; i57 < virtualChildCount; i57++) {
                        View childAt4 = b02.getChildAt(i57);
                        if (childAt4 != null && childAt4.getVisibility() != 8 && ((LinearLayout.LayoutParams) ((A0) childAt4.getLayoutParams())).weight > 0.0f) {
                            childAt4.measure(View.MeasureSpec.makeMeasureSpec(childAt4.getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(i40, 1073741824));
                        }
                    }
                }
            }
            if (z18 || i45 == 1073741824) {
                i37 = i32;
            }
            b02.setMeasuredDimension(View.resolveSizeAndState(Math.max(b02.getPaddingRight() + b02.getPaddingLeft() + i37, b02.getSuggestedMinimumWidth()), i2, i47), resolveSizeAndState);
            if (z17) {
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(b02.getMeasuredWidth(), 1073741824);
                int i58 = 0;
                while (i58 < virtualChildCount) {
                    View childAt5 = b02.getChildAt(i58);
                    if (childAt5.getVisibility() != 8) {
                        A0 a06 = (A0) childAt5.getLayoutParams();
                        if (((LinearLayout.LayoutParams) a06).width == -1) {
                            int i59 = ((LinearLayout.LayoutParams) a06).height;
                            ((LinearLayout.LayoutParams) a06).height = childAt5.getMeasuredHeight();
                            b02.measureChildWithMargins(childAt5, makeMeasureSpec, 0, i48, 0);
                            ((LinearLayout.LayoutParams) a06).height = i59;
                        }
                    }
                    i58++;
                    i48 = i5;
                }
                return;
            }
            return;
        }
        int i60 = i2;
        b02.f6616n = 0;
        int virtualChildCount2 = b02.getVirtualChildCount();
        int mode3 = View.MeasureSpec.getMode(i60);
        int mode4 = View.MeasureSpec.getMode(i5);
        if (b02.f6619q == null || b02.f6620r == null) {
            b02.f6619q = new int[4];
            b02.f6620r = new int[4];
        }
        int[] iArr3 = b02.f6619q;
        int[] iArr4 = b02.f6620r;
        iArr3[3] = -1;
        char c7 = 2;
        iArr3[2] = -1;
        iArr3[1] = -1;
        iArr3[0] = -1;
        iArr4[3] = -1;
        iArr4[2] = -1;
        iArr4[1] = -1;
        iArr4[0] = -1;
        boolean z22 = b02.f6611d;
        boolean z23 = b02.f6618p;
        boolean z24 = mode3 == 1073741824;
        float f11 = 0.0f;
        boolean z25 = true;
        int i61 = 0;
        int i62 = 0;
        int i63 = 0;
        int i64 = 0;
        int i65 = 0;
        int i66 = 0;
        boolean z26 = false;
        boolean z27 = false;
        while (i61 < virtualChildCount2) {
            char c8 = c7;
            View childAt6 = b02.getChildAt(i61);
            if (childAt6 == null) {
                b02.f6616n = b02.f6616n;
                i16 = i61;
                i20 = i63;
                iArr2 = iArr3;
                iArr = iArr4;
                z8 = z22;
                z9 = z23;
            } else {
                int i67 = i62;
                if (childAt6.getVisibility() == 8) {
                    i60 = i2;
                    i16 = i61;
                    i20 = i63;
                    iArr = iArr4;
                    z8 = z22;
                    z9 = z23;
                    i62 = i67;
                    iArr2 = iArr3;
                } else {
                    if (b02.h(i61)) {
                        b02.f6616n += b02.f6622t;
                    }
                    A0 a07 = (A0) childAt6.getLayoutParams();
                    float f12 = ((LinearLayout.LayoutParams) a07).weight;
                    f11 += f12;
                    int i68 = i61;
                    if (mode3 == 1073741824 && ((LinearLayout.LayoutParams) a07).width == 0 && f12 > 0.0f) {
                        if (z24) {
                            b02.f6616n = ((LinearLayout.LayoutParams) a07).leftMargin + ((LinearLayout.LayoutParams) a07).rightMargin + b02.f6616n;
                        } else {
                            int i69 = b02.f6616n;
                            b02.f6616n = Math.max(i69, ((LinearLayout.LayoutParams) a07).leftMargin + i69 + ((LinearLayout.LayoutParams) a07).rightMargin);
                        }
                        if (z22) {
                            int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 0);
                            childAt6.measure(makeMeasureSpec2, makeMeasureSpec2);
                            view = childAt6;
                            z8 = z22;
                            z9 = z23;
                            i17 = i67;
                            i16 = i68;
                            a02 = a07;
                            iArr2 = iArr3;
                            iArr = iArr4;
                            i60 = i2;
                            i18 = i63;
                            i15 = i64;
                        } else {
                            view = childAt6;
                            z8 = z22;
                            z9 = z23;
                            z27 = true;
                            i17 = i67;
                            i16 = i68;
                            i19 = 1073741824;
                            a02 = a07;
                            iArr2 = iArr3;
                            iArr = iArr4;
                            i60 = i2;
                            i18 = i63;
                            i15 = i64;
                            if (mode4 == i19 && ((LinearLayout.LayoutParams) a02).height == -1) {
                                z10 = true;
                                z26 = true;
                            } else {
                                z10 = false;
                            }
                            int i70 = ((LinearLayout.LayoutParams) a02).topMargin + ((LinearLayout.LayoutParams) a02).bottomMargin;
                            int measuredHeight3 = view.getMeasuredHeight() + i70;
                            i66 = View.combineMeasuredStates(i66, view.getMeasuredState());
                            if (z8) {
                                z11 = z10;
                            } else {
                                int baseline2 = view.getBaseline();
                                z11 = z10;
                                if (baseline2 != -1) {
                                    int i71 = ((LinearLayout.LayoutParams) a02).gravity;
                                    if (i71 < 0) {
                                        i71 = b02.f6615m;
                                    }
                                    int i72 = (((i71 & 112) >> 4) & (-2)) >> 1;
                                    iArr2[i72] = Math.max(iArr2[i72], baseline2);
                                    iArr[i72] = Math.max(iArr[i72], measuredHeight3 - baseline2);
                                }
                            }
                            int max2 = Math.max(i17, measuredHeight3);
                            boolean z28 = !z25 && ((LinearLayout.LayoutParams) a02).height == -1;
                            if (((LinearLayout.LayoutParams) a02).weight <= 0.0f) {
                                if (!z11) {
                                    i70 = measuredHeight3;
                                }
                                i64 = Math.max(i15, i70);
                                max = i18;
                            } else {
                                if (!z11) {
                                    i70 = measuredHeight3;
                                }
                                max = Math.max(i18, i70);
                                i64 = i15;
                            }
                            int i73 = max;
                            i62 = max2;
                            i20 = i73;
                            z25 = z28;
                        }
                    } else {
                        if (((LinearLayout.LayoutParams) a07).width != 0 || f12 <= 0.0f) {
                            i14 = Integer.MIN_VALUE;
                        } else {
                            ((LinearLayout.LayoutParams) a07).width = -2;
                            i14 = 0;
                        }
                        iArr = iArr4;
                        i15 = i64;
                        i16 = i68;
                        z8 = z22;
                        z9 = z23;
                        int i74 = i14;
                        a02 = a07;
                        i17 = i67;
                        i60 = i2;
                        iArr2 = iArr3;
                        i18 = i63;
                        b02.measureChildWithMargins(childAt6, i60, f11 == 0.0f ? b02.f6616n : 0, i5, 0);
                        if (i74 != Integer.MIN_VALUE) {
                            ((LinearLayout.LayoutParams) a02).width = i74;
                        }
                        int measuredWidth3 = childAt6.getMeasuredWidth();
                        if (z24) {
                            view = childAt6;
                            b02.f6616n = ((LinearLayout.LayoutParams) a02).leftMargin + measuredWidth3 + ((LinearLayout.LayoutParams) a02).rightMargin + b02.f6616n;
                        } else {
                            view = childAt6;
                            int i75 = b02.f6616n;
                            b02.f6616n = Math.max(i75, i75 + measuredWidth3 + ((LinearLayout.LayoutParams) a02).leftMargin + ((LinearLayout.LayoutParams) a02).rightMargin);
                        }
                        if (z9) {
                            i65 = Math.max(measuredWidth3, i65);
                        }
                    }
                    i19 = 1073741824;
                    if (mode4 == i19) {
                    }
                    z10 = false;
                    int i702 = ((LinearLayout.LayoutParams) a02).topMargin + ((LinearLayout.LayoutParams) a02).bottomMargin;
                    int measuredHeight32 = view.getMeasuredHeight() + i702;
                    i66 = View.combineMeasuredStates(i66, view.getMeasuredState());
                    if (z8) {
                    }
                    int max22 = Math.max(i17, measuredHeight32);
                    if (z25) {
                    }
                    if (((LinearLayout.LayoutParams) a02).weight <= 0.0f) {
                    }
                    int i732 = max;
                    i62 = max22;
                    i20 = i732;
                    z25 = z28;
                }
            }
            i63 = i20;
            i61 = i16 + 1;
            c7 = c8;
            iArr3 = iArr2;
            iArr4 = iArr;
            z22 = z8;
            z23 = z9;
        }
        int[] iArr5 = iArr3;
        int[] iArr6 = iArr4;
        char c9 = c7;
        boolean z29 = z22;
        boolean z30 = z23;
        int i76 = i62;
        int i77 = i63;
        int i78 = i64;
        if (b02.f6616n > 0 && b02.h(virtualChildCount2)) {
            b02.f6616n += b02.f6622t;
        }
        int i79 = iArr5[1];
        int max3 = (i79 == -1 && iArr5[0] == -1 && iArr5[c9] == -1 && iArr5[3] == -1) ? i76 : Math.max(i76, Math.max(iArr6[3], Math.max(iArr6[0], Math.max(iArr6[1], iArr6[c9]))) + Math.max(iArr5[3], Math.max(iArr5[0], Math.max(i79, iArr5[c9]))));
        if (z30 && (mode3 == Integer.MIN_VALUE || mode3 == 0)) {
            b02.f6616n = 0;
            for (int i80 = 0; i80 < virtualChildCount2; i80++) {
                View childAt7 = b02.getChildAt(i80);
                if (childAt7 == null) {
                    b02.f6616n = b02.f6616n;
                } else if (childAt7.getVisibility() != 8) {
                    A0 a08 = (A0) childAt7.getLayoutParams();
                    if (z24) {
                        b02.f6616n = ((LinearLayout.LayoutParams) a08).leftMargin + i65 + ((LinearLayout.LayoutParams) a08).rightMargin + b02.f6616n;
                    } else {
                        int i81 = b02.f6616n;
                        b02.f6616n = Math.max(i81, i81 + i65 + ((LinearLayout.LayoutParams) a08).leftMargin + ((LinearLayout.LayoutParams) a08).rightMargin);
                    }
                }
            }
        }
        int paddingRight = b02.getPaddingRight() + b02.getPaddingLeft() + b02.f6616n;
        b02.f6616n = paddingRight;
        int resolveSizeAndState2 = View.resolveSizeAndState(Math.max(paddingRight, b02.getSuggestedMinimumWidth()), i60, 0);
        int i82 = (resolveSizeAndState2 & 16777215) - b02.f6616n;
        if (z27 || (i82 != 0 && f11 > 0.0f)) {
            float f13 = b02.f6617o;
            if (f13 > 0.0f) {
                f11 = f13;
            }
            iArr5[3] = -1;
            iArr5[c9] = -1;
            iArr5[1] = -1;
            iArr5[0] = -1;
            iArr6[3] = -1;
            iArr6[c9] = -1;
            iArr6[1] = -1;
            iArr6[0] = -1;
            b02.f6616n = 0;
            max3 = -1;
            int i83 = 0;
            while (i83 < virtualChildCount2) {
                View childAt8 = b02.getChildAt(i83);
                if (childAt8 == null || childAt8.getVisibility() == 8) {
                    i11 = resolveSizeAndState2;
                } else {
                    A0 a09 = (A0) childAt8.getLayoutParams();
                    float f14 = ((LinearLayout.LayoutParams) a09).weight;
                    if (f14 > 0.0f) {
                        int i84 = (int) ((i82 * f14) / f11);
                        f11 -= f14;
                        i82 -= i84;
                        i11 = resolveSizeAndState2;
                        int childMeasureSpec2 = ViewGroup.getChildMeasureSpec(i5, b02.getPaddingBottom() + b02.getPaddingTop() + ((LinearLayout.LayoutParams) a09).topMargin + ((LinearLayout.LayoutParams) a09).bottomMargin, ((LinearLayout.LayoutParams) a09).height);
                        if (((LinearLayout.LayoutParams) a09).width == 0) {
                            i13 = 1073741824;
                            if (mode3 == 1073741824) {
                                if (i84 <= 0) {
                                    i84 = 0;
                                }
                                childAt8.measure(View.MeasureSpec.makeMeasureSpec(i84, 1073741824), childMeasureSpec2);
                                i66 = View.combineMeasuredStates(i66, childAt8.getMeasuredState() & (-16777216));
                            }
                        } else {
                            i13 = 1073741824;
                        }
                        int measuredWidth4 = childAt8.getMeasuredWidth() + i84;
                        if (measuredWidth4 < 0) {
                            measuredWidth4 = 0;
                        }
                        childAt8.measure(View.MeasureSpec.makeMeasureSpec(measuredWidth4, i13), childMeasureSpec2);
                        i66 = View.combineMeasuredStates(i66, childAt8.getMeasuredState() & (-16777216));
                    } else {
                        i11 = resolveSizeAndState2;
                    }
                    if (z24) {
                        b02.f6616n = childAt8.getMeasuredWidth() + ((LinearLayout.LayoutParams) a09).leftMargin + ((LinearLayout.LayoutParams) a09).rightMargin + b02.f6616n;
                    } else {
                        int i85 = b02.f6616n;
                        b02.f6616n = Math.max(i85, childAt8.getMeasuredWidth() + i85 + ((LinearLayout.LayoutParams) a09).leftMargin + ((LinearLayout.LayoutParams) a09).rightMargin);
                    }
                    boolean z31 = mode4 != 1073741824 && ((LinearLayout.LayoutParams) a09).height == -1;
                    int i86 = ((LinearLayout.LayoutParams) a09).topMargin + ((LinearLayout.LayoutParams) a09).bottomMargin;
                    int measuredHeight4 = childAt8.getMeasuredHeight() + i86;
                    max3 = Math.max(max3, measuredHeight4);
                    if (!z31) {
                        i86 = measuredHeight4;
                    }
                    int max4 = Math.max(i77, i86);
                    if (z25) {
                        i12 = -1;
                        if (((LinearLayout.LayoutParams) a09).height == -1) {
                            z7 = true;
                            if (!z29 && (baseline = childAt8.getBaseline()) != i12) {
                                int i87 = ((LinearLayout.LayoutParams) a09).gravity;
                                if (i87 < 0) {
                                    i87 = b02.f6615m;
                                }
                                int i88 = (((i87 & 112) >> 4) & (-2)) >> 1;
                                iArr5[i88] = Math.max(iArr5[i88], baseline);
                                iArr6[i88] = Math.max(iArr6[i88], measuredHeight4 - baseline);
                            }
                            z25 = z7;
                            i77 = max4;
                        }
                    } else {
                        i12 = -1;
                    }
                    z7 = false;
                    if (!z29) {
                    }
                    z25 = z7;
                    i77 = max4;
                }
                i83++;
                resolveSizeAndState2 = i11;
            }
            i7 = resolveSizeAndState2;
            i8 = -16777216;
            b02.f6616n = b02.getPaddingRight() + b02.getPaddingLeft() + b02.f6616n;
            int i89 = iArr5[1];
            if (i89 == -1 && iArr5[0] == -1 && iArr5[c9] == -1 && iArr5[3] == -1) {
                i9 = 0;
            } else {
                i9 = 0;
                max3 = Math.max(max3, Math.max(iArr6[3], Math.max(iArr6[0], Math.max(iArr6[1], iArr6[c9]))) + Math.max(iArr5[3], Math.max(iArr5[0], Math.max(i89, iArr5[c9]))));
            }
            i10 = i77;
        } else {
            i10 = Math.max(i77, i78);
            if (z30 && mode3 != 1073741824) {
                for (int i90 = 0; i90 < virtualChildCount2; i90++) {
                    View childAt9 = b02.getChildAt(i90);
                    if (childAt9 != null && childAt9.getVisibility() != 8 && ((LinearLayout.LayoutParams) ((A0) childAt9.getLayoutParams())).weight > 0.0f) {
                        childAt9.measure(View.MeasureSpec.makeMeasureSpec(i65, 1073741824), View.MeasureSpec.makeMeasureSpec(childAt9.getMeasuredHeight(), 1073741824));
                    }
                }
            }
            i7 = resolveSizeAndState2;
            i8 = -16777216;
            i9 = 0;
        }
        if (!z25 && mode4 != 1073741824) {
            max3 = i10;
        }
        b02.setMeasuredDimension(i7 | (i66 & i8), View.resolveSizeAndState(Math.max(b02.getPaddingBottom() + b02.getPaddingTop() + max3, b02.getSuggestedMinimumHeight()), i5, i66 << 16));
        if (z26) {
            int makeMeasureSpec3 = View.MeasureSpec.makeMeasureSpec(b02.getMeasuredHeight(), 1073741824);
            int i91 = i9;
            while (i91 < virtualChildCount2) {
                View childAt10 = b02.getChildAt(i91);
                if (childAt10.getVisibility() != 8) {
                    A0 a010 = (A0) childAt10.getLayoutParams();
                    if (((LinearLayout.LayoutParams) a010).height == -1) {
                        int i92 = ((LinearLayout.LayoutParams) a010).width;
                        ((LinearLayout.LayoutParams) a010).width = childAt10.getMeasuredWidth();
                        b02.measureChildWithMargins(childAt10, i60, 0, makeMeasureSpec3, 0);
                        ((LinearLayout.LayoutParams) a010).width = i92;
                    }
                }
                i91++;
                b02 = this;
                i60 = i2;
            }
        }
    }

    public void setBaselineAligned(boolean z7) {
        this.f6611d = z7;
    }

    public void setBaselineAlignedChildIndex(int i2) {
        if (i2 >= 0 && i2 < getChildCount()) {
            this.f6612e = i2;
            return;
        }
        throw new IllegalArgumentException("base aligned child index out of range (0, " + getChildCount() + ")");
    }

    public void setDividerDrawable(Drawable drawable) {
        if (drawable == this.f6621s) {
            return;
        }
        this.f6621s = drawable;
        if (drawable != null) {
            this.f6622t = drawable.getIntrinsicWidth();
            this.f6623u = drawable.getIntrinsicHeight();
        } else {
            this.f6622t = 0;
            this.f6623u = 0;
        }
        setWillNotDraw(drawable == null);
        requestLayout();
    }

    public void setDividerPadding(int i2) {
        this.f6625w = i2;
    }

    public void setGravity(int i2) {
        if (this.f6615m != i2) {
            if ((8388615 & i2) == 0) {
                i2 |= 8388611;
            }
            if ((i2 & 112) == 0) {
                i2 |= 48;
            }
            this.f6615m = i2;
            requestLayout();
        }
    }

    public void setHorizontalGravity(int i2) {
        int i5 = i2 & 8388615;
        int i7 = this.f6615m;
        if ((8388615 & i7) != i5) {
            this.f6615m = i5 | ((-8388616) & i7);
            requestLayout();
        }
    }

    public void setMeasureWithLargestChildEnabled(boolean z7) {
        this.f6618p = z7;
    }

    public void setOrientation(int i2) {
        if (this.f6614l != i2) {
            this.f6614l = i2;
            requestLayout();
        }
    }

    public void setShowDividers(int i2) {
        if (i2 != this.f6624v) {
            requestLayout();
        }
        this.f6624v = i2;
    }

    public void setVerticalGravity(int i2) {
        int i5 = i2 & 112;
        int i7 = this.f6615m;
        if ((i7 & 112) != i5) {
            this.f6615m = i5 | (i7 & (-113));
            requestLayout();
        }
    }

    public void setWeightSum(float f7) {
        this.f6617o = Math.max(0.0f, f7);
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }
}
