package b7;

import a0.v0;
import a7.a0;
import a7.d0;
import a7.e0;
import a7.e1;
import a7.n1;
import a7.q;
import a7.r;
import a7.s0;
import android.os.Handler;
import android.os.Looper;
import f7.n;
import g6.h;
import java.util.concurrent.CancellationException;
import q6.i;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class e extends q implements a0 {

    /* renamed from: f, reason: collision with root package name */
    public final Handler f1533f;

    /* renamed from: g, reason: collision with root package name */
    public final String f1534g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f1535h;
    public final e i;

    public e(Handler handler, String str, boolean z3) {
        this.f1533f = handler;
        this.f1534g = str;
        this.f1535h = z3;
        this.i = z3 ? this : new e(handler, str, true);
    }

    @Override // a7.a0
    public final e0 e(long j7, final n1 n1Var, h hVar) {
        if (j7 > 4611686018427387903L) {
            j7 = 4611686018427387903L;
        }
        if (this.f1533f.postDelayed(n1Var, j7)) {
            return new e0() { // from class: b7.c
                @Override // a7.e0
                public final void a() {
                    e.this.f1533f.removeCallbacks(n1Var);
                }
            };
        }
        m(hVar, n1Var);
        return e1.f253d;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return eVar.f1533f == this.f1533f && eVar.f1535h == this.f1535h;
    }

    @Override // a7.a0
    public final void f(long j7, a7.h hVar) {
        d dVar = new d(0, hVar, this);
        if (j7 > 4611686018427387903L) {
            j7 = 4611686018427387903L;
        }
        if (this.f1533f.postDelayed(dVar, j7)) {
            hVar.v(new v0(3, this, dVar));
        } else {
            m(hVar.f261h, dVar);
        }
    }

    @Override // a7.q
    public final void h(h hVar, Runnable runnable) {
        if (this.f1533f.post(runnable)) {
            return;
        }
        m(hVar, runnable);
    }

    public final int hashCode() {
        return System.identityHashCode(this.f1533f) ^ (this.f1535h ? 1231 : 1237);
    }

    @Override // a7.q
    public final boolean i(h hVar) {
        return (this.f1535h && i.a(Looper.myLooper(), this.f1533f.getLooper())) ? false : true;
    }

    public final void m(h hVar, Runnable runnable) {
        CancellationException cancellationException = new CancellationException("The task was rejected, the handler underlying the dispatcher '" + this + "' was closed");
        s0 s0Var = (s0) hVar.l(r.f297e);
        if (s0Var != null) {
            s0Var.a(cancellationException);
        }
        h7.e eVar = d0.f249a;
        h7.d.f3236f.h(hVar, runnable);
    }

    @Override // a7.q
    public final String toString() {
        e eVar;
        String str;
        h7.e eVar2 = d0.f249a;
        e eVar3 = n.f2795a;
        if (this == eVar3) {
            str = "Dispatchers.Main";
        } else {
            try {
                eVar = eVar3.i;
            } catch (UnsupportedOperationException unused) {
                eVar = null;
            }
            str = this == eVar ? "Dispatchers.Main.immediate" : null;
        }
        if (str != null) {
            return str;
        }
        String str2 = this.f1534g;
        if (str2 == null) {
            str2 = this.f1533f.toString();
        }
        if (!this.f1535h) {
            return str2;
        }
        return str2 + ".immediate";
    }

    public e(Handler handler) {
        this(handler, null, false);
    }
}
