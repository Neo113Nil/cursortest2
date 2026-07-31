package v0;

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
import l0.v;
import m1.AbstractC0521b;
import u0.C0671a;
import u0.C0672b;
import u0.C0673c;
import u0.C0678h;
import u0.C0681k;
import u0.C0682l;
import u0.C0685o;
import u0.C0686p;
import u0.C0687q;
import u0.C0688r;
import u0.C0689s;

/* loaded from: classes.dex */
public final class c implements Runnable {

    /* renamed from: h, reason: collision with root package name */
    public static final String f6057h = l0.q.f("EnqueueRunnable");

    /* renamed from: f, reason: collision with root package name */
    public final m0.k f6058f;

    /* renamed from: g, reason: collision with root package name */
    public final C0689s f6059g;

    public c(m0.k kVar) {
        C0689s c0689s = new C0689s(11);
        this.f6058f = kVar;
        this.f6059g = c0689s;
    }

    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0288  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x02dc  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0306  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0333 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0176  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean a(m0.k kVar) {
        boolean z5;
        boolean z6;
        boolean z7;
        List list;
        boolean z8;
        boolean z9;
        Iterator it;
        boolean z10;
        Iterator it2;
        long j4;
        WorkDatabase workDatabase;
        boolean z11;
        UUID uuid;
        WorkDatabase_Impl workDatabase_Impl;
        Iterator it3;
        WorkDatabase_Impl workDatabase_Impl2;
        kVar.getClass();
        HashSet I6 = m0.k.I(kVar);
        m0.o oVar = kVar.f5360c;
        List list2 = kVar.f5362e;
        String[] strArr = (String[]) I6.toArray(new String[0]);
        String str = kVar.f5361d;
        long currentTimeMillis = System.currentTimeMillis();
        WorkDatabase workDatabase2 = oVar.f5375c;
        boolean z12 = strArr != null && strArr.length > 0;
        if (z12) {
            z6 = false;
            z7 = false;
            z5 = true;
            for (String str2 : strArr) {
                C0686p g7 = workDatabase2.t().g(str2);
                if (g7 == null) {
                    l0.q.d().b(f6057h, "Prerequisite " + str2 + " doesn't exist; not enqueuing");
                    break;
                }
                int i7 = g7.f6001b;
                z5 &= i7 == 3;
                if (i7 == 4) {
                    z7 = true;
                } else if (i7 == 6) {
                    z6 = true;
                }
            }
        } else {
            z5 = true;
            z6 = false;
            z7 = false;
        }
        boolean isEmpty = TextUtils.isEmpty(str);
        if (isEmpty || z12) {
            list = list2;
            z8 = isEmpty;
        } else {
            WorkDatabase_Impl workDatabase_Impl3 = workDatabase2.t().f6020a;
            int i8 = 1;
            Q.k e4 = Q.k.e("SELECT id, state FROM workspec WHERE id IN (SELECT work_spec_id FROM workname WHERE name=?)", 1);
            if (str == null) {
                e4.o(1);
            } else {
                e4.B(str, 1);
            }
            workDatabase_Impl3.b();
            Cursor m4 = workDatabase_Impl3.m(e4);
            try {
                ArrayList arrayList = new ArrayList(m4.getCount());
                while (m4.moveToNext()) {
                    String id = m4.isNull(0) ? null : m4.getString(0);
                    int s6 = AbstractC0521b.s(m4.getInt(i8));
                    List list3 = list2;
                    boolean z13 = isEmpty;
                    kotlin.jvm.internal.i.e(id, "id");
                    C0685o c0685o = new C0685o();
                    c0685o.f5998a = id;
                    c0685o.f5999b = s6;
                    arrayList.add(c0685o);
                    list2 = list3;
                    isEmpty = z13;
                    i8 = 1;
                }
                list = list2;
                z8 = isEmpty;
                m4.close();
                e4.g();
                if (!arrayList.isEmpty()) {
                    int size = arrayList.size();
                    int i9 = 0;
                    while (i9 < size) {
                        Object obj = arrayList.get(i9);
                        i9++;
                        int i10 = ((C0685o) obj).f5999b;
                        if (i10 != 1 && i10 != 2) {
                        }
                        z10 = false;
                    }
                    new b(oVar, str, 1).run();
                    C0687q t6 = workDatabase2.t();
                    int size2 = arrayList.size();
                    int i11 = 0;
                    while (i11 < size2) {
                        Object obj2 = arrayList.get(i11);
                        i11++;
                        String str3 = ((C0685o) obj2).f5998a;
                        WorkDatabase_Impl workDatabase_Impl4 = t6.f6020a;
                        workDatabase_Impl4.b();
                        C0678h c0678h = t6.f6022c;
                        C0687q c0687q = t6;
                        V.i a7 = c0678h.a();
                        int i12 = size2;
                        if (str3 == null) {
                            a7.o(1);
                        } else {
                            a7.B(str3, 1);
                        }
                        workDatabase_Impl4.c();
                        try {
                            a7.a();
                            workDatabase_Impl4.o();
                            workDatabase_Impl4.k();
                            c0678h.n(a7);
                            t6 = c0687q;
                            size2 = i12;
                        } catch (Throwable th) {
                            workDatabase_Impl4.k();
                            c0678h.n(a7);
                            throw th;
                        }
                    }
                    z9 = true;
                    it = list.iterator();
                    boolean z14 = z9;
                    while (it.hasNext()) {
                        l0.r rVar = (l0.r) it.next();
                        C0686p c0686p = rVar.f5285b;
                        UUID uuid2 = rVar.f5284a;
                        if (!z12 || z5) {
                            c0686p.f6013n = currentTimeMillis;
                        } else if (z7) {
                            c0686p.f6001b = 4;
                        } else if (z6) {
                            c0686p.f6001b = 6;
                        } else {
                            c0686p.f6001b = 5;
                        }
                        if (c0686p.f6001b == 1) {
                            z14 = true;
                        }
                        C0687q t7 = workDatabase2.t();
                        List schedulers = oVar.f5377e;
                        m0.o oVar2 = oVar;
                        kotlin.jvm.internal.i.e(schedulers, "schedulers");
                        try {
                            if (Build.VERSION.SDK_INT < 26) {
                                l0.d dVar = c0686p.f6009j;
                                String str4 = c0686p.f6002c;
                                it2 = it;
                                if (!kotlin.jvm.internal.i.a(str4, ConstraintTrackingWorker.class.getName()) && (dVar.f5258d || dVar.f5259e)) {
                                    E3.j jVar = new E3.j(2);
                                    jVar.a(c0686p.f6004e.f5271a);
                                    j4 = currentTimeMillis;
                                    jVar.f659a.put("androidx.work.impl.workers.ConstraintTrackingWorker.ARGUMENT_CLASS_NAME", str4);
                                    l0.g gVar = new l0.g(jVar.f659a);
                                    l0.g.c(gVar);
                                    String name = ConstraintTrackingWorker.class.getName();
                                    String id2 = c0686p.f6000a;
                                    int i13 = c0686p.f6001b;
                                    String str5 = c0686p.f6003d;
                                    l0.g output = c0686p.f6005f;
                                    workDatabase = workDatabase2;
                                    long j7 = c0686p.f6006g;
                                    long j8 = c0686p.f6007h;
                                    long j9 = c0686p.f6008i;
                                    l0.d constraints = c0686p.f6009j;
                                    int i14 = c0686p.f6010k;
                                    int i15 = c0686p.f6011l;
                                    z11 = z12;
                                    uuid = uuid2;
                                    long j10 = c0686p.f6012m;
                                    long j11 = c0686p.f6013n;
                                    long j12 = c0686p.f6014o;
                                    long j13 = c0686p.f6015p;
                                    boolean z15 = c0686p.f6016q;
                                    int i16 = c0686p.f6017r;
                                    int i17 = c0686p.f6018s;
                                    int i18 = c0686p.f6019t;
                                    kotlin.jvm.internal.i.e(id2, "id");
                                    W4.o.f("state", i13);
                                    kotlin.jvm.internal.i.e(output, "output");
                                    kotlin.jvm.internal.i.e(constraints, "constraints");
                                    W4.o.f("backoffPolicy", i15);
                                    W4.o.f("outOfQuotaPolicy", i16);
                                    c0686p = new C0686p(id2, i13, name, str5, gVar, output, j7, j8, j9, constraints, i14, i15, j10, j11, j12, j13, z15, i16, i17, i18);
                                    workDatabase_Impl = t7.f6020a;
                                    workDatabase_Impl.b();
                                    workDatabase_Impl.c();
                                    t7.f6021b.q(c0686p);
                                    workDatabase_Impl.o();
                                    workDatabase_Impl.k();
                                    if (z11) {
                                        for (String str6 : strArr) {
                                            String uuid3 = uuid.toString();
                                            kotlin.jvm.internal.i.d(uuid3, "id.toString()");
                                            C0671a c0671a = new C0671a(uuid3, str6);
                                            C0673c f7 = workDatabase.f();
                                            workDatabase_Impl2 = (WorkDatabase_Impl) f7.f5968f;
                                            workDatabase_Impl2.b();
                                            workDatabase_Impl2.c();
                                            try {
                                                ((C0672b) f7.f5969g).q(c0671a);
                                                workDatabase_Impl2.o();
                                                workDatabase_Impl2.k();
                                            } finally {
                                            }
                                        }
                                    }
                                    C0689s u6 = workDatabase.u();
                                    String uuid4 = uuid.toString();
                                    kotlin.jvm.internal.i.d(uuid4, "id.toString()");
                                    Set tags = rVar.f5286c;
                                    u6.getClass();
                                    kotlin.jvm.internal.i.e(tags, "tags");
                                    it3 = tags.iterator();
                                    while (it3.hasNext()) {
                                        C0688r c0688r = new C0688r((String) it3.next(), uuid4);
                                        workDatabase_Impl2 = (WorkDatabase_Impl) u6.f6034f;
                                        workDatabase_Impl2.b();
                                        workDatabase_Impl2.c();
                                        try {
                                            ((C0672b) u6.f6035g).q(c0688r);
                                            workDatabase_Impl2.o();
                                        } finally {
                                        }
                                    }
                                    if (z8) {
                                        C0682l r6 = workDatabase.r();
                                        String uuid5 = uuid.toString();
                                        kotlin.jvm.internal.i.d(uuid5, "id.toString()");
                                        C0681k c0681k = new C0681k(str, uuid5);
                                        workDatabase_Impl2 = (WorkDatabase_Impl) r6.f5989f;
                                        workDatabase_Impl2.b();
                                        workDatabase_Impl2.c();
                                        try {
                                            ((C0672b) r6.f5990g).q(c0681k);
                                            workDatabase_Impl2.o();
                                        } finally {
                                        }
                                    }
                                    oVar = oVar2;
                                    workDatabase2 = workDatabase;
                                    it = it2;
                                    currentTimeMillis = j4;
                                    z12 = z11;
                                }
                            } else {
                                it2 = it;
                            }
                            t7.f6021b.q(c0686p);
                            workDatabase_Impl.o();
                            workDatabase_Impl.k();
                            if (z11) {
                            }
                            C0689s u62 = workDatabase.u();
                            String uuid42 = uuid.toString();
                            kotlin.jvm.internal.i.d(uuid42, "id.toString()");
                            Set tags2 = rVar.f5286c;
                            u62.getClass();
                            kotlin.jvm.internal.i.e(tags2, "tags");
                            it3 = tags2.iterator();
                            while (it3.hasNext()) {
                            }
                            if (z8) {
                            }
                            oVar = oVar2;
                            workDatabase2 = workDatabase;
                            it = it2;
                            currentTimeMillis = j4;
                            z12 = z11;
                        } catch (Throwable th2) {
                            workDatabase_Impl.k();
                            throw th2;
                        }
                        j4 = currentTimeMillis;
                        workDatabase = workDatabase2;
                        z11 = z12;
                        uuid = uuid2;
                        workDatabase_Impl = t7.f6020a;
                        workDatabase_Impl.b();
                        workDatabase_Impl.c();
                    }
                    z10 = z14;
                    kVar.f5365h = true;
                    return z10;
                }
            } catch (Throwable th3) {
                m4.close();
                e4.g();
                throw th3;
            }
        }
        z9 = false;
        it = list.iterator();
        boolean z142 = z9;
        while (it.hasNext()) {
        }
        z10 = z142;
        kVar.f5365h = true;
        return z10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z5;
        C0689s c0689s = this.f6059g;
        m0.k kVar = this.f6058f;
        try {
            kVar.getClass();
            m0.o oVar = kVar.f5360c;
            HashSet hashSet = new HashSet();
            hashSet.addAll(kVar.f5363f);
            HashSet I6 = m0.k.I(kVar);
            Iterator it = hashSet.iterator();
            while (true) {
                if (!it.hasNext()) {
                    hashSet.removeAll(kVar.f5363f);
                    z5 = false;
                    break;
                } else if (I6.contains((String) it.next())) {
                    z5 = true;
                    break;
                }
            }
            if (z5) {
                throw new IllegalStateException("WorkContinuation has cycles (" + kVar + ")");
            }
            WorkDatabase workDatabase = oVar.f5375c;
            workDatabase.c();
            try {
                boolean a7 = a(kVar);
                workDatabase.o();
                if (a7) {
                    i.a(oVar.f5373a, RescheduleReceiver.class, true);
                    m0.i.a(oVar.f5374b, oVar.f5375c, oVar.f5377e);
                }
                c0689s.u(v.f5288d);
            } finally {
                workDatabase.k();
            }
        } catch (Throwable th) {
            c0689s.u(new l0.s(th));
        }
    }
}
