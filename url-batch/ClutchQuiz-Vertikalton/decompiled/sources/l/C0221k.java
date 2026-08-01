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
import com.clutchquizarena.app.R;
import java.util.ArrayList;
import k.AbstractC0175u;
import k.ActionProviderVisibilityListenerC0170p;
import k.C0169o;
import k.InterfaceC0150A;
import k.InterfaceC0178x;
import k.InterfaceC0179y;
import k.InterfaceC0180z;
import k.MenuC0167m;
import k.SubMenuC0154E;

/* renamed from: l.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0221k implements InterfaceC0179y {

    /* renamed from: a, reason: collision with root package name */
    public final Context f2987a;

    /* renamed from: b, reason: collision with root package name */
    public Context f2988b;

    /* renamed from: c, reason: collision with root package name */
    public MenuC0167m f2989c;
    public final LayoutInflater d;

    /* renamed from: e, reason: collision with root package name */
    public InterfaceC0178x f2990e;
    public InterfaceC0150A h;
    public C0219j i;

    /* renamed from: j, reason: collision with root package name */
    public Drawable f2993j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f2994k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f2995l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f2996m;

    /* renamed from: n, reason: collision with root package name */
    public int f2997n;

    /* renamed from: o, reason: collision with root package name */
    public int f2998o;

    /* renamed from: p, reason: collision with root package name */
    public int f2999p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f3000q;

    /* renamed from: s, reason: collision with root package name */
    public C0213g f3002s;

    /* renamed from: t, reason: collision with root package name */
    public C0213g f3003t;

    /* renamed from: u, reason: collision with root package name */
    public RunnableC0217i f3004u;

    /* renamed from: v, reason: collision with root package name */
    public C0215h f3005v;

    /* renamed from: f, reason: collision with root package name */
    public final int f2991f = R.layout.abc_action_menu_layout;

    /* renamed from: g, reason: collision with root package name */
    public final int f2992g = R.layout.abc_action_menu_item_layout;

    /* renamed from: r, reason: collision with root package name */
    public final SparseBooleanArray f3001r = new SparseBooleanArray();

    /* renamed from: w, reason: collision with root package name */
    public final A0.h f3006w = new A0.h(26, this);

    public C0221k(Context context) {
        this.f2987a = context;
        this.d = LayoutInflater.from(context);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r5v4, types: [k.z] */
    /* JADX WARN: Type inference failed for: r5v7 */
    /* JADX WARN: Type inference failed for: r5v8 */
    public final View a(C0169o c0169o, View view, ViewGroup viewGroup) {
        View actionView = c0169o.getActionView();
        if (actionView == null || c0169o.e()) {
            ActionMenuItemView actionMenuItemView = view instanceof InterfaceC0180z ? (InterfaceC0180z) view : (InterfaceC0180z) this.d.inflate(this.f2992g, viewGroup, false);
            actionMenuItemView.a(c0169o);
            ActionMenuItemView actionMenuItemView2 = actionMenuItemView;
            actionMenuItemView2.setItemInvoker((ActionMenuView) this.h);
            if (this.f3005v == null) {
                this.f3005v = new C0215h(this);
            }
            actionMenuItemView2.setPopupCallback(this.f3005v);
            actionView = actionMenuItemView;
        }
        actionView.setVisibility(c0169o.f2772C ? 8 : 0);
        ViewGroup.LayoutParams layoutParams = actionView.getLayoutParams();
        ((ActionMenuView) viewGroup).getClass();
        if (!(layoutParams instanceof C0225m)) {
            actionView.setLayoutParams(ActionMenuView.k(layoutParams));
        }
        return actionView;
    }

    @Override // k.InterfaceC0179y
    public final void b(MenuC0167m menuC0167m, boolean z2) {
        e();
        C0213g c0213g = this.f3003t;
        if (c0213g != null && c0213g.b()) {
            c0213g.i.dismiss();
        }
        InterfaceC0178x interfaceC0178x = this.f2990e;
        if (interfaceC0178x != null) {
            interfaceC0178x.b(menuC0167m, z2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // k.InterfaceC0179y
    public final void c() {
        int i;
        ViewGroup viewGroup = (ViewGroup) this.h;
        ArrayList arrayList = null;
        boolean z2 = false;
        if (viewGroup != null) {
            MenuC0167m menuC0167m = this.f2989c;
            if (menuC0167m != null) {
                menuC0167m.i();
                ArrayList l2 = this.f2989c.l();
                int size = l2.size();
                i = 0;
                for (int i2 = 0; i2 < size; i2++) {
                    C0169o c0169o = (C0169o) l2.get(i2);
                    if (c0169o.f()) {
                        View childAt = viewGroup.getChildAt(i);
                        C0169o itemData = childAt instanceof InterfaceC0180z ? ((InterfaceC0180z) childAt).getItemData() : null;
                        View a2 = a(c0169o, childAt, viewGroup);
                        if (c0169o != itemData) {
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
        MenuC0167m menuC0167m2 = this.f2989c;
        if (menuC0167m2 != null) {
            menuC0167m2.i();
            ArrayList arrayList2 = menuC0167m2.i;
            int size2 = arrayList2.size();
            for (int i3 = 0; i3 < size2; i3++) {
                ActionProviderVisibilityListenerC0170p actionProviderVisibilityListenerC0170p = ((C0169o) arrayList2.get(i3)).f2770A;
            }
        }
        MenuC0167m menuC0167m3 = this.f2989c;
        if (menuC0167m3 != null) {
            menuC0167m3.i();
            arrayList = menuC0167m3.f2752j;
        }
        if (this.f2995l && arrayList != null) {
            int size3 = arrayList.size();
            if (size3 == 1) {
                z2 = !((C0169o) arrayList.get(0)).f2772C;
            } else if (size3 > 0) {
                z2 = true;
            }
        }
        if (z2) {
            if (this.i == null) {
                this.i = new C0219j(this, this.f2987a);
            }
            ViewGroup viewGroup3 = (ViewGroup) this.i.getParent();
            if (viewGroup3 != this.h) {
                if (viewGroup3 != null) {
                    viewGroup3.removeView(this.i);
                }
                ActionMenuView actionMenuView = (ActionMenuView) this.h;
                C0219j c0219j = this.i;
                actionMenuView.getClass();
                C0225m j2 = ActionMenuView.j();
                j2.f3009a = true;
                actionMenuView.addView(c0219j, j2);
            }
        } else {
            C0219j c0219j2 = this.i;
            if (c0219j2 != null) {
                Object parent = c0219j2.getParent();
                Object obj = this.h;
                if (parent == obj) {
                    ((ViewGroup) obj).removeView(this.i);
                }
            }
        }
        ((ActionMenuView) this.h).setOverflowReserved(this.f2995l);
    }

    @Override // k.InterfaceC0179y
    public final boolean d(C0169o c0169o) {
        return false;
    }

    public final boolean e() {
        Object obj;
        RunnableC0217i runnableC0217i = this.f3004u;
        if (runnableC0217i != null && (obj = this.h) != null) {
            ((View) obj).removeCallbacks(runnableC0217i);
            this.f3004u = null;
            return true;
        }
        C0213g c0213g = this.f3002s;
        if (c0213g == null) {
            return false;
        }
        if (c0213g.b()) {
            c0213g.i.dismiss();
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // k.InterfaceC0179y
    public final boolean f(SubMenuC0154E subMenuC0154E) {
        boolean z2;
        if (!subMenuC0154E.hasVisibleItems()) {
            return false;
        }
        SubMenuC0154E subMenuC0154E2 = subMenuC0154E;
        while (true) {
            MenuC0167m menuC0167m = subMenuC0154E2.f2687z;
            if (menuC0167m == this.f2989c) {
                break;
            }
            subMenuC0154E2 = (SubMenuC0154E) menuC0167m;
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
                if ((childAt instanceof InterfaceC0180z) && ((InterfaceC0180z) childAt).getItemData() == subMenuC0154E2.f2686A) {
                    view = childAt;
                    break;
                }
                i++;
            }
        }
        if (view == null) {
            return false;
        }
        subMenuC0154E.f2686A.getClass();
        int size = subMenuC0154E.f2750f.size();
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                z2 = false;
                break;
            }
            MenuItem item = subMenuC0154E.getItem(i2);
            if (item.isVisible() && item.getIcon() != null) {
                z2 = true;
                break;
            }
            i2++;
        }
        C0213g c0213g = new C0213g(this, this.f2988b, subMenuC0154E, view);
        this.f3003t = c0213g;
        c0213g.f2812g = z2;
        AbstractC0175u abstractC0175u = c0213g.i;
        if (abstractC0175u != null) {
            abstractC0175u.o(z2);
        }
        C0213g c0213g2 = this.f3003t;
        if (!c0213g2.b()) {
            if (c0213g2.f2810e == null) {
                throw new IllegalStateException("MenuPopupHelper cannot be used without an anchor");
            }
            c0213g2.d(0, 0, false, false);
        }
        InterfaceC0178x interfaceC0178x = this.f2990e;
        if (interfaceC0178x != null) {
            interfaceC0178x.g(subMenuC0154E);
        }
        return true;
    }

    @Override // k.InterfaceC0179y
    public final void g(InterfaceC0178x interfaceC0178x) {
        throw null;
    }

    @Override // k.InterfaceC0179y
    public final boolean h(C0169o c0169o) {
        return false;
    }

    public final boolean i() {
        C0213g c0213g = this.f3002s;
        return c0213g != null && c0213g.b();
    }

    @Override // k.InterfaceC0179y
    public final void j(Context context, MenuC0167m menuC0167m) {
        this.f2988b = context;
        LayoutInflater.from(context);
        this.f2989c = menuC0167m;
        Resources resources = context.getResources();
        if (!this.f2996m) {
            this.f2995l = true;
        }
        int i = 2;
        this.f2997n = context.getResources().getDisplayMetrics().widthPixels / 2;
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
        this.f2999p = i;
        int i4 = this.f2997n;
        if (this.f2995l) {
            if (this.i == null) {
                C0219j c0219j = new C0219j(this, this.f2987a);
                this.i = c0219j;
                if (this.f2994k) {
                    c0219j.setImageDrawable(this.f2993j);
                    this.f2993j = null;
                    this.f2994k = false;
                }
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
                this.i.measure(makeMeasureSpec, makeMeasureSpec);
            }
            i4 -= this.i.getMeasuredWidth();
        } else {
            this.i = null;
        }
        this.f2998o = i4;
        float f2 = resources.getDisplayMetrics().density;
    }

    @Override // k.InterfaceC0179y
    public final boolean k() {
        int i;
        ArrayList arrayList;
        int i2;
        boolean z2;
        MenuC0167m menuC0167m = this.f2989c;
        if (menuC0167m != null) {
            arrayList = menuC0167m.l();
            i = arrayList.size();
        } else {
            i = 0;
            arrayList = null;
        }
        int i3 = this.f2999p;
        int i4 = this.f2998o;
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
            C0169o c0169o = (C0169o) arrayList.get(i5);
            int i8 = c0169o.f2794y;
            if ((i8 & 2) == 2) {
                i6++;
            } else if ((i8 & 1) == 1) {
                i7++;
            } else {
                z3 = true;
            }
            if (this.f3000q && c0169o.f2772C) {
                i3 = 0;
            }
            i5++;
        }
        if (this.f2995l && (z3 || i7 + i6 > i3)) {
            i3--;
        }
        int i9 = i3 - i6;
        SparseBooleanArray sparseBooleanArray = this.f3001r;
        sparseBooleanArray.clear();
        int i10 = 0;
        int i11 = 0;
        while (i10 < i) {
            C0169o c0169o2 = (C0169o) arrayList.get(i10);
            int i12 = c0169o2.f2794y;
            boolean z4 = (i12 & 2) == i2 ? z2 : false;
            int i13 = c0169o2.f2774b;
            if (z4) {
                View a2 = a(c0169o2, null, viewGroup);
                a2.measure(makeMeasureSpec, makeMeasureSpec);
                int measuredWidth = a2.getMeasuredWidth();
                i4 -= measuredWidth;
                if (i11 == 0) {
                    i11 = measuredWidth;
                }
                if (i13 != 0) {
                    sparseBooleanArray.put(i13, z2);
                }
                c0169o2.g(z2);
            } else if ((i12 & 1) == z2) {
                boolean z5 = sparseBooleanArray.get(i13);
                boolean z6 = ((i9 > 0 || z5) && i4 > 0) ? z2 : false;
                if (z6) {
                    View a3 = a(c0169o2, null, viewGroup);
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
                        C0169o c0169o3 = (C0169o) arrayList.get(i14);
                        if (c0169o3.f2774b == i13) {
                            if (c0169o3.f()) {
                                i9++;
                            }
                            c0169o3.g(false);
                        }
                    }
                }
                if (z6) {
                    i9--;
                }
                c0169o2.g(z6);
            } else {
                c0169o2.g(false);
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
        MenuC0167m menuC0167m;
        if (!this.f2995l || i() || (menuC0167m = this.f2989c) == null || this.h == null || this.f3004u != null) {
            return false;
        }
        menuC0167m.i();
        if (menuC0167m.f2752j.isEmpty()) {
            return false;
        }
        RunnableC0217i runnableC0217i = new RunnableC0217i(this, new C0213g(this, this.f2988b, this.f2989c, this.i));
        this.f3004u = runnableC0217i;
        ((View) this.h).post(runnableC0217i);
        return true;
    }
}
