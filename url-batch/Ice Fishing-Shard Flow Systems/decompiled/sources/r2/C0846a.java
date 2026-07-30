package r2;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: r2.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0846a extends Exception {
    private final String response;
    private final Integer retryAfterSeconds;
    private final int statusCode;

    public /* synthetic */ C0846a(int i2, String str, Integer num, int i5, DefaultConstructorMarker defaultConstructorMarker) {
        this(i2, (i5 & 2) != 0 ? null : str, (i5 & 4) != 0 ? null : num);
    }

    public final String getResponse() {
        return this.response;
    }

    public final Integer getRetryAfterSeconds() {
        return this.retryAfterSeconds;
    }

    public final int getStatusCode() {
        return this.statusCode;
    }

    public C0846a(int i2, String str, Integer num) {
        this.statusCode = i2;
        this.response = str;
        this.retryAfterSeconds = num;
    }
}
