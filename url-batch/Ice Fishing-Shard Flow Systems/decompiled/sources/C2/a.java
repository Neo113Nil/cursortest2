package C2;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes.dex */
public final class a {
    private final String payload;
    private final Integer retryAfterSeconds;
    private final Integer retryLimit;
    private final int statusCode;
    private final Throwable throwable;

    public a(int i2, String str, Throwable th, Integer num, Integer num2) {
        this.statusCode = i2;
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
        int i2 = this.statusCode;
        return 400 <= i2 && i2 < 500;
    }

    public final boolean isSuccess() {
        int i2 = this.statusCode;
        return i2 == 200 || i2 == 202 || i2 == 304 || i2 == 201;
    }

    public /* synthetic */ a(int i2, String str, Throwable th, Integer num, Integer num2, int i5, DefaultConstructorMarker defaultConstructorMarker) {
        this(i2, str, (i5 & 4) != 0 ? null : th, (i5 & 8) != 0 ? null : num, (i5 & 16) != 0 ? null : num2);
    }
}
