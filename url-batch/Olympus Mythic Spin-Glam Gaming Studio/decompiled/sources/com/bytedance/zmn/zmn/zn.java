package com.bytedance.zmn.zmn;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import com.bytedance.zmn.zn;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes11.dex */
public class zn extends SQLiteOpenHelper {
    private final ConcurrentHashMap<Class<? extends com.bytedance.zmn.zmn>, nps<? extends com.bytedance.zmn.zmn>> fs;
    private final Context zmn;

    public zn(Context context, fs fsVar, zn.btk btkVar) {
        super(context, zmn("events_" + btkVar.zn()), (SQLiteDatabase.CursorFactory) null, 1);
        this.zmn = context;
        this.fs = fsVar.fs();
        setWriteAheadLoggingEnabled(btkVar.hhw());
    }

    private static String zmn(String str) {
        return str + "_" + com.bytedance.zmn.zmn.fs.zn.zmn();
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onCreate(SQLiteDatabase sQLiteDatabase) {
        zmn(sQLiteDatabase);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onConfigure(SQLiteDatabase sQLiteDatabase) {
        super.onConfigure(sQLiteDatabase);
        try {
            if (sQLiteDatabase.isWriteAheadLoggingEnabled()) {
                sQLiteDatabase.execSQL("PRAGMA synchronous = NORMAL;");
            }
        } catch (Exception unused) {
        }
    }

    private void zmn(SQLiteDatabase sQLiteDatabase) {
        for (nps<? extends com.bytedance.zmn.zmn> npsVar : this.fs.values()) {
            try {
                sQLiteDatabase.execSQL(npsVar.nps());
                String zg = npsVar.zg();
                String str = "CREATE INDEX IF NOT EXISTS idx_" + zg + "_data_id ON " + zg + " (data_id);";
                String str2 = "CREATE INDEX IF NOT EXISTS idx_" + zg + "_create_time ON " + zg + " (create_time);";
                sQLiteDatabase.execSQL(str);
                sQLiteDatabase.execSQL(str2);
                sQLiteDatabase.execSQL("CREATE INDEX IF NOT EXISTS idx_" + zg + "_priority ON " + zg + " (priority);");
            } catch (Exception unused) {
            }
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        if (i > i2) {
            fs(sQLiteDatabase);
        }
        zmn(sQLiteDatabase);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        if (i > i2) {
            fs(sQLiteDatabase);
            zmn(sQLiteDatabase);
        }
    }

    private void fs(SQLiteDatabase sQLiteDatabase) {
        Iterator<nps<? extends com.bytedance.zmn.zmn>> it = this.fs.values().iterator();
        while (it.hasNext()) {
            try {
                sQLiteDatabase.execSQL("DROP TABLE IF EXISTS ".concat(String.valueOf(it.next().zg())));
            } catch (Exception unused) {
            }
        }
    }
}
