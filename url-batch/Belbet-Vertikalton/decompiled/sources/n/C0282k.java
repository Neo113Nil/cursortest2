package n;

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
import com.winpower.neonfit.R;
import java.util.ArrayList;
import m.AbstractC0237u;
import m.ActionProviderVisibilityListenerC0232p;
import m.C0231o;
import m.InterfaceC0212A;
import m.InterfaceC0240x;
import m.InterfaceC0241y;
import m.InterfaceC0242z;
import m.MenuC0229m;
import m.SubMenuC0216E;

/* renamed from: n.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0282k implements InterfaceC0241y {

    /* renamed from: a, reason: collision with root package name */
    public final Context f3650a;

    /* renamed from: b, reason: collision with root package name */
    public Context f3651b;

    /* renamed from: c, reason: collision with root package name */
    public MenuC0229m f3652c;

    /* renamed from: d, reason: collision with root package name */
    public final LayoutInflater f3653d;
    public InterfaceC0240x e;

    /* renamed from: h, reason: collision with root package name */
    public InterfaceC0212A f3656h;
    public C0280j i;
    public Drawable j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f3657k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f3658l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f3659m;

    /* renamed from: n, reason: collision with root package name */
    public int f3660n;

    /* renamed from: o, reason: collision with root package name */
    public int f3661o;

    /* renamed from: p, reason: collision with root package name */
    public int f3662p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f3663q;

    /* renamed from: s, reason: collision with root package name */
    public C0274g f3665s;

    /* renamed from: t, reason: collision with root package name */
    public C0274g f3666t;

    /* renamed from: u, reason: collision with root package name */
    public RunnableC0278i f3667u;

    /* renamed from: v, reason: collision with root package name */
    public C0276h f3668v;

    /* renamed from: f, reason: collision with root package name */
    public final int f3654f = R.layout.abc_action_menu_layout;

    /* renamed from: g, reason: collision with root package name */
    public final int f3655g = R.layout.abc_action_menu_item_layout;

    /* renamed from: r, reason: collision with root package name */
    public final SparseBooleanArray f3664r = new SparseBooleanArray();

    /* renamed from: w, reason: collision with root package name */
    public final C1.d f3669w = new C1.d(29, this);

    public C0282k(Context context) {
        this.f3650a = context;
        this.f3653d = LayoutInflater.from(context);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r5v4, types: [m.z] */
    /* JADX WARN: Type inference failed for: r5v7 */
    /* JADX WARN: Type inference failed for: r5v8 */
    public final View a(C0231o c0231o, View view, ViewGroup viewGroup) {
        View actionView = c0231o.getActionView();
        if (actionView == null || c0231o.e()) {
            ActionMenuItemView actionMenuItemView = view instanceof InterfaceC0242z ? (InterfaceC0242z) view : (InterfaceC0242z) this.f3653d.inflate(this.f3655g, viewGroup, false);
            actionMenuItemView.a(c0231o);
            ActionMenuItemView actionMenuItemView2 = actionMenuItemView;
            actionMenuItemView2.setItemInvoker((ActionMenuView) this.f3656h);
            if (this.f3668v == null) {
                this.f3668v = new C0276h(this);
            }
            actionMenuItemView2.setPopupCallback(this.f3668v);
            actionView = actionMenuItemView;
        }
        actionView.setVisibility(c0231o.f3374C ? 8 : 0);
        ViewGroup.LayoutParams layoutParams = actionView.getLayoutParams();
        ((ActionMenuView) viewGroup).getClass();
        if (!(layoutParams instanceof C0286m)) {
            actionView.setLayoutParams(ActionMenuView.k(layoutParams));
        }
        return actionView;
    }

    @Override // m.InterfaceC0241y
    public final void b(MenuC0229m menuC0229m, boolean z2) {
        e();
        C0274g c0274g = this.f3666t;
        if (c0274g != null && c0274g.b()) {
            c0274g.i.dismiss();
        }
        InterfaceC0240x interfaceC0240x = this.e;
        if (interfaceC0240x != null) {
            interfaceC0240x.b(menuC0229m, z2);
        }
    }

    @Override // m.InterfaceC0241y
    public final boolean c(C0231o c0231o) {
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // m.InterfaceC0241y
    public final void d() {
        int i;
        ViewGroup viewGroup = (ViewGroup) this.f3656h;
        ArrayList arrayList = null;
        boolean z2 = false;
        if (viewGroup != null) {
            MenuC0229m menuC0229m = this.f3652c;
            if (menuC0229m != null) {
                menuC0229m.i();
                ArrayList l2 = this.f3652c.l();
                int size = l2.size();
                i = 0;
                for (int i2 = 0; i2 < size; i2++) {
                    C0231o c0231o = (C0231o) l2.get(i2);
                    if (c0231o.f()) {
                        View childAt = viewGroup.getChildAt(i);
                        C0231o itemData = childAt instanceof InterfaceC0242z ? ((InterfaceC0242z) childAt).getItemData() : null;
                        View a2 = a(c0231o, childAt, viewGroup);
                        if (c0231o != itemData) {
                            a2.setPressed(false);
                            a2.jumpDrawablesToCurrentState();
                        }
                        if (a2 != childAt) {
                            ViewGroup viewGroup2 = (ViewGroup) a2.getParent();
                            if (viewGroup2 != null) {
                                viewGroup2.removeView(a2);
                            }
                            ((ViewGroup) this.f3656h).addView(a2, i);
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
        ((View) this.f3656h).requestLayout();
        MenuC0229m menuC0229m2 = this.f3652c;
        if (menuC0229m2 != null) {
            menuC0229m2.i();
            ArrayList arrayList2 = menuC0229m2.i;
            int size2 = arrayList2.size();
            for (int i3 = 0; i3 < size2; i3++) {
                ActionProviderVisibilityListenerC0232p actionProviderVisibilityListenerC0232p = ((C0231o) arrayList2.get(i3)).f3372A;
            }
        }
        MenuC0229m menuC0229m3 = this.f3652c;
        if (menuC0229m3 != null) {
            menuC0229m3.i();
            arrayList = menuC0229m3.j;
        }
        if (this.f3658l && arrayList != null) {
            int size3 = arrayList.size();
            if (size3 == 1) {
                z2 = !((C0231o) arrayList.get(0)).f3374C;
            } else if (size3 > 0) {
                z2 = true;
            }
        }
        if (z2) {
            if (this.i == null) {
                this.i = new C0280j(this, this.f3650a);
            }
            ViewGroup viewGroup3 = (ViewGroup) this.i.getParent();
            if (viewGroup3 != this.f3656h) {
                if (viewGroup3 != null) {
                    viewGroup3.removeView(this.i);
                }
                ActionMenuView actionMenuView = (ActionMenuView) this.f3656h;
                C0280j c0280j = this.i;
                actionMenuView.getClass();
                C0286m j = ActionMenuView.j();
                j.f3671a = true;
                actionMenuView.addView(c0280j, j);
            }
        } else {
            C0280j c0280j2 = this.i;
            if (c0280j2 != null) {
                Object parent = c0280j2.getParent();
                Object obj = this.f3656h;
                if (parent == obj) {
                    ((ViewGroup) obj).removeView(this.i);
                }
            }
        }
        ((ActionMenuView) this.f3656h).setOverflowReserved(this.f3658l);
    }

    public final boolean e() {
        Object obj;
        RunnableC0278i runnableC0278i = this.f3667u;
        if (runnableC0278i != null && (obj = this.f3656h) != null) {
            ((View) obj).removeCallbacks(runnableC0278i);
            this.f3667u = null;
            return true;
        }
        C0274g c0274g = this.f3665s;
        if (c0274g == null) {
            return false;
        }
        if (c0274g.b()) {
            c0274g.i.dismiss();
        }
        return true;
    }

    @Override // m.InterfaceC0241y
    public final void f(Context context, MenuC0229m menuC0229m) {
        this.f3651b = context;
        LayoutInflater.from(context);
        this.f3652c = menuC0229m;
        Resources resources = context.getResources();
        if (!this.f3659m) {
            this.f3658l = true;
        }
        int i = 2;
        this.f3660n = context.getResources().getDisplayMetrics().widthPixels / 2;
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
        this.f3662p = i;
        int i4 = this.f3660n;
        if (this.f3658l) {
            if (this.i == null) {
                C0280j c0280j = new C0280j(this, this.f3650a);
                this.i = c0280j;
                if (this.f3657k) {
                    c0280j.setImageDrawable(this.j);
                    this.j = null;
                    this.f3657k = false;
                }
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
                this.i.measure(makeMeasureSpec, makeMeasureSpec);
            }
            i4 -= this.i.getMeasuredWidth();
        } else {
            this.i = null;
        }
        this.f3661o = i4;
        float f2 = resources.getDisplayMetrics().density;
    }

    @Override // m.InterfaceC0241y
    public final boolean g() {
        int i;
        ArrayList arrayList;
        int i2;
        boolean z2;
        MenuC0229m menuC0229m = this.f3652c;
        if (menuC0229m != null) {
            arrayList = menuC0229m.l();
            i = arrayList.size();
        } else {
            i = 0;
            arrayList = null;
        }
        int i3 = this.f3662p;
        int i4 = this.f3661o;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        ViewGroup viewGroup = (ViewGroup) this.f3656h;
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
            C0231o c0231o = (C0231o) arrayList.get(i5);
            int i8 = c0231o.f3396y;
            if ((i8 & 2) == 2) {
                i6++;
            } else if ((i8 & 1) == 1) {
                i7++;
            } else {
                z3 = true;
            }
            if (this.f3663q && c0231o.f3374C) {
                i3 = 0;
            }
            i5++;
        }
        if (this.f3658l && (z3 || i7 + i6 > i3)) {
            i3--;
        }
        int i9 = i3 - i6;
        SparseBooleanArray sparseBooleanArray = this.f3664r;
        sparseBooleanArray.clear();
        int i10 = 0;
        int i11 = 0;
        while (i10 < i) {
            C0231o c0231o2 = (C0231o) arrayList.get(i10);
            int i12 = c0231o2.f3396y;
            boolean z4 = (i12 & 2) == i2 ? z2 : false;
            int i13 = c0231o2.f3376b;
            if (z4) {
                View a2 = a(c0231o2, null, viewGroup);
                a2.measure(makeMeasureSpec, makeMeasureSpec);
                int measuredWidth = a2.getMeasuredWidth();
                i4 -= measuredWidth;
                if (i11 == 0) {
                    i11 = measuredWidth;
                }
                if (i13 != 0) {
                    sparseBooleanArray.put(i13, z2);
                }
                c0231o2.g(z2);
            } else if ((i12 & 1) == z2) {
                boolean z5 = sparseBooleanArray.get(i13);
                boolean z6 = ((i9 > 0 || z5) && i4 > 0) ? z2 : false;
                if (z6) {
                    View a3 = a(c0231o2, null, viewGroup);
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
                        C0231o c0231o3 = (C0231o) arrayList.get(i14);
                        if (c0231o3.f3376b == i13) {
                            if (c0231o3.f()) {
                                i9++;
                            }
                            c0231o3.g(false);
                        }
                    }
                }
                if (z6) {
                    i9--;
                }
                c0231o2.g(z6);
            } else {
                c0231o2.g(false);
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

    public final boolean h() {
        C0274g c0274g = this.f3665s;
        return c0274g != null && c0274g.b();
    }

    @Override // m.InterfaceC0241y
    public final void i(InterfaceC0240x interfaceC0240x) {
        throw null;
    }

    @Override // m.InterfaceC0241y
    public final boolean j(C0231o c0231o) {
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // m.InterfaceC0241y
    public final boolean k(SubMenuC0216E subMenuC0216E) {
        boolean z2;
        if (!subMenuC0216E.hasVisibleItems()) {
            return false;
        }
        SubMenuC0216E subMenuC0216E2 = subMenuC0216E;
        while (true) {
            MenuC0229m menuC0229m = subMenuC0216E2.f3289z;
            if (menuC0229m == this.f3652c) {
                break;
            }
            subMenuC0216E2 = (SubMenuC0216E) menuC0229m;
        }
        ViewGroup viewGroup = (ViewGroup) this.f3656h;
        View view = null;
        if (viewGroup != null) {
            int childCount = viewGroup.getChildCount();
            int i = 0;
            while (true) {
                if (i >= childCount) {
                    break;
                }
                View childAt = viewGroup.getChildAt(i);
                if ((childAt instanceof InterfaceC0242z) && ((InterfaceC0242z) childAt).getItemData() == subMenuC0216E2.f3288A) {
                    view = childAt;
                    break;
                }
                i++;
            }
        }
        if (view == null) {
            return false;
        }
        subMenuC0216E.f3288A.getClass();
        int size = subMenuC0216E.f3352f.size();
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                z2 = false;
                break;
            }
            MenuItem item = subMenuC0216E.getItem(i2);
            if (item.isVisible() && item.getIcon() != null) {
                z2 = true;
                break;
            }
            i2++;
        }
        C0274g c0274g = new C0274g(this, this.f3651b, subMenuC0216E, view);
        this.f3666t = c0274g;
        c0274g.f3415g = z2;
        AbstractC0237u abstractC0237u = c0274g.i;
        if (abstractC0237u != null) {
            abstractC0237u.o(z2);
        }
        C0274g c0274g2 = this.f3666t;
        if (!c0274g2.b()) {
            if (c0274g2.e == null) {
                throw new IllegalStateException("MenuPopupHelper cannot be used without an anchor");
            }
            c0274g2.d(0, 0, false, false);
        }
        InterfaceC0240x interfaceC0240x = this.e;
        if (interfaceC0240x != null) {
            interfaceC0240x.g(subMenuC0216E);
        }
        return true;
    }

    public final boolean l() {
        MenuC0229m menuC0229m;
        if (!this.f3658l || h() || (menuC0229m = this.f3652c) == null || this.f3656h == null || this.f3667u != null) {
            return false;
        }
        menuC0229m.i();
        if (menuC0229m.j.isEmpty()) {
            return false;
        }
        RunnableC0278i runnableC0278i = new RunnableC0278i(this, new C0274g(this, this.f3651b, this.f3652c, this.i));
        this.f3667u = runnableC0278i;
        ((View) this.f3656h).post(runnableC0278i);
        return true;
    }
}
