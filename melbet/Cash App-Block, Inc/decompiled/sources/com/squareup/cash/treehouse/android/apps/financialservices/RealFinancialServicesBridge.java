package com.squareup.cash.treehouse.android.apps.financialservices;

import app.cash.api.ApiResult;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.treehouse.financialservices.FinancialServicesBridge;
import com.squareup.protos.cash.paychecks.api.v1.PaychecksAppService;
import com.squareup.protos.cash.paychecks.api.v1.SaveUserViewedDirectDepositUpsellRequest;
import com.squareup.protos.cash.paychecks.api.v1.SaveUserViewedDirectDepositUpsellResponse;
import com.squareup.protos.franklin.common.RequestContext;
import com.squareup.protos.franklin.common.ResponseContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import okio.ByteString;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;

/* loaded from: classes.dex */
public final class RealFinancialServicesBridge implements FinancialServicesBridge {
    public final PaychecksAppService appService;

    public RealFinancialServicesBridge(PaychecksAppService paychecksAppService) {
        this.appService = paychecksAppService;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // com.squareup.cash.treehouse.financialservices.FinancialServicesBridge
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object saveUserViewedDirectDepositUpsell(ByteString byteString, ContinuationImpl continuationImpl) {
        RealFinancialServicesBridge$saveUserViewedDirectDepositUpsell$1 realFinancialServicesBridge$saveUserViewedDirectDepositUpsell$1;
        int i;
        ResponseContext responseContext;
        ByteString encodeByteString;
        if (continuationImpl instanceof RealFinancialServicesBridge$saveUserViewedDirectDepositUpsell$1) {
            realFinancialServicesBridge$saveUserViewedDirectDepositUpsell$1 = (RealFinancialServicesBridge$saveUserViewedDirectDepositUpsell$1) continuationImpl;
            int i2 = realFinancialServicesBridge$saveUserViewedDirectDepositUpsell$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                realFinancialServicesBridge$saveUserViewedDirectDepositUpsell$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = realFinancialServicesBridge$saveUserViewedDirectDepositUpsell$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = realFinancialServicesBridge$saveUserViewedDirectDepositUpsell$1.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    SaveUserViewedDirectDepositUpsellRequest saveUserViewedDirectDepositUpsellRequest = new SaveUserViewedDirectDepositUpsellRequest((RequestContext) RequestContext.ADAPTER.decode(byteString), ByteString.EMPTY);
                    realFinancialServicesBridge$saveUserViewedDirectDepositUpsell$1.label = 1;
                    obj = this.appService.saveUserViewedDirectDepositUpsell(saveUserViewedDirectDepositUpsellRequest, realFinancialServicesBridge$saveUserViewedDirectDepositUpsell$1);
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
                ApiResult apiResult = (ApiResult) obj;
                SaveUserViewedDirectDepositUpsellResponse saveUserViewedDirectDepositUpsellResponse = (SaveUserViewedDirectDepositUpsellResponse) (apiResult instanceof ApiResult.Success ? ((ApiResult.Success) apiResult).response : null);
                return (saveUserViewedDirectDepositUpsellResponse != null || (responseContext = saveUserViewedDirectDepositUpsellResponse.response_context) == null || (encodeByteString = responseContext.encodeByteString()) == null) ? new ResponseContext(null, null, null, null, null, null, null, null, 4194303).encodeByteString() : encodeByteString;
            }
        }
        realFinancialServicesBridge$saveUserViewedDirectDepositUpsell$1 = new RealFinancialServicesBridge$saveUserViewedDirectDepositUpsell$1(this, continuationImpl);
        Object obj2 = realFinancialServicesBridge$saveUserViewedDirectDepositUpsell$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = realFinancialServicesBridge$saveUserViewedDirectDepositUpsell$1.label;
        if (i != 0) {
        }
        ApiResult apiResult2 = (ApiResult) obj2;
        SaveUserViewedDirectDepositUpsellResponse saveUserViewedDirectDepositUpsellResponse2 = (SaveUserViewedDirectDepositUpsellResponse) (apiResult2 instanceof ApiResult.Success ? ((ApiResult.Success) apiResult2).response : null);
        if (saveUserViewedDirectDepositUpsellResponse2 != null) {
        }
    }
}
