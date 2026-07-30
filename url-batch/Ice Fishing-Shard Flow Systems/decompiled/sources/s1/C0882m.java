package s1;

import android.os.Bundle;
import java.util.concurrent.locks.Lock;

/* renamed from: s1.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0882m implements r1.k, r1.l {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C0883n f7672e;

    public /* synthetic */ C0882m(C0883n c0883n) {
        this.f7672e = c0883n;
    }

    @Override // r1.k
    public final void onConnected(Bundle bundle) {
        C0883n c0883n = this.f7672e;
        t1.u.f(c0883n.f7693z);
        I1.a aVar = c0883n.f7686s;
        t1.u.f(aVar);
        aVar.q(new BinderC0881l(c0883n));
    }

    @Override // r1.l
    public final void onConnectionFailed(q1.b bVar) {
        C0883n c0883n = this.f7672e;
        Lock lock = c0883n.f7677e;
        Lock lock2 = c0883n.f7677e;
        lock.lock();
        try {
            if (c0883n.f7687t && !bVar.a()) {
                c0883n.g();
                c0883n.d();
            } else {
                c0883n.j(bVar);
            }
            lock2.unlock();
        } catch (Throwable th) {
            lock2.unlock();
            throw th;
        }
    }

    @Override // r1.k
    public final void onConnectionSuspended(int i2) {
    }
}
