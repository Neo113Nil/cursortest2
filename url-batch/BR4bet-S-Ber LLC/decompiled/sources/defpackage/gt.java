package defpackage;

import android.content.Context;
import android.content.ContextWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.WindowManager;
import android.widget.AdapterView;
import androidx.appcompat.view.menu.ExpandedMenuView;

/* compiled from: r8-map-id-de38bb36dc2361356cb83b4c675dbcd2450924cecdb12a3272c608759c381a50 */
/* loaded from: classes.dex */
public final class gt implements dx, AdapterView.OnItemClickListener {
    public Context f;
    public LayoutInflater g;
    public mw h;
    public ExpandedMenuView i;
    public cx j;
    public ft k;

    public gt(ContextWrapper contextWrapper) {
        this.f = contextWrapper;
        this.g = LayoutInflater.from(contextWrapper);
    }

    @Override // defpackage.dx
    public final void a(mw mwVar, boolean z) {
        cx cxVar = this.j;
        if (cxVar != null) {
            cxVar.a(mwVar, z);
        }
    }

    @Override // defpackage.dx
    public final boolean c(qw qwVar) {
        return false;
    }

    @Override // defpackage.dx
    public final void e(cx cxVar) {
        throw null;
    }

    @Override // defpackage.dx
    public final boolean f(qw qwVar) {
        return false;
    }

    @Override // defpackage.dx
    public final void g() {
        ft ftVar = this.k;
        if (ftVar != null) {
            ftVar.notifyDataSetChanged();
        }
    }

    @Override // defpackage.dx
    public final void h(Context context, mw mwVar) {
        if (this.f != null) {
            this.f = context;
            if (this.g == null) {
                this.g = LayoutInflater.from(context);
            }
        }
        this.h = mwVar;
        ft ftVar = this.k;
        if (ftVar != null) {
            ftVar.notifyDataSetChanged();
        }
    }

    @Override // defpackage.dx
    public final boolean j(p70 p70Var) {
        boolean hasVisibleItems = p70Var.hasVisibleItems();
        Context context = p70Var.a;
        if (!hasVisibleItems) {
            return false;
        }
        nw nwVar = new nw();
        nwVar.f = p70Var;
        l2 l2Var = new l2(context);
        h2 h2Var = (h2) l2Var.g;
        gt gtVar = new gt(h2Var.a);
        nwVar.h = gtVar;
        gtVar.j = nwVar;
        p70Var.b(gtVar, context);
        gt gtVar2 = nwVar.h;
        if (gtVar2.k == null) {
            gtVar2.k = new ft(gtVar2);
        }
        h2Var.l = gtVar2.k;
        h2Var.m = nwVar;
        View view = p70Var.o;
        if (view != null) {
            h2Var.e = view;
        } else {
            h2Var.c = p70Var.n;
            h2Var.d = p70Var.m;
        }
        h2Var.k = nwVar;
        m2 b = l2Var.b();
        nwVar.g = b;
        b.setOnDismissListener(nwVar);
        WindowManager.LayoutParams attributes = nwVar.g.getWindow().getAttributes();
        attributes.type = 1003;
        attributes.flags |= 131072;
        nwVar.g.show();
        cx cxVar = this.j;
        if (cxVar == null) {
            return true;
        }
        cxVar.w(p70Var);
        return true;
    }

    @Override // defpackage.dx
    public final boolean k() {
        return false;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        this.h.q(this.k.getItem(i), this, 0);
    }
}
