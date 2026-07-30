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
import com.majelw.libystne.R;
import defpackage.al1;
import defpackage.b62;
import defpackage.bh;
import defpackage.by2;
import defpackage.c63;
import defpackage.cy2;
import defpackage.dy2;
import defpackage.e3;
import defpackage.e53;
import defpackage.ey2;
import defpackage.fk1;
import defpackage.fy2;
import defpackage.gy2;
import defpackage.hk1;
import defpackage.hy2;
import defpackage.iy2;
import defpackage.j8;
import defpackage.jc2;
import defpackage.jk1;
import defpackage.ky2;
import defpackage.lk1;
import defpackage.mh;
import defpackage.r7;
import defpackage.s2;
import defpackage.u70;
import defpackage.ur0;
import defpackage.xf;
import defpackage.xq2;
import defpackage.zj2;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public class Toolbar extends ViewGroup implements hk1 {
    public final int A;
    public int B;
    public int C;
    public int D;
    public int E;
    public jc2 F;
    public int G;
    public int H;
    public final int I;
    public CharSequence J;
    public CharSequence K;
    public ColorStateList L;
    public ColorStateList M;
    public boolean N;
    public boolean O;
    public final ArrayList P;
    public final ArrayList Q;
    public final int[] R;
    public final jk1 S;
    public ArrayList T;
    public final cy2 U;
    public ky2 V;
    public e3 W;
    public ey2 a0;
    public boolean b0;
    public OnBackInvokedCallback c0;
    public OnBackInvokedDispatcher d0;
    public boolean e0;
    public final r7 f0;
    public ActionMenuView m;
    public bh n;
    public bh o;
    public xf p;
    public AppCompatImageView q;
    public final Drawable r;
    public final CharSequence s;
    public xf t;
    public View u;
    public Context v;
    public int w;
    public int x;
    public int y;
    public final int z;

    public Toolbar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.toolbarStyle);
        this.I = 8388627;
        this.P = new ArrayList();
        this.Q = new ArrayList();
        this.R = new int[2];
        this.S = new jk1(new by2(this, 1));
        this.T = new ArrayList();
        this.U = new cy2(this);
        this.f0 = new r7(10, this);
        Context context2 = getContext();
        int[] iArr = b62.w;
        mh z = mh.z(context2, attributeSet, iArr, R.attr.toolbarStyle);
        e53.h(this, context, iArr, attributeSet, (TypedArray) z.n, R.attr.toolbarStyle);
        TypedArray typedArray = (TypedArray) z.n;
        this.x = typedArray.getResourceId(28, 0);
        this.y = typedArray.getResourceId(19, 0);
        this.I = typedArray.getInteger(0, 8388627);
        this.z = typedArray.getInteger(2, 48);
        int dimensionPixelOffset = typedArray.getDimensionPixelOffset(22, 0);
        dimensionPixelOffset = typedArray.hasValue(27) ? typedArray.getDimensionPixelOffset(27, dimensionPixelOffset) : dimensionPixelOffset;
        this.E = dimensionPixelOffset;
        this.D = dimensionPixelOffset;
        this.C = dimensionPixelOffset;
        this.B = dimensionPixelOffset;
        int dimensionPixelOffset2 = typedArray.getDimensionPixelOffset(25, -1);
        if (dimensionPixelOffset2 >= 0) {
            this.B = dimensionPixelOffset2;
        }
        int dimensionPixelOffset3 = typedArray.getDimensionPixelOffset(24, -1);
        if (dimensionPixelOffset3 >= 0) {
            this.C = dimensionPixelOffset3;
        }
        int dimensionPixelOffset4 = typedArray.getDimensionPixelOffset(26, -1);
        if (dimensionPixelOffset4 >= 0) {
            this.D = dimensionPixelOffset4;
        }
        int dimensionPixelOffset5 = typedArray.getDimensionPixelOffset(23, -1);
        if (dimensionPixelOffset5 >= 0) {
            this.E = dimensionPixelOffset5;
        }
        this.A = typedArray.getDimensionPixelSize(13, -1);
        int dimensionPixelOffset6 = typedArray.getDimensionPixelOffset(9, Integer.MIN_VALUE);
        int dimensionPixelOffset7 = typedArray.getDimensionPixelOffset(5, Integer.MIN_VALUE);
        int dimensionPixelSize = typedArray.getDimensionPixelSize(7, 0);
        int dimensionPixelSize2 = typedArray.getDimensionPixelSize(8, 0);
        d();
        jc2 jc2Var = this.F;
        jc2Var.h = false;
        if (dimensionPixelSize != Integer.MIN_VALUE) {
            jc2Var.e = dimensionPixelSize;
            jc2Var.a = dimensionPixelSize;
        }
        if (dimensionPixelSize2 != Integer.MIN_VALUE) {
            jc2Var.f = dimensionPixelSize2;
            jc2Var.b = dimensionPixelSize2;
        }
        if (dimensionPixelOffset6 != Integer.MIN_VALUE || dimensionPixelOffset7 != Integer.MIN_VALUE) {
            jc2Var.a(dimensionPixelOffset6, dimensionPixelOffset7);
        }
        this.G = typedArray.getDimensionPixelOffset(10, Integer.MIN_VALUE);
        this.H = typedArray.getDimensionPixelOffset(6, Integer.MIN_VALUE);
        this.r = z.q(4);
        this.s = typedArray.getText(3);
        CharSequence text = typedArray.getText(21);
        if (!TextUtils.isEmpty(text)) {
            setTitle(text);
        }
        CharSequence text2 = typedArray.getText(18);
        if (!TextUtils.isEmpty(text2)) {
            setSubtitle(text2);
        }
        this.v = getContext();
        setPopupTheme(typedArray.getResourceId(17, 0));
        Drawable q = z.q(16);
        if (q != null) {
            setNavigationIcon(q);
        }
        CharSequence text3 = typedArray.getText(15);
        if (!TextUtils.isEmpty(text3)) {
            setNavigationContentDescription(text3);
        }
        Drawable q2 = z.q(11);
        if (q2 != null) {
            setLogo(q2);
        }
        CharSequence text4 = typedArray.getText(12);
        if (!TextUtils.isEmpty(text4)) {
            setLogoDescription(text4);
        }
        if (typedArray.hasValue(29)) {
            setTitleTextColor(z.p(29));
        }
        if (typedArray.hasValue(20)) {
            setSubtitleTextColor(z.p(20));
        }
        if (typedArray.hasValue(14)) {
            getMenuInflater().inflate(typedArray.getResourceId(14, 0), getMenu());
        }
        z.B();
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
        return new xq2(getContext());
    }

    public static fy2 h() {
        fy2 fy2Var = new fy2(-2, -2);
        fy2Var.b = 0;
        fy2Var.a = 8388627;
        return fy2Var;
    }

    public static fy2 i(ViewGroup.LayoutParams layoutParams) {
        boolean z = layoutParams instanceof fy2;
        if (z) {
            fy2 fy2Var = (fy2) layoutParams;
            fy2 fy2Var2 = new fy2(fy2Var);
            fy2Var2.b = 0;
            fy2Var2.b = fy2Var.b;
            return fy2Var2;
        }
        if (z) {
            fy2 fy2Var3 = new fy2((fy2) layoutParams);
            fy2Var3.b = 0;
            return fy2Var3;
        }
        if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
            fy2 fy2Var4 = new fy2(layoutParams);
            fy2Var4.b = 0;
            return fy2Var4;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        fy2 fy2Var5 = new fy2(marginLayoutParams);
        fy2Var5.b = 0;
        ((ViewGroup.MarginLayoutParams) fy2Var5).leftMargin = marginLayoutParams.leftMargin;
        ((ViewGroup.MarginLayoutParams) fy2Var5).topMargin = marginLayoutParams.topMargin;
        ((ViewGroup.MarginLayoutParams) fy2Var5).rightMargin = marginLayoutParams.rightMargin;
        ((ViewGroup.MarginLayoutParams) fy2Var5).bottomMargin = marginLayoutParams.bottomMargin;
        return fy2Var5;
    }

    public static int k(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return marginLayoutParams.getMarginEnd() + marginLayoutParams.getMarginStart();
    }

    public static int l(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
    }

    public final void a(int i, ArrayList arrayList) {
        boolean z = getLayoutDirection() == 1;
        int childCount = getChildCount();
        int absoluteGravity = Gravity.getAbsoluteGravity(i, getLayoutDirection());
        arrayList.clear();
        if (!z) {
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = getChildAt(i2);
                fy2 fy2Var = (fy2) childAt.getLayoutParams();
                if (fy2Var.b == 0 && s(childAt)) {
                    int i3 = fy2Var.a;
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
            fy2 fy2Var2 = (fy2) childAt2.getLayoutParams();
            if (fy2Var2.b == 0 && s(childAt2)) {
                int i5 = fy2Var2.a;
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

    @Override // defpackage.hk1
    public final void addMenuProvider(al1 al1Var) {
        jk1 jk1Var = this.S;
        jk1Var.b.add(al1Var);
        jk1Var.a.run();
    }

    public final void b(View view, boolean z) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        fy2 h = layoutParams == null ? h() : !checkLayoutParams(layoutParams) ? i(layoutParams) : (fy2) layoutParams;
        h.b = 1;
        if (!z || this.u == null) {
            addView(view, h);
        } else {
            view.setLayoutParams(h);
            this.Q.add(view);
        }
    }

    public final void c() {
        if (this.t == null) {
            xf xfVar = new xf(getContext(), null, R.attr.toolbarNavigationButtonStyle);
            this.t = xfVar;
            xfVar.setImageDrawable(this.r);
            this.t.setContentDescription(this.s);
            fy2 h = h();
            h.a = (this.z & 112) | 8388611;
            h.b = 2;
            this.t.setLayoutParams(h);
            this.t.setOnClickListener(new s2(2, this));
        }
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return super.checkLayoutParams(layoutParams) && (layoutParams instanceof fy2);
    }

    public final void d() {
        if (this.F == null) {
            jc2 jc2Var = new jc2();
            jc2Var.a = 0;
            jc2Var.b = 0;
            jc2Var.c = Integer.MIN_VALUE;
            jc2Var.d = Integer.MIN_VALUE;
            jc2Var.e = 0;
            jc2Var.f = 0;
            jc2Var.g = false;
            jc2Var.h = false;
            this.F = jc2Var;
        }
    }

    public final void e() {
        f();
        ActionMenuView actionMenuView = this.m;
        if (actionMenuView.B == null) {
            fk1 fk1Var = (fk1) actionMenuView.getMenu();
            if (this.a0 == null) {
                this.a0 = new ey2(this);
            }
            this.m.setExpandedActionViewsExclusive(true);
            fk1Var.b(this.a0, this.v);
            t();
        }
    }

    public final void f() {
        if (this.m == null) {
            ActionMenuView actionMenuView = new ActionMenuView(getContext(), null);
            this.m = actionMenuView;
            actionMenuView.setPopupTheme(this.w);
            this.m.setOnMenuItemClickListener(this.U);
            ActionMenuView actionMenuView2 = this.m;
            cy2 cy2Var = new cy2(this);
            actionMenuView2.getClass();
            actionMenuView2.G = cy2Var;
            fy2 h = h();
            h.a = (this.z & 112) | 8388613;
            this.m.setLayoutParams(h);
            b(this.m, false);
        }
    }

    public final void g() {
        if (this.p == null) {
            this.p = new xf(getContext(), null, R.attr.toolbarNavigationButtonStyle);
            fy2 h = h();
            h.a = (this.z & 112) | 8388611;
            this.p.setLayoutParams(h);
        }
    }

    @Override // android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return h();
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        Context context = getContext();
        fy2 fy2Var = new fy2(context, attributeSet);
        fy2Var.a = 0;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, b62.b);
        fy2Var.a = obtainStyledAttributes.getInt(0, 0);
        obtainStyledAttributes.recycle();
        fy2Var.b = 0;
        return fy2Var;
    }

    public CharSequence getCollapseContentDescription() {
        xf xfVar = this.t;
        if (xfVar != null) {
            return xfVar.getContentDescription();
        }
        return null;
    }

    public Drawable getCollapseIcon() {
        xf xfVar = this.t;
        if (xfVar != null) {
            return xfVar.getDrawable();
        }
        return null;
    }

    public int getContentInsetEnd() {
        jc2 jc2Var = this.F;
        if (jc2Var != null) {
            return jc2Var.g ? jc2Var.a : jc2Var.b;
        }
        return 0;
    }

    public int getContentInsetEndWithActions() {
        int i = this.H;
        return i != Integer.MIN_VALUE ? i : getContentInsetEnd();
    }

    public int getContentInsetLeft() {
        jc2 jc2Var = this.F;
        if (jc2Var != null) {
            return jc2Var.a;
        }
        return 0;
    }

    public int getContentInsetRight() {
        jc2 jc2Var = this.F;
        if (jc2Var != null) {
            return jc2Var.b;
        }
        return 0;
    }

    public int getContentInsetStart() {
        jc2 jc2Var = this.F;
        if (jc2Var != null) {
            return jc2Var.g ? jc2Var.b : jc2Var.a;
        }
        return 0;
    }

    public int getContentInsetStartWithNavigation() {
        int i = this.G;
        return i != Integer.MIN_VALUE ? i : getContentInsetStart();
    }

    public int getCurrentContentInsetEnd() {
        fk1 fk1Var;
        ActionMenuView actionMenuView = this.m;
        return (actionMenuView == null || (fk1Var = actionMenuView.B) == null || !fk1Var.hasVisibleItems()) ? getContentInsetEnd() : Math.max(getContentInsetEnd(), Math.max(this.H, 0));
    }

    public int getCurrentContentInsetLeft() {
        return getLayoutDirection() == 1 ? getCurrentContentInsetEnd() : getCurrentContentInsetStart();
    }

    public int getCurrentContentInsetRight() {
        return getLayoutDirection() == 1 ? getCurrentContentInsetStart() : getCurrentContentInsetEnd();
    }

    public int getCurrentContentInsetStart() {
        return getNavigationIcon() != null ? Math.max(getContentInsetStart(), Math.max(this.G, 0)) : getContentInsetStart();
    }

    public Drawable getLogo() {
        AppCompatImageView appCompatImageView = this.q;
        if (appCompatImageView != null) {
            return appCompatImageView.getDrawable();
        }
        return null;
    }

    public CharSequence getLogoDescription() {
        AppCompatImageView appCompatImageView = this.q;
        if (appCompatImageView != null) {
            return appCompatImageView.getContentDescription();
        }
        return null;
    }

    public Menu getMenu() {
        e();
        return this.m.getMenu();
    }

    public View getNavButtonView() {
        return this.p;
    }

    public CharSequence getNavigationContentDescription() {
        xf xfVar = this.p;
        if (xfVar != null) {
            return xfVar.getContentDescription();
        }
        return null;
    }

    public Drawable getNavigationIcon() {
        xf xfVar = this.p;
        if (xfVar != null) {
            return xfVar.getDrawable();
        }
        return null;
    }

    public e3 getOuterActionMenuPresenter() {
        return this.W;
    }

    public Drawable getOverflowIcon() {
        e();
        return this.m.getOverflowIcon();
    }

    public Context getPopupContext() {
        return this.v;
    }

    public int getPopupTheme() {
        return this.w;
    }

    public CharSequence getSubtitle() {
        return this.K;
    }

    public final TextView getSubtitleTextView() {
        return this.o;
    }

    public CharSequence getTitle() {
        return this.J;
    }

    public int getTitleMarginBottom() {
        return this.E;
    }

    public int getTitleMarginEnd() {
        return this.C;
    }

    public int getTitleMarginStart() {
        return this.B;
    }

    public int getTitleMarginTop() {
        return this.D;
    }

    public final TextView getTitleTextView() {
        return this.n;
    }

    public u70 getWrapper() {
        Drawable drawable;
        if (this.V == null) {
            ky2 ky2Var = new ky2();
            ky2Var.n = 0;
            ky2Var.a = this;
            ky2Var.h = getTitle();
            ky2Var.i = getSubtitle();
            ky2Var.g = ky2Var.h != null;
            ky2Var.f = getNavigationIcon();
            mh z = mh.z(getContext(), null, b62.a, R.attr.actionBarStyle);
            TypedArray typedArray = (TypedArray) z.n;
            ky2Var.o = z.q(15);
            CharSequence text = typedArray.getText(27);
            if (!TextUtils.isEmpty(text)) {
                ky2Var.g = true;
                ky2Var.h = text;
                if ((ky2Var.b & 8) != 0) {
                    setTitle(text);
                    if (ky2Var.g) {
                        e53.j(getRootView(), text);
                    }
                }
            }
            CharSequence text2 = typedArray.getText(25);
            if (!TextUtils.isEmpty(text2)) {
                ky2Var.i = text2;
                if ((ky2Var.b & 8) != 0) {
                    setSubtitle(text2);
                }
            }
            Drawable q = z.q(20);
            if (q != null) {
                ky2Var.e = q;
                ky2Var.c();
            }
            Drawable q2 = z.q(17);
            if (q2 != null) {
                ky2Var.d = q2;
                ky2Var.c();
            }
            if (ky2Var.f == null && (drawable = ky2Var.o) != null) {
                ky2Var.f = drawable;
                if ((ky2Var.b & 4) != 0) {
                    setNavigationIcon(drawable);
                } else {
                    setNavigationIcon((Drawable) null);
                }
            }
            ky2Var.a(typedArray.getInt(10, 0));
            int resourceId = typedArray.getResourceId(9, 0);
            if (resourceId != 0) {
                View inflate = LayoutInflater.from(getContext()).inflate(resourceId, (ViewGroup) this, false);
                View view = ky2Var.c;
                if (view != null && (ky2Var.b & 16) != 0) {
                    removeView(view);
                }
                ky2Var.c = inflate;
                if (inflate != null && (ky2Var.b & 16) != 0) {
                    addView(inflate);
                }
                ky2Var.a(ky2Var.b | 16);
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
                this.F.a(max, max2);
            }
            int resourceId2 = typedArray.getResourceId(28, 0);
            if (resourceId2 != 0) {
                Context context = getContext();
                this.x = resourceId2;
                bh bhVar = this.n;
                if (bhVar != null) {
                    bhVar.setTextAppearance(context, resourceId2);
                }
            }
            int resourceId3 = typedArray.getResourceId(26, 0);
            if (resourceId3 != 0) {
                Context context2 = getContext();
                this.y = resourceId3;
                bh bhVar2 = this.o;
                if (bhVar2 != null) {
                    bhVar2.setTextAppearance(context2, resourceId3);
                }
            }
            int resourceId4 = typedArray.getResourceId(22, 0);
            if (resourceId4 != 0) {
                setPopupTheme(resourceId4);
            }
            z.B();
            if (R.string.abc_action_bar_up_description != ky2Var.n) {
                ky2Var.n = R.string.abc_action_bar_up_description;
                if (TextUtils.isEmpty(getNavigationContentDescription())) {
                    int i = ky2Var.n;
                    ky2Var.j = i != 0 ? getContext().getString(i) : null;
                    ky2Var.b();
                }
            }
            ky2Var.j = getNavigationContentDescription();
            setNavigationOnClickListener(new iy2(ky2Var));
            this.V = ky2Var;
        }
        return this.V;
    }

    public final int j(View view, int i) {
        fy2 fy2Var = (fy2) view.getLayoutParams();
        int measuredHeight = view.getMeasuredHeight();
        int i2 = i > 0 ? (measuredHeight - i) / 2 : 0;
        int i3 = fy2Var.a & 112;
        if (i3 != 16 && i3 != 48 && i3 != 80) {
            i3 = this.I & 112;
        }
        if (i3 == 48) {
            return getPaddingTop() - i2;
        }
        if (i3 == 80) {
            return (((getHeight() - getPaddingBottom()) - measuredHeight) - ((ViewGroup.MarginLayoutParams) fy2Var).bottomMargin) - i2;
        }
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int height = getHeight();
        int i4 = (((height - paddingTop) - paddingBottom) - measuredHeight) / 2;
        int i5 = ((ViewGroup.MarginLayoutParams) fy2Var).topMargin;
        if (i4 < i5) {
            i4 = i5;
        } else {
            int i6 = (((height - paddingBottom) - measuredHeight) - i4) - paddingTop;
            int i7 = ((ViewGroup.MarginLayoutParams) fy2Var).bottomMargin;
            if (i6 < i7) {
                i4 = Math.max(0, i4 - (i7 - i6));
            }
        }
        return paddingTop + i4;
    }

    public final void m() {
        ArrayList arrayList = this.T;
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
        Iterator it = this.S.b.iterator();
        while (it.hasNext()) {
            ((ur0) ((al1) it.next())).a.j(menu, menuInflater);
        }
        ArrayList<MenuItem> currentMenuItems2 = getCurrentMenuItems();
        currentMenuItems2.removeAll(currentMenuItems);
        this.T = currentMenuItems2;
    }

    public final boolean n(View view) {
        return view.getParent() == this || this.Q.contains(view);
    }

    public final int o(View view, int i, int i2, int[] iArr) {
        fy2 fy2Var = (fy2) view.getLayoutParams();
        int i3 = ((ViewGroup.MarginLayoutParams) fy2Var).leftMargin - iArr[0];
        int max = Math.max(0, i3) + i;
        iArr[0] = Math.max(0, -i3);
        int j = j(view, i2);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(max, j, max + measuredWidth, view.getMeasuredHeight() + j);
        return measuredWidth + ((ViewGroup.MarginLayoutParams) fy2Var).rightMargin + max;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        t();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeCallbacks(this.f0);
        t();
    }

    @Override // android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.O = false;
        }
        if (!this.O) {
            boolean onHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !onHoverEvent) {
                this.O = true;
            }
        }
        if (actionMasked != 10 && actionMasked != 3) {
            return true;
        }
        this.O = false;
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
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        int max;
        boolean s;
        boolean s2;
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
        int[] iArr = this.R;
        iArr[1] = 0;
        iArr[0] = 0;
        WeakHashMap weakHashMap = e53.a;
        int minimumHeight = getMinimumHeight();
        int min = minimumHeight >= 0 ? Math.min(minimumHeight, i4 - i2) : 0;
        if (s(this.p)) {
            xf xfVar = this.p;
            if (z3) {
                i6 = p(xfVar, i19, min, iArr);
                i5 = paddingLeft;
                if (s(this.t)) {
                    xf xfVar2 = this.t;
                    if (z3) {
                        i6 = p(xfVar2, i6, min, iArr);
                    } else {
                        i5 = o(xfVar2, i5, min, iArr);
                    }
                }
                if (s(this.m)) {
                    ActionMenuView actionMenuView = this.m;
                    if (z3) {
                        i5 = o(actionMenuView, i5, min, iArr);
                    } else {
                        i6 = p(actionMenuView, i6, min, iArr);
                    }
                }
                int currentContentInsetLeft = getCurrentContentInsetLeft();
                int currentContentInsetRight = getCurrentContentInsetRight();
                iArr[0] = Math.max(0, currentContentInsetLeft - i5);
                iArr[1] = Math.max(0, currentContentInsetRight - (i19 - i6));
                max = Math.max(i5, currentContentInsetLeft);
                int min2 = Math.min(i6, i19 - currentContentInsetRight);
                if (s(this.u)) {
                    View view = this.u;
                    if (z3) {
                        min2 = p(view, min2, min, iArr);
                    } else {
                        max = o(view, max, min, iArr);
                    }
                }
                if (s(this.q)) {
                    AppCompatImageView appCompatImageView = this.q;
                    if (z3) {
                        min2 = p(appCompatImageView, min2, min, iArr);
                    } else {
                        max = o(appCompatImageView, max, min, iArr);
                    }
                }
                s = s(this.n);
                s2 = s(this.o);
                if (s) {
                    z2 = z3;
                    i7 = 0;
                } else {
                    fy2 fy2Var = (fy2) this.n.getLayoutParams();
                    z2 = z3;
                    i7 = this.n.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) fy2Var).topMargin + ((ViewGroup.MarginLayoutParams) fy2Var).bottomMargin;
                }
                if (!s2) {
                    fy2 fy2Var2 = (fy2) this.o.getLayoutParams();
                    i7 = this.o.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) fy2Var2).topMargin + ((ViewGroup.MarginLayoutParams) fy2Var2).bottomMargin + i7;
                }
                if (!s || s2) {
                    bh bhVar = !s ? this.n : this.o;
                    bh bhVar2 = !s2 ? this.o : this.n;
                    fy2 fy2Var3 = (fy2) bhVar.getLayoutParams();
                    fy2 fy2Var4 = (fy2) bhVar2.getLayoutParams();
                    int i20 = i7;
                    boolean z4 = (!s && this.n.getMeasuredWidth() > 0) || (s2 && this.o.getMeasuredWidth() > 0);
                    i8 = this.I & 112;
                    int i21 = max;
                    if (i8 != 48) {
                        paddingTop = getPaddingTop() + ((ViewGroup.MarginLayoutParams) fy2Var3).topMargin + this.D;
                    } else if (i8 != 80) {
                        int i22 = (((height - paddingTop2) - paddingBottom) - i20) / 2;
                        int i23 = ((ViewGroup.MarginLayoutParams) fy2Var3).topMargin + this.D;
                        if (i22 < i23) {
                            i22 = i23;
                        } else {
                            int i24 = (((height - paddingBottom) - i20) - i22) - paddingTop2;
                            int i25 = ((ViewGroup.MarginLayoutParams) fy2Var3).bottomMargin;
                            int i26 = this.E;
                            if (i24 < i25 + i26) {
                                i22 = Math.max(0, i22 - ((((ViewGroup.MarginLayoutParams) fy2Var4).bottomMargin + i26) - i24));
                            }
                        }
                        paddingTop = paddingTop2 + i22;
                    } else {
                        paddingTop = (((height - paddingBottom) - ((ViewGroup.MarginLayoutParams) fy2Var4).bottomMargin) - this.E) - i20;
                    }
                    if (z2) {
                        int i27 = (z4 ? this.B : 0) - iArr[0];
                        max = Math.max(0, i27) + i21;
                        iArr[0] = Math.max(0, -i27);
                        if (s) {
                            fy2 fy2Var5 = (fy2) this.n.getLayoutParams();
                            int measuredWidth = this.n.getMeasuredWidth() + max;
                            int measuredHeight = this.n.getMeasuredHeight() + paddingTop;
                            this.n.layout(max, paddingTop, measuredWidth, measuredHeight);
                            i9 = measuredWidth + this.C;
                            paddingTop = measuredHeight + ((ViewGroup.MarginLayoutParams) fy2Var5).bottomMargin;
                        } else {
                            i9 = max;
                        }
                        if (s2) {
                            int i28 = paddingTop + ((ViewGroup.MarginLayoutParams) ((fy2) this.o.getLayoutParams())).topMargin;
                            int measuredWidth2 = this.o.getMeasuredWidth() + max;
                            this.o.layout(max, i28, measuredWidth2, this.o.getMeasuredHeight() + i28);
                            i10 = measuredWidth2 + this.C;
                        } else {
                            i10 = max;
                        }
                        if (z4) {
                            max = Math.max(i9, i10);
                        }
                    } else {
                        int i29 = (z4 ? this.B : 0) - iArr[1];
                        min2 -= Math.max(0, i29);
                        iArr[1] = Math.max(0, -i29);
                        if (s) {
                            fy2 fy2Var6 = (fy2) this.n.getLayoutParams();
                            int measuredWidth3 = min2 - this.n.getMeasuredWidth();
                            int measuredHeight2 = this.n.getMeasuredHeight() + paddingTop;
                            this.n.layout(measuredWidth3, paddingTop, min2, measuredHeight2);
                            i11 = measuredWidth3 - this.C;
                            paddingTop = measuredHeight2 + ((ViewGroup.MarginLayoutParams) fy2Var6).bottomMargin;
                        } else {
                            i11 = min2;
                        }
                        if (s2) {
                            int i30 = paddingTop + ((ViewGroup.MarginLayoutParams) ((fy2) this.o.getLayoutParams())).topMargin;
                            this.o.layout(min2 - this.o.getMeasuredWidth(), i30, min2, this.o.getMeasuredHeight() + i30);
                            i12 = min2 - this.C;
                        } else {
                            i12 = min2;
                        }
                        if (z4) {
                            min2 = Math.min(i11, i12);
                        }
                        max = i21;
                    }
                }
                ArrayList arrayList = this.P;
                a(3, arrayList);
                size = arrayList.size();
                i13 = max;
                for (i14 = 0; i14 < size; i14++) {
                    i13 = o((View) arrayList.get(i14), i13, min, iArr);
                }
                a(5, arrayList);
                size2 = arrayList.size();
                for (i15 = 0; i15 < size2; i15++) {
                    min2 = p((View) arrayList.get(i15), min2, min, iArr);
                }
                a(1, arrayList);
                int i31 = iArr[0];
                int i32 = iArr[1];
                size3 = arrayList.size();
                int i33 = i31;
                i16 = 0;
                int i34 = 0;
                while (i16 < size3) {
                    View view2 = (View) arrayList.get(i16);
                    fy2 fy2Var7 = (fy2) view2.getLayoutParams();
                    int i35 = i32;
                    int i36 = ((ViewGroup.MarginLayoutParams) fy2Var7).leftMargin - i33;
                    int i37 = ((ViewGroup.MarginLayoutParams) fy2Var7).rightMargin - i35;
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
                    i13 = o((View) arrayList.get(i17), i13, min, iArr);
                }
                arrayList.clear();
            }
            i5 = o(xfVar, paddingLeft, min, iArr);
        } else {
            i5 = paddingLeft;
        }
        i6 = i19;
        if (s(this.t)) {
        }
        if (s(this.m)) {
        }
        int currentContentInsetLeft2 = getCurrentContentInsetLeft();
        int currentContentInsetRight2 = getCurrentContentInsetRight();
        iArr[0] = Math.max(0, currentContentInsetLeft2 - i5);
        iArr[1] = Math.max(0, currentContentInsetRight2 - (i19 - i6));
        max = Math.max(i5, currentContentInsetLeft2);
        int min22 = Math.min(i6, i19 - currentContentInsetRight2);
        if (s(this.u)) {
        }
        if (s(this.q)) {
        }
        s = s(this.n);
        s2 = s(this.o);
        if (s) {
        }
        if (!s2) {
        }
        if (!s) {
        }
        if (!s) {
        }
        if (!s2) {
        }
        fy2 fy2Var32 = (fy2) bhVar.getLayoutParams();
        fy2 fy2Var42 = (fy2) bhVar2.getLayoutParams();
        int i202 = i7;
        if (s) {
        }
        i8 = this.I & 112;
        int i212 = max;
        if (i8 != 48) {
        }
        if (z2) {
        }
        ArrayList arrayList2 = this.P;
        a(3, arrayList2);
        size = arrayList2.size();
        i13 = max;
        while (i14 < size) {
        }
        a(5, arrayList2);
        size2 = arrayList2.size();
        while (i15 < size2) {
        }
        a(1, arrayList2);
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
        boolean z = c63.a;
        int i10 = 0;
        if (getLayoutDirection() == 1) {
            objArr = true;
            c = 0;
        } else {
            c = 1;
            objArr = false;
        }
        if (s(this.p)) {
            r(this.p, i, 0, i2, this.A);
            i3 = k(this.p) + this.p.getMeasuredWidth();
            i4 = Math.max(0, l(this.p) + this.p.getMeasuredHeight());
            i5 = View.combineMeasuredStates(0, this.p.getMeasuredState());
        } else {
            i3 = 0;
            i4 = 0;
            i5 = 0;
        }
        if (s(this.t)) {
            r(this.t, i, 0, i2, this.A);
            i3 = k(this.t) + this.t.getMeasuredWidth();
            i4 = Math.max(i4, l(this.t) + this.t.getMeasuredHeight());
            i5 = View.combineMeasuredStates(i5, this.t.getMeasuredState());
        }
        int currentContentInsetStart = getCurrentContentInsetStart();
        int max = Math.max(currentContentInsetStart, i3);
        int max2 = Math.max(0, currentContentInsetStart - i3);
        Object[] objArr2 = objArr;
        int[] iArr = this.R;
        iArr[objArr2 == true ? 1 : 0] = max2;
        if (s(this.m)) {
            r(this.m, i, max, i2, this.A);
            i6 = k(this.m) + this.m.getMeasuredWidth();
            i4 = Math.max(i4, l(this.m) + this.m.getMeasuredHeight());
            i5 = View.combineMeasuredStates(i5, this.m.getMeasuredState());
        } else {
            i6 = 0;
        }
        int currentContentInsetEnd = getCurrentContentInsetEnd();
        int max3 = max + Math.max(currentContentInsetEnd, i6);
        iArr[c] = Math.max(0, currentContentInsetEnd - i6);
        if (s(this.u)) {
            max3 += q(this.u, i, max3, i2, 0, iArr);
            i4 = Math.max(i4, l(this.u) + this.u.getMeasuredHeight());
            i5 = View.combineMeasuredStates(i5, this.u.getMeasuredState());
        }
        if (s(this.q)) {
            max3 += q(this.q, i, max3, i2, 0, iArr);
            i4 = Math.max(i4, l(this.q) + this.q.getMeasuredHeight());
            i5 = View.combineMeasuredStates(i5, this.q.getMeasuredState());
        }
        int childCount = getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = getChildAt(i11);
            if (((fy2) childAt.getLayoutParams()).b == 0 && s(childAt)) {
                max3 += q(childAt, i, max3, i2, 0, iArr);
                int max4 = Math.max(i4, l(childAt) + childAt.getMeasuredHeight());
                i5 = View.combineMeasuredStates(i5, childAt.getMeasuredState());
                i4 = max4;
            } else {
                max3 = max3;
            }
        }
        int i12 = max3;
        int i13 = this.D + this.E;
        int i14 = this.B + this.C;
        if (s(this.n)) {
            q(this.n, i, i12 + i14, i2, i13, iArr);
            int k = k(this.n) + this.n.getMeasuredWidth();
            i7 = l(this.n) + this.n.getMeasuredHeight();
            i8 = View.combineMeasuredStates(i5, this.n.getMeasuredState());
            i9 = k;
        } else {
            i7 = 0;
            i8 = i5;
            i9 = 0;
        }
        if (s(this.o)) {
            i9 = Math.max(i9, q(this.o, i, i12 + i14, i2, i13 + i7, iArr));
            i7 += l(this.o) + this.o.getMeasuredHeight();
            i8 = View.combineMeasuredStates(i8, this.o.getMeasuredState());
        }
        int max5 = Math.max(i4, i7);
        int paddingRight = getPaddingRight() + getPaddingLeft() + i12 + i9;
        int paddingBottom = getPaddingBottom() + getPaddingTop() + max5;
        int resolveSizeAndState = View.resolveSizeAndState(Math.max(paddingRight, getSuggestedMinimumWidth()), i, (-16777216) & i8);
        int resolveSizeAndState2 = View.resolveSizeAndState(Math.max(paddingBottom, getSuggestedMinimumHeight()), i2, i8 << 16);
        if (this.b0) {
            int childCount2 = getChildCount();
            for (int i15 = 0; i15 < childCount2; i15++) {
                View childAt2 = getChildAt(i15);
                if (!s(childAt2) || childAt2.getMeasuredWidth() <= 0 || childAt2.getMeasuredHeight() <= 0) {
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
        if (!(parcelable instanceof hy2)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        hy2 hy2Var = (hy2) parcelable;
        super.onRestoreInstanceState(hy2Var.m);
        ActionMenuView actionMenuView = this.m;
        fk1 fk1Var = actionMenuView != null ? actionMenuView.B : null;
        int i = hy2Var.o;
        if (i != 0 && this.a0 != null && fk1Var != null && (findItem = fk1Var.findItem(i)) != null) {
            findItem.expandActionView();
        }
        if (hy2Var.p) {
            r7 r7Var = this.f0;
            removeCallbacks(r7Var);
            post(r7Var);
        }
    }

    @Override // android.view.View
    public final void onRtlPropertiesChanged(int i) {
        super.onRtlPropertiesChanged(i);
        d();
        jc2 jc2Var = this.F;
        boolean z = i == 1;
        if (z == jc2Var.g) {
            return;
        }
        jc2Var.g = z;
        if (!jc2Var.h) {
            jc2Var.a = jc2Var.e;
            jc2Var.b = jc2Var.f;
            return;
        }
        if (z) {
            int i2 = jc2Var.d;
            if (i2 == Integer.MIN_VALUE) {
                i2 = jc2Var.e;
            }
            jc2Var.a = i2;
            int i3 = jc2Var.c;
            if (i3 == Integer.MIN_VALUE) {
                i3 = jc2Var.f;
            }
            jc2Var.b = i3;
            return;
        }
        int i4 = jc2Var.c;
        if (i4 == Integer.MIN_VALUE) {
            i4 = jc2Var.e;
        }
        jc2Var.a = i4;
        int i5 = jc2Var.d;
        if (i5 == Integer.MIN_VALUE) {
            i5 = jc2Var.f;
        }
        jc2Var.b = i5;
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        e3 e3Var;
        lk1 lk1Var;
        hy2 hy2Var = new hy2(super.onSaveInstanceState());
        ey2 ey2Var = this.a0;
        if (ey2Var != null && (lk1Var = ey2Var.n) != null) {
            hy2Var.o = lk1Var.a;
        }
        ActionMenuView actionMenuView = this.m;
        hy2Var.p = (actionMenuView == null || (e3Var = actionMenuView.F) == null || !e3Var.h()) ? false : true;
        return hy2Var;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.N = false;
        }
        if (!this.N) {
            boolean onTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !onTouchEvent) {
                this.N = true;
            }
        }
        if (actionMasked != 1 && actionMasked != 3) {
            return true;
        }
        this.N = false;
        return true;
    }

    public final int p(View view, int i, int i2, int[] iArr) {
        fy2 fy2Var = (fy2) view.getLayoutParams();
        int i3 = ((ViewGroup.MarginLayoutParams) fy2Var).rightMargin - iArr[1];
        int max = i - Math.max(0, i3);
        iArr[1] = Math.max(0, -i3);
        int j = j(view, i2);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(max - measuredWidth, j, max, view.getMeasuredHeight() + j);
        return max - (measuredWidth + ((ViewGroup.MarginLayoutParams) fy2Var).leftMargin);
    }

    public final int q(View view, int i, int i2, int i3, int i4, int[] iArr) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int i5 = marginLayoutParams.leftMargin - iArr[0];
        int i6 = marginLayoutParams.rightMargin - iArr[1];
        int max = Math.max(0, i6) + Math.max(0, i5);
        iArr[0] = Math.max(0, -i5);
        iArr[1] = Math.max(0, -i6);
        view.measure(ViewGroup.getChildMeasureSpec(i, getPaddingRight() + getPaddingLeft() + max + i2, marginLayoutParams.width), ViewGroup.getChildMeasureSpec(i3, getPaddingBottom() + getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i4, marginLayoutParams.height));
        return view.getMeasuredWidth() + max;
    }

    public final void r(View view, int i, int i2, int i3, int i4) {
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

    @Override // defpackage.hk1
    public final void removeMenuProvider(al1 al1Var) {
        this.S.b(al1Var);
    }

    public final boolean s(View view) {
        return (view == null || view.getParent() != this || view.getVisibility() == 8) ? false : true;
    }

    public void setBackInvokedCallbackEnabled(boolean z) {
        if (this.e0 != z) {
            this.e0 = z;
            t();
        }
    }

    public void setCollapseContentDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            c();
        }
        xf xfVar = this.t;
        if (xfVar != null) {
            xfVar.setContentDescription(charSequence);
        }
    }

    public void setCollapseIcon(Drawable drawable) {
        if (drawable != null) {
            c();
            this.t.setImageDrawable(drawable);
        } else {
            xf xfVar = this.t;
            if (xfVar != null) {
                xfVar.setImageDrawable(this.r);
            }
        }
    }

    public void setCollapsible(boolean z) {
        this.b0 = z;
        requestLayout();
    }

    public void setContentInsetEndWithActions(int i) {
        if (i < 0) {
            i = Integer.MIN_VALUE;
        }
        if (i != this.H) {
            this.H = i;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setContentInsetStartWithNavigation(int i) {
        if (i < 0) {
            i = Integer.MIN_VALUE;
        }
        if (i != this.G) {
            this.G = i;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setLogo(Drawable drawable) {
        AppCompatImageView appCompatImageView = this.q;
        if (drawable != null) {
            if (appCompatImageView == null) {
                this.q = new AppCompatImageView(getContext(), null);
            }
            if (!n(this.q)) {
                b(this.q, true);
            }
        } else if (appCompatImageView != null && n(appCompatImageView)) {
            removeView(this.q);
            this.Q.remove(this.q);
        }
        AppCompatImageView appCompatImageView2 = this.q;
        if (appCompatImageView2 != null) {
            appCompatImageView2.setImageDrawable(drawable);
        }
    }

    public void setLogoDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence) && this.q == null) {
            this.q = new AppCompatImageView(getContext(), null);
        }
        AppCompatImageView appCompatImageView = this.q;
        if (appCompatImageView != null) {
            appCompatImageView.setContentDescription(charSequence);
        }
    }

    public void setNavigationContentDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            g();
        }
        xf xfVar = this.p;
        if (xfVar != null) {
            xfVar.setContentDescription(charSequence);
            zj2.k(this.p, charSequence);
        }
    }

    public void setNavigationIcon(Drawable drawable) {
        if (drawable != null) {
            g();
            if (!n(this.p)) {
                b(this.p, true);
            }
        } else {
            xf xfVar = this.p;
            if (xfVar != null && n(xfVar)) {
                removeView(this.p);
                this.Q.remove(this.p);
            }
        }
        xf xfVar2 = this.p;
        if (xfVar2 != null) {
            xfVar2.setImageDrawable(drawable);
        }
    }

    public void setNavigationOnClickListener(View.OnClickListener onClickListener) {
        g();
        this.p.setOnClickListener(onClickListener);
    }

    public void setOverflowIcon(Drawable drawable) {
        e();
        this.m.setOverflowIcon(drawable);
    }

    public void setPopupTheme(int i) {
        if (this.w != i) {
            this.w = i;
            if (i == 0) {
                this.v = getContext();
            } else {
                this.v = new ContextThemeWrapper(getContext(), i);
            }
        }
    }

    public void setSubtitle(CharSequence charSequence) {
        boolean isEmpty = TextUtils.isEmpty(charSequence);
        bh bhVar = this.o;
        if (!isEmpty) {
            if (bhVar == null) {
                Context context = getContext();
                bh bhVar2 = new bh(context, null);
                this.o = bhVar2;
                bhVar2.setSingleLine();
                this.o.setEllipsize(TextUtils.TruncateAt.END);
                int i = this.y;
                if (i != 0) {
                    this.o.setTextAppearance(context, i);
                }
                ColorStateList colorStateList = this.M;
                if (colorStateList != null) {
                    this.o.setTextColor(colorStateList);
                }
            }
            if (!n(this.o)) {
                b(this.o, true);
            }
        } else if (bhVar != null && n(bhVar)) {
            removeView(this.o);
            this.Q.remove(this.o);
        }
        bh bhVar3 = this.o;
        if (bhVar3 != null) {
            bhVar3.setText(charSequence);
        }
        this.K = charSequence;
    }

    public void setSubtitleTextColor(ColorStateList colorStateList) {
        this.M = colorStateList;
        bh bhVar = this.o;
        if (bhVar != null) {
            bhVar.setTextColor(colorStateList);
        }
    }

    public void setTitle(CharSequence charSequence) {
        boolean isEmpty = TextUtils.isEmpty(charSequence);
        bh bhVar = this.n;
        if (!isEmpty) {
            if (bhVar == null) {
                Context context = getContext();
                bh bhVar2 = new bh(context, null);
                this.n = bhVar2;
                bhVar2.setSingleLine();
                this.n.setEllipsize(TextUtils.TruncateAt.END);
                int i = this.x;
                if (i != 0) {
                    this.n.setTextAppearance(context, i);
                }
                ColorStateList colorStateList = this.L;
                if (colorStateList != null) {
                    this.n.setTextColor(colorStateList);
                }
            }
            if (!n(this.n)) {
                b(this.n, true);
            }
        } else if (bhVar != null && n(bhVar)) {
            removeView(this.n);
            this.Q.remove(this.n);
        }
        bh bhVar3 = this.n;
        if (bhVar3 != null) {
            bhVar3.setText(charSequence);
        }
        this.J = charSequence;
    }

    public void setTitleMarginBottom(int i) {
        this.E = i;
        requestLayout();
    }

    public void setTitleMarginEnd(int i) {
        this.C = i;
        requestLayout();
    }

    public void setTitleMarginStart(int i) {
        this.B = i;
        requestLayout();
    }

    public void setTitleMarginTop(int i) {
        this.D = i;
        requestLayout();
    }

    public void setTitleTextColor(ColorStateList colorStateList) {
        this.L = colorStateList;
        bh bhVar = this.n;
        if (bhVar != null) {
            bhVar.setTextColor(colorStateList);
        }
    }

    public final void t() {
        OnBackInvokedDispatcher onBackInvokedDispatcher;
        if (Build.VERSION.SDK_INT >= 33) {
            OnBackInvokedDispatcher a = dy2.a(this);
            ey2 ey2Var = this.a0;
            int i = 0;
            boolean z = (ey2Var == null || ey2Var.n == null || a == null || !isAttachedToWindow() || !this.e0) ? false : true;
            if (z && this.d0 == null) {
                if (this.c0 == null) {
                    this.c0 = dy2.b(new by2(this, i));
                }
                dy2.c(a, this.c0);
                this.d0 = a;
                return;
            }
            if (z || (onBackInvokedDispatcher = this.d0) == null) {
                return;
            }
            dy2.d(onBackInvokedDispatcher, this.c0);
            this.d0 = null;
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
        setCollapseIcon(j8.F(getContext(), i));
    }

    public void setNavigationContentDescription(int i) {
        setNavigationContentDescription(i != 0 ? getContext().getText(i) : null);
    }

    @Override // android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return i(layoutParams);
    }

    public void setLogoDescription(int i) {
        setLogoDescription(getContext().getText(i));
    }

    public void setOnMenuItemClickListener(gy2 gy2Var) {
    }

    public void setNavigationIcon(int i) {
        setNavigationIcon(j8.F(getContext(), i));
    }

    public void setLogo(int i) {
        setLogo(j8.F(getContext(), i));
    }

    public void setSubtitle(int i) {
        setSubtitle(getContext().getText(i));
    }

    public void setTitle(int i) {
        setTitle(getContext().getText(i));
    }
}
