package defpackage;

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
import com.google.android.gms.dynamite.DynamiteModule$DynamiteLoaderClassLoader;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class ye0 {
    public static Boolean e = null;
    public static String f = null;
    public static boolean g = false;
    public static int h = -1;
    public static Boolean i;
    public static fq3 m;
    public static ir3 n;
    public final Context a;
    public static final ThreadLocal j = new ThreadLocal();
    public static final vb k = new vb(3);
    public static final le3 l = new le3(29);
    public static final gg3 b = new gg3(17);
    public static final gg3 c = new gg3(18);
    public static final gg3 d = new gg3(19);

    public ye0(Context context) {
        this.a = context;
    }

    public static int a(Context context, String str) {
        try {
            Class<?> loadClass = context.getApplicationContext().getClassLoader().loadClass("com.google.android.gms.dynamite.descriptors." + str + ".ModuleDescriptor");
            Field declaredField = loadClass.getDeclaredField("MODULE_ID");
            Field declaredField2 = loadClass.getDeclaredField("MODULE_VERSION");
            if (ll3.C(declaredField.get(null), str)) {
                return declaredField2.getInt(null);
            }
            Log.e("DynamiteModule", "Module descriptor id '" + String.valueOf(declaredField.get(null)) + "' didn't match expected id '" + str + "'");
            return 0;
        } catch (ClassNotFoundException unused) {
            Log.w("DynamiteModule", "Local module descriptor class for " + str + " not found.");
            return 0;
        } catch (Exception e2) {
            Log.e("DynamiteModule", "Failed to load module descriptor class: ".concat(String.valueOf(e2.getMessage())));
            return 0;
        }
    }

    public static ye0 c(Context context, gg3 gg3Var, String str) {
        long j2;
        ye0 ye0Var;
        Boolean bool;
        b01 J;
        ye0 ye0Var2;
        ir3 ir3Var;
        boolean z;
        b01 J2;
        Context applicationContext = context.getApplicationContext();
        if (applicationContext == null) {
            throw new ve0("null application Context");
        }
        ThreadLocal threadLocal = j;
        bn3 bn3Var = (bn3) threadLocal.get();
        bn3 bn3Var2 = new bn3();
        threadLocal.set(bn3Var2);
        vb vbVar = k;
        Long l2 = (Long) vbVar.get();
        long longValue = l2.longValue();
        try {
            vbVar.set(Long.valueOf(SystemClock.uptimeMillis()));
            xe0 a = gg3Var.a(context, str, l);
            j2 = longValue;
            try {
                Log.i("DynamiteModule", "Considering local module " + str + ":" + a.a + " and remote module " + str + ":" + a.b);
                int i2 = a.c;
                if (i2 != 0) {
                    if (i2 == -1) {
                        if (a.a != 0) {
                            i2 = -1;
                        }
                    }
                    if (i2 != 1 || a.b != 0) {
                        if (i2 == -1) {
                            Log.i("DynamiteModule", "Selected local version of ".concat(str));
                            ye0Var = new ye0(applicationContext);
                        } else {
                            if (i2 != 1) {
                                throw new ve0("VersionPolicy returned invalid code:" + i2);
                            }
                            try {
                                int i3 = a.b;
                                try {
                                    synchronized (ye0.class) {
                                        if (!g(context)) {
                                            throw new ve0("Remote loading disabled");
                                        }
                                        bool = e;
                                    }
                                    if (bool == null) {
                                        throw new ve0("Failed to determine which loading route to use.");
                                    }
                                    if (bool.booleanValue()) {
                                        Log.i("DynamiteModule", "Selected remote version of " + str + ", version >= " + i3);
                                        synchronized (ye0.class) {
                                            ir3Var = n;
                                        }
                                        if (ir3Var == null) {
                                            throw new ve0("DynamiteLoaderV2 was not cached.");
                                        }
                                        bn3 bn3Var3 = (bn3) threadLocal.get();
                                        if (bn3Var3 == null || bn3Var3.a == null) {
                                            throw new ve0("No result cursor");
                                        }
                                        Context applicationContext2 = context.getApplicationContext();
                                        Cursor cursor = bn3Var3.a;
                                        new st1(null);
                                        synchronized (ye0.class) {
                                            z = h >= 2;
                                        }
                                        if (z) {
                                            Log.v("DynamiteModule", "Dynamite loader version >= 2, using loadModule2NoCrashUtils");
                                            J2 = ir3Var.K(new st1(applicationContext2), str, i3, new st1(cursor));
                                        } else {
                                            Log.w("DynamiteModule", "Dynamite loader version < 2, falling back to loadModule2");
                                            J2 = ir3Var.J(new st1(applicationContext2), str, i3, new st1(cursor));
                                        }
                                        Context context2 = (Context) st1.J(J2);
                                        if (context2 == null) {
                                            throw new ve0("Failed to get module context");
                                        }
                                        ye0Var2 = new ye0(context2);
                                    } else {
                                        Log.i("DynamiteModule", "Selected remote version of " + str + ", version >= " + i3);
                                        fq3 h2 = h(context);
                                        if (h2 == null) {
                                            throw new ve0("Failed to create IDynamiteLoader.");
                                        }
                                        Parcel b2 = h2.b(h2.d(), 6);
                                        int readInt = b2.readInt();
                                        b2.recycle();
                                        if (readInt >= 3) {
                                            bn3 bn3Var4 = (bn3) threadLocal.get();
                                            if (bn3Var4 == null) {
                                                throw new ve0("No cached result cursor holder");
                                            }
                                            J = h2.K(new st1(context), str, i3, new st1(bn3Var4.a));
                                        } else if (readInt == 2) {
                                            Log.w("DynamiteModule", "IDynamite loader version = 2");
                                            J = h2.L(new st1(context), str, i3);
                                        } else {
                                            Log.w("DynamiteModule", "Dynamite loader version < 2, falling back to createModuleContext");
                                            J = h2.J(new st1(context), str, i3);
                                        }
                                        Object J3 = st1.J(J);
                                        if (J3 == null) {
                                            throw new ve0("Failed to load remote module.");
                                        }
                                        ye0Var2 = new ye0((Context) J3);
                                    }
                                    ye0Var = ye0Var2;
                                } catch (RemoteException e2) {
                                    throw new ve0("Failed to load remote module.", e2);
                                } catch (ve0 e3) {
                                    throw e3;
                                } catch (Throwable th) {
                                    throw new ve0("Failed to load remote module.", th);
                                }
                            } catch (ve0 e4) {
                                Log.w("DynamiteModule", "Failed to load remote module: " + e4.getMessage());
                                int i4 = a.a;
                                if (i4 == 0 || gg3Var.a(context, str, new ao3(i4)).c != -1) {
                                    throw new ve0("Remote load failed. No local fallback found.", e4);
                                }
                                Log.i("DynamiteModule", "Selected local version of ".concat(str));
                                ye0Var = new ye0(applicationContext);
                            }
                        }
                        if (j2 == 0) {
                            k.remove();
                        } else {
                            k.set(l2);
                        }
                        Cursor cursor2 = bn3Var2.a;
                        if (cursor2 != null) {
                            cursor2.close();
                        }
                        j.set(bn3Var);
                        return ye0Var;
                    }
                }
                throw new ve0("No acceptable module " + str + " found. Local version is " + a.a + " and remote version is " + a.b + ".");
            } catch (Throwable th2) {
                th = th2;
                if (j2 == 0) {
                    k.remove();
                } else {
                    k.set(l2);
                }
                Cursor cursor3 = bn3Var2.a;
                if (cursor3 != null) {
                    cursor3.close();
                }
                j.set(bn3Var);
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            j2 = longValue;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x017c, code lost:
    
        if (r2 != false) goto L102;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int d(Context context, String str, boolean z) {
        Field declaredField;
        Throwable th;
        RemoteException remoteException;
        int readInt;
        Cursor cursor;
        try {
            synchronized (ye0.class) {
                Boolean bool = e;
                boolean z2 = true;
                Cursor cursor2 = null;
                if (bool == null) {
                    try {
                        declaredField = context.getApplicationContext().getClassLoader().loadClass(DynamiteModule$DynamiteLoaderClassLoader.class.getName()).getDeclaredField("sClassLoader");
                    } catch (ClassNotFoundException | IllegalAccessException | NoSuchFieldException e2) {
                        Log.w("DynamiteModule", "Failed to load module via V2: " + e2.toString());
                        bool = Boolean.FALSE;
                    }
                    synchronized (declaredField.getDeclaringClass()) {
                        ClassLoader classLoader = (ClassLoader) declaredField.get(null);
                        if (classLoader == ClassLoader.getSystemClassLoader()) {
                            bool = Boolean.FALSE;
                        } else if (classLoader != null) {
                            try {
                                f(classLoader);
                            } catch (ve0 unused) {
                            }
                            bool = Boolean.TRUE;
                        } else {
                            if (!g(context)) {
                                return 0;
                            }
                            if (!g) {
                                Boolean bool2 = Boolean.TRUE;
                                if (!bool2.equals(null)) {
                                    try {
                                        int e3 = e(context, str, z, true);
                                        String str2 = f;
                                        if (str2 != null && !str2.isEmpty()) {
                                            ClassLoader Q = bd3.Q();
                                            if (Q == null) {
                                                if (Build.VERSION.SDK_INT >= 29) {
                                                    ue0.b();
                                                    String str3 = f;
                                                    ll3.v(str3);
                                                    Q = ue0.a(ClassLoader.getSystemClassLoader(), str3);
                                                } else {
                                                    String str4 = f;
                                                    ll3.v(str4);
                                                    Q = new ud3(str4, ClassLoader.getSystemClassLoader());
                                                }
                                            }
                                            f(Q);
                                            declaredField.set(null, Q);
                                            e = bool2;
                                            return e3;
                                        }
                                        return e3;
                                    } catch (ve0 unused2) {
                                        declaredField.set(null, ClassLoader.getSystemClassLoader());
                                        bool = Boolean.FALSE;
                                    }
                                }
                            }
                            declaredField.set(null, ClassLoader.getSystemClassLoader());
                            bool = Boolean.FALSE;
                        }
                        e = bool;
                    }
                }
                if (bool.booleanValue()) {
                    try {
                        return e(context, str, z, false);
                    } catch (ve0 e4) {
                        Log.w("DynamiteModule", "Failed to retrieve remote module version: " + e4.getMessage());
                        return 0;
                    }
                }
                fq3 h2 = h(context);
                try {
                    if (h2 == null) {
                        return 0;
                    }
                    try {
                        Parcel b2 = h2.b(h2.d(), 6);
                        int readInt2 = b2.readInt();
                        b2.recycle();
                        if (readInt2 >= 3) {
                            ThreadLocal threadLocal = j;
                            bn3 bn3Var = (bn3) threadLocal.get();
                            if (bn3Var != null && (cursor = bn3Var.a) != null) {
                                return cursor.getInt(0);
                            }
                            Cursor cursor3 = (Cursor) st1.J(h2.M(new st1(context), str, z, ((Long) k.get()).longValue()));
                            if (cursor3 != null) {
                                try {
                                    if (cursor3.moveToFirst()) {
                                        readInt = cursor3.getInt(0);
                                        if (readInt > 0) {
                                            bn3 bn3Var2 = (bn3) threadLocal.get();
                                            if (bn3Var2 == null || bn3Var2.a != null) {
                                                z2 = false;
                                            } else {
                                                bn3Var2.a = cursor3;
                                            }
                                        }
                                        cursor2 = cursor3;
                                        if (cursor2 != null) {
                                            cursor2.close();
                                        }
                                    }
                                } catch (RemoteException e5) {
                                    remoteException = e5;
                                    cursor2 = cursor3;
                                    Log.w("DynamiteModule", "Failed to retrieve remote module version: " + remoteException.getMessage());
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
                            st1 st1Var = new st1(context);
                            Parcel d2 = h2.d();
                            wd3.c(d2, st1Var);
                            d2.writeString(str);
                            d2.writeInt(z ? 1 : 0);
                            Parcel b3 = h2.b(d2, 5);
                            readInt = b3.readInt();
                            b3.recycle();
                        } else {
                            Log.w("DynamiteModule", "IDynamite loader version < 2, falling back to getModuleVersion2");
                            st1 st1Var2 = new st1(context);
                            Parcel d3 = h2.d();
                            wd3.c(d3, st1Var2);
                            d3.writeString(str);
                            d3.writeInt(z ? 1 : 0);
                            Parcel b4 = h2.b(d3, 3);
                            readInt = b4.readInt();
                            b4.recycle();
                        }
                        return readInt;
                    } catch (RemoteException e6) {
                        remoteException = e6;
                    }
                } catch (Throwable th3) {
                    th = th3;
                }
            }
        } finally {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x0134, code lost:
    
        if (r5 != false) goto L93;
     */
    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Removed duplicated region for block: B:14:0x00e4 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int e(Context context, String str, boolean z, boolean z2) {
        Exception exc;
        Throwable th;
        Cursor query;
        MatrixCursor matrixCursor;
        boolean z3;
        MatrixCursor matrixCursor2 = null;
        try {
            try {
                boolean z4 = true;
                Uri build = new Uri.Builder().scheme(FirebaseAnalytics.Param.CONTENT).authority("com.google.android.gms.chimera").path(true != z ? "api" : "api_force_staging").appendPath(str).appendQueryParameter("requestStartUptime", String.valueOf(((Long) k.get()).longValue())).build();
                ContentProviderClient acquireUnstableContentProviderClient = context.getContentResolver().acquireUnstableContentProviderClient(build);
                boolean z5 = false;
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
                            for (int i2 = 0; i2 < count; i2++) {
                                if (!query.moveToPosition(i2)) {
                                    throw new RemoteException("Cursor read incomplete (ContentProvider dead?)");
                                }
                                Object[] objArr = new Object[columnCount];
                                for (int i3 = 0; i3 < columnCount; i3++) {
                                    int type = query.getType(i3);
                                    if (type == 0) {
                                        objArr[i3] = null;
                                    } else if (type == 1) {
                                        objArr[i3] = Long.valueOf(query.getLong(i3));
                                    } else if (type == 2) {
                                        objArr[i3] = Double.valueOf(query.getDouble(i3));
                                    } else if (type == 3) {
                                        objArr[i3] = query.getString(i3);
                                    } else {
                                        if (type != 4) {
                                            throw new RemoteException("Unknown column type");
                                        }
                                        objArr[i3] = query.getBlob(i3);
                                    }
                                }
                                matrixCursor.addRow(objArr);
                            }
                            query.close();
                            acquireUnstableContentProviderClient.release();
                            if (matrixCursor != null) {
                                try {
                                    if (matrixCursor.moveToFirst()) {
                                        int i4 = matrixCursor.getInt(0);
                                        if (i4 > 0) {
                                            synchronized (ye0.class) {
                                                try {
                                                    f = matrixCursor.getString(2);
                                                    int columnIndex = matrixCursor.getColumnIndex("loaderVersion");
                                                    if (columnIndex >= 0) {
                                                        h = matrixCursor.getInt(columnIndex);
                                                    }
                                                    int columnIndex2 = matrixCursor.getColumnIndex("disableStandaloneDynamiteLoader2");
                                                    if (columnIndex2 >= 0) {
                                                        z3 = matrixCursor.getInt(columnIndex2) != 0;
                                                        g = z3;
                                                    } else {
                                                        z3 = false;
                                                    }
                                                } finally {
                                                }
                                            }
                                            bn3 bn3Var = (bn3) j.get();
                                            if (bn3Var == null || bn3Var.a != null) {
                                                z4 = false;
                                            } else {
                                                bn3Var.a = matrixCursor;
                                            }
                                            z5 = z3;
                                        }
                                        matrixCursor2 = matrixCursor;
                                        if (z2 && z5) {
                                            throw new ve0("forcing fallback to container DynamiteLoader impl");
                                        }
                                        if (matrixCursor2 != null) {
                                            matrixCursor2.close();
                                        }
                                        return i4;
                                    }
                                } catch (Exception e2) {
                                    exc = e2;
                                    if (exc instanceof ve0) {
                                        throw exc;
                                    }
                                    throw new ve0("V2 version check failed: " + exc.getMessage(), exc);
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
                            throw new ve0("Failed to connect to dynamite module ContentResolver.");
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
                throw new ve0("Failed to connect to dynamite module ContentResolver.");
            } catch (Throwable th6) {
                th = th6;
            }
        } catch (Exception e3) {
            exc = e3;
        }
    }

    public static void f(ClassLoader classLoader) {
        try {
            ir3 ir3Var = null;
            IBinder iBinder = (IBinder) classLoader.loadClass("com.google.android.gms.dynamiteloader.DynamiteLoaderV2").getConstructor(null).newInstance(null);
            if (iBinder != null) {
                IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamite.IDynamiteLoaderV2");
                ir3Var = queryLocalInterface instanceof ir3 ? (ir3) queryLocalInterface : new ir3(iBinder, "com.google.android.gms.dynamite.IDynamiteLoaderV2", 1);
            }
            n = ir3Var;
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException e2) {
            throw new ve0("Failed to instantiate dynamite loader", e2);
        }
    }

    public static boolean g(Context context) {
        ApplicationInfo applicationInfo;
        Boolean bool = Boolean.TRUE;
        if (bool.equals(null) || bool.equals(i)) {
            return true;
        }
        boolean z = false;
        if (i == null) {
            ProviderInfo resolveContentProvider = context.getPackageManager().resolveContentProvider("com.google.android.gms.chimera", Build.VERSION.SDK_INT >= 29 ? 268435456 : 0);
            if (tv0.b.b(context, 10000000) == 0 && resolveContentProvider != null && "com.google.android.gms".equals(resolveContentProvider.packageName)) {
                z = true;
            }
            i = Boolean.valueOf(z);
            if (z && (applicationInfo = resolveContentProvider.applicationInfo) != null && (applicationInfo.flags & 129) == 0) {
                Log.i("DynamiteModule", "Non-system-image GmsCore APK, forcing V1");
                g = true;
            }
        }
        if (!z) {
            Log.e("DynamiteModule", "Invalid GmsCore APK, remote loading disabled.");
        }
        return z;
    }

    public static fq3 h(Context context) {
        fq3 fq3Var;
        synchronized (ye0.class) {
            fq3 fq3Var2 = m;
            if (fq3Var2 != null) {
                return fq3Var2;
            }
            try {
                IBinder iBinder = (IBinder) context.createPackageContext("com.google.android.gms", 3).getClassLoader().loadClass("com.google.android.gms.chimera.container.DynamiteLoaderImpl").newInstance();
                if (iBinder == null) {
                    fq3Var = null;
                } else {
                    IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamite.IDynamiteLoader");
                    fq3Var = queryLocalInterface instanceof fq3 ? (fq3) queryLocalInterface : new fq3(iBinder, "com.google.android.gms.dynamite.IDynamiteLoader", 1);
                }
                if (fq3Var != null) {
                    m = fq3Var;
                    return fq3Var;
                }
            } catch (Exception e2) {
                Log.e("DynamiteModule", "Failed to load IDynamiteLoader from GmsCore: " + e2.getMessage());
            }
            return null;
        }
    }

    public final IBinder b(String str) {
        try {
            return (IBinder) this.a.getClassLoader().loadClass(str).newInstance();
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException e2) {
            throw new ve0("Failed to instantiate module class: ".concat(str), e2);
        }
    }
}
