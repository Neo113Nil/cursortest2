package com.squareup.protos.cash.woodrow.model.v1;

import com.squareup.protos.cash.pools.TransactionType;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireEnum;
import kotlin.jvm.internal.Reflection;

/* loaded from: classes8.dex */
public enum AssetAcquisition$AcquisitionType implements WireEnum {
    TYPE_UNSPECIFIED(0),
    TRADE(1),
    DEPOSIT(2),
    TRANSFER(3);

    public static final AssetAcquisition$AcquisitionType$Companion$ADAPTER$1 ADAPTER;
    public static final TransactionType.Companion Companion;
    public final int value;

    static {
        AssetAcquisition$AcquisitionType assetAcquisition$AcquisitionType = TYPE_UNSPECIFIED;
        Companion = new TransactionType.Companion();
        ADAPTER = new AssetAcquisition$AcquisitionType$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(AssetAcquisition$AcquisitionType.class), Syntax.PROTO_3, assetAcquisition$AcquisitionType);
    }

    AssetAcquisition$AcquisitionType(int i) {
        this.value = i;
    }

    public static final AssetAcquisition$AcquisitionType fromValue(int i) {
        Companion.getClass();
        if (i == 0) {
            return TYPE_UNSPECIFIED;
        }
        if (i == 1) {
            return TRADE;
        }
        if (i == 2) {
            return DEPOSIT;
        }
        if (i != 3) {
            return null;
        }
        return TRANSFER;
    }

    @Override // com.squareup.wire.WireEnum
    public final int getValue() {
        return this.value;
    }
}
