package defpackage;

import android.content.Context;
import android.content.ContextWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.WindowManager;
import android.widget.AdapterView;
import androidx.appcompat.view.menu.ExpandedMenuView;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class qe1 implements zk1, AdapterView.OnItemClickListener {
    public Context m;
    public LayoutInflater n;
    public fk1 o;
    public ExpandedMenuView p;
    public yk1 q;
    public pe1 r;

    public qe1(ContextWrapper contextWrapper) {
        this.m = contextWrapper;
        this.n = LayoutInflater.from(contextWrapper);
    }

    @Override // defpackage.zk1
    public final void b(fk1 fk1Var, boolean z) {
        yk1 yk1Var = this.q;
        if (yk1Var != null) {
            yk1Var.b(fk1Var, z);
        }
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

    @Override // defpackage.zk1
    public final void g() {
        pe1 pe1Var = this.r;
        if (pe1Var != null) {
            pe1Var.notifyDataSetChanged();
        }
    }

    @Override // defpackage.zk1
    public final void i(Context context, fk1 fk1Var) {
        if (this.m != null) {
            this.m = context;
            if (this.n == null) {
                this.n = LayoutInflater.from(context);
            }
        }
        this.o = fk1Var;
        pe1 pe1Var = this.r;
        if (pe1Var != null) {
            pe1Var.notifyDataSetChanged();
        }
    }

    @Override // defpackage.zk1
    public final boolean j(cq2 cq2Var) {
        boolean hasVisibleItems = cq2Var.hasVisibleItems();
        Context context = cq2Var.a;
        if (!hasVisibleItems) {
            return false;
        }
        gk1 gk1Var = new gk1();
        gk1Var.m = cq2Var;
        r5 r5Var = new r5(context);
        n5 n5Var = (n5) r5Var.b;
        qe1 qe1Var = new qe1(n5Var.a);
        gk1Var.o = qe1Var;
        qe1Var.q = gk1Var;
        cq2Var.b(qe1Var, context);
        qe1 qe1Var2 = gk1Var.o;
        if (qe1Var2.r == null) {
            qe1Var2.r = new pe1(qe1Var2);
        }
        n5Var.g = qe1Var2.r;
        n5Var.h = gk1Var;
        View view = cq2Var.o;
        if (view != null) {
            n5Var.e = view;
        } else {
            n5Var.c = cq2Var.n;
            n5Var.d = cq2Var.m;
        }
        n5Var.f = gk1Var;
        s5 d = r5Var.d();
        gk1Var.n = d;
        d.setOnDismissListener(gk1Var);
        WindowManager.LayoutParams attributes = gk1Var.n.getWindow().getAttributes();
        attributes.type = 1003;
        attributes.flags |= 131072;
        gk1Var.n.show();
        yk1 yk1Var = this.q;
        if (yk1Var == null) {
            return true;
        }
        yk1Var.o(cq2Var);
        return true;
    }

    @Override // defpackage.zk1
    public final boolean k() {
        return false;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        this.o.q(this.r.getItem(i), this, 0);
    }
}
