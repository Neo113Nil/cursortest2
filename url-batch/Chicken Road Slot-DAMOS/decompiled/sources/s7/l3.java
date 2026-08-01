package s7;

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
import com.google.android.gms.internal.measurement.cf;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class l3 extends g0 {

    /* renamed from: i, reason: collision with root package name */
    public final k3 f8812i;

    /* renamed from: r, reason: collision with root package name */
    public h0 f8813r;

    /* renamed from: s, reason: collision with root package name */
    public volatile Boolean f8814s;

    /* renamed from: t, reason: collision with root package name */
    public final h3 f8815t;

    /* renamed from: u, reason: collision with root package name */
    public ScheduledExecutorService f8816u;

    /* renamed from: v, reason: collision with root package name */
    public final r0 f8817v;

    /* renamed from: w, reason: collision with root package name */
    public final ArrayList f8818w;

    /* renamed from: x, reason: collision with root package name */
    public final h3 f8819x;

    public l3(q1 q1Var) {
        super(q1Var);
        this.f8818w = new ArrayList();
        this.f8817v = new r0(q1Var.f8942y);
        this.f8812i = new k3(this);
        this.f8815t = new h3(this, q1Var, 0);
        this.f8819x = new h3(this, q1Var, 1);
    }

    public final void A() {
        s();
        t();
        k3 k3Var = this.f8812i;
        if (k3Var.f8795b != null && (k3Var.f8795b.q() || k3Var.f8795b.r())) {
            k3Var.f8795b.d();
        }
        k3Var.f8795b = null;
        try {
            f7.a.b().c(((q1) this.f1478d).f8932d, k3Var);
        } catch (IllegalArgumentException | IllegalStateException unused) {
        }
        this.f8813r = null;
    }

    public final boolean B() {
        s();
        t();
        if (!z()) {
            return true;
        }
        p4 p4Var = ((q1) this.f1478d).f8940w;
        q1.j(p4Var);
        return p4Var.d0() >= ((Integer) e0.J0.a(null)).intValue();
    }

    public final boolean C() {
        s();
        t();
        if (!z()) {
            return true;
        }
        p4 p4Var = ((q1) this.f1478d).f8940w;
        q1.j(p4Var);
        return p4Var.d0() >= 241200;
    }

    public final void D(ComponentName componentName) {
        s();
        if (this.f8813r != null) {
            this.f8813r = null;
            v0 v0Var = ((q1) this.f1478d).f8937t;
            q1.l(v0Var);
            v0Var.B.b(componentName, "Disconnected from device MeasurementService");
            s();
            y();
        }
    }

    public final void E() {
        ((q1) this.f1478d).getClass();
    }

    public final void F() {
        s();
        r0 r0Var = this.f8817v;
        ((g7.a) r0Var.f8970i).getClass();
        r0Var.f8969e = SystemClock.elapsedRealtime();
        ((q1) this.f1478d).getClass();
        this.f8815t.b(((Long) e0.Y.a(null)).longValue());
    }

    public final void G(Runnable runnable) {
        s();
        if (J()) {
            runnable.run();
            return;
        }
        ArrayList arrayList = this.f8818w;
        long size = arrayList.size();
        q1 q1Var = (q1) this.f1478d;
        q1Var.getClass();
        if (size >= 1000) {
            v0 v0Var = q1Var.f8937t;
            q1.l(v0Var);
            v0Var.f9050t.a("Discarding data. Max runnable queue size reached");
        } else {
            arrayList.add(runnable);
            this.f8819x.b(60000L);
            y();
        }
    }

    public final void H() {
        s();
        q1 q1Var = (q1) this.f1478d;
        v0 v0Var = q1Var.f8937t;
        q1.l(v0Var);
        t0 t0Var = v0Var.B;
        ArrayList arrayList = this.f8818w;
        t0Var.b(Integer.valueOf(arrayList.size()), "Processing queued up service tasks");
        int size = arrayList.size();
        int i3 = 0;
        while (i3 < size) {
            Object obj = arrayList.get(i3);
            i3++;
            try {
                ((Runnable) obj).run();
            } catch (RuntimeException e2) {
                v0 v0Var2 = q1Var.f8937t;
                q1.l(v0Var2);
                v0Var2.f9050t.b(e2, "Task exception while flushing queue");
            }
        }
        arrayList.clear();
        this.f8819x.c();
    }

    public final r4 I(boolean z10) {
        long abs;
        Pair pair;
        q1 q1Var = (q1) this.f1478d;
        q1Var.getClass();
        m0 q3 = q1Var.q();
        String str = null;
        if (z10) {
            v0 v0Var = q1Var.f8937t;
            q1.l(v0Var);
            q1 q1Var2 = (q1) v0Var.f1478d;
            f1 f1Var = q1Var2.f8936s;
            q1.j(f1Var);
            if (f1Var.f8684s != null) {
                f1 f1Var2 = q1Var2.f8936s;
                q1.j(f1Var2);
                e1 e1Var = f1Var2.f8684s;
                f1 f1Var3 = (f1) e1Var.f8668e;
                f1Var3.s();
                f1Var3.s();
                long j = ((f1) e1Var.f8668e).w().getLong((String) e1Var.f8665b, 0L);
                if (j == 0) {
                    e1Var.b();
                    abs = 0;
                } else {
                    ((q1) f1Var3.f1478d).f8942y.getClass();
                    abs = Math.abs(j - System.currentTimeMillis());
                }
                long j3 = e1Var.f8664a;
                if (abs >= j3) {
                    if (abs > j3 + j3) {
                        e1Var.b();
                    } else {
                        String string = f1Var3.w().getString((String) e1Var.f8667d, null);
                        long j10 = f1Var3.w().getLong((String) e1Var.f8666c, 0L);
                        e1Var.b();
                        pair = (string == null || j10 <= 0) ? f1.N : new Pair(string, Long.valueOf(j10));
                        if (pair != null && pair != f1.N) {
                            String valueOf = String.valueOf(pair.second);
                            String str2 = (String) pair.first;
                            str = v4.a.p(new StringBuilder(valueOf.length() + 1 + String.valueOf(str2).length()), valueOf, ":", str2);
                        }
                    }
                }
                pair = null;
                if (pair != null) {
                    String valueOf2 = String.valueOf(pair.second);
                    String str22 = (String) pair.first;
                    str = v4.a.p(new StringBuilder(valueOf2.length() + 1 + String.valueOf(str22).length()), valueOf2, ":", str22);
                }
            }
        }
        return q3.w(str);
    }

    public final boolean J() {
        s();
        t();
        return this.f8813r != null;
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x04da  */
    /* JADX WARN: Removed duplicated region for block: B:11:0x04d1  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x04b2  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x04b7  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x04f4  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x0475  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x04a4 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:212:0x049e  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x04a4 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:219:0x0442 A[Catch: all -> 0x047e, TRY_ENTER, TryCatch #56 {all -> 0x047e, blocks: (B:196:0x046e, B:219:0x0442, B:221:0x0448, B:222:0x044b, B:210:0x048f, B:338:0x0379, B:342:0x0383, B:343:0x0394), top: B:195:0x046e }] */
    /* JADX WARN: Removed duplicated region for block: B:224:0x045a  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x04a4 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x064f  */
    /* JADX WARN: Removed duplicated region for block: B:274:0x02da A[Catch: all -> 0x0202, SQLiteException -> 0x02b4, SQLiteDatabaseLockedException -> 0x02b9, SQLiteFullException -> 0x02bd, TryCatch #58 {all -> 0x0202, blocks: (B:166:0x01dd, B:169:0x01f1, B:171:0x01f6, B:178:0x021a, B:179:0x021d, B:182:0x0216, B:229:0x0223, B:232:0x0237, B:234:0x024f, B:239:0x0258, B:240:0x025b, B:237:0x0249, B:243:0x025f, B:246:0x0273, B:248:0x028b, B:253:0x0295, B:254:0x0298, B:251:0x0285, B:264:0x029c, B:272:0x02b0, B:274:0x02da, B:282:0x02e4, B:283:0x02e7, B:288:0x02d4, B:259:0x02f6, B:261:0x0301, B:335:0x0364), top: B:165:0x01dd }] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x059b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x062a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void K(h0 h0Var, d7.a aVar, r4 r4Var) {
        ArrayList arrayList;
        q1 q1Var;
        Context context;
        v0 v0Var;
        int i3;
        SQLiteDatabase sQLiteDatabase;
        String str;
        int i10;
        String str2;
        String str3;
        int i11;
        Cursor cursor;
        Cursor cursor2;
        Cursor cursor3;
        long j;
        String str4;
        String[] strArr;
        int i12;
        long j3;
        String str5;
        d0 d0Var;
        Parcel obtain;
        t tVar;
        int i13;
        e eVar;
        m4 m4Var;
        int i14;
        int size;
        int i15;
        int i16;
        q1 q1Var2;
        Context context2;
        v0 v0Var2;
        long j10;
        long j11;
        s();
        t();
        E();
        q1 q1Var3 = (q1) this.f1478d;
        q1Var3.getClass();
        Context context3 = q1Var3.f8932d;
        g gVar = q1Var3.f8935r;
        v0 v0Var3 = q1Var3.f8937t;
        g7.a aVar2 = q1Var3.f8942y;
        int i17 = 100;
        r4 r4Var2 = r4Var;
        int i18 = 0;
        for (int i19 = 100; i18 < 1001 && i19 == i17; i19 = i14) {
            ArrayList arrayList2 = new ArrayList();
            o0 n10 = q1Var3.n();
            int i20 = i17;
            String str6 = "entry";
            String str7 = com.onesignal.inAppMessages.internal.display.impl.n.EVENT_TYPE_KEY;
            String str8 = "rowid";
            g7.a aVar3 = aVar2;
            q1 q1Var4 = (q1) n10.f1478d;
            n10.s();
            int i21 = i18;
            if (n10.f8894r) {
                q1Var = q1Var3;
                context = context3;
                v0Var = v0Var3;
            } else {
                arrayList = new ArrayList();
                q1Var = q1Var3;
                if (((q1) n10.f1478d).f8932d.getDatabasePath("google_app_measurement_local.db").exists()) {
                    int i22 = 5;
                    context = context3;
                    v0Var = v0Var3;
                    int i23 = 0;
                    int i24 = 5;
                    while (i23 < i22) {
                        try {
                            SQLiteDatabase y3 = n10.y();
                            if (y3 == null) {
                                try {
                                    try {
                                        n10.f8894r = true;
                                    } catch (Throwable th) {
                                        th = th;
                                        sQLiteDatabase = y3;
                                        cursor = null;
                                        if (cursor != null) {
                                        }
                                        if (sQLiteDatabase != null) {
                                        }
                                        throw th;
                                    }
                                } catch (SQLiteDatabaseLockedException unused) {
                                    str = str8;
                                    i10 = i23;
                                    str3 = str6;
                                    sQLiteDatabase = y3;
                                    i11 = 5;
                                    str2 = str7;
                                    cursor2 = null;
                                    try {
                                        SystemClock.sleep(i24);
                                        i24 += 20;
                                        if (cursor2 != null) {
                                        }
                                        if (sQLiteDatabase == null) {
                                        }
                                        sQLiteDatabase.close();
                                        i23 = i10 + 1;
                                        i22 = i11;
                                        str7 = str2;
                                        str6 = str3;
                                        str8 = str;
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
                                } catch (SQLiteFullException e2) {
                                    e = e2;
                                    str = str8;
                                    i10 = i23;
                                    str3 = str6;
                                    sQLiteDatabase = y3;
                                    i11 = 5;
                                    str2 = str7;
                                    cursor2 = null;
                                    v0 v0Var4 = q1Var4.f8937t;
                                    q1.l(v0Var4);
                                    v0Var4.f9050t.b(e, "Error reading entries from local database");
                                    n10.f8894r = true;
                                    if (cursor2 != null) {
                                    }
                                    if (sQLiteDatabase == null) {
                                    }
                                    sQLiteDatabase.close();
                                    i23 = i10 + 1;
                                    i22 = i11;
                                    str7 = str2;
                                    str6 = str3;
                                    str8 = str;
                                } catch (SQLiteException e9) {
                                    e = e9;
                                    str = str8;
                                    i10 = i23;
                                    str3 = str6;
                                    sQLiteDatabase = y3;
                                    i11 = 5;
                                    str2 = str7;
                                    cursor2 = null;
                                    if (sQLiteDatabase != null) {
                                    }
                                    v0 v0Var5 = q1Var4.f8937t;
                                    q1.l(v0Var5);
                                    v0Var5.f9050t.b(e, "Error reading entries from local database");
                                    n10.f8894r = true;
                                    if (cursor2 != null) {
                                    }
                                    if (sQLiteDatabase == null) {
                                    }
                                    sQLiteDatabase.close();
                                    i23 = i10 + 1;
                                    i22 = i11;
                                    str7 = str2;
                                    str6 = str3;
                                    str8 = str;
                                }
                            } else {
                                y3.beginTransaction();
                                try {
                                    cursor3 = y3.query("messages", new String[]{str8}, "type=?", new String[]{"3"}, null, null, "rowid desc", "1");
                                    try {
                                        long j12 = -1;
                                        if (cursor3.moveToFirst()) {
                                            i10 = i23;
                                            try {
                                                j = cursor3.getLong(0);
                                                try {
                                                    cursor3.close();
                                                } catch (SQLiteDatabaseLockedException unused2) {
                                                    str = str8;
                                                    str3 = str6;
                                                    sQLiteDatabase = y3;
                                                    i11 = 5;
                                                    str2 = str7;
                                                    cursor2 = null;
                                                    SystemClock.sleep(i24);
                                                    i24 += 20;
                                                    if (cursor2 != null) {
                                                    }
                                                    if (sQLiteDatabase == null) {
                                                    }
                                                    sQLiteDatabase.close();
                                                    i23 = i10 + 1;
                                                    i22 = i11;
                                                    str7 = str2;
                                                    str6 = str3;
                                                    str8 = str;
                                                } catch (SQLiteFullException e10) {
                                                    e = e10;
                                                    str = str8;
                                                    str3 = str6;
                                                    sQLiteDatabase = y3;
                                                    i11 = 5;
                                                    str2 = str7;
                                                    cursor2 = null;
                                                    v0 v0Var42 = q1Var4.f8937t;
                                                    q1.l(v0Var42);
                                                    v0Var42.f9050t.b(e, "Error reading entries from local database");
                                                    n10.f8894r = true;
                                                    if (cursor2 != null) {
                                                    }
                                                    if (sQLiteDatabase == null) {
                                                    }
                                                    sQLiteDatabase.close();
                                                    i23 = i10 + 1;
                                                    i22 = i11;
                                                    str7 = str2;
                                                    str6 = str3;
                                                    str8 = str;
                                                } catch (SQLiteException e11) {
                                                    e = e11;
                                                    str = str8;
                                                    str3 = str6;
                                                    sQLiteDatabase = y3;
                                                    i11 = 5;
                                                    str2 = str7;
                                                    cursor2 = null;
                                                    if (sQLiteDatabase != null) {
                                                    }
                                                    v0 v0Var52 = q1Var4.f8937t;
                                                    q1.l(v0Var52);
                                                    v0Var52.f9050t.b(e, "Error reading entries from local database");
                                                    n10.f8894r = true;
                                                    if (cursor2 != null) {
                                                    }
                                                    if (sQLiteDatabase == null) {
                                                    }
                                                    sQLiteDatabase.close();
                                                    i23 = i10 + 1;
                                                    i22 = i11;
                                                    str7 = str2;
                                                    str6 = str3;
                                                    str8 = str;
                                                }
                                            } catch (Throwable th3) {
                                                th = th3;
                                                str = str8;
                                                str3 = str6;
                                                sQLiteDatabase = y3;
                                                i11 = 5;
                                                str2 = str7;
                                                if (cursor3 != null) {
                                                    try {
                                                        cursor3.close();
                                                    } catch (SQLiteDatabaseLockedException unused3) {
                                                        cursor2 = null;
                                                        SystemClock.sleep(i24);
                                                        i24 += 20;
                                                        if (cursor2 != null) {
                                                        }
                                                        if (sQLiteDatabase == null) {
                                                        }
                                                        sQLiteDatabase.close();
                                                        i23 = i10 + 1;
                                                        i22 = i11;
                                                        str7 = str2;
                                                        str6 = str3;
                                                        str8 = str;
                                                    } catch (SQLiteFullException e12) {
                                                        e = e12;
                                                        cursor2 = null;
                                                        v0 v0Var422 = q1Var4.f8937t;
                                                        q1.l(v0Var422);
                                                        v0Var422.f9050t.b(e, "Error reading entries from local database");
                                                        n10.f8894r = true;
                                                        if (cursor2 != null) {
                                                        }
                                                        if (sQLiteDatabase == null) {
                                                        }
                                                        sQLiteDatabase.close();
                                                        i23 = i10 + 1;
                                                        i22 = i11;
                                                        str7 = str2;
                                                        str6 = str3;
                                                        str8 = str;
                                                    } catch (SQLiteException e13) {
                                                        e = e13;
                                                        cursor2 = null;
                                                        if (sQLiteDatabase != null) {
                                                        }
                                                        v0 v0Var522 = q1Var4.f8937t;
                                                        q1.l(v0Var522);
                                                        v0Var522.f9050t.b(e, "Error reading entries from local database");
                                                        n10.f8894r = true;
                                                        if (cursor2 != null) {
                                                        }
                                                        if (sQLiteDatabase == null) {
                                                        }
                                                        sQLiteDatabase.close();
                                                        i23 = i10 + 1;
                                                        i22 = i11;
                                                        str7 = str2;
                                                        str6 = str3;
                                                        str8 = str;
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
                                            i10 = i23;
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
                                            String[] strArr2 = {str8, str7, str6};
                                            g gVar2 = q1Var4.f8935r;
                                            d0 d0Var2 = e0.W0;
                                            str = str8;
                                            try {
                                                try {
                                                    int i25 = 4;
                                                    int i26 = 3;
                                                    if (gVar2.D(null, d0Var2)) {
                                                        i12 = 5;
                                                        try {
                                                            strArr2 = new String[]{str, str7, str6, "app_version", "app_version_int"};
                                                        } catch (SQLiteDatabaseLockedException unused4) {
                                                            i11 = 5;
                                                            str3 = str6;
                                                            sQLiteDatabase = y3;
                                                            str2 = str7;
                                                            cursor2 = null;
                                                            SystemClock.sleep(i24);
                                                            i24 += 20;
                                                            if (cursor2 != null) {
                                                            }
                                                            if (sQLiteDatabase == null) {
                                                            }
                                                            sQLiteDatabase.close();
                                                            i23 = i10 + 1;
                                                            i22 = i11;
                                                            str7 = str2;
                                                            str6 = str3;
                                                            str8 = str;
                                                        } catch (SQLiteFullException e14) {
                                                            e = e14;
                                                            i11 = 5;
                                                            str3 = str6;
                                                            sQLiteDatabase = y3;
                                                            str2 = str7;
                                                            cursor2 = null;
                                                            v0 v0Var4222 = q1Var4.f8937t;
                                                            q1.l(v0Var4222);
                                                            v0Var4222.f9050t.b(e, "Error reading entries from local database");
                                                            n10.f8894r = true;
                                                            if (cursor2 != null) {
                                                            }
                                                            if (sQLiteDatabase == null) {
                                                            }
                                                            sQLiteDatabase.close();
                                                            i23 = i10 + 1;
                                                            i22 = i11;
                                                            str7 = str2;
                                                            str6 = str3;
                                                            str8 = str;
                                                        } catch (SQLiteException e15) {
                                                            e = e15;
                                                            i11 = 5;
                                                            str3 = str6;
                                                            sQLiteDatabase = y3;
                                                            str2 = str7;
                                                            cursor2 = null;
                                                            if (sQLiteDatabase != null) {
                                                            }
                                                            v0 v0Var5222 = q1Var4.f8937t;
                                                            q1.l(v0Var5222);
                                                            v0Var5222.f9050t.b(e, "Error reading entries from local database");
                                                            n10.f8894r = true;
                                                            if (cursor2 != null) {
                                                            }
                                                            if (sQLiteDatabase == null) {
                                                            }
                                                            sQLiteDatabase.close();
                                                            i23 = i10 + 1;
                                                            i22 = i11;
                                                            str7 = str2;
                                                            str6 = str3;
                                                            str8 = str;
                                                        }
                                                    } else {
                                                        i12 = 5;
                                                    }
                                                    try {
                                                        Cursor query = y3.query("messages", strArr2, str4, strArr, null, null, "rowid asc", Integer.toString(i20));
                                                        while (query.moveToNext()) {
                                                            try {
                                                                try {
                                                                    try {
                                                                        j12 = query.getLong(0);
                                                                        try {
                                                                            int i27 = query.getInt(1);
                                                                            str2 = str7;
                                                                            try {
                                                                                byte[] blob = query.getBlob(2);
                                                                                str3 = str6;
                                                                                try {
                                                                                    if (q1Var4.f8935r.D(null, d0Var2)) {
                                                                                        try {
                                                                                            str5 = query.getString(i26);
                                                                                            cursor2 = query;
                                                                                            j3 = query.getLong(i25);
                                                                                        } catch (SQLiteDatabaseLockedException unused5) {
                                                                                            cursor2 = query;
                                                                                            sQLiteDatabase = y3;
                                                                                            i11 = 5;
                                                                                            SystemClock.sleep(i24);
                                                                                            i24 += 20;
                                                                                            if (cursor2 != null) {
                                                                                            }
                                                                                            if (sQLiteDatabase == null) {
                                                                                            }
                                                                                            sQLiteDatabase.close();
                                                                                            i23 = i10 + 1;
                                                                                            i22 = i11;
                                                                                            str7 = str2;
                                                                                            str6 = str3;
                                                                                            str8 = str;
                                                                                        } catch (SQLiteFullException e16) {
                                                                                            e = e16;
                                                                                            cursor2 = query;
                                                                                            sQLiteDatabase = y3;
                                                                                            i11 = 5;
                                                                                            v0 v0Var42222 = q1Var4.f8937t;
                                                                                            q1.l(v0Var42222);
                                                                                            v0Var42222.f9050t.b(e, "Error reading entries from local database");
                                                                                            n10.f8894r = true;
                                                                                            if (cursor2 != null) {
                                                                                            }
                                                                                            if (sQLiteDatabase == null) {
                                                                                            }
                                                                                            sQLiteDatabase.close();
                                                                                            i23 = i10 + 1;
                                                                                            i22 = i11;
                                                                                            str7 = str2;
                                                                                            str6 = str3;
                                                                                            str8 = str;
                                                                                        } catch (SQLiteException e17) {
                                                                                            e = e17;
                                                                                            cursor2 = query;
                                                                                            sQLiteDatabase = y3;
                                                                                            i11 = 5;
                                                                                            if (sQLiteDatabase != null) {
                                                                                            }
                                                                                            v0 v0Var52222 = q1Var4.f8937t;
                                                                                            q1.l(v0Var52222);
                                                                                            v0Var52222.f9050t.b(e, "Error reading entries from local database");
                                                                                            n10.f8894r = true;
                                                                                            if (cursor2 != null) {
                                                                                            }
                                                                                            if (sQLiteDatabase == null) {
                                                                                            }
                                                                                            sQLiteDatabase.close();
                                                                                            i23 = i10 + 1;
                                                                                            i22 = i11;
                                                                                            str7 = str2;
                                                                                            str6 = str3;
                                                                                            str8 = str;
                                                                                        }
                                                                                    } else {
                                                                                        cursor2 = query;
                                                                                        j3 = 0;
                                                                                        str5 = null;
                                                                                    }
                                                                                    if (i27 == 0) {
                                                                                        d0Var = d0Var2;
                                                                                        try {
                                                                                            try {
                                                                                                obtain = Parcel.obtain();
                                                                                                try {
                                                                                                    try {
                                                                                                        obtain.unmarshall(blob, 0, blob.length);
                                                                                                        obtain.setDataPosition(0);
                                                                                                        u createFromParcel = u.CREATOR.createFromParcel(obtain);
                                                                                                        if (createFromParcel != null) {
                                                                                                            arrayList.add(new n0(createFromParcel, str5, j3));
                                                                                                        }
                                                                                                    } finally {
                                                                                                    }
                                                                                                } catch (d7.b unused6) {
                                                                                                    v0 v0Var6 = q1Var4.f8937t;
                                                                                                    q1.l(v0Var6);
                                                                                                    v0Var6.f9050t.a("Failed to load event from local database");
                                                                                                    obtain.recycle();
                                                                                                }
                                                                                            } catch (Throwable th5) {
                                                                                                th = th5;
                                                                                                sQLiteDatabase = y3;
                                                                                                cursor = cursor2;
                                                                                                if (cursor != null) {
                                                                                                }
                                                                                                if (sQLiteDatabase != null) {
                                                                                                }
                                                                                                throw th;
                                                                                            }
                                                                                        } catch (SQLiteDatabaseLockedException unused7) {
                                                                                            sQLiteDatabase = y3;
                                                                                            i11 = 5;
                                                                                            SystemClock.sleep(i24);
                                                                                            i24 += 20;
                                                                                            if (cursor2 != null) {
                                                                                            }
                                                                                            if (sQLiteDatabase == null) {
                                                                                            }
                                                                                            sQLiteDatabase.close();
                                                                                            i23 = i10 + 1;
                                                                                            i22 = i11;
                                                                                            str7 = str2;
                                                                                            str6 = str3;
                                                                                            str8 = str;
                                                                                        } catch (SQLiteFullException e18) {
                                                                                            e = e18;
                                                                                            sQLiteDatabase = y3;
                                                                                            i11 = 5;
                                                                                            v0 v0Var422222 = q1Var4.f8937t;
                                                                                            q1.l(v0Var422222);
                                                                                            v0Var422222.f9050t.b(e, "Error reading entries from local database");
                                                                                            n10.f8894r = true;
                                                                                            if (cursor2 != null) {
                                                                                                cursor2.close();
                                                                                            }
                                                                                            if (sQLiteDatabase == null) {
                                                                                                i23 = i10 + 1;
                                                                                                i22 = i11;
                                                                                                str7 = str2;
                                                                                                str6 = str3;
                                                                                                str8 = str;
                                                                                            }
                                                                                            sQLiteDatabase.close();
                                                                                            i23 = i10 + 1;
                                                                                            i22 = i11;
                                                                                            str7 = str2;
                                                                                            str6 = str3;
                                                                                            str8 = str;
                                                                                        } catch (SQLiteException e19) {
                                                                                            e = e19;
                                                                                            sQLiteDatabase = y3;
                                                                                            i11 = 5;
                                                                                            if (sQLiteDatabase != null && sQLiteDatabase.inTransaction()) {
                                                                                                sQLiteDatabase.endTransaction();
                                                                                            }
                                                                                            v0 v0Var522222 = q1Var4.f8937t;
                                                                                            q1.l(v0Var522222);
                                                                                            v0Var522222.f9050t.b(e, "Error reading entries from local database");
                                                                                            n10.f8894r = true;
                                                                                            if (cursor2 != null) {
                                                                                                cursor2.close();
                                                                                            }
                                                                                            if (sQLiteDatabase == null) {
                                                                                                i23 = i10 + 1;
                                                                                                i22 = i11;
                                                                                                str7 = str2;
                                                                                                str6 = str3;
                                                                                                str8 = str;
                                                                                            }
                                                                                            sQLiteDatabase.close();
                                                                                            i23 = i10 + 1;
                                                                                            i22 = i11;
                                                                                            str7 = str2;
                                                                                            str6 = str3;
                                                                                            str8 = str;
                                                                                        }
                                                                                    } else {
                                                                                        d0Var = d0Var2;
                                                                                        if (i27 == 1) {
                                                                                            obtain = Parcel.obtain();
                                                                                            try {
                                                                                                try {
                                                                                                    obtain.unmarshall(blob, 0, blob.length);
                                                                                                    obtain.setDataPosition(0);
                                                                                                    m4Var = m4.CREATOR.createFromParcel(obtain);
                                                                                                } catch (d7.b unused8) {
                                                                                                    v0 v0Var7 = q1Var4.f8937t;
                                                                                                    q1.l(v0Var7);
                                                                                                    v0Var7.f9050t.a("Failed to load user property from local database");
                                                                                                    obtain.recycle();
                                                                                                    m4Var = null;
                                                                                                }
                                                                                                if (m4Var != null) {
                                                                                                    arrayList.add(new n0(m4Var, str5, j3));
                                                                                                }
                                                                                            } finally {
                                                                                            }
                                                                                        } else if (i27 == 2) {
                                                                                            obtain = Parcel.obtain();
                                                                                            try {
                                                                                                try {
                                                                                                    obtain.unmarshall(blob, 0, blob.length);
                                                                                                    obtain.setDataPosition(0);
                                                                                                    eVar = e.CREATOR.createFromParcel(obtain);
                                                                                                } catch (d7.b unused9) {
                                                                                                    v0 v0Var8 = q1Var4.f8937t;
                                                                                                    q1.l(v0Var8);
                                                                                                    v0Var8.f9050t.a("Failed to load conditional user property from local database");
                                                                                                    obtain.recycle();
                                                                                                    eVar = null;
                                                                                                }
                                                                                                if (eVar != null) {
                                                                                                    arrayList.add(new n0(eVar, str5, j3));
                                                                                                }
                                                                                            } finally {
                                                                                            }
                                                                                        } else if (i27 == 4) {
                                                                                            try {
                                                                                                obtain = Parcel.obtain();
                                                                                                try {
                                                                                                    try {
                                                                                                        try {
                                                                                                            obtain.unmarshall(blob, 0, blob.length);
                                                                                                            obtain.setDataPosition(0);
                                                                                                            tVar = t.CREATOR.createFromParcel(obtain);
                                                                                                        } catch (Throwable th6) {
                                                                                                            th = th6;
                                                                                                            throw th;
                                                                                                        }
                                                                                                    } catch (d7.b unused10) {
                                                                                                        v0 v0Var9 = q1Var4.f8937t;
                                                                                                        q1.l(v0Var9);
                                                                                                        v0Var9.f9050t.a("Failed to load default event parameters from local database");
                                                                                                        obtain.recycle();
                                                                                                        tVar = null;
                                                                                                        if (tVar != null) {
                                                                                                        }
                                                                                                        i13 = 3;
                                                                                                        i26 = i13;
                                                                                                        str7 = str2;
                                                                                                        str6 = str3;
                                                                                                        query = cursor2;
                                                                                                        d0Var2 = d0Var;
                                                                                                        i25 = 4;
                                                                                                    }
                                                                                                } catch (d7.b unused11) {
                                                                                                } catch (Throwable th7) {
                                                                                                    th = th7;
                                                                                                }
                                                                                            } catch (SQLiteDatabaseLockedException unused12) {
                                                                                                sQLiteDatabase = y3;
                                                                                                i11 = 5;
                                                                                                SystemClock.sleep(i24);
                                                                                                i24 += 20;
                                                                                                if (cursor2 != null) {
                                                                                                }
                                                                                                if (sQLiteDatabase == null) {
                                                                                                }
                                                                                                sQLiteDatabase.close();
                                                                                                i23 = i10 + 1;
                                                                                                i22 = i11;
                                                                                                str7 = str2;
                                                                                                str6 = str3;
                                                                                                str8 = str;
                                                                                            } catch (SQLiteFullException e20) {
                                                                                                e = e20;
                                                                                                sQLiteDatabase = y3;
                                                                                                i11 = 5;
                                                                                                v0 v0Var4222222 = q1Var4.f8937t;
                                                                                                q1.l(v0Var4222222);
                                                                                                v0Var4222222.f9050t.b(e, "Error reading entries from local database");
                                                                                                n10.f8894r = true;
                                                                                                if (cursor2 != null) {
                                                                                                }
                                                                                                if (sQLiteDatabase == null) {
                                                                                                }
                                                                                                sQLiteDatabase.close();
                                                                                                i23 = i10 + 1;
                                                                                                i22 = i11;
                                                                                                str7 = str2;
                                                                                                str6 = str3;
                                                                                                str8 = str;
                                                                                            } catch (SQLiteException e21) {
                                                                                                e = e21;
                                                                                                sQLiteDatabase = y3;
                                                                                                i11 = 5;
                                                                                                if (sQLiteDatabase != null) {
                                                                                                }
                                                                                                v0 v0Var5222222 = q1Var4.f8937t;
                                                                                                q1.l(v0Var5222222);
                                                                                                v0Var5222222.f9050t.b(e, "Error reading entries from local database");
                                                                                                n10.f8894r = true;
                                                                                                if (cursor2 != null) {
                                                                                                }
                                                                                                if (sQLiteDatabase == null) {
                                                                                                }
                                                                                                sQLiteDatabase.close();
                                                                                                i23 = i10 + 1;
                                                                                                i22 = i11;
                                                                                                str7 = str2;
                                                                                                str6 = str3;
                                                                                                str8 = str;
                                                                                            }
                                                                                            try {
                                                                                                if (tVar != null) {
                                                                                                    arrayList.add(new n0(tVar, str5, j3));
                                                                                                }
                                                                                                i13 = 3;
                                                                                                i26 = i13;
                                                                                                str7 = str2;
                                                                                                str6 = str3;
                                                                                                query = cursor2;
                                                                                                d0Var2 = d0Var;
                                                                                                i25 = 4;
                                                                                            } catch (SQLiteDatabaseLockedException unused13) {
                                                                                                sQLiteDatabase = y3;
                                                                                                i11 = 5;
                                                                                                SystemClock.sleep(i24);
                                                                                                i24 += 20;
                                                                                                if (cursor2 != null) {
                                                                                                }
                                                                                                if (sQLiteDatabase == null) {
                                                                                                }
                                                                                                sQLiteDatabase.close();
                                                                                                i23 = i10 + 1;
                                                                                                i22 = i11;
                                                                                                str7 = str2;
                                                                                                str6 = str3;
                                                                                                str8 = str;
                                                                                            } catch (SQLiteFullException e22) {
                                                                                                e = e22;
                                                                                                sQLiteDatabase = y3;
                                                                                                i11 = 5;
                                                                                                v0 v0Var42222222 = q1Var4.f8937t;
                                                                                                q1.l(v0Var42222222);
                                                                                                v0Var42222222.f9050t.b(e, "Error reading entries from local database");
                                                                                                n10.f8894r = true;
                                                                                                if (cursor2 != null) {
                                                                                                }
                                                                                                if (sQLiteDatabase == null) {
                                                                                                }
                                                                                                sQLiteDatabase.close();
                                                                                                i23 = i10 + 1;
                                                                                                i22 = i11;
                                                                                                str7 = str2;
                                                                                                str6 = str3;
                                                                                                str8 = str;
                                                                                            } catch (SQLiteException e23) {
                                                                                                e = e23;
                                                                                                sQLiteDatabase = y3;
                                                                                                i11 = 5;
                                                                                                if (sQLiteDatabase != null) {
                                                                                                }
                                                                                                v0 v0Var52222222 = q1Var4.f8937t;
                                                                                                q1.l(v0Var52222222);
                                                                                                v0Var52222222.f9050t.b(e, "Error reading entries from local database");
                                                                                                n10.f8894r = true;
                                                                                                if (cursor2 != null) {
                                                                                                }
                                                                                                if (sQLiteDatabase == null) {
                                                                                                }
                                                                                                sQLiteDatabase.close();
                                                                                                i23 = i10 + 1;
                                                                                                i22 = i11;
                                                                                                str7 = str2;
                                                                                                str6 = str3;
                                                                                                str8 = str;
                                                                                            }
                                                                                        } else {
                                                                                            v0 v0Var10 = q1Var4.f8937t;
                                                                                            i13 = 3;
                                                                                            if (i27 == 3) {
                                                                                                q1.l(v0Var10);
                                                                                                v0Var10.B.a("Skipping app launch break");
                                                                                            } else {
                                                                                                q1.l(v0Var10);
                                                                                                v0Var10.f9050t.a("Unknown record type in local database");
                                                                                            }
                                                                                            i26 = i13;
                                                                                            str7 = str2;
                                                                                            str6 = str3;
                                                                                            query = cursor2;
                                                                                            d0Var2 = d0Var;
                                                                                            i25 = 4;
                                                                                        }
                                                                                    }
                                                                                    i13 = 3;
                                                                                    i26 = i13;
                                                                                    str7 = str2;
                                                                                    str6 = str3;
                                                                                    query = cursor2;
                                                                                    d0Var2 = d0Var;
                                                                                    i25 = 4;
                                                                                } catch (SQLiteDatabaseLockedException unused14) {
                                                                                    cursor2 = query;
                                                                                } catch (SQLiteFullException e24) {
                                                                                    e = e24;
                                                                                    cursor2 = query;
                                                                                } catch (SQLiteException e25) {
                                                                                    e = e25;
                                                                                    cursor2 = query;
                                                                                }
                                                                            } catch (SQLiteDatabaseLockedException unused15) {
                                                                                cursor2 = query;
                                                                                str3 = str6;
                                                                                sQLiteDatabase = y3;
                                                                                i11 = 5;
                                                                                SystemClock.sleep(i24);
                                                                                i24 += 20;
                                                                                if (cursor2 != null) {
                                                                                }
                                                                                if (sQLiteDatabase == null) {
                                                                                }
                                                                                sQLiteDatabase.close();
                                                                                i23 = i10 + 1;
                                                                                i22 = i11;
                                                                                str7 = str2;
                                                                                str6 = str3;
                                                                                str8 = str;
                                                                            } catch (SQLiteFullException e26) {
                                                                                e = e26;
                                                                                cursor2 = query;
                                                                                str3 = str6;
                                                                                sQLiteDatabase = y3;
                                                                                i11 = 5;
                                                                                v0 v0Var422222222 = q1Var4.f8937t;
                                                                                q1.l(v0Var422222222);
                                                                                v0Var422222222.f9050t.b(e, "Error reading entries from local database");
                                                                                n10.f8894r = true;
                                                                                if (cursor2 != null) {
                                                                                }
                                                                                if (sQLiteDatabase == null) {
                                                                                }
                                                                                sQLiteDatabase.close();
                                                                                i23 = i10 + 1;
                                                                                i22 = i11;
                                                                                str7 = str2;
                                                                                str6 = str3;
                                                                                str8 = str;
                                                                            } catch (SQLiteException e27) {
                                                                                e = e27;
                                                                                cursor2 = query;
                                                                                str3 = str6;
                                                                                sQLiteDatabase = y3;
                                                                                i11 = 5;
                                                                                if (sQLiteDatabase != null) {
                                                                                }
                                                                                v0 v0Var522222222 = q1Var4.f8937t;
                                                                                q1.l(v0Var522222222);
                                                                                v0Var522222222.f9050t.b(e, "Error reading entries from local database");
                                                                                n10.f8894r = true;
                                                                                if (cursor2 != null) {
                                                                                }
                                                                                if (sQLiteDatabase == null) {
                                                                                }
                                                                                sQLiteDatabase.close();
                                                                                i23 = i10 + 1;
                                                                                i22 = i11;
                                                                                str7 = str2;
                                                                                str6 = str3;
                                                                                str8 = str;
                                                                            }
                                                                        } catch (SQLiteDatabaseLockedException unused16) {
                                                                            cursor2 = query;
                                                                            str2 = str7;
                                                                        } catch (SQLiteFullException e28) {
                                                                            e = e28;
                                                                            cursor2 = query;
                                                                            str2 = str7;
                                                                        } catch (SQLiteException e29) {
                                                                            e = e29;
                                                                            cursor2 = query;
                                                                            str2 = str7;
                                                                        }
                                                                    } catch (SQLiteDatabaseLockedException unused17) {
                                                                        cursor2 = query;
                                                                        str2 = str7;
                                                                        str3 = str6;
                                                                    } catch (SQLiteFullException e30) {
                                                                        e = e30;
                                                                        cursor2 = query;
                                                                        str2 = str7;
                                                                        str3 = str6;
                                                                    } catch (SQLiteException e31) {
                                                                        e = e31;
                                                                        cursor2 = query;
                                                                        str2 = str7;
                                                                        str3 = str6;
                                                                    }
                                                                } catch (Throwable th8) {
                                                                    th = th8;
                                                                    cursor2 = query;
                                                                }
                                                            } catch (SQLiteDatabaseLockedException unused18) {
                                                                cursor2 = query;
                                                                str2 = str7;
                                                                str3 = str6;
                                                            } catch (SQLiteFullException e32) {
                                                                e = e32;
                                                                cursor2 = query;
                                                                str2 = str7;
                                                                str3 = str6;
                                                            } catch (SQLiteException e33) {
                                                                e = e33;
                                                                cursor2 = query;
                                                                str2 = str7;
                                                                str3 = str6;
                                                            }
                                                        }
                                                        cursor2 = query;
                                                        str2 = str7;
                                                        str3 = str6;
                                                        i3 = 0;
                                                        sQLiteDatabase = y3;
                                                    } catch (SQLiteDatabaseLockedException unused19) {
                                                        str3 = str6;
                                                        sQLiteDatabase = y3;
                                                        str2 = str7;
                                                        i11 = i12;
                                                        cursor2 = null;
                                                        SystemClock.sleep(i24);
                                                        i24 += 20;
                                                        if (cursor2 != null) {
                                                            cursor2.close();
                                                        }
                                                        if (sQLiteDatabase == null) {
                                                            i23 = i10 + 1;
                                                            i22 = i11;
                                                            str7 = str2;
                                                            str6 = str3;
                                                            str8 = str;
                                                        }
                                                        sQLiteDatabase.close();
                                                        i23 = i10 + 1;
                                                        i22 = i11;
                                                        str7 = str2;
                                                        str6 = str3;
                                                        str8 = str;
                                                    }
                                                } catch (SQLiteDatabaseLockedException unused20) {
                                                    str3 = str6;
                                                    sQLiteDatabase = y3;
                                                    str2 = str7;
                                                    i11 = 5;
                                                    cursor2 = null;
                                                    SystemClock.sleep(i24);
                                                    i24 += 20;
                                                    if (cursor2 != null) {
                                                    }
                                                    if (sQLiteDatabase == null) {
                                                    }
                                                    sQLiteDatabase.close();
                                                    i23 = i10 + 1;
                                                    i22 = i11;
                                                    str7 = str2;
                                                    str6 = str3;
                                                    str8 = str;
                                                }
                                                try {
                                                    if (sQLiteDatabase.delete("messages", "rowid <= ?", new String[]{Long.toString(j12)}) < arrayList.size()) {
                                                        v0 v0Var11 = q1Var4.f8937t;
                                                        q1.l(v0Var11);
                                                        v0Var11.f9050t.a("Fewer entries removed from local database than expected");
                                                    }
                                                    sQLiteDatabase.setTransactionSuccessful();
                                                    sQLiteDatabase.endTransaction();
                                                    cursor2.close();
                                                    sQLiteDatabase.close();
                                                } catch (SQLiteDatabaseLockedException unused21) {
                                                    i11 = 5;
                                                    SystemClock.sleep(i24);
                                                    i24 += 20;
                                                    if (cursor2 != null) {
                                                    }
                                                    if (sQLiteDatabase == null) {
                                                    }
                                                    sQLiteDatabase.close();
                                                    i23 = i10 + 1;
                                                    i22 = i11;
                                                    str7 = str2;
                                                    str6 = str3;
                                                    str8 = str;
                                                } catch (SQLiteFullException e34) {
                                                    e = e34;
                                                    i11 = 5;
                                                    v0 v0Var4222222222 = q1Var4.f8937t;
                                                    q1.l(v0Var4222222222);
                                                    v0Var4222222222.f9050t.b(e, "Error reading entries from local database");
                                                    n10.f8894r = true;
                                                    if (cursor2 != null) {
                                                    }
                                                    if (sQLiteDatabase == null) {
                                                    }
                                                    sQLiteDatabase.close();
                                                    i23 = i10 + 1;
                                                    i22 = i11;
                                                    str7 = str2;
                                                    str6 = str3;
                                                    str8 = str;
                                                } catch (SQLiteException e35) {
                                                    e = e35;
                                                    i11 = 5;
                                                    if (sQLiteDatabase != null) {
                                                        sQLiteDatabase.endTransaction();
                                                    }
                                                    v0 v0Var5222222222 = q1Var4.f8937t;
                                                    q1.l(v0Var5222222222);
                                                    v0Var5222222222.f9050t.b(e, "Error reading entries from local database");
                                                    n10.f8894r = true;
                                                    if (cursor2 != null) {
                                                    }
                                                    if (sQLiteDatabase == null) {
                                                    }
                                                    sQLiteDatabase.close();
                                                    i23 = i10 + 1;
                                                    i22 = i11;
                                                    str7 = str2;
                                                    str6 = str3;
                                                    str8 = str;
                                                }
                                            } catch (SQLiteFullException e36) {
                                                e = e36;
                                                str3 = str6;
                                                sQLiteDatabase = y3;
                                                str2 = str7;
                                                i11 = 5;
                                                cursor2 = null;
                                                v0 v0Var42222222222 = q1Var4.f8937t;
                                                q1.l(v0Var42222222222);
                                                v0Var42222222222.f9050t.b(e, "Error reading entries from local database");
                                                n10.f8894r = true;
                                                if (cursor2 != null) {
                                                }
                                                if (sQLiteDatabase == null) {
                                                }
                                                sQLiteDatabase.close();
                                                i23 = i10 + 1;
                                                i22 = i11;
                                                str7 = str2;
                                                str6 = str3;
                                                str8 = str;
                                            } catch (SQLiteException e37) {
                                                e = e37;
                                                str3 = str6;
                                                sQLiteDatabase = y3;
                                                str2 = str7;
                                                i11 = 5;
                                                cursor2 = null;
                                                if (sQLiteDatabase != null) {
                                                }
                                                v0 v0Var52222222222 = q1Var4.f8937t;
                                                q1.l(v0Var52222222222);
                                                v0Var52222222222.f9050t.b(e, "Error reading entries from local database");
                                                n10.f8894r = true;
                                                if (cursor2 != null) {
                                                }
                                                if (sQLiteDatabase == null) {
                                                }
                                                sQLiteDatabase.close();
                                                i23 = i10 + 1;
                                                i22 = i11;
                                                str7 = str2;
                                                str6 = str3;
                                                str8 = str;
                                            }
                                        } catch (SQLiteDatabaseLockedException unused22) {
                                            str = str8;
                                        } catch (SQLiteFullException e38) {
                                            e = e38;
                                            str = str8;
                                        } catch (SQLiteException e39) {
                                            e = e39;
                                            str = str8;
                                        }
                                    } catch (Throwable th9) {
                                        th = th9;
                                        i10 = i23;
                                    }
                                } catch (Throwable th10) {
                                    th = th10;
                                    str = str8;
                                    i10 = i23;
                                    str3 = str6;
                                    sQLiteDatabase = y3;
                                    i11 = 5;
                                    str2 = str7;
                                    cursor3 = null;
                                }
                            }
                        } catch (SQLiteDatabaseLockedException unused23) {
                            str = str8;
                            i10 = i23;
                            str2 = str7;
                            str3 = str6;
                            i11 = 5;
                            sQLiteDatabase = null;
                        } catch (SQLiteFullException e40) {
                            e = e40;
                            str = str8;
                            i10 = i23;
                            str2 = str7;
                            str3 = str6;
                            i11 = 5;
                            sQLiteDatabase = null;
                        } catch (SQLiteException e41) {
                            e = e41;
                            str = str8;
                            i10 = i23;
                            str2 = str7;
                            str3 = str6;
                            i11 = 5;
                            sQLiteDatabase = null;
                        } catch (Throwable th11) {
                            th = th11;
                            sQLiteDatabase = null;
                        }
                    }
                    i3 = 0;
                    v0 v0Var12 = q1Var4.f8937t;
                    q1.l(v0Var12);
                    v0Var12.f9053w.a("Failed to read events from database in reasonable time");
                    arrayList = null;
                } else {
                    context = context3;
                    v0Var = v0Var3;
                    i3 = 0;
                }
                if (arrayList == null) {
                    arrayList2.addAll(arrayList);
                    i14 = arrayList.size();
                } else {
                    i14 = i3;
                }
                if (aVar != null && i14 < i20) {
                    arrayList2.add(new n0(aVar, r4Var2.f8978i, r4Var2.f8985x));
                }
                i15 = i3;
                for (size = arrayList2.size(); i15 < size; size = i16) {
                    n0 n0Var = (n0) arrayList2.get(i15);
                    d7.a aVar4 = n0Var.f8862a;
                    d0 d0Var3 = e0.W0;
                    if (gVar.D(null, d0Var3)) {
                        String str9 = n0Var.f8863b;
                        if (!TextUtils.isEmpty(str9)) {
                            i16 = size;
                            r4Var2 = new r4(r4Var2.f8976d, r4Var2.f8977e, str9, n0Var.f8864c, r4Var2.f8979r, r4Var2.f8980s, r4Var2.f8981t, r4Var2.f8982u, r4Var2.f8983v, r4Var2.f8984w, r4Var2.f8986y, r4Var2.f8987z, r4Var2.A, r4Var2.B, r4Var2.C, r4Var2.D, r4Var2.E, r4Var2.F, r4Var2.G, r4Var2.H, r4Var2.I, r4Var2.J, r4Var2.K, r4Var2.L, r4Var2.M, r4Var2.N, r4Var2.O, r4Var2.P, r4Var2.Q, r4Var2.R, r4Var2.S, r4Var2.T);
                            if (aVar4 instanceof u) {
                                q1Var2 = q1Var;
                                context2 = context;
                                v0Var2 = v0Var;
                                if (aVar4 instanceof m4) {
                                    try {
                                        h0Var.x((m4) aVar4, r4Var2);
                                    } catch (RemoteException e42) {
                                        q1.l(v0Var2);
                                        v0Var2.f9050t.b(e42, "Failed to send user property to the service");
                                    }
                                } else if (aVar4 instanceof e) {
                                    try {
                                        h0Var.s((e) aVar4, r4Var2);
                                    } catch (RemoteException e43) {
                                        q1.l(v0Var2);
                                        v0Var2.f9050t.b(e43, "Failed to send conditional user property to the service");
                                    }
                                } else {
                                    if (gVar.D(null, d0Var3) && (aVar4 instanceof t)) {
                                        try {
                                            h0Var.g(((t) aVar4).f(), r4Var2);
                                        } catch (RemoteException e44) {
                                            q1.l(v0Var2);
                                            v0Var2.f9050t.b(e44, "Failed to send default event parameters to the service");
                                        }
                                    } else {
                                        q1.l(v0Var2);
                                        v0Var2.f9050t.a("Discarding data. Unrecognized parcel type.");
                                    }
                                    i15++;
                                    v0Var = v0Var2;
                                    q1Var = q1Var2;
                                    context = context2;
                                }
                            } else {
                                try {
                                    aVar3.getClass();
                                    long currentTimeMillis = System.currentTimeMillis();
                                    try {
                                        aVar3.getClass();
                                        j10 = SystemClock.elapsedRealtime();
                                        try {
                                            try {
                                                h0Var.B((u) aVar4, r4Var2);
                                                q1.l(v0Var);
                                                v0Var2 = v0Var;
                                                try {
                                                    v0Var2.B.a("Logging telemetry for logEvent from database");
                                                    if (p.e.f7586s == null) {
                                                        q1Var2 = q1Var;
                                                        context2 = context;
                                                        try {
                                                            p.e.f7586s = new p.e(context2, q1Var2);
                                                        } catch (RemoteException e45) {
                                                            e = e45;
                                                            j11 = currentTimeMillis;
                                                            q1.l(v0Var2);
                                                            v0Var2.f9050t.b(e, "Failed to send event to the service");
                                                            if (j11 != 0) {
                                                                if (p.e.f7586s == null) {
                                                                    p.e.f7586s = new p.e(context2, q1Var2);
                                                                }
                                                                p.e eVar2 = p.e.f7586s;
                                                                aVar3.getClass();
                                                                long currentTimeMillis2 = System.currentTimeMillis();
                                                                aVar3.getClass();
                                                                eVar2.l(13, (int) (SystemClock.elapsedRealtime() - j10), j11, currentTimeMillis2);
                                                            }
                                                            i15++;
                                                            v0Var = v0Var2;
                                                            q1Var = q1Var2;
                                                            context = context2;
                                                        }
                                                    } else {
                                                        q1Var2 = q1Var;
                                                        context2 = context;
                                                    }
                                                    p.e eVar3 = p.e.f7586s;
                                                    aVar3.getClass();
                                                    long currentTimeMillis3 = System.currentTimeMillis();
                                                    aVar3.getClass();
                                                    eVar3.l(0, (int) (SystemClock.elapsedRealtime() - j10), currentTimeMillis, currentTimeMillis3);
                                                } catch (RemoteException e46) {
                                                    e = e46;
                                                    q1Var2 = q1Var;
                                                    context2 = context;
                                                }
                                            } catch (RemoteException e47) {
                                                e = e47;
                                                q1Var2 = q1Var;
                                                context2 = context;
                                                v0Var2 = v0Var;
                                                j11 = currentTimeMillis;
                                                q1.l(v0Var2);
                                                v0Var2.f9050t.b(e, "Failed to send event to the service");
                                                if (j11 != 0) {
                                                }
                                                i15++;
                                                v0Var = v0Var2;
                                                q1Var = q1Var2;
                                                context = context2;
                                            }
                                        } catch (RemoteException e48) {
                                            e = e48;
                                        }
                                    } catch (RemoteException e49) {
                                        e = e49;
                                        q1Var2 = q1Var;
                                        context2 = context;
                                        v0Var2 = v0Var;
                                        j10 = 0;
                                    }
                                } catch (RemoteException e50) {
                                    e = e50;
                                    q1Var2 = q1Var;
                                    context2 = context;
                                    v0Var2 = v0Var;
                                    j10 = 0;
                                    j11 = 0;
                                }
                            }
                            i15++;
                            v0Var = v0Var2;
                            q1Var = q1Var2;
                            context = context2;
                        }
                    }
                    i16 = size;
                    if (aVar4 instanceof u) {
                    }
                    i15++;
                    v0Var = v0Var2;
                    q1Var = q1Var2;
                    context = context2;
                }
                v0Var3 = v0Var;
                q1Var3 = q1Var;
                context3 = context;
                aVar2 = aVar3;
                i17 = 100;
                i18 = i21 + 1;
            }
            i3 = 0;
            arrayList = null;
            if (arrayList == null) {
            }
            if (aVar != null) {
                arrayList2.add(new n0(aVar, r4Var2.f8978i, r4Var2.f8985x));
            }
            i15 = i3;
            while (i15 < size) {
            }
            v0Var3 = v0Var;
            q1Var3 = q1Var;
            context3 = context;
            aVar2 = aVar3;
            i17 = 100;
            i18 = i21 + 1;
        }
    }

    public final void L(e eVar) {
        boolean z10;
        s();
        t();
        q1 q1Var = (q1) this.f1478d;
        q1Var.getClass();
        o0 n10 = q1Var.n();
        q1 q1Var2 = (q1) n10.f1478d;
        q1.j(q1Var2.f8940w);
        byte[] b02 = p4.b0(eVar);
        if (b02.length > 131072) {
            v0 v0Var = q1Var2.f8937t;
            q1.l(v0Var);
            v0Var.f9051u.a("Conditional user property too long for local database. Sending directly to service");
            z10 = false;
        } else {
            z10 = n10.z(2, b02);
        }
        G(new f3(this, I(true), z10, new e(eVar)));
    }

    @Override // s7.g0
    public final boolean v() {
        return false;
    }

    public final void w(AtomicReference atomicReference) {
        s();
        t();
        G(new cf(this, atomicReference, I(false)));
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0056  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void x(Bundle bundle) {
        boolean z10;
        boolean z11;
        s();
        t();
        t tVar = new t(bundle);
        E();
        q1 q1Var = (q1) this.f1478d;
        if (q1Var.f8935r.D(null, e0.W0)) {
            o0 n10 = q1Var.n();
            q1 q1Var2 = (q1) n10.f1478d;
            p4 p4Var = q1Var2.f8940w;
            v0 v0Var = q1Var2.f8937t;
            q1.j(p4Var);
            byte[] b02 = p4.b0(tVar);
            if (b02 == null) {
                q1.l(v0Var);
                v0Var.f9051u.a("Null default event parameters; not writing to database");
            } else if (b02.length > 131072) {
                q1.l(v0Var);
                v0Var.f9051u.a("Default event parameters too long for local database. Sending directly to service");
            } else {
                z11 = n10.z(4, b02);
                if (z11) {
                    z10 = true;
                    G(new i2(this, I(false), z10, tVar, bundle));
                }
            }
            z11 = false;
            if (z11) {
            }
        }
        z10 = false;
        G(new i2(this, I(false), z10, tVar, bundle));
    }

    public final void y() {
        s();
        t();
        if (J()) {
            return;
        }
        if (z()) {
            k3 k3Var = this.f8812i;
            l3 l3Var = k3Var.f8796c;
            l3Var.s();
            Context context = ((q1) l3Var.f1478d).f8932d;
            synchronized (k3Var) {
                try {
                    if (k3Var.f8794a) {
                        v0 v0Var = ((q1) k3Var.f8796c.f1478d).f8937t;
                        q1.l(v0Var);
                        v0Var.B.a("Connection attempt already in progress");
                        return;
                    } else {
                        if (k3Var.f8795b != null && (k3Var.f8795b.r() || k3Var.f8795b.q())) {
                            v0 v0Var2 = ((q1) k3Var.f8796c.f1478d).f8937t;
                            q1.l(v0Var2);
                            v0Var2.B.a("Already awaiting connection attempt");
                            return;
                        }
                        k3Var.f8795b = new q0(context, Looper.getMainLooper(), c7.o0.a(context), z6.g.f10882b, 93, k3Var, k3Var, null);
                        v0 v0Var3 = ((q1) k3Var.f8796c.f1478d).f8937t;
                        q1.l(v0Var3);
                        v0Var3.B.a("Connecting to remote service");
                        k3Var.f8794a = true;
                        c7.c0.g(k3Var.f8795b);
                        k3Var.f8795b.a();
                        return;
                    }
                } finally {
                }
            }
        }
        q1 q1Var = (q1) this.f1478d;
        if (q1Var.f8935r.v()) {
            return;
        }
        List<ResolveInfo> queryIntentServices = q1Var.f8932d.getPackageManager().queryIntentServices(new Intent().setClassName(q1Var.f8932d, "com.google.android.gms.measurement.AppMeasurementService"), 65536);
        if (queryIntentServices == null || queryIntentServices.isEmpty()) {
            v0 v0Var4 = q1Var.f8937t;
            q1.l(v0Var4);
            v0Var4.f9050t.a("Unable to use remote or local measurement implementation. Please register the AppMeasurementService service in the app manifest");
            return;
        }
        Intent intent = new Intent("com.google.android.gms.measurement.START");
        intent.setComponent(new ComponentName(q1Var.f8932d, "com.google.android.gms.measurement.AppMeasurementService"));
        k3 k3Var2 = this.f8812i;
        l3 l3Var2 = k3Var2.f8796c;
        l3Var2.s();
        Context context2 = ((q1) l3Var2.f1478d).f8932d;
        f7.a b10 = f7.a.b();
        synchronized (k3Var2) {
            try {
                boolean z10 = k3Var2.f8794a;
                l3 l3Var3 = k3Var2.f8796c;
                if (z10) {
                    v0 v0Var5 = ((q1) l3Var3.f1478d).f8937t;
                    q1.l(v0Var5);
                    v0Var5.B.a("Connection attempt already in progress");
                } else {
                    v0 v0Var6 = ((q1) l3Var3.f1478d).f8937t;
                    q1.l(v0Var6);
                    v0Var6.B.a("Using local app measurement service");
                    k3Var2.f8794a = true;
                    b10.a(context2, intent, l3Var3.f8812i, 129);
                }
            } finally {
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0111  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean z() {
        s();
        t();
        if (this.f8814s == null) {
            s();
            t();
            q1 q1Var = (q1) this.f1478d;
            f1 f1Var = q1Var.f8936s;
            q1.j(f1Var);
            f1Var.s();
            boolean z10 = false;
            Boolean valueOf = !f1Var.w().contains("use_service") ? null : Boolean.valueOf(f1Var.w().getBoolean("use_service", false));
            if (valueOf == null || !valueOf.booleanValue()) {
                m0 q3 = ((q1) this.f1478d).q();
                q3.t();
                if (q3.B != 1) {
                    v0 v0Var = q1Var.f8937t;
                    q1.l(v0Var);
                    v0Var.B.a("Checking service availability");
                    p4 p4Var = q1Var.f8940w;
                    q1.j(p4Var);
                    int b10 = z6.g.f10882b.b(((q1) p4Var.f1478d).f8932d, 12451000);
                    if (b10 != 0) {
                        if (b10 == 1) {
                            v0 v0Var2 = q1Var.f8937t;
                            q1.l(v0Var2);
                            v0Var2.B.a("Service missing");
                        } else if (b10 != 2) {
                            if (b10 != 3) {
                                v0 v0Var3 = q1Var.f8937t;
                                if (b10 == 9) {
                                    q1.l(v0Var3);
                                    v0Var3.f9053w.a("Service invalid");
                                } else if (b10 != 18) {
                                    q1.l(v0Var3);
                                    v0Var3.f9053w.b(Integer.valueOf(b10), "Unexpected service status");
                                } else {
                                    q1.l(v0Var3);
                                    v0Var3.f9053w.a("Service updating");
                                }
                            } else {
                                v0 v0Var4 = q1Var.f8937t;
                                q1.l(v0Var4);
                                v0Var4.f9053w.a("Service disabled");
                            }
                            r2 = false;
                        } else {
                            v0 v0Var5 = q1Var.f8937t;
                            q1.l(v0Var5);
                            v0Var5.A.a("Service container out of date");
                            p4 p4Var2 = q1Var.f8940w;
                            q1.j(p4Var2);
                            if (p4Var2.d0() >= 17443) {
                                z10 = valueOf == null;
                                r2 = false;
                            }
                        }
                        if (z10 && q1Var.f8935r.v()) {
                            v0 v0Var6 = q1Var.f8937t;
                            q1.l(v0Var6);
                            v0Var6.f9050t.a("No way to upload. Consider using the full version of Analytics");
                        } else if (r2) {
                            f1 f1Var2 = q1Var.f8936s;
                            q1.j(f1Var2);
                            f1Var2.s();
                            SharedPreferences.Editor edit = f1Var2.w().edit();
                            edit.putBoolean("use_service", z10);
                            edit.apply();
                        }
                        r2 = z10;
                    } else {
                        v0 v0Var7 = q1Var.f8937t;
                        q1.l(v0Var7);
                        v0Var7.B.a("Service available");
                    }
                }
                z10 = true;
                if (z10) {
                }
                if (r2) {
                }
                r2 = z10;
            }
            this.f8814s = Boolean.valueOf(r2);
        }
        return this.f8814s.booleanValue();
    }
}
