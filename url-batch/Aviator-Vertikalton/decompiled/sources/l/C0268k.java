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
import com.fortuneink.neonpad.R;
import java.util.ArrayList;
import k.AbstractC0208u;
import k.ActionProviderVisibilityListenerC0203p;
import k.C0202o;
import k.InterfaceC0183A;
import k.InterfaceC0211x;
import k.InterfaceC0212y;
import k.InterfaceC0213z;
import k.MenuC0200m;
import k.SubMenuC0187E;

/* renamed from: l.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0268k implements InterfaceC0212y {

    /* renamed from: a, reason: collision with root package name */
    public final Context f3386a;

    /* renamed from: b, reason: collision with root package name */
    public Context f3387b;

    /* renamed from: c, reason: collision with root package name */
    public MenuC0200m f3388c;

    /* renamed from: d, reason: collision with root package name */
    public final LayoutInflater f3389d;

    /* renamed from: e, reason: collision with root package name */
    public InterfaceC0211x f3390e;
    public InterfaceC0183A h;
    public C0266j i;

    /* renamed from: j, reason: collision with root package name */
    public Drawable f3393j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f3394k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f3395l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f3396m;

    /* renamed from: n, reason: collision with root package name */
    public int f3397n;

    /* renamed from: o, reason: collision with root package name */
    public int f3398o;

    /* renamed from: p, reason: collision with root package name */
    public int f3399p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f3400q;

    /* renamed from: s, reason: collision with root package name */
    public C0260g f3402s;

    /* renamed from: t, reason: collision with root package name */
    public C0260g f3403t;

    /* renamed from: u, reason: collision with root package name */
    public RunnableC0264i f3404u;

    /* renamed from: v, reason: collision with root package name */
    public C0262h f3405v;

    /* renamed from: f, reason: collision with root package name */
    public final int f3391f = R.layout.abc_action_menu_layout;

    /* renamed from: g, reason: collision with root package name */
    public final int f3392g = R.layout.abc_action_menu_item_layout;

    /* renamed from: r, reason: collision with root package name */
    public final SparseBooleanArray f3401r = new SparseBooleanArray();

    /* renamed from: w, reason: collision with root package name */
    public final B0.d f3406w = new B0.d(29, this);

    public C0268k(Context context) {
        this.f3386a = context;
        this.f3389d = LayoutInflater.from(context);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r5v4, types: [k.z] */
    /* JADX WARN: Type inference failed for: r5v7 */
    /* JADX WARN: Type inference failed for: r5v8 */
    public final View a(C0202o c0202o, View view, ViewGroup viewGroup) {
        View actionView = c0202o.getActionView();
        if (actionView == null || c0202o.e()) {
            ActionMenuItemView actionMenuItemView = view instanceof InterfaceC0213z ? (InterfaceC0213z) view : (InterfaceC0213z) this.f3389d.inflate(this.f3392g, viewGroup, false);
            actionMenuItemView.a(c0202o);
            ActionMenuItemView actionMenuItemView2 = actionMenuItemView;
            actionMenuItemView2.setItemInvoker((ActionMenuView) this.h);
            if (this.f3405v == null) {
                this.f3405v = new C0262h(this);
            }
            actionMenuItemView2.setPopupCallback(this.f3405v);
            actionView = actionMenuItemView;
        }
        actionView.setVisibility(c0202o.f3084C ? 8 : 0);
        ViewGroup.LayoutParams layoutParams = actionView.getLayoutParams();
        ((ActionMenuView) viewGroup).getClass();
        if (!(layoutParams instanceof C0272m)) {
            actionView.setLayoutParams(ActionMenuView.k(layoutParams));
        }
        return actionView;
    }

    @Override // k.InterfaceC0212y
    public final void b(MenuC0200m menuC0200m, boolean z2) {
        f();
        C0260g c0260g = this.f3403t;
        if (c0260g != null && c0260g.b()) {
            c0260g.i.dismiss();
        }
        InterfaceC0211x interfaceC0211x = this.f3390e;
        if (interfaceC0211x != null) {
            interfaceC0211x.b(menuC0200m, z2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // k.InterfaceC0212y
    public final void c() {
        int i;
        ViewGroup viewGroup = (ViewGroup) this.h;
        ArrayList arrayList = null;
        boolean z2 = false;
        if (viewGroup != null) {
            MenuC0200m menuC0200m = this.f3388c;
            if (menuC0200m != null) {
                menuC0200m.i();
                ArrayList l2 = this.f3388c.l();
                int size = l2.size();
                i = 0;
                for (int i2 = 0; i2 < size; i2++) {
                    C0202o c0202o = (C0202o) l2.get(i2);
                    if (c0202o.f()) {
                        View childAt = viewGroup.getChildAt(i);
                        C0202o itemData = childAt instanceof InterfaceC0213z ? ((InterfaceC0213z) childAt).getItemData() : null;
                        View a2 = a(c0202o, childAt, viewGroup);
                        if (c0202o != itemData) {
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
        MenuC0200m menuC0200m2 = this.f3388c;
        if (menuC0200m2 != null) {
            menuC0200m2.i();
            ArrayList arrayList2 = menuC0200m2.i;
            int size2 = arrayList2.size();
            for (int i3 = 0; i3 < size2; i3++) {
                ActionProviderVisibilityListenerC0203p actionProviderVisibilityListenerC0203p = ((C0202o) arrayList2.get(i3)).f3082A;
            }
        }
        MenuC0200m menuC0200m3 = this.f3388c;
        if (menuC0200m3 != null) {
            menuC0200m3.i();
            arrayList = menuC0200m3.f3064j;
        }
        if (this.f3395l && arrayList != null) {
            int size3 = arrayList.size();
            if (size3 == 1) {
                z2 = !((C0202o) arrayList.get(0)).f3084C;
            } else if (size3 > 0) {
                z2 = true;
            }
        }
        if (z2) {
            if (this.i == null) {
                this.i = new C0266j(this, this.f3386a);
            }
            ViewGroup viewGroup3 = (ViewGroup) this.i.getParent();
            if (viewGroup3 != this.h) {
                if (viewGroup3 != null) {
                    viewGroup3.removeView(this.i);
                }
                ActionMenuView actionMenuView = (ActionMenuView) this.h;
                C0266j c0266j = this.i;
                actionMenuView.getClass();
                C0272m j2 = ActionMenuView.j();
                j2.f3410a = true;
                actionMenuView.addView(c0266j, j2);
            }
        } else {
            C0266j c0266j2 = this.i;
            if (c0266j2 != null) {
                Object parent = c0266j2.getParent();
                Object obj = this.h;
                if (parent == obj) {
                    ((ViewGroup) obj).removeView(this.i);
                }
            }
        }
        ((ActionMenuView) this.h).setOverflowReserved(this.f3395l);
    }

    @Override // k.InterfaceC0212y
    public final boolean d(C0202o c0202o) {
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // k.InterfaceC0212y
    public final boolean e(SubMenuC0187E subMenuC0187E) {
        boolean z2;
        if (!subMenuC0187E.hasVisibleItems()) {
            return false;
        }
        SubMenuC0187E subMenuC0187E2 = subMenuC0187E;
        while (true) {
            MenuC0200m menuC0200m = subMenuC0187E2.f2993z;
            if (menuC0200m == this.f3388c) {
                break;
            }
            subMenuC0187E2 = (SubMenuC0187E) menuC0200m;
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
                if ((childAt instanceof InterfaceC0213z) && ((InterfaceC0213z) childAt).getItemData() == subMenuC0187E2.f2992A) {
                    view = childAt;
                    break;
                }
                i++;
            }
        }
        if (view == null) {
            return false;
        }
        subMenuC0187E.f2992A.getClass();
        int size = subMenuC0187E.f3062f.size();
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                z2 = false;
                break;
            }
            MenuItem item = subMenuC0187E.getItem(i2);
            if (item.isVisible() && item.getIcon() != null) {
                z2 = true;
                break;
            }
            i2++;
        }
        C0260g c0260g = new C0260g(this, this.f3387b, subMenuC0187E, view);
        this.f3403t = c0260g;
        c0260g.f3127g = z2;
        AbstractC0208u abstractC0208u = c0260g.i;
        if (abstractC0208u != null) {
            abstractC0208u.o(z2);
        }
        C0260g c0260g2 = this.f3403t;
        if (!c0260g2.b()) {
            if (c0260g2.f3125e == null) {
                throw new IllegalStateException("MenuPopupHelper cannot be used without an anchor");
            }
            c0260g2.d(0, 0, false, false);
        }
        InterfaceC0211x interfaceC0211x = this.f3390e;
        if (interfaceC0211x != null) {
            interfaceC0211x.f(subMenuC0187E);
        }
        return true;
    }

    public final boolean f() {
        Object obj;
        RunnableC0264i runnableC0264i = this.f3404u;
        if (runnableC0264i != null && (obj = this.h) != null) {
            ((View) obj).removeCallbacks(runnableC0264i);
            this.f3404u = null;
            return true;
        }
        C0260g c0260g = this.f3402s;
        if (c0260g == null) {
            return false;
        }
        if (c0260g.b()) {
            c0260g.i.dismiss();
        }
        return true;
    }

    @Override // k.InterfaceC0212y
    public final void g(InterfaceC0211x interfaceC0211x) {
        throw null;
    }

    @Override // k.InterfaceC0212y
    public final boolean h(C0202o c0202o) {
        return false;
    }

    public final boolean i() {
        C0260g c0260g = this.f3402s;
        return c0260g != null && c0260g.b();
    }

    @Override // k.InterfaceC0212y
    public final void j(Context context, MenuC0200m menuC0200m) {
        this.f3387b = context;
        LayoutInflater.from(context);
        this.f3388c = menuC0200m;
        Resources resources = context.getResources();
        if (!this.f3396m) {
            this.f3395l = true;
        }
        int i = 2;
        this.f3397n = context.getResources().getDisplayMetrics().widthPixels / 2;
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
        this.f3399p = i;
        int i4 = this.f3397n;
        if (this.f3395l) {
            if (this.i == null) {
                C0266j c0266j = new C0266j(this, this.f3386a);
                this.i = c0266j;
                if (this.f3394k) {
                    c0266j.setImageDrawable(this.f3393j);
                    this.f3393j = null;
                    this.f3394k = false;
                }
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
                this.i.measure(makeMeasureSpec, makeMeasureSpec);
            }
            i4 -= this.i.getMeasuredWidth();
        } else {
            this.i = null;
        }
        this.f3398o = i4;
        float f2 = resources.getDisplayMetrics().density;
    }

    @Override // k.InterfaceC0212y
    public final boolean k() {
        int i;
        ArrayList arrayList;
        int i2;
        boolean z2;
        MenuC0200m menuC0200m = this.f3388c;
        if (menuC0200m != null) {
            arrayList = menuC0200m.l();
            i = arrayList.size();
        } else {
            i = 0;
            arrayList = null;
        }
        int i3 = this.f3399p;
        int i4 = this.f3398o;
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
            C0202o c0202o = (C0202o) arrayList.get(i5);
            int i8 = c0202o.f3107y;
            if ((i8 & 2) == 2) {
                i6++;
            } else if ((i8 & 1) == 1) {
                i7++;
            } else {
                z3 = true;
            }
            if (this.f3400q && c0202o.f3084C) {
                i3 = 0;
            }
            i5++;
        }
        if (this.f3395l && (z3 || i7 + i6 > i3)) {
            i3--;
        }
        int i9 = i3 - i6;
        SparseBooleanArray sparseBooleanArray = this.f3401r;
        sparseBooleanArray.clear();
        int i10 = 0;
        int i11 = 0;
        while (i10 < i) {
            C0202o c0202o2 = (C0202o) arrayList.get(i10);
            int i12 = c0202o2.f3107y;
            boolean z4 = (i12 & 2) == i2 ? z2 : false;
            int i13 = c0202o2.f3086b;
            if (z4) {
                View a2 = a(c0202o2, null, viewGroup);
                a2.measure(makeMeasureSpec, makeMeasureSpec);
                int measuredWidth = a2.getMeasuredWidth();
                i4 -= measuredWidth;
                if (i11 == 0) {
                    i11 = measuredWidth;
                }
                if (i13 != 0) {
                    sparseBooleanArray.put(i13, z2);
                }
                c0202o2.g(z2);
            } else if ((i12 & 1) == z2) {
                boolean z5 = sparseBooleanArray.get(i13);
                boolean z6 = ((i9 > 0 || z5) && i4 > 0) ? z2 : false;
                if (z6) {
                    View a3 = a(c0202o2, null, viewGroup);
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
                        C0202o c0202o3 = (C0202o) arrayList.get(i14);
                        if (c0202o3.f3086b == i13) {
                            if (c0202o3.f()) {
                                i9++;
                            }
                            c0202o3.g(false);
                        }
                    }
                }
                if (z6) {
                    i9--;
                }
                c0202o2.g(z6);
            } else {
                c0202o2.g(false);
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
        MenuC0200m menuC0200m;
        if (!this.f3395l || i() || (menuC0200m = this.f3388c) == null || this.h == null || this.f3404u != null) {
            return false;
        }
        menuC0200m.i();
        if (menuC0200m.f3064j.isEmpty()) {
            return false;
        }
        RunnableC0264i runnableC0264i = new RunnableC0264i(this, new C0260g(this, this.f3387b, this.f3388c, this.i));
        this.f3404u = runnableC0264i;
        ((View) this.h).post(runnableC0264i);
        return true;
    }
}
