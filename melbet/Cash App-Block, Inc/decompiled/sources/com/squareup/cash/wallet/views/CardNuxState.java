package com.squareup.cash.wallet.views;

import android.content.Context;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import androidx.compose.runtime.Updater;
import androidx.recyclerview.widget.RecyclerView;
import com.squareup.cash.card.onboarding.CardTextureState;
import com.squareup.cash.wallet.viewmodels.CardSchemeViewModel;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlinx.coroutines.CoroutineScope;

/* loaded from: classes7.dex */
public final class CardNuxState {
    public final Context context;
    public final ParcelableSnapshotMutableState currentCard$delegate;
    public final ParcelableSnapshotMutableState currentRotation$delegate;
    public final ParcelableSnapshotMutableState currentTextureState$delegate;
    public final ParcelableSnapshotMutableState currentZ$delegate;
    public final ParcelableSnapshotMutableState engineErrored$delegate;
    public final Lazy lazyCardGridNuxScene;
    public final Lazy lazyCardScene;
    public final Lazy lazySwampEngine;
    public final ParcelableSnapshotMutableState pendingGridReturnEntrance$delegate;
    public final CoroutineScope scope;

    public CardNuxState(Context context, CardSchemeViewModel.Module.HeroCardDetails heroCardDetails, CoroutineScope coroutineScope) {
        context.getClass();
        heroCardDetails.getClass();
        coroutineScope.getClass();
        this.context = context;
        this.scope = coroutineScope;
        this.currentCard$delegate = Updater.mutableStateOf$default(heroCardDetails);
        this.currentTextureState$delegate = Updater.mutableStateOf$default(null);
        this.currentRotation$delegate = Updater.mutableStateOf$default(CardNuxAnimationsKt.NUX_CARD_ROTATION);
        this.currentZ$delegate = Updater.mutableStateOf$default(Float.valueOf(RecyclerView.DECELERATION_RATE));
        Boolean bool = Boolean.FALSE;
        this.engineErrored$delegate = Updater.mutableStateOf$default(bool);
        this.pendingGridReturnEntrance$delegate = Updater.mutableStateOf$default(bool);
        this.lazySwampEngine = LazyKt.lazy(new CardNuxState$$ExternalSyntheticLambda0(this, 0));
        this.lazyCardScene = LazyKt.lazy(new CardNuxState$$ExternalSyntheticLambda0(this, 1));
        this.lazyCardGridNuxScene = LazyKt.lazy(new CardNuxState$$ExternalSyntheticLambda0(this, 2));
    }

    public final CardSchemeViewModel.Module.HeroCardDetails getCurrentCard() {
        return (CardSchemeViewModel.Module.HeroCardDetails) this.currentCard$delegate.getValue();
    }

    public final CardTextureState getCurrentTextureState() {
        return (CardTextureState) this.currentTextureState$delegate.getValue();
    }
}
