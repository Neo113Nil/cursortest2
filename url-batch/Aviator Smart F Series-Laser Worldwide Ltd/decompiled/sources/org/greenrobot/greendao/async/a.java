package org.greenrobot.greendao.async;

import android.os.Handler;
import android.os.Message;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
import org.greenrobot.greendao.DaoException;
import org.greenrobot.greendao.async.AsyncOperation;
import org.greenrobot.greendao.d;
import org.greenrobot.greendao.query.j;

/* loaded from: classes5.dex */
class a implements Runnable, Handler.Callback {
    private static ExecutorService executorService = Executors.newCachedThreadPool();
    private int countOperationsCompleted;
    private int countOperationsEnqueued;
    private volatile boolean executorRunning;
    private Handler handlerMainThread;
    private int lastSequenceNumber;
    private volatile b listener;
    private volatile b listenerMainThread;
    private final BlockingQueue<AsyncOperation> queue = new LinkedBlockingQueue();
    private volatile int maxOperationCountToMerge = 50;
    private volatile int waitForMergeMillis = 50;

    /* renamed from: org.greenrobot.greendao.async.a$a, reason: collision with other inner class name */
    static /* synthetic */ class C0399a {
        static final /* synthetic */ int[] $SwitchMap$org$greenrobot$greendao$async$AsyncOperation$OperationType;

        static {
            int[] iArr = new int[AsyncOperation.OperationType.values().length];
            $SwitchMap$org$greenrobot$greendao$async$AsyncOperation$OperationType = iArr;
            try {
                iArr[AsyncOperation.OperationType.Delete.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$org$greenrobot$greendao$async$AsyncOperation$OperationType[AsyncOperation.OperationType.DeleteInTxIterable.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$org$greenrobot$greendao$async$AsyncOperation$OperationType[AsyncOperation.OperationType.DeleteInTxArray.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$org$greenrobot$greendao$async$AsyncOperation$OperationType[AsyncOperation.OperationType.Insert.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$org$greenrobot$greendao$async$AsyncOperation$OperationType[AsyncOperation.OperationType.InsertInTxIterable.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$org$greenrobot$greendao$async$AsyncOperation$OperationType[AsyncOperation.OperationType.InsertInTxArray.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$org$greenrobot$greendao$async$AsyncOperation$OperationType[AsyncOperation.OperationType.InsertOrReplace.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                $SwitchMap$org$greenrobot$greendao$async$AsyncOperation$OperationType[AsyncOperation.OperationType.InsertOrReplaceInTxIterable.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                $SwitchMap$org$greenrobot$greendao$async$AsyncOperation$OperationType[AsyncOperation.OperationType.InsertOrReplaceInTxArray.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                $SwitchMap$org$greenrobot$greendao$async$AsyncOperation$OperationType[AsyncOperation.OperationType.Update.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                $SwitchMap$org$greenrobot$greendao$async$AsyncOperation$OperationType[AsyncOperation.OperationType.UpdateInTxIterable.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                $SwitchMap$org$greenrobot$greendao$async$AsyncOperation$OperationType[AsyncOperation.OperationType.UpdateInTxArray.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                $SwitchMap$org$greenrobot$greendao$async$AsyncOperation$OperationType[AsyncOperation.OperationType.TransactionRunnable.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                $SwitchMap$org$greenrobot$greendao$async$AsyncOperation$OperationType[AsyncOperation.OperationType.TransactionCallable.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                $SwitchMap$org$greenrobot$greendao$async$AsyncOperation$OperationType[AsyncOperation.OperationType.QueryList.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                $SwitchMap$org$greenrobot$greendao$async$AsyncOperation$OperationType[AsyncOperation.OperationType.QueryUnique.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                $SwitchMap$org$greenrobot$greendao$async$AsyncOperation$OperationType[AsyncOperation.OperationType.DeleteByKey.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                $SwitchMap$org$greenrobot$greendao$async$AsyncOperation$OperationType[AsyncOperation.OperationType.DeleteAll.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                $SwitchMap$org$greenrobot$greendao$async$AsyncOperation$OperationType[AsyncOperation.OperationType.Load.ordinal()] = 19;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                $SwitchMap$org$greenrobot$greendao$async$AsyncOperation$OperationType[AsyncOperation.OperationType.LoadAll.ordinal()] = 20;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                $SwitchMap$org$greenrobot$greendao$async$AsyncOperation$OperationType[AsyncOperation.OperationType.Count.ordinal()] = 21;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                $SwitchMap$org$greenrobot$greendao$async$AsyncOperation$OperationType[AsyncOperation.OperationType.Refresh.ordinal()] = 22;
            } catch (NoSuchFieldError unused22) {
            }
        }
    }

    a() {
    }

    private void executeOperation(AsyncOperation asyncOperation) {
        asyncOperation.timeStarted = System.currentTimeMillis();
        try {
            switch (C0399a.$SwitchMap$org$greenrobot$greendao$async$AsyncOperation$OperationType[asyncOperation.type.ordinal()]) {
                case 1:
                    asyncOperation.dao.delete(asyncOperation.parameter);
                    break;
                case 2:
                    asyncOperation.dao.deleteInTx((Iterable<Object>) asyncOperation.parameter);
                    break;
                case 3:
                    asyncOperation.dao.deleteInTx((Object[]) asyncOperation.parameter);
                    break;
                case 4:
                    asyncOperation.dao.insert(asyncOperation.parameter);
                    break;
                case 5:
                    asyncOperation.dao.insertInTx((Iterable<Object>) asyncOperation.parameter);
                    break;
                case 6:
                    asyncOperation.dao.insertInTx((Object[]) asyncOperation.parameter);
                    break;
                case 7:
                    asyncOperation.dao.insertOrReplace(asyncOperation.parameter);
                    break;
                case 8:
                    asyncOperation.dao.insertOrReplaceInTx((Iterable<Object>) asyncOperation.parameter);
                    break;
                case 9:
                    asyncOperation.dao.insertOrReplaceInTx((Object[]) asyncOperation.parameter);
                    break;
                case 10:
                    asyncOperation.dao.update(asyncOperation.parameter);
                    break;
                case 11:
                    asyncOperation.dao.updateInTx((Iterable<Object>) asyncOperation.parameter);
                    break;
                case 12:
                    asyncOperation.dao.updateInTx((Object[]) asyncOperation.parameter);
                    break;
                case 13:
                    executeTransactionRunnable(asyncOperation);
                    break;
                case 14:
                    executeTransactionCallable(asyncOperation);
                    break;
                case 15:
                    asyncOperation.result = ((j) asyncOperation.parameter).forCurrentThread().list();
                    break;
                case 16:
                    asyncOperation.result = ((j) asyncOperation.parameter).forCurrentThread().unique();
                    break;
                case 17:
                    asyncOperation.dao.deleteByKey(asyncOperation.parameter);
                    break;
                case 18:
                    asyncOperation.dao.deleteAll();
                    break;
                case 19:
                    asyncOperation.result = asyncOperation.dao.load(asyncOperation.parameter);
                    break;
                case 20:
                    asyncOperation.result = asyncOperation.dao.loadAll();
                    break;
                case 21:
                    asyncOperation.result = Long.valueOf(asyncOperation.dao.count());
                    break;
                case 22:
                    asyncOperation.dao.refresh(asyncOperation.parameter);
                    break;
                default:
                    throw new DaoException("Unsupported operation: " + asyncOperation.type);
            }
        } catch (Throwable th) {
            asyncOperation.throwable = th;
        }
        asyncOperation.timeCompleted = System.currentTimeMillis();
    }

    private void executeOperationAndPostCompleted(AsyncOperation asyncOperation) {
        executeOperation(asyncOperation);
        handleOperationCompleted(asyncOperation);
    }

    private void executeTransactionCallable(AsyncOperation asyncOperation) {
        org.greenrobot.greendao.database.a database = asyncOperation.getDatabase();
        database.beginTransaction();
        try {
            asyncOperation.result = ((Callable) asyncOperation.parameter).call();
            database.setTransactionSuccessful();
        } finally {
            database.endTransaction();
        }
    }

    private void executeTransactionRunnable(AsyncOperation asyncOperation) {
        org.greenrobot.greendao.database.a database = asyncOperation.getDatabase();
        database.beginTransaction();
        try {
            ((Runnable) asyncOperation.parameter).run();
            database.setTransactionSuccessful();
        } finally {
            database.endTransaction();
        }
    }

    private void handleOperationCompleted(AsyncOperation asyncOperation) {
        asyncOperation.setCompleted();
        synchronized (this) {
            try {
                int i8 = this.countOperationsCompleted + 1;
                this.countOperationsCompleted = i8;
                if (i8 == this.countOperationsEnqueued) {
                    notifyAll();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private void mergeTxAndExecute(AsyncOperation asyncOperation, AsyncOperation asyncOperation2) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(asyncOperation);
        arrayList.add(asyncOperation2);
        org.greenrobot.greendao.database.a database = asyncOperation.getDatabase();
        database.beginTransaction();
        boolean z7 = false;
        for (int i8 = 0; i8 < arrayList.size(); i8++) {
            try {
                AsyncOperation asyncOperation3 = (AsyncOperation) arrayList.get(i8);
                executeOperation(asyncOperation3);
                if (!asyncOperation3.isFailed()) {
                    if (i8 == arrayList.size() - 1) {
                        AsyncOperation peek = this.queue.peek();
                        if (i8 >= this.maxOperationCountToMerge || !asyncOperation3.isMergeableWith(peek)) {
                            database.setTransactionSuccessful();
                            z7 = true;
                            break;
                        } else {
                            AsyncOperation remove = this.queue.remove();
                            if (remove != peek) {
                                throw new DaoException("Internal error: peeked op did not match removed op");
                            }
                            arrayList.add(remove);
                        }
                    }
                }
            } finally {
                try {
                    database.endTransaction();
                } catch (RuntimeException e8) {
                    d.i("Async transaction could not be ended, success so far was: false", e8);
                }
            }
        }
        try {
            if (z7) {
                int size = arrayList.size();
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    AsyncOperation asyncOperation4 = (AsyncOperation) it.next();
                    asyncOperation4.mergedOperationsCount = size;
                    handleOperationCompleted(asyncOperation4);
                }
                return;
            }
        } catch (RuntimeException e82) {
        }
        d.i("Reverted merged transaction because one of the operations failed. Executing operations one by one instead...");
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            AsyncOperation asyncOperation5 = (AsyncOperation) it2.next();
            asyncOperation5.reset();
            executeOperationAndPostCompleted(asyncOperation5);
        }
    }

    public void enqueue(AsyncOperation asyncOperation) {
        synchronized (this) {
            try {
                int i8 = this.lastSequenceNumber + 1;
                this.lastSequenceNumber = i8;
                asyncOperation.sequenceNumber = i8;
                this.queue.add(asyncOperation);
                this.countOperationsEnqueued++;
                if (!this.executorRunning) {
                    this.executorRunning = true;
                    executorService.execute(this);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public b getListener() {
        return null;
    }

    public b getListenerMainThread() {
        return null;
    }

    public int getMaxOperationCountToMerge() {
        return this.maxOperationCountToMerge;
    }

    public int getWaitForMergeMillis() {
        return this.waitForMergeMillis;
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        return false;
    }

    public synchronized boolean isCompleted() {
        return this.countOperationsEnqueued == this.countOperationsCompleted;
    }

    @Override // java.lang.Runnable
    public void run() {
        AsyncOperation poll;
        while (true) {
            try {
                try {
                    AsyncOperation poll2 = this.queue.poll(1L, TimeUnit.SECONDS);
                    if (poll2 == null) {
                        synchronized (this) {
                            poll2 = this.queue.poll();
                            if (poll2 == null) {
                                this.executorRunning = false;
                                this.executorRunning = false;
                                return;
                            }
                        }
                    }
                    if (!poll2.isMergeTx() || (poll = this.queue.poll(this.waitForMergeMillis, TimeUnit.MILLISECONDS)) == null) {
                        executeOperationAndPostCompleted(poll2);
                    } else if (poll2.isMergeableWith(poll)) {
                        mergeTxAndExecute(poll2, poll);
                    } else {
                        executeOperationAndPostCompleted(poll2);
                        executeOperationAndPostCompleted(poll);
                    }
                } catch (InterruptedException e8) {
                    d.w(Thread.currentThread().getName() + " was interruppted", e8);
                    this.executorRunning = false;
                    return;
                }
            } catch (Throwable th) {
                this.executorRunning = false;
                throw th;
            }
        }
    }

    public void setListener(b bVar) {
    }

    public void setListenerMainThread(b bVar) {
    }

    public void setMaxOperationCountToMerge(int i8) {
        this.maxOperationCountToMerge = i8;
    }

    public void setWaitForMergeMillis(int i8) {
        this.waitForMergeMillis = i8;
    }

    public synchronized void waitForCompletion() {
        while (!isCompleted()) {
            try {
                wait();
            } catch (InterruptedException e8) {
                throw new DaoException("Interrupted while waiting for all operations to complete", e8);
            }
        }
    }

    public synchronized boolean waitForCompletion(int i8) {
        if (!isCompleted()) {
            try {
                wait(i8);
            } catch (InterruptedException e8) {
                throw new DaoException("Interrupted while waiting for all operations to complete", e8);
            }
        }
        return isCompleted();
    }
}
