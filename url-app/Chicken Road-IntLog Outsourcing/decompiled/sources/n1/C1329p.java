package n1;

import android.os.Looper;
import java.lang.ref.WeakReference;
import java.util.concurrent.locks.ReentrantLock;
import o1.InterfaceC1364b;

/* renamed from: n1.p, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1329p implements InterfaceC1364b {

    /* renamed from: a, reason: collision with root package name */
    public final WeakReference f11405a;

    /* renamed from: b, reason: collision with root package name */
    public final m1.e f11406b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f11407c;

    public C1329p(C1334u c1334u, m1.e eVar, boolean z) {
        this.f11405a = new WeakReference(c1334u);
        this.f11406b = eVar;
        this.f11407c = z;
    }

    @Override // o1.InterfaceC1364b
    public final void a(l1.b bVar) {
        C1334u c1334u = (C1334u) this.f11405a.get();
        if (c1334u == null) {
            return;
        }
        o1.u.i("onReportServiceBinding must be called on the GoogleApiClient handler thread", Looper.myLooper() == c1334u.f11416a.f11289p.f11445g);
        ReentrantLock reentrantLock = c1334u.f11417b;
        reentrantLock.lock();
        try {
            if (c1334u.i(0)) {
                if (!bVar.b()) {
                    c1334u.f(bVar, this.f11406b, this.f11407c);
                }
                if (c1334u.k()) {
                    c1334u.h();
                }
            }
        } finally {
            reentrantLock.unlock();
        }
    }
}
