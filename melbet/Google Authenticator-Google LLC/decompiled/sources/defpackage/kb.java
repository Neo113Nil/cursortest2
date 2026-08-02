package defpackage;

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

/* compiled from: PG */
/* loaded from: classes2.dex */
public class kb extends ViewGroup {
    private boolean a;
    private int b;
    private int c;
    private int d;
    private int e;
    public int f;
    public Drawable g;
    public int h;
    private float i;
    private boolean j;
    private int[] k;
    private int[] l;
    private int m;
    private int n;
    private int o;

    public kb(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.a = true;
        this.b = -1;
        this.c = 0;
        this.f = 8388659;
        int[] iArr = em.o;
        byo u = byo.u(context, attributeSet, iArr, i, 0);
        yq.k(this, context, iArr, attributeSet, (TypedArray) u.a, i, 0);
        int e = u.e(1, -1);
        if (e >= 0) {
            r(e);
        }
        int e2 = u.e(0, -1);
        if (e2 >= 0 && this.f != e2) {
            e2 = (8388615 & e2) == 0 ? e2 | 8388611 : e2;
            this.f = (e2 & 112) == 0 ? e2 | 48 : e2;
            requestLayout();
        }
        if (!u.o(2, true)) {
            t();
        }
        this.i = ((TypedArray) u.a).getFloat(4, -1.0f);
        this.b = u.e(3, -1);
        this.j = u.o(7, false);
        Drawable j = u.j(5);
        if (j != this.g) {
            this.g = j;
            if (j != null) {
                this.h = j.getIntrinsicWidth();
                this.m = j.getIntrinsicHeight();
            } else {
                this.h = 0;
                this.m = 0;
            }
            setWillNotDraw(j == null);
            requestLayout();
        }
        this.n = u.e(8, 0);
        this.o = u.d(6, 0);
        u.n();
    }

    @Override // android.view.ViewGroup
    /* renamed from: bH, reason: merged with bridge method [inline-methods] */
    public ka generateLayoutParams(AttributeSet attributeSet) {
        return new ka(getContext(), attributeSet);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.ViewGroup
    /* renamed from: bI, reason: merged with bridge method [inline-methods] */
    public ka generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof ka ? new ka((ViewGroup.MarginLayoutParams) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new ka((ViewGroup.MarginLayoutParams) layoutParams) : new ka(layoutParams);
    }

    @Override // android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof ka;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.ViewGroup
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public ka generateDefaultLayoutParams() {
        int i = this.d;
        if (i == 0) {
            return new ka(-2);
        }
        if (i == 1) {
            return new ka(-1);
        }
        return null;
    }

    @Override // android.view.View
    public final int getBaseline() {
        int i;
        if (this.b < 0) {
            return super.getBaseline();
        }
        int childCount = getChildCount();
        int i2 = this.b;
        if (childCount <= i2) {
            throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout set to an index that is out of bounds.");
        }
        View childAt = getChildAt(i2);
        int baseline = childAt.getBaseline();
        if (baseline == -1) {
            if (this.b == 0) {
                return -1;
            }
            throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout points to a View that doesn't know how to get its baseline.");
        }
        int i3 = this.c;
        if (this.d == 1 && (i = this.f & 112) != 48) {
            if (i == 16) {
                i3 += ((((getBottom() - getTop()) - getPaddingTop()) - getPaddingBottom()) - this.e) / 2;
            } else if (i == 80) {
                i3 = ((getBottom() - getTop()) - getPaddingBottom()) - this.e;
            }
        }
        return i3 + ((ka) childAt.getLayoutParams()).topMargin + baseline;
    }

    @Override // android.view.View
    protected final void onDraw(Canvas canvas) {
        int right;
        int left;
        int i;
        if (this.g == null) {
            return;
        }
        int i2 = 0;
        if (this.d == 1) {
            int childCount = getChildCount();
            while (i2 < childCount) {
                View childAt = getChildAt(i2);
                if (childAt != null && childAt.getVisibility() != 8 && s(i2)) {
                    p(canvas, (childAt.getTop() - ((ka) childAt.getLayoutParams()).topMargin) - this.m);
                }
                i2++;
            }
            if (s(childCount)) {
                View childAt2 = getChildAt(childCount - 1);
                p(canvas, childAt2 == null ? (getHeight() - getPaddingBottom()) - this.m : childAt2.getBottom() + ((ka) childAt2.getLayoutParams()).bottomMargin);
                return;
            }
            return;
        }
        int childCount2 = getChildCount();
        boolean v = kt.v(this);
        while (i2 < childCount2) {
            View childAt3 = getChildAt(i2);
            if (childAt3 != null && childAt3.getVisibility() != 8 && s(i2)) {
                ka kaVar = (ka) childAt3.getLayoutParams();
                q(canvas, v ? childAt3.getRight() + kaVar.rightMargin : (childAt3.getLeft() - kaVar.leftMargin) - this.h);
            }
            i2++;
        }
        if (s(childCount2)) {
            View childAt4 = getChildAt(childCount2 - 1);
            if (childAt4 != null) {
                ka kaVar2 = (ka) childAt4.getLayoutParams();
                if (v) {
                    left = childAt4.getLeft() - kaVar2.leftMargin;
                    i = this.h;
                    right = left - i;
                } else {
                    right = childAt4.getRight() + kaVar2.rightMargin;
                }
            } else if (v) {
                right = getPaddingLeft();
            } else {
                left = getWidth() - getPaddingRight();
                i = this.h;
                right = left - i;
            }
            q(canvas, right);
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName("android.support.v7.widget.LinearLayoutCompat");
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.support.v7.widget.LinearLayoutCompat");
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0181  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
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
        char c;
        int i15;
        int i16;
        int i17;
        int i18 = 8;
        char c2 = 2;
        if (this.d == 1) {
            int i19 = i3 - i;
            int paddingLeft = getPaddingLeft();
            int paddingRight = i19 - getPaddingRight();
            int paddingRight2 = (i19 - paddingLeft) - getPaddingRight();
            int childCount = getChildCount();
            int i20 = this.f;
            int i21 = i20 & 112;
            int i22 = 8388615 & i20;
            int paddingTop = i21 != 16 ? i21 != 80 ? getPaddingTop() : ((getPaddingTop() + i4) - i2) - this.e : (((i4 - i2) - this.e) / 2) + getPaddingTop();
            int i23 = 0;
            while (i23 < childCount) {
                View childAt = getChildAt(i23);
                if (childAt == null || childAt.getVisibility() == i18) {
                    c = c2;
                } else {
                    int measuredWidth = childAt.getMeasuredWidth();
                    int measuredHeight = childAt.getMeasuredHeight();
                    ka kaVar = (ka) childAt.getLayoutParams();
                    c = c2;
                    int i24 = kaVar.gravity;
                    if (i24 < 0) {
                        i24 = i22;
                    }
                    int absoluteGravity = Gravity.getAbsoluteGravity(i24, getLayoutDirection()) & 7;
                    if (absoluteGravity == 1) {
                        i15 = ((paddingRight2 - measuredWidth) / 2) + paddingLeft + kaVar.leftMargin;
                        i16 = kaVar.rightMargin;
                    } else if (absoluteGravity != 5) {
                        i17 = kaVar.leftMargin + paddingLeft;
                        if (s(i23)) {
                            paddingTop += this.m;
                        }
                        int i25 = paddingTop + kaVar.topMargin;
                        childAt.layout(i17, i25, measuredWidth + i17, i25 + measuredHeight);
                        paddingTop = i25 + measuredHeight + kaVar.bottomMargin;
                    } else {
                        i15 = paddingRight - measuredWidth;
                        i16 = kaVar.rightMargin;
                    }
                    i17 = i15 - i16;
                    if (s(i23)) {
                    }
                    int i252 = paddingTop + kaVar.topMargin;
                    childAt.layout(i17, i252, measuredWidth + i17, i252 + measuredHeight);
                    paddingTop = i252 + measuredHeight + kaVar.bottomMargin;
                }
                i23++;
                c2 = c;
                i18 = 8;
            }
            return;
        }
        int i26 = i4 - i2;
        boolean v = kt.v(this);
        int paddingTop2 = getPaddingTop();
        int paddingBottom = i26 - getPaddingBottom();
        int paddingBottom2 = (i26 - paddingTop2) - getPaddingBottom();
        int childCount2 = getChildCount();
        int i27 = this.f;
        int i28 = 8388615 & i27;
        int i29 = i27 & 112;
        boolean z2 = this.a;
        int[] iArr = this.k;
        int[] iArr2 = this.l;
        int absoluteGravity2 = Gravity.getAbsoluteGravity(i28, getLayoutDirection());
        int paddingLeft2 = absoluteGravity2 != 1 ? absoluteGravity2 != 5 ? getPaddingLeft() : ((getPaddingLeft() + i3) - i) - this.e : (((i3 - i) - this.e) / 2) + getPaddingLeft();
        if (v) {
            i6 = childCount2 - 1;
            i5 = -1;
        } else {
            i5 = 1;
            i6 = 0;
        }
        int i30 = 0;
        while (i30 < childCount2) {
            int i31 = i6 + (i5 * i30);
            View childAt2 = getChildAt(i31);
            if (childAt2 != null) {
                i7 = paddingBottom2;
                if (childAt2.getVisibility() != 8) {
                    int measuredWidth2 = childAt2.getMeasuredWidth();
                    int measuredHeight2 = childAt2.getMeasuredHeight();
                    ka kaVar2 = (ka) childAt2.getLayoutParams();
                    if (z2) {
                        i8 = i6;
                        i9 = paddingLeft2;
                        if (kaVar2.height != -1) {
                            i10 = childAt2.getBaseline();
                            i11 = kaVar2.gravity;
                            if (i11 < 0) {
                                i11 = i29;
                            }
                            i12 = i11 & 112;
                            if (i12 == 16) {
                                if (i12 == 48) {
                                    i13 = kaVar2.topMargin + paddingTop2;
                                    if (i10 != -1) {
                                        i13 += iArr[1] - i10;
                                    }
                                } else if (i12 != 80) {
                                    i13 = paddingTop2;
                                } else {
                                    i13 = (paddingBottom - measuredHeight2) - kaVar2.bottomMargin;
                                    if (i10 != -1) {
                                        i14 = iArr2[2] - (childAt2.getMeasuredHeight() - i10);
                                    }
                                }
                                int i32 = (s(i31) ? i9 + this.h : i9) + kaVar2.leftMargin;
                                childAt2.layout(i32, i13, i32 + measuredWidth2, i13 + measuredHeight2);
                                paddingLeft2 = i32 + measuredWidth2 + kaVar2.rightMargin;
                                i30++;
                                paddingBottom2 = i7;
                                i6 = i8;
                            } else {
                                i13 = ((i7 - measuredHeight2) / 2) + paddingTop2 + kaVar2.topMargin;
                                i14 = kaVar2.bottomMargin;
                            }
                            i13 -= i14;
                            int i322 = (s(i31) ? i9 + this.h : i9) + kaVar2.leftMargin;
                            childAt2.layout(i322, i13, i322 + measuredWidth2, i13 + measuredHeight2);
                            paddingLeft2 = i322 + measuredWidth2 + kaVar2.rightMargin;
                            i30++;
                            paddingBottom2 = i7;
                            i6 = i8;
                        }
                    } else {
                        i8 = i6;
                        i9 = paddingLeft2;
                    }
                    i10 = -1;
                    i11 = kaVar2.gravity;
                    if (i11 < 0) {
                    }
                    i12 = i11 & 112;
                    if (i12 == 16) {
                    }
                    i13 -= i14;
                    int i3222 = (s(i31) ? i9 + this.h : i9) + kaVar2.leftMargin;
                    childAt2.layout(i3222, i13, i3222 + measuredWidth2, i13 + measuredHeight2);
                    paddingLeft2 = i3222 + measuredWidth2 + kaVar2.rightMargin;
                    i30++;
                    paddingBottom2 = i7;
                    i6 = i8;
                }
            } else {
                i7 = paddingBottom2;
            }
            i8 = i6;
            paddingLeft2 = paddingLeft2;
            i30++;
            paddingBottom2 = i7;
            i6 = i8;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:153:0x02ae, code lost:
    
        if (r10.width == (-1)) goto L143;
     */
    /* JADX WARN: Removed duplicated region for block: B:216:0x04de  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x051c  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x0523  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x0529  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x0509  */
    /* JADX WARN: Removed duplicated region for block: B:280:0x05c7  */
    /* JADX WARN: Removed duplicated region for block: B:325:0x07fc  */
    /* JADX WARN: Removed duplicated region for block: B:329:0x0822  */
    /* JADX WARN: Removed duplicated region for block: B:343:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:347:0x067e  */
    /* JADX WARN: Removed duplicated region for block: B:350:0x069b  */
    /* JADX WARN: Removed duplicated region for block: B:385:0x0773  */
    /* JADX WARN: Removed duplicated region for block: B:387:0x0776  */
    /* JADX WARN: Removed duplicated region for block: B:408:0x07b6  */
    /* JADX WARN: Removed duplicated region for block: B:419:0x060b  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected void onMeasure(int i, int i2) {
        int[] iArr;
        int[] iArr2;
        int max;
        int i3;
        boolean z;
        float f;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        boolean z2;
        int baseline;
        int i13;
        int i14;
        int[] iArr3;
        int i15;
        int[] iArr4;
        int i16;
        int i17;
        boolean z3;
        boolean z4;
        int i18;
        boolean z5;
        int i19;
        char c;
        ka kaVar;
        int i20;
        int i21;
        int i22;
        int i23;
        ka kaVar2;
        View view;
        boolean z6;
        boolean z7;
        boolean z8;
        int i24;
        int max2;
        int[] iArr5;
        int i25;
        boolean z9;
        int i26;
        int i27;
        int i28;
        char c2;
        int i29;
        int i30;
        int i31;
        boolean z10;
        int i32;
        int i33;
        int i34;
        boolean z11;
        kb kbVar = this;
        int i35 = -2;
        char c3 = 0;
        int i36 = 8;
        int i37 = 1073741824;
        if (kbVar.d == 1) {
            kbVar.e = 0;
            int childCount = kbVar.getChildCount();
            int mode = View.MeasureSpec.getMode(i);
            int mode2 = View.MeasureSpec.getMode(i2);
            int i38 = kbVar.b;
            boolean z12 = kbVar.j;
            int i39 = 0;
            int i40 = 0;
            int i41 = 0;
            boolean z13 = false;
            boolean z14 = false;
            int i42 = 0;
            int i43 = 0;
            boolean z15 = true;
            float f2 = 0.0f;
            int i44 = 0;
            while (i39 < childCount) {
                int i45 = mode;
                View childAt = kbVar.getChildAt(i39);
                if (childAt == null || childAt.getVisibility() == i36) {
                    i31 = mode2;
                    i32 = i38;
                    z10 = z12;
                    i33 = i39;
                    i34 = i45;
                    i43 = i43;
                    i42 = i42;
                } else {
                    if (kbVar.s(i39)) {
                        kbVar.e += kbVar.m;
                    }
                    ka kaVar3 = (ka) childAt.getLayoutParams();
                    f2 += kaVar3.weight;
                    if (mode2 == i37 && kaVar3.height == 0 && kaVar3.weight > 0.0f) {
                        int i46 = kbVar.e;
                        kbVar.e = Math.max(i46, kaVar3.topMargin + i46 + kaVar3.bottomMargin);
                        i31 = mode2;
                        i32 = i38;
                        z10 = z12;
                        i33 = i39;
                        i34 = i45;
                        z13 = true;
                    } else {
                        if (kaVar3.height != 0 || kaVar3.weight <= 0.0f) {
                            c2 = c3;
                        } else {
                            kaVar3.height = i35;
                            c2 = 0;
                        }
                        if (f2 == 0.0f) {
                            i29 = i39;
                            i30 = kbVar.e;
                        } else {
                            i29 = i39;
                            i30 = 0;
                        }
                        i31 = mode2;
                        z10 = z12;
                        i32 = i38;
                        i33 = i29;
                        i34 = i45;
                        kbVar.measureChildWithMargins(childAt, i, 0, i2, i30);
                        if (c2 != c3) {
                            kaVar3.height = 0;
                        }
                        int measuredHeight = childAt.getMeasuredHeight();
                        int i47 = kbVar.e;
                        kbVar.e = Math.max(i47, i47 + measuredHeight + kaVar3.topMargin + kaVar3.bottomMargin);
                        if (z10) {
                            i44 = Math.max(measuredHeight, i44);
                        }
                    }
                    if (i32 >= 0 && i32 == i33 + 1) {
                        kbVar.c = kbVar.e;
                    }
                    if (i33 < i32 && kaVar3.weight > 0.0f) {
                        throw new RuntimeException("A child of LinearLayout with index less than mBaselineAlignedChildIndex has weight > 0, which won't work.  Either remove the weight, or don't set mBaselineAlignedChildIndex.");
                    }
                    if (i34 == 1073741824 || kaVar3.width != -1) {
                        z11 = false;
                    } else {
                        z11 = true;
                        z14 = true;
                    }
                    int i48 = kaVar3.leftMargin + kaVar3.rightMargin;
                    int measuredWidth = childAt.getMeasuredWidth() + i48;
                    i42 = Math.max(i42, measuredWidth);
                    i43 = View.combineMeasuredStates(i43, childAt.getMeasuredState());
                    boolean z16 = z15 && kaVar3.width == -1;
                    if (true != z11) {
                        i48 = measuredWidth;
                    }
                    if (kaVar3.weight > 0.0f) {
                        i41 = Math.max(i41, i48);
                    } else {
                        i40 = Math.max(i40, i48);
                    }
                    z15 = z16;
                }
                i39 = i33 + 1;
                i38 = i32;
                mode = i34;
                z12 = z10;
                mode2 = i31;
                i35 = -2;
                c3 = 0;
                i36 = 8;
                i37 = 1073741824;
            }
            int i49 = mode;
            int i50 = mode2;
            boolean z17 = z12;
            int i51 = i42;
            int i52 = i43;
            if (kbVar.e > 0 && kbVar.s(childCount)) {
                kbVar.e += kbVar.m;
            }
            if (z17) {
                i25 = i50;
                if (i25 != Integer.MIN_VALUE) {
                    if (i25 == 0) {
                        i25 = 0;
                    }
                    z9 = true;
                }
                kbVar.e = 0;
                for (int i53 = 0; i53 < childCount; i53++) {
                    View childAt2 = kbVar.getChildAt(i53);
                    if (childAt2 != null && childAt2.getVisibility() != 8) {
                        ka kaVar4 = (ka) childAt2.getLayoutParams();
                        int i54 = kbVar.e;
                        kbVar.e = Math.max(i54, i54 + i44 + kaVar4.topMargin + kaVar4.bottomMargin);
                    }
                }
                z9 = true;
            } else {
                i25 = i50;
                z9 = false;
            }
            int paddingTop = kbVar.e + kbVar.getPaddingTop() + kbVar.getPaddingBottom();
            kbVar.e = paddingTop;
            int resolveSizeAndState = View.resolveSizeAndState(Math.max(paddingTop, kbVar.getSuggestedMinimumHeight()), i2, 0);
            int i55 = (resolveSizeAndState & 16777215) - kbVar.e;
            if (z13 || (i55 != 0 && f2 > 0.0f)) {
                float f3 = kbVar.i;
                if (f3 > 0.0f) {
                    f2 = f3;
                }
                kbVar.e = 0;
                for (int i56 = 0; i56 < childCount; i56++) {
                    View childAt3 = kbVar.getChildAt(i56);
                    if (childAt3.getVisibility() != 8) {
                        ka kaVar5 = (ka) childAt3.getLayoutParams();
                        float f4 = kaVar5.weight;
                        if (f4 > 0.0f) {
                            float f5 = (i55 * f4) / f2;
                            f2 -= f4;
                            int i57 = (int) f5;
                            i55 -= i57;
                            int childMeasureSpec = getChildMeasureSpec(i, kbVar.getPaddingLeft() + kbVar.getPaddingRight() + kaVar5.leftMargin + kaVar5.rightMargin, kaVar5.width);
                            if (kaVar5.height == 0) {
                                i28 = 1073741824;
                                if (i25 == 1073741824) {
                                    if (i57 <= 0) {
                                        i57 = 0;
                                    }
                                    childAt3.measure(childMeasureSpec, View.MeasureSpec.makeMeasureSpec(i57, 1073741824));
                                    i52 = View.combineMeasuredStates(i52, childAt3.getMeasuredState() & (-256));
                                }
                            } else {
                                i28 = 1073741824;
                            }
                            int measuredHeight2 = childAt3.getMeasuredHeight() + i57;
                            if (measuredHeight2 < 0) {
                                measuredHeight2 = 0;
                            }
                            childAt3.measure(childMeasureSpec, View.MeasureSpec.makeMeasureSpec(measuredHeight2, i28));
                            i52 = View.combineMeasuredStates(i52, childAt3.getMeasuredState() & (-256));
                        }
                        int i58 = kaVar5.leftMargin + kaVar5.rightMargin;
                        int measuredWidth2 = childAt3.getMeasuredWidth() + i58;
                        i51 = Math.max(i51, measuredWidth2);
                        if (i49 != 1073741824) {
                            i26 = i52;
                            i27 = -1;
                        } else {
                            i26 = i52;
                            i27 = -1;
                        }
                        i58 = measuredWidth2;
                        int max3 = Math.max(i40, i58);
                        boolean z18 = z15 && kaVar5.width == i27;
                        int i59 = kbVar.e;
                        kbVar.e = Math.max(i59, childAt3.getMeasuredHeight() + i59 + kaVar5.topMargin + kaVar5.bottomMargin);
                        z15 = z18;
                        i40 = max3;
                        i52 = i26;
                    }
                }
                kbVar.e += kbVar.getPaddingTop() + kbVar.getPaddingBottom();
            } else {
                i40 = Math.max(i40, i41);
                if (z9 && i25 != 1073741824) {
                    for (int i60 = 0; i60 < childCount; i60++) {
                        View childAt4 = kbVar.getChildAt(i60);
                        if (childAt4 != null && childAt4.getVisibility() != 8 && ((ka) childAt4.getLayoutParams()).weight > 0.0f) {
                            childAt4.measure(View.MeasureSpec.makeMeasureSpec(childAt4.getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(i44, 1073741824));
                        }
                    }
                }
            }
            int i61 = i51;
            if (z15 || i49 == 1073741824) {
                i40 = i61;
            }
            kbVar.setMeasuredDimension(View.resolveSizeAndState(Math.max(i40 + kbVar.getPaddingLeft() + kbVar.getPaddingRight(), kbVar.getSuggestedMinimumWidth()), i, i52), resolveSizeAndState);
            if (z14) {
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(kbVar.getMeasuredWidth(), 1073741824);
                for (int i62 = 0; i62 < childCount; i62++) {
                    View childAt5 = kbVar.getChildAt(i62);
                    if (childAt5.getVisibility() != 8) {
                        ka kaVar6 = (ka) childAt5.getLayoutParams();
                        if (kaVar6.width == -1) {
                            int i63 = kaVar6.height;
                            kaVar6.height = childAt5.getMeasuredHeight();
                            kbVar.measureChildWithMargins(childAt5, makeMeasureSpec, 0, i2, 0);
                            kaVar6.height = i63;
                        }
                    }
                }
                return;
            }
            return;
        }
        int i64 = i;
        kbVar.e = 0;
        int childCount2 = kbVar.getChildCount();
        int mode3 = View.MeasureSpec.getMode(i64);
        int mode4 = View.MeasureSpec.getMode(i2);
        int[] iArr6 = kbVar.k;
        if (iArr6 == null || (iArr5 = kbVar.l) == null) {
            int[] iArr7 = new int[4];
            kbVar.k = iArr7;
            int[] iArr8 = new int[4];
            kbVar.l = iArr8;
            iArr = iArr8;
            iArr2 = iArr7;
        } else {
            iArr2 = iArr6;
            iArr = iArr5;
        }
        iArr2[3] = -1;
        iArr2[2] = -1;
        iArr2[1] = -1;
        iArr2[0] = -1;
        iArr[3] = -1;
        iArr[2] = -1;
        iArr[1] = -1;
        iArr[0] = -1;
        boolean z19 = kbVar.a;
        boolean z20 = kbVar.j;
        float f6 = 0.0f;
        int i65 = 0;
        int i66 = 0;
        int i67 = 0;
        int i68 = 0;
        int i69 = 0;
        int i70 = 0;
        boolean z21 = false;
        boolean z22 = true;
        boolean z23 = false;
        while (i65 < childCount2) {
            View childAt6 = kbVar.getChildAt(i65);
            if (childAt6 == null) {
                iArr3 = iArr2;
                iArr4 = iArr;
                i15 = i66;
                i16 = i67;
                i64 = i;
                i17 = i65;
                z3 = z19;
                z5 = z20;
                z4 = z21;
                i18 = i68;
            } else {
                int i71 = i66;
                int i72 = i67;
                if (childAt6.getVisibility() != 8) {
                    if (kbVar.s(i65)) {
                        kbVar.e += kbVar.h;
                    }
                    ka kaVar7 = (ka) childAt6.getLayoutParams();
                    f6 += kaVar7.weight;
                    if (mode3 != 1073741824) {
                        i17 = i65;
                        i19 = mode3;
                    } else if (kaVar7.width != 0 || kaVar7.weight <= 0.0f) {
                        i17 = i65;
                        i19 = 1073741824;
                    } else {
                        i17 = i65;
                        kbVar.e += kaVar7.leftMargin + kaVar7.rightMargin;
                        if (z19) {
                            int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 0);
                            childAt6.measure(makeMeasureSpec2, makeMeasureSpec2);
                            view = childAt6;
                            iArr3 = iArr2;
                            z3 = z19;
                            z4 = z21;
                            i21 = i71;
                            z6 = true;
                        } else {
                            view = childAt6;
                            iArr3 = iArr2;
                            z3 = z19;
                            z4 = z21;
                            i21 = i71;
                            z6 = false;
                            z23 = true;
                        }
                        i64 = i;
                        i22 = i68;
                        iArr4 = iArr;
                        i23 = i72;
                        z5 = z20;
                        kaVar2 = kaVar7;
                        if (mode4 == 1073741824 && kaVar2.height == -1) {
                            z7 = true;
                            z4 = true;
                        } else {
                            z7 = false;
                        }
                        int i73 = kaVar2.topMargin + kaVar2.bottomMargin;
                        int measuredHeight3 = view.getMeasuredHeight() + i73;
                        z8 = z6;
                        int combineMeasuredStates = View.combineMeasuredStates(i70, view.getMeasuredState());
                        if (z8) {
                            i24 = combineMeasuredStates;
                        } else {
                            int baseline2 = view.getBaseline();
                            i24 = combineMeasuredStates;
                            if (baseline2 != -1) {
                                int i74 = ((kaVar2.gravity < 0 ? kbVar.f : kaVar2.gravity) & 112) >> 5;
                                iArr3[i74] = Math.max(iArr3[i74], baseline2);
                                iArr4[i74] = Math.max(iArr4[i74], measuredHeight3 - baseline2);
                            }
                        }
                        int max4 = Math.max(i21, measuredHeight3);
                        boolean z24 = !z22 && kaVar2.height == -1;
                        if (true != z7) {
                            i73 = measuredHeight3;
                        }
                        if (kaVar2.weight <= 0.0f) {
                            i68 = Math.max(i22, i73);
                            max2 = i23;
                        } else {
                            max2 = Math.max(i23, i73);
                            i68 = i22;
                        }
                        i16 = max2;
                        z22 = z24;
                        i70 = i24;
                        i66 = max4;
                        z21 = z4;
                        i65 = i17 + 1;
                        i67 = i16;
                        iArr = iArr4;
                        z19 = z3;
                        z20 = z5;
                        iArr2 = iArr3;
                    }
                    if (kaVar7.width != 0 || kaVar7.weight <= 0.0f) {
                        c = 0;
                    } else {
                        kaVar7.width = -2;
                        c = 0;
                    }
                    if (f6 == 0.0f) {
                        kaVar = kaVar7;
                        i20 = kbVar.e;
                    } else {
                        kaVar = kaVar7;
                        i20 = 0;
                    }
                    iArr3 = iArr2;
                    z3 = z19;
                    i21 = i71;
                    i22 = i68;
                    iArr4 = iArr;
                    z4 = z21;
                    i23 = i72;
                    int i75 = i19;
                    z5 = z20;
                    i64 = i;
                    kaVar2 = kaVar;
                    kbVar.measureChildWithMargins(childAt6, i64, i20, i2, 0);
                    if (c != 0) {
                        kaVar2.width = 0;
                    }
                    int measuredWidth3 = childAt6.getMeasuredWidth();
                    int i76 = kbVar.e;
                    view = childAt6;
                    if (i75 == 1073741824) {
                        kbVar.e = i76 + kaVar2.leftMargin + measuredWidth3 + kaVar2.rightMargin;
                    } else {
                        kbVar.e = Math.max(i76, i76 + measuredWidth3 + kaVar2.leftMargin + kaVar2.rightMargin);
                    }
                    if (z5) {
                        i69 = Math.max(measuredWidth3, i69);
                    }
                    z6 = z3;
                    if (mode4 == 1073741824) {
                    }
                    z7 = false;
                    int i732 = kaVar2.topMargin + kaVar2.bottomMargin;
                    int measuredHeight32 = view.getMeasuredHeight() + i732;
                    z8 = z6;
                    int combineMeasuredStates2 = View.combineMeasuredStates(i70, view.getMeasuredState());
                    if (z8) {
                    }
                    int max42 = Math.max(i21, measuredHeight32);
                    if (z22) {
                    }
                    if (true != z7) {
                    }
                    if (kaVar2.weight <= 0.0f) {
                    }
                    i16 = max2;
                    z22 = z24;
                    i70 = i24;
                    i66 = max42;
                    z21 = z4;
                    i65 = i17 + 1;
                    i67 = i16;
                    iArr = iArr4;
                    z19 = z3;
                    z20 = z5;
                    iArr2 = iArr3;
                } else {
                    iArr3 = iArr2;
                    i15 = i71;
                    iArr4 = iArr;
                    i16 = i72;
                    i64 = i;
                    i17 = i65;
                    z3 = z19;
                    z4 = z21;
                    i18 = i68;
                    z5 = z20;
                }
            }
            i66 = i15;
            i68 = i18;
            z21 = z4;
            i65 = i17 + 1;
            i67 = i16;
            iArr = iArr4;
            z19 = z3;
            z20 = z5;
            iArr2 = iArr3;
        }
        int[] iArr9 = iArr2;
        int[] iArr10 = iArr;
        boolean z25 = z19;
        boolean z26 = z20;
        boolean z27 = z21;
        int i77 = i66;
        int i78 = i67;
        int i79 = i68;
        if (kbVar.e > 0 && kbVar.s(childCount2)) {
            kbVar.e += kbVar.h;
        }
        int i80 = iArr9[1];
        if (i80 == -1) {
            if (iArr9[0] == -1 && iArr9[2] == -1 && iArr9[3] == -1) {
                max = i77;
                if (z26) {
                    i3 = mode3;
                    z = false;
                } else {
                    if (mode3 == Integer.MIN_VALUE) {
                        i3 = mode3;
                    } else if (mode3 == 0) {
                        i3 = 0;
                        mode3 = 0;
                    } else {
                        i3 = mode3;
                        z = true;
                    }
                    kbVar.e = 0;
                    int i81 = 0;
                    while (i81 < childCount2) {
                        View childAt7 = kbVar.getChildAt(i81);
                        if (childAt7 == null || childAt7.getVisibility() == 8) {
                            i14 = i3;
                        } else {
                            ka kaVar8 = (ka) childAt7.getLayoutParams();
                            int i82 = kbVar.e;
                            i14 = i3;
                            kbVar.e = Math.max(i82, i82 + i69 + kaVar8.leftMargin + kaVar8.rightMargin);
                        }
                        i81++;
                        i3 = i14;
                    }
                    z = true;
                }
                int paddingLeft = kbVar.e + kbVar.getPaddingLeft() + kbVar.getPaddingRight();
                kbVar.e = paddingLeft;
                int resolveSizeAndState2 = View.resolveSizeAndState(Math.max(paddingLeft, kbVar.getSuggestedMinimumWidth()), i64, 0);
                int i83 = (resolveSizeAndState2 & 16777215) - kbVar.e;
                if (!z23 || (i83 != 0 && f6 > 0.0f)) {
                    f = kbVar.i;
                    if (f > 0.0f) {
                        f6 = f;
                    }
                    iArr9[3] = -1;
                    iArr9[2] = -1;
                    iArr9[1] = -1;
                    iArr9[0] = -1;
                    iArr10[3] = -1;
                    iArr10[2] = -1;
                    iArr10[1] = -1;
                    iArr10[0] = -1;
                    kbVar.e = 0;
                    i4 = 0;
                    int i84 = -1;
                    while (i4 < childCount2) {
                        View childAt8 = kbVar.getChildAt(i4);
                        if (childAt8 != null && childAt8.getVisibility() != 8) {
                            ka kaVar9 = (ka) childAt8.getLayoutParams();
                            float f7 = kaVar9.weight;
                            if (f7 > 0.0f) {
                                float f8 = (i83 * f7) / f6;
                                f6 -= f7;
                                int i85 = (int) f8;
                                i83 -= i85;
                                int childMeasureSpec2 = getChildMeasureSpec(i2, kbVar.getPaddingTop() + kbVar.getPaddingBottom() + kaVar9.topMargin + kaVar9.bottomMargin, kaVar9.height);
                                if (kaVar9.width == 0) {
                                    i11 = 1073741824;
                                    if (mode3 == 1073741824) {
                                        if (i85 > 0) {
                                            i10 = i4;
                                            i13 = i85;
                                        } else {
                                            i10 = i4;
                                            i13 = 0;
                                        }
                                        childAt8.measure(View.MeasureSpec.makeMeasureSpec(i13, 1073741824), childMeasureSpec2);
                                        i70 = View.combineMeasuredStates(i70, childAt8.getMeasuredState() & (-16777216));
                                    }
                                } else {
                                    i11 = 1073741824;
                                }
                                i10 = i4;
                                int measuredWidth4 = childAt8.getMeasuredWidth() + i85;
                                if (measuredWidth4 < 0) {
                                    measuredWidth4 = 0;
                                }
                                childAt8.measure(View.MeasureSpec.makeMeasureSpec(measuredWidth4, i11), childMeasureSpec2);
                                i70 = View.combineMeasuredStates(i70, childAt8.getMeasuredState() & (-16777216));
                            } else {
                                i10 = i4;
                                i11 = 1073741824;
                            }
                            int i86 = kbVar.e;
                            if (i3 == i11) {
                                kbVar.e = i86 + childAt8.getMeasuredWidth() + kaVar9.leftMargin + kaVar9.rightMargin;
                            } else {
                                kbVar.e = Math.max(i86, childAt8.getMeasuredWidth() + i86 + kaVar9.leftMargin + kaVar9.rightMargin);
                            }
                            boolean z28 = mode4 != 1073741824 && kaVar9.height == -1;
                            int i87 = kaVar9.topMargin + kaVar9.bottomMargin;
                            int measuredHeight4 = childAt8.getMeasuredHeight() + i87;
                            i84 = Math.max(i84, measuredHeight4);
                            i9 = i3;
                            if (true != z28) {
                                i87 = measuredHeight4;
                            }
                            int max5 = Math.max(i78, i87);
                            if (z22) {
                                i12 = -1;
                                if (kaVar9.height == -1) {
                                    z2 = true;
                                    if (z25 && (baseline = childAt8.getBaseline()) != i12) {
                                        int i88 = ((kaVar9.gravity >= 0 ? kbVar.f : kaVar9.gravity) & 112) >> 5;
                                        iArr9[i88] = Math.max(iArr9[i88], baseline);
                                        iArr10[i88] = Math.max(iArr10[i88], measuredHeight4 - baseline);
                                    }
                                    i78 = max5;
                                    z22 = z2;
                                    i4 = i10 + 1;
                                    i3 = i9;
                                }
                            } else {
                                i12 = -1;
                            }
                            z2 = false;
                            if (z25) {
                                int i882 = ((kaVar9.gravity >= 0 ? kbVar.f : kaVar9.gravity) & 112) >> 5;
                                iArr9[i882] = Math.max(iArr9[i882], baseline);
                                iArr10[i882] = Math.max(iArr10[i882], measuredHeight4 - baseline);
                            }
                            i78 = max5;
                            z22 = z2;
                            i4 = i10 + 1;
                            i3 = i9;
                        }
                        i9 = i3;
                        i10 = i4;
                        i4 = i10 + 1;
                        i3 = i9;
                    }
                    i5 = -16777216;
                    kbVar.e += kbVar.getPaddingLeft() + kbVar.getPaddingRight();
                    i6 = iArr9[1];
                    if (i6 == -1) {
                        if (iArr9[0] == -1 && iArr9[2] == -1 && iArr9[3] == -1) {
                            max = i84;
                            i8 = i78;
                        } else {
                            i6 = -1;
                        }
                    }
                    i7 = 0;
                    max = Math.max(i84, Math.max(iArr9[3], Math.max(iArr9[0], Math.max(i6, iArr9[2]))) + Math.max(iArr10[3], Math.max(iArr10[0], Math.max(iArr10[1], iArr10[2]))));
                    i8 = i78;
                    if (!z22 || mode4 == 1073741824) {
                        i8 = max;
                    }
                    kbVar.setMeasuredDimension((i70 & i5) | resolveSizeAndState2, View.resolveSizeAndState(Math.max(i8 + kbVar.getPaddingTop() + kbVar.getPaddingBottom(), kbVar.getSuggestedMinimumHeight()), i2, i70 << 16));
                    if (z27) {
                        int makeMeasureSpec3 = View.MeasureSpec.makeMeasureSpec(kbVar.getMeasuredHeight(), 1073741824);
                        int i89 = i7;
                        while (i89 < childCount2) {
                            View childAt9 = kbVar.getChildAt(i89);
                            if (childAt9.getVisibility() != 8) {
                                ka kaVar10 = (ka) childAt9.getLayoutParams();
                                if (kaVar10.height == -1) {
                                    int i90 = kaVar10.width;
                                    kaVar10.width = childAt9.getMeasuredWidth();
                                    kbVar.measureChildWithMargins(childAt9, i, 0, makeMeasureSpec3, 0);
                                    kaVar10.width = i90;
                                }
                            }
                            i89++;
                            kbVar = this;
                        }
                        return;
                    }
                    return;
                }
                i8 = Math.max(i78, i79);
                if (z && mode3 != 1073741824) {
                    for (int i91 = 0; i91 < childCount2; i91++) {
                        View childAt10 = kbVar.getChildAt(i91);
                        if (childAt10 != null && childAt10.getVisibility() != 8 && ((ka) childAt10.getLayoutParams()).weight > 0.0f) {
                            childAt10.measure(View.MeasureSpec.makeMeasureSpec(i69, 1073741824), View.MeasureSpec.makeMeasureSpec(childAt10.getMeasuredHeight(), 1073741824));
                        }
                    }
                }
                i5 = -16777216;
                i7 = 0;
                if (!z22) {
                }
                i8 = max;
                kbVar.setMeasuredDimension((i70 & i5) | resolveSizeAndState2, View.resolveSizeAndState(Math.max(i8 + kbVar.getPaddingTop() + kbVar.getPaddingBottom(), kbVar.getSuggestedMinimumHeight()), i2, i70 << 16));
                if (z27) {
                }
            } else {
                i80 = -1;
            }
        }
        max = Math.max(i77, Math.max(iArr9[3], Math.max(iArr9[0], Math.max(i80, iArr9[2]))) + Math.max(iArr10[3], Math.max(iArr10[0], Math.max(iArr10[1], iArr10[2]))));
        if (z26) {
        }
        int paddingLeft2 = kbVar.e + kbVar.getPaddingLeft() + kbVar.getPaddingRight();
        kbVar.e = paddingLeft2;
        int resolveSizeAndState22 = View.resolveSizeAndState(Math.max(paddingLeft2, kbVar.getSuggestedMinimumWidth()), i64, 0);
        int i832 = (resolveSizeAndState22 & 16777215) - kbVar.e;
        if (z23) {
        }
        f = kbVar.i;
        if (f > 0.0f) {
        }
        iArr9[3] = -1;
        iArr9[2] = -1;
        iArr9[1] = -1;
        iArr9[0] = -1;
        iArr10[3] = -1;
        iArr10[2] = -1;
        iArr10[1] = -1;
        iArr10[0] = -1;
        kbVar.e = 0;
        i4 = 0;
        int i842 = -1;
        while (i4 < childCount2) {
        }
        i5 = -16777216;
        kbVar.e += kbVar.getPaddingLeft() + kbVar.getPaddingRight();
        i6 = iArr9[1];
        if (i6 == -1) {
        }
        i7 = 0;
        max = Math.max(i842, Math.max(iArr9[3], Math.max(iArr9[0], Math.max(i6, iArr9[2]))) + Math.max(iArr10[3], Math.max(iArr10[0], Math.max(iArr10[1], iArr10[2]))));
        i8 = i78;
        if (!z22) {
        }
        i8 = max;
        kbVar.setMeasuredDimension((i70 & i5) | resolveSizeAndState22, View.resolveSizeAndState(Math.max(i8 + kbVar.getPaddingTop() + kbVar.getPaddingBottom(), kbVar.getSuggestedMinimumHeight()), i2, i70 << 16));
        if (z27) {
        }
    }

    final void p(Canvas canvas, int i) {
        this.g.setBounds(getPaddingLeft() + this.o, i, (getWidth() - getPaddingRight()) - this.o, this.m + i);
        this.g.draw(canvas);
    }

    final void q(Canvas canvas, int i) {
        this.g.setBounds(i, getPaddingTop() + this.o, this.h + i, (getHeight() - getPaddingBottom()) - this.o);
        this.g.draw(canvas);
    }

    public final void r(int i) {
        if (this.d != i) {
            this.d = i;
            requestLayout();
        }
    }

    protected final boolean s(int i) {
        if (i == 0) {
            return (this.n & 1) != 0;
        }
        int childCount = getChildCount();
        int i2 = this.n;
        if (i == childCount) {
            return (i2 & 4) != 0;
        }
        if ((i2 & 2) != 0) {
            do {
                i--;
                if (i >= 0) {
                }
            } while (getChildAt(i).getVisibility() == 8);
            return true;
        }
        return false;
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    public final void t() {
        this.a = false;
    }

    public kb(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public kb(Context context) {
        this(context, null);
    }
}
