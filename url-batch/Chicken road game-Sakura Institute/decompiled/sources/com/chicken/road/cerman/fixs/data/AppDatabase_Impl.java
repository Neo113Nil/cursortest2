package com.chicken.road.cerman.fixs.data;

import androidx.autofill.HintConstants;
import androidx.core.app.NotificationCompat;
import androidx.room.DatabaseConfiguration;
import androidx.room.InvalidationTracker;
import androidx.room.RoomDatabase;
import androidx.room.RoomMasterTable;
import androidx.room.RoomOpenHelper;
import androidx.room.migration.AutoMigrationSpec;
import androidx.room.migration.Migration;
import androidx.room.util.DBUtil;
import androidx.room.util.TableInfo;
import androidx.sqlite.db.SupportSQLiteDatabase;
import androidx.sqlite.db.SupportSQLiteOpenHelper;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* loaded from: classes3.dex */
public final class AppDatabase_Impl extends AppDatabase {
    private volatile ChickenDao _chickenDao;
    private volatile EggDao _eggDao;
    private volatile FeedDao _feedDao;
    private volatile SaleDao _saleDao;
    private volatile VaccinationDao _vaccinationDao;
    private volatile WeightDao _weightDao;

    @Override // androidx.room.RoomDatabase
    protected SupportSQLiteOpenHelper createOpenHelper(final DatabaseConfiguration config) {
        return config.sqliteOpenHelperFactory.create(SupportSQLiteOpenHelper.Configuration.builder(config.context).name(config.name).callback(new RoomOpenHelper(config, new RoomOpenHelper.Delegate(2) { // from class: com.chicken.road.cerman.fixs.data.AppDatabase_Impl.1
            @Override // androidx.room.RoomOpenHelper.Delegate
            public void onPostMigrate(final SupportSQLiteDatabase db) {
            }

            @Override // androidx.room.RoomOpenHelper.Delegate
            public void createAllTables(final SupportSQLiteDatabase db) {
                db.execSQL("CREATE TABLE IF NOT EXISTS `chickens` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `name` TEXT NOT NULL, `breed` TEXT NOT NULL, `type` TEXT NOT NULL, `status` TEXT NOT NULL, `acquiredDate` INTEGER NOT NULL, `acquiredCost` REAL NOT NULL, `notes` TEXT NOT NULL)");
                db.execSQL("CREATE TABLE IF NOT EXISTS `feed_entries` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `chickenId` INTEGER, `date` INTEGER NOT NULL, `feedType` TEXT NOT NULL, `quantityKg` REAL NOT NULL, `pricePerKg` REAL NOT NULL)");
                db.execSQL("CREATE TABLE IF NOT EXISTS `egg_logs` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `chickenId` INTEGER, `date` INTEGER NOT NULL, `count` INTEGER NOT NULL)");
                db.execSQL("CREATE TABLE IF NOT EXISTS `sales` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `chickenId` INTEGER, `date` INTEGER NOT NULL, `saleType` TEXT NOT NULL, `quantity` INTEGER NOT NULL, `unitPrice` REAL NOT NULL, `buyer` TEXT NOT NULL)");
                db.execSQL("CREATE TABLE IF NOT EXISTS `weight_entries` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `chickenId` INTEGER NOT NULL, `date` INTEGER NOT NULL, `weightGrams` INTEGER NOT NULL)");
                db.execSQL("CREATE TABLE IF NOT EXISTS `vaccinations` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `chickenId` INTEGER, `date` INTEGER NOT NULL, `name` TEXT NOT NULL, `notes` TEXT NOT NULL, `dueDate` INTEGER, `done` INTEGER NOT NULL)");
                db.execSQL(RoomMasterTable.CREATE_QUERY);
                db.execSQL("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, 'a768e5344789b7bbf50e9db9d257b387')");
            }

            @Override // androidx.room.RoomOpenHelper.Delegate
            public void dropAllTables(final SupportSQLiteDatabase db) {
                db.execSQL("DROP TABLE IF EXISTS `chickens`");
                db.execSQL("DROP TABLE IF EXISTS `feed_entries`");
                db.execSQL("DROP TABLE IF EXISTS `egg_logs`");
                db.execSQL("DROP TABLE IF EXISTS `sales`");
                db.execSQL("DROP TABLE IF EXISTS `weight_entries`");
                db.execSQL("DROP TABLE IF EXISTS `vaccinations`");
                List list = AppDatabase_Impl.this.mCallbacks;
                if (list != null) {
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        ((RoomDatabase.Callback) it.next()).onDestructiveMigration(db);
                    }
                }
            }

            @Override // androidx.room.RoomOpenHelper.Delegate
            public void onCreate(final SupportSQLiteDatabase db) {
                List list = AppDatabase_Impl.this.mCallbacks;
                if (list != null) {
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        ((RoomDatabase.Callback) it.next()).onCreate(db);
                    }
                }
            }

            @Override // androidx.room.RoomOpenHelper.Delegate
            public void onOpen(final SupportSQLiteDatabase db) {
                AppDatabase_Impl.this.mDatabase = db;
                AppDatabase_Impl.this.internalInitInvalidationTracker(db);
                List list = AppDatabase_Impl.this.mCallbacks;
                if (list != null) {
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        ((RoomDatabase.Callback) it.next()).onOpen(db);
                    }
                }
            }

            @Override // androidx.room.RoomOpenHelper.Delegate
            public void onPreMigrate(final SupportSQLiteDatabase db) {
                DBUtil.dropFtsSyncTriggers(db);
            }

            @Override // androidx.room.RoomOpenHelper.Delegate
            public RoomOpenHelper.ValidationResult onValidateSchema(final SupportSQLiteDatabase db) {
                HashMap hashMap = new HashMap(8);
                hashMap.put("id", new TableInfo.Column("id", "INTEGER", true, 1, null, 1));
                hashMap.put(HintConstants.AUTOFILL_HINT_NAME, new TableInfo.Column(HintConstants.AUTOFILL_HINT_NAME, "TEXT", true, 0, null, 1));
                hashMap.put("breed", new TableInfo.Column("breed", "TEXT", true, 0, null, 1));
                hashMap.put("type", new TableInfo.Column("type", "TEXT", true, 0, null, 1));
                hashMap.put(NotificationCompat.CATEGORY_STATUS, new TableInfo.Column(NotificationCompat.CATEGORY_STATUS, "TEXT", true, 0, null, 1));
                hashMap.put("acquiredDate", new TableInfo.Column("acquiredDate", "INTEGER", true, 0, null, 1));
                hashMap.put("acquiredCost", new TableInfo.Column("acquiredCost", "REAL", true, 0, null, 1));
                hashMap.put("notes", new TableInfo.Column("notes", "TEXT", true, 0, null, 1));
                TableInfo tableInfo = new TableInfo("chickens", hashMap, new HashSet(0), new HashSet(0));
                TableInfo read = TableInfo.read(db, "chickens");
                if (!tableInfo.equals(read)) {
                    return new RoomOpenHelper.ValidationResult(false, "chickens(com.chicken.road.cerman.fixs.data.Chicken).\n Expected:\n" + tableInfo + "\n Found:\n" + read);
                }
                HashMap hashMap2 = new HashMap(6);
                hashMap2.put("id", new TableInfo.Column("id", "INTEGER", true, 1, null, 1));
                hashMap2.put("chickenId", new TableInfo.Column("chickenId", "INTEGER", false, 0, null, 1));
                hashMap2.put("date", new TableInfo.Column("date", "INTEGER", true, 0, null, 1));
                hashMap2.put("feedType", new TableInfo.Column("feedType", "TEXT", true, 0, null, 1));
                hashMap2.put("quantityKg", new TableInfo.Column("quantityKg", "REAL", true, 0, null, 1));
                hashMap2.put("pricePerKg", new TableInfo.Column("pricePerKg", "REAL", true, 0, null, 1));
                TableInfo tableInfo2 = new TableInfo("feed_entries", hashMap2, new HashSet(0), new HashSet(0));
                TableInfo read2 = TableInfo.read(db, "feed_entries");
                if (!tableInfo2.equals(read2)) {
                    return new RoomOpenHelper.ValidationResult(false, "feed_entries(com.chicken.road.cerman.fixs.data.FeedEntry).\n Expected:\n" + tableInfo2 + "\n Found:\n" + read2);
                }
                HashMap hashMap3 = new HashMap(4);
                hashMap3.put("id", new TableInfo.Column("id", "INTEGER", true, 1, null, 1));
                hashMap3.put("chickenId", new TableInfo.Column("chickenId", "INTEGER", false, 0, null, 1));
                hashMap3.put("date", new TableInfo.Column("date", "INTEGER", true, 0, null, 1));
                hashMap3.put("count", new TableInfo.Column("count", "INTEGER", true, 0, null, 1));
                TableInfo tableInfo3 = new TableInfo("egg_logs", hashMap3, new HashSet(0), new HashSet(0));
                TableInfo read3 = TableInfo.read(db, "egg_logs");
                if (!tableInfo3.equals(read3)) {
                    return new RoomOpenHelper.ValidationResult(false, "egg_logs(com.chicken.road.cerman.fixs.data.EggLog).\n Expected:\n" + tableInfo3 + "\n Found:\n" + read3);
                }
                HashMap hashMap4 = new HashMap(7);
                hashMap4.put("id", new TableInfo.Column("id", "INTEGER", true, 1, null, 1));
                hashMap4.put("chickenId", new TableInfo.Column("chickenId", "INTEGER", false, 0, null, 1));
                hashMap4.put("date", new TableInfo.Column("date", "INTEGER", true, 0, null, 1));
                hashMap4.put("saleType", new TableInfo.Column("saleType", "TEXT", true, 0, null, 1));
                hashMap4.put("quantity", new TableInfo.Column("quantity", "INTEGER", true, 0, null, 1));
                hashMap4.put("unitPrice", new TableInfo.Column("unitPrice", "REAL", true, 0, null, 1));
                hashMap4.put("buyer", new TableInfo.Column("buyer", "TEXT", true, 0, null, 1));
                TableInfo tableInfo4 = new TableInfo("sales", hashMap4, new HashSet(0), new HashSet(0));
                TableInfo read4 = TableInfo.read(db, "sales");
                if (!tableInfo4.equals(read4)) {
                    return new RoomOpenHelper.ValidationResult(false, "sales(com.chicken.road.cerman.fixs.data.Sale).\n Expected:\n" + tableInfo4 + "\n Found:\n" + read4);
                }
                HashMap hashMap5 = new HashMap(4);
                hashMap5.put("id", new TableInfo.Column("id", "INTEGER", true, 1, null, 1));
                hashMap5.put("chickenId", new TableInfo.Column("chickenId", "INTEGER", true, 0, null, 1));
                hashMap5.put("date", new TableInfo.Column("date", "INTEGER", true, 0, null, 1));
                hashMap5.put("weightGrams", new TableInfo.Column("weightGrams", "INTEGER", true, 0, null, 1));
                TableInfo tableInfo5 = new TableInfo("weight_entries", hashMap5, new HashSet(0), new HashSet(0));
                TableInfo read5 = TableInfo.read(db, "weight_entries");
                if (!tableInfo5.equals(read5)) {
                    return new RoomOpenHelper.ValidationResult(false, "weight_entries(com.chicken.road.cerman.fixs.data.WeightEntry).\n Expected:\n" + tableInfo5 + "\n Found:\n" + read5);
                }
                HashMap hashMap6 = new HashMap(7);
                hashMap6.put("id", new TableInfo.Column("id", "INTEGER", true, 1, null, 1));
                hashMap6.put("chickenId", new TableInfo.Column("chickenId", "INTEGER", false, 0, null, 1));
                hashMap6.put("date", new TableInfo.Column("date", "INTEGER", true, 0, null, 1));
                hashMap6.put(HintConstants.AUTOFILL_HINT_NAME, new TableInfo.Column(HintConstants.AUTOFILL_HINT_NAME, "TEXT", true, 0, null, 1));
                hashMap6.put("notes", new TableInfo.Column("notes", "TEXT", true, 0, null, 1));
                hashMap6.put("dueDate", new TableInfo.Column("dueDate", "INTEGER", false, 0, null, 1));
                hashMap6.put("done", new TableInfo.Column("done", "INTEGER", true, 0, null, 1));
                TableInfo tableInfo6 = new TableInfo("vaccinations", hashMap6, new HashSet(0), new HashSet(0));
                TableInfo read6 = TableInfo.read(db, "vaccinations");
                if (!tableInfo6.equals(read6)) {
                    return new RoomOpenHelper.ValidationResult(false, "vaccinations(com.chicken.road.cerman.fixs.data.Vaccination).\n Expected:\n" + tableInfo6 + "\n Found:\n" + read6);
                }
                return new RoomOpenHelper.ValidationResult(true, null);
            }
        }, "a768e5344789b7bbf50e9db9d257b387", "3a62d6efcb6f1b1b604f66767cded477")).build());
    }

    @Override // androidx.room.RoomDatabase
    protected InvalidationTracker createInvalidationTracker() {
        return new InvalidationTracker(this, new HashMap(0), new HashMap(0), "chickens", "feed_entries", "egg_logs", "sales", "weight_entries", "vaccinations");
    }

    @Override // androidx.room.RoomDatabase
    public void clearAllTables() {
        super.assertNotMainThread();
        SupportSQLiteDatabase writableDatabase = super.getOpenHelper().getWritableDatabase();
        try {
            super.beginTransaction();
            writableDatabase.execSQL("DELETE FROM `chickens`");
            writableDatabase.execSQL("DELETE FROM `feed_entries`");
            writableDatabase.execSQL("DELETE FROM `egg_logs`");
            writableDatabase.execSQL("DELETE FROM `sales`");
            writableDatabase.execSQL("DELETE FROM `weight_entries`");
            writableDatabase.execSQL("DELETE FROM `vaccinations`");
            super.setTransactionSuccessful();
        } finally {
            super.endTransaction();
            writableDatabase.query("PRAGMA wal_checkpoint(FULL)").close();
            if (!writableDatabase.inTransaction()) {
                writableDatabase.execSQL("VACUUM");
            }
        }
    }

    @Override // androidx.room.RoomDatabase
    protected Map<Class<?>, List<Class<?>>> getRequiredTypeConverters() {
        HashMap hashMap = new HashMap();
        hashMap.put(ChickenDao.class, ChickenDao_Impl.getRequiredConverters());
        hashMap.put(FeedDao.class, FeedDao_Impl.getRequiredConverters());
        hashMap.put(EggDao.class, EggDao_Impl.getRequiredConverters());
        hashMap.put(SaleDao.class, SaleDao_Impl.getRequiredConverters());
        hashMap.put(WeightDao.class, WeightDao_Impl.getRequiredConverters());
        hashMap.put(VaccinationDao.class, VaccinationDao_Impl.getRequiredConverters());
        return hashMap;
    }

    @Override // androidx.room.RoomDatabase
    public Set<Class<? extends AutoMigrationSpec>> getRequiredAutoMigrationSpecs() {
        return new HashSet();
    }

    @Override // androidx.room.RoomDatabase
    public List<Migration> getAutoMigrations(final Map<Class<? extends AutoMigrationSpec>, AutoMigrationSpec> autoMigrationSpecs) {
        return new ArrayList();
    }

    @Override // com.chicken.road.cerman.fixs.data.AppDatabase
    public ChickenDao chickenDao() {
        ChickenDao chickenDao;
        if (this._chickenDao != null) {
            return this._chickenDao;
        }
        synchronized (this) {
            if (this._chickenDao == null) {
                this._chickenDao = new ChickenDao_Impl(this);
            }
            chickenDao = this._chickenDao;
        }
        return chickenDao;
    }

    @Override // com.chicken.road.cerman.fixs.data.AppDatabase
    public FeedDao feedDao() {
        FeedDao feedDao;
        if (this._feedDao != null) {
            return this._feedDao;
        }
        synchronized (this) {
            if (this._feedDao == null) {
                this._feedDao = new FeedDao_Impl(this);
            }
            feedDao = this._feedDao;
        }
        return feedDao;
    }

    @Override // com.chicken.road.cerman.fixs.data.AppDatabase
    public EggDao eggDao() {
        EggDao eggDao;
        if (this._eggDao != null) {
            return this._eggDao;
        }
        synchronized (this) {
            if (this._eggDao == null) {
                this._eggDao = new EggDao_Impl(this);
            }
            eggDao = this._eggDao;
        }
        return eggDao;
    }

    @Override // com.chicken.road.cerman.fixs.data.AppDatabase
    public SaleDao saleDao() {
        SaleDao saleDao;
        if (this._saleDao != null) {
            return this._saleDao;
        }
        synchronized (this) {
            if (this._saleDao == null) {
                this._saleDao = new SaleDao_Impl(this);
            }
            saleDao = this._saleDao;
        }
        return saleDao;
    }

    @Override // com.chicken.road.cerman.fixs.data.AppDatabase
    public WeightDao weightDao() {
        WeightDao weightDao;
        if (this._weightDao != null) {
            return this._weightDao;
        }
        synchronized (this) {
            if (this._weightDao == null) {
                this._weightDao = new WeightDao_Impl(this);
            }
            weightDao = this._weightDao;
        }
        return weightDao;
    }

    @Override // com.chicken.road.cerman.fixs.data.AppDatabase
    public VaccinationDao vaccinationDao() {
        VaccinationDao vaccinationDao;
        if (this._vaccinationDao != null) {
            return this._vaccinationDao;
        }
        synchronized (this) {
            if (this._vaccinationDao == null) {
                this._vaccinationDao = new VaccinationDao_Impl(this);
            }
            vaccinationDao = this._vaccinationDao;
        }
        return vaccinationDao;
    }
}
