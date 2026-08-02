package com.squareup.protos.franklin.data;

import com.squareup.wire.EnumAdapter;
import com.squareup.wire.WireEnum;

/* loaded from: classes8.dex */
public final class ExplicitConfirmationReason$Companion$ADAPTER$1 extends EnumAdapter {
    @Override // com.squareup.wire.EnumAdapter
    public final WireEnum fromValue(int i) {
        ExplicitConfirmationReason.Companion.getClass();
        if (i == 12) {
            return ExplicitConfirmationReason.SUSPECTED_SCAM;
        }
        if (i != 13) {
            return null;
        }
        return ExplicitConfirmationReason.REQUIRES_PIN_VERIFICATION;
    }
}
