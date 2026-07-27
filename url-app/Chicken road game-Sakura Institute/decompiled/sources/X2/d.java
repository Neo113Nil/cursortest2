package X2;

import A1.T;
import G1.n;
import W2.AbstractC0298u;
import W2.C0286h;
import W2.C0299v;
import W2.E;
import W2.InterfaceC0280c0;
import W2.J;
import W2.L;
import W2.o0;
import W2.w0;
import android.os.Handler;
import android.os.Looper;
import b3.m;
import java.util.concurrent.CancellationException;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class d extends AbstractC0298u implements E {

    /* renamed from: i, reason: collision with root package name */
    public final Handler f4361i;

    /* renamed from: j, reason: collision with root package name */
    public final String f4362j;

    /* renamed from: k, reason: collision with root package name */
    public final boolean f4363k;

    /* renamed from: l, reason: collision with root package name */
    public final d f4364l;

    public d(Handler handler, String str, boolean z4) {
        this.f4361i = handler;
        this.f4362j = str;
        this.f4363k = z4;
        this.f4364l = z4 ? this : new d(handler, str, true);
    }

    public final void A(CoroutineContext coroutineContext, Runnable runnable) {
        CancellationException cancellationException = new CancellationException("The task was rejected, the handler underlying the dispatcher '" + this + "' was closed");
        InterfaceC0280c0 interfaceC0280c0 = (InterfaceC0280c0) coroutineContext.k(C0299v.f4296e);
        if (interfaceC0280c0 != null) {
            interfaceC0280c0.a(cancellationException);
        }
        d3.e eVar = J.f4225a;
        d3.d.f6116i.t(coroutineContext, runnable);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof d) {
            d dVar = (d) obj;
            if (dVar.f4361i == this.f4361i && dVar.f4363k == this.f4363k) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return System.identityHashCode(this.f4361i) ^ (this.f4363k ? 1231 : 1237);
    }

    @Override // W2.E
    public final void n(long j4, C0286h c0286h) {
        n nVar = new n(6, (Object) c0286h, (Object) this, false);
        if (j4 > 4611686018427387903L) {
            j4 = 4611686018427387903L;
        }
        if (this.f4361i.postDelayed(nVar, j4)) {
            c0286h.v(new T(this, 2, nVar));
        } else {
            A(c0286h.f4266k, nVar);
        }
    }

    @Override // W2.E
    public final L p(long j4, final w0 w0Var, CoroutineContext coroutineContext) {
        if (j4 > 4611686018427387903L) {
            j4 = 4611686018427387903L;
        }
        if (this.f4361i.postDelayed(w0Var, j4)) {
            return new L() { // from class: X2.c
                @Override // W2.L
                public final void a() {
                    d.this.f4361i.removeCallbacks(w0Var);
                }
            };
        }
        A(coroutineContext, w0Var);
        return o0.f4289d;
    }

    @Override // W2.AbstractC0298u
    public final void t(CoroutineContext coroutineContext, Runnable runnable) {
        if (this.f4361i.post(runnable)) {
            return;
        }
        A(coroutineContext, runnable);
    }

    @Override // W2.AbstractC0298u
    public final String toString() {
        d dVar;
        String str;
        d3.e eVar = J.f4225a;
        d dVar2 = m.f5679a;
        if (this == dVar2) {
            str = "Dispatchers.Main";
        } else {
            try {
                dVar = dVar2.f4364l;
            } catch (UnsupportedOperationException unused) {
                dVar = null;
            }
            str = this == dVar ? "Dispatchers.Main.immediate" : null;
        }
        if (str != null) {
            return str;
        }
        String str2 = this.f4362j;
        if (str2 == null) {
            str2 = this.f4361i.toString();
        }
        if (!this.f4363k) {
            return str2;
        }
        return str2 + ".immediate";
    }

    @Override // W2.AbstractC0298u
    public final boolean u(CoroutineContext coroutineContext) {
        return (this.f4363k && Intrinsics.a(Looper.myLooper(), this.f4361i.getLooper())) ? false : true;
    }

    public d(Handler handler) {
        this(handler, null, false);
    }
}
