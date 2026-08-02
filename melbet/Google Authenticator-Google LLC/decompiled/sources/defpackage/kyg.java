package defpackage;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.CancellationException;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class kyg extends kyh implements kvu {
    public final Handler a;
    private final String d;
    private final boolean e;
    private final kyg f;

    public kyg(Handler handler, String str, boolean z) {
        this.a = handler;
        this.d = str;
        this.e = z;
        this.f = z ? this : new kyg(handler, str, true);
    }

    private final void j(kqn kqnVar, Runnable runnable) {
        ixi.h(kqnVar, new CancellationException(a.ab(this, "The task was rejected, the handler underlying the dispatcher '", "' was closed")));
        kvj kvjVar = kwa.a;
        ldm.a.a(kqnVar, runnable);
    }

    @Override // defpackage.kvj
    public final void a(kqn kqnVar, Runnable runnable) {
        if (this.a.post(runnable)) {
            return;
        }
        j(kqnVar, runnable);
    }

    @Override // defpackage.kvj
    public final boolean b(kqn kqnVar) {
        if (this.e) {
            return !ksp.b(Looper.myLooper(), this.a.getLooper());
        }
        return true;
    }

    @Override // defpackage.kvu
    public final void c(long j, kuv kuvVar) {
        kyf kyfVar = new kyf(kuvVar, this, 0);
        if (this.a.postDelayed(kyfVar, ksl.i(j, 4611686018427387903L))) {
            kuvVar.b(new fvv(this, (Runnable) kyfVar, 10));
        } else {
            j(((kuw) kuvVar).b, kyfVar);
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof kyg)) {
            return false;
        }
        kyg kygVar = (kyg) obj;
        return kygVar.a == this.a && kygVar.e == this.e;
    }

    @Override // defpackage.kyh, defpackage.kvu
    public final kwc h(long j, final Runnable runnable, kqn kqnVar) {
        if (this.a.postDelayed(runnable, ksl.i(j, 4611686018427387903L))) {
            return new kwc() { // from class: kye
                @Override // defpackage.kwc
                public final void bQ() {
                    kyg.this.a.removeCallbacks(runnable);
                }
            };
        }
        j(kqnVar, runnable);
        return kxi.a;
    }

    public final int hashCode() {
        return System.identityHashCode(this.a) ^ (true != this.e ? 1237 : 1231);
    }

    @Override // defpackage.kxf
    public final /* synthetic */ kxf i() {
        return this.f;
    }

    @Override // defpackage.kxf, defpackage.kvj
    public final String toString() {
        String e = e();
        if (e == null) {
            e = this.d;
            if (e == null) {
                e = this.a.toString();
            }
            if (this.e) {
                return String.valueOf(e).concat(".immediate");
            }
        }
        return e;
    }
}
