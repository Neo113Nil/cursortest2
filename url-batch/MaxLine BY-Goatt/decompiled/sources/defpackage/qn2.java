package defpackage;

import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class qn2 extends t01 {
    public final yj1 m;
    public boolean n;
    public final pq o;
    public final Function0 p;

    public qn2(pq pqVar, Function0 function0, yj1 yj1Var) {
        this.m = yj1Var;
        this.o = pqVar;
        this.p = function0;
    }

    @Override // defpackage.t01, java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        this.n = true;
        pq pqVar = this.o;
        if (pqVar != null) {
            l.a(pqVar);
        }
    }

    @Override // defpackage.t01
    public final yj1 m() {
        return this.m;
    }

    @Override // defpackage.t01
    public final synchronized pq n() {
        pq pqVar;
        try {
            if (this.n) {
                throw new IllegalStateException("closed");
            }
            pqVar = this.o;
            if (pqVar == null) {
                e71 e71Var = gl0.a;
                throw null;
            }
        } catch (Throwable th) {
            throw th;
        }
        return pqVar;
    }
}
