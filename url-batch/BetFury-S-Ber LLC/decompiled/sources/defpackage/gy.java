package defpackage;

import android.content.Context;
import android.content.ContextWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.WindowManager;
import android.widget.AdapterView;
import androidx.appcompat.view.menu.ExpandedMenuView;

/* compiled from: r8-map-id-555d5e190d9a27a9a8404de93c25a29c9fbe11559b3463c92c68ce527c1de619 */
/* loaded from: classes.dex */
public final class gy implements h20, AdapterView.OnItemClickListener {
    public Context f;
    public LayoutInflater g;
    public r10 h;
    public ExpandedMenuView i;
    public g20 j;
    public fy k;

    public gy(ContextWrapper contextWrapper) {
        this.f = contextWrapper;
        this.g = LayoutInflater.from(contextWrapper);
    }

    @Override // defpackage.h20
    public final void a(r10 r10Var, boolean z) {
        g20 g20Var = this.j;
        if (g20Var != null) {
            g20Var.a(r10Var, z);
        }
    }

    @Override // defpackage.h20
    public final boolean c(u10 u10Var) {
        return false;
    }

    @Override // defpackage.h20
    public final void e(g20 g20Var) {
        throw null;
    }

    @Override // defpackage.h20
    public final boolean f(u10 u10Var) {
        return false;
    }

    @Override // defpackage.h20
    public final void g() {
        fy fyVar = this.k;
        if (fyVar != null) {
            fyVar.notifyDataSetChanged();
        }
    }

    @Override // defpackage.h20
    public final void h(Context context, r10 r10Var) {
        if (this.f != null) {
            this.f = context;
            if (this.g == null) {
                this.g = LayoutInflater.from(context);
            }
        }
        this.h = r10Var;
        fy fyVar = this.k;
        if (fyVar != null) {
            fyVar.notifyDataSetChanged();
        }
    }

    @Override // defpackage.h20
    public final boolean j(wf0 wf0Var) {
        boolean hasVisibleItems = wf0Var.hasVisibleItems();
        Context context = wf0Var.a;
        if (!hasVisibleItems) {
            return false;
        }
        s10 s10Var = new s10();
        s10Var.f = wf0Var;
        u2 u2Var = new u2(context);
        q2 q2Var = (q2) u2Var.g;
        gy gyVar = new gy(q2Var.a);
        s10Var.h = gyVar;
        gyVar.j = s10Var;
        wf0Var.b(gyVar, context);
        gy gyVar2 = s10Var.h;
        if (gyVar2.k == null) {
            gyVar2.k = new fy(gyVar2);
        }
        q2Var.g = gyVar2.k;
        q2Var.h = s10Var;
        View view = wf0Var.o;
        if (view != null) {
            q2Var.e = view;
        } else {
            q2Var.c = wf0Var.n;
            q2Var.d = wf0Var.m;
        }
        q2Var.f = s10Var;
        v2 a = u2Var.a();
        s10Var.g = a;
        a.setOnDismissListener(s10Var);
        WindowManager.LayoutParams attributes = s10Var.g.getWindow().getAttributes();
        attributes.type = 1003;
        attributes.flags |= 131072;
        s10Var.g.show();
        g20 g20Var = this.j;
        if (g20Var == null) {
            return true;
        }
        g20Var.t(wf0Var);
        return true;
    }

    @Override // defpackage.h20
    public final boolean k() {
        return false;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        this.h.q(this.k.getItem(i), this, 0);
    }
}
