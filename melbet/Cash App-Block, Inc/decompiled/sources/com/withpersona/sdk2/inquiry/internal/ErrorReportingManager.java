package com.withpersona.sdk2.inquiry.internal;

import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.internal.Util;
import com.withpersona.sdk2.inquiry.internal.network.ErrorRequest;
import com.withpersona.sdk2.inquiry.internal.network.InquiryService;
import com.withpersona.sdk2.inquiry.logger.LogLevel;
import com.withpersona.sdk2.inquiry.logger.Logger;
import com.withpersona.sdk2.inquiry.logger.Logger$_log$2;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.text.StringsKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.internal.ContextScope;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;

/* loaded from: classes9.dex */
public final class ErrorReportingManager {
    public final ContextScope coroutineScope;
    public final InquiryService inquiryService;
    public final Logger logger;
    public final Moshi moshi;

    public ErrorReportingManager(InquiryService inquiryService, Moshi moshi, Logger logger) {
        inquiryService.getClass();
        moshi.getClass();
        logger.getClass();
        this.inquiryService = inquiryService;
        this.moshi = moshi;
        this.logger = logger;
        this.coroutineScope = JobKt.CoroutineScope(Dispatchers.Default.plus(JobKt.SupervisorJob$default()));
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0098, code lost:
    
        if (r13.inquiryService.reportError(r14, r5, r1) != r2) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x009a, code lost:
    
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x005e, code lost:
    
        if (r3 == r2) goto L29;
     */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object reportError(String str, String str2, ErrorRequest.ErrorType errorType, LogLevel logLevel, ContinuationImpl continuationImpl) {
        ErrorReportingManager$reportError$2 errorReportingManager$reportError$2;
        int i;
        ErrorRequest.ErrorType errorType2;
        Object withContext;
        String str3;
        if (continuationImpl instanceof ErrorReportingManager$reportError$2) {
            errorReportingManager$reportError$2 = (ErrorReportingManager$reportError$2) continuationImpl;
            int i2 = errorReportingManager$reportError$2.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                errorReportingManager$reportError$2.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = errorReportingManager$reportError$2.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = errorReportingManager$reportError$2.label;
                Continuation continuation = null;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    errorReportingManager$reportError$2.L$0 = str;
                    errorType2 = errorType;
                    errorReportingManager$reportError$2.L$1 = errorType2;
                    errorReportingManager$reportError$2.label = 1;
                    Logger logger = this.logger;
                    withContext = JobKt.withContext(logger.loggerContext, new Logger$_log$2(logger, str2, logLevel, continuation, 26), errorReportingManager$reportError$2);
                } else {
                    if (i != 1) {
                        if (i == 2) {
                            SafeTrace.throwOnFailure(obj);
                            return Unit.INSTANCE;
                        }
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ErrorRequest.ErrorType errorType3 = errorReportingManager$reportError$2.L$1;
                    String str4 = errorReportingManager$reportError$2.L$0;
                    SafeTrace.throwOnFailure(obj);
                    errorType2 = errorType3;
                    str = str4;
                    withContext = obj;
                }
                str3 = (String) withContext;
                if (str3 == null && !StringsKt.isBlank(str3)) {
                    Moshi moshi = this.moshi;
                    moshi.getClass();
                    ErrorRequest errorRequest = new ErrorRequest(errorType2, moshi.adapter(ErrorLog.class, Util.NO_ANNOTATIONS, null).toJsonValue(new ErrorLog(str3)));
                    errorReportingManager$reportError$2.L$0 = null;
                    errorReportingManager$reportError$2.L$1 = null;
                    errorReportingManager$reportError$2.label = 2;
                }
                return Unit.INSTANCE;
            }
        }
        errorReportingManager$reportError$2 = new ErrorReportingManager$reportError$2(this, continuationImpl);
        Object obj2 = errorReportingManager$reportError$2.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = errorReportingManager$reportError$2.label;
        Continuation continuation2 = null;
        if (i != 0) {
        }
        str3 = (String) withContext;
        if (str3 == null) {
            return Unit.INSTANCE;
        }
        Moshi moshi2 = this.moshi;
        moshi2.getClass();
        ErrorRequest errorRequest2 = new ErrorRequest(errorType2, moshi2.adapter(ErrorLog.class, Util.NO_ANNOTATIONS, null).toJsonValue(new ErrorLog(str3)));
        errorReportingManager$reportError$2.L$0 = null;
        errorReportingManager$reportError$2.L$1 = null;
        errorReportingManager$reportError$2.label = 2;
    }
}
