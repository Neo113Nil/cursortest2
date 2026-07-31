package m0;

import android.content.Context;
import androidx.work.impl.WorkDatabase;
import d0.s;
import java.util.UUID;
import l0.q;

/* loaded from: classes.dex */
public class l implements d0.f {

    /* renamed from: d, reason: collision with root package name */
    private static final String f18869d = d0.j.f("WMFgUpdater");

    /* renamed from: a, reason: collision with root package name */
    private final n0.a f18870a;

    /* renamed from: b, reason: collision with root package name */
    final k0.a f18871b;

    /* renamed from: c, reason: collision with root package name */
    final q f18872c;

    class a implements Runnable {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ androidx.work.impl.utils.futures.d f18873f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ UUID f18874g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ d0.e f18875h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ Context f18876i;

        a(androidx.work.impl.utils.futures.d dVar, UUID uuid, d0.e eVar, Context context) {
            this.f18873f = dVar;
            this.f18874g = uuid;
            this.f18875h = eVar;
            this.f18876i = context;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                if (!this.f18873f.isCancelled()) {
                    String uuid = this.f18874g.toString();
                    s h7 = l.this.f18872c.h(uuid);
                    if (h7 == null || h7.b()) {
                        throw new IllegalStateException("Calls to setForegroundAsync() must complete before a ListenableWorker signals completion of work by returning an instance of Result.");
                    }
                    l.this.f18871b.b(uuid, this.f18875h);
                    this.f18876i.startService(androidx.work.impl.foreground.a.b(this.f18876i, uuid, this.f18875h));
                }
                this.f18873f.q(null);
            } catch (Throwable th) {
                this.f18873f.r(th);
            }
        }
    }

    public l(WorkDatabase workDatabase, k0.a aVar, n0.a aVar2) {
        this.f18871b = aVar;
        this.f18870a = aVar2;
        this.f18872c = workDatabase.B();
    }

    @Override // d0.f
    public p4.a<Void> a(Context context, UUID uuid, d0.e eVar) {
        androidx.work.impl.utils.futures.d u6 = androidx.work.impl.utils.futures.d.u();
        this.f18870a.b(new a(u6, uuid, eVar, context));
        return u6;
    }
}
