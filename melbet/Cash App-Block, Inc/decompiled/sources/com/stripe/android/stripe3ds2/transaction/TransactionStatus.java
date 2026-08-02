package com.stripe.android.stripe3ds2.transaction;

import io.noties.markwon.LinkResolverDef;
import kotlin.enums.EnumEntriesList;
import org.apache.commons.imaging.formats.tiff.constants.GpsTagConstants;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes8.dex */
public final class TransactionStatus {
    public static final /* synthetic */ EnumEntriesList $ENTRIES;
    public static final /* synthetic */ TransactionStatus[] $VALUES;
    public static final LinkResolverDef Companion;
    public final String code;

    static {
        TransactionStatus[] transactionStatusArr = {new TransactionStatus("VerificationSuccessful", 0, "Y"), new TransactionStatus("VerificationDenied", 1, "N"), new TransactionStatus("VerificationNotPerformed", 2, "U"), new TransactionStatus("VerificationAttempted", 3, GpsTagConstants.GPS_TAG_GPS_STATUS_VALUE_MEASUREMENT_IN_PROGRESS), new TransactionStatus("ChallengeAdditionalAuth", 4, "C"), new TransactionStatus("ChallengeDecoupledAuth", 5, "D"), new TransactionStatus("VerificationRejected", 6, "R"), new TransactionStatus("InformationOnly", 7, "I")};
        $VALUES = transactionStatusArr;
        $ENTRIES = new EnumEntriesList(transactionStatusArr);
        Companion = new LinkResolverDef(17);
    }

    public TransactionStatus(String str, int i, String str2) {
        this.code = str2;
    }

    public static TransactionStatus valueOf(String str) {
        return (TransactionStatus) Enum.valueOf(TransactionStatus.class, str);
    }

    public static TransactionStatus[] values() {
        return (TransactionStatus[]) $VALUES.clone();
    }
}
