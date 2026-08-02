package com.squareup.protos.franklin.app;

import com.squareup.protos.franklin.app.RegisterInvitationsResponse;
import com.squareup.wire.EnumAdapter;
import com.squareup.wire.WireEnum;

/* loaded from: classes8.dex */
public final class RegisterInvitationsResponse$Status$Companion$ADAPTER$1 extends EnumAdapter {
    @Override // com.squareup.wire.EnumAdapter
    public final WireEnum fromValue(int i) {
        RegisterInvitationsResponse.Status.Companion.getClass();
        if (i == 0) {
            return RegisterInvitationsResponse.Status.INVALID;
        }
        if (i != 1) {
            return null;
        }
        return RegisterInvitationsResponse.Status.SUCCESS;
    }
}
