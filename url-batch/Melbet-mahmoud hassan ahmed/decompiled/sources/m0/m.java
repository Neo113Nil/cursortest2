package m0;

import android.content.Context;
import androidx.work.impl.WorkDatabase;
import d0.o;
import d0.s;
import java.util.UUID;
import l0.p;

/* loaded from: classes.dex */
public class m implements o {

    /* renamed from: c, reason: collision with root package name */
    static final String f18878c = d0.j.f("WorkProgressUpdater");

    /* renamed from: a, reason: collision with root package name */
    final WorkDatabase f18879a;

    /* renamed from: b, reason: collision with root package name */
    final n0.a f18880b;

    class a implements Runnable {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ UUID f18881f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ androidx.work.b f18882g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ androidx.work.impl.utils.futures.d f18883h;

        a(UUID uuid, androidx.work.b bVar, androidx.work.impl.utils.futures.d dVar) {
            this.f18881f = uuid;
            this.f18882g = bVar;
            this.f18883h = dVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            p l7;
            String uuid = this.f18881f.toString();
            d0.j c7 = d0.j.c();
            String str = m.f18878c;
            c7.a(str, String.format("Updating progress for %s (%s)", this.f18881f, this.f18882g), new Throwable[0]);
            m.this.f18879a.c();
            try {
                l7 = m.this.f18879a.B().l(uuid);
            } finally {
                try {
                } finally {
                }
            }
            if (l7 == null) {
                throw new IllegalStateException("Calls to setProgressAsync() must complete before a ListenableWorker signals completion of work by returning an instance of Result.");
            }
            if (l7.f18478b == s.RUNNING) {
                m.this.f18879a.A().b(new l0.m(uuid, this.f18882g));
            } else {
                d0.j.c().h(str, String.format("Ignoring setProgressAsync(...). WorkSpec (%s) is not in a RUNNING state.", uuid), new Throwable[0]);
            }
            this.f18883h.q(null);
            m.this.f18879a.r();
        }
    }

    public m(WorkDatabase workDatabase, n0.a aVar) {
        this.f18879a = workDatabase;
        this.f18880b = aVar;
    }

    @Override // d0.o
    public p4.a<Void> a(Context context, UUID uuid, androidx.work.b bVar) {
        androidx.work.impl.utils.futures.d u6 = androidx.work.impl.utils.futures.d.u();
        this.f18880b.b(new a(uuid, bVar, u6));
        return u6;
    }
}
