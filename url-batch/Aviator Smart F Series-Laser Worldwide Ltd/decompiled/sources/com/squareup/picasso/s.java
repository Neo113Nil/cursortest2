package com.squareup.picasso;

import android.net.NetworkInfo;
import com.squareup.picasso.Picasso;
import com.squareup.picasso.d0;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes4.dex */
class s extends ThreadPoolExecutor {
    private static final int DEFAULT_THREAD_COUNT = 3;

    private static final class a extends FutureTask implements Comparable {
        private final c hunter;

        a(c cVar) {
            super(cVar, null);
            this.hunter = cVar;
        }

        @Override // java.lang.Comparable
        public int compareTo(a aVar) {
            Picasso.Priority priority = this.hunter.getPriority();
            Picasso.Priority priority2 = aVar.hunter.getPriority();
            return priority == priority2 ? this.hunter.sequence - aVar.hunter.sequence : priority2.ordinal() - priority.ordinal();
        }
    }

    s() {
        super(3, 3, 0L, TimeUnit.MILLISECONDS, new PriorityBlockingQueue(), new d0.c());
    }

    private void setThreadCount(int i8) {
        setCorePoolSize(i8);
        setMaximumPoolSize(i8);
    }

    void adjustThreadCount(NetworkInfo networkInfo) {
        if (networkInfo == null || !networkInfo.isConnectedOrConnecting()) {
            setThreadCount(3);
            return;
        }
        int type = networkInfo.getType();
        if (type != 0) {
            if (type == 1 || type == 6 || type == 9) {
                setThreadCount(4);
                return;
            } else {
                setThreadCount(3);
                return;
            }
        }
        int subtype = networkInfo.getSubtype();
        switch (subtype) {
            case 1:
            case 2:
                setThreadCount(1);
                return;
            case 3:
            case 4:
            case 5:
            case 6:
                break;
            default:
                switch (subtype) {
                    case 12:
                        break;
                    case 13:
                    case 14:
                    case 15:
                        setThreadCount(3);
                        break;
                    default:
                        setThreadCount(3);
                        break;
                }
                return;
        }
        setThreadCount(2);
    }

    @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService
    public Future<?> submit(Runnable runnable) {
        a aVar = new a((c) runnable);
        execute(aVar);
        return aVar;
    }
}
