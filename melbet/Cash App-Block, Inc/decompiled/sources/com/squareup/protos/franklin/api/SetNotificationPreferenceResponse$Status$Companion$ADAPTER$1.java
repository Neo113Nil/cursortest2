package com.squareup.protos.franklin.api;

import com.squareup.protos.franklin.api.SetNotificationPreferenceResponse;
import com.squareup.wire.EnumAdapter;
import com.squareup.wire.WireEnum;

/* loaded from: classes8.dex */
public final class SetNotificationPreferenceResponse$Status$Companion$ADAPTER$1 extends EnumAdapter {
    @Override // com.squareup.wire.EnumAdapter
    public final WireEnum fromValue(int i) {
        SetNotificationPreferenceResponse.Status.Companion.getClass();
        if (i == 0) {
            return SetNotificationPreferenceResponse.Status.INVALID;
        }
        if (i == 1) {
            return SetNotificationPreferenceResponse.Status.SUCCESS;
        }
        if (i != 2) {
            return null;
        }
        return SetNotificationPreferenceResponse.Status.UNAUTHENTICATED;
    }
}
