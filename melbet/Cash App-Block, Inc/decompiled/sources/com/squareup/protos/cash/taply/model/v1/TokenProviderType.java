package com.squareup.protos.cash.taply.model.v1;

import com.squareup.protos.cash.tax.TaxEnvironment;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireEnum;
import kotlin.jvm.internal.Reflection;

/* loaded from: classes8.dex */
public enum TokenProviderType implements WireEnum {
    TOKEN_PROVIDER_TYPE_UNSPECIFIED(0),
    TOKEN_PROVIDER_TYPE_FIDESMO(1);

    public static final TokenProviderType$Companion$ADAPTER$1 ADAPTER;
    public static final TaxEnvironment.Companion Companion;
    public final int value;

    static {
        TokenProviderType tokenProviderType = TOKEN_PROVIDER_TYPE_UNSPECIFIED;
        Companion = new TaxEnvironment.Companion();
        ADAPTER = new TokenProviderType$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(TokenProviderType.class), Syntax.PROTO_2, tokenProviderType);
    }

    TokenProviderType(int i) {
        this.value = i;
    }

    public static final TokenProviderType fromValue(int i) {
        Companion.getClass();
        if (i == 0) {
            return TOKEN_PROVIDER_TYPE_UNSPECIFIED;
        }
        if (i != 1) {
            return null;
        }
        return TOKEN_PROVIDER_TYPE_FIDESMO;
    }

    @Override // com.squareup.wire.WireEnum
    public final int getValue() {
        return this.value;
    }
}
