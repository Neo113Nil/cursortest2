package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ResolveInfo;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteFullException;
import android.os.Bundle;
import android.os.Looper;
import android.os.Parcel;
import android.os.RemoteException;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Pair;
import com.facebook.appevents.AppEventsConstants;
import com.facebook.internal.NativeProtocol;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class jo3 extends xg3 {
    public final eo3 o;
    public yg3 p;
    public volatile Boolean q;
    public final nn3 r;
    public ScheduledExecutorService s;
    public final nx0 t;
    public final ArrayList u;
    public final nn3 v;

    public jo3(pj3 pj3Var) {
        super(pj3Var);
        this.u = new ArrayList();
        this.t = new nx0(pj3Var.w);
        this.o = new eo3(this);
        this.r = new nn3(this, pj3Var, 0);
        this.v = new nn3(this, pj3Var, 1);
    }

    public final void A(AtomicReference atomicReference) {
        v();
        x();
        K(new f92(this, atomicReference, M(false)));
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0056  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void B(Bundle bundle) {
        boolean z;
        boolean D;
        v();
        x();
        jd3 jd3Var = new jd3(bundle);
        I();
        pj3 pj3Var = (pj3) this.m;
        if (pj3Var.p.G(null, ug3.b1)) {
            lh3 o = pj3Var.o();
            pj3 pj3Var2 = (pj3) o.m;
            zq3 zq3Var = pj3Var2.u;
            vh3 vh3Var = pj3Var2.r;
            pj3.k(zq3Var);
            byte[] b0 = zq3.b0(jd3Var);
            if (b0 == null) {
                pj3.m(vh3Var);
                vh3Var.s.b("Null default event parameters; not writing to database");
            } else if (b0.length > 131072) {
                pj3.m(vh3Var);
                vh3Var.s.b("Default event parameters too long for local database. Sending directly to service");
            } else {
                D = o.D(4, b0);
                if (D) {
                    z = true;
                    K(new fi3(this, M(false), z, jd3Var, bundle));
                }
            }
            D = false;
            if (D) {
            }
        }
        z = false;
        K(new fi3(this, M(false), z, jd3Var, bundle));
    }

    public final void C() {
        v();
        x();
        if (N()) {
            return;
        }
        if (D()) {
            eo3 eo3Var = this.o;
            jo3 jo3Var = eo3Var.o;
            jo3Var.v();
            Context context = ((pj3) jo3Var.m).m;
            synchronized (eo3Var) {
                try {
                    if (eo3Var.m) {
                        vh3 vh3Var = ((pj3) eo3Var.o.m).r;
                        pj3.m(vh3Var);
                        vh3Var.z.b("Connection attempt already in progress");
                        return;
                    } else {
                        if (eo3Var.n != null && (eo3Var.n.f() || eo3Var.n.a())) {
                            vh3 vh3Var2 = ((pj3) eo3Var.o.m).r;
                            pj3.m(vh3Var2);
                            vh3Var2.z.b("Already awaiting connection attempt");
                            return;
                        }
                        eo3Var.n = new ph3(context, Looper.getMainLooper(), rs3.a(context), tv0.b, 93, eo3Var, eo3Var, null);
                        vh3 vh3Var3 = ((pj3) eo3Var.o.m).r;
                        pj3.m(vh3Var3);
                        vh3Var3.z.b("Connecting to remote service");
                        eo3Var.m = true;
                        ll3.v(eo3Var.n);
                        eo3Var.n.m();
                        return;
                    }
                } finally {
                }
            }
        }
        pj3 pj3Var = (pj3) this.m;
        if (pj3Var.p.z()) {
            return;
        }
        List<ResolveInfo> queryIntentServices = pj3Var.m.getPackageManager().queryIntentServices(new Intent().setClassName(pj3Var.m, "com.google.android.gms.measurement.AppMeasurementService"), NativeProtocol.MESSAGE_GET_ACCESS_TOKEN_REQUEST);
        if (queryIntentServices == null || queryIntentServices.isEmpty()) {
            vh3 vh3Var4 = pj3Var.r;
            pj3.m(vh3Var4);
            vh3Var4.r.b("Unable to use remote or local measurement implementation. Please register the AppMeasurementService service in the app manifest");
            return;
        }
        Intent intent = new Intent("com.google.android.gms.measurement.START");
        intent.setComponent(new ComponentName(pj3Var.m, "com.google.android.gms.measurement.AppMeasurementService"));
        eo3 eo3Var2 = this.o;
        jo3 jo3Var2 = eo3Var2.o;
        jo3Var2.v();
        Context context2 = ((pj3) jo3Var2.m).m;
        i10 b = i10.b();
        synchronized (eo3Var2) {
            try {
                boolean z = eo3Var2.m;
                jo3 jo3Var3 = eo3Var2.o;
                if (z) {
                    vh3 vh3Var5 = ((pj3) jo3Var3.m).r;
                    pj3.m(vh3Var5);
                    vh3Var5.z.b("Connection attempt already in progress");
                } else {
                    vh3 vh3Var6 = ((pj3) jo3Var3.m).r;
                    pj3.m(vh3Var6);
                    vh3Var6.z.b("Using local app measurement service");
                    eo3Var2.m = true;
                    b.a(context2, intent, jo3Var3.o, 129);
                }
            } finally {
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0111  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean D() {
        v();
        x();
        if (this.q == null) {
            v();
            x();
            pj3 pj3Var = (pj3) this.m;
            qi3 qi3Var = pj3Var.q;
            pj3.k(qi3Var);
            qi3Var.v();
            boolean z = false;
            Boolean valueOf = !qi3Var.A().contains("use_service") ? null : Boolean.valueOf(qi3Var.A().getBoolean("use_service", false));
            if (valueOf == null || !valueOf.booleanValue()) {
                gh3 r = ((pj3) this.m).r();
                r.x();
                if (r.y != 1) {
                    vh3 vh3Var = pj3Var.r;
                    pj3.m(vh3Var);
                    vh3Var.z.b("Checking service availability");
                    zq3 zq3Var = pj3Var.u;
                    pj3.k(zq3Var);
                    int b = tv0.b.b(((pj3) zq3Var.m).m, 12451000);
                    if (b != 0) {
                        if (b == 1) {
                            vh3 vh3Var2 = pj3Var.r;
                            pj3.m(vh3Var2);
                            vh3Var2.z.b("Service missing");
                        } else if (b != 2) {
                            if (b != 3) {
                                vh3 vh3Var3 = pj3Var.r;
                                if (b == 9) {
                                    pj3.m(vh3Var3);
                                    vh3Var3.u.b("Service invalid");
                                } else if (b != 18) {
                                    pj3.m(vh3Var3);
                                    vh3Var3.u.c(Integer.valueOf(b), "Unexpected service status");
                                } else {
                                    pj3.m(vh3Var3);
                                    vh3Var3.u.b("Service updating");
                                }
                            } else {
                                vh3 vh3Var4 = pj3Var.r;
                                pj3.m(vh3Var4);
                                vh3Var4.u.b("Service disabled");
                            }
                            r2 = false;
                        } else {
                            vh3 vh3Var5 = pj3Var.r;
                            pj3.m(vh3Var5);
                            vh3Var5.y.b("Service container out of date");
                            zq3 zq3Var2 = pj3Var.u;
                            pj3.k(zq3Var2);
                            if (zq3Var2.d0() >= 17443) {
                                z = valueOf == null;
                                r2 = false;
                            }
                        }
                        if (z && pj3Var.p.z()) {
                            vh3 vh3Var6 = pj3Var.r;
                            pj3.m(vh3Var6);
                            vh3Var6.r.b("No way to upload. Consider using the full version of Analytics");
                        } else if (r2) {
                            qi3 qi3Var2 = pj3Var.q;
                            pj3.k(qi3Var2);
                            qi3Var2.v();
                            SharedPreferences.Editor edit = qi3Var2.A().edit();
                            edit.putBoolean("use_service", z);
                            edit.apply();
                        }
                        r2 = z;
                    } else {
                        vh3 vh3Var7 = pj3Var.r;
                        pj3.m(vh3Var7);
                        vh3Var7.z.b("Service available");
                    }
                }
                z = true;
                if (z) {
                }
                if (r2) {
                }
                r2 = z;
            }
            this.q = Boolean.valueOf(r2);
        }
        return this.q.booleanValue();
    }

    public final void E() {
        v();
        x();
        eo3 eo3Var = this.o;
        if (eo3Var.n != null && (eo3Var.n.a() || eo3Var.n.f())) {
            eo3Var.n.o();
        }
        eo3Var.n = null;
        try {
            i10.b().c(((pj3) this.m).m, eo3Var);
        } catch (IllegalArgumentException | IllegalStateException unused) {
        }
        this.p = null;
    }

    public final boolean F() {
        v();
        x();
        if (!D()) {
            return true;
        }
        zq3 zq3Var = ((pj3) this.m).u;
        pj3.k(zq3Var);
        return zq3Var.d0() >= ((Integer) ug3.J0.a(null)).intValue();
    }

    public final boolean G() {
        v();
        x();
        if (!D()) {
            return true;
        }
        zq3 zq3Var = ((pj3) this.m).u;
        pj3.k(zq3Var);
        return zq3Var.d0() >= 241200;
    }

    public final void H(ComponentName componentName) {
        v();
        if (this.p != null) {
            this.p = null;
            vh3 vh3Var = ((pj3) this.m).r;
            pj3.m(vh3Var);
            vh3Var.z.c(componentName, "Disconnected from device MeasurementService");
            v();
            C();
        }
    }

    public final void I() {
        ((pj3) this.m).getClass();
    }

    public final void J() {
        v();
        nx0 nx0Var = this.t;
        ((qb2) nx0Var.n).getClass();
        nx0Var.m = SystemClock.elapsedRealtime();
        ((pj3) this.m).getClass();
        this.r.b(((Long) ug3.Y.a(null)).longValue());
    }

    public final void K(Runnable runnable) {
        v();
        if (N()) {
            runnable.run();
            return;
        }
        ArrayList arrayList = this.u;
        long size = arrayList.size();
        pj3 pj3Var = (pj3) this.m;
        pj3Var.getClass();
        if (size >= 1000) {
            vh3 vh3Var = pj3Var.r;
            pj3.m(vh3Var);
            vh3Var.r.b("Discarding data. Max runnable queue size reached");
        } else {
            arrayList.add(runnable);
            this.v.b(60000L);
            C();
        }
    }

    public final void L() {
        v();
        pj3 pj3Var = (pj3) this.m;
        vh3 vh3Var = pj3Var.r;
        pj3.m(vh3Var);
        g10 g10Var = vh3Var.z;
        ArrayList arrayList = this.u;
        g10Var.c(Integer.valueOf(arrayList.size()), "Processing queued up service tasks");
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            try {
                ((Runnable) obj).run();
            } catch (RuntimeException e) {
                vh3 vh3Var2 = pj3Var.r;
                pj3.m(vh3Var2);
                vh3Var2.r.c(e, "Task exception while flushing queue");
            }
        }
        arrayList.clear();
        this.v.c();
    }

    public final cs3 M(boolean z) {
        long abs;
        Pair pair;
        pj3 pj3Var = (pj3) this.m;
        pj3Var.getClass();
        gh3 r = pj3Var.r();
        String str = null;
        if (z) {
            vh3 vh3Var = pj3Var.r;
            pj3.m(vh3Var);
            pj3 pj3Var2 = (pj3) vh3Var.m;
            qi3 qi3Var = pj3Var2.q;
            pj3.k(qi3Var);
            if (qi3Var.q != null) {
                qi3 qi3Var2 = pj3Var2.q;
                pj3.k(qi3Var2);
                ni3 ni3Var = qi3Var2.q;
                qi3 qi3Var3 = (qi3) ni3Var.e;
                qi3Var3.v();
                qi3Var3.v();
                long j = ((qi3) ni3Var.e).A().getLong((String) ni3Var.b, 0L);
                if (j == 0) {
                    ni3Var.b();
                    abs = 0;
                } else {
                    ((pj3) qi3Var3.m).w.getClass();
                    abs = Math.abs(j - System.currentTimeMillis());
                }
                long j2 = ni3Var.a;
                if (abs >= j2) {
                    if (abs > j2 + j2) {
                        ni3Var.b();
                    } else {
                        String string = qi3Var3.A().getString((String) ni3Var.d, null);
                        long j3 = qi3Var3.A().getLong((String) ni3Var.c, 0L);
                        ni3Var.b();
                        pair = (string == null || j3 <= 0) ? qi3.L : new Pair(string, Long.valueOf(j3));
                        if (pair != null && pair != qi3.L) {
                            String valueOf = String.valueOf(pair.second);
                            String str2 = (String) pair.first;
                            StringBuilder sb = new StringBuilder(valueOf.length() + 1 + String.valueOf(str2).length());
                            sb.append(valueOf);
                            sb.append(":");
                            sb.append(str2);
                            str = sb.toString();
                        }
                    }
                }
                pair = null;
                if (pair != null) {
                    String valueOf2 = String.valueOf(pair.second);
                    String str22 = (String) pair.first;
                    StringBuilder sb2 = new StringBuilder(valueOf2.length() + 1 + String.valueOf(str22).length());
                    sb2.append(valueOf2);
                    sb2.append(":");
                    sb2.append(str22);
                    str = sb2.toString();
                }
            }
        }
        return r.A(str);
    }

    public final boolean N() {
        v();
        x();
        return this.p != null;
    }

    /* JADX WARN: Removed duplicated region for block: B:119:0x04d2  */
    /* JADX WARN: Removed duplicated region for block: B:11:0x04c9  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x04f3  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x04aa  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x04af  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x046d  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x049c A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:229:0x0496  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x049c A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:236:0x043a A[Catch: all -> 0x0476, TRY_ENTER, TryCatch #54 {all -> 0x0476, blocks: (B:213:0x0466, B:236:0x043a, B:238:0x0440, B:239:0x0443, B:227:0x0487, B:357:0x0371, B:361:0x037b, B:362:0x038c), top: B:212:0x0466 }] */
    /* JADX WARN: Removed duplicated region for block: B:241:0x0452  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x049c A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0595  */
    /* JADX WARN: Removed duplicated region for block: B:291:0x02d5 A[Catch: all -> 0x01fd, SQLiteException -> 0x02af, SQLiteDatabaseLockedException -> 0x02b4, SQLiteFullException -> 0x02b8, TryCatch #62 {all -> 0x01fd, blocks: (B:184:0x01d8, B:187:0x01ec, B:189:0x01f1, B:195:0x0215, B:196:0x0218, B:199:0x0211, B:246:0x021e, B:249:0x0232, B:251:0x024a, B:254:0x0253, B:255:0x0256, B:257:0x0244, B:260:0x025a, B:263:0x026e, B:265:0x0286, B:268:0x0290, B:269:0x0293, B:271:0x0280, B:281:0x0297, B:289:0x02ab, B:291:0x02d5, B:301:0x02df, B:302:0x02e2, B:307:0x02cf, B:276:0x02f1, B:278:0x02fc, B:354:0x035c), top: B:183:0x01d8 }] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x064b  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0653  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0674  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void O(yg3 yg3Var, i1 i1Var, cs3 cs3Var) {
        ArrayList arrayList;
        pj3 pj3Var;
        Context context;
        vh3 vh3Var;
        int i;
        SQLiteDatabase sQLiteDatabase;
        int i2;
        String str;
        String str2;
        String str3;
        int i3;
        Cursor cursor;
        Cursor cursor2;
        Cursor cursor3;
        long j;
        String str4;
        String[] strArr;
        int i4;
        Cursor cursor4;
        tg3 tg3Var;
        long j2;
        String str5;
        Parcel obtain;
        jd3 jd3Var;
        int i5;
        yb3 yb3Var;
        tq3 tq3Var;
        int i6;
        int size;
        int i7;
        int i8;
        int i9;
        pj3 pj3Var2;
        Context context2;
        vh3 vh3Var2;
        boolean z;
        String str6;
        long j3;
        long j4;
        t13 t13Var;
        long currentTimeMillis;
        v();
        x();
        I();
        pj3 pj3Var3 = (pj3) this.m;
        pj3Var3.getClass();
        Context context3 = pj3Var3.m;
        vh3 vh3Var3 = pj3Var3.r;
        qb2 qb2Var = pj3Var3.w;
        ec3 ec3Var = pj3Var3.p;
        cs3 cs3Var2 = cs3Var;
        int i10 = 100;
        int i11 = 0;
        for (int i12 = 100; i11 < 1001 && i10 == i12; i12 = 100) {
            ArrayList arrayList2 = new ArrayList();
            lh3 o = pj3Var3.o();
            String str7 = "entry";
            int i13 = i12;
            String str8 = "type";
            String str9 = "rowid";
            qb2 qb2Var2 = qb2Var;
            pj3 pj3Var4 = (pj3) o.m;
            o.v();
            int i14 = i11;
            if (o.p) {
                pj3Var = pj3Var3;
                context = context3;
                vh3Var = vh3Var3;
            } else {
                arrayList = new ArrayList();
                pj3Var = pj3Var3;
                if (((pj3) o.m).m.getDatabasePath("google_app_measurement_local.db").exists()) {
                    int i15 = 5;
                    context = context3;
                    vh3Var = vh3Var3;
                    int i16 = 0;
                    int i17 = 5;
                    while (i16 < i15) {
                        try {
                            SQLiteDatabase C = o.C();
                            if (C == null) {
                                try {
                                    try {
                                        o.p = true;
                                    } catch (Throwable th) {
                                        th = th;
                                        sQLiteDatabase = C;
                                        cursor = null;
                                        if (cursor != null) {
                                        }
                                        if (sQLiteDatabase != null) {
                                        }
                                        throw th;
                                    }
                                } catch (SQLiteDatabaseLockedException unused) {
                                    i2 = i16;
                                    str = str9;
                                    str3 = str7;
                                    sQLiteDatabase = C;
                                    i3 = 5;
                                    str2 = str8;
                                    cursor2 = null;
                                    try {
                                        SystemClock.sleep(i17);
                                        i17 += 20;
                                        if (cursor2 != null) {
                                        }
                                        if (sQLiteDatabase == null) {
                                        }
                                        sQLiteDatabase.close();
                                        i16 = i2 + 1;
                                        i15 = i3;
                                        str8 = str2;
                                        str7 = str3;
                                        str9 = str;
                                    } catch (Throwable th2) {
                                        th = th2;
                                        cursor = cursor2;
                                        if (cursor != null) {
                                            cursor.close();
                                        }
                                        if (sQLiteDatabase != null) {
                                            sQLiteDatabase.close();
                                        }
                                        throw th;
                                    }
                                } catch (SQLiteFullException e) {
                                    e = e;
                                    i2 = i16;
                                    str = str9;
                                    str3 = str7;
                                    sQLiteDatabase = C;
                                    i3 = 5;
                                    str2 = str8;
                                    cursor2 = null;
                                    vh3 vh3Var4 = pj3Var4.r;
                                    pj3.m(vh3Var4);
                                    vh3Var4.r.c(e, "Error reading entries from local database");
                                    o.p = true;
                                    if (cursor2 != null) {
                                    }
                                    if (sQLiteDatabase == null) {
                                    }
                                    sQLiteDatabase.close();
                                    i16 = i2 + 1;
                                    i15 = i3;
                                    str8 = str2;
                                    str7 = str3;
                                    str9 = str;
                                } catch (SQLiteException e2) {
                                    e = e2;
                                    i2 = i16;
                                    str = str9;
                                    str3 = str7;
                                    sQLiteDatabase = C;
                                    i3 = 5;
                                    str2 = str8;
                                    cursor2 = null;
                                    if (sQLiteDatabase != null) {
                                    }
                                    vh3 vh3Var5 = pj3Var4.r;
                                    pj3.m(vh3Var5);
                                    vh3Var5.r.c(e, "Error reading entries from local database");
                                    o.p = true;
                                    if (cursor2 != null) {
                                    }
                                    if (sQLiteDatabase == null) {
                                    }
                                    sQLiteDatabase.close();
                                    i16 = i2 + 1;
                                    i15 = i3;
                                    str8 = str2;
                                    str7 = str3;
                                    str9 = str;
                                }
                            } else {
                                C.beginTransaction();
                                try {
                                    cursor3 = C.query("messages", new String[]{str9}, "type=?", new String[]{"3"}, null, null, "rowid desc", AppEventsConstants.EVENT_PARAM_VALUE_YES);
                                    try {
                                        long j5 = -1;
                                        if (cursor3.moveToFirst()) {
                                            i2 = i16;
                                            try {
                                                j = cursor3.getLong(0);
                                                try {
                                                    cursor3.close();
                                                } catch (SQLiteDatabaseLockedException unused2) {
                                                    str = str9;
                                                    str3 = str7;
                                                    sQLiteDatabase = C;
                                                    i3 = 5;
                                                    str2 = str8;
                                                    cursor2 = null;
                                                    SystemClock.sleep(i17);
                                                    i17 += 20;
                                                    if (cursor2 != null) {
                                                    }
                                                    if (sQLiteDatabase == null) {
                                                    }
                                                    sQLiteDatabase.close();
                                                    i16 = i2 + 1;
                                                    i15 = i3;
                                                    str8 = str2;
                                                    str7 = str3;
                                                    str9 = str;
                                                } catch (SQLiteFullException e3) {
                                                    e = e3;
                                                    str = str9;
                                                    str3 = str7;
                                                    sQLiteDatabase = C;
                                                    i3 = 5;
                                                    str2 = str8;
                                                    cursor2 = null;
                                                    vh3 vh3Var42 = pj3Var4.r;
                                                    pj3.m(vh3Var42);
                                                    vh3Var42.r.c(e, "Error reading entries from local database");
                                                    o.p = true;
                                                    if (cursor2 != null) {
                                                        cursor2.close();
                                                    }
                                                    if (sQLiteDatabase == null) {
                                                        i16 = i2 + 1;
                                                        i15 = i3;
                                                        str8 = str2;
                                                        str7 = str3;
                                                        str9 = str;
                                                    }
                                                    sQLiteDatabase.close();
                                                    i16 = i2 + 1;
                                                    i15 = i3;
                                                    str8 = str2;
                                                    str7 = str3;
                                                    str9 = str;
                                                } catch (SQLiteException e4) {
                                                    e = e4;
                                                    str = str9;
                                                    str3 = str7;
                                                    sQLiteDatabase = C;
                                                    i3 = 5;
                                                    str2 = str8;
                                                    cursor2 = null;
                                                    if (sQLiteDatabase != null && sQLiteDatabase.inTransaction()) {
                                                        sQLiteDatabase.endTransaction();
                                                    }
                                                    vh3 vh3Var52 = pj3Var4.r;
                                                    pj3.m(vh3Var52);
                                                    vh3Var52.r.c(e, "Error reading entries from local database");
                                                    o.p = true;
                                                    if (cursor2 != null) {
                                                        cursor2.close();
                                                    }
                                                    if (sQLiteDatabase == null) {
                                                        i16 = i2 + 1;
                                                        i15 = i3;
                                                        str8 = str2;
                                                        str7 = str3;
                                                        str9 = str;
                                                    }
                                                    sQLiteDatabase.close();
                                                    i16 = i2 + 1;
                                                    i15 = i3;
                                                    str8 = str2;
                                                    str7 = str3;
                                                    str9 = str;
                                                }
                                            } catch (Throwable th3) {
                                                th = th3;
                                                str = str9;
                                                str3 = str7;
                                                sQLiteDatabase = C;
                                                i3 = 5;
                                                str2 = str8;
                                                if (cursor3 != null) {
                                                    try {
                                                        cursor3.close();
                                                    } catch (SQLiteDatabaseLockedException unused3) {
                                                        cursor2 = null;
                                                        SystemClock.sleep(i17);
                                                        i17 += 20;
                                                        if (cursor2 != null) {
                                                        }
                                                        if (sQLiteDatabase == null) {
                                                        }
                                                        sQLiteDatabase.close();
                                                        i16 = i2 + 1;
                                                        i15 = i3;
                                                        str8 = str2;
                                                        str7 = str3;
                                                        str9 = str;
                                                    } catch (SQLiteFullException e5) {
                                                        e = e5;
                                                        cursor2 = null;
                                                        vh3 vh3Var422 = pj3Var4.r;
                                                        pj3.m(vh3Var422);
                                                        vh3Var422.r.c(e, "Error reading entries from local database");
                                                        o.p = true;
                                                        if (cursor2 != null) {
                                                        }
                                                        if (sQLiteDatabase == null) {
                                                        }
                                                        sQLiteDatabase.close();
                                                        i16 = i2 + 1;
                                                        i15 = i3;
                                                        str8 = str2;
                                                        str7 = str3;
                                                        str9 = str;
                                                    } catch (SQLiteException e6) {
                                                        e = e6;
                                                        cursor2 = null;
                                                        if (sQLiteDatabase != null) {
                                                        }
                                                        vh3 vh3Var522 = pj3Var4.r;
                                                        pj3.m(vh3Var522);
                                                        vh3Var522.r.c(e, "Error reading entries from local database");
                                                        o.p = true;
                                                        if (cursor2 != null) {
                                                        }
                                                        if (sQLiteDatabase == null) {
                                                        }
                                                        sQLiteDatabase.close();
                                                        i16 = i2 + 1;
                                                        i15 = i3;
                                                        str8 = str2;
                                                        str7 = str3;
                                                        str9 = str;
                                                    } catch (Throwable th4) {
                                                        th = th4;
                                                        cursor = null;
                                                        if (cursor != null) {
                                                        }
                                                        if (sQLiteDatabase != null) {
                                                        }
                                                        throw th;
                                                    }
                                                }
                                                throw th;
                                            }
                                        } else {
                                            i2 = i16;
                                            cursor3.close();
                                            j = -1;
                                        }
                                        if (j != -1) {
                                            str4 = "rowid<?";
                                            strArr = new String[]{String.valueOf(j)};
                                        } else {
                                            str4 = null;
                                            strArr = null;
                                        }
                                        try {
                                            String[] strArr2 = {str9, str8, str7};
                                            ec3 ec3Var2 = pj3Var4.p;
                                            tg3 tg3Var2 = ug3.b1;
                                            str = str9;
                                            try {
                                                try {
                                                    int i18 = 4;
                                                    int i19 = 3;
                                                    if (ec3Var2.G(null, tg3Var2)) {
                                                        i4 = 5;
                                                        try {
                                                            strArr2 = new String[]{str, str8, str7, "app_version", "app_version_int"};
                                                        } catch (SQLiteDatabaseLockedException unused4) {
                                                            i3 = 5;
                                                            str3 = str7;
                                                            sQLiteDatabase = C;
                                                            str2 = str8;
                                                            cursor2 = null;
                                                            SystemClock.sleep(i17);
                                                            i17 += 20;
                                                            if (cursor2 != null) {
                                                            }
                                                            if (sQLiteDatabase == null) {
                                                            }
                                                            sQLiteDatabase.close();
                                                            i16 = i2 + 1;
                                                            i15 = i3;
                                                            str8 = str2;
                                                            str7 = str3;
                                                            str9 = str;
                                                        } catch (SQLiteFullException e7) {
                                                            e = e7;
                                                            i3 = 5;
                                                            str3 = str7;
                                                            sQLiteDatabase = C;
                                                            str2 = str8;
                                                            cursor2 = null;
                                                            vh3 vh3Var4222 = pj3Var4.r;
                                                            pj3.m(vh3Var4222);
                                                            vh3Var4222.r.c(e, "Error reading entries from local database");
                                                            o.p = true;
                                                            if (cursor2 != null) {
                                                            }
                                                            if (sQLiteDatabase == null) {
                                                            }
                                                            sQLiteDatabase.close();
                                                            i16 = i2 + 1;
                                                            i15 = i3;
                                                            str8 = str2;
                                                            str7 = str3;
                                                            str9 = str;
                                                        } catch (SQLiteException e8) {
                                                            e = e8;
                                                            i3 = 5;
                                                            str3 = str7;
                                                            sQLiteDatabase = C;
                                                            str2 = str8;
                                                            cursor2 = null;
                                                            if (sQLiteDatabase != null) {
                                                            }
                                                            vh3 vh3Var5222 = pj3Var4.r;
                                                            pj3.m(vh3Var5222);
                                                            vh3Var5222.r.c(e, "Error reading entries from local database");
                                                            o.p = true;
                                                            if (cursor2 != null) {
                                                            }
                                                            if (sQLiteDatabase == null) {
                                                            }
                                                            sQLiteDatabase.close();
                                                            i16 = i2 + 1;
                                                            i15 = i3;
                                                            str8 = str2;
                                                            str7 = str3;
                                                            str9 = str;
                                                        }
                                                    } else {
                                                        i4 = 5;
                                                    }
                                                    try {
                                                        Cursor query = C.query("messages", strArr2, str4, strArr, null, null, "rowid asc", Integer.toString(i13));
                                                        while (query.moveToNext()) {
                                                            try {
                                                                try {
                                                                    try {
                                                                        j5 = query.getLong(0);
                                                                        try {
                                                                            int i20 = query.getInt(1);
                                                                            str2 = str8;
                                                                            try {
                                                                                byte[] blob = query.getBlob(2);
                                                                                str3 = str7;
                                                                                try {
                                                                                    if (pj3Var4.p.G(null, tg3Var2)) {
                                                                                        try {
                                                                                            str5 = query.getString(i19);
                                                                                            cursor4 = query;
                                                                                            tg3Var = tg3Var2;
                                                                                            j2 = query.getLong(i18);
                                                                                        } catch (SQLiteDatabaseLockedException unused5) {
                                                                                            cursor2 = query;
                                                                                            sQLiteDatabase = C;
                                                                                            i3 = 5;
                                                                                            SystemClock.sleep(i17);
                                                                                            i17 += 20;
                                                                                            if (cursor2 != null) {
                                                                                            }
                                                                                            if (sQLiteDatabase == null) {
                                                                                            }
                                                                                            sQLiteDatabase.close();
                                                                                            i16 = i2 + 1;
                                                                                            i15 = i3;
                                                                                            str8 = str2;
                                                                                            str7 = str3;
                                                                                            str9 = str;
                                                                                        } catch (SQLiteFullException e9) {
                                                                                            e = e9;
                                                                                            cursor2 = query;
                                                                                            sQLiteDatabase = C;
                                                                                            i3 = 5;
                                                                                            vh3 vh3Var42222 = pj3Var4.r;
                                                                                            pj3.m(vh3Var42222);
                                                                                            vh3Var42222.r.c(e, "Error reading entries from local database");
                                                                                            o.p = true;
                                                                                            if (cursor2 != null) {
                                                                                            }
                                                                                            if (sQLiteDatabase == null) {
                                                                                            }
                                                                                            sQLiteDatabase.close();
                                                                                            i16 = i2 + 1;
                                                                                            i15 = i3;
                                                                                            str8 = str2;
                                                                                            str7 = str3;
                                                                                            str9 = str;
                                                                                        } catch (SQLiteException e10) {
                                                                                            e = e10;
                                                                                            cursor2 = query;
                                                                                            sQLiteDatabase = C;
                                                                                            i3 = 5;
                                                                                            if (sQLiteDatabase != null) {
                                                                                            }
                                                                                            vh3 vh3Var52222 = pj3Var4.r;
                                                                                            pj3.m(vh3Var52222);
                                                                                            vh3Var52222.r.c(e, "Error reading entries from local database");
                                                                                            o.p = true;
                                                                                            if (cursor2 != null) {
                                                                                            }
                                                                                            if (sQLiteDatabase == null) {
                                                                                            }
                                                                                            sQLiteDatabase.close();
                                                                                            i16 = i2 + 1;
                                                                                            i15 = i3;
                                                                                            str8 = str2;
                                                                                            str7 = str3;
                                                                                            str9 = str;
                                                                                        }
                                                                                    } else {
                                                                                        cursor4 = query;
                                                                                        tg3Var = tg3Var2;
                                                                                        j2 = 0;
                                                                                        str5 = null;
                                                                                    }
                                                                                    if (i20 == 0) {
                                                                                        cursor2 = cursor4;
                                                                                        try {
                                                                                            try {
                                                                                                obtain = Parcel.obtain();
                                                                                                try {
                                                                                                    try {
                                                                                                        obtain.unmarshall(blob, 0, blob.length);
                                                                                                        obtain.setDataPosition(0);
                                                                                                        kd3 createFromParcel = kd3.CREATOR.createFromParcel(obtain);
                                                                                                        if (createFromParcel != null) {
                                                                                                            arrayList.add(new jh3(createFromParcel, str5, j2));
                                                                                                        }
                                                                                                    } finally {
                                                                                                    }
                                                                                                } catch (fd2 unused6) {
                                                                                                    vh3 vh3Var6 = pj3Var4.r;
                                                                                                    pj3.m(vh3Var6);
                                                                                                    vh3Var6.r.b("Failed to load event from local database");
                                                                                                    obtain.recycle();
                                                                                                }
                                                                                            } catch (Throwable th5) {
                                                                                                th = th5;
                                                                                                sQLiteDatabase = C;
                                                                                                cursor = cursor2;
                                                                                                if (cursor != null) {
                                                                                                }
                                                                                                if (sQLiteDatabase != null) {
                                                                                                }
                                                                                                throw th;
                                                                                            }
                                                                                        } catch (SQLiteDatabaseLockedException unused7) {
                                                                                            sQLiteDatabase = C;
                                                                                            i3 = 5;
                                                                                            SystemClock.sleep(i17);
                                                                                            i17 += 20;
                                                                                            if (cursor2 != null) {
                                                                                            }
                                                                                            if (sQLiteDatabase == null) {
                                                                                            }
                                                                                            sQLiteDatabase.close();
                                                                                            i16 = i2 + 1;
                                                                                            i15 = i3;
                                                                                            str8 = str2;
                                                                                            str7 = str3;
                                                                                            str9 = str;
                                                                                        } catch (SQLiteFullException e11) {
                                                                                            e = e11;
                                                                                            sQLiteDatabase = C;
                                                                                            i3 = 5;
                                                                                            vh3 vh3Var422222 = pj3Var4.r;
                                                                                            pj3.m(vh3Var422222);
                                                                                            vh3Var422222.r.c(e, "Error reading entries from local database");
                                                                                            o.p = true;
                                                                                            if (cursor2 != null) {
                                                                                            }
                                                                                            if (sQLiteDatabase == null) {
                                                                                            }
                                                                                            sQLiteDatabase.close();
                                                                                            i16 = i2 + 1;
                                                                                            i15 = i3;
                                                                                            str8 = str2;
                                                                                            str7 = str3;
                                                                                            str9 = str;
                                                                                        } catch (SQLiteException e12) {
                                                                                            e = e12;
                                                                                            sQLiteDatabase = C;
                                                                                            i3 = 5;
                                                                                            if (sQLiteDatabase != null) {
                                                                                                sQLiteDatabase.endTransaction();
                                                                                            }
                                                                                            vh3 vh3Var522222 = pj3Var4.r;
                                                                                            pj3.m(vh3Var522222);
                                                                                            vh3Var522222.r.c(e, "Error reading entries from local database");
                                                                                            o.p = true;
                                                                                            if (cursor2 != null) {
                                                                                            }
                                                                                            if (sQLiteDatabase == null) {
                                                                                            }
                                                                                            sQLiteDatabase.close();
                                                                                            i16 = i2 + 1;
                                                                                            i15 = i3;
                                                                                            str8 = str2;
                                                                                            str7 = str3;
                                                                                            str9 = str;
                                                                                        }
                                                                                    } else {
                                                                                        cursor2 = cursor4;
                                                                                        if (i20 == 1) {
                                                                                            obtain = Parcel.obtain();
                                                                                            try {
                                                                                                try {
                                                                                                    obtain.unmarshall(blob, 0, blob.length);
                                                                                                    obtain.setDataPosition(0);
                                                                                                    tq3Var = tq3.CREATOR.createFromParcel(obtain);
                                                                                                } finally {
                                                                                                }
                                                                                            } catch (fd2 unused8) {
                                                                                                vh3 vh3Var7 = pj3Var4.r;
                                                                                                pj3.m(vh3Var7);
                                                                                                vh3Var7.r.b("Failed to load user property from local database");
                                                                                                obtain.recycle();
                                                                                                tq3Var = null;
                                                                                            }
                                                                                            if (tq3Var != null) {
                                                                                                arrayList.add(new jh3(tq3Var, str5, j2));
                                                                                            }
                                                                                        } else if (i20 == 2) {
                                                                                            obtain = Parcel.obtain();
                                                                                            try {
                                                                                                try {
                                                                                                    obtain.unmarshall(blob, 0, blob.length);
                                                                                                    obtain.setDataPosition(0);
                                                                                                    yb3Var = yb3.CREATOR.createFromParcel(obtain);
                                                                                                } finally {
                                                                                                }
                                                                                            } catch (fd2 unused9) {
                                                                                                vh3 vh3Var8 = pj3Var4.r;
                                                                                                pj3.m(vh3Var8);
                                                                                                vh3Var8.r.b("Failed to load conditional user property from local database");
                                                                                                obtain.recycle();
                                                                                                yb3Var = null;
                                                                                            }
                                                                                            if (yb3Var != null) {
                                                                                                arrayList.add(new jh3(yb3Var, str5, j2));
                                                                                            }
                                                                                        } else {
                                                                                            if (i20 == 4) {
                                                                                                try {
                                                                                                    obtain = Parcel.obtain();
                                                                                                    try {
                                                                                                        try {
                                                                                                            try {
                                                                                                                obtain.unmarshall(blob, 0, blob.length);
                                                                                                                obtain.setDataPosition(0);
                                                                                                                jd3Var = jd3.CREATOR.createFromParcel(obtain);
                                                                                                            } catch (Throwable th6) {
                                                                                                                th = th6;
                                                                                                                throw th;
                                                                                                            }
                                                                                                        } catch (fd2 unused10) {
                                                                                                            vh3 vh3Var9 = pj3Var4.r;
                                                                                                            pj3.m(vh3Var9);
                                                                                                            vh3Var9.r.b("Failed to load default event parameters from local database");
                                                                                                            obtain.recycle();
                                                                                                            jd3Var = null;
                                                                                                            if (jd3Var != null) {
                                                                                                            }
                                                                                                            i5 = 3;
                                                                                                            i19 = i5;
                                                                                                            str8 = str2;
                                                                                                            str7 = str3;
                                                                                                            tg3Var2 = tg3Var;
                                                                                                            query = cursor2;
                                                                                                            i18 = 4;
                                                                                                        }
                                                                                                    } catch (fd2 unused11) {
                                                                                                    } catch (Throwable th7) {
                                                                                                        th = th7;
                                                                                                    }
                                                                                                } catch (SQLiteDatabaseLockedException unused12) {
                                                                                                    sQLiteDatabase = C;
                                                                                                    i3 = 5;
                                                                                                    SystemClock.sleep(i17);
                                                                                                    i17 += 20;
                                                                                                    if (cursor2 != null) {
                                                                                                    }
                                                                                                    if (sQLiteDatabase == null) {
                                                                                                    }
                                                                                                    sQLiteDatabase.close();
                                                                                                    i16 = i2 + 1;
                                                                                                    i15 = i3;
                                                                                                    str8 = str2;
                                                                                                    str7 = str3;
                                                                                                    str9 = str;
                                                                                                } catch (SQLiteFullException e13) {
                                                                                                    e = e13;
                                                                                                    sQLiteDatabase = C;
                                                                                                    i3 = 5;
                                                                                                    vh3 vh3Var4222222 = pj3Var4.r;
                                                                                                    pj3.m(vh3Var4222222);
                                                                                                    vh3Var4222222.r.c(e, "Error reading entries from local database");
                                                                                                    o.p = true;
                                                                                                    if (cursor2 != null) {
                                                                                                    }
                                                                                                    if (sQLiteDatabase == null) {
                                                                                                    }
                                                                                                    sQLiteDatabase.close();
                                                                                                    i16 = i2 + 1;
                                                                                                    i15 = i3;
                                                                                                    str8 = str2;
                                                                                                    str7 = str3;
                                                                                                    str9 = str;
                                                                                                } catch (SQLiteException e14) {
                                                                                                    e = e14;
                                                                                                    sQLiteDatabase = C;
                                                                                                    i3 = 5;
                                                                                                    if (sQLiteDatabase != null) {
                                                                                                    }
                                                                                                    vh3 vh3Var5222222 = pj3Var4.r;
                                                                                                    pj3.m(vh3Var5222222);
                                                                                                    vh3Var5222222.r.c(e, "Error reading entries from local database");
                                                                                                    o.p = true;
                                                                                                    if (cursor2 != null) {
                                                                                                    }
                                                                                                    if (sQLiteDatabase == null) {
                                                                                                    }
                                                                                                    sQLiteDatabase.close();
                                                                                                    i16 = i2 + 1;
                                                                                                    i15 = i3;
                                                                                                    str8 = str2;
                                                                                                    str7 = str3;
                                                                                                    str9 = str;
                                                                                                }
                                                                                                try {
                                                                                                    if (jd3Var != null) {
                                                                                                        arrayList.add(new jh3(jd3Var, str5, j2));
                                                                                                    }
                                                                                                    i5 = 3;
                                                                                                } catch (SQLiteDatabaseLockedException unused13) {
                                                                                                    sQLiteDatabase = C;
                                                                                                    i3 = 5;
                                                                                                    SystemClock.sleep(i17);
                                                                                                    i17 += 20;
                                                                                                    if (cursor2 != null) {
                                                                                                    }
                                                                                                    if (sQLiteDatabase == null) {
                                                                                                    }
                                                                                                    sQLiteDatabase.close();
                                                                                                    i16 = i2 + 1;
                                                                                                    i15 = i3;
                                                                                                    str8 = str2;
                                                                                                    str7 = str3;
                                                                                                    str9 = str;
                                                                                                } catch (SQLiteFullException e15) {
                                                                                                    e = e15;
                                                                                                    sQLiteDatabase = C;
                                                                                                    i3 = 5;
                                                                                                    vh3 vh3Var42222222 = pj3Var4.r;
                                                                                                    pj3.m(vh3Var42222222);
                                                                                                    vh3Var42222222.r.c(e, "Error reading entries from local database");
                                                                                                    o.p = true;
                                                                                                    if (cursor2 != null) {
                                                                                                    }
                                                                                                    if (sQLiteDatabase == null) {
                                                                                                    }
                                                                                                    sQLiteDatabase.close();
                                                                                                    i16 = i2 + 1;
                                                                                                    i15 = i3;
                                                                                                    str8 = str2;
                                                                                                    str7 = str3;
                                                                                                    str9 = str;
                                                                                                } catch (SQLiteException e16) {
                                                                                                    e = e16;
                                                                                                    sQLiteDatabase = C;
                                                                                                    i3 = 5;
                                                                                                    if (sQLiteDatabase != null) {
                                                                                                    }
                                                                                                    vh3 vh3Var52222222 = pj3Var4.r;
                                                                                                    pj3.m(vh3Var52222222);
                                                                                                    vh3Var52222222.r.c(e, "Error reading entries from local database");
                                                                                                    o.p = true;
                                                                                                    if (cursor2 != null) {
                                                                                                    }
                                                                                                    if (sQLiteDatabase == null) {
                                                                                                    }
                                                                                                    sQLiteDatabase.close();
                                                                                                    i16 = i2 + 1;
                                                                                                    i15 = i3;
                                                                                                    str8 = str2;
                                                                                                    str7 = str3;
                                                                                                    str9 = str;
                                                                                                }
                                                                                            } else {
                                                                                                vh3 vh3Var10 = pj3Var4.r;
                                                                                                i5 = 3;
                                                                                                if (i20 == 3) {
                                                                                                    pj3.m(vh3Var10);
                                                                                                    vh3Var10.z.b("Skipping app launch break");
                                                                                                } else {
                                                                                                    pj3.m(vh3Var10);
                                                                                                    vh3Var10.r.b("Unknown record type in local database");
                                                                                                }
                                                                                            }
                                                                                            i19 = i5;
                                                                                            str8 = str2;
                                                                                            str7 = str3;
                                                                                            tg3Var2 = tg3Var;
                                                                                            query = cursor2;
                                                                                            i18 = 4;
                                                                                        }
                                                                                    }
                                                                                    i5 = 3;
                                                                                    i19 = i5;
                                                                                    str8 = str2;
                                                                                    str7 = str3;
                                                                                    tg3Var2 = tg3Var;
                                                                                    query = cursor2;
                                                                                    i18 = 4;
                                                                                } catch (SQLiteDatabaseLockedException unused14) {
                                                                                    cursor2 = query;
                                                                                } catch (SQLiteFullException e17) {
                                                                                    e = e17;
                                                                                    cursor2 = query;
                                                                                } catch (SQLiteException e18) {
                                                                                    e = e18;
                                                                                    cursor2 = query;
                                                                                }
                                                                            } catch (SQLiteDatabaseLockedException unused15) {
                                                                                cursor2 = query;
                                                                                str3 = str7;
                                                                                sQLiteDatabase = C;
                                                                                i3 = 5;
                                                                                SystemClock.sleep(i17);
                                                                                i17 += 20;
                                                                                if (cursor2 != null) {
                                                                                }
                                                                                if (sQLiteDatabase == null) {
                                                                                }
                                                                                sQLiteDatabase.close();
                                                                                i16 = i2 + 1;
                                                                                i15 = i3;
                                                                                str8 = str2;
                                                                                str7 = str3;
                                                                                str9 = str;
                                                                            } catch (SQLiteFullException e19) {
                                                                                e = e19;
                                                                                cursor2 = query;
                                                                                str3 = str7;
                                                                                sQLiteDatabase = C;
                                                                                i3 = 5;
                                                                                vh3 vh3Var422222222 = pj3Var4.r;
                                                                                pj3.m(vh3Var422222222);
                                                                                vh3Var422222222.r.c(e, "Error reading entries from local database");
                                                                                o.p = true;
                                                                                if (cursor2 != null) {
                                                                                }
                                                                                if (sQLiteDatabase == null) {
                                                                                }
                                                                                sQLiteDatabase.close();
                                                                                i16 = i2 + 1;
                                                                                i15 = i3;
                                                                                str8 = str2;
                                                                                str7 = str3;
                                                                                str9 = str;
                                                                            } catch (SQLiteException e20) {
                                                                                e = e20;
                                                                                cursor2 = query;
                                                                                str3 = str7;
                                                                                sQLiteDatabase = C;
                                                                                i3 = 5;
                                                                                if (sQLiteDatabase != null) {
                                                                                }
                                                                                vh3 vh3Var522222222 = pj3Var4.r;
                                                                                pj3.m(vh3Var522222222);
                                                                                vh3Var522222222.r.c(e, "Error reading entries from local database");
                                                                                o.p = true;
                                                                                if (cursor2 != null) {
                                                                                }
                                                                                if (sQLiteDatabase == null) {
                                                                                }
                                                                                sQLiteDatabase.close();
                                                                                i16 = i2 + 1;
                                                                                i15 = i3;
                                                                                str8 = str2;
                                                                                str7 = str3;
                                                                                str9 = str;
                                                                            }
                                                                        } catch (SQLiteDatabaseLockedException unused16) {
                                                                            cursor2 = query;
                                                                            str2 = str8;
                                                                        } catch (SQLiteFullException e21) {
                                                                            e = e21;
                                                                            cursor2 = query;
                                                                            str2 = str8;
                                                                        } catch (SQLiteException e22) {
                                                                            e = e22;
                                                                            cursor2 = query;
                                                                            str2 = str8;
                                                                        }
                                                                    } catch (SQLiteDatabaseLockedException unused17) {
                                                                        cursor2 = query;
                                                                        str2 = str8;
                                                                        str3 = str7;
                                                                    } catch (SQLiteFullException e23) {
                                                                        e = e23;
                                                                        cursor2 = query;
                                                                        str2 = str8;
                                                                        str3 = str7;
                                                                    } catch (SQLiteException e24) {
                                                                        e = e24;
                                                                        cursor2 = query;
                                                                        str2 = str8;
                                                                        str3 = str7;
                                                                    }
                                                                } catch (Throwable th8) {
                                                                    th = th8;
                                                                    cursor2 = query;
                                                                }
                                                            } catch (SQLiteDatabaseLockedException unused18) {
                                                                cursor2 = query;
                                                                str2 = str8;
                                                                str3 = str7;
                                                            } catch (SQLiteFullException e25) {
                                                                e = e25;
                                                                cursor2 = query;
                                                                str2 = str8;
                                                                str3 = str7;
                                                            } catch (SQLiteException e26) {
                                                                e = e26;
                                                                cursor2 = query;
                                                                str2 = str8;
                                                                str3 = str7;
                                                            }
                                                        }
                                                        cursor2 = query;
                                                        str2 = str8;
                                                        str3 = str7;
                                                        i = 0;
                                                        sQLiteDatabase = C;
                                                    } catch (SQLiteDatabaseLockedException unused19) {
                                                        str3 = str7;
                                                        sQLiteDatabase = C;
                                                        str2 = str8;
                                                        i3 = i4;
                                                        cursor2 = null;
                                                        SystemClock.sleep(i17);
                                                        i17 += 20;
                                                        if (cursor2 != null) {
                                                            cursor2.close();
                                                        }
                                                        if (sQLiteDatabase == null) {
                                                            i16 = i2 + 1;
                                                            i15 = i3;
                                                            str8 = str2;
                                                            str7 = str3;
                                                            str9 = str;
                                                        }
                                                        sQLiteDatabase.close();
                                                        i16 = i2 + 1;
                                                        i15 = i3;
                                                        str8 = str2;
                                                        str7 = str3;
                                                        str9 = str;
                                                    }
                                                } catch (SQLiteDatabaseLockedException unused20) {
                                                    str3 = str7;
                                                    sQLiteDatabase = C;
                                                    str2 = str8;
                                                    i3 = 5;
                                                    cursor2 = null;
                                                    SystemClock.sleep(i17);
                                                    i17 += 20;
                                                    if (cursor2 != null) {
                                                    }
                                                    if (sQLiteDatabase == null) {
                                                    }
                                                    sQLiteDatabase.close();
                                                    i16 = i2 + 1;
                                                    i15 = i3;
                                                    str8 = str2;
                                                    str7 = str3;
                                                    str9 = str;
                                                }
                                                try {
                                                    if (sQLiteDatabase.delete("messages", "rowid <= ?", new String[]{Long.toString(j5)}) < arrayList.size()) {
                                                        vh3 vh3Var11 = pj3Var4.r;
                                                        pj3.m(vh3Var11);
                                                        vh3Var11.r.b("Fewer entries removed from local database than expected");
                                                    }
                                                    sQLiteDatabase.setTransactionSuccessful();
                                                    sQLiteDatabase.endTransaction();
                                                    cursor2.close();
                                                    sQLiteDatabase.close();
                                                } catch (SQLiteDatabaseLockedException unused21) {
                                                    i3 = 5;
                                                    SystemClock.sleep(i17);
                                                    i17 += 20;
                                                    if (cursor2 != null) {
                                                    }
                                                    if (sQLiteDatabase == null) {
                                                    }
                                                    sQLiteDatabase.close();
                                                    i16 = i2 + 1;
                                                    i15 = i3;
                                                    str8 = str2;
                                                    str7 = str3;
                                                    str9 = str;
                                                } catch (SQLiteFullException e27) {
                                                    e = e27;
                                                    i3 = 5;
                                                    vh3 vh3Var4222222222 = pj3Var4.r;
                                                    pj3.m(vh3Var4222222222);
                                                    vh3Var4222222222.r.c(e, "Error reading entries from local database");
                                                    o.p = true;
                                                    if (cursor2 != null) {
                                                    }
                                                    if (sQLiteDatabase == null) {
                                                    }
                                                    sQLiteDatabase.close();
                                                    i16 = i2 + 1;
                                                    i15 = i3;
                                                    str8 = str2;
                                                    str7 = str3;
                                                    str9 = str;
                                                } catch (SQLiteException e28) {
                                                    e = e28;
                                                    i3 = 5;
                                                    if (sQLiteDatabase != null) {
                                                    }
                                                    vh3 vh3Var5222222222 = pj3Var4.r;
                                                    pj3.m(vh3Var5222222222);
                                                    vh3Var5222222222.r.c(e, "Error reading entries from local database");
                                                    o.p = true;
                                                    if (cursor2 != null) {
                                                    }
                                                    if (sQLiteDatabase == null) {
                                                    }
                                                    sQLiteDatabase.close();
                                                    i16 = i2 + 1;
                                                    i15 = i3;
                                                    str8 = str2;
                                                    str7 = str3;
                                                    str9 = str;
                                                }
                                            } catch (SQLiteFullException e29) {
                                                e = e29;
                                                str3 = str7;
                                                sQLiteDatabase = C;
                                                str2 = str8;
                                                i3 = 5;
                                                cursor2 = null;
                                                vh3 vh3Var42222222222 = pj3Var4.r;
                                                pj3.m(vh3Var42222222222);
                                                vh3Var42222222222.r.c(e, "Error reading entries from local database");
                                                o.p = true;
                                                if (cursor2 != null) {
                                                }
                                                if (sQLiteDatabase == null) {
                                                }
                                                sQLiteDatabase.close();
                                                i16 = i2 + 1;
                                                i15 = i3;
                                                str8 = str2;
                                                str7 = str3;
                                                str9 = str;
                                            } catch (SQLiteException e30) {
                                                e = e30;
                                                str3 = str7;
                                                sQLiteDatabase = C;
                                                str2 = str8;
                                                i3 = 5;
                                                cursor2 = null;
                                                if (sQLiteDatabase != null) {
                                                }
                                                vh3 vh3Var52222222222 = pj3Var4.r;
                                                pj3.m(vh3Var52222222222);
                                                vh3Var52222222222.r.c(e, "Error reading entries from local database");
                                                o.p = true;
                                                if (cursor2 != null) {
                                                }
                                                if (sQLiteDatabase == null) {
                                                }
                                                sQLiteDatabase.close();
                                                i16 = i2 + 1;
                                                i15 = i3;
                                                str8 = str2;
                                                str7 = str3;
                                                str9 = str;
                                            }
                                        } catch (SQLiteDatabaseLockedException unused22) {
                                            str = str9;
                                        } catch (SQLiteFullException e31) {
                                            e = e31;
                                            str = str9;
                                        } catch (SQLiteException e32) {
                                            e = e32;
                                            str = str9;
                                        }
                                    } catch (Throwable th9) {
                                        th = th9;
                                        i2 = i16;
                                    }
                                } catch (Throwable th10) {
                                    th = th10;
                                    i2 = i16;
                                    str = str9;
                                    str3 = str7;
                                    sQLiteDatabase = C;
                                    i3 = 5;
                                    str2 = str8;
                                    cursor3 = null;
                                }
                            }
                        } catch (SQLiteDatabaseLockedException unused23) {
                            i2 = i16;
                            str = str9;
                            str2 = str8;
                            str3 = str7;
                            i3 = 5;
                            sQLiteDatabase = null;
                        } catch (SQLiteFullException e33) {
                            e = e33;
                            i2 = i16;
                            str = str9;
                            str2 = str8;
                            str3 = str7;
                            i3 = 5;
                            sQLiteDatabase = null;
                        } catch (SQLiteException e34) {
                            e = e34;
                            i2 = i16;
                            str = str9;
                            str2 = str8;
                            str3 = str7;
                            i3 = 5;
                            sQLiteDatabase = null;
                        } catch (Throwable th11) {
                            th = th11;
                            sQLiteDatabase = null;
                        }
                    }
                    i = 0;
                    vh3 vh3Var12 = pj3Var4.r;
                    pj3.m(vh3Var12);
                    vh3Var12.u.b("Failed to read events from database in reasonable time");
                    arrayList = null;
                } else {
                    context = context3;
                    vh3Var = vh3Var3;
                    i = 0;
                }
                if (arrayList == null) {
                    arrayList2.addAll(arrayList);
                    i6 = arrayList.size();
                } else {
                    i6 = i;
                }
                if (i1Var != null && i6 < i13) {
                    arrayList2.add(new jh3(i1Var, cs3Var2.o, cs3Var2.v));
                }
                String str10 = null;
                boolean G = ec3Var.G(null, ug3.O0);
                size = arrayList2.size();
                i7 = i;
                while (i7 < size) {
                    jh3 jh3Var = (jh3) arrayList2.get(i7);
                    i1 i1Var2 = jh3Var.a;
                    tg3 tg3Var3 = ug3.b1;
                    if (ec3Var.G(str10, tg3Var3)) {
                        String str11 = jh3Var.b;
                        if (!TextUtils.isEmpty(str11)) {
                            i8 = i6;
                            cs3Var2 = new cs3(cs3Var2.m, cs3Var2.n, str11, jh3Var.c, cs3Var2.p, cs3Var2.q, cs3Var2.r, cs3Var2.s, cs3Var2.t, cs3Var2.u, cs3Var2.w, cs3Var2.x, cs3Var2.y, cs3Var2.z, cs3Var2.A, cs3Var2.B, cs3Var2.C, cs3Var2.D, cs3Var2.E, cs3Var2.F, cs3Var2.G, cs3Var2.H, cs3Var2.I, cs3Var2.J, cs3Var2.K, cs3Var2.L, cs3Var2.M, cs3Var2.N, cs3Var2.O, cs3Var2.P, cs3Var2.Q);
                            if (i1Var2 instanceof kd3) {
                                i9 = size;
                                pj3Var2 = pj3Var;
                                context2 = context;
                                vh3Var2 = vh3Var;
                                z = G;
                                if (i1Var2 instanceof tq3) {
                                    try {
                                        yg3Var.E((tq3) i1Var2, cs3Var2);
                                    } catch (RemoteException e35) {
                                        pj3.m(vh3Var2);
                                        vh3Var2.r.c(e35, "Failed to send user property to the service");
                                    }
                                } else if (i1Var2 instanceof yb3) {
                                    try {
                                        yg3Var.q((yb3) i1Var2, cs3Var2);
                                    } catch (RemoteException e36) {
                                        pj3.m(vh3Var2);
                                        vh3Var2.r.c(e36, "Failed to send conditional user property to the service");
                                    }
                                } else {
                                    str6 = null;
                                    if (ec3Var.G(null, tg3Var3) && (i1Var2 instanceof jd3)) {
                                        try {
                                            yg3Var.g(((jd3) i1Var2).d(), cs3Var2);
                                        } catch (RemoteException e37) {
                                            pj3.m(vh3Var2);
                                            vh3Var2.r.c(e37, "Failed to send default event parameters to the service");
                                        }
                                    } else {
                                        pj3.m(vh3Var2);
                                        vh3Var2.r.b("Discarding data. Unrecognized parcel type.");
                                    }
                                    i7++;
                                    pj3Var = pj3Var2;
                                    context = context2;
                                    size = i9;
                                    i6 = i8;
                                    str10 = str6;
                                    G = z;
                                    vh3Var = vh3Var2;
                                }
                            } else {
                                if (G) {
                                    try {
                                        qb2Var2.getClass();
                                        long currentTimeMillis2 = System.currentTimeMillis();
                                        try {
                                            qb2Var2.getClass();
                                            j4 = currentTimeMillis2;
                                            j3 = SystemClock.elapsedRealtime();
                                        } catch (RemoteException e38) {
                                            e = e38;
                                            i9 = size;
                                            j4 = currentTimeMillis2;
                                            j3 = 0;
                                            pj3Var2 = pj3Var;
                                            context2 = context;
                                            vh3Var2 = vh3Var;
                                            z = G;
                                            pj3.m(vh3Var2);
                                            vh3Var2.r.c(e, "Failed to send event to the service");
                                            if (z) {
                                                if (t13.q == null) {
                                                }
                                                t13 t13Var2 = t13.q;
                                                qb2Var2.getClass();
                                                long currentTimeMillis3 = System.currentTimeMillis();
                                                qb2Var2.getClass();
                                                t13Var2.k(13, (int) (SystemClock.elapsedRealtime() - j3), j4, currentTimeMillis3);
                                            }
                                            str6 = null;
                                            i7++;
                                            pj3Var = pj3Var2;
                                            context = context2;
                                            size = i9;
                                            i6 = i8;
                                            str10 = str6;
                                            G = z;
                                            vh3Var = vh3Var2;
                                        }
                                    } catch (RemoteException e39) {
                                        e = e39;
                                        i9 = size;
                                        j3 = 0;
                                        j4 = 0;
                                    }
                                } else {
                                    j3 = 0;
                                    j4 = 0;
                                }
                                try {
                                    try {
                                        yg3Var.k((kd3) i1Var2, cs3Var2);
                                        if (G) {
                                            pj3.m(vh3Var);
                                            vh3Var2 = vh3Var;
                                            try {
                                                vh3Var2.z.b("Logging telemetry for logEvent from database");
                                                if (t13.q == null) {
                                                    try {
                                                        pj3Var2 = pj3Var;
                                                        context2 = context;
                                                        try {
                                                            t13.q = new t13(context2, pj3Var2);
                                                        } catch (RemoteException e40) {
                                                            e = e40;
                                                            z = G;
                                                            i9 = size;
                                                            pj3.m(vh3Var2);
                                                            vh3Var2.r.c(e, "Failed to send event to the service");
                                                            if (z && j4 != 0) {
                                                                if (t13.q == null) {
                                                                    t13.q = new t13(context2, pj3Var2);
                                                                }
                                                                t13 t13Var22 = t13.q;
                                                                qb2Var2.getClass();
                                                                long currentTimeMillis32 = System.currentTimeMillis();
                                                                qb2Var2.getClass();
                                                                t13Var22.k(13, (int) (SystemClock.elapsedRealtime() - j3), j4, currentTimeMillis32);
                                                            }
                                                            str6 = null;
                                                            i7++;
                                                            pj3Var = pj3Var2;
                                                            context = context2;
                                                            size = i9;
                                                            i6 = i8;
                                                            str10 = str6;
                                                            G = z;
                                                            vh3Var = vh3Var2;
                                                        }
                                                    } catch (RemoteException e41) {
                                                        e = e41;
                                                        pj3Var2 = pj3Var;
                                                        context2 = context;
                                                        z = G;
                                                        i9 = size;
                                                        pj3.m(vh3Var2);
                                                        vh3Var2.r.c(e, "Failed to send event to the service");
                                                        if (z) {
                                                        }
                                                        str6 = null;
                                                        i7++;
                                                        pj3Var = pj3Var2;
                                                        context = context2;
                                                        size = i9;
                                                        i6 = i8;
                                                        str10 = str6;
                                                        G = z;
                                                        vh3Var = vh3Var2;
                                                    }
                                                } else {
                                                    pj3Var2 = pj3Var;
                                                    context2 = context;
                                                }
                                                t13Var = t13.q;
                                                qb2Var2.getClass();
                                                currentTimeMillis = System.currentTimeMillis();
                                                qb2Var2.getClass();
                                                z = G;
                                                i9 = size;
                                            } catch (RemoteException e42) {
                                                e = e42;
                                                z = G;
                                                i9 = size;
                                                pj3Var2 = pj3Var;
                                                context2 = context;
                                            }
                                            try {
                                                t13Var.k(0, (int) (SystemClock.elapsedRealtime() - j3), j4, currentTimeMillis);
                                            } catch (RemoteException e43) {
                                                e = e43;
                                                pj3.m(vh3Var2);
                                                vh3Var2.r.c(e, "Failed to send event to the service");
                                                if (z) {
                                                }
                                                str6 = null;
                                                i7++;
                                                pj3Var = pj3Var2;
                                                context = context2;
                                                size = i9;
                                                i6 = i8;
                                                str10 = str6;
                                                G = z;
                                                vh3Var = vh3Var2;
                                            }
                                        } else {
                                            i9 = size;
                                            pj3Var2 = pj3Var;
                                            context2 = context;
                                            vh3Var2 = vh3Var;
                                            z = G;
                                        }
                                    } catch (RemoteException e44) {
                                        e = e44;
                                        i9 = size;
                                        pj3Var2 = pj3Var;
                                        context2 = context;
                                        vh3Var2 = vh3Var;
                                        z = G;
                                        pj3.m(vh3Var2);
                                        vh3Var2.r.c(e, "Failed to send event to the service");
                                        if (z) {
                                        }
                                        str6 = null;
                                        i7++;
                                        pj3Var = pj3Var2;
                                        context = context2;
                                        size = i9;
                                        i6 = i8;
                                        str10 = str6;
                                        G = z;
                                        vh3Var = vh3Var2;
                                    }
                                } catch (RemoteException e45) {
                                    e = e45;
                                }
                            }
                            str6 = null;
                            i7++;
                            pj3Var = pj3Var2;
                            context = context2;
                            size = i9;
                            i6 = i8;
                            str10 = str6;
                            G = z;
                            vh3Var = vh3Var2;
                        }
                    }
                    i8 = i6;
                    if (i1Var2 instanceof kd3) {
                    }
                    str6 = null;
                    i7++;
                    pj3Var = pj3Var2;
                    context = context2;
                    size = i9;
                    i6 = i8;
                    str10 = str6;
                    G = z;
                    vh3Var = vh3Var2;
                }
                i11 = i14 + 1;
                vh3Var3 = vh3Var;
                pj3Var3 = pj3Var;
                context3 = context;
                qb2Var = qb2Var2;
                i10 = i6;
            }
            i = 0;
            arrayList = null;
            if (arrayList == null) {
            }
            if (i1Var != null) {
                arrayList2.add(new jh3(i1Var, cs3Var2.o, cs3Var2.v));
            }
            String str102 = null;
            boolean G2 = ec3Var.G(null, ug3.O0);
            size = arrayList2.size();
            i7 = i;
            while (i7 < size) {
            }
            i11 = i14 + 1;
            vh3Var3 = vh3Var;
            pj3Var3 = pj3Var;
            context3 = context;
            qb2Var = qb2Var2;
            i10 = i6;
        }
    }

    public final void P(yb3 yb3Var) {
        boolean D;
        v();
        x();
        pj3 pj3Var = (pj3) this.m;
        pj3Var.getClass();
        lh3 o = pj3Var.o();
        pj3 pj3Var2 = (pj3) o.m;
        pj3.k(pj3Var2.u);
        byte[] b0 = zq3.b0(yb3Var);
        if (b0.length > 131072) {
            vh3 vh3Var = pj3Var2.r;
            pj3.m(vh3Var);
            vh3Var.s.b("Conditional user property too long for local database. Sending directly to service");
            D = false;
        } else {
            D = o.D(2, b0);
        }
        K(new jn3(this, M(true), D, new yb3(yb3Var)));
    }

    @Override // defpackage.xg3
    public final boolean z() {
        return false;
    }
}
