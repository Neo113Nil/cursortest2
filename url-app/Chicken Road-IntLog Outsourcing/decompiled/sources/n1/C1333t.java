package n1;

import android.os.Bundle;
import java.util.concurrent.locks.ReentrantLock;

/* renamed from: n1.t, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1333t implements m1.i, m1.j {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C1334u f11415a;

    public /* synthetic */ C1333t(C1334u c1334u) {
        this.f11415a = c1334u;
    }

    @Override // m1.i
    public final void onConnected(Bundle bundle) {
        C1334u c1334u = this.f11415a;
        o1.u.g(c1334u.f11433r);
        G1.a aVar = c1334u.f11426k;
        o1.u.g(aVar);
        aVar.B(new BinderC1332s(c1334u));
    }

    @Override // m1.j
    public final void onConnectionFailed(l1.b bVar) {
        C1334u c1334u = this.f11415a;
        ReentrantLock reentrantLock = c1334u.f11417b;
        ReentrantLock reentrantLock2 = c1334u.f11417b;
        reentrantLock.lock();
        try {
            if (c1334u.f11427l && !bVar.a()) {
                c1334u.a();
                c1334u.h();
            } else {
                c1334u.e(bVar);
            }
            reentrantLock2.unlock();
        } catch (Throwable th) {
            reentrantLock2.unlock();
            throw th;
        }
    }

    @Override // m1.i
    public final void onConnectionSuspended(int i2) {
    }
}
