package com.stripe.android.core.utils;

import androidx.work.WorkManager;
import androidx.work.impl.WorkManagerImpl;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.graphics.swampgl.components.Scene;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;

/* loaded from: classes8.dex */
public final class RealIsWorkManagerAvailable {
    public final Scene.AnonymousClass1 isEnabledForMerchant;

    public RealIsWorkManagerAvailable(Scene.AnonymousClass1 anonymousClass1) {
        this.isEnabledForMerchant = anonymousClass1;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(ContinuationImpl continuationImpl) {
        RealIsWorkManagerAvailable$invoke$1 realIsWorkManagerAvailable$invoke$1;
        int i;
        Object failure;
        boolean z;
        if (continuationImpl instanceof RealIsWorkManagerAvailable$invoke$1) {
            realIsWorkManagerAvailable$invoke$1 = (RealIsWorkManagerAvailable$invoke$1) continuationImpl;
            int i2 = realIsWorkManagerAvailable$invoke$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                realIsWorkManagerAvailable$invoke$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = realIsWorkManagerAvailable$invoke$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = realIsWorkManagerAvailable$invoke$1.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    try {
                        Result.Companion companion = Result.Companion;
                        failure = WorkManager.class;
                    } catch (Throwable th) {
                        Result.Companion companion2 = Result.Companion;
                        failure = new Result.Failure(th);
                    }
                    boolean z2 = !(failure instanceof Result.Failure);
                    realIsWorkManagerAvailable$invoke$1.Z$0 = z2;
                    realIsWorkManagerAvailable$invoke$1.label = 1;
                    Object invoke = this.isEnabledForMerchant.invoke(realIsWorkManagerAvailable$invoke$1);
                    if (invoke == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    obj = invoke;
                    z = z2;
                } else {
                    if (i != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z = realIsWorkManagerAvailable$invoke$1.Z$0;
                    SafeTrace.throwOnFailure(obj);
                }
                return Boolean.valueOf((((Boolean) obj).booleanValue() || !z || WorkManagerImpl.getInstance() == null) ? false : true);
            }
        }
        realIsWorkManagerAvailable$invoke$1 = new RealIsWorkManagerAvailable$invoke$1(this, continuationImpl);
        Object obj2 = realIsWorkManagerAvailable$invoke$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = realIsWorkManagerAvailable$invoke$1.label;
        if (i != 0) {
        }
        return Boolean.valueOf((((Boolean) obj2).booleanValue() || !z || WorkManagerImpl.getInstance() == null) ? false : true);
    }
}
