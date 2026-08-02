package com.squareup.protos.franklin.app;

import com.squareup.protos.franklin.app.RegisterInvitationsRequest;
import com.squareup.wire.EnumAdapter;
import com.squareup.wire.WireEnum;

/* loaded from: classes8.dex */
public final class RegisterInvitationsRequest$EnhancedAlias$Type$Companion$ADAPTER$1 extends EnumAdapter {
    @Override // com.squareup.wire.EnumAdapter
    public final WireEnum fromValue(int i) {
        RegisterInvitationsRequest.EnhancedAlias.Type.Companion.getClass();
        if (i == 1) {
            return RegisterInvitationsRequest.EnhancedAlias.Type.SMS;
        }
        if (i != 2) {
            return null;
        }
        return RegisterInvitationsRequest.EnhancedAlias.Type.EMAIL;
    }
}
