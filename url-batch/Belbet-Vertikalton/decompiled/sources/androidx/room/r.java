package androidx.room;

import android.database.sqlite.SQLiteException;
import android.util.Log;
import com.winpower.neonfit.data.AppDatabase_Impl;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.Lock;
import k0.InterfaceC0199a;
import k0.InterfaceC0203e;

/* loaded from: classes.dex */
public final class r {

    /* renamed from: n, reason: collision with root package name */
    public static final String[] f2120n = {"UPDATE", "DELETE", "INSERT"};

    /* renamed from: a, reason: collision with root package name */
    public final AppDatabase_Impl f2121a;

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f2122b;

    /* renamed from: c, reason: collision with root package name */
    public final HashMap f2123c;

    /* renamed from: d, reason: collision with root package name */
    public final LinkedHashMap f2124d;
    public final String[] e;

    /* renamed from: f, reason: collision with root package name */
    public final AtomicBoolean f2125f = new AtomicBoolean(false);

    /* renamed from: g, reason: collision with root package name */
    public volatile boolean f2126g;

    /* renamed from: h, reason: collision with root package name */
    public volatile InterfaceC0203e f2127h;
    public final p i;
    public final p.f j;

    /* renamed from: k, reason: collision with root package name */
    public final Object f2128k;

    /* renamed from: l, reason: collision with root package name */
    public final Object f2129l;

    /* renamed from: m, reason: collision with root package name */
    public final C1.e f2130m;

    public r(AppDatabase_Impl appDatabase_Impl, HashMap hashMap, HashMap hashMap2, String... strArr) {
        String str;
        this.f2121a = appDatabase_Impl;
        this.f2122b = hashMap;
        this.f2123c = hashMap2;
        this.i = new p(strArr.length);
        j1.h.d(Collections.newSetFromMap(new IdentityHashMap()), "newSetFromMap(IdentityHashMap())");
        this.j = new p.f();
        this.f2128k = new Object();
        this.f2129l = new Object();
        this.f2124d = new LinkedHashMap();
        int length = strArr.length;
        String[] strArr2 = new String[length];
        for (int i = 0; i < length; i++) {
            String str2 = strArr[i];
            Locale locale = Locale.US;
            j1.h.d(locale, "US");
            String lowerCase = str2.toLowerCase(locale);
            j1.h.d(lowerCase, "this as java.lang.String).toLowerCase(locale)");
            this.f2124d.put(lowerCase, Integer.valueOf(i));
            String str3 = (String) this.f2122b.get(strArr[i]);
            if (str3 != null) {
                str = str3.toLowerCase(locale);
                j1.h.d(str, "this as java.lang.String).toLowerCase(locale)");
            } else {
                str = null;
            }
            if (str != null) {
                lowerCase = str;
            }
            strArr2[i] = lowerCase;
        }
        this.e = strArr2;
        for (Map.Entry entry : this.f2122b.entrySet()) {
            String str4 = (String) entry.getValue();
            Locale locale2 = Locale.US;
            j1.h.d(locale2, "US");
            String lowerCase2 = str4.toLowerCase(locale2);
            j1.h.d(lowerCase2, "this as java.lang.String).toLowerCase(locale)");
            if (this.f2124d.containsKey(lowerCase2)) {
                String lowerCase3 = ((String) entry.getKey()).toLowerCase(locale2);
                j1.h.d(lowerCase3, "this as java.lang.String).toLowerCase(locale)");
                LinkedHashMap linkedHashMap = this.f2124d;
                j1.h.e(linkedHashMap, "<this>");
                Object obj = linkedHashMap.get(lowerCase2);
                if (obj == null && !linkedHashMap.containsKey(lowerCase2)) {
                    throw new NoSuchElementException("Key " + ((Object) lowerCase2) + " is missing in the map.");
                }
                linkedHashMap.put(lowerCase3, obj);
            }
        }
        this.f2130m = new C1.e(7, this);
    }

    public final boolean a() {
        if (!this.f2121a.isOpenInternal()) {
            return false;
        }
        if (!this.f2126g) {
            ((l0.h) this.f2121a.getOpenHelper()).d();
        }
        if (this.f2126g) {
            return true;
        }
        Log.e("ROOM", "database is not initialized even though it is open");
        return false;
    }

    public final void b(B1.c cVar) {
        q qVar;
        boolean z2;
        synchronized (this.j) {
            qVar = (q) this.j.b(cVar);
        }
        if (qVar != null) {
            p pVar = this.i;
            int[] iArr = qVar.f2117b;
            int[] copyOf = Arrays.copyOf(iArr, iArr.length);
            pVar.getClass();
            j1.h.e(copyOf, "tableIds");
            synchronized (pVar) {
                z2 = false;
                for (int i : copyOf) {
                    long[] jArr = pVar.f2112a;
                    long j = jArr[i];
                    jArr[i] = j - 1;
                    if (j == 1) {
                        z2 = true;
                        pVar.f2115d = true;
                    }
                }
            }
            if (z2) {
                AppDatabase_Impl appDatabase_Impl = this.f2121a;
                if (appDatabase_Impl.isOpenInternal()) {
                    d(((l0.h) appDatabase_Impl.getOpenHelper()).d());
                }
            }
        }
    }

    public final void c(InterfaceC0199a interfaceC0199a, int i) {
        interfaceC0199a.r("INSERT OR IGNORE INTO room_table_modification_log VALUES(" + i + ", 0)");
        String str = this.e[i];
        String[] strArr = f2120n;
        for (int i2 = 0; i2 < 3; i2++) {
            String str2 = strArr[i2];
            String str3 = "CREATE TEMP TRIGGER IF NOT EXISTS " + i.c(str, str2) + " AFTER " + str2 + " ON `" + str + "` BEGIN UPDATE room_table_modification_log SET invalidated = 1 WHERE table_id = " + i + " AND invalidated = 0; END";
            j1.h.d(str3, "StringBuilder().apply(builderAction).toString()");
            interfaceC0199a.r(str3);
        }
    }

    public final void d(InterfaceC0199a interfaceC0199a) {
        j1.h.e(interfaceC0199a, "database");
        if (interfaceC0199a.x()) {
            return;
        }
        try {
            Lock closeLock$room_runtime_release = this.f2121a.getCloseLock$room_runtime_release();
            closeLock$room_runtime_release.lock();
            try {
                synchronized (this.f2128k) {
                    int[] a2 = this.i.a();
                    if (a2 == null) {
                        return;
                    }
                    if (interfaceC0199a.o()) {
                        interfaceC0199a.c();
                    } else {
                        interfaceC0199a.f();
                    }
                    try {
                        int length = a2.length;
                        int i = 0;
                        int i2 = 0;
                        while (i < length) {
                            int i3 = a2[i];
                            int i4 = i2 + 1;
                            if (i3 == 1) {
                                c(interfaceC0199a, i2);
                            } else if (i3 == 2) {
                                String str = this.e[i2];
                                String[] strArr = f2120n;
                                for (int i5 = 0; i5 < 3; i5++) {
                                    String str2 = "DROP TRIGGER IF EXISTS " + i.c(str, strArr[i5]);
                                    j1.h.d(str2, "StringBuilder().apply(builderAction).toString()");
                                    interfaceC0199a.r(str2);
                                }
                            }
                            i++;
                            i2 = i4;
                        }
                        interfaceC0199a.w();
                        interfaceC0199a.e();
                    } catch (Throwable th) {
                        interfaceC0199a.e();
                        throw th;
                    }
                }
            } finally {
                closeLock$room_runtime_release.unlock();
            }
        } catch (SQLiteException e) {
            Log.e("ROOM", "Cannot run invalidation tracker. Is the db closed?", e);
        } catch (IllegalStateException e2) {
            Log.e("ROOM", "Cannot run invalidation tracker. Is the db closed?", e2);
        }
    }
}
