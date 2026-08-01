package androidx.appcompat.widget;

import I.g;
import K.C0019o;
import K.InterfaceC0021q;
import K.X;
import K0.B;
import T.r;
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
import androidx.fragment.app.D;
import com.fortuneink.neonpad.R;
import com.google.android.material.datepicker.j;
import f.a;
import g.C0147I;
import j.i;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;
import k.C0202o;
import k.MenuC0200m;
import l.C0230A;
import l.C0231B;
import l.C0257e0;
import l.C0268k;
import l.InterfaceC0275n0;
import l.Q0;
import l.W0;
import l.X0;
import l.Y0;
import l.Z0;
import l.a1;
import l.b1;
import l.c1;
import l.e1;
import l.f1;
import l.j1;
import q1.d;

/* loaded from: classes.dex */
public class Toolbar extends ViewGroup {

    /* renamed from: A, reason: collision with root package name */
    public ColorStateList f1061A;

    /* renamed from: B, reason: collision with root package name */
    public boolean f1062B;

    /* renamed from: C, reason: collision with root package name */
    public boolean f1063C;

    /* renamed from: D, reason: collision with root package name */
    public final ArrayList f1064D;

    /* renamed from: E, reason: collision with root package name */
    public final ArrayList f1065E;
    public final int[] F;

    /* renamed from: G, reason: collision with root package name */
    public final C0019o f1066G;

    /* renamed from: H, reason: collision with root package name */
    public ArrayList f1067H;

    /* renamed from: I, reason: collision with root package name */
    public b1 f1068I;

    /* renamed from: J, reason: collision with root package name */
    public final X0 f1069J;

    /* renamed from: K, reason: collision with root package name */
    public e1 f1070K;

    /* renamed from: L, reason: collision with root package name */
    public C0268k f1071L;

    /* renamed from: M, reason: collision with root package name */
    public Z0 f1072M;

    /* renamed from: N, reason: collision with root package name */
    public g f1073N;

    /* renamed from: O, reason: collision with root package name */
    public C0147I f1074O;

    /* renamed from: P, reason: collision with root package name */
    public boolean f1075P;

    /* renamed from: Q, reason: collision with root package name */
    public OnBackInvokedCallback f1076Q;

    /* renamed from: R, reason: collision with root package name */
    public OnBackInvokedDispatcher f1077R;

    /* renamed from: S, reason: collision with root package name */
    public boolean f1078S;

    /* renamed from: T, reason: collision with root package name */
    public final B f1079T;

    /* renamed from: a, reason: collision with root package name */
    public ActionMenuView f1080a;

    /* renamed from: b, reason: collision with root package name */
    public C0257e0 f1081b;

    /* renamed from: c, reason: collision with root package name */
    public C0257e0 f1082c;

    /* renamed from: d, reason: collision with root package name */
    public C0230A f1083d;

    /* renamed from: e, reason: collision with root package name */
    public C0231B f1084e;

    /* renamed from: f, reason: collision with root package name */
    public final Drawable f1085f;

    /* renamed from: g, reason: collision with root package name */
    public final CharSequence f1086g;
    public C0230A h;
    public View i;

    /* renamed from: j, reason: collision with root package name */
    public Context f1087j;

    /* renamed from: k, reason: collision with root package name */
    public int f1088k;

    /* renamed from: l, reason: collision with root package name */
    public int f1089l;

    /* renamed from: m, reason: collision with root package name */
    public int f1090m;

    /* renamed from: n, reason: collision with root package name */
    public final int f1091n;

    /* renamed from: o, reason: collision with root package name */
    public final int f1092o;

    /* renamed from: p, reason: collision with root package name */
    public int f1093p;

    /* renamed from: q, reason: collision with root package name */
    public int f1094q;

    /* renamed from: r, reason: collision with root package name */
    public int f1095r;

    /* renamed from: s, reason: collision with root package name */
    public int f1096s;

    /* renamed from: t, reason: collision with root package name */
    public Q0 f1097t;

    /* renamed from: u, reason: collision with root package name */
    public int f1098u;

    /* renamed from: v, reason: collision with root package name */
    public int f1099v;

    /* renamed from: w, reason: collision with root package name */
    public final int f1100w;

    /* renamed from: x, reason: collision with root package name */
    public CharSequence f1101x;

    /* renamed from: y, reason: collision with root package name */
    public CharSequence f1102y;

    /* renamed from: z, reason: collision with root package name */
    public ColorStateList f1103z;

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
        return new i(getContext());
    }

    public static a1 h() {
        a1 a1Var = new a1(-2, -2);
        a1Var.f3335b = 0;
        a1Var.f3334a = 8388627;
        return a1Var;
    }

    public static a1 i(ViewGroup.LayoutParams layoutParams) {
        boolean z2 = layoutParams instanceof a1;
        if (z2) {
            a1 a1Var = (a1) layoutParams;
            a1 a1Var2 = new a1(a1Var);
            a1Var2.f3335b = 0;
            a1Var2.f3335b = a1Var.f3335b;
            return a1Var2;
        }
        if (z2) {
            a1 a1Var3 = new a1((a1) layoutParams);
            a1Var3.f3335b = 0;
            return a1Var3;
        }
        if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
            a1 a1Var4 = new a1(layoutParams);
            a1Var4.f3335b = 0;
            return a1Var4;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        a1 a1Var5 = new a1(marginLayoutParams);
        a1Var5.f3335b = 0;
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
                if (a1Var.f3335b == 0 && u(childAt)) {
                    int i3 = a1Var.f3334a;
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
            if (a1Var2.f3335b == 0 && u(childAt2)) {
                int i5 = a1Var2.f3334a;
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
        h.f3335b = 1;
        if (!z2 || this.i == null) {
            addView(view, h);
        } else {
            view.setLayoutParams(h);
            this.f1065E.add(view);
        }
    }

    public final void c() {
        if (this.h == null) {
            C0230A c0230a = new C0230A(getContext(), null, R.attr.toolbarNavigationButtonStyle);
            this.h = c0230a;
            c0230a.setImageDrawable(this.f1085f);
            this.h.setContentDescription(this.f1086g);
            a1 h = h();
            h.f3334a = (this.f1091n & 112) | 8388611;
            h.f3335b = 2;
            this.h.setLayoutParams(h);
            this.h.setOnClickListener(new j(3, this));
        }
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return super.checkLayoutParams(layoutParams) && (layoutParams instanceof a1);
    }

    public final void d() {
        if (this.f1097t == null) {
            Q0 q02 = new Q0();
            q02.f3286a = 0;
            q02.f3287b = 0;
            q02.f3288c = Integer.MIN_VALUE;
            q02.f3289d = Integer.MIN_VALUE;
            q02.f3290e = 0;
            q02.f3291f = 0;
            q02.f3292g = false;
            q02.h = false;
            this.f1097t = q02;
        }
    }

    public final void e() {
        f();
        ActionMenuView actionMenuView = this.f1080a;
        if (actionMenuView.f1036p == null) {
            MenuC0200m menuC0200m = (MenuC0200m) actionMenuView.getMenu();
            if (this.f1072M == null) {
                this.f1072M = new Z0(this);
            }
            this.f1080a.setExpandedActionViewsExclusive(true);
            menuC0200m.b(this.f1072M, this.f1087j);
            w();
        }
    }

    public final void f() {
        if (this.f1080a == null) {
            ActionMenuView actionMenuView = new ActionMenuView(getContext(), null);
            this.f1080a = actionMenuView;
            actionMenuView.setPopupTheme(this.f1088k);
            this.f1080a.setOnMenuItemClickListener(this.f1069J);
            ActionMenuView actionMenuView2 = this.f1080a;
            g gVar = this.f1073N;
            X0 x0 = new X0(this);
            actionMenuView2.f1041u = gVar;
            actionMenuView2.f1042v = x0;
            a1 h = h();
            h.f3334a = (this.f1091n & 112) | 8388613;
            this.f1080a.setLayoutParams(h);
            b(this.f1080a, false);
        }
    }

    public final void g() {
        if (this.f1083d == null) {
            this.f1083d = new C0230A(getContext(), null, R.attr.toolbarNavigationButtonStyle);
            a1 h = h();
            h.f3334a = (this.f1091n & 112) | 8388611;
            this.f1083d.setLayoutParams(h);
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
        C0230A c0230a = this.h;
        if (c0230a != null) {
            return c0230a.getContentDescription();
        }
        return null;
    }

    public Drawable getCollapseIcon() {
        C0230A c0230a = this.h;
        if (c0230a != null) {
            return c0230a.getDrawable();
        }
        return null;
    }

    public int getContentInsetEnd() {
        Q0 q02 = this.f1097t;
        if (q02 != null) {
            return q02.f3292g ? q02.f3286a : q02.f3287b;
        }
        return 0;
    }

    public int getContentInsetEndWithActions() {
        int i = this.f1099v;
        return i != Integer.MIN_VALUE ? i : getContentInsetEnd();
    }

    public int getContentInsetLeft() {
        Q0 q02 = this.f1097t;
        if (q02 != null) {
            return q02.f3286a;
        }
        return 0;
    }

    public int getContentInsetRight() {
        Q0 q02 = this.f1097t;
        if (q02 != null) {
            return q02.f3287b;
        }
        return 0;
    }

    public int getContentInsetStart() {
        Q0 q02 = this.f1097t;
        if (q02 != null) {
            return q02.f3292g ? q02.f3287b : q02.f3286a;
        }
        return 0;
    }

    public int getContentInsetStartWithNavigation() {
        int i = this.f1098u;
        return i != Integer.MIN_VALUE ? i : getContentInsetStart();
    }

    public int getCurrentContentInsetEnd() {
        MenuC0200m menuC0200m;
        ActionMenuView actionMenuView = this.f1080a;
        return (actionMenuView == null || (menuC0200m = actionMenuView.f1036p) == null || !menuC0200m.hasVisibleItems()) ? getContentInsetEnd() : Math.max(getContentInsetEnd(), Math.max(this.f1099v, 0));
    }

    public int getCurrentContentInsetLeft() {
        return getLayoutDirection() == 1 ? getCurrentContentInsetEnd() : getCurrentContentInsetStart();
    }

    public int getCurrentContentInsetRight() {
        return getLayoutDirection() == 1 ? getCurrentContentInsetStart() : getCurrentContentInsetEnd();
    }

    public int getCurrentContentInsetStart() {
        return getNavigationIcon() != null ? Math.max(getContentInsetStart(), Math.max(this.f1098u, 0)) : getContentInsetStart();
    }

    public Drawable getLogo() {
        C0231B c0231b = this.f1084e;
        if (c0231b != null) {
            return c0231b.getDrawable();
        }
        return null;
    }

    public CharSequence getLogoDescription() {
        C0231B c0231b = this.f1084e;
        if (c0231b != null) {
            return c0231b.getContentDescription();
        }
        return null;
    }

    public Menu getMenu() {
        e();
        return this.f1080a.getMenu();
    }

    public View getNavButtonView() {
        return this.f1083d;
    }

    public CharSequence getNavigationContentDescription() {
        C0230A c0230a = this.f1083d;
        if (c0230a != null) {
            return c0230a.getContentDescription();
        }
        return null;
    }

    public Drawable getNavigationIcon() {
        C0230A c0230a = this.f1083d;
        if (c0230a != null) {
            return c0230a.getDrawable();
        }
        return null;
    }

    public C0268k getOuterActionMenuPresenter() {
        return this.f1071L;
    }

    public Drawable getOverflowIcon() {
        e();
        return this.f1080a.getOverflowIcon();
    }

    public Context getPopupContext() {
        return this.f1087j;
    }

    public int getPopupTheme() {
        return this.f1088k;
    }

    public CharSequence getSubtitle() {
        return this.f1102y;
    }

    public final TextView getSubtitleTextView() {
        return this.f1082c;
    }

    public CharSequence getTitle() {
        return this.f1101x;
    }

    public int getTitleMarginBottom() {
        return this.f1096s;
    }

    public int getTitleMarginEnd() {
        return this.f1094q;
    }

    public int getTitleMarginStart() {
        return this.f1093p;
    }

    public int getTitleMarginTop() {
        return this.f1095r;
    }

    public final TextView getTitleTextView() {
        return this.f1081b;
    }

    public InterfaceC0275n0 getWrapper() {
        if (this.f1070K == null) {
            this.f1070K = new e1(this, true);
        }
        return this.f1070K;
    }

    public final int j(View view, int i) {
        a1 a1Var = (a1) view.getLayoutParams();
        int measuredHeight = view.getMeasuredHeight();
        int i2 = i > 0 ? (measuredHeight - i) / 2 : 0;
        int i3 = a1Var.f3334a & 112;
        if (i3 != 16 && i3 != 48 && i3 != 80) {
            i3 = this.f1100w & 112;
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
        Iterator it = this.f1067H.iterator();
        while (it.hasNext()) {
            getMenu().removeItem(((MenuItem) it.next()).getItemId());
        }
        getMenu();
        ArrayList<MenuItem> currentMenuItems = getCurrentMenuItems();
        getMenuInflater();
        Iterator it2 = this.f1066G.f480b.iterator();
        while (it2.hasNext()) {
            ((D) ((InterfaceC0021q) it2.next())).f1198a.j();
        }
        ArrayList<MenuItem> currentMenuItems2 = getCurrentMenuItems();
        currentMenuItems2.removeAll(currentMenuItems);
        this.f1067H = currentMenuItems2;
    }

    public final boolean o(View view) {
        return view.getParent() == this || this.f1065E.contains(view);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        w();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeCallbacks(this.f1079T);
        w();
    }

    @Override // android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.f1063C = false;
        }
        if (!this.f1063C) {
            boolean onHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !onHoverEvent) {
                this.f1063C = true;
            }
        }
        if (actionMasked == 10 || actionMasked == 3) {
            this.f1063C = false;
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
        boolean u2;
        boolean u3;
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
        WeakHashMap weakHashMap = X.f418a;
        int minimumHeight = getMinimumHeight();
        int min = minimumHeight >= 0 ? Math.min(minimumHeight, i4 - i2) : 0;
        if (!u(this.f1083d)) {
            i5 = paddingLeft;
        } else {
            if (z4) {
                i6 = r(this.f1083d, i24, min, iArr);
                i5 = paddingLeft;
                if (u(this.h)) {
                    if (z4) {
                        i6 = r(this.h, i6, min, iArr);
                    } else {
                        i5 = q(this.h, i5, min, iArr);
                    }
                }
                if (u(this.f1080a)) {
                    if (z4) {
                        i5 = q(this.f1080a, i5, min, iArr);
                    } else {
                        i6 = r(this.f1080a, i6, min, iArr);
                    }
                }
                int currentContentInsetLeft = getCurrentContentInsetLeft();
                int currentContentInsetRight = getCurrentContentInsetRight();
                iArr[0] = Math.max(0, currentContentInsetLeft - i5);
                iArr[1] = Math.max(0, currentContentInsetRight - (i24 - i6));
                int max = Math.max(i5, currentContentInsetLeft);
                int min2 = Math.min(i6, i24 - currentContentInsetRight);
                if (u(this.i)) {
                    if (z4) {
                        min2 = r(this.i, min2, min, iArr);
                    } else {
                        max = q(this.i, max, min, iArr);
                    }
                }
                if (u(this.f1084e)) {
                    if (z4) {
                        min2 = r(this.f1084e, min2, min, iArr);
                    } else {
                        max = q(this.f1084e, max, min, iArr);
                    }
                }
                u2 = u(this.f1081b);
                u3 = u(this.f1082c);
                if (u2) {
                    i7 = paddingRight;
                    i8 = 0;
                } else {
                    a1 a1Var = (a1) this.f1081b.getLayoutParams();
                    i7 = paddingRight;
                    i8 = ((ViewGroup.MarginLayoutParams) a1Var).bottomMargin + this.f1081b.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) a1Var).topMargin;
                }
                if (u3) {
                    i9 = width;
                } else {
                    a1 a1Var2 = (a1) this.f1082c.getLayoutParams();
                    i9 = width;
                    i8 += this.f1082c.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) a1Var2).topMargin + ((ViewGroup.MarginLayoutParams) a1Var2).bottomMargin;
                }
                if (!u2 || u3) {
                    C0257e0 c0257e0 = !u2 ? this.f1081b : this.f1082c;
                    C0257e0 c0257e02 = !u3 ? this.f1082c : this.f1081b;
                    a1 a1Var3 = (a1) c0257e0.getLayoutParams();
                    a1 a1Var4 = (a1) c0257e02.getLayoutParams();
                    if ((u2 || this.f1081b.getMeasuredWidth() <= 0) && (!u3 || this.f1082c.getMeasuredWidth() <= 0)) {
                        i10 = paddingLeft;
                        z3 = false;
                    } else {
                        i10 = paddingLeft;
                        z3 = true;
                    }
                    i11 = this.f1100w & 112;
                    i12 = min;
                    if (i11 != 48) {
                        i13 = max;
                        paddingTop = getPaddingTop() + ((ViewGroup.MarginLayoutParams) a1Var3).topMargin + this.f1095r;
                    } else if (i11 != 80) {
                        int i25 = (((height - paddingTop2) - paddingBottom) - i8) / 2;
                        i13 = max;
                        int i26 = ((ViewGroup.MarginLayoutParams) a1Var3).topMargin + this.f1095r;
                        if (i25 < i26) {
                            i25 = i26;
                        } else {
                            int i27 = (((height - paddingBottom) - i8) - i25) - paddingTop2;
                            int i28 = ((ViewGroup.MarginLayoutParams) a1Var3).bottomMargin;
                            int i29 = this.f1096s;
                            if (i27 < i28 + i29) {
                                i25 = Math.max(0, i25 - ((((ViewGroup.MarginLayoutParams) a1Var4).bottomMargin + i29) - i27));
                            }
                        }
                        paddingTop = paddingTop2 + i25;
                    } else {
                        i13 = max;
                        paddingTop = (((height - paddingBottom) - ((ViewGroup.MarginLayoutParams) a1Var4).bottomMargin) - this.f1096s) - i8;
                    }
                    if (z4) {
                        int i30 = (z3 ? this.f1093p : 0) - iArr[0];
                        max = Math.max(0, i30) + i13;
                        iArr[0] = Math.max(0, -i30);
                        if (u2) {
                            a1 a1Var5 = (a1) this.f1081b.getLayoutParams();
                            int measuredWidth = this.f1081b.getMeasuredWidth() + max;
                            int measuredHeight = this.f1081b.getMeasuredHeight() + paddingTop;
                            this.f1081b.layout(max, paddingTop, measuredWidth, measuredHeight);
                            i14 = measuredWidth + this.f1094q;
                            paddingTop = measuredHeight + ((ViewGroup.MarginLayoutParams) a1Var5).bottomMargin;
                        } else {
                            i14 = max;
                        }
                        if (u3) {
                            int i31 = paddingTop + ((ViewGroup.MarginLayoutParams) ((a1) this.f1082c.getLayoutParams())).topMargin;
                            int measuredWidth2 = this.f1082c.getMeasuredWidth() + max;
                            this.f1082c.layout(max, i31, measuredWidth2, this.f1082c.getMeasuredHeight() + i31);
                            i15 = measuredWidth2 + this.f1094q;
                        } else {
                            i15 = max;
                        }
                        if (z3) {
                            max = Math.max(i14, i15);
                        }
                    } else {
                        int i32 = (z3 ? this.f1093p : 0) - iArr[1];
                        min2 -= Math.max(0, i32);
                        iArr[1] = Math.max(0, -i32);
                        if (u2) {
                            a1 a1Var6 = (a1) this.f1081b.getLayoutParams();
                            int measuredWidth3 = min2 - this.f1081b.getMeasuredWidth();
                            int measuredHeight2 = this.f1081b.getMeasuredHeight() + paddingTop;
                            this.f1081b.layout(measuredWidth3, paddingTop, min2, measuredHeight2);
                            i16 = measuredWidth3 - this.f1094q;
                            paddingTop = measuredHeight2 + ((ViewGroup.MarginLayoutParams) a1Var6).bottomMargin;
                        } else {
                            i16 = min2;
                        }
                        if (u3) {
                            int i33 = paddingTop + ((ViewGroup.MarginLayoutParams) ((a1) this.f1082c.getLayoutParams())).topMargin;
                            this.f1082c.layout(min2 - this.f1082c.getMeasuredWidth(), i33, min2, this.f1082c.getMeasuredHeight() + i33);
                            i17 = min2 - this.f1094q;
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
                ArrayList arrayList = this.f1064D;
                a(arrayList, 3);
                size = arrayList.size();
                i18 = max;
                for (i19 = 0; i19 < size; i19++) {
                    i18 = q((View) arrayList.get(i19), i18, i12, iArr);
                }
                int i34 = i12;
                a(arrayList, 5);
                size2 = arrayList.size();
                for (i20 = 0; i20 < size2; i20++) {
                    min2 = r((View) arrayList.get(i20), min2, i34, iArr);
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
                    i18 = q((View) arrayList.get(i22), i18, i34, iArr);
                }
                arrayList.clear();
            }
            i5 = q(this.f1083d, paddingLeft, min, iArr);
        }
        i6 = i24;
        if (u(this.h)) {
        }
        if (u(this.f1080a)) {
        }
        int currentContentInsetLeft2 = getCurrentContentInsetLeft();
        int currentContentInsetRight2 = getCurrentContentInsetRight();
        iArr[0] = Math.max(0, currentContentInsetLeft2 - i5);
        iArr[1] = Math.max(0, currentContentInsetRight2 - (i24 - i6));
        int max6 = Math.max(i5, currentContentInsetLeft2);
        int min22 = Math.min(i6, i24 - currentContentInsetRight2);
        if (u(this.i)) {
        }
        if (u(this.f1084e)) {
        }
        u2 = u(this.f1081b);
        u3 = u(this.f1082c);
        if (u2) {
        }
        if (u3) {
        }
        if (u2) {
        }
        if (!u2) {
        }
        if (!u3) {
        }
        a1 a1Var32 = (a1) c0257e0.getLayoutParams();
        a1 a1Var42 = (a1) c0257e02.getLayoutParams();
        if (u2) {
        }
        i10 = paddingLeft;
        z3 = false;
        i11 = this.f1100w & 112;
        i12 = min;
        if (i11 != 48) {
        }
        if (z4) {
        }
        ArrayList arrayList2 = this.f1064D;
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
        boolean z2 = j1.f3383a;
        int i10 = 0;
        if (getLayoutDirection() == 1) {
            c3 = 1;
            c2 = 0;
        } else {
            c2 = 1;
            c3 = 0;
        }
        if (u(this.f1083d)) {
            t(this.f1083d, i, 0, i2, this.f1092o);
            i3 = k(this.f1083d) + this.f1083d.getMeasuredWidth();
            i4 = Math.max(0, l(this.f1083d) + this.f1083d.getMeasuredHeight());
            i5 = View.combineMeasuredStates(0, this.f1083d.getMeasuredState());
        } else {
            i3 = 0;
            i4 = 0;
            i5 = 0;
        }
        if (u(this.h)) {
            t(this.h, i, 0, i2, this.f1092o);
            i3 = k(this.h) + this.h.getMeasuredWidth();
            i4 = Math.max(i4, l(this.h) + this.h.getMeasuredHeight());
            i5 = View.combineMeasuredStates(i5, this.h.getMeasuredState());
        }
        int currentContentInsetStart = getCurrentContentInsetStart();
        int max = Math.max(currentContentInsetStart, i3);
        int max2 = Math.max(0, currentContentInsetStart - i3);
        int[] iArr = this.F;
        iArr[c3] = max2;
        if (u(this.f1080a)) {
            t(this.f1080a, i, max, i2, this.f1092o);
            i6 = k(this.f1080a) + this.f1080a.getMeasuredWidth();
            i4 = Math.max(i4, l(this.f1080a) + this.f1080a.getMeasuredHeight());
            i5 = View.combineMeasuredStates(i5, this.f1080a.getMeasuredState());
        } else {
            i6 = 0;
        }
        int currentContentInsetEnd = getCurrentContentInsetEnd();
        int max3 = max + Math.max(currentContentInsetEnd, i6);
        iArr[c2] = Math.max(0, currentContentInsetEnd - i6);
        if (u(this.i)) {
            max3 += s(this.i, i, max3, i2, 0, iArr);
            i4 = Math.max(i4, l(this.i) + this.i.getMeasuredHeight());
            i5 = View.combineMeasuredStates(i5, this.i.getMeasuredState());
        }
        if (u(this.f1084e)) {
            max3 += s(this.f1084e, i, max3, i2, 0, iArr);
            i4 = Math.max(i4, l(this.f1084e) + this.f1084e.getMeasuredHeight());
            i5 = View.combineMeasuredStates(i5, this.f1084e.getMeasuredState());
        }
        int childCount = getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = getChildAt(i11);
            if (((a1) childAt.getLayoutParams()).f3335b == 0 && u(childAt)) {
                max3 += s(childAt, i, max3, i2, 0, iArr);
                i4 = Math.max(i4, l(childAt) + childAt.getMeasuredHeight());
                i5 = View.combineMeasuredStates(i5, childAt.getMeasuredState());
            }
        }
        int i12 = this.f1095r + this.f1096s;
        int i13 = this.f1093p + this.f1094q;
        if (u(this.f1081b)) {
            s(this.f1081b, i, max3 + i13, i2, i12, iArr);
            int k2 = k(this.f1081b) + this.f1081b.getMeasuredWidth();
            i7 = l(this.f1081b) + this.f1081b.getMeasuredHeight();
            i8 = View.combineMeasuredStates(i5, this.f1081b.getMeasuredState());
            i9 = k2;
        } else {
            i7 = 0;
            i8 = i5;
            i9 = 0;
        }
        if (u(this.f1082c)) {
            i9 = Math.max(i9, s(this.f1082c, i, max3 + i13, i2, i7 + i12, iArr));
            i7 = l(this.f1082c) + this.f1082c.getMeasuredHeight() + i7;
            i8 = View.combineMeasuredStates(i8, this.f1082c.getMeasuredState());
        }
        int max4 = Math.max(i4, i7);
        int paddingRight = getPaddingRight() + getPaddingLeft();
        int paddingBottom = getPaddingBottom() + getPaddingTop() + max4;
        int resolveSizeAndState = View.resolveSizeAndState(Math.max(paddingRight + max3 + i9, getSuggestedMinimumWidth()), i, (-16777216) & i8);
        int resolveSizeAndState2 = View.resolveSizeAndState(Math.max(paddingBottom, getSuggestedMinimumHeight()), i2, i8 << 16);
        if (this.f1075P) {
            int childCount2 = getChildCount();
            for (int i14 = 0; i14 < childCount2; i14++) {
                View childAt2 = getChildAt(i14);
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
        if (!(parcelable instanceof c1)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        c1 c1Var = (c1) parcelable;
        super.onRestoreInstanceState(c1Var.f735a);
        ActionMenuView actionMenuView = this.f1080a;
        MenuC0200m menuC0200m = actionMenuView != null ? actionMenuView.f1036p : null;
        int i = c1Var.f3340c;
        if (i != 0 && this.f1072M != null && menuC0200m != null && (findItem = menuC0200m.findItem(i)) != null) {
            findItem.expandActionView();
        }
        if (c1Var.f3341d) {
            B b2 = this.f1079T;
            removeCallbacks(b2);
            post(b2);
        }
    }

    @Override // android.view.View
    public final void onRtlPropertiesChanged(int i) {
        super.onRtlPropertiesChanged(i);
        d();
        Q0 q02 = this.f1097t;
        boolean z2 = i == 1;
        if (z2 == q02.f3292g) {
            return;
        }
        q02.f3292g = z2;
        if (!q02.h) {
            q02.f3286a = q02.f3290e;
            q02.f3287b = q02.f3291f;
            return;
        }
        if (z2) {
            int i2 = q02.f3289d;
            if (i2 == Integer.MIN_VALUE) {
                i2 = q02.f3290e;
            }
            q02.f3286a = i2;
            int i3 = q02.f3288c;
            if (i3 == Integer.MIN_VALUE) {
                i3 = q02.f3291f;
            }
            q02.f3287b = i3;
            return;
        }
        int i4 = q02.f3288c;
        if (i4 == Integer.MIN_VALUE) {
            i4 = q02.f3290e;
        }
        q02.f3286a = i4;
        int i5 = q02.f3289d;
        if (i5 == Integer.MIN_VALUE) {
            i5 = q02.f3291f;
        }
        q02.f3287b = i5;
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        C0202o c0202o;
        c1 c1Var = new c1(super.onSaveInstanceState());
        Z0 z02 = this.f1072M;
        if (z02 != null && (c0202o = z02.f3318b) != null) {
            c1Var.f3340c = c0202o.f3085a;
        }
        c1Var.f3341d = p();
        return c1Var;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f1062B = false;
        }
        if (!this.f1062B) {
            boolean onTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !onTouchEvent) {
                this.f1062B = true;
            }
        }
        if (actionMasked == 1 || actionMasked == 3) {
            this.f1062B = false;
        }
        return true;
    }

    public final boolean p() {
        C0268k c0268k;
        ActionMenuView actionMenuView = this.f1080a;
        return (actionMenuView == null || (c0268k = actionMenuView.f1040t) == null || !c0268k.i()) ? false : true;
    }

    public final int q(View view, int i, int i2, int[] iArr) {
        a1 a1Var = (a1) view.getLayoutParams();
        int i3 = ((ViewGroup.MarginLayoutParams) a1Var).leftMargin - iArr[0];
        int max = Math.max(0, i3) + i;
        iArr[0] = Math.max(0, -i3);
        int j2 = j(view, i2);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(max, j2, max + measuredWidth, view.getMeasuredHeight() + j2);
        return measuredWidth + ((ViewGroup.MarginLayoutParams) a1Var).rightMargin + max;
    }

    public final int r(View view, int i, int i2, int[] iArr) {
        a1 a1Var = (a1) view.getLayoutParams();
        int i3 = ((ViewGroup.MarginLayoutParams) a1Var).rightMargin - iArr[1];
        int max = i - Math.max(0, i3);
        iArr[1] = Math.max(0, -i3);
        int j2 = j(view, i2);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(max - measuredWidth, j2, max, view.getMeasuredHeight() + j2);
        return max - (measuredWidth + ((ViewGroup.MarginLayoutParams) a1Var).leftMargin);
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

    public void setBackInvokedCallbackEnabled(boolean z2) {
        if (this.f1078S != z2) {
            this.f1078S = z2;
            w();
        }
    }

    public void setCollapseContentDescription(int i) {
        setCollapseContentDescription(i != 0 ? getContext().getText(i) : null);
    }

    public void setCollapseIcon(int i) {
        setCollapseIcon(d.z(getContext(), i));
    }

    public void setCollapsible(boolean z2) {
        this.f1075P = z2;
        requestLayout();
    }

    public void setContentInsetEndWithActions(int i) {
        if (i < 0) {
            i = Integer.MIN_VALUE;
        }
        if (i != this.f1099v) {
            this.f1099v = i;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setContentInsetStartWithNavigation(int i) {
        if (i < 0) {
            i = Integer.MIN_VALUE;
        }
        if (i != this.f1098u) {
            this.f1098u = i;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setLogo(int i) {
        setLogo(d.z(getContext(), i));
    }

    public void setLogoDescription(int i) {
        setLogoDescription(getContext().getText(i));
    }

    public void setNavigationContentDescription(int i) {
        setNavigationContentDescription(i != 0 ? getContext().getText(i) : null);
    }

    public void setNavigationIcon(int i) {
        setNavigationIcon(d.z(getContext(), i));
    }

    public void setNavigationOnClickListener(View.OnClickListener onClickListener) {
        g();
        this.f1083d.setOnClickListener(onClickListener);
    }

    public void setOnMenuItemClickListener(b1 b1Var) {
        this.f1068I = b1Var;
    }

    public void setOverflowIcon(Drawable drawable) {
        e();
        this.f1080a.setOverflowIcon(drawable);
    }

    public void setPopupTheme(int i) {
        if (this.f1088k != i) {
            this.f1088k = i;
            if (i == 0) {
                this.f1087j = getContext();
            } else {
                this.f1087j = new ContextThemeWrapper(getContext(), i);
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
        this.f1096s = i;
        requestLayout();
    }

    public void setTitleMarginEnd(int i) {
        this.f1094q = i;
        requestLayout();
    }

    public void setTitleMarginStart(int i) {
        this.f1093p = i;
        requestLayout();
    }

    public void setTitleMarginTop(int i) {
        this.f1095r = i;
        requestLayout();
    }

    public void setTitleTextColor(int i) {
        setTitleTextColor(ColorStateList.valueOf(i));
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

    public final boolean v() {
        C0268k c0268k;
        ActionMenuView actionMenuView = this.f1080a;
        return (actionMenuView == null || (c0268k = actionMenuView.f1040t) == null || !c0268k.l()) ? false : true;
    }

    public final void w() {
        OnBackInvokedDispatcher onBackInvokedDispatcher;
        if (Build.VERSION.SDK_INT >= 33) {
            OnBackInvokedDispatcher a2 = Y0.a(this);
            Z0 z02 = this.f1072M;
            boolean z2 = (z02 == null || z02.f3318b == null || a2 == null || !isAttachedToWindow() || !this.f1078S) ? false : true;
            if (z2 && this.f1077R == null) {
                if (this.f1076Q == null) {
                    this.f1076Q = Y0.b(new W0(this, 0));
                }
                Y0.c(a2, this.f1076Q);
                this.f1077R = a2;
                return;
            }
            if (z2 || (onBackInvokedDispatcher = this.f1077R) == null) {
                return;
            }
            Y0.d(onBackInvokedDispatcher, this.f1076Q);
            this.f1077R = null;
        }
    }

    public Toolbar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, R.attr.toolbarStyle);
        this.f1100w = 8388627;
        this.f1064D = new ArrayList();
        this.f1065E = new ArrayList();
        this.F = new int[2];
        this.f1066G = new C0019o(new W0(this, 1));
        this.f1067H = new ArrayList();
        this.f1069J = new X0(this);
        this.f1079T = new B(12, this);
        Context context2 = getContext();
        int[] iArr = a.f2407w;
        r r2 = r.r(context2, attributeSet, iArr, R.attr.toolbarStyle);
        X.k(this, context, iArr, attributeSet, (TypedArray) r2.f811c, R.attr.toolbarStyle);
        TypedArray typedArray = (TypedArray) r2.f811c;
        this.f1089l = typedArray.getResourceId(28, 0);
        this.f1090m = typedArray.getResourceId(19, 0);
        this.f1100w = typedArray.getInteger(0, 8388627);
        this.f1091n = typedArray.getInteger(2, 48);
        int dimensionPixelOffset = typedArray.getDimensionPixelOffset(22, 0);
        dimensionPixelOffset = typedArray.hasValue(27) ? typedArray.getDimensionPixelOffset(27, dimensionPixelOffset) : dimensionPixelOffset;
        this.f1096s = dimensionPixelOffset;
        this.f1095r = dimensionPixelOffset;
        this.f1094q = dimensionPixelOffset;
        this.f1093p = dimensionPixelOffset;
        int dimensionPixelOffset2 = typedArray.getDimensionPixelOffset(25, -1);
        if (dimensionPixelOffset2 >= 0) {
            this.f1093p = dimensionPixelOffset2;
        }
        int dimensionPixelOffset3 = typedArray.getDimensionPixelOffset(24, -1);
        if (dimensionPixelOffset3 >= 0) {
            this.f1094q = dimensionPixelOffset3;
        }
        int dimensionPixelOffset4 = typedArray.getDimensionPixelOffset(26, -1);
        if (dimensionPixelOffset4 >= 0) {
            this.f1095r = dimensionPixelOffset4;
        }
        int dimensionPixelOffset5 = typedArray.getDimensionPixelOffset(23, -1);
        if (dimensionPixelOffset5 >= 0) {
            this.f1096s = dimensionPixelOffset5;
        }
        this.f1092o = typedArray.getDimensionPixelSize(13, -1);
        int dimensionPixelOffset6 = typedArray.getDimensionPixelOffset(9, Integer.MIN_VALUE);
        int dimensionPixelOffset7 = typedArray.getDimensionPixelOffset(5, Integer.MIN_VALUE);
        int dimensionPixelSize = typedArray.getDimensionPixelSize(7, 0);
        int dimensionPixelSize2 = typedArray.getDimensionPixelSize(8, 0);
        d();
        Q0 q02 = this.f1097t;
        q02.h = false;
        if (dimensionPixelSize != Integer.MIN_VALUE) {
            q02.f3290e = dimensionPixelSize;
            q02.f3286a = dimensionPixelSize;
        }
        if (dimensionPixelSize2 != Integer.MIN_VALUE) {
            q02.f3291f = dimensionPixelSize2;
            q02.f3287b = dimensionPixelSize2;
        }
        if (dimensionPixelOffset6 != Integer.MIN_VALUE || dimensionPixelOffset7 != Integer.MIN_VALUE) {
            q02.a(dimensionPixelOffset6, dimensionPixelOffset7);
        }
        this.f1098u = typedArray.getDimensionPixelOffset(10, Integer.MIN_VALUE);
        this.f1099v = typedArray.getDimensionPixelOffset(6, Integer.MIN_VALUE);
        this.f1085f = r2.h(4);
        this.f1086g = typedArray.getText(3);
        CharSequence text = typedArray.getText(21);
        if (!TextUtils.isEmpty(text)) {
            setTitle(text);
        }
        CharSequence text2 = typedArray.getText(18);
        if (!TextUtils.isEmpty(text2)) {
            setSubtitle(text2);
        }
        this.f1087j = getContext();
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
        a1Var.f3334a = 0;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a.f2388b);
        a1Var.f3334a = obtainStyledAttributes.getInt(0, 0);
        obtainStyledAttributes.recycle();
        a1Var.f3335b = 0;
        return a1Var;
    }

    public void setCollapseContentDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            c();
        }
        C0230A c0230a = this.h;
        if (c0230a != null) {
            c0230a.setContentDescription(charSequence);
        }
    }

    public void setCollapseIcon(Drawable drawable) {
        if (drawable != null) {
            c();
            this.h.setImageDrawable(drawable);
        } else {
            C0230A c0230a = this.h;
            if (c0230a != null) {
                c0230a.setImageDrawable(this.f1085f);
            }
        }
    }

    public void setLogo(Drawable drawable) {
        if (drawable != null) {
            if (this.f1084e == null) {
                this.f1084e = new C0231B(getContext(), null, 0);
            }
            if (!o(this.f1084e)) {
                b(this.f1084e, true);
            }
        } else {
            C0231B c0231b = this.f1084e;
            if (c0231b != null && o(c0231b)) {
                removeView(this.f1084e);
                this.f1065E.remove(this.f1084e);
            }
        }
        C0231B c0231b2 = this.f1084e;
        if (c0231b2 != null) {
            c0231b2.setImageDrawable(drawable);
        }
    }

    public void setLogoDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence) && this.f1084e == null) {
            this.f1084e = new C0231B(getContext(), null, 0);
        }
        C0231B c0231b = this.f1084e;
        if (c0231b != null) {
            c0231b.setContentDescription(charSequence);
        }
    }

    public void setNavigationContentDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            g();
        }
        C0230A c0230a = this.f1083d;
        if (c0230a != null) {
            c0230a.setContentDescription(charSequence);
            f1.a(this.f1083d, charSequence);
        }
    }

    public void setNavigationIcon(Drawable drawable) {
        if (drawable != null) {
            g();
            if (!o(this.f1083d)) {
                b(this.f1083d, true);
            }
        } else {
            C0230A c0230a = this.f1083d;
            if (c0230a != null && o(c0230a)) {
                removeView(this.f1083d);
                this.f1065E.remove(this.f1083d);
            }
        }
        C0230A c0230a2 = this.f1083d;
        if (c0230a2 != null) {
            c0230a2.setImageDrawable(drawable);
        }
    }

    public void setSubtitle(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            C0257e0 c0257e0 = this.f1082c;
            if (c0257e0 != null && o(c0257e0)) {
                removeView(this.f1082c);
                this.f1065E.remove(this.f1082c);
            }
        } else {
            if (this.f1082c == null) {
                Context context = getContext();
                C0257e0 c0257e02 = new C0257e0(context, null);
                this.f1082c = c0257e02;
                c0257e02.setSingleLine();
                this.f1082c.setEllipsize(TextUtils.TruncateAt.END);
                int i = this.f1090m;
                if (i != 0) {
                    this.f1082c.setTextAppearance(context, i);
                }
                ColorStateList colorStateList = this.f1061A;
                if (colorStateList != null) {
                    this.f1082c.setTextColor(colorStateList);
                }
            }
            if (!o(this.f1082c)) {
                b(this.f1082c, true);
            }
        }
        C0257e0 c0257e03 = this.f1082c;
        if (c0257e03 != null) {
            c0257e03.setText(charSequence);
        }
        this.f1102y = charSequence;
    }

    public void setSubtitleTextColor(ColorStateList colorStateList) {
        this.f1061A = colorStateList;
        C0257e0 c0257e0 = this.f1082c;
        if (c0257e0 != null) {
            c0257e0.setTextColor(colorStateList);
        }
    }

    public void setTitle(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            C0257e0 c0257e0 = this.f1081b;
            if (c0257e0 != null && o(c0257e0)) {
                removeView(this.f1081b);
                this.f1065E.remove(this.f1081b);
            }
        } else {
            if (this.f1081b == null) {
                Context context = getContext();
                C0257e0 c0257e02 = new C0257e0(context, null);
                this.f1081b = c0257e02;
                c0257e02.setSingleLine();
                this.f1081b.setEllipsize(TextUtils.TruncateAt.END);
                int i = this.f1089l;
                if (i != 0) {
                    this.f1081b.setTextAppearance(context, i);
                }
                ColorStateList colorStateList = this.f1103z;
                if (colorStateList != null) {
                    this.f1081b.setTextColor(colorStateList);
                }
            }
            if (!o(this.f1081b)) {
                b(this.f1081b, true);
            }
        }
        C0257e0 c0257e03 = this.f1081b;
        if (c0257e03 != null) {
            c0257e03.setText(charSequence);
        }
        this.f1101x = charSequence;
    }

    public void setTitleTextColor(ColorStateList colorStateList) {
        this.f1103z = colorStateList;
        C0257e0 c0257e0 = this.f1081b;
        if (c0257e0 != null) {
            c0257e0.setTextColor(colorStateList);
        }
    }
}
