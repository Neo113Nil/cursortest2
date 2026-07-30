package P7;

import B2.RunnableC0272f;
import O7.AbstractC0395u;
import O7.AbstractC0399y;
import O7.C;
import O7.C0382g;
import O7.F;
import O7.H;
import O7.l0;
import O7.t0;
import T7.o;
import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.internal.ads.CL;
import java.util.concurrent.CancellationException;
import kotlin.jvm.internal.h;
import v7.InterfaceC5138i;

/* loaded from: classes2.dex */
public final class e extends AbstractC0395u implements C {

    /* renamed from: v, reason: collision with root package name */
    public final Handler f2691v;

    /* renamed from: w, reason: collision with root package name */
    public final boolean f2692w;

    /* renamed from: x, reason: collision with root package name */
    public final e f2693x;

    public e(Handler handler, boolean z8) {
        this.f2691v = handler;
        this.f2692w = z8;
        this.f2693x = z8 ? this : new e(handler, true);
    }

    public final void A(InterfaceC5138i interfaceC5138i, Runnable runnable) {
        AbstractC0399y.d(interfaceC5138i, new CancellationException("The task was rejected, the handler underlying the dispatcher '" + this + "' was closed"));
        F.f2553c.p(interfaceC5138i, runnable);
    }

    @Override // O7.C
    public final H b(long j9, final t0 t0Var, InterfaceC5138i interfaceC5138i) {
        if (j9 > 4611686018427387903L) {
            j9 = 4611686018427387903L;
        }
        if (this.f2691v.postDelayed(t0Var, j9)) {
            return new H() { // from class: P7.c
                @Override // O7.H
                public final void b() {
                    e.this.f2691v.removeCallbacks(t0Var);
                }
            };
        }
        A(interfaceC5138i, t0Var);
        return l0.f2612n;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return eVar.f2691v == this.f2691v && eVar.f2692w == this.f2692w;
    }

    public final int hashCode() {
        return System.identityHashCode(this.f2691v) ^ (this.f2692w ? 1231 : 1237);
    }

    @Override // O7.C
    public final void k(long j9, C0382g c0382g) {
        RunnableC0272f runnableC0272f = new RunnableC0272f(18, c0382g, this);
        if (j9 > 4611686018427387903L) {
            j9 = 4611686018427387903L;
        }
        if (this.f2691v.postDelayed(runnableC0272f, j9)) {
            c0382g.t(new d(0, this, runnableC0272f));
        } else {
            A(c0382g.f2600x, runnableC0272f);
        }
    }

    @Override // O7.AbstractC0395u
    public final void p(InterfaceC5138i interfaceC5138i, Runnable runnable) {
        if (this.f2691v.post(runnable)) {
            return;
        }
        A(interfaceC5138i, runnable);
    }

    @Override // O7.AbstractC0395u
    public final String toString() {
        e eVar;
        String str;
        V7.e eVar2 = F.f2551a;
        e eVar3 = o.f3162a;
        if (this == eVar3) {
            str = "Dispatchers.Main";
        } else {
            try {
                eVar = eVar3.f2693x;
            } catch (UnsupportedOperationException unused) {
                eVar = null;
            }
            str = this == eVar ? "Dispatchers.Main.immediate" : null;
        }
        if (str != null) {
            return str;
        }
        String handler = this.f2691v.toString();
        return this.f2692w ? CL.j(handler, ".immediate") : handler;
    }

    @Override // O7.AbstractC0395u
    public final boolean z() {
        return (this.f2692w && h.a(Looper.myLooper(), this.f2691v.getLooper())) ? false : true;
    }
}
