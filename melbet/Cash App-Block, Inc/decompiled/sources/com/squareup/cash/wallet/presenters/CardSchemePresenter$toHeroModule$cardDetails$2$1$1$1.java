package com.squareup.cash.wallet.presenters;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ParcelableSnapshotMutableIntState;
import androidx.compose.runtime.State;
import androidx.navigation.NavAction$$ExternalSyntheticOutline0;
import com.squareup.cash.formview.components.arcade.ArcadeFormDateInputView$Content$7$1;
import com.squareup.protos.cash.postcard.CardModule;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.JobKt;

/* loaded from: classes7.dex */
public final class CardSchemePresenter$toHeroModule$cardDetails$2$1$1$1 {
    public final /* synthetic */ ParcelableSnapshotMutableIntState $backSwipeCount$delegate;
    public final /* synthetic */ MutableState $cardFacingForwards$delegate;
    public final /* synthetic */ MutableState $copiedTagDeviceId$delegate;
    public final /* synthetic */ State $copyText$delegate;
    public final /* synthetic */ MutableState $currentInfo$delegate;
    public final /* synthetic */ MutableState $forceToFront$delegate;
    public final /* synthetic */ ParcelableSnapshotMutableIntState $frontSwipeCount$delegate;
    public final /* synthetic */ boolean $isCardEnabled;
    public final /* synthetic */ MutableState $issuedCard$delegate;
    public final /* synthetic */ CoroutineScope $mainScope;
    public final /* synthetic */ MutableState $onBackRotation$delegate;
    public final /* synthetic */ CoroutineScope $scope;
    public final /* synthetic */ ParcelableSnapshotMutableIntState $settledCardCopyAnimationTrigger$delegate;
    public final /* synthetic */ MutableState $shouldCopyAfterAnimationSettles$delegate;
    public final /* synthetic */ CardSchemePresenter this$0;

    public CardSchemePresenter$toHeroModule$cardDetails$2$1$1$1(MutableState mutableState, MutableState mutableState2, CoroutineScope coroutineScope, MutableState mutableState3, CardSchemePresenter cardSchemePresenter, CoroutineScope coroutineScope2, ParcelableSnapshotMutableIntState parcelableSnapshotMutableIntState, ParcelableSnapshotMutableIntState parcelableSnapshotMutableIntState2, MutableState mutableState4, State state, MutableState mutableState5, ParcelableSnapshotMutableIntState parcelableSnapshotMutableIntState3, boolean z, MutableState mutableState6, MutableState mutableState7) {
        this.$cardFacingForwards$delegate = mutableState;
        this.$onBackRotation$delegate = mutableState2;
        this.$mainScope = coroutineScope;
        this.$forceToFront$delegate = mutableState3;
        this.this$0 = cardSchemePresenter;
        this.$scope = coroutineScope2;
        this.$frontSwipeCount$delegate = parcelableSnapshotMutableIntState;
        this.$backSwipeCount$delegate = parcelableSnapshotMutableIntState2;
        this.$shouldCopyAfterAnimationSettles$delegate = mutableState4;
        this.$copyText$delegate = state;
        this.$copiedTagDeviceId$delegate = mutableState5;
        this.$settledCardCopyAnimationTrigger$delegate = parcelableSnapshotMutableIntState3;
        this.$isCardEnabled = z;
        this.$issuedCard$delegate = mutableState6;
        this.$currentInfo$delegate = mutableState7;
    }

    public final void onCardFlip(boolean z) {
        CardModule.CardElementAction cardElementAction;
        this.$cardFacingForwards$delegate.setValue(Boolean.valueOf(z));
        if (z || (cardElementAction = (CardModule.CardElementAction) this.$onBackRotation$delegate.getValue()) == null) {
            return;
        }
        this.$forceToFront$delegate.setValue(Boolean.TRUE);
        JobKt.launch$default(this.$mainScope, null, null, new CardSchemePresenter$models$2$1(this.this$0, cardElementAction, null, 2), 3);
    }

    public final void onCardSettled(boolean z) {
        MutableState mutableState = this.$cardFacingForwards$delegate;
        if (z) {
            if (((Boolean) mutableState.getValue()).booleanValue()) {
                NavAction$$ExternalSyntheticOutline0.m(1, this.$frontSwipeCount$delegate);
            } else {
                NavAction$$ExternalSyntheticOutline0.m(1, this.$backSwipeCount$delegate);
            }
        }
        MutableState mutableState2 = this.$forceToFront$delegate;
        if (((Boolean) mutableState2.getValue()).booleanValue() && ((Boolean) mutableState.getValue()).booleanValue()) {
            mutableState2.setValue(Boolean.FALSE);
        }
        CardSchemePresenter cardSchemePresenter = this.this$0;
        if (!z) {
            MutableState mutableState3 = this.$shouldCopyAfterAnimationSettles$delegate;
            if (((Boolean) mutableState3.getValue()).booleanValue()) {
                mutableState3.setValue(Boolean.FALSE);
                String str = (String) this.$copyText$delegate.getValue();
                if (str != null) {
                    cardSchemePresenter.copyToClipboard(str);
                }
            }
        }
        if (!z && ((String) this.$copiedTagDeviceId$delegate.getValue()) == null) {
            this.$settledCardCopyAnimationTrigger$delegate.setIntValue(cardSchemePresenter.copyAnimationTrigger$delegate.getIntValue());
        }
        JobKt.launch$default(this.$scope, null, null, new ArcadeFormDateInputView$Content$7$1(6, cardSchemePresenter, this.$issuedCard$delegate, this.$currentInfo$delegate, this.$cardFacingForwards$delegate, null, this.$isCardEnabled), 3);
    }
}
