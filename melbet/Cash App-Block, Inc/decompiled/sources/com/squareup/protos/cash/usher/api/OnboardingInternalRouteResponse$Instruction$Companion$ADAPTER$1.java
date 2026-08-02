package com.squareup.protos.cash.usher.api;

import com.squareup.protos.cash.usher.api.OnboardingInternalRouteResponse;
import com.squareup.wire.EnumAdapter;
import com.squareup.wire.WireEnum;

/* loaded from: classes8.dex */
public final class OnboardingInternalRouteResponse$Instruction$Companion$ADAPTER$1 extends EnumAdapter {
    @Override // com.squareup.wire.EnumAdapter
    public final WireEnum fromValue(int i) {
        OnboardingInternalRouteResponse.Instruction.Companion.getClass();
        if (i == 0) {
            return OnboardingInternalRouteResponse.Instruction.INSTRUCTION_INTERNAL_NAV;
        }
        if (i != 1) {
            return null;
        }
        return OnboardingInternalRouteResponse.Instruction.INSTRUCTION_RESPONSE_CONTEXT;
    }
}
