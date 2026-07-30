package defpackage;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class no0 implements sf, yn1 {
    public final tf d;
    public final /* synthetic */ oo0 e;

    public no0(oo0 oo0Var, tf tfVar) {
        this.e = oo0Var;
        this.d = tfVar;
    }

    @Override // defpackage.sf
    public final void B(Object obj) {
        this.d.B(obj);
    }

    @Override // defpackage.yn1
    public final void a(e81 e81Var, int i) {
        this.d.a(e81Var, i);
    }

    @Override // defpackage.dn
    public final CoroutineContext g() {
        return this.d.i;
    }

    @Override // defpackage.dn
    public final void l(Object obj) {
        this.d.l(obj);
    }

    @Override // defpackage.sf
    public final void n(Object obj, s30 s30Var) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = oo0.i;
        oo0 oo0Var = this.e;
        atomicReferenceFieldUpdater.set(oo0Var, null);
        l lVar = new l(oo0Var, this);
        tf tfVar = this.d;
        tfVar.G((Unit) obj, tfVar.g, new pk1(1, lVar));
    }

    @Override // defpackage.sf
    public final fv r(Object obj, s30 s30Var) {
        oo0 oo0Var = this.e;
        pk1 pk1Var = new pk1(oo0Var, this);
        fv J = this.d.J((Unit) obj, pk1Var);
        if (J != null) {
            oo0.i.set(oo0Var, null);
        }
        return J;
    }

    @Override // defpackage.sf
    public final boolean t(Throwable th) {
        return this.d.t(th);
    }
}
