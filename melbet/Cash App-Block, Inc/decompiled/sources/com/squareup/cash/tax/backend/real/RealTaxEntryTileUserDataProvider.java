package com.squareup.cash.tax.backend.real;

import app.cash.api.ApiResult;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.tax.service.TaxExperienceService;
import com.squareup.protos.cash.cashtes.app.v1beta1.UserData2Request;
import com.squareup.protos.cash.cashtes.app.v1beta1.UserData2Response;
import com.squareup.protos.cash.cashtes.app.v1beta1.UserDataRequest;
import com.squareup.protos.cash.cashtes.app.v1beta1.UserDataResponse;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.StateFlowImpl;
import okio.ByteString;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;

/* loaded from: classes.dex */
public final class RealTaxEntryTileUserDataProvider {
    public final StateFlowImpl isBadged = FlowKt.MutableStateFlow(Boolean.FALSE);
    public final TaxExperienceService service;

    public RealTaxEntryTileUserDataProvider(TaxExperienceService taxExperienceService) {
        this.service = taxExperienceService;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object getEntryTileUserData2AndRefreshBadging(ContinuationImpl continuationImpl) {
        RealTaxEntryTileUserDataProvider$getEntryTileUserData2AndRefreshBadging$1 realTaxEntryTileUserDataProvider$getEntryTileUserData2AndRefreshBadging$1;
        int i;
        ApiResult apiResult;
        Boolean bool;
        if (continuationImpl instanceof RealTaxEntryTileUserDataProvider$getEntryTileUserData2AndRefreshBadging$1) {
            realTaxEntryTileUserDataProvider$getEntryTileUserData2AndRefreshBadging$1 = (RealTaxEntryTileUserDataProvider$getEntryTileUserData2AndRefreshBadging$1) continuationImpl;
            int i2 = realTaxEntryTileUserDataProvider$getEntryTileUserData2AndRefreshBadging$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                realTaxEntryTileUserDataProvider$getEntryTileUserData2AndRefreshBadging$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = realTaxEntryTileUserDataProvider$getEntryTileUserData2AndRefreshBadging$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = realTaxEntryTileUserDataProvider$getEntryTileUserData2AndRefreshBadging$1.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    UserData2Request userData2Request = new UserData2Request();
                    realTaxEntryTileUserDataProvider$getEntryTileUserData2AndRefreshBadging$1.label = 1;
                    obj = this.service.retrieveEntryPointData2(userData2Request, realTaxEntryTileUserDataProvider$getEntryTileUserData2AndRefreshBadging$1);
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
                    UserData2Response.InteractionEvents interactionEvents = ((UserData2Response) ((ApiResult.Success) apiResult).response).event_status;
                    Boolean valueOf = Boolean.valueOf((interactionEvents == null || (bool = interactionEvents.show_badge) == null) ? false : bool.booleanValue());
                    StateFlowImpl stateFlowImpl = this.isBadged;
                    stateFlowImpl.getClass();
                    stateFlowImpl.updateState(null, valueOf);
                }
                return apiResult;
            }
        }
        realTaxEntryTileUserDataProvider$getEntryTileUserData2AndRefreshBadging$1 = new RealTaxEntryTileUserDataProvider$getEntryTileUserData2AndRefreshBadging$1(this, continuationImpl);
        Object obj2 = realTaxEntryTileUserDataProvider$getEntryTileUserData2AndRefreshBadging$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = realTaxEntryTileUserDataProvider$getEntryTileUserData2AndRefreshBadging$1.label;
        if (i != 0) {
        }
        apiResult = (ApiResult) obj2;
        if (apiResult instanceof ApiResult.Success) {
        }
        return apiResult;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object getEntryTileUserDataAndRefreshBadging(ContinuationImpl continuationImpl) {
        RealTaxEntryTileUserDataProvider$getEntryTileUserDataAndRefreshBadging$1 realTaxEntryTileUserDataProvider$getEntryTileUserDataAndRefreshBadging$1;
        int i;
        ApiResult apiResult;
        Boolean bool;
        if (continuationImpl instanceof RealTaxEntryTileUserDataProvider$getEntryTileUserDataAndRefreshBadging$1) {
            realTaxEntryTileUserDataProvider$getEntryTileUserDataAndRefreshBadging$1 = (RealTaxEntryTileUserDataProvider$getEntryTileUserDataAndRefreshBadging$1) continuationImpl;
            int i2 = realTaxEntryTileUserDataProvider$getEntryTileUserDataAndRefreshBadging$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                realTaxEntryTileUserDataProvider$getEntryTileUserDataAndRefreshBadging$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = realTaxEntryTileUserDataProvider$getEntryTileUserDataAndRefreshBadging$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = realTaxEntryTileUserDataProvider$getEntryTileUserDataAndRefreshBadging$1.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    UserDataRequest userDataRequest = new UserDataRequest(null, ByteString.EMPTY);
                    realTaxEntryTileUserDataProvider$getEntryTileUserDataAndRefreshBadging$1.label = 1;
                    obj = this.service.retrieveEntryPointData(userDataRequest, realTaxEntryTileUserDataProvider$getEntryTileUserDataAndRefreshBadging$1);
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
                    UserDataResponse.InteractionEvents interactionEvents = ((UserDataResponse) ((ApiResult.Success) apiResult).response).event_status;
                    Boolean valueOf = Boolean.valueOf((interactionEvents == null || (bool = interactionEvents.show_badge) == null) ? false : bool.booleanValue());
                    StateFlowImpl stateFlowImpl = this.isBadged;
                    stateFlowImpl.getClass();
                    stateFlowImpl.updateState(null, valueOf);
                }
                return apiResult;
            }
        }
        realTaxEntryTileUserDataProvider$getEntryTileUserDataAndRefreshBadging$1 = new RealTaxEntryTileUserDataProvider$getEntryTileUserDataAndRefreshBadging$1(this, continuationImpl);
        Object obj2 = realTaxEntryTileUserDataProvider$getEntryTileUserDataAndRefreshBadging$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = realTaxEntryTileUserDataProvider$getEntryTileUserDataAndRefreshBadging$1.label;
        if (i != 0) {
        }
        apiResult = (ApiResult) obj2;
        if (apiResult instanceof ApiResult.Success) {
        }
        return apiResult;
    }
}
