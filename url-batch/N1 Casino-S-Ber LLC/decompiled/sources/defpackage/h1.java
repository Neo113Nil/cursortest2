package defpackage;

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
import com.derinko.gbini.n1casino.R;
import java.util.ArrayList;

/* compiled from: r8-map-id-f21f5e89e3d3d92eca33bfe12a7775f49cadfb54340e756eb509706243ac6f5c */
/* loaded from: classes.dex */
public final class h1 implements cu {
    public e1 A;
    public final Context f;
    public Context g;
    public mt h;
    public final LayoutInflater i;
    public bu j;
    public eu m;
    public g1 n;
    public Drawable o;
    public boolean p;
    public boolean q;
    public boolean r;
    public int s;
    public int t;
    public int u;
    public boolean v;
    public d1 x;
    public d1 y;
    public f1 z;
    public final int k = R.layout.abc_action_menu_layout;
    public final int l = R.layout.abc_action_menu_item_layout;
    public final SparseBooleanArray w = new SparseBooleanArray();
    public final k0 B = new k0(1, this);

    public h1(Context context) {
        this.f = context;
        this.i = LayoutInflater.from(context);
    }

    @Override // defpackage.cu
    public final void a(mt mtVar, boolean z) {
        d();
        d1 d1Var = this.y;
        if (d1Var != null && d1Var.b()) {
            d1Var.j.dismiss();
        }
        bu buVar = this.j;
        if (buVar != null) {
            buVar.a(mtVar, z);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r5v4, types: [du] */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Type inference failed for: r5v7 */
    public final View b(pt ptVar, View view, ViewGroup viewGroup) {
        View actionView = ptVar.getActionView();
        if (actionView == null || ptVar.e()) {
            ActionMenuItemView actionMenuItemView = view instanceof du ? (du) view : (du) this.i.inflate(this.l, viewGroup, false);
            actionMenuItemView.c(ptVar);
            ActionMenuItemView actionMenuItemView2 = actionMenuItemView;
            actionMenuItemView2.setItemInvoker((ActionMenuView) this.m);
            if (this.A == null) {
                this.A = new e1(this);
            }
            actionMenuItemView2.setPopupCallback(this.A);
            actionView = actionMenuItemView;
        }
        actionView.setVisibility(ptVar.C ? 8 : 0);
        ViewGroup.LayoutParams layoutParams = actionView.getLayoutParams();
        ((ActionMenuView) viewGroup).getClass();
        if (!(layoutParams instanceof j1)) {
            actionView.setLayoutParams(ActionMenuView.k(layoutParams));
        }
        return actionView;
    }

    @Override // defpackage.cu
    public final boolean c(pt ptVar) {
        return false;
    }

    public final boolean d() {
        Object obj;
        f1 f1Var = this.z;
        if (f1Var != null && (obj = this.m) != null) {
            ((View) obj).removeCallbacks(f1Var);
            this.z = null;
            return true;
        }
        d1 d1Var = this.x;
        if (d1Var == null) {
            return false;
        }
        if (d1Var.b()) {
            d1Var.j.dismiss();
        }
        return true;
    }

    @Override // defpackage.cu
    public final void e(bu buVar) {
        throw null;
    }

    @Override // defpackage.cu
    public final boolean f(pt ptVar) {
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.cu
    public final void g() {
        int i;
        ViewGroup viewGroup = (ViewGroup) this.m;
        ArrayList arrayList = null;
        boolean z = false;
        if (viewGroup != null) {
            mt mtVar = this.h;
            if (mtVar != null) {
                mtVar.i();
                ArrayList l = this.h.l();
                int size = l.size();
                i = 0;
                for (int i2 = 0; i2 < size; i2++) {
                    pt ptVar = (pt) l.get(i2);
                    if ((ptVar.x & 32) == 32) {
                        View childAt = viewGroup.getChildAt(i);
                        pt itemData = childAt instanceof du ? ((du) childAt).getItemData() : null;
                        View b = b(ptVar, childAt, viewGroup);
                        if (ptVar != itemData) {
                            b.setPressed(false);
                            b.jumpDrawablesToCurrentState();
                        }
                        if (b != childAt) {
                            ViewGroup viewGroup2 = (ViewGroup) b.getParent();
                            if (viewGroup2 != null) {
                                viewGroup2.removeView(b);
                            }
                            ((ViewGroup) this.m).addView(b, i);
                        }
                        i++;
                    }
                }
            } else {
                i = 0;
            }
            while (i < viewGroup.getChildCount()) {
                if (viewGroup.getChildAt(i) == this.n) {
                    i++;
                } else {
                    viewGroup.removeViewAt(i);
                }
            }
        }
        ((View) this.m).requestLayout();
        mt mtVar2 = this.h;
        if (mtVar2 != null) {
            mtVar2.i();
            ArrayList arrayList2 = mtVar2.i;
            int size2 = arrayList2.size();
            for (int i3 = 0; i3 < size2; i3++) {
                qt qtVar = ((pt) arrayList2.get(i3)).A;
            }
        }
        mt mtVar3 = this.h;
        if (mtVar3 != null) {
            mtVar3.i();
            arrayList = mtVar3.j;
        }
        if (this.q && arrayList != null) {
            int size3 = arrayList.size();
            if (size3 == 1) {
                z = !((pt) arrayList.get(0)).C;
            } else if (size3 > 0) {
                z = true;
            }
        }
        g1 g1Var = this.n;
        if (z) {
            if (g1Var == null) {
                this.n = new g1(this, this.f);
            }
            ViewGroup viewGroup3 = (ViewGroup) this.n.getParent();
            if (viewGroup3 != this.m) {
                if (viewGroup3 != null) {
                    viewGroup3.removeView(this.n);
                }
                ActionMenuView actionMenuView = (ActionMenuView) this.m;
                g1 g1Var2 = this.n;
                actionMenuView.getClass();
                j1 j = ActionMenuView.j();
                j.a = true;
                actionMenuView.addView(g1Var2, j);
            }
        } else if (g1Var != null) {
            Object parent = g1Var.getParent();
            Object obj = this.m;
            if (parent == obj) {
                ((ViewGroup) obj).removeView(this.n);
            }
        }
        ((ActionMenuView) this.m).setOverflowReserved(this.q);
    }

    public final boolean h() {
        d1 d1Var = this.x;
        return d1Var != null && d1Var.b();
    }

    @Override // defpackage.cu
    public final void i(Context context, mt mtVar) {
        this.g = context;
        LayoutInflater.from(context);
        this.h = mtVar;
        Resources resources = context.getResources();
        if (!this.r) {
            this.q = true;
        }
        int i = 2;
        this.s = context.getResources().getDisplayMetrics().widthPixels / 2;
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
        this.u = i;
        int i4 = this.s;
        if (this.q) {
            if (this.n == null) {
                g1 g1Var = new g1(this, this.f);
                this.n = g1Var;
                if (this.p) {
                    g1Var.setImageDrawable(this.o);
                    this.o = null;
                    this.p = false;
                }
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
                this.n.measure(makeMeasureSpec, makeMeasureSpec);
            }
            i4 -= this.n.getMeasuredWidth();
        } else {
            this.n = null;
        }
        this.t = i4;
        float f = resources.getDisplayMetrics().density;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.cu
    public final boolean j(m40 m40Var) {
        boolean z;
        if (m40Var.hasVisibleItems()) {
            m40 m40Var2 = m40Var;
            while (true) {
                mt mtVar = m40Var2.z;
                if (mtVar == this.h) {
                    break;
                }
                m40Var2 = (m40) mtVar;
            }
            pt ptVar = m40Var2.A;
            ViewGroup viewGroup = (ViewGroup) this.m;
            View view = null;
            if (viewGroup != null) {
                int childCount = viewGroup.getChildCount();
                int i = 0;
                while (true) {
                    if (i >= childCount) {
                        break;
                    }
                    View childAt = viewGroup.getChildAt(i);
                    if ((childAt instanceof du) && ((du) childAt).getItemData() == ptVar) {
                        view = childAt;
                        break;
                    }
                    i++;
                }
            }
            if (view != null) {
                m40Var.A.getClass();
                int size = m40Var.f.size();
                int i2 = 0;
                while (true) {
                    if (i2 >= size) {
                        z = false;
                        break;
                    }
                    MenuItem item = m40Var.getItem(i2);
                    if (item.isVisible() && item.getIcon() != null) {
                        z = true;
                        break;
                    }
                    i2++;
                }
                d1 d1Var = new d1(this, this.g, m40Var, view);
                this.y = d1Var;
                d1Var.h = z;
                ut utVar = d1Var.j;
                if (utVar != null) {
                    utVar.o(z);
                }
                d1 d1Var2 = this.y;
                if (!d1Var2.b()) {
                    if (d1Var2.f == null) {
                        t8.t("MenuPopupHelper cannot be used without an anchor");
                        return false;
                    }
                    d1Var2.d(0, 0, false, false);
                }
                bu buVar = this.j;
                if (buVar != null) {
                    buVar.x(m40Var);
                }
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.cu
    public final boolean k() {
        int i;
        ArrayList arrayList;
        int i2;
        boolean z;
        h1 h1Var = this;
        mt mtVar = h1Var.h;
        if (mtVar != null) {
            arrayList = mtVar.l();
            i = arrayList.size();
        } else {
            i = 0;
            arrayList = null;
        }
        int i3 = h1Var.u;
        int i4 = h1Var.t;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        ViewGroup viewGroup = (ViewGroup) h1Var.m;
        int i5 = 0;
        boolean z2 = false;
        int i6 = 0;
        int i7 = 0;
        while (true) {
            i2 = 2;
            z = true;
            if (i5 >= i) {
                break;
            }
            pt ptVar = (pt) arrayList.get(i5);
            int i8 = ptVar.y;
            if ((i8 & 2) == 2) {
                i6++;
            } else if ((i8 & 1) == 1) {
                i7++;
            } else {
                z2 = true;
            }
            if (h1Var.v && ptVar.C) {
                i3 = 0;
            }
            i5++;
        }
        if (h1Var.q && (z2 || i7 + i6 > i3)) {
            i3--;
        }
        int i9 = i3 - i6;
        SparseBooleanArray sparseBooleanArray = h1Var.w;
        sparseBooleanArray.clear();
        int i10 = 0;
        int i11 = 0;
        while (i10 < i) {
            pt ptVar2 = (pt) arrayList.get(i10);
            int i12 = ptVar2.y;
            boolean z3 = (i12 & 2) == i2 ? z : false;
            int i13 = ptVar2.b;
            if (z3) {
                View b = h1Var.b(ptVar2, null, viewGroup);
                b.measure(makeMeasureSpec, makeMeasureSpec);
                int measuredWidth = b.getMeasuredWidth();
                i4 -= measuredWidth;
                if (i11 == 0) {
                    i11 = measuredWidth;
                }
                if (i13 != 0) {
                    sparseBooleanArray.put(i13, z);
                }
                ptVar2.f(z);
            } else if ((i12 & 1) == z) {
                boolean z4 = sparseBooleanArray.get(i13);
                boolean z5 = ((i9 > 0 || z4) && i4 > 0) ? z : false;
                if (z5) {
                    View b2 = h1Var.b(ptVar2, null, viewGroup);
                    b2.measure(makeMeasureSpec, makeMeasureSpec);
                    int measuredWidth2 = b2.getMeasuredWidth();
                    i4 -= measuredWidth2;
                    if (i11 == 0) {
                        i11 = measuredWidth2;
                    }
                    z5 &= i4 + i11 > 0;
                }
                if (z5 && i13 != 0) {
                    sparseBooleanArray.put(i13, true);
                } else if (z4) {
                    sparseBooleanArray.put(i13, false);
                    for (int i14 = 0; i14 < i10; i14++) {
                        pt ptVar3 = (pt) arrayList.get(i14);
                        if (ptVar3.b == i13) {
                            if ((ptVar3.x & 32) == 32) {
                                i9++;
                            }
                            ptVar3.f(false);
                        }
                    }
                }
                if (z5) {
                    i9--;
                }
                ptVar2.f(z5);
            } else {
                ptVar2.f(false);
                i10++;
                i2 = 2;
                h1Var = this;
                z = true;
            }
            i10++;
            i2 = 2;
            h1Var = this;
            z = true;
        }
        return z;
    }

    public final boolean l() {
        mt mtVar;
        int i = 0;
        if (this.q && !h() && (mtVar = this.h) != null && this.m != null && this.z == null) {
            mtVar.i();
            if (!mtVar.j.isEmpty()) {
                f1 f1Var = new f1(this, new d1(this, this.g, this.h, this.n), i);
                this.z = f1Var;
                ((View) this.m).post(f1Var);
                return true;
            }
        }
        return false;
    }
}
