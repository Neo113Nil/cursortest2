package com.squareup.protos.franklin.app;

import com.squareup.protos.franklin.app.RegisterSmsRequest;
import com.squareup.wire.EnumAdapter;
import com.squareup.wire.WireEnum;

/* loaded from: classes8.dex */
public final class RegisterSmsRequest$Scenario$Companion$ADAPTER$1 extends EnumAdapter {
    @Override // com.squareup.wire.EnumAdapter
    public final WireEnum fromValue(int i) {
        RegisterSmsRequest.Scenario.Companion.getClass();
        if (i == 0) {
            return RegisterSmsRequest.Scenario.ONBOARDING;
        }
        if (i != 1) {
            return null;
        }
        return RegisterSmsRequest.Scenario.PROFILE;
    }
}
