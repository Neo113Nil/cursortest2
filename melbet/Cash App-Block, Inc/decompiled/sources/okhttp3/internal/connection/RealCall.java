package okhttp3.internal.connection;

import bo.app.a$$ExternalSyntheticBUOutline0;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.TimeZone;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.collections.CollectionsKt__MutableCollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.Dispatcher;
import okhttp3.EventListener;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.internal._UtilCommonKt;
import okhttp3.internal._UtilJvmKt;
import okhttp3.internal.cache.CacheInterceptor;
import okhttp3.internal.cache.DiskLruCache$cleanupTask$1;
import okhttp3.internal.concurrent.TaskQueue;
import okhttp3.internal.http.BridgeInterceptor;
import okhttp3.internal.http.ExchangeCodec;
import okhttp3.internal.http.RealInterceptorChain;
import okhttp3.internal.platform.Android10Platform;
import okhttp3.internal.platform.Platform;
import okio.AsyncTimeout;

/* loaded from: classes3.dex */
public final class RealCall implements Call, Cloneable {
    public Object callStackTrace;
    public volatile boolean canceled;
    public final OkHttpClient client;
    public RealConnection connection;
    public final RealConnectionPool connectionPool;
    public volatile EventListener eventListener;
    public volatile Exchange exchange;
    public ExchangeFinder exchangeFinder;
    public final AtomicBoolean executed;
    public boolean expectMoreExchanges;
    public final boolean forWebSocket;
    public Exchange interceptorScopedExchange;
    public final Request originalRequest;
    public final CopyOnWriteArrayList plansToCancel;
    public boolean requestBodyOpen;
    public boolean responseBodyOpen;
    public boolean socketSinkOpen;
    public boolean socketSourceOpen;
    public final RealCall$timeout$1 timeout;
    public boolean timeoutEarlyExit;

    public final class AsyncCall implements Runnable {
        public volatile AtomicInteger callsPerHost = new AtomicInteger(0);
        public final Callback responseCallback;

        public AsyncCall(Callback callback) {
            this.responseCallback = callback;
        }

        @Override // java.lang.Runnable
        public final void run() {
            Dispatcher dispatcher;
            String concat = "OkHttp ".concat(RealCall.this.originalRequest.url.redact());
            RealCall realCall = RealCall.this;
            Thread currentThread = Thread.currentThread();
            String name = currentThread.getName();
            currentThread.setName(concat);
            try {
                realCall.timeout.enter();
                boolean z = false;
                try {
                    try {
                        try {
                            this.responseCallback.onResponse(realCall, realCall.getResponseWithInterceptorChain$okhttp());
                            dispatcher = realCall.client.dispatcher;
                        } catch (IOException e) {
                            e = e;
                            z = true;
                            if (z) {
                                Android10Platform android10Platform = Platform.platform;
                                Platform.platform.log(4, "Callback failure for ".concat(RealCall.access$toLoggableString(realCall)), e);
                            } else {
                                this.responseCallback.onFailure(realCall, e);
                            }
                            dispatcher = realCall.client.dispatcher;
                            dispatcher.getClass();
                            Dispatcher.promoteAndExecute$default(dispatcher, null, null, this, 3);
                        } catch (Throwable th) {
                            th = th;
                            z = true;
                            realCall.cancel();
                            if (!z) {
                                IOException iOException = new IOException("canceled due to " + th);
                                iOException.initCause(th);
                                this.responseCallback.onFailure(realCall, iOException);
                            }
                            if (!(th instanceof InterruptedException)) {
                                throw th;
                            }
                            Thread.currentThread().interrupt();
                            dispatcher = realCall.client.dispatcher;
                            dispatcher.getClass();
                            Dispatcher.promoteAndExecute$default(dispatcher, null, null, this, 3);
                        }
                    } catch (Throwable th2) {
                        Dispatcher dispatcher2 = realCall.client.dispatcher;
                        dispatcher2.getClass();
                        Dispatcher.promoteAndExecute$default(dispatcher2, null, null, this, 3);
                        throw th2;
                    }
                } catch (IOException e2) {
                    e = e2;
                } catch (Throwable th3) {
                    th = th3;
                }
                dispatcher.getClass();
                Dispatcher.promoteAndExecute$default(dispatcher, null, null, this, 3);
            } finally {
                currentThread.setName(name);
            }
        }
    }

    public final class CallReference extends WeakReference {
        public final Object callStackTrace;

        public CallReference(RealCall realCall, Object obj) {
            super(realCall);
            this.callStackTrace = obj;
        }
    }

    static {
        AtomicReferenceFieldUpdater.newUpdater(RealCall.class, EventListener.class, "eventListener");
    }

    /* JADX WARN: Type inference failed for: r5v6, types: [okhttp3.internal.connection.RealCall$timeout$1, okio.Timeout] */
    public RealCall(OkHttpClient okHttpClient, Request request, boolean z) {
        okHttpClient.getClass();
        request.getClass();
        this.client = okHttpClient;
        this.originalRequest = request;
        this.forWebSocket = z;
        this.connectionPool = (RealConnectionPool) okHttpClient.connectionPool.delegate;
        this.eventListener = okHttpClient.eventListenerFactory.create(this);
        ?? r5 = new AsyncTimeout() { // from class: okhttp3.internal.connection.RealCall$timeout$1
            @Override // okio.AsyncTimeout
            public final void timedOut() {
                RealCall.this.cancel();
            }
        };
        r5.timeout(okHttpClient.callTimeoutMillis, TimeUnit.MILLISECONDS);
        this.timeout = r5;
        this.executed = new AtomicBoolean();
        this.expectMoreExchanges = true;
        this.plansToCancel = new CopyOnWriteArrayList();
        new AtomicReference(request.tags);
    }

    public static final String access$toLoggableString(RealCall realCall) {
        StringBuilder sb = new StringBuilder();
        sb.append(realCall.canceled ? "canceled " : "");
        sb.append(realCall.forWebSocket ? "web socket" : "call");
        sb.append(" to ");
        sb.append(realCall.originalRequest.url.redact());
        return sb.toString();
    }

    public final void acquireConnectionNoEvents(RealConnection realConnection) {
        realConnection.getClass();
        TimeZone timeZone = _UtilJvmKt.UTC;
        if (this.connection != null) {
            a$$ExternalSyntheticBUOutline0.m$1("Check failed.");
        } else {
            this.connection = realConnection;
            realConnection.calls.add(new CallReference(this, this.callStackTrace));
        }
    }

    public final IOException callDone(IOException iOException) {
        IOException iOException2;
        Socket releaseConnectionNoEvents$okhttp;
        TimeZone timeZone = _UtilJvmKt.UTC;
        RealConnection realConnection = this.connection;
        if (realConnection != null) {
            synchronized (realConnection) {
                releaseConnectionNoEvents$okhttp = releaseConnectionNoEvents$okhttp();
            }
            if (this.connection == null) {
                if (releaseConnectionNoEvents$okhttp != null) {
                    _UtilJvmKt.closeQuietly(releaseConnectionNoEvents$okhttp);
                }
                this.eventListener.connectionReleased(this, realConnection);
            } else if (releaseConnectionNoEvents$okhttp != null) {
                a$$ExternalSyntheticBUOutline0.m$1("Check failed.");
                return null;
            }
        }
        if (!this.timeoutEarlyExit && exit()) {
            iOException2 = new InterruptedIOException("timeout");
            if (iOException != null) {
                iOException2.initCause(iOException);
            }
        } else {
            iOException2 = iOException;
        }
        EventListener eventListener = this.eventListener;
        if (iOException == null) {
            eventListener.callEnd(this);
            return iOException2;
        }
        iOException2.getClass();
        eventListener.callFailed(this, iOException2);
        return iOException2;
    }

    public final void cancel() {
        if (this.canceled) {
            return;
        }
        this.canceled = true;
        Exchange exchange = this.exchange;
        if (exchange != null) {
            ((ExchangeCodec) exchange.codec).cancel();
        }
        Iterator it = this.plansToCancel.iterator();
        it.getClass();
        while (it.hasNext()) {
            ((RoutePlanner$Plan) it.next()).cancel();
        }
        this.eventListener.canceled(this);
    }

    public final Object clone() {
        return new RealCall(this.client, this.originalRequest, this.forWebSocket);
    }

    public final void enqueue(Callback callback) {
        if (!this.executed.compareAndSet(false, true)) {
            a$$ExternalSyntheticBUOutline0.m$1("Already Executed");
            return;
        }
        Android10Platform android10Platform = Platform.platform;
        this.callStackTrace = Platform.platform.getStackTraceForCloseable();
        this.eventListener.callStart(this);
        Dispatcher dispatcher = this.client.dispatcher;
        AsyncCall asyncCall = new AsyncCall(callback);
        dispatcher.getClass();
        Dispatcher.promoteAndExecute$default(dispatcher, asyncCall, null, null, 6);
    }

    public final Response execute() {
        if (!this.executed.compareAndSet(false, true)) {
            a$$ExternalSyntheticBUOutline0.m$1("Already Executed");
            return null;
        }
        enter();
        Android10Platform android10Platform = Platform.platform;
        this.callStackTrace = Platform.platform.getStackTraceForCloseable();
        this.eventListener.callStart(this);
        try {
            Dispatcher dispatcher = this.client.dispatcher;
            synchronized (dispatcher) {
                dispatcher.runningSyncCalls.add(this);
            }
            return getResponseWithInterceptorChain$okhttp();
        } finally {
            Dispatcher dispatcher2 = this.client.dispatcher;
            dispatcher2.getClass();
            Dispatcher.promoteAndExecute$default(dispatcher2, null, this, null, 5);
        }
    }

    public final void exitNetworkInterceptorExchange$okhttp(boolean z) {
        Exchange exchange;
        synchronized (this) {
            if (!this.expectMoreExchanges) {
                throw new IllegalStateException("released");
            }
        }
        if (z && (exchange = this.exchange) != null) {
            ((ExchangeCodec) exchange.codec).cancel();
            ((RealCall) exchange.call).messageDone$okhttp(exchange, true, true, true, true, null);
        }
        this.interceptorScopedExchange = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x00bf  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Response getResponseWithInterceptorChain$okhttp() {
        boolean z;
        ArrayList arrayList = new ArrayList();
        CollectionsKt__MutableCollectionsKt.addAll(this.client.interceptors, arrayList);
        arrayList.add(new BridgeInterceptor(2));
        int i = 0;
        arrayList.add(new BridgeInterceptor(i));
        arrayList.add(new CacheInterceptor(i));
        arrayList.add(ConnectInterceptor.INSTANCE);
        if (!this.forWebSocket) {
            CollectionsKt__MutableCollectionsKt.addAll(this.client.networkInterceptors, arrayList);
        }
        arrayList.add(BridgeInterceptor.INSTANCE);
        Request request = this.originalRequest;
        OkHttpClient okHttpClient = this.client;
        request.getClass();
        okHttpClient.getClass();
        try {
            Response proceed = new RealInterceptorChain(this, arrayList, 0, null, request, okHttpClient.connectTimeoutMillis, okHttpClient.readTimeoutMillis, okHttpClient.writeTimeoutMillis, okHttpClient.authenticator, okHttpClient.cache, okHttpClient.certificatePinner, okHttpClient.connectionPool, okHttpClient.cookieJar, okHttpClient.dns, okHttpClient.hostnameVerifier, okHttpClient.proxyAuthenticator, okHttpClient.proxySelector, okHttpClient.retryOnConnectionFailure, okHttpClient.socketFactory, okHttpClient.sslSocketFactoryOrNull, okHttpClient.x509TrustManager, okHttpClient.certificateChainCleaner).proceed(this.originalRequest);
            if (this.canceled) {
                _UtilCommonKt.closeQuietly(proceed);
                throw new IOException("Canceled");
            }
            noMoreExchanges$okhttp(null);
            return proceed;
        } catch (IOException e) {
            z = true;
            try {
                IOException noMoreExchanges$okhttp = noMoreExchanges$okhttp(e);
                noMoreExchanges$okhttp.getClass();
                throw noMoreExchanges$okhttp;
            } catch (Throwable th) {
                th = th;
                if (!z) {
                    noMoreExchanges$okhttp(null);
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            z = false;
            if (!z) {
            }
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002d A[Catch: all -> 0x0017, TryCatch #0 {all -> 0x0017, blocks: (B:59:0x0012, B:10:0x002d, B:12:0x0031, B:14:0x0035, B:16:0x0039, B:17:0x003b, B:19:0x003f, B:21:0x0043, B:23:0x0047, B:27:0x0050, B:7:0x001b, B:52:0x0021, B:55:0x0027), top: B:58:0x0012 }] */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0031 A[Catch: all -> 0x0017, TryCatch #0 {all -> 0x0017, blocks: (B:59:0x0012, B:10:0x002d, B:12:0x0031, B:14:0x0035, B:16:0x0039, B:17:0x003b, B:19:0x003f, B:21:0x0043, B:23:0x0047, B:27:0x0050, B:7:0x001b, B:52:0x0021, B:55:0x0027), top: B:58:0x0012 }] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0035 A[Catch: all -> 0x0017, TryCatch #0 {all -> 0x0017, blocks: (B:59:0x0012, B:10:0x002d, B:12:0x0031, B:14:0x0035, B:16:0x0039, B:17:0x003b, B:19:0x003f, B:21:0x0043, B:23:0x0047, B:27:0x0050, B:7:0x001b, B:52:0x0021, B:55:0x0027), top: B:58:0x0012 }] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0039 A[Catch: all -> 0x0017, TryCatch #0 {all -> 0x0017, blocks: (B:59:0x0012, B:10:0x002d, B:12:0x0031, B:14:0x0035, B:16:0x0039, B:17:0x003b, B:19:0x003f, B:21:0x0043, B:23:0x0047, B:27:0x0050, B:7:0x001b, B:52:0x0021, B:55:0x0027), top: B:58:0x0012 }] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0050 A[Catch: all -> 0x0017, TRY_LEAVE, TryCatch #0 {all -> 0x0017, blocks: (B:59:0x0012, B:10:0x002d, B:12:0x0031, B:14:0x0035, B:16:0x0039, B:17:0x003b, B:19:0x003f, B:21:0x0043, B:23:0x0047, B:27:0x0050, B:7:0x001b, B:52:0x0021, B:55:0x0027), top: B:58:0x0012 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final IOException messageDone$okhttp(Exchange exchange, boolean z, boolean z2, boolean z3, boolean z4, IOException iOException) {
        boolean z5;
        boolean z6;
        boolean z7;
        exchange.getClass();
        if (exchange.equals(this.exchange)) {
            synchronized (this) {
                z5 = false;
                if (z) {
                    try {
                        if (!this.requestBodyOpen) {
                        }
                        if (z) {
                            this.requestBodyOpen = false;
                        }
                        if (z2) {
                            this.responseBodyOpen = false;
                        }
                        if (z4) {
                            this.socketSinkOpen = false;
                        }
                        if (z3) {
                            this.socketSourceOpen = false;
                        }
                        z7 = (!this.requestBodyOpen || this.responseBodyOpen || this.socketSinkOpen || this.socketSourceOpen) ? false : true;
                        if (z7) {
                            if (!this.expectMoreExchanges) {
                                z5 = true;
                            }
                        }
                        boolean z8 = z5;
                        z5 = z7;
                        z6 = z8;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                if ((!z2 || !this.responseBodyOpen) && ((!z4 || !this.socketSinkOpen) && (!z3 || !this.socketSourceOpen))) {
                    z6 = false;
                }
                if (z) {
                }
                if (z2) {
                }
                if (z4) {
                }
                if (z3) {
                }
                if (!this.requestBodyOpen) {
                }
                if (z7) {
                }
                boolean z82 = z5;
                z5 = z7;
                z6 = z82;
            }
            if (z5) {
                this.exchange = null;
                RealConnection realConnection = this.connection;
                if (realConnection != null) {
                    synchronized (realConnection) {
                        realConnection.successCount++;
                    }
                }
            }
            if (z6) {
                return callDone(iOException);
            }
        }
        return iOException;
    }

    public final IOException noMoreExchanges$okhttp(IOException iOException) {
        boolean z;
        synchronized (this) {
            z = false;
            if (this.expectMoreExchanges) {
                this.expectMoreExchanges = false;
                if (!this.requestBodyOpen && !this.responseBodyOpen && !this.socketSinkOpen) {
                    if (!this.socketSourceOpen) {
                        z = true;
                    }
                }
            }
        }
        return z ? callDone(iOException) : iOException;
    }

    public final Socket releaseConnectionNoEvents$okhttp() {
        RealConnection realConnection = this.connection;
        realConnection.getClass();
        TimeZone timeZone = _UtilJvmKt.UTC;
        ArrayList arrayList = realConnection.calls;
        Iterator it = arrayList.iterator();
        int i = 0;
        while (true) {
            if (!it.hasNext()) {
                i = -1;
                break;
            }
            if (Intrinsics.areEqual(((Reference) it.next()).get(), this)) {
                break;
            }
            i++;
        }
        if (i == -1) {
            a$$ExternalSyntheticBUOutline0.m$1("Check failed.");
            return null;
        }
        arrayList.remove(i);
        this.connection = null;
        if (!arrayList.isEmpty()) {
            return null;
        }
        realConnection.idleAtNs = System.nanoTime();
        RealConnectionPool realConnectionPool = this.connectionPool;
        ConcurrentLinkedQueue concurrentLinkedQueue = (ConcurrentLinkedQueue) realConnectionPool.connections;
        TimeZone timeZone2 = _UtilJvmKt.UTC;
        if (!realConnection.noNewExchanges) {
            ((TaskQueue) realConnectionPool.cleanupQueue).schedule((DiskLruCache$cleanupTask$1) realConnectionPool.cleanupTask, 0L);
            return null;
        }
        realConnection.noNewExchanges = true;
        concurrentLinkedQueue.remove(realConnection);
        if (concurrentLinkedQueue.isEmpty()) {
            TaskQueue taskQueue = (TaskQueue) realConnectionPool.cleanupQueue;
            synchronized (taskQueue.taskRunner) {
                if (taskQueue.cancelAllAndDecide$okhttp()) {
                    taskQueue.taskRunner.kickCoordinator$okhttp(taskQueue);
                }
            }
        }
        return realConnection.javaNetSocket;
    }
}
