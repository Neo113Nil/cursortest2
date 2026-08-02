package okhttp3.internal.cache;

import java.io.IOException;
import java.util.Iterator;
import java.util.concurrent.ConcurrentLinkedQueue;
import okhttp3.internal._UtilCommonKt;
import okhttp3.internal._UtilJvmKt;
import okhttp3.internal.concurrent.Task;
import okhttp3.internal.concurrent.TaskQueue;
import okhttp3.internal.connection.RealConnection;
import okhttp3.internal.connection.RealConnectionPool;
import okio.BlackholeSink;
import okio.RealBufferedSink;

/* loaded from: classes3.dex */
public final class DiskLruCache$cleanupTask$1 extends Task {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ DiskLruCache$cleanupTask$1(String str, int i, Object obj) {
        super(str, true);
        this.$r8$classId = i;
        this.this$0 = obj;
    }

    @Override // okhttp3.internal.concurrent.Task
    public final long runOnce() {
        long j;
        RealConnection realConnection;
        int i = 0;
        switch (this.$r8$classId) {
            case 0:
                DiskLruCache diskLruCache = (DiskLruCache) this.this$0;
                synchronized (diskLruCache) {
                    if (diskLruCache.initialized && !diskLruCache.closed) {
                        try {
                            diskLruCache.trimToSize();
                        } catch (IOException unused) {
                            diskLruCache.mostRecentTrimFailed = true;
                        }
                        try {
                            if (diskLruCache.journalRebuildRequired()) {
                                diskLruCache.rebuildJournal$okhttp();
                                diskLruCache.redundantOpCount = 0;
                            }
                        } catch (IOException unused2) {
                            diskLruCache.mostRecentRebuildFailed = true;
                            RealBufferedSink realBufferedSink = diskLruCache.journalWriter;
                            if (realBufferedSink != null) {
                                _UtilCommonKt.closeQuietly(realBufferedSink);
                            }
                            diskLruCache.journalWriter = new RealBufferedSink(new BlackholeSink());
                        }
                    }
                }
                return -1L;
            default:
                RealConnectionPool realConnectionPool = (RealConnectionPool) this.this$0;
                long nanoTime = System.nanoTime();
                long j2 = (nanoTime - realConnectionPool.keepAliveDurationNs) + 1;
                Iterator it = ((ConcurrentLinkedQueue) realConnectionPool.connections).iterator();
                it.getClass();
                long j3 = Long.MAX_VALUE;
                RealConnection realConnection2 = null;
                long j4 = j2;
                RealConnection realConnection3 = null;
                int i2 = 0;
                while (it.hasNext()) {
                    RealConnection realConnection4 = (RealConnection) it.next();
                    realConnection4.getClass();
                    synchronized (realConnection4) {
                        if (realConnectionPool.pruneAndGetAllocationCount(realConnection4, nanoTime) > 0) {
                            i2++;
                        } else {
                            long j5 = j4;
                            long j6 = realConnection4.idleAtNs;
                            if (j6 < j5) {
                                realConnection3 = realConnection4;
                                j5 = j6;
                            }
                            i++;
                            if (j6 < j3) {
                                realConnection2 = realConnection4;
                                j3 = j6;
                            }
                            j4 = j5;
                        }
                    }
                }
                long j7 = j4;
                if (realConnection3 != null) {
                    realConnection = realConnection3;
                    j = j7;
                } else if (i > 5) {
                    j = j3;
                    realConnection = realConnection2;
                } else {
                    j = -1;
                    realConnection = null;
                }
                if (realConnection == null) {
                    if (realConnection2 != null) {
                        return (j3 + realConnectionPool.keepAliveDurationNs) - nanoTime;
                    }
                    if (i2 > 0) {
                        return realConnectionPool.keepAliveDurationNs;
                    }
                    return -1L;
                }
                synchronized (realConnection) {
                    if (realConnection.calls.isEmpty() && realConnection.idleAtNs == j) {
                        realConnection.noNewExchanges = true;
                        ((ConcurrentLinkedQueue) realConnectionPool.connections).remove(realConnection);
                        _UtilJvmKt.closeQuietly(realConnection.javaNetSocket);
                        if (!((ConcurrentLinkedQueue) realConnectionPool.connections).isEmpty()) {
                            return 0L;
                        }
                        TaskQueue taskQueue = (TaskQueue) realConnectionPool.cleanupQueue;
                        synchronized (taskQueue.taskRunner) {
                            if (taskQueue.cancelAllAndDecide$okhttp()) {
                                taskQueue.taskRunner.kickCoordinator$okhttp(taskQueue);
                            }
                        }
                        return 0L;
                    }
                    return 0L;
                }
        }
    }
}
