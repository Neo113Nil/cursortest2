package defpackage;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.CancellationException;

/* compiled from: r8-map-id-555d5e190d9a27a9a8404de93c25a29c9fbe11559b3463c92c68ce527c1de619 */
/* loaded from: classes.dex */
public final class ss extends tg implements fj {
    public final Handler h;
    public final boolean i;
    public final ss j;

    public ss(Handler handler, boolean z) {
        this.h = handler;
        this.i = z;
        this.j = z ? this : new ss(handler, true);
    }

    @Override // defpackage.tg
    public final void O(qg qgVar, Runnable runnable) {
        if (this.h.post(runnable)) {
            return;
        }
        R(qgVar, runnable);
    }

    @Override // defpackage.tg
    public final boolean P(qg qgVar) {
        return (this.i && mv.c(Looper.myLooper(), this.h.getLooper())) ? false : true;
    }

    @Override // defpackage.tg
    public final tg Q(int i) {
        mv.g(1);
        return this;
    }

    public final void R(qg qgVar, Runnable runnable) {
        bi.m(qgVar, new CancellationException("The task was rejected, the handler underlying the dispatcher '" + this + "' was closed"));
        si siVar = ik.a;
        ii.h.O(qgVar, runnable);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ss)) {
            return false;
        }
        ss ssVar = (ss) obj;
        return ssVar.h == this.h && ssVar.i == this.i;
    }

    public final int hashCode() {
        return (this.i ? 1231 : 1237) ^ System.identityHashCode(this.h);
    }

    @Override // defpackage.fj
    public final nk i(long j, final ii0 ii0Var, qg qgVar) {
        if (j > 4611686018427387903L) {
            j = 4611686018427387903L;
        }
        if (this.h.postDelayed(ii0Var, j)) {
            return new nk() { // from class: rs
                @Override // defpackage.nk
                public final void a() {
                    ss.this.h.removeCallbacks(ii0Var);
                }
            };
        }
        R(qgVar, ii0Var);
        return v30.f;
    }

    @Override // defpackage.tg
    public final String toString() {
        ss ssVar;
        String str;
        si siVar = ik.a;
        ss ssVar2 = oz.a;
        if (this == ssVar2) {
            str = "Dispatchers.Main";
        } else {
            try {
                ssVar = ssVar2.j;
            } catch (UnsupportedOperationException unused) {
                ssVar = null;
            }
            str = this == ssVar ? "Dispatchers.Main.immediate" : null;
        }
        if (str != null) {
            return str;
        }
        String handler = this.h.toString();
        if (!this.i) {
            return handler;
        }
        return handler + ".immediate";
    }
}
