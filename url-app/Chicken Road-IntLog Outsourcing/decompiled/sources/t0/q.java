package t0;

import C0.u;
import C0.w;
import android.content.Context;
import android.database.Cursor;
import androidx.work.WorkerParameters;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.WorkDatabase_Impl;
import androidx.work.impl.background.systemalarm.RescheduleReceiver;
import b2.AbstractC0279e;
import c0.C0307i;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.ExecutorService;
import s0.C1414b;
import s0.r;
import s0.s;
import s0.z;

/* loaded from: classes.dex */
public final class q implements Runnable {

    /* renamed from: s, reason: collision with root package name */
    public static final String f11901s = s.f("WorkerWrapper");

    /* renamed from: a, reason: collision with root package name */
    public final Context f11902a;

    /* renamed from: b, reason: collision with root package name */
    public final String f11903b;

    /* renamed from: c, reason: collision with root package name */
    public final List f11904c;

    /* renamed from: d, reason: collision with root package name */
    public final B4.i f11905d;

    /* renamed from: e, reason: collision with root package name */
    public final B0.q f11906e;

    /* renamed from: f, reason: collision with root package name */
    public r f11907f;

    /* renamed from: g, reason: collision with root package name */
    public final B4.i f11908g;

    /* renamed from: i, reason: collision with root package name */
    public final C1414b f11910i;

    /* renamed from: j, reason: collision with root package name */
    public final f f11911j;

    /* renamed from: k, reason: collision with root package name */
    public final WorkDatabase f11912k;

    /* renamed from: l, reason: collision with root package name */
    public final B0.r f11913l;

    /* renamed from: m, reason: collision with root package name */
    public final B0.c f11914m;

    /* renamed from: n, reason: collision with root package name */
    public final ArrayList f11915n;

    /* renamed from: o, reason: collision with root package name */
    public String f11916o;

    /* renamed from: r, reason: collision with root package name */
    public volatile boolean f11919r;

    /* renamed from: h, reason: collision with root package name */
    public s0.q f11909h = new s0.n();

    /* renamed from: p, reason: collision with root package name */
    public final D0.k f11917p = new D0.k();

    /* renamed from: q, reason: collision with root package name */
    public final D0.k f11918q = new D0.k();

    public q(p pVar) {
        this.f11902a = pVar.f11892a;
        this.f11908g = pVar.f11894c;
        this.f11911j = pVar.f11893b;
        B0.q qVar = pVar.f11897f;
        this.f11906e = qVar;
        this.f11903b = qVar.f173a;
        this.f11904c = pVar.f11898g;
        this.f11905d = pVar.f11900i;
        this.f11907f = null;
        this.f11910i = pVar.f11895d;
        WorkDatabase workDatabase = pVar.f11896e;
        this.f11912k = workDatabase;
        this.f11913l = workDatabase.t();
        this.f11914m = workDatabase.f();
        this.f11915n = pVar.f11899h;
    }

    public final void a(s0.q qVar) {
        boolean z = qVar instanceof s0.p;
        B0.q qVar2 = this.f11906e;
        String str = f11901s;
        if (!z) {
            if (qVar instanceof s0.o) {
                s.d().e(str, "Worker result RETRY for " + this.f11916o);
                c();
                return;
            }
            s.d().e(str, "Worker result FAILURE for " + this.f11916o);
            if (qVar2.c()) {
                d();
                return;
            } else {
                g();
                return;
            }
        }
        s.d().e(str, "Worker result SUCCESS for " + this.f11916o);
        if (qVar2.c()) {
            d();
            return;
        }
        B0.c cVar = this.f11914m;
        String str2 = this.f11903b;
        B0.r rVar = this.f11913l;
        WorkDatabase workDatabase = this.f11912k;
        workDatabase.c();
        try {
            rVar.k(3, str2);
            rVar.j(str2, ((s0.p) this.f11909h).f11790a);
            long currentTimeMillis = System.currentTimeMillis();
            Iterator it = cVar.e(str2).iterator();
            while (it.hasNext()) {
                String str3 = (String) it.next();
                if (rVar.e(str3) == 5) {
                    X.k c2 = X.k.c(1, "SELECT COUNT(*)=0 FROM dependency WHERE work_spec_id=? AND prerequisite_id IN (SELECT id FROM workspec WHERE state!=2)");
                    if (str3 == null) {
                        c2.j(1);
                    } else {
                        c2.f(1, str3);
                    }
                    WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) cVar.f140b;
                    workDatabase_Impl.b();
                    Cursor m6 = workDatabase_Impl.m(c2, null);
                    try {
                        if (m6.moveToFirst() && m6.getInt(0) != 0) {
                            s.d().e(str, "Setting status to enqueued for " + str3);
                            rVar.k(1, str3);
                            rVar.i(currentTimeMillis, str3);
                        }
                    } finally {
                        m6.close();
                        c2.g();
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
        boolean h3 = h();
        WorkDatabase workDatabase = this.f11912k;
        String str = this.f11903b;
        if (!h3) {
            workDatabase.c();
            try {
                int e3 = this.f11913l.e(str);
                B0.n s2 = workDatabase.s();
                WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) s2.f167a;
                workDatabase_Impl.b();
                B0.h hVar = (B0.h) s2.f169c;
                C0307i a6 = hVar.a();
                if (str == null) {
                    a6.j(1);
                } else {
                    a6.f(1, str);
                }
                workDatabase_Impl.c();
                try {
                    a6.a();
                    workDatabase_Impl.o();
                    if (e3 == 0) {
                        e(false);
                    } else if (e3 == 2) {
                        a(this.f11909h);
                    } else if (!AbstractC0279e.a(e3)) {
                        c();
                    }
                    workDatabase.o();
                    workDatabase.k();
                } finally {
                    workDatabase_Impl.k();
                    hVar.n(a6);
                }
            } catch (Throwable th) {
                workDatabase.k();
                throw th;
            }
        }
        List list = this.f11904c;
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ((h) it.next()).a(str);
            }
            i.a(this.f11910i, workDatabase, list);
        }
    }

    public final void c() {
        String str = this.f11903b;
        B0.r rVar = this.f11913l;
        WorkDatabase workDatabase = this.f11912k;
        workDatabase.c();
        try {
            rVar.k(1, str);
            rVar.i(System.currentTimeMillis(), str);
            rVar.h(-1L, str);
            workDatabase.o();
        } finally {
            workDatabase.k();
            e(true);
        }
    }

    public final void d() {
        String str = this.f11903b;
        B0.r rVar = this.f11913l;
        WorkDatabase workDatabase = this.f11912k;
        workDatabase.c();
        try {
            rVar.i(System.currentTimeMillis(), str);
            rVar.k(1, str);
            WorkDatabase_Impl workDatabase_Impl = rVar.f193a;
            workDatabase_Impl.b();
            B0.h hVar = rVar.f201i;
            C0307i a6 = hVar.a();
            if (str == null) {
                a6.j(1);
            } else {
                a6.f(1, str);
            }
            workDatabase_Impl.c();
            try {
                a6.a();
                workDatabase_Impl.o();
                workDatabase_Impl.k();
                hVar.n(a6);
                workDatabase_Impl.b();
                B0.h hVar2 = rVar.f197e;
                C0307i a7 = hVar2.a();
                if (str == null) {
                    a7.j(1);
                } else {
                    a7.f(1, str);
                }
                workDatabase_Impl.c();
                try {
                    a7.a();
                    workDatabase_Impl.o();
                    workDatabase_Impl.k();
                    hVar2.n(a7);
                    rVar.h(-1L, str);
                    workDatabase.o();
                } catch (Throwable th) {
                    workDatabase_Impl.k();
                    hVar2.n(a7);
                    throw th;
                }
            } catch (Throwable th2) {
                workDatabase_Impl.k();
                hVar.n(a6);
                throw th2;
            }
        } finally {
            workDatabase.k();
            e(false);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0039 A[Catch: all -> 0x0041, TryCatch #1 {all -> 0x0041, blocks: (B:3:0x0005, B:10:0x0031, B:12:0x0039, B:14:0x0045, B:15:0x0055, B:17:0x0059, B:19:0x005d, B:20:0x0063, B:25:0x006d, B:26:0x0073, B:34:0x0080, B:39:0x0083, B:40:0x0084, B:46:0x0098, B:47:0x009e, B:22:0x0064, B:23:0x006a, B:28:0x0074, B:29:0x007c, B:5:0x001f, B:7:0x0026), top: B:2:0x0005, inners: #0, #2, #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0045 A[Catch: all -> 0x0041, TryCatch #1 {all -> 0x0041, blocks: (B:3:0x0005, B:10:0x0031, B:12:0x0039, B:14:0x0045, B:15:0x0055, B:17:0x0059, B:19:0x005d, B:20:0x0063, B:25:0x006d, B:26:0x0073, B:34:0x0080, B:39:0x0083, B:40:0x0084, B:46:0x0098, B:47:0x009e, B:22:0x0064, B:23:0x006a, B:28:0x0074, B:29:0x007c, B:5:0x001f, B:7:0x0026), top: B:2:0x0005, inners: #0, #2, #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0064 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void e(boolean z) {
        boolean z5;
        f fVar;
        boolean containsKey;
        this.f11912k.c();
        try {
            B0.r t5 = this.f11912k.t();
            t5.getClass();
            X.k c2 = X.k.c(0, "SELECT COUNT(*) > 0 FROM workspec WHERE state NOT IN (2, 3, 5) LIMIT 1");
            WorkDatabase_Impl workDatabase_Impl = t5.f193a;
            workDatabase_Impl.b();
            Cursor m6 = workDatabase_Impl.m(c2, null);
            try {
                if (m6.moveToFirst()) {
                    if (m6.getInt(0) != 0) {
                        z5 = true;
                        if (!z5) {
                            C0.l.a(this.f11902a, RescheduleReceiver.class, false);
                        }
                        if (z) {
                            this.f11913l.k(1, this.f11903b);
                            this.f11913l.h(-1L, this.f11903b);
                        }
                        if (this.f11906e != null && this.f11907f != null) {
                            fVar = this.f11911j;
                            String str = this.f11903b;
                            synchronized (fVar.f11863l) {
                                containsKey = fVar.f11857f.containsKey(str);
                            }
                            if (containsKey) {
                                f fVar2 = this.f11911j;
                                String str2 = this.f11903b;
                                synchronized (fVar2.f11863l) {
                                    fVar2.f11857f.remove(str2);
                                    fVar2.i();
                                }
                            }
                        }
                        this.f11912k.o();
                        this.f11912k.k();
                        this.f11917p.k(Boolean.valueOf(z));
                    }
                }
                z5 = false;
                if (!z5) {
                }
                if (z) {
                }
                if (this.f11906e != null) {
                    fVar = this.f11911j;
                    String str3 = this.f11903b;
                    synchronized (fVar.f11863l) {
                    }
                }
                this.f11912k.o();
                this.f11912k.k();
                this.f11917p.k(Boolean.valueOf(z));
            } finally {
                m6.close();
                c2.g();
            }
        } catch (Throwable th) {
            this.f11912k.k();
            throw th;
        }
    }

    public final void f() {
        B0.r rVar = this.f11913l;
        String str = this.f11903b;
        int e3 = rVar.e(str);
        String str2 = f11901s;
        if (e3 == 2) {
            s.d().a(str2, "Status for " + str + " is RUNNING; not doing any work and rescheduling for later execution");
            e(true);
            return;
        }
        s.d().a(str2, "Status for " + str + " is " + AbstractC0279e.r(e3) + " ; not doing any work");
        e(false);
    }

    public final void g() {
        String str = this.f11903b;
        WorkDatabase workDatabase = this.f11912k;
        workDatabase.c();
        try {
            LinkedList linkedList = new LinkedList();
            linkedList.add(str);
            while (true) {
                boolean isEmpty = linkedList.isEmpty();
                B0.r rVar = this.f11913l;
                if (isEmpty) {
                    rVar.j(str, ((s0.n) this.f11909h).f11789a);
                    workDatabase.o();
                    return;
                } else {
                    String str2 = (String) linkedList.remove();
                    if (rVar.e(str2) != 6) {
                        rVar.k(4, str2);
                    }
                    linkedList.addAll(this.f11914m.e(str2));
                }
            }
        } finally {
            workDatabase.k();
            e(false);
        }
    }

    public final boolean h() {
        if (!this.f11919r) {
            return false;
        }
        s.d().a(f11901s, "Work interrupted for " + this.f11916o);
        if (this.f11913l.e(this.f11903b) == 0) {
            e(false);
        } else {
            e(!AbstractC0279e.a(r0));
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x0090, code lost:
    
        if ((r6.f174b == 1 && r6.f183k > 0) != false) goto L30;
     */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        s0.j jVar;
        s0.g a6;
        boolean z;
        StringBuilder sb = new StringBuilder("Work [ id=");
        String str = this.f11903b;
        sb.append(str);
        sb.append(", tags={ ");
        ArrayList arrayList = this.f11915n;
        Iterator it = arrayList.iterator();
        boolean z5 = true;
        while (it.hasNext()) {
            String str2 = (String) it.next();
            if (z5) {
                z5 = false;
            } else {
                sb.append(", ");
            }
            sb.append(str2);
        }
        sb.append(" } ]");
        this.f11916o = sb.toString();
        B0.q qVar = this.f11906e;
        if (h()) {
            return;
        }
        WorkDatabase workDatabase = this.f11912k;
        workDatabase.c();
        try {
            int i2 = qVar.f174b;
            String str3 = qVar.f175c;
            String str4 = f11901s;
            if (i2 == 1) {
                if (!qVar.c()) {
                }
                if (System.currentTimeMillis() < qVar.a()) {
                    s.d().a(str4, "Delaying execution for " + str3 + " because it is being executed before schedule.");
                    e(true);
                    workDatabase.o();
                }
                workDatabase.o();
                workDatabase.k();
                boolean c2 = qVar.c();
                B0.r rVar = this.f11913l;
                C1414b c1414b = this.f11910i;
                if (c2) {
                    a6 = qVar.f177e;
                } else {
                    s0.k kVar = c1414b.f11754d;
                    String str5 = qVar.f176d;
                    kVar.getClass();
                    String str6 = s0.j.f11784a;
                    try {
                        jVar = (s0.j) Class.forName(str5).getDeclaredConstructor(null).newInstance(null);
                    } catch (Exception e3) {
                        s.d().c(s0.j.f11784a, B0.o.i("Trouble instantiating + ", str5), e3);
                        jVar = null;
                    }
                    if (jVar == null) {
                        s.d().b(str4, "Could not create Input Merger " + qVar.f176d);
                        g();
                        return;
                    }
                    ArrayList arrayList2 = new ArrayList();
                    arrayList2.add(qVar.f177e);
                    rVar.getClass();
                    X.k c6 = X.k.c(1, "SELECT output FROM workspec WHERE id IN\n             (SELECT prerequisite_id FROM dependency WHERE work_spec_id=?)");
                    if (str == null) {
                        c6.j(1);
                    } else {
                        c6.f(1, str);
                    }
                    WorkDatabase_Impl workDatabase_Impl = rVar.f193a;
                    workDatabase_Impl.b();
                    Cursor m6 = workDatabase_Impl.m(c6, null);
                    try {
                        ArrayList arrayList3 = new ArrayList(m6.getCount());
                        while (m6.moveToNext()) {
                            arrayList3.add(s0.g.a(m6.isNull(0) ? null : m6.getBlob(0)));
                        }
                        m6.close();
                        c6.g();
                        arrayList2.addAll(arrayList3);
                        a6 = jVar.a(arrayList2);
                    } catch (Throwable th) {
                        m6.close();
                        c6.g();
                        throw th;
                    }
                }
                UUID fromString = UUID.fromString(str);
                ExecutorService executorService = c1414b.f11751a;
                B4.i iVar = this.f11908g;
                w wVar = new w(workDatabase, iVar);
                u uVar = new u(workDatabase, this.f11911j, iVar);
                WorkerParameters workerParameters = new WorkerParameters();
                workerParameters.f4709a = fromString;
                workerParameters.f4710b = a6;
                workerParameters.f4711c = new HashSet(arrayList);
                workerParameters.f4712d = this.f11905d;
                workerParameters.f4713e = qVar.f183k;
                workerParameters.f4714f = executorService;
                workerParameters.f4715g = iVar;
                z zVar = c1414b.f11753c;
                workerParameters.f4716h = zVar;
                workerParameters.f4717i = wVar;
                workerParameters.f4718j = uVar;
                if (this.f11907f == null) {
                    this.f11907f = zVar.a(this.f11902a, str3, workerParameters);
                }
                r rVar2 = this.f11907f;
                if (rVar2 == null) {
                    s.d().b(str4, "Could not create Worker " + str3);
                    g();
                    return;
                }
                if (rVar2.isUsed()) {
                    s.d().b(str4, "Received an already-used Worker " + str3 + "; Worker Factory should return new instances");
                    g();
                    return;
                }
                this.f11907f.setUsed();
                workDatabase.c();
                try {
                    if (rVar.e(str) == 1) {
                        rVar.k(2, str);
                        WorkDatabase_Impl workDatabase_Impl2 = rVar.f193a;
                        workDatabase_Impl2.b();
                        B0.h hVar = rVar.f200h;
                        C0307i a7 = hVar.a();
                        if (str == null) {
                            z = true;
                            a7.j(1);
                        } else {
                            z = true;
                            a7.f(1, str);
                        }
                        workDatabase_Impl2.c();
                        try {
                            a7.a();
                            workDatabase_Impl2.o();
                            workDatabase_Impl2.k();
                            hVar.n(a7);
                        } catch (Throwable th2) {
                            workDatabase_Impl2.k();
                            hVar.n(a7);
                            throw th2;
                        }
                    } else {
                        z = false;
                    }
                    workDatabase.o();
                    if (!z) {
                        f();
                        return;
                    }
                    if (h()) {
                        return;
                    }
                    C0.s sVar = new C0.s(this.f11902a, this.f11906e, this.f11907f, uVar, this.f11908g);
                    ((A.c) iVar.f313d).execute(sVar);
                    D0.k kVar2 = sVar.f356a;
                    B3.c cVar = new B3.c(this, 25, kVar2);
                    boolean z6 = false;
                    C0.p pVar = new C0.p(0);
                    D0.k kVar3 = this.f11918q;
                    kVar3.a(cVar, pVar);
                    kVar2.a(new s0.m(this, kVar2, 2, z6), (A.c) iVar.f313d);
                    kVar3.a(new s0.m(this, this.f11916o, 3, z6), (C0.n) iVar.f311b);
                    return;
                } finally {
                }
            }
            f();
            workDatabase.o();
            s.d().a(str4, str3 + " is not in ENQUEUED state. Nothing more to do");
        } finally {
            workDatabase.k();
        }
    }
}
