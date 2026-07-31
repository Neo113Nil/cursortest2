package androidx.appcompat.widget;

import B0.C0008i;
import B0.E;
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
import com.crane.slab.beam.R;
import d.AbstractC0119a;
import e.AbstractC0121a;
import g.d;
import h.MenuC0143j;
import h.MenuItemC0144k;
import i.C0159f;
import i.C0162i;
import i.C0169p;
import i.C0170q;
import i.C0174v;
import i.InterfaceC0177y;
import i.Q;
import i.l0;
import i.m0;
import i.n0;
import i.o0;
import i.p0;
import i.q0;
import i.w0;
import java.lang.reflect.Field;
import java.util.ArrayList;
import y.x;

/* loaded from: classes.dex */
public class Toolbar extends ViewGroup {

    /* renamed from: A, reason: collision with root package name */
    public final int f1346A;

    /* renamed from: B, reason: collision with root package name */
    public CharSequence f1347B;

    /* renamed from: C, reason: collision with root package name */
    public CharSequence f1348C;

    /* renamed from: D, reason: collision with root package name */
    public ColorStateList f1349D;

    /* renamed from: E, reason: collision with root package name */
    public ColorStateList f1350E;

    /* renamed from: F, reason: collision with root package name */
    public boolean f1351F;
    public boolean G;

    /* renamed from: H, reason: collision with root package name */
    public final ArrayList f1352H;

    /* renamed from: I, reason: collision with root package name */
    public final ArrayList f1353I;

    /* renamed from: J, reason: collision with root package name */
    public final int[] f1354J;

    /* renamed from: K, reason: collision with root package name */
    public final E f1355K;

    /* renamed from: L, reason: collision with root package name */
    public q0 f1356L;

    /* renamed from: M, reason: collision with root package name */
    public m0 f1357M;

    /* renamed from: N, reason: collision with root package name */
    public boolean f1358N;

    /* renamed from: O, reason: collision with root package name */
    public final C.b f1359O;

    /* renamed from: e, reason: collision with root package name */
    public ActionMenuView f1360e;

    /* renamed from: f, reason: collision with root package name */
    public C0174v f1361f;

    /* renamed from: g, reason: collision with root package name */
    public C0174v f1362g;

    /* renamed from: h, reason: collision with root package name */
    public C0169p f1363h;

    /* renamed from: i, reason: collision with root package name */
    public C0170q f1364i;

    /* renamed from: j, reason: collision with root package name */
    public final Drawable f1365j;

    /* renamed from: k, reason: collision with root package name */
    public final CharSequence f1366k;

    /* renamed from: l, reason: collision with root package name */
    public C0169p f1367l;

    /* renamed from: m, reason: collision with root package name */
    public View f1368m;

    /* renamed from: n, reason: collision with root package name */
    public Context f1369n;

    /* renamed from: o, reason: collision with root package name */
    public int f1370o;

    /* renamed from: p, reason: collision with root package name */
    public int f1371p;

    /* renamed from: q, reason: collision with root package name */
    public int f1372q;

    /* renamed from: r, reason: collision with root package name */
    public final int f1373r;

    /* renamed from: s, reason: collision with root package name */
    public final int f1374s;
    public int t;

    /* renamed from: u, reason: collision with root package name */
    public int f1375u;

    /* renamed from: v, reason: collision with root package name */
    public int f1376v;

    /* renamed from: w, reason: collision with root package name */
    public int f1377w;

    /* renamed from: x, reason: collision with root package name */
    public Q f1378x;

    /* renamed from: y, reason: collision with root package name */
    public int f1379y;

    /* renamed from: z, reason: collision with root package name */
    public int f1380z;

    public Toolbar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.toolbarStyle);
        this.f1346A = 8388627;
        this.f1352H = new ArrayList();
        this.f1353I = new ArrayList();
        this.f1354J = new int[2];
        this.f1355K = new E(21, this);
        this.f1359O = new C.b(5, this);
        C0008i D2 = C0008i.D(getContext(), attributeSet, AbstractC0119a.t, R.attr.toolbarStyle);
        TypedArray typedArray = (TypedArray) D2.f84f;
        this.f1371p = typedArray.getResourceId(28, 0);
        this.f1372q = typedArray.getResourceId(19, 0);
        this.f1346A = typedArray.getInteger(0, 8388627);
        this.f1373r = typedArray.getInteger(2, 48);
        int dimensionPixelOffset = typedArray.getDimensionPixelOffset(22, 0);
        dimensionPixelOffset = typedArray.hasValue(27) ? typedArray.getDimensionPixelOffset(27, dimensionPixelOffset) : dimensionPixelOffset;
        this.f1377w = dimensionPixelOffset;
        this.f1376v = dimensionPixelOffset;
        this.f1375u = dimensionPixelOffset;
        this.t = dimensionPixelOffset;
        int dimensionPixelOffset2 = typedArray.getDimensionPixelOffset(25, -1);
        if (dimensionPixelOffset2 >= 0) {
            this.t = dimensionPixelOffset2;
        }
        int dimensionPixelOffset3 = typedArray.getDimensionPixelOffset(24, -1);
        if (dimensionPixelOffset3 >= 0) {
            this.f1375u = dimensionPixelOffset3;
        }
        int dimensionPixelOffset4 = typedArray.getDimensionPixelOffset(26, -1);
        if (dimensionPixelOffset4 >= 0) {
            this.f1376v = dimensionPixelOffset4;
        }
        int dimensionPixelOffset5 = typedArray.getDimensionPixelOffset(23, -1);
        if (dimensionPixelOffset5 >= 0) {
            this.f1377w = dimensionPixelOffset5;
        }
        this.f1374s = typedArray.getDimensionPixelSize(13, -1);
        int dimensionPixelOffset6 = typedArray.getDimensionPixelOffset(9, Integer.MIN_VALUE);
        int dimensionPixelOffset7 = typedArray.getDimensionPixelOffset(5, Integer.MIN_VALUE);
        int dimensionPixelSize = typedArray.getDimensionPixelSize(7, 0);
        int dimensionPixelSize2 = typedArray.getDimensionPixelSize(8, 0);
        d();
        Q q2 = this.f1378x;
        q2.f2176h = false;
        if (dimensionPixelSize != Integer.MIN_VALUE) {
            q2.f2173e = dimensionPixelSize;
            q2.f2169a = dimensionPixelSize;
        }
        if (dimensionPixelSize2 != Integer.MIN_VALUE) {
            q2.f2174f = dimensionPixelSize2;
            q2.f2170b = dimensionPixelSize2;
        }
        if (dimensionPixelOffset6 != Integer.MIN_VALUE || dimensionPixelOffset7 != Integer.MIN_VALUE) {
            q2.a(dimensionPixelOffset6, dimensionPixelOffset7);
        }
        this.f1379y = typedArray.getDimensionPixelOffset(10, Integer.MIN_VALUE);
        this.f1380z = typedArray.getDimensionPixelOffset(6, Integer.MIN_VALUE);
        this.f1365j = D2.v(4);
        this.f1366k = typedArray.getText(3);
        CharSequence text = typedArray.getText(21);
        if (!TextUtils.isEmpty(text)) {
            setTitle(text);
        }
        CharSequence text2 = typedArray.getText(18);
        if (!TextUtils.isEmpty(text2)) {
            setSubtitle(text2);
        }
        this.f1369n = getContext();
        setPopupTheme(typedArray.getResourceId(17, 0));
        Drawable v2 = D2.v(16);
        if (v2 != null) {
            setNavigationIcon(v2);
        }
        CharSequence text3 = typedArray.getText(15);
        if (!TextUtils.isEmpty(text3)) {
            setNavigationContentDescription(text3);
        }
        Drawable v3 = D2.v(11);
        if (v3 != null) {
            setLogo(v3);
        }
        CharSequence text4 = typedArray.getText(12);
        if (!TextUtils.isEmpty(text4)) {
            setLogoDescription(text4);
        }
        if (typedArray.hasValue(29)) {
            setTitleTextColor(D2.u(29));
        }
        if (typedArray.hasValue(20)) {
            setSubtitleTextColor(D2.u(20));
        }
        if (typedArray.hasValue(14)) {
            getMenuInflater().inflate(typedArray.getResourceId(14, 0), getMenu());
        }
        D2.G();
    }

    public static n0 g() {
        n0 n0Var = new n0(-2, -2);
        n0Var.f2274b = 0;
        n0Var.f2273a = 8388627;
        return n0Var;
    }

    private MenuInflater getMenuInflater() {
        return new d(getContext());
    }

    public static n0 h(ViewGroup.LayoutParams layoutParams) {
        boolean z2 = layoutParams instanceof n0;
        if (z2) {
            n0 n0Var = (n0) layoutParams;
            n0 n0Var2 = new n0(n0Var);
            n0Var2.f2274b = 0;
            n0Var2.f2274b = n0Var.f2274b;
            return n0Var2;
        }
        if (z2) {
            n0 n0Var3 = new n0((n0) layoutParams);
            n0Var3.f2274b = 0;
            return n0Var3;
        }
        if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
            n0 n0Var4 = new n0(layoutParams);
            n0Var4.f2274b = 0;
            return n0Var4;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        n0 n0Var5 = new n0(marginLayoutParams);
        n0Var5.f2274b = 0;
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

    public final void a(ArrayList arrayList, int i2) {
        Field field = x.f3160a;
        boolean z2 = getLayoutDirection() == 1;
        int childCount = getChildCount();
        int absoluteGravity = Gravity.getAbsoluteGravity(i2, getLayoutDirection());
        arrayList.clear();
        if (!z2) {
            for (int i3 = 0; i3 < childCount; i3++) {
                View childAt = getChildAt(i3);
                n0 n0Var = (n0) childAt.getLayoutParams();
                if (n0Var.f2274b == 0 && q(childAt)) {
                    int i4 = n0Var.f2273a;
                    Field field2 = x.f3160a;
                    int layoutDirection = getLayoutDirection();
                    int absoluteGravity2 = Gravity.getAbsoluteGravity(i4, layoutDirection) & 7;
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
        for (int i5 = childCount - 1; i5 >= 0; i5--) {
            View childAt2 = getChildAt(i5);
            n0 n0Var2 = (n0) childAt2.getLayoutParams();
            if (n0Var2.f2274b == 0 && q(childAt2)) {
                int i6 = n0Var2.f2273a;
                Field field3 = x.f3160a;
                int layoutDirection2 = getLayoutDirection();
                int absoluteGravity3 = Gravity.getAbsoluteGravity(i6, layoutDirection2) & 7;
                if (absoluteGravity3 != 1 && absoluteGravity3 != 3 && absoluteGravity3 != 5) {
                    absoluteGravity3 = layoutDirection2 == 1 ? 5 : 3;
                }
                if (absoluteGravity3 == absoluteGravity) {
                    arrayList.add(childAt2);
                }
            }
        }
    }

    public final void b(View view, boolean z2) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        n0 g2 = layoutParams == null ? g() : !checkLayoutParams(layoutParams) ? h(layoutParams) : (n0) layoutParams;
        g2.f2274b = 1;
        if (!z2 || this.f1368m == null) {
            addView(view, g2);
        } else {
            view.setLayoutParams(g2);
            this.f1353I.add(view);
        }
    }

    public final void c() {
        if (this.f1367l == null) {
            C0169p c0169p = new C0169p(getContext());
            this.f1367l = c0169p;
            c0169p.setImageDrawable(this.f1365j);
            this.f1367l.setContentDescription(this.f1366k);
            n0 g2 = g();
            g2.f2273a = (this.f1373r & 112) | 8388611;
            g2.f2274b = 2;
            this.f1367l.setLayoutParams(g2);
            this.f1367l.setOnClickListener(new l0(this));
        }
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return super.checkLayoutParams(layoutParams) && (layoutParams instanceof n0);
    }

    public final void d() {
        if (this.f1378x == null) {
            Q q2 = new Q();
            q2.f2169a = 0;
            q2.f2170b = 0;
            q2.f2171c = Integer.MIN_VALUE;
            q2.f2172d = Integer.MIN_VALUE;
            q2.f2173e = 0;
            q2.f2174f = 0;
            q2.f2175g = false;
            q2.f2176h = false;
            this.f1378x = q2;
        }
    }

    public final void e() {
        if (this.f1360e == null) {
            ActionMenuView actionMenuView = new ActionMenuView(getContext(), null);
            this.f1360e = actionMenuView;
            actionMenuView.setPopupTheme(this.f1370o);
            this.f1360e.setOnMenuItemClickListener(this.f1355K);
            this.f1360e.getClass();
            n0 g2 = g();
            g2.f2273a = (this.f1373r & 112) | 8388613;
            this.f1360e.setLayoutParams(g2);
            b(this.f1360e, false);
        }
        ActionMenuView actionMenuView2 = this.f1360e;
        if (actionMenuView2.t == null) {
            MenuC0143j menuC0143j = (MenuC0143j) actionMenuView2.getMenu();
            if (this.f1357M == null) {
                this.f1357M = new m0(this);
            }
            this.f1360e.setExpandedActionViewsExclusive(true);
            menuC0143j.b(this.f1357M, this.f1369n);
        }
    }

    public final void f() {
        if (this.f1363h == null) {
            this.f1363h = new C0169p(getContext());
            n0 g2 = g();
            g2.f2273a = (this.f1373r & 112) | 8388611;
            this.f1363h.setLayoutParams(g2);
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
        C0169p c0169p = this.f1367l;
        if (c0169p != null) {
            return c0169p.getContentDescription();
        }
        return null;
    }

    public Drawable getCollapseIcon() {
        C0169p c0169p = this.f1367l;
        if (c0169p != null) {
            return c0169p.getDrawable();
        }
        return null;
    }

    public int getContentInsetEnd() {
        Q q2 = this.f1378x;
        if (q2 != null) {
            return q2.f2175g ? q2.f2169a : q2.f2170b;
        }
        return 0;
    }

    public int getContentInsetEndWithActions() {
        int i2 = this.f1380z;
        return i2 != Integer.MIN_VALUE ? i2 : getContentInsetEnd();
    }

    public int getContentInsetLeft() {
        Q q2 = this.f1378x;
        if (q2 != null) {
            return q2.f2169a;
        }
        return 0;
    }

    public int getContentInsetRight() {
        Q q2 = this.f1378x;
        if (q2 != null) {
            return q2.f2170b;
        }
        return 0;
    }

    public int getContentInsetStart() {
        Q q2 = this.f1378x;
        if (q2 != null) {
            return q2.f2175g ? q2.f2170b : q2.f2169a;
        }
        return 0;
    }

    public int getContentInsetStartWithNavigation() {
        int i2 = this.f1379y;
        return i2 != Integer.MIN_VALUE ? i2 : getContentInsetStart();
    }

    public int getCurrentContentInsetEnd() {
        MenuC0143j menuC0143j;
        ActionMenuView actionMenuView = this.f1360e;
        return (actionMenuView == null || (menuC0143j = actionMenuView.t) == null || !menuC0143j.hasVisibleItems()) ? getContentInsetEnd() : Math.max(getContentInsetEnd(), Math.max(this.f1380z, 0));
    }

    public int getCurrentContentInsetLeft() {
        Field field = x.f3160a;
        return getLayoutDirection() == 1 ? getCurrentContentInsetEnd() : getCurrentContentInsetStart();
    }

    public int getCurrentContentInsetRight() {
        Field field = x.f3160a;
        return getLayoutDirection() == 1 ? getCurrentContentInsetStart() : getCurrentContentInsetEnd();
    }

    public int getCurrentContentInsetStart() {
        return getNavigationIcon() != null ? Math.max(getContentInsetStart(), Math.max(this.f1379y, 0)) : getContentInsetStart();
    }

    public Drawable getLogo() {
        C0170q c0170q = this.f1364i;
        if (c0170q != null) {
            return c0170q.getDrawable();
        }
        return null;
    }

    public CharSequence getLogoDescription() {
        C0170q c0170q = this.f1364i;
        if (c0170q != null) {
            return c0170q.getContentDescription();
        }
        return null;
    }

    public Menu getMenu() {
        e();
        return this.f1360e.getMenu();
    }

    public CharSequence getNavigationContentDescription() {
        C0169p c0169p = this.f1363h;
        if (c0169p != null) {
            return c0169p.getContentDescription();
        }
        return null;
    }

    public Drawable getNavigationIcon() {
        C0169p c0169p = this.f1363h;
        if (c0169p != null) {
            return c0169p.getDrawable();
        }
        return null;
    }

    public C0162i getOuterActionMenuPresenter() {
        return null;
    }

    public Drawable getOverflowIcon() {
        e();
        return this.f1360e.getOverflowIcon();
    }

    public Context getPopupContext() {
        return this.f1369n;
    }

    public int getPopupTheme() {
        return this.f1370o;
    }

    public CharSequence getSubtitle() {
        return this.f1348C;
    }

    public final TextView getSubtitleTextView() {
        return this.f1362g;
    }

    public CharSequence getTitle() {
        return this.f1347B;
    }

    public int getTitleMarginBottom() {
        return this.f1377w;
    }

    public int getTitleMarginEnd() {
        return this.f1375u;
    }

    public int getTitleMarginStart() {
        return this.t;
    }

    public int getTitleMarginTop() {
        return this.f1376v;
    }

    public final TextView getTitleTextView() {
        return this.f1361f;
    }

    public InterfaceC0177y getWrapper() {
        Drawable drawable;
        if (this.f1356L == null) {
            q0 q0Var = new q0();
            q0Var.f2295l = 0;
            q0Var.f2284a = this;
            q0Var.f2291h = getTitle();
            q0Var.f2292i = getSubtitle();
            q0Var.f2290g = q0Var.f2291h != null;
            q0Var.f2289f = getNavigationIcon();
            C0008i D2 = C0008i.D(getContext(), null, AbstractC0119a.f1787a, R.attr.actionBarStyle);
            TypedArray typedArray = (TypedArray) D2.f84f;
            q0Var.f2296m = D2.v(15);
            CharSequence text = typedArray.getText(27);
            if (!TextUtils.isEmpty(text)) {
                q0Var.f2290g = true;
                q0Var.f2291h = text;
                if ((q0Var.f2285b & 8) != 0) {
                    q0Var.f2284a.setTitle(text);
                }
            }
            CharSequence text2 = typedArray.getText(25);
            if (!TextUtils.isEmpty(text2)) {
                q0Var.f2292i = text2;
                if ((q0Var.f2285b & 8) != 0) {
                    setSubtitle(text2);
                }
            }
            Drawable v2 = D2.v(20);
            if (v2 != null) {
                q0Var.f2288e = v2;
                q0Var.c();
            }
            Drawable v3 = D2.v(17);
            if (v3 != null) {
                q0Var.f2287d = v3;
                q0Var.c();
            }
            if (q0Var.f2289f == null && (drawable = q0Var.f2296m) != null) {
                q0Var.f2289f = drawable;
                Toolbar toolbar = q0Var.f2284a;
                if ((q0Var.f2285b & 4) != 0) {
                    toolbar.setNavigationIcon(drawable);
                } else {
                    toolbar.setNavigationIcon((Drawable) null);
                }
            }
            q0Var.a(typedArray.getInt(10, 0));
            int resourceId = typedArray.getResourceId(9, 0);
            if (resourceId != 0) {
                View inflate = LayoutInflater.from(getContext()).inflate(resourceId, (ViewGroup) this, false);
                View view = q0Var.f2286c;
                if (view != null && (q0Var.f2285b & 16) != 0) {
                    removeView(view);
                }
                q0Var.f2286c = inflate;
                if (inflate != null && (q0Var.f2285b & 16) != 0) {
                    addView(inflate);
                }
                q0Var.a(q0Var.f2285b | 16);
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
                this.f1378x.a(max, max2);
            }
            int resourceId2 = typedArray.getResourceId(28, 0);
            if (resourceId2 != 0) {
                Context context = getContext();
                this.f1371p = resourceId2;
                C0174v c0174v = this.f1361f;
                if (c0174v != null) {
                    c0174v.setTextAppearance(context, resourceId2);
                }
            }
            int resourceId3 = typedArray.getResourceId(26, 0);
            if (resourceId3 != 0) {
                Context context2 = getContext();
                this.f1372q = resourceId3;
                C0174v c0174v2 = this.f1362g;
                if (c0174v2 != null) {
                    c0174v2.setTextAppearance(context2, resourceId3);
                }
            }
            int resourceId4 = typedArray.getResourceId(22, 0);
            if (resourceId4 != 0) {
                setPopupTheme(resourceId4);
            }
            D2.G();
            if (R.string.abc_action_bar_up_description != q0Var.f2295l) {
                q0Var.f2295l = R.string.abc_action_bar_up_description;
                if (TextUtils.isEmpty(getNavigationContentDescription())) {
                    int i2 = q0Var.f2295l;
                    q0Var.f2293j = i2 != 0 ? getContext().getString(i2) : null;
                    q0Var.b();
                }
            }
            q0Var.f2293j = getNavigationContentDescription();
            setNavigationOnClickListener(new l0(q0Var));
            this.f1356L = q0Var;
        }
        return this.f1356L;
    }

    public final int i(View view, int i2) {
        n0 n0Var = (n0) view.getLayoutParams();
        int measuredHeight = view.getMeasuredHeight();
        int i3 = i2 > 0 ? (measuredHeight - i2) / 2 : 0;
        int i4 = n0Var.f2273a & 112;
        if (i4 != 16 && i4 != 48 && i4 != 80) {
            i4 = this.f1346A & 112;
        }
        if (i4 == 48) {
            return getPaddingTop() - i3;
        }
        if (i4 == 80) {
            return (((getHeight() - getPaddingBottom()) - measuredHeight) - ((ViewGroup.MarginLayoutParams) n0Var).bottomMargin) - i3;
        }
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int height = getHeight();
        int i5 = (((height - paddingTop) - paddingBottom) - measuredHeight) / 2;
        int i6 = ((ViewGroup.MarginLayoutParams) n0Var).topMargin;
        if (i5 < i6) {
            i5 = i6;
        } else {
            int i7 = (((height - paddingBottom) - measuredHeight) - i5) - paddingTop;
            int i8 = ((ViewGroup.MarginLayoutParams) n0Var).bottomMargin;
            if (i7 < i8) {
                i5 = Math.max(0, i5 - (i8 - i7));
            }
        }
        return paddingTop + i5;
    }

    public final boolean l(View view) {
        return view.getParent() == this || this.f1353I.contains(view);
    }

    public final int m(View view, int i2, int i3, int[] iArr) {
        n0 n0Var = (n0) view.getLayoutParams();
        int i4 = ((ViewGroup.MarginLayoutParams) n0Var).leftMargin - iArr[0];
        int max = Math.max(0, i4) + i2;
        iArr[0] = Math.max(0, -i4);
        int i5 = i(view, i3);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(max, i5, max + measuredWidth, view.getMeasuredHeight() + i5);
        return measuredWidth + ((ViewGroup.MarginLayoutParams) n0Var).rightMargin + max;
    }

    public final int n(View view, int i2, int i3, int[] iArr) {
        n0 n0Var = (n0) view.getLayoutParams();
        int i4 = ((ViewGroup.MarginLayoutParams) n0Var).rightMargin - iArr[1];
        int max = i2 - Math.max(0, i4);
        iArr[1] = Math.max(0, -i4);
        int i5 = i(view, i3);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(max - measuredWidth, i5, max, view.getMeasuredHeight() + i5);
        return max - (measuredWidth + ((ViewGroup.MarginLayoutParams) n0Var).leftMargin);
    }

    public final int o(View view, int i2, int i3, int i4, int i5, int[] iArr) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int i6 = marginLayoutParams.leftMargin - iArr[0];
        int i7 = marginLayoutParams.rightMargin - iArr[1];
        int max = Math.max(0, i7) + Math.max(0, i6);
        iArr[0] = Math.max(0, -i6);
        iArr[1] = Math.max(0, -i7);
        view.measure(ViewGroup.getChildMeasureSpec(i2, getPaddingRight() + getPaddingLeft() + max + i3, marginLayoutParams.width), ViewGroup.getChildMeasureSpec(i4, getPaddingBottom() + getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i5, marginLayoutParams.height));
        return view.getMeasuredWidth() + max;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeCallbacks(this.f1359O);
    }

    @Override // android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.G = false;
        }
        if (!this.G) {
            boolean onHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !onHoverEvent) {
                this.G = true;
            }
        }
        if (actionMasked != 10 && actionMasked != 3) {
            return true;
        }
        this.G = false;
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:110:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x028f A[LOOP:0: B:39:0x028d->B:40:0x028f, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x02a7 A[LOOP:1: B:43:0x02a5->B:44:0x02a7, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x02c7 A[LOOP:2: B:47:0x02c5->B:48:0x02c7, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x030d  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x031a A[LOOP:3: B:56:0x0318->B:57:0x031a, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01aa  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0218  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
        int i6;
        int i7;
        int max;
        boolean q2;
        boolean q3;
        boolean z3;
        int i8;
        int i9;
        int paddingTop;
        int i10;
        int i11;
        int i12;
        int i13;
        int size;
        int i14;
        int i15;
        int size2;
        int i16;
        int size3;
        int i17;
        int i18;
        int i19;
        int size4;
        Field field = x.f3160a;
        boolean z4 = getLayoutDirection() == 1;
        int width = getWidth();
        int height = getHeight();
        int paddingLeft = getPaddingLeft();
        int paddingRight = getPaddingRight();
        int paddingTop2 = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int i20 = width - paddingRight;
        int[] iArr = this.f1354J;
        iArr[1] = 0;
        iArr[0] = 0;
        int minimumHeight = getMinimumHeight();
        int min = minimumHeight >= 0 ? Math.min(minimumHeight, i5 - i3) : 0;
        if (!q(this.f1363h)) {
            i6 = paddingLeft;
        } else {
            if (z4) {
                i7 = n(this.f1363h, i20, min, iArr);
                i6 = paddingLeft;
                if (q(this.f1367l)) {
                    if (z4) {
                        i7 = n(this.f1367l, i7, min, iArr);
                    } else {
                        i6 = m(this.f1367l, i6, min, iArr);
                    }
                }
                if (q(this.f1360e)) {
                    if (z4) {
                        i6 = m(this.f1360e, i6, min, iArr);
                    } else {
                        i7 = n(this.f1360e, i7, min, iArr);
                    }
                }
                int currentContentInsetLeft = getCurrentContentInsetLeft();
                int currentContentInsetRight = getCurrentContentInsetRight();
                iArr[0] = Math.max(0, currentContentInsetLeft - i6);
                iArr[1] = Math.max(0, currentContentInsetRight - (i20 - i7));
                max = Math.max(i6, currentContentInsetLeft);
                int min2 = Math.min(i7, i20 - currentContentInsetRight);
                if (q(this.f1368m)) {
                    if (z4) {
                        min2 = n(this.f1368m, min2, min, iArr);
                    } else {
                        max = m(this.f1368m, max, min, iArr);
                    }
                }
                if (q(this.f1364i)) {
                    if (z4) {
                        min2 = n(this.f1364i, min2, min, iArr);
                    } else {
                        max = m(this.f1364i, max, min, iArr);
                    }
                }
                q2 = q(this.f1361f);
                q3 = q(this.f1362g);
                if (q2) {
                    z3 = z4;
                    i8 = 0;
                } else {
                    n0 n0Var = (n0) this.f1361f.getLayoutParams();
                    z3 = z4;
                    i8 = this.f1361f.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) n0Var).topMargin + ((ViewGroup.MarginLayoutParams) n0Var).bottomMargin;
                }
                if (!q3) {
                    n0 n0Var2 = (n0) this.f1362g.getLayoutParams();
                    i8 = this.f1362g.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) n0Var2).topMargin + ((ViewGroup.MarginLayoutParams) n0Var2).bottomMargin + i8;
                }
                if (!q2 || q3) {
                    C0174v c0174v = !q2 ? this.f1361f : this.f1362g;
                    C0174v c0174v2 = !q3 ? this.f1362g : this.f1361f;
                    n0 n0Var3 = (n0) c0174v.getLayoutParams();
                    n0 n0Var4 = (n0) c0174v2.getLayoutParams();
                    int i21 = i8;
                    boolean z5 = (!q2 && this.f1361f.getMeasuredWidth() > 0) || (q3 && this.f1362g.getMeasuredWidth() > 0);
                    i9 = this.f1346A & 112;
                    int i22 = max;
                    if (i9 != 48) {
                        paddingTop = getPaddingTop() + ((ViewGroup.MarginLayoutParams) n0Var3).topMargin + this.f1376v;
                    } else if (i9 != 80) {
                        int i23 = (((height - paddingTop2) - paddingBottom) - i21) / 2;
                        int i24 = ((ViewGroup.MarginLayoutParams) n0Var3).topMargin + this.f1376v;
                        if (i23 < i24) {
                            i23 = i24;
                        } else {
                            int i25 = (((height - paddingBottom) - i21) - i23) - paddingTop2;
                            int i26 = ((ViewGroup.MarginLayoutParams) n0Var3).bottomMargin;
                            int i27 = this.f1377w;
                            if (i25 < i26 + i27) {
                                i23 = Math.max(0, i23 - ((((ViewGroup.MarginLayoutParams) n0Var4).bottomMargin + i27) - i25));
                            }
                        }
                        paddingTop = paddingTop2 + i23;
                    } else {
                        paddingTop = (((height - paddingBottom) - ((ViewGroup.MarginLayoutParams) n0Var4).bottomMargin) - this.f1377w) - i21;
                    }
                    if (z3) {
                        int i28 = (z5 ? this.t : 0) - iArr[0];
                        max = Math.max(0, i28) + i22;
                        iArr[0] = Math.max(0, -i28);
                        if (q2) {
                            n0 n0Var5 = (n0) this.f1361f.getLayoutParams();
                            int measuredWidth = this.f1361f.getMeasuredWidth() + max;
                            int measuredHeight = this.f1361f.getMeasuredHeight() + paddingTop;
                            this.f1361f.layout(max, paddingTop, measuredWidth, measuredHeight);
                            i10 = measuredWidth + this.f1375u;
                            paddingTop = measuredHeight + ((ViewGroup.MarginLayoutParams) n0Var5).bottomMargin;
                        } else {
                            i10 = max;
                        }
                        if (q3) {
                            int i29 = paddingTop + ((ViewGroup.MarginLayoutParams) ((n0) this.f1362g.getLayoutParams())).topMargin;
                            int measuredWidth2 = this.f1362g.getMeasuredWidth() + max;
                            this.f1362g.layout(max, i29, measuredWidth2, this.f1362g.getMeasuredHeight() + i29);
                            i11 = measuredWidth2 + this.f1375u;
                        } else {
                            i11 = max;
                        }
                        if (z5) {
                            max = Math.max(i10, i11);
                        }
                    } else {
                        int i30 = (z5 ? this.t : 0) - iArr[1];
                        min2 -= Math.max(0, i30);
                        iArr[1] = Math.max(0, -i30);
                        if (q2) {
                            n0 n0Var6 = (n0) this.f1361f.getLayoutParams();
                            int measuredWidth3 = min2 - this.f1361f.getMeasuredWidth();
                            int measuredHeight2 = this.f1361f.getMeasuredHeight() + paddingTop;
                            this.f1361f.layout(measuredWidth3, paddingTop, min2, measuredHeight2);
                            i12 = measuredWidth3 - this.f1375u;
                            paddingTop = measuredHeight2 + ((ViewGroup.MarginLayoutParams) n0Var6).bottomMargin;
                        } else {
                            i12 = min2;
                        }
                        if (q3) {
                            int i31 = paddingTop + ((ViewGroup.MarginLayoutParams) ((n0) this.f1362g.getLayoutParams())).topMargin;
                            this.f1362g.layout(min2 - this.f1362g.getMeasuredWidth(), i31, min2, this.f1362g.getMeasuredHeight() + i31);
                            i13 = min2 - this.f1375u;
                        } else {
                            i13 = min2;
                        }
                        if (z5) {
                            min2 = Math.min(i12, i13);
                        }
                        max = i22;
                    }
                }
                ArrayList arrayList = this.f1352H;
                a(arrayList, 3);
                size = arrayList.size();
                i14 = max;
                for (i15 = 0; i15 < size; i15++) {
                    i14 = m((View) arrayList.get(i15), i14, min, iArr);
                }
                a(arrayList, 5);
                size2 = arrayList.size();
                for (i16 = 0; i16 < size2; i16++) {
                    min2 = n((View) arrayList.get(i16), min2, min, iArr);
                }
                a(arrayList, 1);
                int i32 = iArr[0];
                int i33 = iArr[1];
                size3 = arrayList.size();
                int i34 = i32;
                i17 = 0;
                int i35 = 0;
                while (i17 < size3) {
                    View view = (View) arrayList.get(i17);
                    n0 n0Var7 = (n0) view.getLayoutParams();
                    int i36 = i33;
                    int i37 = ((ViewGroup.MarginLayoutParams) n0Var7).leftMargin - i34;
                    int i38 = ((ViewGroup.MarginLayoutParams) n0Var7).rightMargin - i36;
                    int max2 = Math.max(0, i37);
                    int max3 = Math.max(0, i38);
                    int max4 = Math.max(0, -i37);
                    int max5 = Math.max(0, -i38);
                    i35 += view.getMeasuredWidth() + max2 + max3;
                    i17++;
                    i34 = max4;
                    i33 = max5;
                }
                i19 = ((((width - paddingLeft) - paddingRight) / 2) + paddingLeft) - (i35 / 2);
                int i39 = i35 + i19;
                if (i19 >= i14) {
                    i14 = i39 > min2 ? i19 - (i39 - min2) : i19;
                }
                size4 = arrayList.size();
                for (i18 = 0; i18 < size4; i18++) {
                    i14 = m((View) arrayList.get(i18), i14, min, iArr);
                }
                arrayList.clear();
            }
            i6 = m(this.f1363h, paddingLeft, min, iArr);
        }
        i7 = i20;
        if (q(this.f1367l)) {
        }
        if (q(this.f1360e)) {
        }
        int currentContentInsetLeft2 = getCurrentContentInsetLeft();
        int currentContentInsetRight2 = getCurrentContentInsetRight();
        iArr[0] = Math.max(0, currentContentInsetLeft2 - i6);
        iArr[1] = Math.max(0, currentContentInsetRight2 - (i20 - i7));
        max = Math.max(i6, currentContentInsetLeft2);
        int min22 = Math.min(i7, i20 - currentContentInsetRight2);
        if (q(this.f1368m)) {
        }
        if (q(this.f1364i)) {
        }
        q2 = q(this.f1361f);
        q3 = q(this.f1362g);
        if (q2) {
        }
        if (!q3) {
        }
        if (!q2) {
        }
        if (!q2) {
        }
        if (!q3) {
        }
        n0 n0Var32 = (n0) c0174v.getLayoutParams();
        n0 n0Var42 = (n0) c0174v2.getLayoutParams();
        int i212 = i8;
        if (q2) {
        }
        i9 = this.f1346A & 112;
        int i222 = max;
        if (i9 != 48) {
        }
        if (z3) {
        }
        ArrayList arrayList2 = this.f1352H;
        a(arrayList2, 3);
        size = arrayList2.size();
        i14 = max;
        while (i15 < size) {
        }
        a(arrayList2, 5);
        size2 = arrayList2.size();
        while (i16 < size2) {
        }
        a(arrayList2, 1);
        int i322 = iArr[0];
        int i332 = iArr[1];
        size3 = arrayList2.size();
        int i342 = i322;
        i17 = 0;
        int i352 = 0;
        while (i17 < size3) {
        }
        i19 = ((((width - paddingLeft) - paddingRight) / 2) + paddingLeft) - (i352 / 2);
        int i392 = i352 + i19;
        if (i19 >= i14) {
        }
        size4 = arrayList2.size();
        while (i18 < size4) {
        }
        arrayList2.clear();
    }

    @Override // android.view.View
    public final void onMeasure(int i2, int i3) {
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        boolean a2 = w0.a(this);
        int i11 = !a2 ? 1 : 0;
        int i12 = 0;
        if (q(this.f1363h)) {
            p(this.f1363h, i2, 0, i3, this.f1374s);
            i4 = j(this.f1363h) + this.f1363h.getMeasuredWidth();
            i5 = Math.max(0, k(this.f1363h) + this.f1363h.getMeasuredHeight());
            i6 = View.combineMeasuredStates(0, this.f1363h.getMeasuredState());
        } else {
            i4 = 0;
            i5 = 0;
            i6 = 0;
        }
        if (q(this.f1367l)) {
            p(this.f1367l, i2, 0, i3, this.f1374s);
            i4 = j(this.f1367l) + this.f1367l.getMeasuredWidth();
            i5 = Math.max(i5, k(this.f1367l) + this.f1367l.getMeasuredHeight());
            i6 = View.combineMeasuredStates(i6, this.f1367l.getMeasuredState());
        }
        int currentContentInsetStart = getCurrentContentInsetStart();
        int max = Math.max(currentContentInsetStart, i4);
        int max2 = Math.max(0, currentContentInsetStart - i4);
        int[] iArr = this.f1354J;
        iArr[a2 ? 1 : 0] = max2;
        if (q(this.f1360e)) {
            p(this.f1360e, i2, max, i3, this.f1374s);
            i7 = j(this.f1360e) + this.f1360e.getMeasuredWidth();
            i5 = Math.max(i5, k(this.f1360e) + this.f1360e.getMeasuredHeight());
            i6 = View.combineMeasuredStates(i6, this.f1360e.getMeasuredState());
        } else {
            i7 = 0;
        }
        int currentContentInsetEnd = getCurrentContentInsetEnd();
        int max3 = max + Math.max(currentContentInsetEnd, i7);
        iArr[i11] = Math.max(0, currentContentInsetEnd - i7);
        if (q(this.f1368m)) {
            max3 += o(this.f1368m, i2, max3, i3, 0, iArr);
            i5 = Math.max(i5, k(this.f1368m) + this.f1368m.getMeasuredHeight());
            i6 = View.combineMeasuredStates(i6, this.f1368m.getMeasuredState());
        }
        if (q(this.f1364i)) {
            max3 += o(this.f1364i, i2, max3, i3, 0, iArr);
            i5 = Math.max(i5, k(this.f1364i) + this.f1364i.getMeasuredHeight());
            i6 = View.combineMeasuredStates(i6, this.f1364i.getMeasuredState());
        }
        int childCount = getChildCount();
        for (int i13 = 0; i13 < childCount; i13++) {
            View childAt = getChildAt(i13);
            if (((n0) childAt.getLayoutParams()).f2274b == 0 && q(childAt)) {
                max3 += o(childAt, i2, max3, i3, 0, iArr);
                int max4 = Math.max(i5, k(childAt) + childAt.getMeasuredHeight());
                i6 = View.combineMeasuredStates(i6, childAt.getMeasuredState());
                i5 = max4;
            } else {
                max3 = max3;
            }
        }
        int i14 = max3;
        int i15 = this.f1376v + this.f1377w;
        int i16 = this.t + this.f1375u;
        if (q(this.f1361f)) {
            o(this.f1361f, i2, i14 + i16, i3, i15, iArr);
            int j2 = j(this.f1361f) + this.f1361f.getMeasuredWidth();
            i8 = k(this.f1361f) + this.f1361f.getMeasuredHeight();
            i9 = View.combineMeasuredStates(i6, this.f1361f.getMeasuredState());
            i10 = j2;
        } else {
            i8 = 0;
            i9 = i6;
            i10 = 0;
        }
        if (q(this.f1362g)) {
            i10 = Math.max(i10, o(this.f1362g, i2, i14 + i16, i3, i15 + i8, iArr));
            i8 += k(this.f1362g) + this.f1362g.getMeasuredHeight();
            i9 = View.combineMeasuredStates(i9, this.f1362g.getMeasuredState());
        }
        int max5 = Math.max(i5, i8);
        int paddingRight = getPaddingRight() + getPaddingLeft() + i14 + i10;
        int paddingBottom = getPaddingBottom() + getPaddingTop() + max5;
        int resolveSizeAndState = View.resolveSizeAndState(Math.max(paddingRight, getSuggestedMinimumWidth()), i2, (-16777216) & i9);
        int resolveSizeAndState2 = View.resolveSizeAndState(Math.max(paddingBottom, getSuggestedMinimumHeight()), i3, i9 << 16);
        if (this.f1358N) {
            int childCount2 = getChildCount();
            for (int i17 = 0; i17 < childCount2; i17++) {
                View childAt2 = getChildAt(i17);
                if (!q(childAt2) || childAt2.getMeasuredWidth() <= 0 || childAt2.getMeasuredHeight() <= 0) {
                }
            }
            setMeasuredDimension(resolveSizeAndState, i12);
        }
        i12 = resolveSizeAndState2;
        setMeasuredDimension(resolveSizeAndState, i12);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        MenuItem findItem;
        if (!(parcelable instanceof p0)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        p0 p0Var = (p0) parcelable;
        super.onRestoreInstanceState(p0Var.f209e);
        ActionMenuView actionMenuView = this.f1360e;
        MenuC0143j menuC0143j = actionMenuView != null ? actionMenuView.t : null;
        int i2 = p0Var.f2280g;
        if (i2 != 0 && this.f1357M != null && menuC0143j != null && (findItem = menuC0143j.findItem(i2)) != null) {
            findItem.expandActionView();
        }
        if (p0Var.f2281h) {
            C.b bVar = this.f1359O;
            removeCallbacks(bVar);
            post(bVar);
        }
    }

    @Override // android.view.View
    public final void onRtlPropertiesChanged(int i2) {
        super.onRtlPropertiesChanged(i2);
        d();
        Q q2 = this.f1378x;
        boolean z2 = i2 == 1;
        if (z2 == q2.f2175g) {
            return;
        }
        q2.f2175g = z2;
        if (!q2.f2176h) {
            q2.f2169a = q2.f2173e;
            q2.f2170b = q2.f2174f;
            return;
        }
        if (z2) {
            int i3 = q2.f2172d;
            if (i3 == Integer.MIN_VALUE) {
                i3 = q2.f2173e;
            }
            q2.f2169a = i3;
            int i4 = q2.f2171c;
            if (i4 == Integer.MIN_VALUE) {
                i4 = q2.f2174f;
            }
            q2.f2170b = i4;
            return;
        }
        int i5 = q2.f2171c;
        if (i5 == Integer.MIN_VALUE) {
            i5 = q2.f2173e;
        }
        q2.f2169a = i5;
        int i6 = q2.f2172d;
        if (i6 == Integer.MIN_VALUE) {
            i6 = q2.f2174f;
        }
        q2.f2170b = i6;
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        C0162i c0162i;
        C0159f c0159f;
        MenuItemC0144k menuItemC0144k;
        p0 p0Var = new p0(super.onSaveInstanceState());
        m0 m0Var = this.f1357M;
        if (m0Var != null && (menuItemC0144k = m0Var.f2265f) != null) {
            p0Var.f2280g = menuItemC0144k.f2030a;
        }
        ActionMenuView actionMenuView = this.f1360e;
        p0Var.f2281h = (actionMenuView == null || (c0162i = actionMenuView.f1254w) == null || (c0159f = c0162i.f2243v) == null || !c0159f.b()) ? false : true;
        return p0Var;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f1351F = false;
        }
        if (!this.f1351F) {
            boolean onTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !onTouchEvent) {
                this.f1351F = true;
            }
        }
        if (actionMasked != 1 && actionMasked != 3) {
            return true;
        }
        this.f1351F = false;
        return true;
    }

    public final void p(View view, int i2, int i3, int i4, int i5) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i2, getPaddingRight() + getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i3, marginLayoutParams.width);
        int childMeasureSpec2 = ViewGroup.getChildMeasureSpec(i4, getPaddingBottom() + getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, marginLayoutParams.height);
        int mode = View.MeasureSpec.getMode(childMeasureSpec2);
        if (mode != 1073741824 && i5 >= 0) {
            if (mode != 0) {
                i5 = Math.min(View.MeasureSpec.getSize(childMeasureSpec2), i5);
            }
            childMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i5, 1073741824);
        }
        view.measure(childMeasureSpec, childMeasureSpec2);
    }

    public final boolean q(View view) {
        return (view == null || view.getParent() != this || view.getVisibility() == 8) ? false : true;
    }

    public void setCollapseContentDescription(int i2) {
        setCollapseContentDescription(i2 != 0 ? getContext().getText(i2) : null);
    }

    public void setCollapseIcon(int i2) {
        setCollapseIcon(AbstractC0121a.a(getContext(), i2));
    }

    public void setCollapsible(boolean z2) {
        this.f1358N = z2;
        requestLayout();
    }

    public void setContentInsetEndWithActions(int i2) {
        if (i2 < 0) {
            i2 = Integer.MIN_VALUE;
        }
        if (i2 != this.f1380z) {
            this.f1380z = i2;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setContentInsetStartWithNavigation(int i2) {
        if (i2 < 0) {
            i2 = Integer.MIN_VALUE;
        }
        if (i2 != this.f1379y) {
            this.f1379y = i2;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setLogo(int i2) {
        setLogo(AbstractC0121a.a(getContext(), i2));
    }

    public void setLogoDescription(int i2) {
        setLogoDescription(getContext().getText(i2));
    }

    public void setNavigationContentDescription(int i2) {
        setNavigationContentDescription(i2 != 0 ? getContext().getText(i2) : null);
    }

    public void setNavigationIcon(int i2) {
        setNavigationIcon(AbstractC0121a.a(getContext(), i2));
    }

    public void setNavigationOnClickListener(View.OnClickListener onClickListener) {
        f();
        this.f1363h.setOnClickListener(onClickListener);
    }

    public void setOverflowIcon(Drawable drawable) {
        e();
        this.f1360e.setOverflowIcon(drawable);
    }

    public void setPopupTheme(int i2) {
        if (this.f1370o != i2) {
            this.f1370o = i2;
            if (i2 == 0) {
                this.f1369n = getContext();
            } else {
                this.f1369n = new ContextThemeWrapper(getContext(), i2);
            }
        }
    }

    public void setSubtitle(int i2) {
        setSubtitle(getContext().getText(i2));
    }

    public void setSubtitleTextColor(int i2) {
        setSubtitleTextColor(ColorStateList.valueOf(i2));
    }

    public void setTitle(int i2) {
        setTitle(getContext().getText(i2));
    }

    public void setTitleMarginBottom(int i2) {
        this.f1377w = i2;
        requestLayout();
    }

    public void setTitleMarginEnd(int i2) {
        this.f1375u = i2;
        requestLayout();
    }

    public void setTitleMarginStart(int i2) {
        this.t = i2;
        requestLayout();
    }

    public void setTitleMarginTop(int i2) {
        this.f1376v = i2;
        requestLayout();
    }

    public void setTitleTextColor(int i2) {
        setTitleTextColor(ColorStateList.valueOf(i2));
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        Context context = getContext();
        n0 n0Var = new n0(context, attributeSet);
        n0Var.f2273a = 0;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0119a.f1788b);
        n0Var.f2273a = obtainStyledAttributes.getInt(0, 0);
        obtainStyledAttributes.recycle();
        n0Var.f2274b = 0;
        return n0Var;
    }

    public void setCollapseContentDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            c();
        }
        C0169p c0169p = this.f1367l;
        if (c0169p != null) {
            c0169p.setContentDescription(charSequence);
        }
    }

    public void setCollapseIcon(Drawable drawable) {
        if (drawable != null) {
            c();
            this.f1367l.setImageDrawable(drawable);
        } else {
            C0169p c0169p = this.f1367l;
            if (c0169p != null) {
                c0169p.setImageDrawable(this.f1365j);
            }
        }
    }

    public void setLogo(Drawable drawable) {
        if (drawable != null) {
            if (this.f1364i == null) {
                this.f1364i = new C0170q(getContext(), 0);
            }
            if (!l(this.f1364i)) {
                b(this.f1364i, true);
            }
        } else {
            C0170q c0170q = this.f1364i;
            if (c0170q != null && l(c0170q)) {
                removeView(this.f1364i);
                this.f1353I.remove(this.f1364i);
            }
        }
        C0170q c0170q2 = this.f1364i;
        if (c0170q2 != null) {
            c0170q2.setImageDrawable(drawable);
        }
    }

    public void setLogoDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence) && this.f1364i == null) {
            this.f1364i = new C0170q(getContext(), 0);
        }
        C0170q c0170q = this.f1364i;
        if (c0170q != null) {
            c0170q.setContentDescription(charSequence);
        }
    }

    public void setNavigationContentDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            f();
        }
        C0169p c0169p = this.f1363h;
        if (c0169p != null) {
            c0169p.setContentDescription(charSequence);
        }
    }

    public void setNavigationIcon(Drawable drawable) {
        if (drawable != null) {
            f();
            if (!l(this.f1363h)) {
                b(this.f1363h, true);
            }
        } else {
            C0169p c0169p = this.f1363h;
            if (c0169p != null && l(c0169p)) {
                removeView(this.f1363h);
                this.f1353I.remove(this.f1363h);
            }
        }
        C0169p c0169p2 = this.f1363h;
        if (c0169p2 != null) {
            c0169p2.setImageDrawable(drawable);
        }
    }

    public void setSubtitle(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            C0174v c0174v = this.f1362g;
            if (c0174v != null && l(c0174v)) {
                removeView(this.f1362g);
                this.f1353I.remove(this.f1362g);
            }
        } else {
            if (this.f1362g == null) {
                Context context = getContext();
                C0174v c0174v2 = new C0174v(context, null);
                this.f1362g = c0174v2;
                c0174v2.setSingleLine();
                this.f1362g.setEllipsize(TextUtils.TruncateAt.END);
                int i2 = this.f1372q;
                if (i2 != 0) {
                    this.f1362g.setTextAppearance(context, i2);
                }
                ColorStateList colorStateList = this.f1350E;
                if (colorStateList != null) {
                    this.f1362g.setTextColor(colorStateList);
                }
            }
            if (!l(this.f1362g)) {
                b(this.f1362g, true);
            }
        }
        C0174v c0174v3 = this.f1362g;
        if (c0174v3 != null) {
            c0174v3.setText(charSequence);
        }
        this.f1348C = charSequence;
    }

    public void setSubtitleTextColor(ColorStateList colorStateList) {
        this.f1350E = colorStateList;
        C0174v c0174v = this.f1362g;
        if (c0174v != null) {
            c0174v.setTextColor(colorStateList);
        }
    }

    public void setTitle(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            C0174v c0174v = this.f1361f;
            if (c0174v != null && l(c0174v)) {
                removeView(this.f1361f);
                this.f1353I.remove(this.f1361f);
            }
        } else {
            if (this.f1361f == null) {
                Context context = getContext();
                C0174v c0174v2 = new C0174v(context, null);
                this.f1361f = c0174v2;
                c0174v2.setSingleLine();
                this.f1361f.setEllipsize(TextUtils.TruncateAt.END);
                int i2 = this.f1371p;
                if (i2 != 0) {
                    this.f1361f.setTextAppearance(context, i2);
                }
                ColorStateList colorStateList = this.f1349D;
                if (colorStateList != null) {
                    this.f1361f.setTextColor(colorStateList);
                }
            }
            if (!l(this.f1361f)) {
                b(this.f1361f, true);
            }
        }
        C0174v c0174v3 = this.f1361f;
        if (c0174v3 != null) {
            c0174v3.setText(charSequence);
        }
        this.f1347B = charSequence;
    }

    public void setTitleTextColor(ColorStateList colorStateList) {
        this.f1349D = colorStateList;
        C0174v c0174v = this.f1361f;
        if (c0174v != null) {
            c0174v.setTextColor(colorStateList);
        }
    }

    public void setOnMenuItemClickListener(o0 o0Var) {
    }
}
