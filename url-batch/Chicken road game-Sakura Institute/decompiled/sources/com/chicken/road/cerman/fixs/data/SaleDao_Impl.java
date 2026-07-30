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
public final class SaleDao_Impl implements SaleDao {
    private final RoomDatabase __db;
    private final EntityDeletionOrUpdateAdapter<Sale> __deletionAdapterOfSale;
    private final EntityInsertionAdapter<Sale> __insertionAdapterOfSale;

    public SaleDao_Impl(final RoomDatabase __db) {
        this.__db = __db;
        this.__insertionAdapterOfSale = new EntityInsertionAdapter<Sale>(__db) { // from class: com.chicken.road.cerman.fixs.data.SaleDao_Impl.1
            @Override // androidx.room.SharedSQLiteStatement
            protected String createQuery() {
                return "INSERT OR ABORT INTO `sales` (`id`,`chickenId`,`date`,`saleType`,`quantity`,`unitPrice`,`buyer`) VALUES (nullif(?, 0),?,?,?,?,?,?)";
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // androidx.room.EntityInsertionAdapter
            public void bind(final SupportSQLiteStatement statement, final Sale entity) {
                statement.bindLong(1, entity.getId());
                if (entity.getChickenId() == null) {
                    statement.bindNull(2);
                } else {
                    statement.bindLong(2, entity.getChickenId().longValue());
                }
                statement.bindLong(3, entity.getDate());
                statement.bindString(4, entity.getSaleType());
                statement.bindLong(5, entity.getQuantity());
                statement.bindDouble(6, entity.getUnitPrice());
                statement.bindString(7, entity.getBuyer());
            }
        };
        this.__deletionAdapterOfSale = new EntityDeletionOrUpdateAdapter<Sale>(__db) { // from class: com.chicken.road.cerman.fixs.data.SaleDao_Impl.2
            @Override // androidx.room.EntityDeletionOrUpdateAdapter, androidx.room.SharedSQLiteStatement
            protected String createQuery() {
                return "DELETE FROM `sales` WHERE `id` = ?";
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // androidx.room.EntityDeletionOrUpdateAdapter
            public void bind(final SupportSQLiteStatement statement, final Sale entity) {
                statement.bindLong(1, entity.getId());
            }
        };
    }

    @Override // com.chicken.road.cerman.fixs.data.SaleDao
    public Object insert(final Sale s, final Continuation<? super Long> $completion) {
        return CoroutinesRoom.execute(this.__db, true, new Callable<Long>() { // from class: com.chicken.road.cerman.fixs.data.SaleDao_Impl.3
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // java.util.concurrent.Callable
            public Long call() throws Exception {
                SaleDao_Impl.this.__db.beginTransaction();
                try {
                    Long valueOf = Long.valueOf(SaleDao_Impl.this.__insertionAdapterOfSale.insertAndReturnId(s));
                    SaleDao_Impl.this.__db.setTransactionSuccessful();
                    return valueOf;
                } finally {
                    SaleDao_Impl.this.__db.endTransaction();
                }
            }
        }, $completion);
    }

    @Override // com.chicken.road.cerman.fixs.data.SaleDao
    public Object delete(final Sale s, final Continuation<? super Unit> $completion) {
        return CoroutinesRoom.execute(this.__db, true, new Callable<Unit>() { // from class: com.chicken.road.cerman.fixs.data.SaleDao_Impl.4
            @Override // java.util.concurrent.Callable
            public Unit call() throws Exception {
                SaleDao_Impl.this.__db.beginTransaction();
                try {
                    SaleDao_Impl.this.__deletionAdapterOfSale.handle(s);
                    SaleDao_Impl.this.__db.setTransactionSuccessful();
                    return Unit.INSTANCE;
                } finally {
                    SaleDao_Impl.this.__db.endTransaction();
                }
            }
        }, $completion);
    }

    @Override // com.chicken.road.cerman.fixs.data.SaleDao
    public Flow<List<Sale>> all() {
        final RoomSQLiteQuery acquire = RoomSQLiteQuery.acquire("SELECT * FROM sales ORDER BY date DESC", 0);
        return CoroutinesRoom.createFlow(this.__db, false, new String[]{"sales"}, new Callable<List<Sale>>() { // from class: com.chicken.road.cerman.fixs.data.SaleDao_Impl.5
            @Override // java.util.concurrent.Callable
            public List<Sale> call() throws Exception {
                Cursor query = DBUtil.query(SaleDao_Impl.this.__db, acquire, false, null);
                try {
                    int columnIndexOrThrow = CursorUtil.getColumnIndexOrThrow(query, "id");
                    int columnIndexOrThrow2 = CursorUtil.getColumnIndexOrThrow(query, "chickenId");
                    int columnIndexOrThrow3 = CursorUtil.getColumnIndexOrThrow(query, "date");
                    int columnIndexOrThrow4 = CursorUtil.getColumnIndexOrThrow(query, "saleType");
                    int columnIndexOrThrow5 = CursorUtil.getColumnIndexOrThrow(query, "quantity");
                    int columnIndexOrThrow6 = CursorUtil.getColumnIndexOrThrow(query, "unitPrice");
                    int columnIndexOrThrow7 = CursorUtil.getColumnIndexOrThrow(query, "buyer");
                    ArrayList arrayList = new ArrayList(query.getCount());
                    while (query.moveToNext()) {
                        arrayList.add(new Sale(query.getLong(columnIndexOrThrow), query.isNull(columnIndexOrThrow2) ? null : Long.valueOf(query.getLong(columnIndexOrThrow2)), query.getLong(columnIndexOrThrow3), query.getString(columnIndexOrThrow4), query.getInt(columnIndexOrThrow5), query.getDouble(columnIndexOrThrow6), query.getString(columnIndexOrThrow7)));
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

    @Override // com.chicken.road.cerman.fixs.data.SaleDao
    public Flow<List<Sale>> forChicken(final long chickenId) {
        final RoomSQLiteQuery acquire = RoomSQLiteQuery.acquire("SELECT * FROM sales WHERE chickenId = ? ORDER BY date DESC", 1);
        acquire.bindLong(1, chickenId);
        return CoroutinesRoom.createFlow(this.__db, false, new String[]{"sales"}, new Callable<List<Sale>>() { // from class: com.chicken.road.cerman.fixs.data.SaleDao_Impl.6
            @Override // java.util.concurrent.Callable
            public List<Sale> call() throws Exception {
                Cursor query = DBUtil.query(SaleDao_Impl.this.__db, acquire, false, null);
                try {
                    int columnIndexOrThrow = CursorUtil.getColumnIndexOrThrow(query, "id");
                    int columnIndexOrThrow2 = CursorUtil.getColumnIndexOrThrow(query, "chickenId");
                    int columnIndexOrThrow3 = CursorUtil.getColumnIndexOrThrow(query, "date");
                    int columnIndexOrThrow4 = CursorUtil.getColumnIndexOrThrow(query, "saleType");
                    int columnIndexOrThrow5 = CursorUtil.getColumnIndexOrThrow(query, "quantity");
                    int columnIndexOrThrow6 = CursorUtil.getColumnIndexOrThrow(query, "unitPrice");
                    int columnIndexOrThrow7 = CursorUtil.getColumnIndexOrThrow(query, "buyer");
                    ArrayList arrayList = new ArrayList(query.getCount());
                    while (query.moveToNext()) {
                        arrayList.add(new Sale(query.getLong(columnIndexOrThrow), query.isNull(columnIndexOrThrow2) ? null : Long.valueOf(query.getLong(columnIndexOrThrow2)), query.getLong(columnIndexOrThrow3), query.getString(columnIndexOrThrow4), query.getInt(columnIndexOrThrow5), query.getDouble(columnIndexOrThrow6), query.getString(columnIndexOrThrow7)));
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
