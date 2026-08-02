package com.squareup.protos.cash.local.client.app.v1.account;

import com.squareup.protos.cash.local.client.app.v1.account.LocalAccount;
import com.squareup.wire.EnumAdapter;
import com.squareup.wire.WireEnum;

/* loaded from: classes7.dex */
public final class LocalAccount$EnrollmentStatus$Companion$ADAPTER$1 extends EnumAdapter {
    @Override // com.squareup.wire.EnumAdapter
    public final WireEnum fromValue(int i) {
        LocalAccount.EnrollmentStatus.Companion.getClass();
        if (i == 0) {
            return LocalAccount.EnrollmentStatus.ENROLLMENT_STATUS_UNSPECIFIED;
        }
        if (i == 1) {
            return LocalAccount.EnrollmentStatus.ENROLLMENT_STATUS_UNENROLLED;
        }
        if (i != 2) {
            return null;
        }
        return LocalAccount.EnrollmentStatus.ENROLLMENT_STATUS_ENROLLED;
    }
}
