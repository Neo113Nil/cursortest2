package com.squareup.cash.taptopay.backend.real;

import com.plaid.internal.EnumC0170g;
import dev.zacsweers.metro.internal.Factory;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.SharedFlowImpl;

/* loaded from: classes.dex */
public final class RealTapToPayActionManager {
    public final SharedFlowImpl tapToPayActions = FlowKt.MutableSharedFlow$default(0, EnumC0170g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_ROUTING_NUMBER_SEARCH_VALUE, null, 5);

    public final class MetroFactory implements Factory {
        public static final MetroFactory INSTANCE = new MetroFactory(0);
        public static final MetroFactory INSTANCE$1 = new MetroFactory(1);
        public final /* synthetic */ int $r8$classId;

        public /* synthetic */ MetroFactory(int i) {
            this.$r8$classId = i;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            switch (this.$r8$classId) {
                case 0:
                    return new RealTapToPayActionManager();
                default:
                    return new RealTapToPaySessionManager();
            }
        }
    }
}
