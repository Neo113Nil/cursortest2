package androidx.appcompat.widget;

import L.C0014l;
import L.T;
import N0.B;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Build;
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
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import com.google.android.material.datepicker.j;
import com.winfour.winrandom.R;
import f.AbstractC0097a;
import h.AbstractC0112a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import k.h;
import l.C0171o;
import l.MenuC0169m;
import m.C0208d0;
import m.C0221k;
import m.C0249y;
import m.C0251z;
import m.InterfaceC0226m0;
import m.S0;
import m.b1;
import m.c1;
import m.d1;
import m.e1;
import m.f1;
import m.g1;
import m.h1;
import m.i1;
import m.j1;
import m.k1;
import m.o1;

/* loaded from: classes.dex */
public class Toolbar extends ViewGroup {

    /* renamed from: A, reason: collision with root package name */
    public ColorStateList f1413A;

    /* renamed from: B, reason: collision with root package name */
    public boolean f1414B;

    /* renamed from: C, reason: collision with root package name */
    public boolean f1415C;

    /* renamed from: D, reason: collision with root package name */
    public final ArrayList f1416D;

    /* renamed from: E, reason: collision with root package name */
    public final ArrayList f1417E;

    /* renamed from: F, reason: collision with root package name */
    public final int[] f1418F;
    public final C0014l G;

    /* renamed from: H, reason: collision with root package name */
    public ArrayList f1419H;

    /* renamed from: I, reason: collision with root package name */
    public final c1 f1420I;

    /* renamed from: J, reason: collision with root package name */
    public j1 f1421J;

    /* renamed from: K, reason: collision with root package name */
    public C0221k f1422K;

    /* renamed from: L, reason: collision with root package name */
    public e1 f1423L;

    /* renamed from: M, reason: collision with root package name */
    public boolean f1424M;

    /* renamed from: N, reason: collision with root package name */
    public OnBackInvokedCallback f1425N;

    /* renamed from: O, reason: collision with root package name */
    public OnBackInvokedDispatcher f1426O;

    /* renamed from: P, reason: collision with root package name */
    public boolean f1427P;

    /* renamed from: Q, reason: collision with root package name */
    public final B f1428Q;

    /* renamed from: a, reason: collision with root package name */
    public ActionMenuView f1429a;

    /* renamed from: b, reason: collision with root package name */
    public C0208d0 f1430b;

    /* renamed from: c, reason: collision with root package name */
    public C0208d0 f1431c;
    public C0249y d;

    /* renamed from: e, reason: collision with root package name */
    public C0251z f1432e;

    /* renamed from: f, reason: collision with root package name */
    public final Drawable f1433f;

    /* renamed from: g, reason: collision with root package name */
    public final CharSequence f1434g;

    /* renamed from: h, reason: collision with root package name */
    public C0249y f1435h;
    public View i;

    /* renamed from: j, reason: collision with root package name */
    public Context f1436j;

    /* renamed from: k, reason: collision with root package name */
    public int f1437k;

    /* renamed from: l, reason: collision with root package name */
    public int f1438l;

    /* renamed from: m, reason: collision with root package name */
    public int f1439m;

    /* renamed from: n, reason: collision with root package name */
    public final int f1440n;

    /* renamed from: o, reason: collision with root package name */
    public final int f1441o;

    /* renamed from: p, reason: collision with root package name */
    public int f1442p;

    /* renamed from: q, reason: collision with root package name */
    public int f1443q;

    /* renamed from: r, reason: collision with root package name */
    public int f1444r;

    /* renamed from: s, reason: collision with root package name */
    public int f1445s;

    /* renamed from: t, reason: collision with root package name */
    public S0 f1446t;

    /* renamed from: u, reason: collision with root package name */
    public int f1447u;

    /* renamed from: v, reason: collision with root package name */
    public int f1448v;

    /* renamed from: w, reason: collision with root package name */
    public final int f1449w;

    /* renamed from: x, reason: collision with root package name */
    public CharSequence f1450x;

    /* renamed from: y, reason: collision with root package name */
    public CharSequence f1451y;

    /* renamed from: z, reason: collision with root package name */
    public ColorStateList f1452z;

    public Toolbar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    private ArrayList<MenuItem> getCurrentMenuItems() {
        ArrayList<MenuItem> arrayList = new ArrayList<>();
        Menu menu = getMenu();
        for (int i = 0; i < menu.size(); i++) {
            arrayList.add(menu.getItem(i));
        }
        return arrayList;
    }

    private MenuInflater getMenuInflater() {
        return new h(getContext());
    }

    public static f1 h() {
        f1 f1Var = new f1(-2, -2);
        f1Var.f3087b = 0;
        f1Var.f3086a = 8388627;
        return f1Var;
    }

    public static f1 i(ViewGroup.LayoutParams layoutParams) {
        boolean z2 = layoutParams instanceof f1;
        if (z2) {
            f1 f1Var = (f1) layoutParams;
            f1 f1Var2 = new f1(f1Var);
            f1Var2.f3087b = 0;
            f1Var2.f3087b = f1Var.f3087b;
            return f1Var2;
        }
        if (z2) {
            f1 f1Var3 = new f1((f1) layoutParams);
            f1Var3.f3087b = 0;
            return f1Var3;
        }
        if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
            f1 f1Var4 = new f1(layoutParams);
            f1Var4.f3087b = 0;
            return f1Var4;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        f1 f1Var5 = new f1(marginLayoutParams);
        f1Var5.f3087b = 0;
        ((ViewGroup.MarginLayoutParams) f1Var5).leftMargin = marginLayoutParams.leftMargin;
        ((ViewGroup.MarginLayoutParams) f1Var5).topMargin = marginLayoutParams.topMargin;
        ((ViewGroup.MarginLayoutParams) f1Var5).rightMargin = marginLayoutParams.rightMargin;
        ((ViewGroup.MarginLayoutParams) f1Var5).bottomMargin = marginLayoutParams.bottomMargin;
        return f1Var5;
    }

    public static int k(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return marginLayoutParams.getMarginEnd() + marginLayoutParams.getMarginStart();
    }

    public static int l(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
    }

    public final void a(ArrayList arrayList, int i) {
        boolean z2 = getLayoutDirection() == 1;
        int childCount = getChildCount();
        int absoluteGravity = Gravity.getAbsoluteGravity(i, getLayoutDirection());
        arrayList.clear();
        if (!z2) {
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = getChildAt(i2);
                f1 f1Var = (f1) childAt.getLayoutParams();
                if (f1Var.f3087b == 0 && t(childAt)) {
                    int i3 = f1Var.f3086a;
                    int layoutDirection = getLayoutDirection();
                    int absoluteGravity2 = Gravity.getAbsoluteGravity(i3, layoutDirection) & 7;
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
        for (int i4 = childCount - 1; i4 >= 0; i4--) {
            View childAt2 = getChildAt(i4);
            f1 f1Var2 = (f1) childAt2.getLayoutParams();
            if (f1Var2.f3087b == 0 && t(childAt2)) {
                int i5 = f1Var2.f3086a;
                int layoutDirection2 = getLayoutDirection();
                int absoluteGravity3 = Gravity.getAbsoluteGravity(i5, layoutDirection2) & 7;
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
        f1 h2 = layoutParams == null ? h() : !checkLayoutParams(layoutParams) ? i(layoutParams) : (f1) layoutParams;
        h2.f3087b = 1;
        if (!z2 || this.i == null) {
            addView(view, h2);
        } else {
            view.setLayoutParams(h2);
            this.f1417E.add(view);
        }
    }

    public final void c() {
        if (this.f1435h == null) {
            C0249y c0249y = new C0249y(getContext(), null, R.attr.toolbarNavigationButtonStyle);
            this.f1435h = c0249y;
            c0249y.setImageDrawable(this.f1433f);
            this.f1435h.setContentDescription(this.f1434g);
            f1 h2 = h();
            h2.f3086a = (this.f1440n & 112) | 8388611;
            h2.f3087b = 2;
            this.f1435h.setLayoutParams(h2);
            this.f1435h.setOnClickListener(new j(3, this));
        }
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return super.checkLayoutParams(layoutParams) && (layoutParams instanceof f1);
    }

    public final void d() {
        if (this.f1446t == null) {
            S0 s02 = new S0();
            s02.f2988a = 0;
            s02.f2989b = 0;
            s02.f2990c = Integer.MIN_VALUE;
            s02.d = Integer.MIN_VALUE;
            s02.f2991e = 0;
            s02.f2992f = 0;
            s02.f2993g = false;
            s02.f2994h = false;
            this.f1446t = s02;
        }
    }

    public final void e() {
        f();
        ActionMenuView actionMenuView = this.f1429a;
        if (actionMenuView.f1388p == null) {
            MenuC0169m menuC0169m = (MenuC0169m) actionMenuView.getMenu();
            if (this.f1423L == null) {
                this.f1423L = new e1(this);
            }
            this.f1429a.setExpandedActionViewsExclusive(true);
            menuC0169m.b(this.f1423L, this.f1436j);
            u();
        }
    }

    public final void f() {
        if (this.f1429a == null) {
            ActionMenuView actionMenuView = new ActionMenuView(getContext(), null);
            this.f1429a = actionMenuView;
            actionMenuView.setPopupTheme(this.f1437k);
            this.f1429a.setOnMenuItemClickListener(this.f1420I);
            ActionMenuView actionMenuView2 = this.f1429a;
            c1 c1Var = new c1(this);
            actionMenuView2.getClass();
            actionMenuView2.f1393u = c1Var;
            f1 h2 = h();
            h2.f3086a = (this.f1440n & 112) | 8388613;
            this.f1429a.setLayoutParams(h2);
            b(this.f1429a, false);
        }
    }

    public final void g() {
        if (this.d == null) {
            this.d = new C0249y(getContext(), null, R.attr.toolbarNavigationButtonStyle);
            f1 h2 = h();
            h2.f3086a = (this.f1440n & 112) | 8388611;
            this.d.setLayoutParams(h2);
        }
    }

    @Override // android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return h();
    }

    @Override // android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return i(layoutParams);
    }

    public CharSequence getCollapseContentDescription() {
        C0249y c0249y = this.f1435h;
        if (c0249y != null) {
            return c0249y.getContentDescription();
        }
        return null;
    }

    public Drawable getCollapseIcon() {
        C0249y c0249y = this.f1435h;
        if (c0249y != null) {
            return c0249y.getDrawable();
        }
        return null;
    }

    public int getContentInsetEnd() {
        S0 s02 = this.f1446t;
        if (s02 != null) {
            return s02.f2993g ? s02.f2988a : s02.f2989b;
        }
        return 0;
    }

    public int getContentInsetEndWithActions() {
        int i = this.f1448v;
        return i != Integer.MIN_VALUE ? i : getContentInsetEnd();
    }

    public int getContentInsetLeft() {
        S0 s02 = this.f1446t;
        if (s02 != null) {
            return s02.f2988a;
        }
        return 0;
    }

    public int getContentInsetRight() {
        S0 s02 = this.f1446t;
        if (s02 != null) {
            return s02.f2989b;
        }
        return 0;
    }

    public int getContentInsetStart() {
        S0 s02 = this.f1446t;
        if (s02 != null) {
            return s02.f2993g ? s02.f2989b : s02.f2988a;
        }
        return 0;
    }

    public int getContentInsetStartWithNavigation() {
        int i = this.f1447u;
        return i != Integer.MIN_VALUE ? i : getContentInsetStart();
    }

    public int getCurrentContentInsetEnd() {
        MenuC0169m menuC0169m;
        ActionMenuView actionMenuView = this.f1429a;
        return (actionMenuView == null || (menuC0169m = actionMenuView.f1388p) == null || !menuC0169m.hasVisibleItems()) ? getContentInsetEnd() : Math.max(getContentInsetEnd(), Math.max(this.f1448v, 0));
    }

    public int getCurrentContentInsetLeft() {
        return getLayoutDirection() == 1 ? getCurrentContentInsetEnd() : getCurrentContentInsetStart();
    }

    public int getCurrentContentInsetRight() {
        return getLayoutDirection() == 1 ? getCurrentContentInsetStart() : getCurrentContentInsetEnd();
    }

    public int getCurrentContentInsetStart() {
        return getNavigationIcon() != null ? Math.max(getContentInsetStart(), Math.max(this.f1447u, 0)) : getContentInsetStart();
    }

    public Drawable getLogo() {
        C0251z c0251z = this.f1432e;
        if (c0251z != null) {
            return c0251z.getDrawable();
        }
        return null;
    }

    public CharSequence getLogoDescription() {
        C0251z c0251z = this.f1432e;
        if (c0251z != null) {
            return c0251z.getContentDescription();
        }
        return null;
    }

    public Menu getMenu() {
        e();
        return this.f1429a.getMenu();
    }

    public View getNavButtonView() {
        return this.d;
    }

    public CharSequence getNavigationContentDescription() {
        C0249y c0249y = this.d;
        if (c0249y != null) {
            return c0249y.getContentDescription();
        }
        return null;
    }

    public Drawable getNavigationIcon() {
        C0249y c0249y = this.d;
        if (c0249y != null) {
            return c0249y.getDrawable();
        }
        return null;
    }

    public C0221k getOuterActionMenuPresenter() {
        return this.f1422K;
    }

    public Drawable getOverflowIcon() {
        e();
        return this.f1429a.getOverflowIcon();
    }

    public Context getPopupContext() {
        return this.f1436j;
    }

    public int getPopupTheme() {
        return this.f1437k;
    }

    public CharSequence getSubtitle() {
        return this.f1451y;
    }

    public final TextView getSubtitleTextView() {
        return this.f1431c;
    }

    public CharSequence getTitle() {
        return this.f1450x;
    }

    public int getTitleMarginBottom() {
        return this.f1445s;
    }

    public int getTitleMarginEnd() {
        return this.f1443q;
    }

    public int getTitleMarginStart() {
        return this.f1442p;
    }

    public int getTitleMarginTop() {
        return this.f1444r;
    }

    public final TextView getTitleTextView() {
        return this.f1430b;
    }

    public InterfaceC0226m0 getWrapper() {
        Drawable drawable;
        if (this.f1421J == null) {
            j1 j1Var = new j1();
            j1Var.f3121n = 0;
            j1Var.f3110a = this;
            j1Var.f3116h = getTitle();
            j1Var.i = getSubtitle();
            j1Var.f3115g = j1Var.f3116h != null;
            j1Var.f3114f = getNavigationIcon();
            C0014l i = C0014l.i(getContext(), null, AbstractC0097a.f2136a, R.attr.actionBarStyle);
            j1Var.f3122o = i.c(15);
            TypedArray typedArray = (TypedArray) i.f543b;
            CharSequence text = typedArray.getText(27);
            if (!TextUtils.isEmpty(text)) {
                j1Var.f3115g = true;
                j1Var.f3116h = text;
                if ((j1Var.f3111b & 8) != 0) {
                    Toolbar toolbar = j1Var.f3110a;
                    toolbar.setTitle(text);
                    if (j1Var.f3115g) {
                        T.m(toolbar.getRootView(), text);
                    }
                }
            }
            CharSequence text2 = typedArray.getText(25);
            if (!TextUtils.isEmpty(text2)) {
                j1Var.i = text2;
                if ((j1Var.f3111b & 8) != 0) {
                    setSubtitle(text2);
                }
            }
            Drawable c2 = i.c(20);
            if (c2 != null) {
                j1Var.f3113e = c2;
                j1Var.c();
            }
            Drawable c3 = i.c(17);
            if (c3 != null) {
                j1Var.d = c3;
                j1Var.c();
            }
            if (j1Var.f3114f == null && (drawable = j1Var.f3122o) != null) {
                j1Var.f3114f = drawable;
                int i2 = j1Var.f3111b & 4;
                Toolbar toolbar2 = j1Var.f3110a;
                if (i2 != 0) {
                    toolbar2.setNavigationIcon(drawable);
                } else {
                    toolbar2.setNavigationIcon((Drawable) null);
                }
            }
            j1Var.a(typedArray.getInt(10, 0));
            int resourceId = typedArray.getResourceId(9, 0);
            if (resourceId != 0) {
                View inflate = LayoutInflater.from(getContext()).inflate(resourceId, (ViewGroup) this, false);
                View view = j1Var.f3112c;
                if (view != null && (j1Var.f3111b & 16) != 0) {
                    removeView(view);
                }
                j1Var.f3112c = inflate;
                if (inflate != null && (j1Var.f3111b & 16) != 0) {
                    addView(inflate);
                }
                j1Var.a(j1Var.f3111b | 16);
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
                this.f1446t.a(max, max2);
            }
            int resourceId2 = typedArray.getResourceId(28, 0);
            if (resourceId2 != 0) {
                Context context = getContext();
                this.f1438l = resourceId2;
                C0208d0 c0208d0 = this.f1430b;
                if (c0208d0 != null) {
                    c0208d0.setTextAppearance(context, resourceId2);
                }
            }
            int resourceId3 = typedArray.getResourceId(26, 0);
            if (resourceId3 != 0) {
                Context context2 = getContext();
                this.f1439m = resourceId3;
                C0208d0 c0208d02 = this.f1431c;
                if (c0208d02 != null) {
                    c0208d02.setTextAppearance(context2, resourceId3);
                }
            }
            int resourceId4 = typedArray.getResourceId(22, 0);
            if (resourceId4 != 0) {
                setPopupTheme(resourceId4);
            }
            i.k();
            if (R.string.abc_action_bar_up_description != j1Var.f3121n) {
                j1Var.f3121n = R.string.abc_action_bar_up_description;
                if (TextUtils.isEmpty(getNavigationContentDescription())) {
                    int i3 = j1Var.f3121n;
                    j1Var.f3117j = i3 != 0 ? getContext().getString(i3) : null;
                    j1Var.b();
                }
            }
            j1Var.f3117j = getNavigationContentDescription();
            setNavigationOnClickListener(new i1(j1Var));
            this.f1421J = j1Var;
        }
        return this.f1421J;
    }

    public final int j(View view, int i) {
        f1 f1Var = (f1) view.getLayoutParams();
        int measuredHeight = view.getMeasuredHeight();
        int i2 = i > 0 ? (measuredHeight - i) / 2 : 0;
        int i3 = f1Var.f3086a & 112;
        if (i3 != 16 && i3 != 48 && i3 != 80) {
            i3 = this.f1449w & 112;
        }
        if (i3 == 48) {
            return getPaddingTop() - i2;
        }
        if (i3 == 80) {
            return (((getHeight() - getPaddingBottom()) - measuredHeight) - ((ViewGroup.MarginLayoutParams) f1Var).bottomMargin) - i2;
        }
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int height = getHeight();
        int i4 = (((height - paddingTop) - paddingBottom) - measuredHeight) / 2;
        int i5 = ((ViewGroup.MarginLayoutParams) f1Var).topMargin;
        if (i4 < i5) {
            i4 = i5;
        } else {
            int i6 = (((height - paddingBottom) - measuredHeight) - i4) - paddingTop;
            int i7 = ((ViewGroup.MarginLayoutParams) f1Var).bottomMargin;
            if (i6 < i7) {
                i4 = Math.max(0, i4 - (i7 - i6));
            }
        }
        return paddingTop + i4;
    }

    public void m(int i) {
        getMenuInflater().inflate(i, getMenu());
    }

    public final void n() {
        Iterator it = this.f1419H.iterator();
        while (it.hasNext()) {
            getMenu().removeItem(((MenuItem) it.next()).getItemId());
        }
        getMenu();
        ArrayList<MenuItem> currentMenuItems = getCurrentMenuItems();
        getMenuInflater();
        Iterator it2 = ((CopyOnWriteArrayList) this.G.f543b).iterator();
        while (it2.hasNext()) {
            ((Z.B) it2.next()).f992a.j();
        }
        ArrayList<MenuItem> currentMenuItems2 = getCurrentMenuItems();
        currentMenuItems2.removeAll(currentMenuItems);
        this.f1419H = currentMenuItems2;
    }

    public final boolean o(View view) {
        return view.getParent() == this || this.f1417E.contains(view);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        u();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeCallbacks(this.f1428Q);
        u();
    }

    @Override // android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.f1415C = false;
        }
        if (!this.f1415C) {
            boolean onHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !onHoverEvent) {
                this.f1415C = true;
            }
        }
        if (actionMasked == 10 || actionMasked == 3) {
            this.f1415C = false;
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:112:0x01a2  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0298 A[LOOP:0: B:40:0x0296->B:41:0x0298, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x02b5 A[LOOP:1: B:44:0x02b3->B:45:0x02b5, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x02d3 A[LOOP:2: B:48:0x02d1->B:49:0x02d3, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0314  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0321 A[LOOP:3: B:57:0x031f->B:58:0x0321, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01b1  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0221  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onLayout(boolean z2, int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        boolean t2;
        boolean t3;
        int i7;
        int i8;
        int i9;
        int i10;
        boolean z3;
        int i11;
        int i12;
        int i13;
        int paddingTop;
        int i14;
        int i15;
        int i16;
        int i17;
        int size;
        int i18;
        int i19;
        int size2;
        int i20;
        int size3;
        int i21;
        int i22;
        int i23;
        int size4;
        boolean z4 = getLayoutDirection() == 1;
        int width = getWidth();
        int height = getHeight();
        int paddingLeft = getPaddingLeft();
        int paddingRight = getPaddingRight();
        int paddingTop2 = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int i24 = width - paddingRight;
        int[] iArr = this.f1418F;
        iArr[1] = 0;
        iArr[0] = 0;
        WeakHashMap weakHashMap = T.f490a;
        int minimumHeight = getMinimumHeight();
        int min = minimumHeight >= 0 ? Math.min(minimumHeight, i4 - i2) : 0;
        if (!t(this.d)) {
            i5 = paddingLeft;
        } else {
            if (z4) {
                i6 = q(this.d, i24, min, iArr);
                i5 = paddingLeft;
                if (t(this.f1435h)) {
                    if (z4) {
                        i6 = q(this.f1435h, i6, min, iArr);
                    } else {
                        i5 = p(this.f1435h, i5, min, iArr);
                    }
                }
                if (t(this.f1429a)) {
                    if (z4) {
                        i5 = p(this.f1429a, i5, min, iArr);
                    } else {
                        i6 = q(this.f1429a, i6, min, iArr);
                    }
                }
                int currentContentInsetLeft = getCurrentContentInsetLeft();
                int currentContentInsetRight = getCurrentContentInsetRight();
                iArr[0] = Math.max(0, currentContentInsetLeft - i5);
                iArr[1] = Math.max(0, currentContentInsetRight - (i24 - i6));
                int max = Math.max(i5, currentContentInsetLeft);
                int min2 = Math.min(i6, i24 - currentContentInsetRight);
                if (t(this.i)) {
                    if (z4) {
                        min2 = q(this.i, min2, min, iArr);
                    } else {
                        max = p(this.i, max, min, iArr);
                    }
                }
                if (t(this.f1432e)) {
                    if (z4) {
                        min2 = q(this.f1432e, min2, min, iArr);
                    } else {
                        max = p(this.f1432e, max, min, iArr);
                    }
                }
                t2 = t(this.f1430b);
                t3 = t(this.f1431c);
                if (t2) {
                    i7 = paddingRight;
                    i8 = 0;
                } else {
                    f1 f1Var = (f1) this.f1430b.getLayoutParams();
                    i7 = paddingRight;
                    i8 = ((ViewGroup.MarginLayoutParams) f1Var).bottomMargin + this.f1430b.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) f1Var).topMargin;
                }
                if (t3) {
                    i9 = width;
                } else {
                    f1 f1Var2 = (f1) this.f1431c.getLayoutParams();
                    i9 = width;
                    i8 += this.f1431c.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) f1Var2).topMargin + ((ViewGroup.MarginLayoutParams) f1Var2).bottomMargin;
                }
                if (!t2 || t3) {
                    C0208d0 c0208d0 = !t2 ? this.f1430b : this.f1431c;
                    C0208d0 c0208d02 = !t3 ? this.f1431c : this.f1430b;
                    f1 f1Var3 = (f1) c0208d0.getLayoutParams();
                    f1 f1Var4 = (f1) c0208d02.getLayoutParams();
                    if ((t2 || this.f1430b.getMeasuredWidth() <= 0) && (!t3 || this.f1431c.getMeasuredWidth() <= 0)) {
                        i10 = paddingLeft;
                        z3 = false;
                    } else {
                        i10 = paddingLeft;
                        z3 = true;
                    }
                    i11 = this.f1449w & 112;
                    i12 = min;
                    if (i11 != 48) {
                        i13 = max;
                        paddingTop = getPaddingTop() + ((ViewGroup.MarginLayoutParams) f1Var3).topMargin + this.f1444r;
                    } else if (i11 != 80) {
                        int i25 = (((height - paddingTop2) - paddingBottom) - i8) / 2;
                        i13 = max;
                        int i26 = ((ViewGroup.MarginLayoutParams) f1Var3).topMargin + this.f1444r;
                        if (i25 < i26) {
                            i25 = i26;
                        } else {
                            int i27 = (((height - paddingBottom) - i8) - i25) - paddingTop2;
                            int i28 = ((ViewGroup.MarginLayoutParams) f1Var3).bottomMargin;
                            int i29 = this.f1445s;
                            if (i27 < i28 + i29) {
                                i25 = Math.max(0, i25 - ((((ViewGroup.MarginLayoutParams) f1Var4).bottomMargin + i29) - i27));
                            }
                        }
                        paddingTop = paddingTop2 + i25;
                    } else {
                        i13 = max;
                        paddingTop = (((height - paddingBottom) - ((ViewGroup.MarginLayoutParams) f1Var4).bottomMargin) - this.f1445s) - i8;
                    }
                    if (z4) {
                        int i30 = (z3 ? this.f1442p : 0) - iArr[0];
                        max = Math.max(0, i30) + i13;
                        iArr[0] = Math.max(0, -i30);
                        if (t2) {
                            f1 f1Var5 = (f1) this.f1430b.getLayoutParams();
                            int measuredWidth = this.f1430b.getMeasuredWidth() + max;
                            int measuredHeight = this.f1430b.getMeasuredHeight() + paddingTop;
                            this.f1430b.layout(max, paddingTop, measuredWidth, measuredHeight);
                            i14 = measuredWidth + this.f1443q;
                            paddingTop = measuredHeight + ((ViewGroup.MarginLayoutParams) f1Var5).bottomMargin;
                        } else {
                            i14 = max;
                        }
                        if (t3) {
                            int i31 = paddingTop + ((ViewGroup.MarginLayoutParams) ((f1) this.f1431c.getLayoutParams())).topMargin;
                            int measuredWidth2 = this.f1431c.getMeasuredWidth() + max;
                            this.f1431c.layout(max, i31, measuredWidth2, this.f1431c.getMeasuredHeight() + i31);
                            i15 = measuredWidth2 + this.f1443q;
                        } else {
                            i15 = max;
                        }
                        if (z3) {
                            max = Math.max(i14, i15);
                        }
                    } else {
                        int i32 = (z3 ? this.f1442p : 0) - iArr[1];
                        min2 -= Math.max(0, i32);
                        iArr[1] = Math.max(0, -i32);
                        if (t2) {
                            f1 f1Var6 = (f1) this.f1430b.getLayoutParams();
                            int measuredWidth3 = min2 - this.f1430b.getMeasuredWidth();
                            int measuredHeight2 = this.f1430b.getMeasuredHeight() + paddingTop;
                            this.f1430b.layout(measuredWidth3, paddingTop, min2, measuredHeight2);
                            i16 = measuredWidth3 - this.f1443q;
                            paddingTop = measuredHeight2 + ((ViewGroup.MarginLayoutParams) f1Var6).bottomMargin;
                        } else {
                            i16 = min2;
                        }
                        if (t3) {
                            int i33 = paddingTop + ((ViewGroup.MarginLayoutParams) ((f1) this.f1431c.getLayoutParams())).topMargin;
                            this.f1431c.layout(min2 - this.f1431c.getMeasuredWidth(), i33, min2, this.f1431c.getMeasuredHeight() + i33);
                            i17 = min2 - this.f1443q;
                        } else {
                            i17 = min2;
                        }
                        if (z3) {
                            min2 = Math.min(i16, i17);
                        }
                        max = i13;
                    }
                } else {
                    i10 = paddingLeft;
                    i12 = min;
                }
                ArrayList arrayList = this.f1416D;
                a(arrayList, 3);
                size = arrayList.size();
                i18 = max;
                for (i19 = 0; i19 < size; i19++) {
                    i18 = p((View) arrayList.get(i19), i18, i12, iArr);
                }
                int i34 = i12;
                a(arrayList, 5);
                size2 = arrayList.size();
                for (i20 = 0; i20 < size2; i20++) {
                    min2 = q((View) arrayList.get(i20), min2, i34, iArr);
                }
                a(arrayList, 1);
                int i35 = iArr[0];
                int i36 = iArr[1];
                size3 = arrayList.size();
                int i37 = i36;
                int i38 = i35;
                i21 = 0;
                int i39 = 0;
                while (i21 < size3) {
                    View view = (View) arrayList.get(i21);
                    f1 f1Var7 = (f1) view.getLayoutParams();
                    int i40 = ((ViewGroup.MarginLayoutParams) f1Var7).leftMargin - i38;
                    int i41 = ((ViewGroup.MarginLayoutParams) f1Var7).rightMargin - i37;
                    int max2 = Math.max(0, i40);
                    int max3 = Math.max(0, i41);
                    int max4 = Math.max(0, -i40);
                    int max5 = Math.max(0, -i41);
                    i39 += view.getMeasuredWidth() + max2 + max3;
                    i21++;
                    i37 = max5;
                    i38 = max4;
                }
                i23 = ((((i9 - i10) - i7) / 2) + i10) - (i39 / 2);
                int i42 = i39 + i23;
                if (i23 >= i18) {
                    i18 = i42 > min2 ? i23 - (i42 - min2) : i23;
                }
                size4 = arrayList.size();
                for (i22 = 0; i22 < size4; i22++) {
                    i18 = p((View) arrayList.get(i22), i18, i34, iArr);
                }
                arrayList.clear();
            }
            i5 = p(this.d, paddingLeft, min, iArr);
        }
        i6 = i24;
        if (t(this.f1435h)) {
        }
        if (t(this.f1429a)) {
        }
        int currentContentInsetLeft2 = getCurrentContentInsetLeft();
        int currentContentInsetRight2 = getCurrentContentInsetRight();
        iArr[0] = Math.max(0, currentContentInsetLeft2 - i5);
        iArr[1] = Math.max(0, currentContentInsetRight2 - (i24 - i6));
        int max6 = Math.max(i5, currentContentInsetLeft2);
        int min22 = Math.min(i6, i24 - currentContentInsetRight2);
        if (t(this.i)) {
        }
        if (t(this.f1432e)) {
        }
        t2 = t(this.f1430b);
        t3 = t(this.f1431c);
        if (t2) {
        }
        if (t3) {
        }
        if (t2) {
        }
        if (!t2) {
        }
        if (!t3) {
        }
        f1 f1Var32 = (f1) c0208d0.getLayoutParams();
        f1 f1Var42 = (f1) c0208d02.getLayoutParams();
        if (t2) {
        }
        i10 = paddingLeft;
        z3 = false;
        i11 = this.f1449w & 112;
        i12 = min;
        if (i11 != 48) {
        }
        if (z4) {
        }
        ArrayList arrayList2 = this.f1416D;
        a(arrayList2, 3);
        size = arrayList2.size();
        i18 = max6;
        while (i19 < size) {
        }
        int i342 = i12;
        a(arrayList2, 5);
        size2 = arrayList2.size();
        while (i20 < size2) {
        }
        a(arrayList2, 1);
        int i352 = iArr[0];
        int i362 = iArr[1];
        size3 = arrayList2.size();
        int i372 = i362;
        int i382 = i352;
        i21 = 0;
        int i392 = 0;
        while (i21 < size3) {
        }
        i23 = ((((i9 - i10) - i7) / 2) + i10) - (i392 / 2);
        int i422 = i392 + i23;
        if (i23 >= i18) {
        }
        size4 = arrayList2.size();
        while (i22 < size4) {
        }
        arrayList2.clear();
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        char c2;
        char c3;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        boolean z2 = o1.f3158a;
        int i10 = 0;
        if (getLayoutDirection() == 1) {
            c3 = 1;
            c2 = 0;
        } else {
            c2 = 1;
            c3 = 0;
        }
        if (t(this.d)) {
            s(this.d, i, 0, i2, this.f1441o);
            i3 = k(this.d) + this.d.getMeasuredWidth();
            i4 = Math.max(0, l(this.d) + this.d.getMeasuredHeight());
            i5 = View.combineMeasuredStates(0, this.d.getMeasuredState());
        } else {
            i3 = 0;
            i4 = 0;
            i5 = 0;
        }
        if (t(this.f1435h)) {
            s(this.f1435h, i, 0, i2, this.f1441o);
            i3 = k(this.f1435h) + this.f1435h.getMeasuredWidth();
            i4 = Math.max(i4, l(this.f1435h) + this.f1435h.getMeasuredHeight());
            i5 = View.combineMeasuredStates(i5, this.f1435h.getMeasuredState());
        }
        int currentContentInsetStart = getCurrentContentInsetStart();
        int max = Math.max(currentContentInsetStart, i3);
        int max2 = Math.max(0, currentContentInsetStart - i3);
        int[] iArr = this.f1418F;
        iArr[c3] = max2;
        if (t(this.f1429a)) {
            s(this.f1429a, i, max, i2, this.f1441o);
            i6 = k(this.f1429a) + this.f1429a.getMeasuredWidth();
            i4 = Math.max(i4, l(this.f1429a) + this.f1429a.getMeasuredHeight());
            i5 = View.combineMeasuredStates(i5, this.f1429a.getMeasuredState());
        } else {
            i6 = 0;
        }
        int currentContentInsetEnd = getCurrentContentInsetEnd();
        int max3 = max + Math.max(currentContentInsetEnd, i6);
        iArr[c2] = Math.max(0, currentContentInsetEnd - i6);
        if (t(this.i)) {
            max3 += r(this.i, i, max3, i2, 0, iArr);
            i4 = Math.max(i4, l(this.i) + this.i.getMeasuredHeight());
            i5 = View.combineMeasuredStates(i5, this.i.getMeasuredState());
        }
        if (t(this.f1432e)) {
            max3 += r(this.f1432e, i, max3, i2, 0, iArr);
            i4 = Math.max(i4, l(this.f1432e) + this.f1432e.getMeasuredHeight());
            i5 = View.combineMeasuredStates(i5, this.f1432e.getMeasuredState());
        }
        int childCount = getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = getChildAt(i11);
            if (((f1) childAt.getLayoutParams()).f3087b == 0 && t(childAt)) {
                max3 += r(childAt, i, max3, i2, 0, iArr);
                i4 = Math.max(i4, l(childAt) + childAt.getMeasuredHeight());
                i5 = View.combineMeasuredStates(i5, childAt.getMeasuredState());
            }
        }
        int i12 = this.f1444r + this.f1445s;
        int i13 = this.f1442p + this.f1443q;
        if (t(this.f1430b)) {
            r(this.f1430b, i, max3 + i13, i2, i12, iArr);
            int k2 = k(this.f1430b) + this.f1430b.getMeasuredWidth();
            i7 = l(this.f1430b) + this.f1430b.getMeasuredHeight();
            i8 = View.combineMeasuredStates(i5, this.f1430b.getMeasuredState());
            i9 = k2;
        } else {
            i7 = 0;
            i8 = i5;
            i9 = 0;
        }
        if (t(this.f1431c)) {
            i9 = Math.max(i9, r(this.f1431c, i, max3 + i13, i2, i7 + i12, iArr));
            i7 = l(this.f1431c) + this.f1431c.getMeasuredHeight() + i7;
            i8 = View.combineMeasuredStates(i8, this.f1431c.getMeasuredState());
        }
        int max4 = Math.max(i4, i7);
        int paddingRight = getPaddingRight() + getPaddingLeft();
        int paddingBottom = getPaddingBottom() + getPaddingTop() + max4;
        int resolveSizeAndState = View.resolveSizeAndState(Math.max(paddingRight + max3 + i9, getSuggestedMinimumWidth()), i, (-16777216) & i8);
        int resolveSizeAndState2 = View.resolveSizeAndState(Math.max(paddingBottom, getSuggestedMinimumHeight()), i2, i8 << 16);
        if (this.f1424M) {
            int childCount2 = getChildCount();
            for (int i14 = 0; i14 < childCount2; i14++) {
                View childAt2 = getChildAt(i14);
                if (!t(childAt2) || childAt2.getMeasuredWidth() <= 0 || childAt2.getMeasuredHeight() <= 0) {
                }
            }
            setMeasuredDimension(resolveSizeAndState, i10);
        }
        i10 = resolveSizeAndState2;
        setMeasuredDimension(resolveSizeAndState, i10);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        MenuItem findItem;
        if (!(parcelable instanceof h1)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        h1 h1Var = (h1) parcelable;
        super.onRestoreInstanceState(h1Var.f826a);
        ActionMenuView actionMenuView = this.f1429a;
        MenuC0169m menuC0169m = actionMenuView != null ? actionMenuView.f1388p : null;
        int i = h1Var.f3091c;
        if (i != 0 && this.f1423L != null && menuC0169m != null && (findItem = menuC0169m.findItem(i)) != null) {
            findItem.expandActionView();
        }
        if (h1Var.d) {
            B b2 = this.f1428Q;
            removeCallbacks(b2);
            post(b2);
        }
    }

    @Override // android.view.View
    public final void onRtlPropertiesChanged(int i) {
        super.onRtlPropertiesChanged(i);
        d();
        S0 s02 = this.f1446t;
        boolean z2 = i == 1;
        if (z2 == s02.f2993g) {
            return;
        }
        s02.f2993g = z2;
        if (!s02.f2994h) {
            s02.f2988a = s02.f2991e;
            s02.f2989b = s02.f2992f;
            return;
        }
        if (z2) {
            int i2 = s02.d;
            if (i2 == Integer.MIN_VALUE) {
                i2 = s02.f2991e;
            }
            s02.f2988a = i2;
            int i3 = s02.f2990c;
            if (i3 == Integer.MIN_VALUE) {
                i3 = s02.f2992f;
            }
            s02.f2989b = i3;
            return;
        }
        int i4 = s02.f2990c;
        if (i4 == Integer.MIN_VALUE) {
            i4 = s02.f2991e;
        }
        s02.f2988a = i4;
        int i5 = s02.d;
        if (i5 == Integer.MIN_VALUE) {
            i5 = s02.f2992f;
        }
        s02.f2989b = i5;
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        C0221k c0221k;
        C0171o c0171o;
        h1 h1Var = new h1(super.onSaveInstanceState());
        e1 e1Var = this.f1423L;
        if (e1Var != null && (c0171o = e1Var.f3084b) != null) {
            h1Var.f3091c = c0171o.f2843a;
        }
        ActionMenuView actionMenuView = this.f1429a;
        h1Var.d = (actionMenuView == null || (c0221k = actionMenuView.f1392t) == null || !c0221k.j()) ? false : true;
        return h1Var;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f1414B = false;
        }
        if (!this.f1414B) {
            boolean onTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !onTouchEvent) {
                this.f1414B = true;
            }
        }
        if (actionMasked == 1 || actionMasked == 3) {
            this.f1414B = false;
        }
        return true;
    }

    public final int p(View view, int i, int i2, int[] iArr) {
        f1 f1Var = (f1) view.getLayoutParams();
        int i3 = ((ViewGroup.MarginLayoutParams) f1Var).leftMargin - iArr[0];
        int max = Math.max(0, i3) + i;
        iArr[0] = Math.max(0, -i3);
        int j2 = j(view, i2);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(max, j2, max + measuredWidth, view.getMeasuredHeight() + j2);
        return measuredWidth + ((ViewGroup.MarginLayoutParams) f1Var).rightMargin + max;
    }

    public final int q(View view, int i, int i2, int[] iArr) {
        f1 f1Var = (f1) view.getLayoutParams();
        int i3 = ((ViewGroup.MarginLayoutParams) f1Var).rightMargin - iArr[1];
        int max = i - Math.max(0, i3);
        iArr[1] = Math.max(0, -i3);
        int j2 = j(view, i2);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(max - measuredWidth, j2, max, view.getMeasuredHeight() + j2);
        return max - (measuredWidth + ((ViewGroup.MarginLayoutParams) f1Var).leftMargin);
    }

    public final int r(View view, int i, int i2, int i3, int i4, int[] iArr) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int i5 = marginLayoutParams.leftMargin - iArr[0];
        int i6 = marginLayoutParams.rightMargin - iArr[1];
        int max = Math.max(0, i6) + Math.max(0, i5);
        iArr[0] = Math.max(0, -i5);
        iArr[1] = Math.max(0, -i6);
        view.measure(ViewGroup.getChildMeasureSpec(i, getPaddingRight() + getPaddingLeft() + max + i2, marginLayoutParams.width), ViewGroup.getChildMeasureSpec(i3, getPaddingBottom() + getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i4, marginLayoutParams.height));
        return view.getMeasuredWidth() + max;
    }

    public final void s(View view, int i, int i2, int i3, int i4) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i, getPaddingRight() + getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i2, marginLayoutParams.width);
        int childMeasureSpec2 = ViewGroup.getChildMeasureSpec(i3, getPaddingBottom() + getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, marginLayoutParams.height);
        int mode = View.MeasureSpec.getMode(childMeasureSpec2);
        if (mode != 1073741824 && i4 >= 0) {
            if (mode != 0) {
                i4 = Math.min(View.MeasureSpec.getSize(childMeasureSpec2), i4);
            }
            childMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i4, 1073741824);
        }
        view.measure(childMeasureSpec, childMeasureSpec2);
    }

    public void setBackInvokedCallbackEnabled(boolean z2) {
        if (this.f1427P != z2) {
            this.f1427P = z2;
            u();
        }
    }

    public void setCollapseContentDescription(int i) {
        setCollapseContentDescription(i != 0 ? getContext().getText(i) : null);
    }

    public void setCollapseIcon(int i) {
        setCollapseIcon(AbstractC0112a.l(getContext(), i));
    }

    public void setCollapsible(boolean z2) {
        this.f1424M = z2;
        requestLayout();
    }

    public void setContentInsetEndWithActions(int i) {
        if (i < 0) {
            i = Integer.MIN_VALUE;
        }
        if (i != this.f1448v) {
            this.f1448v = i;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setContentInsetStartWithNavigation(int i) {
        if (i < 0) {
            i = Integer.MIN_VALUE;
        }
        if (i != this.f1447u) {
            this.f1447u = i;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setLogo(int i) {
        setLogo(AbstractC0112a.l(getContext(), i));
    }

    public void setLogoDescription(int i) {
        setLogoDescription(getContext().getText(i));
    }

    public void setNavigationContentDescription(int i) {
        setNavigationContentDescription(i != 0 ? getContext().getText(i) : null);
    }

    public void setNavigationIcon(int i) {
        setNavigationIcon(AbstractC0112a.l(getContext(), i));
    }

    public void setNavigationOnClickListener(View.OnClickListener onClickListener) {
        g();
        this.d.setOnClickListener(onClickListener);
    }

    public void setOnMenuItemClickListener(g1 g1Var) {
    }

    public void setOverflowIcon(Drawable drawable) {
        e();
        this.f1429a.setOverflowIcon(drawable);
    }

    public void setPopupTheme(int i) {
        if (this.f1437k != i) {
            this.f1437k = i;
            if (i == 0) {
                this.f1436j = getContext();
            } else {
                this.f1436j = new ContextThemeWrapper(getContext(), i);
            }
        }
    }

    public void setSubtitle(int i) {
        setSubtitle(getContext().getText(i));
    }

    public void setSubtitleTextColor(int i) {
        setSubtitleTextColor(ColorStateList.valueOf(i));
    }

    public void setTitle(int i) {
        setTitle(getContext().getText(i));
    }

    public void setTitleMarginBottom(int i) {
        this.f1445s = i;
        requestLayout();
    }

    public void setTitleMarginEnd(int i) {
        this.f1443q = i;
        requestLayout();
    }

    public void setTitleMarginStart(int i) {
        this.f1442p = i;
        requestLayout();
    }

    public void setTitleMarginTop(int i) {
        this.f1444r = i;
        requestLayout();
    }

    public void setTitleTextColor(int i) {
        setTitleTextColor(ColorStateList.valueOf(i));
    }

    public final boolean t(View view) {
        return (view == null || view.getParent() != this || view.getVisibility() == 8) ? false : true;
    }

    public final void u() {
        OnBackInvokedDispatcher onBackInvokedDispatcher;
        if (Build.VERSION.SDK_INT >= 33) {
            OnBackInvokedDispatcher a2 = d1.a(this);
            e1 e1Var = this.f1423L;
            boolean z2 = (e1Var == null || e1Var.f3084b == null || a2 == null || !isAttachedToWindow() || !this.f1427P) ? false : true;
            if (z2 && this.f1426O == null) {
                if (this.f1425N == null) {
                    this.f1425N = d1.b(new b1(this, 0));
                }
                d1.c(a2, this.f1425N);
                this.f1426O = a2;
                return;
            }
            if (z2 || (onBackInvokedDispatcher = this.f1426O) == null) {
                return;
            }
            d1.d(onBackInvokedDispatcher, this.f1425N);
            this.f1426O = null;
        }
    }

    public Toolbar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, R.attr.toolbarStyle);
        this.f1449w = 8388627;
        this.f1416D = new ArrayList();
        this.f1417E = new ArrayList();
        this.f1418F = new int[2];
        this.G = new C0014l(new b1(this, 1));
        this.f1419H = new ArrayList();
        this.f1420I = new c1(this);
        this.f1428Q = new B(11, this);
        Context context2 = getContext();
        int[] iArr = AbstractC0097a.f2157x;
        C0014l i2 = C0014l.i(context2, attributeSet, iArr, R.attr.toolbarStyle);
        T.k(this, context, iArr, attributeSet, (TypedArray) i2.f543b, R.attr.toolbarStyle);
        TypedArray typedArray = (TypedArray) i2.f543b;
        this.f1438l = typedArray.getResourceId(28, 0);
        this.f1439m = typedArray.getResourceId(19, 0);
        this.f1449w = typedArray.getInteger(0, 8388627);
        this.f1440n = typedArray.getInteger(2, 48);
        int dimensionPixelOffset = typedArray.getDimensionPixelOffset(22, 0);
        dimensionPixelOffset = typedArray.hasValue(27) ? typedArray.getDimensionPixelOffset(27, dimensionPixelOffset) : dimensionPixelOffset;
        this.f1445s = dimensionPixelOffset;
        this.f1444r = dimensionPixelOffset;
        this.f1443q = dimensionPixelOffset;
        this.f1442p = dimensionPixelOffset;
        int dimensionPixelOffset2 = typedArray.getDimensionPixelOffset(25, -1);
        if (dimensionPixelOffset2 >= 0) {
            this.f1442p = dimensionPixelOffset2;
        }
        int dimensionPixelOffset3 = typedArray.getDimensionPixelOffset(24, -1);
        if (dimensionPixelOffset3 >= 0) {
            this.f1443q = dimensionPixelOffset3;
        }
        int dimensionPixelOffset4 = typedArray.getDimensionPixelOffset(26, -1);
        if (dimensionPixelOffset4 >= 0) {
            this.f1444r = dimensionPixelOffset4;
        }
        int dimensionPixelOffset5 = typedArray.getDimensionPixelOffset(23, -1);
        if (dimensionPixelOffset5 >= 0) {
            this.f1445s = dimensionPixelOffset5;
        }
        this.f1441o = typedArray.getDimensionPixelSize(13, -1);
        int dimensionPixelOffset6 = typedArray.getDimensionPixelOffset(9, Integer.MIN_VALUE);
        int dimensionPixelOffset7 = typedArray.getDimensionPixelOffset(5, Integer.MIN_VALUE);
        int dimensionPixelSize = typedArray.getDimensionPixelSize(7, 0);
        int dimensionPixelSize2 = typedArray.getDimensionPixelSize(8, 0);
        d();
        S0 s02 = this.f1446t;
        s02.f2994h = false;
        if (dimensionPixelSize != Integer.MIN_VALUE) {
            s02.f2991e = dimensionPixelSize;
            s02.f2988a = dimensionPixelSize;
        }
        if (dimensionPixelSize2 != Integer.MIN_VALUE) {
            s02.f2992f = dimensionPixelSize2;
            s02.f2989b = dimensionPixelSize2;
        }
        if (dimensionPixelOffset6 != Integer.MIN_VALUE || dimensionPixelOffset7 != Integer.MIN_VALUE) {
            s02.a(dimensionPixelOffset6, dimensionPixelOffset7);
        }
        this.f1447u = typedArray.getDimensionPixelOffset(10, Integer.MIN_VALUE);
        this.f1448v = typedArray.getDimensionPixelOffset(6, Integer.MIN_VALUE);
        this.f1433f = i2.c(4);
        this.f1434g = typedArray.getText(3);
        CharSequence text = typedArray.getText(21);
        if (!TextUtils.isEmpty(text)) {
            setTitle(text);
        }
        CharSequence text2 = typedArray.getText(18);
        if (!TextUtils.isEmpty(text2)) {
            setSubtitle(text2);
        }
        this.f1436j = getContext();
        setPopupTheme(typedArray.getResourceId(17, 0));
        Drawable c2 = i2.c(16);
        if (c2 != null) {
            setNavigationIcon(c2);
        }
        CharSequence text3 = typedArray.getText(15);
        if (!TextUtils.isEmpty(text3)) {
            setNavigationContentDescription(text3);
        }
        Drawable c3 = i2.c(11);
        if (c3 != null) {
            setLogo(c3);
        }
        CharSequence text4 = typedArray.getText(12);
        if (!TextUtils.isEmpty(text4)) {
            setLogoDescription(text4);
        }
        if (typedArray.hasValue(29)) {
            setTitleTextColor(i2.b(29));
        }
        if (typedArray.hasValue(20)) {
            setSubtitleTextColor(i2.b(20));
        }
        if (typedArray.hasValue(14)) {
            m(typedArray.getResourceId(14, 0));
        }
        i2.k();
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        Context context = getContext();
        f1 f1Var = new f1(context, attributeSet);
        f1Var.f3086a = 0;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0097a.f2137b);
        f1Var.f3086a = obtainStyledAttributes.getInt(0, 0);
        obtainStyledAttributes.recycle();
        f1Var.f3087b = 0;
        return f1Var;
    }

    public void setCollapseContentDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            c();
        }
        C0249y c0249y = this.f1435h;
        if (c0249y != null) {
            c0249y.setContentDescription(charSequence);
        }
    }

    public void setCollapseIcon(Drawable drawable) {
        if (drawable != null) {
            c();
            this.f1435h.setImageDrawable(drawable);
        } else {
            C0249y c0249y = this.f1435h;
            if (c0249y != null) {
                c0249y.setImageDrawable(this.f1433f);
            }
        }
    }

    public void setLogo(Drawable drawable) {
        if (drawable != null) {
            if (this.f1432e == null) {
                this.f1432e = new C0251z(getContext(), null, 0);
            }
            if (!o(this.f1432e)) {
                b(this.f1432e, true);
            }
        } else {
            C0251z c0251z = this.f1432e;
            if (c0251z != null && o(c0251z)) {
                removeView(this.f1432e);
                this.f1417E.remove(this.f1432e);
            }
        }
        C0251z c0251z2 = this.f1432e;
        if (c0251z2 != null) {
            c0251z2.setImageDrawable(drawable);
        }
    }

    public void setLogoDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence) && this.f1432e == null) {
            this.f1432e = new C0251z(getContext(), null, 0);
        }
        C0251z c0251z = this.f1432e;
        if (c0251z != null) {
            c0251z.setContentDescription(charSequence);
        }
    }

    public void setNavigationContentDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            g();
        }
        C0249y c0249y = this.d;
        if (c0249y != null) {
            c0249y.setContentDescription(charSequence);
            k1.a(this.d, charSequence);
        }
    }

    public void setNavigationIcon(Drawable drawable) {
        if (drawable != null) {
            g();
            if (!o(this.d)) {
                b(this.d, true);
            }
        } else {
            C0249y c0249y = this.d;
            if (c0249y != null && o(c0249y)) {
                removeView(this.d);
                this.f1417E.remove(this.d);
            }
        }
        C0249y c0249y2 = this.d;
        if (c0249y2 != null) {
            c0249y2.setImageDrawable(drawable);
        }
    }

    public void setSubtitle(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            C0208d0 c0208d0 = this.f1431c;
            if (c0208d0 != null && o(c0208d0)) {
                removeView(this.f1431c);
                this.f1417E.remove(this.f1431c);
            }
        } else {
            if (this.f1431c == null) {
                Context context = getContext();
                C0208d0 c0208d02 = new C0208d0(context, null);
                this.f1431c = c0208d02;
                c0208d02.setSingleLine();
                this.f1431c.setEllipsize(TextUtils.TruncateAt.END);
                int i = this.f1439m;
                if (i != 0) {
                    this.f1431c.setTextAppearance(context, i);
                }
                ColorStateList colorStateList = this.f1413A;
                if (colorStateList != null) {
                    this.f1431c.setTextColor(colorStateList);
                }
            }
            if (!o(this.f1431c)) {
                b(this.f1431c, true);
            }
        }
        C0208d0 c0208d03 = this.f1431c;
        if (c0208d03 != null) {
            c0208d03.setText(charSequence);
        }
        this.f1451y = charSequence;
    }

    public void setSubtitleTextColor(ColorStateList colorStateList) {
        this.f1413A = colorStateList;
        C0208d0 c0208d0 = this.f1431c;
        if (c0208d0 != null) {
            c0208d0.setTextColor(colorStateList);
        }
    }

    public void setTitle(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            C0208d0 c0208d0 = this.f1430b;
            if (c0208d0 != null && o(c0208d0)) {
                removeView(this.f1430b);
                this.f1417E.remove(this.f1430b);
            }
        } else {
            if (this.f1430b == null) {
                Context context = getContext();
                C0208d0 c0208d02 = new C0208d0(context, null);
                this.f1430b = c0208d02;
                c0208d02.setSingleLine();
                this.f1430b.setEllipsize(TextUtils.TruncateAt.END);
                int i = this.f1438l;
                if (i != 0) {
                    this.f1430b.setTextAppearance(context, i);
                }
                ColorStateList colorStateList = this.f1452z;
                if (colorStateList != null) {
                    this.f1430b.setTextColor(colorStateList);
                }
            }
            if (!o(this.f1430b)) {
                b(this.f1430b, true);
            }
        }
        C0208d0 c0208d03 = this.f1430b;
        if (c0208d03 != null) {
            c0208d03.setText(charSequence);
        }
        this.f1450x = charSequence;
    }

    public void setTitleTextColor(ColorStateList colorStateList) {
        this.f1452z = colorStateList;
        C0208d0 c0208d0 = this.f1430b;
        if (c0208d0 != null) {
            c0208d0.setTextColor(colorStateList);
        }
    }
}
