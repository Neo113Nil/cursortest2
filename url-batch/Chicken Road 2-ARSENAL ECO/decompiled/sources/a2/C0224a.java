package a2;

import kotlin.jvm.internal.e;

/* renamed from: a2.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0224a {
    private final String payload;
    private final Integer retryAfterSeconds;
    private final Integer retryLimit;
    private final int statusCode;
    private final Throwable throwable;

    public C0224a(int i7, String str, Throwable th, Integer num, Integer num2) {
        this.statusCode = i7;
        this.payload = str;
        this.throwable = th;
        this.retryAfterSeconds = num;
        this.retryLimit = num2;
    }

    public final String getPayload() {
        return this.payload;
    }

    public final Integer getRetryAfterSeconds() {
        return this.retryAfterSeconds;
    }

    public final Integer getRetryLimit() {
        return this.retryLimit;
    }

    public final int getStatusCode() {
        return this.statusCode;
    }

    public final Throwable getThrowable() {
        return this.throwable;
    }

    public final boolean isClientError() {
        int i7 = this.statusCode;
        return 400 <= i7 && i7 < 500;
    }

    public final boolean isSuccess() {
        int i7 = this.statusCode;
        return i7 == 200 || i7 == 202 || i7 == 304 || i7 == 201;
    }

    public /* synthetic */ C0224a(int i7, String str, Throwable th, Integer num, Integer num2, int i8, e eVar) {
        this(i7, str, (i8 & 4) != 0 ? null : th, (i8 & 8) != 0 ? null : num, (i8 & 16) != 0 ? null : num2);
    }
}
