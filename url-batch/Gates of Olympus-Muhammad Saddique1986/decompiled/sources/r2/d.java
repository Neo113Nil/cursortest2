package r2;

import O1.t;
import V1.i;
import android.os.Handler;
import android.os.Looper;
import c1.z;
import f2.j;
import java.util.concurrent.CancellationException;
import q2.AbstractC0831s;
import q2.B;
import q2.C0821h;
import q2.C0832t;
import q2.E;
import q2.G;
import q2.X;
import q2.j0;
import q2.r0;
import v2.m;

/* loaded from: classes.dex */
public final class d extends AbstractC0831s implements B {

    /* renamed from: f, reason: collision with root package name */
    public final Handler f8204f;

    /* renamed from: g, reason: collision with root package name */
    public final String f8205g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f8206h;

    /* renamed from: i, reason: collision with root package name */
    public final d f8207i;

    public d(Handler handler, String str, boolean z3) {
        this.f8204f = handler;
        this.f8205g = str;
        this.f8206h = z3;
        this.f8207i = z3 ? this : new d(handler, str, true);
    }

    @Override // q2.AbstractC0831s
    public final void D(i iVar, Runnable runnable) {
        if (this.f8204f.post(runnable)) {
            return;
        }
        H(iVar, runnable);
    }

    @Override // q2.AbstractC0831s
    public final boolean F(i iVar) {
        return (this.f8206h && j.a(Looper.myLooper(), this.f8204f.getLooper())) ? false : true;
    }

    public final void H(i iVar, Runnable runnable) {
        CancellationException cancellationException = new CancellationException("The task was rejected, the handler underlying the dispatcher '" + this + "' was closed");
        X x3 = (X) iVar.v(C0832t.f7929e);
        if (x3 != null) {
            x3.a(cancellationException);
        }
        x2.e eVar = E.f7851a;
        x2.d.f10346f.D(iVar, runnable);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof d) {
            d dVar = (d) obj;
            if (dVar.f8204f == this.f8204f && dVar.f8206h == this.f8206h) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return System.identityHashCode(this.f8204f) ^ (this.f8206h ? 1231 : 1237);
    }

    @Override // q2.B
    public final void q(long j3, C0821h c0821h) {
        z zVar = new z(c0821h, 2, this);
        if (j3 > 4611686018427387903L) {
            j3 = 4611686018427387903L;
        }
        if (this.f8204f.postDelayed(zVar, j3)) {
            c0821h.v(new t(this, 2, zVar));
        } else {
            H(c0821h.f7904h, zVar);
        }
    }

    @Override // q2.AbstractC0831s
    public final String toString() {
        d dVar;
        String str;
        x2.e eVar = E.f7851a;
        d dVar2 = m.f9819a;
        if (this == dVar2) {
            str = "Dispatchers.Main";
        } else {
            try {
                dVar = dVar2.f8207i;
            } catch (UnsupportedOperationException unused) {
                dVar = null;
            }
            str = this == dVar ? "Dispatchers.Main.immediate" : null;
        }
        if (str != null) {
            return str;
        }
        String str2 = this.f8205g;
        if (str2 == null) {
            str2 = this.f8204f.toString();
        }
        if (!this.f8206h) {
            return str2;
        }
        return str2 + ".immediate";
    }

    @Override // q2.B
    public final G u(long j3, final r0 r0Var, i iVar) {
        if (j3 > 4611686018427387903L) {
            j3 = 4611686018427387903L;
        }
        if (this.f8204f.postDelayed(r0Var, j3)) {
            return new G() { // from class: r2.c
                @Override // q2.G
                public final void a() {
                    d.this.f8204f.removeCallbacks(r0Var);
                }
            };
        }
        H(iVar, r0Var);
        return j0.f7909d;
    }

    public d(Handler handler) {
        this(handler, null, false);
    }
}
