package com.squareup.protos.franklin.app;

import com.squareup.protos.franklin.app.SyncContactsResponse;
import com.squareup.wire.EnumAdapter;
import com.squareup.wire.WireEnum;

/* loaded from: classes.dex */
public final class SyncContactsResponse$Status$Companion$ADAPTER$1 extends EnumAdapter {
    @Override // com.squareup.wire.EnumAdapter
    public final WireEnum fromValue(int i) {
        SyncContactsResponse.Status.Companion.getClass();
        if (i == 0) {
            return SyncContactsResponse.Status.INVALID;
        }
        if (i == 1) {
            return SyncContactsResponse.Status.SUCCESS;
        }
        if (i != 3) {
            return null;
        }
        return SyncContactsResponse.Status.TOO_MANY_ATTEMPTS;
    }
}
