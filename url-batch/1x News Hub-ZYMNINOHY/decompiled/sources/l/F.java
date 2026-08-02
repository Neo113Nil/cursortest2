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
import g.AbstractC0328a;
import java.lang.reflect.Field;

/* loaded from: classes.dex */
public abstract class F extends ViewGroup {

    /* renamed from: a, reason: collision with root package name */
    public boolean f9712a;

    /* renamed from: b, reason: collision with root package name */
    public int f9713b;

    /* renamed from: c, reason: collision with root package name */
    public int f9714c;

    /* renamed from: d, reason: collision with root package name */
    public int f9715d;

    /* renamed from: e, reason: collision with root package name */
    public int f9716e;
    public int f;

    /* renamed from: g, reason: collision with root package name */
    public float f9717g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f9718h;

    /* renamed from: i, reason: collision with root package name */
    public int[] f9719i;

    /* renamed from: j, reason: collision with root package name */
    public int[] f9720j;

    /* renamed from: k, reason: collision with root package name */
    public Drawable f9721k;

    /* renamed from: l, reason: collision with root package name */
    public int f9722l;

    /* renamed from: m, reason: collision with root package name */
    public int f9723m;

    /* renamed from: n, reason: collision with root package name */
    public int f9724n;
    public int o;

    public F(Context context, AttributeSet attributeSet, int i3) {
        super(context, attributeSet, i3);
        this.f9712a = true;
        this.f9713b = -1;
        this.f9714c = 0;
        this.f9716e = 8388659;
        A0.f K2 = A0.f.K(context, attributeSet, AbstractC0328a.f4996i, i3);
        TypedArray typedArray = (TypedArray) K2.f24c;
        int i4 = typedArray.getInt(1, -1);
        if (i4 >= 0) {
            setOrientation(i4);
        }
        int i5 = typedArray.getInt(0, -1);
        if (i5 >= 0) {
            setGravity(i5);
        }
        boolean z = typedArray.getBoolean(2, true);
        if (!z) {
            setBaselineAligned(z);
        }
        this.f9717g = typedArray.getFloat(4, -1.0f);
        this.f9713b = typedArray.getInt(3, -1);
        this.f9718h = typedArray.getBoolean(7, false);
        setDividerDrawable(K2.C(5));
        this.f9724n = typedArray.getInt(8, 0);
        this.o = typedArray.getDimensionPixelSize(6, 0);
        K2.O();
    }

    public final void b(Canvas canvas, int i3) {
        this.f9721k.setBounds(getPaddingLeft() + this.o, i3, (getWidth() - getPaddingRight()) - this.o, this.f9723m + i3);
        this.f9721k.draw(canvas);
    }

    public final void c(Canvas canvas, int i3) {
        this.f9721k.setBounds(i3, getPaddingTop() + this.o, this.f9722l + i3, (getHeight() - getPaddingBottom()) - this.o);
        this.f9721k.draw(canvas);
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof E;
    }

    @Override // android.view.ViewGroup
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public E generateDefaultLayoutParams() {
        int i3 = this.f9715d;
        if (i3 == 0) {
            return new E(-2);
        }
        if (i3 == 1) {
            return new E(-1);
        }
        return null;
    }

    @Override // android.view.ViewGroup
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public E generateLayoutParams(AttributeSet attributeSet) {
        return new E(getContext(), attributeSet);
    }

    @Override // android.view.ViewGroup
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public E generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new E(layoutParams);
    }

    public final boolean g(int i3) {
        if (i3 == 0) {
            return (this.f9724n & 1) != 0;
        }
        if (i3 == getChildCount()) {
            return (this.f9724n & 4) != 0;
        }
        if ((this.f9724n & 2) != 0) {
            for (int i4 = i3 - 1; i4 >= 0; i4--) {
                if (getChildAt(i4).getVisibility() != 8) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // android.view.View
    public int getBaseline() {
        int i3;
        if (this.f9713b < 0) {
            return super.getBaseline();
        }
        int childCount = getChildCount();
        int i4 = this.f9713b;
        if (childCount <= i4) {
            throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout set to an index that is out of bounds.");
        }
        View childAt = getChildAt(i4);
        int baseline = childAt.getBaseline();
        if (baseline == -1) {
            if (this.f9713b == 0) {
                return -1;
            }
            throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout points to a View that doesn't know how to get its baseline.");
        }
        int i5 = this.f9714c;
        if (this.f9715d == 1 && (i3 = this.f9716e & 112) != 48) {
            if (i3 == 16) {
                i5 += ((((getBottom() - getTop()) - getPaddingTop()) - getPaddingBottom()) - this.f) / 2;
            } else if (i3 == 80) {
                i5 = ((getBottom() - getTop()) - getPaddingBottom()) - this.f;
            }
        }
        return i5 + ((ViewGroup.MarginLayoutParams) ((E) childAt.getLayoutParams())).topMargin + baseline;
    }

    public int getBaselineAlignedChildIndex() {
        return this.f9713b;
    }

    public Drawable getDividerDrawable() {
        return this.f9721k;
    }

    public int getDividerPadding() {
        return this.o;
    }

    public int getDividerWidth() {
        return this.f9722l;
    }

    public int getGravity() {
        return this.f9716e;
    }

    public int getOrientation() {
        return this.f9715d;
    }

    public int getShowDividers() {
        return this.f9724n;
    }

    public int getVirtualChildCount() {
        return getChildCount();
    }

    public float getWeightSum() {
        return this.f9717g;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        int right;
        int left;
        int i3;
        if (this.f9721k == null) {
            return;
        }
        int i4 = 0;
        if (this.f9715d == 1) {
            int virtualChildCount = getVirtualChildCount();
            while (i4 < virtualChildCount) {
                View childAt = getChildAt(i4);
                if (childAt != null && childAt.getVisibility() != 8 && g(i4)) {
                    b(canvas, (childAt.getTop() - ((ViewGroup.MarginLayoutParams) ((E) childAt.getLayoutParams())).topMargin) - this.f9723m);
                }
                i4++;
            }
            if (g(virtualChildCount)) {
                View childAt2 = getChildAt(virtualChildCount - 1);
                b(canvas, childAt2 == null ? (getHeight() - getPaddingBottom()) - this.f9723m : childAt2.getBottom() + ((ViewGroup.MarginLayoutParams) ((E) childAt2.getLayoutParams())).bottomMargin);
                return;
            }
            return;
        }
        int virtualChildCount2 = getVirtualChildCount();
        boolean a3 = w0.a(this);
        while (i4 < virtualChildCount2) {
            View childAt3 = getChildAt(i4);
            if (childAt3 != null && childAt3.getVisibility() != 8 && g(i4)) {
                E e3 = (E) childAt3.getLayoutParams();
                c(canvas, a3 ? childAt3.getRight() + ((ViewGroup.MarginLayoutParams) e3).rightMargin : (childAt3.getLeft() - ((ViewGroup.MarginLayoutParams) e3).leftMargin) - this.f9722l);
            }
            i4++;
        }
        if (g(virtualChildCount2)) {
            View childAt4 = getChildAt(virtualChildCount2 - 1);
            if (childAt4 != null) {
                E e4 = (E) childAt4.getLayoutParams();
                if (a3) {
                    left = childAt4.getLeft() - ((ViewGroup.MarginLayoutParams) e4).leftMargin;
                    i3 = this.f9722l;
                    right = left - i3;
                } else {
                    right = childAt4.getRight() + ((ViewGroup.MarginLayoutParams) e4).rightMargin;
                }
            } else if (a3) {
                right = getPaddingLeft();
            } else {
                left = getWidth() - getPaddingRight();
                i3 = this.f9722l;
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

    /* JADX WARN: Removed duplicated region for block: B:25:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x01a0  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x018d  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onLayout(boolean z, int i3, int i4, int i5, int i6) {
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        char c3;
        int i16;
        int i17;
        int i18;
        int i19 = 8;
        char c4 = 2;
        if (this.f9715d == 1) {
            int paddingLeft = getPaddingLeft();
            int i20 = i5 - i3;
            int paddingRight = i20 - getPaddingRight();
            int paddingRight2 = (i20 - paddingLeft) - getPaddingRight();
            int virtualChildCount = getVirtualChildCount();
            int i21 = this.f9716e;
            int i22 = i21 & 112;
            int i23 = 8388615 & i21;
            int paddingTop = i22 != 16 ? i22 != 80 ? getPaddingTop() : ((getPaddingTop() + i6) - i4) - this.f : getPaddingTop() + (((i6 - i4) - this.f) / 2);
            int i24 = 0;
            while (i24 < virtualChildCount) {
                View childAt = getChildAt(i24);
                if (childAt == null || childAt.getVisibility() == i19) {
                    c3 = c4;
                } else {
                    int measuredWidth = childAt.getMeasuredWidth();
                    int measuredHeight = childAt.getMeasuredHeight();
                    E e3 = (E) childAt.getLayoutParams();
                    c3 = c4;
                    int i25 = e3.f9711b;
                    if (i25 < 0) {
                        i25 = i23;
                    }
                    Field field = E.A.f243a;
                    int absoluteGravity = Gravity.getAbsoluteGravity(i25, getLayoutDirection()) & 7;
                    if (absoluteGravity == 1) {
                        i16 = ((paddingRight2 - measuredWidth) / 2) + paddingLeft + ((ViewGroup.MarginLayoutParams) e3).leftMargin;
                        i17 = ((ViewGroup.MarginLayoutParams) e3).rightMargin;
                    } else if (absoluteGravity != 5) {
                        i18 = ((ViewGroup.MarginLayoutParams) e3).leftMargin + paddingLeft;
                        if (g(i24)) {
                            paddingTop += this.f9723m;
                        }
                        int i26 = paddingTop + ((ViewGroup.MarginLayoutParams) e3).topMargin;
                        childAt.layout(i18, i26, measuredWidth + i18, i26 + measuredHeight);
                        paddingTop = measuredHeight + ((ViewGroup.MarginLayoutParams) e3).bottomMargin + i26;
                    } else {
                        i16 = paddingRight - measuredWidth;
                        i17 = ((ViewGroup.MarginLayoutParams) e3).rightMargin;
                    }
                    i18 = i16 - i17;
                    if (g(i24)) {
                    }
                    int i262 = paddingTop + ((ViewGroup.MarginLayoutParams) e3).topMargin;
                    childAt.layout(i18, i262, measuredWidth + i18, i262 + measuredHeight);
                    paddingTop = measuredHeight + ((ViewGroup.MarginLayoutParams) e3).bottomMargin + i262;
                }
                i24++;
                c4 = c3;
                i19 = 8;
            }
            return;
        }
        boolean a3 = w0.a(this);
        int paddingTop2 = getPaddingTop();
        int i27 = i6 - i4;
        int paddingBottom = i27 - getPaddingBottom();
        int paddingBottom2 = (i27 - paddingTop2) - getPaddingBottom();
        int virtualChildCount2 = getVirtualChildCount();
        int i28 = this.f9716e;
        int i29 = 8388615 & i28;
        int i30 = i28 & 112;
        boolean z2 = this.f9712a;
        int[] iArr = this.f9719i;
        int[] iArr2 = this.f9720j;
        Field field2 = E.A.f243a;
        int absoluteGravity2 = Gravity.getAbsoluteGravity(i29, getLayoutDirection());
        int paddingLeft2 = absoluteGravity2 != 1 ? absoluteGravity2 != 5 ? getPaddingLeft() : ((getPaddingLeft() + i5) - i3) - this.f : getPaddingLeft() + (((i5 - i3) - this.f) / 2);
        if (a3) {
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
                    E e4 = (E) childAt2.getLayoutParams();
                    int i33 = paddingLeft2;
                    if (z2) {
                        i10 = paddingTop2;
                        if (((ViewGroup.MarginLayoutParams) e4).height != -1) {
                            i11 = childAt2.getBaseline();
                            i12 = e4.f9711b;
                            if (i12 < 0) {
                                i12 = i30;
                            }
                            i13 = i12 & 112;
                            if (i13 == 16) {
                                if (i13 == 48) {
                                    i14 = i10 + ((ViewGroup.MarginLayoutParams) e4).topMargin;
                                    if (i11 != -1) {
                                        i14 = (iArr[1] - i11) + i14;
                                    }
                                } else if (i13 != 80) {
                                    i14 = i10;
                                } else {
                                    i14 = (paddingBottom - measuredHeight2) - ((ViewGroup.MarginLayoutParams) e4).bottomMargin;
                                    if (i11 != -1) {
                                        i15 = iArr2[2] - (childAt2.getMeasuredHeight() - i11);
                                    }
                                }
                                int i34 = (g(i32) ? i33 + this.f9722l : i33) + ((ViewGroup.MarginLayoutParams) e4).leftMargin;
                                childAt2.layout(i34, i14, i34 + measuredWidth2, i14 + measuredHeight2);
                                paddingLeft2 = measuredWidth2 + ((ViewGroup.MarginLayoutParams) e4).rightMargin + i34;
                                i31++;
                                i8 = i9;
                                paddingTop2 = i10;
                            } else {
                                i14 = ((paddingBottom2 - measuredHeight2) / 2) + i10 + ((ViewGroup.MarginLayoutParams) e4).topMargin;
                                i15 = ((ViewGroup.MarginLayoutParams) e4).bottomMargin;
                            }
                            i14 -= i15;
                            int i342 = (g(i32) ? i33 + this.f9722l : i33) + ((ViewGroup.MarginLayoutParams) e4).leftMargin;
                            childAt2.layout(i342, i14, i342 + measuredWidth2, i14 + measuredHeight2);
                            paddingLeft2 = measuredWidth2 + ((ViewGroup.MarginLayoutParams) e4).rightMargin + i342;
                            i31++;
                            i8 = i9;
                            paddingTop2 = i10;
                        }
                    } else {
                        i10 = paddingTop2;
                    }
                    i11 = -1;
                    i12 = e4.f9711b;
                    if (i12 < 0) {
                    }
                    i13 = i12 & 112;
                    if (i13 == 16) {
                    }
                    i14 -= i15;
                    int i3422 = (g(i32) ? i33 + this.f9722l : i33) + ((ViewGroup.MarginLayoutParams) e4).leftMargin;
                    childAt2.layout(i3422, i14, i3422 + measuredWidth2, i14 + measuredHeight2);
                    paddingLeft2 = measuredWidth2 + ((ViewGroup.MarginLayoutParams) e4).rightMargin + i3422;
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

    /* JADX WARN: Removed duplicated region for block: B:222:0x04f6  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x053b  */
    /* JADX WARN: Removed duplicated region for block: B:240:0x0545  */
    /* JADX WARN: Removed duplicated region for block: B:244:0x0524  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onMeasure(int i3, int i4) {
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        boolean z;
        int baseline;
        int i11;
        int i12;
        int[] iArr;
        int i13;
        int i14;
        boolean z2;
        boolean z3;
        E e3;
        int i15;
        int[] iArr2;
        int i16;
        View view;
        int i17;
        boolean z4;
        boolean z5;
        int max;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        int i24;
        int i25;
        boolean z6;
        int i26;
        int i27;
        int i28;
        View view2;
        boolean z7;
        F f = this;
        int i29 = -2;
        int i30 = 1073741824;
        int i31 = 8;
        int i32 = 0;
        if (f.f9715d == 1) {
            f.f = 0;
            int virtualChildCount = f.getVirtualChildCount();
            int mode = View.MeasureSpec.getMode(i3);
            int mode2 = View.MeasureSpec.getMode(i4);
            int i33 = f.f9713b;
            boolean z8 = f.f9718h;
            int i34 = 0;
            int i35 = 0;
            int i36 = 0;
            boolean z9 = false;
            int i37 = 0;
            boolean z10 = false;
            boolean z11 = true;
            float f3 = 0.0f;
            int i38 = 0;
            while (i34 < virtualChildCount) {
                int i39 = mode;
                View childAt = f.getChildAt(i34);
                if (childAt == null) {
                    f.f = f.f;
                } else if (childAt.getVisibility() != i31) {
                    if (f.g(i34)) {
                        f.f += f.f9723m;
                    }
                    E e4 = (E) childAt.getLayoutParams();
                    float f4 = e4.f9710a;
                    f3 += f4;
                    if (mode2 == i30 && ((ViewGroup.MarginLayoutParams) e4).height == 0 && f4 > 0.0f) {
                        int i40 = f.f;
                        f.f = Math.max(i40, ((ViewGroup.MarginLayoutParams) e4).topMargin + i40 + ((ViewGroup.MarginLayoutParams) e4).bottomMargin);
                        view2 = childAt;
                        i25 = mode2;
                        i26 = i33;
                        z6 = z8;
                        i27 = i34;
                        z9 = true;
                        i28 = i39;
                    } else {
                        if (((ViewGroup.MarginLayoutParams) e4).height != 0 || f4 <= 0.0f) {
                            i22 = Integer.MIN_VALUE;
                        } else {
                            ((ViewGroup.MarginLayoutParams) e4).height = i29;
                            i22 = 0;
                        }
                        if (f3 == 0.0f) {
                            i23 = i34;
                            i24 = f.f;
                        } else {
                            i23 = i34;
                            i24 = 0;
                        }
                        i25 = mode2;
                        z6 = z8;
                        i26 = i33;
                        i27 = i23;
                        i28 = i39;
                        f.measureChildWithMargins(childAt, i3, 0, i4, i24);
                        if (i22 != Integer.MIN_VALUE) {
                            ((ViewGroup.MarginLayoutParams) e4).height = i22;
                        }
                        int measuredHeight = childAt.getMeasuredHeight();
                        int i41 = f.f;
                        view2 = childAt;
                        f.f = Math.max(i41, i41 + measuredHeight + ((ViewGroup.MarginLayoutParams) e4).topMargin + ((ViewGroup.MarginLayoutParams) e4).bottomMargin);
                        if (z6) {
                            i38 = Math.max(measuredHeight, i38);
                        }
                    }
                    if (i26 >= 0 && i26 == i27 + 1) {
                        f.f9714c = f.f;
                    }
                    float f5 = e4.f9710a;
                    if (i27 < i26 && f5 > 0.0f) {
                        throw new RuntimeException("A child of LinearLayout with index less than mBaselineAlignedChildIndex has weight > 0, which won't work.  Either remove the weight, or don't set mBaselineAlignedChildIndex.");
                    }
                    if (i28 == 1073741824 || ((ViewGroup.MarginLayoutParams) e4).width != -1) {
                        z7 = false;
                    } else {
                        z7 = true;
                        z10 = true;
                    }
                    int i42 = ((ViewGroup.MarginLayoutParams) e4).leftMargin + ((ViewGroup.MarginLayoutParams) e4).rightMargin;
                    int measuredWidth = view2.getMeasuredWidth() + i42;
                    i32 = Math.max(i32, measuredWidth);
                    int measuredState = view2.getMeasuredState();
                    boolean z12 = z7;
                    int combineMeasuredStates = View.combineMeasuredStates(i37, measuredState);
                    boolean z13 = z11 && ((ViewGroup.MarginLayoutParams) e4).width == -1;
                    if (f5 > 0.0f) {
                        if (!z12) {
                            i42 = measuredWidth;
                        }
                        i36 = Math.max(i36, i42);
                    } else {
                        if (!z12) {
                            i42 = measuredWidth;
                        }
                        i35 = Math.max(i35, i42);
                    }
                    i37 = combineMeasuredStates;
                    z11 = z13;
                    i34 = i27 + 1;
                    i33 = i26;
                    mode = i28;
                    z8 = z6;
                    mode2 = i25;
                    i29 = -2;
                    i30 = 1073741824;
                    i31 = 8;
                }
                i25 = mode2;
                i26 = i33;
                z6 = z8;
                i27 = i34;
                i28 = i39;
                i34 = i27 + 1;
                i33 = i26;
                mode = i28;
                z8 = z6;
                mode2 = i25;
                i29 = -2;
                i30 = 1073741824;
                i31 = 8;
            }
            int i43 = mode;
            int i44 = mode2;
            boolean z14 = z8;
            int i45 = i37;
            int i46 = i4;
            if (f.f > 0 && f.g(virtualChildCount)) {
                f.f += f.f9723m;
            }
            if (z14 && (i44 == Integer.MIN_VALUE || i44 == 0)) {
                f.f = 0;
                for (int i47 = 0; i47 < virtualChildCount; i47++) {
                    View childAt2 = f.getChildAt(i47);
                    if (childAt2 == null) {
                        f.f = f.f;
                    } else if (childAt2.getVisibility() != 8) {
                        E e5 = (E) childAt2.getLayoutParams();
                        int i48 = f.f;
                        f.f = Math.max(i48, i48 + i38 + ((ViewGroup.MarginLayoutParams) e5).topMargin + ((ViewGroup.MarginLayoutParams) e5).bottomMargin);
                    }
                }
            }
            int paddingBottom = f.getPaddingBottom() + f.getPaddingTop() + f.f;
            f.f = paddingBottom;
            int resolveSizeAndState = View.resolveSizeAndState(Math.max(paddingBottom, f.getSuggestedMinimumHeight()), i46, 0);
            int i49 = (resolveSizeAndState & 16777215) - f.f;
            if (z9 || (i49 != 0 && f3 > 0.0f)) {
                float f6 = f.f9717g;
                if (f6 > 0.0f) {
                    f3 = f6;
                }
                f.f = 0;
                int i50 = i45;
                int i51 = 0;
                while (i51 < virtualChildCount) {
                    View childAt3 = f.getChildAt(i51);
                    if (childAt3.getVisibility() == 8) {
                        i19 = i51;
                    } else {
                        E e6 = (E) childAt3.getLayoutParams();
                        float f7 = e6.f9710a;
                        if (f7 > 0.0f) {
                            int i52 = (int) ((i49 * f7) / f3);
                            f3 -= f7;
                            i49 -= i52;
                            i19 = i51;
                            int childMeasureSpec = ViewGroup.getChildMeasureSpec(i3, f.getPaddingRight() + f.getPaddingLeft() + ((ViewGroup.MarginLayoutParams) e6).leftMargin + ((ViewGroup.MarginLayoutParams) e6).rightMargin, ((ViewGroup.MarginLayoutParams) e6).width);
                            if (((ViewGroup.MarginLayoutParams) e6).height == 0) {
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
                        int i53 = ((ViewGroup.MarginLayoutParams) e6).leftMargin + ((ViewGroup.MarginLayoutParams) e6).rightMargin;
                        int measuredWidth2 = childAt3.getMeasuredWidth() + i53;
                        i32 = Math.max(i32, measuredWidth2);
                        if (i43 != 1073741824) {
                            i20 = -1;
                            if (((ViewGroup.MarginLayoutParams) e6).width == -1) {
                                measuredWidth2 = i53;
                            }
                        } else {
                            i20 = -1;
                        }
                        i35 = Math.max(i35, measuredWidth2);
                        boolean z15 = z11 && ((ViewGroup.MarginLayoutParams) e6).width == i20;
                        int i54 = f.f;
                        f.f = Math.max(i54, childAt3.getMeasuredHeight() + i54 + ((ViewGroup.MarginLayoutParams) e6).topMargin + ((ViewGroup.MarginLayoutParams) e6).bottomMargin);
                        z11 = z15;
                    }
                    i51 = i19 + 1;
                }
                f.f = f.getPaddingBottom() + f.getPaddingTop() + f.f;
                i45 = i50;
            } else {
                i35 = Math.max(i35, i36);
                if (z14 && i44 != 1073741824) {
                    for (int i55 = 0; i55 < virtualChildCount; i55++) {
                        View childAt4 = f.getChildAt(i55);
                        if (childAt4 != null && childAt4.getVisibility() != 8 && ((E) childAt4.getLayoutParams()).f9710a > 0.0f) {
                            childAt4.measure(View.MeasureSpec.makeMeasureSpec(childAt4.getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(i38, 1073741824));
                        }
                    }
                }
            }
            if (z11 || i43 == 1073741824) {
                i35 = i32;
            }
            f.setMeasuredDimension(View.resolveSizeAndState(Math.max(f.getPaddingRight() + f.getPaddingLeft() + i35, f.getSuggestedMinimumWidth()), i3, i45), resolveSizeAndState);
            if (z10) {
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(f.getMeasuredWidth(), 1073741824);
                int i56 = 0;
                while (i56 < virtualChildCount) {
                    View childAt5 = f.getChildAt(i56);
                    if (childAt5.getVisibility() != 8) {
                        E e7 = (E) childAt5.getLayoutParams();
                        if (((ViewGroup.MarginLayoutParams) e7).width == -1) {
                            int i57 = ((ViewGroup.MarginLayoutParams) e7).height;
                            ((ViewGroup.MarginLayoutParams) e7).height = childAt5.getMeasuredHeight();
                            f.measureChildWithMargins(childAt5, makeMeasureSpec, 0, i46, 0);
                            ((ViewGroup.MarginLayoutParams) e7).height = i57;
                        }
                    }
                    i56++;
                    i46 = i4;
                }
                return;
            }
            return;
        }
        int i58 = i3;
        f.f = 0;
        int virtualChildCount2 = f.getVirtualChildCount();
        int mode3 = View.MeasureSpec.getMode(i58);
        int mode4 = View.MeasureSpec.getMode(i4);
        if (f.f9719i == null || f.f9720j == null) {
            f.f9719i = new int[4];
            f.f9720j = new int[4];
        }
        int[] iArr3 = f.f9719i;
        int[] iArr4 = f.f9720j;
        iArr3[3] = -1;
        char c3 = 2;
        iArr3[2] = -1;
        iArr3[1] = -1;
        iArr3[0] = -1;
        iArr4[3] = -1;
        iArr4[2] = -1;
        iArr4[1] = -1;
        iArr4[0] = -1;
        boolean z16 = f.f9712a;
        boolean z17 = f.f9718h;
        boolean z18 = mode3 == 1073741824;
        float f8 = 0.0f;
        boolean z19 = true;
        int i59 = 0;
        int i60 = 0;
        int i61 = 0;
        int i62 = 0;
        int i63 = 0;
        int i64 = 0;
        boolean z20 = false;
        boolean z21 = false;
        while (i59 < virtualChildCount2) {
            char c4 = c3;
            View childAt6 = f.getChildAt(i59);
            if (childAt6 == null) {
                f.f = f.f;
                i14 = i59;
                i18 = i61;
                iArr2 = iArr3;
                iArr = iArr4;
                z2 = z16;
                z3 = z17;
            } else {
                int i65 = i60;
                if (childAt6.getVisibility() == 8) {
                    i58 = i3;
                    i14 = i59;
                    i18 = i61;
                    iArr = iArr4;
                    z2 = z16;
                    z3 = z17;
                    i60 = i65;
                    iArr2 = iArr3;
                } else {
                    if (f.g(i59)) {
                        f.f += f.f9722l;
                    }
                    E e8 = (E) childAt6.getLayoutParams();
                    float f9 = e8.f9710a;
                    f8 += f9;
                    int i66 = i59;
                    if (mode3 == 1073741824 && ((ViewGroup.MarginLayoutParams) e8).width == 0 && f9 > 0.0f) {
                        if (z18) {
                            f.f = ((ViewGroup.MarginLayoutParams) e8).leftMargin + ((ViewGroup.MarginLayoutParams) e8).rightMargin + f.f;
                        } else {
                            int i67 = f.f;
                            f.f = Math.max(i67, ((ViewGroup.MarginLayoutParams) e8).leftMargin + i67 + ((ViewGroup.MarginLayoutParams) e8).rightMargin);
                        }
                        if (z16) {
                            int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 0);
                            childAt6.measure(makeMeasureSpec2, makeMeasureSpec2);
                            view = childAt6;
                            z2 = z16;
                            z3 = z17;
                            i15 = i65;
                            i14 = i66;
                            e3 = e8;
                            iArr2 = iArr3;
                            iArr = iArr4;
                            i58 = i3;
                            i16 = i61;
                            i13 = i62;
                        } else {
                            view = childAt6;
                            z2 = z16;
                            z3 = z17;
                            z21 = true;
                            i15 = i65;
                            i14 = i66;
                            i17 = 1073741824;
                            e3 = e8;
                            iArr2 = iArr3;
                            iArr = iArr4;
                            i58 = i3;
                            i16 = i61;
                            i13 = i62;
                            if (mode4 == i17 && ((ViewGroup.MarginLayoutParams) e3).height == -1) {
                                z4 = true;
                                z20 = true;
                            } else {
                                z4 = false;
                            }
                            int i68 = ((ViewGroup.MarginLayoutParams) e3).topMargin + ((ViewGroup.MarginLayoutParams) e3).bottomMargin;
                            int measuredHeight3 = view.getMeasuredHeight() + i68;
                            i64 = View.combineMeasuredStates(i64, view.getMeasuredState());
                            if (z2) {
                                z5 = z4;
                            } else {
                                int baseline2 = view.getBaseline();
                                z5 = z4;
                                if (baseline2 != -1) {
                                    int i69 = e3.f9711b;
                                    if (i69 < 0) {
                                        i69 = f.f9716e;
                                    }
                                    int i70 = (((i69 & 112) >> 4) & (-2)) >> 1;
                                    iArr2[i70] = Math.max(iArr2[i70], baseline2);
                                    iArr[i70] = Math.max(iArr[i70], measuredHeight3 - baseline2);
                                }
                            }
                            int max2 = Math.max(i15, measuredHeight3);
                            boolean z22 = !z19 && ((ViewGroup.MarginLayoutParams) e3).height == -1;
                            if (e3.f9710a <= 0.0f) {
                                if (!z5) {
                                    i68 = measuredHeight3;
                                }
                                i62 = Math.max(i13, i68);
                                max = i16;
                            } else {
                                if (!z5) {
                                    i68 = measuredHeight3;
                                }
                                max = Math.max(i16, i68);
                                i62 = i13;
                            }
                            int i71 = max;
                            i60 = max2;
                            i18 = i71;
                            z19 = z22;
                        }
                    } else {
                        if (((ViewGroup.MarginLayoutParams) e8).width != 0 || f9 <= 0.0f) {
                            i12 = Integer.MIN_VALUE;
                        } else {
                            ((ViewGroup.MarginLayoutParams) e8).width = -2;
                            i12 = 0;
                        }
                        iArr = iArr4;
                        i13 = i62;
                        i14 = i66;
                        z2 = z16;
                        z3 = z17;
                        int i72 = i12;
                        e3 = e8;
                        i15 = i65;
                        i58 = i3;
                        iArr2 = iArr3;
                        i16 = i61;
                        f.measureChildWithMargins(childAt6, i58, f8 == 0.0f ? f.f : 0, i4, 0);
                        if (i72 != Integer.MIN_VALUE) {
                            ((ViewGroup.MarginLayoutParams) e3).width = i72;
                        }
                        int measuredWidth3 = childAt6.getMeasuredWidth();
                        if (z18) {
                            view = childAt6;
                            f.f = ((ViewGroup.MarginLayoutParams) e3).leftMargin + measuredWidth3 + ((ViewGroup.MarginLayoutParams) e3).rightMargin + f.f;
                        } else {
                            view = childAt6;
                            int i73 = f.f;
                            f.f = Math.max(i73, i73 + measuredWidth3 + ((ViewGroup.MarginLayoutParams) e3).leftMargin + ((ViewGroup.MarginLayoutParams) e3).rightMargin);
                        }
                        if (z3) {
                            i63 = Math.max(measuredWidth3, i63);
                        }
                    }
                    i17 = 1073741824;
                    if (mode4 == i17) {
                    }
                    z4 = false;
                    int i682 = ((ViewGroup.MarginLayoutParams) e3).topMargin + ((ViewGroup.MarginLayoutParams) e3).bottomMargin;
                    int measuredHeight32 = view.getMeasuredHeight() + i682;
                    i64 = View.combineMeasuredStates(i64, view.getMeasuredState());
                    if (z2) {
                    }
                    int max22 = Math.max(i15, measuredHeight32);
                    if (z19) {
                    }
                    if (e3.f9710a <= 0.0f) {
                    }
                    int i712 = max;
                    i60 = max22;
                    i18 = i712;
                    z19 = z22;
                }
            }
            i61 = i18;
            i59 = i14 + 1;
            c3 = c4;
            iArr3 = iArr2;
            iArr4 = iArr;
            z16 = z2;
            z17 = z3;
        }
        int[] iArr5 = iArr3;
        int[] iArr6 = iArr4;
        char c5 = c3;
        boolean z23 = z16;
        boolean z24 = z17;
        int i74 = i60;
        int i75 = i61;
        int i76 = i62;
        if (f.f > 0 && f.g(virtualChildCount2)) {
            f.f += f.f9722l;
        }
        int i77 = iArr5[1];
        int max3 = (i77 == -1 && iArr5[0] == -1 && iArr5[c5] == -1 && iArr5[3] == -1) ? i74 : Math.max(i74, Math.max(iArr6[3], Math.max(iArr6[0], Math.max(iArr6[1], iArr6[c5]))) + Math.max(iArr5[3], Math.max(iArr5[0], Math.max(i77, iArr5[c5]))));
        if (z24 && (mode3 == Integer.MIN_VALUE || mode3 == 0)) {
            f.f = 0;
            for (int i78 = 0; i78 < virtualChildCount2; i78++) {
                View childAt7 = f.getChildAt(i78);
                if (childAt7 == null) {
                    f.f = f.f;
                } else if (childAt7.getVisibility() != 8) {
                    E e9 = (E) childAt7.getLayoutParams();
                    if (z18) {
                        f.f = ((ViewGroup.MarginLayoutParams) e9).leftMargin + i63 + ((ViewGroup.MarginLayoutParams) e9).rightMargin + f.f;
                    } else {
                        int i79 = f.f;
                        f.f = Math.max(i79, i79 + i63 + ((ViewGroup.MarginLayoutParams) e9).leftMargin + ((ViewGroup.MarginLayoutParams) e9).rightMargin);
                    }
                }
            }
        }
        int paddingRight = f.getPaddingRight() + f.getPaddingLeft() + f.f;
        f.f = paddingRight;
        int resolveSizeAndState2 = View.resolveSizeAndState(Math.max(paddingRight, f.getSuggestedMinimumWidth()), i58, 0);
        int i80 = (resolveSizeAndState2 & 16777215) - f.f;
        if (z21 || (i80 != 0 && f8 > 0.0f)) {
            float f10 = f.f9717g;
            if (f10 > 0.0f) {
                f8 = f10;
            }
            iArr5[3] = -1;
            iArr5[c5] = -1;
            iArr5[1] = -1;
            iArr5[0] = -1;
            iArr6[3] = -1;
            iArr6[c5] = -1;
            iArr6[1] = -1;
            iArr6[0] = -1;
            f.f = 0;
            max3 = -1;
            int i81 = 0;
            while (i81 < virtualChildCount2) {
                View childAt8 = f.getChildAt(i81);
                if (childAt8 == null || childAt8.getVisibility() == 8) {
                    i9 = resolveSizeAndState2;
                } else {
                    E e10 = (E) childAt8.getLayoutParams();
                    float f11 = e10.f9710a;
                    if (f11 > 0.0f) {
                        int i82 = (int) ((i80 * f11) / f8);
                        f8 -= f11;
                        i80 -= i82;
                        i9 = resolveSizeAndState2;
                        int childMeasureSpec2 = ViewGroup.getChildMeasureSpec(i4, f.getPaddingBottom() + f.getPaddingTop() + ((ViewGroup.MarginLayoutParams) e10).topMargin + ((ViewGroup.MarginLayoutParams) e10).bottomMargin, ((ViewGroup.MarginLayoutParams) e10).height);
                        if (((ViewGroup.MarginLayoutParams) e10).width == 0) {
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
                    if (z18) {
                        f.f = childAt8.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) e10).leftMargin + ((ViewGroup.MarginLayoutParams) e10).rightMargin + f.f;
                    } else {
                        int i83 = f.f;
                        f.f = Math.max(i83, childAt8.getMeasuredWidth() + i83 + ((ViewGroup.MarginLayoutParams) e10).leftMargin + ((ViewGroup.MarginLayoutParams) e10).rightMargin);
                    }
                    boolean z25 = mode4 != 1073741824 && ((ViewGroup.MarginLayoutParams) e10).height == -1;
                    int i84 = ((ViewGroup.MarginLayoutParams) e10).topMargin + ((ViewGroup.MarginLayoutParams) e10).bottomMargin;
                    int measuredHeight4 = childAt8.getMeasuredHeight() + i84;
                    max3 = Math.max(max3, measuredHeight4);
                    if (!z25) {
                        i84 = measuredHeight4;
                    }
                    int max4 = Math.max(i75, i84);
                    if (z19) {
                        i10 = -1;
                        if (((ViewGroup.MarginLayoutParams) e10).height == -1) {
                            z = true;
                            if (!z23 && (baseline = childAt8.getBaseline()) != i10) {
                                int i85 = e10.f9711b;
                                if (i85 < 0) {
                                    i85 = f.f9716e;
                                }
                                int i86 = (((i85 & 112) >> 4) & (-2)) >> 1;
                                iArr5[i86] = Math.max(iArr5[i86], baseline);
                                iArr6[i86] = Math.max(iArr6[i86], measuredHeight4 - baseline);
                            }
                            z19 = z;
                            i75 = max4;
                        }
                    } else {
                        i10 = -1;
                    }
                    z = false;
                    if (!z23) {
                    }
                    z19 = z;
                    i75 = max4;
                }
                i81++;
                resolveSizeAndState2 = i9;
            }
            i5 = resolveSizeAndState2;
            i6 = -16777216;
            f.f = f.getPaddingRight() + f.getPaddingLeft() + f.f;
            int i87 = iArr5[1];
            if (i87 == -1 && iArr5[0] == -1 && iArr5[c5] == -1 && iArr5[3] == -1) {
                i7 = 0;
            } else {
                i7 = 0;
                max3 = Math.max(max3, Math.max(iArr6[3], Math.max(iArr6[0], Math.max(iArr6[1], iArr6[c5]))) + Math.max(iArr5[3], Math.max(iArr5[0], Math.max(i87, iArr5[c5]))));
            }
            i8 = i75;
        } else {
            i8 = Math.max(i75, i76);
            if (z24 && mode3 != 1073741824) {
                for (int i88 = 0; i88 < virtualChildCount2; i88++) {
                    View childAt9 = f.getChildAt(i88);
                    if (childAt9 != null && childAt9.getVisibility() != 8 && ((E) childAt9.getLayoutParams()).f9710a > 0.0f) {
                        childAt9.measure(View.MeasureSpec.makeMeasureSpec(i63, 1073741824), View.MeasureSpec.makeMeasureSpec(childAt9.getMeasuredHeight(), 1073741824));
                    }
                }
            }
            i5 = resolveSizeAndState2;
            i6 = -16777216;
            i7 = 0;
        }
        if (!z19 && mode4 != 1073741824) {
            max3 = i8;
        }
        f.setMeasuredDimension(i5 | (i64 & i6), View.resolveSizeAndState(Math.max(f.getPaddingBottom() + f.getPaddingTop() + max3, f.getSuggestedMinimumHeight()), i4, i64 << 16));
        if (z20) {
            int makeMeasureSpec3 = View.MeasureSpec.makeMeasureSpec(f.getMeasuredHeight(), 1073741824);
            int i89 = i7;
            while (i89 < virtualChildCount2) {
                View childAt10 = f.getChildAt(i89);
                if (childAt10.getVisibility() != 8) {
                    E e11 = (E) childAt10.getLayoutParams();
                    if (((ViewGroup.MarginLayoutParams) e11).height == -1) {
                        int i90 = ((ViewGroup.MarginLayoutParams) e11).width;
                        ((ViewGroup.MarginLayoutParams) e11).width = childAt10.getMeasuredWidth();
                        f.measureChildWithMargins(childAt10, i58, 0, makeMeasureSpec3, 0);
                        ((ViewGroup.MarginLayoutParams) e11).width = i90;
                    }
                }
                i89++;
                f = this;
                i58 = i3;
            }
        }
    }

    public void setBaselineAligned(boolean z) {
        this.f9712a = z;
    }

    public void setBaselineAlignedChildIndex(int i3) {
        if (i3 >= 0 && i3 < getChildCount()) {
            this.f9713b = i3;
            return;
        }
        throw new IllegalArgumentException("base aligned child index out of range (0, " + getChildCount() + ")");
    }

    public void setDividerDrawable(Drawable drawable) {
        if (drawable == this.f9721k) {
            return;
        }
        this.f9721k = drawable;
        if (drawable != null) {
            this.f9722l = drawable.getIntrinsicWidth();
            this.f9723m = drawable.getIntrinsicHeight();
        } else {
            this.f9722l = 0;
            this.f9723m = 0;
        }
        setWillNotDraw(drawable == null);
        requestLayout();
    }

    public void setDividerPadding(int i3) {
        this.o = i3;
    }

    public void setGravity(int i3) {
        if (this.f9716e != i3) {
            if ((8388615 & i3) == 0) {
                i3 |= 8388611;
            }
            if ((i3 & 112) == 0) {
                i3 |= 48;
            }
            this.f9716e = i3;
            requestLayout();
        }
    }

    public void setHorizontalGravity(int i3) {
        int i4 = i3 & 8388615;
        int i5 = this.f9716e;
        if ((8388615 & i5) != i4) {
            this.f9716e = i4 | ((-8388616) & i5);
            requestLayout();
        }
    }

    public void setMeasureWithLargestChildEnabled(boolean z) {
        this.f9718h = z;
    }

    public void setOrientation(int i3) {
        if (this.f9715d != i3) {
            this.f9715d = i3;
            requestLayout();
        }
    }

    public void setShowDividers(int i3) {
        if (i3 != this.f9724n) {
            requestLayout();
        }
        this.f9724n = i3;
    }

    public void setVerticalGravity(int i3) {
        int i4 = i3 & 112;
        int i5 = this.f9716e;
        if ((i5 & 112) != i4) {
            this.f9716e = i4 | (i5 & (-113));
            requestLayout();
        }
    }

    public void setWeightSum(float f) {
        this.f9717g = Math.max(0.0f, f);
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }
}
