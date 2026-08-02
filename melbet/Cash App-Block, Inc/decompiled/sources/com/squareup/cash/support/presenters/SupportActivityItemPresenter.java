package com.squareup.cash.support.presenters;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.Updater;
import app.cash.broadway.navigation.Navigator;
import app.cash.broadway.presenter.molecule.viewmodels.UiCallbackModel;
import app.cash.broadway.screen.Screen;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.plaid.internal.EnumC0170g;
import com.squareup.cash.activity.backend.ActivityItem;
import com.squareup.cash.activity.presenters.ActivityItemEventHandler;
import com.squareup.cash.activity.presenters.ActivityItemPresenter;
import com.squareup.cash.activity.viewmodels.ActivityItemPresentationContext;
import com.squareup.cash.activity.viewmodels.ActivityItemViewEvent;
import com.squareup.cash.activity.viewmodels.ActivityItemViewModel;
import com.squareup.cash.activity.viewmodels.ItemAccessory;
import com.squareup.cash.blockers.screens.BlockersScreens;
import com.squareup.cash.integration.analytics.Analytics;
import com.squareup.cash.support.screens.SupportScreens;
import com.squareup.cash.tax.presenters.TaxWebAppPresenter$models$1$1;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.SafeFlow;

/* loaded from: classes7.dex */
public final class SupportActivityItemPresenter implements ActivityItemPresenter, ActivityItemEventHandler {
    public final ActivityItemPresenter activityItemPresenter;
    public final Analytics analytics;
    public final RealContactSupportNavigator contactSupportNavigator;
    public final SupportScreens.FlowScreens.Data flowData;
    public final ActivityItem item;
    public final Navigator navigator;
    public final ActivityItemPresentationContext presentationContext;

    public SupportActivityItemPresenter(Navigator navigator, ActivityItem activityItem, ActivityItemPresentationContext activityItemPresentationContext, final ActivityItemEventHandler.Factory factory, Function1 function1, Analytics analytics, RealContactSupportNavigator realContactSupportNavigator, ActivityItemPresenter.Factory factory2) {
        navigator.getClass();
        activityItem.getClass();
        this.navigator = navigator;
        this.item = activityItem;
        this.presentationContext = activityItemPresentationContext;
        this.analytics = analytics;
        this.contactSupportNavigator = realContactSupportNavigator;
        this.activityItemPresenter = factory2.create(navigator, activityItem, activityItemPresentationContext, new ActivityItemEventHandler.Factory() { // from class: com.squareup.cash.support.presenters.SupportActivityItemPresenter$activityItemPresenter$1
            @Override // com.squareup.cash.activity.presenters.ActivityItemEventHandler.Factory
            public final ActivityItemEventHandler create(Navigator navigator2, Function1 function12) {
                ActivityItemEventHandler create;
                navigator2.getClass();
                ActivityItemEventHandler.Factory factory3 = ActivityItemEventHandler.Factory.this;
                return (factory3 == null || (create = factory3.create(navigator2, function12)) == null) ? this : create;
            }
        }, function1);
        Screen screen = activityItemPresentationContext.screen;
        if (screen instanceof SupportScreens.FlowScreens) {
            this.flowData = ((SupportScreens.FlowScreens) screen).getData();
        } else {
            if (!(screen instanceof BlockersScreens)) {
                a$$ExternalSyntheticBUOutline0.m$3("Only flow and blockers screen are supported.");
                throw null;
            }
            BlockersScreens blockersScreens = (BlockersScreens) screen;
            this.flowData = new SupportScreens.FlowScreens.Data(blockersScreens.getBlockersData().flowToken, null, null, blockersScreens.getBlockersData().exitScreen, EnumC0170g.SDK_ASSET_ICON_SUBTRACT_VALUE);
        }
    }

    @Override // com.squareup.cash.activity.presenters.ActivityItemEventHandler
    public final Flow handleEvent(ActivityItemViewModel activityItemViewModel, ActivityItemViewEvent activityItemViewEvent, ActivityItem activityItem) {
        activityItemViewModel.getClass();
        activityItemViewEvent.getClass();
        activityItem.getClass();
        return new SafeFlow(new TaxWebAppPresenter$models$1$1(activityItemViewEvent, this, activityItem, (Continuation) null, 15));
    }

    @Override // com.squareup.cash.activity.presenters.ActivityItemPresenter
    public final UiCallbackModel models(Composer composer) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startReplaceGroup(833106710);
        MutableState rememberUpdatedState = Updater.rememberUpdatedState(this.activityItemPresenter.models(gapComposer), gapComposer);
        UiCallbackModel uiCallbackModel = (UiCallbackModel) rememberUpdatedState.getValue();
        ActivityItemViewModel activityItemViewModel = (ActivityItemViewModel) ((UiCallbackModel) rememberUpdatedState.getValue()).model;
        ItemAccessory itemAccessory = activityItemViewModel.accessory;
        if (itemAccessory instanceof ItemAccessory.Button) {
            itemAccessory = null;
        }
        ActivityItemViewModel copy$default = ActivityItemViewModel.copy$default(activityItemViewModel, null, itemAccessory, false, 8047);
        Function1 function1 = uiCallbackModel.onEvent;
        function1.getClass();
        UiCallbackModel uiCallbackModel2 = new UiCallbackModel(function1, copy$default);
        gapComposer.end(false);
        return uiCallbackModel2;
    }
}
