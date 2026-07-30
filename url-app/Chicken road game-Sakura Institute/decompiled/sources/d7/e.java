package d7;

import android.os.Handler;
import android.os.Looper;
import b3.z;
import c7.d0;
import c7.g0;
import c7.h;
import c7.i0;
import c7.j1;
import c7.r1;
import c7.t;
import c7.u;
import c7.x0;
import h6.i;
import h7.m;
import java.util.concurrent.CancellationException;
import r6.k;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class e extends t implements d0 {

    /* renamed from: h, reason: collision with root package name */
    public final Handler f2645h;

    /* renamed from: i, reason: collision with root package name */
    public final String f2646i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f2647j;

    /* renamed from: k, reason: collision with root package name */
    public final e f2648k;

    public e(Handler handler, String str, boolean z8) {
        this.f2645h = handler;
        this.f2646i = str;
        this.f2647j = z8;
        this.f2648k = z8 ? this : new e(handler, str, true);
    }

    @Override // c7.d0
    public final i0 U(long j8, final r1 r1Var, i iVar) {
        if (j8 > 4611686018427387903L) {
            j8 = 4611686018427387903L;
        }
        if (this.f2645h.postDelayed(r1Var, j8)) {
            return new i0() { // from class: d7.c
                @Override // c7.i0
                public final void a() {
                    e.this.f2645h.removeCallbacks(r1Var);
                }
            };
        }
        Z(iVar, r1Var);
        return j1.f1710f;
    }

    @Override // c7.t
    public final void V(i iVar, Runnable runnable) {
        if (this.f2645h.post(runnable)) {
            return;
        }
        Z(iVar, runnable);
    }

    @Override // c7.t
    public final boolean X(i iVar) {
        return (this.f2647j && k.a(Looper.myLooper(), this.f2645h.getLooper())) ? false : true;
    }

    public final void Z(i iVar, Runnable runnable) {
        CancellationException cancellationException = new CancellationException("The task was rejected, the handler underlying the dispatcher '" + this + "' was closed");
        x0 x0Var = (x0) iVar.u(u.f1748g);
        if (x0Var != null) {
            x0Var.c(cancellationException);
        }
        j7.e eVar = g0.f1696a;
        j7.d.f5151h.V(iVar, runnable);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return eVar.f2645h == this.f2645h && eVar.f2647j == this.f2647j;
    }

    public final int hashCode() {
        return System.identityHashCode(this.f2645h) ^ (this.f2647j ? 1231 : 1237);
    }

    @Override // c7.d0
    public final void k(long j8, h hVar) {
        z zVar = new z(hVar, 2, this);
        if (j8 > 4611686018427387903L) {
            j8 = 4611686018427387903L;
        }
        if (this.f2645h.postDelayed(zVar, j8)) {
            hVar.t(new d(this, 0, zVar));
        } else {
            Z(hVar.f1702j, zVar);
        }
    }

    @Override // c7.t
    public final String toString() {
        e eVar;
        String str;
        j7.e eVar2 = g0.f1696a;
        e eVar3 = m.f4700a;
        if (this == eVar3) {
            str = "Dispatchers.Main";
        } else {
            try {
                eVar = eVar3.f2648k;
            } catch (UnsupportedOperationException unused) {
                eVar = null;
            }
            str = this == eVar ? "Dispatchers.Main.immediate" : null;
        }
        if (str != null) {
            return str;
        }
        String str2 = this.f2646i;
        if (str2 == null) {
            str2 = this.f2645h.toString();
        }
        if (!this.f2647j) {
            return str2;
        }
        return str2 + ".immediate";
    }

    public e(Handler handler) {
        this(handler, null, false);
    }
}
