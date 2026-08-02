package j;

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
import com.neptunesoft.languesbacdz.R;
import i.AbstractC0213k;
import i.InterfaceC0216n;
import i.InterfaceC0217o;
import i.InterfaceC0218p;
import i.MenuC0211i;
import i.MenuItemC0212j;
import i.SubMenuC0221s;
import java.util.ArrayList;

/* renamed from: j.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0233i implements InterfaceC0217o {

    /* renamed from: e, reason: collision with root package name */
    public final Context f2965e;

    /* renamed from: f, reason: collision with root package name */
    public Context f2966f;

    /* renamed from: g, reason: collision with root package name */
    public MenuC0211i f2967g;

    /* renamed from: h, reason: collision with root package name */
    public final LayoutInflater f2968h;

    /* renamed from: i, reason: collision with root package name */
    public InterfaceC0216n f2969i;

    /* renamed from: k, reason: collision with root package name */
    public ActionMenuView f2971k;

    /* renamed from: l, reason: collision with root package name */
    public C0232h f2972l;

    /* renamed from: m, reason: collision with root package name */
    public Drawable f2973m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f2974n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f2975o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f2976p;

    /* renamed from: q, reason: collision with root package name */
    public int f2977q;

    /* renamed from: r, reason: collision with root package name */
    public int f2978r;

    /* renamed from: s, reason: collision with root package name */
    public int f2979s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f2980t;
    public C0230f v;

    /* renamed from: w, reason: collision with root package name */
    public C0230f f2982w;

    /* renamed from: x, reason: collision with root package name */
    public d1.i f2983x;

    /* renamed from: y, reason: collision with root package name */
    public C0231g f2984y;

    /* renamed from: j, reason: collision with root package name */
    public final int f2970j = R.layout.abc_action_menu_item_layout;

    /* renamed from: u, reason: collision with root package name */
    public final SparseBooleanArray f2981u = new SparseBooleanArray();

    /* renamed from: z, reason: collision with root package name */
    public final B.m f2985z = new B.m(25, this);

    public C0233i(Context context) {
        this.f2965e = context;
        this.f2968h = LayoutInflater.from(context);
    }

    @Override // i.InterfaceC0217o
    public final void a(MenuC0211i menuC0211i, boolean z2) {
        i();
        C0230f c0230f = this.f2982w;
        if (c0230f != null && c0230f.b()) {
            c0230f.f2465i.dismiss();
        }
        InterfaceC0216n interfaceC0216n = this.f2969i;
        if (interfaceC0216n != null) {
            interfaceC0216n.a(menuC0211i, z2);
        }
    }

    @Override // i.InterfaceC0217o
    public final boolean b(MenuItemC0212j menuItemC0212j) {
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r5v4, types: [i.p] */
    /* JADX WARN: Type inference failed for: r5v7 */
    /* JADX WARN: Type inference failed for: r5v8 */
    public final View c(MenuItemC0212j menuItemC0212j, View view, ActionMenuView actionMenuView) {
        View view2 = menuItemC0212j.f2454z;
        if (view2 == null) {
            view2 = null;
        }
        if (view2 == null || menuItemC0212j.c()) {
            ActionMenuItemView actionMenuItemView = view instanceof InterfaceC0218p ? (InterfaceC0218p) view : (InterfaceC0218p) this.f2968h.inflate(this.f2970j, (ViewGroup) actionMenuView, false);
            actionMenuItemView.c(menuItemC0212j);
            ActionMenuItemView actionMenuItemView2 = actionMenuItemView;
            actionMenuItemView2.setItemInvoker(this.f2971k);
            if (this.f2984y == null) {
                this.f2984y = new C0231g(this);
            }
            actionMenuItemView2.setPopupCallback(this.f2984y);
            view2 = actionMenuItemView;
        }
        view2.setVisibility(menuItemC0212j.f2429B ? 8 : 0);
        ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
        actionMenuView.getClass();
        if (!(layoutParams instanceof C0235k)) {
            view2.setLayoutParams(ActionMenuView.i(layoutParams));
        }
        return view2;
    }

    @Override // i.InterfaceC0217o
    public final boolean d() {
        ArrayList arrayList;
        int i2;
        int i3;
        boolean z2;
        MenuC0211i menuC0211i = this.f2967g;
        if (menuC0211i != null) {
            arrayList = menuC0211i.k();
            i2 = arrayList.size();
        } else {
            arrayList = null;
            i2 = 0;
        }
        int i4 = this.f2979s;
        int i5 = this.f2978r;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        ActionMenuView actionMenuView = this.f2971k;
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
            MenuItemC0212j menuItemC0212j = (MenuItemC0212j) arrayList.get(i6);
            int i9 = menuItemC0212j.f2453y;
            if ((i9 & 2) == 2) {
                i7++;
            } else if ((i9 & 1) == 1) {
                i8++;
            } else {
                z3 = true;
            }
            if (this.f2980t && menuItemC0212j.f2429B) {
                i4 = 0;
            }
            i6++;
        }
        if (this.f2975o && (z3 || i8 + i7 > i4)) {
            i4--;
        }
        int i10 = i4 - i7;
        SparseBooleanArray sparseBooleanArray = this.f2981u;
        sparseBooleanArray.clear();
        int i11 = 0;
        int i12 = 0;
        while (i11 < i2) {
            MenuItemC0212j menuItemC0212j2 = (MenuItemC0212j) arrayList.get(i11);
            int i13 = menuItemC0212j2.f2453y;
            boolean z4 = (i13 & 2) == i3;
            int i14 = menuItemC0212j2.f2431b;
            if (z4) {
                View c2 = c(menuItemC0212j2, null, actionMenuView);
                c2.measure(makeMeasureSpec, makeMeasureSpec);
                int measuredWidth = c2.getMeasuredWidth();
                i5 -= measuredWidth;
                if (i12 == 0) {
                    i12 = measuredWidth;
                }
                if (i14 != 0) {
                    sparseBooleanArray.put(i14, z2);
                }
                menuItemC0212j2.f(z2);
            } else if ((i13 & 1) == z2) {
                boolean z5 = sparseBooleanArray.get(i14);
                boolean z6 = (i10 > 0 || z5) && i5 > 0;
                if (z6) {
                    View c3 = c(menuItemC0212j2, null, actionMenuView);
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
                        MenuItemC0212j menuItemC0212j3 = (MenuItemC0212j) arrayList.get(i15);
                        if (menuItemC0212j3.f2431b == i14) {
                            if (menuItemC0212j3.d()) {
                                i10++;
                            }
                            menuItemC0212j3.f(false);
                        }
                    }
                }
                if (z6) {
                    i10--;
                }
                menuItemC0212j2.f(z6);
            } else {
                menuItemC0212j2.f(false);
                i11++;
                i3 = 2;
                z2 = true;
            }
            i11++;
            i3 = 2;
            z2 = true;
        }
        return true;
    }

    @Override // i.InterfaceC0217o
    public final void e(Context context, MenuC0211i menuC0211i) {
        this.f2966f = context;
        LayoutInflater.from(context);
        this.f2967g = menuC0211i;
        Resources resources = context.getResources();
        if (!this.f2976p) {
            this.f2975o = true;
        }
        int i2 = 2;
        this.f2977q = context.getResources().getDisplayMetrics().widthPixels / 2;
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
        this.f2979s = i2;
        int i5 = this.f2977q;
        if (this.f2975o) {
            if (this.f2972l == null) {
                C0232h c0232h = new C0232h(this, this.f2965e);
                this.f2972l = c0232h;
                if (this.f2974n) {
                    c0232h.setImageDrawable(this.f2973m);
                    this.f2973m = null;
                    this.f2974n = false;
                }
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
                this.f2972l.measure(makeMeasureSpec, makeMeasureSpec);
            }
            i5 -= this.f2972l.getMeasuredWidth();
        } else {
            this.f2972l = null;
        }
        this.f2978r = i5;
        float f2 = resources.getDisplayMetrics().density;
    }

    @Override // i.InterfaceC0217o
    public final void f(InterfaceC0216n interfaceC0216n) {
        throw null;
    }

    @Override // i.InterfaceC0217o
    public final boolean g(MenuItemC0212j menuItemC0212j) {
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // i.InterfaceC0217o
    public final void h() {
        int i2;
        ActionMenuView actionMenuView = this.f2971k;
        ArrayList arrayList = null;
        boolean z2 = false;
        if (actionMenuView != null) {
            MenuC0211i menuC0211i = this.f2967g;
            if (menuC0211i != null) {
                menuC0211i.i();
                ArrayList k2 = this.f2967g.k();
                int size = k2.size();
                i2 = 0;
                for (int i3 = 0; i3 < size; i3++) {
                    MenuItemC0212j menuItemC0212j = (MenuItemC0212j) k2.get(i3);
                    if (menuItemC0212j.d()) {
                        View childAt = actionMenuView.getChildAt(i2);
                        MenuItemC0212j itemData = childAt instanceof InterfaceC0218p ? ((InterfaceC0218p) childAt).getItemData() : null;
                        View c2 = c(menuItemC0212j, childAt, actionMenuView);
                        if (menuItemC0212j != itemData) {
                            c2.setPressed(false);
                            c2.jumpDrawablesToCurrentState();
                        }
                        if (c2 != childAt) {
                            ViewGroup viewGroup = (ViewGroup) c2.getParent();
                            if (viewGroup != null) {
                                viewGroup.removeView(c2);
                            }
                            this.f2971k.addView(c2, i2);
                        }
                        i2++;
                    }
                }
            } else {
                i2 = 0;
            }
            while (i2 < actionMenuView.getChildCount()) {
                if (actionMenuView.getChildAt(i2) == this.f2972l) {
                    i2++;
                } else {
                    actionMenuView.removeViewAt(i2);
                }
            }
        }
        this.f2971k.requestLayout();
        MenuC0211i menuC0211i2 = this.f2967g;
        if (menuC0211i2 != null) {
            menuC0211i2.i();
            ArrayList arrayList2 = menuC0211i2.f2416i;
            int size2 = arrayList2.size();
            for (int i4 = 0; i4 < size2; i4++) {
                ((MenuItemC0212j) arrayList2.get(i4)).getClass();
            }
        }
        MenuC0211i menuC0211i3 = this.f2967g;
        if (menuC0211i3 != null) {
            menuC0211i3.i();
            arrayList = menuC0211i3.f2417j;
        }
        if (this.f2975o && arrayList != null) {
            int size3 = arrayList.size();
            if (size3 == 1) {
                z2 = !((MenuItemC0212j) arrayList.get(0)).f2429B;
            } else if (size3 > 0) {
                z2 = true;
            }
        }
        if (z2) {
            if (this.f2972l == null) {
                this.f2972l = new C0232h(this, this.f2965e);
            }
            ViewGroup viewGroup2 = (ViewGroup) this.f2972l.getParent();
            if (viewGroup2 != this.f2971k) {
                if (viewGroup2 != null) {
                    viewGroup2.removeView(this.f2972l);
                }
                ActionMenuView actionMenuView2 = this.f2971k;
                C0232h c0232h = this.f2972l;
                actionMenuView2.getClass();
                C0235k h2 = ActionMenuView.h();
                h2.f2993c = true;
                actionMenuView2.addView(c0232h, h2);
            }
        } else {
            C0232h c0232h2 = this.f2972l;
            if (c0232h2 != null) {
                ViewParent parent = c0232h2.getParent();
                ActionMenuView actionMenuView3 = this.f2971k;
                if (parent == actionMenuView3) {
                    actionMenuView3.removeView(this.f2972l);
                }
            }
        }
        this.f2971k.setOverflowReserved(this.f2975o);
    }

    public final boolean i() {
        ActionMenuView actionMenuView;
        d1.i iVar = this.f2983x;
        if (iVar != null && (actionMenuView = this.f2971k) != null) {
            actionMenuView.removeCallbacks(iVar);
            this.f2983x = null;
            return true;
        }
        C0230f c0230f = this.v;
        if (c0230f == null) {
            return false;
        }
        if (c0230f.b()) {
            c0230f.f2465i.dismiss();
        }
        return true;
    }

    public final boolean j() {
        MenuC0211i menuC0211i;
        if (!this.f2975o) {
            return false;
        }
        C0230f c0230f = this.v;
        if ((c0230f != null && c0230f.b()) || (menuC0211i = this.f2967g) == null || this.f2971k == null || this.f2983x != null) {
            return false;
        }
        menuC0211i.i();
        if (menuC0211i.f2417j.isEmpty()) {
            return false;
        }
        d1.i iVar = new d1.i(1, this, new C0230f(this, this.f2966f, this.f2967g, this.f2972l));
        this.f2983x = iVar;
        this.f2971k.post(iVar);
        InterfaceC0216n interfaceC0216n = this.f2969i;
        if (interfaceC0216n == null) {
            return true;
        }
        interfaceC0216n.b(null);
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // i.InterfaceC0217o
    public final boolean k(SubMenuC0221s subMenuC0221s) {
        boolean z2;
        if (!subMenuC0221s.hasVisibleItems()) {
            return false;
        }
        SubMenuC0221s subMenuC0221s2 = subMenuC0221s;
        while (true) {
            MenuC0211i menuC0211i = subMenuC0221s2.v;
            if (menuC0211i == this.f2967g) {
                break;
            }
            subMenuC0221s2 = (SubMenuC0221s) menuC0211i;
        }
        ActionMenuView actionMenuView = this.f2971k;
        View view = null;
        if (actionMenuView != null) {
            int childCount = actionMenuView.getChildCount();
            int i2 = 0;
            while (true) {
                if (i2 >= childCount) {
                    break;
                }
                View childAt = actionMenuView.getChildAt(i2);
                if ((childAt instanceof InterfaceC0218p) && ((InterfaceC0218p) childAt).getItemData() == subMenuC0221s2.f2486w) {
                    view = childAt;
                    break;
                }
                i2++;
            }
        }
        if (view == null) {
            return false;
        }
        subMenuC0221s.f2486w.getClass();
        int size = subMenuC0221s.f2413f.size();
        int i3 = 0;
        while (true) {
            if (i3 >= size) {
                z2 = false;
                break;
            }
            MenuItem item = subMenuC0221s.getItem(i3);
            if (item.isVisible() && item.getIcon() != null) {
                z2 = true;
                break;
            }
            i3++;
        }
        C0230f c0230f = new C0230f(this, this.f2966f, subMenuC0221s, view);
        this.f2982w = c0230f;
        c0230f.f2463g = z2;
        AbstractC0213k abstractC0213k = c0230f.f2465i;
        if (abstractC0213k != null) {
            abstractC0213k.o(z2);
        }
        C0230f c0230f2 = this.f2982w;
        if (!c0230f2.b()) {
            if (c0230f2.f2461e == null) {
                throw new IllegalStateException("MenuPopupHelper cannot be used without an anchor");
            }
            c0230f2.d(0, 0, false, false);
        }
        InterfaceC0216n interfaceC0216n = this.f2969i;
        if (interfaceC0216n != null) {
            interfaceC0216n.b(subMenuC0221s);
        }
        return true;
    }
}
