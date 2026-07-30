package h;

import L.C0026b;
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
import c.AbstractC0098a;
import java.lang.reflect.Field;

/* renamed from: h.E, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0145E extends ViewGroup {

    /* renamed from: e, reason: collision with root package name */
    public boolean f2082e;

    /* renamed from: f, reason: collision with root package name */
    public int f2083f;

    /* renamed from: g, reason: collision with root package name */
    public int f2084g;

    /* renamed from: h, reason: collision with root package name */
    public int f2085h;

    /* renamed from: i, reason: collision with root package name */
    public int f2086i;

    /* renamed from: j, reason: collision with root package name */
    public int f2087j;

    /* renamed from: k, reason: collision with root package name */
    public float f2088k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f2089l;

    /* renamed from: m, reason: collision with root package name */
    public int[] f2090m;

    /* renamed from: n, reason: collision with root package name */
    public int[] f2091n;

    /* renamed from: o, reason: collision with root package name */
    public Drawable f2092o;

    /* renamed from: p, reason: collision with root package name */
    public int f2093p;

    /* renamed from: q, reason: collision with root package name */
    public int f2094q;
    public int r;

    /* renamed from: s, reason: collision with root package name */
    public int f2095s;

    public AbstractC0145E(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.f2082e = true;
        this.f2083f = -1;
        this.f2084g = 0;
        this.f2086i = 8388659;
        C0026b E2 = C0026b.E(context, attributeSet, AbstractC0098a.f1648i, i2);
        TypedArray typedArray = (TypedArray) E2.f520f;
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
        this.f2088k = typedArray.getFloat(4, -1.0f);
        this.f2083f = typedArray.getInt(3, -1);
        this.f2089l = typedArray.getBoolean(7, false);
        setDividerDrawable(E2.x(5));
        this.r = typedArray.getInt(8, 0);
        this.f2095s = typedArray.getDimensionPixelSize(6, 0);
        E2.H();
    }

    public final void b(Canvas canvas, int i2) {
        this.f2092o.setBounds(getPaddingLeft() + this.f2095s, i2, (getWidth() - getPaddingRight()) - this.f2095s, this.f2094q + i2);
        this.f2092o.draw(canvas);
    }

    public final void c(Canvas canvas, int i2) {
        this.f2092o.setBounds(i2, getPaddingTop() + this.f2095s, this.f2093p + i2, (getHeight() - getPaddingBottom()) - this.f2095s);
        this.f2092o.draw(canvas);
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C0144D;
    }

    @Override // android.view.ViewGroup
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public C0144D generateDefaultLayoutParams() {
        int i2 = this.f2085h;
        if (i2 == 0) {
            return new C0144D(-2);
        }
        if (i2 == 1) {
            return new C0144D(-1);
        }
        return null;
    }

    @Override // android.view.ViewGroup
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public C0144D generateLayoutParams(AttributeSet attributeSet) {
        return new C0144D(getContext(), attributeSet);
    }

    @Override // android.view.ViewGroup
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public C0144D generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new C0144D(layoutParams);
    }

    public final boolean g(int i2) {
        if (i2 == 0) {
            return (this.r & 1) != 0;
        }
        if (i2 == getChildCount()) {
            return (this.r & 4) != 0;
        }
        if ((this.r & 2) == 0) {
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
        if (this.f2083f < 0) {
            return super.getBaseline();
        }
        int childCount = getChildCount();
        int i3 = this.f2083f;
        if (childCount <= i3) {
            throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout set to an index that is out of bounds.");
        }
        View childAt = getChildAt(i3);
        int baseline = childAt.getBaseline();
        if (baseline == -1) {
            if (this.f2083f == 0) {
                return -1;
            }
            throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout points to a View that doesn't know how to get its baseline.");
        }
        int i4 = this.f2084g;
        if (this.f2085h == 1 && (i2 = this.f2086i & 112) != 48) {
            if (i2 == 16) {
                i4 += ((((getBottom() - getTop()) - getPaddingTop()) - getPaddingBottom()) - this.f2087j) / 2;
            } else if (i2 == 80) {
                i4 = ((getBottom() - getTop()) - getPaddingBottom()) - this.f2087j;
            }
        }
        return i4 + ((ViewGroup.MarginLayoutParams) ((C0144D) childAt.getLayoutParams())).topMargin + baseline;
    }

    public int getBaselineAlignedChildIndex() {
        return this.f2083f;
    }

    public Drawable getDividerDrawable() {
        return this.f2092o;
    }

    public int getDividerPadding() {
        return this.f2095s;
    }

    public int getDividerWidth() {
        return this.f2093p;
    }

    public int getGravity() {
        return this.f2086i;
    }

    public int getOrientation() {
        return this.f2085h;
    }

    public int getShowDividers() {
        return this.r;
    }

    public int getVirtualChildCount() {
        return getChildCount();
    }

    public float getWeightSum() {
        return this.f2088k;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        int right;
        int left;
        int i2;
        if (this.f2092o == null) {
            return;
        }
        int i3 = 0;
        if (this.f2085h == 1) {
            int virtualChildCount = getVirtualChildCount();
            while (i3 < virtualChildCount) {
                View childAt = getChildAt(i3);
                if (childAt != null && childAt.getVisibility() != 8 && g(i3)) {
                    b(canvas, (childAt.getTop() - ((ViewGroup.MarginLayoutParams) ((C0144D) childAt.getLayoutParams())).topMargin) - this.f2094q);
                }
                i3++;
            }
            if (g(virtualChildCount)) {
                View childAt2 = getChildAt(virtualChildCount - 1);
                b(canvas, childAt2 == null ? (getHeight() - getPaddingBottom()) - this.f2094q : childAt2.getBottom() + ((ViewGroup.MarginLayoutParams) ((C0144D) childAt2.getLayoutParams())).bottomMargin);
                return;
            }
            return;
        }
        int virtualChildCount2 = getVirtualChildCount();
        boolean a2 = w0.a(this);
        while (i3 < virtualChildCount2) {
            View childAt3 = getChildAt(i3);
            if (childAt3 != null && childAt3.getVisibility() != 8 && g(i3)) {
                C0144D c0144d = (C0144D) childAt3.getLayoutParams();
                c(canvas, a2 ? childAt3.getRight() + ((ViewGroup.MarginLayoutParams) c0144d).rightMargin : (childAt3.getLeft() - ((ViewGroup.MarginLayoutParams) c0144d).leftMargin) - this.f2093p);
            }
            i3++;
        }
        if (g(virtualChildCount2)) {
            View childAt4 = getChildAt(virtualChildCount2 - 1);
            if (childAt4 != null) {
                C0144D c0144d2 = (C0144D) childAt4.getLayoutParams();
                if (a2) {
                    left = childAt4.getLeft() - ((ViewGroup.MarginLayoutParams) c0144d2).leftMargin;
                    i2 = this.f2093p;
                    right = left - i2;
                } else {
                    right = childAt4.getRight() + ((ViewGroup.MarginLayoutParams) c0144d2).rightMargin;
                }
            } else if (a2) {
                right = getPaddingLeft();
            } else {
                left = getWidth() - getPaddingRight();
                i2 = this.f2093p;
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
        if (this.f2085h == 1) {
            int paddingLeft = getPaddingLeft();
            int i21 = i4 - i2;
            int paddingRight = i21 - getPaddingRight();
            int paddingRight2 = (i21 - paddingLeft) - getPaddingRight();
            int virtualChildCount = getVirtualChildCount();
            int i22 = this.f2086i;
            int i23 = i22 & 112;
            int i24 = 8388615 & i22;
            int paddingTop = i23 != 16 ? i23 != 80 ? getPaddingTop() : ((getPaddingTop() + i5) - i3) - this.f2087j : getPaddingTop() + (((i5 - i3) - this.f2087j) / 2);
            int i25 = 0;
            while (i25 < virtualChildCount) {
                View childAt = getChildAt(i25);
                if (childAt != null && childAt.getVisibility() != i20) {
                    int measuredWidth = childAt.getMeasuredWidth();
                    int measuredHeight = childAt.getMeasuredHeight();
                    C0144D c0144d = (C0144D) childAt.getLayoutParams();
                    int i26 = c0144d.f2081b;
                    if (i26 < 0) {
                        i26 = i24;
                    }
                    Field field = w.x.f3075a;
                    int absoluteGravity = Gravity.getAbsoluteGravity(i26, getLayoutDirection()) & 7;
                    if (absoluteGravity == 1) {
                        i17 = ((paddingRight2 - measuredWidth) / 2) + paddingLeft + ((ViewGroup.MarginLayoutParams) c0144d).leftMargin;
                        i18 = ((ViewGroup.MarginLayoutParams) c0144d).rightMargin;
                    } else if (absoluteGravity != 5) {
                        i19 = ((ViewGroup.MarginLayoutParams) c0144d).leftMargin + paddingLeft;
                        if (g(i25)) {
                            paddingTop += this.f2094q;
                        }
                        int i27 = paddingTop + ((ViewGroup.MarginLayoutParams) c0144d).topMargin;
                        childAt.layout(i19, i27, measuredWidth + i19, i27 + measuredHeight);
                        paddingTop = measuredHeight + ((ViewGroup.MarginLayoutParams) c0144d).bottomMargin + i27;
                    } else {
                        i17 = paddingRight - measuredWidth;
                        i18 = ((ViewGroup.MarginLayoutParams) c0144d).rightMargin;
                    }
                    i19 = i17 - i18;
                    if (g(i25)) {
                    }
                    int i272 = paddingTop + ((ViewGroup.MarginLayoutParams) c0144d).topMargin;
                    childAt.layout(i19, i272, measuredWidth + i19, i272 + measuredHeight);
                    paddingTop = measuredHeight + ((ViewGroup.MarginLayoutParams) c0144d).bottomMargin + i272;
                }
                i25++;
                i20 = 8;
            }
            return;
        }
        boolean a2 = w0.a(this);
        int paddingTop2 = getPaddingTop();
        int i28 = i5 - i3;
        int paddingBottom = i28 - getPaddingBottom();
        int paddingBottom2 = (i28 - paddingTop2) - getPaddingBottom();
        int virtualChildCount2 = getVirtualChildCount();
        int i29 = this.f2086i;
        int i30 = 8388615 & i29;
        int i31 = i29 & 112;
        boolean z3 = this.f2082e;
        int[] iArr = this.f2090m;
        int[] iArr2 = this.f2091n;
        Field field2 = w.x.f3075a;
        int absoluteGravity2 = Gravity.getAbsoluteGravity(i30, getLayoutDirection());
        int paddingLeft2 = absoluteGravity2 != 1 ? absoluteGravity2 != 5 ? getPaddingLeft() : ((getPaddingLeft() + i4) - i2) - this.f2087j : getPaddingLeft() + (((i4 - i2) - this.f2087j) / 2);
        if (a2) {
            i7 = virtualChildCount2 - 1;
            i6 = -1;
        } else {
            i6 = 1;
            i7 = 0;
        }
        int i32 = 0;
        while (i32 < virtualChildCount2) {
            int i33 = (i6 * i32) + i7;
            View childAt2 = getChildAt(i33);
            if (childAt2 == null) {
                i8 = i7;
                i9 = i6;
                i10 = virtualChildCount2;
                i11 = i31;
                i12 = 1;
            } else {
                i8 = i7;
                if (childAt2.getVisibility() != 8) {
                    int measuredWidth2 = childAt2.getMeasuredWidth();
                    int measuredHeight2 = childAt2.getMeasuredHeight();
                    C0144D c0144d2 = (C0144D) childAt2.getLayoutParams();
                    i9 = i6;
                    if (z3) {
                        i10 = virtualChildCount2;
                        if (((ViewGroup.MarginLayoutParams) c0144d2).height != -1) {
                            i13 = childAt2.getBaseline();
                            i14 = c0144d2.f2081b;
                            if (i14 < 0) {
                                i14 = i31;
                            }
                            i15 = i14 & 112;
                            i11 = i31;
                            if (i15 != 16) {
                                i16 = ((((paddingBottom2 - measuredHeight2) / 2) + paddingTop2) + ((ViewGroup.MarginLayoutParams) c0144d2).topMargin) - ((ViewGroup.MarginLayoutParams) c0144d2).bottomMargin;
                            } else if (i15 == 48) {
                                i16 = ((ViewGroup.MarginLayoutParams) c0144d2).topMargin + paddingTop2;
                                if (i13 != -1) {
                                    i16 = (iArr[1] - i13) + i16;
                                }
                            } else if (i15 != 80) {
                                i16 = paddingTop2;
                            } else {
                                i16 = (paddingBottom - measuredHeight2) - ((ViewGroup.MarginLayoutParams) c0144d2).bottomMargin;
                                if (i13 != -1) {
                                    i16 -= iArr2[2] - (childAt2.getMeasuredHeight() - i13);
                                }
                            }
                            if (g(i33)) {
                                paddingLeft2 += this.f2093p;
                            }
                            int i34 = paddingLeft2 + ((ViewGroup.MarginLayoutParams) c0144d2).leftMargin;
                            childAt2.layout(i34, i16, i34 + measuredWidth2, i16 + measuredHeight2);
                            paddingLeft2 = measuredWidth2 + ((ViewGroup.MarginLayoutParams) c0144d2).rightMargin + i34;
                        }
                    } else {
                        i10 = virtualChildCount2;
                    }
                    i13 = -1;
                    i14 = c0144d2.f2081b;
                    if (i14 < 0) {
                    }
                    i15 = i14 & 112;
                    i11 = i31;
                    if (i15 != 16) {
                    }
                    if (g(i33)) {
                    }
                    int i342 = paddingLeft2 + ((ViewGroup.MarginLayoutParams) c0144d2).leftMargin;
                    childAt2.layout(i342, i16, i342 + measuredWidth2, i16 + measuredHeight2);
                    paddingLeft2 = measuredWidth2 + ((ViewGroup.MarginLayoutParams) c0144d2).rightMargin + i342;
                } else {
                    i9 = i6;
                    i10 = virtualChildCount2;
                    i11 = i31;
                }
                i12 = 1;
            }
            i32 += i12;
            i7 = i8;
            i6 = i9;
            virtualChildCount2 = i10;
            i31 = i11;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:175:0x02dc, code lost:
    
        if (((android.view.ViewGroup.MarginLayoutParams) r9).width == (-1)) goto L150;
     */
    /* JADX WARN: Removed duplicated region for block: B:240:0x054d  */
    /* JADX WARN: Removed duplicated region for block: B:245:0x0558  */
    /* JADX WARN: Removed duplicated region for block: B:260:0x0483  */
    /* JADX WARN: Removed duplicated region for block: B:263:0x04b0  */
    /* JADX WARN: Removed duplicated region for block: B:266:0x04bd  */
    /* JADX WARN: Removed duplicated region for block: B:268:0x04db  */
    /* JADX WARN: Removed duplicated region for block: B:269:0x04c9  */
    /* JADX WARN: Removed duplicated region for block: B:270:0x04b5  */
    /* JADX WARN: Removed duplicated region for block: B:271:0x0488  */
    /* JADX WARN: Removed duplicated region for block: B:295:0x05e1  */
    /* JADX WARN: Removed duplicated region for block: B:340:0x085d  */
    /* JADX WARN: Removed duplicated region for block: B:354:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:358:0x0695  */
    /* JADX WARN: Removed duplicated region for block: B:361:0x06b1  */
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
        C0144D c0144d;
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
        boolean z7;
        C0144D c0144d2;
        boolean z8;
        boolean z9;
        int max2;
        int i36 = -2;
        int i37 = 1073741824;
        int i38 = 8;
        int i39 = Integer.MIN_VALUE;
        float f5 = 0.0f;
        boolean z10 = true;
        if (this.f2085h == 1) {
            this.f2087j = 0;
            int virtualChildCount = getVirtualChildCount();
            int mode = View.MeasureSpec.getMode(i2);
            int mode2 = View.MeasureSpec.getMode(i3);
            int i40 = this.f2083f;
            boolean z11 = this.f2089l;
            boolean z12 = true;
            int i41 = 0;
            int i42 = 0;
            int i43 = 0;
            boolean z13 = false;
            int i44 = 0;
            int i45 = 0;
            int i46 = 0;
            boolean z14 = false;
            float f6 = 0.0f;
            while (i41 < virtualChildCount) {
                View childAt = getChildAt(i41);
                if (childAt == null) {
                    this.f2087j = this.f2087j;
                } else if (childAt.getVisibility() != i38) {
                    if (g(i41)) {
                        this.f2087j += this.f2094q;
                    }
                    C0144D c0144d3 = (C0144D) childAt.getLayoutParams();
                    float f7 = c0144d3.f2080a;
                    f6 += f7;
                    if (mode2 == i37 && ((ViewGroup.MarginLayoutParams) c0144d3).height == 0 && f7 > f5) {
                        int i47 = this.f2087j;
                        this.f2087j = Math.max(i47, ((ViewGroup.MarginLayoutParams) c0144d3).topMargin + i47 + ((ViewGroup.MarginLayoutParams) c0144d3).bottomMargin);
                        i32 = i40;
                        i33 = mode2;
                        i34 = mode;
                        i35 = virtualChildCount;
                        c0144d2 = c0144d3;
                        z8 = true;
                        z7 = true;
                    } else {
                        if (((ViewGroup.MarginLayoutParams) c0144d3).height != 0 || f7 <= f5) {
                            i31 = i39;
                        } else {
                            ((ViewGroup.MarginLayoutParams) c0144d3).height = i36;
                            i31 = 0;
                        }
                        int i48 = f6 == f5 ? this.f2087j : 0;
                        i32 = i40;
                        i33 = mode2;
                        i34 = mode;
                        i35 = virtualChildCount;
                        z7 = true;
                        c0144d2 = c0144d3;
                        measureChildWithMargins(childAt, i2, 0, i3, i48);
                        if (i31 != i39) {
                            ((ViewGroup.MarginLayoutParams) c0144d2).height = i31;
                        }
                        int measuredHeight = childAt.getMeasuredHeight();
                        int i49 = this.f2087j;
                        this.f2087j = Math.max(i49, i49 + measuredHeight + ((ViewGroup.MarginLayoutParams) c0144d2).topMargin + ((ViewGroup.MarginLayoutParams) c0144d2).bottomMargin);
                        int i50 = i44;
                        if (z11) {
                            i44 = Math.max(measuredHeight, i50);
                        }
                        z8 = z13;
                    }
                    if (i32 >= 0 && i32 == i41 + 1) {
                        this.f2084g = this.f2087j;
                    }
                    float f8 = c0144d2.f2080a;
                    if (i41 < i32 && f8 > 0.0f) {
                        throw new RuntimeException("A child of LinearLayout with index less than mBaselineAlignedChildIndex has weight > 0, which won't work.  Either remove the weight, or don't set mBaselineAlignedChildIndex.");
                    }
                    mode = i34;
                    if (mode == 1073741824 || ((ViewGroup.MarginLayoutParams) c0144d2).width != -1) {
                        z9 = false;
                    } else {
                        z9 = z7;
                        z14 = z9;
                    }
                    int i51 = ((ViewGroup.MarginLayoutParams) c0144d2).leftMargin + ((ViewGroup.MarginLayoutParams) c0144d2).rightMargin;
                    int measuredWidth = childAt.getMeasuredWidth() + i51;
                    max2 = Math.max(i45, measuredWidth);
                    int combineMeasuredStates = View.combineMeasuredStates(i46, childAt.getMeasuredState());
                    boolean z15 = (z12 && ((ViewGroup.MarginLayoutParams) c0144d2).width == -1) ? z7 : false;
                    if (f8 > 0.0f) {
                        if (!z9) {
                            i51 = measuredWidth;
                        }
                        i43 = Math.max(i43, i51);
                    } else {
                        int i52 = i43;
                        if (!z9) {
                            i51 = measuredWidth;
                        }
                        i42 = Math.max(i42, i51);
                        i43 = i52;
                    }
                    z13 = z8;
                    i46 = combineMeasuredStates;
                    z12 = z15;
                    i41++;
                    i40 = i32;
                    i45 = max2;
                    z10 = z7;
                    mode2 = i33;
                    virtualChildCount = i35;
                    i36 = -2;
                    i37 = 1073741824;
                    i38 = 8;
                    i39 = Integer.MIN_VALUE;
                    f5 = 0.0f;
                }
                i32 = i40;
                i33 = mode2;
                i35 = virtualChildCount;
                max2 = i45;
                z7 = true;
                i41++;
                i40 = i32;
                i45 = max2;
                z10 = z7;
                mode2 = i33;
                virtualChildCount = i35;
                i36 = -2;
                i37 = 1073741824;
                i38 = 8;
                i39 = Integer.MIN_VALUE;
                f5 = 0.0f;
            }
            int i53 = mode2;
            int i54 = virtualChildCount;
            boolean z16 = z10;
            int i55 = i42;
            int i56 = i43;
            int i57 = i44;
            int i58 = i45;
            int i59 = i46;
            if (this.f2087j > 0 && g(i54)) {
                this.f2087j += this.f2094q;
            }
            int i60 = i53;
            if (z11 && (i60 == Integer.MIN_VALUE || i60 == 0)) {
                this.f2087j = 0;
                for (int i61 = 0; i61 < i54; i61++) {
                    View childAt2 = getChildAt(i61);
                    if (childAt2 == null) {
                        this.f2087j = this.f2087j;
                    } else if (childAt2.getVisibility() != 8) {
                        C0144D c0144d4 = (C0144D) childAt2.getLayoutParams();
                        int i62 = this.f2087j;
                        this.f2087j = Math.max(i62, i62 + i57 + ((ViewGroup.MarginLayoutParams) c0144d4).topMargin + ((ViewGroup.MarginLayoutParams) c0144d4).bottomMargin);
                    }
                }
            }
            int paddingBottom = getPaddingBottom() + getPaddingTop() + this.f2087j;
            this.f2087j = paddingBottom;
            int resolveSizeAndState = View.resolveSizeAndState(Math.max(paddingBottom, getSuggestedMinimumHeight()), i3, 0);
            int i63 = (16777215 & resolveSizeAndState) - this.f2087j;
            if (z13 || (i63 != 0 && f6 > 0.0f)) {
                float f9 = this.f2088k;
                if (f9 > 0.0f) {
                    f6 = f9;
                }
                this.f2087j = 0;
                int i64 = 0;
                while (i64 < i54) {
                    View childAt3 = getChildAt(i64);
                    if (childAt3.getVisibility() == 8) {
                        i27 = i60;
                    } else {
                        C0144D c0144d5 = (C0144D) childAt3.getLayoutParams();
                        float f10 = c0144d5.f2080a;
                        if (f10 > 0.0f) {
                            int i65 = (int) ((i63 * f10) / f6);
                            f6 -= f10;
                            int i66 = i63 - i65;
                            int childMeasureSpec = ViewGroup.getChildMeasureSpec(i2, getPaddingRight() + getPaddingLeft() + ((ViewGroup.MarginLayoutParams) c0144d5).leftMargin + ((ViewGroup.MarginLayoutParams) c0144d5).rightMargin, ((ViewGroup.MarginLayoutParams) c0144d5).width);
                            if (((ViewGroup.MarginLayoutParams) c0144d5).height == 0) {
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
                        int i67 = ((ViewGroup.MarginLayoutParams) c0144d5).leftMargin + ((ViewGroup.MarginLayoutParams) c0144d5).rightMargin;
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
                        boolean z17 = (z12 && ((ViewGroup.MarginLayoutParams) c0144d5).width == i29) ? z16 : false;
                        int i68 = this.f2087j;
                        this.f2087j = Math.max(i68, childAt3.getMeasuredHeight() + i68 + ((ViewGroup.MarginLayoutParams) c0144d5).topMargin + ((ViewGroup.MarginLayoutParams) c0144d5).bottomMargin);
                        z12 = z17;
                        i58 = i28;
                    }
                    i64++;
                    i60 = i27;
                }
                this.f2087j = getPaddingBottom() + getPaddingTop() + this.f2087j;
                i26 = i55;
            } else {
                i26 = Math.max(i55, i56);
                if (z11 && i60 != 1073741824) {
                    for (int i69 = 0; i69 < i54; i69++) {
                        View childAt4 = getChildAt(i69);
                        if (childAt4 != null && childAt4.getVisibility() != 8 && ((C0144D) childAt4.getLayoutParams()).f2080a > 0.0f) {
                            childAt4.measure(View.MeasureSpec.makeMeasureSpec(childAt4.getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(i57, 1073741824));
                        }
                    }
                }
            }
            int i70 = i58;
            if (z12 || mode == 1073741824) {
                i26 = i70;
            }
            setMeasuredDimension(View.resolveSizeAndState(Math.max(getPaddingRight() + getPaddingLeft() + i26, getSuggestedMinimumWidth()), i2, i59), resolveSizeAndState);
            if (z14) {
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824);
                for (int i71 = 0; i71 < i54; i71++) {
                    View childAt5 = getChildAt(i71);
                    if (childAt5.getVisibility() != 8) {
                        C0144D c0144d6 = (C0144D) childAt5.getLayoutParams();
                        if (((ViewGroup.MarginLayoutParams) c0144d6).width == -1) {
                            int i72 = ((ViewGroup.MarginLayoutParams) c0144d6).height;
                            ((ViewGroup.MarginLayoutParams) c0144d6).height = childAt5.getMeasuredHeight();
                            measureChildWithMargins(childAt5, makeMeasureSpec, 0, i3, 0);
                            ((ViewGroup.MarginLayoutParams) c0144d6).height = i72;
                        }
                    }
                }
                return;
            }
            return;
        }
        this.f2087j = 0;
        int virtualChildCount2 = getVirtualChildCount();
        int mode3 = View.MeasureSpec.getMode(i2);
        int mode4 = View.MeasureSpec.getMode(i3);
        if (this.f2090m == null || this.f2091n == null) {
            this.f2090m = new int[4];
            this.f2091n = new int[4];
        }
        int[] iArr = this.f2090m;
        int[] iArr2 = this.f2091n;
        iArr[3] = -1;
        iArr[2] = -1;
        iArr[1] = -1;
        iArr[0] = -1;
        iArr2[3] = -1;
        iArr2[2] = -1;
        iArr2[1] = -1;
        iArr2[0] = -1;
        boolean z18 = this.f2082e;
        boolean z19 = this.f2089l;
        boolean z20 = mode3 == 1073741824;
        boolean z21 = true;
        int i73 = 0;
        float f11 = 0.0f;
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
                this.f2087j = this.f2087j;
                i21 = i75;
                z3 = z19;
                z4 = z18;
            } else {
                int i79 = i73;
                int i80 = i74;
                if (childAt6.getVisibility() == 8) {
                    z4 = z18;
                    i73 = i79;
                    i74 = i80;
                    i21 = i75;
                    z3 = z19;
                } else {
                    if (g(i75)) {
                        this.f2087j += this.f2093p;
                    }
                    C0144D c0144d7 = (C0144D) childAt6.getLayoutParams();
                    float f12 = c0144d7.f2080a;
                    float f13 = f11 + f12;
                    if (mode3 == 1073741824 && ((ViewGroup.MarginLayoutParams) c0144d7).width == 0 && f12 > 0.0f) {
                        if (z20) {
                            i25 = i75;
                            this.f2087j = ((ViewGroup.MarginLayoutParams) c0144d7).leftMargin + ((ViewGroup.MarginLayoutParams) c0144d7).rightMargin + this.f2087j;
                        } else {
                            i25 = i75;
                            int i81 = this.f2087j;
                            this.f2087j = Math.max(i81, ((ViewGroup.MarginLayoutParams) c0144d7).leftMargin + i81 + ((ViewGroup.MarginLayoutParams) c0144d7).rightMargin);
                        }
                        if (z18) {
                            int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 0);
                            childAt6.measure(makeMeasureSpec2, makeMeasureSpec2);
                            c0144d = c0144d7;
                            i18 = i79;
                            i19 = i80;
                            i21 = i25;
                            z3 = z19;
                            z4 = z18;
                        } else {
                            c0144d = c0144d7;
                            i18 = i79;
                            i19 = i80;
                            i21 = i25;
                            i22 = 1073741824;
                            z3 = z19;
                            z4 = z18;
                            z5 = true;
                            if (mode4 == i22 && ((ViewGroup.MarginLayoutParams) c0144d).height == -1) {
                                z6 = true;
                                z23 = true;
                            } else {
                                z6 = false;
                            }
                            i23 = ((ViewGroup.MarginLayoutParams) c0144d).topMargin + ((ViewGroup.MarginLayoutParams) c0144d).bottomMargin;
                            int measuredHeight3 = childAt6.getMeasuredHeight() + i23;
                            int combineMeasuredStates2 = View.combineMeasuredStates(i76, childAt6.getMeasuredState());
                            if (z4 || (baseline2 = childAt6.getBaseline()) == -1) {
                                i24 = i23;
                            } else {
                                int i82 = c0144d.f2081b;
                                if (i82 < 0) {
                                    i82 = this.f2086i;
                                }
                                int i83 = (((i82 & 112) >> 4) & (-2)) >> 1;
                                i24 = i23;
                                iArr[i83] = Math.max(iArr[i83], baseline2);
                                iArr2[i83] = Math.max(iArr2[i83], measuredHeight3 - baseline2);
                            }
                            int max4 = Math.max(i19, measuredHeight3);
                            boolean z24 = !z21 && ((ViewGroup.MarginLayoutParams) c0144d).height == -1;
                            if (c0144d.f2080a <= 0.0f) {
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
                            z22 = z5;
                            z21 = z24;
                            f11 = f13;
                        }
                    } else {
                        int i84 = i75;
                        if (((ViewGroup.MarginLayoutParams) c0144d7).width == 0) {
                            f4 = 0.0f;
                            if (f12 > 0.0f) {
                                ((ViewGroup.MarginLayoutParams) c0144d7).width = -2;
                                i17 = 0;
                                i18 = i79;
                                i19 = i80;
                                i20 = i17;
                                i21 = i84;
                                z3 = z19;
                                z4 = z18;
                                measureChildWithMargins(childAt6, i2, f13 != f4 ? this.f2087j : 0, i3, 0);
                                if (i20 == Integer.MIN_VALUE) {
                                    c0144d = c0144d7;
                                    ((ViewGroup.MarginLayoutParams) c0144d).width = i20;
                                } else {
                                    c0144d = c0144d7;
                                }
                                int measuredWidth3 = childAt6.getMeasuredWidth();
                                if (z20) {
                                    int i85 = this.f2087j;
                                    this.f2087j = Math.max(i85, i85 + measuredWidth3 + ((ViewGroup.MarginLayoutParams) c0144d).leftMargin + ((ViewGroup.MarginLayoutParams) c0144d).rightMargin);
                                } else {
                                    this.f2087j = ((ViewGroup.MarginLayoutParams) c0144d).leftMargin + measuredWidth3 + ((ViewGroup.MarginLayoutParams) c0144d).rightMargin + this.f2087j;
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
                        z3 = z19;
                        z4 = z18;
                        measureChildWithMargins(childAt6, i2, f13 != f4 ? this.f2087j : 0, i3, 0);
                        if (i20 == Integer.MIN_VALUE) {
                        }
                        int measuredWidth32 = childAt6.getMeasuredWidth();
                        if (z20) {
                        }
                        if (z3) {
                        }
                    }
                    z5 = z22;
                    i22 = 1073741824;
                    if (mode4 == i22) {
                    }
                    z6 = false;
                    i23 = ((ViewGroup.MarginLayoutParams) c0144d).topMargin + ((ViewGroup.MarginLayoutParams) c0144d).bottomMargin;
                    int measuredHeight32 = childAt6.getMeasuredHeight() + i23;
                    int combineMeasuredStates22 = View.combineMeasuredStates(i76, childAt6.getMeasuredState());
                    if (z4) {
                    }
                    i24 = i23;
                    int max42 = Math.max(i19, measuredHeight32);
                    if (z21) {
                    }
                    if (c0144d.f2080a <= 0.0f) {
                    }
                    i74 = max42;
                    i76 = combineMeasuredStates22;
                    z22 = z5;
                    z21 = z24;
                    f11 = f13;
                }
            }
            i75 = i21 + 1;
            z19 = z3;
            z18 = z4;
        }
        int i86 = i74;
        boolean z25 = z19;
        boolean z26 = z18;
        if (this.f2087j > 0 && g(virtualChildCount2)) {
            this.f2087j += this.f2093p;
        }
        int i87 = iArr[1];
        if (i87 == -1 && iArr[0] == -1 && iArr[2] == -1) {
            c2 = 3;
            if (iArr[3] == -1) {
                max = i86;
                i4 = i76;
                if (z25 && (mode3 == Integer.MIN_VALUE || mode3 == 0)) {
                    this.f2087j = 0;
                    for (i16 = 0; i16 < virtualChildCount2; i16++) {
                        View childAt7 = getChildAt(i16);
                        if (childAt7 == null) {
                            this.f2087j = this.f2087j;
                        } else if (childAt7.getVisibility() != 8) {
                            C0144D c0144d8 = (C0144D) childAt7.getLayoutParams();
                            if (z20) {
                                this.f2087j = ((ViewGroup.MarginLayoutParams) c0144d8).leftMargin + i77 + ((ViewGroup.MarginLayoutParams) c0144d8).rightMargin + this.f2087j;
                            } else {
                                int i88 = this.f2087j;
                                this.f2087j = Math.max(i88, i88 + i77 + ((ViewGroup.MarginLayoutParams) c0144d8).leftMargin + ((ViewGroup.MarginLayoutParams) c0144d8).rightMargin);
                            }
                        }
                    }
                }
                int paddingRight = getPaddingRight() + getPaddingLeft() + this.f2087j;
                this.f2087j = paddingRight;
                int resolveSizeAndState2 = View.resolveSizeAndState(Math.max(paddingRight, getSuggestedMinimumWidth()), i2, 0);
                int i89 = (16777215 & resolveSizeAndState2) - this.f2087j;
                if (!z22 || (i89 != 0 && f11 > 0.0f)) {
                    f2 = this.f2088k;
                    if (f2 > 0.0f) {
                        f11 = f2;
                    }
                    iArr[3] = -1;
                    iArr[2] = -1;
                    iArr[1] = -1;
                    iArr[0] = -1;
                    iArr2[3] = -1;
                    iArr2[2] = -1;
                    iArr2[1] = -1;
                    iArr2[0] = -1;
                    this.f2087j = 0;
                    int i90 = i4;
                    max = -1;
                    i5 = 0;
                    while (i5 < virtualChildCount2) {
                        View childAt8 = getChildAt(i5);
                        if (childAt8 == null || childAt8.getVisibility() == 8) {
                            i10 = i89;
                            i11 = virtualChildCount2;
                        } else {
                            C0144D c0144d9 = (C0144D) childAt8.getLayoutParams();
                            float f14 = c0144d9.f2080a;
                            if (f14 > 0.0f) {
                                i11 = virtualChildCount2;
                                int i91 = (int) ((i89 * f14) / f11);
                                float f15 = f11 - f14;
                                int i92 = i89 - i91;
                                int childMeasureSpec2 = ViewGroup.getChildMeasureSpec(i3, getPaddingBottom() + getPaddingTop() + ((ViewGroup.MarginLayoutParams) c0144d9).topMargin + ((ViewGroup.MarginLayoutParams) c0144d9).bottomMargin, ((ViewGroup.MarginLayoutParams) c0144d9).height);
                                if (((ViewGroup.MarginLayoutParams) c0144d9).width == 0) {
                                    i15 = 1073741824;
                                    if (mode3 == 1073741824) {
                                        if (i91 <= 0) {
                                            i91 = 0;
                                        }
                                        childAt8.measure(View.MeasureSpec.makeMeasureSpec(i91, 1073741824), childMeasureSpec2);
                                        i90 = View.combineMeasuredStates(i90, childAt8.getMeasuredState() & (-16777216));
                                        f11 = f15;
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
                                f11 = f15;
                                i12 = i92;
                            } else {
                                i12 = i89;
                                i11 = virtualChildCount2;
                            }
                            if (z20) {
                                f3 = f11;
                                this.f2087j = childAt8.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) c0144d9).leftMargin + ((ViewGroup.MarginLayoutParams) c0144d9).rightMargin + this.f2087j;
                                i13 = i12;
                            } else {
                                f3 = f11;
                                int i93 = this.f2087j;
                                i13 = i12;
                                this.f2087j = Math.max(i93, childAt8.getMeasuredWidth() + i93 + ((ViewGroup.MarginLayoutParams) c0144d9).leftMargin + ((ViewGroup.MarginLayoutParams) c0144d9).rightMargin);
                            }
                            boolean z27 = mode4 != 1073741824 && ((ViewGroup.MarginLayoutParams) c0144d9).height == -1;
                            int i94 = ((ViewGroup.MarginLayoutParams) c0144d9).topMargin + ((ViewGroup.MarginLayoutParams) c0144d9).bottomMargin;
                            int measuredHeight4 = childAt8.getMeasuredHeight() + i94;
                            max = Math.max(max, measuredHeight4);
                            if (!z27) {
                                i94 = measuredHeight4;
                            }
                            i73 = Math.max(i73, i94);
                            if (z21) {
                                i14 = -1;
                                if (((ViewGroup.MarginLayoutParams) c0144d9).height == -1) {
                                    z2 = true;
                                    if (!z26 && (baseline = childAt8.getBaseline()) != i14) {
                                        int i95 = c0144d9.f2081b;
                                        if (i95 < 0) {
                                            i95 = this.f2086i;
                                        }
                                        int i96 = (((i95 & 112) >> 4) & (-2)) >> 1;
                                        iArr[i96] = Math.max(iArr[i96], baseline);
                                        iArr2[i96] = Math.max(iArr2[i96], measuredHeight4 - baseline);
                                    }
                                    z21 = z2;
                                    i10 = i13;
                                    f11 = f3;
                                }
                            } else {
                                i14 = -1;
                            }
                            z2 = false;
                            if (!z26) {
                            }
                            z21 = z2;
                            i10 = i13;
                            f11 = f3;
                        }
                        i5++;
                        i89 = i10;
                        virtualChildCount2 = i11;
                    }
                    i6 = i3;
                    i7 = virtualChildCount2;
                    this.f2087j = getPaddingRight() + getPaddingLeft() + this.f2087j;
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
                    if (z25 && mode3 != 1073741824) {
                        for (int i97 = 0; i97 < virtualChildCount2; i97++) {
                            View childAt9 = getChildAt(i97);
                            if (childAt9 != null && childAt9.getVisibility() != 8 && ((C0144D) childAt9.getLayoutParams()).f2080a > 0.0f) {
                                childAt9.measure(View.MeasureSpec.makeMeasureSpec(i77, 1073741824), View.MeasureSpec.makeMeasureSpec(childAt9.getMeasuredHeight(), 1073741824));
                            }
                        }
                    }
                    i6 = i3;
                    i7 = virtualChildCount2;
                    i9 = 0;
                }
                if (!z21 || mode4 == 1073741824) {
                    i73 = max;
                }
                setMeasuredDimension((i4 & (-16777216)) | resolveSizeAndState2, View.resolveSizeAndState(Math.max(getPaddingBottom() + getPaddingTop() + i73, getSuggestedMinimumHeight()), i6, i4 << 16));
                if (z23) {
                    return;
                }
                int makeMeasureSpec3 = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824);
                int i98 = i7;
                while (i9 < i98) {
                    View childAt10 = getChildAt(i9);
                    if (childAt10.getVisibility() != 8) {
                        C0144D c0144d10 = (C0144D) childAt10.getLayoutParams();
                        if (((ViewGroup.MarginLayoutParams) c0144d10).height == -1) {
                            int i99 = ((ViewGroup.MarginLayoutParams) c0144d10).width;
                            ((ViewGroup.MarginLayoutParams) c0144d10).width = childAt10.getMeasuredWidth();
                            measureChildWithMargins(childAt10, i2, 0, makeMeasureSpec3, 0);
                            ((ViewGroup.MarginLayoutParams) c0144d10).width = i99;
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
        if (z25) {
            this.f2087j = 0;
            while (i16 < virtualChildCount2) {
            }
        }
        int paddingRight2 = getPaddingRight() + getPaddingLeft() + this.f2087j;
        this.f2087j = paddingRight2;
        int resolveSizeAndState22 = View.resolveSizeAndState(Math.max(paddingRight2, getSuggestedMinimumWidth()), i2, 0);
        int i892 = (16777215 & resolveSizeAndState22) - this.f2087j;
        if (z22) {
        }
        f2 = this.f2088k;
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
        this.f2087j = 0;
        int i902 = i4;
        max = -1;
        i5 = 0;
        while (i5 < virtualChildCount2) {
        }
        i6 = i3;
        i7 = virtualChildCount2;
        this.f2087j = getPaddingRight() + getPaddingLeft() + this.f2087j;
        i8 = iArr[1];
        if (i8 != -1) {
        }
        c3 = 3;
        i9 = 0;
        max = Math.max(max, Math.max(iArr2[c3], Math.max(iArr2[0], Math.max(iArr2[1], iArr2[2]))) + Math.max(iArr[c3], Math.max(iArr[0], Math.max(i8, iArr[2]))));
        i4 = i902;
        if (!z21) {
        }
        i73 = max;
        setMeasuredDimension((i4 & (-16777216)) | resolveSizeAndState22, View.resolveSizeAndState(Math.max(getPaddingBottom() + getPaddingTop() + i73, getSuggestedMinimumHeight()), i6, i4 << 16));
        if (z23) {
        }
    }

    public void setBaselineAligned(boolean z2) {
        this.f2082e = z2;
    }

    public void setBaselineAlignedChildIndex(int i2) {
        if (i2 >= 0 && i2 < getChildCount()) {
            this.f2083f = i2;
            return;
        }
        throw new IllegalArgumentException("base aligned child index out of range (0, " + getChildCount() + ")");
    }

    public void setDividerDrawable(Drawable drawable) {
        if (drawable == this.f2092o) {
            return;
        }
        this.f2092o = drawable;
        if (drawable != null) {
            this.f2093p = drawable.getIntrinsicWidth();
            this.f2094q = drawable.getIntrinsicHeight();
        } else {
            this.f2093p = 0;
            this.f2094q = 0;
        }
        setWillNotDraw(drawable == null);
        requestLayout();
    }

    public void setDividerPadding(int i2) {
        this.f2095s = i2;
    }

    public void setGravity(int i2) {
        if (this.f2086i != i2) {
            if ((8388615 & i2) == 0) {
                i2 |= 8388611;
            }
            if ((i2 & 112) == 0) {
                i2 |= 48;
            }
            this.f2086i = i2;
            requestLayout();
        }
    }

    public void setHorizontalGravity(int i2) {
        int i3 = i2 & 8388615;
        int i4 = this.f2086i;
        if ((8388615 & i4) != i3) {
            this.f2086i = i3 | ((-8388616) & i4);
            requestLayout();
        }
    }

    public void setMeasureWithLargestChildEnabled(boolean z2) {
        this.f2089l = z2;
    }

    public void setOrientation(int i2) {
        if (this.f2085h != i2) {
            this.f2085h = i2;
            requestLayout();
        }
    }

    public void setShowDividers(int i2) {
        if (i2 != this.r) {
            requestLayout();
        }
        this.r = i2;
    }

    public void setVerticalGravity(int i2) {
        int i3 = i2 & 112;
        int i4 = this.f2086i;
        if ((i4 & 112) != i3) {
            this.f2086i = i3 | (i4 & (-113));
            requestLayout();
        }
    }

    public void setWeightSum(float f2) {
        this.f2088k = Math.max(0.0f, f2);
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }
}
