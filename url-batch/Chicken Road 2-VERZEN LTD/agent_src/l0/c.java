package l0;

import W.i;
import android.os.Handler;
import android.os.Looper;
import e0.h;
import java.util.concurrent.CancellationException;
import k0.AbstractC0057p;
import k0.AbstractC0065y;
import k0.C0058q;
import k0.InterfaceC0063w;
import k0.K;
import p0.p;

/* loaded from: classes.dex */
public final class c extends AbstractC0057p implements InterfaceC0063w {
    private volatile c _immediate;

    /* renamed from: d, reason: collision with root package name */
    public final Handler f928d;

    /* renamed from: e, reason: collision with root package name */
    public final String f929e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f930f;

    /* renamed from: g, reason: collision with root package name */
    public final c f931g;

    public c(Handler handler, String str, boolean z2) {
        this.f928d = handler;
        this.f929e = str;
        this.f930f = z2;
        this._immediate = z2 ? this : null;
        c cVar = this._immediate;
        if (cVar == null) {
            cVar = new c(handler, str, true);
            this._immediate = cVar;
        }
        this.f931g = cVar;
    }

    @Override // k0.AbstractC0057p
    public final void d(i iVar, Runnable runnable) {
        if (this.f928d.post(runnable)) {
            return;
        }
        CancellationException cancellationException = new CancellationException("The task was rejected, the handler underlying the dispatcher '" + this + "' was closed");
        K k2 = (K) iVar.k(C0058q.f883c);
        if (k2 != null) {
            k2.a(cancellationException);
        }
        AbstractC0065y.f898b.d(iVar, runnable);
    }

    public final boolean equals(Object obj) {
        return (obj instanceof c) && ((c) obj).f928d == this.f928d;
    }

    @Override // k0.AbstractC0057p
    public final boolean g() {
        return (this.f930f && h.a(Looper.myLooper(), this.f928d.getLooper())) ? false : true;
    }

    public final int hashCode() {
        return System.identityHashCode(this.f928d);
    }

    @Override // k0.AbstractC0057p
    public final String toString() {
        c cVar;
        String str;
        q0.d dVar = AbstractC0065y.f897a;
        c cVar2 = p.f1164a;
        if (this == cVar2) {
            str = "Dispatchers.Main";
        } else {
            try {
                cVar = cVar2.f931g;
            } catch (UnsupportedOperationException unused) {
                cVar = null;
            }
            str = this == cVar ? "Dispatchers.Main.immediate" : null;
        }
        if (str != null) {
            return str;
        }
        String str2 = this.f929e;
        if (str2 == null) {
            str2 = this.f928d.toString();
        }
        if (!this.f930f) {
            return str2;
        }
        return str2 + ".immediate";
    }

    public c(Handler handler) {
        this(handler, null, false);
    }
}
