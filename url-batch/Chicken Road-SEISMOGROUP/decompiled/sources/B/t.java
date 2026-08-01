package B;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.os.Build;
import android.util.Log;
import java.io.File;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public class t implements K.a, N.j {

    /* renamed from: i, reason: collision with root package name */
    public static String f82i;

    /* renamed from: m, reason: collision with root package name */
    public static l f86m;

    /* renamed from: b, reason: collision with root package name */
    public Context f87b;

    /* renamed from: c, reason: collision with root package name */
    public A.e f88c;

    /* renamed from: d, reason: collision with root package name */
    public static final HashMap f77d = new HashMap();

    /* renamed from: e, reason: collision with root package name */
    public static final HashMap f78e = new HashMap();

    /* renamed from: f, reason: collision with root package name */
    public static final Object f79f = new Object();

    /* renamed from: g, reason: collision with root package name */
    public static final Object f80g = new Object();

    /* renamed from: h, reason: collision with root package name */
    public static int f81h = 0;

    /* renamed from: j, reason: collision with root package name */
    public static int f83j = 0;

    /* renamed from: k, reason: collision with root package name */
    public static int f84k = 1;

    /* renamed from: l, reason: collision with root package name */
    public static int f85l = 0;

    public static void c(t tVar, g gVar) {
        tVar.getClass();
        try {
            if (a.a(gVar.f22d)) {
                Log.d("Sqflite", gVar.h() + "closing database ");
            }
            gVar.a();
        } catch (Exception e2) {
            Log.e("Sqflite", "error " + e2 + " while closing database " + f85l);
        }
        synchronized (f79f) {
            try {
                if (f78e.isEmpty() && f86m != null) {
                    if (a.a(gVar.f22d)) {
                        Log.d("Sqflite", gVar.h() + "stopping thread");
                    }
                    f86m.b();
                    f86m = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static g d(A.a aVar, M.j jVar) {
        Integer num = (Integer) aVar.m("id");
        int intValue = num.intValue();
        g gVar = (g) f78e.get(num);
        if (gVar != null) {
            return gVar;
        }
        jVar.a("sqlite_error", "database_closed " + intValue, null);
        return null;
    }

    public static HashMap e(int i2, boolean z, boolean z2) {
        HashMap hashMap = new HashMap();
        hashMap.put("id", Integer.valueOf(i2));
        if (z) {
            hashMap.put("recovered", Boolean.TRUE);
        }
        if (z2) {
            hashMap.put("recoveredInTransaction", Boolean.TRUE);
        }
        return hashMap;
    }

    @Override // K.a
    public final void a(A.a aVar) {
        this.f87b = (Context) aVar.f3c;
        N.n nVar = N.n.f411a;
        N.h hVar = new N.h();
        N.f fVar = (N.f) aVar.f4d;
        A.e eVar = new A.e(fVar, "com.tekartik.sqflite", nVar, fVar.e(hVar));
        this.f88c = eVar;
        eVar.l(this);
    }

    @Override // K.a
    public final void b(A.a aVar) {
        this.f87b = null;
        this.f88c.l(null);
        this.f88c = null;
    }

    @Override // N.j
    public final void g(final A.a aVar, final M.j jVar) {
        int i2;
        int i3;
        int i4;
        int i5;
        g gVar;
        final boolean z;
        final int i6;
        g gVar2;
        boolean z2;
        i2 = 5;
        i3 = 4;
        i4 = 2;
        String str = (String) aVar.f3c;
        str.getClass();
        i5 = 1;
        gVar = null;
        z = false;
        z2 = false;
        z = false;
        switch (str) {
            case "execute":
                g d2 = d(aVar, jVar);
                if (d2 == null) {
                    return;
                }
                f86m.d(d2, new p(aVar, jVar, d2, i3));
                return;
            case "closeDatabase":
                Integer num = (Integer) aVar.m("id");
                int intValue = num.intValue();
                g d3 = d(aVar, jVar);
                if (d3 == null) {
                    return;
                }
                if (a.a(d3.f22d)) {
                    Log.d("Sqflite", d3.h() + "closing " + intValue + " " + d3.f20b);
                }
                String str2 = d3.f20b;
                synchronized (f79f) {
                    try {
                        f78e.remove(num);
                        if (d3.f19a) {
                            f77d.remove(str2);
                        }
                    } finally {
                    }
                }
                f86m.d(d3, new r(this, d3, jVar));
                return;
            case "options":
                Object m2 = aVar.m("androidThreadPriority");
                if (m2 != null) {
                    f83j = ((Integer) m2).intValue();
                }
                Object m3 = aVar.m("androidThreadCount");
                if (m3 != null && !m3.equals(Integer.valueOf(f84k))) {
                    f84k = ((Integer) m3).intValue();
                    l lVar = f86m;
                    if (lVar != null) {
                        lVar.b();
                        f86m = null;
                    }
                }
                Integer num2 = (Integer) aVar.m("logLevel");
                if (num2 != null) {
                    f81h = num2.intValue();
                }
                jVar.c(null);
                return;
            case "insert":
                g d4 = d(aVar, jVar);
                if (d4 == null) {
                    return;
                }
                f86m.d(d4, new p(aVar, jVar, d4, i5));
                return;
            case "update":
                g d5 = d(aVar, jVar);
                if (d5 == null) {
                    return;
                }
                f86m.d(d5, new p(aVar, jVar, d5, i2));
                return;
            case "androidSetLocale":
                g d6 = d(aVar, jVar);
                if (d6 == null) {
                    return;
                }
                f86m.d(d6, new p(aVar, d6, jVar));
                return;
            case "deleteDatabase":
                String str3 = (String) aVar.m("path");
                synchronized (f79f) {
                    try {
                        if (a.b(f81h)) {
                            Log.d("Sqflite", "Look for " + str3 + " in " + f77d.keySet());
                        }
                        HashMap hashMap = f77d;
                        Integer num3 = (Integer) hashMap.get(str3);
                        if (num3 != null) {
                            HashMap hashMap2 = f78e;
                            g gVar3 = (g) hashMap2.get(num3);
                            if (gVar3 != null && gVar3.f27i.isOpen()) {
                                if (a.b(f81h)) {
                                    StringBuilder sb = new StringBuilder();
                                    sb.append(gVar3.h());
                                    sb.append("found single instance ");
                                    sb.append(gVar3.j() ? "(in transaction) " : "");
                                    sb.append(num3);
                                    sb.append(" ");
                                    sb.append(str3);
                                    Log.d("Sqflite", sb.toString());
                                }
                                hashMap2.remove(num3);
                                hashMap.remove(str3);
                                gVar = gVar3;
                            }
                        }
                    } finally {
                    }
                }
                s sVar = new s(this, gVar, str3, jVar);
                l lVar2 = f86m;
                if (lVar2 != null) {
                    lVar2.d(gVar, sVar);
                    return;
                } else {
                    sVar.run();
                    return;
                }
            case "debugMode":
                boolean equals = Boolean.TRUE.equals(aVar.f4d);
                if (!equals) {
                    f81h = 0;
                } else if (equals) {
                    f81h = 1;
                }
                jVar.c(null);
                return;
            case "openDatabase":
                final String str4 = (String) aVar.m("path");
                final Boolean bool = (Boolean) aVar.m("readOnly");
                final boolean z3 = str4 == null || str4.equals(":memory:");
                if (!Boolean.FALSE.equals(aVar.m("singleInstance")) && !z3) {
                    z = true;
                }
                if (z) {
                    synchronized (f79f) {
                        try {
                            if (a.b(f81h)) {
                                Log.d("Sqflite", "Look for " + str4 + " in " + f77d.keySet());
                            }
                            Integer num4 = (Integer) f77d.get(str4);
                            if (num4 != null && (gVar2 = (g) f78e.get(num4)) != null) {
                                if (gVar2.f27i.isOpen()) {
                                    if (a.b(f81h)) {
                                        StringBuilder sb2 = new StringBuilder();
                                        sb2.append(gVar2.h());
                                        sb2.append("re-opened single instance ");
                                        sb2.append(gVar2.j() ? "(in transaction) " : "");
                                        sb2.append(num4);
                                        sb2.append(" ");
                                        sb2.append(str4);
                                        Log.d("Sqflite", sb2.toString());
                                    }
                                    jVar.c(e(num4.intValue(), true, gVar2.j()));
                                    return;
                                }
                                if (a.b(f81h)) {
                                    Log.d("Sqflite", gVar2.h() + "single instance database of " + str4 + " not opened");
                                }
                            }
                        } finally {
                        }
                    }
                }
                Object obj = f79f;
                synchronized (obj) {
                    i6 = f85l + 1;
                    f85l = i6;
                }
                final g gVar4 = new g(this.f87b, str4, i6, z, f81h);
                synchronized (obj) {
                    try {
                        if (f86m == null) {
                            int i7 = f84k;
                            int i8 = f83j;
                            l nVar = i7 == 1 ? new n(i8) : new m(i7, i8);
                            f86m = nVar;
                            nVar.c();
                            if (a.a(gVar4.f22d)) {
                                Log.d("Sqflite", gVar4.h() + "starting worker pool with priority " + f83j);
                            }
                        }
                        gVar4.f26h = f86m;
                        if (a.a(gVar4.f22d)) {
                            Log.d("Sqflite", gVar4.h() + "opened " + i6 + " " + str4);
                        }
                        f86m.d(gVar4, new Runnable() { // from class: B.q
                            @Override // java.lang.Runnable
                            public final void run() {
                                boolean z4 = z3;
                                String str5 = str4;
                                M.j jVar2 = jVar;
                                Boolean bool2 = bool;
                                g gVar5 = gVar4;
                                A.a aVar2 = aVar;
                                boolean z5 = z;
                                int i9 = i6;
                                synchronized (t.f80g) {
                                    if (!z4) {
                                        File file = new File(new File(str5).getParent());
                                        if (!file.exists() && !file.mkdirs() && !file.exists()) {
                                            jVar2.a("sqlite_error", "open_failed " + str5, null);
                                            return;
                                        }
                                    }
                                    try {
                                        if (Boolean.TRUE.equals(bool2)) {
                                            gVar5.f27i = SQLiteDatabase.openDatabase(gVar5.f20b, null, 1, new f());
                                        } else {
                                            gVar5.k();
                                        }
                                        synchronized (t.f79f) {
                                            if (z5) {
                                                try {
                                                    t.f77d.put(str5, Integer.valueOf(i9));
                                                } finally {
                                                }
                                            }
                                            t.f78e.put(Integer.valueOf(i9), gVar5);
                                        }
                                        if (a.a(gVar5.f22d)) {
                                            Log.d("Sqflite", gVar5.h() + "opened " + i9 + " " + str5);
                                        }
                                        jVar2.c(t.e(i9, false, false));
                                    } catch (Exception e2) {
                                        gVar5.i(e2, new C.b(aVar2, jVar2));
                                    }
                                }
                            }
                        });
                    } finally {
                    }
                }
                return;
            case "batch":
                g d7 = d(aVar, jVar);
                if (d7 == null) {
                    return;
                }
                f86m.d(d7, new p(d7, aVar, jVar));
                return;
            case "debug":
                String str5 = (String) aVar.m("cmd");
                HashMap hashMap3 = new HashMap();
                if ("get".equals(str5)) {
                    int i9 = f81h;
                    if (i9 > 0) {
                        hashMap3.put("logLevel", Integer.valueOf(i9));
                    }
                    HashMap hashMap4 = f78e;
                    if (!hashMap4.isEmpty()) {
                        HashMap hashMap5 = new HashMap();
                        for (Map.Entry entry : hashMap4.entrySet()) {
                            g gVar5 = (g) entry.getValue();
                            HashMap hashMap6 = new HashMap();
                            hashMap6.put("path", gVar5.f20b);
                            hashMap6.put("singleInstance", Boolean.valueOf(gVar5.f19a));
                            int i10 = gVar5.f22d;
                            if (i10 > 0) {
                                hashMap6.put("logLevel", Integer.valueOf(i10));
                            }
                            hashMap5.put(((Integer) entry.getKey()).toString(), hashMap6);
                        }
                        hashMap3.put("databases", hashMap5);
                    }
                }
                jVar.c(hashMap3);
                return;
            case "query":
                g d8 = d(aVar, jVar);
                if (d8 == null) {
                    return;
                }
                f86m.d(d8, new p(aVar, jVar, d8, i4));
                return;
            case "databaseExists":
                try {
                    z2 = new File((String) aVar.m("path")).exists();
                } catch (Exception unused) {
                }
                jVar.c(Boolean.valueOf(z2));
                return;
            case "queryCursorNext":
                g d9 = d(aVar, jVar);
                if (d9 == null) {
                    return;
                }
                f86m.d(d9, new p(aVar, jVar, d9, z ? 1 : 0));
                return;
            case "getPlatformVersion":
                jVar.c("Android " + Build.VERSION.RELEASE);
                return;
            case "getDatabasesPath":
                if (f82i == null) {
                    f82i = this.f87b.getDatabasePath("tekartik_sqflite.db").getParent();
                }
                jVar.c(f82i);
                return;
            default:
                jVar.b();
                return;
        }
    }
}
