package com.aiming.mdt.a;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import com.aiming.mdt.utils.C0282;
import java.util.ArrayList;

/* renamed from: com.aiming.mdt.a.ʿˈˉ, reason: contains not printable characters */
/* loaded from: classes.dex */
class C0188 extends SQLiteOpenHelper {

    /* renamed from: ʻʼ, reason: contains not printable characters */
    private static C0188 f657;

    /* renamed from: ʼ, reason: contains not printable characters */
    private SQLiteDatabase f658;

    private C0188(Context context, String str, int i) {
        super(context, str, (SQLiteDatabase.CursorFactory) null, i);
    }

    /* renamed from: ʻʽ, reason: contains not printable characters */
    public static C0188 m712(Context context, String str, int i) {
        if (f657 == null) {
            synchronized (C0188.class) {
                if (f657 == null) {
                    f657 = new C0188(context, str, i);
                }
            }
        }
        return f657;
    }

    /* renamed from: ʼ, reason: contains not printable characters */
    private boolean m713() {
        return this.f658 != null && this.f658.isOpen();
    }

    @Override // android.database.sqlite.SQLiteOpenHelper, java.lang.AutoCloseable
    public synchronized void close() {
        if (m713()) {
            this.f658.close();
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public SQLiteDatabase getReadableDatabase() {
        this.f658 = super.getReadableDatabase();
        return this.f658;
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public SQLiteDatabase getWritableDatabase() {
        this.f658 = super.getWritableDatabase();
        return this.f658;
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onCreate(SQLiteDatabase sQLiteDatabase) {
        this.f658 = sQLiteDatabase;
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
    }

    /* renamed from: ʻ, reason: contains not printable characters */
    public final boolean m714(String str) {
        getWritableDatabase();
        boolean z = false;
        try {
            if (!m713()) {
                return false;
            }
            try {
                this.f658.execSQL(str);
                z = true;
            } catch (Exception e) {
                C0282.m972("DataBaseHelper", e);
                C0076.m232().m236(e);
            }
            return z;
        } finally {
            close();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0059, code lost:
    
        if (r8.isClosed() == false) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x005b, code lost:
    
        r8.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x007b, code lost:
    
        if (r8.isClosed() == false) goto L27;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v4, types: [android.database.Cursor] */
    /* renamed from: ʼ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    final ArrayList<String[]> m715(String str) {
        Exception e;
        Cursor cursor;
        ArrayList<String[]> arrayList = new ArrayList<>();
        getWritableDatabase();
        if (!m713()) {
            return arrayList;
        }
        try {
            try {
                cursor = this.f658.rawQuery(str, null);
                if (cursor != null) {
                    try {
                        if (cursor.moveToFirst()) {
                            do {
                                int columnCount = cursor.getColumnCount();
                                if (arrayList.size() == 0) {
                                    String[] strArr = new String[columnCount];
                                    for (int i = 0; i < columnCount; i++) {
                                        strArr[i] = cursor.getColumnName(i);
                                    }
                                    arrayList.add(strArr);
                                }
                                String[] strArr2 = new String[columnCount];
                                for (int i2 = 0; i2 < columnCount; i2++) {
                                    strArr2[i2] = cursor.getString(i2);
                                }
                                arrayList.add(strArr2);
                            } while (cursor.moveToNext());
                        }
                    } catch (Exception e2) {
                        e = e2;
                        C0282.m972("DataBaseHelper", e);
                        C0076.m232().m236(e);
                        if (cursor != null) {
                        }
                        close();
                        return arrayList;
                    }
                }
                if (cursor != null) {
                }
            } catch (Throwable th) {
                th = th;
                if (str != 0 && !str.isClosed()) {
                    str.close();
                }
                close();
                throw th;
            }
        } catch (Exception e3) {
            e = e3;
            cursor = null;
        } catch (Throwable th2) {
            th = th2;
            str = 0;
            if (str != 0) {
                str.close();
            }
            close();
            throw th;
        }
        close();
        return arrayList;
    }
}
