package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import android.support.v7.view.menu.ExpandedMenuView;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.WindowManager;
import android.widget.AdapterView;
import android.widget.ListAdapter;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class fz implements AdapterView.OnItemClickListener, gp {
    Context a;
    public LayoutInflater b;
    gd c;
    public ExpandedMenuView d;
    public go e;
    public fy f;

    public fz(Context context) {
        this.a = context;
        this.b = LayoutInflater.from(context);
    }

    @Override // defpackage.gp
    public final int a() {
        return 0;
    }

    @Override // defpackage.gp
    public final Parcelable bh() {
        if (this.d == null) {
            return null;
        }
        Bundle bundle = new Bundle();
        SparseArray<Parcelable> sparseArray = new SparseArray<>();
        ExpandedMenuView expandedMenuView = this.d;
        if (expandedMenuView != null) {
            expandedMenuView.saveHierarchyState(sparseArray);
        }
        bundle.putSparseParcelableArray("android:menu:list", sparseArray);
        return bundle;
    }

    @Override // defpackage.gp
    public final void c(Context context, gd gdVar) {
        if (this.a != null) {
            this.a = context;
            if (this.b == null) {
                this.b = LayoutInflater.from(context);
            }
        }
        this.c = gdVar;
        fy fyVar = this.f;
        if (fyVar != null) {
            fyVar.notifyDataSetChanged();
        }
    }

    @Override // defpackage.gp
    public final void d(gd gdVar, boolean z) {
        go goVar = this.e;
        if (goVar != null) {
            goVar.a(gdVar, z);
        }
    }

    @Override // defpackage.gp
    public final void e(go goVar) {
        throw null;
    }

    @Override // defpackage.gp
    public final boolean f() {
        return false;
    }

    @Override // defpackage.gp
    public final boolean g(gw gwVar) {
        if (!gwVar.hasVisibleItems()) {
            return false;
        }
        ge geVar = new ge(gwVar);
        gd gdVar = geVar.a;
        df dfVar = new df(gdVar.a);
        geVar.c = new fz(dfVar.a());
        fz fzVar = geVar.c;
        fzVar.e = geVar;
        gdVar.g(fzVar);
        ListAdapter k = geVar.c.k();
        db dbVar = dfVar.a;
        dbVar.r = k;
        dbVar.s = geVar;
        View view = gdVar.g;
        if (view != null) {
            dbVar.f = view;
        } else {
            dfVar.c(gdVar.f);
            dfVar.g(gdVar.e);
        }
        dbVar.p = geVar;
        geVar.b = dfVar.b();
        geVar.b.setOnDismissListener(geVar);
        WindowManager.LayoutParams attributes = geVar.b.getWindow().getAttributes();
        attributes.type = 1003;
        attributes.flags |= 131072;
        geVar.b.show();
        go goVar = this.e;
        if (goVar == null) {
            return true;
        }
        goVar.b(gwVar);
        return true;
    }

    @Override // defpackage.gp
    public final boolean h(gf gfVar) {
        return false;
    }

    @Override // defpackage.gp
    public final boolean i(gf gfVar) {
        return false;
    }

    @Override // defpackage.gp
    public final void j() {
        fy fyVar = this.f;
        if (fyVar != null) {
            fyVar.notifyDataSetChanged();
        }
    }

    public final ListAdapter k() {
        fy fyVar = this.f;
        if (fyVar != null) {
            return fyVar;
        }
        fy fyVar2 = new fy(this);
        this.f = fyVar2;
        return fyVar2;
    }

    @Override // defpackage.gp
    public final void n(Parcelable parcelable) {
        SparseArray<Parcelable> sparseParcelableArray = ((Bundle) parcelable).getSparseParcelableArray("android:menu:list");
        if (sparseParcelableArray != null) {
            this.d.restoreHierarchyState(sparseParcelableArray);
        }
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        this.c.z(this.f.getItem(i), this, 0);
    }
}
