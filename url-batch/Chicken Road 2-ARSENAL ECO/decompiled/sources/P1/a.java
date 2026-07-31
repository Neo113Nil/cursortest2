package P1;

import kotlin.jvm.internal.e;

/* loaded from: classes.dex */
public final class a extends Exception {
    private final String response;
    private final Integer retryAfterSeconds;
    private final int statusCode;

    public /* synthetic */ a(int i7, String str, Integer num, int i8, e eVar) {
        this(i7, (i8 & 2) != 0 ? null : str, (i8 & 4) != 0 ? null : num);
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

    public a(int i7, String str, Integer num) {
        this.statusCode = i7;
        this.response = str;
        this.retryAfterSeconds = num;
    }
}
