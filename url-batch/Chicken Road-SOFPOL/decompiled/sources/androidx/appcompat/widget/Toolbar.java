package androidx.appcompat.widget;

import a0.g1;
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
import com.snovikpovik.vuevnxsj.R;
import h.a;
import h4.b;
import h4.h;
import j.d;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import k.i;
import k.j;
import l.a2;
import l.b2;
import l.d2;
import l.e2;
import l.f;
import l.f2;
import l.g2;
import l.h2;
import l.i2;
import l.j0;
import l.p2;
import l.q0;
import l.s1;
import l.w;
import l.x;
import l.z1;
import q3.k;
import q3.k0;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public class Toolbar extends ViewGroup {
    public CharSequence A;
    public CharSequence B;
    public ColorStateList C;
    public ColorStateList D;
    public boolean E;
    public boolean F;
    public final ArrayList G;
    public final ArrayList H;
    public final int[] I;
    public final k J;
    public ArrayList K;
    public final a2 L;
    public i2 M;
    public e2 N;
    public boolean O;
    public OnBackInvokedCallback P;
    public OnBackInvokedDispatcher Q;
    public boolean R;
    public final b S;

    /* renamed from: d, reason: collision with root package name */
    public ActionMenuView f419d;

    /* renamed from: e, reason: collision with root package name */
    public j0 f420e;

    /* renamed from: f, reason: collision with root package name */
    public j0 f421f;

    /* renamed from: g, reason: collision with root package name */
    public w f422g;

    /* renamed from: h, reason: collision with root package name */
    public x f423h;
    public final Drawable i;

    /* renamed from: j, reason: collision with root package name */
    public final CharSequence f424j;

    /* renamed from: k, reason: collision with root package name */
    public w f425k;

    /* renamed from: l, reason: collision with root package name */
    public View f426l;

    /* renamed from: m, reason: collision with root package name */
    public Context f427m;

    /* renamed from: n, reason: collision with root package name */
    public int f428n;

    /* renamed from: o, reason: collision with root package name */
    public int f429o;

    /* renamed from: p, reason: collision with root package name */
    public int f430p;

    /* renamed from: q, reason: collision with root package name */
    public final int f431q;

    /* renamed from: r, reason: collision with root package name */
    public final int f432r;

    /* renamed from: s, reason: collision with root package name */
    public int f433s;

    /* renamed from: t, reason: collision with root package name */
    public int f434t;

    /* renamed from: u, reason: collision with root package name */
    public int f435u;

    /* renamed from: v, reason: collision with root package name */
    public int f436v;

    /* renamed from: w, reason: collision with root package name */
    public s1 f437w;

    /* renamed from: x, reason: collision with root package name */
    public int f438x;

    /* renamed from: y, reason: collision with root package name */
    public int f439y;

    /* renamed from: z, reason: collision with root package name */
    public final int f440z;

    public Toolbar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public static f2 g() {
        f2 f2Var = new f2(-2, -2);
        f2Var.f4247b = 0;
        f2Var.f4246a = 8388627;
        return f2Var;
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
        return new d(getContext());
    }

    public static f2 h(ViewGroup.LayoutParams layoutParams) {
        boolean z3 = layoutParams instanceof f2;
        if (z3) {
            f2 f2Var = (f2) layoutParams;
            f2 f2Var2 = new f2(f2Var);
            f2Var2.f4247b = 0;
            f2Var2.f4247b = f2Var.f4247b;
            return f2Var2;
        }
        if (z3) {
            f2 f2Var3 = new f2((f2) layoutParams);
            f2Var3.f4247b = 0;
            return f2Var3;
        }
        if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
            f2 f2Var4 = new f2(layoutParams);
            f2Var4.f4247b = 0;
            return f2Var4;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        f2 f2Var5 = new f2(marginLayoutParams);
        f2Var5.f4247b = 0;
        ((ViewGroup.MarginLayoutParams) f2Var5).leftMargin = marginLayoutParams.leftMargin;
        ((ViewGroup.MarginLayoutParams) f2Var5).topMargin = marginLayoutParams.topMargin;
        ((ViewGroup.MarginLayoutParams) f2Var5).rightMargin = marginLayoutParams.rightMargin;
        ((ViewGroup.MarginLayoutParams) f2Var5).bottomMargin = marginLayoutParams.bottomMargin;
        return f2Var5;
    }

    public static int j(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return marginLayoutParams.getMarginEnd() + marginLayoutParams.getMarginStart();
    }

    public static int k(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
    }

    public final void a(int i, ArrayList arrayList) {
        boolean z3 = getLayoutDirection() == 1;
        int childCount = getChildCount();
        int absoluteGravity = Gravity.getAbsoluteGravity(i, getLayoutDirection());
        arrayList.clear();
        if (!z3) {
            for (int i8 = 0; i8 < childCount; i8++) {
                View childAt = getChildAt(i8);
                f2 f2Var = (f2) childAt.getLayoutParams();
                if (f2Var.f4247b == 0 && r(childAt)) {
                    int i9 = f2Var.f4246a;
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
            f2 f2Var2 = (f2) childAt2.getLayoutParams();
            if (f2Var2.f4247b == 0 && r(childAt2)) {
                int i11 = f2Var2.f4246a;
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

    public final void b(View view, boolean z3) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        f2 g3 = layoutParams == null ? g() : !checkLayoutParams(layoutParams) ? h(layoutParams) : (f2) layoutParams;
        g3.f4247b = 1;
        if (!z3 || this.f426l == null) {
            addView(view, g3);
        } else {
            view.setLayoutParams(g3);
            this.H.add(view);
        }
    }

    public final void c() {
        if (this.f425k == null) {
            w wVar = new w(getContext(), null, R.attr.toolbarNavigationButtonStyle);
            this.f425k = wVar;
            wVar.setImageDrawable(this.i);
            this.f425k.setContentDescription(this.f424j);
            f2 g3 = g();
            g3.f4246a = (this.f431q & 112) | 8388611;
            g3.f4247b = 2;
            this.f425k.setLayoutParams(g3);
            this.f425k.setOnClickListener(new b2(this));
        }
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return super.checkLayoutParams(layoutParams) && (layoutParams instanceof f2);
    }

    public final void d() {
        if (this.f437w == null) {
            s1 s1Var = new s1();
            s1Var.f4404a = 0;
            s1Var.f4405b = 0;
            s1Var.f4406c = Integer.MIN_VALUE;
            s1Var.f4407d = Integer.MIN_VALUE;
            s1Var.f4408e = 0;
            s1Var.f4409f = 0;
            s1Var.f4410g = false;
            s1Var.f4411h = false;
            this.f437w = s1Var;
        }
    }

    public final void e() {
        if (this.f419d == null) {
            ActionMenuView actionMenuView = new ActionMenuView(getContext(), null);
            this.f419d = actionMenuView;
            actionMenuView.setPopupTheme(this.f428n);
            this.f419d.setOnMenuItemClickListener(this.L);
            ActionMenuView actionMenuView2 = this.f419d;
            a2 a2Var = new a2(this);
            actionMenuView2.getClass();
            actionMenuView2.f403w = a2Var;
            f2 g3 = g();
            g3.f4246a = (this.f431q & 112) | 8388613;
            this.f419d.setLayoutParams(g3);
            b(this.f419d, false);
        }
        ActionMenuView actionMenuView3 = this.f419d;
        if (actionMenuView3.f399s == null) {
            i iVar = (i) actionMenuView3.getMenu();
            if (this.N == null) {
                this.N = new e2(this);
            }
            this.f419d.setExpandedActionViewsExclusive(true);
            iVar.b(this.N, this.f427m);
            s();
        }
    }

    public final void f() {
        if (this.f422g == null) {
            this.f422g = new w(getContext(), null, R.attr.toolbarNavigationButtonStyle);
            f2 g3 = g();
            g3.f4246a = (this.f431q & 112) | 8388611;
            this.f422g.setLayoutParams(g3);
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
        w wVar = this.f425k;
        if (wVar != null) {
            return wVar.getContentDescription();
        }
        return null;
    }

    public Drawable getCollapseIcon() {
        w wVar = this.f425k;
        if (wVar != null) {
            return wVar.getDrawable();
        }
        return null;
    }

    public int getContentInsetEnd() {
        s1 s1Var = this.f437w;
        if (s1Var != null) {
            return s1Var.f4410g ? s1Var.f4404a : s1Var.f4405b;
        }
        return 0;
    }

    public int getContentInsetEndWithActions() {
        int i = this.f439y;
        return i != Integer.MIN_VALUE ? i : getContentInsetEnd();
    }

    public int getContentInsetLeft() {
        s1 s1Var = this.f437w;
        if (s1Var != null) {
            return s1Var.f4404a;
        }
        return 0;
    }

    public int getContentInsetRight() {
        s1 s1Var = this.f437w;
        if (s1Var != null) {
            return s1Var.f4405b;
        }
        return 0;
    }

    public int getContentInsetStart() {
        s1 s1Var = this.f437w;
        if (s1Var != null) {
            return s1Var.f4410g ? s1Var.f4405b : s1Var.f4404a;
        }
        return 0;
    }

    public int getContentInsetStartWithNavigation() {
        int i = this.f438x;
        return i != Integer.MIN_VALUE ? i : getContentInsetStart();
    }

    public int getCurrentContentInsetEnd() {
        i iVar;
        ActionMenuView actionMenuView = this.f419d;
        return (actionMenuView == null || (iVar = actionMenuView.f399s) == null || !iVar.hasVisibleItems()) ? getContentInsetEnd() : Math.max(getContentInsetEnd(), Math.max(this.f439y, 0));
    }

    public int getCurrentContentInsetLeft() {
        return getLayoutDirection() == 1 ? getCurrentContentInsetEnd() : getCurrentContentInsetStart();
    }

    public int getCurrentContentInsetRight() {
        return getLayoutDirection() == 1 ? getCurrentContentInsetStart() : getCurrentContentInsetEnd();
    }

    public int getCurrentContentInsetStart() {
        return getNavigationIcon() != null ? Math.max(getContentInsetStart(), Math.max(this.f438x, 0)) : getContentInsetStart();
    }

    public Drawable getLogo() {
        x xVar = this.f423h;
        if (xVar != null) {
            return xVar.getDrawable();
        }
        return null;
    }

    public CharSequence getLogoDescription() {
        x xVar = this.f423h;
        if (xVar != null) {
            return xVar.getContentDescription();
        }
        return null;
    }

    public Menu getMenu() {
        e();
        return this.f419d.getMenu();
    }

    public View getNavButtonView() {
        return this.f422g;
    }

    public CharSequence getNavigationContentDescription() {
        w wVar = this.f422g;
        if (wVar != null) {
            return wVar.getContentDescription();
        }
        return null;
    }

    public Drawable getNavigationIcon() {
        w wVar = this.f422g;
        if (wVar != null) {
            return wVar.getDrawable();
        }
        return null;
    }

    public l.i getOuterActionMenuPresenter() {
        return null;
    }

    public Drawable getOverflowIcon() {
        e();
        return this.f419d.getOverflowIcon();
    }

    public Context getPopupContext() {
        return this.f427m;
    }

    public int getPopupTheme() {
        return this.f428n;
    }

    public CharSequence getSubtitle() {
        return this.B;
    }

    public final TextView getSubtitleTextView() {
        return this.f421f;
    }

    public CharSequence getTitle() {
        return this.A;
    }

    public int getTitleMarginBottom() {
        return this.f436v;
    }

    public int getTitleMarginEnd() {
        return this.f434t;
    }

    public int getTitleMarginStart() {
        return this.f433s;
    }

    public int getTitleMarginTop() {
        return this.f435u;
    }

    public final TextView getTitleTextView() {
        return this.f420e;
    }

    public q0 getWrapper() {
        Drawable drawable;
        if (this.M == null) {
            i2 i2Var = new i2();
            i2Var.f4288l = 0;
            i2Var.f4278a = this;
            i2Var.f4285h = getTitle();
            i2Var.i = getSubtitle();
            i2Var.f4284g = i2Var.f4285h != null;
            i2Var.f4283f = getNavigationIcon();
            g1 E = g1.E(getContext(), null, a.f3049a, R.attr.actionBarStyle);
            TypedArray typedArray = (TypedArray) E.f85c;
            i2Var.f4289m = E.q(15);
            CharSequence text = typedArray.getText(27);
            if (!TextUtils.isEmpty(text)) {
                i2Var.f4284g = true;
                i2Var.f4285h = text;
                if ((i2Var.f4279b & 8) != 0) {
                    setTitle(text);
                    if (i2Var.f4284g) {
                        k0.l(getRootView(), text);
                    }
                }
            }
            CharSequence text2 = typedArray.getText(25);
            if (!TextUtils.isEmpty(text2)) {
                i2Var.i = text2;
                if ((i2Var.f4279b & 8) != 0) {
                    setSubtitle(text2);
                }
            }
            Drawable q4 = E.q(20);
            if (q4 != null) {
                i2Var.f4282e = q4;
                i2Var.c();
            }
            Drawable q7 = E.q(17);
            if (q7 != null) {
                i2Var.f4281d = q7;
                i2Var.c();
            }
            if (i2Var.f4283f == null && (drawable = i2Var.f4289m) != null) {
                i2Var.f4283f = drawable;
                if ((i2Var.f4279b & 4) != 0) {
                    setNavigationIcon(drawable);
                } else {
                    setNavigationIcon((Drawable) null);
                }
            }
            i2Var.a(typedArray.getInt(10, 0));
            int resourceId = typedArray.getResourceId(9, 0);
            if (resourceId != 0) {
                View inflate = LayoutInflater.from(getContext()).inflate(resourceId, (ViewGroup) this, false);
                View view = i2Var.f4280c;
                if (view != null && (i2Var.f4279b & 16) != 0) {
                    removeView(view);
                }
                i2Var.f4280c = inflate;
                if (inflate != null && (i2Var.f4279b & 16) != 0) {
                    addView(inflate);
                }
                i2Var.a(i2Var.f4279b | 16);
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
                this.f437w.a(max, max2);
            }
            int resourceId2 = typedArray.getResourceId(28, 0);
            if (resourceId2 != 0) {
                Context context = getContext();
                this.f429o = resourceId2;
                j0 j0Var = this.f420e;
                if (j0Var != null) {
                    j0Var.setTextAppearance(context, resourceId2);
                }
            }
            int resourceId3 = typedArray.getResourceId(26, 0);
            if (resourceId3 != 0) {
                Context context2 = getContext();
                this.f430p = resourceId3;
                j0 j0Var2 = this.f421f;
                if (j0Var2 != null) {
                    j0Var2.setTextAppearance(context2, resourceId3);
                }
            }
            int resourceId4 = typedArray.getResourceId(22, 0);
            if (resourceId4 != 0) {
                setPopupTheme(resourceId4);
            }
            E.G();
            if (R.string.abc_action_bar_up_description != i2Var.f4288l) {
                i2Var.f4288l = R.string.abc_action_bar_up_description;
                if (TextUtils.isEmpty(getNavigationContentDescription())) {
                    int i = i2Var.f4288l;
                    i2Var.f4286j = i != 0 ? getContext().getString(i) : null;
                    i2Var.b();
                }
            }
            i2Var.f4286j = getNavigationContentDescription();
            setNavigationOnClickListener(new b2(i2Var));
            this.M = i2Var;
        }
        return this.M;
    }

    public final int i(View view, int i) {
        f2 f2Var = (f2) view.getLayoutParams();
        int measuredHeight = view.getMeasuredHeight();
        int i8 = i > 0 ? (measuredHeight - i) / 2 : 0;
        int i9 = f2Var.f4246a & 112;
        if (i9 != 16 && i9 != 48 && i9 != 80) {
            i9 = this.f440z & 112;
        }
        if (i9 == 48) {
            return getPaddingTop() - i8;
        }
        if (i9 == 80) {
            return (((getHeight() - getPaddingBottom()) - measuredHeight) - ((ViewGroup.MarginLayoutParams) f2Var).bottomMargin) - i8;
        }
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int height = getHeight();
        int i10 = (((height - paddingTop) - paddingBottom) - measuredHeight) / 2;
        int i11 = ((ViewGroup.MarginLayoutParams) f2Var).topMargin;
        if (i10 < i11) {
            i10 = i11;
        } else {
            int i12 = (((height - paddingBottom) - measuredHeight) - i10) - paddingTop;
            int i13 = ((ViewGroup.MarginLayoutParams) f2Var).bottomMargin;
            if (i12 < i13) {
                i10 = Math.max(0, i10 - (i13 - i12));
            }
        }
        return paddingTop + i10;
    }

    public final void l() {
        ArrayList arrayList = this.K;
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
        Iterator it = ((CopyOnWriteArrayList) this.J.f6119e).iterator();
        if (it.hasNext()) {
            ((h) it.next()).getClass();
            throw null;
        }
        ArrayList<MenuItem> currentMenuItems2 = getCurrentMenuItems();
        currentMenuItems2.removeAll(currentMenuItems);
        this.K = currentMenuItems2;
    }

    public final boolean m(View view) {
        return view.getParent() == this || this.H.contains(view);
    }

    public final int n(View view, int i, int i8, int[] iArr) {
        f2 f2Var = (f2) view.getLayoutParams();
        int i9 = ((ViewGroup.MarginLayoutParams) f2Var).leftMargin - iArr[0];
        int max = Math.max(0, i9) + i;
        iArr[0] = Math.max(0, -i9);
        int i10 = i(view, i8);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(max, i10, max + measuredWidth, view.getMeasuredHeight() + i10);
        return measuredWidth + ((ViewGroup.MarginLayoutParams) f2Var).rightMargin + max;
    }

    public final int o(View view, int i, int i8, int[] iArr) {
        f2 f2Var = (f2) view.getLayoutParams();
        int i9 = ((ViewGroup.MarginLayoutParams) f2Var).rightMargin - iArr[1];
        int max = i - Math.max(0, i9);
        iArr[1] = Math.max(0, -i9);
        int i10 = i(view, i8);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(max - measuredWidth, i10, max, view.getMeasuredHeight() + i10);
        return max - (measuredWidth + ((ViewGroup.MarginLayoutParams) f2Var).leftMargin);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        s();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeCallbacks(this.S);
        s();
    }

    @Override // android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.F = false;
        }
        if (!this.F) {
            boolean onHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !onHoverEvent) {
                this.F = true;
            }
        }
        if (actionMasked != 10 && actionMasked != 3) {
            return true;
        }
        this.F = false;
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
    public void onLayout(boolean z3, int i, int i8, int i9, int i10) {
        int i11;
        int i12;
        int max;
        boolean r7;
        boolean r8;
        boolean z7;
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
        boolean z8 = getLayoutDirection() == 1;
        int width = getWidth();
        int height = getHeight();
        int paddingLeft = getPaddingLeft();
        int paddingRight = getPaddingRight();
        int paddingTop2 = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int i25 = width - paddingRight;
        int[] iArr = this.I;
        iArr[1] = 0;
        iArr[0] = 0;
        Field field = k0.f6120a;
        int minimumHeight = getMinimumHeight();
        int min = minimumHeight >= 0 ? Math.min(minimumHeight, i10 - i8) : 0;
        if (!r(this.f422g)) {
            i11 = paddingLeft;
        } else {
            if (z8) {
                i12 = o(this.f422g, i25, min, iArr);
                i11 = paddingLeft;
                if (r(this.f425k)) {
                    if (z8) {
                        i12 = o(this.f425k, i12, min, iArr);
                    } else {
                        i11 = n(this.f425k, i11, min, iArr);
                    }
                }
                if (r(this.f419d)) {
                    if (z8) {
                        i11 = n(this.f419d, i11, min, iArr);
                    } else {
                        i12 = o(this.f419d, i12, min, iArr);
                    }
                }
                int currentContentInsetLeft = getCurrentContentInsetLeft();
                int currentContentInsetRight = getCurrentContentInsetRight();
                iArr[0] = Math.max(0, currentContentInsetLeft - i11);
                iArr[1] = Math.max(0, currentContentInsetRight - (i25 - i12));
                max = Math.max(i11, currentContentInsetLeft);
                int min2 = Math.min(i12, i25 - currentContentInsetRight);
                if (r(this.f426l)) {
                    if (z8) {
                        min2 = o(this.f426l, min2, min, iArr);
                    } else {
                        max = n(this.f426l, max, min, iArr);
                    }
                }
                if (r(this.f423h)) {
                    if (z8) {
                        min2 = o(this.f423h, min2, min, iArr);
                    } else {
                        max = n(this.f423h, max, min, iArr);
                    }
                }
                r7 = r(this.f420e);
                r8 = r(this.f421f);
                if (r7) {
                    z7 = z8;
                    i13 = 0;
                } else {
                    f2 f2Var = (f2) this.f420e.getLayoutParams();
                    z7 = z8;
                    i13 = this.f420e.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) f2Var).topMargin + ((ViewGroup.MarginLayoutParams) f2Var).bottomMargin;
                }
                if (!r8) {
                    f2 f2Var2 = (f2) this.f421f.getLayoutParams();
                    i13 = this.f421f.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) f2Var2).topMargin + ((ViewGroup.MarginLayoutParams) f2Var2).bottomMargin + i13;
                }
                if (!r7 || r8) {
                    j0 j0Var = !r7 ? this.f420e : this.f421f;
                    j0 j0Var2 = !r8 ? this.f421f : this.f420e;
                    f2 f2Var3 = (f2) j0Var.getLayoutParams();
                    f2 f2Var4 = (f2) j0Var2.getLayoutParams();
                    int i26 = i13;
                    boolean z9 = (!r7 && this.f420e.getMeasuredWidth() > 0) || (r8 && this.f421f.getMeasuredWidth() > 0);
                    i14 = this.f440z & 112;
                    int i27 = max;
                    if (i14 != 48) {
                        paddingTop = getPaddingTop() + ((ViewGroup.MarginLayoutParams) f2Var3).topMargin + this.f435u;
                    } else if (i14 != 80) {
                        int i28 = (((height - paddingTop2) - paddingBottom) - i26) / 2;
                        int i29 = ((ViewGroup.MarginLayoutParams) f2Var3).topMargin + this.f435u;
                        if (i28 < i29) {
                            i28 = i29;
                        } else {
                            int i30 = (((height - paddingBottom) - i26) - i28) - paddingTop2;
                            int i31 = ((ViewGroup.MarginLayoutParams) f2Var3).bottomMargin;
                            int i32 = this.f436v;
                            if (i30 < i31 + i32) {
                                i28 = Math.max(0, i28 - ((((ViewGroup.MarginLayoutParams) f2Var4).bottomMargin + i32) - i30));
                            }
                        }
                        paddingTop = paddingTop2 + i28;
                    } else {
                        paddingTop = (((height - paddingBottom) - ((ViewGroup.MarginLayoutParams) f2Var4).bottomMargin) - this.f436v) - i26;
                    }
                    if (z7) {
                        int i33 = (z9 ? this.f433s : 0) - iArr[0];
                        max = Math.max(0, i33) + i27;
                        iArr[0] = Math.max(0, -i33);
                        if (r7) {
                            f2 f2Var5 = (f2) this.f420e.getLayoutParams();
                            int measuredWidth = this.f420e.getMeasuredWidth() + max;
                            int measuredHeight = this.f420e.getMeasuredHeight() + paddingTop;
                            this.f420e.layout(max, paddingTop, measuredWidth, measuredHeight);
                            i15 = measuredWidth + this.f434t;
                            paddingTop = measuredHeight + ((ViewGroup.MarginLayoutParams) f2Var5).bottomMargin;
                        } else {
                            i15 = max;
                        }
                        if (r8) {
                            int i34 = paddingTop + ((ViewGroup.MarginLayoutParams) ((f2) this.f421f.getLayoutParams())).topMargin;
                            int measuredWidth2 = this.f421f.getMeasuredWidth() + max;
                            this.f421f.layout(max, i34, measuredWidth2, this.f421f.getMeasuredHeight() + i34);
                            i16 = measuredWidth2 + this.f434t;
                        } else {
                            i16 = max;
                        }
                        if (z9) {
                            max = Math.max(i15, i16);
                        }
                    } else {
                        int i35 = (z9 ? this.f433s : 0) - iArr[1];
                        min2 -= Math.max(0, i35);
                        iArr[1] = Math.max(0, -i35);
                        if (r7) {
                            f2 f2Var6 = (f2) this.f420e.getLayoutParams();
                            int measuredWidth3 = min2 - this.f420e.getMeasuredWidth();
                            int measuredHeight2 = this.f420e.getMeasuredHeight() + paddingTop;
                            this.f420e.layout(measuredWidth3, paddingTop, min2, measuredHeight2);
                            i17 = measuredWidth3 - this.f434t;
                            paddingTop = measuredHeight2 + ((ViewGroup.MarginLayoutParams) f2Var6).bottomMargin;
                        } else {
                            i17 = min2;
                        }
                        if (r8) {
                            int i36 = paddingTop + ((ViewGroup.MarginLayoutParams) ((f2) this.f421f.getLayoutParams())).topMargin;
                            this.f421f.layout(min2 - this.f421f.getMeasuredWidth(), i36, min2, this.f421f.getMeasuredHeight() + i36);
                            i18 = min2 - this.f434t;
                        } else {
                            i18 = min2;
                        }
                        if (z9) {
                            min2 = Math.min(i17, i18);
                        }
                        max = i27;
                    }
                }
                ArrayList arrayList = this.G;
                a(3, arrayList);
                size = arrayList.size();
                i19 = max;
                for (i20 = 0; i20 < size; i20++) {
                    i19 = n((View) arrayList.get(i20), i19, min, iArr);
                }
                a(5, arrayList);
                size2 = arrayList.size();
                for (i21 = 0; i21 < size2; i21++) {
                    min2 = o((View) arrayList.get(i21), min2, min, iArr);
                }
                a(1, arrayList);
                int i37 = iArr[0];
                int i38 = iArr[1];
                size3 = arrayList.size();
                int i39 = i37;
                i22 = 0;
                int i40 = 0;
                while (i22 < size3) {
                    View view = (View) arrayList.get(i22);
                    f2 f2Var7 = (f2) view.getLayoutParams();
                    int i41 = i38;
                    int i42 = ((ViewGroup.MarginLayoutParams) f2Var7).leftMargin - i39;
                    int i43 = ((ViewGroup.MarginLayoutParams) f2Var7).rightMargin - i41;
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
                    i19 = n((View) arrayList.get(i23), i19, min, iArr);
                }
                arrayList.clear();
            }
            i11 = n(this.f422g, paddingLeft, min, iArr);
        }
        i12 = i25;
        if (r(this.f425k)) {
        }
        if (r(this.f419d)) {
        }
        int currentContentInsetLeft2 = getCurrentContentInsetLeft();
        int currentContentInsetRight2 = getCurrentContentInsetRight();
        iArr[0] = Math.max(0, currentContentInsetLeft2 - i11);
        iArr[1] = Math.max(0, currentContentInsetRight2 - (i25 - i12));
        max = Math.max(i11, currentContentInsetLeft2);
        int min22 = Math.min(i12, i25 - currentContentInsetRight2);
        if (r(this.f426l)) {
        }
        if (r(this.f423h)) {
        }
        r7 = r(this.f420e);
        r8 = r(this.f421f);
        if (r7) {
        }
        if (!r8) {
        }
        if (!r7) {
        }
        if (!r7) {
        }
        if (!r8) {
        }
        f2 f2Var32 = (f2) j0Var.getLayoutParams();
        f2 f2Var42 = (f2) j0Var2.getLayoutParams();
        int i262 = i13;
        if (r7) {
        }
        i14 = this.f440z & 112;
        int i272 = max;
        if (i14 != 48) {
        }
        if (z7) {
        }
        ArrayList arrayList2 = this.G;
        a(3, arrayList2);
        size = arrayList2.size();
        i19 = max;
        while (i20 < size) {
        }
        a(5, arrayList2);
        size2 = arrayList2.size();
        while (i21 < size2) {
        }
        a(1, arrayList2);
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

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.View
    public final void onMeasure(int i, int i8) {
        char c8;
        Object[] objArr;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        boolean z3 = p2.f4378a;
        int i16 = 0;
        if (getLayoutDirection() == 1) {
            objArr = true;
            c8 = 0;
        } else {
            c8 = 1;
            objArr = false;
        }
        if (r(this.f422g)) {
            q(this.f422g, i, 0, i8, this.f432r);
            i9 = j(this.f422g) + this.f422g.getMeasuredWidth();
            i10 = Math.max(0, k(this.f422g) + this.f422g.getMeasuredHeight());
            i11 = View.combineMeasuredStates(0, this.f422g.getMeasuredState());
        } else {
            i9 = 0;
            i10 = 0;
            i11 = 0;
        }
        if (r(this.f425k)) {
            q(this.f425k, i, 0, i8, this.f432r);
            i9 = j(this.f425k) + this.f425k.getMeasuredWidth();
            i10 = Math.max(i10, k(this.f425k) + this.f425k.getMeasuredHeight());
            i11 = View.combineMeasuredStates(i11, this.f425k.getMeasuredState());
        }
        int currentContentInsetStart = getCurrentContentInsetStart();
        int max = Math.max(currentContentInsetStart, i9);
        int max2 = Math.max(0, currentContentInsetStart - i9);
        Object[] objArr2 = objArr;
        int[] iArr = this.I;
        iArr[objArr2 == true ? 1 : 0] = max2;
        if (r(this.f419d)) {
            q(this.f419d, i, max, i8, this.f432r);
            i12 = j(this.f419d) + this.f419d.getMeasuredWidth();
            i10 = Math.max(i10, k(this.f419d) + this.f419d.getMeasuredHeight());
            i11 = View.combineMeasuredStates(i11, this.f419d.getMeasuredState());
        } else {
            i12 = 0;
        }
        int currentContentInsetEnd = getCurrentContentInsetEnd();
        int max3 = max + Math.max(currentContentInsetEnd, i12);
        iArr[c8] = Math.max(0, currentContentInsetEnd - i12);
        if (r(this.f426l)) {
            max3 += p(this.f426l, i, max3, i8, 0, iArr);
            i10 = Math.max(i10, k(this.f426l) + this.f426l.getMeasuredHeight());
            i11 = View.combineMeasuredStates(i11, this.f426l.getMeasuredState());
        }
        if (r(this.f423h)) {
            max3 += p(this.f423h, i, max3, i8, 0, iArr);
            i10 = Math.max(i10, k(this.f423h) + this.f423h.getMeasuredHeight());
            i11 = View.combineMeasuredStates(i11, this.f423h.getMeasuredState());
        }
        int childCount = getChildCount();
        for (int i17 = 0; i17 < childCount; i17++) {
            View childAt = getChildAt(i17);
            if (((f2) childAt.getLayoutParams()).f4247b == 0 && r(childAt)) {
                max3 += p(childAt, i, max3, i8, 0, iArr);
                int max4 = Math.max(i10, k(childAt) + childAt.getMeasuredHeight());
                i11 = View.combineMeasuredStates(i11, childAt.getMeasuredState());
                i10 = max4;
            } else {
                max3 = max3;
            }
        }
        int i18 = max3;
        int i19 = this.f435u + this.f436v;
        int i20 = this.f433s + this.f434t;
        if (r(this.f420e)) {
            p(this.f420e, i, i18 + i20, i8, i19, iArr);
            int j7 = j(this.f420e) + this.f420e.getMeasuredWidth();
            i13 = k(this.f420e) + this.f420e.getMeasuredHeight();
            i14 = View.combineMeasuredStates(i11, this.f420e.getMeasuredState());
            i15 = j7;
        } else {
            i13 = 0;
            i14 = i11;
            i15 = 0;
        }
        if (r(this.f421f)) {
            i15 = Math.max(i15, p(this.f421f, i, i18 + i20, i8, i19 + i13, iArr));
            i13 += k(this.f421f) + this.f421f.getMeasuredHeight();
            i14 = View.combineMeasuredStates(i14, this.f421f.getMeasuredState());
        }
        int max5 = Math.max(i10, i13);
        int paddingRight = getPaddingRight() + getPaddingLeft() + i18 + i15;
        int paddingBottom = getPaddingBottom() + getPaddingTop() + max5;
        int resolveSizeAndState = View.resolveSizeAndState(Math.max(paddingRight, getSuggestedMinimumWidth()), i, (-16777216) & i14);
        int resolveSizeAndState2 = View.resolveSizeAndState(Math.max(paddingBottom, getSuggestedMinimumHeight()), i8, i14 << 16);
        if (this.O) {
            int childCount2 = getChildCount();
            for (int i21 = 0; i21 < childCount2; i21++) {
                View childAt2 = getChildAt(i21);
                if (!r(childAt2) || childAt2.getMeasuredWidth() <= 0 || childAt2.getMeasuredHeight() <= 0) {
                }
            }
            setMeasuredDimension(resolveSizeAndState, i16);
        }
        i16 = resolveSizeAndState2;
        setMeasuredDimension(resolveSizeAndState, i16);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        MenuItem findItem;
        if (!(parcelable instanceof h2)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        h2 h2Var = (h2) parcelable;
        super.onRestoreInstanceState(h2Var.f7877d);
        ActionMenuView actionMenuView = this.f419d;
        i iVar = actionMenuView != null ? actionMenuView.f399s : null;
        int i = h2Var.f4253f;
        if (i != 0 && this.N != null && iVar != null && (findItem = iVar.findItem(i)) != null) {
            findItem.expandActionView();
        }
        if (h2Var.f4254g) {
            b bVar = this.S;
            removeCallbacks(bVar);
            post(bVar);
        }
    }

    @Override // android.view.View
    public final void onRtlPropertiesChanged(int i) {
        super.onRtlPropertiesChanged(i);
        d();
        s1 s1Var = this.f437w;
        boolean z3 = i == 1;
        if (z3 == s1Var.f4410g) {
            return;
        }
        s1Var.f4410g = z3;
        if (!s1Var.f4411h) {
            s1Var.f4404a = s1Var.f4408e;
            s1Var.f4405b = s1Var.f4409f;
            return;
        }
        if (z3) {
            int i8 = s1Var.f4407d;
            if (i8 == Integer.MIN_VALUE) {
                i8 = s1Var.f4408e;
            }
            s1Var.f4404a = i8;
            int i9 = s1Var.f4406c;
            if (i9 == Integer.MIN_VALUE) {
                i9 = s1Var.f4409f;
            }
            s1Var.f4405b = i9;
            return;
        }
        int i10 = s1Var.f4406c;
        if (i10 == Integer.MIN_VALUE) {
            i10 = s1Var.f4408e;
        }
        s1Var.f4404a = i10;
        int i11 = s1Var.f4407d;
        if (i11 == Integer.MIN_VALUE) {
            i11 = s1Var.f4409f;
        }
        s1Var.f4405b = i11;
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        l.i iVar;
        f fVar;
        j jVar;
        h2 h2Var = new h2(super.onSaveInstanceState());
        e2 e2Var = this.N;
        if (e2Var != null && (jVar = e2Var.f4228e) != null) {
            h2Var.f4253f = jVar.f4089a;
        }
        ActionMenuView actionMenuView = this.f419d;
        h2Var.f4254g = (actionMenuView == null || (iVar = actionMenuView.f402v) == null || (fVar = iVar.f4271u) == null || !fVar.b()) ? false : true;
        return h2Var;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.E = false;
        }
        if (!this.E) {
            boolean onTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !onTouchEvent) {
                this.E = true;
            }
        }
        if (actionMasked != 1 && actionMasked != 3) {
            return true;
        }
        this.E = false;
        return true;
    }

    public final int p(View view, int i, int i8, int i9, int i10, int[] iArr) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int i11 = marginLayoutParams.leftMargin - iArr[0];
        int i12 = marginLayoutParams.rightMargin - iArr[1];
        int max = Math.max(0, i12) + Math.max(0, i11);
        iArr[0] = Math.max(0, -i11);
        iArr[1] = Math.max(0, -i12);
        view.measure(ViewGroup.getChildMeasureSpec(i, getPaddingRight() + getPaddingLeft() + max + i8, marginLayoutParams.width), ViewGroup.getChildMeasureSpec(i9, getPaddingBottom() + getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i10, marginLayoutParams.height));
        return view.getMeasuredWidth() + max;
    }

    public final void q(View view, int i, int i8, int i9, int i10) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i, getPaddingRight() + getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i8, marginLayoutParams.width);
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

    public final boolean r(View view) {
        return (view == null || view.getParent() != this || view.getVisibility() == 8) ? false : true;
    }

    public final void s() {
        OnBackInvokedDispatcher onBackInvokedDispatcher;
        if (Build.VERSION.SDK_INT >= 33) {
            OnBackInvokedDispatcher a8 = d2.a(this);
            e2 e2Var = this.N;
            boolean z3 = (e2Var == null || e2Var.f4228e == null || a8 == null || !isAttachedToWindow() || !this.R) ? false : true;
            if (z3 && this.Q == null) {
                if (this.P == null) {
                    this.P = d2.b(new z1(this, 0));
                }
                d2.c(a8, this.P);
                this.Q = a8;
                return;
            }
            if (z3 || (onBackInvokedDispatcher = this.Q) == null) {
                return;
            }
            d2.d(onBackInvokedDispatcher, this.P);
            this.Q = null;
        }
    }

    public void setBackInvokedCallbackEnabled(boolean z3) {
        if (this.R != z3) {
            this.R = z3;
            s();
        }
    }

    public void setCollapseContentDescription(int i) {
        setCollapseContentDescription(i != 0 ? getContext().getText(i) : null);
    }

    public void setCollapseIcon(int i) {
        setCollapseIcon(h0.a.D(getContext(), i));
    }

    public void setCollapsible(boolean z3) {
        this.O = z3;
        requestLayout();
    }

    public void setContentInsetEndWithActions(int i) {
        if (i < 0) {
            i = Integer.MIN_VALUE;
        }
        if (i != this.f439y) {
            this.f439y = i;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setContentInsetStartWithNavigation(int i) {
        if (i < 0) {
            i = Integer.MIN_VALUE;
        }
        if (i != this.f438x) {
            this.f438x = i;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setLogo(int i) {
        setLogo(h0.a.D(getContext(), i));
    }

    public void setLogoDescription(int i) {
        setLogoDescription(getContext().getText(i));
    }

    public void setNavigationContentDescription(int i) {
        setNavigationContentDescription(i != 0 ? getContext().getText(i) : null);
    }

    public void setNavigationIcon(int i) {
        setNavigationIcon(h0.a.D(getContext(), i));
    }

    public void setNavigationOnClickListener(View.OnClickListener onClickListener) {
        f();
        this.f422g.setOnClickListener(onClickListener);
    }

    public void setOverflowIcon(Drawable drawable) {
        e();
        this.f419d.setOverflowIcon(drawable);
    }

    public void setPopupTheme(int i) {
        if (this.f428n != i) {
            this.f428n = i;
            if (i == 0) {
                this.f427m = getContext();
            } else {
                this.f427m = new ContextThemeWrapper(getContext(), i);
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
        this.f436v = i;
        requestLayout();
    }

    public void setTitleMarginEnd(int i) {
        this.f434t = i;
        requestLayout();
    }

    public void setTitleMarginStart(int i) {
        this.f433s = i;
        requestLayout();
    }

    public void setTitleMarginTop(int i) {
        this.f435u = i;
        requestLayout();
    }

    public void setTitleTextColor(int i) {
        setTitleTextColor(ColorStateList.valueOf(i));
    }

    public Toolbar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, R.attr.toolbarStyle);
        this.f440z = 8388627;
        this.G = new ArrayList();
        this.H = new ArrayList();
        this.I = new int[2];
        this.J = new k(new z1(this, 1));
        this.K = new ArrayList();
        this.L = new a2(this);
        this.S = new b(5, this);
        Context context2 = getContext();
        int[] iArr = a.f3066s;
        g1 E = g1.E(context2, attributeSet, iArr, R.attr.toolbarStyle);
        k0.j(this, context, iArr, attributeSet, (TypedArray) E.f85c, R.attr.toolbarStyle);
        TypedArray typedArray = (TypedArray) E.f85c;
        this.f429o = typedArray.getResourceId(28, 0);
        this.f430p = typedArray.getResourceId(19, 0);
        this.f440z = typedArray.getInteger(0, 8388627);
        this.f431q = typedArray.getInteger(2, 48);
        int dimensionPixelOffset = typedArray.getDimensionPixelOffset(22, 0);
        dimensionPixelOffset = typedArray.hasValue(27) ? typedArray.getDimensionPixelOffset(27, dimensionPixelOffset) : dimensionPixelOffset;
        this.f436v = dimensionPixelOffset;
        this.f435u = dimensionPixelOffset;
        this.f434t = dimensionPixelOffset;
        this.f433s = dimensionPixelOffset;
        int dimensionPixelOffset2 = typedArray.getDimensionPixelOffset(25, -1);
        if (dimensionPixelOffset2 >= 0) {
            this.f433s = dimensionPixelOffset2;
        }
        int dimensionPixelOffset3 = typedArray.getDimensionPixelOffset(24, -1);
        if (dimensionPixelOffset3 >= 0) {
            this.f434t = dimensionPixelOffset3;
        }
        int dimensionPixelOffset4 = typedArray.getDimensionPixelOffset(26, -1);
        if (dimensionPixelOffset4 >= 0) {
            this.f435u = dimensionPixelOffset4;
        }
        int dimensionPixelOffset5 = typedArray.getDimensionPixelOffset(23, -1);
        if (dimensionPixelOffset5 >= 0) {
            this.f436v = dimensionPixelOffset5;
        }
        this.f432r = typedArray.getDimensionPixelSize(13, -1);
        int dimensionPixelOffset6 = typedArray.getDimensionPixelOffset(9, Integer.MIN_VALUE);
        int dimensionPixelOffset7 = typedArray.getDimensionPixelOffset(5, Integer.MIN_VALUE);
        int dimensionPixelSize = typedArray.getDimensionPixelSize(7, 0);
        int dimensionPixelSize2 = typedArray.getDimensionPixelSize(8, 0);
        d();
        s1 s1Var = this.f437w;
        s1Var.f4411h = false;
        if (dimensionPixelSize != Integer.MIN_VALUE) {
            s1Var.f4408e = dimensionPixelSize;
            s1Var.f4404a = dimensionPixelSize;
        }
        if (dimensionPixelSize2 != Integer.MIN_VALUE) {
            s1Var.f4409f = dimensionPixelSize2;
            s1Var.f4405b = dimensionPixelSize2;
        }
        if (dimensionPixelOffset6 != Integer.MIN_VALUE || dimensionPixelOffset7 != Integer.MIN_VALUE) {
            s1Var.a(dimensionPixelOffset6, dimensionPixelOffset7);
        }
        this.f438x = typedArray.getDimensionPixelOffset(10, Integer.MIN_VALUE);
        this.f439y = typedArray.getDimensionPixelOffset(6, Integer.MIN_VALUE);
        this.i = E.q(4);
        this.f424j = typedArray.getText(3);
        CharSequence text = typedArray.getText(21);
        if (!TextUtils.isEmpty(text)) {
            setTitle(text);
        }
        CharSequence text2 = typedArray.getText(18);
        if (!TextUtils.isEmpty(text2)) {
            setSubtitle(text2);
        }
        this.f427m = getContext();
        setPopupTheme(typedArray.getResourceId(17, 0));
        Drawable q4 = E.q(16);
        if (q4 != null) {
            setNavigationIcon(q4);
        }
        CharSequence text3 = typedArray.getText(15);
        if (!TextUtils.isEmpty(text3)) {
            setNavigationContentDescription(text3);
        }
        Drawable q7 = E.q(11);
        if (q7 != null) {
            setLogo(q7);
        }
        CharSequence text4 = typedArray.getText(12);
        if (!TextUtils.isEmpty(text4)) {
            setLogoDescription(text4);
        }
        if (typedArray.hasValue(29)) {
            setTitleTextColor(E.p(29));
        }
        if (typedArray.hasValue(20)) {
            setSubtitleTextColor(E.p(20));
        }
        if (typedArray.hasValue(14)) {
            getMenuInflater().inflate(typedArray.getResourceId(14, 0), getMenu());
        }
        E.G();
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        Context context = getContext();
        f2 f2Var = new f2(context, attributeSet);
        f2Var.f4246a = 0;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a.f3050b);
        f2Var.f4246a = obtainStyledAttributes.getInt(0, 0);
        obtainStyledAttributes.recycle();
        f2Var.f4247b = 0;
        return f2Var;
    }

    public void setCollapseContentDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            c();
        }
        w wVar = this.f425k;
        if (wVar != null) {
            wVar.setContentDescription(charSequence);
        }
    }

    public void setCollapseIcon(Drawable drawable) {
        if (drawable != null) {
            c();
            this.f425k.setImageDrawable(drawable);
        } else {
            w wVar = this.f425k;
            if (wVar != null) {
                wVar.setImageDrawable(this.i);
            }
        }
    }

    public void setLogo(Drawable drawable) {
        if (drawable != null) {
            if (this.f423h == null) {
                this.f423h = new x(getContext(), 0);
            }
            if (!m(this.f423h)) {
                b(this.f423h, true);
            }
        } else {
            x xVar = this.f423h;
            if (xVar != null && m(xVar)) {
                removeView(this.f423h);
                this.H.remove(this.f423h);
            }
        }
        x xVar2 = this.f423h;
        if (xVar2 != null) {
            xVar2.setImageDrawable(drawable);
        }
    }

    public void setLogoDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence) && this.f423h == null) {
            this.f423h = new x(getContext(), 0);
        }
        x xVar = this.f423h;
        if (xVar != null) {
            xVar.setContentDescription(charSequence);
        }
    }

    public void setNavigationContentDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            f();
        }
        w wVar = this.f422g;
        if (wVar != null) {
            wVar.setContentDescription(charSequence);
            m.a.Q(this.f422g, charSequence);
        }
    }

    public void setNavigationIcon(Drawable drawable) {
        if (drawable != null) {
            f();
            if (!m(this.f422g)) {
                b(this.f422g, true);
            }
        } else {
            w wVar = this.f422g;
            if (wVar != null && m(wVar)) {
                removeView(this.f422g);
                this.H.remove(this.f422g);
            }
        }
        w wVar2 = this.f422g;
        if (wVar2 != null) {
            wVar2.setImageDrawable(drawable);
        }
    }

    public void setSubtitle(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            j0 j0Var = this.f421f;
            if (j0Var != null && m(j0Var)) {
                removeView(this.f421f);
                this.H.remove(this.f421f);
            }
        } else {
            if (this.f421f == null) {
                Context context = getContext();
                j0 j0Var2 = new j0(context, null);
                this.f421f = j0Var2;
                j0Var2.setSingleLine();
                this.f421f.setEllipsize(TextUtils.TruncateAt.END);
                int i = this.f430p;
                if (i != 0) {
                    this.f421f.setTextAppearance(context, i);
                }
                ColorStateList colorStateList = this.D;
                if (colorStateList != null) {
                    this.f421f.setTextColor(colorStateList);
                }
            }
            if (!m(this.f421f)) {
                b(this.f421f, true);
            }
        }
        j0 j0Var3 = this.f421f;
        if (j0Var3 != null) {
            j0Var3.setText(charSequence);
        }
        this.B = charSequence;
    }

    public void setSubtitleTextColor(ColorStateList colorStateList) {
        this.D = colorStateList;
        j0 j0Var = this.f421f;
        if (j0Var != null) {
            j0Var.setTextColor(colorStateList);
        }
    }

    public void setTitle(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            j0 j0Var = this.f420e;
            if (j0Var != null && m(j0Var)) {
                removeView(this.f420e);
                this.H.remove(this.f420e);
            }
        } else {
            if (this.f420e == null) {
                Context context = getContext();
                j0 j0Var2 = new j0(context, null);
                this.f420e = j0Var2;
                j0Var2.setSingleLine();
                this.f420e.setEllipsize(TextUtils.TruncateAt.END);
                int i = this.f429o;
                if (i != 0) {
                    this.f420e.setTextAppearance(context, i);
                }
                ColorStateList colorStateList = this.C;
                if (colorStateList != null) {
                    this.f420e.setTextColor(colorStateList);
                }
            }
            if (!m(this.f420e)) {
                b(this.f420e, true);
            }
        }
        j0 j0Var3 = this.f420e;
        if (j0Var3 != null) {
            j0Var3.setText(charSequence);
        }
        this.A = charSequence;
    }

    public void setTitleTextColor(ColorStateList colorStateList) {
        this.C = colorStateList;
        j0 j0Var = this.f420e;
        if (j0Var != null) {
            j0Var.setTextColor(colorStateList);
        }
    }

    public void setOnMenuItemClickListener(g2 g2Var) {
    }
}
