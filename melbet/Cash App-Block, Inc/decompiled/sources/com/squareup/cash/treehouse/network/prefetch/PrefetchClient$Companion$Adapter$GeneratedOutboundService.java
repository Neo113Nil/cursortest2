package com.squareup.cash.treehouse.network.prefetch;

import app.cash.zipline.internal.bridge.OutboundCallHandler;
import app.cash.zipline.internal.bridge.OutboundService;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.treehouse.network.HttpResponse;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;

/* loaded from: classes7.dex */
public final class PrefetchClient$Companion$Adapter$GeneratedOutboundService implements PrefetchClient, OutboundService {
    public final OutboundCallHandler callHandler;

    public PrefetchClient$Companion$Adapter$GeneratedOutboundService(OutboundCallHandler outboundCallHandler) {
        this.callHandler = outboundCallHandler;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // com.squareup.cash.treehouse.network.prefetch.PrefetchClient
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object awaitResponse(String str, Continuation continuation) {
        PrefetchClient$Companion$Adapter$GeneratedOutboundService$awaitResponse$1 prefetchClient$Companion$Adapter$GeneratedOutboundService$awaitResponse$1;
        int i;
        if (continuation instanceof PrefetchClient$Companion$Adapter$GeneratedOutboundService$awaitResponse$1) {
            prefetchClient$Companion$Adapter$GeneratedOutboundService$awaitResponse$1 = (PrefetchClient$Companion$Adapter$GeneratedOutboundService$awaitResponse$1) continuation;
            int i2 = prefetchClient$Companion$Adapter$GeneratedOutboundService$awaitResponse$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                prefetchClient$Companion$Adapter$GeneratedOutboundService$awaitResponse$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = prefetchClient$Companion$Adapter$GeneratedOutboundService$awaitResponse$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = prefetchClient$Companion$Adapter$GeneratedOutboundService$awaitResponse$1.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    prefetchClient$Companion$Adapter$GeneratedOutboundService$awaitResponse$1.label = 1;
                    obj = this.callHandler.callSuspending(this, 0, new Object[]{str}, prefetchClient$Companion$Adapter$GeneratedOutboundService$awaitResponse$1);
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
                return (HttpResponse) obj;
            }
        }
        prefetchClient$Companion$Adapter$GeneratedOutboundService$awaitResponse$1 = new PrefetchClient$Companion$Adapter$GeneratedOutboundService$awaitResponse$1(this, (ContinuationImpl) continuation);
        Object obj2 = prefetchClient$Companion$Adapter$GeneratedOutboundService$awaitResponse$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = prefetchClient$Companion$Adapter$GeneratedOutboundService$awaitResponse$1.label;
        if (i != 0) {
        }
        obj2.getClass();
        return (HttpResponse) obj2;
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
}
