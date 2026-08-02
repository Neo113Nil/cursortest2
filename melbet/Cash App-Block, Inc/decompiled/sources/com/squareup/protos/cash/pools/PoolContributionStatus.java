package com.squareup.protos.cash.pools;

import com.squareup.protos.cash.pools.PoolVisibility;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireEnum;
import kotlin.jvm.internal.Reflection;

/* loaded from: classes7.dex */
public enum PoolContributionStatus implements WireEnum {
    POOL_CONTRIBUTION_STATUS_UNSPECIFIED(0),
    POOL_CONTRIBUTION_STATUS_PENDING(1),
    POOL_CONTRIBUTION_STATUS_FAILED(2),
    POOL_CONTRIBUTION_STATUS_COMPLETED(3);

    public static final PoolContributionStatus$Companion$ADAPTER$1 ADAPTER;
    public static final PoolVisibility.Companion Companion;
    public final int value;

    static {
        PoolContributionStatus poolContributionStatus = POOL_CONTRIBUTION_STATUS_UNSPECIFIED;
        Companion = new PoolVisibility.Companion();
        ADAPTER = new PoolContributionStatus$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(PoolContributionStatus.class), Syntax.PROTO_2, poolContributionStatus);
    }

    PoolContributionStatus(int i) {
        this.value = i;
    }

    public static final PoolContributionStatus fromValue(int i) {
        Companion.getClass();
        if (i == 0) {
            return POOL_CONTRIBUTION_STATUS_UNSPECIFIED;
        }
        if (i == 1) {
            return POOL_CONTRIBUTION_STATUS_PENDING;
        }
        if (i == 2) {
            return POOL_CONTRIBUTION_STATUS_FAILED;
        }
        if (i != 3) {
            return null;
        }
        return POOL_CONTRIBUTION_STATUS_COMPLETED;
    }

    @Override // com.squareup.wire.WireEnum
    public final int getValue() {
        return this.value;
    }
}
