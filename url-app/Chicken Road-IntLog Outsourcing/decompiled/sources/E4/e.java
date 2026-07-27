package E4;

import D4.AbstractC0020u;
import D4.B;
import D4.C0007g;
import D4.C0021v;
import D4.E;
import D4.G;
import D4.X;
import D4.j0;
import D4.s0;
import I4.o;
import android.os.Handler;
import android.os.Looper;
import b2.AbstractC0279e;
import java.util.concurrent.CancellationException;
import k4.InterfaceC1223i;
import kotlin.jvm.internal.i;

/* loaded from: classes.dex */
public final class e extends AbstractC0020u implements B {
    private volatile e _immediate;

    /* renamed from: c, reason: collision with root package name */
    public final Handler f657c;

    /* renamed from: d, reason: collision with root package name */
    public final String f658d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f659e;

    /* renamed from: f, reason: collision with root package name */
    public final e f660f;

    public e(Handler handler, String str, boolean z) {
        this.f657c = handler;
        this.f658d = str;
        this.f659e = z;
        this._immediate = z ? this : null;
        e eVar = this._immediate;
        if (eVar == null) {
            eVar = new e(handler, str, true);
            this._immediate = eVar;
        }
        this.f660f = eVar;
    }

    @Override // D4.AbstractC0020u
    public final void C(InterfaceC1223i interfaceC1223i, Runnable runnable) {
        if (this.f657c.post(runnable)) {
            return;
        }
        F(interfaceC1223i, runnable);
    }

    @Override // D4.AbstractC0020u
    public final boolean E() {
        return (this.f659e && i.a(Looper.myLooper(), this.f657c.getLooper())) ? false : true;
    }

    public final void F(InterfaceC1223i interfaceC1223i, Runnable runnable) {
        CancellationException cancellationException = new CancellationException("The task was rejected, the handler underlying the dispatcher '" + this + "' was closed");
        X x5 = (X) interfaceC1223i.o(C0021v.f545b);
        if (x5 != null) {
            x5.b(cancellationException);
        }
        E.f461c.C(interfaceC1223i, runnable);
    }

    public final boolean equals(Object obj) {
        return (obj instanceof e) && ((e) obj).f657c == this.f657c;
    }

    public final int hashCode() {
        return System.identityHashCode(this.f657c);
    }

    @Override // D4.B
    public final void p(long j2, C0007g c0007g) {
        A0.a aVar = new A0.a(c0007g, this, 6, false);
        if (j2 > 4611686018427387903L) {
            j2 = 4611686018427387903L;
        }
        if (this.f657c.postDelayed(aVar, j2)) {
            c0007g.u(new d(this, 0, aVar));
        } else {
            F(c0007g.f512e, aVar);
        }
    }

    @Override // D4.AbstractC0020u
    public final String toString() {
        e eVar;
        String str;
        K4.d dVar = E.f459a;
        e eVar2 = o.f1316a;
        if (this == eVar2) {
            str = "Dispatchers.Main";
        } else {
            try {
                eVar = eVar2.f660f;
            } catch (UnsupportedOperationException unused) {
                eVar = null;
            }
            str = this == eVar ? "Dispatchers.Main.immediate" : null;
        }
        if (str != null) {
            return str;
        }
        String str2 = this.f658d;
        if (str2 == null) {
            str2 = this.f657c.toString();
        }
        return this.f659e ? AbstractC0279e.e(str2, ".immediate") : str2;
    }

    @Override // D4.B
    public final G y(long j2, final s0 s0Var, InterfaceC1223i interfaceC1223i) {
        if (j2 > 4611686018427387903L) {
            j2 = 4611686018427387903L;
        }
        if (this.f657c.postDelayed(s0Var, j2)) {
            return new G() { // from class: E4.c
                @Override // D4.G
                public final void b() {
                    e.this.f657c.removeCallbacks(s0Var);
                }
            };
        }
        F(interfaceC1223i, s0Var);
        return j0.f518a;
    }

    public e(Handler handler) {
        this(handler, null, false);
    }
}
