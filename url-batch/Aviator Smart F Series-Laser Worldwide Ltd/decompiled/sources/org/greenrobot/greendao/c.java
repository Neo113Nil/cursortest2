package org.greenrobot.greendao;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import org.greenrobot.greendao.query.k;
import rx.schedulers.Schedulers;

/* loaded from: classes5.dex */
public class c {
    private final org.greenrobot.greendao.database.a db;
    private final Map<Class<?>, a> entityToDao = new HashMap();
    private volatile org.greenrobot.greendao.rx.d rxTxIo;
    private volatile org.greenrobot.greendao.rx.d rxTxPlain;

    public c(org.greenrobot.greendao.database.a aVar) {
        this.db = aVar;
    }

    public <V> V callInTx(Callable<V> callable) {
        this.db.beginTransaction();
        try {
            V call = callable.call();
            this.db.setTransactionSuccessful();
            return call;
        } finally {
            this.db.endTransaction();
        }
    }

    public <V> V callInTxNoException(Callable<V> callable) {
        this.db.beginTransaction();
        try {
            try {
                V call = callable.call();
                this.db.setTransactionSuccessful();
                return call;
            } catch (Exception e8) {
                throw new DaoException("Callable failed", e8);
            }
        } finally {
            this.db.endTransaction();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public <T> void delete(T t7) {
        getDao(t7.getClass()).delete(t7);
    }

    public <T> void deleteAll(Class<T> cls) {
        getDao(cls).deleteAll();
    }

    public Collection<a> getAllDaos() {
        return Collections.unmodifiableCollection(this.entityToDao.values());
    }

    public a getDao(Class<? extends Object> cls) {
        a aVar = this.entityToDao.get(cls);
        if (aVar != null) {
            return aVar;
        }
        throw new DaoException("No DAO registered for " + cls);
    }

    public org.greenrobot.greendao.database.a getDatabase() {
        return this.db;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public <T> long insert(T t7) {
        return getDao(t7.getClass()).insert(t7);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public <T> long insertOrReplace(T t7) {
        return getDao(t7.getClass()).insertOrReplace(t7);
    }

    public <T, K> T load(Class<T> cls, K k8) {
        return (T) getDao(cls).load(k8);
    }

    public <T, K> List<T> loadAll(Class<T> cls) {
        return (List<T>) getDao(cls).loadAll();
    }

    public <T> k queryBuilder(Class<T> cls) {
        return getDao(cls).queryBuilder();
    }

    public <T, K> List<T> queryRaw(Class<T> cls, String str, String... strArr) {
        return (List<T>) getDao(cls).queryRaw(str, strArr);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public <T> void refresh(T t7) {
        getDao(t7.getClass()).refresh(t7);
    }

    protected <T> void registerDao(Class<T> cls, a aVar) {
        this.entityToDao.put(cls, aVar);
    }

    public void runInTx(Runnable runnable) {
        this.db.beginTransaction();
        try {
            runnable.run();
            this.db.setTransactionSuccessful();
        } finally {
            this.db.endTransaction();
        }
    }

    public org.greenrobot.greendao.rx.d rxTx() {
        if (this.rxTxIo == null) {
            this.rxTxIo = new org.greenrobot.greendao.rx.d(this, Schedulers.io());
        }
        return this.rxTxIo;
    }

    public org.greenrobot.greendao.rx.d rxTxPlain() {
        if (this.rxTxPlain == null) {
            this.rxTxPlain = new org.greenrobot.greendao.rx.d(this);
        }
        return this.rxTxPlain;
    }

    public org.greenrobot.greendao.async.c startAsyncSession() {
        return new org.greenrobot.greendao.async.c(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public <T> void update(T t7) {
        getDao(t7.getClass()).update(t7);
    }
}
