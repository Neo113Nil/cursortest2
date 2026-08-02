package com.squareup.protos.franklin.common;

import com.squareup.protos.hieroglyph.KeyScope;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireEnum;
import kotlin.jvm.internal.Reflection;

/* loaded from: classes8.dex */
public enum SmsDeliveryMechanism implements WireEnum {
    SMS_TEXT(1),
    VOICE(2);

    public final int value;
    public static final KeyScope.Companion Companion = new KeyScope.Companion();
    public static final SmsDeliveryMechanism$Companion$ADAPTER$1 ADAPTER = new SmsDeliveryMechanism$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(SmsDeliveryMechanism.class), Syntax.PROTO_2, null);

    SmsDeliveryMechanism(int i) {
        this.value = i;
    }

    public static final SmsDeliveryMechanism fromValue(int i) {
        Companion.getClass();
        if (i == 1) {
            return SMS_TEXT;
        }
        if (i != 2) {
            return null;
        }
        return VOICE;
    }

    @Override // com.squareup.wire.WireEnum
    public final int getValue() {
        return this.value;
    }
}
