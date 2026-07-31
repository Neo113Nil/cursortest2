package q3;

import p3.a;
import q3.n;

/* loaded from: classes.dex */
final class q0 extends n {

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ n.a f20311d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    q0(n.a aVar, o3.d[] dVarArr, boolean z6, int i7) {
        super(dVarArr, z6, i7);
        this.f20311d = aVar;
    }

    @Override // q3.n
    protected final void b(a.b bVar, j4.i iVar) {
        l lVar;
        lVar = this.f20311d.f20297a;
        lVar.a(bVar, iVar);
    }
}
