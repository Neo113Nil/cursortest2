package com.squareup.protos.cash.papermate.states;

import com.squareup.protos.cash.janus.api.ContactAliasType;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireEnum;
import kotlin.jvm.internal.Reflection;

/* loaded from: classes7.dex */
public enum PaperMoneyDepositState implements WireEnum {
    DO_NOT_USE(0),
    INITIATED(1),
    VALIDATED(2),
    PENDING(3),
    SETTLED(4),
    EXPIRED(5),
    FAILED(6),
    DECLINED(7),
    REVERSED(8);

    public static final PaperMoneyDepositState$Companion$ADAPTER$1 ADAPTER;
    public static final ContactAliasType.Companion Companion;
    public final int value;

    static {
        PaperMoneyDepositState paperMoneyDepositState = DO_NOT_USE;
        Companion = new ContactAliasType.Companion();
        ADAPTER = new PaperMoneyDepositState$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(PaperMoneyDepositState.class), Syntax.PROTO_2, paperMoneyDepositState);
    }

    PaperMoneyDepositState(int i) {
        this.value = i;
    }

    public static final PaperMoneyDepositState fromValue(int i) {
        Companion.getClass();
        return ContactAliasType.Companion.m3896fromValue(i);
    }

    @Override // com.squareup.wire.WireEnum
    public final int getValue() {
        return this.value;
    }
}
