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
import com.google.android.material.datepicker.j;
import com.luckyarcade.spinthrow.R;
import f.a;
import g.C0148I;
import j.i;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;
import k.C0204o;
import k.MenuC0202m;
import l.C0232A;
import l.C0257d0;
import l.C0270k;
import l.C0300z;
import l.InterfaceC0275m0;
import l.P0;
import l.V0;
import l.W0;
import l.X0;
import l.Y0;
import l.Z0;
import l.a1;
import l.b1;
import l.d1;
import l.e1;
import l.i1;
import q1.d;

/* loaded from: classes.dex */
public class Toolbar extends ViewGroup {

    /* renamed from: A, reason: collision with root package name */
    public ColorStateList f1062A;

    /* renamed from: B, reason: collision with root package name */
    public boolean f1063B;

    /* renamed from: C, reason: collision with root package name */
    public boolean f1064C;

    /* renamed from: D, reason: collision with root package name */
    public final ArrayList f1065D;

    /* renamed from: E, reason: collision with root package name */
    public final ArrayList f1066E;
    public final int[] F;

    /* renamed from: G, reason: collision with root package name */
    public final C0019o f1067G;

    /* renamed from: H, reason: collision with root package name */
    public ArrayList f1068H;

    /* renamed from: I, reason: collision with root package name */
    public a1 f1069I;

    /* renamed from: J, reason: collision with root package name */
    public final W0 f1070J;

    /* renamed from: K, reason: collision with root package name */
    public d1 f1071K;

    /* renamed from: L, reason: collision with root package name */
    public C0270k f1072L;

    /* renamed from: M, reason: collision with root package name */
    public Y0 f1073M;

    /* renamed from: N, reason: collision with root package name */
    public g f1074N;

    /* renamed from: O, reason: collision with root package name */
    public C0148I f1075O;

    /* renamed from: P, reason: collision with root package name */
    public boolean f1076P;

    /* renamed from: Q, reason: collision with root package name */
    public OnBackInvokedCallback f1077Q;

    /* renamed from: R, reason: collision with root package name */
    public OnBackInvokedDispatcher f1078R;

    /* renamed from: S, reason: collision with root package name */
    public boolean f1079S;

    /* renamed from: T, reason: collision with root package name */
    public final B f1080T;

    /* renamed from: a, reason: collision with root package name */
    public ActionMenuView f1081a;

    /* renamed from: b, reason: collision with root package name */
    public C0257d0 f1082b;

    /* renamed from: c, reason: collision with root package name */
    public C0257d0 f1083c;

    /* renamed from: d, reason: collision with root package name */
    public C0300z f1084d;

    /* renamed from: e, reason: collision with root package name */
    public C0232A f1085e;

    /* renamed from: f, reason: collision with root package name */
    public final Drawable f1086f;

    /* renamed from: g, reason: collision with root package name */
    public final CharSequence f1087g;
    public C0300z h;
    public View i;

    /* renamed from: j, reason: collision with root package name */
    public Context f1088j;

    /* renamed from: k, reason: collision with root package name */
    public int f1089k;

    /* renamed from: l, reason: collision with root package name */
    public int f1090l;

    /* renamed from: m, reason: collision with root package name */
    public int f1091m;

    /* renamed from: n, reason: collision with root package name */
    public final int f1092n;

    /* renamed from: o, reason: collision with root package name */
    public final int f1093o;

    /* renamed from: p, reason: collision with root package name */
    public int f1094p;

    /* renamed from: q, reason: collision with root package name */
    public int f1095q;

    /* renamed from: r, reason: collision with root package name */
    public int f1096r;

    /* renamed from: s, reason: collision with root package name */
    public int f1097s;

    /* renamed from: t, reason: collision with root package name */
    public P0 f1098t;

    /* renamed from: u, reason: collision with root package name */
    public int f1099u;

    /* renamed from: v, reason: collision with root package name */
    public int f1100v;

    /* renamed from: w, reason: collision with root package name */
    public final int f1101w;

    /* renamed from: x, reason: collision with root package name */
    public CharSequence f1102x;

    /* renamed from: y, reason: collision with root package name */
    public CharSequence f1103y;

    /* renamed from: z, reason: collision with root package name */
    public ColorStateList f1104z;

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

    public static Z0 h() {
        Z0 z02 = new Z0(-2, -2);
        z02.f3332b = 0;
        z02.f3331a = 8388627;
        return z02;
    }

    public static Z0 i(ViewGroup.LayoutParams layoutParams) {
        boolean z2 = layoutParams instanceof Z0;
        if (z2) {
            Z0 z02 = (Z0) layoutParams;
            Z0 z03 = new Z0(z02);
            z03.f3332b = 0;
            z03.f3332b = z02.f3332b;
            return z03;
        }
        if (z2) {
            Z0 z04 = new Z0((Z0) layoutParams);
            z04.f3332b = 0;
            return z04;
        }
        if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
            Z0 z05 = new Z0(layoutParams);
            z05.f3332b = 0;
            return z05;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        Z0 z06 = new Z0(marginLayoutParams);
        z06.f3332b = 0;
        ((ViewGroup.MarginLayoutParams) z06).leftMargin = marginLayoutParams.leftMargin;
        ((ViewGroup.MarginLayoutParams) z06).topMargin = marginLayoutParams.topMargin;
        ((ViewGroup.MarginLayoutParams) z06).rightMargin = marginLayoutParams.rightMargin;
        ((ViewGroup.MarginLayoutParams) z06).bottomMargin = marginLayoutParams.bottomMargin;
        return z06;
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
                Z0 z02 = (Z0) childAt.getLayoutParams();
                if (z02.f3332b == 0 && u(childAt)) {
                    int i3 = z02.f3331a;
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
            Z0 z03 = (Z0) childAt2.getLayoutParams();
            if (z03.f3332b == 0 && u(childAt2)) {
                int i5 = z03.f3331a;
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
        Z0 h = layoutParams == null ? h() : !checkLayoutParams(layoutParams) ? i(layoutParams) : (Z0) layoutParams;
        h.f3332b = 1;
        if (!z2 || this.i == null) {
            addView(view, h);
        } else {
            view.setLayoutParams(h);
            this.f1066E.add(view);
        }
    }

    public final void c() {
        if (this.h == null) {
            C0300z c0300z = new C0300z(getContext(), null, R.attr.toolbarNavigationButtonStyle);
            this.h = c0300z;
            c0300z.setImageDrawable(this.f1086f);
            this.h.setContentDescription(this.f1087g);
            Z0 h = h();
            h.f3331a = (this.f1092n & 112) | 8388611;
            h.f3332b = 2;
            this.h.setLayoutParams(h);
            this.h.setOnClickListener(new j(3, this));
        }
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return super.checkLayoutParams(layoutParams) && (layoutParams instanceof Z0);
    }

    public final void d() {
        if (this.f1098t == null) {
            P0 p02 = new P0();
            p02.f3286a = 0;
            p02.f3287b = 0;
            p02.f3288c = Integer.MIN_VALUE;
            p02.f3289d = Integer.MIN_VALUE;
            p02.f3290e = 0;
            p02.f3291f = 0;
            p02.f3292g = false;
            p02.h = false;
            this.f1098t = p02;
        }
    }

    public final void e() {
        f();
        ActionMenuView actionMenuView = this.f1081a;
        if (actionMenuView.f1037p == null) {
            MenuC0202m menuC0202m = (MenuC0202m) actionMenuView.getMenu();
            if (this.f1073M == null) {
                this.f1073M = new Y0(this);
            }
            this.f1081a.setExpandedActionViewsExclusive(true);
            menuC0202m.b(this.f1073M, this.f1088j);
            w();
        }
    }

    public final void f() {
        if (this.f1081a == null) {
            ActionMenuView actionMenuView = new ActionMenuView(getContext(), null);
            this.f1081a = actionMenuView;
            actionMenuView.setPopupTheme(this.f1089k);
            this.f1081a.setOnMenuItemClickListener(this.f1070J);
            ActionMenuView actionMenuView2 = this.f1081a;
            g gVar = this.f1074N;
            W0 w02 = new W0(this);
            actionMenuView2.f1042u = gVar;
            actionMenuView2.f1043v = w02;
            Z0 h = h();
            h.f3331a = (this.f1092n & 112) | 8388613;
            this.f1081a.setLayoutParams(h);
            b(this.f1081a, false);
        }
    }

    public final void g() {
        if (this.f1084d == null) {
            this.f1084d = new C0300z(getContext(), null, R.attr.toolbarNavigationButtonStyle);
            Z0 h = h();
            h.f3331a = (this.f1092n & 112) | 8388611;
            this.f1084d.setLayoutParams(h);
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
        C0300z c0300z = this.h;
        if (c0300z != null) {
            return c0300z.getContentDescription();
        }
        return null;
    }

    public Drawable getCollapseIcon() {
        C0300z c0300z = this.h;
        if (c0300z != null) {
            return c0300z.getDrawable();
        }
        return null;
    }

    public int getContentInsetEnd() {
        P0 p02 = this.f1098t;
        if (p02 != null) {
            return p02.f3292g ? p02.f3286a : p02.f3287b;
        }
        return 0;
    }

    public int getContentInsetEndWithActions() {
        int i = this.f1100v;
        return i != Integer.MIN_VALUE ? i : getContentInsetEnd();
    }

    public int getContentInsetLeft() {
        P0 p02 = this.f1098t;
        if (p02 != null) {
            return p02.f3286a;
        }
        return 0;
    }

    public int getContentInsetRight() {
        P0 p02 = this.f1098t;
        if (p02 != null) {
            return p02.f3287b;
        }
        return 0;
    }

    public int getContentInsetStart() {
        P0 p02 = this.f1098t;
        if (p02 != null) {
            return p02.f3292g ? p02.f3287b : p02.f3286a;
        }
        return 0;
    }

    public int getContentInsetStartWithNavigation() {
        int i = this.f1099u;
        return i != Integer.MIN_VALUE ? i : getContentInsetStart();
    }

    public int getCurrentContentInsetEnd() {
        MenuC0202m menuC0202m;
        ActionMenuView actionMenuView = this.f1081a;
        return (actionMenuView == null || (menuC0202m = actionMenuView.f1037p) == null || !menuC0202m.hasVisibleItems()) ? getContentInsetEnd() : Math.max(getContentInsetEnd(), Math.max(this.f1100v, 0));
    }

    public int getCurrentContentInsetLeft() {
        return getLayoutDirection() == 1 ? getCurrentContentInsetEnd() : getCurrentContentInsetStart();
    }

    public int getCurrentContentInsetRight() {
        return getLayoutDirection() == 1 ? getCurrentContentInsetStart() : getCurrentContentInsetEnd();
    }

    public int getCurrentContentInsetStart() {
        return getNavigationIcon() != null ? Math.max(getContentInsetStart(), Math.max(this.f1099u, 0)) : getContentInsetStart();
    }

    public Drawable getLogo() {
        C0232A c0232a = this.f1085e;
        if (c0232a != null) {
            return c0232a.getDrawable();
        }
        return null;
    }

    public CharSequence getLogoDescription() {
        C0232A c0232a = this.f1085e;
        if (c0232a != null) {
            return c0232a.getContentDescription();
        }
        return null;
    }

    public Menu getMenu() {
        e();
        return this.f1081a.getMenu();
    }

    public View getNavButtonView() {
        return this.f1084d;
    }

    public CharSequence getNavigationContentDescription() {
        C0300z c0300z = this.f1084d;
        if (c0300z != null) {
            return c0300z.getContentDescription();
        }
        return null;
    }

    public Drawable getNavigationIcon() {
        C0300z c0300z = this.f1084d;
        if (c0300z != null) {
            return c0300z.getDrawable();
        }
        return null;
    }

    public C0270k getOuterActionMenuPresenter() {
        return this.f1072L;
    }

    public Drawable getOverflowIcon() {
        e();
        return this.f1081a.getOverflowIcon();
    }

    public Context getPopupContext() {
        return this.f1088j;
    }

    public int getPopupTheme() {
        return this.f1089k;
    }

    public CharSequence getSubtitle() {
        return this.f1103y;
    }

    public final TextView getSubtitleTextView() {
        return this.f1083c;
    }

    public CharSequence getTitle() {
        return this.f1102x;
    }

    public int getTitleMarginBottom() {
        return this.f1097s;
    }

    public int getTitleMarginEnd() {
        return this.f1095q;
    }

    public int getTitleMarginStart() {
        return this.f1094p;
    }

    public int getTitleMarginTop() {
        return this.f1096r;
    }

    public final TextView getTitleTextView() {
        return this.f1082b;
    }

    public InterfaceC0275m0 getWrapper() {
        if (this.f1071K == null) {
            this.f1071K = new d1(this, true);
        }
        return this.f1071K;
    }

    public final int j(View view, int i) {
        Z0 z02 = (Z0) view.getLayoutParams();
        int measuredHeight = view.getMeasuredHeight();
        int i2 = i > 0 ? (measuredHeight - i) / 2 : 0;
        int i3 = z02.f3331a & 112;
        if (i3 != 16 && i3 != 48 && i3 != 80) {
            i3 = this.f1101w & 112;
        }
        if (i3 == 48) {
            return getPaddingTop() - i2;
        }
        if (i3 == 80) {
            return (((getHeight() - getPaddingBottom()) - measuredHeight) - ((ViewGroup.MarginLayoutParams) z02).bottomMargin) - i2;
        }
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int height = getHeight();
        int i4 = (((height - paddingTop) - paddingBottom) - measuredHeight) / 2;
        int i5 = ((ViewGroup.MarginLayoutParams) z02).topMargin;
        if (i4 < i5) {
            i4 = i5;
        } else {
            int i6 = (((height - paddingBottom) - measuredHeight) - i4) - paddingTop;
            int i7 = ((ViewGroup.MarginLayoutParams) z02).bottomMargin;
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
        Iterator it = this.f1068H.iterator();
        while (it.hasNext()) {
            getMenu().removeItem(((MenuItem) it.next()).getItemId());
        }
        getMenu();
        ArrayList<MenuItem> currentMenuItems = getCurrentMenuItems();
        getMenuInflater();
        Iterator it2 = this.f1067G.f481b.iterator();
        while (it2.hasNext()) {
            ((D) ((InterfaceC0021q) it2.next())).f1199a.j();
        }
        ArrayList<MenuItem> currentMenuItems2 = getCurrentMenuItems();
        currentMenuItems2.removeAll(currentMenuItems);
        this.f1068H = currentMenuItems2;
    }

    public final boolean o(View view) {
        return view.getParent() == this || this.f1066E.contains(view);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        w();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeCallbacks(this.f1080T);
        w();
    }

    @Override // android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.f1064C = false;
        }
        if (!this.f1064C) {
            boolean onHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !onHoverEvent) {
                this.f1064C = true;
            }
        }
        if (actionMasked == 10 || actionMasked == 3) {
            this.f1064C = false;
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
        WeakHashMap weakHashMap = X.f419a;
        int minimumHeight = getMinimumHeight();
        int min = minimumHeight >= 0 ? Math.min(minimumHeight, i4 - i2) : 0;
        if (!u(this.f1084d)) {
            i5 = paddingLeft;
        } else {
            if (z4) {
                i6 = r(this.f1084d, i24, min, iArr);
                i5 = paddingLeft;
                if (u(this.h)) {
                    if (z4) {
                        i6 = r(this.h, i6, min, iArr);
                    } else {
                        i5 = q(this.h, i5, min, iArr);
                    }
                }
                if (u(this.f1081a)) {
                    if (z4) {
                        i5 = q(this.f1081a, i5, min, iArr);
                    } else {
                        i6 = r(this.f1081a, i6, min, iArr);
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
                if (u(this.f1085e)) {
                    if (z4) {
                        min2 = r(this.f1085e, min2, min, iArr);
                    } else {
                        max = q(this.f1085e, max, min, iArr);
                    }
                }
                u2 = u(this.f1082b);
                u3 = u(this.f1083c);
                if (u2) {
                    i7 = paddingRight;
                    i8 = 0;
                } else {
                    Z0 z02 = (Z0) this.f1082b.getLayoutParams();
                    i7 = paddingRight;
                    i8 = ((ViewGroup.MarginLayoutParams) z02).bottomMargin + this.f1082b.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) z02).topMargin;
                }
                if (u3) {
                    i9 = width;
                } else {
                    Z0 z03 = (Z0) this.f1083c.getLayoutParams();
                    i9 = width;
                    i8 += this.f1083c.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) z03).topMargin + ((ViewGroup.MarginLayoutParams) z03).bottomMargin;
                }
                if (!u2 || u3) {
                    C0257d0 c0257d0 = !u2 ? this.f1082b : this.f1083c;
                    C0257d0 c0257d02 = !u3 ? this.f1083c : this.f1082b;
                    Z0 z04 = (Z0) c0257d0.getLayoutParams();
                    Z0 z05 = (Z0) c0257d02.getLayoutParams();
                    if ((u2 || this.f1082b.getMeasuredWidth() <= 0) && (!u3 || this.f1083c.getMeasuredWidth() <= 0)) {
                        i10 = paddingLeft;
                        z3 = false;
                    } else {
                        i10 = paddingLeft;
                        z3 = true;
                    }
                    i11 = this.f1101w & 112;
                    i12 = min;
                    if (i11 != 48) {
                        i13 = max;
                        paddingTop = getPaddingTop() + ((ViewGroup.MarginLayoutParams) z04).topMargin + this.f1096r;
                    } else if (i11 != 80) {
                        int i25 = (((height - paddingTop2) - paddingBottom) - i8) / 2;
                        i13 = max;
                        int i26 = ((ViewGroup.MarginLayoutParams) z04).topMargin + this.f1096r;
                        if (i25 < i26) {
                            i25 = i26;
                        } else {
                            int i27 = (((height - paddingBottom) - i8) - i25) - paddingTop2;
                            int i28 = ((ViewGroup.MarginLayoutParams) z04).bottomMargin;
                            int i29 = this.f1097s;
                            if (i27 < i28 + i29) {
                                i25 = Math.max(0, i25 - ((((ViewGroup.MarginLayoutParams) z05).bottomMargin + i29) - i27));
                            }
                        }
                        paddingTop = paddingTop2 + i25;
                    } else {
                        i13 = max;
                        paddingTop = (((height - paddingBottom) - ((ViewGroup.MarginLayoutParams) z05).bottomMargin) - this.f1097s) - i8;
                    }
                    if (z4) {
                        int i30 = (z3 ? this.f1094p : 0) - iArr[0];
                        max = Math.max(0, i30) + i13;
                        iArr[0] = Math.max(0, -i30);
                        if (u2) {
                            Z0 z06 = (Z0) this.f1082b.getLayoutParams();
                            int measuredWidth = this.f1082b.getMeasuredWidth() + max;
                            int measuredHeight = this.f1082b.getMeasuredHeight() + paddingTop;
                            this.f1082b.layout(max, paddingTop, measuredWidth, measuredHeight);
                            i14 = measuredWidth + this.f1095q;
                            paddingTop = measuredHeight + ((ViewGroup.MarginLayoutParams) z06).bottomMargin;
                        } else {
                            i14 = max;
                        }
                        if (u3) {
                            int i31 = paddingTop + ((ViewGroup.MarginLayoutParams) ((Z0) this.f1083c.getLayoutParams())).topMargin;
                            int measuredWidth2 = this.f1083c.getMeasuredWidth() + max;
                            this.f1083c.layout(max, i31, measuredWidth2, this.f1083c.getMeasuredHeight() + i31);
                            i15 = measuredWidth2 + this.f1095q;
                        } else {
                            i15 = max;
                        }
                        if (z3) {
                            max = Math.max(i14, i15);
                        }
                    } else {
                        int i32 = (z3 ? this.f1094p : 0) - iArr[1];
                        min2 -= Math.max(0, i32);
                        iArr[1] = Math.max(0, -i32);
                        if (u2) {
                            Z0 z07 = (Z0) this.f1082b.getLayoutParams();
                            int measuredWidth3 = min2 - this.f1082b.getMeasuredWidth();
                            int measuredHeight2 = this.f1082b.getMeasuredHeight() + paddingTop;
                            this.f1082b.layout(measuredWidth3, paddingTop, min2, measuredHeight2);
                            i16 = measuredWidth3 - this.f1095q;
                            paddingTop = measuredHeight2 + ((ViewGroup.MarginLayoutParams) z07).bottomMargin;
                        } else {
                            i16 = min2;
                        }
                        if (u3) {
                            int i33 = paddingTop + ((ViewGroup.MarginLayoutParams) ((Z0) this.f1083c.getLayoutParams())).topMargin;
                            this.f1083c.layout(min2 - this.f1083c.getMeasuredWidth(), i33, min2, this.f1083c.getMeasuredHeight() + i33);
                            i17 = min2 - this.f1095q;
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
                ArrayList arrayList = this.f1065D;
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
                    Z0 z08 = (Z0) view.getLayoutParams();
                    int i40 = ((ViewGroup.MarginLayoutParams) z08).leftMargin - i38;
                    int i41 = ((ViewGroup.MarginLayoutParams) z08).rightMargin - i37;
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
            i5 = q(this.f1084d, paddingLeft, min, iArr);
        }
        i6 = i24;
        if (u(this.h)) {
        }
        if (u(this.f1081a)) {
        }
        int currentContentInsetLeft2 = getCurrentContentInsetLeft();
        int currentContentInsetRight2 = getCurrentContentInsetRight();
        iArr[0] = Math.max(0, currentContentInsetLeft2 - i5);
        iArr[1] = Math.max(0, currentContentInsetRight2 - (i24 - i6));
        int max6 = Math.max(i5, currentContentInsetLeft2);
        int min22 = Math.min(i6, i24 - currentContentInsetRight2);
        if (u(this.i)) {
        }
        if (u(this.f1085e)) {
        }
        u2 = u(this.f1082b);
        u3 = u(this.f1083c);
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
        Z0 z042 = (Z0) c0257d0.getLayoutParams();
        Z0 z052 = (Z0) c0257d02.getLayoutParams();
        if (u2) {
        }
        i10 = paddingLeft;
        z3 = false;
        i11 = this.f1101w & 112;
        i12 = min;
        if (i11 != 48) {
        }
        if (z4) {
        }
        ArrayList arrayList2 = this.f1065D;
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
        boolean z2 = i1.f3382a;
        int i10 = 0;
        if (getLayoutDirection() == 1) {
            c3 = 1;
            c2 = 0;
        } else {
            c2 = 1;
            c3 = 0;
        }
        if (u(this.f1084d)) {
            t(this.f1084d, i, 0, i2, this.f1093o);
            i3 = k(this.f1084d) + this.f1084d.getMeasuredWidth();
            i4 = Math.max(0, l(this.f1084d) + this.f1084d.getMeasuredHeight());
            i5 = View.combineMeasuredStates(0, this.f1084d.getMeasuredState());
        } else {
            i3 = 0;
            i4 = 0;
            i5 = 0;
        }
        if (u(this.h)) {
            t(this.h, i, 0, i2, this.f1093o);
            i3 = k(this.h) + this.h.getMeasuredWidth();
            i4 = Math.max(i4, l(this.h) + this.h.getMeasuredHeight());
            i5 = View.combineMeasuredStates(i5, this.h.getMeasuredState());
        }
        int currentContentInsetStart = getCurrentContentInsetStart();
        int max = Math.max(currentContentInsetStart, i3);
        int max2 = Math.max(0, currentContentInsetStart - i3);
        int[] iArr = this.F;
        iArr[c3] = max2;
        if (u(this.f1081a)) {
            t(this.f1081a, i, max, i2, this.f1093o);
            i6 = k(this.f1081a) + this.f1081a.getMeasuredWidth();
            i4 = Math.max(i4, l(this.f1081a) + this.f1081a.getMeasuredHeight());
            i5 = View.combineMeasuredStates(i5, this.f1081a.getMeasuredState());
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
        if (u(this.f1085e)) {
            max3 += s(this.f1085e, i, max3, i2, 0, iArr);
            i4 = Math.max(i4, l(this.f1085e) + this.f1085e.getMeasuredHeight());
            i5 = View.combineMeasuredStates(i5, this.f1085e.getMeasuredState());
        }
        int childCount = getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = getChildAt(i11);
            if (((Z0) childAt.getLayoutParams()).f3332b == 0 && u(childAt)) {
                max3 += s(childAt, i, max3, i2, 0, iArr);
                i4 = Math.max(i4, l(childAt) + childAt.getMeasuredHeight());
                i5 = View.combineMeasuredStates(i5, childAt.getMeasuredState());
            }
        }
        int i12 = this.f1096r + this.f1097s;
        int i13 = this.f1094p + this.f1095q;
        if (u(this.f1082b)) {
            s(this.f1082b, i, max3 + i13, i2, i12, iArr);
            int k2 = k(this.f1082b) + this.f1082b.getMeasuredWidth();
            i7 = l(this.f1082b) + this.f1082b.getMeasuredHeight();
            i8 = View.combineMeasuredStates(i5, this.f1082b.getMeasuredState());
            i9 = k2;
        } else {
            i7 = 0;
            i8 = i5;
            i9 = 0;
        }
        if (u(this.f1083c)) {
            i9 = Math.max(i9, s(this.f1083c, i, max3 + i13, i2, i7 + i12, iArr));
            i7 = l(this.f1083c) + this.f1083c.getMeasuredHeight() + i7;
            i8 = View.combineMeasuredStates(i8, this.f1083c.getMeasuredState());
        }
        int max4 = Math.max(i4, i7);
        int paddingRight = getPaddingRight() + getPaddingLeft();
        int paddingBottom = getPaddingBottom() + getPaddingTop() + max4;
        int resolveSizeAndState = View.resolveSizeAndState(Math.max(paddingRight + max3 + i9, getSuggestedMinimumWidth()), i, (-16777216) & i8);
        int resolveSizeAndState2 = View.resolveSizeAndState(Math.max(paddingBottom, getSuggestedMinimumHeight()), i2, i8 << 16);
        if (this.f1076P) {
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
        if (!(parcelable instanceof b1)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        b1 b1Var = (b1) parcelable;
        super.onRestoreInstanceState(b1Var.f736a);
        ActionMenuView actionMenuView = this.f1081a;
        MenuC0202m menuC0202m = actionMenuView != null ? actionMenuView.f1037p : null;
        int i = b1Var.f3338c;
        if (i != 0 && this.f1073M != null && menuC0202m != null && (findItem = menuC0202m.findItem(i)) != null) {
            findItem.expandActionView();
        }
        if (b1Var.f3339d) {
            B b2 = this.f1080T;
            removeCallbacks(b2);
            post(b2);
        }
    }

    @Override // android.view.View
    public final void onRtlPropertiesChanged(int i) {
        super.onRtlPropertiesChanged(i);
        d();
        P0 p02 = this.f1098t;
        boolean z2 = i == 1;
        if (z2 == p02.f3292g) {
            return;
        }
        p02.f3292g = z2;
        if (!p02.h) {
            p02.f3286a = p02.f3290e;
            p02.f3287b = p02.f3291f;
            return;
        }
        if (z2) {
            int i2 = p02.f3289d;
            if (i2 == Integer.MIN_VALUE) {
                i2 = p02.f3290e;
            }
            p02.f3286a = i2;
            int i3 = p02.f3288c;
            if (i3 == Integer.MIN_VALUE) {
                i3 = p02.f3291f;
            }
            p02.f3287b = i3;
            return;
        }
        int i4 = p02.f3288c;
        if (i4 == Integer.MIN_VALUE) {
            i4 = p02.f3290e;
        }
        p02.f3286a = i4;
        int i5 = p02.f3289d;
        if (i5 == Integer.MIN_VALUE) {
            i5 = p02.f3291f;
        }
        p02.f3287b = i5;
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        C0204o c0204o;
        b1 b1Var = new b1(super.onSaveInstanceState());
        Y0 y02 = this.f1073M;
        if (y02 != null && (c0204o = y02.f3318b) != null) {
            b1Var.f3338c = c0204o.f3089a;
        }
        b1Var.f3339d = p();
        return b1Var;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f1063B = false;
        }
        if (!this.f1063B) {
            boolean onTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !onTouchEvent) {
                this.f1063B = true;
            }
        }
        if (actionMasked == 1 || actionMasked == 3) {
            this.f1063B = false;
        }
        return true;
    }

    public final boolean p() {
        C0270k c0270k;
        ActionMenuView actionMenuView = this.f1081a;
        return (actionMenuView == null || (c0270k = actionMenuView.f1041t) == null || !c0270k.i()) ? false : true;
    }

    public final int q(View view, int i, int i2, int[] iArr) {
        Z0 z02 = (Z0) view.getLayoutParams();
        int i3 = ((ViewGroup.MarginLayoutParams) z02).leftMargin - iArr[0];
        int max = Math.max(0, i3) + i;
        iArr[0] = Math.max(0, -i3);
        int j2 = j(view, i2);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(max, j2, max + measuredWidth, view.getMeasuredHeight() + j2);
        return measuredWidth + ((ViewGroup.MarginLayoutParams) z02).rightMargin + max;
    }

    public final int r(View view, int i, int i2, int[] iArr) {
        Z0 z02 = (Z0) view.getLayoutParams();
        int i3 = ((ViewGroup.MarginLayoutParams) z02).rightMargin - iArr[1];
        int max = i - Math.max(0, i3);
        iArr[1] = Math.max(0, -i3);
        int j2 = j(view, i2);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(max - measuredWidth, j2, max, view.getMeasuredHeight() + j2);
        return max - (measuredWidth + ((ViewGroup.MarginLayoutParams) z02).leftMargin);
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
        if (this.f1079S != z2) {
            this.f1079S = z2;
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
        this.f1076P = z2;
        requestLayout();
    }

    public void setContentInsetEndWithActions(int i) {
        if (i < 0) {
            i = Integer.MIN_VALUE;
        }
        if (i != this.f1100v) {
            this.f1100v = i;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setContentInsetStartWithNavigation(int i) {
        if (i < 0) {
            i = Integer.MIN_VALUE;
        }
        if (i != this.f1099u) {
            this.f1099u = i;
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
        this.f1084d.setOnClickListener(onClickListener);
    }

    public void setOnMenuItemClickListener(a1 a1Var) {
        this.f1069I = a1Var;
    }

    public void setOverflowIcon(Drawable drawable) {
        e();
        this.f1081a.setOverflowIcon(drawable);
    }

    public void setPopupTheme(int i) {
        if (this.f1089k != i) {
            this.f1089k = i;
            if (i == 0) {
                this.f1088j = getContext();
            } else {
                this.f1088j = new ContextThemeWrapper(getContext(), i);
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
        this.f1097s = i;
        requestLayout();
    }

    public void setTitleMarginEnd(int i) {
        this.f1095q = i;
        requestLayout();
    }

    public void setTitleMarginStart(int i) {
        this.f1094p = i;
        requestLayout();
    }

    public void setTitleMarginTop(int i) {
        this.f1096r = i;
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
        C0270k c0270k;
        ActionMenuView actionMenuView = this.f1081a;
        return (actionMenuView == null || (c0270k = actionMenuView.f1041t) == null || !c0270k.l()) ? false : true;
    }

    public final void w() {
        OnBackInvokedDispatcher onBackInvokedDispatcher;
        if (Build.VERSION.SDK_INT >= 33) {
            OnBackInvokedDispatcher a2 = X0.a(this);
            Y0 y02 = this.f1073M;
            boolean z2 = (y02 == null || y02.f3318b == null || a2 == null || !isAttachedToWindow() || !this.f1079S) ? false : true;
            if (z2 && this.f1078R == null) {
                if (this.f1077Q == null) {
                    this.f1077Q = X0.b(new V0(this, 0));
                }
                X0.c(a2, this.f1077Q);
                this.f1078R = a2;
                return;
            }
            if (z2 || (onBackInvokedDispatcher = this.f1078R) == null) {
                return;
            }
            X0.d(onBackInvokedDispatcher, this.f1077Q);
            this.f1078R = null;
        }
    }

    public Toolbar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, R.attr.toolbarStyle);
        this.f1101w = 8388627;
        this.f1065D = new ArrayList();
        this.f1066E = new ArrayList();
        this.F = new int[2];
        this.f1067G = new C0019o(new V0(this, 1));
        this.f1068H = new ArrayList();
        this.f1070J = new W0(this);
        this.f1080T = new B(12, this);
        Context context2 = getContext();
        int[] iArr = a.f2411w;
        r r2 = r.r(context2, attributeSet, iArr, R.attr.toolbarStyle);
        X.k(this, context, iArr, attributeSet, (TypedArray) r2.f812c, R.attr.toolbarStyle);
        TypedArray typedArray = (TypedArray) r2.f812c;
        this.f1090l = typedArray.getResourceId(28, 0);
        this.f1091m = typedArray.getResourceId(19, 0);
        this.f1101w = typedArray.getInteger(0, 8388627);
        this.f1092n = typedArray.getInteger(2, 48);
        int dimensionPixelOffset = typedArray.getDimensionPixelOffset(22, 0);
        dimensionPixelOffset = typedArray.hasValue(27) ? typedArray.getDimensionPixelOffset(27, dimensionPixelOffset) : dimensionPixelOffset;
        this.f1097s = dimensionPixelOffset;
        this.f1096r = dimensionPixelOffset;
        this.f1095q = dimensionPixelOffset;
        this.f1094p = dimensionPixelOffset;
        int dimensionPixelOffset2 = typedArray.getDimensionPixelOffset(25, -1);
        if (dimensionPixelOffset2 >= 0) {
            this.f1094p = dimensionPixelOffset2;
        }
        int dimensionPixelOffset3 = typedArray.getDimensionPixelOffset(24, -1);
        if (dimensionPixelOffset3 >= 0) {
            this.f1095q = dimensionPixelOffset3;
        }
        int dimensionPixelOffset4 = typedArray.getDimensionPixelOffset(26, -1);
        if (dimensionPixelOffset4 >= 0) {
            this.f1096r = dimensionPixelOffset4;
        }
        int dimensionPixelOffset5 = typedArray.getDimensionPixelOffset(23, -1);
        if (dimensionPixelOffset5 >= 0) {
            this.f1097s = dimensionPixelOffset5;
        }
        this.f1093o = typedArray.getDimensionPixelSize(13, -1);
        int dimensionPixelOffset6 = typedArray.getDimensionPixelOffset(9, Integer.MIN_VALUE);
        int dimensionPixelOffset7 = typedArray.getDimensionPixelOffset(5, Integer.MIN_VALUE);
        int dimensionPixelSize = typedArray.getDimensionPixelSize(7, 0);
        int dimensionPixelSize2 = typedArray.getDimensionPixelSize(8, 0);
        d();
        P0 p02 = this.f1098t;
        p02.h = false;
        if (dimensionPixelSize != Integer.MIN_VALUE) {
            p02.f3290e = dimensionPixelSize;
            p02.f3286a = dimensionPixelSize;
        }
        if (dimensionPixelSize2 != Integer.MIN_VALUE) {
            p02.f3291f = dimensionPixelSize2;
            p02.f3287b = dimensionPixelSize2;
        }
        if (dimensionPixelOffset6 != Integer.MIN_VALUE || dimensionPixelOffset7 != Integer.MIN_VALUE) {
            p02.a(dimensionPixelOffset6, dimensionPixelOffset7);
        }
        this.f1099u = typedArray.getDimensionPixelOffset(10, Integer.MIN_VALUE);
        this.f1100v = typedArray.getDimensionPixelOffset(6, Integer.MIN_VALUE);
        this.f1086f = r2.h(4);
        this.f1087g = typedArray.getText(3);
        CharSequence text = typedArray.getText(21);
        if (!TextUtils.isEmpty(text)) {
            setTitle(text);
        }
        CharSequence text2 = typedArray.getText(18);
        if (!TextUtils.isEmpty(text2)) {
            setSubtitle(text2);
        }
        this.f1088j = getContext();
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
        Z0 z02 = new Z0(context, attributeSet);
        z02.f3331a = 0;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a.f2392b);
        z02.f3331a = obtainStyledAttributes.getInt(0, 0);
        obtainStyledAttributes.recycle();
        z02.f3332b = 0;
        return z02;
    }

    public void setCollapseContentDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            c();
        }
        C0300z c0300z = this.h;
        if (c0300z != null) {
            c0300z.setContentDescription(charSequence);
        }
    }

    public void setCollapseIcon(Drawable drawable) {
        if (drawable != null) {
            c();
            this.h.setImageDrawable(drawable);
        } else {
            C0300z c0300z = this.h;
            if (c0300z != null) {
                c0300z.setImageDrawable(this.f1086f);
            }
        }
    }

    public void setLogo(Drawable drawable) {
        if (drawable != null) {
            if (this.f1085e == null) {
                this.f1085e = new C0232A(getContext(), null, 0);
            }
            if (!o(this.f1085e)) {
                b(this.f1085e, true);
            }
        } else {
            C0232A c0232a = this.f1085e;
            if (c0232a != null && o(c0232a)) {
                removeView(this.f1085e);
                this.f1066E.remove(this.f1085e);
            }
        }
        C0232A c0232a2 = this.f1085e;
        if (c0232a2 != null) {
            c0232a2.setImageDrawable(drawable);
        }
    }

    public void setLogoDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence) && this.f1085e == null) {
            this.f1085e = new C0232A(getContext(), null, 0);
        }
        C0232A c0232a = this.f1085e;
        if (c0232a != null) {
            c0232a.setContentDescription(charSequence);
        }
    }

    public void setNavigationContentDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            g();
        }
        C0300z c0300z = this.f1084d;
        if (c0300z != null) {
            c0300z.setContentDescription(charSequence);
            e1.a(this.f1084d, charSequence);
        }
    }

    public void setNavigationIcon(Drawable drawable) {
        if (drawable != null) {
            g();
            if (!o(this.f1084d)) {
                b(this.f1084d, true);
            }
        } else {
            C0300z c0300z = this.f1084d;
            if (c0300z != null && o(c0300z)) {
                removeView(this.f1084d);
                this.f1066E.remove(this.f1084d);
            }
        }
        C0300z c0300z2 = this.f1084d;
        if (c0300z2 != null) {
            c0300z2.setImageDrawable(drawable);
        }
    }

    public void setSubtitle(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            C0257d0 c0257d0 = this.f1083c;
            if (c0257d0 != null && o(c0257d0)) {
                removeView(this.f1083c);
                this.f1066E.remove(this.f1083c);
            }
        } else {
            if (this.f1083c == null) {
                Context context = getContext();
                C0257d0 c0257d02 = new C0257d0(context, null);
                this.f1083c = c0257d02;
                c0257d02.setSingleLine();
                this.f1083c.setEllipsize(TextUtils.TruncateAt.END);
                int i = this.f1091m;
                if (i != 0) {
                    this.f1083c.setTextAppearance(context, i);
                }
                ColorStateList colorStateList = this.f1062A;
                if (colorStateList != null) {
                    this.f1083c.setTextColor(colorStateList);
                }
            }
            if (!o(this.f1083c)) {
                b(this.f1083c, true);
            }
        }
        C0257d0 c0257d03 = this.f1083c;
        if (c0257d03 != null) {
            c0257d03.setText(charSequence);
        }
        this.f1103y = charSequence;
    }

    public void setSubtitleTextColor(ColorStateList colorStateList) {
        this.f1062A = colorStateList;
        C0257d0 c0257d0 = this.f1083c;
        if (c0257d0 != null) {
            c0257d0.setTextColor(colorStateList);
        }
    }

    public void setTitle(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            C0257d0 c0257d0 = this.f1082b;
            if (c0257d0 != null && o(c0257d0)) {
                removeView(this.f1082b);
                this.f1066E.remove(this.f1082b);
            }
        } else {
            if (this.f1082b == null) {
                Context context = getContext();
                C0257d0 c0257d02 = new C0257d0(context, null);
                this.f1082b = c0257d02;
                c0257d02.setSingleLine();
                this.f1082b.setEllipsize(TextUtils.TruncateAt.END);
                int i = this.f1090l;
                if (i != 0) {
                    this.f1082b.setTextAppearance(context, i);
                }
                ColorStateList colorStateList = this.f1104z;
                if (colorStateList != null) {
                    this.f1082b.setTextColor(colorStateList);
                }
            }
            if (!o(this.f1082b)) {
                b(this.f1082b, true);
            }
        }
        C0257d0 c0257d03 = this.f1082b;
        if (c0257d03 != null) {
            c0257d03.setText(charSequence);
        }
        this.f1102x = charSequence;
    }

    public void setTitleTextColor(ColorStateList colorStateList) {
        this.f1104z = colorStateList;
        C0257d0 c0257d0 = this.f1082b;
        if (c0257d0 != null) {
            c0257d0.setTextColor(colorStateList);
        }
    }
}
