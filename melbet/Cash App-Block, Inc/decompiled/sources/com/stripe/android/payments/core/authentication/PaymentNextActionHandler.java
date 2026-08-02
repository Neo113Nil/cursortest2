package com.stripe.android.payments.core.authentication;

import androidx.activity.ComponentActivity;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.stripe.android.core.networking.ApiRequest;
import com.stripe.android.payments.core.ActivityResultLauncherHost;
import com.stripe.android.view.ActivityHost;
import kotlin.Unit;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;

/* loaded from: classes8.dex */
public abstract class PaymentNextActionHandler implements ActivityResultLauncherHost {
    /* JADX WARN: Code restructure failed: missing block: B:18:0x005b, code lost:
    
        if (performNextActionOnResumed(r7, r8, r9, r0) != r1) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x005d, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x004c, code lost:
    
        if (com.google.android.gms.internal.mlkit_genai_prompt.zzki.access$awaitResumed(r10, r0) == r1) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object performNextAction(ActivityHost activityHost, Object obj, ApiRequest.Options options, ContinuationImpl continuationImpl) {
        PaymentNextActionHandler$performNextAction$1 paymentNextActionHandler$performNextAction$1;
        int i;
        if (continuationImpl instanceof PaymentNextActionHandler$performNextAction$1) {
            paymentNextActionHandler$performNextAction$1 = (PaymentNextActionHandler$performNextAction$1) continuationImpl;
            int i2 = paymentNextActionHandler$performNextAction$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                paymentNextActionHandler$performNextAction$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj2 = paymentNextActionHandler$performNextAction$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = paymentNextActionHandler$performNextAction$1.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj2);
                    ComponentActivity componentActivity = activityHost.lifecycleOwner;
                    paymentNextActionHandler$performNextAction$1.L$0 = activityHost;
                    paymentNextActionHandler$performNextAction$1.L$1 = obj;
                    paymentNextActionHandler$performNextAction$1.L$2 = options;
                    paymentNextActionHandler$performNextAction$1.label = 1;
                } else {
                    if (i != 1) {
                        if (i == 2) {
                            SafeTrace.throwOnFailure(obj2);
                            return Unit.INSTANCE;
                        }
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    options = paymentNextActionHandler$performNextAction$1.L$2;
                    obj = paymentNextActionHandler$performNextAction$1.L$1;
                    activityHost = paymentNextActionHandler$performNextAction$1.L$0;
                    SafeTrace.throwOnFailure(obj2);
                }
                paymentNextActionHandler$performNextAction$1.L$0 = null;
                paymentNextActionHandler$performNextAction$1.L$1 = null;
                paymentNextActionHandler$performNextAction$1.L$2 = null;
                paymentNextActionHandler$performNextAction$1.label = 2;
            }
        }
        paymentNextActionHandler$performNextAction$1 = new PaymentNextActionHandler$performNextAction$1(this, continuationImpl);
        Object obj22 = paymentNextActionHandler$performNextAction$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = paymentNextActionHandler$performNextAction$1.label;
        if (i != 0) {
        }
        paymentNextActionHandler$performNextAction$1.L$0 = null;
        paymentNextActionHandler$performNextAction$1.L$1 = null;
        paymentNextActionHandler$performNextAction$1.L$2 = null;
        paymentNextActionHandler$performNextAction$1.label = 2;
    }

    public abstract Object performNextActionOnResumed(ActivityHost activityHost, Object obj, ApiRequest.Options options, PaymentNextActionHandler$performNextAction$1 paymentNextActionHandler$performNextAction$1);
}
