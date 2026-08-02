package com.squareup.protos.cash.blockuserjourneys.api.v1;

import com.squareup.protos.franklin.api.UiAlias;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireEnum;
import kotlin.jvm.internal.Reflection;

/* loaded from: classes.dex */
public enum EntityType implements WireEnum {
    ENTITY_TYPE_UNSPECIFIED(0),
    ENTITY_TYPE_CASH_CUSTOMER(1),
    ENTITY_TYPE_SQ_MERCHANT(2),
    ENTITY_TYPE_SQ_ANONYMOUS_VISITOR(3),
    ENTITY_TYPE_SQ_BUYER(4),
    ENTITY_TYPE_DROPPED_EVENTS(5),
    ENTITY_TYPE_SQ_PERSON(6);

    public static final EntityType$Companion$ADAPTER$1 ADAPTER;
    public static final UiAlias.Type.Companion Companion;
    public final int value;

    static {
        EntityType entityType = ENTITY_TYPE_UNSPECIFIED;
        Companion = new UiAlias.Type.Companion();
        ADAPTER = new EntityType$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(EntityType.class), Syntax.PROTO_2, entityType);
    }

    EntityType(int i) {
        this.value = i;
    }

    public static final EntityType fromValue(int i) {
        Companion.getClass();
        switch (i) {
            case 0:
                return ENTITY_TYPE_UNSPECIFIED;
            case 1:
                return ENTITY_TYPE_CASH_CUSTOMER;
            case 2:
                return ENTITY_TYPE_SQ_MERCHANT;
            case 3:
                return ENTITY_TYPE_SQ_ANONYMOUS_VISITOR;
            case 4:
                return ENTITY_TYPE_SQ_BUYER;
            case 5:
                return ENTITY_TYPE_DROPPED_EVENTS;
            case 6:
                return ENTITY_TYPE_SQ_PERSON;
            default:
                return null;
        }
    }

    @Override // com.squareup.wire.WireEnum
    public final int getValue() {
        return this.value;
    }
}
