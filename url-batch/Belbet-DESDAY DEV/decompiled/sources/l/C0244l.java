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
import com.quicktoss.winflip.R;
import java.util.ArrayList;
import k.AbstractC0165u;
import k.ActionProviderVisibilityListenerC0160p;
import k.C0159o;
import k.InterfaceC0140A;
import k.InterfaceC0168x;
import k.InterfaceC0169y;
import k.InterfaceC0170z;
import k.MenuC0157m;
import k.SubMenuC0144E;

/* renamed from: l.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0244l implements InterfaceC0169y {

    /* renamed from: a, reason: collision with root package name */
    public final Context f3009a;

    /* renamed from: b, reason: collision with root package name */
    public Context f3010b;

    /* renamed from: c, reason: collision with root package name */
    public MenuC0157m f3011c;
    public final LayoutInflater d;

    /* renamed from: e, reason: collision with root package name */
    public InterfaceC0168x f3012e;
    public InterfaceC0140A h;
    public C0240j i;

    /* renamed from: j, reason: collision with root package name */
    public Drawable f3015j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f3016k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f3017l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f3018m;

    /* renamed from: n, reason: collision with root package name */
    public int f3019n;

    /* renamed from: o, reason: collision with root package name */
    public int f3020o;

    /* renamed from: p, reason: collision with root package name */
    public int f3021p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f3022q;

    /* renamed from: s, reason: collision with root package name */
    public C0234g f3024s;

    /* renamed from: t, reason: collision with root package name */
    public C0234g f3025t;

    /* renamed from: u, reason: collision with root package name */
    public RunnableC0238i f3026u;

    /* renamed from: v, reason: collision with root package name */
    public C0236h f3027v;

    /* renamed from: f, reason: collision with root package name */
    public final int f3013f = R.layout.abc_action_menu_layout;

    /* renamed from: g, reason: collision with root package name */
    public final int f3014g = R.layout.abc_action_menu_item_layout;

    /* renamed from: r, reason: collision with root package name */
    public final SparseBooleanArray f3023r = new SparseBooleanArray();

    /* renamed from: w, reason: collision with root package name */
    public final C0242k f3028w = new C0242k(this);

    public C0244l(Context context) {
        this.f3009a = context;
        this.d = LayoutInflater.from(context);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r5v4, types: [k.z] */
    /* JADX WARN: Type inference failed for: r5v7 */
    /* JADX WARN: Type inference failed for: r5v8 */
    public final View a(C0159o c0159o, View view, ViewGroup viewGroup) {
        View actionView = c0159o.getActionView();
        if (actionView == null || c0159o.e()) {
            ActionMenuItemView actionMenuItemView = view instanceof InterfaceC0170z ? (InterfaceC0170z) view : (InterfaceC0170z) this.d.inflate(this.f3014g, viewGroup, false);
            actionMenuItemView.a(c0159o);
            ActionMenuItemView actionMenuItemView2 = actionMenuItemView;
            actionMenuItemView2.setItemInvoker((ActionMenuView) this.h);
            if (this.f3027v == null) {
                this.f3027v = new C0236h(this);
            }
            actionMenuItemView2.setPopupCallback(this.f3027v);
            actionView = actionMenuItemView;
        }
        actionView.setVisibility(c0159o.f2712C ? 8 : 0);
        ViewGroup.LayoutParams layoutParams = actionView.getLayoutParams();
        ((ActionMenuView) viewGroup).getClass();
        if (!(layoutParams instanceof C0248n)) {
            actionView.setLayoutParams(ActionMenuView.k(layoutParams));
        }
        return actionView;
    }

    @Override // k.InterfaceC0169y
    public final void b(MenuC0157m menuC0157m, boolean z2) {
        f();
        C0234g c0234g = this.f3025t;
        if (c0234g != null && c0234g.b()) {
            c0234g.i.dismiss();
        }
        InterfaceC0168x interfaceC0168x = this.f3012e;
        if (interfaceC0168x != null) {
            interfaceC0168x.b(menuC0157m, z2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // k.InterfaceC0169y
    public final void c() {
        int i;
        ViewGroup viewGroup = (ViewGroup) this.h;
        ArrayList arrayList = null;
        boolean z2 = false;
        if (viewGroup != null) {
            MenuC0157m menuC0157m = this.f3011c;
            if (menuC0157m != null) {
                menuC0157m.i();
                ArrayList l2 = this.f3011c.l();
                int size = l2.size();
                i = 0;
                for (int i2 = 0; i2 < size; i2++) {
                    C0159o c0159o = (C0159o) l2.get(i2);
                    if (c0159o.f()) {
                        View childAt = viewGroup.getChildAt(i);
                        C0159o itemData = childAt instanceof InterfaceC0170z ? ((InterfaceC0170z) childAt).getItemData() : null;
                        View a2 = a(c0159o, childAt, viewGroup);
                        if (c0159o != itemData) {
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
        MenuC0157m menuC0157m2 = this.f3011c;
        if (menuC0157m2 != null) {
            menuC0157m2.i();
            ArrayList arrayList2 = menuC0157m2.i;
            int size2 = arrayList2.size();
            for (int i3 = 0; i3 < size2; i3++) {
                ActionProviderVisibilityListenerC0160p actionProviderVisibilityListenerC0160p = ((C0159o) arrayList2.get(i3)).f2710A;
            }
        }
        MenuC0157m menuC0157m3 = this.f3011c;
        if (menuC0157m3 != null) {
            menuC0157m3.i();
            arrayList = menuC0157m3.f2692j;
        }
        if (this.f3017l && arrayList != null) {
            int size3 = arrayList.size();
            if (size3 == 1) {
                z2 = !((C0159o) arrayList.get(0)).f2712C;
            } else if (size3 > 0) {
                z2 = true;
            }
        }
        if (z2) {
            if (this.i == null) {
                this.i = new C0240j(this, this.f3009a);
            }
            ViewGroup viewGroup3 = (ViewGroup) this.i.getParent();
            if (viewGroup3 != this.h) {
                if (viewGroup3 != null) {
                    viewGroup3.removeView(this.i);
                }
                ActionMenuView actionMenuView = (ActionMenuView) this.h;
                C0240j c0240j = this.i;
                actionMenuView.getClass();
                C0248n j2 = ActionMenuView.j();
                j2.f3029a = true;
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
        ((ActionMenuView) this.h).setOverflowReserved(this.f3017l);
    }

    @Override // k.InterfaceC0169y
    public final boolean d(C0159o c0159o) {
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // k.InterfaceC0169y
    public final boolean e(SubMenuC0144E subMenuC0144E) {
        boolean z2;
        if (!subMenuC0144E.hasVisibleItems()) {
            return false;
        }
        SubMenuC0144E subMenuC0144E2 = subMenuC0144E;
        while (true) {
            MenuC0157m menuC0157m = subMenuC0144E2.f2627z;
            if (menuC0157m == this.f3011c) {
                break;
            }
            subMenuC0144E2 = (SubMenuC0144E) menuC0157m;
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
                if ((childAt instanceof InterfaceC0170z) && ((InterfaceC0170z) childAt).getItemData() == subMenuC0144E2.f2626A) {
                    view = childAt;
                    break;
                }
                i++;
            }
        }
        if (view == null) {
            return false;
        }
        subMenuC0144E.f2626A.getClass();
        int size = subMenuC0144E.f2690f.size();
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                z2 = false;
                break;
            }
            MenuItem item = subMenuC0144E.getItem(i2);
            if (item.isVisible() && item.getIcon() != null) {
                z2 = true;
                break;
            }
            i2++;
        }
        C0234g c0234g = new C0234g(this, this.f3010b, subMenuC0144E, view);
        this.f3025t = c0234g;
        c0234g.f2752g = z2;
        AbstractC0165u abstractC0165u = c0234g.i;
        if (abstractC0165u != null) {
            abstractC0165u.o(z2);
        }
        C0234g c0234g2 = this.f3025t;
        if (!c0234g2.b()) {
            if (c0234g2.f2750e == null) {
                throw new IllegalStateException("MenuPopupHelper cannot be used without an anchor");
            }
            c0234g2.d(0, 0, false, false);
        }
        InterfaceC0168x interfaceC0168x = this.f3012e;
        if (interfaceC0168x != null) {
            interfaceC0168x.c(subMenuC0144E);
        }
        return true;
    }

    public final boolean f() {
        Object obj;
        RunnableC0238i runnableC0238i = this.f3026u;
        if (runnableC0238i != null && (obj = this.h) != null) {
            ((View) obj).removeCallbacks(runnableC0238i);
            this.f3026u = null;
            return true;
        }
        C0234g c0234g = this.f3024s;
        if (c0234g == null) {
            return false;
        }
        if (c0234g.b()) {
            c0234g.i.dismiss();
        }
        return true;
    }

    @Override // k.InterfaceC0169y
    public final void g(InterfaceC0168x interfaceC0168x) {
        throw null;
    }

    @Override // k.InterfaceC0169y
    public final boolean h(C0159o c0159o) {
        return false;
    }

    public final boolean i() {
        C0234g c0234g = this.f3024s;
        return c0234g != null && c0234g.b();
    }

    @Override // k.InterfaceC0169y
    public final void j(Context context, MenuC0157m menuC0157m) {
        this.f3010b = context;
        LayoutInflater.from(context);
        this.f3011c = menuC0157m;
        Resources resources = context.getResources();
        if (!this.f3018m) {
            this.f3017l = true;
        }
        int i = 2;
        this.f3019n = context.getResources().getDisplayMetrics().widthPixels / 2;
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
        this.f3021p = i;
        int i4 = this.f3019n;
        if (this.f3017l) {
            if (this.i == null) {
                C0240j c0240j = new C0240j(this, this.f3009a);
                this.i = c0240j;
                if (this.f3016k) {
                    c0240j.setImageDrawable(this.f3015j);
                    this.f3015j = null;
                    this.f3016k = false;
                }
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
                this.i.measure(makeMeasureSpec, makeMeasureSpec);
            }
            i4 -= this.i.getMeasuredWidth();
        } else {
            this.i = null;
        }
        this.f3020o = i4;
        float f2 = resources.getDisplayMetrics().density;
    }

    @Override // k.InterfaceC0169y
    public final boolean k() {
        int i;
        ArrayList arrayList;
        int i2;
        boolean z2;
        MenuC0157m menuC0157m = this.f3011c;
        if (menuC0157m != null) {
            arrayList = menuC0157m.l();
            i = arrayList.size();
        } else {
            i = 0;
            arrayList = null;
        }
        int i3 = this.f3021p;
        int i4 = this.f3020o;
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
            C0159o c0159o = (C0159o) arrayList.get(i5);
            int i8 = c0159o.f2734y;
            if ((i8 & 2) == 2) {
                i6++;
            } else if ((i8 & 1) == 1) {
                i7++;
            } else {
                z3 = true;
            }
            if (this.f3022q && c0159o.f2712C) {
                i3 = 0;
            }
            i5++;
        }
        if (this.f3017l && (z3 || i7 + i6 > i3)) {
            i3--;
        }
        int i9 = i3 - i6;
        SparseBooleanArray sparseBooleanArray = this.f3023r;
        sparseBooleanArray.clear();
        int i10 = 0;
        int i11 = 0;
        while (i10 < i) {
            C0159o c0159o2 = (C0159o) arrayList.get(i10);
            int i12 = c0159o2.f2734y;
            boolean z4 = (i12 & 2) == i2 ? z2 : false;
            int i13 = c0159o2.f2714b;
            if (z4) {
                View a2 = a(c0159o2, null, viewGroup);
                a2.measure(makeMeasureSpec, makeMeasureSpec);
                int measuredWidth = a2.getMeasuredWidth();
                i4 -= measuredWidth;
                if (i11 == 0) {
                    i11 = measuredWidth;
                }
                if (i13 != 0) {
                    sparseBooleanArray.put(i13, z2);
                }
                c0159o2.g(z2);
            } else if ((i12 & 1) == z2) {
                boolean z5 = sparseBooleanArray.get(i13);
                boolean z6 = ((i9 > 0 || z5) && i4 > 0) ? z2 : false;
                if (z6) {
                    View a3 = a(c0159o2, null, viewGroup);
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
                        C0159o c0159o3 = (C0159o) arrayList.get(i14);
                        if (c0159o3.f2714b == i13) {
                            if (c0159o3.f()) {
                                i9++;
                            }
                            c0159o3.g(false);
                        }
                    }
                }
                if (z6) {
                    i9--;
                }
                c0159o2.g(z6);
            } else {
                c0159o2.g(false);
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
        MenuC0157m menuC0157m;
        if (!this.f3017l || i() || (menuC0157m = this.f3011c) == null || this.h == null || this.f3026u != null) {
            return false;
        }
        menuC0157m.i();
        if (menuC0157m.f2692j.isEmpty()) {
            return false;
        }
        RunnableC0238i runnableC0238i = new RunnableC0238i(this, new C0234g(this, this.f3010b, this.f3011c, this.i));
        this.f3026u = runnableC0238i;
        ((View) this.h).post(runnableC0238i);
        return true;
    }
}
