package o6;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import n6.AbstractC0786t;
import n6.C0775h;
import n6.C0787u;
import n6.F;
import n6.H;
import n6.InterfaceC0765C;
import n6.X;
import n6.i0;
import n6.r0;
import s6.n;
import u6.C0953e;
import u6.ExecutorC0952d;

/* renamed from: o6.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0809e extends AbstractC0786t implements InterfaceC0765C {

    /* renamed from: i, reason: collision with root package name */
    public final Handler f7133i;

    /* renamed from: l, reason: collision with root package name */
    public final boolean f7134l;

    /* renamed from: m, reason: collision with root package name */
    public final C0809e f7135m;

    public C0809e(Handler handler, boolean z7) {
        this.f7133i = handler;
        this.f7134l = z7;
        this.f7135m = z7 ? this : new C0809e(handler, true);
    }

    @Override // n6.AbstractC0786t
    public final void E(CoroutineContext coroutineContext, Runnable runnable) {
        if (this.f7133i.post(runnable)) {
            return;
        }
        I(coroutineContext, runnable);
    }

    @Override // n6.AbstractC0786t
    public final boolean G(CoroutineContext coroutineContext) {
        return (this.f7134l && Intrinsics.a(Looper.myLooper(), this.f7133i.getLooper())) ? false : true;
    }

    public final void I(CoroutineContext coroutineContext, Runnable runnable) {
        CancellationException cancellationException = new CancellationException("The task was rejected, the handler underlying the dispatcher '" + this + "' was closed");
        X x7 = (X) coroutineContext.g(C0787u.f7085e);
        if (x7 != null) {
            x7.d(cancellationException);
        }
        C0953e c0953e = F.f7011a;
        ExecutorC0952d.f8106i.E(coroutineContext, runnable);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C0809e)) {
            return false;
        }
        C0809e c0809e = (C0809e) obj;
        return c0809e.f7133i == this.f7133i && c0809e.f7134l == this.f7134l;
    }

    @Override // n6.InterfaceC0765C
    public final void h(long j, C0775h c0775h) {
        final F.a aVar = new F.a(c0775h, 22, this);
        if (j > 4611686018427387903L) {
            j = 4611686018427387903L;
        }
        if (this.f7133i.postDelayed(aVar, j)) {
            c0775h.u(new Function1() { // from class: o6.d
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    C0809e.this.f7133i.removeCallbacks(aVar);
                    return Unit.f6114a;
                }
            });
        } else {
            I(c0775h.f7063m, aVar);
        }
    }

    public final int hashCode() {
        return System.identityHashCode(this.f7133i) ^ (this.f7134l ? 1231 : 1237);
    }

    @Override // n6.InterfaceC0765C
    public final H s(long j, final r0 r0Var, CoroutineContext coroutineContext) {
        if (j > 4611686018427387903L) {
            j = 4611686018427387903L;
        }
        if (this.f7133i.postDelayed(r0Var, j)) {
            return new H() { // from class: o6.c
                @Override // n6.H
                public final void dispose() {
                    C0809e.this.f7133i.removeCallbacks(r0Var);
                }
            };
        }
        I(coroutineContext, r0Var);
        return i0.f7065d;
    }

    @Override // n6.AbstractC0786t
    public final String toString() {
        C0809e c0809e;
        String str;
        C0953e c0953e = F.f7011a;
        C0809e c0809e2 = n.f7850a;
        if (this == c0809e2) {
            str = "Dispatchers.Main";
        } else {
            try {
                c0809e = c0809e2.f7135m;
            } catch (UnsupportedOperationException unused) {
                c0809e = null;
            }
            str = this == c0809e ? "Dispatchers.Main.immediate" : null;
        }
        if (str != null) {
            return str;
        }
        String handler = this.f7133i.toString();
        return this.f7134l ? r4.f.c(handler, ".immediate") : handler;
    }
}
