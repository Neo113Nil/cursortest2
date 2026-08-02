package com.stripe.android.challenge.passive.warmer.activity;

import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.viewmodel.InitializerViewModelFactory;
import androidx.media3.extractor.ChunkIndexMerger;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.stripe.android.StripePaymentController$$ExternalSyntheticLambda1;
import com.stripe.android.hcaptcha.DefaultHCaptchaService;
import com.stripe.android.model.PassiveCaptchaParams;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Reflection;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.SharedFlowImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;

/* loaded from: classes8.dex */
public final class PassiveChallengeWarmerViewModel extends ViewModel {
    public static final InitializerViewModelFactory Factory;
    public final SharedFlowImpl _result;
    public final DefaultHCaptchaService hCaptchaService;
    public final PassiveCaptchaParams passiveCaptchaParams;
    public final SharedFlowImpl result;

    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00060\u0001j\u0002`\u0002¨\u0006\u0003"}, d2 = {"com/stripe/android/challenge/passive/warmer/activity/PassiveChallengeWarmerViewModel$NoArgsException", "Ljava/lang/IllegalArgumentException;", "Lkotlin/IllegalArgumentException;", "payments-core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public final class NoArgsException extends IllegalArgumentException {
    }

    static {
        ChunkIndexMerger chunkIndexMerger = new ChunkIndexMerger(1);
        chunkIndexMerger.addInitializer(Reflection.factory.getOrCreateKotlinClass(PassiveChallengeWarmerViewModel.class), new StripePaymentController$$ExternalSyntheticLambda1(28));
        Factory = chunkIndexMerger.build();
    }

    public PassiveChallengeWarmerViewModel(PassiveCaptchaParams passiveCaptchaParams, DefaultHCaptchaService defaultHCaptchaService) {
        passiveCaptchaParams.getClass();
        this.passiveCaptchaParams = passiveCaptchaParams;
        this.hCaptchaService = defaultHCaptchaService;
        SharedFlowImpl MutableSharedFlow$default = FlowKt.MutableSharedFlow$default(1, 0, null, 6);
        this._result = MutableSharedFlow$default;
        this.result = MutableSharedFlow$default;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0053, code lost:
    
        if (r5._result.emit(com.stripe.android.challenge.passive.warmer.activity.PassiveChallengeWarmerCompleted.INSTANCE, r0) != r1) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0055, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0046, code lost:
    
        if (r5.hCaptchaService.warmUp(r6, r2, r7, r0) == r1) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object warmUpPassiveChallenge(FragmentActivity fragmentActivity, ContinuationImpl continuationImpl) {
        PassiveChallengeWarmerViewModel$warmUpPassiveChallenge$1 passiveChallengeWarmerViewModel$warmUpPassiveChallenge$1;
        int i;
        if (continuationImpl instanceof PassiveChallengeWarmerViewModel$warmUpPassiveChallenge$1) {
            passiveChallengeWarmerViewModel$warmUpPassiveChallenge$1 = (PassiveChallengeWarmerViewModel$warmUpPassiveChallenge$1) continuationImpl;
            int i2 = passiveChallengeWarmerViewModel$warmUpPassiveChallenge$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                passiveChallengeWarmerViewModel$warmUpPassiveChallenge$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = passiveChallengeWarmerViewModel$warmUpPassiveChallenge$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = passiveChallengeWarmerViewModel$warmUpPassiveChallenge$1.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    PassiveCaptchaParams passiveCaptchaParams = this.passiveCaptchaParams;
                    String str = passiveCaptchaParams.siteKey;
                    String str2 = passiveCaptchaParams.rqData;
                    passiveChallengeWarmerViewModel$warmUpPassiveChallenge$1.label = 1;
                } else {
                    if (i != 1) {
                        if (i == 2) {
                            SafeTrace.throwOnFailure(obj);
                            return Unit.INSTANCE;
                        }
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                passiveChallengeWarmerViewModel$warmUpPassiveChallenge$1.label = 2;
            }
        }
        passiveChallengeWarmerViewModel$warmUpPassiveChallenge$1 = new PassiveChallengeWarmerViewModel$warmUpPassiveChallenge$1(this, continuationImpl);
        Object obj2 = passiveChallengeWarmerViewModel$warmUpPassiveChallenge$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = passiveChallengeWarmerViewModel$warmUpPassiveChallenge$1.label;
        if (i != 0) {
        }
        passiveChallengeWarmerViewModel$warmUpPassiveChallenge$1.label = 2;
    }
}
