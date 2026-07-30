package l1;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.CancellationException;
import k1.p;
import k1.q;
import k1.q0;
import k1.w;
import k1.y;
import v0.h;

/* compiled from: r8-map-id-a2d84f7cf5ca45495ceb585fa5ae0341076c951e080151b58cf9359cc6e7e89d */
/* loaded from: classes.dex */
public final class c extends p implements w {
    private volatile c _immediate;

    /* renamed from: d, reason: collision with root package name */
    public final Handler f763d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f764e;

    /* renamed from: f, reason: collision with root package name */
    public final c f765f;

    public c(Handler handler, boolean z2) {
        this.f763d = handler;
        this.f764e = z2;
        this._immediate = z2 ? this : null;
        c cVar = this._immediate;
        if (cVar == null) {
            cVar = new c(handler, true);
            this._immediate = cVar;
        }
        this.f765f = cVar;
    }

    @Override // k1.p
    public final void b(h hVar, Runnable runnable) {
        if (this.f763d.post(runnable)) {
            return;
        }
        CancellationException cancellationException = new CancellationException("The task was rejected, the handler underlying the dispatcher '" + this + "' was closed");
        q0 q0Var = (q0) hVar.j(q.f713c);
        if (q0Var != null) {
            q0Var.g(cancellationException);
        }
        y.f734b.b(hVar, runnable);
    }

    @Override // k1.p
    public final boolean c() {
        return (this.f764e && d1.h.a(Looper.myLooper(), this.f763d.getLooper())) ? false : true;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof c) && ((c) obj).f763d == this.f763d;
    }

    public final int hashCode() {
        return System.identityHashCode(this.f763d);
    }

    @Override // k1.p
    public final String toString() {
        c cVar;
        String str;
        q1.d dVar = y.f733a;
        c cVar2 = p1.p.f1071a;
        if (this == cVar2) {
            str = "Dispatchers.Main";
        } else {
            try {
                cVar = cVar2.f765f;
            } catch (UnsupportedOperationException unused) {
                cVar = null;
            }
            str = this == cVar ? "Dispatchers.Main.immediate" : null;
        }
        if (str != null) {
            return str;
        }
        String handler = this.f763d.toString();
        if (!this.f764e) {
            return handler;
        }
        return handler + ".immediate";
    }
}
