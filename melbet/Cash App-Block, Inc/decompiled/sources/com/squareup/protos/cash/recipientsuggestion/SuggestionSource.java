package com.squareup.protos.cash.recipientsuggestion;

import com.squareup.protos.cash.pools.TransactionType;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireEnum;
import kotlin.jvm.internal.Reflection;

/* loaded from: classes7.dex */
public enum SuggestionSource implements WireEnum {
    UNKNOWN(0),
    RECENTLY_TRANSACTED(1);

    public static final SuggestionSource$Companion$ADAPTER$1 ADAPTER;
    public static final TransactionType.Companion Companion;
    public final int value;

    static {
        SuggestionSource suggestionSource = UNKNOWN;
        Companion = new TransactionType.Companion();
        ADAPTER = new SuggestionSource$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(SuggestionSource.class), Syntax.PROTO_2, suggestionSource);
    }

    SuggestionSource(int i) {
        this.value = i;
    }

    public static final SuggestionSource fromValue(int i) {
        Companion.getClass();
        if (i == 0) {
            return UNKNOWN;
        }
        if (i != 1) {
            return null;
        }
        return RECENTLY_TRANSACTED;
    }

    @Override // com.squareup.wire.WireEnum
    public final int getValue() {
        return this.value;
    }
}
