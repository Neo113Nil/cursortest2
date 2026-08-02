package com.squareup.cash.work.applets.views;

import app.cash.badging.backend.FinishSetupTileBadgeCounter;
import com.squareup.cash.clientsync.readers.AndroidSyncValueSpecs;
import com.squareup.cash.clientsync.readers.SyncValueReader;
import com.squareup.cash.eligibility.backend.api.EligibleFeature;
import com.squareup.cash.eligibility.backend.real.RealFeatureEligibilityRepository;
import com.squareup.cash.featureflags.FeatureFlagManager;
import com.squareup.cash.featureflags.LaunchDarklyFeatureFlags$WorkApplet;
import com.squareup.cash.featureflags.RealFeatureFlagManager;
import com.squareup.cash.money.applets.viewmodels.Applet;
import com.squareup.cash.money.core.ids.AppletId;
import com.squareup.cash.money.core.states.AppletAvailabilityState;
import com.squareup.cash.tabprovider.real.RealLocalTabProvider$showLocal$1$2;
import com.squareup.scannerview.TextSetter;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.ReadonlyStateFlow;
import kotlinx.coroutines.flow.StartedWhileSubscribed;

/* loaded from: classes6.dex */
public final class WorkApplet {
    public final ReadonlyStateFlow appletAvailabilityState;
    public final TextSetter workAppletTileFactory;

    public WorkApplet(RealFeatureEligibilityRepository realFeatureEligibilityRepository, FeatureFlagManager featureFlagManager, SyncValueReader syncValueReader, TextSetter textSetter, CoroutineScope coroutineScope) {
        this.workAppletTileFactory = textSetter;
        this.appletAvailabilityState = FlowKt.stateIn(FlowKt.combine(new FinishSetupTileBadgeCounter(10, realFeatureEligibilityRepository.currentEligibleFeatures(), new EligibleFeature[]{EligibleFeature.WORK_APPLET_VISIBILITY}), ((RealFeatureFlagManager) featureFlagManager).peekValues(LaunchDarklyFeatureFlags$WorkApplet.INSTANCE), syncValueReader.getSingleValue(AndroidSyncValueSpecs.CashForWorkApplet), new RealLocalTabProvider$showLocal$1$2(4, null, 2)), coroutineScope, new StartedWhileSubscribed(0L, Long.MAX_VALUE), AppletAvailabilityState.LOADING);
    }

    public final Applet getApplet() {
        return new Applet(AppletId.WORK, this.appletAvailabilityState, new WorkApplet$applet$1(2, this, WorkApplet.class, "buildTile", "buildTile(Lapp/cash/broadway/navigation/Navigator;Lkotlinx/coroutines/CoroutineScope;)Lcom/squareup/cash/money/applets/viewmodels/AppletTile;", 0, 0));
    }
}
