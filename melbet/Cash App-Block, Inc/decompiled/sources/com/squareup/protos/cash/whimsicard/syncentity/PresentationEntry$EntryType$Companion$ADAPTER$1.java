package com.squareup.protos.cash.whimsicard.syncentity;

import com.squareup.protos.cash.whimsicard.syncentity.PresentationEntry;
import com.squareup.wire.EnumAdapter;
import com.squareup.wire.WireEnum;

/* loaded from: classes8.dex */
public final class PresentationEntry$EntryType$Companion$ADAPTER$1 extends EnumAdapter {
    @Override // com.squareup.wire.EnumAdapter
    public final WireEnum fromValue(int i) {
        PresentationEntry.EntryType.Companion.getClass();
        if (i == 0) {
            return PresentationEntry.EntryType.ENTRY_TYPE_UNSPECIFIED;
        }
        if (i == 1) {
            return PresentationEntry.EntryType.ACCOUNT;
        }
        if (i == 2) {
            return PresentationEntry.EntryType.DEVICE;
        }
        if (i != 3) {
            return null;
        }
        return PresentationEntry.EntryType.ORDER;
    }
}
