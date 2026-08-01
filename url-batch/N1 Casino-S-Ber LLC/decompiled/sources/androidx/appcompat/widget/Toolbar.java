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
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import com.derinko.gbini.n1casino.R;
import defpackage.a6;
import defpackage.a60;
import defpackage.b60;
import defpackage.c60;
import defpackage.d60;
import defpackage.e60;
import defpackage.e8;
import defpackage.f60;
import defpackage.g60;
import defpackage.h1;
import defpackage.h60;
import defpackage.ie;
import defpackage.k60;
import defpackage.l4;
import defpackage.l60;
import defpackage.mt;
import defpackage.n4;
import defpackage.pt;
import defpackage.r5;
import defpackage.t00;
import defpackage.t40;
import defpackage.u0;
import defpackage.v90;
import defpackage.vk;
import defpackage.wx;
import defpackage.x80;
import defpackage.z6;
import defpackage.zo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: r8-map-id-f21f5e89e3d3d92eca33bfe12a7775f49cadfb54340e756eb509706243ac6f5c */
/* loaded from: classes.dex */
public class Toolbar extends ViewGroup {
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
    public final a6 L;
    public ArrayList M;
    public f60 N;
    public final b60 O;
    public k60 P;
    public h1 Q;
    public d60 R;
    public e8 S;
    public h60 T;
    public boolean U;
    public OnBackInvokedCallback V;
    public OnBackInvokedDispatcher W;
    public boolean a0;
    public final z6 b0;
    public ActionMenuView f;
    public r5 g;
    public r5 h;
    public l4 i;
    public n4 j;
    public final Drawable k;
    public final CharSequence l;
    public l4 m;
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
    public t00 y;
    public int z;

    public Toolbar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, R.attr.toolbarStyle);
        this.B = 8388627;
        this.I = new ArrayList();
        this.J = new ArrayList();
        this.K = new int[2];
        this.L = new a6(new a60(this, 1));
        this.M = new ArrayList();
        this.O = new b60(this);
        this.b0 = new z6(11, this);
        Context context2 = getContext();
        int[] iArr = wx.x;
        a6 u = a6.u(R.attr.toolbarStyle, 0, context2, attributeSet, iArr);
        x80.l(this, context, iArr, attributeSet, (TypedArray) u.b, R.attr.toolbarStyle);
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
        d();
        t00 t00Var = this.y;
        t00Var.h = false;
        if (dimensionPixelSize != Integer.MIN_VALUE) {
            t00Var.e = dimensionPixelSize;
            t00Var.a = dimensionPixelSize;
        }
        if (dimensionPixelSize2 != Integer.MIN_VALUE) {
            t00Var.f = dimensionPixelSize2;
            t00Var.b = dimensionPixelSize2;
        }
        if (dimensionPixelOffset6 != Integer.MIN_VALUE || dimensionPixelOffset7 != Integer.MIN_VALUE) {
            t00Var.a(dimensionPixelOffset6, dimensionPixelOffset7);
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
        return new t40(getContext());
    }

    public static e60 h() {
        e60 e60Var = new e60(-2, -2);
        e60Var.b = 0;
        e60Var.a = 8388627;
        return e60Var;
    }

    public static e60 i(ViewGroup.LayoutParams layoutParams) {
        boolean z = layoutParams instanceof e60;
        if (z) {
            e60 e60Var = (e60) layoutParams;
            e60 e60Var2 = new e60(e60Var);
            e60Var2.b = 0;
            e60Var2.b = e60Var.b;
            return e60Var2;
        }
        if (z) {
            e60 e60Var3 = new e60((e60) layoutParams);
            e60Var3.b = 0;
            return e60Var3;
        }
        if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
            e60 e60Var4 = new e60(layoutParams);
            e60Var4.b = 0;
            return e60Var4;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        e60 e60Var5 = new e60(marginLayoutParams);
        e60Var5.b = 0;
        ((ViewGroup.MarginLayoutParams) e60Var5).leftMargin = marginLayoutParams.leftMargin;
        ((ViewGroup.MarginLayoutParams) e60Var5).topMargin = marginLayoutParams.topMargin;
        ((ViewGroup.MarginLayoutParams) e60Var5).rightMargin = marginLayoutParams.rightMargin;
        ((ViewGroup.MarginLayoutParams) e60Var5).bottomMargin = marginLayoutParams.bottomMargin;
        return e60Var5;
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
        boolean z = getLayoutDirection() == 1;
        int childCount = getChildCount();
        int absoluteGravity = Gravity.getAbsoluteGravity(i, getLayoutDirection());
        arrayList.clear();
        if (!z) {
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = getChildAt(i2);
                e60 e60Var = (e60) childAt.getLayoutParams();
                if (e60Var.b == 0 && t(childAt)) {
                    int i3 = e60Var.a;
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
            e60 e60Var2 = (e60) childAt2.getLayoutParams();
            if (e60Var2.b == 0 && t(childAt2)) {
                int i5 = e60Var2.a;
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

    public final void b(View view, boolean z) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        e60 h = layoutParams == null ? h() : !checkLayoutParams(layoutParams) ? i(layoutParams) : (e60) layoutParams;
        h.b = 1;
        if (!z || this.n == null) {
            addView(view, h);
        } else {
            view.setLayoutParams(h);
            this.J.add(view);
        }
    }

    public final void c() {
        if (this.m == null) {
            l4 l4Var = new l4(getContext(), null, R.attr.toolbarNavigationButtonStyle);
            this.m = l4Var;
            l4Var.setImageDrawable(this.k);
            this.m.setContentDescription(this.l);
            e60 h = h();
            h.a = (this.s & 112) | 8388611;
            h.b = 2;
            this.m.setLayoutParams(h);
            this.m.setOnClickListener(new u0(4, this));
        }
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return super.checkLayoutParams(layoutParams) && (layoutParams instanceof e60);
    }

    public final void d() {
        if (this.y == null) {
            t00 t00Var = new t00();
            t00Var.a = 0;
            t00Var.b = 0;
            t00Var.c = Integer.MIN_VALUE;
            t00Var.d = Integer.MIN_VALUE;
            t00Var.e = 0;
            t00Var.f = 0;
            t00Var.g = false;
            t00Var.h = false;
            this.y = t00Var;
        }
    }

    public final void e() {
        f();
        ActionMenuView actionMenuView = this.f;
        if (actionMenuView.u == null) {
            mt mtVar = (mt) actionMenuView.getMenu();
            if (this.R == null) {
                this.R = new d60(this);
            }
            this.f.setExpandedActionViewsExclusive(true);
            mtVar.b(this.R, this.o);
            v();
        }
    }

    public final void f() {
        if (this.f == null) {
            ActionMenuView actionMenuView = new ActionMenuView(getContext(), null);
            this.f = actionMenuView;
            actionMenuView.setPopupTheme(this.p);
            this.f.setOnMenuItemClickListener(this.O);
            ActionMenuView actionMenuView2 = this.f;
            e8 e8Var = this.S;
            b60 b60Var = new b60(this);
            actionMenuView2.z = e8Var;
            actionMenuView2.A = b60Var;
            e60 h = h();
            h.a = (this.s & 112) | 8388613;
            this.f.setLayoutParams(h);
            b(this.f, false);
        }
    }

    public final void g() {
        if (this.i == null) {
            this.i = new l4(getContext(), null, R.attr.toolbarNavigationButtonStyle);
            e60 h = h();
            h.a = (this.s & 112) | 8388611;
            this.i.setLayoutParams(h);
        }
    }

    @Override // android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return h();
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        Context context = getContext();
        e60 e60Var = new e60(context, attributeSet);
        e60Var.a = 0;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, wx.b);
        e60Var.a = obtainStyledAttributes.getInt(0, 0);
        obtainStyledAttributes.recycle();
        e60Var.b = 0;
        return e60Var;
    }

    public CharSequence getCollapseContentDescription() {
        l4 l4Var = this.m;
        if (l4Var != null) {
            return l4Var.getContentDescription();
        }
        return null;
    }

    public Drawable getCollapseIcon() {
        l4 l4Var = this.m;
        if (l4Var != null) {
            return l4Var.getDrawable();
        }
        return null;
    }

    public int getContentInsetEnd() {
        t00 t00Var = this.y;
        if (t00Var != null) {
            return t00Var.g ? t00Var.a : t00Var.b;
        }
        return 0;
    }

    public int getContentInsetEndWithActions() {
        int i = this.A;
        return i != Integer.MIN_VALUE ? i : getContentInsetEnd();
    }

    public int getContentInsetLeft() {
        t00 t00Var = this.y;
        if (t00Var != null) {
            return t00Var.a;
        }
        return 0;
    }

    public int getContentInsetRight() {
        t00 t00Var = this.y;
        if (t00Var != null) {
            return t00Var.b;
        }
        return 0;
    }

    public int getContentInsetStart() {
        t00 t00Var = this.y;
        if (t00Var != null) {
            return t00Var.g ? t00Var.b : t00Var.a;
        }
        return 0;
    }

    public int getContentInsetStartWithNavigation() {
        int i = this.z;
        return i != Integer.MIN_VALUE ? i : getContentInsetStart();
    }

    public int getCurrentContentInsetEnd() {
        mt mtVar;
        ActionMenuView actionMenuView = this.f;
        return (actionMenuView == null || (mtVar = actionMenuView.u) == null || !mtVar.hasVisibleItems()) ? getContentInsetEnd() : Math.max(getContentInsetEnd(), Math.max(this.A, 0));
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
        n4 n4Var = this.j;
        if (n4Var != null) {
            return n4Var.getDrawable();
        }
        return null;
    }

    public CharSequence getLogoDescription() {
        n4 n4Var = this.j;
        if (n4Var != null) {
            return n4Var.getContentDescription();
        }
        return null;
    }

    public Menu getMenu() {
        e();
        return this.f.getMenu();
    }

    public View getNavButtonView() {
        return this.i;
    }

    public CharSequence getNavigationContentDescription() {
        l4 l4Var = this.i;
        if (l4Var != null) {
            return l4Var.getContentDescription();
        }
        return null;
    }

    public Drawable getNavigationIcon() {
        l4 l4Var = this.i;
        if (l4Var != null) {
            return l4Var.getDrawable();
        }
        return null;
    }

    public h1 getOuterActionMenuPresenter() {
        return this.Q;
    }

    public Drawable getOverflowIcon() {
        e();
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
        if (this.P == null) {
            this.P = new k60(this, true);
        }
        return this.P;
    }

    public final int j(View view, int i) {
        e60 e60Var = (e60) view.getLayoutParams();
        int measuredHeight = view.getMeasuredHeight();
        int i2 = i > 0 ? (measuredHeight - i) / 2 : 0;
        int i3 = e60Var.a & 112;
        if (i3 != 16 && i3 != 48 && i3 != 80) {
            i3 = this.B & 112;
        }
        if (i3 == 48) {
            return getPaddingTop() - i2;
        }
        if (i3 == 80) {
            return (((getHeight() - getPaddingBottom()) - measuredHeight) - ((ViewGroup.MarginLayoutParams) e60Var).bottomMargin) - i2;
        }
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int height = getHeight();
        int i4 = (((height - paddingTop) - paddingBottom) - measuredHeight) / 2;
        int i5 = ((ViewGroup.MarginLayoutParams) e60Var).topMargin;
        if (i4 < i5) {
            i4 = i5;
        } else {
            int i6 = (((height - paddingBottom) - measuredHeight) - i4) - paddingTop;
            int i7 = ((ViewGroup.MarginLayoutParams) e60Var).bottomMargin;
            if (i6 < i7) {
                i4 = Math.max(0, i4 - (i7 - i6));
            }
        }
        return paddingTop + i4;
    }

    public final void m() {
        ArrayList arrayList = this.M;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            getMenu().removeItem(((MenuItem) obj).getItemId());
        }
        getMenu();
        ArrayList<MenuItem> currentMenuItems = getCurrentMenuItems();
        getMenuInflater();
        Iterator it = ((CopyOnWriteArrayList) this.L.d).iterator();
        while (it.hasNext()) {
            ((vk) it.next()).a.j();
        }
        ArrayList<MenuItem> currentMenuItems2 = getCurrentMenuItems();
        currentMenuItems2.removeAll(currentMenuItems);
        this.M = currentMenuItems2;
    }

    public final boolean n(View view) {
        return view.getParent() == this || this.J.contains(view);
    }

    public final boolean o() {
        h1 h1Var;
        ActionMenuView actionMenuView = this.f;
        return (actionMenuView == null || (h1Var = actionMenuView.y) == null || !h1Var.h()) ? false : true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        v();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeCallbacks(this.b0);
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
        boolean t;
        boolean t2;
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
        WeakHashMap weakHashMap = x80.a;
        int minimumHeight = getMinimumHeight();
        int min = minimumHeight >= 0 ? Math.min(minimumHeight, i4 - i2) : 0;
        if (t(this.i)) {
            l4 l4Var = this.i;
            if (z3) {
                i6 = q(l4Var, i19, min, iArr);
                i5 = paddingLeft;
                if (t(this.m)) {
                    l4 l4Var2 = this.m;
                    if (z3) {
                        i6 = q(l4Var2, i6, min, iArr);
                    } else {
                        i5 = p(l4Var2, i5, min, iArr);
                    }
                }
                if (t(this.f)) {
                    ActionMenuView actionMenuView = this.f;
                    if (z3) {
                        i5 = p(actionMenuView, i5, min, iArr);
                    } else {
                        i6 = q(actionMenuView, i6, min, iArr);
                    }
                }
                int currentContentInsetLeft = getCurrentContentInsetLeft();
                int currentContentInsetRight = getCurrentContentInsetRight();
                iArr[0] = Math.max(0, currentContentInsetLeft - i5);
                iArr[1] = Math.max(0, currentContentInsetRight - (i19 - i6));
                max = Math.max(i5, currentContentInsetLeft);
                int min2 = Math.min(i6, i19 - currentContentInsetRight);
                if (t(this.n)) {
                    View view = this.n;
                    if (z3) {
                        min2 = q(view, min2, min, iArr);
                    } else {
                        max = p(view, max, min, iArr);
                    }
                }
                if (t(this.j)) {
                    n4 n4Var = this.j;
                    if (z3) {
                        min2 = q(n4Var, min2, min, iArr);
                    } else {
                        max = p(n4Var, max, min, iArr);
                    }
                }
                t = t(this.g);
                t2 = t(this.h);
                if (t) {
                    z2 = z3;
                    i7 = 0;
                } else {
                    e60 e60Var = (e60) this.g.getLayoutParams();
                    z2 = z3;
                    i7 = this.g.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) e60Var).topMargin + ((ViewGroup.MarginLayoutParams) e60Var).bottomMargin;
                }
                if (!t2) {
                    e60 e60Var2 = (e60) this.h.getLayoutParams();
                    i7 = this.h.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) e60Var2).topMargin + ((ViewGroup.MarginLayoutParams) e60Var2).bottomMargin + i7;
                }
                if (!t || t2) {
                    r5 r5Var = !t ? this.g : this.h;
                    r5 r5Var2 = !t2 ? this.h : this.g;
                    e60 e60Var3 = (e60) r5Var.getLayoutParams();
                    e60 e60Var4 = (e60) r5Var2.getLayoutParams();
                    int i20 = i7;
                    boolean z4 = (!t && this.g.getMeasuredWidth() > 0) || (t2 && this.h.getMeasuredWidth() > 0);
                    i8 = this.B & 112;
                    int i21 = max;
                    if (i8 != 48) {
                        paddingTop = getPaddingTop() + ((ViewGroup.MarginLayoutParams) e60Var3).topMargin + this.w;
                    } else if (i8 != 80) {
                        int i22 = (((height - paddingTop2) - paddingBottom) - i20) / 2;
                        int i23 = ((ViewGroup.MarginLayoutParams) e60Var3).topMargin + this.w;
                        if (i22 < i23) {
                            i22 = i23;
                        } else {
                            int i24 = (((height - paddingBottom) - i20) - i22) - paddingTop2;
                            int i25 = ((ViewGroup.MarginLayoutParams) e60Var3).bottomMargin;
                            int i26 = this.x;
                            if (i24 < i25 + i26) {
                                i22 = Math.max(0, i22 - ((((ViewGroup.MarginLayoutParams) e60Var4).bottomMargin + i26) - i24));
                            }
                        }
                        paddingTop = paddingTop2 + i22;
                    } else {
                        paddingTop = (((height - paddingBottom) - ((ViewGroup.MarginLayoutParams) e60Var4).bottomMargin) - this.x) - i20;
                    }
                    if (z2) {
                        int i27 = (z4 ? this.u : 0) - iArr[0];
                        max = Math.max(0, i27) + i21;
                        iArr[0] = Math.max(0, -i27);
                        if (t) {
                            e60 e60Var5 = (e60) this.g.getLayoutParams();
                            int measuredWidth = this.g.getMeasuredWidth() + max;
                            int measuredHeight = this.g.getMeasuredHeight() + paddingTop;
                            this.g.layout(max, paddingTop, measuredWidth, measuredHeight);
                            i9 = measuredWidth + this.v;
                            paddingTop = measuredHeight + ((ViewGroup.MarginLayoutParams) e60Var5).bottomMargin;
                        } else {
                            i9 = max;
                        }
                        if (t2) {
                            int i28 = paddingTop + ((ViewGroup.MarginLayoutParams) ((e60) this.h.getLayoutParams())).topMargin;
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
                        if (t) {
                            e60 e60Var6 = (e60) this.g.getLayoutParams();
                            int measuredWidth3 = min2 - this.g.getMeasuredWidth();
                            int measuredHeight2 = this.g.getMeasuredHeight() + paddingTop;
                            this.g.layout(measuredWidth3, paddingTop, min2, measuredHeight2);
                            i11 = measuredWidth3 - this.v;
                            paddingTop = measuredHeight2 + ((ViewGroup.MarginLayoutParams) e60Var6).bottomMargin;
                        } else {
                            i11 = min2;
                        }
                        if (t2) {
                            int i30 = paddingTop + ((ViewGroup.MarginLayoutParams) ((e60) this.h.getLayoutParams())).topMargin;
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
                a(arrayList, 3);
                size = arrayList.size();
                i13 = max;
                for (i14 = 0; i14 < size; i14++) {
                    i13 = p((View) arrayList.get(i14), i13, min, iArr);
                }
                a(arrayList, 5);
                size2 = arrayList.size();
                for (i15 = 0; i15 < size2; i15++) {
                    min2 = q((View) arrayList.get(i15), min2, min, iArr);
                }
                a(arrayList, 1);
                int i31 = iArr[0];
                int i32 = iArr[1];
                size3 = arrayList.size();
                int i33 = i31;
                i16 = 0;
                int i34 = 0;
                while (i16 < size3) {
                    View view2 = (View) arrayList.get(i16);
                    e60 e60Var7 = (e60) view2.getLayoutParams();
                    int i35 = i32;
                    int i36 = ((ViewGroup.MarginLayoutParams) e60Var7).leftMargin - i33;
                    int i37 = ((ViewGroup.MarginLayoutParams) e60Var7).rightMargin - i35;
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
                    i13 = p((View) arrayList.get(i17), i13, min, iArr);
                }
                arrayList.clear();
            }
            i5 = p(l4Var, paddingLeft, min, iArr);
        } else {
            i5 = paddingLeft;
        }
        i6 = i19;
        if (t(this.m)) {
        }
        if (t(this.f)) {
        }
        int currentContentInsetLeft2 = getCurrentContentInsetLeft();
        int currentContentInsetRight2 = getCurrentContentInsetRight();
        iArr[0] = Math.max(0, currentContentInsetLeft2 - i5);
        iArr[1] = Math.max(0, currentContentInsetRight2 - (i19 - i6));
        max = Math.max(i5, currentContentInsetLeft2);
        int min22 = Math.min(i6, i19 - currentContentInsetRight2);
        if (t(this.n)) {
        }
        if (t(this.j)) {
        }
        t = t(this.g);
        t2 = t(this.h);
        if (t) {
        }
        if (!t2) {
        }
        if (!t) {
        }
        if (!t) {
        }
        if (!t2) {
        }
        e60 e60Var32 = (e60) r5Var.getLayoutParams();
        e60 e60Var42 = (e60) r5Var2.getLayoutParams();
        int i202 = i7;
        if (t) {
        }
        i8 = this.B & 112;
        int i212 = max;
        if (i8 != 48) {
        }
        if (z2) {
        }
        ArrayList arrayList2 = this.I;
        a(arrayList2, 3);
        size = arrayList2.size();
        i13 = max;
        while (i14 < size) {
        }
        a(arrayList2, 5);
        size2 = arrayList2.size();
        while (i15 < size2) {
        }
        a(arrayList2, 1);
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
        boolean z = v90.a;
        int i10 = 0;
        if (getLayoutDirection() == 1) {
            objArr = true;
            c = 0;
        } else {
            c = 1;
            objArr = false;
        }
        if (t(this.i)) {
            s(this.i, i, 0, i2, this.t);
            i3 = k(this.i) + this.i.getMeasuredWidth();
            i4 = Math.max(0, l(this.i) + this.i.getMeasuredHeight());
            i5 = View.combineMeasuredStates(0, this.i.getMeasuredState());
        } else {
            i3 = 0;
            i4 = 0;
            i5 = 0;
        }
        if (t(this.m)) {
            s(this.m, i, 0, i2, this.t);
            i3 = k(this.m) + this.m.getMeasuredWidth();
            i4 = Math.max(i4, l(this.m) + this.m.getMeasuredHeight());
            i5 = View.combineMeasuredStates(i5, this.m.getMeasuredState());
        }
        int currentContentInsetStart = getCurrentContentInsetStart();
        int max = Math.max(currentContentInsetStart, i3);
        int max2 = Math.max(0, currentContentInsetStart - i3);
        Object[] objArr2 = objArr;
        int[] iArr = this.K;
        iArr[objArr2 == true ? 1 : 0] = max2;
        if (t(this.f)) {
            s(this.f, i, max, i2, this.t);
            i6 = k(this.f) + this.f.getMeasuredWidth();
            i4 = Math.max(i4, l(this.f) + this.f.getMeasuredHeight());
            i5 = View.combineMeasuredStates(i5, this.f.getMeasuredState());
        } else {
            i6 = 0;
        }
        int currentContentInsetEnd = getCurrentContentInsetEnd();
        int max3 = max + Math.max(currentContentInsetEnd, i6);
        iArr[c] = Math.max(0, currentContentInsetEnd - i6);
        if (t(this.n)) {
            max3 += r(this.n, i, max3, i2, 0, iArr);
            i4 = Math.max(i4, l(this.n) + this.n.getMeasuredHeight());
            i5 = View.combineMeasuredStates(i5, this.n.getMeasuredState());
        }
        if (t(this.j)) {
            max3 += r(this.j, i, max3, i2, 0, iArr);
            i4 = Math.max(i4, l(this.j) + this.j.getMeasuredHeight());
            i5 = View.combineMeasuredStates(i5, this.j.getMeasuredState());
        }
        int childCount = getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = getChildAt(i11);
            if (((e60) childAt.getLayoutParams()).b == 0 && t(childAt)) {
                max3 += r(childAt, i, max3, i2, 0, iArr);
                int max4 = Math.max(i4, l(childAt) + childAt.getMeasuredHeight());
                i5 = View.combineMeasuredStates(i5, childAt.getMeasuredState());
                i4 = max4;
            } else {
                max3 = max3;
            }
        }
        int i12 = max3;
        int i13 = this.w + this.x;
        int i14 = this.u + this.v;
        if (t(this.g)) {
            r(this.g, i, i12 + i14, i2, i13, iArr);
            int k = k(this.g) + this.g.getMeasuredWidth();
            i7 = l(this.g) + this.g.getMeasuredHeight();
            i8 = View.combineMeasuredStates(i5, this.g.getMeasuredState());
            i9 = k;
        } else {
            i7 = 0;
            i8 = i5;
            i9 = 0;
        }
        if (t(this.h)) {
            i9 = Math.max(i9, r(this.h, i, i12 + i14, i2, i13 + i7, iArr));
            i7 += l(this.h) + this.h.getMeasuredHeight();
            i8 = View.combineMeasuredStates(i8, this.h.getMeasuredState());
        }
        int max5 = Math.max(i4, i7);
        int paddingRight = getPaddingRight() + getPaddingLeft() + i12 + i9;
        int paddingBottom = getPaddingBottom() + getPaddingTop() + max5;
        int resolveSizeAndState = View.resolveSizeAndState(Math.max(paddingRight, getSuggestedMinimumWidth()), i, (-16777216) & i8);
        int resolveSizeAndState2 = View.resolveSizeAndState(Math.max(paddingBottom, getSuggestedMinimumHeight()), i2, i8 << 16);
        if (this.U) {
            int childCount2 = getChildCount();
            for (int i15 = 0; i15 < childCount2; i15++) {
                View childAt2 = getChildAt(i15);
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
        if (!(parcelable instanceof g60)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        g60 g60Var = (g60) parcelable;
        super.onRestoreInstanceState(g60Var.f);
        ActionMenuView actionMenuView = this.f;
        mt mtVar = actionMenuView != null ? actionMenuView.u : null;
        int i = g60Var.h;
        if (i != 0 && this.R != null && mtVar != null && (findItem = mtVar.findItem(i)) != null) {
            findItem.expandActionView();
        }
        if (g60Var.i) {
            z6 z6Var = this.b0;
            removeCallbacks(z6Var);
            post(z6Var);
        }
    }

    @Override // android.view.View
    public final void onRtlPropertiesChanged(int i) {
        super.onRtlPropertiesChanged(i);
        d();
        t00 t00Var = this.y;
        boolean z = i == 1;
        if (z == t00Var.g) {
            return;
        }
        t00Var.g = z;
        if (!t00Var.h) {
            t00Var.a = t00Var.e;
            t00Var.b = t00Var.f;
            return;
        }
        if (z) {
            int i2 = t00Var.d;
            if (i2 == Integer.MIN_VALUE) {
                i2 = t00Var.e;
            }
            t00Var.a = i2;
            int i3 = t00Var.c;
            if (i3 == Integer.MIN_VALUE) {
                i3 = t00Var.f;
            }
            t00Var.b = i3;
            return;
        }
        int i4 = t00Var.c;
        if (i4 == Integer.MIN_VALUE) {
            i4 = t00Var.e;
        }
        t00Var.a = i4;
        int i5 = t00Var.d;
        if (i5 == Integer.MIN_VALUE) {
            i5 = t00Var.f;
        }
        t00Var.b = i5;
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        pt ptVar;
        g60 g60Var = new g60(super.onSaveInstanceState());
        d60 d60Var = this.R;
        if (d60Var != null && (ptVar = d60Var.g) != null) {
            g60Var.h = ptVar.a;
        }
        g60Var.i = o();
        return g60Var;
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

    public final int p(View view, int i, int i2, int[] iArr) {
        e60 e60Var = (e60) view.getLayoutParams();
        int i3 = ((ViewGroup.MarginLayoutParams) e60Var).leftMargin - iArr[0];
        int max = Math.max(0, i3) + i;
        iArr[0] = Math.max(0, -i3);
        int j = j(view, i2);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(max, j, max + measuredWidth, view.getMeasuredHeight() + j);
        return measuredWidth + ((ViewGroup.MarginLayoutParams) e60Var).rightMargin + max;
    }

    public final int q(View view, int i, int i2, int[] iArr) {
        e60 e60Var = (e60) view.getLayoutParams();
        int i3 = ((ViewGroup.MarginLayoutParams) e60Var).rightMargin - iArr[1];
        int max = i - Math.max(0, i3);
        iArr[1] = Math.max(0, -i3);
        int j = j(view, i2);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(max - measuredWidth, j, max, view.getMeasuredHeight() + j);
        return max - (measuredWidth + ((ViewGroup.MarginLayoutParams) e60Var).leftMargin);
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

    public void setBackInvokedCallbackEnabled(boolean z) {
        if (this.a0 != z) {
            this.a0 = z;
            v();
        }
    }

    public void setCollapseContentDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            c();
        }
        l4 l4Var = this.m;
        if (l4Var != null) {
            l4Var.setContentDescription(charSequence);
        }
    }

    public void setCollapseIcon(Drawable drawable) {
        if (drawable != null) {
            c();
            this.m.setImageDrawable(drawable);
        } else {
            l4 l4Var = this.m;
            if (l4Var != null) {
                l4Var.setImageDrawable(this.k);
            }
        }
    }

    public void setCollapsible(boolean z) {
        this.U = z;
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
        n4 n4Var = this.j;
        if (drawable != null) {
            if (n4Var == null) {
                this.j = new n4(getContext(), null, 0);
            }
            if (!n(this.j)) {
                b(this.j, true);
            }
        } else if (n4Var != null && n(n4Var)) {
            removeView(this.j);
            this.J.remove(this.j);
        }
        n4 n4Var2 = this.j;
        if (n4Var2 != null) {
            n4Var2.setImageDrawable(drawable);
        }
    }

    public void setLogoDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence) && this.j == null) {
            this.j = new n4(getContext(), null, 0);
        }
        n4 n4Var = this.j;
        if (n4Var != null) {
            n4Var.setContentDescription(charSequence);
        }
    }

    public void setNavigationContentDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            g();
        }
        l4 l4Var = this.i;
        if (l4Var != null) {
            l4Var.setContentDescription(charSequence);
            l60.a(this.i, charSequence);
        }
    }

    public void setNavigationIcon(Drawable drawable) {
        if (drawable != null) {
            g();
            if (!n(this.i)) {
                b(this.i, true);
            }
        } else {
            l4 l4Var = this.i;
            if (l4Var != null && n(l4Var)) {
                removeView(this.i);
                this.J.remove(this.i);
            }
        }
        l4 l4Var2 = this.i;
        if (l4Var2 != null) {
            l4Var2.setImageDrawable(drawable);
        }
    }

    public void setNavigationOnClickListener(View.OnClickListener onClickListener) {
        g();
        this.i.setOnClickListener(onClickListener);
    }

    public void setOnMenuItemClickListener(f60 f60Var) {
        this.N = f60Var;
    }

    public void setOverflowIcon(Drawable drawable) {
        e();
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
        r5 r5Var = this.h;
        if (!isEmpty) {
            if (r5Var == null) {
                Context context = getContext();
                r5 r5Var2 = new r5(context, null);
                this.h = r5Var2;
                r5Var2.setSingleLine();
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
            if (!n(this.h)) {
                b(this.h, true);
            }
        } else if (r5Var != null && n(r5Var)) {
            removeView(this.h);
            this.J.remove(this.h);
        }
        r5 r5Var3 = this.h;
        if (r5Var3 != null) {
            r5Var3.setText(charSequence);
        }
        this.D = charSequence;
    }

    public void setSubtitleTextColor(ColorStateList colorStateList) {
        this.F = colorStateList;
        r5 r5Var = this.h;
        if (r5Var != null) {
            r5Var.setTextColor(colorStateList);
        }
    }

    public void setTitle(CharSequence charSequence) {
        boolean isEmpty = TextUtils.isEmpty(charSequence);
        r5 r5Var = this.g;
        if (!isEmpty) {
            if (r5Var == null) {
                Context context = getContext();
                r5 r5Var2 = new r5(context, null);
                this.g = r5Var2;
                r5Var2.setSingleLine();
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
            if (!n(this.g)) {
                b(this.g, true);
            }
        } else if (r5Var != null && n(r5Var)) {
            removeView(this.g);
            this.J.remove(this.g);
        }
        r5 r5Var3 = this.g;
        if (r5Var3 != null) {
            r5Var3.setText(charSequence);
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
        r5 r5Var = this.g;
        if (r5Var != null) {
            r5Var.setTextColor(colorStateList);
        }
    }

    public final boolean t(View view) {
        return (view == null || view.getParent() != this || view.getVisibility() == 8) ? false : true;
    }

    public final boolean u() {
        h1 h1Var;
        ActionMenuView actionMenuView = this.f;
        return (actionMenuView == null || (h1Var = actionMenuView.y) == null || !h1Var.l()) ? false : true;
    }

    public final void v() {
        OnBackInvokedDispatcher onBackInvokedDispatcher;
        if (Build.VERSION.SDK_INT >= 33) {
            OnBackInvokedDispatcher a = c60.a(this);
            d60 d60Var = this.R;
            int i = 0;
            boolean z = (d60Var == null || d60Var.g == null || a == null || !isAttachedToWindow() || !this.a0) ? false : true;
            if (z && this.W == null) {
                if (this.V == null) {
                    this.V = c60.b(new a60(this, i));
                }
                c60.c(a, this.V);
                this.W = a;
                return;
            }
            if (z || (onBackInvokedDispatcher = this.W) == null) {
                return;
            }
            c60.d(onBackInvokedDispatcher, this.V);
            this.W = null;
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
        setCollapseIcon(zo.s(getContext(), i));
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

    public void setNavigationIcon(int i) {
        setNavigationIcon(zo.s(getContext(), i));
    }

    public void setLogo(int i) {
        setLogo(zo.s(getContext(), i));
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
