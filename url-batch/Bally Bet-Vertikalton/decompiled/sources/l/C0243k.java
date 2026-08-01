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
import com.skydrop.fallring.R;
import java.util.ArrayList;
import k.AbstractC0166u;
import k.ActionProviderVisibilityListenerC0161p;
import k.C0160o;
import k.InterfaceC0141A;
import k.InterfaceC0169x;
import k.InterfaceC0170y;
import k.InterfaceC0171z;
import k.MenuC0158m;
import k.SubMenuC0145E;

/* renamed from: l.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0243k implements InterfaceC0170y {

    /* renamed from: a, reason: collision with root package name */
    public final Context f2991a;

    /* renamed from: b, reason: collision with root package name */
    public Context f2992b;

    /* renamed from: c, reason: collision with root package name */
    public MenuC0158m f2993c;
    public final LayoutInflater d;

    /* renamed from: e, reason: collision with root package name */
    public InterfaceC0169x f2994e;
    public InterfaceC0141A h;
    public C0241j i;

    /* renamed from: j, reason: collision with root package name */
    public Drawable f2997j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f2998k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f2999l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f3000m;

    /* renamed from: n, reason: collision with root package name */
    public int f3001n;

    /* renamed from: o, reason: collision with root package name */
    public int f3002o;

    /* renamed from: p, reason: collision with root package name */
    public int f3003p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f3004q;

    /* renamed from: s, reason: collision with root package name */
    public C0235g f3006s;

    /* renamed from: t, reason: collision with root package name */
    public C0235g f3007t;

    /* renamed from: u, reason: collision with root package name */
    public RunnableC0239i f3008u;

    /* renamed from: v, reason: collision with root package name */
    public C0237h f3009v;

    /* renamed from: f, reason: collision with root package name */
    public final int f2995f = R.layout.abc_action_menu_layout;

    /* renamed from: g, reason: collision with root package name */
    public final int f2996g = R.layout.abc_action_menu_item_layout;

    /* renamed from: r, reason: collision with root package name */
    public final SparseBooleanArray f3005r = new SparseBooleanArray();

    /* renamed from: w, reason: collision with root package name */
    public final B0.d f3010w = new B0.d(29, this);

    public C0243k(Context context) {
        this.f2991a = context;
        this.d = LayoutInflater.from(context);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r5v4, types: [k.z] */
    /* JADX WARN: Type inference failed for: r5v7 */
    /* JADX WARN: Type inference failed for: r5v8 */
    public final View a(C0160o c0160o, View view, ViewGroup viewGroup) {
        View actionView = c0160o.getActionView();
        if (actionView == null || c0160o.e()) {
            ActionMenuItemView actionMenuItemView = view instanceof InterfaceC0171z ? (InterfaceC0171z) view : (InterfaceC0171z) this.d.inflate(this.f2996g, viewGroup, false);
            actionMenuItemView.a(c0160o);
            ActionMenuItemView actionMenuItemView2 = actionMenuItemView;
            actionMenuItemView2.setItemInvoker((ActionMenuView) this.h);
            if (this.f3009v == null) {
                this.f3009v = new C0237h(this);
            }
            actionMenuItemView2.setPopupCallback(this.f3009v);
            actionView = actionMenuItemView;
        }
        actionView.setVisibility(c0160o.f2695C ? 8 : 0);
        ViewGroup.LayoutParams layoutParams = actionView.getLayoutParams();
        ((ActionMenuView) viewGroup).getClass();
        if (!(layoutParams instanceof C0247m)) {
            actionView.setLayoutParams(ActionMenuView.k(layoutParams));
        }
        return actionView;
    }

    @Override // k.InterfaceC0170y
    public final void b(MenuC0158m menuC0158m, boolean z2) {
        f();
        C0235g c0235g = this.f3007t;
        if (c0235g != null && c0235g.b()) {
            c0235g.i.dismiss();
        }
        InterfaceC0169x interfaceC0169x = this.f2994e;
        if (interfaceC0169x != null) {
            interfaceC0169x.b(menuC0158m, z2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // k.InterfaceC0170y
    public final void c() {
        int i;
        ViewGroup viewGroup = (ViewGroup) this.h;
        ArrayList arrayList = null;
        boolean z2 = false;
        if (viewGroup != null) {
            MenuC0158m menuC0158m = this.f2993c;
            if (menuC0158m != null) {
                menuC0158m.i();
                ArrayList l2 = this.f2993c.l();
                int size = l2.size();
                i = 0;
                for (int i2 = 0; i2 < size; i2++) {
                    C0160o c0160o = (C0160o) l2.get(i2);
                    if (c0160o.f()) {
                        View childAt = viewGroup.getChildAt(i);
                        C0160o itemData = childAt instanceof InterfaceC0171z ? ((InterfaceC0171z) childAt).getItemData() : null;
                        View a2 = a(c0160o, childAt, viewGroup);
                        if (c0160o != itemData) {
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
        MenuC0158m menuC0158m2 = this.f2993c;
        if (menuC0158m2 != null) {
            menuC0158m2.i();
            ArrayList arrayList2 = menuC0158m2.i;
            int size2 = arrayList2.size();
            for (int i3 = 0; i3 < size2; i3++) {
                ActionProviderVisibilityListenerC0161p actionProviderVisibilityListenerC0161p = ((C0160o) arrayList2.get(i3)).f2693A;
            }
        }
        MenuC0158m menuC0158m3 = this.f2993c;
        if (menuC0158m3 != null) {
            menuC0158m3.i();
            arrayList = menuC0158m3.f2675j;
        }
        if (this.f2999l && arrayList != null) {
            int size3 = arrayList.size();
            if (size3 == 1) {
                z2 = !((C0160o) arrayList.get(0)).f2695C;
            } else if (size3 > 0) {
                z2 = true;
            }
        }
        if (z2) {
            if (this.i == null) {
                this.i = new C0241j(this, this.f2991a);
            }
            ViewGroup viewGroup3 = (ViewGroup) this.i.getParent();
            if (viewGroup3 != this.h) {
                if (viewGroup3 != null) {
                    viewGroup3.removeView(this.i);
                }
                ActionMenuView actionMenuView = (ActionMenuView) this.h;
                C0241j c0241j = this.i;
                actionMenuView.getClass();
                C0247m j2 = ActionMenuView.j();
                j2.f3011a = true;
                actionMenuView.addView(c0241j, j2);
            }
        } else {
            C0241j c0241j2 = this.i;
            if (c0241j2 != null) {
                Object parent = c0241j2.getParent();
                Object obj = this.h;
                if (parent == obj) {
                    ((ViewGroup) obj).removeView(this.i);
                }
            }
        }
        ((ActionMenuView) this.h).setOverflowReserved(this.f2999l);
    }

    @Override // k.InterfaceC0170y
    public final boolean d(C0160o c0160o) {
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // k.InterfaceC0170y
    public final boolean e(SubMenuC0145E subMenuC0145E) {
        boolean z2;
        if (!subMenuC0145E.hasVisibleItems()) {
            return false;
        }
        SubMenuC0145E subMenuC0145E2 = subMenuC0145E;
        while (true) {
            MenuC0158m menuC0158m = subMenuC0145E2.f2610z;
            if (menuC0158m == this.f2993c) {
                break;
            }
            subMenuC0145E2 = (SubMenuC0145E) menuC0158m;
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
                if ((childAt instanceof InterfaceC0171z) && ((InterfaceC0171z) childAt).getItemData() == subMenuC0145E2.f2609A) {
                    view = childAt;
                    break;
                }
                i++;
            }
        }
        if (view == null) {
            return false;
        }
        subMenuC0145E.f2609A.getClass();
        int size = subMenuC0145E.f2673f.size();
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                z2 = false;
                break;
            }
            MenuItem item = subMenuC0145E.getItem(i2);
            if (item.isVisible() && item.getIcon() != null) {
                z2 = true;
                break;
            }
            i2++;
        }
        C0235g c0235g = new C0235g(this, this.f2992b, subMenuC0145E, view);
        this.f3007t = c0235g;
        c0235g.f2735g = z2;
        AbstractC0166u abstractC0166u = c0235g.i;
        if (abstractC0166u != null) {
            abstractC0166u.o(z2);
        }
        C0235g c0235g2 = this.f3007t;
        if (!c0235g2.b()) {
            if (c0235g2.f2733e == null) {
                throw new IllegalStateException("MenuPopupHelper cannot be used without an anchor");
            }
            c0235g2.d(0, 0, false, false);
        }
        InterfaceC0169x interfaceC0169x = this.f2994e;
        if (interfaceC0169x != null) {
            interfaceC0169x.f(subMenuC0145E);
        }
        return true;
    }

    public final boolean f() {
        Object obj;
        RunnableC0239i runnableC0239i = this.f3008u;
        if (runnableC0239i != null && (obj = this.h) != null) {
            ((View) obj).removeCallbacks(runnableC0239i);
            this.f3008u = null;
            return true;
        }
        C0235g c0235g = this.f3006s;
        if (c0235g == null) {
            return false;
        }
        if (c0235g.b()) {
            c0235g.i.dismiss();
        }
        return true;
    }

    @Override // k.InterfaceC0170y
    public final void g(InterfaceC0169x interfaceC0169x) {
        throw null;
    }

    @Override // k.InterfaceC0170y
    public final boolean h(C0160o c0160o) {
        return false;
    }

    public final boolean i() {
        C0235g c0235g = this.f3006s;
        return c0235g != null && c0235g.b();
    }

    @Override // k.InterfaceC0170y
    public final void j(Context context, MenuC0158m menuC0158m) {
        this.f2992b = context;
        LayoutInflater.from(context);
        this.f2993c = menuC0158m;
        Resources resources = context.getResources();
        if (!this.f3000m) {
            this.f2999l = true;
        }
        int i = 2;
        this.f3001n = context.getResources().getDisplayMetrics().widthPixels / 2;
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
        this.f3003p = i;
        int i4 = this.f3001n;
        if (this.f2999l) {
            if (this.i == null) {
                C0241j c0241j = new C0241j(this, this.f2991a);
                this.i = c0241j;
                if (this.f2998k) {
                    c0241j.setImageDrawable(this.f2997j);
                    this.f2997j = null;
                    this.f2998k = false;
                }
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
                this.i.measure(makeMeasureSpec, makeMeasureSpec);
            }
            i4 -= this.i.getMeasuredWidth();
        } else {
            this.i = null;
        }
        this.f3002o = i4;
        float f2 = resources.getDisplayMetrics().density;
    }

    @Override // k.InterfaceC0170y
    public final boolean k() {
        int i;
        ArrayList arrayList;
        int i2;
        boolean z2;
        MenuC0158m menuC0158m = this.f2993c;
        if (menuC0158m != null) {
            arrayList = menuC0158m.l();
            i = arrayList.size();
        } else {
            i = 0;
            arrayList = null;
        }
        int i3 = this.f3003p;
        int i4 = this.f3002o;
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
            C0160o c0160o = (C0160o) arrayList.get(i5);
            int i8 = c0160o.f2717y;
            if ((i8 & 2) == 2) {
                i6++;
            } else if ((i8 & 1) == 1) {
                i7++;
            } else {
                z3 = true;
            }
            if (this.f3004q && c0160o.f2695C) {
                i3 = 0;
            }
            i5++;
        }
        if (this.f2999l && (z3 || i7 + i6 > i3)) {
            i3--;
        }
        int i9 = i3 - i6;
        SparseBooleanArray sparseBooleanArray = this.f3005r;
        sparseBooleanArray.clear();
        int i10 = 0;
        int i11 = 0;
        while (i10 < i) {
            C0160o c0160o2 = (C0160o) arrayList.get(i10);
            int i12 = c0160o2.f2717y;
            boolean z4 = (i12 & 2) == i2 ? z2 : false;
            int i13 = c0160o2.f2697b;
            if (z4) {
                View a2 = a(c0160o2, null, viewGroup);
                a2.measure(makeMeasureSpec, makeMeasureSpec);
                int measuredWidth = a2.getMeasuredWidth();
                i4 -= measuredWidth;
                if (i11 == 0) {
                    i11 = measuredWidth;
                }
                if (i13 != 0) {
                    sparseBooleanArray.put(i13, z2);
                }
                c0160o2.g(z2);
            } else if ((i12 & 1) == z2) {
                boolean z5 = sparseBooleanArray.get(i13);
                boolean z6 = ((i9 > 0 || z5) && i4 > 0) ? z2 : false;
                if (z6) {
                    View a3 = a(c0160o2, null, viewGroup);
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
                        C0160o c0160o3 = (C0160o) arrayList.get(i14);
                        if (c0160o3.f2697b == i13) {
                            if (c0160o3.f()) {
                                i9++;
                            }
                            c0160o3.g(false);
                        }
                    }
                }
                if (z6) {
                    i9--;
                }
                c0160o2.g(z6);
            } else {
                c0160o2.g(false);
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
        MenuC0158m menuC0158m;
        if (!this.f2999l || i() || (menuC0158m = this.f2993c) == null || this.h == null || this.f3008u != null) {
            return false;
        }
        menuC0158m.i();
        if (menuC0158m.f2675j.isEmpty()) {
            return false;
        }
        RunnableC0239i runnableC0239i = new RunnableC0239i(this, new C0235g(this, this.f2992b, this.f2993c, this.i));
        this.f3008u = runnableC0239i;
        ((View) this.h).post(runnableC0239i);
        return true;
    }
}
