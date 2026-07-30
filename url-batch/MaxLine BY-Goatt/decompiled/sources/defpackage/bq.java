package defpackage;

import defpackage.aa2;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.f;
import kotlin.coroutines.g;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class bq implements em1 {
    public final dj m;
    public Throwable o;
    public final Object n = new Object();
    public final al p = new al(0);
    public jn1 q = new jn1();
    public jn1 r = new jn1();

    public bq(dj djVar) {
        this.m = djVar;
    }

    @Override // defpackage.em1
    public final Object B(Function1 function1, o30 o30Var) {
        int i;
        int i2;
        int i3;
        fs fsVar = new fs(1, q41.b(o30Var));
        fsVar.u();
        zp zpVar = new zp();
        zpVar.a = function1;
        zpVar.b = fsVar;
        a82 a82Var = new a82();
        a82Var.m = -1;
        synchronized (this.n) {
            Throwable th = this.o;
            if (th != null) {
                aa2.a aVar = aa2.m;
                fsVar.resumeWith(new ba2(th));
            } else {
                al alVar = this.p;
                do {
                    i = alVar.get();
                    i2 = i + 1;
                } while (!alVar.compareAndSet(i, i2));
                boolean z = (134217727 & i2) == 1;
                a82Var.m = (i2 >>> 27) & 15;
                this.q.a(zpVar);
                fsVar.w(new aq(zpVar, this, a82Var));
                if (z) {
                    try {
                        this.m.invoke();
                    } catch (Throwable th2) {
                        synchronized (this.n) {
                            try {
                                if (this.o == null) {
                                    this.o = th2;
                                    jn1 jn1Var = this.q;
                                    Object[] objArr = jn1Var.a;
                                    int i4 = jn1Var.b;
                                    for (int i5 = 0; i5 < i4; i5++) {
                                        fs fsVar2 = ((zp) objArr[i5]).b;
                                        if (fsVar2 != null) {
                                            aa2.a aVar2 = aa2.m;
                                            fsVar2.resumeWith(new ba2(th2));
                                        }
                                    }
                                    this.q.c();
                                    al alVar2 = this.p;
                                    do {
                                        i3 = alVar2.get();
                                    } while (!alVar2.compareAndSet(i3, ((((i3 >>> 27) & 15) + 1) & 15) << 27));
                                    Unit unit = Unit.a;
                                }
                            } catch (Throwable th3) {
                                throw th3;
                            }
                        }
                    }
                }
            }
        }
        Object s = fsVar.s();
        b50 b50Var = b50.m;
        return s;
    }

    @Override // kotlin.coroutines.CoroutineContext
    public final CoroutineContext H(g gVar) {
        return f.b(this, gVar);
    }

    public final void a(long j) {
        int i;
        fs fsVar;
        Object ba2Var;
        synchronized (this.n) {
            try {
                jn1 jn1Var = this.q;
                this.q = this.r;
                this.r = jn1Var;
                al alVar = this.p;
                do {
                    i = alVar.get();
                } while (!alVar.compareAndSet(i, ((((i >>> 27) & 15) + 1) & 15) << 27));
                int i2 = jn1Var.b;
                for (int i3 = 0; i3 < i2; i3++) {
                    zp zpVar = (zp) jn1Var.e(i3);
                    Function1 function1 = zpVar.a;
                    if (function1 != null && (fsVar = zpVar.b) != null) {
                        try {
                            aa2.a aVar = aa2.m;
                            ba2Var = function1.invoke(Long.valueOf(j));
                        } catch (Throwable th) {
                            aa2.a aVar2 = aa2.m;
                            ba2Var = new ba2(th);
                        }
                        fsVar.resumeWith(ba2Var);
                    }
                }
                jn1Var.c();
                Unit unit = Unit.a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
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
