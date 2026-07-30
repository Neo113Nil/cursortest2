package N0;

import M0.AbstractC0060s;
import M0.B;
import M0.C0061t;
import M0.InterfaceC0066y;
import M0.P;
import R0.p;
import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.CancellationException;
import w0.i;

/* loaded from: classes.dex */
public final class c extends AbstractC0060s implements InterfaceC0066y {
    private volatile c _immediate;

    /* renamed from: g, reason: collision with root package name */
    public final Handler f701g;

    /* renamed from: h, reason: collision with root package name */
    public final String f702h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f703i;

    /* renamed from: j, reason: collision with root package name */
    public final c f704j;

    public c(Handler handler, String str, boolean z2) {
        this.f701g = handler;
        this.f702h = str;
        this.f703i = z2;
        this._immediate = z2 ? this : null;
        c cVar = this._immediate;
        if (cVar == null) {
            cVar = new c(handler, str, true);
            this._immediate = cVar;
        }
        this.f704j = cVar;
    }

    @Override // M0.AbstractC0060s
    public final void c(i iVar, Runnable runnable) {
        if (this.f701g.post(runnable)) {
            return;
        }
        CancellationException cancellationException = new CancellationException("The task was rejected, the handler underlying the dispatcher '" + this + "' was closed");
        P p2 = (P) iVar.f(C0061t.f687f);
        if (p2 != null) {
            p2.a(cancellationException);
        }
        B.f617b.c(iVar, runnable);
    }

    @Override // M0.AbstractC0060s
    public final boolean d() {
        return (this.f703i && F0.i.a(Looper.myLooper(), this.f701g.getLooper())) ? false : true;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof c) && ((c) obj).f701g == this.f701g;
    }

    public final int hashCode() {
        return System.identityHashCode(this.f701g);
    }

    @Override // M0.AbstractC0060s
    public final String toString() {
        c cVar;
        String str;
        T0.d dVar = B.f616a;
        c cVar2 = p.f931a;
        if (this == cVar2) {
            str = "Dispatchers.Main";
        } else {
            try {
                cVar = cVar2.f704j;
            } catch (UnsupportedOperationException unused) {
                cVar = null;
            }
            str = this == cVar ? "Dispatchers.Main.immediate" : null;
        }
        if (str != null) {
            return str;
        }
        String str2 = this.f702h;
        if (str2 == null) {
            str2 = this.f701g.toString();
        }
        if (!this.f703i) {
            return str2;
        }
        return str2 + ".immediate";
    }

    public c(Handler handler) {
        this(handler, null, false);
    }
}
