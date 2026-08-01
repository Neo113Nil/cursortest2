package m;

import L.C0014l;
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
import androidx.recyclerview.widget.RecyclerView;
import f.AbstractC0097a;

/* loaded from: classes.dex */
public abstract class B0 extends ViewGroup {

    /* renamed from: a, reason: collision with root package name */
    public boolean f2896a;

    /* renamed from: b, reason: collision with root package name */
    public int f2897b;

    /* renamed from: c, reason: collision with root package name */
    public int f2898c;
    public int d;

    /* renamed from: e, reason: collision with root package name */
    public int f2899e;

    /* renamed from: f, reason: collision with root package name */
    public int f2900f;

    /* renamed from: g, reason: collision with root package name */
    public float f2901g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f2902h;
    public int[] i;

    /* renamed from: j, reason: collision with root package name */
    public int[] f2903j;

    /* renamed from: k, reason: collision with root package name */
    public Drawable f2904k;

    /* renamed from: l, reason: collision with root package name */
    public int f2905l;

    /* renamed from: m, reason: collision with root package name */
    public int f2906m;

    /* renamed from: n, reason: collision with root package name */
    public int f2907n;

    /* renamed from: o, reason: collision with root package name */
    public int f2908o;

    public B0(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.f2896a = true;
        this.f2897b = -1;
        this.f2898c = 0;
        this.f2899e = 8388659;
        int[] iArr = AbstractC0097a.f2147n;
        C0014l i = C0014l.i(context, attributeSet, iArr, 0);
        L.T.k(this, context, iArr, attributeSet, (TypedArray) i.f543b, 0);
        TypedArray typedArray = (TypedArray) i.f543b;
        int i2 = typedArray.getInt(1, -1);
        if (i2 >= 0) {
            setOrientation(i2);
        }
        int i3 = typedArray.getInt(0, -1);
        if (i3 >= 0) {
            setGravity(i3);
        }
        boolean z2 = typedArray.getBoolean(2, true);
        if (!z2) {
            setBaselineAligned(z2);
        }
        this.f2901g = typedArray.getFloat(4, -1.0f);
        this.f2897b = typedArray.getInt(3, -1);
        this.f2902h = typedArray.getBoolean(7, false);
        setDividerDrawable(i.c(5));
        this.f2907n = typedArray.getInt(8, 0);
        this.f2908o = typedArray.getDimensionPixelSize(6, 0);
        i.k();
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof A0;
    }

    public final void d(Canvas canvas, int i) {
        this.f2904k.setBounds(getPaddingLeft() + this.f2908o, i, (getWidth() - getPaddingRight()) - this.f2908o, this.f2906m + i);
        this.f2904k.draw(canvas);
    }

    public final void e(Canvas canvas, int i) {
        this.f2904k.setBounds(i, getPaddingTop() + this.f2908o, this.f2905l + i, (getHeight() - getPaddingBottom()) - this.f2908o);
        this.f2904k.draw(canvas);
    }

    @Override // android.view.ViewGroup
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public A0 generateDefaultLayoutParams() {
        int i = this.d;
        if (i == 0) {
            return new A0(-2, -2);
        }
        if (i == 1) {
            return new A0(-1, -2);
        }
        return null;
    }

    @Override // android.view.ViewGroup
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public A0 generateLayoutParams(AttributeSet attributeSet) {
        return new A0(getContext(), attributeSet);
    }

    @Override // android.view.View
    public int getBaseline() {
        int i;
        if (this.f2897b < 0) {
            return super.getBaseline();
        }
        int childCount = getChildCount();
        int i2 = this.f2897b;
        if (childCount <= i2) {
            throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout set to an index that is out of bounds.");
        }
        View childAt = getChildAt(i2);
        int baseline = childAt.getBaseline();
        if (baseline == -1) {
            if (this.f2897b == 0) {
                return -1;
            }
            throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout points to a View that doesn't know how to get its baseline.");
        }
        int i3 = this.f2898c;
        if (this.d == 1 && (i = this.f2899e & 112) != 48) {
            if (i == 16) {
                i3 += ((((getBottom() - getTop()) - getPaddingTop()) - getPaddingBottom()) - this.f2900f) / 2;
            } else if (i == 80) {
                i3 = ((getBottom() - getTop()) - getPaddingBottom()) - this.f2900f;
            }
        }
        return i3 + ((LinearLayout.LayoutParams) ((A0) childAt.getLayoutParams())).topMargin + baseline;
    }

    public int getBaselineAlignedChildIndex() {
        return this.f2897b;
    }

    public Drawable getDividerDrawable() {
        return this.f2904k;
    }

    public int getDividerPadding() {
        return this.f2908o;
    }

    public int getDividerWidth() {
        return this.f2905l;
    }

    public int getGravity() {
        return this.f2899e;
    }

    public int getOrientation() {
        return this.d;
    }

    public int getShowDividers() {
        return this.f2907n;
    }

    public int getVirtualChildCount() {
        return getChildCount();
    }

    public float getWeightSum() {
        return this.f2901g;
    }

    @Override // android.view.ViewGroup
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public A0 generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof A0 ? new A0((A0) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new A0((ViewGroup.MarginLayoutParams) layoutParams) : new A0(layoutParams);
    }

    public final boolean i(int i) {
        if (i == 0) {
            return (this.f2907n & 1) != 0;
        }
        if (i == getChildCount()) {
            return (this.f2907n & 4) != 0;
        }
        if ((this.f2907n & 2) == 0) {
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
        if (this.f2904k == null) {
            return;
        }
        int i2 = 0;
        if (this.d == 1) {
            int virtualChildCount = getVirtualChildCount();
            while (i2 < virtualChildCount) {
                View childAt = getChildAt(i2);
                if (childAt != null && childAt.getVisibility() != 8 && i(i2)) {
                    d(canvas, (childAt.getTop() - ((LinearLayout.LayoutParams) ((A0) childAt.getLayoutParams())).topMargin) - this.f2906m);
                }
                i2++;
            }
            if (i(virtualChildCount)) {
                View childAt2 = getChildAt(virtualChildCount - 1);
                d(canvas, childAt2 == null ? (getHeight() - getPaddingBottom()) - this.f2906m : childAt2.getBottom() + ((LinearLayout.LayoutParams) ((A0) childAt2.getLayoutParams())).bottomMargin);
                return;
            }
            return;
        }
        int virtualChildCount2 = getVirtualChildCount();
        boolean z2 = o1.f3158a;
        boolean z3 = getLayoutDirection() == 1;
        while (i2 < virtualChildCount2) {
            View childAt3 = getChildAt(i2);
            if (childAt3 != null && childAt3.getVisibility() != 8 && i(i2)) {
                A0 a02 = (A0) childAt3.getLayoutParams();
                e(canvas, z3 ? childAt3.getRight() + ((LinearLayout.LayoutParams) a02).rightMargin : (childAt3.getLeft() - ((LinearLayout.LayoutParams) a02).leftMargin) - this.f2905l);
            }
            i2++;
        }
        if (i(virtualChildCount2)) {
            View childAt4 = getChildAt(virtualChildCount2 - 1);
            if (childAt4 != null) {
                A0 a03 = (A0) childAt4.getLayoutParams();
                if (z3) {
                    left = childAt4.getLeft() - ((LinearLayout.LayoutParams) a03).leftMargin;
                    i = this.f2905l;
                    right = left - i;
                } else {
                    right = childAt4.getRight() + ((LinearLayout.LayoutParams) a03).rightMargin;
                }
            } else if (z3) {
                right = getPaddingLeft();
            } else {
                left = getWidth() - getPaddingRight();
                i = this.f2905l;
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
        if (this.d == 1) {
            int paddingLeft = getPaddingLeft();
            int i20 = i3 - i;
            int paddingRight = i20 - getPaddingRight();
            int paddingRight2 = (i20 - paddingLeft) - getPaddingRight();
            int virtualChildCount = getVirtualChildCount();
            int i21 = this.f2899e;
            int i22 = i21 & 112;
            int i23 = 8388615 & i21;
            int paddingTop = i22 != 16 ? i22 != 80 ? getPaddingTop() : ((getPaddingTop() + i4) - i2) - this.f2900f : getPaddingTop() + (((i4 - i2) - this.f2900f) / 2);
            int i24 = 0;
            while (i24 < virtualChildCount) {
                View childAt = getChildAt(i24);
                if (childAt != null && childAt.getVisibility() != i19) {
                    int measuredWidth = childAt.getMeasuredWidth();
                    int measuredHeight = childAt.getMeasuredHeight();
                    A0 a02 = (A0) childAt.getLayoutParams();
                    int i25 = ((LinearLayout.LayoutParams) a02).gravity;
                    if (i25 < 0) {
                        i25 = i23;
                    }
                    int absoluteGravity = Gravity.getAbsoluteGravity(i25, getLayoutDirection()) & 7;
                    if (absoluteGravity == 1) {
                        i16 = ((paddingRight2 - measuredWidth) / 2) + paddingLeft + ((LinearLayout.LayoutParams) a02).leftMargin;
                        i17 = ((LinearLayout.LayoutParams) a02).rightMargin;
                    } else if (absoluteGravity != 5) {
                        i18 = ((LinearLayout.LayoutParams) a02).leftMargin + paddingLeft;
                        if (i(i24)) {
                            paddingTop += this.f2906m;
                        }
                        int i26 = paddingTop + ((LinearLayout.LayoutParams) a02).topMargin;
                        childAt.layout(i18, i26, measuredWidth + i18, i26 + measuredHeight);
                        paddingTop = measuredHeight + ((LinearLayout.LayoutParams) a02).bottomMargin + i26;
                    } else {
                        i16 = paddingRight - measuredWidth;
                        i17 = ((LinearLayout.LayoutParams) a02).rightMargin;
                    }
                    i18 = i16 - i17;
                    if (i(i24)) {
                    }
                    int i262 = paddingTop + ((LinearLayout.LayoutParams) a02).topMargin;
                    childAt.layout(i18, i262, measuredWidth + i18, i262 + measuredHeight);
                    paddingTop = measuredHeight + ((LinearLayout.LayoutParams) a02).bottomMargin + i262;
                }
                i24++;
                i19 = 8;
            }
            return;
        }
        boolean z3 = o1.f3158a;
        boolean z4 = getLayoutDirection() == 1;
        int paddingTop2 = getPaddingTop();
        int i27 = i4 - i2;
        int paddingBottom = i27 - getPaddingBottom();
        int paddingBottom2 = (i27 - paddingTop2) - getPaddingBottom();
        int virtualChildCount2 = getVirtualChildCount();
        int i28 = this.f2899e;
        int i29 = 8388615 & i28;
        int i30 = i28 & 112;
        boolean z5 = this.f2896a;
        int[] iArr = this.i;
        int[] iArr2 = this.f2903j;
        int absoluteGravity2 = Gravity.getAbsoluteGravity(i29, getLayoutDirection());
        int paddingLeft2 = absoluteGravity2 != 1 ? absoluteGravity2 != 5 ? getPaddingLeft() : ((getPaddingLeft() + i3) - i) - this.f2900f : getPaddingLeft() + (((i3 - i) - this.f2900f) / 2);
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
                    A0 a03 = (A0) childAt2.getLayoutParams();
                    i8 = i5;
                    if (z5) {
                        i9 = virtualChildCount2;
                        if (((LinearLayout.LayoutParams) a03).height != -1) {
                            i12 = childAt2.getBaseline();
                            i13 = ((LinearLayout.LayoutParams) a03).gravity;
                            if (i13 < 0) {
                                i13 = i30;
                            }
                            i14 = i13 & 112;
                            i10 = i30;
                            if (i14 != 16) {
                                i15 = ((((paddingBottom2 - measuredHeight2) / 2) + paddingTop2) + ((LinearLayout.LayoutParams) a03).topMargin) - ((LinearLayout.LayoutParams) a03).bottomMargin;
                            } else if (i14 == 48) {
                                i15 = ((LinearLayout.LayoutParams) a03).topMargin + paddingTop2;
                                if (i12 != -1) {
                                    i15 = (iArr[1] - i12) + i15;
                                }
                            } else if (i14 != 80) {
                                i15 = paddingTop2;
                            } else {
                                i15 = (paddingBottom - measuredHeight2) - ((LinearLayout.LayoutParams) a03).bottomMargin;
                                if (i12 != -1) {
                                    i15 -= iArr2[2] - (childAt2.getMeasuredHeight() - i12);
                                }
                            }
                            if (i(i32)) {
                                paddingLeft2 += this.f2905l;
                            }
                            int i33 = paddingLeft2 + ((LinearLayout.LayoutParams) a03).leftMargin;
                            childAt2.layout(i33, i15, i33 + measuredWidth2, i15 + measuredHeight2);
                            paddingLeft2 = measuredWidth2 + ((LinearLayout.LayoutParams) a03).rightMargin + i33;
                        }
                    } else {
                        i9 = virtualChildCount2;
                    }
                    i12 = -1;
                    i13 = ((LinearLayout.LayoutParams) a03).gravity;
                    if (i13 < 0) {
                    }
                    i14 = i13 & 112;
                    i10 = i30;
                    if (i14 != 16) {
                    }
                    if (i(i32)) {
                    }
                    int i332 = paddingLeft2 + ((LinearLayout.LayoutParams) a03).leftMargin;
                    childAt2.layout(i332, i15, i332 + measuredWidth2, i15 + measuredHeight2);
                    paddingLeft2 = measuredWidth2 + ((LinearLayout.LayoutParams) a03).rightMargin + i332;
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
        A0 a02;
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
        A0 a03;
        boolean z8;
        int i33;
        boolean z9;
        int max2;
        int i34 = this.d;
        int i35 = -2;
        int i36 = 1073741824;
        int i37 = 8;
        int i38 = Integer.MIN_VALUE;
        float f5 = RecyclerView.A0;
        boolean z10 = true;
        if (i34 == 1) {
            this.f2900f = 0;
            int virtualChildCount = getVirtualChildCount();
            int mode = View.MeasureSpec.getMode(i);
            int mode2 = View.MeasureSpec.getMode(i2);
            int i39 = this.f2897b;
            boolean z11 = this.f2902h;
            boolean z12 = true;
            int i40 = 0;
            int i41 = 0;
            int i42 = 0;
            boolean z13 = false;
            int i43 = 0;
            int i44 = 0;
            int i45 = 0;
            boolean z14 = false;
            float f6 = 0.0f;
            while (i40 < virtualChildCount) {
                View childAt = getChildAt(i40);
                if (childAt == null) {
                    this.f2900f = this.f2900f;
                } else if (childAt.getVisibility() != i37) {
                    if (i(i40)) {
                        this.f2900f += this.f2906m;
                    }
                    A0 a04 = (A0) childAt.getLayoutParams();
                    float f7 = ((LinearLayout.LayoutParams) a04).weight;
                    f6 += f7;
                    if (mode2 == i36 && ((LinearLayout.LayoutParams) a04).height == 0 && f7 > f5) {
                        int i46 = this.f2900f;
                        this.f2900f = Math.max(i46, ((LinearLayout.LayoutParams) a04).topMargin + i46 + ((LinearLayout.LayoutParams) a04).bottomMargin);
                        i29 = i39;
                        i30 = mode2;
                        i31 = mode;
                        i32 = virtualChildCount;
                        a03 = a04;
                        z8 = true;
                        z7 = true;
                    } else {
                        if (((LinearLayout.LayoutParams) a04).height != 0 || f7 <= f5) {
                            i28 = i38;
                        } else {
                            ((LinearLayout.LayoutParams) a04).height = i35;
                            i28 = 0;
                        }
                        int i47 = f6 == f5 ? this.f2900f : 0;
                        i29 = i39;
                        i30 = mode2;
                        i31 = mode;
                        i32 = virtualChildCount;
                        z7 = true;
                        a03 = a04;
                        measureChildWithMargins(childAt, i, 0, i2, i47);
                        if (i28 != i38) {
                            ((LinearLayout.LayoutParams) a03).height = i28;
                        }
                        int measuredHeight = childAt.getMeasuredHeight();
                        int i48 = this.f2900f;
                        this.f2900f = Math.max(i48, i48 + measuredHeight + ((LinearLayout.LayoutParams) a03).topMargin + ((LinearLayout.LayoutParams) a03).bottomMargin);
                        int i49 = i43;
                        if (z11) {
                            i43 = Math.max(measuredHeight, i49);
                        }
                        z8 = z13;
                    }
                    if (i29 >= 0 && i29 == i40 + 1) {
                        this.f2898c = this.f2900f;
                    }
                    if (i40 < i29 && ((LinearLayout.LayoutParams) a03).weight > RecyclerView.A0) {
                        throw new RuntimeException("A child of LinearLayout with index less than mBaselineAlignedChildIndex has weight > 0, which won't work.  Either remove the weight, or don't set mBaselineAlignedChildIndex.");
                    }
                    i33 = i31;
                    if (i33 == 1073741824 || ((LinearLayout.LayoutParams) a03).width != -1) {
                        z9 = false;
                    } else {
                        z9 = z7;
                        z14 = z9;
                    }
                    int i50 = ((LinearLayout.LayoutParams) a03).leftMargin + ((LinearLayout.LayoutParams) a03).rightMargin;
                    int measuredWidth = childAt.getMeasuredWidth() + i50;
                    max2 = Math.max(i44, measuredWidth);
                    int combineMeasuredStates = View.combineMeasuredStates(i45, childAt.getMeasuredState());
                    boolean z15 = (z12 && ((LinearLayout.LayoutParams) a03).width == -1) ? z7 : false;
                    if (((LinearLayout.LayoutParams) a03).weight > RecyclerView.A0) {
                        if (!z9) {
                            i50 = measuredWidth;
                        }
                        i42 = Math.max(i42, i50);
                    } else {
                        int i51 = i42;
                        if (!z9) {
                            i50 = measuredWidth;
                        }
                        i41 = Math.max(i41, i50);
                        i42 = i51;
                    }
                    z13 = z8;
                    i45 = combineMeasuredStates;
                    z12 = z15;
                    i40++;
                    mode = i33;
                    i44 = max2;
                    i39 = i29;
                    z10 = z7;
                    mode2 = i30;
                    virtualChildCount = i32;
                    i35 = -2;
                    i36 = 1073741824;
                    i37 = 8;
                    i38 = Integer.MIN_VALUE;
                    f5 = RecyclerView.A0;
                }
                i29 = i39;
                i30 = mode2;
                i33 = mode;
                i32 = virtualChildCount;
                max2 = i44;
                z7 = true;
                i40++;
                mode = i33;
                i44 = max2;
                i39 = i29;
                z10 = z7;
                mode2 = i30;
                virtualChildCount = i32;
                i35 = -2;
                i36 = 1073741824;
                i37 = 8;
                i38 = Integer.MIN_VALUE;
                f5 = RecyclerView.A0;
            }
            int i52 = mode2;
            int i53 = mode;
            int i54 = virtualChildCount;
            boolean z16 = z10;
            int i55 = i41;
            int i56 = i42;
            int i57 = i43;
            int i58 = i44;
            int i59 = i45;
            if (this.f2900f > 0 && i(i54)) {
                this.f2900f += this.f2906m;
            }
            int i60 = i52;
            if (z11 && (i60 == Integer.MIN_VALUE || i60 == 0)) {
                this.f2900f = 0;
                for (int i61 = 0; i61 < i54; i61++) {
                    View childAt2 = getChildAt(i61);
                    if (childAt2 == null) {
                        this.f2900f = this.f2900f;
                    } else if (childAt2.getVisibility() != 8) {
                        A0 a05 = (A0) childAt2.getLayoutParams();
                        int i62 = this.f2900f;
                        this.f2900f = Math.max(i62, i62 + i57 + ((LinearLayout.LayoutParams) a05).topMargin + ((LinearLayout.LayoutParams) a05).bottomMargin);
                    }
                }
            }
            int paddingBottom = getPaddingBottom() + getPaddingTop() + this.f2900f;
            this.f2900f = paddingBottom;
            int resolveSizeAndState = View.resolveSizeAndState(Math.max(paddingBottom, getSuggestedMinimumHeight()), i2, 0);
            int i63 = (16777215 & resolveSizeAndState) - this.f2900f;
            if (z13 || (i63 != 0 && f6 > RecyclerView.A0)) {
                float f8 = this.f2901g;
                if (f8 > RecyclerView.A0) {
                    f6 = f8;
                }
                this.f2900f = 0;
                int i64 = 0;
                while (i64 < i54) {
                    View childAt3 = getChildAt(i64);
                    if (childAt3.getVisibility() == 8) {
                        i25 = i60;
                    } else {
                        A0 a06 = (A0) childAt3.getLayoutParams();
                        float f9 = ((LinearLayout.LayoutParams) a06).weight;
                        if (f9 > RecyclerView.A0) {
                            int i65 = (int) ((i63 * f9) / f6);
                            f6 -= f9;
                            int i66 = i63 - i65;
                            int childMeasureSpec = ViewGroup.getChildMeasureSpec(i, getPaddingRight() + getPaddingLeft() + ((LinearLayout.LayoutParams) a06).leftMargin + ((LinearLayout.LayoutParams) a06).rightMargin, ((LinearLayout.LayoutParams) a06).width);
                            if (((LinearLayout.LayoutParams) a06).height == 0) {
                                i27 = 1073741824;
                                if (i60 == 1073741824) {
                                    if (i65 <= 0) {
                                        i65 = 0;
                                    }
                                    childAt3.measure(childMeasureSpec, View.MeasureSpec.makeMeasureSpec(i65, 1073741824));
                                    i59 = View.combineMeasuredStates(i59, childAt3.getMeasuredState() & (-256));
                                    i63 = i66;
                                }
                            } else {
                                i27 = 1073741824;
                            }
                            int measuredHeight2 = childAt3.getMeasuredHeight() + i65;
                            if (measuredHeight2 < 0) {
                                measuredHeight2 = 0;
                            }
                            childAt3.measure(childMeasureSpec, View.MeasureSpec.makeMeasureSpec(measuredHeight2, i27));
                            i59 = View.combineMeasuredStates(i59, childAt3.getMeasuredState() & (-256));
                            i63 = i66;
                        }
                        int i67 = ((LinearLayout.LayoutParams) a06).leftMargin + ((LinearLayout.LayoutParams) a06).rightMargin;
                        int measuredWidth2 = childAt3.getMeasuredWidth() + i67;
                        int max3 = Math.max(i58, measuredWidth2);
                        if (i53 != 1073741824) {
                            i25 = i60;
                            i26 = -1;
                        } else {
                            i25 = i60;
                            i26 = -1;
                        }
                        i67 = measuredWidth2;
                        i55 = Math.max(i55, i67);
                        boolean z17 = (z12 && ((LinearLayout.LayoutParams) a06).width == i26) ? z16 : false;
                        int i68 = this.f2900f;
                        this.f2900f = Math.max(i68, childAt3.getMeasuredHeight() + i68 + ((LinearLayout.LayoutParams) a06).topMargin + ((LinearLayout.LayoutParams) a06).bottomMargin);
                        z12 = z17;
                        i58 = max3;
                    }
                    i64++;
                    i60 = i25;
                }
                this.f2900f = getPaddingBottom() + getPaddingTop() + this.f2900f;
            } else {
                i55 = Math.max(i55, i56);
                if (z11 && i60 != 1073741824) {
                    for (int i69 = 0; i69 < i54; i69++) {
                        View childAt4 = getChildAt(i69);
                        if (childAt4 != null && childAt4.getVisibility() != 8 && ((LinearLayout.LayoutParams) ((A0) childAt4.getLayoutParams())).weight > RecyclerView.A0) {
                            childAt4.measure(View.MeasureSpec.makeMeasureSpec(childAt4.getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(i57, 1073741824));
                        }
                    }
                }
            }
            int i70 = i58;
            if (z12 || i53 == 1073741824) {
                i55 = i70;
            }
            setMeasuredDimension(View.resolveSizeAndState(Math.max(getPaddingRight() + getPaddingLeft() + i55, getSuggestedMinimumWidth()), i, i59), resolveSizeAndState);
            if (z14) {
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824);
                for (int i71 = 0; i71 < i54; i71++) {
                    View childAt5 = getChildAt(i71);
                    if (childAt5.getVisibility() != 8) {
                        A0 a07 = (A0) childAt5.getLayoutParams();
                        if (((LinearLayout.LayoutParams) a07).width == -1) {
                            int i72 = ((LinearLayout.LayoutParams) a07).height;
                            ((LinearLayout.LayoutParams) a07).height = childAt5.getMeasuredHeight();
                            measureChildWithMargins(childAt5, makeMeasureSpec, 0, i2, 0);
                            ((LinearLayout.LayoutParams) a07).height = i72;
                        }
                    }
                }
                return;
            }
            return;
        }
        this.f2900f = 0;
        int virtualChildCount2 = getVirtualChildCount();
        int mode3 = View.MeasureSpec.getMode(i);
        int mode4 = View.MeasureSpec.getMode(i2);
        if (this.i == null || this.f2903j == null) {
            this.i = new int[4];
            this.f2903j = new int[4];
        }
        int[] iArr = this.i;
        int[] iArr2 = this.f2903j;
        iArr[3] = -1;
        iArr[2] = -1;
        iArr[1] = -1;
        iArr[0] = -1;
        iArr2[3] = -1;
        iArr2[2] = -1;
        iArr2[1] = -1;
        iArr2[0] = -1;
        boolean z18 = this.f2896a;
        boolean z19 = this.f2902h;
        boolean z20 = mode3 == 1073741824;
        boolean z21 = true;
        int i73 = 0;
        float f10 = RecyclerView.A0;
        int i74 = 0;
        int i75 = 0;
        int i76 = 0;
        int i77 = 0;
        int i78 = 0;
        boolean z22 = false;
        boolean z23 = false;
        while (i75 < virtualChildCount2) {
            View childAt6 = getChildAt(i75);
            if (childAt6 == null) {
                this.f2900f = this.f2900f;
                i20 = i75;
                z3 = z19;
                z4 = z18;
            } else {
                int i79 = i73;
                int i80 = i74;
                if (childAt6.getVisibility() == 8) {
                    z4 = z18;
                    i73 = i79;
                    i74 = i80;
                    i20 = i75;
                    z3 = z19;
                } else {
                    if (i(i75)) {
                        this.f2900f += this.f2905l;
                    }
                    A0 a08 = (A0) childAt6.getLayoutParams();
                    float f11 = ((LinearLayout.LayoutParams) a08).weight;
                    float f12 = f10 + f11;
                    if (mode3 == 1073741824 && ((LinearLayout.LayoutParams) a08).width == 0 && f11 > RecyclerView.A0) {
                        if (z20) {
                            i24 = i75;
                            this.f2900f = ((LinearLayout.LayoutParams) a08).leftMargin + ((LinearLayout.LayoutParams) a08).rightMargin + this.f2900f;
                        } else {
                            i24 = i75;
                            int i81 = this.f2900f;
                            this.f2900f = Math.max(i81, ((LinearLayout.LayoutParams) a08).leftMargin + i81 + ((LinearLayout.LayoutParams) a08).rightMargin);
                        }
                        if (z18) {
                            int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 0);
                            childAt6.measure(makeMeasureSpec2, makeMeasureSpec2);
                            a02 = a08;
                            i17 = i79;
                            i18 = i80;
                            i20 = i24;
                            z3 = z19;
                            z4 = z18;
                        } else {
                            a02 = a08;
                            i17 = i79;
                            i18 = i80;
                            i20 = i24;
                            i21 = 1073741824;
                            z3 = z19;
                            z4 = z18;
                            z5 = true;
                            if (mode4 == i21 && ((LinearLayout.LayoutParams) a02).height == -1) {
                                z6 = true;
                                z23 = true;
                            } else {
                                z6 = false;
                            }
                            i22 = ((LinearLayout.LayoutParams) a02).topMargin + ((LinearLayout.LayoutParams) a02).bottomMargin;
                            int measuredHeight3 = childAt6.getMeasuredHeight() + i22;
                            int combineMeasuredStates2 = View.combineMeasuredStates(i76, childAt6.getMeasuredState());
                            if (z4 || (baseline2 = childAt6.getBaseline()) == -1) {
                                i23 = i22;
                            } else {
                                int i82 = ((LinearLayout.LayoutParams) a02).gravity;
                                if (i82 < 0) {
                                    i82 = this.f2899e;
                                }
                                int i83 = (((i82 & 112) >> 4) & (-2)) >> 1;
                                i23 = i22;
                                iArr[i83] = Math.max(iArr[i83], baseline2);
                                iArr2[i83] = Math.max(iArr2[i83], measuredHeight3 - baseline2);
                            }
                            int max4 = Math.max(i18, measuredHeight3);
                            boolean z24 = !z21 && ((LinearLayout.LayoutParams) a02).height == -1;
                            if (((LinearLayout.LayoutParams) a02).weight <= RecyclerView.A0) {
                                if (z6) {
                                    measuredHeight3 = i23;
                                }
                                i78 = Math.max(i78, measuredHeight3);
                                i73 = i17;
                            } else {
                                if (z6) {
                                    measuredHeight3 = i23;
                                }
                                i73 = Math.max(i17, measuredHeight3);
                            }
                            i74 = max4;
                            i76 = combineMeasuredStates2;
                            z22 = z5;
                            z21 = z24;
                            f10 = f12;
                        }
                    } else {
                        int i84 = i75;
                        if (((LinearLayout.LayoutParams) a08).width == 0) {
                            f4 = RecyclerView.A0;
                            if (f11 > RecyclerView.A0) {
                                ((LinearLayout.LayoutParams) a08).width = -2;
                                i16 = 0;
                                i17 = i79;
                                i18 = i80;
                                i19 = i16;
                                i20 = i84;
                                z3 = z19;
                                z4 = z18;
                                measureChildWithMargins(childAt6, i, f12 != f4 ? this.f2900f : 0, i2, 0);
                                if (i19 == Integer.MIN_VALUE) {
                                    a02 = a08;
                                    ((LinearLayout.LayoutParams) a02).width = i19;
                                } else {
                                    a02 = a08;
                                }
                                int measuredWidth3 = childAt6.getMeasuredWidth();
                                if (z20) {
                                    int i85 = this.f2900f;
                                    this.f2900f = Math.max(i85, i85 + measuredWidth3 + ((LinearLayout.LayoutParams) a02).leftMargin + ((LinearLayout.LayoutParams) a02).rightMargin);
                                } else {
                                    this.f2900f = ((LinearLayout.LayoutParams) a02).leftMargin + measuredWidth3 + ((LinearLayout.LayoutParams) a02).rightMargin + this.f2900f;
                                }
                                if (z3) {
                                    i77 = Math.max(measuredWidth3, i77);
                                }
                            }
                        } else {
                            f4 = RecyclerView.A0;
                        }
                        i16 = Integer.MIN_VALUE;
                        i17 = i79;
                        i18 = i80;
                        i19 = i16;
                        i20 = i84;
                        z3 = z19;
                        z4 = z18;
                        measureChildWithMargins(childAt6, i, f12 != f4 ? this.f2900f : 0, i2, 0);
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
                    i22 = ((LinearLayout.LayoutParams) a02).topMargin + ((LinearLayout.LayoutParams) a02).bottomMargin;
                    int measuredHeight32 = childAt6.getMeasuredHeight() + i22;
                    int combineMeasuredStates22 = View.combineMeasuredStates(i76, childAt6.getMeasuredState());
                    if (z4) {
                    }
                    i23 = i22;
                    int max42 = Math.max(i18, measuredHeight32);
                    if (z21) {
                    }
                    if (((LinearLayout.LayoutParams) a02).weight <= RecyclerView.A0) {
                    }
                    i74 = max42;
                    i76 = combineMeasuredStates22;
                    z22 = z5;
                    z21 = z24;
                    f10 = f12;
                }
            }
            i75 = i20 + 1;
            z19 = z3;
            z18 = z4;
        }
        int i86 = i74;
        boolean z25 = z19;
        boolean z26 = z18;
        if (this.f2900f > 0 && i(virtualChildCount2)) {
            this.f2900f += this.f2905l;
        }
        int i87 = iArr[1];
        if (i87 == -1 && iArr[0] == -1 && iArr[2] == -1) {
            c2 = 3;
            if (iArr[3] == -1) {
                max = i86;
                i3 = i76;
                if (z25 && (mode3 == Integer.MIN_VALUE || mode3 == 0)) {
                    this.f2900f = 0;
                    for (i15 = 0; i15 < virtualChildCount2; i15++) {
                        View childAt7 = getChildAt(i15);
                        if (childAt7 == null) {
                            this.f2900f = this.f2900f;
                        } else if (childAt7.getVisibility() != 8) {
                            A0 a09 = (A0) childAt7.getLayoutParams();
                            if (z20) {
                                this.f2900f = ((LinearLayout.LayoutParams) a09).leftMargin + i77 + ((LinearLayout.LayoutParams) a09).rightMargin + this.f2900f;
                            } else {
                                int i88 = this.f2900f;
                                this.f2900f = Math.max(i88, i88 + i77 + ((LinearLayout.LayoutParams) a09).leftMargin + ((LinearLayout.LayoutParams) a09).rightMargin);
                            }
                        }
                    }
                }
                int paddingRight = getPaddingRight() + getPaddingLeft() + this.f2900f;
                this.f2900f = paddingRight;
                int resolveSizeAndState2 = View.resolveSizeAndState(Math.max(paddingRight, getSuggestedMinimumWidth()), i, 0);
                int i89 = (16777215 & resolveSizeAndState2) - this.f2900f;
                if (!z22 || (i89 != 0 && f10 > RecyclerView.A0)) {
                    f2 = this.f2901g;
                    if (f2 > RecyclerView.A0) {
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
                    this.f2900f = 0;
                    int i90 = i3;
                    max = -1;
                    i4 = 0;
                    while (i4 < virtualChildCount2) {
                        View childAt8 = getChildAt(i4);
                        if (childAt8 == null || childAt8.getVisibility() == 8) {
                            i9 = i89;
                            i10 = virtualChildCount2;
                        } else {
                            A0 a010 = (A0) childAt8.getLayoutParams();
                            float f13 = ((LinearLayout.LayoutParams) a010).weight;
                            if (f13 > RecyclerView.A0) {
                                i10 = virtualChildCount2;
                                int i91 = (int) ((i89 * f13) / f10);
                                float f14 = f10 - f13;
                                int i92 = i89 - i91;
                                int childMeasureSpec2 = ViewGroup.getChildMeasureSpec(i2, getPaddingBottom() + getPaddingTop() + ((LinearLayout.LayoutParams) a010).topMargin + ((LinearLayout.LayoutParams) a010).bottomMargin, ((LinearLayout.LayoutParams) a010).height);
                                if (((LinearLayout.LayoutParams) a010).width == 0) {
                                    i14 = 1073741824;
                                    if (mode3 == 1073741824) {
                                        if (i91 <= 0) {
                                            i91 = 0;
                                        }
                                        childAt8.measure(View.MeasureSpec.makeMeasureSpec(i91, 1073741824), childMeasureSpec2);
                                        i90 = View.combineMeasuredStates(i90, childAt8.getMeasuredState() & (-16777216));
                                        f10 = f14;
                                        i11 = i92;
                                    }
                                } else {
                                    i14 = 1073741824;
                                }
                                int measuredWidth4 = childAt8.getMeasuredWidth() + i91;
                                if (measuredWidth4 < 0) {
                                    measuredWidth4 = 0;
                                }
                                childAt8.measure(View.MeasureSpec.makeMeasureSpec(measuredWidth4, i14), childMeasureSpec2);
                                i90 = View.combineMeasuredStates(i90, childAt8.getMeasuredState() & (-16777216));
                                f10 = f14;
                                i11 = i92;
                            } else {
                                i11 = i89;
                                i10 = virtualChildCount2;
                            }
                            if (z20) {
                                f3 = f10;
                                this.f2900f = childAt8.getMeasuredWidth() + ((LinearLayout.LayoutParams) a010).leftMargin + ((LinearLayout.LayoutParams) a010).rightMargin + this.f2900f;
                                i12 = i11;
                            } else {
                                f3 = f10;
                                int i93 = this.f2900f;
                                i12 = i11;
                                this.f2900f = Math.max(i93, childAt8.getMeasuredWidth() + i93 + ((LinearLayout.LayoutParams) a010).leftMargin + ((LinearLayout.LayoutParams) a010).rightMargin);
                            }
                            boolean z27 = mode4 != 1073741824 && ((LinearLayout.LayoutParams) a010).height == -1;
                            int i94 = ((LinearLayout.LayoutParams) a010).topMargin + ((LinearLayout.LayoutParams) a010).bottomMargin;
                            int measuredHeight4 = childAt8.getMeasuredHeight() + i94;
                            max = Math.max(max, measuredHeight4);
                            if (!z27) {
                                i94 = measuredHeight4;
                            }
                            i73 = Math.max(i73, i94);
                            if (z21) {
                                i13 = -1;
                                if (((LinearLayout.LayoutParams) a010).height == -1) {
                                    z2 = true;
                                    if (!z26 && (baseline = childAt8.getBaseline()) != i13) {
                                        int i95 = ((LinearLayout.LayoutParams) a010).gravity;
                                        if (i95 < 0) {
                                            i95 = this.f2899e;
                                        }
                                        int i96 = (((i95 & 112) >> 4) & (-2)) >> 1;
                                        iArr[i96] = Math.max(iArr[i96], baseline);
                                        iArr2[i96] = Math.max(iArr2[i96], measuredHeight4 - baseline);
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
                        i89 = i9;
                        virtualChildCount2 = i10;
                    }
                    i5 = i2;
                    i6 = virtualChildCount2;
                    this.f2900f = getPaddingRight() + getPaddingLeft() + this.f2900f;
                    i7 = iArr[1];
                    if (i7 != -1 && iArr[0] == -1 && iArr[2] == -1) {
                        c3 = 3;
                        if (iArr[3] == -1) {
                            i8 = 0;
                            i3 = i90;
                        }
                    } else {
                        c3 = 3;
                    }
                    i8 = 0;
                    max = Math.max(max, Math.max(iArr2[c3], Math.max(iArr2[0], Math.max(iArr2[1], iArr2[2]))) + Math.max(iArr[c3], Math.max(iArr[0], Math.max(i7, iArr[2]))));
                    i3 = i90;
                } else {
                    i73 = Math.max(i73, i78);
                    if (z25 && mode3 != 1073741824) {
                        for (int i97 = 0; i97 < virtualChildCount2; i97++) {
                            View childAt9 = getChildAt(i97);
                            if (childAt9 != null && childAt9.getVisibility() != 8 && ((LinearLayout.LayoutParams) ((A0) childAt9.getLayoutParams())).weight > RecyclerView.A0) {
                                childAt9.measure(View.MeasureSpec.makeMeasureSpec(i77, 1073741824), View.MeasureSpec.makeMeasureSpec(childAt9.getMeasuredHeight(), 1073741824));
                            }
                        }
                    }
                    i5 = i2;
                    i6 = virtualChildCount2;
                    i8 = 0;
                }
                if (!z21 || mode4 == 1073741824) {
                    i73 = max;
                }
                setMeasuredDimension((i3 & (-16777216)) | resolveSizeAndState2, View.resolveSizeAndState(Math.max(getPaddingBottom() + getPaddingTop() + i73, getSuggestedMinimumHeight()), i5, i3 << 16));
                if (z23) {
                    return;
                }
                int makeMeasureSpec3 = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824);
                int i98 = i6;
                while (i8 < i98) {
                    View childAt10 = getChildAt(i8);
                    if (childAt10.getVisibility() != 8) {
                        A0 a011 = (A0) childAt10.getLayoutParams();
                        if (((LinearLayout.LayoutParams) a011).height == -1) {
                            int i99 = ((LinearLayout.LayoutParams) a011).width;
                            ((LinearLayout.LayoutParams) a011).width = childAt10.getMeasuredWidth();
                            measureChildWithMargins(childAt10, i, 0, makeMeasureSpec3, 0);
                            ((LinearLayout.LayoutParams) a011).width = i99;
                        }
                    }
                    i8++;
                }
                return;
            }
        } else {
            c2 = 3;
        }
        i3 = i76;
        max = Math.max(i86, Math.max(iArr2[3], Math.max(iArr2[0], Math.max(iArr2[1], iArr2[2]))) + Math.max(iArr[c2], Math.max(iArr[0], Math.max(i87, iArr[2]))));
        if (z25) {
            this.f2900f = 0;
            while (i15 < virtualChildCount2) {
            }
        }
        int paddingRight2 = getPaddingRight() + getPaddingLeft() + this.f2900f;
        this.f2900f = paddingRight2;
        int resolveSizeAndState22 = View.resolveSizeAndState(Math.max(paddingRight2, getSuggestedMinimumWidth()), i, 0);
        int i892 = (16777215 & resolveSizeAndState22) - this.f2900f;
        if (z22) {
        }
        f2 = this.f2901g;
        if (f2 > RecyclerView.A0) {
        }
        iArr[3] = -1;
        iArr[2] = -1;
        iArr[1] = -1;
        iArr[0] = -1;
        iArr2[3] = -1;
        iArr2[2] = -1;
        iArr2[1] = -1;
        iArr2[0] = -1;
        this.f2900f = 0;
        int i902 = i3;
        max = -1;
        i4 = 0;
        while (i4 < virtualChildCount2) {
        }
        i5 = i2;
        i6 = virtualChildCount2;
        this.f2900f = getPaddingRight() + getPaddingLeft() + this.f2900f;
        i7 = iArr[1];
        if (i7 != -1) {
        }
        c3 = 3;
        i8 = 0;
        max = Math.max(max, Math.max(iArr2[c3], Math.max(iArr2[0], Math.max(iArr2[1], iArr2[2]))) + Math.max(iArr[c3], Math.max(iArr[0], Math.max(i7, iArr[2]))));
        i3 = i902;
        if (!z21) {
        }
        i73 = max;
        setMeasuredDimension((i3 & (-16777216)) | resolveSizeAndState22, View.resolveSizeAndState(Math.max(getPaddingBottom() + getPaddingTop() + i73, getSuggestedMinimumHeight()), i5, i3 << 16));
        if (z23) {
        }
    }

    public void setBaselineAligned(boolean z2) {
        this.f2896a = z2;
    }

    public void setBaselineAlignedChildIndex(int i) {
        if (i >= 0 && i < getChildCount()) {
            this.f2897b = i;
            return;
        }
        throw new IllegalArgumentException("base aligned child index out of range (0, " + getChildCount() + ")");
    }

    public void setDividerDrawable(Drawable drawable) {
        if (drawable == this.f2904k) {
            return;
        }
        this.f2904k = drawable;
        if (drawable != null) {
            this.f2905l = drawable.getIntrinsicWidth();
            this.f2906m = drawable.getIntrinsicHeight();
        } else {
            this.f2905l = 0;
            this.f2906m = 0;
        }
        setWillNotDraw(drawable == null);
        requestLayout();
    }

    public void setDividerPadding(int i) {
        this.f2908o = i;
    }

    public void setGravity(int i) {
        if (this.f2899e != i) {
            if ((8388615 & i) == 0) {
                i |= 8388611;
            }
            if ((i & 112) == 0) {
                i |= 48;
            }
            this.f2899e = i;
            requestLayout();
        }
    }

    public void setHorizontalGravity(int i) {
        int i2 = i & 8388615;
        int i3 = this.f2899e;
        if ((8388615 & i3) != i2) {
            this.f2899e = i2 | ((-8388616) & i3);
            requestLayout();
        }
    }

    public void setMeasureWithLargestChildEnabled(boolean z2) {
        this.f2902h = z2;
    }

    public void setOrientation(int i) {
        if (this.d != i) {
            this.d = i;
            requestLayout();
        }
    }

    public void setShowDividers(int i) {
        if (i != this.f2907n) {
            requestLayout();
        }
        this.f2907n = i;
    }

    public void setVerticalGravity(int i) {
        int i2 = i & 112;
        int i3 = this.f2899e;
        if ((i3 & 112) != i2) {
            this.f2899e = i2 | (i3 & (-113));
            requestLayout();
        }
    }

    public void setWeightSum(float f2) {
        this.f2901g = Math.max(RecyclerView.A0, f2);
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }
}
