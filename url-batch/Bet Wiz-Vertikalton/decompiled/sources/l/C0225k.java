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
import com.neonpulse.gridlogic.R;
import java.util.ArrayList;
import k.AbstractC0168u;
import k.ActionProviderVisibilityListenerC0163p;
import k.C0162o;
import k.InterfaceC0143A;
import k.InterfaceC0171x;
import k.InterfaceC0172y;
import k.InterfaceC0173z;
import k.MenuC0160m;
import k.SubMenuC0147E;

/* renamed from: l.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0225k implements InterfaceC0172y {

    /* renamed from: a, reason: collision with root package name */
    public final Context f2993a;

    /* renamed from: b, reason: collision with root package name */
    public Context f2994b;

    /* renamed from: c, reason: collision with root package name */
    public MenuC0160m f2995c;
    public final LayoutInflater d;

    /* renamed from: e, reason: collision with root package name */
    public InterfaceC0171x f2996e;
    public InterfaceC0143A h;
    public C0223j i;

    /* renamed from: j, reason: collision with root package name */
    public Drawable f2999j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f3000k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f3001l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f3002m;

    /* renamed from: n, reason: collision with root package name */
    public int f3003n;

    /* renamed from: o, reason: collision with root package name */
    public int f3004o;

    /* renamed from: p, reason: collision with root package name */
    public int f3005p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f3006q;

    /* renamed from: s, reason: collision with root package name */
    public C0217g f3008s;

    /* renamed from: t, reason: collision with root package name */
    public C0217g f3009t;

    /* renamed from: u, reason: collision with root package name */
    public RunnableC0221i f3010u;

    /* renamed from: v, reason: collision with root package name */
    public C0219h f3011v;

    /* renamed from: f, reason: collision with root package name */
    public final int f2997f = R.layout.abc_action_menu_layout;

    /* renamed from: g, reason: collision with root package name */
    public final int f2998g = R.layout.abc_action_menu_item_layout;

    /* renamed from: r, reason: collision with root package name */
    public final SparseBooleanArray f3007r = new SparseBooleanArray();

    /* renamed from: w, reason: collision with root package name */
    public final C.g f3012w = new C.g(27, this);

    public C0225k(Context context) {
        this.f2993a = context;
        this.d = LayoutInflater.from(context);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r5v4, types: [k.z] */
    /* JADX WARN: Type inference failed for: r5v7 */
    /* JADX WARN: Type inference failed for: r5v8 */
    public final View a(C0162o c0162o, View view, ViewGroup viewGroup) {
        View actionView = c0162o.getActionView();
        if (actionView == null || c0162o.e()) {
            ActionMenuItemView actionMenuItemView = view instanceof InterfaceC0173z ? (InterfaceC0173z) view : (InterfaceC0173z) this.d.inflate(this.f2998g, viewGroup, false);
            actionMenuItemView.a(c0162o);
            ActionMenuItemView actionMenuItemView2 = actionMenuItemView;
            actionMenuItemView2.setItemInvoker((ActionMenuView) this.h);
            if (this.f3011v == null) {
                this.f3011v = new C0219h(this);
            }
            actionMenuItemView2.setPopupCallback(this.f3011v);
            actionView = actionMenuItemView;
        }
        actionView.setVisibility(c0162o.f2687C ? 8 : 0);
        ViewGroup.LayoutParams layoutParams = actionView.getLayoutParams();
        ((ActionMenuView) viewGroup).getClass();
        if (!(layoutParams instanceof C0229m)) {
            actionView.setLayoutParams(ActionMenuView.k(layoutParams));
        }
        return actionView;
    }

    @Override // k.InterfaceC0172y
    public final void b(MenuC0160m menuC0160m, boolean z2) {
        e();
        C0217g c0217g = this.f3009t;
        if (c0217g != null && c0217g.b()) {
            c0217g.i.dismiss();
        }
        InterfaceC0171x interfaceC0171x = this.f2996e;
        if (interfaceC0171x != null) {
            interfaceC0171x.b(menuC0160m, z2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // k.InterfaceC0172y
    public final void c() {
        int i;
        ViewGroup viewGroup = (ViewGroup) this.h;
        ArrayList arrayList = null;
        boolean z2 = false;
        if (viewGroup != null) {
            MenuC0160m menuC0160m = this.f2995c;
            if (menuC0160m != null) {
                menuC0160m.i();
                ArrayList l2 = this.f2995c.l();
                int size = l2.size();
                i = 0;
                for (int i2 = 0; i2 < size; i2++) {
                    C0162o c0162o = (C0162o) l2.get(i2);
                    if (c0162o.f()) {
                        View childAt = viewGroup.getChildAt(i);
                        C0162o itemData = childAt instanceof InterfaceC0173z ? ((InterfaceC0173z) childAt).getItemData() : null;
                        View a2 = a(c0162o, childAt, viewGroup);
                        if (c0162o != itemData) {
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
        MenuC0160m menuC0160m2 = this.f2995c;
        if (menuC0160m2 != null) {
            menuC0160m2.i();
            ArrayList arrayList2 = menuC0160m2.i;
            int size2 = arrayList2.size();
            for (int i3 = 0; i3 < size2; i3++) {
                ActionProviderVisibilityListenerC0163p actionProviderVisibilityListenerC0163p = ((C0162o) arrayList2.get(i3)).f2685A;
            }
        }
        MenuC0160m menuC0160m3 = this.f2995c;
        if (menuC0160m3 != null) {
            menuC0160m3.i();
            arrayList = menuC0160m3.f2667j;
        }
        if (this.f3001l && arrayList != null) {
            int size3 = arrayList.size();
            if (size3 == 1) {
                z2 = !((C0162o) arrayList.get(0)).f2687C;
            } else if (size3 > 0) {
                z2 = true;
            }
        }
        if (z2) {
            if (this.i == null) {
                this.i = new C0223j(this, this.f2993a);
            }
            ViewGroup viewGroup3 = (ViewGroup) this.i.getParent();
            if (viewGroup3 != this.h) {
                if (viewGroup3 != null) {
                    viewGroup3.removeView(this.i);
                }
                ActionMenuView actionMenuView = (ActionMenuView) this.h;
                C0223j c0223j = this.i;
                actionMenuView.getClass();
                C0229m j2 = ActionMenuView.j();
                j2.f3013a = true;
                actionMenuView.addView(c0223j, j2);
            }
        } else {
            C0223j c0223j2 = this.i;
            if (c0223j2 != null) {
                Object parent = c0223j2.getParent();
                Object obj = this.h;
                if (parent == obj) {
                    ((ViewGroup) obj).removeView(this.i);
                }
            }
        }
        ((ActionMenuView) this.h).setOverflowReserved(this.f3001l);
    }

    @Override // k.InterfaceC0172y
    public final boolean d(C0162o c0162o) {
        return false;
    }

    public final boolean e() {
        Object obj;
        RunnableC0221i runnableC0221i = this.f3010u;
        if (runnableC0221i != null && (obj = this.h) != null) {
            ((View) obj).removeCallbacks(runnableC0221i);
            this.f3010u = null;
            return true;
        }
        C0217g c0217g = this.f3008s;
        if (c0217g == null) {
            return false;
        }
        if (c0217g.b()) {
            c0217g.i.dismiss();
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // k.InterfaceC0172y
    public final boolean f(SubMenuC0147E subMenuC0147E) {
        boolean z2;
        if (!subMenuC0147E.hasVisibleItems()) {
            return false;
        }
        SubMenuC0147E subMenuC0147E2 = subMenuC0147E;
        while (true) {
            MenuC0160m menuC0160m = subMenuC0147E2.f2602z;
            if (menuC0160m == this.f2995c) {
                break;
            }
            subMenuC0147E2 = (SubMenuC0147E) menuC0160m;
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
                if ((childAt instanceof InterfaceC0173z) && ((InterfaceC0173z) childAt).getItemData() == subMenuC0147E2.f2601A) {
                    view = childAt;
                    break;
                }
                i++;
            }
        }
        if (view == null) {
            return false;
        }
        subMenuC0147E.f2601A.getClass();
        int size = subMenuC0147E.f2665f.size();
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                z2 = false;
                break;
            }
            MenuItem item = subMenuC0147E.getItem(i2);
            if (item.isVisible() && item.getIcon() != null) {
                z2 = true;
                break;
            }
            i2++;
        }
        C0217g c0217g = new C0217g(this, this.f2994b, subMenuC0147E, view);
        this.f3009t = c0217g;
        c0217g.f2727g = z2;
        AbstractC0168u abstractC0168u = c0217g.i;
        if (abstractC0168u != null) {
            abstractC0168u.o(z2);
        }
        C0217g c0217g2 = this.f3009t;
        if (!c0217g2.b()) {
            if (c0217g2.f2725e == null) {
                throw new IllegalStateException("MenuPopupHelper cannot be used without an anchor");
            }
            c0217g2.d(0, 0, false, false);
        }
        InterfaceC0171x interfaceC0171x = this.f2996e;
        if (interfaceC0171x != null) {
            interfaceC0171x.h(subMenuC0147E);
        }
        return true;
    }

    @Override // k.InterfaceC0172y
    public final void g(InterfaceC0171x interfaceC0171x) {
        throw null;
    }

    @Override // k.InterfaceC0172y
    public final boolean h(C0162o c0162o) {
        return false;
    }

    public final boolean i() {
        C0217g c0217g = this.f3008s;
        return c0217g != null && c0217g.b();
    }

    @Override // k.InterfaceC0172y
    public final void j(Context context, MenuC0160m menuC0160m) {
        this.f2994b = context;
        LayoutInflater.from(context);
        this.f2995c = menuC0160m;
        Resources resources = context.getResources();
        if (!this.f3002m) {
            this.f3001l = true;
        }
        int i = 2;
        this.f3003n = context.getResources().getDisplayMetrics().widthPixels / 2;
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
        this.f3005p = i;
        int i4 = this.f3003n;
        if (this.f3001l) {
            if (this.i == null) {
                C0223j c0223j = new C0223j(this, this.f2993a);
                this.i = c0223j;
                if (this.f3000k) {
                    c0223j.setImageDrawable(this.f2999j);
                    this.f2999j = null;
                    this.f3000k = false;
                }
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
                this.i.measure(makeMeasureSpec, makeMeasureSpec);
            }
            i4 -= this.i.getMeasuredWidth();
        } else {
            this.i = null;
        }
        this.f3004o = i4;
        float f2 = resources.getDisplayMetrics().density;
    }

    @Override // k.InterfaceC0172y
    public final boolean k() {
        int i;
        ArrayList arrayList;
        int i2;
        boolean z2;
        MenuC0160m menuC0160m = this.f2995c;
        if (menuC0160m != null) {
            arrayList = menuC0160m.l();
            i = arrayList.size();
        } else {
            i = 0;
            arrayList = null;
        }
        int i3 = this.f3005p;
        int i4 = this.f3004o;
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
            C0162o c0162o = (C0162o) arrayList.get(i5);
            int i8 = c0162o.f2709y;
            if ((i8 & 2) == 2) {
                i6++;
            } else if ((i8 & 1) == 1) {
                i7++;
            } else {
                z3 = true;
            }
            if (this.f3006q && c0162o.f2687C) {
                i3 = 0;
            }
            i5++;
        }
        if (this.f3001l && (z3 || i7 + i6 > i3)) {
            i3--;
        }
        int i9 = i3 - i6;
        SparseBooleanArray sparseBooleanArray = this.f3007r;
        sparseBooleanArray.clear();
        int i10 = 0;
        int i11 = 0;
        while (i10 < i) {
            C0162o c0162o2 = (C0162o) arrayList.get(i10);
            int i12 = c0162o2.f2709y;
            boolean z4 = (i12 & 2) == i2 ? z2 : false;
            int i13 = c0162o2.f2689b;
            if (z4) {
                View a2 = a(c0162o2, null, viewGroup);
                a2.measure(makeMeasureSpec, makeMeasureSpec);
                int measuredWidth = a2.getMeasuredWidth();
                i4 -= measuredWidth;
                if (i11 == 0) {
                    i11 = measuredWidth;
                }
                if (i13 != 0) {
                    sparseBooleanArray.put(i13, z2);
                }
                c0162o2.g(z2);
            } else if ((i12 & 1) == z2) {
                boolean z5 = sparseBooleanArray.get(i13);
                boolean z6 = ((i9 > 0 || z5) && i4 > 0) ? z2 : false;
                if (z6) {
                    View a3 = a(c0162o2, null, viewGroup);
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
                        C0162o c0162o3 = (C0162o) arrayList.get(i14);
                        if (c0162o3.f2689b == i13) {
                            if (c0162o3.f()) {
                                i9++;
                            }
                            c0162o3.g(false);
                        }
                    }
                }
                if (z6) {
                    i9--;
                }
                c0162o2.g(z6);
            } else {
                c0162o2.g(false);
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
        MenuC0160m menuC0160m;
        if (!this.f3001l || i() || (menuC0160m = this.f2995c) == null || this.h == null || this.f3010u != null) {
            return false;
        }
        menuC0160m.i();
        if (menuC0160m.f2667j.isEmpty()) {
            return false;
        }
        RunnableC0221i runnableC0221i = new RunnableC0221i(this, new C0217g(this, this.f2994b, this.f2995c, this.i));
        this.f3010u = runnableC0221i;
        ((View) this.h).post(runnableC0221i);
        return true;
    }
}
