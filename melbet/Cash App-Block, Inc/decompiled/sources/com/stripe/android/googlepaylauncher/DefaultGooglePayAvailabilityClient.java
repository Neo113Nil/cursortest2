package com.stripe.android.googlepaylauncher;

import bo.app.a$$ExternalSyntheticBUOutline0;
import com.google.android.gms.tasks.zzw;
import com.google.android.gms.wallet.IsReadyToPayRequest;
import com.google.android.gms.wallet.PaymentsClient;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import okio.Okio;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;

/* loaded from: classes8.dex */
public final class DefaultGooglePayAvailabilityClient {
    public final PaymentsClient paymentsClient;

    public DefaultGooglePayAvailabilityClient(PaymentsClient paymentsClient) {
        this.paymentsClient = paymentsClient;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object isReady(IsReadyToPayRequest isReadyToPayRequest, ContinuationImpl continuationImpl) {
        DefaultGooglePayAvailabilityClient$isReady$1 defaultGooglePayAvailabilityClient$isReady$1;
        int i;
        if (continuationImpl instanceof DefaultGooglePayAvailabilityClient$isReady$1) {
            defaultGooglePayAvailabilityClient$isReady$1 = (DefaultGooglePayAvailabilityClient$isReady$1) continuationImpl;
            int i2 = defaultGooglePayAvailabilityClient$isReady$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                defaultGooglePayAvailabilityClient$isReady$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = defaultGooglePayAvailabilityClient$isReady$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = defaultGooglePayAvailabilityClient$isReady$1.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    zzw isReadyToPay = this.paymentsClient.isReadyToPay(isReadyToPayRequest);
                    isReadyToPay.getClass();
                    defaultGooglePayAvailabilityClient$isReady$1.label = 1;
                    obj = Okio.awaitImpl(isReadyToPay, null, defaultGooglePayAvailabilityClient$isReady$1);
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
                return obj;
            }
        }
        defaultGooglePayAvailabilityClient$isReady$1 = new DefaultGooglePayAvailabilityClient$isReady$1(this, continuationImpl);
        Object obj2 = defaultGooglePayAvailabilityClient$isReady$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = defaultGooglePayAvailabilityClient$isReady$1.label;
        if (i != 0) {
        }
        obj2.getClass();
        return obj2;
    }
}
