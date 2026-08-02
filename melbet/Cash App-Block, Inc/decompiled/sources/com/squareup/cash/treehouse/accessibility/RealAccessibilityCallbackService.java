package com.squareup.cash.treehouse.accessibility;

import dev.zacsweers.metro.internal.Factory;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.SharedFlowImpl;

/* loaded from: classes.dex */
public final class RealAccessibilityCallbackService implements AccessibilityCallbackService {
    public final SharedFlowImpl flow = FlowKt.MutableSharedFlow$default(0, 1, BufferOverflow.DROP_OLDEST, 1);

    public final class MetroFactory implements Factory {
        public static final MetroFactory INSTANCE = new MetroFactory();

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return new RealAccessibilityCallbackService();
        }
    }

    @Override // com.squareup.cash.treehouse.accessibility.AccessibilityCallbackService
    public final Flow callbacks() {
        return this.flow;
    }
}
