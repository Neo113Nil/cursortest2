package com.squareup.cash.treehouse.flows;

import app.cash.zipline.internal.bridge.OutboundCallHandler;
import app.cash.zipline.internal.bridge.OutboundService;
import bo.app.a$$ExternalSyntheticBUOutline0;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import okio.ByteString;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;

/* loaded from: classes7.dex */
public final class RawFlowService$Companion$Adapter$GeneratedOutboundService implements RawFlowService, OutboundService {
    public final OutboundCallHandler callHandler;

    public RawFlowService$Companion$Adapter$GeneratedOutboundService(OutboundCallHandler outboundCallHandler) {
        this.callHandler = outboundCallHandler;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // com.squareup.cash.treehouse.flows.RawFlowService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object advance(ByteString byteString, boolean z, Continuation continuation) {
        RawFlowService$Companion$Adapter$GeneratedOutboundService$advance$1 rawFlowService$Companion$Adapter$GeneratedOutboundService$advance$1;
        int i;
        if (continuation instanceof RawFlowService$Companion$Adapter$GeneratedOutboundService$advance$1) {
            rawFlowService$Companion$Adapter$GeneratedOutboundService$advance$1 = (RawFlowService$Companion$Adapter$GeneratedOutboundService$advance$1) continuation;
            int i2 = rawFlowService$Companion$Adapter$GeneratedOutboundService$advance$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                rawFlowService$Companion$Adapter$GeneratedOutboundService$advance$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = rawFlowService$Companion$Adapter$GeneratedOutboundService$advance$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = rawFlowService$Companion$Adapter$GeneratedOutboundService$advance$1.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    Object[] objArr = {byteString, Boolean.valueOf(z)};
                    rawFlowService$Companion$Adapter$GeneratedOutboundService$advance$1.label = 1;
                    obj = this.callHandler.callSuspending(this, 2, objArr, rawFlowService$Companion$Adapter$GeneratedOutboundService$advance$1);
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
        rawFlowService$Companion$Adapter$GeneratedOutboundService$advance$1 = new RawFlowService$Companion$Adapter$GeneratedOutboundService$advance$1(this, (ContinuationImpl) continuation);
        Object obj2 = rawFlowService$Companion$Adapter$GeneratedOutboundService$advance$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = rawFlowService$Companion$Adapter$GeneratedOutboundService$advance$1.label;
        if (i != 0) {
        }
        obj2.getClass();
        return (Unit) obj2;
    }

    @Override // app.cash.zipline.ZiplineService, java.lang.AutoCloseable
    public final void close() {
        Object call = this.callHandler.call(this, 5, new Object[0]);
        call.getClass();
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // com.squareup.cash.treehouse.flows.RawFlowService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object consumeResponseContext(ByteString byteString, ByteString byteString2, Continuation continuation) {
        RawFlowService$Companion$Adapter$GeneratedOutboundService$consumeResponseContext$1 rawFlowService$Companion$Adapter$GeneratedOutboundService$consumeResponseContext$1;
        int i;
        if (continuation instanceof RawFlowService$Companion$Adapter$GeneratedOutboundService$consumeResponseContext$1) {
            rawFlowService$Companion$Adapter$GeneratedOutboundService$consumeResponseContext$1 = (RawFlowService$Companion$Adapter$GeneratedOutboundService$consumeResponseContext$1) continuation;
            int i2 = rawFlowService$Companion$Adapter$GeneratedOutboundService$consumeResponseContext$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                rawFlowService$Companion$Adapter$GeneratedOutboundService$consumeResponseContext$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = rawFlowService$Companion$Adapter$GeneratedOutboundService$consumeResponseContext$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = rawFlowService$Companion$Adapter$GeneratedOutboundService$consumeResponseContext$1.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    rawFlowService$Companion$Adapter$GeneratedOutboundService$consumeResponseContext$1.label = 1;
                    obj = this.callHandler.callSuspending(this, 1, new Object[]{byteString, byteString2}, rawFlowService$Companion$Adapter$GeneratedOutboundService$consumeResponseContext$1);
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
        rawFlowService$Companion$Adapter$GeneratedOutboundService$consumeResponseContext$1 = new RawFlowService$Companion$Adapter$GeneratedOutboundService$consumeResponseContext$1(this, (ContinuationImpl) continuation);
        Object obj2 = rawFlowService$Companion$Adapter$GeneratedOutboundService$consumeResponseContext$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = rawFlowService$Companion$Adapter$GeneratedOutboundService$consumeResponseContext$1.label;
        if (i != 0) {
        }
        obj2.getClass();
        return (Unit) obj2;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // com.squareup.cash.treehouse.flows.RawFlowService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object dismiss(Continuation continuation) {
        RawFlowService$Companion$Adapter$GeneratedOutboundService$dismiss$1 rawFlowService$Companion$Adapter$GeneratedOutboundService$dismiss$1;
        int i;
        if (continuation instanceof RawFlowService$Companion$Adapter$GeneratedOutboundService$dismiss$1) {
            rawFlowService$Companion$Adapter$GeneratedOutboundService$dismiss$1 = (RawFlowService$Companion$Adapter$GeneratedOutboundService$dismiss$1) continuation;
            int i2 = rawFlowService$Companion$Adapter$GeneratedOutboundService$dismiss$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                rawFlowService$Companion$Adapter$GeneratedOutboundService$dismiss$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = rawFlowService$Companion$Adapter$GeneratedOutboundService$dismiss$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = rawFlowService$Companion$Adapter$GeneratedOutboundService$dismiss$1.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    rawFlowService$Companion$Adapter$GeneratedOutboundService$dismiss$1.label = 1;
                    obj = this.callHandler.callSuspending(this, 4, new Object[0], rawFlowService$Companion$Adapter$GeneratedOutboundService$dismiss$1);
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
        rawFlowService$Companion$Adapter$GeneratedOutboundService$dismiss$1 = new RawFlowService$Companion$Adapter$GeneratedOutboundService$dismiss$1(this, (ContinuationImpl) continuation);
        Object obj2 = rawFlowService$Companion$Adapter$GeneratedOutboundService$dismiss$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = rawFlowService$Companion$Adapter$GeneratedOutboundService$dismiss$1.label;
        if (i != 0) {
        }
        obj2.getClass();
        return (Unit) obj2;
    }

    @Override // app.cash.zipline.internal.bridge.OutboundService
    public final OutboundCallHandler getCallHandler() {
        return this.callHandler;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // com.squareup.cash.treehouse.flows.RawFlowService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object produceRequestContext(List list, Continuation continuation) {
        RawFlowService$Companion$Adapter$GeneratedOutboundService$produceRequestContext$1 rawFlowService$Companion$Adapter$GeneratedOutboundService$produceRequestContext$1;
        int i;
        if (continuation instanceof RawFlowService$Companion$Adapter$GeneratedOutboundService$produceRequestContext$1) {
            rawFlowService$Companion$Adapter$GeneratedOutboundService$produceRequestContext$1 = (RawFlowService$Companion$Adapter$GeneratedOutboundService$produceRequestContext$1) continuation;
            int i2 = rawFlowService$Companion$Adapter$GeneratedOutboundService$produceRequestContext$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                rawFlowService$Companion$Adapter$GeneratedOutboundService$produceRequestContext$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = rawFlowService$Companion$Adapter$GeneratedOutboundService$produceRequestContext$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = rawFlowService$Companion$Adapter$GeneratedOutboundService$produceRequestContext$1.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    rawFlowService$Companion$Adapter$GeneratedOutboundService$produceRequestContext$1.label = 1;
                    obj = this.callHandler.callSuspending(this, 0, new Object[]{list}, rawFlowService$Companion$Adapter$GeneratedOutboundService$produceRequestContext$1);
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
        rawFlowService$Companion$Adapter$GeneratedOutboundService$produceRequestContext$1 = new RawFlowService$Companion$Adapter$GeneratedOutboundService$produceRequestContext$1(this, (ContinuationImpl) continuation);
        Object obj2 = rawFlowService$Companion$Adapter$GeneratedOutboundService$produceRequestContext$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = rawFlowService$Companion$Adapter$GeneratedOutboundService$produceRequestContext$1.label;
        if (i != 0) {
        }
        obj2.getClass();
        return (ByteString) obj2;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // com.squareup.cash.treehouse.flows.RawFlowService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object retreat(ByteString byteString, Continuation continuation) {
        RawFlowService$Companion$Adapter$GeneratedOutboundService$retreat$1 rawFlowService$Companion$Adapter$GeneratedOutboundService$retreat$1;
        int i;
        if (continuation instanceof RawFlowService$Companion$Adapter$GeneratedOutboundService$retreat$1) {
            rawFlowService$Companion$Adapter$GeneratedOutboundService$retreat$1 = (RawFlowService$Companion$Adapter$GeneratedOutboundService$retreat$1) continuation;
            int i2 = rawFlowService$Companion$Adapter$GeneratedOutboundService$retreat$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                rawFlowService$Companion$Adapter$GeneratedOutboundService$retreat$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = rawFlowService$Companion$Adapter$GeneratedOutboundService$retreat$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = rawFlowService$Companion$Adapter$GeneratedOutboundService$retreat$1.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    rawFlowService$Companion$Adapter$GeneratedOutboundService$retreat$1.label = 1;
                    obj = this.callHandler.callSuspending(this, 3, new Object[]{byteString}, rawFlowService$Companion$Adapter$GeneratedOutboundService$retreat$1);
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
        rawFlowService$Companion$Adapter$GeneratedOutboundService$retreat$1 = new RawFlowService$Companion$Adapter$GeneratedOutboundService$retreat$1(this, (ContinuationImpl) continuation);
        Object obj2 = rawFlowService$Companion$Adapter$GeneratedOutboundService$retreat$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = rawFlowService$Companion$Adapter$GeneratedOutboundService$retreat$1.label;
        if (i != 0) {
        }
        obj2.getClass();
        return (Unit) obj2;
    }
}
