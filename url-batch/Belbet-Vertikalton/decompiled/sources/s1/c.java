package s1;

import G1.AbstractC0001b;
import a1.i;
import android.os.Handler;
import android.os.Looper;
import j1.h;
import java.util.concurrent.CancellationException;
import r1.AbstractC0366p;
import r1.AbstractC0369t;
import r1.AbstractC0375z;
import r1.InterfaceC0372w;
import w1.n;

/* loaded from: classes.dex */
public final class c extends AbstractC0366p implements InterfaceC0372w {
    private volatile c _immediate;

    /* renamed from: c, reason: collision with root package name */
    public final Handler f4140c;

    /* renamed from: d, reason: collision with root package name */
    public final String f4141d;
    public final boolean e;

    /* renamed from: f, reason: collision with root package name */
    public final c f4142f;

    public c(Handler handler, String str, boolean z2) {
        this.f4140c = handler;
        this.f4141d = str;
        this.e = z2;
        this._immediate = z2 ? this : null;
        c cVar = this._immediate;
        if (cVar == null) {
            cVar = new c(handler, str, true);
            this._immediate = cVar;
        }
        this.f4142f = cVar;
    }

    @Override // r1.AbstractC0366p
    public final void D(i iVar, Runnable runnable) {
        if (this.f4140c.post(runnable)) {
            return;
        }
        AbstractC0369t.a(iVar, new CancellationException("The task was rejected, the handler underlying the dispatcher '" + this + "' was closed"));
        AbstractC0375z.f4101b.D(iVar, runnable);
    }

    @Override // r1.AbstractC0366p
    public final boolean E() {
        return (this.e && h.a(Looper.myLooper(), this.f4140c.getLooper())) ? false : true;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof c) && ((c) obj).f4140c == this.f4140c;
    }

    public final int hashCode() {
        return System.identityHashCode(this.f4140c);
    }

    @Override // r1.AbstractC0366p
    public final String toString() {
        c cVar;
        String str;
        y1.d dVar = AbstractC0375z.f4100a;
        c cVar2 = n.f4493a;
        if (this == cVar2) {
            str = "Dispatchers.Main";
        } else {
            try {
                cVar = cVar2.f4142f;
            } catch (UnsupportedOperationException unused) {
                cVar = null;
            }
            str = this == cVar ? "Dispatchers.Main.immediate" : null;
        }
        if (str != null) {
            return str;
        }
        String str2 = this.f4141d;
        if (str2 == null) {
            str2 = this.f4140c.toString();
        }
        return this.e ? AbstractC0001b.f(str2, ".immediate") : str2;
    }

    public c(Handler handler) {
        this(handler, null, false);
    }
}
