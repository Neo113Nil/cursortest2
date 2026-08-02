package com.google.android.gms.internal.play_billing;

import E1.C0037m;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

/* loaded from: classes.dex */
public final class T implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final W f5910a;

    /* renamed from: b, reason: collision with root package name */
    public final E1.N f5911b;

    public T(W w4, E1.N n) {
        this.f5910a = w4;
        this.f5911b = n;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() {
        Object obj;
        Throwable b4;
        W w4 = this.f5910a;
        boolean z = w4 instanceof AbstractC0299a0;
        E1.N n = this.f5911b;
        if (z && (b4 = ((AbstractC0299a0) w4).b()) != null) {
            n.d(b4);
            return;
        }
        try {
            if (!w4.isDone()) {
                throw new IllegalStateException(V3.b.B("Future was expected to be done: %s", w4));
            }
            boolean z4 = false;
            Future future = w4;
            while (true) {
                try {
                    obj = future.get();
                    break;
                } catch (InterruptedException unused) {
                    z4 = true;
                    future = future;
                } catch (Throwable th) {
                    if (z4) {
                        Thread.currentThread().interrupt();
                    }
                    throw th;
                }
            }
            if (z4) {
                Thread.currentThread().interrupt();
            }
            Integer num = (Integer) obj;
            int intValue = num.intValue();
            E1.T t4 = (E1.T) n.f514d;
            if (intValue <= 0) {
                ((Runnable) n.f513c).run();
                return;
            }
            int i4 = n.f511a;
            int intValue2 = num.intValue();
            t4.getClass();
            C0037m a3 = E1.W.a(intValue2, "Billing override value was set by a license tester.");
            t4.Q(93, i4, a3);
            ((D.a) n.f512b).accept(a3);
        } catch (ExecutionException e4) {
            n.d(e4.getCause());
        } catch (Throwable th2) {
            n.d(th2);
        }
    }

    public final String toString() {
        B1.j jVar = new B1.j(T.class.getSimpleName(), 14);
        C0333m c0333m = new C0333m();
        ((C0333m) jVar.f203d).f5978b = c0333m;
        jVar.f203d = c0333m;
        c0333m.f5977a = this.f5911b;
        return jVar.toString();
    }
}
