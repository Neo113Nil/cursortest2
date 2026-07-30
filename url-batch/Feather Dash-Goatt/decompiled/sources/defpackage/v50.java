package defpackage;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.CancellationException;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class v50 extends ln implements xq {
    public final Handler g;
    public final String h;
    public final boolean i;
    public final v50 j;

    public v50(Handler handler, String str, boolean z) {
        this.g = handler;
        this.h = str;
        this.i = z;
        this.j = z ? this : new v50(handler, str, true);
    }

    @Override // defpackage.xq
    public final void c(long j, tf tfVar) {
        lf lfVar = new lf(tfVar, 1, this);
        if (j > 4611686018427387903L) {
            j = 4611686018427387903L;
        }
        if (this.g.postDelayed(lfVar, j)) {
            tfVar.y(new c(this, 7, lfVar));
        } else {
            n(tfVar.i, lfVar);
        }
    }

    @Override // defpackage.xq
    public final rs e(long j, final ni1 ni1Var, CoroutineContext coroutineContext) {
        if (j > 4611686018427387903L) {
            j = 4611686018427387903L;
        }
        if (this.g.postDelayed(ni1Var, j)) {
            return new rs() { // from class: u50
                @Override // defpackage.rs
                public final void a() {
                    v50.this.g.removeCallbacks(ni1Var);
                }
            };
        }
        n(coroutineContext, ni1Var);
        return vp0.d;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof v50)) {
            return false;
        }
        v50 v50Var = (v50) obj;
        return v50Var.g == this.g && v50Var.i == this.i;
    }

    @Override // defpackage.ln
    public final void f(CoroutineContext coroutineContext, Runnable runnable) {
        if (this.g.post(runnable)) {
            return;
        }
        n(coroutineContext, runnable);
    }

    public final int hashCode() {
        return (this.i ? 1231 : 1237) ^ System.identityHashCode(this.g);
    }

    @Override // defpackage.ln
    public final boolean l(CoroutineContext coroutineContext) {
        return (this.i && Intrinsics.a(Looper.myLooper(), this.g.getLooper())) ? false : true;
    }

    public final void n(CoroutineContext coroutineContext, Runnable runnable) {
        t80.j(coroutineContext, new CancellationException("The task was rejected, the handler underlying the dispatcher '" + this + "' was closed"));
        nq nqVar = ls.a;
        fq.g.f(coroutineContext, runnable);
    }

    @Override // defpackage.ln
    public final String toString() {
        v50 v50Var;
        String str;
        nq nqVar = ls.a;
        v50 v50Var2 = pj0.a;
        if (this == v50Var2) {
            str = "Dispatchers.Main";
        } else {
            try {
                v50Var = v50Var2.j;
            } catch (UnsupportedOperationException unused) {
                v50Var = null;
            }
            str = this == v50Var ? "Dispatchers.Main.immediate" : null;
        }
        if (str != null) {
            return str;
        }
        String str2 = this.h;
        if (str2 == null) {
            str2 = this.g.toString();
        }
        if (!this.i) {
            return str2;
        }
        return str2 + ".immediate";
    }

    public v50(Handler handler) {
        this(handler, null, false);
    }
}
