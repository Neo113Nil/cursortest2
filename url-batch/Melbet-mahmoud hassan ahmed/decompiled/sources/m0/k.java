package m0;

import android.annotation.SuppressLint;
import android.content.Context;
import androidx.work.ListenableWorker;
import l0.p;

/* loaded from: classes.dex */
public class k implements Runnable {

    /* renamed from: l, reason: collision with root package name */
    static final String f18858l = d0.j.f("WorkForegroundRunnable");

    /* renamed from: f, reason: collision with root package name */
    final androidx.work.impl.utils.futures.d<Void> f18859f = androidx.work.impl.utils.futures.d.u();

    /* renamed from: g, reason: collision with root package name */
    final Context f18860g;

    /* renamed from: h, reason: collision with root package name */
    final p f18861h;

    /* renamed from: i, reason: collision with root package name */
    final ListenableWorker f18862i;

    /* renamed from: j, reason: collision with root package name */
    final d0.f f18863j;

    /* renamed from: k, reason: collision with root package name */
    final n0.a f18864k;

    class a implements Runnable {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ androidx.work.impl.utils.futures.d f18865f;

        a(androidx.work.impl.utils.futures.d dVar) {
            this.f18865f = dVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f18865f.s(k.this.f18862i.getForegroundInfoAsync());
        }
    }

    class b implements Runnable {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ androidx.work.impl.utils.futures.d f18867f;

        b(androidx.work.impl.utils.futures.d dVar) {
            this.f18867f = dVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.lang.Runnable
        public void run() {
            try {
                d0.e eVar = (d0.e) this.f18867f.get();
                if (eVar == null) {
                    throw new IllegalStateException(String.format("Worker was marked important (%s) but did not provide ForegroundInfo", k.this.f18861h.f18479c));
                }
                d0.j.c().a(k.f18858l, String.format("Updating notification for %s", k.this.f18861h.f18479c), new Throwable[0]);
                k.this.f18862i.setRunInForeground(true);
                k kVar = k.this;
                kVar.f18859f.s(kVar.f18863j.a(kVar.f18860g, kVar.f18862i.getId(), eVar));
            } catch (Throwable th) {
                k.this.f18859f.r(th);
            }
        }
    }

    @SuppressLint({"LambdaLast"})
    public k(Context context, p pVar, ListenableWorker listenableWorker, d0.f fVar, n0.a aVar) {
        this.f18860g = context;
        this.f18861h = pVar;
        this.f18862i = listenableWorker;
        this.f18863j = fVar;
        this.f18864k = aVar;
    }

    public p4.a<Void> a() {
        return this.f18859f;
    }

    @Override // java.lang.Runnable
    @SuppressLint({"UnsafeExperimentalUsageError"})
    public void run() {
        if (!this.f18861h.f18493q || p.a.b()) {
            this.f18859f.q(null);
            return;
        }
        androidx.work.impl.utils.futures.d u6 = androidx.work.impl.utils.futures.d.u();
        this.f18864k.a().execute(new a(u6));
        u6.d(new b(u6), this.f18864k.a());
    }
}
