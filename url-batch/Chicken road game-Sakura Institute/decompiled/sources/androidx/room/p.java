package androidx.room;

import android.database.sqlite.SQLiteException;
import android.util.Log;
import com.chicken.road.whale.store.PlanDatabase_Impl;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.Lock;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class p {

    /* renamed from: n, reason: collision with root package name */
    public static final String[] f1103n = {"UPDATE", "DELETE", "INSERT"};

    /* renamed from: a, reason: collision with root package name */
    public final PlanDatabase_Impl f1104a;

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f1105b;

    /* renamed from: c, reason: collision with root package name */
    public final HashMap f1106c;

    /* renamed from: d, reason: collision with root package name */
    public final LinkedHashMap f1107d;

    /* renamed from: e, reason: collision with root package name */
    public final String[] f1108e;

    /* renamed from: f, reason: collision with root package name */
    public final AtomicBoolean f1109f = new AtomicBoolean(false);

    /* renamed from: g, reason: collision with root package name */
    public volatile boolean f1110g;

    /* renamed from: h, reason: collision with root package name */
    public volatile y3.e f1111h;

    /* renamed from: i, reason: collision with root package name */
    public final m f1112i;

    /* renamed from: j, reason: collision with root package name */
    public final h.f f1113j;

    /* renamed from: k, reason: collision with root package name */
    public final Object f1114k;

    /* renamed from: l, reason: collision with root package name */
    public final Object f1115l;

    /* renamed from: m, reason: collision with root package name */
    public final o f1116m;

    public p(PlanDatabase_Impl planDatabase_Impl, HashMap hashMap, HashMap hashMap2, String... strArr) {
        String str;
        this.f1104a = planDatabase_Impl;
        this.f1105b = hashMap;
        this.f1106c = hashMap2;
        this.f1112i = new m(strArr.length);
        r6.k.e(Collections.newSetFromMap(new IdentityHashMap()), "newSetFromMap(IdentityHashMap())");
        this.f1113j = new h.f();
        this.f1114k = new Object();
        this.f1115l = new Object();
        this.f1107d = new LinkedHashMap();
        int length = strArr.length;
        String[] strArr2 = new String[length];
        for (int i7 = 0; i7 < length; i7++) {
            String str2 = strArr[i7];
            Locale locale = Locale.US;
            r6.k.e(locale, "US");
            String lowerCase = str2.toLowerCase(locale);
            r6.k.e(lowerCase, "this as java.lang.String).toLowerCase(locale)");
            this.f1107d.put(lowerCase, Integer.valueOf(i7));
            String str3 = (String) this.f1105b.get(strArr[i7]);
            if (str3 != null) {
                str = str3.toLowerCase(locale);
                r6.k.e(str, "this as java.lang.String).toLowerCase(locale)");
            } else {
                str = null;
            }
            if (str != null) {
                lowerCase = str;
            }
            strArr2[i7] = lowerCase;
        }
        this.f1108e = strArr2;
        for (Map.Entry entry : this.f1105b.entrySet()) {
            String str4 = (String) entry.getValue();
            Locale locale2 = Locale.US;
            r6.k.e(locale2, "US");
            String lowerCase2 = str4.toLowerCase(locale2);
            r6.k.e(lowerCase2, "this as java.lang.String).toLowerCase(locale)");
            if (this.f1107d.containsKey(lowerCase2)) {
                String lowerCase3 = ((String) entry.getKey()).toLowerCase(locale2);
                r6.k.e(lowerCase3, "this as java.lang.String).toLowerCase(locale)");
                LinkedHashMap linkedHashMap = this.f1107d;
                linkedHashMap.put(lowerCase3, e6.c0.i0(lowerCase2, linkedHashMap));
            }
        }
        this.f1116m = new o(0, this);
    }

    public final boolean a() {
        if (!this.f1104a.isOpenInternal()) {
            return false;
        }
        if (!this.f1110g) {
            ((z3.g) this.f1104a.getOpenHelper()).b();
        }
        if (this.f1110g) {
            return true;
        }
        Log.e("ROOM", "database is not initialized even though it is open");
        return false;
    }

    public final void b(c cVar) {
        n nVar;
        boolean z8;
        synchronized (this.f1113j) {
            nVar = (n) this.f1113j.g(cVar);
        }
        if (nVar != null) {
            m mVar = this.f1112i;
            int[] iArr = nVar.f1098b;
            int[] copyOf = Arrays.copyOf(iArr, iArr.length);
            mVar.getClass();
            r6.k.f(copyOf, "tableIds");
            synchronized (mVar) {
                z8 = false;
                for (int i7 : copyOf) {
                    long[] jArr = (long[]) mVar.f1094b;
                    long j8 = jArr[i7];
                    jArr[i7] = j8 - 1;
                    if (j8 == 1) {
                        z8 = true;
                        mVar.f1093a = true;
                    }
                }
            }
            if (z8) {
                PlanDatabase_Impl planDatabase_Impl = this.f1104a;
                if (planDatabase_Impl.isOpenInternal()) {
                    d(((z3.g) planDatabase_Impl.getOpenHelper()).b());
                }
            }
        }
    }

    public final void c(y3.a aVar, int i7) {
        aVar.i("INSERT OR IGNORE INTO room_table_modification_log VALUES(" + i7 + ", 0)");
        String str = this.f1108e[i7];
        for (int i8 = 0; i8 < 3; i8++) {
            String str2 = f1103n[i8];
            String str3 = "CREATE TEMP TRIGGER IF NOT EXISTS " + f.d(str, str2) + " AFTER " + str2 + " ON `" + str + "` BEGIN UPDATE room_table_modification_log SET invalidated = 1 WHERE table_id = " + i7 + " AND invalidated = 0; END";
            r6.k.e(str3, "StringBuilder().apply(builderAction).toString()");
            aVar.i(str3);
        }
    }

    public final void d(y3.a aVar) {
        r6.k.f(aVar, "database");
        if (aVar.s()) {
            return;
        }
        try {
            Lock closeLock$room_runtime_release = this.f1104a.getCloseLock$room_runtime_release();
            closeLock$room_runtime_release.lock();
            try {
                synchronized (this.f1114k) {
                    int[] a3 = this.f1112i.a();
                    if (a3 != null) {
                        if (aVar.x()) {
                            aVar.C();
                        } else {
                            aVar.e();
                        }
                        try {
                            int length = a3.length;
                            int i7 = 0;
                            int i8 = 0;
                            while (i7 < length) {
                                int i9 = a3[i7];
                                int i10 = i8 + 1;
                                if (i9 == 1) {
                                    c(aVar, i8);
                                } else if (i9 == 2) {
                                    String str = this.f1108e[i8];
                                    String[] strArr = f1103n;
                                    for (int i11 = 0; i11 < 3; i11++) {
                                        String str2 = "DROP TRIGGER IF EXISTS " + f.d(str, strArr[i11]);
                                        r6.k.e(str2, "StringBuilder().apply(builderAction).toString()");
                                        aVar.i(str2);
                                    }
                                }
                                i7++;
                                i8 = i10;
                            }
                            aVar.A();
                            aVar.d();
                        } catch (Throwable th) {
                            aVar.d();
                            throw th;
                        }
                    }
                }
            } finally {
                closeLock$room_runtime_release.unlock();
            }
        } catch (SQLiteException e9) {
            Log.e("ROOM", "Cannot run invalidation tracker. Is the db closed?", e9);
        } catch (IllegalStateException e10) {
            Log.e("ROOM", "Cannot run invalidation tracker. Is the db closed?", e10);
        }
    }
}
