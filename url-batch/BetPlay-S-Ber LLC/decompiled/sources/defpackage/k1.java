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
import com.awerser.monnit.betplay.R;
import java.util.ArrayList;

/* compiled from: r8-map-id-9fea5842fe02e932dfed9a581eb1db18ad6fbe2fdbe2eb471e1a0b06e64b43e7 */
/* loaded from: classes.dex */
public final class k1 implements ru {
    public g1 A;
    public final Context f;
    public Context g;
    public au h;
    public final LayoutInflater i;
    public qu j;
    public tu m;
    public i1 n;
    public Drawable o;
    public boolean p;
    public boolean q;
    public boolean r;
    public int s;
    public int t;
    public int u;
    public boolean v;
    public f1 x;
    public f1 y;
    public h1 z;
    public final int k = R.layout.abc_action_menu_layout;
    public final int l = R.layout.abc_action_menu_item_layout;
    public final SparseBooleanArray w = new SparseBooleanArray();
    public final j1 B = new j1(0, this);

    public k1(Context context) {
        this.f = context;
        this.i = LayoutInflater.from(context);
    }

    @Override // defpackage.ru
    public final void a(au auVar, boolean z) {
        d();
        f1 f1Var = this.y;
        if (f1Var != null && f1Var.b()) {
            f1Var.j.dismiss();
        }
        qu quVar = this.j;
        if (quVar != null) {
            quVar.a(auVar, z);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r5v4, types: [su] */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Type inference failed for: r5v7 */
    public final View b(eu euVar, View view, ViewGroup viewGroup) {
        View actionView = euVar.getActionView();
        if (actionView == null || euVar.e()) {
            ActionMenuItemView actionMenuItemView = view instanceof su ? (su) view : (su) this.i.inflate(this.l, viewGroup, false);
            actionMenuItemView.c(euVar);
            ActionMenuItemView actionMenuItemView2 = actionMenuItemView;
            actionMenuItemView2.setItemInvoker((ActionMenuView) this.m);
            if (this.A == null) {
                this.A = new g1(this);
            }
            actionMenuItemView2.setPopupCallback(this.A);
            actionView = actionMenuItemView;
        }
        actionView.setVisibility(euVar.C ? 8 : 0);
        ViewGroup.LayoutParams layoutParams = actionView.getLayoutParams();
        ((ActionMenuView) viewGroup).getClass();
        if (!(layoutParams instanceof m1)) {
            actionView.setLayoutParams(ActionMenuView.k(layoutParams));
        }
        return actionView;
    }

    @Override // defpackage.ru
    public final boolean c(eu euVar) {
        return false;
    }

    public final boolean d() {
        Object obj;
        h1 h1Var = this.z;
        if (h1Var != null && (obj = this.m) != null) {
            ((View) obj).removeCallbacks(h1Var);
            this.z = null;
            return true;
        }
        f1 f1Var = this.x;
        if (f1Var == null) {
            return false;
        }
        if (f1Var.b()) {
            f1Var.j.dismiss();
        }
        return true;
    }

    @Override // defpackage.ru
    public final void e(qu quVar) {
        throw null;
    }

    @Override // defpackage.ru
    public final boolean f(eu euVar) {
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.ru
    public final void g() {
        int i;
        ViewGroup viewGroup = (ViewGroup) this.m;
        ArrayList arrayList = null;
        boolean z = false;
        if (viewGroup != null) {
            au auVar = this.h;
            if (auVar != null) {
                auVar.i();
                ArrayList l = this.h.l();
                int size = l.size();
                i = 0;
                for (int i2 = 0; i2 < size; i2++) {
                    eu euVar = (eu) l.get(i2);
                    if ((euVar.x & 32) == 32) {
                        View childAt = viewGroup.getChildAt(i);
                        eu itemData = childAt instanceof su ? ((su) childAt).getItemData() : null;
                        View b = b(euVar, childAt, viewGroup);
                        if (euVar != itemData) {
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
        au auVar2 = this.h;
        if (auVar2 != null) {
            auVar2.i();
            ArrayList arrayList2 = auVar2.i;
            int size2 = arrayList2.size();
            for (int i3 = 0; i3 < size2; i3++) {
                fu fuVar = ((eu) arrayList2.get(i3)).A;
            }
        }
        au auVar3 = this.h;
        if (auVar3 != null) {
            auVar3.i();
            arrayList = auVar3.j;
        }
        if (this.q && arrayList != null) {
            int size3 = arrayList.size();
            if (size3 == 1) {
                z = !((eu) arrayList.get(0)).C;
            } else if (size3 > 0) {
                z = true;
            }
        }
        i1 i1Var = this.n;
        if (z) {
            if (i1Var == null) {
                this.n = new i1(this, this.f);
            }
            ViewGroup viewGroup3 = (ViewGroup) this.n.getParent();
            if (viewGroup3 != this.m) {
                if (viewGroup3 != null) {
                    viewGroup3.removeView(this.n);
                }
                ActionMenuView actionMenuView = (ActionMenuView) this.m;
                i1 i1Var2 = this.n;
                actionMenuView.getClass();
                m1 j = ActionMenuView.j();
                j.a = true;
                actionMenuView.addView(i1Var2, j);
            }
        } else if (i1Var != null) {
            Object parent = i1Var.getParent();
            Object obj = this.m;
            if (parent == obj) {
                ((ViewGroup) obj).removeView(this.n);
            }
        }
        ((ActionMenuView) this.m).setOverflowReserved(this.q);
    }

    public final boolean h() {
        f1 f1Var = this.x;
        return f1Var != null && f1Var.b();
    }

    @Override // defpackage.ru
    public final void i(Context context, au auVar) {
        this.g = context;
        LayoutInflater.from(context);
        this.h = auVar;
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
                i1 i1Var = new i1(this, this.f);
                this.n = i1Var;
                if (this.p) {
                    i1Var.setImageDrawable(this.o);
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
    @Override // defpackage.ru
    public final boolean j(v40 v40Var) {
        boolean z;
        if (v40Var.hasVisibleItems()) {
            v40 v40Var2 = v40Var;
            while (true) {
                au auVar = v40Var2.z;
                if (auVar == this.h) {
                    break;
                }
                v40Var2 = (v40) auVar;
            }
            eu euVar = v40Var2.A;
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
                    if ((childAt instanceof su) && ((su) childAt).getItemData() == euVar) {
                        view = childAt;
                        break;
                    }
                    i++;
                }
            }
            if (view != null) {
                v40Var.A.getClass();
                int size = v40Var.f.size();
                int i2 = 0;
                while (true) {
                    if (i2 >= size) {
                        z = false;
                        break;
                    }
                    MenuItem item = v40Var.getItem(i2);
                    if (item.isVisible() && item.getIcon() != null) {
                        z = true;
                        break;
                    }
                    i2++;
                }
                f1 f1Var = new f1(this, this.g, v40Var, view);
                this.y = f1Var;
                f1Var.h = z;
                ju juVar = f1Var.j;
                if (juVar != null) {
                    juVar.o(z);
                }
                f1 f1Var2 = this.y;
                if (!f1Var2.b()) {
                    if (f1Var2.f == null) {
                        o8.t("MenuPopupHelper cannot be used without an anchor");
                        return false;
                    }
                    f1Var2.d(0, 0, false, false);
                }
                qu quVar = this.j;
                if (quVar != null) {
                    quVar.s(v40Var);
                }
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.ru
    public final boolean k() {
        int i;
        ArrayList arrayList;
        int i2;
        boolean z;
        k1 k1Var = this;
        au auVar = k1Var.h;
        if (auVar != null) {
            arrayList = auVar.l();
            i = arrayList.size();
        } else {
            i = 0;
            arrayList = null;
        }
        int i3 = k1Var.u;
        int i4 = k1Var.t;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        ViewGroup viewGroup = (ViewGroup) k1Var.m;
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
            eu euVar = (eu) arrayList.get(i5);
            int i8 = euVar.y;
            if ((i8 & 2) == 2) {
                i6++;
            } else if ((i8 & 1) == 1) {
                i7++;
            } else {
                z2 = true;
            }
            if (k1Var.v && euVar.C) {
                i3 = 0;
            }
            i5++;
        }
        if (k1Var.q && (z2 || i7 + i6 > i3)) {
            i3--;
        }
        int i9 = i3 - i6;
        SparseBooleanArray sparseBooleanArray = k1Var.w;
        sparseBooleanArray.clear();
        int i10 = 0;
        int i11 = 0;
        while (i10 < i) {
            eu euVar2 = (eu) arrayList.get(i10);
            int i12 = euVar2.y;
            boolean z3 = (i12 & 2) == i2 ? z : false;
            int i13 = euVar2.b;
            if (z3) {
                View b = k1Var.b(euVar2, null, viewGroup);
                b.measure(makeMeasureSpec, makeMeasureSpec);
                int measuredWidth = b.getMeasuredWidth();
                i4 -= measuredWidth;
                if (i11 == 0) {
                    i11 = measuredWidth;
                }
                if (i13 != 0) {
                    sparseBooleanArray.put(i13, z);
                }
                euVar2.f(z);
            } else if ((i12 & 1) == z) {
                boolean z4 = sparseBooleanArray.get(i13);
                boolean z5 = ((i9 > 0 || z4) && i4 > 0) ? z : false;
                if (z5) {
                    View b2 = k1Var.b(euVar2, null, viewGroup);
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
                        eu euVar3 = (eu) arrayList.get(i14);
                        if (euVar3.b == i13) {
                            if ((euVar3.x & 32) == 32) {
                                i9++;
                            }
                            euVar3.f(false);
                        }
                    }
                }
                if (z5) {
                    i9--;
                }
                euVar2.f(z5);
            } else {
                euVar2.f(false);
                i10++;
                i2 = 2;
                k1Var = this;
                z = true;
            }
            i10++;
            i2 = 2;
            k1Var = this;
            z = true;
        }
        return z;
    }

    public final boolean l() {
        au auVar;
        if (this.q && !h() && (auVar = this.h) != null && this.m != null && this.z == null) {
            auVar.i();
            if (!auVar.j.isEmpty()) {
                h1 h1Var = new h1(this, new f1(this, this.g, this.h, this.n), 0);
                this.z = h1Var;
                ((View) this.m).post(h1Var);
                return true;
            }
        }
        return false;
    }
}
