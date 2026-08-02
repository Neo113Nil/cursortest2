package com.squareup.cash.support.backend.real;

import app.cash.api.ApiResult;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.google.android.gms.internal.mlkit_vision_common.zzlp;
import com.google.android.gms.internal.mlkit_vision_common.zzlq;
import com.squareup.cash.shopping.web.ShoppingWebBridge;
import com.squareup.cash.support.backend.api.SupportPhoneService$CancelSupportPhoneResult;
import com.squareup.cash.support.backend.api.SupportPhoneStatus;
import com.squareup.protos.cash.supportal.app.CancelOutboundPhoneRequest;
import com.squareup.protos.cash.supportal.app.CancelOutboundPhoneResponse;
import com.squareup.protos.cash.supportal.app.SupportPhoneStatusRequest;
import com.squareup.protos.cash.supportal.app.SupportPhoneStatusResponse;
import com.squareup.protos.cash.supportal.app.SupportPhoneStatusResponse$Access$Denied;
import com.squareup.protos.cash.supportal.app.SupportPhoneStatusResponse$Access$Granted;
import com.squareup.protos.cash.supportal.app.SupportPhoneStatusResponse$Granted$State$Active;
import com.squareup.protos.cash.supportal.app.SupportPhoneStatusResponse$Granted$State$Idle;
import com.squareup.protos.cash.supportal.app.SupportalAppService;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.StateFlowImpl;
import okio.ByteString;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;

/* loaded from: classes.dex */
public final class RealSupportPhoneService {
    public final StateFlowImpl _phoneStatus = FlowKt.MutableStateFlow(SupportPhoneStatus.Undetermined.INSTANCE);
    public final CoroutineScope coroutineScope;
    public final SupportalAppService service;

    public RealSupportPhoneService(SupportalAppService supportalAppService, CoroutineScope coroutineScope) {
        this.service = supportalAppService;
        this.coroutineScope = coroutineScope;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object cancelPhoneRequest(ContinuationImpl continuationImpl) {
        RealSupportPhoneService$cancelPhoneRequest$1 realSupportPhoneService$cancelPhoneRequest$1;
        int i;
        ApiResult apiResult;
        if (continuationImpl instanceof RealSupportPhoneService$cancelPhoneRequest$1) {
            realSupportPhoneService$cancelPhoneRequest$1 = (RealSupportPhoneService$cancelPhoneRequest$1) continuationImpl;
            int i2 = realSupportPhoneService$cancelPhoneRequest$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                realSupportPhoneService$cancelPhoneRequest$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = realSupportPhoneService$cancelPhoneRequest$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = realSupportPhoneService$cancelPhoneRequest$1.label;
                Continuation continuation = null;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    CancelOutboundPhoneRequest cancelOutboundPhoneRequest = new CancelOutboundPhoneRequest(ByteString.EMPTY);
                    realSupportPhoneService$cancelPhoneRequest$1.label = 1;
                    obj = this.service.cancelOutboundPhone(cancelOutboundPhoneRequest, realSupportPhoneService$cancelPhoneRequest$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                apiResult = (ApiResult) obj;
                if (apiResult instanceof ApiResult.Success) {
                    return SupportPhoneService$CancelSupportPhoneResult.Error.INSTANCE;
                }
                JobKt.launch$default(this.coroutineScope, null, null, new ShoppingWebBridge.AnonymousClass1(this, continuation, 21), 3);
                CancelOutboundPhoneResponse cancelOutboundPhoneResponse = (CancelOutboundPhoneResponse) ((ApiResult.Success) apiResult).response;
                String str = cancelOutboundPhoneResponse.title;
                str.getClass();
                String str2 = cancelOutboundPhoneResponse.message;
                str2.getClass();
                return new SupportPhoneService$CancelSupportPhoneResult.Success(str, str2);
            }
        }
        realSupportPhoneService$cancelPhoneRequest$1 = new RealSupportPhoneService$cancelPhoneRequest$1(this, continuationImpl);
        Object obj2 = realSupportPhoneService$cancelPhoneRequest$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = realSupportPhoneService$cancelPhoneRequest$1.label;
        Continuation continuation2 = null;
        if (i != 0) {
        }
        apiResult = (ApiResult) obj2;
        if (apiResult instanceof ApiResult.Success) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x00c6, code lost:
    
        if (kotlin.Unit.INSTANCE == r1) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00da, code lost:
    
        if (kotlin.Unit.INSTANCE == r1) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0050, code lost:
    
        if (r8 == r1) goto L49;
     */
    /* JADX WARN: Removed duplicated region for block: B:23:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object requestPhoneStatusUpdate(ContinuationImpl continuationImpl) {
        RealSupportPhoneService$requestPhoneStatusUpdate$1 realSupportPhoneService$requestPhoneStatusUpdate$1;
        int i;
        boolean z;
        if (continuationImpl instanceof RealSupportPhoneService$requestPhoneStatusUpdate$1) {
            realSupportPhoneService$requestPhoneStatusUpdate$1 = (RealSupportPhoneService$requestPhoneStatusUpdate$1) continuationImpl;
            int i2 = realSupportPhoneService$requestPhoneStatusUpdate$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                realSupportPhoneService$requestPhoneStatusUpdate$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = realSupportPhoneService$requestPhoneStatusUpdate$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = realSupportPhoneService$requestPhoneStatusUpdate$1.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    SupportPhoneStatusRequest supportPhoneStatusRequest = new SupportPhoneStatusRequest(ByteString.EMPTY);
                    realSupportPhoneService$requestPhoneStatusUpdate$1.label = 1;
                    obj = this.service.supportPhoneStatus(supportPhoneStatusRequest, realSupportPhoneService$requestPhoneStatusUpdate$1);
                } else {
                    if (i != 1) {
                        if (i == 2) {
                            SafeTrace.throwOnFailure(obj);
                            return Unit.INSTANCE;
                        }
                        if (i == 3) {
                            SafeTrace.throwOnFailure(obj);
                            return Unit.INSTANCE;
                        }
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                ApiResult apiResult = (ApiResult) obj;
                z = apiResult instanceof ApiResult.Success;
                Object obj2 = SupportPhoneStatus.Error.INSTANCE;
                StateFlowImpl stateFlowImpl = this._phoneStatus;
                if (z) {
                    realSupportPhoneService$requestPhoneStatusUpdate$1.label = 3;
                    stateFlowImpl.getClass();
                    stateFlowImpl.updateState(null, obj2);
                } else {
                    zzlp zzlpVar = ((SupportPhoneStatusResponse) ((ApiResult.Success) apiResult).response).access;
                    if (zzlpVar instanceof SupportPhoneStatusResponse$Access$Granted) {
                        zzlq zzlqVar = ((SupportPhoneStatusResponse$Access$Granted) zzlpVar).getValue().state;
                        if (zzlqVar instanceof SupportPhoneStatusResponse$Granted$State$Active) {
                            obj2 = new SupportPhoneStatus.Active(((SupportPhoneStatusResponse$Granted$State$Active) zzlqVar).getValue());
                        } else if (zzlqVar instanceof SupportPhoneStatusResponse$Granted$State$Idle) {
                            SupportPhoneStatusResponse.ServiceAvailability serviceAvailability = ((SupportPhoneStatusResponse$Granted$State$Idle) zzlqVar).getValue().service_availability;
                            serviceAvailability.getClass();
                            obj2 = new SupportPhoneStatus.Idle(new SupportPhoneStatus.PhoneServiceAvailability(serviceAvailability));
                        } else if (zzlqVar != null) {
                            Drop$$ExternalSyntheticBUOutline0.m1m();
                            return null;
                        }
                    } else if (zzlpVar instanceof SupportPhoneStatusResponse$Access$Denied) {
                        obj2 = new SupportPhoneStatus.FeatureDisabled(((SupportPhoneStatusResponse$Access$Denied) zzlpVar).getValue().reason);
                    } else {
                        if (zzlpVar != null) {
                            Drop$$ExternalSyntheticBUOutline0.m1m();
                            return null;
                        }
                        obj2 = new SupportPhoneStatus.FeatureDisabled(null);
                    }
                    realSupportPhoneService$requestPhoneStatusUpdate$1.label = 2;
                    stateFlowImpl.getClass();
                    stateFlowImpl.updateState(null, obj2);
                }
                return coroutineSingletons;
            }
        }
        realSupportPhoneService$requestPhoneStatusUpdate$1 = new RealSupportPhoneService$requestPhoneStatusUpdate$1(this, continuationImpl);
        Object obj3 = realSupportPhoneService$requestPhoneStatusUpdate$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = realSupportPhoneService$requestPhoneStatusUpdate$1.label;
        if (i != 0) {
        }
        ApiResult apiResult2 = (ApiResult) obj3;
        z = apiResult2 instanceof ApiResult.Success;
        Object obj22 = SupportPhoneStatus.Error.INSTANCE;
        StateFlowImpl stateFlowImpl2 = this._phoneStatus;
        if (z) {
        }
        return coroutineSingletons2;
    }
}
