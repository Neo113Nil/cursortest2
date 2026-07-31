package T0;

import android.os.Bundle;
import i1.C0420a;
import java.util.concurrent.locks.Lock;

/* renamed from: T0.p, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0181p implements S0.e, S0.f {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r f2317d;

    public /* synthetic */ C0181p(r rVar) {
        this.f2317d = rVar;
    }

    @Override // S0.e
    public final void onConnected(Bundle bundle) {
        r rVar = this.f2317d;
        U0.t.f(rVar.f2337w);
        C0420a c0420a = rVar.f2330p;
        U0.t.f(c0420a);
        c0420a.y(new BinderC0180o(rVar));
    }

    @Override // S0.f
    public final void onConnectionFailed(R0.a aVar) {
        r rVar = this.f2317d;
        Lock lock = rVar.f2321g;
        lock.lock();
        try {
            if (rVar.f2331q && !aVar.a()) {
                rVar.a();
                rVar.i();
            } else {
                rVar.e(aVar);
            }
            lock.unlock();
        } catch (Throwable th) {
            lock.unlock();
            throw th;
        }
    }

    @Override // S0.e
    public final void onConnectionSuspended(int i7) {
    }
}
