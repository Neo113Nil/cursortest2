package B;

import a.AbstractC0016a;
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
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class g {

    /* renamed from: n, reason: collision with root package name */
    public static Boolean f18n;

    /* renamed from: a, reason: collision with root package name */
    public final boolean f19a;

    /* renamed from: b, reason: collision with root package name */
    public final String f20b;

    /* renamed from: c, reason: collision with root package name */
    public final int f21c;

    /* renamed from: d, reason: collision with root package name */
    public final int f22d;

    /* renamed from: e, reason: collision with root package name */
    public final Context f23e;

    /* renamed from: h, reason: collision with root package name */
    public l f26h;

    /* renamed from: i, reason: collision with root package name */
    public SQLiteDatabase f27i;

    /* renamed from: l, reason: collision with root package name */
    public Integer f30l;

    /* renamed from: f, reason: collision with root package name */
    public final ArrayList f24f = new ArrayList();

    /* renamed from: g, reason: collision with root package name */
    public final HashMap f25g = new HashMap();

    /* renamed from: j, reason: collision with root package name */
    public int f28j = 0;

    /* renamed from: k, reason: collision with root package name */
    public int f29k = 0;

    /* renamed from: m, reason: collision with root package name */
    public int f31m = 0;

    public g(Context context, String str, int i2, boolean z, int i3) {
        this.f23e = context;
        this.f20b = str;
        this.f19a = z;
        this.f21c = i2;
        this.f22d = i3;
    }

    public static HashMap c(Cursor cursor, Integer num) {
        HashMap hashMap = null;
        ArrayList arrayList = null;
        int i2 = 0;
        while (cursor.moveToNext()) {
            if (hashMap == null) {
                arrayList = new ArrayList();
                hashMap = new HashMap();
                i2 = cursor.getColumnCount();
                hashMap.put("columns", Arrays.asList(cursor.getColumnNames()));
                hashMap.put("rows", arrayList);
            }
            ArrayList arrayList2 = new ArrayList(i2);
            for (int i3 = 0; i3 < i2; i3++) {
                int type = cursor.getType(i3);
                arrayList2.add(type != 1 ? type != 2 ? type != 3 ? type != 4 ? null : cursor.getBlob(i3) : cursor.getString(i3) : Double.valueOf(cursor.getDouble(i3)) : Long.valueOf(cursor.getLong(i3)));
            }
            arrayList.add(arrayList2);
            if (num != null && arrayList.size() >= num.intValue()) {
                break;
            }
        }
        return hashMap == null ? new HashMap() : hashMap;
    }

    public final void a() {
        HashMap hashMap = this.f25g;
        if (!hashMap.isEmpty() && a.a(this.f22d)) {
            Log.d("Sqflite", h() + hashMap.size() + " cursor(s) are left opened");
        }
        this.f27i.close();
    }

    public final void b(o oVar) {
        try {
            int i2 = oVar.f55a;
            if (a.b(this.f22d)) {
                Log.d("Sqflite", h() + "closing cursor " + i2);
            }
            this.f25g.remove(Integer.valueOf(i2));
            oVar.f57c.close();
        } catch (Exception unused) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00cd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean d(AbstractC0016a abstractC0016a) {
        Exception e2;
        Cursor cursor;
        if (!g(abstractC0016a)) {
            return false;
        }
        SQLiteCursor sQLiteCursor = 0;
        if (abstractC0016a.p()) {
            abstractC0016a.c(null);
            return true;
        }
        try {
            try {
                cursor = this.f27i.rawQuery("SELECT changes(), last_insert_rowid()", null);
                if (cursor != null) {
                    try {
                        if (cursor.getCount() > 0 && cursor.moveToFirst()) {
                            int i2 = cursor.getInt(0);
                            int i3 = this.f22d;
                            if (i2 == 0) {
                                if (a.a(i3)) {
                                    Log.d("Sqflite", h() + "no changes (id was " + cursor.getLong(1) + ")");
                                }
                                abstractC0016a.c(null);
                                cursor.close();
                                return true;
                            }
                            long j2 = cursor.getLong(1);
                            if (a.a(i3)) {
                                Log.d("Sqflite", h() + "inserted " + j2);
                            }
                            abstractC0016a.c(Long.valueOf(j2));
                            cursor.close();
                            return true;
                        }
                    } catch (Exception e3) {
                        e2 = e3;
                        i(e2, abstractC0016a);
                        if (cursor != null) {
                            cursor.close();
                        }
                        return false;
                    }
                }
                Log.e("Sqflite", h() + "fail to read changes for Insert");
                abstractC0016a.c(null);
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
        } catch (Exception e4) {
            e2 = e4;
            cursor = null;
        } catch (Throwable th2) {
            th = th2;
            if (sQLiteCursor != 0) {
            }
            throw th;
        }
    }

    public final boolean e(AbstractC0016a abstractC0016a) {
        Cursor cursor;
        Integer num = (Integer) abstractC0016a.m("cursorPageSize");
        String str = (String) abstractC0016a.m("sql");
        final u uVar = new u(str, (List) abstractC0016a.m("arguments"));
        if (a.a(this.f22d)) {
            Log.d("Sqflite", h() + uVar);
        }
        o oVar = null;
        try {
            cursor = this.f27i.rawQueryWithFactory(new SQLiteDatabase.CursorFactory() { // from class: B.d
                @Override // android.database.sqlite.SQLiteDatabase.CursorFactory
                public final Cursor newCursor(SQLiteDatabase sQLiteDatabase, SQLiteCursorDriver sQLiteCursorDriver, String str2, SQLiteQuery sQLiteQuery) {
                    List list = u.this.f90b;
                    if (list != null) {
                        int size = list.size();
                        int i2 = 0;
                        while (i2 < size) {
                            Object a2 = u.a(list.get(i2));
                            int i3 = i2 + 1;
                            if (a2 == null) {
                                sQLiteQuery.bindNull(i3);
                            } else if (a2 instanceof byte[]) {
                                sQLiteQuery.bindBlob(i3, (byte[]) a2);
                            } else if (a2 instanceof Double) {
                                sQLiteQuery.bindDouble(i3, ((Double) a2).doubleValue());
                            } else if (a2 instanceof Integer) {
                                sQLiteQuery.bindLong(i3, ((Integer) a2).intValue());
                            } else if (a2 instanceof Long) {
                                sQLiteQuery.bindLong(i3, ((Long) a2).longValue());
                            } else if (a2 instanceof String) {
                                sQLiteQuery.bindString(i3, (String) a2);
                            } else {
                                if (!(a2 instanceof Boolean)) {
                                    throw new IllegalArgumentException("Could not bind " + a2 + " from index " + i2 + ": Supported types are null, byte[], double, long, boolean and String");
                                }
                                sQLiteQuery.bindLong(i3, ((Boolean) a2).booleanValue() ? 1L : 0L);
                            }
                            i2 = i3;
                        }
                    }
                    return new SQLiteCursor(sQLiteCursorDriver, str2, sQLiteQuery);
                }
            }, str, a.f11a, null);
            try {
                try {
                    HashMap c2 = c(cursor, num);
                    if (num != null && !cursor.isLast() && !cursor.isAfterLast()) {
                        int i2 = this.f31m + 1;
                        this.f31m = i2;
                        c2.put("cursorId", Integer.valueOf(i2));
                        o oVar2 = new o(i2, num.intValue(), cursor);
                        try {
                            this.f25g.put(Integer.valueOf(i2), oVar2);
                            oVar = oVar2;
                        } catch (Exception e2) {
                            e = e2;
                            oVar = oVar2;
                            i(e, abstractC0016a);
                            if (oVar != null) {
                                b(oVar);
                            }
                            if (oVar != null || cursor == null) {
                                return false;
                            }
                            cursor.close();
                            return false;
                        } catch (Throwable th) {
                            th = th;
                            oVar = oVar2;
                            if (oVar == null && cursor != null) {
                                cursor.close();
                            }
                            throw th;
                        }
                    }
                    abstractC0016a.c(c2);
                    if (oVar == null) {
                        cursor.close();
                    }
                    return true;
                } catch (Exception e3) {
                    e = e3;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (Exception e4) {
            e = e4;
            cursor = null;
        } catch (Throwable th3) {
            th = th3;
            cursor = null;
        }
    }

    public final boolean f(AbstractC0016a abstractC0016a) {
        if (!g(abstractC0016a)) {
            return false;
        }
        Cursor cursor = null;
        try {
            if (abstractC0016a.p()) {
                abstractC0016a.c(null);
                return true;
            }
            try {
                Cursor rawQuery = this.f27i.rawQuery("SELECT changes()", null);
                if (rawQuery != null) {
                    try {
                        if (rawQuery.getCount() > 0 && rawQuery.moveToFirst()) {
                            int i2 = rawQuery.getInt(0);
                            if (a.a(this.f22d)) {
                                Log.d("Sqflite", h() + "changed " + i2);
                            }
                            abstractC0016a.c(Integer.valueOf(i2));
                            rawQuery.close();
                            return true;
                        }
                    } catch (Exception e2) {
                        e = e2;
                        cursor = rawQuery;
                        i(e, abstractC0016a);
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
                abstractC0016a.c(null);
                if (rawQuery != null) {
                    rawQuery.close();
                }
                return true;
            } catch (Exception e3) {
                e = e3;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public final boolean g(AbstractC0016a abstractC0016a) {
        String str = (String) abstractC0016a.m("sql");
        u uVar = new u(str, (List) abstractC0016a.m("arguments"));
        if (a.a(this.f22d)) {
            Log.d("Sqflite", h() + uVar);
        }
        Object m2 = abstractC0016a.m("inTransaction");
        Boolean bool = m2 instanceof Boolean ? (Boolean) m2 : null;
        try {
            SQLiteDatabase sQLiteDatabase = this.f27i;
            ArrayList arrayList = new ArrayList();
            List list = uVar.f90b;
            if (list != null) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(u.a(it.next()));
                }
            }
            sQLiteDatabase.execSQL(str, arrayList.toArray(new Object[0]));
            synchronized (this) {
                try {
                    if (Boolean.TRUE.equals(bool)) {
                        this.f28j++;
                    } else if (Boolean.FALSE.equals(bool)) {
                        this.f28j--;
                    }
                } finally {
                }
            }
            return true;
        } catch (Exception e2) {
            i(e2, abstractC0016a);
            return false;
        }
    }

    public final String h() {
        StringBuilder sb = new StringBuilder("[");
        Thread currentThread = Thread.currentThread();
        sb.append(this.f21c + "," + currentThread.getName() + "(" + v.a(currentThread) + ")");
        sb.append("] ");
        return sb.toString();
    }

    public final void i(Exception exc, AbstractC0016a abstractC0016a) {
        if (exc instanceof SQLiteCantOpenDatabaseException) {
            abstractC0016a.b("open_failed " + this.f20b, null);
            return;
        }
        if (exc instanceof SQLException) {
            String message = exc.getMessage();
            String str = (String) abstractC0016a.m("sql");
            Collection collection = (List) abstractC0016a.m("arguments");
            if (collection == null) {
                collection = new ArrayList();
            }
            HashMap hashMap = new HashMap();
            hashMap.put("sql", str);
            hashMap.put("arguments", collection);
            abstractC0016a.b(message, hashMap);
            return;
        }
        String message2 = exc.getMessage();
        String str2 = (String) abstractC0016a.m("sql");
        Collection collection2 = (List) abstractC0016a.m("arguments");
        if (collection2 == null) {
            collection2 = new ArrayList();
        }
        HashMap hashMap2 = new HashMap();
        hashMap2.put("sql", str2);
        hashMap2.put("arguments", collection2);
        abstractC0016a.b(message2, hashMap2);
    }

    public final synchronized boolean j() {
        return this.f28j > 0;
    }

    public final void k() {
        ApplicationInfo applicationInfo;
        PackageManager.ApplicationInfoFlags of;
        if (f18n == null) {
            Context context = this.f23e;
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
            } catch (Exception e2) {
                e2.printStackTrace();
            }
            f18n = Boolean.valueOf(z);
            if (z && a.b(this.f22d)) {
                Log.d("Sqflite", h() + "[sqflite] WAL enabled");
            }
        }
        this.f27i = SQLiteDatabase.openDatabase(this.f20b, null, f18n.booleanValue() ? 805306368 : 268435456);
    }

    public final void l(C.b bVar, Runnable runnable) {
        Integer num = (Integer) bVar.m("transactionId");
        Integer num2 = this.f30l;
        if (num2 == null) {
            runnable.run();
            return;
        }
        ArrayList arrayList = this.f24f;
        if (num == null || !(num.equals(num2) || num.intValue() == -1)) {
            arrayList.add(new C.d(runnable));
            return;
        }
        runnable.run();
        if (this.f30l != null || arrayList.isEmpty()) {
            return;
        }
        this.f26h.d(this, new e(0, this));
    }
}
