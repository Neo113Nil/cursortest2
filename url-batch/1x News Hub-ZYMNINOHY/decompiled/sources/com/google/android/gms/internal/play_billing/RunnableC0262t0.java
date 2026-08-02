package com.google.android.gms.internal.play_billing;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import n0.AbstractC1135O;
import n0.C1126F;
import n0.C1130J;
import n0.C1147i;

/* renamed from: com.google.android.gms.internal.play_billing.t0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC0262t0 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceFutureC0277y0 f2932a;

    /* renamed from: b, reason: collision with root package name */
    public final C1126F f2933b;

    public RunnableC0262t0(InterfaceFutureC0277y0 interfaceFutureC0277y0, C1126F c1126f) {
        this.f2932a = interfaceFutureC0277y0;
        this.f2933b = c1126f;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0020  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        Object obj;
        Throwable th;
        InterfaceFutureC0277y0 interfaceFutureC0277y0 = this.f2932a;
        boolean z = interfaceFutureC0277y0 instanceof K0;
        C1126F c1126f = this.f2933b;
        if (z) {
            AbstractC0245n0 abstractC0245n0 = (AbstractC0245n0) ((K0) interfaceFutureC0277y0);
            if (abstractC0245n0 instanceof InterfaceC0233j0) {
                Object obj2 = abstractC0245n0.f2890a;
                if (obj2 instanceof C0218e0) {
                    th = ((C0218e0) obj2).f2852a;
                    if (th != null) {
                        c1126f.a(th);
                        return;
                    }
                }
            }
            th = null;
            if (th != null) {
            }
        }
        try {
            if (!interfaceFutureC0277y0.isDone()) {
                throw new IllegalStateException(AbstractC0216d1.f("Future was expected to be done: %s", interfaceFutureC0277y0));
            }
            boolean z2 = false;
            Future future = interfaceFutureC0277y0;
            while (true) {
                try {
                    obj = future.get();
                    break;
                } catch (InterruptedException unused) {
                    z2 = true;
                    future = future;
                } catch (Throwable th2) {
                    if (z2) {
                        Thread.currentThread().interrupt();
                    }
                    throw th2;
                }
            }
            if (z2) {
                Thread.currentThread().interrupt();
            }
            Integer num = (Integer) obj;
            if (num.intValue() <= 0) {
                c1126f.f9997b.run();
                return;
            }
            int intValue = num.intValue();
            C1130J c1130j = c1126f.f9998c;
            int i3 = c1126f.f9999d;
            c1130j.getClass();
            C1147i a3 = AbstractC1135O.a(intValue, "Billing override value was set by a license tester.");
            c1130j.Q(105, i3, a3);
            c1126f.f9996a.accept(a3);
        } catch (ExecutionException e3) {
            c1126f.a(e3.getCause());
        } catch (Throwable th3) {
            c1126f.a(th3);
        }
    }

    public final String toString() {
        A0.f fVar = new A0.f(RunnableC0262t0.class.getSimpleName());
        C0229i c0229i = new C0229i();
        ((C0229i) fVar.f25d).f2873b = c0229i;
        fVar.f25d = c0229i;
        c0229i.f2872a = this.f2933b;
        return fVar.toString();
    }
}
