package com.chicken.road.cerman.fixs.data;

import android.database.Cursor;
import androidx.autofill.HintConstants;
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
public final class VaccinationDao_Impl implements VaccinationDao {
    private final RoomDatabase __db;
    private final EntityDeletionOrUpdateAdapter<Vaccination> __deletionAdapterOfVaccination;
    private final EntityInsertionAdapter<Vaccination> __insertionAdapterOfVaccination;
    private final EntityDeletionOrUpdateAdapter<Vaccination> __updateAdapterOfVaccination;

    public VaccinationDao_Impl(final RoomDatabase __db) {
        this.__db = __db;
        this.__insertionAdapterOfVaccination = new EntityInsertionAdapter<Vaccination>(__db) { // from class: com.chicken.road.cerman.fixs.data.VaccinationDao_Impl.1
            @Override // androidx.room.SharedSQLiteStatement
            protected String createQuery() {
                return "INSERT OR ABORT INTO `vaccinations` (`id`,`chickenId`,`date`,`name`,`notes`,`dueDate`,`done`) VALUES (nullif(?, 0),?,?,?,?,?,?)";
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // androidx.room.EntityInsertionAdapter
            public void bind(SupportSQLiteStatement supportSQLiteStatement, Vaccination vaccination) {
                supportSQLiteStatement.bindLong(1, vaccination.getId());
                if (vaccination.getChickenId() == null) {
                    supportSQLiteStatement.bindNull(2);
                } else {
                    supportSQLiteStatement.bindLong(2, vaccination.getChickenId().longValue());
                }
                supportSQLiteStatement.bindLong(3, vaccination.getDate());
                supportSQLiteStatement.bindString(4, vaccination.getName());
                supportSQLiteStatement.bindString(5, vaccination.getNotes());
                if (vaccination.getDueDate() == null) {
                    supportSQLiteStatement.bindNull(6);
                } else {
                    supportSQLiteStatement.bindLong(6, vaccination.getDueDate().longValue());
                }
                supportSQLiteStatement.bindLong(7, vaccination.getDone() ? 1L : 0L);
            }
        };
        this.__deletionAdapterOfVaccination = new EntityDeletionOrUpdateAdapter<Vaccination>(__db) { // from class: com.chicken.road.cerman.fixs.data.VaccinationDao_Impl.2
            @Override // androidx.room.EntityDeletionOrUpdateAdapter, androidx.room.SharedSQLiteStatement
            protected String createQuery() {
                return "DELETE FROM `vaccinations` WHERE `id` = ?";
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // androidx.room.EntityDeletionOrUpdateAdapter
            public void bind(final SupportSQLiteStatement statement, final Vaccination entity) {
                statement.bindLong(1, entity.getId());
            }
        };
        this.__updateAdapterOfVaccination = new EntityDeletionOrUpdateAdapter<Vaccination>(__db) { // from class: com.chicken.road.cerman.fixs.data.VaccinationDao_Impl.3
            @Override // androidx.room.EntityDeletionOrUpdateAdapter, androidx.room.SharedSQLiteStatement
            protected String createQuery() {
                return "UPDATE OR ABORT `vaccinations` SET `id` = ?,`chickenId` = ?,`date` = ?,`name` = ?,`notes` = ?,`dueDate` = ?,`done` = ? WHERE `id` = ?";
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // androidx.room.EntityDeletionOrUpdateAdapter
            public void bind(SupportSQLiteStatement supportSQLiteStatement, Vaccination vaccination) {
                supportSQLiteStatement.bindLong(1, vaccination.getId());
                if (vaccination.getChickenId() == null) {
                    supportSQLiteStatement.bindNull(2);
                } else {
                    supportSQLiteStatement.bindLong(2, vaccination.getChickenId().longValue());
                }
                supportSQLiteStatement.bindLong(3, vaccination.getDate());
                supportSQLiteStatement.bindString(4, vaccination.getName());
                supportSQLiteStatement.bindString(5, vaccination.getNotes());
                if (vaccination.getDueDate() == null) {
                    supportSQLiteStatement.bindNull(6);
                } else {
                    supportSQLiteStatement.bindLong(6, vaccination.getDueDate().longValue());
                }
                supportSQLiteStatement.bindLong(7, vaccination.getDone() ? 1L : 0L);
                supportSQLiteStatement.bindLong(8, vaccination.getId());
            }
        };
    }

    @Override // com.chicken.road.cerman.fixs.data.VaccinationDao
    public Object insert(final Vaccination v, final Continuation<? super Long> $completion) {
        return CoroutinesRoom.execute(this.__db, true, new Callable<Long>() { // from class: com.chicken.road.cerman.fixs.data.VaccinationDao_Impl.4
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // java.util.concurrent.Callable
            public Long call() throws Exception {
                VaccinationDao_Impl.this.__db.beginTransaction();
                try {
                    Long valueOf = Long.valueOf(VaccinationDao_Impl.this.__insertionAdapterOfVaccination.insertAndReturnId(v));
                    VaccinationDao_Impl.this.__db.setTransactionSuccessful();
                    return valueOf;
                } finally {
                    VaccinationDao_Impl.this.__db.endTransaction();
                }
            }
        }, $completion);
    }

    @Override // com.chicken.road.cerman.fixs.data.VaccinationDao
    public Object delete(final Vaccination v, final Continuation<? super Unit> $completion) {
        return CoroutinesRoom.execute(this.__db, true, new Callable<Unit>() { // from class: com.chicken.road.cerman.fixs.data.VaccinationDao_Impl.5
            @Override // java.util.concurrent.Callable
            public Unit call() throws Exception {
                VaccinationDao_Impl.this.__db.beginTransaction();
                try {
                    VaccinationDao_Impl.this.__deletionAdapterOfVaccination.handle(v);
                    VaccinationDao_Impl.this.__db.setTransactionSuccessful();
                    return Unit.INSTANCE;
                } finally {
                    VaccinationDao_Impl.this.__db.endTransaction();
                }
            }
        }, $completion);
    }

    @Override // com.chicken.road.cerman.fixs.data.VaccinationDao
    public Object update(final Vaccination v, final Continuation<? super Unit> $completion) {
        return CoroutinesRoom.execute(this.__db, true, new Callable<Unit>() { // from class: com.chicken.road.cerman.fixs.data.VaccinationDao_Impl.6
            @Override // java.util.concurrent.Callable
            public Unit call() throws Exception {
                VaccinationDao_Impl.this.__db.beginTransaction();
                try {
                    VaccinationDao_Impl.this.__updateAdapterOfVaccination.handle(v);
                    VaccinationDao_Impl.this.__db.setTransactionSuccessful();
                    return Unit.INSTANCE;
                } finally {
                    VaccinationDao_Impl.this.__db.endTransaction();
                }
            }
        }, $completion);
    }

    @Override // com.chicken.road.cerman.fixs.data.VaccinationDao
    public Flow<List<Vaccination>> all() {
        final RoomSQLiteQuery acquire = RoomSQLiteQuery.acquire("SELECT * FROM vaccinations ORDER BY date DESC", 0);
        return CoroutinesRoom.createFlow(this.__db, false, new String[]{"vaccinations"}, new Callable<List<Vaccination>>() { // from class: com.chicken.road.cerman.fixs.data.VaccinationDao_Impl.7
            @Override // java.util.concurrent.Callable
            public List<Vaccination> call() throws Exception {
                Cursor query = DBUtil.query(VaccinationDao_Impl.this.__db, acquire, false, null);
                try {
                    int columnIndexOrThrow = CursorUtil.getColumnIndexOrThrow(query, "id");
                    int columnIndexOrThrow2 = CursorUtil.getColumnIndexOrThrow(query, "chickenId");
                    int columnIndexOrThrow3 = CursorUtil.getColumnIndexOrThrow(query, "date");
                    int columnIndexOrThrow4 = CursorUtil.getColumnIndexOrThrow(query, HintConstants.AUTOFILL_HINT_NAME);
                    int columnIndexOrThrow5 = CursorUtil.getColumnIndexOrThrow(query, "notes");
                    int columnIndexOrThrow6 = CursorUtil.getColumnIndexOrThrow(query, "dueDate");
                    int columnIndexOrThrow7 = CursorUtil.getColumnIndexOrThrow(query, "done");
                    ArrayList arrayList = new ArrayList(query.getCount());
                    while (query.moveToNext()) {
                        arrayList.add(new Vaccination(query.getLong(columnIndexOrThrow), query.isNull(columnIndexOrThrow2) ? null : Long.valueOf(query.getLong(columnIndexOrThrow2)), query.getLong(columnIndexOrThrow3), query.getString(columnIndexOrThrow4), query.getString(columnIndexOrThrow5), query.isNull(columnIndexOrThrow6) ? null : Long.valueOf(query.getLong(columnIndexOrThrow6)), query.getInt(columnIndexOrThrow7) != 0));
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

    @Override // com.chicken.road.cerman.fixs.data.VaccinationDao
    public Flow<List<Vaccination>> forChicken(final long chickenId) {
        final RoomSQLiteQuery acquire = RoomSQLiteQuery.acquire("SELECT * FROM vaccinations WHERE chickenId = ? ORDER BY date DESC", 1);
        acquire.bindLong(1, chickenId);
        return CoroutinesRoom.createFlow(this.__db, false, new String[]{"vaccinations"}, new Callable<List<Vaccination>>() { // from class: com.chicken.road.cerman.fixs.data.VaccinationDao_Impl.8
            @Override // java.util.concurrent.Callable
            public List<Vaccination> call() throws Exception {
                Cursor query = DBUtil.query(VaccinationDao_Impl.this.__db, acquire, false, null);
                try {
                    int columnIndexOrThrow = CursorUtil.getColumnIndexOrThrow(query, "id");
                    int columnIndexOrThrow2 = CursorUtil.getColumnIndexOrThrow(query, "chickenId");
                    int columnIndexOrThrow3 = CursorUtil.getColumnIndexOrThrow(query, "date");
                    int columnIndexOrThrow4 = CursorUtil.getColumnIndexOrThrow(query, HintConstants.AUTOFILL_HINT_NAME);
                    int columnIndexOrThrow5 = CursorUtil.getColumnIndexOrThrow(query, "notes");
                    int columnIndexOrThrow6 = CursorUtil.getColumnIndexOrThrow(query, "dueDate");
                    int columnIndexOrThrow7 = CursorUtil.getColumnIndexOrThrow(query, "done");
                    ArrayList arrayList = new ArrayList(query.getCount());
                    while (query.moveToNext()) {
                        arrayList.add(new Vaccination(query.getLong(columnIndexOrThrow), query.isNull(columnIndexOrThrow2) ? null : Long.valueOf(query.getLong(columnIndexOrThrow2)), query.getLong(columnIndexOrThrow3), query.getString(columnIndexOrThrow4), query.getString(columnIndexOrThrow5), query.isNull(columnIndexOrThrow6) ? null : Long.valueOf(query.getLong(columnIndexOrThrow6)), query.getInt(columnIndexOrThrow7) != 0));
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

    @Override // com.chicken.road.cerman.fixs.data.VaccinationDao
    public Object pending(final Continuation<? super List<Vaccination>> $completion) {
        final RoomSQLiteQuery acquire = RoomSQLiteQuery.acquire("SELECT * FROM vaccinations WHERE done = 0 AND dueDate IS NOT NULL", 0);
        return CoroutinesRoom.execute(this.__db, false, DBUtil.createCancellationSignal(), new Callable<List<Vaccination>>() { // from class: com.chicken.road.cerman.fixs.data.VaccinationDao_Impl.9
            @Override // java.util.concurrent.Callable
            public List<Vaccination> call() throws Exception {
                Cursor query = DBUtil.query(VaccinationDao_Impl.this.__db, acquire, false, null);
                try {
                    int columnIndexOrThrow = CursorUtil.getColumnIndexOrThrow(query, "id");
                    int columnIndexOrThrow2 = CursorUtil.getColumnIndexOrThrow(query, "chickenId");
                    int columnIndexOrThrow3 = CursorUtil.getColumnIndexOrThrow(query, "date");
                    int columnIndexOrThrow4 = CursorUtil.getColumnIndexOrThrow(query, HintConstants.AUTOFILL_HINT_NAME);
                    int columnIndexOrThrow5 = CursorUtil.getColumnIndexOrThrow(query, "notes");
                    int columnIndexOrThrow6 = CursorUtil.getColumnIndexOrThrow(query, "dueDate");
                    int columnIndexOrThrow7 = CursorUtil.getColumnIndexOrThrow(query, "done");
                    ArrayList arrayList = new ArrayList(query.getCount());
                    while (query.moveToNext()) {
                        arrayList.add(new Vaccination(query.getLong(columnIndexOrThrow), query.isNull(columnIndexOrThrow2) ? null : Long.valueOf(query.getLong(columnIndexOrThrow2)), query.getLong(columnIndexOrThrow3), query.getString(columnIndexOrThrow4), query.getString(columnIndexOrThrow5), query.isNull(columnIndexOrThrow6) ? null : Long.valueOf(query.getLong(columnIndexOrThrow6)), query.getInt(columnIndexOrThrow7) != 0));
                    }
                    return arrayList;
                } finally {
                    query.close();
                    acquire.release();
                }
            }
        }, $completion);
    }

    public static List<Class<?>> getRequiredConverters() {
        return Collections.emptyList();
    }
}
