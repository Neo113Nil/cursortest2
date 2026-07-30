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
import com.majelw.libystne.R;
import java.util.ArrayList;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class e3 implements zk1 {
    public int A;
    public int B;
    public boolean C;
    public b3 E;
    public b3 F;
    public iu0 G;
    public c3 H;
    public final Context m;
    public Context n;
    public fk1 o;
    public final LayoutInflater p;
    public yk1 q;
    public cl1 t;
    public d3 u;
    public Drawable v;
    public boolean w;
    public boolean x;
    public boolean y;
    public int z;
    public final int r = R.layout.abc_action_menu_layout;
    public final int s = R.layout.abc_action_menu_item_layout;
    public final SparseBooleanArray D = new SparseBooleanArray();
    public final ar0 I = new ar0(5, this);

    public e3(Context context) {
        this.m = context;
        this.p = LayoutInflater.from(context);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r5v4, types: [bl1] */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Type inference failed for: r5v7 */
    public final View a(lk1 lk1Var, View view, ViewGroup viewGroup) {
        View actionView = lk1Var.getActionView();
        if (actionView == null || lk1Var.e()) {
            ActionMenuItemView actionMenuItemView = view instanceof bl1 ? (bl1) view : (bl1) this.p.inflate(this.s, viewGroup, false);
            actionMenuItemView.a(lk1Var);
            ActionMenuItemView actionMenuItemView2 = actionMenuItemView;
            actionMenuItemView2.setItemInvoker((ActionMenuView) this.t);
            if (this.H == null) {
                this.H = new c3(this);
            }
            actionMenuItemView2.setPopupCallback(this.H);
            actionView = actionMenuItemView;
        }
        actionView.setVisibility(lk1Var.C ? 8 : 0);
        ViewGroup.LayoutParams layoutParams = actionView.getLayoutParams();
        ((ActionMenuView) viewGroup).getClass();
        if (!(layoutParams instanceof g3)) {
            actionView.setLayoutParams(ActionMenuView.j(layoutParams));
        }
        return actionView;
    }

    @Override // defpackage.zk1
    public final void b(fk1 fk1Var, boolean z) {
        c();
        b3 b3Var = this.F;
        if (b3Var != null && b3Var.b()) {
            b3Var.i.dismiss();
        }
        yk1 yk1Var = this.q;
        if (yk1Var != null) {
            yk1Var.b(fk1Var, z);
        }
    }

    public final boolean c() {
        Object obj;
        iu0 iu0Var = this.G;
        if (iu0Var != null && (obj = this.t) != null) {
            ((View) obj).removeCallbacks(iu0Var);
            this.G = null;
            return true;
        }
        b3 b3Var = this.E;
        if (b3Var == null) {
            return false;
        }
        if (b3Var.b()) {
            b3Var.i.dismiss();
        }
        return true;
    }

    @Override // defpackage.zk1
    public final boolean d(lk1 lk1Var) {
        return false;
    }

    @Override // defpackage.zk1
    public final void e(yk1 yk1Var) {
        throw null;
    }

    @Override // defpackage.zk1
    public final boolean f(lk1 lk1Var) {
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.zk1
    public final void g() {
        int i;
        ViewGroup viewGroup = (ViewGroup) this.t;
        ArrayList arrayList = null;
        boolean z = false;
        if (viewGroup != null) {
            fk1 fk1Var = this.o;
            if (fk1Var != null) {
                fk1Var.i();
                ArrayList l = this.o.l();
                int size = l.size();
                i = 0;
                for (int i2 = 0; i2 < size; i2++) {
                    lk1 lk1Var = (lk1) l.get(i2);
                    if ((lk1Var.x & 32) == 32) {
                        View childAt = viewGroup.getChildAt(i);
                        lk1 itemData = childAt instanceof bl1 ? ((bl1) childAt).getItemData() : null;
                        View a = a(lk1Var, childAt, viewGroup);
                        if (lk1Var != itemData) {
                            a.setPressed(false);
                            a.jumpDrawablesToCurrentState();
                        }
                        if (a != childAt) {
                            ViewGroup viewGroup2 = (ViewGroup) a.getParent();
                            if (viewGroup2 != null) {
                                viewGroup2.removeView(a);
                            }
                            ((ViewGroup) this.t).addView(a, i);
                        }
                        i++;
                    }
                }
            } else {
                i = 0;
            }
            while (i < viewGroup.getChildCount()) {
                if (viewGroup.getChildAt(i) == this.u) {
                    i++;
                } else {
                    viewGroup.removeViewAt(i);
                }
            }
        }
        ((View) this.t).requestLayout();
        fk1 fk1Var2 = this.o;
        if (fk1Var2 != null) {
            fk1Var2.i();
            ArrayList arrayList2 = fk1Var2.i;
            int size2 = arrayList2.size();
            for (int i3 = 0; i3 < size2; i3++) {
                nk1 nk1Var = ((lk1) arrayList2.get(i3)).A;
            }
        }
        fk1 fk1Var3 = this.o;
        if (fk1Var3 != null) {
            fk1Var3.i();
            arrayList = fk1Var3.j;
        }
        if (this.x && arrayList != null) {
            int size3 = arrayList.size();
            if (size3 == 1) {
                z = !((lk1) arrayList.get(0)).C;
            } else if (size3 > 0) {
                z = true;
            }
        }
        d3 d3Var = this.u;
        if (z) {
            if (d3Var == null) {
                this.u = new d3(this, this.m);
            }
            ViewGroup viewGroup3 = (ViewGroup) this.u.getParent();
            if (viewGroup3 != this.t) {
                if (viewGroup3 != null) {
                    viewGroup3.removeView(this.u);
                }
                ActionMenuView actionMenuView = (ActionMenuView) this.t;
                d3 d3Var2 = this.u;
                actionMenuView.getClass();
                g3 i4 = ActionMenuView.i();
                i4.a = true;
                actionMenuView.addView(d3Var2, i4);
            }
        } else if (d3Var != null) {
            Object parent = d3Var.getParent();
            Object obj = this.t;
            if (parent == obj) {
                ((ViewGroup) obj).removeView(this.u);
            }
        }
        ((ActionMenuView) this.t).setOverflowReserved(this.x);
    }

    public final boolean h() {
        b3 b3Var = this.E;
        return b3Var != null && b3Var.b();
    }

    @Override // defpackage.zk1
    public final void i(Context context, fk1 fk1Var) {
        this.n = context;
        LayoutInflater.from(context);
        this.o = fk1Var;
        Resources resources = context.getResources();
        if (!this.y) {
            this.x = true;
        }
        int i = 2;
        this.z = context.getResources().getDisplayMetrics().widthPixels / 2;
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
        this.B = i;
        int i4 = this.z;
        if (this.x) {
            if (this.u == null) {
                d3 d3Var = new d3(this, this.m);
                this.u = d3Var;
                if (this.w) {
                    d3Var.setImageDrawable(this.v);
                    this.v = null;
                    this.w = false;
                }
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
                this.u.measure(makeMeasureSpec, makeMeasureSpec);
            }
            i4 -= this.u.getMeasuredWidth();
        } else {
            this.u = null;
        }
        this.A = i4;
        float f = resources.getDisplayMetrics().density;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.zk1
    public final boolean j(cq2 cq2Var) {
        boolean z;
        if (cq2Var.hasVisibleItems()) {
            cq2 cq2Var2 = cq2Var;
            while (true) {
                fk1 fk1Var = cq2Var2.z;
                if (fk1Var == this.o) {
                    break;
                }
                cq2Var2 = (cq2) fk1Var;
            }
            lk1 lk1Var = cq2Var2.A;
            ViewGroup viewGroup = (ViewGroup) this.t;
            View view = null;
            if (viewGroup != null) {
                int childCount = viewGroup.getChildCount();
                int i = 0;
                while (true) {
                    if (i >= childCount) {
                        break;
                    }
                    View childAt = viewGroup.getChildAt(i);
                    if ((childAt instanceof bl1) && ((bl1) childAt).getItemData() == lk1Var) {
                        view = childAt;
                        break;
                    }
                    i++;
                }
            }
            if (view != null) {
                cq2Var.A.getClass();
                int size = cq2Var.f.size();
                int i2 = 0;
                while (true) {
                    if (i2 >= size) {
                        z = false;
                        break;
                    }
                    MenuItem item = cq2Var.getItem(i2);
                    if (item.isVisible() && item.getIcon() != null) {
                        z = true;
                        break;
                    }
                    i2++;
                }
                b3 b3Var = new b3(this, this.n, cq2Var, view);
                this.F = b3Var;
                b3Var.g = z;
                rk1 rk1Var = b3Var.i;
                if (rk1Var != null) {
                    rk1Var.o(z);
                }
                b3 b3Var2 = this.F;
                if (!b3Var2.b()) {
                    if (b3Var2.e == null) {
                        lh.g("MenuPopupHelper cannot be used without an anchor");
                        return false;
                    }
                    b3Var2.d(0, 0, false, false);
                }
                yk1 yk1Var = this.q;
                if (yk1Var != null) {
                    yk1Var.o(cq2Var);
                }
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.zk1
    public final boolean k() {
        int i;
        ArrayList arrayList;
        int i2;
        boolean z;
        e3 e3Var = this;
        fk1 fk1Var = e3Var.o;
        if (fk1Var != null) {
            arrayList = fk1Var.l();
            i = arrayList.size();
        } else {
            i = 0;
            arrayList = null;
        }
        int i3 = e3Var.B;
        int i4 = e3Var.A;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        ViewGroup viewGroup = (ViewGroup) e3Var.t;
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
            lk1 lk1Var = (lk1) arrayList.get(i5);
            int i8 = lk1Var.y;
            if ((i8 & 2) == 2) {
                i6++;
            } else if ((i8 & 1) == 1) {
                i7++;
            } else {
                z2 = true;
            }
            if (e3Var.C && lk1Var.C) {
                i3 = 0;
            }
            i5++;
        }
        if (e3Var.x && (z2 || i7 + i6 > i3)) {
            i3--;
        }
        int i9 = i3 - i6;
        SparseBooleanArray sparseBooleanArray = e3Var.D;
        sparseBooleanArray.clear();
        int i10 = 0;
        int i11 = 0;
        while (i10 < i) {
            lk1 lk1Var2 = (lk1) arrayList.get(i10);
            int i12 = lk1Var2.y;
            boolean z3 = (i12 & 2) == i2 ? z : false;
            int i13 = lk1Var2.b;
            if (z3) {
                View a = e3Var.a(lk1Var2, null, viewGroup);
                a.measure(makeMeasureSpec, makeMeasureSpec);
                int measuredWidth = a.getMeasuredWidth();
                i4 -= measuredWidth;
                if (i11 == 0) {
                    i11 = measuredWidth;
                }
                if (i13 != 0) {
                    sparseBooleanArray.put(i13, z);
                }
                lk1Var2.f(z);
            } else if ((i12 & 1) == z) {
                boolean z4 = sparseBooleanArray.get(i13);
                boolean z5 = ((i9 > 0 || z4) && i4 > 0) ? z : false;
                if (z5) {
                    View a2 = e3Var.a(lk1Var2, null, viewGroup);
                    a2.measure(makeMeasureSpec, makeMeasureSpec);
                    int measuredWidth2 = a2.getMeasuredWidth();
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
                        lk1 lk1Var3 = (lk1) arrayList.get(i14);
                        if (lk1Var3.b == i13) {
                            if ((lk1Var3.x & 32) == 32) {
                                i9++;
                            }
                            lk1Var3.f(false);
                        }
                    }
                }
                if (z5) {
                    i9--;
                }
                lk1Var2.f(z5);
            } else {
                lk1Var2.f(false);
                i10++;
                i2 = 2;
                e3Var = this;
                z = true;
            }
            i10++;
            i2 = 2;
            e3Var = this;
            z = true;
        }
        return z;
    }

    public final boolean l() {
        fk1 fk1Var;
        boolean z = false;
        if (this.x && !h() && (fk1Var = this.o) != null && this.t != null && this.G == null) {
            fk1Var.i();
            if (!fk1Var.j.isEmpty()) {
                iu0 iu0Var = new iu0(2, this, new b3(this, this.n, this.o, this.u), z);
                this.G = iu0Var;
                ((View) this.t).post(iu0Var);
                return true;
            }
        }
        return false;
    }
}
