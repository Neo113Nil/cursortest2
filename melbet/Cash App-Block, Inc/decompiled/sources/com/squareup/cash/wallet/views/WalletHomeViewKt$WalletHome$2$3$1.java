package com.squareup.cash.wallet.views;

import androidx.compose.foundation.ScrollState;
import androidx.compose.material3.DatePickerKt$updateDisplayedMonth$3;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.Updater;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.card.onboarding.PaymentDeviceCustomizationViewKt;
import com.squareup.cash.video.views.ExoPlayerVideoView;
import com.squareup.cash.work.data.api.AssignedJobProviderKt$jobs$$inlined$map$1;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref$BooleanRef;
import kotlin.jvm.internal.Ref$IntRef;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.SafeFlow;
import papa.SafeTrace;

/* loaded from: classes7.dex */
public final class WalletHomeViewKt$WalletHome$2$3$1 extends SuspendLambda implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ ScrollState $scrollState;
    public final /* synthetic */ MutableState $shouldScrollToTopForNewTag$delegate;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WalletHomeViewKt$WalletHome$2$3$1(MutableState mutableState, ScrollState scrollState, Continuation continuation) {
        super(2, continuation);
        this.$r8$classId = 0;
        this.$shouldScrollToTopForNewTag$delegate = mutableState;
        this.$scrollState = scrollState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        int i = this.$r8$classId;
        MutableState mutableState = this.$shouldScrollToTopForNewTag$delegate;
        ScrollState scrollState = this.$scrollState;
        switch (i) {
            case 0:
                return new WalletHomeViewKt$WalletHome$2$3$1(mutableState, scrollState, continuation);
            case 1:
                return new WalletHomeViewKt$WalletHome$2$3$1(scrollState, mutableState, continuation, 1);
            default:
                return new WalletHomeViewKt$WalletHome$2$3$1(scrollState, mutableState, continuation, 2);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        CoroutineScope coroutineScope = (CoroutineScope) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.$r8$classId) {
        }
        return ((WalletHomeViewKt$WalletHome$2$3$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = this.$r8$classId;
        MutableState mutableState = this.$shouldScrollToTopForNewTag$delegate;
        ScrollState scrollState = this.$scrollState;
        switch (i) {
            case 0:
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i2 = this.label;
                if (i2 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    SafeFlow snapshotFlow = Updater.snapshotFlow(new WalletHomeViewKt$$ExternalSyntheticLambda6(8, mutableState));
                    ExoPlayerVideoView.AnonymousClass2.AnonymousClass1 anonymousClass1 = new ExoPlayerVideoView.AnonymousClass2.AnonymousClass1(scrollState, 5);
                    this.label = 1;
                    Object collect = snapshotFlow.collect(new AssignedJobProviderKt$jobs$$inlined$map$1.AnonymousClass2(anonymousClass1, 23), this);
                    if (collect != coroutineSingletons) {
                        collect = Unit.INSTANCE;
                    }
                    if (collect == coroutineSingletons) {
                        break;
                    }
                } else if (i2 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                break;
            case 1:
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i3 = this.label;
                if (i3 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Ref$BooleanRef ref$BooleanRef = new Ref$BooleanRef();
                    Ref$BooleanRef ref$BooleanRef2 = new Ref$BooleanRef();
                    Ref$IntRef ref$IntRef = new Ref$IntRef();
                    ref$IntRef.element = scrollState.value$delegate.getIntValue();
                    SafeFlow snapshotFlow2 = Updater.snapshotFlow(new WalletHomeViewKt$WalletHome$2$2$1$$ExternalSyntheticLambda0(scrollState, 1));
                    DatePickerKt$updateDisplayedMonth$3 datePickerKt$updateDisplayedMonth$3 = new DatePickerKt$updateDisplayedMonth$3(ref$IntRef, ref$BooleanRef, ref$BooleanRef2, this.$shouldScrollToTopForNewTag$delegate, 8);
                    this.label = 1;
                    if (snapshotFlow2.collect(datePickerKt$updateDisplayedMonth$3, this) == coroutineSingletons2) {
                        break;
                    }
                } else if (i3 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                break;
            default:
                CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i4 = this.label;
                if (i4 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    this.label = 1;
                    if (ScrollState.animateScrollTo$default(scrollState, 0, this) == coroutineSingletons3) {
                        break;
                    }
                } else if (i4 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                int i5 = PaymentDeviceCustomizationViewKt.$r8$clinit;
                mutableState.setValue(null);
                break;
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ WalletHomeViewKt$WalletHome$2$3$1(ScrollState scrollState, MutableState mutableState, Continuation continuation, int i) {
        super(2, continuation);
        this.$r8$classId = i;
        this.$scrollState = scrollState;
        this.$shouldScrollToTopForNewTag$delegate = mutableState;
    }
}
