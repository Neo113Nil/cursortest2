package e0;

import android.annotation.SuppressLint;
import android.content.Context;
import androidx.work.ListenableWorker;
import androidx.work.WorkerParameters;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemalarm.RescheduleReceiver;
import d0.s;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import l0.p;
import l0.q;
import l0.t;
import m0.k;
import m0.l;
import m0.m;

/* loaded from: classes.dex */
public class j implements Runnable {

    /* renamed from: y, reason: collision with root package name */
    static final String f15803y = d0.j.f("WorkerWrapper");

    /* renamed from: f, reason: collision with root package name */
    Context f15804f;

    /* renamed from: g, reason: collision with root package name */
    private String f15805g;

    /* renamed from: h, reason: collision with root package name */
    private List<e> f15806h;

    /* renamed from: i, reason: collision with root package name */
    private WorkerParameters.a f15807i;

    /* renamed from: j, reason: collision with root package name */
    p f15808j;

    /* renamed from: k, reason: collision with root package name */
    ListenableWorker f15809k;

    /* renamed from: l, reason: collision with root package name */
    n0.a f15810l;

    /* renamed from: n, reason: collision with root package name */
    private androidx.work.a f15812n;

    /* renamed from: o, reason: collision with root package name */
    private k0.a f15813o;

    /* renamed from: p, reason: collision with root package name */
    private WorkDatabase f15814p;

    /* renamed from: q, reason: collision with root package name */
    private q f15815q;

    /* renamed from: r, reason: collision with root package name */
    private l0.b f15816r;

    /* renamed from: s, reason: collision with root package name */
    private t f15817s;

    /* renamed from: t, reason: collision with root package name */
    private List<String> f15818t;

    /* renamed from: u, reason: collision with root package name */
    private String f15819u;

    /* renamed from: x, reason: collision with root package name */
    private volatile boolean f15822x;

    /* renamed from: m, reason: collision with root package name */
    ListenableWorker.a f15811m = ListenableWorker.a.a();

    /* renamed from: v, reason: collision with root package name */
    androidx.work.impl.utils.futures.d<Boolean> f15820v = androidx.work.impl.utils.futures.d.u();

    /* renamed from: w, reason: collision with root package name */
    p4.a<ListenableWorker.a> f15821w = null;

    class a implements Runnable {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ p4.a f15823f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ androidx.work.impl.utils.futures.d f15824g;

        a(p4.a aVar, androidx.work.impl.utils.futures.d dVar) {
            this.f15823f = aVar;
            this.f15824g = dVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                this.f15823f.get();
                d0.j.c().a(j.f15803y, String.format("Starting work for %s", j.this.f15808j.f18479c), new Throwable[0]);
                j jVar = j.this;
                jVar.f15821w = jVar.f15809k.startWork();
                this.f15824g.s(j.this.f15821w);
            } catch (Throwable th) {
                this.f15824g.r(th);
            }
        }
    }

    class b implements Runnable {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ androidx.work.impl.utils.futures.d f15826f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ String f15827g;

        b(androidx.work.impl.utils.futures.d dVar, String str) {
            this.f15826f = dVar;
            this.f15827g = str;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.lang.Runnable
        @SuppressLint({"SyntheticAccessor"})
        public void run() {
            try {
                try {
                    ListenableWorker.a aVar = (ListenableWorker.a) this.f15826f.get();
                    if (aVar == null) {
                        d0.j.c().b(j.f15803y, String.format("%s returned a null result. Treating it as a failure.", j.this.f15808j.f18479c), new Throwable[0]);
                    } else {
                        d0.j.c().a(j.f15803y, String.format("%s returned a %s result.", j.this.f15808j.f18479c, aVar), new Throwable[0]);
                        j.this.f15811m = aVar;
                    }
                } catch (InterruptedException e7) {
                    e = e7;
                    d0.j.c().b(j.f15803y, String.format("%s failed because it threw an exception/error", this.f15827g), e);
                } catch (CancellationException e8) {
                    d0.j.c().d(j.f15803y, String.format("%s was cancelled", this.f15827g), e8);
                } catch (ExecutionException e9) {
                    e = e9;
                    d0.j.c().b(j.f15803y, String.format("%s failed because it threw an exception/error", this.f15827g), e);
                }
            } finally {
                j.this.f();
            }
        }
    }

    public static class c {

        /* renamed from: a, reason: collision with root package name */
        Context f15829a;

        /* renamed from: b, reason: collision with root package name */
        ListenableWorker f15830b;

        /* renamed from: c, reason: collision with root package name */
        k0.a f15831c;

        /* renamed from: d, reason: collision with root package name */
        n0.a f15832d;

        /* renamed from: e, reason: collision with root package name */
        androidx.work.a f15833e;

        /* renamed from: f, reason: collision with root package name */
        WorkDatabase f15834f;

        /* renamed from: g, reason: collision with root package name */
        String f15835g;

        /* renamed from: h, reason: collision with root package name */
        List<e> f15836h;

        /* renamed from: i, reason: collision with root package name */
        WorkerParameters.a f15837i = new WorkerParameters.a();

        public c(Context context, androidx.work.a aVar, n0.a aVar2, k0.a aVar3, WorkDatabase workDatabase, String str) {
            this.f15829a = context.getApplicationContext();
            this.f15832d = aVar2;
            this.f15831c = aVar3;
            this.f15833e = aVar;
            this.f15834f = workDatabase;
            this.f15835g = str;
        }

        public j a() {
            return new j(this);
        }

        public c b(WorkerParameters.a aVar) {
            if (aVar != null) {
                this.f15837i = aVar;
            }
            return this;
        }

        public c c(List<e> list) {
            this.f15836h = list;
            return this;
        }
    }

    j(c cVar) {
        this.f15804f = cVar.f15829a;
        this.f15810l = cVar.f15832d;
        this.f15813o = cVar.f15831c;
        this.f15805g = cVar.f15835g;
        this.f15806h = cVar.f15836h;
        this.f15807i = cVar.f15837i;
        this.f15809k = cVar.f15830b;
        this.f15812n = cVar.f15833e;
        WorkDatabase workDatabase = cVar.f15834f;
        this.f15814p = workDatabase;
        this.f15815q = workDatabase.B();
        this.f15816r = this.f15814p.t();
        this.f15817s = this.f15814p.C();
    }

    private String a(List<String> list) {
        StringBuilder sb = new StringBuilder("Work [ id=");
        sb.append(this.f15805g);
        sb.append(", tags={ ");
        boolean z6 = true;
        for (String str : list) {
            if (z6) {
                z6 = false;
            } else {
                sb.append(", ");
            }
            sb.append(str);
        }
        sb.append(" } ]");
        return sb.toString();
    }

    private void c(ListenableWorker.a aVar) {
        if (aVar instanceof ListenableWorker.a.c) {
            d0.j.c().d(f15803y, String.format("Worker result SUCCESS for %s", this.f15819u), new Throwable[0]);
            if (!this.f15808j.d()) {
                m();
                return;
            }
        } else if (aVar instanceof ListenableWorker.a.b) {
            d0.j.c().d(f15803y, String.format("Worker result RETRY for %s", this.f15819u), new Throwable[0]);
            g();
            return;
        } else {
            d0.j.c().d(f15803y, String.format("Worker result FAILURE for %s", this.f15819u), new Throwable[0]);
            if (!this.f15808j.d()) {
                l();
                return;
            }
        }
        h();
    }

    private void e(String str) {
        LinkedList linkedList = new LinkedList();
        linkedList.add(str);
        while (!linkedList.isEmpty()) {
            String str2 = (String) linkedList.remove();
            if (this.f15815q.h(str2) != s.CANCELLED) {
                this.f15815q.j(s.FAILED, str2);
            }
            linkedList.addAll(this.f15816r.d(str2));
        }
    }

    private void g() {
        this.f15814p.c();
        try {
            this.f15815q.j(s.ENQUEUED, this.f15805g);
            this.f15815q.q(this.f15805g, System.currentTimeMillis());
            this.f15815q.d(this.f15805g, -1L);
            this.f15814p.r();
        } finally {
            this.f15814p.g();
            i(true);
        }
    }

    private void h() {
        this.f15814p.c();
        try {
            this.f15815q.q(this.f15805g, System.currentTimeMillis());
            this.f15815q.j(s.ENQUEUED, this.f15805g);
            this.f15815q.m(this.f15805g);
            this.f15815q.d(this.f15805g, -1L);
            this.f15814p.r();
        } finally {
            this.f15814p.g();
            i(false);
        }
    }

    private void i(boolean z6) {
        ListenableWorker listenableWorker;
        this.f15814p.c();
        try {
            if (!this.f15814p.B().c()) {
                m0.d.a(this.f15804f, RescheduleReceiver.class, false);
            }
            if (z6) {
                this.f15815q.j(s.ENQUEUED, this.f15805g);
                this.f15815q.d(this.f15805g, -1L);
            }
            if (this.f15808j != null && (listenableWorker = this.f15809k) != null && listenableWorker.isRunInForeground()) {
                this.f15813o.c(this.f15805g);
            }
            this.f15814p.r();
            this.f15814p.g();
            this.f15820v.q(Boolean.valueOf(z6));
        } catch (Throwable th) {
            this.f15814p.g();
            throw th;
        }
    }

    private void j() {
        s h7 = this.f15815q.h(this.f15805g);
        if (h7 == s.RUNNING) {
            d0.j.c().a(f15803y, String.format("Status for %s is RUNNING;not doing any work and rescheduling for later execution", this.f15805g), new Throwable[0]);
            i(true);
        } else {
            d0.j.c().a(f15803y, String.format("Status for %s is %s; not doing any work", this.f15805g, h7), new Throwable[0]);
            i(false);
        }
    }

    private void k() {
        androidx.work.b b7;
        if (n()) {
            return;
        }
        this.f15814p.c();
        try {
            p l7 = this.f15815q.l(this.f15805g);
            this.f15808j = l7;
            if (l7 == null) {
                d0.j.c().b(f15803y, String.format("Didn't find WorkSpec for id %s", this.f15805g), new Throwable[0]);
                i(false);
                this.f15814p.r();
                return;
            }
            if (l7.f18478b != s.ENQUEUED) {
                j();
                this.f15814p.r();
                d0.j.c().a(f15803y, String.format("%s is not in ENQUEUED state. Nothing more to do.", this.f15808j.f18479c), new Throwable[0]);
                return;
            }
            if (l7.d() || this.f15808j.c()) {
                long currentTimeMillis = System.currentTimeMillis();
                p pVar = this.f15808j;
                if (!(pVar.f18490n == 0) && currentTimeMillis < pVar.a()) {
                    d0.j.c().a(f15803y, String.format("Delaying execution for %s because it is being executed before schedule.", this.f15808j.f18479c), new Throwable[0]);
                    i(true);
                    this.f15814p.r();
                    return;
                }
            }
            this.f15814p.r();
            this.f15814p.g();
            if (this.f15808j.d()) {
                b7 = this.f15808j.f18481e;
            } else {
                d0.h b8 = this.f15812n.f().b(this.f15808j.f18480d);
                if (b8 == null) {
                    d0.j.c().b(f15803y, String.format("Could not create Input Merger %s", this.f15808j.f18480d), new Throwable[0]);
                    l();
                    return;
                } else {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(this.f15808j.f18481e);
                    arrayList.addAll(this.f15815q.o(this.f15805g));
                    b7 = b8.b(arrayList);
                }
            }
            WorkerParameters workerParameters = new WorkerParameters(UUID.fromString(this.f15805g), b7, this.f15818t, this.f15807i, this.f15808j.f18487k, this.f15812n.e(), this.f15810l, this.f15812n.m(), new m(this.f15814p, this.f15810l), new l(this.f15814p, this.f15813o, this.f15810l));
            if (this.f15809k == null) {
                this.f15809k = this.f15812n.m().b(this.f15804f, this.f15808j.f18479c, workerParameters);
            }
            ListenableWorker listenableWorker = this.f15809k;
            if (listenableWorker == null) {
                d0.j.c().b(f15803y, String.format("Could not create Worker %s", this.f15808j.f18479c), new Throwable[0]);
                l();
                return;
            }
            if (listenableWorker.isUsed()) {
                d0.j.c().b(f15803y, String.format("Received an already-used Worker %s; WorkerFactory should return new instances", this.f15808j.f18479c), new Throwable[0]);
                l();
                return;
            }
            this.f15809k.setUsed();
            if (!o()) {
                j();
                return;
            }
            if (n()) {
                return;
            }
            androidx.work.impl.utils.futures.d u6 = androidx.work.impl.utils.futures.d.u();
            k kVar = new k(this.f15804f, this.f15808j, this.f15809k, workerParameters.b(), this.f15810l);
            this.f15810l.a().execute(kVar);
            p4.a<Void> a7 = kVar.a();
            a7.d(new a(a7, u6), this.f15810l.a());
            u6.d(new b(u6, this.f15819u), this.f15810l.c());
        } finally {
            this.f15814p.g();
        }
    }

    private void m() {
        this.f15814p.c();
        try {
            this.f15815q.j(s.SUCCEEDED, this.f15805g);
            this.f15815q.t(this.f15805g, ((ListenableWorker.a.c) this.f15811m).e());
            long currentTimeMillis = System.currentTimeMillis();
            for (String str : this.f15816r.d(this.f15805g)) {
                if (this.f15815q.h(str) == s.BLOCKED && this.f15816r.a(str)) {
                    d0.j.c().d(f15803y, String.format("Setting status to enqueued for %s", str), new Throwable[0]);
                    this.f15815q.j(s.ENQUEUED, str);
                    this.f15815q.q(str, currentTimeMillis);
                }
            }
            this.f15814p.r();
        } finally {
            this.f15814p.g();
            i(false);
        }
    }

    private boolean n() {
        if (!this.f15822x) {
            return false;
        }
        d0.j.c().a(f15803y, String.format("Work interrupted for %s", this.f15819u), new Throwable[0]);
        if (this.f15815q.h(this.f15805g) == null) {
            i(false);
        } else {
            i(!r0.b());
        }
        return true;
    }

    private boolean o() {
        this.f15814p.c();
        try {
            boolean z6 = true;
            if (this.f15815q.h(this.f15805g) == s.ENQUEUED) {
                this.f15815q.j(s.RUNNING, this.f15805g);
                this.f15815q.p(this.f15805g);
            } else {
                z6 = false;
            }
            this.f15814p.r();
            return z6;
        } finally {
            this.f15814p.g();
        }
    }

    public p4.a<Boolean> b() {
        return this.f15820v;
    }

    public void d() {
        boolean z6;
        this.f15822x = true;
        n();
        p4.a<ListenableWorker.a> aVar = this.f15821w;
        if (aVar != null) {
            z6 = aVar.isDone();
            this.f15821w.cancel(true);
        } else {
            z6 = false;
        }
        ListenableWorker listenableWorker = this.f15809k;
        if (listenableWorker == null || z6) {
            d0.j.c().a(f15803y, String.format("WorkSpec %s is already done. Not interrupting.", this.f15808j), new Throwable[0]);
        } else {
            listenableWorker.stop();
        }
    }

    void f() {
        if (!n()) {
            this.f15814p.c();
            try {
                s h7 = this.f15815q.h(this.f15805g);
                this.f15814p.A().a(this.f15805g);
                if (h7 == null) {
                    i(false);
                } else if (h7 == s.RUNNING) {
                    c(this.f15811m);
                } else if (!h7.b()) {
                    g();
                }
                this.f15814p.r();
            } finally {
                this.f15814p.g();
            }
        }
        List<e> list = this.f15806h;
        if (list != null) {
            Iterator<e> it = list.iterator();
            while (it.hasNext()) {
                it.next().b(this.f15805g);
            }
            f.b(this.f15812n, this.f15814p, this.f15806h);
        }
    }

    void l() {
        this.f15814p.c();
        try {
            e(this.f15805g);
            this.f15815q.t(this.f15805g, ((ListenableWorker.a.C0028a) this.f15811m).e());
            this.f15814p.r();
        } finally {
            this.f15814p.g();
            i(false);
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        List<String> b7 = this.f15817s.b(this.f15805g);
        this.f15818t = b7;
        this.f15819u = a(b7);
        k();
    }
}
