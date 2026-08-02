package Z0;

import H0.i;
import Q0.h;
import Y0.AbstractC0124s;
import Y0.B;
import Y0.C0125t;
import Y0.InterfaceC0130y;
import Y0.P;
import android.os.Handler;
import android.os.Looper;
import d1.p;
import java.util.concurrent.CancellationException;

/* loaded from: classes.dex */
public final class c extends AbstractC0124s implements InterfaceC0130y {
    private volatile c _immediate;

    /* renamed from: g, reason: collision with root package name */
    public final Handler f1244g;

    /* renamed from: h, reason: collision with root package name */
    public final String f1245h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f1246i;

    /* renamed from: j, reason: collision with root package name */
    public final c f1247j;

    public c(Handler handler, String str, boolean z2) {
        this.f1244g = handler;
        this.f1245h = str;
        this.f1246i = z2;
        this._immediate = z2 ? this : null;
        c cVar = this._immediate;
        if (cVar == null) {
            cVar = new c(handler, str, true);
            this._immediate = cVar;
        }
        this.f1247j = cVar;
    }

    @Override // Y0.AbstractC0124s
    public final void c(i iVar, Runnable runnable) {
        if (this.f1244g.post(runnable)) {
            return;
        }
        CancellationException cancellationException = new CancellationException("The task was rejected, the handler underlying the dispatcher '" + this + "' was closed");
        P p2 = (P) iVar.k(C0125t.f1230f);
        if (p2 != null) {
            p2.a(cancellationException);
        }
        B.f1160b.c(iVar, runnable);
    }

    @Override // Y0.AbstractC0124s
    public final boolean e() {
        return (this.f1246i && h.a(Looper.myLooper(), this.f1244g.getLooper())) ? false : true;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof c) && ((c) obj).f1244g == this.f1244g;
    }

    public final int hashCode() {
        return System.identityHashCode(this.f1244g);
    }

    @Override // Y0.AbstractC0124s
    public final String toString() {
        c cVar;
        String str;
        f1.d dVar = B.f1159a;
        c cVar2 = p.f2100a;
        if (this == cVar2) {
            str = "Dispatchers.Main";
        } else {
            try {
                cVar = cVar2.f1247j;
            } catch (UnsupportedOperationException unused) {
                cVar = null;
            }
            str = this == cVar ? "Dispatchers.Main.immediate" : null;
        }
        if (str != null) {
            return str;
        }
        String str2 = this.f1245h;
        if (str2 == null) {
            str2 = this.f1244g.toString();
        }
        if (!this.f1246i) {
            return str2;
        }
        return str2 + ".immediate";
    }

    public c(Handler handler) {
        this(handler, null, false);
    }
}
