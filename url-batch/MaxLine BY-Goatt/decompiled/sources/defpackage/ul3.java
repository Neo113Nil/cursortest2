package defpackage;

import android.os.Bundle;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class ul3 implements Runnable {
    public final /* synthetic */ int m;
    public final /* synthetic */ AtomicReference n;
    public final /* synthetic */ jm3 o;

    public ul3(jm3 jm3Var, AtomicReference atomicReference, int i) {
        this.m = i;
        switch (i) {
            case 1:
                this.n = atomicReference;
                Objects.requireNonNull(jm3Var);
                this.o = jm3Var;
                break;
            case 2:
                this.n = atomicReference;
                Objects.requireNonNull(jm3Var);
                this.o = jm3Var;
                break;
            case 3:
                this.n = atomicReference;
                Objects.requireNonNull(jm3Var);
                this.o = jm3Var;
                break;
            case 4:
                this.n = atomicReference;
                Objects.requireNonNull(jm3Var);
                this.o = jm3Var;
                break;
            default:
                this.n = atomicReference;
                Objects.requireNonNull(jm3Var);
                this.o = jm3Var;
                break;
        }
    }

    private final void a() {
        AtomicReference atomicReference = this.n;
        synchronized (atomicReference) {
            try {
                try {
                    pj3 pj3Var = (pj3) this.o.m;
                    atomicReference.set(Double.valueOf(pj3Var.p.F(pj3Var.r().C(), ug3.e0)));
                } finally {
                    this.n.notify();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.m) {
            case 0:
                AtomicReference atomicReference = this.n;
                synchronized (atomicReference) {
                    try {
                        try {
                            pj3 pj3Var = (pj3) this.o.m;
                            atomicReference.set(Boolean.valueOf(pj3Var.p.G(pj3Var.r().C(), ug3.a0)));
                        } finally {
                        }
                    } finally {
                    }
                }
                return;
            case 1:
                AtomicReference atomicReference2 = this.n;
                synchronized (atomicReference2) {
                    try {
                        try {
                            pj3 pj3Var2 = (pj3) this.o.m;
                            atomicReference2.set(pj3Var2.p.C(pj3Var2.r().C(), ug3.b0));
                        } finally {
                        }
                    } finally {
                    }
                }
                return;
            case 2:
                AtomicReference atomicReference3 = this.n;
                synchronized (atomicReference3) {
                    try {
                        try {
                            pj3 pj3Var3 = (pj3) this.o.m;
                            atomicReference3.set(Long.valueOf(pj3Var3.p.D(pj3Var3.r().C(), ug3.c0)));
                        } finally {
                        }
                    } finally {
                    }
                }
                return;
            case 3:
                AtomicReference atomicReference4 = this.n;
                synchronized (atomicReference4) {
                    try {
                        try {
                            pj3 pj3Var4 = (pj3) this.o.m;
                            atomicReference4.set(Integer.valueOf(pj3Var4.p.E(pj3Var4.r().C(), ug3.d0)));
                        } finally {
                        }
                    } finally {
                    }
                }
                return;
            case 4:
                a();
                return;
            case 5:
                jm3 jm3Var = this.o;
                qi3 qi3Var = ((pj3) jm3Var.m).q;
                pj3.k(qi3Var);
                Bundle G = qi3Var.z.G();
                jo3 p = ((pj3) jm3Var.m).p();
                AtomicReference atomicReference5 = this.n;
                p.v();
                p.x();
                p.K(new ys(p, atomicReference5, p.M(false), G, 9, false));
                return;
            default:
                jo3 p2 = ((pj3) this.o.m).p();
                qp3 a = qp3.a(sm3.SGTM_CLIENT);
                AtomicReference atomicReference6 = this.n;
                p2.v();
                p2.x();
                p2.K(new ys(p2, atomicReference6, p2.M(false), a, 10, false));
                return;
        }
    }

    public /* synthetic */ ul3(jm3 jm3Var, AtomicReference atomicReference, int i, boolean z) {
        this.m = i;
        this.o = jm3Var;
        this.n = atomicReference;
    }
}
