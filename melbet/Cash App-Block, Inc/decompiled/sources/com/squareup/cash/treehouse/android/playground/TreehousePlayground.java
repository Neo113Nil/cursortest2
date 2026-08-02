package com.squareup.cash.treehouse.android.playground;

import app.cash.redwood.treehouse.RealTreehouseApp;
import com.squareup.cash.blockers.treehouse.TreehouseFlows$$ExternalSyntheticLambda0;
import com.squareup.cash.treehouse.android.RegisteredTreehouseApp;
import com.squareup.cash.treehouse.android.TreehouseModule$provideCashTreehouseAppFactory$1;
import com.squareup.cash.treehouse.android.broadway.TreehouseScreenFactory;
import com.squareup.cash.treehouse.android.configuration.RealTreehouseConfigurationStore;
import kotlinx.coroutines.flow.FlowKt;

/* loaded from: classes.dex */
public final class TreehousePlayground implements RegisteredTreehouseApp {
    public final RealTreehouseApp treehouseApp;

    public TreehousePlayground(TreehouseModule$provideCashTreehouseAppFactory$1 treehouseModule$provideCashTreehouseAppFactory$1, RealTreehouseConfigurationStore realTreehouseConfigurationStore, TreehouseScreenFactory treehouseScreenFactory) {
        this.treehouseApp = treehouseModule$provideCashTreehouseAppFactory$1.create(realTreehouseConfigurationStore.manifestUrlFlow("playground"), "playground", new TreehouseFlows$$ExternalSyntheticLambda0(realTreehouseConfigurationStore, 7));
        FlowKt.MutableStateFlow(RegisteredTreehouseApp.FeatureFlagState.NONE);
    }

    @Override // com.squareup.cash.treehouse.android.RegisteredTreehouseApp
    public final RealTreehouseApp getTreehouseApp() {
        return this.treehouseApp;
    }
}
