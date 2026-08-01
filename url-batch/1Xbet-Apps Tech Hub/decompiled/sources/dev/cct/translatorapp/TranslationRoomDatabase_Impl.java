package dev.cct.translatorapp;

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
import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import dev.cct.translatorapp.dao.TranslationDao;
import dev.cct.translatorapp.dao.TranslationDao_Impl;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.jacoco.core.runtime.AgentOptions;

/* loaded from: classes3.dex */
public final class TranslationRoomDatabase_Impl extends TranslationRoomDatabase {
    private volatile TranslationDao _translationDao;

    @Override // androidx.room.RoomDatabase
    protected SupportSQLiteOpenHelper createOpenHelper(DatabaseConfiguration configuration) {
        return configuration.sqliteOpenHelperFactory.create(SupportSQLiteOpenHelper.Configuration.builder(configuration.context).name(configuration.name).callback(new RoomOpenHelper(configuration, new RoomOpenHelper.Delegate(3) { // from class: dev.cct.translatorapp.TranslationRoomDatabase_Impl.1
            @Override // androidx.room.RoomOpenHelper.Delegate
            public void onPostMigrate(SupportSQLiteDatabase _db) {
            }

            @Override // androidx.room.RoomOpenHelper.Delegate
            public void createAllTables(SupportSQLiteDatabase _db) {
                _db.execSQL("CREATE TABLE IF NOT EXISTS `history` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `iLangC` TEXT NOT NULL, `oLangC` TEXT NOT NULL, `input` TEXT NOT NULL, `output` TEXT NOT NULL, `isFavorite` INTEGER NOT NULL, `isSelected` INTEGER NOT NULL)");
                _db.execSQL("CREATE TABLE IF NOT EXISTS `favorite` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `iLangC` TEXT NOT NULL, `oLangC` TEXT NOT NULL, `input` TEXT NOT NULL, `output` TEXT NOT NULL, `isFavorite` INTEGER NOT NULL, `isSelected` INTEGER NOT NULL)");
                _db.execSQL("CREATE TABLE IF NOT EXISTS `conversation` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `input` TEXT NOT NULL, `output` TEXT NOT NULL, `inputLang` TEXT NOT NULL, `outputLang` TEXT NOT NULL, `itemType` TEXT, `iLangC` TEXT, `oLangC` TEXT, `isFavorite` INTEGER NOT NULL, `isSelected` INTEGER NOT NULL)");
                _db.execSQL(RoomMasterTable.CREATE_QUERY);
                _db.execSQL("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, 'dc3d7bbb96e37dda13a2bf6fbac06dcd')");
            }

            @Override // androidx.room.RoomOpenHelper.Delegate
            public void dropAllTables(SupportSQLiteDatabase _db) {
                _db.execSQL("DROP TABLE IF EXISTS `history`");
                _db.execSQL("DROP TABLE IF EXISTS `favorite`");
                _db.execSQL("DROP TABLE IF EXISTS `conversation`");
                if (TranslationRoomDatabase_Impl.this.mCallbacks != null) {
                    int size = TranslationRoomDatabase_Impl.this.mCallbacks.size();
                    for (int i = 0; i < size; i++) {
                        ((RoomDatabase.Callback) TranslationRoomDatabase_Impl.this.mCallbacks.get(i)).onDestructiveMigration(_db);
                    }
                }
            }

            @Override // androidx.room.RoomOpenHelper.Delegate
            public void onCreate(SupportSQLiteDatabase _db) {
                if (TranslationRoomDatabase_Impl.this.mCallbacks != null) {
                    int size = TranslationRoomDatabase_Impl.this.mCallbacks.size();
                    for (int i = 0; i < size; i++) {
                        ((RoomDatabase.Callback) TranslationRoomDatabase_Impl.this.mCallbacks.get(i)).onCreate(_db);
                    }
                }
            }

            @Override // androidx.room.RoomOpenHelper.Delegate
            public void onOpen(SupportSQLiteDatabase _db) {
                TranslationRoomDatabase_Impl.this.mDatabase = _db;
                TranslationRoomDatabase_Impl.this.internalInitInvalidationTracker(_db);
                if (TranslationRoomDatabase_Impl.this.mCallbacks != null) {
                    int size = TranslationRoomDatabase_Impl.this.mCallbacks.size();
                    for (int i = 0; i < size; i++) {
                        ((RoomDatabase.Callback) TranslationRoomDatabase_Impl.this.mCallbacks.get(i)).onOpen(_db);
                    }
                }
            }

            @Override // androidx.room.RoomOpenHelper.Delegate
            public void onPreMigrate(SupportSQLiteDatabase _db) {
                DBUtil.dropFtsSyncTriggers(_db);
            }

            @Override // androidx.room.RoomOpenHelper.Delegate
            public RoomOpenHelper.ValidationResult onValidateSchema(SupportSQLiteDatabase _db) {
                HashMap hashMap = new HashMap(7);
                hashMap.put(FacebookMediationAdapter.KEY_ID, new TableInfo.Column(FacebookMediationAdapter.KEY_ID, "INTEGER", true, 1, null, 1));
                hashMap.put("iLangC", new TableInfo.Column("iLangC", "TEXT", true, 0, null, 1));
                hashMap.put("oLangC", new TableInfo.Column("oLangC", "TEXT", true, 0, null, 1));
                hashMap.put("input", new TableInfo.Column("input", "TEXT", true, 0, null, 1));
                hashMap.put(AgentOptions.OUTPUT, new TableInfo.Column(AgentOptions.OUTPUT, "TEXT", true, 0, null, 1));
                hashMap.put("isFavorite", new TableInfo.Column("isFavorite", "INTEGER", true, 0, null, 1));
                hashMap.put("isSelected", new TableInfo.Column("isSelected", "INTEGER", true, 0, null, 1));
                TableInfo tableInfo = new TableInfo("history", hashMap, new HashSet(0), new HashSet(0));
                TableInfo read = TableInfo.read(_db, "history");
                if (!tableInfo.equals(read)) {
                    return new RoomOpenHelper.ValidationResult(false, "history(dev.cct.translatorapp.dataModel.HistoryModel).\n Expected:\n" + tableInfo + "\n Found:\n" + read);
                }
                HashMap hashMap2 = new HashMap(7);
                hashMap2.put(FacebookMediationAdapter.KEY_ID, new TableInfo.Column(FacebookMediationAdapter.KEY_ID, "INTEGER", true, 1, null, 1));
                hashMap2.put("iLangC", new TableInfo.Column("iLangC", "TEXT", true, 0, null, 1));
                hashMap2.put("oLangC", new TableInfo.Column("oLangC", "TEXT", true, 0, null, 1));
                hashMap2.put("input", new TableInfo.Column("input", "TEXT", true, 0, null, 1));
                hashMap2.put(AgentOptions.OUTPUT, new TableInfo.Column(AgentOptions.OUTPUT, "TEXT", true, 0, null, 1));
                hashMap2.put("isFavorite", new TableInfo.Column("isFavorite", "INTEGER", true, 0, null, 1));
                hashMap2.put("isSelected", new TableInfo.Column("isSelected", "INTEGER", true, 0, null, 1));
                TableInfo tableInfo2 = new TableInfo("favorite", hashMap2, new HashSet(0), new HashSet(0));
                TableInfo read2 = TableInfo.read(_db, "favorite");
                if (!tableInfo2.equals(read2)) {
                    return new RoomOpenHelper.ValidationResult(false, "favorite(dev.cct.translatorapp.dataModel.FavoriteModel).\n Expected:\n" + tableInfo2 + "\n Found:\n" + read2);
                }
                HashMap hashMap3 = new HashMap(10);
                hashMap3.put(FacebookMediationAdapter.KEY_ID, new TableInfo.Column(FacebookMediationAdapter.KEY_ID, "INTEGER", true, 1, null, 1));
                hashMap3.put("input", new TableInfo.Column("input", "TEXT", true, 0, null, 1));
                hashMap3.put(AgentOptions.OUTPUT, new TableInfo.Column(AgentOptions.OUTPUT, "TEXT", true, 0, null, 1));
                hashMap3.put("inputLang", new TableInfo.Column("inputLang", "TEXT", true, 0, null, 1));
                hashMap3.put("outputLang", new TableInfo.Column("outputLang", "TEXT", true, 0, null, 1));
                hashMap3.put("itemType", new TableInfo.Column("itemType", "TEXT", false, 0, null, 1));
                hashMap3.put("iLangC", new TableInfo.Column("iLangC", "TEXT", false, 0, null, 1));
                hashMap3.put("oLangC", new TableInfo.Column("oLangC", "TEXT", false, 0, null, 1));
                hashMap3.put("isFavorite", new TableInfo.Column("isFavorite", "INTEGER", true, 0, null, 1));
                hashMap3.put("isSelected", new TableInfo.Column("isSelected", "INTEGER", true, 0, null, 1));
                TableInfo tableInfo3 = new TableInfo("conversation", hashMap3, new HashSet(0), new HashSet(0));
                TableInfo read3 = TableInfo.read(_db, "conversation");
                if (!tableInfo3.equals(read3)) {
                    return new RoomOpenHelper.ValidationResult(false, "conversation(dev.cct.translatorapp.dataModel.ConversationModel).\n Expected:\n" + tableInfo3 + "\n Found:\n" + read3);
                }
                return new RoomOpenHelper.ValidationResult(true, null);
            }
        }, "dc3d7bbb96e37dda13a2bf6fbac06dcd", "e2007aa660c60742002be4073f2122bb")).build());
    }

    @Override // androidx.room.RoomDatabase
    protected InvalidationTracker createInvalidationTracker() {
        return new InvalidationTracker(this, new HashMap(0), new HashMap(0), "history", "favorite", "conversation");
    }

    @Override // androidx.room.RoomDatabase
    public void clearAllTables() {
        super.assertNotMainThread();
        SupportSQLiteDatabase writableDatabase = super.getOpenHelper().getWritableDatabase();
        try {
            super.beginTransaction();
            writableDatabase.execSQL("DELETE FROM `history`");
            writableDatabase.execSQL("DELETE FROM `favorite`");
            writableDatabase.execSQL("DELETE FROM `conversation`");
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
        hashMap.put(TranslationDao.class, TranslationDao_Impl.getRequiredConverters());
        return hashMap;
    }

    @Override // androidx.room.RoomDatabase
    public Set<Class<? extends AutoMigrationSpec>> getRequiredAutoMigrationSpecs() {
        return new HashSet();
    }

    @Override // androidx.room.RoomDatabase
    public List<Migration> getAutoMigrations(Map<Class<? extends AutoMigrationSpec>, AutoMigrationSpec> autoMigrationSpecsMap) {
        return Arrays.asList(new Migration[0]);
    }

    @Override // dev.cct.translatorapp.TranslationRoomDatabase
    public TranslationDao translationDao() {
        TranslationDao translationDao;
        if (this._translationDao != null) {
            return this._translationDao;
        }
        synchronized (this) {
            if (this._translationDao == null) {
                this._translationDao = new TranslationDao_Impl(this);
            }
            translationDao = this._translationDao;
        }
        return translationDao;
    }
}
