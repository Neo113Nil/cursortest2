package androidx.appcompat.widget;

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
import com.awerser.monnit.betplay.R;
import defpackage.a50;
import defpackage.au;
import defpackage.c5;
import defpackage.ca0;
import defpackage.cu;
import defpackage.e5;
import defpackage.e90;
import defpackage.eu;
import defpackage.i6;
import defpackage.i60;
import defpackage.ie;
import defpackage.j10;
import defpackage.j60;
import defpackage.k1;
import defpackage.k60;
import defpackage.l60;
import defpackage.l70;
import defpackage.m60;
import defpackage.my;
import defpackage.n60;
import defpackage.n7;
import defpackage.o60;
import defpackage.o8;
import defpackage.q60;
import defpackage.r6;
import defpackage.r60;
import defpackage.rk;
import defpackage.w0;
import defpackage.ws;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.WeakHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: r8-map-id-9fea5842fe02e932dfed9a581eb1db18ad6fbe2fdbe2eb471e1a0b06e64b43e7 */
/* loaded from: classes.dex */
public class Toolbar extends ViewGroup implements cu {
    public int A;
    public final int B;
    public CharSequence C;
    public CharSequence D;
    public ColorStateList E;
    public ColorStateList F;
    public boolean G;
    public boolean H;
    public final ArrayList I;
    public final ArrayList J;
    public final int[] K;
    public final r6 L;
    public ArrayList M;
    public final j60 N;
    public q60 O;
    public k1 P;
    public l60 Q;
    public boolean R;
    public OnBackInvokedCallback S;
    public OnBackInvokedDispatcher T;
    public boolean U;
    public final n7 V;
    public ActionMenuView f;
    public i6 g;
    public i6 h;
    public c5 i;
    public e5 j;
    public final Drawable k;
    public final CharSequence l;
    public c5 m;
    public View n;
    public Context o;
    public int p;
    public int q;
    public int r;
    public final int s;
    public final int t;
    public int u;
    public int v;
    public int w;
    public int x;
    public j10 y;
    public int z;

    public Toolbar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, R.attr.toolbarStyle);
        this.B = 8388627;
        this.I = new ArrayList();
        this.J = new ArrayList();
        this.K = new int[2];
        this.L = new r6(new i60(this, 1));
        this.M = new ArrayList();
        this.N = new j60(this);
        this.V = new n7(12, this);
        Context context2 = getContext();
        int[] iArr = my.w;
        r6 u = r6.u(R.attr.toolbarStyle, 0, context2, attributeSet, iArr);
        e90.l(this, context, iArr, attributeSet, (TypedArray) u.b, R.attr.toolbarStyle);
        TypedArray typedArray = (TypedArray) u.b;
        this.q = typedArray.getResourceId(28, 0);
        this.r = typedArray.getResourceId(19, 0);
        this.B = typedArray.getInteger(0, 8388627);
        this.s = typedArray.getInteger(2, 48);
        int dimensionPixelOffset = typedArray.getDimensionPixelOffset(22, 0);
        dimensionPixelOffset = typedArray.hasValue(27) ? typedArray.getDimensionPixelOffset(27, dimensionPixelOffset) : dimensionPixelOffset;
        this.x = dimensionPixelOffset;
        this.w = dimensionPixelOffset;
        this.v = dimensionPixelOffset;
        this.u = dimensionPixelOffset;
        int dimensionPixelOffset2 = typedArray.getDimensionPixelOffset(25, -1);
        if (dimensionPixelOffset2 >= 0) {
            this.u = dimensionPixelOffset2;
        }
        int dimensionPixelOffset3 = typedArray.getDimensionPixelOffset(24, -1);
        if (dimensionPixelOffset3 >= 0) {
            this.v = dimensionPixelOffset3;
        }
        int dimensionPixelOffset4 = typedArray.getDimensionPixelOffset(26, -1);
        if (dimensionPixelOffset4 >= 0) {
            this.w = dimensionPixelOffset4;
        }
        int dimensionPixelOffset5 = typedArray.getDimensionPixelOffset(23, -1);
        if (dimensionPixelOffset5 >= 0) {
            this.x = dimensionPixelOffset5;
        }
        this.t = typedArray.getDimensionPixelSize(13, -1);
        int dimensionPixelOffset6 = typedArray.getDimensionPixelOffset(9, Integer.MIN_VALUE);
        int dimensionPixelOffset7 = typedArray.getDimensionPixelOffset(5, Integer.MIN_VALUE);
        int dimensionPixelSize = typedArray.getDimensionPixelSize(7, 0);
        int dimensionPixelSize2 = typedArray.getDimensionPixelSize(8, 0);
        e();
        j10 j10Var = this.y;
        j10Var.h = false;
        if (dimensionPixelSize != Integer.MIN_VALUE) {
            j10Var.e = dimensionPixelSize;
            j10Var.a = dimensionPixelSize;
        }
        if (dimensionPixelSize2 != Integer.MIN_VALUE) {
            j10Var.f = dimensionPixelSize2;
            j10Var.b = dimensionPixelSize2;
        }
        if (dimensionPixelOffset6 != Integer.MIN_VALUE || dimensionPixelOffset7 != Integer.MIN_VALUE) {
            j10Var.a(dimensionPixelOffset6, dimensionPixelOffset7);
        }
        this.z = typedArray.getDimensionPixelOffset(10, Integer.MIN_VALUE);
        this.A = typedArray.getDimensionPixelOffset(6, Integer.MIN_VALUE);
        this.k = u.k(4);
        this.l = typedArray.getText(3);
        CharSequence text = typedArray.getText(21);
        if (!TextUtils.isEmpty(text)) {
            setTitle(text);
        }
        CharSequence text2 = typedArray.getText(18);
        if (!TextUtils.isEmpty(text2)) {
            setSubtitle(text2);
        }
        this.o = getContext();
        setPopupTheme(typedArray.getResourceId(17, 0));
        Drawable k = u.k(16);
        if (k != null) {
            setNavigationIcon(k);
        }
        CharSequence text3 = typedArray.getText(15);
        if (!TextUtils.isEmpty(text3)) {
            setNavigationContentDescription(text3);
        }
        Drawable k2 = u.k(11);
        if (k2 != null) {
            setLogo(k2);
        }
        CharSequence text4 = typedArray.getText(12);
        if (!TextUtils.isEmpty(text4)) {
            setLogoDescription(text4);
        }
        if (typedArray.hasValue(29)) {
            setTitleTextColor(u.j(29));
        }
        if (typedArray.hasValue(20)) {
            setSubtitleTextColor(u.j(20));
        }
        if (typedArray.hasValue(14)) {
            getMenuInflater().inflate(typedArray.getResourceId(14, 0), getMenu());
        }
        u.w();
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
        return new a50(getContext());
    }

    public static m60 j() {
        m60 m60Var = new m60(-2, -2);
        m60Var.b = 0;
        m60Var.a = 8388627;
        return m60Var;
    }

    public static m60 k(ViewGroup.LayoutParams layoutParams) {
        boolean z = layoutParams instanceof m60;
        if (z) {
            m60 m60Var = (m60) layoutParams;
            m60 m60Var2 = new m60(m60Var);
            m60Var2.b = 0;
            m60Var2.b = m60Var.b;
            return m60Var2;
        }
        if (z) {
            m60 m60Var3 = new m60((m60) layoutParams);
            m60Var3.b = 0;
            return m60Var3;
        }
        if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
            m60 m60Var4 = new m60(layoutParams);
            m60Var4.b = 0;
            return m60Var4;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        m60 m60Var5 = new m60(marginLayoutParams);
        m60Var5.b = 0;
        ((ViewGroup.MarginLayoutParams) m60Var5).leftMargin = marginLayoutParams.leftMargin;
        ((ViewGroup.MarginLayoutParams) m60Var5).topMargin = marginLayoutParams.topMargin;
        ((ViewGroup.MarginLayoutParams) m60Var5).rightMargin = marginLayoutParams.rightMargin;
        ((ViewGroup.MarginLayoutParams) m60Var5).bottomMargin = marginLayoutParams.bottomMargin;
        return m60Var5;
    }

    public static int m(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return marginLayoutParams.getMarginEnd() + marginLayoutParams.getMarginStart();
    }

    public static int n(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
    }

    @Override // defpackage.cu
    public final void a(rk rkVar) {
        r6 r6Var = this.L;
        ((CopyOnWriteArrayList) r6Var.d).remove(rkVar);
        if (((HashMap) r6Var.b).remove(rkVar) == null) {
            ((Runnable) r6Var.c).run();
        } else {
            o8.c();
        }
    }

    public final void b(ArrayList arrayList, int i) {
        boolean z = getLayoutDirection() == 1;
        int childCount = getChildCount();
        int absoluteGravity = Gravity.getAbsoluteGravity(i, getLayoutDirection());
        arrayList.clear();
        if (!z) {
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = getChildAt(i2);
                m60 m60Var = (m60) childAt.getLayoutParams();
                if (m60Var.b == 0 && u(childAt)) {
                    int i3 = m60Var.a;
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
            m60 m60Var2 = (m60) childAt2.getLayoutParams();
            if (m60Var2.b == 0 && u(childAt2)) {
                int i5 = m60Var2.a;
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

    public final void c(View view, boolean z) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        m60 j = layoutParams == null ? j() : !checkLayoutParams(layoutParams) ? k(layoutParams) : (m60) layoutParams;
        j.b = 1;
        if (!z || this.n == null) {
            addView(view, j);
        } else {
            view.setLayoutParams(j);
            this.J.add(view);
        }
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return super.checkLayoutParams(layoutParams) && (layoutParams instanceof m60);
    }

    public final void d() {
        if (this.m == null) {
            c5 c5Var = new c5(getContext(), null, R.attr.toolbarNavigationButtonStyle);
            this.m = c5Var;
            c5Var.setImageDrawable(this.k);
            this.m.setContentDescription(this.l);
            m60 j = j();
            j.a = (this.s & 112) | 8388611;
            j.b = 2;
            this.m.setLayoutParams(j);
            this.m.setOnClickListener(new w0(3, this));
        }
    }

    public final void e() {
        if (this.y == null) {
            j10 j10Var = new j10();
            j10Var.a = 0;
            j10Var.b = 0;
            j10Var.c = Integer.MIN_VALUE;
            j10Var.d = Integer.MIN_VALUE;
            j10Var.e = 0;
            j10Var.f = 0;
            j10Var.g = false;
            j10Var.h = false;
            this.y = j10Var;
        }
    }

    public final void f() {
        h();
        ActionMenuView actionMenuView = this.f;
        if (actionMenuView.u == null) {
            au auVar = (au) actionMenuView.getMenu();
            if (this.Q == null) {
                this.Q = new l60(this);
            }
            this.f.setExpandedActionViewsExclusive(true);
            auVar.b(this.Q, this.o);
            v();
        }
    }

    @Override // defpackage.cu
    public final void g(rk rkVar) {
        r6 r6Var = this.L;
        ((CopyOnWriteArrayList) r6Var.d).add(rkVar);
        ((Runnable) r6Var.c).run();
    }

    @Override // android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return j();
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        Context context = getContext();
        m60 m60Var = new m60(context, attributeSet);
        m60Var.a = 0;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, my.b);
        m60Var.a = obtainStyledAttributes.getInt(0, 0);
        obtainStyledAttributes.recycle();
        m60Var.b = 0;
        return m60Var;
    }

    public CharSequence getCollapseContentDescription() {
        c5 c5Var = this.m;
        if (c5Var != null) {
            return c5Var.getContentDescription();
        }
        return null;
    }

    public Drawable getCollapseIcon() {
        c5 c5Var = this.m;
        if (c5Var != null) {
            return c5Var.getDrawable();
        }
        return null;
    }

    public int getContentInsetEnd() {
        j10 j10Var = this.y;
        if (j10Var != null) {
            return j10Var.g ? j10Var.a : j10Var.b;
        }
        return 0;
    }

    public int getContentInsetEndWithActions() {
        int i = this.A;
        return i != Integer.MIN_VALUE ? i : getContentInsetEnd();
    }

    public int getContentInsetLeft() {
        j10 j10Var = this.y;
        if (j10Var != null) {
            return j10Var.a;
        }
        return 0;
    }

    public int getContentInsetRight() {
        j10 j10Var = this.y;
        if (j10Var != null) {
            return j10Var.b;
        }
        return 0;
    }

    public int getContentInsetStart() {
        j10 j10Var = this.y;
        if (j10Var != null) {
            return j10Var.g ? j10Var.b : j10Var.a;
        }
        return 0;
    }

    public int getContentInsetStartWithNavigation() {
        int i = this.z;
        return i != Integer.MIN_VALUE ? i : getContentInsetStart();
    }

    public int getCurrentContentInsetEnd() {
        au auVar;
        ActionMenuView actionMenuView = this.f;
        return (actionMenuView == null || (auVar = actionMenuView.u) == null || !auVar.hasVisibleItems()) ? getContentInsetEnd() : Math.max(getContentInsetEnd(), Math.max(this.A, 0));
    }

    public int getCurrentContentInsetLeft() {
        return getLayoutDirection() == 1 ? getCurrentContentInsetEnd() : getCurrentContentInsetStart();
    }

    public int getCurrentContentInsetRight() {
        return getLayoutDirection() == 1 ? getCurrentContentInsetStart() : getCurrentContentInsetEnd();
    }

    public int getCurrentContentInsetStart() {
        return getNavigationIcon() != null ? Math.max(getContentInsetStart(), Math.max(this.z, 0)) : getContentInsetStart();
    }

    public Drawable getLogo() {
        e5 e5Var = this.j;
        if (e5Var != null) {
            return e5Var.getDrawable();
        }
        return null;
    }

    public CharSequence getLogoDescription() {
        e5 e5Var = this.j;
        if (e5Var != null) {
            return e5Var.getContentDescription();
        }
        return null;
    }

    public Menu getMenu() {
        f();
        return this.f.getMenu();
    }

    public View getNavButtonView() {
        return this.i;
    }

    public CharSequence getNavigationContentDescription() {
        c5 c5Var = this.i;
        if (c5Var != null) {
            return c5Var.getContentDescription();
        }
        return null;
    }

    public Drawable getNavigationIcon() {
        c5 c5Var = this.i;
        if (c5Var != null) {
            return c5Var.getDrawable();
        }
        return null;
    }

    public k1 getOuterActionMenuPresenter() {
        return this.P;
    }

    public Drawable getOverflowIcon() {
        f();
        return this.f.getOverflowIcon();
    }

    public Context getPopupContext() {
        return this.o;
    }

    public int getPopupTheme() {
        return this.p;
    }

    public CharSequence getSubtitle() {
        return this.D;
    }

    public final TextView getSubtitleTextView() {
        return this.h;
    }

    public CharSequence getTitle() {
        return this.C;
    }

    public int getTitleMarginBottom() {
        return this.x;
    }

    public int getTitleMarginEnd() {
        return this.v;
    }

    public int getTitleMarginStart() {
        return this.u;
    }

    public int getTitleMarginTop() {
        return this.w;
    }

    public final TextView getTitleTextView() {
        return this.g;
    }

    public ie getWrapper() {
        Drawable drawable;
        if (this.O == null) {
            q60 q60Var = new q60();
            q60Var.n = 0;
            q60Var.a = this;
            q60Var.h = getTitle();
            q60Var.i = getSubtitle();
            q60Var.g = q60Var.h != null;
            q60Var.f = getNavigationIcon();
            r6 u = r6.u(R.attr.actionBarStyle, 0, getContext(), null, my.a);
            TypedArray typedArray = (TypedArray) u.b;
            q60Var.o = u.k(15);
            CharSequence text = typedArray.getText(27);
            if (!TextUtils.isEmpty(text)) {
                q60Var.g = true;
                q60Var.h = text;
                if ((q60Var.b & 8) != 0) {
                    setTitle(text);
                    if (q60Var.g) {
                        e90.n(getRootView(), text);
                    }
                }
            }
            CharSequence text2 = typedArray.getText(25);
            if (!TextUtils.isEmpty(text2)) {
                q60Var.i = text2;
                if ((q60Var.b & 8) != 0) {
                    setSubtitle(text2);
                }
            }
            Drawable k = u.k(20);
            if (k != null) {
                q60Var.e = k;
                q60Var.c();
            }
            Drawable k2 = u.k(17);
            if (k2 != null) {
                q60Var.d = k2;
                q60Var.c();
            }
            if (q60Var.f == null && (drawable = q60Var.o) != null) {
                q60Var.f = drawable;
                if ((q60Var.b & 4) != 0) {
                    setNavigationIcon(drawable);
                } else {
                    setNavigationIcon((Drawable) null);
                }
            }
            q60Var.a(typedArray.getInt(10, 0));
            int resourceId = typedArray.getResourceId(9, 0);
            if (resourceId != 0) {
                View inflate = LayoutInflater.from(getContext()).inflate(resourceId, (ViewGroup) this, false);
                View view = q60Var.c;
                if (view != null && (q60Var.b & 16) != 0) {
                    removeView(view);
                }
                q60Var.c = inflate;
                if (inflate != null && (q60Var.b & 16) != 0) {
                    addView(inflate);
                }
                q60Var.a(q60Var.b | 16);
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
                e();
                this.y.a(max, max2);
            }
            int resourceId2 = typedArray.getResourceId(28, 0);
            if (resourceId2 != 0) {
                Context context = getContext();
                this.q = resourceId2;
                i6 i6Var = this.g;
                if (i6Var != null) {
                    i6Var.setTextAppearance(context, resourceId2);
                }
            }
            int resourceId3 = typedArray.getResourceId(26, 0);
            if (resourceId3 != 0) {
                Context context2 = getContext();
                this.r = resourceId3;
                i6 i6Var2 = this.h;
                if (i6Var2 != null) {
                    i6Var2.setTextAppearance(context2, resourceId3);
                }
            }
            int resourceId4 = typedArray.getResourceId(22, 0);
            if (resourceId4 != 0) {
                setPopupTheme(resourceId4);
            }
            u.w();
            if (R.string.abc_action_bar_up_description != q60Var.n) {
                q60Var.n = R.string.abc_action_bar_up_description;
                if (TextUtils.isEmpty(getNavigationContentDescription())) {
                    int i = q60Var.n;
                    q60Var.j = i != 0 ? getContext().getString(i) : null;
                    q60Var.b();
                }
            }
            q60Var.j = getNavigationContentDescription();
            setNavigationOnClickListener(new ws(q60Var));
            this.O = q60Var;
        }
        return this.O;
    }

    public final void h() {
        if (this.f == null) {
            ActionMenuView actionMenuView = new ActionMenuView(getContext(), null);
            this.f = actionMenuView;
            actionMenuView.setPopupTheme(this.p);
            this.f.setOnMenuItemClickListener(this.N);
            ActionMenuView actionMenuView2 = this.f;
            j60 j60Var = new j60(this);
            actionMenuView2.getClass();
            actionMenuView2.z = j60Var;
            m60 j = j();
            j.a = (this.s & 112) | 8388613;
            this.f.setLayoutParams(j);
            c(this.f, false);
        }
    }

    public final void i() {
        if (this.i == null) {
            this.i = new c5(getContext(), null, R.attr.toolbarNavigationButtonStyle);
            m60 j = j();
            j.a = (this.s & 112) | 8388611;
            this.i.setLayoutParams(j);
        }
    }

    public final int l(View view, int i) {
        m60 m60Var = (m60) view.getLayoutParams();
        int measuredHeight = view.getMeasuredHeight();
        int i2 = i > 0 ? (measuredHeight - i) / 2 : 0;
        int i3 = m60Var.a & 112;
        if (i3 != 16 && i3 != 48 && i3 != 80) {
            i3 = this.B & 112;
        }
        if (i3 == 48) {
            return getPaddingTop() - i2;
        }
        if (i3 == 80) {
            return (((getHeight() - getPaddingBottom()) - measuredHeight) - ((ViewGroup.MarginLayoutParams) m60Var).bottomMargin) - i2;
        }
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int height = getHeight();
        int i4 = (((height - paddingTop) - paddingBottom) - measuredHeight) / 2;
        int i5 = ((ViewGroup.MarginLayoutParams) m60Var).topMargin;
        if (i4 < i5) {
            i4 = i5;
        } else {
            int i6 = (((height - paddingBottom) - measuredHeight) - i4) - paddingTop;
            int i7 = ((ViewGroup.MarginLayoutParams) m60Var).bottomMargin;
            if (i6 < i7) {
                i4 = Math.max(0, i4 - (i7 - i6));
            }
        }
        return paddingTop + i4;
    }

    public final void o() {
        ArrayList arrayList = this.M;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            getMenu().removeItem(((MenuItem) obj).getItemId());
        }
        Menu menu = getMenu();
        ArrayList<MenuItem> currentMenuItems = getCurrentMenuItems();
        MenuInflater menuInflater = getMenuInflater();
        Iterator it = ((CopyOnWriteArrayList) this.L.d).iterator();
        while (it.hasNext()) {
            ((rk) it.next()).a.j(menu, menuInflater);
        }
        ArrayList<MenuItem> currentMenuItems2 = getCurrentMenuItems();
        currentMenuItems2.removeAll(currentMenuItems);
        this.M = currentMenuItems2;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        v();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeCallbacks(this.V);
        v();
    }

    @Override // android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.H = false;
        }
        if (!this.H) {
            boolean onHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !onHoverEvent) {
                this.H = true;
            }
        }
        if (actionMasked != 10 && actionMasked != 3) {
            return true;
        }
        this.H = false;
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
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        int max;
        boolean u;
        boolean u2;
        boolean z2;
        int i7;
        int i8;
        int paddingTop;
        int i9;
        int i10;
        int i11;
        int i12;
        int size;
        int i13;
        int i14;
        int size2;
        int i15;
        int size3;
        int i16;
        int i17;
        int i18;
        int size4;
        boolean z3 = getLayoutDirection() == 1;
        int width = getWidth();
        int height = getHeight();
        int paddingLeft = getPaddingLeft();
        int paddingRight = getPaddingRight();
        int paddingTop2 = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int i19 = width - paddingRight;
        int[] iArr = this.K;
        iArr[1] = 0;
        iArr[0] = 0;
        WeakHashMap weakHashMap = e90.a;
        int minimumHeight = getMinimumHeight();
        int min = minimumHeight >= 0 ? Math.min(minimumHeight, i4 - i2) : 0;
        if (u(this.i)) {
            c5 c5Var = this.i;
            if (z3) {
                i6 = r(c5Var, i19, min, iArr);
                i5 = paddingLeft;
                if (u(this.m)) {
                    c5 c5Var2 = this.m;
                    if (z3) {
                        i6 = r(c5Var2, i6, min, iArr);
                    } else {
                        i5 = q(c5Var2, i5, min, iArr);
                    }
                }
                if (u(this.f)) {
                    ActionMenuView actionMenuView = this.f;
                    if (z3) {
                        i5 = q(actionMenuView, i5, min, iArr);
                    } else {
                        i6 = r(actionMenuView, i6, min, iArr);
                    }
                }
                int currentContentInsetLeft = getCurrentContentInsetLeft();
                int currentContentInsetRight = getCurrentContentInsetRight();
                iArr[0] = Math.max(0, currentContentInsetLeft - i5);
                iArr[1] = Math.max(0, currentContentInsetRight - (i19 - i6));
                max = Math.max(i5, currentContentInsetLeft);
                int min2 = Math.min(i6, i19 - currentContentInsetRight);
                if (u(this.n)) {
                    View view = this.n;
                    if (z3) {
                        min2 = r(view, min2, min, iArr);
                    } else {
                        max = q(view, max, min, iArr);
                    }
                }
                if (u(this.j)) {
                    e5 e5Var = this.j;
                    if (z3) {
                        min2 = r(e5Var, min2, min, iArr);
                    } else {
                        max = q(e5Var, max, min, iArr);
                    }
                }
                u = u(this.g);
                u2 = u(this.h);
                if (u) {
                    z2 = z3;
                    i7 = 0;
                } else {
                    m60 m60Var = (m60) this.g.getLayoutParams();
                    z2 = z3;
                    i7 = this.g.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) m60Var).topMargin + ((ViewGroup.MarginLayoutParams) m60Var).bottomMargin;
                }
                if (!u2) {
                    m60 m60Var2 = (m60) this.h.getLayoutParams();
                    i7 = this.h.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) m60Var2).topMargin + ((ViewGroup.MarginLayoutParams) m60Var2).bottomMargin + i7;
                }
                if (!u || u2) {
                    i6 i6Var = !u ? this.g : this.h;
                    i6 i6Var2 = !u2 ? this.h : this.g;
                    m60 m60Var3 = (m60) i6Var.getLayoutParams();
                    m60 m60Var4 = (m60) i6Var2.getLayoutParams();
                    int i20 = i7;
                    boolean z4 = (!u && this.g.getMeasuredWidth() > 0) || (u2 && this.h.getMeasuredWidth() > 0);
                    i8 = this.B & 112;
                    int i21 = max;
                    if (i8 != 48) {
                        paddingTop = getPaddingTop() + ((ViewGroup.MarginLayoutParams) m60Var3).topMargin + this.w;
                    } else if (i8 != 80) {
                        int i22 = (((height - paddingTop2) - paddingBottom) - i20) / 2;
                        int i23 = ((ViewGroup.MarginLayoutParams) m60Var3).topMargin + this.w;
                        if (i22 < i23) {
                            i22 = i23;
                        } else {
                            int i24 = (((height - paddingBottom) - i20) - i22) - paddingTop2;
                            int i25 = ((ViewGroup.MarginLayoutParams) m60Var3).bottomMargin;
                            int i26 = this.x;
                            if (i24 < i25 + i26) {
                                i22 = Math.max(0, i22 - ((((ViewGroup.MarginLayoutParams) m60Var4).bottomMargin + i26) - i24));
                            }
                        }
                        paddingTop = paddingTop2 + i22;
                    } else {
                        paddingTop = (((height - paddingBottom) - ((ViewGroup.MarginLayoutParams) m60Var4).bottomMargin) - this.x) - i20;
                    }
                    if (z2) {
                        int i27 = (z4 ? this.u : 0) - iArr[0];
                        max = Math.max(0, i27) + i21;
                        iArr[0] = Math.max(0, -i27);
                        if (u) {
                            m60 m60Var5 = (m60) this.g.getLayoutParams();
                            int measuredWidth = this.g.getMeasuredWidth() + max;
                            int measuredHeight = this.g.getMeasuredHeight() + paddingTop;
                            this.g.layout(max, paddingTop, measuredWidth, measuredHeight);
                            i9 = measuredWidth + this.v;
                            paddingTop = measuredHeight + ((ViewGroup.MarginLayoutParams) m60Var5).bottomMargin;
                        } else {
                            i9 = max;
                        }
                        if (u2) {
                            int i28 = paddingTop + ((ViewGroup.MarginLayoutParams) ((m60) this.h.getLayoutParams())).topMargin;
                            int measuredWidth2 = this.h.getMeasuredWidth() + max;
                            this.h.layout(max, i28, measuredWidth2, this.h.getMeasuredHeight() + i28);
                            i10 = measuredWidth2 + this.v;
                        } else {
                            i10 = max;
                        }
                        if (z4) {
                            max = Math.max(i9, i10);
                        }
                    } else {
                        int i29 = (z4 ? this.u : 0) - iArr[1];
                        min2 -= Math.max(0, i29);
                        iArr[1] = Math.max(0, -i29);
                        if (u) {
                            m60 m60Var6 = (m60) this.g.getLayoutParams();
                            int measuredWidth3 = min2 - this.g.getMeasuredWidth();
                            int measuredHeight2 = this.g.getMeasuredHeight() + paddingTop;
                            this.g.layout(measuredWidth3, paddingTop, min2, measuredHeight2);
                            i11 = measuredWidth3 - this.v;
                            paddingTop = measuredHeight2 + ((ViewGroup.MarginLayoutParams) m60Var6).bottomMargin;
                        } else {
                            i11 = min2;
                        }
                        if (u2) {
                            int i30 = paddingTop + ((ViewGroup.MarginLayoutParams) ((m60) this.h.getLayoutParams())).topMargin;
                            this.h.layout(min2 - this.h.getMeasuredWidth(), i30, min2, this.h.getMeasuredHeight() + i30);
                            i12 = min2 - this.v;
                        } else {
                            i12 = min2;
                        }
                        if (z4) {
                            min2 = Math.min(i11, i12);
                        }
                        max = i21;
                    }
                }
                ArrayList arrayList = this.I;
                b(arrayList, 3);
                size = arrayList.size();
                i13 = max;
                for (i14 = 0; i14 < size; i14++) {
                    i13 = q((View) arrayList.get(i14), i13, min, iArr);
                }
                b(arrayList, 5);
                size2 = arrayList.size();
                for (i15 = 0; i15 < size2; i15++) {
                    min2 = r((View) arrayList.get(i15), min2, min, iArr);
                }
                b(arrayList, 1);
                int i31 = iArr[0];
                int i32 = iArr[1];
                size3 = arrayList.size();
                int i33 = i31;
                i16 = 0;
                int i34 = 0;
                while (i16 < size3) {
                    View view2 = (View) arrayList.get(i16);
                    m60 m60Var7 = (m60) view2.getLayoutParams();
                    int i35 = i32;
                    int i36 = ((ViewGroup.MarginLayoutParams) m60Var7).leftMargin - i33;
                    int i37 = ((ViewGroup.MarginLayoutParams) m60Var7).rightMargin - i35;
                    int max2 = Math.max(0, i36);
                    int max3 = Math.max(0, i37);
                    int max4 = Math.max(0, -i36);
                    int max5 = Math.max(0, -i37);
                    i34 += view2.getMeasuredWidth() + max2 + max3;
                    i16++;
                    i33 = max4;
                    i32 = max5;
                }
                i18 = ((((width - paddingLeft) - paddingRight) / 2) + paddingLeft) - (i34 / 2);
                int i38 = i34 + i18;
                if (i18 >= i13) {
                    i13 = i38 > min2 ? i18 - (i38 - min2) : i18;
                }
                size4 = arrayList.size();
                for (i17 = 0; i17 < size4; i17++) {
                    i13 = q((View) arrayList.get(i17), i13, min, iArr);
                }
                arrayList.clear();
            }
            i5 = q(c5Var, paddingLeft, min, iArr);
        } else {
            i5 = paddingLeft;
        }
        i6 = i19;
        if (u(this.m)) {
        }
        if (u(this.f)) {
        }
        int currentContentInsetLeft2 = getCurrentContentInsetLeft();
        int currentContentInsetRight2 = getCurrentContentInsetRight();
        iArr[0] = Math.max(0, currentContentInsetLeft2 - i5);
        iArr[1] = Math.max(0, currentContentInsetRight2 - (i19 - i6));
        max = Math.max(i5, currentContentInsetLeft2);
        int min22 = Math.min(i6, i19 - currentContentInsetRight2);
        if (u(this.n)) {
        }
        if (u(this.j)) {
        }
        u = u(this.g);
        u2 = u(this.h);
        if (u) {
        }
        if (!u2) {
        }
        if (!u) {
        }
        if (!u) {
        }
        if (!u2) {
        }
        m60 m60Var32 = (m60) i6Var.getLayoutParams();
        m60 m60Var42 = (m60) i6Var2.getLayoutParams();
        int i202 = i7;
        if (u) {
        }
        i8 = this.B & 112;
        int i212 = max;
        if (i8 != 48) {
        }
        if (z2) {
        }
        ArrayList arrayList2 = this.I;
        b(arrayList2, 3);
        size = arrayList2.size();
        i13 = max;
        while (i14 < size) {
        }
        b(arrayList2, 5);
        size2 = arrayList2.size();
        while (i15 < size2) {
        }
        b(arrayList2, 1);
        int i312 = iArr[0];
        int i322 = iArr[1];
        size3 = arrayList2.size();
        int i332 = i312;
        i16 = 0;
        int i342 = 0;
        while (i16 < size3) {
        }
        i18 = ((((width - paddingLeft) - paddingRight) / 2) + paddingLeft) - (i342 / 2);
        int i382 = i342 + i18;
        if (i18 >= i13) {
        }
        size4 = arrayList2.size();
        while (i17 < size4) {
        }
        arrayList2.clear();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        char c;
        Object[] objArr;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        boolean z = ca0.a;
        int i10 = 0;
        if (getLayoutDirection() == 1) {
            objArr = true;
            c = 0;
        } else {
            c = 1;
            objArr = false;
        }
        if (u(this.i)) {
            t(this.i, i, 0, i2, this.t);
            i3 = m(this.i) + this.i.getMeasuredWidth();
            i4 = Math.max(0, n(this.i) + this.i.getMeasuredHeight());
            i5 = View.combineMeasuredStates(0, this.i.getMeasuredState());
        } else {
            i3 = 0;
            i4 = 0;
            i5 = 0;
        }
        if (u(this.m)) {
            t(this.m, i, 0, i2, this.t);
            i3 = m(this.m) + this.m.getMeasuredWidth();
            i4 = Math.max(i4, n(this.m) + this.m.getMeasuredHeight());
            i5 = View.combineMeasuredStates(i5, this.m.getMeasuredState());
        }
        int currentContentInsetStart = getCurrentContentInsetStart();
        int max = Math.max(currentContentInsetStart, i3);
        int max2 = Math.max(0, currentContentInsetStart - i3);
        Object[] objArr2 = objArr;
        int[] iArr = this.K;
        iArr[objArr2 == true ? 1 : 0] = max2;
        if (u(this.f)) {
            t(this.f, i, max, i2, this.t);
            i6 = m(this.f) + this.f.getMeasuredWidth();
            i4 = Math.max(i4, n(this.f) + this.f.getMeasuredHeight());
            i5 = View.combineMeasuredStates(i5, this.f.getMeasuredState());
        } else {
            i6 = 0;
        }
        int currentContentInsetEnd = getCurrentContentInsetEnd();
        int max3 = max + Math.max(currentContentInsetEnd, i6);
        iArr[c] = Math.max(0, currentContentInsetEnd - i6);
        if (u(this.n)) {
            max3 += s(this.n, i, max3, i2, 0, iArr);
            i4 = Math.max(i4, n(this.n) + this.n.getMeasuredHeight());
            i5 = View.combineMeasuredStates(i5, this.n.getMeasuredState());
        }
        if (u(this.j)) {
            max3 += s(this.j, i, max3, i2, 0, iArr);
            i4 = Math.max(i4, n(this.j) + this.j.getMeasuredHeight());
            i5 = View.combineMeasuredStates(i5, this.j.getMeasuredState());
        }
        int childCount = getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = getChildAt(i11);
            if (((m60) childAt.getLayoutParams()).b == 0 && u(childAt)) {
                max3 += s(childAt, i, max3, i2, 0, iArr);
                int max4 = Math.max(i4, n(childAt) + childAt.getMeasuredHeight());
                i5 = View.combineMeasuredStates(i5, childAt.getMeasuredState());
                i4 = max4;
            } else {
                max3 = max3;
            }
        }
        int i12 = max3;
        int i13 = this.w + this.x;
        int i14 = this.u + this.v;
        if (u(this.g)) {
            s(this.g, i, i12 + i14, i2, i13, iArr);
            int m = m(this.g) + this.g.getMeasuredWidth();
            i7 = n(this.g) + this.g.getMeasuredHeight();
            i8 = View.combineMeasuredStates(i5, this.g.getMeasuredState());
            i9 = m;
        } else {
            i7 = 0;
            i8 = i5;
            i9 = 0;
        }
        if (u(this.h)) {
            i9 = Math.max(i9, s(this.h, i, i12 + i14, i2, i13 + i7, iArr));
            i7 += n(this.h) + this.h.getMeasuredHeight();
            i8 = View.combineMeasuredStates(i8, this.h.getMeasuredState());
        }
        int max5 = Math.max(i4, i7);
        int paddingRight = getPaddingRight() + getPaddingLeft() + i12 + i9;
        int paddingBottom = getPaddingBottom() + getPaddingTop() + max5;
        int resolveSizeAndState = View.resolveSizeAndState(Math.max(paddingRight, getSuggestedMinimumWidth()), i, (-16777216) & i8);
        int resolveSizeAndState2 = View.resolveSizeAndState(Math.max(paddingBottom, getSuggestedMinimumHeight()), i2, i8 << 16);
        if (this.R) {
            int childCount2 = getChildCount();
            for (int i15 = 0; i15 < childCount2; i15++) {
                View childAt2 = getChildAt(i15);
                if (!u(childAt2) || childAt2.getMeasuredWidth() <= 0 || childAt2.getMeasuredHeight() <= 0) {
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
        if (!(parcelable instanceof o60)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        o60 o60Var = (o60) parcelable;
        super.onRestoreInstanceState(o60Var.getSuperState());
        ActionMenuView actionMenuView = this.f;
        au auVar = actionMenuView != null ? actionMenuView.u : null;
        int i = o60Var.f;
        if (i != 0 && this.Q != null && auVar != null && (findItem = auVar.findItem(i)) != null) {
            findItem.expandActionView();
        }
        if (o60Var.g) {
            n7 n7Var = this.V;
            removeCallbacks(n7Var);
            post(n7Var);
        }
    }

    @Override // android.view.View
    public final void onRtlPropertiesChanged(int i) {
        super.onRtlPropertiesChanged(i);
        e();
        j10 j10Var = this.y;
        boolean z = i == 1;
        if (z == j10Var.g) {
            return;
        }
        j10Var.g = z;
        if (!j10Var.h) {
            j10Var.a = j10Var.e;
            j10Var.b = j10Var.f;
            return;
        }
        if (z) {
            int i2 = j10Var.d;
            if (i2 == Integer.MIN_VALUE) {
                i2 = j10Var.e;
            }
            j10Var.a = i2;
            int i3 = j10Var.c;
            if (i3 == Integer.MIN_VALUE) {
                i3 = j10Var.f;
            }
            j10Var.b = i3;
            return;
        }
        int i4 = j10Var.c;
        if (i4 == Integer.MIN_VALUE) {
            i4 = j10Var.e;
        }
        j10Var.a = i4;
        int i5 = j10Var.d;
        if (i5 == Integer.MIN_VALUE) {
            i5 = j10Var.f;
        }
        j10Var.b = i5;
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        k1 k1Var;
        eu euVar;
        o60 o60Var = new o60(super.onSaveInstanceState());
        l60 l60Var = this.Q;
        if (l60Var != null && (euVar = l60Var.g) != null) {
            o60Var.f = euVar.a;
        }
        ActionMenuView actionMenuView = this.f;
        o60Var.g = (actionMenuView == null || (k1Var = actionMenuView.y) == null || !k1Var.h()) ? false : true;
        return o60Var;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.G = false;
        }
        if (!this.G) {
            boolean onTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !onTouchEvent) {
                this.G = true;
            }
        }
        if (actionMasked != 1 && actionMasked != 3) {
            return true;
        }
        this.G = false;
        return true;
    }

    public final boolean p(View view) {
        return view.getParent() == this || this.J.contains(view);
    }

    public final int q(View view, int i, int i2, int[] iArr) {
        m60 m60Var = (m60) view.getLayoutParams();
        int i3 = ((ViewGroup.MarginLayoutParams) m60Var).leftMargin - iArr[0];
        int max = Math.max(0, i3) + i;
        iArr[0] = Math.max(0, -i3);
        int l = l(view, i2);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(max, l, max + measuredWidth, view.getMeasuredHeight() + l);
        return measuredWidth + ((ViewGroup.MarginLayoutParams) m60Var).rightMargin + max;
    }

    public final int r(View view, int i, int i2, int[] iArr) {
        m60 m60Var = (m60) view.getLayoutParams();
        int i3 = ((ViewGroup.MarginLayoutParams) m60Var).rightMargin - iArr[1];
        int max = i - Math.max(0, i3);
        iArr[1] = Math.max(0, -i3);
        int l = l(view, i2);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(max - measuredWidth, l, max, view.getMeasuredHeight() + l);
        return max - (measuredWidth + ((ViewGroup.MarginLayoutParams) m60Var).leftMargin);
    }

    public final int s(View view, int i, int i2, int i3, int i4, int[] iArr) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int i5 = marginLayoutParams.leftMargin - iArr[0];
        int i6 = marginLayoutParams.rightMargin - iArr[1];
        int max = Math.max(0, i6) + Math.max(0, i5);
        iArr[0] = Math.max(0, -i5);
        iArr[1] = Math.max(0, -i6);
        view.measure(ViewGroup.getChildMeasureSpec(i, getPaddingRight() + getPaddingLeft() + max + i2, marginLayoutParams.width), ViewGroup.getChildMeasureSpec(i3, getPaddingBottom() + getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i4, marginLayoutParams.height));
        return view.getMeasuredWidth() + max;
    }

    public void setBackInvokedCallbackEnabled(boolean z) {
        if (this.U != z) {
            this.U = z;
            v();
        }
    }

    public void setCollapseContentDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            d();
        }
        c5 c5Var = this.m;
        if (c5Var != null) {
            c5Var.setContentDescription(charSequence);
        }
    }

    public void setCollapseIcon(Drawable drawable) {
        if (drawable != null) {
            d();
            this.m.setImageDrawable(drawable);
        } else {
            c5 c5Var = this.m;
            if (c5Var != null) {
                c5Var.setImageDrawable(this.k);
            }
        }
    }

    public void setCollapsible(boolean z) {
        this.R = z;
        requestLayout();
    }

    public void setContentInsetEndWithActions(int i) {
        if (i < 0) {
            i = Integer.MIN_VALUE;
        }
        if (i != this.A) {
            this.A = i;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setContentInsetStartWithNavigation(int i) {
        if (i < 0) {
            i = Integer.MIN_VALUE;
        }
        if (i != this.z) {
            this.z = i;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setLogo(Drawable drawable) {
        e5 e5Var = this.j;
        if (drawable != null) {
            if (e5Var == null) {
                this.j = new e5(getContext(), null, 0);
            }
            if (!p(this.j)) {
                c(this.j, true);
            }
        } else if (e5Var != null && p(e5Var)) {
            removeView(this.j);
            this.J.remove(this.j);
        }
        e5 e5Var2 = this.j;
        if (e5Var2 != null) {
            e5Var2.setImageDrawable(drawable);
        }
    }

    public void setLogoDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence) && this.j == null) {
            this.j = new e5(getContext(), null, 0);
        }
        e5 e5Var = this.j;
        if (e5Var != null) {
            e5Var.setContentDescription(charSequence);
        }
    }

    public void setNavigationContentDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            i();
        }
        c5 c5Var = this.i;
        if (c5Var != null) {
            c5Var.setContentDescription(charSequence);
            r60.a(this.i, charSequence);
        }
    }

    public void setNavigationIcon(Drawable drawable) {
        if (drawable != null) {
            i();
            if (!p(this.i)) {
                c(this.i, true);
            }
        } else {
            c5 c5Var = this.i;
            if (c5Var != null && p(c5Var)) {
                removeView(this.i);
                this.J.remove(this.i);
            }
        }
        c5 c5Var2 = this.i;
        if (c5Var2 != null) {
            c5Var2.setImageDrawable(drawable);
        }
    }

    public void setNavigationOnClickListener(View.OnClickListener onClickListener) {
        i();
        this.i.setOnClickListener(onClickListener);
    }

    public void setOverflowIcon(Drawable drawable) {
        f();
        this.f.setOverflowIcon(drawable);
    }

    public void setPopupTheme(int i) {
        if (this.p != i) {
            this.p = i;
            if (i == 0) {
                this.o = getContext();
            } else {
                this.o = new ContextThemeWrapper(getContext(), i);
            }
        }
    }

    public void setSubtitle(CharSequence charSequence) {
        boolean isEmpty = TextUtils.isEmpty(charSequence);
        i6 i6Var = this.h;
        if (!isEmpty) {
            if (i6Var == null) {
                Context context = getContext();
                i6 i6Var2 = new i6(context, null);
                this.h = i6Var2;
                i6Var2.setSingleLine();
                this.h.setEllipsize(TextUtils.TruncateAt.END);
                int i = this.r;
                if (i != 0) {
                    this.h.setTextAppearance(context, i);
                }
                ColorStateList colorStateList = this.F;
                if (colorStateList != null) {
                    this.h.setTextColor(colorStateList);
                }
            }
            if (!p(this.h)) {
                c(this.h, true);
            }
        } else if (i6Var != null && p(i6Var)) {
            removeView(this.h);
            this.J.remove(this.h);
        }
        i6 i6Var3 = this.h;
        if (i6Var3 != null) {
            i6Var3.setText(charSequence);
        }
        this.D = charSequence;
    }

    public void setSubtitleTextColor(ColorStateList colorStateList) {
        this.F = colorStateList;
        i6 i6Var = this.h;
        if (i6Var != null) {
            i6Var.setTextColor(colorStateList);
        }
    }

    public void setTitle(CharSequence charSequence) {
        boolean isEmpty = TextUtils.isEmpty(charSequence);
        i6 i6Var = this.g;
        if (!isEmpty) {
            if (i6Var == null) {
                Context context = getContext();
                i6 i6Var2 = new i6(context, null);
                this.g = i6Var2;
                i6Var2.setSingleLine();
                this.g.setEllipsize(TextUtils.TruncateAt.END);
                int i = this.q;
                if (i != 0) {
                    this.g.setTextAppearance(context, i);
                }
                ColorStateList colorStateList = this.E;
                if (colorStateList != null) {
                    this.g.setTextColor(colorStateList);
                }
            }
            if (!p(this.g)) {
                c(this.g, true);
            }
        } else if (i6Var != null && p(i6Var)) {
            removeView(this.g);
            this.J.remove(this.g);
        }
        i6 i6Var3 = this.g;
        if (i6Var3 != null) {
            i6Var3.setText(charSequence);
        }
        this.C = charSequence;
    }

    public void setTitleMarginBottom(int i) {
        this.x = i;
        requestLayout();
    }

    public void setTitleMarginEnd(int i) {
        this.v = i;
        requestLayout();
    }

    public void setTitleMarginStart(int i) {
        this.u = i;
        requestLayout();
    }

    public void setTitleMarginTop(int i) {
        this.w = i;
        requestLayout();
    }

    public void setTitleTextColor(ColorStateList colorStateList) {
        this.E = colorStateList;
        i6 i6Var = this.g;
        if (i6Var != null) {
            i6Var.setTextColor(colorStateList);
        }
    }

    public final void t(View view, int i, int i2, int i3, int i4) {
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

    public final boolean u(View view) {
        return (view == null || view.getParent() != this || view.getVisibility() == 8) ? false : true;
    }

    public final void v() {
        OnBackInvokedDispatcher onBackInvokedDispatcher;
        if (Build.VERSION.SDK_INT >= 33) {
            OnBackInvokedDispatcher a = k60.a(this);
            l60 l60Var = this.Q;
            int i = 0;
            boolean z = (l60Var == null || l60Var.g == null || a == null || !isAttachedToWindow() || !this.U) ? false : true;
            if (z && this.T == null) {
                if (this.S == null) {
                    this.S = k60.b(new i60(this, i));
                }
                k60.c(a, this.S);
                this.T = a;
                return;
            }
            if (z || (onBackInvokedDispatcher = this.T) == null) {
                return;
            }
            k60.d(onBackInvokedDispatcher, this.S);
            this.T = null;
        }
    }

    public void setSubtitleTextColor(int i) {
        setSubtitleTextColor(ColorStateList.valueOf(i));
    }

    public void setTitleTextColor(int i) {
        setTitleTextColor(ColorStateList.valueOf(i));
    }

    public void setCollapseContentDescription(int i) {
        setCollapseContentDescription(i != 0 ? getContext().getText(i) : null);
    }

    public void setCollapseIcon(int i) {
        setCollapseIcon(l70.p(getContext(), i));
    }

    public void setNavigationContentDescription(int i) {
        setNavigationContentDescription(i != 0 ? getContext().getText(i) : null);
    }

    @Override // android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return k(layoutParams);
    }

    public void setLogoDescription(int i) {
        setLogoDescription(getContext().getText(i));
    }

    public void setNavigationIcon(int i) {
        setNavigationIcon(l70.p(getContext(), i));
    }

    public void setLogo(int i) {
        setLogo(l70.p(getContext(), i));
    }

    public void setOnMenuItemClickListener(n60 n60Var) {
    }

    public void setSubtitle(int i) {
        setSubtitle(getContext().getText(i));
    }

    public void setTitle(int i) {
        setTitle(getContext().getText(i));
    }

    public Toolbar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }
}
