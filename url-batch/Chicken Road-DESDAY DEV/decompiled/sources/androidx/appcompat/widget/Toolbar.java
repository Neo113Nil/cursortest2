package androidx.appcompat.widget;

import K.C0011l;
import K.S;
import L0.B;
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
import com.playgen.securelock.R;
import f.a;
import j.h;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import k.C0163o;
import k.MenuC0161m;
import l.C0213d0;
import l.C0226k;
import l.C0254y;
import l.C0256z;
import l.InterfaceC0231m0;
import l.P0;
import l.W0;
import l.X0;
import l.Y0;
import l.Z0;
import l.a1;
import l.b1;
import l.c1;
import l.d1;
import l.e1;
import l.f1;
import l.j1;
import u1.d;

/* loaded from: classes.dex */
public class Toolbar extends ViewGroup {

    /* renamed from: A, reason: collision with root package name */
    public ColorStateList f1268A;

    /* renamed from: B, reason: collision with root package name */
    public boolean f1269B;

    /* renamed from: C, reason: collision with root package name */
    public boolean f1270C;

    /* renamed from: D, reason: collision with root package name */
    public final ArrayList f1271D;

    /* renamed from: E, reason: collision with root package name */
    public final ArrayList f1272E;
    public final int[] F;

    /* renamed from: G, reason: collision with root package name */
    public final C0011l f1273G;

    /* renamed from: H, reason: collision with root package name */
    public ArrayList f1274H;

    /* renamed from: I, reason: collision with root package name */
    public final X0 f1275I;

    /* renamed from: J, reason: collision with root package name */
    public e1 f1276J;

    /* renamed from: K, reason: collision with root package name */
    public C0226k f1277K;

    /* renamed from: L, reason: collision with root package name */
    public Z0 f1278L;

    /* renamed from: M, reason: collision with root package name */
    public boolean f1279M;

    /* renamed from: N, reason: collision with root package name */
    public OnBackInvokedCallback f1280N;

    /* renamed from: O, reason: collision with root package name */
    public OnBackInvokedDispatcher f1281O;

    /* renamed from: P, reason: collision with root package name */
    public boolean f1282P;

    /* renamed from: Q, reason: collision with root package name */
    public final B f1283Q;

    /* renamed from: a, reason: collision with root package name */
    public ActionMenuView f1284a;

    /* renamed from: b, reason: collision with root package name */
    public C0213d0 f1285b;

    /* renamed from: c, reason: collision with root package name */
    public C0213d0 f1286c;
    public C0254y d;

    /* renamed from: e, reason: collision with root package name */
    public C0256z f1287e;

    /* renamed from: f, reason: collision with root package name */
    public final Drawable f1288f;

    /* renamed from: g, reason: collision with root package name */
    public final CharSequence f1289g;
    public C0254y h;
    public View i;

    /* renamed from: j, reason: collision with root package name */
    public Context f1290j;

    /* renamed from: k, reason: collision with root package name */
    public int f1291k;

    /* renamed from: l, reason: collision with root package name */
    public int f1292l;

    /* renamed from: m, reason: collision with root package name */
    public int f1293m;

    /* renamed from: n, reason: collision with root package name */
    public final int f1294n;

    /* renamed from: o, reason: collision with root package name */
    public final int f1295o;

    /* renamed from: p, reason: collision with root package name */
    public int f1296p;

    /* renamed from: q, reason: collision with root package name */
    public int f1297q;

    /* renamed from: r, reason: collision with root package name */
    public int f1298r;

    /* renamed from: s, reason: collision with root package name */
    public int f1299s;

    /* renamed from: t, reason: collision with root package name */
    public P0 f1300t;

    /* renamed from: u, reason: collision with root package name */
    public int f1301u;

    /* renamed from: v, reason: collision with root package name */
    public int f1302v;

    /* renamed from: w, reason: collision with root package name */
    public final int f1303w;

    /* renamed from: x, reason: collision with root package name */
    public CharSequence f1304x;

    /* renamed from: y, reason: collision with root package name */
    public CharSequence f1305y;

    /* renamed from: z, reason: collision with root package name */
    public ColorStateList f1306z;

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

    public static a1 h() {
        a1 a1Var = new a1(-2, -2);
        a1Var.f2891b = 0;
        a1Var.f2890a = 8388627;
        return a1Var;
    }

    public static a1 i(ViewGroup.LayoutParams layoutParams) {
        boolean z2 = layoutParams instanceof a1;
        if (z2) {
            a1 a1Var = (a1) layoutParams;
            a1 a1Var2 = new a1(a1Var);
            a1Var2.f2891b = 0;
            a1Var2.f2891b = a1Var.f2891b;
            return a1Var2;
        }
        if (z2) {
            a1 a1Var3 = new a1((a1) layoutParams);
            a1Var3.f2891b = 0;
            return a1Var3;
        }
        if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
            a1 a1Var4 = new a1(layoutParams);
            a1Var4.f2891b = 0;
            return a1Var4;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        a1 a1Var5 = new a1(marginLayoutParams);
        a1Var5.f2891b = 0;
        ((ViewGroup.MarginLayoutParams) a1Var5).leftMargin = marginLayoutParams.leftMargin;
        ((ViewGroup.MarginLayoutParams) a1Var5).topMargin = marginLayoutParams.topMargin;
        ((ViewGroup.MarginLayoutParams) a1Var5).rightMargin = marginLayoutParams.rightMargin;
        ((ViewGroup.MarginLayoutParams) a1Var5).bottomMargin = marginLayoutParams.bottomMargin;
        return a1Var5;
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
                a1 a1Var = (a1) childAt.getLayoutParams();
                if (a1Var.f2891b == 0 && t(childAt)) {
                    int i3 = a1Var.f2890a;
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
            a1 a1Var2 = (a1) childAt2.getLayoutParams();
            if (a1Var2.f2891b == 0 && t(childAt2)) {
                int i5 = a1Var2.f2890a;
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
        a1 h = layoutParams == null ? h() : !checkLayoutParams(layoutParams) ? i(layoutParams) : (a1) layoutParams;
        h.f2891b = 1;
        if (!z2 || this.i == null) {
            addView(view, h);
        } else {
            view.setLayoutParams(h);
            this.f1272E.add(view);
        }
    }

    public final void c() {
        if (this.h == null) {
            C0254y c0254y = new C0254y(getContext(), null, R.attr.toolbarNavigationButtonStyle);
            this.h = c0254y;
            c0254y.setImageDrawable(this.f1288f);
            this.h.setContentDescription(this.f1289g);
            a1 h = h();
            h.f2890a = (this.f1294n & 112) | 8388611;
            h.f2891b = 2;
            this.h.setLayoutParams(h);
            this.h.setOnClickListener(new j(3, this));
        }
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return super.checkLayoutParams(layoutParams) && (layoutParams instanceof a1);
    }

    public final void d() {
        if (this.f1300t == null) {
            P0 p02 = new P0();
            p02.f2843a = 0;
            p02.f2844b = 0;
            p02.f2845c = Integer.MIN_VALUE;
            p02.d = Integer.MIN_VALUE;
            p02.f2846e = 0;
            p02.f2847f = 0;
            p02.f2848g = false;
            p02.h = false;
            this.f1300t = p02;
        }
    }

    public final void e() {
        f();
        ActionMenuView actionMenuView = this.f1284a;
        if (actionMenuView.f1244p == null) {
            MenuC0161m menuC0161m = (MenuC0161m) actionMenuView.getMenu();
            if (this.f1278L == null) {
                this.f1278L = new Z0(this);
            }
            this.f1284a.setExpandedActionViewsExclusive(true);
            menuC0161m.b(this.f1278L, this.f1290j);
            u();
        }
    }

    public final void f() {
        if (this.f1284a == null) {
            ActionMenuView actionMenuView = new ActionMenuView(getContext(), null);
            this.f1284a = actionMenuView;
            actionMenuView.setPopupTheme(this.f1291k);
            this.f1284a.setOnMenuItemClickListener(this.f1275I);
            ActionMenuView actionMenuView2 = this.f1284a;
            X0 x02 = new X0(this);
            actionMenuView2.getClass();
            actionMenuView2.f1249u = x02;
            a1 h = h();
            h.f2890a = (this.f1294n & 112) | 8388613;
            this.f1284a.setLayoutParams(h);
            b(this.f1284a, false);
        }
    }

    public final void g() {
        if (this.d == null) {
            this.d = new C0254y(getContext(), null, R.attr.toolbarNavigationButtonStyle);
            a1 h = h();
            h.f2890a = (this.f1294n & 112) | 8388611;
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
        C0254y c0254y = this.h;
        if (c0254y != null) {
            return c0254y.getContentDescription();
        }
        return null;
    }

    public Drawable getCollapseIcon() {
        C0254y c0254y = this.h;
        if (c0254y != null) {
            return c0254y.getDrawable();
        }
        return null;
    }

    public int getContentInsetEnd() {
        P0 p02 = this.f1300t;
        if (p02 != null) {
            return p02.f2848g ? p02.f2843a : p02.f2844b;
        }
        return 0;
    }

    public int getContentInsetEndWithActions() {
        int i = this.f1302v;
        return i != Integer.MIN_VALUE ? i : getContentInsetEnd();
    }

    public int getContentInsetLeft() {
        P0 p02 = this.f1300t;
        if (p02 != null) {
            return p02.f2843a;
        }
        return 0;
    }

    public int getContentInsetRight() {
        P0 p02 = this.f1300t;
        if (p02 != null) {
            return p02.f2844b;
        }
        return 0;
    }

    public int getContentInsetStart() {
        P0 p02 = this.f1300t;
        if (p02 != null) {
            return p02.f2848g ? p02.f2844b : p02.f2843a;
        }
        return 0;
    }

    public int getContentInsetStartWithNavigation() {
        int i = this.f1301u;
        return i != Integer.MIN_VALUE ? i : getContentInsetStart();
    }

    public int getCurrentContentInsetEnd() {
        MenuC0161m menuC0161m;
        ActionMenuView actionMenuView = this.f1284a;
        return (actionMenuView == null || (menuC0161m = actionMenuView.f1244p) == null || !menuC0161m.hasVisibleItems()) ? getContentInsetEnd() : Math.max(getContentInsetEnd(), Math.max(this.f1302v, 0));
    }

    public int getCurrentContentInsetLeft() {
        return getLayoutDirection() == 1 ? getCurrentContentInsetEnd() : getCurrentContentInsetStart();
    }

    public int getCurrentContentInsetRight() {
        return getLayoutDirection() == 1 ? getCurrentContentInsetStart() : getCurrentContentInsetEnd();
    }

    public int getCurrentContentInsetStart() {
        return getNavigationIcon() != null ? Math.max(getContentInsetStart(), Math.max(this.f1301u, 0)) : getContentInsetStart();
    }

    public Drawable getLogo() {
        C0256z c0256z = this.f1287e;
        if (c0256z != null) {
            return c0256z.getDrawable();
        }
        return null;
    }

    public CharSequence getLogoDescription() {
        C0256z c0256z = this.f1287e;
        if (c0256z != null) {
            return c0256z.getContentDescription();
        }
        return null;
    }

    public Menu getMenu() {
        e();
        return this.f1284a.getMenu();
    }

    public View getNavButtonView() {
        return this.d;
    }

    public CharSequence getNavigationContentDescription() {
        C0254y c0254y = this.d;
        if (c0254y != null) {
            return c0254y.getContentDescription();
        }
        return null;
    }

    public Drawable getNavigationIcon() {
        C0254y c0254y = this.d;
        if (c0254y != null) {
            return c0254y.getDrawable();
        }
        return null;
    }

    public C0226k getOuterActionMenuPresenter() {
        return this.f1277K;
    }

    public Drawable getOverflowIcon() {
        e();
        return this.f1284a.getOverflowIcon();
    }

    public Context getPopupContext() {
        return this.f1290j;
    }

    public int getPopupTheme() {
        return this.f1291k;
    }

    public CharSequence getSubtitle() {
        return this.f1305y;
    }

    public final TextView getSubtitleTextView() {
        return this.f1286c;
    }

    public CharSequence getTitle() {
        return this.f1304x;
    }

    public int getTitleMarginBottom() {
        return this.f1299s;
    }

    public int getTitleMarginEnd() {
        return this.f1297q;
    }

    public int getTitleMarginStart() {
        return this.f1296p;
    }

    public int getTitleMarginTop() {
        return this.f1298r;
    }

    public final TextView getTitleTextView() {
        return this.f1285b;
    }

    public InterfaceC0231m0 getWrapper() {
        Drawable drawable;
        if (this.f1276J == null) {
            e1 e1Var = new e1();
            e1Var.f2916n = 0;
            e1Var.f2906a = this;
            e1Var.h = getTitle();
            e1Var.i = getSubtitle();
            e1Var.f2911g = e1Var.h != null;
            e1Var.f2910f = getNavigationIcon();
            C0011l r2 = C0011l.r(getContext(), null, a.f1990a, R.attr.actionBarStyle);
            e1Var.f2917o = r2.h(15);
            TypedArray typedArray = (TypedArray) r2.f423c;
            CharSequence text = typedArray.getText(27);
            if (!TextUtils.isEmpty(text)) {
                e1Var.f2911g = true;
                e1Var.h = text;
                if ((e1Var.f2907b & 8) != 0) {
                    Toolbar toolbar = e1Var.f2906a;
                    toolbar.setTitle(text);
                    if (e1Var.f2911g) {
                        S.m(toolbar.getRootView(), text);
                    }
                }
            }
            CharSequence text2 = typedArray.getText(25);
            if (!TextUtils.isEmpty(text2)) {
                e1Var.i = text2;
                if ((e1Var.f2907b & 8) != 0) {
                    setSubtitle(text2);
                }
            }
            Drawable h = r2.h(20);
            if (h != null) {
                e1Var.f2909e = h;
                e1Var.c();
            }
            Drawable h2 = r2.h(17);
            if (h2 != null) {
                e1Var.d = h2;
                e1Var.c();
            }
            if (e1Var.f2910f == null && (drawable = e1Var.f2917o) != null) {
                e1Var.f2910f = drawable;
                int i = e1Var.f2907b & 4;
                Toolbar toolbar2 = e1Var.f2906a;
                if (i != 0) {
                    toolbar2.setNavigationIcon(drawable);
                } else {
                    toolbar2.setNavigationIcon((Drawable) null);
                }
            }
            e1Var.a(typedArray.getInt(10, 0));
            int resourceId = typedArray.getResourceId(9, 0);
            if (resourceId != 0) {
                View inflate = LayoutInflater.from(getContext()).inflate(resourceId, (ViewGroup) this, false);
                View view = e1Var.f2908c;
                if (view != null && (e1Var.f2907b & 16) != 0) {
                    removeView(view);
                }
                e1Var.f2908c = inflate;
                if (inflate != null && (e1Var.f2907b & 16) != 0) {
                    addView(inflate);
                }
                e1Var.a(e1Var.f2907b | 16);
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
                this.f1300t.a(max, max2);
            }
            int resourceId2 = typedArray.getResourceId(28, 0);
            if (resourceId2 != 0) {
                Context context = getContext();
                this.f1292l = resourceId2;
                C0213d0 c0213d0 = this.f1285b;
                if (c0213d0 != null) {
                    c0213d0.setTextAppearance(context, resourceId2);
                }
            }
            int resourceId3 = typedArray.getResourceId(26, 0);
            if (resourceId3 != 0) {
                Context context2 = getContext();
                this.f1293m = resourceId3;
                C0213d0 c0213d02 = this.f1286c;
                if (c0213d02 != null) {
                    c0213d02.setTextAppearance(context2, resourceId3);
                }
            }
            int resourceId4 = typedArray.getResourceId(22, 0);
            if (resourceId4 != 0) {
                setPopupTheme(resourceId4);
            }
            r2.t();
            if (R.string.abc_action_bar_up_description != e1Var.f2916n) {
                e1Var.f2916n = R.string.abc_action_bar_up_description;
                if (TextUtils.isEmpty(getNavigationContentDescription())) {
                    int i2 = e1Var.f2916n;
                    e1Var.f2912j = i2 != 0 ? getContext().getString(i2) : null;
                    e1Var.b();
                }
            }
            e1Var.f2912j = getNavigationContentDescription();
            setNavigationOnClickListener(new d1(e1Var));
            this.f1276J = e1Var;
        }
        return this.f1276J;
    }

    public final int j(View view, int i) {
        a1 a1Var = (a1) view.getLayoutParams();
        int measuredHeight = view.getMeasuredHeight();
        int i2 = i > 0 ? (measuredHeight - i) / 2 : 0;
        int i3 = a1Var.f2890a & 112;
        if (i3 != 16 && i3 != 48 && i3 != 80) {
            i3 = this.f1303w & 112;
        }
        if (i3 == 48) {
            return getPaddingTop() - i2;
        }
        if (i3 == 80) {
            return (((getHeight() - getPaddingBottom()) - measuredHeight) - ((ViewGroup.MarginLayoutParams) a1Var).bottomMargin) - i2;
        }
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int height = getHeight();
        int i4 = (((height - paddingTop) - paddingBottom) - measuredHeight) / 2;
        int i5 = ((ViewGroup.MarginLayoutParams) a1Var).topMargin;
        if (i4 < i5) {
            i4 = i5;
        } else {
            int i6 = (((height - paddingBottom) - measuredHeight) - i4) - paddingTop;
            int i7 = ((ViewGroup.MarginLayoutParams) a1Var).bottomMargin;
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
        Iterator it = this.f1274H.iterator();
        while (it.hasNext()) {
            getMenu().removeItem(((MenuItem) it.next()).getItemId());
        }
        getMenu();
        ArrayList<MenuItem> currentMenuItems = getCurrentMenuItems();
        getMenuInflater();
        Iterator it2 = ((CopyOnWriteArrayList) this.f1273G.f423c).iterator();
        while (it2.hasNext()) {
            ((X.B) it2.next()).f862a.j();
        }
        ArrayList<MenuItem> currentMenuItems2 = getCurrentMenuItems();
        currentMenuItems2.removeAll(currentMenuItems);
        this.f1274H = currentMenuItems2;
    }

    public final boolean o(View view) {
        return view.getParent() == this || this.f1272E.contains(view);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        u();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeCallbacks(this.f1283Q);
        u();
    }

    @Override // android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.f1270C = false;
        }
        if (!this.f1270C) {
            boolean onHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !onHoverEvent) {
                this.f1270C = true;
            }
        }
        if (actionMasked == 10 || actionMasked == 3) {
            this.f1270C = false;
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
        WeakHashMap weakHashMap = S.f369a;
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
                if (t(this.f1284a)) {
                    if (z4) {
                        i5 = p(this.f1284a, i5, min, iArr);
                    } else {
                        i6 = q(this.f1284a, i6, min, iArr);
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
                if (t(this.f1287e)) {
                    if (z4) {
                        min2 = q(this.f1287e, min2, min, iArr);
                    } else {
                        max = p(this.f1287e, max, min, iArr);
                    }
                }
                t2 = t(this.f1285b);
                t3 = t(this.f1286c);
                if (t2) {
                    i7 = paddingRight;
                    i8 = 0;
                } else {
                    a1 a1Var = (a1) this.f1285b.getLayoutParams();
                    i7 = paddingRight;
                    i8 = ((ViewGroup.MarginLayoutParams) a1Var).bottomMargin + this.f1285b.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) a1Var).topMargin;
                }
                if (t3) {
                    i9 = width;
                } else {
                    a1 a1Var2 = (a1) this.f1286c.getLayoutParams();
                    i9 = width;
                    i8 += this.f1286c.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) a1Var2).topMargin + ((ViewGroup.MarginLayoutParams) a1Var2).bottomMargin;
                }
                if (!t2 || t3) {
                    C0213d0 c0213d0 = !t2 ? this.f1285b : this.f1286c;
                    C0213d0 c0213d02 = !t3 ? this.f1286c : this.f1285b;
                    a1 a1Var3 = (a1) c0213d0.getLayoutParams();
                    a1 a1Var4 = (a1) c0213d02.getLayoutParams();
                    if ((t2 || this.f1285b.getMeasuredWidth() <= 0) && (!t3 || this.f1286c.getMeasuredWidth() <= 0)) {
                        i10 = paddingLeft;
                        z3 = false;
                    } else {
                        i10 = paddingLeft;
                        z3 = true;
                    }
                    i11 = this.f1303w & 112;
                    i12 = min;
                    if (i11 != 48) {
                        i13 = max;
                        paddingTop = getPaddingTop() + ((ViewGroup.MarginLayoutParams) a1Var3).topMargin + this.f1298r;
                    } else if (i11 != 80) {
                        int i25 = (((height - paddingTop2) - paddingBottom) - i8) / 2;
                        i13 = max;
                        int i26 = ((ViewGroup.MarginLayoutParams) a1Var3).topMargin + this.f1298r;
                        if (i25 < i26) {
                            i25 = i26;
                        } else {
                            int i27 = (((height - paddingBottom) - i8) - i25) - paddingTop2;
                            int i28 = ((ViewGroup.MarginLayoutParams) a1Var3).bottomMargin;
                            int i29 = this.f1299s;
                            if (i27 < i28 + i29) {
                                i25 = Math.max(0, i25 - ((((ViewGroup.MarginLayoutParams) a1Var4).bottomMargin + i29) - i27));
                            }
                        }
                        paddingTop = paddingTop2 + i25;
                    } else {
                        i13 = max;
                        paddingTop = (((height - paddingBottom) - ((ViewGroup.MarginLayoutParams) a1Var4).bottomMargin) - this.f1299s) - i8;
                    }
                    if (z4) {
                        int i30 = (z3 ? this.f1296p : 0) - iArr[0];
                        max = Math.max(0, i30) + i13;
                        iArr[0] = Math.max(0, -i30);
                        if (t2) {
                            a1 a1Var5 = (a1) this.f1285b.getLayoutParams();
                            int measuredWidth = this.f1285b.getMeasuredWidth() + max;
                            int measuredHeight = this.f1285b.getMeasuredHeight() + paddingTop;
                            this.f1285b.layout(max, paddingTop, measuredWidth, measuredHeight);
                            i14 = measuredWidth + this.f1297q;
                            paddingTop = measuredHeight + ((ViewGroup.MarginLayoutParams) a1Var5).bottomMargin;
                        } else {
                            i14 = max;
                        }
                        if (t3) {
                            int i31 = paddingTop + ((ViewGroup.MarginLayoutParams) ((a1) this.f1286c.getLayoutParams())).topMargin;
                            int measuredWidth2 = this.f1286c.getMeasuredWidth() + max;
                            this.f1286c.layout(max, i31, measuredWidth2, this.f1286c.getMeasuredHeight() + i31);
                            i15 = measuredWidth2 + this.f1297q;
                        } else {
                            i15 = max;
                        }
                        if (z3) {
                            max = Math.max(i14, i15);
                        }
                    } else {
                        int i32 = (z3 ? this.f1296p : 0) - iArr[1];
                        min2 -= Math.max(0, i32);
                        iArr[1] = Math.max(0, -i32);
                        if (t2) {
                            a1 a1Var6 = (a1) this.f1285b.getLayoutParams();
                            int measuredWidth3 = min2 - this.f1285b.getMeasuredWidth();
                            int measuredHeight2 = this.f1285b.getMeasuredHeight() + paddingTop;
                            this.f1285b.layout(measuredWidth3, paddingTop, min2, measuredHeight2);
                            i16 = measuredWidth3 - this.f1297q;
                            paddingTop = measuredHeight2 + ((ViewGroup.MarginLayoutParams) a1Var6).bottomMargin;
                        } else {
                            i16 = min2;
                        }
                        if (t3) {
                            int i33 = paddingTop + ((ViewGroup.MarginLayoutParams) ((a1) this.f1286c.getLayoutParams())).topMargin;
                            this.f1286c.layout(min2 - this.f1286c.getMeasuredWidth(), i33, min2, this.f1286c.getMeasuredHeight() + i33);
                            i17 = min2 - this.f1297q;
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
                ArrayList arrayList = this.f1271D;
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
                    a1 a1Var7 = (a1) view.getLayoutParams();
                    int i40 = ((ViewGroup.MarginLayoutParams) a1Var7).leftMargin - i38;
                    int i41 = ((ViewGroup.MarginLayoutParams) a1Var7).rightMargin - i37;
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
        if (t(this.f1284a)) {
        }
        int currentContentInsetLeft2 = getCurrentContentInsetLeft();
        int currentContentInsetRight2 = getCurrentContentInsetRight();
        iArr[0] = Math.max(0, currentContentInsetLeft2 - i5);
        iArr[1] = Math.max(0, currentContentInsetRight2 - (i24 - i6));
        int max6 = Math.max(i5, currentContentInsetLeft2);
        int min22 = Math.min(i6, i24 - currentContentInsetRight2);
        if (t(this.i)) {
        }
        if (t(this.f1287e)) {
        }
        t2 = t(this.f1285b);
        t3 = t(this.f1286c);
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
        a1 a1Var32 = (a1) c0213d0.getLayoutParams();
        a1 a1Var42 = (a1) c0213d02.getLayoutParams();
        if (t2) {
        }
        i10 = paddingLeft;
        z3 = false;
        i11 = this.f1303w & 112;
        i12 = min;
        if (i11 != 48) {
        }
        if (z4) {
        }
        ArrayList arrayList2 = this.f1271D;
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
        boolean z2 = j1.f2937a;
        int i10 = 0;
        if (getLayoutDirection() == 1) {
            c3 = 1;
            c2 = 0;
        } else {
            c2 = 1;
            c3 = 0;
        }
        if (t(this.d)) {
            s(this.d, i, 0, i2, this.f1295o);
            i3 = k(this.d) + this.d.getMeasuredWidth();
            i4 = Math.max(0, l(this.d) + this.d.getMeasuredHeight());
            i5 = View.combineMeasuredStates(0, this.d.getMeasuredState());
        } else {
            i3 = 0;
            i4 = 0;
            i5 = 0;
        }
        if (t(this.h)) {
            s(this.h, i, 0, i2, this.f1295o);
            i3 = k(this.h) + this.h.getMeasuredWidth();
            i4 = Math.max(i4, l(this.h) + this.h.getMeasuredHeight());
            i5 = View.combineMeasuredStates(i5, this.h.getMeasuredState());
        }
        int currentContentInsetStart = getCurrentContentInsetStart();
        int max = Math.max(currentContentInsetStart, i3);
        int max2 = Math.max(0, currentContentInsetStart - i3);
        int[] iArr = this.F;
        iArr[c3] = max2;
        if (t(this.f1284a)) {
            s(this.f1284a, i, max, i2, this.f1295o);
            i6 = k(this.f1284a) + this.f1284a.getMeasuredWidth();
            i4 = Math.max(i4, l(this.f1284a) + this.f1284a.getMeasuredHeight());
            i5 = View.combineMeasuredStates(i5, this.f1284a.getMeasuredState());
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
        if (t(this.f1287e)) {
            max3 += r(this.f1287e, i, max3, i2, 0, iArr);
            i4 = Math.max(i4, l(this.f1287e) + this.f1287e.getMeasuredHeight());
            i5 = View.combineMeasuredStates(i5, this.f1287e.getMeasuredState());
        }
        int childCount = getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = getChildAt(i11);
            if (((a1) childAt.getLayoutParams()).f2891b == 0 && t(childAt)) {
                max3 += r(childAt, i, max3, i2, 0, iArr);
                i4 = Math.max(i4, l(childAt) + childAt.getMeasuredHeight());
                i5 = View.combineMeasuredStates(i5, childAt.getMeasuredState());
            }
        }
        int i12 = this.f1298r + this.f1299s;
        int i13 = this.f1296p + this.f1297q;
        if (t(this.f1285b)) {
            r(this.f1285b, i, max3 + i13, i2, i12, iArr);
            int k2 = k(this.f1285b) + this.f1285b.getMeasuredWidth();
            i7 = l(this.f1285b) + this.f1285b.getMeasuredHeight();
            i8 = View.combineMeasuredStates(i5, this.f1285b.getMeasuredState());
            i9 = k2;
        } else {
            i7 = 0;
            i8 = i5;
            i9 = 0;
        }
        if (t(this.f1286c)) {
            i9 = Math.max(i9, r(this.f1286c, i, max3 + i13, i2, i7 + i12, iArr));
            i7 = l(this.f1286c) + this.f1286c.getMeasuredHeight() + i7;
            i8 = View.combineMeasuredStates(i8, this.f1286c.getMeasuredState());
        }
        int max4 = Math.max(i4, i7);
        int paddingRight = getPaddingRight() + getPaddingLeft();
        int paddingBottom = getPaddingBottom() + getPaddingTop() + max4;
        int resolveSizeAndState = View.resolveSizeAndState(Math.max(paddingRight + max3 + i9, getSuggestedMinimumWidth()), i, (-16777216) & i8);
        int resolveSizeAndState2 = View.resolveSizeAndState(Math.max(paddingBottom, getSuggestedMinimumHeight()), i2, i8 << 16);
        if (this.f1279M) {
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
        if (!(parcelable instanceof c1)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        c1 c1Var = (c1) parcelable;
        super.onRestoreInstanceState(c1Var.f714a);
        ActionMenuView actionMenuView = this.f1284a;
        MenuC0161m menuC0161m = actionMenuView != null ? actionMenuView.f1244p : null;
        int i = c1Var.f2897c;
        if (i != 0 && this.f1278L != null && menuC0161m != null && (findItem = menuC0161m.findItem(i)) != null) {
            findItem.expandActionView();
        }
        if (c1Var.d) {
            B b2 = this.f1283Q;
            removeCallbacks(b2);
            post(b2);
        }
    }

    @Override // android.view.View
    public final void onRtlPropertiesChanged(int i) {
        super.onRtlPropertiesChanged(i);
        d();
        P0 p02 = this.f1300t;
        boolean z2 = i == 1;
        if (z2 == p02.f2848g) {
            return;
        }
        p02.f2848g = z2;
        if (!p02.h) {
            p02.f2843a = p02.f2846e;
            p02.f2844b = p02.f2847f;
            return;
        }
        if (z2) {
            int i2 = p02.d;
            if (i2 == Integer.MIN_VALUE) {
                i2 = p02.f2846e;
            }
            p02.f2843a = i2;
            int i3 = p02.f2845c;
            if (i3 == Integer.MIN_VALUE) {
                i3 = p02.f2847f;
            }
            p02.f2844b = i3;
            return;
        }
        int i4 = p02.f2845c;
        if (i4 == Integer.MIN_VALUE) {
            i4 = p02.f2846e;
        }
        p02.f2843a = i4;
        int i5 = p02.d;
        if (i5 == Integer.MIN_VALUE) {
            i5 = p02.f2847f;
        }
        p02.f2844b = i5;
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        C0226k c0226k;
        C0163o c0163o;
        c1 c1Var = new c1(super.onSaveInstanceState());
        Z0 z02 = this.f1278L;
        if (z02 != null && (c0163o = z02.f2884b) != null) {
            c1Var.f2897c = c0163o.f2639a;
        }
        ActionMenuView actionMenuView = this.f1284a;
        c1Var.d = (actionMenuView == null || (c0226k = actionMenuView.f1248t) == null || !c0226k.i()) ? false : true;
        return c1Var;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f1269B = false;
        }
        if (!this.f1269B) {
            boolean onTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !onTouchEvent) {
                this.f1269B = true;
            }
        }
        if (actionMasked == 1 || actionMasked == 3) {
            this.f1269B = false;
        }
        return true;
    }

    public final int p(View view, int i, int i2, int[] iArr) {
        a1 a1Var = (a1) view.getLayoutParams();
        int i3 = ((ViewGroup.MarginLayoutParams) a1Var).leftMargin - iArr[0];
        int max = Math.max(0, i3) + i;
        iArr[0] = Math.max(0, -i3);
        int j2 = j(view, i2);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(max, j2, max + measuredWidth, view.getMeasuredHeight() + j2);
        return measuredWidth + ((ViewGroup.MarginLayoutParams) a1Var).rightMargin + max;
    }

    public final int q(View view, int i, int i2, int[] iArr) {
        a1 a1Var = (a1) view.getLayoutParams();
        int i3 = ((ViewGroup.MarginLayoutParams) a1Var).rightMargin - iArr[1];
        int max = i - Math.max(0, i3);
        iArr[1] = Math.max(0, -i3);
        int j2 = j(view, i2);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(max - measuredWidth, j2, max, view.getMeasuredHeight() + j2);
        return max - (measuredWidth + ((ViewGroup.MarginLayoutParams) a1Var).leftMargin);
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
        if (this.f1282P != z2) {
            this.f1282P = z2;
            u();
        }
    }

    public void setCollapseContentDescription(int i) {
        setCollapseContentDescription(i != 0 ? getContext().getText(i) : null);
    }

    public void setCollapseIcon(int i) {
        setCollapseIcon(d.G(getContext(), i));
    }

    public void setCollapsible(boolean z2) {
        this.f1279M = z2;
        requestLayout();
    }

    public void setContentInsetEndWithActions(int i) {
        if (i < 0) {
            i = Integer.MIN_VALUE;
        }
        if (i != this.f1302v) {
            this.f1302v = i;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setContentInsetStartWithNavigation(int i) {
        if (i < 0) {
            i = Integer.MIN_VALUE;
        }
        if (i != this.f1301u) {
            this.f1301u = i;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setLogo(int i) {
        setLogo(d.G(getContext(), i));
    }

    public void setLogoDescription(int i) {
        setLogoDescription(getContext().getText(i));
    }

    public void setNavigationContentDescription(int i) {
        setNavigationContentDescription(i != 0 ? getContext().getText(i) : null);
    }

    public void setNavigationIcon(int i) {
        setNavigationIcon(d.G(getContext(), i));
    }

    public void setNavigationOnClickListener(View.OnClickListener onClickListener) {
        g();
        this.d.setOnClickListener(onClickListener);
    }

    public void setOnMenuItemClickListener(b1 b1Var) {
    }

    public void setOverflowIcon(Drawable drawable) {
        e();
        this.f1284a.setOverflowIcon(drawable);
    }

    public void setPopupTheme(int i) {
        if (this.f1291k != i) {
            this.f1291k = i;
            if (i == 0) {
                this.f1290j = getContext();
            } else {
                this.f1290j = new ContextThemeWrapper(getContext(), i);
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
        this.f1299s = i;
        requestLayout();
    }

    public void setTitleMarginEnd(int i) {
        this.f1297q = i;
        requestLayout();
    }

    public void setTitleMarginStart(int i) {
        this.f1296p = i;
        requestLayout();
    }

    public void setTitleMarginTop(int i) {
        this.f1298r = i;
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
            OnBackInvokedDispatcher a2 = Y0.a(this);
            Z0 z02 = this.f1278L;
            boolean z2 = (z02 == null || z02.f2884b == null || a2 == null || !isAttachedToWindow() || !this.f1282P) ? false : true;
            if (z2 && this.f1281O == null) {
                if (this.f1280N == null) {
                    this.f1280N = Y0.b(new W0(this, 0));
                }
                Y0.c(a2, this.f1280N);
                this.f1281O = a2;
                return;
            }
            if (z2 || (onBackInvokedDispatcher = this.f1281O) == null) {
                return;
            }
            Y0.d(onBackInvokedDispatcher, this.f1280N);
            this.f1281O = null;
        }
    }

    public Toolbar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, R.attr.toolbarStyle);
        this.f1303w = 8388627;
        this.f1271D = new ArrayList();
        this.f1272E = new ArrayList();
        this.F = new int[2];
        this.f1273G = new C0011l(new W0(this, 1));
        this.f1274H = new ArrayList();
        this.f1275I = new X0(this);
        this.f1283Q = new B(11, this);
        Context context2 = getContext();
        int[] iArr = a.f2009w;
        C0011l r2 = C0011l.r(context2, attributeSet, iArr, R.attr.toolbarStyle);
        S.k(this, context, iArr, attributeSet, (TypedArray) r2.f423c, R.attr.toolbarStyle);
        TypedArray typedArray = (TypedArray) r2.f423c;
        this.f1292l = typedArray.getResourceId(28, 0);
        this.f1293m = typedArray.getResourceId(19, 0);
        this.f1303w = typedArray.getInteger(0, 8388627);
        this.f1294n = typedArray.getInteger(2, 48);
        int dimensionPixelOffset = typedArray.getDimensionPixelOffset(22, 0);
        dimensionPixelOffset = typedArray.hasValue(27) ? typedArray.getDimensionPixelOffset(27, dimensionPixelOffset) : dimensionPixelOffset;
        this.f1299s = dimensionPixelOffset;
        this.f1298r = dimensionPixelOffset;
        this.f1297q = dimensionPixelOffset;
        this.f1296p = dimensionPixelOffset;
        int dimensionPixelOffset2 = typedArray.getDimensionPixelOffset(25, -1);
        if (dimensionPixelOffset2 >= 0) {
            this.f1296p = dimensionPixelOffset2;
        }
        int dimensionPixelOffset3 = typedArray.getDimensionPixelOffset(24, -1);
        if (dimensionPixelOffset3 >= 0) {
            this.f1297q = dimensionPixelOffset3;
        }
        int dimensionPixelOffset4 = typedArray.getDimensionPixelOffset(26, -1);
        if (dimensionPixelOffset4 >= 0) {
            this.f1298r = dimensionPixelOffset4;
        }
        int dimensionPixelOffset5 = typedArray.getDimensionPixelOffset(23, -1);
        if (dimensionPixelOffset5 >= 0) {
            this.f1299s = dimensionPixelOffset5;
        }
        this.f1295o = typedArray.getDimensionPixelSize(13, -1);
        int dimensionPixelOffset6 = typedArray.getDimensionPixelOffset(9, Integer.MIN_VALUE);
        int dimensionPixelOffset7 = typedArray.getDimensionPixelOffset(5, Integer.MIN_VALUE);
        int dimensionPixelSize = typedArray.getDimensionPixelSize(7, 0);
        int dimensionPixelSize2 = typedArray.getDimensionPixelSize(8, 0);
        d();
        P0 p02 = this.f1300t;
        p02.h = false;
        if (dimensionPixelSize != Integer.MIN_VALUE) {
            p02.f2846e = dimensionPixelSize;
            p02.f2843a = dimensionPixelSize;
        }
        if (dimensionPixelSize2 != Integer.MIN_VALUE) {
            p02.f2847f = dimensionPixelSize2;
            p02.f2844b = dimensionPixelSize2;
        }
        if (dimensionPixelOffset6 != Integer.MIN_VALUE || dimensionPixelOffset7 != Integer.MIN_VALUE) {
            p02.a(dimensionPixelOffset6, dimensionPixelOffset7);
        }
        this.f1301u = typedArray.getDimensionPixelOffset(10, Integer.MIN_VALUE);
        this.f1302v = typedArray.getDimensionPixelOffset(6, Integer.MIN_VALUE);
        this.f1288f = r2.h(4);
        this.f1289g = typedArray.getText(3);
        CharSequence text = typedArray.getText(21);
        if (!TextUtils.isEmpty(text)) {
            setTitle(text);
        }
        CharSequence text2 = typedArray.getText(18);
        if (!TextUtils.isEmpty(text2)) {
            setSubtitle(text2);
        }
        this.f1290j = getContext();
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
        a1 a1Var = new a1(context, attributeSet);
        a1Var.f2890a = 0;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a.f1991b);
        a1Var.f2890a = obtainStyledAttributes.getInt(0, 0);
        obtainStyledAttributes.recycle();
        a1Var.f2891b = 0;
        return a1Var;
    }

    public void setCollapseContentDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            c();
        }
        C0254y c0254y = this.h;
        if (c0254y != null) {
            c0254y.setContentDescription(charSequence);
        }
    }

    public void setCollapseIcon(Drawable drawable) {
        if (drawable != null) {
            c();
            this.h.setImageDrawable(drawable);
        } else {
            C0254y c0254y = this.h;
            if (c0254y != null) {
                c0254y.setImageDrawable(this.f1288f);
            }
        }
    }

    public void setLogo(Drawable drawable) {
        if (drawable != null) {
            if (this.f1287e == null) {
                this.f1287e = new C0256z(getContext(), null, 0);
            }
            if (!o(this.f1287e)) {
                b(this.f1287e, true);
            }
        } else {
            C0256z c0256z = this.f1287e;
            if (c0256z != null && o(c0256z)) {
                removeView(this.f1287e);
                this.f1272E.remove(this.f1287e);
            }
        }
        C0256z c0256z2 = this.f1287e;
        if (c0256z2 != null) {
            c0256z2.setImageDrawable(drawable);
        }
    }

    public void setLogoDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence) && this.f1287e == null) {
            this.f1287e = new C0256z(getContext(), null, 0);
        }
        C0256z c0256z = this.f1287e;
        if (c0256z != null) {
            c0256z.setContentDescription(charSequence);
        }
    }

    public void setNavigationContentDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            g();
        }
        C0254y c0254y = this.d;
        if (c0254y != null) {
            c0254y.setContentDescription(charSequence);
            f1.a(this.d, charSequence);
        }
    }

    public void setNavigationIcon(Drawable drawable) {
        if (drawable != null) {
            g();
            if (!o(this.d)) {
                b(this.d, true);
            }
        } else {
            C0254y c0254y = this.d;
            if (c0254y != null && o(c0254y)) {
                removeView(this.d);
                this.f1272E.remove(this.d);
            }
        }
        C0254y c0254y2 = this.d;
        if (c0254y2 != null) {
            c0254y2.setImageDrawable(drawable);
        }
    }

    public void setSubtitle(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            C0213d0 c0213d0 = this.f1286c;
            if (c0213d0 != null && o(c0213d0)) {
                removeView(this.f1286c);
                this.f1272E.remove(this.f1286c);
            }
        } else {
            if (this.f1286c == null) {
                Context context = getContext();
                C0213d0 c0213d02 = new C0213d0(context, null);
                this.f1286c = c0213d02;
                c0213d02.setSingleLine();
                this.f1286c.setEllipsize(TextUtils.TruncateAt.END);
                int i = this.f1293m;
                if (i != 0) {
                    this.f1286c.setTextAppearance(context, i);
                }
                ColorStateList colorStateList = this.f1268A;
                if (colorStateList != null) {
                    this.f1286c.setTextColor(colorStateList);
                }
            }
            if (!o(this.f1286c)) {
                b(this.f1286c, true);
            }
        }
        C0213d0 c0213d03 = this.f1286c;
        if (c0213d03 != null) {
            c0213d03.setText(charSequence);
        }
        this.f1305y = charSequence;
    }

    public void setSubtitleTextColor(ColorStateList colorStateList) {
        this.f1268A = colorStateList;
        C0213d0 c0213d0 = this.f1286c;
        if (c0213d0 != null) {
            c0213d0.setTextColor(colorStateList);
        }
    }

    public void setTitle(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            C0213d0 c0213d0 = this.f1285b;
            if (c0213d0 != null && o(c0213d0)) {
                removeView(this.f1285b);
                this.f1272E.remove(this.f1285b);
            }
        } else {
            if (this.f1285b == null) {
                Context context = getContext();
                C0213d0 c0213d02 = new C0213d0(context, null);
                this.f1285b = c0213d02;
                c0213d02.setSingleLine();
                this.f1285b.setEllipsize(TextUtils.TruncateAt.END);
                int i = this.f1292l;
                if (i != 0) {
                    this.f1285b.setTextAppearance(context, i);
                }
                ColorStateList colorStateList = this.f1306z;
                if (colorStateList != null) {
                    this.f1285b.setTextColor(colorStateList);
                }
            }
            if (!o(this.f1285b)) {
                b(this.f1285b, true);
            }
        }
        C0213d0 c0213d03 = this.f1285b;
        if (c0213d03 != null) {
            c0213d03.setText(charSequence);
        }
        this.f1304x = charSequence;
    }

    public void setTitleTextColor(ColorStateList colorStateList) {
        this.f1306z = colorStateList;
        C0213d0 c0213d0 = this.f1285b;
        if (c0213d0 != null) {
            c0213d0.setTextColor(colorStateList);
        }
    }
}
