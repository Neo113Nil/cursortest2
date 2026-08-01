package androidx.appcompat.widget;

import K.C0011l;
import K.S;
import P0.A;
import X.B;
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
import com.glasspulse.glasspulse.R;
import com.google.android.material.datepicker.j;
import f.a;
import j.h;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import k.C0159o;
import k.MenuC0157m;
import l.C0202b0;
import l.C0219k;
import l.C0245x;
import l.C0247y;
import l.InterfaceC0220k0;
import l.N0;
import l.U0;
import l.V0;
import l.W0;
import l.X0;
import l.Y0;
import l.Z0;
import l.a1;
import l.b1;
import l.c1;
import l.d1;
import l.h1;
import u1.d;

/* loaded from: classes.dex */
public class Toolbar extends ViewGroup {

    /* renamed from: A, reason: collision with root package name */
    public ColorStateList f1285A;

    /* renamed from: B, reason: collision with root package name */
    public boolean f1286B;

    /* renamed from: C, reason: collision with root package name */
    public boolean f1287C;

    /* renamed from: D, reason: collision with root package name */
    public final ArrayList f1288D;

    /* renamed from: E, reason: collision with root package name */
    public final ArrayList f1289E;
    public final int[] F;

    /* renamed from: G, reason: collision with root package name */
    public final C0011l f1290G;

    /* renamed from: H, reason: collision with root package name */
    public ArrayList f1291H;

    /* renamed from: I, reason: collision with root package name */
    public final V0 f1292I;

    /* renamed from: J, reason: collision with root package name */
    public c1 f1293J;

    /* renamed from: K, reason: collision with root package name */
    public C0219k f1294K;

    /* renamed from: L, reason: collision with root package name */
    public X0 f1295L;

    /* renamed from: M, reason: collision with root package name */
    public boolean f1296M;

    /* renamed from: N, reason: collision with root package name */
    public OnBackInvokedCallback f1297N;

    /* renamed from: O, reason: collision with root package name */
    public OnBackInvokedDispatcher f1298O;

    /* renamed from: P, reason: collision with root package name */
    public boolean f1299P;

    /* renamed from: Q, reason: collision with root package name */
    public final A f1300Q;

    /* renamed from: a, reason: collision with root package name */
    public ActionMenuView f1301a;

    /* renamed from: b, reason: collision with root package name */
    public C0202b0 f1302b;

    /* renamed from: c, reason: collision with root package name */
    public C0202b0 f1303c;
    public C0245x d;

    /* renamed from: e, reason: collision with root package name */
    public C0247y f1304e;

    /* renamed from: f, reason: collision with root package name */
    public final Drawable f1305f;

    /* renamed from: g, reason: collision with root package name */
    public final CharSequence f1306g;
    public C0245x h;
    public View i;

    /* renamed from: j, reason: collision with root package name */
    public Context f1307j;

    /* renamed from: k, reason: collision with root package name */
    public int f1308k;

    /* renamed from: l, reason: collision with root package name */
    public int f1309l;

    /* renamed from: m, reason: collision with root package name */
    public int f1310m;

    /* renamed from: n, reason: collision with root package name */
    public final int f1311n;

    /* renamed from: o, reason: collision with root package name */
    public final int f1312o;

    /* renamed from: p, reason: collision with root package name */
    public int f1313p;

    /* renamed from: q, reason: collision with root package name */
    public int f1314q;

    /* renamed from: r, reason: collision with root package name */
    public int f1315r;

    /* renamed from: s, reason: collision with root package name */
    public int f1316s;

    /* renamed from: t, reason: collision with root package name */
    public N0 f1317t;

    /* renamed from: u, reason: collision with root package name */
    public int f1318u;

    /* renamed from: v, reason: collision with root package name */
    public int f1319v;

    /* renamed from: w, reason: collision with root package name */
    public final int f1320w;

    /* renamed from: x, reason: collision with root package name */
    public CharSequence f1321x;

    /* renamed from: y, reason: collision with root package name */
    public CharSequence f1322y;

    /* renamed from: z, reason: collision with root package name */
    public ColorStateList f1323z;

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

    public static Y0 h() {
        Y0 y02 = new Y0(-2, -2);
        y02.f2921b = 0;
        y02.f2920a = 8388627;
        return y02;
    }

    public static Y0 i(ViewGroup.LayoutParams layoutParams) {
        boolean z2 = layoutParams instanceof Y0;
        if (z2) {
            Y0 y02 = (Y0) layoutParams;
            Y0 y03 = new Y0(y02);
            y03.f2921b = 0;
            y03.f2921b = y02.f2921b;
            return y03;
        }
        if (z2) {
            Y0 y04 = new Y0((Y0) layoutParams);
            y04.f2921b = 0;
            return y04;
        }
        if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
            Y0 y05 = new Y0(layoutParams);
            y05.f2921b = 0;
            return y05;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        Y0 y06 = new Y0(marginLayoutParams);
        y06.f2921b = 0;
        ((ViewGroup.MarginLayoutParams) y06).leftMargin = marginLayoutParams.leftMargin;
        ((ViewGroup.MarginLayoutParams) y06).topMargin = marginLayoutParams.topMargin;
        ((ViewGroup.MarginLayoutParams) y06).rightMargin = marginLayoutParams.rightMargin;
        ((ViewGroup.MarginLayoutParams) y06).bottomMargin = marginLayoutParams.bottomMargin;
        return y06;
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
                Y0 y02 = (Y0) childAt.getLayoutParams();
                if (y02.f2921b == 0 && t(childAt)) {
                    int i3 = y02.f2920a;
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
            Y0 y03 = (Y0) childAt2.getLayoutParams();
            if (y03.f2921b == 0 && t(childAt2)) {
                int i5 = y03.f2920a;
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
        Y0 h = layoutParams == null ? h() : !checkLayoutParams(layoutParams) ? i(layoutParams) : (Y0) layoutParams;
        h.f2921b = 1;
        if (!z2 || this.i == null) {
            addView(view, h);
        } else {
            view.setLayoutParams(h);
            this.f1289E.add(view);
        }
    }

    public final void c() {
        if (this.h == null) {
            C0245x c0245x = new C0245x(getContext(), null, R.attr.toolbarNavigationButtonStyle);
            this.h = c0245x;
            c0245x.setImageDrawable(this.f1305f);
            this.h.setContentDescription(this.f1306g);
            Y0 h = h();
            h.f2920a = (this.f1311n & 112) | 8388611;
            h.f2921b = 2;
            this.h.setLayoutParams(h);
            this.h.setOnClickListener(new j(3, this));
        }
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return super.checkLayoutParams(layoutParams) && (layoutParams instanceof Y0);
    }

    public final void d() {
        if (this.f1317t == null) {
            N0 n0 = new N0();
            n0.f2877a = 0;
            n0.f2878b = 0;
            n0.f2879c = Integer.MIN_VALUE;
            n0.d = Integer.MIN_VALUE;
            n0.f2880e = 0;
            n0.f2881f = 0;
            n0.f2882g = false;
            n0.h = false;
            this.f1317t = n0;
        }
    }

    public final void e() {
        f();
        ActionMenuView actionMenuView = this.f1301a;
        if (actionMenuView.f1258p == null) {
            MenuC0157m menuC0157m = (MenuC0157m) actionMenuView.getMenu();
            if (this.f1295L == null) {
                this.f1295L = new X0(this);
            }
            this.f1301a.setExpandedActionViewsExclusive(true);
            menuC0157m.b(this.f1295L, this.f1307j);
            u();
        }
    }

    public final void f() {
        if (this.f1301a == null) {
            ActionMenuView actionMenuView = new ActionMenuView(getContext(), null);
            this.f1301a = actionMenuView;
            actionMenuView.setPopupTheme(this.f1308k);
            this.f1301a.setOnMenuItemClickListener(this.f1292I);
            ActionMenuView actionMenuView2 = this.f1301a;
            V0 v02 = new V0(this);
            actionMenuView2.getClass();
            actionMenuView2.f1263u = v02;
            Y0 h = h();
            h.f2920a = (this.f1311n & 112) | 8388613;
            this.f1301a.setLayoutParams(h);
            b(this.f1301a, false);
        }
    }

    public final void g() {
        if (this.d == null) {
            this.d = new C0245x(getContext(), null, R.attr.toolbarNavigationButtonStyle);
            Y0 h = h();
            h.f2920a = (this.f1311n & 112) | 8388611;
            this.d.setLayoutParams(h);
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
        C0245x c0245x = this.h;
        if (c0245x != null) {
            return c0245x.getContentDescription();
        }
        return null;
    }

    public Drawable getCollapseIcon() {
        C0245x c0245x = this.h;
        if (c0245x != null) {
            return c0245x.getDrawable();
        }
        return null;
    }

    public int getContentInsetEnd() {
        N0 n0 = this.f1317t;
        if (n0 != null) {
            return n0.f2882g ? n0.f2877a : n0.f2878b;
        }
        return 0;
    }

    public int getContentInsetEndWithActions() {
        int i = this.f1319v;
        return i != Integer.MIN_VALUE ? i : getContentInsetEnd();
    }

    public int getContentInsetLeft() {
        N0 n0 = this.f1317t;
        if (n0 != null) {
            return n0.f2877a;
        }
        return 0;
    }

    public int getContentInsetRight() {
        N0 n0 = this.f1317t;
        if (n0 != null) {
            return n0.f2878b;
        }
        return 0;
    }

    public int getContentInsetStart() {
        N0 n0 = this.f1317t;
        if (n0 != null) {
            return n0.f2882g ? n0.f2878b : n0.f2877a;
        }
        return 0;
    }

    public int getContentInsetStartWithNavigation() {
        int i = this.f1318u;
        return i != Integer.MIN_VALUE ? i : getContentInsetStart();
    }

    public int getCurrentContentInsetEnd() {
        MenuC0157m menuC0157m;
        ActionMenuView actionMenuView = this.f1301a;
        return (actionMenuView == null || (menuC0157m = actionMenuView.f1258p) == null || !menuC0157m.hasVisibleItems()) ? getContentInsetEnd() : Math.max(getContentInsetEnd(), Math.max(this.f1319v, 0));
    }

    public int getCurrentContentInsetLeft() {
        return getLayoutDirection() == 1 ? getCurrentContentInsetEnd() : getCurrentContentInsetStart();
    }

    public int getCurrentContentInsetRight() {
        return getLayoutDirection() == 1 ? getCurrentContentInsetStart() : getCurrentContentInsetEnd();
    }

    public int getCurrentContentInsetStart() {
        return getNavigationIcon() != null ? Math.max(getContentInsetStart(), Math.max(this.f1318u, 0)) : getContentInsetStart();
    }

    public Drawable getLogo() {
        C0247y c0247y = this.f1304e;
        if (c0247y != null) {
            return c0247y.getDrawable();
        }
        return null;
    }

    public CharSequence getLogoDescription() {
        C0247y c0247y = this.f1304e;
        if (c0247y != null) {
            return c0247y.getContentDescription();
        }
        return null;
    }

    public Menu getMenu() {
        e();
        return this.f1301a.getMenu();
    }

    public View getNavButtonView() {
        return this.d;
    }

    public CharSequence getNavigationContentDescription() {
        C0245x c0245x = this.d;
        if (c0245x != null) {
            return c0245x.getContentDescription();
        }
        return null;
    }

    public Drawable getNavigationIcon() {
        C0245x c0245x = this.d;
        if (c0245x != null) {
            return c0245x.getDrawable();
        }
        return null;
    }

    public C0219k getOuterActionMenuPresenter() {
        return this.f1294K;
    }

    public Drawable getOverflowIcon() {
        e();
        return this.f1301a.getOverflowIcon();
    }

    public Context getPopupContext() {
        return this.f1307j;
    }

    public int getPopupTheme() {
        return this.f1308k;
    }

    public CharSequence getSubtitle() {
        return this.f1322y;
    }

    public final TextView getSubtitleTextView() {
        return this.f1303c;
    }

    public CharSequence getTitle() {
        return this.f1321x;
    }

    public int getTitleMarginBottom() {
        return this.f1316s;
    }

    public int getTitleMarginEnd() {
        return this.f1314q;
    }

    public int getTitleMarginStart() {
        return this.f1313p;
    }

    public int getTitleMarginTop() {
        return this.f1315r;
    }

    public final TextView getTitleTextView() {
        return this.f1302b;
    }

    public InterfaceC0220k0 getWrapper() {
        Drawable drawable;
        if (this.f1293J == null) {
            c1 c1Var = new c1();
            c1Var.f2948n = 0;
            c1Var.f2938a = this;
            c1Var.h = getTitle();
            c1Var.i = getSubtitle();
            c1Var.f2943g = c1Var.h != null;
            c1Var.f2942f = getNavigationIcon();
            C0011l r2 = C0011l.r(getContext(), null, a.f2032a, R.attr.actionBarStyle);
            c1Var.f2949o = r2.h(15);
            TypedArray typedArray = (TypedArray) r2.f405c;
            CharSequence text = typedArray.getText(27);
            if (!TextUtils.isEmpty(text)) {
                c1Var.f2943g = true;
                c1Var.h = text;
                if ((c1Var.f2939b & 8) != 0) {
                    Toolbar toolbar = c1Var.f2938a;
                    toolbar.setTitle(text);
                    if (c1Var.f2943g) {
                        S.m(toolbar.getRootView(), text);
                    }
                }
            }
            CharSequence text2 = typedArray.getText(25);
            if (!TextUtils.isEmpty(text2)) {
                c1Var.i = text2;
                if ((c1Var.f2939b & 8) != 0) {
                    setSubtitle(text2);
                }
            }
            Drawable h = r2.h(20);
            if (h != null) {
                c1Var.f2941e = h;
                c1Var.c();
            }
            Drawable h2 = r2.h(17);
            if (h2 != null) {
                c1Var.d = h2;
                c1Var.c();
            }
            if (c1Var.f2942f == null && (drawable = c1Var.f2949o) != null) {
                c1Var.f2942f = drawable;
                int i = c1Var.f2939b & 4;
                Toolbar toolbar2 = c1Var.f2938a;
                if (i != 0) {
                    toolbar2.setNavigationIcon(drawable);
                } else {
                    toolbar2.setNavigationIcon((Drawable) null);
                }
            }
            c1Var.a(typedArray.getInt(10, 0));
            int resourceId = typedArray.getResourceId(9, 0);
            if (resourceId != 0) {
                View inflate = LayoutInflater.from(getContext()).inflate(resourceId, (ViewGroup) this, false);
                View view = c1Var.f2940c;
                if (view != null && (c1Var.f2939b & 16) != 0) {
                    removeView(view);
                }
                c1Var.f2940c = inflate;
                if (inflate != null && (c1Var.f2939b & 16) != 0) {
                    addView(inflate);
                }
                c1Var.a(c1Var.f2939b | 16);
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
                this.f1317t.a(max, max2);
            }
            int resourceId2 = typedArray.getResourceId(28, 0);
            if (resourceId2 != 0) {
                Context context = getContext();
                this.f1309l = resourceId2;
                C0202b0 c0202b0 = this.f1302b;
                if (c0202b0 != null) {
                    c0202b0.setTextAppearance(context, resourceId2);
                }
            }
            int resourceId3 = typedArray.getResourceId(26, 0);
            if (resourceId3 != 0) {
                Context context2 = getContext();
                this.f1310m = resourceId3;
                C0202b0 c0202b02 = this.f1303c;
                if (c0202b02 != null) {
                    c0202b02.setTextAppearance(context2, resourceId3);
                }
            }
            int resourceId4 = typedArray.getResourceId(22, 0);
            if (resourceId4 != 0) {
                setPopupTheme(resourceId4);
            }
            r2.t();
            if (R.string.abc_action_bar_up_description != c1Var.f2948n) {
                c1Var.f2948n = R.string.abc_action_bar_up_description;
                if (TextUtils.isEmpty(getNavigationContentDescription())) {
                    int i2 = c1Var.f2948n;
                    c1Var.f2944j = i2 != 0 ? getContext().getString(i2) : null;
                    c1Var.b();
                }
            }
            c1Var.f2944j = getNavigationContentDescription();
            setNavigationOnClickListener(new b1(c1Var));
            this.f1293J = c1Var;
        }
        return this.f1293J;
    }

    public final int j(View view, int i) {
        Y0 y02 = (Y0) view.getLayoutParams();
        int measuredHeight = view.getMeasuredHeight();
        int i2 = i > 0 ? (measuredHeight - i) / 2 : 0;
        int i3 = y02.f2920a & 112;
        if (i3 != 16 && i3 != 48 && i3 != 80) {
            i3 = this.f1320w & 112;
        }
        if (i3 == 48) {
            return getPaddingTop() - i2;
        }
        if (i3 == 80) {
            return (((getHeight() - getPaddingBottom()) - measuredHeight) - ((ViewGroup.MarginLayoutParams) y02).bottomMargin) - i2;
        }
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int height = getHeight();
        int i4 = (((height - paddingTop) - paddingBottom) - measuredHeight) / 2;
        int i5 = ((ViewGroup.MarginLayoutParams) y02).topMargin;
        if (i4 < i5) {
            i4 = i5;
        } else {
            int i6 = (((height - paddingBottom) - measuredHeight) - i4) - paddingTop;
            int i7 = ((ViewGroup.MarginLayoutParams) y02).bottomMargin;
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
        Iterator it = this.f1291H.iterator();
        while (it.hasNext()) {
            getMenu().removeItem(((MenuItem) it.next()).getItemId());
        }
        getMenu();
        ArrayList<MenuItem> currentMenuItems = getCurrentMenuItems();
        getMenuInflater();
        Iterator it2 = ((CopyOnWriteArrayList) this.f1290G.f405c).iterator();
        while (it2.hasNext()) {
            ((B) it2.next()).f876a.j();
        }
        ArrayList<MenuItem> currentMenuItems2 = getCurrentMenuItems();
        currentMenuItems2.removeAll(currentMenuItems);
        this.f1291H = currentMenuItems2;
    }

    public final boolean o(View view) {
        return view.getParent() == this || this.f1289E.contains(view);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        u();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeCallbacks(this.f1300Q);
        u();
    }

    @Override // android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.f1287C = false;
        }
        if (!this.f1287C) {
            boolean onHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !onHoverEvent) {
                this.f1287C = true;
            }
        }
        if (actionMasked == 10 || actionMasked == 3) {
            this.f1287C = false;
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
        int[] iArr = this.F;
        iArr[1] = 0;
        iArr[0] = 0;
        WeakHashMap weakHashMap = S.f351a;
        int minimumHeight = getMinimumHeight();
        int min = minimumHeight >= 0 ? Math.min(minimumHeight, i4 - i2) : 0;
        if (!t(this.d)) {
            i5 = paddingLeft;
        } else {
            if (z4) {
                i6 = q(this.d, i24, min, iArr);
                i5 = paddingLeft;
                if (t(this.h)) {
                    if (z4) {
                        i6 = q(this.h, i6, min, iArr);
                    } else {
                        i5 = p(this.h, i5, min, iArr);
                    }
                }
                if (t(this.f1301a)) {
                    if (z4) {
                        i5 = p(this.f1301a, i5, min, iArr);
                    } else {
                        i6 = q(this.f1301a, i6, min, iArr);
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
                if (t(this.f1304e)) {
                    if (z4) {
                        min2 = q(this.f1304e, min2, min, iArr);
                    } else {
                        max = p(this.f1304e, max, min, iArr);
                    }
                }
                t2 = t(this.f1302b);
                t3 = t(this.f1303c);
                if (t2) {
                    i7 = paddingRight;
                    i8 = 0;
                } else {
                    Y0 y02 = (Y0) this.f1302b.getLayoutParams();
                    i7 = paddingRight;
                    i8 = ((ViewGroup.MarginLayoutParams) y02).bottomMargin + this.f1302b.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) y02).topMargin;
                }
                if (t3) {
                    i9 = width;
                } else {
                    Y0 y03 = (Y0) this.f1303c.getLayoutParams();
                    i9 = width;
                    i8 += this.f1303c.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) y03).topMargin + ((ViewGroup.MarginLayoutParams) y03).bottomMargin;
                }
                if (!t2 || t3) {
                    C0202b0 c0202b0 = !t2 ? this.f1302b : this.f1303c;
                    C0202b0 c0202b02 = !t3 ? this.f1303c : this.f1302b;
                    Y0 y04 = (Y0) c0202b0.getLayoutParams();
                    Y0 y05 = (Y0) c0202b02.getLayoutParams();
                    if ((t2 || this.f1302b.getMeasuredWidth() <= 0) && (!t3 || this.f1303c.getMeasuredWidth() <= 0)) {
                        i10 = paddingLeft;
                        z3 = false;
                    } else {
                        i10 = paddingLeft;
                        z3 = true;
                    }
                    i11 = this.f1320w & 112;
                    i12 = min;
                    if (i11 != 48) {
                        i13 = max;
                        paddingTop = getPaddingTop() + ((ViewGroup.MarginLayoutParams) y04).topMargin + this.f1315r;
                    } else if (i11 != 80) {
                        int i25 = (((height - paddingTop2) - paddingBottom) - i8) / 2;
                        i13 = max;
                        int i26 = ((ViewGroup.MarginLayoutParams) y04).topMargin + this.f1315r;
                        if (i25 < i26) {
                            i25 = i26;
                        } else {
                            int i27 = (((height - paddingBottom) - i8) - i25) - paddingTop2;
                            int i28 = ((ViewGroup.MarginLayoutParams) y04).bottomMargin;
                            int i29 = this.f1316s;
                            if (i27 < i28 + i29) {
                                i25 = Math.max(0, i25 - ((((ViewGroup.MarginLayoutParams) y05).bottomMargin + i29) - i27));
                            }
                        }
                        paddingTop = paddingTop2 + i25;
                    } else {
                        i13 = max;
                        paddingTop = (((height - paddingBottom) - ((ViewGroup.MarginLayoutParams) y05).bottomMargin) - this.f1316s) - i8;
                    }
                    if (z4) {
                        int i30 = (z3 ? this.f1313p : 0) - iArr[0];
                        max = Math.max(0, i30) + i13;
                        iArr[0] = Math.max(0, -i30);
                        if (t2) {
                            Y0 y06 = (Y0) this.f1302b.getLayoutParams();
                            int measuredWidth = this.f1302b.getMeasuredWidth() + max;
                            int measuredHeight = this.f1302b.getMeasuredHeight() + paddingTop;
                            this.f1302b.layout(max, paddingTop, measuredWidth, measuredHeight);
                            i14 = measuredWidth + this.f1314q;
                            paddingTop = measuredHeight + ((ViewGroup.MarginLayoutParams) y06).bottomMargin;
                        } else {
                            i14 = max;
                        }
                        if (t3) {
                            int i31 = paddingTop + ((ViewGroup.MarginLayoutParams) ((Y0) this.f1303c.getLayoutParams())).topMargin;
                            int measuredWidth2 = this.f1303c.getMeasuredWidth() + max;
                            this.f1303c.layout(max, i31, measuredWidth2, this.f1303c.getMeasuredHeight() + i31);
                            i15 = measuredWidth2 + this.f1314q;
                        } else {
                            i15 = max;
                        }
                        if (z3) {
                            max = Math.max(i14, i15);
                        }
                    } else {
                        int i32 = (z3 ? this.f1313p : 0) - iArr[1];
                        min2 -= Math.max(0, i32);
                        iArr[1] = Math.max(0, -i32);
                        if (t2) {
                            Y0 y07 = (Y0) this.f1302b.getLayoutParams();
                            int measuredWidth3 = min2 - this.f1302b.getMeasuredWidth();
                            int measuredHeight2 = this.f1302b.getMeasuredHeight() + paddingTop;
                            this.f1302b.layout(measuredWidth3, paddingTop, min2, measuredHeight2);
                            i16 = measuredWidth3 - this.f1314q;
                            paddingTop = measuredHeight2 + ((ViewGroup.MarginLayoutParams) y07).bottomMargin;
                        } else {
                            i16 = min2;
                        }
                        if (t3) {
                            int i33 = paddingTop + ((ViewGroup.MarginLayoutParams) ((Y0) this.f1303c.getLayoutParams())).topMargin;
                            this.f1303c.layout(min2 - this.f1303c.getMeasuredWidth(), i33, min2, this.f1303c.getMeasuredHeight() + i33);
                            i17 = min2 - this.f1314q;
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
                ArrayList arrayList = this.f1288D;
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
                    Y0 y08 = (Y0) view.getLayoutParams();
                    int i40 = ((ViewGroup.MarginLayoutParams) y08).leftMargin - i38;
                    int i41 = ((ViewGroup.MarginLayoutParams) y08).rightMargin - i37;
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
        if (t(this.h)) {
        }
        if (t(this.f1301a)) {
        }
        int currentContentInsetLeft2 = getCurrentContentInsetLeft();
        int currentContentInsetRight2 = getCurrentContentInsetRight();
        iArr[0] = Math.max(0, currentContentInsetLeft2 - i5);
        iArr[1] = Math.max(0, currentContentInsetRight2 - (i24 - i6));
        int max6 = Math.max(i5, currentContentInsetLeft2);
        int min22 = Math.min(i6, i24 - currentContentInsetRight2);
        if (t(this.i)) {
        }
        if (t(this.f1304e)) {
        }
        t2 = t(this.f1302b);
        t3 = t(this.f1303c);
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
        Y0 y042 = (Y0) c0202b0.getLayoutParams();
        Y0 y052 = (Y0) c0202b02.getLayoutParams();
        if (t2) {
        }
        i10 = paddingLeft;
        z3 = false;
        i11 = this.f1320w & 112;
        i12 = min;
        if (i11 != 48) {
        }
        if (z4) {
        }
        ArrayList arrayList2 = this.f1288D;
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
        boolean z2 = h1.f2967a;
        int i10 = 0;
        if (getLayoutDirection() == 1) {
            c3 = 1;
            c2 = 0;
        } else {
            c2 = 1;
            c3 = 0;
        }
        if (t(this.d)) {
            s(this.d, i, 0, i2, this.f1312o);
            i3 = k(this.d) + this.d.getMeasuredWidth();
            i4 = Math.max(0, l(this.d) + this.d.getMeasuredHeight());
            i5 = View.combineMeasuredStates(0, this.d.getMeasuredState());
        } else {
            i3 = 0;
            i4 = 0;
            i5 = 0;
        }
        if (t(this.h)) {
            s(this.h, i, 0, i2, this.f1312o);
            i3 = k(this.h) + this.h.getMeasuredWidth();
            i4 = Math.max(i4, l(this.h) + this.h.getMeasuredHeight());
            i5 = View.combineMeasuredStates(i5, this.h.getMeasuredState());
        }
        int currentContentInsetStart = getCurrentContentInsetStart();
        int max = Math.max(currentContentInsetStart, i3);
        int max2 = Math.max(0, currentContentInsetStart - i3);
        int[] iArr = this.F;
        iArr[c3] = max2;
        if (t(this.f1301a)) {
            s(this.f1301a, i, max, i2, this.f1312o);
            i6 = k(this.f1301a) + this.f1301a.getMeasuredWidth();
            i4 = Math.max(i4, l(this.f1301a) + this.f1301a.getMeasuredHeight());
            i5 = View.combineMeasuredStates(i5, this.f1301a.getMeasuredState());
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
        if (t(this.f1304e)) {
            max3 += r(this.f1304e, i, max3, i2, 0, iArr);
            i4 = Math.max(i4, l(this.f1304e) + this.f1304e.getMeasuredHeight());
            i5 = View.combineMeasuredStates(i5, this.f1304e.getMeasuredState());
        }
        int childCount = getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = getChildAt(i11);
            if (((Y0) childAt.getLayoutParams()).f2921b == 0 && t(childAt)) {
                max3 += r(childAt, i, max3, i2, 0, iArr);
                i4 = Math.max(i4, l(childAt) + childAt.getMeasuredHeight());
                i5 = View.combineMeasuredStates(i5, childAt.getMeasuredState());
            }
        }
        int i12 = this.f1315r + this.f1316s;
        int i13 = this.f1313p + this.f1314q;
        if (t(this.f1302b)) {
            r(this.f1302b, i, max3 + i13, i2, i12, iArr);
            int k2 = k(this.f1302b) + this.f1302b.getMeasuredWidth();
            i7 = l(this.f1302b) + this.f1302b.getMeasuredHeight();
            i8 = View.combineMeasuredStates(i5, this.f1302b.getMeasuredState());
            i9 = k2;
        } else {
            i7 = 0;
            i8 = i5;
            i9 = 0;
        }
        if (t(this.f1303c)) {
            i9 = Math.max(i9, r(this.f1303c, i, max3 + i13, i2, i7 + i12, iArr));
            i7 = l(this.f1303c) + this.f1303c.getMeasuredHeight() + i7;
            i8 = View.combineMeasuredStates(i8, this.f1303c.getMeasuredState());
        }
        int max4 = Math.max(i4, i7);
        int paddingRight = getPaddingRight() + getPaddingLeft();
        int paddingBottom = getPaddingBottom() + getPaddingTop() + max4;
        int resolveSizeAndState = View.resolveSizeAndState(Math.max(paddingRight + max3 + i9, getSuggestedMinimumWidth()), i, (-16777216) & i8);
        int resolveSizeAndState2 = View.resolveSizeAndState(Math.max(paddingBottom, getSuggestedMinimumHeight()), i2, i8 << 16);
        if (this.f1296M) {
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
        if (!(parcelable instanceof a1)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        a1 a1Var = (a1) parcelable;
        super.onRestoreInstanceState(a1Var.f732a);
        ActionMenuView actionMenuView = this.f1301a;
        MenuC0157m menuC0157m = actionMenuView != null ? actionMenuView.f1258p : null;
        int i = a1Var.f2926c;
        if (i != 0 && this.f1295L != null && menuC0157m != null && (findItem = menuC0157m.findItem(i)) != null) {
            findItem.expandActionView();
        }
        if (a1Var.d) {
            A a2 = this.f1300Q;
            removeCallbacks(a2);
            post(a2);
        }
    }

    @Override // android.view.View
    public final void onRtlPropertiesChanged(int i) {
        super.onRtlPropertiesChanged(i);
        d();
        N0 n0 = this.f1317t;
        boolean z2 = i == 1;
        if (z2 == n0.f2882g) {
            return;
        }
        n0.f2882g = z2;
        if (!n0.h) {
            n0.f2877a = n0.f2880e;
            n0.f2878b = n0.f2881f;
            return;
        }
        if (z2) {
            int i2 = n0.d;
            if (i2 == Integer.MIN_VALUE) {
                i2 = n0.f2880e;
            }
            n0.f2877a = i2;
            int i3 = n0.f2879c;
            if (i3 == Integer.MIN_VALUE) {
                i3 = n0.f2881f;
            }
            n0.f2878b = i3;
            return;
        }
        int i4 = n0.f2879c;
        if (i4 == Integer.MIN_VALUE) {
            i4 = n0.f2880e;
        }
        n0.f2877a = i4;
        int i5 = n0.d;
        if (i5 == Integer.MIN_VALUE) {
            i5 = n0.f2881f;
        }
        n0.f2878b = i5;
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        C0219k c0219k;
        C0159o c0159o;
        a1 a1Var = new a1(super.onSaveInstanceState());
        X0 x02 = this.f1295L;
        if (x02 != null && (c0159o = x02.f2918b) != null) {
            a1Var.f2926c = c0159o.f2675a;
        }
        ActionMenuView actionMenuView = this.f1301a;
        a1Var.d = (actionMenuView == null || (c0219k = actionMenuView.f1262t) == null || !c0219k.i()) ? false : true;
        return a1Var;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f1286B = false;
        }
        if (!this.f1286B) {
            boolean onTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !onTouchEvent) {
                this.f1286B = true;
            }
        }
        if (actionMasked == 1 || actionMasked == 3) {
            this.f1286B = false;
        }
        return true;
    }

    public final int p(View view, int i, int i2, int[] iArr) {
        Y0 y02 = (Y0) view.getLayoutParams();
        int i3 = ((ViewGroup.MarginLayoutParams) y02).leftMargin - iArr[0];
        int max = Math.max(0, i3) + i;
        iArr[0] = Math.max(0, -i3);
        int j2 = j(view, i2);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(max, j2, max + measuredWidth, view.getMeasuredHeight() + j2);
        return measuredWidth + ((ViewGroup.MarginLayoutParams) y02).rightMargin + max;
    }

    public final int q(View view, int i, int i2, int[] iArr) {
        Y0 y02 = (Y0) view.getLayoutParams();
        int i3 = ((ViewGroup.MarginLayoutParams) y02).rightMargin - iArr[1];
        int max = i - Math.max(0, i3);
        iArr[1] = Math.max(0, -i3);
        int j2 = j(view, i2);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(max - measuredWidth, j2, max, view.getMeasuredHeight() + j2);
        return max - (measuredWidth + ((ViewGroup.MarginLayoutParams) y02).leftMargin);
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
        if (this.f1299P != z2) {
            this.f1299P = z2;
            u();
        }
    }

    public void setCollapseContentDescription(int i) {
        setCollapseContentDescription(i != 0 ? getContext().getText(i) : null);
    }

    public void setCollapseIcon(int i) {
        setCollapseIcon(d.D(getContext(), i));
    }

    public void setCollapsible(boolean z2) {
        this.f1296M = z2;
        requestLayout();
    }

    public void setContentInsetEndWithActions(int i) {
        if (i < 0) {
            i = Integer.MIN_VALUE;
        }
        if (i != this.f1319v) {
            this.f1319v = i;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setContentInsetStartWithNavigation(int i) {
        if (i < 0) {
            i = Integer.MIN_VALUE;
        }
        if (i != this.f1318u) {
            this.f1318u = i;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setLogo(int i) {
        setLogo(d.D(getContext(), i));
    }

    public void setLogoDescription(int i) {
        setLogoDescription(getContext().getText(i));
    }

    public void setNavigationContentDescription(int i) {
        setNavigationContentDescription(i != 0 ? getContext().getText(i) : null);
    }

    public void setNavigationIcon(int i) {
        setNavigationIcon(d.D(getContext(), i));
    }

    public void setNavigationOnClickListener(View.OnClickListener onClickListener) {
        g();
        this.d.setOnClickListener(onClickListener);
    }

    public void setOnMenuItemClickListener(Z0 z02) {
    }

    public void setOverflowIcon(Drawable drawable) {
        e();
        this.f1301a.setOverflowIcon(drawable);
    }

    public void setPopupTheme(int i) {
        if (this.f1308k != i) {
            this.f1308k = i;
            if (i == 0) {
                this.f1307j = getContext();
            } else {
                this.f1307j = new ContextThemeWrapper(getContext(), i);
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
        this.f1316s = i;
        requestLayout();
    }

    public void setTitleMarginEnd(int i) {
        this.f1314q = i;
        requestLayout();
    }

    public void setTitleMarginStart(int i) {
        this.f1313p = i;
        requestLayout();
    }

    public void setTitleMarginTop(int i) {
        this.f1315r = i;
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
            OnBackInvokedDispatcher a2 = W0.a(this);
            X0 x02 = this.f1295L;
            boolean z2 = (x02 == null || x02.f2918b == null || a2 == null || !isAttachedToWindow() || !this.f1299P) ? false : true;
            if (z2 && this.f1298O == null) {
                if (this.f1297N == null) {
                    this.f1297N = W0.b(new U0(this, 0));
                }
                W0.c(a2, this.f1297N);
                this.f1298O = a2;
                return;
            }
            if (z2 || (onBackInvokedDispatcher = this.f1298O) == null) {
                return;
            }
            W0.d(onBackInvokedDispatcher, this.f1297N);
            this.f1298O = null;
        }
    }

    public Toolbar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, R.attr.toolbarStyle);
        this.f1320w = 8388627;
        this.f1288D = new ArrayList();
        this.f1289E = new ArrayList();
        this.F = new int[2];
        this.f1290G = new C0011l(new U0(this, 1));
        this.f1291H = new ArrayList();
        this.f1292I = new V0(this);
        this.f1300Q = new A(11, this);
        Context context2 = getContext();
        int[] iArr = a.f2051w;
        C0011l r2 = C0011l.r(context2, attributeSet, iArr, R.attr.toolbarStyle);
        S.k(this, context, iArr, attributeSet, (TypedArray) r2.f405c, R.attr.toolbarStyle);
        TypedArray typedArray = (TypedArray) r2.f405c;
        this.f1309l = typedArray.getResourceId(28, 0);
        this.f1310m = typedArray.getResourceId(19, 0);
        this.f1320w = typedArray.getInteger(0, 8388627);
        this.f1311n = typedArray.getInteger(2, 48);
        int dimensionPixelOffset = typedArray.getDimensionPixelOffset(22, 0);
        dimensionPixelOffset = typedArray.hasValue(27) ? typedArray.getDimensionPixelOffset(27, dimensionPixelOffset) : dimensionPixelOffset;
        this.f1316s = dimensionPixelOffset;
        this.f1315r = dimensionPixelOffset;
        this.f1314q = dimensionPixelOffset;
        this.f1313p = dimensionPixelOffset;
        int dimensionPixelOffset2 = typedArray.getDimensionPixelOffset(25, -1);
        if (dimensionPixelOffset2 >= 0) {
            this.f1313p = dimensionPixelOffset2;
        }
        int dimensionPixelOffset3 = typedArray.getDimensionPixelOffset(24, -1);
        if (dimensionPixelOffset3 >= 0) {
            this.f1314q = dimensionPixelOffset3;
        }
        int dimensionPixelOffset4 = typedArray.getDimensionPixelOffset(26, -1);
        if (dimensionPixelOffset4 >= 0) {
            this.f1315r = dimensionPixelOffset4;
        }
        int dimensionPixelOffset5 = typedArray.getDimensionPixelOffset(23, -1);
        if (dimensionPixelOffset5 >= 0) {
            this.f1316s = dimensionPixelOffset5;
        }
        this.f1312o = typedArray.getDimensionPixelSize(13, -1);
        int dimensionPixelOffset6 = typedArray.getDimensionPixelOffset(9, Integer.MIN_VALUE);
        int dimensionPixelOffset7 = typedArray.getDimensionPixelOffset(5, Integer.MIN_VALUE);
        int dimensionPixelSize = typedArray.getDimensionPixelSize(7, 0);
        int dimensionPixelSize2 = typedArray.getDimensionPixelSize(8, 0);
        d();
        N0 n0 = this.f1317t;
        n0.h = false;
        if (dimensionPixelSize != Integer.MIN_VALUE) {
            n0.f2880e = dimensionPixelSize;
            n0.f2877a = dimensionPixelSize;
        }
        if (dimensionPixelSize2 != Integer.MIN_VALUE) {
            n0.f2881f = dimensionPixelSize2;
            n0.f2878b = dimensionPixelSize2;
        }
        if (dimensionPixelOffset6 != Integer.MIN_VALUE || dimensionPixelOffset7 != Integer.MIN_VALUE) {
            n0.a(dimensionPixelOffset6, dimensionPixelOffset7);
        }
        this.f1318u = typedArray.getDimensionPixelOffset(10, Integer.MIN_VALUE);
        this.f1319v = typedArray.getDimensionPixelOffset(6, Integer.MIN_VALUE);
        this.f1305f = r2.h(4);
        this.f1306g = typedArray.getText(3);
        CharSequence text = typedArray.getText(21);
        if (!TextUtils.isEmpty(text)) {
            setTitle(text);
        }
        CharSequence text2 = typedArray.getText(18);
        if (!TextUtils.isEmpty(text2)) {
            setSubtitle(text2);
        }
        this.f1307j = getContext();
        setPopupTheme(typedArray.getResourceId(17, 0));
        Drawable h = r2.h(16);
        if (h != null) {
            setNavigationIcon(h);
        }
        CharSequence text3 = typedArray.getText(15);
        if (!TextUtils.isEmpty(text3)) {
            setNavigationContentDescription(text3);
        }
        Drawable h2 = r2.h(11);
        if (h2 != null) {
            setLogo(h2);
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
        Y0 y02 = new Y0(context, attributeSet);
        y02.f2920a = 0;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a.f2033b);
        y02.f2920a = obtainStyledAttributes.getInt(0, 0);
        obtainStyledAttributes.recycle();
        y02.f2921b = 0;
        return y02;
    }

    public void setCollapseContentDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            c();
        }
        C0245x c0245x = this.h;
        if (c0245x != null) {
            c0245x.setContentDescription(charSequence);
        }
    }

    public void setCollapseIcon(Drawable drawable) {
        if (drawable != null) {
            c();
            this.h.setImageDrawable(drawable);
        } else {
            C0245x c0245x = this.h;
            if (c0245x != null) {
                c0245x.setImageDrawable(this.f1305f);
            }
        }
    }

    public void setLogo(Drawable drawable) {
        if (drawable != null) {
            if (this.f1304e == null) {
                this.f1304e = new C0247y(getContext(), null, 0);
            }
            if (!o(this.f1304e)) {
                b(this.f1304e, true);
            }
        } else {
            C0247y c0247y = this.f1304e;
            if (c0247y != null && o(c0247y)) {
                removeView(this.f1304e);
                this.f1289E.remove(this.f1304e);
            }
        }
        C0247y c0247y2 = this.f1304e;
        if (c0247y2 != null) {
            c0247y2.setImageDrawable(drawable);
        }
    }

    public void setLogoDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence) && this.f1304e == null) {
            this.f1304e = new C0247y(getContext(), null, 0);
        }
        C0247y c0247y = this.f1304e;
        if (c0247y != null) {
            c0247y.setContentDescription(charSequence);
        }
    }

    public void setNavigationContentDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            g();
        }
        C0245x c0245x = this.d;
        if (c0245x != null) {
            c0245x.setContentDescription(charSequence);
            d1.a(this.d, charSequence);
        }
    }

    public void setNavigationIcon(Drawable drawable) {
        if (drawable != null) {
            g();
            if (!o(this.d)) {
                b(this.d, true);
            }
        } else {
            C0245x c0245x = this.d;
            if (c0245x != null && o(c0245x)) {
                removeView(this.d);
                this.f1289E.remove(this.d);
            }
        }
        C0245x c0245x2 = this.d;
        if (c0245x2 != null) {
            c0245x2.setImageDrawable(drawable);
        }
    }

    public void setSubtitle(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            C0202b0 c0202b0 = this.f1303c;
            if (c0202b0 != null && o(c0202b0)) {
                removeView(this.f1303c);
                this.f1289E.remove(this.f1303c);
            }
        } else {
            if (this.f1303c == null) {
                Context context = getContext();
                C0202b0 c0202b02 = new C0202b0(context, null);
                this.f1303c = c0202b02;
                c0202b02.setSingleLine();
                this.f1303c.setEllipsize(TextUtils.TruncateAt.END);
                int i = this.f1310m;
                if (i != 0) {
                    this.f1303c.setTextAppearance(context, i);
                }
                ColorStateList colorStateList = this.f1285A;
                if (colorStateList != null) {
                    this.f1303c.setTextColor(colorStateList);
                }
            }
            if (!o(this.f1303c)) {
                b(this.f1303c, true);
            }
        }
        C0202b0 c0202b03 = this.f1303c;
        if (c0202b03 != null) {
            c0202b03.setText(charSequence);
        }
        this.f1322y = charSequence;
    }

    public void setSubtitleTextColor(ColorStateList colorStateList) {
        this.f1285A = colorStateList;
        C0202b0 c0202b0 = this.f1303c;
        if (c0202b0 != null) {
            c0202b0.setTextColor(colorStateList);
        }
    }

    public void setTitle(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            C0202b0 c0202b0 = this.f1302b;
            if (c0202b0 != null && o(c0202b0)) {
                removeView(this.f1302b);
                this.f1289E.remove(this.f1302b);
            }
        } else {
            if (this.f1302b == null) {
                Context context = getContext();
                C0202b0 c0202b02 = new C0202b0(context, null);
                this.f1302b = c0202b02;
                c0202b02.setSingleLine();
                this.f1302b.setEllipsize(TextUtils.TruncateAt.END);
                int i = this.f1309l;
                if (i != 0) {
                    this.f1302b.setTextAppearance(context, i);
                }
                ColorStateList colorStateList = this.f1323z;
                if (colorStateList != null) {
                    this.f1302b.setTextColor(colorStateList);
                }
            }
            if (!o(this.f1302b)) {
                b(this.f1302b, true);
            }
        }
        C0202b0 c0202b03 = this.f1302b;
        if (c0202b03 != null) {
            c0202b03.setText(charSequence);
        }
        this.f1321x = charSequence;
    }

    public void setTitleTextColor(ColorStateList colorStateList) {
        this.f1323z = colorStateList;
        C0202b0 c0202b0 = this.f1302b;
        if (c0202b0 != null) {
            c0202b0.setTextColor(colorStateList);
        }
    }
}
