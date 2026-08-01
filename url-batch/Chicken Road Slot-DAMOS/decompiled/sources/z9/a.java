package z9;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class a extends Exception {
    private final String response;
    private final Integer retryAfterSeconds;
    private final int statusCode;

    public /* synthetic */ a(int i3, String str, Integer num, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(i3, (i10 & 2) != 0 ? null : str, (i10 & 4) != 0 ? null : num);
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

    public a(int i3, String str, Integer num) {
        this.statusCode = i3;
        this.response = str;
        this.retryAfterSeconds = num;
    }
}
