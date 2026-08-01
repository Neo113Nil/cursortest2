package k7;

import android.content.ContentProviderClient;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.ProviderInfo;
import android.database.Cursor;
import android.database.MatrixCursor;
import android.net.Uri;
import android.os.Build;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.os.SystemClock;
import android.util.Log;
import c7.c0;
import com.google.android.gms.dynamite.DynamiteModule$DynamiteLoaderClassLoader;
import com.google.android.gms.internal.measurement.g0;
import com.google.android.gms.internal.measurement.zf;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class c {

    /* renamed from: e, reason: collision with root package name */
    public static Boolean f5488e = null;

    /* renamed from: f, reason: collision with root package name */
    public static String f5489f = null;
    public static boolean g = false;

    /* renamed from: h, reason: collision with root package name */
    public static int f5490h = -1;

    /* renamed from: i, reason: collision with root package name */
    public static Boolean f5491i;

    /* renamed from: m, reason: collision with root package name */
    public static i f5494m;

    /* renamed from: n, reason: collision with root package name */
    public static j f5495n;

    /* renamed from: a, reason: collision with root package name */
    public final Context f5496a;
    public static final ThreadLocal j = new ThreadLocal();

    /* renamed from: k, reason: collision with root package name */
    public static final g0 f5492k = new g0(4);

    /* renamed from: l, reason: collision with root package name */
    public static final k5.c f5493l = new k5.c(3);

    /* renamed from: b, reason: collision with root package name */
    public static final k5.c f5485b = new k5.c(4);

    /* renamed from: c, reason: collision with root package name */
    public static final k5.c f5486c = new k5.c(5);

    /* renamed from: d, reason: collision with root package name */
    public static final k5.c f5487d = new k5.c(6);

    public c(Context context) {
        this.f5496a = context;
    }

    public static int a(Context context, String str) {
        try {
            ClassLoader classLoader = context.getApplicationContext().getClassLoader();
            StringBuilder sb2 = new StringBuilder(str.length() + 61);
            sb2.append("com.google.android.gms.dynamite.descriptors.");
            sb2.append(str);
            sb2.append(".ModuleDescriptor");
            Class<?> loadClass = classLoader.loadClass(sb2.toString());
            Field declaredField = loadClass.getDeclaredField("MODULE_ID");
            Field declaredField2 = loadClass.getDeclaredField("MODULE_VERSION");
            if (c0.k(declaredField.get(null), str)) {
                return declaredField2.getInt(null);
            }
            String valueOf = String.valueOf(declaredField.get(null));
            StringBuilder sb3 = new StringBuilder(valueOf.length() + 50 + str.length() + 1);
            sb3.append("Module descriptor id '");
            sb3.append(valueOf);
            sb3.append("' didn't match expected id '");
            sb3.append(str);
            sb3.append("'");
            Log.e("DynamiteModule", sb3.toString());
            return 0;
        } catch (ClassNotFoundException unused) {
            StringBuilder sb4 = new StringBuilder(str.length() + 45);
            sb4.append("Local module descriptor class for ");
            sb4.append(str);
            sb4.append(" not found.");
            Log.w("DynamiteModule", sb4.toString());
            return 0;
        } catch (Exception e2) {
            Log.e("DynamiteModule", "Failed to load module descriptor class: ".concat(String.valueOf(e2.getMessage())));
            return 0;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:69:0x02fa A[DONT_GENERATE] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0309 A[DONT_GENERATE] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0300 A[DONT_GENERATE] */
    /* JADX WARN: Type inference failed for: r7v1, types: [com.google.android.gms.internal.measurement.g0, java.lang.ThreadLocal] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static c c(Context context, k5.c cVar, String str) {
        Context context2;
        int i3;
        c cVar2;
        int i10;
        j7.a I;
        j jVar;
        boolean z10;
        j7.a I2;
        Context applicationContext = context.getApplicationContext();
        if (applicationContext == null) {
            throw new a("null application Context");
        }
        ThreadLocal threadLocal = j;
        g gVar = (g) threadLocal.get();
        g gVar2 = new g();
        threadLocal.set(gVar2);
        ?? r72 = f5492k;
        Long l10 = (Long) r72.get();
        long longValue = l10.longValue();
        try {
            r72.set(Long.valueOf(SystemClock.uptimeMillis()));
            zf k10 = cVar.k(context, str, f5493l);
            int i11 = k10.f3051a;
            int i12 = k10.f3052b;
            StringBuilder sb2 = new StringBuilder(str.length() + 26 + String.valueOf(i11).length() + 19 + str.length() + 1 + String.valueOf(i12).length());
            sb2.append("Considering local module ");
            sb2.append(str);
            sb2.append(":");
            sb2.append(i11);
            sb2.append(" and remote module ");
            sb2.append(str);
            sb2.append(":");
            sb2.append(i12);
            Log.i("DynamiteModule", sb2.toString());
            int i13 = k10.f3053c;
            if (i13 != 0) {
                if (i13 == -1) {
                    if (k10.f3051a != 0) {
                        i13 = -1;
                    }
                }
                if (i13 != 1 || k10.f3052b != 0) {
                    if (i13 == -1) {
                        Log.i("DynamiteModule", "Selected local version of ".concat(str));
                        c cVar3 = new c(applicationContext);
                        if (longValue == 0) {
                            r72.remove();
                        } else {
                            r72.set(l10);
                        }
                        Cursor cursor = gVar2.f5499a;
                        if (cursor != null) {
                            cursor.close();
                        }
                        threadLocal.set(gVar);
                        return cVar3;
                    }
                    if (i13 != 1) {
                        StringBuilder sb3 = new StringBuilder(String.valueOf(i13).length() + 36);
                        sb3.append("VersionPolicy returned invalid code:");
                        sb3.append(i13);
                        throw new a(sb3.toString());
                    }
                    try {
                        try {
                            i10 = k10.f3052b;
                        } catch (a e2) {
                            e = e2;
                            context2 = context;
                            String message = e.getMessage();
                            StringBuilder sb4 = new StringBuilder(String.valueOf(message).length() + 30);
                            sb4.append("Failed to load remote module: ");
                            sb4.append(message);
                            Log.w("DynamiteModule", sb4.toString());
                            i3 = k10.f3051a;
                            if (i3 != 0 || cVar.k(context2, str, new h(i3)).f3053c != -1) {
                                throw new a("Remote load failed. No local fallback found.", e);
                            }
                            Log.i("DynamiteModule", "Selected local version of ".concat(str));
                            cVar2 = new c(applicationContext);
                            return cVar2;
                        }
                    } catch (a e9) {
                        e = e9;
                        context2 = r72;
                        String message2 = e.getMessage();
                        StringBuilder sb42 = new StringBuilder(String.valueOf(message2).length() + 30);
                        sb42.append("Failed to load remote module: ");
                        sb42.append(message2);
                        Log.w("DynamiteModule", sb42.toString());
                        i3 = k10.f3051a;
                        if (i3 != 0) {
                        }
                        throw new a("Remote load failed. No local fallback found.", e);
                    }
                    try {
                        try {
                            try {
                                synchronized (c.class) {
                                    try {
                                        if (!e(context)) {
                                            throw new a("Remote loading disabled");
                                        }
                                        Boolean bool = f5488e;
                                        if (bool == null) {
                                            throw new a("Failed to determine which loading route to use.");
                                        }
                                        if (bool.booleanValue()) {
                                            StringBuilder sb5 = new StringBuilder(str.length() + 40 + String.valueOf(i10).length());
                                            sb5.append("Selected remote version of ");
                                            sb5.append(str);
                                            sb5.append(", version >= ");
                                            sb5.append(i10);
                                            Log.i("DynamiteModule", sb5.toString());
                                            synchronized (c.class) {
                                                jVar = f5495n;
                                            }
                                            if (jVar == null) {
                                                throw new a("DynamiteLoaderV2 was not cached.");
                                            }
                                            g gVar3 = (g) threadLocal.get();
                                            if (gVar3 == null || gVar3.f5499a == null) {
                                                throw new a("No result cursor");
                                            }
                                            Context applicationContext2 = context.getApplicationContext();
                                            Cursor cursor2 = gVar3.f5499a;
                                            new j7.b(null);
                                            synchronized (c.class) {
                                                z10 = f5490h >= 2;
                                            }
                                            if (z10) {
                                                Log.v("DynamiteModule", "Dynamite loader version >= 2, using loadModule2NoCrashUtils");
                                                I2 = jVar.J(new j7.b(applicationContext2), str, i10, new j7.b(cursor2));
                                            } else {
                                                Log.w("DynamiteModule", "Dynamite loader version < 2, falling back to loadModule2");
                                                I2 = jVar.I(new j7.b(applicationContext2), str, i10, new j7.b(cursor2));
                                            }
                                            Context context3 = (Context) j7.b.F(I2);
                                            if (context3 == null) {
                                                throw new a("Failed to get module context");
                                            }
                                            cVar2 = new c(context3);
                                        } else {
                                            StringBuilder sb6 = new StringBuilder(str.length() + 40 + String.valueOf(i10).length());
                                            sb6.append("Selected remote version of ");
                                            sb6.append(str);
                                            sb6.append(", version >= ");
                                            sb6.append(i10);
                                            Log.i("DynamiteModule", sb6.toString());
                                            i h10 = h(context);
                                            if (h10 == null) {
                                                throw new a("Failed to create IDynamiteLoader.");
                                            }
                                            Parcel D = h10.D(h10.F(), 6);
                                            int readInt = D.readInt();
                                            D.recycle();
                                            if (readInt >= 3) {
                                                g gVar4 = (g) threadLocal.get();
                                                if (gVar4 == null) {
                                                    throw new a("No cached result cursor holder");
                                                }
                                                I = h10.L(new j7.b(context), str, i10, new j7.b(gVar4.f5499a));
                                            } else if (readInt == 2) {
                                                Log.w("DynamiteModule", "IDynamite loader version = 2");
                                                I = h10.J(new j7.b(context), str, i10);
                                            } else {
                                                Log.w("DynamiteModule", "Dynamite loader version < 2, falling back to createModuleContext");
                                                I = h10.I(new j7.b(context), str, i10);
                                            }
                                            Object F = j7.b.F(I);
                                            if (F == null) {
                                                throw new a("Failed to load remote module.");
                                            }
                                            cVar2 = new c((Context) F);
                                        }
                                        return cVar2;
                                    } catch (Throwable th) {
                                        th = th;
                                        throw th;
                                    }
                                }
                            } catch (Throwable th2) {
                                th = th2;
                            }
                        } catch (RemoteException e10) {
                            e = e10;
                            throw new a("Failed to load remote module.", e);
                        } catch (a e11) {
                            throw e11;
                        } catch (Throwable th3) {
                            th = th3;
                            throw new a("Failed to load remote module.", th);
                        }
                    } catch (RemoteException e12) {
                        e = e12;
                        throw new a("Failed to load remote module.", e);
                    } catch (a e13) {
                        throw e13;
                    } catch (Throwable th4) {
                        th = th4;
                        throw new a("Failed to load remote module.", th);
                    }
                }
            }
            int i14 = k10.f3051a;
            int i15 = k10.f3052b;
            StringBuilder sb7 = new StringBuilder(str.length() + 46 + String.valueOf(i14).length() + 23 + String.valueOf(i15).length() + 1);
            sb7.append("No acceptable module ");
            sb7.append(str);
            sb7.append(" found. Local version is ");
            sb7.append(i14);
            sb7.append(" and remote version is ");
            sb7.append(i15);
            sb7.append(".");
            throw new a(sb7.toString());
        } finally {
            if (longValue == 0) {
                f5492k.remove();
            } else {
                f5492k.set(l10);
            }
            Cursor cursor3 = gVar2.f5499a;
            if (cursor3 != null) {
                cursor3.close();
            }
            j.set(gVar);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:43:0x018e, code lost:
    
        if (r4 != false) goto L103;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int d(String str, boolean z10, Context context) {
        Field declaredField;
        Throwable th;
        RemoteException remoteException;
        int readInt;
        Cursor cursor;
        try {
            synchronized (c.class) {
                Boolean bool = f5488e;
                boolean z11 = true;
                Cursor cursor2 = null;
                if (bool == null) {
                    try {
                        declaredField = context.getApplicationContext().getClassLoader().loadClass(DynamiteModule$DynamiteLoaderClassLoader.class.getName()).getDeclaredField("sClassLoader");
                    } catch (ClassNotFoundException | IllegalAccessException | NoSuchFieldException e2) {
                        String obj = e2.toString();
                        StringBuilder sb2 = new StringBuilder(obj.length() + 30);
                        sb2.append("Failed to load module via V2: ");
                        sb2.append(obj);
                        Log.w("DynamiteModule", sb2.toString());
                        bool = Boolean.FALSE;
                    }
                    synchronized (declaredField.getDeclaringClass()) {
                        ClassLoader classLoader = (ClassLoader) declaredField.get(null);
                        if (classLoader == ClassLoader.getSystemClassLoader()) {
                            bool = Boolean.FALSE;
                        } else if (classLoader != null) {
                            try {
                                g(classLoader);
                            } catch (a unused) {
                            }
                            bool = Boolean.TRUE;
                        } else {
                            if (!e(context)) {
                                return 0;
                            }
                            if (!g) {
                                Boolean bool2 = Boolean.TRUE;
                                if (!bool2.equals(null)) {
                                    try {
                                        int f3 = f(context, str, z10, true);
                                        String str2 = f5489f;
                                        if (str2 != null && !str2.isEmpty()) {
                                            ClassLoader U = e.U();
                                            if (U == null) {
                                                if (Build.VERSION.SDK_INT >= 29) {
                                                    e1.g.b();
                                                    String str3 = f5489f;
                                                    c0.g(str3);
                                                    U = e1.g.a(str3, ClassLoader.getSystemClassLoader());
                                                } else {
                                                    String str4 = f5489f;
                                                    c0.g(str4);
                                                    U = new f(str4, ClassLoader.getSystemClassLoader());
                                                }
                                            }
                                            g(U);
                                            declaredField.set(null, U);
                                            f5488e = bool2;
                                            return f3;
                                        }
                                        return f3;
                                    } catch (a unused2) {
                                        declaredField.set(null, ClassLoader.getSystemClassLoader());
                                        bool = Boolean.FALSE;
                                    }
                                }
                            }
                            declaredField.set(null, ClassLoader.getSystemClassLoader());
                            bool = Boolean.FALSE;
                        }
                        f5488e = bool;
                    }
                }
                if (bool.booleanValue()) {
                    try {
                        return f(context, str, z10, false);
                    } catch (a e9) {
                        String message = e9.getMessage();
                        StringBuilder sb3 = new StringBuilder(String.valueOf(message).length() + 42);
                        sb3.append("Failed to retrieve remote module version: ");
                        sb3.append(message);
                        Log.w("DynamiteModule", sb3.toString());
                        return 0;
                    }
                }
                i h10 = h(context);
                try {
                    if (h10 == null) {
                        return 0;
                    }
                    try {
                        Parcel D = h10.D(h10.F(), 6);
                        int readInt2 = D.readInt();
                        D.recycle();
                        if (readInt2 >= 3) {
                            ThreadLocal threadLocal = j;
                            g gVar = (g) threadLocal.get();
                            if (gVar != null && (cursor = gVar.f5499a) != null) {
                                return cursor.getInt(0);
                            }
                            Cursor cursor3 = (Cursor) j7.b.F(h10.K(new j7.b(context), str, z10, ((Long) f5492k.get()).longValue()));
                            if (cursor3 != null) {
                                try {
                                    if (cursor3.moveToFirst()) {
                                        readInt = cursor3.getInt(0);
                                        if (readInt > 0) {
                                            g gVar2 = (g) threadLocal.get();
                                            if (gVar2 == null || gVar2.f5499a != null) {
                                                z11 = false;
                                            } else {
                                                gVar2.f5499a = cursor3;
                                            }
                                        }
                                        cursor2 = cursor3;
                                        if (cursor2 != null) {
                                            cursor2.close();
                                        }
                                    }
                                } catch (RemoteException e10) {
                                    remoteException = e10;
                                    cursor2 = cursor3;
                                    String message2 = remoteException.getMessage();
                                    StringBuilder sb4 = new StringBuilder(String.valueOf(message2).length() + 42);
                                    sb4.append("Failed to retrieve remote module version: ");
                                    sb4.append(message2);
                                    Log.w("DynamiteModule", sb4.toString());
                                    if (cursor2 == null) {
                                        return 0;
                                    }
                                    cursor2.close();
                                    return 0;
                                } catch (Throwable th2) {
                                    th = th2;
                                    cursor2 = cursor3;
                                    if (cursor2 == null) {
                                        throw th;
                                    }
                                    cursor2.close();
                                    throw th;
                                }
                            }
                            Log.w("DynamiteModule", "Failed to retrieve remote module version.");
                            if (cursor3 == null) {
                                return 0;
                            }
                            cursor3.close();
                            return 0;
                        }
                        if (readInt2 == 2) {
                            Log.w("DynamiteModule", "IDynamite loader version = 2, no high precision latency measurement.");
                            j7.b bVar = new j7.b(context);
                            Parcel F = h10.F();
                            o7.h.b(F, bVar);
                            F.writeString(str);
                            F.writeInt(z10 ? 1 : 0);
                            Parcel D2 = h10.D(F, 5);
                            readInt = D2.readInt();
                            D2.recycle();
                        } else {
                            Log.w("DynamiteModule", "IDynamite loader version < 2, falling back to getModuleVersion2");
                            j7.b bVar2 = new j7.b(context);
                            Parcel F2 = h10.F();
                            o7.h.b(F2, bVar2);
                            F2.writeString(str);
                            F2.writeInt(z10 ? 1 : 0);
                            Parcel D3 = h10.D(F2, 3);
                            readInt = D3.readInt();
                            D3.recycle();
                        }
                        return readInt;
                    } catch (RemoteException e11) {
                        remoteException = e11;
                    }
                } catch (Throwable th3) {
                    th = th3;
                }
            }
        } finally {
        }
    }

    public static boolean e(Context context) {
        ApplicationInfo applicationInfo;
        Boolean bool = Boolean.TRUE;
        if (bool.equals(null) || bool.equals(f5491i)) {
            return true;
        }
        boolean z10 = false;
        if (f5491i == null) {
            ProviderInfo resolveContentProvider = context.getPackageManager().resolveContentProvider("com.google.android.gms.chimera", Build.VERSION.SDK_INT >= 29 ? 268435456 : 0);
            if (z6.g.f10882b.b(context, 10000000) == 0 && resolveContentProvider != null && "com.google.android.gms".equals(resolveContentProvider.packageName)) {
                z10 = true;
            }
            f5491i = Boolean.valueOf(z10);
            if (z10 && (applicationInfo = resolveContentProvider.applicationInfo) != null && (applicationInfo.flags & 129) == 0) {
                Log.i("DynamiteModule", "Non-system-image GmsCore APK, forcing V1");
                g = true;
            }
        }
        if (!z10) {
            Log.e("DynamiteModule", "Invalid GmsCore APK, remote loading disabled.");
        }
        return z10;
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x0137, code lost:
    
        if (r6 != false) goto L92;
     */
    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Removed duplicated region for block: B:14:0x00e7 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int f(Context context, String str, boolean z10, boolean z11) {
        Exception exc;
        Throwable th;
        Cursor query;
        MatrixCursor matrixCursor;
        boolean z12;
        MatrixCursor matrixCursor2 = null;
        try {
            try {
                boolean z13 = true;
                Uri build = new Uri.Builder().scheme("content").authority("com.google.android.gms.chimera").path(true != z10 ? "api" : "api_force_staging").appendPath(str).appendQueryParameter("requestStartUptime", String.valueOf(((Long) f5492k.get()).longValue())).build();
                ContentProviderClient acquireUnstableContentProviderClient = context.getContentResolver().acquireUnstableContentProviderClient(build);
                boolean z14 = false;
                if (acquireUnstableContentProviderClient != null) {
                    try {
                        query = acquireUnstableContentProviderClient.query(build, null, null, null, null);
                    } catch (RemoteException unused) {
                    } catch (Throwable th2) {
                        acquireUnstableContentProviderClient.release();
                        throw th2;
                    }
                    if (query != null) {
                        try {
                            int count = query.getCount();
                            int columnCount = query.getColumnCount();
                            matrixCursor = new MatrixCursor(query.getColumnNames(), count);
                            for (int i3 = 0; i3 < count; i3++) {
                                if (!query.moveToPosition(i3)) {
                                    throw new RemoteException("Cursor read incomplete (ContentProvider dead?)");
                                }
                                Object[] objArr = new Object[columnCount];
                                for (int i10 = 0; i10 < columnCount; i10++) {
                                    int type = query.getType(i10);
                                    if (type == 0) {
                                        objArr[i10] = null;
                                    } else if (type == 1) {
                                        objArr[i10] = Long.valueOf(query.getLong(i10));
                                    } else if (type == 2) {
                                        objArr[i10] = Double.valueOf(query.getDouble(i10));
                                    } else if (type == 3) {
                                        objArr[i10] = query.getString(i10);
                                    } else {
                                        if (type != 4) {
                                            throw new RemoteException("Unknown column type");
                                        }
                                        objArr[i10] = query.getBlob(i10);
                                    }
                                }
                                matrixCursor.addRow(objArr);
                            }
                            query.close();
                            acquireUnstableContentProviderClient.release();
                            if (matrixCursor != null) {
                                try {
                                    if (matrixCursor.moveToFirst()) {
                                        int i11 = matrixCursor.getInt(0);
                                        if (i11 > 0) {
                                            synchronized (c.class) {
                                                try {
                                                    f5489f = matrixCursor.getString(2);
                                                    int columnIndex = matrixCursor.getColumnIndex("loaderVersion");
                                                    if (columnIndex >= 0) {
                                                        f5490h = matrixCursor.getInt(columnIndex);
                                                    }
                                                    int columnIndex2 = matrixCursor.getColumnIndex("disableStandaloneDynamiteLoader2");
                                                    if (columnIndex2 >= 0) {
                                                        z12 = matrixCursor.getInt(columnIndex2) != 0;
                                                        g = z12;
                                                    } else {
                                                        z12 = false;
                                                    }
                                                } finally {
                                                }
                                            }
                                            g gVar = (g) j.get();
                                            if (gVar == null || gVar.f5499a != null) {
                                                z13 = false;
                                            } else {
                                                gVar.f5499a = matrixCursor;
                                            }
                                            z14 = z12;
                                        }
                                        matrixCursor2 = matrixCursor;
                                        if (z11 && z14) {
                                            throw new a("forcing fallback to container DynamiteLoader impl");
                                        }
                                        if (matrixCursor2 != null) {
                                            matrixCursor2.close();
                                        }
                                        return i11;
                                    }
                                } catch (Exception e2) {
                                    exc = e2;
                                    if (exc instanceof a) {
                                        throw exc;
                                    }
                                    String message = exc.getMessage();
                                    StringBuilder sb2 = new StringBuilder(String.valueOf(message).length() + 25);
                                    sb2.append("V2 version check failed: ");
                                    sb2.append(message);
                                    throw new a(sb2.toString(), exc);
                                } catch (Throwable th3) {
                                    th = th3;
                                    matrixCursor2 = matrixCursor;
                                    if (matrixCursor2 == null) {
                                        throw th;
                                    }
                                    matrixCursor2.close();
                                    throw th;
                                }
                            }
                            Log.w("DynamiteModule", "Failed to retrieve remote module version.");
                            throw new a("Failed to connect to dynamite module ContentResolver.");
                        } catch (Throwable th4) {
                            try {
                                query.close();
                                throw th4;
                            } catch (Throwable th5) {
                                th4.addSuppressed(th5);
                                throw th4;
                            }
                        }
                    }
                    acquireUnstableContentProviderClient.release();
                }
                matrixCursor = null;
                if (matrixCursor != null) {
                }
                Log.w("DynamiteModule", "Failed to retrieve remote module version.");
                throw new a("Failed to connect to dynamite module ContentResolver.");
            } catch (Throwable th6) {
                th = th6;
            }
        } catch (Exception e9) {
            exc = e9;
        }
    }

    public static void g(ClassLoader classLoader) {
        try {
            j jVar = null;
            IBinder iBinder = (IBinder) classLoader.loadClass("com.google.android.gms.dynamiteloader.DynamiteLoaderV2").getConstructor(null).newInstance(null);
            if (iBinder != null) {
                IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamite.IDynamiteLoaderV2");
                jVar = queryLocalInterface instanceof j ? (j) queryLocalInterface : new j(iBinder, "com.google.android.gms.dynamite.IDynamiteLoaderV2", 2);
            }
            f5495n = jVar;
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException e2) {
            throw new a("Failed to instantiate dynamite loader", e2);
        }
    }

    public static i h(Context context) {
        i iVar;
        synchronized (c.class) {
            i iVar2 = f5494m;
            if (iVar2 != null) {
                return iVar2;
            }
            try {
                IBinder iBinder = (IBinder) context.createPackageContext("com.google.android.gms", 3).getClassLoader().loadClass("com.google.android.gms.chimera.container.DynamiteLoaderImpl").newInstance();
                if (iBinder == null) {
                    iVar = null;
                } else {
                    IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamite.IDynamiteLoader");
                    iVar = queryLocalInterface instanceof i ? (i) queryLocalInterface : new i(iBinder, "com.google.android.gms.dynamite.IDynamiteLoader", 2);
                }
                if (iVar != null) {
                    f5494m = iVar;
                    return iVar;
                }
            } catch (Exception e2) {
                String message = e2.getMessage();
                StringBuilder sb2 = new StringBuilder(String.valueOf(message).length() + 45);
                sb2.append("Failed to load IDynamiteLoader from GmsCore: ");
                sb2.append(message);
                Log.e("DynamiteModule", sb2.toString());
            }
            return null;
        }
    }

    public final IBinder b(String str) {
        try {
            return (IBinder) this.f5496a.getClassLoader().loadClass(str).newInstance();
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException e2) {
            throw new a("Failed to instantiate module class: ".concat(str), e2);
        }
    }
}
