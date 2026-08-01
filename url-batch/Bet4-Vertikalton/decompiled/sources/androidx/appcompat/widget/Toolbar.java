package androidx.appcompat.widget;

import K.C0014l;
import K.T;
import M0.B;
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
import com.playbag.tripgear.R;
import f.a;
import j.h;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import k.C0166o;
import k.MenuC0164m;
import l.C0201c0;
import l.C0216k;
import l.C0242x;
import l.C0244y;
import l.InterfaceC0219l0;
import l.O0;
import l.V0;
import l.W0;
import l.X0;
import l.Y0;
import l.Z0;
import l.a1;
import l.b1;
import l.c1;
import l.d1;
import l.e1;
import l.i1;
import w1.l;

/* loaded from: classes.dex */
public class Toolbar extends ViewGroup {

    /* renamed from: A, reason: collision with root package name */
    public ColorStateList f1327A;

    /* renamed from: B, reason: collision with root package name */
    public boolean f1328B;

    /* renamed from: C, reason: collision with root package name */
    public boolean f1329C;

    /* renamed from: D, reason: collision with root package name */
    public final ArrayList f1330D;

    /* renamed from: E, reason: collision with root package name */
    public final ArrayList f1331E;
    public final int[] F;

    /* renamed from: G, reason: collision with root package name */
    public final C0014l f1332G;

    /* renamed from: H, reason: collision with root package name */
    public ArrayList f1333H;

    /* renamed from: I, reason: collision with root package name */
    public final W0 f1334I;

    /* renamed from: J, reason: collision with root package name */
    public d1 f1335J;

    /* renamed from: K, reason: collision with root package name */
    public C0216k f1336K;

    /* renamed from: L, reason: collision with root package name */
    public Y0 f1337L;

    /* renamed from: M, reason: collision with root package name */
    public boolean f1338M;

    /* renamed from: N, reason: collision with root package name */
    public OnBackInvokedCallback f1339N;

    /* renamed from: O, reason: collision with root package name */
    public OnBackInvokedDispatcher f1340O;

    /* renamed from: P, reason: collision with root package name */
    public boolean f1341P;

    /* renamed from: Q, reason: collision with root package name */
    public final B f1342Q;

    /* renamed from: a, reason: collision with root package name */
    public ActionMenuView f1343a;

    /* renamed from: b, reason: collision with root package name */
    public C0201c0 f1344b;

    /* renamed from: c, reason: collision with root package name */
    public C0201c0 f1345c;
    public C0242x d;

    /* renamed from: e, reason: collision with root package name */
    public C0244y f1346e;

    /* renamed from: f, reason: collision with root package name */
    public final Drawable f1347f;

    /* renamed from: g, reason: collision with root package name */
    public final CharSequence f1348g;
    public C0242x h;
    public View i;

    /* renamed from: j, reason: collision with root package name */
    public Context f1349j;

    /* renamed from: k, reason: collision with root package name */
    public int f1350k;

    /* renamed from: l, reason: collision with root package name */
    public int f1351l;

    /* renamed from: m, reason: collision with root package name */
    public int f1352m;

    /* renamed from: n, reason: collision with root package name */
    public final int f1353n;

    /* renamed from: o, reason: collision with root package name */
    public final int f1354o;

    /* renamed from: p, reason: collision with root package name */
    public int f1355p;

    /* renamed from: q, reason: collision with root package name */
    public int f1356q;

    /* renamed from: r, reason: collision with root package name */
    public int f1357r;

    /* renamed from: s, reason: collision with root package name */
    public int f1358s;

    /* renamed from: t, reason: collision with root package name */
    public O0 f1359t;

    /* renamed from: u, reason: collision with root package name */
    public int f1360u;

    /* renamed from: v, reason: collision with root package name */
    public int f1361v;

    /* renamed from: w, reason: collision with root package name */
    public final int f1362w;

    /* renamed from: x, reason: collision with root package name */
    public CharSequence f1363x;

    /* renamed from: y, reason: collision with root package name */
    public CharSequence f1364y;

    /* renamed from: z, reason: collision with root package name */
    public ColorStateList f1365z;

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

    public static Z0 h() {
        Z0 z0 = new Z0(-2, -2);
        z0.f2880b = 0;
        z0.f2879a = 8388627;
        return z0;
    }

    public static Z0 i(ViewGroup.LayoutParams layoutParams) {
        boolean z2 = layoutParams instanceof Z0;
        if (z2) {
            Z0 z0 = (Z0) layoutParams;
            Z0 z02 = new Z0(z0);
            z02.f2880b = 0;
            z02.f2880b = z0.f2880b;
            return z02;
        }
        if (z2) {
            Z0 z03 = new Z0((Z0) layoutParams);
            z03.f2880b = 0;
            return z03;
        }
        if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
            Z0 z04 = new Z0(layoutParams);
            z04.f2880b = 0;
            return z04;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        Z0 z05 = new Z0(marginLayoutParams);
        z05.f2880b = 0;
        ((ViewGroup.MarginLayoutParams) z05).leftMargin = marginLayoutParams.leftMargin;
        ((ViewGroup.MarginLayoutParams) z05).topMargin = marginLayoutParams.topMargin;
        ((ViewGroup.MarginLayoutParams) z05).rightMargin = marginLayoutParams.rightMargin;
        ((ViewGroup.MarginLayoutParams) z05).bottomMargin = marginLayoutParams.bottomMargin;
        return z05;
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
                Z0 z0 = (Z0) childAt.getLayoutParams();
                if (z0.f2880b == 0 && t(childAt)) {
                    int i3 = z0.f2879a;
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
            Z0 z02 = (Z0) childAt2.getLayoutParams();
            if (z02.f2880b == 0 && t(childAt2)) {
                int i5 = z02.f2879a;
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
        Z0 h = layoutParams == null ? h() : !checkLayoutParams(layoutParams) ? i(layoutParams) : (Z0) layoutParams;
        h.f2880b = 1;
        if (!z2 || this.i == null) {
            addView(view, h);
        } else {
            view.setLayoutParams(h);
            this.f1331E.add(view);
        }
    }

    public final void c() {
        if (this.h == null) {
            C0242x c0242x = new C0242x(getContext(), null, R.attr.toolbarNavigationButtonStyle);
            this.h = c0242x;
            c0242x.setImageDrawable(this.f1347f);
            this.h.setContentDescription(this.f1348g);
            Z0 h = h();
            h.f2879a = (this.f1353n & 112) | 8388611;
            h.f2880b = 2;
            this.h.setLayoutParams(h);
            this.h.setOnClickListener(new j(3, this));
        }
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return super.checkLayoutParams(layoutParams) && (layoutParams instanceof Z0);
    }

    public final void d() {
        if (this.f1359t == null) {
            O0 o0 = new O0();
            o0.f2835a = 0;
            o0.f2836b = 0;
            o0.f2837c = Integer.MIN_VALUE;
            o0.d = Integer.MIN_VALUE;
            o0.f2838e = 0;
            o0.f2839f = 0;
            o0.f2840g = false;
            o0.h = false;
            this.f1359t = o0;
        }
    }

    public final void e() {
        f();
        ActionMenuView actionMenuView = this.f1343a;
        if (actionMenuView.f1303p == null) {
            MenuC0164m menuC0164m = (MenuC0164m) actionMenuView.getMenu();
            if (this.f1337L == null) {
                this.f1337L = new Y0(this);
            }
            this.f1343a.setExpandedActionViewsExclusive(true);
            menuC0164m.b(this.f1337L, this.f1349j);
            u();
        }
    }

    public final void f() {
        if (this.f1343a == null) {
            ActionMenuView actionMenuView = new ActionMenuView(getContext(), null);
            this.f1343a = actionMenuView;
            actionMenuView.setPopupTheme(this.f1350k);
            this.f1343a.setOnMenuItemClickListener(this.f1334I);
            ActionMenuView actionMenuView2 = this.f1343a;
            W0 w02 = new W0(this);
            actionMenuView2.getClass();
            actionMenuView2.f1308u = w02;
            Z0 h = h();
            h.f2879a = (this.f1353n & 112) | 8388613;
            this.f1343a.setLayoutParams(h);
            b(this.f1343a, false);
        }
    }

    public final void g() {
        if (this.d == null) {
            this.d = new C0242x(getContext(), null, R.attr.toolbarNavigationButtonStyle);
            Z0 h = h();
            h.f2879a = (this.f1353n & 112) | 8388611;
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
        C0242x c0242x = this.h;
        if (c0242x != null) {
            return c0242x.getContentDescription();
        }
        return null;
    }

    public Drawable getCollapseIcon() {
        C0242x c0242x = this.h;
        if (c0242x != null) {
            return c0242x.getDrawable();
        }
        return null;
    }

    public int getContentInsetEnd() {
        O0 o0 = this.f1359t;
        if (o0 != null) {
            return o0.f2840g ? o0.f2835a : o0.f2836b;
        }
        return 0;
    }

    public int getContentInsetEndWithActions() {
        int i = this.f1361v;
        return i != Integer.MIN_VALUE ? i : getContentInsetEnd();
    }

    public int getContentInsetLeft() {
        O0 o0 = this.f1359t;
        if (o0 != null) {
            return o0.f2835a;
        }
        return 0;
    }

    public int getContentInsetRight() {
        O0 o0 = this.f1359t;
        if (o0 != null) {
            return o0.f2836b;
        }
        return 0;
    }

    public int getContentInsetStart() {
        O0 o0 = this.f1359t;
        if (o0 != null) {
            return o0.f2840g ? o0.f2836b : o0.f2835a;
        }
        return 0;
    }

    public int getContentInsetStartWithNavigation() {
        int i = this.f1360u;
        return i != Integer.MIN_VALUE ? i : getContentInsetStart();
    }

    public int getCurrentContentInsetEnd() {
        MenuC0164m menuC0164m;
        ActionMenuView actionMenuView = this.f1343a;
        return (actionMenuView == null || (menuC0164m = actionMenuView.f1303p) == null || !menuC0164m.hasVisibleItems()) ? getContentInsetEnd() : Math.max(getContentInsetEnd(), Math.max(this.f1361v, 0));
    }

    public int getCurrentContentInsetLeft() {
        return getLayoutDirection() == 1 ? getCurrentContentInsetEnd() : getCurrentContentInsetStart();
    }

    public int getCurrentContentInsetRight() {
        return getLayoutDirection() == 1 ? getCurrentContentInsetStart() : getCurrentContentInsetEnd();
    }

    public int getCurrentContentInsetStart() {
        return getNavigationIcon() != null ? Math.max(getContentInsetStart(), Math.max(this.f1360u, 0)) : getContentInsetStart();
    }

    public Drawable getLogo() {
        C0244y c0244y = this.f1346e;
        if (c0244y != null) {
            return c0244y.getDrawable();
        }
        return null;
    }

    public CharSequence getLogoDescription() {
        C0244y c0244y = this.f1346e;
        if (c0244y != null) {
            return c0244y.getContentDescription();
        }
        return null;
    }

    public Menu getMenu() {
        e();
        return this.f1343a.getMenu();
    }

    public View getNavButtonView() {
        return this.d;
    }

    public CharSequence getNavigationContentDescription() {
        C0242x c0242x = this.d;
        if (c0242x != null) {
            return c0242x.getContentDescription();
        }
        return null;
    }

    public Drawable getNavigationIcon() {
        C0242x c0242x = this.d;
        if (c0242x != null) {
            return c0242x.getDrawable();
        }
        return null;
    }

    public C0216k getOuterActionMenuPresenter() {
        return this.f1336K;
    }

    public Drawable getOverflowIcon() {
        e();
        return this.f1343a.getOverflowIcon();
    }

    public Context getPopupContext() {
        return this.f1349j;
    }

    public int getPopupTheme() {
        return this.f1350k;
    }

    public CharSequence getSubtitle() {
        return this.f1364y;
    }

    public final TextView getSubtitleTextView() {
        return this.f1345c;
    }

    public CharSequence getTitle() {
        return this.f1363x;
    }

    public int getTitleMarginBottom() {
        return this.f1358s;
    }

    public int getTitleMarginEnd() {
        return this.f1356q;
    }

    public int getTitleMarginStart() {
        return this.f1355p;
    }

    public int getTitleMarginTop() {
        return this.f1357r;
    }

    public final TextView getTitleTextView() {
        return this.f1344b;
    }

    public InterfaceC0219l0 getWrapper() {
        Drawable drawable;
        if (this.f1335J == null) {
            d1 d1Var = new d1();
            d1Var.f2908n = 0;
            d1Var.f2898a = this;
            d1Var.h = getTitle();
            d1Var.i = getSubtitle();
            d1Var.f2903g = d1Var.h != null;
            d1Var.f2902f = getNavigationIcon();
            C0014l i = C0014l.i(getContext(), null, a.f2055a, R.attr.actionBarStyle);
            d1Var.f2909o = i.c(15);
            TypedArray typedArray = (TypedArray) i.f475b;
            CharSequence text = typedArray.getText(27);
            if (!TextUtils.isEmpty(text)) {
                d1Var.f2903g = true;
                d1Var.h = text;
                if ((d1Var.f2899b & 8) != 0) {
                    Toolbar toolbar = d1Var.f2898a;
                    toolbar.setTitle(text);
                    if (d1Var.f2903g) {
                        T.m(toolbar.getRootView(), text);
                    }
                }
            }
            CharSequence text2 = typedArray.getText(25);
            if (!TextUtils.isEmpty(text2)) {
                d1Var.i = text2;
                if ((d1Var.f2899b & 8) != 0) {
                    setSubtitle(text2);
                }
            }
            Drawable c2 = i.c(20);
            if (c2 != null) {
                d1Var.f2901e = c2;
                d1Var.c();
            }
            Drawable c3 = i.c(17);
            if (c3 != null) {
                d1Var.d = c3;
                d1Var.c();
            }
            if (d1Var.f2902f == null && (drawable = d1Var.f2909o) != null) {
                d1Var.f2902f = drawable;
                int i2 = d1Var.f2899b & 4;
                Toolbar toolbar2 = d1Var.f2898a;
                if (i2 != 0) {
                    toolbar2.setNavigationIcon(drawable);
                } else {
                    toolbar2.setNavigationIcon((Drawable) null);
                }
            }
            d1Var.a(typedArray.getInt(10, 0));
            int resourceId = typedArray.getResourceId(9, 0);
            if (resourceId != 0) {
                View inflate = LayoutInflater.from(getContext()).inflate(resourceId, (ViewGroup) this, false);
                View view = d1Var.f2900c;
                if (view != null && (d1Var.f2899b & 16) != 0) {
                    removeView(view);
                }
                d1Var.f2900c = inflate;
                if (inflate != null && (d1Var.f2899b & 16) != 0) {
                    addView(inflate);
                }
                d1Var.a(d1Var.f2899b | 16);
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
                this.f1359t.a(max, max2);
            }
            int resourceId2 = typedArray.getResourceId(28, 0);
            if (resourceId2 != 0) {
                Context context = getContext();
                this.f1351l = resourceId2;
                C0201c0 c0201c0 = this.f1344b;
                if (c0201c0 != null) {
                    c0201c0.setTextAppearance(context, resourceId2);
                }
            }
            int resourceId3 = typedArray.getResourceId(26, 0);
            if (resourceId3 != 0) {
                Context context2 = getContext();
                this.f1352m = resourceId3;
                C0201c0 c0201c02 = this.f1345c;
                if (c0201c02 != null) {
                    c0201c02.setTextAppearance(context2, resourceId3);
                }
            }
            int resourceId4 = typedArray.getResourceId(22, 0);
            if (resourceId4 != 0) {
                setPopupTheme(resourceId4);
            }
            i.k();
            if (R.string.abc_action_bar_up_description != d1Var.f2908n) {
                d1Var.f2908n = R.string.abc_action_bar_up_description;
                if (TextUtils.isEmpty(getNavigationContentDescription())) {
                    int i3 = d1Var.f2908n;
                    d1Var.f2904j = i3 != 0 ? getContext().getString(i3) : null;
                    d1Var.b();
                }
            }
            d1Var.f2904j = getNavigationContentDescription();
            setNavigationOnClickListener(new c1(d1Var));
            this.f1335J = d1Var;
        }
        return this.f1335J;
    }

    public final int j(View view, int i) {
        Z0 z0 = (Z0) view.getLayoutParams();
        int measuredHeight = view.getMeasuredHeight();
        int i2 = i > 0 ? (measuredHeight - i) / 2 : 0;
        int i3 = z0.f2879a & 112;
        if (i3 != 16 && i3 != 48 && i3 != 80) {
            i3 = this.f1362w & 112;
        }
        if (i3 == 48) {
            return getPaddingTop() - i2;
        }
        if (i3 == 80) {
            return (((getHeight() - getPaddingBottom()) - measuredHeight) - ((ViewGroup.MarginLayoutParams) z0).bottomMargin) - i2;
        }
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int height = getHeight();
        int i4 = (((height - paddingTop) - paddingBottom) - measuredHeight) / 2;
        int i5 = ((ViewGroup.MarginLayoutParams) z0).topMargin;
        if (i4 < i5) {
            i4 = i5;
        } else {
            int i6 = (((height - paddingBottom) - measuredHeight) - i4) - paddingTop;
            int i7 = ((ViewGroup.MarginLayoutParams) z0).bottomMargin;
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
        Iterator it = this.f1333H.iterator();
        while (it.hasNext()) {
            getMenu().removeItem(((MenuItem) it.next()).getItemId());
        }
        getMenu();
        ArrayList<MenuItem> currentMenuItems = getCurrentMenuItems();
        getMenuInflater();
        Iterator it2 = ((CopyOnWriteArrayList) this.f1332G.f475b).iterator();
        while (it2.hasNext()) {
            ((Y.B) it2.next()).f922a.j();
        }
        ArrayList<MenuItem> currentMenuItems2 = getCurrentMenuItems();
        currentMenuItems2.removeAll(currentMenuItems);
        this.f1333H = currentMenuItems2;
    }

    public final boolean o(View view) {
        return view.getParent() == this || this.f1331E.contains(view);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        u();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeCallbacks(this.f1342Q);
        u();
    }

    @Override // android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.f1329C = false;
        }
        if (!this.f1329C) {
            boolean onHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !onHoverEvent) {
                this.f1329C = true;
            }
        }
        if (actionMasked == 10 || actionMasked == 3) {
            this.f1329C = false;
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
        WeakHashMap weakHashMap = T.f423a;
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
                if (t(this.f1343a)) {
                    if (z4) {
                        i5 = p(this.f1343a, i5, min, iArr);
                    } else {
                        i6 = q(this.f1343a, i6, min, iArr);
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
                if (t(this.f1346e)) {
                    if (z4) {
                        min2 = q(this.f1346e, min2, min, iArr);
                    } else {
                        max = p(this.f1346e, max, min, iArr);
                    }
                }
                t2 = t(this.f1344b);
                t3 = t(this.f1345c);
                if (t2) {
                    i7 = paddingRight;
                    i8 = 0;
                } else {
                    Z0 z0 = (Z0) this.f1344b.getLayoutParams();
                    i7 = paddingRight;
                    i8 = ((ViewGroup.MarginLayoutParams) z0).bottomMargin + this.f1344b.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) z0).topMargin;
                }
                if (t3) {
                    i9 = width;
                } else {
                    Z0 z02 = (Z0) this.f1345c.getLayoutParams();
                    i9 = width;
                    i8 += this.f1345c.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) z02).topMargin + ((ViewGroup.MarginLayoutParams) z02).bottomMargin;
                }
                if (!t2 || t3) {
                    C0201c0 c0201c0 = !t2 ? this.f1344b : this.f1345c;
                    C0201c0 c0201c02 = !t3 ? this.f1345c : this.f1344b;
                    Z0 z03 = (Z0) c0201c0.getLayoutParams();
                    Z0 z04 = (Z0) c0201c02.getLayoutParams();
                    if ((t2 || this.f1344b.getMeasuredWidth() <= 0) && (!t3 || this.f1345c.getMeasuredWidth() <= 0)) {
                        i10 = paddingLeft;
                        z3 = false;
                    } else {
                        i10 = paddingLeft;
                        z3 = true;
                    }
                    i11 = this.f1362w & 112;
                    i12 = min;
                    if (i11 != 48) {
                        i13 = max;
                        paddingTop = getPaddingTop() + ((ViewGroup.MarginLayoutParams) z03).topMargin + this.f1357r;
                    } else if (i11 != 80) {
                        int i25 = (((height - paddingTop2) - paddingBottom) - i8) / 2;
                        i13 = max;
                        int i26 = ((ViewGroup.MarginLayoutParams) z03).topMargin + this.f1357r;
                        if (i25 < i26) {
                            i25 = i26;
                        } else {
                            int i27 = (((height - paddingBottom) - i8) - i25) - paddingTop2;
                            int i28 = ((ViewGroup.MarginLayoutParams) z03).bottomMargin;
                            int i29 = this.f1358s;
                            if (i27 < i28 + i29) {
                                i25 = Math.max(0, i25 - ((((ViewGroup.MarginLayoutParams) z04).bottomMargin + i29) - i27));
                            }
                        }
                        paddingTop = paddingTop2 + i25;
                    } else {
                        i13 = max;
                        paddingTop = (((height - paddingBottom) - ((ViewGroup.MarginLayoutParams) z04).bottomMargin) - this.f1358s) - i8;
                    }
                    if (z4) {
                        int i30 = (z3 ? this.f1355p : 0) - iArr[0];
                        max = Math.max(0, i30) + i13;
                        iArr[0] = Math.max(0, -i30);
                        if (t2) {
                            Z0 z05 = (Z0) this.f1344b.getLayoutParams();
                            int measuredWidth = this.f1344b.getMeasuredWidth() + max;
                            int measuredHeight = this.f1344b.getMeasuredHeight() + paddingTop;
                            this.f1344b.layout(max, paddingTop, measuredWidth, measuredHeight);
                            i14 = measuredWidth + this.f1356q;
                            paddingTop = measuredHeight + ((ViewGroup.MarginLayoutParams) z05).bottomMargin;
                        } else {
                            i14 = max;
                        }
                        if (t3) {
                            int i31 = paddingTop + ((ViewGroup.MarginLayoutParams) ((Z0) this.f1345c.getLayoutParams())).topMargin;
                            int measuredWidth2 = this.f1345c.getMeasuredWidth() + max;
                            this.f1345c.layout(max, i31, measuredWidth2, this.f1345c.getMeasuredHeight() + i31);
                            i15 = measuredWidth2 + this.f1356q;
                        } else {
                            i15 = max;
                        }
                        if (z3) {
                            max = Math.max(i14, i15);
                        }
                    } else {
                        int i32 = (z3 ? this.f1355p : 0) - iArr[1];
                        min2 -= Math.max(0, i32);
                        iArr[1] = Math.max(0, -i32);
                        if (t2) {
                            Z0 z06 = (Z0) this.f1344b.getLayoutParams();
                            int measuredWidth3 = min2 - this.f1344b.getMeasuredWidth();
                            int measuredHeight2 = this.f1344b.getMeasuredHeight() + paddingTop;
                            this.f1344b.layout(measuredWidth3, paddingTop, min2, measuredHeight2);
                            i16 = measuredWidth3 - this.f1356q;
                            paddingTop = measuredHeight2 + ((ViewGroup.MarginLayoutParams) z06).bottomMargin;
                        } else {
                            i16 = min2;
                        }
                        if (t3) {
                            int i33 = paddingTop + ((ViewGroup.MarginLayoutParams) ((Z0) this.f1345c.getLayoutParams())).topMargin;
                            this.f1345c.layout(min2 - this.f1345c.getMeasuredWidth(), i33, min2, this.f1345c.getMeasuredHeight() + i33);
                            i17 = min2 - this.f1356q;
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
                ArrayList arrayList = this.f1330D;
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
                    Z0 z07 = (Z0) view.getLayoutParams();
                    int i40 = ((ViewGroup.MarginLayoutParams) z07).leftMargin - i38;
                    int i41 = ((ViewGroup.MarginLayoutParams) z07).rightMargin - i37;
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
        if (t(this.f1343a)) {
        }
        int currentContentInsetLeft2 = getCurrentContentInsetLeft();
        int currentContentInsetRight2 = getCurrentContentInsetRight();
        iArr[0] = Math.max(0, currentContentInsetLeft2 - i5);
        iArr[1] = Math.max(0, currentContentInsetRight2 - (i24 - i6));
        int max6 = Math.max(i5, currentContentInsetLeft2);
        int min22 = Math.min(i6, i24 - currentContentInsetRight2);
        if (t(this.i)) {
        }
        if (t(this.f1346e)) {
        }
        t2 = t(this.f1344b);
        t3 = t(this.f1345c);
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
        Z0 z032 = (Z0) c0201c0.getLayoutParams();
        Z0 z042 = (Z0) c0201c02.getLayoutParams();
        if (t2) {
        }
        i10 = paddingLeft;
        z3 = false;
        i11 = this.f1362w & 112;
        i12 = min;
        if (i11 != 48) {
        }
        if (z4) {
        }
        ArrayList arrayList2 = this.f1330D;
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
        boolean z2 = i1.f2929a;
        int i10 = 0;
        if (getLayoutDirection() == 1) {
            c3 = 1;
            c2 = 0;
        } else {
            c2 = 1;
            c3 = 0;
        }
        if (t(this.d)) {
            s(this.d, i, 0, i2, this.f1354o);
            i3 = k(this.d) + this.d.getMeasuredWidth();
            i4 = Math.max(0, l(this.d) + this.d.getMeasuredHeight());
            i5 = View.combineMeasuredStates(0, this.d.getMeasuredState());
        } else {
            i3 = 0;
            i4 = 0;
            i5 = 0;
        }
        if (t(this.h)) {
            s(this.h, i, 0, i2, this.f1354o);
            i3 = k(this.h) + this.h.getMeasuredWidth();
            i4 = Math.max(i4, l(this.h) + this.h.getMeasuredHeight());
            i5 = View.combineMeasuredStates(i5, this.h.getMeasuredState());
        }
        int currentContentInsetStart = getCurrentContentInsetStart();
        int max = Math.max(currentContentInsetStart, i3);
        int max2 = Math.max(0, currentContentInsetStart - i3);
        int[] iArr = this.F;
        iArr[c3] = max2;
        if (t(this.f1343a)) {
            s(this.f1343a, i, max, i2, this.f1354o);
            i6 = k(this.f1343a) + this.f1343a.getMeasuredWidth();
            i4 = Math.max(i4, l(this.f1343a) + this.f1343a.getMeasuredHeight());
            i5 = View.combineMeasuredStates(i5, this.f1343a.getMeasuredState());
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
        if (t(this.f1346e)) {
            max3 += r(this.f1346e, i, max3, i2, 0, iArr);
            i4 = Math.max(i4, l(this.f1346e) + this.f1346e.getMeasuredHeight());
            i5 = View.combineMeasuredStates(i5, this.f1346e.getMeasuredState());
        }
        int childCount = getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = getChildAt(i11);
            if (((Z0) childAt.getLayoutParams()).f2880b == 0 && t(childAt)) {
                max3 += r(childAt, i, max3, i2, 0, iArr);
                i4 = Math.max(i4, l(childAt) + childAt.getMeasuredHeight());
                i5 = View.combineMeasuredStates(i5, childAt.getMeasuredState());
            }
        }
        int i12 = this.f1357r + this.f1358s;
        int i13 = this.f1355p + this.f1356q;
        if (t(this.f1344b)) {
            r(this.f1344b, i, max3 + i13, i2, i12, iArr);
            int k2 = k(this.f1344b) + this.f1344b.getMeasuredWidth();
            i7 = l(this.f1344b) + this.f1344b.getMeasuredHeight();
            i8 = View.combineMeasuredStates(i5, this.f1344b.getMeasuredState());
            i9 = k2;
        } else {
            i7 = 0;
            i8 = i5;
            i9 = 0;
        }
        if (t(this.f1345c)) {
            i9 = Math.max(i9, r(this.f1345c, i, max3 + i13, i2, i7 + i12, iArr));
            i7 = l(this.f1345c) + this.f1345c.getMeasuredHeight() + i7;
            i8 = View.combineMeasuredStates(i8, this.f1345c.getMeasuredState());
        }
        int max4 = Math.max(i4, i7);
        int paddingRight = getPaddingRight() + getPaddingLeft();
        int paddingBottom = getPaddingBottom() + getPaddingTop() + max4;
        int resolveSizeAndState = View.resolveSizeAndState(Math.max(paddingRight + max3 + i9, getSuggestedMinimumWidth()), i, (-16777216) & i8);
        int resolveSizeAndState2 = View.resolveSizeAndState(Math.max(paddingBottom, getSuggestedMinimumHeight()), i2, i8 << 16);
        if (this.f1338M) {
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
        if (!(parcelable instanceof b1)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        b1 b1Var = (b1) parcelable;
        super.onRestoreInstanceState(b1Var.f783a);
        ActionMenuView actionMenuView = this.f1343a;
        MenuC0164m menuC0164m = actionMenuView != null ? actionMenuView.f1303p : null;
        int i = b1Var.f2887c;
        if (i != 0 && this.f1337L != null && menuC0164m != null && (findItem = menuC0164m.findItem(i)) != null) {
            findItem.expandActionView();
        }
        if (b1Var.d) {
            B b2 = this.f1342Q;
            removeCallbacks(b2);
            post(b2);
        }
    }

    @Override // android.view.View
    public final void onRtlPropertiesChanged(int i) {
        super.onRtlPropertiesChanged(i);
        d();
        O0 o0 = this.f1359t;
        boolean z2 = i == 1;
        if (z2 == o0.f2840g) {
            return;
        }
        o0.f2840g = z2;
        if (!o0.h) {
            o0.f2835a = o0.f2838e;
            o0.f2836b = o0.f2839f;
            return;
        }
        if (z2) {
            int i2 = o0.d;
            if (i2 == Integer.MIN_VALUE) {
                i2 = o0.f2838e;
            }
            o0.f2835a = i2;
            int i3 = o0.f2837c;
            if (i3 == Integer.MIN_VALUE) {
                i3 = o0.f2839f;
            }
            o0.f2836b = i3;
            return;
        }
        int i4 = o0.f2837c;
        if (i4 == Integer.MIN_VALUE) {
            i4 = o0.f2838e;
        }
        o0.f2835a = i4;
        int i5 = o0.d;
        if (i5 == Integer.MIN_VALUE) {
            i5 = o0.f2839f;
        }
        o0.f2836b = i5;
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        C0216k c0216k;
        C0166o c0166o;
        b1 b1Var = new b1(super.onSaveInstanceState());
        Y0 y02 = this.f1337L;
        if (y02 != null && (c0166o = y02.f2876b) != null) {
            b1Var.f2887c = c0166o.f2712a;
        }
        ActionMenuView actionMenuView = this.f1343a;
        b1Var.d = (actionMenuView == null || (c0216k = actionMenuView.f1307t) == null || !c0216k.i()) ? false : true;
        return b1Var;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f1328B = false;
        }
        if (!this.f1328B) {
            boolean onTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !onTouchEvent) {
                this.f1328B = true;
            }
        }
        if (actionMasked == 1 || actionMasked == 3) {
            this.f1328B = false;
        }
        return true;
    }

    public final int p(View view, int i, int i2, int[] iArr) {
        Z0 z0 = (Z0) view.getLayoutParams();
        int i3 = ((ViewGroup.MarginLayoutParams) z0).leftMargin - iArr[0];
        int max = Math.max(0, i3) + i;
        iArr[0] = Math.max(0, -i3);
        int j2 = j(view, i2);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(max, j2, max + measuredWidth, view.getMeasuredHeight() + j2);
        return measuredWidth + ((ViewGroup.MarginLayoutParams) z0).rightMargin + max;
    }

    public final int q(View view, int i, int i2, int[] iArr) {
        Z0 z0 = (Z0) view.getLayoutParams();
        int i3 = ((ViewGroup.MarginLayoutParams) z0).rightMargin - iArr[1];
        int max = i - Math.max(0, i3);
        iArr[1] = Math.max(0, -i3);
        int j2 = j(view, i2);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(max - measuredWidth, j2, max, view.getMeasuredHeight() + j2);
        return max - (measuredWidth + ((ViewGroup.MarginLayoutParams) z0).leftMargin);
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
        if (this.f1341P != z2) {
            this.f1341P = z2;
            u();
        }
    }

    public void setCollapseContentDescription(int i) {
        setCollapseContentDescription(i != 0 ? getContext().getText(i) : null);
    }

    public void setCollapseIcon(int i) {
        setCollapseIcon(l.z(getContext(), i));
    }

    public void setCollapsible(boolean z2) {
        this.f1338M = z2;
        requestLayout();
    }

    public void setContentInsetEndWithActions(int i) {
        if (i < 0) {
            i = Integer.MIN_VALUE;
        }
        if (i != this.f1361v) {
            this.f1361v = i;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setContentInsetStartWithNavigation(int i) {
        if (i < 0) {
            i = Integer.MIN_VALUE;
        }
        if (i != this.f1360u) {
            this.f1360u = i;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setLogo(int i) {
        setLogo(l.z(getContext(), i));
    }

    public void setLogoDescription(int i) {
        setLogoDescription(getContext().getText(i));
    }

    public void setNavigationContentDescription(int i) {
        setNavigationContentDescription(i != 0 ? getContext().getText(i) : null);
    }

    public void setNavigationIcon(int i) {
        setNavigationIcon(l.z(getContext(), i));
    }

    public void setNavigationOnClickListener(View.OnClickListener onClickListener) {
        g();
        this.d.setOnClickListener(onClickListener);
    }

    public void setOnMenuItemClickListener(a1 a1Var) {
    }

    public void setOverflowIcon(Drawable drawable) {
        e();
        this.f1343a.setOverflowIcon(drawable);
    }

    public void setPopupTheme(int i) {
        if (this.f1350k != i) {
            this.f1350k = i;
            if (i == 0) {
                this.f1349j = getContext();
            } else {
                this.f1349j = new ContextThemeWrapper(getContext(), i);
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
        this.f1358s = i;
        requestLayout();
    }

    public void setTitleMarginEnd(int i) {
        this.f1356q = i;
        requestLayout();
    }

    public void setTitleMarginStart(int i) {
        this.f1355p = i;
        requestLayout();
    }

    public void setTitleMarginTop(int i) {
        this.f1357r = i;
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
            OnBackInvokedDispatcher a2 = X0.a(this);
            Y0 y02 = this.f1337L;
            boolean z2 = (y02 == null || y02.f2876b == null || a2 == null || !isAttachedToWindow() || !this.f1341P) ? false : true;
            if (z2 && this.f1340O == null) {
                if (this.f1339N == null) {
                    this.f1339N = X0.b(new V0(this, 0));
                }
                X0.c(a2, this.f1339N);
                this.f1340O = a2;
                return;
            }
            if (z2 || (onBackInvokedDispatcher = this.f1340O) == null) {
                return;
            }
            X0.d(onBackInvokedDispatcher, this.f1339N);
            this.f1340O = null;
        }
    }

    public Toolbar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, R.attr.toolbarStyle);
        this.f1362w = 8388627;
        this.f1330D = new ArrayList();
        this.f1331E = new ArrayList();
        this.F = new int[2];
        this.f1332G = new C0014l(new V0(this, 1));
        this.f1333H = new ArrayList();
        this.f1334I = new W0(this);
        this.f1342Q = new B(10, this);
        Context context2 = getContext();
        int[] iArr = a.f2074w;
        C0014l i2 = C0014l.i(context2, attributeSet, iArr, R.attr.toolbarStyle);
        T.k(this, context, iArr, attributeSet, (TypedArray) i2.f475b, R.attr.toolbarStyle);
        TypedArray typedArray = (TypedArray) i2.f475b;
        this.f1351l = typedArray.getResourceId(28, 0);
        this.f1352m = typedArray.getResourceId(19, 0);
        this.f1362w = typedArray.getInteger(0, 8388627);
        this.f1353n = typedArray.getInteger(2, 48);
        int dimensionPixelOffset = typedArray.getDimensionPixelOffset(22, 0);
        dimensionPixelOffset = typedArray.hasValue(27) ? typedArray.getDimensionPixelOffset(27, dimensionPixelOffset) : dimensionPixelOffset;
        this.f1358s = dimensionPixelOffset;
        this.f1357r = dimensionPixelOffset;
        this.f1356q = dimensionPixelOffset;
        this.f1355p = dimensionPixelOffset;
        int dimensionPixelOffset2 = typedArray.getDimensionPixelOffset(25, -1);
        if (dimensionPixelOffset2 >= 0) {
            this.f1355p = dimensionPixelOffset2;
        }
        int dimensionPixelOffset3 = typedArray.getDimensionPixelOffset(24, -1);
        if (dimensionPixelOffset3 >= 0) {
            this.f1356q = dimensionPixelOffset3;
        }
        int dimensionPixelOffset4 = typedArray.getDimensionPixelOffset(26, -1);
        if (dimensionPixelOffset4 >= 0) {
            this.f1357r = dimensionPixelOffset4;
        }
        int dimensionPixelOffset5 = typedArray.getDimensionPixelOffset(23, -1);
        if (dimensionPixelOffset5 >= 0) {
            this.f1358s = dimensionPixelOffset5;
        }
        this.f1354o = typedArray.getDimensionPixelSize(13, -1);
        int dimensionPixelOffset6 = typedArray.getDimensionPixelOffset(9, Integer.MIN_VALUE);
        int dimensionPixelOffset7 = typedArray.getDimensionPixelOffset(5, Integer.MIN_VALUE);
        int dimensionPixelSize = typedArray.getDimensionPixelSize(7, 0);
        int dimensionPixelSize2 = typedArray.getDimensionPixelSize(8, 0);
        d();
        O0 o0 = this.f1359t;
        o0.h = false;
        if (dimensionPixelSize != Integer.MIN_VALUE) {
            o0.f2838e = dimensionPixelSize;
            o0.f2835a = dimensionPixelSize;
        }
        if (dimensionPixelSize2 != Integer.MIN_VALUE) {
            o0.f2839f = dimensionPixelSize2;
            o0.f2836b = dimensionPixelSize2;
        }
        if (dimensionPixelOffset6 != Integer.MIN_VALUE || dimensionPixelOffset7 != Integer.MIN_VALUE) {
            o0.a(dimensionPixelOffset6, dimensionPixelOffset7);
        }
        this.f1360u = typedArray.getDimensionPixelOffset(10, Integer.MIN_VALUE);
        this.f1361v = typedArray.getDimensionPixelOffset(6, Integer.MIN_VALUE);
        this.f1347f = i2.c(4);
        this.f1348g = typedArray.getText(3);
        CharSequence text = typedArray.getText(21);
        if (!TextUtils.isEmpty(text)) {
            setTitle(text);
        }
        CharSequence text2 = typedArray.getText(18);
        if (!TextUtils.isEmpty(text2)) {
            setSubtitle(text2);
        }
        this.f1349j = getContext();
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
        Z0 z0 = new Z0(context, attributeSet);
        z0.f2879a = 0;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a.f2056b);
        z0.f2879a = obtainStyledAttributes.getInt(0, 0);
        obtainStyledAttributes.recycle();
        z0.f2880b = 0;
        return z0;
    }

    public void setCollapseContentDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            c();
        }
        C0242x c0242x = this.h;
        if (c0242x != null) {
            c0242x.setContentDescription(charSequence);
        }
    }

    public void setCollapseIcon(Drawable drawable) {
        if (drawable != null) {
            c();
            this.h.setImageDrawable(drawable);
        } else {
            C0242x c0242x = this.h;
            if (c0242x != null) {
                c0242x.setImageDrawable(this.f1347f);
            }
        }
    }

    public void setLogo(Drawable drawable) {
        if (drawable != null) {
            if (this.f1346e == null) {
                this.f1346e = new C0244y(getContext(), null, 0);
            }
            if (!o(this.f1346e)) {
                b(this.f1346e, true);
            }
        } else {
            C0244y c0244y = this.f1346e;
            if (c0244y != null && o(c0244y)) {
                removeView(this.f1346e);
                this.f1331E.remove(this.f1346e);
            }
        }
        C0244y c0244y2 = this.f1346e;
        if (c0244y2 != null) {
            c0244y2.setImageDrawable(drawable);
        }
    }

    public void setLogoDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence) && this.f1346e == null) {
            this.f1346e = new C0244y(getContext(), null, 0);
        }
        C0244y c0244y = this.f1346e;
        if (c0244y != null) {
            c0244y.setContentDescription(charSequence);
        }
    }

    public void setNavigationContentDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            g();
        }
        C0242x c0242x = this.d;
        if (c0242x != null) {
            c0242x.setContentDescription(charSequence);
            e1.a(this.d, charSequence);
        }
    }

    public void setNavigationIcon(Drawable drawable) {
        if (drawable != null) {
            g();
            if (!o(this.d)) {
                b(this.d, true);
            }
        } else {
            C0242x c0242x = this.d;
            if (c0242x != null && o(c0242x)) {
                removeView(this.d);
                this.f1331E.remove(this.d);
            }
        }
        C0242x c0242x2 = this.d;
        if (c0242x2 != null) {
            c0242x2.setImageDrawable(drawable);
        }
    }

    public void setSubtitle(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            C0201c0 c0201c0 = this.f1345c;
            if (c0201c0 != null && o(c0201c0)) {
                removeView(this.f1345c);
                this.f1331E.remove(this.f1345c);
            }
        } else {
            if (this.f1345c == null) {
                Context context = getContext();
                C0201c0 c0201c02 = new C0201c0(context, null);
                this.f1345c = c0201c02;
                c0201c02.setSingleLine();
                this.f1345c.setEllipsize(TextUtils.TruncateAt.END);
                int i = this.f1352m;
                if (i != 0) {
                    this.f1345c.setTextAppearance(context, i);
                }
                ColorStateList colorStateList = this.f1327A;
                if (colorStateList != null) {
                    this.f1345c.setTextColor(colorStateList);
                }
            }
            if (!o(this.f1345c)) {
                b(this.f1345c, true);
            }
        }
        C0201c0 c0201c03 = this.f1345c;
        if (c0201c03 != null) {
            c0201c03.setText(charSequence);
        }
        this.f1364y = charSequence;
    }

    public void setSubtitleTextColor(ColorStateList colorStateList) {
        this.f1327A = colorStateList;
        C0201c0 c0201c0 = this.f1345c;
        if (c0201c0 != null) {
            c0201c0.setTextColor(colorStateList);
        }
    }

    public void setTitle(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            C0201c0 c0201c0 = this.f1344b;
            if (c0201c0 != null && o(c0201c0)) {
                removeView(this.f1344b);
                this.f1331E.remove(this.f1344b);
            }
        } else {
            if (this.f1344b == null) {
                Context context = getContext();
                C0201c0 c0201c02 = new C0201c0(context, null);
                this.f1344b = c0201c02;
                c0201c02.setSingleLine();
                this.f1344b.setEllipsize(TextUtils.TruncateAt.END);
                int i = this.f1351l;
                if (i != 0) {
                    this.f1344b.setTextAppearance(context, i);
                }
                ColorStateList colorStateList = this.f1365z;
                if (colorStateList != null) {
                    this.f1344b.setTextColor(colorStateList);
                }
            }
            if (!o(this.f1344b)) {
                b(this.f1344b, true);
            }
        }
        C0201c0 c0201c03 = this.f1344b;
        if (c0201c03 != null) {
            c0201c03.setText(charSequence);
        }
        this.f1363x = charSequence;
    }

    public void setTitleTextColor(ColorStateList colorStateList) {
        this.f1365z = colorStateList;
        C0201c0 c0201c0 = this.f1344b;
        if (c0201c0 != null) {
            c0201c0.setTextColor(colorStateList);
        }
    }
}
