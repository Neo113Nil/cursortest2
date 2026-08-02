package okhttp3;

import com.squareup.cash.db.WireAdapter;
import java.io.InterruptedIOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.TimeZone;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal._UtilJvmKt;
import okhttp3.internal._UtilJvmKt$$ExternalSyntheticLambda1;
import okhttp3.internal.connection.RealCall;

/* loaded from: classes3.dex */
public final class Dispatcher {
    public ThreadPoolExecutor executorServiceOrNull;
    public final ArrayDeque readyAsyncCalls = new ArrayDeque();
    public final ArrayDeque runningAsyncCalls = new ArrayDeque();
    public final ArrayDeque runningSyncCalls = new ArrayDeque();

    public static void promoteAndExecute$default(Dispatcher dispatcher, RealCall.AsyncCall asyncCall, RealCall realCall, RealCall.AsyncCall asyncCall2, int i) {
        WireAdapter wireAdapter;
        RealCall.AsyncCall findExistingCallWithHost;
        if ((i & 1) != 0) {
            asyncCall = null;
        }
        if ((i & 2) != 0) {
            realCall = null;
        }
        if ((i & 4) != 0) {
            asyncCall2 = null;
        }
        dispatcher.getClass();
        TimeZone timeZone = _UtilJvmKt.UTC;
        boolean isShutdown = ((ThreadPoolExecutor) dispatcher.executorService()).isShutdown();
        synchronized (dispatcher) {
            if (realCall != null) {
                try {
                    if (!dispatcher.runningSyncCalls.remove(realCall)) {
                        throw new IllegalStateException("Call wasn't in-flight!");
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (asyncCall2 != null) {
                asyncCall2.callsPerHost.decrementAndGet();
                if (!dispatcher.runningAsyncCalls.remove(asyncCall2)) {
                    throw new IllegalStateException("Call wasn't in-flight!");
                }
            }
            if (asyncCall != null) {
                dispatcher.readyAsyncCalls.add(asyncCall);
                RealCall realCall2 = RealCall.this;
                if (!realCall2.forWebSocket && (findExistingCallWithHost = dispatcher.findExistingCallWithHost(realCall2.originalRequest.url.host)) != null) {
                    asyncCall.callsPerHost = findExistingCallWithHost.callsPerHost;
                }
            }
            if ((realCall != null || asyncCall2 != null) && (isShutdown || dispatcher.runningAsyncCalls.isEmpty())) {
                dispatcher.runningSyncCalls.isEmpty();
            }
            if (isShutdown) {
                List list = CollectionsKt.toList(dispatcher.readyAsyncCalls);
                dispatcher.readyAsyncCalls.clear();
                wireAdapter = new WireAdapter(list);
            } else {
                ArrayList arrayList = new ArrayList();
                Iterator it = dispatcher.readyAsyncCalls.iterator();
                it.getClass();
                while (it.hasNext()) {
                    RealCall.AsyncCall asyncCall3 = (RealCall.AsyncCall) it.next();
                    if (dispatcher.runningAsyncCalls.size() >= 64) {
                        break;
                    }
                    if (asyncCall3.callsPerHost.get() < 5) {
                        it.remove();
                        asyncCall3.callsPerHost.incrementAndGet();
                        arrayList.add(asyncCall3);
                        dispatcher.runningAsyncCalls.add(asyncCall3);
                    }
                }
                wireAdapter = new WireAdapter((List) arrayList);
            }
        }
        int size = ((List) wireAdapter.adapter).size();
        boolean z = true;
        for (int i2 = 0; i2 < size; i2++) {
            RealCall.AsyncCall asyncCall4 = (RealCall.AsyncCall) ((List) wireAdapter.adapter).get(i2);
            if (asyncCall4 == asyncCall) {
                z = false;
            } else {
                RealCall.this.eventListener.dispatcherQueueEnd(RealCall.this, dispatcher);
            }
            if (isShutdown) {
                asyncCall4.getClass();
                InterruptedIOException interruptedIOException = new InterruptedIOException("executor rejected");
                interruptedIOException.initCause(null);
                RealCall realCall3 = RealCall.this;
                realCall3.noMoreExchanges$okhttp(interruptedIOException);
                asyncCall4.responseCallback.onFailure(realCall3, interruptedIOException);
            } else {
                ExecutorService executorService = dispatcher.executorService();
                asyncCall4.getClass();
                RealCall realCall4 = RealCall.this;
                realCall4.client.dispatcher.getClass();
                try {
                    try {
                        ((ThreadPoolExecutor) executorService).execute(asyncCall4);
                    } catch (RejectedExecutionException e) {
                        InterruptedIOException interruptedIOException2 = new InterruptedIOException("executor rejected");
                        interruptedIOException2.initCause(e);
                        RealCall realCall5 = RealCall.this;
                        realCall5.noMoreExchanges$okhttp(interruptedIOException2);
                        asyncCall4.responseCallback.onFailure(realCall5, interruptedIOException2);
                        Dispatcher dispatcher2 = realCall4.client.dispatcher;
                        dispatcher2.getClass();
                        promoteAndExecute$default(dispatcher2, null, null, asyncCall4, 3);
                    }
                } catch (Throwable th2) {
                    Dispatcher dispatcher3 = realCall4.client.dispatcher;
                    dispatcher3.getClass();
                    promoteAndExecute$default(dispatcher3, null, null, asyncCall4, 3);
                    throw th2;
                }
            }
        }
        if (!z || asyncCall == null) {
            return;
        }
        RealCall.this.eventListener.dispatcherQueueStart(RealCall.this, dispatcher);
    }

    public final synchronized ExecutorService executorService() {
        ThreadPoolExecutor threadPoolExecutor;
        try {
            if (this.executorServiceOrNull == null) {
                this.executorServiceOrNull = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60L, TimeUnit.SECONDS, new SynchronousQueue(), new _UtilJvmKt$$ExternalSyntheticLambda1(_UtilJvmKt.okHttpName + " Dispatcher", false));
            }
            threadPoolExecutor = this.executorServiceOrNull;
            threadPoolExecutor.getClass();
        } catch (Throwable th) {
            throw th;
        }
        return threadPoolExecutor;
    }

    public final RealCall.AsyncCall findExistingCallWithHost(String str) {
        Iterator it = this.runningAsyncCalls.iterator();
        it.getClass();
        while (it.hasNext()) {
            RealCall.AsyncCall asyncCall = (RealCall.AsyncCall) it.next();
            if (Intrinsics.areEqual(RealCall.this.originalRequest.url.host, str)) {
                return asyncCall;
            }
        }
        Iterator it2 = this.readyAsyncCalls.iterator();
        it2.getClass();
        while (it2.hasNext()) {
            RealCall.AsyncCall asyncCall2 = (RealCall.AsyncCall) it2.next();
            if (Intrinsics.areEqual(RealCall.this.originalRequest.url.host, str)) {
                return asyncCall2;
            }
        }
        return null;
    }
}
