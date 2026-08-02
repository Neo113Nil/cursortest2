package com.squareup.cash.transfers.presenters;

import com.fillr.n;
import com.squareup.cash.data.blockers.BlockersDataNavigator;
import com.squareup.cash.data.blockers.FlowStarter;
import com.squareup.cash.data.transfers.TransferManager;
import com.squareup.cash.work.presenters.RealYouPresenter$MetroFactory;
import kotlin.coroutines.CoroutineContext;

/* loaded from: classes.dex */
public final class TransferActionProcessor$Factory$Impl {
    public final RealYouPresenter$MetroFactory delegateFactory;

    public TransferActionProcessor$Factory$Impl(RealYouPresenter$MetroFactory realYouPresenter$MetroFactory) {
        this.delegateFactory = realYouPresenter$MetroFactory;
    }

    public final n create(TransferManager transferManager) {
        RealYouPresenter$MetroFactory realYouPresenter$MetroFactory = this.delegateFactory;
        BlockersDataNavigator blockersDataNavigator = (BlockersDataNavigator) realYouPresenter$MetroFactory.assignedJobProvider.invoke();
        FlowStarter flowStarter = (FlowStarter) realYouPresenter$MetroFactory.assignedLocationProvider.invoke();
        CoroutineContext coroutineContext = (CoroutineContext) realYouPresenter$MetroFactory.passcodeProvider.invoke();
        blockersDataNavigator.getClass();
        flowStarter.getClass();
        coroutineContext.getClass();
        return new n(transferManager, blockersDataNavigator, flowStarter, coroutineContext);
    }
}
