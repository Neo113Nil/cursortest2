package com.squareup.protos.cash.blockuserjourneys.api.v1;

import com.squareup.wire.Syntax;
import com.squareup.wire.WireEnum;
import kotlin.jvm.internal.Reflection;
import okio.AsyncTimeout;

/* loaded from: classes.dex */
public enum JourneyTerminationReason implements WireEnum {
    JOURNEY_TERMINATION_REASON_UNSPECIFIED(0),
    JOURNEY_TERMINATION_REASON_TIMEOUT_WITH_ACTIVE_USER(1),
    JOURNEY_TERMINATION_REASON_TIMEOUT_WITH_IDLE_USER(2),
    JOURNEY_TERMINATION_REASON_JOURNEY_RESTARTED(3),
    JOURNEY_TERMINATION_REASON_MISSING_BLOCKER_FLOW_OUTCOME(4);

    public static final JourneyTerminationReason$Companion$ADAPTER$1 ADAPTER;
    public static final AsyncTimeout.Companion Companion;
    public final int value;

    static {
        JourneyTerminationReason journeyTerminationReason = JOURNEY_TERMINATION_REASON_UNSPECIFIED;
        Companion = new AsyncTimeout.Companion();
        ADAPTER = new JourneyTerminationReason$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(JourneyTerminationReason.class), Syntax.PROTO_2, journeyTerminationReason);
    }

    JourneyTerminationReason(int i) {
        this.value = i;
    }

    public static final JourneyTerminationReason fromValue(int i) {
        Companion.getClass();
        return AsyncTimeout.Companion.fromValue(i);
    }

    @Override // com.squareup.wire.WireEnum
    public final int getValue() {
        return this.value;
    }
}
