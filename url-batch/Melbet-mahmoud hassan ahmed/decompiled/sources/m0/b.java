package m0;

import android.os.Build;
import android.text.TextUtils;
import androidx.work.b;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemalarm.RescheduleReceiver;
import androidx.work.impl.workers.ConstraintTrackingWorker;
import d0.m;
import d0.s;
import d0.u;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import l0.p;
import l0.q;

/* loaded from: classes.dex */
public class b implements Runnable {

    /* renamed from: h, reason: collision with root package name */
    private static final String f18836h = d0.j.f("EnqueueRunnable");

    /* renamed from: f, reason: collision with root package name */
    private final e0.g f18837f;

    /* renamed from: g, reason: collision with root package name */
    private final e0.c f18838g = new e0.c();

    public b(e0.g gVar) {
        this.f18837f = gVar;
    }

    private static boolean b(e0.g gVar) {
        boolean c7 = c(gVar.g(), gVar.f(), (String[]) e0.g.l(gVar).toArray(new String[0]), gVar.d(), gVar.b());
        gVar.k();
        return c7;
    }

    /* JADX WARN: Removed duplicated region for block: B:65:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x01a8  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x01db A[LOOP:5: B:87:0x01d5->B:89:0x01db, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:92:0x01f4  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0204 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static boolean c(e0.i iVar, List<? extends u> list, String[] strArr, String str, d0.d dVar) {
        boolean z6;
        boolean z7;
        boolean z8;
        boolean z9;
        long j7;
        int i7;
        Iterator<String> it;
        boolean z10;
        l0.b bVar;
        e0.i iVar2 = iVar;
        String[] strArr2 = strArr;
        long currentTimeMillis = System.currentTimeMillis();
        WorkDatabase o7 = iVar.o();
        boolean z11 = strArr2 != null && strArr2.length > 0;
        if (z11) {
            z6 = true;
            z7 = false;
            z8 = false;
            for (String str2 : strArr2) {
                p l7 = o7.B().l(str2);
                if (l7 == null) {
                    d0.j.c().b(f18836h, String.format("Prerequisite %s doesn't exist; not enqueuing", str2), new Throwable[0]);
                    return false;
                }
                s sVar = l7.f18478b;
                z6 &= sVar == s.SUCCEEDED;
                if (sVar == s.FAILED) {
                    z8 = true;
                } else if (sVar == s.CANCELLED) {
                    z7 = true;
                }
            }
        } else {
            z6 = true;
            z7 = false;
            z8 = false;
        }
        boolean z12 = !TextUtils.isEmpty(str);
        if (z12 && !z11) {
            List<p.b> f7 = o7.B().f(str);
            if (!f7.isEmpty()) {
                if (dVar != d0.d.APPEND && dVar != d0.d.APPEND_OR_REPLACE) {
                    if (dVar == d0.d.KEEP) {
                        Iterator<p.b> it2 = f7.iterator();
                        while (it2.hasNext()) {
                            s sVar2 = it2.next().f18496b;
                            if (sVar2 == s.ENQUEUED || sVar2 == s.RUNNING) {
                                return false;
                            }
                        }
                    }
                    a.c(str, iVar2, false).run();
                    q B = o7.B();
                    Iterator<p.b> it3 = f7.iterator();
                    while (it3.hasNext()) {
                        B.a(it3.next().f18495a);
                    }
                    z9 = true;
                    for (u uVar : list) {
                        p c7 = uVar.c();
                        if (z11 && !z6) {
                            c7.f18478b = z8 ? s.FAILED : z7 ? s.CANCELLED : s.BLOCKED;
                        } else if (c7.d()) {
                            j7 = currentTimeMillis;
                            c7.f18490n = 0L;
                            i7 = Build.VERSION.SDK_INT;
                            if ((i7 >= 23 && i7 <= 25) || (i7 <= 22 && h(iVar2, "androidx.work.impl.background.gcm.GcmScheduler"))) {
                                g(c7);
                            }
                            if (c7.f18478b == s.ENQUEUED) {
                                z9 = true;
                            }
                            o7.B().i(c7);
                            if (z11) {
                                for (String str3 : strArr2) {
                                    o7.t().b(new l0.a(uVar.a(), str3));
                                }
                            }
                            it = uVar.b().iterator();
                            while (it.hasNext()) {
                                o7.C().a(new l0.s(it.next(), uVar.a()));
                            }
                            if (z12) {
                                o7.z().a(new l0.j(str, uVar.a()));
                            }
                            iVar2 = iVar;
                            currentTimeMillis = j7;
                        } else {
                            c7.f18490n = currentTimeMillis;
                        }
                        j7 = currentTimeMillis;
                        i7 = Build.VERSION.SDK_INT;
                        if (i7 >= 23) {
                            g(c7);
                            if (c7.f18478b == s.ENQUEUED) {
                            }
                            o7.B().i(c7);
                            if (z11) {
                            }
                            it = uVar.b().iterator();
                            while (it.hasNext()) {
                            }
                            if (z12) {
                            }
                            iVar2 = iVar;
                            currentTimeMillis = j7;
                        }
                        g(c7);
                        if (c7.f18478b == s.ENQUEUED) {
                        }
                        o7.B().i(c7);
                        if (z11) {
                        }
                        it = uVar.b().iterator();
                        while (it.hasNext()) {
                        }
                        if (z12) {
                        }
                        iVar2 = iVar;
                        currentTimeMillis = j7;
                    }
                    return z9;
                }
                l0.b t6 = o7.t();
                List arrayList = new ArrayList();
                for (p.b bVar2 : f7) {
                    if (t6.c(bVar2.f18495a)) {
                        bVar = t6;
                    } else {
                        s sVar3 = bVar2.f18496b;
                        bVar = t6;
                        boolean z13 = (sVar3 == s.SUCCEEDED) & z6;
                        if (sVar3 == s.FAILED) {
                            z8 = true;
                        } else if (sVar3 == s.CANCELLED) {
                            z7 = true;
                        }
                        arrayList.add(bVar2.f18495a);
                        z6 = z13;
                    }
                    t6 = bVar;
                }
                if (dVar == d0.d.APPEND_OR_REPLACE && (z7 || z8)) {
                    q B2 = o7.B();
                    Iterator<p.b> it4 = B2.f(str).iterator();
                    while (it4.hasNext()) {
                        B2.a(it4.next().f18495a);
                    }
                    arrayList = Collections.emptyList();
                    z10 = false;
                    z7 = false;
                } else {
                    z10 = z8;
                }
                strArr2 = (String[]) arrayList.toArray(strArr2);
                z11 = strArr2.length > 0;
                z8 = z10;
            }
        }
        z9 = false;
        while (r7.hasNext()) {
        }
        return z9;
    }

    private static boolean e(e0.g gVar) {
        List<e0.g> e7 = gVar.e();
        boolean z6 = false;
        if (e7 != null) {
            boolean z7 = false;
            for (e0.g gVar2 : e7) {
                if (gVar2.j()) {
                    d0.j.c().h(f18836h, String.format("Already enqueued work ids (%s).", TextUtils.join(", ", gVar2.c())), new Throwable[0]);
                } else {
                    z7 |= e(gVar2);
                }
            }
            z6 = z7;
        }
        return b(gVar) | z6;
    }

    private static void g(p pVar) {
        d0.b bVar = pVar.f18486j;
        String str = pVar.f18479c;
        if (str.equals(ConstraintTrackingWorker.class.getName())) {
            return;
        }
        if (bVar.f() || bVar.i()) {
            b.a aVar = new b.a();
            aVar.c(pVar.f18481e).e("androidx.work.impl.workers.ConstraintTrackingWorker.ARGUMENT_CLASS_NAME", str);
            pVar.f18479c = ConstraintTrackingWorker.class.getName();
            pVar.f18481e = aVar.a();
        }
    }

    private static boolean h(e0.i iVar, String str) {
        try {
            Class<?> cls = Class.forName(str);
            Iterator<e0.e> it = iVar.n().iterator();
            while (it.hasNext()) {
                if (cls.isAssignableFrom(it.next().getClass())) {
                    return true;
                }
            }
        } catch (ClassNotFoundException unused) {
        }
        return false;
    }

    public boolean a() {
        WorkDatabase o7 = this.f18837f.g().o();
        o7.c();
        try {
            boolean e7 = e(this.f18837f);
            o7.r();
            return e7;
        } finally {
            o7.g();
        }
    }

    public d0.m d() {
        return this.f18838g;
    }

    public void f() {
        e0.i g7 = this.f18837f.g();
        e0.f.b(g7.i(), g7.o(), g7.n());
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            if (this.f18837f.h()) {
                throw new IllegalStateException(String.format("WorkContinuation has cycles (%s)", this.f18837f));
            }
            if (a()) {
                d.a(this.f18837f.g().h(), RescheduleReceiver.class, true);
                f();
            }
            this.f18838g.a(d0.m.f15489a);
        } catch (Throwable th) {
            this.f18838g.a(new m.b.a(th));
        }
    }
}
