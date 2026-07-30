package defpackage;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.CancellationException;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class bx0 extends t40 implements m90 {
    public final Handler o;
    public final String p;
    public final boolean q;
    public final bx0 r;

    public bx0(Handler handler, String str, boolean z) {
        this.o = handler;
        this.p = str;
        this.q = z;
        this.r = z ? this : new bx0(handler, str, true);
    }

    @Override // defpackage.m90
    public final ec0 A(long j, final tx2 tx2Var, CoroutineContext coroutineContext) {
        if (j > 4611686018427387903L) {
            j = 4611686018427387903L;
        }
        if (this.o.postDelayed(tx2Var, j)) {
            return new ec0() { // from class: ax0
                @Override // defpackage.ec0
                public final void a() {
                    bx0.this.o.removeCallbacks(tx2Var);
                }
            };
        }
        R(coroutineContext, tx2Var);
        return rs1.m;
    }

    @Override // defpackage.t40
    public final void N(CoroutineContext coroutineContext, Runnable runnable) {
        if (this.o.post(runnable)) {
            return;
        }
        R(coroutineContext, runnable);
    }

    @Override // defpackage.t40
    public final boolean P(CoroutineContext coroutineContext) {
        return (this.q && Intrinsics.b(Looper.myLooper(), this.o.getLooper())) ? false : true;
    }

    @Override // defpackage.t40
    public final t40 Q(int i) {
        l41.u(1);
        return this;
    }

    public final void R(CoroutineContext coroutineContext, Runnable runnable) {
        l41.t(coroutineContext, new CancellationException("The task was rejected, the handler underlying the dispatcher '" + this + "' was closed"));
        t80 t80Var = vb0.a;
        j80.o.N(coroutineContext, runnable);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof bx0)) {
            return false;
        }
        bx0 bx0Var = (bx0) obj;
        return bx0Var.o == this.o && bx0Var.q == this.q;
    }

    public final int hashCode() {
        return (this.q ? 1231 : 1237) ^ System.identityHashCode(this.o);
    }

    @Override // defpackage.m90
    public final void n(long j, fs fsVar) {
        iu0 iu0Var = new iu0(9, fsVar, this);
        if (j > 4611686018427387903L) {
            j = 4611686018427387903L;
        }
        if (this.o.postDelayed(iu0Var, j)) {
            fsVar.w(new ek(3, this, iu0Var));
        } else {
            R(fsVar.q, iu0Var);
        }
    }

    @Override // defpackage.t40
    public final String toString() {
        bx0 bx0Var;
        String str;
        t80 t80Var = vb0.a;
        bx0 bx0Var2 = qh1.a;
        if (this == bx0Var2) {
            str = "Dispatchers.Main";
        } else {
            try {
                bx0Var = bx0Var2.r;
            } catch (UnsupportedOperationException unused) {
                bx0Var = null;
            }
            str = this == bx0Var ? "Dispatchers.Main.immediate" : null;
        }
        if (str != null) {
            return str;
        }
        String str2 = this.p;
        if (str2 == null) {
            str2 = this.o.toString();
        }
        if (!this.q) {
            return str2;
        }
        return str2 + ".immediate";
    }

    public bx0(Handler handler) {
        this(handler, null, false);
    }
}
