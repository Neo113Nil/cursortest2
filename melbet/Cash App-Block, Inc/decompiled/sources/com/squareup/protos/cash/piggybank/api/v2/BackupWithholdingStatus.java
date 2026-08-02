package com.squareup.protos.cash.piggybank.api.v2;

import com.squareup.protos.cash.investcrypto.resources.Origin;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireEnum;
import kotlin.jvm.internal.Reflection;

/* loaded from: classes7.dex */
public enum BackupWithholdingStatus implements WireEnum {
    BACKUP_WITHHOLDING_STATUS_UNSPECIFIED(0),
    BACKUP_WITHHOLDING_STATUS_UNKNOWN(1),
    BACKUP_WITHHOLDING_STATUS_NONE(2),
    BACKUP_WITHHOLDING_STATUS_SUBJECT_TO(3);

    public static final BackupWithholdingStatus$Companion$ADAPTER$1 ADAPTER;
    public static final Origin.Companion Companion;
    public final int value;

    static {
        BackupWithholdingStatus backupWithholdingStatus = BACKUP_WITHHOLDING_STATUS_UNSPECIFIED;
        Companion = new Origin.Companion();
        ADAPTER = new BackupWithholdingStatus$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(BackupWithholdingStatus.class), Syntax.PROTO_2, backupWithholdingStatus);
    }

    BackupWithholdingStatus(int i) {
        this.value = i;
    }

    public static final BackupWithholdingStatus fromValue(int i) {
        Companion.getClass();
        if (i == 0) {
            return BACKUP_WITHHOLDING_STATUS_UNSPECIFIED;
        }
        if (i == 1) {
            return BACKUP_WITHHOLDING_STATUS_UNKNOWN;
        }
        if (i == 2) {
            return BACKUP_WITHHOLDING_STATUS_NONE;
        }
        if (i != 3) {
            return null;
        }
        return BACKUP_WITHHOLDING_STATUS_SUBJECT_TO;
    }

    @Override // com.squareup.wire.WireEnum
    public final int getValue() {
        return this.value;
    }
}
