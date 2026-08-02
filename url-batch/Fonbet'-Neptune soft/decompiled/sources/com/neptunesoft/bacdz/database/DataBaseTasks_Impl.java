package com.neptunesoft.bacdz.database;

import androidx.room.InvalidationTracker;
import androidx.room.RoomMasterTable;
import androidx.room.RoomOpenDelegate;
import androidx.room.migration.AutoMigrationSpec;
import androidx.room.migration.Migration;
import androidx.room.util.DBUtil;
import androidx.room.util.TableInfo;
import androidx.sqlite.SQLite;
import androidx.sqlite.SQLiteConnection;
import com.neptunesoft.bacdz.dao.TaskDao;
import com.neptunesoft.bacdz.dao.TaskDao_Impl;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* loaded from: classes4.dex */
public final class DataBaseTasks_Impl extends DataBaseTasks {
    private volatile TaskDao _taskDao;

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.room.RoomDatabase
    public RoomOpenDelegate createOpenDelegate() {
        return new RoomOpenDelegate(1, "faa76c6e6e08b4265f681c8b77d94742", "717bf1446043684e4adb5ef29ed4d6cb") { // from class: com.neptunesoft.bacdz.database.DataBaseTasks_Impl.1
            @Override // androidx.room.RoomOpenDelegate
            public void onCreate(final SQLiteConnection connection) {
            }

            @Override // androidx.room.RoomOpenDelegate
            public void onPostMigrate(final SQLiteConnection connection) {
            }

            @Override // androidx.room.RoomOpenDelegate
            public void createAllTables(final SQLiteConnection connection) {
                SQLite.execSQL(connection, "CREATE TABLE IF NOT EXISTS `Tasks` (`id_task` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `task` TEXT, `date_time_created` TEXT, `date_time_reminder` TEXT, `checked` INTEGER NOT NULL, `reminded` INTEGER NOT NULL)");
                SQLite.execSQL(connection, RoomMasterTable.CREATE_QUERY);
                SQLite.execSQL(connection, "INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, 'faa76c6e6e08b4265f681c8b77d94742')");
            }

            @Override // androidx.room.RoomOpenDelegate
            public void dropAllTables(final SQLiteConnection connection) {
                SQLite.execSQL(connection, "DROP TABLE IF EXISTS `Tasks`");
            }

            @Override // androidx.room.RoomOpenDelegate
            public void onOpen(final SQLiteConnection connection) {
                DataBaseTasks_Impl.this.internalInitInvalidationTracker(connection);
            }

            @Override // androidx.room.RoomOpenDelegate
            public void onPreMigrate(final SQLiteConnection connection) {
                DBUtil.dropFtsSyncTriggers(connection);
            }

            @Override // androidx.room.RoomOpenDelegate
            public RoomOpenDelegate.ValidationResult onValidateSchema(final SQLiteConnection connection) {
                HashMap hashMap = new HashMap(6);
                hashMap.put("id_task", new TableInfo.Column("id_task", "INTEGER", true, 1, null, 1));
                hashMap.put("task", new TableInfo.Column("task", "TEXT", false, 0, null, 1));
                hashMap.put("date_time_created", new TableInfo.Column("date_time_created", "TEXT", false, 0, null, 1));
                hashMap.put("date_time_reminder", new TableInfo.Column("date_time_reminder", "TEXT", false, 0, null, 1));
                hashMap.put("checked", new TableInfo.Column("checked", "INTEGER", true, 0, null, 1));
                hashMap.put("reminded", new TableInfo.Column("reminded", "INTEGER", true, 0, null, 1));
                TableInfo tableInfo = new TableInfo("Tasks", hashMap, new HashSet(0), new HashSet(0));
                TableInfo read = TableInfo.read(connection, "Tasks");
                if (!tableInfo.equals(read)) {
                    return new RoomOpenDelegate.ValidationResult(false, "Tasks(com.neptunesoft.bacdz.entities.Task).\n Expected:\n" + tableInfo + "\n Found:\n" + read);
                }
                return new RoomOpenDelegate.ValidationResult(true, null);
            }
        };
    }

    @Override // androidx.room.RoomDatabase
    protected InvalidationTracker createInvalidationTracker() {
        return new InvalidationTracker(this, new HashMap(0), new HashMap(0), "Tasks");
    }

    @Override // androidx.room.RoomDatabase
    public void clearAllTables() {
        super.performClear(false, "Tasks");
    }

    @Override // androidx.room.RoomDatabase
    protected Map<Class<?>, List<Class<?>>> getRequiredTypeConverters() {
        HashMap hashMap = new HashMap();
        hashMap.put(TaskDao.class, TaskDao_Impl.getRequiredConverters());
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

    @Override // com.neptunesoft.bacdz.database.DataBaseTasks
    public TaskDao taskDao() {
        TaskDao taskDao;
        if (this._taskDao != null) {
            return this._taskDao;
        }
        synchronized (this) {
            if (this._taskDao == null) {
                this._taskDao = new TaskDao_Impl(this);
            }
            taskDao = this._taskDao;
        }
        return taskDao;
    }
}
