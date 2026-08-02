package com.squareup.cash.support.backend.api.disputesTracker;

import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import com.android.volley.Request$Priority$EnumUnboxingLocalUtility;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class DisputeRow {
    public final String amount;
    public final String date;
    public final String displayName;
    public final String iconUrl;
    public final String id;
    public final String status;
    public final String transactionToken;
    public final TransactionType transactionType;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public final class TransactionType {
        public static final /* synthetic */ TransactionType[] $VALUES;
        public static final TransactionType ACH_TRANSFER;
        public static final TransactionType CASH_CARD;
        public static final TransactionType P2P_PAYMENT;
        public static final TransactionType PAY_WITH_CASH;
        public static final TransactionType UNKNOWN;

        static {
            TransactionType transactionType = new TransactionType("UNKNOWN", 0);
            UNKNOWN = transactionType;
            TransactionType transactionType2 = new TransactionType("CASH_CARD", 1);
            CASH_CARD = transactionType2;
            TransactionType transactionType3 = new TransactionType("PAY_WITH_CASH", 2);
            PAY_WITH_CASH = transactionType3;
            TransactionType transactionType4 = new TransactionType("P2P_PAYMENT", 3);
            P2P_PAYMENT = transactionType4;
            TransactionType transactionType5 = new TransactionType("ACH_TRANSFER", 4);
            ACH_TRANSFER = transactionType5;
            $VALUES = new TransactionType[]{transactionType, transactionType2, transactionType3, transactionType4, transactionType5};
        }

        public static TransactionType valueOf(String str) {
            return (TransactionType) Enum.valueOf(TransactionType.class, str);
        }

        public static TransactionType[] values() {
            return (TransactionType[]) $VALUES.clone();
        }
    }

    public DisputeRow(String str, String str2, String str3, String str4, String str5, String str6, TransactionType transactionType, String str7) {
        Request$Priority$EnumUnboxingLocalUtility.m(str, str2, str3, str4);
        this.id = str;
        this.transactionToken = str2;
        this.displayName = str3;
        this.status = str4;
        this.amount = str5;
        this.date = str6;
        this.transactionType = transactionType;
        this.iconUrl = str7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DisputeRow)) {
            return false;
        }
        DisputeRow disputeRow = (DisputeRow) obj;
        return Intrinsics.areEqual(this.id, disputeRow.id) && Intrinsics.areEqual(this.transactionToken, disputeRow.transactionToken) && Intrinsics.areEqual(this.displayName, disputeRow.displayName) && Intrinsics.areEqual(this.status, disputeRow.status) && this.amount.equals(disputeRow.amount) && this.date.equals(disputeRow.date) && this.transactionType == disputeRow.transactionType && Intrinsics.areEqual(this.iconUrl, disputeRow.iconUrl);
    }

    public final int hashCode() {
        int hashCode = (this.transactionType.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.id.hashCode() * 31, 31, this.transactionToken), 31, this.displayName), 31, this.status), 31, this.amount), 31, this.date)) * 31;
        String str = this.iconUrl;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("DisputeRow(id=", this.id, ", transactionToken=", this.transactionToken, ", displayName=");
        Boxes$$ExternalSyntheticOutline1.m(m, this.displayName, ", status=", this.status, ", amount=");
        Boxes$$ExternalSyntheticOutline1.m(m, this.amount, ", date=", this.date, ", transactionType=");
        m.append(this.transactionType);
        m.append(", iconUrl=");
        m.append(this.iconUrl);
        m.append(")");
        return m.toString();
    }
}
