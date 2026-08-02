package okhttp3.internal.connection;

import bo.app.a$$ExternalSyntheticBUOutline0;
import java.util.concurrent.TimeUnit;
import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.Response;
import okhttp3.internal.http.ExchangeCodec;
import okhttp3.internal.http.RealInterceptorChain;
import okhttp3.internal.http1.Http1ExchangeCodec;
import okhttp3.internal.http2.Http2Connection;
import okhttp3.internal.http2.Http2ExchangeCodec;
import okio.RealBufferedSink;
import okio.RealBufferedSource;
import okio.Timeout;
import papa.internal.LaunchTracker;

/* loaded from: classes3.dex */
public final class ConnectInterceptor implements Interceptor {
    public static final ConnectInterceptor INSTANCE = new ConnectInterceptor();

    @Override // okhttp3.Interceptor
    public final Response intercept(Interceptor.Chain chain) {
        ExchangeCodec http1ExchangeCodec;
        RealInterceptorChain realInterceptorChain = (RealInterceptorChain) chain;
        RealCall realCall = realInterceptorChain.call;
        synchronized (realCall) {
            if (!realCall.expectMoreExchanges) {
                throw new IllegalStateException("released");
            }
            if (realCall.responseBodyOpen || realCall.requestBodyOpen || realCall.socketSourceOpen || realCall.socketSinkOpen) {
                throw new IllegalStateException("Check failed.");
            }
        }
        ExchangeFinder exchangeFinder = realCall.exchangeFinder;
        exchangeFinder.getClass();
        RealConnection find = exchangeFinder.find();
        OkHttpClient okHttpClient = realCall.client;
        find.getClass();
        okHttpClient.getClass();
        LaunchTracker launchTracker = find.socket;
        Http2Connection http2Connection = find.http2Connection;
        if (http2Connection != null) {
            http1ExchangeCodec = new Http2ExchangeCodec(okHttpClient, find, realInterceptorChain, http2Connection);
        } else {
            find.javaNetSocket.setSoTimeout(realInterceptorChain.readTimeoutMillis);
            Timeout timeout = ((RealBufferedSource) launchTracker.lastAppBecameInvisibleRealtimeMillis).source.timeout();
            long j = realInterceptorChain.readTimeoutMillis;
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            timeout.timeout(j, timeUnit);
            ((RealBufferedSink) launchTracker.launchInProgress).sink.timeout().timeout(realInterceptorChain.writeTimeoutMillis, timeUnit);
            http1ExchangeCodec = new Http1ExchangeCodec(okHttpClient, find, launchTracker);
        }
        Exchange exchange = new Exchange(realCall, exchangeFinder, http1ExchangeCodec);
        realCall.interceptorScopedExchange = exchange;
        realCall.exchange = exchange;
        synchronized (realCall) {
            realCall.requestBodyOpen = true;
            realCall.responseBodyOpen = true;
        }
        if (!realCall.canceled) {
            return RealInterceptorChain.copy$okhttp$default(realInterceptorChain, 0, exchange, null, 0, 2097149).proceed(realInterceptorChain.request);
        }
        a$$ExternalSyntheticBUOutline0.m$4("Canceled");
        return null;
    }
}
