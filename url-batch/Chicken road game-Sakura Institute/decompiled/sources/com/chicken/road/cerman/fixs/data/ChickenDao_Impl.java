package com.chicken.road.cerman.fixs.data;

import android.database.Cursor;
import androidx.autofill.HintConstants;
import androidx.core.app.NotificationCompat;
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
public final class ChickenDao_Impl implements ChickenDao {
    private final Converters __converters = new Converters();
    private final RoomDatabase __db;
    private final EntityDeletionOrUpdateAdapter<Chicken> __deletionAdapterOfChicken;
    private final EntityInsertionAdapter<Chicken> __insertionAdapterOfChicken;
    private final EntityDeletionOrUpdateAdapter<Chicken> __updateAdapterOfChicken;

    public ChickenDao_Impl(final RoomDatabase __db) {
        this.__db = __db;
        this.__insertionAdapterOfChicken = new EntityInsertionAdapter<Chicken>(__db) { // from class: com.chicken.road.cerman.fixs.data.ChickenDao_Impl.1
            @Override // androidx.room.SharedSQLiteStatement
            protected String createQuery() {
                return "INSERT OR REPLACE INTO `chickens` (`id`,`name`,`breed`,`type`,`status`,`acquiredDate`,`acquiredCost`,`notes`) VALUES (nullif(?, 0),?,?,?,?,?,?,?)";
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // androidx.room.EntityInsertionAdapter
            public void bind(final SupportSQLiteStatement statement, final Chicken entity) {
                statement.bindLong(1, entity.getId());
                statement.bindString(2, entity.getName());
                statement.bindString(3, entity.getBreed());
                statement.bindString(4, ChickenDao_Impl.this.__converters.fromType(entity.getType()));
                statement.bindString(5, ChickenDao_Impl.this.__converters.fromStatus(entity.getStatus()));
                statement.bindLong(6, entity.getAcquiredDate());
                statement.bindDouble(7, entity.getAcquiredCost());
                statement.bindString(8, entity.getNotes());
            }
        };
        this.__deletionAdapterOfChicken = new EntityDeletionOrUpdateAdapter<Chicken>(__db) { // from class: com.chicken.road.cerman.fixs.data.ChickenDao_Impl.2
            @Override // androidx.room.EntityDeletionOrUpdateAdapter, androidx.room.SharedSQLiteStatement
            protected String createQuery() {
                return "DELETE FROM `chickens` WHERE `id` = ?";
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // androidx.room.EntityDeletionOrUpdateAdapter
            public void bind(final SupportSQLiteStatement statement, final Chicken entity) {
                statement.bindLong(1, entity.getId());
            }
        };
        this.__updateAdapterOfChicken = new EntityDeletionOrUpdateAdapter<Chicken>(__db) { // from class: com.chicken.road.cerman.fixs.data.ChickenDao_Impl.3
            @Override // androidx.room.EntityDeletionOrUpdateAdapter, androidx.room.SharedSQLiteStatement
            protected String createQuery() {
                return "UPDATE OR ABORT `chickens` SET `id` = ?,`name` = ?,`breed` = ?,`type` = ?,`status` = ?,`acquiredDate` = ?,`acquiredCost` = ?,`notes` = ? WHERE `id` = ?";
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // androidx.room.EntityDeletionOrUpdateAdapter
            public void bind(final SupportSQLiteStatement statement, final Chicken entity) {
                statement.bindLong(1, entity.getId());
                statement.bindString(2, entity.getName());
                statement.bindString(3, entity.getBreed());
                statement.bindString(4, ChickenDao_Impl.this.__converters.fromType(entity.getType()));
                statement.bindString(5, ChickenDao_Impl.this.__converters.fromStatus(entity.getStatus()));
                statement.bindLong(6, entity.getAcquiredDate());
                statement.bindDouble(7, entity.getAcquiredCost());
                statement.bindString(8, entity.getNotes());
                statement.bindLong(9, entity.getId());
            }
        };
    }

    @Override // com.chicken.road.cerman.fixs.data.ChickenDao
    public Object insert(final Chicken c, final Continuation<? super Long> $completion) {
        return CoroutinesRoom.execute(this.__db, true, new Callable<Long>() { // from class: com.chicken.road.cerman.fixs.data.ChickenDao_Impl.4
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // java.util.concurrent.Callable
            public Long call() throws Exception {
                ChickenDao_Impl.this.__db.beginTransaction();
                try {
                    Long valueOf = Long.valueOf(ChickenDao_Impl.this.__insertionAdapterOfChicken.insertAndReturnId(c));
                    ChickenDao_Impl.this.__db.setTransactionSuccessful();
                    return valueOf;
                } finally {
                    ChickenDao_Impl.this.__db.endTransaction();
                }
            }
        }, $completion);
    }

    @Override // com.chicken.road.cerman.fixs.data.ChickenDao
    public Object delete(final Chicken c, final Continuation<? super Unit> $completion) {
        return CoroutinesRoom.execute(this.__db, true, new Callable<Unit>() { // from class: com.chicken.road.cerman.fixs.data.ChickenDao_Impl.5
            @Override // java.util.concurrent.Callable
            public Unit call() throws Exception {
                ChickenDao_Impl.this.__db.beginTransaction();
                try {
                    ChickenDao_Impl.this.__deletionAdapterOfChicken.handle(c);
                    ChickenDao_Impl.this.__db.setTransactionSuccessful();
                    return Unit.INSTANCE;
                } finally {
                    ChickenDao_Impl.this.__db.endTransaction();
                }
            }
        }, $completion);
    }

    @Override // com.chicken.road.cerman.fixs.data.ChickenDao
    public Object update(final Chicken c, final Continuation<? super Unit> $completion) {
        return CoroutinesRoom.execute(this.__db, true, new Callable<Unit>() { // from class: com.chicken.road.cerman.fixs.data.ChickenDao_Impl.6
            @Override // java.util.concurrent.Callable
            public Unit call() throws Exception {
                ChickenDao_Impl.this.__db.beginTransaction();
                try {
                    ChickenDao_Impl.this.__updateAdapterOfChicken.handle(c);
                    ChickenDao_Impl.this.__db.setTransactionSuccessful();
                    return Unit.INSTANCE;
                } finally {
                    ChickenDao_Impl.this.__db.endTransaction();
                }
            }
        }, $completion);
    }

    @Override // com.chicken.road.cerman.fixs.data.ChickenDao
    public Flow<List<Chicken>> all() {
        final RoomSQLiteQuery acquire = RoomSQLiteQuery.acquire("SELECT * FROM chickens ORDER BY id DESC", 0);
        return CoroutinesRoom.createFlow(this.__db, false, new String[]{"chickens"}, new Callable<List<Chicken>>() { // from class: com.chicken.road.cerman.fixs.data.ChickenDao_Impl.7
            @Override // java.util.concurrent.Callable
            public List<Chicken> call() throws Exception {
                Cursor query = DBUtil.query(ChickenDao_Impl.this.__db, acquire, false, null);
                try {
                    int columnIndexOrThrow = CursorUtil.getColumnIndexOrThrow(query, "id");
                    int columnIndexOrThrow2 = CursorUtil.getColumnIndexOrThrow(query, HintConstants.AUTOFILL_HINT_NAME);
                    int columnIndexOrThrow3 = CursorUtil.getColumnIndexOrThrow(query, "breed");
                    int columnIndexOrThrow4 = CursorUtil.getColumnIndexOrThrow(query, "type");
                    int columnIndexOrThrow5 = CursorUtil.getColumnIndexOrThrow(query, NotificationCompat.CATEGORY_STATUS);
                    int columnIndexOrThrow6 = CursorUtil.getColumnIndexOrThrow(query, "acquiredDate");
                    int columnIndexOrThrow7 = CursorUtil.getColumnIndexOrThrow(query, "acquiredCost");
                    int columnIndexOrThrow8 = CursorUtil.getColumnIndexOrThrow(query, "notes");
                    ArrayList arrayList = new ArrayList(query.getCount());
                    while (query.moveToNext()) {
                        arrayList.add(new Chicken(query.getLong(columnIndexOrThrow), query.getString(columnIndexOrThrow2), query.getString(columnIndexOrThrow3), ChickenDao_Impl.this.__converters.toType(query.getString(columnIndexOrThrow4)), ChickenDao_Impl.this.__converters.toStatus(query.getString(columnIndexOrThrow5)), query.getLong(columnIndexOrThrow6), query.getDouble(columnIndexOrThrow7), query.getString(columnIndexOrThrow8)));
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

    @Override // com.chicken.road.cerman.fixs.data.ChickenDao
    public Flow<Chicken> byId(final long id) {
        final RoomSQLiteQuery acquire = RoomSQLiteQuery.acquire("SELECT * FROM chickens WHERE id = ?", 1);
        acquire.bindLong(1, id);
        return CoroutinesRoom.createFlow(this.__db, false, new String[]{"chickens"}, new Callable<Chicken>() { // from class: com.chicken.road.cerman.fixs.data.ChickenDao_Impl.8
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // java.util.concurrent.Callable
            public Chicken call() throws Exception {
                Chicken chicken = null;
                Cursor query = DBUtil.query(ChickenDao_Impl.this.__db, acquire, false, null);
                try {
                    int columnIndexOrThrow = CursorUtil.getColumnIndexOrThrow(query, "id");
                    int columnIndexOrThrow2 = CursorUtil.getColumnIndexOrThrow(query, HintConstants.AUTOFILL_HINT_NAME);
                    int columnIndexOrThrow3 = CursorUtil.getColumnIndexOrThrow(query, "breed");
                    int columnIndexOrThrow4 = CursorUtil.getColumnIndexOrThrow(query, "type");
                    int columnIndexOrThrow5 = CursorUtil.getColumnIndexOrThrow(query, NotificationCompat.CATEGORY_STATUS);
                    int columnIndexOrThrow6 = CursorUtil.getColumnIndexOrThrow(query, "acquiredDate");
                    int columnIndexOrThrow7 = CursorUtil.getColumnIndexOrThrow(query, "acquiredCost");
                    int columnIndexOrThrow8 = CursorUtil.getColumnIndexOrThrow(query, "notes");
                    if (query.moveToFirst()) {
                        chicken = new Chicken(query.getLong(columnIndexOrThrow), query.getString(columnIndexOrThrow2), query.getString(columnIndexOrThrow3), ChickenDao_Impl.this.__converters.toType(query.getString(columnIndexOrThrow4)), ChickenDao_Impl.this.__converters.toStatus(query.getString(columnIndexOrThrow5)), query.getLong(columnIndexOrThrow6), query.getDouble(columnIndexOrThrow7), query.getString(columnIndexOrThrow8));
                    }
                    return chicken;
                } finally {
                    query.close();
                }
            }

            protected void finalize() {
                acquire.release();
            }
        });
    }

    @Override // com.chicken.road.cerman.fixs.data.ChickenDao
    public Flow<Integer> activeCount() {
        final RoomSQLiteQuery acquire = RoomSQLiteQuery.acquire("SELECT COUNT(*) FROM chickens WHERE status = 'Active'", 0);
        return CoroutinesRoom.createFlow(this.__db, false, new String[]{"chickens"}, new Callable<Integer>() { // from class: com.chicken.road.cerman.fixs.data.ChickenDao_Impl.9
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // java.util.concurrent.Callable
            public Integer call() throws Exception {
                int i;
                Cursor query = DBUtil.query(ChickenDao_Impl.this.__db, acquire, false, null);
                try {
                    if (query.moveToFirst()) {
                        i = Integer.valueOf(query.getInt(0));
                    } else {
                        i = 0;
                    }
                    return i;
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
