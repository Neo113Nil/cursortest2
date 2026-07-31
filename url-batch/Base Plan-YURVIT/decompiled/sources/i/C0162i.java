package i;

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
import com.crane.slab.beam.R;
import h.MenuC0143j;
import h.MenuItemC0144k;
import java.util.ArrayList;

/* renamed from: i.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0162i implements h.p {

    /* renamed from: e, reason: collision with root package name */
    public final Context f2227e;

    /* renamed from: f, reason: collision with root package name */
    public Context f2228f;

    /* renamed from: g, reason: collision with root package name */
    public MenuC0143j f2229g;

    /* renamed from: h, reason: collision with root package name */
    public final LayoutInflater f2230h;

    /* renamed from: i, reason: collision with root package name */
    public h.o f2231i;

    /* renamed from: k, reason: collision with root package name */
    public ActionMenuView f2233k;

    /* renamed from: l, reason: collision with root package name */
    public C0161h f2234l;

    /* renamed from: m, reason: collision with root package name */
    public Drawable f2235m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f2236n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f2237o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f2238p;

    /* renamed from: q, reason: collision with root package name */
    public int f2239q;

    /* renamed from: r, reason: collision with root package name */
    public int f2240r;

    /* renamed from: s, reason: collision with root package name */
    public int f2241s;
    public boolean t;

    /* renamed from: v, reason: collision with root package name */
    public C0159f f2243v;

    /* renamed from: w, reason: collision with root package name */
    public C0159f f2244w;

    /* renamed from: x, reason: collision with root package name */
    public b1.i f2245x;

    /* renamed from: y, reason: collision with root package name */
    public C0160g f2246y;

    /* renamed from: j, reason: collision with root package name */
    public final int f2232j = R.layout.abc_action_menu_item_layout;

    /* renamed from: u, reason: collision with root package name */
    public final SparseBooleanArray f2242u = new SparseBooleanArray();

    /* renamed from: z, reason: collision with root package name */
    public final B0.E f2247z = new B0.E(19, this);

    public C0162i(Context context) {
        this.f2227e = context;
        this.f2230h = LayoutInflater.from(context);
    }

    @Override // h.p
    public final void a(MenuC0143j menuC0143j, boolean z2) {
        e();
        C0159f c0159f = this.f2244w;
        if (c0159f != null && c0159f.b()) {
            c0159f.f2065i.dismiss();
        }
        h.o oVar = this.f2231i;
        if (oVar != null) {
            oVar.a(menuC0143j, z2);
        }
    }

    @Override // h.p
    public final void b(h.o oVar) {
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v0, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r7v4, types: [h.q] */
    /* JADX WARN: Type inference failed for: r7v7 */
    /* JADX WARN: Type inference failed for: r7v8 */
    public final View c(MenuItemC0144k menuItemC0144k, View view, ActionMenuView actionMenuView) {
        View view2 = menuItemC0144k.f2054z;
        View view3 = view2 != null ? view2 : null;
        if (view3 == null || ((menuItemC0144k.f2053y & 8) != 0 && view2 != null)) {
            ActionMenuItemView actionMenuItemView = view instanceof h.q ? (h.q) view : (h.q) this.f2230h.inflate(this.f2232j, (ViewGroup) actionMenuView, false);
            actionMenuItemView.a(menuItemC0144k);
            ActionMenuItemView actionMenuItemView2 = actionMenuItemView;
            actionMenuItemView2.setItemInvoker(this.f2233k);
            if (this.f2246y == null) {
                this.f2246y = new C0160g(this);
            }
            actionMenuItemView2.setPopupCallback(this.f2246y);
            view3 = actionMenuItemView;
        }
        view3.setVisibility(menuItemC0144k.f2029B ? 8 : 0);
        ViewGroup.LayoutParams layoutParams = view3.getLayoutParams();
        actionMenuView.getClass();
        if (!(layoutParams instanceof C0164k)) {
            view3.setLayoutParams(ActionMenuView.i(layoutParams));
        }
        return view3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // h.p
    public final void d() {
        int i2;
        ActionMenuView actionMenuView = this.f2233k;
        ArrayList arrayList = null;
        boolean z2 = false;
        if (actionMenuView != null) {
            MenuC0143j menuC0143j = this.f2229g;
            if (menuC0143j != null) {
                menuC0143j.i();
                ArrayList k2 = this.f2229g.k();
                int size = k2.size();
                i2 = 0;
                for (int i3 = 0; i3 < size; i3++) {
                    MenuItemC0144k menuItemC0144k = (MenuItemC0144k) k2.get(i3);
                    if ((menuItemC0144k.f2052x & 32) == 32) {
                        View childAt = actionMenuView.getChildAt(i2);
                        MenuItemC0144k itemData = childAt instanceof h.q ? ((h.q) childAt).getItemData() : null;
                        View c2 = c(menuItemC0144k, childAt, actionMenuView);
                        if (menuItemC0144k != itemData) {
                            c2.setPressed(false);
                            c2.jumpDrawablesToCurrentState();
                        }
                        if (c2 != childAt) {
                            ViewGroup viewGroup = (ViewGroup) c2.getParent();
                            if (viewGroup != null) {
                                viewGroup.removeView(c2);
                            }
                            this.f2233k.addView(c2, i2);
                        }
                        i2++;
                    }
                }
            } else {
                i2 = 0;
            }
            while (i2 < actionMenuView.getChildCount()) {
                if (actionMenuView.getChildAt(i2) == this.f2234l) {
                    i2++;
                } else {
                    actionMenuView.removeViewAt(i2);
                }
            }
        }
        this.f2233k.requestLayout();
        MenuC0143j menuC0143j2 = this.f2229g;
        if (menuC0143j2 != null) {
            menuC0143j2.i();
            ArrayList arrayList2 = menuC0143j2.f2017i;
            int size2 = arrayList2.size();
            for (int i4 = 0; i4 < size2; i4++) {
                ((MenuItemC0144k) arrayList2.get(i4)).getClass();
            }
        }
        MenuC0143j menuC0143j3 = this.f2229g;
        if (menuC0143j3 != null) {
            menuC0143j3.i();
            arrayList = menuC0143j3.f2018j;
        }
        if (this.f2237o && arrayList != null) {
            int size3 = arrayList.size();
            if (size3 == 1) {
                z2 = !((MenuItemC0144k) arrayList.get(0)).f2029B;
            } else if (size3 > 0) {
                z2 = true;
            }
        }
        if (z2) {
            if (this.f2234l == null) {
                this.f2234l = new C0161h(this, this.f2227e);
            }
            ViewGroup viewGroup2 = (ViewGroup) this.f2234l.getParent();
            if (viewGroup2 != this.f2233k) {
                if (viewGroup2 != null) {
                    viewGroup2.removeView(this.f2234l);
                }
                ActionMenuView actionMenuView2 = this.f2233k;
                C0161h c0161h = this.f2234l;
                actionMenuView2.getClass();
                C0164k h2 = ActionMenuView.h();
                h2.f2253c = true;
                actionMenuView2.addView(c0161h, h2);
            }
        } else {
            C0161h c0161h2 = this.f2234l;
            if (c0161h2 != null) {
                ViewParent parent = c0161h2.getParent();
                ActionMenuView actionMenuView3 = this.f2233k;
                if (parent == actionMenuView3) {
                    actionMenuView3.removeView(this.f2234l);
                }
            }
        }
        this.f2233k.setOverflowReserved(this.f2237o);
    }

    public final boolean e() {
        ActionMenuView actionMenuView;
        b1.i iVar = this.f2245x;
        if (iVar != null && (actionMenuView = this.f2233k) != null) {
            actionMenuView.removeCallbacks(iVar);
            this.f2245x = null;
            return true;
        }
        C0159f c0159f = this.f2243v;
        if (c0159f == null) {
            return false;
        }
        if (c0159f.b()) {
            c0159f.f2065i.dismiss();
        }
        return true;
    }

    @Override // h.p
    public final void f(Context context, MenuC0143j menuC0143j) {
        this.f2228f = context;
        LayoutInflater.from(context);
        this.f2229g = menuC0143j;
        Resources resources = context.getResources();
        if (!this.f2238p) {
            this.f2237o = true;
        }
        int i2 = 2;
        this.f2239q = context.getResources().getDisplayMetrics().widthPixels / 2;
        Configuration configuration = context.getResources().getConfiguration();
        int i3 = configuration.screenWidthDp;
        int i4 = configuration.screenHeightDp;
        if (configuration.smallestScreenWidthDp > 600 || i3 > 600 || ((i3 > 960 && i4 > 720) || (i3 > 720 && i4 > 960))) {
            i2 = 5;
        } else if (i3 >= 500 || ((i3 > 640 && i4 > 480) || (i3 > 480 && i4 > 640))) {
            i2 = 4;
        } else if (i3 >= 360) {
            i2 = 3;
        }
        this.f2241s = i2;
        int i5 = this.f2239q;
        if (this.f2237o) {
            if (this.f2234l == null) {
                C0161h c0161h = new C0161h(this, this.f2227e);
                this.f2234l = c0161h;
                if (this.f2236n) {
                    c0161h.setImageDrawable(this.f2235m);
                    this.f2235m = null;
                    this.f2236n = false;
                }
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
                this.f2234l.measure(makeMeasureSpec, makeMeasureSpec);
            }
            i5 -= this.f2234l.getMeasuredWidth();
        } else {
            this.f2234l = null;
        }
        this.f2240r = i5;
        float f2 = resources.getDisplayMetrics().density;
    }

    @Override // h.p
    public final boolean g() {
        int i2;
        ArrayList arrayList;
        int i3;
        boolean z2;
        C0162i c0162i = this;
        MenuC0143j menuC0143j = c0162i.f2229g;
        if (menuC0143j != null) {
            arrayList = menuC0143j.k();
            i2 = arrayList.size();
        } else {
            i2 = 0;
            arrayList = null;
        }
        int i4 = c0162i.f2241s;
        int i5 = c0162i.f2240r;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        ActionMenuView actionMenuView = c0162i.f2233k;
        int i6 = 0;
        boolean z3 = false;
        int i7 = 0;
        int i8 = 0;
        while (true) {
            i3 = 2;
            z2 = true;
            if (i6 >= i2) {
                break;
            }
            MenuItemC0144k menuItemC0144k = (MenuItemC0144k) arrayList.get(i6);
            int i9 = menuItemC0144k.f2053y;
            if ((i9 & 2) == 2) {
                i7++;
            } else if ((i9 & 1) == 1) {
                i8++;
            } else {
                z3 = true;
            }
            if (c0162i.t && menuItemC0144k.f2029B) {
                i4 = 0;
            }
            i6++;
        }
        if (c0162i.f2237o && (z3 || i8 + i7 > i4)) {
            i4--;
        }
        int i10 = i4 - i7;
        SparseBooleanArray sparseBooleanArray = c0162i.f2242u;
        sparseBooleanArray.clear();
        int i11 = 0;
        int i12 = 0;
        while (i11 < i2) {
            MenuItemC0144k menuItemC0144k2 = (MenuItemC0144k) arrayList.get(i11);
            int i13 = menuItemC0144k2.f2053y;
            boolean z4 = (i13 & 2) == i3 ? z2 : false;
            int i14 = menuItemC0144k2.f2031b;
            if (z4) {
                View c2 = c0162i.c(menuItemC0144k2, null, actionMenuView);
                c2.measure(makeMeasureSpec, makeMeasureSpec);
                int measuredWidth = c2.getMeasuredWidth();
                i5 -= measuredWidth;
                if (i12 == 0) {
                    i12 = measuredWidth;
                }
                if (i14 != 0) {
                    sparseBooleanArray.put(i14, z2);
                }
                menuItemC0144k2.d(z2);
            } else if ((i13 & 1) == z2) {
                boolean z5 = sparseBooleanArray.get(i14);
                boolean z6 = ((i10 > 0 || z5) && i5 > 0) ? z2 : false;
                if (z6) {
                    View c3 = c0162i.c(menuItemC0144k2, null, actionMenuView);
                    c3.measure(makeMeasureSpec, makeMeasureSpec);
                    int measuredWidth2 = c3.getMeasuredWidth();
                    i5 -= measuredWidth2;
                    if (i12 == 0) {
                        i12 = measuredWidth2;
                    }
                    z6 &= i5 + i12 > 0;
                }
                if (z6 && i14 != 0) {
                    sparseBooleanArray.put(i14, true);
                } else if (z5) {
                    sparseBooleanArray.put(i14, false);
                    for (int i15 = 0; i15 < i11; i15++) {
                        MenuItemC0144k menuItemC0144k3 = (MenuItemC0144k) arrayList.get(i15);
                        if (menuItemC0144k3.f2031b == i14) {
                            if ((menuItemC0144k3.f2052x & 32) == 32) {
                                i10++;
                            }
                            menuItemC0144k3.d(false);
                        }
                    }
                }
                if (z6) {
                    i10--;
                }
                menuItemC0144k2.d(z6);
            } else {
                menuItemC0144k2.d(false);
                i11++;
                i3 = 2;
                c0162i = this;
                z2 = true;
            }
            i11++;
            i3 = 2;
            c0162i = this;
            z2 = true;
        }
        return z2;
    }

    @Override // h.p
    public final boolean h(MenuItemC0144k menuItemC0144k) {
        return false;
    }

    @Override // h.p
    public final boolean i(MenuItemC0144k menuItemC0144k) {
        return false;
    }

    public final boolean j() {
        MenuC0143j menuC0143j;
        if (!this.f2237o) {
            return false;
        }
        C0159f c0159f = this.f2243v;
        if ((c0159f != null && c0159f.b()) || (menuC0143j = this.f2229g) == null || this.f2233k == null || this.f2245x != null) {
            return false;
        }
        menuC0143j.i();
        if (menuC0143j.f2018j.isEmpty()) {
            return false;
        }
        b1.i iVar = new b1.i(1, this, new C0159f(this, this.f2228f, this.f2229g, this.f2234l));
        this.f2245x = iVar;
        this.f2233k.post(iVar);
        h.o oVar = this.f2231i;
        if (oVar == null) {
            return true;
        }
        oVar.n(null);
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // h.p
    public final boolean k(h.t tVar) {
        boolean z2;
        if (tVar.hasVisibleItems()) {
            h.t tVar2 = tVar;
            while (true) {
                MenuC0143j menuC0143j = tVar2.f2086v;
                if (menuC0143j == this.f2229g) {
                    break;
                }
                tVar2 = (h.t) menuC0143j;
            }
            MenuItemC0144k menuItemC0144k = tVar2.f2087w;
            ActionMenuView actionMenuView = this.f2233k;
            View view = null;
            if (actionMenuView != null) {
                int childCount = actionMenuView.getChildCount();
                int i2 = 0;
                while (true) {
                    if (i2 >= childCount) {
                        break;
                    }
                    View childAt = actionMenuView.getChildAt(i2);
                    if ((childAt instanceof h.q) && ((h.q) childAt).getItemData() == menuItemC0144k) {
                        view = childAt;
                        break;
                    }
                    i2++;
                }
            }
            if (view != null) {
                tVar.f2087w.getClass();
                int size = tVar.f2014f.size();
                int i3 = 0;
                while (true) {
                    if (i3 >= size) {
                        z2 = false;
                        break;
                    }
                    MenuItem item = tVar.getItem(i3);
                    if (item.isVisible() && item.getIcon() != null) {
                        z2 = true;
                        break;
                    }
                    i3++;
                }
                C0159f c0159f = new C0159f(this, this.f2228f, tVar, view);
                this.f2244w = c0159f;
                c0159f.f2063g = z2;
                h.l lVar = c0159f.f2065i;
                if (lVar != null) {
                    lVar.o(z2);
                }
                C0159f c0159f2 = this.f2244w;
                if (!c0159f2.b()) {
                    if (c0159f2.f2061e == null) {
                        throw new IllegalStateException("MenuPopupHelper cannot be used without an anchor");
                    }
                    c0159f2.d(0, 0, false, false);
                }
                h.o oVar = this.f2231i;
                if (oVar != null) {
                    oVar.n(tVar);
                }
                return true;
            }
        }
        return false;
    }
}
