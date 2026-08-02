package com.withpersona.sdk2.inquiry.internal;

import bo.app.a$$ExternalSyntheticBUOutline0;
import com.withpersona.sdk2.camera.CameraHelper$unbind$2;
import com.withpersona.sdk2.inquiry.internal.network.ErrorRequest;
import com.withpersona.sdk2.inquiry.internal.network.InquiryService;
import com.withpersona.sdk2.inquiry.logger.Logger;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.JobKt;
import papa.SafeTrace;

/* loaded from: classes9.dex */
public final class ErrorReportingManager$reportErrors$1 extends SuspendLambda implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ String $sessionToken;
    public int label;
    public final /* synthetic */ ErrorReportingManager this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ErrorReportingManager$reportErrors$1(ErrorReportingManager errorReportingManager, String str, Continuation continuation, int i) {
        super(2, continuation);
        this.$r8$classId = i;
        this.this$0 = errorReportingManager;
        this.$sessionToken = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        int i = this.$r8$classId;
        String str = this.$sessionToken;
        ErrorReportingManager errorReportingManager = this.this$0;
        switch (i) {
            case 0:
                return new ErrorReportingManager$reportErrors$1(errorReportingManager, str, continuation, 0);
            default:
                return new ErrorReportingManager$reportErrors$1(errorReportingManager, str, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        CoroutineScope coroutineScope = (CoroutineScope) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.$r8$classId) {
        }
        return ((ErrorReportingManager$reportErrors$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x00a3, code lost:
    
        if (r14 == r0) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x008a, code lost:
    
        if (r5.reportError(r6, "com.withpersona.sdk2.inquiry.integrity", r8, com.withpersona.sdk2.inquiry.logger.LogLevel.Error, r10) == r0) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x007b, code lost:
    
        if (r5.reportError(r6, com.withpersona.sdk2.inquiry.network.core.NetworkUtilsKt.SUBSYSTEM, r8, com.withpersona.sdk2.inquiry.logger.LogLevel.Error, r10) == r0) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x006c, code lost:
    
        if (r5.reportError(r6, "com.withpersona.sdk2.inquiry.nfc", r8, com.withpersona.sdk2.inquiry.logger.LogLevel.Error, r10) == r0) goto L39;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        ErrorReportingManager$reportErrors$1 errorReportingManager$reportErrors$1;
        Continuation continuation = null;
        switch (this.$r8$classId) {
            case 0:
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i = this.label;
                String str = this.$sessionToken;
                ErrorReportingManager errorReportingManager = this.this$0;
                if (i == 0) {
                    SafeTrace.throwOnFailure(obj);
                    ErrorRequest.ErrorType errorType = ErrorRequest.ErrorType.Nfc;
                    this.label = 1;
                    errorReportingManager$reportErrors$1 = this;
                    break;
                } else if (i == 1) {
                    SafeTrace.throwOnFailure(obj);
                    errorReportingManager$reportErrors$1 = this;
                } else if (i == 2) {
                    SafeTrace.throwOnFailure(obj);
                    errorReportingManager$reportErrors$1 = this;
                    ErrorRequest.ErrorType errorType2 = ErrorRequest.ErrorType.Other;
                    errorReportingManager$reportErrors$1.label = 3;
                    break;
                } else if (i == 3) {
                    SafeTrace.throwOnFailure(obj);
                    errorReportingManager$reportErrors$1 = this;
                    Logger logger = errorReportingManager.logger;
                    errorReportingManager$reportErrors$1.label = 4;
                    Object withContext = JobKt.withContext(logger.loggerContext, new CameraHelper$unbind$2(logger, continuation, 29), errorReportingManager$reportErrors$1);
                    if (withContext != obj2) {
                        withContext = Unit.INSTANCE;
                        break;
                    }
                } else if (i != 4) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                    break;
                }
                ErrorRequest.ErrorType errorType3 = ErrorRequest.ErrorType.Network;
                errorReportingManager$reportErrors$1.label = 2;
                break;
            default:
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i2 = this.label;
                if (i2 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    InquiryService inquiryService = this.this$0.inquiryService;
                    this.label = 1;
                    if (inquiryService.cancelCurrentInquirySession(this.$sessionToken, this) == coroutineSingletons) {
                        break;
                    }
                } else if (i2 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
