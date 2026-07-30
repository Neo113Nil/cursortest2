package s1;

import android.os.Looper;
import java.lang.ref.WeakReference;
import java.util.concurrent.locks.Lock;
import t1.InterfaceC0915b;

/* renamed from: s1.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0877h implements InterfaceC0915b {

    /* renamed from: a, reason: collision with root package name */
    public final WeakReference f7661a;

    /* renamed from: b, reason: collision with root package name */
    public final r1.e f7662b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f7663c;

    public C0877h(C0883n c0883n, r1.e eVar, boolean z7) {
        this.f7661a = new WeakReference(c0883n);
        this.f7662b = eVar;
        this.f7663c = z7;
    }

    @Override // t1.InterfaceC0915b
    public final void a(q1.b bVar) {
        C0883n c0883n = (C0883n) this.f7661a.get();
        if (c0883n == null) {
            return;
        }
        Lock lock = c0883n.f7677e;
        t1.u.h("onReportServiceBinding must be called on the GoogleApiClient handler thread", Looper.myLooper() == c0883n.f7676d.f7731q.f7707o);
        lock.lock();
        try {
            if (c0883n.m(0)) {
                if (!bVar.b()) {
                    c0883n.f(bVar, this.f7662b, this.f7663c);
                }
                if (c0883n.n()) {
                    c0883n.d();
                }
            }
        } finally {
            lock.unlock();
        }
    }
}
