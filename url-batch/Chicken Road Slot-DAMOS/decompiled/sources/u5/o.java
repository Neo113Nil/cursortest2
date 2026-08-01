package u5;

import android.content.Context;
import android.database.Cursor;
import androidx.work.WorkerParameters;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.WorkDatabase_Impl;
import androidx.work.impl.background.systemalarm.RescheduleReceiver;
import c6.p;
import c6.q;
import d6.s;
import d6.u;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.ExecutorService;
import s7.c0;
import t5.v;
import z4.z;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class o implements Runnable {
    public static final String G = t5.o.f("WorkerWrapper");
    public final c6.c A;
    public final ArrayList B;
    public String C;
    public volatile boolean F;

    /* renamed from: d, reason: collision with root package name */
    public final Context f9660d;

    /* renamed from: e, reason: collision with root package name */
    public final String f9661e;

    /* renamed from: i, reason: collision with root package name */
    public final List f9662i;

    /* renamed from: r, reason: collision with root package name */
    public final p.e f9663r;

    /* renamed from: s, reason: collision with root package name */
    public final p f9664s;

    /* renamed from: t, reason: collision with root package name */
    public t5.n f9665t;

    /* renamed from: u, reason: collision with root package name */
    public final a1.n f9666u;

    /* renamed from: w, reason: collision with root package name */
    public final t5.b f9668w;

    /* renamed from: x, reason: collision with root package name */
    public final e f9669x;

    /* renamed from: y, reason: collision with root package name */
    public final WorkDatabase f9670y;

    /* renamed from: z, reason: collision with root package name */
    public final q f9671z;

    /* renamed from: v, reason: collision with root package name */
    public t5.m f9667v = new t5.j();
    public final e6.j D = new e6.j();
    public final e6.j E = new e6.j();

    public o(q6.i iVar) {
        this.f9660d = iVar.f8051a;
        this.f9666u = (a1.n) iVar.f8053c;
        this.f9669x = (e) iVar.f8052b;
        p pVar = (p) iVar.f8056f;
        this.f9664s = pVar;
        this.f9661e = pVar.f1839a;
        this.f9662i = (List) iVar.g;
        this.f9663r = (p.e) iVar.f8058i;
        this.f9665t = null;
        this.f9668w = (t5.b) iVar.f8054d;
        WorkDatabase workDatabase = (WorkDatabase) iVar.f8055e;
        this.f9670y = workDatabase;
        this.f9671z = workDatabase.B();
        this.A = workDatabase.w();
        this.B = (ArrayList) iVar.f8057h;
    }

    public final void a(t5.m mVar) {
        boolean z10 = mVar instanceof t5.l;
        p pVar = this.f9664s;
        String str = G;
        if (!z10) {
            if (mVar instanceof t5.k) {
                t5.o.d().e(str, "Worker result RETRY for " + this.C);
                c();
                return;
            }
            t5.o.d().e(str, "Worker result FAILURE for " + this.C);
            if (pVar.c()) {
                d();
                return;
            } else {
                g();
                return;
            }
        }
        t5.o.d().e(str, "Worker result SUCCESS for " + this.C);
        if (pVar.c()) {
            d();
            return;
        }
        c6.c cVar = this.A;
        String str2 = this.f9661e;
        q qVar = this.f9671z;
        WorkDatabase workDatabase = this.f9670y;
        workDatabase.c();
        try {
            qVar.p(3, str2);
            qVar.o(str2, ((t5.l) this.f9667v).f9311a);
            long currentTimeMillis = System.currentTimeMillis();
            ArrayList e2 = cVar.e(str2);
            int size = e2.size();
            int i3 = 0;
            while (i3 < size) {
                Object obj = e2.get(i3);
                i3++;
                String str3 = (String) obj;
                if (qVar.i(str3) == 5) {
                    WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) cVar.f1809e;
                    z a9 = z.a(1, "SELECT COUNT(*)=0 FROM dependency WHERE work_spec_id=? AND prerequisite_id IN (SELECT id FROM workspec WHERE state!=2)");
                    if (str3 == null) {
                        a9.r(1);
                    } else {
                        a9.l(1, str3);
                    }
                    workDatabase_Impl.b();
                    Cursor E = cf.c.E(workDatabase_Impl, a9);
                    try {
                        if (E.moveToFirst() && E.getInt(0) != 0) {
                            t5.o.d().e(str, "Setting status to enqueued for " + str3);
                            qVar.p(1, str3);
                            qVar.n(str3, currentTimeMillis);
                        }
                    } finally {
                        E.close();
                        a9.d();
                    }
                }
            }
            workDatabase.u();
            workDatabase.h();
            e(false);
        } catch (Throwable th) {
            workDatabase.h();
            e(false);
            throw th;
        }
    }

    public final void b() {
        boolean h10 = h();
        String str = this.f9661e;
        WorkDatabase workDatabase = this.f9670y;
        if (!h10) {
            workDatabase.c();
            try {
                int i3 = this.f9671z.i(str);
                c6.n A = workDatabase.A();
                WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) A.f1833d;
                workDatabase_Impl.b();
                c6.h hVar = (c6.h) A.f1835i;
                k5.k a9 = hVar.a();
                if (str == null) {
                    a9.r(1);
                } else {
                    a9.l(1, str);
                }
                workDatabase_Impl.c();
                try {
                    a9.a();
                    workDatabase_Impl.u();
                    if (i3 == 0) {
                        e(false);
                    } else if (i3 == 2) {
                        a(this.f9667v);
                    } else if (!n0.l.a(i3)) {
                        c();
                    }
                    workDatabase.u();
                    workDatabase.h();
                } finally {
                    workDatabase_Impl.h();
                    hVar.c(a9);
                }
            } catch (Throwable th) {
                workDatabase.h();
                throw th;
            }
        }
        List list = this.f9662i;
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ((g) it.next()).a(str);
            }
            h.a(this.f9668w, workDatabase, list);
        }
    }

    public final void c() {
        String str = this.f9661e;
        q qVar = this.f9671z;
        WorkDatabase workDatabase = this.f9670y;
        workDatabase.c();
        try {
            qVar.p(1, str);
            qVar.n(str, System.currentTimeMillis());
            qVar.l(str, -1L);
            workDatabase.u();
        } finally {
            workDatabase.h();
            e(true);
        }
    }

    public final void d() {
        String str = this.f9661e;
        q qVar = this.f9671z;
        WorkDatabase workDatabase = this.f9670y;
        workDatabase.c();
        try {
            qVar.n(str, System.currentTimeMillis());
            WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) qVar.f1857a;
            qVar.p(1, str);
            workDatabase_Impl.b();
            c6.h hVar = (c6.h) qVar.f1864i;
            k5.k a9 = hVar.a();
            if (str == null) {
                a9.r(1);
            } else {
                a9.l(1, str);
            }
            workDatabase_Impl.c();
            try {
                a9.a();
                workDatabase_Impl.u();
                workDatabase_Impl.h();
                hVar.c(a9);
                workDatabase_Impl.b();
                hVar = (c6.h) qVar.f1861e;
                a9 = hVar.a();
                if (str == null) {
                    a9.r(1);
                } else {
                    a9.l(1, str);
                }
                workDatabase_Impl.c();
                try {
                    a9.a();
                    workDatabase_Impl.u();
                    workDatabase_Impl.h();
                    hVar.c(a9);
                    qVar.l(str, -1L);
                    workDatabase.u();
                } finally {
                }
            } finally {
            }
        } finally {
            workDatabase.h();
            e(false);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x003a A[Catch: all -> 0x0042, TryCatch #1 {all -> 0x0042, blocks: (B:3:0x0005, B:10:0x0032, B:12:0x003a, B:14:0x0046, B:15:0x0056, B:17:0x005a, B:19:0x005e, B:20:0x0064, B:25:0x006e, B:26:0x0074, B:34:0x0081, B:39:0x0084, B:40:0x0085, B:46:0x0099, B:47:0x009f, B:22:0x0065, B:23:0x006b, B:28:0x0075, B:29:0x007d, B:5:0x0020, B:7:0x0027), top: B:2:0x0005, inners: #0, #2, #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0046 A[Catch: all -> 0x0042, TryCatch #1 {all -> 0x0042, blocks: (B:3:0x0005, B:10:0x0032, B:12:0x003a, B:14:0x0046, B:15:0x0056, B:17:0x005a, B:19:0x005e, B:20:0x0064, B:25:0x006e, B:26:0x0074, B:34:0x0081, B:39:0x0084, B:40:0x0085, B:46:0x0099, B:47:0x009f, B:22:0x0065, B:23:0x006b, B:28:0x0075, B:29:0x007d, B:5:0x0020, B:7:0x0027), top: B:2:0x0005, inners: #0, #2, #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0065 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void e(boolean z10) {
        boolean z11;
        e eVar;
        boolean containsKey;
        this.f9670y.c();
        try {
            q B = this.f9670y.B();
            B.getClass();
            z a9 = z.a(0, "SELECT COUNT(*) > 0 FROM workspec WHERE state NOT IN (2, 3, 5) LIMIT 1");
            WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) B.f1857a;
            workDatabase_Impl.b();
            Cursor E = cf.c.E(workDatabase_Impl, a9);
            try {
                if (E.moveToFirst()) {
                    if (E.getInt(0) != 0) {
                        z11 = true;
                        if (!z11) {
                            d6.j.a(this.f9660d, RescheduleReceiver.class, false);
                        }
                        if (z10) {
                            this.f9671z.p(1, this.f9661e);
                            this.f9671z.l(this.f9661e, -1L);
                        }
                        if (this.f9664s != null && this.f9665t != null) {
                            eVar = this.f9669x;
                            String str = this.f9661e;
                            synchronized (eVar.f9632z) {
                                containsKey = eVar.f9626t.containsKey(str);
                            }
                            if (containsKey) {
                                e eVar2 = this.f9669x;
                                String str2 = this.f9661e;
                                synchronized (eVar2.f9632z) {
                                    eVar2.f9626t.remove(str2);
                                    eVar2.i();
                                }
                            }
                        }
                        this.f9670y.u();
                        this.f9670y.h();
                        this.D.i(Boolean.valueOf(z10));
                    }
                }
                z11 = false;
                if (!z11) {
                }
                if (z10) {
                }
                if (this.f9664s != null) {
                    eVar = this.f9669x;
                    String str3 = this.f9661e;
                    synchronized (eVar.f9632z) {
                    }
                }
                this.f9670y.u();
                this.f9670y.h();
                this.D.i(Boolean.valueOf(z10));
            } finally {
                E.close();
                a9.d();
            }
        } catch (Throwable th) {
            this.f9670y.h();
            throw th;
        }
    }

    public final void f() {
        q qVar = this.f9671z;
        String str = this.f9661e;
        int i3 = qVar.i(str);
        String str2 = G;
        if (i3 == 2) {
            t5.o.d().a(str2, "Status for " + str + " is RUNNING; not doing any work and rescheduling for later execution");
            e(true);
            return;
        }
        t5.o d10 = t5.o.d();
        StringBuilder q3 = v4.a.q("Status for ", str, " is ");
        q3.append(n0.l.n(i3));
        q3.append(" ; not doing any work");
        d10.a(str2, q3.toString());
        e(false);
    }

    public final void g() {
        String str = this.f9661e;
        WorkDatabase workDatabase = this.f9670y;
        workDatabase.c();
        try {
            LinkedList linkedList = new LinkedList();
            linkedList.add(str);
            while (true) {
                boolean isEmpty = linkedList.isEmpty();
                q qVar = this.f9671z;
                if (isEmpty) {
                    qVar.o(str, ((t5.j) this.f9667v).f9310a);
                    workDatabase.u();
                    return;
                } else {
                    String str2 = (String) linkedList.remove();
                    if (qVar.i(str2) != 6) {
                        qVar.p(4, str2);
                    }
                    linkedList.addAll(this.A.e(str2));
                }
            }
        } finally {
            workDatabase.h();
            e(false);
        }
    }

    public final boolean h() {
        if (!this.F) {
            return false;
        }
        t5.o.d().a(G, "Work interrupted for " + this.C);
        if (this.f9671z.i(this.f9661e) == 0) {
            e(false);
            return true;
        }
        e(!n0.l.a(r0));
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x008d, code lost:
    
        if ((r4.f1840b == 1 && r9 > 0) != false) goto L29;
     */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        t5.h hVar;
        t5.e a9;
        boolean z10;
        StringBuilder sb2 = new StringBuilder("Work [ id=");
        String str = this.f9661e;
        sb2.append(str);
        sb2.append(", tags={ ");
        ArrayList arrayList = this.B;
        int size = arrayList.size();
        boolean z11 = true;
        int i3 = 0;
        while (i3 < size) {
            Object obj = arrayList.get(i3);
            i3++;
            String str2 = (String) obj;
            if (z11) {
                z11 = false;
            } else {
                sb2.append(", ");
            }
            sb2.append(str2);
        }
        sb2.append(" } ]");
        this.C = sb2.toString();
        p pVar = this.f9664s;
        if (h()) {
            return;
        }
        WorkDatabase workDatabase = this.f9670y;
        workDatabase.c();
        try {
            int i10 = pVar.f1840b;
            int i11 = pVar.f1847k;
            String str3 = pVar.f1841c;
            String str4 = G;
            if (i10 != 1) {
                f();
                workDatabase.u();
                t5.o.d().a(str4, str3 + " is not in ENQUEUED state. Nothing more to do");
                return;
            }
            if (!pVar.c()) {
            }
            if (System.currentTimeMillis() < pVar.a()) {
                t5.o.d().a(str4, "Delaying execution for " + str3 + " because it is being executed before schedule.");
                e(true);
                workDatabase.u();
                return;
            }
            workDatabase.u();
            workDatabase.h();
            boolean c10 = pVar.c();
            q qVar = this.f9671z;
            t5.b bVar = this.f9668w;
            if (c10) {
                a9 = pVar.f1843e;
            } else {
                c0 c0Var = bVar.f9286d;
                String str5 = pVar.f1842d;
                c0Var.getClass();
                String str6 = t5.h.f9308a;
                try {
                    hVar = (t5.h) Class.forName(str5).getDeclaredConstructor(null).newInstance(null);
                } catch (Exception e2) {
                    t5.o.d().c(t5.h.f9308a, "Trouble instantiating + " + str5, e2);
                    hVar = null;
                }
                if (hVar == null) {
                    t5.o.d().b(str4, "Could not create Input Merger " + pVar.f1842d);
                    g();
                    return;
                }
                ArrayList arrayList2 = new ArrayList();
                arrayList2.add(pVar.f1843e);
                WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) qVar.f1857a;
                z a10 = z.a(1, "SELECT output FROM workspec WHERE id IN\n             (SELECT prerequisite_id FROM dependency WHERE work_spec_id=?)");
                if (str == null) {
                    a10.r(1);
                } else {
                    a10.l(1, str);
                }
                workDatabase_Impl.b();
                Cursor E = cf.c.E(workDatabase_Impl, a10);
                try {
                    ArrayList arrayList3 = new ArrayList(E.getCount());
                    while (E.moveToNext()) {
                        arrayList3.add(t5.e.a(E.isNull(0) ? null : E.getBlob(0)));
                    }
                    E.close();
                    a10.d();
                    arrayList2.addAll(arrayList3);
                    a9 = hVar.a(arrayList2);
                } catch (Throwable th) {
                    E.close();
                    a10.d();
                    throw th;
                }
            }
            UUID fromString = UUID.fromString(str);
            ExecutorService executorService = bVar.f9283a;
            v vVar = bVar.f9285c;
            a1.n nVar = this.f9666u;
            u uVar = new u(workDatabase, nVar);
            s sVar = new s(workDatabase, this.f9669x, nVar);
            WorkerParameters workerParameters = new WorkerParameters();
            workerParameters.f758a = fromString;
            workerParameters.f759b = a9;
            workerParameters.f760c = new HashSet(arrayList);
            workerParameters.f761d = this.f9663r;
            workerParameters.f762e = i11;
            workerParameters.f763f = executorService;
            workerParameters.g = nVar;
            workerParameters.f764h = vVar;
            workerParameters.f765i = uVar;
            workerParameters.j = sVar;
            if (this.f9665t == null) {
                this.f9665t = vVar.a(this.f9660d, str3, workerParameters);
            }
            t5.n nVar2 = this.f9665t;
            if (nVar2 == null) {
                t5.o.d().b(str4, "Could not create Worker " + str3);
                g();
                return;
            }
            if (nVar2.isUsed()) {
                t5.o.d().b(str4, "Received an already-used Worker " + str3 + "; Worker Factory should return new instances");
                g();
                return;
            }
            this.f9665t.setUsed();
            workDatabase.c();
            try {
                if (qVar.i(str) == 1) {
                    qVar.p(2, str);
                    WorkDatabase_Impl workDatabase_Impl2 = (WorkDatabase_Impl) qVar.f1857a;
                    workDatabase_Impl2.b();
                    c6.h hVar2 = (c6.h) qVar.f1863h;
                    k5.k a11 = hVar2.a();
                    if (str == null) {
                        a11.r(1);
                    } else {
                        a11.l(1, str);
                    }
                    workDatabase_Impl2.c();
                    try {
                        a11.a();
                        workDatabase_Impl2.u();
                        workDatabase_Impl2.h();
                        hVar2.c(a11);
                        z10 = true;
                    } catch (Throwable th2) {
                        workDatabase_Impl2.h();
                        hVar2.c(a11);
                        throw th2;
                    }
                } else {
                    z10 = false;
                }
                workDatabase.u();
                if (!z10) {
                    f();
                    return;
                }
                if (h()) {
                    return;
                }
                d6.q qVar2 = new d6.q(this.f9660d, this.f9664s, this.f9665t, sVar, this.f9666u);
                ((f6.b) nVar.f42r).execute(qVar2);
                e6.j jVar = qVar2.f3655d;
                a6.f fVar = new a6.f(19, this, jVar);
                d6.n nVar3 = new d6.n(0);
                e6.j jVar2 = this.E;
                jVar2.a(fVar, nVar3);
                jVar.a(new n(0, this, jVar), (f6.b) nVar.f42r);
                jVar2.a(new n(1, this, this.C), (d6.l) nVar.f41i);
            } catch (Throwable th3) {
                throw th3;
            }
        } finally {
            workDatabase.h();
        }
    }
}
