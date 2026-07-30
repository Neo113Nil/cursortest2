package org.greenrobot.greendao.async;

import org.greenrobot.greendao.DaoException;

/* loaded from: classes5.dex */
public class AsyncOperation {
    public static final int FLAG_MERGE_TX = 1;
    public static final int FLAG_STOP_QUEUE_ON_EXCEPTION = 2;
    public static final int FLAG_TRACK_CREATOR_STACKTRACE = 4;
    private volatile boolean completed;
    final Exception creatorStacktrace;
    final org.greenrobot.greendao.a dao;
    private final org.greenrobot.greendao.database.a database;
    final int flags;
    volatile int mergedOperationsCount;
    final Object parameter;
    volatile Object result;
    int sequenceNumber;
    volatile Throwable throwable;
    volatile long timeCompleted;
    volatile long timeStarted;
    final OperationType type;

    public enum OperationType {
        Insert,
        InsertInTxIterable,
        InsertInTxArray,
        InsertOrReplace,
        InsertOrReplaceInTxIterable,
        InsertOrReplaceInTxArray,
        Update,
        UpdateInTxIterable,
        UpdateInTxArray,
        Delete,
        DeleteInTxIterable,
        DeleteInTxArray,
        DeleteByKey,
        DeleteAll,
        TransactionRunnable,
        TransactionCallable,
        QueryList,
        QueryUnique,
        Load,
        LoadAll,
        Count,
        Refresh
    }

    AsyncOperation(OperationType operationType, org.greenrobot.greendao.a aVar, org.greenrobot.greendao.database.a aVar2, Object obj, int i8) {
        this.type = operationType;
        this.flags = i8;
        this.dao = aVar;
        this.database = aVar2;
        this.parameter = obj;
        this.creatorStacktrace = (i8 & 4) != 0 ? new Exception("AsyncOperation was created here") : null;
    }

    public Exception getCreatorStacktrace() {
        return this.creatorStacktrace;
    }

    org.greenrobot.greendao.database.a getDatabase() {
        org.greenrobot.greendao.database.a aVar = this.database;
        return aVar != null ? aVar : this.dao.getDatabase();
    }

    public long getDuration() {
        if (this.timeCompleted != 0) {
            return this.timeCompleted - this.timeStarted;
        }
        throw new DaoException("This operation did not yet complete");
    }

    public int getMergedOperationsCount() {
        return this.mergedOperationsCount;
    }

    public Object getParameter() {
        return this.parameter;
    }

    public synchronized Object getResult() {
        try {
            if (!this.completed) {
                waitForCompletion();
            }
            if (this.throwable != null) {
                throw new AsyncDaoException(this, this.throwable);
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.result;
    }

    public int getSequenceNumber() {
        return this.sequenceNumber;
    }

    public Throwable getThrowable() {
        return this.throwable;
    }

    public long getTimeCompleted() {
        return this.timeCompleted;
    }

    public long getTimeStarted() {
        return this.timeStarted;
    }

    public OperationType getType() {
        return this.type;
    }

    public boolean isCompleted() {
        return this.completed;
    }

    public boolean isCompletedSucessfully() {
        return this.completed && this.throwable == null;
    }

    public boolean isFailed() {
        return this.throwable != null;
    }

    public boolean isMergeTx() {
        return (this.flags & 1) != 0;
    }

    boolean isMergeableWith(AsyncOperation asyncOperation) {
        return asyncOperation != null && isMergeTx() && asyncOperation.isMergeTx() && getDatabase() == asyncOperation.getDatabase();
    }

    void reset() {
        this.timeStarted = 0L;
        this.timeCompleted = 0L;
        this.completed = false;
        this.throwable = null;
        this.result = null;
        this.mergedOperationsCount = 0;
    }

    synchronized void setCompleted() {
        this.completed = true;
        notifyAll();
    }

    public void setThrowable(Throwable th) {
        this.throwable = th;
    }

    public synchronized Object waitForCompletion() {
        while (!this.completed) {
            try {
                wait();
            } catch (InterruptedException e8) {
                throw new DaoException("Interrupted while waiting for operation to complete", e8);
            }
        }
        return this.result;
    }

    public synchronized boolean waitForCompletion(int i8) {
        if (!this.completed) {
            try {
                wait(i8);
            } catch (InterruptedException e8) {
                throw new DaoException("Interrupted while waiting for operation to complete", e8);
            }
        }
        return this.completed;
    }
}
