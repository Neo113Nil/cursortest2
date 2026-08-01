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
import com.trembin.nirefon.betfury.R;
import java.util.ArrayList;

/* compiled from: r8-map-id-555d5e190d9a27a9a8404de93c25a29c9fbe11559b3463c92c68ce527c1de619 */
/* loaded from: classes.dex */
public final class l1 implements h20 {
    public i1 A;
    public final Context f;
    public Context g;
    public r10 h;
    public final LayoutInflater i;
    public g20 j;
    public j20 m;
    public k1 n;
    public Drawable o;
    public boolean p;
    public boolean q;
    public boolean r;
    public int s;
    public int t;
    public int u;
    public boolean v;
    public h1 x;
    public h1 y;
    public j1 z;
    public final int k = R.layout.abc_action_menu_layout;
    public final int l = R.layout.abc_action_menu_item_layout;
    public final SparseBooleanArray w = new SparseBooleanArray();
    public final o0 B = new o0(1, this);

    public l1(Context context) {
        this.f = context;
        this.i = LayoutInflater.from(context);
    }

    @Override // defpackage.h20
    public final void a(r10 r10Var, boolean z) {
        d();
        h1 h1Var = this.y;
        if (h1Var != null && h1Var.b()) {
            h1Var.j.dismiss();
        }
        g20 g20Var = this.j;
        if (g20Var != null) {
            g20Var.a(r10Var, z);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r5v4, types: [i20] */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Type inference failed for: r5v7 */
    public final View b(u10 u10Var, View view, ViewGroup viewGroup) {
        View actionView = u10Var.getActionView();
        if (actionView == null || u10Var.e()) {
            ActionMenuItemView actionMenuItemView = view instanceof i20 ? (i20) view : (i20) this.i.inflate(this.l, viewGroup, false);
            actionMenuItemView.c(u10Var);
            ActionMenuItemView actionMenuItemView2 = actionMenuItemView;
            actionMenuItemView2.setItemInvoker((ActionMenuView) this.m);
            if (this.A == null) {
                this.A = new i1(this);
            }
            actionMenuItemView2.setPopupCallback(this.A);
            actionView = actionMenuItemView;
        }
        actionView.setVisibility(u10Var.C ? 8 : 0);
        ViewGroup.LayoutParams layoutParams = actionView.getLayoutParams();
        ((ActionMenuView) viewGroup).getClass();
        if (!(layoutParams instanceof n1)) {
            actionView.setLayoutParams(ActionMenuView.k(layoutParams));
        }
        return actionView;
    }

    @Override // defpackage.h20
    public final boolean c(u10 u10Var) {
        return false;
    }

    public final boolean d() {
        Object obj;
        j1 j1Var = this.z;
        if (j1Var != null && (obj = this.m) != null) {
            ((View) obj).removeCallbacks(j1Var);
            this.z = null;
            return true;
        }
        h1 h1Var = this.x;
        if (h1Var == null) {
            return false;
        }
        if (h1Var.b()) {
            h1Var.j.dismiss();
        }
        return true;
    }

    @Override // defpackage.h20
    public final void e(g20 g20Var) {
        throw null;
    }

    @Override // defpackage.h20
    public final boolean f(u10 u10Var) {
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.h20
    public final void g() {
        int i;
        ViewGroup viewGroup = (ViewGroup) this.m;
        ArrayList arrayList = null;
        boolean z = false;
        if (viewGroup != null) {
            r10 r10Var = this.h;
            if (r10Var != null) {
                r10Var.i();
                ArrayList l = this.h.l();
                int size = l.size();
                i = 0;
                for (int i2 = 0; i2 < size; i2++) {
                    u10 u10Var = (u10) l.get(i2);
                    if ((u10Var.x & 32) == 32) {
                        View childAt = viewGroup.getChildAt(i);
                        u10 itemData = childAt instanceof i20 ? ((i20) childAt).getItemData() : null;
                        View b = b(u10Var, childAt, viewGroup);
                        if (u10Var != itemData) {
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
        r10 r10Var2 = this.h;
        if (r10Var2 != null) {
            r10Var2.i();
            ArrayList arrayList2 = r10Var2.i;
            int size2 = arrayList2.size();
            for (int i3 = 0; i3 < size2; i3++) {
                v10 v10Var = ((u10) arrayList2.get(i3)).A;
            }
        }
        r10 r10Var3 = this.h;
        if (r10Var3 != null) {
            r10Var3.i();
            arrayList = r10Var3.j;
        }
        if (this.q && arrayList != null) {
            int size3 = arrayList.size();
            if (size3 == 1) {
                z = !((u10) arrayList.get(0)).C;
            } else if (size3 > 0) {
                z = true;
            }
        }
        k1 k1Var = this.n;
        if (z) {
            if (k1Var == null) {
                this.n = new k1(this, this.f);
            }
            ViewGroup viewGroup3 = (ViewGroup) this.n.getParent();
            if (viewGroup3 != this.m) {
                if (viewGroup3 != null) {
                    viewGroup3.removeView(this.n);
                }
                ActionMenuView actionMenuView = (ActionMenuView) this.m;
                k1 k1Var2 = this.n;
                actionMenuView.getClass();
                n1 j = ActionMenuView.j();
                j.a = true;
                actionMenuView.addView(k1Var2, j);
            }
        } else if (k1Var != null) {
            Object parent = k1Var.getParent();
            Object obj = this.m;
            if (parent == obj) {
                ((ViewGroup) obj).removeView(this.n);
            }
        }
        ((ActionMenuView) this.m).setOverflowReserved(this.q);
    }

    @Override // defpackage.h20
    public final void h(Context context, r10 r10Var) {
        this.g = context;
        LayoutInflater.from(context);
        this.h = r10Var;
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
                k1 k1Var = new k1(this, this.f);
                this.n = k1Var;
                if (this.p) {
                    k1Var.setImageDrawable(this.o);
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

    public final boolean i() {
        h1 h1Var = this.x;
        return h1Var != null && h1Var.b();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.h20
    public final boolean j(wf0 wf0Var) {
        boolean z;
        if (wf0Var.hasVisibleItems()) {
            wf0 wf0Var2 = wf0Var;
            while (true) {
                r10 r10Var = wf0Var2.z;
                if (r10Var == this.h) {
                    break;
                }
                wf0Var2 = (wf0) r10Var;
            }
            u10 u10Var = wf0Var2.A;
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
                    if ((childAt instanceof i20) && ((i20) childAt).getItemData() == u10Var) {
                        view = childAt;
                        break;
                    }
                    i++;
                }
            }
            if (view != null) {
                wf0Var.A.getClass();
                int size = wf0Var.f.size();
                int i2 = 0;
                while (true) {
                    if (i2 >= size) {
                        z = false;
                        break;
                    }
                    MenuItem item = wf0Var.getItem(i2);
                    if (item.isVisible() && item.getIcon() != null) {
                        z = true;
                        break;
                    }
                    i2++;
                }
                h1 h1Var = new h1(this, this.g, wf0Var, view);
                this.y = h1Var;
                h1Var.h = z;
                z10 z10Var = h1Var.j;
                if (z10Var != null) {
                    z10Var.o(z);
                }
                h1 h1Var2 = this.y;
                if (!h1Var2.b()) {
                    if (h1Var2.f == null) {
                        s9.u("MenuPopupHelper cannot be used without an anchor");
                        return false;
                    }
                    h1Var2.d(0, 0, false, false);
                }
                g20 g20Var = this.j;
                if (g20Var != null) {
                    g20Var.t(wf0Var);
                }
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.h20
    public final boolean k() {
        int i;
        ArrayList arrayList;
        int i2;
        boolean z;
        l1 l1Var = this;
        r10 r10Var = l1Var.h;
        if (r10Var != null) {
            arrayList = r10Var.l();
            i = arrayList.size();
        } else {
            i = 0;
            arrayList = null;
        }
        int i3 = l1Var.u;
        int i4 = l1Var.t;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        ViewGroup viewGroup = (ViewGroup) l1Var.m;
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
            u10 u10Var = (u10) arrayList.get(i5);
            int i8 = u10Var.y;
            if ((i8 & 2) == 2) {
                i6++;
            } else if ((i8 & 1) == 1) {
                i7++;
            } else {
                z2 = true;
            }
            if (l1Var.v && u10Var.C) {
                i3 = 0;
            }
            i5++;
        }
        if (l1Var.q && (z2 || i7 + i6 > i3)) {
            i3--;
        }
        int i9 = i3 - i6;
        SparseBooleanArray sparseBooleanArray = l1Var.w;
        sparseBooleanArray.clear();
        int i10 = 0;
        int i11 = 0;
        while (i10 < i) {
            u10 u10Var2 = (u10) arrayList.get(i10);
            int i12 = u10Var2.y;
            boolean z3 = (i12 & 2) == i2 ? z : false;
            int i13 = u10Var2.b;
            if (z3) {
                View b = l1Var.b(u10Var2, null, viewGroup);
                b.measure(makeMeasureSpec, makeMeasureSpec);
                int measuredWidth = b.getMeasuredWidth();
                i4 -= measuredWidth;
                if (i11 == 0) {
                    i11 = measuredWidth;
                }
                if (i13 != 0) {
                    sparseBooleanArray.put(i13, z);
                }
                u10Var2.f(z);
            } else if ((i12 & 1) == z) {
                boolean z4 = sparseBooleanArray.get(i13);
                boolean z5 = ((i9 > 0 || z4) && i4 > 0) ? z : false;
                if (z5) {
                    View b2 = l1Var.b(u10Var2, null, viewGroup);
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
                        u10 u10Var3 = (u10) arrayList.get(i14);
                        if (u10Var3.b == i13) {
                            if ((u10Var3.x & 32) == 32) {
                                i9++;
                            }
                            u10Var3.f(false);
                        }
                    }
                }
                if (z5) {
                    i9--;
                }
                u10Var2.f(z5);
            } else {
                u10Var2.f(false);
                i10++;
                i2 = 2;
                l1Var = this;
                z = true;
            }
            i10++;
            i2 = 2;
            l1Var = this;
            z = true;
        }
        return z;
    }

    public final boolean l() {
        r10 r10Var;
        int i = 0;
        if (this.q && !i() && (r10Var = this.h) != null && this.m != null && this.z == null) {
            r10Var.i();
            if (!r10Var.j.isEmpty()) {
                j1 j1Var = new j1(this, new h1(this, this.g, this.h, this.n), i);
                this.z = j1Var;
                ((View) this.m).post(j1Var);
                return true;
            }
        }
        return false;
    }
}
