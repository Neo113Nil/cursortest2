package androidx.appcompat.widget;

import B6.e;
import D0.j;
import I.C0119o;
import I.InterfaceC0120p;
import I.T;
import O6.g;
import P0.f;
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
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import androidx.fragment.app.I;
import com.icefishing.icefish.ice.fishing.s294s.R;
import h.AbstractC0454a;
import i.C0511M;
import i.ViewOnClickListenerC0516c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;
import m.m;
import m.o;
import n.C0703c0;
import n.C0716j;
import n.C0741w;
import n.C0743x;
import n.InterfaceC0725n0;
import n.S0;
import n.l1;
import n.m1;
import n.n1;
import n.o1;
import n.p1;
import n.q1;
import n.s1;
import n.z1;

/* loaded from: classes.dex */
public class Toolbar extends ViewGroup {

    /* renamed from: A, reason: collision with root package name */
    public int f3307A;

    /* renamed from: B, reason: collision with root package name */
    public S0 f3308B;

    /* renamed from: C, reason: collision with root package name */
    public int f3309C;

    /* renamed from: D, reason: collision with root package name */
    public int f3310D;

    /* renamed from: E, reason: collision with root package name */
    public final int f3311E;

    /* renamed from: F, reason: collision with root package name */
    public CharSequence f3312F;

    /* renamed from: G, reason: collision with root package name */
    public CharSequence f3313G;

    /* renamed from: H, reason: collision with root package name */
    public ColorStateList f3314H;

    /* renamed from: I, reason: collision with root package name */
    public ColorStateList f3315I;

    /* renamed from: J, reason: collision with root package name */
    public boolean f3316J;

    /* renamed from: K, reason: collision with root package name */
    public boolean f3317K;

    /* renamed from: L, reason: collision with root package name */
    public final ArrayList f3318L;

    /* renamed from: M, reason: collision with root package name */
    public final ArrayList f3319M;

    /* renamed from: N, reason: collision with root package name */
    public final int[] f3320N;

    /* renamed from: O, reason: collision with root package name */
    public final C0119o f3321O;

    /* renamed from: P, reason: collision with root package name */
    public ArrayList f3322P;
    public p1 Q;

    /* renamed from: R, reason: collision with root package name */
    public final l4.b f3323R;

    /* renamed from: S, reason: collision with root package name */
    public s1 f3324S;

    /* renamed from: T, reason: collision with root package name */
    public C0716j f3325T;

    /* renamed from: U, reason: collision with root package name */
    public n1 f3326U;

    /* renamed from: V, reason: collision with root package name */
    public e f3327V;

    /* renamed from: W, reason: collision with root package name */
    public l2.c f3328W;

    /* renamed from: a0, reason: collision with root package name */
    public boolean f3329a0;

    /* renamed from: b0, reason: collision with root package name */
    public OnBackInvokedCallback f3330b0;

    /* renamed from: c0, reason: collision with root package name */
    public OnBackInvokedDispatcher f3331c0;

    /* renamed from: d, reason: collision with root package name */
    public ActionMenuView f3332d;

    /* renamed from: d0, reason: collision with root package name */
    public boolean f3333d0;

    /* renamed from: e, reason: collision with root package name */
    public C0703c0 f3334e;

    /* renamed from: e0, reason: collision with root package name */
    public final F.b f3335e0;

    /* renamed from: i, reason: collision with root package name */
    public C0703c0 f3336i;

    /* renamed from: l, reason: collision with root package name */
    public C0741w f3337l;

    /* renamed from: m, reason: collision with root package name */
    public C0743x f3338m;

    /* renamed from: n, reason: collision with root package name */
    public final Drawable f3339n;

    /* renamed from: o, reason: collision with root package name */
    public final CharSequence f3340o;

    /* renamed from: p, reason: collision with root package name */
    public C0741w f3341p;

    /* renamed from: q, reason: collision with root package name */
    public View f3342q;

    /* renamed from: r, reason: collision with root package name */
    public Context f3343r;

    /* renamed from: s, reason: collision with root package name */
    public int f3344s;

    /* renamed from: t, reason: collision with root package name */
    public int f3345t;

    /* renamed from: u, reason: collision with root package name */
    public int f3346u;

    /* renamed from: v, reason: collision with root package name */
    public final int f3347v;

    /* renamed from: w, reason: collision with root package name */
    public final int f3348w;

    /* renamed from: x, reason: collision with root package name */
    public int f3349x;

    /* renamed from: y, reason: collision with root package name */
    public int f3350y;

    /* renamed from: z, reason: collision with root package name */
    public int f3351z;

    public Toolbar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.toolbarStyle);
        this.f3311E = 8388627;
        this.f3318L = new ArrayList();
        this.f3319M = new ArrayList();
        this.f3320N = new int[2];
        this.f3321O = new C0119o(new l1(this, 1));
        this.f3322P = new ArrayList();
        this.f3323R = new l4.b(4, this);
        this.f3335e0 = new F.b(18, this);
        Context context2 = getContext();
        int[] iArr = AbstractC0454a.f5060y;
        j R4 = j.R(context2, attributeSet, iArr, R.attr.toolbarStyle);
        T.h(this, context, iArr, attributeSet, (TypedArray) R4.f331i, R.attr.toolbarStyle);
        TypedArray typedArray = (TypedArray) R4.f331i;
        this.f3345t = typedArray.getResourceId(28, 0);
        this.f3346u = typedArray.getResourceId(19, 0);
        this.f3311E = typedArray.getInteger(0, 8388627);
        this.f3347v = typedArray.getInteger(2, 48);
        int dimensionPixelOffset = typedArray.getDimensionPixelOffset(22, 0);
        dimensionPixelOffset = typedArray.hasValue(27) ? typedArray.getDimensionPixelOffset(27, dimensionPixelOffset) : dimensionPixelOffset;
        this.f3307A = dimensionPixelOffset;
        this.f3351z = dimensionPixelOffset;
        this.f3350y = dimensionPixelOffset;
        this.f3349x = dimensionPixelOffset;
        int dimensionPixelOffset2 = typedArray.getDimensionPixelOffset(25, -1);
        if (dimensionPixelOffset2 >= 0) {
            this.f3349x = dimensionPixelOffset2;
        }
        int dimensionPixelOffset3 = typedArray.getDimensionPixelOffset(24, -1);
        if (dimensionPixelOffset3 >= 0) {
            this.f3350y = dimensionPixelOffset3;
        }
        int dimensionPixelOffset4 = typedArray.getDimensionPixelOffset(26, -1);
        if (dimensionPixelOffset4 >= 0) {
            this.f3351z = dimensionPixelOffset4;
        }
        int dimensionPixelOffset5 = typedArray.getDimensionPixelOffset(23, -1);
        if (dimensionPixelOffset5 >= 0) {
            this.f3307A = dimensionPixelOffset5;
        }
        this.f3348w = typedArray.getDimensionPixelSize(13, -1);
        int dimensionPixelOffset6 = typedArray.getDimensionPixelOffset(9, Integer.MIN_VALUE);
        int dimensionPixelOffset7 = typedArray.getDimensionPixelOffset(5, Integer.MIN_VALUE);
        int dimensionPixelSize = typedArray.getDimensionPixelSize(7, 0);
        int dimensionPixelSize2 = typedArray.getDimensionPixelSize(8, 0);
        d();
        S0 s02 = this.f3308B;
        s02.f6714h = false;
        if (dimensionPixelSize != Integer.MIN_VALUE) {
            s02.f6711e = dimensionPixelSize;
            s02.f6707a = dimensionPixelSize;
        }
        if (dimensionPixelSize2 != Integer.MIN_VALUE) {
            s02.f6712f = dimensionPixelSize2;
            s02.f6708b = dimensionPixelSize2;
        }
        if (dimensionPixelOffset6 != Integer.MIN_VALUE || dimensionPixelOffset7 != Integer.MIN_VALUE) {
            s02.a(dimensionPixelOffset6, dimensionPixelOffset7);
        }
        this.f3309C = typedArray.getDimensionPixelOffset(10, Integer.MIN_VALUE);
        this.f3310D = typedArray.getDimensionPixelOffset(6, Integer.MIN_VALUE);
        this.f3339n = R4.J(4);
        this.f3340o = typedArray.getText(3);
        CharSequence text = typedArray.getText(21);
        if (!TextUtils.isEmpty(text)) {
            setTitle(text);
        }
        CharSequence text2 = typedArray.getText(18);
        if (!TextUtils.isEmpty(text2)) {
            setSubtitle(text2);
        }
        this.f3343r = getContext();
        setPopupTheme(typedArray.getResourceId(17, 0));
        Drawable J7 = R4.J(16);
        if (J7 != null) {
            setNavigationIcon(J7);
        }
        CharSequence text3 = typedArray.getText(15);
        if (!TextUtils.isEmpty(text3)) {
            setNavigationContentDescription(text3);
        }
        Drawable J8 = R4.J(11);
        if (J8 != null) {
            setLogo(J8);
        }
        CharSequence text4 = typedArray.getText(12);
        if (!TextUtils.isEmpty(text4)) {
            setLogoDescription(text4);
        }
        if (typedArray.hasValue(29)) {
            setTitleTextColor(R4.I(29));
        }
        if (typedArray.hasValue(20)) {
            setSubtitleTextColor(R4.I(20));
        }
        if (typedArray.hasValue(14)) {
            getMenuInflater().inflate(typedArray.getResourceId(14, 0), getMenu());
        }
        R4.W();
    }

    private ArrayList<MenuItem> getCurrentMenuItems() {
        ArrayList<MenuItem> arrayList = new ArrayList<>();
        Menu menu = getMenu();
        for (int i2 = 0; i2 < menu.size(); i2++) {
            arrayList.add(menu.getItem(i2));
        }
        return arrayList;
    }

    private MenuInflater getMenuInflater() {
        return new l.j(getContext());
    }

    public static o1 h() {
        o1 o1Var = new o1(-2, -2);
        o1Var.f6860b = 0;
        o1Var.f6859a = 8388627;
        return o1Var;
    }

    public static o1 i(ViewGroup.LayoutParams layoutParams) {
        boolean z7 = layoutParams instanceof o1;
        if (z7) {
            o1 o1Var = (o1) layoutParams;
            o1 o1Var2 = new o1(o1Var);
            o1Var2.f6860b = 0;
            o1Var2.f6860b = o1Var.f6860b;
            return o1Var2;
        }
        if (z7) {
            o1 o1Var3 = new o1((o1) layoutParams);
            o1Var3.f6860b = 0;
            return o1Var3;
        }
        if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
            o1 o1Var4 = new o1(layoutParams);
            o1Var4.f6860b = 0;
            return o1Var4;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        o1 o1Var5 = new o1(marginLayoutParams);
        o1Var5.f6860b = 0;
        ((ViewGroup.MarginLayoutParams) o1Var5).leftMargin = marginLayoutParams.leftMargin;
        ((ViewGroup.MarginLayoutParams) o1Var5).topMargin = marginLayoutParams.topMargin;
        ((ViewGroup.MarginLayoutParams) o1Var5).rightMargin = marginLayoutParams.rightMargin;
        ((ViewGroup.MarginLayoutParams) o1Var5).bottomMargin = marginLayoutParams.bottomMargin;
        return o1Var5;
    }

    public static int k(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return marginLayoutParams.getMarginEnd() + marginLayoutParams.getMarginStart();
    }

    public static int l(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
    }

    public final void a(ArrayList arrayList, int i2) {
        WeakHashMap weakHashMap = T.f1153a;
        boolean z7 = getLayoutDirection() == 1;
        int childCount = getChildCount();
        int absoluteGravity = Gravity.getAbsoluteGravity(i2, getLayoutDirection());
        arrayList.clear();
        if (!z7) {
            for (int i5 = 0; i5 < childCount; i5++) {
                View childAt = getChildAt(i5);
                o1 o1Var = (o1) childAt.getLayoutParams();
                if (o1Var.f6860b == 0 && t(childAt)) {
                    int i7 = o1Var.f6859a;
                    WeakHashMap weakHashMap2 = T.f1153a;
                    int layoutDirection = getLayoutDirection();
                    int absoluteGravity2 = Gravity.getAbsoluteGravity(i7, layoutDirection) & 7;
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
        for (int i8 = childCount - 1; i8 >= 0; i8--) {
            View childAt2 = getChildAt(i8);
            o1 o1Var2 = (o1) childAt2.getLayoutParams();
            if (o1Var2.f6860b == 0 && t(childAt2)) {
                int i9 = o1Var2.f6859a;
                WeakHashMap weakHashMap3 = T.f1153a;
                int layoutDirection2 = getLayoutDirection();
                int absoluteGravity3 = Gravity.getAbsoluteGravity(i9, layoutDirection2) & 7;
                if (absoluteGravity3 != 1 && absoluteGravity3 != 3 && absoluteGravity3 != 5) {
                    absoluteGravity3 = layoutDirection2 == 1 ? 5 : 3;
                }
                if (absoluteGravity3 == absoluteGravity) {
                    arrayList.add(childAt2);
                }
            }
        }
    }

    public final void b(View view, boolean z7) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        o1 h7 = layoutParams == null ? h() : !checkLayoutParams(layoutParams) ? i(layoutParams) : (o1) layoutParams;
        h7.f6860b = 1;
        if (!z7 || this.f3342q == null) {
            addView(view, h7);
        } else {
            view.setLayoutParams(h7);
            this.f3319M.add(view);
        }
    }

    public final void c() {
        if (this.f3341p == null) {
            C0741w c0741w = new C0741w(getContext(), null, R.attr.toolbarNavigationButtonStyle);
            this.f3341p = c0741w;
            c0741w.setImageDrawable(this.f3339n);
            this.f3341p.setContentDescription(this.f3340o);
            o1 h7 = h();
            h7.f6859a = (this.f3347v & 112) | 8388611;
            h7.f6860b = 2;
            this.f3341p.setLayoutParams(h7);
            this.f3341p.setOnClickListener(new ViewOnClickListenerC0516c(2, this));
        }
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return super.checkLayoutParams(layoutParams) && (layoutParams instanceof o1);
    }

    public final void d() {
        if (this.f3308B == null) {
            S0 s02 = new S0();
            s02.f6707a = 0;
            s02.f6708b = 0;
            s02.f6709c = Integer.MIN_VALUE;
            s02.f6710d = Integer.MIN_VALUE;
            s02.f6711e = 0;
            s02.f6712f = 0;
            s02.f6713g = false;
            s02.f6714h = false;
            this.f3308B = s02;
        }
    }

    public final void e() {
        f();
        ActionMenuView actionMenuView = this.f3332d;
        if (actionMenuView.f3204x == null) {
            m mVar = (m) actionMenuView.getMenu();
            if (this.f3326U == null) {
                this.f3326U = new n1(this);
            }
            this.f3332d.setExpandedActionViewsExclusive(true);
            mVar.b(this.f3326U, this.f3343r);
            v();
        }
    }

    public final void f() {
        if (this.f3332d == null) {
            ActionMenuView actionMenuView = new ActionMenuView(getContext(), null);
            this.f3332d = actionMenuView;
            actionMenuView.setPopupTheme(this.f3344s);
            this.f3332d.setOnMenuItemClickListener(this.f3323R);
            ActionMenuView actionMenuView2 = this.f3332d;
            e eVar = this.f3327V;
            C0511M c0511m = new C0511M(8, this);
            actionMenuView2.f3197C = eVar;
            actionMenuView2.f3198D = c0511m;
            o1 h7 = h();
            h7.f6859a = (this.f3347v & 112) | 8388613;
            this.f3332d.setLayoutParams(h7);
            b(this.f3332d, false);
        }
    }

    public final void g() {
        if (this.f3337l == null) {
            this.f3337l = new C0741w(getContext(), null, R.attr.toolbarNavigationButtonStyle);
            o1 h7 = h();
            h7.f6859a = (this.f3347v & 112) | 8388611;
            this.f3337l.setLayoutParams(h7);
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
        C0741w c0741w = this.f3341p;
        if (c0741w != null) {
            return c0741w.getContentDescription();
        }
        return null;
    }

    public Drawable getCollapseIcon() {
        C0741w c0741w = this.f3341p;
        if (c0741w != null) {
            return c0741w.getDrawable();
        }
        return null;
    }

    public int getContentInsetEnd() {
        S0 s02 = this.f3308B;
        if (s02 != null) {
            return s02.f6713g ? s02.f6707a : s02.f6708b;
        }
        return 0;
    }

    public int getContentInsetEndWithActions() {
        int i2 = this.f3310D;
        return i2 != Integer.MIN_VALUE ? i2 : getContentInsetEnd();
    }

    public int getContentInsetLeft() {
        S0 s02 = this.f3308B;
        if (s02 != null) {
            return s02.f6707a;
        }
        return 0;
    }

    public int getContentInsetRight() {
        S0 s02 = this.f3308B;
        if (s02 != null) {
            return s02.f6708b;
        }
        return 0;
    }

    public int getContentInsetStart() {
        S0 s02 = this.f3308B;
        if (s02 != null) {
            return s02.f6713g ? s02.f6708b : s02.f6707a;
        }
        return 0;
    }

    public int getContentInsetStartWithNavigation() {
        int i2 = this.f3309C;
        return i2 != Integer.MIN_VALUE ? i2 : getContentInsetStart();
    }

    public int getCurrentContentInsetEnd() {
        m mVar;
        ActionMenuView actionMenuView = this.f3332d;
        return (actionMenuView == null || (mVar = actionMenuView.f3204x) == null || !mVar.hasVisibleItems()) ? getContentInsetEnd() : Math.max(getContentInsetEnd(), Math.max(this.f3310D, 0));
    }

    public int getCurrentContentInsetLeft() {
        WeakHashMap weakHashMap = T.f1153a;
        return getLayoutDirection() == 1 ? getCurrentContentInsetEnd() : getCurrentContentInsetStart();
    }

    public int getCurrentContentInsetRight() {
        WeakHashMap weakHashMap = T.f1153a;
        return getLayoutDirection() == 1 ? getCurrentContentInsetStart() : getCurrentContentInsetEnd();
    }

    public int getCurrentContentInsetStart() {
        return getNavigationIcon() != null ? Math.max(getContentInsetStart(), Math.max(this.f3309C, 0)) : getContentInsetStart();
    }

    public Drawable getLogo() {
        C0743x c0743x = this.f3338m;
        if (c0743x != null) {
            return c0743x.getDrawable();
        }
        return null;
    }

    public CharSequence getLogoDescription() {
        C0743x c0743x = this.f3338m;
        if (c0743x != null) {
            return c0743x.getContentDescription();
        }
        return null;
    }

    public Menu getMenu() {
        e();
        return this.f3332d.getMenu();
    }

    public View getNavButtonView() {
        return this.f3337l;
    }

    public CharSequence getNavigationContentDescription() {
        C0741w c0741w = this.f3337l;
        if (c0741w != null) {
            return c0741w.getContentDescription();
        }
        return null;
    }

    public Drawable getNavigationIcon() {
        C0741w c0741w = this.f3337l;
        if (c0741w != null) {
            return c0741w.getDrawable();
        }
        return null;
    }

    public C0716j getOuterActionMenuPresenter() {
        return this.f3325T;
    }

    public Drawable getOverflowIcon() {
        e();
        return this.f3332d.getOverflowIcon();
    }

    public Context getPopupContext() {
        return this.f3343r;
    }

    public int getPopupTheme() {
        return this.f3344s;
    }

    public CharSequence getSubtitle() {
        return this.f3313G;
    }

    public final TextView getSubtitleTextView() {
        return this.f3336i;
    }

    public CharSequence getTitle() {
        return this.f3312F;
    }

    public int getTitleMarginBottom() {
        return this.f3307A;
    }

    public int getTitleMarginEnd() {
        return this.f3350y;
    }

    public int getTitleMarginStart() {
        return this.f3349x;
    }

    public int getTitleMarginTop() {
        return this.f3351z;
    }

    public final TextView getTitleTextView() {
        return this.f3334e;
    }

    public InterfaceC0725n0 getWrapper() {
        if (this.f3324S == null) {
            this.f3324S = new s1(this, true);
        }
        return this.f3324S;
    }

    public final int j(View view, int i2) {
        o1 o1Var = (o1) view.getLayoutParams();
        int measuredHeight = view.getMeasuredHeight();
        int i5 = i2 > 0 ? (measuredHeight - i2) / 2 : 0;
        int i7 = o1Var.f6859a & 112;
        if (i7 != 16 && i7 != 48 && i7 != 80) {
            i7 = this.f3311E & 112;
        }
        if (i7 == 48) {
            return getPaddingTop() - i5;
        }
        if (i7 == 80) {
            return (((getHeight() - getPaddingBottom()) - measuredHeight) - ((ViewGroup.MarginLayoutParams) o1Var).bottomMargin) - i5;
        }
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int height = getHeight();
        int i8 = (((height - paddingTop) - paddingBottom) - measuredHeight) / 2;
        int i9 = ((ViewGroup.MarginLayoutParams) o1Var).topMargin;
        if (i8 < i9) {
            i8 = i9;
        } else {
            int i10 = (((height - paddingBottom) - measuredHeight) - i8) - paddingTop;
            int i11 = ((ViewGroup.MarginLayoutParams) o1Var).bottomMargin;
            if (i10 < i11) {
                i8 = Math.max(0, i8 - (i11 - i10));
            }
        }
        return paddingTop + i8;
    }

    public final void m() {
        ArrayList arrayList = this.f3322P;
        int size = arrayList.size();
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList.get(i2);
            i2++;
            getMenu().removeItem(((MenuItem) obj).getItemId());
        }
        getMenu();
        ArrayList<MenuItem> currentMenuItems = getCurrentMenuItems();
        getMenuInflater();
        Iterator it = this.f3321O.f1226b.iterator();
        while (it.hasNext()) {
            ((I) ((InterfaceC0120p) it.next())).f3588a.k();
        }
        ArrayList<MenuItem> currentMenuItems2 = getCurrentMenuItems();
        currentMenuItems2.removeAll(currentMenuItems);
        this.f3322P = currentMenuItems2;
    }

    public final boolean n(View view) {
        return view.getParent() == this || this.f3319M.contains(view);
    }

    public final boolean o() {
        C0716j c0716j;
        ActionMenuView actionMenuView = this.f3332d;
        return (actionMenuView == null || (c0716j = actionMenuView.f3196B) == null || !c0716j.e()) ? false : true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        v();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeCallbacks(this.f3335e0);
        v();
    }

    @Override // android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.f3317K = false;
        }
        if (!this.f3317K) {
            boolean onHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !onHoverEvent) {
                this.f3317K = true;
            }
        }
        if (actionMasked != 10 && actionMasked != 3) {
            return true;
        }
        this.f3317K = false;
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
    public final void onLayout(boolean z7, int i2, int i5, int i7, int i8) {
        int i9;
        int i10;
        int max;
        boolean t6;
        boolean t7;
        boolean z8;
        int i11;
        int i12;
        int paddingTop;
        int i13;
        int i14;
        int i15;
        int i16;
        int size;
        int i17;
        int i18;
        int size2;
        int i19;
        int size3;
        int i20;
        int i21;
        int i22;
        int size4;
        WeakHashMap weakHashMap = T.f1153a;
        boolean z9 = getLayoutDirection() == 1;
        int width = getWidth();
        int height = getHeight();
        int paddingLeft = getPaddingLeft();
        int paddingRight = getPaddingRight();
        int paddingTop2 = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int i23 = width - paddingRight;
        int[] iArr = this.f3320N;
        iArr[1] = 0;
        iArr[0] = 0;
        int minimumHeight = getMinimumHeight();
        int min = minimumHeight >= 0 ? Math.min(minimumHeight, i8 - i5) : 0;
        if (!t(this.f3337l)) {
            i9 = paddingLeft;
        } else {
            if (z9) {
                i10 = q(this.f3337l, i23, min, iArr);
                i9 = paddingLeft;
                if (t(this.f3341p)) {
                    if (z9) {
                        i10 = q(this.f3341p, i10, min, iArr);
                    } else {
                        i9 = p(this.f3341p, i9, min, iArr);
                    }
                }
                if (t(this.f3332d)) {
                    if (z9) {
                        i9 = p(this.f3332d, i9, min, iArr);
                    } else {
                        i10 = q(this.f3332d, i10, min, iArr);
                    }
                }
                int currentContentInsetLeft = getCurrentContentInsetLeft();
                int currentContentInsetRight = getCurrentContentInsetRight();
                iArr[0] = Math.max(0, currentContentInsetLeft - i9);
                iArr[1] = Math.max(0, currentContentInsetRight - (i23 - i10));
                max = Math.max(i9, currentContentInsetLeft);
                int min2 = Math.min(i10, i23 - currentContentInsetRight);
                if (t(this.f3342q)) {
                    if (z9) {
                        min2 = q(this.f3342q, min2, min, iArr);
                    } else {
                        max = p(this.f3342q, max, min, iArr);
                    }
                }
                if (t(this.f3338m)) {
                    if (z9) {
                        min2 = q(this.f3338m, min2, min, iArr);
                    } else {
                        max = p(this.f3338m, max, min, iArr);
                    }
                }
                t6 = t(this.f3334e);
                t7 = t(this.f3336i);
                if (t6) {
                    z8 = z9;
                    i11 = 0;
                } else {
                    o1 o1Var = (o1) this.f3334e.getLayoutParams();
                    z8 = z9;
                    i11 = this.f3334e.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) o1Var).topMargin + ((ViewGroup.MarginLayoutParams) o1Var).bottomMargin;
                }
                if (!t7) {
                    o1 o1Var2 = (o1) this.f3336i.getLayoutParams();
                    i11 = this.f3336i.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) o1Var2).topMargin + ((ViewGroup.MarginLayoutParams) o1Var2).bottomMargin + i11;
                }
                if (!t6 || t7) {
                    C0703c0 c0703c0 = !t6 ? this.f3334e : this.f3336i;
                    C0703c0 c0703c02 = !t7 ? this.f3336i : this.f3334e;
                    o1 o1Var3 = (o1) c0703c0.getLayoutParams();
                    o1 o1Var4 = (o1) c0703c02.getLayoutParams();
                    int i24 = i11;
                    boolean z10 = (!t6 && this.f3334e.getMeasuredWidth() > 0) || (t7 && this.f3336i.getMeasuredWidth() > 0);
                    i12 = this.f3311E & 112;
                    int i25 = max;
                    if (i12 != 48) {
                        paddingTop = getPaddingTop() + ((ViewGroup.MarginLayoutParams) o1Var3).topMargin + this.f3351z;
                    } else if (i12 != 80) {
                        int i26 = (((height - paddingTop2) - paddingBottom) - i24) / 2;
                        int i27 = ((ViewGroup.MarginLayoutParams) o1Var3).topMargin + this.f3351z;
                        if (i26 < i27) {
                            i26 = i27;
                        } else {
                            int i28 = (((height - paddingBottom) - i24) - i26) - paddingTop2;
                            int i29 = ((ViewGroup.MarginLayoutParams) o1Var3).bottomMargin;
                            int i30 = this.f3307A;
                            if (i28 < i29 + i30) {
                                i26 = Math.max(0, i26 - ((((ViewGroup.MarginLayoutParams) o1Var4).bottomMargin + i30) - i28));
                            }
                        }
                        paddingTop = paddingTop2 + i26;
                    } else {
                        paddingTop = (((height - paddingBottom) - ((ViewGroup.MarginLayoutParams) o1Var4).bottomMargin) - this.f3307A) - i24;
                    }
                    if (z8) {
                        int i31 = (z10 ? this.f3349x : 0) - iArr[0];
                        max = Math.max(0, i31) + i25;
                        iArr[0] = Math.max(0, -i31);
                        if (t6) {
                            o1 o1Var5 = (o1) this.f3334e.getLayoutParams();
                            int measuredWidth = this.f3334e.getMeasuredWidth() + max;
                            int measuredHeight = this.f3334e.getMeasuredHeight() + paddingTop;
                            this.f3334e.layout(max, paddingTop, measuredWidth, measuredHeight);
                            i13 = measuredWidth + this.f3350y;
                            paddingTop = measuredHeight + ((ViewGroup.MarginLayoutParams) o1Var5).bottomMargin;
                        } else {
                            i13 = max;
                        }
                        if (t7) {
                            int i32 = paddingTop + ((ViewGroup.MarginLayoutParams) ((o1) this.f3336i.getLayoutParams())).topMargin;
                            int measuredWidth2 = this.f3336i.getMeasuredWidth() + max;
                            this.f3336i.layout(max, i32, measuredWidth2, this.f3336i.getMeasuredHeight() + i32);
                            i14 = measuredWidth2 + this.f3350y;
                        } else {
                            i14 = max;
                        }
                        if (z10) {
                            max = Math.max(i13, i14);
                        }
                    } else {
                        int i33 = (z10 ? this.f3349x : 0) - iArr[1];
                        min2 -= Math.max(0, i33);
                        iArr[1] = Math.max(0, -i33);
                        if (t6) {
                            o1 o1Var6 = (o1) this.f3334e.getLayoutParams();
                            int measuredWidth3 = min2 - this.f3334e.getMeasuredWidth();
                            int measuredHeight2 = this.f3334e.getMeasuredHeight() + paddingTop;
                            this.f3334e.layout(measuredWidth3, paddingTop, min2, measuredHeight2);
                            i15 = measuredWidth3 - this.f3350y;
                            paddingTop = measuredHeight2 + ((ViewGroup.MarginLayoutParams) o1Var6).bottomMargin;
                        } else {
                            i15 = min2;
                        }
                        if (t7) {
                            int i34 = paddingTop + ((ViewGroup.MarginLayoutParams) ((o1) this.f3336i.getLayoutParams())).topMargin;
                            this.f3336i.layout(min2 - this.f3336i.getMeasuredWidth(), i34, min2, this.f3336i.getMeasuredHeight() + i34);
                            i16 = min2 - this.f3350y;
                        } else {
                            i16 = min2;
                        }
                        if (z10) {
                            min2 = Math.min(i15, i16);
                        }
                        max = i25;
                    }
                }
                ArrayList arrayList = this.f3318L;
                a(arrayList, 3);
                size = arrayList.size();
                i17 = max;
                for (i18 = 0; i18 < size; i18++) {
                    i17 = p((View) arrayList.get(i18), i17, min, iArr);
                }
                a(arrayList, 5);
                size2 = arrayList.size();
                for (i19 = 0; i19 < size2; i19++) {
                    min2 = q((View) arrayList.get(i19), min2, min, iArr);
                }
                a(arrayList, 1);
                int i35 = iArr[0];
                int i36 = iArr[1];
                size3 = arrayList.size();
                int i37 = i35;
                i20 = 0;
                int i38 = 0;
                while (i20 < size3) {
                    View view = (View) arrayList.get(i20);
                    o1 o1Var7 = (o1) view.getLayoutParams();
                    int i39 = i36;
                    int i40 = ((ViewGroup.MarginLayoutParams) o1Var7).leftMargin - i37;
                    int i41 = ((ViewGroup.MarginLayoutParams) o1Var7).rightMargin - i39;
                    int max2 = Math.max(0, i40);
                    int max3 = Math.max(0, i41);
                    int max4 = Math.max(0, -i40);
                    int max5 = Math.max(0, -i41);
                    i38 += view.getMeasuredWidth() + max2 + max3;
                    i20++;
                    i37 = max4;
                    i36 = max5;
                }
                i22 = ((((width - paddingLeft) - paddingRight) / 2) + paddingLeft) - (i38 / 2);
                int i42 = i38 + i22;
                if (i22 >= i17) {
                    i17 = i42 > min2 ? i22 - (i42 - min2) : i22;
                }
                size4 = arrayList.size();
                for (i21 = 0; i21 < size4; i21++) {
                    i17 = p((View) arrayList.get(i21), i17, min, iArr);
                }
                arrayList.clear();
            }
            i9 = p(this.f3337l, paddingLeft, min, iArr);
        }
        i10 = i23;
        if (t(this.f3341p)) {
        }
        if (t(this.f3332d)) {
        }
        int currentContentInsetLeft2 = getCurrentContentInsetLeft();
        int currentContentInsetRight2 = getCurrentContentInsetRight();
        iArr[0] = Math.max(0, currentContentInsetLeft2 - i9);
        iArr[1] = Math.max(0, currentContentInsetRight2 - (i23 - i10));
        max = Math.max(i9, currentContentInsetLeft2);
        int min22 = Math.min(i10, i23 - currentContentInsetRight2);
        if (t(this.f3342q)) {
        }
        if (t(this.f3338m)) {
        }
        t6 = t(this.f3334e);
        t7 = t(this.f3336i);
        if (t6) {
        }
        if (!t7) {
        }
        if (!t6) {
        }
        if (!t6) {
        }
        if (!t7) {
        }
        o1 o1Var32 = (o1) c0703c0.getLayoutParams();
        o1 o1Var42 = (o1) c0703c02.getLayoutParams();
        int i242 = i11;
        if (t6) {
        }
        i12 = this.f3311E & 112;
        int i252 = max;
        if (i12 != 48) {
        }
        if (z8) {
        }
        ArrayList arrayList2 = this.f3318L;
        a(arrayList2, 3);
        size = arrayList2.size();
        i17 = max;
        while (i18 < size) {
        }
        a(arrayList2, 5);
        size2 = arrayList2.size();
        while (i19 < size2) {
        }
        a(arrayList2, 1);
        int i352 = iArr[0];
        int i362 = iArr[1];
        size3 = arrayList2.size();
        int i372 = i352;
        i20 = 0;
        int i382 = 0;
        while (i20 < size3) {
        }
        i22 = ((((width - paddingLeft) - paddingRight) / 2) + paddingLeft) - (i382 / 2);
        int i422 = i382 + i22;
        if (i22 >= i17) {
        }
        size4 = arrayList2.size();
        while (i21 < size4) {
        }
        arrayList2.clear();
    }

    @Override // android.view.View
    public final void onMeasure(int i2, int i5) {
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        boolean a7 = z1.a(this);
        int i14 = !a7 ? 1 : 0;
        int i15 = 0;
        if (t(this.f3337l)) {
            s(this.f3337l, i2, 0, i5, this.f3348w);
            i7 = k(this.f3337l) + this.f3337l.getMeasuredWidth();
            i8 = Math.max(0, l(this.f3337l) + this.f3337l.getMeasuredHeight());
            i9 = View.combineMeasuredStates(0, this.f3337l.getMeasuredState());
        } else {
            i7 = 0;
            i8 = 0;
            i9 = 0;
        }
        if (t(this.f3341p)) {
            s(this.f3341p, i2, 0, i5, this.f3348w);
            i7 = k(this.f3341p) + this.f3341p.getMeasuredWidth();
            i8 = Math.max(i8, l(this.f3341p) + this.f3341p.getMeasuredHeight());
            i9 = View.combineMeasuredStates(i9, this.f3341p.getMeasuredState());
        }
        int currentContentInsetStart = getCurrentContentInsetStart();
        int max = Math.max(currentContentInsetStart, i7);
        int max2 = Math.max(0, currentContentInsetStart - i7);
        int[] iArr = this.f3320N;
        iArr[a7 ? 1 : 0] = max2;
        if (t(this.f3332d)) {
            s(this.f3332d, i2, max, i5, this.f3348w);
            i10 = k(this.f3332d) + this.f3332d.getMeasuredWidth();
            i8 = Math.max(i8, l(this.f3332d) + this.f3332d.getMeasuredHeight());
            i9 = View.combineMeasuredStates(i9, this.f3332d.getMeasuredState());
        } else {
            i10 = 0;
        }
        int currentContentInsetEnd = getCurrentContentInsetEnd();
        int max3 = max + Math.max(currentContentInsetEnd, i10);
        iArr[i14] = Math.max(0, currentContentInsetEnd - i10);
        if (t(this.f3342q)) {
            max3 += r(this.f3342q, i2, max3, i5, 0, iArr);
            i8 = Math.max(i8, l(this.f3342q) + this.f3342q.getMeasuredHeight());
            i9 = View.combineMeasuredStates(i9, this.f3342q.getMeasuredState());
        }
        if (t(this.f3338m)) {
            max3 += r(this.f3338m, i2, max3, i5, 0, iArr);
            i8 = Math.max(i8, l(this.f3338m) + this.f3338m.getMeasuredHeight());
            i9 = View.combineMeasuredStates(i9, this.f3338m.getMeasuredState());
        }
        int childCount = getChildCount();
        for (int i16 = 0; i16 < childCount; i16++) {
            View childAt = getChildAt(i16);
            if (((o1) childAt.getLayoutParams()).f6860b == 0 && t(childAt)) {
                max3 += r(childAt, i2, max3, i5, 0, iArr);
                int max4 = Math.max(i8, l(childAt) + childAt.getMeasuredHeight());
                i9 = View.combineMeasuredStates(i9, childAt.getMeasuredState());
                i8 = max4;
            } else {
                max3 = max3;
            }
        }
        int i17 = max3;
        int i18 = this.f3351z + this.f3307A;
        int i19 = this.f3349x + this.f3350y;
        if (t(this.f3334e)) {
            r(this.f3334e, i2, i17 + i19, i5, i18, iArr);
            int k7 = k(this.f3334e) + this.f3334e.getMeasuredWidth();
            i11 = l(this.f3334e) + this.f3334e.getMeasuredHeight();
            i12 = View.combineMeasuredStates(i9, this.f3334e.getMeasuredState());
            i13 = k7;
        } else {
            i11 = 0;
            i12 = i9;
            i13 = 0;
        }
        if (t(this.f3336i)) {
            i13 = Math.max(i13, r(this.f3336i, i2, i17 + i19, i5, i18 + i11, iArr));
            i11 += l(this.f3336i) + this.f3336i.getMeasuredHeight();
            i12 = View.combineMeasuredStates(i12, this.f3336i.getMeasuredState());
        }
        int max5 = Math.max(i8, i11);
        int paddingRight = getPaddingRight() + getPaddingLeft() + i17 + i13;
        int paddingBottom = getPaddingBottom() + getPaddingTop() + max5;
        int resolveSizeAndState = View.resolveSizeAndState(Math.max(paddingRight, getSuggestedMinimumWidth()), i2, (-16777216) & i12);
        int resolveSizeAndState2 = View.resolveSizeAndState(Math.max(paddingBottom, getSuggestedMinimumHeight()), i5, i12 << 16);
        if (this.f3329a0) {
            int childCount2 = getChildCount();
            for (int i20 = 0; i20 < childCount2; i20++) {
                View childAt2 = getChildAt(i20);
                if (!t(childAt2) || childAt2.getMeasuredWidth() <= 0 || childAt2.getMeasuredHeight() <= 0) {
                }
            }
            setMeasuredDimension(resolveSizeAndState, i15);
        }
        i15 = resolveSizeAndState2;
        setMeasuredDimension(resolveSizeAndState, i15);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        MenuItem findItem;
        if (!(parcelable instanceof q1)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        q1 q1Var = (q1) parcelable;
        super.onRestoreInstanceState(q1Var.f1776d);
        ActionMenuView actionMenuView = this.f3332d;
        m mVar = actionMenuView != null ? actionMenuView.f3204x : null;
        int i2 = q1Var.f6871i;
        if (i2 != 0 && this.f3326U != null && mVar != null && (findItem = mVar.findItem(i2)) != null) {
            findItem.expandActionView();
        }
        if (q1Var.f6872l) {
            F.b bVar = this.f3335e0;
            removeCallbacks(bVar);
            post(bVar);
        }
    }

    @Override // android.view.View
    public final void onRtlPropertiesChanged(int i2) {
        super.onRtlPropertiesChanged(i2);
        d();
        S0 s02 = this.f3308B;
        boolean z7 = i2 == 1;
        if (z7 == s02.f6713g) {
            return;
        }
        s02.f6713g = z7;
        if (!s02.f6714h) {
            s02.f6707a = s02.f6711e;
            s02.f6708b = s02.f6712f;
            return;
        }
        if (z7) {
            int i5 = s02.f6710d;
            if (i5 == Integer.MIN_VALUE) {
                i5 = s02.f6711e;
            }
            s02.f6707a = i5;
            int i7 = s02.f6709c;
            if (i7 == Integer.MIN_VALUE) {
                i7 = s02.f6712f;
            }
            s02.f6708b = i7;
            return;
        }
        int i8 = s02.f6709c;
        if (i8 == Integer.MIN_VALUE) {
            i8 = s02.f6711e;
        }
        s02.f6707a = i8;
        int i9 = s02.f6710d;
        if (i9 == Integer.MIN_VALUE) {
            i9 = s02.f6712f;
        }
        s02.f6708b = i9;
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        o oVar;
        q1 q1Var = new q1(super.onSaveInstanceState());
        n1 n1Var = this.f3326U;
        if (n1Var != null && (oVar = n1Var.f6845e) != null) {
            q1Var.f6871i = oVar.f6440a;
        }
        q1Var.f6872l = o();
        return q1Var;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f3316J = false;
        }
        if (!this.f3316J) {
            boolean onTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !onTouchEvent) {
                this.f3316J = true;
            }
        }
        if (actionMasked != 1 && actionMasked != 3) {
            return true;
        }
        this.f3316J = false;
        return true;
    }

    public final int p(View view, int i2, int i5, int[] iArr) {
        o1 o1Var = (o1) view.getLayoutParams();
        int i7 = ((ViewGroup.MarginLayoutParams) o1Var).leftMargin - iArr[0];
        int max = Math.max(0, i7) + i2;
        iArr[0] = Math.max(0, -i7);
        int j = j(view, i5);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(max, j, max + measuredWidth, view.getMeasuredHeight() + j);
        return measuredWidth + ((ViewGroup.MarginLayoutParams) o1Var).rightMargin + max;
    }

    public final int q(View view, int i2, int i5, int[] iArr) {
        o1 o1Var = (o1) view.getLayoutParams();
        int i7 = ((ViewGroup.MarginLayoutParams) o1Var).rightMargin - iArr[1];
        int max = i2 - Math.max(0, i7);
        iArr[1] = Math.max(0, -i7);
        int j = j(view, i5);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(max - measuredWidth, j, max, view.getMeasuredHeight() + j);
        return max - (measuredWidth + ((ViewGroup.MarginLayoutParams) o1Var).leftMargin);
    }

    public final int r(View view, int i2, int i5, int i7, int i8, int[] iArr) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int i9 = marginLayoutParams.leftMargin - iArr[0];
        int i10 = marginLayoutParams.rightMargin - iArr[1];
        int max = Math.max(0, i10) + Math.max(0, i9);
        iArr[0] = Math.max(0, -i9);
        iArr[1] = Math.max(0, -i10);
        view.measure(ViewGroup.getChildMeasureSpec(i2, getPaddingRight() + getPaddingLeft() + max + i5, marginLayoutParams.width), ViewGroup.getChildMeasureSpec(i7, getPaddingBottom() + getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i8, marginLayoutParams.height));
        return view.getMeasuredWidth() + max;
    }

    public final void s(View view, int i2, int i5, int i7, int i8) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i2, getPaddingRight() + getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i5, marginLayoutParams.width);
        int childMeasureSpec2 = ViewGroup.getChildMeasureSpec(i7, getPaddingBottom() + getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, marginLayoutParams.height);
        int mode = View.MeasureSpec.getMode(childMeasureSpec2);
        if (mode != 1073741824 && i8 >= 0) {
            if (mode != 0) {
                i8 = Math.min(View.MeasureSpec.getSize(childMeasureSpec2), i8);
            }
            childMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i8, 1073741824);
        }
        view.measure(childMeasureSpec, childMeasureSpec2);
    }

    public void setBackInvokedCallbackEnabled(boolean z7) {
        if (this.f3333d0 != z7) {
            this.f3333d0 = z7;
            v();
        }
    }

    public void setCollapseContentDescription(int i2) {
        setCollapseContentDescription(i2 != 0 ? getContext().getText(i2) : null);
    }

    public void setCollapseIcon(int i2) {
        setCollapseIcon(g.M(getContext(), i2));
    }

    public void setCollapsible(boolean z7) {
        this.f3329a0 = z7;
        requestLayout();
    }

    public void setContentInsetEndWithActions(int i2) {
        if (i2 < 0) {
            i2 = Integer.MIN_VALUE;
        }
        if (i2 != this.f3310D) {
            this.f3310D = i2;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setContentInsetStartWithNavigation(int i2) {
        if (i2 < 0) {
            i2 = Integer.MIN_VALUE;
        }
        if (i2 != this.f3309C) {
            this.f3309C = i2;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setLogo(int i2) {
        setLogo(g.M(getContext(), i2));
    }

    public void setLogoDescription(int i2) {
        setLogoDescription(getContext().getText(i2));
    }

    public void setNavigationContentDescription(int i2) {
        setNavigationContentDescription(i2 != 0 ? getContext().getText(i2) : null);
    }

    public void setNavigationIcon(int i2) {
        setNavigationIcon(g.M(getContext(), i2));
    }

    public void setNavigationOnClickListener(View.OnClickListener onClickListener) {
        g();
        this.f3337l.setOnClickListener(onClickListener);
    }

    public void setOnMenuItemClickListener(p1 p1Var) {
        this.Q = p1Var;
    }

    public void setOverflowIcon(Drawable drawable) {
        e();
        this.f3332d.setOverflowIcon(drawable);
    }

    public void setPopupTheme(int i2) {
        if (this.f3344s != i2) {
            this.f3344s = i2;
            if (i2 == 0) {
                this.f3343r = getContext();
            } else {
                this.f3343r = new ContextThemeWrapper(getContext(), i2);
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
        this.f3307A = i2;
        requestLayout();
    }

    public void setTitleMarginEnd(int i2) {
        this.f3350y = i2;
        requestLayout();
    }

    public void setTitleMarginStart(int i2) {
        this.f3349x = i2;
        requestLayout();
    }

    public void setTitleMarginTop(int i2) {
        this.f3351z = i2;
        requestLayout();
    }

    public void setTitleTextColor(int i2) {
        setTitleTextColor(ColorStateList.valueOf(i2));
    }

    public final boolean t(View view) {
        return (view == null || view.getParent() != this || view.getVisibility() == 8) ? false : true;
    }

    public final boolean u() {
        C0716j c0716j;
        ActionMenuView actionMenuView = this.f3332d;
        return (actionMenuView == null || (c0716j = actionMenuView.f3196B) == null || !c0716j.l()) ? false : true;
    }

    public final void v() {
        boolean z7;
        OnBackInvokedDispatcher onBackInvokedDispatcher;
        if (Build.VERSION.SDK_INT >= 33) {
            OnBackInvokedDispatcher a7 = m1.a(this);
            n1 n1Var = this.f3326U;
            int i2 = 0;
            if (n1Var != null && n1Var.f6845e != null && a7 != null) {
                WeakHashMap weakHashMap = T.f1153a;
                if (isAttachedToWindow() && this.f3333d0) {
                    z7 = true;
                    if (!z7 && this.f3331c0 == null) {
                        if (this.f3330b0 == null) {
                            this.f3330b0 = m1.b(new l1(this, i2));
                        }
                        m1.c(a7, this.f3330b0);
                        this.f3331c0 = a7;
                        return;
                    }
                    if (!z7 || (onBackInvokedDispatcher = this.f3331c0) == null) {
                    }
                    m1.d(onBackInvokedDispatcher, this.f3330b0);
                    this.f3331c0 = null;
                    return;
                }
            }
            z7 = false;
            if (!z7) {
            }
            if (z7) {
            }
        }
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        Context context = getContext();
        o1 o1Var = new o1(context, attributeSet);
        o1Var.f6859a = 0;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0454a.f5038b);
        o1Var.f6859a = obtainStyledAttributes.getInt(0, 0);
        obtainStyledAttributes.recycle();
        o1Var.f6860b = 0;
        return o1Var;
    }

    public void setCollapseContentDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            c();
        }
        C0741w c0741w = this.f3341p;
        if (c0741w != null) {
            c0741w.setContentDescription(charSequence);
        }
    }

    public void setCollapseIcon(Drawable drawable) {
        if (drawable != null) {
            c();
            this.f3341p.setImageDrawable(drawable);
        } else {
            C0741w c0741w = this.f3341p;
            if (c0741w != null) {
                c0741w.setImageDrawable(this.f3339n);
            }
        }
    }

    public void setLogo(Drawable drawable) {
        if (drawable != null) {
            if (this.f3338m == null) {
                this.f3338m = new C0743x(getContext(), null, 0);
            }
            if (!n(this.f3338m)) {
                b(this.f3338m, true);
            }
        } else {
            C0743x c0743x = this.f3338m;
            if (c0743x != null && n(c0743x)) {
                removeView(this.f3338m);
                this.f3319M.remove(this.f3338m);
            }
        }
        C0743x c0743x2 = this.f3338m;
        if (c0743x2 != null) {
            c0743x2.setImageDrawable(drawable);
        }
    }

    public void setLogoDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence) && this.f3338m == null) {
            this.f3338m = new C0743x(getContext(), null, 0);
        }
        C0743x c0743x = this.f3338m;
        if (c0743x != null) {
            c0743x.setContentDescription(charSequence);
        }
    }

    public void setNavigationContentDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            g();
        }
        C0741w c0741w = this.f3337l;
        if (c0741w != null) {
            c0741w.setContentDescription(charSequence);
            f.M(this.f3337l, charSequence);
        }
    }

    public void setNavigationIcon(Drawable drawable) {
        if (drawable != null) {
            g();
            if (!n(this.f3337l)) {
                b(this.f3337l, true);
            }
        } else {
            C0741w c0741w = this.f3337l;
            if (c0741w != null && n(c0741w)) {
                removeView(this.f3337l);
                this.f3319M.remove(this.f3337l);
            }
        }
        C0741w c0741w2 = this.f3337l;
        if (c0741w2 != null) {
            c0741w2.setImageDrawable(drawable);
        }
    }

    public void setSubtitle(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            C0703c0 c0703c0 = this.f3336i;
            if (c0703c0 != null && n(c0703c0)) {
                removeView(this.f3336i);
                this.f3319M.remove(this.f3336i);
            }
        } else {
            if (this.f3336i == null) {
                Context context = getContext();
                C0703c0 c0703c02 = new C0703c0(context, null);
                this.f3336i = c0703c02;
                c0703c02.setSingleLine();
                this.f3336i.setEllipsize(TextUtils.TruncateAt.END);
                int i2 = this.f3346u;
                if (i2 != 0) {
                    this.f3336i.setTextAppearance(context, i2);
                }
                ColorStateList colorStateList = this.f3315I;
                if (colorStateList != null) {
                    this.f3336i.setTextColor(colorStateList);
                }
            }
            if (!n(this.f3336i)) {
                b(this.f3336i, true);
            }
        }
        C0703c0 c0703c03 = this.f3336i;
        if (c0703c03 != null) {
            c0703c03.setText(charSequence);
        }
        this.f3313G = charSequence;
    }

    public void setSubtitleTextColor(ColorStateList colorStateList) {
        this.f3315I = colorStateList;
        C0703c0 c0703c0 = this.f3336i;
        if (c0703c0 != null) {
            c0703c0.setTextColor(colorStateList);
        }
    }

    public void setTitle(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            C0703c0 c0703c0 = this.f3334e;
            if (c0703c0 != null && n(c0703c0)) {
                removeView(this.f3334e);
                this.f3319M.remove(this.f3334e);
            }
        } else {
            if (this.f3334e == null) {
                Context context = getContext();
                C0703c0 c0703c02 = new C0703c0(context, null);
                this.f3334e = c0703c02;
                c0703c02.setSingleLine();
                this.f3334e.setEllipsize(TextUtils.TruncateAt.END);
                int i2 = this.f3345t;
                if (i2 != 0) {
                    this.f3334e.setTextAppearance(context, i2);
                }
                ColorStateList colorStateList = this.f3314H;
                if (colorStateList != null) {
                    this.f3334e.setTextColor(colorStateList);
                }
            }
            if (!n(this.f3334e)) {
                b(this.f3334e, true);
            }
        }
        C0703c0 c0703c03 = this.f3334e;
        if (c0703c03 != null) {
            c0703c03.setText(charSequence);
        }
        this.f3312F = charSequence;
    }

    public void setTitleTextColor(ColorStateList colorStateList) {
        this.f3314H = colorStateList;
        C0703c0 c0703c0 = this.f3334e;
        if (c0703c0 != null) {
            c0703c0.setTextColor(colorStateList);
        }
    }
}
