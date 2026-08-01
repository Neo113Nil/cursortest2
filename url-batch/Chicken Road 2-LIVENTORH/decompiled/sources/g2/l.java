package g2;

import android.content.Context;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.MenuItem;
import j1.s;
import k.e0;
import k.y;

/* compiled from: r8-map-id-fb2637cf2a71147074b02d847622f707cfc12821f1b81d08e7915f8e7b9519ab */
/* loaded from: classes.dex */
public final class l implements y {

    /* renamed from: f, reason: collision with root package name */
    public t1.b f1779f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f1780g;

    /* renamed from: h, reason: collision with root package name */
    public int f1781h;

    @Override // k.y
    public final boolean c(k.o oVar) {
        return false;
    }

    @Override // k.y
    public final boolean d(e0 e0Var) {
        return false;
    }

    @Override // k.y
    public final boolean e(k.o oVar) {
        return false;
    }

    @Override // k.y
    public final void g(Context context, k.m mVar) {
        this.f1779f.c(mVar);
    }

    @Override // k.y
    public final int getId() {
        return this.f1781h;
    }

    @Override // k.y
    public final boolean h() {
        return false;
    }

    @Override // k.y
    public final Parcelable i() {
        k kVar = new k();
        kVar.f1777f = this.f1779f.getSelectedItemId();
        SparseArray<q1.a> badgeDrawables = this.f1779f.getBadgeDrawables();
        e2.f fVar = new e2.f();
        for (int i = 0; i < badgeDrawables.size(); i++) {
            int keyAt = badgeDrawables.keyAt(i);
            q1.a valueAt = badgeDrawables.valueAt(i);
            fVar.put(keyAt, valueAt != null ? valueAt.f3073j.f3102a : null);
        }
        kVar.f1778g = fVar;
        return kVar;
    }

    @Override // k.y
    public final void j(Parcelable parcelable) {
        if (parcelable instanceof k) {
            t1.b bVar = this.f1779f;
            k kVar = (k) parcelable;
            int i = kVar.f1777f;
            int size = bVar.R.f1749b.size();
            int i4 = 0;
            while (true) {
                if (i4 >= size) {
                    break;
                }
                MenuItem a2 = bVar.R.a(i4);
                if (i == a2.getItemId()) {
                    bVar.f1763m = i;
                    bVar.f1764n = i4;
                    bVar.setCheckedItem(a2);
                    break;
                }
                i4++;
            }
            Context context = this.f1779f.getContext();
            e2.f fVar = kVar.f1778g;
            SparseArray sparseArray = new SparseArray(fVar.size());
            for (int i5 = 0; i5 < fVar.size(); i5++) {
                int keyAt = fVar.keyAt(i5);
                q1.b bVar2 = (q1.b) fVar.valueAt(i5);
                sparseArray.put(keyAt, bVar2 != null ? new q1.a(context, bVar2) : null);
            }
            t1.b bVar3 = this.f1779f;
            SparseArray sparseArray2 = bVar3.A;
            for (int i6 = 0; i6 < sparseArray.size(); i6++) {
                int keyAt2 = sparseArray.keyAt(i6);
                if (sparseArray2.indexOfKey(keyAt2) < 0) {
                    sparseArray2.append(keyAt2, (q1.a) sparseArray.get(keyAt2));
                }
            }
            i[] iVarArr = bVar3.f1762l;
            if (iVarArr != null) {
                for (i iVar : iVarArr) {
                    if (iVar instanceof f) {
                        f fVar2 = (f) iVar;
                        q1.a aVar = (q1.a) sparseArray2.get(fVar2.getId());
                        if (aVar != null) {
                            fVar2.setBadge(aVar);
                        }
                    }
                }
            }
        }
    }

    @Override // k.y
    public final void m(boolean z3) {
        h hVar;
        int i;
        j1.a aVar;
        if (this.f1780g) {
            return;
        }
        if (z3) {
            this.f1779f.a();
            return;
        }
        t1.b bVar = this.f1779f;
        h hVar2 = bVar.R;
        if (hVar2 == null || bVar.f1762l == null) {
            return;
        }
        bVar.Q.f1780g = true;
        hVar2.b();
        bVar.Q.f1780g = false;
        if (bVar.f1762l != null && (hVar = bVar.R) != null && hVar.f1749b.size() == bVar.f1762l.length) {
            for (0; i < bVar.f1762l.length; i + 1) {
                if (!(bVar.R.a(i) instanceof a) || (bVar.f1762l[i] instanceof b)) {
                    i = ((bVar.R.a(i) instanceof a) || !((bVar.R.a(i).hasSubMenu() && !(bVar.f1762l[i] instanceof m)) || ((bVar.R.a(i).hasSubMenu() || (bVar.f1762l[i] instanceof f)) ? false : true))) ? i + 1 : 0;
                }
            }
            int i4 = bVar.f1763m;
            int size = bVar.R.f1749b.size();
            for (int i5 = 0; i5 < size; i5++) {
                MenuItem a2 = bVar.R.a(i5);
                if (a2.isChecked()) {
                    bVar.setCheckedItem(a2);
                    bVar.f1763m = a2.getItemId();
                    bVar.f1764n = i5;
                }
            }
            if (i4 != bVar.f1763m && (aVar = bVar.f1757f) != null) {
                s.a(bVar, aVar);
            }
            int i6 = bVar.f1760j;
            boolean z4 = i6 != -1 ? i6 == 0 : bVar.getCurrentVisibleContentItemCount() > 3;
            for (int i7 = 0; i7 < size; i7++) {
                bVar.Q.f1780g = true;
                bVar.f1762l[i7].setExpanded(bVar.W);
                i iVar = bVar.f1762l[i7];
                if (iVar instanceof f) {
                    f fVar = (f) iVar;
                    fVar.setLabelVisibilityMode(bVar.f1760j);
                    fVar.setItemIconGravity(bVar.f1761k);
                    fVar.setItemGravity(bVar.M);
                    fVar.setShifting(z4);
                }
                if (bVar.R.a(i7) instanceof k.o) {
                    bVar.f1762l[i7].b((k.o) bVar.R.a(i7));
                }
                bVar.Q.f1780g = false;
            }
            return;
        }
        bVar.a();
    }

    @Override // k.y
    public final void a(k.m mVar, boolean z3) {
    }
}
