package com.squareup.protos.franklin.ui;

import com.squareup.protos.franklin.ui.CustomerData;
import com.squareup.wire.EnumAdapter;
import com.squareup.wire.WireEnum;

/* loaded from: classes8.dex */
public final class CustomerData$IDVStatus$VerificationStatus$Companion$ADAPTER$1 extends EnumAdapter {
    @Override // com.squareup.wire.EnumAdapter
    public final WireEnum fromValue(int i) {
        CustomerData.IDVStatus.VerificationStatus.Companion.getClass();
        switch (i) {
            case 1:
                return CustomerData.IDVStatus.VerificationStatus.VERIFICATION_UNKNOWN;
            case 2:
                return CustomerData.IDVStatus.VerificationStatus.NOT_VERIFIED;
            case 3:
                return CustomerData.IDVStatus.VerificationStatus.IN_REVIEW;
            case 4:
                return CustomerData.IDVStatus.VerificationStatus.VERIFIED;
            case 5:
                return CustomerData.IDVStatus.VerificationStatus.SPONSORSHIP_ACTIVE;
            case 6:
                return CustomerData.IDVStatus.VerificationStatus.SPONSORSHIP_PENDING;
            case 7:
                return CustomerData.IDVStatus.VerificationStatus.SPONSORSHIP_SUSPENDED;
            case 8:
                return CustomerData.IDVStatus.VerificationStatus.SPONSORSHIP_CANCELED;
            default:
                return null;
        }
    }
}
