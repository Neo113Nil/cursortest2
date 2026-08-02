package androidx.appcompat.widget;

import A0.f;
import E.A;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import b0.r;
import com.fc.barca.football.R;
import g.AbstractC0328a;
import h.AbstractC0337a;
import j.d;
import java.lang.reflect.Field;
import java.util.ArrayList;
import k.MenuC1065j;
import k.MenuItemC1066k;
import l.C1084f;
import l.C1087i;
import l.C1094p;
import l.C1095q;
import l.C1098u;
import l.InterfaceC1101x;
import l.Q;
import l.l0;
import l.m0;
import l.n0;
import l.o0;
import l.p0;
import l.q0;
import l.w0;

/* loaded from: classes.dex */
public class Toolbar extends ViewGroup {

    /* renamed from: A, reason: collision with root package name */
    public ColorStateList f2126A;

    /* renamed from: B, reason: collision with root package name */
    public boolean f2127B;

    /* renamed from: C, reason: collision with root package name */
    public boolean f2128C;

    /* renamed from: D, reason: collision with root package name */
    public final ArrayList f2129D;

    /* renamed from: E, reason: collision with root package name */
    public final ArrayList f2130E;

    /* renamed from: F, reason: collision with root package name */
    public final int[] f2131F;

    /* renamed from: G, reason: collision with root package name */
    public final r f2132G;

    /* renamed from: H, reason: collision with root package name */
    public q0 f2133H;

    /* renamed from: I, reason: collision with root package name */
    public m0 f2134I;

    /* renamed from: J, reason: collision with root package name */
    public boolean f2135J;

    /* renamed from: K, reason: collision with root package name */
    public final B.b f2136K;

    /* renamed from: a, reason: collision with root package name */
    public ActionMenuView f2137a;

    /* renamed from: b, reason: collision with root package name */
    public C1098u f2138b;

    /* renamed from: c, reason: collision with root package name */
    public C1098u f2139c;

    /* renamed from: d, reason: collision with root package name */
    public C1094p f2140d;

    /* renamed from: e, reason: collision with root package name */
    public C1095q f2141e;
    public final Drawable f;

    /* renamed from: g, reason: collision with root package name */
    public final CharSequence f2142g;

    /* renamed from: h, reason: collision with root package name */
    public C1094p f2143h;

    /* renamed from: i, reason: collision with root package name */
    public View f2144i;

    /* renamed from: j, reason: collision with root package name */
    public Context f2145j;

    /* renamed from: k, reason: collision with root package name */
    public int f2146k;

    /* renamed from: l, reason: collision with root package name */
    public int f2147l;

    /* renamed from: m, reason: collision with root package name */
    public int f2148m;

    /* renamed from: n, reason: collision with root package name */
    public final int f2149n;
    public final int o;

    /* renamed from: p, reason: collision with root package name */
    public int f2150p;

    /* renamed from: q, reason: collision with root package name */
    public int f2151q;

    /* renamed from: r, reason: collision with root package name */
    public int f2152r;

    /* renamed from: s, reason: collision with root package name */
    public int f2153s;

    /* renamed from: t, reason: collision with root package name */
    public Q f2154t;

    /* renamed from: u, reason: collision with root package name */
    public int f2155u;
    public int v;

    /* renamed from: w, reason: collision with root package name */
    public final int f2156w;

    /* renamed from: x, reason: collision with root package name */
    public CharSequence f2157x;

    /* renamed from: y, reason: collision with root package name */
    public CharSequence f2158y;
    public ColorStateList z;

    public Toolbar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.toolbarStyle);
        this.f2156w = 8388627;
        this.f2129D = new ArrayList();
        this.f2130E = new ArrayList();
        this.f2131F = new int[2];
        this.f2132G = new r(this);
        this.f2136K = new B.b(14, this);
        f K2 = f.K(getContext(), attributeSet, AbstractC0328a.f5006t, R.attr.toolbarStyle);
        TypedArray typedArray = (TypedArray) K2.f24c;
        this.f2147l = typedArray.getResourceId(28, 0);
        this.f2148m = typedArray.getResourceId(19, 0);
        this.f2156w = typedArray.getInteger(0, 8388627);
        this.f2149n = typedArray.getInteger(2, 48);
        int dimensionPixelOffset = typedArray.getDimensionPixelOffset(22, 0);
        dimensionPixelOffset = typedArray.hasValue(27) ? typedArray.getDimensionPixelOffset(27, dimensionPixelOffset) : dimensionPixelOffset;
        this.f2153s = dimensionPixelOffset;
        this.f2152r = dimensionPixelOffset;
        this.f2151q = dimensionPixelOffset;
        this.f2150p = dimensionPixelOffset;
        int dimensionPixelOffset2 = typedArray.getDimensionPixelOffset(25, -1);
        if (dimensionPixelOffset2 >= 0) {
            this.f2150p = dimensionPixelOffset2;
        }
        int dimensionPixelOffset3 = typedArray.getDimensionPixelOffset(24, -1);
        if (dimensionPixelOffset3 >= 0) {
            this.f2151q = dimensionPixelOffset3;
        }
        int dimensionPixelOffset4 = typedArray.getDimensionPixelOffset(26, -1);
        if (dimensionPixelOffset4 >= 0) {
            this.f2152r = dimensionPixelOffset4;
        }
        int dimensionPixelOffset5 = typedArray.getDimensionPixelOffset(23, -1);
        if (dimensionPixelOffset5 >= 0) {
            this.f2153s = dimensionPixelOffset5;
        }
        this.o = typedArray.getDimensionPixelSize(13, -1);
        int dimensionPixelOffset6 = typedArray.getDimensionPixelOffset(9, Integer.MIN_VALUE);
        int dimensionPixelOffset7 = typedArray.getDimensionPixelOffset(5, Integer.MIN_VALUE);
        int dimensionPixelSize = typedArray.getDimensionPixelSize(7, 0);
        int dimensionPixelSize2 = typedArray.getDimensionPixelSize(8, 0);
        d();
        Q q3 = this.f2154t;
        q3.f9769h = false;
        if (dimensionPixelSize != Integer.MIN_VALUE) {
            q3.f9767e = dimensionPixelSize;
            q3.f9763a = dimensionPixelSize;
        }
        if (dimensionPixelSize2 != Integer.MIN_VALUE) {
            q3.f = dimensionPixelSize2;
            q3.f9764b = dimensionPixelSize2;
        }
        if (dimensionPixelOffset6 != Integer.MIN_VALUE || dimensionPixelOffset7 != Integer.MIN_VALUE) {
            q3.a(dimensionPixelOffset6, dimensionPixelOffset7);
        }
        this.f2155u = typedArray.getDimensionPixelOffset(10, Integer.MIN_VALUE);
        this.v = typedArray.getDimensionPixelOffset(6, Integer.MIN_VALUE);
        this.f = K2.C(4);
        this.f2142g = typedArray.getText(3);
        CharSequence text = typedArray.getText(21);
        if (!TextUtils.isEmpty(text)) {
            setTitle(text);
        }
        CharSequence text2 = typedArray.getText(18);
        if (!TextUtils.isEmpty(text2)) {
            setSubtitle(text2);
        }
        this.f2145j = getContext();
        setPopupTheme(typedArray.getResourceId(17, 0));
        Drawable C3 = K2.C(16);
        if (C3 != null) {
            setNavigationIcon(C3);
        }
        CharSequence text3 = typedArray.getText(15);
        if (!TextUtils.isEmpty(text3)) {
            setNavigationContentDescription(text3);
        }
        Drawable C4 = K2.C(11);
        if (C4 != null) {
            setLogo(C4);
        }
        CharSequence text4 = typedArray.getText(12);
        if (!TextUtils.isEmpty(text4)) {
            setLogoDescription(text4);
        }
        if (typedArray.hasValue(29)) {
            setTitleTextColor(K2.B(29));
        }
        if (typedArray.hasValue(20)) {
            setSubtitleTextColor(K2.B(20));
        }
        if (typedArray.hasValue(14)) {
            getMenuInflater().inflate(typedArray.getResourceId(14, 0), getMenu());
        }
        K2.O();
    }

    public static n0 g() {
        n0 n0Var = new n0(-2, -2);
        n0Var.f9860b = 0;
        n0Var.f9859a = 8388627;
        return n0Var;
    }

    private MenuInflater getMenuInflater() {
        return new d(getContext());
    }

    public static n0 h(ViewGroup.LayoutParams layoutParams) {
        boolean z = layoutParams instanceof n0;
        if (z) {
            n0 n0Var = (n0) layoutParams;
            n0 n0Var2 = new n0(n0Var);
            n0Var2.f9860b = 0;
            n0Var2.f9860b = n0Var.f9860b;
            return n0Var2;
        }
        if (z) {
            n0 n0Var3 = new n0((n0) layoutParams);
            n0Var3.f9860b = 0;
            return n0Var3;
        }
        if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
            n0 n0Var4 = new n0(layoutParams);
            n0Var4.f9860b = 0;
            return n0Var4;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        n0 n0Var5 = new n0(marginLayoutParams);
        n0Var5.f9860b = 0;
        ((ViewGroup.MarginLayoutParams) n0Var5).leftMargin = marginLayoutParams.leftMargin;
        ((ViewGroup.MarginLayoutParams) n0Var5).topMargin = marginLayoutParams.topMargin;
        ((ViewGroup.MarginLayoutParams) n0Var5).rightMargin = marginLayoutParams.rightMargin;
        ((ViewGroup.MarginLayoutParams) n0Var5).bottomMargin = marginLayoutParams.bottomMargin;
        return n0Var5;
    }

    public static int j(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return marginLayoutParams.getMarginEnd() + marginLayoutParams.getMarginStart();
    }

    public static int k(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
    }

    public final void a(ArrayList arrayList, int i3) {
        Field field = A.f243a;
        boolean z = getLayoutDirection() == 1;
        int childCount = getChildCount();
        int absoluteGravity = Gravity.getAbsoluteGravity(i3, getLayoutDirection());
        arrayList.clear();
        if (!z) {
            for (int i4 = 0; i4 < childCount; i4++) {
                View childAt = getChildAt(i4);
                n0 n0Var = (n0) childAt.getLayoutParams();
                if (n0Var.f9860b == 0 && q(childAt)) {
                    int i5 = n0Var.f9859a;
                    Field field2 = A.f243a;
                    int layoutDirection = getLayoutDirection();
                    int absoluteGravity2 = Gravity.getAbsoluteGravity(i5, layoutDirection) & 7;
                    if (absoluteGravity2 != 1 && absoluteGravity2 != 3 && absoluteGravity2 != 5) {
                        absoluteGravity2 = layoutDirection == 1 ? 5 : 3;
                    }
                    if (absoluteGravity2 == absoluteGravity) {
                        arrayList.add(childAt);
                    }
                }
            }
            return;
        }
        for (int i6 = childCount - 1; i6 >= 0; i6--) {
            View childAt2 = getChildAt(i6);
            n0 n0Var2 = (n0) childAt2.getLayoutParams();
            if (n0Var2.f9860b == 0 && q(childAt2)) {
                int i7 = n0Var2.f9859a;
                Field field3 = A.f243a;
                int layoutDirection2 = getLayoutDirection();
                int absoluteGravity3 = Gravity.getAbsoluteGravity(i7, layoutDirection2) & 7;
                if (absoluteGravity3 != 1 && absoluteGravity3 != 3 && absoluteGravity3 != 5) {
                    absoluteGravity3 = layoutDirection2 == 1 ? 5 : 3;
                }
                if (absoluteGravity3 == absoluteGravity) {
                    arrayList.add(childAt2);
                }
            }
        }
    }

    public final void b(View view, boolean z) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        n0 g3 = layoutParams == null ? g() : !checkLayoutParams(layoutParams) ? h(layoutParams) : (n0) layoutParams;
        g3.f9860b = 1;
        if (!z || this.f2144i == null) {
            addView(view, g3);
        } else {
            view.setLayoutParams(g3);
            this.f2130E.add(view);
        }
    }

    public final void c() {
        if (this.f2143h == null) {
            C1094p c1094p = new C1094p(getContext());
            this.f2143h = c1094p;
            c1094p.setImageDrawable(this.f);
            this.f2143h.setContentDescription(this.f2142g);
            n0 g3 = g();
            g3.f9859a = (this.f2149n & 112) | 8388611;
            g3.f9860b = 2;
            this.f2143h.setLayoutParams(g3);
            this.f2143h.setOnClickListener(new l0(this));
        }
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return super.checkLayoutParams(layoutParams) && (layoutParams instanceof n0);
    }

    public final void d() {
        if (this.f2154t == null) {
            Q q3 = new Q();
            q3.f9763a = 0;
            q3.f9764b = 0;
            q3.f9765c = Integer.MIN_VALUE;
            q3.f9766d = Integer.MIN_VALUE;
            q3.f9767e = 0;
            q3.f = 0;
            q3.f9768g = false;
            q3.f9769h = false;
            this.f2154t = q3;
        }
    }

    public final void e() {
        if (this.f2137a == null) {
            ActionMenuView actionMenuView = new ActionMenuView(getContext(), null);
            this.f2137a = actionMenuView;
            actionMenuView.setPopupTheme(this.f2146k);
            this.f2137a.setOnMenuItemClickListener(this.f2132G);
            this.f2137a.getClass();
            n0 g3 = g();
            g3.f9859a = (this.f2149n & 112) | 8388613;
            this.f2137a.setLayoutParams(g3);
            b(this.f2137a, false);
        }
        ActionMenuView actionMenuView2 = this.f2137a;
        if (actionMenuView2.f2033p == null) {
            MenuC1065j menuC1065j = (MenuC1065j) actionMenuView2.getMenu();
            if (this.f2134I == null) {
                this.f2134I = new m0(this);
            }
            this.f2137a.setExpandedActionViewsExclusive(true);
            menuC1065j.b(this.f2134I, this.f2145j);
        }
    }

    public final void f() {
        if (this.f2140d == null) {
            this.f2140d = new C1094p(getContext());
            n0 g3 = g();
            g3.f9859a = (this.f2149n & 112) | 8388611;
            this.f2140d.setLayoutParams(g3);
        }
    }

    @Override // android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return g();
    }

    @Override // android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return h(layoutParams);
    }

    public CharSequence getCollapseContentDescription() {
        C1094p c1094p = this.f2143h;
        if (c1094p != null) {
            return c1094p.getContentDescription();
        }
        return null;
    }

    public Drawable getCollapseIcon() {
        C1094p c1094p = this.f2143h;
        if (c1094p != null) {
            return c1094p.getDrawable();
        }
        return null;
    }

    public int getContentInsetEnd() {
        Q q3 = this.f2154t;
        if (q3 != null) {
            return q3.f9768g ? q3.f9763a : q3.f9764b;
        }
        return 0;
    }

    public int getContentInsetEndWithActions() {
        int i3 = this.v;
        return i3 != Integer.MIN_VALUE ? i3 : getContentInsetEnd();
    }

    public int getContentInsetLeft() {
        Q q3 = this.f2154t;
        if (q3 != null) {
            return q3.f9763a;
        }
        return 0;
    }

    public int getContentInsetRight() {
        Q q3 = this.f2154t;
        if (q3 != null) {
            return q3.f9764b;
        }
        return 0;
    }

    public int getContentInsetStart() {
        Q q3 = this.f2154t;
        if (q3 != null) {
            return q3.f9768g ? q3.f9764b : q3.f9763a;
        }
        return 0;
    }

    public int getContentInsetStartWithNavigation() {
        int i3 = this.f2155u;
        return i3 != Integer.MIN_VALUE ? i3 : getContentInsetStart();
    }

    public int getCurrentContentInsetEnd() {
        MenuC1065j menuC1065j;
        ActionMenuView actionMenuView = this.f2137a;
        return (actionMenuView == null || (menuC1065j = actionMenuView.f2033p) == null || !menuC1065j.hasVisibleItems()) ? getContentInsetEnd() : Math.max(getContentInsetEnd(), Math.max(this.v, 0));
    }

    public int getCurrentContentInsetLeft() {
        Field field = A.f243a;
        return getLayoutDirection() == 1 ? getCurrentContentInsetEnd() : getCurrentContentInsetStart();
    }

    public int getCurrentContentInsetRight() {
        Field field = A.f243a;
        return getLayoutDirection() == 1 ? getCurrentContentInsetStart() : getCurrentContentInsetEnd();
    }

    public int getCurrentContentInsetStart() {
        return getNavigationIcon() != null ? Math.max(getContentInsetStart(), Math.max(this.f2155u, 0)) : getContentInsetStart();
    }

    public Drawable getLogo() {
        C1095q c1095q = this.f2141e;
        if (c1095q != null) {
            return c1095q.getDrawable();
        }
        return null;
    }

    public CharSequence getLogoDescription() {
        C1095q c1095q = this.f2141e;
        if (c1095q != null) {
            return c1095q.getContentDescription();
        }
        return null;
    }

    public Menu getMenu() {
        e();
        return this.f2137a.getMenu();
    }

    public CharSequence getNavigationContentDescription() {
        C1094p c1094p = this.f2140d;
        if (c1094p != null) {
            return c1094p.getContentDescription();
        }
        return null;
    }

    public Drawable getNavigationIcon() {
        C1094p c1094p = this.f2140d;
        if (c1094p != null) {
            return c1094p.getDrawable();
        }
        return null;
    }

    public C1087i getOuterActionMenuPresenter() {
        return null;
    }

    public Drawable getOverflowIcon() {
        e();
        return this.f2137a.getOverflowIcon();
    }

    public Context getPopupContext() {
        return this.f2145j;
    }

    public int getPopupTheme() {
        return this.f2146k;
    }

    public CharSequence getSubtitle() {
        return this.f2158y;
    }

    public final TextView getSubtitleTextView() {
        return this.f2139c;
    }

    public CharSequence getTitle() {
        return this.f2157x;
    }

    public int getTitleMarginBottom() {
        return this.f2153s;
    }

    public int getTitleMarginEnd() {
        return this.f2151q;
    }

    public int getTitleMarginStart() {
        return this.f2150p;
    }

    public int getTitleMarginTop() {
        return this.f2152r;
    }

    public final TextView getTitleTextView() {
        return this.f2138b;
    }

    public InterfaceC1101x getWrapper() {
        Drawable drawable;
        if (this.f2133H == null) {
            q0 q0Var = new q0();
            q0Var.f9880l = 0;
            q0Var.f9870a = this;
            q0Var.f9876h = getTitle();
            q0Var.f9877i = getSubtitle();
            q0Var.f9875g = q0Var.f9876h != null;
            q0Var.f = getNavigationIcon();
            f K2 = f.K(getContext(), null, AbstractC0328a.f4989a, R.attr.actionBarStyle);
            q0Var.f9881m = K2.C(15);
            TypedArray typedArray = (TypedArray) K2.f24c;
            CharSequence text = typedArray.getText(27);
            if (!TextUtils.isEmpty(text)) {
                q0Var.f9875g = true;
                q0Var.f9876h = text;
                if ((q0Var.f9871b & 8) != 0) {
                    q0Var.f9870a.setTitle(text);
                }
            }
            CharSequence text2 = typedArray.getText(25);
            if (!TextUtils.isEmpty(text2)) {
                q0Var.f9877i = text2;
                if ((q0Var.f9871b & 8) != 0) {
                    setSubtitle(text2);
                }
            }
            Drawable C3 = K2.C(20);
            if (C3 != null) {
                q0Var.f9874e = C3;
                q0Var.c();
            }
            Drawable C4 = K2.C(17);
            if (C4 != null) {
                q0Var.f9873d = C4;
                q0Var.c();
            }
            if (q0Var.f == null && (drawable = q0Var.f9881m) != null) {
                q0Var.f = drawable;
                int i3 = q0Var.f9871b & 4;
                Toolbar toolbar = q0Var.f9870a;
                if (i3 != 0) {
                    toolbar.setNavigationIcon(drawable);
                } else {
                    toolbar.setNavigationIcon((Drawable) null);
                }
            }
            q0Var.a(typedArray.getInt(10, 0));
            int resourceId = typedArray.getResourceId(9, 0);
            if (resourceId != 0) {
                View inflate = LayoutInflater.from(getContext()).inflate(resourceId, (ViewGroup) this, false);
                View view = q0Var.f9872c;
                if (view != null && (q0Var.f9871b & 16) != 0) {
                    removeView(view);
                }
                q0Var.f9872c = inflate;
                if (inflate != null && (q0Var.f9871b & 16) != 0) {
                    addView(inflate);
                }
                q0Var.a(q0Var.f9871b | 16);
            }
            int layoutDimension = typedArray.getLayoutDimension(13, 0);
            if (layoutDimension > 0) {
                ViewGroup.LayoutParams layoutParams = getLayoutParams();
                layoutParams.height = layoutDimension;
                setLayoutParams(layoutParams);
            }
            int dimensionPixelOffset = typedArray.getDimensionPixelOffset(7, -1);
            int dimensionPixelOffset2 = typedArray.getDimensionPixelOffset(3, -1);
            if (dimensionPixelOffset >= 0 || dimensionPixelOffset2 >= 0) {
                int max = Math.max(dimensionPixelOffset, 0);
                int max2 = Math.max(dimensionPixelOffset2, 0);
                d();
                this.f2154t.a(max, max2);
            }
            int resourceId2 = typedArray.getResourceId(28, 0);
            if (resourceId2 != 0) {
                Context context = getContext();
                this.f2147l = resourceId2;
                C1098u c1098u = this.f2138b;
                if (c1098u != null) {
                    c1098u.setTextAppearance(context, resourceId2);
                }
            }
            int resourceId3 = typedArray.getResourceId(26, 0);
            if (resourceId3 != 0) {
                Context context2 = getContext();
                this.f2148m = resourceId3;
                C1098u c1098u2 = this.f2139c;
                if (c1098u2 != null) {
                    c1098u2.setTextAppearance(context2, resourceId3);
                }
            }
            int resourceId4 = typedArray.getResourceId(22, 0);
            if (resourceId4 != 0) {
                setPopupTheme(resourceId4);
            }
            K2.O();
            if (R.string.abc_action_bar_up_description != q0Var.f9880l) {
                q0Var.f9880l = R.string.abc_action_bar_up_description;
                if (TextUtils.isEmpty(getNavigationContentDescription())) {
                    int i4 = q0Var.f9880l;
                    q0Var.f9878j = i4 != 0 ? getContext().getString(i4) : null;
                    q0Var.b();
                }
            }
            q0Var.f9878j = getNavigationContentDescription();
            setNavigationOnClickListener(new l0(q0Var));
            this.f2133H = q0Var;
        }
        return this.f2133H;
    }

    public final int i(View view, int i3) {
        n0 n0Var = (n0) view.getLayoutParams();
        int measuredHeight = view.getMeasuredHeight();
        int i4 = i3 > 0 ? (measuredHeight - i3) / 2 : 0;
        int i5 = n0Var.f9859a & 112;
        if (i5 != 16 && i5 != 48 && i5 != 80) {
            i5 = this.f2156w & 112;
        }
        if (i5 == 48) {
            return getPaddingTop() - i4;
        }
        if (i5 == 80) {
            return (((getHeight() - getPaddingBottom()) - measuredHeight) - ((ViewGroup.MarginLayoutParams) n0Var).bottomMargin) - i4;
        }
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int height = getHeight();
        int i6 = (((height - paddingTop) - paddingBottom) - measuredHeight) / 2;
        int i7 = ((ViewGroup.MarginLayoutParams) n0Var).topMargin;
        if (i6 < i7) {
            i6 = i7;
        } else {
            int i8 = (((height - paddingBottom) - measuredHeight) - i6) - paddingTop;
            int i9 = ((ViewGroup.MarginLayoutParams) n0Var).bottomMargin;
            if (i8 < i9) {
                i6 = Math.max(0, i6 - (i9 - i8));
            }
        }
        return paddingTop + i6;
    }

    public final boolean l(View view) {
        return view.getParent() == this || this.f2130E.contains(view);
    }

    public final int m(View view, int i3, int i4, int[] iArr) {
        n0 n0Var = (n0) view.getLayoutParams();
        int i5 = ((ViewGroup.MarginLayoutParams) n0Var).leftMargin - iArr[0];
        int max = Math.max(0, i5) + i3;
        iArr[0] = Math.max(0, -i5);
        int i6 = i(view, i4);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(max, i6, max + measuredWidth, view.getMeasuredHeight() + i6);
        return measuredWidth + ((ViewGroup.MarginLayoutParams) n0Var).rightMargin + max;
    }

    public final int n(View view, int i3, int i4, int[] iArr) {
        n0 n0Var = (n0) view.getLayoutParams();
        int i5 = ((ViewGroup.MarginLayoutParams) n0Var).rightMargin - iArr[1];
        int max = i3 - Math.max(0, i5);
        iArr[1] = Math.max(0, -i5);
        int i6 = i(view, i4);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(max - measuredWidth, i6, max, view.getMeasuredHeight() + i6);
        return max - (measuredWidth + ((ViewGroup.MarginLayoutParams) n0Var).leftMargin);
    }

    public final int o(View view, int i3, int i4, int i5, int i6, int[] iArr) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int i7 = marginLayoutParams.leftMargin - iArr[0];
        int i8 = marginLayoutParams.rightMargin - iArr[1];
        int max = Math.max(0, i8) + Math.max(0, i7);
        iArr[0] = Math.max(0, -i7);
        iArr[1] = Math.max(0, -i8);
        view.measure(ViewGroup.getChildMeasureSpec(i3, getPaddingRight() + getPaddingLeft() + max + i4, marginLayoutParams.width), ViewGroup.getChildMeasureSpec(i5, getPaddingBottom() + getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i6, marginLayoutParams.height));
        return view.getMeasuredWidth() + max;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeCallbacks(this.f2136K);
    }

    @Override // android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.f2128C = false;
        }
        if (!this.f2128C) {
            boolean onHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !onHoverEvent) {
                this.f2128C = true;
            }
        }
        if (actionMasked != 10 && actionMasked != 3) {
            return true;
        }
        this.f2128C = false;
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:111:0x01a2  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0295 A[LOOP:0: B:40:0x0293->B:41:0x0295, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x02ad A[LOOP:1: B:44:0x02ab->B:45:0x02ad, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x02cd A[LOOP:2: B:48:0x02cb->B:49:0x02cd, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0313  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0321 A[LOOP:3: B:57:0x031f->B:58:0x0321, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01af  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x021c  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onLayout(boolean z, int i3, int i4, int i5, int i6) {
        int i7;
        int i8;
        boolean q3;
        boolean q4;
        int i9;
        int i10;
        int i11;
        boolean z2;
        int paddingTop;
        int i12;
        int i13;
        int max;
        int i14;
        int i15;
        int size;
        int i16;
        int i17;
        int size2;
        int i18;
        int size3;
        int i19;
        int i20;
        int size4;
        int i21;
        Field field = A.f243a;
        boolean z3 = getLayoutDirection() == 1;
        int width = getWidth();
        int height = getHeight();
        int paddingLeft = getPaddingLeft();
        int paddingRight = getPaddingRight();
        int paddingTop2 = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int i22 = width - paddingRight;
        int[] iArr = this.f2131F;
        iArr[1] = 0;
        iArr[0] = 0;
        int minimumHeight = getMinimumHeight();
        int min = minimumHeight >= 0 ? Math.min(minimumHeight, i6 - i4) : 0;
        if (!q(this.f2140d)) {
            i7 = paddingLeft;
        } else {
            if (z3) {
                i8 = n(this.f2140d, i22, min, iArr);
                i7 = paddingLeft;
                if (q(this.f2143h)) {
                    if (z3) {
                        i8 = n(this.f2143h, i8, min, iArr);
                    } else {
                        i7 = m(this.f2143h, i7, min, iArr);
                    }
                }
                if (q(this.f2137a)) {
                    if (z3) {
                        i7 = m(this.f2137a, i7, min, iArr);
                    } else {
                        i8 = n(this.f2137a, i8, min, iArr);
                    }
                }
                int currentContentInsetLeft = getCurrentContentInsetLeft();
                int currentContentInsetRight = getCurrentContentInsetRight();
                iArr[0] = Math.max(0, currentContentInsetLeft - i7);
                iArr[1] = Math.max(0, currentContentInsetRight - (i22 - i8));
                int max2 = Math.max(i7, currentContentInsetLeft);
                int min2 = Math.min(i8, i22 - currentContentInsetRight);
                if (q(this.f2144i)) {
                    if (z3) {
                        min2 = n(this.f2144i, min2, min, iArr);
                    } else {
                        max2 = m(this.f2144i, max2, min, iArr);
                    }
                }
                if (q(this.f2141e)) {
                    if (z3) {
                        min2 = n(this.f2141e, min2, min, iArr);
                    } else {
                        max2 = m(this.f2141e, max2, min, iArr);
                    }
                }
                q3 = q(this.f2138b);
                q4 = q(this.f2139c);
                if (q3) {
                    i9 = max2;
                    i10 = 0;
                } else {
                    n0 n0Var = (n0) this.f2138b.getLayoutParams();
                    i9 = max2;
                    i10 = this.f2138b.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) n0Var).topMargin + ((ViewGroup.MarginLayoutParams) n0Var).bottomMargin;
                }
                if (!q4) {
                    n0 n0Var2 = (n0) this.f2139c.getLayoutParams();
                    i10 = this.f2139c.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) n0Var2).topMargin + ((ViewGroup.MarginLayoutParams) n0Var2).bottomMargin + i10;
                }
                if (!q3 || q4) {
                    C1098u c1098u = !q3 ? this.f2138b : this.f2139c;
                    C1098u c1098u2 = !q4 ? this.f2139c : this.f2138b;
                    n0 n0Var3 = (n0) c1098u.getLayoutParams();
                    n0 n0Var4 = (n0) c1098u2.getLayoutParams();
                    int i23 = i10;
                    boolean z4 = (!q3 && this.f2138b.getMeasuredWidth() > 0) || (q4 && this.f2139c.getMeasuredWidth() > 0);
                    i11 = this.f2156w & 112;
                    z2 = z3;
                    if (i11 != 48) {
                        paddingTop = getPaddingTop() + ((ViewGroup.MarginLayoutParams) n0Var3).topMargin + this.f2152r;
                    } else if (i11 != 80) {
                        int i24 = (((height - paddingTop2) - paddingBottom) - i23) / 2;
                        int i25 = ((ViewGroup.MarginLayoutParams) n0Var3).topMargin + this.f2152r;
                        if (i24 < i25) {
                            i24 = i25;
                        } else {
                            int i26 = (((height - paddingBottom) - i23) - i24) - paddingTop2;
                            int i27 = ((ViewGroup.MarginLayoutParams) n0Var3).bottomMargin;
                            int i28 = this.f2153s;
                            if (i26 < i27 + i28) {
                                i24 = Math.max(0, i24 - ((((ViewGroup.MarginLayoutParams) n0Var4).bottomMargin + i28) - i26));
                            }
                        }
                        paddingTop = paddingTop2 + i24;
                    } else {
                        paddingTop = (((height - paddingBottom) - ((ViewGroup.MarginLayoutParams) n0Var4).bottomMargin) - this.f2153s) - i23;
                    }
                    if (z2) {
                        int i29 = (z4 ? this.f2150p : 0) - iArr[0];
                        int max3 = Math.max(0, i29) + i9;
                        iArr[0] = Math.max(0, -i29);
                        if (q3) {
                            n0 n0Var5 = (n0) this.f2138b.getLayoutParams();
                            int measuredWidth = this.f2138b.getMeasuredWidth() + max3;
                            int measuredHeight = this.f2138b.getMeasuredHeight() + paddingTop;
                            this.f2138b.layout(max3, paddingTop, measuredWidth, measuredHeight);
                            i12 = measuredWidth + this.f2151q;
                            paddingTop = measuredHeight + ((ViewGroup.MarginLayoutParams) n0Var5).bottomMargin;
                        } else {
                            i12 = max3;
                        }
                        if (q4) {
                            int i30 = paddingTop + ((ViewGroup.MarginLayoutParams) ((n0) this.f2139c.getLayoutParams())).topMargin;
                            int measuredWidth2 = this.f2139c.getMeasuredWidth() + max3;
                            this.f2139c.layout(max3, i30, measuredWidth2, this.f2139c.getMeasuredHeight() + i30);
                            i13 = measuredWidth2 + this.f2151q;
                        } else {
                            i13 = max3;
                        }
                        max = z4 ? Math.max(i12, i13) : max3;
                        ArrayList arrayList = this.f2129D;
                        a(arrayList, 3);
                        size = arrayList.size();
                        i16 = max;
                        for (i17 = 0; i17 < size; i17++) {
                            i16 = m((View) arrayList.get(i17), i16, min, iArr);
                        }
                        a(arrayList, 5);
                        size2 = arrayList.size();
                        for (i18 = 0; i18 < size2; i18++) {
                            min2 = n((View) arrayList.get(i18), min2, min, iArr);
                        }
                        a(arrayList, 1);
                        int i31 = iArr[0];
                        int i32 = iArr[1];
                        size3 = arrayList.size();
                        int i33 = i31;
                        i19 = 0;
                        int i34 = 0;
                        while (i19 < size3) {
                            View view = (View) arrayList.get(i19);
                            n0 n0Var6 = (n0) view.getLayoutParams();
                            int i35 = i32;
                            int i36 = ((ViewGroup.MarginLayoutParams) n0Var6).leftMargin - i33;
                            int i37 = ((ViewGroup.MarginLayoutParams) n0Var6).rightMargin - i35;
                            int max4 = Math.max(0, i36);
                            int max5 = Math.max(0, i37);
                            int max6 = Math.max(0, -i36);
                            int max7 = Math.max(0, -i37);
                            i34 += view.getMeasuredWidth() + max4 + max5;
                            i19++;
                            i33 = max6;
                            i32 = max7;
                        }
                        i20 = ((((width - paddingLeft) - paddingRight) / 2) + paddingLeft) - (i34 / 2);
                        int i38 = i34 + i20;
                        if (i20 >= i16) {
                            i16 = i38 > min2 ? i20 - (i38 - min2) : i20;
                        }
                        size4 = arrayList.size();
                        for (i21 = 0; i21 < size4; i21++) {
                            i16 = m((View) arrayList.get(i21), i16, min, iArr);
                        }
                        arrayList.clear();
                        return;
                    }
                    int i39 = (z4 ? this.f2150p : 0) - iArr[1];
                    min2 -= Math.max(0, i39);
                    iArr[1] = Math.max(0, -i39);
                    if (q3) {
                        n0 n0Var7 = (n0) this.f2138b.getLayoutParams();
                        int measuredWidth3 = min2 - this.f2138b.getMeasuredWidth();
                        int measuredHeight2 = this.f2138b.getMeasuredHeight() + paddingTop;
                        this.f2138b.layout(measuredWidth3, paddingTop, min2, measuredHeight2);
                        i14 = measuredWidth3 - this.f2151q;
                        paddingTop = measuredHeight2 + ((ViewGroup.MarginLayoutParams) n0Var7).bottomMargin;
                    } else {
                        i14 = min2;
                    }
                    if (q4) {
                        int i40 = paddingTop + ((ViewGroup.MarginLayoutParams) ((n0) this.f2139c.getLayoutParams())).topMargin;
                        this.f2139c.layout(min2 - this.f2139c.getMeasuredWidth(), i40, min2, this.f2139c.getMeasuredHeight() + i40);
                        i15 = min2 - this.f2151q;
                    } else {
                        i15 = min2;
                    }
                    if (z4) {
                        min2 = Math.min(i14, i15);
                    }
                }
                max = i9;
                ArrayList arrayList2 = this.f2129D;
                a(arrayList2, 3);
                size = arrayList2.size();
                i16 = max;
                while (i17 < size) {
                }
                a(arrayList2, 5);
                size2 = arrayList2.size();
                while (i18 < size2) {
                }
                a(arrayList2, 1);
                int i312 = iArr[0];
                int i322 = iArr[1];
                size3 = arrayList2.size();
                int i332 = i312;
                i19 = 0;
                int i342 = 0;
                while (i19 < size3) {
                }
                i20 = ((((width - paddingLeft) - paddingRight) / 2) + paddingLeft) - (i342 / 2);
                int i382 = i342 + i20;
                if (i20 >= i16) {
                }
                size4 = arrayList2.size();
                while (i21 < size4) {
                }
                arrayList2.clear();
                return;
            }
            i7 = m(this.f2140d, paddingLeft, min, iArr);
        }
        i8 = i22;
        if (q(this.f2143h)) {
        }
        if (q(this.f2137a)) {
        }
        int currentContentInsetLeft2 = getCurrentContentInsetLeft();
        int currentContentInsetRight2 = getCurrentContentInsetRight();
        iArr[0] = Math.max(0, currentContentInsetLeft2 - i7);
        iArr[1] = Math.max(0, currentContentInsetRight2 - (i22 - i8));
        int max22 = Math.max(i7, currentContentInsetLeft2);
        int min22 = Math.min(i8, i22 - currentContentInsetRight2);
        if (q(this.f2144i)) {
        }
        if (q(this.f2141e)) {
        }
        q3 = q(this.f2138b);
        q4 = q(this.f2139c);
        if (q3) {
        }
        if (!q4) {
        }
        if (!q3) {
        }
        if (!q3) {
        }
        if (!q4) {
        }
        n0 n0Var32 = (n0) c1098u.getLayoutParams();
        n0 n0Var42 = (n0) c1098u2.getLayoutParams();
        int i232 = i10;
        if (q3) {
        }
        i11 = this.f2156w & 112;
        z2 = z3;
        if (i11 != 48) {
        }
        if (z2) {
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i3, int i4) {
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        boolean a3 = w0.a(this);
        int i12 = !a3 ? 1 : 0;
        int i13 = 0;
        if (q(this.f2140d)) {
            p(this.f2140d, i3, 0, i4, this.o);
            i5 = j(this.f2140d) + this.f2140d.getMeasuredWidth();
            i6 = Math.max(0, k(this.f2140d) + this.f2140d.getMeasuredHeight());
            i7 = View.combineMeasuredStates(0, this.f2140d.getMeasuredState());
        } else {
            i5 = 0;
            i6 = 0;
            i7 = 0;
        }
        if (q(this.f2143h)) {
            p(this.f2143h, i3, 0, i4, this.o);
            i5 = j(this.f2143h) + this.f2143h.getMeasuredWidth();
            i6 = Math.max(i6, k(this.f2143h) + this.f2143h.getMeasuredHeight());
            i7 = View.combineMeasuredStates(i7, this.f2143h.getMeasuredState());
        }
        int currentContentInsetStart = getCurrentContentInsetStart();
        int max = Math.max(currentContentInsetStart, i5);
        int max2 = Math.max(0, currentContentInsetStart - i5);
        int[] iArr = this.f2131F;
        iArr[a3 ? 1 : 0] = max2;
        if (q(this.f2137a)) {
            p(this.f2137a, i3, max, i4, this.o);
            i8 = j(this.f2137a) + this.f2137a.getMeasuredWidth();
            i6 = Math.max(i6, k(this.f2137a) + this.f2137a.getMeasuredHeight());
            i7 = View.combineMeasuredStates(i7, this.f2137a.getMeasuredState());
        } else {
            i8 = 0;
        }
        int currentContentInsetEnd = getCurrentContentInsetEnd();
        int max3 = max + Math.max(currentContentInsetEnd, i8);
        iArr[i12] = Math.max(0, currentContentInsetEnd - i8);
        if (q(this.f2144i)) {
            max3 += o(this.f2144i, i3, max3, i4, 0, iArr);
            i6 = Math.max(i6, k(this.f2144i) + this.f2144i.getMeasuredHeight());
            i7 = View.combineMeasuredStates(i7, this.f2144i.getMeasuredState());
        }
        if (q(this.f2141e)) {
            max3 += o(this.f2141e, i3, max3, i4, 0, iArr);
            i6 = Math.max(i6, k(this.f2141e) + this.f2141e.getMeasuredHeight());
            i7 = View.combineMeasuredStates(i7, this.f2141e.getMeasuredState());
        }
        int childCount = getChildCount();
        for (int i14 = 0; i14 < childCount; i14++) {
            View childAt = getChildAt(i14);
            if (((n0) childAt.getLayoutParams()).f9860b == 0 && q(childAt)) {
                max3 += o(childAt, i3, max3, i4, 0, iArr);
                int max4 = Math.max(i6, k(childAt) + childAt.getMeasuredHeight());
                i7 = View.combineMeasuredStates(i7, childAt.getMeasuredState());
                i6 = max4;
            } else {
                max3 = max3;
            }
        }
        int i15 = max3;
        int i16 = this.f2152r + this.f2153s;
        int i17 = this.f2150p + this.f2151q;
        if (q(this.f2138b)) {
            o(this.f2138b, i3, i15 + i17, i4, i16, iArr);
            int j3 = j(this.f2138b) + this.f2138b.getMeasuredWidth();
            i9 = k(this.f2138b) + this.f2138b.getMeasuredHeight();
            i10 = View.combineMeasuredStates(i7, this.f2138b.getMeasuredState());
            i11 = j3;
        } else {
            i9 = 0;
            i10 = i7;
            i11 = 0;
        }
        if (q(this.f2139c)) {
            i11 = Math.max(i11, o(this.f2139c, i3, i15 + i17, i4, i16 + i9, iArr));
            i9 += k(this.f2139c) + this.f2139c.getMeasuredHeight();
            i10 = View.combineMeasuredStates(i10, this.f2139c.getMeasuredState());
        }
        int max5 = Math.max(i6, i9);
        int paddingRight = getPaddingRight() + getPaddingLeft() + i15 + i11;
        int paddingBottom = getPaddingBottom() + getPaddingTop() + max5;
        int resolveSizeAndState = View.resolveSizeAndState(Math.max(paddingRight, getSuggestedMinimumWidth()), i3, (-16777216) & i10);
        int resolveSizeAndState2 = View.resolveSizeAndState(Math.max(paddingBottom, getSuggestedMinimumHeight()), i4, i10 << 16);
        if (this.f2135J) {
            int childCount2 = getChildCount();
            for (int i18 = 0; i18 < childCount2; i18++) {
                View childAt2 = getChildAt(i18);
                if (!q(childAt2) || childAt2.getMeasuredWidth() <= 0 || childAt2.getMeasuredHeight() <= 0) {
                }
            }
            setMeasuredDimension(resolveSizeAndState, i13);
        }
        i13 = resolveSizeAndState2;
        setMeasuredDimension(resolveSizeAndState, i13);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        MenuItem findItem;
        if (!(parcelable instanceof p0)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        p0 p0Var = (p0) parcelable;
        super.onRestoreInstanceState(p0Var.f624a);
        ActionMenuView actionMenuView = this.f2137a;
        MenuC1065j menuC1065j = actionMenuView != null ? actionMenuView.f2033p : null;
        int i3 = p0Var.f9866c;
        if (i3 != 0 && this.f2134I != null && menuC1065j != null && (findItem = menuC1065j.findItem(i3)) != null) {
            findItem.expandActionView();
        }
        if (p0Var.f9867d) {
            B.b bVar = this.f2136K;
            removeCallbacks(bVar);
            post(bVar);
        }
    }

    @Override // android.view.View
    public final void onRtlPropertiesChanged(int i3) {
        super.onRtlPropertiesChanged(i3);
        d();
        Q q3 = this.f2154t;
        boolean z = i3 == 1;
        if (z == q3.f9768g) {
            return;
        }
        q3.f9768g = z;
        if (!q3.f9769h) {
            q3.f9763a = q3.f9767e;
            q3.f9764b = q3.f;
            return;
        }
        if (z) {
            int i4 = q3.f9766d;
            if (i4 == Integer.MIN_VALUE) {
                i4 = q3.f9767e;
            }
            q3.f9763a = i4;
            int i5 = q3.f9765c;
            if (i5 == Integer.MIN_VALUE) {
                i5 = q3.f;
            }
            q3.f9764b = i5;
            return;
        }
        int i6 = q3.f9765c;
        if (i6 == Integer.MIN_VALUE) {
            i6 = q3.f9767e;
        }
        q3.f9763a = i6;
        int i7 = q3.f9766d;
        if (i7 == Integer.MIN_VALUE) {
            i7 = q3.f;
        }
        q3.f9764b = i7;
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        C1087i c1087i;
        C1084f c1084f;
        MenuItemC1066k menuItemC1066k;
        p0 p0Var = new p0(super.onSaveInstanceState());
        m0 m0Var = this.f2134I;
        if (m0Var != null && (menuItemC1066k = m0Var.f9852b) != null) {
            p0Var.f9866c = menuItemC1066k.f9618a;
        }
        ActionMenuView actionMenuView = this.f2137a;
        p0Var.f9867d = (actionMenuView == null || (c1087i = actionMenuView.f2036s) == null || (c1084f = c1087i.f9832r) == null || !c1084f.b()) ? false : true;
        return p0Var;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f2127B = false;
        }
        if (!this.f2127B) {
            boolean onTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !onTouchEvent) {
                this.f2127B = true;
            }
        }
        if (actionMasked != 1 && actionMasked != 3) {
            return true;
        }
        this.f2127B = false;
        return true;
    }

    public final void p(View view, int i3, int i4, int i5, int i6) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i3, getPaddingRight() + getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i4, marginLayoutParams.width);
        int childMeasureSpec2 = ViewGroup.getChildMeasureSpec(i5, getPaddingBottom() + getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, marginLayoutParams.height);
        int mode = View.MeasureSpec.getMode(childMeasureSpec2);
        if (mode != 1073741824 && i6 >= 0) {
            if (mode != 0) {
                i6 = Math.min(View.MeasureSpec.getSize(childMeasureSpec2), i6);
            }
            childMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i6, 1073741824);
        }
        view.measure(childMeasureSpec, childMeasureSpec2);
    }

    public final boolean q(View view) {
        return (view == null || view.getParent() != this || view.getVisibility() == 8) ? false : true;
    }

    public void setCollapseContentDescription(int i3) {
        setCollapseContentDescription(i3 != 0 ? getContext().getText(i3) : null);
    }

    public void setCollapseIcon(int i3) {
        setCollapseIcon(AbstractC0337a.a(getContext(), i3));
    }

    public void setCollapsible(boolean z) {
        this.f2135J = z;
        requestLayout();
    }

    public void setContentInsetEndWithActions(int i3) {
        if (i3 < 0) {
            i3 = Integer.MIN_VALUE;
        }
        if (i3 != this.v) {
            this.v = i3;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setContentInsetStartWithNavigation(int i3) {
        if (i3 < 0) {
            i3 = Integer.MIN_VALUE;
        }
        if (i3 != this.f2155u) {
            this.f2155u = i3;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setLogo(int i3) {
        setLogo(AbstractC0337a.a(getContext(), i3));
    }

    public void setLogoDescription(int i3) {
        setLogoDescription(getContext().getText(i3));
    }

    public void setNavigationContentDescription(int i3) {
        setNavigationContentDescription(i3 != 0 ? getContext().getText(i3) : null);
    }

    public void setNavigationIcon(int i3) {
        setNavigationIcon(AbstractC0337a.a(getContext(), i3));
    }

    public void setNavigationOnClickListener(View.OnClickListener onClickListener) {
        f();
        this.f2140d.setOnClickListener(onClickListener);
    }

    public void setOverflowIcon(Drawable drawable) {
        e();
        this.f2137a.setOverflowIcon(drawable);
    }

    public void setPopupTheme(int i3) {
        if (this.f2146k != i3) {
            this.f2146k = i3;
            if (i3 == 0) {
                this.f2145j = getContext();
            } else {
                this.f2145j = new ContextThemeWrapper(getContext(), i3);
            }
        }
    }

    public void setSubtitle(int i3) {
        setSubtitle(getContext().getText(i3));
    }

    public void setSubtitleTextColor(int i3) {
        setSubtitleTextColor(ColorStateList.valueOf(i3));
    }

    public void setTitle(int i3) {
        setTitle(getContext().getText(i3));
    }

    public void setTitleMarginBottom(int i3) {
        this.f2153s = i3;
        requestLayout();
    }

    public void setTitleMarginEnd(int i3) {
        this.f2151q = i3;
        requestLayout();
    }

    public void setTitleMarginStart(int i3) {
        this.f2150p = i3;
        requestLayout();
    }

    public void setTitleMarginTop(int i3) {
        this.f2152r = i3;
        requestLayout();
    }

    public void setTitleTextColor(int i3) {
        setTitleTextColor(ColorStateList.valueOf(i3));
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        Context context = getContext();
        n0 n0Var = new n0(context, attributeSet);
        n0Var.f9859a = 0;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0328a.f4990b);
        n0Var.f9859a = obtainStyledAttributes.getInt(0, 0);
        obtainStyledAttributes.recycle();
        n0Var.f9860b = 0;
        return n0Var;
    }

    public void setCollapseContentDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            c();
        }
        C1094p c1094p = this.f2143h;
        if (c1094p != null) {
            c1094p.setContentDescription(charSequence);
        }
    }

    public void setCollapseIcon(Drawable drawable) {
        if (drawable != null) {
            c();
            this.f2143h.setImageDrawable(drawable);
        } else {
            C1094p c1094p = this.f2143h;
            if (c1094p != null) {
                c1094p.setImageDrawable(this.f);
            }
        }
    }

    public void setLogo(Drawable drawable) {
        if (drawable != null) {
            if (this.f2141e == null) {
                this.f2141e = new C1095q(getContext(), 0);
            }
            if (!l(this.f2141e)) {
                b(this.f2141e, true);
            }
        } else {
            C1095q c1095q = this.f2141e;
            if (c1095q != null && l(c1095q)) {
                removeView(this.f2141e);
                this.f2130E.remove(this.f2141e);
            }
        }
        C1095q c1095q2 = this.f2141e;
        if (c1095q2 != null) {
            c1095q2.setImageDrawable(drawable);
        }
    }

    public void setLogoDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence) && this.f2141e == null) {
            this.f2141e = new C1095q(getContext(), 0);
        }
        C1095q c1095q = this.f2141e;
        if (c1095q != null) {
            c1095q.setContentDescription(charSequence);
        }
    }

    public void setNavigationContentDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            f();
        }
        C1094p c1094p = this.f2140d;
        if (c1094p != null) {
            c1094p.setContentDescription(charSequence);
        }
    }

    public void setNavigationIcon(Drawable drawable) {
        if (drawable != null) {
            f();
            if (!l(this.f2140d)) {
                b(this.f2140d, true);
            }
        } else {
            C1094p c1094p = this.f2140d;
            if (c1094p != null && l(c1094p)) {
                removeView(this.f2140d);
                this.f2130E.remove(this.f2140d);
            }
        }
        C1094p c1094p2 = this.f2140d;
        if (c1094p2 != null) {
            c1094p2.setImageDrawable(drawable);
        }
    }

    public void setSubtitle(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            C1098u c1098u = this.f2139c;
            if (c1098u != null && l(c1098u)) {
                removeView(this.f2139c);
                this.f2130E.remove(this.f2139c);
            }
        } else {
            if (this.f2139c == null) {
                Context context = getContext();
                C1098u c1098u2 = new C1098u(context, null);
                this.f2139c = c1098u2;
                c1098u2.setSingleLine();
                this.f2139c.setEllipsize(TextUtils.TruncateAt.END);
                int i3 = this.f2148m;
                if (i3 != 0) {
                    this.f2139c.setTextAppearance(context, i3);
                }
                ColorStateList colorStateList = this.f2126A;
                if (colorStateList != null) {
                    this.f2139c.setTextColor(colorStateList);
                }
            }
            if (!l(this.f2139c)) {
                b(this.f2139c, true);
            }
        }
        C1098u c1098u3 = this.f2139c;
        if (c1098u3 != null) {
            c1098u3.setText(charSequence);
        }
        this.f2158y = charSequence;
    }

    public void setSubtitleTextColor(ColorStateList colorStateList) {
        this.f2126A = colorStateList;
        C1098u c1098u = this.f2139c;
        if (c1098u != null) {
            c1098u.setTextColor(colorStateList);
        }
    }

    public void setTitle(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            C1098u c1098u = this.f2138b;
            if (c1098u != null && l(c1098u)) {
                removeView(this.f2138b);
                this.f2130E.remove(this.f2138b);
            }
        } else {
            if (this.f2138b == null) {
                Context context = getContext();
                C1098u c1098u2 = new C1098u(context, null);
                this.f2138b = c1098u2;
                c1098u2.setSingleLine();
                this.f2138b.setEllipsize(TextUtils.TruncateAt.END);
                int i3 = this.f2147l;
                if (i3 != 0) {
                    this.f2138b.setTextAppearance(context, i3);
                }
                ColorStateList colorStateList = this.z;
                if (colorStateList != null) {
                    this.f2138b.setTextColor(colorStateList);
                }
            }
            if (!l(this.f2138b)) {
                b(this.f2138b, true);
            }
        }
        C1098u c1098u3 = this.f2138b;
        if (c1098u3 != null) {
            c1098u3.setText(charSequence);
        }
        this.f2157x = charSequence;
    }

    public void setTitleTextColor(ColorStateList colorStateList) {
        this.z = colorStateList;
        C1098u c1098u = this.f2138b;
        if (c1098u != null) {
            c1098u.setTextColor(colorStateList);
        }
    }

    public void setOnMenuItemClickListener(o0 o0Var) {
    }
}
