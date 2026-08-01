package k;

import android.content.Context;
import android.content.ContextWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.WindowManager;
import android.widget.AdapterView;
import androidx.appcompat.view.menu.ExpandedMenuView;

/* compiled from: r8-map-id-cbdb90155a17acee3f5e5c838b1038a1056cff151b1a2a170c159711c8afb558 */
/* loaded from: classes.dex */
public final class i implements y, AdapterView.OnItemClickListener {

    /* renamed from: f, reason: collision with root package name */
    public Context f2201f;

    /* renamed from: g, reason: collision with root package name */
    public LayoutInflater f2202g;
    public m h;
    public ExpandedMenuView i;

    /* renamed from: j, reason: collision with root package name */
    public x f2203j;

    /* renamed from: k, reason: collision with root package name */
    public h f2204k;

    public i(ContextWrapper contextWrapper) {
        this.f2201f = contextWrapper;
        this.f2202g = LayoutInflater.from(contextWrapper);
    }

    @Override // k.y
    public final void a(m mVar, boolean z4) {
        x xVar = this.f2203j;
        if (xVar != null) {
            xVar.a(mVar, z4);
        }
    }

    @Override // k.y
    public final boolean c(o oVar) {
        return false;
    }

    @Override // k.y
    public final boolean d(e0 e0Var) {
        boolean hasVisibleItems = e0Var.hasVisibleItems();
        Context context = e0Var.f2211a;
        if (!hasVisibleItems) {
            return false;
        }
        n nVar = new n();
        nVar.f2232f = e0Var;
        a4.e0 e0Var2 = new a4.e0(context);
        g.b bVar = (g.b) e0Var2.f168b;
        i iVar = new i(bVar.f1470a);
        nVar.h = iVar;
        iVar.f2203j = nVar;
        e0Var.b(iVar, context);
        i iVar2 = nVar.h;
        if (iVar2.f2204k == null) {
            iVar2.f2204k = new h(iVar2);
        }
        bVar.f1477k = iVar2.f2204k;
        bVar.f1478l = nVar;
        View view = e0Var.f2222o;
        if (view != null) {
            bVar.f1473e = view;
        } else {
            bVar.f1472c = e0Var.f2221n;
            bVar.d = e0Var.f2220m;
        }
        bVar.f1476j = nVar;
        g.f b2 = e0Var2.b();
        nVar.f2233g = b2;
        b2.setOnDismissListener(nVar);
        WindowManager.LayoutParams attributes = nVar.f2233g.getWindow().getAttributes();
        attributes.type = 1003;
        attributes.flags |= 131072;
        nVar.f2233g.show();
        x xVar = this.f2203j;
        if (xVar == null) {
            return true;
        }
        xVar.n(e0Var);
        return true;
    }

    @Override // k.y
    public final boolean f(o oVar) {
        return false;
    }

    @Override // k.y
    public final void g() {
        h hVar = this.f2204k;
        if (hVar != null) {
            hVar.notifyDataSetChanged();
        }
    }

    @Override // k.y
    public final void i(x xVar) {
        throw null;
    }

    @Override // k.y
    public final void j(Context context, m mVar) {
        if (this.f2201f != null) {
            this.f2201f = context;
            if (this.f2202g == null) {
                this.f2202g = LayoutInflater.from(context);
            }
        }
        this.h = mVar;
        h hVar = this.f2204k;
        if (hVar != null) {
            hVar.notifyDataSetChanged();
        }
    }

    @Override // k.y
    public final boolean k() {
        return false;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j2) {
        this.h.q(this.f2204k.getItem(i), this, 0);
    }
}
