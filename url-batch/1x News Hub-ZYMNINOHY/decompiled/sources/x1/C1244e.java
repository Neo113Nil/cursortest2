package x1;

import B0.n;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteCantOpenDatabaseException;
import android.database.sqlite.SQLiteCursor;
import android.database.sqlite.SQLiteCursorDriver;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteQuery;
import android.os.Build;
import android.util.Log;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import y1.C1254b;
import y1.C1256d;

/* renamed from: x1.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1244e {

    /* renamed from: n, reason: collision with root package name */
    public static Boolean f10723n;

    /* renamed from: a, reason: collision with root package name */
    public final boolean f10724a;

    /* renamed from: b, reason: collision with root package name */
    public final String f10725b;

    /* renamed from: c, reason: collision with root package name */
    public final int f10726c;

    /* renamed from: d, reason: collision with root package name */
    public final int f10727d;

    /* renamed from: e, reason: collision with root package name */
    public final Context f10728e;

    /* renamed from: h, reason: collision with root package name */
    public InterfaceC1247h f10730h;

    /* renamed from: i, reason: collision with root package name */
    public SQLiteDatabase f10731i;

    /* renamed from: l, reason: collision with root package name */
    public Integer f10734l;
    public final ArrayList f = new ArrayList();

    /* renamed from: g, reason: collision with root package name */
    public final HashMap f10729g = new HashMap();

    /* renamed from: j, reason: collision with root package name */
    public int f10732j = 0;

    /* renamed from: k, reason: collision with root package name */
    public int f10733k = 0;

    /* renamed from: m, reason: collision with root package name */
    public int f10735m = 0;

    public C1244e(Context context, String str, int i3, boolean z, int i4) {
        this.f10728e = context;
        this.f10725b = str;
        this.f10724a = z;
        this.f10726c = i3;
        this.f10727d = i4;
    }

    public static HashMap c(Cursor cursor, Integer num) {
        HashMap hashMap = null;
        ArrayList arrayList = null;
        int i3 = 0;
        while (cursor.moveToNext()) {
            if (hashMap == null) {
                arrayList = new ArrayList();
                hashMap = new HashMap();
                i3 = cursor.getColumnCount();
                hashMap.put("columns", Arrays.asList(cursor.getColumnNames()));
                hashMap.put("rows", arrayList);
            }
            ArrayList arrayList2 = new ArrayList(i3);
            for (int i4 = 0; i4 < i3; i4++) {
                int type = cursor.getType(i4);
                arrayList2.add(type != 1 ? type != 2 ? type != 3 ? type != 4 ? null : cursor.getBlob(i4) : cursor.getString(i4) : Double.valueOf(cursor.getDouble(i4)) : Long.valueOf(cursor.getLong(i4)));
            }
            arrayList.add(arrayList2);
            if (num != null && arrayList.size() >= num.intValue()) {
                break;
            }
        }
        return hashMap == null ? new HashMap() : hashMap;
    }

    public final void a() {
        HashMap hashMap = this.f10729g;
        if (!hashMap.isEmpty() && this.f10727d >= 1) {
            Log.d("Sqflite", h() + hashMap.size() + " cursor(s) are left opened");
        }
        this.f10731i.close();
    }

    public final void b(C1248i c1248i) {
        try {
            int i3 = c1248i.f10743a;
            if (AbstractC1240a.a(this.f10727d)) {
                Log.d("Sqflite", h() + "closing cursor " + i3);
            }
            this.f10729g.remove(Integer.valueOf(i3));
            c1248i.f10745c.close();
        } catch (Exception unused) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00c6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean d(S0.a aVar) {
        Exception e3;
        Cursor cursor;
        if (g(aVar)) {
            SQLiteCursor sQLiteCursor = 0;
            if (aVar.p()) {
                aVar.e(null);
                return true;
            }
            try {
                try {
                    cursor = this.f10731i.rawQuery("SELECT changes(), last_insert_rowid()", null);
                    if (cursor != null) {
                        try {
                            if (cursor.getCount() > 0 && cursor.moveToFirst()) {
                                int i3 = cursor.getInt(0);
                                int i4 = this.f10727d;
                                if (i3 == 0) {
                                    if (i4 >= 1) {
                                        Log.d("Sqflite", h() + "no changes (id was " + cursor.getLong(1) + ")");
                                    }
                                    aVar.e(null);
                                    cursor.close();
                                    return true;
                                }
                                long j3 = cursor.getLong(1);
                                if (i4 >= 1) {
                                    Log.d("Sqflite", h() + "inserted " + j3);
                                }
                                aVar.e(Long.valueOf(j3));
                                cursor.close();
                                return true;
                            }
                        } catch (Exception e4) {
                            e3 = e4;
                            i(e3, aVar);
                            if (cursor != null) {
                                cursor.close();
                            }
                            return false;
                        }
                    }
                    Log.e("Sqflite", h() + "fail to read changes for Insert");
                    aVar.e(null);
                    if (cursor != null) {
                        cursor.close();
                    }
                    return true;
                } catch (Throwable th) {
                    th = th;
                    sQLiteCursor = "SELECT changes(), last_insert_rowid()";
                    if (sQLiteCursor != 0) {
                        sQLiteCursor.close();
                    }
                    throw th;
                }
            } catch (Exception e5) {
                e3 = e5;
                cursor = null;
            } catch (Throwable th2) {
                th = th2;
                if (sQLiteCursor != 0) {
                }
                throw th;
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, x1.m] */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v3, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r1v4, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r1v6, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r3v13, types: [java.lang.StringBuilder] */
    /* JADX WARN: Type inference failed for: r9v0, types: [S0.a] */
    public final boolean e(S0.a aVar) {
        Integer num = (Integer) aVar.m("cursorPageSize");
        String str = (String) aVar.m("sql");
        final ?? mVar = new m(str, (List) aVar.m("arguments"));
        if (this.f10727d >= 1) {
            Log.d("Sqflite", h() + mVar);
        }
        C1248i c1248i = null;
        try {
            try {
                mVar = this.f10731i.rawQueryWithFactory(new SQLiteDatabase.CursorFactory() { // from class: x1.c
                    @Override // android.database.sqlite.SQLiteDatabase.CursorFactory
                    public final Cursor newCursor(SQLiteDatabase sQLiteDatabase, SQLiteCursorDriver sQLiteCursorDriver, String str2, SQLiteQuery sQLiteQuery) {
                        List list = m.this.f10769b;
                        if (list != null) {
                            int size = list.size();
                            int i3 = 0;
                            while (i3 < size) {
                                Object a3 = m.a(list.get(i3));
                                int i4 = i3 + 1;
                                if (a3 == null) {
                                    sQLiteQuery.bindNull(i4);
                                } else if (a3 instanceof byte[]) {
                                    sQLiteQuery.bindBlob(i4, (byte[]) a3);
                                } else if (a3 instanceof Double) {
                                    sQLiteQuery.bindDouble(i4, ((Double) a3).doubleValue());
                                } else if (a3 instanceof Integer) {
                                    sQLiteQuery.bindLong(i4, ((Integer) a3).intValue());
                                } else if (a3 instanceof Long) {
                                    sQLiteQuery.bindLong(i4, ((Long) a3).longValue());
                                } else if (a3 instanceof String) {
                                    sQLiteQuery.bindString(i4, (String) a3);
                                } else {
                                    if (!(a3 instanceof Boolean)) {
                                        throw new IllegalArgumentException("Could not bind " + a3 + " from index " + i3 + ": Supported types are null, byte[], double, long, boolean and String");
                                    }
                                    sQLiteQuery.bindLong(i4, ((Boolean) a3).booleanValue() ? 1L : 0L);
                                }
                                i3 = i4;
                            }
                        }
                        return new SQLiteCursor(sQLiteCursorDriver, str2, sQLiteQuery);
                    }
                }, str, AbstractC1240a.f10718a, null);
                try {
                    HashMap c3 = c(mVar, num);
                    if (num != null && !mVar.isLast() && !mVar.isAfterLast()) {
                        int i3 = this.f10735m + 1;
                        this.f10735m = i3;
                        c3.put("cursorId", Integer.valueOf(i3));
                        C1248i c1248i2 = new C1248i(i3, num.intValue(), mVar);
                        try {
                            this.f10729g.put(Integer.valueOf(i3), c1248i2);
                            c1248i = c1248i2;
                        } catch (Exception e3) {
                            e = e3;
                            c1248i = c1248i2;
                            i(e, aVar);
                            if (c1248i != null) {
                                b(c1248i);
                            }
                            if (c1248i != null || mVar == 0) {
                                return false;
                            }
                            mVar.close();
                            return false;
                        } catch (Throwable th) {
                            th = th;
                            c1248i = c1248i2;
                            if (c1248i == null && mVar != 0) {
                                mVar.close();
                            }
                            throw th;
                        }
                    }
                    aVar.e(c3);
                    if (c1248i == null) {
                        mVar.close();
                    }
                    return true;
                } catch (Exception e4) {
                    e = e4;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (Exception e5) {
            e = e5;
            mVar = 0;
        } catch (Throwable th3) {
            th = th3;
            mVar = 0;
        }
    }

    public final boolean f(S0.a aVar) {
        if (g(aVar)) {
            Cursor cursor = null;
            try {
                if (aVar.p()) {
                    aVar.e(null);
                    return true;
                }
                try {
                    Cursor rawQuery = this.f10731i.rawQuery("SELECT changes()", null);
                    if (rawQuery != null) {
                        try {
                            if (rawQuery.getCount() > 0 && rawQuery.moveToFirst()) {
                                int i3 = rawQuery.getInt(0);
                                if (this.f10727d >= 1) {
                                    Log.d("Sqflite", h() + "changed " + i3);
                                }
                                aVar.e(Integer.valueOf(i3));
                                rawQuery.close();
                                return true;
                            }
                        } catch (Exception e3) {
                            e = e3;
                            cursor = rawQuery;
                            i(e, aVar);
                            if (cursor != null) {
                                cursor.close();
                            }
                            return false;
                        } catch (Throwable th) {
                            th = th;
                            cursor = rawQuery;
                            if (cursor != null) {
                                cursor.close();
                            }
                            throw th;
                        }
                    }
                    Log.e("Sqflite", h() + "fail to read changes for Update/Delete");
                    aVar.e(null);
                    if (rawQuery != null) {
                        rawQuery.close();
                    }
                    return true;
                } catch (Exception e4) {
                    e = e4;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        }
        return false;
    }

    public final boolean g(S0.a aVar) {
        String str = (String) aVar.m("sql");
        m mVar = new m(str, (List) aVar.m("arguments"));
        if (this.f10727d >= 1) {
            Log.d("Sqflite", h() + mVar);
        }
        Object m3 = aVar.m("inTransaction");
        Boolean bool = m3 instanceof Boolean ? (Boolean) m3 : null;
        try {
            SQLiteDatabase sQLiteDatabase = this.f10731i;
            ArrayList arrayList = new ArrayList();
            List list = mVar.f10769b;
            if (list != null) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(m.a(it.next()));
                }
            }
            sQLiteDatabase.execSQL(str, arrayList.toArray(new Object[0]));
            synchronized (this) {
                try {
                    if (Boolean.TRUE.equals(bool)) {
                        this.f10732j++;
                    } else if (Boolean.FALSE.equals(bool)) {
                        this.f10732j--;
                    }
                } finally {
                }
            }
            return true;
        } catch (Exception e3) {
            i(e3, aVar);
            return false;
        }
    }

    public final String h() {
        StringBuilder sb = new StringBuilder("[");
        Thread currentThread = Thread.currentThread();
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f10726c);
        sb2.append(StringUtils.COMMA);
        sb2.append(currentThread.getName());
        sb2.append("(");
        sb2.append(Build.VERSION.SDK_INT >= 36 ? currentThread.threadId() : currentThread.getId());
        sb2.append(")");
        sb.append(sb2.toString());
        sb.append("] ");
        return sb.toString();
    }

    public final void i(Exception exc, S0.a aVar) {
        if (exc instanceof SQLiteCantOpenDatabaseException) {
            aVar.f("open_failed " + this.f10725b, null);
            return;
        }
        if (exc instanceof SQLException) {
            String message = exc.getMessage();
            String str = (String) aVar.m("sql");
            Collection collection = (List) aVar.m("arguments");
            if (collection == null) {
                collection = new ArrayList();
            }
            HashMap hashMap = new HashMap();
            hashMap.put("sql", str);
            hashMap.put("arguments", collection);
            aVar.f(message, hashMap);
            return;
        }
        String message2 = exc.getMessage();
        String str2 = (String) aVar.m("sql");
        Collection collection2 = (List) aVar.m("arguments");
        if (collection2 == null) {
            collection2 = new ArrayList();
        }
        HashMap hashMap2 = new HashMap();
        hashMap2.put("sql", str2);
        hashMap2.put("arguments", collection2);
        aVar.f(message2, hashMap2);
    }

    public final synchronized boolean j() {
        return this.f10732j > 0;
    }

    public final void k() {
        ApplicationInfo applicationInfo;
        PackageManager.ApplicationInfoFlags of;
        if (f10723n == null) {
            Context context = this.f10728e;
            boolean z = false;
            try {
                String packageName = context.getPackageName();
                if (Build.VERSION.SDK_INT >= 33) {
                    PackageManager packageManager = context.getPackageManager();
                    of = PackageManager.ApplicationInfoFlags.of(128L);
                    applicationInfo = packageManager.getApplicationInfo(packageName, of);
                } else {
                    applicationInfo = context.getPackageManager().getApplicationInfo(packageName, 128);
                }
                if (applicationInfo.metaData.getBoolean("com.tekartik.sqflite.wal_enabled", false)) {
                    z = true;
                }
            } catch (Exception e3) {
                e3.printStackTrace();
            }
            f10723n = Boolean.valueOf(z);
            if (z && AbstractC1240a.a(this.f10727d)) {
                Log.d("Sqflite", h() + "[sqflite] WAL enabled");
            }
        }
        this.f10731i = SQLiteDatabase.openDatabase(this.f10725b, null, f10723n.booleanValue() ? 805306368 : 268435456);
    }

    public final void l(C1254b c1254b, Runnable runnable) {
        Integer num = (Integer) c1254b.m("transactionId");
        Integer num2 = this.f10734l;
        if (num2 == null) {
            runnable.run();
            return;
        }
        ArrayList arrayList = this.f;
        if (num == null || !(num.equals(num2) || num.intValue() == -1)) {
            arrayList.add(new C1256d(runnable));
            return;
        }
        runnable.run();
        if (this.f10734l != null || arrayList.isEmpty()) {
            return;
        }
        this.f10730h.c(this, new n(25, this));
    }
}
