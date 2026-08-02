package com.squareup.protos.franklin.common;

import com.squareup.wire.EnumAdapter;
import com.squareup.wire.WireEnum;

/* loaded from: classes8.dex */
public final class SmsDeliveryMechanism$Companion$ADAPTER$1 extends EnumAdapter {
    @Override // com.squareup.wire.EnumAdapter
    public final WireEnum fromValue(int i) {
        SmsDeliveryMechanism.Companion.getClass();
        if (i == 1) {
            return SmsDeliveryMechanism.SMS_TEXT;
        }
        if (i != 2) {
            return null;
        }
        return SmsDeliveryMechanism.VOICE;
    }
}
