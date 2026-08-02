package com.squareup.protos.cash.pools;

import com.squareup.protos.cash.pools.TransactionType;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireEnum;
import kotlin.jvm.internal.Reflection;

/* loaded from: classes7.dex */
public enum HighlightedPoolsSelectionMode implements WireEnum {
    HIGHLIGHTED_POOLS_SELECTION_MODE_UNSPECIFIED(0),
    HIGHLIGHTED_POOLS_SELECTION_MODE_ACTIVE_ONLY(1);

    public static final HighlightedPoolsSelectionMode$Companion$ADAPTER$1 ADAPTER;
    public static final TransactionType.Companion Companion;
    public final int value;

    static {
        HighlightedPoolsSelectionMode highlightedPoolsSelectionMode = HIGHLIGHTED_POOLS_SELECTION_MODE_UNSPECIFIED;
        Companion = new TransactionType.Companion();
        ADAPTER = new HighlightedPoolsSelectionMode$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(HighlightedPoolsSelectionMode.class), Syntax.PROTO_2, highlightedPoolsSelectionMode);
    }

    HighlightedPoolsSelectionMode(int i) {
        this.value = i;
    }

    public static final HighlightedPoolsSelectionMode fromValue(int i) {
        Companion.getClass();
        if (i == 0) {
            return HIGHLIGHTED_POOLS_SELECTION_MODE_UNSPECIFIED;
        }
        if (i != 1) {
            return null;
        }
        return HIGHLIGHTED_POOLS_SELECTION_MODE_ACTIVE_ONLY;
    }

    @Override // com.squareup.wire.WireEnum
    public final int getValue() {
        return this.value;
    }
}
