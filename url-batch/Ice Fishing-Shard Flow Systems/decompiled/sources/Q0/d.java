package Q0;

import G0.A;
import G0.EnumC0101a;
import G0.y;
import G0.z;
import android.database.Cursor;
import android.os.Build;
import android.text.TextUtils;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.WorkDatabase_Impl;
import androidx.work.impl.background.systemalarm.RescheduleReceiver;
import androidx.work.impl.workers.ConstraintTrackingWorker;
import h0.C0465k;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class d implements Runnable {

    /* renamed from: i, reason: collision with root package name */
    public static final String f2297i = G0.s.f("EnqueueRunnable");

    /* renamed from: d, reason: collision with root package name */
    public final H0.k f2298d;

    /* renamed from: e, reason: collision with root package name */
    public final P0.c f2299e;

    public d(H0.k kVar) {
        P0.c cVar = new P0.c(2);
        this.f2298d = kVar;
        this.f2299e = cVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x02c9  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0320  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x034a  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0378 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0195  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean a(H0.k kVar) {
        boolean z7;
        boolean z8;
        boolean z9;
        List list;
        boolean z10;
        WorkDatabase workDatabase;
        boolean z11;
        boolean z12;
        Iterator it;
        boolean z13;
        boolean z14;
        String[] strArr;
        A a7;
        A a8;
        A a9;
        WorkDatabase_Impl workDatabase_Impl;
        Iterator it2;
        WorkDatabase_Impl workDatabase_Impl2;
        C0465k c0465k;
        H0.k kVar2 = kVar;
        kVar2.getClass();
        HashSet e02 = H0.k.e0(kVar2);
        H0.p pVar = kVar2.f904a;
        List list2 = kVar2.f906c;
        String[] strArr2 = (String[]) e02.toArray(new String[0]);
        String str = kVar2.f905b;
        long currentTimeMillis = System.currentTimeMillis();
        WorkDatabase workDatabase2 = pVar.f920c;
        boolean z15 = strArr2 != null && strArr2.length > 0;
        A a10 = A.f775n;
        A a11 = A.f773l;
        if (z15) {
            z8 = false;
            z9 = false;
            z7 = true;
            for (String str2 : strArr2) {
                P0.p g7 = workDatabase2.t().g(str2);
                if (g7 == null) {
                    G0.s.d().b(f2297i, "Prerequisite " + str2 + " doesn't exist; not enqueuing");
                    break;
                }
                A a12 = g7.f2221b;
                z7 &= a12 == A.f772i;
                if (a12 == a11) {
                    z9 = true;
                } else if (a12 == a10) {
                    z8 = true;
                }
            }
        } else {
            z7 = true;
            z8 = false;
            z9 = false;
        }
        boolean isEmpty = TextUtils.isEmpty(str);
        A a13 = A.f770d;
        if (isEmpty || z15) {
            list = list2;
            z10 = isEmpty;
            workDatabase = workDatabase2;
            z11 = z15;
        } else {
            WorkDatabase_Impl workDatabase_Impl3 = workDatabase2.t().f2239a;
            list = list2;
            C0465k g8 = C0465k.g(1, "SELECT id, state FROM workspec WHERE id IN (SELECT work_spec_id FROM workname WHERE name=?)");
            if (str == null) {
                g8.l(1);
            } else {
                g8.f(1, str);
            }
            workDatabase_Impl3.b();
            Cursor J7 = V6.b.J(workDatabase_Impl3, g8);
            try {
                c0465k = g8;
                try {
                    ArrayList arrayList = new ArrayList(J7.getCount());
                    while (J7.moveToNext()) {
                        String id = J7.isNull(0) ? null : J7.getString(0);
                        boolean z16 = isEmpty;
                        A state = O6.g.U(J7.getInt(1));
                        WorkDatabase workDatabase3 = workDatabase2;
                        boolean z17 = z15;
                        Intrinsics.checkNotNullParameter(id, "id");
                        Intrinsics.checkNotNullParameter(state, "state");
                        P0.o oVar = new P0.o();
                        oVar.f2218a = id;
                        oVar.f2219b = state;
                        arrayList.add(oVar);
                        isEmpty = z16;
                        workDatabase2 = workDatabase3;
                        z15 = z17;
                    }
                    z10 = isEmpty;
                    workDatabase = workDatabase2;
                    z11 = z15;
                    J7.close();
                    c0465k.h();
                    if (!arrayList.isEmpty()) {
                        int size = arrayList.size();
                        int i2 = 0;
                        while (i2 < size) {
                            Object obj = arrayList.get(i2);
                            i2++;
                            A a14 = ((P0.o) obj).f2219b;
                            if (a14 != a13 && a14 != A.f771e) {
                            }
                            z13 = true;
                            z14 = false;
                        }
                        new b(pVar, str, 1).run();
                        P0.q t6 = workDatabase.t();
                        int size2 = arrayList.size();
                        int i5 = 0;
                        while (i5 < size2) {
                            Object obj2 = arrayList.get(i5);
                            int i7 = i5 + 1;
                            String str3 = ((P0.o) obj2).f2218a;
                            WorkDatabase_Impl workDatabase_Impl4 = t6.f2239a;
                            workDatabase_Impl4.b();
                            int i8 = size2;
                            P0.h hVar = t6.f2241c;
                            P0.q qVar = t6;
                            m0.j a15 = hVar.a();
                            if (str3 == null) {
                                a15.l(1);
                            } else {
                                a15.f(1, str3);
                            }
                            workDatabase_Impl4.c();
                            try {
                                a15.a();
                                workDatabase_Impl4.o();
                                workDatabase_Impl4.k();
                                hVar.d(a15);
                                size2 = i8;
                                t6 = qVar;
                                i5 = i7;
                            } catch (Throwable th) {
                                workDatabase_Impl4.k();
                                hVar.d(a15);
                                throw th;
                            }
                        }
                        z12 = true;
                        it = list.iterator();
                        while (it.hasNext()) {
                            G0.u uVar = (G0.u) it.next();
                            P0.p workSpec = uVar.f833b;
                            UUID uuid = uVar.f832a;
                            if (!z11 || z7) {
                                workSpec.f2232n = currentTimeMillis;
                            } else if (z9) {
                                workSpec.f2221b = a11;
                            } else if (z8) {
                                workSpec.f2221b = a10;
                            } else {
                                workSpec.f2221b = A.f774m;
                            }
                            if (workSpec.f2221b == a13) {
                                z12 = true;
                            }
                            P0.q t7 = workDatabase.t();
                            boolean z18 = z12;
                            List schedulers = pVar.f922e;
                            H0.p pVar2 = pVar;
                            Intrinsics.checkNotNullParameter(schedulers, "schedulers");
                            Intrinsics.checkNotNullParameter(workSpec, "workSpec");
                            Iterator it3 = it;
                            long j = currentTimeMillis;
                            try {
                                if (Build.VERSION.SDK_INT < 26) {
                                    Intrinsics.checkNotNullParameter(workSpec, "workSpec");
                                    G0.e eVar = workSpec.j;
                                    String str4 = workSpec.f2222c;
                                    if (!Intrinsics.a(str4, ConstraintTrackingWorker.class.getName()) && (eVar.f797d || eVar.f798e)) {
                                        l2.c cVar = new l2.c(4);
                                        cVar.D(workSpec.f2224e.f810a);
                                        ((HashMap) cVar.f6269d).put("androidx.work.impl.workers.ConstraintTrackingWorker.ARGUMENT_CLASS_NAME", str4);
                                        G0.h input = new G0.h((HashMap) cVar.f6269d);
                                        G0.h.c(input);
                                        Intrinsics.checkNotNullExpressionValue(input, "Builder().putAll(workSpe…ame)\n            .build()");
                                        String workerClassName = ConstraintTrackingWorker.class.getName();
                                        Intrinsics.checkNotNullExpressionValue(workerClassName, "name");
                                        String id2 = workSpec.f2220a;
                                        A state2 = workSpec.f2221b;
                                        a7 = a13;
                                        String str5 = workSpec.f2223d;
                                        G0.h output = workSpec.f2225f;
                                        a8 = a10;
                                        a9 = a11;
                                        long j7 = workSpec.f2226g;
                                        long j8 = workSpec.f2227h;
                                        long j9 = workSpec.f2228i;
                                        G0.e constraints = workSpec.j;
                                        int i9 = workSpec.f2229k;
                                        EnumC0101a backoffPolicy = workSpec.f2230l;
                                        strArr = strArr2;
                                        long j10 = workSpec.f2231m;
                                        long j11 = workSpec.f2232n;
                                        long j12 = workSpec.f2233o;
                                        long j13 = workSpec.f2234p;
                                        boolean z19 = workSpec.f2235q;
                                        z outOfQuotaPolicy = workSpec.f2236r;
                                        int i10 = workSpec.f2237s;
                                        int i11 = workSpec.f2238t;
                                        Intrinsics.checkNotNullParameter(id2, "id");
                                        Intrinsics.checkNotNullParameter(state2, "state");
                                        Intrinsics.checkNotNullParameter(workerClassName, "workerClassName");
                                        Intrinsics.checkNotNullParameter(input, "input");
                                        Intrinsics.checkNotNullParameter(output, "output");
                                        Intrinsics.checkNotNullParameter(constraints, "constraints");
                                        Intrinsics.checkNotNullParameter(backoffPolicy, "backoffPolicy");
                                        Intrinsics.checkNotNullParameter(outOfQuotaPolicy, "outOfQuotaPolicy");
                                        workSpec = new P0.p(id2, state2, workerClassName, str5, input, output, j7, j8, j9, constraints, i9, backoffPolicy, j10, j11, j12, j13, z19, outOfQuotaPolicy, i10, i11);
                                        workDatabase_Impl = t7.f2239a;
                                        workDatabase_Impl.b();
                                        workDatabase_Impl.c();
                                        t7.f2240b.f(workSpec);
                                        workDatabase_Impl.o();
                                        workDatabase_Impl.k();
                                        String[] strArr3 = strArr;
                                        if (z11) {
                                            for (String str6 : strArr3) {
                                                String uuid2 = uuid.toString();
                                                Intrinsics.checkNotNullExpressionValue(uuid2, "id.toString()");
                                                P0.a aVar = new P0.a(uuid2, str6);
                                                P0.c f7 = workDatabase.f();
                                                workDatabase_Impl2 = (WorkDatabase_Impl) f7.f2189e;
                                                workDatabase_Impl2.b();
                                                workDatabase_Impl2.c();
                                                try {
                                                    ((P0.b) f7.f2190i).f(aVar);
                                                    workDatabase_Impl2.o();
                                                    workDatabase_Impl2.k();
                                                } finally {
                                                }
                                            }
                                        }
                                        P0.s u7 = workDatabase.u();
                                        String id3 = uuid.toString();
                                        Intrinsics.checkNotNullExpressionValue(id3, "id.toString()");
                                        Set tags = uVar.f834c;
                                        u7.getClass();
                                        Intrinsics.checkNotNullParameter(id3, "id");
                                        Intrinsics.checkNotNullParameter(tags, "tags");
                                        it2 = tags.iterator();
                                        while (it2.hasNext()) {
                                            P0.r rVar = new P0.r((String) it2.next(), id3);
                                            workDatabase_Impl2 = (WorkDatabase_Impl) u7.f2251d;
                                            workDatabase_Impl2.b();
                                            workDatabase_Impl2.c();
                                            try {
                                                ((P0.b) u7.f2252e).f(rVar);
                                                workDatabase_Impl2.o();
                                            } finally {
                                            }
                                        }
                                        if (z10) {
                                            P0.l r7 = workDatabase.r();
                                            String uuid3 = uuid.toString();
                                            Intrinsics.checkNotNullExpressionValue(uuid3, "id.toString()");
                                            P0.k kVar3 = new P0.k(str, uuid3);
                                            workDatabase_Impl2 = (WorkDatabase_Impl) r7.f2209e;
                                            workDatabase_Impl2.b();
                                            workDatabase_Impl2.c();
                                            try {
                                                ((P0.b) r7.f2210i).f(kVar3);
                                                workDatabase_Impl2.o();
                                            } finally {
                                            }
                                        }
                                        strArr2 = strArr3;
                                        z12 = z18;
                                        pVar = pVar2;
                                        it = it3;
                                        currentTimeMillis = j;
                                        a13 = a7;
                                        a10 = a8;
                                        a11 = a9;
                                    }
                                }
                                t7.f2240b.f(workSpec);
                                workDatabase_Impl.o();
                                workDatabase_Impl.k();
                                String[] strArr32 = strArr;
                                if (z11) {
                                }
                                P0.s u72 = workDatabase.u();
                                String id32 = uuid.toString();
                                Intrinsics.checkNotNullExpressionValue(id32, "id.toString()");
                                Set tags2 = uVar.f834c;
                                u72.getClass();
                                Intrinsics.checkNotNullParameter(id32, "id");
                                Intrinsics.checkNotNullParameter(tags2, "tags");
                                it2 = tags2.iterator();
                                while (it2.hasNext()) {
                                }
                                if (z10) {
                                }
                                strArr2 = strArr32;
                                z12 = z18;
                                pVar = pVar2;
                                it = it3;
                                currentTimeMillis = j;
                                a13 = a7;
                                a10 = a8;
                                a11 = a9;
                            } catch (Throwable th2) {
                                workDatabase_Impl.k();
                                throw th2;
                            }
                            strArr = strArr2;
                            a7 = a13;
                            a8 = a10;
                            a9 = a11;
                            workDatabase_Impl = t7.f2239a;
                            workDatabase_Impl.b();
                            workDatabase_Impl.c();
                        }
                        z13 = true;
                        kVar2 = kVar;
                        z14 = z12;
                        kVar2.f909f = z13;
                        return z14;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    J7.close();
                    c0465k.h();
                    throw th;
                }
            } catch (Throwable th4) {
                th = th4;
                c0465k = g8;
            }
        }
        z12 = false;
        it = list.iterator();
        while (it.hasNext()) {
        }
        z13 = true;
        kVar2 = kVar;
        z14 = z12;
        kVar2.f909f = z13;
        return z14;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z7;
        P0.c cVar = this.f2299e;
        H0.k kVar = this.f2298d;
        try {
            kVar.getClass();
            H0.p pVar = kVar.f904a;
            HashSet hashSet = new HashSet();
            hashSet.addAll(kVar.f907d);
            HashSet e02 = H0.k.e0(kVar);
            Iterator it = hashSet.iterator();
            while (true) {
                if (!it.hasNext()) {
                    hashSet.removeAll(kVar.f907d);
                    z7 = false;
                    break;
                } else if (e02.contains((String) it.next())) {
                    z7 = true;
                    break;
                }
            }
            if (z7) {
                throw new IllegalStateException("WorkContinuation has cycles (" + kVar + ")");
            }
            WorkDatabase workDatabase = pVar.f920c;
            workDatabase.c();
            try {
                boolean a7 = a(kVar);
                workDatabase.o();
                if (a7) {
                    k.a(pVar.f918a, RescheduleReceiver.class, true);
                    H0.i.a(pVar.f919b, pVar.f920c, pVar.f922e);
                }
                cVar.w(y.f836b);
            } finally {
                workDatabase.k();
            }
        } catch (Throwable th) {
            cVar.w(new G0.v(th));
        }
    }
}
