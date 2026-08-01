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
import com.moontiko.really.admiralcasino.R;
import java.util.ArrayList;

/* compiled from: r8-map-id-de38bb36dc2361356cb83b4c675dbcd2450924cecdb12a3272c608759c381a50 */
/* loaded from: classes.dex */
public final class i1 implements dx {
    public f1 A;
    public final Context f;
    public Context g;
    public mw h;
    public final LayoutInflater i;
    public cx j;
    public fx m;
    public h1 n;
    public Drawable o;
    public boolean p;
    public boolean q;
    public boolean r;
    public int s;
    public int t;
    public int u;
    public boolean v;
    public e1 x;
    public e1 y;
    public g1 z;
    public final int k = R.layout.abc_action_menu_layout;
    public final int l = R.layout.abc_action_menu_item_layout;
    public final SparseBooleanArray w = new SparseBooleanArray();
    public final rc0 B = new rc0(2, this);

    public i1(Context context) {
        this.f = context;
        this.i = LayoutInflater.from(context);
    }

    @Override // defpackage.dx
    public final void a(mw mwVar, boolean z) {
        d();
        e1 e1Var = this.y;
        if (e1Var != null && e1Var.b()) {
            e1Var.j.dismiss();
        }
        cx cxVar = this.j;
        if (cxVar != null) {
            cxVar.a(mwVar, z);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r5v4, types: [ex] */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Type inference failed for: r5v7 */
    public final View b(qw qwVar, View view, ViewGroup viewGroup) {
        View actionView = qwVar.getActionView();
        if (actionView == null || qwVar.e()) {
            ActionMenuItemView actionMenuItemView = view instanceof ex ? (ex) view : (ex) this.i.inflate(this.l, viewGroup, false);
            actionMenuItemView.c(qwVar);
            ActionMenuItemView actionMenuItemView2 = actionMenuItemView;
            actionMenuItemView2.setItemInvoker((ActionMenuView) this.m);
            if (this.A == null) {
                this.A = new f1(this);
            }
            actionMenuItemView2.setPopupCallback(this.A);
            actionView = actionMenuItemView;
        }
        actionView.setVisibility(qwVar.C ? 8 : 0);
        ViewGroup.LayoutParams layoutParams = actionView.getLayoutParams();
        ((ActionMenuView) viewGroup).getClass();
        if (!(layoutParams instanceof k1)) {
            actionView.setLayoutParams(ActionMenuView.k(layoutParams));
        }
        return actionView;
    }

    @Override // defpackage.dx
    public final boolean c(qw qwVar) {
        return false;
    }

    public final boolean d() {
        Object obj;
        g1 g1Var = this.z;
        if (g1Var != null && (obj = this.m) != null) {
            ((View) obj).removeCallbacks(g1Var);
            this.z = null;
            return true;
        }
        e1 e1Var = this.x;
        if (e1Var == null) {
            return false;
        }
        if (e1Var.b()) {
            e1Var.j.dismiss();
        }
        return true;
    }

    @Override // defpackage.dx
    public final void e(cx cxVar) {
        throw null;
    }

    @Override // defpackage.dx
    public final boolean f(qw qwVar) {
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.dx
    public final void g() {
        int i;
        ViewGroup viewGroup = (ViewGroup) this.m;
        ArrayList arrayList = null;
        boolean z = false;
        if (viewGroup != null) {
            mw mwVar = this.h;
            if (mwVar != null) {
                mwVar.i();
                ArrayList l = this.h.l();
                int size = l.size();
                i = 0;
                for (int i2 = 0; i2 < size; i2++) {
                    qw qwVar = (qw) l.get(i2);
                    if ((qwVar.x & 32) == 32) {
                        View childAt = viewGroup.getChildAt(i);
                        qw itemData = childAt instanceof ex ? ((ex) childAt).getItemData() : null;
                        View b = b(qwVar, childAt, viewGroup);
                        if (qwVar != itemData) {
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
        mw mwVar2 = this.h;
        if (mwVar2 != null) {
            mwVar2.i();
            ArrayList arrayList2 = mwVar2.i;
            int size2 = arrayList2.size();
            for (int i3 = 0; i3 < size2; i3++) {
                rw rwVar = ((qw) arrayList2.get(i3)).A;
            }
        }
        mw mwVar3 = this.h;
        if (mwVar3 != null) {
            mwVar3.i();
            arrayList = mwVar3.j;
        }
        if (this.q && arrayList != null) {
            int size3 = arrayList.size();
            if (size3 == 1) {
                z = !((qw) arrayList.get(0)).C;
            } else if (size3 > 0) {
                z = true;
            }
        }
        h1 h1Var = this.n;
        if (z) {
            if (h1Var == null) {
                this.n = new h1(this, this.f);
            }
            ViewGroup viewGroup3 = (ViewGroup) this.n.getParent();
            if (viewGroup3 != this.m) {
                if (viewGroup3 != null) {
                    viewGroup3.removeView(this.n);
                }
                ActionMenuView actionMenuView = (ActionMenuView) this.m;
                h1 h1Var2 = this.n;
                actionMenuView.getClass();
                k1 j = ActionMenuView.j();
                j.a = true;
                actionMenuView.addView(h1Var2, j);
            }
        } else if (h1Var != null) {
            Object parent = h1Var.getParent();
            Object obj = this.m;
            if (parent == obj) {
                ((ViewGroup) obj).removeView(this.n);
            }
        }
        ((ActionMenuView) this.m).setOverflowReserved(this.q);
    }

    @Override // defpackage.dx
    public final void h(Context context, mw mwVar) {
        this.g = context;
        LayoutInflater.from(context);
        this.h = mwVar;
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
                h1 h1Var = new h1(this, this.f);
                this.n = h1Var;
                if (this.p) {
                    h1Var.setImageDrawable(this.o);
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
        e1 e1Var = this.x;
        return e1Var != null && e1Var.b();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.dx
    public final boolean j(p70 p70Var) {
        boolean z;
        if (p70Var.hasVisibleItems()) {
            p70 p70Var2 = p70Var;
            while (true) {
                mw mwVar = p70Var2.z;
                if (mwVar == this.h) {
                    break;
                }
                p70Var2 = (p70) mwVar;
            }
            qw qwVar = p70Var2.A;
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
                    if ((childAt instanceof ex) && ((ex) childAt).getItemData() == qwVar) {
                        view = childAt;
                        break;
                    }
                    i++;
                }
            }
            if (view != null) {
                p70Var.A.getClass();
                int size = p70Var.f.size();
                int i2 = 0;
                while (true) {
                    if (i2 >= size) {
                        z = false;
                        break;
                    }
                    MenuItem item = p70Var.getItem(i2);
                    if (item.isVisible() && item.getIcon() != null) {
                        z = true;
                        break;
                    }
                    i2++;
                }
                e1 e1Var = new e1(this, this.g, p70Var, view);
                this.y = e1Var;
                e1Var.h = z;
                vw vwVar = e1Var.j;
                if (vwVar != null) {
                    vwVar.o(z);
                }
                e1 e1Var2 = this.y;
                if (!e1Var2.b()) {
                    if (e1Var2.f == null) {
                        g9.s("MenuPopupHelper cannot be used without an anchor");
                        return false;
                    }
                    e1Var2.d(0, 0, false, false);
                }
                cx cxVar = this.j;
                if (cxVar != null) {
                    cxVar.w(p70Var);
                }
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.dx
    public final boolean k() {
        int i;
        ArrayList arrayList;
        int i2;
        boolean z;
        i1 i1Var = this;
        mw mwVar = i1Var.h;
        if (mwVar != null) {
            arrayList = mwVar.l();
            i = arrayList.size();
        } else {
            i = 0;
            arrayList = null;
        }
        int i3 = i1Var.u;
        int i4 = i1Var.t;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        ViewGroup viewGroup = (ViewGroup) i1Var.m;
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
            qw qwVar = (qw) arrayList.get(i5);
            int i8 = qwVar.y;
            if ((i8 & 2) == 2) {
                i6++;
            } else if ((i8 & 1) == 1) {
                i7++;
            } else {
                z2 = true;
            }
            if (i1Var.v && qwVar.C) {
                i3 = 0;
            }
            i5++;
        }
        if (i1Var.q && (z2 || i7 + i6 > i3)) {
            i3--;
        }
        int i9 = i3 - i6;
        SparseBooleanArray sparseBooleanArray = i1Var.w;
        sparseBooleanArray.clear();
        int i10 = 0;
        int i11 = 0;
        while (i10 < i) {
            qw qwVar2 = (qw) arrayList.get(i10);
            int i12 = qwVar2.y;
            boolean z3 = (i12 & 2) == i2 ? z : false;
            int i13 = qwVar2.b;
            if (z3) {
                View b = i1Var.b(qwVar2, null, viewGroup);
                b.measure(makeMeasureSpec, makeMeasureSpec);
                int measuredWidth = b.getMeasuredWidth();
                i4 -= measuredWidth;
                if (i11 == 0) {
                    i11 = measuredWidth;
                }
                if (i13 != 0) {
                    sparseBooleanArray.put(i13, z);
                }
                qwVar2.f(z);
            } else if ((i12 & 1) == z) {
                boolean z4 = sparseBooleanArray.get(i13);
                boolean z5 = ((i9 > 0 || z4) && i4 > 0) ? z : false;
                if (z5) {
                    View b2 = i1Var.b(qwVar2, null, viewGroup);
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
                        qw qwVar3 = (qw) arrayList.get(i14);
                        if (qwVar3.b == i13) {
                            if ((qwVar3.x & 32) == 32) {
                                i9++;
                            }
                            qwVar3.f(false);
                        }
                    }
                }
                if (z5) {
                    i9--;
                }
                qwVar2.f(z5);
            } else {
                qwVar2.f(false);
                i10++;
                i2 = 2;
                i1Var = this;
                z = true;
            }
            i10++;
            i2 = 2;
            i1Var = this;
            z = true;
        }
        return z;
    }

    public final boolean l() {
        mw mwVar;
        int i = 0;
        if (this.q && !i() && (mwVar = this.h) != null && this.m != null && this.z == null) {
            mwVar.i();
            if (!mwVar.j.isEmpty()) {
                g1 g1Var = new g1(this, new e1(this, this.g, this.h, this.n), i);
                this.z = g1Var;
                ((View) this.m).post(g1Var);
                return true;
            }
        }
        return false;
    }
}
