package com.squareup.protos.franklin.data;

import com.squareup.protos.franklin.ui.UiControl;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireEnum;
import kotlin.jvm.internal.Reflection;

/* loaded from: classes8.dex */
public enum ExplicitConfirmationReason implements WireEnum {
    SUSPECTED_SCAM(12),
    REQUIRES_PIN_VERIFICATION(13);

    public final int value;
    public static final UiControl.Type.Companion Companion = new UiControl.Type.Companion();
    public static final ExplicitConfirmationReason$Companion$ADAPTER$1 ADAPTER = new ExplicitConfirmationReason$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(ExplicitConfirmationReason.class), Syntax.PROTO_2, null);

    ExplicitConfirmationReason(int i) {
        this.value = i;
    }

    public static final ExplicitConfirmationReason fromValue(int i) {
        Companion.getClass();
        if (i == 12) {
            return SUSPECTED_SCAM;
        }
        if (i != 13) {
            return null;
        }
        return REQUIRES_PIN_VERIFICATION;
    }

    @Override // com.squareup.wire.WireEnum
    public final int getValue() {
        return this.value;
    }
}
