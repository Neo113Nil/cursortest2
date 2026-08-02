package com.squareup.protos.franklin.common;

import com.squareup.protos.franklin.api.UiAlias;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireEnum;
import kotlin.jvm.internal.Reflection;

/* loaded from: classes.dex */
public enum NearbyVisibility implements WireEnum {
    EVERYONE(1),
    CONTACTS_ONLY(2);

    public final int value;
    public static final UiAlias.Type.Companion Companion = new UiAlias.Type.Companion();
    public static final NearbyVisibility$Companion$ADAPTER$1 ADAPTER = new NearbyVisibility$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(NearbyVisibility.class), Syntax.PROTO_2, null);

    NearbyVisibility(int i) {
        this.value = i;
    }

    public static final NearbyVisibility fromValue(int i) {
        Companion.getClass();
        if (i == 1) {
            return EVERYONE;
        }
        if (i != 2) {
            return null;
        }
        return CONTACTS_ONLY;
    }

    @Override // com.squareup.wire.WireEnum
    public final int getValue() {
        return this.value;
    }
}
