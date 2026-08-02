package com.squareup.protos.cash.grantly.api;

import com.squareup.protos.cash.genericelements.ui.Alignment;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireEnum;
import kotlin.jvm.internal.Reflection;

/* loaded from: classes7.dex */
public enum AddressVerificationStatus implements WireEnum {
    UNVERIFIED(0),
    VERIFIED_STANDARDIZED(1),
    VERIFIED_NOT_STANDARDIZED(2);

    public static final AddressVerificationStatus$Companion$ADAPTER$1 ADAPTER;
    public static final Alignment.Companion Companion;
    public final int value;

    static {
        AddressVerificationStatus addressVerificationStatus = UNVERIFIED;
        Companion = new Alignment.Companion();
        ADAPTER = new AddressVerificationStatus$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(AddressVerificationStatus.class), Syntax.PROTO_2, addressVerificationStatus);
    }

    AddressVerificationStatus(int i) {
        this.value = i;
    }

    public static final AddressVerificationStatus fromValue(int i) {
        Companion.getClass();
        if (i == 0) {
            return UNVERIFIED;
        }
        if (i == 1) {
            return VERIFIED_STANDARDIZED;
        }
        if (i != 2) {
            return null;
        }
        return VERIFIED_NOT_STANDARDIZED;
    }

    @Override // com.squareup.wire.WireEnum
    public final int getValue() {
        return this.value;
    }
}
