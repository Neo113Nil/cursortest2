package com.squareup.cash.wallet.presenters;

import com.squareup.cash.session.backend.SessionManager;
import com.squareup.protos.cash.weaver.api.WeaverApi;
import kotlin.collections.EmptySet;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.ReadonlyStateFlow;
import kotlinx.coroutines.flow.StateFlowImpl;

/* loaded from: classes8.dex */
public final class RealNextUpCandidateDismisser {
    public final ReadonlyStateFlow dismissedItemIds;
    public final CoroutineContext ioContext;
    public final StateFlowImpl mutableDismissedItemIds;
    public final CoroutineScope scope;
    public final SessionManager sessionManager;
    public final WeaverApi weaverApi;

    public RealNextUpCandidateDismisser(WeaverApi weaverApi, SessionManager sessionManager, CoroutineScope coroutineScope, CoroutineContext coroutineContext) {
        this.weaverApi = weaverApi;
        this.sessionManager = sessionManager;
        this.scope = coroutineScope;
        this.ioContext = coroutineContext;
        StateFlowImpl MutableStateFlow = FlowKt.MutableStateFlow(EmptySet.INSTANCE);
        this.mutableDismissedItemIds = MutableStateFlow;
        this.dismissedItemIds = FlowKt.asStateFlow(MutableStateFlow);
    }
}
