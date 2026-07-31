package w1;

import I.S;
import android.database.sqlite.SQLiteException;
import android.util.Log;
import com.gatesof.olympus.martu.marku.data.db.AppDatabase_Impl;
import h2.AbstractC0508a;
import i.C0511c;
import i.C0514f;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* loaded from: classes.dex */
public final class q {

    /* renamed from: n, reason: collision with root package name */
    public static final String[] f9888n = {"UPDATE", "DELETE", "INSERT"};

    /* renamed from: a, reason: collision with root package name */
    public final AppDatabase_Impl f9889a;

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f9890b;

    /* renamed from: c, reason: collision with root package name */
    public final HashMap f9891c;

    /* renamed from: d, reason: collision with root package name */
    public final LinkedHashMap f9892d;

    /* renamed from: e, reason: collision with root package name */
    public final String[] f9893e;

    /* renamed from: f, reason: collision with root package name */
    public final AtomicBoolean f9894f = new AtomicBoolean(false);

    /* renamed from: g, reason: collision with root package name */
    public volatile boolean f9895g;

    /* renamed from: h, reason: collision with root package name */
    public volatile A1.k f9896h;

    /* renamed from: i, reason: collision with root package name */
    public final S f9897i;

    /* renamed from: j, reason: collision with root package name */
    public final C0514f f9898j;

    /* renamed from: k, reason: collision with root package name */
    public final Object f9899k;

    /* renamed from: l, reason: collision with root package name */
    public final Object f9900l;

    /* renamed from: m, reason: collision with root package name */
    public final J2.d f9901m;

    public q(AppDatabase_Impl appDatabase_Impl, HashMap hashMap, HashMap hashMap2, String... strArr) {
        String str;
        this.f9889a = appDatabase_Impl;
        this.f9890b = hashMap;
        this.f9891c = hashMap2;
        this.f9897i = new S(strArr.length);
        f2.j.e(Collections.newSetFromMap(new IdentityHashMap()), "newSetFromMap(IdentityHashMap())");
        this.f9898j = new C0514f();
        this.f9899k = new Object();
        this.f9900l = new Object();
        this.f9892d = new LinkedHashMap();
        int length = strArr.length;
        String[] strArr2 = new String[length];
        for (int i3 = 0; i3 < length; i3++) {
            String str2 = strArr[i3];
            Locale locale = Locale.US;
            f2.j.e(locale, "US");
            String lowerCase = str2.toLowerCase(locale);
            f2.j.e(lowerCase, "this as java.lang.String).toLowerCase(locale)");
            this.f9892d.put(lowerCase, Integer.valueOf(i3));
            String str3 = (String) this.f9890b.get(strArr[i3]);
            if (str3 != null) {
                str = str3.toLowerCase(locale);
                f2.j.e(str, "this as java.lang.String).toLowerCase(locale)");
            } else {
                str = null;
            }
            if (str != null) {
                lowerCase = str;
            }
            strArr2[i3] = lowerCase;
        }
        this.f9893e = strArr2;
        for (Map.Entry entry : this.f9890b.entrySet()) {
            String str4 = (String) entry.getValue();
            Locale locale2 = Locale.US;
            f2.j.e(locale2, "US");
            String lowerCase2 = str4.toLowerCase(locale2);
            f2.j.e(lowerCase2, "this as java.lang.String).toLowerCase(locale)");
            if (this.f9892d.containsKey(lowerCase2)) {
                String lowerCase3 = ((String) entry.getKey()).toLowerCase(locale2);
                f2.j.e(lowerCase3, "this as java.lang.String).toLowerCase(locale)");
                LinkedHashMap linkedHashMap = this.f9892d;
                linkedHashMap.put(lowerCase3, S1.B.I(lowerCase2, linkedHashMap));
            }
        }
        this.f9901m = new J2.d(2, this);
    }

    public final void a(o oVar) {
        Object obj;
        p pVar;
        boolean z3;
        String[] strArr = oVar.f9883a;
        T1.h hVar = new T1.h();
        for (String str : strArr) {
            Locale locale = Locale.US;
            f2.j.e(locale, "US");
            String lowerCase = str.toLowerCase(locale);
            f2.j.e(lowerCase, "this as java.lang.String).toLowerCase(locale)");
            HashMap hashMap = this.f9891c;
            if (hashMap.containsKey(lowerCase)) {
                String lowerCase2 = str.toLowerCase(locale);
                f2.j.e(lowerCase2, "this as java.lang.String).toLowerCase(locale)");
                Object obj2 = hashMap.get(lowerCase2);
                f2.j.c(obj2);
                hVar.addAll((Collection) obj2);
            } else {
                hVar.add(str);
            }
        }
        String[] strArr2 = (String[]) AbstractC0508a.q(hVar).toArray(new String[0]);
        ArrayList arrayList = new ArrayList(strArr2.length);
        for (String str2 : strArr2) {
            LinkedHashMap linkedHashMap = this.f9892d;
            Locale locale2 = Locale.US;
            f2.j.e(locale2, "US");
            String lowerCase3 = str2.toLowerCase(locale2);
            f2.j.e(lowerCase3, "this as java.lang.String).toLowerCase(locale)");
            Integer num = (Integer) linkedHashMap.get(lowerCase3);
            if (num == null) {
                throw new IllegalArgumentException("There is no table with name ".concat(str2));
            }
            arrayList.add(num);
        }
        int[] Z02 = S1.l.Z0(arrayList);
        p pVar2 = new p(oVar, Z02, strArr2);
        synchronized (this.f9898j) {
            C0514f c0514f = this.f9898j;
            C0511c b3 = c0514f.b(oVar);
            if (b3 != null) {
                obj = b3.f6227e;
            } else {
                C0511c c0511c = new C0511c(oVar, pVar2);
                c0514f.f6236g++;
                C0511c c0511c2 = c0514f.f6234e;
                if (c0511c2 == null) {
                    c0514f.f6233d = c0511c;
                    c0514f.f6234e = c0511c;
                } else {
                    c0511c2.f6228f = c0511c;
                    c0511c.f6229g = c0511c2;
                    c0514f.f6234e = c0511c;
                }
                obj = null;
            }
            pVar = (p) obj;
        }
        if (pVar == null) {
            S s3 = this.f9897i;
            int[] copyOf = Arrays.copyOf(Z02, Z02.length);
            s3.getClass();
            f2.j.f(copyOf, "tableIds");
            synchronized (s3) {
                z3 = false;
                for (int i3 : copyOf) {
                    long[] jArr = (long[]) s3.f2753b;
                    long j3 = jArr[i3];
                    jArr[i3] = 1 + j3;
                    if (j3 == 0) {
                        s3.f2752a = true;
                        z3 = true;
                    }
                }
            }
            if (z3) {
                AppDatabase_Impl appDatabase_Impl = this.f9889a;
                if (appDatabase_Impl.j()) {
                    e(appDatabase_Impl.g().t());
                }
            }
        }
    }

    public final boolean b() {
        if (!this.f9889a.j()) {
            return false;
        }
        if (!this.f9895g) {
            this.f9889a.g().t();
        }
        if (this.f9895g) {
            return true;
        }
        Log.e("ROOM", "database is not initialized even though it is open");
        return false;
    }

    public final void c(o oVar) {
        p pVar;
        boolean z3;
        synchronized (this.f9898j) {
            pVar = (p) this.f9898j.c(oVar);
        }
        if (pVar != null) {
            S s3 = this.f9897i;
            int[] iArr = pVar.f9885b;
            int[] copyOf = Arrays.copyOf(iArr, iArr.length);
            s3.getClass();
            f2.j.f(copyOf, "tableIds");
            synchronized (s3) {
                z3 = false;
                for (int i3 : copyOf) {
                    long[] jArr = (long[]) s3.f2753b;
                    long j3 = jArr[i3];
                    jArr[i3] = j3 - 1;
                    if (j3 == 1) {
                        z3 = true;
                        s3.f2752a = true;
                    }
                }
            }
            if (z3) {
                AppDatabase_Impl appDatabase_Impl = this.f9889a;
                if (appDatabase_Impl.j()) {
                    e(appDatabase_Impl.g().t());
                }
            }
        }
    }

    public final void d(A1.c cVar, int i3) {
        cVar.g("INSERT OR IGNORE INTO room_table_modification_log VALUES(" + i3 + ", 0)");
        String str = this.f9893e[i3];
        String[] strArr = f9888n;
        for (int i4 = 0; i4 < 3; i4++) {
            String str2 = strArr[i4];
            String str3 = "CREATE TEMP TRIGGER IF NOT EXISTS " + h.c(str, str2) + " AFTER " + str2 + " ON `" + str + "` BEGIN UPDATE room_table_modification_log SET invalidated = 1 WHERE table_id = " + i3 + " AND invalidated = 0; END";
            f2.j.e(str3, "StringBuilder().apply(builderAction).toString()");
            cVar.g(str3);
        }
    }

    public final void e(A1.c cVar) {
        f2.j.f(cVar, "database");
        if (cVar.h()) {
            return;
        }
        try {
            ReentrantReadWriteLock.ReadLock readLock = this.f9889a.f9926h.readLock();
            f2.j.e(readLock, "readWriteLock.readLock()");
            readLock.lock();
            try {
                synchronized (this.f9899k) {
                    int[] a3 = this.f9897i.a();
                    if (a3 == null) {
                        return;
                    }
                    if (cVar.l()) {
                        cVar.b();
                    } else {
                        cVar.a();
                    }
                    try {
                        int length = a3.length;
                        int i3 = 0;
                        int i4 = 0;
                        while (i3 < length) {
                            int i5 = a3[i3];
                            int i6 = i4 + 1;
                            if (i5 == 1) {
                                d(cVar, i4);
                            } else if (i5 == 2) {
                                String str = this.f9893e[i4];
                                String[] strArr = f9888n;
                                for (int i7 = 0; i7 < 3; i7++) {
                                    String str2 = "DROP TRIGGER IF EXISTS " + h.c(str, strArr[i7]);
                                    f2.j.e(str2, "StringBuilder().apply(builderAction).toString()");
                                    cVar.g(str2);
                                }
                            }
                            i3++;
                            i4 = i6;
                        }
                        cVar.r();
                        cVar.e();
                    } catch (Throwable th) {
                        cVar.e();
                        throw th;
                    }
                }
            } finally {
                readLock.unlock();
            }
        } catch (SQLiteException e3) {
            Log.e("ROOM", "Cannot run invalidation tracker. Is the db closed?", e3);
        } catch (IllegalStateException e4) {
            Log.e("ROOM", "Cannot run invalidation tracker. Is the db closed?", e4);
        }
    }
}
