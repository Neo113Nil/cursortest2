package com.ironsource.a;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import com.tapjoy.TapjoyConstants;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;

/* compiled from: DataBaseEventsStorage.java */
/* loaded from: classes2.dex */
public class a extends SQLiteOpenHelper {

    /* renamed from: a, reason: collision with root package name */
    private static a f6702a;

    /* renamed from: b, reason: collision with root package name */
    private final int f6703b;

    /* renamed from: c, reason: collision with root package name */
    private final int f6704c;

    /* renamed from: d, reason: collision with root package name */
    private final String f6705d;
    private final String e;

    public a(Context context, String str, int i) {
        super(context, str, (SQLiteDatabase.CursorFactory) null, i);
        this.f6703b = 4;
        this.f6704c = 400;
        this.f6705d = "DROP TABLE IF EXISTS events";
        this.e = "CREATE TABLE events (_id INTEGER PRIMARY KEY,eventid INTEGER,timestamp INTEGER,type TEXT,data TEXT )";
    }

    public static synchronized a a(Context context, String str, int i) {
        a aVar;
        synchronized (a.class) {
            if (f6702a == null) {
                f6702a = new a(context, str, i);
            }
            aVar = f6702a;
        }
        return aVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0034, code lost:
    
        if (r0.isOpen() != false) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0036, code lost:
    
        r0.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x004d, code lost:
    
        if (r0.isOpen() != false) goto L19;
     */
    /* JADX WARN: Finally extract failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public synchronized void a(List<b> list, String str) {
        if (list != null) {
            if (!list.isEmpty()) {
                SQLiteDatabase a2 = a(true);
                try {
                    try {
                        Iterator<b> it = list.iterator();
                        while (it.hasNext()) {
                            ContentValues a3 = a(it.next(), str);
                            if (a2 != null && a3 != null) {
                                a2.insert("events", null, a3);
                            }
                        }
                        if (a2 != null) {
                        }
                    } catch (Exception unused) {
                        if (a2 != null) {
                        }
                    }
                } catch (Throwable th) {
                    if (a2 != null && a2.isOpen()) {
                        a2.close();
                    }
                    throw th;
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0071, code lost:
    
        if (r9.isOpen() != false) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0073, code lost:
    
        r9.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00a4, code lost:
    
        if (r9.isOpen() != false) goto L20;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public synchronized ArrayList<b> a(String str) {
        ArrayList<b> arrayList;
        Cursor cursor;
        SQLiteDatabase a2 = a(false);
        arrayList = new ArrayList<>();
        try {
            cursor = a2.query("events", null, "type = ?", new String[]{str}, null, null, "timestamp ASC");
            try {
                if (cursor.getCount() > 0) {
                    cursor.moveToFirst();
                    while (!cursor.isAfterLast()) {
                        arrayList.add(new b(cursor.getInt(cursor.getColumnIndex("eventid")), cursor.getLong(cursor.getColumnIndex(TapjoyConstants.TJC_TIMESTAMP)), new JSONObject(cursor.getString(cursor.getColumnIndex("data")))));
                        cursor.moveToNext();
                    }
                    cursor.close();
                }
                if (cursor != null && !cursor.isClosed()) {
                    cursor.close();
                }
                if (a2 != null) {
                }
            } catch (Exception unused) {
                if (cursor != null && !cursor.isClosed()) {
                    cursor.close();
                }
                if (a2 != null) {
                }
                return arrayList;
            } catch (Throwable th) {
                th = th;
                if (cursor != null && !cursor.isClosed()) {
                    cursor.close();
                }
                if (a2 != null && a2.isOpen()) {
                    a2.close();
                }
                throw th;
            }
        } catch (Exception unused2) {
            cursor = null;
        } catch (Throwable th2) {
            th = th2;
            cursor = null;
        }
        return arrayList;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001a, code lost:
    
        r1.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0031, code lost:
    
        if (r1.isOpen() != false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0018, code lost:
    
        if (r1.isOpen() != false) goto L9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public synchronized void b(String str) {
        SQLiteDatabase a2 = a(true);
        try {
            a2.delete("events", "type = ?", new String[]{str});
            if (a2 != null) {
            }
        } catch (Exception unused) {
            if (a2 != null) {
            }
        } catch (Throwable th) {
            if (a2 != null && a2.isOpen()) {
                a2.close();
            }
            throw th;
        }
    }

    private ContentValues a(b bVar, String str) {
        if (bVar == null) {
            return null;
        }
        ContentValues contentValues = new ContentValues(4);
        contentValues.put("eventid", Integer.valueOf(bVar.a()));
        contentValues.put(TapjoyConstants.TJC_TIMESTAMP, Long.valueOf(bVar.b()));
        contentValues.put("type", str);
        contentValues.put("data", bVar.c());
        return contentValues;
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onCreate(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("CREATE TABLE events (_id INTEGER PRIMARY KEY,eventid INTEGER,timestamp INTEGER,type TEXT,data TEXT )");
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS events");
        onCreate(sQLiteDatabase);
    }

    private synchronized SQLiteDatabase a(boolean z) {
        int i;
        int i2 = 0;
        while (true) {
            try {
                if (z) {
                    return getWritableDatabase();
                }
                return getReadableDatabase();
            } finally {
                if (i2 < i) {
                }
            }
        }
    }
}
