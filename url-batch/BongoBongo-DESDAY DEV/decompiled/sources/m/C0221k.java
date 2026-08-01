package m;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.SparseBooleanArray;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.view.menu.ActionMenuItemView;
import androidx.appcompat.widget.ActionMenuView;
import com.winfour.winrandom.R;
import java.util.ArrayList;
import l.AbstractC0177u;
import l.ActionProviderVisibilityListenerC0172p;
import l.C0171o;
import l.InterfaceC0152A;
import l.InterfaceC0180x;
import l.InterfaceC0181y;
import l.InterfaceC0182z;
import l.MenuC0169m;
import l.SubMenuC0156E;

/* renamed from: m.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0221k implements InterfaceC0181y {

    /* renamed from: a, reason: collision with root package name */
    public final Context f3123a;

    /* renamed from: b, reason: collision with root package name */
    public Context f3124b;

    /* renamed from: c, reason: collision with root package name */
    public MenuC0169m f3125c;
    public final LayoutInflater d;

    /* renamed from: e, reason: collision with root package name */
    public InterfaceC0180x f3126e;

    /* renamed from: h, reason: collision with root package name */
    public InterfaceC0152A f3129h;
    public C0219j i;

    /* renamed from: j, reason: collision with root package name */
    public Drawable f3130j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f3131k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f3132l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f3133m;

    /* renamed from: n, reason: collision with root package name */
    public int f3134n;

    /* renamed from: o, reason: collision with root package name */
    public int f3135o;

    /* renamed from: p, reason: collision with root package name */
    public int f3136p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f3137q;

    /* renamed from: s, reason: collision with root package name */
    public C0213g f3139s;

    /* renamed from: t, reason: collision with root package name */
    public C0213g f3140t;

    /* renamed from: u, reason: collision with root package name */
    public RunnableC0217i f3141u;

    /* renamed from: v, reason: collision with root package name */
    public C0215h f3142v;

    /* renamed from: f, reason: collision with root package name */
    public final int f3127f = R.layout.abc_action_menu_layout;

    /* renamed from: g, reason: collision with root package name */
    public final int f3128g = R.layout.abc_action_menu_item_layout;

    /* renamed from: r, reason: collision with root package name */
    public final SparseBooleanArray f3138r = new SparseBooleanArray();

    /* renamed from: w, reason: collision with root package name */
    public final D.g f3143w = new D.g(28, this);

    public C0221k(Context context) {
        this.f3123a = context;
        this.d = LayoutInflater.from(context);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r5v4, types: [l.z] */
    /* JADX WARN: Type inference failed for: r5v7 */
    /* JADX WARN: Type inference failed for: r5v8 */
    public final View a(C0171o c0171o, View view, ViewGroup viewGroup) {
        View actionView = c0171o.getActionView();
        if (actionView == null || c0171o.e()) {
            ActionMenuItemView actionMenuItemView = view instanceof InterfaceC0182z ? (InterfaceC0182z) view : (InterfaceC0182z) this.d.inflate(this.f3128g, viewGroup, false);
            actionMenuItemView.c(c0171o);
            ActionMenuItemView actionMenuItemView2 = actionMenuItemView;
            actionMenuItemView2.setItemInvoker((ActionMenuView) this.f3129h);
            if (this.f3142v == null) {
                this.f3142v = new C0215h(this);
            }
            actionMenuItemView2.setPopupCallback(this.f3142v);
            actionView = actionMenuItemView;
        }
        actionView.setVisibility(c0171o.f2842C ? 8 : 0);
        ViewGroup.LayoutParams layoutParams = actionView.getLayoutParams();
        ((ActionMenuView) viewGroup).getClass();
        if (!(layoutParams instanceof C0225m)) {
            actionView.setLayoutParams(ActionMenuView.k(layoutParams));
        }
        return actionView;
    }

    @Override // l.InterfaceC0181y
    public final void b(MenuC0169m menuC0169m, boolean z2) {
        f();
        C0213g c0213g = this.f3140t;
        if (c0213g != null && c0213g.b()) {
            c0213g.i.dismiss();
        }
        InterfaceC0180x interfaceC0180x = this.f3126e;
        if (interfaceC0180x != null) {
            interfaceC0180x.b(menuC0169m, z2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // l.InterfaceC0181y
    public final void c() {
        int i;
        ViewGroup viewGroup = (ViewGroup) this.f3129h;
        ArrayList arrayList = null;
        boolean z2 = false;
        if (viewGroup != null) {
            MenuC0169m menuC0169m = this.f3125c;
            if (menuC0169m != null) {
                menuC0169m.i();
                ArrayList l2 = this.f3125c.l();
                int size = l2.size();
                i = 0;
                for (int i2 = 0; i2 < size; i2++) {
                    C0171o c0171o = (C0171o) l2.get(i2);
                    if (c0171o.f()) {
                        View childAt = viewGroup.getChildAt(i);
                        C0171o itemData = childAt instanceof InterfaceC0182z ? ((InterfaceC0182z) childAt).getItemData() : null;
                        View a2 = a(c0171o, childAt, viewGroup);
                        if (c0171o != itemData) {
                            a2.setPressed(false);
                            a2.jumpDrawablesToCurrentState();
                        }
                        if (a2 != childAt) {
                            ViewGroup viewGroup2 = (ViewGroup) a2.getParent();
                            if (viewGroup2 != null) {
                                viewGroup2.removeView(a2);
                            }
                            ((ViewGroup) this.f3129h).addView(a2, i);
                        }
                        i++;
                    }
                }
            } else {
                i = 0;
            }
            while (i < viewGroup.getChildCount()) {
                if (viewGroup.getChildAt(i) == this.i) {
                    i++;
                } else {
                    viewGroup.removeViewAt(i);
                }
            }
        }
        ((View) this.f3129h).requestLayout();
        MenuC0169m menuC0169m2 = this.f3125c;
        if (menuC0169m2 != null) {
            menuC0169m2.i();
            ArrayList arrayList2 = menuC0169m2.i;
            int size2 = arrayList2.size();
            for (int i3 = 0; i3 < size2; i3++) {
                ActionProviderVisibilityListenerC0172p actionProviderVisibilityListenerC0172p = ((C0171o) arrayList2.get(i3)).f2840A;
            }
        }
        MenuC0169m menuC0169m3 = this.f3125c;
        if (menuC0169m3 != null) {
            menuC0169m3.i();
            arrayList = menuC0169m3.f2822j;
        }
        if (this.f3132l && arrayList != null) {
            int size3 = arrayList.size();
            if (size3 == 1) {
                z2 = !((C0171o) arrayList.get(0)).f2842C;
            } else if (size3 > 0) {
                z2 = true;
            }
        }
        if (z2) {
            if (this.i == null) {
                this.i = new C0219j(this, this.f3123a);
            }
            ViewGroup viewGroup3 = (ViewGroup) this.i.getParent();
            if (viewGroup3 != this.f3129h) {
                if (viewGroup3 != null) {
                    viewGroup3.removeView(this.i);
                }
                ActionMenuView actionMenuView = (ActionMenuView) this.f3129h;
                C0219j c0219j = this.i;
                actionMenuView.getClass();
                C0225m j2 = ActionMenuView.j();
                j2.f3145a = true;
                actionMenuView.addView(c0219j, j2);
            }
        } else {
            C0219j c0219j2 = this.i;
            if (c0219j2 != null) {
                Object parent = c0219j2.getParent();
                Object obj = this.f3129h;
                if (parent == obj) {
                    ((ViewGroup) obj).removeView(this.i);
                }
            }
        }
        ((ActionMenuView) this.f3129h).setOverflowReserved(this.f3132l);
    }

    @Override // l.InterfaceC0181y
    public final void d(Context context, MenuC0169m menuC0169m) {
        this.f3124b = context;
        LayoutInflater.from(context);
        this.f3125c = menuC0169m;
        Resources resources = context.getResources();
        if (!this.f3133m) {
            this.f3132l = true;
        }
        int i = 2;
        this.f3134n = context.getResources().getDisplayMetrics().widthPixels / 2;
        Configuration configuration = context.getResources().getConfiguration();
        int i2 = configuration.screenWidthDp;
        int i3 = configuration.screenHeightDp;
        if (configuration.smallestScreenWidthDp > 600 || i2 > 600 || ((i2 > 960 && i3 > 720) || (i2 > 720 && i3 > 960))) {
            i = 5;
        } else if (i2 >= 500 || ((i2 > 640 && i3 > 480) || (i2 > 480 && i3 > 640))) {
            i = 4;
        } else if (i2 >= 360) {
            i = 3;
        }
        this.f3136p = i;
        int i4 = this.f3134n;
        if (this.f3132l) {
            if (this.i == null) {
                C0219j c0219j = new C0219j(this, this.f3123a);
                this.i = c0219j;
                if (this.f3131k) {
                    c0219j.setImageDrawable(this.f3130j);
                    this.f3130j = null;
                    this.f3131k = false;
                }
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
                this.i.measure(makeMeasureSpec, makeMeasureSpec);
            }
            i4 -= this.i.getMeasuredWidth();
        } else {
            this.i = null;
        }
        this.f3135o = i4;
        float f2 = resources.getDisplayMetrics().density;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // l.InterfaceC0181y
    public final boolean e(SubMenuC0156E subMenuC0156E) {
        boolean z2;
        if (!subMenuC0156E.hasVisibleItems()) {
            return false;
        }
        SubMenuC0156E subMenuC0156E2 = subMenuC0156E;
        while (true) {
            MenuC0169m menuC0169m = subMenuC0156E2.f2754z;
            if (menuC0169m == this.f3125c) {
                break;
            }
            subMenuC0156E2 = (SubMenuC0156E) menuC0169m;
        }
        ViewGroup viewGroup = (ViewGroup) this.f3129h;
        View view = null;
        if (viewGroup != null) {
            int childCount = viewGroup.getChildCount();
            int i = 0;
            while (true) {
                if (i >= childCount) {
                    break;
                }
                View childAt = viewGroup.getChildAt(i);
                if ((childAt instanceof InterfaceC0182z) && ((InterfaceC0182z) childAt).getItemData() == subMenuC0156E2.f2753A) {
                    view = childAt;
                    break;
                }
                i++;
            }
        }
        if (view == null) {
            return false;
        }
        subMenuC0156E.f2753A.getClass();
        int size = subMenuC0156E.f2819f.size();
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                z2 = false;
                break;
            }
            MenuItem item = subMenuC0156E.getItem(i2);
            if (item.isVisible() && item.getIcon() != null) {
                z2 = true;
                break;
            }
            i2++;
        }
        C0213g c0213g = new C0213g(this, this.f3124b, subMenuC0156E, view);
        this.f3140t = c0213g;
        c0213g.f2883g = z2;
        AbstractC0177u abstractC0177u = c0213g.i;
        if (abstractC0177u != null) {
            abstractC0177u.o(z2);
        }
        C0213g c0213g2 = this.f3140t;
        if (!c0213g2.b()) {
            if (c0213g2.f2881e == null) {
                throw new IllegalStateException("MenuPopupHelper cannot be used without an anchor");
            }
            c0213g2.d(0, 0, false, false);
        }
        InterfaceC0180x interfaceC0180x = this.f3126e;
        if (interfaceC0180x != null) {
            interfaceC0180x.j(subMenuC0156E);
        }
        return true;
    }

    public final boolean f() {
        Object obj;
        RunnableC0217i runnableC0217i = this.f3141u;
        if (runnableC0217i != null && (obj = this.f3129h) != null) {
            ((View) obj).removeCallbacks(runnableC0217i);
            this.f3141u = null;
            return true;
        }
        C0213g c0213g = this.f3139s;
        if (c0213g == null) {
            return false;
        }
        if (c0213g.b()) {
            c0213g.i.dismiss();
        }
        return true;
    }

    @Override // l.InterfaceC0181y
    public final void g(InterfaceC0180x interfaceC0180x) {
        throw null;
    }

    @Override // l.InterfaceC0181y
    public final boolean h(C0171o c0171o) {
        return false;
    }

    @Override // l.InterfaceC0181y
    public final boolean i() {
        int i;
        ArrayList arrayList;
        int i2;
        boolean z2;
        MenuC0169m menuC0169m = this.f3125c;
        if (menuC0169m != null) {
            arrayList = menuC0169m.l();
            i = arrayList.size();
        } else {
            i = 0;
            arrayList = null;
        }
        int i3 = this.f3136p;
        int i4 = this.f3135o;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        ViewGroup viewGroup = (ViewGroup) this.f3129h;
        int i5 = 0;
        boolean z3 = false;
        int i6 = 0;
        int i7 = 0;
        while (true) {
            i2 = 2;
            z2 = true;
            if (i5 >= i) {
                break;
            }
            C0171o c0171o = (C0171o) arrayList.get(i5);
            int i8 = c0171o.f2865y;
            if ((i8 & 2) == 2) {
                i6++;
            } else if ((i8 & 1) == 1) {
                i7++;
            } else {
                z3 = true;
            }
            if (this.f3137q && c0171o.f2842C) {
                i3 = 0;
            }
            i5++;
        }
        if (this.f3132l && (z3 || i7 + i6 > i3)) {
            i3--;
        }
        int i9 = i3 - i6;
        SparseBooleanArray sparseBooleanArray = this.f3138r;
        sparseBooleanArray.clear();
        int i10 = 0;
        int i11 = 0;
        while (i10 < i) {
            C0171o c0171o2 = (C0171o) arrayList.get(i10);
            int i12 = c0171o2.f2865y;
            boolean z4 = (i12 & 2) == i2 ? z2 : false;
            int i13 = c0171o2.f2844b;
            if (z4) {
                View a2 = a(c0171o2, null, viewGroup);
                a2.measure(makeMeasureSpec, makeMeasureSpec);
                int measuredWidth = a2.getMeasuredWidth();
                i4 -= measuredWidth;
                if (i11 == 0) {
                    i11 = measuredWidth;
                }
                if (i13 != 0) {
                    sparseBooleanArray.put(i13, z2);
                }
                c0171o2.g(z2);
            } else if ((i12 & 1) == z2) {
                boolean z5 = sparseBooleanArray.get(i13);
                boolean z6 = ((i9 > 0 || z5) && i4 > 0) ? z2 : false;
                if (z6) {
                    View a3 = a(c0171o2, null, viewGroup);
                    a3.measure(makeMeasureSpec, makeMeasureSpec);
                    int measuredWidth2 = a3.getMeasuredWidth();
                    i4 -= measuredWidth2;
                    if (i11 == 0) {
                        i11 = measuredWidth2;
                    }
                    z6 &= i4 + i11 > 0;
                }
                if (z6 && i13 != 0) {
                    sparseBooleanArray.put(i13, true);
                } else if (z5) {
                    sparseBooleanArray.put(i13, false);
                    for (int i14 = 0; i14 < i10; i14++) {
                        C0171o c0171o3 = (C0171o) arrayList.get(i14);
                        if (c0171o3.f2844b == i13) {
                            if (c0171o3.f()) {
                                i9++;
                            }
                            c0171o3.g(false);
                        }
                    }
                }
                if (z6) {
                    i9--;
                }
                c0171o2.g(z6);
            } else {
                c0171o2.g(false);
                i10++;
                i2 = 2;
                z2 = true;
            }
            i10++;
            i2 = 2;
            z2 = true;
        }
        return z2;
    }

    public final boolean j() {
        C0213g c0213g = this.f3139s;
        return c0213g != null && c0213g.b();
    }

    @Override // l.InterfaceC0181y
    public final boolean k(C0171o c0171o) {
        return false;
    }

    public final boolean l() {
        MenuC0169m menuC0169m;
        if (!this.f3132l || j() || (menuC0169m = this.f3125c) == null || this.f3129h == null || this.f3141u != null) {
            return false;
        }
        menuC0169m.i();
        if (menuC0169m.f2822j.isEmpty()) {
            return false;
        }
        RunnableC0217i runnableC0217i = new RunnableC0217i(this, new C0213g(this, this.f3124b, this.f3125c, this.i));
        this.f3141u = runnableC0217i;
        ((View) this.f3129h).post(runnableC0217i);
        return true;
    }
}
