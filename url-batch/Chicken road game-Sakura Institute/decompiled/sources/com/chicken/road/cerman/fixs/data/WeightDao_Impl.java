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
public final class WeightDao_Impl implements WeightDao {
    private final RoomDatabase __db;
    private final EntityDeletionOrUpdateAdapter<WeightEntry> __deletionAdapterOfWeightEntry;
    private final EntityInsertionAdapter<WeightEntry> __insertionAdapterOfWeightEntry;

    public WeightDao_Impl(final RoomDatabase __db) {
        this.__db = __db;
        this.__insertionAdapterOfWeightEntry = new EntityInsertionAdapter<WeightEntry>(__db) { // from class: com.chicken.road.cerman.fixs.data.WeightDao_Impl.1
            @Override // androidx.room.SharedSQLiteStatement
            protected String createQuery() {
                return "INSERT OR ABORT INTO `weight_entries` (`id`,`chickenId`,`date`,`weightGrams`) VALUES (nullif(?, 0),?,?,?)";
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // androidx.room.EntityInsertionAdapter
            public void bind(final SupportSQLiteStatement statement, final WeightEntry entity) {
                statement.bindLong(1, entity.getId());
                statement.bindLong(2, entity.getChickenId());
                statement.bindLong(3, entity.getDate());
                statement.bindLong(4, entity.getWeightGrams());
            }
        };
        this.__deletionAdapterOfWeightEntry = new EntityDeletionOrUpdateAdapter<WeightEntry>(__db) { // from class: com.chicken.road.cerman.fixs.data.WeightDao_Impl.2
            @Override // androidx.room.EntityDeletionOrUpdateAdapter, androidx.room.SharedSQLiteStatement
            protected String createQuery() {
                return "DELETE FROM `weight_entries` WHERE `id` = ?";
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // androidx.room.EntityDeletionOrUpdateAdapter
            public void bind(final SupportSQLiteStatement statement, final WeightEntry entity) {
                statement.bindLong(1, entity.getId());
            }
        };
    }

    @Override // com.chicken.road.cerman.fixs.data.WeightDao
    public Object insert(final WeightEntry w, final Continuation<? super Long> $completion) {
        return CoroutinesRoom.execute(this.__db, true, new Callable<Long>() { // from class: com.chicken.road.cerman.fixs.data.WeightDao_Impl.3
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // java.util.concurrent.Callable
            public Long call() throws Exception {
                WeightDao_Impl.this.__db.beginTransaction();
                try {
                    Long valueOf = Long.valueOf(WeightDao_Impl.this.__insertionAdapterOfWeightEntry.insertAndReturnId(w));
                    WeightDao_Impl.this.__db.setTransactionSuccessful();
                    return valueOf;
                } finally {
                    WeightDao_Impl.this.__db.endTransaction();
                }
            }
        }, $completion);
    }

    @Override // com.chicken.road.cerman.fixs.data.WeightDao
    public Object delete(final WeightEntry w, final Continuation<? super Unit> $completion) {
        return CoroutinesRoom.execute(this.__db, true, new Callable<Unit>() { // from class: com.chicken.road.cerman.fixs.data.WeightDao_Impl.4
            @Override // java.util.concurrent.Callable
            public Unit call() throws Exception {
                WeightDao_Impl.this.__db.beginTransaction();
                try {
                    WeightDao_Impl.this.__deletionAdapterOfWeightEntry.handle(w);
                    WeightDao_Impl.this.__db.setTransactionSuccessful();
                    return Unit.INSTANCE;
                } finally {
                    WeightDao_Impl.this.__db.endTransaction();
                }
            }
        }, $completion);
    }

    @Override // com.chicken.road.cerman.fixs.data.WeightDao
    public Flow<List<WeightEntry>> all() {
        final RoomSQLiteQuery acquire = RoomSQLiteQuery.acquire("SELECT * FROM weight_entries ORDER BY date DESC", 0);
        return CoroutinesRoom.createFlow(this.__db, false, new String[]{"weight_entries"}, new Callable<List<WeightEntry>>() { // from class: com.chicken.road.cerman.fixs.data.WeightDao_Impl.5
            @Override // java.util.concurrent.Callable
            public List<WeightEntry> call() throws Exception {
                Cursor query = DBUtil.query(WeightDao_Impl.this.__db, acquire, false, null);
                try {
                    int columnIndexOrThrow = CursorUtil.getColumnIndexOrThrow(query, "id");
                    int columnIndexOrThrow2 = CursorUtil.getColumnIndexOrThrow(query, "chickenId");
                    int columnIndexOrThrow3 = CursorUtil.getColumnIndexOrThrow(query, "date");
                    int columnIndexOrThrow4 = CursorUtil.getColumnIndexOrThrow(query, "weightGrams");
                    ArrayList arrayList = new ArrayList(query.getCount());
                    while (query.moveToNext()) {
                        arrayList.add(new WeightEntry(query.getLong(columnIndexOrThrow), query.getLong(columnIndexOrThrow2), query.getLong(columnIndexOrThrow3), query.getInt(columnIndexOrThrow4)));
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

    @Override // com.chicken.road.cerman.fixs.data.WeightDao
    public Flow<List<WeightEntry>> forChicken(final long chickenId) {
        final RoomSQLiteQuery acquire = RoomSQLiteQuery.acquire("SELECT * FROM weight_entries WHERE chickenId = ? ORDER BY date ASC", 1);
        acquire.bindLong(1, chickenId);
        return CoroutinesRoom.createFlow(this.__db, false, new String[]{"weight_entries"}, new Callable<List<WeightEntry>>() { // from class: com.chicken.road.cerman.fixs.data.WeightDao_Impl.6
            @Override // java.util.concurrent.Callable
            public List<WeightEntry> call() throws Exception {
                Cursor query = DBUtil.query(WeightDao_Impl.this.__db, acquire, false, null);
                try {
                    int columnIndexOrThrow = CursorUtil.getColumnIndexOrThrow(query, "id");
                    int columnIndexOrThrow2 = CursorUtil.getColumnIndexOrThrow(query, "chickenId");
                    int columnIndexOrThrow3 = CursorUtil.getColumnIndexOrThrow(query, "date");
                    int columnIndexOrThrow4 = CursorUtil.getColumnIndexOrThrow(query, "weightGrams");
                    ArrayList arrayList = new ArrayList(query.getCount());
                    while (query.moveToNext()) {
                        arrayList.add(new WeightEntry(query.getLong(columnIndexOrThrow), query.getLong(columnIndexOrThrow2), query.getLong(columnIndexOrThrow3), query.getInt(columnIndexOrThrow4)));
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
