package N2;

import android.os.Bundle;
import f3.C4502a;
import java.util.concurrent.locks.ReentrantLock;

/* renamed from: N2.q, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0331q implements M2.i, M2.j {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ C0332s f2084n;

    public /* synthetic */ C0331q(C0332s c0332s) {
        this.f2084n = c0332s;
    }

    @Override // M2.i
    public final void onConnected(Bundle bundle) {
        C0332s c0332s = this.f2084n;
        O2.w.h(c0332s.f2096K);
        C4502a c4502a = c0332s.f2090D;
        O2.w.h(c4502a);
        c4502a.B(new BinderC0330p(c0332s));
    }

    @Override // M2.j
    public final void onConnectionFailed(L2.b bVar) {
        C0332s c0332s = this.f2084n;
        ReentrantLock reentrantLock = c0332s.f2101u;
        ReentrantLock reentrantLock2 = c0332s.f2101u;
        reentrantLock.lock();
        try {
            if (c0332s.f2091E && !bVar.a()) {
                c0332s.a();
                c0332s.h();
            } else {
                c0332s.f(bVar);
            }
            reentrantLock2.unlock();
        } catch (Throwable th) {
            reentrantLock2.unlock();
            throw th;
        }
    }

    @Override // M2.i
    public final void onConnectionSuspended(int i) {
    }
}
