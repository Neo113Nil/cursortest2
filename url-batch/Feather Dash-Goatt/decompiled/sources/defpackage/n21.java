package defpackage;

import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.g;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class n21 implements sn, j21 {
    public static final wf i = new wf();
    public final CoroutineContext d;
    public final CoroutineContext e;
    public final n21 g = this;
    public volatile CoroutineContext h;

    public n21(CoroutineContext coroutineContext, CoroutineContext coroutineContext2) {
        this.d = coroutineContext;
        this.e = coroutineContext2;
    }

    public final void a() {
        synchronized (this.g) {
            try {
                CoroutineContext coroutineContext = this.h;
                if (coroutineContext == null) {
                    this.h = i;
                } else {
                    t80.j(coroutineContext, new c30(0));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.j21
    public final void e() {
        a();
    }

    @Override // defpackage.sn
    public final CoroutineContext f() {
        CoroutineContext coroutineContext;
        CoroutineContext coroutineContext2 = this.h;
        if (coroutineContext2 == null || coroutineContext2 == i) {
            rl rlVar = (rl) this.d.d(rl.e);
            CoroutineContext m21Var = rlVar != null ? new m21(rlVar, this) : g.d;
            synchronized (this.g) {
                try {
                    CoroutineContext coroutineContext3 = this.h;
                    if (coroutineContext3 == null) {
                        CoroutineContext coroutineContext4 = this.d;
                        coroutineContext = coroutineContext4.i(new lb0((jb0) coroutineContext4.d(j41.m))).i(this.e).i(m21Var);
                    } else if (coroutineContext3 == i) {
                        CoroutineContext coroutineContext5 = this.d;
                        lb0 lb0Var = new lb0((jb0) coroutineContext5.d(j41.m));
                        lb0Var.F(new c30(0));
                        coroutineContext = coroutineContext5.i(lb0Var).i(this.e).i(m21Var);
                    } else {
                        coroutineContext = coroutineContext3;
                    }
                    this.h = coroutineContext;
                } catch (Throwable th) {
                    throw th;
                }
            }
            coroutineContext2 = coroutineContext;
        }
        coroutineContext2.getClass();
        return coroutineContext2;
    }

    @Override // defpackage.j21
    public final void g() {
        a();
    }

    @Override // defpackage.j21
    public final void c() {
    }
}
