package C0;

import android.database.Cursor;
import android.os.Build;
import android.text.TextUtils;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.WorkDatabase_Impl;
import androidx.work.impl.background.systemalarm.RescheduleReceiver;
import androidx.work.impl.workers.ConstraintTrackingWorker;
import b2.AbstractC0279e;
import c0.C0307i;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.UUID;
import s0.C1416d;
import x2.C1545h;

/* loaded from: classes.dex */
public final class d implements Runnable {

    /* renamed from: c, reason: collision with root package name */
    public static final String f328c = s0.s.f("EnqueueRunnable");

    /* renamed from: a, reason: collision with root package name */
    public final t0.k f329a;

    /* renamed from: b, reason: collision with root package name */
    public final B0.t f330b;

    public d(t0.k kVar) {
        B0.t tVar = new B0.t();
        this.f329a = kVar;
        this.f330b = tVar;
    }

    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Removed duplicated region for block: B:105:0x029c  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x02f0  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x031a  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0349  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x016e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean a(t0.k kVar) {
        boolean z;
        boolean z5;
        boolean z6;
        String[] strArr;
        long j2;
        boolean z7;
        boolean z8;
        Iterator it;
        boolean z9;
        boolean z10;
        long j6;
        String str;
        boolean z11;
        t0.o oVar;
        long j7;
        boolean z12;
        boolean z13;
        boolean z14;
        s0.t tVar;
        WorkDatabase_Impl workDatabase_Impl;
        Iterator it2;
        String str2;
        WorkDatabase_Impl workDatabase_Impl2;
        String id;
        boolean z15;
        int i2;
        t0.k kVar2 = kVar;
        kVar.getClass();
        String[] strArr2 = (String[]) t0.k.F(kVar).toArray(new String[0]);
        long currentTimeMillis = System.currentTimeMillis();
        t0.o oVar2 = kVar2.f11869a;
        WorkDatabase workDatabase = oVar2.f11884c;
        boolean z16 = strArr2 != null && strArr2.length > 0;
        if (z16) {
            z5 = false;
            z6 = false;
            z = true;
            for (String str3 : strArr2) {
                B0.q g6 = workDatabase.t().g(str3);
                if (g6 == null) {
                    s0.s.d().b(f328c, AbstractC0279e.f("Prerequisite ", str3, " doesn't exist; not enqueuing"));
                    break;
                }
                int i3 = g6.f174b;
                z &= i3 == 3;
                if (i3 == 4) {
                    z6 = true;
                } else if (i3 == 6) {
                    z5 = true;
                }
            }
        } else {
            z = true;
            z5 = false;
            z6 = false;
        }
        String str4 = kVar2.f11870b;
        boolean isEmpty = TextUtils.isEmpty(str4);
        if (isEmpty || z16) {
            strArr = strArr2;
            j2 = currentTimeMillis;
            z7 = isEmpty;
        } else {
            B0.r t5 = workDatabase.t();
            t5.getClass();
            X.k c2 = X.k.c(1, "SELECT id, state FROM workspec WHERE id IN (SELECT work_spec_id FROM workname WHERE name=?)");
            if (str4 == null) {
                c2.j(1);
            } else {
                c2.f(1, str4);
            }
            WorkDatabase_Impl workDatabase_Impl3 = t5.f193a;
            workDatabase_Impl3.b();
            Cursor m6 = workDatabase_Impl3.m(c2, null);
            try {
                ArrayList arrayList = new ArrayList(m6.getCount());
                while (m6.moveToNext()) {
                    if (m6.isNull(0)) {
                        z15 = isEmpty;
                        i2 = 1;
                        id = null;
                    } else {
                        id = m6.getString(0);
                        z15 = isEmpty;
                        i2 = 1;
                    }
                    int E5 = B0.f.E(m6.getInt(i2));
                    String[] strArr3 = strArr2;
                    long j8 = currentTimeMillis;
                    kotlin.jvm.internal.i.e(id, "id");
                    B0.p pVar = new B0.p();
                    pVar.f171a = id;
                    pVar.f172b = E5;
                    arrayList.add(pVar);
                    isEmpty = z15;
                    strArr2 = strArr3;
                    currentTimeMillis = j8;
                }
                strArr = strArr2;
                j2 = currentTimeMillis;
                z7 = isEmpty;
                m6.close();
                c2.g();
                if (!arrayList.isEmpty()) {
                    Iterator it3 = arrayList.iterator();
                    while (it3.hasNext()) {
                        int i6 = ((B0.p) it3.next()).f172b;
                        if (i6 != 1 && i6 != 2) {
                        }
                        z9 = true;
                        z10 = false;
                    }
                    new b(oVar2, str4, 1).run();
                    B0.r t6 = workDatabase.t();
                    Iterator it4 = arrayList.iterator();
                    while (it4.hasNext()) {
                        String str5 = ((B0.p) it4.next()).f171a;
                        WorkDatabase_Impl workDatabase_Impl4 = t6.f193a;
                        workDatabase_Impl4.b();
                        B0.h hVar = t6.f195c;
                        C0307i a6 = hVar.a();
                        if (str5 == null) {
                            a6.j(1);
                        } else {
                            a6.f(1, str5);
                        }
                        workDatabase_Impl4.c();
                        try {
                            a6.a();
                            workDatabase_Impl4.o();
                        } finally {
                            workDatabase_Impl4.k();
                            hVar.n(a6);
                        }
                    }
                    z8 = true;
                    it = kVar2.f11871c.iterator();
                    boolean z17 = z8;
                    while (it.hasNext()) {
                        s0.t tVar2 = (s0.t) it.next();
                        B0.q qVar = tVar2.f11795b;
                        if (!z16 || z) {
                            j6 = j2;
                            qVar.f186n = j6;
                        } else if (z6) {
                            qVar.f174b = 4;
                            j6 = j2;
                        } else {
                            if (z5) {
                                qVar.f174b = 6;
                            } else {
                                qVar.f174b = 5;
                            }
                            j6 = j2;
                        }
                        if (qVar.f174b == 1) {
                            z17 = true;
                        }
                        B0.r t7 = workDatabase.t();
                        List schedulers = oVar2.f11886e;
                        Iterator it5 = it;
                        kotlin.jvm.internal.i.e(schedulers, "schedulers");
                        try {
                            if (Build.VERSION.SDK_INT < 26) {
                                C1416d c1416d = qVar.f182j;
                                z11 = z17;
                                String name = ConstraintTrackingWorker.class.getName();
                                oVar = oVar2;
                                String str6 = qVar.f175c;
                                if (kotlin.jvm.internal.i.a(str6, name) || !(c1416d.f11765d || c1416d.f11766e)) {
                                    str = str4;
                                } else {
                                    C1545h c1545h = new C1545h(2);
                                    c1545h.a(qVar.f177e.f11778a);
                                    j7 = j6;
                                    c1545h.f12299a.put("androidx.work.impl.workers.ConstraintTrackingWorker.ARGUMENT_CLASS_NAME", str6);
                                    s0.g gVar = new s0.g(c1545h.f12299a);
                                    s0.g.c(gVar);
                                    String name2 = ConstraintTrackingWorker.class.getName();
                                    int i7 = qVar.f174b;
                                    String str7 = qVar.f176d;
                                    long j9 = qVar.f179g;
                                    C1416d constraints = qVar.f182j;
                                    z12 = z;
                                    z13 = z5;
                                    long j10 = qVar.f186n;
                                    z14 = z6;
                                    boolean z18 = qVar.f189q;
                                    str = str4;
                                    String id2 = qVar.f173a;
                                    kotlin.jvm.internal.i.e(id2, "id");
                                    AbstractC0279e.k(i7, "state");
                                    s0.g output = qVar.f178f;
                                    kotlin.jvm.internal.i.e(output, "output");
                                    kotlin.jvm.internal.i.e(constraints, "constraints");
                                    int i8 = qVar.f184l;
                                    AbstractC0279e.k(i8, "backoffPolicy");
                                    int i9 = qVar.f190r;
                                    AbstractC0279e.k(i9, "outOfQuotaPolicy");
                                    tVar = tVar2;
                                    qVar = new B0.q(id2, i7, name2, str7, gVar, output, j9, qVar.f180h, qVar.f181i, constraints, qVar.f183k, i8, qVar.f185m, j10, qVar.f187o, qVar.f188p, z18, i9, qVar.f191s, qVar.f192t);
                                    workDatabase_Impl = t7.f193a;
                                    workDatabase_Impl.b();
                                    workDatabase_Impl.c();
                                    t7.f194b.q(qVar);
                                    workDatabase_Impl.o();
                                    workDatabase_Impl.k();
                                    UUID uuid = tVar.f11794a;
                                    String[] strArr4 = strArr;
                                    if (z16) {
                                        for (String str8 : strArr4) {
                                            String uuid2 = uuid.toString();
                                            kotlin.jvm.internal.i.d(uuid2, "id.toString()");
                                            B0.a aVar = new B0.a(uuid2, str8);
                                            B0.c f3 = workDatabase.f();
                                            workDatabase_Impl2 = (WorkDatabase_Impl) f3.f140b;
                                            workDatabase_Impl2.b();
                                            workDatabase_Impl2.c();
                                            try {
                                                ((B0.b) f3.f141c).q(aVar);
                                                workDatabase_Impl2.o();
                                                workDatabase_Impl2.k();
                                            } finally {
                                            }
                                        }
                                    }
                                    B0.t u5 = workDatabase.u();
                                    String uuid3 = uuid.toString();
                                    kotlin.jvm.internal.i.d(uuid3, "id.toString()");
                                    u5.getClass();
                                    LinkedHashSet tags = tVar.f11796c;
                                    kotlin.jvm.internal.i.e(tags, "tags");
                                    it2 = tags.iterator();
                                    while (it2.hasNext()) {
                                        B0.s sVar = new B0.s((String) it2.next(), uuid3);
                                        workDatabase_Impl2 = (WorkDatabase_Impl) u5.f207b;
                                        workDatabase_Impl2.b();
                                        workDatabase_Impl2.c();
                                        try {
                                            ((B0.b) u5.f208c).q(sVar);
                                            workDatabase_Impl2.o();
                                        } finally {
                                        }
                                    }
                                    if (z7) {
                                        B0.l r5 = workDatabase.r();
                                        String uuid4 = uuid.toString();
                                        kotlin.jvm.internal.i.d(uuid4, "id.toString()");
                                        str2 = str;
                                        B0.k kVar3 = new B0.k(str2, uuid4);
                                        workDatabase_Impl2 = (WorkDatabase_Impl) r5.f163b;
                                        workDatabase_Impl2.b();
                                        workDatabase_Impl2.c();
                                        try {
                                            ((B0.b) r5.f164c).q(kVar3);
                                            workDatabase_Impl2.o();
                                        } finally {
                                        }
                                    } else {
                                        str2 = str;
                                    }
                                    str4 = str2;
                                    strArr = strArr4;
                                    it = it5;
                                    z17 = z11;
                                    oVar2 = oVar;
                                    j2 = j7;
                                    z = z12;
                                    z5 = z13;
                                    z6 = z14;
                                }
                            } else {
                                str = str4;
                                z11 = z17;
                                oVar = oVar2;
                            }
                            t7.f194b.q(qVar);
                            workDatabase_Impl.o();
                            workDatabase_Impl.k();
                            UUID uuid5 = tVar.f11794a;
                            String[] strArr42 = strArr;
                            if (z16) {
                            }
                            B0.t u52 = workDatabase.u();
                            String uuid32 = uuid5.toString();
                            kotlin.jvm.internal.i.d(uuid32, "id.toString()");
                            u52.getClass();
                            LinkedHashSet tags2 = tVar.f11796c;
                            kotlin.jvm.internal.i.e(tags2, "tags");
                            it2 = tags2.iterator();
                            while (it2.hasNext()) {
                            }
                            if (z7) {
                            }
                            str4 = str2;
                            strArr = strArr42;
                            it = it5;
                            z17 = z11;
                            oVar2 = oVar;
                            j2 = j7;
                            z = z12;
                            z5 = z13;
                            z6 = z14;
                        } catch (Throwable th) {
                            workDatabase_Impl.k();
                            throw th;
                        }
                        j7 = j6;
                        z12 = z;
                        z13 = z5;
                        z14 = z6;
                        tVar = tVar2;
                        workDatabase_Impl = t7.f193a;
                        workDatabase_Impl.b();
                        workDatabase_Impl.c();
                    }
                    z9 = true;
                    kVar2 = kVar;
                    z10 = z17;
                    kVar2.f11874f = z9;
                    return z10;
                }
            } catch (Throwable th2) {
                m6.close();
                c2.g();
                throw th2;
            }
        }
        z8 = false;
        it = kVar2.f11871c.iterator();
        boolean z172 = z8;
        while (it.hasNext()) {
        }
        z9 = true;
        kVar2 = kVar;
        z10 = z172;
        kVar2.f11874f = z9;
        return z10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z;
        B0.t tVar = this.f330b;
        t0.k kVar = this.f329a;
        try {
            kVar.getClass();
            HashSet hashSet = new HashSet();
            hashSet.addAll(kVar.f11872d);
            HashSet F2 = t0.k.F(kVar);
            Iterator it = hashSet.iterator();
            while (true) {
                if (!it.hasNext()) {
                    hashSet.removeAll(kVar.f11872d);
                    z = false;
                    break;
                } else if (F2.contains((String) it.next())) {
                    z = true;
                    break;
                }
            }
            if (z) {
                throw new IllegalStateException("WorkContinuation has cycles (" + kVar + ")");
            }
            t0.o oVar = kVar.f11869a;
            WorkDatabase workDatabase = oVar.f11884c;
            workDatabase.c();
            try {
                boolean a6 = a(kVar);
                workDatabase.o();
                if (a6) {
                    l.a(oVar.f11882a, RescheduleReceiver.class, true);
                    t0.i.a(oVar.f11883b, oVar.f11884c, oVar.f11886e);
                }
                tVar.k(s0.x.f11798R);
            } finally {
                workDatabase.k();
            }
        } catch (Throwable th) {
            tVar.k(new s0.u(th));
        }
    }
}
