package x1;

import P1.n;
import P1.o;
import P1.u;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.os.Build;
import android.util.Log;
import java.io.File;
import java.util.HashMap;
import java.util.Map;
import k.RunnableC1060e;
import y1.C1254b;

/* loaded from: classes.dex */
public class l implements L1.b, P1.m {

    /* renamed from: h, reason: collision with root package name */
    public static String f10761h;

    /* renamed from: l, reason: collision with root package name */
    public static InterfaceC1247h f10765l;

    /* renamed from: a, reason: collision with root package name */
    public Context f10766a;

    /* renamed from: b, reason: collision with root package name */
    public o f10767b;

    /* renamed from: c, reason: collision with root package name */
    public static final HashMap f10757c = new HashMap();

    /* renamed from: d, reason: collision with root package name */
    public static final HashMap f10758d = new HashMap();

    /* renamed from: e, reason: collision with root package name */
    public static final Object f10759e = new Object();
    public static final Object f = new Object();

    /* renamed from: g, reason: collision with root package name */
    public static int f10760g = 0;

    /* renamed from: i, reason: collision with root package name */
    public static int f10762i = 0;

    /* renamed from: j, reason: collision with root package name */
    public static int f10763j = 1;

    /* renamed from: k, reason: collision with root package name */
    public static int f10764k = 0;

    public static void a(l lVar, C1244e c1244e) {
        lVar.getClass();
        try {
            if (c1244e.f10727d >= 1) {
                Log.d("Sqflite", c1244e.h() + "closing database ");
            }
            c1244e.a();
        } catch (Exception e3) {
            Log.e("Sqflite", "error " + e3 + " while closing database " + f10764k);
        }
        synchronized (f10759e) {
            try {
                if (f10758d.isEmpty() && f10765l != null) {
                    if (c1244e.f10727d >= 1) {
                        Log.d("Sqflite", c1244e.h() + "stopping thread");
                    }
                    f10765l.b();
                    f10765l = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static C1244e b(P1.l lVar, O1.j jVar) {
        Integer num = (Integer) lVar.a("id");
        int intValue = num.intValue();
        C1244e c1244e = (C1244e) f10758d.get(num);
        if (c1244e != null) {
            return c1244e;
        }
        jVar.b("sqlite_error", "database_closed " + intValue, null);
        return null;
    }

    public static HashMap c(int i3, boolean z, boolean z2) {
        HashMap hashMap = new HashMap();
        hashMap.put("id", Integer.valueOf(i3));
        if (z) {
            hashMap.put("recovered", Boolean.TRUE);
        }
        if (z2) {
            hashMap.put("recoveredInTransaction", Boolean.TRUE);
        }
        return hashMap;
    }

    @Override // L1.b
    public final void onAttachedToEngine(L1.a aVar) {
        this.f10766a = aVar.f887a;
        u uVar = u.f1272b;
        P1.j jVar = new P1.j();
        P1.f fVar = aVar.f888b;
        o oVar = new o(fVar, "com.tekartik.sqflite", uVar, fVar.e(jVar));
        this.f10767b = oVar;
        oVar.b(this);
    }

    @Override // L1.b
    public final void onDetachedFromEngine(L1.a aVar) {
        this.f10766a = null;
        this.f10767b.b(null);
        this.f10767b = null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // P1.m
    public final void onMethodCall(final P1.l lVar, n nVar) {
        C1244e c1244e;
        boolean z;
        final int i3;
        O1.c cVar;
        C1244e c1244e2;
        String str = lVar.f1266a;
        str.getClass();
        c1244e = null;
        z = false;
        switch (str) {
            case "execute":
                O1.j jVar = (O1.j) nVar;
                C1244e b3 = b(lVar, jVar);
                if (b3 == null) {
                    return;
                }
                f10765l.c(b3, new RunnableC1249j(lVar, jVar, b3, 4));
                return;
            case "closeDatabase":
                Integer num = (Integer) lVar.a("id");
                int intValue = num.intValue();
                O1.j jVar2 = (O1.j) nVar;
                C1244e b4 = b(lVar, jVar2);
                if (b4 == null) {
                    return;
                }
                if (b4.f10727d >= 1) {
                    Log.d("Sqflite", b4.h() + "closing " + intValue + " " + b4.f10725b);
                }
                String str2 = b4.f10725b;
                synchronized (f10759e) {
                    try {
                        f10758d.remove(num);
                        if (b4.f10724a) {
                            f10757c.remove(str2);
                        }
                    } finally {
                    }
                }
                f10765l.c(b4, new B.n(this, b4, jVar2, 5));
                return;
            case "options":
                Object a3 = lVar.a("androidThreadPriority");
                if (a3 != null) {
                    f10762i = ((Integer) a3).intValue();
                }
                Object a4 = lVar.a("androidThreadCount");
                if (a4 != null && !a4.equals(Integer.valueOf(f10763j))) {
                    f10763j = ((Integer) a4).intValue();
                    InterfaceC1247h interfaceC1247h = f10765l;
                    if (interfaceC1247h != null) {
                        interfaceC1247h.b();
                        f10765l = null;
                    }
                }
                Integer num2 = (Integer) lVar.a("logLevel");
                if (num2 != null) {
                    f10760g = num2.intValue();
                }
                ((O1.j) nVar).success(null);
                return;
            case "insert":
                O1.j jVar3 = (O1.j) nVar;
                C1244e b5 = b(lVar, jVar3);
                if (b5 == null) {
                    return;
                }
                f10765l.c(b5, new RunnableC1249j(lVar, jVar3, b5, 1));
                return;
            case "update":
                O1.j jVar4 = (O1.j) nVar;
                C1244e b6 = b(lVar, jVar4);
                if (b6 == null) {
                    return;
                }
                f10765l.c(b6, new RunnableC1249j(lVar, jVar4, b6, 5));
                return;
            case "androidSetLocale":
                O1.j jVar5 = (O1.j) nVar;
                C1244e b7 = b(lVar, jVar5);
                if (b7 == null) {
                    return;
                }
                f10765l.c(b7, new RunnableC1249j(lVar, b7, jVar5));
                return;
            case "deleteDatabase":
                String str3 = (String) lVar.a("path");
                synchronized (f10759e) {
                    try {
                        if (AbstractC1240a.a(f10760g)) {
                            Log.d("Sqflite", "Look for " + str3 + " in " + f10757c.keySet());
                        }
                        HashMap hashMap = f10757c;
                        Integer num3 = (Integer) hashMap.get(str3);
                        if (num3 != null) {
                            HashMap hashMap2 = f10758d;
                            C1244e c1244e3 = (C1244e) hashMap2.get(num3);
                            if (c1244e3 != null && c1244e3.f10731i.isOpen()) {
                                if (AbstractC1240a.a(f10760g)) {
                                    StringBuilder sb = new StringBuilder();
                                    sb.append(c1244e3.h());
                                    sb.append("found single instance ");
                                    sb.append(c1244e3.j() ? "(in transaction) " : "");
                                    sb.append(num3);
                                    sb.append(" ");
                                    sb.append(str3);
                                    Log.d("Sqflite", sb.toString());
                                }
                                hashMap2.remove(num3);
                                hashMap.remove(str3);
                                c1244e = c1244e3;
                            }
                        }
                    } finally {
                    }
                }
                C1244e c1244e4 = c1244e;
                RunnableC1060e runnableC1060e = new RunnableC1060e(this, c1244e4, str3, (O1.j) nVar, 1);
                InterfaceC1247h interfaceC1247h2 = f10765l;
                if (interfaceC1247h2 != null) {
                    interfaceC1247h2.c(c1244e4, runnableC1060e);
                    return;
                } else {
                    runnableC1060e.run();
                    return;
                }
            case "debugMode":
                boolean equals = Boolean.TRUE.equals(lVar.f1267b);
                if (!equals) {
                    f10760g = 0;
                } else if (equals) {
                    f10760g = 1;
                }
                ((O1.j) nVar).success(null);
                return;
            case "openDatabase":
                final String str4 = (String) lVar.a("path");
                final Boolean bool = (Boolean) lVar.a("readOnly");
                final boolean z2 = str4 == null || str4.equals(":memory:");
                boolean z3 = (Boolean.FALSE.equals(lVar.a("singleInstance")) || z2) ? false : true;
                if (z3) {
                    synchronized (f10759e) {
                        try {
                            if (AbstractC1240a.a(f10760g)) {
                                Log.d("Sqflite", "Look for " + str4 + " in " + f10757c.keySet());
                            }
                            Integer num4 = (Integer) f10757c.get(str4);
                            if (num4 != null && (c1244e2 = (C1244e) f10758d.get(num4)) != null) {
                                if (c1244e2.f10731i.isOpen()) {
                                    if (AbstractC1240a.a(f10760g)) {
                                        StringBuilder sb2 = new StringBuilder();
                                        sb2.append(c1244e2.h());
                                        sb2.append("re-opened single instance ");
                                        sb2.append(c1244e2.j() ? "(in transaction) " : "");
                                        sb2.append(num4);
                                        sb2.append(" ");
                                        sb2.append(str4);
                                        Log.d("Sqflite", sb2.toString());
                                    }
                                    ((O1.j) nVar).success(c(num4.intValue(), true, c1244e2.j()));
                                    return;
                                }
                                if (AbstractC1240a.a(f10760g)) {
                                    Log.d("Sqflite", c1244e2.h() + "single instance database of " + str4 + " not opened");
                                }
                            }
                        } finally {
                        }
                    }
                }
                Object obj = f10759e;
                synchronized (obj) {
                    i3 = f10764k + 1;
                    f10764k = i3;
                }
                final C1244e c1244e5 = new C1244e(this.f10766a, str4, i3, z3, f10760g);
                synchronized (obj) {
                    try {
                        if (f10765l == null) {
                            int i4 = f10763j;
                            int i5 = f10762i;
                            if (i4 == 1) {
                                T1.a aVar = new T1.a();
                                aVar.f1343a = i5;
                                cVar = aVar;
                            } else {
                                cVar = new O1.c(i4, i5);
                            }
                            f10765l = cVar;
                            cVar.a();
                            if (c1244e5.f10727d >= 1) {
                                Log.d("Sqflite", c1244e5.h() + "starting worker pool with priority " + f10762i);
                            }
                        }
                        c1244e5.f10730h = f10765l;
                        if (c1244e5.f10727d >= 1) {
                            Log.d("Sqflite", c1244e5.h() + "opened " + i3 + " " + str4);
                        }
                        final O1.j jVar6 = (O1.j) nVar;
                        final boolean z4 = z3;
                        f10765l.c(c1244e5, new Runnable() { // from class: x1.k
                            @Override // java.lang.Runnable
                            public final void run() {
                                boolean z5 = z2;
                                String str5 = str4;
                                O1.j jVar7 = jVar6;
                                Boolean bool2 = bool;
                                C1244e c1244e6 = c1244e5;
                                P1.l lVar2 = lVar;
                                boolean z6 = z4;
                                int i6 = i3;
                                synchronized (l.f) {
                                    if (!z5) {
                                        File file = new File(new File(str5).getParent());
                                        if (!file.exists() && !file.mkdirs() && !file.exists()) {
                                            jVar7.b("sqlite_error", "open_failed " + str5, null);
                                            return;
                                        }
                                    }
                                    try {
                                        if (Boolean.TRUE.equals(bool2)) {
                                            c1244e6.f10731i = SQLiteDatabase.openDatabase(c1244e6.f10725b, null, 1, new C1243d());
                                        } else {
                                            c1244e6.k();
                                        }
                                        synchronized (l.f10759e) {
                                            if (z6) {
                                                try {
                                                    l.f10757c.put(str5, Integer.valueOf(i6));
                                                } finally {
                                                }
                                            }
                                            l.f10758d.put(Integer.valueOf(i6), c1244e6);
                                        }
                                        if (c1244e6.f10727d >= 1) {
                                            Log.d("Sqflite", c1244e6.h() + "opened " + i6 + " " + str5);
                                        }
                                        jVar7.success(l.c(i6, false, false));
                                    } catch (Exception e3) {
                                        c1244e6.i(e3, new C1254b(lVar2, jVar7));
                                    }
                                }
                            }
                        });
                    } finally {
                    }
                }
                return;
            case "batch":
                O1.j jVar7 = (O1.j) nVar;
                C1244e b8 = b(lVar, jVar7);
                if (b8 == null) {
                    return;
                }
                f10765l.c(b8, new RunnableC1249j(b8, lVar, jVar7));
                return;
            case "debug":
                String str5 = (String) lVar.a("cmd");
                HashMap hashMap3 = new HashMap();
                if ("get".equals(str5)) {
                    int i6 = f10760g;
                    if (i6 > 0) {
                        hashMap3.put("logLevel", Integer.valueOf(i6));
                    }
                    HashMap hashMap4 = f10758d;
                    if (!hashMap4.isEmpty()) {
                        HashMap hashMap5 = new HashMap();
                        for (Map.Entry entry : hashMap4.entrySet()) {
                            C1244e c1244e6 = (C1244e) entry.getValue();
                            HashMap hashMap6 = new HashMap();
                            hashMap6.put("path", c1244e6.f10725b);
                            hashMap6.put("singleInstance", Boolean.valueOf(c1244e6.f10724a));
                            int i7 = c1244e6.f10727d;
                            if (i7 > 0) {
                                hashMap6.put("logLevel", Integer.valueOf(i7));
                            }
                            hashMap5.put(((Integer) entry.getKey()).toString(), hashMap6);
                        }
                        hashMap3.put("databases", hashMap5);
                    }
                }
                ((O1.j) nVar).success(hashMap3);
                return;
            case "query":
                O1.j jVar8 = (O1.j) nVar;
                C1244e b9 = b(lVar, jVar8);
                if (b9 == null) {
                    return;
                }
                f10765l.c(b9, new RunnableC1249j(lVar, jVar8, b9, 2));
                return;
            case "databaseExists":
                try {
                    z = new File((String) lVar.a("path")).exists();
                } catch (Exception unused) {
                }
                ((O1.j) nVar).success(Boolean.valueOf(z));
                return;
            case "queryCursorNext":
                O1.j jVar9 = (O1.j) nVar;
                C1244e b10 = b(lVar, jVar9);
                if (b10 == null) {
                    return;
                }
                f10765l.c(b10, new RunnableC1249j(lVar, jVar9, b10, 0));
                return;
            case "getPlatformVersion":
                ((O1.j) nVar).success("Android " + Build.VERSION.RELEASE);
                return;
            case "getDatabasesPath":
                if (f10761h == null) {
                    f10761h = this.f10766a.getDatabasePath("tekartik_sqflite.db").getParent();
                }
                ((O1.j) nVar).success(f10761h);
                return;
            default:
                ((O1.j) nVar).a();
                return;
        }
    }
}
