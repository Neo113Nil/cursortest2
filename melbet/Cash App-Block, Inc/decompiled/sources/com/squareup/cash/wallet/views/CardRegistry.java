package com.squareup.cash.wallet.views;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimatableKt;
import androidx.compose.runtime.DerivedSnapshotState;
import androidx.compose.runtime.ParcelableSnapshotMutableIntState;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.snapshots.SnapshotStateMap;
import androidx.recyclerview.widget.RecyclerView;
import com.squareup.cash.card.onboarding.core.CardScene;
import com.squareup.cash.graphics.swampgl.Engine;
import com.squareup.cash.observability.types.ErrorReporter;
import com.squareup.cash.wallet.viewmodels.CardSchemeViewModel;
import java.util.LinkedHashMap;
import kotlinx.coroutines.CoroutineScope;

/* loaded from: classes.dex */
public final class CardRegistry {
    public final ParcelableSnapshotMutableState activeHeroTag$delegate;
    public final Animatable activeHeroTagFocusGain;
    public final ParcelableSnapshotMutableState activeHeroTagPage$delegate;
    public boolean activeHeroTagStateOwned;
    public final ParcelableSnapshotMutableIntState activeTransitionTokenCount$delegate;
    public final Animatable cardAnimation;
    public final ParcelableSnapshotMutableState cardNuxAnimation$delegate;
    public final ErrorReporter errorReporter;
    public final ParcelableSnapshotMutableState inTransition$delegate;
    public final LinkedHashMap pageTagSlots;
    public Engine sceneEngine;
    public final CoroutineScope scope;
    public final ParcelableSnapshotMutableState sharedCache$delegate;
    public final ParcelableSnapshotMutableIntState sharedCacheCount$delegate;
    public final ParcelableSnapshotMutableState sharedCardTransitionState;
    public CardNuxState sharedNuxHero;
    public final ParcelableSnapshotMutableIntState sharedNuxHeroCount$delegate;
    public CardScene sharedScene;
    public final ParcelableSnapshotMutableIntState sharedSceneCount$delegate;
    public final ParcelableSnapshotMutableState sharedSceneError$delegate;
    public final SnapshotStateMap sharedTransitionCache;
    public final SnapshotStateMap sourceOffsets;
    public Engine tagEngine;
    public final ParcelableSnapshotMutableIntState tagEngineCount$delegate;
    public final ParcelableSnapshotMutableState tagEngineError$delegate;
    public final SnapshotStateMap targetOffsets;
    public final SnapshotStateMap sourceCardRegistry = new SnapshotStateMap();
    public final SnapshotStateMap cards = new SnapshotStateMap();

    /* loaded from: classes7.dex */
    public final class SharedCardTransitionState {
        public final DerivedSnapshotState rotation;
        public final DerivedSnapshotState zTranslation;

        public SharedCardTransitionState(DerivedSnapshotState derivedSnapshotState, DerivedSnapshotState derivedSnapshotState2) {
            this.rotation = derivedSnapshotState;
            this.zTranslation = derivedSnapshotState2;
        }
    }

    public CardRegistry(CoroutineScope coroutineScope, ErrorReporter errorReporter) {
        this.scope = coroutineScope;
        this.errorReporter = errorReporter;
        Boolean bool = Boolean.FALSE;
        this.inTransition$delegate = Updater.mutableStateOf$default(bool);
        this.sourceOffsets = new SnapshotStateMap();
        this.targetOffsets = new SnapshotStateMap();
        this.cardAnimation = AnimatableKt.Animatable(RecyclerView.DECELERATION_RATE, 0.01f);
        this.activeTransitionTokenCount$delegate = new ParcelableSnapshotMutableIntState(0);
        this.cardNuxAnimation$delegate = Updater.mutableStateOf$default(null);
        this.sharedCardTransitionState = Updater.mutableStateOf$default(null);
        this.sharedCache$delegate = Updater.mutableStateOf$default(null);
        this.sharedCacheCount$delegate = new ParcelableSnapshotMutableIntState(0);
        this.sharedNuxHeroCount$delegate = new ParcelableSnapshotMutableIntState(0);
        this.activeHeroTag$delegate = Updater.mutableStateOf$default(null);
        this.activeHeroTagPage$delegate = Updater.mutableStateOf$default(null);
        this.activeHeroTagFocusGain = AnimatableKt.Animatable(1.0f, 0.01f);
        this.sharedTransitionCache = new SnapshotStateMap();
        this.sharedSceneCount$delegate = new ParcelableSnapshotMutableIntState(0);
        this.sharedSceneError$delegate = Updater.mutableStateOf$default(bool);
        this.tagEngineCount$delegate = new ParcelableSnapshotMutableIntState(0);
        this.tagEngineError$delegate = Updater.mutableStateOf$default(bool);
        this.pageTagSlots = new LinkedHashMap();
    }

    public final CardSchemeViewModel.Module.HeroTag getActiveHeroTag() {
        return (CardSchemeViewModel.Module.HeroTag) this.activeHeroTag$delegate.getValue();
    }

    public final boolean getInTransition() {
        return ((Boolean) this.inTransition$delegate.getValue()).booleanValue();
    }
}
