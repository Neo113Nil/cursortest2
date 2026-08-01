package h0;

import android.database.sqlite.SQLiteException;
import android.util.Log;
import com.fortunequest.neontrack.data.FortuneQuestDatabase_Impl;
import java.util.Collections;
import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import l0.C0276c;
import l0.C0283j;

/* loaded from: classes.dex */
public final class l {

    /* renamed from: m, reason: collision with root package name */
    public static final String[] f2970m = {"UPDATE", "DELETE", "INSERT"};

    /* renamed from: a, reason: collision with root package name */
    public final FortuneQuestDatabase_Impl f2971a;

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f2972b;

    /* renamed from: c, reason: collision with root package name */
    public final LinkedHashMap f2973c;
    public final String[] d;

    /* renamed from: e, reason: collision with root package name */
    public final AtomicBoolean f2974e = new AtomicBoolean(false);

    /* renamed from: f, reason: collision with root package name */
    public volatile boolean f2975f;

    /* renamed from: g, reason: collision with root package name */
    public volatile C0283j f2976g;
    public final j h;
    public final n.f i;

    /* renamed from: j, reason: collision with root package name */
    public final Object f2977j;

    /* renamed from: k, reason: collision with root package name */
    public final Object f2978k;

    /* renamed from: l, reason: collision with root package name */
    public final C0.i f2979l;

    public l(FortuneQuestDatabase_Impl fortuneQuestDatabase_Impl, HashMap hashMap, HashMap hashMap2, String... strArr) {
        String str;
        this.f2971a = fortuneQuestDatabase_Impl;
        this.f2972b = hashMap;
        this.h = new j(strArr.length);
        k1.e.d(Collections.newSetFromMap(new IdentityHashMap()), "newSetFromMap(IdentityHashMap())");
        this.i = new n.f();
        this.f2977j = new Object();
        this.f2978k = new Object();
        this.f2973c = new LinkedHashMap();
        int length = strArr.length;
        String[] strArr2 = new String[length];
        for (int i = 0; i < length; i++) {
            String str2 = strArr[i];
            Locale locale = Locale.US;
            k1.e.d(locale, "US");
            String lowerCase = str2.toLowerCase(locale);
            k1.e.d(lowerCase, "this as java.lang.String).toLowerCase(locale)");
            this.f2973c.put(lowerCase, Integer.valueOf(i));
            String str3 = (String) this.f2972b.get(strArr[i]);
            if (str3 != null) {
                str = str3.toLowerCase(locale);
                k1.e.d(str, "this as java.lang.String).toLowerCase(locale)");
            } else {
                str = null;
            }
            if (str != null) {
                lowerCase = str;
            }
            strArr2[i] = lowerCase;
        }
        this.d = strArr2;
        for (Map.Entry entry : this.f2972b.entrySet()) {
            String str4 = (String) entry.getValue();
            Locale locale2 = Locale.US;
            k1.e.d(locale2, "US");
            String lowerCase2 = str4.toLowerCase(locale2);
            k1.e.d(lowerCase2, "this as java.lang.String).toLowerCase(locale)");
            if (this.f2973c.containsKey(lowerCase2)) {
                String lowerCase3 = ((String) entry.getKey()).toLowerCase(locale2);
                k1.e.d(lowerCase3, "this as java.lang.String).toLowerCase(locale)");
                LinkedHashMap linkedHashMap = this.f2973c;
                k1.e.e(linkedHashMap, "<this>");
                Object obj = linkedHashMap.get(lowerCase2);
                if (obj == null && !linkedHashMap.containsKey(lowerCase2)) {
                    throw new NoSuchElementException("Key " + ((Object) lowerCase2) + " is missing in the map.");
                }
                linkedHashMap.put(lowerCase3, obj);
            }
        }
        this.f2979l = new C0.i(11, this);
    }

    public final boolean a() {
        if (!this.f2971a.k()) {
            return false;
        }
        if (!this.f2975f) {
            this.f2971a.f().m();
        }
        if (this.f2975f) {
            return true;
        }
        Log.e("ROOM", "database is not initialized even though it is open");
        return false;
    }

    public final void b(C0276c c0276c, int i) {
        c0276c.p("INSERT OR IGNORE INTO room_table_modification_log VALUES(" + i + ", 0)");
        String str = this.d[i];
        String[] strArr = f2970m;
        for (int i2 = 0; i2 < 3; i2++) {
            String str2 = strArr[i2];
            String str3 = "CREATE TEMP TRIGGER IF NOT EXISTS " + e.c(str, str2) + " AFTER " + str2 + " ON `" + str + "` BEGIN UPDATE room_table_modification_log SET invalidated = 1 WHERE table_id = " + i + " AND invalidated = 0; END";
            k1.e.d(str3, "StringBuilder().apply(builderAction).toString()");
            c0276c.p(str3);
        }
    }

    public final void c(C0276c c0276c) {
        k1.e.e(c0276c, "database");
        if (c0276c.r()) {
            return;
        }
        try {
            ReentrantReadWriteLock.ReadLock readLock = this.f2971a.h.readLock();
            k1.e.d(readLock, "readWriteLock.readLock()");
            readLock.lock();
            try {
                synchronized (this.f2977j) {
                    int[] a2 = this.h.a();
                    if (a2 == null) {
                        return;
                    }
                    if (c0276c.s()) {
                        c0276c.d();
                    } else {
                        c0276c.a();
                    }
                    try {
                        int length = a2.length;
                        int i = 0;
                        int i2 = 0;
                        while (i < length) {
                            int i3 = a2[i];
                            int i4 = i2 + 1;
                            if (i3 == 1) {
                                b(c0276c, i2);
                            } else if (i3 == 2) {
                                String str = this.d[i2];
                                String[] strArr = f2970m;
                                for (int i5 = 0; i5 < 3; i5++) {
                                    String str2 = "DROP TRIGGER IF EXISTS " + e.c(str, strArr[i5]);
                                    k1.e.d(str2, "StringBuilder().apply(builderAction).toString()");
                                    c0276c.p(str2);
                                }
                            }
                            i++;
                            i2 = i4;
                        }
                        c0276c.v();
                        c0276c.k();
                    } catch (Throwable th) {
                        c0276c.k();
                        throw th;
                    }
                }
            } finally {
                readLock.unlock();
            }
        } catch (SQLiteException e2) {
            Log.e("ROOM", "Cannot run invalidation tracker. Is the db closed?", e2);
        } catch (IllegalStateException e3) {
            Log.e("ROOM", "Cannot run invalidation tracker. Is the db closed?", e3);
        }
    }
}
