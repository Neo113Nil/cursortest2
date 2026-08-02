package com.squareup.cash.tabprovider.real;

import com.squareup.cash.core.navigationcontainer.navigator.BetterNavigator$$ExternalSyntheticLambda3;
import com.squareup.cash.tabprovider.api.TabInfoState;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.StateFlowImpl;

/* loaded from: classes.dex */
public final class RealTabPublisher {
    public final StateFlowImpl _state = FlowKt.MutableStateFlow(TabInfoState.NotReady.INSTANCE);
    public BetterNavigator$$ExternalSyntheticLambda3 listener;
    public final CoroutineScope scope;

    public RealTabPublisher(CoroutineScope coroutineScope) {
        this.scope = coroutineScope;
    }
}
