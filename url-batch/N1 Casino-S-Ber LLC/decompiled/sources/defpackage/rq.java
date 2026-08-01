package defpackage;

import android.content.Context;
import android.content.ContextWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.WindowManager;
import android.widget.AdapterView;
import androidx.appcompat.view.menu.ExpandedMenuView;

/* compiled from: r8-map-id-f21f5e89e3d3d92eca33bfe12a7775f49cadfb54340e756eb509706243ac6f5c */
/* loaded from: classes.dex */
public final class rq implements cu, AdapterView.OnItemClickListener {
    public Context f;
    public LayoutInflater g;
    public mt h;
    public ExpandedMenuView i;
    public bu j;
    public qq k;

    public rq(ContextWrapper contextWrapper) {
        this.f = contextWrapper;
        this.g = LayoutInflater.from(contextWrapper);
    }

    @Override // defpackage.cu
    public final void a(mt mtVar, boolean z) {
        bu buVar = this.j;
        if (buVar != null) {
            buVar.a(mtVar, z);
        }
    }

    @Override // defpackage.cu
    public final boolean c(pt ptVar) {
        return false;
    }

    @Override // defpackage.cu
    public final void e(bu buVar) {
        throw null;
    }

    @Override // defpackage.cu
    public final boolean f(pt ptVar) {
        return false;
    }

    @Override // defpackage.cu
    public final void g() {
        qq qqVar = this.k;
        if (qqVar != null) {
            qqVar.notifyDataSetChanged();
        }
    }

    @Override // defpackage.cu
    public final void i(Context context, mt mtVar) {
        if (this.f != null) {
            this.f = context;
            if (this.g == null) {
                this.g = LayoutInflater.from(context);
            }
        }
        this.h = mtVar;
        qq qqVar = this.k;
        if (qqVar != null) {
            qqVar.notifyDataSetChanged();
        }
    }

    @Override // defpackage.cu
    public final boolean j(m40 m40Var) {
        boolean hasVisibleItems = m40Var.hasVisibleItems();
        Context context = m40Var.a;
        if (!hasVisibleItems) {
            return false;
        }
        nt ntVar = new nt();
        ntVar.f = m40Var;
        or orVar = new or(context);
        b2 b2Var = (b2) orVar.g;
        rq rqVar = new rq(b2Var.a);
        ntVar.h = rqVar;
        rqVar.j = ntVar;
        m40Var.b(rqVar, context);
        rq rqVar2 = ntVar.h;
        if (rqVar2.k == null) {
            rqVar2.k = new qq(rqVar2);
        }
        b2Var.g = rqVar2.k;
        b2Var.h = ntVar;
        View view = m40Var.o;
        if (view != null) {
            b2Var.e = view;
        } else {
            b2Var.c = m40Var.n;
            b2Var.d = m40Var.m;
        }
        b2Var.f = ntVar;
        f2 e = orVar.e();
        ntVar.g = e;
        e.setOnDismissListener(ntVar);
        WindowManager.LayoutParams attributes = ntVar.g.getWindow().getAttributes();
        attributes.type = 1003;
        attributes.flags |= 131072;
        ntVar.g.show();
        bu buVar = this.j;
        if (buVar == null) {
            return true;
        }
        buVar.x(m40Var);
        return true;
    }

    @Override // defpackage.cu
    public final boolean k() {
        return false;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        this.h.q(this.k.getItem(i), this, 0);
    }
}
