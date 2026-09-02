package Q;

import H1.s;
import a1.AbstractC0223a;
import android.database.sqlite.SQLiteException;
import android.util.Log;
import androidx.work.impl.WorkDatabase_Impl;
import java.util.Collections;
import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import l5.t;
import m.C0518f;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: m, reason: collision with root package name */
    public static final String[] f1915m = {"UPDATE", "DELETE", "INSERT"};

    /* renamed from: a, reason: collision with root package name */
    public final WorkDatabase_Impl f1916a;

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f1917b;

    /* renamed from: c, reason: collision with root package name */
    public final LinkedHashMap f1918c;

    /* renamed from: d, reason: collision with root package name */
    public final String[] f1919d;

    /* renamed from: e, reason: collision with root package name */
    public final AtomicBoolean f1920e = new AtomicBoolean(false);

    /* renamed from: f, reason: collision with root package name */
    public volatile boolean f1921f;

    /* renamed from: g, reason: collision with root package name */
    public volatile V.i f1922g;

    /* renamed from: h, reason: collision with root package name */
    public final s f1923h;

    /* renamed from: i, reason: collision with root package name */
    public final C0518f f1924i;

    /* renamed from: j, reason: collision with root package name */
    public final Object f1925j;

    /* renamed from: k, reason: collision with root package name */
    public final Object f1926k;

    /* renamed from: l, reason: collision with root package name */
    public final A.b f1927l;

    public f(WorkDatabase_Impl workDatabase_Impl, HashMap hashMap, HashMap hashMap2, String... strArr) {
        String str;
        this.f1916a = workDatabase_Impl;
        this.f1917b = hashMap;
        this.f1923h = new s(strArr.length);
        kotlin.jvm.internal.i.d(Collections.newSetFromMap(new IdentityHashMap()), "newSetFromMap(IdentityHashMap())");
        this.f1924i = new C0518f();
        this.f1925j = new Object();
        this.f1926k = new Object();
        this.f1918c = new LinkedHashMap();
        int length = strArr.length;
        String[] strArr2 = new String[length];
        for (int i7 = 0; i7 < length; i7++) {
            String str2 = strArr[i7];
            Locale US = Locale.US;
            kotlin.jvm.internal.i.d(US, "US");
            String lowerCase = str2.toLowerCase(US);
            kotlin.jvm.internal.i.d(lowerCase, "this as java.lang.String).toLowerCase(locale)");
            this.f1918c.put(lowerCase, Integer.valueOf(i7));
            String str3 = (String) this.f1917b.get(strArr[i7]);
            if (str3 != null) {
                str = str3.toLowerCase(US);
                kotlin.jvm.internal.i.d(str, "this as java.lang.String).toLowerCase(locale)");
            } else {
                str = null;
            }
            if (str != null) {
                lowerCase = str;
            }
            strArr2[i7] = lowerCase;
        }
        this.f1919d = strArr2;
        for (Map.Entry entry : this.f1917b.entrySet()) {
            String str4 = (String) entry.getValue();
            Locale US2 = Locale.US;
            kotlin.jvm.internal.i.d(US2, "US");
            String lowerCase2 = str4.toLowerCase(US2);
            kotlin.jvm.internal.i.d(lowerCase2, "this as java.lang.String).toLowerCase(locale)");
            if (this.f1918c.containsKey(lowerCase2)) {
                String lowerCase3 = ((String) entry.getKey()).toLowerCase(US2);
                kotlin.jvm.internal.i.d(lowerCase3, "this as java.lang.String).toLowerCase(locale)");
                LinkedHashMap linkedHashMap = this.f1918c;
                linkedHashMap.put(lowerCase3, t.o0(linkedHashMap, lowerCase2));
            }
        }
        this.f1927l = new A.b(4, this);
    }

    public final boolean a() {
        V.c cVar = this.f1916a.f3561a;
        if (!kotlin.jvm.internal.i.a(cVar != null ? Boolean.valueOf(cVar.f2682f.isOpen()) : null, Boolean.TRUE)) {
            return false;
        }
        if (!this.f1921f) {
            this.f1916a.h().E();
        }
        if (this.f1921f) {
            return true;
        }
        Log.e("ROOM", "database is not initialized even though it is open");
        return false;
    }

    public final void b(V.c cVar, int i7) {
        cVar.h("INSERT OR IGNORE INTO room_table_modification_log VALUES(" + i7 + ", 0)");
        String str = this.f1919d[i7];
        for (int i8 = 0; i8 < 3; i8++) {
            String str2 = f1915m[i8];
            String str3 = "CREATE TEMP TRIGGER IF NOT EXISTS " + AbstractC0223a.A(str, str2) + " AFTER " + str2 + " ON `" + str + "` BEGIN UPDATE room_table_modification_log SET invalidated = 1 WHERE table_id = " + i7 + " AND invalidated = 0; END";
            kotlin.jvm.internal.i.d(str3, "StringBuilder().apply(builderAction).toString()");
            cVar.h(str3);
        }
    }

    public final void c(V.c database) {
        kotlin.jvm.internal.i.e(database, "database");
        if (database.n()) {
            return;
        }
        try {
            ReentrantReadWriteLock.ReadLock readLock = this.f1916a.f3568h.readLock();
            kotlin.jvm.internal.i.d(readLock, "readWriteLock.readLock()");
            readLock.lock();
            try {
                synchronized (this.f1925j) {
                    int[] b7 = this.f1923h.b();
                    if (b7 != null) {
                        if (database.v()) {
                            database.d();
                        } else {
                            database.a();
                        }
                        try {
                            int length = b7.length;
                            int i7 = 0;
                            int i8 = 0;
                            while (i7 < length) {
                                int i9 = b7[i7];
                                int i10 = i8 + 1;
                                if (i9 == 1) {
                                    b(database, i8);
                                } else if (i9 == 2) {
                                    String str = this.f1919d[i8];
                                    String[] strArr = f1915m;
                                    for (int i11 = 0; i11 < 3; i11++) {
                                        String str2 = "DROP TRIGGER IF EXISTS " + AbstractC0223a.A(str, strArr[i11]);
                                        kotlin.jvm.internal.i.d(str2, "StringBuilder().apply(builderAction).toString()");
                                        database.h(str2);
                                    }
                                }
                                i7++;
                                i8 = i10;
                            }
                            database.G();
                            database.g();
                        } catch (Throwable th) {
                            database.g();
                            throw th;
                        }
                    }
                }
            } finally {
                readLock.unlock();
            }
        } catch (SQLiteException e4) {
            Log.e("ROOM", "Cannot run invalidation tracker. Is the db closed?", e4);
        } catch (IllegalStateException e7) {
            Log.e("ROOM", "Cannot run invalidation tracker. Is the db closed?", e7);
        }
    }
}
