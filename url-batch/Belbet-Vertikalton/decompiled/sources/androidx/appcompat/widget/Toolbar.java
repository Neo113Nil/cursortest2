package androidx.appcompat.widget;

import C1.e;
import H1.d;
import I0.h;
import M.P;
import Z.B;
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
import com.winpower.neonfit.R;
import g.AbstractC0122a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import m.C0231o;
import m.MenuC0229m;
import n.C0267c0;
import n.C0282k;
import n.C0310y;
import n.C0312z;
import n.InterfaceC0285l0;
import n.R0;
import n.a1;
import n.b1;
import n.c1;
import n.d1;
import n.e1;
import n.f1;
import n.g1;
import n.h1;
import n.i1;
import n.j1;
import n.n1;

/* loaded from: classes.dex */
public class Toolbar extends ViewGroup {

    /* renamed from: A, reason: collision with root package name */
    public ColorStateList f1777A;

    /* renamed from: B, reason: collision with root package name */
    public boolean f1778B;

    /* renamed from: C, reason: collision with root package name */
    public boolean f1779C;

    /* renamed from: D, reason: collision with root package name */
    public final ArrayList f1780D;

    /* renamed from: E, reason: collision with root package name */
    public final ArrayList f1781E;

    /* renamed from: F, reason: collision with root package name */
    public final int[] f1782F;

    /* renamed from: G, reason: collision with root package name */
    public final h f1783G;
    public ArrayList H;

    /* renamed from: I, reason: collision with root package name */
    public final b1 f1784I;

    /* renamed from: J, reason: collision with root package name */
    public i1 f1785J;

    /* renamed from: K, reason: collision with root package name */
    public C0282k f1786K;

    /* renamed from: L, reason: collision with root package name */
    public d1 f1787L;

    /* renamed from: M, reason: collision with root package name */
    public boolean f1788M;

    /* renamed from: N, reason: collision with root package name */
    public OnBackInvokedCallback f1789N;

    /* renamed from: O, reason: collision with root package name */
    public OnBackInvokedDispatcher f1790O;

    /* renamed from: P, reason: collision with root package name */
    public boolean f1791P;

    /* renamed from: Q, reason: collision with root package name */
    public final e f1792Q;

    /* renamed from: a, reason: collision with root package name */
    public ActionMenuView f1793a;

    /* renamed from: b, reason: collision with root package name */
    public C0267c0 f1794b;

    /* renamed from: c, reason: collision with root package name */
    public C0267c0 f1795c;

    /* renamed from: d, reason: collision with root package name */
    public C0310y f1796d;
    public C0312z e;

    /* renamed from: f, reason: collision with root package name */
    public final Drawable f1797f;

    /* renamed from: g, reason: collision with root package name */
    public final CharSequence f1798g;

    /* renamed from: h, reason: collision with root package name */
    public C0310y f1799h;
    public View i;
    public Context j;

    /* renamed from: k, reason: collision with root package name */
    public int f1800k;

    /* renamed from: l, reason: collision with root package name */
    public int f1801l;

    /* renamed from: m, reason: collision with root package name */
    public int f1802m;

    /* renamed from: n, reason: collision with root package name */
    public final int f1803n;

    /* renamed from: o, reason: collision with root package name */
    public final int f1804o;

    /* renamed from: p, reason: collision with root package name */
    public int f1805p;

    /* renamed from: q, reason: collision with root package name */
    public int f1806q;

    /* renamed from: r, reason: collision with root package name */
    public int f1807r;

    /* renamed from: s, reason: collision with root package name */
    public int f1808s;

    /* renamed from: t, reason: collision with root package name */
    public R0 f1809t;

    /* renamed from: u, reason: collision with root package name */
    public int f1810u;

    /* renamed from: v, reason: collision with root package name */
    public int f1811v;

    /* renamed from: w, reason: collision with root package name */
    public final int f1812w;

    /* renamed from: x, reason: collision with root package name */
    public CharSequence f1813x;

    /* renamed from: y, reason: collision with root package name */
    public CharSequence f1814y;

    /* renamed from: z, reason: collision with root package name */
    public ColorStateList f1815z;

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
        return new l.h(getContext());
    }

    public static e1 h() {
        e1 e1Var = new e1(-2, -2);
        e1Var.f3614b = 0;
        e1Var.f3613a = 8388627;
        return e1Var;
    }

    public static e1 i(ViewGroup.LayoutParams layoutParams) {
        boolean z2 = layoutParams instanceof e1;
        if (z2) {
            e1 e1Var = (e1) layoutParams;
            e1 e1Var2 = new e1(e1Var);
            e1Var2.f3614b = 0;
            e1Var2.f3614b = e1Var.f3614b;
            return e1Var2;
        }
        if (z2) {
            e1 e1Var3 = new e1((e1) layoutParams);
            e1Var3.f3614b = 0;
            return e1Var3;
        }
        if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
            e1 e1Var4 = new e1(layoutParams);
            e1Var4.f3614b = 0;
            return e1Var4;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        e1 e1Var5 = new e1(marginLayoutParams);
        e1Var5.f3614b = 0;
        ((ViewGroup.MarginLayoutParams) e1Var5).leftMargin = marginLayoutParams.leftMargin;
        ((ViewGroup.MarginLayoutParams) e1Var5).topMargin = marginLayoutParams.topMargin;
        ((ViewGroup.MarginLayoutParams) e1Var5).rightMargin = marginLayoutParams.rightMargin;
        ((ViewGroup.MarginLayoutParams) e1Var5).bottomMargin = marginLayoutParams.bottomMargin;
        return e1Var5;
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
                e1 e1Var = (e1) childAt.getLayoutParams();
                if (e1Var.f3614b == 0 && t(childAt)) {
                    int i3 = e1Var.f3613a;
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
            e1 e1Var2 = (e1) childAt2.getLayoutParams();
            if (e1Var2.f3614b == 0 && t(childAt2)) {
                int i5 = e1Var2.f3613a;
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
        e1 h2 = layoutParams == null ? h() : !checkLayoutParams(layoutParams) ? i(layoutParams) : (e1) layoutParams;
        h2.f3614b = 1;
        if (!z2 || this.i == null) {
            addView(view, h2);
        } else {
            view.setLayoutParams(h2);
            this.f1781E.add(view);
        }
    }

    public final void c() {
        if (this.f1799h == null) {
            C0310y c0310y = new C0310y(getContext(), null, R.attr.toolbarNavigationButtonStyle);
            this.f1799h = c0310y;
            c0310y.setImageDrawable(this.f1797f);
            this.f1799h.setContentDescription(this.f1798g);
            e1 h2 = h();
            h2.f3613a = (this.f1803n & 112) | 8388611;
            h2.f3614b = 2;
            this.f1799h.setLayoutParams(h2);
            this.f1799h.setOnClickListener(new j(3, this));
        }
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return super.checkLayoutParams(layoutParams) && (layoutParams instanceof e1);
    }

    public final void d() {
        if (this.f1809t == null) {
            R0 r02 = new R0();
            r02.f3517a = 0;
            r02.f3518b = 0;
            r02.f3519c = Integer.MIN_VALUE;
            r02.f3520d = Integer.MIN_VALUE;
            r02.e = 0;
            r02.f3521f = 0;
            r02.f3522g = false;
            r02.f3523h = false;
            this.f1809t = r02;
        }
    }

    public final void e() {
        f();
        ActionMenuView actionMenuView = this.f1793a;
        if (actionMenuView.f1753p == null) {
            MenuC0229m menuC0229m = (MenuC0229m) actionMenuView.getMenu();
            if (this.f1787L == null) {
                this.f1787L = new d1(this);
            }
            this.f1793a.setExpandedActionViewsExclusive(true);
            menuC0229m.b(this.f1787L, this.j);
            u();
        }
    }

    public final void f() {
        if (this.f1793a == null) {
            ActionMenuView actionMenuView = new ActionMenuView(getContext(), null);
            this.f1793a = actionMenuView;
            actionMenuView.setPopupTheme(this.f1800k);
            this.f1793a.setOnMenuItemClickListener(this.f1784I);
            ActionMenuView actionMenuView2 = this.f1793a;
            b1 b1Var = new b1(this);
            actionMenuView2.getClass();
            actionMenuView2.f1758u = b1Var;
            e1 h2 = h();
            h2.f3613a = (this.f1803n & 112) | 8388613;
            this.f1793a.setLayoutParams(h2);
            b(this.f1793a, false);
        }
    }

    public final void g() {
        if (this.f1796d == null) {
            this.f1796d = new C0310y(getContext(), null, R.attr.toolbarNavigationButtonStyle);
            e1 h2 = h();
            h2.f3613a = (this.f1803n & 112) | 8388611;
            this.f1796d.setLayoutParams(h2);
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
        C0310y c0310y = this.f1799h;
        if (c0310y != null) {
            return c0310y.getContentDescription();
        }
        return null;
    }

    public Drawable getCollapseIcon() {
        C0310y c0310y = this.f1799h;
        if (c0310y != null) {
            return c0310y.getDrawable();
        }
        return null;
    }

    public int getContentInsetEnd() {
        R0 r02 = this.f1809t;
        if (r02 != null) {
            return r02.f3522g ? r02.f3517a : r02.f3518b;
        }
        return 0;
    }

    public int getContentInsetEndWithActions() {
        int i = this.f1811v;
        return i != Integer.MIN_VALUE ? i : getContentInsetEnd();
    }

    public int getContentInsetLeft() {
        R0 r02 = this.f1809t;
        if (r02 != null) {
            return r02.f3517a;
        }
        return 0;
    }

    public int getContentInsetRight() {
        R0 r02 = this.f1809t;
        if (r02 != null) {
            return r02.f3518b;
        }
        return 0;
    }

    public int getContentInsetStart() {
        R0 r02 = this.f1809t;
        if (r02 != null) {
            return r02.f3522g ? r02.f3518b : r02.f3517a;
        }
        return 0;
    }

    public int getContentInsetStartWithNavigation() {
        int i = this.f1810u;
        return i != Integer.MIN_VALUE ? i : getContentInsetStart();
    }

    public int getCurrentContentInsetEnd() {
        MenuC0229m menuC0229m;
        ActionMenuView actionMenuView = this.f1793a;
        return (actionMenuView == null || (menuC0229m = actionMenuView.f1753p) == null || !menuC0229m.hasVisibleItems()) ? getContentInsetEnd() : Math.max(getContentInsetEnd(), Math.max(this.f1811v, 0));
    }

    public int getCurrentContentInsetLeft() {
        return getLayoutDirection() == 1 ? getCurrentContentInsetEnd() : getCurrentContentInsetStart();
    }

    public int getCurrentContentInsetRight() {
        return getLayoutDirection() == 1 ? getCurrentContentInsetStart() : getCurrentContentInsetEnd();
    }

    public int getCurrentContentInsetStart() {
        return getNavigationIcon() != null ? Math.max(getContentInsetStart(), Math.max(this.f1810u, 0)) : getContentInsetStart();
    }

    public Drawable getLogo() {
        C0312z c0312z = this.e;
        if (c0312z != null) {
            return c0312z.getDrawable();
        }
        return null;
    }

    public CharSequence getLogoDescription() {
        C0312z c0312z = this.e;
        if (c0312z != null) {
            return c0312z.getContentDescription();
        }
        return null;
    }

    public Menu getMenu() {
        e();
        return this.f1793a.getMenu();
    }

    public View getNavButtonView() {
        return this.f1796d;
    }

    public CharSequence getNavigationContentDescription() {
        C0310y c0310y = this.f1796d;
        if (c0310y != null) {
            return c0310y.getContentDescription();
        }
        return null;
    }

    public Drawable getNavigationIcon() {
        C0310y c0310y = this.f1796d;
        if (c0310y != null) {
            return c0310y.getDrawable();
        }
        return null;
    }

    public C0282k getOuterActionMenuPresenter() {
        return this.f1786K;
    }

    public Drawable getOverflowIcon() {
        e();
        return this.f1793a.getOverflowIcon();
    }

    public Context getPopupContext() {
        return this.j;
    }

    public int getPopupTheme() {
        return this.f1800k;
    }

    public CharSequence getSubtitle() {
        return this.f1814y;
    }

    public final TextView getSubtitleTextView() {
        return this.f1795c;
    }

    public CharSequence getTitle() {
        return this.f1813x;
    }

    public int getTitleMarginBottom() {
        return this.f1808s;
    }

    public int getTitleMarginEnd() {
        return this.f1806q;
    }

    public int getTitleMarginStart() {
        return this.f1805p;
    }

    public int getTitleMarginTop() {
        return this.f1807r;
    }

    public final TextView getTitleTextView() {
        return this.f1794b;
    }

    public InterfaceC0285l0 getWrapper() {
        Drawable drawable;
        if (this.f1785J == null) {
            i1 i1Var = new i1();
            i1Var.f3647n = 0;
            i1Var.f3637a = this;
            i1Var.f3643h = getTitle();
            i1Var.i = getSubtitle();
            i1Var.f3642g = i1Var.f3643h != null;
            i1Var.f3641f = getNavigationIcon();
            h r2 = h.r(getContext(), null, AbstractC0122a.f2695a, R.attr.actionBarStyle);
            i1Var.f3648o = r2.h(15);
            TypedArray typedArray = (TypedArray) r2.f592c;
            CharSequence text = typedArray.getText(27);
            if (!TextUtils.isEmpty(text)) {
                i1Var.f3642g = true;
                i1Var.f3643h = text;
                if ((i1Var.f3638b & 8) != 0) {
                    Toolbar toolbar = i1Var.f3637a;
                    toolbar.setTitle(text);
                    if (i1Var.f3642g) {
                        P.m(toolbar.getRootView(), text);
                    }
                }
            }
            CharSequence text2 = typedArray.getText(25);
            if (!TextUtils.isEmpty(text2)) {
                i1Var.i = text2;
                if ((i1Var.f3638b & 8) != 0) {
                    setSubtitle(text2);
                }
            }
            Drawable h2 = r2.h(20);
            if (h2 != null) {
                i1Var.e = h2;
                i1Var.c();
            }
            Drawable h3 = r2.h(17);
            if (h3 != null) {
                i1Var.f3640d = h3;
                i1Var.c();
            }
            if (i1Var.f3641f == null && (drawable = i1Var.f3648o) != null) {
                i1Var.f3641f = drawable;
                int i = i1Var.f3638b & 4;
                Toolbar toolbar2 = i1Var.f3637a;
                if (i != 0) {
                    toolbar2.setNavigationIcon(drawable);
                } else {
                    toolbar2.setNavigationIcon((Drawable) null);
                }
            }
            i1Var.a(typedArray.getInt(10, 0));
            int resourceId = typedArray.getResourceId(9, 0);
            if (resourceId != 0) {
                View inflate = LayoutInflater.from(getContext()).inflate(resourceId, (ViewGroup) this, false);
                View view = i1Var.f3639c;
                if (view != null && (i1Var.f3638b & 16) != 0) {
                    removeView(view);
                }
                i1Var.f3639c = inflate;
                if (inflate != null && (i1Var.f3638b & 16) != 0) {
                    addView(inflate);
                }
                i1Var.a(i1Var.f3638b | 16);
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
                this.f1809t.a(max, max2);
            }
            int resourceId2 = typedArray.getResourceId(28, 0);
            if (resourceId2 != 0) {
                Context context = getContext();
                this.f1801l = resourceId2;
                C0267c0 c0267c0 = this.f1794b;
                if (c0267c0 != null) {
                    c0267c0.setTextAppearance(context, resourceId2);
                }
            }
            int resourceId3 = typedArray.getResourceId(26, 0);
            if (resourceId3 != 0) {
                Context context2 = getContext();
                this.f1802m = resourceId3;
                C0267c0 c0267c02 = this.f1795c;
                if (c0267c02 != null) {
                    c0267c02.setTextAppearance(context2, resourceId3);
                }
            }
            int resourceId4 = typedArray.getResourceId(22, 0);
            if (resourceId4 != 0) {
                setPopupTheme(resourceId4);
            }
            r2.t();
            if (R.string.abc_action_bar_up_description != i1Var.f3647n) {
                i1Var.f3647n = R.string.abc_action_bar_up_description;
                if (TextUtils.isEmpty(getNavigationContentDescription())) {
                    int i2 = i1Var.f3647n;
                    i1Var.j = i2 != 0 ? getContext().getString(i2) : null;
                    i1Var.b();
                }
            }
            i1Var.j = getNavigationContentDescription();
            setNavigationOnClickListener(new h1(i1Var));
            this.f1785J = i1Var;
        }
        return this.f1785J;
    }

    public final int j(View view, int i) {
        e1 e1Var = (e1) view.getLayoutParams();
        int measuredHeight = view.getMeasuredHeight();
        int i2 = i > 0 ? (measuredHeight - i) / 2 : 0;
        int i3 = e1Var.f3613a & 112;
        if (i3 != 16 && i3 != 48 && i3 != 80) {
            i3 = this.f1812w & 112;
        }
        if (i3 == 48) {
            return getPaddingTop() - i2;
        }
        if (i3 == 80) {
            return (((getHeight() - getPaddingBottom()) - measuredHeight) - ((ViewGroup.MarginLayoutParams) e1Var).bottomMargin) - i2;
        }
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int height = getHeight();
        int i4 = (((height - paddingTop) - paddingBottom) - measuredHeight) / 2;
        int i5 = ((ViewGroup.MarginLayoutParams) e1Var).topMargin;
        if (i4 < i5) {
            i4 = i5;
        } else {
            int i6 = (((height - paddingBottom) - measuredHeight) - i4) - paddingTop;
            int i7 = ((ViewGroup.MarginLayoutParams) e1Var).bottomMargin;
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
        Iterator it = this.H.iterator();
        while (it.hasNext()) {
            getMenu().removeItem(((MenuItem) it.next()).getItemId());
        }
        getMenu();
        ArrayList<MenuItem> currentMenuItems = getCurrentMenuItems();
        getMenuInflater();
        Iterator it2 = ((CopyOnWriteArrayList) this.f1783G.f592c).iterator();
        while (it2.hasNext()) {
            ((B) it2.next()).f1424a.j();
        }
        ArrayList<MenuItem> currentMenuItems2 = getCurrentMenuItems();
        currentMenuItems2.removeAll(currentMenuItems);
        this.H = currentMenuItems2;
    }

    public final boolean o(View view) {
        return view.getParent() == this || this.f1781E.contains(view);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        u();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeCallbacks(this.f1792Q);
        u();
    }

    @Override // android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.f1779C = false;
        }
        if (!this.f1779C) {
            boolean onHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !onHoverEvent) {
                this.f1779C = true;
            }
        }
        if (actionMasked == 10 || actionMasked == 3) {
            this.f1779C = false;
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
        int[] iArr = this.f1782F;
        iArr[1] = 0;
        iArr[0] = 0;
        WeakHashMap weakHashMap = P.f711a;
        int minimumHeight = getMinimumHeight();
        int min = minimumHeight >= 0 ? Math.min(minimumHeight, i4 - i2) : 0;
        if (!t(this.f1796d)) {
            i5 = paddingLeft;
        } else {
            if (z4) {
                i6 = q(this.f1796d, i24, min, iArr);
                i5 = paddingLeft;
                if (t(this.f1799h)) {
                    if (z4) {
                        i6 = q(this.f1799h, i6, min, iArr);
                    } else {
                        i5 = p(this.f1799h, i5, min, iArr);
                    }
                }
                if (t(this.f1793a)) {
                    if (z4) {
                        i5 = p(this.f1793a, i5, min, iArr);
                    } else {
                        i6 = q(this.f1793a, i6, min, iArr);
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
                if (t(this.e)) {
                    if (z4) {
                        min2 = q(this.e, min2, min, iArr);
                    } else {
                        max = p(this.e, max, min, iArr);
                    }
                }
                t2 = t(this.f1794b);
                t3 = t(this.f1795c);
                if (t2) {
                    i7 = paddingRight;
                    i8 = 0;
                } else {
                    e1 e1Var = (e1) this.f1794b.getLayoutParams();
                    i7 = paddingRight;
                    i8 = ((ViewGroup.MarginLayoutParams) e1Var).bottomMargin + this.f1794b.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) e1Var).topMargin;
                }
                if (t3) {
                    i9 = width;
                } else {
                    e1 e1Var2 = (e1) this.f1795c.getLayoutParams();
                    i9 = width;
                    i8 += this.f1795c.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) e1Var2).topMargin + ((ViewGroup.MarginLayoutParams) e1Var2).bottomMargin;
                }
                if (!t2 || t3) {
                    C0267c0 c0267c0 = !t2 ? this.f1794b : this.f1795c;
                    C0267c0 c0267c02 = !t3 ? this.f1795c : this.f1794b;
                    e1 e1Var3 = (e1) c0267c0.getLayoutParams();
                    e1 e1Var4 = (e1) c0267c02.getLayoutParams();
                    if ((t2 || this.f1794b.getMeasuredWidth() <= 0) && (!t3 || this.f1795c.getMeasuredWidth() <= 0)) {
                        i10 = paddingLeft;
                        z3 = false;
                    } else {
                        i10 = paddingLeft;
                        z3 = true;
                    }
                    i11 = this.f1812w & 112;
                    i12 = min;
                    if (i11 != 48) {
                        i13 = max;
                        paddingTop = getPaddingTop() + ((ViewGroup.MarginLayoutParams) e1Var3).topMargin + this.f1807r;
                    } else if (i11 != 80) {
                        int i25 = (((height - paddingTop2) - paddingBottom) - i8) / 2;
                        i13 = max;
                        int i26 = ((ViewGroup.MarginLayoutParams) e1Var3).topMargin + this.f1807r;
                        if (i25 < i26) {
                            i25 = i26;
                        } else {
                            int i27 = (((height - paddingBottom) - i8) - i25) - paddingTop2;
                            int i28 = ((ViewGroup.MarginLayoutParams) e1Var3).bottomMargin;
                            int i29 = this.f1808s;
                            if (i27 < i28 + i29) {
                                i25 = Math.max(0, i25 - ((((ViewGroup.MarginLayoutParams) e1Var4).bottomMargin + i29) - i27));
                            }
                        }
                        paddingTop = paddingTop2 + i25;
                    } else {
                        i13 = max;
                        paddingTop = (((height - paddingBottom) - ((ViewGroup.MarginLayoutParams) e1Var4).bottomMargin) - this.f1808s) - i8;
                    }
                    if (z4) {
                        int i30 = (z3 ? this.f1805p : 0) - iArr[0];
                        max = Math.max(0, i30) + i13;
                        iArr[0] = Math.max(0, -i30);
                        if (t2) {
                            e1 e1Var5 = (e1) this.f1794b.getLayoutParams();
                            int measuredWidth = this.f1794b.getMeasuredWidth() + max;
                            int measuredHeight = this.f1794b.getMeasuredHeight() + paddingTop;
                            this.f1794b.layout(max, paddingTop, measuredWidth, measuredHeight);
                            i14 = measuredWidth + this.f1806q;
                            paddingTop = measuredHeight + ((ViewGroup.MarginLayoutParams) e1Var5).bottomMargin;
                        } else {
                            i14 = max;
                        }
                        if (t3) {
                            int i31 = paddingTop + ((ViewGroup.MarginLayoutParams) ((e1) this.f1795c.getLayoutParams())).topMargin;
                            int measuredWidth2 = this.f1795c.getMeasuredWidth() + max;
                            this.f1795c.layout(max, i31, measuredWidth2, this.f1795c.getMeasuredHeight() + i31);
                            i15 = measuredWidth2 + this.f1806q;
                        } else {
                            i15 = max;
                        }
                        if (z3) {
                            max = Math.max(i14, i15);
                        }
                    } else {
                        int i32 = (z3 ? this.f1805p : 0) - iArr[1];
                        min2 -= Math.max(0, i32);
                        iArr[1] = Math.max(0, -i32);
                        if (t2) {
                            e1 e1Var6 = (e1) this.f1794b.getLayoutParams();
                            int measuredWidth3 = min2 - this.f1794b.getMeasuredWidth();
                            int measuredHeight2 = this.f1794b.getMeasuredHeight() + paddingTop;
                            this.f1794b.layout(measuredWidth3, paddingTop, min2, measuredHeight2);
                            i16 = measuredWidth3 - this.f1806q;
                            paddingTop = measuredHeight2 + ((ViewGroup.MarginLayoutParams) e1Var6).bottomMargin;
                        } else {
                            i16 = min2;
                        }
                        if (t3) {
                            int i33 = paddingTop + ((ViewGroup.MarginLayoutParams) ((e1) this.f1795c.getLayoutParams())).topMargin;
                            this.f1795c.layout(min2 - this.f1795c.getMeasuredWidth(), i33, min2, this.f1795c.getMeasuredHeight() + i33);
                            i17 = min2 - this.f1806q;
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
                ArrayList arrayList = this.f1780D;
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
                    e1 e1Var7 = (e1) view.getLayoutParams();
                    int i40 = ((ViewGroup.MarginLayoutParams) e1Var7).leftMargin - i38;
                    int i41 = ((ViewGroup.MarginLayoutParams) e1Var7).rightMargin - i37;
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
            i5 = p(this.f1796d, paddingLeft, min, iArr);
        }
        i6 = i24;
        if (t(this.f1799h)) {
        }
        if (t(this.f1793a)) {
        }
        int currentContentInsetLeft2 = getCurrentContentInsetLeft();
        int currentContentInsetRight2 = getCurrentContentInsetRight();
        iArr[0] = Math.max(0, currentContentInsetLeft2 - i5);
        iArr[1] = Math.max(0, currentContentInsetRight2 - (i24 - i6));
        int max6 = Math.max(i5, currentContentInsetLeft2);
        int min22 = Math.min(i6, i24 - currentContentInsetRight2);
        if (t(this.i)) {
        }
        if (t(this.e)) {
        }
        t2 = t(this.f1794b);
        t3 = t(this.f1795c);
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
        e1 e1Var32 = (e1) c0267c0.getLayoutParams();
        e1 e1Var42 = (e1) c0267c02.getLayoutParams();
        if (t2) {
        }
        i10 = paddingLeft;
        z3 = false;
        i11 = this.f1812w & 112;
        i12 = min;
        if (i11 != 48) {
        }
        if (z4) {
        }
        ArrayList arrayList2 = this.f1780D;
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
        boolean z2 = n1.f3683a;
        int i10 = 0;
        if (getLayoutDirection() == 1) {
            c3 = 1;
            c2 = 0;
        } else {
            c2 = 1;
            c3 = 0;
        }
        if (t(this.f1796d)) {
            s(this.f1796d, i, 0, i2, this.f1804o);
            i3 = k(this.f1796d) + this.f1796d.getMeasuredWidth();
            i4 = Math.max(0, l(this.f1796d) + this.f1796d.getMeasuredHeight());
            i5 = View.combineMeasuredStates(0, this.f1796d.getMeasuredState());
        } else {
            i3 = 0;
            i4 = 0;
            i5 = 0;
        }
        if (t(this.f1799h)) {
            s(this.f1799h, i, 0, i2, this.f1804o);
            i3 = k(this.f1799h) + this.f1799h.getMeasuredWidth();
            i4 = Math.max(i4, l(this.f1799h) + this.f1799h.getMeasuredHeight());
            i5 = View.combineMeasuredStates(i5, this.f1799h.getMeasuredState());
        }
        int currentContentInsetStart = getCurrentContentInsetStart();
        int max = Math.max(currentContentInsetStart, i3);
        int max2 = Math.max(0, currentContentInsetStart - i3);
        int[] iArr = this.f1782F;
        iArr[c3] = max2;
        if (t(this.f1793a)) {
            s(this.f1793a, i, max, i2, this.f1804o);
            i6 = k(this.f1793a) + this.f1793a.getMeasuredWidth();
            i4 = Math.max(i4, l(this.f1793a) + this.f1793a.getMeasuredHeight());
            i5 = View.combineMeasuredStates(i5, this.f1793a.getMeasuredState());
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
        if (t(this.e)) {
            max3 += r(this.e, i, max3, i2, 0, iArr);
            i4 = Math.max(i4, l(this.e) + this.e.getMeasuredHeight());
            i5 = View.combineMeasuredStates(i5, this.e.getMeasuredState());
        }
        int childCount = getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = getChildAt(i11);
            if (((e1) childAt.getLayoutParams()).f3614b == 0 && t(childAt)) {
                max3 += r(childAt, i, max3, i2, 0, iArr);
                i4 = Math.max(i4, l(childAt) + childAt.getMeasuredHeight());
                i5 = View.combineMeasuredStates(i5, childAt.getMeasuredState());
            }
        }
        int i12 = this.f1807r + this.f1808s;
        int i13 = this.f1805p + this.f1806q;
        if (t(this.f1794b)) {
            r(this.f1794b, i, max3 + i13, i2, i12, iArr);
            int k2 = k(this.f1794b) + this.f1794b.getMeasuredWidth();
            i7 = l(this.f1794b) + this.f1794b.getMeasuredHeight();
            i8 = View.combineMeasuredStates(i5, this.f1794b.getMeasuredState());
            i9 = k2;
        } else {
            i7 = 0;
            i8 = i5;
            i9 = 0;
        }
        if (t(this.f1795c)) {
            i9 = Math.max(i9, r(this.f1795c, i, max3 + i13, i2, i7 + i12, iArr));
            i7 = l(this.f1795c) + this.f1795c.getMeasuredHeight() + i7;
            i8 = View.combineMeasuredStates(i8, this.f1795c.getMeasuredState());
        }
        int max4 = Math.max(i4, i7);
        int paddingRight = getPaddingRight() + getPaddingLeft();
        int paddingBottom = getPaddingBottom() + getPaddingTop() + max4;
        int resolveSizeAndState = View.resolveSizeAndState(Math.max(paddingRight + max3 + i9, getSuggestedMinimumWidth()), i, (-16777216) & i8);
        int resolveSizeAndState2 = View.resolveSizeAndState(Math.max(paddingBottom, getSuggestedMinimumHeight()), i2, i8 << 16);
        if (this.f1788M) {
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
        if (!(parcelable instanceof g1)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        g1 g1Var = (g1) parcelable;
        super.onRestoreInstanceState(g1Var.f1148a);
        ActionMenuView actionMenuView = this.f1793a;
        MenuC0229m menuC0229m = actionMenuView != null ? actionMenuView.f1753p : null;
        int i = g1Var.f3617c;
        if (i != 0 && this.f1787L != null && menuC0229m != null && (findItem = menuC0229m.findItem(i)) != null) {
            findItem.expandActionView();
        }
        if (g1Var.f3618d) {
            e eVar = this.f1792Q;
            removeCallbacks(eVar);
            post(eVar);
        }
    }

    @Override // android.view.View
    public final void onRtlPropertiesChanged(int i) {
        super.onRtlPropertiesChanged(i);
        d();
        R0 r02 = this.f1809t;
        boolean z2 = i == 1;
        if (z2 == r02.f3522g) {
            return;
        }
        r02.f3522g = z2;
        if (!r02.f3523h) {
            r02.f3517a = r02.e;
            r02.f3518b = r02.f3521f;
            return;
        }
        if (z2) {
            int i2 = r02.f3520d;
            if (i2 == Integer.MIN_VALUE) {
                i2 = r02.e;
            }
            r02.f3517a = i2;
            int i3 = r02.f3519c;
            if (i3 == Integer.MIN_VALUE) {
                i3 = r02.f3521f;
            }
            r02.f3518b = i3;
            return;
        }
        int i4 = r02.f3519c;
        if (i4 == Integer.MIN_VALUE) {
            i4 = r02.e;
        }
        r02.f3517a = i4;
        int i5 = r02.f3520d;
        if (i5 == Integer.MIN_VALUE) {
            i5 = r02.f3521f;
        }
        r02.f3518b = i5;
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        C0282k c0282k;
        C0231o c0231o;
        g1 g1Var = new g1(super.onSaveInstanceState());
        d1 d1Var = this.f1787L;
        if (d1Var != null && (c0231o = d1Var.f3611b) != null) {
            g1Var.f3617c = c0231o.f3375a;
        }
        ActionMenuView actionMenuView = this.f1793a;
        g1Var.f3618d = (actionMenuView == null || (c0282k = actionMenuView.f1757t) == null || !c0282k.h()) ? false : true;
        return g1Var;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f1778B = false;
        }
        if (!this.f1778B) {
            boolean onTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !onTouchEvent) {
                this.f1778B = true;
            }
        }
        if (actionMasked == 1 || actionMasked == 3) {
            this.f1778B = false;
        }
        return true;
    }

    public final int p(View view, int i, int i2, int[] iArr) {
        e1 e1Var = (e1) view.getLayoutParams();
        int i3 = ((ViewGroup.MarginLayoutParams) e1Var).leftMargin - iArr[0];
        int max = Math.max(0, i3) + i;
        iArr[0] = Math.max(0, -i3);
        int j = j(view, i2);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(max, j, max + measuredWidth, view.getMeasuredHeight() + j);
        return measuredWidth + ((ViewGroup.MarginLayoutParams) e1Var).rightMargin + max;
    }

    public final int q(View view, int i, int i2, int[] iArr) {
        e1 e1Var = (e1) view.getLayoutParams();
        int i3 = ((ViewGroup.MarginLayoutParams) e1Var).rightMargin - iArr[1];
        int max = i - Math.max(0, i3);
        iArr[1] = Math.max(0, -i3);
        int j = j(view, i2);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(max - measuredWidth, j, max, view.getMeasuredHeight() + j);
        return max - (measuredWidth + ((ViewGroup.MarginLayoutParams) e1Var).leftMargin);
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
        if (this.f1791P != z2) {
            this.f1791P = z2;
            u();
        }
    }

    public void setCollapseContentDescription(int i) {
        setCollapseContentDescription(i != 0 ? getContext().getText(i) : null);
    }

    public void setCollapseIcon(int i) {
        setCollapseIcon(d.F(getContext(), i));
    }

    public void setCollapsible(boolean z2) {
        this.f1788M = z2;
        requestLayout();
    }

    public void setContentInsetEndWithActions(int i) {
        if (i < 0) {
            i = Integer.MIN_VALUE;
        }
        if (i != this.f1811v) {
            this.f1811v = i;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setContentInsetStartWithNavigation(int i) {
        if (i < 0) {
            i = Integer.MIN_VALUE;
        }
        if (i != this.f1810u) {
            this.f1810u = i;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setLogo(int i) {
        setLogo(d.F(getContext(), i));
    }

    public void setLogoDescription(int i) {
        setLogoDescription(getContext().getText(i));
    }

    public void setNavigationContentDescription(int i) {
        setNavigationContentDescription(i != 0 ? getContext().getText(i) : null);
    }

    public void setNavigationIcon(int i) {
        setNavigationIcon(d.F(getContext(), i));
    }

    public void setNavigationOnClickListener(View.OnClickListener onClickListener) {
        g();
        this.f1796d.setOnClickListener(onClickListener);
    }

    public void setOnMenuItemClickListener(f1 f1Var) {
    }

    public void setOverflowIcon(Drawable drawable) {
        e();
        this.f1793a.setOverflowIcon(drawable);
    }

    public void setPopupTheme(int i) {
        if (this.f1800k != i) {
            this.f1800k = i;
            if (i == 0) {
                this.j = getContext();
            } else {
                this.j = new ContextThemeWrapper(getContext(), i);
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
        this.f1808s = i;
        requestLayout();
    }

    public void setTitleMarginEnd(int i) {
        this.f1806q = i;
        requestLayout();
    }

    public void setTitleMarginStart(int i) {
        this.f1805p = i;
        requestLayout();
    }

    public void setTitleMarginTop(int i) {
        this.f1807r = i;
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
            OnBackInvokedDispatcher a2 = c1.a(this);
            d1 d1Var = this.f1787L;
            boolean z2 = (d1Var == null || d1Var.f3611b == null || a2 == null || !isAttachedToWindow() || !this.f1791P) ? false : true;
            if (z2 && this.f1790O == null) {
                if (this.f1789N == null) {
                    this.f1789N = c1.b(new a1(this, 0));
                }
                c1.c(a2, this.f1789N);
                this.f1790O = a2;
                return;
            }
            if (z2 || (onBackInvokedDispatcher = this.f1790O) == null) {
                return;
            }
            c1.d(onBackInvokedDispatcher, this.f1789N);
            this.f1790O = null;
        }
    }

    public Toolbar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, R.attr.toolbarStyle);
        this.f1812w = 8388627;
        this.f1780D = new ArrayList();
        this.f1781E = new ArrayList();
        this.f1782F = new int[2];
        this.f1783G = new h(new a1(this, 1));
        this.H = new ArrayList();
        this.f1784I = new b1(this);
        this.f1792Q = new e(13, this);
        Context context2 = getContext();
        int[] iArr = AbstractC0122a.f2715x;
        h r2 = h.r(context2, attributeSet, iArr, R.attr.toolbarStyle);
        P.k(this, context, iArr, attributeSet, (TypedArray) r2.f592c, R.attr.toolbarStyle);
        TypedArray typedArray = (TypedArray) r2.f592c;
        this.f1801l = typedArray.getResourceId(28, 0);
        this.f1802m = typedArray.getResourceId(19, 0);
        this.f1812w = typedArray.getInteger(0, 8388627);
        this.f1803n = typedArray.getInteger(2, 48);
        int dimensionPixelOffset = typedArray.getDimensionPixelOffset(22, 0);
        dimensionPixelOffset = typedArray.hasValue(27) ? typedArray.getDimensionPixelOffset(27, dimensionPixelOffset) : dimensionPixelOffset;
        this.f1808s = dimensionPixelOffset;
        this.f1807r = dimensionPixelOffset;
        this.f1806q = dimensionPixelOffset;
        this.f1805p = dimensionPixelOffset;
        int dimensionPixelOffset2 = typedArray.getDimensionPixelOffset(25, -1);
        if (dimensionPixelOffset2 >= 0) {
            this.f1805p = dimensionPixelOffset2;
        }
        int dimensionPixelOffset3 = typedArray.getDimensionPixelOffset(24, -1);
        if (dimensionPixelOffset3 >= 0) {
            this.f1806q = dimensionPixelOffset3;
        }
        int dimensionPixelOffset4 = typedArray.getDimensionPixelOffset(26, -1);
        if (dimensionPixelOffset4 >= 0) {
            this.f1807r = dimensionPixelOffset4;
        }
        int dimensionPixelOffset5 = typedArray.getDimensionPixelOffset(23, -1);
        if (dimensionPixelOffset5 >= 0) {
            this.f1808s = dimensionPixelOffset5;
        }
        this.f1804o = typedArray.getDimensionPixelSize(13, -1);
        int dimensionPixelOffset6 = typedArray.getDimensionPixelOffset(9, Integer.MIN_VALUE);
        int dimensionPixelOffset7 = typedArray.getDimensionPixelOffset(5, Integer.MIN_VALUE);
        int dimensionPixelSize = typedArray.getDimensionPixelSize(7, 0);
        int dimensionPixelSize2 = typedArray.getDimensionPixelSize(8, 0);
        d();
        R0 r02 = this.f1809t;
        r02.f3523h = false;
        if (dimensionPixelSize != Integer.MIN_VALUE) {
            r02.e = dimensionPixelSize;
            r02.f3517a = dimensionPixelSize;
        }
        if (dimensionPixelSize2 != Integer.MIN_VALUE) {
            r02.f3521f = dimensionPixelSize2;
            r02.f3518b = dimensionPixelSize2;
        }
        if (dimensionPixelOffset6 != Integer.MIN_VALUE || dimensionPixelOffset7 != Integer.MIN_VALUE) {
            r02.a(dimensionPixelOffset6, dimensionPixelOffset7);
        }
        this.f1810u = typedArray.getDimensionPixelOffset(10, Integer.MIN_VALUE);
        this.f1811v = typedArray.getDimensionPixelOffset(6, Integer.MIN_VALUE);
        this.f1797f = r2.h(4);
        this.f1798g = typedArray.getText(3);
        CharSequence text = typedArray.getText(21);
        if (!TextUtils.isEmpty(text)) {
            setTitle(text);
        }
        CharSequence text2 = typedArray.getText(18);
        if (!TextUtils.isEmpty(text2)) {
            setSubtitle(text2);
        }
        this.j = getContext();
        setPopupTheme(typedArray.getResourceId(17, 0));
        Drawable h2 = r2.h(16);
        if (h2 != null) {
            setNavigationIcon(h2);
        }
        CharSequence text3 = typedArray.getText(15);
        if (!TextUtils.isEmpty(text3)) {
            setNavigationContentDescription(text3);
        }
        Drawable h3 = r2.h(11);
        if (h3 != null) {
            setLogo(h3);
        }
        CharSequence text4 = typedArray.getText(12);
        if (!TextUtils.isEmpty(text4)) {
            setLogoDescription(text4);
        }
        if (typedArray.hasValue(29)) {
            setTitleTextColor(r2.g(29));
        }
        if (typedArray.hasValue(20)) {
            setSubtitleTextColor(r2.g(20));
        }
        if (typedArray.hasValue(14)) {
            m(typedArray.getResourceId(14, 0));
        }
        r2.t();
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        Context context = getContext();
        e1 e1Var = new e1(context, attributeSet);
        e1Var.f3613a = 0;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0122a.f2696b);
        e1Var.f3613a = obtainStyledAttributes.getInt(0, 0);
        obtainStyledAttributes.recycle();
        e1Var.f3614b = 0;
        return e1Var;
    }

    public void setCollapseContentDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            c();
        }
        C0310y c0310y = this.f1799h;
        if (c0310y != null) {
            c0310y.setContentDescription(charSequence);
        }
    }

    public void setCollapseIcon(Drawable drawable) {
        if (drawable != null) {
            c();
            this.f1799h.setImageDrawable(drawable);
        } else {
            C0310y c0310y = this.f1799h;
            if (c0310y != null) {
                c0310y.setImageDrawable(this.f1797f);
            }
        }
    }

    public void setLogo(Drawable drawable) {
        if (drawable != null) {
            if (this.e == null) {
                this.e = new C0312z(getContext(), null, 0);
            }
            if (!o(this.e)) {
                b(this.e, true);
            }
        } else {
            C0312z c0312z = this.e;
            if (c0312z != null && o(c0312z)) {
                removeView(this.e);
                this.f1781E.remove(this.e);
            }
        }
        C0312z c0312z2 = this.e;
        if (c0312z2 != null) {
            c0312z2.setImageDrawable(drawable);
        }
    }

    public void setLogoDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence) && this.e == null) {
            this.e = new C0312z(getContext(), null, 0);
        }
        C0312z c0312z = this.e;
        if (c0312z != null) {
            c0312z.setContentDescription(charSequence);
        }
    }

    public void setNavigationContentDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            g();
        }
        C0310y c0310y = this.f1796d;
        if (c0310y != null) {
            c0310y.setContentDescription(charSequence);
            j1.a(this.f1796d, charSequence);
        }
    }

    public void setNavigationIcon(Drawable drawable) {
        if (drawable != null) {
            g();
            if (!o(this.f1796d)) {
                b(this.f1796d, true);
            }
        } else {
            C0310y c0310y = this.f1796d;
            if (c0310y != null && o(c0310y)) {
                removeView(this.f1796d);
                this.f1781E.remove(this.f1796d);
            }
        }
        C0310y c0310y2 = this.f1796d;
        if (c0310y2 != null) {
            c0310y2.setImageDrawable(drawable);
        }
    }

    public void setSubtitle(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            C0267c0 c0267c0 = this.f1795c;
            if (c0267c0 != null && o(c0267c0)) {
                removeView(this.f1795c);
                this.f1781E.remove(this.f1795c);
            }
        } else {
            if (this.f1795c == null) {
                Context context = getContext();
                C0267c0 c0267c02 = new C0267c0(context, null);
                this.f1795c = c0267c02;
                c0267c02.setSingleLine();
                this.f1795c.setEllipsize(TextUtils.TruncateAt.END);
                int i = this.f1802m;
                if (i != 0) {
                    this.f1795c.setTextAppearance(context, i);
                }
                ColorStateList colorStateList = this.f1777A;
                if (colorStateList != null) {
                    this.f1795c.setTextColor(colorStateList);
                }
            }
            if (!o(this.f1795c)) {
                b(this.f1795c, true);
            }
        }
        C0267c0 c0267c03 = this.f1795c;
        if (c0267c03 != null) {
            c0267c03.setText(charSequence);
        }
        this.f1814y = charSequence;
    }

    public void setSubtitleTextColor(ColorStateList colorStateList) {
        this.f1777A = colorStateList;
        C0267c0 c0267c0 = this.f1795c;
        if (c0267c0 != null) {
            c0267c0.setTextColor(colorStateList);
        }
    }

    public void setTitle(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            C0267c0 c0267c0 = this.f1794b;
            if (c0267c0 != null && o(c0267c0)) {
                removeView(this.f1794b);
                this.f1781E.remove(this.f1794b);
            }
        } else {
            if (this.f1794b == null) {
                Context context = getContext();
                C0267c0 c0267c02 = new C0267c0(context, null);
                this.f1794b = c0267c02;
                c0267c02.setSingleLine();
                this.f1794b.setEllipsize(TextUtils.TruncateAt.END);
                int i = this.f1801l;
                if (i != 0) {
                    this.f1794b.setTextAppearance(context, i);
                }
                ColorStateList colorStateList = this.f1815z;
                if (colorStateList != null) {
                    this.f1794b.setTextColor(colorStateList);
                }
            }
            if (!o(this.f1794b)) {
                b(this.f1794b, true);
            }
        }
        C0267c0 c0267c03 = this.f1794b;
        if (c0267c03 != null) {
            c0267c03.setText(charSequence);
        }
        this.f1813x = charSequence;
    }

    public void setTitleTextColor(ColorStateList colorStateList) {
        this.f1815z = colorStateList;
        C0267c0 c0267c0 = this.f1794b;
        if (c0267c0 != null) {
            c0267c0.setTextColor(colorStateList);
        }
    }
}
