package l2;

import H1.o;
import P1.i;
import a1.x;
import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.CancellationException;
import k2.AbstractC0546s;
import k2.B;
import k2.C0536h;
import k2.C0547t;
import k2.E;
import k2.G;
import k2.X;
import k2.j0;
import k2.r0;
import p2.n;

/* loaded from: classes.dex */
public final class d extends AbstractC0546s implements B {

    /* renamed from: f, reason: collision with root package name */
    public final Handler f5548f;

    /* renamed from: g, reason: collision with root package name */
    public final String f5549g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f5550h;

    /* renamed from: i, reason: collision with root package name */
    public final d f5551i;

    public d(Handler handler, String str, boolean z3) {
        this.f5548f = handler;
        this.f5549g = str;
        this.f5550h = z3;
        this.f5551i = z3 ? this : new d(handler, str, true);
    }

    @Override // k2.AbstractC0546s
    public final void P(i iVar, Runnable runnable) {
        if (this.f5548f.post(runnable)) {
            return;
        }
        S(iVar, runnable);
    }

    @Override // k2.AbstractC0546s
    public final boolean Q(i iVar) {
        return (this.f5550h && Z1.i.a(Looper.myLooper(), this.f5548f.getLooper())) ? false : true;
    }

    public final void S(i iVar, Runnable runnable) {
        CancellationException cancellationException = new CancellationException("The task was rejected, the handler underlying the dispatcher '" + this + "' was closed");
        X x3 = (X) iVar.k(C0547t.f5390e);
        if (x3 != null) {
            x3.a(cancellationException);
        }
        r2.e eVar = E.f5312a;
        r2.d.f7321f.P(iVar, runnable);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof d) {
            d dVar = (d) obj;
            if (dVar.f5548f == this.f5548f && dVar.f5550h == this.f5550h) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return System.identityHashCode(this.f5548f) ^ (this.f5550h ? 1231 : 1237);
    }

    @Override // k2.B
    public final G i(long j3, final r0 r0Var, i iVar) {
        if (j3 > 4611686018427387903L) {
            j3 = 4611686018427387903L;
        }
        if (this.f5548f.postDelayed(r0Var, j3)) {
            return new G() { // from class: l2.c
                @Override // k2.G
                public final void a() {
                    d.this.f5548f.removeCallbacks(r0Var);
                }
            };
        }
        S(iVar, r0Var);
        return j0.f5370d;
    }

    @Override // k2.AbstractC0546s
    public final String toString() {
        d dVar;
        String str;
        r2.e eVar = E.f5312a;
        d dVar2 = n.f6799a;
        if (this == dVar2) {
            str = "Dispatchers.Main";
        } else {
            try {
                dVar = dVar2.f5551i;
            } catch (UnsupportedOperationException unused) {
                dVar = null;
            }
            str = this == dVar ? "Dispatchers.Main.immediate" : null;
        }
        if (str != null) {
            return str;
        }
        String str2 = this.f5549g;
        if (str2 == null) {
            str2 = this.f5548f.toString();
        }
        if (!this.f5550h) {
            return str2;
        }
        return str2 + ".immediate";
    }

    @Override // k2.B
    public final void u(long j3, C0536h c0536h) {
        x xVar = new x(c0536h, 2, this);
        if (j3 > 4611686018427387903L) {
            j3 = 4611686018427387903L;
        }
        if (this.f5548f.postDelayed(xVar, j3)) {
            c0536h.s(new o(this, 2, xVar));
        } else {
            S(c0536h.f5365h, xVar);
        }
    }

    public d(Handler handler) {
        this(handler, null, false);
    }
}
