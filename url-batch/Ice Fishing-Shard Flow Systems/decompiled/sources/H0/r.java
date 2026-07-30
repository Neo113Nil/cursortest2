package H0;

import G0.A;
import G0.C;
import G0.C0103c;
import G0.s;
import Q0.u;
import android.content.Context;
import android.database.Cursor;
import androidx.work.WorkerParameters;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.WorkDatabase_Impl;
import androidx.work.impl.background.systemalarm.RescheduleReceiver;
import h0.C0465k;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.ExecutorService;

/* loaded from: classes.dex */
public final class r implements Runnable {

    /* renamed from: A, reason: collision with root package name */
    public static final String f936A = s.f("WorkerWrapper");

    /* renamed from: d, reason: collision with root package name */
    public final Context f937d;

    /* renamed from: e, reason: collision with root package name */
    public final String f938e;

    /* renamed from: i, reason: collision with root package name */
    public final List f939i;

    /* renamed from: l, reason: collision with root package name */
    public final D0.j f940l;

    /* renamed from: m, reason: collision with root package name */
    public final P0.p f941m;

    /* renamed from: n, reason: collision with root package name */
    public G0.r f942n;

    /* renamed from: o, reason: collision with root package name */
    public final D0.j f943o;

    /* renamed from: q, reason: collision with root package name */
    public final C0103c f945q;

    /* renamed from: r, reason: collision with root package name */
    public final f f946r;

    /* renamed from: s, reason: collision with root package name */
    public final WorkDatabase f947s;

    /* renamed from: t, reason: collision with root package name */
    public final P0.q f948t;

    /* renamed from: u, reason: collision with root package name */
    public final P0.c f949u;

    /* renamed from: v, reason: collision with root package name */
    public final ArrayList f950v;

    /* renamed from: w, reason: collision with root package name */
    public String f951w;

    /* renamed from: z, reason: collision with root package name */
    public volatile boolean f954z;

    /* renamed from: p, reason: collision with root package name */
    public G0.q f944p = new G0.n();

    /* renamed from: x, reason: collision with root package name */
    public final R0.k f952x = new R0.k();

    /* renamed from: y, reason: collision with root package name */
    public final R0.k f953y = new R0.k();

    public r(q qVar) {
        this.f937d = qVar.f927a;
        this.f943o = qVar.f929c;
        this.f946r = qVar.f928b;
        P0.p pVar = qVar.f932f;
        this.f941m = pVar;
        this.f938e = pVar.f2220a;
        this.f939i = qVar.f933g;
        this.f940l = qVar.f935i;
        this.f942n = null;
        this.f945q = qVar.f930d;
        WorkDatabase workDatabase = qVar.f931e;
        this.f947s = workDatabase;
        this.f948t = workDatabase.t();
        this.f949u = workDatabase.f();
        this.f950v = qVar.f934h;
    }

    public final void a(G0.q qVar) {
        boolean z7 = qVar instanceof G0.p;
        P0.p pVar = this.f941m;
        String str = f936A;
        if (!z7) {
            if (qVar instanceof G0.o) {
                s.d().e(str, "Worker result RETRY for " + this.f951w);
                c();
                return;
            }
            s.d().e(str, "Worker result FAILURE for " + this.f951w);
            if (pVar.c()) {
                d();
                return;
            } else {
                g();
                return;
            }
        }
        s.d().e(str, "Worker result SUCCESS for " + this.f951w);
        if (pVar.c()) {
            d();
            return;
        }
        P0.c cVar = this.f949u;
        String str2 = this.f938e;
        P0.q qVar2 = this.f948t;
        WorkDatabase workDatabase = this.f947s;
        workDatabase.c();
        try {
            qVar2.k(A.f772i, str2);
            qVar2.j(str2, ((G0.p) this.f944p).f821a);
            long currentTimeMillis = System.currentTimeMillis();
            ArrayList u7 = cVar.u(str2);
            int size = u7.size();
            int i2 = 0;
            while (i2 < size) {
                Object obj = u7.get(i2);
                i2++;
                String str3 = (String) obj;
                if (qVar2.e(str3) == A.f774m) {
                    WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) cVar.f2189e;
                    C0465k g7 = C0465k.g(1, "SELECT COUNT(*)=0 FROM dependency WHERE work_spec_id=? AND prerequisite_id IN (SELECT id FROM workspec WHERE state!=2)");
                    if (str3 == null) {
                        g7.l(1);
                    } else {
                        g7.f(1, str3);
                    }
                    workDatabase_Impl.b();
                    Cursor J7 = V6.b.J(workDatabase_Impl, g7);
                    try {
                        if (J7.moveToFirst() && J7.getInt(0) != 0) {
                            s.d().e(str, "Setting status to enqueued for " + str3);
                            qVar2.k(A.f770d, str3);
                            qVar2.i(str3, currentTimeMillis);
                        }
                    } finally {
                        J7.close();
                        g7.h();
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
        String str = this.f938e;
        WorkDatabase workDatabase = this.f947s;
        if (!h7) {
            workDatabase.c();
            try {
                A e7 = this.f948t.e(str);
                P0.n s7 = workDatabase.s();
                WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) s7.f2214e;
                workDatabase_Impl.b();
                P0.h hVar = (P0.h) s7.f2216l;
                m0.j a7 = hVar.a();
                if (str == null) {
                    a7.l(1);
                } else {
                    a7.f(1, str);
                }
                workDatabase_Impl.c();
                try {
                    a7.a();
                    workDatabase_Impl.o();
                    if (e7 == null) {
                        e(false);
                    } else if (e7 == A.f771e) {
                        a(this.f944p);
                    } else if (!e7.a()) {
                        c();
                    }
                    workDatabase.o();
                    workDatabase.k();
                } finally {
                    workDatabase_Impl.k();
                    hVar.d(a7);
                }
            } catch (Throwable th) {
                workDatabase.k();
                throw th;
            }
        }
        List list = this.f939i;
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ((h) it.next()).a(str);
            }
            i.a(this.f945q, workDatabase, list);
        }
    }

    public final void c() {
        String str = this.f938e;
        P0.q qVar = this.f948t;
        WorkDatabase workDatabase = this.f947s;
        workDatabase.c();
        try {
            qVar.k(A.f770d, str);
            qVar.i(str, System.currentTimeMillis());
            qVar.h(str, -1L);
            workDatabase.o();
        } finally {
            workDatabase.k();
            e(true);
        }
    }

    public final void d() {
        String str = this.f938e;
        P0.q qVar = this.f948t;
        WorkDatabase workDatabase = this.f947s;
        workDatabase.c();
        try {
            qVar.i(str, System.currentTimeMillis());
            WorkDatabase_Impl workDatabase_Impl = qVar.f2239a;
            qVar.k(A.f770d, str);
            workDatabase_Impl.b();
            P0.h hVar = qVar.f2247i;
            m0.j a7 = hVar.a();
            if (str == null) {
                a7.l(1);
            } else {
                a7.f(1, str);
            }
            workDatabase_Impl.c();
            try {
                a7.a();
                workDatabase_Impl.o();
                workDatabase_Impl.k();
                hVar.d(a7);
                workDatabase_Impl.b();
                P0.h hVar2 = qVar.f2243e;
                m0.j a8 = hVar2.a();
                if (str == null) {
                    a8.l(1);
                } else {
                    a8.f(1, str);
                }
                workDatabase_Impl.c();
                try {
                    a8.a();
                    workDatabase_Impl.o();
                    workDatabase_Impl.k();
                    hVar2.d(a8);
                    qVar.h(str, -1L);
                    workDatabase.o();
                } catch (Throwable th) {
                    workDatabase_Impl.k();
                    hVar2.d(a8);
                    throw th;
                }
            } catch (Throwable th2) {
                workDatabase_Impl.k();
                hVar.d(a7);
                throw th2;
            }
        } finally {
            workDatabase.k();
            e(false);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0037 A[Catch: all -> 0x003f, TryCatch #3 {all -> 0x003f, blocks: (B:3:0x0005, B:10:0x002f, B:12:0x0037, B:14:0x0043, B:15:0x0055, B:17:0x0059, B:19:0x005d, B:20:0x0063, B:25:0x006d, B:26:0x0073, B:34:0x0080, B:39:0x0083, B:40:0x0084, B:46:0x0098, B:47:0x009e, B:22:0x0064, B:23:0x006a, B:5:0x001e, B:7:0x0024, B:28:0x0074, B:29:0x007c), top: B:2:0x0005, inners: #0, #1, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0043 A[Catch: all -> 0x003f, TryCatch #3 {all -> 0x003f, blocks: (B:3:0x0005, B:10:0x002f, B:12:0x0037, B:14:0x0043, B:15:0x0055, B:17:0x0059, B:19:0x005d, B:20:0x0063, B:25:0x006d, B:26:0x0073, B:34:0x0080, B:39:0x0083, B:40:0x0084, B:46:0x0098, B:47:0x009e, B:22:0x0064, B:23:0x006a, B:5:0x001e, B:7:0x0024, B:28:0x0074, B:29:0x007c), top: B:2:0x0005, inners: #0, #1, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0064 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void e(boolean z7) {
        boolean z8;
        f fVar;
        boolean containsKey;
        this.f947s.c();
        try {
            P0.q t6 = this.f947s.t();
            t6.getClass();
            C0465k g7 = C0465k.g(0, "SELECT COUNT(*) > 0 FROM workspec WHERE state NOT IN (2, 3, 5) LIMIT 1");
            WorkDatabase_Impl workDatabase_Impl = t6.f2239a;
            workDatabase_Impl.b();
            Cursor J7 = V6.b.J(workDatabase_Impl, g7);
            try {
                if (J7.moveToFirst()) {
                    if (J7.getInt(0) != 0) {
                        z8 = true;
                        if (!z8) {
                            Q0.k.a(this.f937d, RescheduleReceiver.class, false);
                        }
                        if (z7) {
                            this.f948t.k(A.f770d, this.f938e);
                            this.f948t.h(this.f938e, -1L);
                        }
                        if (this.f941m != null && this.f942n != null) {
                            fVar = this.f946r;
                            String str = this.f938e;
                            synchronized (fVar.f898t) {
                                containsKey = fVar.f892n.containsKey(str);
                            }
                            if (containsKey) {
                                f fVar2 = this.f946r;
                                String str2 = this.f938e;
                                synchronized (fVar2.f898t) {
                                    fVar2.f892n.remove(str2);
                                    fVar2.i();
                                }
                            }
                        }
                        this.f947s.o();
                        this.f947s.k();
                        this.f952x.i(Boolean.valueOf(z7));
                    }
                }
                z8 = false;
                if (!z8) {
                }
                if (z7) {
                }
                if (this.f941m != null) {
                    fVar = this.f946r;
                    String str3 = this.f938e;
                    synchronized (fVar.f898t) {
                    }
                }
                this.f947s.o();
                this.f947s.k();
                this.f952x.i(Boolean.valueOf(z7));
            } finally {
                J7.close();
                g7.h();
            }
        } catch (Throwable th) {
            this.f947s.k();
            throw th;
        }
    }

    public final void f() {
        P0.q qVar = this.f948t;
        String str = this.f938e;
        A e7 = qVar.e(str);
        A a7 = A.f771e;
        String str2 = f936A;
        if (e7 == a7) {
            s.d().a(str2, "Status for " + str + " is RUNNING; not doing any work and rescheduling for later execution");
            e(true);
            return;
        }
        s.d().a(str2, "Status for " + str + " is " + e7 + " ; not doing any work");
        e(false);
    }

    public final void g() {
        String str = this.f938e;
        WorkDatabase workDatabase = this.f947s;
        workDatabase.c();
        try {
            LinkedList linkedList = new LinkedList();
            linkedList.add(str);
            while (true) {
                boolean isEmpty = linkedList.isEmpty();
                P0.q qVar = this.f948t;
                if (isEmpty) {
                    qVar.j(str, ((G0.n) this.f944p).f820a);
                    workDatabase.o();
                    return;
                } else {
                    String str2 = (String) linkedList.remove();
                    if (qVar.e(str2) != A.f775n) {
                        qVar.k(A.f773l, str2);
                    }
                    linkedList.addAll(this.f949u.u(str2));
                }
            }
        } finally {
            workDatabase.k();
            e(false);
        }
    }

    public final boolean h() {
        if (!this.f954z) {
            return false;
        }
        s.d().a(f936A, "Work interrupted for " + this.f951w);
        if (this.f948t.e(this.f938e) == null) {
            e(false);
            return true;
        }
        e(!r0.a());
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x008f, code lost:
    
        if ((r4.f2221b == r10 && r4.f2229k > 0) != false) goto L30;
     */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        G0.k kVar;
        G0.h a7;
        boolean z7;
        StringBuilder sb = new StringBuilder("Work [ id=");
        String str = this.f938e;
        sb.append(str);
        sb.append(", tags={ ");
        ArrayList arrayList = this.f950v;
        int size = arrayList.size();
        boolean z8 = true;
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList.get(i2);
            i2++;
            String str2 = (String) obj;
            if (z8) {
                z8 = false;
            } else {
                sb.append(", ");
            }
            sb.append(str2);
        }
        sb.append(" } ]");
        this.f951w = sb.toString();
        P0.p pVar = this.f941m;
        if (h()) {
            return;
        }
        WorkDatabase workDatabase = this.f947s;
        workDatabase.c();
        try {
            A a8 = pVar.f2221b;
            String str3 = pVar.f2222c;
            A a9 = A.f770d;
            String str4 = f936A;
            if (a8 != a9) {
                f();
                workDatabase.o();
                s.d().a(str4, str3 + " is not in ENQUEUED state. Nothing more to do");
                return;
            }
            if (!pVar.c()) {
            }
            if (System.currentTimeMillis() < pVar.a()) {
                s.d().a(str4, "Delaying execution for " + str3 + " because it is being executed before schedule.");
                e(true);
                workDatabase.o();
                return;
            }
            workDatabase.o();
            workDatabase.k();
            boolean c7 = pVar.c();
            P0.q qVar = this.f948t;
            C0103c c0103c = this.f945q;
            if (c7) {
                a7 = pVar.f2224e;
            } else {
                q1.h hVar = c0103c.f786d;
                String str5 = pVar.f2223d;
                hVar.getClass();
                String str6 = G0.k.f816a;
                try {
                    kVar = (G0.k) Class.forName(str5).getDeclaredConstructor(null).newInstance(null);
                } catch (Exception e7) {
                    s.d().c(G0.k.f816a, "Trouble instantiating + " + str5, e7);
                    kVar = null;
                }
                if (kVar == null) {
                    s.d().b(str4, "Could not create Input Merger " + pVar.f2223d);
                    g();
                    return;
                }
                ArrayList arrayList2 = new ArrayList();
                arrayList2.add(pVar.f2224e);
                WorkDatabase_Impl workDatabase_Impl = qVar.f2239a;
                C0465k g7 = C0465k.g(1, "SELECT output FROM workspec WHERE id IN\n             (SELECT prerequisite_id FROM dependency WHERE work_spec_id=?)");
                if (str == null) {
                    g7.l(1);
                } else {
                    g7.f(1, str);
                }
                workDatabase_Impl.b();
                Cursor J7 = V6.b.J(workDatabase_Impl, g7);
                try {
                    ArrayList arrayList3 = new ArrayList(J7.getCount());
                    while (J7.moveToNext()) {
                        arrayList3.add(G0.h.a(J7.isNull(0) ? null : J7.getBlob(0)));
                    }
                    J7.close();
                    g7.h();
                    arrayList2.addAll(arrayList3);
                    a7 = kVar.a(arrayList2);
                } catch (Throwable th) {
                    J7.close();
                    g7.h();
                    throw th;
                }
            }
            UUID fromString = UUID.fromString(str);
            int i5 = pVar.f2229k;
            ExecutorService executorService = c0103c.f783a;
            C c8 = c0103c.f785c;
            D0.j jVar = this.f943o;
            u uVar = new u(workDatabase, jVar);
            Q0.s sVar = new Q0.s(workDatabase, this.f946r, jVar);
            WorkerParameters workerParameters = new WorkerParameters();
            workerParameters.f4082a = fromString;
            workerParameters.f4083b = a7;
            workerParameters.f4084c = new HashSet(arrayList);
            workerParameters.f4085d = this.f940l;
            workerParameters.f4086e = i5;
            workerParameters.f4087f = executorService;
            workerParameters.f4088g = jVar;
            workerParameters.f4089h = c8;
            workerParameters.f4090i = uVar;
            workerParameters.j = sVar;
            if (this.f942n == null) {
                this.f942n = c8.a(this.f937d, str3, workerParameters);
            }
            G0.r rVar = this.f942n;
            if (rVar == null) {
                s.d().b(str4, "Could not create Worker " + str3);
                g();
                return;
            }
            if (rVar.isUsed()) {
                s.d().b(str4, "Received an already-used Worker " + str3 + "; Worker Factory should return new instances");
                g();
                return;
            }
            this.f942n.setUsed();
            workDatabase.c();
            try {
                if (qVar.e(str) == a9) {
                    qVar.k(A.f771e, str);
                    WorkDatabase_Impl workDatabase_Impl2 = qVar.f2239a;
                    workDatabase_Impl2.b();
                    P0.h hVar2 = qVar.f2246h;
                    m0.j a10 = hVar2.a();
                    if (str == null) {
                        a10.l(1);
                    } else {
                        a10.f(1, str);
                    }
                    workDatabase_Impl2.c();
                    try {
                        a10.a();
                        workDatabase_Impl2.o();
                        workDatabase_Impl2.k();
                        hVar2.d(a10);
                        z7 = true;
                    } catch (Throwable th2) {
                        workDatabase_Impl2.k();
                        hVar2.d(a10);
                        throw th2;
                    }
                } else {
                    z7 = false;
                }
                workDatabase.o();
                if (!z7) {
                    f();
                    return;
                }
                if (h()) {
                    return;
                }
                Q0.q qVar2 = new Q0.q(this.f937d, this.f941m, this.f942n, sVar, this.f943o);
                ((K1.o) jVar.f332l).execute(qVar2);
                R0.k kVar2 = qVar2.f2323d;
                A.j jVar2 = new A.j(this, 4, kVar2);
                K1.n nVar = new K1.n(1);
                R0.k kVar3 = this.f953y;
                kVar3.a(jVar2, nVar);
                boolean z9 = false;
                kVar2.a(new F.a(4, this, kVar2, z9), (K1.o) jVar.f332l);
                kVar3.a(new F.a(5, this, this.f951w, z9), (Q0.m) jVar.f330e);
            } catch (Throwable th3) {
                throw th3;
            }
        } finally {
            workDatabase.k();
        }
    }
}
