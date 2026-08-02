package com.withpersona.sdk2.inquiry.internal.network;

import bo.app.a$$ExternalSyntheticBUOutline0;
import com.withpersona.sdk2.inquiry.internal.network.VerifyDeviceIntegrityRequest;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import papa.SafeTrace;

/* loaded from: classes9.dex */
public final class InquiryApiHelper$verifyDeviceIntegrity$verifyDeviceIntegrityError$1 extends SuspendLambda implements Function1 {
    public final /* synthetic */ String $sessionToken;
    public final /* synthetic */ String $token;
    public int label;
    public final /* synthetic */ InquiryApiHelper this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InquiryApiHelper$verifyDeviceIntegrity$verifyDeviceIntegrityError$1(InquiryApiHelper inquiryApiHelper, String str, String str2, Continuation continuation) {
        super(1, continuation);
        this.this$0 = inquiryApiHelper;
        this.$sessionToken = str;
        this.$token = str2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new InquiryApiHelper$verifyDeviceIntegrity$verifyDeviceIntegrityError$1(this.this$0, this.$sessionToken, this.$token, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((InquiryApiHelper$verifyDeviceIntegrity$verifyDeviceIntegrityError$1) create((Continuation) obj)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i != 0) {
            if (i == 1) {
                SafeTrace.throwOnFailure(obj);
                return obj;
            }
            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        SafeTrace.throwOnFailure(obj);
        InquiryApiHelper inquiryApiHelper = this.this$0;
        InquiryService inquiryService = inquiryApiHelper.service;
        VerifyDeviceIntegrityRequest verifyDeviceIntegrityRequest = new VerifyDeviceIntegrityRequest(new VerifyDeviceIntegrityRequest.Meta(inquiryApiHelper.applicationContext.getPackageName(), this.$token));
        this.label = 1;
        Object verifyDeviceIntegrity = inquiryService.verifyDeviceIntegrity(this.$sessionToken, verifyDeviceIntegrityRequest, this);
        return verifyDeviceIntegrity == coroutineSingletons ? coroutineSingletons : verifyDeviceIntegrity;
    }
}
