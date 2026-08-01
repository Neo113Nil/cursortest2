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
import com.playgen.securelock.R;
import java.util.ArrayList;
import k.AbstractC0169u;
import k.ActionProviderVisibilityListenerC0164p;
import k.C0163o;
import k.InterfaceC0144A;
import k.InterfaceC0172x;
import k.InterfaceC0173y;
import k.InterfaceC0174z;
import k.MenuC0161m;
import k.SubMenuC0148E;

/* renamed from: l.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0226k implements InterfaceC0173y {

    /* renamed from: a, reason: collision with root package name */
    public final Context f2940a;

    /* renamed from: b, reason: collision with root package name */
    public Context f2941b;

    /* renamed from: c, reason: collision with root package name */
    public MenuC0161m f2942c;
    public final LayoutInflater d;

    /* renamed from: e, reason: collision with root package name */
    public InterfaceC0172x f2943e;
    public InterfaceC0144A h;
    public C0224j i;

    /* renamed from: j, reason: collision with root package name */
    public Drawable f2946j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f2947k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f2948l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f2949m;

    /* renamed from: n, reason: collision with root package name */
    public int f2950n;

    /* renamed from: o, reason: collision with root package name */
    public int f2951o;

    /* renamed from: p, reason: collision with root package name */
    public int f2952p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f2953q;

    /* renamed from: s, reason: collision with root package name */
    public C0218g f2955s;

    /* renamed from: t, reason: collision with root package name */
    public C0218g f2956t;

    /* renamed from: u, reason: collision with root package name */
    public RunnableC0222i f2957u;

    /* renamed from: v, reason: collision with root package name */
    public C0220h f2958v;

    /* renamed from: f, reason: collision with root package name */
    public final int f2944f = R.layout.abc_action_menu_layout;

    /* renamed from: g, reason: collision with root package name */
    public final int f2945g = R.layout.abc_action_menu_item_layout;

    /* renamed from: r, reason: collision with root package name */
    public final SparseBooleanArray f2954r = new SparseBooleanArray();

    /* renamed from: w, reason: collision with root package name */
    public final C.g f2959w = new C.g(28, this);

    public C0226k(Context context) {
        this.f2940a = context;
        this.d = LayoutInflater.from(context);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r5v4, types: [k.z] */
    /* JADX WARN: Type inference failed for: r5v7 */
    /* JADX WARN: Type inference failed for: r5v8 */
    public final View a(C0163o c0163o, View view, ViewGroup viewGroup) {
        View actionView = c0163o.getActionView();
        if (actionView == null || c0163o.e()) {
            ActionMenuItemView actionMenuItemView = view instanceof InterfaceC0174z ? (InterfaceC0174z) view : (InterfaceC0174z) this.d.inflate(this.f2945g, viewGroup, false);
            actionMenuItemView.a(c0163o);
            ActionMenuItemView actionMenuItemView2 = actionMenuItemView;
            actionMenuItemView2.setItemInvoker((ActionMenuView) this.h);
            if (this.f2958v == null) {
                this.f2958v = new C0220h(this);
            }
            actionMenuItemView2.setPopupCallback(this.f2958v);
            actionView = actionMenuItemView;
        }
        actionView.setVisibility(c0163o.f2638C ? 8 : 0);
        ViewGroup.LayoutParams layoutParams = actionView.getLayoutParams();
        ((ActionMenuView) viewGroup).getClass();
        if (!(layoutParams instanceof C0230m)) {
            actionView.setLayoutParams(ActionMenuView.k(layoutParams));
        }
        return actionView;
    }

    @Override // k.InterfaceC0173y
    public final void b(MenuC0161m menuC0161m, boolean z2) {
        f();
        C0218g c0218g = this.f2956t;
        if (c0218g != null && c0218g.b()) {
            c0218g.i.dismiss();
        }
        InterfaceC0172x interfaceC0172x = this.f2943e;
        if (interfaceC0172x != null) {
            interfaceC0172x.b(menuC0161m, z2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // k.InterfaceC0173y
    public final void c() {
        int i;
        ViewGroup viewGroup = (ViewGroup) this.h;
        ArrayList arrayList = null;
        boolean z2 = false;
        if (viewGroup != null) {
            MenuC0161m menuC0161m = this.f2942c;
            if (menuC0161m != null) {
                menuC0161m.i();
                ArrayList l2 = this.f2942c.l();
                int size = l2.size();
                i = 0;
                for (int i2 = 0; i2 < size; i2++) {
                    C0163o c0163o = (C0163o) l2.get(i2);
                    if (c0163o.f()) {
                        View childAt = viewGroup.getChildAt(i);
                        C0163o itemData = childAt instanceof InterfaceC0174z ? ((InterfaceC0174z) childAt).getItemData() : null;
                        View a2 = a(c0163o, childAt, viewGroup);
                        if (c0163o != itemData) {
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
        MenuC0161m menuC0161m2 = this.f2942c;
        if (menuC0161m2 != null) {
            menuC0161m2.i();
            ArrayList arrayList2 = menuC0161m2.i;
            int size2 = arrayList2.size();
            for (int i3 = 0; i3 < size2; i3++) {
                ActionProviderVisibilityListenerC0164p actionProviderVisibilityListenerC0164p = ((C0163o) arrayList2.get(i3)).f2636A;
            }
        }
        MenuC0161m menuC0161m3 = this.f2942c;
        if (menuC0161m3 != null) {
            menuC0161m3.i();
            arrayList = menuC0161m3.f2618j;
        }
        if (this.f2948l && arrayList != null) {
            int size3 = arrayList.size();
            if (size3 == 1) {
                z2 = !((C0163o) arrayList.get(0)).f2638C;
            } else if (size3 > 0) {
                z2 = true;
            }
        }
        if (z2) {
            if (this.i == null) {
                this.i = new C0224j(this, this.f2940a);
            }
            ViewGroup viewGroup3 = (ViewGroup) this.i.getParent();
            if (viewGroup3 != this.h) {
                if (viewGroup3 != null) {
                    viewGroup3.removeView(this.i);
                }
                ActionMenuView actionMenuView = (ActionMenuView) this.h;
                C0224j c0224j = this.i;
                actionMenuView.getClass();
                C0230m j2 = ActionMenuView.j();
                j2.f2960a = true;
                actionMenuView.addView(c0224j, j2);
            }
        } else {
            C0224j c0224j2 = this.i;
            if (c0224j2 != null) {
                Object parent = c0224j2.getParent();
                Object obj = this.h;
                if (parent == obj) {
                    ((ViewGroup) obj).removeView(this.i);
                }
            }
        }
        ((ActionMenuView) this.h).setOverflowReserved(this.f2948l);
    }

    @Override // k.InterfaceC0173y
    public final boolean d(C0163o c0163o) {
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // k.InterfaceC0173y
    public final boolean e(SubMenuC0148E subMenuC0148E) {
        boolean z2;
        if (!subMenuC0148E.hasVisibleItems()) {
            return false;
        }
        SubMenuC0148E subMenuC0148E2 = subMenuC0148E;
        while (true) {
            MenuC0161m menuC0161m = subMenuC0148E2.f2553z;
            if (menuC0161m == this.f2942c) {
                break;
            }
            subMenuC0148E2 = (SubMenuC0148E) menuC0161m;
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
                if ((childAt instanceof InterfaceC0174z) && ((InterfaceC0174z) childAt).getItemData() == subMenuC0148E2.f2552A) {
                    view = childAt;
                    break;
                }
                i++;
            }
        }
        if (view == null) {
            return false;
        }
        subMenuC0148E.f2552A.getClass();
        int size = subMenuC0148E.f2616f.size();
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                z2 = false;
                break;
            }
            MenuItem item = subMenuC0148E.getItem(i2);
            if (item.isVisible() && item.getIcon() != null) {
                z2 = true;
                break;
            }
            i2++;
        }
        C0218g c0218g = new C0218g(this, this.f2941b, subMenuC0148E, view);
        this.f2956t = c0218g;
        c0218g.f2678g = z2;
        AbstractC0169u abstractC0169u = c0218g.i;
        if (abstractC0169u != null) {
            abstractC0169u.o(z2);
        }
        C0218g c0218g2 = this.f2956t;
        if (!c0218g2.b()) {
            if (c0218g2.f2676e == null) {
                throw new IllegalStateException("MenuPopupHelper cannot be used without an anchor");
            }
            c0218g2.d(0, 0, false, false);
        }
        InterfaceC0172x interfaceC0172x = this.f2943e;
        if (interfaceC0172x != null) {
            interfaceC0172x.f(subMenuC0148E);
        }
        return true;
    }

    public final boolean f() {
        Object obj;
        RunnableC0222i runnableC0222i = this.f2957u;
        if (runnableC0222i != null && (obj = this.h) != null) {
            ((View) obj).removeCallbacks(runnableC0222i);
            this.f2957u = null;
            return true;
        }
        C0218g c0218g = this.f2955s;
        if (c0218g == null) {
            return false;
        }
        if (c0218g.b()) {
            c0218g.i.dismiss();
        }
        return true;
    }

    @Override // k.InterfaceC0173y
    public final void g(InterfaceC0172x interfaceC0172x) {
        throw null;
    }

    @Override // k.InterfaceC0173y
    public final boolean h(C0163o c0163o) {
        return false;
    }

    public final boolean i() {
        C0218g c0218g = this.f2955s;
        return c0218g != null && c0218g.b();
    }

    @Override // k.InterfaceC0173y
    public final void j(Context context, MenuC0161m menuC0161m) {
        this.f2941b = context;
        LayoutInflater.from(context);
        this.f2942c = menuC0161m;
        Resources resources = context.getResources();
        if (!this.f2949m) {
            this.f2948l = true;
        }
        int i = 2;
        this.f2950n = context.getResources().getDisplayMetrics().widthPixels / 2;
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
        this.f2952p = i;
        int i4 = this.f2950n;
        if (this.f2948l) {
            if (this.i == null) {
                C0224j c0224j = new C0224j(this, this.f2940a);
                this.i = c0224j;
                if (this.f2947k) {
                    c0224j.setImageDrawable(this.f2946j);
                    this.f2946j = null;
                    this.f2947k = false;
                }
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
                this.i.measure(makeMeasureSpec, makeMeasureSpec);
            }
            i4 -= this.i.getMeasuredWidth();
        } else {
            this.i = null;
        }
        this.f2951o = i4;
        float f2 = resources.getDisplayMetrics().density;
    }

    @Override // k.InterfaceC0173y
    public final boolean k() {
        int i;
        ArrayList arrayList;
        int i2;
        boolean z2;
        MenuC0161m menuC0161m = this.f2942c;
        if (menuC0161m != null) {
            arrayList = menuC0161m.l();
            i = arrayList.size();
        } else {
            i = 0;
            arrayList = null;
        }
        int i3 = this.f2952p;
        int i4 = this.f2951o;
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
            C0163o c0163o = (C0163o) arrayList.get(i5);
            int i8 = c0163o.f2660y;
            if ((i8 & 2) == 2) {
                i6++;
            } else if ((i8 & 1) == 1) {
                i7++;
            } else {
                z3 = true;
            }
            if (this.f2953q && c0163o.f2638C) {
                i3 = 0;
            }
            i5++;
        }
        if (this.f2948l && (z3 || i7 + i6 > i3)) {
            i3--;
        }
        int i9 = i3 - i6;
        SparseBooleanArray sparseBooleanArray = this.f2954r;
        sparseBooleanArray.clear();
        int i10 = 0;
        int i11 = 0;
        while (i10 < i) {
            C0163o c0163o2 = (C0163o) arrayList.get(i10);
            int i12 = c0163o2.f2660y;
            boolean z4 = (i12 & 2) == i2 ? z2 : false;
            int i13 = c0163o2.f2640b;
            if (z4) {
                View a2 = a(c0163o2, null, viewGroup);
                a2.measure(makeMeasureSpec, makeMeasureSpec);
                int measuredWidth = a2.getMeasuredWidth();
                i4 -= measuredWidth;
                if (i11 == 0) {
                    i11 = measuredWidth;
                }
                if (i13 != 0) {
                    sparseBooleanArray.put(i13, z2);
                }
                c0163o2.g(z2);
            } else if ((i12 & 1) == z2) {
                boolean z5 = sparseBooleanArray.get(i13);
                boolean z6 = ((i9 > 0 || z5) && i4 > 0) ? z2 : false;
                if (z6) {
                    View a3 = a(c0163o2, null, viewGroup);
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
                        C0163o c0163o3 = (C0163o) arrayList.get(i14);
                        if (c0163o3.f2640b == i13) {
                            if (c0163o3.f()) {
                                i9++;
                            }
                            c0163o3.g(false);
                        }
                    }
                }
                if (z6) {
                    i9--;
                }
                c0163o2.g(z6);
            } else {
                c0163o2.g(false);
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
        MenuC0161m menuC0161m;
        if (!this.f2948l || i() || (menuC0161m = this.f2942c) == null || this.h == null || this.f2957u != null) {
            return false;
        }
        menuC0161m.i();
        if (menuC0161m.f2618j.isEmpty()) {
            return false;
        }
        RunnableC0222i runnableC0222i = new RunnableC0222i(this, new C0218g(this, this.f2941b, this.f2942c, this.i));
        this.f2957u = runnableC0222i;
        ((View) this.h).post(runnableC0222i);
        return true;
    }
}
