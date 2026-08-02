package com.squareup.protos.franklin.onboarding;

import com.squareup.protos.hieroglyph.KeyScope;
import com.squareup.wire.EnumAdapter;
import com.squareup.wire.WireEnum;

/* loaded from: classes8.dex */
public final class OnboardingDeepLinkType$Companion$ADAPTER$1 extends EnumAdapter {
    @Override // com.squareup.wire.EnumAdapter
    public final WireEnum fromValue(int i) {
        OnboardingDeepLinkType.Companion.getClass();
        return KeyScope.Companion.m3972fromValue(i);
    }
}
