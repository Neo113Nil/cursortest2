package defpackage;

import android.animation.ValueAnimator;
import android.content.ContentValues;
import android.database.sqlite.SQLiteException;
import android.os.Bundle;
import android.os.RemoteException;
import android.util.Log;
import android.view.View;
import com.google.android.gms.measurement.internal.AppMeasurementDynamiteService;
import com.google.firebase.encoders.json.BuildConfig;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.e;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class ys implements Runnable {
    public final /* synthetic */ int m;
    public final /* synthetic */ Object n;
    public final /* synthetic */ Object o;
    public final /* synthetic */ Object p;
    public final /* synthetic */ Object q;

    public ys(jm3 jm3Var, AtomicReference atomicReference, String str, String str2) {
        this.m = 6;
        this.n = atomicReference;
        this.o = str;
        this.p = str2;
        Objects.requireNonNull(jm3Var);
        this.q = jm3Var;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(16:104|105|(5:107|(1:109)|111|112|113)|115|(2:118|116)|119|120|121|122|(2:125|123)|126|127|(1:129)|130|112|113) */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x03bb, code lost:
    
        if (java.lang.System.currentTimeMillis() >= (r2 + r9)) goto L106;
     */
    /* JADX WARN: Code restructure failed: missing block: B:132:0x048b, code lost:
    
        r1.a().u.c(r4, "Failed to parse queued batch. appId");
     */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        yg3 yg3Var;
        yg3 yg3Var2;
        yg3 yg3Var3;
        byte[] bArr = null;
        switch (this.m) {
            case 0:
                at atVar = (at) ((ar0) this.q).n;
                lk1 lk1Var = (lk1) this.o;
                zs zsVar = (zs) this.n;
                if (zsVar != null) {
                    atVar.L = true;
                    zsVar.b.c(false);
                    atVar.L = false;
                }
                if (lk1Var.isEnabled() && lk1Var.hasSubMenu()) {
                    ((fk1) this.p).q(lk1Var, null, 4);
                    return;
                }
                return;
            case 1:
                fs fsVar = (fs) this.o;
                try {
                    z71.P(((CoroutineContext) this.n).H(e.d), new j5((lb2) this.p, fsVar, (z62) this.q, (o30) null, 9));
                    return;
                } catch (Throwable th) {
                    fsVar.g(th);
                    return;
                }
            case 2:
                d73.i((View) this.n, (i73) this.o, (tt1) this.p);
                ((ValueAnimator) this.q).start();
                return;
            case 3:
                mk3 mk3Var = (mk3) this.n;
                String str = (String) this.o;
                qp3 qp3Var = (qp3) this.p;
                eh3 eh3Var = (eh3) this.q;
                oq3 oq3Var = mk3Var.g;
                oq3Var.B();
                oq3Var.c().v();
                oq3Var.l0();
                tc3 tc3Var = oq3Var.o;
                oq3.U(tc3Var);
                List<rq3> B = tc3Var.B(str, qp3Var, ((Integer) ug3.B.a(null)).intValue());
                ArrayList arrayList = new ArrayList();
                for (rq3 rq3Var : B) {
                    String str2 = rq3Var.c;
                    long j = rq3Var.h;
                    long j2 = rq3Var.a;
                    if (oq3Var.s(str, str2)) {
                        int i = rq3Var.i;
                        if (i > 0) {
                            if (i <= ((Integer) ug3.z.a(bArr)).intValue()) {
                                long min = Math.min(((Long) ug3.x.a(bArr)).longValue() * (1 << (i - 1)), ((Long) ug3.y.a(bArr)).longValue());
                                oq3Var.e().getClass();
                                break;
                            }
                            oq3Var.a().z.e("[sgtm] batch skipped waiting for next retry. appId, rowId, lastUploadMillis", str, Long.valueOf(j2), Long.valueOf(j));
                            bArr = null;
                        }
                        Bundle bundle = new Bundle();
                        for (Map.Entry entry : rq3Var.d.entrySet()) {
                            bundle.putString((String) entry.getKey(), (String) entry.getValue());
                        }
                        long j3 = rq3Var.a;
                        oj3 oj3Var = rq3Var.b;
                        np3 np3Var = new np3(j3, oj3Var.a(), rq3Var.c, bundle, rq3Var.e.m, rq3Var.g, BuildConfig.FLAVOR);
                        mj3 mj3Var = (mj3) bi3.j0(oj3.w(), np3Var.n);
                        for (int i2 = 0; i2 < ((oj3) mj3Var.n).q(); i2++) {
                            qj3 qj3Var = (qj3) ((oj3) mj3Var.n).r(i2).i();
                            oq3Var.e().getClass();
                            long currentTimeMillis = System.currentTimeMillis();
                            qj3Var.b();
                            ((sj3) qj3Var.n).f0(currentTimeMillis);
                            mj3Var.b();
                            ((oj3) mj3Var.n).y(i2, (sj3) qj3Var.d());
                        }
                        np3Var.n = ((oj3) mj3Var.d()).a();
                        if (Log.isLoggable(oq3Var.a().G(), 2)) {
                            bi3 bi3Var = oq3Var.s;
                            oq3.U(bi3Var);
                            np3Var.s = bi3Var.Z((oj3) mj3Var.d());
                        }
                        arrayList.add(np3Var);
                        bArr = null;
                    } else {
                        oq3Var.a().z.e("[sgtm] batch skipped due to destination in backoff. appId, rowId, url", str, Long.valueOf(j2), rq3Var.c);
                    }
                }
                try {
                    eh3Var.s(new tp3(arrayList));
                    oq3Var.a().z.d(str, Integer.valueOf(arrayList.size()), "[sgtm] Sending queued upload batches to client. appId, count");
                    return;
                } catch (RemoteException e) {
                    oq3Var.a().r.d(str, e, "[sgtm] Failed to return upload batches for app");
                    return;
                }
            case 4:
                jo3 p = ((AppMeasurementDynamiteService) this.q).g.p();
                je3 je3Var = (je3) this.n;
                kd3 kd3Var = (kd3) this.o;
                String str3 = (String) this.p;
                p.v();
                p.x();
                pj3 pj3Var = (pj3) p.m;
                zq3 zq3Var = pj3Var.u;
                pj3.k(zq3Var);
                if (tv0.b.b(((pj3) zq3Var.m).m, 12451000) == 0) {
                    p.K(new ys(p, kd3Var, str3, je3Var, 8));
                    return;
                }
                vh3 vh3Var = pj3Var.r;
                pj3.m(vh3Var);
                vh3Var.u.b("Not bundling data. Service unavailable or out of date");
                zq3 zq3Var2 = pj3Var.u;
                pj3.k(zq3Var2);
                zq3Var2.i0(je3Var, new byte[0]);
                return;
            case 5:
                mk3 mk3Var2 = (mk3) this.n;
                Bundle bundle2 = (Bundle) this.o;
                String str4 = (String) this.p;
                cs3 cs3Var = (cs3) this.q;
                oq3 oq3Var2 = mk3Var2.g;
                boolean G = oq3Var2.e0().G(null, ug3.V0);
                if (bundle2.isEmpty() && G) {
                    tc3 tc3Var2 = oq3Var2.o;
                    oq3.U(tc3Var2);
                    tc3Var2.v();
                    tc3Var2.x();
                    try {
                        tc3Var2.l0().execSQL("delete from default_event_params where app_id=?", new String[]{str4});
                        return;
                    } catch (SQLiteException e2) {
                        vh3 vh3Var2 = ((pj3) tc3Var2.m).r;
                        pj3.m(vh3Var2);
                        vh3Var2.r.c(e2, "Error clearing default event params");
                        return;
                    }
                }
                tc3 tc3Var3 = oq3Var2.o;
                oq3.U(tc3Var3);
                pj3 pj3Var2 = (pj3) tc3Var3.m;
                tc3Var3.v();
                tc3Var3.x();
                fd3 fd3Var = new fd3((pj3) tc3Var3.m, BuildConfig.FLAVOR, str4, "dep", 0L, 0L, bundle2);
                bi3 bi3Var2 = tc3Var3.n.s;
                oq3.U(bi3Var2);
                byte[] a = bi3Var2.Y(fd3Var).a();
                vh3 vh3Var3 = pj3Var2.r;
                pj3.m(vh3Var3);
                vh3Var3.z.d(str4, Integer.valueOf(a.length), "Saving default event parameters, appId, data size");
                ContentValues contentValues = new ContentValues();
                contentValues.put("app_id", str4);
                contentValues.put("parameters", a);
                try {
                    if (tc3Var3.l0().insertWithOnConflict("default_event_params", null, contentValues, 5) == -1) {
                        pj3.m(vh3Var3);
                        vh3Var3.r.c(vh3.E(str4), "Failed to insert default event parameters (got -1). appId");
                    }
                } catch (SQLiteException e3) {
                    pj3.m(vh3Var3);
                    vh3Var3.r.d(vh3.E(str4), e3, "Error storing default event parameters. appId");
                }
                tc3 tc3Var4 = oq3Var2.o;
                oq3.U(tc3Var4);
                long j4 = cs3Var.P;
                try {
                    if (tc3Var4.h0("select count(*) from raw_events where app_id=? and timestamp >= ? and name not like '!_%' escape '!' limit 1;", new String[]{str4, String.valueOf(j4)}, 0L) > 0) {
                        return;
                    }
                    if (tc3Var4.h0("select count(*) from raw_events where app_id=? and timestamp >= ? and name like '!_%' escape '!' limit 1;", new String[]{str4, String.valueOf(j4)}, 0L) > 0) {
                        tc3 tc3Var5 = oq3Var2.o;
                        oq3.U(tc3Var5);
                        tc3Var5.O(str4, Long.valueOf(j4), null, bundle2);
                        return;
                    }
                    return;
                } catch (SQLiteException e4) {
                    vh3 vh3Var4 = ((pj3) tc3Var4.m).r;
                    pj3.m(vh3Var4);
                    vh3Var4.r.c(e4, "Error checking backfill conditions");
                    return;
                }
            case 6:
                String str5 = (String) this.o;
                String str6 = (String) this.p;
                jo3 p2 = ((pj3) ((jm3) this.q).m).p();
                AtomicReference atomicReference = (AtomicReference) this.n;
                p2.v();
                p2.x();
                p2.K(new hk3(p2, atomicReference, str5, str6, p2.M(false)));
                return;
            case l42.DOUBLE_FIELD_NUMBER /* 7 */:
                jo3 p3 = ((AppMeasurementDynamiteService) this.q).g.p();
                je3 je3Var2 = (je3) this.n;
                String str7 = (String) this.o;
                String str8 = (String) this.p;
                p3.v();
                p3.x();
                p3.K(new hk3(p3, str7, str8, p3.M(false), je3Var2));
                return;
            case 8:
                je3 je3Var3 = (je3) this.p;
                jo3 jo3Var = (jo3) this.q;
                try {
                    try {
                        yg3Var = jo3Var.p;
                    } catch (RemoteException e5) {
                        vh3 vh3Var5 = ((pj3) jo3Var.m).r;
                        pj3.m(vh3Var5);
                        vh3Var5.r.c(e5, "Failed to send event to the service to bundle");
                    }
                    if (yg3Var != null) {
                        bArr = yg3Var.r((String) this.o, (kd3) this.n);
                        jo3Var.J();
                        return;
                    }
                    pj3 pj3Var3 = (pj3) jo3Var.m;
                    vh3 vh3Var6 = pj3Var3.r;
                    pj3.m(vh3Var6);
                    vh3Var6.r.b("Discarding data. Failed to send event to service to bundle");
                    zq3 zq3Var3 = pj3Var3.u;
                    pj3.k(zq3Var3);
                    zq3Var3.i0(je3Var3, null);
                    return;
                } finally {
                    zq3 zq3Var4 = ((pj3) jo3Var.m).u;
                    pj3.k(zq3Var4);
                    zq3Var4.i0(je3Var3, null);
                }
            case 9:
                jo3 jo3Var2 = (jo3) this.n;
                AtomicReference atomicReference2 = (AtomicReference) this.o;
                cs3 cs3Var2 = (cs3) this.p;
                Bundle bundle3 = (Bundle) this.q;
                synchronized (atomicReference2) {
                    try {
                        yg3Var2 = jo3Var2.p;
                    } catch (RemoteException e6) {
                        vh3 vh3Var7 = ((pj3) jo3Var2.m).r;
                        pj3.m(vh3Var7);
                        vh3Var7.r.c(e6, "Failed to request trigger URIs; remote exception");
                        atomicReference2.notifyAll();
                    }
                    if (yg3Var2 != null) {
                        yg3Var2.C(cs3Var2, bundle3, new gn3(jo3Var2, atomicReference2));
                        jo3Var2.J();
                        return;
                    } else {
                        vh3 vh3Var8 = ((pj3) jo3Var2.m).r;
                        pj3.m(vh3Var8);
                        vh3Var8.r.b("Failed to request trigger URIs; not connected to service");
                        return;
                    }
                }
            case 10:
                jo3 jo3Var3 = (jo3) this.n;
                AtomicReference atomicReference3 = (AtomicReference) this.o;
                cs3 cs3Var3 = (cs3) this.p;
                qp3 qp3Var2 = (qp3) this.q;
                synchronized (atomicReference3) {
                    try {
                        yg3Var3 = jo3Var3.p;
                    } catch (RemoteException e7) {
                        vh3 vh3Var9 = ((pj3) jo3Var3.m).r;
                        pj3.m(vh3Var9);
                        vh3Var9.r.c(e7, "[sgtm] Failed to get upload batches; remote exception");
                        atomicReference3.notifyAll();
                    }
                    if (yg3Var3 != null) {
                        yg3Var3.n(cs3Var3, qp3Var2, new hn3(jo3Var3, atomicReference3));
                        jo3Var3.J();
                        return;
                    } else {
                        vh3 vh3Var10 = ((pj3) jo3Var3.m).r;
                        pj3.m(vh3Var10);
                        vh3Var10.r.b("[sgtm] Failed to get upload batches; not connected to service");
                        return;
                    }
                }
            default:
                oq3 oq3Var3 = ((hq3) this.q).m;
                zq3 k0 = oq3Var3.k0();
                oq3Var3.e().getClass();
                long currentTimeMillis2 = System.currentTimeMillis();
                String str9 = (String) this.n;
                kd3 Z = k0.Z((String) this.o, (Bundle) this.p, "auto", currentTimeMillis2, false);
                ll3.v(Z);
                oq3Var3.h(str9, Z);
                return;
        }
    }

    public /* synthetic */ ys(Object obj, Object obj2, Object obj3, Object obj4, int i, boolean z) {
        this.m = i;
        this.n = obj;
        this.o = obj2;
        this.p = obj3;
        this.q = obj4;
    }

    public /* synthetic */ ys(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.m = i;
        this.q = obj;
        this.n = obj2;
        this.o = obj3;
        this.p = obj4;
    }
}
