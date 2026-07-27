package com.onesignal.common.exceptions;

import kotlin.jvm.internal.e;

/* loaded from: classes.dex */
public final class BackendException extends Exception {
    private final String response;
    private final Integer retryAfterSeconds;
    private final int statusCode;

    public /* synthetic */ BackendException(int i2, String str, Integer num, int i3, e eVar) {
        this(i2, (i3 & 2) != 0 ? null : str, (i3 & 4) != 0 ? null : num);
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

    public BackendException(int i2, String str, Integer num) {
        this.statusCode = i2;
        this.response = str;
        this.retryAfterSeconds = num;
    }
}
