package com.squareup.protos.wire.roster.mds;

import com.squareup.wire.EnumAdapter;
import com.squareup.wire.WireEnum;

/* loaded from: classes8.dex */
public final class StatusScope$Status$Companion$ADAPTER$1 extends EnumAdapter {
    @Override // com.squareup.wire.EnumAdapter
    public final WireEnum fromValue(int i) {
        StatusScope$Status.Companion.getClass();
        if (i == 0) {
            return StatusScope$Status.DO_NOT_USE;
        }
        if (i == 1) {
            return StatusScope$Status.ACTIVE;
        }
        if (i != 2) {
            return null;
        }
        return StatusScope$Status.DELETED;
    }
}
