package defpackage;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class po1 implements ds, g63 {
    public final fs m;
    public final /* synthetic */ qo1 n;

    public po1(qo1 qo1Var, fs fsVar) {
        this.n = qo1Var;
        this.m = fsVar;
    }

    @Override // defpackage.g63
    public final void a(vg2 vg2Var, int i) {
        this.m.a(vg2Var, i);
    }

    @Override // defpackage.ds
    public final void c(Object obj, xt0 xt0Var) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = qo1.v;
        qo1 qo1Var = this.n;
        atomicReferenceFieldUpdater.set(qo1Var, null);
        a0 a0Var = new a0(7, qo1Var, this);
        fs fsVar = this.m;
        fsVar.D((Unit) obj, fsVar.o, new es(0, a0Var));
    }

    @Override // defpackage.ds
    public final ng0 e(Object obj, xt0 xt0Var) {
        qo1 qo1Var = this.n;
        es esVar = new es(qo1Var, this);
        ng0 G = this.m.G((Unit) obj, esVar);
        if (G != null) {
            qo1.v.set(qo1Var, null);
        }
        return G;
    }

    @Override // defpackage.ds
    public final boolean g(Throwable th) {
        return this.m.g(th);
    }

    @Override // defpackage.o30
    public final CoroutineContext getContext() {
        return this.m.q;
    }

    @Override // defpackage.ds
    public final void l(Object obj) {
        this.m.l(obj);
    }

    @Override // defpackage.o30
    public final void resumeWith(Object obj) {
        this.m.resumeWith(obj);
    }
}
