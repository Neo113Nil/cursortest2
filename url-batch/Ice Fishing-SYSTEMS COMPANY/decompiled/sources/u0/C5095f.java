package u0;

import android.database.sqlite.SQLiteException;
import android.util.Log;
import androidx.work.impl.WorkDatabase_Impl;
import com.bumptech.glide.manager.n;
import java.util.Collections;
import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import o.C4823f;
import q2.R0;
import r7.t;
import z0.C5260c;
import z0.C5266i;

/* renamed from: u0.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5095f {

    /* renamed from: m, reason: collision with root package name */
    public static final String[] f41015m = {"UPDATE", "DELETE", "INSERT"};

    /* renamed from: a, reason: collision with root package name */
    public final WorkDatabase_Impl f41016a;

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f41017b;

    /* renamed from: c, reason: collision with root package name */
    public final LinkedHashMap f41018c;

    /* renamed from: d, reason: collision with root package name */
    public final String[] f41019d;

    /* renamed from: e, reason: collision with root package name */
    public final AtomicBoolean f41020e = new AtomicBoolean(false);

    /* renamed from: f, reason: collision with root package name */
    public volatile boolean f41021f;

    /* renamed from: g, reason: collision with root package name */
    public volatile C5266i f41022g;

    /* renamed from: h, reason: collision with root package name */
    public final n f41023h;
    public final C4823f i;

    /* renamed from: j, reason: collision with root package name */
    public final Object f41024j;

    /* renamed from: k, reason: collision with root package name */
    public final Object f41025k;

    /* renamed from: l, reason: collision with root package name */
    public final R0 f41026l;

    public C5095f(WorkDatabase_Impl workDatabase_Impl, HashMap hashMap, HashMap hashMap2, String... strArr) {
        String str;
        this.f41016a = workDatabase_Impl;
        this.f41017b = hashMap;
        this.f41023h = new n(strArr.length);
        kotlin.jvm.internal.h.d(Collections.newSetFromMap(new IdentityHashMap()), "newSetFromMap(IdentityHashMap())");
        this.i = new C4823f();
        this.f41024j = new Object();
        this.f41025k = new Object();
        this.f41018c = new LinkedHashMap();
        int length = strArr.length;
        String[] strArr2 = new String[length];
        for (int i = 0; i < length; i++) {
            String str2 = strArr[i];
            Locale US = Locale.US;
            kotlin.jvm.internal.h.d(US, "US");
            String lowerCase = str2.toLowerCase(US);
            kotlin.jvm.internal.h.d(lowerCase, "this as java.lang.String).toLowerCase(locale)");
            this.f41018c.put(lowerCase, Integer.valueOf(i));
            String str3 = (String) this.f41017b.get(strArr[i]);
            if (str3 != null) {
                str = str3.toLowerCase(US);
                kotlin.jvm.internal.h.d(str, "this as java.lang.String).toLowerCase(locale)");
            } else {
                str = null;
            }
            if (str != null) {
                lowerCase = str;
            }
            strArr2[i] = lowerCase;
        }
        this.f41019d = strArr2;
        for (Map.Entry entry : this.f41017b.entrySet()) {
            String str4 = (String) entry.getValue();
            Locale US2 = Locale.US;
            kotlin.jvm.internal.h.d(US2, "US");
            String lowerCase2 = str4.toLowerCase(US2);
            kotlin.jvm.internal.h.d(lowerCase2, "this as java.lang.String).toLowerCase(locale)");
            if (this.f41018c.containsKey(lowerCase2)) {
                String lowerCase3 = ((String) entry.getKey()).toLowerCase(US2);
                kotlin.jvm.internal.h.d(lowerCase3, "this as java.lang.String).toLowerCase(locale)");
                LinkedHashMap linkedHashMap = this.f41018c;
                linkedHashMap.put(lowerCase3, t.y(lowerCase2, linkedHashMap));
            }
        }
        this.f41026l = new R0(9, this);
    }

    public final boolean a() {
        C5260c c5260c = this.f41016a.f5478a;
        if (!kotlin.jvm.internal.h.a(c5260c != null ? Boolean.valueOf(c5260c.f42109n.isOpen()) : null, Boolean.TRUE)) {
            return false;
        }
        if (!this.f41021f) {
            this.f41016a.h().R();
        }
        if (this.f41021f) {
            return true;
        }
        Log.e("ROOM", "database is not initialized even though it is open");
        return false;
    }

    public final void b(C5260c c5260c, int i) {
        c5260c.A("INSERT OR IGNORE INTO room_table_modification_log VALUES(" + i + ", 0)");
        String str = this.f41019d[i];
        String[] strArr = f41015m;
        for (int i4 = 0; i4 < 3; i4++) {
            String str2 = strArr[i4];
            String str3 = "CREATE TEMP TRIGGER IF NOT EXISTS " + W2.e.f(str, str2) + " AFTER " + str2 + " ON `" + str + "` BEGIN UPDATE room_table_modification_log SET invalidated = 1 WHERE table_id = " + i + " AND invalidated = 0; END";
            kotlin.jvm.internal.h.d(str3, "StringBuilder().apply(builderAction).toString()");
            c5260c.A(str3);
        }
    }

    public final void c(C5260c database) {
        kotlin.jvm.internal.h.e(database, "database");
        if (database.C()) {
            return;
        }
        try {
            ReentrantReadWriteLock.ReadLock readLock = this.f41016a.f5485h.readLock();
            kotlin.jvm.internal.h.d(readLock, "readWriteLock.readLock()");
            readLock.lock();
            try {
                synchronized (this.f41024j) {
                    int[] d2 = this.f41023h.d();
                    if (d2 != null) {
                        if (database.D()) {
                            database.j();
                        } else {
                            database.b();
                        }
                        try {
                            int length = d2.length;
                            int i = 0;
                            int i4 = 0;
                            while (i < length) {
                                int i9 = d2[i];
                                int i10 = i4 + 1;
                                if (i9 == 1) {
                                    b(database, i4);
                                } else if (i9 == 2) {
                                    String str = this.f41019d[i4];
                                    String[] strArr = f41015m;
                                    for (int i11 = 0; i11 < 3; i11++) {
                                        String str2 = "DROP TRIGGER IF EXISTS " + W2.e.f(str, strArr[i11]);
                                        kotlin.jvm.internal.h.d(str2, "StringBuilder().apply(builderAction).toString()");
                                        database.A(str2);
                                    }
                                }
                                i++;
                                i4 = i10;
                            }
                            database.G();
                            database.z();
                        } catch (Throwable th) {
                            database.z();
                            throw th;
                        }
                    }
                }
            } finally {
                readLock.unlock();
            }
        } catch (SQLiteException e6) {
            Log.e("ROOM", "Cannot run invalidation tracker. Is the db closed?", e6);
        } catch (IllegalStateException e9) {
            Log.e("ROOM", "Cannot run invalidation tracker. Is the db closed?", e9);
        }
    }
}
