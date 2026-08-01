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
import b4.d;
import com.gdmhkmf.belbet.R;
import com.google.android.material.datepicker.p;
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
import l.f3;
import l.i1;
import l.j;
import l.l2;
import l.s2;
import l.t2;
import l.u2;
import l.v;
import l.v2;
import l.w;
import l.w2;
import l.x2;
import l.y2;
import l.z0;
import l.z2;
import n0.p0;

/* compiled from: r8-map-id-cbdb90155a17acee3f5e5c838b1038a1056cff151b1a2a170c159711c8afb558 */
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
    public final t2 N;
    public a3 O;
    public j P;
    public v2 Q;
    public boolean R;
    public OnBackInvokedCallback S;
    public OnBackInvokedDispatcher T;
    public boolean U;
    public final g V;

    /* renamed from: f, reason: collision with root package name */
    public ActionMenuView f345f;

    /* renamed from: g, reason: collision with root package name */
    public z0 f346g;
    public z0 h;
    public v i;

    /* renamed from: j, reason: collision with root package name */
    public w f347j;

    /* renamed from: k, reason: collision with root package name */
    public final Drawable f348k;

    /* renamed from: l, reason: collision with root package name */
    public final CharSequence f349l;

    /* renamed from: m, reason: collision with root package name */
    public v f350m;

    /* renamed from: n, reason: collision with root package name */
    public View f351n;

    /* renamed from: o, reason: collision with root package name */
    public Context f352o;

    /* renamed from: p, reason: collision with root package name */
    public int f353p;

    /* renamed from: q, reason: collision with root package name */
    public int f354q;

    /* renamed from: r, reason: collision with root package name */
    public int f355r;

    /* renamed from: s, reason: collision with root package name */
    public final int f356s;

    /* renamed from: t, reason: collision with root package name */
    public final int f357t;

    /* renamed from: u, reason: collision with root package name */
    public int f358u;

    /* renamed from: v, reason: collision with root package name */
    public int f359v;

    /* renamed from: w, reason: collision with root package name */
    public int f360w;

    /* renamed from: x, reason: collision with root package name */
    public int f361x;

    /* renamed from: y, reason: collision with root package name */
    public l2 f362y;

    /* renamed from: z, reason: collision with root package name */
    public int f363z;

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

    public static w2 h() {
        w2 w2Var = new w2(-2, -2);
        w2Var.f2603b = 0;
        w2Var.f2602a = 8388627;
        return w2Var;
    }

    public static w2 i(ViewGroup.LayoutParams layoutParams) {
        boolean z4 = layoutParams instanceof w2;
        if (z4) {
            w2 w2Var = (w2) layoutParams;
            w2 w2Var2 = new w2(w2Var);
            w2Var2.f2603b = 0;
            w2Var2.f2603b = w2Var.f2603b;
            return w2Var2;
        }
        if (z4) {
            w2 w2Var3 = new w2((w2) layoutParams);
            w2Var3.f2603b = 0;
            return w2Var3;
        }
        if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
            w2 w2Var4 = new w2(layoutParams);
            w2Var4.f2603b = 0;
            return w2Var4;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        w2 w2Var5 = new w2(marginLayoutParams);
        w2Var5.f2603b = 0;
        ((ViewGroup.MarginLayoutParams) w2Var5).leftMargin = marginLayoutParams.leftMargin;
        ((ViewGroup.MarginLayoutParams) w2Var5).topMargin = marginLayoutParams.topMargin;
        ((ViewGroup.MarginLayoutParams) w2Var5).rightMargin = marginLayoutParams.rightMargin;
        ((ViewGroup.MarginLayoutParams) w2Var5).bottomMargin = marginLayoutParams.bottomMargin;
        return w2Var5;
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
        boolean z4 = getLayoutDirection() == 1;
        int childCount = getChildCount();
        int absoluteGravity = Gravity.getAbsoluteGravity(i, getLayoutDirection());
        arrayList.clear();
        if (!z4) {
            for (int i4 = 0; i4 < childCount; i4++) {
                View childAt = getChildAt(i4);
                w2 w2Var = (w2) childAt.getLayoutParams();
                if (w2Var.f2603b == 0 && s(childAt)) {
                    int i5 = w2Var.f2602a;
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
            w2 w2Var2 = (w2) childAt2.getLayoutParams();
            if (w2Var2.f2603b == 0 && s(childAt2)) {
                int i7 = w2Var2.f2602a;
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

    public final void b(View view, boolean z4) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        w2 h = layoutParams == null ? h() : !checkLayoutParams(layoutParams) ? i(layoutParams) : (w2) layoutParams;
        h.f2603b = 1;
        if (!z4 || this.f351n == null) {
            addView(view, h);
        } else {
            view.setLayoutParams(h);
            this.J.add(view);
        }
    }

    public final void c() {
        if (this.f350m == null) {
            v vVar = new v(getContext(), null, R.attr.toolbarNavigationButtonStyle);
            this.f350m = vVar;
            vVar.setImageDrawable(this.f348k);
            this.f350m.setContentDescription(this.f349l);
            w2 h = h();
            h.f2602a = (this.f356s & 112) | 8388611;
            h.f2603b = 2;
            this.f350m.setLayoutParams(h);
            this.f350m.setOnClickListener(new p(3, this));
        }
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return super.checkLayoutParams(layoutParams) && (layoutParams instanceof w2);
    }

    public final void d() {
        if (this.f362y == null) {
            l2 l2Var = new l2();
            l2Var.f2501a = 0;
            l2Var.f2502b = 0;
            l2Var.f2503c = Integer.MIN_VALUE;
            l2Var.d = Integer.MIN_VALUE;
            l2Var.f2504e = 0;
            l2Var.f2505f = 0;
            l2Var.f2506g = false;
            l2Var.h = false;
            this.f362y = l2Var;
        }
    }

    public final void e() {
        f();
        ActionMenuView actionMenuView = this.f345f;
        if (actionMenuView.f327u == null) {
            m mVar = (m) actionMenuView.getMenu();
            if (this.Q == null) {
                this.Q = new v2(this);
            }
            this.f345f.setExpandedActionViewsExclusive(true);
            mVar.b(this.Q, this.f352o);
            t();
        }
    }

    public final void f() {
        if (this.f345f == null) {
            ActionMenuView actionMenuView = new ActionMenuView(getContext(), null);
            this.f345f = actionMenuView;
            actionMenuView.setPopupTheme(this.f353p);
            this.f345f.setOnMenuItemClickListener(this.N);
            ActionMenuView actionMenuView2 = this.f345f;
            t2 t2Var = new t2(this);
            actionMenuView2.getClass();
            actionMenuView2.f332z = t2Var;
            w2 h = h();
            h.f2602a = (this.f356s & 112) | 8388613;
            this.f345f.setLayoutParams(h);
            b(this.f345f, false);
        }
    }

    public final void g() {
        if (this.i == null) {
            this.i = new v(getContext(), null, R.attr.toolbarNavigationButtonStyle);
            w2 h = h();
            h.f2602a = (this.f356s & 112) | 8388611;
            this.i.setLayoutParams(h);
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
        v vVar = this.f350m;
        if (vVar != null) {
            return vVar.getContentDescription();
        }
        return null;
    }

    public Drawable getCollapseIcon() {
        v vVar = this.f350m;
        if (vVar != null) {
            return vVar.getDrawable();
        }
        return null;
    }

    public int getContentInsetEnd() {
        l2 l2Var = this.f362y;
        if (l2Var != null) {
            return l2Var.f2506g ? l2Var.f2501a : l2Var.f2502b;
        }
        return 0;
    }

    public int getContentInsetEndWithActions() {
        int i = this.A;
        return i != Integer.MIN_VALUE ? i : getContentInsetEnd();
    }

    public int getContentInsetLeft() {
        l2 l2Var = this.f362y;
        if (l2Var != null) {
            return l2Var.f2501a;
        }
        return 0;
    }

    public int getContentInsetRight() {
        l2 l2Var = this.f362y;
        if (l2Var != null) {
            return l2Var.f2502b;
        }
        return 0;
    }

    public int getContentInsetStart() {
        l2 l2Var = this.f362y;
        if (l2Var != null) {
            return l2Var.f2506g ? l2Var.f2502b : l2Var.f2501a;
        }
        return 0;
    }

    public int getContentInsetStartWithNavigation() {
        int i = this.f363z;
        return i != Integer.MIN_VALUE ? i : getContentInsetStart();
    }

    public int getCurrentContentInsetEnd() {
        m mVar;
        ActionMenuView actionMenuView = this.f345f;
        return (actionMenuView == null || (mVar = actionMenuView.f327u) == null || !mVar.hasVisibleItems()) ? getContentInsetEnd() : Math.max(getContentInsetEnd(), Math.max(this.A, 0));
    }

    public int getCurrentContentInsetLeft() {
        return getLayoutDirection() == 1 ? getCurrentContentInsetEnd() : getCurrentContentInsetStart();
    }

    public int getCurrentContentInsetRight() {
        return getLayoutDirection() == 1 ? getCurrentContentInsetStart() : getCurrentContentInsetEnd();
    }

    public int getCurrentContentInsetStart() {
        return getNavigationIcon() != null ? Math.max(getContentInsetStart(), Math.max(this.f363z, 0)) : getContentInsetStart();
    }

    public Drawable getLogo() {
        w wVar = this.f347j;
        if (wVar != null) {
            return wVar.getDrawable();
        }
        return null;
    }

    public CharSequence getLogoDescription() {
        w wVar = this.f347j;
        if (wVar != null) {
            return wVar.getContentDescription();
        }
        return null;
    }

    public Menu getMenu() {
        e();
        return this.f345f.getMenu();
    }

    public View getNavButtonView() {
        return this.i;
    }

    public CharSequence getNavigationContentDescription() {
        v vVar = this.i;
        if (vVar != null) {
            return vVar.getContentDescription();
        }
        return null;
    }

    public Drawable getNavigationIcon() {
        v vVar = this.i;
        if (vVar != null) {
            return vVar.getDrawable();
        }
        return null;
    }

    public j getOuterActionMenuPresenter() {
        return this.P;
    }

    public Drawable getOverflowIcon() {
        e();
        return this.f345f.getOverflowIcon();
    }

    public Context getPopupContext() {
        return this.f352o;
    }

    public int getPopupTheme() {
        return this.f353p;
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
        return this.f361x;
    }

    public int getTitleMarginEnd() {
        return this.f359v;
    }

    public int getTitleMarginStart() {
        return this.f358u;
    }

    public int getTitleMarginTop() {
        return this.f360w;
    }

    public final TextView getTitleTextView() {
        return this.f346g;
    }

    public i1 getWrapper() {
        Drawable drawable;
        if (this.O == null) {
            a3 a3Var = new a3();
            a3Var.f2401n = 0;
            a3Var.f2391a = this;
            a3Var.h = getTitle();
            a3Var.i = getSubtitle();
            a3Var.f2396g = a3Var.h != null;
            a3Var.f2395f = getNavigationIcon();
            t i = t.i(R.attr.actionBarStyle, 0, getContext(), null, a.f1390a);
            TypedArray typedArray = (TypedArray) i.f473b;
            a3Var.f2402o = i.d(15);
            CharSequence text = typedArray.getText(27);
            if (!TextUtils.isEmpty(text)) {
                a3Var.f2396g = true;
                a3Var.h = text;
                if ((a3Var.f2392b & 8) != 0) {
                    setTitle(text);
                    if (a3Var.f2396g) {
                        p0.n(getRootView(), text);
                    }
                }
            }
            CharSequence text2 = typedArray.getText(25);
            if (!TextUtils.isEmpty(text2)) {
                a3Var.i = text2;
                if ((a3Var.f2392b & 8) != 0) {
                    setSubtitle(text2);
                }
            }
            Drawable d = i.d(20);
            if (d != null) {
                a3Var.f2394e = d;
                a3Var.c();
            }
            Drawable d5 = i.d(17);
            if (d5 != null) {
                a3Var.d = d5;
                a3Var.c();
            }
            if (a3Var.f2395f == null && (drawable = a3Var.f2402o) != null) {
                a3Var.f2395f = drawable;
                if ((a3Var.f2392b & 4) != 0) {
                    setNavigationIcon(drawable);
                } else {
                    setNavigationIcon((Drawable) null);
                }
            }
            a3Var.a(typedArray.getInt(10, 0));
            int resourceId = typedArray.getResourceId(9, 0);
            if (resourceId != 0) {
                View inflate = LayoutInflater.from(getContext()).inflate(resourceId, (ViewGroup) this, false);
                View view = a3Var.f2393c;
                if (view != null && (a3Var.f2392b & 16) != 0) {
                    removeView(view);
                }
                a3Var.f2393c = inflate;
                if (inflate != null && (a3Var.f2392b & 16) != 0) {
                    addView(inflate);
                }
                a3Var.a(a3Var.f2392b | 16);
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
                this.f362y.a(max, max2);
            }
            int resourceId2 = typedArray.getResourceId(28, 0);
            if (resourceId2 != 0) {
                Context context = getContext();
                this.f354q = resourceId2;
                z0 z0Var = this.f346g;
                if (z0Var != null) {
                    z0Var.setTextAppearance(context, resourceId2);
                }
            }
            int resourceId3 = typedArray.getResourceId(26, 0);
            if (resourceId3 != 0) {
                Context context2 = getContext();
                this.f355r = resourceId3;
                z0 z0Var2 = this.h;
                if (z0Var2 != null) {
                    z0Var2.setTextAppearance(context2, resourceId3);
                }
            }
            int resourceId4 = typedArray.getResourceId(22, 0);
            if (resourceId4 != 0) {
                setPopupTheme(resourceId4);
            }
            i.k();
            if (R.string.abc_action_bar_up_description != a3Var.f2401n) {
                a3Var.f2401n = R.string.abc_action_bar_up_description;
                if (TextUtils.isEmpty(getNavigationContentDescription())) {
                    int i4 = a3Var.f2401n;
                    a3Var.f2397j = i4 != 0 ? getContext().getString(i4) : null;
                    a3Var.b();
                }
            }
            a3Var.f2397j = getNavigationContentDescription();
            setNavigationOnClickListener(new z2(a3Var));
            this.O = a3Var;
        }
        return this.O;
    }

    public final int j(View view, int i) {
        w2 w2Var = (w2) view.getLayoutParams();
        int measuredHeight = view.getMeasuredHeight();
        int i4 = i > 0 ? (measuredHeight - i) / 2 : 0;
        int i5 = w2Var.f2602a & 112;
        if (i5 != 16 && i5 != 48 && i5 != 80) {
            i5 = this.B & 112;
        }
        if (i5 == 48) {
            return getPaddingTop() - i4;
        }
        if (i5 == 80) {
            return (((getHeight() - getPaddingBottom()) - measuredHeight) - ((ViewGroup.MarginLayoutParams) w2Var).bottomMargin) - i4;
        }
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int height = getHeight();
        int i6 = (((height - paddingTop) - paddingBottom) - measuredHeight) / 2;
        int i7 = ((ViewGroup.MarginLayoutParams) w2Var).topMargin;
        if (i6 < i7) {
            i6 = i7;
        } else {
            int i8 = (((height - paddingBottom) - measuredHeight) - i6) - paddingTop;
            int i9 = ((ViewGroup.MarginLayoutParams) w2Var).bottomMargin;
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
        Iterator it = ((CopyOnWriteArrayList) this.L.f473b).iterator();
        while (it.hasNext()) {
            ((d0) it.next()).f530a.k();
        }
        ArrayList<MenuItem> currentMenuItems2 = getCurrentMenuItems();
        currentMenuItems2.removeAll(currentMenuItems);
        this.M = currentMenuItems2;
    }

    public final boolean n(View view) {
        return view.getParent() == this || this.J.contains(view);
    }

    public final int o(View view, int i, int i4, int[] iArr) {
        w2 w2Var = (w2) view.getLayoutParams();
        int i5 = ((ViewGroup.MarginLayoutParams) w2Var).leftMargin - iArr[0];
        int max = Math.max(0, i5) + i;
        iArr[0] = Math.max(0, -i5);
        int j2 = j(view, i4);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(max, j2, max + measuredWidth, view.getMeasuredHeight() + j2);
        return measuredWidth + ((ViewGroup.MarginLayoutParams) w2Var).rightMargin + max;
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
    public void onLayout(boolean z4, int i, int i4, int i5, int i6) {
        int i7;
        int i8;
        int max;
        boolean s3;
        boolean s4;
        boolean z5;
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
        boolean z6 = getLayoutDirection() == 1;
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
        WeakHashMap weakHashMap = p0.f2816a;
        int minimumHeight = getMinimumHeight();
        int min = minimumHeight >= 0 ? Math.min(minimumHeight, i6 - i4) : 0;
        if (!s(this.i)) {
            i7 = paddingLeft;
        } else {
            if (z6) {
                i8 = p(this.i, i21, min, iArr);
                i7 = paddingLeft;
                if (s(this.f350m)) {
                    if (z6) {
                        i8 = p(this.f350m, i8, min, iArr);
                    } else {
                        i7 = o(this.f350m, i7, min, iArr);
                    }
                }
                if (s(this.f345f)) {
                    if (z6) {
                        i7 = o(this.f345f, i7, min, iArr);
                    } else {
                        i8 = p(this.f345f, i8, min, iArr);
                    }
                }
                int currentContentInsetLeft = getCurrentContentInsetLeft();
                int currentContentInsetRight = getCurrentContentInsetRight();
                iArr[0] = Math.max(0, currentContentInsetLeft - i7);
                iArr[1] = Math.max(0, currentContentInsetRight - (i21 - i8));
                max = Math.max(i7, currentContentInsetLeft);
                int min2 = Math.min(i8, i21 - currentContentInsetRight);
                if (s(this.f351n)) {
                    if (z6) {
                        min2 = p(this.f351n, min2, min, iArr);
                    } else {
                        max = o(this.f351n, max, min, iArr);
                    }
                }
                if (s(this.f347j)) {
                    if (z6) {
                        min2 = p(this.f347j, min2, min, iArr);
                    } else {
                        max = o(this.f347j, max, min, iArr);
                    }
                }
                s3 = s(this.f346g);
                s4 = s(this.h);
                if (s3) {
                    z5 = z6;
                    i9 = 0;
                } else {
                    w2 w2Var = (w2) this.f346g.getLayoutParams();
                    z5 = z6;
                    i9 = this.f346g.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) w2Var).topMargin + ((ViewGroup.MarginLayoutParams) w2Var).bottomMargin;
                }
                if (!s4) {
                    w2 w2Var2 = (w2) this.h.getLayoutParams();
                    i9 = this.h.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) w2Var2).topMargin + ((ViewGroup.MarginLayoutParams) w2Var2).bottomMargin + i9;
                }
                if (!s3 || s4) {
                    z0 z0Var = !s3 ? this.f346g : this.h;
                    z0 z0Var2 = !s4 ? this.h : this.f346g;
                    w2 w2Var3 = (w2) z0Var.getLayoutParams();
                    w2 w2Var4 = (w2) z0Var2.getLayoutParams();
                    int i22 = i9;
                    boolean z7 = (!s3 && this.f346g.getMeasuredWidth() > 0) || (s4 && this.h.getMeasuredWidth() > 0);
                    i10 = this.B & 112;
                    int i23 = max;
                    if (i10 != 48) {
                        paddingTop = getPaddingTop() + ((ViewGroup.MarginLayoutParams) w2Var3).topMargin + this.f360w;
                    } else if (i10 != 80) {
                        int i24 = (((height - paddingTop2) - paddingBottom) - i22) / 2;
                        int i25 = ((ViewGroup.MarginLayoutParams) w2Var3).topMargin + this.f360w;
                        if (i24 < i25) {
                            i24 = i25;
                        } else {
                            int i26 = (((height - paddingBottom) - i22) - i24) - paddingTop2;
                            int i27 = ((ViewGroup.MarginLayoutParams) w2Var3).bottomMargin;
                            int i28 = this.f361x;
                            if (i26 < i27 + i28) {
                                i24 = Math.max(0, i24 - ((((ViewGroup.MarginLayoutParams) w2Var4).bottomMargin + i28) - i26));
                            }
                        }
                        paddingTop = paddingTop2 + i24;
                    } else {
                        paddingTop = (((height - paddingBottom) - ((ViewGroup.MarginLayoutParams) w2Var4).bottomMargin) - this.f361x) - i22;
                    }
                    if (z5) {
                        int i29 = (z7 ? this.f358u : 0) - iArr[0];
                        max = Math.max(0, i29) + i23;
                        iArr[0] = Math.max(0, -i29);
                        if (s3) {
                            w2 w2Var5 = (w2) this.f346g.getLayoutParams();
                            int measuredWidth = this.f346g.getMeasuredWidth() + max;
                            int measuredHeight = this.f346g.getMeasuredHeight() + paddingTop;
                            this.f346g.layout(max, paddingTop, measuredWidth, measuredHeight);
                            i11 = measuredWidth + this.f359v;
                            paddingTop = measuredHeight + ((ViewGroup.MarginLayoutParams) w2Var5).bottomMargin;
                        } else {
                            i11 = max;
                        }
                        if (s4) {
                            int i30 = paddingTop + ((ViewGroup.MarginLayoutParams) ((w2) this.h.getLayoutParams())).topMargin;
                            int measuredWidth2 = this.h.getMeasuredWidth() + max;
                            this.h.layout(max, i30, measuredWidth2, this.h.getMeasuredHeight() + i30);
                            i12 = measuredWidth2 + this.f359v;
                        } else {
                            i12 = max;
                        }
                        if (z7) {
                            max = Math.max(i11, i12);
                        }
                    } else {
                        int i31 = (z7 ? this.f358u : 0) - iArr[1];
                        min2 -= Math.max(0, i31);
                        iArr[1] = Math.max(0, -i31);
                        if (s3) {
                            w2 w2Var6 = (w2) this.f346g.getLayoutParams();
                            int measuredWidth3 = min2 - this.f346g.getMeasuredWidth();
                            int measuredHeight2 = this.f346g.getMeasuredHeight() + paddingTop;
                            this.f346g.layout(measuredWidth3, paddingTop, min2, measuredHeight2);
                            i13 = measuredWidth3 - this.f359v;
                            paddingTop = measuredHeight2 + ((ViewGroup.MarginLayoutParams) w2Var6).bottomMargin;
                        } else {
                            i13 = min2;
                        }
                        if (s4) {
                            int i32 = paddingTop + ((ViewGroup.MarginLayoutParams) ((w2) this.h.getLayoutParams())).topMargin;
                            this.h.layout(min2 - this.h.getMeasuredWidth(), i32, min2, this.h.getMeasuredHeight() + i32);
                            i14 = min2 - this.f359v;
                        } else {
                            i14 = min2;
                        }
                        if (z7) {
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
                    w2 w2Var7 = (w2) view.getLayoutParams();
                    int i37 = i34;
                    int i38 = ((ViewGroup.MarginLayoutParams) w2Var7).leftMargin - i35;
                    int i39 = ((ViewGroup.MarginLayoutParams) w2Var7).rightMargin - i37;
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
        if (s(this.f350m)) {
        }
        if (s(this.f345f)) {
        }
        int currentContentInsetLeft2 = getCurrentContentInsetLeft();
        int currentContentInsetRight2 = getCurrentContentInsetRight();
        iArr[0] = Math.max(0, currentContentInsetLeft2 - i7);
        iArr[1] = Math.max(0, currentContentInsetRight2 - (i21 - i8));
        max = Math.max(i7, currentContentInsetLeft2);
        int min22 = Math.min(i8, i21 - currentContentInsetRight2);
        if (s(this.f351n)) {
        }
        if (s(this.f347j)) {
        }
        s3 = s(this.f346g);
        s4 = s(this.h);
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
        w2 w2Var32 = (w2) z0Var.getLayoutParams();
        w2 w2Var42 = (w2) z0Var2.getLayoutParams();
        int i222 = i9;
        if (s3) {
        }
        i10 = this.B & 112;
        int i232 = max;
        if (i10 != 48) {
        }
        if (z5) {
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
        char c5;
        Object[] objArr;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        boolean z4 = f3.f2448a;
        int i12 = 0;
        if (getLayoutDirection() == 1) {
            objArr = true;
            c5 = 0;
        } else {
            c5 = 1;
            objArr = false;
        }
        if (s(this.i)) {
            r(this.i, i, 0, i4, this.f357t);
            i5 = k(this.i) + this.i.getMeasuredWidth();
            i6 = Math.max(0, l(this.i) + this.i.getMeasuredHeight());
            i7 = View.combineMeasuredStates(0, this.i.getMeasuredState());
        } else {
            i5 = 0;
            i6 = 0;
            i7 = 0;
        }
        if (s(this.f350m)) {
            r(this.f350m, i, 0, i4, this.f357t);
            i5 = k(this.f350m) + this.f350m.getMeasuredWidth();
            i6 = Math.max(i6, l(this.f350m) + this.f350m.getMeasuredHeight());
            i7 = View.combineMeasuredStates(i7, this.f350m.getMeasuredState());
        }
        int currentContentInsetStart = getCurrentContentInsetStart();
        int max = Math.max(currentContentInsetStart, i5);
        int max2 = Math.max(0, currentContentInsetStart - i5);
        Object[] objArr2 = objArr;
        int[] iArr = this.K;
        iArr[objArr2 == true ? 1 : 0] = max2;
        if (s(this.f345f)) {
            r(this.f345f, i, max, i4, this.f357t);
            i8 = k(this.f345f) + this.f345f.getMeasuredWidth();
            i6 = Math.max(i6, l(this.f345f) + this.f345f.getMeasuredHeight());
            i7 = View.combineMeasuredStates(i7, this.f345f.getMeasuredState());
        } else {
            i8 = 0;
        }
        int currentContentInsetEnd = getCurrentContentInsetEnd();
        int max3 = max + Math.max(currentContentInsetEnd, i8);
        iArr[c5] = Math.max(0, currentContentInsetEnd - i8);
        if (s(this.f351n)) {
            max3 += q(this.f351n, i, max3, i4, 0, iArr);
            i6 = Math.max(i6, l(this.f351n) + this.f351n.getMeasuredHeight());
            i7 = View.combineMeasuredStates(i7, this.f351n.getMeasuredState());
        }
        if (s(this.f347j)) {
            max3 += q(this.f347j, i, max3, i4, 0, iArr);
            i6 = Math.max(i6, l(this.f347j) + this.f347j.getMeasuredHeight());
            i7 = View.combineMeasuredStates(i7, this.f347j.getMeasuredState());
        }
        int childCount = getChildCount();
        for (int i13 = 0; i13 < childCount; i13++) {
            View childAt = getChildAt(i13);
            if (((w2) childAt.getLayoutParams()).f2603b == 0 && s(childAt)) {
                max3 += q(childAt, i, max3, i4, 0, iArr);
                int max4 = Math.max(i6, l(childAt) + childAt.getMeasuredHeight());
                i7 = View.combineMeasuredStates(i7, childAt.getMeasuredState());
                i6 = max4;
            } else {
                max3 = max3;
            }
        }
        int i14 = max3;
        int i15 = this.f360w + this.f361x;
        int i16 = this.f358u + this.f359v;
        if (s(this.f346g)) {
            q(this.f346g, i, i14 + i16, i4, i15, iArr);
            int k4 = k(this.f346g) + this.f346g.getMeasuredWidth();
            i9 = l(this.f346g) + this.f346g.getMeasuredHeight();
            i10 = View.combineMeasuredStates(i7, this.f346g.getMeasuredState());
            i11 = k4;
        } else {
            i9 = 0;
            i10 = i7;
            i11 = 0;
        }
        if (s(this.h)) {
            i11 = Math.max(i11, q(this.h, i, i14 + i16, i4, i15 + i9, iArr));
            i9 += l(this.h) + this.h.getMeasuredHeight();
            i10 = View.combineMeasuredStates(i10, this.h.getMeasuredState());
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
        if (!(parcelable instanceof y2)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        y2 y2Var = (y2) parcelable;
        super.onRestoreInstanceState(y2Var.f3386f);
        ActionMenuView actionMenuView = this.f345f;
        m mVar = actionMenuView != null ? actionMenuView.f327u : null;
        int i = y2Var.h;
        if (i != 0 && this.Q != null && mVar != null && (findItem = mVar.findItem(i)) != null) {
            findItem.expandActionView();
        }
        if (y2Var.i) {
            g gVar = this.V;
            removeCallbacks(gVar);
            post(gVar);
        }
    }

    @Override // android.view.View
    public final void onRtlPropertiesChanged(int i) {
        super.onRtlPropertiesChanged(i);
        d();
        l2 l2Var = this.f362y;
        boolean z4 = i == 1;
        if (z4 == l2Var.f2506g) {
            return;
        }
        l2Var.f2506g = z4;
        if (!l2Var.h) {
            l2Var.f2501a = l2Var.f2504e;
            l2Var.f2502b = l2Var.f2505f;
            return;
        }
        if (z4) {
            int i4 = l2Var.d;
            if (i4 == Integer.MIN_VALUE) {
                i4 = l2Var.f2504e;
            }
            l2Var.f2501a = i4;
            int i5 = l2Var.f2503c;
            if (i5 == Integer.MIN_VALUE) {
                i5 = l2Var.f2505f;
            }
            l2Var.f2502b = i5;
            return;
        }
        int i6 = l2Var.f2503c;
        if (i6 == Integer.MIN_VALUE) {
            i6 = l2Var.f2504e;
        }
        l2Var.f2501a = i6;
        int i7 = l2Var.d;
        if (i7 == Integer.MIN_VALUE) {
            i7 = l2Var.f2505f;
        }
        l2Var.f2502b = i7;
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        j jVar;
        o oVar;
        y2 y2Var = new y2(super.onSaveInstanceState());
        v2 v2Var = this.Q;
        if (v2Var != null && (oVar = v2Var.f2599g) != null) {
            y2Var.h = oVar.f2234a;
        }
        ActionMenuView actionMenuView = this.f345f;
        y2Var.i = (actionMenuView == null || (jVar = actionMenuView.f331y) == null || !jVar.h()) ? false : true;
        return y2Var;
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
        w2 w2Var = (w2) view.getLayoutParams();
        int i5 = ((ViewGroup.MarginLayoutParams) w2Var).rightMargin - iArr[1];
        int max = i - Math.max(0, i5);
        iArr[1] = Math.max(0, -i5);
        int j2 = j(view, i4);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(max - measuredWidth, j2, max, view.getMeasuredHeight() + j2);
        return max - (measuredWidth + ((ViewGroup.MarginLayoutParams) w2Var).leftMargin);
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

    public void setBackInvokedCallbackEnabled(boolean z4) {
        if (this.U != z4) {
            this.U = z4;
            t();
        }
    }

    public void setCollapseContentDescription(int i) {
        setCollapseContentDescription(i != 0 ? getContext().getText(i) : null);
    }

    public void setCollapseIcon(int i) {
        setCollapseIcon(d.y(getContext(), i));
    }

    public void setCollapsible(boolean z4) {
        this.R = z4;
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
        if (i != this.f363z) {
            this.f363z = i;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setLogo(int i) {
        setLogo(d.y(getContext(), i));
    }

    public void setLogoDescription(int i) {
        setLogoDescription(getContext().getText(i));
    }

    public void setNavigationContentDescription(int i) {
        setNavigationContentDescription(i != 0 ? getContext().getText(i) : null);
    }

    public void setNavigationIcon(int i) {
        setNavigationIcon(d.y(getContext(), i));
    }

    public void setNavigationOnClickListener(View.OnClickListener onClickListener) {
        g();
        this.i.setOnClickListener(onClickListener);
    }

    public void setOverflowIcon(Drawable drawable) {
        e();
        this.f345f.setOverflowIcon(drawable);
    }

    public void setPopupTheme(int i) {
        if (this.f353p != i) {
            this.f353p = i;
            if (i == 0) {
                this.f352o = getContext();
            } else {
                this.f352o = new ContextThemeWrapper(getContext(), i);
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
        this.f361x = i;
        requestLayout();
    }

    public void setTitleMarginEnd(int i) {
        this.f359v = i;
        requestLayout();
    }

    public void setTitleMarginStart(int i) {
        this.f358u = i;
        requestLayout();
    }

    public void setTitleMarginTop(int i) {
        this.f360w = i;
        requestLayout();
    }

    public void setTitleTextColor(int i) {
        setTitleTextColor(ColorStateList.valueOf(i));
    }

    public final void t() {
        OnBackInvokedDispatcher onBackInvokedDispatcher;
        if (Build.VERSION.SDK_INT >= 33) {
            OnBackInvokedDispatcher a5 = u2.a(this);
            v2 v2Var = this.Q;
            boolean z4 = (v2Var == null || v2Var.f2599g == null || a5 == null || !isAttachedToWindow() || !this.U) ? false : true;
            if (z4 && this.T == null) {
                if (this.S == null) {
                    this.S = u2.b(new s2(this, 0));
                }
                u2.c(a5, this.S);
                this.T = a5;
                return;
            }
            if (z4 || (onBackInvokedDispatcher = this.T) == null) {
                return;
            }
            u2.d(onBackInvokedDispatcher, this.S);
            this.T = null;
        }
    }

    public Toolbar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, R.attr.toolbarStyle);
        this.B = 8388627;
        this.I = new ArrayList();
        this.J = new ArrayList();
        this.K = new int[2];
        this.L = new t(new s2(this, 1));
        this.M = new ArrayList();
        this.N = new t2(this);
        this.V = new g(7, this);
        Context context2 = getContext();
        int[] iArr = a.f1409w;
        t i4 = t.i(R.attr.toolbarStyle, 0, context2, attributeSet, iArr);
        p0.l(this, context, iArr, attributeSet, (TypedArray) i4.f473b, R.attr.toolbarStyle);
        TypedArray typedArray = (TypedArray) i4.f473b;
        this.f354q = typedArray.getResourceId(28, 0);
        this.f355r = typedArray.getResourceId(19, 0);
        this.B = typedArray.getInteger(0, 8388627);
        this.f356s = typedArray.getInteger(2, 48);
        int dimensionPixelOffset = typedArray.getDimensionPixelOffset(22, 0);
        dimensionPixelOffset = typedArray.hasValue(27) ? typedArray.getDimensionPixelOffset(27, dimensionPixelOffset) : dimensionPixelOffset;
        this.f361x = dimensionPixelOffset;
        this.f360w = dimensionPixelOffset;
        this.f359v = dimensionPixelOffset;
        this.f358u = dimensionPixelOffset;
        int dimensionPixelOffset2 = typedArray.getDimensionPixelOffset(25, -1);
        if (dimensionPixelOffset2 >= 0) {
            this.f358u = dimensionPixelOffset2;
        }
        int dimensionPixelOffset3 = typedArray.getDimensionPixelOffset(24, -1);
        if (dimensionPixelOffset3 >= 0) {
            this.f359v = dimensionPixelOffset3;
        }
        int dimensionPixelOffset4 = typedArray.getDimensionPixelOffset(26, -1);
        if (dimensionPixelOffset4 >= 0) {
            this.f360w = dimensionPixelOffset4;
        }
        int dimensionPixelOffset5 = typedArray.getDimensionPixelOffset(23, -1);
        if (dimensionPixelOffset5 >= 0) {
            this.f361x = dimensionPixelOffset5;
        }
        this.f357t = typedArray.getDimensionPixelSize(13, -1);
        int dimensionPixelOffset6 = typedArray.getDimensionPixelOffset(9, Integer.MIN_VALUE);
        int dimensionPixelOffset7 = typedArray.getDimensionPixelOffset(5, Integer.MIN_VALUE);
        int dimensionPixelSize = typedArray.getDimensionPixelSize(7, 0);
        int dimensionPixelSize2 = typedArray.getDimensionPixelSize(8, 0);
        d();
        l2 l2Var = this.f362y;
        l2Var.h = false;
        if (dimensionPixelSize != Integer.MIN_VALUE) {
            l2Var.f2504e = dimensionPixelSize;
            l2Var.f2501a = dimensionPixelSize;
        }
        if (dimensionPixelSize2 != Integer.MIN_VALUE) {
            l2Var.f2505f = dimensionPixelSize2;
            l2Var.f2502b = dimensionPixelSize2;
        }
        if (dimensionPixelOffset6 != Integer.MIN_VALUE || dimensionPixelOffset7 != Integer.MIN_VALUE) {
            l2Var.a(dimensionPixelOffset6, dimensionPixelOffset7);
        }
        this.f363z = typedArray.getDimensionPixelOffset(10, Integer.MIN_VALUE);
        this.A = typedArray.getDimensionPixelOffset(6, Integer.MIN_VALUE);
        this.f348k = i4.d(4);
        this.f349l = typedArray.getText(3);
        CharSequence text = typedArray.getText(21);
        if (!TextUtils.isEmpty(text)) {
            setTitle(text);
        }
        CharSequence text2 = typedArray.getText(18);
        if (!TextUtils.isEmpty(text2)) {
            setSubtitle(text2);
        }
        this.f352o = getContext();
        setPopupTheme(typedArray.getResourceId(17, 0));
        Drawable d = i4.d(16);
        if (d != null) {
            setNavigationIcon(d);
        }
        CharSequence text3 = typedArray.getText(15);
        if (!TextUtils.isEmpty(text3)) {
            setNavigationContentDescription(text3);
        }
        Drawable d5 = i4.d(11);
        if (d5 != null) {
            setLogo(d5);
        }
        CharSequence text4 = typedArray.getText(12);
        if (!TextUtils.isEmpty(text4)) {
            setLogoDescription(text4);
        }
        if (typedArray.hasValue(29)) {
            setTitleTextColor(i4.c(29));
        }
        if (typedArray.hasValue(20)) {
            setSubtitleTextColor(i4.c(20));
        }
        if (typedArray.hasValue(14)) {
            getMenuInflater().inflate(typedArray.getResourceId(14, 0), getMenu());
        }
        i4.k();
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        Context context = getContext();
        w2 w2Var = new w2(context, attributeSet);
        w2Var.f2602a = 0;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a.f1391b);
        w2Var.f2602a = obtainStyledAttributes.getInt(0, 0);
        obtainStyledAttributes.recycle();
        w2Var.f2603b = 0;
        return w2Var;
    }

    public void setCollapseContentDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            c();
        }
        v vVar = this.f350m;
        if (vVar != null) {
            vVar.setContentDescription(charSequence);
        }
    }

    public void setCollapseIcon(Drawable drawable) {
        if (drawable != null) {
            c();
            this.f350m.setImageDrawable(drawable);
        } else {
            v vVar = this.f350m;
            if (vVar != null) {
                vVar.setImageDrawable(this.f348k);
            }
        }
    }

    public void setLogo(Drawable drawable) {
        if (drawable != null) {
            if (this.f347j == null) {
                this.f347j = new w(getContext(), null, 0);
            }
            if (!n(this.f347j)) {
                b(this.f347j, true);
            }
        } else {
            w wVar = this.f347j;
            if (wVar != null && n(wVar)) {
                removeView(this.f347j);
                this.J.remove(this.f347j);
            }
        }
        w wVar2 = this.f347j;
        if (wVar2 != null) {
            wVar2.setImageDrawable(drawable);
        }
    }

    public void setLogoDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence) && this.f347j == null) {
            this.f347j = new w(getContext(), null, 0);
        }
        w wVar = this.f347j;
        if (wVar != null) {
            wVar.setContentDescription(charSequence);
        }
    }

    public void setNavigationContentDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            g();
        }
        v vVar = this.i;
        if (vVar != null) {
            vVar.setContentDescription(charSequence);
            b3.a(this.i, charSequence);
        }
    }

    public void setNavigationIcon(Drawable drawable) {
        if (drawable != null) {
            g();
            if (!n(this.i)) {
                b(this.i, true);
            }
        } else {
            v vVar = this.i;
            if (vVar != null && n(vVar)) {
                removeView(this.i);
                this.J.remove(this.i);
            }
        }
        v vVar2 = this.i;
        if (vVar2 != null) {
            vVar2.setImageDrawable(drawable);
        }
    }

    public void setSubtitle(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            z0 z0Var = this.h;
            if (z0Var != null && n(z0Var)) {
                removeView(this.h);
                this.J.remove(this.h);
            }
        } else {
            if (this.h == null) {
                Context context = getContext();
                z0 z0Var2 = new z0(context, null);
                this.h = z0Var2;
                z0Var2.setSingleLine();
                this.h.setEllipsize(TextUtils.TruncateAt.END);
                int i = this.f355r;
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
        }
        z0 z0Var3 = this.h;
        if (z0Var3 != null) {
            z0Var3.setText(charSequence);
        }
        this.D = charSequence;
    }

    public void setSubtitleTextColor(ColorStateList colorStateList) {
        this.F = colorStateList;
        z0 z0Var = this.h;
        if (z0Var != null) {
            z0Var.setTextColor(colorStateList);
        }
    }

    public void setTitle(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            z0 z0Var = this.f346g;
            if (z0Var != null && n(z0Var)) {
                removeView(this.f346g);
                this.J.remove(this.f346g);
            }
        } else {
            if (this.f346g == null) {
                Context context = getContext();
                z0 z0Var2 = new z0(context, null);
                this.f346g = z0Var2;
                z0Var2.setSingleLine();
                this.f346g.setEllipsize(TextUtils.TruncateAt.END);
                int i = this.f354q;
                if (i != 0) {
                    this.f346g.setTextAppearance(context, i);
                }
                ColorStateList colorStateList = this.E;
                if (colorStateList != null) {
                    this.f346g.setTextColor(colorStateList);
                }
            }
            if (!n(this.f346g)) {
                b(this.f346g, true);
            }
        }
        z0 z0Var3 = this.f346g;
        if (z0Var3 != null) {
            z0Var3.setText(charSequence);
        }
        this.C = charSequence;
    }

    public void setTitleTextColor(ColorStateList colorStateList) {
        this.E = colorStateList;
        z0 z0Var = this.f346g;
        if (z0Var != null) {
            z0Var.setTextColor(colorStateList);
        }
    }

    public void setOnMenuItemClickListener(x2 x2Var) {
    }
}
