package b7;

import android.os.Looper;
import java.lang.ref.WeakReference;
import java.util.concurrent.locks.Lock;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class l implements c7.d {

    /* renamed from: a, reason: collision with root package name */
    public final WeakReference f1309a;

    /* renamed from: b, reason: collision with root package name */
    public final a7.d f1310b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f1311c;

    public l(s sVar, a7.d dVar, boolean z10) {
        this.f1309a = new WeakReference(sVar);
        this.f1310b = dVar;
        this.f1311c = z10;
    }

    @Override // c7.d
    public final void a(z6.b bVar) {
        s sVar = (s) this.f1309a.get();
        if (sVar == null) {
            return;
        }
        Lock lock = sVar.f1345e;
        c7.c0.i("onReportServiceBinding must be called on the GoogleApiClient handler thread", Looper.myLooper() == sVar.f1344d.f1407p.g);
        lock.lock();
        try {
            if (sVar.m(0)) {
                if (!bVar.c()) {
                    sVar.i(bVar, this.f1310b, this.f1311c);
                }
                if (sVar.n()) {
                    sVar.c();
                }
            }
        } finally {
            lock.unlock();
        }
    }
}
