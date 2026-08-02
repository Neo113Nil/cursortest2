package com.squareup.cash.wallet.views;

import androidx.compose.foundation.ScrollState;
import androidx.compose.material.SwipeableState$special$$inlined$filter$1;
import androidx.compose.runtime.Updater;
import androidx.datastore.core.DataStoreImpl$data$1$invokeSuspend$$inlined$map$1;
import androidx.room.coroutines.FlowUtil$createFlow$$inlined$map$1;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.benefits.views.BenefitsHubViewKt$BenefitsHub$1$1$4;
import com.squareup.cash.blockers.views.SetPinViewKt$SetPin$3$1$1$1;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.SafeFlow;
import papa.SafeTrace;

/* loaded from: classes7.dex */
public final class WalletHomeViewKt$WalletHome$2$2$1 extends SuspendLambda implements Function2 {
    public final /* synthetic */ Function1 $onEvent;
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ ScrollState $scrollState;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ WalletHomeViewKt$WalletHome$2$2$1(ScrollState scrollState, Function1 function1, Continuation continuation, int i) {
        super(2, continuation);
        this.$r8$classId = i;
        this.$scrollState = scrollState;
        this.$onEvent = function1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.$r8$classId) {
            case 0:
                return new WalletHomeViewKt$WalletHome$2$2$1(this.$scrollState, this.$onEvent, continuation, 0);
            default:
                return new WalletHomeViewKt$WalletHome$2$2$1(this.$scrollState, this.$onEvent, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        CoroutineScope coroutineScope = (CoroutineScope) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.$r8$classId) {
        }
        return ((WalletHomeViewKt$WalletHome$2$2$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = this.$r8$classId;
        Function1 function1 = this.$onEvent;
        ScrollState scrollState = this.$scrollState;
        switch (i) {
            case 0:
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i2 = this.label;
                if (i2 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    SafeFlow snapshotFlow = Updater.snapshotFlow(new WalletHomeViewKt$WalletHome$2$2$1$$ExternalSyntheticLambda0(scrollState, 0));
                    SetPinViewKt$SetPin$3$1$1$1.AnonymousClass2 anonymousClass2 = new SetPinViewKt$SetPin$3$1$1$1.AnonymousClass2(15, function1);
                    this.label = 1;
                    if (snapshotFlow.collect(anonymousClass2, this) == coroutineSingletons) {
                        break;
                    }
                } else if (i2 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                break;
            default:
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i3 = this.label;
                if (i3 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Flow distinctUntilChanged = FlowKt.distinctUntilChanged(new FlowUtil$createFlow$$inlined$map$1(new Integer(0), new DataStoreImpl$data$1$invokeSuspend$$inlined$map$1(new SwipeableState$special$$inlined$filter$1(Updater.snapshotFlow(new WalletHomeViewKt$WalletHome$2$2$1$$ExternalSyntheticLambda0(scrollState, 3)), 3), 15), new BenefitsHubViewKt$BenefitsHub$1$1$4(3, null)));
                    SetPinViewKt$SetPin$3$1$1$1.AnonymousClass2 anonymousClass22 = new SetPinViewKt$SetPin$3$1$1$1.AnonymousClass2(4, function1);
                    this.label = 1;
                    if (distinctUntilChanged.collect(anonymousClass22, this) == coroutineSingletons2) {
                        break;
                    }
                } else if (i3 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
