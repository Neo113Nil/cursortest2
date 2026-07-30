package com.moyoung.classes.db;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.util.Log;
import org.greenrobot.greendao.database.g;
import org.greenrobot.greendao.identityscope.IdentityScopeType;

/* loaded from: classes4.dex */
public class e extends org.greenrobot.greendao.b {
    public static final int SCHEMA_VERSION = 2;

    public static class a extends b {
        public a(Context context, String str) {
            super(context, str);
        }

        @Override // org.greenrobot.greendao.database.b
        public void onUpgrade(org.greenrobot.greendao.database.a aVar, int i8, int i9) {
            Log.i("greenDAO", "Upgrading schema from version " + i8 + " to " + i9 + " by dropping all tables");
            e.dropAllTables(aVar, true);
            onCreate(aVar);
        }

        public a(Context context, String str, SQLiteDatabase.CursorFactory cursorFactory) {
            super(context, str, cursorFactory);
        }
    }

    public static abstract class b extends org.greenrobot.greendao.database.b {
        public b(Context context, String str) {
            super(context, str, 2);
        }

        @Override // org.greenrobot.greendao.database.b
        public void onCreate(org.greenrobot.greendao.database.a aVar) {
            Log.i("greenDAO", "Creating tables for schema version 2");
            e.createAllTables(aVar, false);
        }

        public b(Context context, String str, SQLiteDatabase.CursorFactory cursorFactory) {
            super(context, str, cursorFactory, 2);
        }
    }

    public e(SQLiteDatabase sQLiteDatabase) {
        this(new g(sQLiteDatabase));
    }

    public static void createAllTables(org.greenrobot.greendao.database.a aVar, boolean z7) {
        ClassesHistoryDao.createTable(aVar, z7);
    }

    public static void dropAllTables(org.greenrobot.greendao.database.a aVar, boolean z7) {
        ClassesHistoryDao.dropTable(aVar, z7);
    }

    public static f newDevSession(Context context, String str) {
        return new e(new a(context, str).getWritableDb()).newSession();
    }

    public e(org.greenrobot.greendao.database.a aVar) {
        super(aVar, 2);
        registerDaoClass(ClassesHistoryDao.class);
    }

    @Override // org.greenrobot.greendao.b
    public f newSession() {
        return new f(this.db, IdentityScopeType.Session, this.daoConfigMap);
    }

    @Override // org.greenrobot.greendao.b
    public f newSession(IdentityScopeType identityScopeType) {
        return new f(this.db, identityScopeType, this.daoConfigMap);
    }
}
