package com.squareup.protos.rewardly.common;

import com.squareup.protos.franklin.api.UiAlias;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireEnum;
import kotlin.jvm.internal.Reflection;

/* loaded from: classes.dex */
public enum RewardSlotState implements WireEnum {
    LOCKED(1),
    EMPTY(2),
    OCCUPIED(3);

    public final int value;
    public static final UiAlias.Type.Companion Companion = new UiAlias.Type.Companion();
    public static final RewardSlotState$Companion$ADAPTER$1 ADAPTER = new RewardSlotState$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(RewardSlotState.class), Syntax.PROTO_2, null);

    RewardSlotState(int i) {
        this.value = i;
    }

    public static final RewardSlotState fromValue(int i) {
        Companion.getClass();
        if (i == 1) {
            return LOCKED;
        }
        if (i == 2) {
            return EMPTY;
        }
        if (i != 3) {
            return null;
        }
        return OCCUPIED;
    }

    @Override // com.squareup.wire.WireEnum
    public final int getValue() {
        return this.value;
    }
}
