package com.squareup.protos.cash.postcard;

import com.squareup.protos.cash.postcard.CardModule;
import com.squareup.wire.EnumAdapter;
import com.squareup.wire.WireEnum;

/* loaded from: classes7.dex */
public final class CardModule$Button$Prominence$Type$Companion$ADAPTER$1 extends EnumAdapter {
    @Override // com.squareup.wire.EnumAdapter
    public final WireEnum fromValue(int i) {
        CardModule.Button.Prominence.Type.Companion.getClass();
        if (i == 0) {
            return CardModule.Button.Prominence.Type.PROMINENCE_TYPE_UNSPECIFIED;
        }
        if (i == 1) {
            return CardModule.Button.Prominence.Type.STANDARD;
        }
        if (i == 2) {
            return CardModule.Button.Prominence.Type.PROMINENT;
        }
        if (i != 3) {
            return null;
        }
        return CardModule.Button.Prominence.Type.SUBTLE;
    }
}
