package com.chicken.road.cerman.fixs.data;

import android.database.Cursor;
import androidx.room.CoroutinesRoom;
import androidx.room.EntityDeletionOrUpdateAdapter;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.Flow;

/* loaded from: classes3.dex */
public final class EggDao_Impl implements EggDao {
    private final RoomDatabase __db;
    private final EntityDeletionOrUpdateAdapter<EggLog> __deletionAdapterOfEggLog;
    private final EntityInsertionAdapter<EggLog> __insertionAdapterOfEggLog;

    public EggDao_Impl(final RoomDatabase __db) {
        this.__db = __db;
        this.__insertionAdapterOfEggLog = new EntityInsertionAdapter<EggLog>(__db) { // from class: com.chicken.road.cerman.fixs.data.EggDao_Impl.1
            @Override // androidx.room.SharedSQLiteStatement
            protected String createQuery() {
                return "INSERT OR ABORT INTO `egg_logs` (`id`,`chickenId`,`date`,`count`) VALUES (nullif(?, 0),?,?,?)";
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // androidx.room.EntityInsertionAdapter
            public void bind(final SupportSQLiteStatement statement, final EggLog entity) {
                statement.bindLong(1, entity.getId());
                if (entity.getChickenId() == null) {
                    statement.bindNull(2);
                } else {
                    statement.bindLong(2, entity.getChickenId().longValue());
                }
                statement.bindLong(3, entity.getDate());
                statement.bindLong(4, entity.getCount());
            }
        };
        this.__deletionAdapterOfEggLog = new EntityDeletionOrUpdateAdapter<EggLog>(__db) { // from class: com.chicken.road.cerman.fixs.data.EggDao_Impl.2
            @Override // androidx.room.EntityDeletionOrUpdateAdapter, androidx.room.SharedSQLiteStatement
            protected String createQuery() {
                return "DELETE FROM `egg_logs` WHERE `id` = ?";
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // androidx.room.EntityDeletionOrUpdateAdapter
            public void bind(final SupportSQLiteStatement statement, final EggLog entity) {
                statement.bindLong(1, entity.getId());
            }
        };
    }

    @Override // com.chicken.road.cerman.fixs.data.EggDao
    public Object insert(final EggLog e, final Continuation<? super Long> $completion) {
        return CoroutinesRoom.execute(this.__db, true, new Callable<Long>() { // from class: com.chicken.road.cerman.fixs.data.EggDao_Impl.3
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // java.util.concurrent.Callable
            public Long call() throws Exception {
                EggDao_Impl.this.__db.beginTransaction();
                try {
                    Long valueOf = Long.valueOf(EggDao_Impl.this.__insertionAdapterOfEggLog.insertAndReturnId(e));
                    EggDao_Impl.this.__db.setTransactionSuccessful();
                    return valueOf;
                } finally {
                    EggDao_Impl.this.__db.endTransaction();
                }
            }
        }, $completion);
    }

    @Override // com.chicken.road.cerman.fixs.data.EggDao
    public Object delete(final EggLog e, final Continuation<? super Unit> $completion) {
        return CoroutinesRoom.execute(this.__db, true, new Callable<Unit>() { // from class: com.chicken.road.cerman.fixs.data.EggDao_Impl.4
            @Override // java.util.concurrent.Callable
            public Unit call() throws Exception {
                EggDao_Impl.this.__db.beginTransaction();
                try {
                    EggDao_Impl.this.__deletionAdapterOfEggLog.handle(e);
                    EggDao_Impl.this.__db.setTransactionSuccessful();
                    return Unit.INSTANCE;
                } finally {
                    EggDao_Impl.this.__db.endTransaction();
                }
            }
        }, $completion);
    }

    @Override // com.chicken.road.cerman.fixs.data.EggDao
    public Flow<List<EggLog>> all() {
        final RoomSQLiteQuery acquire = RoomSQLiteQuery.acquire("SELECT * FROM egg_logs ORDER BY date DESC", 0);
        return CoroutinesRoom.createFlow(this.__db, false, new String[]{"egg_logs"}, new Callable<List<EggLog>>() { // from class: com.chicken.road.cerman.fixs.data.EggDao_Impl.5
            @Override // java.util.concurrent.Callable
            public List<EggLog> call() throws Exception {
                Cursor query = DBUtil.query(EggDao_Impl.this.__db, acquire, false, null);
                try {
                    int columnIndexOrThrow = CursorUtil.getColumnIndexOrThrow(query, "id");
                    int columnIndexOrThrow2 = CursorUtil.getColumnIndexOrThrow(query, "chickenId");
                    int columnIndexOrThrow3 = CursorUtil.getColumnIndexOrThrow(query, "date");
                    int columnIndexOrThrow4 = CursorUtil.getColumnIndexOrThrow(query, "count");
                    ArrayList arrayList = new ArrayList(query.getCount());
                    while (query.moveToNext()) {
                        arrayList.add(new EggLog(query.getLong(columnIndexOrThrow), query.isNull(columnIndexOrThrow2) ? null : Long.valueOf(query.getLong(columnIndexOrThrow2)), query.getLong(columnIndexOrThrow3), query.getInt(columnIndexOrThrow4)));
                    }
                    return arrayList;
                } finally {
                    query.close();
                }
            }

            protected void finalize() {
                acquire.release();
            }
        });
    }

    @Override // com.chicken.road.cerman.fixs.data.EggDao
    public Flow<List<EggLog>> forChicken(final long chickenId) {
        final RoomSQLiteQuery acquire = RoomSQLiteQuery.acquire("SELECT * FROM egg_logs WHERE chickenId = ? ORDER BY date DESC", 1);
        acquire.bindLong(1, chickenId);
        return CoroutinesRoom.createFlow(this.__db, false, new String[]{"egg_logs"}, new Callable<List<EggLog>>() { // from class: com.chicken.road.cerman.fixs.data.EggDao_Impl.6
            @Override // java.util.concurrent.Callable
            public List<EggLog> call() throws Exception {
                Cursor query = DBUtil.query(EggDao_Impl.this.__db, acquire, false, null);
                try {
                    int columnIndexOrThrow = CursorUtil.getColumnIndexOrThrow(query, "id");
                    int columnIndexOrThrow2 = CursorUtil.getColumnIndexOrThrow(query, "chickenId");
                    int columnIndexOrThrow3 = CursorUtil.getColumnIndexOrThrow(query, "date");
                    int columnIndexOrThrow4 = CursorUtil.getColumnIndexOrThrow(query, "count");
                    ArrayList arrayList = new ArrayList(query.getCount());
                    while (query.moveToNext()) {
                        arrayList.add(new EggLog(query.getLong(columnIndexOrThrow), query.isNull(columnIndexOrThrow2) ? null : Long.valueOf(query.getLong(columnIndexOrThrow2)), query.getLong(columnIndexOrThrow3), query.getInt(columnIndexOrThrow4)));
                    }
                    return arrayList;
                } finally {
                    query.close();
                }
            }

            protected void finalize() {
                acquire.release();
            }
        });
    }

    public static List<Class<?>> getRequiredConverters() {
        return Collections.emptyList();
    }
}
