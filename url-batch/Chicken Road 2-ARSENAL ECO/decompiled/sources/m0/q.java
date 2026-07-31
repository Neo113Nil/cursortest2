package m0;

import android.content.Context;
import android.database.Cursor;
import androidx.work.WorkerParameters;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.WorkDatabase_Impl;
import androidx.work.impl.background.systemalarm.RescheduleReceiver;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.ExecutorService;
import l0.C0488b;
import l0.x;
import u0.C0673c;
import u0.C0678h;
import u0.C0684n;
import u0.C0686p;
import u0.C0687q;
import v0.r;

/* loaded from: classes.dex */
public final class q implements Runnable {

    /* renamed from: x, reason: collision with root package name */
    public static final String f5392x = l0.q.f("WorkerWrapper");

    /* renamed from: f, reason: collision with root package name */
    public final Context f5393f;

    /* renamed from: g, reason: collision with root package name */
    public final String f5394g;

    /* renamed from: h, reason: collision with root package name */
    public final List f5395h;

    /* renamed from: i, reason: collision with root package name */
    public final B0.c f5396i;

    /* renamed from: j, reason: collision with root package name */
    public final C0686p f5397j;

    /* renamed from: k, reason: collision with root package name */
    public l0.p f5398k;

    /* renamed from: l, reason: collision with root package name */
    public final B0.c f5399l;

    /* renamed from: n, reason: collision with root package name */
    public final C0488b f5401n;

    /* renamed from: o, reason: collision with root package name */
    public final f f5402o;

    /* renamed from: p, reason: collision with root package name */
    public final WorkDatabase f5403p;

    /* renamed from: q, reason: collision with root package name */
    public final C0687q f5404q;

    /* renamed from: r, reason: collision with root package name */
    public final C0673c f5405r;

    /* renamed from: s, reason: collision with root package name */
    public final ArrayList f5406s;

    /* renamed from: t, reason: collision with root package name */
    public String f5407t;

    /* renamed from: w, reason: collision with root package name */
    public volatile boolean f5410w;

    /* renamed from: m, reason: collision with root package name */
    public l0.o f5400m = new l0.l();

    /* renamed from: u, reason: collision with root package name */
    public final w0.j f5408u = new w0.j();

    /* renamed from: v, reason: collision with root package name */
    public final w0.j f5409v = new w0.j();

    public q(p pVar) {
        this.f5393f = pVar.f5383a;
        this.f5399l = pVar.f5385c;
        this.f5402o = pVar.f5384b;
        C0686p c0686p = pVar.f5388f;
        this.f5397j = c0686p;
        this.f5394g = c0686p.f6000a;
        this.f5395h = pVar.f5389g;
        this.f5396i = pVar.f5391i;
        this.f5398k = null;
        this.f5401n = pVar.f5386d;
        WorkDatabase workDatabase = pVar.f5387e;
        this.f5403p = workDatabase;
        this.f5404q = workDatabase.t();
        this.f5405r = workDatabase.f();
        this.f5406s = pVar.f5390h;
    }

    public final void a(l0.o oVar) {
        boolean z5 = oVar instanceof l0.n;
        C0686p c0686p = this.f5397j;
        String str = f5392x;
        if (!z5) {
            if (oVar instanceof l0.m) {
                l0.q.d().e(str, "Worker result RETRY for " + this.f5407t);
                c();
                return;
            }
            l0.q.d().e(str, "Worker result FAILURE for " + this.f5407t);
            if (c0686p.c()) {
                d();
                return;
            } else {
                g();
                return;
            }
        }
        l0.q.d().e(str, "Worker result SUCCESS for " + this.f5407t);
        if (c0686p.c()) {
            d();
            return;
        }
        C0673c c0673c = this.f5405r;
        String str2 = this.f5394g;
        C0687q c0687q = this.f5404q;
        WorkDatabase workDatabase = this.f5403p;
        workDatabase.c();
        try {
            c0687q.k(str2, 3);
            c0687q.j(str2, ((l0.n) this.f5400m).f5280a);
            long currentTimeMillis = System.currentTimeMillis();
            ArrayList f7 = c0673c.f(str2);
            int size = f7.size();
            int i7 = 0;
            while (i7 < size) {
                Object obj = f7.get(i7);
                i7++;
                String str3 = (String) obj;
                if (c0687q.e(str3) == 5) {
                    WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) c0673c.f5968f;
                    Q.k e4 = Q.k.e("SELECT COUNT(*)=0 FROM dependency WHERE work_spec_id=? AND prerequisite_id IN (SELECT id FROM workspec WHERE state!=2)", 1);
                    if (str3 == null) {
                        e4.o(1);
                    } else {
                        e4.B(str3, 1);
                    }
                    workDatabase_Impl.b();
                    Cursor m4 = workDatabase_Impl.m(e4);
                    try {
                        if (m4.moveToFirst() && m4.getInt(0) != 0) {
                            l0.q.d().e(str, "Setting status to enqueued for " + str3);
                            c0687q.k(str3, 1);
                            c0687q.i(currentTimeMillis, str3);
                        }
                    } finally {
                        m4.close();
                        e4.g();
                    }
                }
            }
            workDatabase.o();
            workDatabase.k();
            e(false);
        } catch (Throwable th) {
            workDatabase.k();
            e(false);
            throw th;
        }
    }

    public final void b() {
        boolean h7 = h();
        String str = this.f5394g;
        WorkDatabase workDatabase = this.f5403p;
        if (!h7) {
            workDatabase.c();
            try {
                int e4 = this.f5404q.e(str);
                C0684n s6 = workDatabase.s();
                WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) s6.f5994g;
                workDatabase_Impl.b();
                C0678h c0678h = (C0678h) s6.f5996i;
                V.i a7 = c0678h.a();
                if (str == null) {
                    a7.o(1);
                } else {
                    a7.B(str, 1);
                }
                workDatabase_Impl.c();
                try {
                    a7.a();
                    workDatabase_Impl.o();
                    if (e4 == 0) {
                        e(false);
                    } else if (e4 == 2) {
                        a(this.f5400m);
                    } else if (!W4.o.a(e4)) {
                        c();
                    }
                    workDatabase.o();
                    workDatabase.k();
                } finally {
                    workDatabase_Impl.k();
                    c0678h.n(a7);
                }
            } catch (Throwable th) {
                workDatabase.k();
                throw th;
            }
        }
        List list = this.f5395h;
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ((h) it.next()).a(str);
            }
            i.a(this.f5401n, workDatabase, list);
        }
    }

    public final void c() {
        String str = this.f5394g;
        C0687q c0687q = this.f5404q;
        WorkDatabase workDatabase = this.f5403p;
        workDatabase.c();
        try {
            c0687q.k(str, 1);
            c0687q.i(System.currentTimeMillis(), str);
            c0687q.h(-1L, str);
            workDatabase.o();
        } finally {
            workDatabase.k();
            e(true);
        }
    }

    public final void d() {
        String str = this.f5394g;
        C0687q c0687q = this.f5404q;
        WorkDatabase workDatabase = this.f5403p;
        workDatabase.c();
        try {
            c0687q.i(System.currentTimeMillis(), str);
            WorkDatabase_Impl workDatabase_Impl = c0687q.f6020a;
            c0687q.k(str, 1);
            workDatabase_Impl.b();
            C0678h c0678h = c0687q.f6028i;
            V.i a7 = c0678h.a();
            if (str == null) {
                a7.o(1);
            } else {
                a7.B(str, 1);
            }
            workDatabase_Impl.c();
            try {
                a7.a();
                workDatabase_Impl.o();
                workDatabase_Impl.k();
                c0678h.n(a7);
                workDatabase_Impl.b();
                C0678h c0678h2 = c0687q.f6024e;
                V.i a8 = c0678h2.a();
                if (str == null) {
                    a8.o(1);
                } else {
                    a8.B(str, 1);
                }
                workDatabase_Impl.c();
                try {
                    a8.a();
                    workDatabase_Impl.o();
                    workDatabase_Impl.k();
                    c0678h2.n(a8);
                    c0687q.h(-1L, str);
                    workDatabase.o();
                } catch (Throwable th) {
                    workDatabase_Impl.k();
                    c0678h2.n(a8);
                    throw th;
                }
            } catch (Throwable th2) {
                workDatabase_Impl.k();
                c0678h.n(a7);
                throw th2;
            }
        } finally {
            workDatabase.k();
            e(false);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0038 A[Catch: all -> 0x0040, TryCatch #1 {all -> 0x0040, blocks: (B:3:0x0005, B:10:0x0030, B:12:0x0038, B:14:0x0044, B:15:0x0054, B:17:0x0058, B:19:0x005c, B:20:0x0062, B:25:0x006c, B:26:0x0072, B:34:0x007f, B:39:0x0082, B:40:0x0083, B:46:0x0097, B:47:0x009d, B:22:0x0063, B:23:0x0069, B:28:0x0073, B:29:0x007b, B:5:0x001e, B:7:0x0025), top: B:2:0x0005, inners: #0, #2, #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0044 A[Catch: all -> 0x0040, TryCatch #1 {all -> 0x0040, blocks: (B:3:0x0005, B:10:0x0030, B:12:0x0038, B:14:0x0044, B:15:0x0054, B:17:0x0058, B:19:0x005c, B:20:0x0062, B:25:0x006c, B:26:0x0072, B:34:0x007f, B:39:0x0082, B:40:0x0083, B:46:0x0097, B:47:0x009d, B:22:0x0063, B:23:0x0069, B:28:0x0073, B:29:0x007b, B:5:0x001e, B:7:0x0025), top: B:2:0x0005, inners: #0, #2, #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0063 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void e(boolean z5) {
        boolean z6;
        f fVar;
        boolean containsKey;
        this.f5403p.c();
        try {
            C0687q t6 = this.f5403p.t();
            t6.getClass();
            Q.k e4 = Q.k.e("SELECT COUNT(*) > 0 FROM workspec WHERE state NOT IN (2, 3, 5) LIMIT 1", 0);
            WorkDatabase_Impl workDatabase_Impl = t6.f6020a;
            workDatabase_Impl.b();
            Cursor m4 = workDatabase_Impl.m(e4);
            try {
                if (m4.moveToFirst()) {
                    if (m4.getInt(0) != 0) {
                        z6 = true;
                        if (!z6) {
                            v0.i.a(this.f5393f, RescheduleReceiver.class, false);
                        }
                        if (z5) {
                            this.f5404q.k(this.f5394g, 1);
                            this.f5404q.h(-1L, this.f5394g);
                        }
                        if (this.f5397j != null && this.f5398k != null) {
                            fVar = this.f5402o;
                            String str = this.f5394g;
                            synchronized (fVar.f5354q) {
                                containsKey = fVar.f5348k.containsKey(str);
                            }
                            if (containsKey) {
                                f fVar2 = this.f5402o;
                                String str2 = this.f5394g;
                                synchronized (fVar2.f5354q) {
                                    fVar2.f5348k.remove(str2);
                                    fVar2.i();
                                }
                            }
                        }
                        this.f5403p.o();
                        this.f5403p.k();
                        this.f5408u.i(Boolean.valueOf(z5));
                    }
                }
                z6 = false;
                if (!z6) {
                }
                if (z5) {
                }
                if (this.f5397j != null) {
                    fVar = this.f5402o;
                    String str3 = this.f5394g;
                    synchronized (fVar.f5354q) {
                    }
                }
                this.f5403p.o();
                this.f5403p.k();
                this.f5408u.i(Boolean.valueOf(z5));
            } finally {
                m4.close();
                e4.g();
            }
        } catch (Throwable th) {
            this.f5403p.k();
            throw th;
        }
    }

    public final void f() {
        C0687q c0687q = this.f5404q;
        String str = this.f5394g;
        int e4 = c0687q.e(str);
        String str2 = f5392x;
        if (e4 == 2) {
            l0.q.d().a(str2, "Status for " + str + " is RUNNING; not doing any work and rescheduling for later execution");
            e(true);
            return;
        }
        l0.q.d().a(str2, "Status for " + str + " is " + W4.o.h(e4) + " ; not doing any work");
        e(false);
    }

    public final void g() {
        String str = this.f5394g;
        WorkDatabase workDatabase = this.f5403p;
        workDatabase.c();
        try {
            LinkedList linkedList = new LinkedList();
            linkedList.add(str);
            while (true) {
                boolean isEmpty = linkedList.isEmpty();
                C0687q c0687q = this.f5404q;
                if (isEmpty) {
                    c0687q.j(str, ((l0.l) this.f5400m).f5279a);
                    workDatabase.o();
                    return;
                } else {
                    String str2 = (String) linkedList.remove();
                    if (c0687q.e(str2) != 6) {
                        c0687q.k(str2, 4);
                    }
                    linkedList.addAll(this.f5405r.f(str2));
                }
            }
        } finally {
            workDatabase.k();
            e(false);
        }
    }

    public final boolean h() {
        if (!this.f5410w) {
            return false;
        }
        l0.q.d().a(f5392x, "Work interrupted for " + this.f5407t);
        if (this.f5404q.e(this.f5394g) == 0) {
            e(false);
            return true;
        }
        e(!W4.o.a(r0));
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x008d, code lost:
    
        if ((r4.f6001b == 1 && r4.f6010k > 0) != false) goto L30;
     */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        l0.j jVar;
        l0.g a7;
        boolean z5;
        StringBuilder sb = new StringBuilder("Work [ id=");
        String str = this.f5394g;
        sb.append(str);
        sb.append(", tags={ ");
        ArrayList arrayList = this.f5406s;
        int size = arrayList.size();
        boolean z6 = true;
        int i7 = 0;
        while (i7 < size) {
            Object obj = arrayList.get(i7);
            i7++;
            String str2 = (String) obj;
            if (z6) {
                z6 = false;
            } else {
                sb.append(", ");
            }
            sb.append(str2);
        }
        sb.append(" } ]");
        this.f5407t = sb.toString();
        C0686p c0686p = this.f5397j;
        if (h()) {
            return;
        }
        WorkDatabase workDatabase = this.f5403p;
        workDatabase.c();
        try {
            int i8 = c0686p.f6001b;
            String str3 = c0686p.f6002c;
            String str4 = f5392x;
            if (i8 != 1) {
                f();
                workDatabase.o();
                l0.q.d().a(str4, str3 + " is not in ENQUEUED state. Nothing more to do");
                return;
            }
            if (!c0686p.c()) {
            }
            if (System.currentTimeMillis() < c0686p.a()) {
                l0.q.d().a(str4, "Delaying execution for " + str3 + " because it is being executed before schedule.");
                e(true);
                workDatabase.o();
                return;
            }
            workDatabase.o();
            workDatabase.k();
            boolean c7 = c0686p.c();
            C0687q c0687q = this.f5404q;
            C0488b c0488b = this.f5401n;
            if (c7) {
                a7 = c0686p.f6004e;
            } else {
                R0.g gVar = c0488b.f5247d;
                String str5 = c0686p.f6003d;
                gVar.getClass();
                String str6 = l0.j.f5277a;
                try {
                    jVar = (l0.j) Class.forName(str5).getDeclaredConstructor(null).newInstance(null);
                } catch (Exception e4) {
                    l0.q.d().c(l0.j.f5277a, "Trouble instantiating + " + str5, e4);
                    jVar = null;
                }
                if (jVar == null) {
                    l0.q.d().b(str4, "Could not create Input Merger " + c0686p.f6003d);
                    g();
                    return;
                }
                ArrayList arrayList2 = new ArrayList();
                arrayList2.add(c0686p.f6004e);
                WorkDatabase_Impl workDatabase_Impl = c0687q.f6020a;
                Q.k e7 = Q.k.e("SELECT output FROM workspec WHERE id IN\n             (SELECT prerequisite_id FROM dependency WHERE work_spec_id=?)", 1);
                if (str == null) {
                    e7.o(1);
                } else {
                    e7.B(str, 1);
                }
                workDatabase_Impl.b();
                Cursor m4 = workDatabase_Impl.m(e7);
                try {
                    ArrayList arrayList3 = new ArrayList(m4.getCount());
                    while (m4.moveToNext()) {
                        arrayList3.add(l0.g.a(m4.isNull(0) ? null : m4.getBlob(0)));
                    }
                    m4.close();
                    e7.g();
                    arrayList2.addAll(arrayList3);
                    a7 = jVar.a(arrayList2);
                } catch (Throwable th) {
                    m4.close();
                    e7.g();
                    throw th;
                }
            }
            UUID fromString = UUID.fromString(str);
            int i9 = c0686p.f6010k;
            ExecutorService executorService = c0488b.f5244a;
            x xVar = c0488b.f5246c;
            B0.c cVar = this.f5399l;
            r rVar = new r(workDatabase, cVar);
            v0.q qVar = new v0.q(workDatabase, this.f5402o, cVar);
            WorkerParameters workerParameters = new WorkerParameters();
            workerParameters.f3551a = fromString;
            workerParameters.f3552b = a7;
            workerParameters.f3553c = new HashSet(arrayList);
            workerParameters.f3554d = this.f5396i;
            workerParameters.f3555e = i9;
            workerParameters.f3556f = executorService;
            workerParameters.f3557g = cVar;
            workerParameters.f3558h = xVar;
            workerParameters.f3559i = rVar;
            workerParameters.f3560j = qVar;
            if (this.f5398k == null) {
                this.f5398k = xVar.a(this.f5393f, str3, workerParameters);
            }
            l0.p pVar = this.f5398k;
            if (pVar == null) {
                l0.q.d().b(str4, "Could not create Worker " + str3);
                g();
                return;
            }
            if (pVar.isUsed()) {
                l0.q.d().b(str4, "Received an already-used Worker " + str3 + "; Worker Factory should return new instances");
                g();
                return;
            }
            this.f5398k.setUsed();
            workDatabase.c();
            try {
                if (c0687q.e(str) == 1) {
                    c0687q.k(str, 2);
                    WorkDatabase_Impl workDatabase_Impl2 = c0687q.f6020a;
                    workDatabase_Impl2.b();
                    C0678h c0678h = c0687q.f6027h;
                    V.i a8 = c0678h.a();
                    if (str == null) {
                        a8.o(1);
                    } else {
                        a8.B(str, 1);
                    }
                    workDatabase_Impl2.c();
                    try {
                        a8.a();
                        workDatabase_Impl2.o();
                        workDatabase_Impl2.k();
                        c0678h.n(a8);
                        z5 = true;
                    } catch (Throwable th2) {
                        workDatabase_Impl2.k();
                        c0678h.n(a8);
                        throw th2;
                    }
                } else {
                    z5 = false;
                }
                workDatabase.o();
                if (!z5) {
                    f();
                    return;
                }
                if (h()) {
                    return;
                }
                v0.o oVar = new v0.o(this.f5393f, this.f5397j, this.f5398k, qVar, this.f5399l);
                ((D0.q) cVar.f71g).execute(oVar);
                w0.j jVar2 = oVar.f6082f;
                G4.c cVar2 = new G4.c(this, 6, jVar2);
                k1.m mVar = new k1.m(1);
                w0.j jVar3 = this.f5409v;
                jVar3.a(cVar2, mVar);
                jVar2.a(new A.a(this, jVar2, 22, false), (D0.q) cVar.f71g);
                jVar3.a(new A.a(this, this.f5407t, 23, false), (v0.k) cVar.f72h);
            } catch (Throwable th3) {
                throw th3;
            }
        } finally {
            workDatabase.k();
        }
    }
}
