package com.google.android.gms.dynamite;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.os.SystemClock;
import android.util.Log;
import androidx.annotation.RecentlyNonNull;
import androidx.annotation.RecentlyNullable;
import com.google.android.gms.common.util.DynamiteApi;
import dalvik.system.DelegateLastClassLoader;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

/* loaded from: classes.dex */
public final class DynamiteModule {

    /* renamed from: h, reason: collision with root package name */
    private static Boolean f2495h = null;

    /* renamed from: i, reason: collision with root package name */
    private static String f2496i = null;

    /* renamed from: j, reason: collision with root package name */
    private static int f2497j = -1;

    /* renamed from: o, reason: collision with root package name */
    private static o f2502o;

    /* renamed from: p, reason: collision with root package name */
    private static p f2503p;

    /* renamed from: a, reason: collision with root package name */
    private final Context f2504a;

    /* renamed from: k, reason: collision with root package name */
    private static final ThreadLocal<k> f2498k = new ThreadLocal<>();

    /* renamed from: l, reason: collision with root package name */
    private static final ThreadLocal<Long> f2499l = new com.google.android.gms.dynamite.b();

    /* renamed from: m, reason: collision with root package name */
    private static final m f2500m = new c();

    /* renamed from: b, reason: collision with root package name */
    @RecentlyNonNull
    public static final b f2489b = new d();

    /* renamed from: c, reason: collision with root package name */
    @RecentlyNonNull
    public static final b f2490c = new e();

    /* renamed from: d, reason: collision with root package name */
    @RecentlyNonNull
    public static final b f2491d = new f();

    /* renamed from: e, reason: collision with root package name */
    @RecentlyNonNull
    public static final b f2492e = new g();

    /* renamed from: f, reason: collision with root package name */
    @RecentlyNonNull
    public static final b f2493f = new h();

    /* renamed from: g, reason: collision with root package name */
    @RecentlyNonNull
    public static final b f2494g = new i();

    /* renamed from: n, reason: collision with root package name */
    @RecentlyNonNull
    public static final b f2501n = new j();

    @DynamiteApi
    public static class DynamiteLoaderClassLoader {

        @RecentlyNullable
        public static ClassLoader sClassLoader;
    }

    public static class a extends Exception {
        /* synthetic */ a(String str, com.google.android.gms.dynamite.b bVar) {
            super(str);
        }

        /* synthetic */ a(String str, Throwable th, com.google.android.gms.dynamite.b bVar) {
            super(str, th);
        }
    }

    public interface b {
        n a(Context context, String str, m mVar);
    }

    private DynamiteModule(Context context) {
        r3.o.i(context);
        this.f2504a = context;
    }

    public static int a(@RecentlyNonNull Context context, @RecentlyNonNull String str) {
        try {
            ClassLoader classLoader = context.getApplicationContext().getClassLoader();
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 61);
            sb.append("com.google.android.gms.dynamite.descriptors.");
            sb.append(str);
            sb.append(".");
            sb.append("ModuleDescriptor");
            Class<?> loadClass = classLoader.loadClass(sb.toString());
            Field declaredField = loadClass.getDeclaredField("MODULE_ID");
            Field declaredField2 = loadClass.getDeclaredField("MODULE_VERSION");
            if (r3.n.a(declaredField.get(null), str)) {
                return declaredField2.getInt(null);
            }
            String valueOf = String.valueOf(declaredField.get(null));
            StringBuilder sb2 = new StringBuilder(valueOf.length() + 51 + String.valueOf(str).length());
            sb2.append("Module descriptor id '");
            sb2.append(valueOf);
            sb2.append("' didn't match expected id '");
            sb2.append(str);
            sb2.append("'");
            Log.e("DynamiteModule", sb2.toString());
            return 0;
        } catch (ClassNotFoundException unused) {
            StringBuilder sb3 = new StringBuilder(String.valueOf(str).length() + 45);
            sb3.append("Local module descriptor class for ");
            sb3.append(str);
            sb3.append(" not found.");
            Log.w("DynamiteModule", sb3.toString());
            return 0;
        } catch (Exception e7) {
            String valueOf2 = String.valueOf(e7.getMessage());
            Log.e("DynamiteModule", valueOf2.length() != 0 ? "Failed to load module descriptor class: ".concat(valueOf2) : new String("Failed to load module descriptor class: "));
            return 0;
        }
    }

    public static int c(@RecentlyNonNull Context context, @RecentlyNonNull String str) {
        return f(context, str, false);
    }

    @RecentlyNonNull
    public static DynamiteModule e(@RecentlyNonNull Context context, @RecentlyNonNull b bVar, @RecentlyNonNull String str) {
        Boolean bool;
        x3.a O0;
        DynamiteModule dynamiteModule;
        p pVar;
        Boolean valueOf;
        x3.a O02;
        ThreadLocal<k> threadLocal = f2498k;
        k kVar = threadLocal.get();
        k kVar2 = new k(null);
        threadLocal.set(kVar2);
        ThreadLocal<Long> threadLocal2 = f2499l;
        long longValue = threadLocal2.get().longValue();
        try {
            threadLocal2.set(Long.valueOf(SystemClock.elapsedRealtime()));
            n a7 = bVar.a(context, str, f2500m);
            int i7 = a7.f2507a;
            int i8 = a7.f2508b;
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 68 + String.valueOf(str).length());
            sb.append("Considering local module ");
            sb.append(str);
            sb.append(":");
            sb.append(i7);
            sb.append(" and remote module ");
            sb.append(str);
            sb.append(":");
            sb.append(i8);
            Log.i("DynamiteModule", sb.toString());
            int i9 = a7.f2509c;
            if (i9 == 0 || ((i9 == -1 && a7.f2507a == 0) || (i9 == 1 && a7.f2508b == 0))) {
                int i10 = a7.f2507a;
                int i11 = a7.f2508b;
                StringBuilder sb2 = new StringBuilder(91);
                sb2.append("No acceptable module found. Local version is ");
                sb2.append(i10);
                sb2.append(" and remote version is ");
                sb2.append(i11);
                sb2.append(".");
                throw new a(sb2.toString(), null);
            }
            if (i9 == -1) {
                DynamiteModule i12 = i(context, str);
                if (longValue == 0) {
                    threadLocal2.remove();
                } else {
                    threadLocal2.set(Long.valueOf(longValue));
                }
                Cursor cursor = kVar2.f2505a;
                if (cursor != null) {
                    cursor.close();
                }
                threadLocal.set(kVar);
                return i12;
            }
            if (i9 != 1) {
                StringBuilder sb3 = new StringBuilder(47);
                sb3.append("VersionPolicy returned invalid code:");
                sb3.append(0);
                throw new a(sb3.toString(), null);
            }
            try {
                int i13 = a7.f2508b;
                try {
                    synchronized (DynamiteModule.class) {
                        bool = f2495h;
                    }
                    if (bool == null) {
                        throw new a("Failed to determine which loading route to use.", null);
                    }
                    if (bool.booleanValue()) {
                        StringBuilder sb4 = new StringBuilder(String.valueOf(str).length() + 51);
                        sb4.append("Selected remote version of ");
                        sb4.append(str);
                        sb4.append(", version >= ");
                        sb4.append(i13);
                        Log.i("DynamiteModule", sb4.toString());
                        synchronized (DynamiteModule.class) {
                            pVar = f2503p;
                        }
                        if (pVar == null) {
                            throw new a("DynamiteLoaderV2 was not cached.", null);
                        }
                        k kVar3 = threadLocal.get();
                        if (kVar3 == null || kVar3.f2505a == null) {
                            throw new a("No result cursor", null);
                        }
                        Context applicationContext = context.getApplicationContext();
                        Cursor cursor2 = kVar3.f2505a;
                        x3.b.B3(null);
                        synchronized (DynamiteModule.class) {
                            valueOf = Boolean.valueOf(f2497j >= 2);
                        }
                        if (valueOf.booleanValue()) {
                            Log.v("DynamiteModule", "Dynamite loader version >= 2, using loadModule2NoCrashUtils");
                            O02 = pVar.B3(x3.b.B3(applicationContext), str, i13, x3.b.B3(cursor2));
                        } else {
                            Log.w("DynamiteModule", "Dynamite loader version < 2, falling back to loadModule2");
                            O02 = pVar.O0(x3.b.B3(applicationContext), str, i13, x3.b.B3(cursor2));
                        }
                        Context context2 = (Context) x3.b.O0(O02);
                        if (context2 == null) {
                            throw new a("Failed to get module context", null);
                        }
                        dynamiteModule = new DynamiteModule(context2);
                    } else {
                        StringBuilder sb5 = new StringBuilder(String.valueOf(str).length() + 51);
                        sb5.append("Selected remote version of ");
                        sb5.append(str);
                        sb5.append(", version >= ");
                        sb5.append(i13);
                        Log.i("DynamiteModule", sb5.toString());
                        o k7 = k(context);
                        if (k7 == null) {
                            throw new a("Failed to create IDynamiteLoader.", null);
                        }
                        int C5 = k7.C5();
                        if (C5 >= 3) {
                            k kVar4 = threadLocal.get();
                            if (kVar4 == null) {
                                throw new a("No cached result cursor holder", null);
                            }
                            O0 = k7.r6(x3.b.B3(context), str, i13, x3.b.B3(kVar4.f2505a));
                        } else if (C5 == 2) {
                            Log.w("DynamiteModule", "IDynamite loader version = 2");
                            O0 = k7.C3(x3.b.B3(context), str, i13);
                        } else {
                            Log.w("DynamiteModule", "Dynamite loader version < 2, falling back to createModuleContext");
                            O0 = k7.O0(x3.b.B3(context), str, i13);
                        }
                        if (x3.b.O0(O0) == null) {
                            throw new a("Failed to load remote module.", null);
                        }
                        dynamiteModule = new DynamiteModule((Context) x3.b.O0(O0));
                    }
                    if (longValue == 0) {
                        threadLocal2.remove();
                    } else {
                        threadLocal2.set(Long.valueOf(longValue));
                    }
                    Cursor cursor3 = kVar2.f2505a;
                    if (cursor3 != null) {
                        cursor3.close();
                    }
                    threadLocal.set(kVar);
                    return dynamiteModule;
                } catch (RemoteException e7) {
                    throw new a("Failed to load remote module.", e7, null);
                } catch (a e8) {
                    throw e8;
                } catch (Throwable th) {
                    v3.f.a(context, th);
                    throw new a("Failed to load remote module.", th, null);
                }
            } catch (a e9) {
                String valueOf2 = String.valueOf(e9.getMessage());
                Log.w("DynamiteModule", valueOf2.length() != 0 ? "Failed to load remote module: ".concat(valueOf2) : new String("Failed to load remote module: "));
                int i14 = a7.f2507a;
                if (i14 == 0 || bVar.a(context, str, new l(i14, 0)).f2509c != -1) {
                    throw new a("Remote load failed. No local fallback found.", e9, null);
                }
                DynamiteModule i15 = i(context, str);
                ThreadLocal<Long> threadLocal3 = f2499l;
                if (longValue == 0) {
                    threadLocal3.remove();
                } else {
                    threadLocal3.set(Long.valueOf(longValue));
                }
                Cursor cursor4 = kVar2.f2505a;
                if (cursor4 != null) {
                    cursor4.close();
                }
                f2498k.set(kVar);
                return i15;
            }
        } catch (Throwable th2) {
            ThreadLocal<Long> threadLocal4 = f2499l;
            if (longValue == 0) {
                threadLocal4.remove();
            } else {
                threadLocal4.set(Long.valueOf(longValue));
            }
            Cursor cursor5 = kVar2.f2505a;
            if (cursor5 != null) {
                cursor5.close();
            }
            f2498k.set(kVar);
            throw th2;
        }
    }

    public static int f(@RecentlyNonNull Context context, @RecentlyNonNull String str, boolean z6) {
        Field declaredField;
        ClassLoader aVar;
        Throwable th;
        RemoteException e7;
        try {
            synchronized (DynamiteModule.class) {
                Boolean bool = f2495h;
                if (bool == null) {
                    try {
                        declaredField = context.getApplicationContext().getClassLoader().loadClass(DynamiteLoaderClassLoader.class.getName()).getDeclaredField("sClassLoader");
                    } catch (ClassNotFoundException | IllegalAccessException | NoSuchFieldException e8) {
                        String valueOf = String.valueOf(e8);
                        StringBuilder sb = new StringBuilder(valueOf.length() + 30);
                        sb.append("Failed to load module via V2: ");
                        sb.append(valueOf);
                        Log.w("DynamiteModule", sb.toString());
                        bool = Boolean.FALSE;
                    }
                    synchronized (declaredField.getDeclaringClass()) {
                        ClassLoader classLoader = (ClassLoader) declaredField.get(null);
                        if (classLoader != null) {
                            if (classLoader != ClassLoader.getSystemClassLoader()) {
                                try {
                                    j(classLoader);
                                } catch (a unused) {
                                }
                                bool = Boolean.TRUE;
                                f2495h = bool;
                            }
                        } else if ("com.google.android.gms".equals(context.getApplicationContext().getPackageName())) {
                            declaredField.set(null, ClassLoader.getSystemClassLoader());
                        } else {
                            try {
                                int g7 = g(context, str, z6);
                                String str2 = f2496i;
                                if (str2 != null && !str2.isEmpty()) {
                                    if (Build.VERSION.SDK_INT >= 29) {
                                        String str3 = f2496i;
                                        r3.o.i(str3);
                                        aVar = new DelegateLastClassLoader(str3, ClassLoader.getSystemClassLoader());
                                    } else {
                                        String str4 = f2496i;
                                        r3.o.i(str4);
                                        aVar = new com.google.android.gms.dynamite.a(str4, ClassLoader.getSystemClassLoader());
                                    }
                                    j(aVar);
                                    declaredField.set(null, aVar);
                                    f2495h = Boolean.TRUE;
                                    return g7;
                                }
                                return g7;
                            } catch (a unused2) {
                                declaredField.set(null, ClassLoader.getSystemClassLoader());
                            }
                        }
                        bool = Boolean.FALSE;
                        f2495h = bool;
                    }
                }
                boolean booleanValue = bool.booleanValue();
                int i7 = 0;
                if (booleanValue) {
                    try {
                        return g(context, str, z6);
                    } catch (a e9) {
                        String valueOf2 = String.valueOf(e9.getMessage());
                        Log.w("DynamiteModule", valueOf2.length() != 0 ? "Failed to retrieve remote module version: ".concat(valueOf2) : new String("Failed to retrieve remote module version: "));
                        return 0;
                    }
                }
                o k7 = k(context);
                if (k7 != null) {
                    try {
                        try {
                            int C5 = k7.C5();
                            if (C5 >= 3) {
                                Cursor cursor = (Cursor) x3.b.O0(k7.k6(x3.b.B3(context), str, z6, f2499l.get().longValue()));
                                if (cursor != null) {
                                    try {
                                        if (cursor.moveToFirst()) {
                                            int i8 = cursor.getInt(0);
                                            r2 = (i8 <= 0 || !h(cursor)) ? cursor : null;
                                            if (r2 != null) {
                                                r2.close();
                                            }
                                            i7 = i8;
                                        }
                                    } catch (RemoteException e10) {
                                        e7 = e10;
                                        r2 = cursor;
                                        String valueOf3 = String.valueOf(e7.getMessage());
                                        Log.w("DynamiteModule", valueOf3.length() != 0 ? "Failed to retrieve remote module version: ".concat(valueOf3) : new String("Failed to retrieve remote module version: "));
                                        if (r2 != null) {
                                            r2.close();
                                        }
                                        return i7;
                                    } catch (Throwable th2) {
                                        th = th2;
                                        r2 = cursor;
                                        if (r2 != null) {
                                            r2.close();
                                        }
                                        throw th;
                                    }
                                }
                                Log.w("DynamiteModule", "Failed to retrieve remote module version.");
                                if (cursor != null) {
                                    cursor.close();
                                }
                            } else if (C5 == 2) {
                                Log.w("DynamiteModule", "IDynamite loader version = 2, no high precision latency measurement.");
                                i7 = k7.o4(x3.b.B3(context), str, z6);
                            } else {
                                Log.w("DynamiteModule", "IDynamite loader version < 2, falling back to getModuleVersion2");
                                i7 = k7.B3(x3.b.B3(context), str, z6);
                            }
                        } catch (RemoteException e11) {
                            e7 = e11;
                        }
                    } catch (Throwable th3) {
                        th = th3;
                    }
                }
                return i7;
            }
        } catch (Throwable th4) {
            v3.f.a(context, th4);
            throw th4;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0074, code lost:
    
        if (h(r9) != false) goto L26;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00a9  */
    /* JADX WARN: Type inference failed for: r0v0, types: [com.google.android.gms.dynamite.b] */
    /* JADX WARN: Type inference failed for: r0v1, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r0v2 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static int g(Context context, String str, boolean z6) {
        Throwable th;
        Exception e7;
        ?? r02 = 0;
        Cursor cursor = null;
        try {
            try {
                Cursor query = context.getContentResolver().query(new Uri.Builder().scheme("content").authority("com.google.android.gms.chimera").path(true != z6 ? "api" : "api_force_staging").appendPath(str).appendQueryParameter("requestStartTime", String.valueOf(f2499l.get().longValue())).build(), null, null, null, null);
                if (query != null) {
                    try {
                        if (query.moveToFirst()) {
                            int i7 = query.getInt(0);
                            if (i7 > 0) {
                                synchronized (DynamiteModule.class) {
                                    f2496i = query.getString(2);
                                    int columnIndex = query.getColumnIndex("loaderVersion");
                                    if (columnIndex >= 0) {
                                        f2497j = query.getInt(columnIndex);
                                    }
                                }
                            }
                            cursor = query;
                            if (cursor != null) {
                                cursor.close();
                            }
                            return i7;
                        }
                    } catch (Exception e8) {
                        e7 = e8;
                        if (e7 instanceof a) {
                            throw e7;
                        }
                        throw new a("V2 version check failed", e7, r02);
                    }
                }
                Log.w("DynamiteModule", "Failed to retrieve remote module version.");
                throw new a("Failed to connect to dynamite module ContentResolver.", r02);
            } catch (Throwable th2) {
                th = th2;
                r02 = context;
                if (r02 != 0) {
                    r02.close();
                }
                throw th;
            }
        } catch (Exception e9) {
            e7 = e9;
        } catch (Throwable th3) {
            th = th3;
            if (r02 != 0) {
            }
            throw th;
        }
    }

    private static boolean h(Cursor cursor) {
        k kVar = f2498k.get();
        if (kVar == null || kVar.f2505a != null) {
            return false;
        }
        kVar.f2505a = cursor;
        return true;
    }

    private static DynamiteModule i(Context context, String str) {
        String valueOf = String.valueOf(str);
        Log.i("DynamiteModule", valueOf.length() != 0 ? "Selected local version of ".concat(valueOf) : new String("Selected local version of "));
        return new DynamiteModule(context.getApplicationContext());
    }

    private static void j(ClassLoader classLoader) {
        p pVar;
        com.google.android.gms.dynamite.b bVar = null;
        try {
            IBinder iBinder = (IBinder) classLoader.loadClass("com.google.android.gms.dynamiteloader.DynamiteLoaderV2").getConstructor(new Class[0]).newInstance(new Object[0]);
            if (iBinder == null) {
                pVar = null;
            } else {
                IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamite.IDynamiteLoaderV2");
                pVar = queryLocalInterface instanceof p ? (p) queryLocalInterface : new p(iBinder);
            }
            f2503p = pVar;
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException e7) {
            throw new a("Failed to instantiate dynamite loader", e7, bVar);
        }
    }

    private static o k(Context context) {
        o oVar;
        synchronized (DynamiteModule.class) {
            o oVar2 = f2502o;
            if (oVar2 != null) {
                return oVar2;
            }
            try {
                IBinder iBinder = (IBinder) context.createPackageContext("com.google.android.gms", 3).getClassLoader().loadClass("com.google.android.gms.chimera.container.DynamiteLoaderImpl").newInstance();
                if (iBinder == null) {
                    oVar = null;
                } else {
                    IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamite.IDynamiteLoader");
                    oVar = queryLocalInterface instanceof o ? (o) queryLocalInterface : new o(iBinder);
                }
                if (oVar != null) {
                    f2502o = oVar;
                    return oVar;
                }
            } catch (Exception e7) {
                String valueOf = String.valueOf(e7.getMessage());
                Log.e("DynamiteModule", valueOf.length() != 0 ? "Failed to load IDynamiteLoader from GmsCore: ".concat(valueOf) : new String("Failed to load IDynamiteLoader from GmsCore: "));
            }
            return null;
        }
    }

    @RecentlyNonNull
    public Context b() {
        return this.f2504a;
    }

    @RecentlyNonNull
    public IBinder d(@RecentlyNonNull String str) {
        try {
            return (IBinder) this.f2504a.getClassLoader().loadClass(str).newInstance();
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException e7) {
            String valueOf = String.valueOf(str);
            throw new a(valueOf.length() != 0 ? "Failed to instantiate module class: ".concat(valueOf) : new String("Failed to instantiate module class: "), e7, null);
        }
    }
}
