package com.squareup.cash.treehouse.financialservices;

import app.cash.zipline.internal.bridge.OutboundCallHandler;
import app.cash.zipline.internal.bridge.OutboundService;
import bo.app.a$$ExternalSyntheticBUOutline0;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import okio.ByteString;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;

/* loaded from: classes7.dex */
public final class FinancialServicesBridge$Companion$Adapter$GeneratedOutboundService implements FinancialServicesBridge, OutboundService {
    public final OutboundCallHandler callHandler;

    public FinancialServicesBridge$Companion$Adapter$GeneratedOutboundService(OutboundCallHandler outboundCallHandler) {
        this.callHandler = outboundCallHandler;
    }

    @Override // app.cash.zipline.ZiplineService, java.lang.AutoCloseable
    public final void close() {
        Object call = this.callHandler.call(this, 1, new Object[0]);
        call.getClass();
    }

    @Override // app.cash.zipline.internal.bridge.OutboundService
    public final OutboundCallHandler getCallHandler() {
        return this.callHandler;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // com.squareup.cash.treehouse.financialservices.FinancialServicesBridge
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object saveUserViewedDirectDepositUpsell(ByteString byteString, ContinuationImpl continuationImpl) {
        FinancialServicesBridge$Companion$Adapter$GeneratedOutboundService$saveUserViewedDirectDepositUpsell$1 financialServicesBridge$Companion$Adapter$GeneratedOutboundService$saveUserViewedDirectDepositUpsell$1;
        int i;
        if (continuationImpl instanceof FinancialServicesBridge$Companion$Adapter$GeneratedOutboundService$saveUserViewedDirectDepositUpsell$1) {
            financialServicesBridge$Companion$Adapter$GeneratedOutboundService$saveUserViewedDirectDepositUpsell$1 = (FinancialServicesBridge$Companion$Adapter$GeneratedOutboundService$saveUserViewedDirectDepositUpsell$1) continuationImpl;
            int i2 = financialServicesBridge$Companion$Adapter$GeneratedOutboundService$saveUserViewedDirectDepositUpsell$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                financialServicesBridge$Companion$Adapter$GeneratedOutboundService$saveUserViewedDirectDepositUpsell$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = financialServicesBridge$Companion$Adapter$GeneratedOutboundService$saveUserViewedDirectDepositUpsell$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = financialServicesBridge$Companion$Adapter$GeneratedOutboundService$saveUserViewedDirectDepositUpsell$1.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    financialServicesBridge$Companion$Adapter$GeneratedOutboundService$saveUserViewedDirectDepositUpsell$1.label = 1;
                    obj = this.callHandler.callSuspending(this, 0, new Object[]{byteString}, financialServicesBridge$Companion$Adapter$GeneratedOutboundService$saveUserViewedDirectDepositUpsell$1);
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
                obj.getClass();
                return (ByteString) obj;
            }
        }
        financialServicesBridge$Companion$Adapter$GeneratedOutboundService$saveUserViewedDirectDepositUpsell$1 = new FinancialServicesBridge$Companion$Adapter$GeneratedOutboundService$saveUserViewedDirectDepositUpsell$1(this, continuationImpl);
        Object obj2 = financialServicesBridge$Companion$Adapter$GeneratedOutboundService$saveUserViewedDirectDepositUpsell$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = financialServicesBridge$Companion$Adapter$GeneratedOutboundService$saveUserViewedDirectDepositUpsell$1.label;
        if (i != 0) {
        }
        obj2.getClass();
        return (ByteString) obj2;
    }
}
