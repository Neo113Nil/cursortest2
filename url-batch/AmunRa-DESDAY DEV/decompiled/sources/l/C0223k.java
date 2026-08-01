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
import com.visualfortune.eyerest.R;
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
public final class C0223k implements InterfaceC0170y {

    /* renamed from: a, reason: collision with root package name */
    public final Context f3086a;

    /* renamed from: b, reason: collision with root package name */
    public Context f3087b;

    /* renamed from: c, reason: collision with root package name */
    public MenuC0158m f3088c;
    public final LayoutInflater d;

    /* renamed from: e, reason: collision with root package name */
    public InterfaceC0169x f3089e;
    public InterfaceC0141A h;
    public C0221j i;

    /* renamed from: j, reason: collision with root package name */
    public Drawable f3092j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f3093k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f3094l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f3095m;

    /* renamed from: n, reason: collision with root package name */
    public int f3096n;

    /* renamed from: o, reason: collision with root package name */
    public int f3097o;

    /* renamed from: p, reason: collision with root package name */
    public int f3098p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f3099q;

    /* renamed from: s, reason: collision with root package name */
    public C0215g f3101s;

    /* renamed from: t, reason: collision with root package name */
    public C0215g f3102t;

    /* renamed from: u, reason: collision with root package name */
    public RunnableC0219i f3103u;

    /* renamed from: v, reason: collision with root package name */
    public C0217h f3104v;

    /* renamed from: f, reason: collision with root package name */
    public final int f3090f = R.layout.abc_action_menu_layout;

    /* renamed from: g, reason: collision with root package name */
    public final int f3091g = R.layout.abc_action_menu_item_layout;

    /* renamed from: r, reason: collision with root package name */
    public final SparseBooleanArray f3100r = new SparseBooleanArray();

    /* renamed from: w, reason: collision with root package name */
    public final C.g f3105w = new C.g(29, this);

    public C0223k(Context context) {
        this.f3086a = context;
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
            ActionMenuItemView actionMenuItemView = view instanceof InterfaceC0171z ? (InterfaceC0171z) view : (InterfaceC0171z) this.d.inflate(this.f3091g, viewGroup, false);
            actionMenuItemView.a(c0160o);
            ActionMenuItemView actionMenuItemView2 = actionMenuItemView;
            actionMenuItemView2.setItemInvoker((ActionMenuView) this.h);
            if (this.f3104v == null) {
                this.f3104v = new C0217h(this);
            }
            actionMenuItemView2.setPopupCallback(this.f3104v);
            actionView = actionMenuItemView;
        }
        actionView.setVisibility(c0160o.f2628C ? 8 : 0);
        ViewGroup.LayoutParams layoutParams = actionView.getLayoutParams();
        ((ActionMenuView) viewGroup).getClass();
        if (!(layoutParams instanceof C0227m)) {
            actionView.setLayoutParams(ActionMenuView.k(layoutParams));
        }
        return actionView;
    }

    @Override // k.InterfaceC0170y
    public final void b(MenuC0158m menuC0158m, boolean z2) {
        f();
        C0215g c0215g = this.f3102t;
        if (c0215g != null && c0215g.b()) {
            c0215g.i.dismiss();
        }
        InterfaceC0169x interfaceC0169x = this.f3089e;
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
            MenuC0158m menuC0158m = this.f3088c;
            if (menuC0158m != null) {
                menuC0158m.i();
                ArrayList l2 = this.f3088c.l();
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
        MenuC0158m menuC0158m2 = this.f3088c;
        if (menuC0158m2 != null) {
            menuC0158m2.i();
            ArrayList arrayList2 = menuC0158m2.i;
            int size2 = arrayList2.size();
            for (int i3 = 0; i3 < size2; i3++) {
                ActionProviderVisibilityListenerC0161p actionProviderVisibilityListenerC0161p = ((C0160o) arrayList2.get(i3)).f2626A;
            }
        }
        MenuC0158m menuC0158m3 = this.f3088c;
        if (menuC0158m3 != null) {
            menuC0158m3.i();
            arrayList = menuC0158m3.f2608j;
        }
        if (this.f3094l && arrayList != null) {
            int size3 = arrayList.size();
            if (size3 == 1) {
                z2 = !((C0160o) arrayList.get(0)).f2628C;
            } else if (size3 > 0) {
                z2 = true;
            }
        }
        if (z2) {
            if (this.i == null) {
                this.i = new C0221j(this, this.f3086a);
            }
            ViewGroup viewGroup3 = (ViewGroup) this.i.getParent();
            if (viewGroup3 != this.h) {
                if (viewGroup3 != null) {
                    viewGroup3.removeView(this.i);
                }
                ActionMenuView actionMenuView = (ActionMenuView) this.h;
                C0221j c0221j = this.i;
                actionMenuView.getClass();
                C0227m j2 = ActionMenuView.j();
                j2.f3106a = true;
                actionMenuView.addView(c0221j, j2);
            }
        } else {
            C0221j c0221j2 = this.i;
            if (c0221j2 != null) {
                Object parent = c0221j2.getParent();
                Object obj = this.h;
                if (parent == obj) {
                    ((ViewGroup) obj).removeView(this.i);
                }
            }
        }
        ((ActionMenuView) this.h).setOverflowReserved(this.f3094l);
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
            MenuC0158m menuC0158m = subMenuC0145E2.f2543z;
            if (menuC0158m == this.f3088c) {
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
                if ((childAt instanceof InterfaceC0171z) && ((InterfaceC0171z) childAt).getItemData() == subMenuC0145E2.f2542A) {
                    view = childAt;
                    break;
                }
                i++;
            }
        }
        if (view == null) {
            return false;
        }
        subMenuC0145E.f2542A.getClass();
        int size = subMenuC0145E.f2606f.size();
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
        C0215g c0215g = new C0215g(this, this.f3087b, subMenuC0145E, view);
        this.f3102t = c0215g;
        c0215g.f2668g = z2;
        AbstractC0166u abstractC0166u = c0215g.i;
        if (abstractC0166u != null) {
            abstractC0166u.o(z2);
        }
        C0215g c0215g2 = this.f3102t;
        if (!c0215g2.b()) {
            if (c0215g2.f2666e == null) {
                throw new IllegalStateException("MenuPopupHelper cannot be used without an anchor");
            }
            c0215g2.d(0, 0, false, false);
        }
        InterfaceC0169x interfaceC0169x = this.f3089e;
        if (interfaceC0169x != null) {
            interfaceC0169x.f(subMenuC0145E);
        }
        return true;
    }

    public final boolean f() {
        Object obj;
        RunnableC0219i runnableC0219i = this.f3103u;
        if (runnableC0219i != null && (obj = this.h) != null) {
            ((View) obj).removeCallbacks(runnableC0219i);
            this.f3103u = null;
            return true;
        }
        C0215g c0215g = this.f3101s;
        if (c0215g == null) {
            return false;
        }
        if (c0215g.b()) {
            c0215g.i.dismiss();
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
        C0215g c0215g = this.f3101s;
        return c0215g != null && c0215g.b();
    }

    @Override // k.InterfaceC0170y
    public final void j(Context context, MenuC0158m menuC0158m) {
        this.f3087b = context;
        LayoutInflater.from(context);
        this.f3088c = menuC0158m;
        Resources resources = context.getResources();
        if (!this.f3095m) {
            this.f3094l = true;
        }
        int i = 2;
        this.f3096n = context.getResources().getDisplayMetrics().widthPixels / 2;
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
        this.f3098p = i;
        int i4 = this.f3096n;
        if (this.f3094l) {
            if (this.i == null) {
                C0221j c0221j = new C0221j(this, this.f3086a);
                this.i = c0221j;
                if (this.f3093k) {
                    c0221j.setImageDrawable(this.f3092j);
                    this.f3092j = null;
                    this.f3093k = false;
                }
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
                this.i.measure(makeMeasureSpec, makeMeasureSpec);
            }
            i4 -= this.i.getMeasuredWidth();
        } else {
            this.i = null;
        }
        this.f3097o = i4;
        float f2 = resources.getDisplayMetrics().density;
    }

    @Override // k.InterfaceC0170y
    public final boolean k() {
        int i;
        ArrayList arrayList;
        int i2;
        boolean z2;
        MenuC0158m menuC0158m = this.f3088c;
        if (menuC0158m != null) {
            arrayList = menuC0158m.l();
            i = arrayList.size();
        } else {
            i = 0;
            arrayList = null;
        }
        int i3 = this.f3098p;
        int i4 = this.f3097o;
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
            int i8 = c0160o.f2650y;
            if ((i8 & 2) == 2) {
                i6++;
            } else if ((i8 & 1) == 1) {
                i7++;
            } else {
                z3 = true;
            }
            if (this.f3099q && c0160o.f2628C) {
                i3 = 0;
            }
            i5++;
        }
        if (this.f3094l && (z3 || i7 + i6 > i3)) {
            i3--;
        }
        int i9 = i3 - i6;
        SparseBooleanArray sparseBooleanArray = this.f3100r;
        sparseBooleanArray.clear();
        int i10 = 0;
        int i11 = 0;
        while (i10 < i) {
            C0160o c0160o2 = (C0160o) arrayList.get(i10);
            int i12 = c0160o2.f2650y;
            boolean z4 = (i12 & 2) == i2 ? z2 : false;
            int i13 = c0160o2.f2630b;
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
                        if (c0160o3.f2630b == i13) {
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
        if (!this.f3094l || i() || (menuC0158m = this.f3088c) == null || this.h == null || this.f3103u != null) {
            return false;
        }
        menuC0158m.i();
        if (menuC0158m.f2608j.isEmpty()) {
            return false;
        }
        RunnableC0219i runnableC0219i = new RunnableC0219i(this, new C0215g(this, this.f3087b, this.f3088c, this.i));
        this.f3103u = runnableC0219i;
        ((View) this.h).post(runnableC0219i);
        return true;
    }
}
