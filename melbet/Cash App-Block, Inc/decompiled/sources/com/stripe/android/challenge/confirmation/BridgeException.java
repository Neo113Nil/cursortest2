package com.stripe.android.challenge.confirmation;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\b\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/stripe/android/challenge/confirmation/BridgeException;", "", "payments-core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class BridgeException extends Throwable {
    public final Throwable cause;
    public final String code;
    public final String message;

    /* renamed from: type, reason: collision with root package name */
    public final String f1427type;

    public BridgeException(String str, String str2, String str3, Throwable th) {
        this.message = str;
        this.f1427type = str2;
        this.code = str3;
        this.cause = th;
    }

    @Override // java.lang.Throwable
    public final Throwable getCause() {
        return this.cause;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        return this.message;
    }

    public BridgeException(Throwable th) {
        this(th.getMessage(), null, null, th);
    }
}
