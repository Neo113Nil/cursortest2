package defpackage;

import android.app.Service;
import android.app.job.JobParameters;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import android.os.Bundle;
import android.os.Handler;
import android.os.RemoteException;
import android.text.TextUtils;
import com.facebook.appevents.AppEventsConstants;
import com.google.firebase.messaging.Constants;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Objects;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class f92 implements Runnable {
    public final /* synthetic */ int m;
    public Object n;
    public Object o;
    public Object p;

    public f92(jo3 jo3Var, AtomicReference atomicReference, cs3 cs3Var) {
        this.m = 7;
        this.n = atomicReference;
        this.o = cs3Var;
        Objects.requireNonNull(jo3Var);
        this.p = jo3Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:139:0x040b  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x02e8  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x02ef  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0300  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        Object obj;
        int i;
        ys3 k;
        jd3 jd3Var;
        Cursor cursor;
        rq3 rq3Var;
        int i2;
        long j;
        int i3;
        Cursor cursor2;
        rq3 rq3Var2;
        Cursor cursor3;
        AtomicReference atomicReference;
        jo3 jo3Var;
        pj3 pj3Var;
        qi3 qi3Var;
        zq3 zq3Var;
        pj3 pj3Var2;
        qi3 qi3Var2;
        vh3 vh3Var;
        int i4 = 0;
        String str = null;
        switch (this.m) {
            case 0:
                try {
                    obj = ((up0) this.n).call();
                } catch (Exception unused) {
                    obj = null;
                }
                ((Handler) this.p).post(new iu0(11, (vp0) this.o, obj));
                return;
            case 1:
                cv cvVar = (cv) this.o;
                Intent intent = cvVar.m;
                String stringExtra = intent.getStringExtra(Constants.MessagePayloadKeys.MSGID);
                if (stringExtra == null) {
                    stringExtra = intent.getStringExtra(Constants.MessagePayloadKeys.MSGID_SERVER);
                }
                if (TextUtils.isEmpty(stringExtra)) {
                    k = mi2.j(null);
                } else {
                    Bundle bundle = new Bundle();
                    Intent intent2 = cvVar.m;
                    String stringExtra2 = intent2.getStringExtra(Constants.MessagePayloadKeys.MSGID);
                    if (stringExtra2 == null) {
                        stringExtra2 = intent2.getStringExtra(Constants.MessagePayloadKeys.MSGID_SERVER);
                    }
                    bundle.putString(Constants.MessagePayloadKeys.MSGID, stringExtra2);
                    Intent intent3 = cvVar.m;
                    Integer valueOf = intent3.hasExtra(Constants.MessagePayloadKeys.PRODUCT_ID) ? Integer.valueOf(intent3.getIntExtra(Constants.MessagePayloadKeys.PRODUCT_ID, 0)) : null;
                    if (valueOf != null) {
                        bundle.putInt(Constants.MessagePayloadKeys.PRODUCT_ID, valueOf.intValue());
                    }
                    Context context = (Context) this.n;
                    bundle.putBoolean("supports_message_handled", true);
                    vs3 j2 = vs3.j(context);
                    synchronized (j2) {
                        i = j2.a;
                        j2.a = i + 1;
                    }
                    k = j2.k(new ds3(i, 2, bundle, 0));
                }
                k.c(of3.n, new ob3((CountDownLatch) this.p));
                return;
            case 2:
                oq3 oq3Var = ((mk3) this.p).g;
                oq3Var.B();
                yb3 yb3Var = (yb3) this.n;
                Object a = yb3Var.o.a();
                cs3 cs3Var = (cs3) this.o;
                if (a == null) {
                    oq3Var.a0(yb3Var, cs3Var);
                    return;
                } else {
                    oq3Var.Z(yb3Var, cs3Var);
                    return;
                }
            case 3:
                kd3 kd3Var = (kd3) this.n;
                cs3 cs3Var2 = (cs3) this.o;
                mk3 mk3Var = (mk3) this.p;
                mk3Var.getClass();
                oq3 oq3Var2 = mk3Var.g;
                if (Constants.ScionAnalytics.EVENT_FIREBASE_CAMPAIGN.equals(kd3Var.m) && (jd3Var = kd3Var.n) != null) {
                    Bundle bundle2 = jd3Var.m;
                    if (bundle2.size() != 0) {
                        String string = bundle2.getString("_cis");
                        if ("referrer broadcast".equals(string) || "referrer API".equals(string)) {
                            oq3Var2.a().x.c(kd3Var.toString(), "Event has been filtered ");
                            kd3Var = new kd3("_cmpx", jd3Var, kd3Var.o, kd3Var.p);
                        }
                    }
                }
                String str2 = kd3Var.m;
                dj3 dj3Var = oq3Var2.m;
                bi3 bi3Var = oq3Var2.s;
                oq3.U(dj3Var);
                String str3 = cs3Var2.m;
                xd3 xd3Var = TextUtils.isEmpty(str3) ? null : (xd3) dj3Var.v.c(str3);
                if (xd3Var == null) {
                    oq3Var2.a().z.c(cs3Var2.m, "EES not loaded for");
                    oq3Var2.B();
                    oq3Var2.j(kd3Var, cs3Var2);
                    return;
                }
                try {
                    t13 t13Var = xd3Var.c;
                    oq3.U(bi3Var);
                    HashMap m0 = bi3.m0(kd3Var.n.d(), true);
                    String p = th2.p(str2, s93.p, s93.n);
                    if (p == null) {
                        p = str2;
                    }
                    if (xd3Var.a(new jb3(p, kd3Var.p, m0))) {
                        if (((jb3) t13Var.p).equals((jb3) t13Var.o)) {
                            oq3Var2.B();
                            oq3Var2.j(kd3Var, cs3Var2);
                        } else {
                            oq3Var2.a().z.c(str2, "EES edited event");
                            oq3.U(bi3Var);
                            kd3 A = bi3.A((jb3) t13Var.p);
                            oq3Var2.B();
                            oq3Var2.j(A, cs3Var2);
                        }
                        if (((ArrayList) t13Var.n).isEmpty()) {
                            return;
                        }
                        ArrayList arrayList = (ArrayList) t13Var.n;
                        int size = arrayList.size();
                        while (i4 < size) {
                            Object obj2 = arrayList.get(i4);
                            i4++;
                            jb3 jb3Var = (jb3) obj2;
                            oq3Var2.a().z.c(jb3Var.a, "EES logging created event");
                            oq3.U(bi3Var);
                            kd3 A2 = bi3.A(jb3Var);
                            oq3Var2.B();
                            oq3Var2.j(A2, cs3Var2);
                        }
                        return;
                    }
                } catch (re3 unused2) {
                    oq3Var2.a().r.d(cs3Var2.n, str2, "EES error. appId, eventName");
                }
                oq3Var2.a().z.c(str2, "EES was not applied to event");
                oq3Var2.B();
                oq3Var2.j(kd3Var, cs3Var2);
                return;
            case 4:
                mk3 mk3Var2 = (mk3) this.p;
                mk3Var2.g.B();
                mk3Var2.g.h((String) this.o, (kd3) this.n);
                return;
            case 5:
                oq3 oq3Var3 = ((mk3) this.p).g;
                oq3Var3.B();
                tq3 tq3Var = (tq3) this.n;
                Object a2 = tq3Var.a();
                cs3 cs3Var3 = (cs3) this.o;
                if (a2 == null) {
                    oq3Var3.X(tq3Var.n, cs3Var3);
                    return;
                } else {
                    oq3Var3.W(tq3Var, cs3Var3);
                    return;
                }
            case 6:
                mk3 mk3Var3 = (mk3) this.n;
                cs3 cs3Var4 = (cs3) this.o;
                tb3 tb3Var = (tb3) this.p;
                oq3 oq3Var4 = mk3Var3.g;
                oq3Var4.B();
                String str4 = cs3Var4.m;
                ll3.v(str4);
                HashMap hashMap = oq3Var4.Q;
                oq3Var4.c().v();
                oq3Var4.l0();
                tc3 tc3Var = oq3Var4.o;
                oq3.U(tc3Var);
                long j3 = tb3Var.m;
                long j4 = tb3Var.o;
                tc3Var.v();
                tc3Var.x();
                try {
                    cursor2 = tc3Var.l0().query("upload_queue", new String[]{"rowId", "app_id", "measurement_batch", "upload_uri", "upload_headers", "upload_type", "retry_count", "creation_timestamp", "associated_row_id", "last_upload_timestamp"}, "rowId=?", new String[]{String.valueOf(j3)}, null, null, null, AppEventsConstants.EVENT_PARAM_VALUE_YES);
                    try {
                        try {
                        } catch (Throwable th) {
                            th = th;
                            cursor3 = cursor2;
                        }
                    } catch (SQLiteException e) {
                        e = e;
                        rq3Var = null;
                        i2 = 4;
                        j = j4;
                        i3 = 3;
                    }
                } catch (SQLiteException e2) {
                    e = e2;
                    rq3Var = null;
                    i2 = 4;
                    j = j4;
                    i3 = 3;
                    cursor2 = null;
                } catch (Throwable th2) {
                    th = th2;
                    cursor = null;
                }
                if (!cursor2.moveToFirst()) {
                    rq3Var = null;
                    i2 = 4;
                    j = j4;
                    i3 = 3;
                    if (cursor2 != null) {
                        cursor2.close();
                    }
                    rq3Var2 = rq3Var;
                    if (rq3Var2 != null) {
                        oq3Var4.a().u.d(str4, Long.valueOf(j3), "[sgtm] Queued batch doesn't exist. appId, rowId");
                        return;
                    }
                    String str5 = rq3Var2.c;
                    int i5 = tb3Var.n;
                    if (i5 != 1) {
                        if (i5 == i3) {
                            lq3 lq3Var = (lq3) hashMap.get(str5);
                            if (lq3Var == null) {
                                lq3Var = new lq3(oq3Var4);
                                hashMap.put(str5, lq3Var);
                            } else {
                                lq3Var.b++;
                                lq3Var.c = lq3Var.a();
                            }
                            oq3Var4.e().getClass();
                            oq3Var4.a().z.e("[sgtm] Putting sGTM server in backoff mode. appId, destination, nextRetryInSeconds", str4, str5, Long.valueOf((lq3Var.c - System.currentTimeMillis()) / 1000));
                        }
                        tc3 tc3Var2 = oq3Var4.o;
                        oq3.U(tc3Var2);
                        Long valueOf2 = Long.valueOf(tb3Var.m);
                        tc3Var2.I(valueOf2);
                        oq3Var4.a().z.d(str4, valueOf2, "[sgtm] increased batch retry count after failed client upload. appId, rowId");
                        return;
                    }
                    if (hashMap.containsKey(str5)) {
                        hashMap.remove(str5);
                    }
                    tc3 tc3Var3 = oq3Var4.o;
                    oq3.U(tc3Var3);
                    Long valueOf3 = Long.valueOf(j3);
                    tc3Var3.D(valueOf3);
                    oq3Var4.a().z.d(str4, valueOf3, "[sgtm] queued batch deleted after successful client upload. appId, rowId");
                    if (j > 0) {
                        tc3 tc3Var4 = oq3Var4.o;
                        oq3.U(tc3Var4);
                        pj3 pj3Var3 = (pj3) tc3Var4.m;
                        tc3Var4.v();
                        tc3Var4.x();
                        Long valueOf4 = Long.valueOf(j);
                        ContentValues contentValues = new ContentValues();
                        contentValues.put("upload_type", (Integer) 1);
                        qb2 qb2Var = pj3Var3.w;
                        vh3 vh3Var2 = pj3Var3.r;
                        qb2Var.getClass();
                        contentValues.put("creation_timestamp", Long.valueOf(System.currentTimeMillis()));
                        try {
                            if (tc3Var4.l0().update("upload_queue", contentValues, "rowid=? AND app_id=? AND upload_type=?", new String[]{String.valueOf(j), str4, String.valueOf(i2)}) != 1) {
                                pj3.m(vh3Var2);
                                vh3Var2.u.d(str4, valueOf4, "Google Signal pending batch not updated. appId, rowId");
                            }
                            oq3Var4.a().z.d(str4, Long.valueOf(j), "[sgtm] queued Google Signal batch updated. appId, signalRowId");
                            oq3Var4.t(str4);
                            return;
                        } catch (SQLiteException e3) {
                            pj3.m(vh3Var2);
                            vh3Var2.r.e("Failed to update google Signal pending batch. appid, rowId", str4, Long.valueOf(j), e3);
                            throw e3;
                        }
                    }
                    return;
                }
                String string2 = cursor2.getString(1);
                ll3.v(string2);
                try {
                    try {
                        try {
                            rq3Var = null;
                        } catch (SQLiteException e4) {
                            e = e4;
                            rq3Var = null;
                        }
                    } catch (SQLiteException e5) {
                        e = e5;
                        rq3Var = null;
                        i2 = 4;
                        j = j4;
                        i3 = 3;
                        cursor3 = cursor2;
                        cursor2 = cursor3;
                        try {
                            vh3 vh3Var3 = ((pj3) tc3Var.m).r;
                            pj3.m(vh3Var3);
                            vh3Var3.r.d(Long.valueOf(j3), e, "Error to querying MeasurementBatch from upload_queue. rowId");
                            if (cursor2 != null) {
                            }
                            rq3Var2 = rq3Var;
                            if (rq3Var2 != null) {
                            }
                        } catch (Throwable th3) {
                            th = th3;
                            cursor = cursor2;
                            if (cursor != null) {
                                cursor.close();
                            }
                            throw th;
                        }
                    }
                } catch (SQLiteException e6) {
                    e = e6;
                    rq3Var = null;
                    i2 = 4;
                    i3 = 3;
                    cursor3 = cursor2;
                    j = j4;
                }
                try {
                    try {
                        cursor3 = cursor2;
                        j = j4;
                        i2 = 4;
                        i3 = 3;
                    } catch (SQLiteException e7) {
                        e = e7;
                        cursor3 = cursor2;
                        j = j4;
                        i2 = 4;
                        i3 = 3;
                        cursor2 = cursor3;
                        vh3 vh3Var32 = ((pj3) tc3Var.m).r;
                        pj3.m(vh3Var32);
                        vh3Var32.r.d(Long.valueOf(j3), e, "Error to querying MeasurementBatch from upload_queue. rowId");
                        if (cursor2 != null) {
                        }
                        rq3Var2 = rq3Var;
                        if (rq3Var2 != null) {
                        }
                    }
                } catch (SQLiteException e8) {
                    e = e8;
                    i2 = 4;
                    cursor3 = cursor2;
                    j = j4;
                    i3 = 3;
                    cursor2 = cursor3;
                    vh3 vh3Var322 = ((pj3) tc3Var.m).r;
                    pj3.m(vh3Var322);
                    vh3Var322.r.d(Long.valueOf(j3), e, "Error to querying MeasurementBatch from upload_queue. rowId");
                    if (cursor2 != null) {
                    }
                    rq3Var2 = rq3Var;
                    if (rq3Var2 != null) {
                    }
                }
                try {
                    rq3Var2 = tc3Var.X(string2, j3, cursor2.getBlob(2), cursor2.getString(3), cursor2.getString(4), cursor2.getInt(5), cursor2.getInt(6), cursor2.getLong(7), cursor2.getLong(8), cursor2.getLong(9));
                    cursor3.close();
                } catch (SQLiteException e9) {
                    e = e9;
                    cursor2 = cursor3;
                    vh3 vh3Var3222 = ((pj3) tc3Var.m).r;
                    pj3.m(vh3Var3222);
                    vh3Var3222.r.d(Long.valueOf(j3), e, "Error to querying MeasurementBatch from upload_queue. rowId");
                    if (cursor2 != null) {
                    }
                    rq3Var2 = rq3Var;
                    if (rq3Var2 != null) {
                    }
                } catch (Throwable th4) {
                    th = th4;
                    cursor = cursor3;
                    if (cursor != null) {
                    }
                    throw th;
                }
                if (rq3Var2 != null) {
                }
            case l42.DOUBLE_FIELD_NUMBER /* 7 */:
                AtomicReference atomicReference2 = (AtomicReference) this.n;
                synchronized (atomicReference2) {
                    try {
                        try {
                            jo3Var = (jo3) this.p;
                            pj3Var = (pj3) jo3Var.m;
                            qi3Var = pj3Var.q;
                            pj3.k(qi3Var);
                        } catch (RemoteException e10) {
                            vh3 vh3Var4 = ((pj3) ((jo3) this.p).m).r;
                            pj3.m(vh3Var4);
                            vh3Var4.r.c(e10, "Failed to get app instance id");
                            atomicReference = (AtomicReference) this.n;
                        }
                        if (qi3Var.D().i(vk3.ANALYTICS_STORAGE)) {
                            yg3 yg3Var = jo3Var.p;
                            if (yg3Var != null) {
                                atomicReference2.set(yg3Var.F((cs3) this.o));
                                String str6 = (String) atomicReference2.get();
                                if (str6 != null) {
                                    jm3 jm3Var = ((pj3) jo3Var.m).y;
                                    pj3.l(jm3Var);
                                    jm3Var.s.set(str6);
                                    qi3 qi3Var3 = pj3Var.q;
                                    pj3.k(qi3Var3);
                                    qi3Var3.s.e(str6);
                                }
                                jo3Var.J();
                                atomicReference = (AtomicReference) this.n;
                                atomicReference.notify();
                                return;
                            }
                            vh3 vh3Var5 = pj3Var.r;
                            pj3.m(vh3Var5);
                            vh3Var5.r.b("Failed to get app instance id");
                        } else {
                            vh3 vh3Var6 = pj3Var.r;
                            pj3.m(vh3Var6);
                            vh3Var6.w.b("Analytics storage consent denied; will not get app instance id");
                            jm3 jm3Var2 = ((pj3) jo3Var.m).y;
                            pj3.l(jm3Var2);
                            jm3Var2.s.set(null);
                            qi3 qi3Var4 = pj3Var.q;
                            pj3.k(qi3Var4);
                            qi3Var4.s.e(null);
                            atomicReference2.set(null);
                        }
                        atomicReference2.notify();
                        return;
                    } catch (Throwable th5) {
                        ((AtomicReference) this.n).notify();
                        throw th5;
                    }
                }
            case 8:
                je3 je3Var = (je3) this.o;
                jo3 jo3Var2 = (jo3) this.p;
                try {
                    try {
                        pj3Var2 = (pj3) jo3Var2.m;
                        qi3Var2 = pj3Var2.q;
                        vh3Var = pj3Var2.r;
                        pj3.k(qi3Var2);
                    } catch (Throwable th6) {
                        zq3 zq3Var2 = ((pj3) jo3Var2.m).u;
                        pj3.k(zq3Var2);
                        zq3Var2.f0(null, je3Var);
                        throw th6;
                    }
                } catch (RemoteException e11) {
                    vh3 vh3Var7 = ((pj3) jo3Var2.m).r;
                    pj3.m(vh3Var7);
                    vh3Var7.r.c(e11, "Failed to get app instance id");
                }
                if (qi3Var2.D().i(vk3.ANALYTICS_STORAGE)) {
                    yg3 yg3Var2 = jo3Var2.p;
                    if (yg3Var2 != null) {
                        str = yg3Var2.F((cs3) this.n);
                        if (str != null) {
                            jm3 jm3Var3 = pj3Var2.y;
                            pj3.l(jm3Var3);
                            jm3Var3.s.set(str);
                            pj3.k(qi3Var2);
                            qi3Var2.s.e(str);
                        }
                        jo3Var2.J();
                        zq3Var = ((pj3) jo3Var2.m).u;
                        pj3.k(zq3Var);
                        zq3Var.f0(str, je3Var);
                        return;
                    }
                    pj3.m(vh3Var);
                    vh3Var.r.b("Failed to get app instance id");
                } else {
                    pj3.m(vh3Var);
                    vh3Var.w.b("Analytics storage consent denied; will not get app instance id");
                    jm3 jm3Var4 = pj3Var2.y;
                    pj3.l(jm3Var4);
                    jm3Var4.s.set(null);
                    pj3.k(qi3Var2);
                    qi3Var2.s.e(null);
                }
                zq3Var = pj3Var2.u;
                pj3.k(zq3Var);
                zq3Var.f0(str, je3Var);
                return;
            case 9:
                jo3 jo3Var3 = (jo3) this.n;
                cs3 cs3Var5 = (cs3) this.o;
                tb3 tb3Var2 = (tb3) this.p;
                pj3 pj3Var4 = (pj3) jo3Var3.m;
                yg3 yg3Var3 = jo3Var3.p;
                if (yg3Var3 == null) {
                    vh3 vh3Var8 = pj3Var4.r;
                    pj3.m(vh3Var8);
                    vh3Var8.r.b("[sgtm] Discarding data. Failed to update batch upload status.");
                    return;
                }
                try {
                    yg3Var3.j(cs3Var5, tb3Var2);
                    jo3Var3.J();
                    return;
                } catch (RemoteException e12) {
                    vh3 vh3Var9 = pj3Var4.r;
                    pj3.m(vh3Var9);
                    vh3Var9.r.d(Long.valueOf(tb3Var2.m), e12, "[sgtm] Failed to update batch upload status, rowId, exception");
                    return;
                }
            default:
                ot2 ot2Var = (ot2) this.n;
                vh3 vh3Var10 = (vh3) this.o;
                JobParameters jobParameters = (JobParameters) this.p;
                vh3Var10.z.b("AppMeasurementJobService processed last upload request.");
                ((no3) ((Service) ot2Var.n)).c(jobParameters);
                return;
        }
    }

    public /* synthetic */ f92(Object obj, i1 i1Var, Object obj2, int i) {
        this.m = i;
        this.n = i1Var;
        this.o = obj2;
        this.p = obj;
    }

    public /* synthetic */ f92(Object obj, Object obj2, Object obj3, int i) {
        this.m = i;
        this.n = obj;
        this.o = obj2;
        this.p = obj3;
    }

    public /* synthetic */ f92() {
        this.m = 0;
    }
}
