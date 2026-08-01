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
import androidx.emoji2.text.t;
import androidx.fragment.app.d0;
import androidx.fragment.app.g;
import com.oriondriftchasers.arordrft.R;
import f.a;
import j.h;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import k.m;
import k.o;
import l.a3;
import l.b3;
import l.c1;
import l.c3;
import l.d3;
import l.l;
import l.l1;
import l.l3;
import l.o2;
import l.v2;
import l.w2;
import l.x2;
import l.y;
import l.y2;
import l.z;
import l.z2;
import n0.l0;

/* compiled from: r8-map-id-fb2637cf2a71147074b02d847622f707cfc12821f1b81d08e7915f8e7b9519ab */
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
    public final t L;
    public ArrayList M;
    public final w2 N;
    public d3 O;
    public l P;
    public y2 Q;
    public boolean R;
    public OnBackInvokedCallback S;
    public OnBackInvokedDispatcher T;
    public boolean U;
    public final g V;

    /* renamed from: f, reason: collision with root package name */
    public ActionMenuView f218f;

    /* renamed from: g, reason: collision with root package name */
    public c1 f219g;

    /* renamed from: h, reason: collision with root package name */
    public c1 f220h;
    public y i;

    /* renamed from: j, reason: collision with root package name */
    public z f221j;

    /* renamed from: k, reason: collision with root package name */
    public final Drawable f222k;

    /* renamed from: l, reason: collision with root package name */
    public final CharSequence f223l;

    /* renamed from: m, reason: collision with root package name */
    public y f224m;

    /* renamed from: n, reason: collision with root package name */
    public View f225n;

    /* renamed from: o, reason: collision with root package name */
    public Context f226o;

    /* renamed from: p, reason: collision with root package name */
    public int f227p;

    /* renamed from: q, reason: collision with root package name */
    public int f228q;

    /* renamed from: r, reason: collision with root package name */
    public int f229r;

    /* renamed from: s, reason: collision with root package name */
    public final int f230s;

    /* renamed from: t, reason: collision with root package name */
    public final int f231t;

    /* renamed from: u, reason: collision with root package name */
    public int f232u;

    /* renamed from: v, reason: collision with root package name */
    public int f233v;

    /* renamed from: w, reason: collision with root package name */
    public int f234w;

    /* renamed from: x, reason: collision with root package name */
    public int f235x;

    /* renamed from: y, reason: collision with root package name */
    public o2 f236y;

    /* renamed from: z, reason: collision with root package name */
    public int f237z;

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
        return new h(getContext());
    }

    public static z2 h() {
        z2 z2Var = new z2(-2, -2);
        z2Var.f2528b = 0;
        z2Var.f2527a = 8388627;
        return z2Var;
    }

    public static z2 i(ViewGroup.LayoutParams layoutParams) {
        boolean z3 = layoutParams instanceof z2;
        if (z3) {
            z2 z2Var = (z2) layoutParams;
            z2 z2Var2 = new z2(z2Var);
            z2Var2.f2528b = 0;
            z2Var2.f2528b = z2Var.f2528b;
            return z2Var2;
        }
        if (z3) {
            z2 z2Var3 = new z2((z2) layoutParams);
            z2Var3.f2528b = 0;
            return z2Var3;
        }
        if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
            z2 z2Var4 = new z2(layoutParams);
            z2Var4.f2528b = 0;
            return z2Var4;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        z2 z2Var5 = new z2(marginLayoutParams);
        z2Var5.f2528b = 0;
        ((ViewGroup.MarginLayoutParams) z2Var5).leftMargin = marginLayoutParams.leftMargin;
        ((ViewGroup.MarginLayoutParams) z2Var5).topMargin = marginLayoutParams.topMargin;
        ((ViewGroup.MarginLayoutParams) z2Var5).rightMargin = marginLayoutParams.rightMargin;
        ((ViewGroup.MarginLayoutParams) z2Var5).bottomMargin = marginLayoutParams.bottomMargin;
        return z2Var5;
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
        boolean z3 = getLayoutDirection() == 1;
        int childCount = getChildCount();
        int absoluteGravity = Gravity.getAbsoluteGravity(i, getLayoutDirection());
        arrayList.clear();
        if (!z3) {
            for (int i4 = 0; i4 < childCount; i4++) {
                View childAt = getChildAt(i4);
                z2 z2Var = (z2) childAt.getLayoutParams();
                if (z2Var.f2528b == 0 && s(childAt)) {
                    int i5 = z2Var.f2527a;
                    int layoutDirection = getLayoutDirection();
                    int absoluteGravity2 = Gravity.getAbsoluteGravity(i5, layoutDirection) & 7;
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
        for (int i6 = childCount - 1; i6 >= 0; i6--) {
            View childAt2 = getChildAt(i6);
            z2 z2Var2 = (z2) childAt2.getLayoutParams();
            if (z2Var2.f2528b == 0 && s(childAt2)) {
                int i7 = z2Var2.f2527a;
                int layoutDirection2 = getLayoutDirection();
                int absoluteGravity3 = Gravity.getAbsoluteGravity(i7, layoutDirection2) & 7;
                if (absoluteGravity3 != 1 && absoluteGravity3 != 3 && absoluteGravity3 != 5) {
                    absoluteGravity3 = layoutDirection2 == 1 ? 5 : 3;
                }
                if (absoluteGravity3 == absoluteGravity) {
                    arrayList.add(childAt2);
                }
            }
        }
    }

    public final void b(View view, boolean z3) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        z2 h4 = layoutParams == null ? h() : !checkLayoutParams(layoutParams) ? i(layoutParams) : (z2) layoutParams;
        h4.f2528b = 1;
        if (!z3 || this.f225n == null) {
            addView(view, h4);
        } else {
            view.setLayoutParams(h4);
            this.J.add(view);
        }
    }

    public final void c() {
        if (this.f224m == null) {
            y yVar = new y(getContext(), null, R.attr.toolbarNavigationButtonStyle);
            this.f224m = yVar;
            yVar.setImageDrawable(this.f222k);
            this.f224m.setContentDescription(this.f223l);
            z2 h4 = h();
            h4.f2527a = (this.f230s & 112) | 8388611;
            h4.f2528b = 2;
            this.f224m.setLayoutParams(h4);
            this.f224m.setOnClickListener(new com.google.android.material.datepicker.l(4, this));
        }
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return super.checkLayoutParams(layoutParams) && (layoutParams instanceof z2);
    }

    public final void d() {
        if (this.f236y == null) {
            o2 o2Var = new o2();
            o2Var.f2405a = 0;
            o2Var.f2406b = 0;
            o2Var.f2407c = Integer.MIN_VALUE;
            o2Var.d = Integer.MIN_VALUE;
            o2Var.f2408e = 0;
            o2Var.f2409f = 0;
            o2Var.f2410g = false;
            o2Var.f2411h = false;
            this.f236y = o2Var;
        }
    }

    public final void e() {
        f();
        ActionMenuView actionMenuView = this.f218f;
        if (actionMenuView.f198u == null) {
            m mVar = (m) actionMenuView.getMenu();
            if (this.Q == null) {
                this.Q = new y2(this);
            }
            this.f218f.setExpandedActionViewsExclusive(true);
            mVar.b(this.Q, this.f226o);
            t();
        }
    }

    public final void f() {
        if (this.f218f == null) {
            ActionMenuView actionMenuView = new ActionMenuView(getContext(), null);
            this.f218f = actionMenuView;
            actionMenuView.setPopupTheme(this.f227p);
            this.f218f.setOnMenuItemClickListener(this.N);
            ActionMenuView actionMenuView2 = this.f218f;
            w2 w2Var = new w2(this);
            actionMenuView2.getClass();
            actionMenuView2.f203z = w2Var;
            z2 h4 = h();
            h4.f2527a = (this.f230s & 112) | 8388613;
            this.f218f.setLayoutParams(h4);
            b(this.f218f, false);
        }
    }

    public final void g() {
        if (this.i == null) {
            this.i = new y(getContext(), null, R.attr.toolbarNavigationButtonStyle);
            z2 h4 = h();
            h4.f2527a = (this.f230s & 112) | 8388611;
            this.i.setLayoutParams(h4);
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
        y yVar = this.f224m;
        if (yVar != null) {
            return yVar.getContentDescription();
        }
        return null;
    }

    public Drawable getCollapseIcon() {
        y yVar = this.f224m;
        if (yVar != null) {
            return yVar.getDrawable();
        }
        return null;
    }

    public int getContentInsetEnd() {
        o2 o2Var = this.f236y;
        if (o2Var != null) {
            return o2Var.f2410g ? o2Var.f2405a : o2Var.f2406b;
        }
        return 0;
    }

    public int getContentInsetEndWithActions() {
        int i = this.A;
        return i != Integer.MIN_VALUE ? i : getContentInsetEnd();
    }

    public int getContentInsetLeft() {
        o2 o2Var = this.f236y;
        if (o2Var != null) {
            return o2Var.f2405a;
        }
        return 0;
    }

    public int getContentInsetRight() {
        o2 o2Var = this.f236y;
        if (o2Var != null) {
            return o2Var.f2406b;
        }
        return 0;
    }

    public int getContentInsetStart() {
        o2 o2Var = this.f236y;
        if (o2Var != null) {
            return o2Var.f2410g ? o2Var.f2406b : o2Var.f2405a;
        }
        return 0;
    }

    public int getContentInsetStartWithNavigation() {
        int i = this.f237z;
        return i != Integer.MIN_VALUE ? i : getContentInsetStart();
    }

    public int getCurrentContentInsetEnd() {
        m mVar;
        ActionMenuView actionMenuView = this.f218f;
        return (actionMenuView == null || (mVar = actionMenuView.f198u) == null || !mVar.hasVisibleItems()) ? getContentInsetEnd() : Math.max(getContentInsetEnd(), Math.max(this.A, 0));
    }

    public int getCurrentContentInsetLeft() {
        return getLayoutDirection() == 1 ? getCurrentContentInsetEnd() : getCurrentContentInsetStart();
    }

    public int getCurrentContentInsetRight() {
        return getLayoutDirection() == 1 ? getCurrentContentInsetStart() : getCurrentContentInsetEnd();
    }

    public int getCurrentContentInsetStart() {
        return getNavigationIcon() != null ? Math.max(getContentInsetStart(), Math.max(this.f237z, 0)) : getContentInsetStart();
    }

    public Drawable getLogo() {
        z zVar = this.f221j;
        if (zVar != null) {
            return zVar.getDrawable();
        }
        return null;
    }

    public CharSequence getLogoDescription() {
        z zVar = this.f221j;
        if (zVar != null) {
            return zVar.getContentDescription();
        }
        return null;
    }

    public Menu getMenu() {
        e();
        return this.f218f.getMenu();
    }

    public View getNavButtonView() {
        return this.i;
    }

    public CharSequence getNavigationContentDescription() {
        y yVar = this.i;
        if (yVar != null) {
            return yVar.getContentDescription();
        }
        return null;
    }

    public Drawable getNavigationIcon() {
        y yVar = this.i;
        if (yVar != null) {
            return yVar.getDrawable();
        }
        return null;
    }

    public l getOuterActionMenuPresenter() {
        return this.P;
    }

    public Drawable getOverflowIcon() {
        e();
        return this.f218f.getOverflowIcon();
    }

    public Context getPopupContext() {
        return this.f226o;
    }

    public int getPopupTheme() {
        return this.f227p;
    }

    public CharSequence getSubtitle() {
        return this.D;
    }

    public final TextView getSubtitleTextView() {
        return this.f220h;
    }

    public CharSequence getTitle() {
        return this.C;
    }

    public int getTitleMarginBottom() {
        return this.f235x;
    }

    public int getTitleMarginEnd() {
        return this.f233v;
    }

    public int getTitleMarginStart() {
        return this.f232u;
    }

    public int getTitleMarginTop() {
        return this.f234w;
    }

    public final TextView getTitleTextView() {
        return this.f219g;
    }

    public l1 getWrapper() {
        Drawable drawable;
        if (this.O == null) {
            d3 d3Var = new d3();
            d3Var.f2280n = 0;
            d3Var.f2269a = this;
            d3Var.f2275h = getTitle();
            d3Var.i = getSubtitle();
            d3Var.f2274g = d3Var.f2275h != null;
            d3Var.f2273f = getNavigationIcon();
            t w3 = t.w(getContext(), null, a.f1240a, R.attr.actionBarStyle);
            TypedArray typedArray = (TypedArray) w3.f356c;
            d3Var.f2281o = w3.n(15);
            CharSequence text = typedArray.getText(27);
            if (!TextUtils.isEmpty(text)) {
                d3Var.f2274g = true;
                d3Var.f2275h = text;
                if ((d3Var.f2270b & 8) != 0) {
                    setTitle(text);
                    if (d3Var.f2274g) {
                        l0.n(getRootView(), text);
                    }
                }
            }
            CharSequence text2 = typedArray.getText(25);
            if (!TextUtils.isEmpty(text2)) {
                d3Var.i = text2;
                if ((d3Var.f2270b & 8) != 0) {
                    setSubtitle(text2);
                }
            }
            Drawable n4 = w3.n(20);
            if (n4 != null) {
                d3Var.f2272e = n4;
                d3Var.c();
            }
            Drawable n5 = w3.n(17);
            if (n5 != null) {
                d3Var.d = n5;
                d3Var.c();
            }
            if (d3Var.f2273f == null && (drawable = d3Var.f2281o) != null) {
                d3Var.f2273f = drawable;
                if ((d3Var.f2270b & 4) != 0) {
                    setNavigationIcon(drawable);
                } else {
                    setNavigationIcon((Drawable) null);
                }
            }
            d3Var.a(typedArray.getInt(10, 0));
            int resourceId = typedArray.getResourceId(9, 0);
            if (resourceId != 0) {
                View inflate = LayoutInflater.from(getContext()).inflate(resourceId, (ViewGroup) this, false);
                View view = d3Var.f2271c;
                if (view != null && (d3Var.f2270b & 16) != 0) {
                    removeView(view);
                }
                d3Var.f2271c = inflate;
                if (inflate != null && (d3Var.f2270b & 16) != 0) {
                    addView(inflate);
                }
                d3Var.a(d3Var.f2270b | 16);
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
                this.f236y.a(max, max2);
            }
            int resourceId2 = typedArray.getResourceId(28, 0);
            if (resourceId2 != 0) {
                Context context = getContext();
                this.f228q = resourceId2;
                c1 c1Var = this.f219g;
                if (c1Var != null) {
                    c1Var.setTextAppearance(context, resourceId2);
                }
            }
            int resourceId3 = typedArray.getResourceId(26, 0);
            if (resourceId3 != 0) {
                Context context2 = getContext();
                this.f229r = resourceId3;
                c1 c1Var2 = this.f220h;
                if (c1Var2 != null) {
                    c1Var2.setTextAppearance(context2, resourceId3);
                }
            }
            int resourceId4 = typedArray.getResourceId(22, 0);
            if (resourceId4 != 0) {
                setPopupTheme(resourceId4);
            }
            w3.y();
            if (R.string.abc_action_bar_up_description != d3Var.f2280n) {
                d3Var.f2280n = R.string.abc_action_bar_up_description;
                if (TextUtils.isEmpty(getNavigationContentDescription())) {
                    int i = d3Var.f2280n;
                    d3Var.f2276j = i != 0 ? getContext().getString(i) : null;
                    d3Var.b();
                }
            }
            d3Var.f2276j = getNavigationContentDescription();
            setNavigationOnClickListener(new c3(d3Var));
            this.O = d3Var;
        }
        return this.O;
    }

    public final int j(View view, int i) {
        z2 z2Var = (z2) view.getLayoutParams();
        int measuredHeight = view.getMeasuredHeight();
        int i4 = i > 0 ? (measuredHeight - i) / 2 : 0;
        int i5 = z2Var.f2527a & 112;
        if (i5 != 16 && i5 != 48 && i5 != 80) {
            i5 = this.B & 112;
        }
        if (i5 == 48) {
            return getPaddingTop() - i4;
        }
        if (i5 == 80) {
            return (((getHeight() - getPaddingBottom()) - measuredHeight) - ((ViewGroup.MarginLayoutParams) z2Var).bottomMargin) - i4;
        }
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int height = getHeight();
        int i6 = (((height - paddingTop) - paddingBottom) - measuredHeight) / 2;
        int i7 = ((ViewGroup.MarginLayoutParams) z2Var).topMargin;
        if (i6 < i7) {
            i6 = i7;
        } else {
            int i8 = (((height - paddingBottom) - measuredHeight) - i6) - paddingTop;
            int i9 = ((ViewGroup.MarginLayoutParams) z2Var).bottomMargin;
            if (i8 < i9) {
                i6 = Math.max(0, i6 - (i9 - i8));
            }
        }
        return paddingTop + i6;
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
        Iterator it = ((CopyOnWriteArrayList) this.L.f356c).iterator();
        while (it.hasNext()) {
            ((d0) it.next()).f416a.j();
        }
        ArrayList<MenuItem> currentMenuItems2 = getCurrentMenuItems();
        currentMenuItems2.removeAll(currentMenuItems);
        this.M = currentMenuItems2;
    }

    public final boolean n(View view) {
        return view.getParent() == this || this.J.contains(view);
    }

    public final int o(View view, int i, int i4, int[] iArr) {
        z2 z2Var = (z2) view.getLayoutParams();
        int i5 = ((ViewGroup.MarginLayoutParams) z2Var).leftMargin - iArr[0];
        int max = Math.max(0, i5) + i;
        iArr[0] = Math.max(0, -i5);
        int j4 = j(view, i4);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(max, j4, max + measuredWidth, view.getMeasuredHeight() + j4);
        return measuredWidth + ((ViewGroup.MarginLayoutParams) z2Var).rightMargin + max;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        t();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeCallbacks(this.V);
        t();
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
    public void onLayout(boolean z3, int i, int i4, int i5, int i6) {
        int i7;
        int i8;
        int max;
        boolean s3;
        boolean s4;
        boolean z4;
        int i9;
        int i10;
        int paddingTop;
        int i11;
        int i12;
        int i13;
        int i14;
        int size;
        int i15;
        int i16;
        int size2;
        int i17;
        int size3;
        int i18;
        int i19;
        int i20;
        int size4;
        boolean z5 = getLayoutDirection() == 1;
        int width = getWidth();
        int height = getHeight();
        int paddingLeft = getPaddingLeft();
        int paddingRight = getPaddingRight();
        int paddingTop2 = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int i21 = width - paddingRight;
        int[] iArr = this.K;
        iArr[1] = 0;
        iArr[0] = 0;
        WeakHashMap weakHashMap = l0.f2757a;
        int minimumHeight = getMinimumHeight();
        int min = minimumHeight >= 0 ? Math.min(minimumHeight, i6 - i4) : 0;
        if (!s(this.i)) {
            i7 = paddingLeft;
        } else {
            if (z5) {
                i8 = p(this.i, i21, min, iArr);
                i7 = paddingLeft;
                if (s(this.f224m)) {
                    if (z5) {
                        i8 = p(this.f224m, i8, min, iArr);
                    } else {
                        i7 = o(this.f224m, i7, min, iArr);
                    }
                }
                if (s(this.f218f)) {
                    if (z5) {
                        i7 = o(this.f218f, i7, min, iArr);
                    } else {
                        i8 = p(this.f218f, i8, min, iArr);
                    }
                }
                int currentContentInsetLeft = getCurrentContentInsetLeft();
                int currentContentInsetRight = getCurrentContentInsetRight();
                iArr[0] = Math.max(0, currentContentInsetLeft - i7);
                iArr[1] = Math.max(0, currentContentInsetRight - (i21 - i8));
                max = Math.max(i7, currentContentInsetLeft);
                int min2 = Math.min(i8, i21 - currentContentInsetRight);
                if (s(this.f225n)) {
                    if (z5) {
                        min2 = p(this.f225n, min2, min, iArr);
                    } else {
                        max = o(this.f225n, max, min, iArr);
                    }
                }
                if (s(this.f221j)) {
                    if (z5) {
                        min2 = p(this.f221j, min2, min, iArr);
                    } else {
                        max = o(this.f221j, max, min, iArr);
                    }
                }
                s3 = s(this.f219g);
                s4 = s(this.f220h);
                if (s3) {
                    z4 = z5;
                    i9 = 0;
                } else {
                    z2 z2Var = (z2) this.f219g.getLayoutParams();
                    z4 = z5;
                    i9 = this.f219g.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) z2Var).topMargin + ((ViewGroup.MarginLayoutParams) z2Var).bottomMargin;
                }
                if (!s4) {
                    z2 z2Var2 = (z2) this.f220h.getLayoutParams();
                    i9 = this.f220h.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) z2Var2).topMargin + ((ViewGroup.MarginLayoutParams) z2Var2).bottomMargin + i9;
                }
                if (!s3 || s4) {
                    c1 c1Var = !s3 ? this.f219g : this.f220h;
                    c1 c1Var2 = !s4 ? this.f220h : this.f219g;
                    z2 z2Var3 = (z2) c1Var.getLayoutParams();
                    z2 z2Var4 = (z2) c1Var2.getLayoutParams();
                    int i22 = i9;
                    boolean z6 = (!s3 && this.f219g.getMeasuredWidth() > 0) || (s4 && this.f220h.getMeasuredWidth() > 0);
                    i10 = this.B & 112;
                    int i23 = max;
                    if (i10 != 48) {
                        paddingTop = getPaddingTop() + ((ViewGroup.MarginLayoutParams) z2Var3).topMargin + this.f234w;
                    } else if (i10 != 80) {
                        int i24 = (((height - paddingTop2) - paddingBottom) - i22) / 2;
                        int i25 = ((ViewGroup.MarginLayoutParams) z2Var3).topMargin + this.f234w;
                        if (i24 < i25) {
                            i24 = i25;
                        } else {
                            int i26 = (((height - paddingBottom) - i22) - i24) - paddingTop2;
                            int i27 = ((ViewGroup.MarginLayoutParams) z2Var3).bottomMargin;
                            int i28 = this.f235x;
                            if (i26 < i27 + i28) {
                                i24 = Math.max(0, i24 - ((((ViewGroup.MarginLayoutParams) z2Var4).bottomMargin + i28) - i26));
                            }
                        }
                        paddingTop = paddingTop2 + i24;
                    } else {
                        paddingTop = (((height - paddingBottom) - ((ViewGroup.MarginLayoutParams) z2Var4).bottomMargin) - this.f235x) - i22;
                    }
                    if (z4) {
                        int i29 = (z6 ? this.f232u : 0) - iArr[0];
                        max = Math.max(0, i29) + i23;
                        iArr[0] = Math.max(0, -i29);
                        if (s3) {
                            z2 z2Var5 = (z2) this.f219g.getLayoutParams();
                            int measuredWidth = this.f219g.getMeasuredWidth() + max;
                            int measuredHeight = this.f219g.getMeasuredHeight() + paddingTop;
                            this.f219g.layout(max, paddingTop, measuredWidth, measuredHeight);
                            i11 = measuredWidth + this.f233v;
                            paddingTop = measuredHeight + ((ViewGroup.MarginLayoutParams) z2Var5).bottomMargin;
                        } else {
                            i11 = max;
                        }
                        if (s4) {
                            int i30 = paddingTop + ((ViewGroup.MarginLayoutParams) ((z2) this.f220h.getLayoutParams())).topMargin;
                            int measuredWidth2 = this.f220h.getMeasuredWidth() + max;
                            this.f220h.layout(max, i30, measuredWidth2, this.f220h.getMeasuredHeight() + i30);
                            i12 = measuredWidth2 + this.f233v;
                        } else {
                            i12 = max;
                        }
                        if (z6) {
                            max = Math.max(i11, i12);
                        }
                    } else {
                        int i31 = (z6 ? this.f232u : 0) - iArr[1];
                        min2 -= Math.max(0, i31);
                        iArr[1] = Math.max(0, -i31);
                        if (s3) {
                            z2 z2Var6 = (z2) this.f219g.getLayoutParams();
                            int measuredWidth3 = min2 - this.f219g.getMeasuredWidth();
                            int measuredHeight2 = this.f219g.getMeasuredHeight() + paddingTop;
                            this.f219g.layout(measuredWidth3, paddingTop, min2, measuredHeight2);
                            i13 = measuredWidth3 - this.f233v;
                            paddingTop = measuredHeight2 + ((ViewGroup.MarginLayoutParams) z2Var6).bottomMargin;
                        } else {
                            i13 = min2;
                        }
                        if (s4) {
                            int i32 = paddingTop + ((ViewGroup.MarginLayoutParams) ((z2) this.f220h.getLayoutParams())).topMargin;
                            this.f220h.layout(min2 - this.f220h.getMeasuredWidth(), i32, min2, this.f220h.getMeasuredHeight() + i32);
                            i14 = min2 - this.f233v;
                        } else {
                            i14 = min2;
                        }
                        if (z6) {
                            min2 = Math.min(i13, i14);
                        }
                        max = i23;
                    }
                }
                ArrayList arrayList = this.I;
                a(arrayList, 3);
                size = arrayList.size();
                i15 = max;
                for (i16 = 0; i16 < size; i16++) {
                    i15 = o((View) arrayList.get(i16), i15, min, iArr);
                }
                a(arrayList, 5);
                size2 = arrayList.size();
                for (i17 = 0; i17 < size2; i17++) {
                    min2 = p((View) arrayList.get(i17), min2, min, iArr);
                }
                a(arrayList, 1);
                int i33 = iArr[0];
                int i34 = iArr[1];
                size3 = arrayList.size();
                int i35 = i33;
                i18 = 0;
                int i36 = 0;
                while (i18 < size3) {
                    View view = (View) arrayList.get(i18);
                    z2 z2Var7 = (z2) view.getLayoutParams();
                    int i37 = i34;
                    int i38 = ((ViewGroup.MarginLayoutParams) z2Var7).leftMargin - i35;
                    int i39 = ((ViewGroup.MarginLayoutParams) z2Var7).rightMargin - i37;
                    int max2 = Math.max(0, i38);
                    int max3 = Math.max(0, i39);
                    int max4 = Math.max(0, -i38);
                    int max5 = Math.max(0, -i39);
                    i36 += view.getMeasuredWidth() + max2 + max3;
                    i18++;
                    i35 = max4;
                    i34 = max5;
                }
                i20 = ((((width - paddingLeft) - paddingRight) / 2) + paddingLeft) - (i36 / 2);
                int i40 = i36 + i20;
                if (i20 >= i15) {
                    i15 = i40 > min2 ? i20 - (i40 - min2) : i20;
                }
                size4 = arrayList.size();
                for (i19 = 0; i19 < size4; i19++) {
                    i15 = o((View) arrayList.get(i19), i15, min, iArr);
                }
                arrayList.clear();
            }
            i7 = o(this.i, paddingLeft, min, iArr);
        }
        i8 = i21;
        if (s(this.f224m)) {
        }
        if (s(this.f218f)) {
        }
        int currentContentInsetLeft2 = getCurrentContentInsetLeft();
        int currentContentInsetRight2 = getCurrentContentInsetRight();
        iArr[0] = Math.max(0, currentContentInsetLeft2 - i7);
        iArr[1] = Math.max(0, currentContentInsetRight2 - (i21 - i8));
        max = Math.max(i7, currentContentInsetLeft2);
        int min22 = Math.min(i8, i21 - currentContentInsetRight2);
        if (s(this.f225n)) {
        }
        if (s(this.f221j)) {
        }
        s3 = s(this.f219g);
        s4 = s(this.f220h);
        if (s3) {
        }
        if (!s4) {
        }
        if (!s3) {
        }
        if (!s3) {
        }
        if (!s4) {
        }
        z2 z2Var32 = (z2) c1Var.getLayoutParams();
        z2 z2Var42 = (z2) c1Var2.getLayoutParams();
        int i222 = i9;
        if (s3) {
        }
        i10 = this.B & 112;
        int i232 = max;
        if (i10 != 48) {
        }
        if (z4) {
        }
        ArrayList arrayList2 = this.I;
        a(arrayList2, 3);
        size = arrayList2.size();
        i15 = max;
        while (i16 < size) {
        }
        a(arrayList2, 5);
        size2 = arrayList2.size();
        while (i17 < size2) {
        }
        a(arrayList2, 1);
        int i332 = iArr[0];
        int i342 = iArr[1];
        size3 = arrayList2.size();
        int i352 = i332;
        i18 = 0;
        int i362 = 0;
        while (i18 < size3) {
        }
        i20 = ((((width - paddingLeft) - paddingRight) / 2) + paddingLeft) - (i362 / 2);
        int i402 = i362 + i20;
        if (i20 >= i15) {
        }
        size4 = arrayList2.size();
        while (i19 < size4) {
        }
        arrayList2.clear();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.View
    public final void onMeasure(int i, int i4) {
        char c4;
        Object[] objArr;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        boolean z3 = l3.f2381a;
        int i12 = 0;
        if (getLayoutDirection() == 1) {
            objArr = true;
            c4 = 0;
        } else {
            c4 = 1;
            objArr = false;
        }
        if (s(this.i)) {
            r(this.i, i, 0, i4, this.f231t);
            i5 = k(this.i) + this.i.getMeasuredWidth();
            i6 = Math.max(0, l(this.i) + this.i.getMeasuredHeight());
            i7 = View.combineMeasuredStates(0, this.i.getMeasuredState());
        } else {
            i5 = 0;
            i6 = 0;
            i7 = 0;
        }
        if (s(this.f224m)) {
            r(this.f224m, i, 0, i4, this.f231t);
            i5 = k(this.f224m) + this.f224m.getMeasuredWidth();
            i6 = Math.max(i6, l(this.f224m) + this.f224m.getMeasuredHeight());
            i7 = View.combineMeasuredStates(i7, this.f224m.getMeasuredState());
        }
        int currentContentInsetStart = getCurrentContentInsetStart();
        int max = Math.max(currentContentInsetStart, i5);
        int max2 = Math.max(0, currentContentInsetStart - i5);
        Object[] objArr2 = objArr;
        int[] iArr = this.K;
        iArr[objArr2 == true ? 1 : 0] = max2;
        if (s(this.f218f)) {
            r(this.f218f, i, max, i4, this.f231t);
            i8 = k(this.f218f) + this.f218f.getMeasuredWidth();
            i6 = Math.max(i6, l(this.f218f) + this.f218f.getMeasuredHeight());
            i7 = View.combineMeasuredStates(i7, this.f218f.getMeasuredState());
        } else {
            i8 = 0;
        }
        int currentContentInsetEnd = getCurrentContentInsetEnd();
        int max3 = max + Math.max(currentContentInsetEnd, i8);
        iArr[c4] = Math.max(0, currentContentInsetEnd - i8);
        if (s(this.f225n)) {
            max3 += q(this.f225n, i, max3, i4, 0, iArr);
            i6 = Math.max(i6, l(this.f225n) + this.f225n.getMeasuredHeight());
            i7 = View.combineMeasuredStates(i7, this.f225n.getMeasuredState());
        }
        if (s(this.f221j)) {
            max3 += q(this.f221j, i, max3, i4, 0, iArr);
            i6 = Math.max(i6, l(this.f221j) + this.f221j.getMeasuredHeight());
            i7 = View.combineMeasuredStates(i7, this.f221j.getMeasuredState());
        }
        int childCount = getChildCount();
        for (int i13 = 0; i13 < childCount; i13++) {
            View childAt = getChildAt(i13);
            if (((z2) childAt.getLayoutParams()).f2528b == 0 && s(childAt)) {
                max3 += q(childAt, i, max3, i4, 0, iArr);
                int max4 = Math.max(i6, l(childAt) + childAt.getMeasuredHeight());
                i7 = View.combineMeasuredStates(i7, childAt.getMeasuredState());
                i6 = max4;
            } else {
                max3 = max3;
            }
        }
        int i14 = max3;
        int i15 = this.f234w + this.f235x;
        int i16 = this.f232u + this.f233v;
        if (s(this.f219g)) {
            q(this.f219g, i, i14 + i16, i4, i15, iArr);
            int k4 = k(this.f219g) + this.f219g.getMeasuredWidth();
            i9 = l(this.f219g) + this.f219g.getMeasuredHeight();
            i10 = View.combineMeasuredStates(i7, this.f219g.getMeasuredState());
            i11 = k4;
        } else {
            i9 = 0;
            i10 = i7;
            i11 = 0;
        }
        if (s(this.f220h)) {
            i11 = Math.max(i11, q(this.f220h, i, i14 + i16, i4, i15 + i9, iArr));
            i9 += l(this.f220h) + this.f220h.getMeasuredHeight();
            i10 = View.combineMeasuredStates(i10, this.f220h.getMeasuredState());
        }
        int max5 = Math.max(i6, i9);
        int paddingRight = getPaddingRight() + getPaddingLeft() + i14 + i11;
        int paddingBottom = getPaddingBottom() + getPaddingTop() + max5;
        int resolveSizeAndState = View.resolveSizeAndState(Math.max(paddingRight, getSuggestedMinimumWidth()), i, (-16777216) & i10);
        int resolveSizeAndState2 = View.resolveSizeAndState(Math.max(paddingBottom, getSuggestedMinimumHeight()), i4, i10 << 16);
        if (this.R) {
            int childCount2 = getChildCount();
            for (int i17 = 0; i17 < childCount2; i17++) {
                View childAt2 = getChildAt(i17);
                if (!s(childAt2) || childAt2.getMeasuredWidth() <= 0 || childAt2.getMeasuredHeight() <= 0) {
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
        if (!(parcelable instanceof b3)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        b3 b3Var = (b3) parcelable;
        super.onRestoreInstanceState(b3Var.f3175f);
        ActionMenuView actionMenuView = this.f218f;
        m mVar = actionMenuView != null ? actionMenuView.f198u : null;
        int i = b3Var.f2250h;
        if (i != 0 && this.Q != null && mVar != null && (findItem = mVar.findItem(i)) != null) {
            findItem.expandActionView();
        }
        if (b3Var.i) {
            g gVar = this.V;
            removeCallbacks(gVar);
            post(gVar);
        }
    }

    @Override // android.view.View
    public final void onRtlPropertiesChanged(int i) {
        super.onRtlPropertiesChanged(i);
        d();
        o2 o2Var = this.f236y;
        boolean z3 = i == 1;
        if (z3 == o2Var.f2410g) {
            return;
        }
        o2Var.f2410g = z3;
        if (!o2Var.f2411h) {
            o2Var.f2405a = o2Var.f2408e;
            o2Var.f2406b = o2Var.f2409f;
            return;
        }
        if (z3) {
            int i4 = o2Var.d;
            if (i4 == Integer.MIN_VALUE) {
                i4 = o2Var.f2408e;
            }
            o2Var.f2405a = i4;
            int i5 = o2Var.f2407c;
            if (i5 == Integer.MIN_VALUE) {
                i5 = o2Var.f2409f;
            }
            o2Var.f2406b = i5;
            return;
        }
        int i6 = o2Var.f2407c;
        if (i6 == Integer.MIN_VALUE) {
            i6 = o2Var.f2408e;
        }
        o2Var.f2405a = i6;
        int i7 = o2Var.d;
        if (i7 == Integer.MIN_VALUE) {
            i7 = o2Var.f2409f;
        }
        o2Var.f2406b = i7;
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        l lVar;
        o oVar;
        b3 b3Var = new b3(super.onSaveInstanceState());
        y2 y2Var = this.Q;
        if (y2Var != null && (oVar = y2Var.f2522g) != null) {
            b3Var.f2250h = oVar.f2085a;
        }
        ActionMenuView actionMenuView = this.f218f;
        b3Var.i = (actionMenuView == null || (lVar = actionMenuView.f202y) == null || !lVar.k()) ? false : true;
        return b3Var;
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

    public final int p(View view, int i, int i4, int[] iArr) {
        z2 z2Var = (z2) view.getLayoutParams();
        int i5 = ((ViewGroup.MarginLayoutParams) z2Var).rightMargin - iArr[1];
        int max = i - Math.max(0, i5);
        iArr[1] = Math.max(0, -i5);
        int j4 = j(view, i4);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(max - measuredWidth, j4, max, view.getMeasuredHeight() + j4);
        return max - (measuredWidth + ((ViewGroup.MarginLayoutParams) z2Var).leftMargin);
    }

    public final int q(View view, int i, int i4, int i5, int i6, int[] iArr) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int i7 = marginLayoutParams.leftMargin - iArr[0];
        int i8 = marginLayoutParams.rightMargin - iArr[1];
        int max = Math.max(0, i8) + Math.max(0, i7);
        iArr[0] = Math.max(0, -i7);
        iArr[1] = Math.max(0, -i8);
        view.measure(ViewGroup.getChildMeasureSpec(i, getPaddingRight() + getPaddingLeft() + max + i4, marginLayoutParams.width), ViewGroup.getChildMeasureSpec(i5, getPaddingBottom() + getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i6, marginLayoutParams.height));
        return view.getMeasuredWidth() + max;
    }

    public final void r(View view, int i, int i4, int i5, int i6) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i, getPaddingRight() + getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i4, marginLayoutParams.width);
        int childMeasureSpec2 = ViewGroup.getChildMeasureSpec(i5, getPaddingBottom() + getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, marginLayoutParams.height);
        int mode = View.MeasureSpec.getMode(childMeasureSpec2);
        if (mode != 1073741824 && i6 >= 0) {
            if (mode != 0) {
                i6 = Math.min(View.MeasureSpec.getSize(childMeasureSpec2), i6);
            }
            childMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i6, 1073741824);
        }
        view.measure(childMeasureSpec, childMeasureSpec2);
    }

    public final boolean s(View view) {
        return (view == null || view.getParent() != this || view.getVisibility() == 8) ? false : true;
    }

    public void setBackInvokedCallbackEnabled(boolean z3) {
        if (this.U != z3) {
            this.U = z3;
            t();
        }
    }

    public void setCollapseContentDescription(int i) {
        setCollapseContentDescription(i != 0 ? getContext().getText(i) : null);
    }

    public void setCollapseIcon(int i) {
        setCollapseIcon(h.a.x(getContext(), i));
    }

    public void setCollapsible(boolean z3) {
        this.R = z3;
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
        if (i != this.f237z) {
            this.f237z = i;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setLogo(int i) {
        setLogo(h.a.x(getContext(), i));
    }

    public void setLogoDescription(int i) {
        setLogoDescription(getContext().getText(i));
    }

    public void setNavigationContentDescription(int i) {
        setNavigationContentDescription(i != 0 ? getContext().getText(i) : null);
    }

    public void setNavigationIcon(int i) {
        setNavigationIcon(h.a.x(getContext(), i));
    }

    public void setNavigationOnClickListener(View.OnClickListener onClickListener) {
        g();
        this.i.setOnClickListener(onClickListener);
    }

    public void setOverflowIcon(Drawable drawable) {
        e();
        this.f218f.setOverflowIcon(drawable);
    }

    public void setPopupTheme(int i) {
        if (this.f227p != i) {
            this.f227p = i;
            if (i == 0) {
                this.f226o = getContext();
            } else {
                this.f226o = new ContextThemeWrapper(getContext(), i);
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
        this.f235x = i;
        requestLayout();
    }

    public void setTitleMarginEnd(int i) {
        this.f233v = i;
        requestLayout();
    }

    public void setTitleMarginStart(int i) {
        this.f232u = i;
        requestLayout();
    }

    public void setTitleMarginTop(int i) {
        this.f234w = i;
        requestLayout();
    }

    public void setTitleTextColor(int i) {
        setTitleTextColor(ColorStateList.valueOf(i));
    }

    public final void t() {
        OnBackInvokedDispatcher onBackInvokedDispatcher;
        if (Build.VERSION.SDK_INT >= 33) {
            OnBackInvokedDispatcher a2 = x2.a(this);
            y2 y2Var = this.Q;
            boolean z3 = (y2Var == null || y2Var.f2522g == null || a2 == null || !isAttachedToWindow() || !this.U) ? false : true;
            if (z3 && this.T == null) {
                if (this.S == null) {
                    this.S = x2.b(new v2(this, 0));
                }
                x2.c(a2, this.S);
                this.T = a2;
                return;
            }
            if (z3 || (onBackInvokedDispatcher = this.T) == null) {
                return;
            }
            x2.d(onBackInvokedDispatcher, this.S);
            this.T = null;
        }
    }

    public Toolbar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, R.attr.toolbarStyle);
        this.B = 8388627;
        this.I = new ArrayList();
        this.J = new ArrayList();
        this.K = new int[2];
        this.L = new t(new v2(this, 1));
        this.M = new ArrayList();
        this.N = new w2(this);
        this.V = new g(7, this);
        Context context2 = getContext();
        int[] iArr = a.f1260w;
        t w3 = t.w(context2, attributeSet, iArr, R.attr.toolbarStyle);
        l0.l(this, context, iArr, attributeSet, (TypedArray) w3.f356c, R.attr.toolbarStyle);
        TypedArray typedArray = (TypedArray) w3.f356c;
        this.f228q = typedArray.getResourceId(28, 0);
        this.f229r = typedArray.getResourceId(19, 0);
        this.B = typedArray.getInteger(0, 8388627);
        this.f230s = typedArray.getInteger(2, 48);
        int dimensionPixelOffset = typedArray.getDimensionPixelOffset(22, 0);
        dimensionPixelOffset = typedArray.hasValue(27) ? typedArray.getDimensionPixelOffset(27, dimensionPixelOffset) : dimensionPixelOffset;
        this.f235x = dimensionPixelOffset;
        this.f234w = dimensionPixelOffset;
        this.f233v = dimensionPixelOffset;
        this.f232u = dimensionPixelOffset;
        int dimensionPixelOffset2 = typedArray.getDimensionPixelOffset(25, -1);
        if (dimensionPixelOffset2 >= 0) {
            this.f232u = dimensionPixelOffset2;
        }
        int dimensionPixelOffset3 = typedArray.getDimensionPixelOffset(24, -1);
        if (dimensionPixelOffset3 >= 0) {
            this.f233v = dimensionPixelOffset3;
        }
        int dimensionPixelOffset4 = typedArray.getDimensionPixelOffset(26, -1);
        if (dimensionPixelOffset4 >= 0) {
            this.f234w = dimensionPixelOffset4;
        }
        int dimensionPixelOffset5 = typedArray.getDimensionPixelOffset(23, -1);
        if (dimensionPixelOffset5 >= 0) {
            this.f235x = dimensionPixelOffset5;
        }
        this.f231t = typedArray.getDimensionPixelSize(13, -1);
        int dimensionPixelOffset6 = typedArray.getDimensionPixelOffset(9, Integer.MIN_VALUE);
        int dimensionPixelOffset7 = typedArray.getDimensionPixelOffset(5, Integer.MIN_VALUE);
        int dimensionPixelSize = typedArray.getDimensionPixelSize(7, 0);
        int dimensionPixelSize2 = typedArray.getDimensionPixelSize(8, 0);
        d();
        o2 o2Var = this.f236y;
        o2Var.f2411h = false;
        if (dimensionPixelSize != Integer.MIN_VALUE) {
            o2Var.f2408e = dimensionPixelSize;
            o2Var.f2405a = dimensionPixelSize;
        }
        if (dimensionPixelSize2 != Integer.MIN_VALUE) {
            o2Var.f2409f = dimensionPixelSize2;
            o2Var.f2406b = dimensionPixelSize2;
        }
        if (dimensionPixelOffset6 != Integer.MIN_VALUE || dimensionPixelOffset7 != Integer.MIN_VALUE) {
            o2Var.a(dimensionPixelOffset6, dimensionPixelOffset7);
        }
        this.f237z = typedArray.getDimensionPixelOffset(10, Integer.MIN_VALUE);
        this.A = typedArray.getDimensionPixelOffset(6, Integer.MIN_VALUE);
        this.f222k = w3.n(4);
        this.f223l = typedArray.getText(3);
        CharSequence text = typedArray.getText(21);
        if (!TextUtils.isEmpty(text)) {
            setTitle(text);
        }
        CharSequence text2 = typedArray.getText(18);
        if (!TextUtils.isEmpty(text2)) {
            setSubtitle(text2);
        }
        this.f226o = getContext();
        setPopupTheme(typedArray.getResourceId(17, 0));
        Drawable n4 = w3.n(16);
        if (n4 != null) {
            setNavigationIcon(n4);
        }
        CharSequence text3 = typedArray.getText(15);
        if (!TextUtils.isEmpty(text3)) {
            setNavigationContentDescription(text3);
        }
        Drawable n5 = w3.n(11);
        if (n5 != null) {
            setLogo(n5);
        }
        CharSequence text4 = typedArray.getText(12);
        if (!TextUtils.isEmpty(text4)) {
            setLogoDescription(text4);
        }
        if (typedArray.hasValue(29)) {
            setTitleTextColor(w3.m(29));
        }
        if (typedArray.hasValue(20)) {
            setSubtitleTextColor(w3.m(20));
        }
        if (typedArray.hasValue(14)) {
            getMenuInflater().inflate(typedArray.getResourceId(14, 0), getMenu());
        }
        w3.y();
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        Context context = getContext();
        z2 z2Var = new z2(context, attributeSet);
        z2Var.f2527a = 0;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a.f1241b);
        z2Var.f2527a = obtainStyledAttributes.getInt(0, 0);
        obtainStyledAttributes.recycle();
        z2Var.f2528b = 0;
        return z2Var;
    }

    public void setCollapseContentDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            c();
        }
        y yVar = this.f224m;
        if (yVar != null) {
            yVar.setContentDescription(charSequence);
        }
    }

    public void setCollapseIcon(Drawable drawable) {
        if (drawable != null) {
            c();
            this.f224m.setImageDrawable(drawable);
        } else {
            y yVar = this.f224m;
            if (yVar != null) {
                yVar.setImageDrawable(this.f222k);
            }
        }
    }

    public void setLogo(Drawable drawable) {
        if (drawable != null) {
            if (this.f221j == null) {
                this.f221j = new z(getContext(), null, 0);
            }
            if (!n(this.f221j)) {
                b(this.f221j, true);
            }
        } else {
            z zVar = this.f221j;
            if (zVar != null && n(zVar)) {
                removeView(this.f221j);
                this.J.remove(this.f221j);
            }
        }
        z zVar2 = this.f221j;
        if (zVar2 != null) {
            zVar2.setImageDrawable(drawable);
        }
    }

    public void setLogoDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence) && this.f221j == null) {
            this.f221j = new z(getContext(), null, 0);
        }
        z zVar = this.f221j;
        if (zVar != null) {
            zVar.setContentDescription(charSequence);
        }
    }

    public void setNavigationContentDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            g();
        }
        y yVar = this.i;
        if (yVar != null) {
            yVar.setContentDescription(charSequence);
            h.a.l0(this.i, charSequence);
        }
    }

    public void setNavigationIcon(Drawable drawable) {
        if (drawable != null) {
            g();
            if (!n(this.i)) {
                b(this.i, true);
            }
        } else {
            y yVar = this.i;
            if (yVar != null && n(yVar)) {
                removeView(this.i);
                this.J.remove(this.i);
            }
        }
        y yVar2 = this.i;
        if (yVar2 != null) {
            yVar2.setImageDrawable(drawable);
        }
    }

    public void setSubtitle(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            c1 c1Var = this.f220h;
            if (c1Var != null && n(c1Var)) {
                removeView(this.f220h);
                this.J.remove(this.f220h);
            }
        } else {
            if (this.f220h == null) {
                Context context = getContext();
                c1 c1Var2 = new c1(context, null);
                this.f220h = c1Var2;
                c1Var2.setSingleLine();
                this.f220h.setEllipsize(TextUtils.TruncateAt.END);
                int i = this.f229r;
                if (i != 0) {
                    this.f220h.setTextAppearance(context, i);
                }
                ColorStateList colorStateList = this.F;
                if (colorStateList != null) {
                    this.f220h.setTextColor(colorStateList);
                }
            }
            if (!n(this.f220h)) {
                b(this.f220h, true);
            }
        }
        c1 c1Var3 = this.f220h;
        if (c1Var3 != null) {
            c1Var3.setText(charSequence);
        }
        this.D = charSequence;
    }

    public void setSubtitleTextColor(ColorStateList colorStateList) {
        this.F = colorStateList;
        c1 c1Var = this.f220h;
        if (c1Var != null) {
            c1Var.setTextColor(colorStateList);
        }
    }

    public void setTitle(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            c1 c1Var = this.f219g;
            if (c1Var != null && n(c1Var)) {
                removeView(this.f219g);
                this.J.remove(this.f219g);
            }
        } else {
            if (this.f219g == null) {
                Context context = getContext();
                c1 c1Var2 = new c1(context, null);
                this.f219g = c1Var2;
                c1Var2.setSingleLine();
                this.f219g.setEllipsize(TextUtils.TruncateAt.END);
                int i = this.f228q;
                if (i != 0) {
                    this.f219g.setTextAppearance(context, i);
                }
                ColorStateList colorStateList = this.E;
                if (colorStateList != null) {
                    this.f219g.setTextColor(colorStateList);
                }
            }
            if (!n(this.f219g)) {
                b(this.f219g, true);
            }
        }
        c1 c1Var3 = this.f219g;
        if (c1Var3 != null) {
            c1Var3.setText(charSequence);
        }
        this.C = charSequence;
    }

    public void setTitleTextColor(ColorStateList colorStateList) {
        this.E = colorStateList;
        c1 c1Var = this.f219g;
        if (c1Var != null) {
            c1Var.setTextColor(colorStateList);
        }
    }

    public void setOnMenuItemClickListener(a3 a3Var) {
    }
}
