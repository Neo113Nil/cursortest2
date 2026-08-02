package com.squareup.cash.treehouse.biometrics;

import app.cash.zipline.internal.bridge.OutboundCallHandler;
import app.cash.zipline.internal.bridge.OutboundService;
import bo.app.a$$ExternalSyntheticBUOutline0;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;

/* loaded from: classes7.dex */
public final class BiometricsService$Companion$Adapter$GeneratedOutboundService implements BiometricsService, OutboundService {
    public final OutboundCallHandler callHandler;

    public BiometricsService$Companion$Adapter$GeneratedOutboundService(OutboundCallHandler outboundCallHandler) {
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

    /* JADX WARN: Removed duplicated region for block: B:15:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // com.squareup.cash.treehouse.biometrics.BiometricsService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object hasStoredValue(String str, Continuation continuation) {
        BiometricsService$Companion$Adapter$GeneratedOutboundService$hasStoredValue$1 biometricsService$Companion$Adapter$GeneratedOutboundService$hasStoredValue$1;
        int i;
        if (continuation instanceof BiometricsService$Companion$Adapter$GeneratedOutboundService$hasStoredValue$1) {
            biometricsService$Companion$Adapter$GeneratedOutboundService$hasStoredValue$1 = (BiometricsService$Companion$Adapter$GeneratedOutboundService$hasStoredValue$1) continuation;
            int i2 = biometricsService$Companion$Adapter$GeneratedOutboundService$hasStoredValue$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                biometricsService$Companion$Adapter$GeneratedOutboundService$hasStoredValue$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = biometricsService$Companion$Adapter$GeneratedOutboundService$hasStoredValue$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = biometricsService$Companion$Adapter$GeneratedOutboundService$hasStoredValue$1.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    biometricsService$Companion$Adapter$GeneratedOutboundService$hasStoredValue$1.label = 1;
                    obj = this.callHandler.callSuspending(this, 1, new Object[]{str}, biometricsService$Companion$Adapter$GeneratedOutboundService$hasStoredValue$1);
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
        biometricsService$Companion$Adapter$GeneratedOutboundService$hasStoredValue$1 = new BiometricsService$Companion$Adapter$GeneratedOutboundService$hasStoredValue$1(this, (ContinuationImpl) continuation);
        Object obj2 = biometricsService$Companion$Adapter$GeneratedOutboundService$hasStoredValue$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = biometricsService$Companion$Adapter$GeneratedOutboundService$hasStoredValue$1.label;
        if (i != 0) {
        }
        obj2.getClass();
        return (Boolean) obj2;
    }

    @Override // com.squareup.cash.treehouse.biometrics.BiometricsService
    public final boolean isUserEnrolled() {
        Object call = this.callHandler.call(this, 2, new Object[0]);
        call.getClass();
        return ((Boolean) call).booleanValue();
    }

    @Override // com.squareup.cash.treehouse.biometrics.BiometricsService
    public final boolean promptForEnrollment() {
        Object call = this.callHandler.call(this, 3, new Object[0]);
        call.getClass();
        return ((Boolean) call).booleanValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // com.squareup.cash.treehouse.biometrics.BiometricsService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object write(String str, String str2, ContinuationImpl continuationImpl) {
        BiometricsService$Companion$Adapter$GeneratedOutboundService$write$1 biometricsService$Companion$Adapter$GeneratedOutboundService$write$1;
        int i;
        if (continuationImpl instanceof BiometricsService$Companion$Adapter$GeneratedOutboundService$write$1) {
            biometricsService$Companion$Adapter$GeneratedOutboundService$write$1 = (BiometricsService$Companion$Adapter$GeneratedOutboundService$write$1) continuationImpl;
            int i2 = biometricsService$Companion$Adapter$GeneratedOutboundService$write$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                biometricsService$Companion$Adapter$GeneratedOutboundService$write$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = biometricsService$Companion$Adapter$GeneratedOutboundService$write$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = biometricsService$Companion$Adapter$GeneratedOutboundService$write$1.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    biometricsService$Companion$Adapter$GeneratedOutboundService$write$1.label = 1;
                    obj = this.callHandler.callSuspending(this, 0, new Object[]{str, str2}, biometricsService$Companion$Adapter$GeneratedOutboundService$write$1);
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
                return (BiometricsWriteResult) obj;
            }
        }
        biometricsService$Companion$Adapter$GeneratedOutboundService$write$1 = new BiometricsService$Companion$Adapter$GeneratedOutboundService$write$1(this, continuationImpl);
        Object obj2 = biometricsService$Companion$Adapter$GeneratedOutboundService$write$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = biometricsService$Companion$Adapter$GeneratedOutboundService$write$1.label;
        if (i != 0) {
        }
        obj2.getClass();
        return (BiometricsWriteResult) obj2;
    }
}
