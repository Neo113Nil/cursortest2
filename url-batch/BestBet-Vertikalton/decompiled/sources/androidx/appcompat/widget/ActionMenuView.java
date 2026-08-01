package androidx.appcompat.widget;

import R0.e;
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
import android.widget.LinearLayout;
import androidx.appcompat.view.menu.ActionMenuItemView;
import androidx.recyclerview.widget.RecyclerView;
import k.C0191o;
import k.C0192p;
import k.InterfaceC0172B;
import k.InterfaceC0188l;
import k.MenuC0189m;
import l.AbstractC0267w0;
import l.C0234g;
import l.C0240j;
import l.C0242k;
import l.C0246m;
import l.C0265v0;
import l.InterfaceC0244l;
import l.InterfaceC0248n;
import l.V0;
import l.h1;

/* loaded from: classes.dex */
public class ActionMenuView extends AbstractC0267w0 implements InterfaceC0188l, InterfaceC0172B {

    /* renamed from: p, reason: collision with root package name */
    public MenuC0189m f1707p;

    /* renamed from: q, reason: collision with root package name */
    public Context f1708q;

    /* renamed from: r, reason: collision with root package name */
    public int f1709r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f1710s;

    /* renamed from: t, reason: collision with root package name */
    public C0242k f1711t;

    /* renamed from: u, reason: collision with root package name */
    public V0 f1712u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f1713v;

    /* renamed from: w, reason: collision with root package name */
    public int f1714w;

    /* renamed from: x, reason: collision with root package name */
    public final int f1715x;

    /* renamed from: y, reason: collision with root package name */
    public final int f1716y;

    /* renamed from: z, reason: collision with root package name */
    public InterfaceC0248n f1717z;

    public ActionMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setBaselineAligned(false);
        float f2 = context.getResources().getDisplayMetrics().density;
        this.f1715x = (int) (56.0f * f2);
        this.f1716y = (int) (f2 * 4.0f);
        this.f1708q = context;
        this.f1709r = 0;
    }

    public static C0246m j() {
        C0246m c0246m = new C0246m(-2, -2);
        c0246m.f3430a = false;
        ((LinearLayout.LayoutParams) c0246m).gravity = 16;
        return c0246m;
    }

    public static C0246m k(ViewGroup.LayoutParams layoutParams) {
        C0246m c0246m;
        if (layoutParams == null) {
            return j();
        }
        if (layoutParams instanceof C0246m) {
            C0246m c0246m2 = (C0246m) layoutParams;
            c0246m = new C0246m(c0246m2);
            c0246m.f3430a = c0246m2.f3430a;
        } else {
            c0246m = new C0246m(layoutParams);
        }
        if (((LinearLayout.LayoutParams) c0246m).gravity <= 0) {
            ((LinearLayout.LayoutParams) c0246m).gravity = 16;
        }
        return c0246m;
    }

    @Override // k.InterfaceC0188l
    public final boolean b(C0192p c0192p) {
        return this.f1707p.q(c0192p, null, 0);
    }

    @Override // k.InterfaceC0172B
    public final void c(MenuC0189m menuC0189m) {
        this.f1707p = menuC0189m;
    }

    @Override // l.AbstractC0267w0, android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C0246m;
    }

    @Override // android.view.View
    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return false;
    }

    @Override // l.AbstractC0267w0
    /* renamed from: f */
    public final /* bridge */ /* synthetic */ C0265v0 generateDefaultLayoutParams() {
        return j();
    }

    @Override // l.AbstractC0267w0
    /* renamed from: g */
    public final C0265v0 generateLayoutParams(AttributeSet attributeSet) {
        return new C0246m(getContext(), attributeSet);
    }

    @Override // l.AbstractC0267w0, android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return j();
    }

    @Override // l.AbstractC0267w0, android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return k(layoutParams);
    }

    public Menu getMenu() {
        if (this.f1707p == null) {
            Context context = getContext();
            MenuC0189m menuC0189m = new MenuC0189m(context);
            this.f1707p = menuC0189m;
            menuC0189m.f3166e = new C0191o(this);
            C0242k c0242k = new C0242k(context);
            this.f1711t = c0242k;
            c0242k.f3416l = true;
            c0242k.f3417m = true;
            c0242k.f3411e = new e(26);
            this.f1707p.b(c0242k, this.f1708q);
            C0242k c0242k2 = this.f1711t;
            c0242k2.h = this;
            this.f1707p = c0242k2.f3410c;
        }
        return this.f1707p;
    }

    public Drawable getOverflowIcon() {
        getMenu();
        C0242k c0242k = this.f1711t;
        C0240j c0240j = c0242k.i;
        if (c0240j != null) {
            return c0240j.getDrawable();
        }
        if (c0242k.f3415k) {
            return c0242k.f3414j;
        }
        return null;
    }

    public int getPopupTheme() {
        return this.f1709r;
    }

    public int getWindowAnimations() {
        return 0;
    }

    @Override // l.AbstractC0267w0
    /* renamed from: h */
    public final /* bridge */ /* synthetic */ C0265v0 generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return k(layoutParams);
    }

    public final boolean l(int i) {
        boolean z2 = false;
        if (i == 0) {
            return false;
        }
        KeyEvent.Callback childAt = getChildAt(i - 1);
        KeyEvent.Callback childAt2 = getChildAt(i);
        if (i < getChildCount() && (childAt instanceof InterfaceC0244l)) {
            z2 = ((InterfaceC0244l) childAt).c();
        }
        return (i <= 0 || !(childAt2 instanceof InterfaceC0244l)) ? z2 : z2 | ((InterfaceC0244l) childAt2).b();
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        C0242k c0242k = this.f1711t;
        if (c0242k != null) {
            c0242k.c();
            if (this.f1711t.i()) {
                this.f1711t.f();
                this.f1711t.l();
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C0242k c0242k = this.f1711t;
        if (c0242k != null) {
            c0242k.f();
            C0234g c0234g = c0242k.f3424t;
            if (c0234g == null || !c0234g.b()) {
                return;
            }
            c0234g.i.dismiss();
        }
    }

    @Override // l.AbstractC0267w0, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z2, int i, int i2, int i3, int i4) {
        int width;
        int i5;
        if (!this.f1713v) {
            super.onLayout(z2, i, i2, i3, i4);
            return;
        }
        int childCount = getChildCount();
        int i6 = (i4 - i2) / 2;
        int dividerWidth = getDividerWidth();
        int i7 = i3 - i;
        int paddingRight = (i7 - getPaddingRight()) - getPaddingLeft();
        boolean z3 = h1.f3403a;
        boolean z4 = getLayoutDirection() == 1;
        int i8 = 0;
        int i9 = 0;
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            if (childAt.getVisibility() != 8) {
                C0246m c0246m = (C0246m) childAt.getLayoutParams();
                if (c0246m.f3430a) {
                    int measuredWidth = childAt.getMeasuredWidth();
                    if (l(i10)) {
                        measuredWidth += dividerWidth;
                    }
                    int measuredHeight = childAt.getMeasuredHeight();
                    if (z4) {
                        i5 = getPaddingLeft() + ((LinearLayout.LayoutParams) c0246m).leftMargin;
                        width = i5 + measuredWidth;
                    } else {
                        width = (getWidth() - getPaddingRight()) - ((LinearLayout.LayoutParams) c0246m).rightMargin;
                        i5 = width - measuredWidth;
                    }
                    int i11 = i6 - (measuredHeight / 2);
                    childAt.layout(i5, i11, width, measuredHeight + i11);
                    paddingRight -= measuredWidth;
                    i8 = 1;
                } else {
                    paddingRight -= (childAt.getMeasuredWidth() + ((LinearLayout.LayoutParams) c0246m).leftMargin) + ((LinearLayout.LayoutParams) c0246m).rightMargin;
                    l(i10);
                    i9++;
                }
            }
        }
        if (childCount == 1 && i8 == 0) {
            View childAt2 = getChildAt(0);
            int measuredWidth2 = childAt2.getMeasuredWidth();
            int measuredHeight2 = childAt2.getMeasuredHeight();
            int i12 = (i7 / 2) - (measuredWidth2 / 2);
            int i13 = i6 - (measuredHeight2 / 2);
            childAt2.layout(i12, i13, measuredWidth2 + i12, measuredHeight2 + i13);
            return;
        }
        int i14 = i9 - (i8 ^ 1);
        int max = Math.max(0, i14 > 0 ? paddingRight / i14 : 0);
        if (z4) {
            int width2 = getWidth() - getPaddingRight();
            for (int i15 = 0; i15 < childCount; i15++) {
                View childAt3 = getChildAt(i15);
                C0246m c0246m2 = (C0246m) childAt3.getLayoutParams();
                if (childAt3.getVisibility() != 8 && !c0246m2.f3430a) {
                    int i16 = width2 - ((LinearLayout.LayoutParams) c0246m2).rightMargin;
                    int measuredWidth3 = childAt3.getMeasuredWidth();
                    int measuredHeight3 = childAt3.getMeasuredHeight();
                    int i17 = i6 - (measuredHeight3 / 2);
                    childAt3.layout(i16 - measuredWidth3, i17, i16, measuredHeight3 + i17);
                    width2 = i16 - ((measuredWidth3 + ((LinearLayout.LayoutParams) c0246m2).leftMargin) + max);
                }
            }
            return;
        }
        int paddingLeft = getPaddingLeft();
        for (int i18 = 0; i18 < childCount; i18++) {
            View childAt4 = getChildAt(i18);
            C0246m c0246m3 = (C0246m) childAt4.getLayoutParams();
            if (childAt4.getVisibility() != 8 && !c0246m3.f3430a) {
                int i19 = paddingLeft + ((LinearLayout.LayoutParams) c0246m3).leftMargin;
                int measuredWidth4 = childAt4.getMeasuredWidth();
                int measuredHeight4 = childAt4.getMeasuredHeight();
                int i20 = i6 - (measuredHeight4 / 2);
                childAt4.layout(i19, i20, i19 + measuredWidth4, measuredHeight4 + i20);
                paddingLeft = measuredWidth4 + ((LinearLayout.LayoutParams) c0246m3).rightMargin + max + i19;
            }
        }
    }

    /* JADX WARN: Type inference failed for: r4v28 */
    /* JADX WARN: Type inference failed for: r4v29, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r4v31 */
    /* JADX WARN: Type inference failed for: r4v36 */
    @Override // l.AbstractC0267w0, android.view.View
    public final void onMeasure(int i, int i2) {
        int i3;
        boolean z2;
        int i4;
        boolean z3;
        int i5;
        int i6;
        int i7;
        ?? r4;
        int i8;
        int i9;
        int i10;
        MenuC0189m menuC0189m;
        boolean z4 = this.f1713v;
        boolean z5 = View.MeasureSpec.getMode(i) == 1073741824;
        this.f1713v = z5;
        if (z4 != z5) {
            this.f1714w = 0;
        }
        int size = View.MeasureSpec.getSize(i);
        if (this.f1713v && (menuC0189m = this.f1707p) != null && size != this.f1714w) {
            this.f1714w = size;
            menuC0189m.p(true);
        }
        int childCount = getChildCount();
        if (!this.f1713v || childCount <= 0) {
            for (int i11 = 0; i11 < childCount; i11++) {
                C0246m c0246m = (C0246m) getChildAt(i11).getLayoutParams();
                ((LinearLayout.LayoutParams) c0246m).rightMargin = 0;
                ((LinearLayout.LayoutParams) c0246m).leftMargin = 0;
            }
            super.onMeasure(i, i2);
            return;
        }
        int mode = View.MeasureSpec.getMode(i2);
        int size2 = View.MeasureSpec.getSize(i);
        int size3 = View.MeasureSpec.getSize(i2);
        int paddingRight = getPaddingRight() + getPaddingLeft();
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i2, paddingBottom, -2);
        int i12 = size2 - paddingRight;
        int i13 = this.f1715x;
        int i14 = i12 / i13;
        int i15 = i12 % i13;
        if (i14 == 0) {
            setMeasuredDimension(i12, 0);
            return;
        }
        int i16 = (i15 / i14) + i13;
        int childCount2 = getChildCount();
        int i17 = 0;
        int i18 = 0;
        int i19 = 0;
        int i20 = 0;
        boolean z6 = false;
        int i21 = 0;
        long j2 = 0;
        while (true) {
            i3 = this.f1716y;
            if (i20 >= childCount2) {
                break;
            }
            View childAt = getChildAt(i20);
            int i22 = size3;
            int i23 = i12;
            if (childAt.getVisibility() == 8) {
                i8 = mode;
                i9 = paddingBottom;
            } else {
                boolean z7 = childAt instanceof ActionMenuItemView;
                int i24 = i18 + 1;
                if (z7) {
                    childAt.setPadding(i3, 0, i3, 0);
                }
                C0246m c0246m2 = (C0246m) childAt.getLayoutParams();
                c0246m2.f3434f = false;
                c0246m2.f3432c = 0;
                c0246m2.f3431b = 0;
                c0246m2.d = false;
                ((LinearLayout.LayoutParams) c0246m2).leftMargin = 0;
                ((LinearLayout.LayoutParams) c0246m2).rightMargin = 0;
                c0246m2.f3433e = z7 && !TextUtils.isEmpty(((ActionMenuItemView) childAt).getText());
                int i25 = c0246m2.f3430a ? 1 : i14;
                C0246m c0246m3 = (C0246m) childAt.getLayoutParams();
                i8 = mode;
                i9 = paddingBottom;
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(childMeasureSpec) - paddingBottom, View.MeasureSpec.getMode(childMeasureSpec));
                ActionMenuItemView actionMenuItemView = z7 ? (ActionMenuItemView) childAt : null;
                boolean z8 = (actionMenuItemView == null || TextUtils.isEmpty(actionMenuItemView.getText())) ? false : true;
                if (i25 <= 0 || (z8 && i25 < 2)) {
                    i10 = 0;
                } else {
                    childAt.measure(View.MeasureSpec.makeMeasureSpec(i25 * i16, Integer.MIN_VALUE), makeMeasureSpec);
                    int measuredWidth = childAt.getMeasuredWidth();
                    i10 = measuredWidth / i16;
                    if (measuredWidth % i16 != 0) {
                        i10++;
                    }
                    if (z8 && i10 < 2) {
                        i10 = 2;
                    }
                }
                c0246m3.d = !c0246m3.f3430a && z8;
                c0246m3.f3431b = i10;
                childAt.measure(View.MeasureSpec.makeMeasureSpec(i10 * i16, 1073741824), makeMeasureSpec);
                i19 = Math.max(i19, i10);
                if (c0246m2.d) {
                    i21++;
                }
                if (c0246m2.f3430a) {
                    z6 = true;
                }
                i14 -= i10;
                i17 = Math.max(i17, childAt.getMeasuredHeight());
                if (i10 == 1) {
                    j2 |= 1 << i20;
                }
                i18 = i24;
            }
            i20++;
            size3 = i22;
            i12 = i23;
            paddingBottom = i9;
            mode = i8;
        }
        int i26 = mode;
        int i27 = i12;
        int i28 = size3;
        boolean z9 = z6 && i18 == 2;
        boolean z10 = false;
        while (i21 > 0 && i14 > 0) {
            int i29 = Integer.MAX_VALUE;
            int i30 = 0;
            int i31 = 0;
            long j3 = 0;
            while (i31 < childCount2) {
                C0246m c0246m4 = (C0246m) getChildAt(i31).getLayoutParams();
                boolean z11 = z10;
                if (c0246m4.d) {
                    int i32 = c0246m4.f3431b;
                    if (i32 < i29) {
                        j3 = 1 << i31;
                        i29 = i32;
                        i30 = 1;
                    } else if (i32 == i29) {
                        j3 |= 1 << i31;
                        i30++;
                    }
                }
                i31++;
                z10 = z11;
            }
            z2 = z10;
            j2 |= j3;
            if (i30 > i14) {
                break;
            }
            int i33 = i29 + 1;
            int i34 = 0;
            while (i34 < childCount2) {
                View childAt2 = getChildAt(i34);
                C0246m c0246m5 = (C0246m) childAt2.getLayoutParams();
                int i35 = i17;
                int i36 = childMeasureSpec;
                int i37 = childCount2;
                long j4 = 1 << i34;
                if ((j3 & j4) != 0) {
                    if (z9 && c0246m5.f3433e) {
                        r4 = 1;
                        r4 = 1;
                        if (i14 == 1) {
                            childAt2.setPadding(i3 + i16, 0, i3, 0);
                        }
                    } else {
                        r4 = 1;
                    }
                    c0246m5.f3431b += r4;
                    c0246m5.f3434f = r4;
                    i14--;
                } else if (c0246m5.f3431b == i33) {
                    j2 |= j4;
                }
                i34++;
                childMeasureSpec = i36;
                i17 = i35;
                childCount2 = i37;
            }
            z10 = true;
        }
        z2 = z10;
        int i38 = i17;
        int i39 = childMeasureSpec;
        int i40 = childCount2;
        boolean z12 = !z6 && i18 == 1;
        if (i14 <= 0 || j2 == 0 || (i14 >= i18 - 1 && !z12 && i19 <= 1)) {
            i4 = i40;
            z3 = z2;
        } else {
            float bitCount = Long.bitCount(j2);
            if (!z12) {
                if ((j2 & 1) != 0 && !((C0246m) getChildAt(0).getLayoutParams()).f3433e) {
                    bitCount -= 0.5f;
                }
                int i41 = i40 - 1;
                if ((j2 & (1 << i41)) != 0 && !((C0246m) getChildAt(i41).getLayoutParams()).f3433e) {
                    bitCount -= 0.5f;
                }
            }
            int i42 = bitCount > RecyclerView.f1937A0 ? (int) ((i14 * i16) / bitCount) : 0;
            boolean z13 = z2;
            i4 = i40;
            for (int i43 = 0; i43 < i4; i43++) {
                if ((j2 & (1 << i43)) != 0) {
                    View childAt3 = getChildAt(i43);
                    C0246m c0246m6 = (C0246m) childAt3.getLayoutParams();
                    if (childAt3 instanceof ActionMenuItemView) {
                        c0246m6.f3432c = i42;
                        c0246m6.f3434f = true;
                        if (i43 == 0 && !c0246m6.f3433e) {
                            ((LinearLayout.LayoutParams) c0246m6).leftMargin = (-i42) / 2;
                        }
                        z13 = true;
                    } else {
                        if (c0246m6.f3430a) {
                            c0246m6.f3432c = i42;
                            c0246m6.f3434f = true;
                            ((LinearLayout.LayoutParams) c0246m6).rightMargin = (-i42) / 2;
                            z13 = true;
                        } else {
                            if (i43 != 0) {
                                ((LinearLayout.LayoutParams) c0246m6).leftMargin = i42 / 2;
                            }
                            if (i43 != i4 - 1) {
                                ((LinearLayout.LayoutParams) c0246m6).rightMargin = i42 / 2;
                            }
                        }
                    }
                }
            }
            z3 = z13;
        }
        if (z3) {
            int i44 = 0;
            while (i44 < i4) {
                View childAt4 = getChildAt(i44);
                C0246m c0246m7 = (C0246m) childAt4.getLayoutParams();
                if (c0246m7.f3434f) {
                    i7 = i39;
                    childAt4.measure(View.MeasureSpec.makeMeasureSpec((c0246m7.f3431b * i16) + c0246m7.f3432c, 1073741824), i7);
                } else {
                    i7 = i39;
                }
                i44++;
                i39 = i7;
            }
        }
        if (i26 != 1073741824) {
            i6 = i27;
            i5 = i38;
        } else {
            i5 = i28;
            i6 = i27;
        }
        setMeasuredDimension(i6, i5);
    }

    public void setExpandedActionViewsExclusive(boolean z2) {
        this.f1711t.f3421q = z2;
    }

    public void setOnMenuItemClickListener(InterfaceC0248n interfaceC0248n) {
        this.f1717z = interfaceC0248n;
    }

    public void setOverflowIcon(Drawable drawable) {
        getMenu();
        C0242k c0242k = this.f1711t;
        C0240j c0240j = c0242k.i;
        if (c0240j != null) {
            c0240j.setImageDrawable(drawable);
        } else {
            c0242k.f3415k = true;
            c0242k.f3414j = drawable;
        }
    }

    public void setOverflowReserved(boolean z2) {
        this.f1710s = z2;
    }

    public void setPopupTheme(int i) {
        if (this.f1709r != i) {
            this.f1709r = i;
            if (i == 0) {
                this.f1708q = getContext();
            } else {
                this.f1708q = new ContextThemeWrapper(getContext(), i);
            }
        }
    }

    public void setPresenter(C0242k c0242k) {
        this.f1711t = c0242k;
        c0242k.h = this;
        this.f1707p = c0242k.f3410c;
    }

    @Override // l.AbstractC0267w0, android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new C0246m(getContext(), attributeSet);
    }
}
