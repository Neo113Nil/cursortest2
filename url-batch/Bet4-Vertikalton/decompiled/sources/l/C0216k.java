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
import com.playbag.tripgear.R;
import java.util.ArrayList;
import k.AbstractC0172u;
import k.ActionProviderVisibilityListenerC0167p;
import k.C0166o;
import k.InterfaceC0147A;
import k.InterfaceC0175x;
import k.InterfaceC0176y;
import k.InterfaceC0177z;
import k.MenuC0164m;
import k.SubMenuC0151E;

/* renamed from: l.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0216k implements InterfaceC0176y {

    /* renamed from: a, reason: collision with root package name */
    public final Context f2932a;

    /* renamed from: b, reason: collision with root package name */
    public Context f2933b;

    /* renamed from: c, reason: collision with root package name */
    public MenuC0164m f2934c;
    public final LayoutInflater d;

    /* renamed from: e, reason: collision with root package name */
    public InterfaceC0175x f2935e;
    public InterfaceC0147A h;
    public C0214j i;

    /* renamed from: j, reason: collision with root package name */
    public Drawable f2938j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f2939k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f2940l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f2941m;

    /* renamed from: n, reason: collision with root package name */
    public int f2942n;

    /* renamed from: o, reason: collision with root package name */
    public int f2943o;

    /* renamed from: p, reason: collision with root package name */
    public int f2944p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f2945q;

    /* renamed from: s, reason: collision with root package name */
    public C0208g f2947s;

    /* renamed from: t, reason: collision with root package name */
    public C0208g f2948t;

    /* renamed from: u, reason: collision with root package name */
    public RunnableC0212i f2949u;

    /* renamed from: v, reason: collision with root package name */
    public C0210h f2950v;

    /* renamed from: f, reason: collision with root package name */
    public final int f2936f = R.layout.abc_action_menu_layout;

    /* renamed from: g, reason: collision with root package name */
    public final int f2937g = R.layout.abc_action_menu_item_layout;

    /* renamed from: r, reason: collision with root package name */
    public final SparseBooleanArray f2946r = new SparseBooleanArray();

    /* renamed from: w, reason: collision with root package name */
    public final C.g f2951w = new C.g(28, this);

    public C0216k(Context context) {
        this.f2932a = context;
        this.d = LayoutInflater.from(context);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r5v4, types: [k.z] */
    /* JADX WARN: Type inference failed for: r5v7 */
    /* JADX WARN: Type inference failed for: r5v8 */
    public final View a(C0166o c0166o, View view, ViewGroup viewGroup) {
        View actionView = c0166o.getActionView();
        if (actionView == null || c0166o.e()) {
            ActionMenuItemView actionMenuItemView = view instanceof InterfaceC0177z ? (InterfaceC0177z) view : (InterfaceC0177z) this.d.inflate(this.f2937g, viewGroup, false);
            actionMenuItemView.a(c0166o);
            ActionMenuItemView actionMenuItemView2 = actionMenuItemView;
            actionMenuItemView2.setItemInvoker((ActionMenuView) this.h);
            if (this.f2950v == null) {
                this.f2950v = new C0210h(this);
            }
            actionMenuItemView2.setPopupCallback(this.f2950v);
            actionView = actionMenuItemView;
        }
        actionView.setVisibility(c0166o.f2711C ? 8 : 0);
        ViewGroup.LayoutParams layoutParams = actionView.getLayoutParams();
        ((ActionMenuView) viewGroup).getClass();
        if (!(layoutParams instanceof C0220m)) {
            actionView.setLayoutParams(ActionMenuView.k(layoutParams));
        }
        return actionView;
    }

    @Override // k.InterfaceC0176y
    public final void b(MenuC0164m menuC0164m, boolean z2) {
        f();
        C0208g c0208g = this.f2948t;
        if (c0208g != null && c0208g.b()) {
            c0208g.i.dismiss();
        }
        InterfaceC0175x interfaceC0175x = this.f2935e;
        if (interfaceC0175x != null) {
            interfaceC0175x.b(menuC0164m, z2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // k.InterfaceC0176y
    public final void c() {
        int i;
        ViewGroup viewGroup = (ViewGroup) this.h;
        ArrayList arrayList = null;
        boolean z2 = false;
        if (viewGroup != null) {
            MenuC0164m menuC0164m = this.f2934c;
            if (menuC0164m != null) {
                menuC0164m.i();
                ArrayList l2 = this.f2934c.l();
                int size = l2.size();
                i = 0;
                for (int i2 = 0; i2 < size; i2++) {
                    C0166o c0166o = (C0166o) l2.get(i2);
                    if (c0166o.f()) {
                        View childAt = viewGroup.getChildAt(i);
                        C0166o itemData = childAt instanceof InterfaceC0177z ? ((InterfaceC0177z) childAt).getItemData() : null;
                        View a2 = a(c0166o, childAt, viewGroup);
                        if (c0166o != itemData) {
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
        MenuC0164m menuC0164m2 = this.f2934c;
        if (menuC0164m2 != null) {
            menuC0164m2.i();
            ArrayList arrayList2 = menuC0164m2.i;
            int size2 = arrayList2.size();
            for (int i3 = 0; i3 < size2; i3++) {
                ActionProviderVisibilityListenerC0167p actionProviderVisibilityListenerC0167p = ((C0166o) arrayList2.get(i3)).f2709A;
            }
        }
        MenuC0164m menuC0164m3 = this.f2934c;
        if (menuC0164m3 != null) {
            menuC0164m3.i();
            arrayList = menuC0164m3.f2691j;
        }
        if (this.f2940l && arrayList != null) {
            int size3 = arrayList.size();
            if (size3 == 1) {
                z2 = !((C0166o) arrayList.get(0)).f2711C;
            } else if (size3 > 0) {
                z2 = true;
            }
        }
        if (z2) {
            if (this.i == null) {
                this.i = new C0214j(this, this.f2932a);
            }
            ViewGroup viewGroup3 = (ViewGroup) this.i.getParent();
            if (viewGroup3 != this.h) {
                if (viewGroup3 != null) {
                    viewGroup3.removeView(this.i);
                }
                ActionMenuView actionMenuView = (ActionMenuView) this.h;
                C0214j c0214j = this.i;
                actionMenuView.getClass();
                C0220m j2 = ActionMenuView.j();
                j2.f2952a = true;
                actionMenuView.addView(c0214j, j2);
            }
        } else {
            C0214j c0214j2 = this.i;
            if (c0214j2 != null) {
                Object parent = c0214j2.getParent();
                Object obj = this.h;
                if (parent == obj) {
                    ((ViewGroup) obj).removeView(this.i);
                }
            }
        }
        ((ActionMenuView) this.h).setOverflowReserved(this.f2940l);
    }

    @Override // k.InterfaceC0176y
    public final boolean d(C0166o c0166o) {
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // k.InterfaceC0176y
    public final boolean e(SubMenuC0151E subMenuC0151E) {
        boolean z2;
        if (!subMenuC0151E.hasVisibleItems()) {
            return false;
        }
        SubMenuC0151E subMenuC0151E2 = subMenuC0151E;
        while (true) {
            MenuC0164m menuC0164m = subMenuC0151E2.f2626z;
            if (menuC0164m == this.f2934c) {
                break;
            }
            subMenuC0151E2 = (SubMenuC0151E) menuC0164m;
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
                if ((childAt instanceof InterfaceC0177z) && ((InterfaceC0177z) childAt).getItemData() == subMenuC0151E2.f2625A) {
                    view = childAt;
                    break;
                }
                i++;
            }
        }
        if (view == null) {
            return false;
        }
        subMenuC0151E.f2625A.getClass();
        int size = subMenuC0151E.f2689f.size();
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                z2 = false;
                break;
            }
            MenuItem item = subMenuC0151E.getItem(i2);
            if (item.isVisible() && item.getIcon() != null) {
                z2 = true;
                break;
            }
            i2++;
        }
        C0208g c0208g = new C0208g(this, this.f2933b, subMenuC0151E, view);
        this.f2948t = c0208g;
        c0208g.f2751g = z2;
        AbstractC0172u abstractC0172u = c0208g.i;
        if (abstractC0172u != null) {
            abstractC0172u.o(z2);
        }
        C0208g c0208g2 = this.f2948t;
        if (!c0208g2.b()) {
            if (c0208g2.f2749e == null) {
                throw new IllegalStateException("MenuPopupHelper cannot be used without an anchor");
            }
            c0208g2.d(0, 0, false, false);
        }
        InterfaceC0175x interfaceC0175x = this.f2935e;
        if (interfaceC0175x != null) {
            interfaceC0175x.f(subMenuC0151E);
        }
        return true;
    }

    public final boolean f() {
        Object obj;
        RunnableC0212i runnableC0212i = this.f2949u;
        if (runnableC0212i != null && (obj = this.h) != null) {
            ((View) obj).removeCallbacks(runnableC0212i);
            this.f2949u = null;
            return true;
        }
        C0208g c0208g = this.f2947s;
        if (c0208g == null) {
            return false;
        }
        if (c0208g.b()) {
            c0208g.i.dismiss();
        }
        return true;
    }

    @Override // k.InterfaceC0176y
    public final void g(InterfaceC0175x interfaceC0175x) {
        throw null;
    }

    @Override // k.InterfaceC0176y
    public final boolean h(C0166o c0166o) {
        return false;
    }

    public final boolean i() {
        C0208g c0208g = this.f2947s;
        return c0208g != null && c0208g.b();
    }

    @Override // k.InterfaceC0176y
    public final void j(Context context, MenuC0164m menuC0164m) {
        this.f2933b = context;
        LayoutInflater.from(context);
        this.f2934c = menuC0164m;
        Resources resources = context.getResources();
        if (!this.f2941m) {
            this.f2940l = true;
        }
        int i = 2;
        this.f2942n = context.getResources().getDisplayMetrics().widthPixels / 2;
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
        this.f2944p = i;
        int i4 = this.f2942n;
        if (this.f2940l) {
            if (this.i == null) {
                C0214j c0214j = new C0214j(this, this.f2932a);
                this.i = c0214j;
                if (this.f2939k) {
                    c0214j.setImageDrawable(this.f2938j);
                    this.f2938j = null;
                    this.f2939k = false;
                }
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
                this.i.measure(makeMeasureSpec, makeMeasureSpec);
            }
            i4 -= this.i.getMeasuredWidth();
        } else {
            this.i = null;
        }
        this.f2943o = i4;
        float f2 = resources.getDisplayMetrics().density;
    }

    @Override // k.InterfaceC0176y
    public final boolean k() {
        int i;
        ArrayList arrayList;
        int i2;
        boolean z2;
        MenuC0164m menuC0164m = this.f2934c;
        if (menuC0164m != null) {
            arrayList = menuC0164m.l();
            i = arrayList.size();
        } else {
            i = 0;
            arrayList = null;
        }
        int i3 = this.f2944p;
        int i4 = this.f2943o;
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
            C0166o c0166o = (C0166o) arrayList.get(i5);
            int i8 = c0166o.f2733y;
            if ((i8 & 2) == 2) {
                i6++;
            } else if ((i8 & 1) == 1) {
                i7++;
            } else {
                z3 = true;
            }
            if (this.f2945q && c0166o.f2711C) {
                i3 = 0;
            }
            i5++;
        }
        if (this.f2940l && (z3 || i7 + i6 > i3)) {
            i3--;
        }
        int i9 = i3 - i6;
        SparseBooleanArray sparseBooleanArray = this.f2946r;
        sparseBooleanArray.clear();
        int i10 = 0;
        int i11 = 0;
        while (i10 < i) {
            C0166o c0166o2 = (C0166o) arrayList.get(i10);
            int i12 = c0166o2.f2733y;
            boolean z4 = (i12 & 2) == i2 ? z2 : false;
            int i13 = c0166o2.f2713b;
            if (z4) {
                View a2 = a(c0166o2, null, viewGroup);
                a2.measure(makeMeasureSpec, makeMeasureSpec);
                int measuredWidth = a2.getMeasuredWidth();
                i4 -= measuredWidth;
                if (i11 == 0) {
                    i11 = measuredWidth;
                }
                if (i13 != 0) {
                    sparseBooleanArray.put(i13, z2);
                }
                c0166o2.g(z2);
            } else if ((i12 & 1) == z2) {
                boolean z5 = sparseBooleanArray.get(i13);
                boolean z6 = ((i9 > 0 || z5) && i4 > 0) ? z2 : false;
                if (z6) {
                    View a3 = a(c0166o2, null, viewGroup);
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
                        C0166o c0166o3 = (C0166o) arrayList.get(i14);
                        if (c0166o3.f2713b == i13) {
                            if (c0166o3.f()) {
                                i9++;
                            }
                            c0166o3.g(false);
                        }
                    }
                }
                if (z6) {
                    i9--;
                }
                c0166o2.g(z6);
            } else {
                c0166o2.g(false);
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
        MenuC0164m menuC0164m;
        if (!this.f2940l || i() || (menuC0164m = this.f2934c) == null || this.h == null || this.f2949u != null) {
            return false;
        }
        menuC0164m.i();
        if (menuC0164m.f2691j.isEmpty()) {
            return false;
        }
        RunnableC0212i runnableC0212i = new RunnableC0212i(this, new C0208g(this, this.f2933b, this.f2934c, this.i));
        this.f2949u = runnableC0212i;
        ((View) this.h).post(runnableC0212i);
        return true;
    }
}
