package com.bytedance.sdk.openadsdk.kgc.zmn;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;
import com.bytedance.sdk.component.utils.iqz;
import com.bytedance.sdk.component.utils.phc;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes5.dex */
public class zmn extends SQLiteOpenHelper {
    private static volatile zmn fs;
    final Context zmn;

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
    }

    private static zmn zn() {
        if (fs == null) {
            synchronized (zmn.class) {
                try {
                    if (fs == null) {
                        if (phc.zmn(com.bytedance.sdk.openadsdk.kgc.zmn.zmn())) {
                            fs = new zmn(com.bytedance.sdk.openadsdk.kgc.zmn.zmn(), "pag_monitor.db");
                        } else {
                            fs = new zmn(com.bytedance.sdk.openadsdk.kgc.zmn.zmn(), "pag_monitor_" + phc.zn(com.bytedance.sdk.openadsdk.kgc.zmn.zmn()) + ".db");
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return fs;
    }

    public static SQLiteDatabase zmn() {
        try {
            zmn zn = zn();
            if (zn == null) {
                return null;
            }
            SQLiteDatabase writableDatabase = zn.getWritableDatabase();
            if (writableDatabase.isOpen()) {
                return writableDatabase;
            }
            return null;
        } catch (Throwable th) {
            Log.i("MonitorSQLiteOpenHelper", th.getMessage());
            return null;
        }
    }

    public static SQLiteDatabase fs() {
        try {
            zmn zn = zn();
            if (zn == null) {
                return null;
            }
            SQLiteDatabase readableDatabase = zn.getReadableDatabase();
            if (readableDatabase.isOpen()) {
                return readableDatabase;
            }
            return null;
        } catch (Throwable th) {
            Log.i("MonitorSQLiteOpenHelper", th.getMessage());
            return null;
        }
    }

    private zmn(Context context, String str) {
        super(context, str, (SQLiteDatabase.CursorFactory) null, 1);
        this.zmn = context;
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onCreate(SQLiteDatabase sQLiteDatabase) {
        try {
            sQLiteDatabase.execSQL(new StringBuilder("CREATE TABLE IF NOT EXISTS monitor_table (_id INTEGER PRIMARY KEY AUTOINCREMENT,sdk_version TEXT ,scene TEXT ,start_count INTEGER default 0 , success_count INTEGER default 0  , fail_count INTEGER default 0  , rit TEXT  , tag TEXT  , label TEXT  , timestamp INTEGER default 0 ,mediation TEXT  , is_init INTEGER , extra TEXT )").toString());
        } catch (Throwable th) {
            Log.e("MonitorSQLiteOpenHelper", th.getMessage());
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        try {
            if (i > i2) {
                zmn(sQLiteDatabase);
                onCreate(sQLiteDatabase);
            } else {
                onCreate(sQLiteDatabase);
            }
        } catch (Throwable unused) {
        }
    }

    private void zmn(SQLiteDatabase sQLiteDatabase) {
        ArrayList<String> fs2 = fs(sQLiteDatabase);
        if (fs2 == null || fs2.size() <= 0) {
            return;
        }
        Iterator<String> it = fs2.iterator();
        while (it.hasNext()) {
            sQLiteDatabase.execSQL(String.format("DROP TABLE IF EXISTS %s ;", it.next()));
        }
    }

    private ArrayList<String> fs(SQLiteDatabase sQLiteDatabase) {
        ArrayList<String> arrayList = new ArrayList<>();
        try {
            Cursor rawQuery = sQLiteDatabase.rawQuery("select name from sqlite_master where type='table' order by name", null);
            if (rawQuery != null) {
                while (rawQuery.moveToNext()) {
                    String string = rawQuery.getString(0);
                    if (!string.equals("android_metadata") && !string.equals("sqlite_sequence")) {
                        arrayList.add(string);
                    }
                }
                rawQuery.close();
            }
        } catch (Exception e) {
            iqz.zn("MonitorSQLiteOpenHelper", e.getMessage());
        }
        return arrayList;
    }
}
