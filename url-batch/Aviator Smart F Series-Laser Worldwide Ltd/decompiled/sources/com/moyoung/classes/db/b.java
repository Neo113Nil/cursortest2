package com.moyoung.classes.db;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import com.moyoung.classes.db.e;
import y4.a;

/* loaded from: classes4.dex */
public class b extends e.b {

    class a implements a.InterfaceC0408a {
        a() {
        }

        @Override // y4.a.InterfaceC0408a
        public void onCreateAllTables(org.greenrobot.greendao.database.a aVar, boolean z7) {
            e.createAllTables(aVar, z7);
        }

        @Override // y4.a.InterfaceC0408a
        public void onDropAllTables(org.greenrobot.greendao.database.a aVar, boolean z7) {
            e.dropAllTables(aVar, z7);
        }
    }

    public b(Context context, String str) {
        super(context, str);
    }

    @Override // org.greenrobot.greendao.database.b, android.database.sqlite.SQLiteOpenHelper
    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i8, int i9) {
        com.orhanobut.logger.f.e("db onUpgrade: " + i8 + "--->" + i9, new Object[0]);
        super.onUpgrade(sQLiteDatabase, i8, i9);
        y4.a.migrate(sQLiteDatabase, new a(), (Class<? extends org.greenrobot.greendao.a>[]) new Class[]{ClassesHistoryDao.class});
    }
}
