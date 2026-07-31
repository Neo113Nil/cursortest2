package com.ironsource;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import com.huawei.hms.framework.common.hianalytics.CrashHianalyticsData;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public class fa extends SQLiteOpenHelper {

    /* renamed from: a, reason: collision with root package name */
    private static ea f16229a = new ea();

    public fa(Context context) {
        super(context, "reports", (SQLiteDatabase.CursorFactory) null, 1);
    }

    public static Cursor a(int i4) {
        SQLiteDatabase sQLiteDatabase = null;
        try {
            SQLiteDatabase a4 = f16229a.a(new fa(o9.d().a()));
            try {
                Cursor rawQuery = a4.rawQuery("SELECT * FROM REPORTSWHERE id= " + i4 + ";", null);
                a4.close();
                return rawQuery;
            } catch (Throwable th) {
                th = th;
                sQLiteDatabase = a4;
                if (sQLiteDatabase != null) {
                    sQLiteDatabase.close();
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public static lc b(int i4) {
        SQLiteDatabase a4;
        SQLiteDatabase sQLiteDatabase = null;
        try {
            a4 = f16229a.a(new fa(o9.d().a()));
        } catch (Throwable th) {
            th = th;
        }
        try {
            Cursor rawQuery = a4.rawQuery("SELECT * FROM REPORTSWHERE id= " + i4 + ";", null);
            int i5 = rawQuery.getInt(0);
            String string = rawQuery.getString(1);
            String string2 = rawQuery.getString(2);
            String string3 = rawQuery.getString(3);
            rawQuery.close();
            lc lcVar = new lc(i5, string, string2, string3);
            a4.close();
            return lcVar;
        } catch (Throwable th2) {
            th = th2;
            sQLiteDatabase = a4;
            if (sQLiteDatabase != null) {
                sQLiteDatabase.close();
            }
            throw th;
        }
    }

    public static Cursor c() {
        fa faVar = new fa(o9.d().a());
        new ArrayList();
        SQLiteDatabase sQLiteDatabase = null;
        try {
            SQLiteDatabase a4 = f16229a.a(faVar);
            try {
                Cursor rawQuery = a4.rawQuery("SELECT * FROM REPORTS;", null);
                a4.close();
                return rawQuery;
            } catch (Throwable th) {
                th = th;
                sQLiteDatabase = a4;
                if (sQLiteDatabase != null) {
                    sQLiteDatabase.close();
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onCreate(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS REPORTS(id INTEGER PRIMARY KEY AUTOINCREMENT , stack_trace TEXT NOT NULL, crash_date TEXT NOT NULL,crashType TEXT NOT NULL );");
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i4, int i5) {
    }

    public static void a() {
        SQLiteDatabase sQLiteDatabase = null;
        try {
            sQLiteDatabase = f16229a.a(true, new fa(o9.d().a()));
            sQLiteDatabase.execSQL("DELETE FROM REPORTS WHERE id >= 0;");
            sQLiteDatabase.close();
        } catch (Throwable th) {
            if (sQLiteDatabase != null) {
                sQLiteDatabase.close();
            }
            throw th;
        }
    }

    public static List<lc> b() {
        SQLiteDatabase a4;
        fa faVar = new fa(o9.d().a());
        ArrayList arrayList = new ArrayList();
        SQLiteDatabase sQLiteDatabase = null;
        try {
            a4 = f16229a.a(faVar);
        } catch (Throwable th) {
            th = th;
        }
        try {
            Cursor rawQuery = a4.rawQuery("SELECT * FROM REPORTS ;", null);
            if (rawQuery.moveToFirst()) {
                do {
                    arrayList.add(new lc(rawQuery.getInt(0), rawQuery.getString(1), rawQuery.getString(2), rawQuery.getString(3)));
                } while (rawQuery.moveToNext());
            }
            rawQuery.close();
            a4.close();
            return arrayList;
        } catch (Throwable th2) {
            th = th2;
            sQLiteDatabase = a4;
            if (sQLiteDatabase != null) {
                sQLiteDatabase.close();
            }
            throw th;
        }
    }

    public static void a(lc lcVar) {
        SQLiteDatabase sQLiteDatabase = null;
        try {
            SQLiteDatabase a4 = f16229a.a(true, new fa(o9.d().a()));
            try {
                a4.beginTransaction();
                ContentValues contentValues = new ContentValues();
                String e4 = lcVar.e();
                String b4 = lcVar.b();
                String d4 = lcVar.d();
                contentValues.put(CrashHianalyticsData.STACK_TRACE, e4);
                contentValues.put("crash_date", b4);
                contentValues.put("crashType", d4);
                a4.insert("REPORTS", null, contentValues);
                a4.setTransactionSuccessful();
                a4.endTransaction();
                a4.close();
            } catch (Throwable th) {
                th = th;
                sQLiteDatabase = a4;
                if (sQLiteDatabase != null) {
                    sQLiteDatabase.endTransaction();
                    sQLiteDatabase.close();
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }
}
