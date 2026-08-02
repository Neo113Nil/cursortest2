package com.squareup.protos.cash.cashregistrar;

import com.squareup.protos.cash.grantly.api.Action;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireEnum;
import kotlin.jvm.internal.Reflection;

/* loaded from: classes7.dex */
public enum AccountType implements WireEnum {
    CHECKING(1),
    SAVINGS(2),
    SPONSORED_CHECKING(3),
    SPONSORED_SAVINGS(4);

    public final int value;
    public static final Action.Type.Companion Companion = new Action.Type.Companion();
    public static final AccountType$Companion$ADAPTER$1 ADAPTER = new AccountType$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(AccountType.class), Syntax.PROTO_2, null);

    AccountType(int i) {
        this.value = i;
    }

    public static final AccountType fromValue(int i) {
        Companion.getClass();
        if (i == 1) {
            return CHECKING;
        }
        if (i == 2) {
            return SAVINGS;
        }
        if (i == 3) {
            return SPONSORED_CHECKING;
        }
        if (i != 4) {
            return null;
        }
        return SPONSORED_SAVINGS;
    }

    @Override // com.squareup.wire.WireEnum
    public final int getValue() {
        return this.value;
    }
}
