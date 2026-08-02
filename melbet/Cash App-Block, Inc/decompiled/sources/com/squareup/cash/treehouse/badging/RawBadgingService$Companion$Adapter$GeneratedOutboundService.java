package com.squareup.cash.treehouse.badging;

import app.cash.zipline.internal.bridge.OutboundCallHandler;
import app.cash.zipline.internal.bridge.OutboundService;
import bo.app.a$$ExternalSyntheticBUOutline0;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import okio.ByteString;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;

/* loaded from: classes7.dex */
public final class RawBadgingService$Companion$Adapter$GeneratedOutboundService implements RawBadgingService, OutboundService {
    public final OutboundCallHandler callHandler;

    public RawBadgingService$Companion$Adapter$GeneratedOutboundService(OutboundCallHandler outboundCallHandler) {
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

    /* JADX WARN: Removed duplicated region for block: B:15:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // com.squareup.cash.treehouse.badging.RawBadgingService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object updateBadgeCounts(ByteString byteString, Continuation continuation) {
        RawBadgingService$Companion$Adapter$GeneratedOutboundService$updateBadgeCounts$1 rawBadgingService$Companion$Adapter$GeneratedOutboundService$updateBadgeCounts$1;
        int i;
        if (continuation instanceof RawBadgingService$Companion$Adapter$GeneratedOutboundService$updateBadgeCounts$1) {
            rawBadgingService$Companion$Adapter$GeneratedOutboundService$updateBadgeCounts$1 = (RawBadgingService$Companion$Adapter$GeneratedOutboundService$updateBadgeCounts$1) continuation;
            int i2 = rawBadgingService$Companion$Adapter$GeneratedOutboundService$updateBadgeCounts$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                rawBadgingService$Companion$Adapter$GeneratedOutboundService$updateBadgeCounts$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = rawBadgingService$Companion$Adapter$GeneratedOutboundService$updateBadgeCounts$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = rawBadgingService$Companion$Adapter$GeneratedOutboundService$updateBadgeCounts$1.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    rawBadgingService$Companion$Adapter$GeneratedOutboundService$updateBadgeCounts$1.label = 1;
                    obj = this.callHandler.callSuspending(this, 0, new Object[]{byteString}, rawBadgingService$Companion$Adapter$GeneratedOutboundService$updateBadgeCounts$1);
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
                return (Unit) obj;
            }
        }
        rawBadgingService$Companion$Adapter$GeneratedOutboundService$updateBadgeCounts$1 = new RawBadgingService$Companion$Adapter$GeneratedOutboundService$updateBadgeCounts$1(this, (ContinuationImpl) continuation);
        Object obj2 = rawBadgingService$Companion$Adapter$GeneratedOutboundService$updateBadgeCounts$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = rawBadgingService$Companion$Adapter$GeneratedOutboundService$updateBadgeCounts$1.label;
        if (i != 0) {
        }
        obj2.getClass();
        return (Unit) obj2;
    }
}
