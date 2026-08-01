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
import androidx.emoji2.text.s;
import androidx.fragment.app.d0;
import androidx.fragment.app.g;
import com.gglhk.bofio.fortunetiger.R;
import e.a;
import i.h;
import j.m;
import j.o;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import k.a3;
import k.e3;
import k.i1;
import k.k;
import k.l2;
import k.r2;
import k.s2;
import k.t2;
import k.u2;
import k.v2;
import k.w;
import k.w2;
import k.x;
import k.x2;
import k.y2;
import k.z0;
import k.z2;
import k0.j0;

/* compiled from: r8-map-id-72a2021f0a77848162657eed404f056d03742612a99b9acca4b8f3bd8ed17555 */
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
    public final s L;
    public ArrayList M;
    public final s2 N;
    public z2 O;
    public k P;
    public u2 Q;
    public boolean R;
    public OnBackInvokedCallback S;
    public OnBackInvokedDispatcher T;
    public boolean U;
    public final g V;

    /* renamed from: f, reason: collision with root package name */
    public ActionMenuView f236f;
    public z0 g;
    public z0 h;

    /* renamed from: i, reason: collision with root package name */
    public w f237i;

    /* renamed from: j, reason: collision with root package name */
    public x f238j;

    /* renamed from: k, reason: collision with root package name */
    public final Drawable f239k;

    /* renamed from: l, reason: collision with root package name */
    public final CharSequence f240l;

    /* renamed from: m, reason: collision with root package name */
    public w f241m;

    /* renamed from: n, reason: collision with root package name */
    public View f242n;

    /* renamed from: o, reason: collision with root package name */
    public Context f243o;

    /* renamed from: p, reason: collision with root package name */
    public int f244p;

    /* renamed from: q, reason: collision with root package name */
    public int f245q;

    /* renamed from: r, reason: collision with root package name */
    public int f246r;

    /* renamed from: s, reason: collision with root package name */
    public final int f247s;

    /* renamed from: t, reason: collision with root package name */
    public final int f248t;

    /* renamed from: u, reason: collision with root package name */
    public int f249u;

    /* renamed from: v, reason: collision with root package name */
    public int f250v;

    /* renamed from: w, reason: collision with root package name */
    public int f251w;

    /* renamed from: x, reason: collision with root package name */
    public int f252x;

    /* renamed from: y, reason: collision with root package name */
    public l2 f253y;

    /* renamed from: z, reason: collision with root package name */
    public int f254z;

    public Toolbar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    private ArrayList<MenuItem> getCurrentMenuItems() {
        ArrayList<MenuItem> arrayList = new ArrayList<>();
        Menu menu = getMenu();
        for (int i4 = 0; i4 < menu.size(); i4++) {
            arrayList.add(menu.getItem(i4));
        }
        return arrayList;
    }

    private MenuInflater getMenuInflater() {
        return new h(getContext());
    }

    public static v2 h() {
        v2 v2Var = new v2(-2, -2);
        v2Var.f2683b = 0;
        v2Var.f2682a = 8388627;
        return v2Var;
    }

    public static v2 i(ViewGroup.LayoutParams layoutParams) {
        boolean z3 = layoutParams instanceof v2;
        if (z3) {
            v2 v2Var = (v2) layoutParams;
            v2 v2Var2 = new v2(v2Var);
            v2Var2.f2683b = 0;
            v2Var2.f2683b = v2Var.f2683b;
            return v2Var2;
        }
        if (z3) {
            v2 v2Var3 = new v2((v2) layoutParams);
            v2Var3.f2683b = 0;
            return v2Var3;
        }
        if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
            v2 v2Var4 = new v2(layoutParams);
            v2Var4.f2683b = 0;
            return v2Var4;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        v2 v2Var5 = new v2(marginLayoutParams);
        v2Var5.f2683b = 0;
        ((ViewGroup.MarginLayoutParams) v2Var5).leftMargin = marginLayoutParams.leftMargin;
        ((ViewGroup.MarginLayoutParams) v2Var5).topMargin = marginLayoutParams.topMargin;
        ((ViewGroup.MarginLayoutParams) v2Var5).rightMargin = marginLayoutParams.rightMargin;
        ((ViewGroup.MarginLayoutParams) v2Var5).bottomMargin = marginLayoutParams.bottomMargin;
        return v2Var5;
    }

    public static int k(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return marginLayoutParams.getMarginEnd() + marginLayoutParams.getMarginStart();
    }

    public static int l(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
    }

    public final void a(ArrayList arrayList, int i4) {
        boolean z3 = getLayoutDirection() == 1;
        int childCount = getChildCount();
        int absoluteGravity = Gravity.getAbsoluteGravity(i4, getLayoutDirection());
        arrayList.clear();
        if (!z3) {
            for (int i5 = 0; i5 < childCount; i5++) {
                View childAt = getChildAt(i5);
                v2 v2Var = (v2) childAt.getLayoutParams();
                if (v2Var.f2683b == 0 && s(childAt)) {
                    int i6 = v2Var.f2682a;
                    int layoutDirection = getLayoutDirection();
                    int absoluteGravity2 = Gravity.getAbsoluteGravity(i6, layoutDirection) & 7;
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
        for (int i7 = childCount - 1; i7 >= 0; i7--) {
            View childAt2 = getChildAt(i7);
            v2 v2Var2 = (v2) childAt2.getLayoutParams();
            if (v2Var2.f2683b == 0 && s(childAt2)) {
                int i8 = v2Var2.f2682a;
                int layoutDirection2 = getLayoutDirection();
                int absoluteGravity3 = Gravity.getAbsoluteGravity(i8, layoutDirection2) & 7;
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
        v2 h = layoutParams == null ? h() : !checkLayoutParams(layoutParams) ? i(layoutParams) : (v2) layoutParams;
        h.f2683b = 1;
        if (!z3 || this.f242n == null) {
            addView(view, h);
        } else {
            view.setLayoutParams(h);
            this.J.add(view);
        }
    }

    public final void c() {
        if (this.f241m == null) {
            w wVar = new w(getContext(), null, R.attr.toolbarNavigationButtonStyle);
            this.f241m = wVar;
            wVar.setImageDrawable(this.f239k);
            this.f241m.setContentDescription(this.f240l);
            v2 h = h();
            h.f2682a = (this.f247s & 112) | 8388611;
            h.f2683b = 2;
            this.f241m.setLayoutParams(h);
            this.f241m.setOnClickListener(new com.google.android.material.datepicker.k(3, this));
        }
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return super.checkLayoutParams(layoutParams) && (layoutParams instanceof v2);
    }

    public final void d() {
        if (this.f253y == null) {
            l2 l2Var = new l2();
            l2Var.f2590a = 0;
            l2Var.f2591b = 0;
            l2Var.c = Integer.MIN_VALUE;
            l2Var.f2592d = Integer.MIN_VALUE;
            l2Var.f2593e = 0;
            l2Var.f2594f = 0;
            l2Var.g = false;
            l2Var.h = false;
            this.f253y = l2Var;
        }
    }

    public final void e() {
        f();
        ActionMenuView actionMenuView = this.f236f;
        if (actionMenuView.f219u == null) {
            m mVar = (m) actionMenuView.getMenu();
            if (this.Q == null) {
                this.Q = new u2(this);
            }
            this.f236f.setExpandedActionViewsExclusive(true);
            mVar.b(this.Q, this.f243o);
            t();
        }
    }

    public final void f() {
        if (this.f236f == null) {
            ActionMenuView actionMenuView = new ActionMenuView(getContext(), null);
            this.f236f = actionMenuView;
            actionMenuView.setPopupTheme(this.f244p);
            this.f236f.setOnMenuItemClickListener(this.N);
            ActionMenuView actionMenuView2 = this.f236f;
            s2 s2Var = new s2(this);
            actionMenuView2.getClass();
            actionMenuView2.f224z = s2Var;
            v2 h = h();
            h.f2682a = (this.f247s & 112) | 8388613;
            this.f236f.setLayoutParams(h);
            b(this.f236f, false);
        }
    }

    public final void g() {
        if (this.f237i == null) {
            this.f237i = new w(getContext(), null, R.attr.toolbarNavigationButtonStyle);
            v2 h = h();
            h.f2682a = (this.f247s & 112) | 8388611;
            this.f237i.setLayoutParams(h);
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
        w wVar = this.f241m;
        if (wVar != null) {
            return wVar.getContentDescription();
        }
        return null;
    }

    public Drawable getCollapseIcon() {
        w wVar = this.f241m;
        if (wVar != null) {
            return wVar.getDrawable();
        }
        return null;
    }

    public int getContentInsetEnd() {
        l2 l2Var = this.f253y;
        if (l2Var != null) {
            return l2Var.g ? l2Var.f2590a : l2Var.f2591b;
        }
        return 0;
    }

    public int getContentInsetEndWithActions() {
        int i4 = this.A;
        return i4 != Integer.MIN_VALUE ? i4 : getContentInsetEnd();
    }

    public int getContentInsetLeft() {
        l2 l2Var = this.f253y;
        if (l2Var != null) {
            return l2Var.f2590a;
        }
        return 0;
    }

    public int getContentInsetRight() {
        l2 l2Var = this.f253y;
        if (l2Var != null) {
            return l2Var.f2591b;
        }
        return 0;
    }

    public int getContentInsetStart() {
        l2 l2Var = this.f253y;
        if (l2Var != null) {
            return l2Var.g ? l2Var.f2591b : l2Var.f2590a;
        }
        return 0;
    }

    public int getContentInsetStartWithNavigation() {
        int i4 = this.f254z;
        return i4 != Integer.MIN_VALUE ? i4 : getContentInsetStart();
    }

    public int getCurrentContentInsetEnd() {
        m mVar;
        ActionMenuView actionMenuView = this.f236f;
        return (actionMenuView == null || (mVar = actionMenuView.f219u) == null || !mVar.hasVisibleItems()) ? getContentInsetEnd() : Math.max(getContentInsetEnd(), Math.max(this.A, 0));
    }

    public int getCurrentContentInsetLeft() {
        return getLayoutDirection() == 1 ? getCurrentContentInsetEnd() : getCurrentContentInsetStart();
    }

    public int getCurrentContentInsetRight() {
        return getLayoutDirection() == 1 ? getCurrentContentInsetStart() : getCurrentContentInsetEnd();
    }

    public int getCurrentContentInsetStart() {
        return getNavigationIcon() != null ? Math.max(getContentInsetStart(), Math.max(this.f254z, 0)) : getContentInsetStart();
    }

    public Drawable getLogo() {
        x xVar = this.f238j;
        if (xVar != null) {
            return xVar.getDrawable();
        }
        return null;
    }

    public CharSequence getLogoDescription() {
        x xVar = this.f238j;
        if (xVar != null) {
            return xVar.getContentDescription();
        }
        return null;
    }

    public Menu getMenu() {
        e();
        return this.f236f.getMenu();
    }

    public View getNavButtonView() {
        return this.f237i;
    }

    public CharSequence getNavigationContentDescription() {
        w wVar = this.f237i;
        if (wVar != null) {
            return wVar.getContentDescription();
        }
        return null;
    }

    public Drawable getNavigationIcon() {
        w wVar = this.f237i;
        if (wVar != null) {
            return wVar.getDrawable();
        }
        return null;
    }

    public k getOuterActionMenuPresenter() {
        return this.P;
    }

    public Drawable getOverflowIcon() {
        e();
        return this.f236f.getOverflowIcon();
    }

    public Context getPopupContext() {
        return this.f243o;
    }

    public int getPopupTheme() {
        return this.f244p;
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
        return this.f252x;
    }

    public int getTitleMarginEnd() {
        return this.f250v;
    }

    public int getTitleMarginStart() {
        return this.f249u;
    }

    public int getTitleMarginTop() {
        return this.f251w;
    }

    public final TextView getTitleTextView() {
        return this.g;
    }

    public i1 getWrapper() {
        Drawable drawable;
        if (this.O == null) {
            z2 z2Var = new z2();
            z2Var.f2709n = 0;
            z2Var.f2699a = this;
            z2Var.h = getTitle();
            z2Var.f2704i = getSubtitle();
            z2Var.g = z2Var.h != null;
            z2Var.f2703f = getNavigationIcon();
            s r3 = s.r(R.attr.actionBarStyle, 0, getContext(), null, a.f1495a);
            TypedArray typedArray = (TypedArray) r3.c;
            z2Var.f2710o = r3.i(15);
            CharSequence text = typedArray.getText(27);
            if (!TextUtils.isEmpty(text)) {
                z2Var.g = true;
                z2Var.h = text;
                if ((z2Var.f2700b & 8) != 0) {
                    setTitle(text);
                    if (z2Var.g) {
                        j0.n(getRootView(), text);
                    }
                }
            }
            CharSequence text2 = typedArray.getText(25);
            if (!TextUtils.isEmpty(text2)) {
                z2Var.f2704i = text2;
                if ((z2Var.f2700b & 8) != 0) {
                    setSubtitle(text2);
                }
            }
            Drawable i4 = r3.i(20);
            if (i4 != null) {
                z2Var.f2702e = i4;
                z2Var.c();
            }
            Drawable i5 = r3.i(17);
            if (i5 != null) {
                z2Var.f2701d = i5;
                z2Var.c();
            }
            if (z2Var.f2703f == null && (drawable = z2Var.f2710o) != null) {
                z2Var.f2703f = drawable;
                if ((z2Var.f2700b & 4) != 0) {
                    setNavigationIcon(drawable);
                } else {
                    setNavigationIcon((Drawable) null);
                }
            }
            z2Var.a(typedArray.getInt(10, 0));
            int resourceId = typedArray.getResourceId(9, 0);
            if (resourceId != 0) {
                View inflate = LayoutInflater.from(getContext()).inflate(resourceId, (ViewGroup) this, false);
                View view = z2Var.c;
                if (view != null && (z2Var.f2700b & 16) != 0) {
                    removeView(view);
                }
                z2Var.c = inflate;
                if (inflate != null && (z2Var.f2700b & 16) != 0) {
                    addView(inflate);
                }
                z2Var.a(z2Var.f2700b | 16);
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
                this.f253y.a(max, max2);
            }
            int resourceId2 = typedArray.getResourceId(28, 0);
            if (resourceId2 != 0) {
                Context context = getContext();
                this.f245q = resourceId2;
                z0 z0Var = this.g;
                if (z0Var != null) {
                    z0Var.setTextAppearance(context, resourceId2);
                }
            }
            int resourceId3 = typedArray.getResourceId(26, 0);
            if (resourceId3 != 0) {
                Context context2 = getContext();
                this.f246r = resourceId3;
                z0 z0Var2 = this.h;
                if (z0Var2 != null) {
                    z0Var2.setTextAppearance(context2, resourceId3);
                }
            }
            int resourceId4 = typedArray.getResourceId(22, 0);
            if (resourceId4 != 0) {
                setPopupTheme(resourceId4);
            }
            r3.t();
            if (R.string.abc_action_bar_up_description != z2Var.f2709n) {
                z2Var.f2709n = R.string.abc_action_bar_up_description;
                if (TextUtils.isEmpty(getNavigationContentDescription())) {
                    int i6 = z2Var.f2709n;
                    z2Var.f2705j = i6 != 0 ? getContext().getString(i6) : null;
                    z2Var.b();
                }
            }
            z2Var.f2705j = getNavigationContentDescription();
            setNavigationOnClickListener(new y2(z2Var));
            this.O = z2Var;
        }
        return this.O;
    }

    public final int j(View view, int i4) {
        v2 v2Var = (v2) view.getLayoutParams();
        int measuredHeight = view.getMeasuredHeight();
        int i5 = i4 > 0 ? (measuredHeight - i4) / 2 : 0;
        int i6 = v2Var.f2682a & 112;
        if (i6 != 16 && i6 != 48 && i6 != 80) {
            i6 = this.B & 112;
        }
        if (i6 == 48) {
            return getPaddingTop() - i5;
        }
        if (i6 == 80) {
            return (((getHeight() - getPaddingBottom()) - measuredHeight) - ((ViewGroup.MarginLayoutParams) v2Var).bottomMargin) - i5;
        }
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int height = getHeight();
        int i7 = (((height - paddingTop) - paddingBottom) - measuredHeight) / 2;
        int i8 = ((ViewGroup.MarginLayoutParams) v2Var).topMargin;
        if (i7 < i8) {
            i7 = i8;
        } else {
            int i9 = (((height - paddingBottom) - measuredHeight) - i7) - paddingTop;
            int i10 = ((ViewGroup.MarginLayoutParams) v2Var).bottomMargin;
            if (i9 < i10) {
                i7 = Math.max(0, i7 - (i10 - i9));
            }
        }
        return paddingTop + i7;
    }

    public final void m() {
        ArrayList arrayList = this.M;
        int size = arrayList.size();
        int i4 = 0;
        while (i4 < size) {
            Object obj = arrayList.get(i4);
            i4++;
            getMenu().removeItem(((MenuItem) obj).getItemId());
        }
        getMenu();
        ArrayList<MenuItem> currentMenuItems = getCurrentMenuItems();
        getMenuInflater();
        Iterator it = ((CopyOnWriteArrayList) this.L.c).iterator();
        while (it.hasNext()) {
            ((d0) it.next()).f414a.j();
        }
        ArrayList<MenuItem> currentMenuItems2 = getCurrentMenuItems();
        currentMenuItems2.removeAll(currentMenuItems);
        this.M = currentMenuItems2;
    }

    public final boolean n(View view) {
        return view.getParent() == this || this.J.contains(view);
    }

    public final int o(View view, int i4, int i5, int[] iArr) {
        v2 v2Var = (v2) view.getLayoutParams();
        int i6 = ((ViewGroup.MarginLayoutParams) v2Var).leftMargin - iArr[0];
        int max = Math.max(0, i6) + i4;
        iArr[0] = Math.max(0, -i6);
        int j4 = j(view, i5);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(max, j4, max + measuredWidth, view.getMeasuredHeight() + j4);
        return measuredWidth + ((ViewGroup.MarginLayoutParams) v2Var).rightMargin + max;
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
    public void onLayout(boolean z3, int i4, int i5, int i6, int i7) {
        int i8;
        int i9;
        int max;
        boolean s2;
        boolean s3;
        boolean z4;
        int i10;
        int i11;
        int paddingTop;
        int i12;
        int i13;
        int i14;
        int i15;
        int size;
        int i16;
        int i17;
        int size2;
        int i18;
        int size3;
        int i19;
        int i20;
        int i21;
        int size4;
        boolean z5 = getLayoutDirection() == 1;
        int width = getWidth();
        int height = getHeight();
        int paddingLeft = getPaddingLeft();
        int paddingRight = getPaddingRight();
        int paddingTop2 = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int i22 = width - paddingRight;
        int[] iArr = this.K;
        iArr[1] = 0;
        iArr[0] = 0;
        WeakHashMap weakHashMap = j0.f2752a;
        int minimumHeight = getMinimumHeight();
        int min = minimumHeight >= 0 ? Math.min(minimumHeight, i7 - i5) : 0;
        if (!s(this.f237i)) {
            i8 = paddingLeft;
        } else {
            if (z5) {
                i9 = p(this.f237i, i22, min, iArr);
                i8 = paddingLeft;
                if (s(this.f241m)) {
                    if (z5) {
                        i9 = p(this.f241m, i9, min, iArr);
                    } else {
                        i8 = o(this.f241m, i8, min, iArr);
                    }
                }
                if (s(this.f236f)) {
                    if (z5) {
                        i8 = o(this.f236f, i8, min, iArr);
                    } else {
                        i9 = p(this.f236f, i9, min, iArr);
                    }
                }
                int currentContentInsetLeft = getCurrentContentInsetLeft();
                int currentContentInsetRight = getCurrentContentInsetRight();
                iArr[0] = Math.max(0, currentContentInsetLeft - i8);
                iArr[1] = Math.max(0, currentContentInsetRight - (i22 - i9));
                max = Math.max(i8, currentContentInsetLeft);
                int min2 = Math.min(i9, i22 - currentContentInsetRight);
                if (s(this.f242n)) {
                    if (z5) {
                        min2 = p(this.f242n, min2, min, iArr);
                    } else {
                        max = o(this.f242n, max, min, iArr);
                    }
                }
                if (s(this.f238j)) {
                    if (z5) {
                        min2 = p(this.f238j, min2, min, iArr);
                    } else {
                        max = o(this.f238j, max, min, iArr);
                    }
                }
                s2 = s(this.g);
                s3 = s(this.h);
                if (s2) {
                    z4 = z5;
                    i10 = 0;
                } else {
                    v2 v2Var = (v2) this.g.getLayoutParams();
                    z4 = z5;
                    i10 = this.g.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) v2Var).topMargin + ((ViewGroup.MarginLayoutParams) v2Var).bottomMargin;
                }
                if (!s3) {
                    v2 v2Var2 = (v2) this.h.getLayoutParams();
                    i10 = this.h.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) v2Var2).topMargin + ((ViewGroup.MarginLayoutParams) v2Var2).bottomMargin + i10;
                }
                if (!s2 || s3) {
                    z0 z0Var = !s2 ? this.g : this.h;
                    z0 z0Var2 = !s3 ? this.h : this.g;
                    v2 v2Var3 = (v2) z0Var.getLayoutParams();
                    v2 v2Var4 = (v2) z0Var2.getLayoutParams();
                    int i23 = i10;
                    boolean z6 = (!s2 && this.g.getMeasuredWidth() > 0) || (s3 && this.h.getMeasuredWidth() > 0);
                    i11 = this.B & 112;
                    int i24 = max;
                    if (i11 != 48) {
                        paddingTop = getPaddingTop() + ((ViewGroup.MarginLayoutParams) v2Var3).topMargin + this.f251w;
                    } else if (i11 != 80) {
                        int i25 = (((height - paddingTop2) - paddingBottom) - i23) / 2;
                        int i26 = ((ViewGroup.MarginLayoutParams) v2Var3).topMargin + this.f251w;
                        if (i25 < i26) {
                            i25 = i26;
                        } else {
                            int i27 = (((height - paddingBottom) - i23) - i25) - paddingTop2;
                            int i28 = ((ViewGroup.MarginLayoutParams) v2Var3).bottomMargin;
                            int i29 = this.f252x;
                            if (i27 < i28 + i29) {
                                i25 = Math.max(0, i25 - ((((ViewGroup.MarginLayoutParams) v2Var4).bottomMargin + i29) - i27));
                            }
                        }
                        paddingTop = paddingTop2 + i25;
                    } else {
                        paddingTop = (((height - paddingBottom) - ((ViewGroup.MarginLayoutParams) v2Var4).bottomMargin) - this.f252x) - i23;
                    }
                    if (z4) {
                        int i30 = (z6 ? this.f249u : 0) - iArr[0];
                        max = Math.max(0, i30) + i24;
                        iArr[0] = Math.max(0, -i30);
                        if (s2) {
                            v2 v2Var5 = (v2) this.g.getLayoutParams();
                            int measuredWidth = this.g.getMeasuredWidth() + max;
                            int measuredHeight = this.g.getMeasuredHeight() + paddingTop;
                            this.g.layout(max, paddingTop, measuredWidth, measuredHeight);
                            i12 = measuredWidth + this.f250v;
                            paddingTop = measuredHeight + ((ViewGroup.MarginLayoutParams) v2Var5).bottomMargin;
                        } else {
                            i12 = max;
                        }
                        if (s3) {
                            int i31 = paddingTop + ((ViewGroup.MarginLayoutParams) ((v2) this.h.getLayoutParams())).topMargin;
                            int measuredWidth2 = this.h.getMeasuredWidth() + max;
                            this.h.layout(max, i31, measuredWidth2, this.h.getMeasuredHeight() + i31);
                            i13 = measuredWidth2 + this.f250v;
                        } else {
                            i13 = max;
                        }
                        if (z6) {
                            max = Math.max(i12, i13);
                        }
                    } else {
                        int i32 = (z6 ? this.f249u : 0) - iArr[1];
                        min2 -= Math.max(0, i32);
                        iArr[1] = Math.max(0, -i32);
                        if (s2) {
                            v2 v2Var6 = (v2) this.g.getLayoutParams();
                            int measuredWidth3 = min2 - this.g.getMeasuredWidth();
                            int measuredHeight2 = this.g.getMeasuredHeight() + paddingTop;
                            this.g.layout(measuredWidth3, paddingTop, min2, measuredHeight2);
                            i14 = measuredWidth3 - this.f250v;
                            paddingTop = measuredHeight2 + ((ViewGroup.MarginLayoutParams) v2Var6).bottomMargin;
                        } else {
                            i14 = min2;
                        }
                        if (s3) {
                            int i33 = paddingTop + ((ViewGroup.MarginLayoutParams) ((v2) this.h.getLayoutParams())).topMargin;
                            this.h.layout(min2 - this.h.getMeasuredWidth(), i33, min2, this.h.getMeasuredHeight() + i33);
                            i15 = min2 - this.f250v;
                        } else {
                            i15 = min2;
                        }
                        if (z6) {
                            min2 = Math.min(i14, i15);
                        }
                        max = i24;
                    }
                }
                ArrayList arrayList = this.I;
                a(arrayList, 3);
                size = arrayList.size();
                i16 = max;
                for (i17 = 0; i17 < size; i17++) {
                    i16 = o((View) arrayList.get(i17), i16, min, iArr);
                }
                a(arrayList, 5);
                size2 = arrayList.size();
                for (i18 = 0; i18 < size2; i18++) {
                    min2 = p((View) arrayList.get(i18), min2, min, iArr);
                }
                a(arrayList, 1);
                int i34 = iArr[0];
                int i35 = iArr[1];
                size3 = arrayList.size();
                int i36 = i34;
                i19 = 0;
                int i37 = 0;
                while (i19 < size3) {
                    View view = (View) arrayList.get(i19);
                    v2 v2Var7 = (v2) view.getLayoutParams();
                    int i38 = i35;
                    int i39 = ((ViewGroup.MarginLayoutParams) v2Var7).leftMargin - i36;
                    int i40 = ((ViewGroup.MarginLayoutParams) v2Var7).rightMargin - i38;
                    int max2 = Math.max(0, i39);
                    int max3 = Math.max(0, i40);
                    int max4 = Math.max(0, -i39);
                    int max5 = Math.max(0, -i40);
                    i37 += view.getMeasuredWidth() + max2 + max3;
                    i19++;
                    i36 = max4;
                    i35 = max5;
                }
                i21 = ((((width - paddingLeft) - paddingRight) / 2) + paddingLeft) - (i37 / 2);
                int i41 = i37 + i21;
                if (i21 >= i16) {
                    i16 = i41 > min2 ? i21 - (i41 - min2) : i21;
                }
                size4 = arrayList.size();
                for (i20 = 0; i20 < size4; i20++) {
                    i16 = o((View) arrayList.get(i20), i16, min, iArr);
                }
                arrayList.clear();
            }
            i8 = o(this.f237i, paddingLeft, min, iArr);
        }
        i9 = i22;
        if (s(this.f241m)) {
        }
        if (s(this.f236f)) {
        }
        int currentContentInsetLeft2 = getCurrentContentInsetLeft();
        int currentContentInsetRight2 = getCurrentContentInsetRight();
        iArr[0] = Math.max(0, currentContentInsetLeft2 - i8);
        iArr[1] = Math.max(0, currentContentInsetRight2 - (i22 - i9));
        max = Math.max(i8, currentContentInsetLeft2);
        int min22 = Math.min(i9, i22 - currentContentInsetRight2);
        if (s(this.f242n)) {
        }
        if (s(this.f238j)) {
        }
        s2 = s(this.g);
        s3 = s(this.h);
        if (s2) {
        }
        if (!s3) {
        }
        if (!s2) {
        }
        if (!s2) {
        }
        if (!s3) {
        }
        v2 v2Var32 = (v2) z0Var.getLayoutParams();
        v2 v2Var42 = (v2) z0Var2.getLayoutParams();
        int i232 = i10;
        if (s2) {
        }
        i11 = this.B & 112;
        int i242 = max;
        if (i11 != 48) {
        }
        if (z4) {
        }
        ArrayList arrayList2 = this.I;
        a(arrayList2, 3);
        size = arrayList2.size();
        i16 = max;
        while (i17 < size) {
        }
        a(arrayList2, 5);
        size2 = arrayList2.size();
        while (i18 < size2) {
        }
        a(arrayList2, 1);
        int i342 = iArr[0];
        int i352 = iArr[1];
        size3 = arrayList2.size();
        int i362 = i342;
        i19 = 0;
        int i372 = 0;
        while (i19 < size3) {
        }
        i21 = ((((width - paddingLeft) - paddingRight) / 2) + paddingLeft) - (i372 / 2);
        int i412 = i372 + i21;
        if (i21 >= i16) {
        }
        size4 = arrayList2.size();
        while (i20 < size4) {
        }
        arrayList2.clear();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.View
    public final void onMeasure(int i4, int i5) {
        char c;
        Object[] objArr;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        boolean z3 = e3.f2538a;
        int i13 = 0;
        if (getLayoutDirection() == 1) {
            objArr = true;
            c = 0;
        } else {
            c = 1;
            objArr = false;
        }
        if (s(this.f237i)) {
            r(this.f237i, i4, 0, i5, this.f248t);
            i6 = k(this.f237i) + this.f237i.getMeasuredWidth();
            i7 = Math.max(0, l(this.f237i) + this.f237i.getMeasuredHeight());
            i8 = View.combineMeasuredStates(0, this.f237i.getMeasuredState());
        } else {
            i6 = 0;
            i7 = 0;
            i8 = 0;
        }
        if (s(this.f241m)) {
            r(this.f241m, i4, 0, i5, this.f248t);
            i6 = k(this.f241m) + this.f241m.getMeasuredWidth();
            i7 = Math.max(i7, l(this.f241m) + this.f241m.getMeasuredHeight());
            i8 = View.combineMeasuredStates(i8, this.f241m.getMeasuredState());
        }
        int currentContentInsetStart = getCurrentContentInsetStart();
        int max = Math.max(currentContentInsetStart, i6);
        int max2 = Math.max(0, currentContentInsetStart - i6);
        Object[] objArr2 = objArr;
        int[] iArr = this.K;
        iArr[objArr2 == true ? 1 : 0] = max2;
        if (s(this.f236f)) {
            r(this.f236f, i4, max, i5, this.f248t);
            i9 = k(this.f236f) + this.f236f.getMeasuredWidth();
            i7 = Math.max(i7, l(this.f236f) + this.f236f.getMeasuredHeight());
            i8 = View.combineMeasuredStates(i8, this.f236f.getMeasuredState());
        } else {
            i9 = 0;
        }
        int currentContentInsetEnd = getCurrentContentInsetEnd();
        int max3 = max + Math.max(currentContentInsetEnd, i9);
        iArr[c] = Math.max(0, currentContentInsetEnd - i9);
        if (s(this.f242n)) {
            max3 += q(this.f242n, i4, max3, i5, 0, iArr);
            i7 = Math.max(i7, l(this.f242n) + this.f242n.getMeasuredHeight());
            i8 = View.combineMeasuredStates(i8, this.f242n.getMeasuredState());
        }
        if (s(this.f238j)) {
            max3 += q(this.f238j, i4, max3, i5, 0, iArr);
            i7 = Math.max(i7, l(this.f238j) + this.f238j.getMeasuredHeight());
            i8 = View.combineMeasuredStates(i8, this.f238j.getMeasuredState());
        }
        int childCount = getChildCount();
        for (int i14 = 0; i14 < childCount; i14++) {
            View childAt = getChildAt(i14);
            if (((v2) childAt.getLayoutParams()).f2683b == 0 && s(childAt)) {
                max3 += q(childAt, i4, max3, i5, 0, iArr);
                int max4 = Math.max(i7, l(childAt) + childAt.getMeasuredHeight());
                i8 = View.combineMeasuredStates(i8, childAt.getMeasuredState());
                i7 = max4;
            } else {
                max3 = max3;
            }
        }
        int i15 = max3;
        int i16 = this.f251w + this.f252x;
        int i17 = this.f249u + this.f250v;
        if (s(this.g)) {
            q(this.g, i4, i15 + i17, i5, i16, iArr);
            int k4 = k(this.g) + this.g.getMeasuredWidth();
            i10 = l(this.g) + this.g.getMeasuredHeight();
            i11 = View.combineMeasuredStates(i8, this.g.getMeasuredState());
            i12 = k4;
        } else {
            i10 = 0;
            i11 = i8;
            i12 = 0;
        }
        if (s(this.h)) {
            i12 = Math.max(i12, q(this.h, i4, i15 + i17, i5, i16 + i10, iArr));
            i10 += l(this.h) + this.h.getMeasuredHeight();
            i11 = View.combineMeasuredStates(i11, this.h.getMeasuredState());
        }
        int max5 = Math.max(i7, i10);
        int paddingRight = getPaddingRight() + getPaddingLeft() + i15 + i12;
        int paddingBottom = getPaddingBottom() + getPaddingTop() + max5;
        int resolveSizeAndState = View.resolveSizeAndState(Math.max(paddingRight, getSuggestedMinimumWidth()), i4, (-16777216) & i11);
        int resolveSizeAndState2 = View.resolveSizeAndState(Math.max(paddingBottom, getSuggestedMinimumHeight()), i5, i11 << 16);
        if (this.R) {
            int childCount2 = getChildCount();
            for (int i18 = 0; i18 < childCount2; i18++) {
                View childAt2 = getChildAt(i18);
                if (!s(childAt2) || childAt2.getMeasuredWidth() <= 0 || childAt2.getMeasuredHeight() <= 0) {
                }
            }
            setMeasuredDimension(resolveSizeAndState, i13);
        }
        i13 = resolveSizeAndState2;
        setMeasuredDimension(resolveSizeAndState, i13);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        MenuItem findItem;
        if (!(parcelable instanceof x2)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        x2 x2Var = (x2) parcelable;
        super.onRestoreInstanceState(x2Var.f3016f);
        ActionMenuView actionMenuView = this.f236f;
        m mVar = actionMenuView != null ? actionMenuView.f219u : null;
        int i4 = x2Var.h;
        if (i4 != 0 && this.Q != null && mVar != null && (findItem = mVar.findItem(i4)) != null) {
            findItem.expandActionView();
        }
        if (x2Var.f2687i) {
            g gVar = this.V;
            removeCallbacks(gVar);
            post(gVar);
        }
    }

    @Override // android.view.View
    public final void onRtlPropertiesChanged(int i4) {
        super.onRtlPropertiesChanged(i4);
        d();
        l2 l2Var = this.f253y;
        boolean z3 = i4 == 1;
        if (z3 == l2Var.g) {
            return;
        }
        l2Var.g = z3;
        if (!l2Var.h) {
            l2Var.f2590a = l2Var.f2593e;
            l2Var.f2591b = l2Var.f2594f;
            return;
        }
        if (z3) {
            int i5 = l2Var.f2592d;
            if (i5 == Integer.MIN_VALUE) {
                i5 = l2Var.f2593e;
            }
            l2Var.f2590a = i5;
            int i6 = l2Var.c;
            if (i6 == Integer.MIN_VALUE) {
                i6 = l2Var.f2594f;
            }
            l2Var.f2591b = i6;
            return;
        }
        int i7 = l2Var.c;
        if (i7 == Integer.MIN_VALUE) {
            i7 = l2Var.f2593e;
        }
        l2Var.f2590a = i7;
        int i8 = l2Var.f2592d;
        if (i8 == Integer.MIN_VALUE) {
            i8 = l2Var.f2594f;
        }
        l2Var.f2591b = i8;
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        k kVar;
        o oVar;
        x2 x2Var = new x2(super.onSaveInstanceState());
        u2 u2Var = this.Q;
        if (u2Var != null && (oVar = u2Var.g) != null) {
            x2Var.h = oVar.f2211a;
        }
        ActionMenuView actionMenuView = this.f236f;
        x2Var.f2687i = (actionMenuView == null || (kVar = actionMenuView.f223y) == null || !kVar.f()) ? false : true;
        return x2Var;
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

    public final int p(View view, int i4, int i5, int[] iArr) {
        v2 v2Var = (v2) view.getLayoutParams();
        int i6 = ((ViewGroup.MarginLayoutParams) v2Var).rightMargin - iArr[1];
        int max = i4 - Math.max(0, i6);
        iArr[1] = Math.max(0, -i6);
        int j4 = j(view, i5);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(max - measuredWidth, j4, max, view.getMeasuredHeight() + j4);
        return max - (measuredWidth + ((ViewGroup.MarginLayoutParams) v2Var).leftMargin);
    }

    public final int q(View view, int i4, int i5, int i6, int i7, int[] iArr) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int i8 = marginLayoutParams.leftMargin - iArr[0];
        int i9 = marginLayoutParams.rightMargin - iArr[1];
        int max = Math.max(0, i9) + Math.max(0, i8);
        iArr[0] = Math.max(0, -i8);
        iArr[1] = Math.max(0, -i9);
        view.measure(ViewGroup.getChildMeasureSpec(i4, getPaddingRight() + getPaddingLeft() + max + i5, marginLayoutParams.width), ViewGroup.getChildMeasureSpec(i6, getPaddingBottom() + getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i7, marginLayoutParams.height));
        return view.getMeasuredWidth() + max;
    }

    public final void r(View view, int i4, int i5, int i6, int i7) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i4, getPaddingRight() + getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i5, marginLayoutParams.width);
        int childMeasureSpec2 = ViewGroup.getChildMeasureSpec(i6, getPaddingBottom() + getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, marginLayoutParams.height);
        int mode = View.MeasureSpec.getMode(childMeasureSpec2);
        if (mode != 1073741824 && i7 >= 0) {
            if (mode != 0) {
                i7 = Math.min(View.MeasureSpec.getSize(childMeasureSpec2), i7);
            }
            childMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i7, 1073741824);
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

    public void setCollapseContentDescription(int i4) {
        setCollapseContentDescription(i4 != 0 ? getContext().getText(i4) : null);
    }

    public void setCollapseIcon(int i4) {
        setCollapseIcon(k3.m.w(getContext(), i4));
    }

    public void setCollapsible(boolean z3) {
        this.R = z3;
        requestLayout();
    }

    public void setContentInsetEndWithActions(int i4) {
        if (i4 < 0) {
            i4 = Integer.MIN_VALUE;
        }
        if (i4 != this.A) {
            this.A = i4;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setContentInsetStartWithNavigation(int i4) {
        if (i4 < 0) {
            i4 = Integer.MIN_VALUE;
        }
        if (i4 != this.f254z) {
            this.f254z = i4;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setLogo(int i4) {
        setLogo(k3.m.w(getContext(), i4));
    }

    public void setLogoDescription(int i4) {
        setLogoDescription(getContext().getText(i4));
    }

    public void setNavigationContentDescription(int i4) {
        setNavigationContentDescription(i4 != 0 ? getContext().getText(i4) : null);
    }

    public void setNavigationIcon(int i4) {
        setNavigationIcon(k3.m.w(getContext(), i4));
    }

    public void setNavigationOnClickListener(View.OnClickListener onClickListener) {
        g();
        this.f237i.setOnClickListener(onClickListener);
    }

    public void setOverflowIcon(Drawable drawable) {
        e();
        this.f236f.setOverflowIcon(drawable);
    }

    public void setPopupTheme(int i4) {
        if (this.f244p != i4) {
            this.f244p = i4;
            if (i4 == 0) {
                this.f243o = getContext();
            } else {
                this.f243o = new ContextThemeWrapper(getContext(), i4);
            }
        }
    }

    public void setSubtitle(int i4) {
        setSubtitle(getContext().getText(i4));
    }

    public void setSubtitleTextColor(int i4) {
        setSubtitleTextColor(ColorStateList.valueOf(i4));
    }

    public void setTitle(int i4) {
        setTitle(getContext().getText(i4));
    }

    public void setTitleMarginBottom(int i4) {
        this.f252x = i4;
        requestLayout();
    }

    public void setTitleMarginEnd(int i4) {
        this.f250v = i4;
        requestLayout();
    }

    public void setTitleMarginStart(int i4) {
        this.f249u = i4;
        requestLayout();
    }

    public void setTitleMarginTop(int i4) {
        this.f251w = i4;
        requestLayout();
    }

    public void setTitleTextColor(int i4) {
        setTitleTextColor(ColorStateList.valueOf(i4));
    }

    public final void t() {
        OnBackInvokedDispatcher onBackInvokedDispatcher;
        if (Build.VERSION.SDK_INT >= 33) {
            OnBackInvokedDispatcher a4 = t2.a(this);
            u2 u2Var = this.Q;
            boolean z3 = (u2Var == null || u2Var.g == null || a4 == null || !isAttachedToWindow() || !this.U) ? false : true;
            if (z3 && this.T == null) {
                if (this.S == null) {
                    this.S = t2.b(new r2(this, 0));
                }
                t2.c(a4, this.S);
                this.T = a4;
                return;
            }
            if (z3 || (onBackInvokedDispatcher = this.T) == null) {
                return;
            }
            t2.d(onBackInvokedDispatcher, this.S);
            this.T = null;
        }
    }

    public Toolbar(Context context, AttributeSet attributeSet, int i4) {
        super(context, attributeSet, R.attr.toolbarStyle);
        this.B = 8388627;
        this.I = new ArrayList();
        this.J = new ArrayList();
        this.K = new int[2];
        this.L = new s(new r2(this, 1));
        this.M = new ArrayList();
        this.N = new s2(this);
        this.V = new g(9, this);
        Context context2 = getContext();
        int[] iArr = a.f1514w;
        s r3 = s.r(R.attr.toolbarStyle, 0, context2, attributeSet, iArr);
        j0.l(this, context, iArr, attributeSet, (TypedArray) r3.c, R.attr.toolbarStyle);
        TypedArray typedArray = (TypedArray) r3.c;
        this.f245q = typedArray.getResourceId(28, 0);
        this.f246r = typedArray.getResourceId(19, 0);
        this.B = typedArray.getInteger(0, 8388627);
        this.f247s = typedArray.getInteger(2, 48);
        int dimensionPixelOffset = typedArray.getDimensionPixelOffset(22, 0);
        dimensionPixelOffset = typedArray.hasValue(27) ? typedArray.getDimensionPixelOffset(27, dimensionPixelOffset) : dimensionPixelOffset;
        this.f252x = dimensionPixelOffset;
        this.f251w = dimensionPixelOffset;
        this.f250v = dimensionPixelOffset;
        this.f249u = dimensionPixelOffset;
        int dimensionPixelOffset2 = typedArray.getDimensionPixelOffset(25, -1);
        if (dimensionPixelOffset2 >= 0) {
            this.f249u = dimensionPixelOffset2;
        }
        int dimensionPixelOffset3 = typedArray.getDimensionPixelOffset(24, -1);
        if (dimensionPixelOffset3 >= 0) {
            this.f250v = dimensionPixelOffset3;
        }
        int dimensionPixelOffset4 = typedArray.getDimensionPixelOffset(26, -1);
        if (dimensionPixelOffset4 >= 0) {
            this.f251w = dimensionPixelOffset4;
        }
        int dimensionPixelOffset5 = typedArray.getDimensionPixelOffset(23, -1);
        if (dimensionPixelOffset5 >= 0) {
            this.f252x = dimensionPixelOffset5;
        }
        this.f248t = typedArray.getDimensionPixelSize(13, -1);
        int dimensionPixelOffset6 = typedArray.getDimensionPixelOffset(9, Integer.MIN_VALUE);
        int dimensionPixelOffset7 = typedArray.getDimensionPixelOffset(5, Integer.MIN_VALUE);
        int dimensionPixelSize = typedArray.getDimensionPixelSize(7, 0);
        int dimensionPixelSize2 = typedArray.getDimensionPixelSize(8, 0);
        d();
        l2 l2Var = this.f253y;
        l2Var.h = false;
        if (dimensionPixelSize != Integer.MIN_VALUE) {
            l2Var.f2593e = dimensionPixelSize;
            l2Var.f2590a = dimensionPixelSize;
        }
        if (dimensionPixelSize2 != Integer.MIN_VALUE) {
            l2Var.f2594f = dimensionPixelSize2;
            l2Var.f2591b = dimensionPixelSize2;
        }
        if (dimensionPixelOffset6 != Integer.MIN_VALUE || dimensionPixelOffset7 != Integer.MIN_VALUE) {
            l2Var.a(dimensionPixelOffset6, dimensionPixelOffset7);
        }
        this.f254z = typedArray.getDimensionPixelOffset(10, Integer.MIN_VALUE);
        this.A = typedArray.getDimensionPixelOffset(6, Integer.MIN_VALUE);
        this.f239k = r3.i(4);
        this.f240l = typedArray.getText(3);
        CharSequence text = typedArray.getText(21);
        if (!TextUtils.isEmpty(text)) {
            setTitle(text);
        }
        CharSequence text2 = typedArray.getText(18);
        if (!TextUtils.isEmpty(text2)) {
            setSubtitle(text2);
        }
        this.f243o = getContext();
        setPopupTheme(typedArray.getResourceId(17, 0));
        Drawable i5 = r3.i(16);
        if (i5 != null) {
            setNavigationIcon(i5);
        }
        CharSequence text3 = typedArray.getText(15);
        if (!TextUtils.isEmpty(text3)) {
            setNavigationContentDescription(text3);
        }
        Drawable i6 = r3.i(11);
        if (i6 != null) {
            setLogo(i6);
        }
        CharSequence text4 = typedArray.getText(12);
        if (!TextUtils.isEmpty(text4)) {
            setLogoDescription(text4);
        }
        if (typedArray.hasValue(29)) {
            setTitleTextColor(r3.h(29));
        }
        if (typedArray.hasValue(20)) {
            setSubtitleTextColor(r3.h(20));
        }
        if (typedArray.hasValue(14)) {
            getMenuInflater().inflate(typedArray.getResourceId(14, 0), getMenu());
        }
        r3.t();
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        Context context = getContext();
        v2 v2Var = new v2(context, attributeSet);
        v2Var.f2682a = 0;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a.f1496b);
        v2Var.f2682a = obtainStyledAttributes.getInt(0, 0);
        obtainStyledAttributes.recycle();
        v2Var.f2683b = 0;
        return v2Var;
    }

    public void setCollapseContentDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            c();
        }
        w wVar = this.f241m;
        if (wVar != null) {
            wVar.setContentDescription(charSequence);
        }
    }

    public void setCollapseIcon(Drawable drawable) {
        if (drawable != null) {
            c();
            this.f241m.setImageDrawable(drawable);
        } else {
            w wVar = this.f241m;
            if (wVar != null) {
                wVar.setImageDrawable(this.f239k);
            }
        }
    }

    public void setLogo(Drawable drawable) {
        if (drawable != null) {
            if (this.f238j == null) {
                this.f238j = new x(getContext(), null, 0);
            }
            if (!n(this.f238j)) {
                b(this.f238j, true);
            }
        } else {
            x xVar = this.f238j;
            if (xVar != null && n(xVar)) {
                removeView(this.f238j);
                this.J.remove(this.f238j);
            }
        }
        x xVar2 = this.f238j;
        if (xVar2 != null) {
            xVar2.setImageDrawable(drawable);
        }
    }

    public void setLogoDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence) && this.f238j == null) {
            this.f238j = new x(getContext(), null, 0);
        }
        x xVar = this.f238j;
        if (xVar != null) {
            xVar.setContentDescription(charSequence);
        }
    }

    public void setNavigationContentDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            g();
        }
        w wVar = this.f237i;
        if (wVar != null) {
            wVar.setContentDescription(charSequence);
            a3.a(this.f237i, charSequence);
        }
    }

    public void setNavigationIcon(Drawable drawable) {
        if (drawable != null) {
            g();
            if (!n(this.f237i)) {
                b(this.f237i, true);
            }
        } else {
            w wVar = this.f237i;
            if (wVar != null && n(wVar)) {
                removeView(this.f237i);
                this.J.remove(this.f237i);
            }
        }
        w wVar2 = this.f237i;
        if (wVar2 != null) {
            wVar2.setImageDrawable(drawable);
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
                int i4 = this.f246r;
                if (i4 != 0) {
                    this.h.setTextAppearance(context, i4);
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
            z0 z0Var = this.g;
            if (z0Var != null && n(z0Var)) {
                removeView(this.g);
                this.J.remove(this.g);
            }
        } else {
            if (this.g == null) {
                Context context = getContext();
                z0 z0Var2 = new z0(context, null);
                this.g = z0Var2;
                z0Var2.setSingleLine();
                this.g.setEllipsize(TextUtils.TruncateAt.END);
                int i4 = this.f245q;
                if (i4 != 0) {
                    this.g.setTextAppearance(context, i4);
                }
                ColorStateList colorStateList = this.E;
                if (colorStateList != null) {
                    this.g.setTextColor(colorStateList);
                }
            }
            if (!n(this.g)) {
                b(this.g, true);
            }
        }
        z0 z0Var3 = this.g;
        if (z0Var3 != null) {
            z0Var3.setText(charSequence);
        }
        this.C = charSequence;
    }

    public void setTitleTextColor(ColorStateList colorStateList) {
        this.E = colorStateList;
        z0 z0Var = this.g;
        if (z0Var != null) {
            z0Var.setTextColor(colorStateList);
        }
    }

    public void setOnMenuItemClickListener(w2 w2Var) {
    }
}
