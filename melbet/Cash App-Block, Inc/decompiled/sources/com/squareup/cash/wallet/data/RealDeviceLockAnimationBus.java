package com.squareup.cash.wallet.data;

import java.util.Set;
import kotlin.collections.EmptySet;
import kotlin.collections.SetsKt___SetsKt;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.ReadonlySharedFlow;
import kotlinx.coroutines.flow.ReadonlyStateFlow;
import kotlinx.coroutines.flow.SharedFlowImpl;
import kotlinx.coroutines.flow.StateFlowImpl;

/* loaded from: classes7.dex */
public final class RealDeviceLockAnimationBus {
    public final StateFlowImpl _loadingDeviceIds;
    public final SharedFlowImpl _scrollToDeviceEvents;
    public final ReadonlyStateFlow loadingDeviceIds;
    public final ReadonlySharedFlow scrollToDeviceEvents;

    public RealDeviceLockAnimationBus() {
        StateFlowImpl MutableStateFlow = FlowKt.MutableStateFlow(EmptySet.INSTANCE);
        this._loadingDeviceIds = MutableStateFlow;
        this.loadingDeviceIds = FlowKt.asStateFlow(MutableStateFlow);
        SharedFlowImpl MutableSharedFlow$default = FlowKt.MutableSharedFlow$default(0, 1, BufferOverflow.DROP_OLDEST, 1);
        this._scrollToDeviceEvents = MutableSharedFlow$default;
        this.scrollToDeviceEvents = FlowKt.asSharedFlow(MutableSharedFlow$default);
    }

    public final void onToggleCompleted(String str) {
        StateFlowImpl stateFlowImpl;
        Object value;
        str.getClass();
        do {
            stateFlowImpl = this._loadingDeviceIds;
            value = stateFlowImpl.getValue();
        } while (!stateFlowImpl.compareAndSet(value, SetsKt___SetsKt.minus((Set) value, str)));
    }
}
