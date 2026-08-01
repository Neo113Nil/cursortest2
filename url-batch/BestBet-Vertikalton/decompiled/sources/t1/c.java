package t1;

import G1.AbstractC0001b;
import android.os.Handler;
import android.os.Looper;
import b1.j;
import java.util.concurrent.CancellationException;
import k1.e;
import s1.AbstractC0332o;
import s1.AbstractC0335s;
import s1.AbstractC0341y;
import s1.InterfaceC0338v;
import w1.m;

/* loaded from: classes.dex */
public final class c extends AbstractC0332o implements InterfaceC0338v {
    private volatile c _immediate;

    /* renamed from: c, reason: collision with root package name */
    public final Handler f4164c;
    public final String d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f4165e;

    /* renamed from: f, reason: collision with root package name */
    public final c f4166f;

    public c(Handler handler, String str, boolean z2) {
        this.f4164c = handler;
        this.d = str;
        this.f4165e = z2;
        this._immediate = z2 ? this : null;
        c cVar = this._immediate;
        if (cVar == null) {
            cVar = new c(handler, str, true);
            this._immediate = cVar;
        }
        this.f4166f = cVar;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof c) && ((c) obj).f4164c == this.f4164c;
    }

    public final int hashCode() {
        return System.identityHashCode(this.f4164c);
    }

    @Override // s1.AbstractC0332o
    public final void r(j jVar, Runnable runnable) {
        if (this.f4164c.post(runnable)) {
            return;
        }
        AbstractC0335s.a(jVar, new CancellationException("The task was rejected, the handler underlying the dispatcher '" + this + "' was closed"));
        AbstractC0341y.f4073b.r(jVar, runnable);
    }

    @Override // s1.AbstractC0332o
    public final boolean s() {
        return (this.f4165e && e.a(Looper.myLooper(), this.f4164c.getLooper())) ? false : true;
    }

    @Override // s1.AbstractC0332o
    public final String toString() {
        c cVar;
        String str;
        y1.d dVar = AbstractC0341y.f4072a;
        c cVar2 = m.f4515a;
        if (this == cVar2) {
            str = "Dispatchers.Main";
        } else {
            try {
                cVar = cVar2.f4166f;
            } catch (UnsupportedOperationException unused) {
                cVar = null;
            }
            str = this == cVar ? "Dispatchers.Main.immediate" : null;
        }
        if (str != null) {
            return str;
        }
        String str2 = this.d;
        if (str2 == null) {
            str2 = this.f4164c.toString();
        }
        return this.f4165e ? AbstractC0001b.g(str2, ".immediate") : str2;
    }

    public c(Handler handler) {
        this(handler, null, false);
    }
}
