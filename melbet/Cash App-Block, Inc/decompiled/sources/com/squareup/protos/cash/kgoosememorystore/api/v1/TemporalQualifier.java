package com.squareup.protos.cash.kgoosememorystore.api.v1;

import com.squareup.protos.cash.janus.api.ContactAliasType;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireEnum;
import kotlin.jvm.internal.Reflection;

/* loaded from: classes7.dex */
public enum TemporalQualifier implements WireEnum {
    TEMPORAL_QUALIFIER_UNSPECIFIED(0),
    TEMPORAL_QUALIFIER_CURRENT(1),
    TEMPORAL_QUALIFIER_PLANNED(2),
    TEMPORAL_QUALIFIER_HISTORICAL(3),
    TEMPORAL_QUALIFIER_RECURRING(4);

    public static final TemporalQualifier$Companion$ADAPTER$1 ADAPTER;
    public static final ContactAliasType.Companion Companion;
    public final int value;

    static {
        TemporalQualifier temporalQualifier = TEMPORAL_QUALIFIER_UNSPECIFIED;
        Companion = new ContactAliasType.Companion();
        ADAPTER = new TemporalQualifier$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(TemporalQualifier.class), Syntax.PROTO_2, temporalQualifier);
    }

    TemporalQualifier(int i) {
        this.value = i;
    }

    public static final TemporalQualifier fromValue(int i) {
        Companion.getClass();
        return ContactAliasType.Companion.m3892fromValue(i);
    }

    @Override // com.squareup.wire.WireEnum
    public final int getValue() {
        return this.value;
    }
}
