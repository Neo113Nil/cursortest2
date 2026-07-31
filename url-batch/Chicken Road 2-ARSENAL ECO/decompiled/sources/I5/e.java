package I5;

import H5.AbstractC0161v;
import H5.C;
import H5.C0147g;
import H5.C0162w;
import H5.F;
import H5.H;
import H5.X;
import H5.j0;
import H5.s0;
import M5.o;
import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.CancellationException;
import kotlin.jvm.internal.i;
import o5.InterfaceC0569i;

/* loaded from: classes.dex */
public final class e extends AbstractC0161v implements C {
    private volatile e _immediate;

    /* renamed from: h, reason: collision with root package name */
    public final Handler f1225h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f1226i;

    /* renamed from: j, reason: collision with root package name */
    public final e f1227j;

    public e(Handler handler, boolean z5) {
        this.f1225h = handler;
        this.f1226i = z5;
        this._immediate = z5 ? this : null;
        e eVar = this._immediate;
        if (eVar == null) {
            eVar = new e(handler, true);
            this._immediate = eVar;
        }
        this.f1227j = eVar;
    }

    @Override // H5.AbstractC0161v
    public final void F(InterfaceC0569i interfaceC0569i, Runnable runnable) {
        if (this.f1225h.post(runnable)) {
            return;
        }
        I(interfaceC0569i, runnable);
    }

    @Override // H5.AbstractC0161v
    public final boolean H() {
        return (this.f1226i && i.a(Looper.myLooper(), this.f1225h.getLooper())) ? false : true;
    }

    public final void I(InterfaceC0569i interfaceC0569i, Runnable runnable) {
        CancellationException cancellationException = new CancellationException("The task was rejected, the handler underlying the dispatcher '" + this + "' was closed");
        X x6 = (X) interfaceC0569i.m(C0162w.f1110g);
        if (x6 != null) {
            x6.d(cancellationException);
        }
        F.f1029c.F(interfaceC0569i, runnable);
    }

    @Override // H5.C
    public final void e(long j4, C0147g c0147g) {
        A.a aVar = new A.a(c0147g, 3, this);
        if (j4 > 4611686018427387903L) {
            j4 = 4611686018427387903L;
        }
        if (this.f1225h.postDelayed(aVar, j4)) {
            c0147g.t(new d(this, aVar));
        } else {
            I(c0147g.f1079j, aVar);
        }
    }

    public final boolean equals(Object obj) {
        return (obj instanceof e) && ((e) obj).f1225h == this.f1225h;
    }

    @Override // H5.C
    public final H g(long j4, final s0 s0Var, InterfaceC0569i interfaceC0569i) {
        if (j4 > 4611686018427387903L) {
            j4 = 4611686018427387903L;
        }
        if (this.f1225h.postDelayed(s0Var, j4)) {
            return new H() { // from class: I5.c
                @Override // H5.H
                public final void b() {
                    e.this.f1225h.removeCallbacks(s0Var);
                }
            };
        }
        I(interfaceC0569i, s0Var);
        return j0.f1085f;
    }

    public final int hashCode() {
        return System.identityHashCode(this.f1225h);
    }

    @Override // H5.AbstractC0161v
    public final String toString() {
        e eVar;
        String str;
        O5.d dVar = F.f1027a;
        e eVar2 = o.f1618a;
        if (this == eVar2) {
            str = "Dispatchers.Main";
        } else {
            try {
                eVar = eVar2.f1227j;
            } catch (UnsupportedOperationException unused) {
                eVar = null;
            }
            str = this == eVar ? "Dispatchers.Main.immediate" : null;
        }
        if (str != null) {
            return str;
        }
        String handler = this.f1225h.toString();
        return this.f1226i ? W4.o.d(handler, ".immediate") : handler;
    }
}
