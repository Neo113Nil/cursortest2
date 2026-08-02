package com.squareup.cash.treehouse.platform;

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
public final class CashContextService$Companion$Adapter$GeneratedOutboundService implements CashContextService, OutboundService {
    public final OutboundCallHandler callHandler;

    public CashContextService$Companion$Adapter$GeneratedOutboundService(OutboundCallHandler outboundCallHandler) {
        this.callHandler = outboundCallHandler;
    }

    @Override // app.cash.zipline.ZiplineService, java.lang.AutoCloseable
    public final void close() {
        Object call = this.callHandler.call(this, 7, new Object[0]);
        call.getClass();
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // com.squareup.cash.treehouse.platform.CashContextService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object consumeResponseContext(ByteString byteString, ByteString byteString2, Continuation continuation) {
        CashContextService$Companion$Adapter$GeneratedOutboundService$consumeResponseContext$1 cashContextService$Companion$Adapter$GeneratedOutboundService$consumeResponseContext$1;
        int i;
        if (continuation instanceof CashContextService$Companion$Adapter$GeneratedOutboundService$consumeResponseContext$1) {
            cashContextService$Companion$Adapter$GeneratedOutboundService$consumeResponseContext$1 = (CashContextService$Companion$Adapter$GeneratedOutboundService$consumeResponseContext$1) continuation;
            int i2 = cashContextService$Companion$Adapter$GeneratedOutboundService$consumeResponseContext$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                cashContextService$Companion$Adapter$GeneratedOutboundService$consumeResponseContext$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = cashContextService$Companion$Adapter$GeneratedOutboundService$consumeResponseContext$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = cashContextService$Companion$Adapter$GeneratedOutboundService$consumeResponseContext$1.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    cashContextService$Companion$Adapter$GeneratedOutboundService$consumeResponseContext$1.label = 1;
                    obj = this.callHandler.callSuspending(this, 4, new Object[]{byteString, byteString2}, cashContextService$Companion$Adapter$GeneratedOutboundService$consumeResponseContext$1);
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
        cashContextService$Companion$Adapter$GeneratedOutboundService$consumeResponseContext$1 = new CashContextService$Companion$Adapter$GeneratedOutboundService$consumeResponseContext$1(this, (ContinuationImpl) continuation);
        Object obj2 = cashContextService$Companion$Adapter$GeneratedOutboundService$consumeResponseContext$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = cashContextService$Companion$Adapter$GeneratedOutboundService$consumeResponseContext$1.label;
        if (i != 0) {
        }
        obj2.getClass();
        return (Unit) obj2;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // com.squareup.cash.treehouse.platform.CashContextService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object consumeSubmitBlockerResponseAppResponseContext(ByteString byteString, ByteString byteString2, Continuation continuation) {
        CashContextService$Companion$Adapter$GeneratedOutboundService$consumeSubmitBlockerResponseAppResponseContext$1 cashContextService$Companion$Adapter$GeneratedOutboundService$consumeSubmitBlockerResponseAppResponseContext$1;
        int i;
        if (continuation instanceof CashContextService$Companion$Adapter$GeneratedOutboundService$consumeSubmitBlockerResponseAppResponseContext$1) {
            cashContextService$Companion$Adapter$GeneratedOutboundService$consumeSubmitBlockerResponseAppResponseContext$1 = (CashContextService$Companion$Adapter$GeneratedOutboundService$consumeSubmitBlockerResponseAppResponseContext$1) continuation;
            int i2 = cashContextService$Companion$Adapter$GeneratedOutboundService$consumeSubmitBlockerResponseAppResponseContext$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                cashContextService$Companion$Adapter$GeneratedOutboundService$consumeSubmitBlockerResponseAppResponseContext$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = cashContextService$Companion$Adapter$GeneratedOutboundService$consumeSubmitBlockerResponseAppResponseContext$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = cashContextService$Companion$Adapter$GeneratedOutboundService$consumeSubmitBlockerResponseAppResponseContext$1.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    cashContextService$Companion$Adapter$GeneratedOutboundService$consumeSubmitBlockerResponseAppResponseContext$1.label = 1;
                    obj = this.callHandler.callSuspending(this, 6, new Object[]{byteString, byteString2}, cashContextService$Companion$Adapter$GeneratedOutboundService$consumeSubmitBlockerResponseAppResponseContext$1);
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
        cashContextService$Companion$Adapter$GeneratedOutboundService$consumeSubmitBlockerResponseAppResponseContext$1 = new CashContextService$Companion$Adapter$GeneratedOutboundService$consumeSubmitBlockerResponseAppResponseContext$1(this, (ContinuationImpl) continuation);
        Object obj2 = cashContextService$Companion$Adapter$GeneratedOutboundService$consumeSubmitBlockerResponseAppResponseContext$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = cashContextService$Companion$Adapter$GeneratedOutboundService$consumeSubmitBlockerResponseAppResponseContext$1.label;
        if (i != 0) {
        }
        obj2.getClass();
        return (Unit) obj2;
    }

    @Override // app.cash.zipline.internal.bridge.OutboundService
    public final OutboundCallHandler getCallHandler() {
        return this.callHandler;
    }

    @Override // com.squareup.cash.treehouse.platform.CashContextService
    public final String getCustomerToken() {
        Object call = this.callHandler.call(this, 0, new Object[0]);
        call.getClass();
        return (String) call;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // com.squareup.cash.treehouse.platform.CashContextService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object produceRequestContext(List list, ByteString byteString, ContinuationImpl continuationImpl) {
        CashContextService$Companion$Adapter$GeneratedOutboundService$produceRequestContext$2 cashContextService$Companion$Adapter$GeneratedOutboundService$produceRequestContext$2;
        int i;
        if (continuationImpl instanceof CashContextService$Companion$Adapter$GeneratedOutboundService$produceRequestContext$2) {
            cashContextService$Companion$Adapter$GeneratedOutboundService$produceRequestContext$2 = (CashContextService$Companion$Adapter$GeneratedOutboundService$produceRequestContext$2) continuationImpl;
            int i2 = cashContextService$Companion$Adapter$GeneratedOutboundService$produceRequestContext$2.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                cashContextService$Companion$Adapter$GeneratedOutboundService$produceRequestContext$2.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = cashContextService$Companion$Adapter$GeneratedOutboundService$produceRequestContext$2.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = cashContextService$Companion$Adapter$GeneratedOutboundService$produceRequestContext$2.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    cashContextService$Companion$Adapter$GeneratedOutboundService$produceRequestContext$2.label = 1;
                    obj = this.callHandler.callSuspending(this, 3, new Object[]{list, byteString}, cashContextService$Companion$Adapter$GeneratedOutboundService$produceRequestContext$2);
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
        cashContextService$Companion$Adapter$GeneratedOutboundService$produceRequestContext$2 = new CashContextService$Companion$Adapter$GeneratedOutboundService$produceRequestContext$2(this, continuationImpl);
        Object obj2 = cashContextService$Companion$Adapter$GeneratedOutboundService$produceRequestContext$2.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = cashContextService$Companion$Adapter$GeneratedOutboundService$produceRequestContext$2.label;
        if (i != 0) {
        }
        obj2.getClass();
        return (ByteString) obj2;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // com.squareup.cash.treehouse.platform.CashContextService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object produceSubmitBlockerRequestAppRequestContext(ContinuationImpl continuationImpl) {
        CashContextService$Companion$Adapter$GeneratedOutboundService$produceSubmitBlockerRequestAppRequestContext$1 cashContextService$Companion$Adapter$GeneratedOutboundService$produceSubmitBlockerRequestAppRequestContext$1;
        int i;
        if (continuationImpl instanceof CashContextService$Companion$Adapter$GeneratedOutboundService$produceSubmitBlockerRequestAppRequestContext$1) {
            cashContextService$Companion$Adapter$GeneratedOutboundService$produceSubmitBlockerRequestAppRequestContext$1 = (CashContextService$Companion$Adapter$GeneratedOutboundService$produceSubmitBlockerRequestAppRequestContext$1) continuationImpl;
            int i2 = cashContextService$Companion$Adapter$GeneratedOutboundService$produceSubmitBlockerRequestAppRequestContext$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                cashContextService$Companion$Adapter$GeneratedOutboundService$produceSubmitBlockerRequestAppRequestContext$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = cashContextService$Companion$Adapter$GeneratedOutboundService$produceSubmitBlockerRequestAppRequestContext$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = cashContextService$Companion$Adapter$GeneratedOutboundService$produceSubmitBlockerRequestAppRequestContext$1.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    cashContextService$Companion$Adapter$GeneratedOutboundService$produceSubmitBlockerRequestAppRequestContext$1.label = 1;
                    obj = this.callHandler.callSuspending(this, 5, new Object[0], cashContextService$Companion$Adapter$GeneratedOutboundService$produceSubmitBlockerRequestAppRequestContext$1);
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
        cashContextService$Companion$Adapter$GeneratedOutboundService$produceSubmitBlockerRequestAppRequestContext$1 = new CashContextService$Companion$Adapter$GeneratedOutboundService$produceSubmitBlockerRequestAppRequestContext$1(this, continuationImpl);
        Object obj2 = cashContextService$Companion$Adapter$GeneratedOutboundService$produceSubmitBlockerRequestAppRequestContext$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = cashContextService$Companion$Adapter$GeneratedOutboundService$produceSubmitBlockerRequestAppRequestContext$1.label;
        if (i != 0) {
        }
        obj2.getClass();
        return (ByteString) obj2;
    }

    @Override // com.squareup.cash.treehouse.platform.CashContextService
    public final String webPortalBaseUrl() {
        Object call = this.callHandler.call(this, 1, new Object[0]);
        call.getClass();
        return (String) call;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // com.squareup.cash.treehouse.platform.CashContextService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object produceRequestContext(ByteString byteString, ContinuationImpl continuationImpl) {
        CashContextService$Companion$Adapter$GeneratedOutboundService$produceRequestContext$1 cashContextService$Companion$Adapter$GeneratedOutboundService$produceRequestContext$1;
        int i;
        if (continuationImpl instanceof CashContextService$Companion$Adapter$GeneratedOutboundService$produceRequestContext$1) {
            cashContextService$Companion$Adapter$GeneratedOutboundService$produceRequestContext$1 = (CashContextService$Companion$Adapter$GeneratedOutboundService$produceRequestContext$1) continuationImpl;
            int i2 = cashContextService$Companion$Adapter$GeneratedOutboundService$produceRequestContext$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                cashContextService$Companion$Adapter$GeneratedOutboundService$produceRequestContext$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = cashContextService$Companion$Adapter$GeneratedOutboundService$produceRequestContext$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = cashContextService$Companion$Adapter$GeneratedOutboundService$produceRequestContext$1.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    cashContextService$Companion$Adapter$GeneratedOutboundService$produceRequestContext$1.label = 1;
                    obj = this.callHandler.callSuspending(this, 2, new Object[]{byteString}, cashContextService$Companion$Adapter$GeneratedOutboundService$produceRequestContext$1);
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
        cashContextService$Companion$Adapter$GeneratedOutboundService$produceRequestContext$1 = new CashContextService$Companion$Adapter$GeneratedOutboundService$produceRequestContext$1(this, continuationImpl);
        Object obj2 = cashContextService$Companion$Adapter$GeneratedOutboundService$produceRequestContext$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = cashContextService$Companion$Adapter$GeneratedOutboundService$produceRequestContext$1.label;
        if (i != 0) {
        }
        obj2.getClass();
        return (ByteString) obj2;
    }
}
