package androidx.appcompat.widget;

import A.z;
import B.m;
import B0.C0031i;
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
import c.AbstractC0165a;
import com.neptunesoft.languesbacdz.R;
import h.d;
import i.MenuC0211i;
import i.MenuItemC0212j;
import j.C0230f;
import j.C0233i;
import j.C0241q;
import j.C0245v;
import j.InterfaceC0249z;
import j.T;
import j.n0;
import j.o0;
import j.p0;
import j.q0;
import j.r;
import j.r0;
import j.s0;
import j.y0;
import java.lang.reflect.Field;
import java.util.ArrayList;

/* loaded from: classes.dex */
public class Toolbar extends ViewGroup {

    /* renamed from: A, reason: collision with root package name */
    public final int f1507A;

    /* renamed from: B, reason: collision with root package name */
    public CharSequence f1508B;

    /* renamed from: C, reason: collision with root package name */
    public CharSequence f1509C;

    /* renamed from: D, reason: collision with root package name */
    public ColorStateList f1510D;

    /* renamed from: E, reason: collision with root package name */
    public ColorStateList f1511E;

    /* renamed from: F, reason: collision with root package name */
    public boolean f1512F;

    /* renamed from: G, reason: collision with root package name */
    public boolean f1513G;

    /* renamed from: H, reason: collision with root package name */
    public final ArrayList f1514H;

    /* renamed from: I, reason: collision with root package name */
    public final ArrayList f1515I;
    public final int[] J;

    /* renamed from: K, reason: collision with root package name */
    public final m f1516K;

    /* renamed from: L, reason: collision with root package name */
    public s0 f1517L;

    /* renamed from: M, reason: collision with root package name */
    public o0 f1518M;

    /* renamed from: N, reason: collision with root package name */
    public boolean f1519N;

    /* renamed from: O, reason: collision with root package name */
    public final F.b f1520O;

    /* renamed from: e, reason: collision with root package name */
    public ActionMenuView f1521e;

    /* renamed from: f, reason: collision with root package name */
    public C0245v f1522f;

    /* renamed from: g, reason: collision with root package name */
    public C0245v f1523g;

    /* renamed from: h, reason: collision with root package name */
    public C0241q f1524h;

    /* renamed from: i, reason: collision with root package name */
    public r f1525i;

    /* renamed from: j, reason: collision with root package name */
    public final Drawable f1526j;

    /* renamed from: k, reason: collision with root package name */
    public final CharSequence f1527k;

    /* renamed from: l, reason: collision with root package name */
    public C0241q f1528l;

    /* renamed from: m, reason: collision with root package name */
    public View f1529m;

    /* renamed from: n, reason: collision with root package name */
    public Context f1530n;

    /* renamed from: o, reason: collision with root package name */
    public int f1531o;

    /* renamed from: p, reason: collision with root package name */
    public int f1532p;

    /* renamed from: q, reason: collision with root package name */
    public int f1533q;

    /* renamed from: r, reason: collision with root package name */
    public final int f1534r;

    /* renamed from: s, reason: collision with root package name */
    public final int f1535s;

    /* renamed from: t, reason: collision with root package name */
    public int f1536t;

    /* renamed from: u, reason: collision with root package name */
    public int f1537u;
    public int v;

    /* renamed from: w, reason: collision with root package name */
    public int f1538w;

    /* renamed from: x, reason: collision with root package name */
    public T f1539x;

    /* renamed from: y, reason: collision with root package name */
    public int f1540y;

    /* renamed from: z, reason: collision with root package name */
    public int f1541z;

    public Toolbar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.toolbarStyle);
        this.f1507A = 8388627;
        this.f1514H = new ArrayList();
        this.f1515I = new ArrayList();
        this.J = new int[2];
        this.f1516K = new m(27, this);
        this.f1520O = new F.b(6, this);
        C0031i J = C0031i.J(getContext(), attributeSet, AbstractC0165a.f1982t, R.attr.toolbarStyle);
        TypedArray typedArray = (TypedArray) J.f154f;
        this.f1532p = typedArray.getResourceId(28, 0);
        this.f1533q = typedArray.getResourceId(19, 0);
        this.f1507A = typedArray.getInteger(0, 8388627);
        this.f1534r = typedArray.getInteger(2, 48);
        int dimensionPixelOffset = typedArray.getDimensionPixelOffset(22, 0);
        dimensionPixelOffset = typedArray.hasValue(27) ? typedArray.getDimensionPixelOffset(27, dimensionPixelOffset) : dimensionPixelOffset;
        this.f1538w = dimensionPixelOffset;
        this.v = dimensionPixelOffset;
        this.f1537u = dimensionPixelOffset;
        this.f1536t = dimensionPixelOffset;
        int dimensionPixelOffset2 = typedArray.getDimensionPixelOffset(25, -1);
        if (dimensionPixelOffset2 >= 0) {
            this.f1536t = dimensionPixelOffset2;
        }
        int dimensionPixelOffset3 = typedArray.getDimensionPixelOffset(24, -1);
        if (dimensionPixelOffset3 >= 0) {
            this.f1537u = dimensionPixelOffset3;
        }
        int dimensionPixelOffset4 = typedArray.getDimensionPixelOffset(26, -1);
        if (dimensionPixelOffset4 >= 0) {
            this.v = dimensionPixelOffset4;
        }
        int dimensionPixelOffset5 = typedArray.getDimensionPixelOffset(23, -1);
        if (dimensionPixelOffset5 >= 0) {
            this.f1538w = dimensionPixelOffset5;
        }
        this.f1535s = typedArray.getDimensionPixelSize(13, -1);
        int dimensionPixelOffset6 = typedArray.getDimensionPixelOffset(9, Integer.MIN_VALUE);
        int dimensionPixelOffset7 = typedArray.getDimensionPixelOffset(5, Integer.MIN_VALUE);
        int dimensionPixelSize = typedArray.getDimensionPixelSize(7, 0);
        int dimensionPixelSize2 = typedArray.getDimensionPixelSize(8, 0);
        d();
        T t2 = this.f1539x;
        t2.f2921h = false;
        if (dimensionPixelSize != Integer.MIN_VALUE) {
            t2.f2918e = dimensionPixelSize;
            t2.f2914a = dimensionPixelSize;
        }
        if (dimensionPixelSize2 != Integer.MIN_VALUE) {
            t2.f2919f = dimensionPixelSize2;
            t2.f2915b = dimensionPixelSize2;
        }
        if (dimensionPixelOffset6 != Integer.MIN_VALUE || dimensionPixelOffset7 != Integer.MIN_VALUE) {
            t2.a(dimensionPixelOffset6, dimensionPixelOffset7);
        }
        this.f1540y = typedArray.getDimensionPixelOffset(10, Integer.MIN_VALUE);
        this.f1541z = typedArray.getDimensionPixelOffset(6, Integer.MIN_VALUE);
        this.f1526j = J.A(4);
        this.f1527k = typedArray.getText(3);
        CharSequence text = typedArray.getText(21);
        if (!TextUtils.isEmpty(text)) {
            setTitle(text);
        }
        CharSequence text2 = typedArray.getText(18);
        if (!TextUtils.isEmpty(text2)) {
            setSubtitle(text2);
        }
        this.f1530n = getContext();
        setPopupTheme(typedArray.getResourceId(17, 0));
        Drawable A2 = J.A(16);
        if (A2 != null) {
            setNavigationIcon(A2);
        }
        CharSequence text3 = typedArray.getText(15);
        if (!TextUtils.isEmpty(text3)) {
            setNavigationContentDescription(text3);
        }
        Drawable A3 = J.A(11);
        if (A3 != null) {
            setLogo(A3);
        }
        CharSequence text4 = typedArray.getText(12);
        if (!TextUtils.isEmpty(text4)) {
            setLogoDescription(text4);
        }
        if (typedArray.hasValue(29)) {
            setTitleTextColor(J.z(29));
        }
        if (typedArray.hasValue(20)) {
            setSubtitleTextColor(J.z(20));
        }
        if (typedArray.hasValue(14)) {
            getMenuInflater().inflate(typedArray.getResourceId(14, 0), getMenu());
        }
        J.N();
    }

    public static p0 g() {
        p0 p0Var = new p0(-2, -2);
        p0Var.f3028b = 0;
        p0Var.f3027a = 8388627;
        return p0Var;
    }

    private MenuInflater getMenuInflater() {
        return new d(getContext());
    }

    public static p0 h(ViewGroup.LayoutParams layoutParams) {
        boolean z2 = layoutParams instanceof p0;
        if (z2) {
            p0 p0Var = (p0) layoutParams;
            p0 p0Var2 = new p0(p0Var);
            p0Var2.f3028b = 0;
            p0Var2.f3028b = p0Var.f3028b;
            return p0Var2;
        }
        if (z2) {
            p0 p0Var3 = new p0((p0) layoutParams);
            p0Var3.f3028b = 0;
            return p0Var3;
        }
        if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
            p0 p0Var4 = new p0(layoutParams);
            p0Var4.f3028b = 0;
            return p0Var4;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        p0 p0Var5 = new p0(marginLayoutParams);
        p0Var5.f3028b = 0;
        ((ViewGroup.MarginLayoutParams) p0Var5).leftMargin = marginLayoutParams.leftMargin;
        ((ViewGroup.MarginLayoutParams) p0Var5).topMargin = marginLayoutParams.topMargin;
        ((ViewGroup.MarginLayoutParams) p0Var5).rightMargin = marginLayoutParams.rightMargin;
        ((ViewGroup.MarginLayoutParams) p0Var5).bottomMargin = marginLayoutParams.bottomMargin;
        return p0Var5;
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
        Field field = z.f58a;
        boolean z2 = getLayoutDirection() == 1;
        int childCount = getChildCount();
        int absoluteGravity = Gravity.getAbsoluteGravity(i2, getLayoutDirection());
        arrayList.clear();
        if (!z2) {
            for (int i3 = 0; i3 < childCount; i3++) {
                View childAt = getChildAt(i3);
                p0 p0Var = (p0) childAt.getLayoutParams();
                if (p0Var.f3028b == 0 && r(childAt) && i(p0Var.f3027a) == absoluteGravity) {
                    arrayList.add(childAt);
                }
            }
            return;
        }
        for (int i4 = childCount - 1; i4 >= 0; i4--) {
            View childAt2 = getChildAt(i4);
            p0 p0Var2 = (p0) childAt2.getLayoutParams();
            if (p0Var2.f3028b == 0 && r(childAt2) && i(p0Var2.f3027a) == absoluteGravity) {
                arrayList.add(childAt2);
            }
        }
    }

    public final void b(View view, boolean z2) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        p0 g2 = layoutParams == null ? g() : !checkLayoutParams(layoutParams) ? h(layoutParams) : (p0) layoutParams;
        g2.f3028b = 1;
        if (!z2 || this.f1529m == null) {
            addView(view, g2);
        } else {
            view.setLayoutParams(g2);
            this.f1515I.add(view);
        }
    }

    public final void c() {
        if (this.f1528l == null) {
            C0241q c0241q = new C0241q(getContext());
            this.f1528l = c0241q;
            c0241q.setImageDrawable(this.f1526j);
            this.f1528l.setContentDescription(this.f1527k);
            p0 g2 = g();
            g2.f3027a = (this.f1534r & 112) | 8388611;
            g2.f3028b = 2;
            this.f1528l.setLayoutParams(g2);
            this.f1528l.setOnClickListener(new n0(this));
        }
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return super.checkLayoutParams(layoutParams) && (layoutParams instanceof p0);
    }

    public final void d() {
        if (this.f1539x == null) {
            T t2 = new T();
            t2.f2914a = 0;
            t2.f2915b = 0;
            t2.f2916c = Integer.MIN_VALUE;
            t2.f2917d = Integer.MIN_VALUE;
            t2.f2918e = 0;
            t2.f2919f = 0;
            t2.f2920g = false;
            t2.f2921h = false;
            this.f1539x = t2;
        }
    }

    public final void e() {
        if (this.f1521e == null) {
            ActionMenuView actionMenuView = new ActionMenuView(getContext(), null);
            this.f1521e = actionMenuView;
            actionMenuView.setPopupTheme(this.f1531o);
            this.f1521e.setOnMenuItemClickListener(this.f1516K);
            this.f1521e.getClass();
            p0 g2 = g();
            g2.f3027a = (this.f1534r & 112) | 8388613;
            this.f1521e.setLayoutParams(g2);
            b(this.f1521e, false);
        }
        ActionMenuView actionMenuView2 = this.f1521e;
        if (actionMenuView2.f1411t == null) {
            MenuC0211i menuC0211i = (MenuC0211i) actionMenuView2.getMenu();
            if (this.f1518M == null) {
                this.f1518M = new o0(this);
            }
            this.f1521e.setExpandedActionViewsExclusive(true);
            menuC0211i.b(this.f1518M, this.f1530n);
        }
    }

    public final void f() {
        if (this.f1524h == null) {
            this.f1524h = new C0241q(getContext());
            p0 g2 = g();
            g2.f3027a = (this.f1534r & 112) | 8388611;
            this.f1524h.setLayoutParams(g2);
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
        C0241q c0241q = this.f1528l;
        if (c0241q != null) {
            return c0241q.getContentDescription();
        }
        return null;
    }

    public Drawable getCollapseIcon() {
        C0241q c0241q = this.f1528l;
        if (c0241q != null) {
            return c0241q.getDrawable();
        }
        return null;
    }

    public int getContentInsetEnd() {
        T t2 = this.f1539x;
        if (t2 != null) {
            return t2.f2920g ? t2.f2914a : t2.f2915b;
        }
        return 0;
    }

    public int getContentInsetEndWithActions() {
        int i2 = this.f1541z;
        return i2 != Integer.MIN_VALUE ? i2 : getContentInsetEnd();
    }

    public int getContentInsetLeft() {
        T t2 = this.f1539x;
        if (t2 != null) {
            return t2.f2914a;
        }
        return 0;
    }

    public int getContentInsetRight() {
        T t2 = this.f1539x;
        if (t2 != null) {
            return t2.f2915b;
        }
        return 0;
    }

    public int getContentInsetStart() {
        T t2 = this.f1539x;
        if (t2 != null) {
            return t2.f2920g ? t2.f2915b : t2.f2914a;
        }
        return 0;
    }

    public int getContentInsetStartWithNavigation() {
        int i2 = this.f1540y;
        return i2 != Integer.MIN_VALUE ? i2 : getContentInsetStart();
    }

    public int getCurrentContentInsetEnd() {
        MenuC0211i menuC0211i;
        ActionMenuView actionMenuView = this.f1521e;
        return (actionMenuView == null || (menuC0211i = actionMenuView.f1411t) == null || !menuC0211i.hasVisibleItems()) ? getContentInsetEnd() : Math.max(getContentInsetEnd(), Math.max(this.f1541z, 0));
    }

    public int getCurrentContentInsetLeft() {
        Field field = z.f58a;
        return getLayoutDirection() == 1 ? getCurrentContentInsetEnd() : getCurrentContentInsetStart();
    }

    public int getCurrentContentInsetRight() {
        Field field = z.f58a;
        return getLayoutDirection() == 1 ? getCurrentContentInsetStart() : getCurrentContentInsetEnd();
    }

    public int getCurrentContentInsetStart() {
        return getNavigationIcon() != null ? Math.max(getContentInsetStart(), Math.max(this.f1540y, 0)) : getContentInsetStart();
    }

    public Drawable getLogo() {
        r rVar = this.f1525i;
        if (rVar != null) {
            return rVar.getDrawable();
        }
        return null;
    }

    public CharSequence getLogoDescription() {
        r rVar = this.f1525i;
        if (rVar != null) {
            return rVar.getContentDescription();
        }
        return null;
    }

    public Menu getMenu() {
        e();
        return this.f1521e.getMenu();
    }

    public CharSequence getNavigationContentDescription() {
        C0241q c0241q = this.f1524h;
        if (c0241q != null) {
            return c0241q.getContentDescription();
        }
        return null;
    }

    public Drawable getNavigationIcon() {
        C0241q c0241q = this.f1524h;
        if (c0241q != null) {
            return c0241q.getDrawable();
        }
        return null;
    }

    public C0233i getOuterActionMenuPresenter() {
        return null;
    }

    public Drawable getOverflowIcon() {
        e();
        return this.f1521e.getOverflowIcon();
    }

    public Context getPopupContext() {
        return this.f1530n;
    }

    public int getPopupTheme() {
        return this.f1531o;
    }

    public CharSequence getSubtitle() {
        return this.f1509C;
    }

    public final TextView getSubtitleTextView() {
        return this.f1523g;
    }

    public CharSequence getTitle() {
        return this.f1508B;
    }

    public int getTitleMarginBottom() {
        return this.f1538w;
    }

    public int getTitleMarginEnd() {
        return this.f1537u;
    }

    public int getTitleMarginStart() {
        return this.f1536t;
    }

    public int getTitleMarginTop() {
        return this.v;
    }

    public final TextView getTitleTextView() {
        return this.f1522f;
    }

    public InterfaceC0249z getWrapper() {
        Drawable drawable;
        if (this.f1517L == null) {
            s0 s0Var = new s0();
            s0Var.f3046l = 0;
            s0Var.f3035a = this;
            s0Var.f3042h = getTitle();
            s0Var.f3043i = getSubtitle();
            s0Var.f3041g = s0Var.f3042h != null;
            s0Var.f3040f = getNavigationIcon();
            C0031i J = C0031i.J(getContext(), null, AbstractC0165a.f1963a, R.attr.actionBarStyle);
            s0Var.f3047m = J.A(15);
            TypedArray typedArray = (TypedArray) J.f154f;
            CharSequence text = typedArray.getText(27);
            if (!TextUtils.isEmpty(text)) {
                s0Var.f3041g = true;
                s0Var.f3042h = text;
                if ((s0Var.f3036b & 8) != 0) {
                    s0Var.f3035a.setTitle(text);
                }
            }
            CharSequence text2 = typedArray.getText(25);
            if (!TextUtils.isEmpty(text2)) {
                s0Var.f3043i = text2;
                if ((s0Var.f3036b & 8) != 0) {
                    setSubtitle(text2);
                }
            }
            Drawable A2 = J.A(20);
            if (A2 != null) {
                s0Var.f3039e = A2;
                s0Var.c();
            }
            Drawable A3 = J.A(17);
            if (A3 != null) {
                s0Var.f3038d = A3;
                s0Var.c();
            }
            if (s0Var.f3040f == null && (drawable = s0Var.f3047m) != null) {
                s0Var.f3040f = drawable;
                int i2 = s0Var.f3036b & 4;
                Toolbar toolbar = s0Var.f3035a;
                if (i2 != 0) {
                    toolbar.setNavigationIcon(drawable);
                } else {
                    toolbar.setNavigationIcon((Drawable) null);
                }
            }
            s0Var.a(typedArray.getInt(10, 0));
            int resourceId = typedArray.getResourceId(9, 0);
            if (resourceId != 0) {
                View inflate = LayoutInflater.from(getContext()).inflate(resourceId, (ViewGroup) this, false);
                View view = s0Var.f3037c;
                if (view != null && (s0Var.f3036b & 16) != 0) {
                    removeView(view);
                }
                s0Var.f3037c = inflate;
                if (inflate != null && (s0Var.f3036b & 16) != 0) {
                    addView(inflate);
                }
                s0Var.a(s0Var.f3036b | 16);
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
                this.f1539x.a(max, max2);
            }
            int resourceId2 = typedArray.getResourceId(28, 0);
            if (resourceId2 != 0) {
                Context context = getContext();
                this.f1532p = resourceId2;
                C0245v c0245v = this.f1522f;
                if (c0245v != null) {
                    c0245v.setTextAppearance(context, resourceId2);
                }
            }
            int resourceId3 = typedArray.getResourceId(26, 0);
            if (resourceId3 != 0) {
                Context context2 = getContext();
                this.f1533q = resourceId3;
                C0245v c0245v2 = this.f1523g;
                if (c0245v2 != null) {
                    c0245v2.setTextAppearance(context2, resourceId3);
                }
            }
            int resourceId4 = typedArray.getResourceId(22, 0);
            if (resourceId4 != 0) {
                setPopupTheme(resourceId4);
            }
            J.N();
            if (R.string.abc_action_bar_up_description != s0Var.f3046l) {
                s0Var.f3046l = R.string.abc_action_bar_up_description;
                if (TextUtils.isEmpty(getNavigationContentDescription())) {
                    int i3 = s0Var.f3046l;
                    s0Var.f3044j = i3 != 0 ? getContext().getString(i3) : null;
                    s0Var.b();
                }
            }
            s0Var.f3044j = getNavigationContentDescription();
            setNavigationOnClickListener(new n0(s0Var));
            this.f1517L = s0Var;
        }
        return this.f1517L;
    }

    public final int i(int i2) {
        Field field = z.f58a;
        int layoutDirection = getLayoutDirection();
        int absoluteGravity = Gravity.getAbsoluteGravity(i2, layoutDirection) & 7;
        return (absoluteGravity == 1 || absoluteGravity == 3 || absoluteGravity == 5) ? absoluteGravity : layoutDirection == 1 ? 5 : 3;
    }

    public final int j(View view, int i2) {
        p0 p0Var = (p0) view.getLayoutParams();
        int measuredHeight = view.getMeasuredHeight();
        int i3 = i2 > 0 ? (measuredHeight - i2) / 2 : 0;
        int i4 = p0Var.f3027a & 112;
        if (i4 != 16 && i4 != 48 && i4 != 80) {
            i4 = this.f1507A & 112;
        }
        if (i4 == 48) {
            return getPaddingTop() - i3;
        }
        if (i4 == 80) {
            return (((getHeight() - getPaddingBottom()) - measuredHeight) - ((ViewGroup.MarginLayoutParams) p0Var).bottomMargin) - i3;
        }
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int height = getHeight();
        int i5 = (((height - paddingTop) - paddingBottom) - measuredHeight) / 2;
        int i6 = ((ViewGroup.MarginLayoutParams) p0Var).topMargin;
        if (i5 < i6) {
            i5 = i6;
        } else {
            int i7 = (((height - paddingBottom) - measuredHeight) - i5) - paddingTop;
            int i8 = ((ViewGroup.MarginLayoutParams) p0Var).bottomMargin;
            if (i7 < i8) {
                i5 = Math.max(0, i5 - (i8 - i7));
            }
        }
        return paddingTop + i5;
    }

    public final boolean m(View view) {
        return view.getParent() == this || this.f1515I.contains(view);
    }

    public final int n(View view, int i2, int i3, int[] iArr) {
        p0 p0Var = (p0) view.getLayoutParams();
        int i4 = ((ViewGroup.MarginLayoutParams) p0Var).leftMargin - iArr[0];
        int max = Math.max(0, i4) + i2;
        iArr[0] = Math.max(0, -i4);
        int j2 = j(view, i3);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(max, j2, max + measuredWidth, view.getMeasuredHeight() + j2);
        return measuredWidth + ((ViewGroup.MarginLayoutParams) p0Var).rightMargin + max;
    }

    public final int o(View view, int i2, int i3, int[] iArr) {
        p0 p0Var = (p0) view.getLayoutParams();
        int i4 = ((ViewGroup.MarginLayoutParams) p0Var).rightMargin - iArr[1];
        int max = i2 - Math.max(0, i4);
        iArr[1] = Math.max(0, -i4);
        int j2 = j(view, i3);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(max - measuredWidth, j2, max, view.getMeasuredHeight() + j2);
        return max - (measuredWidth + ((ViewGroup.MarginLayoutParams) p0Var).leftMargin);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeCallbacks(this.f1520O);
    }

    @Override // android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.f1513G = false;
        }
        if (!this.f1513G) {
            boolean onHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !onHoverEvent) {
                this.f1513G = true;
            }
        }
        if (actionMasked == 10 || actionMasked == 3) {
            this.f1513G = false;
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:113:0x01a2  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x029b A[LOOP:0: B:40:0x0299->B:41:0x029b, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x02b8 A[LOOP:1: B:44:0x02b6->B:45:0x02b8, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x02d6 A[LOOP:2: B:48:0x02d4->B:49:0x02d6, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0317  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0325 A[LOOP:3: B:57:0x0323->B:58:0x0325, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01b1  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0222  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
        int i6;
        int i7;
        boolean r2;
        boolean r3;
        int i8;
        int i9;
        int i10;
        int i11;
        boolean z3;
        int i12;
        int i13;
        int i14;
        int paddingTop;
        int i15;
        int i16;
        int i17;
        int i18;
        int size;
        int i19;
        int i20;
        int size2;
        int i21;
        int size3;
        int i22;
        int i23;
        int size4;
        int i24;
        Field field = z.f58a;
        boolean z4 = getLayoutDirection() == 1;
        int width = getWidth();
        int height = getHeight();
        int paddingLeft = getPaddingLeft();
        int paddingRight = getPaddingRight();
        int paddingTop2 = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int i25 = width - paddingRight;
        int[] iArr = this.J;
        iArr[1] = 0;
        iArr[0] = 0;
        int minimumHeight = getMinimumHeight();
        int min = minimumHeight >= 0 ? Math.min(minimumHeight, i5 - i3) : 0;
        if (!r(this.f1524h)) {
            i6 = paddingLeft;
        } else {
            if (z4) {
                i7 = o(this.f1524h, i25, min, iArr);
                i6 = paddingLeft;
                if (r(this.f1528l)) {
                    if (z4) {
                        i7 = o(this.f1528l, i7, min, iArr);
                    } else {
                        i6 = n(this.f1528l, i6, min, iArr);
                    }
                }
                if (r(this.f1521e)) {
                    if (z4) {
                        i6 = n(this.f1521e, i6, min, iArr);
                    } else {
                        i7 = o(this.f1521e, i7, min, iArr);
                    }
                }
                int currentContentInsetLeft = getCurrentContentInsetLeft();
                int currentContentInsetRight = getCurrentContentInsetRight();
                iArr[0] = Math.max(0, currentContentInsetLeft - i6);
                iArr[1] = Math.max(0, currentContentInsetRight - (i25 - i7));
                int max = Math.max(i6, currentContentInsetLeft);
                int min2 = Math.min(i7, i25 - currentContentInsetRight);
                if (r(this.f1529m)) {
                    if (z4) {
                        min2 = o(this.f1529m, min2, min, iArr);
                    } else {
                        max = n(this.f1529m, max, min, iArr);
                    }
                }
                if (r(this.f1525i)) {
                    if (z4) {
                        min2 = o(this.f1525i, min2, min, iArr);
                    } else {
                        max = n(this.f1525i, max, min, iArr);
                    }
                }
                r2 = r(this.f1522f);
                r3 = r(this.f1523g);
                if (r2) {
                    i8 = paddingRight;
                    i9 = 0;
                } else {
                    p0 p0Var = (p0) this.f1522f.getLayoutParams();
                    i8 = paddingRight;
                    i9 = ((ViewGroup.MarginLayoutParams) p0Var).bottomMargin + this.f1522f.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) p0Var).topMargin;
                }
                if (r3) {
                    i10 = width;
                } else {
                    p0 p0Var2 = (p0) this.f1523g.getLayoutParams();
                    i10 = width;
                    i9 += this.f1523g.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) p0Var2).topMargin + ((ViewGroup.MarginLayoutParams) p0Var2).bottomMargin;
                }
                if (!r2 || r3) {
                    C0245v c0245v = !r2 ? this.f1522f : this.f1523g;
                    C0245v c0245v2 = !r3 ? this.f1523g : this.f1522f;
                    p0 p0Var3 = (p0) c0245v.getLayoutParams();
                    p0 p0Var4 = (p0) c0245v2.getLayoutParams();
                    if ((r2 || this.f1522f.getMeasuredWidth() <= 0) && (!r3 || this.f1523g.getMeasuredWidth() <= 0)) {
                        i11 = paddingLeft;
                        z3 = false;
                    } else {
                        i11 = paddingLeft;
                        z3 = true;
                    }
                    i12 = this.f1507A & 112;
                    i13 = min;
                    if (i12 != 48) {
                        i14 = max;
                        paddingTop = getPaddingTop() + ((ViewGroup.MarginLayoutParams) p0Var3).topMargin + this.v;
                    } else if (i12 != 80) {
                        int i26 = (((height - paddingTop2) - paddingBottom) - i9) / 2;
                        i14 = max;
                        int i27 = ((ViewGroup.MarginLayoutParams) p0Var3).topMargin + this.v;
                        if (i26 < i27) {
                            i26 = i27;
                        } else {
                            int i28 = (((height - paddingBottom) - i9) - i26) - paddingTop2;
                            int i29 = ((ViewGroup.MarginLayoutParams) p0Var3).bottomMargin;
                            int i30 = this.f1538w;
                            if (i28 < i29 + i30) {
                                i26 = Math.max(0, i26 - ((((ViewGroup.MarginLayoutParams) p0Var4).bottomMargin + i30) - i28));
                            }
                        }
                        paddingTop = paddingTop2 + i26;
                    } else {
                        i14 = max;
                        paddingTop = (((height - paddingBottom) - ((ViewGroup.MarginLayoutParams) p0Var4).bottomMargin) - this.f1538w) - i9;
                    }
                    if (z4) {
                        int i31 = (z3 ? this.f1536t : 0) - iArr[0];
                        int max2 = Math.max(0, i31) + i14;
                        iArr[0] = Math.max(0, -i31);
                        if (r2) {
                            p0 p0Var5 = (p0) this.f1522f.getLayoutParams();
                            int measuredWidth = this.f1522f.getMeasuredWidth() + max2;
                            int measuredHeight = this.f1522f.getMeasuredHeight() + paddingTop;
                            this.f1522f.layout(max2, paddingTop, measuredWidth, measuredHeight);
                            i15 = measuredWidth + this.f1537u;
                            paddingTop = measuredHeight + ((ViewGroup.MarginLayoutParams) p0Var5).bottomMargin;
                        } else {
                            i15 = max2;
                        }
                        if (r3) {
                            int i32 = paddingTop + ((ViewGroup.MarginLayoutParams) ((p0) this.f1523g.getLayoutParams())).topMargin;
                            int measuredWidth2 = this.f1523g.getMeasuredWidth() + max2;
                            this.f1523g.layout(max2, i32, measuredWidth2, this.f1523g.getMeasuredHeight() + i32);
                            i16 = measuredWidth2 + this.f1537u;
                        } else {
                            i16 = max2;
                        }
                        max = z3 ? Math.max(i15, i16) : max2;
                    } else {
                        int i33 = (z3 ? this.f1536t : 0) - iArr[1];
                        min2 -= Math.max(0, i33);
                        iArr[1] = Math.max(0, -i33);
                        if (r2) {
                            p0 p0Var6 = (p0) this.f1522f.getLayoutParams();
                            int measuredWidth3 = min2 - this.f1522f.getMeasuredWidth();
                            int measuredHeight2 = this.f1522f.getMeasuredHeight() + paddingTop;
                            this.f1522f.layout(measuredWidth3, paddingTop, min2, measuredHeight2);
                            i17 = measuredWidth3 - this.f1537u;
                            paddingTop = measuredHeight2 + ((ViewGroup.MarginLayoutParams) p0Var6).bottomMargin;
                        } else {
                            i17 = min2;
                        }
                        if (r3) {
                            int i34 = paddingTop + ((ViewGroup.MarginLayoutParams) ((p0) this.f1523g.getLayoutParams())).topMargin;
                            this.f1523g.layout(min2 - this.f1523g.getMeasuredWidth(), i34, min2, this.f1523g.getMeasuredHeight() + i34);
                            i18 = min2 - this.f1537u;
                        } else {
                            i18 = min2;
                        }
                        if (z3) {
                            min2 = Math.min(i17, i18);
                        }
                        max = i14;
                    }
                } else {
                    i11 = paddingLeft;
                    i13 = min;
                }
                ArrayList arrayList = this.f1514H;
                a(arrayList, 3);
                size = arrayList.size();
                i19 = max;
                for (i20 = 0; i20 < size; i20++) {
                    i19 = n((View) arrayList.get(i20), i19, i13, iArr);
                }
                int i35 = i13;
                a(arrayList, 5);
                size2 = arrayList.size();
                for (i21 = 0; i21 < size2; i21++) {
                    min2 = o((View) arrayList.get(i21), min2, i35, iArr);
                }
                a(arrayList, 1);
                int i36 = iArr[0];
                int i37 = iArr[1];
                size3 = arrayList.size();
                int i38 = i37;
                int i39 = i36;
                i22 = 0;
                int i40 = 0;
                while (i22 < size3) {
                    View view = (View) arrayList.get(i22);
                    p0 p0Var7 = (p0) view.getLayoutParams();
                    int i41 = ((ViewGroup.MarginLayoutParams) p0Var7).leftMargin - i39;
                    int i42 = ((ViewGroup.MarginLayoutParams) p0Var7).rightMargin - i38;
                    int max3 = Math.max(0, i41);
                    int max4 = Math.max(0, i42);
                    int max5 = Math.max(0, -i41);
                    int max6 = Math.max(0, -i42);
                    i40 += view.getMeasuredWidth() + max3 + max4;
                    i22++;
                    i38 = max6;
                    i39 = max5;
                }
                i23 = ((((i10 - i11) - i8) / 2) + i11) - (i40 / 2);
                int i43 = i40 + i23;
                if (i23 >= i19) {
                    i19 = i43 > min2 ? i23 - (i43 - min2) : i23;
                }
                size4 = arrayList.size();
                for (i24 = 0; i24 < size4; i24++) {
                    i19 = n((View) arrayList.get(i24), i19, i35, iArr);
                }
                arrayList.clear();
            }
            i6 = n(this.f1524h, paddingLeft, min, iArr);
        }
        i7 = i25;
        if (r(this.f1528l)) {
        }
        if (r(this.f1521e)) {
        }
        int currentContentInsetLeft2 = getCurrentContentInsetLeft();
        int currentContentInsetRight2 = getCurrentContentInsetRight();
        iArr[0] = Math.max(0, currentContentInsetLeft2 - i6);
        iArr[1] = Math.max(0, currentContentInsetRight2 - (i25 - i7));
        int max7 = Math.max(i6, currentContentInsetLeft2);
        int min22 = Math.min(i7, i25 - currentContentInsetRight2);
        if (r(this.f1529m)) {
        }
        if (r(this.f1525i)) {
        }
        r2 = r(this.f1522f);
        r3 = r(this.f1523g);
        if (r2) {
        }
        if (r3) {
        }
        if (r2) {
        }
        if (!r2) {
        }
        if (!r3) {
        }
        p0 p0Var32 = (p0) c0245v.getLayoutParams();
        p0 p0Var42 = (p0) c0245v2.getLayoutParams();
        if (r2) {
        }
        i11 = paddingLeft;
        z3 = false;
        i12 = this.f1507A & 112;
        i13 = min;
        if (i12 != 48) {
        }
        if (z4) {
        }
        ArrayList arrayList2 = this.f1514H;
        a(arrayList2, 3);
        size = arrayList2.size();
        i19 = max7;
        while (i20 < size) {
        }
        int i352 = i13;
        a(arrayList2, 5);
        size2 = arrayList2.size();
        while (i21 < size2) {
        }
        a(arrayList2, 1);
        int i362 = iArr[0];
        int i372 = iArr[1];
        size3 = arrayList2.size();
        int i382 = i372;
        int i392 = i362;
        i22 = 0;
        int i402 = 0;
        while (i22 < size3) {
        }
        i23 = ((((i10 - i11) - i8) / 2) + i11) - (i402 / 2);
        int i432 = i402 + i23;
        if (i23 >= i19) {
        }
        size4 = arrayList2.size();
        while (i24 < size4) {
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
        boolean a2 = y0.a(this);
        int i11 = !a2 ? 1 : 0;
        int i12 = 0;
        if (r(this.f1524h)) {
            q(this.f1524h, i2, 0, i3, this.f1535s);
            i4 = k(this.f1524h) + this.f1524h.getMeasuredWidth();
            i5 = Math.max(0, l(this.f1524h) + this.f1524h.getMeasuredHeight());
            i6 = View.combineMeasuredStates(0, this.f1524h.getMeasuredState());
        } else {
            i4 = 0;
            i5 = 0;
            i6 = 0;
        }
        if (r(this.f1528l)) {
            q(this.f1528l, i2, 0, i3, this.f1535s);
            i4 = k(this.f1528l) + this.f1528l.getMeasuredWidth();
            i5 = Math.max(i5, l(this.f1528l) + this.f1528l.getMeasuredHeight());
            i6 = View.combineMeasuredStates(i6, this.f1528l.getMeasuredState());
        }
        int currentContentInsetStart = getCurrentContentInsetStart();
        int max = Math.max(currentContentInsetStart, i4);
        int max2 = Math.max(0, currentContentInsetStart - i4);
        int[] iArr = this.J;
        iArr[a2 ? 1 : 0] = max2;
        if (r(this.f1521e)) {
            q(this.f1521e, i2, max, i3, this.f1535s);
            i7 = k(this.f1521e) + this.f1521e.getMeasuredWidth();
            i5 = Math.max(i5, l(this.f1521e) + this.f1521e.getMeasuredHeight());
            i6 = View.combineMeasuredStates(i6, this.f1521e.getMeasuredState());
        } else {
            i7 = 0;
        }
        int currentContentInsetEnd = getCurrentContentInsetEnd();
        int max3 = max + Math.max(currentContentInsetEnd, i7);
        iArr[i11] = Math.max(0, currentContentInsetEnd - i7);
        if (r(this.f1529m)) {
            max3 += p(this.f1529m, i2, max3, i3, 0, iArr);
            i5 = Math.max(i5, l(this.f1529m) + this.f1529m.getMeasuredHeight());
            i6 = View.combineMeasuredStates(i6, this.f1529m.getMeasuredState());
        }
        if (r(this.f1525i)) {
            max3 += p(this.f1525i, i2, max3, i3, 0, iArr);
            i5 = Math.max(i5, l(this.f1525i) + this.f1525i.getMeasuredHeight());
            i6 = View.combineMeasuredStates(i6, this.f1525i.getMeasuredState());
        }
        int childCount = getChildCount();
        for (int i13 = 0; i13 < childCount; i13++) {
            View childAt = getChildAt(i13);
            if (((p0) childAt.getLayoutParams()).f3028b == 0 && r(childAt)) {
                max3 += p(childAt, i2, max3, i3, 0, iArr);
                i5 = Math.max(i5, l(childAt) + childAt.getMeasuredHeight());
                i6 = View.combineMeasuredStates(i6, childAt.getMeasuredState());
            }
        }
        int i14 = this.v + this.f1538w;
        int i15 = this.f1536t + this.f1537u;
        if (r(this.f1522f)) {
            p(this.f1522f, i2, max3 + i15, i3, i14, iArr);
            int k2 = k(this.f1522f) + this.f1522f.getMeasuredWidth();
            i10 = l(this.f1522f) + this.f1522f.getMeasuredHeight();
            i8 = View.combineMeasuredStates(i6, this.f1522f.getMeasuredState());
            i9 = k2;
        } else {
            i8 = i6;
            i9 = 0;
            i10 = 0;
        }
        if (r(this.f1523g)) {
            i9 = Math.max(i9, p(this.f1523g, i2, max3 + i15, i3, i10 + i14, iArr));
            i10 += l(this.f1523g) + this.f1523g.getMeasuredHeight();
            i8 = View.combineMeasuredStates(i8, this.f1523g.getMeasuredState());
        }
        int max4 = Math.max(i5, i10);
        int paddingRight = getPaddingRight() + getPaddingLeft();
        int paddingBottom = getPaddingBottom() + getPaddingTop() + max4;
        int resolveSizeAndState = View.resolveSizeAndState(Math.max(paddingRight + max3 + i9, getSuggestedMinimumWidth()), i2, (-16777216) & i8);
        int resolveSizeAndState2 = View.resolveSizeAndState(Math.max(paddingBottom, getSuggestedMinimumHeight()), i3, i8 << 16);
        if (this.f1519N) {
            int childCount2 = getChildCount();
            for (int i16 = 0; i16 < childCount2; i16++) {
                View childAt2 = getChildAt(i16);
                if (!r(childAt2) || childAt2.getMeasuredWidth() <= 0 || childAt2.getMeasuredHeight() <= 0) {
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
        if (!(parcelable instanceof r0)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        r0 r0Var = (r0) parcelable;
        super.onRestoreInstanceState(r0Var.f495a);
        ActionMenuView actionMenuView = this.f1521e;
        MenuC0211i menuC0211i = actionMenuView != null ? actionMenuView.f1411t : null;
        int i2 = r0Var.f3033c;
        if (i2 != 0 && this.f1518M != null && menuC0211i != null && (findItem = menuC0211i.findItem(i2)) != null) {
            findItem.expandActionView();
        }
        if (r0Var.f3034d) {
            F.b bVar = this.f1520O;
            removeCallbacks(bVar);
            post(bVar);
        }
    }

    @Override // android.view.View
    public final void onRtlPropertiesChanged(int i2) {
        super.onRtlPropertiesChanged(i2);
        d();
        T t2 = this.f1539x;
        boolean z2 = i2 == 1;
        if (z2 == t2.f2920g) {
            return;
        }
        t2.f2920g = z2;
        if (!t2.f2921h) {
            t2.f2914a = t2.f2918e;
            t2.f2915b = t2.f2919f;
            return;
        }
        if (z2) {
            int i3 = t2.f2917d;
            if (i3 == Integer.MIN_VALUE) {
                i3 = t2.f2918e;
            }
            t2.f2914a = i3;
            int i4 = t2.f2916c;
            if (i4 == Integer.MIN_VALUE) {
                i4 = t2.f2919f;
            }
            t2.f2915b = i4;
            return;
        }
        int i5 = t2.f2916c;
        if (i5 == Integer.MIN_VALUE) {
            i5 = t2.f2918e;
        }
        t2.f2914a = i5;
        int i6 = t2.f2917d;
        if (i6 == Integer.MIN_VALUE) {
            i6 = t2.f2919f;
        }
        t2.f2915b = i6;
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        C0233i c0233i;
        C0230f c0230f;
        MenuItemC0212j menuItemC0212j;
        r0 r0Var = new r0(super.onSaveInstanceState());
        o0 o0Var = this.f1518M;
        if (o0Var != null && (menuItemC0212j = o0Var.f3022f) != null) {
            r0Var.f3033c = menuItemC0212j.f2430a;
        }
        ActionMenuView actionMenuView = this.f1521e;
        r0Var.f3034d = (actionMenuView == null || (c0233i = actionMenuView.f1413w) == null || (c0230f = c0233i.v) == null || !c0230f.b()) ? false : true;
        return r0Var;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f1512F = false;
        }
        if (!this.f1512F) {
            boolean onTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !onTouchEvent) {
                this.f1512F = true;
            }
        }
        if (actionMasked == 1 || actionMasked == 3) {
            this.f1512F = false;
        }
        return true;
    }

    public final int p(View view, int i2, int i3, int i4, int i5, int[] iArr) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int i6 = marginLayoutParams.leftMargin - iArr[0];
        int i7 = marginLayoutParams.rightMargin - iArr[1];
        int max = Math.max(0, i7) + Math.max(0, i6);
        iArr[0] = Math.max(0, -i6);
        iArr[1] = Math.max(0, -i7);
        view.measure(ViewGroup.getChildMeasureSpec(i2, getPaddingRight() + getPaddingLeft() + max + i3, marginLayoutParams.width), ViewGroup.getChildMeasureSpec(i4, getPaddingBottom() + getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i5, marginLayoutParams.height));
        return view.getMeasuredWidth() + max;
    }

    public final void q(View view, int i2, int i3, int i4, int i5) {
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

    public final boolean r(View view) {
        return (view == null || view.getParent() != this || view.getVisibility() == 8) ? false : true;
    }

    public void setCollapseContentDescription(int i2) {
        setCollapseContentDescription(i2 != 0 ? getContext().getText(i2) : null);
    }

    public void setCollapseIcon(int i2) {
        setCollapseIcon(d.b.c(getContext(), i2));
    }

    public void setCollapsible(boolean z2) {
        this.f1519N = z2;
        requestLayout();
    }

    public void setContentInsetEndWithActions(int i2) {
        if (i2 < 0) {
            i2 = Integer.MIN_VALUE;
        }
        if (i2 != this.f1541z) {
            this.f1541z = i2;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setContentInsetStartWithNavigation(int i2) {
        if (i2 < 0) {
            i2 = Integer.MIN_VALUE;
        }
        if (i2 != this.f1540y) {
            this.f1540y = i2;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setLogo(int i2) {
        setLogo(d.b.c(getContext(), i2));
    }

    public void setLogoDescription(int i2) {
        setLogoDescription(getContext().getText(i2));
    }

    public void setNavigationContentDescription(int i2) {
        setNavigationContentDescription(i2 != 0 ? getContext().getText(i2) : null);
    }

    public void setNavigationIcon(int i2) {
        setNavigationIcon(d.b.c(getContext(), i2));
    }

    public void setNavigationOnClickListener(View.OnClickListener onClickListener) {
        f();
        this.f1524h.setOnClickListener(onClickListener);
    }

    public void setOverflowIcon(Drawable drawable) {
        e();
        this.f1521e.setOverflowIcon(drawable);
    }

    public void setPopupTheme(int i2) {
        if (this.f1531o != i2) {
            this.f1531o = i2;
            if (i2 == 0) {
                this.f1530n = getContext();
            } else {
                this.f1530n = new ContextThemeWrapper(getContext(), i2);
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
        this.f1538w = i2;
        requestLayout();
    }

    public void setTitleMarginEnd(int i2) {
        this.f1537u = i2;
        requestLayout();
    }

    public void setTitleMarginStart(int i2) {
        this.f1536t = i2;
        requestLayout();
    }

    public void setTitleMarginTop(int i2) {
        this.v = i2;
        requestLayout();
    }

    public void setTitleTextColor(int i2) {
        setTitleTextColor(ColorStateList.valueOf(i2));
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        Context context = getContext();
        p0 p0Var = new p0(context, attributeSet);
        p0Var.f3027a = 0;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0165a.f1964b);
        p0Var.f3027a = obtainStyledAttributes.getInt(0, 0);
        obtainStyledAttributes.recycle();
        p0Var.f3028b = 0;
        return p0Var;
    }

    public void setCollapseContentDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            c();
        }
        C0241q c0241q = this.f1528l;
        if (c0241q != null) {
            c0241q.setContentDescription(charSequence);
        }
    }

    public void setCollapseIcon(Drawable drawable) {
        if (drawable != null) {
            c();
            this.f1528l.setImageDrawable(drawable);
        } else {
            C0241q c0241q = this.f1528l;
            if (c0241q != null) {
                c0241q.setImageDrawable(this.f1526j);
            }
        }
    }

    public void setLogo(Drawable drawable) {
        if (drawable != null) {
            if (this.f1525i == null) {
                this.f1525i = new r(getContext(), 0);
            }
            if (!m(this.f1525i)) {
                b(this.f1525i, true);
            }
        } else {
            r rVar = this.f1525i;
            if (rVar != null && m(rVar)) {
                removeView(this.f1525i);
                this.f1515I.remove(this.f1525i);
            }
        }
        r rVar2 = this.f1525i;
        if (rVar2 != null) {
            rVar2.setImageDrawable(drawable);
        }
    }

    public void setLogoDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence) && this.f1525i == null) {
            this.f1525i = new r(getContext(), 0);
        }
        r rVar = this.f1525i;
        if (rVar != null) {
            rVar.setContentDescription(charSequence);
        }
    }

    public void setNavigationContentDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            f();
        }
        C0241q c0241q = this.f1524h;
        if (c0241q != null) {
            c0241q.setContentDescription(charSequence);
        }
    }

    public void setNavigationIcon(Drawable drawable) {
        if (drawable != null) {
            f();
            if (!m(this.f1524h)) {
                b(this.f1524h, true);
            }
        } else {
            C0241q c0241q = this.f1524h;
            if (c0241q != null && m(c0241q)) {
                removeView(this.f1524h);
                this.f1515I.remove(this.f1524h);
            }
        }
        C0241q c0241q2 = this.f1524h;
        if (c0241q2 != null) {
            c0241q2.setImageDrawable(drawable);
        }
    }

    public void setSubtitle(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            C0245v c0245v = this.f1523g;
            if (c0245v != null && m(c0245v)) {
                removeView(this.f1523g);
                this.f1515I.remove(this.f1523g);
            }
        } else {
            if (this.f1523g == null) {
                Context context = getContext();
                C0245v c0245v2 = new C0245v(context, null);
                this.f1523g = c0245v2;
                c0245v2.setSingleLine();
                this.f1523g.setEllipsize(TextUtils.TruncateAt.END);
                int i2 = this.f1533q;
                if (i2 != 0) {
                    this.f1523g.setTextAppearance(context, i2);
                }
                ColorStateList colorStateList = this.f1511E;
                if (colorStateList != null) {
                    this.f1523g.setTextColor(colorStateList);
                }
            }
            if (!m(this.f1523g)) {
                b(this.f1523g, true);
            }
        }
        C0245v c0245v3 = this.f1523g;
        if (c0245v3 != null) {
            c0245v3.setText(charSequence);
        }
        this.f1509C = charSequence;
    }

    public void setSubtitleTextColor(ColorStateList colorStateList) {
        this.f1511E = colorStateList;
        C0245v c0245v = this.f1523g;
        if (c0245v != null) {
            c0245v.setTextColor(colorStateList);
        }
    }

    public void setTitle(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            C0245v c0245v = this.f1522f;
            if (c0245v != null && m(c0245v)) {
                removeView(this.f1522f);
                this.f1515I.remove(this.f1522f);
            }
        } else {
            if (this.f1522f == null) {
                Context context = getContext();
                C0245v c0245v2 = new C0245v(context, null);
                this.f1522f = c0245v2;
                c0245v2.setSingleLine();
                this.f1522f.setEllipsize(TextUtils.TruncateAt.END);
                int i2 = this.f1532p;
                if (i2 != 0) {
                    this.f1522f.setTextAppearance(context, i2);
                }
                ColorStateList colorStateList = this.f1510D;
                if (colorStateList != null) {
                    this.f1522f.setTextColor(colorStateList);
                }
            }
            if (!m(this.f1522f)) {
                b(this.f1522f, true);
            }
        }
        C0245v c0245v3 = this.f1522f;
        if (c0245v3 != null) {
            c0245v3.setText(charSequence);
        }
        this.f1508B = charSequence;
    }

    public void setTitleTextColor(ColorStateList colorStateList) {
        this.f1510D = colorStateList;
        C0245v c0245v = this.f1522f;
        if (c0245v != null) {
            c0245v.setTextColor(colorStateList);
        }
    }

    public void setOnMenuItemClickListener(q0 q0Var) {
    }
}
