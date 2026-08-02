package com.squareup.protos.wire.roster.mds;

import com.squareup.protos.wire.roster.mds.ContactMethod;
import com.squareup.wire.EnumAdapter;
import com.squareup.wire.WireEnum;

/* loaded from: classes8.dex */
public final class ContactMethod$VerificationStatus$Companion$ADAPTER$1 extends EnumAdapter {
    @Override // com.squareup.wire.EnumAdapter
    public final WireEnum fromValue(int i) {
        ContactMethod.VerificationStatus.Companion.getClass();
        if (i == 0) {
            return ContactMethod.VerificationStatus.UNKNOWN;
        }
        if (i == 1) {
            return ContactMethod.VerificationStatus.THIRD_PARTY_SUPPLIED;
        }
        if (i == 2) {
            return ContactMethod.VerificationStatus.NEVER_VERIFIED;
        }
        if (i != 3) {
            return null;
        }
        return ContactMethod.VerificationStatus.VERIFIED;
    }
}
