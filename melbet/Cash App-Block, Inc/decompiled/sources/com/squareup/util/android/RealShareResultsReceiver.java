package com.squareup.util.android;

import dev.zacsweers.metro.internal.Factory;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.SharedFlowImpl;

/* loaded from: classes8.dex */
public final class RealShareResultsReceiver {
    public final SharedFlowImpl mutableSharedResults;
    public final SharedFlowImpl shareResults;

    /* loaded from: classes.dex */
    public final class MetroFactory implements Factory {
        public static final MetroFactory INSTANCE = new MetroFactory();

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return new RealShareResultsReceiver();
        }
    }

    public RealShareResultsReceiver() {
        SharedFlowImpl MutableSharedFlow$default = FlowKt.MutableSharedFlow$default(0, 1, BufferOverflow.DROP_OLDEST, 1);
        this.mutableSharedResults = MutableSharedFlow$default;
        this.shareResults = MutableSharedFlow$default;
    }
}
