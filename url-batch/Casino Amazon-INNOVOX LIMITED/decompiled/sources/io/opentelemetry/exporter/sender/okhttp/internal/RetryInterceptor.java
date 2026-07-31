package io.opentelemetry.exporter.sender.okhttp.internal;

import io.appmetrica.analytics.coreutils.internal.StringUtils;
import io.opentelemetry.sdk.common.export.RetryPolicy;
import java.io.IOException;
import java.net.ConnectException;
import java.net.SocketException;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import java.util.Map;
import java.util.Objects;
import java.util.StringJoiner;
import java.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.stream.Collectors;
import kotlin.UByte$$ExternalSyntheticBackport0;
import okhttp3.Interceptor;
import okhttp3.Response;

/* loaded from: classes3.dex */
public final class RetryInterceptor implements Interceptor {
    private static final Logger logger = Logger.getLogger(RetryInterceptor.class.getName());
    private final Function<Response, Boolean> isRetryable;
    private final Supplier<Double> randomJitter;
    private final Predicate<IOException> retryExceptionPredicate;
    private final RetryPolicy retryPolicy;
    private final Sleeper sleeper;

    interface Sleeper {
        void sleep(long j) throws InterruptedException;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public RetryInterceptor(RetryPolicy retryPolicy, Function<Response, Boolean> function) {
        this(retryPolicy, function, r4, new Sleeper() { // from class: io.opentelemetry.exporter.sender.okhttp.internal.RetryInterceptor$$ExternalSyntheticLambda2
            @Override // io.opentelemetry.exporter.sender.okhttp.internal.RetryInterceptor.Sleeper
            public final void sleep(long j) {
                r1.sleep(j);
            }
        }, new Supplier() { // from class: io.opentelemetry.exporter.sender.okhttp.internal.RetryInterceptor$$ExternalSyntheticLambda3
            @Override // java.util.function.Supplier
            public final Object get() {
                Double valueOf;
                valueOf = Double.valueOf(ThreadLocalRandom.current().nextDouble(0.8d, 1.2d));
                return valueOf;
            }
        });
        Predicate<IOException> retryExceptionPredicate;
        if (retryPolicy.getRetryExceptionPredicate() == null) {
            retryExceptionPredicate = new Predicate() { // from class: io.opentelemetry.exporter.sender.okhttp.internal.RetryInterceptor$$ExternalSyntheticLambda1
                @Override // java.util.function.Predicate
                public final boolean test(Object obj) {
                    return RetryInterceptor.isRetryableException((IOException) obj);
                }
            };
        } else {
            retryExceptionPredicate = retryPolicy.getRetryExceptionPredicate();
        }
        Predicate<IOException> predicate = retryExceptionPredicate;
        final TimeUnit timeUnit = TimeUnit.NANOSECONDS;
        Objects.requireNonNull(timeUnit);
    }

    RetryInterceptor(RetryPolicy retryPolicy, Function<Response, Boolean> function, Predicate<IOException> predicate, Sleeper sleeper, Supplier<Double> supplier) {
        this.retryPolicy = retryPolicy;
        this.isRetryable = function;
        this.retryExceptionPredicate = predicate;
        this.sleeper = sleeper;
        this.randomJitter = supplier;
    }

    @Override // okhttp3.Interceptor
    public Response intercept(Interceptor.Chain chain) throws IOException {
        long nanos = this.retryPolicy.getInitialBackoff().toNanos();
        int i = 0;
        Response response = null;
        IOException iOException = null;
        do {
            if (i > 0) {
                double min = Math.min(nanos, this.retryPolicy.getMaxBackoff().toNanos());
                long doubleValue = (long) (this.randomJitter.get().doubleValue() * min);
                nanos = (long) (min * this.retryPolicy.getBackoffMultiplier());
                try {
                    this.sleeper.sleep(doubleValue);
                    if (response != null) {
                        response.close();
                    }
                    iOException = null;
                } catch (InterruptedException unused) {
                    Thread.currentThread().interrupt();
                }
            }
            try {
                response = chain.proceed(chain.request());
            } catch (IOException e) {
                boolean test = this.retryExceptionPredicate.test(e);
                Logger logger2 = logger;
                if (logger2.isLoggable(Level.FINER)) {
                    logger2.log(Level.FINER, "Attempt " + i + " failed with " + (test ? "retryable" : "non-retryable") + " exception", (Throwable) e);
                }
                if (!test) {
                    throw e;
                }
                iOException = e;
                response = null;
            }
            if (response != null) {
                boolean equals = Boolean.TRUE.equals(this.isRetryable.apply(response));
                Logger logger3 = logger;
                if (logger3.isLoggable(Level.FINER)) {
                    logger3.log(Level.FINER, "Attempt " + i + " returned " + (equals ? "retryable" : "non-retryable") + " response: " + responseStringRepresentation(response));
                }
                if (!equals) {
                    return response;
                }
                i++;
            } else {
                throw new NullPointerException("response cannot be null.");
            }
        } while (i < this.retryPolicy.getMaxAttempts());
        if (response != null) {
            return response;
        }
        throw iOException;
    }

    private static String responseStringRepresentation(Response response) {
        StringJoiner stringJoiner = new StringJoiner(StringUtils.COMMA, "Response{", "}");
        stringJoiner.add("code=" + response.code());
        stringJoiner.add("headers=" + ((String) response.headers().toMultimap().entrySet().stream().map(new Function() { // from class: io.opentelemetry.exporter.sender.okhttp.internal.RetryInterceptor$$ExternalSyntheticLambda0
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return RetryInterceptor.lambda$responseStringRepresentation$1((Map.Entry) obj);
            }
        }).collect(Collectors.joining(StringUtils.COMMA, "[", "]"))));
        return stringJoiner.toString();
    }

    static /* synthetic */ String lambda$responseStringRepresentation$1(Map.Entry entry) {
        return ((String) entry.getKey()) + "=" + UByte$$ExternalSyntheticBackport0.m(StringUtils.COMMA, (Iterable) entry.getValue());
    }

    boolean shouldRetryOnException(IOException iOException) {
        return this.retryExceptionPredicate.test(iOException);
    }

    static boolean isRetryableException(IOException iOException) {
        return (iOException instanceof SocketTimeoutException) || (iOException instanceof ConnectException) || (iOException instanceof UnknownHostException) || (iOException instanceof SocketException);
    }
}
