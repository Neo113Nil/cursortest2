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
import android.view.ViewParent;
import androidx.appcompat.view.menu.ActionMenuItemView;
import androidx.appcompat.widget.ActionMenuView;
import com.fc.barca.football.R;
import java.util.ArrayList;
import k.AbstractC1067l;
import k.InterfaceC1070o;
import k.InterfaceC1071p;
import k.InterfaceC1072q;
import k.MenuC1065j;
import k.MenuItemC1066k;
import k.SubMenuC1075t;

/* renamed from: l.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1087i implements InterfaceC1071p {

    /* renamed from: a, reason: collision with root package name */
    public final Context f9817a;

    /* renamed from: b, reason: collision with root package name */
    public Context f9818b;

    /* renamed from: c, reason: collision with root package name */
    public MenuC1065j f9819c;

    /* renamed from: d, reason: collision with root package name */
    public final LayoutInflater f9820d;

    /* renamed from: e, reason: collision with root package name */
    public InterfaceC1070o f9821e;

    /* renamed from: g, reason: collision with root package name */
    public ActionMenuView f9822g;

    /* renamed from: h, reason: collision with root package name */
    public C1086h f9823h;

    /* renamed from: i, reason: collision with root package name */
    public Drawable f9824i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f9825j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f9826k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f9827l;

    /* renamed from: m, reason: collision with root package name */
    public int f9828m;

    /* renamed from: n, reason: collision with root package name */
    public int f9829n;
    public int o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f9830p;

    /* renamed from: r, reason: collision with root package name */
    public C1084f f9832r;

    /* renamed from: s, reason: collision with root package name */
    public C1084f f9833s;

    /* renamed from: t, reason: collision with root package name */
    public B.a f9834t;

    /* renamed from: u, reason: collision with root package name */
    public C1085g f9835u;
    public final int f = R.layout.abc_action_menu_item_layout;

    /* renamed from: q, reason: collision with root package name */
    public final SparseBooleanArray f9831q = new SparseBooleanArray();
    public final b0.r v = new b0.r(this);

    public C1087i(Context context) {
        this.f9817a = context;
        this.f9820d = LayoutInflater.from(context);
    }

    @Override // k.InterfaceC1071p
    public final void a(MenuC1065j menuC1065j, boolean z) {
        g();
        C1084f c1084f = this.f9833s;
        if (c1084f != null && c1084f.b()) {
            c1084f.f9649i.dismiss();
        }
        InterfaceC1070o interfaceC1070o = this.f9821e;
        if (interfaceC1070o != null) {
            interfaceC1070o.a(menuC1065j, z);
        }
    }

    @Override // k.InterfaceC1071p
    public final boolean b(MenuItemC1066k menuItemC1066k) {
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // k.InterfaceC1071p
    public final boolean c(SubMenuC1075t subMenuC1075t) {
        boolean z;
        if (subMenuC1075t.hasVisibleItems()) {
            SubMenuC1075t subMenuC1075t2 = subMenuC1075t;
            while (true) {
                MenuC1065j menuC1065j = subMenuC1075t2.f9669w;
                if (menuC1065j == this.f9819c) {
                    break;
                }
                subMenuC1075t2 = (SubMenuC1075t) menuC1065j;
            }
            ActionMenuView actionMenuView = this.f9822g;
            View view = null;
            if (actionMenuView != null) {
                int childCount = actionMenuView.getChildCount();
                int i3 = 0;
                while (true) {
                    if (i3 >= childCount) {
                        break;
                    }
                    View childAt = actionMenuView.getChildAt(i3);
                    if ((childAt instanceof InterfaceC1072q) && ((InterfaceC1072q) childAt).getItemData() == subMenuC1075t2.f9670x) {
                        view = childAt;
                        break;
                    }
                    i3++;
                }
            }
            if (view != null) {
                subMenuC1075t.f9670x.getClass();
                int size = subMenuC1075t.f.size();
                int i4 = 0;
                while (true) {
                    if (i4 >= size) {
                        z = false;
                        break;
                    }
                    MenuItem item = subMenuC1075t.getItem(i4);
                    if (item.isVisible() && item.getIcon() != null) {
                        z = true;
                        break;
                    }
                    i4++;
                }
                C1084f c1084f = new C1084f(this, this.f9818b, subMenuC1075t, view);
                this.f9833s = c1084f;
                c1084f.f9647g = z;
                AbstractC1067l abstractC1067l = c1084f.f9649i;
                if (abstractC1067l != null) {
                    abstractC1067l.o(z);
                }
                C1084f c1084f2 = this.f9833s;
                if (!c1084f2.b()) {
                    if (c1084f2.f9646e == null) {
                        throw new IllegalStateException("MenuPopupHelper cannot be used without an anchor");
                    }
                    c1084f2.d(0, 0, false, false);
                }
                InterfaceC1070o interfaceC1070o = this.f9821e;
                if (interfaceC1070o != null) {
                    interfaceC1070o.d(subMenuC1075t);
                }
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v0, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r7v4, types: [k.q] */
    /* JADX WARN: Type inference failed for: r7v7 */
    /* JADX WARN: Type inference failed for: r7v8 */
    public final View d(MenuItemC1066k menuItemC1066k, View view, ActionMenuView actionMenuView) {
        View view2 = menuItemC1066k.z;
        View view3 = view2 != null ? view2 : null;
        if (view3 == null || ((menuItemC1066k.f9639y & 8) != 0 && view2 != null)) {
            ActionMenuItemView actionMenuItemView = view instanceof InterfaceC1072q ? (InterfaceC1072q) view : (InterfaceC1072q) this.f9820d.inflate(this.f, (ViewGroup) actionMenuView, false);
            actionMenuItemView.a(menuItemC1066k);
            ActionMenuItemView actionMenuItemView2 = actionMenuItemView;
            actionMenuItemView2.setItemInvoker(this.f9822g);
            if (this.f9835u == null) {
                this.f9835u = new C1085g(this);
            }
            actionMenuItemView2.setPopupCallback(this.f9835u);
            view3 = actionMenuItemView;
        }
        view3.setVisibility(menuItemC1066k.f9617B ? 8 : 0);
        ViewGroup.LayoutParams layoutParams = view3.getLayoutParams();
        actionMenuView.getClass();
        if (!(layoutParams instanceof C1089k)) {
            view3.setLayoutParams(ActionMenuView.i(layoutParams));
        }
        return view3;
    }

    @Override // k.InterfaceC1071p
    public final boolean e(MenuItemC1066k menuItemC1066k) {
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // k.InterfaceC1071p
    public final void f() {
        int i3;
        ActionMenuView actionMenuView = this.f9822g;
        ArrayList arrayList = null;
        boolean z = false;
        if (actionMenuView != null) {
            MenuC1065j menuC1065j = this.f9819c;
            if (menuC1065j != null) {
                menuC1065j.i();
                ArrayList k3 = this.f9819c.k();
                int size = k3.size();
                i3 = 0;
                for (int i4 = 0; i4 < size; i4++) {
                    MenuItemC1066k menuItemC1066k = (MenuItemC1066k) k3.get(i4);
                    if ((menuItemC1066k.f9638x & 32) == 32) {
                        View childAt = actionMenuView.getChildAt(i3);
                        MenuItemC1066k itemData = childAt instanceof InterfaceC1072q ? ((InterfaceC1072q) childAt).getItemData() : null;
                        View d3 = d(menuItemC1066k, childAt, actionMenuView);
                        if (menuItemC1066k != itemData) {
                            d3.setPressed(false);
                            d3.jumpDrawablesToCurrentState();
                        }
                        if (d3 != childAt) {
                            ViewGroup viewGroup = (ViewGroup) d3.getParent();
                            if (viewGroup != null) {
                                viewGroup.removeView(d3);
                            }
                            this.f9822g.addView(d3, i3);
                        }
                        i3++;
                    }
                }
            } else {
                i3 = 0;
            }
            while (i3 < actionMenuView.getChildCount()) {
                if (actionMenuView.getChildAt(i3) == this.f9823h) {
                    i3++;
                } else {
                    actionMenuView.removeViewAt(i3);
                }
            }
        }
        this.f9822g.requestLayout();
        MenuC1065j menuC1065j2 = this.f9819c;
        if (menuC1065j2 != null) {
            menuC1065j2.i();
            ArrayList arrayList2 = menuC1065j2.f9604i;
            int size2 = arrayList2.size();
            for (int i5 = 0; i5 < size2; i5++) {
                ((MenuItemC1066k) arrayList2.get(i5)).getClass();
            }
        }
        MenuC1065j menuC1065j3 = this.f9819c;
        if (menuC1065j3 != null) {
            menuC1065j3.i();
            arrayList = menuC1065j3.f9605j;
        }
        if (this.f9826k && arrayList != null) {
            int size3 = arrayList.size();
            if (size3 == 1) {
                z = !((MenuItemC1066k) arrayList.get(0)).f9617B;
            } else if (size3 > 0) {
                z = true;
            }
        }
        if (z) {
            if (this.f9823h == null) {
                this.f9823h = new C1086h(this, this.f9817a);
            }
            ViewGroup viewGroup2 = (ViewGroup) this.f9823h.getParent();
            if (viewGroup2 != this.f9822g) {
                if (viewGroup2 != null) {
                    viewGroup2.removeView(this.f9823h);
                }
                ActionMenuView actionMenuView2 = this.f9822g;
                C1086h c1086h = this.f9823h;
                actionMenuView2.getClass();
                C1089k h3 = ActionMenuView.h();
                h3.f9841c = true;
                actionMenuView2.addView(c1086h, h3);
            }
        } else {
            C1086h c1086h2 = this.f9823h;
            if (c1086h2 != null) {
                ViewParent parent = c1086h2.getParent();
                ActionMenuView actionMenuView3 = this.f9822g;
                if (parent == actionMenuView3) {
                    actionMenuView3.removeView(this.f9823h);
                }
            }
        }
        this.f9822g.setOverflowReserved(this.f9826k);
    }

    public final boolean g() {
        ActionMenuView actionMenuView;
        B.a aVar = this.f9834t;
        if (aVar != null && (actionMenuView = this.f9822g) != null) {
            actionMenuView.removeCallbacks(aVar);
            this.f9834t = null;
            return true;
        }
        C1084f c1084f = this.f9832r;
        if (c1084f == null) {
            return false;
        }
        if (c1084f.b()) {
            c1084f.f9649i.dismiss();
        }
        return true;
    }

    @Override // k.InterfaceC1071p
    public final void h(InterfaceC1070o interfaceC1070o) {
        throw null;
    }

    @Override // k.InterfaceC1071p
    public final void i(Context context, MenuC1065j menuC1065j) {
        this.f9818b = context;
        LayoutInflater.from(context);
        this.f9819c = menuC1065j;
        Resources resources = context.getResources();
        if (!this.f9827l) {
            this.f9826k = true;
        }
        int i3 = 2;
        this.f9828m = context.getResources().getDisplayMetrics().widthPixels / 2;
        Configuration configuration = context.getResources().getConfiguration();
        int i4 = configuration.screenWidthDp;
        int i5 = configuration.screenHeightDp;
        if (configuration.smallestScreenWidthDp > 600 || i4 > 600 || ((i4 > 960 && i5 > 720) || (i4 > 720 && i5 > 960))) {
            i3 = 5;
        } else if (i4 >= 500 || ((i4 > 640 && i5 > 480) || (i4 > 480 && i5 > 640))) {
            i3 = 4;
        } else if (i4 >= 360) {
            i3 = 3;
        }
        this.o = i3;
        int i6 = this.f9828m;
        if (this.f9826k) {
            if (this.f9823h == null) {
                C1086h c1086h = new C1086h(this, this.f9817a);
                this.f9823h = c1086h;
                if (this.f9825j) {
                    c1086h.setImageDrawable(this.f9824i);
                    this.f9824i = null;
                    this.f9825j = false;
                }
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
                this.f9823h.measure(makeMeasureSpec, makeMeasureSpec);
            }
            i6 -= this.f9823h.getMeasuredWidth();
        } else {
            this.f9823h = null;
        }
        this.f9829n = i6;
        float f = resources.getDisplayMetrics().density;
    }

    @Override // k.InterfaceC1071p
    public final boolean j() {
        int i3;
        ArrayList arrayList;
        int i4;
        boolean z;
        C1087i c1087i = this;
        MenuC1065j menuC1065j = c1087i.f9819c;
        if (menuC1065j != null) {
            arrayList = menuC1065j.k();
            i3 = arrayList.size();
        } else {
            i3 = 0;
            arrayList = null;
        }
        int i5 = c1087i.o;
        int i6 = c1087i.f9829n;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        ActionMenuView actionMenuView = c1087i.f9822g;
        int i7 = 0;
        boolean z2 = false;
        int i8 = 0;
        int i9 = 0;
        while (true) {
            i4 = 2;
            z = true;
            if (i7 >= i3) {
                break;
            }
            MenuItemC1066k menuItemC1066k = (MenuItemC1066k) arrayList.get(i7);
            int i10 = menuItemC1066k.f9639y;
            if ((i10 & 2) == 2) {
                i8++;
            } else if ((i10 & 1) == 1) {
                i9++;
            } else {
                z2 = true;
            }
            if (c1087i.f9830p && menuItemC1066k.f9617B) {
                i5 = 0;
            }
            i7++;
        }
        if (c1087i.f9826k && (z2 || i9 + i8 > i5)) {
            i5--;
        }
        int i11 = i5 - i8;
        SparseBooleanArray sparseBooleanArray = c1087i.f9831q;
        sparseBooleanArray.clear();
        int i12 = 0;
        int i13 = 0;
        while (i12 < i3) {
            MenuItemC1066k menuItemC1066k2 = (MenuItemC1066k) arrayList.get(i12);
            int i14 = menuItemC1066k2.f9639y;
            boolean z3 = (i14 & 2) == i4 ? z : false;
            int i15 = menuItemC1066k2.f9619b;
            if (z3) {
                View d3 = c1087i.d(menuItemC1066k2, null, actionMenuView);
                d3.measure(makeMeasureSpec, makeMeasureSpec);
                int measuredWidth = d3.getMeasuredWidth();
                i6 -= measuredWidth;
                if (i13 == 0) {
                    i13 = measuredWidth;
                }
                if (i15 != 0) {
                    sparseBooleanArray.put(i15, z);
                }
                menuItemC1066k2.d(z);
            } else if ((i14 & 1) == z) {
                boolean z4 = sparseBooleanArray.get(i15);
                boolean z5 = ((i11 > 0 || z4) && i6 > 0) ? z : false;
                if (z5) {
                    View d4 = c1087i.d(menuItemC1066k2, null, actionMenuView);
                    d4.measure(makeMeasureSpec, makeMeasureSpec);
                    int measuredWidth2 = d4.getMeasuredWidth();
                    i6 -= measuredWidth2;
                    if (i13 == 0) {
                        i13 = measuredWidth2;
                    }
                    z5 &= i6 + i13 > 0;
                }
                if (z5 && i15 != 0) {
                    sparseBooleanArray.put(i15, true);
                } else if (z4) {
                    sparseBooleanArray.put(i15, false);
                    for (int i16 = 0; i16 < i12; i16++) {
                        MenuItemC1066k menuItemC1066k3 = (MenuItemC1066k) arrayList.get(i16);
                        if (menuItemC1066k3.f9619b == i15) {
                            if ((menuItemC1066k3.f9638x & 32) == 32) {
                                i11++;
                            }
                            menuItemC1066k3.d(false);
                        }
                    }
                }
                if (z5) {
                    i11--;
                }
                menuItemC1066k2.d(z5);
            } else {
                menuItemC1066k2.d(false);
                i12++;
                i4 = 2;
                c1087i = this;
                z = true;
            }
            i12++;
            i4 = 2;
            c1087i = this;
            z = true;
        }
        return z;
    }

    public final boolean k() {
        MenuC1065j menuC1065j;
        if (!this.f9826k) {
            return false;
        }
        C1084f c1084f = this.f9832r;
        if ((c1084f != null && c1084f.b()) || (menuC1065j = this.f9819c) == null || this.f9822g == null || this.f9834t != null) {
            return false;
        }
        menuC1065j.i();
        if (menuC1065j.f9605j.isEmpty()) {
            return false;
        }
        B.a aVar = new B.a(this, new C1084f(this, this.f9818b, this.f9819c, this.f9823h), 8, false);
        this.f9834t = aVar;
        this.f9822g.post(aVar);
        InterfaceC1070o interfaceC1070o = this.f9821e;
        if (interfaceC1070o == null) {
            return true;
        }
        interfaceC1070o.d(null);
        return true;
    }
}
