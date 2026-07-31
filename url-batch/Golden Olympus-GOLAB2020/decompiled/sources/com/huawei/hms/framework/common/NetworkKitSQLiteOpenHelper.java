package com.huawei.hms.framework.common;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import java.io.File;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes.dex */
public class NetworkKitSQLiteOpenHelper extends SQLiteOpenHelper {
    public static final int DB_VERSION = 1;

    /* renamed from: c, reason: collision with root package name */
    private static String f14143c = "networkkit.db";

    /* renamed from: d, reason: collision with root package name */
    private static volatile NetworkKitSQLiteOpenHelper f14144d;

    /* renamed from: b, reason: collision with root package name */
    private ConcurrentHashMap f14145b;

    static {
        if (ContextHolder.getKitContext() != null) {
            f14143c = "networkkit_dynamic.db";
        }
    }

    private NetworkKitSQLiteOpenHelper(Context context, String str, int i4) {
        super(context, str, (SQLiteDatabase.CursorFactory) null, i4);
        this.f14145b = new ConcurrentHashMap();
    }

    public static NetworkKitSQLiteOpenHelper getInstance() {
        if (f14144d == null) {
            synchronized (NetworkKitSQLiteOpenHelper.class) {
                try {
                    if (f14144d == null) {
                        f14144d = new NetworkKitSQLiteOpenHelper(ContextHolder.getAppContext().createDeviceProtectedStorageContext(), f14143c, 1);
                    }
                } finally {
                }
            }
        }
        return f14144d;
    }

    public void deleteDbByName(String str) {
        Logger.d("PLSQLiteOpenHelper", "close old db from oldDbMaps, dbname = " + str);
        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) this.f14145b.get(str);
        if (sQLiteDatabase != null) {
            sQLiteDatabase.close();
            this.f14145b.remove(str);
        }
    }

    public boolean deleteDbFile() {
        return deleteDbFileByPath(getNetworkKitReadableDatabase().getPath());
    }

    public boolean deleteDbFileByPath(String str) {
        File file = new File(str);
        if (file.exists()) {
            return file.delete();
        }
        Logger.i("PLSQLiteOpenHelper", "db is not exists");
        return false;
    }

    public boolean deleteUnusedDbFile() {
        return deleteDbFileByPath(getNetworkKitReadableDatabase().getPath().replace(f14143c, f14143c.equals("networkkit_dynamic.db") ? "networkkit.db" : "networkkit_dynamic.db"));
    }

    public SQLiteDatabase getDbByName(String str) {
        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) this.f14145b.get(str);
        if (sQLiteDatabase != null) {
            Logger.d("PLSQLiteOpenHelper", "get old db from oldDbMaps, dbname = " + str);
            return sQLiteDatabase;
        }
        SQLiteDatabase networkKitReadableDatabase = getNetworkKitReadableDatabase();
        if (networkKitReadableDatabase != null) {
            String replace = networkKitReadableDatabase.getPath().replace(f14143c, str);
            if (new File(replace).exists()) {
                SQLiteDatabase openDatabase = SQLiteDatabase.openDatabase(replace, null, 0);
                this.f14145b.put(str, openDatabase);
                Logger.d("PLSQLiteOpenHelper", "create and put old db to oldDbMaps, dbname = " + str);
                return openDatabase;
            }
            Logger.i("PLSQLiteOpenHelper", "old db is not exists");
        }
        return networkKitReadableDatabase;
    }

    public String getDbName() {
        return f14143c;
    }

    public String getDbNameSuffix() {
        return "-journal";
    }

    public SQLiteDatabase getNetworkKitReadableDatabase() {
        SQLiteDatabase sQLiteDatabase;
        try {
            sQLiteDatabase = getReadableDatabase();
        } catch (Throwable th) {
            Logger.e("PLSQLiteOpenHelper", "getReadableDatabase db error:" + th.getMessage());
            sQLiteDatabase = null;
        }
        if (sQLiteDatabase == null) {
            Logger.e("PLSQLiteOpenHelper", "getReadableDatabase db is null");
        }
        return sQLiteDatabase;
    }

    public SQLiteDatabase getNetworkKitWritableDatabase() {
        SQLiteDatabase sQLiteDatabase;
        try {
            sQLiteDatabase = getWritableDatabase();
        } catch (Throwable th) {
            Logger.e("PLSQLiteOpenHelper", "getWritableDatabase db error:" + th.getMessage());
            sQLiteDatabase = null;
        }
        if (sQLiteDatabase == null) {
            Logger.e("PLSQLiteOpenHelper", "getWritableDatabase db is null");
        }
        return sQLiteDatabase;
    }

    public SQLiteDatabase getNetworkkitUnusedDbDB() {
        return getDbByName(f14143c.equals("networkkit_dynamic.db") ? "networkkit.db" : "networkkit_dynamic.db");
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onCreate(SQLiteDatabase sQLiteDatabase) {
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onDowngrade(SQLiteDatabase sQLiteDatabase, int i4, int i5) {
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i4, int i5) {
    }
}
