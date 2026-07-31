package com.applovin.shadow.okhttp3.internal.connection;

import androidx.core.app.NotificationCompat;
import com.applovin.shadow.okhttp3.Address;
import com.applovin.shadow.okhttp3.Call;
import com.applovin.shadow.okhttp3.Callback;
import com.applovin.shadow.okhttp3.CertificatePinner;
import com.applovin.shadow.okhttp3.Dispatcher;
import com.applovin.shadow.okhttp3.EventListener;
import com.applovin.shadow.okhttp3.HttpUrl;
import com.applovin.shadow.okhttp3.OkHttpClient;
import com.applovin.shadow.okhttp3.Request;
import com.applovin.shadow.okhttp3.Response;
import com.applovin.shadow.okhttp3.internal.Util;
import com.applovin.shadow.okhttp3.internal.cache.CacheInterceptor;
import com.applovin.shadow.okhttp3.internal.http.BridgeInterceptor;
import com.applovin.shadow.okhttp3.internal.http.CallServerInterceptor;
import com.applovin.shadow.okhttp3.internal.http.RealInterceptorChain;
import com.applovin.shadow.okhttp3.internal.http.RetryAndFollowUpInterceptor;
import com.applovin.shadow.okhttp3.internal.platform.Platform;
import com.applovin.shadow.okio.AsyncTimeout;
import com.mobilefuse.sdk.identity.EidRequestBuilder;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;
import kotlin.ExceptionsKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: RealCall.kt */
@Metadata(d1 = {"\u0000§\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006*\u0001.\u0018\u00002\u00020\u0001:\u0002deB\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u000e\u00101\u001a\u0002022\u0006\u0010\u0010\u001a\u00020\u000fJ!\u00103\u001a\u0002H4\"\n\b\u0000\u00104*\u0004\u0018\u0001052\u0006\u00106\u001a\u0002H4H\u0002¢\u0006\u0002\u00107J\b\u00108\u001a\u000202H\u0002J\b\u00109\u001a\u000202H\u0016J\b\u0010:\u001a\u00020\u0000H\u0016J\u0010\u0010;\u001a\u00020<2\u0006\u0010=\u001a\u00020>H\u0002J\u0010\u0010?\u001a\u0002022\u0006\u0010@\u001a\u00020AH\u0016J\u0016\u0010B\u001a\u0002022\u0006\u0010C\u001a\u00020\u00052\u0006\u0010D\u001a\u00020\u0007J\b\u0010E\u001a\u00020FH\u0016J\u0015\u0010G\u001a\u0002022\u0006\u0010H\u001a\u00020\u0007H\u0000¢\u0006\u0002\bIJ\r\u0010J\u001a\u00020FH\u0000¢\u0006\u0002\bKJ\u0015\u0010L\u001a\u00020\u001e2\u0006\u0010M\u001a\u00020NH\u0000¢\u0006\u0002\bOJ\b\u0010P\u001a\u00020\u0007H\u0016J\b\u0010Q\u001a\u00020\u0007H\u0016J;\u0010R\u001a\u0002H4\"\n\b\u0000\u00104*\u0004\u0018\u0001052\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010S\u001a\u00020\u00072\u0006\u0010T\u001a\u00020\u00072\u0006\u00106\u001a\u0002H4H\u0000¢\u0006\u0004\bU\u0010VJ\u0019\u0010W\u001a\u0004\u0018\u0001052\b\u00106\u001a\u0004\u0018\u000105H\u0000¢\u0006\u0002\bXJ\r\u0010Y\u001a\u00020ZH\u0000¢\u0006\u0002\b[J\u000f\u0010\\\u001a\u0004\u0018\u00010]H\u0000¢\u0006\u0002\b^J\b\u0010C\u001a\u00020\u0005H\u0016J\u0006\u0010_\u001a\u00020\u0007J\b\u0010-\u001a\u00020`H\u0016J\u0006\u00100\u001a\u000202J!\u0010a\u001a\u0002H4\"\n\b\u0000\u00104*\u0004\u0018\u0001052\u0006\u0010b\u001a\u0002H4H\u0002¢\u0006\u0002\u00107J\b\u0010c\u001a\u00020ZH\u0002R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\"\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u000fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0012\"\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0019\u001a\u00020\u001aX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0010\u0010\u001d\u001a\u0004\u0018\u00010\u001eX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u001f\u001a\u0004\u0018\u00010 X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010!\u001a\u00020\"X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010#\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b$\u0010%R\"\u0010&\u001a\u0004\u0018\u00010\u001e2\b\u0010\u000e\u001a\u0004\u0018\u00010\u001e@BX\u0080\u000e¢\u0006\b\n\u0000\u001a\u0004\b'\u0010(R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b)\u0010*R\u000e\u0010+\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010,\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010-\u001a\u00020.X\u0082\u0004¢\u0006\u0004\n\u0002\u0010/R\u000e\u00100\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006f"}, d2 = {"Lcom/applovin/shadow/okhttp3/internal/connection/RealCall;", "Lcom/applovin/shadow/okhttp3/Call;", "client", "Lcom/applovin/shadow/okhttp3/OkHttpClient;", "originalRequest", "Lcom/applovin/shadow/okhttp3/Request;", "forWebSocket", "", "(Lokhttp3/OkHttpClient;Lokhttp3/Request;Z)V", "callStackTrace", "", "canceled", "getClient", "()Lokhttp3/OkHttpClient;", "<set-?>", "Lcom/applovin/shadow/okhttp3/internal/connection/RealConnection;", "connection", "getConnection", "()Lokhttp3/internal/connection/RealConnection;", "connectionPool", "Lcom/applovin/shadow/okhttp3/internal/connection/RealConnectionPool;", "connectionToCancel", "getConnectionToCancel", "setConnectionToCancel", "(Lokhttp3/internal/connection/RealConnection;)V", "eventListener", "Lcom/applovin/shadow/okhttp3/EventListener;", "getEventListener$okhttp", "()Lokhttp3/EventListener;", "exchange", "Lcom/applovin/shadow/okhttp3/internal/connection/Exchange;", "exchangeFinder", "Lcom/applovin/shadow/okhttp3/internal/connection/ExchangeFinder;", "executed", "Ljava/util/concurrent/atomic/AtomicBoolean;", "expectMoreExchanges", "getForWebSocket", "()Z", "interceptorScopedExchange", "getInterceptorScopedExchange$okhttp", "()Lokhttp3/internal/connection/Exchange;", "getOriginalRequest", "()Lokhttp3/Request;", "requestBodyOpen", "responseBodyOpen", "timeout", "com/applovin/shadow/okhttp3/internal/connection/RealCall$timeout$1", "Lcom/applovin/shadow/okhttp3/internal/connection/RealCall$timeout$1;", "timeoutEarlyExit", "acquireConnectionNoEvents", "", "callDone", "E", "Ljava/io/IOException;", EidRequestBuilder.REQUEST_FIELD_EMAIL, "(Ljava/io/IOException;)Ljava/io/IOException;", "callStart", "cancel", "clone", "createAddress", "Lcom/applovin/shadow/okhttp3/Address;", "url", "Lcom/applovin/shadow/okhttp3/HttpUrl;", "enqueue", "responseCallback", "Lcom/applovin/shadow/okhttp3/Callback;", "enterNetworkInterceptorExchange", "request", "newExchangeFinder", "execute", "Lcom/applovin/shadow/okhttp3/Response;", "exitNetworkInterceptorExchange", "closeExchange", "exitNetworkInterceptorExchange$okhttp", "getResponseWithInterceptorChain", "getResponseWithInterceptorChain$okhttp", "initExchange", "chain", "Lcom/applovin/shadow/okhttp3/internal/http/RealInterceptorChain;", "initExchange$okhttp", "isCanceled", "isExecuted", "messageDone", "requestDone", "responseDone", "messageDone$okhttp", "(Lokhttp3/internal/connection/Exchange;ZZLjava/io/IOException;)Ljava/io/IOException;", "noMoreExchanges", "noMoreExchanges$okhttp", "redactedUrl", "", "redactedUrl$okhttp", "releaseConnectionNoEvents", "Ljava/net/Socket;", "releaseConnectionNoEvents$okhttp", "retryAfterFailure", "Lcom/applovin/shadow/okio/AsyncTimeout;", "timeoutExit", "cause", "toLoggableString", "AsyncCall", "CallReference", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class RealCall implements Call {

    @Nullable
    private Object callStackTrace;
    private volatile boolean canceled;

    @NotNull
    private final OkHttpClient client;

    @Nullable
    private RealConnection connection;

    @NotNull
    private final RealConnectionPool connectionPool;

    @Nullable
    private volatile RealConnection connectionToCancel;

    @NotNull
    private final EventListener eventListener;

    @Nullable
    private volatile Exchange exchange;

    @Nullable
    private ExchangeFinder exchangeFinder;

    @NotNull
    private final AtomicBoolean executed;
    private boolean expectMoreExchanges;
    private final boolean forWebSocket;

    @Nullable
    private Exchange interceptorScopedExchange;

    @NotNull
    private final Request originalRequest;
    private boolean requestBodyOpen;
    private boolean responseBodyOpen;

    @NotNull
    private final RealCall$timeout$1 timeout;
    private boolean timeoutEarlyExit;

    /* JADX WARN: Type inference failed for: r4v5, types: [com.applovin.shadow.okhttp3.internal.connection.RealCall$timeout$1, com.applovin.shadow.okio.Timeout] */
    public RealCall(@NotNull OkHttpClient client, @NotNull Request originalRequest, boolean z) {
        Intrinsics.checkNotNullParameter(client, "client");
        Intrinsics.checkNotNullParameter(originalRequest, "originalRequest");
        this.client = client;
        this.originalRequest = originalRequest;
        this.forWebSocket = z;
        this.connectionPool = client.connectionPool().getDelegate();
        this.eventListener = client.eventListenerFactory().create(this);
        ?? r4 = new AsyncTimeout() { // from class: com.applovin.shadow.okhttp3.internal.connection.RealCall$timeout$1
            @Override // com.applovin.shadow.okio.AsyncTimeout
            protected void timedOut() {
                RealCall.this.cancel();
            }
        };
        r4.timeout(client.callTimeoutMillis(), TimeUnit.MILLISECONDS);
        this.timeout = r4;
        this.executed = new AtomicBoolean();
        this.expectMoreExchanges = true;
    }

    @NotNull
    public final OkHttpClient getClient() {
        return this.client;
    }

    @NotNull
    public final Request getOriginalRequest() {
        return this.originalRequest;
    }

    public final boolean getForWebSocket() {
        return this.forWebSocket;
    }

    @NotNull
    /* renamed from: getEventListener$okhttp, reason: from getter */
    public final EventListener getEventListener() {
        return this.eventListener;
    }

    @Nullable
    public final RealConnection getConnection() {
        return this.connection;
    }

    @Nullable
    /* renamed from: getInterceptorScopedExchange$okhttp, reason: from getter */
    public final Exchange getInterceptorScopedExchange() {
        return this.interceptorScopedExchange;
    }

    @Nullable
    public final RealConnection getConnectionToCancel() {
        return this.connectionToCancel;
    }

    public final void setConnectionToCancel(@Nullable RealConnection realConnection) {
        this.connectionToCancel = realConnection;
    }

    @Override // com.applovin.shadow.okhttp3.Call
    @NotNull
    public AsyncTimeout timeout() {
        return this.timeout;
    }

    @Override // com.applovin.shadow.okhttp3.Call
    @NotNull
    /* renamed from: clone, reason: merged with bridge method [inline-methods] */
    public RealCall m3191clone() {
        return new RealCall(this.client, this.originalRequest, this.forWebSocket);
    }

    @Override // com.applovin.shadow.okhttp3.Call
    @NotNull
    public Request request() {
        return this.originalRequest;
    }

    @Override // com.applovin.shadow.okhttp3.Call
    public void cancel() {
        if (this.canceled) {
            return;
        }
        this.canceled = true;
        Exchange exchange = this.exchange;
        if (exchange != null) {
            exchange.cancel();
        }
        RealConnection realConnection = this.connectionToCancel;
        if (realConnection != null) {
            realConnection.cancel();
        }
        this.eventListener.canceled(this);
    }

    @Override // com.applovin.shadow.okhttp3.Call
    /* renamed from: isCanceled, reason: from getter */
    public boolean getCanceled() {
        return this.canceled;
    }

    @Override // com.applovin.shadow.okhttp3.Call
    @NotNull
    public Response execute() {
        if (!this.executed.compareAndSet(false, true)) {
            throw new IllegalStateException("Already Executed");
        }
        enter();
        callStart();
        try {
            this.client.dispatcher().executed$okhttp(this);
            return getResponseWithInterceptorChain$okhttp();
        } finally {
            this.client.dispatcher().finished$okhttp(this);
        }
    }

    @Override // com.applovin.shadow.okhttp3.Call
    public void enqueue(@NotNull Callback responseCallback) {
        Intrinsics.checkNotNullParameter(responseCallback, "responseCallback");
        if (!this.executed.compareAndSet(false, true)) {
            throw new IllegalStateException("Already Executed");
        }
        callStart();
        this.client.dispatcher().enqueue$okhttp(new AsyncCall(this, responseCallback));
    }

    @Override // com.applovin.shadow.okhttp3.Call
    public boolean isExecuted() {
        return this.executed.get();
    }

    private final void callStart() {
        this.callStackTrace = Platform.INSTANCE.get().getStackTraceForCloseable("response.body().close()");
        this.eventListener.callStart(this);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x00a2  */
    @NotNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Response getResponseWithInterceptorChain$okhttp() throws IOException {
        ArrayList arrayList = new ArrayList();
        CollectionsKt.addAll(arrayList, this.client.interceptors());
        arrayList.add(new RetryAndFollowUpInterceptor(this.client));
        arrayList.add(new BridgeInterceptor(this.client.cookieJar()));
        arrayList.add(new CacheInterceptor(this.client.cache()));
        arrayList.add(ConnectInterceptor.INSTANCE);
        if (!this.forWebSocket) {
            CollectionsKt.addAll(arrayList, this.client.networkInterceptors());
        }
        arrayList.add(new CallServerInterceptor(this.forWebSocket));
        boolean z = false;
        try {
            Response proceed = new RealInterceptorChain(this, arrayList, 0, null, this.originalRequest, this.client.connectTimeoutMillis(), this.client.readTimeoutMillis(), this.client.writeTimeoutMillis()).proceed(this.originalRequest);
            if (getCanceled()) {
                Util.closeQuietly(proceed);
                throw new IOException("Canceled");
            }
            noMoreExchanges$okhttp(null);
            return proceed;
        } catch (IOException e) {
            try {
                IOException noMoreExchanges$okhttp = noMoreExchanges$okhttp(e);
                Intrinsics.checkNotNull(noMoreExchanges$okhttp, "null cannot be cast to non-null type kotlin.Throwable");
                throw noMoreExchanges$okhttp;
            } catch (Throwable th) {
                th = th;
                z = true;
                if (!z) {
                    noMoreExchanges$okhttp(null);
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            if (!z) {
            }
            throw th;
        }
    }

    public final void enterNetworkInterceptorExchange(@NotNull Request request, boolean newExchangeFinder) {
        Intrinsics.checkNotNullParameter(request, "request");
        if (this.interceptorScopedExchange != null) {
            throw new IllegalStateException("Check failed.");
        }
        synchronized (this) {
            if (this.responseBodyOpen) {
                throw new IllegalStateException("cannot make a new request because the previous response is still open: please call response.close()");
            }
            if (this.requestBodyOpen) {
                throw new IllegalStateException("Check failed.");
            }
            Unit unit = Unit.INSTANCE;
        }
        if (newExchangeFinder) {
            this.exchangeFinder = new ExchangeFinder(this.connectionPool, createAddress(request.url()), this, this.eventListener);
        }
    }

    @NotNull
    public final Exchange initExchange$okhttp(@NotNull RealInterceptorChain chain) {
        Intrinsics.checkNotNullParameter(chain, "chain");
        synchronized (this) {
            if (!this.expectMoreExchanges) {
                throw new IllegalStateException("released");
            }
            if (this.responseBodyOpen) {
                throw new IllegalStateException("Check failed.");
            }
            if (this.requestBodyOpen) {
                throw new IllegalStateException("Check failed.");
            }
            Unit unit = Unit.INSTANCE;
        }
        ExchangeFinder exchangeFinder = this.exchangeFinder;
        Intrinsics.checkNotNull(exchangeFinder);
        Exchange exchange = new Exchange(this, this.eventListener, exchangeFinder, exchangeFinder.find(this.client, chain));
        this.interceptorScopedExchange = exchange;
        this.exchange = exchange;
        synchronized (this) {
            this.requestBodyOpen = true;
            this.responseBodyOpen = true;
        }
        if (this.canceled) {
            throw new IOException("Canceled");
        }
        return exchange;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0021 A[Catch: all -> 0x0017, TryCatch #0 {all -> 0x0017, blocks: (B:44:0x0012, B:12:0x0021, B:14:0x0025, B:15:0x0027, B:17:0x002c, B:21:0x0035, B:23:0x0039, B:27:0x0042, B:9:0x001b), top: B:43:0x0012 }] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0025 A[Catch: all -> 0x0017, TryCatch #0 {all -> 0x0017, blocks: (B:44:0x0012, B:12:0x0021, B:14:0x0025, B:15:0x0027, B:17:0x002c, B:21:0x0035, B:23:0x0039, B:27:0x0042, B:9:0x001b), top: B:43:0x0012 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final <E extends IOException> E messageDone$okhttp(@NotNull Exchange exchange, boolean z, boolean z2, E e) {
        boolean z3;
        boolean z4;
        boolean z5;
        Intrinsics.checkNotNullParameter(exchange, "exchange");
        if (!Intrinsics.areEqual(exchange, this.exchange)) {
            return e;
        }
        synchronized (this) {
            z3 = false;
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
                    z5 = this.requestBodyOpen;
                    boolean z6 = z5 && !this.responseBodyOpen;
                    if (!z5 && !this.responseBodyOpen && !this.expectMoreExchanges) {
                        z3 = true;
                    }
                    z4 = z3;
                    z3 = z6;
                    Unit unit = Unit.INSTANCE;
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (!z2 || !this.responseBodyOpen) {
                z4 = false;
                Unit unit2 = Unit.INSTANCE;
            }
            if (z) {
            }
            if (z2) {
            }
            z5 = this.requestBodyOpen;
            if (z5) {
            }
            if (!z5) {
                z3 = true;
            }
            z4 = z3;
            z3 = z6;
            Unit unit22 = Unit.INSTANCE;
        }
        if (z3) {
            this.exchange = null;
            RealConnection realConnection = this.connection;
            if (realConnection != null) {
                realConnection.incrementSuccessCount$okhttp();
            }
        }
        return z4 ? (E) callDone(e) : e;
    }

    @Nullable
    public final IOException noMoreExchanges$okhttp(@Nullable IOException e) {
        boolean z;
        synchronized (this) {
            try {
                z = false;
                if (this.expectMoreExchanges) {
                    this.expectMoreExchanges = false;
                    if (!this.requestBodyOpen && !this.responseBodyOpen) {
                        z = true;
                    }
                }
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th) {
                throw th;
            }
        }
        return z ? callDone(e) : e;
    }

    @Nullable
    public final Socket releaseConnectionNoEvents$okhttp() {
        RealConnection realConnection = this.connection;
        Intrinsics.checkNotNull(realConnection);
        if (!Util.assertionsEnabled || Thread.holdsLock(realConnection)) {
            List<Reference<RealCall>> calls = realConnection.getCalls();
            Iterator<Reference<RealCall>> it = calls.iterator();
            int i = 0;
            while (true) {
                if (!it.hasNext()) {
                    i = -1;
                    break;
                }
                if (Intrinsics.areEqual(it.next().get(), this)) {
                    break;
                }
                i++;
            }
            if (i == -1) {
                throw new IllegalStateException("Check failed.");
            }
            calls.remove(i);
            this.connection = null;
            if (calls.isEmpty()) {
                realConnection.setIdleAtNs$okhttp(System.nanoTime());
                if (this.connectionPool.connectionBecameIdle(realConnection)) {
                    return realConnection.socket();
                }
            }
            return null;
        }
        throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST hold lock on " + realConnection);
    }

    private final <E extends IOException> E timeoutExit(E cause) {
        if (this.timeoutEarlyExit || !exit()) {
            return cause;
        }
        InterruptedIOException interruptedIOException = new InterruptedIOException("timeout");
        if (cause != null) {
            interruptedIOException.initCause(cause);
        }
        return interruptedIOException;
    }

    public final void timeoutEarlyExit() {
        if (this.timeoutEarlyExit) {
            throw new IllegalStateException("Check failed.");
        }
        this.timeoutEarlyExit = true;
        exit();
    }

    public final void exitNetworkInterceptorExchange$okhttp(boolean closeExchange) {
        Exchange exchange;
        synchronized (this) {
            if (!this.expectMoreExchanges) {
                throw new IllegalStateException("released");
            }
            Unit unit = Unit.INSTANCE;
        }
        if (closeExchange && (exchange = this.exchange) != null) {
            exchange.detachWithViolence();
        }
        this.interceptorScopedExchange = null;
    }

    private final Address createAddress(HttpUrl url) {
        SSLSocketFactory sSLSocketFactory;
        HostnameVerifier hostnameVerifier;
        CertificatePinner certificatePinner;
        if (url.getIsHttps()) {
            sSLSocketFactory = this.client.sslSocketFactory();
            hostnameVerifier = this.client.hostnameVerifier();
            certificatePinner = this.client.certificatePinner();
        } else {
            sSLSocketFactory = null;
            hostnameVerifier = null;
            certificatePinner = null;
        }
        return new Address(url.host(), url.port(), this.client.dns(), this.client.socketFactory(), sSLSocketFactory, hostnameVerifier, certificatePinner, this.client.proxyAuthenticator(), this.client.proxy(), this.client.protocols(), this.client.connectionSpecs(), this.client.proxySelector());
    }

    public final boolean retryAfterFailure() {
        ExchangeFinder exchangeFinder = this.exchangeFinder;
        Intrinsics.checkNotNull(exchangeFinder);
        return exchangeFinder.retryAfterFailure();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String toLoggableString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getCanceled() ? "canceled " : "");
        sb.append(this.forWebSocket ? "web socket" : NotificationCompat.CATEGORY_CALL);
        sb.append(" to ");
        sb.append(redactedUrl$okhttp());
        return sb.toString();
    }

    @NotNull
    public final String redactedUrl$okhttp() {
        return this.originalRequest.url().redact();
    }

    /* compiled from: RealCall.kt */
    @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0080\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u000e\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0019J\u0012\u0010\u001a\u001a\u00020\u00172\n\u0010\u001b\u001a\u00060\u0000R\u00020\u0006J\b\u0010\u001c\u001a\u00020\u0017H\u0016R\u0011\u0010\u0005\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u001e\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\n@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u000e\u001a\u00020\u000f8F¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0012\u001a\u00020\u00138F¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001d"}, d2 = {"Lcom/applovin/shadow/okhttp3/internal/connection/RealCall$AsyncCall;", "Ljava/lang/Runnable;", "responseCallback", "Lcom/applovin/shadow/okhttp3/Callback;", "(Lokhttp3/internal/connection/RealCall;Lokhttp3/Callback;)V", NotificationCompat.CATEGORY_CALL, "Lcom/applovin/shadow/okhttp3/internal/connection/RealCall;", "getCall", "()Lokhttp3/internal/connection/RealCall;", "<set-?>", "Ljava/util/concurrent/atomic/AtomicInteger;", "callsPerHost", "getCallsPerHost", "()Ljava/util/concurrent/atomic/AtomicInteger;", "host", "", "getHost", "()Ljava/lang/String;", "request", "Lcom/applovin/shadow/okhttp3/Request;", "getRequest", "()Lokhttp3/Request;", "executeOn", "", "executorService", "Ljava/util/concurrent/ExecutorService;", "reuseCallsPerHostFrom", "other", "run", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public final class AsyncCall implements Runnable {

        @NotNull
        private volatile AtomicInteger callsPerHost;

        @NotNull
        private final Callback responseCallback;
        final /* synthetic */ RealCall this$0;

        public AsyncCall(@NotNull RealCall realCall, Callback responseCallback) {
            Intrinsics.checkNotNullParameter(responseCallback, "responseCallback");
            this.this$0 = realCall;
            this.responseCallback = responseCallback;
            this.callsPerHost = new AtomicInteger(0);
        }

        @NotNull
        public final AtomicInteger getCallsPerHost() {
            return this.callsPerHost;
        }

        public final void reuseCallsPerHostFrom(@NotNull AsyncCall other) {
            Intrinsics.checkNotNullParameter(other, "other");
            this.callsPerHost = other.callsPerHost;
        }

        @NotNull
        public final String getHost() {
            return this.this$0.getOriginalRequest().url().host();
        }

        @NotNull
        public final Request getRequest() {
            return this.this$0.getOriginalRequest();
        }

        @NotNull
        /* renamed from: getCall, reason: from getter */
        public final RealCall getThis$0() {
            return this.this$0;
        }

        public final void executeOn(@NotNull ExecutorService executorService) {
            Intrinsics.checkNotNullParameter(executorService, "executorService");
            Dispatcher dispatcher = this.this$0.getClient().dispatcher();
            if (!Util.assertionsEnabled || !Thread.holdsLock(dispatcher)) {
                try {
                    try {
                        executorService.execute(this);
                        return;
                    } catch (RejectedExecutionException e) {
                        InterruptedIOException interruptedIOException = new InterruptedIOException("executor rejected");
                        interruptedIOException.initCause(e);
                        this.this$0.noMoreExchanges$okhttp(interruptedIOException);
                        this.responseCallback.onFailure(this.this$0, interruptedIOException);
                        this.this$0.getClient().dispatcher().finished$okhttp(this);
                        return;
                    }
                } catch (Throwable th) {
                    this.this$0.getClient().dispatcher().finished$okhttp(this);
                    throw th;
                }
            }
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + dispatcher);
        }

        @Override // java.lang.Runnable
        public void run() {
            boolean z;
            Throwable th;
            IOException e;
            Dispatcher dispatcher;
            String str = "OkHttp " + this.this$0.redactedUrl$okhttp();
            RealCall realCall = this.this$0;
            Thread currentThread = Thread.currentThread();
            String name = currentThread.getName();
            currentThread.setName(str);
            try {
                realCall.timeout.enter();
                try {
                    try {
                        z = true;
                        try {
                            this.responseCallback.onResponse(realCall, realCall.getResponseWithInterceptorChain$okhttp());
                            dispatcher = realCall.getClient().dispatcher();
                        } catch (IOException e2) {
                            e = e2;
                            if (z) {
                                Platform.INSTANCE.get().log("Callback failure for " + realCall.toLoggableString(), 4, e);
                            } else {
                                this.responseCallback.onFailure(realCall, e);
                            }
                            dispatcher = realCall.getClient().dispatcher();
                            dispatcher.finished$okhttp(this);
                        } catch (Throwable th2) {
                            th = th2;
                            realCall.cancel();
                            if (!z) {
                                IOException iOException = new IOException("canceled due to " + th);
                                ExceptionsKt.addSuppressed(iOException, th);
                                this.responseCallback.onFailure(realCall, iOException);
                            }
                            throw th;
                        }
                    } catch (Throwable th3) {
                        realCall.getClient().dispatcher().finished$okhttp(this);
                        throw th3;
                    }
                } catch (IOException e3) {
                    z = false;
                    e = e3;
                } catch (Throwable th4) {
                    z = false;
                    th = th4;
                }
                dispatcher.finished$okhttp(this);
            } finally {
                currentThread.setName(name);
            }
        }
    }

    /* compiled from: RealCall.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/applovin/shadow/okhttp3/internal/connection/RealCall$CallReference;", "Ljava/lang/ref/WeakReference;", "Lcom/applovin/shadow/okhttp3/internal/connection/RealCall;", "referent", "callStackTrace", "", "(Lokhttp3/internal/connection/RealCall;Ljava/lang/Object;)V", "getCallStackTrace", "()Ljava/lang/Object;", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class CallReference extends WeakReference<RealCall> {

        @Nullable
        private final Object callStackTrace;

        @Nullable
        public final Object getCallStackTrace() {
            return this.callStackTrace;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public CallReference(@NotNull RealCall referent, @Nullable Object obj) {
            super(referent);
            Intrinsics.checkNotNullParameter(referent, "referent");
            this.callStackTrace = obj;
        }
    }

    public final void acquireConnectionNoEvents(@NotNull RealConnection connection) {
        Intrinsics.checkNotNullParameter(connection, "connection");
        if (!Util.assertionsEnabled || Thread.holdsLock(connection)) {
            if (this.connection != null) {
                throw new IllegalStateException("Check failed.");
            }
            this.connection = connection;
            connection.getCalls().add(new CallReference(this, this.callStackTrace));
            return;
        }
        throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST hold lock on " + connection);
    }

    private final <E extends IOException> E callDone(E e) {
        Socket releaseConnectionNoEvents$okhttp;
        boolean z = Util.assertionsEnabled;
        if (!z || !Thread.holdsLock(this)) {
            RealConnection realConnection = this.connection;
            if (realConnection != null) {
                if (!z || !Thread.holdsLock(realConnection)) {
                    synchronized (realConnection) {
                        releaseConnectionNoEvents$okhttp = releaseConnectionNoEvents$okhttp();
                    }
                    if (this.connection == null) {
                        if (releaseConnectionNoEvents$okhttp != null) {
                            Util.closeQuietly(releaseConnectionNoEvents$okhttp);
                        }
                        this.eventListener.connectionReleased(this, realConnection);
                    } else if (releaseConnectionNoEvents$okhttp != null) {
                        throw new IllegalStateException("Check failed.");
                    }
                } else {
                    throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + realConnection);
                }
            }
            E e2 = (E) timeoutExit(e);
            if (e != null) {
                EventListener eventListener = this.eventListener;
                Intrinsics.checkNotNull(e2);
                eventListener.callFailed(this, e2);
            } else {
                this.eventListener.callEnd(this);
            }
            return e2;
        }
        throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + this);
    }
}
