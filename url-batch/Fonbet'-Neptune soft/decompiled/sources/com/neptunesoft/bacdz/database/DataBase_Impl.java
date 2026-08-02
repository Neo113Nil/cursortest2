package com.neptunesoft.bacdz.database;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.room.InvalidationTracker;
import androidx.room.RoomMasterTable;
import androidx.room.RoomOpenDelegate;
import androidx.room.migration.AutoMigrationSpec;
import androidx.room.migration.Migration;
import androidx.room.util.DBUtil;
import androidx.room.util.TableInfo;
import androidx.sqlite.SQLite;
import androidx.sqlite.SQLiteConnection;
import com.neptunesoft.bacdz.dao.NoteDao;
import com.neptunesoft.bacdz.dao.NoteDao_Impl;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* loaded from: classes4.dex */
public final class DataBase_Impl extends DataBase {
    private volatile NoteDao _noteDao;

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.room.RoomDatabase
    public RoomOpenDelegate createOpenDelegate() {
        return new RoomOpenDelegate(1, "6c208f06973ce182d654a18968cbaf62", "213830e1750e4d7bdf9a8bf855d4b570") { // from class: com.neptunesoft.bacdz.database.DataBase_Impl.1
            @Override // androidx.room.RoomOpenDelegate
            public void onCreate(final SQLiteConnection connection) {
            }

            @Override // androidx.room.RoomOpenDelegate
            public void onPostMigrate(final SQLiteConnection connection) {
            }

            @Override // androidx.room.RoomOpenDelegate
            public void createAllTables(final SQLiteConnection connection) {
                SQLite.execSQL(connection, "CREATE TABLE IF NOT EXISTS `Notes` (`id_note` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `title` TEXT, `date_time` TEXT, `subtitle` TEXT, `note_content` TEXT, `image_path` TEXT, `color` TEXT, `web_link` TEXT)");
                SQLite.execSQL(connection, RoomMasterTable.CREATE_QUERY);
                SQLite.execSQL(connection, "INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '6c208f06973ce182d654a18968cbaf62')");
            }

            @Override // androidx.room.RoomOpenDelegate
            public void dropAllTables(final SQLiteConnection connection) {
                SQLite.execSQL(connection, "DROP TABLE IF EXISTS `Notes`");
            }

            @Override // androidx.room.RoomOpenDelegate
            public void onOpen(final SQLiteConnection connection) {
                DataBase_Impl.this.internalInitInvalidationTracker(connection);
            }

            @Override // androidx.room.RoomOpenDelegate
            public void onPreMigrate(final SQLiteConnection connection) {
                DBUtil.dropFtsSyncTriggers(connection);
            }

            @Override // androidx.room.RoomOpenDelegate
            public RoomOpenDelegate.ValidationResult onValidateSchema(final SQLiteConnection connection) {
                HashMap hashMap = new HashMap(8);
                hashMap.put("id_note", new TableInfo.Column("id_note", "INTEGER", true, 1, null, 1));
                hashMap.put("title", new TableInfo.Column("title", "TEXT", false, 0, null, 1));
                hashMap.put("date_time", new TableInfo.Column("date_time", "TEXT", false, 0, null, 1));
                hashMap.put("subtitle", new TableInfo.Column("subtitle", "TEXT", false, 0, null, 1));
                hashMap.put("note_content", new TableInfo.Column("note_content", "TEXT", false, 0, null, 1));
                hashMap.put("image_path", new TableInfo.Column("image_path", "TEXT", false, 0, null, 1));
                hashMap.put(TypedValues.Custom.S_COLOR, new TableInfo.Column(TypedValues.Custom.S_COLOR, "TEXT", false, 0, null, 1));
                hashMap.put("web_link", new TableInfo.Column("web_link", "TEXT", false, 0, null, 1));
                TableInfo tableInfo = new TableInfo("Notes", hashMap, new HashSet(0), new HashSet(0));
                TableInfo read = TableInfo.read(connection, "Notes");
                if (!tableInfo.equals(read)) {
                    return new RoomOpenDelegate.ValidationResult(false, "Notes(com.neptunesoft.bacdz.entities.Note).\n Expected:\n" + tableInfo + "\n Found:\n" + read);
                }
                return new RoomOpenDelegate.ValidationResult(true, null);
            }
        };
    }

    @Override // androidx.room.RoomDatabase
    protected InvalidationTracker createInvalidationTracker() {
        return new InvalidationTracker(this, new HashMap(0), new HashMap(0), "Notes");
    }

    @Override // androidx.room.RoomDatabase
    public void clearAllTables() {
        super.performClear(false, "Notes");
    }

    @Override // androidx.room.RoomDatabase
    protected Map<Class<?>, List<Class<?>>> getRequiredTypeConverters() {
        HashMap hashMap = new HashMap();
        hashMap.put(NoteDao.class, NoteDao_Impl.getRequiredConverters());
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

    @Override // com.neptunesoft.bacdz.database.DataBase
    public NoteDao noteDao() {
        NoteDao noteDao;
        if (this._noteDao != null) {
            return this._noteDao;
        }
        synchronized (this) {
            if (this._noteDao == null) {
                this._noteDao = new NoteDao_Impl(this);
            }
            noteDao = this._noteDao;
        }
        return noteDao;
    }
}
