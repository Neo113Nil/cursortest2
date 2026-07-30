package f5;

import androidx.room.b0;
import com.android.installreferrer.api.InstallReferrerClient;
import j5.n;
import j5.p;
import j5.r;
import java.lang.Thread;
import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final /* synthetic */ class b implements h, z4.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3369a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f3370b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f3371c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f3372d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f3373e;

    public /* synthetic */ b(g gVar, Object obj, long j8, TimeUnit timeUnit, int i7) {
        this.f3369a = i7;
        this.f3370b = gVar;
        this.f3373e = obj;
        this.f3371c = j8;
        this.f3372d = timeUnit;
    }

    @Override // f5.h
    public ScheduledFuture a(final b6.c cVar) {
        switch (this.f3369a) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                g gVar = (g) this.f3370b;
                Runnable runnable = (Runnable) this.f3373e;
                return gVar.f3391g.schedule(new e(gVar, runnable, cVar, 1), this.f3371c, (TimeUnit) this.f3372d);
            default:
                final g gVar2 = (g) this.f3370b;
                final Callable callable = (Callable) this.f3373e;
                return gVar2.f3391g.schedule(new Callable() { // from class: f5.f
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        return g.this.f3390f.submit(new b0(callable, 6, cVar));
                    }
                }, this.f3371c, (TimeUnit) this.f3372d);
        }
    }

    @Override // z4.b
    public void b(Object obj) {
        n nVar = (n) this.f3370b;
        z4.i iVar = (z4.i) this.f3373e;
        z4.i iVar2 = (z4.i) this.f3372d;
        b1.b bVar = nVar.f5099x;
        if (this.f3371c != nVar.A) {
            bVar.d("Ignoring getToken result, because this was not the latest attempt.", null, new Object[0]);
            return;
        }
        j5.j jVar = nVar.f5083h;
        j5.j jVar2 = j5.j.f5061g;
        if (jVar != jVar2) {
            if (jVar == j5.j.f5060f) {
                bVar.d("Not opening connection after token refresh, because connection was set to disconnected", null, new Object[0]);
                return;
            }
            return;
        }
        bVar.d("Successfully fetched token, opening connection", null, new Object[0]);
        String str = (String) iVar.a();
        String str2 = (String) iVar2.a();
        j5.j jVar3 = nVar.f5083h;
        a.a.z(jVar3 == jVar2, "Trying to open network connection while in the wrong state: %s", jVar3);
        if (str == null) {
            l5.i iVar3 = nVar.f5076a;
            iVar3.getClass();
            iVar3.g(l5.c.f6010c, Boolean.FALSE);
        }
        nVar.f5091p = str;
        nVar.f5093r = str2;
        nVar.f5083h = j5.j.f5062h;
        j5.a aVar = new j5.a(nVar.f5095t, nVar.f5077b, nVar.f5078c, nVar, nVar.f5101z, str2);
        nVar.f5082g = aVar;
        b1.b bVar2 = (b1.b) aVar.f5038f;
        if (bVar2.v()) {
            bVar2.d("Opening a connection", null, new Object[0]);
        }
        r rVar = (r) aVar.f5036d;
        androidx.room.c cVar = rVar.f5110a;
        u5.d dVar = (u5.d) cVar.f1069g;
        b1.b bVar3 = ((r) cVar.f1070h).f5119j;
        try {
            dVar.c();
        } catch (u5.e e9) {
            if (bVar3.v()) {
                bVar3.d("Error connecting", e9, new Object[0]);
            }
            dVar.a();
            try {
                u5.g gVar = dVar.f9070g;
                if (gVar.f9087g.getState() != Thread.State.NEW) {
                    gVar.f9087g.join();
                }
                dVar.f9074k.join();
            } catch (InterruptedException e10) {
                bVar3.i("Interrupted while shutting down websocket threads", e10);
            }
        }
        rVar.f5117h = rVar.f5118i.schedule(new p(rVar, 0), 30000L, TimeUnit.MILLISECONDS);
    }

    public /* synthetic */ b(n nVar, long j8, z4.i iVar, z4.i iVar2) {
        this.f3369a = 2;
        this.f3370b = nVar;
        this.f3371c = j8;
        this.f3373e = iVar;
        this.f3372d = iVar2;
    }
}
