package com.squareup.protos.franklin.api;

import com.squareup.protos.franklin.api.SetNotificationPreferencesResponse;
import com.squareup.wire.EnumAdapter;
import com.squareup.wire.WireEnum;

/* loaded from: classes8.dex */
public final class SetNotificationPreferencesResponse$Status$Companion$ADAPTER$1 extends EnumAdapter {
    @Override // com.squareup.wire.EnumAdapter
    public final WireEnum fromValue(int i) {
        SetNotificationPreferencesResponse.Status.Companion.getClass();
        if (i == 0) {
            return SetNotificationPreferencesResponse.Status.INVALID;
        }
        if (i == 1) {
            return SetNotificationPreferencesResponse.Status.SUCCESS;
        }
        if (i != 2) {
            return null;
        }
        return SetNotificationPreferencesResponse.Status.UNAUTHENTICATED;
    }
}
