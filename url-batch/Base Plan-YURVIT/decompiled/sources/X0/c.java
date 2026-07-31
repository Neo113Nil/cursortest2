package X0;

import G0.i;
import P0.h;
import W0.AbstractC0078s;
import W0.B;
import W0.C0079t;
import W0.InterfaceC0084y;
import W0.P;
import android.os.Handler;
import android.os.Looper;
import b1.p;
import java.util.concurrent.CancellationException;

/* loaded from: classes.dex */
public final class c extends AbstractC0078s implements InterfaceC0084y {
    private volatile c _immediate;

    /* renamed from: g, reason: collision with root package name */
    public final Handler f988g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f989h;

    /* renamed from: i, reason: collision with root package name */
    public final c f990i;

    public c(Handler handler, boolean z2) {
        this.f988g = handler;
        this.f989h = z2;
        this._immediate = z2 ? this : null;
        c cVar = this._immediate;
        if (cVar == null) {
            cVar = new c(handler, true);
            this._immediate = cVar;
        }
        this.f990i = cVar;
    }

    @Override // W0.AbstractC0078s
    public final void c(i iVar, Runnable runnable) {
        if (this.f988g.post(runnable)) {
            return;
        }
        CancellationException cancellationException = new CancellationException("The task was rejected, the handler underlying the dispatcher '" + this + "' was closed");
        P p2 = (P) iVar.m(C0079t.f974f);
        if (p2 != null) {
            p2.b(cancellationException);
        }
        B.f906b.c(iVar, runnable);
    }

    @Override // W0.AbstractC0078s
    public final boolean d() {
        return (this.f989h && h.a(Looper.myLooper(), this.f988g.getLooper())) ? false : true;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof c) && ((c) obj).f988g == this.f988g;
    }

    public final int hashCode() {
        return System.identityHashCode(this.f988g);
    }

    @Override // W0.AbstractC0078s
    public final String toString() {
        c cVar;
        String str;
        d1.d dVar = B.f905a;
        c cVar2 = p.f1773a;
        if (this == cVar2) {
            str = "Dispatchers.Main";
        } else {
            try {
                cVar = cVar2.f990i;
            } catch (UnsupportedOperationException unused) {
                cVar = null;
            }
            str = this == cVar ? "Dispatchers.Main.immediate" : null;
        }
        if (str != null) {
            return str;
        }
        String handler = this.f988g.toString();
        if (!this.f989h) {
            return handler;
        }
        return handler + ".immediate";
    }
}
