package com.squareup.cash.wallet.data;

import dev.zacsweers.metro.internal.Factory;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.ReadonlyStateFlow;
import kotlinx.coroutines.flow.StateFlowImpl;

/* loaded from: classes7.dex */
public final class RealNewTagPeekBus {
    public final StateFlowImpl _pendingPeek;
    public Integer knownTagCount;
    public final ReadonlyStateFlow pendingPeek;

    /* loaded from: classes.dex */
    public final class MetroFactory implements Factory {
        public final /* synthetic */ int $r8$classId;
        public static final MetroFactory INSTANCE$1 = new MetroFactory(1);
        public static final MetroFactory INSTANCE = new MetroFactory(0);

        public /* synthetic */ MetroFactory(int i) {
            this.$r8$classId = i;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            switch (this.$r8$classId) {
                case 0:
                    return new RealNewTagPeekBus();
                default:
                    return new RealDeviceLockAnimationBus();
            }
        }
    }

    public RealNewTagPeekBus() {
        StateFlowImpl MutableStateFlow = FlowKt.MutableStateFlow(Boolean.FALSE);
        this._pendingPeek = MutableStateFlow;
        this.pendingPeek = FlowKt.asStateFlow(MutableStateFlow);
    }
}
