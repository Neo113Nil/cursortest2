package com.squareup.cash.validation;

import dev.zacsweers.metro.internal.Factory;
import kotlinx.coroutines.channels.BufferedChannel;
import kotlinx.coroutines.flow.ChannelAsFlow;
import kotlinx.coroutines.flow.FlowKt;
import papa.PapaEvent;

/* loaded from: classes4.dex */
public final class RealPendingEmailVerification {
    public final BufferedChannel codes;
    public final ChannelAsFlow codesFlow;

    /* loaded from: classes.dex */
    public final class MetroFactory implements Factory {
        public static final MetroFactory INSTANCE = new MetroFactory();

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return new RealPendingEmailVerification();
        }
    }

    public RealPendingEmailVerification() {
        BufferedChannel Channel$default = PapaEvent.Channel$default(0, null, null, 7);
        this.codes = Channel$default;
        this.codesFlow = FlowKt.receiveAsFlow(Channel$default);
    }
}
