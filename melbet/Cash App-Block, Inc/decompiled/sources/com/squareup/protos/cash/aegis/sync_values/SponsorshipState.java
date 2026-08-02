package com.squareup.protos.cash.aegis.sync_values;

import com.squareup.protos.cash.api.Error;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireEnum;
import kotlin.jvm.internal.Reflection;

/* loaded from: classes7.dex */
public enum SponsorshipState implements WireEnum {
    PENDING(0),
    ACTIVE(1),
    CANCELED(2),
    SUSPENDED(3);

    public static final SponsorshipState$Companion$ADAPTER$1 ADAPTER;
    public static final Error.Code.Companion Companion;
    public final int value;

    static {
        SponsorshipState sponsorshipState = PENDING;
        Companion = new Error.Code.Companion(16);
        ADAPTER = new SponsorshipState$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(SponsorshipState.class), Syntax.PROTO_2, sponsorshipState);
    }

    SponsorshipState(int i) {
        this.value = i;
    }

    public static final SponsorshipState fromValue(int i) {
        Companion.getClass();
        if (i == 0) {
            return PENDING;
        }
        if (i == 1) {
            return ACTIVE;
        }
        if (i == 2) {
            return CANCELED;
        }
        if (i != 3) {
            return null;
        }
        return SUSPENDED;
    }

    @Override // com.squareup.wire.WireEnum
    public final int getValue() {
        return this.value;
    }
}
