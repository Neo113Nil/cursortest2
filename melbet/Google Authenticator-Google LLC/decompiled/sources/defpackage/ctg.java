package defpackage;

import android.content.ContentProviderClient;
import android.content.Context;
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
import dalvik.system.DelegateLastClassLoader;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ctg {
    private static Boolean d = null;
    private static String e = null;
    private static boolean f = false;
    private static int g = -1;
    private static Boolean h;
    private static cth l;
    private static cti m;
    public final Context c;
    private static final ThreadLocal i = new ThreadLocal();
    private static final ThreadLocal j = new csy();
    private static final ctd k = new csz();
    public static final ctf a = new cta(1);
    public static final ctf b = new cta(0);

    private ctg(Context context) {
        this.c = context;
    }

    /* JADX WARN: Type inference failed for: r1v29, types: [android.database.Cursor, java.lang.Object] */
    public static int a(Context context, String str, boolean z) {
        Field declaredField;
        Throwable th;
        RemoteException e2;
        int readInt;
        csu cssVar;
        ?? r1;
        try {
            synchronized (ctg.class) {
                Boolean bool = d;
                if (bool == null) {
                    try {
                        declaredField = context.getApplicationContext().getClassLoader().loadClass(DynamiteModule$DynamiteLoaderClassLoader.class.getName()).getDeclaredField("sClassLoader");
                    } catch (ClassNotFoundException | IllegalAccessException | NoSuchFieldException e3) {
                        Log.w("DynamiteModule", "Failed to load module via V2: " + e3.toString());
                        bool = Boolean.FALSE;
                    }
                    synchronized (declaredField.getDeclaringClass()) {
                        ClassLoader classLoader = (ClassLoader) declaredField.get(null);
                        if (classLoader == ClassLoader.getSystemClassLoader()) {
                            bool = Boolean.FALSE;
                        } else if (classLoader != null) {
                            try {
                                e(classLoader);
                            } catch (ctc unused) {
                            }
                            bool = Boolean.TRUE;
                        } else {
                            if (!g(context)) {
                                return 0;
                            }
                            if (f || Boolean.TRUE.equals(null)) {
                                declaredField.set(null, ClassLoader.getSystemClassLoader());
                                bool = Boolean.FALSE;
                            } else {
                                try {
                                    int d2 = d(context, str, z, true);
                                    String str2 = e;
                                    if (str2 != null && !str2.isEmpty()) {
                                        ClassLoader a2 = csw.a();
                                        if (a2 == null) {
                                            if (Build.VERSION.SDK_INT >= 29) {
                                                String str3 = e;
                                                oy.at(str3);
                                                a2 = new DelegateLastClassLoader(str3, ClassLoader.getSystemClassLoader());
                                            } else {
                                                String str4 = e;
                                                oy.at(str4);
                                                a2 = new csx(str4, ClassLoader.getSystemClassLoader());
                                            }
                                        }
                                        e(a2);
                                        declaredField.set(null, a2);
                                        d = Boolean.TRUE;
                                        return d2;
                                    }
                                    return d2;
                                } catch (ctc unused2) {
                                    declaredField.set(null, ClassLoader.getSystemClassLoader());
                                    bool = Boolean.FALSE;
                                }
                            }
                        }
                        d = bool;
                    }
                }
                if (bool.booleanValue()) {
                    try {
                        return d(context, str, z, false);
                    } catch (ctc e4) {
                        Log.w("DynamiteModule", "Failed to retrieve remote module version: " + e4.getMessage());
                        return 0;
                    }
                }
                cth h2 = h(context);
                try {
                    if (h2 == null) {
                        return 0;
                    }
                    try {
                        int e5 = h2.e();
                        if (e5 >= 3) {
                            hrz hrzVar = (hrz) i.get();
                            if (hrzVar != null && (r1 = hrzVar.a) != 0) {
                                return r1.getInt(0);
                            }
                            cst cstVar = new cst(context);
                            long longValue = ((Long) j.get()).longValue();
                            Parcel a3 = h2.a();
                            bmt.d(a3, cstVar);
                            a3.writeString(str);
                            a3.writeInt(z ? 1 : 0);
                            a3.writeLong(longValue);
                            Parcel b2 = h2.b(7, a3);
                            IBinder readStrongBinder = b2.readStrongBinder();
                            if (readStrongBinder == null) {
                                cssVar = null;
                            } else {
                                IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
                                cssVar = queryLocalInterface instanceof csu ? (csu) queryLocalInterface : new css(readStrongBinder);
                            }
                            b2.recycle();
                            Cursor cursor = (Cursor) cst.b(cssVar);
                            if (cursor != null) {
                                try {
                                    if (cursor.moveToFirst()) {
                                        readInt = cursor.getInt(0);
                                        r2 = (readInt <= 0 || !f(cursor)) ? cursor : null;
                                        if (r2 != null) {
                                            r2.close();
                                        }
                                    }
                                } catch (RemoteException e6) {
                                    e2 = e6;
                                    r2 = cursor;
                                    Log.w("DynamiteModule", "Failed to retrieve remote module version: " + e2.getMessage());
                                    if (r2 == null) {
                                        return 0;
                                    }
                                    r2.close();
                                    return 0;
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
                            if (cursor == null) {
                                return 0;
                            }
                            cursor.close();
                            return 0;
                        }
                        if (e5 == 2) {
                            Log.w("DynamiteModule", "IDynamite loader version = 2, no high precision latency measurement.");
                            cst cstVar2 = new cst(context);
                            Parcel a4 = h2.a();
                            bmt.d(a4, cstVar2);
                            a4.writeString(str);
                            a4.writeInt(z ? 1 : 0);
                            Parcel b3 = h2.b(5, a4);
                            readInt = b3.readInt();
                            b3.recycle();
                        } else {
                            Log.w("DynamiteModule", "IDynamite loader version < 2, falling back to getModuleVersion2");
                            cst cstVar3 = new cst(context);
                            Parcel a5 = h2.a();
                            bmt.d(a5, cstVar3);
                            a5.writeString(str);
                            a5.writeInt(z ? 1 : 0);
                            Parcel b4 = h2.b(3, a5);
                            readInt = b4.readInt();
                            b4.recycle();
                        }
                        return readInt;
                    } catch (RemoteException e7) {
                        e2 = e7;
                    }
                } catch (Throwable th3) {
                    th = th3;
                }
            }
        } catch (Throwable th4) {
            csp.d(context);
            throw th4;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:76:0x02e7  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x02f6  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x02ed  */
    /* JADX WARN: Type inference failed for: r0v16, types: [android.database.Cursor, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v13, types: [android.database.Cursor, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v4, types: [android.database.Cursor, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static ctg b(Context context, ctf ctfVar, String str) {
        long j2;
        long j3;
        int i2;
        ctg ctgVar;
        long j4;
        ?? r0;
        int i3;
        csu cssVar;
        cti ctiVar;
        boolean z;
        Boolean valueOf;
        csu cssVar2;
        Context applicationContext = context.getApplicationContext();
        if (applicationContext == null) {
            throw new ctc("null application Context");
        }
        ThreadLocal threadLocal = i;
        hrz hrzVar = (hrz) threadLocal.get();
        hrz hrzVar2 = new hrz();
        threadLocal.set(hrzVar2);
        ThreadLocal threadLocal2 = j;
        Long l2 = (Long) threadLocal2.get();
        long longValue = l2.longValue();
        try {
            threadLocal2.set(Long.valueOf(SystemClock.uptimeMillis()));
            cte a2 = ctfVar.a(context, str, k);
            int i4 = a2.c;
            try {
                if (i4 != 0) {
                    j3 = 0;
                    if (i4 == -1) {
                        try {
                            if (a2.a != 0) {
                            }
                        } catch (Throwable th) {
                            th = th;
                            j2 = longValue;
                            if (j2 == j3) {
                                j.remove();
                            } else {
                                j.set(l2);
                            }
                            ?? r1 = hrzVar2.a;
                            if (r1 != 0) {
                                r1.close();
                            }
                            i.set(hrzVar);
                            throw th;
                        }
                    }
                    if (i4 != 1 || a2.b != 0) {
                        if (i4 == -1) {
                            ctg ctgVar2 = new ctg(applicationContext);
                            if (longValue == 0) {
                                threadLocal2.remove();
                            } else {
                                threadLocal2.set(l2);
                            }
                            ?? r12 = hrzVar2.a;
                            if (r12 != 0) {
                                r12.close();
                            }
                            threadLocal.set(hrzVar);
                            return ctgVar2;
                        }
                        if (i4 != 1) {
                            throw new ctc(a.Y(0, "VersionPolicy returned invalid code:"));
                        }
                        try {
                            try {
                                i3 = a2.b;
                            } catch (ctc e2) {
                                e = e2;
                                j4 = longValue;
                                Log.w("DynamiteModule", "Failed to load remote module: " + e.getMessage());
                                i2 = a2.a;
                                if (i2 != 0 || ctfVar.a(context, str, new ctb(i2)).c != -1) {
                                    throw new ctc("Remote load failed. No local fallback found.", e);
                                }
                                ctgVar = new ctg(applicationContext);
                                if (j4 != 0) {
                                }
                                r0 = hrzVar2.a;
                                if (r0 != 0) {
                                }
                                i.set(hrzVar);
                                return ctgVar;
                            }
                        } catch (ctc e3) {
                            e = e3;
                            Log.w("DynamiteModule", "Failed to load remote module: " + e.getMessage());
                            i2 = a2.a;
                            if (i2 != 0) {
                            }
                            throw new ctc("Remote load failed. No local fallback found.", e);
                        }
                        try {
                            try {
                                try {
                                    synchronized (ctg.class) {
                                        try {
                                            if (!g(context)) {
                                                throw new ctc("Remote loading disabled");
                                            }
                                            Boolean bool = d;
                                            if (bool == null) {
                                                throw new ctc("Failed to determine which loading route to use.");
                                            }
                                            if (bool.booleanValue()) {
                                                synchronized (ctg.class) {
                                                    try {
                                                        ctiVar = m;
                                                    } catch (Throwable th2) {
                                                        th = th2;
                                                        while (true) {
                                                            try {
                                                                throw th;
                                                            } catch (Throwable th3) {
                                                                th = th3;
                                                            }
                                                        }
                                                    }
                                                }
                                                if (ctiVar == null) {
                                                    throw new ctc("DynamiteLoaderV2 was not cached.");
                                                }
                                                hrz hrzVar3 = (hrz) threadLocal.get();
                                                if (hrzVar3 == null || hrzVar3.a == null) {
                                                    throw new ctc("No result cursor");
                                                }
                                                Context applicationContext2 = context.getApplicationContext();
                                                Object obj = hrzVar3.a;
                                                j4 = longValue;
                                                new cst(null);
                                                synchronized (ctg.class) {
                                                    z = g >= 2;
                                                    valueOf = Boolean.valueOf(z);
                                                }
                                                valueOf.getClass();
                                                if (z) {
                                                    cst cstVar = new cst(applicationContext2);
                                                    cst cstVar2 = new cst(obj);
                                                    Parcel a3 = ctiVar.a();
                                                    bmt.d(a3, cstVar);
                                                    a3.writeString(str);
                                                    a3.writeInt(i3);
                                                    bmt.d(a3, cstVar2);
                                                    Parcel b2 = ctiVar.b(3, a3);
                                                    IBinder readStrongBinder = b2.readStrongBinder();
                                                    if (readStrongBinder == null) {
                                                        cssVar2 = null;
                                                    } else {
                                                        IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
                                                        cssVar2 = queryLocalInterface instanceof csu ? (csu) queryLocalInterface : new css(readStrongBinder);
                                                    }
                                                    b2.recycle();
                                                } else {
                                                    Log.w("DynamiteModule", "Dynamite loader version < 2, falling back to loadModule2");
                                                    cst cstVar3 = new cst(applicationContext2);
                                                    cst cstVar4 = new cst(obj);
                                                    Parcel a4 = ctiVar.a();
                                                    bmt.d(a4, cstVar3);
                                                    a4.writeString(str);
                                                    a4.writeInt(i3);
                                                    bmt.d(a4, cstVar4);
                                                    Parcel b3 = ctiVar.b(2, a4);
                                                    IBinder readStrongBinder2 = b3.readStrongBinder();
                                                    if (readStrongBinder2 == null) {
                                                        cssVar2 = null;
                                                    } else {
                                                        IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
                                                        cssVar2 = queryLocalInterface2 instanceof csu ? (csu) queryLocalInterface2 : new css(readStrongBinder2);
                                                    }
                                                    b3.recycle();
                                                }
                                                Context context2 = (Context) cst.b(cssVar2);
                                                if (context2 == null) {
                                                    throw new ctc("Failed to get module context");
                                                }
                                                ctgVar = new ctg(context2);
                                            } else {
                                                j4 = longValue;
                                                cth h2 = h(context);
                                                if (h2 == null) {
                                                    throw new ctc("Failed to create IDynamiteLoader.");
                                                }
                                                int e4 = h2.e();
                                                if (e4 >= 3) {
                                                    hrz hrzVar4 = (hrz) threadLocal.get();
                                                    if (hrzVar4 == null) {
                                                        throw new ctc("No cached result cursor holder");
                                                    }
                                                    cst cstVar5 = new cst(context);
                                                    cst cstVar6 = new cst(hrzVar4.a);
                                                    Parcel a5 = h2.a();
                                                    bmt.d(a5, cstVar5);
                                                    a5.writeString(str);
                                                    a5.writeInt(i3);
                                                    bmt.d(a5, cstVar6);
                                                    Parcel b4 = h2.b(8, a5);
                                                    IBinder readStrongBinder3 = b4.readStrongBinder();
                                                    if (readStrongBinder3 == null) {
                                                        cssVar = null;
                                                    } else {
                                                        IInterface queryLocalInterface3 = readStrongBinder3.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
                                                        cssVar = queryLocalInterface3 instanceof csu ? (csu) queryLocalInterface3 : new css(readStrongBinder3);
                                                    }
                                                    b4.recycle();
                                                } else if (e4 == 2) {
                                                    Log.w("DynamiteModule", "IDynamite loader version = 2");
                                                    cst cstVar7 = new cst(context);
                                                    Parcel a6 = h2.a();
                                                    bmt.d(a6, cstVar7);
                                                    a6.writeString(str);
                                                    a6.writeInt(i3);
                                                    Parcel b5 = h2.b(4, a6);
                                                    IBinder readStrongBinder4 = b5.readStrongBinder();
                                                    if (readStrongBinder4 == null) {
                                                        cssVar = null;
                                                    } else {
                                                        IInterface queryLocalInterface4 = readStrongBinder4.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
                                                        cssVar = queryLocalInterface4 instanceof csu ? (csu) queryLocalInterface4 : new css(readStrongBinder4);
                                                    }
                                                    b5.recycle();
                                                } else {
                                                    Log.w("DynamiteModule", "Dynamite loader version < 2, falling back to createModuleContext");
                                                    cst cstVar8 = new cst(context);
                                                    Parcel a7 = h2.a();
                                                    bmt.d(a7, cstVar8);
                                                    a7.writeString(str);
                                                    a7.writeInt(i3);
                                                    Parcel b6 = h2.b(2, a7);
                                                    IBinder readStrongBinder5 = b6.readStrongBinder();
                                                    if (readStrongBinder5 == null) {
                                                        cssVar = null;
                                                    } else {
                                                        IInterface queryLocalInterface5 = readStrongBinder5.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
                                                        cssVar = queryLocalInterface5 instanceof csu ? (csu) queryLocalInterface5 : new css(readStrongBinder5);
                                                    }
                                                    b6.recycle();
                                                }
                                                Object b7 = cst.b(cssVar);
                                                if (b7 == null) {
                                                    throw new ctc("Failed to load remote module.");
                                                }
                                                ctgVar = new ctg((Context) b7);
                                            }
                                            if (j4 != 0) {
                                                j.remove();
                                            } else {
                                                j.set(l2);
                                            }
                                            r0 = hrzVar2.a;
                                            if (r0 != 0) {
                                                r0.close();
                                            }
                                            i.set(hrzVar);
                                            return ctgVar;
                                        } catch (Throwable th4) {
                                            th = th4;
                                            throw th;
                                        }
                                    }
                                } catch (Throwable th5) {
                                    th = th5;
                                }
                            } catch (RemoteException e5) {
                                e = e5;
                                throw new ctc("Failed to load remote module.", e);
                            } catch (ctc e6) {
                                throw e6;
                            } catch (Throwable th6) {
                                th = th6;
                                csp.d(context);
                                throw new ctc("Failed to load remote module.", th);
                            }
                        } catch (RemoteException e7) {
                            e = e7;
                            throw new ctc("Failed to load remote module.", e);
                        } catch (ctc e8) {
                            throw e8;
                        } catch (Throwable th7) {
                            th = th7;
                            csp.d(context);
                            throw new ctc("Failed to load remote module.", th);
                        }
                    }
                }
                throw new ctc("No acceptable module " + str + " found. Local version is " + a2.a + " and remote version is " + a2.b + ".");
            } catch (Throwable th8) {
                th = th8;
            }
        } catch (Throwable th9) {
            th = th9;
            j2 = longValue;
            j3 = 0;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:49:0x011e, code lost:
    
        if (f(r3) != false) goto L82;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00e2 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static int d(Context context, String str, boolean z, boolean z2) {
        Exception exc;
        Throwable th;
        Cursor query;
        MatrixCursor matrixCursor;
        MatrixCursor matrixCursor2 = null;
        try {
            try {
                boolean z3 = true;
                Uri build = new Uri.Builder().scheme("content").authority("com.google.android.gms.chimera").path(true != z ? "api" : "api_force_staging").appendPath(str).appendQueryParameter("requestStartUptime", String.valueOf(((Long) j.get()).longValue())).build();
                ContentProviderClient acquireUnstableContentProviderClient = context.getContentResolver().acquireUnstableContentProviderClient(build);
                boolean z4 = false;
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
                                            synchronized (ctg.class) {
                                                e = matrixCursor.getString(2);
                                                int columnIndex = matrixCursor.getColumnIndex("loaderVersion");
                                                if (columnIndex >= 0) {
                                                    g = matrixCursor.getInt(columnIndex);
                                                }
                                                int columnIndex2 = matrixCursor.getColumnIndex("disableStandaloneDynamiteLoader2");
                                                if (columnIndex2 >= 0) {
                                                    if (matrixCursor.getInt(columnIndex2) == 0) {
                                                        z3 = false;
                                                    }
                                                    f = z3;
                                                    z4 = z3;
                                                }
                                            }
                                        }
                                        matrixCursor2 = matrixCursor;
                                        if (z2 && z4) {
                                            throw new ctc("forcing fallback to container DynamiteLoader impl");
                                        }
                                        if (matrixCursor2 != null) {
                                            matrixCursor2.close();
                                        }
                                        return i4;
                                    }
                                } catch (Exception e2) {
                                    exc = e2;
                                    if (exc instanceof ctc) {
                                        throw exc;
                                    }
                                    throw new ctc("V2 version check failed: " + exc.getMessage(), exc);
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
                            synchronized (ctg.class) {
                                if (matrixCursor == null) {
                                    if (Boolean.FALSE.equals(null)) {
                                        Log.w("DynamiteModule", "Play services is unavailable. Will not fall back to container v1 loader.");
                                        return 0;
                                    }
                                }
                                Log.w("DynamiteModule", "Failed to retrieve remote module version.");
                                throw new ctc("Failed to connect to dynamite module ContentResolver.");
                            }
                        } finally {
                        }
                    }
                    acquireUnstableContentProviderClient.release();
                }
                matrixCursor = null;
                if (matrixCursor != null) {
                }
                synchronized (ctg.class) {
                }
            } catch (Throwable th4) {
                th = th4;
            }
        } catch (Exception e3) {
            exc = e3;
        }
    }

    private static void e(ClassLoader classLoader) {
        try {
            cti ctiVar = null;
            IBinder iBinder = (IBinder) classLoader.loadClass("com.google.android.gms.dynamiteloader.DynamiteLoaderV2").getConstructor(null).newInstance(null);
            if (iBinder != null) {
                IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamite.IDynamiteLoaderV2");
                ctiVar = queryLocalInterface instanceof cti ? (cti) queryLocalInterface : new cti(iBinder);
            }
            m = ctiVar;
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException e2) {
            throw new ctc("Failed to instantiate dynamite loader", e2);
        }
    }

    private static boolean f(Cursor cursor) {
        hrz hrzVar = (hrz) i.get();
        if (hrzVar == null || hrzVar.a != null) {
            return false;
        }
        hrzVar.a = cursor;
        return true;
    }

    private static boolean g(Context context) {
        if (Boolean.TRUE.equals(null) || Boolean.TRUE.equals(h)) {
            return true;
        }
        boolean z = false;
        if (h == null) {
            ProviderInfo resolveContentProvider = context.getPackageManager().resolveContentProvider("com.google.android.gms.chimera", true != csp.c() ? 0 : 268435456);
            if (clm.d.l(context, 10000000) == 0 && resolveContentProvider != null && "com.google.android.gms".equals(resolveContentProvider.packageName)) {
                z = true;
            }
            Boolean valueOf = Boolean.valueOf(z);
            h = valueOf;
            valueOf.getClass();
            if (z && resolveContentProvider.applicationInfo != null && (resolveContentProvider.applicationInfo.flags & 129) == 0) {
                f = true;
            }
        }
        if (!z) {
            Log.e("DynamiteModule", "Invalid GmsCore APK, remote loading disabled.");
        }
        return z;
    }

    private static cth h(Context context) {
        cth cthVar;
        synchronized (ctg.class) {
            cth cthVar2 = l;
            if (cthVar2 != null) {
                return cthVar2;
            }
            try {
                IBinder iBinder = (IBinder) context.createPackageContext("com.google.android.gms", 3).getClassLoader().loadClass("com.google.android.gms.chimera.container.DynamiteLoaderImpl").newInstance();
                if (iBinder == null) {
                    cthVar = null;
                } else {
                    IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamite.IDynamiteLoader");
                    cthVar = queryLocalInterface instanceof cth ? (cth) queryLocalInterface : new cth(iBinder);
                }
                if (cthVar != null) {
                    l = cthVar;
                    return cthVar;
                }
            } catch (Exception e2) {
                Log.e("DynamiteModule", "Failed to load IDynamiteLoader from GmsCore: " + e2.getMessage());
            }
            return null;
        }
    }

    public final IBinder c() {
        try {
            return (IBinder) this.c.getClassLoader().loadClass("com.google.android.gms.common.GoogleCertificatesImpl").newInstance();
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException e2) {
            throw new ctc("Failed to instantiate module class: com.google.android.gms.common.GoogleCertificatesImpl", e2);
        }
    }
}
