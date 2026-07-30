package defpackage;

import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.h;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class v82 implements a50, r82 {
    public static final ks q = new ks();
    public final CoroutineContext m;
    public final CoroutineContext n;
    public final v82 o = this;
    public volatile CoroutineContext p;

    public v82(CoroutineContext coroutineContext, CoroutineContext coroutineContext2) {
        this.m = coroutineContext;
        this.n = coroutineContext2;
    }

    public final void b() {
        synchronized (this.o) {
            try {
                CoroutineContext coroutineContext = this.p;
                if (coroutineContext == null) {
                    this.p = q;
                } else {
                    l41.t(coroutineContext, new qq0(0));
                }
                Unit unit = Unit.a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.r82
    public final void c() {
        b();
    }

    @Override // defpackage.r82
    public final void d() {
        b();
    }

    @Override // defpackage.a50
    public final CoroutineContext n() {
        CoroutineContext coroutineContext;
        CoroutineContext coroutineContext2 = this.p;
        if (coroutineContext2 == null || coroutineContext2 == q) {
            i00 i00Var = (i00) this.m.m(i00.n);
            CoroutineContext u82Var = i00Var != null ? new u82(i00Var, this) : h.m;
            synchronized (this.o) {
                try {
                    CoroutineContext coroutineContext3 = this.p;
                    if (coroutineContext3 == null) {
                        CoroutineContext coroutineContext4 = this.m;
                        coroutineContext = coroutineContext4.p(new i61((g61) coroutineContext4.m(qb2.U))).p(this.n).p(u82Var);
                    } else if (coroutineContext3 == q) {
                        CoroutineContext coroutineContext5 = this.m;
                        i61 i61Var = new i61((g61) coroutineContext5.m(qb2.U));
                        i61Var.u(new qq0(0));
                        coroutineContext = coroutineContext5.p(i61Var).p(this.n).p(u82Var);
                    } else {
                        coroutineContext = coroutineContext3;
                    }
                    this.p = coroutineContext;
                    Unit unit = Unit.a;
                } catch (Throwable th) {
                    throw th;
                }
            }
            coroutineContext2 = coroutineContext;
        }
        coroutineContext2.getClass();
        return coroutineContext2;
    }

    @Override // defpackage.r82
    public final void a() {
    }
}
