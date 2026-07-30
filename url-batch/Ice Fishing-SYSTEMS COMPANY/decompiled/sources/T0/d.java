package T0;

import D.y;
import J0.x;
import android.database.Cursor;
import android.os.Build;
import android.text.TextUtils;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.WorkDatabase_Impl;
import androidx.work.impl.background.systemalarm.RescheduleReceiver;
import androidx.work.impl.workers.ConstraintTrackingWorker;
import com.google.android.gms.internal.ads.CL;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.UUID;
import u0.C5098i;
import z0.C5266i;

/* loaded from: classes.dex */
public final class d implements Runnable {

    /* renamed from: v, reason: collision with root package name */
    public static final String f3039v = J0.s.f("EnqueueRunnable");

    /* renamed from: n, reason: collision with root package name */
    public final K0.k f3040n;

    /* renamed from: u, reason: collision with root package name */
    public final S0.e f3041u;

    public d(K0.k kVar) {
        S0.e eVar = new S0.e(3);
        this.f3040n = kVar;
        this.f3041u = eVar;
    }

    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0282  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x02d6  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0300  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x032d A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0171  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean a(K0.k kVar) {
        boolean z8;
        boolean z9;
        boolean z10;
        WorkDatabase workDatabase;
        boolean z11;
        boolean z12;
        boolean z13;
        Iterator it;
        boolean z14;
        long j9;
        K0.p pVar;
        Iterator it2;
        boolean z15;
        Iterator it3;
        kVar.getClass();
        String[] strArr = (String[]) K0.k.s(kVar).toArray(new String[0]);
        long currentTimeMillis = System.currentTimeMillis();
        K0.p pVar2 = kVar.f1516a;
        WorkDatabase workDatabase2 = pVar2.f1532c;
        boolean z16 = strArr != null && strArr.length > 0;
        if (z16) {
            z9 = false;
            z10 = false;
            z8 = true;
            for (String str : strArr) {
                S0.p h9 = workDatabase2.t().h(str);
                if (h9 == null) {
                    J0.s.d().b(f3039v, y.k("Prerequisite ", str, " doesn't exist; not enqueuing"));
                    break;
                }
                int i = h9.f2921b;
                z8 &= i == 3;
                if (i == 4) {
                    z10 = true;
                } else if (i == 6) {
                    z9 = true;
                }
            }
        } else {
            z8 = true;
            z9 = false;
            z10 = false;
        }
        String str2 = kVar.f1517b;
        boolean isEmpty = TextUtils.isEmpty(str2);
        if (isEmpty || z16) {
            workDatabase = workDatabase2;
            z11 = isEmpty;
            z12 = z16;
        } else {
            S0.q t9 = workDatabase2.t();
            t9.getClass();
            C5098i a9 = C5098i.a(1, "SELECT id, state FROM workspec WHERE id IN (SELECT work_spec_id FROM workname WHERE name=?)");
            if (str2 == null) {
                a9.o(1);
            } else {
                a9.c(1, str2);
            }
            WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) t9.f2939a;
            workDatabase_Impl.b();
            Cursor m8 = workDatabase_Impl.m(a9);
            try {
                ArrayList arrayList = new ArrayList(m8.getCount());
                while (m8.moveToNext()) {
                    String id = m8.isNull(0) ? null : m8.getString(0);
                    WorkDatabase workDatabase3 = workDatabase2;
                    int k6 = W2.e.k(m8.getInt(1));
                    boolean z17 = isEmpty;
                    boolean z18 = z16;
                    kotlin.jvm.internal.h.e(id, "id");
                    S0.o oVar = new S0.o();
                    oVar.f2918a = id;
                    oVar.f2919b = k6;
                    arrayList.add(oVar);
                    workDatabase2 = workDatabase3;
                    isEmpty = z17;
                    z16 = z18;
                }
                workDatabase = workDatabase2;
                z11 = isEmpty;
                z12 = z16;
                m8.close();
                a9.j();
                if (!arrayList.isEmpty()) {
                    Iterator it4 = arrayList.iterator();
                    while (it4.hasNext()) {
                        int i4 = ((S0.o) it4.next()).f2919b;
                        if (i4 != 1 && i4 != 2) {
                        }
                        z14 = false;
                    }
                    new b(pVar2, str2, 1).run();
                    S0.q t10 = workDatabase.t();
                    Iterator it5 = arrayList.iterator();
                    while (it5.hasNext()) {
                        String str3 = ((S0.o) it5.next()).f2918a;
                        WorkDatabase_Impl workDatabase_Impl2 = (WorkDatabase_Impl) t10.f2939a;
                        workDatabase_Impl2.b();
                        S0.h hVar = (S0.h) t10.f2941c;
                        C5266i a10 = hVar.a();
                        if (str3 == null) {
                            a10.o(1);
                        } else {
                            a10.c(1, str3);
                        }
                        workDatabase_Impl2.c();
                        try {
                            a10.b();
                            workDatabase_Impl2.o();
                        } finally {
                            workDatabase_Impl2.k();
                            hVar.n(a10);
                        }
                    }
                    z13 = true;
                    it = kVar.f1518c.iterator();
                    boolean z19 = z13;
                    while (it.hasNext()) {
                        J0.t tVar = (J0.t) it.next();
                        S0.p pVar3 = tVar.f1332b;
                        if (!z12 || z8) {
                            pVar3.f2932n = currentTimeMillis;
                        } else if (z10) {
                            pVar3.f2921b = 4;
                        } else if (z9) {
                            pVar3.f2921b = 6;
                        } else {
                            pVar3.f2921b = 5;
                        }
                        if (pVar3.f2921b == 1) {
                            z19 = true;
                        }
                        S0.q t11 = workDatabase.t();
                        List schedulers = pVar2.f1534e;
                        kotlin.jvm.internal.h.e(schedulers, "schedulers");
                        try {
                            if (Build.VERSION.SDK_INT < 26) {
                                J0.d dVar = pVar3.f2928j;
                                j9 = currentTimeMillis;
                                String name = ConstraintTrackingWorker.class.getName();
                                String str4 = pVar3.f2922c;
                                if (!kotlin.jvm.internal.h.a(str4, name) && (dVar.f1302d || dVar.f1303e)) {
                                    J0.g gVar = new J0.g(0);
                                    gVar.a(pVar3.f2924e.f1316a);
                                    pVar = pVar2;
                                    gVar.f1313a.put("androidx.work.impl.workers.ConstraintTrackingWorker.ARGUMENT_CLASS_NAME", str4);
                                    J0.h hVar2 = new J0.h(gVar.f1313a);
                                    J0.h.c(hVar2);
                                    String name2 = ConstraintTrackingWorker.class.getName();
                                    int i9 = pVar3.f2921b;
                                    String str5 = pVar3.f2923d;
                                    long j10 = pVar3.f2926g;
                                    J0.d constraints = pVar3.f2928j;
                                    it2 = it;
                                    z15 = z19;
                                    long j11 = pVar3.f2932n;
                                    boolean z20 = pVar3.f2935q;
                                    String id2 = pVar3.f2920a;
                                    kotlin.jvm.internal.h.e(id2, "id");
                                    CL.o(i9, com.anythink.core.express.b.a.f17684b);
                                    J0.h output = pVar3.f2925f;
                                    kotlin.jvm.internal.h.e(output, "output");
                                    kotlin.jvm.internal.h.e(constraints, "constraints");
                                    int i10 = pVar3.f2930l;
                                    CL.o(i10, "backoffPolicy");
                                    int i11 = pVar3.f2936r;
                                    CL.o(i11, "outOfQuotaPolicy");
                                    pVar3 = new S0.p(id2, i9, name2, str5, hVar2, output, j10, pVar3.f2927h, pVar3.i, constraints, pVar3.f2929k, i10, pVar3.f2931m, j11, pVar3.f2933o, pVar3.f2934p, z20, i11, pVar3.f2937s, pVar3.f2938t);
                                    WorkDatabase_Impl workDatabase_Impl3 = (WorkDatabase_Impl) t11.f2939a;
                                    workDatabase_Impl3.b();
                                    workDatabase_Impl3.c();
                                    ((S0.b) t11.f2940b).q(pVar3);
                                    workDatabase_Impl3.o();
                                    workDatabase_Impl3.k();
                                    UUID uuid = tVar.f1331a;
                                    if (z12) {
                                        for (String str6 : strArr) {
                                            String uuid2 = uuid.toString();
                                            kotlin.jvm.internal.h.d(uuid2, "id.toString()");
                                            S0.a aVar = new S0.a(uuid2, str6);
                                            S0.c f6 = workDatabase.f();
                                            workDatabase_Impl3 = (WorkDatabase_Impl) f6.f2886u;
                                            workDatabase_Impl3.b();
                                            workDatabase_Impl3.c();
                                            try {
                                                ((S0.b) f6.f2887v).q(aVar);
                                                workDatabase_Impl3.o();
                                                workDatabase_Impl3.k();
                                            } finally {
                                            }
                                        }
                                    }
                                    S0.s u7 = workDatabase.u();
                                    String uuid3 = uuid.toString();
                                    kotlin.jvm.internal.h.d(uuid3, "id.toString()");
                                    u7.getClass();
                                    LinkedHashSet tags = tVar.f1333c;
                                    kotlin.jvm.internal.h.e(tags, "tags");
                                    it3 = tags.iterator();
                                    while (it3.hasNext()) {
                                        S0.r rVar = new S0.r((String) it3.next(), uuid3);
                                        workDatabase_Impl3 = (WorkDatabase_Impl) u7.f2952u;
                                        workDatabase_Impl3.b();
                                        workDatabase_Impl3.c();
                                        try {
                                            ((S0.b) u7.f2953v).q(rVar);
                                            workDatabase_Impl3.o();
                                            workDatabase_Impl3.k();
                                        } finally {
                                        }
                                    }
                                    if (z11) {
                                        S0.l r9 = workDatabase.r();
                                        String uuid4 = uuid.toString();
                                        kotlin.jvm.internal.h.d(uuid4, "id.toString()");
                                        S0.k kVar2 = new S0.k(str2, uuid4);
                                        workDatabase_Impl3 = (WorkDatabase_Impl) r9.f2910u;
                                        workDatabase_Impl3.b();
                                        workDatabase_Impl3.c();
                                        try {
                                            ((S0.b) r9.f2911v).q(kVar2);
                                            workDatabase_Impl3.o();
                                        } finally {
                                        }
                                    }
                                    pVar2 = pVar;
                                    currentTimeMillis = j9;
                                    it = it2;
                                    z19 = z15;
                                }
                            } else {
                                j9 = currentTimeMillis;
                            }
                            ((S0.b) t11.f2940b).q(pVar3);
                            workDatabase_Impl3.o();
                            workDatabase_Impl3.k();
                            UUID uuid5 = tVar.f1331a;
                            if (z12) {
                            }
                            S0.s u72 = workDatabase.u();
                            String uuid32 = uuid5.toString();
                            kotlin.jvm.internal.h.d(uuid32, "id.toString()");
                            u72.getClass();
                            LinkedHashSet tags2 = tVar.f1333c;
                            kotlin.jvm.internal.h.e(tags2, "tags");
                            it3 = tags2.iterator();
                            while (it3.hasNext()) {
                            }
                            if (z11) {
                            }
                            pVar2 = pVar;
                            currentTimeMillis = j9;
                            it = it2;
                            z19 = z15;
                        } finally {
                        }
                        pVar = pVar2;
                        it2 = it;
                        z15 = z19;
                        WorkDatabase_Impl workDatabase_Impl32 = (WorkDatabase_Impl) t11.f2939a;
                        workDatabase_Impl32.b();
                        workDatabase_Impl32.c();
                    }
                    z14 = z19;
                    kVar.f1521f = true;
                    return z14;
                }
            } catch (Throwable th) {
                m8.close();
                a9.j();
                throw th;
            }
        }
        z13 = false;
        it = kVar.f1518c.iterator();
        boolean z192 = z13;
        while (it.hasNext()) {
        }
        z14 = z192;
        kVar.f1521f = true;
        return z14;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z8;
        S0.e eVar = this.f3041u;
        K0.k kVar = this.f3040n;
        try {
            kVar.getClass();
            HashSet hashSet = new HashSet();
            hashSet.addAll(kVar.f1519d);
            HashSet s3 = K0.k.s(kVar);
            Iterator it = hashSet.iterator();
            while (true) {
                if (!it.hasNext()) {
                    hashSet.removeAll(kVar.f1519d);
                    z8 = false;
                    break;
                } else if (s3.contains((String) it.next())) {
                    z8 = true;
                    break;
                }
            }
            if (z8) {
                throw new IllegalStateException("WorkContinuation has cycles (" + kVar + ")");
            }
            K0.p pVar = kVar.f1516a;
            WorkDatabase workDatabase = pVar.f1532c;
            workDatabase.c();
            try {
                boolean a9 = a(kVar);
                workDatabase.o();
                if (a9) {
                    j.a(pVar.f1530a, RescheduleReceiver.class, true);
                    K0.i.a(pVar.f1531b, pVar.f1532c, pVar.f1534e);
                }
                eVar.j(x.f1335f0);
            } finally {
                workDatabase.k();
            }
        } catch (Throwable th) {
            eVar.j(new J0.u(th));
        }
    }
}
