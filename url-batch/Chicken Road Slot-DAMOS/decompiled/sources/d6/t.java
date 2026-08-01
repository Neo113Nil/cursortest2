package d6;

import android.animation.ValueAnimator;
import android.content.ContentValues;
import android.database.sqlite.SQLiteException;
import android.os.Bundle;
import android.os.RemoteException;
import android.os.SystemClock;
import android.util.Log;
import android.view.View;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.WorkDatabase_Impl;
import c7.c0;
import com.google.android.gms.internal.measurement.b9;
import com.google.android.gms.internal.measurement.c9;
import com.google.android.gms.internal.measurement.d9;
import com.google.android.gms.internal.measurement.e9;
import com.google.android.gms.internal.measurement.f6;
import com.google.android.gms.measurement.internal.AppMeasurementDynamiteService;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicReference;
import o3.l0;
import o3.q0;
import s7.a4;
import s7.b4;
import s7.c4;
import s7.d3;
import s7.e0;
import s7.e3;
import s7.g4;
import s7.h0;
import s7.j4;
import s7.k4;
import s7.l3;
import s7.l4;
import s7.p4;
import s7.q1;
import s7.q2;
import s7.r4;
import s7.v0;
import s7.w1;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class t implements Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f3670d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f3671e;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Object f3672i;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ Object f3673r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ Object f3674s;

    public t(q2 q2Var, AtomicReference atomicReference, String str, String str2) {
        this.f3670d = 6;
        this.f3671e = atomicReference;
        this.f3672i = str;
        this.f3673r = str2;
        Objects.requireNonNull(q2Var);
        this.f3674s = q2Var;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(16:108|109|(5:111|(1:113)|115|116|117)|119|(2:122|120)|123|124|125|126|(2:129|127)|130|131|(1:133)|134|116|117) */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x03dc, code lost:
    
        if (java.lang.System.currentTimeMillis() >= (r7 + r9)) goto L110;
     */
    /* JADX WARN: Code restructure failed: missing block: B:136:0x04ab, code lost:
    
        r5.b().f9053w.b(r2, "Failed to parse queued batch. appId");
     */
    /* JADX WARN: Finally extract failed */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        c6.p k10;
        h0 h0Var;
        h0 h0Var2;
        h0 h0Var3;
        long j;
        switch (this.f3670d) {
            case 0:
                e6.j jVar = (e6.j) this.f3673r;
                UUID uuid = (UUID) this.f3671e;
                String uuid2 = uuid.toString();
                t5.o d10 = t5.o.d();
                String str = u.f3675c;
                StringBuilder sb2 = new StringBuilder("Updating progress for ");
                sb2.append(uuid);
                sb2.append(" (");
                t5.e eVar = (t5.e) this.f3672i;
                sb2.append(eVar);
                sb2.append(")");
                d10.a(str, sb2.toString());
                u uVar = (u) this.f3674s;
                WorkDatabase workDatabase = uVar.f3676a;
                WorkDatabase workDatabase2 = uVar.f3676a;
                workDatabase.c();
                try {
                    k10 = workDatabase2.B().k(uuid2);
                } catch (Throwable th) {
                    try {
                        t5.o.d().c(u.f3675c, "Error updating Worker progress", th);
                        jVar.j(th);
                    } finally {
                        workDatabase2.h();
                    }
                }
                if (k10 == null) {
                    throw new IllegalStateException("Calls to setProgressAsync() must complete before a ListenableWorker signals completion of work by returning an instance of Result.");
                }
                if (k10.f1840b == 2) {
                    c6.m mVar = new c6.m(uuid2, eVar);
                    c6.n A = workDatabase2.A();
                    WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) A.f1833d;
                    workDatabase_Impl.b();
                    workDatabase_Impl.c();
                    try {
                        ((c6.b) A.f1834e).e(mVar);
                        workDatabase_Impl.u();
                        workDatabase_Impl.h();
                    } catch (Throwable th2) {
                        workDatabase_Impl.h();
                        throw th2;
                    }
                } else {
                    t5.o.d().g(str, "Ignoring setProgressAsync(...). WorkSpec (" + uuid2 + ") is not in a RUNNING state.");
                }
                jVar.i(null);
                workDatabase2.u();
                return;
            case 1:
                l.f fVar = (l.f) ((l.d) this.f3674s).f5643e;
                l.j jVar2 = (l.j) this.f3672i;
                l.e eVar2 = (l.e) this.f3671e;
                if (eVar2 != null) {
                    fVar.N = true;
                    eVar2.f5645b.c(false);
                    fVar.N = false;
                }
                if (jVar2.isEnabled() && jVar2.hasSubMenu()) {
                    ((l.i) this.f3673r).p(jVar2, null, 4);
                    return;
                }
                return;
            case 2:
                l0.i((View) this.f3671e, (q0) this.f3672i, (c6.e) this.f3673r);
                ((ValueAnimator) this.f3674s).start();
                return;
            case a4.j.INTEGER_FIELD_NUMBER /* 3 */:
                w1 w1Var = (w1) this.f3671e;
                String str2 = (String) this.f3672i;
                b4 b4Var = (b4) this.f3673r;
                s7.l0 l0Var = (s7.l0) this.f3674s;
                j4 j4Var = w1Var.f9082d;
                j4Var.V();
                j4Var.d().s();
                j4Var.l0();
                s7.m mVar2 = j4Var.f8762i;
                j4.T(mVar2);
                Object obj = null;
                List<k4> x10 = mVar2.x(str2, b4Var, ((Integer) e0.B.a(null)).intValue());
                ArrayList arrayList = new ArrayList();
                for (k4 k4Var : x10) {
                    String str3 = k4Var.f8799c;
                    long j3 = k4Var.f8803h;
                    long j10 = k4Var.f8797a;
                    if (j4Var.s(str2, str3)) {
                        int i3 = k4Var.f8804i;
                        if (i3 > 0) {
                            if (i3 <= ((Integer) e0.f8662z.a(obj)).intValue()) {
                                long min = Math.min(((Long) e0.f8658x.a(obj)).longValue() * (1 << (i3 - 1)), ((Long) e0.f8660y.a(obj)).longValue());
                                j4Var.f().getClass();
                                break;
                            }
                            j4Var.b().B.d("[sgtm] batch skipped waiting for next retry. appId, rowId, lastUploadMillis", str2, Long.valueOf(j10), Long.valueOf(j3));
                            obj = null;
                        }
                        Bundle bundle = new Bundle();
                        for (Map.Entry entry : k4Var.f8800d.entrySet()) {
                            bundle.putString((String) entry.getKey(), (String) entry.getValue());
                        }
                        long j11 = k4Var.f8797a;
                        c9 c9Var = k4Var.f8798b;
                        a4 a4Var = new a4(j11, c9Var.a(), k4Var.f8799c, bundle, k4Var.f8801e.f9103d, k4Var.g, "");
                        b9 b9Var = (b9) l4.d0(c9.A(), a4Var.f8505e);
                        for (int i10 = 0; i10 < ((c9) b9Var.f2389e).u(); i10++) {
                            d9 d9Var = (d9) ((c9) b9Var.f2389e).v(i10).k();
                            j4Var.f().getClass();
                            long currentTimeMillis = System.currentTimeMillis();
                            d9Var.b();
                            ((e9) d9Var.f2389e).j0(currentTimeMillis);
                            b9Var.b();
                            ((c9) b9Var.f2389e).C(i10, (e9) d9Var.d());
                        }
                        a4Var.f8505e = ((c9) b9Var.d()).a();
                        if (Log.isLoggable(j4Var.b().C(), 2)) {
                            l4 l4Var = j4Var.f8766u;
                            j4.T(l4Var);
                            a4Var.f8510u = l4Var.T((c9) b9Var.d());
                        }
                        arrayList.add(a4Var);
                        obj = null;
                    } else {
                        j4Var.b().B.d("[sgtm] batch skipped due to destination in backoff. appId, rowId, url", str2, Long.valueOf(j10), k4Var.f8799c);
                    }
                }
                try {
                    l0Var.e(new c4(arrayList));
                    j4Var.b().B.c(str2, Integer.valueOf(arrayList.size()), "[sgtm] Sending queued upload batches to client. appId, count");
                    return;
                } catch (RemoteException e2) {
                    j4Var.b().f9050t.c(str2, e2, "[sgtm] Failed to return upload batches for app");
                    return;
                }
            case a4.j.LONG_FIELD_NUMBER /* 4 */:
                l3 o6 = ((AppMeasurementDynamiteService) this.f3674s).f3062d.o();
                f6 f6Var = (f6) this.f3671e;
                s7.u uVar2 = (s7.u) this.f3672i;
                String str4 = (String) this.f3673r;
                o6.s();
                o6.t();
                q1 q1Var = (q1) o6.f1478d;
                p4 p4Var = q1Var.f8940w;
                q1.j(p4Var);
                if (z6.g.f10882b.b(((q1) p4Var.f1478d).f8932d, 12451000) == 0) {
                    o6.G(new t(o6, uVar2, str4, f6Var, 8));
                    return;
                }
                v0 v0Var = q1Var.f8937t;
                q1.l(v0Var);
                v0Var.f9053w.a("Not bundling data. Service unavailable or out of date");
                p4 p4Var2 = q1Var.f8940w;
                q1.j(p4Var2);
                p4Var2.i0(f6Var, new byte[0]);
                return;
            case a4.j.STRING_FIELD_NUMBER /* 5 */:
                w1 w1Var2 = (w1) this.f3671e;
                Bundle bundle2 = (Bundle) this.f3672i;
                String str5 = (String) this.f3673r;
                r4 r4Var = (r4) this.f3674s;
                boolean isEmpty = bundle2.isEmpty();
                j4 j4Var2 = w1Var2.f9082d;
                if (isEmpty) {
                    s7.m mVar3 = j4Var2.f8762i;
                    j4.T(mVar3);
                    mVar3.s();
                    mVar3.t();
                    try {
                        mVar3.j0().execSQL("delete from default_event_params where app_id=?", new String[]{str5});
                        return;
                    } catch (SQLiteException e9) {
                        v0 v0Var2 = ((q1) mVar3.f1478d).f8937t;
                        q1.l(v0Var2);
                        v0Var2.f9050t.b(e9, "Error clearing default event params");
                        return;
                    }
                }
                s7.m mVar4 = j4Var2.f8762i;
                j4.T(mVar4);
                q1 q1Var2 = (q1) mVar4.f1478d;
                mVar4.s();
                mVar4.t();
                s7.q qVar = new s7.q((q1) mVar4.f1478d, "", str5, "dep", 0L, 0L, 0L, bundle2);
                l4 l4Var2 = mVar4.f9150e.f8766u;
                j4.T(l4Var2);
                byte[] a9 = l4Var2.S(qVar).a();
                v0 v0Var3 = q1Var2.f8937t;
                q1.l(v0Var3);
                v0Var3.B.c(str5, Integer.valueOf(a9.length), "Saving default event parameters, appId, data size");
                ContentValues contentValues = new ContentValues();
                contentValues.put("app_id", str5);
                contentValues.put("parameters", a9);
                try {
                    if (mVar4.j0().insertWithOnConflict("default_event_params", null, contentValues, 5) == -1) {
                        q1.l(v0Var3);
                        v0Var3.f9050t.b(v0.A(str5), "Failed to insert default event parameters (got -1). appId");
                    }
                } catch (SQLiteException e10) {
                    q1.l(v0Var3);
                    v0Var3.f9050t.c(v0.A(str5), e10, "Error storing default event parameters. appId");
                }
                s7.m mVar5 = j4Var2.f8762i;
                j4.T(mVar5);
                long j12 = r4Var.R;
                try {
                    if (mVar5.P("select count(*) from raw_events where app_id=? and timestamp >= ? and name not like '!_%' escape '!' limit 1;", new String[]{str5, String.valueOf(j12)}, 0L) > 0) {
                        return;
                    }
                    if (mVar5.P("select count(*) from raw_events where app_id=? and timestamp >= ? and name like '!_%' escape '!' limit 1;", new String[]{str5, String.valueOf(j12)}, 0L) > 0) {
                        s7.m mVar6 = j4Var2.f8762i;
                        j4.T(mVar6);
                        mVar6.L(str5, Long.valueOf(j12), null, bundle2);
                        return;
                    }
                    return;
                } catch (SQLiteException e11) {
                    v0 v0Var4 = ((q1) mVar5.f1478d).f8937t;
                    q1.l(v0Var4);
                    v0Var4.f9050t.b(e11, "Error checking backfill conditions");
                    return;
                }
            case a4.j.STRING_SET_FIELD_NUMBER /* 6 */:
                String str6 = (String) this.f3672i;
                String str7 = (String) this.f3673r;
                l3 o10 = ((q1) ((q2) this.f3674s).f1478d).o();
                AtomicReference atomicReference = (AtomicReference) this.f3671e;
                o10.s();
                o10.t();
                o10.G(new r(o10, atomicReference, str6, str7, o10.I(false), 2));
                return;
            case a4.j.DOUBLE_FIELD_NUMBER /* 7 */:
                l3 o11 = ((AppMeasurementDynamiteService) this.f3674s).f3062d.o();
                f6 f6Var2 = (f6) this.f3671e;
                String str8 = (String) this.f3672i;
                String str9 = (String) this.f3673r;
                o11.s();
                o11.t();
                o11.G(new r(o11, str8, str9, o11.I(false), f6Var2, 3));
                return;
            case a4.j.BYTES_FIELD_NUMBER /* 8 */:
                f6 f6Var3 = (f6) this.f3673r;
                l3 l3Var = (l3) this.f3674s;
                byte[] bArr = null;
                try {
                    try {
                        h0Var = l3Var.f8813r;
                    } finally {
                        p4 p4Var3 = ((q1) l3Var.f1478d).f8940w;
                        q1.j(p4Var3);
                        p4Var3.i0(f6Var3, null);
                    }
                } catch (RemoteException e12) {
                    v0 v0Var5 = ((q1) l3Var.f1478d).f8937t;
                    q1.l(v0Var5);
                    v0Var5.f9050t.b(e12, "Failed to send event to the service to bundle");
                }
                if (h0Var != null) {
                    bArr = h0Var.A((String) this.f3672i, (s7.u) this.f3671e);
                    l3Var.F();
                    return;
                }
                q1 q1Var3 = (q1) l3Var.f1478d;
                v0 v0Var6 = q1Var3.f8937t;
                q1.l(v0Var6);
                v0Var6.f9050t.a("Discarding data. Failed to send event to service to bundle");
                p4 p4Var4 = q1Var3.f8940w;
                q1.j(p4Var4);
                p4Var4.i0(f6Var3, null);
                return;
            case 9:
                l3 l3Var2 = (l3) this.f3671e;
                AtomicReference atomicReference2 = (AtomicReference) this.f3672i;
                r4 r4Var2 = (r4) this.f3673r;
                Bundle bundle3 = (Bundle) this.f3674s;
                synchronized (atomicReference2) {
                    try {
                        h0Var2 = l3Var2.f8813r;
                    } catch (RemoteException e13) {
                        v0 v0Var7 = ((q1) l3Var2.f1478d).f8937t;
                        q1.l(v0Var7);
                        v0Var7.f9050t.b(e13, "Failed to request trigger URIs; remote exception");
                        atomicReference2.notifyAll();
                    }
                    if (h0Var2 != null) {
                        h0Var2.z(r4Var2, bundle3, new d3(l3Var2, atomicReference2));
                        l3Var2.F();
                        return;
                    } else {
                        v0 v0Var8 = ((q1) l3Var2.f1478d).f8937t;
                        q1.l(v0Var8);
                        v0Var8.f9050t.a("Failed to request trigger URIs; not connected to service");
                        return;
                    }
                }
            case 10:
                l3 l3Var3 = (l3) this.f3671e;
                AtomicReference atomicReference3 = (AtomicReference) this.f3672i;
                r4 r4Var3 = (r4) this.f3673r;
                b4 b4Var2 = (b4) this.f3674s;
                synchronized (atomicReference3) {
                    try {
                        h0Var3 = l3Var3.f8813r;
                    } catch (RemoteException e14) {
                        v0 v0Var9 = ((q1) l3Var3.f1478d).f8937t;
                        q1.l(v0Var9);
                        v0Var9.f9050t.b(e14, "[sgtm] Failed to get upload batches; remote exception");
                        atomicReference3.notifyAll();
                    }
                    if (h0Var3 != null) {
                        h0Var3.y(r4Var3, b4Var2, new e3(l3Var3, atomicReference3));
                        l3Var3.F();
                        return;
                    } else {
                        v0 v0Var10 = ((q1) l3Var3.f1478d).f8937t;
                        q1.l(v0Var10);
                        v0Var10.f9050t.a("[sgtm] Failed to get upload batches; not connected to service");
                        return;
                    }
                }
            default:
                j4 j4Var3 = ((g4) this.f3674s).f8711d;
                p4 k02 = j4Var3.k0();
                j4Var3.f().getClass();
                long currentTimeMillis2 = System.currentTimeMillis();
                if (j4Var3.e0().D(null, e0.f8619e1)) {
                    j4Var3.f().getClass();
                    j = SystemClock.elapsedRealtime();
                } else {
                    j = 0;
                }
                long j13 = j;
                Bundle bundle4 = (Bundle) this.f3673r;
                String str10 = (String) this.f3672i;
                String str11 = (String) this.f3671e;
                s7.u Z = k02.Z(str10, bundle4, "auto", currentTimeMillis2, j13, false);
                c0.g(Z);
                j4Var3.h(str11, Z);
                return;
        }
    }

    public /* synthetic */ t(Object obj, Object obj2, Object obj3, Object obj4, int i3, boolean z10) {
        this.f3670d = i3;
        this.f3671e = obj;
        this.f3672i = obj2;
        this.f3673r = obj3;
        this.f3674s = obj4;
    }

    public /* synthetic */ t(Object obj, Object obj2, Object obj3, Object obj4, int i3) {
        this.f3670d = i3;
        this.f3674s = obj;
        this.f3671e = obj2;
        this.f3672i = obj3;
        this.f3673r = obj4;
    }
}
