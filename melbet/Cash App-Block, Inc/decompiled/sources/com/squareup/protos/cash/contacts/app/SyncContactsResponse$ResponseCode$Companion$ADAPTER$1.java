package com.squareup.protos.cash.contacts.app;

import com.squareup.protos.cash.contacts.app.SyncContactsResponse;
import com.squareup.wire.EnumAdapter;
import com.squareup.wire.WireEnum;

/* loaded from: classes7.dex */
public final class SyncContactsResponse$ResponseCode$Companion$ADAPTER$1 extends EnumAdapter {
    @Override // com.squareup.wire.EnumAdapter
    public final WireEnum fromValue(int i) {
        SyncContactsResponse.ResponseCode.Companion.getClass();
        if (i == 1) {
            return SyncContactsResponse.ResponseCode.SUCCESS;
        }
        if (i != 2) {
            return null;
        }
        return SyncContactsResponse.ResponseCode.RESYNC_NEEDED;
    }
}
