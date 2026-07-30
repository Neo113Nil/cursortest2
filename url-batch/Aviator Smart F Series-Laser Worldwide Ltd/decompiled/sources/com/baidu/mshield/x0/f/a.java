package com.baidu.mshield.x0.f;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.text.TextUtils;
import com.baidu.mshield.x0.d.d;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    public static a f8455a;

    /* renamed from: d, reason: collision with root package name */
    public C0088a f8458d;

    /* renamed from: e, reason: collision with root package name */
    public SQLiteDatabase f8459e;

    /* renamed from: b, reason: collision with root package name */
    public String f8456b = "msvolcano.db";

    /* renamed from: c, reason: collision with root package name */
    public int f8457c = 1;

    /* renamed from: f, reason: collision with root package name */
    public String f8460f = "msal";

    /* renamed from: g, reason: collision with root package name */
    public String f8461g = "CREATE TABLE IF NOT EXISTS " + this.f8460f + "(a TEXT PRIMARY KEY ON CONFLICT ABORT,b INTEGER,c TEXT)";

    /* renamed from: com.baidu.mshield.x0.f.a$a, reason: collision with other inner class name */
    public class C0088a extends SQLiteOpenHelper {
        public C0088a(Context context) {
            super(context, a.this.f8456b, (SQLiteDatabase.CursorFactory) null, a.this.f8457c);
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onCreate(SQLiteDatabase sQLiteDatabase) {
            try {
                sQLiteDatabase.execSQL(a.this.f8461g);
            } catch (Throwable th) {
                d.a(th);
            }
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i8, int i9) {
        }
    }

    public a(Context context) {
        try {
            context.getApplicationContext();
            C0088a c0088a = new C0088a(context.getApplicationContext());
            this.f8458d = c0088a;
            this.f8459e = c0088a.getWritableDatabase();
        } catch (Throwable th) {
            d.a(th);
        }
    }

    public static synchronized a a(Context context) {
        a aVar;
        synchronized (a.class) {
            try {
                if (f8455a == null) {
                    f8455a = new a(context);
                }
                aVar = f8455a;
            } catch (Throwable th) {
                throw th;
            }
        }
        return aVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0029, code lost:
    
        if (r9.isClosed() == false) goto L23;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean b(String str) {
        SQLiteDatabase sQLiteDatabase = this.f8459e;
        boolean z7 = false;
        if (sQLiteDatabase == null) {
            return false;
        }
        Cursor cursor = null;
        try {
            cursor = sQLiteDatabase.query(this.f8460f, null, "a=?", new String[]{str}, null, null, null);
            if (cursor != null) {
                if (cursor.getCount() > 0) {
                    z7 = true;
                }
            }
            if (cursor != null) {
            }
        } catch (Throwable th) {
            try {
                d.a(th);
            } finally {
                if (cursor != null && !cursor.isClosed()) {
                    cursor.close();
                }
            }
        }
        return z7;
    }

    public int a(com.baidu.mshield.x0.d.a aVar) {
        int i8 = 0;
        if (aVar != null && this.f8459e != null) {
            try {
                String b8 = d.b(aVar.f8424a);
                if (TextUtils.isEmpty(b8)) {
                    return 0;
                }
                ContentValues contentValues = new ContentValues();
                contentValues.put("a", b8);
                contentValues.put("b", Integer.valueOf(aVar.f8425b));
                contentValues.put("c", Long.valueOf(aVar.f8426c));
                if (b(b8)) {
                    i8 = this.f8459e.update(this.f8460f, contentValues, "a= ?", new String[]{b8});
                } else {
                    i8 = (int) this.f8459e.insert(this.f8460f, null, contentValues);
                }
            } catch (Throwable th) {
                d.a(th);
            }
        }
        return i8;
    }

    public com.baidu.mshield.x0.d.a a(String str) {
        Cursor cursor;
        Throwable th;
        com.baidu.mshield.x0.d.a aVar;
        com.baidu.mshield.x0.d.a aVar2;
        String b8;
        boolean isClosed;
        com.baidu.mshield.x0.d.a aVar3 = null;
        if (this.f8459e == null) {
            return null;
        }
        try {
            b8 = d.b(str);
        } catch (Throwable th2) {
            cursor = null;
            th = th2;
            aVar = null;
        }
        if (TextUtils.isEmpty(b8)) {
            return null;
        }
        Cursor cursor2 = this.f8459e.query(this.f8460f, null, "a=?", new String[]{b8}, null, null, null);
        if (cursor2 != null) {
            try {
                if (cursor2.getCount() > 0) {
                    while (cursor2.moveToNext()) {
                        aVar2 = new com.baidu.mshield.x0.d.a();
                        try {
                            aVar2.f8424a = d.a(cursor2.getString(cursor2.getColumnIndex("a")));
                            aVar2.f8425b = cursor2.getInt(cursor2.getColumnIndex("b"));
                            aVar2.f8426c = Long.parseLong(cursor2.getString(cursor2.getColumnIndex("c")));
                            aVar3 = aVar2;
                        } catch (Throwable th3) {
                            th = th3;
                            try {
                                d.a(th);
                                if (cursor2 != null || cursor2.isClosed()) {
                                    return aVar2;
                                }
                                aVar3 = aVar2;
                                return aVar3;
                            } finally {
                                if (cursor2 != null && !cursor2.isClosed()) {
                                    cursor2.close();
                                }
                            }
                        }
                    }
                }
            } catch (Throwable th4) {
                cursor = cursor2;
                aVar = aVar3;
                th = th4;
                Cursor cursor3 = cursor;
                aVar2 = aVar;
                cursor2 = cursor3;
                d.a(th);
                if (cursor2 != null) {
                }
                return aVar2;
            }
        }
        if (cursor2 == null) {
            return aVar3;
        }
        if (isClosed) {
            return aVar3;
        }
        return aVar3;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0065, code lost:
    
        if (r1.isClosed() == false) goto L24;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public List<com.baidu.mshield.x0.d.a> a() {
        Cursor cursor = null;
        if (this.f8459e == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        try {
            cursor = this.f8459e.query(this.f8460f, null, null, null, null, null, "b DESC");
            if (cursor != null && cursor.getCount() > 0) {
                while (cursor.moveToNext()) {
                    com.baidu.mshield.x0.d.a aVar = new com.baidu.mshield.x0.d.a();
                    aVar.f8424a = d.a(cursor.getString(cursor.getColumnIndex("a")));
                    aVar.f8425b = cursor.getInt(cursor.getColumnIndex("b"));
                    aVar.f8426c = Long.parseLong(cursor.getString(cursor.getColumnIndex("c")));
                    arrayList.add(aVar);
                }
            }
            if (cursor != null) {
            }
        } catch (Throwable th) {
            try {
                d.a(th);
            } finally {
                if (cursor != null && !cursor.isClosed()) {
                    cursor.close();
                }
            }
        }
        return arrayList;
    }
}
