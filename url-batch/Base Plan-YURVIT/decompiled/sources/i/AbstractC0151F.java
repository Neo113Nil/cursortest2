package i;

import B0.C0008i;
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
import d.AbstractC0119a;
import java.lang.reflect.Field;

/* renamed from: i.F, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0151F extends ViewGroup {

    /* renamed from: e, reason: collision with root package name */
    public boolean f2112e;

    /* renamed from: f, reason: collision with root package name */
    public int f2113f;

    /* renamed from: g, reason: collision with root package name */
    public int f2114g;

    /* renamed from: h, reason: collision with root package name */
    public int f2115h;

    /* renamed from: i, reason: collision with root package name */
    public int f2116i;

    /* renamed from: j, reason: collision with root package name */
    public int f2117j;

    /* renamed from: k, reason: collision with root package name */
    public float f2118k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f2119l;

    /* renamed from: m, reason: collision with root package name */
    public int[] f2120m;

    /* renamed from: n, reason: collision with root package name */
    public int[] f2121n;

    /* renamed from: o, reason: collision with root package name */
    public Drawable f2122o;

    /* renamed from: p, reason: collision with root package name */
    public int f2123p;

    /* renamed from: q, reason: collision with root package name */
    public int f2124q;

    /* renamed from: r, reason: collision with root package name */
    public int f2125r;

    /* renamed from: s, reason: collision with root package name */
    public int f2126s;

    public AbstractC0151F(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.f2112e = true;
        this.f2113f = -1;
        this.f2114g = 0;
        this.f2116i = 8388659;
        C0008i D2 = C0008i.D(context, attributeSet, AbstractC0119a.f1795i, i2);
        TypedArray typedArray = (TypedArray) D2.f84f;
        int i3 = typedArray.getInt(1, -1);
        if (i3 >= 0) {
            setOrientation(i3);
        }
        int i4 = typedArray.getInt(0, -1);
        if (i4 >= 0) {
            setGravity(i4);
        }
        boolean z2 = typedArray.getBoolean(2, true);
        if (!z2) {
            setBaselineAligned(z2);
        }
        this.f2118k = typedArray.getFloat(4, -1.0f);
        this.f2113f = typedArray.getInt(3, -1);
        this.f2119l = typedArray.getBoolean(7, false);
        setDividerDrawable(D2.v(5));
        this.f2125r = typedArray.getInt(8, 0);
        this.f2126s = typedArray.getDimensionPixelSize(6, 0);
        D2.G();
    }

    public final void b(Canvas canvas, int i2) {
        this.f2122o.setBounds(getPaddingLeft() + this.f2126s, i2, (getWidth() - getPaddingRight()) - this.f2126s, this.f2124q + i2);
        this.f2122o.draw(canvas);
    }

    public final void c(Canvas canvas, int i2) {
        this.f2122o.setBounds(i2, getPaddingTop() + this.f2126s, this.f2123p + i2, (getHeight() - getPaddingBottom()) - this.f2126s);
        this.f2122o.draw(canvas);
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C0150E;
    }

    @Override // android.view.ViewGroup
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public C0150E generateDefaultLayoutParams() {
        int i2 = this.f2115h;
        if (i2 == 0) {
            return new C0150E(-2);
        }
        if (i2 == 1) {
            return new C0150E(-1);
        }
        return null;
    }

    @Override // android.view.ViewGroup
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public C0150E generateLayoutParams(AttributeSet attributeSet) {
        return new C0150E(getContext(), attributeSet);
    }

    @Override // android.view.ViewGroup
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public C0150E generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new C0150E(layoutParams);
    }

    public final boolean g(int i2) {
        if (i2 == 0) {
            return (this.f2125r & 1) != 0;
        }
        if (i2 == getChildCount()) {
            return (this.f2125r & 4) != 0;
        }
        if ((this.f2125r & 2) != 0) {
            for (int i3 = i2 - 1; i3 >= 0; i3--) {
                if (getChildAt(i3).getVisibility() != 8) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // android.view.View
    public int getBaseline() {
        int i2;
        if (this.f2113f < 0) {
            return super.getBaseline();
        }
        int childCount = getChildCount();
        int i3 = this.f2113f;
        if (childCount <= i3) {
            throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout set to an index that is out of bounds.");
        }
        View childAt = getChildAt(i3);
        int baseline = childAt.getBaseline();
        if (baseline == -1) {
            if (this.f2113f == 0) {
                return -1;
            }
            throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout points to a View that doesn't know how to get its baseline.");
        }
        int i4 = this.f2114g;
        if (this.f2115h == 1 && (i2 = this.f2116i & 112) != 48) {
            if (i2 == 16) {
                i4 += ((((getBottom() - getTop()) - getPaddingTop()) - getPaddingBottom()) - this.f2117j) / 2;
            } else if (i2 == 80) {
                i4 = ((getBottom() - getTop()) - getPaddingBottom()) - this.f2117j;
            }
        }
        return i4 + ((ViewGroup.MarginLayoutParams) ((C0150E) childAt.getLayoutParams())).topMargin + baseline;
    }

    public int getBaselineAlignedChildIndex() {
        return this.f2113f;
    }

    public Drawable getDividerDrawable() {
        return this.f2122o;
    }

    public int getDividerPadding() {
        return this.f2126s;
    }

    public int getDividerWidth() {
        return this.f2123p;
    }

    public int getGravity() {
        return this.f2116i;
    }

    public int getOrientation() {
        return this.f2115h;
    }

    public int getShowDividers() {
        return this.f2125r;
    }

    public int getVirtualChildCount() {
        return getChildCount();
    }

    public float getWeightSum() {
        return this.f2118k;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        int right;
        int left;
        int i2;
        if (this.f2122o == null) {
            return;
        }
        int i3 = 0;
        if (this.f2115h == 1) {
            int virtualChildCount = getVirtualChildCount();
            while (i3 < virtualChildCount) {
                View childAt = getChildAt(i3);
                if (childAt != null && childAt.getVisibility() != 8 && g(i3)) {
                    b(canvas, (childAt.getTop() - ((ViewGroup.MarginLayoutParams) ((C0150E) childAt.getLayoutParams())).topMargin) - this.f2124q);
                }
                i3++;
            }
            if (g(virtualChildCount)) {
                View childAt2 = getChildAt(virtualChildCount - 1);
                b(canvas, childAt2 == null ? (getHeight() - getPaddingBottom()) - this.f2124q : childAt2.getBottom() + ((ViewGroup.MarginLayoutParams) ((C0150E) childAt2.getLayoutParams())).bottomMargin);
                return;
            }
            return;
        }
        int virtualChildCount2 = getVirtualChildCount();
        boolean a2 = w0.a(this);
        while (i3 < virtualChildCount2) {
            View childAt3 = getChildAt(i3);
            if (childAt3 != null && childAt3.getVisibility() != 8 && g(i3)) {
                C0150E c0150e = (C0150E) childAt3.getLayoutParams();
                c(canvas, a2 ? childAt3.getRight() + ((ViewGroup.MarginLayoutParams) c0150e).rightMargin : (childAt3.getLeft() - ((ViewGroup.MarginLayoutParams) c0150e).leftMargin) - this.f2123p);
            }
            i3++;
        }
        if (g(virtualChildCount2)) {
            View childAt4 = getChildAt(virtualChildCount2 - 1);
            if (childAt4 != null) {
                C0150E c0150e2 = (C0150E) childAt4.getLayoutParams();
                if (a2) {
                    left = childAt4.getLeft() - ((ViewGroup.MarginLayoutParams) c0150e2).leftMargin;
                    i2 = this.f2123p;
                    right = left - i2;
                } else {
                    right = childAt4.getRight() + ((ViewGroup.MarginLayoutParams) c0150e2).rightMargin;
                }
            } else if (a2) {
                right = getPaddingLeft();
            } else {
                left = getWidth() - getPaddingRight();
                i2 = this.f2123p;
                right = left - i2;
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
    public void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        char c2;
        int i15;
        int i16;
        int i17;
        int i18 = 8;
        char c3 = 2;
        if (this.f2115h == 1) {
            int paddingLeft = getPaddingLeft();
            int i19 = i4 - i2;
            int paddingRight = i19 - getPaddingRight();
            int paddingRight2 = (i19 - paddingLeft) - getPaddingRight();
            int virtualChildCount = getVirtualChildCount();
            int i20 = this.f2116i;
            int i21 = i20 & 112;
            int i22 = 8388615 & i20;
            int paddingTop = i21 != 16 ? i21 != 80 ? getPaddingTop() : ((getPaddingTop() + i5) - i3) - this.f2117j : getPaddingTop() + (((i5 - i3) - this.f2117j) / 2);
            int i23 = 0;
            while (i23 < virtualChildCount) {
                View childAt = getChildAt(i23);
                if (childAt == null || childAt.getVisibility() == i18) {
                    c2 = c3;
                } else {
                    int measuredWidth = childAt.getMeasuredWidth();
                    int measuredHeight = childAt.getMeasuredHeight();
                    C0150E c0150e = (C0150E) childAt.getLayoutParams();
                    c2 = c3;
                    int i24 = c0150e.f2111b;
                    if (i24 < 0) {
                        i24 = i22;
                    }
                    Field field = y.x.f3160a;
                    int absoluteGravity = Gravity.getAbsoluteGravity(i24, getLayoutDirection()) & 7;
                    if (absoluteGravity == 1) {
                        i15 = ((paddingRight2 - measuredWidth) / 2) + paddingLeft + ((ViewGroup.MarginLayoutParams) c0150e).leftMargin;
                        i16 = ((ViewGroup.MarginLayoutParams) c0150e).rightMargin;
                    } else if (absoluteGravity != 5) {
                        i17 = ((ViewGroup.MarginLayoutParams) c0150e).leftMargin + paddingLeft;
                        if (g(i23)) {
                            paddingTop += this.f2124q;
                        }
                        int i25 = paddingTop + ((ViewGroup.MarginLayoutParams) c0150e).topMargin;
                        childAt.layout(i17, i25, measuredWidth + i17, i25 + measuredHeight);
                        paddingTop = measuredHeight + ((ViewGroup.MarginLayoutParams) c0150e).bottomMargin + i25;
                    } else {
                        i15 = paddingRight - measuredWidth;
                        i16 = ((ViewGroup.MarginLayoutParams) c0150e).rightMargin;
                    }
                    i17 = i15 - i16;
                    if (g(i23)) {
                    }
                    int i252 = paddingTop + ((ViewGroup.MarginLayoutParams) c0150e).topMargin;
                    childAt.layout(i17, i252, measuredWidth + i17, i252 + measuredHeight);
                    paddingTop = measuredHeight + ((ViewGroup.MarginLayoutParams) c0150e).bottomMargin + i252;
                }
                i23++;
                c3 = c2;
                i18 = 8;
            }
            return;
        }
        boolean a2 = w0.a(this);
        int paddingTop2 = getPaddingTop();
        int i26 = i5 - i3;
        int paddingBottom = i26 - getPaddingBottom();
        int paddingBottom2 = (i26 - paddingTop2) - getPaddingBottom();
        int virtualChildCount2 = getVirtualChildCount();
        int i27 = this.f2116i;
        int i28 = 8388615 & i27;
        int i29 = i27 & 112;
        boolean z3 = this.f2112e;
        int[] iArr = this.f2120m;
        int[] iArr2 = this.f2121n;
        Field field2 = y.x.f3160a;
        int absoluteGravity2 = Gravity.getAbsoluteGravity(i28, getLayoutDirection());
        int paddingLeft2 = absoluteGravity2 != 1 ? absoluteGravity2 != 5 ? getPaddingLeft() : ((getPaddingLeft() + i4) - i2) - this.f2117j : getPaddingLeft() + (((i4 - i2) - this.f2117j) / 2);
        if (a2) {
            i7 = virtualChildCount2 - 1;
            i6 = -1;
        } else {
            i6 = 1;
            i7 = 0;
        }
        int i30 = 0;
        while (i30 < virtualChildCount2) {
            int i31 = (i6 * i30) + i7;
            View childAt2 = getChildAt(i31);
            if (childAt2 == null) {
                i8 = i7;
            } else {
                i8 = i7;
                if (childAt2.getVisibility() != 8) {
                    int measuredWidth2 = childAt2.getMeasuredWidth();
                    int measuredHeight2 = childAt2.getMeasuredHeight();
                    C0150E c0150e2 = (C0150E) childAt2.getLayoutParams();
                    int i32 = paddingLeft2;
                    if (z3) {
                        i9 = paddingTop2;
                        if (((ViewGroup.MarginLayoutParams) c0150e2).height != -1) {
                            i10 = childAt2.getBaseline();
                            i11 = c0150e2.f2111b;
                            if (i11 < 0) {
                                i11 = i29;
                            }
                            i12 = i11 & 112;
                            if (i12 == 16) {
                                if (i12 == 48) {
                                    i13 = i9 + ((ViewGroup.MarginLayoutParams) c0150e2).topMargin;
                                    if (i10 != -1) {
                                        i13 = (iArr[1] - i10) + i13;
                                    }
                                } else if (i12 != 80) {
                                    i13 = i9;
                                } else {
                                    i13 = (paddingBottom - measuredHeight2) - ((ViewGroup.MarginLayoutParams) c0150e2).bottomMargin;
                                    if (i10 != -1) {
                                        i14 = iArr2[2] - (childAt2.getMeasuredHeight() - i10);
                                    }
                                }
                                int i33 = (g(i31) ? i32 + this.f2123p : i32) + ((ViewGroup.MarginLayoutParams) c0150e2).leftMargin;
                                childAt2.layout(i33, i13, i33 + measuredWidth2, i13 + measuredHeight2);
                                paddingLeft2 = measuredWidth2 + ((ViewGroup.MarginLayoutParams) c0150e2).rightMargin + i33;
                                i30++;
                                i7 = i8;
                                paddingTop2 = i9;
                            } else {
                                i13 = ((paddingBottom2 - measuredHeight2) / 2) + i9 + ((ViewGroup.MarginLayoutParams) c0150e2).topMargin;
                                i14 = ((ViewGroup.MarginLayoutParams) c0150e2).bottomMargin;
                            }
                            i13 -= i14;
                            int i332 = (g(i31) ? i32 + this.f2123p : i32) + ((ViewGroup.MarginLayoutParams) c0150e2).leftMargin;
                            childAt2.layout(i332, i13, i332 + measuredWidth2, i13 + measuredHeight2);
                            paddingLeft2 = measuredWidth2 + ((ViewGroup.MarginLayoutParams) c0150e2).rightMargin + i332;
                            i30++;
                            i7 = i8;
                            paddingTop2 = i9;
                        }
                    } else {
                        i9 = paddingTop2;
                    }
                    i10 = -1;
                    i11 = c0150e2.f2111b;
                    if (i11 < 0) {
                    }
                    i12 = i11 & 112;
                    if (i12 == 16) {
                    }
                    i13 -= i14;
                    int i3322 = (g(i31) ? i32 + this.f2123p : i32) + ((ViewGroup.MarginLayoutParams) c0150e2).leftMargin;
                    childAt2.layout(i3322, i13, i3322 + measuredWidth2, i13 + measuredHeight2);
                    paddingLeft2 = measuredWidth2 + ((ViewGroup.MarginLayoutParams) c0150e2).rightMargin + i3322;
                    i30++;
                    i7 = i8;
                    paddingTop2 = i9;
                }
            }
            i9 = paddingTop2;
            i30++;
            i7 = i8;
            paddingTop2 = i9;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:221:0x04f9  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x053e  */
    /* JADX WARN: Removed duplicated region for block: B:239:0x0548  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x0527  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onMeasure(int i2, int i3) {
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        boolean z2;
        int baseline;
        int i10;
        int i11;
        int[] iArr;
        int i12;
        int i13;
        boolean z3;
        boolean z4;
        C0150E c0150e;
        int i14;
        int[] iArr2;
        int i15;
        View view;
        int i16;
        boolean z5;
        boolean z6;
        int max;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        int i24;
        int i25;
        float f2;
        int i26;
        int i27;
        boolean z7;
        View view2;
        boolean z8;
        AbstractC0151F abstractC0151F = this;
        int i28 = 0;
        int i29 = 1073741824;
        int i30 = 8;
        if (abstractC0151F.f2115h == 1) {
            abstractC0151F.f2117j = 0;
            int virtualChildCount = abstractC0151F.getVirtualChildCount();
            int mode = View.MeasureSpec.getMode(i2);
            int mode2 = View.MeasureSpec.getMode(i3);
            int i31 = abstractC0151F.f2113f;
            boolean z9 = abstractC0151F.f2119l;
            int i32 = 0;
            int i33 = 0;
            int i34 = 0;
            boolean z10 = false;
            int i35 = 0;
            boolean z11 = false;
            boolean z12 = true;
            float f3 = 0.0f;
            int i36 = 0;
            while (i32 < virtualChildCount) {
                int i37 = mode;
                View childAt = abstractC0151F.getChildAt(i32);
                if (childAt == null) {
                    abstractC0151F.f2117j = abstractC0151F.f2117j;
                } else if (childAt.getVisibility() != i30) {
                    if (abstractC0151F.g(i32)) {
                        abstractC0151F.f2117j += abstractC0151F.f2124q;
                    }
                    C0150E c0150e2 = (C0150E) childAt.getLayoutParams();
                    float f4 = c0150e2.f2110a;
                    f3 += f4;
                    if (mode2 == i29 && ((ViewGroup.MarginLayoutParams) c0150e2).height == 0 && f4 > 0.0f) {
                        int i38 = abstractC0151F.f2117j;
                        abstractC0151F.f2117j = Math.max(i38, ((ViewGroup.MarginLayoutParams) c0150e2).topMargin + i38 + ((ViewGroup.MarginLayoutParams) c0150e2).bottomMargin);
                        view2 = childAt;
                        i27 = mode2;
                        z7 = z9;
                        i24 = i32;
                        z10 = true;
                        i25 = i37;
                        f2 = f4;
                        i26 = i31;
                    } else {
                        if (((ViewGroup.MarginLayoutParams) c0150e2).height != 0 || f4 <= 0.0f) {
                            i21 = Integer.MIN_VALUE;
                        } else {
                            ((ViewGroup.MarginLayoutParams) c0150e2).height = -2;
                            i21 = 0;
                        }
                        if (f3 == 0.0f) {
                            i22 = i32;
                            i23 = abstractC0151F.f2117j;
                        } else {
                            i22 = i32;
                            i23 = 0;
                        }
                        i24 = i22;
                        i25 = i37;
                        f2 = f4;
                        i26 = i31;
                        i27 = mode2;
                        z7 = z9;
                        abstractC0151F.measureChildWithMargins(childAt, i2, 0, i3, i23);
                        if (i21 != Integer.MIN_VALUE) {
                            ((ViewGroup.MarginLayoutParams) c0150e2).height = i21;
                        }
                        int measuredHeight = childAt.getMeasuredHeight();
                        int i39 = abstractC0151F.f2117j;
                        view2 = childAt;
                        abstractC0151F.f2117j = Math.max(i39, i39 + measuredHeight + ((ViewGroup.MarginLayoutParams) c0150e2).topMargin + ((ViewGroup.MarginLayoutParams) c0150e2).bottomMargin);
                        if (z7) {
                            i36 = Math.max(measuredHeight, i36);
                        }
                    }
                    if (i26 >= 0 && i26 == i24 + 1) {
                        abstractC0151F.f2114g = abstractC0151F.f2117j;
                    }
                    if (i24 < i26 && f2 > 0.0f) {
                        throw new RuntimeException("A child of LinearLayout with index less than mBaselineAlignedChildIndex has weight > 0, which won't work.  Either remove the weight, or don't set mBaselineAlignedChildIndex.");
                    }
                    if (i25 == 1073741824 || ((ViewGroup.MarginLayoutParams) c0150e2).width != -1) {
                        z8 = false;
                    } else {
                        z8 = true;
                        z11 = true;
                    }
                    int i40 = ((ViewGroup.MarginLayoutParams) c0150e2).leftMargin + ((ViewGroup.MarginLayoutParams) c0150e2).rightMargin;
                    int measuredWidth = view2.getMeasuredWidth() + i40;
                    int max2 = Math.max(i28, measuredWidth);
                    int measuredState = view2.getMeasuredState();
                    boolean z13 = z8;
                    int combineMeasuredStates = View.combineMeasuredStates(i35, measuredState);
                    boolean z14 = z12 && ((ViewGroup.MarginLayoutParams) c0150e2).width == -1;
                    if (f2 > 0.0f) {
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
                    i35 = combineMeasuredStates;
                    z12 = z14;
                    i28 = max2;
                    i32 = i24 + 1;
                    mode = i25;
                    i31 = i26;
                    z9 = z7;
                    mode2 = i27;
                    i29 = 1073741824;
                    i30 = 8;
                }
                i27 = mode2;
                i26 = i31;
                z7 = z9;
                i24 = i32;
                i25 = i37;
                i32 = i24 + 1;
                mode = i25;
                i31 = i26;
                z9 = z7;
                mode2 = i27;
                i29 = 1073741824;
                i30 = 8;
            }
            int i41 = mode;
            int i42 = mode2;
            boolean z15 = z9;
            int i43 = i35;
            int i44 = i3;
            if (abstractC0151F.f2117j > 0 && abstractC0151F.g(virtualChildCount)) {
                abstractC0151F.f2117j += abstractC0151F.f2124q;
            }
            if (z15 && (i42 == Integer.MIN_VALUE || i42 == 0)) {
                abstractC0151F.f2117j = 0;
                for (int i45 = 0; i45 < virtualChildCount; i45++) {
                    View childAt2 = abstractC0151F.getChildAt(i45);
                    if (childAt2 == null) {
                        abstractC0151F.f2117j = abstractC0151F.f2117j;
                    } else if (childAt2.getVisibility() != 8) {
                        C0150E c0150e3 = (C0150E) childAt2.getLayoutParams();
                        int i46 = abstractC0151F.f2117j;
                        abstractC0151F.f2117j = Math.max(i46, i46 + i36 + ((ViewGroup.MarginLayoutParams) c0150e3).topMargin + ((ViewGroup.MarginLayoutParams) c0150e3).bottomMargin);
                    }
                }
            }
            int paddingBottom = abstractC0151F.getPaddingBottom() + abstractC0151F.getPaddingTop() + abstractC0151F.f2117j;
            abstractC0151F.f2117j = paddingBottom;
            int resolveSizeAndState = View.resolveSizeAndState(Math.max(paddingBottom, abstractC0151F.getSuggestedMinimumHeight()), i44, 0);
            int i47 = (resolveSizeAndState & 16777215) - abstractC0151F.f2117j;
            if (z10 || (i47 != 0 && f3 > 0.0f)) {
                float f5 = abstractC0151F.f2118k;
                if (f5 > 0.0f) {
                    f3 = f5;
                }
                abstractC0151F.f2117j = 0;
                int i48 = i43;
                int i49 = 0;
                while (i49 < virtualChildCount) {
                    View childAt3 = abstractC0151F.getChildAt(i49);
                    if (childAt3.getVisibility() == 8) {
                        i18 = i49;
                    } else {
                        C0150E c0150e4 = (C0150E) childAt3.getLayoutParams();
                        float f6 = c0150e4.f2110a;
                        if (f6 > 0.0f) {
                            int i50 = (int) ((i47 * f6) / f3);
                            f3 -= f6;
                            i47 -= i50;
                            i18 = i49;
                            int childMeasureSpec = ViewGroup.getChildMeasureSpec(i2, abstractC0151F.getPaddingRight() + abstractC0151F.getPaddingLeft() + ((ViewGroup.MarginLayoutParams) c0150e4).leftMargin + ((ViewGroup.MarginLayoutParams) c0150e4).rightMargin, ((ViewGroup.MarginLayoutParams) c0150e4).width);
                            if (((ViewGroup.MarginLayoutParams) c0150e4).height == 0) {
                                i20 = 1073741824;
                                if (i42 == 1073741824) {
                                    if (i50 <= 0) {
                                        i50 = 0;
                                    }
                                    childAt3.measure(childMeasureSpec, View.MeasureSpec.makeMeasureSpec(i50, 1073741824));
                                    i48 = View.combineMeasuredStates(i48, childAt3.getMeasuredState() & (-256));
                                }
                            } else {
                                i20 = 1073741824;
                            }
                            int measuredHeight2 = childAt3.getMeasuredHeight() + i50;
                            if (measuredHeight2 < 0) {
                                measuredHeight2 = 0;
                            }
                            childAt3.measure(childMeasureSpec, View.MeasureSpec.makeMeasureSpec(measuredHeight2, i20));
                            i48 = View.combineMeasuredStates(i48, childAt3.getMeasuredState() & (-256));
                        } else {
                            i18 = i49;
                        }
                        int i51 = ((ViewGroup.MarginLayoutParams) c0150e4).leftMargin + ((ViewGroup.MarginLayoutParams) c0150e4).rightMargin;
                        int measuredWidth2 = childAt3.getMeasuredWidth() + i51;
                        i28 = Math.max(i28, measuredWidth2);
                        if (i41 != 1073741824) {
                            i19 = -1;
                            if (((ViewGroup.MarginLayoutParams) c0150e4).width == -1) {
                                measuredWidth2 = i51;
                            }
                        } else {
                            i19 = -1;
                        }
                        i33 = Math.max(i33, measuredWidth2);
                        boolean z16 = z12 && ((ViewGroup.MarginLayoutParams) c0150e4).width == i19;
                        int i52 = abstractC0151F.f2117j;
                        abstractC0151F.f2117j = Math.max(i52, childAt3.getMeasuredHeight() + i52 + ((ViewGroup.MarginLayoutParams) c0150e4).topMargin + ((ViewGroup.MarginLayoutParams) c0150e4).bottomMargin);
                        z12 = z16;
                    }
                    i49 = i18 + 1;
                }
                abstractC0151F.f2117j = abstractC0151F.getPaddingBottom() + abstractC0151F.getPaddingTop() + abstractC0151F.f2117j;
                i43 = i48;
            } else {
                i33 = Math.max(i33, i34);
                if (z15 && i42 != 1073741824) {
                    for (int i53 = 0; i53 < virtualChildCount; i53++) {
                        View childAt4 = abstractC0151F.getChildAt(i53);
                        if (childAt4 != null && childAt4.getVisibility() != 8 && ((C0150E) childAt4.getLayoutParams()).f2110a > 0.0f) {
                            childAt4.measure(View.MeasureSpec.makeMeasureSpec(childAt4.getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(i36, 1073741824));
                        }
                    }
                }
            }
            if (z12 || i41 == 1073741824) {
                i33 = i28;
            }
            abstractC0151F.setMeasuredDimension(View.resolveSizeAndState(Math.max(abstractC0151F.getPaddingRight() + abstractC0151F.getPaddingLeft() + i33, abstractC0151F.getSuggestedMinimumWidth()), i2, i43), resolveSizeAndState);
            if (z11) {
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(abstractC0151F.getMeasuredWidth(), 1073741824);
                int i54 = 0;
                while (i54 < virtualChildCount) {
                    View childAt5 = abstractC0151F.getChildAt(i54);
                    if (childAt5.getVisibility() != 8) {
                        C0150E c0150e5 = (C0150E) childAt5.getLayoutParams();
                        if (((ViewGroup.MarginLayoutParams) c0150e5).width == -1) {
                            int i55 = ((ViewGroup.MarginLayoutParams) c0150e5).height;
                            ((ViewGroup.MarginLayoutParams) c0150e5).height = childAt5.getMeasuredHeight();
                            abstractC0151F.measureChildWithMargins(childAt5, makeMeasureSpec, 0, i44, 0);
                            ((ViewGroup.MarginLayoutParams) c0150e5).height = i55;
                        }
                    }
                    i54++;
                    i44 = i3;
                }
                return;
            }
            return;
        }
        int i56 = i2;
        abstractC0151F.f2117j = 0;
        int virtualChildCount2 = abstractC0151F.getVirtualChildCount();
        int mode3 = View.MeasureSpec.getMode(i56);
        int mode4 = View.MeasureSpec.getMode(i3);
        if (abstractC0151F.f2120m == null || abstractC0151F.f2121n == null) {
            abstractC0151F.f2120m = new int[4];
            abstractC0151F.f2121n = new int[4];
        }
        int[] iArr3 = abstractC0151F.f2120m;
        int[] iArr4 = abstractC0151F.f2121n;
        iArr3[3] = -1;
        char c2 = 2;
        iArr3[2] = -1;
        iArr3[1] = -1;
        iArr3[0] = -1;
        iArr4[3] = -1;
        iArr4[2] = -1;
        iArr4[1] = -1;
        iArr4[0] = -1;
        boolean z17 = abstractC0151F.f2112e;
        boolean z18 = abstractC0151F.f2119l;
        boolean z19 = mode3 == 1073741824;
        float f7 = 0.0f;
        boolean z20 = true;
        int i57 = 0;
        int i58 = 0;
        int i59 = 0;
        int i60 = 0;
        int i61 = 0;
        int i62 = 0;
        boolean z21 = false;
        boolean z22 = false;
        while (i57 < virtualChildCount2) {
            char c3 = c2;
            View childAt6 = abstractC0151F.getChildAt(i57);
            if (childAt6 == null) {
                abstractC0151F.f2117j = abstractC0151F.f2117j;
                i13 = i57;
                i17 = i59;
                iArr2 = iArr3;
                iArr = iArr4;
                z3 = z17;
                z4 = z18;
            } else {
                int i63 = i58;
                if (childAt6.getVisibility() == 8) {
                    i56 = i2;
                    i13 = i57;
                    i17 = i59;
                    iArr = iArr4;
                    z3 = z17;
                    z4 = z18;
                    i58 = i63;
                    iArr2 = iArr3;
                } else {
                    if (abstractC0151F.g(i57)) {
                        abstractC0151F.f2117j += abstractC0151F.f2123p;
                    }
                    C0150E c0150e6 = (C0150E) childAt6.getLayoutParams();
                    float f8 = c0150e6.f2110a;
                    f7 += f8;
                    int i64 = i57;
                    if (mode3 == 1073741824 && ((ViewGroup.MarginLayoutParams) c0150e6).width == 0 && f8 > 0.0f) {
                        if (z19) {
                            abstractC0151F.f2117j = ((ViewGroup.MarginLayoutParams) c0150e6).leftMargin + ((ViewGroup.MarginLayoutParams) c0150e6).rightMargin + abstractC0151F.f2117j;
                        } else {
                            int i65 = abstractC0151F.f2117j;
                            abstractC0151F.f2117j = Math.max(i65, ((ViewGroup.MarginLayoutParams) c0150e6).leftMargin + i65 + ((ViewGroup.MarginLayoutParams) c0150e6).rightMargin);
                        }
                        if (z17) {
                            int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 0);
                            childAt6.measure(makeMeasureSpec2, makeMeasureSpec2);
                            view = childAt6;
                            z3 = z17;
                            z4 = z18;
                            i14 = i63;
                            i13 = i64;
                            c0150e = c0150e6;
                            iArr2 = iArr3;
                            iArr = iArr4;
                            i56 = i2;
                            i15 = i59;
                            i12 = i60;
                        } else {
                            view = childAt6;
                            z3 = z17;
                            z4 = z18;
                            z22 = true;
                            i14 = i63;
                            i13 = i64;
                            i16 = 1073741824;
                            c0150e = c0150e6;
                            iArr2 = iArr3;
                            iArr = iArr4;
                            i56 = i2;
                            i15 = i59;
                            i12 = i60;
                            if (mode4 == i16 && ((ViewGroup.MarginLayoutParams) c0150e).height == -1) {
                                z5 = true;
                                z21 = true;
                            } else {
                                z5 = false;
                            }
                            int i66 = ((ViewGroup.MarginLayoutParams) c0150e).topMargin + ((ViewGroup.MarginLayoutParams) c0150e).bottomMargin;
                            int measuredHeight3 = view.getMeasuredHeight() + i66;
                            i62 = View.combineMeasuredStates(i62, view.getMeasuredState());
                            if (z3) {
                                z6 = z5;
                            } else {
                                int baseline2 = view.getBaseline();
                                z6 = z5;
                                if (baseline2 != -1) {
                                    int i67 = c0150e.f2111b;
                                    if (i67 < 0) {
                                        i67 = abstractC0151F.f2116i;
                                    }
                                    int i68 = (((i67 & 112) >> 4) & (-2)) >> 1;
                                    iArr2[i68] = Math.max(iArr2[i68], baseline2);
                                    iArr[i68] = Math.max(iArr[i68], measuredHeight3 - baseline2);
                                }
                            }
                            int max3 = Math.max(i14, measuredHeight3);
                            boolean z23 = !z20 && ((ViewGroup.MarginLayoutParams) c0150e).height == -1;
                            if (c0150e.f2110a <= 0.0f) {
                                if (!z6) {
                                    i66 = measuredHeight3;
                                }
                                i60 = Math.max(i12, i66);
                                max = i15;
                            } else {
                                if (!z6) {
                                    i66 = measuredHeight3;
                                }
                                max = Math.max(i15, i66);
                                i60 = i12;
                            }
                            int i69 = max;
                            i58 = max3;
                            i17 = i69;
                            z20 = z23;
                        }
                    } else {
                        if (((ViewGroup.MarginLayoutParams) c0150e6).width != 0 || f8 <= 0.0f) {
                            i11 = Integer.MIN_VALUE;
                        } else {
                            ((ViewGroup.MarginLayoutParams) c0150e6).width = -2;
                            i11 = 0;
                        }
                        iArr = iArr4;
                        i12 = i60;
                        i13 = i64;
                        z3 = z17;
                        z4 = z18;
                        int i70 = i11;
                        c0150e = c0150e6;
                        i14 = i63;
                        i56 = i2;
                        iArr2 = iArr3;
                        i15 = i59;
                        abstractC0151F.measureChildWithMargins(childAt6, i56, f7 == 0.0f ? abstractC0151F.f2117j : 0, i3, 0);
                        if (i70 != Integer.MIN_VALUE) {
                            ((ViewGroup.MarginLayoutParams) c0150e).width = i70;
                        }
                        int measuredWidth3 = childAt6.getMeasuredWidth();
                        if (z19) {
                            view = childAt6;
                            abstractC0151F.f2117j = ((ViewGroup.MarginLayoutParams) c0150e).leftMargin + measuredWidth3 + ((ViewGroup.MarginLayoutParams) c0150e).rightMargin + abstractC0151F.f2117j;
                        } else {
                            view = childAt6;
                            int i71 = abstractC0151F.f2117j;
                            abstractC0151F.f2117j = Math.max(i71, i71 + measuredWidth3 + ((ViewGroup.MarginLayoutParams) c0150e).leftMargin + ((ViewGroup.MarginLayoutParams) c0150e).rightMargin);
                        }
                        if (z4) {
                            i61 = Math.max(measuredWidth3, i61);
                        }
                    }
                    i16 = 1073741824;
                    if (mode4 == i16) {
                    }
                    z5 = false;
                    int i662 = ((ViewGroup.MarginLayoutParams) c0150e).topMargin + ((ViewGroup.MarginLayoutParams) c0150e).bottomMargin;
                    int measuredHeight32 = view.getMeasuredHeight() + i662;
                    i62 = View.combineMeasuredStates(i62, view.getMeasuredState());
                    if (z3) {
                    }
                    int max32 = Math.max(i14, measuredHeight32);
                    if (z20) {
                    }
                    if (c0150e.f2110a <= 0.0f) {
                    }
                    int i692 = max;
                    i58 = max32;
                    i17 = i692;
                    z20 = z23;
                }
            }
            i59 = i17;
            i57 = i13 + 1;
            c2 = c3;
            iArr3 = iArr2;
            iArr4 = iArr;
            z17 = z3;
            z18 = z4;
        }
        int[] iArr5 = iArr3;
        int[] iArr6 = iArr4;
        char c4 = c2;
        boolean z24 = z17;
        boolean z25 = z18;
        int i72 = i58;
        int i73 = i59;
        int i74 = i60;
        if (abstractC0151F.f2117j > 0 && abstractC0151F.g(virtualChildCount2)) {
            abstractC0151F.f2117j += abstractC0151F.f2123p;
        }
        int i75 = iArr5[1];
        int max4 = (i75 == -1 && iArr5[0] == -1 && iArr5[c4] == -1 && iArr5[3] == -1) ? i72 : Math.max(i72, Math.max(iArr6[3], Math.max(iArr6[0], Math.max(iArr6[1], iArr6[c4]))) + Math.max(iArr5[3], Math.max(iArr5[0], Math.max(i75, iArr5[c4]))));
        if (z25 && (mode3 == Integer.MIN_VALUE || mode3 == 0)) {
            abstractC0151F.f2117j = 0;
            for (int i76 = 0; i76 < virtualChildCount2; i76++) {
                View childAt7 = abstractC0151F.getChildAt(i76);
                if (childAt7 == null) {
                    abstractC0151F.f2117j = abstractC0151F.f2117j;
                } else if (childAt7.getVisibility() != 8) {
                    C0150E c0150e7 = (C0150E) childAt7.getLayoutParams();
                    if (z19) {
                        abstractC0151F.f2117j = ((ViewGroup.MarginLayoutParams) c0150e7).leftMargin + i61 + ((ViewGroup.MarginLayoutParams) c0150e7).rightMargin + abstractC0151F.f2117j;
                    } else {
                        int i77 = abstractC0151F.f2117j;
                        abstractC0151F.f2117j = Math.max(i77, i77 + i61 + ((ViewGroup.MarginLayoutParams) c0150e7).leftMargin + ((ViewGroup.MarginLayoutParams) c0150e7).rightMargin);
                    }
                }
            }
        }
        int paddingRight = abstractC0151F.getPaddingRight() + abstractC0151F.getPaddingLeft() + abstractC0151F.f2117j;
        abstractC0151F.f2117j = paddingRight;
        int resolveSizeAndState2 = View.resolveSizeAndState(Math.max(paddingRight, abstractC0151F.getSuggestedMinimumWidth()), i56, 0);
        int i78 = (resolveSizeAndState2 & 16777215) - abstractC0151F.f2117j;
        if (z22 || (i78 != 0 && f7 > 0.0f)) {
            float f9 = abstractC0151F.f2118k;
            if (f9 > 0.0f) {
                f7 = f9;
            }
            iArr5[3] = -1;
            iArr5[c4] = -1;
            iArr5[1] = -1;
            iArr5[0] = -1;
            iArr6[3] = -1;
            iArr6[c4] = -1;
            iArr6[1] = -1;
            iArr6[0] = -1;
            abstractC0151F.f2117j = 0;
            max4 = -1;
            int i79 = 0;
            while (i79 < virtualChildCount2) {
                View childAt8 = abstractC0151F.getChildAt(i79);
                if (childAt8 == null || childAt8.getVisibility() == 8) {
                    i8 = resolveSizeAndState2;
                } else {
                    C0150E c0150e8 = (C0150E) childAt8.getLayoutParams();
                    float f10 = c0150e8.f2110a;
                    if (f10 > 0.0f) {
                        int i80 = (int) ((i78 * f10) / f7);
                        f7 -= f10;
                        i78 -= i80;
                        i8 = resolveSizeAndState2;
                        int childMeasureSpec2 = ViewGroup.getChildMeasureSpec(i3, abstractC0151F.getPaddingBottom() + abstractC0151F.getPaddingTop() + ((ViewGroup.MarginLayoutParams) c0150e8).topMargin + ((ViewGroup.MarginLayoutParams) c0150e8).bottomMargin, ((ViewGroup.MarginLayoutParams) c0150e8).height);
                        if (((ViewGroup.MarginLayoutParams) c0150e8).width == 0) {
                            i10 = 1073741824;
                            if (mode3 == 1073741824) {
                                if (i80 <= 0) {
                                    i80 = 0;
                                }
                                childAt8.measure(View.MeasureSpec.makeMeasureSpec(i80, 1073741824), childMeasureSpec2);
                                i62 = View.combineMeasuredStates(i62, childAt8.getMeasuredState() & (-16777216));
                            }
                        } else {
                            i10 = 1073741824;
                        }
                        int measuredWidth4 = childAt8.getMeasuredWidth() + i80;
                        if (measuredWidth4 < 0) {
                            measuredWidth4 = 0;
                        }
                        childAt8.measure(View.MeasureSpec.makeMeasureSpec(measuredWidth4, i10), childMeasureSpec2);
                        i62 = View.combineMeasuredStates(i62, childAt8.getMeasuredState() & (-16777216));
                    } else {
                        i8 = resolveSizeAndState2;
                    }
                    if (z19) {
                        abstractC0151F.f2117j = childAt8.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) c0150e8).leftMargin + ((ViewGroup.MarginLayoutParams) c0150e8).rightMargin + abstractC0151F.f2117j;
                    } else {
                        int i81 = abstractC0151F.f2117j;
                        abstractC0151F.f2117j = Math.max(i81, childAt8.getMeasuredWidth() + i81 + ((ViewGroup.MarginLayoutParams) c0150e8).leftMargin + ((ViewGroup.MarginLayoutParams) c0150e8).rightMargin);
                    }
                    boolean z26 = mode4 != 1073741824 && ((ViewGroup.MarginLayoutParams) c0150e8).height == -1;
                    int i82 = ((ViewGroup.MarginLayoutParams) c0150e8).topMargin + ((ViewGroup.MarginLayoutParams) c0150e8).bottomMargin;
                    int measuredHeight4 = childAt8.getMeasuredHeight() + i82;
                    max4 = Math.max(max4, measuredHeight4);
                    if (!z26) {
                        i82 = measuredHeight4;
                    }
                    int max5 = Math.max(i73, i82);
                    if (z20) {
                        i9 = -1;
                        if (((ViewGroup.MarginLayoutParams) c0150e8).height == -1) {
                            z2 = true;
                            if (!z24 && (baseline = childAt8.getBaseline()) != i9) {
                                int i83 = c0150e8.f2111b;
                                if (i83 < 0) {
                                    i83 = abstractC0151F.f2116i;
                                }
                                int i84 = (((i83 & 112) >> 4) & (-2)) >> 1;
                                iArr5[i84] = Math.max(iArr5[i84], baseline);
                                iArr6[i84] = Math.max(iArr6[i84], measuredHeight4 - baseline);
                            }
                            z20 = z2;
                            i73 = max5;
                        }
                    } else {
                        i9 = -1;
                    }
                    z2 = false;
                    if (!z24) {
                    }
                    z20 = z2;
                    i73 = max5;
                }
                i79++;
                resolveSizeAndState2 = i8;
            }
            i4 = resolveSizeAndState2;
            i5 = -16777216;
            abstractC0151F.f2117j = abstractC0151F.getPaddingRight() + abstractC0151F.getPaddingLeft() + abstractC0151F.f2117j;
            int i85 = iArr5[1];
            if (i85 == -1 && iArr5[0] == -1 && iArr5[c4] == -1 && iArr5[3] == -1) {
                i6 = 0;
            } else {
                i6 = 0;
                max4 = Math.max(max4, Math.max(iArr6[3], Math.max(iArr6[0], Math.max(iArr6[1], iArr6[c4]))) + Math.max(iArr5[3], Math.max(iArr5[0], Math.max(i85, iArr5[c4]))));
            }
            i7 = i73;
        } else {
            i7 = Math.max(i73, i74);
            if (z25 && mode3 != 1073741824) {
                for (int i86 = 0; i86 < virtualChildCount2; i86++) {
                    View childAt9 = abstractC0151F.getChildAt(i86);
                    if (childAt9 != null && childAt9.getVisibility() != 8 && ((C0150E) childAt9.getLayoutParams()).f2110a > 0.0f) {
                        childAt9.measure(View.MeasureSpec.makeMeasureSpec(i61, 1073741824), View.MeasureSpec.makeMeasureSpec(childAt9.getMeasuredHeight(), 1073741824));
                    }
                }
            }
            i4 = resolveSizeAndState2;
            i5 = -16777216;
            i6 = 0;
        }
        if (!z20 && mode4 != 1073741824) {
            max4 = i7;
        }
        abstractC0151F.setMeasuredDimension(i4 | (i62 & i5), View.resolveSizeAndState(Math.max(abstractC0151F.getPaddingBottom() + abstractC0151F.getPaddingTop() + max4, abstractC0151F.getSuggestedMinimumHeight()), i3, i62 << 16));
        if (z21) {
            int makeMeasureSpec3 = View.MeasureSpec.makeMeasureSpec(abstractC0151F.getMeasuredHeight(), 1073741824);
            int i87 = i6;
            while (i87 < virtualChildCount2) {
                View childAt10 = abstractC0151F.getChildAt(i87);
                if (childAt10.getVisibility() != 8) {
                    C0150E c0150e9 = (C0150E) childAt10.getLayoutParams();
                    if (((ViewGroup.MarginLayoutParams) c0150e9).height == -1) {
                        int i88 = ((ViewGroup.MarginLayoutParams) c0150e9).width;
                        ((ViewGroup.MarginLayoutParams) c0150e9).width = childAt10.getMeasuredWidth();
                        abstractC0151F.measureChildWithMargins(childAt10, i56, 0, makeMeasureSpec3, 0);
                        ((ViewGroup.MarginLayoutParams) c0150e9).width = i88;
                    }
                }
                i87++;
                abstractC0151F = this;
                i56 = i2;
            }
        }
    }

    public void setBaselineAligned(boolean z2) {
        this.f2112e = z2;
    }

    public void setBaselineAlignedChildIndex(int i2) {
        if (i2 >= 0 && i2 < getChildCount()) {
            this.f2113f = i2;
            return;
        }
        throw new IllegalArgumentException("base aligned child index out of range (0, " + getChildCount() + ")");
    }

    public void setDividerDrawable(Drawable drawable) {
        if (drawable == this.f2122o) {
            return;
        }
        this.f2122o = drawable;
        if (drawable != null) {
            this.f2123p = drawable.getIntrinsicWidth();
            this.f2124q = drawable.getIntrinsicHeight();
        } else {
            this.f2123p = 0;
            this.f2124q = 0;
        }
        setWillNotDraw(drawable == null);
        requestLayout();
    }

    public void setDividerPadding(int i2) {
        this.f2126s = i2;
    }

    public void setGravity(int i2) {
        if (this.f2116i != i2) {
            if ((8388615 & i2) == 0) {
                i2 |= 8388611;
            }
            if ((i2 & 112) == 0) {
                i2 |= 48;
            }
            this.f2116i = i2;
            requestLayout();
        }
    }

    public void setHorizontalGravity(int i2) {
        int i3 = i2 & 8388615;
        int i4 = this.f2116i;
        if ((8388615 & i4) != i3) {
            this.f2116i = i3 | ((-8388616) & i4);
            requestLayout();
        }
    }

    public void setMeasureWithLargestChildEnabled(boolean z2) {
        this.f2119l = z2;
    }

    public void setOrientation(int i2) {
        if (this.f2115h != i2) {
            this.f2115h = i2;
            requestLayout();
        }
    }

    public void setShowDividers(int i2) {
        if (i2 != this.f2125r) {
            requestLayout();
        }
        this.f2125r = i2;
    }

    public void setVerticalGravity(int i2) {
        int i3 = i2 & 112;
        int i4 = this.f2116i;
        if ((i4 & 112) != i3) {
            this.f2116i = i3 | (i4 & (-113));
            requestLayout();
        }
    }

    public void setWeightSum(float f2) {
        this.f2118k = Math.max(0.0f, f2);
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }
}
