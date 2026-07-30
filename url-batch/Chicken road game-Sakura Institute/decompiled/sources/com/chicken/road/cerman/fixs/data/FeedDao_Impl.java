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
public final class FeedDao_Impl implements FeedDao {
    private final RoomDatabase __db;
    private final EntityDeletionOrUpdateAdapter<FeedEntry> __deletionAdapterOfFeedEntry;
    private final EntityInsertionAdapter<FeedEntry> __insertionAdapterOfFeedEntry;

    public FeedDao_Impl(final RoomDatabase __db) {
        this.__db = __db;
        this.__insertionAdapterOfFeedEntry = new EntityInsertionAdapter<FeedEntry>(__db) { // from class: com.chicken.road.cerman.fixs.data.FeedDao_Impl.1
            @Override // androidx.room.SharedSQLiteStatement
            protected String createQuery() {
                return "INSERT OR ABORT INTO `feed_entries` (`id`,`chickenId`,`date`,`feedType`,`quantityKg`,`pricePerKg`) VALUES (nullif(?, 0),?,?,?,?,?)";
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // androidx.room.EntityInsertionAdapter
            public void bind(final SupportSQLiteStatement statement, final FeedEntry entity) {
                statement.bindLong(1, entity.getId());
                if (entity.getChickenId() == null) {
                    statement.bindNull(2);
                } else {
                    statement.bindLong(2, entity.getChickenId().longValue());
                }
                statement.bindLong(3, entity.getDate());
                statement.bindString(4, entity.getFeedType());
                statement.bindDouble(5, entity.getQuantityKg());
                statement.bindDouble(6, entity.getPricePerKg());
            }
        };
        this.__deletionAdapterOfFeedEntry = new EntityDeletionOrUpdateAdapter<FeedEntry>(__db) { // from class: com.chicken.road.cerman.fixs.data.FeedDao_Impl.2
            @Override // androidx.room.EntityDeletionOrUpdateAdapter, androidx.room.SharedSQLiteStatement
            protected String createQuery() {
                return "DELETE FROM `feed_entries` WHERE `id` = ?";
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // androidx.room.EntityDeletionOrUpdateAdapter
            public void bind(final SupportSQLiteStatement statement, final FeedEntry entity) {
                statement.bindLong(1, entity.getId());
            }
        };
    }

    @Override // com.chicken.road.cerman.fixs.data.FeedDao
    public Object insert(final FeedEntry f, final Continuation<? super Long> $completion) {
        return CoroutinesRoom.execute(this.__db, true, new Callable<Long>() { // from class: com.chicken.road.cerman.fixs.data.FeedDao_Impl.3
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // java.util.concurrent.Callable
            public Long call() throws Exception {
                FeedDao_Impl.this.__db.beginTransaction();
                try {
                    Long valueOf = Long.valueOf(FeedDao_Impl.this.__insertionAdapterOfFeedEntry.insertAndReturnId(f));
                    FeedDao_Impl.this.__db.setTransactionSuccessful();
                    return valueOf;
                } finally {
                    FeedDao_Impl.this.__db.endTransaction();
                }
            }
        }, $completion);
    }

    @Override // com.chicken.road.cerman.fixs.data.FeedDao
    public Object delete(final FeedEntry f, final Continuation<? super Unit> $completion) {
        return CoroutinesRoom.execute(this.__db, true, new Callable<Unit>() { // from class: com.chicken.road.cerman.fixs.data.FeedDao_Impl.4
            @Override // java.util.concurrent.Callable
            public Unit call() throws Exception {
                FeedDao_Impl.this.__db.beginTransaction();
                try {
                    FeedDao_Impl.this.__deletionAdapterOfFeedEntry.handle(f);
                    FeedDao_Impl.this.__db.setTransactionSuccessful();
                    return Unit.INSTANCE;
                } finally {
                    FeedDao_Impl.this.__db.endTransaction();
                }
            }
        }, $completion);
    }

    @Override // com.chicken.road.cerman.fixs.data.FeedDao
    public Flow<List<FeedEntry>> all() {
        final RoomSQLiteQuery acquire = RoomSQLiteQuery.acquire("SELECT * FROM feed_entries ORDER BY date DESC", 0);
        return CoroutinesRoom.createFlow(this.__db, false, new String[]{"feed_entries"}, new Callable<List<FeedEntry>>() { // from class: com.chicken.road.cerman.fixs.data.FeedDao_Impl.5
            @Override // java.util.concurrent.Callable
            public List<FeedEntry> call() throws Exception {
                Cursor query = DBUtil.query(FeedDao_Impl.this.__db, acquire, false, null);
                try {
                    int columnIndexOrThrow = CursorUtil.getColumnIndexOrThrow(query, "id");
                    int columnIndexOrThrow2 = CursorUtil.getColumnIndexOrThrow(query, "chickenId");
                    int columnIndexOrThrow3 = CursorUtil.getColumnIndexOrThrow(query, "date");
                    int columnIndexOrThrow4 = CursorUtil.getColumnIndexOrThrow(query, "feedType");
                    int columnIndexOrThrow5 = CursorUtil.getColumnIndexOrThrow(query, "quantityKg");
                    int columnIndexOrThrow6 = CursorUtil.getColumnIndexOrThrow(query, "pricePerKg");
                    ArrayList arrayList = new ArrayList(query.getCount());
                    while (query.moveToNext()) {
                        arrayList.add(new FeedEntry(query.getLong(columnIndexOrThrow), query.isNull(columnIndexOrThrow2) ? null : Long.valueOf(query.getLong(columnIndexOrThrow2)), query.getLong(columnIndexOrThrow3), query.getString(columnIndexOrThrow4), query.getDouble(columnIndexOrThrow5), query.getDouble(columnIndexOrThrow6)));
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

    @Override // com.chicken.road.cerman.fixs.data.FeedDao
    public Flow<List<FeedEntry>> forChicken(final long chickenId) {
        final RoomSQLiteQuery acquire = RoomSQLiteQuery.acquire("SELECT * FROM feed_entries WHERE chickenId = ? ORDER BY date DESC", 1);
        acquire.bindLong(1, chickenId);
        return CoroutinesRoom.createFlow(this.__db, false, new String[]{"feed_entries"}, new Callable<List<FeedEntry>>() { // from class: com.chicken.road.cerman.fixs.data.FeedDao_Impl.6
            @Override // java.util.concurrent.Callable
            public List<FeedEntry> call() throws Exception {
                Cursor query = DBUtil.query(FeedDao_Impl.this.__db, acquire, false, null);
                try {
                    int columnIndexOrThrow = CursorUtil.getColumnIndexOrThrow(query, "id");
                    int columnIndexOrThrow2 = CursorUtil.getColumnIndexOrThrow(query, "chickenId");
                    int columnIndexOrThrow3 = CursorUtil.getColumnIndexOrThrow(query, "date");
                    int columnIndexOrThrow4 = CursorUtil.getColumnIndexOrThrow(query, "feedType");
                    int columnIndexOrThrow5 = CursorUtil.getColumnIndexOrThrow(query, "quantityKg");
                    int columnIndexOrThrow6 = CursorUtil.getColumnIndexOrThrow(query, "pricePerKg");
                    ArrayList arrayList = new ArrayList(query.getCount());
                    while (query.moveToNext()) {
                        arrayList.add(new FeedEntry(query.getLong(columnIndexOrThrow), query.isNull(columnIndexOrThrow2) ? null : Long.valueOf(query.getLong(columnIndexOrThrow2)), query.getLong(columnIndexOrThrow3), query.getString(columnIndexOrThrow4), query.getDouble(columnIndexOrThrow5), query.getDouble(columnIndexOrThrow6)));
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
