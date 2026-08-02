package com.stripe.android.challenge.confirmation;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\b\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/stripe/android/challenge/confirmation/WebViewError;", "", "payments-core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class WebViewError extends Throwable {
    public final Integer errorCode;
    public final String message;
    public final String webViewErrorType;

    public WebViewError(Integer num, String str, String str2) {
        this.message = str;
        this.errorCode = num;
        this.webViewErrorType = str2;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        return this.message;
    }
}
