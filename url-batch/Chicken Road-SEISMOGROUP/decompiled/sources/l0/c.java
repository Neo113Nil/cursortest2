package l0;

import W.i;
import android.os.Handler;
import android.os.Looper;
import e0.h;
import java.util.concurrent.CancellationException;
import k0.AbstractC0055p;
import k0.AbstractC0063y;
import k0.C0056q;
import k0.InterfaceC0061w;
import k0.K;
import p0.p;

/* loaded from: classes.dex */
public final class c extends AbstractC0055p implements InterfaceC0061w {
    private volatile c _immediate;

    /* renamed from: d, reason: collision with root package name */
    public final Handler f981d;

    /* renamed from: e, reason: collision with root package name */
    public final String f982e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f983f;

    /* renamed from: g, reason: collision with root package name */
    public final c f984g;

    public c(Handler handler, String str, boolean z) {
        this.f981d = handler;
        this.f982e = str;
        this.f983f = z;
        this._immediate = z ? this : null;
        c cVar = this._immediate;
        if (cVar == null) {
            cVar = new c(handler, str, true);
            this._immediate = cVar;
        }
        this.f984g = cVar;
    }

    @Override // k0.AbstractC0055p
    public final void d(i iVar, Runnable runnable) {
        if (this.f981d.post(runnable)) {
            return;
        }
        CancellationException cancellationException = new CancellationException("The task was rejected, the handler underlying the dispatcher '" + this + "' was closed");
        K k2 = (K) iVar.k(C0056q.f936c);
        if (k2 != null) {
            k2.a(cancellationException);
        }
        AbstractC0063y.f951b.d(iVar, runnable);
    }

    public final boolean equals(Object obj) {
        return (obj instanceof c) && ((c) obj).f981d == this.f981d;
    }

    @Override // k0.AbstractC0055p
    public final boolean g() {
        return (this.f983f && h.a(Looper.myLooper(), this.f981d.getLooper())) ? false : true;
    }

    public final int hashCode() {
        return System.identityHashCode(this.f981d);
    }

    @Override // k0.AbstractC0055p
    public final String toString() {
        c cVar;
        String str;
        q0.d dVar = AbstractC0063y.f950a;
        c cVar2 = p.f1172a;
        if (this == cVar2) {
            str = "Dispatchers.Main";
        } else {
            try {
                cVar = cVar2.f984g;
            } catch (UnsupportedOperationException unused) {
                cVar = null;
            }
            str = this == cVar ? "Dispatchers.Main.immediate" : null;
        }
        if (str != null) {
            return str;
        }
        String str2 = this.f982e;
        if (str2 == null) {
            str2 = this.f981d.toString();
        }
        if (!this.f983f) {
            return str2;
        }
        return str2 + ".immediate";
    }

    public c(Handler handler) {
        this(handler, null, false);
    }
}
