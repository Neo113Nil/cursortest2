package com.squareup.cash.treehouse.activity;

import app.cash.zipline.internal.bridge.OutboundCallHandler;
import app.cash.zipline.internal.bridge.OutboundService;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.google.android.gms.internal.mlkit_genai_prompt.zzmo;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import okio.ByteString;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;

/* loaded from: classes7.dex */
public final class OffersRepositoryService$Companion$Adapter$GeneratedOutboundService implements OffersRepositoryService, OutboundService {
    public final OutboundCallHandler callHandler;

    public OffersRepositoryService$Companion$Adapter$GeneratedOutboundService(OutboundCallHandler outboundCallHandler) {
        this.callHandler = outboundCallHandler;
    }

    @Override // app.cash.zipline.ZiplineService, java.lang.AutoCloseable
    public final void close() {
        Object call = this.callHandler.call(this, 2, new Object[0]);
        call.getClass();
    }

    @Override // com.squareup.cash.treehouse.activity.OffersRepositoryService
    public final Object getActiveOfferMerchantTokens(zzmo zzmoVar) {
        Object callSuspending = this.callHandler.callSuspending(this, 1, new Object[0], zzmoVar);
        return callSuspending == CoroutineSingletons.COROUTINE_SUSPENDED ? callSuspending : (List) callSuspending;
    }

    @Override // app.cash.zipline.internal.bridge.OutboundService
    public final OutboundCallHandler getCallHandler() {
        return this.callHandler;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // com.squareup.cash.treehouse.activity.OffersRepositoryService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object saveSheetPreload(ByteString byteString, Continuation continuation) {
        OffersRepositoryService$Companion$Adapter$GeneratedOutboundService$saveSheetPreload$1 offersRepositoryService$Companion$Adapter$GeneratedOutboundService$saveSheetPreload$1;
        int i;
        if (continuation instanceof OffersRepositoryService$Companion$Adapter$GeneratedOutboundService$saveSheetPreload$1) {
            offersRepositoryService$Companion$Adapter$GeneratedOutboundService$saveSheetPreload$1 = (OffersRepositoryService$Companion$Adapter$GeneratedOutboundService$saveSheetPreload$1) continuation;
            int i2 = offersRepositoryService$Companion$Adapter$GeneratedOutboundService$saveSheetPreload$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                offersRepositoryService$Companion$Adapter$GeneratedOutboundService$saveSheetPreload$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = offersRepositoryService$Companion$Adapter$GeneratedOutboundService$saveSheetPreload$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = offersRepositoryService$Companion$Adapter$GeneratedOutboundService$saveSheetPreload$1.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    offersRepositoryService$Companion$Adapter$GeneratedOutboundService$saveSheetPreload$1.label = 1;
                    obj = this.callHandler.callSuspending(this, 0, new Object[]{byteString}, offersRepositoryService$Companion$Adapter$GeneratedOutboundService$saveSheetPreload$1);
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
        offersRepositoryService$Companion$Adapter$GeneratedOutboundService$saveSheetPreload$1 = new OffersRepositoryService$Companion$Adapter$GeneratedOutboundService$saveSheetPreload$1(this, (ContinuationImpl) continuation);
        Object obj2 = offersRepositoryService$Companion$Adapter$GeneratedOutboundService$saveSheetPreload$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = offersRepositoryService$Companion$Adapter$GeneratedOutboundService$saveSheetPreload$1.label;
        if (i != 0) {
        }
        obj2.getClass();
        return (Unit) obj2;
    }
}
