package n0;

import kotlin.coroutines.CoroutineContext;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class b2 extends kotlin.coroutines.a implements ge.v {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ c1.f f6642e;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ c2 f6643i;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public b2(c1.f fVar, c2 c2Var) {
        super(r0);
        ge.u uVar = ge.u.f4402d;
        this.f6642e = fVar;
        this.f6643i = c2Var;
    }

    @Override // ge.v
    public final void J(Throwable th, CoroutineContext coroutineContext) {
        c1.f fVar = this.f6642e;
        c2 c2Var = this.f6643i;
        g8.b.N(th, new a4.a(1, fVar, c2Var));
        CoroutineContext coroutineContext2 = c2Var.f6652e;
        ge.u uVar = ge.u.f4402d;
        ge.v vVar = (ge.v) coroutineContext2.m(uVar);
        if (vVar != null) {
            vVar.J(th, coroutineContext);
            return;
        }
        ge.v vVar2 = (ge.v) c2Var.f6651d.m(uVar);
        if (vVar2 == null) {
            throw th;
        }
        vVar2.J(th, coroutineContext);
    }
}
