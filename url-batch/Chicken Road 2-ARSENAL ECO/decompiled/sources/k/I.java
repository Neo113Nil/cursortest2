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
import g.AbstractC0389a;
import java.lang.reflect.Field;

/* loaded from: classes.dex */
public abstract class I extends ViewGroup {

    /* renamed from: f, reason: collision with root package name */
    public boolean f4912f;

    /* renamed from: g, reason: collision with root package name */
    public int f4913g;

    /* renamed from: h, reason: collision with root package name */
    public int f4914h;

    /* renamed from: i, reason: collision with root package name */
    public int f4915i;

    /* renamed from: j, reason: collision with root package name */
    public int f4916j;

    /* renamed from: k, reason: collision with root package name */
    public int f4917k;

    /* renamed from: l, reason: collision with root package name */
    public float f4918l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f4919m;

    /* renamed from: n, reason: collision with root package name */
    public int[] f4920n;

    /* renamed from: o, reason: collision with root package name */
    public int[] f4921o;

    /* renamed from: p, reason: collision with root package name */
    public Drawable f4922p;

    /* renamed from: q, reason: collision with root package name */
    public int f4923q;

    /* renamed from: r, reason: collision with root package name */
    public int f4924r;

    /* renamed from: s, reason: collision with root package name */
    public int f4925s;

    /* renamed from: t, reason: collision with root package name */
    public int f4926t;

    public I(Context context, AttributeSet attributeSet, int i7) {
        super(context, attributeSet, i7);
        this.f4912f = true;
        this.f4913g = -1;
        this.f4914h = 0;
        this.f4916j = 8388659;
        int[] iArr = AbstractC0389a.f4263j;
        B0.c r6 = B0.c.r(context, attributeSet, iArr, i7);
        D.D.a(this, context, iArr, attributeSet, (TypedArray) r6.f73i, i7);
        TypedArray typedArray = (TypedArray) r6.f73i;
        int i8 = typedArray.getInt(1, -1);
        if (i8 >= 0) {
            setOrientation(i8);
        }
        int i9 = typedArray.getInt(0, -1);
        if (i9 >= 0) {
            setGravity(i9);
        }
        boolean z5 = typedArray.getBoolean(2, true);
        if (!z5) {
            setBaselineAligned(z5);
        }
        this.f4918l = typedArray.getFloat(4, -1.0f);
        this.f4913g = typedArray.getInt(3, -1);
        this.f4919m = typedArray.getBoolean(7, false);
        setDividerDrawable(r6.m(5));
        this.f4925s = typedArray.getInt(8, 0);
        this.f4926t = typedArray.getDimensionPixelSize(6, 0);
        r6.v();
    }

    public final void b(Canvas canvas, int i7) {
        this.f4922p.setBounds(getPaddingLeft() + this.f4926t, i7, (getWidth() - getPaddingRight()) - this.f4926t, this.f4924r + i7);
        this.f4922p.draw(canvas);
    }

    public final void c(Canvas canvas, int i7) {
        this.f4922p.setBounds(i7, getPaddingTop() + this.f4926t, this.f4923q + i7, (getHeight() - getPaddingBottom()) - this.f4926t);
        this.f4922p.draw(canvas);
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof H;
    }

    @Override // android.view.ViewGroup
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public H generateDefaultLayoutParams() {
        int i7 = this.f4915i;
        if (i7 == 0) {
            return new H(-2, -2);
        }
        if (i7 == 1) {
            return new H(-1, -2);
        }
        return null;
    }

    @Override // android.view.ViewGroup
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public H generateLayoutParams(AttributeSet attributeSet) {
        return new H(getContext(), attributeSet);
    }

    @Override // android.view.ViewGroup
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public H generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new H(layoutParams);
    }

    public final boolean g(int i7) {
        if (i7 == 0) {
            return (this.f4925s & 1) != 0;
        }
        if (i7 == getChildCount()) {
            return (this.f4925s & 4) != 0;
        }
        if ((this.f4925s & 2) != 0) {
            for (int i8 = i7 - 1; i8 >= 0; i8--) {
                if (getChildAt(i8).getVisibility() != 8) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // android.view.View
    public int getBaseline() {
        int i7;
        if (this.f4913g < 0) {
            return super.getBaseline();
        }
        int childCount = getChildCount();
        int i8 = this.f4913g;
        if (childCount <= i8) {
            throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout set to an index that is out of bounds.");
        }
        View childAt = getChildAt(i8);
        int baseline = childAt.getBaseline();
        if (baseline == -1) {
            if (this.f4913g == 0) {
                return -1;
            }
            throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout points to a View that doesn't know how to get its baseline.");
        }
        int i9 = this.f4914h;
        if (this.f4915i == 1 && (i7 = this.f4916j & 112) != 48) {
            if (i7 == 16) {
                i9 += ((((getBottom() - getTop()) - getPaddingTop()) - getPaddingBottom()) - this.f4917k) / 2;
            } else if (i7 == 80) {
                i9 = ((getBottom() - getTop()) - getPaddingBottom()) - this.f4917k;
            }
        }
        return i9 + ((LinearLayout.LayoutParams) ((H) childAt.getLayoutParams())).topMargin + baseline;
    }

    public int getBaselineAlignedChildIndex() {
        return this.f4913g;
    }

    public Drawable getDividerDrawable() {
        return this.f4922p;
    }

    public int getDividerPadding() {
        return this.f4926t;
    }

    public int getDividerWidth() {
        return this.f4923q;
    }

    public int getGravity() {
        return this.f4916j;
    }

    public int getOrientation() {
        return this.f4915i;
    }

    public int getShowDividers() {
        return this.f4925s;
    }

    public int getVirtualChildCount() {
        return getChildCount();
    }

    public float getWeightSum() {
        return this.f4918l;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        int right;
        int left;
        int i7;
        if (this.f4922p == null) {
            return;
        }
        int i8 = 0;
        if (this.f4915i == 1) {
            int virtualChildCount = getVirtualChildCount();
            while (i8 < virtualChildCount) {
                View childAt = getChildAt(i8);
                if (childAt != null && childAt.getVisibility() != 8 && g(i8)) {
                    b(canvas, (childAt.getTop() - ((LinearLayout.LayoutParams) ((H) childAt.getLayoutParams())).topMargin) - this.f4924r);
                }
                i8++;
            }
            if (g(virtualChildCount)) {
                View childAt2 = getChildAt(virtualChildCount - 1);
                b(canvas, childAt2 == null ? (getHeight() - getPaddingBottom()) - this.f4924r : childAt2.getBottom() + ((LinearLayout.LayoutParams) ((H) childAt2.getLayoutParams())).bottomMargin);
                return;
            }
            return;
        }
        int virtualChildCount2 = getVirtualChildCount();
        boolean a7 = y0.a(this);
        while (i8 < virtualChildCount2) {
            View childAt3 = getChildAt(i8);
            if (childAt3 != null && childAt3.getVisibility() != 8 && g(i8)) {
                H h7 = (H) childAt3.getLayoutParams();
                c(canvas, a7 ? childAt3.getRight() + ((LinearLayout.LayoutParams) h7).rightMargin : (childAt3.getLeft() - ((LinearLayout.LayoutParams) h7).leftMargin) - this.f4923q);
            }
            i8++;
        }
        if (g(virtualChildCount2)) {
            View childAt4 = getChildAt(virtualChildCount2 - 1);
            if (childAt4 != null) {
                H h8 = (H) childAt4.getLayoutParams();
                if (a7) {
                    left = childAt4.getLeft() - ((LinearLayout.LayoutParams) h8).leftMargin;
                    i7 = this.f4923q;
                    right = left - i7;
                } else {
                    right = childAt4.getRight() + ((LinearLayout.LayoutParams) h8).rightMargin;
                }
            } else if (a7) {
                right = getPaddingLeft();
            } else {
                left = getWidth() - getPaddingRight();
                i7 = this.f4923q;
                right = left - i7;
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
    public void onLayout(boolean z5, int i7, int i8, int i9, int i10) {
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        char c7;
        int i20;
        int i21;
        int i22;
        int i23 = 8;
        char c8 = 2;
        if (this.f4915i == 1) {
            int paddingLeft = getPaddingLeft();
            int i24 = i9 - i7;
            int paddingRight = i24 - getPaddingRight();
            int paddingRight2 = (i24 - paddingLeft) - getPaddingRight();
            int virtualChildCount = getVirtualChildCount();
            int i25 = this.f4916j;
            int i26 = i25 & 112;
            int i27 = 8388615 & i25;
            int paddingTop = i26 != 16 ? i26 != 80 ? getPaddingTop() : ((getPaddingTop() + i10) - i8) - this.f4917k : getPaddingTop() + (((i10 - i8) - this.f4917k) / 2);
            int i28 = 0;
            while (i28 < virtualChildCount) {
                View childAt = getChildAt(i28);
                if (childAt == null || childAt.getVisibility() == i23) {
                    c7 = c8;
                } else {
                    int measuredWidth = childAt.getMeasuredWidth();
                    int measuredHeight = childAt.getMeasuredHeight();
                    H h7 = (H) childAt.getLayoutParams();
                    c7 = c8;
                    int i29 = ((LinearLayout.LayoutParams) h7).gravity;
                    if (i29 < 0) {
                        i29 = i27;
                    }
                    Field field = D.D.f240a;
                    int absoluteGravity = Gravity.getAbsoluteGravity(i29, getLayoutDirection()) & 7;
                    if (absoluteGravity == 1) {
                        i20 = ((paddingRight2 - measuredWidth) / 2) + paddingLeft + ((LinearLayout.LayoutParams) h7).leftMargin;
                        i21 = ((LinearLayout.LayoutParams) h7).rightMargin;
                    } else if (absoluteGravity != 5) {
                        i22 = ((LinearLayout.LayoutParams) h7).leftMargin + paddingLeft;
                        if (g(i28)) {
                            paddingTop += this.f4924r;
                        }
                        int i30 = paddingTop + ((LinearLayout.LayoutParams) h7).topMargin;
                        childAt.layout(i22, i30, measuredWidth + i22, i30 + measuredHeight);
                        paddingTop = measuredHeight + ((LinearLayout.LayoutParams) h7).bottomMargin + i30;
                    } else {
                        i20 = paddingRight - measuredWidth;
                        i21 = ((LinearLayout.LayoutParams) h7).rightMargin;
                    }
                    i22 = i20 - i21;
                    if (g(i28)) {
                    }
                    int i302 = paddingTop + ((LinearLayout.LayoutParams) h7).topMargin;
                    childAt.layout(i22, i302, measuredWidth + i22, i302 + measuredHeight);
                    paddingTop = measuredHeight + ((LinearLayout.LayoutParams) h7).bottomMargin + i302;
                }
                i28++;
                c8 = c7;
                i23 = 8;
            }
            return;
        }
        boolean a7 = y0.a(this);
        int paddingTop2 = getPaddingTop();
        int i31 = i10 - i8;
        int paddingBottom = i31 - getPaddingBottom();
        int paddingBottom2 = (i31 - paddingTop2) - getPaddingBottom();
        int virtualChildCount2 = getVirtualChildCount();
        int i32 = this.f4916j;
        int i33 = 8388615 & i32;
        int i34 = i32 & 112;
        boolean z6 = this.f4912f;
        int[] iArr = this.f4920n;
        int[] iArr2 = this.f4921o;
        Field field2 = D.D.f240a;
        int absoluteGravity2 = Gravity.getAbsoluteGravity(i33, getLayoutDirection());
        int paddingLeft2 = absoluteGravity2 != 1 ? absoluteGravity2 != 5 ? getPaddingLeft() : ((getPaddingLeft() + i9) - i7) - this.f4917k : getPaddingLeft() + (((i9 - i7) - this.f4917k) / 2);
        if (a7) {
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
                    H h8 = (H) childAt2.getLayoutParams();
                    int i37 = paddingLeft2;
                    if (z6) {
                        i14 = paddingTop2;
                        if (((LinearLayout.LayoutParams) h8).height != -1) {
                            i15 = childAt2.getBaseline();
                            i16 = ((LinearLayout.LayoutParams) h8).gravity;
                            if (i16 < 0) {
                                i16 = i34;
                            }
                            i17 = i16 & 112;
                            if (i17 == 16) {
                                if (i17 == 48) {
                                    i18 = i14 + ((LinearLayout.LayoutParams) h8).topMargin;
                                    if (i15 != -1) {
                                        i18 = (iArr[1] - i15) + i18;
                                    }
                                } else if (i17 != 80) {
                                    i18 = i14;
                                } else {
                                    i18 = (paddingBottom - measuredHeight2) - ((LinearLayout.LayoutParams) h8).bottomMargin;
                                    if (i15 != -1) {
                                        i19 = iArr2[2] - (childAt2.getMeasuredHeight() - i15);
                                    }
                                }
                                int i38 = (g(i36) ? i37 + this.f4923q : i37) + ((LinearLayout.LayoutParams) h8).leftMargin;
                                childAt2.layout(i38, i18, i38 + measuredWidth2, i18 + measuredHeight2);
                                paddingLeft2 = measuredWidth2 + ((LinearLayout.LayoutParams) h8).rightMargin + i38;
                                i35++;
                                i12 = i13;
                                paddingTop2 = i14;
                            } else {
                                i18 = ((paddingBottom2 - measuredHeight2) / 2) + i14 + ((LinearLayout.LayoutParams) h8).topMargin;
                                i19 = ((LinearLayout.LayoutParams) h8).bottomMargin;
                            }
                            i18 -= i19;
                            int i382 = (g(i36) ? i37 + this.f4923q : i37) + ((LinearLayout.LayoutParams) h8).leftMargin;
                            childAt2.layout(i382, i18, i382 + measuredWidth2, i18 + measuredHeight2);
                            paddingLeft2 = measuredWidth2 + ((LinearLayout.LayoutParams) h8).rightMargin + i382;
                            i35++;
                            i12 = i13;
                            paddingTop2 = i14;
                        }
                    } else {
                        i14 = paddingTop2;
                    }
                    i15 = -1;
                    i16 = ((LinearLayout.LayoutParams) h8).gravity;
                    if (i16 < 0) {
                    }
                    i17 = i16 & 112;
                    if (i17 == 16) {
                    }
                    i18 -= i19;
                    int i3822 = (g(i36) ? i37 + this.f4923q : i37) + ((LinearLayout.LayoutParams) h8).leftMargin;
                    childAt2.layout(i3822, i18, i3822 + measuredWidth2, i18 + measuredHeight2);
                    paddingLeft2 = measuredWidth2 + ((LinearLayout.LayoutParams) h8).rightMargin + i3822;
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
    public void onMeasure(int i7, int i8) {
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        boolean z5;
        int baseline;
        int i15;
        int i16;
        int[] iArr;
        int i17;
        int i18;
        boolean z6;
        boolean z7;
        H h7;
        int i19;
        int[] iArr2;
        int i20;
        View view;
        int i21;
        boolean z8;
        boolean z9;
        int max;
        int i22;
        int i23;
        int i24;
        int i25;
        int i26;
        int i27;
        int i28;
        int i29;
        boolean z10;
        int i30;
        int i31;
        int i32;
        View view2;
        boolean z11;
        boolean z12;
        I i33 = this;
        int i34 = -2;
        int i35 = 0;
        int i36 = 1073741824;
        int i37 = 8;
        if (i33.f4915i == 1) {
            i33.f4917k = 0;
            int virtualChildCount = i33.getVirtualChildCount();
            int mode = View.MeasureSpec.getMode(i7);
            int mode2 = View.MeasureSpec.getMode(i8);
            int i38 = i33.f4913g;
            boolean z13 = i33.f4919m;
            int i39 = 0;
            int i40 = 0;
            int i41 = 0;
            boolean z14 = false;
            int i42 = 0;
            boolean z15 = false;
            boolean z16 = true;
            float f7 = 0.0f;
            int i43 = 0;
            while (i39 < virtualChildCount) {
                int i44 = mode;
                View childAt = i33.getChildAt(i39);
                if (childAt == null) {
                    i33.f4917k = i33.f4917k;
                } else if (childAt.getVisibility() != i37) {
                    if (i33.g(i39)) {
                        i33.f4917k += i33.f4924r;
                    }
                    H h8 = (H) childAt.getLayoutParams();
                    float f8 = ((LinearLayout.LayoutParams) h8).weight;
                    f7 += f8;
                    if (mode2 == i36 && ((LinearLayout.LayoutParams) h8).height == 0 && f8 > 0.0f) {
                        int i45 = i33.f4917k;
                        i33.f4917k = Math.max(i45, ((LinearLayout.LayoutParams) h8).topMargin + i45 + ((LinearLayout.LayoutParams) h8).bottomMargin);
                        view2 = childAt;
                        i29 = mode2;
                        i30 = i38;
                        z10 = z13;
                        i31 = i39;
                        z14 = true;
                        i32 = i44;
                    } else {
                        if (((LinearLayout.LayoutParams) h8).height != 0 || f8 <= 0.0f) {
                            i26 = Integer.MIN_VALUE;
                        } else {
                            ((LinearLayout.LayoutParams) h8).height = i34;
                            i26 = 0;
                        }
                        if (f7 == 0.0f) {
                            i27 = i39;
                            i28 = i33.f4917k;
                        } else {
                            i27 = i39;
                            i28 = 0;
                        }
                        i29 = mode2;
                        z10 = z13;
                        i30 = i38;
                        i31 = i27;
                        i32 = i44;
                        i33.measureChildWithMargins(childAt, i7, 0, i8, i28);
                        if (i26 != Integer.MIN_VALUE) {
                            ((LinearLayout.LayoutParams) h8).height = i26;
                        }
                        int measuredHeight = childAt.getMeasuredHeight();
                        int i46 = i33.f4917k;
                        view2 = childAt;
                        i33.f4917k = Math.max(i46, i46 + measuredHeight + ((LinearLayout.LayoutParams) h8).topMargin + ((LinearLayout.LayoutParams) h8).bottomMargin);
                        if (z10) {
                            i43 = Math.max(measuredHeight, i43);
                        }
                    }
                    if (i30 >= 0 && i30 == i31 + 1) {
                        i33.f4914h = i33.f4917k;
                    }
                    if (i31 < i30 && ((LinearLayout.LayoutParams) h8).weight > 0.0f) {
                        throw new RuntimeException("A child of LinearLayout with index less than mBaselineAlignedChildIndex has weight > 0, which won't work.  Either remove the weight, or don't set mBaselineAlignedChildIndex.");
                    }
                    if (i32 == 1073741824 || ((LinearLayout.LayoutParams) h8).width != -1) {
                        z11 = false;
                    } else {
                        z11 = true;
                        z15 = true;
                    }
                    int i47 = ((LinearLayout.LayoutParams) h8).leftMargin + ((LinearLayout.LayoutParams) h8).rightMargin;
                    int measuredWidth = view2.getMeasuredWidth() + i47;
                    i35 = Math.max(i35, measuredWidth);
                    int measuredState = view2.getMeasuredState();
                    boolean z17 = z11;
                    int combineMeasuredStates = View.combineMeasuredStates(i42, measuredState);
                    if (z16) {
                        i42 = combineMeasuredStates;
                        if (((LinearLayout.LayoutParams) h8).width == -1) {
                            z12 = true;
                            if (((LinearLayout.LayoutParams) h8).weight <= 0.0f) {
                                if (!z17) {
                                    i47 = measuredWidth;
                                }
                                i41 = Math.max(i41, i47);
                            } else {
                                if (!z17) {
                                    i47 = measuredWidth;
                                }
                                i40 = Math.max(i40, i47);
                            }
                            z16 = z12;
                            i39 = i31 + 1;
                            i38 = i30;
                            mode = i32;
                            z13 = z10;
                            mode2 = i29;
                            i34 = -2;
                            i36 = 1073741824;
                            i37 = 8;
                        }
                    } else {
                        i42 = combineMeasuredStates;
                    }
                    z12 = false;
                    if (((LinearLayout.LayoutParams) h8).weight <= 0.0f) {
                    }
                    z16 = z12;
                    i39 = i31 + 1;
                    i38 = i30;
                    mode = i32;
                    z13 = z10;
                    mode2 = i29;
                    i34 = -2;
                    i36 = 1073741824;
                    i37 = 8;
                }
                i29 = mode2;
                i30 = i38;
                z10 = z13;
                i31 = i39;
                i32 = i44;
                i39 = i31 + 1;
                i38 = i30;
                mode = i32;
                z13 = z10;
                mode2 = i29;
                i34 = -2;
                i36 = 1073741824;
                i37 = 8;
            }
            int i48 = mode;
            int i49 = mode2;
            boolean z18 = z13;
            int i50 = i42;
            int i51 = i8;
            if (i33.f4917k > 0 && i33.g(virtualChildCount)) {
                i33.f4917k += i33.f4924r;
            }
            if (z18 && (i49 == Integer.MIN_VALUE || i49 == 0)) {
                i33.f4917k = 0;
                for (int i52 = 0; i52 < virtualChildCount; i52++) {
                    View childAt2 = i33.getChildAt(i52);
                    if (childAt2 == null) {
                        i33.f4917k = i33.f4917k;
                    } else if (childAt2.getVisibility() != 8) {
                        H h9 = (H) childAt2.getLayoutParams();
                        int i53 = i33.f4917k;
                        i33.f4917k = Math.max(i53, i53 + i43 + ((LinearLayout.LayoutParams) h9).topMargin + ((LinearLayout.LayoutParams) h9).bottomMargin);
                    }
                }
            }
            int paddingBottom = i33.getPaddingBottom() + i33.getPaddingTop() + i33.f4917k;
            i33.f4917k = paddingBottom;
            int resolveSizeAndState = View.resolveSizeAndState(Math.max(paddingBottom, i33.getSuggestedMinimumHeight()), i51, 0);
            int i54 = (resolveSizeAndState & 16777215) - i33.f4917k;
            if (z14 || (i54 != 0 && f7 > 0.0f)) {
                float f9 = i33.f4918l;
                if (f9 > 0.0f) {
                    f7 = f9;
                }
                i33.f4917k = 0;
                int i55 = i50;
                int i56 = 0;
                while (i56 < virtualChildCount) {
                    View childAt3 = i33.getChildAt(i56);
                    if (childAt3.getVisibility() == 8) {
                        i23 = i56;
                    } else {
                        H h10 = (H) childAt3.getLayoutParams();
                        float f10 = ((LinearLayout.LayoutParams) h10).weight;
                        if (f10 > 0.0f) {
                            int i57 = (int) ((i54 * f10) / f7);
                            f7 -= f10;
                            i54 -= i57;
                            i23 = i56;
                            int childMeasureSpec = ViewGroup.getChildMeasureSpec(i7, i33.getPaddingRight() + i33.getPaddingLeft() + ((LinearLayout.LayoutParams) h10).leftMargin + ((LinearLayout.LayoutParams) h10).rightMargin, ((LinearLayout.LayoutParams) h10).width);
                            if (((LinearLayout.LayoutParams) h10).height == 0) {
                                i25 = 1073741824;
                                if (i49 == 1073741824) {
                                    if (i57 <= 0) {
                                        i57 = 0;
                                    }
                                    childAt3.measure(childMeasureSpec, View.MeasureSpec.makeMeasureSpec(i57, 1073741824));
                                    i55 = View.combineMeasuredStates(i55, childAt3.getMeasuredState() & (-256));
                                }
                            } else {
                                i25 = 1073741824;
                            }
                            int measuredHeight2 = childAt3.getMeasuredHeight() + i57;
                            if (measuredHeight2 < 0) {
                                measuredHeight2 = 0;
                            }
                            childAt3.measure(childMeasureSpec, View.MeasureSpec.makeMeasureSpec(measuredHeight2, i25));
                            i55 = View.combineMeasuredStates(i55, childAt3.getMeasuredState() & (-256));
                        } else {
                            i23 = i56;
                        }
                        int i58 = ((LinearLayout.LayoutParams) h10).leftMargin + ((LinearLayout.LayoutParams) h10).rightMargin;
                        int measuredWidth2 = childAt3.getMeasuredWidth() + i58;
                        i35 = Math.max(i35, measuredWidth2);
                        if (i48 != 1073741824) {
                            i24 = -1;
                            if (((LinearLayout.LayoutParams) h10).width == -1) {
                                measuredWidth2 = i58;
                            }
                        } else {
                            i24 = -1;
                        }
                        i40 = Math.max(i40, measuredWidth2);
                        boolean z19 = z16 && ((LinearLayout.LayoutParams) h10).width == i24;
                        int i59 = i33.f4917k;
                        i33.f4917k = Math.max(i59, childAt3.getMeasuredHeight() + i59 + ((LinearLayout.LayoutParams) h10).topMargin + ((LinearLayout.LayoutParams) h10).bottomMargin);
                        z16 = z19;
                    }
                    i56 = i23 + 1;
                }
                i33.f4917k = i33.getPaddingBottom() + i33.getPaddingTop() + i33.f4917k;
                i50 = i55;
            } else {
                i40 = Math.max(i40, i41);
                if (z18 && i49 != 1073741824) {
                    for (int i60 = 0; i60 < virtualChildCount; i60++) {
                        View childAt4 = i33.getChildAt(i60);
                        if (childAt4 != null && childAt4.getVisibility() != 8 && ((LinearLayout.LayoutParams) ((H) childAt4.getLayoutParams())).weight > 0.0f) {
                            childAt4.measure(View.MeasureSpec.makeMeasureSpec(childAt4.getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(i43, 1073741824));
                        }
                    }
                }
            }
            if (z16 || i48 == 1073741824) {
                i40 = i35;
            }
            i33.setMeasuredDimension(View.resolveSizeAndState(Math.max(i33.getPaddingRight() + i33.getPaddingLeft() + i40, i33.getSuggestedMinimumWidth()), i7, i50), resolveSizeAndState);
            if (z15) {
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i33.getMeasuredWidth(), 1073741824);
                int i61 = 0;
                while (i61 < virtualChildCount) {
                    View childAt5 = i33.getChildAt(i61);
                    if (childAt5.getVisibility() != 8) {
                        H h11 = (H) childAt5.getLayoutParams();
                        if (((LinearLayout.LayoutParams) h11).width == -1) {
                            int i62 = ((LinearLayout.LayoutParams) h11).height;
                            ((LinearLayout.LayoutParams) h11).height = childAt5.getMeasuredHeight();
                            i33.measureChildWithMargins(childAt5, makeMeasureSpec, 0, i51, 0);
                            ((LinearLayout.LayoutParams) h11).height = i62;
                        }
                    }
                    i61++;
                    i51 = i8;
                }
                return;
            }
            return;
        }
        int i63 = i7;
        i33.f4917k = 0;
        int virtualChildCount2 = i33.getVirtualChildCount();
        int mode3 = View.MeasureSpec.getMode(i63);
        int mode4 = View.MeasureSpec.getMode(i8);
        if (i33.f4920n == null || i33.f4921o == null) {
            i33.f4920n = new int[4];
            i33.f4921o = new int[4];
        }
        int[] iArr3 = i33.f4920n;
        int[] iArr4 = i33.f4921o;
        iArr3[3] = -1;
        char c7 = 2;
        iArr3[2] = -1;
        iArr3[1] = -1;
        iArr3[0] = -1;
        iArr4[3] = -1;
        iArr4[2] = -1;
        iArr4[1] = -1;
        iArr4[0] = -1;
        boolean z20 = i33.f4912f;
        boolean z21 = i33.f4919m;
        boolean z22 = mode3 == 1073741824;
        float f11 = 0.0f;
        boolean z23 = true;
        int i64 = 0;
        int i65 = 0;
        int i66 = 0;
        int i67 = 0;
        int i68 = 0;
        int i69 = 0;
        boolean z24 = false;
        boolean z25 = false;
        while (i64 < virtualChildCount2) {
            char c8 = c7;
            View childAt6 = i33.getChildAt(i64);
            if (childAt6 == null) {
                i33.f4917k = i33.f4917k;
                i18 = i64;
                i22 = i66;
                iArr2 = iArr3;
                iArr = iArr4;
                z6 = z20;
                z7 = z21;
            } else {
                int i70 = i65;
                if (childAt6.getVisibility() == 8) {
                    i63 = i7;
                    i18 = i64;
                    i22 = i66;
                    iArr = iArr4;
                    z6 = z20;
                    z7 = z21;
                    i65 = i70;
                    iArr2 = iArr3;
                } else {
                    if (i33.g(i64)) {
                        i33.f4917k += i33.f4923q;
                    }
                    H h12 = (H) childAt6.getLayoutParams();
                    float f12 = ((LinearLayout.LayoutParams) h12).weight;
                    f11 += f12;
                    int i71 = i64;
                    if (mode3 == 1073741824 && ((LinearLayout.LayoutParams) h12).width == 0 && f12 > 0.0f) {
                        if (z22) {
                            i33.f4917k = ((LinearLayout.LayoutParams) h12).leftMargin + ((LinearLayout.LayoutParams) h12).rightMargin + i33.f4917k;
                        } else {
                            int i72 = i33.f4917k;
                            i33.f4917k = Math.max(i72, ((LinearLayout.LayoutParams) h12).leftMargin + i72 + ((LinearLayout.LayoutParams) h12).rightMargin);
                        }
                        if (z20) {
                            int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 0);
                            childAt6.measure(makeMeasureSpec2, makeMeasureSpec2);
                            view = childAt6;
                            z6 = z20;
                            z7 = z21;
                            i19 = i70;
                            i18 = i71;
                            h7 = h12;
                            iArr2 = iArr3;
                            iArr = iArr4;
                            i63 = i7;
                            i20 = i66;
                            i17 = i67;
                        } else {
                            view = childAt6;
                            z6 = z20;
                            z7 = z21;
                            z25 = true;
                            i19 = i70;
                            i18 = i71;
                            i21 = 1073741824;
                            h7 = h12;
                            iArr2 = iArr3;
                            iArr = iArr4;
                            i63 = i7;
                            i20 = i66;
                            i17 = i67;
                            if (mode4 == i21 && ((LinearLayout.LayoutParams) h7).height == -1) {
                                z8 = true;
                                z24 = true;
                            } else {
                                z8 = false;
                            }
                            int i73 = ((LinearLayout.LayoutParams) h7).topMargin + ((LinearLayout.LayoutParams) h7).bottomMargin;
                            int measuredHeight3 = view.getMeasuredHeight() + i73;
                            i69 = View.combineMeasuredStates(i69, view.getMeasuredState());
                            if (z6) {
                                z9 = z8;
                            } else {
                                int baseline2 = view.getBaseline();
                                z9 = z8;
                                if (baseline2 != -1) {
                                    int i74 = ((LinearLayout.LayoutParams) h7).gravity;
                                    if (i74 < 0) {
                                        i74 = i33.f4916j;
                                    }
                                    int i75 = (((i74 & 112) >> 4) & (-2)) >> 1;
                                    iArr2[i75] = Math.max(iArr2[i75], baseline2);
                                    iArr[i75] = Math.max(iArr[i75], measuredHeight3 - baseline2);
                                }
                            }
                            int max2 = Math.max(i19, measuredHeight3);
                            boolean z26 = !z23 && ((LinearLayout.LayoutParams) h7).height == -1;
                            if (((LinearLayout.LayoutParams) h7).weight <= 0.0f) {
                                if (!z9) {
                                    i73 = measuredHeight3;
                                }
                                i67 = Math.max(i17, i73);
                                max = i20;
                            } else {
                                if (!z9) {
                                    i73 = measuredHeight3;
                                }
                                max = Math.max(i20, i73);
                                i67 = i17;
                            }
                            int i76 = max;
                            i65 = max2;
                            i22 = i76;
                            z23 = z26;
                        }
                    } else {
                        if (((LinearLayout.LayoutParams) h12).width != 0 || f12 <= 0.0f) {
                            i16 = Integer.MIN_VALUE;
                        } else {
                            ((LinearLayout.LayoutParams) h12).width = -2;
                            i16 = 0;
                        }
                        iArr = iArr4;
                        i17 = i67;
                        i18 = i71;
                        z6 = z20;
                        z7 = z21;
                        int i77 = i16;
                        h7 = h12;
                        i19 = i70;
                        i63 = i7;
                        iArr2 = iArr3;
                        i20 = i66;
                        i33.measureChildWithMargins(childAt6, i63, f11 == 0.0f ? i33.f4917k : 0, i8, 0);
                        if (i77 != Integer.MIN_VALUE) {
                            ((LinearLayout.LayoutParams) h7).width = i77;
                        }
                        int measuredWidth3 = childAt6.getMeasuredWidth();
                        if (z22) {
                            view = childAt6;
                            i33.f4917k = ((LinearLayout.LayoutParams) h7).leftMargin + measuredWidth3 + ((LinearLayout.LayoutParams) h7).rightMargin + i33.f4917k;
                        } else {
                            view = childAt6;
                            int i78 = i33.f4917k;
                            i33.f4917k = Math.max(i78, i78 + measuredWidth3 + ((LinearLayout.LayoutParams) h7).leftMargin + ((LinearLayout.LayoutParams) h7).rightMargin);
                        }
                        if (z7) {
                            i68 = Math.max(measuredWidth3, i68);
                        }
                    }
                    i21 = 1073741824;
                    if (mode4 == i21) {
                    }
                    z8 = false;
                    int i732 = ((LinearLayout.LayoutParams) h7).topMargin + ((LinearLayout.LayoutParams) h7).bottomMargin;
                    int measuredHeight32 = view.getMeasuredHeight() + i732;
                    i69 = View.combineMeasuredStates(i69, view.getMeasuredState());
                    if (z6) {
                    }
                    int max22 = Math.max(i19, measuredHeight32);
                    if (z23) {
                    }
                    if (((LinearLayout.LayoutParams) h7).weight <= 0.0f) {
                    }
                    int i762 = max;
                    i65 = max22;
                    i22 = i762;
                    z23 = z26;
                }
            }
            i66 = i22;
            i64 = i18 + 1;
            c7 = c8;
            iArr3 = iArr2;
            iArr4 = iArr;
            z20 = z6;
            z21 = z7;
        }
        int[] iArr5 = iArr3;
        int[] iArr6 = iArr4;
        char c9 = c7;
        boolean z27 = z20;
        boolean z28 = z21;
        int i79 = i65;
        int i80 = i66;
        int i81 = i67;
        if (i33.f4917k > 0 && i33.g(virtualChildCount2)) {
            i33.f4917k += i33.f4923q;
        }
        int i82 = iArr5[1];
        int max3 = (i82 == -1 && iArr5[0] == -1 && iArr5[c9] == -1 && iArr5[3] == -1) ? i79 : Math.max(i79, Math.max(iArr6[3], Math.max(iArr6[0], Math.max(iArr6[1], iArr6[c9]))) + Math.max(iArr5[3], Math.max(iArr5[0], Math.max(i82, iArr5[c9]))));
        if (z28 && (mode3 == Integer.MIN_VALUE || mode3 == 0)) {
            i33.f4917k = 0;
            for (int i83 = 0; i83 < virtualChildCount2; i83++) {
                View childAt7 = i33.getChildAt(i83);
                if (childAt7 == null) {
                    i33.f4917k = i33.f4917k;
                } else if (childAt7.getVisibility() != 8) {
                    H h13 = (H) childAt7.getLayoutParams();
                    if (z22) {
                        i33.f4917k = ((LinearLayout.LayoutParams) h13).leftMargin + i68 + ((LinearLayout.LayoutParams) h13).rightMargin + i33.f4917k;
                    } else {
                        int i84 = i33.f4917k;
                        i33.f4917k = Math.max(i84, i84 + i68 + ((LinearLayout.LayoutParams) h13).leftMargin + ((LinearLayout.LayoutParams) h13).rightMargin);
                    }
                }
            }
        }
        int paddingRight = i33.getPaddingRight() + i33.getPaddingLeft() + i33.f4917k;
        i33.f4917k = paddingRight;
        int resolveSizeAndState2 = View.resolveSizeAndState(Math.max(paddingRight, i33.getSuggestedMinimumWidth()), i63, 0);
        int i85 = (resolveSizeAndState2 & 16777215) - i33.f4917k;
        if (z25 || (i85 != 0 && f11 > 0.0f)) {
            float f13 = i33.f4918l;
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
            i33.f4917k = 0;
            max3 = -1;
            int i86 = 0;
            while (i86 < virtualChildCount2) {
                View childAt8 = i33.getChildAt(i86);
                if (childAt8 == null || childAt8.getVisibility() == 8) {
                    i13 = resolveSizeAndState2;
                } else {
                    H h14 = (H) childAt8.getLayoutParams();
                    float f14 = ((LinearLayout.LayoutParams) h14).weight;
                    if (f14 > 0.0f) {
                        int i87 = (int) ((i85 * f14) / f11);
                        f11 -= f14;
                        i85 -= i87;
                        i13 = resolveSizeAndState2;
                        int childMeasureSpec2 = ViewGroup.getChildMeasureSpec(i8, i33.getPaddingBottom() + i33.getPaddingTop() + ((LinearLayout.LayoutParams) h14).topMargin + ((LinearLayout.LayoutParams) h14).bottomMargin, ((LinearLayout.LayoutParams) h14).height);
                        if (((LinearLayout.LayoutParams) h14).width == 0) {
                            i15 = 1073741824;
                            if (mode3 == 1073741824) {
                                if (i87 <= 0) {
                                    i87 = 0;
                                }
                                childAt8.measure(View.MeasureSpec.makeMeasureSpec(i87, 1073741824), childMeasureSpec2);
                                i69 = View.combineMeasuredStates(i69, childAt8.getMeasuredState() & (-16777216));
                            }
                        } else {
                            i15 = 1073741824;
                        }
                        int measuredWidth4 = childAt8.getMeasuredWidth() + i87;
                        if (measuredWidth4 < 0) {
                            measuredWidth4 = 0;
                        }
                        childAt8.measure(View.MeasureSpec.makeMeasureSpec(measuredWidth4, i15), childMeasureSpec2);
                        i69 = View.combineMeasuredStates(i69, childAt8.getMeasuredState() & (-16777216));
                    } else {
                        i13 = resolveSizeAndState2;
                    }
                    if (z22) {
                        i33.f4917k = childAt8.getMeasuredWidth() + ((LinearLayout.LayoutParams) h14).leftMargin + ((LinearLayout.LayoutParams) h14).rightMargin + i33.f4917k;
                    } else {
                        int i88 = i33.f4917k;
                        i33.f4917k = Math.max(i88, childAt8.getMeasuredWidth() + i88 + ((LinearLayout.LayoutParams) h14).leftMargin + ((LinearLayout.LayoutParams) h14).rightMargin);
                    }
                    boolean z29 = mode4 != 1073741824 && ((LinearLayout.LayoutParams) h14).height == -1;
                    int i89 = ((LinearLayout.LayoutParams) h14).topMargin + ((LinearLayout.LayoutParams) h14).bottomMargin;
                    int measuredHeight4 = childAt8.getMeasuredHeight() + i89;
                    max3 = Math.max(max3, measuredHeight4);
                    if (!z29) {
                        i89 = measuredHeight4;
                    }
                    int max4 = Math.max(i80, i89);
                    if (z23) {
                        i14 = -1;
                        if (((LinearLayout.LayoutParams) h14).height == -1) {
                            z5 = true;
                            if (!z27 && (baseline = childAt8.getBaseline()) != i14) {
                                int i90 = ((LinearLayout.LayoutParams) h14).gravity;
                                if (i90 < 0) {
                                    i90 = i33.f4916j;
                                }
                                int i91 = (((i90 & 112) >> 4) & (-2)) >> 1;
                                iArr5[i91] = Math.max(iArr5[i91], baseline);
                                iArr6[i91] = Math.max(iArr6[i91], measuredHeight4 - baseline);
                            }
                            z23 = z5;
                            i80 = max4;
                        }
                    } else {
                        i14 = -1;
                    }
                    z5 = false;
                    if (!z27) {
                    }
                    z23 = z5;
                    i80 = max4;
                }
                i86++;
                resolveSizeAndState2 = i13;
            }
            i9 = resolveSizeAndState2;
            i10 = -16777216;
            i33.f4917k = i33.getPaddingRight() + i33.getPaddingLeft() + i33.f4917k;
            int i92 = iArr5[1];
            if (i92 == -1 && iArr5[0] == -1 && iArr5[c9] == -1 && iArr5[3] == -1) {
                i11 = 0;
            } else {
                i11 = 0;
                max3 = Math.max(max3, Math.max(iArr6[3], Math.max(iArr6[0], Math.max(iArr6[1], iArr6[c9]))) + Math.max(iArr5[3], Math.max(iArr5[0], Math.max(i92, iArr5[c9]))));
            }
            i12 = i80;
        } else {
            i12 = Math.max(i80, i81);
            if (z28 && mode3 != 1073741824) {
                for (int i93 = 0; i93 < virtualChildCount2; i93++) {
                    View childAt9 = i33.getChildAt(i93);
                    if (childAt9 != null && childAt9.getVisibility() != 8 && ((LinearLayout.LayoutParams) ((H) childAt9.getLayoutParams())).weight > 0.0f) {
                        childAt9.measure(View.MeasureSpec.makeMeasureSpec(i68, 1073741824), View.MeasureSpec.makeMeasureSpec(childAt9.getMeasuredHeight(), 1073741824));
                    }
                }
            }
            i9 = resolveSizeAndState2;
            i10 = -16777216;
            i11 = 0;
        }
        if (!z23 && mode4 != 1073741824) {
            max3 = i12;
        }
        i33.setMeasuredDimension(i9 | (i69 & i10), View.resolveSizeAndState(Math.max(i33.getPaddingBottom() + i33.getPaddingTop() + max3, i33.getSuggestedMinimumHeight()), i8, i69 << 16));
        if (z24) {
            int makeMeasureSpec3 = View.MeasureSpec.makeMeasureSpec(i33.getMeasuredHeight(), 1073741824);
            int i94 = i11;
            while (i94 < virtualChildCount2) {
                View childAt10 = i33.getChildAt(i94);
                if (childAt10.getVisibility() != 8) {
                    H h15 = (H) childAt10.getLayoutParams();
                    if (((LinearLayout.LayoutParams) h15).height == -1) {
                        int i95 = ((LinearLayout.LayoutParams) h15).width;
                        ((LinearLayout.LayoutParams) h15).width = childAt10.getMeasuredWidth();
                        i33.measureChildWithMargins(childAt10, i63, 0, makeMeasureSpec3, 0);
                        ((LinearLayout.LayoutParams) h15).width = i95;
                    }
                }
                i94++;
                i33 = this;
                i63 = i7;
            }
        }
    }

    public void setBaselineAligned(boolean z5) {
        this.f4912f = z5;
    }

    public void setBaselineAlignedChildIndex(int i7) {
        if (i7 >= 0 && i7 < getChildCount()) {
            this.f4913g = i7;
            return;
        }
        throw new IllegalArgumentException("base aligned child index out of range (0, " + getChildCount() + ")");
    }

    public void setDividerDrawable(Drawable drawable) {
        if (drawable == this.f4922p) {
            return;
        }
        this.f4922p = drawable;
        if (drawable != null) {
            this.f4923q = drawable.getIntrinsicWidth();
            this.f4924r = drawable.getIntrinsicHeight();
        } else {
            this.f4923q = 0;
            this.f4924r = 0;
        }
        setWillNotDraw(drawable == null);
        requestLayout();
    }

    public void setDividerPadding(int i7) {
        this.f4926t = i7;
    }

    public void setGravity(int i7) {
        if (this.f4916j != i7) {
            if ((8388615 & i7) == 0) {
                i7 |= 8388611;
            }
            if ((i7 & 112) == 0) {
                i7 |= 48;
            }
            this.f4916j = i7;
            requestLayout();
        }
    }

    public void setHorizontalGravity(int i7) {
        int i8 = i7 & 8388615;
        int i9 = this.f4916j;
        if ((8388615 & i9) != i8) {
            this.f4916j = i8 | ((-8388616) & i9);
            requestLayout();
        }
    }

    public void setMeasureWithLargestChildEnabled(boolean z5) {
        this.f4919m = z5;
    }

    public void setOrientation(int i7) {
        if (this.f4915i != i7) {
            this.f4915i = i7;
            requestLayout();
        }
    }

    public void setShowDividers(int i7) {
        if (i7 != this.f4925s) {
            requestLayout();
        }
        this.f4925s = i7;
    }

    public void setVerticalGravity(int i7) {
        int i8 = i7 & 112;
        int i9 = this.f4916j;
        if ((i9 & 112) != i8) {
            this.f4916j = i8 | (i9 & (-113));
            requestLayout();
        }
    }

    public void setWeightSum(float f7) {
        this.f4918l = Math.max(0.0f, f7);
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }
}
