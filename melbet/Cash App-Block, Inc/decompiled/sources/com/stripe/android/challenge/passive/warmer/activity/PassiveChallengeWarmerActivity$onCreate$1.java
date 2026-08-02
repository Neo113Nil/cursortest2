package com.stripe.android.challenge.passive.warmer.activity;

import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.video.views.ExoPlayerVideoView;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.SharedFlowImpl;
import papa.SafeTrace;

/* loaded from: classes8.dex */
public final class PassiveChallengeWarmerActivity$onCreate$1 extends SuspendLambda implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public int label;
    public final /* synthetic */ PassiveChallengeWarmerActivity this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ PassiveChallengeWarmerActivity$onCreate$1(PassiveChallengeWarmerActivity passiveChallengeWarmerActivity, Continuation continuation, int i) {
        super(2, continuation);
        this.$r8$classId = i;
        this.this$0 = passiveChallengeWarmerActivity;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        int i = this.$r8$classId;
        PassiveChallengeWarmerActivity passiveChallengeWarmerActivity = this.this$0;
        switch (i) {
            case 0:
                return new PassiveChallengeWarmerActivity$onCreate$1(passiveChallengeWarmerActivity, continuation, 0);
            default:
                return new PassiveChallengeWarmerActivity$onCreate$1(passiveChallengeWarmerActivity, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        CoroutineScope coroutineScope = (CoroutineScope) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.$r8$classId) {
        }
        return ((PassiveChallengeWarmerActivity$onCreate$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = this.$r8$classId;
        PassiveChallengeWarmerActivity passiveChallengeWarmerActivity = this.this$0;
        switch (i) {
            case 0:
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i2 = this.label;
                if (i2 != 0) {
                    if (i2 == 1) {
                        SafeTrace.throwOnFailure(obj);
                        return Unit.INSTANCE;
                    }
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                SafeTrace.throwOnFailure(obj);
                SharedFlowImpl sharedFlowImpl = ((PassiveChallengeWarmerViewModel) passiveChallengeWarmerActivity.viewModel$delegate.getValue()).result;
                ExoPlayerVideoView.AnonymousClass2.AnonymousClass1 anonymousClass1 = new ExoPlayerVideoView.AnonymousClass2.AnonymousClass1(passiveChallengeWarmerActivity, 13);
                this.label = 1;
                sharedFlowImpl.collect(anonymousClass1, this);
                return coroutineSingletons;
            default:
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i3 = this.label;
                if (i3 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    PassiveChallengeWarmerViewModel passiveChallengeWarmerViewModel = (PassiveChallengeWarmerViewModel) passiveChallengeWarmerActivity.viewModel$delegate.getValue();
                    this.label = 1;
                    if (passiveChallengeWarmerViewModel.warmUpPassiveChallenge(passiveChallengeWarmerActivity, this) == coroutineSingletons2) {
                        return coroutineSingletons2;
                    }
                } else {
                    if (i3 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
        }
    }
}
