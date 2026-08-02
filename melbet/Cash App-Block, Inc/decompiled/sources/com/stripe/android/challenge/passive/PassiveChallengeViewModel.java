package com.stripe.android.challenge.passive;

import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.viewmodel.InitializerViewModelFactory;
import androidx.media3.extractor.ChunkIndexMerger;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.stripe.android.StripePaymentController$$ExternalSyntheticLambda1;
import com.stripe.android.challenge.passive.PassiveChallengeActivityResult;
import com.stripe.android.hcaptcha.DefaultHCaptchaService;
import com.stripe.android.hcaptcha.HCaptchaService$Result;
import com.stripe.android.model.PassiveCaptchaParams;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
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
public final class PassiveChallengeViewModel extends ViewModel {
    public static final InitializerViewModelFactory Factory;
    public final SharedFlowImpl _result;
    public final DefaultHCaptchaService hCaptchaService;
    public final PassiveCaptchaParams passiveCaptchaParams;
    public final SharedFlowImpl result;

    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00060\u0001j\u0002`\u0002¨\u0006\u0003"}, d2 = {"com/stripe/android/challenge/passive/PassiveChallengeViewModel$NoArgsException", "Ljava/lang/IllegalArgumentException;", "Lkotlin/IllegalArgumentException;", "payments-core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public final class NoArgsException extends IllegalArgumentException {
    }

    static {
        ChunkIndexMerger chunkIndexMerger = new ChunkIndexMerger(1);
        chunkIndexMerger.addInitializer(Reflection.factory.getOrCreateKotlinClass(PassiveChallengeViewModel.class), new StripePaymentController$$ExternalSyntheticLambda1(27));
        Factory = chunkIndexMerger.build();
    }

    public PassiveChallengeViewModel(PassiveCaptchaParams passiveCaptchaParams, DefaultHCaptchaService defaultHCaptchaService) {
        passiveCaptchaParams.getClass();
        this.passiveCaptchaParams = passiveCaptchaParams;
        this.hCaptchaService = defaultHCaptchaService;
        SharedFlowImpl MutableSharedFlow$default = FlowKt.MutableSharedFlow$default(1, 0, null, 6);
        this._result = MutableSharedFlow$default;
        this.result = MutableSharedFlow$default;
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x006c, code lost:
    
        if (r10.emit(r11, r6) == r0) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0085, code lost:
    
        if (r10.emit(r11, r6) == r0) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0052, code lost:
    
        if (r12 == r0) goto L33;
     */
    /* JADX WARN: Removed duplicated region for block: B:24:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object startPassiveChallenge(FragmentActivity fragmentActivity, ContinuationImpl continuationImpl) {
        PassiveChallengeViewModel$startPassiveChallenge$1 passiveChallengeViewModel$startPassiveChallenge$1;
        int i;
        boolean z;
        if (continuationImpl instanceof PassiveChallengeViewModel$startPassiveChallenge$1) {
            passiveChallengeViewModel$startPassiveChallenge$1 = (PassiveChallengeViewModel$startPassiveChallenge$1) continuationImpl;
            int i2 = passiveChallengeViewModel$startPassiveChallenge$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                passiveChallengeViewModel$startPassiveChallenge$1.label = i2 - PKIFailureInfo.systemUnavail;
                PassiveChallengeViewModel$startPassiveChallenge$1 passiveChallengeViewModel$startPassiveChallenge$12 = passiveChallengeViewModel$startPassiveChallenge$1;
                Object obj = passiveChallengeViewModel$startPassiveChallenge$12.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = passiveChallengeViewModel$startPassiveChallenge$12.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    PassiveCaptchaParams passiveCaptchaParams = this.passiveCaptchaParams;
                    String str = passiveCaptchaParams.siteKey;
                    String str2 = passiveCaptchaParams.rqData;
                    Integer num = passiveCaptchaParams.tokenTimeoutSeconds;
                    passiveChallengeViewModel$startPassiveChallenge$12.label = 1;
                    obj = this.hCaptchaService.performPassiveHCaptcha(fragmentActivity, str, str2, num, passiveChallengeViewModel$startPassiveChallenge$12);
                } else {
                    if (i != 1) {
                        if (i == 2) {
                            SafeTrace.throwOnFailure(obj);
                            return Unit.INSTANCE;
                        }
                        if (i == 3) {
                            SafeTrace.throwOnFailure(obj);
                            return Unit.INSTANCE;
                        }
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                HCaptchaService$Result hCaptchaService$Result = (HCaptchaService$Result) obj;
                z = hCaptchaService$Result instanceof HCaptchaService$Result.Failure;
                SharedFlowImpl sharedFlowImpl = this._result;
                if (!z) {
                    PassiveChallengeActivityResult.Failed failed = new PassiveChallengeActivityResult.Failed(((HCaptchaService$Result.Failure) hCaptchaService$Result).error);
                    passiveChallengeViewModel$startPassiveChallenge$12.label = 2;
                } else {
                    if (!(hCaptchaService$Result instanceof HCaptchaService$Result.Success)) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return null;
                    }
                    PassiveChallengeActivityResult.Success success = new PassiveChallengeActivityResult.Success(((HCaptchaService$Result.Success) hCaptchaService$Result).token);
                    passiveChallengeViewModel$startPassiveChallenge$12.label = 3;
                }
                return coroutineSingletons;
            }
        }
        passiveChallengeViewModel$startPassiveChallenge$1 = new PassiveChallengeViewModel$startPassiveChallenge$1(this, continuationImpl);
        PassiveChallengeViewModel$startPassiveChallenge$1 passiveChallengeViewModel$startPassiveChallenge$122 = passiveChallengeViewModel$startPassiveChallenge$1;
        Object obj2 = passiveChallengeViewModel$startPassiveChallenge$122.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = passiveChallengeViewModel$startPassiveChallenge$122.label;
        if (i != 0) {
        }
        HCaptchaService$Result hCaptchaService$Result2 = (HCaptchaService$Result) obj2;
        z = hCaptchaService$Result2 instanceof HCaptchaService$Result.Failure;
        SharedFlowImpl sharedFlowImpl2 = this._result;
        if (!z) {
        }
        return coroutineSingletons2;
    }
}
