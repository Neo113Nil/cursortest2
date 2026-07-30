package defpackage;

import kotlin.coroutines.CoroutineContext;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public class we2 extends e0 implements c50 {
    public final o30 r;

    public we2(o30 o30Var, CoroutineContext coroutineContext) {
        super(coroutineContext, true);
        this.r = o30Var;
    }

    @Override // defpackage.n61
    public final boolean T() {
        return true;
    }

    @Override // defpackage.c50
    public final c50 getCallerFrame() {
        o30 o30Var = this.r;
        if (o30Var instanceof c50) {
            return (c50) o30Var;
        }
        return null;
    }

    @Override // defpackage.n61
    public void k(Object obj) {
        j8.U(q41.b(this.r), ix.a(obj));
    }

    @Override // defpackage.n61
    public void r(Object obj) {
        this.r.resumeWith(ix.a(obj));
    }
}
