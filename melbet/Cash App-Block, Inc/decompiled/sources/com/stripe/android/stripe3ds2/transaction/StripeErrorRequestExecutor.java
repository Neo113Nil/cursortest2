package com.stripe.android.stripe3ds2.transaction;

import com.squareup.scannerview.TextSetter;
import com.stripe.android.stripe3ds2.observability.DefaultErrorReporter;
import com.stripe.android.stripe3ds2.transactions.ErrorData;
import com.withpersona.sdk2.inquiry.logger.Logger$log$1;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.JobKt;

/* loaded from: classes9.dex */
public final class StripeErrorRequestExecutor {
    public final DefaultErrorReporter errorReporter;
    public final TextSetter httpClient;
    public final CoroutineContext workContext;

    public StripeErrorRequestExecutor(TextSetter textSetter, DefaultErrorReporter defaultErrorReporter, CoroutineContext coroutineContext) {
        coroutineContext.getClass();
        this.httpClient = textSetter;
        this.errorReporter = defaultErrorReporter;
        this.workContext = coroutineContext;
    }

    public final void executeAsync(ErrorData errorData) {
        Object failure;
        errorData.getClass();
        try {
            Result.Companion companion = Result.Companion;
            failure = errorData.toJson$3ds2sdk_release().toString();
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            failure = new Result.Failure(th);
        }
        Throwable m4120exceptionOrNullimpl = Result.m4120exceptionOrNullimpl(failure);
        if (m4120exceptionOrNullimpl != null) {
            this.errorReporter.reportError(new RuntimeException("Could not convert ErrorData to JSON.\n$" + errorData, m4120exceptionOrNullimpl));
        }
        Continuation continuation = null;
        if (failure instanceof Result.Failure) {
            failure = null;
        }
        String str = (String) failure;
        if (str != null) {
            JobKt.launch$default(JobKt.CoroutineScope(this.workContext), null, null, new Logger$log$1((Object) this, str, continuation, 9), 3);
        }
    }
}
