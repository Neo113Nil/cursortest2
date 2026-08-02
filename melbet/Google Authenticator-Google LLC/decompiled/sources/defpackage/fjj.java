package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import com.google.android.apps.authenticator2.R;
import com.google.android.material.internal.NavigationMenuView;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class fjj implements gp {
    int A;
    public NavigationMenuView a;
    public LinearLayout b;
    public gd c;
    public int d;
    public fjc e;
    public LayoutInflater f;
    public ColorStateList h;
    public ColorStateList k;
    public ColorStateList l;
    public Drawable m;
    public RippleDrawable n;
    public int o;
    public int p;
    public int q;
    public int r;
    public int s;
    public int t;
    public int u;
    public int v;
    public boolean w;
    public int y;
    public int z;
    public int g = 0;
    public int i = 0;
    public boolean j = true;
    public boolean x = true;
    public int B = -1;
    final View.OnClickListener C = new cx(this, 10);

    @Override // defpackage.gp
    public final int a() {
        return this.d;
    }

    @Override // defpackage.gp
    public final Parcelable bh() {
        Bundle bundle = new Bundle();
        if (this.a != null) {
            SparseArray<? extends Parcelable> sparseArray = new SparseArray<>();
            this.a.saveHierarchyState(sparseArray);
            bundle.putSparseParcelableArray("android:menu:list", sparseArray);
        }
        fjc fjcVar = this.e;
        if (fjcVar != null) {
            Bundle bundle2 = new Bundle();
            gf gfVar = fjcVar.e;
            if (gfVar != null) {
                bundle2.putInt("android:menu:checked", gfVar.a);
            }
            SparseArray<? extends Parcelable> sparseArray2 = new SparseArray<>();
            ArrayList arrayList = fjcVar.a;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                fje fjeVar = (fje) arrayList.get(i);
                if (fjeVar instanceof fjg) {
                    gf gfVar2 = ((fjg) fjeVar).a;
                    View actionView = gfVar2 != null ? gfVar2.getActionView() : null;
                    if (actionView != null) {
                        fjl fjlVar = new fjl();
                        actionView.saveHierarchyState(fjlVar);
                        sparseArray2.put(gfVar2.a, fjlVar);
                    }
                }
            }
            bundle2.putSparseParcelableArray("android:menu:action_views", sparseArray2);
            bundle.putBundle("android:menu:adapter", bundle2);
        }
        if (this.b != null) {
            SparseArray<? extends Parcelable> sparseArray3 = new SparseArray<>();
            this.b.saveHierarchyState(sparseArray3);
            bundle.putSparseParcelableArray("android:menu:header", sparseArray3);
        }
        return bundle;
    }

    @Override // defpackage.gp
    public final void c(Context context, gd gdVar) {
        this.f = LayoutInflater.from(context);
        this.c = gdVar;
        this.A = context.getResources().getDimensionPixelOffset(R.dimen.design_navigation_separator_vertical_padding);
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
        return false;
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
        fjc fjcVar = this.e;
        if (fjcVar != null) {
            ArrayList arrayList = fjcVar.a;
            int size = arrayList.size();
            fjcVar.t();
            fjcVar.e();
            if (size == arrayList.size()) {
                fjcVar.b.c(0, arrayList.size(), null);
            }
        }
    }

    public final void k(int i) {
        this.B = i;
        NavigationMenuView navigationMenuView = this.a;
        if (navigationMenuView != null) {
            navigationMenuView.setOverScrollMode(i);
        }
    }

    public final void l(boolean z) {
        fjc fjcVar = this.e;
        if (fjcVar != null) {
            fjcVar.f = z;
        }
    }

    public final void m() {
        fjc fjcVar = this.e;
        if (fjcVar == null) {
            return;
        }
        int i = 0;
        while (true) {
            ArrayList arrayList = fjcVar.a;
            if (i >= arrayList.size()) {
                return;
            }
            if (arrayList.get(i) instanceof fjf) {
                fjcVar.f(i);
            }
            i++;
        }
    }

    @Override // defpackage.gp
    public final void n(Parcelable parcelable) {
        gf gfVar;
        View actionView;
        fjl fjlVar;
        gf gfVar2;
        if (parcelable instanceof Bundle) {
            Bundle bundle = (Bundle) parcelable;
            SparseArray sparseParcelableArray = bundle.getSparseParcelableArray("android:menu:list");
            if (sparseParcelableArray != null) {
                this.a.restoreHierarchyState(sparseParcelableArray);
            }
            Bundle bundle2 = bundle.getBundle("android:menu:adapter");
            if (bundle2 != null) {
                fjc fjcVar = this.e;
                int i = bundle2.getInt("android:menu:checked", 0);
                if (i != 0) {
                    fjcVar.f = true;
                    ArrayList arrayList = fjcVar.a;
                    int size = arrayList.size();
                    int i2 = 0;
                    while (true) {
                        if (i2 >= size) {
                            break;
                        }
                        fje fjeVar = (fje) arrayList.get(i2);
                        if ((fjeVar instanceof fjg) && (gfVar2 = ((fjg) fjeVar).a) != null && gfVar2.a == i) {
                            fjcVar.u(gfVar2);
                            break;
                        }
                        i2++;
                    }
                    fjcVar.f = false;
                    fjcVar.t();
                }
                SparseArray sparseParcelableArray2 = bundle2.getSparseParcelableArray("android:menu:action_views");
                if (sparseParcelableArray2 != null) {
                    ArrayList arrayList2 = fjcVar.a;
                    int size2 = arrayList2.size();
                    for (int i3 = 0; i3 < size2; i3++) {
                        fje fjeVar2 = (fje) arrayList2.get(i3);
                        if ((fjeVar2 instanceof fjg) && (gfVar = ((fjg) fjeVar2).a) != null && (actionView = gfVar.getActionView()) != null && (fjlVar = (fjl) sparseParcelableArray2.get(gfVar.a)) != null) {
                            actionView.restoreHierarchyState(fjlVar);
                        }
                    }
                }
            }
            SparseArray sparseParcelableArray3 = bundle.getSparseParcelableArray("android:menu:header");
            if (sparseParcelableArray3 != null) {
                this.b.restoreHierarchyState(sparseParcelableArray3);
            }
        }
    }

    public final void o() {
        fjc fjcVar = this.e;
        if (fjcVar == null) {
            return;
        }
        int i = 0;
        while (true) {
            ArrayList arrayList = fjcVar.a;
            if (i >= arrayList.size()) {
                return;
            }
            if ((arrayList.get(i) instanceof fjg) && fjcVar.b(i) == 1) {
                fjcVar.f(i);
            }
            i++;
        }
    }

    public final void p() {
        fjc fjcVar = this.e;
        if (fjcVar == null) {
            return;
        }
        int i = 0;
        while (true) {
            ArrayList arrayList = fjcVar.a;
            if (i >= arrayList.size()) {
                return;
            }
            if ((arrayList.get(i) instanceof fjg) && fjcVar.b(i) == 0) {
                fjcVar.f(i);
            }
            i++;
        }
    }

    public final void q() {
        int i = (this.b.getChildCount() <= 0 && this.x) ? this.z : 0;
        NavigationMenuView navigationMenuView = this.a;
        navigationMenuView.setPadding(0, i, 0, navigationMenuView.getPaddingBottom());
    }

    @Override // defpackage.gp
    public final void d(gd gdVar, boolean z) {
    }
}
