package he;

import a6.f;
import android.os.Handler;
import android.os.Looper;
import b0.l0;
import ge.a0;
import ge.f0;
import ge.h;
import ge.k0;
import ge.m0;
import ge.o1;
import ge.t;
import ge.w1;
import java.util.concurrent.CancellationException;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import le.o;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class d extends t implements f0 {

    /* renamed from: i, reason: collision with root package name */
    public final Handler f4534i;

    /* renamed from: r, reason: collision with root package name */
    public final String f4535r;

    /* renamed from: s, reason: collision with root package name */
    public final boolean f4536s;

    /* renamed from: t, reason: collision with root package name */
    public final d f4537t;

    public d(Handler handler, String str, boolean z10) {
        this.f4534i = handler;
        this.f4535r = str;
        this.f4536s = z10;
        this.f4537t = z10 ? this : new d(handler, str, true);
    }

    @Override // ge.t
    public final void L(CoroutineContext coroutineContext, Runnable runnable) {
        if (this.f4534i.post(runnable)) {
            return;
        }
        P(coroutineContext, runnable);
    }

    @Override // ge.t
    public final boolean N(CoroutineContext coroutineContext) {
        return (this.f4536s && Intrinsics.a(Looper.myLooper(), this.f4534i.getLooper())) ? false : true;
    }

    public final void P(CoroutineContext coroutineContext, Runnable runnable) {
        a0.g(coroutineContext, new CancellationException("The task was rejected, the handler underlying the dispatcher '" + this + "' was closed"));
        ne.e eVar = k0.f4372a;
        ne.d.f7275i.L(coroutineContext, runnable);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return dVar.f4534i == this.f4534i && dVar.f4536s == this.f4536s;
    }

    @Override // ge.f0
    public final void h(long j, h hVar) {
        f fVar = new f(12, hVar, this);
        if (j > 4611686018427387903L) {
            j = 4611686018427387903L;
        }
        if (this.f4534i.postDelayed(fVar, j)) {
            hVar.u(new l0(6, this, fVar));
        } else {
            P(hVar.f4357s, fVar);
        }
    }

    public final int hashCode() {
        return System.identityHashCode(this.f4534i) ^ (this.f4536s ? 1231 : 1237);
    }

    @Override // ge.f0
    public final m0 i(long j, final w1 w1Var, CoroutineContext coroutineContext) {
        if (j > 4611686018427387903L) {
            j = 4611686018427387903L;
        }
        if (this.f4534i.postDelayed(w1Var, j)) {
            return new m0() { // from class: he.c
                @Override // ge.m0
                public final void a() {
                    d.this.f4534i.removeCallbacks(w1Var);
                }
            };
        }
        P(coroutineContext, w1Var);
        return o1.f4383d;
    }

    @Override // ge.t
    public final String toString() {
        d dVar;
        String str;
        ne.e eVar = k0.f4372a;
        d dVar2 = o.f5995a;
        if (this == dVar2) {
            str = "Dispatchers.Main";
        } else {
            try {
                dVar = dVar2.f4537t;
            } catch (UnsupportedOperationException unused) {
                dVar = null;
            }
            str = this == dVar ? "Dispatchers.Main.immediate" : null;
        }
        if (str != null) {
            return str;
        }
        String str2 = this.f4535r;
        if (str2 == null) {
            str2 = this.f4534i.toString();
        }
        if (!this.f4536s) {
            return str2;
        }
        return str2 + ".immediate";
    }

    public d(Handler handler) {
        this(handler, null, false);
    }
}
