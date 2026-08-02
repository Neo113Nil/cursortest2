package com.squareup.protos.cash.blockuserjourneys.api.v1;

import com.squareup.wire.EnumAdapter;
import com.squareup.wire.WireEnum;

/* loaded from: classes.dex */
public final class EntityType$Companion$ADAPTER$1 extends EnumAdapter {
    @Override // com.squareup.wire.EnumAdapter
    public final WireEnum fromValue(int i) {
        EntityType.Companion.getClass();
        switch (i) {
            case 0:
                return EntityType.ENTITY_TYPE_UNSPECIFIED;
            case 1:
                return EntityType.ENTITY_TYPE_CASH_CUSTOMER;
            case 2:
                return EntityType.ENTITY_TYPE_SQ_MERCHANT;
            case 3:
                return EntityType.ENTITY_TYPE_SQ_ANONYMOUS_VISITOR;
            case 4:
                return EntityType.ENTITY_TYPE_SQ_BUYER;
            case 5:
                return EntityType.ENTITY_TYPE_DROPPED_EVENTS;
            case 6:
                return EntityType.ENTITY_TYPE_SQ_PERSON;
            default:
                return null;
        }
    }
}
