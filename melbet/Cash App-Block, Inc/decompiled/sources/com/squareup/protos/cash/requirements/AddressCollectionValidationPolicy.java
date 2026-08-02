package com.squareup.protos.cash.requirements;

import com.squareup.protos.cash.ui.ActionType;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireEnum;
import kotlin.jvm.internal.Reflection;

/* loaded from: classes7.dex */
public enum AddressCollectionValidationPolicy implements WireEnum {
    VALIDATION_POLICY_UNSPECIFIED(0),
    VALIDATION_POLICY_REQUIRED(1);

    public static final AddressCollectionValidationPolicy$Companion$ADAPTER$1 ADAPTER;
    public static final ActionType.Companion Companion;
    public final int value;

    static {
        AddressCollectionValidationPolicy addressCollectionValidationPolicy = VALIDATION_POLICY_UNSPECIFIED;
        Companion = new ActionType.Companion();
        ADAPTER = new AddressCollectionValidationPolicy$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(AddressCollectionValidationPolicy.class), Syntax.PROTO_2, addressCollectionValidationPolicy);
    }

    AddressCollectionValidationPolicy(int i) {
        this.value = i;
    }

    public static final AddressCollectionValidationPolicy fromValue(int i) {
        Companion.getClass();
        if (i == 0) {
            return VALIDATION_POLICY_UNSPECIFIED;
        }
        if (i != 1) {
            return null;
        }
        return VALIDATION_POLICY_REQUIRED;
    }

    @Override // com.squareup.wire.WireEnum
    public final int getValue() {
        return this.value;
    }
}
