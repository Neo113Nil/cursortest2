package com.squareup.cash.wallet.presenters;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ParcelableSnapshotMutableIntState;
import androidx.navigation.NavAction$$ExternalSyntheticOutline0;
import com.squareup.cash.appforeground.AppForegroundState;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import papa.SafeTrace;

/* loaded from: classes4.dex */
public final class CardSchemePresenter$models$7$1 extends SuspendLambda implements Function2 {
    public final /* synthetic */ ParcelableSnapshotMutableIntState $currentPage$delegate;
    public final /* synthetic */ MutableState $pendingPeekForNewTag$delegate;
    public final /* synthetic */ int $r8$classId;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ CardSchemePresenter$models$7$1(int i, MutableState mutableState, ParcelableSnapshotMutableIntState parcelableSnapshotMutableIntState, Continuation continuation) {
        super(2, continuation);
        this.$r8$classId = i;
        this.$pendingPeekForNewTag$delegate = mutableState;
        this.$currentPage$delegate = parcelableSnapshotMutableIntState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        int i = this.$r8$classId;
        ParcelableSnapshotMutableIntState parcelableSnapshotMutableIntState = this.$currentPage$delegate;
        MutableState mutableState = this.$pendingPeekForNewTag$delegate;
        switch (i) {
            case 0:
                return new CardSchemePresenter$models$7$1(0, mutableState, parcelableSnapshotMutableIntState, continuation);
            default:
                return new CardSchemePresenter$models$7$1(1, mutableState, parcelableSnapshotMutableIntState, continuation);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        CoroutineScope coroutineScope = (CoroutineScope) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.$r8$classId) {
        }
        return ((CardSchemePresenter$models$7$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = this.$r8$classId;
        MutableState mutableState = this.$pendingPeekForNewTag$delegate;
        ParcelableSnapshotMutableIntState parcelableSnapshotMutableIntState = this.$currentPage$delegate;
        switch (i) {
            case 0:
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                if (((Boolean) mutableState.getValue()).booleanValue()) {
                    parcelableSnapshotMutableIntState.setIntValue(0);
                }
                break;
            default:
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                if (((AppForegroundState) mutableState.getValue()) == AppForegroundState.BACKGROUND) {
                    NavAction$$ExternalSyntheticOutline0.m(1, parcelableSnapshotMutableIntState);
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
