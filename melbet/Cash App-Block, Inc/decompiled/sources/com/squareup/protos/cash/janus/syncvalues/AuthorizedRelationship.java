package com.squareup.protos.cash.janus.syncvalues;

import com.squareup.protos.cash.papermate.enums.FeeType;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireEnum;
import kotlin.jvm.internal.Reflection;

/* loaded from: classes7.dex */
public enum AuthorizedRelationship implements WireEnum {
    AUTHORIZED_RELATIONSHIP_UNKNOWN(0),
    SPONSOR(1);

    public static final AuthorizedRelationship$Companion$ADAPTER$1 ADAPTER;
    public static final FeeType.Companion Companion;
    public final int value;

    static {
        AuthorizedRelationship authorizedRelationship = AUTHORIZED_RELATIONSHIP_UNKNOWN;
        Companion = new FeeType.Companion();
        ADAPTER = new AuthorizedRelationship$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(AuthorizedRelationship.class), Syntax.PROTO_2, authorizedRelationship);
    }

    AuthorizedRelationship(int i) {
        this.value = i;
    }

    public static final AuthorizedRelationship fromValue(int i) {
        Companion.getClass();
        if (i == 0) {
            return AUTHORIZED_RELATIONSHIP_UNKNOWN;
        }
        if (i != 1) {
            return null;
        }
        return SPONSOR;
    }

    @Override // com.squareup.wire.WireEnum
    public final int getValue() {
        return this.value;
    }
}
