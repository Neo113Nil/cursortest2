package com.withpersona.sdk2.inquiry.internal.network;

import bo.app.a$$ExternalSyntheticBUOutline0;
import com.withpersona.sdk2.inquiry.internal.network.UpdateInquirySessionRequest;
import com.withpersona.sdk2.inquiry.shared.inquiry_session.GpsData;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import papa.SafeTrace;

/* loaded from: classes9.dex */
public final class InquiryApiHelper$updateInquiryInternal$updateInquiryError$1 extends SuspendLambda implements Function1 {
    public final /* synthetic */ GpsData $gpsData;
    public final /* synthetic */ String $sessionToken;
    public int label;
    public final /* synthetic */ InquiryApiHelper this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InquiryApiHelper$updateInquiryInternal$updateInquiryError$1(InquiryApiHelper inquiryApiHelper, String str, GpsData gpsData, Continuation continuation) {
        super(1, continuation);
        this.this$0 = inquiryApiHelper;
        this.$sessionToken = str;
        this.$gpsData = gpsData;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new InquiryApiHelper$updateInquiryInternal$updateInquiryError$1(this.this$0, this.$sessionToken, this.$gpsData, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((InquiryApiHelper$updateInquiryInternal$updateInquiryError$1) create((Continuation) obj)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        String str = null;
        if (i != 0) {
            if (i == 1) {
                SafeTrace.throwOnFailure(obj);
                return obj;
            }
            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        SafeTrace.throwOnFailure(obj);
        InquiryService inquiryService = this.this$0.service;
        GpsData gpsData = this.$gpsData;
        Double d = gpsData != null ? new Double(gpsData.location.getLatitude()) : null;
        Double d2 = gpsData != null ? new Double(gpsData.location.getLongitude()) : null;
        if (gpsData != null) {
            int ordinal = gpsData.precision.ordinal();
            if (ordinal == 0) {
                str = "rough";
            } else {
                if (ordinal != 1) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return null;
                }
                str = "precise";
            }
        }
        UpdateInquirySessionRequest updateInquirySessionRequest = new UpdateInquirySessionRequest(new UpdateInquirySessionRequest.Data(new UpdateInquirySessionRequest.Attributes(d2, d, str, null, null, null, null, 112, null)));
        this.label = 1;
        Object updateInquiry = inquiryService.updateInquiry(this.$sessionToken, updateInquirySessionRequest, this);
        return updateInquiry == coroutineSingletons ? coroutineSingletons : updateInquiry;
    }
}
