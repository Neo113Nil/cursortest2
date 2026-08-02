package com.squareup.cash.work.data.real;

import dev.zacsweers.metro.internal.Factory;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.ReadonlySharedFlow;

/* loaded from: classes7.dex */
public final class RealPullToRefreshTrigger {
    public final ReadonlySharedFlow events = FlowKt.asSharedFlow(FlowKt.MutableSharedFlow$default(0, 1, null, 5));

    /* loaded from: classes.dex */
    public final class MetroFactory implements Factory {
        public static final MetroFactory INSTANCE = new MetroFactory();

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return new RealPullToRefreshTrigger();
        }
    }
}
