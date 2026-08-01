package b7;

import android.os.Bundle;
import java.util.concurrent.locks.Lock;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class q implements a7.k, a7.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ s f1332d;

    public /* synthetic */ q(s sVar) {
        this.f1332d = sVar;
    }

    @Override // a7.k
    public final void onConnected(Bundle bundle) {
        s sVar = this.f1332d;
        c7.c0.g(sVar.F);
        u7.a aVar = sVar.f1354y;
        c7.c0.g(aVar);
        aVar.v(new p(sVar));
    }

    @Override // a7.l
    public final void onConnectionFailed(z6.b bVar) {
        s sVar = this.f1332d;
        Lock lock = sVar.f1345e;
        Lock lock2 = sVar.f1345e;
        lock.lock();
        try {
            if (sVar.f1355z && !bVar.b()) {
                sVar.j();
                sVar.c();
            } else {
                sVar.k(bVar);
            }
            lock2.unlock();
        } catch (Throwable th) {
            lock2.unlock();
            throw th;
        }
    }

    @Override // a7.k
    public final void onConnectionSuspended(int i3) {
    }
}
