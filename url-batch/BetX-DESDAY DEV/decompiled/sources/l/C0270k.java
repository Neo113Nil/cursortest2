package l;

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
import com.luckyarcade.spinthrow.R;
import java.util.ArrayList;
import k.AbstractC0210u;
import k.ActionProviderVisibilityListenerC0205p;
import k.C0204o;
import k.InterfaceC0185A;
import k.InterfaceC0213x;
import k.InterfaceC0214y;
import k.InterfaceC0215z;
import k.MenuC0202m;
import k.SubMenuC0189E;

/* renamed from: l.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0270k implements InterfaceC0214y {

    /* renamed from: a, reason: collision with root package name */
    public final Context f3389a;

    /* renamed from: b, reason: collision with root package name */
    public Context f3390b;

    /* renamed from: c, reason: collision with root package name */
    public MenuC0202m f3391c;

    /* renamed from: d, reason: collision with root package name */
    public final LayoutInflater f3392d;

    /* renamed from: e, reason: collision with root package name */
    public InterfaceC0213x f3393e;
    public InterfaceC0185A h;
    public C0268j i;

    /* renamed from: j, reason: collision with root package name */
    public Drawable f3396j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f3397k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f3398l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f3399m;

    /* renamed from: n, reason: collision with root package name */
    public int f3400n;

    /* renamed from: o, reason: collision with root package name */
    public int f3401o;

    /* renamed from: p, reason: collision with root package name */
    public int f3402p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f3403q;

    /* renamed from: s, reason: collision with root package name */
    public C0262g f3405s;

    /* renamed from: t, reason: collision with root package name */
    public C0262g f3406t;

    /* renamed from: u, reason: collision with root package name */
    public RunnableC0266i f3407u;

    /* renamed from: v, reason: collision with root package name */
    public C0264h f3408v;

    /* renamed from: f, reason: collision with root package name */
    public final int f3394f = R.layout.abc_action_menu_layout;

    /* renamed from: g, reason: collision with root package name */
    public final int f3395g = R.layout.abc_action_menu_item_layout;

    /* renamed from: r, reason: collision with root package name */
    public final SparseBooleanArray f3404r = new SparseBooleanArray();

    /* renamed from: w, reason: collision with root package name */
    public final B0.d f3409w = new B0.d(27, this);

    public C0270k(Context context) {
        this.f3389a = context;
        this.f3392d = LayoutInflater.from(context);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r5v4, types: [k.z] */
    /* JADX WARN: Type inference failed for: r5v7 */
    /* JADX WARN: Type inference failed for: r5v8 */
    public final View a(C0204o c0204o, View view, ViewGroup viewGroup) {
        View actionView = c0204o.getActionView();
        if (actionView == null || c0204o.e()) {
            ActionMenuItemView actionMenuItemView = view instanceof InterfaceC0215z ? (InterfaceC0215z) view : (InterfaceC0215z) this.f3392d.inflate(this.f3395g, viewGroup, false);
            actionMenuItemView.a(c0204o);
            ActionMenuItemView actionMenuItemView2 = actionMenuItemView;
            actionMenuItemView2.setItemInvoker((ActionMenuView) this.h);
            if (this.f3408v == null) {
                this.f3408v = new C0264h(this);
            }
            actionMenuItemView2.setPopupCallback(this.f3408v);
            actionView = actionMenuItemView;
        }
        actionView.setVisibility(c0204o.f3088C ? 8 : 0);
        ViewGroup.LayoutParams layoutParams = actionView.getLayoutParams();
        ((ActionMenuView) viewGroup).getClass();
        if (!(layoutParams instanceof C0274m)) {
            actionView.setLayoutParams(ActionMenuView.k(layoutParams));
        }
        return actionView;
    }

    @Override // k.InterfaceC0214y
    public final void b(MenuC0202m menuC0202m, boolean z2) {
        e();
        C0262g c0262g = this.f3406t;
        if (c0262g != null && c0262g.b()) {
            c0262g.i.dismiss();
        }
        InterfaceC0213x interfaceC0213x = this.f3393e;
        if (interfaceC0213x != null) {
            interfaceC0213x.b(menuC0202m, z2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // k.InterfaceC0214y
    public final void c() {
        int i;
        ViewGroup viewGroup = (ViewGroup) this.h;
        ArrayList arrayList = null;
        boolean z2 = false;
        if (viewGroup != null) {
            MenuC0202m menuC0202m = this.f3391c;
            if (menuC0202m != null) {
                menuC0202m.i();
                ArrayList l2 = this.f3391c.l();
                int size = l2.size();
                i = 0;
                for (int i2 = 0; i2 < size; i2++) {
                    C0204o c0204o = (C0204o) l2.get(i2);
                    if (c0204o.f()) {
                        View childAt = viewGroup.getChildAt(i);
                        C0204o itemData = childAt instanceof InterfaceC0215z ? ((InterfaceC0215z) childAt).getItemData() : null;
                        View a2 = a(c0204o, childAt, viewGroup);
                        if (c0204o != itemData) {
                            a2.setPressed(false);
                            a2.jumpDrawablesToCurrentState();
                        }
                        if (a2 != childAt) {
                            ViewGroup viewGroup2 = (ViewGroup) a2.getParent();
                            if (viewGroup2 != null) {
                                viewGroup2.removeView(a2);
                            }
                            ((ViewGroup) this.h).addView(a2, i);
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
        ((View) this.h).requestLayout();
        MenuC0202m menuC0202m2 = this.f3391c;
        if (menuC0202m2 != null) {
            menuC0202m2.i();
            ArrayList arrayList2 = menuC0202m2.i;
            int size2 = arrayList2.size();
            for (int i3 = 0; i3 < size2; i3++) {
                ActionProviderVisibilityListenerC0205p actionProviderVisibilityListenerC0205p = ((C0204o) arrayList2.get(i3)).f3086A;
            }
        }
        MenuC0202m menuC0202m3 = this.f3391c;
        if (menuC0202m3 != null) {
            menuC0202m3.i();
            arrayList = menuC0202m3.f3068j;
        }
        if (this.f3398l && arrayList != null) {
            int size3 = arrayList.size();
            if (size3 == 1) {
                z2 = !((C0204o) arrayList.get(0)).f3088C;
            } else if (size3 > 0) {
                z2 = true;
            }
        }
        if (z2) {
            if (this.i == null) {
                this.i = new C0268j(this, this.f3389a);
            }
            ViewGroup viewGroup3 = (ViewGroup) this.i.getParent();
            if (viewGroup3 != this.h) {
                if (viewGroup3 != null) {
                    viewGroup3.removeView(this.i);
                }
                ActionMenuView actionMenuView = (ActionMenuView) this.h;
                C0268j c0268j = this.i;
                actionMenuView.getClass();
                C0274m j2 = ActionMenuView.j();
                j2.f3410a = true;
                actionMenuView.addView(c0268j, j2);
            }
        } else {
            C0268j c0268j2 = this.i;
            if (c0268j2 != null) {
                Object parent = c0268j2.getParent();
                Object obj = this.h;
                if (parent == obj) {
                    ((ViewGroup) obj).removeView(this.i);
                }
            }
        }
        ((ActionMenuView) this.h).setOverflowReserved(this.f3398l);
    }

    @Override // k.InterfaceC0214y
    public final boolean d(C0204o c0204o) {
        return false;
    }

    public final boolean e() {
        Object obj;
        RunnableC0266i runnableC0266i = this.f3407u;
        if (runnableC0266i != null && (obj = this.h) != null) {
            ((View) obj).removeCallbacks(runnableC0266i);
            this.f3407u = null;
            return true;
        }
        C0262g c0262g = this.f3405s;
        if (c0262g == null) {
            return false;
        }
        if (c0262g.b()) {
            c0262g.i.dismiss();
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // k.InterfaceC0214y
    public final boolean f(SubMenuC0189E subMenuC0189E) {
        boolean z2;
        if (!subMenuC0189E.hasVisibleItems()) {
            return false;
        }
        SubMenuC0189E subMenuC0189E2 = subMenuC0189E;
        while (true) {
            MenuC0202m menuC0202m = subMenuC0189E2.f2997z;
            if (menuC0202m == this.f3391c) {
                break;
            }
            subMenuC0189E2 = (SubMenuC0189E) menuC0202m;
        }
        ViewGroup viewGroup = (ViewGroup) this.h;
        View view = null;
        if (viewGroup != null) {
            int childCount = viewGroup.getChildCount();
            int i = 0;
            while (true) {
                if (i >= childCount) {
                    break;
                }
                View childAt = viewGroup.getChildAt(i);
                if ((childAt instanceof InterfaceC0215z) && ((InterfaceC0215z) childAt).getItemData() == subMenuC0189E2.f2996A) {
                    view = childAt;
                    break;
                }
                i++;
            }
        }
        if (view == null) {
            return false;
        }
        subMenuC0189E.f2996A.getClass();
        int size = subMenuC0189E.f3066f.size();
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                z2 = false;
                break;
            }
            MenuItem item = subMenuC0189E.getItem(i2);
            if (item.isVisible() && item.getIcon() != null) {
                z2 = true;
                break;
            }
            i2++;
        }
        C0262g c0262g = new C0262g(this, this.f3390b, subMenuC0189E, view);
        this.f3406t = c0262g;
        c0262g.f3131g = z2;
        AbstractC0210u abstractC0210u = c0262g.i;
        if (abstractC0210u != null) {
            abstractC0210u.o(z2);
        }
        C0262g c0262g2 = this.f3406t;
        if (!c0262g2.b()) {
            if (c0262g2.f3129e == null) {
                throw new IllegalStateException("MenuPopupHelper cannot be used without an anchor");
            }
            c0262g2.d(0, 0, false, false);
        }
        InterfaceC0213x interfaceC0213x = this.f3393e;
        if (interfaceC0213x != null) {
            interfaceC0213x.g(subMenuC0189E);
        }
        return true;
    }

    @Override // k.InterfaceC0214y
    public final void g(InterfaceC0213x interfaceC0213x) {
        throw null;
    }

    @Override // k.InterfaceC0214y
    public final boolean h(C0204o c0204o) {
        return false;
    }

    public final boolean i() {
        C0262g c0262g = this.f3405s;
        return c0262g != null && c0262g.b();
    }

    @Override // k.InterfaceC0214y
    public final void j(Context context, MenuC0202m menuC0202m) {
        this.f3390b = context;
        LayoutInflater.from(context);
        this.f3391c = menuC0202m;
        Resources resources = context.getResources();
        if (!this.f3399m) {
            this.f3398l = true;
        }
        int i = 2;
        this.f3400n = context.getResources().getDisplayMetrics().widthPixels / 2;
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
        this.f3402p = i;
        int i4 = this.f3400n;
        if (this.f3398l) {
            if (this.i == null) {
                C0268j c0268j = new C0268j(this, this.f3389a);
                this.i = c0268j;
                if (this.f3397k) {
                    c0268j.setImageDrawable(this.f3396j);
                    this.f3396j = null;
                    this.f3397k = false;
                }
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
                this.i.measure(makeMeasureSpec, makeMeasureSpec);
            }
            i4 -= this.i.getMeasuredWidth();
        } else {
            this.i = null;
        }
        this.f3401o = i4;
        float f2 = resources.getDisplayMetrics().density;
    }

    @Override // k.InterfaceC0214y
    public final boolean k() {
        int i;
        ArrayList arrayList;
        int i2;
        boolean z2;
        MenuC0202m menuC0202m = this.f3391c;
        if (menuC0202m != null) {
            arrayList = menuC0202m.l();
            i = arrayList.size();
        } else {
            i = 0;
            arrayList = null;
        }
        int i3 = this.f3402p;
        int i4 = this.f3401o;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        ViewGroup viewGroup = (ViewGroup) this.h;
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
            C0204o c0204o = (C0204o) arrayList.get(i5);
            int i8 = c0204o.f3111y;
            if ((i8 & 2) == 2) {
                i6++;
            } else if ((i8 & 1) == 1) {
                i7++;
            } else {
                z3 = true;
            }
            if (this.f3403q && c0204o.f3088C) {
                i3 = 0;
            }
            i5++;
        }
        if (this.f3398l && (z3 || i7 + i6 > i3)) {
            i3--;
        }
        int i9 = i3 - i6;
        SparseBooleanArray sparseBooleanArray = this.f3404r;
        sparseBooleanArray.clear();
        int i10 = 0;
        int i11 = 0;
        while (i10 < i) {
            C0204o c0204o2 = (C0204o) arrayList.get(i10);
            int i12 = c0204o2.f3111y;
            boolean z4 = (i12 & 2) == i2 ? z2 : false;
            int i13 = c0204o2.f3090b;
            if (z4) {
                View a2 = a(c0204o2, null, viewGroup);
                a2.measure(makeMeasureSpec, makeMeasureSpec);
                int measuredWidth = a2.getMeasuredWidth();
                i4 -= measuredWidth;
                if (i11 == 0) {
                    i11 = measuredWidth;
                }
                if (i13 != 0) {
                    sparseBooleanArray.put(i13, z2);
                }
                c0204o2.g(z2);
            } else if ((i12 & 1) == z2) {
                boolean z5 = sparseBooleanArray.get(i13);
                boolean z6 = ((i9 > 0 || z5) && i4 > 0) ? z2 : false;
                if (z6) {
                    View a3 = a(c0204o2, null, viewGroup);
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
                        C0204o c0204o3 = (C0204o) arrayList.get(i14);
                        if (c0204o3.f3090b == i13) {
                            if (c0204o3.f()) {
                                i9++;
                            }
                            c0204o3.g(false);
                        }
                    }
                }
                if (z6) {
                    i9--;
                }
                c0204o2.g(z6);
            } else {
                c0204o2.g(false);
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

    public final boolean l() {
        MenuC0202m menuC0202m;
        if (!this.f3398l || i() || (menuC0202m = this.f3391c) == null || this.h == null || this.f3407u != null) {
            return false;
        }
        menuC0202m.i();
        if (menuC0202m.f3068j.isEmpty()) {
            return false;
        }
        RunnableC0266i runnableC0266i = new RunnableC0266i(this, new C0262g(this, this.f3390b, this.f3391c, this.i));
        this.f3407u = runnableC0266i;
        ((View) this.h).post(runnableC0266i);
        return true;
    }
}
