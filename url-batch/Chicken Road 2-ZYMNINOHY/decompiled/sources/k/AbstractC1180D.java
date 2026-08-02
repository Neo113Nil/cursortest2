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
import f.AbstractC0410a;
import java.lang.reflect.Field;

/* renamed from: k.D, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1180D extends ViewGroup {

    /* renamed from: a, reason: collision with root package name */
    public boolean f13902a;

    /* renamed from: b, reason: collision with root package name */
    public int f13903b;

    /* renamed from: c, reason: collision with root package name */
    public int f13904c;

    /* renamed from: d, reason: collision with root package name */
    public int f13905d;

    /* renamed from: e, reason: collision with root package name */
    public int f13906e;

    /* renamed from: f, reason: collision with root package name */
    public int f13907f;

    /* renamed from: g, reason: collision with root package name */
    public float f13908g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f13909h;

    /* renamed from: i, reason: collision with root package name */
    public int[] f13910i;

    /* renamed from: j, reason: collision with root package name */
    public int[] f13911j;

    /* renamed from: k, reason: collision with root package name */
    public Drawable f13912k;

    /* renamed from: l, reason: collision with root package name */
    public int f13913l;

    /* renamed from: m, reason: collision with root package name */
    public int f13914m;
    public int n;
    public int o;

    public AbstractC1180D(Context context, AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
        this.f13902a = true;
        this.f13903b = -1;
        this.f13904c = 0;
        this.f13906e = 8388659;
        B1.j v = B1.j.v(context, attributeSet, AbstractC0410a.f8478i, i4);
        TypedArray typedArray = (TypedArray) v.f202c;
        int i5 = typedArray.getInt(1, -1);
        if (i5 >= 0) {
            setOrientation(i5);
        }
        int i6 = typedArray.getInt(0, -1);
        if (i6 >= 0) {
            setGravity(i6);
        }
        boolean z = typedArray.getBoolean(2, true);
        if (!z) {
            setBaselineAligned(z);
        }
        this.f13908g = typedArray.getFloat(4, -1.0f);
        this.f13903b = typedArray.getInt(3, -1);
        this.f13909h = typedArray.getBoolean(7, false);
        setDividerDrawable(v.o(5));
        this.n = typedArray.getInt(8, 0);
        this.o = typedArray.getDimensionPixelSize(6, 0);
        v.x();
    }

    public final void b(Canvas canvas, int i4) {
        this.f13912k.setBounds(getPaddingLeft() + this.o, i4, (getWidth() - getPaddingRight()) - this.o, this.f13914m + i4);
        this.f13912k.draw(canvas);
    }

    public final void c(Canvas canvas, int i4) {
        this.f13912k.setBounds(i4, getPaddingTop() + this.o, this.f13913l + i4, (getHeight() - getPaddingBottom()) - this.o);
        this.f13912k.draw(canvas);
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C1179C;
    }

    @Override // android.view.ViewGroup
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public C1179C generateDefaultLayoutParams() {
        int i4 = this.f13905d;
        if (i4 == 0) {
            return new C1179C(-2);
        }
        if (i4 == 1) {
            return new C1179C(-1);
        }
        return null;
    }

    @Override // android.view.ViewGroup
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public C1179C generateLayoutParams(AttributeSet attributeSet) {
        return new C1179C(getContext(), attributeSet);
    }

    @Override // android.view.ViewGroup
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public C1179C generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new C1179C(layoutParams);
    }

    public final boolean g(int i4) {
        if (i4 == 0) {
            return (this.n & 1) != 0;
        }
        if (i4 == getChildCount()) {
            return (this.n & 4) != 0;
        }
        if ((this.n & 2) != 0) {
            for (int i5 = i4 - 1; i5 >= 0; i5--) {
                if (getChildAt(i5).getVisibility() != 8) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // android.view.View
    public int getBaseline() {
        int i4;
        if (this.f13903b < 0) {
            return super.getBaseline();
        }
        int childCount = getChildCount();
        int i5 = this.f13903b;
        if (childCount <= i5) {
            throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout set to an index that is out of bounds.");
        }
        View childAt = getChildAt(i5);
        int baseline = childAt.getBaseline();
        if (baseline == -1) {
            if (this.f13903b == 0) {
                return -1;
            }
            throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout points to a View that doesn't know how to get its baseline.");
        }
        int i6 = this.f13904c;
        if (this.f13905d == 1 && (i4 = this.f13906e & 112) != 48) {
            if (i4 == 16) {
                i6 += ((((getBottom() - getTop()) - getPaddingTop()) - getPaddingBottom()) - this.f13907f) / 2;
            } else if (i4 == 80) {
                i6 = ((getBottom() - getTop()) - getPaddingBottom()) - this.f13907f;
            }
        }
        return i6 + ((ViewGroup.MarginLayoutParams) ((C1179C) childAt.getLayoutParams())).topMargin + baseline;
    }

    public int getBaselineAlignedChildIndex() {
        return this.f13903b;
    }

    public Drawable getDividerDrawable() {
        return this.f13912k;
    }

    public int getDividerPadding() {
        return this.o;
    }

    public int getDividerWidth() {
        return this.f13913l;
    }

    public int getGravity() {
        return this.f13906e;
    }

    public int getOrientation() {
        return this.f13905d;
    }

    public int getShowDividers() {
        return this.n;
    }

    public int getVirtualChildCount() {
        return getChildCount();
    }

    public float getWeightSum() {
        return this.f13908g;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        int right;
        int left;
        int i4;
        if (this.f13912k == null) {
            return;
        }
        int i5 = 0;
        if (this.f13905d == 1) {
            int virtualChildCount = getVirtualChildCount();
            while (i5 < virtualChildCount) {
                View childAt = getChildAt(i5);
                if (childAt != null && childAt.getVisibility() != 8 && g(i5)) {
                    b(canvas, (childAt.getTop() - ((ViewGroup.MarginLayoutParams) ((C1179C) childAt.getLayoutParams())).topMargin) - this.f13914m);
                }
                i5++;
            }
            if (g(virtualChildCount)) {
                View childAt2 = getChildAt(virtualChildCount - 1);
                b(canvas, childAt2 == null ? (getHeight() - getPaddingBottom()) - this.f13914m : childAt2.getBottom() + ((ViewGroup.MarginLayoutParams) ((C1179C) childAt2.getLayoutParams())).bottomMargin);
                return;
            }
            return;
        }
        int virtualChildCount2 = getVirtualChildCount();
        boolean a3 = t0.a(this);
        while (i5 < virtualChildCount2) {
            View childAt3 = getChildAt(i5);
            if (childAt3 != null && childAt3.getVisibility() != 8 && g(i5)) {
                C1179C c1179c = (C1179C) childAt3.getLayoutParams();
                c(canvas, a3 ? childAt3.getRight() + ((ViewGroup.MarginLayoutParams) c1179c).rightMargin : (childAt3.getLeft() - ((ViewGroup.MarginLayoutParams) c1179c).leftMargin) - this.f13913l);
            }
            i5++;
        }
        if (g(virtualChildCount2)) {
            View childAt4 = getChildAt(virtualChildCount2 - 1);
            if (childAt4 != null) {
                C1179C c1179c2 = (C1179C) childAt4.getLayoutParams();
                if (a3) {
                    left = childAt4.getLeft() - ((ViewGroup.MarginLayoutParams) c1179c2).leftMargin;
                    i4 = this.f13913l;
                    right = left - i4;
                } else {
                    right = childAt4.getRight() + ((ViewGroup.MarginLayoutParams) c1179c2).rightMargin;
                }
            } else if (a3) {
                right = getPaddingLeft();
            } else {
                left = getWidth() - getPaddingRight();
                i4 = this.f13913l;
                right = left - i4;
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
    public void onLayout(boolean z, int i4, int i5, int i6, int i7) {
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        char c4;
        int i17;
        int i18;
        int i19;
        int i20 = 8;
        char c5 = 2;
        if (this.f13905d == 1) {
            int paddingLeft = getPaddingLeft();
            int i21 = i6 - i4;
            int paddingRight = i21 - getPaddingRight();
            int paddingRight2 = (i21 - paddingLeft) - getPaddingRight();
            int virtualChildCount = getVirtualChildCount();
            int i22 = this.f13906e;
            int i23 = i22 & 112;
            int i24 = 8388615 & i22;
            int paddingTop = i23 != 16 ? i23 != 80 ? getPaddingTop() : ((getPaddingTop() + i7) - i5) - this.f13907f : getPaddingTop() + (((i7 - i5) - this.f13907f) / 2);
            int i25 = 0;
            while (i25 < virtualChildCount) {
                View childAt = getChildAt(i25);
                if (childAt == null || childAt.getVisibility() == i20) {
                    c4 = c5;
                } else {
                    int measuredWidth = childAt.getMeasuredWidth();
                    int measuredHeight = childAt.getMeasuredHeight();
                    C1179C c1179c = (C1179C) childAt.getLayoutParams();
                    c4 = c5;
                    int i26 = c1179c.f13901b;
                    if (i26 < 0) {
                        i26 = i24;
                    }
                    Field field = E.H.f375a;
                    int absoluteGravity = Gravity.getAbsoluteGravity(i26, getLayoutDirection()) & 7;
                    if (absoluteGravity == 1) {
                        i17 = ((paddingRight2 - measuredWidth) / 2) + paddingLeft + ((ViewGroup.MarginLayoutParams) c1179c).leftMargin;
                        i18 = ((ViewGroup.MarginLayoutParams) c1179c).rightMargin;
                    } else if (absoluteGravity != 5) {
                        i19 = ((ViewGroup.MarginLayoutParams) c1179c).leftMargin + paddingLeft;
                        if (g(i25)) {
                            paddingTop += this.f13914m;
                        }
                        int i27 = paddingTop + ((ViewGroup.MarginLayoutParams) c1179c).topMargin;
                        childAt.layout(i19, i27, measuredWidth + i19, i27 + measuredHeight);
                        paddingTop = measuredHeight + ((ViewGroup.MarginLayoutParams) c1179c).bottomMargin + i27;
                    } else {
                        i17 = paddingRight - measuredWidth;
                        i18 = ((ViewGroup.MarginLayoutParams) c1179c).rightMargin;
                    }
                    i19 = i17 - i18;
                    if (g(i25)) {
                    }
                    int i272 = paddingTop + ((ViewGroup.MarginLayoutParams) c1179c).topMargin;
                    childAt.layout(i19, i272, measuredWidth + i19, i272 + measuredHeight);
                    paddingTop = measuredHeight + ((ViewGroup.MarginLayoutParams) c1179c).bottomMargin + i272;
                }
                i25++;
                c5 = c4;
                i20 = 8;
            }
            return;
        }
        boolean a3 = t0.a(this);
        int paddingTop2 = getPaddingTop();
        int i28 = i7 - i5;
        int paddingBottom = i28 - getPaddingBottom();
        int paddingBottom2 = (i28 - paddingTop2) - getPaddingBottom();
        int virtualChildCount2 = getVirtualChildCount();
        int i29 = this.f13906e;
        int i30 = 8388615 & i29;
        int i31 = i29 & 112;
        boolean z4 = this.f13902a;
        int[] iArr = this.f13910i;
        int[] iArr2 = this.f13911j;
        Field field2 = E.H.f375a;
        int absoluteGravity2 = Gravity.getAbsoluteGravity(i30, getLayoutDirection());
        int paddingLeft2 = absoluteGravity2 != 1 ? absoluteGravity2 != 5 ? getPaddingLeft() : ((getPaddingLeft() + i6) - i4) - this.f13907f : getPaddingLeft() + (((i6 - i4) - this.f13907f) / 2);
        if (a3) {
            i9 = virtualChildCount2 - 1;
            i8 = -1;
        } else {
            i8 = 1;
            i9 = 0;
        }
        int i32 = 0;
        while (i32 < virtualChildCount2) {
            int i33 = (i8 * i32) + i9;
            View childAt2 = getChildAt(i33);
            if (childAt2 == null) {
                i10 = i9;
            } else {
                i10 = i9;
                if (childAt2.getVisibility() != 8) {
                    int measuredWidth2 = childAt2.getMeasuredWidth();
                    int measuredHeight2 = childAt2.getMeasuredHeight();
                    C1179C c1179c2 = (C1179C) childAt2.getLayoutParams();
                    int i34 = paddingLeft2;
                    if (z4) {
                        i11 = paddingTop2;
                        if (((ViewGroup.MarginLayoutParams) c1179c2).height != -1) {
                            i12 = childAt2.getBaseline();
                            i13 = c1179c2.f13901b;
                            if (i13 < 0) {
                                i13 = i31;
                            }
                            i14 = i13 & 112;
                            if (i14 == 16) {
                                if (i14 == 48) {
                                    i15 = i11 + ((ViewGroup.MarginLayoutParams) c1179c2).topMargin;
                                    if (i12 != -1) {
                                        i15 = (iArr[1] - i12) + i15;
                                    }
                                } else if (i14 != 80) {
                                    i15 = i11;
                                } else {
                                    i15 = (paddingBottom - measuredHeight2) - ((ViewGroup.MarginLayoutParams) c1179c2).bottomMargin;
                                    if (i12 != -1) {
                                        i16 = iArr2[2] - (childAt2.getMeasuredHeight() - i12);
                                    }
                                }
                                int i35 = (g(i33) ? i34 + this.f13913l : i34) + ((ViewGroup.MarginLayoutParams) c1179c2).leftMargin;
                                childAt2.layout(i35, i15, i35 + measuredWidth2, i15 + measuredHeight2);
                                paddingLeft2 = measuredWidth2 + ((ViewGroup.MarginLayoutParams) c1179c2).rightMargin + i35;
                                i32++;
                                i9 = i10;
                                paddingTop2 = i11;
                            } else {
                                i15 = ((paddingBottom2 - measuredHeight2) / 2) + i11 + ((ViewGroup.MarginLayoutParams) c1179c2).topMargin;
                                i16 = ((ViewGroup.MarginLayoutParams) c1179c2).bottomMargin;
                            }
                            i15 -= i16;
                            int i352 = (g(i33) ? i34 + this.f13913l : i34) + ((ViewGroup.MarginLayoutParams) c1179c2).leftMargin;
                            childAt2.layout(i352, i15, i352 + measuredWidth2, i15 + measuredHeight2);
                            paddingLeft2 = measuredWidth2 + ((ViewGroup.MarginLayoutParams) c1179c2).rightMargin + i352;
                            i32++;
                            i9 = i10;
                            paddingTop2 = i11;
                        }
                    } else {
                        i11 = paddingTop2;
                    }
                    i12 = -1;
                    i13 = c1179c2.f13901b;
                    if (i13 < 0) {
                    }
                    i14 = i13 & 112;
                    if (i14 == 16) {
                    }
                    i15 -= i16;
                    int i3522 = (g(i33) ? i34 + this.f13913l : i34) + ((ViewGroup.MarginLayoutParams) c1179c2).leftMargin;
                    childAt2.layout(i3522, i15, i3522 + measuredWidth2, i15 + measuredHeight2);
                    paddingLeft2 = measuredWidth2 + ((ViewGroup.MarginLayoutParams) c1179c2).rightMargin + i3522;
                    i32++;
                    i9 = i10;
                    paddingTop2 = i11;
                }
            }
            i11 = paddingTop2;
            i32++;
            i9 = i10;
            paddingTop2 = i11;
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
    public void onMeasure(int i4, int i5) {
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        boolean z;
        int baseline;
        int i12;
        int i13;
        int[] iArr;
        int i14;
        int i15;
        boolean z4;
        boolean z5;
        C1179C c1179c;
        int i16;
        int[] iArr2;
        int i17;
        View view;
        int i18;
        boolean z6;
        boolean z7;
        int max;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        int i24;
        int i25;
        int i26;
        int i27;
        float f4;
        int i28;
        int i29;
        boolean z8;
        View view2;
        boolean z9;
        AbstractC1180D abstractC1180D = this;
        int i30 = 0;
        int i31 = 1073741824;
        int i32 = 8;
        if (abstractC1180D.f13905d == 1) {
            abstractC1180D.f13907f = 0;
            int virtualChildCount = abstractC1180D.getVirtualChildCount();
            int mode = View.MeasureSpec.getMode(i4);
            int mode2 = View.MeasureSpec.getMode(i5);
            int i33 = abstractC1180D.f13903b;
            boolean z10 = abstractC1180D.f13909h;
            int i34 = 0;
            int i35 = 0;
            int i36 = 0;
            boolean z11 = false;
            int i37 = 0;
            boolean z12 = false;
            boolean z13 = true;
            float f5 = 0.0f;
            int i38 = 0;
            while (i34 < virtualChildCount) {
                int i39 = mode;
                View childAt = abstractC1180D.getChildAt(i34);
                if (childAt == null) {
                    abstractC1180D.f13907f = abstractC1180D.f13907f;
                } else if (childAt.getVisibility() != i32) {
                    if (abstractC1180D.g(i34)) {
                        abstractC1180D.f13907f += abstractC1180D.f13914m;
                    }
                    C1179C c1179c2 = (C1179C) childAt.getLayoutParams();
                    float f6 = c1179c2.f13900a;
                    f5 += f6;
                    if (mode2 == i31 && ((ViewGroup.MarginLayoutParams) c1179c2).height == 0 && f6 > 0.0f) {
                        int i40 = abstractC1180D.f13907f;
                        abstractC1180D.f13907f = Math.max(i40, ((ViewGroup.MarginLayoutParams) c1179c2).topMargin + i40 + ((ViewGroup.MarginLayoutParams) c1179c2).bottomMargin);
                        view2 = childAt;
                        i29 = mode2;
                        z8 = z10;
                        i26 = i34;
                        z11 = true;
                        i27 = i39;
                        f4 = f6;
                        i28 = i33;
                    } else {
                        if (((ViewGroup.MarginLayoutParams) c1179c2).height != 0 || f6 <= 0.0f) {
                            i23 = Integer.MIN_VALUE;
                        } else {
                            ((ViewGroup.MarginLayoutParams) c1179c2).height = -2;
                            i23 = 0;
                        }
                        if (f5 == 0.0f) {
                            i24 = i34;
                            i25 = abstractC1180D.f13907f;
                        } else {
                            i24 = i34;
                            i25 = 0;
                        }
                        i26 = i24;
                        i27 = i39;
                        f4 = f6;
                        i28 = i33;
                        i29 = mode2;
                        z8 = z10;
                        abstractC1180D.measureChildWithMargins(childAt, i4, 0, i5, i25);
                        if (i23 != Integer.MIN_VALUE) {
                            ((ViewGroup.MarginLayoutParams) c1179c2).height = i23;
                        }
                        int measuredHeight = childAt.getMeasuredHeight();
                        int i41 = abstractC1180D.f13907f;
                        view2 = childAt;
                        abstractC1180D.f13907f = Math.max(i41, i41 + measuredHeight + ((ViewGroup.MarginLayoutParams) c1179c2).topMargin + ((ViewGroup.MarginLayoutParams) c1179c2).bottomMargin);
                        if (z8) {
                            i38 = Math.max(measuredHeight, i38);
                        }
                    }
                    if (i28 >= 0 && i28 == i26 + 1) {
                        abstractC1180D.f13904c = abstractC1180D.f13907f;
                    }
                    if (i26 < i28 && f4 > 0.0f) {
                        throw new RuntimeException("A child of LinearLayout with index less than mBaselineAlignedChildIndex has weight > 0, which won't work.  Either remove the weight, or don't set mBaselineAlignedChildIndex.");
                    }
                    if (i27 == 1073741824 || ((ViewGroup.MarginLayoutParams) c1179c2).width != -1) {
                        z9 = false;
                    } else {
                        z9 = true;
                        z12 = true;
                    }
                    int i42 = ((ViewGroup.MarginLayoutParams) c1179c2).leftMargin + ((ViewGroup.MarginLayoutParams) c1179c2).rightMargin;
                    int measuredWidth = view2.getMeasuredWidth() + i42;
                    int max2 = Math.max(i30, measuredWidth);
                    int measuredState = view2.getMeasuredState();
                    boolean z14 = z9;
                    int combineMeasuredStates = View.combineMeasuredStates(i37, measuredState);
                    boolean z15 = z13 && ((ViewGroup.MarginLayoutParams) c1179c2).width == -1;
                    if (f4 > 0.0f) {
                        if (!z14) {
                            i42 = measuredWidth;
                        }
                        i36 = Math.max(i36, i42);
                    } else {
                        if (!z14) {
                            i42 = measuredWidth;
                        }
                        i35 = Math.max(i35, i42);
                    }
                    i37 = combineMeasuredStates;
                    z13 = z15;
                    i30 = max2;
                    i34 = i26 + 1;
                    mode = i27;
                    i33 = i28;
                    z10 = z8;
                    mode2 = i29;
                    i31 = 1073741824;
                    i32 = 8;
                }
                i29 = mode2;
                i28 = i33;
                z8 = z10;
                i26 = i34;
                i27 = i39;
                i34 = i26 + 1;
                mode = i27;
                i33 = i28;
                z10 = z8;
                mode2 = i29;
                i31 = 1073741824;
                i32 = 8;
            }
            int i43 = mode;
            int i44 = mode2;
            boolean z16 = z10;
            int i45 = i37;
            int i46 = i5;
            if (abstractC1180D.f13907f > 0 && abstractC1180D.g(virtualChildCount)) {
                abstractC1180D.f13907f += abstractC1180D.f13914m;
            }
            if (z16 && (i44 == Integer.MIN_VALUE || i44 == 0)) {
                abstractC1180D.f13907f = 0;
                for (int i47 = 0; i47 < virtualChildCount; i47++) {
                    View childAt2 = abstractC1180D.getChildAt(i47);
                    if (childAt2 == null) {
                        abstractC1180D.f13907f = abstractC1180D.f13907f;
                    } else if (childAt2.getVisibility() != 8) {
                        C1179C c1179c3 = (C1179C) childAt2.getLayoutParams();
                        int i48 = abstractC1180D.f13907f;
                        abstractC1180D.f13907f = Math.max(i48, i48 + i38 + ((ViewGroup.MarginLayoutParams) c1179c3).topMargin + ((ViewGroup.MarginLayoutParams) c1179c3).bottomMargin);
                    }
                }
            }
            int paddingBottom = abstractC1180D.getPaddingBottom() + abstractC1180D.getPaddingTop() + abstractC1180D.f13907f;
            abstractC1180D.f13907f = paddingBottom;
            int resolveSizeAndState = View.resolveSizeAndState(Math.max(paddingBottom, abstractC1180D.getSuggestedMinimumHeight()), i46, 0);
            int i49 = (resolveSizeAndState & 16777215) - abstractC1180D.f13907f;
            if (z11 || (i49 != 0 && f5 > 0.0f)) {
                float f7 = abstractC1180D.f13908g;
                if (f7 > 0.0f) {
                    f5 = f7;
                }
                abstractC1180D.f13907f = 0;
                int i50 = i45;
                int i51 = 0;
                while (i51 < virtualChildCount) {
                    View childAt3 = abstractC1180D.getChildAt(i51);
                    if (childAt3.getVisibility() == 8) {
                        i20 = i51;
                    } else {
                        C1179C c1179c4 = (C1179C) childAt3.getLayoutParams();
                        float f8 = c1179c4.f13900a;
                        if (f8 > 0.0f) {
                            int i52 = (int) ((i49 * f8) / f5);
                            f5 -= f8;
                            i49 -= i52;
                            i20 = i51;
                            int childMeasureSpec = ViewGroup.getChildMeasureSpec(i4, abstractC1180D.getPaddingRight() + abstractC1180D.getPaddingLeft() + ((ViewGroup.MarginLayoutParams) c1179c4).leftMargin + ((ViewGroup.MarginLayoutParams) c1179c4).rightMargin, ((ViewGroup.MarginLayoutParams) c1179c4).width);
                            if (((ViewGroup.MarginLayoutParams) c1179c4).height == 0) {
                                i22 = 1073741824;
                                if (i44 == 1073741824) {
                                    if (i52 <= 0) {
                                        i52 = 0;
                                    }
                                    childAt3.measure(childMeasureSpec, View.MeasureSpec.makeMeasureSpec(i52, 1073741824));
                                    i50 = View.combineMeasuredStates(i50, childAt3.getMeasuredState() & (-256));
                                }
                            } else {
                                i22 = 1073741824;
                            }
                            int measuredHeight2 = childAt3.getMeasuredHeight() + i52;
                            if (measuredHeight2 < 0) {
                                measuredHeight2 = 0;
                            }
                            childAt3.measure(childMeasureSpec, View.MeasureSpec.makeMeasureSpec(measuredHeight2, i22));
                            i50 = View.combineMeasuredStates(i50, childAt3.getMeasuredState() & (-256));
                        } else {
                            i20 = i51;
                        }
                        int i53 = ((ViewGroup.MarginLayoutParams) c1179c4).leftMargin + ((ViewGroup.MarginLayoutParams) c1179c4).rightMargin;
                        int measuredWidth2 = childAt3.getMeasuredWidth() + i53;
                        i30 = Math.max(i30, measuredWidth2);
                        if (i43 != 1073741824) {
                            i21 = -1;
                            if (((ViewGroup.MarginLayoutParams) c1179c4).width == -1) {
                                measuredWidth2 = i53;
                            }
                        } else {
                            i21 = -1;
                        }
                        i35 = Math.max(i35, measuredWidth2);
                        boolean z17 = z13 && ((ViewGroup.MarginLayoutParams) c1179c4).width == i21;
                        int i54 = abstractC1180D.f13907f;
                        abstractC1180D.f13907f = Math.max(i54, childAt3.getMeasuredHeight() + i54 + ((ViewGroup.MarginLayoutParams) c1179c4).topMargin + ((ViewGroup.MarginLayoutParams) c1179c4).bottomMargin);
                        z13 = z17;
                    }
                    i51 = i20 + 1;
                }
                abstractC1180D.f13907f = abstractC1180D.getPaddingBottom() + abstractC1180D.getPaddingTop() + abstractC1180D.f13907f;
                i45 = i50;
            } else {
                i35 = Math.max(i35, i36);
                if (z16 && i44 != 1073741824) {
                    for (int i55 = 0; i55 < virtualChildCount; i55++) {
                        View childAt4 = abstractC1180D.getChildAt(i55);
                        if (childAt4 != null && childAt4.getVisibility() != 8 && ((C1179C) childAt4.getLayoutParams()).f13900a > 0.0f) {
                            childAt4.measure(View.MeasureSpec.makeMeasureSpec(childAt4.getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(i38, 1073741824));
                        }
                    }
                }
            }
            if (z13 || i43 == 1073741824) {
                i35 = i30;
            }
            abstractC1180D.setMeasuredDimension(View.resolveSizeAndState(Math.max(abstractC1180D.getPaddingRight() + abstractC1180D.getPaddingLeft() + i35, abstractC1180D.getSuggestedMinimumWidth()), i4, i45), resolveSizeAndState);
            if (z12) {
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(abstractC1180D.getMeasuredWidth(), 1073741824);
                int i56 = 0;
                while (i56 < virtualChildCount) {
                    View childAt5 = abstractC1180D.getChildAt(i56);
                    if (childAt5.getVisibility() != 8) {
                        C1179C c1179c5 = (C1179C) childAt5.getLayoutParams();
                        if (((ViewGroup.MarginLayoutParams) c1179c5).width == -1) {
                            int i57 = ((ViewGroup.MarginLayoutParams) c1179c5).height;
                            ((ViewGroup.MarginLayoutParams) c1179c5).height = childAt5.getMeasuredHeight();
                            abstractC1180D.measureChildWithMargins(childAt5, makeMeasureSpec, 0, i46, 0);
                            ((ViewGroup.MarginLayoutParams) c1179c5).height = i57;
                        }
                    }
                    i56++;
                    i46 = i5;
                }
                return;
            }
            return;
        }
        int i58 = i4;
        abstractC1180D.f13907f = 0;
        int virtualChildCount2 = abstractC1180D.getVirtualChildCount();
        int mode3 = View.MeasureSpec.getMode(i58);
        int mode4 = View.MeasureSpec.getMode(i5);
        if (abstractC1180D.f13910i == null || abstractC1180D.f13911j == null) {
            abstractC1180D.f13910i = new int[4];
            abstractC1180D.f13911j = new int[4];
        }
        int[] iArr3 = abstractC1180D.f13910i;
        int[] iArr4 = abstractC1180D.f13911j;
        iArr3[3] = -1;
        char c4 = 2;
        iArr3[2] = -1;
        iArr3[1] = -1;
        iArr3[0] = -1;
        iArr4[3] = -1;
        iArr4[2] = -1;
        iArr4[1] = -1;
        iArr4[0] = -1;
        boolean z18 = abstractC1180D.f13902a;
        boolean z19 = abstractC1180D.f13909h;
        boolean z20 = mode3 == 1073741824;
        float f9 = 0.0f;
        boolean z21 = true;
        int i59 = 0;
        int i60 = 0;
        int i61 = 0;
        int i62 = 0;
        int i63 = 0;
        int i64 = 0;
        boolean z22 = false;
        boolean z23 = false;
        while (i59 < virtualChildCount2) {
            char c5 = c4;
            View childAt6 = abstractC1180D.getChildAt(i59);
            if (childAt6 == null) {
                abstractC1180D.f13907f = abstractC1180D.f13907f;
                i15 = i59;
                i19 = i61;
                iArr2 = iArr3;
                iArr = iArr4;
                z4 = z18;
                z5 = z19;
            } else {
                int i65 = i60;
                if (childAt6.getVisibility() == 8) {
                    i58 = i4;
                    i15 = i59;
                    i19 = i61;
                    iArr = iArr4;
                    z4 = z18;
                    z5 = z19;
                    i60 = i65;
                    iArr2 = iArr3;
                } else {
                    if (abstractC1180D.g(i59)) {
                        abstractC1180D.f13907f += abstractC1180D.f13913l;
                    }
                    C1179C c1179c6 = (C1179C) childAt6.getLayoutParams();
                    float f10 = c1179c6.f13900a;
                    f9 += f10;
                    int i66 = i59;
                    if (mode3 == 1073741824 && ((ViewGroup.MarginLayoutParams) c1179c6).width == 0 && f10 > 0.0f) {
                        if (z20) {
                            abstractC1180D.f13907f = ((ViewGroup.MarginLayoutParams) c1179c6).leftMargin + ((ViewGroup.MarginLayoutParams) c1179c6).rightMargin + abstractC1180D.f13907f;
                        } else {
                            int i67 = abstractC1180D.f13907f;
                            abstractC1180D.f13907f = Math.max(i67, ((ViewGroup.MarginLayoutParams) c1179c6).leftMargin + i67 + ((ViewGroup.MarginLayoutParams) c1179c6).rightMargin);
                        }
                        if (z18) {
                            int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 0);
                            childAt6.measure(makeMeasureSpec2, makeMeasureSpec2);
                            view = childAt6;
                            z4 = z18;
                            z5 = z19;
                            i16 = i65;
                            i15 = i66;
                            c1179c = c1179c6;
                            iArr2 = iArr3;
                            iArr = iArr4;
                            i58 = i4;
                            i17 = i61;
                            i14 = i62;
                        } else {
                            view = childAt6;
                            z4 = z18;
                            z5 = z19;
                            z23 = true;
                            i16 = i65;
                            i15 = i66;
                            i18 = 1073741824;
                            c1179c = c1179c6;
                            iArr2 = iArr3;
                            iArr = iArr4;
                            i58 = i4;
                            i17 = i61;
                            i14 = i62;
                            if (mode4 == i18 && ((ViewGroup.MarginLayoutParams) c1179c).height == -1) {
                                z6 = true;
                                z22 = true;
                            } else {
                                z6 = false;
                            }
                            int i68 = ((ViewGroup.MarginLayoutParams) c1179c).topMargin + ((ViewGroup.MarginLayoutParams) c1179c).bottomMargin;
                            int measuredHeight3 = view.getMeasuredHeight() + i68;
                            i64 = View.combineMeasuredStates(i64, view.getMeasuredState());
                            if (z4) {
                                z7 = z6;
                            } else {
                                int baseline2 = view.getBaseline();
                                z7 = z6;
                                if (baseline2 != -1) {
                                    int i69 = c1179c.f13901b;
                                    if (i69 < 0) {
                                        i69 = abstractC1180D.f13906e;
                                    }
                                    int i70 = (((i69 & 112) >> 4) & (-2)) >> 1;
                                    iArr2[i70] = Math.max(iArr2[i70], baseline2);
                                    iArr[i70] = Math.max(iArr[i70], measuredHeight3 - baseline2);
                                }
                            }
                            int max3 = Math.max(i16, measuredHeight3);
                            boolean z24 = !z21 && ((ViewGroup.MarginLayoutParams) c1179c).height == -1;
                            if (c1179c.f13900a <= 0.0f) {
                                if (!z7) {
                                    i68 = measuredHeight3;
                                }
                                i62 = Math.max(i14, i68);
                                max = i17;
                            } else {
                                if (!z7) {
                                    i68 = measuredHeight3;
                                }
                                max = Math.max(i17, i68);
                                i62 = i14;
                            }
                            int i71 = max;
                            i60 = max3;
                            i19 = i71;
                            z21 = z24;
                        }
                    } else {
                        if (((ViewGroup.MarginLayoutParams) c1179c6).width != 0 || f10 <= 0.0f) {
                            i13 = Integer.MIN_VALUE;
                        } else {
                            ((ViewGroup.MarginLayoutParams) c1179c6).width = -2;
                            i13 = 0;
                        }
                        iArr = iArr4;
                        i14 = i62;
                        i15 = i66;
                        z4 = z18;
                        z5 = z19;
                        int i72 = i13;
                        c1179c = c1179c6;
                        i16 = i65;
                        i58 = i4;
                        iArr2 = iArr3;
                        i17 = i61;
                        abstractC1180D.measureChildWithMargins(childAt6, i58, f9 == 0.0f ? abstractC1180D.f13907f : 0, i5, 0);
                        if (i72 != Integer.MIN_VALUE) {
                            ((ViewGroup.MarginLayoutParams) c1179c).width = i72;
                        }
                        int measuredWidth3 = childAt6.getMeasuredWidth();
                        if (z20) {
                            view = childAt6;
                            abstractC1180D.f13907f = ((ViewGroup.MarginLayoutParams) c1179c).leftMargin + measuredWidth3 + ((ViewGroup.MarginLayoutParams) c1179c).rightMargin + abstractC1180D.f13907f;
                        } else {
                            view = childAt6;
                            int i73 = abstractC1180D.f13907f;
                            abstractC1180D.f13907f = Math.max(i73, i73 + measuredWidth3 + ((ViewGroup.MarginLayoutParams) c1179c).leftMargin + ((ViewGroup.MarginLayoutParams) c1179c).rightMargin);
                        }
                        if (z5) {
                            i63 = Math.max(measuredWidth3, i63);
                        }
                    }
                    i18 = 1073741824;
                    if (mode4 == i18) {
                    }
                    z6 = false;
                    int i682 = ((ViewGroup.MarginLayoutParams) c1179c).topMargin + ((ViewGroup.MarginLayoutParams) c1179c).bottomMargin;
                    int measuredHeight32 = view.getMeasuredHeight() + i682;
                    i64 = View.combineMeasuredStates(i64, view.getMeasuredState());
                    if (z4) {
                    }
                    int max32 = Math.max(i16, measuredHeight32);
                    if (z21) {
                    }
                    if (c1179c.f13900a <= 0.0f) {
                    }
                    int i712 = max;
                    i60 = max32;
                    i19 = i712;
                    z21 = z24;
                }
            }
            i61 = i19;
            i59 = i15 + 1;
            c4 = c5;
            iArr3 = iArr2;
            iArr4 = iArr;
            z18 = z4;
            z19 = z5;
        }
        int[] iArr5 = iArr3;
        int[] iArr6 = iArr4;
        char c6 = c4;
        boolean z25 = z18;
        boolean z26 = z19;
        int i74 = i60;
        int i75 = i61;
        int i76 = i62;
        if (abstractC1180D.f13907f > 0 && abstractC1180D.g(virtualChildCount2)) {
            abstractC1180D.f13907f += abstractC1180D.f13913l;
        }
        int i77 = iArr5[1];
        int max4 = (i77 == -1 && iArr5[0] == -1 && iArr5[c6] == -1 && iArr5[3] == -1) ? i74 : Math.max(i74, Math.max(iArr6[3], Math.max(iArr6[0], Math.max(iArr6[1], iArr6[c6]))) + Math.max(iArr5[3], Math.max(iArr5[0], Math.max(i77, iArr5[c6]))));
        if (z26 && (mode3 == Integer.MIN_VALUE || mode3 == 0)) {
            abstractC1180D.f13907f = 0;
            for (int i78 = 0; i78 < virtualChildCount2; i78++) {
                View childAt7 = abstractC1180D.getChildAt(i78);
                if (childAt7 == null) {
                    abstractC1180D.f13907f = abstractC1180D.f13907f;
                } else if (childAt7.getVisibility() != 8) {
                    C1179C c1179c7 = (C1179C) childAt7.getLayoutParams();
                    if (z20) {
                        abstractC1180D.f13907f = ((ViewGroup.MarginLayoutParams) c1179c7).leftMargin + i63 + ((ViewGroup.MarginLayoutParams) c1179c7).rightMargin + abstractC1180D.f13907f;
                    } else {
                        int i79 = abstractC1180D.f13907f;
                        abstractC1180D.f13907f = Math.max(i79, i79 + i63 + ((ViewGroup.MarginLayoutParams) c1179c7).leftMargin + ((ViewGroup.MarginLayoutParams) c1179c7).rightMargin);
                    }
                }
            }
        }
        int paddingRight = abstractC1180D.getPaddingRight() + abstractC1180D.getPaddingLeft() + abstractC1180D.f13907f;
        abstractC1180D.f13907f = paddingRight;
        int resolveSizeAndState2 = View.resolveSizeAndState(Math.max(paddingRight, abstractC1180D.getSuggestedMinimumWidth()), i58, 0);
        int i80 = (resolveSizeAndState2 & 16777215) - abstractC1180D.f13907f;
        if (z23 || (i80 != 0 && f9 > 0.0f)) {
            float f11 = abstractC1180D.f13908g;
            if (f11 > 0.0f) {
                f9 = f11;
            }
            iArr5[3] = -1;
            iArr5[c6] = -1;
            iArr5[1] = -1;
            iArr5[0] = -1;
            iArr6[3] = -1;
            iArr6[c6] = -1;
            iArr6[1] = -1;
            iArr6[0] = -1;
            abstractC1180D.f13907f = 0;
            max4 = -1;
            int i81 = 0;
            while (i81 < virtualChildCount2) {
                View childAt8 = abstractC1180D.getChildAt(i81);
                if (childAt8 == null || childAt8.getVisibility() == 8) {
                    i10 = resolveSizeAndState2;
                } else {
                    C1179C c1179c8 = (C1179C) childAt8.getLayoutParams();
                    float f12 = c1179c8.f13900a;
                    if (f12 > 0.0f) {
                        int i82 = (int) ((i80 * f12) / f9);
                        f9 -= f12;
                        i80 -= i82;
                        i10 = resolveSizeAndState2;
                        int childMeasureSpec2 = ViewGroup.getChildMeasureSpec(i5, abstractC1180D.getPaddingBottom() + abstractC1180D.getPaddingTop() + ((ViewGroup.MarginLayoutParams) c1179c8).topMargin + ((ViewGroup.MarginLayoutParams) c1179c8).bottomMargin, ((ViewGroup.MarginLayoutParams) c1179c8).height);
                        if (((ViewGroup.MarginLayoutParams) c1179c8).width == 0) {
                            i12 = 1073741824;
                            if (mode3 == 1073741824) {
                                if (i82 <= 0) {
                                    i82 = 0;
                                }
                                childAt8.measure(View.MeasureSpec.makeMeasureSpec(i82, 1073741824), childMeasureSpec2);
                                i64 = View.combineMeasuredStates(i64, childAt8.getMeasuredState() & (-16777216));
                            }
                        } else {
                            i12 = 1073741824;
                        }
                        int measuredWidth4 = childAt8.getMeasuredWidth() + i82;
                        if (measuredWidth4 < 0) {
                            measuredWidth4 = 0;
                        }
                        childAt8.measure(View.MeasureSpec.makeMeasureSpec(measuredWidth4, i12), childMeasureSpec2);
                        i64 = View.combineMeasuredStates(i64, childAt8.getMeasuredState() & (-16777216));
                    } else {
                        i10 = resolveSizeAndState2;
                    }
                    if (z20) {
                        abstractC1180D.f13907f = childAt8.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) c1179c8).leftMargin + ((ViewGroup.MarginLayoutParams) c1179c8).rightMargin + abstractC1180D.f13907f;
                    } else {
                        int i83 = abstractC1180D.f13907f;
                        abstractC1180D.f13907f = Math.max(i83, childAt8.getMeasuredWidth() + i83 + ((ViewGroup.MarginLayoutParams) c1179c8).leftMargin + ((ViewGroup.MarginLayoutParams) c1179c8).rightMargin);
                    }
                    boolean z27 = mode4 != 1073741824 && ((ViewGroup.MarginLayoutParams) c1179c8).height == -1;
                    int i84 = ((ViewGroup.MarginLayoutParams) c1179c8).topMargin + ((ViewGroup.MarginLayoutParams) c1179c8).bottomMargin;
                    int measuredHeight4 = childAt8.getMeasuredHeight() + i84;
                    max4 = Math.max(max4, measuredHeight4);
                    if (!z27) {
                        i84 = measuredHeight4;
                    }
                    int max5 = Math.max(i75, i84);
                    if (z21) {
                        i11 = -1;
                        if (((ViewGroup.MarginLayoutParams) c1179c8).height == -1) {
                            z = true;
                            if (!z25 && (baseline = childAt8.getBaseline()) != i11) {
                                int i85 = c1179c8.f13901b;
                                if (i85 < 0) {
                                    i85 = abstractC1180D.f13906e;
                                }
                                int i86 = (((i85 & 112) >> 4) & (-2)) >> 1;
                                iArr5[i86] = Math.max(iArr5[i86], baseline);
                                iArr6[i86] = Math.max(iArr6[i86], measuredHeight4 - baseline);
                            }
                            z21 = z;
                            i75 = max5;
                        }
                    } else {
                        i11 = -1;
                    }
                    z = false;
                    if (!z25) {
                    }
                    z21 = z;
                    i75 = max5;
                }
                i81++;
                resolveSizeAndState2 = i10;
            }
            i6 = resolveSizeAndState2;
            i7 = -16777216;
            abstractC1180D.f13907f = abstractC1180D.getPaddingRight() + abstractC1180D.getPaddingLeft() + abstractC1180D.f13907f;
            int i87 = iArr5[1];
            if (i87 == -1 && iArr5[0] == -1 && iArr5[c6] == -1 && iArr5[3] == -1) {
                i8 = 0;
            } else {
                i8 = 0;
                max4 = Math.max(max4, Math.max(iArr6[3], Math.max(iArr6[0], Math.max(iArr6[1], iArr6[c6]))) + Math.max(iArr5[3], Math.max(iArr5[0], Math.max(i87, iArr5[c6]))));
            }
            i9 = i75;
        } else {
            i9 = Math.max(i75, i76);
            if (z26 && mode3 != 1073741824) {
                for (int i88 = 0; i88 < virtualChildCount2; i88++) {
                    View childAt9 = abstractC1180D.getChildAt(i88);
                    if (childAt9 != null && childAt9.getVisibility() != 8 && ((C1179C) childAt9.getLayoutParams()).f13900a > 0.0f) {
                        childAt9.measure(View.MeasureSpec.makeMeasureSpec(i63, 1073741824), View.MeasureSpec.makeMeasureSpec(childAt9.getMeasuredHeight(), 1073741824));
                    }
                }
            }
            i6 = resolveSizeAndState2;
            i7 = -16777216;
            i8 = 0;
        }
        if (!z21 && mode4 != 1073741824) {
            max4 = i9;
        }
        abstractC1180D.setMeasuredDimension(i6 | (i64 & i7), View.resolveSizeAndState(Math.max(abstractC1180D.getPaddingBottom() + abstractC1180D.getPaddingTop() + max4, abstractC1180D.getSuggestedMinimumHeight()), i5, i64 << 16));
        if (z22) {
            int makeMeasureSpec3 = View.MeasureSpec.makeMeasureSpec(abstractC1180D.getMeasuredHeight(), 1073741824);
            int i89 = i8;
            while (i89 < virtualChildCount2) {
                View childAt10 = abstractC1180D.getChildAt(i89);
                if (childAt10.getVisibility() != 8) {
                    C1179C c1179c9 = (C1179C) childAt10.getLayoutParams();
                    if (((ViewGroup.MarginLayoutParams) c1179c9).height == -1) {
                        int i90 = ((ViewGroup.MarginLayoutParams) c1179c9).width;
                        ((ViewGroup.MarginLayoutParams) c1179c9).width = childAt10.getMeasuredWidth();
                        abstractC1180D.measureChildWithMargins(childAt10, i58, 0, makeMeasureSpec3, 0);
                        ((ViewGroup.MarginLayoutParams) c1179c9).width = i90;
                    }
                }
                i89++;
                abstractC1180D = this;
                i58 = i4;
            }
        }
    }

    public void setBaselineAligned(boolean z) {
        this.f13902a = z;
    }

    public void setBaselineAlignedChildIndex(int i4) {
        if (i4 >= 0 && i4 < getChildCount()) {
            this.f13903b = i4;
            return;
        }
        throw new IllegalArgumentException("base aligned child index out of range (0, " + getChildCount() + ")");
    }

    public void setDividerDrawable(Drawable drawable) {
        if (drawable == this.f13912k) {
            return;
        }
        this.f13912k = drawable;
        if (drawable != null) {
            this.f13913l = drawable.getIntrinsicWidth();
            this.f13914m = drawable.getIntrinsicHeight();
        } else {
            this.f13913l = 0;
            this.f13914m = 0;
        }
        setWillNotDraw(drawable == null);
        requestLayout();
    }

    public void setDividerPadding(int i4) {
        this.o = i4;
    }

    public void setGravity(int i4) {
        if (this.f13906e != i4) {
            if ((8388615 & i4) == 0) {
                i4 |= 8388611;
            }
            if ((i4 & 112) == 0) {
                i4 |= 48;
            }
            this.f13906e = i4;
            requestLayout();
        }
    }

    public void setHorizontalGravity(int i4) {
        int i5 = i4 & 8388615;
        int i6 = this.f13906e;
        if ((8388615 & i6) != i5) {
            this.f13906e = i5 | ((-8388616) & i6);
            requestLayout();
        }
    }

    public void setMeasureWithLargestChildEnabled(boolean z) {
        this.f13909h = z;
    }

    public void setOrientation(int i4) {
        if (this.f13905d != i4) {
            this.f13905d = i4;
            requestLayout();
        }
    }

    public void setShowDividers(int i4) {
        if (i4 != this.n) {
            requestLayout();
        }
        this.n = i4;
    }

    public void setVerticalGravity(int i4) {
        int i5 = i4 & 112;
        int i6 = this.f13906e;
        if ((i6 & 112) != i5) {
            this.f13906e = i5 | (i6 & (-113));
            requestLayout();
        }
    }

    public void setWeightSum(float f4) {
        this.f13908g = Math.max(0.0f, f4);
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }
}
