package com.squareup.protos.cash.cashidv.common;

import com.squareup.wire.EnumAdapter;
import com.squareup.wire.WireEnum;

/* loaded from: classes7.dex */
public final class VerifiedBlockerTemplateName$Companion$ADAPTER$1 extends EnumAdapter {
    @Override // com.squareup.wire.EnumAdapter
    public final WireEnum fromValue(int i) {
        VerifiedBlockerTemplateName.Companion.getClass();
        if (i == 0) {
            return VerifiedBlockerTemplateName.VERIFIED_BLOCKER_UNSPECIFIED;
        }
        if (i == 1) {
            return VerifiedBlockerTemplateName.VERIFIED_BLOCKER_DEFAULT;
        }
        if (i != 2) {
            return null;
        }
        return VerifiedBlockerTemplateName.VERIFIED_BLOCKER_CONTACT_ALIAS;
    }
}
