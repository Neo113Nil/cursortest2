package j;

import android.content.Context;
import android.content.ContextWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.WindowManager;
import android.widget.AdapterView;
import androidx.appcompat.view.menu.ExpandedMenuView;

/* compiled from: r8-map-id-72a2021f0a77848162657eed404f056d03742612a99b9acca4b8f3bd8ed17555 */
/* loaded from: classes.dex */
public final class i implements y, AdapterView.OnItemClickListener {

    /* renamed from: f, reason: collision with root package name */
    public Context f2179f;
    public LayoutInflater g;
    public m h;

    /* renamed from: i, reason: collision with root package name */
    public ExpandedMenuView f2180i;

    /* renamed from: j, reason: collision with root package name */
    public x f2181j;

    /* renamed from: k, reason: collision with root package name */
    public h f2182k;

    public i(ContextWrapper contextWrapper) {
        this.f2179f = contextWrapper;
        this.g = LayoutInflater.from(contextWrapper);
    }

    @Override // j.y
    public final void a(m mVar, boolean z3) {
        x xVar = this.f2181j;
        if (xVar != null) {
            xVar.a(mVar, z3);
        }
    }

    @Override // j.y
    public final boolean d(o oVar) {
        return false;
    }

    @Override // j.y
    public final void e() {
        h hVar = this.f2182k;
        if (hVar != null) {
            hVar.notifyDataSetChanged();
        }
    }

    @Override // j.y
    public final void g(Context context, m mVar) {
        if (this.f2179f != null) {
            this.f2179f = context;
            if (this.g == null) {
                this.g = LayoutInflater.from(context);
            }
        }
        this.h = mVar;
        h hVar = this.f2182k;
        if (hVar != null) {
            hVar.notifyDataSetChanged();
        }
    }

    @Override // j.y
    public final boolean h() {
        return false;
    }

    @Override // j.y
    public final boolean i(o oVar) {
        return false;
    }

    @Override // j.y
    public final void j(x xVar) {
        throw null;
    }

    @Override // j.y
    public final boolean k(e0 e0Var) {
        boolean hasVisibleItems = e0Var.hasVisibleItems();
        Context context = e0Var.f2189a;
        if (!hasVisibleItems) {
            return false;
        }
        n nVar = new n();
        nVar.f2210f = e0Var;
        f.f fVar = new f.f(context);
        f.b bVar = (f.b) fVar.g;
        i iVar = new i(bVar.f1534a);
        nVar.h = iVar;
        iVar.f2181j = nVar;
        e0Var.b(iVar, context);
        i iVar2 = nVar.h;
        if (iVar2.f2182k == null) {
            iVar2.f2182k = new h(iVar2);
        }
        bVar.g = iVar2.f2182k;
        bVar.h = nVar;
        View view = e0Var.f2200o;
        if (view != null) {
            bVar.f1537e = view;
        } else {
            bVar.c = e0Var.f2199n;
            bVar.f1536d = e0Var.f2198m;
        }
        bVar.f1538f = nVar;
        f.g a4 = fVar.a();
        nVar.g = a4;
        a4.setOnDismissListener(nVar);
        WindowManager.LayoutParams attributes = nVar.g.getWindow().getAttributes();
        attributes.type = 1003;
        attributes.flags |= 131072;
        nVar.g.show();
        x xVar = this.f2181j;
        if (xVar == null) {
            return true;
        }
        xVar.i(e0Var);
        return true;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i4, long j4) {
        this.h.q(this.f2182k.getItem(i4), this, 0);
    }
}
