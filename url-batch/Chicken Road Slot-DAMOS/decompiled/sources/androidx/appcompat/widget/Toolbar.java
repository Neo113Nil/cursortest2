package androidx.appcompat.widget;

import a1.n;
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
import b7.k;
import com.appsflyer.R;
import f4.h;
import i.a;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import k.c;
import k7.e;
import l.d;
import l.i;
import m.a2;
import m.b2;
import m.c0;
import m.c2;
import m.g;
import m.j;
import m.j0;
import m.j2;
import m.l1;
import m.q;
import m.r;
import m.s1;
import m.t1;
import m.u1;
import m.w1;
import m.x1;
import m.y1;
import m.z1;
import z4.w;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public class Toolbar extends ViewGroup {
    public int A;
    public final int B;
    public final int C;
    public int D;
    public int E;
    public int F;
    public int G;
    public l1 H;
    public int I;
    public int J;
    public final int K;
    public CharSequence L;
    public CharSequence M;
    public ColorStateList N;
    public ColorStateList O;
    public boolean P;
    public boolean Q;
    public final ArrayList R;
    public final ArrayList S;
    public final int[] T;
    public final d U;
    public ArrayList V;
    public final t1 W;

    /* renamed from: a0, reason: collision with root package name */
    public c2 f441a0;

    /* renamed from: b0, reason: collision with root package name */
    public x1 f442b0;

    /* renamed from: c0, reason: collision with root package name */
    public boolean f443c0;

    /* renamed from: d, reason: collision with root package name */
    public ActionMenuView f444d;

    /* renamed from: d0, reason: collision with root package name */
    public OnBackInvokedCallback f445d0;

    /* renamed from: e, reason: collision with root package name */
    public c0 f446e;

    /* renamed from: e0, reason: collision with root package name */
    public OnBackInvokedDispatcher f447e0;

    /* renamed from: f0, reason: collision with root package name */
    public boolean f448f0;

    /* renamed from: g0, reason: collision with root package name */
    public final k f449g0;

    /* renamed from: i, reason: collision with root package name */
    public c0 f450i;

    /* renamed from: r, reason: collision with root package name */
    public q f451r;

    /* renamed from: s, reason: collision with root package name */
    public r f452s;

    /* renamed from: t, reason: collision with root package name */
    public final Drawable f453t;

    /* renamed from: u, reason: collision with root package name */
    public final CharSequence f454u;

    /* renamed from: v, reason: collision with root package name */
    public q f455v;

    /* renamed from: w, reason: collision with root package name */
    public View f456w;

    /* renamed from: x, reason: collision with root package name */
    public Context f457x;

    /* renamed from: y, reason: collision with root package name */
    public int f458y;

    /* renamed from: z, reason: collision with root package name */
    public int f459z;

    public Toolbar(Context context, AttributeSet attributeSet, int i3) {
        super(context, attributeSet, i3);
        this.K = 8388627;
        this.R = new ArrayList();
        this.S = new ArrayList();
        this.T = new int[2];
        this.U = new d(new s1(this, 1));
        this.V = new ArrayList();
        this.W = new t1(this);
        this.f449g0 = new k(10, this);
        Context context2 = getContext();
        int[] iArr = a.f4555r;
        n z10 = n.z(context2, attributeSet, iArr, i3);
        o3.c0.c(this, context, iArr, attributeSet, (TypedArray) z10.f40e, i3);
        TypedArray typedArray = (TypedArray) z10.f40e;
        this.f459z = typedArray.getResourceId(28, 0);
        this.A = typedArray.getResourceId(19, 0);
        this.K = typedArray.getInteger(0, 8388627);
        this.B = typedArray.getInteger(2, 48);
        int dimensionPixelOffset = typedArray.getDimensionPixelOffset(22, 0);
        dimensionPixelOffset = typedArray.hasValue(27) ? typedArray.getDimensionPixelOffset(27, dimensionPixelOffset) : dimensionPixelOffset;
        this.G = dimensionPixelOffset;
        this.F = dimensionPixelOffset;
        this.E = dimensionPixelOffset;
        this.D = dimensionPixelOffset;
        int dimensionPixelOffset2 = typedArray.getDimensionPixelOffset(25, -1);
        if (dimensionPixelOffset2 >= 0) {
            this.D = dimensionPixelOffset2;
        }
        int dimensionPixelOffset3 = typedArray.getDimensionPixelOffset(24, -1);
        if (dimensionPixelOffset3 >= 0) {
            this.E = dimensionPixelOffset3;
        }
        int dimensionPixelOffset4 = typedArray.getDimensionPixelOffset(26, -1);
        if (dimensionPixelOffset4 >= 0) {
            this.F = dimensionPixelOffset4;
        }
        int dimensionPixelOffset5 = typedArray.getDimensionPixelOffset(23, -1);
        if (dimensionPixelOffset5 >= 0) {
            this.G = dimensionPixelOffset5;
        }
        this.C = typedArray.getDimensionPixelSize(13, -1);
        int dimensionPixelOffset6 = typedArray.getDimensionPixelOffset(9, Integer.MIN_VALUE);
        int dimensionPixelOffset7 = typedArray.getDimensionPixelOffset(5, Integer.MIN_VALUE);
        int dimensionPixelSize = typedArray.getDimensionPixelSize(7, 0);
        int dimensionPixelSize2 = typedArray.getDimensionPixelSize(8, 0);
        d();
        l1 l1Var = this.H;
        l1Var.f6132h = false;
        if (dimensionPixelSize != Integer.MIN_VALUE) {
            l1Var.f6130e = dimensionPixelSize;
            l1Var.f6126a = dimensionPixelSize;
        }
        if (dimensionPixelSize2 != Integer.MIN_VALUE) {
            l1Var.f6131f = dimensionPixelSize2;
            l1Var.f6127b = dimensionPixelSize2;
        }
        if (dimensionPixelOffset6 != Integer.MIN_VALUE || dimensionPixelOffset7 != Integer.MIN_VALUE) {
            l1Var.a(dimensionPixelOffset6, dimensionPixelOffset7);
        }
        this.I = typedArray.getDimensionPixelOffset(10, Integer.MIN_VALUE);
        this.J = typedArray.getDimensionPixelOffset(6, Integer.MIN_VALUE);
        this.f453t = z10.r(4);
        this.f454u = typedArray.getText(3);
        CharSequence text = typedArray.getText(21);
        if (!TextUtils.isEmpty(text)) {
            setTitle(text);
        }
        CharSequence text2 = typedArray.getText(18);
        if (!TextUtils.isEmpty(text2)) {
            setSubtitle(text2);
        }
        this.f457x = getContext();
        setPopupTheme(typedArray.getResourceId(17, 0));
        Drawable r9 = z10.r(16);
        if (r9 != null) {
            setNavigationIcon(r9);
        }
        CharSequence text3 = typedArray.getText(15);
        if (!TextUtils.isEmpty(text3)) {
            setNavigationContentDescription(text3);
        }
        Drawable r10 = z10.r(11);
        if (r10 != null) {
            setLogo(r10);
        }
        CharSequence text4 = typedArray.getText(12);
        if (!TextUtils.isEmpty(text4)) {
            setLogoDescription(text4);
        }
        if (typedArray.hasValue(29)) {
            setTitleTextColor(z10.q(29));
        }
        if (typedArray.hasValue(20)) {
            setSubtitleTextColor(z10.q(20));
        }
        if (typedArray.hasValue(14)) {
            getMenuInflater().inflate(typedArray.getResourceId(14, 0), getMenu());
        }
        z10.D();
    }

    public static y1 g() {
        y1 y1Var = new y1(-2, -2);
        y1Var.f6220b = 0;
        y1Var.f6219a = 8388627;
        return y1Var;
    }

    private ArrayList<MenuItem> getCurrentMenuItems() {
        ArrayList<MenuItem> arrayList = new ArrayList<>();
        Menu menu = getMenu();
        for (int i3 = 0; i3 < menu.size(); i3++) {
            arrayList.add(menu.getItem(i3));
        }
        return arrayList;
    }

    private MenuInflater getMenuInflater() {
        return new c(getContext());
    }

    public static y1 h(ViewGroup.LayoutParams layoutParams) {
        boolean z10 = layoutParams instanceof y1;
        if (z10) {
            y1 y1Var = (y1) layoutParams;
            y1 y1Var2 = new y1(y1Var);
            y1Var2.f6220b = 0;
            y1Var2.f6220b = y1Var.f6220b;
            return y1Var2;
        }
        if (z10) {
            y1 y1Var3 = new y1((y1) layoutParams);
            y1Var3.f6220b = 0;
            return y1Var3;
        }
        if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
            y1 y1Var4 = new y1(layoutParams);
            y1Var4.f6220b = 0;
            return y1Var4;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        y1 y1Var5 = new y1(marginLayoutParams);
        y1Var5.f6220b = 0;
        ((ViewGroup.MarginLayoutParams) y1Var5).leftMargin = marginLayoutParams.leftMargin;
        ((ViewGroup.MarginLayoutParams) y1Var5).topMargin = marginLayoutParams.topMargin;
        ((ViewGroup.MarginLayoutParams) y1Var5).rightMargin = marginLayoutParams.rightMargin;
        ((ViewGroup.MarginLayoutParams) y1Var5).bottomMargin = marginLayoutParams.bottomMargin;
        return y1Var5;
    }

    public static int j(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return marginLayoutParams.getMarginEnd() + marginLayoutParams.getMarginStart();
    }

    public static int k(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
    }

    public final void a(int i3, ArrayList arrayList) {
        boolean z10 = getLayoutDirection() == 1;
        int childCount = getChildCount();
        int absoluteGravity = Gravity.getAbsoluteGravity(i3, getLayoutDirection());
        arrayList.clear();
        if (!z10) {
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = getChildAt(i10);
                y1 y1Var = (y1) childAt.getLayoutParams();
                if (y1Var.f6220b == 0 && r(childAt)) {
                    int i11 = y1Var.f6219a;
                    int layoutDirection = getLayoutDirection();
                    int absoluteGravity2 = Gravity.getAbsoluteGravity(i11, layoutDirection) & 7;
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
        for (int i12 = childCount - 1; i12 >= 0; i12--) {
            View childAt2 = getChildAt(i12);
            y1 y1Var2 = (y1) childAt2.getLayoutParams();
            if (y1Var2.f6220b == 0 && r(childAt2)) {
                int i13 = y1Var2.f6219a;
                int layoutDirection2 = getLayoutDirection();
                int absoluteGravity3 = Gravity.getAbsoluteGravity(i13, layoutDirection2) & 7;
                if (absoluteGravity3 != 1 && absoluteGravity3 != 3 && absoluteGravity3 != 5) {
                    absoluteGravity3 = layoutDirection2 == 1 ? 5 : 3;
                }
                if (absoluteGravity3 == absoluteGravity) {
                    arrayList.add(childAt2);
                }
            }
        }
    }

    public final void b(View view, boolean z10) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        y1 g = layoutParams == null ? g() : !checkLayoutParams(layoutParams) ? h(layoutParams) : (y1) layoutParams;
        g.f6220b = 1;
        if (!z10 || this.f456w == null) {
            addView(view, g);
        } else {
            view.setLayoutParams(g);
            this.S.add(view);
        }
    }

    public final void c() {
        if (this.f455v == null) {
            q qVar = new q(getContext());
            this.f455v = qVar;
            qVar.setImageDrawable(this.f453t);
            this.f455v.setContentDescription(this.f454u);
            y1 g = g();
            g.f6219a = (this.B & 112) | 8388611;
            g.f6220b = 2;
            this.f455v.setLayoutParams(g);
            this.f455v.setOnClickListener(new u1(this));
        }
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return super.checkLayoutParams(layoutParams) && (layoutParams instanceof y1);
    }

    public final void d() {
        if (this.H == null) {
            l1 l1Var = new l1();
            l1Var.f6126a = 0;
            l1Var.f6127b = 0;
            l1Var.f6128c = Integer.MIN_VALUE;
            l1Var.f6129d = Integer.MIN_VALUE;
            l1Var.f6130e = 0;
            l1Var.f6131f = 0;
            l1Var.g = false;
            l1Var.f6132h = false;
            this.H = l1Var;
        }
    }

    public final void e() {
        if (this.f444d == null) {
            ActionMenuView actionMenuView = new ActionMenuView(getContext());
            this.f444d = actionMenuView;
            actionMenuView.setPopupTheme(this.f458y);
            this.f444d.setOnMenuItemClickListener(this.W);
            ActionMenuView actionMenuView2 = this.f444d;
            t1 t1Var = new t1(this);
            actionMenuView2.getClass();
            actionMenuView2.H = t1Var;
            y1 g = g();
            g.f6219a = (this.B & 112) | 8388613;
            this.f444d.setLayoutParams(g);
            b(this.f444d, false);
        }
        ActionMenuView actionMenuView3 = this.f444d;
        if (actionMenuView3.D == null) {
            i iVar = (i) actionMenuView3.getMenu();
            if (this.f442b0 == null) {
                this.f442b0 = new x1(this);
            }
            this.f444d.setExpandedActionViewsExclusive(true);
            iVar.b(this.f442b0, this.f457x);
            s();
        }
    }

    public final void f() {
        if (this.f451r == null) {
            this.f451r = new q(getContext());
            y1 g = g();
            g.f6219a = (this.B & 112) | 8388611;
            this.f451r.setLayoutParams(g);
        }
    }

    @Override // android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return g();
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        Context context = getContext();
        y1 y1Var = new y1(context, attributeSet);
        y1Var.f6219a = 0;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a.f4541b);
        y1Var.f6219a = obtainStyledAttributes.getInt(0, 0);
        obtainStyledAttributes.recycle();
        y1Var.f6220b = 0;
        return y1Var;
    }

    public CharSequence getCollapseContentDescription() {
        q qVar = this.f455v;
        if (qVar != null) {
            return qVar.getContentDescription();
        }
        return null;
    }

    public Drawable getCollapseIcon() {
        q qVar = this.f455v;
        if (qVar != null) {
            return qVar.getDrawable();
        }
        return null;
    }

    public int getContentInsetEnd() {
        l1 l1Var = this.H;
        if (l1Var != null) {
            return l1Var.g ? l1Var.f6126a : l1Var.f6127b;
        }
        return 0;
    }

    public int getContentInsetEndWithActions() {
        int i3 = this.J;
        return i3 != Integer.MIN_VALUE ? i3 : getContentInsetEnd();
    }

    public int getContentInsetLeft() {
        l1 l1Var = this.H;
        if (l1Var != null) {
            return l1Var.f6126a;
        }
        return 0;
    }

    public int getContentInsetRight() {
        l1 l1Var = this.H;
        if (l1Var != null) {
            return l1Var.f6127b;
        }
        return 0;
    }

    public int getContentInsetStart() {
        l1 l1Var = this.H;
        if (l1Var != null) {
            return l1Var.g ? l1Var.f6127b : l1Var.f6126a;
        }
        return 0;
    }

    public int getContentInsetStartWithNavigation() {
        int i3 = this.I;
        return i3 != Integer.MIN_VALUE ? i3 : getContentInsetStart();
    }

    public int getCurrentContentInsetEnd() {
        i iVar;
        ActionMenuView actionMenuView = this.f444d;
        return (actionMenuView == null || (iVar = actionMenuView.D) == null || !iVar.hasVisibleItems()) ? getContentInsetEnd() : Math.max(getContentInsetEnd(), Math.max(this.J, 0));
    }

    public int getCurrentContentInsetLeft() {
        return getLayoutDirection() == 1 ? getCurrentContentInsetEnd() : getCurrentContentInsetStart();
    }

    public int getCurrentContentInsetRight() {
        return getLayoutDirection() == 1 ? getCurrentContentInsetStart() : getCurrentContentInsetEnd();
    }

    public int getCurrentContentInsetStart() {
        return getNavigationIcon() != null ? Math.max(getContentInsetStart(), Math.max(this.I, 0)) : getContentInsetStart();
    }

    public Drawable getLogo() {
        r rVar = this.f452s;
        if (rVar != null) {
            return rVar.getDrawable();
        }
        return null;
    }

    public CharSequence getLogoDescription() {
        r rVar = this.f452s;
        if (rVar != null) {
            return rVar.getContentDescription();
        }
        return null;
    }

    public Menu getMenu() {
        e();
        return this.f444d.getMenu();
    }

    public View getNavButtonView() {
        return this.f451r;
    }

    public CharSequence getNavigationContentDescription() {
        q qVar = this.f451r;
        if (qVar != null) {
            return qVar.getContentDescription();
        }
        return null;
    }

    public Drawable getNavigationIcon() {
        q qVar = this.f451r;
        if (qVar != null) {
            return qVar.getDrawable();
        }
        return null;
    }

    public j getOuterActionMenuPresenter() {
        return null;
    }

    public Drawable getOverflowIcon() {
        e();
        return this.f444d.getOverflowIcon();
    }

    public Context getPopupContext() {
        return this.f457x;
    }

    public int getPopupTheme() {
        return this.f458y;
    }

    public CharSequence getSubtitle() {
        return this.M;
    }

    public final TextView getSubtitleTextView() {
        return this.f450i;
    }

    public CharSequence getTitle() {
        return this.L;
    }

    public int getTitleMarginBottom() {
        return this.G;
    }

    public int getTitleMarginEnd() {
        return this.E;
    }

    public int getTitleMarginStart() {
        return this.D;
    }

    public int getTitleMarginTop() {
        return this.F;
    }

    public final TextView getTitleTextView() {
        return this.f446e;
    }

    public j0 getWrapper() {
        Drawable drawable;
        if (this.f441a0 == null) {
            c2 c2Var = new c2();
            c2Var.f6059k = 0;
            c2Var.f6051a = this;
            c2Var.f6057h = getTitle();
            c2Var.f6058i = getSubtitle();
            c2Var.g = c2Var.f6057h != null;
            c2Var.f6056f = getNavigationIcon();
            n z10 = n.z(getContext(), null, a.f4540a, R.attr.actionBarStyle);
            TypedArray typedArray = (TypedArray) z10.f40e;
            c2Var.f6060l = z10.r(15);
            CharSequence text = typedArray.getText(27);
            if (!TextUtils.isEmpty(text)) {
                c2Var.g = true;
                c2Var.f6057h = text;
                if ((c2Var.f6052b & 8) != 0) {
                    setTitle(text);
                    if (c2Var.g) {
                        o3.c0.e(getRootView(), text);
                    }
                }
            }
            CharSequence text2 = typedArray.getText(25);
            if (!TextUtils.isEmpty(text2)) {
                c2Var.f6058i = text2;
                if ((c2Var.f6052b & 8) != 0) {
                    setSubtitle(text2);
                }
            }
            Drawable r9 = z10.r(20);
            if (r9 != null) {
                c2Var.f6055e = r9;
                c2Var.c();
            }
            Drawable r10 = z10.r(17);
            if (r10 != null) {
                c2Var.f6054d = r10;
                c2Var.c();
            }
            if (c2Var.f6056f == null && (drawable = c2Var.f6060l) != null) {
                c2Var.f6056f = drawable;
                if ((c2Var.f6052b & 4) != 0) {
                    setNavigationIcon(drawable);
                } else {
                    setNavigationIcon((Drawable) null);
                }
            }
            c2Var.a(typedArray.getInt(10, 0));
            int resourceId = typedArray.getResourceId(9, 0);
            if (resourceId != 0) {
                View inflate = LayoutInflater.from(getContext()).inflate(resourceId, (ViewGroup) this, false);
                View view = c2Var.f6053c;
                if (view != null && (c2Var.f6052b & 16) != 0) {
                    removeView(view);
                }
                c2Var.f6053c = inflate;
                if (inflate != null && (c2Var.f6052b & 16) != 0) {
                    addView(inflate);
                }
                c2Var.a(c2Var.f6052b | 16);
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
                this.H.a(max, max2);
            }
            int resourceId2 = typedArray.getResourceId(28, 0);
            if (resourceId2 != 0) {
                Context context = getContext();
                this.f459z = resourceId2;
                c0 c0Var = this.f446e;
                if (c0Var != null) {
                    c0Var.setTextAppearance(context, resourceId2);
                }
            }
            int resourceId3 = typedArray.getResourceId(26, 0);
            if (resourceId3 != 0) {
                Context context2 = getContext();
                this.A = resourceId3;
                c0 c0Var2 = this.f450i;
                if (c0Var2 != null) {
                    c0Var2.setTextAppearance(context2, resourceId3);
                }
            }
            int resourceId4 = typedArray.getResourceId(22, 0);
            if (resourceId4 != 0) {
                setPopupTheme(resourceId4);
            }
            z10.D();
            if (R.string.abc_action_bar_up_description != c2Var.f6059k) {
                c2Var.f6059k = R.string.abc_action_bar_up_description;
                if (TextUtils.isEmpty(getNavigationContentDescription())) {
                    int i3 = c2Var.f6059k;
                    c2Var.j = i3 != 0 ? getContext().getString(i3) : null;
                    c2Var.b();
                }
            }
            c2Var.j = getNavigationContentDescription();
            b2 b2Var = new b2();
            c2Var.f6051a.getContext();
            setNavigationOnClickListener(b2Var);
            this.f441a0 = c2Var;
        }
        return this.f441a0;
    }

    public final int i(View view, int i3) {
        y1 y1Var = (y1) view.getLayoutParams();
        int measuredHeight = view.getMeasuredHeight();
        int i10 = i3 > 0 ? (measuredHeight - i3) / 2 : 0;
        int i11 = y1Var.f6219a & 112;
        if (i11 != 16 && i11 != 48 && i11 != 80) {
            i11 = this.K & 112;
        }
        if (i11 == 48) {
            return getPaddingTop() - i10;
        }
        if (i11 == 80) {
            return (((getHeight() - getPaddingBottom()) - measuredHeight) - ((ViewGroup.MarginLayoutParams) y1Var).bottomMargin) - i10;
        }
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int height = getHeight();
        int i12 = (((height - paddingTop) - paddingBottom) - measuredHeight) / 2;
        int i13 = ((ViewGroup.MarginLayoutParams) y1Var).topMargin;
        if (i12 < i13) {
            i12 = i13;
        } else {
            int i14 = (((height - paddingBottom) - measuredHeight) - i12) - paddingTop;
            int i15 = ((ViewGroup.MarginLayoutParams) y1Var).bottomMargin;
            if (i14 < i15) {
                i12 = Math.max(0, i12 - (i15 - i14));
            }
        }
        return paddingTop + i12;
    }

    public final void l() {
        ArrayList arrayList = this.V;
        int size = arrayList.size();
        int i3 = 0;
        while (i3 < size) {
            Object obj = arrayList.get(i3);
            i3++;
            getMenu().removeItem(((MenuItem) obj).getItemId());
        }
        getMenu();
        ArrayList<MenuItem> currentMenuItems = getCurrentMenuItems();
        getMenuInflater();
        Iterator it = ((CopyOnWriteArrayList) this.U.f5643e).iterator();
        if (it.hasNext()) {
            ((h) it.next()).getClass();
            throw null;
        }
        ArrayList<MenuItem> currentMenuItems2 = getCurrentMenuItems();
        currentMenuItems2.removeAll(currentMenuItems);
        this.V = currentMenuItems2;
    }

    public final boolean m(View view) {
        return view.getParent() == this || this.S.contains(view);
    }

    public final int n(View view, int i3, int i10, int[] iArr) {
        y1 y1Var = (y1) view.getLayoutParams();
        int i11 = ((ViewGroup.MarginLayoutParams) y1Var).leftMargin - iArr[0];
        int max = Math.max(0, i11) + i3;
        iArr[0] = Math.max(0, -i11);
        int i12 = i(view, i10);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(max, i12, max + measuredWidth, view.getMeasuredHeight() + i12);
        return measuredWidth + ((ViewGroup.MarginLayoutParams) y1Var).rightMargin + max;
    }

    public final int o(View view, int i3, int i10, int[] iArr) {
        y1 y1Var = (y1) view.getLayoutParams();
        int i11 = ((ViewGroup.MarginLayoutParams) y1Var).rightMargin - iArr[1];
        int max = i3 - Math.max(0, i11);
        iArr[1] = Math.max(0, -i11);
        int i12 = i(view, i10);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(max - measuredWidth, i12, max, view.getMeasuredHeight() + i12);
        return max - (measuredWidth + ((ViewGroup.MarginLayoutParams) y1Var).leftMargin);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        s();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeCallbacks(this.f449g0);
        s();
    }

    @Override // android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.Q = false;
        }
        if (!this.Q) {
            boolean onHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !onHoverEvent) {
                this.Q = true;
            }
        }
        if (actionMasked != 10 && actionMasked != 3) {
            return true;
        }
        this.Q = false;
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:115:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0285 A[LOOP:0: B:44:0x0283->B:45:0x0285, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x029d A[LOOP:1: B:48:0x029b->B:49:0x029d, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x02bd A[LOOP:2: B:52:0x02bb->B:53:0x02bd, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0303  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0310 A[LOOP:3: B:61:0x030e->B:62:0x0310, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x01a0  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x020e  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onLayout(boolean z10, int i3, int i10, int i11, int i12) {
        int i13;
        int i14;
        int max;
        boolean r9;
        boolean r10;
        boolean z11;
        int i15;
        int i16;
        int paddingTop;
        int i17;
        int i18;
        int i19;
        int i20;
        int size;
        int i21;
        int i22;
        int size2;
        int i23;
        int size3;
        int i24;
        int i25;
        int i26;
        int size4;
        boolean z12 = getLayoutDirection() == 1;
        int width = getWidth();
        int height = getHeight();
        int paddingLeft = getPaddingLeft();
        int paddingRight = getPaddingRight();
        int paddingTop2 = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int i27 = width - paddingRight;
        int[] iArr = this.T;
        iArr[1] = 0;
        iArr[0] = 0;
        Field field = o3.c0.f7378a;
        int minimumHeight = getMinimumHeight();
        int min = minimumHeight >= 0 ? Math.min(minimumHeight, i12 - i10) : 0;
        if (r(this.f451r)) {
            q qVar = this.f451r;
            if (z12) {
                i14 = o(qVar, i27, min, iArr);
                i13 = paddingLeft;
                if (r(this.f455v)) {
                    q qVar2 = this.f455v;
                    if (z12) {
                        i14 = o(qVar2, i14, min, iArr);
                    } else {
                        i13 = n(qVar2, i13, min, iArr);
                    }
                }
                if (r(this.f444d)) {
                    ActionMenuView actionMenuView = this.f444d;
                    if (z12) {
                        i13 = n(actionMenuView, i13, min, iArr);
                    } else {
                        i14 = o(actionMenuView, i14, min, iArr);
                    }
                }
                int currentContentInsetLeft = getCurrentContentInsetLeft();
                int currentContentInsetRight = getCurrentContentInsetRight();
                iArr[0] = Math.max(0, currentContentInsetLeft - i13);
                iArr[1] = Math.max(0, currentContentInsetRight - (i27 - i14));
                max = Math.max(i13, currentContentInsetLeft);
                int min2 = Math.min(i14, i27 - currentContentInsetRight);
                if (r(this.f456w)) {
                    View view = this.f456w;
                    if (z12) {
                        min2 = o(view, min2, min, iArr);
                    } else {
                        max = n(view, max, min, iArr);
                    }
                }
                if (r(this.f452s)) {
                    r rVar = this.f452s;
                    if (z12) {
                        min2 = o(rVar, min2, min, iArr);
                    } else {
                        max = n(rVar, max, min, iArr);
                    }
                }
                r9 = r(this.f446e);
                r10 = r(this.f450i);
                if (r9) {
                    z11 = z12;
                    i15 = 0;
                } else {
                    y1 y1Var = (y1) this.f446e.getLayoutParams();
                    z11 = z12;
                    i15 = this.f446e.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) y1Var).topMargin + ((ViewGroup.MarginLayoutParams) y1Var).bottomMargin;
                }
                if (!r10) {
                    y1 y1Var2 = (y1) this.f450i.getLayoutParams();
                    i15 = this.f450i.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) y1Var2).topMargin + ((ViewGroup.MarginLayoutParams) y1Var2).bottomMargin + i15;
                }
                if (!r9 || r10) {
                    c0 c0Var = !r9 ? this.f446e : this.f450i;
                    c0 c0Var2 = !r10 ? this.f450i : this.f446e;
                    y1 y1Var3 = (y1) c0Var.getLayoutParams();
                    y1 y1Var4 = (y1) c0Var2.getLayoutParams();
                    int i28 = i15;
                    boolean z13 = (!r9 && this.f446e.getMeasuredWidth() > 0) || (r10 && this.f450i.getMeasuredWidth() > 0);
                    i16 = this.K & 112;
                    int i29 = max;
                    if (i16 != 48) {
                        paddingTop = getPaddingTop() + ((ViewGroup.MarginLayoutParams) y1Var3).topMargin + this.F;
                    } else if (i16 != 80) {
                        int i30 = (((height - paddingTop2) - paddingBottom) - i28) / 2;
                        int i31 = ((ViewGroup.MarginLayoutParams) y1Var3).topMargin + this.F;
                        if (i30 < i31) {
                            i30 = i31;
                        } else {
                            int i32 = (((height - paddingBottom) - i28) - i30) - paddingTop2;
                            int i33 = ((ViewGroup.MarginLayoutParams) y1Var3).bottomMargin;
                            int i34 = this.G;
                            if (i32 < i33 + i34) {
                                i30 = Math.max(0, i30 - ((((ViewGroup.MarginLayoutParams) y1Var4).bottomMargin + i34) - i32));
                            }
                        }
                        paddingTop = paddingTop2 + i30;
                    } else {
                        paddingTop = (((height - paddingBottom) - ((ViewGroup.MarginLayoutParams) y1Var4).bottomMargin) - this.G) - i28;
                    }
                    if (z11) {
                        int i35 = (z13 ? this.D : 0) - iArr[0];
                        max = Math.max(0, i35) + i29;
                        iArr[0] = Math.max(0, -i35);
                        if (r9) {
                            y1 y1Var5 = (y1) this.f446e.getLayoutParams();
                            int measuredWidth = this.f446e.getMeasuredWidth() + max;
                            int measuredHeight = this.f446e.getMeasuredHeight() + paddingTop;
                            this.f446e.layout(max, paddingTop, measuredWidth, measuredHeight);
                            i17 = measuredWidth + this.E;
                            paddingTop = measuredHeight + ((ViewGroup.MarginLayoutParams) y1Var5).bottomMargin;
                        } else {
                            i17 = max;
                        }
                        if (r10) {
                            int i36 = paddingTop + ((ViewGroup.MarginLayoutParams) ((y1) this.f450i.getLayoutParams())).topMargin;
                            int measuredWidth2 = this.f450i.getMeasuredWidth() + max;
                            this.f450i.layout(max, i36, measuredWidth2, this.f450i.getMeasuredHeight() + i36);
                            i18 = measuredWidth2 + this.E;
                        } else {
                            i18 = max;
                        }
                        if (z13) {
                            max = Math.max(i17, i18);
                        }
                    } else {
                        int i37 = (z13 ? this.D : 0) - iArr[1];
                        min2 -= Math.max(0, i37);
                        iArr[1] = Math.max(0, -i37);
                        if (r9) {
                            y1 y1Var6 = (y1) this.f446e.getLayoutParams();
                            int measuredWidth3 = min2 - this.f446e.getMeasuredWidth();
                            int measuredHeight2 = this.f446e.getMeasuredHeight() + paddingTop;
                            this.f446e.layout(measuredWidth3, paddingTop, min2, measuredHeight2);
                            i19 = measuredWidth3 - this.E;
                            paddingTop = measuredHeight2 + ((ViewGroup.MarginLayoutParams) y1Var6).bottomMargin;
                        } else {
                            i19 = min2;
                        }
                        if (r10) {
                            int i38 = paddingTop + ((ViewGroup.MarginLayoutParams) ((y1) this.f450i.getLayoutParams())).topMargin;
                            this.f450i.layout(min2 - this.f450i.getMeasuredWidth(), i38, min2, this.f450i.getMeasuredHeight() + i38);
                            i20 = min2 - this.E;
                        } else {
                            i20 = min2;
                        }
                        if (z13) {
                            min2 = Math.min(i19, i20);
                        }
                        max = i29;
                    }
                }
                ArrayList arrayList = this.R;
                a(3, arrayList);
                size = arrayList.size();
                i21 = max;
                for (i22 = 0; i22 < size; i22++) {
                    i21 = n((View) arrayList.get(i22), i21, min, iArr);
                }
                a(5, arrayList);
                size2 = arrayList.size();
                for (i23 = 0; i23 < size2; i23++) {
                    min2 = o((View) arrayList.get(i23), min2, min, iArr);
                }
                a(1, arrayList);
                int i39 = iArr[0];
                int i40 = iArr[1];
                size3 = arrayList.size();
                int i41 = i39;
                i24 = 0;
                int i42 = 0;
                while (i24 < size3) {
                    View view2 = (View) arrayList.get(i24);
                    y1 y1Var7 = (y1) view2.getLayoutParams();
                    int i43 = i40;
                    int i44 = ((ViewGroup.MarginLayoutParams) y1Var7).leftMargin - i41;
                    int i45 = ((ViewGroup.MarginLayoutParams) y1Var7).rightMargin - i43;
                    int max2 = Math.max(0, i44);
                    int max3 = Math.max(0, i45);
                    int max4 = Math.max(0, -i44);
                    int max5 = Math.max(0, -i45);
                    i42 += view2.getMeasuredWidth() + max2 + max3;
                    i24++;
                    i41 = max4;
                    i40 = max5;
                }
                i26 = ((((width - paddingLeft) - paddingRight) / 2) + paddingLeft) - (i42 / 2);
                int i46 = i42 + i26;
                if (i26 >= i21) {
                    i21 = i46 > min2 ? i26 - (i46 - min2) : i26;
                }
                size4 = arrayList.size();
                for (i25 = 0; i25 < size4; i25++) {
                    i21 = n((View) arrayList.get(i25), i21, min, iArr);
                }
                arrayList.clear();
            }
            i13 = n(qVar, paddingLeft, min, iArr);
        } else {
            i13 = paddingLeft;
        }
        i14 = i27;
        if (r(this.f455v)) {
        }
        if (r(this.f444d)) {
        }
        int currentContentInsetLeft2 = getCurrentContentInsetLeft();
        int currentContentInsetRight2 = getCurrentContentInsetRight();
        iArr[0] = Math.max(0, currentContentInsetLeft2 - i13);
        iArr[1] = Math.max(0, currentContentInsetRight2 - (i27 - i14));
        max = Math.max(i13, currentContentInsetLeft2);
        int min22 = Math.min(i14, i27 - currentContentInsetRight2);
        if (r(this.f456w)) {
        }
        if (r(this.f452s)) {
        }
        r9 = r(this.f446e);
        r10 = r(this.f450i);
        if (r9) {
        }
        if (!r10) {
        }
        if (!r9) {
        }
        if (!r9) {
        }
        if (!r10) {
        }
        y1 y1Var32 = (y1) c0Var.getLayoutParams();
        y1 y1Var42 = (y1) c0Var2.getLayoutParams();
        int i282 = i15;
        if (r9) {
        }
        i16 = this.K & 112;
        int i292 = max;
        if (i16 != 48) {
        }
        if (z11) {
        }
        ArrayList arrayList2 = this.R;
        a(3, arrayList2);
        size = arrayList2.size();
        i21 = max;
        while (i22 < size) {
        }
        a(5, arrayList2);
        size2 = arrayList2.size();
        while (i23 < size2) {
        }
        a(1, arrayList2);
        int i392 = iArr[0];
        int i402 = iArr[1];
        size3 = arrayList2.size();
        int i412 = i392;
        i24 = 0;
        int i422 = 0;
        while (i24 < size3) {
        }
        i26 = ((((width - paddingLeft) - paddingRight) / 2) + paddingLeft) - (i422 / 2);
        int i462 = i422 + i26;
        if (i26 >= i21) {
        }
        size4 = arrayList2.size();
        while (i25 < size4) {
        }
        arrayList2.clear();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.View
    public final void onMeasure(int i3, int i10) {
        char c10;
        Object[] objArr;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        boolean z10 = j2.f6117a;
        int i18 = 0;
        if (getLayoutDirection() == 1) {
            objArr = true;
            c10 = 0;
        } else {
            c10 = 1;
            objArr = false;
        }
        if (r(this.f451r)) {
            q(this.f451r, i3, 0, i10, this.C);
            i11 = j(this.f451r) + this.f451r.getMeasuredWidth();
            i12 = Math.max(0, k(this.f451r) + this.f451r.getMeasuredHeight());
            i13 = View.combineMeasuredStates(0, this.f451r.getMeasuredState());
        } else {
            i11 = 0;
            i12 = 0;
            i13 = 0;
        }
        if (r(this.f455v)) {
            q(this.f455v, i3, 0, i10, this.C);
            i11 = j(this.f455v) + this.f455v.getMeasuredWidth();
            i12 = Math.max(i12, k(this.f455v) + this.f455v.getMeasuredHeight());
            i13 = View.combineMeasuredStates(i13, this.f455v.getMeasuredState());
        }
        int currentContentInsetStart = getCurrentContentInsetStart();
        int max = Math.max(currentContentInsetStart, i11);
        int max2 = Math.max(0, currentContentInsetStart - i11);
        Object[] objArr2 = objArr;
        int[] iArr = this.T;
        iArr[objArr2 == true ? 1 : 0] = max2;
        if (r(this.f444d)) {
            q(this.f444d, i3, max, i10, this.C);
            i14 = j(this.f444d) + this.f444d.getMeasuredWidth();
            i12 = Math.max(i12, k(this.f444d) + this.f444d.getMeasuredHeight());
            i13 = View.combineMeasuredStates(i13, this.f444d.getMeasuredState());
        } else {
            i14 = 0;
        }
        int currentContentInsetEnd = getCurrentContentInsetEnd();
        int max3 = max + Math.max(currentContentInsetEnd, i14);
        iArr[c10] = Math.max(0, currentContentInsetEnd - i14);
        if (r(this.f456w)) {
            max3 += p(this.f456w, i3, max3, i10, 0, iArr);
            i12 = Math.max(i12, k(this.f456w) + this.f456w.getMeasuredHeight());
            i13 = View.combineMeasuredStates(i13, this.f456w.getMeasuredState());
        }
        if (r(this.f452s)) {
            max3 += p(this.f452s, i3, max3, i10, 0, iArr);
            i12 = Math.max(i12, k(this.f452s) + this.f452s.getMeasuredHeight());
            i13 = View.combineMeasuredStates(i13, this.f452s.getMeasuredState());
        }
        int childCount = getChildCount();
        for (int i19 = 0; i19 < childCount; i19++) {
            View childAt = getChildAt(i19);
            if (((y1) childAt.getLayoutParams()).f6220b == 0 && r(childAt)) {
                max3 += p(childAt, i3, max3, i10, 0, iArr);
                int max4 = Math.max(i12, k(childAt) + childAt.getMeasuredHeight());
                i13 = View.combineMeasuredStates(i13, childAt.getMeasuredState());
                i12 = max4;
            } else {
                max3 = max3;
            }
        }
        int i20 = max3;
        int i21 = this.F + this.G;
        int i22 = this.D + this.E;
        if (r(this.f446e)) {
            p(this.f446e, i3, i20 + i22, i10, i21, iArr);
            int j = j(this.f446e) + this.f446e.getMeasuredWidth();
            i15 = k(this.f446e) + this.f446e.getMeasuredHeight();
            i16 = View.combineMeasuredStates(i13, this.f446e.getMeasuredState());
            i17 = j;
        } else {
            i15 = 0;
            i16 = i13;
            i17 = 0;
        }
        if (r(this.f450i)) {
            i17 = Math.max(i17, p(this.f450i, i3, i20 + i22, i10, i21 + i15, iArr));
            i15 += k(this.f450i) + this.f450i.getMeasuredHeight();
            i16 = View.combineMeasuredStates(i16, this.f450i.getMeasuredState());
        }
        int max5 = Math.max(i12, i15);
        int paddingRight = getPaddingRight() + getPaddingLeft() + i20 + i17;
        int paddingBottom = getPaddingBottom() + getPaddingTop() + max5;
        int resolveSizeAndState = View.resolveSizeAndState(Math.max(paddingRight, getSuggestedMinimumWidth()), i3, (-16777216) & i16);
        int resolveSizeAndState2 = View.resolveSizeAndState(Math.max(paddingBottom, getSuggestedMinimumHeight()), i10, i16 << 16);
        if (this.f443c0) {
            int childCount2 = getChildCount();
            for (int i23 = 0; i23 < childCount2; i23++) {
                View childAt2 = getChildAt(i23);
                if (!r(childAt2) || childAt2.getMeasuredWidth() <= 0 || childAt2.getMeasuredHeight() <= 0) {
                }
            }
            setMeasuredDimension(resolveSizeAndState, i18);
        }
        i18 = resolveSizeAndState2;
        setMeasuredDimension(resolveSizeAndState, i18);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        MenuItem findItem;
        if (!(parcelable instanceof a2)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        a2 a2Var = (a2) parcelable;
        super.onRestoreInstanceState(a2Var.f9953d);
        ActionMenuView actionMenuView = this.f444d;
        i iVar = actionMenuView != null ? actionMenuView.D : null;
        int i3 = a2Var.f6025i;
        if (i3 != 0 && this.f442b0 != null && iVar != null && (findItem = iVar.findItem(i3)) != null) {
            findItem.expandActionView();
        }
        if (a2Var.f6026r) {
            k kVar = this.f449g0;
            removeCallbacks(kVar);
            post(kVar);
        }
    }

    @Override // android.view.View
    public final void onRtlPropertiesChanged(int i3) {
        super.onRtlPropertiesChanged(i3);
        d();
        l1 l1Var = this.H;
        boolean z10 = i3 == 1;
        if (z10 == l1Var.g) {
            return;
        }
        l1Var.g = z10;
        if (!l1Var.f6132h) {
            l1Var.f6126a = l1Var.f6130e;
            l1Var.f6127b = l1Var.f6131f;
            return;
        }
        if (z10) {
            int i10 = l1Var.f6129d;
            if (i10 == Integer.MIN_VALUE) {
                i10 = l1Var.f6130e;
            }
            l1Var.f6126a = i10;
            int i11 = l1Var.f6128c;
            if (i11 == Integer.MIN_VALUE) {
                i11 = l1Var.f6131f;
            }
            l1Var.f6127b = i11;
            return;
        }
        int i12 = l1Var.f6128c;
        if (i12 == Integer.MIN_VALUE) {
            i12 = l1Var.f6130e;
        }
        l1Var.f6126a = i12;
        int i13 = l1Var.f6129d;
        if (i13 == Integer.MIN_VALUE) {
            i13 = l1Var.f6131f;
        }
        l1Var.f6127b = i13;
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        j jVar;
        g gVar;
        l.j jVar2;
        a2 a2Var = new a2(super.onSaveInstanceState());
        x1 x1Var = this.f442b0;
        if (x1Var != null && (jVar2 = x1Var.f6204e) != null) {
            a2Var.f6025i = jVar2.f5683a;
        }
        ActionMenuView actionMenuView = this.f444d;
        a2Var.f6026r = (actionMenuView == null || (jVar = actionMenuView.G) == null || (gVar = jVar.F) == null || !gVar.b()) ? false : true;
        return a2Var;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.P = false;
        }
        if (!this.P) {
            boolean onTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !onTouchEvent) {
                this.P = true;
            }
        }
        if (actionMasked != 1 && actionMasked != 3) {
            return true;
        }
        this.P = false;
        return true;
    }

    public final int p(View view, int i3, int i10, int i11, int i12, int[] iArr) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int i13 = marginLayoutParams.leftMargin - iArr[0];
        int i14 = marginLayoutParams.rightMargin - iArr[1];
        int max = Math.max(0, i14) + Math.max(0, i13);
        iArr[0] = Math.max(0, -i13);
        iArr[1] = Math.max(0, -i14);
        view.measure(ViewGroup.getChildMeasureSpec(i3, getPaddingRight() + getPaddingLeft() + max + i10, marginLayoutParams.width), ViewGroup.getChildMeasureSpec(i11, getPaddingBottom() + getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i12, marginLayoutParams.height));
        return view.getMeasuredWidth() + max;
    }

    public final void q(View view, int i3, int i10, int i11, int i12) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i3, getPaddingRight() + getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i10, marginLayoutParams.width);
        int childMeasureSpec2 = ViewGroup.getChildMeasureSpec(i11, getPaddingBottom() + getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, marginLayoutParams.height);
        int mode = View.MeasureSpec.getMode(childMeasureSpec2);
        if (mode != 1073741824 && i12 >= 0) {
            if (mode != 0) {
                i12 = Math.min(View.MeasureSpec.getSize(childMeasureSpec2), i12);
            }
            childMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i12, 1073741824);
        }
        view.measure(childMeasureSpec, childMeasureSpec2);
    }

    public final boolean r(View view) {
        return (view == null || view.getParent() != this || view.getVisibility() == 8) ? false : true;
    }

    public final void s() {
        OnBackInvokedDispatcher onBackInvokedDispatcher;
        if (Build.VERSION.SDK_INT >= 33) {
            OnBackInvokedDispatcher a9 = w1.a(this);
            x1 x1Var = this.f442b0;
            boolean z10 = (x1Var == null || x1Var.f6204e == null || a9 == null || !isAttachedToWindow() || !this.f448f0) ? false : true;
            if (z10 && this.f447e0 == null) {
                if (this.f445d0 == null) {
                    this.f445d0 = w1.b(new s1(this, 0));
                }
                w1.c(a9, this.f445d0);
                this.f447e0 = a9;
                return;
            }
            if (z10 || (onBackInvokedDispatcher = this.f447e0) == null) {
                return;
            }
            w1.d(onBackInvokedDispatcher, this.f445d0);
            this.f447e0 = null;
        }
    }

    public void setBackInvokedCallbackEnabled(boolean z10) {
        if (this.f448f0 != z10) {
            this.f448f0 = z10;
            s();
        }
    }

    public void setCollapseContentDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            c();
        }
        q qVar = this.f455v;
        if (qVar != null) {
            qVar.setContentDescription(charSequence);
        }
    }

    public void setCollapseIcon(Drawable drawable) {
        if (drawable != null) {
            c();
            this.f455v.setImageDrawable(drawable);
        } else {
            q qVar = this.f455v;
            if (qVar != null) {
                qVar.setImageDrawable(this.f453t);
            }
        }
    }

    public void setCollapsible(boolean z10) {
        this.f443c0 = z10;
        requestLayout();
    }

    public void setContentInsetEndWithActions(int i3) {
        if (i3 < 0) {
            i3 = Integer.MIN_VALUE;
        }
        if (i3 != this.J) {
            this.J = i3;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setContentInsetStartWithNavigation(int i3) {
        if (i3 < 0) {
            i3 = Integer.MIN_VALUE;
        }
        if (i3 != this.I) {
            this.I = i3;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setLogo(Drawable drawable) {
        r rVar = this.f452s;
        if (drawable != null) {
            if (rVar == null) {
                this.f452s = new r(getContext(), 0);
            }
            if (!m(this.f452s)) {
                b(this.f452s, true);
            }
        } else if (rVar != null && m(rVar)) {
            removeView(this.f452s);
            this.S.remove(this.f452s);
        }
        r rVar2 = this.f452s;
        if (rVar2 != null) {
            rVar2.setImageDrawable(drawable);
        }
    }

    public void setLogoDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence) && this.f452s == null) {
            this.f452s = new r(getContext(), 0);
        }
        r rVar = this.f452s;
        if (rVar != null) {
            rVar.setContentDescription(charSequence);
        }
    }

    public void setNavigationContentDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            f();
        }
        q qVar = this.f451r;
        if (qVar != null) {
            qVar.setContentDescription(charSequence);
            e.R(this.f451r, charSequence);
        }
    }

    public void setNavigationIcon(Drawable drawable) {
        if (drawable != null) {
            f();
            if (!m(this.f451r)) {
                b(this.f451r, true);
            }
        } else {
            q qVar = this.f451r;
            if (qVar != null && m(qVar)) {
                removeView(this.f451r);
                this.S.remove(this.f451r);
            }
        }
        q qVar2 = this.f451r;
        if (qVar2 != null) {
            qVar2.setImageDrawable(drawable);
        }
    }

    public void setNavigationOnClickListener(View.OnClickListener onClickListener) {
        f();
        this.f451r.setOnClickListener(onClickListener);
    }

    public void setOverflowIcon(Drawable drawable) {
        e();
        this.f444d.setOverflowIcon(drawable);
    }

    public void setPopupTheme(int i3) {
        if (this.f458y != i3) {
            this.f458y = i3;
            if (i3 == 0) {
                this.f457x = getContext();
            } else {
                this.f457x = new ContextThemeWrapper(getContext(), i3);
            }
        }
    }

    public void setSubtitle(CharSequence charSequence) {
        boolean isEmpty = TextUtils.isEmpty(charSequence);
        c0 c0Var = this.f450i;
        if (!isEmpty) {
            if (c0Var == null) {
                Context context = getContext();
                c0 c0Var2 = new c0(context, null);
                this.f450i = c0Var2;
                c0Var2.setSingleLine();
                this.f450i.setEllipsize(TextUtils.TruncateAt.END);
                int i3 = this.A;
                if (i3 != 0) {
                    this.f450i.setTextAppearance(context, i3);
                }
                ColorStateList colorStateList = this.O;
                if (colorStateList != null) {
                    this.f450i.setTextColor(colorStateList);
                }
            }
            if (!m(this.f450i)) {
                b(this.f450i, true);
            }
        } else if (c0Var != null && m(c0Var)) {
            removeView(this.f450i);
            this.S.remove(this.f450i);
        }
        c0 c0Var3 = this.f450i;
        if (c0Var3 != null) {
            c0Var3.setText(charSequence);
        }
        this.M = charSequence;
    }

    public void setSubtitleTextColor(ColorStateList colorStateList) {
        this.O = colorStateList;
        c0 c0Var = this.f450i;
        if (c0Var != null) {
            c0Var.setTextColor(colorStateList);
        }
    }

    public void setTitle(CharSequence charSequence) {
        boolean isEmpty = TextUtils.isEmpty(charSequence);
        c0 c0Var = this.f446e;
        if (!isEmpty) {
            if (c0Var == null) {
                Context context = getContext();
                c0 c0Var2 = new c0(context, null);
                this.f446e = c0Var2;
                c0Var2.setSingleLine();
                this.f446e.setEllipsize(TextUtils.TruncateAt.END);
                int i3 = this.f459z;
                if (i3 != 0) {
                    this.f446e.setTextAppearance(context, i3);
                }
                ColorStateList colorStateList = this.N;
                if (colorStateList != null) {
                    this.f446e.setTextColor(colorStateList);
                }
            }
            if (!m(this.f446e)) {
                b(this.f446e, true);
            }
        } else if (c0Var != null && m(c0Var)) {
            removeView(this.f446e);
            this.S.remove(this.f446e);
        }
        c0 c0Var3 = this.f446e;
        if (c0Var3 != null) {
            c0Var3.setText(charSequence);
        }
        this.L = charSequence;
    }

    public void setTitleMarginBottom(int i3) {
        this.G = i3;
        requestLayout();
    }

    public void setTitleMarginEnd(int i3) {
        this.E = i3;
        requestLayout();
    }

    public void setTitleMarginStart(int i3) {
        this.D = i3;
        requestLayout();
    }

    public void setTitleMarginTop(int i3) {
        this.F = i3;
        requestLayout();
    }

    public void setTitleTextColor(ColorStateList colorStateList) {
        this.N = colorStateList;
        c0 c0Var = this.f446e;
        if (c0Var != null) {
            c0Var.setTextColor(colorStateList);
        }
    }

    public void setSubtitleTextColor(int i3) {
        setSubtitleTextColor(ColorStateList.valueOf(i3));
    }

    public void setTitleTextColor(int i3) {
        setTitleTextColor(ColorStateList.valueOf(i3));
    }

    public void setCollapseContentDescription(int i3) {
        setCollapseContentDescription(i3 != 0 ? getContext().getText(i3) : null);
    }

    public void setCollapseIcon(int i3) {
        setCollapseIcon(w.v(getContext(), i3));
    }

    public void setNavigationContentDescription(int i3) {
        setNavigationContentDescription(i3 != 0 ? getContext().getText(i3) : null);
    }

    @Override // android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return h(layoutParams);
    }

    public void setLogoDescription(int i3) {
        setLogoDescription(getContext().getText(i3));
    }

    public void setOnMenuItemClickListener(z1 z1Var) {
    }

    public void setNavigationIcon(int i3) {
        setNavigationIcon(w.v(getContext(), i3));
    }

    public void setLogo(int i3) {
        setLogo(w.v(getContext(), i3));
    }

    public void setSubtitle(int i3) {
        setSubtitle(getContext().getText(i3));
    }

    public void setTitle(int i3) {
        setTitle(getContext().getText(i3));
    }

    public Toolbar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.toolbarStyle);
    }

    public Toolbar(Context context) {
        this(context, null);
    }
}
