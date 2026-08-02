package com.squareup.protos.cash.cashcustomerprofile.api.v1;

import com.squareup.cash.notifications.Op;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireEnum;
import kotlin.jvm.internal.Reflection;

/* loaded from: classes7.dex */
public enum DisclosureAction implements WireEnum {
    ACCEPT(1),
    REJECT(2),
    REVOKE(3);

    public final int value;
    public static final Op.Companion Companion = new Op.Companion();
    public static final DisclosureAction$Companion$ADAPTER$1 ADAPTER = new DisclosureAction$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(DisclosureAction.class), Syntax.PROTO_2, null);

    DisclosureAction(int i) {
        this.value = i;
    }

    public static final DisclosureAction fromValue(int i) {
        Companion.getClass();
        if (i == 1) {
            return ACCEPT;
        }
        if (i == 2) {
            return REJECT;
        }
        if (i != 3) {
            return null;
        }
        return REVOKE;
    }

    @Override // com.squareup.wire.WireEnum
    public final int getValue() {
        return this.value;
    }
}
