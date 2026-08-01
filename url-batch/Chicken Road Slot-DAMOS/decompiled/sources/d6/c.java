package d6;

import android.database.Cursor;
import android.os.Build;
import android.text.TextUtils;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.WorkDatabase_Impl;
import androidx.work.impl.background.systemalarm.RescheduleReceiver;
import androidx.work.impl.workers.ConstraintTrackingWorker;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import kotlin.jvm.internal.Intrinsics;
import z4.z;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class c implements Runnable {

    /* renamed from: i, reason: collision with root package name */
    public static final String f3624i = t5.o.f("EnqueueRunnable");

    /* renamed from: d, reason: collision with root package name */
    public final u5.j f3625d;

    /* renamed from: e, reason: collision with root package name */
    public final c6.c f3626e;

    public c(u5.j jVar) {
        c6.c cVar = new c6.c(13);
        this.f3625d = jVar;
        this.f3626e = cVar;
    }

    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Removed duplicated region for block: B:109:0x027f  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x02d3  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x02fd  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x032a A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0180  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean a(u5.j jVar) {
        boolean z10;
        boolean z11;
        boolean z12;
        List list;
        boolean z13;
        WorkDatabase workDatabase;
        boolean z14;
        Iterator it;
        boolean z15;
        u5.m mVar;
        Iterator it2;
        long j;
        Iterator it3;
        jVar.getClass();
        HashSet b10 = u5.j.b(jVar);
        u5.m mVar2 = jVar.f9638a;
        List list2 = jVar.f9640c;
        String[] strArr = (String[]) b10.toArray(new String[0]);
        String str = jVar.f9639b;
        long currentTimeMillis = System.currentTimeMillis();
        WorkDatabase workDatabase2 = mVar2.f9651c;
        boolean z16 = strArr != null && strArr.length > 0;
        if (z16) {
            z11 = false;
            z12 = false;
            z10 = true;
            for (String str2 : strArr) {
                c6.p k10 = workDatabase2.B().k(str2);
                if (k10 == null) {
                    t5.o.d().b(f3624i, "Prerequisite " + str2 + " doesn't exist; not enqueuing");
                    break;
                }
                int i3 = k10.f1840b;
                z10 &= i3 == 3;
                if (i3 == 4) {
                    z12 = true;
                } else if (i3 == 6) {
                    z11 = true;
                }
            }
        } else {
            z10 = true;
            z11 = false;
            z12 = false;
        }
        boolean isEmpty = TextUtils.isEmpty(str);
        if (isEmpty || z16) {
            list = list2;
        } else {
            WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) workDatabase2.B().f1857a;
            int i10 = 1;
            z a9 = z.a(1, "SELECT id, state FROM workspec WHERE id IN (SELECT work_spec_id FROM workname WHERE name=?)");
            if (str == null) {
                a9.r(1);
            } else {
                a9.l(1, str);
            }
            workDatabase_Impl.b();
            Cursor E = cf.c.E(workDatabase_Impl, a9);
            try {
                ArrayList arrayList = new ArrayList(E.getCount());
                while (E.moveToNext()) {
                    String string = E.isNull(0) ? null : E.getString(0);
                    int U = i7.a.U(E.getInt(i10));
                    List list3 = list2;
                    string.getClass();
                    c6.o oVar = new c6.o();
                    oVar.f1837a = string;
                    oVar.f1838b = U;
                    arrayList.add(oVar);
                    list2 = list3;
                    i10 = 1;
                }
                list = list2;
                E.close();
                a9.d();
                if (!arrayList.isEmpty()) {
                    int size = arrayList.size();
                    int i11 = 0;
                    while (i11 < size) {
                        Object obj = arrayList.get(i11);
                        i11++;
                        int i12 = ((c6.o) obj).f1838b;
                        if (i12 != 1 && i12 != 2) {
                        }
                        z15 = false;
                    }
                    new b(mVar2, str, 1).run();
                    c6.q B = workDatabase2.B();
                    int size2 = arrayList.size();
                    int i13 = 0;
                    while (i13 < size2) {
                        Object obj2 = arrayList.get(i13);
                        i13++;
                        String str3 = ((c6.o) obj2).f1837a;
                        WorkDatabase_Impl workDatabase_Impl2 = (WorkDatabase_Impl) B.f1857a;
                        workDatabase_Impl2.b();
                        boolean z17 = isEmpty;
                        c6.h hVar = (c6.h) B.f1859c;
                        c6.q qVar = B;
                        k5.k a10 = hVar.a();
                        WorkDatabase workDatabase3 = workDatabase2;
                        if (str3 == null) {
                            a10.r(1);
                        } else {
                            a10.l(1, str3);
                        }
                        workDatabase_Impl2.c();
                        try {
                            a10.a();
                            workDatabase_Impl2.u();
                            workDatabase_Impl2.h();
                            hVar.c(a10);
                            isEmpty = z17;
                            B = qVar;
                            workDatabase2 = workDatabase3;
                        } catch (Throwable th) {
                            workDatabase_Impl2.h();
                            hVar.c(a10);
                            throw th;
                        }
                    }
                    z13 = isEmpty;
                    workDatabase = workDatabase2;
                    z14 = true;
                    it = list.iterator();
                    boolean z18 = z14;
                    while (it.hasNext()) {
                        t5.p pVar = (t5.p) it.next();
                        c6.p pVar2 = pVar.f9316b;
                        UUID uuid = pVar.f9315a;
                        if (!z16 || z10) {
                            pVar2.f1850n = currentTimeMillis;
                        } else if (z12) {
                            pVar2.f1840b = 4;
                        } else if (z11) {
                            pVar2.f1840b = 6;
                        } else {
                            pVar2.f1840b = 5;
                        }
                        if (pVar2.f1840b == 1) {
                            z18 = true;
                        }
                        c6.q B2 = workDatabase.B();
                        mVar2.f9653e.getClass();
                        try {
                            if (Build.VERSION.SDK_INT < 26) {
                                t5.d dVar = pVar2.j;
                                String str4 = pVar2.f1841c;
                                mVar = mVar2;
                                if (!Intrinsics.a(str4, ConstraintTrackingWorker.class.getName()) && (dVar.f9296d || dVar.f9297e)) {
                                    jf.a aVar = new jf.a(1);
                                    aVar.a(pVar2.f1843e.f9302a);
                                    it2 = it;
                                    aVar.f5253a.put("androidx.work.impl.workers.ConstraintTrackingWorker.ARGUMENT_CLASS_NAME", str4);
                                    t5.e eVar = new t5.e(aVar.f5253a);
                                    t5.e.c(eVar);
                                    String name = ConstraintTrackingWorker.class.getName();
                                    String str5 = pVar2.f1839a;
                                    int i14 = pVar2.f1840b;
                                    String str6 = pVar2.f1842d;
                                    t5.e eVar2 = pVar2.f1844f;
                                    j = currentTimeMillis;
                                    long j3 = pVar2.g;
                                    long j10 = pVar2.f1845h;
                                    long j11 = pVar2.f1846i;
                                    t5.d dVar2 = pVar2.j;
                                    int i15 = pVar2.f1847k;
                                    int i16 = pVar2.f1848l;
                                    long j12 = pVar2.f1849m;
                                    long j13 = pVar2.f1850n;
                                    long j14 = pVar2.f1851o;
                                    long j15 = pVar2.f1852p;
                                    boolean z19 = pVar2.f1853q;
                                    int i17 = pVar2.f1854r;
                                    int i18 = pVar2.f1855s;
                                    int i19 = pVar2.f1856t;
                                    str5.getClass();
                                    if (i14 == 0) {
                                        throw null;
                                    }
                                    eVar2.getClass();
                                    dVar2.getClass();
                                    if (i16 == 0) {
                                        throw null;
                                    }
                                    if (i17 == 0) {
                                        throw null;
                                    }
                                    pVar2 = new c6.p(str5, i14, name, str6, eVar, eVar2, j3, j10, j11, dVar2, i15, i16, j12, j13, j14, j15, z19, i17, i18, i19);
                                    WorkDatabase_Impl workDatabase_Impl3 = (WorkDatabase_Impl) B2.f1857a;
                                    workDatabase_Impl3.b();
                                    workDatabase_Impl3.c();
                                    ((c6.b) B2.f1858b).e(pVar2);
                                    workDatabase_Impl3.u();
                                    if (z16) {
                                        for (String str7 : strArr) {
                                            String uuid2 = uuid.toString();
                                            uuid2.getClass();
                                            c6.a aVar2 = new c6.a(uuid2, str7);
                                            c6.c w6 = workDatabase.w();
                                            workDatabase_Impl3 = (WorkDatabase_Impl) w6.f1809e;
                                            workDatabase_Impl3.b();
                                            workDatabase_Impl3.c();
                                            try {
                                                ((c6.b) w6.f1810i).e(aVar2);
                                                workDatabase_Impl3.u();
                                                workDatabase_Impl3.h();
                                            } finally {
                                            }
                                        }
                                    }
                                    c6.s C = workDatabase.C();
                                    String uuid3 = uuid.toString();
                                    uuid3.getClass();
                                    Set set = pVar.f9317c;
                                    C.getClass();
                                    set.getClass();
                                    it3 = set.iterator();
                                    while (it3.hasNext()) {
                                        c6.r rVar = new c6.r((String) it3.next(), uuid3);
                                        workDatabase_Impl3 = (WorkDatabase_Impl) C.f1868d;
                                        workDatabase_Impl3.b();
                                        workDatabase_Impl3.c();
                                        try {
                                            ((c6.b) C.f1869e).e(rVar);
                                            workDatabase_Impl3.u();
                                        } finally {
                                        }
                                    }
                                    if (z13) {
                                        c6.l z20 = workDatabase.z();
                                        String uuid4 = uuid.toString();
                                        uuid4.getClass();
                                        c6.k kVar = new c6.k(str, uuid4);
                                        workDatabase_Impl3 = (WorkDatabase_Impl) z20.f1829e;
                                        workDatabase_Impl3.b();
                                        workDatabase_Impl3.c();
                                        try {
                                            ((c6.b) z20.f1830i).e(kVar);
                                            workDatabase_Impl3.u();
                                        } finally {
                                        }
                                    }
                                    mVar2 = mVar;
                                    it = it2;
                                    currentTimeMillis = j;
                                }
                            } else {
                                mVar = mVar2;
                            }
                            ((c6.b) B2.f1858b).e(pVar2);
                            workDatabase_Impl3.u();
                            if (z16) {
                            }
                            c6.s C2 = workDatabase.C();
                            String uuid32 = uuid.toString();
                            uuid32.getClass();
                            Set set2 = pVar.f9317c;
                            C2.getClass();
                            set2.getClass();
                            it3 = set2.iterator();
                            while (it3.hasNext()) {
                            }
                            if (z13) {
                            }
                            mVar2 = mVar;
                            it = it2;
                            currentTimeMillis = j;
                        } finally {
                        }
                        it2 = it;
                        j = currentTimeMillis;
                        WorkDatabase_Impl workDatabase_Impl32 = (WorkDatabase_Impl) B2.f1857a;
                        workDatabase_Impl32.b();
                        workDatabase_Impl32.c();
                    }
                    z15 = z18;
                    jVar.f9643f = true;
                    return z15;
                }
            } catch (Throwable th2) {
                E.close();
                a9.d();
                throw th2;
            }
        }
        z13 = isEmpty;
        workDatabase = workDatabase2;
        z14 = false;
        it = list.iterator();
        boolean z182 = z14;
        while (it.hasNext()) {
        }
        z15 = z182;
        jVar.f9643f = true;
        return z15;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z10;
        c6.c cVar = this.f3626e;
        u5.j jVar = this.f3625d;
        try {
            jVar.getClass();
            u5.m mVar = jVar.f9638a;
            HashSet hashSet = new HashSet();
            hashSet.addAll(jVar.f9641d);
            HashSet b10 = u5.j.b(jVar);
            Iterator it = hashSet.iterator();
            while (true) {
                if (!it.hasNext()) {
                    hashSet.removeAll(jVar.f9641d);
                    z10 = false;
                    break;
                } else if (b10.contains((String) it.next())) {
                    z10 = true;
                    break;
                }
            }
            if (z10) {
                throw new IllegalStateException("WorkContinuation has cycles (" + jVar + ")");
            }
            WorkDatabase workDatabase = mVar.f9651c;
            workDatabase.c();
            try {
                boolean a9 = a(jVar);
                workDatabase.u();
                if (a9) {
                    j.a(mVar.f9649a, RescheduleReceiver.class, true);
                    u5.h.a(mVar.f9650b, mVar.f9651c, mVar.f9653e);
                }
                cVar.g(t5.t.f9319p);
            } finally {
                workDatabase.h();
            }
        } catch (Throwable th) {
            cVar.g(new t5.q(th));
        }
    }
}
