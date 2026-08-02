package com.squareup.protos.cash.piggybank.api.v2;

import com.squareup.wire.EnumAdapter;
import com.squareup.wire.WireEnum;

/* loaded from: classes7.dex */
public final class BackupWithholdingStatus$Companion$ADAPTER$1 extends EnumAdapter {
    @Override // com.squareup.wire.EnumAdapter
    public final WireEnum fromValue(int i) {
        BackupWithholdingStatus.Companion.getClass();
        if (i == 0) {
            return BackupWithholdingStatus.BACKUP_WITHHOLDING_STATUS_UNSPECIFIED;
        }
        if (i == 1) {
            return BackupWithholdingStatus.BACKUP_WITHHOLDING_STATUS_UNKNOWN;
        }
        if (i == 2) {
            return BackupWithholdingStatus.BACKUP_WITHHOLDING_STATUS_NONE;
        }
        if (i != 3) {
            return null;
        }
        return BackupWithholdingStatus.BACKUP_WITHHOLDING_STATUS_SUBJECT_TO;
    }
}
