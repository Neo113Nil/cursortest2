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
import com.fortunequest.neontrack.R;
import java.util.ArrayList;
import k.AbstractC0198v;
import k.ActionProviderVisibilityListenerC0193q;
import k.C0191o;
import k.C0192p;
import k.InterfaceC0171A;
import k.InterfaceC0172B;
import k.InterfaceC0201y;
import k.InterfaceC0202z;
import k.MenuC0189m;
import k.SubMenuC0176F;

/* renamed from: l.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0242k implements InterfaceC0202z {

    /* renamed from: a, reason: collision with root package name */
    public final Context f3408a;

    /* renamed from: b, reason: collision with root package name */
    public Context f3409b;

    /* renamed from: c, reason: collision with root package name */
    public MenuC0189m f3410c;
    public final LayoutInflater d;

    /* renamed from: e, reason: collision with root package name */
    public InterfaceC0201y f3411e;
    public InterfaceC0172B h;
    public C0240j i;

    /* renamed from: j, reason: collision with root package name */
    public Drawable f3414j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f3415k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f3416l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f3417m;

    /* renamed from: n, reason: collision with root package name */
    public int f3418n;

    /* renamed from: o, reason: collision with root package name */
    public int f3419o;

    /* renamed from: p, reason: collision with root package name */
    public int f3420p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f3421q;

    /* renamed from: s, reason: collision with root package name */
    public C0234g f3423s;

    /* renamed from: t, reason: collision with root package name */
    public C0234g f3424t;

    /* renamed from: u, reason: collision with root package name */
    public RunnableC0238i f3425u;

    /* renamed from: v, reason: collision with root package name */
    public C0236h f3426v;

    /* renamed from: f, reason: collision with root package name */
    public final int f3412f = R.layout.abc_action_menu_layout;

    /* renamed from: g, reason: collision with root package name */
    public final int f3413g = R.layout.abc_action_menu_item_layout;

    /* renamed from: r, reason: collision with root package name */
    public final SparseBooleanArray f3422r = new SparseBooleanArray();

    /* renamed from: w, reason: collision with root package name */
    public final C0191o f3427w = new C0191o(this);

    public C0242k(Context context) {
        this.f3408a = context;
        this.d = LayoutInflater.from(context);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r5v4, types: [k.A] */
    /* JADX WARN: Type inference failed for: r5v7 */
    /* JADX WARN: Type inference failed for: r5v8 */
    public final View a(C0192p c0192p, View view, ViewGroup viewGroup) {
        View actionView = c0192p.getActionView();
        if (actionView == null || c0192p.e()) {
            ActionMenuItemView actionMenuItemView = view instanceof InterfaceC0171A ? (InterfaceC0171A) view : (InterfaceC0171A) this.d.inflate(this.f3413g, viewGroup, false);
            actionMenuItemView.a(c0192p);
            ActionMenuItemView actionMenuItemView2 = actionMenuItemView;
            actionMenuItemView2.setItemInvoker((ActionMenuView) this.h);
            if (this.f3426v == null) {
                this.f3426v = new C0236h(this);
            }
            actionMenuItemView2.setPopupCallback(this.f3426v);
            actionView = actionMenuItemView;
        }
        actionView.setVisibility(c0192p.f3190C ? 8 : 0);
        ViewGroup.LayoutParams layoutParams = actionView.getLayoutParams();
        ((ActionMenuView) viewGroup).getClass();
        if (!(layoutParams instanceof C0246m)) {
            actionView.setLayoutParams(ActionMenuView.k(layoutParams));
        }
        return actionView;
    }

    @Override // k.InterfaceC0202z
    public final void b(MenuC0189m menuC0189m, boolean z2) {
        f();
        C0234g c0234g = this.f3424t;
        if (c0234g != null && c0234g.b()) {
            c0234g.i.dismiss();
        }
        InterfaceC0201y interfaceC0201y = this.f3411e;
        if (interfaceC0201y != null) {
            interfaceC0201y.b(menuC0189m, z2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // k.InterfaceC0202z
    public final void c() {
        int i;
        ViewGroup viewGroup = (ViewGroup) this.h;
        ArrayList arrayList = null;
        boolean z2 = false;
        if (viewGroup != null) {
            MenuC0189m menuC0189m = this.f3410c;
            if (menuC0189m != null) {
                menuC0189m.i();
                ArrayList l2 = this.f3410c.l();
                int size = l2.size();
                i = 0;
                for (int i2 = 0; i2 < size; i2++) {
                    C0192p c0192p = (C0192p) l2.get(i2);
                    if (c0192p.f()) {
                        View childAt = viewGroup.getChildAt(i);
                        C0192p itemData = childAt instanceof InterfaceC0171A ? ((InterfaceC0171A) childAt).getItemData() : null;
                        View a2 = a(c0192p, childAt, viewGroup);
                        if (c0192p != itemData) {
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
        MenuC0189m menuC0189m2 = this.f3410c;
        if (menuC0189m2 != null) {
            menuC0189m2.i();
            ArrayList arrayList2 = menuC0189m2.i;
            int size2 = arrayList2.size();
            for (int i3 = 0; i3 < size2; i3++) {
                ActionProviderVisibilityListenerC0193q actionProviderVisibilityListenerC0193q = ((C0192p) arrayList2.get(i3)).f3188A;
            }
        }
        MenuC0189m menuC0189m3 = this.f3410c;
        if (menuC0189m3 != null) {
            menuC0189m3.i();
            arrayList = menuC0189m3.f3169j;
        }
        if (this.f3416l && arrayList != null) {
            int size3 = arrayList.size();
            if (size3 == 1) {
                z2 = !((C0192p) arrayList.get(0)).f3190C;
            } else if (size3 > 0) {
                z2 = true;
            }
        }
        if (z2) {
            if (this.i == null) {
                this.i = new C0240j(this, this.f3408a);
            }
            ViewGroup viewGroup3 = (ViewGroup) this.i.getParent();
            if (viewGroup3 != this.h) {
                if (viewGroup3 != null) {
                    viewGroup3.removeView(this.i);
                }
                ActionMenuView actionMenuView = (ActionMenuView) this.h;
                C0240j c0240j = this.i;
                actionMenuView.getClass();
                C0246m j2 = ActionMenuView.j();
                j2.f3430a = true;
                actionMenuView.addView(c0240j, j2);
            }
        } else {
            C0240j c0240j2 = this.i;
            if (c0240j2 != null) {
                Object parent = c0240j2.getParent();
                Object obj = this.h;
                if (parent == obj) {
                    ((ViewGroup) obj).removeView(this.i);
                }
            }
        }
        ((ActionMenuView) this.h).setOverflowReserved(this.f3416l);
    }

    @Override // k.InterfaceC0202z
    public final boolean d(C0192p c0192p) {
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // k.InterfaceC0202z
    public final boolean e(SubMenuC0176F subMenuC0176F) {
        boolean z2;
        if (!subMenuC0176F.hasVisibleItems()) {
            return false;
        }
        SubMenuC0176F subMenuC0176F2 = subMenuC0176F;
        while (true) {
            MenuC0189m menuC0189m = subMenuC0176F2.f3104z;
            if (menuC0189m == this.f3410c) {
                break;
            }
            subMenuC0176F2 = (SubMenuC0176F) menuC0189m;
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
                if ((childAt instanceof InterfaceC0171A) && ((InterfaceC0171A) childAt).getItemData() == subMenuC0176F2.f3103A) {
                    view = childAt;
                    break;
                }
                i++;
            }
        }
        if (view == null) {
            return false;
        }
        subMenuC0176F.f3103A.getClass();
        int size = subMenuC0176F.f3167f.size();
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                z2 = false;
                break;
            }
            MenuItem item = subMenuC0176F.getItem(i2);
            if (item.isVisible() && item.getIcon() != null) {
                z2 = true;
                break;
            }
            i2++;
        }
        C0234g c0234g = new C0234g(this, this.f3409b, subMenuC0176F, view);
        this.f3424t = c0234g;
        c0234g.f3230g = z2;
        AbstractC0198v abstractC0198v = c0234g.i;
        if (abstractC0198v != null) {
            abstractC0198v.o(z2);
        }
        C0234g c0234g2 = this.f3424t;
        if (!c0234g2.b()) {
            if (c0234g2.f3228e == null) {
                throw new IllegalStateException("MenuPopupHelper cannot be used without an anchor");
            }
            c0234g2.d(0, 0, false, false);
        }
        InterfaceC0201y interfaceC0201y = this.f3411e;
        if (interfaceC0201y != null) {
            interfaceC0201y.c(subMenuC0176F);
        }
        return true;
    }

    public final boolean f() {
        Object obj;
        RunnableC0238i runnableC0238i = this.f3425u;
        if (runnableC0238i != null && (obj = this.h) != null) {
            ((View) obj).removeCallbacks(runnableC0238i);
            this.f3425u = null;
            return true;
        }
        C0234g c0234g = this.f3423s;
        if (c0234g == null) {
            return false;
        }
        if (c0234g.b()) {
            c0234g.i.dismiss();
        }
        return true;
    }

    @Override // k.InterfaceC0202z
    public final void g(InterfaceC0201y interfaceC0201y) {
        throw null;
    }

    @Override // k.InterfaceC0202z
    public final boolean h(C0192p c0192p) {
        return false;
    }

    public final boolean i() {
        C0234g c0234g = this.f3423s;
        return c0234g != null && c0234g.b();
    }

    @Override // k.InterfaceC0202z
    public final void j(Context context, MenuC0189m menuC0189m) {
        this.f3409b = context;
        LayoutInflater.from(context);
        this.f3410c = menuC0189m;
        Resources resources = context.getResources();
        if (!this.f3417m) {
            this.f3416l = true;
        }
        int i = 2;
        this.f3418n = context.getResources().getDisplayMetrics().widthPixels / 2;
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
        this.f3420p = i;
        int i4 = this.f3418n;
        if (this.f3416l) {
            if (this.i == null) {
                C0240j c0240j = new C0240j(this, this.f3408a);
                this.i = c0240j;
                if (this.f3415k) {
                    c0240j.setImageDrawable(this.f3414j);
                    this.f3414j = null;
                    this.f3415k = false;
                }
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
                this.i.measure(makeMeasureSpec, makeMeasureSpec);
            }
            i4 -= this.i.getMeasuredWidth();
        } else {
            this.i = null;
        }
        this.f3419o = i4;
        float f2 = resources.getDisplayMetrics().density;
    }

    @Override // k.InterfaceC0202z
    public final boolean k() {
        int i;
        ArrayList arrayList;
        int i2;
        boolean z2;
        MenuC0189m menuC0189m = this.f3410c;
        if (menuC0189m != null) {
            arrayList = menuC0189m.l();
            i = arrayList.size();
        } else {
            i = 0;
            arrayList = null;
        }
        int i3 = this.f3420p;
        int i4 = this.f3419o;
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
            C0192p c0192p = (C0192p) arrayList.get(i5);
            int i8 = c0192p.f3212y;
            if ((i8 & 2) == 2) {
                i6++;
            } else if ((i8 & 1) == 1) {
                i7++;
            } else {
                z3 = true;
            }
            if (this.f3421q && c0192p.f3190C) {
                i3 = 0;
            }
            i5++;
        }
        if (this.f3416l && (z3 || i7 + i6 > i3)) {
            i3--;
        }
        int i9 = i3 - i6;
        SparseBooleanArray sparseBooleanArray = this.f3422r;
        sparseBooleanArray.clear();
        int i10 = 0;
        int i11 = 0;
        while (i10 < i) {
            C0192p c0192p2 = (C0192p) arrayList.get(i10);
            int i12 = c0192p2.f3212y;
            boolean z4 = (i12 & 2) == i2 ? z2 : false;
            int i13 = c0192p2.f3192b;
            if (z4) {
                View a2 = a(c0192p2, null, viewGroup);
                a2.measure(makeMeasureSpec, makeMeasureSpec);
                int measuredWidth = a2.getMeasuredWidth();
                i4 -= measuredWidth;
                if (i11 == 0) {
                    i11 = measuredWidth;
                }
                if (i13 != 0) {
                    sparseBooleanArray.put(i13, z2);
                }
                c0192p2.g(z2);
            } else if ((i12 & 1) == z2) {
                boolean z5 = sparseBooleanArray.get(i13);
                boolean z6 = ((i9 > 0 || z5) && i4 > 0) ? z2 : false;
                if (z6) {
                    View a3 = a(c0192p2, null, viewGroup);
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
                        C0192p c0192p3 = (C0192p) arrayList.get(i14);
                        if (c0192p3.f3192b == i13) {
                            if (c0192p3.f()) {
                                i9++;
                            }
                            c0192p3.g(false);
                        }
                    }
                }
                if (z6) {
                    i9--;
                }
                c0192p2.g(z6);
            } else {
                c0192p2.g(false);
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
        MenuC0189m menuC0189m;
        if (!this.f3416l || i() || (menuC0189m = this.f3410c) == null || this.h == null || this.f3425u != null) {
            return false;
        }
        menuC0189m.i();
        if (menuC0189m.f3169j.isEmpty()) {
            return false;
        }
        RunnableC0238i runnableC0238i = new RunnableC0238i(this, new C0234g(this, this.f3409b, this.f3410c, this.i));
        this.f3425u = runnableC0238i;
        ((View) this.h).post(runnableC0238i);
        return true;
    }
}
