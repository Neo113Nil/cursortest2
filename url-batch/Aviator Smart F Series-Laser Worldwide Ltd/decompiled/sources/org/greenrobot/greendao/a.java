package org.greenrobot.greendao;

import android.database.CrossProcessCursor;
import android.database.Cursor;
import android.database.CursorWindow;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteStatement;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import org.greenrobot.greendao.query.j;
import org.greenrobot.greendao.query.k;
import rx.schedulers.Schedulers;

/* loaded from: classes5.dex */
public abstract class a {
    protected final org.greenrobot.greendao.internal.a config;
    protected final org.greenrobot.greendao.database.a db;
    protected final o7.a identityScope;
    protected final o7.b identityScopeLong;
    protected final boolean isStandardSQLite;
    protected final int pkOrdinal;
    private volatile org.greenrobot.greendao.rx.b rxDao;
    private volatile org.greenrobot.greendao.rx.b rxDaoPlain;
    protected final c session;
    protected final org.greenrobot.greendao.internal.e statements;

    public a(org.greenrobot.greendao.internal.a aVar) {
        this(aVar, null);
    }

    private void deleteByKeyInsideSynchronized(Object obj, org.greenrobot.greendao.database.c cVar) {
        if (obj instanceof Long) {
            cVar.bindLong(1, ((Long) obj).longValue());
        } else {
            if (obj == null) {
                throw new DaoException("Cannot delete entity, key is null");
            }
            cVar.bindString(1, obj.toString());
        }
        cVar.execute();
    }

    private void deleteInTxInternal(Iterable<Object> iterable, Iterable<Object> iterable2) {
        ArrayList arrayList;
        o7.a aVar;
        assertSinglePk();
        org.greenrobot.greendao.database.c deleteStatement = this.statements.getDeleteStatement();
        this.db.beginTransaction();
        try {
            synchronized (deleteStatement) {
                o7.a aVar2 = this.identityScope;
                if (aVar2 != null) {
                    aVar2.lock();
                    arrayList = new ArrayList();
                } else {
                    arrayList = null;
                }
                if (iterable != null) {
                    try {
                        Iterator<Object> it = iterable.iterator();
                        while (it.hasNext()) {
                            Object keyVerified = getKeyVerified(it.next());
                            deleteByKeyInsideSynchronized(keyVerified, deleteStatement);
                            if (arrayList != null) {
                                arrayList.add(keyVerified);
                            }
                        }
                    } catch (Throwable th) {
                        o7.a aVar3 = this.identityScope;
                        if (aVar3 != null) {
                            aVar3.unlock();
                        }
                        throw th;
                    }
                }
                if (iterable2 != null) {
                    for (Object obj : iterable2) {
                        deleteByKeyInsideSynchronized(obj, deleteStatement);
                        if (arrayList != null) {
                            arrayList.add(obj);
                        }
                    }
                }
                o7.a aVar4 = this.identityScope;
                if (aVar4 != null) {
                    aVar4.unlock();
                }
            }
            this.db.setTransactionSuccessful();
            if (arrayList != null && (aVar = this.identityScope) != null) {
                aVar.remove((Iterable<Object>) arrayList);
            }
        } finally {
            this.db.endTransaction();
        }
    }

    private long executeInsert(Object obj, org.greenrobot.greendao.database.c cVar, boolean z7) {
        long insertInsideTx;
        if (this.db.isDbLockedByCurrentThread()) {
            insertInsideTx = insertInsideTx(obj, cVar);
        } else {
            this.db.beginTransaction();
            try {
                insertInsideTx = insertInsideTx(obj, cVar);
                this.db.setTransactionSuccessful();
            } finally {
                this.db.endTransaction();
            }
        }
        if (z7) {
            updateKeyAfterInsertAndAttach(obj, insertInsideTx, true);
        }
        return insertInsideTx;
    }

    private void executeInsertInTx(org.greenrobot.greendao.database.c cVar, Iterable<Object> iterable, boolean z7) {
        this.db.beginTransaction();
        try {
            synchronized (cVar) {
                o7.a aVar = this.identityScope;
                if (aVar != null) {
                    aVar.lock();
                }
                try {
                    if (this.isStandardSQLite) {
                        SQLiteStatement sQLiteStatement = (SQLiteStatement) cVar.getRawStatement();
                        for (Object obj : iterable) {
                            bindValues(sQLiteStatement, obj);
                            if (z7) {
                                updateKeyAfterInsertAndAttach(obj, sQLiteStatement.executeInsert(), false);
                            } else {
                                sQLiteStatement.execute();
                            }
                        }
                    } else {
                        for (Object obj2 : iterable) {
                            bindValues(cVar, obj2);
                            if (z7) {
                                updateKeyAfterInsertAndAttach(obj2, cVar.executeInsert(), false);
                            } else {
                                cVar.execute();
                            }
                        }
                    }
                    o7.a aVar2 = this.identityScope;
                    if (aVar2 != null) {
                        aVar2.unlock();
                    }
                } catch (Throwable th) {
                    o7.a aVar3 = this.identityScope;
                    if (aVar3 != null) {
                        aVar3.unlock();
                    }
                    throw th;
                }
            }
            this.db.setTransactionSuccessful();
        } finally {
            this.db.endTransaction();
        }
    }

    private long insertInsideTx(Object obj, org.greenrobot.greendao.database.c cVar) {
        synchronized (cVar) {
            try {
                if (!this.isStandardSQLite) {
                    bindValues(cVar, obj);
                    return cVar.executeInsert();
                }
                SQLiteStatement sQLiteStatement = (SQLiteStatement) cVar.getRawStatement();
                bindValues(sQLiteStatement, obj);
                return sQLiteStatement.executeInsert();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private void loadAllUnlockOnWindowBounds(Cursor cursor, CursorWindow cursorWindow, List<Object> list) {
        int startPosition = cursorWindow.getStartPosition() + cursorWindow.getNumRows();
        int i8 = 0;
        while (true) {
            list.add(loadCurrent(cursor, 0, false));
            if (i8 + 1 >= startPosition) {
                CursorWindow moveToNextUnlocked = moveToNextUnlocked(cursor);
                if (moveToNextUnlocked == null) {
                    return;
                } else {
                    startPosition = moveToNextUnlocked.getStartPosition() + moveToNextUnlocked.getNumRows();
                }
            } else if (!cursor.moveToNext()) {
                return;
            }
            i8 += 2;
        }
    }

    private CursorWindow moveToNextUnlocked(Cursor cursor) {
        this.identityScope.unlock();
        try {
            if (cursor.moveToNext()) {
                return ((CrossProcessCursor) cursor).getWindow();
            }
            this.identityScope.lock();
            return null;
        } finally {
            this.identityScope.lock();
        }
    }

    protected void assertSinglePk() {
        if (this.config.pkColumns.length == 1) {
            return;
        }
        throw new DaoException(this + " (" + this.config.tablename + ") does not have a single-column primary key");
    }

    protected void attachEntity(Object obj) {
    }

    protected abstract void bindValues(SQLiteStatement sQLiteStatement, Object obj);

    protected abstract void bindValues(org.greenrobot.greendao.database.c cVar, Object obj);

    public long count() {
        return this.statements.getCountStatement().simpleQueryForLong();
    }

    public void delete(Object obj) {
        assertSinglePk();
        deleteByKey(getKeyVerified(obj));
    }

    public void deleteAll() {
        this.db.execSQL("DELETE FROM '" + this.config.tablename + "'");
        o7.a aVar = this.identityScope;
        if (aVar != null) {
            aVar.clear();
        }
    }

    public void deleteByKey(Object obj) {
        assertSinglePk();
        org.greenrobot.greendao.database.c deleteStatement = this.statements.getDeleteStatement();
        if (this.db.isDbLockedByCurrentThread()) {
            synchronized (deleteStatement) {
                deleteByKeyInsideSynchronized(obj, deleteStatement);
            }
        } else {
            this.db.beginTransaction();
            try {
                synchronized (deleteStatement) {
                    deleteByKeyInsideSynchronized(obj, deleteStatement);
                }
                this.db.setTransactionSuccessful();
            } finally {
                this.db.endTransaction();
            }
        }
        o7.a aVar = this.identityScope;
        if (aVar != null) {
            aVar.remove(obj);
        }
    }

    public void deleteByKeyInTx(Iterable<Object> iterable) {
        deleteInTxInternal(null, iterable);
    }

    public void deleteInTx(Iterable<Object> iterable) {
        deleteInTxInternal(iterable, null);
    }

    public boolean detach(Object obj) {
        if (this.identityScope == null) {
            return false;
        }
        return this.identityScope.detach(getKeyVerified(obj), obj);
    }

    public void detachAll() {
        o7.a aVar = this.identityScope;
        if (aVar != null) {
            aVar.clear();
        }
    }

    public String[] getAllColumns() {
        return this.config.allColumns;
    }

    public org.greenrobot.greendao.database.a getDatabase() {
        return this.db;
    }

    protected abstract Object getKey(Object obj);

    protected Object getKeyVerified(Object obj) {
        Object key = getKey(obj);
        if (key != null) {
            return key;
        }
        if (obj == null) {
            throw new NullPointerException("Entity may not be null");
        }
        throw new DaoException("Entity has no key");
    }

    public String[] getNonPkColumns() {
        return this.config.nonPkColumns;
    }

    public String[] getPkColumns() {
        return this.config.pkColumns;
    }

    public f getPkProperty() {
        return this.config.pkProperty;
    }

    public f[] getProperties() {
        return this.config.properties;
    }

    public c getSession() {
        return this.session;
    }

    org.greenrobot.greendao.internal.e getStatements() {
        return this.config.statements;
    }

    public String getTablename() {
        return this.config.tablename;
    }

    protected abstract boolean hasKey(Object obj);

    public long insert(Object obj) {
        return executeInsert(obj, this.statements.getInsertStatement(), true);
    }

    public void insertInTx(Iterable<Object> iterable) {
        insertInTx(iterable, isEntityUpdateable());
    }

    public long insertOrReplace(Object obj) {
        return executeInsert(obj, this.statements.getInsertOrReplaceStatement(), true);
    }

    public void insertOrReplaceInTx(Iterable<Object> iterable, boolean z7) {
        executeInsertInTx(this.statements.getInsertOrReplaceStatement(), iterable, z7);
    }

    public long insertWithoutSettingPk(Object obj) {
        return executeInsert(obj, this.statements.getInsertOrReplaceStatement(), false);
    }

    protected abstract boolean isEntityUpdateable();

    public Object load(Object obj) {
        Object obj2;
        assertSinglePk();
        if (obj == null) {
            return null;
        }
        o7.a aVar = this.identityScope;
        return (aVar == null || (obj2 = aVar.get(obj)) == null) ? loadUniqueAndCloseCursor(this.db.rawQuery(this.statements.getSelectByKey(), new String[]{obj.toString()})) : obj2;
    }

    public List<Object> loadAll() {
        return loadAllAndCloseCursor(this.db.rawQuery(this.statements.getSelectAll(), null));
    }

    protected List<Object> loadAllAndCloseCursor(Cursor cursor) {
        try {
            return loadAllFromCursor(cursor);
        } finally {
            cursor.close();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0081  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected List<Object> loadAllFromCursor(Cursor cursor) {
        CursorWindow cursorWindow;
        boolean z7;
        o7.a aVar;
        int count = cursor.getCount();
        if (count == 0) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList(count);
        if (cursor instanceof CrossProcessCursor) {
            cursorWindow = ((CrossProcessCursor) cursor).getWindow();
            if (cursorWindow != null) {
                if (cursorWindow.getNumRows() == count) {
                    cursor = new org.greenrobot.greendao.internal.b(cursorWindow);
                    z7 = true;
                    if (cursor.moveToFirst()) {
                        o7.a aVar2 = this.identityScope;
                        if (aVar2 != null) {
                            aVar2.lock();
                            this.identityScope.reserveRoom(count);
                        }
                        if (!z7 && cursorWindow != null) {
                            try {
                                if (this.identityScope != null) {
                                    loadAllUnlockOnWindowBounds(cursor, cursorWindow, arrayList);
                                    aVar = this.identityScope;
                                    if (aVar != null) {
                                        aVar.unlock();
                                    }
                                }
                            } catch (Throwable th) {
                                o7.a aVar3 = this.identityScope;
                                if (aVar3 != null) {
                                    aVar3.unlock();
                                }
                                throw th;
                            }
                        }
                        do {
                            arrayList.add(loadCurrent(cursor, 0, false));
                        } while (cursor.moveToNext());
                        aVar = this.identityScope;
                        if (aVar != null) {
                        }
                    }
                    return arrayList;
                }
                d.d("Window vs. result size: " + cursorWindow.getNumRows() + "/" + count);
            }
        } else {
            cursorWindow = null;
        }
        z7 = false;
        if (cursor.moveToFirst()) {
        }
        return arrayList;
    }

    public Object loadByRowId(long j8) {
        return loadUniqueAndCloseCursor(this.db.rawQuery(this.statements.getSelectByRowId(), new String[]{Long.toString(j8)}));
    }

    protected final Object loadCurrent(Cursor cursor, int i8, boolean z7) {
        if (this.identityScopeLong != null) {
            if (i8 != 0 && cursor.isNull(this.pkOrdinal + i8)) {
                return null;
            }
            long j8 = cursor.getLong(this.pkOrdinal + i8);
            o7.b bVar = this.identityScopeLong;
            Object obj = z7 ? bVar.get2(j8) : bVar.get2NoLock(j8);
            if (obj != null) {
                return obj;
            }
            Object readEntity = readEntity(cursor, i8);
            attachEntity(readEntity);
            if (z7) {
                this.identityScopeLong.put2(j8, readEntity);
            } else {
                this.identityScopeLong.put2NoLock(j8, readEntity);
            }
            return readEntity;
        }
        if (this.identityScope == null) {
            if (i8 != 0 && readKey(cursor, i8) == null) {
                return null;
            }
            Object readEntity2 = readEntity(cursor, i8);
            attachEntity(readEntity2);
            return readEntity2;
        }
        Object readKey = readKey(cursor, i8);
        if (i8 != 0 && readKey == null) {
            return null;
        }
        o7.a aVar = this.identityScope;
        Object noLock = z7 ? aVar.get(readKey) : aVar.getNoLock(readKey);
        if (noLock != null) {
            return noLock;
        }
        Object readEntity3 = readEntity(cursor, i8);
        attachEntity(readKey, readEntity3, z7);
        return readEntity3;
    }

    protected final <O> O loadCurrentOther(a aVar, Cursor cursor, int i8) {
        return (O) aVar.loadCurrent(cursor, i8, true);
    }

    protected Object loadUnique(Cursor cursor) {
        if (!cursor.moveToFirst()) {
            return null;
        }
        if (cursor.isLast()) {
            return loadCurrent(cursor, 0, true);
        }
        throw new DaoException("Expected unique result, but count was " + cursor.getCount());
    }

    protected Object loadUniqueAndCloseCursor(Cursor cursor) {
        try {
            return loadUnique(cursor);
        } finally {
            cursor.close();
        }
    }

    public k queryBuilder() {
        return k.internalCreate(this);
    }

    public List<Object> queryRaw(String str, String... strArr) {
        return loadAllAndCloseCursor(this.db.rawQuery(this.statements.getSelectAll() + str, strArr));
    }

    public j queryRawCreate(String str, Object... objArr) {
        return queryRawCreateListArgs(str, Arrays.asList(objArr));
    }

    public j queryRawCreateListArgs(String str, Collection<Object> collection) {
        return j.internalCreate(this, this.statements.getSelectAll() + str, collection.toArray());
    }

    protected abstract Object readEntity(Cursor cursor, int i8);

    protected abstract void readEntity(Cursor cursor, Object obj, int i8);

    protected abstract Object readKey(Cursor cursor, int i8);

    public void refresh(Object obj) {
        assertSinglePk();
        Object keyVerified = getKeyVerified(obj);
        Cursor rawQuery = this.db.rawQuery(this.statements.getSelectByKey(), new String[]{keyVerified.toString()});
        try {
            if (!rawQuery.moveToFirst()) {
                throw new DaoException("Entity does not exist in the database anymore: " + obj.getClass() + " with key " + keyVerified);
            }
            if (rawQuery.isLast()) {
                readEntity(rawQuery, obj, 0);
                attachEntity(keyVerified, obj, true);
            } else {
                throw new DaoException("Expected unique result, but count was " + rawQuery.getCount());
            }
        } finally {
            rawQuery.close();
        }
    }

    public org.greenrobot.greendao.rx.b rx() {
        if (this.rxDao == null) {
            this.rxDao = new org.greenrobot.greendao.rx.b(this, Schedulers.io());
        }
        return this.rxDao;
    }

    public org.greenrobot.greendao.rx.b rxPlain() {
        if (this.rxDaoPlain == null) {
            this.rxDaoPlain = new org.greenrobot.greendao.rx.b(this);
        }
        return this.rxDaoPlain;
    }

    public void save(Object obj) {
        if (hasKey(obj)) {
            update(obj);
        } else {
            insert(obj);
        }
    }

    public void saveInTx(Object... objArr) {
        saveInTx(Arrays.asList(objArr));
    }

    public void update(Object obj) {
        assertSinglePk();
        org.greenrobot.greendao.database.c updateStatement = this.statements.getUpdateStatement();
        if (this.db.isDbLockedByCurrentThread()) {
            synchronized (updateStatement) {
                try {
                    if (this.isStandardSQLite) {
                        updateInsideSynchronized(obj, (SQLiteStatement) updateStatement.getRawStatement(), true);
                    } else {
                        updateInsideSynchronized(obj, updateStatement, true);
                    }
                } finally {
                }
            }
            return;
        }
        this.db.beginTransaction();
        try {
            synchronized (updateStatement) {
                updateInsideSynchronized(obj, updateStatement, true);
            }
            this.db.setTransactionSuccessful();
        } finally {
            this.db.endTransaction();
        }
    }

    public void updateInTx(Iterable<Object> iterable) {
        org.greenrobot.greendao.database.c updateStatement = this.statements.getUpdateStatement();
        this.db.beginTransaction();
        try {
            synchronized (updateStatement) {
                o7.a aVar = this.identityScope;
                if (aVar != null) {
                    aVar.lock();
                }
                try {
                    if (this.isStandardSQLite) {
                        SQLiteStatement sQLiteStatement = (SQLiteStatement) updateStatement.getRawStatement();
                        Iterator<Object> it = iterable.iterator();
                        while (it.hasNext()) {
                            updateInsideSynchronized(it.next(), sQLiteStatement, false);
                        }
                    } else {
                        Iterator<Object> it2 = iterable.iterator();
                        while (it2.hasNext()) {
                            updateInsideSynchronized(it2.next(), updateStatement, false);
                        }
                    }
                    o7.a aVar2 = this.identityScope;
                    if (aVar2 != null) {
                        aVar2.unlock();
                    }
                } catch (Throwable th) {
                    o7.a aVar3 = this.identityScope;
                    if (aVar3 != null) {
                        aVar3.unlock();
                    }
                    throw th;
                }
            }
            this.db.setTransactionSuccessful();
            this.db.endTransaction();
            e = null;
        } catch (RuntimeException e8) {
            e = e8;
            try {
                this.db.endTransaction();
            } catch (RuntimeException e9) {
                d.w("Could not end transaction (rethrowing initial exception)", e9);
                throw e;
            }
        } catch (Throwable th2) {
            this.db.endTransaction();
            throw th2;
        }
        if (e != null) {
            throw e;
        }
    }

    protected void updateInsideSynchronized(Object obj, org.greenrobot.greendao.database.c cVar, boolean z7) {
        bindValues(cVar, obj);
        int length = this.config.allColumns.length + 1;
        Object key = getKey(obj);
        if (key instanceof Long) {
            cVar.bindLong(length, ((Long) key).longValue());
        } else {
            if (key == null) {
                throw new DaoException("Cannot update entity without key - was it inserted before?");
            }
            cVar.bindString(length, key.toString());
        }
        cVar.execute();
        attachEntity(key, obj, z7);
    }

    protected abstract Object updateKeyAfterInsert(Object obj, long j8);

    protected void updateKeyAfterInsertAndAttach(Object obj, long j8, boolean z7) {
        if (j8 != -1) {
            attachEntity(updateKeyAfterInsert(obj, j8), obj, z7);
        } else {
            d.w("Could not insert row (executeInsert returned -1)");
        }
    }

    public a(org.greenrobot.greendao.internal.a aVar, c cVar) {
        this.config = aVar;
        this.session = cVar;
        org.greenrobot.greendao.database.a aVar2 = aVar.db;
        this.db = aVar2;
        this.isStandardSQLite = aVar2.getRawDatabase() instanceof SQLiteDatabase;
        o7.a identityScope = aVar.getIdentityScope();
        this.identityScope = identityScope;
        if (identityScope instanceof o7.b) {
            this.identityScopeLong = (o7.b) identityScope;
        } else {
            this.identityScopeLong = null;
        }
        this.statements = aVar.statements;
        f fVar = aVar.pkProperty;
        this.pkOrdinal = fVar != null ? fVar.ordinal : -1;
    }

    protected final void attachEntity(Object obj, Object obj2, boolean z7) {
        attachEntity(obj2);
        o7.a aVar = this.identityScope;
        if (aVar == null || obj == null) {
            return;
        }
        if (z7) {
            aVar.put(obj, obj2);
        } else {
            aVar.putNoLock(obj, obj2);
        }
    }

    public void deleteByKeyInTx(Object... objArr) {
        deleteInTxInternal(null, Arrays.asList(objArr));
    }

    public void deleteInTx(Object... objArr) {
        deleteInTxInternal(Arrays.asList(objArr), null);
    }

    public void insertInTx(Object... objArr) {
        insertInTx(Arrays.asList(objArr), isEntityUpdateable());
    }

    public void saveInTx(Iterable<Object> iterable) {
        Iterator<Object> it = iterable.iterator();
        int i8 = 0;
        int i9 = 0;
        while (it.hasNext()) {
            if (hasKey(it.next())) {
                i8++;
            } else {
                i9++;
            }
        }
        if (i8 <= 0 || i9 <= 0) {
            if (i9 > 0) {
                insertInTx(iterable);
                return;
            } else {
                if (i8 > 0) {
                    updateInTx(iterable);
                    return;
                }
                return;
            }
        }
        ArrayList arrayList = new ArrayList(i8);
        ArrayList arrayList2 = new ArrayList(i9);
        for (Object obj : iterable) {
            if (hasKey(obj)) {
                arrayList.add(obj);
            } else {
                arrayList2.add(obj);
            }
        }
        this.db.beginTransaction();
        try {
            updateInTx(arrayList);
            insertInTx(arrayList2);
            this.db.setTransactionSuccessful();
        } finally {
            this.db.endTransaction();
        }
    }

    public void insertInTx(Iterable<Object> iterable, boolean z7) {
        executeInsertInTx(this.statements.getInsertStatement(), iterable, z7);
    }

    public void insertOrReplaceInTx(Iterable<Object> iterable) {
        insertOrReplaceInTx(iterable, isEntityUpdateable());
    }

    public void insertOrReplaceInTx(Object... objArr) {
        insertOrReplaceInTx(Arrays.asList(objArr), isEntityUpdateable());
    }

    protected void updateInsideSynchronized(Object obj, SQLiteStatement sQLiteStatement, boolean z7) {
        bindValues(sQLiteStatement, obj);
        int length = this.config.allColumns.length + 1;
        Object key = getKey(obj);
        if (key instanceof Long) {
            sQLiteStatement.bindLong(length, ((Long) key).longValue());
        } else if (key != null) {
            sQLiteStatement.bindString(length, key.toString());
        } else {
            throw new DaoException("Cannot update entity without key - was it inserted before?");
        }
        sQLiteStatement.execute();
        attachEntity(key, obj, z7);
    }

    public void updateInTx(Object... objArr) {
        updateInTx(Arrays.asList(objArr));
    }
}
