package h0;

import I.C0079n;
import P.O;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.os.Build;
import android.util.Log;
import java.io.File;
import java.util.HashMap;
import java.util.Map;
import s0.InterfaceC0304a;
import w0.InterfaceC0320f;

/* loaded from: classes.dex */
public class p implements InterfaceC0304a, w0.l {

    /* renamed from: l, reason: collision with root package name */
    public static String f2350l;

    /* renamed from: p, reason: collision with root package name */
    public static InterfaceC0200h f2354p;

    /* renamed from: e, reason: collision with root package name */
    public Context f2355e;

    /* renamed from: f, reason: collision with root package name */
    public C0079n f2356f;

    /* renamed from: g, reason: collision with root package name */
    public static final HashMap f2345g = new HashMap();

    /* renamed from: h, reason: collision with root package name */
    public static final HashMap f2346h = new HashMap();

    /* renamed from: i, reason: collision with root package name */
    public static final Object f2347i = new Object();

    /* renamed from: j, reason: collision with root package name */
    public static final Object f2348j = new Object();

    /* renamed from: k, reason: collision with root package name */
    public static int f2349k = 0;

    /* renamed from: m, reason: collision with root package name */
    public static int f2351m = 0;

    /* renamed from: n, reason: collision with root package name */
    public static int f2352n = 1;

    /* renamed from: o, reason: collision with root package name */
    public static int f2353o = 0;

    public static void a(p pVar, C0197e c0197e) {
        pVar.getClass();
        try {
            if (AbstractC0193a.a(c0197e.f2293d)) {
                Log.d("Sqflite", c0197e.h() + "closing database ");
            }
            c0197e.a();
        } catch (Exception e2) {
            Log.e("Sqflite", "error " + e2 + " while closing database " + f2353o);
        }
        synchronized (f2347i) {
            try {
                if (f2346h.isEmpty() && f2354p != null) {
                    if (AbstractC0193a.a(c0197e.f2293d)) {
                        Log.d("Sqflite", c0197e.h() + "stopping thread");
                    }
                    f2354p.a();
                    f2354p = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static C0197e b(O o2, v0.i iVar) {
        Integer num = (Integer) o2.i("id");
        int intValue = num.intValue();
        C0197e c0197e = (C0197e) f2346h.get(num);
        if (c0197e != null) {
            return c0197e;
        }
        iVar.a("sqlite_error", "database_closed " + intValue, null);
        return null;
    }

    public static HashMap c(int i2, boolean z2, boolean z3) {
        HashMap hashMap = new HashMap();
        hashMap.put("id", Integer.valueOf(i2));
        if (z2) {
            hashMap.put("recovered", Boolean.TRUE);
        }
        if (z3) {
            hashMap.put("recoveredInTransaction", Boolean.TRUE);
        }
        return hashMap;
    }

    public final void d(O o2, v0.i iVar) {
        Integer num = (Integer) o2.i("id");
        int intValue = num.intValue();
        C0197e b2 = b(o2, iVar);
        if (b2 == null) {
            return;
        }
        if (AbstractC0193a.a(b2.f2293d)) {
            Log.d("Sqflite", b2.h() + "closing " + intValue + " " + b2.f2291b);
        }
        String str = b2.f2291b;
        synchronized (f2347i) {
            try {
                f2346h.remove(num);
                if (b2.f2290a) {
                    f2345g.remove(str);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        f2354p.b(b2, new n(this, b2, iVar));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // w0.l
    public final void e(final O o2, final v0.i iVar) {
        int i2;
        int i3;
        int i4;
        int i5;
        final boolean z2;
        final int i6;
        C0201i c0201i;
        C0197e c0197e;
        boolean z3;
        i2 = 5;
        i3 = 4;
        i4 = 2;
        String str = (String) o2.f875f;
        str.getClass();
        i5 = 1;
        z2 = false;
        z3 = false;
        z2 = false;
        switch (str) {
            case "execute":
                C0197e b2 = b(o2, iVar);
                if (b2 == null) {
                    return;
                }
                f2354p.b(b2, new l(o2, iVar, b2, i3));
                return;
            case "closeDatabase":
                d(o2, iVar);
                return;
            case "options":
                Object i7 = o2.i("androidThreadPriority");
                if (i7 != null) {
                    f2351m = ((Integer) i7).intValue();
                }
                Object i8 = o2.i("androidThreadCount");
                if (i8 != null && !i8.equals(Integer.valueOf(f2352n))) {
                    f2352n = ((Integer) i8).intValue();
                    InterfaceC0200h interfaceC0200h = f2354p;
                    if (interfaceC0200h != null) {
                        interfaceC0200h.a();
                        f2354p = null;
                    }
                }
                Integer num = (Integer) o2.i("logLevel");
                if (num != null) {
                    f2349k = num.intValue();
                }
                iVar.c(null);
                return;
            case "insert":
                C0197e b3 = b(o2, iVar);
                if (b3 == null) {
                    return;
                }
                f2354p.b(b3, new l(o2, iVar, b3, i5));
                return;
            case "update":
                C0197e b4 = b(o2, iVar);
                if (b4 == null) {
                    return;
                }
                f2354p.b(b4, new l(o2, iVar, b4, i2));
                return;
            case "androidSetLocale":
                C0197e b5 = b(o2, iVar);
                if (b5 == null) {
                    return;
                }
                f2354p.b(b5, new l(o2, b5, iVar));
                return;
            case "deleteDatabase":
                f(o2, iVar);
                return;
            case "debugMode":
                boolean equals = Boolean.TRUE.equals(o2.f876g);
                if (!equals) {
                    f2349k = 0;
                } else if (equals) {
                    f2349k = 1;
                }
                iVar.c(null);
                return;
            case "openDatabase":
                final String str2 = (String) o2.i("path");
                final Boolean bool = (Boolean) o2.i("readOnly");
                final boolean z4 = str2 == null || str2.equals(":memory:");
                if (!Boolean.FALSE.equals(o2.i("singleInstance")) && !z4) {
                    z2 = true;
                }
                if (z2) {
                    synchronized (f2347i) {
                        try {
                            if (AbstractC0193a.b(f2349k)) {
                                Log.d("Sqflite", "Look for " + str2 + " in " + f2345g.keySet());
                            }
                            Integer num2 = (Integer) f2345g.get(str2);
                            if (num2 != null && (c0197e = (C0197e) f2346h.get(num2)) != null) {
                                if (c0197e.f2298i.isOpen()) {
                                    if (AbstractC0193a.b(f2349k)) {
                                        StringBuilder sb = new StringBuilder();
                                        sb.append(c0197e.h());
                                        sb.append("re-opened single instance ");
                                        sb.append(c0197e.j() ? "(in transaction) " : "");
                                        sb.append(num2);
                                        sb.append(" ");
                                        sb.append(str2);
                                        Log.d("Sqflite", sb.toString());
                                    }
                                    iVar.c(c(num2.intValue(), true, c0197e.j()));
                                    return;
                                }
                                if (AbstractC0193a.b(f2349k)) {
                                    Log.d("Sqflite", c0197e.h() + "single instance database of " + str2 + " not opened");
                                }
                            }
                        } finally {
                        }
                    }
                }
                Object obj = f2347i;
                synchronized (obj) {
                    i6 = f2353o + 1;
                    f2353o = i6;
                }
                final C0197e c0197e2 = new C0197e(this.f2355e, str2, i6, z2, f2349k);
                synchronized (obj) {
                    try {
                        if (f2354p == null) {
                            int i9 = f2352n;
                            int i10 = f2351m;
                            if (i9 == 1) {
                                C0202j c0202j = new C0202j();
                                c0202j.f2318a = i10;
                                c0201i = c0202j;
                            } else {
                                c0201i = new C0201i(i9, i10);
                            }
                            f2354p = c0201i;
                            c0201i.start();
                            if (AbstractC0193a.a(c0197e2.f2293d)) {
                                Log.d("Sqflite", c0197e2.h() + "starting worker pool with priority " + f2351m);
                            }
                        }
                        c0197e2.f2297h = f2354p;
                        if (AbstractC0193a.a(c0197e2.f2293d)) {
                            Log.d("Sqflite", c0197e2.h() + "opened " + i6 + " " + str2);
                        }
                        f2354p.b(c0197e2, new Runnable() { // from class: h0.m
                            @Override // java.lang.Runnable
                            public final void run() {
                                boolean z5 = z4;
                                String str3 = str2;
                                v0.i iVar2 = iVar;
                                Boolean bool2 = bool;
                                C0197e c0197e3 = c0197e2;
                                O o3 = o2;
                                boolean z6 = z2;
                                int i11 = i6;
                                synchronized (p.f2348j) {
                                    if (!z5) {
                                        File file = new File(new File(str3).getParent());
                                        if (!file.exists() && !file.mkdirs() && !file.exists()) {
                                            iVar2.a("sqlite_error", "open_failed " + str3, null);
                                            return;
                                        }
                                    }
                                    try {
                                        if (Boolean.TRUE.equals(bool2)) {
                                            c0197e3.f2298i = SQLiteDatabase.openDatabase(c0197e3.f2291b, null, 1, new C0196d());
                                        } else {
                                            c0197e3.k();
                                        }
                                        synchronized (p.f2347i) {
                                            if (z6) {
                                                try {
                                                    p.f2345g.put(str3, Integer.valueOf(i11));
                                                } finally {
                                                }
                                            }
                                            p.f2346h.put(Integer.valueOf(i11), c0197e3);
                                        }
                                        if (AbstractC0193a.a(c0197e3.f2293d)) {
                                            Log.d("Sqflite", c0197e3.h() + "opened " + i11 + " " + str3);
                                        }
                                        iVar2.c(p.c(i11, false, false));
                                    } catch (Exception e2) {
                                        c0197e3.i(e2, new i0.b(o3, iVar2));
                                    }
                                }
                            }
                        });
                    } finally {
                    }
                }
                return;
            case "batch":
                C0197e b6 = b(o2, iVar);
                if (b6 == null) {
                    return;
                }
                f2354p.b(b6, new l(b6, o2, iVar));
                return;
            case "debug":
                String str3 = (String) o2.i("cmd");
                HashMap hashMap = new HashMap();
                if ("get".equals(str3)) {
                    int i11 = f2349k;
                    if (i11 > 0) {
                        hashMap.put("logLevel", Integer.valueOf(i11));
                    }
                    HashMap hashMap2 = f2346h;
                    if (!hashMap2.isEmpty()) {
                        HashMap hashMap3 = new HashMap();
                        for (Map.Entry entry : hashMap2.entrySet()) {
                            C0197e c0197e3 = (C0197e) entry.getValue();
                            HashMap hashMap4 = new HashMap();
                            hashMap4.put("path", c0197e3.f2291b);
                            hashMap4.put("singleInstance", Boolean.valueOf(c0197e3.f2290a));
                            int i12 = c0197e3.f2293d;
                            if (i12 > 0) {
                                hashMap4.put("logLevel", Integer.valueOf(i12));
                            }
                            hashMap3.put(((Integer) entry.getKey()).toString(), hashMap4);
                        }
                        hashMap.put("databases", hashMap3);
                    }
                }
                iVar.c(hashMap);
                return;
            case "query":
                C0197e b7 = b(o2, iVar);
                if (b7 == null) {
                    return;
                }
                f2354p.b(b7, new l(o2, iVar, b7, i4));
                return;
            case "databaseExists":
                try {
                    z3 = new File((String) o2.i("path")).exists();
                } catch (Exception unused) {
                }
                iVar.c(Boolean.valueOf(z3));
                return;
            case "queryCursorNext":
                C0197e b8 = b(o2, iVar);
                if (b8 == null) {
                    return;
                }
                f2354p.b(b8, new l(o2, iVar, b8, z2 ? 1 : 0));
                return;
            case "getPlatformVersion":
                iVar.c("Android " + Build.VERSION.RELEASE);
                return;
            case "getDatabasesPath":
                if (f2350l == null) {
                    f2350l = this.f2355e.getDatabasePath("tekartik_sqflite.db").getParent();
                }
                iVar.c(f2350l);
                return;
            default:
                iVar.b();
                return;
        }
    }

    public final void f(O o2, v0.i iVar) {
        C0197e c0197e;
        C0197e c0197e2;
        String str = (String) o2.i("path");
        synchronized (f2347i) {
            try {
                if (AbstractC0193a.b(f2349k)) {
                    Log.d("Sqflite", "Look for " + str + " in " + f2345g.keySet());
                }
                HashMap hashMap = f2345g;
                Integer num = (Integer) hashMap.get(str);
                if (num != null) {
                    HashMap hashMap2 = f2346h;
                    c0197e = (C0197e) hashMap2.get(num);
                    if (c0197e != null && c0197e.f2298i.isOpen()) {
                        if (AbstractC0193a.b(f2349k)) {
                            StringBuilder sb = new StringBuilder();
                            sb.append(c0197e.h());
                            sb.append("found single instance ");
                            sb.append(c0197e.j() ? "(in transaction) " : "");
                            sb.append(num);
                            sb.append(" ");
                            sb.append(str);
                            Log.d("Sqflite", sb.toString());
                        }
                        hashMap2.remove(num);
                        hashMap.remove(str);
                        c0197e2 = c0197e;
                    }
                }
                c0197e = null;
                c0197e2 = c0197e;
            } catch (Throwable th) {
                throw th;
            }
        }
        o oVar = new o(this, c0197e2, str, iVar, 0);
        InterfaceC0200h interfaceC0200h = f2354p;
        if (interfaceC0200h != null) {
            interfaceC0200h.b(c0197e2, oVar);
        } else {
            oVar.run();
        }
    }

    @Override // s0.InterfaceC0304a
    public final void j(C0079n c0079n) {
        this.f2355e = (Context) c0079n.f689e;
        w0.p pVar = w0.p.f3564a;
        InterfaceC0320f interfaceC0320f = (InterfaceC0320f) c0079n.f690f;
        C0079n c0079n2 = new C0079n(interfaceC0320f, "com.tekartik.sqflite", pVar, interfaceC0320f.b());
        this.f2356f = c0079n2;
        c0079n2.j(this);
    }

    @Override // s0.InterfaceC0304a
    public final void k(C0079n c0079n) {
        this.f2355e = null;
        this.f2356f.j(null);
        this.f2356f = null;
    }
}
