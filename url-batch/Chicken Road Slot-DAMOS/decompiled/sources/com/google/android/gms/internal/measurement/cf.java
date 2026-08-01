package com.google.android.gms.internal.measurement;

import android.app.Service;
import android.app.job.JobParameters;
import android.content.BroadcastReceiver;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import android.os.Bundle;
import android.os.Handler;
import android.os.RemoteException;
import android.text.TextUtils;
import androidx.work.impl.background.systemalarm.ConstraintProxy$BatteryChargingProxy;
import androidx.work.impl.background.systemalarm.ConstraintProxy$BatteryNotLowProxy;
import androidx.work.impl.background.systemalarm.ConstraintProxy$NetworkStateProxy;
import androidx.work.impl.background.systemalarm.ConstraintProxy$StorageNotLowProxy;
import androidx.work.impl.background.systemalarm.ConstraintProxyUpdateReceiver;
import com.appsflyer.attribution.RequestError;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Objects;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final /* synthetic */ class cf implements Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f2201d;

    /* renamed from: e, reason: collision with root package name */
    public Object f2202e;

    /* renamed from: i, reason: collision with root package name */
    public Object f2203i;

    /* renamed from: r, reason: collision with root package name */
    public Object f2204r;

    public cf(s7.l3 l3Var, AtomicReference atomicReference, s7.r4 r4Var) {
        this.f2201d = 9;
        this.f2202e = atomicReference;
        this.f2203i = r4Var;
        Objects.requireNonNull(l3Var);
        this.f2204r = l3Var;
    }

    private final void a() {
        int i3;
        w7.n l10;
        y6.a aVar = (y6.a) this.f2203i;
        Intent intent = aVar.f10624d;
        String stringExtra = intent.getStringExtra("google.message_id");
        if (stringExtra == null) {
            stringExtra = intent.getStringExtra("message_id");
        }
        if (TextUtils.isEmpty(stringExtra)) {
            l10 = z4.w.q(null);
        } else {
            Bundle bundle = new Bundle();
            Intent intent2 = aVar.f10624d;
            String stringExtra2 = intent2.getStringExtra("google.message_id");
            if (stringExtra2 == null) {
                stringExtra2 = intent2.getStringExtra("message_id");
            }
            bundle.putString("google.message_id", stringExtra2);
            Intent intent3 = aVar.f10624d;
            Integer valueOf = intent3.hasExtra("google.product_id") ? Integer.valueOf(intent3.getIntExtra("google.product_id", 0)) : null;
            if (valueOf != null) {
                bundle.putInt("google.product_id", valueOf.intValue());
            }
            Context context = (Context) this.f2202e;
            bundle.putBoolean("supports_message_handled", true);
            y6.l k10 = y6.l.k(context);
            synchronized (k10) {
                i3 = k10.f10659d;
                k10.f10659d = i3 + 1;
            }
            l10 = k10.l(new y6.k(i3, 2, bundle, 0));
        }
        l10.b(d6.n.f3649r, new w7.i((CountDownLatch) this.f2204r));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x0399  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x03aa  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0393  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x04b7  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        boolean z10;
        Object obj;
        s7.t tVar;
        int i3;
        long j;
        int i10;
        Cursor cursor;
        s7.k4 k4Var;
        Cursor cursor2;
        AtomicReference atomicReference;
        s7.l3 l3Var;
        s7.q1 q1Var;
        s7.f1 f1Var;
        s7.p4 p4Var;
        s7.q1 q1Var2;
        s7.f1 f1Var2;
        s7.v0 v0Var;
        switch (this.f2201d) {
            case 0:
                ra raVar = (ra) this.f2202e;
                ListenableFuture listenableFuture = (f8.x0) this.f2203i;
                df dfVar = (df) this.f2204r;
                try {
                    Object b10 = f8.l0.b(listenableFuture);
                    f8.x0 x0Var = (f8.x0) raVar.f2742f;
                    x0Var.l(b10);
                    dfVar.n(x0Var);
                    return;
                } catch (Throwable unused) {
                    dfVar.n(listenableFuture);
                    return;
                }
            case 1:
                if (((wd.b0) this.f2202e).f10141d != null) {
                    kotlin.collections.i0.j();
                    return;
                }
                bg bgVar = (bg) this.f2203i;
                ha haVar = (ha) this.f2204r;
                ag c10 = mf.c();
                bg b11 = mf.b(c10, bgVar);
                try {
                    haVar.run();
                    return;
                } catch (Throwable th) {
                    try {
                        kf.a(th);
                        throw th;
                    } finally {
                        mf.b(c10, b11);
                    }
                }
            case 2:
                ((u5.m) this.f2202e).f9654f.h((u5.i) this.f2203i, (p.e) this.f2204r);
                return;
            case a4.j.INTEGER_FIELD_NUMBER /* 3 */:
                try {
                    obj = ((l3.d) this.f2202e).call();
                } catch (Exception unused2) {
                    obj = null;
                }
                ((Handler) this.f2204r).post(new f8.j0(10, (l3.e) this.f2203i, obj));
                return;
            case a4.j.LONG_FIELD_NUMBER /* 4 */:
                s7.j4 j4Var = ((s7.w1) this.f2204r).f9082d;
                j4Var.V();
                s7.e eVar = (s7.e) this.f2202e;
                Object b12 = eVar.f8596i.b();
                s7.r4 r4Var = (s7.r4) this.f2203i;
                if (b12 == null) {
                    j4Var.a0(eVar, r4Var);
                    return;
                } else {
                    j4Var.Z(eVar, r4Var);
                    return;
                }
            case a4.j.STRING_FIELD_NUMBER /* 5 */:
                s7.u uVar = (s7.u) this.f2202e;
                s7.r4 r4Var2 = (s7.r4) this.f2203i;
                s7.w1 w1Var = (s7.w1) this.f2204r;
                w1Var.getClass();
                s7.j4 j4Var2 = w1Var.f9082d;
                if ("_cmp".equals(uVar.f9035d) && (tVar = uVar.f9036e) != null) {
                    Bundle bundle = tVar.f9010d;
                    if (bundle.size() != 0) {
                        String string = bundle.getString("_cis");
                        if ("referrer broadcast".equals(string) || "referrer API".equals(string)) {
                            j4Var2.b().f9056z.b(uVar.toString(), "Event has been filtered ");
                            uVar = new s7.u("_cmpx", tVar, uVar.f9037i, uVar.f9038r, uVar.f9039s);
                        }
                    }
                }
                String str = uVar.f9035d;
                s7.k1 k1Var = j4Var2.f8760d;
                s7.l4 l4Var = j4Var2.f8766u;
                s7.j4.T(k1Var);
                String str2 = r4Var2.f8976d;
                w5 w5Var = TextUtils.isEmpty(str2) ? null : (w5) k1Var.f8783y.c(str2);
                if (w5Var == null) {
                    j4Var2.b().B.b(r4Var2.f8976d, "EES not loaded for");
                    j4Var2.V();
                    j4Var2.j(uVar, r4Var2);
                    return;
                }
                try {
                    a1.n nVar = w5Var.f2931c;
                    s7.j4.T(l4Var);
                    HashMap g02 = s7.l4.g0(uVar.f9036e.f(), true);
                    String g = s7.d2.g(str, s7.d2.f8585f, s7.d2.f8580a);
                    if (g == null) {
                        g = str;
                    }
                    if (w5Var.a(new b(g, uVar.f9038r, g02))) {
                        if (((b) nVar.f40e).equals((b) nVar.f41i)) {
                            j4Var2.V();
                            j4Var2.j(uVar, r4Var2);
                        } else {
                            j4Var2.b().B.b(str, "EES edited event");
                            s7.j4.T(l4Var);
                            s7.u w6 = s7.l4.w((b) nVar.f40e);
                            j4Var2.V();
                            j4Var2.j(w6, r4Var2);
                        }
                        if (((ArrayList) nVar.f42r).isEmpty()) {
                            return;
                        }
                        ArrayList arrayList = (ArrayList) nVar.f42r;
                        int size = arrayList.size();
                        int i11 = 0;
                        while (i11 < size) {
                            Object obj2 = arrayList.get(i11);
                            i11++;
                            b bVar = (b) obj2;
                            j4Var2.b().B.b(bVar.f2154a, "EES logging created event");
                            s7.j4.T(l4Var);
                            s7.u w10 = s7.l4.w(bVar);
                            j4Var2.V();
                            j4Var2.j(w10, r4Var2);
                        }
                        return;
                    }
                } catch (l6 unused3) {
                    j4Var2.b().f9050t.c(r4Var2.f8977e, str, "EES error. appId, eventName");
                }
                j4Var2.b().B.b(str, "EES was not applied to event");
                j4Var2.V();
                j4Var2.j(uVar, r4Var2);
                return;
            case a4.j.STRING_SET_FIELD_NUMBER /* 6 */:
                s7.w1 w1Var2 = (s7.w1) this.f2204r;
                w1Var2.f9082d.V();
                w1Var2.f9082d.h((String) this.f2203i, (s7.u) this.f2202e);
                return;
            case a4.j.DOUBLE_FIELD_NUMBER /* 7 */:
                s7.j4 j4Var3 = ((s7.w1) this.f2204r).f9082d;
                j4Var3.V();
                s7.m4 m4Var = (s7.m4) this.f2202e;
                Object b13 = m4Var.b();
                s7.r4 r4Var3 = (s7.r4) this.f2203i;
                if (b13 == null) {
                    j4Var3.X(m4Var.f8852e, r4Var3);
                    return;
                } else {
                    j4Var3.W(m4Var, r4Var3);
                    return;
                }
            case a4.j.BYTES_FIELD_NUMBER /* 8 */:
                s7.w1 w1Var3 = (s7.w1) this.f2202e;
                s7.r4 r4Var4 = (s7.r4) this.f2203i;
                s7.d dVar = (s7.d) this.f2204r;
                s7.j4 j4Var4 = w1Var3.f9082d;
                j4Var4.V();
                String str3 = r4Var4.f8976d;
                c7.c0.g(str3);
                HashMap hashMap = j4Var4.S;
                j4Var4.d().s();
                j4Var4.l0();
                s7.m mVar = j4Var4.f8762i;
                s7.j4.T(mVar);
                long j3 = dVar.f8566d;
                long j10 = dVar.f8568i;
                mVar.s();
                mVar.t();
                Cursor cursor3 = null;
                r21 = null;
                s7.k4 k4Var2 = null;
                try {
                    cursor = mVar.j0().query("upload_queue", new String[]{"rowId", "app_id", "measurement_batch", "upload_uri", "upload_headers", "upload_type", "retry_count", "creation_timestamp", "associated_row_id", "last_upload_timestamp"}, "rowId=?", new String[]{String.valueOf(j3)}, null, null, null, "1");
                    try {
                        try {
                        } catch (Throwable th2) {
                            th = th2;
                            cursor2 = cursor;
                        }
                    } catch (SQLiteException e2) {
                        e = e2;
                        i3 = 4;
                        j = j10;
                        i10 = 1;
                        cursor2 = cursor;
                    }
                } catch (SQLiteException e9) {
                    e = e9;
                    i3 = 4;
                    j = j10;
                    i10 = 1;
                    cursor = null;
                } catch (Throwable th3) {
                    th = th3;
                }
                if (!cursor.moveToFirst()) {
                    i3 = 4;
                    j = j10;
                    i10 = 1;
                    if (cursor != null) {
                        cursor.close();
                    }
                    k4Var = k4Var2;
                    if (k4Var != null) {
                        j4Var4.b().f9053w.c(str3, Long.valueOf(j3), "[sgtm] Queued batch doesn't exist. appId, rowId");
                        return;
                    }
                    String str4 = k4Var.f8799c;
                    int i12 = dVar.f8567e;
                    if (i12 != i10) {
                        if (i12 == 3) {
                            s7.i4 i4Var = (s7.i4) hashMap.get(str4);
                            if (i4Var == null) {
                                i4Var = new s7.i4(j4Var4);
                                hashMap.put(str4, i4Var);
                            } else {
                                i4Var.f8745b += i10;
                                i4Var.f8746c = i4Var.a();
                            }
                            j4Var4.f().getClass();
                            j4Var4.b().B.d("[sgtm] Putting sGTM server in backoff mode. appId, destination, nextRetryInSeconds", str3, str4, Long.valueOf((i4Var.f8746c - System.currentTimeMillis()) / 1000));
                        }
                        s7.m mVar2 = j4Var4.f8762i;
                        s7.j4.T(mVar2);
                        Long valueOf = Long.valueOf(dVar.f8566d);
                        mVar2.E(valueOf);
                        j4Var4.b().B.c(str3, valueOf, "[sgtm] increased batch retry count after failed client upload. appId, rowId");
                        return;
                    }
                    if (hashMap.containsKey(str4)) {
                        hashMap.remove(str4);
                    }
                    s7.m mVar3 = j4Var4.f8762i;
                    s7.j4.T(mVar3);
                    Long valueOf2 = Long.valueOf(j3);
                    mVar3.z(valueOf2);
                    j4Var4.b().B.c(str3, valueOf2, "[sgtm] queued batch deleted after successful client upload. appId, rowId");
                    if (j > 0) {
                        s7.m mVar4 = j4Var4.f8762i;
                        s7.j4.T(mVar4);
                        s7.q1 q1Var3 = (s7.q1) mVar4.f1478d;
                        mVar4.s();
                        mVar4.t();
                        Long valueOf3 = Long.valueOf(j);
                        ContentValues contentValues = new ContentValues();
                        contentValues.put("upload_type", Integer.valueOf(i10));
                        g7.a aVar = q1Var3.f8942y;
                        s7.v0 v0Var2 = q1Var3.f8937t;
                        aVar.getClass();
                        contentValues.put("creation_timestamp", Long.valueOf(System.currentTimeMillis()));
                        try {
                            if (mVar4.j0().update("upload_queue", contentValues, "rowid=? AND app_id=? AND upload_type=?", new String[]{String.valueOf(j), str3, String.valueOf(i3)}) != 1) {
                                s7.q1.l(v0Var2);
                                v0Var2.f9053w.c(str3, valueOf3, "Google Signal pending batch not updated. appId, rowId");
                            }
                            j4Var4.b().B.c(str3, Long.valueOf(j), "[sgtm] queued Google Signal batch updated. appId, signalRowId");
                            j4Var4.t(str3);
                            return;
                        } catch (SQLiteException e10) {
                            s7.q1.l(v0Var2);
                            v0Var2.f9050t.d("Failed to update google Signal pending batch. appid, rowId", str3, Long.valueOf(j), e10);
                            throw e10;
                        }
                    }
                    return;
                }
                String string2 = cursor.getString(1);
                c7.c0.g(string2);
                try {
                    try {
                        try {
                            i10 = 1;
                            cursor2 = cursor;
                            i3 = 4;
                            j = j10;
                        } catch (SQLiteException e11) {
                            e = e11;
                            cursor2 = cursor;
                            j = j10;
                            i10 = 1;
                            i3 = 4;
                            cursor = cursor2;
                            try {
                                s7.v0 v0Var3 = ((s7.q1) mVar.f1478d).f8937t;
                                s7.q1.l(v0Var3);
                                v0Var3.f9050t.c(Long.valueOf(j3), e, "Error to querying MeasurementBatch from upload_queue. rowId");
                                if (cursor != null) {
                                }
                                k4Var = k4Var2;
                                if (k4Var != null) {
                                }
                            } catch (Throwable th4) {
                                th = th4;
                                cursor3 = cursor;
                                if (cursor3 != null) {
                                    cursor3.close();
                                }
                                throw th;
                            }
                        }
                    } catch (SQLiteException e12) {
                        e = e12;
                        i10 = 1;
                        cursor2 = cursor;
                        j = j10;
                    }
                } catch (SQLiteException e13) {
                    e = e13;
                    i3 = 4;
                    i10 = 1;
                    cursor2 = cursor;
                    j = j10;
                }
                try {
                    k4Var2 = mVar.V(string2, j3, cursor.getBlob(2), cursor.getString(3), cursor.getString(4), cursor.getInt(5), cursor.getInt(6), cursor.getLong(7), cursor.getLong(8), cursor.getLong(9));
                    cursor2.close();
                } catch (SQLiteException e14) {
                    e = e14;
                    cursor = cursor2;
                    s7.v0 v0Var32 = ((s7.q1) mVar.f1478d).f8937t;
                    s7.q1.l(v0Var32);
                    v0Var32.f9050t.c(Long.valueOf(j3), e, "Error to querying MeasurementBatch from upload_queue. rowId");
                    if (cursor != null) {
                    }
                    k4Var = k4Var2;
                    if (k4Var != null) {
                    }
                } catch (Throwable th5) {
                    th = th5;
                    cursor3 = cursor2;
                    if (cursor3 != null) {
                    }
                    throw th;
                }
                k4Var = k4Var2;
                if (k4Var != null) {
                }
            case 9:
                AtomicReference atomicReference2 = (AtomicReference) this.f2202e;
                synchronized (atomicReference2) {
                    try {
                        try {
                            l3Var = (s7.l3) this.f2204r;
                            q1Var = (s7.q1) l3Var.f1478d;
                            f1Var = q1Var.f8936s;
                            s7.q1.j(f1Var);
                        } catch (RemoteException e15) {
                            s7.v0 v0Var4 = ((s7.q1) ((s7.l3) this.f2204r).f1478d).f8937t;
                            s7.q1.l(v0Var4);
                            v0Var4.f9050t.b(e15, "Failed to get app instance id");
                            atomicReference = (AtomicReference) this.f2202e;
                        }
                        if (f1Var.z().i(s7.b2.ANALYTICS_STORAGE)) {
                            s7.h0 h0Var = l3Var.f8813r;
                            if (h0Var != null) {
                                atomicReference2.set(h0Var.m((s7.r4) this.f2203i));
                                String str5 = (String) atomicReference2.get();
                                if (str5 != null) {
                                    s7.q2 q2Var = ((s7.q1) l3Var.f1478d).A;
                                    s7.q1.k(q2Var);
                                    q2Var.f8948u.set(str5);
                                    s7.f1 f1Var3 = q1Var.f8936s;
                                    s7.q1.j(f1Var3);
                                    f1Var3.f8686u.e(str5);
                                }
                                l3Var.F();
                                atomicReference = (AtomicReference) this.f2202e;
                                atomicReference.notify();
                                return;
                            }
                            s7.v0 v0Var5 = q1Var.f8937t;
                            s7.q1.l(v0Var5);
                            v0Var5.f9050t.a("Failed to get app instance id");
                        } else {
                            s7.v0 v0Var6 = q1Var.f8937t;
                            s7.q1.l(v0Var6);
                            v0Var6.f9055y.a("Analytics storage consent denied; will not get app instance id");
                            s7.q2 q2Var2 = ((s7.q1) l3Var.f1478d).A;
                            s7.q1.k(q2Var2);
                            q2Var2.f8948u.set(null);
                            s7.f1 f1Var4 = q1Var.f8936s;
                            s7.q1.j(f1Var4);
                            f1Var4.f8686u.e(null);
                            atomicReference2.set(null);
                        }
                        atomicReference2.notify();
                        return;
                    } catch (Throwable th6) {
                        ((AtomicReference) this.f2202e).notify();
                        throw th6;
                    }
                }
            case 10:
                f6 f6Var = (f6) this.f2203i;
                s7.l3 l3Var2 = (s7.l3) this.f2204r;
                String str6 = null;
                try {
                    try {
                        q1Var2 = (s7.q1) l3Var2.f1478d;
                        f1Var2 = q1Var2.f8936s;
                        v0Var = q1Var2.f8937t;
                        s7.q1.j(f1Var2);
                    } catch (RemoteException e16) {
                        s7.v0 v0Var7 = ((s7.q1) l3Var2.f1478d).f8937t;
                        s7.q1.l(v0Var7);
                        v0Var7.f9050t.b(e16, "Failed to get app instance id");
                    }
                    if (f1Var2.z().i(s7.b2.ANALYTICS_STORAGE)) {
                        s7.h0 h0Var2 = l3Var2.f8813r;
                        if (h0Var2 != null) {
                            str6 = h0Var2.m((s7.r4) this.f2202e);
                            if (str6 != null) {
                                s7.q2 q2Var3 = q1Var2.A;
                                s7.q1.k(q2Var3);
                                q2Var3.f8948u.set(str6);
                                s7.q1.j(f1Var2);
                                f1Var2.f8686u.e(str6);
                            }
                            l3Var2.F();
                            p4Var = ((s7.q1) l3Var2.f1478d).f8940w;
                            s7.q1.j(p4Var);
                            p4Var.f0(str6, f6Var);
                            return;
                        }
                        s7.q1.l(v0Var);
                        v0Var.f9050t.a("Failed to get app instance id");
                    } else {
                        s7.q1.l(v0Var);
                        v0Var.f9055y.a("Analytics storage consent denied; will not get app instance id");
                        s7.q2 q2Var4 = q1Var2.A;
                        s7.q1.k(q2Var4);
                        q2Var4.f8948u.set(null);
                        s7.q1.j(f1Var2);
                        f1Var2.f8686u.e(null);
                    }
                    p4Var = q1Var2.f8940w;
                    s7.q1.j(p4Var);
                    p4Var.f0(str6, f6Var);
                    return;
                } catch (Throwable th7) {
                    s7.p4 p4Var2 = ((s7.q1) l3Var2.f1478d).f8940w;
                    s7.q1.j(p4Var2);
                    p4Var2.f0(null, f6Var);
                    throw th7;
                }
            case RequestError.STOP_TRACKING /* 11 */:
                s7.l3 l3Var3 = (s7.l3) this.f2202e;
                s7.r4 r4Var5 = (s7.r4) this.f2203i;
                s7.d dVar2 = (s7.d) this.f2204r;
                s7.q1 q1Var4 = (s7.q1) l3Var3.f1478d;
                s7.h0 h0Var3 = l3Var3.f8813r;
                if (h0Var3 == null) {
                    s7.v0 v0Var8 = q1Var4.f8937t;
                    s7.q1.l(v0Var8);
                    v0Var8.f9050t.a("[sgtm] Discarding data. Failed to update batch upload status.");
                    return;
                }
                try {
                    h0Var3.u(r4Var5, dVar2);
                    l3Var3.F();
                    return;
                } catch (RemoteException e17) {
                    s7.v0 v0Var9 = q1Var4.f8937t;
                    s7.q1.l(v0Var9);
                    v0Var9.f9050t.c(Long.valueOf(dVar2.f8566d), e17, "[sgtm] Failed to update batch upload status, rowId, exception");
                    return;
                }
            case 12:
                l.d dVar3 = (l.d) this.f2202e;
                s7.v0 v0Var10 = (s7.v0) this.f2203i;
                JobParameters jobParameters = (JobParameters) this.f2204r;
                v0Var10.B.a("AppMeasurementJobService processed last upload request.");
                ((s7.o3) ((Service) dVar3.f5643e)).c(jobParameters);
                return;
            case 13:
                try {
                    z10 = ((Boolean) ((ListenableFuture) this.f2204r).get()).booleanValue();
                } catch (InterruptedException | ExecutionException unused4) {
                    z10 = true;
                }
                ((u5.e) this.f2202e).f((c6.j) this.f2203i, z10);
                return;
            case 14:
                BroadcastReceiver.PendingResult pendingResult = (BroadcastReceiver.PendingResult) this.f2204r;
                Context context = (Context) this.f2203i;
                Intent intent = (Intent) this.f2202e;
                try {
                    boolean booleanExtra = intent.getBooleanExtra("KEY_BATTERY_NOT_LOW_PROXY_ENABLED", false);
                    boolean booleanExtra2 = intent.getBooleanExtra("KEY_BATTERY_CHARGING_PROXY_ENABLED", false);
                    boolean booleanExtra3 = intent.getBooleanExtra("KEY_STORAGE_NOT_LOW_PROXY_ENABLED", false);
                    boolean booleanExtra4 = intent.getBooleanExtra("KEY_NETWORK_STATE_PROXY_ENABLED", false);
                    t5.o.d().a(ConstraintProxyUpdateReceiver.f773a, "Updating proxies: (BatteryNotLowProxy (" + booleanExtra + "), BatteryChargingProxy (" + booleanExtra2 + "), StorageNotLowProxy (" + booleanExtra3 + "), NetworkStateProxy (" + booleanExtra4 + "), ");
                    d6.j.a(context, ConstraintProxy$BatteryNotLowProxy.class, booleanExtra);
                    d6.j.a(context, ConstraintProxy$BatteryChargingProxy.class, booleanExtra2);
                    d6.j.a(context, ConstraintProxy$StorageNotLowProxy.class, booleanExtra3);
                    d6.j.a(context, ConstraintProxy$NetworkStateProxy.class, booleanExtra4);
                    return;
                } finally {
                    pendingResult.finish();
                }
            case 15:
                a();
                return;
            default:
                ge.h hVar = (ge.h) this.f2202e;
                try {
                    ge.a0.w(hVar.f4357s.F(kotlin.coroutines.d.f5591n), new d2.l2((z4.u) this.f2203i, hVar, (a3.t) this.f2204r, null, 4));
                    return;
                } catch (Throwable th8) {
                    hVar.n(th8);
                    return;
                }
        }
    }

    public String toString() {
        switch (this.f2201d) {
            case 1:
                ha haVar = (ha) this.f2204r;
                StringBuilder sb2 = new StringBuilder(haVar.toString().length() + 14);
                sb2.append("propagating=[");
                sb2.append(haVar);
                sb2.append("]");
                return sb2.toString();
            default:
                return super.toString();
        }
    }

    public /* synthetic */ cf(Object obj, d7.a aVar, Object obj2, int i3) {
        this.f2201d = i3;
        this.f2202e = aVar;
        this.f2203i = obj2;
        this.f2204r = obj;
    }

    public /* synthetic */ cf(Object obj, Object obj2, Object obj3, int i3) {
        this.f2201d = i3;
        this.f2202e = obj;
        this.f2203i = obj2;
        this.f2204r = obj3;
    }

    public /* synthetic */ cf(int i3) {
        this.f2201d = i3;
    }
}
