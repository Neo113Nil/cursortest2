package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.os.Parcelable;
import android.support.v7.view.menu.ActionMenuItemView;
import android.support.v7.widget.ActionMenuView;
import android.util.SparseBooleanArray;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.authenticator2.R;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class hk extends fs {
    hh h;
    public int i;
    public hi j;
    public hf k;
    public int l;
    public cns m;
    final dx n;
    private boolean o;
    private boolean p;
    private int q;
    private int r;
    private boolean s;
    private final SparseBooleanArray t;
    private kee u;

    public hk(Context context) {
        super(context);
        this.t = new SparseBooleanArray();
        this.n = new dx(this, 2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r5v4, types: [gq] */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Type inference failed for: r5v7 */
    @Override // defpackage.fs
    public final View b(gf gfVar, View view, ViewGroup viewGroup) {
        View actionView = gfVar.getActionView();
        if (actionView == null || gfVar.m()) {
            ActionMenuItemView actionMenuItemView = view instanceof gq ? (gq) view : (gq) this.d.inflate(R.layout.abc_action_menu_item_layout, viewGroup, false);
            actionMenuItemView.f(gfVar);
            ActionMenuItemView actionMenuItemView2 = actionMenuItemView;
            actionMenuItemView2.b = (ActionMenuView) this.f;
            kee keeVar = this.u;
            if (keeVar == null) {
                keeVar = new kee(this);
                this.u = keeVar;
            }
            actionMenuItemView2.c = keeVar;
            actionView = actionMenuItemView;
        }
        actionView.setVisibility(true == gfVar.o ? 8 : 0);
        ViewGroup.LayoutParams layoutParams = actionView.getLayoutParams();
        if (!(layoutParams instanceof hn)) {
            actionView.setLayoutParams(ActionMenuView.o(layoutParams));
        }
        return actionView;
    }

    @Override // defpackage.gp
    public final Parcelable bh() {
        hj hjVar = new hj();
        hjVar.a = this.l;
        return hjVar;
    }

    @Override // defpackage.fs, defpackage.gp
    public final void c(Context context, gd gdVar) {
        this.b = context;
        LayoutInflater.from(this.b);
        this.c = gdVar;
        Resources resources = context.getResources();
        if (!this.p) {
            this.o = true;
        }
        this.q = context.getResources().getDisplayMetrics().widthPixels / 2;
        this.i = e.d(context);
        int i = this.q;
        if (this.o) {
            if (this.h == null) {
                this.h = new hh(this, this.a);
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
                this.h.measure(makeMeasureSpec, makeMeasureSpec);
            }
            i -= this.h.getMeasuredWidth();
        } else {
            this.h = null;
        }
        this.r = i;
        float f = resources.getDisplayMetrics().density;
    }

    @Override // defpackage.fs, defpackage.gp
    public final void d(gd gdVar, boolean z) {
        p();
        go goVar = this.e;
        if (goVar != null) {
            goVar.a(gdVar, z);
        }
    }

    @Override // defpackage.fs, defpackage.gp
    public final boolean f() {
        ArrayList arrayList;
        int i;
        boolean z;
        boolean z2;
        boolean z3;
        gd gdVar = this.c;
        View view = null;
        boolean z4 = false;
        if (gdVar != null) {
            arrayList = gdVar.f();
            i = arrayList.size();
        } else {
            arrayList = null;
            i = 0;
        }
        int i2 = this.i;
        int i3 = this.r;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        ViewGroup viewGroup = (ViewGroup) this.f;
        int i4 = 0;
        boolean z5 = false;
        int i5 = 0;
        int i6 = 0;
        while (true) {
            z = true;
            if (i4 >= i) {
                break;
            }
            gf gfVar = (gf) arrayList.get(i4);
            if (gfVar.r()) {
                i5++;
            } else if (gfVar.q()) {
                i6++;
            } else {
                z5 = true;
            }
            if (this.s && gfVar.o) {
                i2 = 0;
            }
            i4++;
        }
        if (this.o && (z5 || i6 + i5 > i2)) {
            i2--;
        }
        int i7 = i2 - i5;
        SparseBooleanArray sparseBooleanArray = this.t;
        sparseBooleanArray.clear();
        int i8 = 0;
        int i9 = 0;
        while (i8 < i) {
            gf gfVar2 = (gf) arrayList.get(i8);
            if (gfVar2.r()) {
                View b = b(gfVar2, view, viewGroup);
                b.measure(makeMeasureSpec, makeMeasureSpec);
                int measuredWidth = b.getMeasuredWidth();
                i3 -= measuredWidth;
                if (i9 == 0) {
                    i9 = measuredWidth;
                }
                int i10 = gfVar2.b;
                if (i10 != 0) {
                    sparseBooleanArray.put(i10, z);
                }
                gfVar2.k(z);
                z2 = z4;
                z3 = z;
            } else if (gfVar2.q()) {
                int i11 = gfVar2.b;
                boolean z6 = sparseBooleanArray.get(i11);
                boolean z7 = ((i7 > 0 || z6) && i3 > 0) ? z : z4;
                if (z7) {
                    View b2 = b(gfVar2, view, viewGroup);
                    b2.measure(makeMeasureSpec, makeMeasureSpec);
                    int measuredWidth2 = b2.getMeasuredWidth();
                    i3 -= measuredWidth2;
                    if (i9 == 0) {
                        i9 = measuredWidth2;
                    }
                    z7 = i3 + i9 > 0 ? z : false;
                }
                boolean z8 = z7;
                if (z8 && i11 != 0) {
                    sparseBooleanArray.put(i11, z);
                } else if (z6) {
                    sparseBooleanArray.put(i11, false);
                    int i12 = 0;
                    while (i12 < i8) {
                        gf gfVar3 = (gf) arrayList.get(i12);
                        boolean z9 = z;
                        if (gfVar3.b == i11) {
                            if (gfVar3.o()) {
                                i7++;
                            }
                            gfVar3.k(false);
                        }
                        i12++;
                        z = z9;
                    }
                }
                z3 = z;
                if (z8) {
                    i7--;
                }
                gfVar2.k(z8);
                z2 = false;
            } else {
                z2 = z4;
                z3 = z;
                gfVar2.k(z2);
            }
            i8++;
            z4 = z2;
            z = z3;
            view = null;
        }
        return z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v1, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r9v3, types: [gd] */
    @Override // defpackage.fs, defpackage.gp
    public final boolean g(gw gwVar) {
        boolean z = false;
        if (!gwVar.hasVisibleItems()) {
            return false;
        }
        gw gwVar2 = gwVar;
        while (true) {
            gd gdVar = gwVar2.l;
            if (gdVar == this.c) {
                break;
            }
            gwVar2 = (gw) gdVar;
        }
        gf gfVar = gwVar2.m;
        ViewGroup viewGroup = (ViewGroup) this.f;
        View view = null;
        if (viewGroup != null) {
            int childCount = viewGroup.getChildCount();
            int i = 0;
            while (true) {
                if (i >= childCount) {
                    break;
                }
                ?? childAt = viewGroup.getChildAt(i);
                if ((childAt instanceof gq) && ((gq) childAt).a() == gfVar) {
                    view = childAt;
                    break;
                }
                i++;
            }
        }
        if (view == null) {
            return false;
        }
        this.l = gwVar.m.a;
        int size = gwVar.size();
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                break;
            }
            MenuItem item = gwVar.getItem(i2);
            if (item.isVisible() && item.getIcon() != null) {
                z = true;
                break;
            }
            i2++;
        }
        hf hfVar = new hf(this, this.b, gwVar, view);
        this.k = hfVar;
        hfVar.d(z);
        if (!this.k.h()) {
            throw new IllegalStateException("MenuPopupHelper cannot be used without an anchor");
        }
        go goVar = this.e;
        gw gwVar3 = gwVar;
        if (goVar != null) {
            if (gwVar == null) {
                gwVar3 = this.c;
            }
            goVar.b(gwVar3);
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.fs, defpackage.gp
    public final void j() {
        int i;
        ViewGroup viewGroup = (ViewGroup) this.f;
        boolean z = false;
        if (viewGroup != null) {
            gd gdVar = this.c;
            if (gdVar != null) {
                gdVar.k();
                ArrayList f = this.c.f();
                int size = f.size();
                i = 0;
                for (int i2 = 0; i2 < size; i2++) {
                    gf gfVar = (gf) f.get(i2);
                    if (gfVar.o()) {
                        View childAt = viewGroup.getChildAt(i);
                        gf a = childAt instanceof gq ? ((gq) childAt).a() : null;
                        View b = b(gfVar, childAt, viewGroup);
                        if (gfVar != a) {
                            b.setPressed(false);
                            b.jumpDrawablesToCurrentState();
                        }
                        if (b != childAt) {
                            ViewGroup viewGroup2 = (ViewGroup) b.getParent();
                            if (viewGroup2 != null) {
                                viewGroup2.removeView(b);
                            }
                            ((ViewGroup) this.f).addView(b, i);
                        }
                        i++;
                    }
                }
            } else {
                i = 0;
            }
            while (i < viewGroup.getChildCount()) {
                if (viewGroup.getChildAt(i) == this.h) {
                    i++;
                } else {
                    viewGroup.removeViewAt(i);
                }
            }
        }
        ((View) this.f).requestLayout();
        gd gdVar2 = this.c;
        if (gdVar2 != null) {
            gdVar2.k();
            ArrayList arrayList = gdVar2.d;
            int size2 = arrayList.size();
            for (int i3 = 0; i3 < size2; i3++) {
                tw twVar = ((gf) arrayList.get(i3)).p;
            }
        }
        gd gdVar3 = this.c;
        ArrayList e = gdVar3 != null ? gdVar3.e() : null;
        if (this.o && e != null) {
            int size3 = e.size();
            if (size3 == 1) {
                z = !((gf) e.get(0)).o;
            } else if (size3 > 0) {
                z = true;
            }
            if (z) {
                hh hhVar = this.h;
                if (hhVar == null) {
                    hh hhVar2 = new hh(this, this.a);
                    this.h = hhVar2;
                    hhVar = hhVar2;
                }
                ViewGroup viewGroup3 = (ViewGroup) hhVar.getParent();
                if (viewGroup3 != this.f) {
                    if (viewGroup3 != null) {
                        viewGroup3.removeView(this.h);
                    }
                    ActionMenuView actionMenuView = (ActionMenuView) this.f;
                    hh hhVar3 = this.h;
                    hn n = ActionMenuView.n();
                    n.a = true;
                    actionMenuView.addView(hhVar3, n);
                }
                ((ActionMenuView) this.f).b = this.o;
            }
        }
        hh hhVar4 = this.h;
        if (hhVar4 != null) {
            Object parent = hhVar4.getParent();
            Object obj = this.f;
            if (parent == obj) {
                ((ViewGroup) obj).removeView(this.h);
            }
        }
        ((ActionMenuView) this.f).b = this.o;
    }

    public final void k(ActionMenuView actionMenuView) {
        this.f = actionMenuView;
        actionMenuView.a = this.c;
    }

    public final boolean l() {
        Object obj;
        cns cnsVar = this.m;
        if (cnsVar != null && (obj = this.f) != null) {
            ((View) obj).removeCallbacks(cnsVar);
            this.m = null;
            return true;
        }
        hi hiVar = this.j;
        if (hiVar == null) {
            return false;
        }
        hiVar.b();
        return true;
    }

    public final boolean m() {
        hi hiVar = this.j;
        return hiVar != null && hiVar.g();
    }

    @Override // defpackage.gp
    public final void n(Parcelable parcelable) {
        int i;
        MenuItem findItem;
        if ((parcelable instanceof hj) && (i = ((hj) parcelable).a) > 0 && (findItem = this.c.findItem(i)) != null) {
            g((gw) findItem.getSubMenu());
        }
    }

    public final boolean o() {
        gd gdVar;
        if (!this.o || m() || (gdVar = this.c) == null || this.f == null || this.m != null || gdVar.e().isEmpty()) {
            return false;
        }
        this.m = new cns(this, new hi(this, this.b, this.c, this.h), 1);
        ((View) this.f).post(this.m);
        return true;
    }

    public final void p() {
        l();
        s();
    }

    public final void q() {
        this.s = true;
    }

    public final void r() {
        this.o = true;
        this.p = true;
    }

    public final void s() {
        hf hfVar = this.k;
        if (hfVar != null) {
            hfVar.b();
        }
    }
}
