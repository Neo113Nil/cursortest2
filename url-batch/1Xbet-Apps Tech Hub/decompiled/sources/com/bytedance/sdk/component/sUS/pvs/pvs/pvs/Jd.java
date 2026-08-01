package com.bytedance.sdk.component.sUS.pvs.pvs.pvs;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import com.bytedance.sdk.component.sUS.pvs.so;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: DatabaseHelper.java */
/* loaded from: classes.dex */
public class Jd extends SQLiteOpenHelper {
    final Context pvs;

    public Jd(Context context) {
        super(context, "ttadlog.db", (SQLiteDatabase.CursorFactory) null, 1);
        this.pvs = context;
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onCreate(SQLiteDatabase sQLiteDatabase) {
        try {
            pvs(sQLiteDatabase);
        } catch (Throwable unused) {
        }
    }

    private void pvs(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL(com.bytedance.sdk.component.sUS.pvs.pvs.pvs.pvs.pvs.icD(so.yiw().Jd().icD()));
        sQLiteDatabase.execSQL(com.bytedance.sdk.component.sUS.pvs.pvs.pvs.pvs.Jd.vG(so.yiw().Jd().pvs()));
        sQLiteDatabase.execSQL(com.bytedance.sdk.component.sUS.pvs.pvs.pvs.pvs.yiw.vG(so.yiw().Jd().Jd()));
        sQLiteDatabase.execSQL(com.bytedance.sdk.component.sUS.pvs.pvs.pvs.pvs.sUS.pvs(so.yiw().Jd().NB()));
        sQLiteDatabase.execSQL(com.bytedance.sdk.component.sUS.pvs.sUS.sUS.icD());
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        try {
            if (i > i2) {
                icD(sQLiteDatabase);
                pvs(sQLiteDatabase);
            } else {
                pvs(sQLiteDatabase);
            }
        } catch (Throwable unused) {
        }
    }

    private void icD(SQLiteDatabase sQLiteDatabase) {
        ArrayList<String> vG = vG(sQLiteDatabase);
        if (vG == null || vG.size() <= 0) {
            return;
        }
        Iterator<String> it = vG.iterator();
        while (it.hasNext()) {
            sQLiteDatabase.execSQL(String.format("DROP TABLE IF EXISTS %s ;", it.next()));
        }
    }

    private ArrayList<String> vG(SQLiteDatabase sQLiteDatabase) {
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
