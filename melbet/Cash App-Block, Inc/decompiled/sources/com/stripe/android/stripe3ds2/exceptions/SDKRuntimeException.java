package com.stripe.android.stripe3ds2.exceptions;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00060\u0001j\u0002`\u0002¨\u0006\u0003"}, d2 = {"Lcom/stripe/android/stripe3ds2/exceptions/SDKRuntimeException;", "Ljava/lang/RuntimeException;", "Lkotlin/RuntimeException;", "3ds2sdk_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class SDKRuntimeException extends RuntimeException {
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public SDKRuntimeException(Throwable th) {
        super(r0 == null ? "" : r0, th.getCause());
        String message = th.getMessage();
    }
}
