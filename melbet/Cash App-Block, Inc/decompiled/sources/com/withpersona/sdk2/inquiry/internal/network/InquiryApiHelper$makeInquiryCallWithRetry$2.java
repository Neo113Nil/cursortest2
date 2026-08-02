package com.withpersona.sdk2.inquiry.internal.network;

import bo.app.a$$ExternalSyntheticBUOutline0;
import com.withpersona.sdk2.inquiry.network.core.InternalErrorInfo;
import com.withpersona.sdk2.inquiry.network.core.NetworkUtilsKt;
import java.io.IOException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref$ObjectRef;
import papa.SafeTrace;
import retrofit2.Response;

/* loaded from: classes9.dex */
public final class InquiryApiHelper$makeInquiryCallWithRetry$2 extends SuspendLambda implements Function2 {
    public final /* synthetic */ Function1 $inquiryCall;
    public final /* synthetic */ Ref$ObjectRef $lastError;
    public /* synthetic */ int I$0;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InquiryApiHelper$makeInquiryCallWithRetry$2(Function1 function1, Ref$ObjectRef ref$ObjectRef, Continuation continuation) {
        super(2, continuation);
        this.$inquiryCall = function1;
        this.$lastError = ref$ObjectRef;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        InquiryApiHelper$makeInquiryCallWithRetry$2 inquiryApiHelper$makeInquiryCallWithRetry$2 = new InquiryApiHelper$makeInquiryCallWithRetry$2(this.$inquiryCall, this.$lastError, continuation);
        inquiryApiHelper$makeInquiryCallWithRetry$2.I$0 = ((Number) obj).intValue();
        return inquiryApiHelper$makeInquiryCallWithRetry$2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((InquiryApiHelper$makeInquiryCallWithRetry$2) create(Integer.valueOf(((Number) obj).intValue()), (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x003a, code lost:
    
        if (r14 == r0) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x003c, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x002f, code lost:
    
        if (kotlinx.coroutines.JobKt.delay(1000, r13) == r0) goto L20;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        Ref$ObjectRef ref$ObjectRef = this.$lastError;
        try {
            if (i == 0) {
                SafeTrace.throwOnFailure(obj);
                if (this.I$0 > 0) {
                    this.label = 1;
                }
            } else {
                if (i != 1) {
                    if (i != 2) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                    Response response = (Response) obj;
                    if (response.rawResponse.isSuccessful) {
                        ref$ObjectRef.element = null;
                        return Boolean.FALSE;
                    }
                    InternalErrorInfo.NetworkErrorInfo errorInfo = NetworkUtilsKt.toErrorInfo(response);
                    ref$ObjectRef.element = errorInfo;
                    return Boolean.valueOf(errorInfo.isRecoverable());
                }
                SafeTrace.throwOnFailure(obj);
            }
            Function1 function1 = this.$inquiryCall;
            this.label = 2;
            obj = function1.invoke(this);
        } catch (IOException e) {
            ref$ObjectRef.element = new InternalErrorInfo.NetworkErrorInfo(0, e.getMessage(), true, null, 8, null);
            return Boolean.TRUE;
        }
    }
}
