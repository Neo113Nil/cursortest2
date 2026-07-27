package a2;

import B1.C0097d;
import B1.o;
import U1.k;
import e2.C0559a;
import e2.EnumC0568j;
import e2.n;
import e2.p;
import e2.r;
import java.lang.Thread;
import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import w2.C1294c;
import y.t;

/* renamed from: a2.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C0413b implements InterfaceC0419h, U1.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4911a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f4912b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f4913c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f4914d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f4915e;

    public /* synthetic */ C0413b(ScheduledExecutorServiceC0418g scheduledExecutorServiceC0418g, Object obj, long j4, TimeUnit timeUnit, int i2) {
        this.f4911a = i2;
        this.f4912b = scheduledExecutorServiceC0418g;
        this.f4915e = obj;
        this.f4913c = j4;
        this.f4914d = timeUnit;
    }

    @Override // a2.InterfaceC0419h
    public ScheduledFuture a(final C1294c c1294c) {
        switch (this.f4911a) {
            case 0:
                ScheduledExecutorServiceC0418g scheduledExecutorServiceC0418g = (ScheduledExecutorServiceC0418g) this.f4912b;
                scheduledExecutorServiceC0418g.getClass();
                return scheduledExecutorServiceC0418g.f4933e.schedule(new RunnableC0416e(scheduledExecutorServiceC0418g, (Runnable) this.f4915e, c1294c, 1), this.f4913c, (TimeUnit) this.f4914d);
            default:
                final ScheduledExecutorServiceC0418g scheduledExecutorServiceC0418g2 = (ScheduledExecutorServiceC0418g) this.f4912b;
                scheduledExecutorServiceC0418g2.getClass();
                final Callable callable = (Callable) this.f4915e;
                return scheduledExecutorServiceC0418g2.f4933e.schedule(new Callable() { // from class: a2.f
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        ScheduledExecutorServiceC0418g scheduledExecutorServiceC0418g3 = ScheduledExecutorServiceC0418g.this;
                        scheduledExecutorServiceC0418g3.getClass();
                        return scheduledExecutorServiceC0418g3.f4932d.submit(new o(callable, 5, c1294c));
                    }
                }, this.f4913c, (TimeUnit) this.f4914d);
        }
    }

    @Override // U1.c
    public void b(Object obj) {
        n nVar = (n) this.f4912b;
        long j4 = nVar.f6208A;
        long j5 = this.f4913c;
        C0097d c0097d = nVar.f6235x;
        if (j5 != j4) {
            c0097d.d("Ignoring getToken result, because this was not the latest attempt.", null, new Object[0]);
            return;
        }
        EnumC0568j enumC0568j = nVar.f6219h;
        EnumC0568j enumC0568j2 = EnumC0568j.f6192e;
        if (enumC0568j != enumC0568j2) {
            if (enumC0568j == EnumC0568j.f6191d) {
                c0097d.d("Not opening connection after token refresh, because connection was set to disconnected", null, new Object[0]);
                return;
            }
            return;
        }
        c0097d.d("Successfully fetched token, opening connection", null, new Object[0]);
        String str = (String) ((k) this.f4915e).d();
        String str2 = (String) ((k) this.f4914d).d();
        EnumC0568j enumC0568j3 = nVar.f6219h;
        M1.a.F(enumC0568j3 == enumC0568j2, "Trying to open network connection while in the wrong state: %s", enumC0568j3);
        if (str == null) {
            g2.h hVar = nVar.f6212a;
            hVar.getClass();
            hVar.g(g2.c.f6681c, Boolean.FALSE);
        }
        nVar.f6227p = str;
        nVar.f6229r = str2;
        nVar.f6219h = EnumC0568j.f6193i;
        C0559a c0559a = new C0559a(nVar.f6231t, nVar.f6213b, nVar.f6214c, nVar, nVar.f6237z, str2);
        nVar.f6218g = c0559a;
        C0097d c0097d2 = (C0097d) c0559a.f6169f;
        if (c0097d2.y()) {
            c0097d2.d("Opening a connection", null, new Object[0]);
        }
        r rVar = (r) c0559a.f6167d;
        t tVar = rVar.f6246a;
        p2.e eVar = (p2.e) tVar.f11494e;
        try {
            eVar.c();
        } catch (p2.f e4) {
            r rVar2 = (r) tVar.f11495i;
            boolean y4 = rVar2.f6255j.y();
            C0097d c0097d3 = rVar2.f6255j;
            if (y4) {
                c0097d3.d("Error connecting", e4, new Object[0]);
            }
            eVar.a();
            try {
                p2.h hVar2 = eVar.f9098g;
                if (hVar2.f9115g.getState() != Thread.State.NEW) {
                    hVar2.f9115g.join();
                }
                eVar.f9102k.join();
            } catch (InterruptedException e5) {
                c0097d3.i("Interrupted while shutting down websocket threads", e5);
            }
        }
        rVar.f6253h = rVar.f6254i.schedule(new p(rVar, 0), 30000L, TimeUnit.MILLISECONDS);
    }

    public /* synthetic */ C0413b(n nVar, long j4, k kVar, k kVar2) {
        this.f4911a = 2;
        this.f4912b = nVar;
        this.f4913c = j4;
        this.f4915e = kVar;
        this.f4914d = kVar2;
    }
}
