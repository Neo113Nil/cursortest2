package j;

import B0.C0031i;
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
import c.AbstractC0165a;
import java.lang.reflect.Field;

/* loaded from: classes.dex */
public abstract class G extends ViewGroup {

    /* renamed from: e, reason: collision with root package name */
    public boolean f2852e;

    /* renamed from: f, reason: collision with root package name */
    public int f2853f;

    /* renamed from: g, reason: collision with root package name */
    public int f2854g;

    /* renamed from: h, reason: collision with root package name */
    public int f2855h;

    /* renamed from: i, reason: collision with root package name */
    public int f2856i;

    /* renamed from: j, reason: collision with root package name */
    public int f2857j;

    /* renamed from: k, reason: collision with root package name */
    public float f2858k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f2859l;

    /* renamed from: m, reason: collision with root package name */
    public int[] f2860m;

    /* renamed from: n, reason: collision with root package name */
    public int[] f2861n;

    /* renamed from: o, reason: collision with root package name */
    public Drawable f2862o;

    /* renamed from: p, reason: collision with root package name */
    public int f2863p;

    /* renamed from: q, reason: collision with root package name */
    public int f2864q;

    /* renamed from: r, reason: collision with root package name */
    public int f2865r;

    /* renamed from: s, reason: collision with root package name */
    public int f2866s;

    public G(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.f2852e = true;
        this.f2853f = -1;
        this.f2854g = 0;
        this.f2856i = 8388659;
        C0031i J = C0031i.J(context, attributeSet, AbstractC0165a.f1971i, i2);
        TypedArray typedArray = (TypedArray) J.f154f;
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
        this.f2858k = typedArray.getFloat(4, -1.0f);
        this.f2853f = typedArray.getInt(3, -1);
        this.f2859l = typedArray.getBoolean(7, false);
        setDividerDrawable(J.A(5));
        this.f2865r = typedArray.getInt(8, 0);
        this.f2866s = typedArray.getDimensionPixelSize(6, 0);
        J.N();
    }

    public final void b(Canvas canvas, int i2) {
        this.f2862o.setBounds(getPaddingLeft() + this.f2866s, i2, (getWidth() - getPaddingRight()) - this.f2866s, this.f2864q + i2);
        this.f2862o.draw(canvas);
    }

    public final void c(Canvas canvas, int i2) {
        this.f2862o.setBounds(i2, getPaddingTop() + this.f2866s, this.f2863p + i2, (getHeight() - getPaddingBottom()) - this.f2866s);
        this.f2862o.draw(canvas);
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof F;
    }

    @Override // android.view.ViewGroup
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public F generateDefaultLayoutParams() {
        int i2 = this.f2855h;
        if (i2 == 0) {
            return new F(-2);
        }
        if (i2 == 1) {
            return new F(-1);
        }
        return null;
    }

    @Override // android.view.ViewGroup
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public F generateLayoutParams(AttributeSet attributeSet) {
        return new F(getContext(), attributeSet);
    }

    @Override // android.view.ViewGroup
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public F generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new F(layoutParams);
    }

    public final boolean g(int i2) {
        if (i2 == 0) {
            return (this.f2865r & 1) != 0;
        }
        if (i2 == getChildCount()) {
            return (this.f2865r & 4) != 0;
        }
        if ((this.f2865r & 2) == 0) {
            return false;
        }
        for (int i3 = i2 - 1; i3 >= 0; i3--) {
            if (getChildAt(i3).getVisibility() != 8) {
                return true;
            }
        }
        return false;
    }

    @Override // android.view.View
    public int getBaseline() {
        int i2;
        if (this.f2853f < 0) {
            return super.getBaseline();
        }
        int childCount = getChildCount();
        int i3 = this.f2853f;
        if (childCount <= i3) {
            throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout set to an index that is out of bounds.");
        }
        View childAt = getChildAt(i3);
        int baseline = childAt.getBaseline();
        if (baseline == -1) {
            if (this.f2853f == 0) {
                return -1;
            }
            throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout points to a View that doesn't know how to get its baseline.");
        }
        int i4 = this.f2854g;
        if (this.f2855h == 1 && (i2 = this.f2856i & 112) != 48) {
            if (i2 == 16) {
                i4 += ((((getBottom() - getTop()) - getPaddingTop()) - getPaddingBottom()) - this.f2857j) / 2;
            } else if (i2 == 80) {
                i4 = ((getBottom() - getTop()) - getPaddingBottom()) - this.f2857j;
            }
        }
        return i4 + ((ViewGroup.MarginLayoutParams) ((F) childAt.getLayoutParams())).topMargin + baseline;
    }

    public int getBaselineAlignedChildIndex() {
        return this.f2853f;
    }

    public Drawable getDividerDrawable() {
        return this.f2862o;
    }

    public int getDividerPadding() {
        return this.f2866s;
    }

    public int getDividerWidth() {
        return this.f2863p;
    }

    public int getGravity() {
        return this.f2856i;
    }

    public int getOrientation() {
        return this.f2855h;
    }

    public int getShowDividers() {
        return this.f2865r;
    }

    public int getVirtualChildCount() {
        return getChildCount();
    }

    public float getWeightSum() {
        return this.f2858k;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        int right;
        int left;
        int i2;
        if (this.f2862o == null) {
            return;
        }
        int i3 = 0;
        if (this.f2855h == 1) {
            int virtualChildCount = getVirtualChildCount();
            while (i3 < virtualChildCount) {
                View childAt = getChildAt(i3);
                if (childAt != null && childAt.getVisibility() != 8 && g(i3)) {
                    b(canvas, (childAt.getTop() - ((ViewGroup.MarginLayoutParams) ((F) childAt.getLayoutParams())).topMargin) - this.f2864q);
                }
                i3++;
            }
            if (g(virtualChildCount)) {
                View childAt2 = getChildAt(virtualChildCount - 1);
                b(canvas, childAt2 == null ? (getHeight() - getPaddingBottom()) - this.f2864q : childAt2.getBottom() + ((ViewGroup.MarginLayoutParams) ((F) childAt2.getLayoutParams())).bottomMargin);
                return;
            }
            return;
        }
        int virtualChildCount2 = getVirtualChildCount();
        boolean a2 = y0.a(this);
        while (i3 < virtualChildCount2) {
            View childAt3 = getChildAt(i3);
            if (childAt3 != null && childAt3.getVisibility() != 8 && g(i3)) {
                F f2 = (F) childAt3.getLayoutParams();
                c(canvas, a2 ? childAt3.getRight() + ((ViewGroup.MarginLayoutParams) f2).rightMargin : (childAt3.getLeft() - ((ViewGroup.MarginLayoutParams) f2).leftMargin) - this.f2863p);
            }
            i3++;
        }
        if (g(virtualChildCount2)) {
            View childAt4 = getChildAt(virtualChildCount2 - 1);
            if (childAt4 != null) {
                F f3 = (F) childAt4.getLayoutParams();
                if (a2) {
                    left = childAt4.getLeft() - ((ViewGroup.MarginLayoutParams) f3).leftMargin;
                    i2 = this.f2863p;
                    right = left - i2;
                } else {
                    right = childAt4.getRight() + ((ViewGroup.MarginLayoutParams) f3).rightMargin;
                }
            } else if (a2) {
                right = getPaddingLeft();
            } else {
                left = getWidth() - getPaddingRight();
                i2 = this.f2863p;
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

    /* JADX WARN: Removed duplicated region for block: B:22:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x019e  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x018c  */
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
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20 = 8;
        if (this.f2855h == 1) {
            int paddingLeft = getPaddingLeft();
            int i21 = i4 - i2;
            int paddingRight = i21 - getPaddingRight();
            int paddingRight2 = (i21 - paddingLeft) - getPaddingRight();
            int virtualChildCount = getVirtualChildCount();
            int i22 = this.f2856i;
            int i23 = i22 & 112;
            int i24 = 8388615 & i22;
            int paddingTop = i23 != 16 ? i23 != 80 ? getPaddingTop() : ((getPaddingTop() + i5) - i3) - this.f2857j : getPaddingTop() + (((i5 - i3) - this.f2857j) / 2);
            int i25 = 0;
            while (i25 < virtualChildCount) {
                View childAt = getChildAt(i25);
                if (childAt != null && childAt.getVisibility() != i20) {
                    int measuredWidth = childAt.getMeasuredWidth();
                    int measuredHeight = childAt.getMeasuredHeight();
                    F f2 = (F) childAt.getLayoutParams();
                    int i26 = f2.f2851b;
                    if (i26 < 0) {
                        i26 = i24;
                    }
                    Field field = A.z.f58a;
                    int absoluteGravity = Gravity.getAbsoluteGravity(i26, getLayoutDirection()) & 7;
                    if (absoluteGravity == 1) {
                        i17 = ((paddingRight2 - measuredWidth) / 2) + paddingLeft + ((ViewGroup.MarginLayoutParams) f2).leftMargin;
                        i18 = ((ViewGroup.MarginLayoutParams) f2).rightMargin;
                    } else if (absoluteGravity != 5) {
                        i19 = ((ViewGroup.MarginLayoutParams) f2).leftMargin + paddingLeft;
                        if (g(i25)) {
                            paddingTop += this.f2864q;
                        }
                        int i27 = paddingTop + ((ViewGroup.MarginLayoutParams) f2).topMargin;
                        childAt.layout(i19, i27, measuredWidth + i19, i27 + measuredHeight);
                        paddingTop = measuredHeight + ((ViewGroup.MarginLayoutParams) f2).bottomMargin + i27;
                    } else {
                        i17 = paddingRight - measuredWidth;
                        i18 = ((ViewGroup.MarginLayoutParams) f2).rightMargin;
                    }
                    i19 = i17 - i18;
                    if (g(i25)) {
                    }
                    int i272 = paddingTop + ((ViewGroup.MarginLayoutParams) f2).topMargin;
                    childAt.layout(i19, i272, measuredWidth + i19, i272 + measuredHeight);
                    paddingTop = measuredHeight + ((ViewGroup.MarginLayoutParams) f2).bottomMargin + i272;
                }
                i25++;
                i20 = 8;
            }
            return;
        }
        boolean a2 = y0.a(this);
        int paddingTop2 = getPaddingTop();
        int i28 = i5 - i3;
        int paddingBottom = i28 - getPaddingBottom();
        int paddingBottom2 = (i28 - paddingTop2) - getPaddingBottom();
        int virtualChildCount2 = getVirtualChildCount();
        int i29 = this.f2856i;
        int i30 = 8388615 & i29;
        int i31 = i29 & 112;
        boolean z3 = this.f2852e;
        int[] iArr = this.f2860m;
        int[] iArr2 = this.f2861n;
        Field field2 = A.z.f58a;
        int absoluteGravity2 = Gravity.getAbsoluteGravity(i30, getLayoutDirection());
        int paddingLeft2 = absoluteGravity2 != 1 ? absoluteGravity2 != 5 ? getPaddingLeft() : ((getPaddingLeft() + i4) - i2) - this.f2857j : getPaddingLeft() + (((i4 - i2) - this.f2857j) / 2);
        if (a2) {
            i6 = virtualChildCount2 - 1;
            i7 = -1;
        } else {
            i6 = 0;
            i7 = 1;
        }
        int i32 = 0;
        while (i32 < virtualChildCount2) {
            int i33 = (i7 * i32) + i6;
            View childAt2 = getChildAt(i33);
            if (childAt2 == null) {
                i8 = i6;
                i9 = i7;
                i10 = virtualChildCount2;
                i11 = i31;
                i12 = 1;
            } else {
                i8 = i6;
                if (childAt2.getVisibility() != 8) {
                    int measuredWidth2 = childAt2.getMeasuredWidth();
                    int measuredHeight2 = childAt2.getMeasuredHeight();
                    F f3 = (F) childAt2.getLayoutParams();
                    i9 = i7;
                    if (z3) {
                        i10 = virtualChildCount2;
                        if (((ViewGroup.MarginLayoutParams) f3).height != -1) {
                            i13 = childAt2.getBaseline();
                            i14 = f3.f2851b;
                            if (i14 < 0) {
                                i14 = i31;
                            }
                            i15 = i14 & 112;
                            i11 = i31;
                            if (i15 != 16) {
                                i16 = ((((paddingBottom2 - measuredHeight2) / 2) + paddingTop2) + ((ViewGroup.MarginLayoutParams) f3).topMargin) - ((ViewGroup.MarginLayoutParams) f3).bottomMargin;
                            } else if (i15 == 48) {
                                i16 = ((ViewGroup.MarginLayoutParams) f3).topMargin + paddingTop2;
                                if (i13 != -1) {
                                    i16 = (iArr[1] - i13) + i16;
                                }
                            } else if (i15 != 80) {
                                i16 = paddingTop2;
                            } else {
                                i16 = (paddingBottom - measuredHeight2) - ((ViewGroup.MarginLayoutParams) f3).bottomMargin;
                                if (i13 != -1) {
                                    i16 -= iArr2[2] - (childAt2.getMeasuredHeight() - i13);
                                }
                            }
                            if (g(i33)) {
                                paddingLeft2 += this.f2863p;
                            }
                            int i34 = paddingLeft2 + ((ViewGroup.MarginLayoutParams) f3).leftMargin;
                            childAt2.layout(i34, i16, i34 + measuredWidth2, i16 + measuredHeight2);
                            paddingLeft2 = measuredWidth2 + ((ViewGroup.MarginLayoutParams) f3).rightMargin + i34;
                        }
                    } else {
                        i10 = virtualChildCount2;
                    }
                    i13 = -1;
                    i14 = f3.f2851b;
                    if (i14 < 0) {
                    }
                    i15 = i14 & 112;
                    i11 = i31;
                    if (i15 != 16) {
                    }
                    if (g(i33)) {
                    }
                    int i342 = paddingLeft2 + ((ViewGroup.MarginLayoutParams) f3).leftMargin;
                    childAt2.layout(i342, i16, i342 + measuredWidth2, i16 + measuredHeight2);
                    paddingLeft2 = measuredWidth2 + ((ViewGroup.MarginLayoutParams) f3).rightMargin + i342;
                } else {
                    i9 = i7;
                    i10 = virtualChildCount2;
                    i11 = i31;
                }
                i12 = 1;
            }
            i32 += i12;
            i6 = i8;
            i7 = i9;
            virtualChildCount2 = i10;
            i31 = i11;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:175:0x02db, code lost:
    
        if (((android.view.ViewGroup.MarginLayoutParams) r9).width == (-1)) goto L150;
     */
    /* JADX WARN: Removed duplicated region for block: B:240:0x0548  */
    /* JADX WARN: Removed duplicated region for block: B:245:0x0553  */
    /* JADX WARN: Removed duplicated region for block: B:260:0x0480  */
    /* JADX WARN: Removed duplicated region for block: B:263:0x04ad  */
    /* JADX WARN: Removed duplicated region for block: B:266:0x04ba  */
    /* JADX WARN: Removed duplicated region for block: B:268:0x04d8  */
    /* JADX WARN: Removed duplicated region for block: B:269:0x04c6  */
    /* JADX WARN: Removed duplicated region for block: B:270:0x04b2  */
    /* JADX WARN: Removed duplicated region for block: B:271:0x0485  */
    /* JADX WARN: Removed duplicated region for block: B:295:0x05dc  */
    /* JADX WARN: Removed duplicated region for block: B:340:0x0857  */
    /* JADX WARN: Removed duplicated region for block: B:354:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:358:0x0690  */
    /* JADX WARN: Removed duplicated region for block: B:361:0x06ac  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onMeasure(int i2, int i3) {
        char c2;
        int i4;
        int max;
        float f2;
        int i5;
        int i6;
        int i7;
        int i8;
        char c3;
        int i9;
        int i10;
        int i11;
        int i12;
        float f3;
        int i13;
        int i14;
        boolean z2;
        int baseline;
        int i15;
        int i16;
        float f4;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        boolean z3;
        boolean z4;
        F f5;
        boolean z5;
        int i22;
        boolean z6;
        int i23;
        int i24;
        int baseline2;
        int i25;
        int i26;
        int i27;
        int i28;
        int i29;
        int i30;
        int i31;
        int i32;
        int i33;
        int i34;
        int i35;
        F f6;
        boolean z7;
        boolean z8;
        int max2;
        int i36 = -2;
        int i37 = 1073741824;
        int i38 = 8;
        int i39 = Integer.MIN_VALUE;
        float f7 = 0.0f;
        if (this.f2855h == 1) {
            this.f2857j = 0;
            int virtualChildCount = getVirtualChildCount();
            int mode = View.MeasureSpec.getMode(i2);
            int mode2 = View.MeasureSpec.getMode(i3);
            int i40 = this.f2853f;
            boolean z9 = this.f2859l;
            int i41 = 0;
            float f8 = 0.0f;
            int i42 = 0;
            int i43 = 0;
            boolean z10 = false;
            int i44 = 0;
            int i45 = 0;
            int i46 = 0;
            boolean z11 = true;
            boolean z12 = false;
            while (i41 < virtualChildCount) {
                View childAt = getChildAt(i41);
                if (childAt == null) {
                    this.f2857j = this.f2857j;
                } else if (childAt.getVisibility() != i38) {
                    if (g(i41)) {
                        this.f2857j += this.f2864q;
                    }
                    F f9 = (F) childAt.getLayoutParams();
                    float f10 = f9.f2850a;
                    f8 += f10;
                    if (mode2 == i37 && ((ViewGroup.MarginLayoutParams) f9).height == 0 && f10 > f7) {
                        int i47 = this.f2857j;
                        this.f2857j = Math.max(i47, ((ViewGroup.MarginLayoutParams) f9).topMargin + i47 + ((ViewGroup.MarginLayoutParams) f9).bottomMargin);
                        i32 = i40;
                        i33 = mode2;
                        i34 = mode;
                        i35 = virtualChildCount;
                        f6 = f9;
                        z7 = true;
                    } else {
                        if (((ViewGroup.MarginLayoutParams) f9).height != 0 || f10 <= f7) {
                            i31 = Integer.MIN_VALUE;
                        } else {
                            ((ViewGroup.MarginLayoutParams) f9).height = i36;
                            i31 = 0;
                        }
                        int i48 = f8 == f7 ? this.f2857j : 0;
                        i32 = i40;
                        i33 = mode2;
                        i34 = mode;
                        i35 = virtualChildCount;
                        f6 = f9;
                        measureChildWithMargins(childAt, i2, 0, i3, i48);
                        if (i31 != i39) {
                            ((ViewGroup.MarginLayoutParams) f6).height = i31;
                        }
                        int measuredHeight = childAt.getMeasuredHeight();
                        int i49 = this.f2857j;
                        this.f2857j = Math.max(i49, i49 + measuredHeight + ((ViewGroup.MarginLayoutParams) f6).topMargin + ((ViewGroup.MarginLayoutParams) f6).bottomMargin);
                        int i50 = i44;
                        if (z9) {
                            i44 = Math.max(measuredHeight, i50);
                        }
                        z7 = z10;
                    }
                    if (i32 >= 0 && i32 == i41 + 1) {
                        this.f2854g = this.f2857j;
                    }
                    float f11 = f6.f2850a;
                    if (i41 < i32 && f11 > 0.0f) {
                        throw new RuntimeException("A child of LinearLayout with index less than mBaselineAlignedChildIndex has weight > 0, which won't work.  Either remove the weight, or don't set mBaselineAlignedChildIndex.");
                    }
                    mode = i34;
                    if (mode == 1073741824 || ((ViewGroup.MarginLayoutParams) f6).width != -1) {
                        z8 = false;
                    } else {
                        z8 = true;
                        z12 = true;
                    }
                    int i51 = ((ViewGroup.MarginLayoutParams) f6).leftMargin + ((ViewGroup.MarginLayoutParams) f6).rightMargin;
                    int measuredWidth = childAt.getMeasuredWidth() + i51;
                    max2 = Math.max(i45, measuredWidth);
                    int combineMeasuredStates = View.combineMeasuredStates(i46, childAt.getMeasuredState());
                    boolean z13 = z11 && ((ViewGroup.MarginLayoutParams) f6).width == -1;
                    if (f11 > 0.0f) {
                        if (!z8) {
                            i51 = measuredWidth;
                        }
                        i43 = Math.max(i43, i51);
                    } else {
                        int i52 = i43;
                        if (!z8) {
                            i51 = measuredWidth;
                        }
                        i42 = Math.max(i42, i51);
                        i43 = i52;
                    }
                    z10 = z7;
                    i46 = combineMeasuredStates;
                    z11 = z13;
                    i41++;
                    i40 = i32;
                    i45 = max2;
                    mode2 = i33;
                    virtualChildCount = i35;
                    i36 = -2;
                    i37 = 1073741824;
                    i38 = 8;
                    i39 = Integer.MIN_VALUE;
                    f7 = 0.0f;
                }
                i32 = i40;
                i33 = mode2;
                i35 = virtualChildCount;
                max2 = i45;
                i41++;
                i40 = i32;
                i45 = max2;
                mode2 = i33;
                virtualChildCount = i35;
                i36 = -2;
                i37 = 1073741824;
                i38 = 8;
                i39 = Integer.MIN_VALUE;
                f7 = 0.0f;
            }
            int i53 = mode2;
            int i54 = virtualChildCount;
            int i55 = i42;
            int i56 = i43;
            int i57 = i44;
            int i58 = i45;
            int i59 = i46;
            if (this.f2857j > 0 && g(i54)) {
                this.f2857j += this.f2864q;
            }
            int i60 = i53;
            if (z9 && (i60 == Integer.MIN_VALUE || i60 == 0)) {
                this.f2857j = 0;
                for (int i61 = 0; i61 < i54; i61++) {
                    View childAt2 = getChildAt(i61);
                    if (childAt2 == null) {
                        this.f2857j = this.f2857j;
                    } else if (childAt2.getVisibility() != 8) {
                        F f12 = (F) childAt2.getLayoutParams();
                        int i62 = this.f2857j;
                        this.f2857j = Math.max(i62, i62 + i57 + ((ViewGroup.MarginLayoutParams) f12).topMargin + ((ViewGroup.MarginLayoutParams) f12).bottomMargin);
                    }
                }
            }
            int paddingBottom = getPaddingBottom() + getPaddingTop() + this.f2857j;
            this.f2857j = paddingBottom;
            int resolveSizeAndState = View.resolveSizeAndState(Math.max(paddingBottom, getSuggestedMinimumHeight()), i3, 0);
            int i63 = (16777215 & resolveSizeAndState) - this.f2857j;
            if (z10 || (i63 != 0 && f8 > 0.0f)) {
                float f13 = this.f2858k;
                if (f13 > 0.0f) {
                    f8 = f13;
                }
                this.f2857j = 0;
                int i64 = 0;
                while (i64 < i54) {
                    View childAt3 = getChildAt(i64);
                    if (childAt3.getVisibility() == 8) {
                        i27 = i60;
                    } else {
                        F f14 = (F) childAt3.getLayoutParams();
                        float f15 = f14.f2850a;
                        if (f15 > 0.0f) {
                            int i65 = (int) ((i63 * f15) / f8);
                            f8 -= f15;
                            int i66 = i63 - i65;
                            int childMeasureSpec = ViewGroup.getChildMeasureSpec(i2, getPaddingRight() + getPaddingLeft() + ((ViewGroup.MarginLayoutParams) f14).leftMargin + ((ViewGroup.MarginLayoutParams) f14).rightMargin, ((ViewGroup.MarginLayoutParams) f14).width);
                            if (((ViewGroup.MarginLayoutParams) f14).height == 0) {
                                i30 = 1073741824;
                                if (i60 == 1073741824) {
                                    if (i65 <= 0) {
                                        i65 = 0;
                                    }
                                    childAt3.measure(childMeasureSpec, View.MeasureSpec.makeMeasureSpec(i65, 1073741824));
                                    i59 = View.combineMeasuredStates(i59, childAt3.getMeasuredState() & (-256));
                                    i63 = i66;
                                }
                            } else {
                                i30 = 1073741824;
                            }
                            int measuredHeight2 = childAt3.getMeasuredHeight() + i65;
                            if (measuredHeight2 < 0) {
                                measuredHeight2 = 0;
                            }
                            childAt3.measure(childMeasureSpec, View.MeasureSpec.makeMeasureSpec(measuredHeight2, i30));
                            i59 = View.combineMeasuredStates(i59, childAt3.getMeasuredState() & (-256));
                            i63 = i66;
                        }
                        int i67 = ((ViewGroup.MarginLayoutParams) f14).leftMargin + ((ViewGroup.MarginLayoutParams) f14).rightMargin;
                        int measuredWidth2 = childAt3.getMeasuredWidth() + i67;
                        int max3 = Math.max(i58, measuredWidth2);
                        i27 = i60;
                        if (mode != 1073741824) {
                            i28 = max3;
                            i29 = -1;
                        } else {
                            i28 = max3;
                            i29 = -1;
                        }
                        i67 = measuredWidth2;
                        i55 = Math.max(i55, i67);
                        boolean z14 = z11 && ((ViewGroup.MarginLayoutParams) f14).width == i29;
                        int i68 = this.f2857j;
                        this.f2857j = Math.max(i68, childAt3.getMeasuredHeight() + i68 + ((ViewGroup.MarginLayoutParams) f14).topMargin + ((ViewGroup.MarginLayoutParams) f14).bottomMargin);
                        z11 = z14;
                        i58 = i28;
                    }
                    i64++;
                    i60 = i27;
                }
                this.f2857j = getPaddingBottom() + getPaddingTop() + this.f2857j;
                i26 = i55;
            } else {
                i26 = Math.max(i55, i56);
                if (z9 && i60 != 1073741824) {
                    for (int i69 = 0; i69 < i54; i69++) {
                        View childAt4 = getChildAt(i69);
                        if (childAt4 != null && childAt4.getVisibility() != 8 && ((F) childAt4.getLayoutParams()).f2850a > 0.0f) {
                            childAt4.measure(View.MeasureSpec.makeMeasureSpec(childAt4.getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(i57, 1073741824));
                        }
                    }
                }
            }
            int i70 = i58;
            if (z11 || mode == 1073741824) {
                i26 = i70;
            }
            setMeasuredDimension(View.resolveSizeAndState(Math.max(getPaddingRight() + getPaddingLeft() + i26, getSuggestedMinimumWidth()), i2, i59), resolveSizeAndState);
            if (z12) {
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824);
                for (int i71 = 0; i71 < i54; i71++) {
                    View childAt5 = getChildAt(i71);
                    if (childAt5.getVisibility() != 8) {
                        F f16 = (F) childAt5.getLayoutParams();
                        if (((ViewGroup.MarginLayoutParams) f16).width == -1) {
                            int i72 = ((ViewGroup.MarginLayoutParams) f16).height;
                            ((ViewGroup.MarginLayoutParams) f16).height = childAt5.getMeasuredHeight();
                            measureChildWithMargins(childAt5, makeMeasureSpec, 0, i3, 0);
                            ((ViewGroup.MarginLayoutParams) f16).height = i72;
                        }
                    }
                }
                return;
            }
            return;
        }
        this.f2857j = 0;
        int virtualChildCount2 = getVirtualChildCount();
        int mode3 = View.MeasureSpec.getMode(i2);
        int mode4 = View.MeasureSpec.getMode(i3);
        if (this.f2860m == null || this.f2861n == null) {
            this.f2860m = new int[4];
            this.f2861n = new int[4];
        }
        int[] iArr = this.f2860m;
        int[] iArr2 = this.f2861n;
        iArr[3] = -1;
        iArr[2] = -1;
        iArr[1] = -1;
        iArr[0] = -1;
        iArr2[3] = -1;
        iArr2[2] = -1;
        iArr2[1] = -1;
        iArr2[0] = -1;
        boolean z15 = this.f2852e;
        boolean z16 = this.f2859l;
        boolean z17 = mode3 == 1073741824;
        int i73 = 0;
        float f17 = 0.0f;
        int i74 = 0;
        int i75 = 0;
        int i76 = 0;
        int i77 = 0;
        int i78 = 0;
        boolean z18 = true;
        boolean z19 = false;
        boolean z20 = false;
        while (i75 < virtualChildCount2) {
            View childAt6 = getChildAt(i75);
            if (childAt6 == null) {
                this.f2857j = this.f2857j;
                i21 = i75;
                z3 = z16;
                z4 = z15;
            } else {
                int i79 = i73;
                int i80 = i74;
                if (childAt6.getVisibility() == 8) {
                    z4 = z15;
                    i73 = i79;
                    i74 = i80;
                    i21 = i75;
                    z3 = z16;
                } else {
                    if (g(i75)) {
                        this.f2857j += this.f2863p;
                    }
                    F f18 = (F) childAt6.getLayoutParams();
                    float f19 = f18.f2850a;
                    float f20 = f17 + f19;
                    if (mode3 == 1073741824 && ((ViewGroup.MarginLayoutParams) f18).width == 0 && f19 > 0.0f) {
                        if (z17) {
                            i25 = i75;
                            this.f2857j = ((ViewGroup.MarginLayoutParams) f18).leftMargin + ((ViewGroup.MarginLayoutParams) f18).rightMargin + this.f2857j;
                        } else {
                            i25 = i75;
                            int i81 = this.f2857j;
                            this.f2857j = Math.max(i81, ((ViewGroup.MarginLayoutParams) f18).leftMargin + i81 + ((ViewGroup.MarginLayoutParams) f18).rightMargin);
                        }
                        if (z15) {
                            int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 0);
                            childAt6.measure(makeMeasureSpec2, makeMeasureSpec2);
                            f5 = f18;
                            i18 = i79;
                            i19 = i80;
                            i21 = i25;
                            z3 = z16;
                            z4 = z15;
                        } else {
                            f5 = f18;
                            i18 = i79;
                            i19 = i80;
                            i21 = i25;
                            i22 = 1073741824;
                            z3 = z16;
                            z4 = z15;
                            z5 = true;
                            if (mode4 == i22 && ((ViewGroup.MarginLayoutParams) f5).height == -1) {
                                z6 = true;
                                z20 = true;
                            } else {
                                z6 = false;
                            }
                            i23 = ((ViewGroup.MarginLayoutParams) f5).topMargin + ((ViewGroup.MarginLayoutParams) f5).bottomMargin;
                            int measuredHeight3 = childAt6.getMeasuredHeight() + i23;
                            int combineMeasuredStates2 = View.combineMeasuredStates(i76, childAt6.getMeasuredState());
                            if (z4 || (baseline2 = childAt6.getBaseline()) == -1) {
                                i24 = i23;
                            } else {
                                int i82 = f5.f2851b;
                                if (i82 < 0) {
                                    i82 = this.f2856i;
                                }
                                int i83 = (((i82 & 112) >> 4) & (-2)) >> 1;
                                i24 = i23;
                                iArr[i83] = Math.max(iArr[i83], baseline2);
                                iArr2[i83] = Math.max(iArr2[i83], measuredHeight3 - baseline2);
                            }
                            int max4 = Math.max(i19, measuredHeight3);
                            boolean z21 = !z18 && ((ViewGroup.MarginLayoutParams) f5).height == -1;
                            if (f5.f2850a <= 0.0f) {
                                if (z6) {
                                    measuredHeight3 = i24;
                                }
                                i78 = Math.max(i78, measuredHeight3);
                                i73 = i18;
                            } else {
                                if (z6) {
                                    measuredHeight3 = i24;
                                }
                                i73 = Math.max(i18, measuredHeight3);
                            }
                            i74 = max4;
                            i76 = combineMeasuredStates2;
                            z19 = z5;
                            z18 = z21;
                            f17 = f20;
                        }
                    } else {
                        int i84 = i75;
                        if (((ViewGroup.MarginLayoutParams) f18).width == 0) {
                            f4 = 0.0f;
                            if (f19 > 0.0f) {
                                ((ViewGroup.MarginLayoutParams) f18).width = -2;
                                i17 = 0;
                                i18 = i79;
                                i19 = i80;
                                i20 = i17;
                                i21 = i84;
                                z3 = z16;
                                z4 = z15;
                                measureChildWithMargins(childAt6, i2, f20 != f4 ? this.f2857j : 0, i3, 0);
                                if (i20 == Integer.MIN_VALUE) {
                                    f5 = f18;
                                    ((ViewGroup.MarginLayoutParams) f5).width = i20;
                                } else {
                                    f5 = f18;
                                }
                                int measuredWidth3 = childAt6.getMeasuredWidth();
                                if (z17) {
                                    int i85 = this.f2857j;
                                    this.f2857j = Math.max(i85, i85 + measuredWidth3 + ((ViewGroup.MarginLayoutParams) f5).leftMargin + ((ViewGroup.MarginLayoutParams) f5).rightMargin);
                                } else {
                                    this.f2857j = ((ViewGroup.MarginLayoutParams) f5).leftMargin + measuredWidth3 + ((ViewGroup.MarginLayoutParams) f5).rightMargin + this.f2857j;
                                }
                                if (z3) {
                                    i77 = Math.max(measuredWidth3, i77);
                                }
                            }
                        } else {
                            f4 = 0.0f;
                        }
                        i17 = Integer.MIN_VALUE;
                        i18 = i79;
                        i19 = i80;
                        i20 = i17;
                        i21 = i84;
                        z3 = z16;
                        z4 = z15;
                        measureChildWithMargins(childAt6, i2, f20 != f4 ? this.f2857j : 0, i3, 0);
                        if (i20 == Integer.MIN_VALUE) {
                        }
                        int measuredWidth32 = childAt6.getMeasuredWidth();
                        if (z17) {
                        }
                        if (z3) {
                        }
                    }
                    z5 = z19;
                    i22 = 1073741824;
                    if (mode4 == i22) {
                    }
                    z6 = false;
                    i23 = ((ViewGroup.MarginLayoutParams) f5).topMargin + ((ViewGroup.MarginLayoutParams) f5).bottomMargin;
                    int measuredHeight32 = childAt6.getMeasuredHeight() + i23;
                    int combineMeasuredStates22 = View.combineMeasuredStates(i76, childAt6.getMeasuredState());
                    if (z4) {
                    }
                    i24 = i23;
                    int max42 = Math.max(i19, measuredHeight32);
                    if (z18) {
                    }
                    if (f5.f2850a <= 0.0f) {
                    }
                    i74 = max42;
                    i76 = combineMeasuredStates22;
                    z19 = z5;
                    z18 = z21;
                    f17 = f20;
                }
            }
            i75 = i21 + 1;
            z16 = z3;
            z15 = z4;
        }
        int i86 = i74;
        boolean z22 = z16;
        boolean z23 = z15;
        if (this.f2857j > 0 && g(virtualChildCount2)) {
            this.f2857j += this.f2863p;
        }
        int i87 = iArr[1];
        if (i87 == -1 && iArr[0] == -1 && iArr[2] == -1) {
            c2 = 3;
            if (iArr[3] == -1) {
                max = i86;
                i4 = i76;
                if (z22 && (mode3 == Integer.MIN_VALUE || mode3 == 0)) {
                    this.f2857j = 0;
                    for (i16 = 0; i16 < virtualChildCount2; i16++) {
                        View childAt7 = getChildAt(i16);
                        if (childAt7 == null) {
                            this.f2857j = this.f2857j;
                        } else if (childAt7.getVisibility() != 8) {
                            F f21 = (F) childAt7.getLayoutParams();
                            if (z17) {
                                this.f2857j = ((ViewGroup.MarginLayoutParams) f21).leftMargin + i77 + ((ViewGroup.MarginLayoutParams) f21).rightMargin + this.f2857j;
                            } else {
                                int i88 = this.f2857j;
                                this.f2857j = Math.max(i88, i88 + i77 + ((ViewGroup.MarginLayoutParams) f21).leftMargin + ((ViewGroup.MarginLayoutParams) f21).rightMargin);
                            }
                        }
                    }
                }
                int paddingRight = getPaddingRight() + getPaddingLeft() + this.f2857j;
                this.f2857j = paddingRight;
                int resolveSizeAndState2 = View.resolveSizeAndState(Math.max(paddingRight, getSuggestedMinimumWidth()), i2, 0);
                int i89 = (16777215 & resolveSizeAndState2) - this.f2857j;
                if (!z19 || (i89 != 0 && f17 > 0.0f)) {
                    f2 = this.f2858k;
                    if (f2 > 0.0f) {
                        f17 = f2;
                    }
                    iArr[3] = -1;
                    iArr[2] = -1;
                    iArr[1] = -1;
                    iArr[0] = -1;
                    iArr2[3] = -1;
                    iArr2[2] = -1;
                    iArr2[1] = -1;
                    iArr2[0] = -1;
                    this.f2857j = 0;
                    int i90 = i4;
                    max = -1;
                    i5 = 0;
                    while (i5 < virtualChildCount2) {
                        View childAt8 = getChildAt(i5);
                        if (childAt8 == null || childAt8.getVisibility() == 8) {
                            i10 = i89;
                            i11 = virtualChildCount2;
                        } else {
                            F f22 = (F) childAt8.getLayoutParams();
                            float f23 = f22.f2850a;
                            if (f23 > 0.0f) {
                                i11 = virtualChildCount2;
                                int i91 = (int) ((i89 * f23) / f17);
                                float f24 = f17 - f23;
                                int i92 = i89 - i91;
                                int childMeasureSpec2 = ViewGroup.getChildMeasureSpec(i3, getPaddingBottom() + getPaddingTop() + ((ViewGroup.MarginLayoutParams) f22).topMargin + ((ViewGroup.MarginLayoutParams) f22).bottomMargin, ((ViewGroup.MarginLayoutParams) f22).height);
                                if (((ViewGroup.MarginLayoutParams) f22).width == 0) {
                                    i15 = 1073741824;
                                    if (mode3 == 1073741824) {
                                        if (i91 <= 0) {
                                            i91 = 0;
                                        }
                                        childAt8.measure(View.MeasureSpec.makeMeasureSpec(i91, 1073741824), childMeasureSpec2);
                                        i90 = View.combineMeasuredStates(i90, childAt8.getMeasuredState() & (-16777216));
                                        f17 = f24;
                                        i12 = i92;
                                    }
                                } else {
                                    i15 = 1073741824;
                                }
                                int measuredWidth4 = childAt8.getMeasuredWidth() + i91;
                                if (measuredWidth4 < 0) {
                                    measuredWidth4 = 0;
                                }
                                childAt8.measure(View.MeasureSpec.makeMeasureSpec(measuredWidth4, i15), childMeasureSpec2);
                                i90 = View.combineMeasuredStates(i90, childAt8.getMeasuredState() & (-16777216));
                                f17 = f24;
                                i12 = i92;
                            } else {
                                i12 = i89;
                                i11 = virtualChildCount2;
                            }
                            if (z17) {
                                f3 = f17;
                                this.f2857j = childAt8.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) f22).leftMargin + ((ViewGroup.MarginLayoutParams) f22).rightMargin + this.f2857j;
                                i13 = i12;
                            } else {
                                f3 = f17;
                                int i93 = this.f2857j;
                                i13 = i12;
                                this.f2857j = Math.max(i93, childAt8.getMeasuredWidth() + i93 + ((ViewGroup.MarginLayoutParams) f22).leftMargin + ((ViewGroup.MarginLayoutParams) f22).rightMargin);
                            }
                            boolean z24 = mode4 != 1073741824 && ((ViewGroup.MarginLayoutParams) f22).height == -1;
                            int i94 = ((ViewGroup.MarginLayoutParams) f22).topMargin + ((ViewGroup.MarginLayoutParams) f22).bottomMargin;
                            int measuredHeight4 = childAt8.getMeasuredHeight() + i94;
                            max = Math.max(max, measuredHeight4);
                            if (!z24) {
                                i94 = measuredHeight4;
                            }
                            i73 = Math.max(i73, i94);
                            if (z18) {
                                i14 = -1;
                                if (((ViewGroup.MarginLayoutParams) f22).height == -1) {
                                    z2 = true;
                                    if (!z23 && (baseline = childAt8.getBaseline()) != i14) {
                                        int i95 = f22.f2851b;
                                        if (i95 < 0) {
                                            i95 = this.f2856i;
                                        }
                                        int i96 = (((i95 & 112) >> 4) & (-2)) >> 1;
                                        iArr[i96] = Math.max(iArr[i96], baseline);
                                        iArr2[i96] = Math.max(iArr2[i96], measuredHeight4 - baseline);
                                    }
                                    z18 = z2;
                                    i10 = i13;
                                    f17 = f3;
                                }
                            } else {
                                i14 = -1;
                            }
                            z2 = false;
                            if (!z23) {
                            }
                            z18 = z2;
                            i10 = i13;
                            f17 = f3;
                        }
                        i5++;
                        i89 = i10;
                        virtualChildCount2 = i11;
                    }
                    i6 = i3;
                    i7 = virtualChildCount2;
                    this.f2857j = getPaddingRight() + getPaddingLeft() + this.f2857j;
                    i8 = iArr[1];
                    if (i8 != -1 && iArr[0] == -1 && iArr[2] == -1) {
                        c3 = 3;
                        if (iArr[3] == -1) {
                            i9 = 0;
                            i4 = i90;
                        }
                    } else {
                        c3 = 3;
                    }
                    i9 = 0;
                    max = Math.max(max, Math.max(iArr2[c3], Math.max(iArr2[0], Math.max(iArr2[1], iArr2[2]))) + Math.max(iArr[c3], Math.max(iArr[0], Math.max(i8, iArr[2]))));
                    i4 = i90;
                } else {
                    i73 = Math.max(i73, i78);
                    if (z22 && mode3 != 1073741824) {
                        for (int i97 = 0; i97 < virtualChildCount2; i97++) {
                            View childAt9 = getChildAt(i97);
                            if (childAt9 != null && childAt9.getVisibility() != 8 && ((F) childAt9.getLayoutParams()).f2850a > 0.0f) {
                                childAt9.measure(View.MeasureSpec.makeMeasureSpec(i77, 1073741824), View.MeasureSpec.makeMeasureSpec(childAt9.getMeasuredHeight(), 1073741824));
                            }
                        }
                    }
                    i6 = i3;
                    i7 = virtualChildCount2;
                    i9 = 0;
                }
                if (!z18 || mode4 == 1073741824) {
                    i73 = max;
                }
                setMeasuredDimension((i4 & (-16777216)) | resolveSizeAndState2, View.resolveSizeAndState(Math.max(getPaddingBottom() + getPaddingTop() + i73, getSuggestedMinimumHeight()), i6, i4 << 16));
                if (z20) {
                    return;
                }
                int makeMeasureSpec3 = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824);
                int i98 = i7;
                while (i9 < i98) {
                    View childAt10 = getChildAt(i9);
                    if (childAt10.getVisibility() != 8) {
                        F f25 = (F) childAt10.getLayoutParams();
                        if (((ViewGroup.MarginLayoutParams) f25).height == -1) {
                            int i99 = ((ViewGroup.MarginLayoutParams) f25).width;
                            ((ViewGroup.MarginLayoutParams) f25).width = childAt10.getMeasuredWidth();
                            measureChildWithMargins(childAt10, i2, 0, makeMeasureSpec3, 0);
                            ((ViewGroup.MarginLayoutParams) f25).width = i99;
                        }
                    }
                    i9++;
                }
                return;
            }
        } else {
            c2 = 3;
        }
        i4 = i76;
        max = Math.max(i86, Math.max(iArr2[3], Math.max(iArr2[0], Math.max(iArr2[1], iArr2[2]))) + Math.max(iArr[c2], Math.max(iArr[0], Math.max(i87, iArr[2]))));
        if (z22) {
            this.f2857j = 0;
            while (i16 < virtualChildCount2) {
            }
        }
        int paddingRight2 = getPaddingRight() + getPaddingLeft() + this.f2857j;
        this.f2857j = paddingRight2;
        int resolveSizeAndState22 = View.resolveSizeAndState(Math.max(paddingRight2, getSuggestedMinimumWidth()), i2, 0);
        int i892 = (16777215 & resolveSizeAndState22) - this.f2857j;
        if (z19) {
        }
        f2 = this.f2858k;
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
        this.f2857j = 0;
        int i902 = i4;
        max = -1;
        i5 = 0;
        while (i5 < virtualChildCount2) {
        }
        i6 = i3;
        i7 = virtualChildCount2;
        this.f2857j = getPaddingRight() + getPaddingLeft() + this.f2857j;
        i8 = iArr[1];
        if (i8 != -1) {
        }
        c3 = 3;
        i9 = 0;
        max = Math.max(max, Math.max(iArr2[c3], Math.max(iArr2[0], Math.max(iArr2[1], iArr2[2]))) + Math.max(iArr[c3], Math.max(iArr[0], Math.max(i8, iArr[2]))));
        i4 = i902;
        if (!z18) {
        }
        i73 = max;
        setMeasuredDimension((i4 & (-16777216)) | resolveSizeAndState22, View.resolveSizeAndState(Math.max(getPaddingBottom() + getPaddingTop() + i73, getSuggestedMinimumHeight()), i6, i4 << 16));
        if (z20) {
        }
    }

    public void setBaselineAligned(boolean z2) {
        this.f2852e = z2;
    }

    public void setBaselineAlignedChildIndex(int i2) {
        if (i2 >= 0 && i2 < getChildCount()) {
            this.f2853f = i2;
            return;
        }
        throw new IllegalArgumentException("base aligned child index out of range (0, " + getChildCount() + ")");
    }

    public void setDividerDrawable(Drawable drawable) {
        if (drawable == this.f2862o) {
            return;
        }
        this.f2862o = drawable;
        if (drawable != null) {
            this.f2863p = drawable.getIntrinsicWidth();
            this.f2864q = drawable.getIntrinsicHeight();
        } else {
            this.f2863p = 0;
            this.f2864q = 0;
        }
        setWillNotDraw(drawable == null);
        requestLayout();
    }

    public void setDividerPadding(int i2) {
        this.f2866s = i2;
    }

    public void setGravity(int i2) {
        if (this.f2856i != i2) {
            if ((8388615 & i2) == 0) {
                i2 |= 8388611;
            }
            if ((i2 & 112) == 0) {
                i2 |= 48;
            }
            this.f2856i = i2;
            requestLayout();
        }
    }

    public void setHorizontalGravity(int i2) {
        int i3 = i2 & 8388615;
        int i4 = this.f2856i;
        if ((8388615 & i4) != i3) {
            this.f2856i = i3 | ((-8388616) & i4);
            requestLayout();
        }
    }

    public void setMeasureWithLargestChildEnabled(boolean z2) {
        this.f2859l = z2;
    }

    public void setOrientation(int i2) {
        if (this.f2855h != i2) {
            this.f2855h = i2;
            requestLayout();
        }
    }

    public void setShowDividers(int i2) {
        if (i2 != this.f2865r) {
            requestLayout();
        }
        this.f2865r = i2;
    }

    public void setVerticalGravity(int i2) {
        int i3 = i2 & 112;
        int i4 = this.f2856i;
        if ((i4 & 112) != i3) {
            this.f2856i = i3 | (i4 & (-113));
            requestLayout();
        }
    }

    public void setWeightSum(float f2) {
        this.f2858k = Math.max(0.0f, f2);
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }
}
