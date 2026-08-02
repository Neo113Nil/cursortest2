package com.squareup.protos.wire.roster.mds;

import com.squareup.wire.Syntax;
import com.squareup.wire.WireEnum;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.full.KClasses$$Lambda$1;

/* loaded from: classes9.dex */
public enum AddressTypeScope$AddressType implements WireEnum {
    DO_NOT_USE(0),
    SHIPPING(1),
    RECEIPT(2),
    LEGAL(3),
    PHYSICAL(4),
    PAYMENTS(5),
    MARKETING(6),
    PAYMENTS_AUTHORIZATION(7),
    PAYMENTS_ACTIVATION(8);

    public static final AddressTypeScope$AddressType$Companion$ADAPTER$1 ADAPTER;
    public static final KClasses$$Lambda$1 Companion;
    public final int value;

    static {
        AddressTypeScope$AddressType addressTypeScope$AddressType = DO_NOT_USE;
        Companion = new KClasses$$Lambda$1(6);
        ADAPTER = new AddressTypeScope$AddressType$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(AddressTypeScope$AddressType.class), Syntax.PROTO_2, addressTypeScope$AddressType);
    }

    AddressTypeScope$AddressType(int i) {
        this.value = i;
    }

    public static final AddressTypeScope$AddressType fromValue(int i) {
        Companion.getClass();
        return KClasses$$Lambda$1.m4138fromValue(i);
    }

    @Override // com.squareup.wire.WireEnum
    public final int getValue() {
        return this.value;
    }
}
