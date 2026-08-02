package com.squareup.protos.franklin.ui;

import com.squareup.protos.franklin.ui.C4BIdentityHubState;
import com.squareup.wire.EnumAdapter;
import com.squareup.wire.WireEnum;

/* loaded from: classes8.dex */
public final class C4BIdentityHubState$C4BIdentityVerificationBadgeIcon$Companion$ADAPTER$1 extends EnumAdapter {
    @Override // com.squareup.wire.EnumAdapter
    public final WireEnum fromValue(int i) {
        C4BIdentityHubState.C4BIdentityVerificationBadgeIcon.Companion.getClass();
        if (i == 0) {
            return C4BIdentityHubState.C4BIdentityVerificationBadgeIcon.UNSPECIFIED_ICON;
        }
        if (i == 1) {
            return C4BIdentityHubState.C4BIdentityVerificationBadgeIcon.LOCKED_SHIELD;
        }
        if (i != 2) {
            return null;
        }
        return C4BIdentityHubState.C4BIdentityVerificationBadgeIcon.CALL_TO_ACTION_SHIELD;
    }
}
