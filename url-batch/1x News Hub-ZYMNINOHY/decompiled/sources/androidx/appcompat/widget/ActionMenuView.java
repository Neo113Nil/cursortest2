package androidx.appcompat.widget;

import U1.C0080a;
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
import b0.s;
import k.InterfaceC1064i;
import k.MenuC1065j;
import k.MenuItemC1066k;
import l.C1084f;
import l.C1086h;
import l.C1087i;
import l.C1089k;
import l.E;
import l.F;
import l.InterfaceC1088j;
import l.InterfaceC1090l;
import l.w0;

/* loaded from: classes.dex */
public class ActionMenuView extends F implements InterfaceC1064i {

    /* renamed from: p, reason: collision with root package name */
    public MenuC1065j f2033p;

    /* renamed from: q, reason: collision with root package name */
    public Context f2034q;

    /* renamed from: r, reason: collision with root package name */
    public int f2035r;

    /* renamed from: s, reason: collision with root package name */
    public C1087i f2036s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f2037t;

    /* renamed from: u, reason: collision with root package name */
    public int f2038u;
    public final int v;

    /* renamed from: w, reason: collision with root package name */
    public final int f2039w;

    /* renamed from: x, reason: collision with root package name */
    public InterfaceC1090l f2040x;

    public ActionMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        setBaselineAligned(false);
        float f = context.getResources().getDisplayMetrics().density;
        this.v = (int) (56.0f * f);
        this.f2039w = (int) (f * 4.0f);
        this.f2034q = context;
        this.f2035r = 0;
    }

    public static C1089k h() {
        C1089k c1089k = new C1089k(-2);
        c1089k.f9841c = false;
        c1089k.f9711b = 16;
        return c1089k;
    }

    public static C1089k i(ViewGroup.LayoutParams layoutParams) {
        C1089k c1089k;
        if (layoutParams == null) {
            return h();
        }
        if (layoutParams instanceof C1089k) {
            C1089k c1089k2 = (C1089k) layoutParams;
            c1089k = new C1089k(c1089k2);
            c1089k.f9841c = c1089k2.f9841c;
        } else {
            c1089k = new C1089k(layoutParams);
        }
        if (c1089k.f9711b <= 0) {
            c1089k.f9711b = 16;
        }
        return c1089k;
    }

    @Override // k.InterfaceC1064i
    public final boolean a(MenuItemC1066k menuItemC1066k) {
        return this.f2033p.p(menuItemC1066k, null, 0);
    }

    @Override // l.F, android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C1089k;
    }

    @Override // l.F
    /* renamed from: d */
    public final /* bridge */ /* synthetic */ E generateDefaultLayoutParams() {
        return h();
    }

    @Override // android.view.View
    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return false;
    }

    @Override // l.F
    /* renamed from: e */
    public final E generateLayoutParams(AttributeSet attributeSet) {
        return new C1089k(getContext(), attributeSet);
    }

    @Override // l.F
    /* renamed from: f */
    public final /* bridge */ /* synthetic */ E generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return i(layoutParams);
    }

    @Override // l.F, android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return h();
    }

    @Override // l.F, android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return i(layoutParams);
    }

    public Menu getMenu() {
        if (this.f2033p == null) {
            Context context = getContext();
            MenuC1065j menuC1065j = new MenuC1065j(context);
            this.f2033p = menuC1065j;
            menuC1065j.f9601e = new s(this);
            C1087i c1087i = new C1087i(context);
            this.f2036s = c1087i;
            c1087i.f9826k = true;
            c1087i.f9827l = true;
            c1087i.f9821e = new C0080a(25);
            this.f2033p.b(c1087i, this.f2034q);
            C1087i c1087i2 = this.f2036s;
            c1087i2.f9822g = this;
            this.f2033p = c1087i2.f9819c;
        }
        return this.f2033p;
    }

    public Drawable getOverflowIcon() {
        getMenu();
        C1087i c1087i = this.f2036s;
        C1086h c1086h = c1087i.f9823h;
        if (c1086h != null) {
            return c1086h.getDrawable();
        }
        if (c1087i.f9825j) {
            return c1087i.f9824i;
        }
        return null;
    }

    public int getPopupTheme() {
        return this.f2035r;
    }

    public int getWindowAnimations() {
        return 0;
    }

    public final boolean j(int i3) {
        boolean z = false;
        if (i3 == 0) {
            return false;
        }
        KeyEvent.Callback childAt = getChildAt(i3 - 1);
        KeyEvent.Callback childAt2 = getChildAt(i3);
        if (i3 < getChildCount() && (childAt instanceof InterfaceC1088j)) {
            z = ((InterfaceC1088j) childAt).b();
        }
        return (i3 <= 0 || !(childAt2 instanceof InterfaceC1088j)) ? z : ((InterfaceC1088j) childAt2).c() | z;
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        C1087i c1087i = this.f2036s;
        if (c1087i != null) {
            c1087i.f();
            C1084f c1084f = this.f2036s.f9832r;
            if (c1084f == null || !c1084f.b()) {
                return;
            }
            this.f2036s.g();
            this.f2036s.k();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C1087i c1087i = this.f2036s;
        if (c1087i != null) {
            c1087i.g();
            C1084f c1084f = c1087i.f9833s;
            if (c1084f == null || !c1084f.b()) {
                return;
            }
            c1084f.f9649i.dismiss();
        }
    }

    @Override // l.F, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i3, int i4, int i5, int i6) {
        int width;
        int i7;
        if (!this.f2037t) {
            super.onLayout(z, i3, i4, i5, i6);
            return;
        }
        int childCount = getChildCount();
        int i8 = (i6 - i4) / 2;
        int dividerWidth = getDividerWidth();
        int i9 = i5 - i3;
        int paddingRight = (i9 - getPaddingRight()) - getPaddingLeft();
        boolean a3 = w0.a(this);
        int i10 = 0;
        int i11 = 0;
        for (int i12 = 0; i12 < childCount; i12++) {
            View childAt = getChildAt(i12);
            if (childAt.getVisibility() != 8) {
                C1089k c1089k = (C1089k) childAt.getLayoutParams();
                if (c1089k.f9841c) {
                    int measuredWidth = childAt.getMeasuredWidth();
                    if (j(i12)) {
                        measuredWidth += dividerWidth;
                    }
                    int measuredHeight = childAt.getMeasuredHeight();
                    if (a3) {
                        i7 = getPaddingLeft() + ((ViewGroup.MarginLayoutParams) c1089k).leftMargin;
                        width = i7 + measuredWidth;
                    } else {
                        width = (getWidth() - getPaddingRight()) - ((ViewGroup.MarginLayoutParams) c1089k).rightMargin;
                        i7 = width - measuredWidth;
                    }
                    int i13 = i8 - (measuredHeight / 2);
                    childAt.layout(i7, i13, width, measuredHeight + i13);
                    paddingRight -= measuredWidth;
                    i10 = 1;
                } else {
                    paddingRight -= (childAt.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) c1089k).leftMargin) + ((ViewGroup.MarginLayoutParams) c1089k).rightMargin;
                    j(i12);
                    i11++;
                }
            }
        }
        if (childCount == 1 && i10 == 0) {
            View childAt2 = getChildAt(0);
            int measuredWidth2 = childAt2.getMeasuredWidth();
            int measuredHeight2 = childAt2.getMeasuredHeight();
            int i14 = (i9 / 2) - (measuredWidth2 / 2);
            int i15 = i8 - (measuredHeight2 / 2);
            childAt2.layout(i14, i15, measuredWidth2 + i14, measuredHeight2 + i15);
            return;
        }
        int i16 = i11 - (i10 ^ 1);
        int max = Math.max(0, i16 > 0 ? paddingRight / i16 : 0);
        if (a3) {
            int width2 = getWidth() - getPaddingRight();
            for (int i17 = 0; i17 < childCount; i17++) {
                View childAt3 = getChildAt(i17);
                C1089k c1089k2 = (C1089k) childAt3.getLayoutParams();
                if (childAt3.getVisibility() != 8 && !c1089k2.f9841c) {
                    int i18 = width2 - ((ViewGroup.MarginLayoutParams) c1089k2).rightMargin;
                    int measuredWidth3 = childAt3.getMeasuredWidth();
                    int measuredHeight3 = childAt3.getMeasuredHeight();
                    int i19 = i8 - (measuredHeight3 / 2);
                    childAt3.layout(i18 - measuredWidth3, i19, i18, measuredHeight3 + i19);
                    width2 = i18 - ((measuredWidth3 + ((ViewGroup.MarginLayoutParams) c1089k2).leftMargin) + max);
                }
            }
            return;
        }
        int paddingLeft = getPaddingLeft();
        for (int i20 = 0; i20 < childCount; i20++) {
            View childAt4 = getChildAt(i20);
            C1089k c1089k3 = (C1089k) childAt4.getLayoutParams();
            if (childAt4.getVisibility() != 8 && !c1089k3.f9841c) {
                int i21 = paddingLeft + ((ViewGroup.MarginLayoutParams) c1089k3).leftMargin;
                int measuredWidth4 = childAt4.getMeasuredWidth();
                int measuredHeight4 = childAt4.getMeasuredHeight();
                int i22 = i8 - (measuredHeight4 / 2);
                childAt4.layout(i21, i22, i21 + measuredWidth4, measuredHeight4 + i22);
                paddingLeft = measuredWidth4 + ((ViewGroup.MarginLayoutParams) c1089k3).rightMargin + max + i21;
            }
        }
    }

    /* JADX WARN: Type inference failed for: r11v14 */
    /* JADX WARN: Type inference failed for: r11v15, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r11v17 */
    /* JADX WARN: Type inference failed for: r11v40 */
    @Override // l.F, android.view.View
    public final void onMeasure(int i3, int i4) {
        int i5;
        int i6;
        ?? r11;
        int i7;
        int i8;
        MenuC1065j menuC1065j;
        boolean z = this.f2037t;
        boolean z2 = View.MeasureSpec.getMode(i3) == 1073741824;
        this.f2037t = z2;
        if (z != z2) {
            this.f2038u = 0;
        }
        int size = View.MeasureSpec.getSize(i3);
        if (this.f2037t && (menuC1065j = this.f2033p) != null && size != this.f2038u) {
            this.f2038u = size;
            menuC1065j.o(true);
        }
        int childCount = getChildCount();
        if (!this.f2037t || childCount <= 0) {
            for (int i9 = 0; i9 < childCount; i9++) {
                C1089k c1089k = (C1089k) getChildAt(i9).getLayoutParams();
                ((ViewGroup.MarginLayoutParams) c1089k).rightMargin = 0;
                ((ViewGroup.MarginLayoutParams) c1089k).leftMargin = 0;
            }
            super.onMeasure(i3, i4);
            return;
        }
        int mode = View.MeasureSpec.getMode(i4);
        int size2 = View.MeasureSpec.getSize(i3);
        int size3 = View.MeasureSpec.getSize(i4);
        int paddingRight = getPaddingRight() + getPaddingLeft();
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i4, paddingBottom, -2);
        int i10 = size2 - paddingRight;
        int i11 = this.v;
        int i12 = i10 / i11;
        int i13 = i10 % i11;
        if (i12 == 0) {
            setMeasuredDimension(i10, 0);
            return;
        }
        int i14 = (i13 / i12) + i11;
        int childCount2 = getChildCount();
        int i15 = 0;
        int i16 = 0;
        int i17 = 0;
        int i18 = 0;
        boolean z3 = false;
        int i19 = 0;
        long j3 = 0;
        while (true) {
            i5 = this.f2039w;
            if (i18 >= childCount2) {
                break;
            }
            View childAt = getChildAt(i18);
            int i20 = size3;
            int i21 = paddingBottom;
            if (childAt.getVisibility() == 8) {
                i7 = i14;
            } else {
                boolean z4 = childAt instanceof ActionMenuItemView;
                i16++;
                if (z4) {
                    childAt.setPadding(i5, 0, i5, 0);
                }
                C1089k c1089k2 = (C1089k) childAt.getLayoutParams();
                c1089k2.f9845h = false;
                c1089k2.f9843e = 0;
                c1089k2.f9842d = 0;
                c1089k2.f = false;
                ((ViewGroup.MarginLayoutParams) c1089k2).leftMargin = 0;
                ((ViewGroup.MarginLayoutParams) c1089k2).rightMargin = 0;
                c1089k2.f9844g = z4 && !TextUtils.isEmpty(((ActionMenuItemView) childAt).getText());
                int i22 = c1089k2.f9841c ? 1 : i12;
                C1089k c1089k3 = (C1089k) childAt.getLayoutParams();
                int i23 = i12;
                i7 = i14;
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(childMeasureSpec) - i21, View.MeasureSpec.getMode(childMeasureSpec));
                ActionMenuItemView actionMenuItemView = z4 ? (ActionMenuItemView) childAt : null;
                boolean z5 = (actionMenuItemView == null || TextUtils.isEmpty(actionMenuItemView.getText())) ? false : true;
                boolean z6 = z5;
                if (i22 <= 0 || (z5 && i22 < 2)) {
                    i8 = 0;
                } else {
                    childAt.measure(View.MeasureSpec.makeMeasureSpec(i7 * i22, Integer.MIN_VALUE), makeMeasureSpec);
                    int measuredWidth = childAt.getMeasuredWidth();
                    i8 = measuredWidth / i7;
                    if (measuredWidth % i7 != 0) {
                        i8++;
                    }
                    if (z6 && i8 < 2) {
                        i8 = 2;
                    }
                }
                c1089k3.f = !c1089k3.f9841c && z6;
                c1089k3.f9842d = i8;
                childAt.measure(View.MeasureSpec.makeMeasureSpec(i8 * i7, 1073741824), makeMeasureSpec);
                i17 = Math.max(i17, i8);
                if (c1089k2.f) {
                    i19++;
                }
                if (c1089k2.f9841c) {
                    z3 = true;
                }
                i12 = i23 - i8;
                i15 = Math.max(i15, childAt.getMeasuredHeight());
                if (i8 == 1) {
                    j3 |= 1 << i18;
                }
            }
            i18++;
            size3 = i20;
            paddingBottom = i21;
            i14 = i7;
        }
        int i24 = size3;
        int i25 = i12;
        int i26 = i14;
        boolean z7 = z3 && i16 == 2;
        int i27 = i25;
        boolean z8 = false;
        while (i19 > 0 && i27 > 0) {
            int i28 = Integer.MAX_VALUE;
            long j4 = 0;
            int i29 = 0;
            int i30 = 0;
            while (i30 < childCount2) {
                boolean z9 = z7;
                C1089k c1089k4 = (C1089k) getChildAt(i30).getLayoutParams();
                int i31 = i15;
                if (c1089k4.f) {
                    int i32 = c1089k4.f9842d;
                    if (i32 < i28) {
                        j4 = 1 << i30;
                        i28 = i32;
                        i29 = 1;
                    } else if (i32 == i28) {
                        j4 |= 1 << i30;
                        i29++;
                    }
                }
                i30++;
                i15 = i31;
                z7 = z9;
            }
            boolean z10 = z7;
            i6 = i15;
            j3 |= j4;
            if (i29 > i27) {
                break;
            }
            int i33 = i28 + 1;
            int i34 = 0;
            while (i34 < childCount2) {
                View childAt2 = getChildAt(i34);
                C1089k c1089k5 = (C1089k) childAt2.getLayoutParams();
                boolean z11 = z3;
                long j5 = 1 << i34;
                if ((j4 & j5) != 0) {
                    if (z10 && c1089k5.f9844g) {
                        r11 = 1;
                        r11 = 1;
                        if (i27 == 1) {
                            childAt2.setPadding(i5 + i26, 0, i5, 0);
                        }
                    } else {
                        r11 = 1;
                    }
                    c1089k5.f9842d += r11;
                    c1089k5.f9845h = r11;
                    i27--;
                } else if (c1089k5.f9842d == i33) {
                    j3 |= j5;
                }
                i34++;
                z3 = z11;
            }
            i15 = i6;
            z7 = z10;
            z8 = true;
        }
        i6 = i15;
        boolean z12 = !z3 && i16 == 1;
        if (i27 > 0 && j3 != 0 && (i27 < i16 - 1 || z12 || i17 > 1)) {
            float bitCount = Long.bitCount(j3);
            if (!z12) {
                if ((j3 & 1) != 0 && !((C1089k) getChildAt(0).getLayoutParams()).f9844g) {
                    bitCount -= 0.5f;
                }
                int i35 = childCount2 - 1;
                if ((j3 & (1 << i35)) != 0 && !((C1089k) getChildAt(i35).getLayoutParams()).f9844g) {
                    bitCount -= 0.5f;
                }
            }
            int i36 = bitCount > 0.0f ? (int) ((i27 * i26) / bitCount) : 0;
            boolean z13 = z8;
            for (int i37 = 0; i37 < childCount2; i37++) {
                if ((j3 & (1 << i37)) != 0) {
                    View childAt3 = getChildAt(i37);
                    C1089k c1089k6 = (C1089k) childAt3.getLayoutParams();
                    if (childAt3 instanceof ActionMenuItemView) {
                        c1089k6.f9843e = i36;
                        c1089k6.f9845h = true;
                        if (i37 == 0 && !c1089k6.f9844g) {
                            ((ViewGroup.MarginLayoutParams) c1089k6).leftMargin = (-i36) / 2;
                        }
                        z13 = true;
                    } else if (c1089k6.f9841c) {
                        c1089k6.f9843e = i36;
                        c1089k6.f9845h = true;
                        ((ViewGroup.MarginLayoutParams) c1089k6).rightMargin = (-i36) / 2;
                        z13 = true;
                    } else {
                        if (i37 != 0) {
                            ((ViewGroup.MarginLayoutParams) c1089k6).leftMargin = i36 / 2;
                        }
                        if (i37 != childCount2 - 1) {
                            ((ViewGroup.MarginLayoutParams) c1089k6).rightMargin = i36 / 2;
                        }
                    }
                }
            }
            z8 = z13;
        }
        if (z8) {
            for (int i38 = 0; i38 < childCount2; i38++) {
                View childAt4 = getChildAt(i38);
                C1089k c1089k7 = (C1089k) childAt4.getLayoutParams();
                if (c1089k7.f9845h) {
                    childAt4.measure(View.MeasureSpec.makeMeasureSpec((c1089k7.f9842d * i26) + c1089k7.f9843e, 1073741824), childMeasureSpec);
                }
            }
        }
        setMeasuredDimension(i10, mode != 1073741824 ? i6 : i24);
    }

    public void setExpandedActionViewsExclusive(boolean z) {
        this.f2036s.f9830p = z;
    }

    public void setOnMenuItemClickListener(InterfaceC1090l interfaceC1090l) {
        this.f2040x = interfaceC1090l;
    }

    public void setOverflowIcon(Drawable drawable) {
        getMenu();
        C1087i c1087i = this.f2036s;
        C1086h c1086h = c1087i.f9823h;
        if (c1086h != null) {
            c1086h.setImageDrawable(drawable);
        } else {
            c1087i.f9825j = true;
            c1087i.f9824i = drawable;
        }
    }

    public void setOverflowReserved(boolean z) {
    }

    public void setPopupTheme(int i3) {
        if (this.f2035r != i3) {
            this.f2035r = i3;
            if (i3 == 0) {
                this.f2034q = getContext();
            } else {
                this.f2034q = new ContextThemeWrapper(getContext(), i3);
            }
        }
    }

    public void setPresenter(C1087i c1087i) {
        this.f2036s = c1087i;
        c1087i.f9822g = this;
        this.f2033p = c1087i.f9819c;
    }

    @Override // l.F, android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new C1089k(getContext(), attributeSet);
    }
}
