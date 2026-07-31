package T0;

import U0.InterfaceC0211b;
import android.os.Looper;
import java.lang.ref.WeakReference;
import java.util.concurrent.locks.Lock;

/* renamed from: T0.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0176k implements InterfaceC0211b {

    /* renamed from: a, reason: collision with root package name */
    public final WeakReference f2306a;

    /* renamed from: b, reason: collision with root package name */
    public final S0.c f2307b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f2308c;

    public C0176k(r rVar, S0.c cVar, boolean z5) {
        this.f2306a = new WeakReference(rVar);
        this.f2307b = cVar;
        this.f2308c = z5;
    }

    @Override // U0.InterfaceC0211b
    public final void a(R0.a aVar) {
        r rVar = (r) this.f2306a.get();
        if (rVar == null) {
            return;
        }
        Lock lock = rVar.f2321g;
        U0.t.h("onReportServiceBinding must be called on the GoogleApiClient handler thread", Looper.myLooper() == rVar.f2320f.f2377p.f2350l);
        lock.lock();
        try {
            if (!rVar.k(0)) {
                lock.unlock();
                return;
            }
            if (!aVar.b()) {
                rVar.g(aVar, this.f2307b, this.f2308c);
            }
            if (rVar.l()) {
                rVar.i();
            }
            lock.unlock();
        } catch (Throwable th) {
            lock.unlock();
            throw th;
        }
    }
}
