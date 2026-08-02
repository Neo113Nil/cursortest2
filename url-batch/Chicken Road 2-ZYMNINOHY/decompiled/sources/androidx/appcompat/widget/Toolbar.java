package androidx.appcompat.widget;

import B1.j;
import E.H;
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
import com.rockchicken.pump.up.road.R;
import e0.t;
import f.AbstractC0410a;
import g.AbstractC0432a;
import i.C0453d;
import j.k;
import java.lang.reflect.Field;
import java.util.ArrayList;
import k.C1191O;
import k.C1212f;
import k.C1218i;
import k.C1221j0;
import k.C1223k0;
import k.C1228o;
import k.C1229p;
import k.C1233t;
import k.InterfaceC1225l0;
import k.InterfaceC1236w;
import k.ViewOnClickListenerC1219i0;
import k.m0;
import k.n0;
import k.t0;

/* loaded from: classes.dex */
public class Toolbar extends ViewGroup {

    /* renamed from: A, reason: collision with root package name */
    public ColorStateList f4459A;

    /* renamed from: B, reason: collision with root package name */
    public boolean f4460B;

    /* renamed from: C, reason: collision with root package name */
    public boolean f4461C;

    /* renamed from: D, reason: collision with root package name */
    public final ArrayList f4462D;

    /* renamed from: E, reason: collision with root package name */
    public final ArrayList f4463E;

    /* renamed from: F, reason: collision with root package name */
    public final int[] f4464F;

    /* renamed from: G, reason: collision with root package name */
    public final t f4465G;

    /* renamed from: H, reason: collision with root package name */
    public n0 f4466H;

    /* renamed from: I, reason: collision with root package name */
    public C1221j0 f4467I;

    /* renamed from: J, reason: collision with root package name */
    public boolean f4468J;

    /* renamed from: K, reason: collision with root package name */
    public final B.b f4469K;

    /* renamed from: a, reason: collision with root package name */
    public ActionMenuView f4470a;

    /* renamed from: b, reason: collision with root package name */
    public C1233t f4471b;

    /* renamed from: c, reason: collision with root package name */
    public C1233t f4472c;

    /* renamed from: d, reason: collision with root package name */
    public C1228o f4473d;

    /* renamed from: e, reason: collision with root package name */
    public C1229p f4474e;

    /* renamed from: f, reason: collision with root package name */
    public final Drawable f4475f;

    /* renamed from: g, reason: collision with root package name */
    public final CharSequence f4476g;

    /* renamed from: h, reason: collision with root package name */
    public C1228o f4477h;

    /* renamed from: i, reason: collision with root package name */
    public View f4478i;

    /* renamed from: j, reason: collision with root package name */
    public Context f4479j;

    /* renamed from: k, reason: collision with root package name */
    public int f4480k;

    /* renamed from: l, reason: collision with root package name */
    public int f4481l;

    /* renamed from: m, reason: collision with root package name */
    public int f4482m;
    public final int n;
    public final int o;

    /* renamed from: p, reason: collision with root package name */
    public int f4483p;

    /* renamed from: q, reason: collision with root package name */
    public int f4484q;

    /* renamed from: r, reason: collision with root package name */
    public int f4485r;

    /* renamed from: s, reason: collision with root package name */
    public int f4486s;

    /* renamed from: t, reason: collision with root package name */
    public C1191O f4487t;

    /* renamed from: u, reason: collision with root package name */
    public int f4488u;
    public int v;

    /* renamed from: w, reason: collision with root package name */
    public final int f4489w;

    /* renamed from: x, reason: collision with root package name */
    public CharSequence f4490x;

    /* renamed from: y, reason: collision with root package name */
    public CharSequence f4491y;
    public ColorStateList z;

    public Toolbar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.toolbarStyle);
        this.f4489w = 8388627;
        this.f4462D = new ArrayList();
        this.f4463E = new ArrayList();
        this.f4464F = new int[2];
        this.f4465G = new t(this);
        this.f4469K = new B.b(14, this);
        j v = j.v(getContext(), attributeSet, AbstractC0410a.f8487t, R.attr.toolbarStyle);
        TypedArray typedArray = (TypedArray) v.f202c;
        this.f4481l = typedArray.getResourceId(28, 0);
        this.f4482m = typedArray.getResourceId(19, 0);
        this.f4489w = typedArray.getInteger(0, 8388627);
        this.n = typedArray.getInteger(2, 48);
        int dimensionPixelOffset = typedArray.getDimensionPixelOffset(22, 0);
        dimensionPixelOffset = typedArray.hasValue(27) ? typedArray.getDimensionPixelOffset(27, dimensionPixelOffset) : dimensionPixelOffset;
        this.f4486s = dimensionPixelOffset;
        this.f4485r = dimensionPixelOffset;
        this.f4484q = dimensionPixelOffset;
        this.f4483p = dimensionPixelOffset;
        int dimensionPixelOffset2 = typedArray.getDimensionPixelOffset(25, -1);
        if (dimensionPixelOffset2 >= 0) {
            this.f4483p = dimensionPixelOffset2;
        }
        int dimensionPixelOffset3 = typedArray.getDimensionPixelOffset(24, -1);
        if (dimensionPixelOffset3 >= 0) {
            this.f4484q = dimensionPixelOffset3;
        }
        int dimensionPixelOffset4 = typedArray.getDimensionPixelOffset(26, -1);
        if (dimensionPixelOffset4 >= 0) {
            this.f4485r = dimensionPixelOffset4;
        }
        int dimensionPixelOffset5 = typedArray.getDimensionPixelOffset(23, -1);
        if (dimensionPixelOffset5 >= 0) {
            this.f4486s = dimensionPixelOffset5;
        }
        this.o = typedArray.getDimensionPixelSize(13, -1);
        int dimensionPixelOffset6 = typedArray.getDimensionPixelOffset(9, Integer.MIN_VALUE);
        int dimensionPixelOffset7 = typedArray.getDimensionPixelOffset(5, Integer.MIN_VALUE);
        int dimensionPixelSize = typedArray.getDimensionPixelSize(7, 0);
        int dimensionPixelSize2 = typedArray.getDimensionPixelSize(8, 0);
        d();
        C1191O c1191o = this.f4487t;
        c1191o.f13960h = false;
        if (dimensionPixelSize != Integer.MIN_VALUE) {
            c1191o.f13957e = dimensionPixelSize;
            c1191o.f13953a = dimensionPixelSize;
        }
        if (dimensionPixelSize2 != Integer.MIN_VALUE) {
            c1191o.f13958f = dimensionPixelSize2;
            c1191o.f13954b = dimensionPixelSize2;
        }
        if (dimensionPixelOffset6 != Integer.MIN_VALUE || dimensionPixelOffset7 != Integer.MIN_VALUE) {
            c1191o.a(dimensionPixelOffset6, dimensionPixelOffset7);
        }
        this.f4488u = typedArray.getDimensionPixelOffset(10, Integer.MIN_VALUE);
        this.v = typedArray.getDimensionPixelOffset(6, Integer.MIN_VALUE);
        this.f4475f = v.o(4);
        this.f4476g = typedArray.getText(3);
        CharSequence text = typedArray.getText(21);
        if (!TextUtils.isEmpty(text)) {
            setTitle(text);
        }
        CharSequence text2 = typedArray.getText(18);
        if (!TextUtils.isEmpty(text2)) {
            setSubtitle(text2);
        }
        this.f4479j = getContext();
        setPopupTheme(typedArray.getResourceId(17, 0));
        Drawable o = v.o(16);
        if (o != null) {
            setNavigationIcon(o);
        }
        CharSequence text3 = typedArray.getText(15);
        if (!TextUtils.isEmpty(text3)) {
            setNavigationContentDescription(text3);
        }
        Drawable o4 = v.o(11);
        if (o4 != null) {
            setLogo(o4);
        }
        CharSequence text4 = typedArray.getText(12);
        if (!TextUtils.isEmpty(text4)) {
            setLogoDescription(text4);
        }
        if (typedArray.hasValue(29)) {
            setTitleTextColor(v.m(29));
        }
        if (typedArray.hasValue(20)) {
            setSubtitleTextColor(v.m(20));
        }
        if (typedArray.hasValue(14)) {
            getMenuInflater().inflate(typedArray.getResourceId(14, 0), getMenu());
        }
        v.x();
    }

    public static C1223k0 g() {
        C1223k0 c1223k0 = new C1223k0(-2, -2);
        c1223k0.f14043b = 0;
        c1223k0.f14042a = 8388627;
        return c1223k0;
    }

    private MenuInflater getMenuInflater() {
        return new C0453d(getContext());
    }

    public static C1223k0 h(ViewGroup.LayoutParams layoutParams) {
        boolean z = layoutParams instanceof C1223k0;
        if (z) {
            C1223k0 c1223k0 = (C1223k0) layoutParams;
            C1223k0 c1223k02 = new C1223k0(c1223k0);
            c1223k02.f14043b = 0;
            c1223k02.f14043b = c1223k0.f14043b;
            return c1223k02;
        }
        if (z) {
            C1223k0 c1223k03 = new C1223k0((C1223k0) layoutParams);
            c1223k03.f14043b = 0;
            return c1223k03;
        }
        if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
            C1223k0 c1223k04 = new C1223k0(layoutParams);
            c1223k04.f14043b = 0;
            return c1223k04;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        C1223k0 c1223k05 = new C1223k0(marginLayoutParams);
        c1223k05.f14043b = 0;
        ((ViewGroup.MarginLayoutParams) c1223k05).leftMargin = marginLayoutParams.leftMargin;
        ((ViewGroup.MarginLayoutParams) c1223k05).topMargin = marginLayoutParams.topMargin;
        ((ViewGroup.MarginLayoutParams) c1223k05).rightMargin = marginLayoutParams.rightMargin;
        ((ViewGroup.MarginLayoutParams) c1223k05).bottomMargin = marginLayoutParams.bottomMargin;
        return c1223k05;
    }

    public static int j(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return marginLayoutParams.getMarginEnd() + marginLayoutParams.getMarginStart();
    }

    public static int k(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
    }

    public final void a(int i4, ArrayList arrayList) {
        Field field = H.f375a;
        boolean z = getLayoutDirection() == 1;
        int childCount = getChildCount();
        int absoluteGravity = Gravity.getAbsoluteGravity(i4, getLayoutDirection());
        arrayList.clear();
        if (!z) {
            for (int i5 = 0; i5 < childCount; i5++) {
                View childAt = getChildAt(i5);
                C1223k0 c1223k0 = (C1223k0) childAt.getLayoutParams();
                if (c1223k0.f14043b == 0 && q(childAt)) {
                    int i6 = c1223k0.f14042a;
                    Field field2 = H.f375a;
                    int layoutDirection = getLayoutDirection();
                    int absoluteGravity2 = Gravity.getAbsoluteGravity(i6, layoutDirection) & 7;
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
        for (int i7 = childCount - 1; i7 >= 0; i7--) {
            View childAt2 = getChildAt(i7);
            C1223k0 c1223k02 = (C1223k0) childAt2.getLayoutParams();
            if (c1223k02.f14043b == 0 && q(childAt2)) {
                int i8 = c1223k02.f14042a;
                Field field3 = H.f375a;
                int layoutDirection2 = getLayoutDirection();
                int absoluteGravity3 = Gravity.getAbsoluteGravity(i8, layoutDirection2) & 7;
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
        C1223k0 g4 = layoutParams == null ? g() : !checkLayoutParams(layoutParams) ? h(layoutParams) : (C1223k0) layoutParams;
        g4.f14043b = 1;
        if (!z || this.f4478i == null) {
            addView(view, g4);
        } else {
            view.setLayoutParams(g4);
            this.f4463E.add(view);
        }
    }

    public final void c() {
        if (this.f4477h == null) {
            C1228o c1228o = new C1228o(getContext());
            this.f4477h = c1228o;
            c1228o.setImageDrawable(this.f4475f);
            this.f4477h.setContentDescription(this.f4476g);
            C1223k0 g4 = g();
            g4.f14042a = (this.n & 112) | 8388611;
            g4.f14043b = 2;
            this.f4477h.setLayoutParams(g4);
            this.f4477h.setOnClickListener(new ViewOnClickListenerC1219i0(this));
        }
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return super.checkLayoutParams(layoutParams) && (layoutParams instanceof C1223k0);
    }

    public final void d() {
        if (this.f4487t == null) {
            C1191O c1191o = new C1191O();
            c1191o.f13953a = 0;
            c1191o.f13954b = 0;
            c1191o.f13955c = Integer.MIN_VALUE;
            c1191o.f13956d = Integer.MIN_VALUE;
            c1191o.f13957e = 0;
            c1191o.f13958f = 0;
            c1191o.f13959g = false;
            c1191o.f13960h = false;
            this.f4487t = c1191o;
        }
    }

    public final void e() {
        if (this.f4470a == null) {
            ActionMenuView actionMenuView = new ActionMenuView(getContext(), null);
            this.f4470a = actionMenuView;
            actionMenuView.setPopupTheme(this.f4480k);
            this.f4470a.setOnMenuItemClickListener(this.f4465G);
            this.f4470a.getClass();
            C1223k0 g4 = g();
            g4.f14042a = (this.n & 112) | 8388613;
            this.f4470a.setLayoutParams(g4);
            b(this.f4470a, false);
        }
        ActionMenuView actionMenuView2 = this.f4470a;
        if (actionMenuView2.f4364p == null) {
            j.j jVar = (j.j) actionMenuView2.getMenu();
            if (this.f4467I == null) {
                this.f4467I = new C1221j0(this);
            }
            this.f4470a.setExpandedActionViewsExclusive(true);
            jVar.b(this.f4467I, this.f4479j);
        }
    }

    public final void f() {
        if (this.f4473d == null) {
            this.f4473d = new C1228o(getContext());
            C1223k0 g4 = g();
            g4.f14042a = (this.n & 112) | 8388611;
            this.f4473d.setLayoutParams(g4);
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
        C1228o c1228o = this.f4477h;
        if (c1228o != null) {
            return c1228o.getContentDescription();
        }
        return null;
    }

    public Drawable getCollapseIcon() {
        C1228o c1228o = this.f4477h;
        if (c1228o != null) {
            return c1228o.getDrawable();
        }
        return null;
    }

    public int getContentInsetEnd() {
        C1191O c1191o = this.f4487t;
        if (c1191o != null) {
            return c1191o.f13959g ? c1191o.f13953a : c1191o.f13954b;
        }
        return 0;
    }

    public int getContentInsetEndWithActions() {
        int i4 = this.v;
        return i4 != Integer.MIN_VALUE ? i4 : getContentInsetEnd();
    }

    public int getContentInsetLeft() {
        C1191O c1191o = this.f4487t;
        if (c1191o != null) {
            return c1191o.f13953a;
        }
        return 0;
    }

    public int getContentInsetRight() {
        C1191O c1191o = this.f4487t;
        if (c1191o != null) {
            return c1191o.f13954b;
        }
        return 0;
    }

    public int getContentInsetStart() {
        C1191O c1191o = this.f4487t;
        if (c1191o != null) {
            return c1191o.f13959g ? c1191o.f13954b : c1191o.f13953a;
        }
        return 0;
    }

    public int getContentInsetStartWithNavigation() {
        int i4 = this.f4488u;
        return i4 != Integer.MIN_VALUE ? i4 : getContentInsetStart();
    }

    public int getCurrentContentInsetEnd() {
        j.j jVar;
        ActionMenuView actionMenuView = this.f4470a;
        return (actionMenuView == null || (jVar = actionMenuView.f4364p) == null || !jVar.hasVisibleItems()) ? getContentInsetEnd() : Math.max(getContentInsetEnd(), Math.max(this.v, 0));
    }

    public int getCurrentContentInsetLeft() {
        Field field = H.f375a;
        return getLayoutDirection() == 1 ? getCurrentContentInsetEnd() : getCurrentContentInsetStart();
    }

    public int getCurrentContentInsetRight() {
        Field field = H.f375a;
        return getLayoutDirection() == 1 ? getCurrentContentInsetStart() : getCurrentContentInsetEnd();
    }

    public int getCurrentContentInsetStart() {
        return getNavigationIcon() != null ? Math.max(getContentInsetStart(), Math.max(this.f4488u, 0)) : getContentInsetStart();
    }

    public Drawable getLogo() {
        C1229p c1229p = this.f4474e;
        if (c1229p != null) {
            return c1229p.getDrawable();
        }
        return null;
    }

    public CharSequence getLogoDescription() {
        C1229p c1229p = this.f4474e;
        if (c1229p != null) {
            return c1229p.getContentDescription();
        }
        return null;
    }

    public Menu getMenu() {
        e();
        return this.f4470a.getMenu();
    }

    public CharSequence getNavigationContentDescription() {
        C1228o c1228o = this.f4473d;
        if (c1228o != null) {
            return c1228o.getContentDescription();
        }
        return null;
    }

    public Drawable getNavigationIcon() {
        C1228o c1228o = this.f4473d;
        if (c1228o != null) {
            return c1228o.getDrawable();
        }
        return null;
    }

    public C1218i getOuterActionMenuPresenter() {
        return null;
    }

    public Drawable getOverflowIcon() {
        e();
        return this.f4470a.getOverflowIcon();
    }

    public Context getPopupContext() {
        return this.f4479j;
    }

    public int getPopupTheme() {
        return this.f4480k;
    }

    public CharSequence getSubtitle() {
        return this.f4491y;
    }

    public final TextView getSubtitleTextView() {
        return this.f4472c;
    }

    public CharSequence getTitle() {
        return this.f4490x;
    }

    public int getTitleMarginBottom() {
        return this.f4486s;
    }

    public int getTitleMarginEnd() {
        return this.f4484q;
    }

    public int getTitleMarginStart() {
        return this.f4483p;
    }

    public int getTitleMarginTop() {
        return this.f4485r;
    }

    public final TextView getTitleTextView() {
        return this.f4471b;
    }

    public InterfaceC1236w getWrapper() {
        Drawable drawable;
        if (this.f4466H == null) {
            n0 n0Var = new n0();
            n0Var.f14063l = 0;
            n0Var.f14052a = this;
            n0Var.f14059h = getTitle();
            n0Var.f14060i = getSubtitle();
            n0Var.f14058g = n0Var.f14059h != null;
            n0Var.f14057f = getNavigationIcon();
            j v = j.v(getContext(), null, AbstractC0410a.f8470a, R.attr.actionBarStyle);
            TypedArray typedArray = (TypedArray) v.f202c;
            n0Var.f14064m = v.o(15);
            CharSequence text = typedArray.getText(27);
            if (!TextUtils.isEmpty(text)) {
                n0Var.f14058g = true;
                n0Var.f14059h = text;
                if ((n0Var.f14053b & 8) != 0) {
                    n0Var.f14052a.setTitle(text);
                }
            }
            CharSequence text2 = typedArray.getText(25);
            if (!TextUtils.isEmpty(text2)) {
                n0Var.f14060i = text2;
                if ((n0Var.f14053b & 8) != 0) {
                    setSubtitle(text2);
                }
            }
            Drawable o = v.o(20);
            if (o != null) {
                n0Var.f14056e = o;
                n0Var.c();
            }
            Drawable o4 = v.o(17);
            if (o4 != null) {
                n0Var.f14055d = o4;
                n0Var.c();
            }
            if (n0Var.f14057f == null && (drawable = n0Var.f14064m) != null) {
                n0Var.f14057f = drawable;
                Toolbar toolbar = n0Var.f14052a;
                if ((n0Var.f14053b & 4) != 0) {
                    toolbar.setNavigationIcon(drawable);
                } else {
                    toolbar.setNavigationIcon((Drawable) null);
                }
            }
            n0Var.a(typedArray.getInt(10, 0));
            int resourceId = typedArray.getResourceId(9, 0);
            if (resourceId != 0) {
                View inflate = LayoutInflater.from(getContext()).inflate(resourceId, (ViewGroup) this, false);
                View view = n0Var.f14054c;
                if (view != null && (n0Var.f14053b & 16) != 0) {
                    removeView(view);
                }
                n0Var.f14054c = inflate;
                if (inflate != null && (n0Var.f14053b & 16) != 0) {
                    addView(inflate);
                }
                n0Var.a(n0Var.f14053b | 16);
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
                this.f4487t.a(max, max2);
            }
            int resourceId2 = typedArray.getResourceId(28, 0);
            if (resourceId2 != 0) {
                Context context = getContext();
                this.f4481l = resourceId2;
                C1233t c1233t = this.f4471b;
                if (c1233t != null) {
                    c1233t.setTextAppearance(context, resourceId2);
                }
            }
            int resourceId3 = typedArray.getResourceId(26, 0);
            if (resourceId3 != 0) {
                Context context2 = getContext();
                this.f4482m = resourceId3;
                C1233t c1233t2 = this.f4472c;
                if (c1233t2 != null) {
                    c1233t2.setTextAppearance(context2, resourceId3);
                }
            }
            int resourceId4 = typedArray.getResourceId(22, 0);
            if (resourceId4 != 0) {
                setPopupTheme(resourceId4);
            }
            v.x();
            if (R.string.abc_action_bar_up_description != n0Var.f14063l) {
                n0Var.f14063l = R.string.abc_action_bar_up_description;
                if (TextUtils.isEmpty(getNavigationContentDescription())) {
                    int i4 = n0Var.f14063l;
                    n0Var.f14061j = i4 != 0 ? getContext().getString(i4) : null;
                    n0Var.b();
                }
            }
            n0Var.f14061j = getNavigationContentDescription();
            setNavigationOnClickListener(new ViewOnClickListenerC1219i0(n0Var));
            this.f4466H = n0Var;
        }
        return this.f4466H;
    }

    public final int i(View view, int i4) {
        C1223k0 c1223k0 = (C1223k0) view.getLayoutParams();
        int measuredHeight = view.getMeasuredHeight();
        int i5 = i4 > 0 ? (measuredHeight - i4) / 2 : 0;
        int i6 = c1223k0.f14042a & 112;
        if (i6 != 16 && i6 != 48 && i6 != 80) {
            i6 = this.f4489w & 112;
        }
        if (i6 == 48) {
            return getPaddingTop() - i5;
        }
        if (i6 == 80) {
            return (((getHeight() - getPaddingBottom()) - measuredHeight) - ((ViewGroup.MarginLayoutParams) c1223k0).bottomMargin) - i5;
        }
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int height = getHeight();
        int i7 = (((height - paddingTop) - paddingBottom) - measuredHeight) / 2;
        int i8 = ((ViewGroup.MarginLayoutParams) c1223k0).topMargin;
        if (i7 < i8) {
            i7 = i8;
        } else {
            int i9 = (((height - paddingBottom) - measuredHeight) - i7) - paddingTop;
            int i10 = ((ViewGroup.MarginLayoutParams) c1223k0).bottomMargin;
            if (i9 < i10) {
                i7 = Math.max(0, i7 - (i10 - i9));
            }
        }
        return paddingTop + i7;
    }

    public final boolean l(View view) {
        return view.getParent() == this || this.f4463E.contains(view);
    }

    public final int m(View view, int i4, int i5, int[] iArr) {
        C1223k0 c1223k0 = (C1223k0) view.getLayoutParams();
        int i6 = ((ViewGroup.MarginLayoutParams) c1223k0).leftMargin - iArr[0];
        int max = Math.max(0, i6) + i4;
        iArr[0] = Math.max(0, -i6);
        int i7 = i(view, i5);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(max, i7, max + measuredWidth, view.getMeasuredHeight() + i7);
        return measuredWidth + ((ViewGroup.MarginLayoutParams) c1223k0).rightMargin + max;
    }

    public final int n(View view, int i4, int i5, int[] iArr) {
        C1223k0 c1223k0 = (C1223k0) view.getLayoutParams();
        int i6 = ((ViewGroup.MarginLayoutParams) c1223k0).rightMargin - iArr[1];
        int max = i4 - Math.max(0, i6);
        iArr[1] = Math.max(0, -i6);
        int i7 = i(view, i5);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(max - measuredWidth, i7, max, view.getMeasuredHeight() + i7);
        return max - (measuredWidth + ((ViewGroup.MarginLayoutParams) c1223k0).leftMargin);
    }

    public final int o(View view, int i4, int i5, int i6, int i7, int[] iArr) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int i8 = marginLayoutParams.leftMargin - iArr[0];
        int i9 = marginLayoutParams.rightMargin - iArr[1];
        int max = Math.max(0, i9) + Math.max(0, i8);
        iArr[0] = Math.max(0, -i8);
        iArr[1] = Math.max(0, -i9);
        view.measure(ViewGroup.getChildMeasureSpec(i4, getPaddingRight() + getPaddingLeft() + max + i5, marginLayoutParams.width), ViewGroup.getChildMeasureSpec(i6, getPaddingBottom() + getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i7, marginLayoutParams.height));
        return view.getMeasuredWidth() + max;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeCallbacks(this.f4469K);
    }

    @Override // android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.f4461C = false;
        }
        if (!this.f4461C) {
            boolean onHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !onHoverEvent) {
                this.f4461C = true;
            }
        }
        if (actionMasked != 10 && actionMasked != 3) {
            return true;
        }
        this.f4461C = false;
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
    public final void onLayout(boolean z, int i4, int i5, int i6, int i7) {
        int i8;
        int i9;
        int max;
        boolean q4;
        boolean q5;
        boolean z4;
        int i10;
        int i11;
        int paddingTop;
        int i12;
        int i13;
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
        int i21;
        int size4;
        Field field = H.f375a;
        boolean z5 = getLayoutDirection() == 1;
        int width = getWidth();
        int height = getHeight();
        int paddingLeft = getPaddingLeft();
        int paddingRight = getPaddingRight();
        int paddingTop2 = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int i22 = width - paddingRight;
        int[] iArr = this.f4464F;
        iArr[1] = 0;
        iArr[0] = 0;
        int minimumHeight = getMinimumHeight();
        int min = minimumHeight >= 0 ? Math.min(minimumHeight, i7 - i5) : 0;
        if (!q(this.f4473d)) {
            i8 = paddingLeft;
        } else {
            if (z5) {
                i9 = n(this.f4473d, i22, min, iArr);
                i8 = paddingLeft;
                if (q(this.f4477h)) {
                    if (z5) {
                        i9 = n(this.f4477h, i9, min, iArr);
                    } else {
                        i8 = m(this.f4477h, i8, min, iArr);
                    }
                }
                if (q(this.f4470a)) {
                    if (z5) {
                        i8 = m(this.f4470a, i8, min, iArr);
                    } else {
                        i9 = n(this.f4470a, i9, min, iArr);
                    }
                }
                int currentContentInsetLeft = getCurrentContentInsetLeft();
                int currentContentInsetRight = getCurrentContentInsetRight();
                iArr[0] = Math.max(0, currentContentInsetLeft - i8);
                iArr[1] = Math.max(0, currentContentInsetRight - (i22 - i9));
                max = Math.max(i8, currentContentInsetLeft);
                int min2 = Math.min(i9, i22 - currentContentInsetRight);
                if (q(this.f4478i)) {
                    if (z5) {
                        min2 = n(this.f4478i, min2, min, iArr);
                    } else {
                        max = m(this.f4478i, max, min, iArr);
                    }
                }
                if (q(this.f4474e)) {
                    if (z5) {
                        min2 = n(this.f4474e, min2, min, iArr);
                    } else {
                        max = m(this.f4474e, max, min, iArr);
                    }
                }
                q4 = q(this.f4471b);
                q5 = q(this.f4472c);
                if (q4) {
                    z4 = z5;
                    i10 = 0;
                } else {
                    C1223k0 c1223k0 = (C1223k0) this.f4471b.getLayoutParams();
                    z4 = z5;
                    i10 = this.f4471b.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) c1223k0).topMargin + ((ViewGroup.MarginLayoutParams) c1223k0).bottomMargin;
                }
                if (!q5) {
                    C1223k0 c1223k02 = (C1223k0) this.f4472c.getLayoutParams();
                    i10 = this.f4472c.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) c1223k02).topMargin + ((ViewGroup.MarginLayoutParams) c1223k02).bottomMargin + i10;
                }
                if (!q4 || q5) {
                    C1233t c1233t = !q4 ? this.f4471b : this.f4472c;
                    C1233t c1233t2 = !q5 ? this.f4472c : this.f4471b;
                    C1223k0 c1223k03 = (C1223k0) c1233t.getLayoutParams();
                    C1223k0 c1223k04 = (C1223k0) c1233t2.getLayoutParams();
                    int i23 = i10;
                    boolean z6 = (!q4 && this.f4471b.getMeasuredWidth() > 0) || (q5 && this.f4472c.getMeasuredWidth() > 0);
                    i11 = this.f4489w & 112;
                    int i24 = max;
                    if (i11 != 48) {
                        paddingTop = getPaddingTop() + ((ViewGroup.MarginLayoutParams) c1223k03).topMargin + this.f4485r;
                    } else if (i11 != 80) {
                        int i25 = (((height - paddingTop2) - paddingBottom) - i23) / 2;
                        int i26 = ((ViewGroup.MarginLayoutParams) c1223k03).topMargin + this.f4485r;
                        if (i25 < i26) {
                            i25 = i26;
                        } else {
                            int i27 = (((height - paddingBottom) - i23) - i25) - paddingTop2;
                            int i28 = ((ViewGroup.MarginLayoutParams) c1223k03).bottomMargin;
                            int i29 = this.f4486s;
                            if (i27 < i28 + i29) {
                                i25 = Math.max(0, i25 - ((((ViewGroup.MarginLayoutParams) c1223k04).bottomMargin + i29) - i27));
                            }
                        }
                        paddingTop = paddingTop2 + i25;
                    } else {
                        paddingTop = (((height - paddingBottom) - ((ViewGroup.MarginLayoutParams) c1223k04).bottomMargin) - this.f4486s) - i23;
                    }
                    if (z4) {
                        int i30 = (z6 ? this.f4483p : 0) - iArr[0];
                        max = Math.max(0, i30) + i24;
                        iArr[0] = Math.max(0, -i30);
                        if (q4) {
                            C1223k0 c1223k05 = (C1223k0) this.f4471b.getLayoutParams();
                            int measuredWidth = this.f4471b.getMeasuredWidth() + max;
                            int measuredHeight = this.f4471b.getMeasuredHeight() + paddingTop;
                            this.f4471b.layout(max, paddingTop, measuredWidth, measuredHeight);
                            i12 = measuredWidth + this.f4484q;
                            paddingTop = measuredHeight + ((ViewGroup.MarginLayoutParams) c1223k05).bottomMargin;
                        } else {
                            i12 = max;
                        }
                        if (q5) {
                            int i31 = paddingTop + ((ViewGroup.MarginLayoutParams) ((C1223k0) this.f4472c.getLayoutParams())).topMargin;
                            int measuredWidth2 = this.f4472c.getMeasuredWidth() + max;
                            this.f4472c.layout(max, i31, measuredWidth2, this.f4472c.getMeasuredHeight() + i31);
                            i13 = measuredWidth2 + this.f4484q;
                        } else {
                            i13 = max;
                        }
                        if (z6) {
                            max = Math.max(i12, i13);
                        }
                    } else {
                        int i32 = (z6 ? this.f4483p : 0) - iArr[1];
                        min2 -= Math.max(0, i32);
                        iArr[1] = Math.max(0, -i32);
                        if (q4) {
                            C1223k0 c1223k06 = (C1223k0) this.f4471b.getLayoutParams();
                            int measuredWidth3 = min2 - this.f4471b.getMeasuredWidth();
                            int measuredHeight2 = this.f4471b.getMeasuredHeight() + paddingTop;
                            this.f4471b.layout(measuredWidth3, paddingTop, min2, measuredHeight2);
                            i14 = measuredWidth3 - this.f4484q;
                            paddingTop = measuredHeight2 + ((ViewGroup.MarginLayoutParams) c1223k06).bottomMargin;
                        } else {
                            i14 = min2;
                        }
                        if (q5) {
                            int i33 = paddingTop + ((ViewGroup.MarginLayoutParams) ((C1223k0) this.f4472c.getLayoutParams())).topMargin;
                            this.f4472c.layout(min2 - this.f4472c.getMeasuredWidth(), i33, min2, this.f4472c.getMeasuredHeight() + i33);
                            i15 = min2 - this.f4484q;
                        } else {
                            i15 = min2;
                        }
                        if (z6) {
                            min2 = Math.min(i14, i15);
                        }
                        max = i24;
                    }
                }
                ArrayList arrayList = this.f4462D;
                a(3, arrayList);
                size = arrayList.size();
                i16 = max;
                for (i17 = 0; i17 < size; i17++) {
                    i16 = m((View) arrayList.get(i17), i16, min, iArr);
                }
                a(5, arrayList);
                size2 = arrayList.size();
                for (i18 = 0; i18 < size2; i18++) {
                    min2 = n((View) arrayList.get(i18), min2, min, iArr);
                }
                a(1, arrayList);
                int i34 = iArr[0];
                int i35 = iArr[1];
                size3 = arrayList.size();
                int i36 = i34;
                i19 = 0;
                int i37 = 0;
                while (i19 < size3) {
                    View view = (View) arrayList.get(i19);
                    C1223k0 c1223k07 = (C1223k0) view.getLayoutParams();
                    int i38 = i35;
                    int i39 = ((ViewGroup.MarginLayoutParams) c1223k07).leftMargin - i36;
                    int i40 = ((ViewGroup.MarginLayoutParams) c1223k07).rightMargin - i38;
                    int max2 = Math.max(0, i39);
                    int max3 = Math.max(0, i40);
                    int max4 = Math.max(0, -i39);
                    int max5 = Math.max(0, -i40);
                    i37 += view.getMeasuredWidth() + max2 + max3;
                    i19++;
                    i36 = max4;
                    i35 = max5;
                }
                i21 = ((((width - paddingLeft) - paddingRight) / 2) + paddingLeft) - (i37 / 2);
                int i41 = i37 + i21;
                if (i21 >= i16) {
                    i16 = i41 > min2 ? i21 - (i41 - min2) : i21;
                }
                size4 = arrayList.size();
                for (i20 = 0; i20 < size4; i20++) {
                    i16 = m((View) arrayList.get(i20), i16, min, iArr);
                }
                arrayList.clear();
            }
            i8 = m(this.f4473d, paddingLeft, min, iArr);
        }
        i9 = i22;
        if (q(this.f4477h)) {
        }
        if (q(this.f4470a)) {
        }
        int currentContentInsetLeft2 = getCurrentContentInsetLeft();
        int currentContentInsetRight2 = getCurrentContentInsetRight();
        iArr[0] = Math.max(0, currentContentInsetLeft2 - i8);
        iArr[1] = Math.max(0, currentContentInsetRight2 - (i22 - i9));
        max = Math.max(i8, currentContentInsetLeft2);
        int min22 = Math.min(i9, i22 - currentContentInsetRight2);
        if (q(this.f4478i)) {
        }
        if (q(this.f4474e)) {
        }
        q4 = q(this.f4471b);
        q5 = q(this.f4472c);
        if (q4) {
        }
        if (!q5) {
        }
        if (!q4) {
        }
        if (!q4) {
        }
        if (!q5) {
        }
        C1223k0 c1223k032 = (C1223k0) c1233t.getLayoutParams();
        C1223k0 c1223k042 = (C1223k0) c1233t2.getLayoutParams();
        int i232 = i10;
        if (q4) {
        }
        i11 = this.f4489w & 112;
        int i242 = max;
        if (i11 != 48) {
        }
        if (z4) {
        }
        ArrayList arrayList2 = this.f4462D;
        a(3, arrayList2);
        size = arrayList2.size();
        i16 = max;
        while (i17 < size) {
        }
        a(5, arrayList2);
        size2 = arrayList2.size();
        while (i18 < size2) {
        }
        a(1, arrayList2);
        int i342 = iArr[0];
        int i352 = iArr[1];
        size3 = arrayList2.size();
        int i362 = i342;
        i19 = 0;
        int i372 = 0;
        while (i19 < size3) {
        }
        i21 = ((((width - paddingLeft) - paddingRight) / 2) + paddingLeft) - (i372 / 2);
        int i412 = i372 + i21;
        if (i21 >= i16) {
        }
        size4 = arrayList2.size();
        while (i20 < size4) {
        }
        arrayList2.clear();
    }

    @Override // android.view.View
    public final void onMeasure(int i4, int i5) {
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        boolean a3 = t0.a(this);
        int i13 = !a3 ? 1 : 0;
        int i14 = 0;
        if (q(this.f4473d)) {
            p(this.f4473d, i4, 0, i5, this.o);
            i6 = j(this.f4473d) + this.f4473d.getMeasuredWidth();
            i7 = Math.max(0, k(this.f4473d) + this.f4473d.getMeasuredHeight());
            i8 = View.combineMeasuredStates(0, this.f4473d.getMeasuredState());
        } else {
            i6 = 0;
            i7 = 0;
            i8 = 0;
        }
        if (q(this.f4477h)) {
            p(this.f4477h, i4, 0, i5, this.o);
            i6 = j(this.f4477h) + this.f4477h.getMeasuredWidth();
            i7 = Math.max(i7, k(this.f4477h) + this.f4477h.getMeasuredHeight());
            i8 = View.combineMeasuredStates(i8, this.f4477h.getMeasuredState());
        }
        int currentContentInsetStart = getCurrentContentInsetStart();
        int max = Math.max(currentContentInsetStart, i6);
        int max2 = Math.max(0, currentContentInsetStart - i6);
        int[] iArr = this.f4464F;
        iArr[a3 ? 1 : 0] = max2;
        if (q(this.f4470a)) {
            p(this.f4470a, i4, max, i5, this.o);
            i9 = j(this.f4470a) + this.f4470a.getMeasuredWidth();
            i7 = Math.max(i7, k(this.f4470a) + this.f4470a.getMeasuredHeight());
            i8 = View.combineMeasuredStates(i8, this.f4470a.getMeasuredState());
        } else {
            i9 = 0;
        }
        int currentContentInsetEnd = getCurrentContentInsetEnd();
        int max3 = max + Math.max(currentContentInsetEnd, i9);
        iArr[i13] = Math.max(0, currentContentInsetEnd - i9);
        if (q(this.f4478i)) {
            max3 += o(this.f4478i, i4, max3, i5, 0, iArr);
            i7 = Math.max(i7, k(this.f4478i) + this.f4478i.getMeasuredHeight());
            i8 = View.combineMeasuredStates(i8, this.f4478i.getMeasuredState());
        }
        if (q(this.f4474e)) {
            max3 += o(this.f4474e, i4, max3, i5, 0, iArr);
            i7 = Math.max(i7, k(this.f4474e) + this.f4474e.getMeasuredHeight());
            i8 = View.combineMeasuredStates(i8, this.f4474e.getMeasuredState());
        }
        int childCount = getChildCount();
        for (int i15 = 0; i15 < childCount; i15++) {
            View childAt = getChildAt(i15);
            if (((C1223k0) childAt.getLayoutParams()).f14043b == 0 && q(childAt)) {
                max3 += o(childAt, i4, max3, i5, 0, iArr);
                int max4 = Math.max(i7, k(childAt) + childAt.getMeasuredHeight());
                i8 = View.combineMeasuredStates(i8, childAt.getMeasuredState());
                i7 = max4;
            } else {
                max3 = max3;
            }
        }
        int i16 = max3;
        int i17 = this.f4485r + this.f4486s;
        int i18 = this.f4483p + this.f4484q;
        if (q(this.f4471b)) {
            o(this.f4471b, i4, i16 + i18, i5, i17, iArr);
            int j4 = j(this.f4471b) + this.f4471b.getMeasuredWidth();
            i10 = k(this.f4471b) + this.f4471b.getMeasuredHeight();
            i11 = View.combineMeasuredStates(i8, this.f4471b.getMeasuredState());
            i12 = j4;
        } else {
            i10 = 0;
            i11 = i8;
            i12 = 0;
        }
        if (q(this.f4472c)) {
            i12 = Math.max(i12, o(this.f4472c, i4, i16 + i18, i5, i17 + i10, iArr));
            i10 += k(this.f4472c) + this.f4472c.getMeasuredHeight();
            i11 = View.combineMeasuredStates(i11, this.f4472c.getMeasuredState());
        }
        int max5 = Math.max(i7, i10);
        int paddingRight = getPaddingRight() + getPaddingLeft() + i16 + i12;
        int paddingBottom = getPaddingBottom() + getPaddingTop() + max5;
        int resolveSizeAndState = View.resolveSizeAndState(Math.max(paddingRight, getSuggestedMinimumWidth()), i4, (-16777216) & i11);
        int resolveSizeAndState2 = View.resolveSizeAndState(Math.max(paddingBottom, getSuggestedMinimumHeight()), i5, i11 << 16);
        if (this.f4468J) {
            int childCount2 = getChildCount();
            for (int i19 = 0; i19 < childCount2; i19++) {
                View childAt2 = getChildAt(i19);
                if (!q(childAt2) || childAt2.getMeasuredWidth() <= 0 || childAt2.getMeasuredHeight() <= 0) {
                }
            }
            setMeasuredDimension(resolveSizeAndState, i14);
        }
        i14 = resolveSizeAndState2;
        setMeasuredDimension(resolveSizeAndState, i14);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        MenuItem findItem;
        if (!(parcelable instanceof m0)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        m0 m0Var = (m0) parcelable;
        super.onRestoreInstanceState(m0Var.f1142a);
        ActionMenuView actionMenuView = this.f4470a;
        j.j jVar = actionMenuView != null ? actionMenuView.f4364p : null;
        int i4 = m0Var.f14047c;
        if (i4 != 0 && this.f4467I != null && jVar != null && (findItem = jVar.findItem(i4)) != null) {
            findItem.expandActionView();
        }
        if (m0Var.f14048d) {
            B.b bVar = this.f4469K;
            removeCallbacks(bVar);
            post(bVar);
        }
    }

    @Override // android.view.View
    public final void onRtlPropertiesChanged(int i4) {
        super.onRtlPropertiesChanged(i4);
        d();
        C1191O c1191o = this.f4487t;
        boolean z = i4 == 1;
        if (z == c1191o.f13959g) {
            return;
        }
        c1191o.f13959g = z;
        if (!c1191o.f13960h) {
            c1191o.f13953a = c1191o.f13957e;
            c1191o.f13954b = c1191o.f13958f;
            return;
        }
        if (z) {
            int i5 = c1191o.f13956d;
            if (i5 == Integer.MIN_VALUE) {
                i5 = c1191o.f13957e;
            }
            c1191o.f13953a = i5;
            int i6 = c1191o.f13955c;
            if (i6 == Integer.MIN_VALUE) {
                i6 = c1191o.f13958f;
            }
            c1191o.f13954b = i6;
            return;
        }
        int i7 = c1191o.f13955c;
        if (i7 == Integer.MIN_VALUE) {
            i7 = c1191o.f13957e;
        }
        c1191o.f13953a = i7;
        int i8 = c1191o.f13956d;
        if (i8 == Integer.MIN_VALUE) {
            i8 = c1191o.f13958f;
        }
        c1191o.f13954b = i8;
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        C1218i c1218i;
        C1212f c1212f;
        k kVar;
        m0 m0Var = new m0(super.onSaveInstanceState());
        C1221j0 c1221j0 = this.f4467I;
        if (c1221j0 != null && (kVar = c1221j0.f14034b) != null) {
            m0Var.f14047c = kVar.f13668a;
        }
        ActionMenuView actionMenuView = this.f4470a;
        m0Var.f14048d = (actionMenuView == null || (c1218i = actionMenuView.f4367s) == null || (c1212f = c1218i.f14027r) == null || !c1212f.b()) ? false : true;
        return m0Var;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f4460B = false;
        }
        if (!this.f4460B) {
            boolean onTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !onTouchEvent) {
                this.f4460B = true;
            }
        }
        if (actionMasked != 1 && actionMasked != 3) {
            return true;
        }
        this.f4460B = false;
        return true;
    }

    public final void p(View view, int i4, int i5, int i6, int i7) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i4, getPaddingRight() + getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i5, marginLayoutParams.width);
        int childMeasureSpec2 = ViewGroup.getChildMeasureSpec(i6, getPaddingBottom() + getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, marginLayoutParams.height);
        int mode = View.MeasureSpec.getMode(childMeasureSpec2);
        if (mode != 1073741824 && i7 >= 0) {
            if (mode != 0) {
                i7 = Math.min(View.MeasureSpec.getSize(childMeasureSpec2), i7);
            }
            childMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i7, 1073741824);
        }
        view.measure(childMeasureSpec, childMeasureSpec2);
    }

    public final boolean q(View view) {
        return (view == null || view.getParent() != this || view.getVisibility() == 8) ? false : true;
    }

    public void setCollapseContentDescription(int i4) {
        setCollapseContentDescription(i4 != 0 ? getContext().getText(i4) : null);
    }

    public void setCollapseIcon(int i4) {
        setCollapseIcon(AbstractC0432a.a(getContext(), i4));
    }

    public void setCollapsible(boolean z) {
        this.f4468J = z;
        requestLayout();
    }

    public void setContentInsetEndWithActions(int i4) {
        if (i4 < 0) {
            i4 = Integer.MIN_VALUE;
        }
        if (i4 != this.v) {
            this.v = i4;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setContentInsetStartWithNavigation(int i4) {
        if (i4 < 0) {
            i4 = Integer.MIN_VALUE;
        }
        if (i4 != this.f4488u) {
            this.f4488u = i4;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setLogo(int i4) {
        setLogo(AbstractC0432a.a(getContext(), i4));
    }

    public void setLogoDescription(int i4) {
        setLogoDescription(getContext().getText(i4));
    }

    public void setNavigationContentDescription(int i4) {
        setNavigationContentDescription(i4 != 0 ? getContext().getText(i4) : null);
    }

    public void setNavigationIcon(int i4) {
        setNavigationIcon(AbstractC0432a.a(getContext(), i4));
    }

    public void setNavigationOnClickListener(View.OnClickListener onClickListener) {
        f();
        this.f4473d.setOnClickListener(onClickListener);
    }

    public void setOverflowIcon(Drawable drawable) {
        e();
        this.f4470a.setOverflowIcon(drawable);
    }

    public void setPopupTheme(int i4) {
        if (this.f4480k != i4) {
            this.f4480k = i4;
            if (i4 == 0) {
                this.f4479j = getContext();
            } else {
                this.f4479j = new ContextThemeWrapper(getContext(), i4);
            }
        }
    }

    public void setSubtitle(int i4) {
        setSubtitle(getContext().getText(i4));
    }

    public void setSubtitleTextColor(int i4) {
        setSubtitleTextColor(ColorStateList.valueOf(i4));
    }

    public void setTitle(int i4) {
        setTitle(getContext().getText(i4));
    }

    public void setTitleMarginBottom(int i4) {
        this.f4486s = i4;
        requestLayout();
    }

    public void setTitleMarginEnd(int i4) {
        this.f4484q = i4;
        requestLayout();
    }

    public void setTitleMarginStart(int i4) {
        this.f4483p = i4;
        requestLayout();
    }

    public void setTitleMarginTop(int i4) {
        this.f4485r = i4;
        requestLayout();
    }

    public void setTitleTextColor(int i4) {
        setTitleTextColor(ColorStateList.valueOf(i4));
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        Context context = getContext();
        C1223k0 c1223k0 = new C1223k0(context, attributeSet);
        c1223k0.f14042a = 0;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0410a.f8471b);
        c1223k0.f14042a = obtainStyledAttributes.getInt(0, 0);
        obtainStyledAttributes.recycle();
        c1223k0.f14043b = 0;
        return c1223k0;
    }

    public void setCollapseContentDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            c();
        }
        C1228o c1228o = this.f4477h;
        if (c1228o != null) {
            c1228o.setContentDescription(charSequence);
        }
    }

    public void setCollapseIcon(Drawable drawable) {
        if (drawable != null) {
            c();
            this.f4477h.setImageDrawable(drawable);
        } else {
            C1228o c1228o = this.f4477h;
            if (c1228o != null) {
                c1228o.setImageDrawable(this.f4475f);
            }
        }
    }

    public void setLogo(Drawable drawable) {
        if (drawable != null) {
            if (this.f4474e == null) {
                this.f4474e = new C1229p(getContext(), 0);
            }
            if (!l(this.f4474e)) {
                b(this.f4474e, true);
            }
        } else {
            C1229p c1229p = this.f4474e;
            if (c1229p != null && l(c1229p)) {
                removeView(this.f4474e);
                this.f4463E.remove(this.f4474e);
            }
        }
        C1229p c1229p2 = this.f4474e;
        if (c1229p2 != null) {
            c1229p2.setImageDrawable(drawable);
        }
    }

    public void setLogoDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence) && this.f4474e == null) {
            this.f4474e = new C1229p(getContext(), 0);
        }
        C1229p c1229p = this.f4474e;
        if (c1229p != null) {
            c1229p.setContentDescription(charSequence);
        }
    }

    public void setNavigationContentDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            f();
        }
        C1228o c1228o = this.f4473d;
        if (c1228o != null) {
            c1228o.setContentDescription(charSequence);
        }
    }

    public void setNavigationIcon(Drawable drawable) {
        if (drawable != null) {
            f();
            if (!l(this.f4473d)) {
                b(this.f4473d, true);
            }
        } else {
            C1228o c1228o = this.f4473d;
            if (c1228o != null && l(c1228o)) {
                removeView(this.f4473d);
                this.f4463E.remove(this.f4473d);
            }
        }
        C1228o c1228o2 = this.f4473d;
        if (c1228o2 != null) {
            c1228o2.setImageDrawable(drawable);
        }
    }

    public void setSubtitle(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            C1233t c1233t = this.f4472c;
            if (c1233t != null && l(c1233t)) {
                removeView(this.f4472c);
                this.f4463E.remove(this.f4472c);
            }
        } else {
            if (this.f4472c == null) {
                Context context = getContext();
                C1233t c1233t2 = new C1233t(context, null);
                this.f4472c = c1233t2;
                c1233t2.setSingleLine();
                this.f4472c.setEllipsize(TextUtils.TruncateAt.END);
                int i4 = this.f4482m;
                if (i4 != 0) {
                    this.f4472c.setTextAppearance(context, i4);
                }
                ColorStateList colorStateList = this.f4459A;
                if (colorStateList != null) {
                    this.f4472c.setTextColor(colorStateList);
                }
            }
            if (!l(this.f4472c)) {
                b(this.f4472c, true);
            }
        }
        C1233t c1233t3 = this.f4472c;
        if (c1233t3 != null) {
            c1233t3.setText(charSequence);
        }
        this.f4491y = charSequence;
    }

    public void setSubtitleTextColor(ColorStateList colorStateList) {
        this.f4459A = colorStateList;
        C1233t c1233t = this.f4472c;
        if (c1233t != null) {
            c1233t.setTextColor(colorStateList);
        }
    }

    public void setTitle(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            C1233t c1233t = this.f4471b;
            if (c1233t != null && l(c1233t)) {
                removeView(this.f4471b);
                this.f4463E.remove(this.f4471b);
            }
        } else {
            if (this.f4471b == null) {
                Context context = getContext();
                C1233t c1233t2 = new C1233t(context, null);
                this.f4471b = c1233t2;
                c1233t2.setSingleLine();
                this.f4471b.setEllipsize(TextUtils.TruncateAt.END);
                int i4 = this.f4481l;
                if (i4 != 0) {
                    this.f4471b.setTextAppearance(context, i4);
                }
                ColorStateList colorStateList = this.z;
                if (colorStateList != null) {
                    this.f4471b.setTextColor(colorStateList);
                }
            }
            if (!l(this.f4471b)) {
                b(this.f4471b, true);
            }
        }
        C1233t c1233t3 = this.f4471b;
        if (c1233t3 != null) {
            c1233t3.setText(charSequence);
        }
        this.f4490x = charSequence;
    }

    public void setTitleTextColor(ColorStateList colorStateList) {
        this.z = colorStateList;
        C1233t c1233t = this.f4471b;
        if (c1233t != null) {
            c1233t.setTextColor(colorStateList);
        }
    }

    public void setOnMenuItemClickListener(InterfaceC1225l0 interfaceC1225l0) {
    }
}
