package h0;

import D0.RunnableC0043c;
import a.AbstractC0132a;
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

/* renamed from: h0.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0197e {

    /* renamed from: n, reason: collision with root package name */
    public static Boolean f2289n;

    /* renamed from: a, reason: collision with root package name */
    public final boolean f2290a;

    /* renamed from: b, reason: collision with root package name */
    public final String f2291b;

    /* renamed from: c, reason: collision with root package name */
    public final int f2292c;

    /* renamed from: d, reason: collision with root package name */
    public final int f2293d;

    /* renamed from: e, reason: collision with root package name */
    public final Context f2294e;

    /* renamed from: h, reason: collision with root package name */
    public InterfaceC0200h f2297h;

    /* renamed from: i, reason: collision with root package name */
    public SQLiteDatabase f2298i;

    /* renamed from: l, reason: collision with root package name */
    public Integer f2301l;

    /* renamed from: f, reason: collision with root package name */
    public final ArrayList f2295f = new ArrayList();

    /* renamed from: g, reason: collision with root package name */
    public final HashMap f2296g = new HashMap();

    /* renamed from: j, reason: collision with root package name */
    public int f2299j = 0;

    /* renamed from: k, reason: collision with root package name */
    public int f2300k = 0;

    /* renamed from: m, reason: collision with root package name */
    public int f2302m = 0;

    public C0197e(Context context, String str, int i2, boolean z2, int i3) {
        this.f2294e = context;
        this.f2291b = str;
        this.f2290a = z2;
        this.f2292c = i2;
        this.f2293d = i3;
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
        HashMap hashMap = this.f2296g;
        if (!hashMap.isEmpty() && AbstractC0193a.a(this.f2293d)) {
            Log.d("Sqflite", h() + hashMap.size() + " cursor(s) are left opened");
        }
        this.f2298i.close();
    }

    public final void b(k kVar) {
        try {
            int i2 = kVar.f2321a;
            if (AbstractC0193a.b(this.f2293d)) {
                Log.d("Sqflite", h() + "closing cursor " + i2);
            }
            this.f2296g.remove(Integer.valueOf(i2));
            kVar.f2323c.close();
        } catch (Exception unused) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00cd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean d(AbstractC0132a abstractC0132a) {
        Exception e2;
        Cursor cursor;
        if (!g(abstractC0132a)) {
            return false;
        }
        SQLiteCursor sQLiteCursor = 0;
        if (abstractC0132a.u()) {
            abstractC0132a.l(null);
            return true;
        }
        try {
            try {
                cursor = this.f2298i.rawQuery("SELECT changes(), last_insert_rowid()", null);
                if (cursor != null) {
                    try {
                        if (cursor.getCount() > 0 && cursor.moveToFirst()) {
                            int i2 = cursor.getInt(0);
                            int i3 = this.f2293d;
                            if (i2 == 0) {
                                if (AbstractC0193a.a(i3)) {
                                    Log.d("Sqflite", h() + "no changes (id was " + cursor.getLong(1) + ")");
                                }
                                abstractC0132a.l(null);
                                cursor.close();
                                return true;
                            }
                            long j2 = cursor.getLong(1);
                            if (AbstractC0193a.a(i3)) {
                                Log.d("Sqflite", h() + "inserted " + j2);
                            }
                            abstractC0132a.l(Long.valueOf(j2));
                            cursor.close();
                            return true;
                        }
                    } catch (Exception e3) {
                        e2 = e3;
                        i(e2, abstractC0132a);
                        if (cursor != null) {
                            cursor.close();
                        }
                        return false;
                    }
                }
                Log.e("Sqflite", h() + "fail to read changes for Insert");
                abstractC0132a.l(null);
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

    public final boolean e(AbstractC0132a abstractC0132a) {
        Cursor cursor;
        Integer num = (Integer) abstractC0132a.s("cursorPageSize");
        String str = (String) abstractC0132a.s("sql");
        final q qVar = new q(str, (List) abstractC0132a.s("arguments"));
        if (AbstractC0193a.a(this.f2293d)) {
            Log.d("Sqflite", h() + qVar);
        }
        k kVar = null;
        try {
            cursor = this.f2298i.rawQueryWithFactory(new SQLiteDatabase.CursorFactory() { // from class: h0.c
                @Override // android.database.sqlite.SQLiteDatabase.CursorFactory
                public final Cursor newCursor(SQLiteDatabase sQLiteDatabase, SQLiteCursorDriver sQLiteCursorDriver, String str2, SQLiteQuery sQLiteQuery) {
                    List list = q.this.f2358b;
                    if (list != null) {
                        int size = list.size();
                        int i2 = 0;
                        while (i2 < size) {
                            Object a2 = q.a(list.get(i2));
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
            }, str, AbstractC0193a.f2284a, null);
            try {
                try {
                    HashMap c2 = c(cursor, num);
                    if (num != null && !cursor.isLast() && !cursor.isAfterLast()) {
                        int i2 = this.f2302m + 1;
                        this.f2302m = i2;
                        c2.put("cursorId", Integer.valueOf(i2));
                        k kVar2 = new k(i2, num.intValue(), cursor);
                        try {
                            this.f2296g.put(Integer.valueOf(i2), kVar2);
                            kVar = kVar2;
                        } catch (Exception e2) {
                            e = e2;
                            kVar = kVar2;
                            i(e, abstractC0132a);
                            if (kVar != null) {
                                b(kVar);
                            }
                            if (kVar != null || cursor == null) {
                                return false;
                            }
                            cursor.close();
                            return false;
                        } catch (Throwable th) {
                            th = th;
                            kVar = kVar2;
                            if (kVar == null && cursor != null) {
                                cursor.close();
                            }
                            throw th;
                        }
                    }
                    abstractC0132a.l(c2);
                    if (kVar == null) {
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

    public final boolean f(AbstractC0132a abstractC0132a) {
        if (!g(abstractC0132a)) {
            return false;
        }
        Cursor cursor = null;
        try {
            if (abstractC0132a.u()) {
                abstractC0132a.l(null);
                return true;
            }
            try {
                Cursor rawQuery = this.f2298i.rawQuery("SELECT changes()", null);
                if (rawQuery != null) {
                    try {
                        if (rawQuery.getCount() > 0 && rawQuery.moveToFirst()) {
                            int i2 = rawQuery.getInt(0);
                            if (AbstractC0193a.a(this.f2293d)) {
                                Log.d("Sqflite", h() + "changed " + i2);
                            }
                            abstractC0132a.l(Integer.valueOf(i2));
                            rawQuery.close();
                            return true;
                        }
                    } catch (Exception e2) {
                        e = e2;
                        cursor = rawQuery;
                        i(e, abstractC0132a);
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
                abstractC0132a.l(null);
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

    public final boolean g(AbstractC0132a abstractC0132a) {
        String str = (String) abstractC0132a.s("sql");
        q qVar = new q(str, (List) abstractC0132a.s("arguments"));
        if (AbstractC0193a.a(this.f2293d)) {
            Log.d("Sqflite", h() + qVar);
        }
        Object s2 = abstractC0132a.s("inTransaction");
        Boolean bool = s2 instanceof Boolean ? (Boolean) s2 : null;
        try {
            SQLiteDatabase sQLiteDatabase = this.f2298i;
            ArrayList arrayList = new ArrayList();
            List list = qVar.f2358b;
            if (list != null) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(q.a(it.next()));
                }
            }
            sQLiteDatabase.execSQL(str, arrayList.toArray(new Object[0]));
            synchronized (this) {
                try {
                    if (Boolean.TRUE.equals(bool)) {
                        this.f2299j++;
                    } else if (Boolean.FALSE.equals(bool)) {
                        this.f2299j--;
                    }
                } finally {
                }
            }
            return true;
        } catch (Exception e2) {
            i(e2, abstractC0132a);
            return false;
        }
    }

    public final String h() {
        StringBuilder sb = new StringBuilder("[");
        Thread currentThread = Thread.currentThread();
        sb.append(this.f2292c + "," + currentThread.getName() + "(" + currentThread.getId() + ")");
        sb.append("] ");
        return sb.toString();
    }

    public final void i(Exception exc, AbstractC0132a abstractC0132a) {
        if (exc instanceof SQLiteCantOpenDatabaseException) {
            abstractC0132a.d("open_failed " + this.f2291b, null);
            return;
        }
        if (exc instanceof SQLException) {
            String message = exc.getMessage();
            String str = (String) abstractC0132a.s("sql");
            Collection collection = (List) abstractC0132a.s("arguments");
            if (collection == null) {
                collection = new ArrayList();
            }
            HashMap hashMap = new HashMap();
            hashMap.put("sql", str);
            hashMap.put("arguments", collection);
            abstractC0132a.d(message, hashMap);
            return;
        }
        String message2 = exc.getMessage();
        String str2 = (String) abstractC0132a.s("sql");
        Collection collection2 = (List) abstractC0132a.s("arguments");
        if (collection2 == null) {
            collection2 = new ArrayList();
        }
        HashMap hashMap2 = new HashMap();
        hashMap2.put("sql", str2);
        hashMap2.put("arguments", collection2);
        abstractC0132a.d(message2, hashMap2);
    }

    public final synchronized boolean j() {
        return this.f2299j > 0;
    }

    public final void k() {
        ApplicationInfo applicationInfo;
        PackageManager.ApplicationInfoFlags of;
        if (f2289n == null) {
            Context context = this.f2294e;
            boolean z2 = false;
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
                    z2 = true;
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
            f2289n = Boolean.valueOf(z2);
            if (z2 && AbstractC0193a.b(this.f2293d)) {
                Log.d("Sqflite", h() + "[sqflite] WAL enabled");
            }
        }
        this.f2298i = SQLiteDatabase.openDatabase(this.f2291b, null, f2289n.booleanValue() ? 805306368 : 268435456);
    }

    public final void l(i0.b bVar, Runnable runnable) {
        Integer num = (Integer) bVar.s("transactionId");
        Integer num2 = this.f2301l;
        if (num2 == null) {
            runnable.run();
            return;
        }
        ArrayList arrayList = this.f2295f;
        if (num == null || !(num.equals(num2) || num.intValue() == -1)) {
            arrayList.add(new i0.d(runnable));
            return;
        }
        runnable.run();
        if (this.f2301l != null || arrayList.isEmpty()) {
            return;
        }
        this.f2297h.b(this, new RunnableC0043c(2, this));
    }
}
