package com.squareup.protos.franklin.onboarding;

import com.squareup.protos.franklin.common.Trigger;
import com.squareup.protos.franklin.onboarding.CashLocalOnboardingDeepLinkPayload;
import com.squareup.wire.EnumAdapter;
import com.squareup.wire.WireEnum;

/* loaded from: classes8.dex */
public final class CashLocalOnboardingDeepLinkPayload$Source$Companion$ADAPTER$1 extends EnumAdapter {
    @Override // com.squareup.wire.EnumAdapter
    public final WireEnum fromValue(int i) {
        CashLocalOnboardingDeepLinkPayload.Source.Companion.getClass();
        return Trigger.Companion.m3954fromValue(i);
    }
}
