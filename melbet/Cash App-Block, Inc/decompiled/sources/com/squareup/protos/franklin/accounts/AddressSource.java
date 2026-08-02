package com.squareup.protos.franklin.accounts;

import com.squareup.protos.cash.pools.PoolVisibility;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireEnum;
import kotlin.jvm.internal.Reflection;

/* loaded from: classes7.dex */
public enum AddressSource implements WireEnum {
    CUSTOMER(1),
    IDOLOGY_IDV(2),
    TLO_ADDRESS_SEARCH(3),
    GOVERNMENT_ID(4),
    IDV_ATTEMPT(5),
    CARD_ACTIVATION(6),
    ALLOY_IDV(7),
    PROOF_OF_ADDRESS_DOCUMENT(8),
    CARD_LINK(9),
    PHONE_NUMBER(10),
    BUSINESS(11),
    SPONSOR(12),
    SOCURE_IDV(13),
    DIGITAL_WALLET(14),
    ID_MATCH_IDV(15);

    public final int value;
    public static final PoolVisibility.Companion Companion = new PoolVisibility.Companion();
    public static final AddressSource$Companion$ADAPTER$1 ADAPTER = new AddressSource$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(AddressSource.class), Syntax.PROTO_2, null);

    AddressSource(int i) {
        this.value = i;
    }

    public static final AddressSource fromValue(int i) {
        Companion.getClass();
        return PoolVisibility.Companion.m3914fromValue(i);
    }

    @Override // com.squareup.wire.WireEnum
    public final int getValue() {
        return this.value;
    }
}
