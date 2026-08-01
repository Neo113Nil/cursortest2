package k;

import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.WindowManager;
import android.widget.AdapterView;
import androidx.appcompat.view.menu.ExpandedMenuView;

/* compiled from: r8-map-id-fb2637cf2a71147074b02d847622f707cfc12821f1b81d08e7915f8e7b9519ab */
/* loaded from: classes.dex */
public final class i implements y, AdapterView.OnItemClickListener {

    /* renamed from: f, reason: collision with root package name */
    public Context f2049f;

    /* renamed from: g, reason: collision with root package name */
    public LayoutInflater f2050g;

    /* renamed from: h, reason: collision with root package name */
    public m f2051h;
    public ExpandedMenuView i;

    /* renamed from: j, reason: collision with root package name */
    public x f2052j;

    /* renamed from: k, reason: collision with root package name */
    public h f2053k;

    public i(ContextWrapper contextWrapper) {
        this.f2049f = contextWrapper;
        this.f2050g = LayoutInflater.from(contextWrapper);
    }

    @Override // k.y
    public final void a(m mVar, boolean z3) {
        x xVar = this.f2052j;
        if (xVar != null) {
            xVar.a(mVar, z3);
        }
    }

    @Override // k.y
    public final boolean c(o oVar) {
        return false;
    }

    @Override // k.y
    public final boolean d(e0 e0Var) {
        boolean hasVisibleItems = e0Var.hasVisibleItems();
        Context context = e0Var.f2060a;
        if (!hasVisibleItems) {
            return false;
        }
        n nVar = new n();
        nVar.f2082f = e0Var;
        g.f fVar = new g.f(context);
        g.b bVar = (g.b) fVar.f1632g;
        i iVar = new i(bVar.f1558a);
        nVar.f2084h = iVar;
        iVar.f2052j = nVar;
        e0Var.b(iVar, context);
        i iVar2 = nVar.f2084h;
        if (iVar2.f2053k == null) {
            iVar2.f2053k = new h(iVar2);
        }
        bVar.f1563g = iVar2.f2053k;
        bVar.f1564h = nVar;
        View view = e0Var.f2072o;
        if (view != null) {
            bVar.f1561e = view;
        } else {
            bVar.f1560c = e0Var.f2071n;
            bVar.d = e0Var.f2070m;
        }
        bVar.f1562f = nVar;
        g.g a2 = fVar.a();
        nVar.f2083g = a2;
        a2.setOnDismissListener(nVar);
        WindowManager.LayoutParams attributes = nVar.f2083g.getWindow().getAttributes();
        attributes.type = 1003;
        attributes.flags |= 131072;
        nVar.f2083g.show();
        x xVar = this.f2052j;
        if (xVar == null) {
            return true;
        }
        xVar.d(e0Var);
        return true;
    }

    @Override // k.y
    public final boolean e(o oVar) {
        return false;
    }

    @Override // k.y
    public final void g(Context context, m mVar) {
        if (this.f2049f != null) {
            this.f2049f = context;
            if (this.f2050g == null) {
                this.f2050g = LayoutInflater.from(context);
            }
        }
        this.f2051h = mVar;
        h hVar = this.f2053k;
        if (hVar != null) {
            hVar.notifyDataSetChanged();
        }
    }

    @Override // k.y
    public final int getId() {
        return 0;
    }

    @Override // k.y
    public final boolean h() {
        return false;
    }

    @Override // k.y
    public final Parcelable i() {
        if (this.i == null) {
            return null;
        }
        Bundle bundle = new Bundle();
        SparseArray<Parcelable> sparseArray = new SparseArray<>();
        ExpandedMenuView expandedMenuView = this.i;
        if (expandedMenuView != null) {
            expandedMenuView.saveHierarchyState(sparseArray);
        }
        bundle.putSparseParcelableArray("android:menu:list", sparseArray);
        return bundle;
    }

    @Override // k.y
    public final void j(Parcelable parcelable) {
        SparseArray<Parcelable> sparseParcelableArray = ((Bundle) parcelable).getSparseParcelableArray("android:menu:list");
        if (sparseParcelableArray != null) {
            this.i.restoreHierarchyState(sparseParcelableArray);
        }
    }

    @Override // k.y
    public final void l(x xVar) {
        throw null;
    }

    @Override // k.y
    public final void m(boolean z3) {
        h hVar = this.f2053k;
        if (hVar != null) {
            hVar.notifyDataSetChanged();
        }
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j4) {
        this.f2051h.q(this.f2053k.getItem(i), this, 0);
    }
}
