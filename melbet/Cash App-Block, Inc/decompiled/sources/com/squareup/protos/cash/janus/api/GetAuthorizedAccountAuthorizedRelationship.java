package com.squareup.protos.cash.janus.api;

import com.squareup.protos.cash.investcrypto.resources.Origin;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireEnum;
import kotlin.jvm.internal.Reflection;

/* loaded from: classes7.dex */
public enum GetAuthorizedAccountAuthorizedRelationship implements WireEnum {
    RELATIONSHIP_UNKNOWN(0),
    RELATIONSHIP_SPONSOR(1);

    public static final GetAuthorizedAccountAuthorizedRelationship$Companion$ADAPTER$1 ADAPTER;
    public static final Origin.Companion Companion;
    public final int value;

    static {
        GetAuthorizedAccountAuthorizedRelationship getAuthorizedAccountAuthorizedRelationship = RELATIONSHIP_UNKNOWN;
        Companion = new Origin.Companion();
        ADAPTER = new GetAuthorizedAccountAuthorizedRelationship$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(GetAuthorizedAccountAuthorizedRelationship.class), Syntax.PROTO_2, getAuthorizedAccountAuthorizedRelationship);
    }

    GetAuthorizedAccountAuthorizedRelationship(int i) {
        this.value = i;
    }

    public static final GetAuthorizedAccountAuthorizedRelationship fromValue(int i) {
        Companion.getClass();
        if (i == 0) {
            return RELATIONSHIP_UNKNOWN;
        }
        if (i != 1) {
            return null;
        }
        return RELATIONSHIP_SPONSOR;
    }

    @Override // com.squareup.wire.WireEnum
    public final int getValue() {
        return this.value;
    }
}
