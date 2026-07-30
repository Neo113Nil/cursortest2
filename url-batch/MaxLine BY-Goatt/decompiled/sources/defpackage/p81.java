package defpackage;

import java.util.concurrent.CancellationException;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.f;
import kotlin.coroutines.g;
import kotlin.coroutines.h;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class p81 implements r82, u40 {
    public final CoroutineContext m;
    public final Function2 n;
    public final m30 o;
    public jo2 p;

    public p81(CoroutineContext coroutineContext, Function2 function2) {
        this.m = coroutineContext;
        this.n = function2;
        this.o = j8.b(coroutineContext.p(coroutineContext.m(i00.n) != null ? this : h.m));
    }

    @Override // kotlin.coroutines.CoroutineContext
    public final CoroutineContext H(g gVar) {
        return f.b(this, gVar);
    }

    @Override // defpackage.u40
    public final void L(Throwable th, CoroutineContext coroutineContext) {
        i00 i00Var = (i00) coroutineContext.m(i00.n);
        if (i00Var != null) {
            s93.T(th, new h00(0, i00Var, this));
        }
        u40 u40Var = (u40) this.m.m(qb2.M);
        if (u40Var == null) {
            throw th;
        }
        u40Var.L(th, coroutineContext);
    }

    @Override // defpackage.r82
    public final void a() {
        jo2 jo2Var = this.p;
        if (jo2Var != null) {
            CancellationException cancellationException = new CancellationException("Old job was still running!");
            cancellationException.initCause(null);
            jo2Var.f(cancellationException);
        }
        this.p = z71.H(this.o, null, this.n, 3);
    }

    @Override // defpackage.r82
    public final void c() {
        jo2 jo2Var = this.p;
        if (jo2Var != null) {
            jo2Var.w(new qq0(1));
        }
        this.p = null;
    }

    @Override // defpackage.r82
    public final void d() {
        jo2 jo2Var = this.p;
        if (jo2Var != null) {
            jo2Var.w(new qq0(1));
        }
        this.p = null;
    }

    @Override // kotlin.coroutines.CoroutineContext.Element
    public final g getKey() {
        return qb2.M;
    }

    @Override // kotlin.coroutines.CoroutineContext
    public final CoroutineContext.Element m(g gVar) {
        return f.a(this, gVar);
    }

    @Override // kotlin.coroutines.CoroutineContext
    public final CoroutineContext p(CoroutineContext coroutineContext) {
        return f.c(this, coroutineContext);
    }

    @Override // kotlin.coroutines.CoroutineContext
    public final Object y(Object obj, Function2 function2) {
        return function2.invoke(obj, this);
    }
}
