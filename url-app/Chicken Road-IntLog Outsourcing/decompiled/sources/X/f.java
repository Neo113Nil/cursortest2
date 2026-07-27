package X;

import M2.L;
import android.database.sqlite.SQLiteException;
import android.util.Log;
import androidx.work.impl.WorkDatabase_Impl;
import c0.C0301c;
import c0.C0307i;
import g4.AbstractC0476u;
import java.util.Collections;
import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import n2.AbstractC1341c;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: m, reason: collision with root package name */
    public static final String[] f3459m = {"UPDATE", "DELETE", "INSERT"};

    /* renamed from: a, reason: collision with root package name */
    public final WorkDatabase_Impl f3460a;

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f3461b;

    /* renamed from: c, reason: collision with root package name */
    public final LinkedHashMap f3462c;

    /* renamed from: d, reason: collision with root package name */
    public final String[] f3463d;

    /* renamed from: e, reason: collision with root package name */
    public final AtomicBoolean f3464e = new AtomicBoolean(false);

    /* renamed from: f, reason: collision with root package name */
    public volatile boolean f3465f;

    /* renamed from: g, reason: collision with root package name */
    public volatile C0307i f3466g;

    /* renamed from: h, reason: collision with root package name */
    public final L f3467h;

    /* renamed from: i, reason: collision with root package name */
    public final n.f f3468i;

    /* renamed from: j, reason: collision with root package name */
    public final Object f3469j;

    /* renamed from: k, reason: collision with root package name */
    public final Object f3470k;

    /* renamed from: l, reason: collision with root package name */
    public final B.a f3471l;

    public f(WorkDatabase_Impl workDatabase_Impl, HashMap hashMap, HashMap hashMap2, String... strArr) {
        String str;
        this.f3460a = workDatabase_Impl;
        this.f3461b = hashMap;
        this.f3467h = new L(strArr.length);
        kotlin.jvm.internal.i.d(Collections.newSetFromMap(new IdentityHashMap()), "newSetFromMap(IdentityHashMap())");
        this.f3468i = new n.f();
        this.f3469j = new Object();
        this.f3470k = new Object();
        this.f3462c = new LinkedHashMap();
        int length = strArr.length;
        String[] strArr2 = new String[length];
        for (int i2 = 0; i2 < length; i2++) {
            String str2 = strArr[i2];
            Locale US = Locale.US;
            kotlin.jvm.internal.i.d(US, "US");
            String lowerCase = str2.toLowerCase(US);
            kotlin.jvm.internal.i.d(lowerCase, "this as java.lang.String).toLowerCase(locale)");
            this.f3462c.put(lowerCase, Integer.valueOf(i2));
            String str3 = (String) this.f3461b.get(strArr[i2]);
            if (str3 != null) {
                str = str3.toLowerCase(US);
                kotlin.jvm.internal.i.d(str, "this as java.lang.String).toLowerCase(locale)");
            } else {
                str = null;
            }
            if (str != null) {
                lowerCase = str;
            }
            strArr2[i2] = lowerCase;
        }
        this.f3463d = strArr2;
        for (Map.Entry entry : this.f3461b.entrySet()) {
            String str4 = (String) entry.getValue();
            Locale US2 = Locale.US;
            kotlin.jvm.internal.i.d(US2, "US");
            String lowerCase2 = str4.toLowerCase(US2);
            kotlin.jvm.internal.i.d(lowerCase2, "this as java.lang.String).toLowerCase(locale)");
            if (this.f3462c.containsKey(lowerCase2)) {
                String lowerCase3 = ((String) entry.getKey()).toLowerCase(US2);
                kotlin.jvm.internal.i.d(lowerCase3, "this as java.lang.String).toLowerCase(locale)");
                LinkedHashMap linkedHashMap = this.f3462c;
                linkedHashMap.put(lowerCase3, AbstractC0476u.U(linkedHashMap, lowerCase2));
            }
        }
        this.f3471l = new B.a(12, this);
    }

    public final boolean a() {
        C0301c c0301c = this.f3460a.f4719a;
        if (!kotlin.jvm.internal.i.a(c0301c != null ? Boolean.valueOf(c0301c.f4870a.isOpen()) : null, Boolean.TRUE)) {
            return false;
        }
        if (!this.f3465f) {
            this.f3460a.h().z();
        }
        if (this.f3465f) {
            return true;
        }
        Log.e("ROOM", "database is not initialized even though it is open");
        return false;
    }

    public final void b(C0301c c0301c, int i2) {
        c0301c.o("INSERT OR IGNORE INTO room_table_modification_log VALUES(" + i2 + ", 0)");
        String str = this.f3463d[i2];
        String[] strArr = f3459m;
        for (int i3 = 0; i3 < 3; i3++) {
            String str2 = strArr[i3];
            String str3 = "CREATE TEMP TRIGGER IF NOT EXISTS " + AbstractC1341c.t(str, str2) + " AFTER " + str2 + " ON `" + str + "` BEGIN UPDATE room_table_modification_log SET invalidated = 1 WHERE table_id = " + i2 + " AND invalidated = 0; END";
            kotlin.jvm.internal.i.d(str3, "StringBuilder().apply(builderAction).toString()");
            c0301c.o(str3);
        }
    }

    public final void c(C0301c database) {
        kotlin.jvm.internal.i.e(database, "database");
        if (database.q()) {
            return;
        }
        try {
            ReentrantReadWriteLock.ReadLock readLock = this.f3460a.f4726h.readLock();
            kotlin.jvm.internal.i.d(readLock, "readWriteLock.readLock()");
            readLock.lock();
            try {
                synchronized (this.f3469j) {
                    int[] a6 = this.f3467h.a();
                    if (a6 == null) {
                        return;
                    }
                    if (database.y()) {
                        database.b();
                    } else {
                        database.a();
                    }
                    try {
                        int length = a6.length;
                        int i2 = 0;
                        int i3 = 0;
                        while (i2 < length) {
                            int i6 = a6[i2];
                            int i7 = i3 + 1;
                            if (i6 == 1) {
                                b(database, i3);
                            } else if (i6 == 2) {
                                String str = this.f3463d[i3];
                                String[] strArr = f3459m;
                                for (int i8 = 0; i8 < 3; i8++) {
                                    String str2 = "DROP TRIGGER IF EXISTS " + AbstractC1341c.t(str, strArr[i8]);
                                    kotlin.jvm.internal.i.d(str2, "StringBuilder().apply(builderAction).toString()");
                                    database.o(str2);
                                }
                            }
                            i2++;
                            i3 = i7;
                        }
                        database.D();
                        database.g();
                    } catch (Throwable th) {
                        database.g();
                        throw th;
                    }
                }
            } finally {
                readLock.unlock();
            }
        } catch (SQLiteException e3) {
            Log.e("ROOM", "Cannot run invalidation tracker. Is the db closed?", e3);
        } catch (IllegalStateException e6) {
            Log.e("ROOM", "Cannot run invalidation tracker. Is the db closed?", e6);
        }
    }
}
