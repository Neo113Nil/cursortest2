package androidx.lifecycle;

import androidx.lifecycle.e;

/* loaded from: classes.dex */
class CompositeGeneratedAdaptersObserver implements g {

    /* renamed from: f, reason: collision with root package name */
    private final d[] f855f;

    CompositeGeneratedAdaptersObserver(d[] dVarArr) {
        this.f855f = dVarArr;
    }

    @Override // androidx.lifecycle.g
    public void d(i iVar, e.b bVar) {
        n nVar = new n();
        for (d dVar : this.f855f) {
            dVar.a(iVar, bVar, false, nVar);
        }
        for (d dVar2 : this.f855f) {
            dVar2.a(iVar, bVar, true, nVar);
        }
    }
}
