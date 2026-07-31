package com.bytedance.sdk.component.hhw.zmn.zmn.zmn;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import com.bytedance.sdk.component.hhw.zmn.nps;
import com.bytedance.sdk.component.hhw.zmn.zmn.zmn.zmn.hhw;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes6.dex */
public class fb extends SQLiteOpenHelper {
    final Context zmn;

    public fb(Context context) {
        super(context, "ttadlog.db", (SQLiteDatabase.CursorFactory) null, 1);
        this.zmn = context;
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onCreate(SQLiteDatabase sQLiteDatabase) {
        try {
            zmn(sQLiteDatabase);
        } catch (Throwable unused) {
        }
    }

    private void zmn(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL(com.bytedance.sdk.component.hhw.zmn.zmn.zmn.zmn.zmn.fs(nps.hhw().zn().fs()));
        sQLiteDatabase.execSQL(com.bytedance.sdk.component.hhw.zmn.zmn.zmn.zmn.fb.zn(nps.hhw().zn().zmn()));
        sQLiteDatabase.execSQL(com.bytedance.sdk.component.hhw.zmn.zmn.zmn.zmn.nps.zn(nps.hhw().zn().fb()));
        sQLiteDatabase.execSQL(hhw.zmn(nps.hhw().zn().btk()));
        sQLiteDatabase.execSQL(com.bytedance.sdk.component.hhw.zmn.hhw.hhw.fs());
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        try {
            if (i > i2) {
                fs(sQLiteDatabase);
                zmn(sQLiteDatabase);
            } else {
                zmn(sQLiteDatabase);
            }
        } catch (Throwable unused) {
        }
    }

    private void fs(SQLiteDatabase sQLiteDatabase) {
        ArrayList<String> zn = zn(sQLiteDatabase);
        if (zn == null || zn.size() <= 0) {
            return;
        }
        Iterator<String> it = zn.iterator();
        while (it.hasNext()) {
            sQLiteDatabase.execSQL(String.format("DROP TABLE IF EXISTS %s ;", it.next()));
        }
    }

    private ArrayList<String> zn(SQLiteDatabase sQLiteDatabase) {
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
        } catch (Exception unused) {
        }
        return arrayList;
    }
}
