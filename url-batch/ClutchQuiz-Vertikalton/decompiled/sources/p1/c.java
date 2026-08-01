package p1;

import X.V;
import X0.i;
import android.os.Handler;
import android.os.Looper;
import g1.f;
import java.util.concurrent.CancellationException;
import o1.AbstractC0296o;
import o1.AbstractC0299s;
import o1.AbstractC0305y;
import o1.InterfaceC0302v;
import s1.m;

/* loaded from: classes.dex */
public final class c extends AbstractC0296o implements InterfaceC0302v {
    private volatile c _immediate;

    /* renamed from: c, reason: collision with root package name */
    public final Handler f3396c;
    public final String d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f3397e;

    /* renamed from: f, reason: collision with root package name */
    public final c f3398f;

    public c(Handler handler, String str, boolean z2) {
        this.f3396c = handler;
        this.d = str;
        this.f3397e = z2;
        this._immediate = z2 ? this : null;
        c cVar = this._immediate;
        if (cVar == null) {
            cVar = new c(handler, str, true);
            this._immediate = cVar;
        }
        this.f3398f = cVar;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof c) && ((c) obj).f3396c == this.f3396c;
    }

    public final int hashCode() {
        return System.identityHashCode(this.f3396c);
    }

    @Override // o1.AbstractC0296o
    public final String toString() {
        c cVar;
        String str;
        u1.d dVar = AbstractC0305y.f3369a;
        c cVar2 = m.f3666a;
        if (this == cVar2) {
            str = "Dispatchers.Main";
        } else {
            try {
                cVar = cVar2.f3398f;
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
            str2 = this.f3396c.toString();
        }
        return this.f3397e ? V.e(str2, ".immediate") : str2;
    }

    @Override // o1.AbstractC0296o
    public final void y(i iVar, Runnable runnable) {
        if (this.f3396c.post(runnable)) {
            return;
        }
        AbstractC0299s.a(iVar, new CancellationException("The task was rejected, the handler underlying the dispatcher '" + this + "' was closed"));
        AbstractC0305y.f3370b.y(iVar, runnable);
    }

    @Override // o1.AbstractC0296o
    public final boolean z() {
        return (this.f3397e && f.a(Looper.myLooper(), this.f3396c.getLooper())) ? false : true;
    }

    public c(Handler handler) {
        this(handler, null, false);
    }
}
