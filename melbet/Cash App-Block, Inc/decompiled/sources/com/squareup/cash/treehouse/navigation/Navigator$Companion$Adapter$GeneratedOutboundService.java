package com.squareup.cash.treehouse.navigation;

import app.cash.zipline.internal.bridge.OutboundCallHandler;
import app.cash.zipline.internal.bridge.OutboundService;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.treehouse.flows.FlowSpec;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;

/* loaded from: classes7.dex */
public final class Navigator$Companion$Adapter$GeneratedOutboundService implements Navigator, OutboundService {
    public final OutboundCallHandler callHandler;

    public Navigator$Companion$Adapter$GeneratedOutboundService(OutboundCallHandler outboundCallHandler) {
        this.callHandler = outboundCallHandler;
    }

    @Override // app.cash.zipline.ZiplineService, java.lang.AutoCloseable
    public final void close() {
        Object call = this.callHandler.call(this, 4, new Object[0]);
        call.getClass();
    }

    @Override // app.cash.zipline.internal.bridge.OutboundService
    public final OutboundCallHandler getCallHandler() {
        return this.callHandler;
    }

    @Override // com.squareup.cash.treehouse.navigation.Navigator
    public final void navigateBack() {
        Object call = this.callHandler.call(this, 0, new Object[0]);
        call.getClass();
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // com.squareup.cash.treehouse.navigation.Navigator
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object navigateBackSuspending(Continuation continuation) {
        Navigator$Companion$Adapter$GeneratedOutboundService$navigateBackSuspending$1 navigator$Companion$Adapter$GeneratedOutboundService$navigateBackSuspending$1;
        int i;
        if (continuation instanceof Navigator$Companion$Adapter$GeneratedOutboundService$navigateBackSuspending$1) {
            navigator$Companion$Adapter$GeneratedOutboundService$navigateBackSuspending$1 = (Navigator$Companion$Adapter$GeneratedOutboundService$navigateBackSuspending$1) continuation;
            int i2 = navigator$Companion$Adapter$GeneratedOutboundService$navigateBackSuspending$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                navigator$Companion$Adapter$GeneratedOutboundService$navigateBackSuspending$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = navigator$Companion$Adapter$GeneratedOutboundService$navigateBackSuspending$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = navigator$Companion$Adapter$GeneratedOutboundService$navigateBackSuspending$1.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    navigator$Companion$Adapter$GeneratedOutboundService$navigateBackSuspending$1.label = 1;
                    obj = this.callHandler.callSuspending(this, 1, new Object[0], navigator$Companion$Adapter$GeneratedOutboundService$navigateBackSuspending$1);
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
        navigator$Companion$Adapter$GeneratedOutboundService$navigateBackSuspending$1 = new Navigator$Companion$Adapter$GeneratedOutboundService$navigateBackSuspending$1(this, (ContinuationImpl) continuation);
        Object obj2 = navigator$Companion$Adapter$GeneratedOutboundService$navigateBackSuspending$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = navigator$Companion$Adapter$GeneratedOutboundService$navigateBackSuspending$1.label;
        if (i != 0) {
        }
        obj2.getClass();
        return (Unit) obj2;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // com.squareup.cash.treehouse.navigation.Navigator
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object navigateToUrl(String str, TreehouseRoutingParams treehouseRoutingParams, Continuation continuation) {
        Navigator$Companion$Adapter$GeneratedOutboundService$navigateToUrl$1 navigator$Companion$Adapter$GeneratedOutboundService$navigateToUrl$1;
        int i;
        if (continuation instanceof Navigator$Companion$Adapter$GeneratedOutboundService$navigateToUrl$1) {
            navigator$Companion$Adapter$GeneratedOutboundService$navigateToUrl$1 = (Navigator$Companion$Adapter$GeneratedOutboundService$navigateToUrl$1) continuation;
            int i2 = navigator$Companion$Adapter$GeneratedOutboundService$navigateToUrl$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                navigator$Companion$Adapter$GeneratedOutboundService$navigateToUrl$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = navigator$Companion$Adapter$GeneratedOutboundService$navigateToUrl$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = navigator$Companion$Adapter$GeneratedOutboundService$navigateToUrl$1.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    navigator$Companion$Adapter$GeneratedOutboundService$navigateToUrl$1.label = 1;
                    obj = this.callHandler.callSuspending(this, 3, new Object[]{str, treehouseRoutingParams}, navigator$Companion$Adapter$GeneratedOutboundService$navigateToUrl$1);
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
                return (Boolean) obj;
            }
        }
        navigator$Companion$Adapter$GeneratedOutboundService$navigateToUrl$1 = new Navigator$Companion$Adapter$GeneratedOutboundService$navigateToUrl$1(this, (ContinuationImpl) continuation);
        Object obj2 = navigator$Companion$Adapter$GeneratedOutboundService$navigateToUrl$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = navigator$Companion$Adapter$GeneratedOutboundService$navigateToUrl$1.label;
        if (i != 0) {
        }
        obj2.getClass();
        return (Boolean) obj2;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // com.squareup.cash.treehouse.navigation.Navigator
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object startFlow(FlowSpec flowSpec, Continuation continuation) {
        Navigator$Companion$Adapter$GeneratedOutboundService$startFlow$1 navigator$Companion$Adapter$GeneratedOutboundService$startFlow$1;
        int i;
        if (continuation instanceof Navigator$Companion$Adapter$GeneratedOutboundService$startFlow$1) {
            navigator$Companion$Adapter$GeneratedOutboundService$startFlow$1 = (Navigator$Companion$Adapter$GeneratedOutboundService$startFlow$1) continuation;
            int i2 = navigator$Companion$Adapter$GeneratedOutboundService$startFlow$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                navigator$Companion$Adapter$GeneratedOutboundService$startFlow$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = navigator$Companion$Adapter$GeneratedOutboundService$startFlow$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = navigator$Companion$Adapter$GeneratedOutboundService$startFlow$1.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    navigator$Companion$Adapter$GeneratedOutboundService$startFlow$1.label = 1;
                    obj = this.callHandler.callSuspending(this, 2, new Object[]{flowSpec}, navigator$Companion$Adapter$GeneratedOutboundService$startFlow$1);
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
        navigator$Companion$Adapter$GeneratedOutboundService$startFlow$1 = new Navigator$Companion$Adapter$GeneratedOutboundService$startFlow$1(this, (ContinuationImpl) continuation);
        Object obj2 = navigator$Companion$Adapter$GeneratedOutboundService$startFlow$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = navigator$Companion$Adapter$GeneratedOutboundService$startFlow$1.label;
        if (i != 0) {
        }
        obj2.getClass();
        return (Unit) obj2;
    }
}
