package ka;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class a {
    private final String payload;
    private final Integer retryAfterSeconds;
    private final Integer retryLimit;
    private final int statusCode;
    private final Throwable throwable;

    public /* synthetic */ a(int i3, String str, Throwable th, Integer num, Integer num2, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(i3, str, (i10 & 4) != 0 ? null : th, (i10 & 8) != 0 ? null : num, (i10 & 16) != 0 ? null : num2);
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

    public final boolean isSuccess() {
        int i3 = this.statusCode;
        return i3 == 200 || i3 == 202 || i3 == 304 || i3 == 201;
    }

    public a(int i3, String str, Throwable th, Integer num, Integer num2) {
        this.statusCode = i3;
        this.payload = str;
        this.throwable = th;
        this.retryAfterSeconds = num;
        this.retryLimit = num2;
    }
}
