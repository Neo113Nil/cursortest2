package androidx.appcompat.widget;

import D.D;
import a6.d;
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
import com.strategylink.Row.Five.R;
import g.AbstractC0389a;
import h.AbstractC0401a;
import i.C0417d;
import j.j;
import j.k;
import java.lang.reflect.Field;
import java.util.ArrayList;
import k.C0447f;
import k.C0450i;
import k.C0457p;
import k.C0458q;
import k.C0462v;
import k.InterfaceC0440B;
import k.U;
import k.n0;
import k.o0;
import k.p0;
import k.q0;
import k.r0;
import k.s0;
import k.y0;

/* loaded from: classes.dex */
public class Toolbar extends ViewGroup {

    /* renamed from: A, reason: collision with root package name */
    public int f3355A;

    /* renamed from: B, reason: collision with root package name */
    public final int f3356B;

    /* renamed from: C, reason: collision with root package name */
    public CharSequence f3357C;

    /* renamed from: D, reason: collision with root package name */
    public CharSequence f3358D;

    /* renamed from: E, reason: collision with root package name */
    public ColorStateList f3359E;

    /* renamed from: F, reason: collision with root package name */
    public ColorStateList f3360F;

    /* renamed from: G, reason: collision with root package name */
    public boolean f3361G;

    /* renamed from: H, reason: collision with root package name */
    public boolean f3362H;

    /* renamed from: I, reason: collision with root package name */
    public final ArrayList f3363I;

    /* renamed from: J, reason: collision with root package name */
    public final ArrayList f3364J;

    /* renamed from: K, reason: collision with root package name */
    public final int[] f3365K;

    /* renamed from: L, reason: collision with root package name */
    public final d f3366L;

    /* renamed from: M, reason: collision with root package name */
    public s0 f3367M;

    /* renamed from: N, reason: collision with root package name */
    public o0 f3368N;

    /* renamed from: O, reason: collision with root package name */
    public boolean f3369O;

    /* renamed from: P, reason: collision with root package name */
    public final A.b f3370P;

    /* renamed from: f, reason: collision with root package name */
    public ActionMenuView f3371f;

    /* renamed from: g, reason: collision with root package name */
    public C0462v f3372g;

    /* renamed from: h, reason: collision with root package name */
    public C0462v f3373h;

    /* renamed from: i, reason: collision with root package name */
    public C0457p f3374i;

    /* renamed from: j, reason: collision with root package name */
    public C0458q f3375j;

    /* renamed from: k, reason: collision with root package name */
    public final Drawable f3376k;

    /* renamed from: l, reason: collision with root package name */
    public final CharSequence f3377l;

    /* renamed from: m, reason: collision with root package name */
    public C0457p f3378m;

    /* renamed from: n, reason: collision with root package name */
    public View f3379n;

    /* renamed from: o, reason: collision with root package name */
    public Context f3380o;

    /* renamed from: p, reason: collision with root package name */
    public int f3381p;

    /* renamed from: q, reason: collision with root package name */
    public int f3382q;

    /* renamed from: r, reason: collision with root package name */
    public int f3383r;

    /* renamed from: s, reason: collision with root package name */
    public final int f3384s;

    /* renamed from: t, reason: collision with root package name */
    public final int f3385t;

    /* renamed from: u, reason: collision with root package name */
    public int f3386u;

    /* renamed from: v, reason: collision with root package name */
    public int f3387v;

    /* renamed from: w, reason: collision with root package name */
    public int f3388w;

    /* renamed from: x, reason: collision with root package name */
    public int f3389x;
    public U y;

    /* renamed from: z, reason: collision with root package name */
    public int f3390z;

    public Toolbar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.toolbarStyle);
        this.f3356B = 8388627;
        this.f3363I = new ArrayList();
        this.f3364J = new ArrayList();
        this.f3365K = new int[2];
        this.f3366L = new d(this);
        this.f3370P = new A.b(15, this);
        Context context2 = getContext();
        int[] iArr = AbstractC0389a.f4272s;
        B0.c r6 = B0.c.r(context2, attributeSet, iArr, R.attr.toolbarStyle);
        D.a(this, context, iArr, attributeSet, (TypedArray) r6.f73i, R.attr.toolbarStyle);
        TypedArray typedArray = (TypedArray) r6.f73i;
        this.f3382q = typedArray.getResourceId(28, 0);
        this.f3383r = typedArray.getResourceId(19, 0);
        this.f3356B = typedArray.getInteger(0, 8388627);
        this.f3384s = typedArray.getInteger(2, 48);
        int dimensionPixelOffset = typedArray.getDimensionPixelOffset(22, 0);
        dimensionPixelOffset = typedArray.hasValue(27) ? typedArray.getDimensionPixelOffset(27, dimensionPixelOffset) : dimensionPixelOffset;
        this.f3389x = dimensionPixelOffset;
        this.f3388w = dimensionPixelOffset;
        this.f3387v = dimensionPixelOffset;
        this.f3386u = dimensionPixelOffset;
        int dimensionPixelOffset2 = typedArray.getDimensionPixelOffset(25, -1);
        if (dimensionPixelOffset2 >= 0) {
            this.f3386u = dimensionPixelOffset2;
        }
        int dimensionPixelOffset3 = typedArray.getDimensionPixelOffset(24, -1);
        if (dimensionPixelOffset3 >= 0) {
            this.f3387v = dimensionPixelOffset3;
        }
        int dimensionPixelOffset4 = typedArray.getDimensionPixelOffset(26, -1);
        if (dimensionPixelOffset4 >= 0) {
            this.f3388w = dimensionPixelOffset4;
        }
        int dimensionPixelOffset5 = typedArray.getDimensionPixelOffset(23, -1);
        if (dimensionPixelOffset5 >= 0) {
            this.f3389x = dimensionPixelOffset5;
        }
        this.f3385t = typedArray.getDimensionPixelSize(13, -1);
        int dimensionPixelOffset6 = typedArray.getDimensionPixelOffset(9, Integer.MIN_VALUE);
        int dimensionPixelOffset7 = typedArray.getDimensionPixelOffset(5, Integer.MIN_VALUE);
        int dimensionPixelSize = typedArray.getDimensionPixelSize(7, 0);
        int dimensionPixelSize2 = typedArray.getDimensionPixelSize(8, 0);
        d();
        U u6 = this.y;
        u6.f4977h = false;
        if (dimensionPixelSize != Integer.MIN_VALUE) {
            u6.f4974e = dimensionPixelSize;
            u6.f4970a = dimensionPixelSize;
        }
        if (dimensionPixelSize2 != Integer.MIN_VALUE) {
            u6.f4975f = dimensionPixelSize2;
            u6.f4971b = dimensionPixelSize2;
        }
        if (dimensionPixelOffset6 != Integer.MIN_VALUE || dimensionPixelOffset7 != Integer.MIN_VALUE) {
            u6.a(dimensionPixelOffset6, dimensionPixelOffset7);
        }
        this.f3390z = typedArray.getDimensionPixelOffset(10, Integer.MIN_VALUE);
        this.f3355A = typedArray.getDimensionPixelOffset(6, Integer.MIN_VALUE);
        this.f3376k = r6.m(4);
        this.f3377l = typedArray.getText(3);
        CharSequence text = typedArray.getText(21);
        if (!TextUtils.isEmpty(text)) {
            setTitle(text);
        }
        CharSequence text2 = typedArray.getText(18);
        if (!TextUtils.isEmpty(text2)) {
            setSubtitle(text2);
        }
        this.f3380o = getContext();
        setPopupTheme(typedArray.getResourceId(17, 0));
        Drawable m4 = r6.m(16);
        if (m4 != null) {
            setNavigationIcon(m4);
        }
        CharSequence text3 = typedArray.getText(15);
        if (!TextUtils.isEmpty(text3)) {
            setNavigationContentDescription(text3);
        }
        Drawable m7 = r6.m(11);
        if (m7 != null) {
            setLogo(m7);
        }
        CharSequence text4 = typedArray.getText(12);
        if (!TextUtils.isEmpty(text4)) {
            setLogoDescription(text4);
        }
        if (typedArray.hasValue(29)) {
            setTitleTextColor(r6.l(29));
        }
        if (typedArray.hasValue(20)) {
            setSubtitleTextColor(r6.l(20));
        }
        if (typedArray.hasValue(14)) {
            getMenuInflater().inflate(typedArray.getResourceId(14, 0), getMenu());
        }
        r6.v();
    }

    public static p0 g() {
        p0 p0Var = new p0(-2, -2);
        p0Var.f5079b = 0;
        p0Var.f5078a = 8388627;
        return p0Var;
    }

    private MenuInflater getMenuInflater() {
        return new C0417d(getContext());
    }

    public static p0 h(ViewGroup.LayoutParams layoutParams) {
        boolean z5 = layoutParams instanceof p0;
        if (z5) {
            p0 p0Var = (p0) layoutParams;
            p0 p0Var2 = new p0(p0Var);
            p0Var2.f5079b = 0;
            p0Var2.f5079b = p0Var.f5079b;
            return p0Var2;
        }
        if (z5) {
            p0 p0Var3 = new p0((p0) layoutParams);
            p0Var3.f5079b = 0;
            return p0Var3;
        }
        if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
            p0 p0Var4 = new p0(layoutParams);
            p0Var4.f5079b = 0;
            return p0Var4;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        p0 p0Var5 = new p0(marginLayoutParams);
        p0Var5.f5079b = 0;
        ((ViewGroup.MarginLayoutParams) p0Var5).leftMargin = marginLayoutParams.leftMargin;
        ((ViewGroup.MarginLayoutParams) p0Var5).topMargin = marginLayoutParams.topMargin;
        ((ViewGroup.MarginLayoutParams) p0Var5).rightMargin = marginLayoutParams.rightMargin;
        ((ViewGroup.MarginLayoutParams) p0Var5).bottomMargin = marginLayoutParams.bottomMargin;
        return p0Var5;
    }

    public static int j(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return marginLayoutParams.getMarginEnd() + marginLayoutParams.getMarginStart();
    }

    public static int k(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
    }

    public final void a(ArrayList arrayList, int i7) {
        Field field = D.f240a;
        boolean z5 = getLayoutDirection() == 1;
        int childCount = getChildCount();
        int absoluteGravity = Gravity.getAbsoluteGravity(i7, getLayoutDirection());
        arrayList.clear();
        if (!z5) {
            for (int i8 = 0; i8 < childCount; i8++) {
                View childAt = getChildAt(i8);
                p0 p0Var = (p0) childAt.getLayoutParams();
                if (p0Var.f5079b == 0 && q(childAt)) {
                    int i9 = p0Var.f5078a;
                    Field field2 = D.f240a;
                    int layoutDirection = getLayoutDirection();
                    int absoluteGravity2 = Gravity.getAbsoluteGravity(i9, layoutDirection) & 7;
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
        for (int i10 = childCount - 1; i10 >= 0; i10--) {
            View childAt2 = getChildAt(i10);
            p0 p0Var2 = (p0) childAt2.getLayoutParams();
            if (p0Var2.f5079b == 0 && q(childAt2)) {
                int i11 = p0Var2.f5078a;
                Field field3 = D.f240a;
                int layoutDirection2 = getLayoutDirection();
                int absoluteGravity3 = Gravity.getAbsoluteGravity(i11, layoutDirection2) & 7;
                if (absoluteGravity3 != 1 && absoluteGravity3 != 3 && absoluteGravity3 != 5) {
                    absoluteGravity3 = layoutDirection2 == 1 ? 5 : 3;
                }
                if (absoluteGravity3 == absoluteGravity) {
                    arrayList.add(childAt2);
                }
            }
        }
    }

    public final void b(View view, boolean z5) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        p0 g7 = layoutParams == null ? g() : !checkLayoutParams(layoutParams) ? h(layoutParams) : (p0) layoutParams;
        g7.f5079b = 1;
        if (!z5 || this.f3379n == null) {
            addView(view, g7);
        } else {
            view.setLayoutParams(g7);
            this.f3364J.add(view);
        }
    }

    public final void c() {
        if (this.f3378m == null) {
            C0457p c0457p = new C0457p(getContext());
            this.f3378m = c0457p;
            c0457p.setImageDrawable(this.f3376k);
            this.f3378m.setContentDescription(this.f3377l);
            p0 g7 = g();
            g7.f5078a = (this.f3384s & 112) | 8388611;
            g7.f5079b = 2;
            this.f3378m.setLayoutParams(g7);
            this.f3378m.setOnClickListener(new n0(this));
        }
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return super.checkLayoutParams(layoutParams) && (layoutParams instanceof p0);
    }

    public final void d() {
        if (this.y == null) {
            U u6 = new U();
            u6.f4970a = 0;
            u6.f4971b = 0;
            u6.f4972c = Integer.MIN_VALUE;
            u6.f4973d = Integer.MIN_VALUE;
            u6.f4974e = 0;
            u6.f4975f = 0;
            u6.f4976g = false;
            u6.f4977h = false;
            this.y = u6;
        }
    }

    public final void e() {
        if (this.f3371f == null) {
            ActionMenuView actionMenuView = new ActionMenuView(getContext(), null);
            this.f3371f = actionMenuView;
            actionMenuView.setPopupTheme(this.f3381p);
            this.f3371f.setOnMenuItemClickListener(this.f3366L);
            this.f3371f.getClass();
            p0 g7 = g();
            g7.f5078a = (this.f3384s & 112) | 8388613;
            this.f3371f.setLayoutParams(g7);
            b(this.f3371f, false);
        }
        ActionMenuView actionMenuView2 = this.f3371f;
        if (actionMenuView2.f3298u == null) {
            j jVar = (j) actionMenuView2.getMenu();
            if (this.f3368N == null) {
                this.f3368N = new o0(this);
            }
            this.f3371f.setExpandedActionViewsExclusive(true);
            jVar.b(this.f3368N, this.f3380o);
        }
    }

    public final void f() {
        if (this.f3374i == null) {
            this.f3374i = new C0457p(getContext());
            p0 g7 = g();
            g7.f5078a = (this.f3384s & 112) | 8388611;
            this.f3374i.setLayoutParams(g7);
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
        C0457p c0457p = this.f3378m;
        if (c0457p != null) {
            return c0457p.getContentDescription();
        }
        return null;
    }

    public Drawable getCollapseIcon() {
        C0457p c0457p = this.f3378m;
        if (c0457p != null) {
            return c0457p.getDrawable();
        }
        return null;
    }

    public int getContentInsetEnd() {
        U u6 = this.y;
        if (u6 != null) {
            return u6.f4976g ? u6.f4970a : u6.f4971b;
        }
        return 0;
    }

    public int getContentInsetEndWithActions() {
        int i7 = this.f3355A;
        return i7 != Integer.MIN_VALUE ? i7 : getContentInsetEnd();
    }

    public int getContentInsetLeft() {
        U u6 = this.y;
        if (u6 != null) {
            return u6.f4970a;
        }
        return 0;
    }

    public int getContentInsetRight() {
        U u6 = this.y;
        if (u6 != null) {
            return u6.f4971b;
        }
        return 0;
    }

    public int getContentInsetStart() {
        U u6 = this.y;
        if (u6 != null) {
            return u6.f4976g ? u6.f4971b : u6.f4970a;
        }
        return 0;
    }

    public int getContentInsetStartWithNavigation() {
        int i7 = this.f3390z;
        return i7 != Integer.MIN_VALUE ? i7 : getContentInsetStart();
    }

    public int getCurrentContentInsetEnd() {
        j jVar;
        ActionMenuView actionMenuView = this.f3371f;
        return (actionMenuView == null || (jVar = actionMenuView.f3298u) == null || !jVar.hasVisibleItems()) ? getContentInsetEnd() : Math.max(getContentInsetEnd(), Math.max(this.f3355A, 0));
    }

    public int getCurrentContentInsetLeft() {
        Field field = D.f240a;
        return getLayoutDirection() == 1 ? getCurrentContentInsetEnd() : getCurrentContentInsetStart();
    }

    public int getCurrentContentInsetRight() {
        Field field = D.f240a;
        return getLayoutDirection() == 1 ? getCurrentContentInsetStart() : getCurrentContentInsetEnd();
    }

    public int getCurrentContentInsetStart() {
        return getNavigationIcon() != null ? Math.max(getContentInsetStart(), Math.max(this.f3390z, 0)) : getContentInsetStart();
    }

    public Drawable getLogo() {
        C0458q c0458q = this.f3375j;
        if (c0458q != null) {
            return c0458q.getDrawable();
        }
        return null;
    }

    public CharSequence getLogoDescription() {
        C0458q c0458q = this.f3375j;
        if (c0458q != null) {
            return c0458q.getContentDescription();
        }
        return null;
    }

    public Menu getMenu() {
        e();
        return this.f3371f.getMenu();
    }

    public CharSequence getNavigationContentDescription() {
        C0457p c0457p = this.f3374i;
        if (c0457p != null) {
            return c0457p.getContentDescription();
        }
        return null;
    }

    public Drawable getNavigationIcon() {
        C0457p c0457p = this.f3374i;
        if (c0457p != null) {
            return c0457p.getDrawable();
        }
        return null;
    }

    public C0450i getOuterActionMenuPresenter() {
        return null;
    }

    public Drawable getOverflowIcon() {
        e();
        return this.f3371f.getOverflowIcon();
    }

    public Context getPopupContext() {
        return this.f3380o;
    }

    public int getPopupTheme() {
        return this.f3381p;
    }

    public CharSequence getSubtitle() {
        return this.f3358D;
    }

    public final TextView getSubtitleTextView() {
        return this.f3373h;
    }

    public CharSequence getTitle() {
        return this.f3357C;
    }

    public int getTitleMarginBottom() {
        return this.f3389x;
    }

    public int getTitleMarginEnd() {
        return this.f3387v;
    }

    public int getTitleMarginStart() {
        return this.f3386u;
    }

    public int getTitleMarginTop() {
        return this.f3388w;
    }

    public final TextView getTitleTextView() {
        return this.f3372g;
    }

    public InterfaceC0440B getWrapper() {
        Drawable drawable;
        if (this.f3367M == null) {
            s0 s0Var = new s0();
            s0Var.f5099l = 0;
            s0Var.f5088a = this;
            s0Var.f5095h = getTitle();
            s0Var.f5096i = getSubtitle();
            s0Var.f5094g = s0Var.f5095h != null;
            s0Var.f5093f = getNavigationIcon();
            B0.c r6 = B0.c.r(getContext(), null, AbstractC0389a.f4254a, R.attr.actionBarStyle);
            TypedArray typedArray = (TypedArray) r6.f73i;
            s0Var.f5100m = r6.m(15);
            CharSequence text = typedArray.getText(27);
            if (!TextUtils.isEmpty(text)) {
                s0Var.f5094g = true;
                s0Var.f5095h = text;
                if ((s0Var.f5089b & 8) != 0) {
                    s0Var.f5088a.setTitle(text);
                }
            }
            CharSequence text2 = typedArray.getText(25);
            if (!TextUtils.isEmpty(text2)) {
                s0Var.f5096i = text2;
                if ((s0Var.f5089b & 8) != 0) {
                    setSubtitle(text2);
                }
            }
            Drawable m4 = r6.m(20);
            if (m4 != null) {
                s0Var.f5092e = m4;
                s0Var.c();
            }
            Drawable m7 = r6.m(17);
            if (m7 != null) {
                s0Var.f5091d = m7;
                s0Var.c();
            }
            if (s0Var.f5093f == null && (drawable = s0Var.f5100m) != null) {
                s0Var.f5093f = drawable;
                Toolbar toolbar = s0Var.f5088a;
                if ((s0Var.f5089b & 4) != 0) {
                    toolbar.setNavigationIcon(drawable);
                } else {
                    toolbar.setNavigationIcon((Drawable) null);
                }
            }
            s0Var.a(typedArray.getInt(10, 0));
            int resourceId = typedArray.getResourceId(9, 0);
            if (resourceId != 0) {
                View inflate = LayoutInflater.from(getContext()).inflate(resourceId, (ViewGroup) this, false);
                View view = s0Var.f5090c;
                if (view != null && (s0Var.f5089b & 16) != 0) {
                    removeView(view);
                }
                s0Var.f5090c = inflate;
                if (inflate != null && (s0Var.f5089b & 16) != 0) {
                    addView(inflate);
                }
                s0Var.a(s0Var.f5089b | 16);
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
                this.y.a(max, max2);
            }
            int resourceId2 = typedArray.getResourceId(28, 0);
            if (resourceId2 != 0) {
                Context context = getContext();
                this.f3382q = resourceId2;
                C0462v c0462v = this.f3372g;
                if (c0462v != null) {
                    c0462v.setTextAppearance(context, resourceId2);
                }
            }
            int resourceId3 = typedArray.getResourceId(26, 0);
            if (resourceId3 != 0) {
                Context context2 = getContext();
                this.f3383r = resourceId3;
                C0462v c0462v2 = this.f3373h;
                if (c0462v2 != null) {
                    c0462v2.setTextAppearance(context2, resourceId3);
                }
            }
            int resourceId4 = typedArray.getResourceId(22, 0);
            if (resourceId4 != 0) {
                setPopupTheme(resourceId4);
            }
            r6.v();
            if (R.string.abc_action_bar_up_description != s0Var.f5099l) {
                s0Var.f5099l = R.string.abc_action_bar_up_description;
                if (TextUtils.isEmpty(getNavigationContentDescription())) {
                    int i7 = s0Var.f5099l;
                    s0Var.f5097j = i7 != 0 ? getContext().getString(i7) : null;
                    s0Var.b();
                }
            }
            s0Var.f5097j = getNavigationContentDescription();
            setNavigationOnClickListener(new n0(s0Var));
            this.f3367M = s0Var;
        }
        return this.f3367M;
    }

    public final int i(View view, int i7) {
        p0 p0Var = (p0) view.getLayoutParams();
        int measuredHeight = view.getMeasuredHeight();
        int i8 = i7 > 0 ? (measuredHeight - i7) / 2 : 0;
        int i9 = p0Var.f5078a & 112;
        if (i9 != 16 && i9 != 48 && i9 != 80) {
            i9 = this.f3356B & 112;
        }
        if (i9 == 48) {
            return getPaddingTop() - i8;
        }
        if (i9 == 80) {
            return (((getHeight() - getPaddingBottom()) - measuredHeight) - ((ViewGroup.MarginLayoutParams) p0Var).bottomMargin) - i8;
        }
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int height = getHeight();
        int i10 = (((height - paddingTop) - paddingBottom) - measuredHeight) / 2;
        int i11 = ((ViewGroup.MarginLayoutParams) p0Var).topMargin;
        if (i10 < i11) {
            i10 = i11;
        } else {
            int i12 = (((height - paddingBottom) - measuredHeight) - i10) - paddingTop;
            int i13 = ((ViewGroup.MarginLayoutParams) p0Var).bottomMargin;
            if (i12 < i13) {
                i10 = Math.max(0, i10 - (i13 - i12));
            }
        }
        return paddingTop + i10;
    }

    public final boolean l(View view) {
        return view.getParent() == this || this.f3364J.contains(view);
    }

    public final int m(View view, int i7, int i8, int[] iArr) {
        p0 p0Var = (p0) view.getLayoutParams();
        int i9 = ((ViewGroup.MarginLayoutParams) p0Var).leftMargin - iArr[0];
        int max = Math.max(0, i9) + i7;
        iArr[0] = Math.max(0, -i9);
        int i10 = i(view, i8);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(max, i10, max + measuredWidth, view.getMeasuredHeight() + i10);
        return measuredWidth + ((ViewGroup.MarginLayoutParams) p0Var).rightMargin + max;
    }

    public final int n(View view, int i7, int i8, int[] iArr) {
        p0 p0Var = (p0) view.getLayoutParams();
        int i9 = ((ViewGroup.MarginLayoutParams) p0Var).rightMargin - iArr[1];
        int max = i7 - Math.max(0, i9);
        iArr[1] = Math.max(0, -i9);
        int i10 = i(view, i8);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(max - measuredWidth, i10, max, view.getMeasuredHeight() + i10);
        return max - (measuredWidth + ((ViewGroup.MarginLayoutParams) p0Var).leftMargin);
    }

    public final int o(View view, int i7, int i8, int i9, int i10, int[] iArr) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int i11 = marginLayoutParams.leftMargin - iArr[0];
        int i12 = marginLayoutParams.rightMargin - iArr[1];
        int max = Math.max(0, i12) + Math.max(0, i11);
        iArr[0] = Math.max(0, -i11);
        iArr[1] = Math.max(0, -i12);
        view.measure(ViewGroup.getChildMeasureSpec(i7, getPaddingRight() + getPaddingLeft() + max + i8, marginLayoutParams.width), ViewGroup.getChildMeasureSpec(i9, getPaddingBottom() + getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i10, marginLayoutParams.height));
        return view.getMeasuredWidth() + max;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeCallbacks(this.f3370P);
    }

    @Override // android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.f3362H = false;
        }
        if (!this.f3362H) {
            boolean onHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !onHoverEvent) {
                this.f3362H = true;
            }
        }
        if (actionMasked != 10 && actionMasked != 3) {
            return true;
        }
        this.f3362H = false;
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
    public final void onLayout(boolean z5, int i7, int i8, int i9, int i10) {
        int i11;
        int i12;
        int max;
        boolean q6;
        boolean q7;
        boolean z6;
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
        int i24;
        int size4;
        Field field = D.f240a;
        boolean z7 = getLayoutDirection() == 1;
        int width = getWidth();
        int height = getHeight();
        int paddingLeft = getPaddingLeft();
        int paddingRight = getPaddingRight();
        int paddingTop2 = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int i25 = width - paddingRight;
        int[] iArr = this.f3365K;
        iArr[1] = 0;
        iArr[0] = 0;
        int minimumHeight = getMinimumHeight();
        int min = minimumHeight >= 0 ? Math.min(minimumHeight, i10 - i8) : 0;
        if (!q(this.f3374i)) {
            i11 = paddingLeft;
        } else {
            if (z7) {
                i12 = n(this.f3374i, i25, min, iArr);
                i11 = paddingLeft;
                if (q(this.f3378m)) {
                    if (z7) {
                        i12 = n(this.f3378m, i12, min, iArr);
                    } else {
                        i11 = m(this.f3378m, i11, min, iArr);
                    }
                }
                if (q(this.f3371f)) {
                    if (z7) {
                        i11 = m(this.f3371f, i11, min, iArr);
                    } else {
                        i12 = n(this.f3371f, i12, min, iArr);
                    }
                }
                int currentContentInsetLeft = getCurrentContentInsetLeft();
                int currentContentInsetRight = getCurrentContentInsetRight();
                iArr[0] = Math.max(0, currentContentInsetLeft - i11);
                iArr[1] = Math.max(0, currentContentInsetRight - (i25 - i12));
                max = Math.max(i11, currentContentInsetLeft);
                int min2 = Math.min(i12, i25 - currentContentInsetRight);
                if (q(this.f3379n)) {
                    if (z7) {
                        min2 = n(this.f3379n, min2, min, iArr);
                    } else {
                        max = m(this.f3379n, max, min, iArr);
                    }
                }
                if (q(this.f3375j)) {
                    if (z7) {
                        min2 = n(this.f3375j, min2, min, iArr);
                    } else {
                        max = m(this.f3375j, max, min, iArr);
                    }
                }
                q6 = q(this.f3372g);
                q7 = q(this.f3373h);
                if (q6) {
                    z6 = z7;
                    i13 = 0;
                } else {
                    p0 p0Var = (p0) this.f3372g.getLayoutParams();
                    z6 = z7;
                    i13 = this.f3372g.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) p0Var).topMargin + ((ViewGroup.MarginLayoutParams) p0Var).bottomMargin;
                }
                if (!q7) {
                    p0 p0Var2 = (p0) this.f3373h.getLayoutParams();
                    i13 = this.f3373h.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) p0Var2).topMargin + ((ViewGroup.MarginLayoutParams) p0Var2).bottomMargin + i13;
                }
                if (!q6 || q7) {
                    C0462v c0462v = !q6 ? this.f3372g : this.f3373h;
                    C0462v c0462v2 = !q7 ? this.f3373h : this.f3372g;
                    p0 p0Var3 = (p0) c0462v.getLayoutParams();
                    p0 p0Var4 = (p0) c0462v2.getLayoutParams();
                    int i26 = i13;
                    boolean z8 = (!q6 && this.f3372g.getMeasuredWidth() > 0) || (q7 && this.f3373h.getMeasuredWidth() > 0);
                    i14 = this.f3356B & 112;
                    int i27 = max;
                    if (i14 != 48) {
                        paddingTop = getPaddingTop() + ((ViewGroup.MarginLayoutParams) p0Var3).topMargin + this.f3388w;
                    } else if (i14 != 80) {
                        int i28 = (((height - paddingTop2) - paddingBottom) - i26) / 2;
                        int i29 = ((ViewGroup.MarginLayoutParams) p0Var3).topMargin + this.f3388w;
                        if (i28 < i29) {
                            i28 = i29;
                        } else {
                            int i30 = (((height - paddingBottom) - i26) - i28) - paddingTop2;
                            int i31 = ((ViewGroup.MarginLayoutParams) p0Var3).bottomMargin;
                            int i32 = this.f3389x;
                            if (i30 < i31 + i32) {
                                i28 = Math.max(0, i28 - ((((ViewGroup.MarginLayoutParams) p0Var4).bottomMargin + i32) - i30));
                            }
                        }
                        paddingTop = paddingTop2 + i28;
                    } else {
                        paddingTop = (((height - paddingBottom) - ((ViewGroup.MarginLayoutParams) p0Var4).bottomMargin) - this.f3389x) - i26;
                    }
                    if (z6) {
                        int i33 = (z8 ? this.f3386u : 0) - iArr[0];
                        max = Math.max(0, i33) + i27;
                        iArr[0] = Math.max(0, -i33);
                        if (q6) {
                            p0 p0Var5 = (p0) this.f3372g.getLayoutParams();
                            int measuredWidth = this.f3372g.getMeasuredWidth() + max;
                            int measuredHeight = this.f3372g.getMeasuredHeight() + paddingTop;
                            this.f3372g.layout(max, paddingTop, measuredWidth, measuredHeight);
                            i15 = measuredWidth + this.f3387v;
                            paddingTop = measuredHeight + ((ViewGroup.MarginLayoutParams) p0Var5).bottomMargin;
                        } else {
                            i15 = max;
                        }
                        if (q7) {
                            int i34 = paddingTop + ((ViewGroup.MarginLayoutParams) ((p0) this.f3373h.getLayoutParams())).topMargin;
                            int measuredWidth2 = this.f3373h.getMeasuredWidth() + max;
                            this.f3373h.layout(max, i34, measuredWidth2, this.f3373h.getMeasuredHeight() + i34);
                            i16 = measuredWidth2 + this.f3387v;
                        } else {
                            i16 = max;
                        }
                        if (z8) {
                            max = Math.max(i15, i16);
                        }
                    } else {
                        int i35 = (z8 ? this.f3386u : 0) - iArr[1];
                        min2 -= Math.max(0, i35);
                        iArr[1] = Math.max(0, -i35);
                        if (q6) {
                            p0 p0Var6 = (p0) this.f3372g.getLayoutParams();
                            int measuredWidth3 = min2 - this.f3372g.getMeasuredWidth();
                            int measuredHeight2 = this.f3372g.getMeasuredHeight() + paddingTop;
                            this.f3372g.layout(measuredWidth3, paddingTop, min2, measuredHeight2);
                            i17 = measuredWidth3 - this.f3387v;
                            paddingTop = measuredHeight2 + ((ViewGroup.MarginLayoutParams) p0Var6).bottomMargin;
                        } else {
                            i17 = min2;
                        }
                        if (q7) {
                            int i36 = paddingTop + ((ViewGroup.MarginLayoutParams) ((p0) this.f3373h.getLayoutParams())).topMargin;
                            this.f3373h.layout(min2 - this.f3373h.getMeasuredWidth(), i36, min2, this.f3373h.getMeasuredHeight() + i36);
                            i18 = min2 - this.f3387v;
                        } else {
                            i18 = min2;
                        }
                        if (z8) {
                            min2 = Math.min(i17, i18);
                        }
                        max = i27;
                    }
                }
                ArrayList arrayList = this.f3363I;
                a(arrayList, 3);
                size = arrayList.size();
                i19 = max;
                for (i20 = 0; i20 < size; i20++) {
                    i19 = m((View) arrayList.get(i20), i19, min, iArr);
                }
                a(arrayList, 5);
                size2 = arrayList.size();
                for (i21 = 0; i21 < size2; i21++) {
                    min2 = n((View) arrayList.get(i21), min2, min, iArr);
                }
                a(arrayList, 1);
                int i37 = iArr[0];
                int i38 = iArr[1];
                size3 = arrayList.size();
                int i39 = i37;
                i22 = 0;
                int i40 = 0;
                while (i22 < size3) {
                    View view = (View) arrayList.get(i22);
                    p0 p0Var7 = (p0) view.getLayoutParams();
                    int i41 = i38;
                    int i42 = ((ViewGroup.MarginLayoutParams) p0Var7).leftMargin - i39;
                    int i43 = ((ViewGroup.MarginLayoutParams) p0Var7).rightMargin - i41;
                    int max2 = Math.max(0, i42);
                    int max3 = Math.max(0, i43);
                    int max4 = Math.max(0, -i42);
                    int max5 = Math.max(0, -i43);
                    i40 += view.getMeasuredWidth() + max2 + max3;
                    i22++;
                    i39 = max4;
                    i38 = max5;
                }
                i24 = ((((width - paddingLeft) - paddingRight) / 2) + paddingLeft) - (i40 / 2);
                int i44 = i40 + i24;
                if (i24 >= i19) {
                    i19 = i44 > min2 ? i24 - (i44 - min2) : i24;
                }
                size4 = arrayList.size();
                for (i23 = 0; i23 < size4; i23++) {
                    i19 = m((View) arrayList.get(i23), i19, min, iArr);
                }
                arrayList.clear();
            }
            i11 = m(this.f3374i, paddingLeft, min, iArr);
        }
        i12 = i25;
        if (q(this.f3378m)) {
        }
        if (q(this.f3371f)) {
        }
        int currentContentInsetLeft2 = getCurrentContentInsetLeft();
        int currentContentInsetRight2 = getCurrentContentInsetRight();
        iArr[0] = Math.max(0, currentContentInsetLeft2 - i11);
        iArr[1] = Math.max(0, currentContentInsetRight2 - (i25 - i12));
        max = Math.max(i11, currentContentInsetLeft2);
        int min22 = Math.min(i12, i25 - currentContentInsetRight2);
        if (q(this.f3379n)) {
        }
        if (q(this.f3375j)) {
        }
        q6 = q(this.f3372g);
        q7 = q(this.f3373h);
        if (q6) {
        }
        if (!q7) {
        }
        if (!q6) {
        }
        if (!q6) {
        }
        if (!q7) {
        }
        p0 p0Var32 = (p0) c0462v.getLayoutParams();
        p0 p0Var42 = (p0) c0462v2.getLayoutParams();
        int i262 = i13;
        if (q6) {
        }
        i14 = this.f3356B & 112;
        int i272 = max;
        if (i14 != 48) {
        }
        if (z6) {
        }
        ArrayList arrayList2 = this.f3363I;
        a(arrayList2, 3);
        size = arrayList2.size();
        i19 = max;
        while (i20 < size) {
        }
        a(arrayList2, 5);
        size2 = arrayList2.size();
        while (i21 < size2) {
        }
        a(arrayList2, 1);
        int i372 = iArr[0];
        int i382 = iArr[1];
        size3 = arrayList2.size();
        int i392 = i372;
        i22 = 0;
        int i402 = 0;
        while (i22 < size3) {
        }
        i24 = ((((width - paddingLeft) - paddingRight) / 2) + paddingLeft) - (i402 / 2);
        int i442 = i402 + i24;
        if (i24 >= i19) {
        }
        size4 = arrayList2.size();
        while (i23 < size4) {
        }
        arrayList2.clear();
    }

    @Override // android.view.View
    public final void onMeasure(int i7, int i8) {
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        boolean a7 = y0.a(this);
        int i16 = !a7 ? 1 : 0;
        int i17 = 0;
        if (q(this.f3374i)) {
            p(this.f3374i, i7, 0, i8, this.f3385t);
            i9 = j(this.f3374i) + this.f3374i.getMeasuredWidth();
            i10 = Math.max(0, k(this.f3374i) + this.f3374i.getMeasuredHeight());
            i11 = View.combineMeasuredStates(0, this.f3374i.getMeasuredState());
        } else {
            i9 = 0;
            i10 = 0;
            i11 = 0;
        }
        if (q(this.f3378m)) {
            p(this.f3378m, i7, 0, i8, this.f3385t);
            i9 = j(this.f3378m) + this.f3378m.getMeasuredWidth();
            i10 = Math.max(i10, k(this.f3378m) + this.f3378m.getMeasuredHeight());
            i11 = View.combineMeasuredStates(i11, this.f3378m.getMeasuredState());
        }
        int currentContentInsetStart = getCurrentContentInsetStart();
        int max = Math.max(currentContentInsetStart, i9);
        int max2 = Math.max(0, currentContentInsetStart - i9);
        int[] iArr = this.f3365K;
        iArr[a7 ? 1 : 0] = max2;
        if (q(this.f3371f)) {
            p(this.f3371f, i7, max, i8, this.f3385t);
            i12 = j(this.f3371f) + this.f3371f.getMeasuredWidth();
            i10 = Math.max(i10, k(this.f3371f) + this.f3371f.getMeasuredHeight());
            i11 = View.combineMeasuredStates(i11, this.f3371f.getMeasuredState());
        } else {
            i12 = 0;
        }
        int currentContentInsetEnd = getCurrentContentInsetEnd();
        int max3 = max + Math.max(currentContentInsetEnd, i12);
        iArr[i16] = Math.max(0, currentContentInsetEnd - i12);
        if (q(this.f3379n)) {
            max3 += o(this.f3379n, i7, max3, i8, 0, iArr);
            i10 = Math.max(i10, k(this.f3379n) + this.f3379n.getMeasuredHeight());
            i11 = View.combineMeasuredStates(i11, this.f3379n.getMeasuredState());
        }
        if (q(this.f3375j)) {
            max3 += o(this.f3375j, i7, max3, i8, 0, iArr);
            i10 = Math.max(i10, k(this.f3375j) + this.f3375j.getMeasuredHeight());
            i11 = View.combineMeasuredStates(i11, this.f3375j.getMeasuredState());
        }
        int childCount = getChildCount();
        for (int i18 = 0; i18 < childCount; i18++) {
            View childAt = getChildAt(i18);
            if (((p0) childAt.getLayoutParams()).f5079b == 0 && q(childAt)) {
                max3 += o(childAt, i7, max3, i8, 0, iArr);
                int max4 = Math.max(i10, k(childAt) + childAt.getMeasuredHeight());
                i11 = View.combineMeasuredStates(i11, childAt.getMeasuredState());
                i10 = max4;
            } else {
                max3 = max3;
            }
        }
        int i19 = max3;
        int i20 = this.f3388w + this.f3389x;
        int i21 = this.f3386u + this.f3387v;
        if (q(this.f3372g)) {
            o(this.f3372g, i7, i19 + i21, i8, i20, iArr);
            int j4 = j(this.f3372g) + this.f3372g.getMeasuredWidth();
            i13 = k(this.f3372g) + this.f3372g.getMeasuredHeight();
            i14 = View.combineMeasuredStates(i11, this.f3372g.getMeasuredState());
            i15 = j4;
        } else {
            i13 = 0;
            i14 = i11;
            i15 = 0;
        }
        if (q(this.f3373h)) {
            i15 = Math.max(i15, o(this.f3373h, i7, i19 + i21, i8, i20 + i13, iArr));
            i13 += k(this.f3373h) + this.f3373h.getMeasuredHeight();
            i14 = View.combineMeasuredStates(i14, this.f3373h.getMeasuredState());
        }
        int max5 = Math.max(i10, i13);
        int paddingRight = getPaddingRight() + getPaddingLeft() + i19 + i15;
        int paddingBottom = getPaddingBottom() + getPaddingTop() + max5;
        int resolveSizeAndState = View.resolveSizeAndState(Math.max(paddingRight, getSuggestedMinimumWidth()), i7, (-16777216) & i14);
        int resolveSizeAndState2 = View.resolveSizeAndState(Math.max(paddingBottom, getSuggestedMinimumHeight()), i8, i14 << 16);
        if (this.f3369O) {
            int childCount2 = getChildCount();
            for (int i22 = 0; i22 < childCount2; i22++) {
                View childAt2 = getChildAt(i22);
                if (!q(childAt2) || childAt2.getMeasuredWidth() <= 0 || childAt2.getMeasuredHeight() <= 0) {
                }
            }
            setMeasuredDimension(resolveSizeAndState, i17);
        }
        i17 = resolveSizeAndState2;
        setMeasuredDimension(resolveSizeAndState, i17);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        MenuItem findItem;
        if (!(parcelable instanceof r0)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        r0 r0Var = (r0) parcelable;
        super.onRestoreInstanceState(r0Var.f1342f);
        ActionMenuView actionMenuView = this.f3371f;
        j jVar = actionMenuView != null ? actionMenuView.f3298u : null;
        int i7 = r0Var.f5082h;
        if (i7 != 0 && this.f3368N != null && jVar != null && (findItem = jVar.findItem(i7)) != null) {
            findItem.expandActionView();
        }
        if (r0Var.f5083i) {
            A.b bVar = this.f3370P;
            removeCallbacks(bVar);
            post(bVar);
        }
    }

    @Override // android.view.View
    public final void onRtlPropertiesChanged(int i7) {
        super.onRtlPropertiesChanged(i7);
        d();
        U u6 = this.y;
        boolean z5 = i7 == 1;
        if (z5 == u6.f4976g) {
            return;
        }
        u6.f4976g = z5;
        if (!u6.f4977h) {
            u6.f4970a = u6.f4974e;
            u6.f4971b = u6.f4975f;
            return;
        }
        if (z5) {
            int i8 = u6.f4973d;
            if (i8 == Integer.MIN_VALUE) {
                i8 = u6.f4974e;
            }
            u6.f4970a = i8;
            int i9 = u6.f4972c;
            if (i9 == Integer.MIN_VALUE) {
                i9 = u6.f4975f;
            }
            u6.f4971b = i9;
            return;
        }
        int i10 = u6.f4972c;
        if (i10 == Integer.MIN_VALUE) {
            i10 = u6.f4974e;
        }
        u6.f4970a = i10;
        int i11 = u6.f4973d;
        if (i11 == Integer.MIN_VALUE) {
            i11 = u6.f4975f;
        }
        u6.f4971b = i11;
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        C0450i c0450i;
        C0447f c0447f;
        k kVar;
        r0 r0Var = new r0(super.onSaveInstanceState());
        o0 o0Var = this.f3368N;
        if (o0Var != null && (kVar = o0Var.f5074g) != null) {
            r0Var.f5082h = kVar.f4817a;
        }
        ActionMenuView actionMenuView = this.f3371f;
        r0Var.f5083i = (actionMenuView == null || (c0450i = actionMenuView.f3301x) == null || (c0447f = c0450i.f5021w) == null || !c0447f.b()) ? false : true;
        return r0Var;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f3361G = false;
        }
        if (!this.f3361G) {
            boolean onTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !onTouchEvent) {
                this.f3361G = true;
            }
        }
        if (actionMasked != 1 && actionMasked != 3) {
            return true;
        }
        this.f3361G = false;
        return true;
    }

    public final void p(View view, int i7, int i8, int i9, int i10) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i7, getPaddingRight() + getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i8, marginLayoutParams.width);
        int childMeasureSpec2 = ViewGroup.getChildMeasureSpec(i9, getPaddingBottom() + getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, marginLayoutParams.height);
        int mode = View.MeasureSpec.getMode(childMeasureSpec2);
        if (mode != 1073741824 && i10 >= 0) {
            if (mode != 0) {
                i10 = Math.min(View.MeasureSpec.getSize(childMeasureSpec2), i10);
            }
            childMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i10, 1073741824);
        }
        view.measure(childMeasureSpec, childMeasureSpec2);
    }

    public final boolean q(View view) {
        return (view == null || view.getParent() != this || view.getVisibility() == 8) ? false : true;
    }

    public void setCollapseContentDescription(int i7) {
        setCollapseContentDescription(i7 != 0 ? getContext().getText(i7) : null);
    }

    public void setCollapseIcon(int i7) {
        setCollapseIcon(AbstractC0401a.a(getContext(), i7));
    }

    public void setCollapsible(boolean z5) {
        this.f3369O = z5;
        requestLayout();
    }

    public void setContentInsetEndWithActions(int i7) {
        if (i7 < 0) {
            i7 = Integer.MIN_VALUE;
        }
        if (i7 != this.f3355A) {
            this.f3355A = i7;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setContentInsetStartWithNavigation(int i7) {
        if (i7 < 0) {
            i7 = Integer.MIN_VALUE;
        }
        if (i7 != this.f3390z) {
            this.f3390z = i7;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setLogo(int i7) {
        setLogo(AbstractC0401a.a(getContext(), i7));
    }

    public void setLogoDescription(int i7) {
        setLogoDescription(getContext().getText(i7));
    }

    public void setNavigationContentDescription(int i7) {
        setNavigationContentDescription(i7 != 0 ? getContext().getText(i7) : null);
    }

    public void setNavigationIcon(int i7) {
        setNavigationIcon(AbstractC0401a.a(getContext(), i7));
    }

    public void setNavigationOnClickListener(View.OnClickListener onClickListener) {
        f();
        this.f3374i.setOnClickListener(onClickListener);
    }

    public void setOverflowIcon(Drawable drawable) {
        e();
        this.f3371f.setOverflowIcon(drawable);
    }

    public void setPopupTheme(int i7) {
        if (this.f3381p != i7) {
            this.f3381p = i7;
            if (i7 == 0) {
                this.f3380o = getContext();
            } else {
                this.f3380o = new ContextThemeWrapper(getContext(), i7);
            }
        }
    }

    public void setSubtitle(int i7) {
        setSubtitle(getContext().getText(i7));
    }

    public void setSubtitleTextColor(int i7) {
        setSubtitleTextColor(ColorStateList.valueOf(i7));
    }

    public void setTitle(int i7) {
        setTitle(getContext().getText(i7));
    }

    public void setTitleMarginBottom(int i7) {
        this.f3389x = i7;
        requestLayout();
    }

    public void setTitleMarginEnd(int i7) {
        this.f3387v = i7;
        requestLayout();
    }

    public void setTitleMarginStart(int i7) {
        this.f3386u = i7;
        requestLayout();
    }

    public void setTitleMarginTop(int i7) {
        this.f3388w = i7;
        requestLayout();
    }

    public void setTitleTextColor(int i7) {
        setTitleTextColor(ColorStateList.valueOf(i7));
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        Context context = getContext();
        p0 p0Var = new p0(context, attributeSet);
        p0Var.f5078a = 0;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0389a.f4255b);
        p0Var.f5078a = obtainStyledAttributes.getInt(0, 0);
        obtainStyledAttributes.recycle();
        p0Var.f5079b = 0;
        return p0Var;
    }

    public void setCollapseContentDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            c();
        }
        C0457p c0457p = this.f3378m;
        if (c0457p != null) {
            c0457p.setContentDescription(charSequence);
        }
    }

    public void setCollapseIcon(Drawable drawable) {
        if (drawable != null) {
            c();
            this.f3378m.setImageDrawable(drawable);
        } else {
            C0457p c0457p = this.f3378m;
            if (c0457p != null) {
                c0457p.setImageDrawable(this.f3376k);
            }
        }
    }

    public void setLogo(Drawable drawable) {
        if (drawable != null) {
            if (this.f3375j == null) {
                this.f3375j = new C0458q(getContext(), 0);
            }
            if (!l(this.f3375j)) {
                b(this.f3375j, true);
            }
        } else {
            C0458q c0458q = this.f3375j;
            if (c0458q != null && l(c0458q)) {
                removeView(this.f3375j);
                this.f3364J.remove(this.f3375j);
            }
        }
        C0458q c0458q2 = this.f3375j;
        if (c0458q2 != null) {
            c0458q2.setImageDrawable(drawable);
        }
    }

    public void setLogoDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence) && this.f3375j == null) {
            this.f3375j = new C0458q(getContext(), 0);
        }
        C0458q c0458q = this.f3375j;
        if (c0458q != null) {
            c0458q.setContentDescription(charSequence);
        }
    }

    public void setNavigationContentDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            f();
        }
        C0457p c0457p = this.f3374i;
        if (c0457p != null) {
            c0457p.setContentDescription(charSequence);
        }
    }

    public void setNavigationIcon(Drawable drawable) {
        if (drawable != null) {
            f();
            if (!l(this.f3374i)) {
                b(this.f3374i, true);
            }
        } else {
            C0457p c0457p = this.f3374i;
            if (c0457p != null && l(c0457p)) {
                removeView(this.f3374i);
                this.f3364J.remove(this.f3374i);
            }
        }
        C0457p c0457p2 = this.f3374i;
        if (c0457p2 != null) {
            c0457p2.setImageDrawable(drawable);
        }
    }

    public void setSubtitle(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            C0462v c0462v = this.f3373h;
            if (c0462v != null && l(c0462v)) {
                removeView(this.f3373h);
                this.f3364J.remove(this.f3373h);
            }
        } else {
            if (this.f3373h == null) {
                Context context = getContext();
                C0462v c0462v2 = new C0462v(context, null);
                this.f3373h = c0462v2;
                c0462v2.setSingleLine();
                this.f3373h.setEllipsize(TextUtils.TruncateAt.END);
                int i7 = this.f3383r;
                if (i7 != 0) {
                    this.f3373h.setTextAppearance(context, i7);
                }
                ColorStateList colorStateList = this.f3360F;
                if (colorStateList != null) {
                    this.f3373h.setTextColor(colorStateList);
                }
            }
            if (!l(this.f3373h)) {
                b(this.f3373h, true);
            }
        }
        C0462v c0462v3 = this.f3373h;
        if (c0462v3 != null) {
            c0462v3.setText(charSequence);
        }
        this.f3358D = charSequence;
    }

    public void setSubtitleTextColor(ColorStateList colorStateList) {
        this.f3360F = colorStateList;
        C0462v c0462v = this.f3373h;
        if (c0462v != null) {
            c0462v.setTextColor(colorStateList);
        }
    }

    public void setTitle(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            C0462v c0462v = this.f3372g;
            if (c0462v != null && l(c0462v)) {
                removeView(this.f3372g);
                this.f3364J.remove(this.f3372g);
            }
        } else {
            if (this.f3372g == null) {
                Context context = getContext();
                C0462v c0462v2 = new C0462v(context, null);
                this.f3372g = c0462v2;
                c0462v2.setSingleLine();
                this.f3372g.setEllipsize(TextUtils.TruncateAt.END);
                int i7 = this.f3382q;
                if (i7 != 0) {
                    this.f3372g.setTextAppearance(context, i7);
                }
                ColorStateList colorStateList = this.f3359E;
                if (colorStateList != null) {
                    this.f3372g.setTextColor(colorStateList);
                }
            }
            if (!l(this.f3372g)) {
                b(this.f3372g, true);
            }
        }
        C0462v c0462v3 = this.f3372g;
        if (c0462v3 != null) {
            c0462v3.setText(charSequence);
        }
        this.f3357C = charSequence;
    }

    public void setTitleTextColor(ColorStateList colorStateList) {
        this.f3359E = colorStateList;
        C0462v c0462v = this.f3372g;
        if (c0462v != null) {
            c0462v.setTextColor(colorStateList);
        }
    }

    public void setOnMenuItemClickListener(q0 q0Var) {
    }
}
