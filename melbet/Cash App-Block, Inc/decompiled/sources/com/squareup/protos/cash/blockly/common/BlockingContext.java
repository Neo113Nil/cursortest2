package com.squareup.protos.cash.blockly.common;

import com.squareup.protos.cash.api.Error;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireEnum;
import kotlin.jvm.internal.Reflection;

/* loaded from: classes7.dex */
public enum BlockingContext implements WireEnum {
    UNSPECIFIED(0),
    PROFILE_BLOCK(1),
    PROFILE_REPORT(2),
    ACTIVITY_BLOCK(3),
    ACTIVITY_REPORT(4),
    BLOCKLIST(5),
    FAMILY_ACTIVITY_BLOCK(6),
    FAMILY_BLOCKLIST(7),
    SPONSORSHIP_CANCELLATION(8),
    BLOCK_SEARCH(9),
    FAMILY_BLOCK_SEARCH(10),
    BACKFILL(11),
    SPONSOR_P2P_APPROVAL(12),
    LEAVE_MONEY_POOL(13),
    SPONSORSHIP_ACTIVATION(14);

    public static final BlockingContext$Companion$ADAPTER$1 ADAPTER;
    public static final Error.Code.Companion Companion;
    public final int value;

    static {
        BlockingContext blockingContext = UNSPECIFIED;
        Companion = new Error.Code.Companion(18);
        ADAPTER = new BlockingContext$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(BlockingContext.class), Syntax.PROTO_2, blockingContext);
    }

    BlockingContext(int i) {
        this.value = i;
    }

    public static final BlockingContext fromValue(int i) {
        Companion.getClass();
        return Error.Code.Companion.m3839fromValue(i);
    }

    @Override // com.squareup.wire.WireEnum
    public final int getValue() {
        return this.value;
    }
}
