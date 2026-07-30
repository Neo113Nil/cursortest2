package org.greenrobot.greendao.async;

import java.util.concurrent.Callable;
import org.greenrobot.greendao.async.AsyncOperation;
import org.greenrobot.greendao.query.j;

/* loaded from: classes5.dex */
public class c {
    private final org.greenrobot.greendao.c daoSession;
    private final a executor = new a();
    private int sessionFlags;

    public c(org.greenrobot.greendao.c cVar) {
        this.daoSession = cVar;
    }

    private <E> AsyncOperation enqueEntityOperation(AsyncOperation.OperationType operationType, Class<E> cls, Object obj, int i8) {
        AsyncOperation asyncOperation = new AsyncOperation(operationType, this.daoSession.getDao(cls), null, obj, i8 | this.sessionFlags);
        this.executor.enqueue(asyncOperation);
        return asyncOperation;
    }

    private AsyncOperation enqueueDatabaseOperation(AsyncOperation.OperationType operationType, Object obj, int i8) {
        AsyncOperation asyncOperation = new AsyncOperation(operationType, null, this.daoSession.getDatabase(), obj, i8 | this.sessionFlags);
        this.executor.enqueue(asyncOperation);
        return asyncOperation;
    }

    private AsyncOperation enqueueEntityOperation(AsyncOperation.OperationType operationType, Object obj, int i8) {
        return enqueEntityOperation(operationType, obj.getClass(), obj, i8);
    }

    public AsyncOperation callInTx(Callable<?> callable) {
        return callInTx(callable, 0);
    }

    public AsyncOperation count(Class<?> cls) {
        return count(cls, 0);
    }

    public AsyncOperation delete(Object obj) {
        return delete(obj, 0);
    }

    public <E> AsyncOperation deleteAll(Class<E> cls) {
        return deleteAll(cls, 0);
    }

    public AsyncOperation deleteByKey(Object obj) {
        return deleteByKey(obj, 0);
    }

    public <E> AsyncOperation deleteInTx(Class<E> cls, E... eArr) {
        return deleteInTx(cls, 0, eArr);
    }

    public b getListener() {
        this.executor.getListener();
        return null;
    }

    public b getListenerMainThread() {
        this.executor.getListenerMainThread();
        return null;
    }

    public int getMaxOperationCountToMerge() {
        return this.executor.getMaxOperationCountToMerge();
    }

    public int getSessionFlags() {
        return this.sessionFlags;
    }

    public int getWaitForMergeMillis() {
        return this.executor.getWaitForMergeMillis();
    }

    public AsyncOperation insert(Object obj) {
        return insert(obj, 0);
    }

    public <E> AsyncOperation insertInTx(Class<E> cls, E... eArr) {
        return insertInTx(cls, 0, eArr);
    }

    public AsyncOperation insertOrReplace(Object obj) {
        return insertOrReplace(obj, 0);
    }

    public <E> AsyncOperation insertOrReplaceInTx(Class<E> cls, E... eArr) {
        return insertOrReplaceInTx(cls, 0, eArr);
    }

    public boolean isCompleted() {
        return this.executor.isCompleted();
    }

    public AsyncOperation load(Class<?> cls, Object obj) {
        return load(cls, obj, 0);
    }

    public AsyncOperation loadAll(Class<?> cls) {
        return loadAll(cls, 0);
    }

    public AsyncOperation queryList(j jVar) {
        return queryList(jVar, 0);
    }

    public AsyncOperation queryUnique(j jVar) {
        return queryUnique(jVar, 0);
    }

    public AsyncOperation refresh(Object obj) {
        return refresh(obj, 0);
    }

    public AsyncOperation runInTx(Runnable runnable) {
        return runInTx(runnable, 0);
    }

    public void setListener(b bVar) {
        this.executor.setListener(bVar);
    }

    public void setListenerMainThread(b bVar) {
        this.executor.setListenerMainThread(bVar);
    }

    public void setMaxOperationCountToMerge(int i8) {
        this.executor.setMaxOperationCountToMerge(i8);
    }

    public void setSessionFlags(int i8) {
        this.sessionFlags = i8;
    }

    public void setWaitForMergeMillis(int i8) {
        this.executor.setWaitForMergeMillis(i8);
    }

    public AsyncOperation update(Object obj) {
        return update(obj, 0);
    }

    public <E> AsyncOperation updateInTx(Class<E> cls, E... eArr) {
        return updateInTx(cls, 0, eArr);
    }

    public void waitForCompletion() {
        this.executor.waitForCompletion();
    }

    public AsyncOperation callInTx(Callable<?> callable, int i8) {
        return enqueueDatabaseOperation(AsyncOperation.OperationType.TransactionCallable, callable, i8);
    }

    public AsyncOperation count(Class<?> cls, int i8) {
        return enqueEntityOperation(AsyncOperation.OperationType.Count, cls, null, i8);
    }

    public AsyncOperation delete(Object obj, int i8) {
        return enqueueEntityOperation(AsyncOperation.OperationType.Delete, obj, i8);
    }

    public <E> AsyncOperation deleteAll(Class<E> cls, int i8) {
        return enqueEntityOperation(AsyncOperation.OperationType.DeleteAll, cls, null, i8);
    }

    public AsyncOperation deleteByKey(Object obj, int i8) {
        return enqueueEntityOperation(AsyncOperation.OperationType.DeleteByKey, obj, i8);
    }

    public <E> AsyncOperation deleteInTx(Class<E> cls, int i8, E... eArr) {
        return enqueEntityOperation(AsyncOperation.OperationType.DeleteInTxArray, cls, eArr, i8);
    }

    public AsyncOperation insert(Object obj, int i8) {
        return enqueueEntityOperation(AsyncOperation.OperationType.Insert, obj, i8);
    }

    public <E> AsyncOperation insertInTx(Class<E> cls, int i8, E... eArr) {
        return enqueEntityOperation(AsyncOperation.OperationType.InsertInTxArray, cls, eArr, i8);
    }

    public AsyncOperation insertOrReplace(Object obj, int i8) {
        return enqueueEntityOperation(AsyncOperation.OperationType.InsertOrReplace, obj, i8);
    }

    public <E> AsyncOperation insertOrReplaceInTx(Class<E> cls, int i8, E... eArr) {
        return enqueEntityOperation(AsyncOperation.OperationType.InsertOrReplaceInTxArray, cls, eArr, i8);
    }

    public AsyncOperation load(Class<?> cls, Object obj, int i8) {
        return enqueEntityOperation(AsyncOperation.OperationType.Load, cls, obj, i8);
    }

    public AsyncOperation loadAll(Class<?> cls, int i8) {
        return enqueEntityOperation(AsyncOperation.OperationType.LoadAll, cls, null, i8);
    }

    public AsyncOperation queryList(j jVar, int i8) {
        return enqueueDatabaseOperation(AsyncOperation.OperationType.QueryList, jVar, i8);
    }

    public AsyncOperation queryUnique(j jVar, int i8) {
        return enqueueDatabaseOperation(AsyncOperation.OperationType.QueryUnique, jVar, i8);
    }

    public AsyncOperation refresh(Object obj, int i8) {
        return enqueueEntityOperation(AsyncOperation.OperationType.Refresh, obj, i8);
    }

    public AsyncOperation runInTx(Runnable runnable, int i8) {
        return enqueueDatabaseOperation(AsyncOperation.OperationType.TransactionRunnable, runnable, i8);
    }

    public AsyncOperation update(Object obj, int i8) {
        return enqueueEntityOperation(AsyncOperation.OperationType.Update, obj, i8);
    }

    public <E> AsyncOperation updateInTx(Class<E> cls, int i8, E... eArr) {
        return enqueEntityOperation(AsyncOperation.OperationType.UpdateInTxArray, cls, eArr, i8);
    }

    public boolean waitForCompletion(int i8) {
        return this.executor.waitForCompletion(i8);
    }

    public <E> AsyncOperation deleteInTx(Class<E> cls, Iterable<E> iterable) {
        return deleteInTx(cls, iterable, 0);
    }

    public <E> AsyncOperation insertInTx(Class<E> cls, Iterable<E> iterable) {
        return insertInTx(cls, iterable, 0);
    }

    public <E> AsyncOperation insertOrReplaceInTx(Class<E> cls, Iterable<E> iterable) {
        return insertOrReplaceInTx(cls, iterable, 0);
    }

    public <E> AsyncOperation updateInTx(Class<E> cls, Iterable<E> iterable) {
        return updateInTx(cls, iterable, 0);
    }

    public <E> AsyncOperation deleteInTx(Class<E> cls, Iterable<E> iterable, int i8) {
        return enqueEntityOperation(AsyncOperation.OperationType.DeleteInTxIterable, cls, iterable, i8);
    }

    public <E> AsyncOperation insertInTx(Class<E> cls, Iterable<E> iterable, int i8) {
        return enqueEntityOperation(AsyncOperation.OperationType.InsertInTxIterable, cls, iterable, i8);
    }

    public <E> AsyncOperation insertOrReplaceInTx(Class<E> cls, Iterable<E> iterable, int i8) {
        return enqueEntityOperation(AsyncOperation.OperationType.InsertOrReplaceInTxIterable, cls, iterable, i8);
    }

    public <E> AsyncOperation updateInTx(Class<E> cls, Iterable<E> iterable, int i8) {
        return enqueEntityOperation(AsyncOperation.OperationType.UpdateInTxIterable, cls, iterable, i8);
    }
}
