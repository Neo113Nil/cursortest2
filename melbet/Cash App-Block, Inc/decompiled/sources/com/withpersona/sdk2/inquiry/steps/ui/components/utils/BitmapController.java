package com.withpersona.sdk2.inquiry.steps.ui.components.utils;

import java.util.Set;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.FlowKt__LimitKt$drop$$inlined$unsafeFlow$1;
import kotlinx.coroutines.flow.StateFlowImpl;

/* loaded from: classes9.dex */
public final class BitmapController {
    public final StateFlowImpl _bitmapValue;
    public final FlowKt__LimitKt$drop$$inlined$unsafeFlow$1 onChanged;

    public BitmapController(Set set) {
        set.getClass();
        StateFlowImpl MutableStateFlow = FlowKt.MutableStateFlow(set);
        this._bitmapValue = MutableStateFlow;
        this.onChanged = FlowKt.drop(MutableStateFlow, 1);
    }

    public BitmapController(Number number) {
        StateFlowImpl MutableStateFlow = FlowKt.MutableStateFlow(number);
        this._bitmapValue = MutableStateFlow;
        this.onChanged = FlowKt.drop(MutableStateFlow, 1);
    }

    public BitmapController() {
        StateFlowImpl MutableStateFlow = FlowKt.MutableStateFlow(null);
        this._bitmapValue = MutableStateFlow;
        this.onChanged = FlowKt.drop(MutableStateFlow, 1);
    }
}
