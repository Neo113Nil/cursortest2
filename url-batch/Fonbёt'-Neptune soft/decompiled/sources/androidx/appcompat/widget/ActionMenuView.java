package androidx.appcompat.widget;

import B.m;
import B0.C0023a;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import androidx.appcompat.view.menu.ActionMenuItemView;
import i.InterfaceC0210h;
import i.MenuC0211i;
import i.MenuItemC0212j;
import j.C0230f;
import j.C0232h;
import j.C0233i;
import j.C0235k;
import j.F;
import j.G;
import j.InterfaceC0234j;
import j.InterfaceC0236l;
import j.y0;

/* loaded from: classes.dex */
public class ActionMenuView extends G implements InterfaceC0210h {

    /* renamed from: A, reason: collision with root package name */
    public final int f1409A;

    /* renamed from: B, reason: collision with root package name */
    public InterfaceC0236l f1410B;

    /* renamed from: t, reason: collision with root package name */
    public MenuC0211i f1411t;

    /* renamed from: u, reason: collision with root package name */
    public Context f1412u;
    public int v;

    /* renamed from: w, reason: collision with root package name */
    public C0233i f1413w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f1414x;

    /* renamed from: y, reason: collision with root package name */
    public int f1415y;

    /* renamed from: z, reason: collision with root package name */
    public final int f1416z;

    public ActionMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        setBaselineAligned(false);
        float f2 = context.getResources().getDisplayMetrics().density;
        this.f1416z = (int) (56.0f * f2);
        this.f1409A = (int) (f2 * 4.0f);
        this.f1412u = context;
        this.v = 0;
    }

    public static C0235k h() {
        C0235k c0235k = new C0235k(-2);
        c0235k.f2993c = false;
        c0235k.f2851b = 16;
        return c0235k;
    }

    public static C0235k i(ViewGroup.LayoutParams layoutParams) {
        C0235k c0235k;
        if (layoutParams == null) {
            return h();
        }
        if (layoutParams instanceof C0235k) {
            C0235k c0235k2 = (C0235k) layoutParams;
            c0235k = new C0235k(c0235k2);
            c0235k.f2993c = c0235k2.f2993c;
        } else {
            c0235k = new C0235k(layoutParams);
        }
        if (c0235k.f2851b <= 0) {
            c0235k.f2851b = 16;
        }
        return c0235k;
    }

    @Override // i.InterfaceC0210h
    public final boolean a(MenuItemC0212j menuItemC0212j) {
        return this.f1411t.p(menuItemC0212j, null, 0);
    }

    @Override // j.G, android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C0235k;
    }

    @Override // j.G
    /* renamed from: d */
    public final /* bridge */ /* synthetic */ F generateDefaultLayoutParams() {
        return h();
    }

    @Override // android.view.View
    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return false;
    }

    @Override // j.G
    /* renamed from: e */
    public final F generateLayoutParams(AttributeSet attributeSet) {
        return new C0235k(getContext(), attributeSet);
    }

    @Override // j.G
    /* renamed from: f */
    public final /* bridge */ /* synthetic */ F generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return i(layoutParams);
    }

    @Override // j.G, android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return h();
    }

    @Override // j.G, android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return i(layoutParams);
    }

    public Menu getMenu() {
        if (this.f1411t == null) {
            Context context = getContext();
            MenuC0211i menuC0211i = new MenuC0211i(context);
            this.f1411t = menuC0211i;
            menuC0211i.f2412e = new m(26, this);
            C0233i c0233i = new C0233i(context);
            this.f1413w = c0233i;
            c0233i.f2975o = true;
            c0233i.f2976p = true;
            c0233i.f2969i = new C0023a(25);
            this.f1411t.b(c0233i, this.f1412u);
            C0233i c0233i2 = this.f1413w;
            c0233i2.f2971k = this;
            this.f1411t = c0233i2.f2967g;
        }
        return this.f1411t;
    }

    public Drawable getOverflowIcon() {
        getMenu();
        C0233i c0233i = this.f1413w;
        C0232h c0232h = c0233i.f2972l;
        if (c0232h != null) {
            return c0232h.getDrawable();
        }
        if (c0233i.f2974n) {
            return c0233i.f2973m;
        }
        return null;
    }

    public int getPopupTheme() {
        return this.v;
    }

    public int getWindowAnimations() {
        return 0;
    }

    public final boolean j(int i2) {
        boolean z2 = false;
        if (i2 == 0) {
            return false;
        }
        KeyEvent.Callback childAt = getChildAt(i2 - 1);
        KeyEvent.Callback childAt2 = getChildAt(i2);
        if (i2 < getChildCount() && (childAt instanceof InterfaceC0234j)) {
            z2 = ((InterfaceC0234j) childAt).a();
        }
        return (i2 <= 0 || !(childAt2 instanceof InterfaceC0234j)) ? z2 : z2 | ((InterfaceC0234j) childAt2).b();
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        C0233i c0233i = this.f1413w;
        if (c0233i != null) {
            c0233i.h();
            C0230f c0230f = this.f1413w.v;
            if (c0230f == null || !c0230f.b()) {
                return;
            }
            this.f1413w.i();
            this.f1413w.j();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C0233i c0233i = this.f1413w;
        if (c0233i != null) {
            c0233i.i();
            C0230f c0230f = c0233i.f2982w;
            if (c0230f == null || !c0230f.b()) {
                return;
            }
            c0230f.f2465i.dismiss();
        }
    }

    @Override // j.G, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
        int width;
        int i6;
        if (!this.f1414x) {
            super.onLayout(z2, i2, i3, i4, i5);
            return;
        }
        int childCount = getChildCount();
        int i7 = (i5 - i3) / 2;
        int dividerWidth = getDividerWidth();
        int i8 = i4 - i2;
        int paddingRight = (i8 - getPaddingRight()) - getPaddingLeft();
        boolean a2 = y0.a(this);
        int i9 = 0;
        int i10 = 0;
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = getChildAt(i11);
            if (childAt.getVisibility() != 8) {
                C0235k c0235k = (C0235k) childAt.getLayoutParams();
                if (c0235k.f2993c) {
                    int measuredWidth = childAt.getMeasuredWidth();
                    if (j(i11)) {
                        measuredWidth += dividerWidth;
                    }
                    int measuredHeight = childAt.getMeasuredHeight();
                    if (a2) {
                        i6 = getPaddingLeft() + ((ViewGroup.MarginLayoutParams) c0235k).leftMargin;
                        width = i6 + measuredWidth;
                    } else {
                        width = (getWidth() - getPaddingRight()) - ((ViewGroup.MarginLayoutParams) c0235k).rightMargin;
                        i6 = width - measuredWidth;
                    }
                    int i12 = i7 - (measuredHeight / 2);
                    childAt.layout(i6, i12, width, measuredHeight + i12);
                    paddingRight -= measuredWidth;
                    i9 = 1;
                } else {
                    paddingRight -= (childAt.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) c0235k).leftMargin) + ((ViewGroup.MarginLayoutParams) c0235k).rightMargin;
                    j(i11);
                    i10++;
                }
            }
        }
        if (childCount == 1 && i9 == 0) {
            View childAt2 = getChildAt(0);
            int measuredWidth2 = childAt2.getMeasuredWidth();
            int measuredHeight2 = childAt2.getMeasuredHeight();
            int i13 = (i8 / 2) - (measuredWidth2 / 2);
            int i14 = i7 - (measuredHeight2 / 2);
            childAt2.layout(i13, i14, measuredWidth2 + i13, measuredHeight2 + i14);
            return;
        }
        int i15 = i10 - (i9 ^ 1);
        int max = Math.max(0, i15 > 0 ? paddingRight / i15 : 0);
        if (a2) {
            int width2 = getWidth() - getPaddingRight();
            for (int i16 = 0; i16 < childCount; i16++) {
                View childAt3 = getChildAt(i16);
                C0235k c0235k2 = (C0235k) childAt3.getLayoutParams();
                if (childAt3.getVisibility() != 8 && !c0235k2.f2993c) {
                    int i17 = width2 - ((ViewGroup.MarginLayoutParams) c0235k2).rightMargin;
                    int measuredWidth3 = childAt3.getMeasuredWidth();
                    int measuredHeight3 = childAt3.getMeasuredHeight();
                    int i18 = i7 - (measuredHeight3 / 2);
                    childAt3.layout(i17 - measuredWidth3, i18, i17, measuredHeight3 + i18);
                    width2 = i17 - ((measuredWidth3 + ((ViewGroup.MarginLayoutParams) c0235k2).leftMargin) + max);
                }
            }
            return;
        }
        int paddingLeft = getPaddingLeft();
        for (int i19 = 0; i19 < childCount; i19++) {
            View childAt4 = getChildAt(i19);
            C0235k c0235k3 = (C0235k) childAt4.getLayoutParams();
            if (childAt4.getVisibility() != 8 && !c0235k3.f2993c) {
                int i20 = paddingLeft + ((ViewGroup.MarginLayoutParams) c0235k3).leftMargin;
                int measuredWidth4 = childAt4.getMeasuredWidth();
                int measuredHeight4 = childAt4.getMeasuredHeight();
                int i21 = i7 - (measuredHeight4 / 2);
                childAt4.layout(i20, i21, i20 + measuredWidth4, measuredHeight4 + i21);
                paddingLeft = measuredWidth4 + ((ViewGroup.MarginLayoutParams) c0235k3).rightMargin + max + i20;
            }
        }
    }

    /* JADX WARN: Type inference failed for: r4v23 */
    /* JADX WARN: Type inference failed for: r4v24, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r4v26 */
    /* JADX WARN: Type inference failed for: r4v31 */
    @Override // j.G, android.view.View
    public final void onMeasure(int i2, int i3) {
        int i4;
        boolean z2;
        int i5;
        boolean z3;
        int i6;
        int i7;
        int i8;
        ?? r4;
        int i9;
        int i10;
        int i11;
        MenuC0211i menuC0211i;
        boolean z4 = this.f1414x;
        boolean z5 = View.MeasureSpec.getMode(i2) == 1073741824;
        this.f1414x = z5;
        if (z4 != z5) {
            this.f1415y = 0;
        }
        int size = View.MeasureSpec.getSize(i2);
        if (this.f1414x && (menuC0211i = this.f1411t) != null && size != this.f1415y) {
            this.f1415y = size;
            menuC0211i.o(true);
        }
        int childCount = getChildCount();
        if (!this.f1414x || childCount <= 0) {
            for (int i12 = 0; i12 < childCount; i12++) {
                C0235k c0235k = (C0235k) getChildAt(i12).getLayoutParams();
                ((ViewGroup.MarginLayoutParams) c0235k).rightMargin = 0;
                ((ViewGroup.MarginLayoutParams) c0235k).leftMargin = 0;
            }
            super.onMeasure(i2, i3);
            return;
        }
        int mode = View.MeasureSpec.getMode(i3);
        int size2 = View.MeasureSpec.getSize(i2);
        int size3 = View.MeasureSpec.getSize(i3);
        int paddingRight = getPaddingRight() + getPaddingLeft();
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i3, paddingBottom, -2);
        int i13 = size2 - paddingRight;
        int i14 = this.f1416z;
        int i15 = i13 / i14;
        int i16 = i13 % i14;
        if (i15 == 0) {
            setMeasuredDimension(i13, 0);
            return;
        }
        int i17 = (i16 / i15) + i14;
        int childCount2 = getChildCount();
        int i18 = 0;
        int i19 = 0;
        int i20 = 0;
        int i21 = 0;
        boolean z6 = false;
        long j2 = 0;
        int i22 = 0;
        while (true) {
            i4 = this.f1409A;
            if (i21 >= childCount2) {
                break;
            }
            View childAt = getChildAt(i21);
            int i23 = size3;
            int i24 = i13;
            if (childAt.getVisibility() == 8) {
                i9 = mode;
                i10 = paddingBottom;
            } else {
                boolean z7 = childAt instanceof ActionMenuItemView;
                int i25 = i19 + 1;
                if (z7) {
                    childAt.setPadding(i4, 0, i4, 0);
                }
                C0235k c0235k2 = (C0235k) childAt.getLayoutParams();
                c0235k2.f2998h = false;
                c0235k2.f2995e = 0;
                c0235k2.f2994d = 0;
                c0235k2.f2996f = false;
                ((ViewGroup.MarginLayoutParams) c0235k2).leftMargin = 0;
                ((ViewGroup.MarginLayoutParams) c0235k2).rightMargin = 0;
                c0235k2.f2997g = z7 && !TextUtils.isEmpty(((ActionMenuItemView) childAt).getText());
                int i26 = c0235k2.f2993c ? 1 : i15;
                C0235k c0235k3 = (C0235k) childAt.getLayoutParams();
                i9 = mode;
                i10 = paddingBottom;
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(childMeasureSpec) - paddingBottom, View.MeasureSpec.getMode(childMeasureSpec));
                ActionMenuItemView actionMenuItemView = z7 ? (ActionMenuItemView) childAt : null;
                boolean z8 = (actionMenuItemView == null || TextUtils.isEmpty(actionMenuItemView.getText())) ? false : true;
                if (i26 <= 0 || (z8 && i26 < 2)) {
                    i11 = 0;
                } else {
                    childAt.measure(View.MeasureSpec.makeMeasureSpec(i26 * i17, Integer.MIN_VALUE), makeMeasureSpec);
                    int measuredWidth = childAt.getMeasuredWidth();
                    i11 = measuredWidth / i17;
                    if (measuredWidth % i17 != 0) {
                        i11++;
                    }
                    if (z8 && i11 < 2) {
                        i11 = 2;
                    }
                }
                c0235k3.f2996f = !c0235k3.f2993c && z8;
                c0235k3.f2994d = i11;
                childAt.measure(View.MeasureSpec.makeMeasureSpec(i11 * i17, 1073741824), makeMeasureSpec);
                i20 = Math.max(i20, i11);
                if (c0235k2.f2996f) {
                    i22++;
                }
                if (c0235k2.f2993c) {
                    z6 = true;
                }
                i15 -= i11;
                i18 = Math.max(i18, childAt.getMeasuredHeight());
                if (i11 == 1) {
                    j2 |= 1 << i21;
                }
                i19 = i25;
            }
            i21++;
            size3 = i23;
            i13 = i24;
            paddingBottom = i10;
            mode = i9;
        }
        int i27 = mode;
        int i28 = i13;
        int i29 = size3;
        boolean z9 = z6 && i19 == 2;
        boolean z10 = false;
        while (i22 > 0 && i15 > 0) {
            int i30 = Integer.MAX_VALUE;
            int i31 = 0;
            int i32 = 0;
            long j3 = 0;
            while (i32 < childCount2) {
                C0235k c0235k4 = (C0235k) getChildAt(i32).getLayoutParams();
                boolean z11 = z10;
                if (c0235k4.f2996f) {
                    int i33 = c0235k4.f2994d;
                    if (i33 < i30) {
                        j3 = 1 << i32;
                        i30 = i33;
                        i31 = 1;
                    } else if (i33 == i30) {
                        j3 |= 1 << i32;
                        i31++;
                    }
                }
                i32++;
                z10 = z11;
            }
            z2 = z10;
            j2 |= j3;
            if (i31 > i15) {
                break;
            }
            int i34 = i30 + 1;
            int i35 = 0;
            while (i35 < childCount2) {
                View childAt2 = getChildAt(i35);
                C0235k c0235k5 = (C0235k) childAt2.getLayoutParams();
                int i36 = i18;
                int i37 = childMeasureSpec;
                int i38 = childCount2;
                long j4 = 1 << i35;
                if ((j3 & j4) != 0) {
                    if (z9 && c0235k5.f2997g) {
                        r4 = 1;
                        r4 = 1;
                        if (i15 == 1) {
                            childAt2.setPadding(i4 + i17, 0, i4, 0);
                        }
                    } else {
                        r4 = 1;
                    }
                    c0235k5.f2994d += r4;
                    c0235k5.f2998h = r4;
                    i15--;
                } else if (c0235k5.f2994d == i34) {
                    j2 |= j4;
                }
                i35++;
                childMeasureSpec = i37;
                i18 = i36;
                childCount2 = i38;
            }
            z10 = true;
        }
        z2 = z10;
        int i39 = i18;
        int i40 = childMeasureSpec;
        int i41 = childCount2;
        boolean z12 = !z6 && i19 == 1;
        if (i15 <= 0 || j2 == 0 || (i15 >= i19 - 1 && !z12 && i20 <= 1)) {
            i5 = i41;
            z3 = z2;
        } else {
            float bitCount = Long.bitCount(j2);
            if (!z12) {
                if ((j2 & 1) != 0 && !((C0235k) getChildAt(0).getLayoutParams()).f2997g) {
                    bitCount -= 0.5f;
                }
                int i42 = i41 - 1;
                if ((j2 & (1 << i42)) != 0 && !((C0235k) getChildAt(i42).getLayoutParams()).f2997g) {
                    bitCount -= 0.5f;
                }
            }
            int i43 = bitCount > 0.0f ? (int) ((i15 * i17) / bitCount) : 0;
            boolean z13 = z2;
            i5 = i41;
            for (int i44 = 0; i44 < i5; i44++) {
                if ((j2 & (1 << i44)) != 0) {
                    View childAt3 = getChildAt(i44);
                    C0235k c0235k6 = (C0235k) childAt3.getLayoutParams();
                    if (childAt3 instanceof ActionMenuItemView) {
                        c0235k6.f2995e = i43;
                        c0235k6.f2998h = true;
                        if (i44 == 0 && !c0235k6.f2997g) {
                            ((ViewGroup.MarginLayoutParams) c0235k6).leftMargin = (-i43) / 2;
                        }
                        z13 = true;
                    } else {
                        if (c0235k6.f2993c) {
                            c0235k6.f2995e = i43;
                            c0235k6.f2998h = true;
                            ((ViewGroup.MarginLayoutParams) c0235k6).rightMargin = (-i43) / 2;
                            z13 = true;
                        } else {
                            if (i44 != 0) {
                                ((ViewGroup.MarginLayoutParams) c0235k6).leftMargin = i43 / 2;
                            }
                            if (i44 != i5 - 1) {
                                ((ViewGroup.MarginLayoutParams) c0235k6).rightMargin = i43 / 2;
                            }
                        }
                    }
                }
            }
            z3 = z13;
        }
        if (z3) {
            int i45 = 0;
            while (i45 < i5) {
                View childAt4 = getChildAt(i45);
                C0235k c0235k7 = (C0235k) childAt4.getLayoutParams();
                if (c0235k7.f2998h) {
                    i8 = i40;
                    childAt4.measure(View.MeasureSpec.makeMeasureSpec((c0235k7.f2994d * i17) + c0235k7.f2995e, 1073741824), i8);
                } else {
                    i8 = i40;
                }
                i45++;
                i40 = i8;
            }
        }
        if (i27 != 1073741824) {
            i7 = i28;
            i6 = i39;
        } else {
            i6 = i29;
            i7 = i28;
        }
        setMeasuredDimension(i7, i6);
    }

    public void setExpandedActionViewsExclusive(boolean z2) {
        this.f1413w.f2980t = z2;
    }

    public void setOnMenuItemClickListener(InterfaceC0236l interfaceC0236l) {
        this.f1410B = interfaceC0236l;
    }

    public void setOverflowIcon(Drawable drawable) {
        getMenu();
        C0233i c0233i = this.f1413w;
        C0232h c0232h = c0233i.f2972l;
        if (c0232h != null) {
            c0232h.setImageDrawable(drawable);
        } else {
            c0233i.f2974n = true;
            c0233i.f2973m = drawable;
        }
    }

    public void setOverflowReserved(boolean z2) {
    }

    public void setPopupTheme(int i2) {
        if (this.v != i2) {
            this.v = i2;
            if (i2 == 0) {
                this.f1412u = getContext();
            } else {
                this.f1412u = new ContextThemeWrapper(getContext(), i2);
            }
        }
    }

    public void setPresenter(C0233i c0233i) {
        this.f1413w = c0233i;
        c0233i.f2971k = this;
        this.f1411t = c0233i.f2967g;
    }

    @Override // j.G, android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new C0235k(getContext(), attributeSet);
    }
}
