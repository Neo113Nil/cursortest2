package com.stripe.android.financialconnections.model;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import com.stripe.android.core.model.StripeModel;
import com.stripe.android.core.model.serializers.EnumIgnoreUnknownSerializer;
import com.stripe.android.financialconnections.model.Cta;
import com.stripe.android.model.Token;
import com.stripe.android.model.parsers.TokenJsonParser;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerialName;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.TuplesKt;
import okhttp3.internal.Tags;
import org.json.JSONObject;

@Serializable
/* loaded from: classes8.dex */
public final class FinancialConnectionsSession implements StripeModel, Parcelable {
    public final FinancialConnectionsAccountList accountsNew;
    public final FinancialConnectionsAccountList accountsOld;
    public final String bankAccountToken;
    public final String clientSecret;
    public final String id;
    public final boolean livemode;
    public final ManualEntry manualEntry;
    public final PaymentAccount paymentAccount;
    public final String returnUrl;
    public final Status status;
    public final StatusDetails statusDetails;
    public static final Companion Companion = new Companion();
    public static final Parcelable.Creator<FinancialConnectionsSession> CREATOR = new Cta.Creator(20);

    @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"com/stripe/android/financialconnections/model/FinancialConnectionsSession$Companion", "", "Lkotlinx/serialization/KSerializer;", "Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession;", "serializer", "()Lkotlinx/serialization/KSerializer;", "financial-connections-core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public final class Companion {
        public final KSerializer serializer() {
            return FinancialConnectionsSession$$serializer.INSTANCE;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u000e\b\u0087\u0081\u0002\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u000b\nB\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010¨\u0006\u0011"}, d2 = {"com/stripe/android/financialconnections/model/FinancialConnectionsSession$Status", "", "Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession$Status;", "", "value", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Ljava/lang/String;", "getValue", "()Ljava/lang/String;", "Companion", "Serializer", "PENDING", "SUCCEEDED", "CANCELED", "FAILED", "UNKNOWN", "financial-connections-core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    @Serializable(with = Serializer.class)
    public final class Status {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ Status[] $VALUES;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        private final String value;

        @SerialName("pending")
        public static final Status PENDING = new Status("PENDING", 0, "pending");

        @SerialName("succeeded")
        public static final Status SUCCEEDED = new Status("SUCCEEDED", 1, "succeeded");

        @SerialName("canceled")
        public static final Status CANCELED = new Status("CANCELED", 2, "canceled");

        @SerialName("failed")
        public static final Status FAILED = new Status("FAILED", 3, "failed");

        @SerialName("unknown")
        public static final Status UNKNOWN = new Status("UNKNOWN", 4, "unknown");

        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession$Status$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession$Status;", "serializer", "()Lkotlinx/serialization/KSerializer;", "financial-connections-core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final class Companion {
            public final KSerializer serializer() {
                return Serializer.INSTANCE;
            }
        }

        public final class Serializer extends EnumIgnoreUnknownSerializer {
            public static final Serializer INSTANCE = new Serializer((Enum[]) Status.getEntries().toArray(new Status[0]), Status.UNKNOWN);
        }

        private static final /* synthetic */ Status[] $values() {
            return new Status[]{PENDING, SUCCEEDED, CANCELED, FAILED, UNKNOWN};
        }

        static {
            Status[] $values = $values();
            $VALUES = $values;
            $ENTRIES = Tags.enumEntries($values);
            INSTANCE = new Companion();
        }

        private Status(String str, int i, String str2) {
            this.value = str2;
        }

        public static EnumEntries getEntries() {
            return $ENTRIES;
        }

        public static Status valueOf(String str) {
            return (Status) Enum.valueOf(Status.class, str);
        }

        public static Status[] values() {
            return (Status[]) $VALUES.clone();
        }

        public final String getValue() {
            return this.value;
        }
    }

    public /* synthetic */ FinancialConnectionsSession(int i, String str, String str2, FinancialConnectionsAccountList financialConnectionsAccountList, FinancialConnectionsAccountList financialConnectionsAccountList2, boolean z, PaymentAccount paymentAccount, String str3, String str4, ManualEntry manualEntry, Status status, StatusDetails statusDetails) {
        if (19 != (i & 19)) {
            TuplesKt.throwMissingFieldException(i, 19, FinancialConnectionsSession$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.clientSecret = str;
        this.id = str2;
        if ((i & 4) == 0) {
            this.accountsOld = null;
        } else {
            this.accountsOld = financialConnectionsAccountList;
        }
        if ((i & 8) == 0) {
            this.accountsNew = null;
        } else {
            this.accountsNew = financialConnectionsAccountList2;
        }
        this.livemode = z;
        if ((i & 32) == 0) {
            this.paymentAccount = null;
        } else {
            this.paymentAccount = paymentAccount;
        }
        if ((i & 64) == 0) {
            this.returnUrl = null;
        } else {
            this.returnUrl = str3;
        }
        if ((i & 128) == 0) {
            this.bankAccountToken = null;
        } else {
            this.bankAccountToken = str4;
        }
        if ((i & 256) == 0) {
            this.manualEntry = null;
        } else {
            this.manualEntry = manualEntry;
        }
        if ((i & 512) == 0) {
            this.status = null;
        } else {
            this.status = status;
        }
        if ((i & 1024) == 0) {
            this.statusDetails = null;
        } else {
            this.statusDetails = statusDetails;
        }
    }

    public static FinancialConnectionsSession copy$default(FinancialConnectionsSession financialConnectionsSession, PaymentAccount paymentAccount) {
        String str = financialConnectionsSession.clientSecret;
        String str2 = financialConnectionsSession.id;
        FinancialConnectionsAccountList financialConnectionsAccountList = financialConnectionsSession.accountsOld;
        FinancialConnectionsAccountList financialConnectionsAccountList2 = financialConnectionsSession.accountsNew;
        boolean z = financialConnectionsSession.livemode;
        String str3 = financialConnectionsSession.returnUrl;
        String str4 = financialConnectionsSession.bankAccountToken;
        ManualEntry manualEntry = financialConnectionsSession.manualEntry;
        Status status = financialConnectionsSession.status;
        StatusDetails statusDetails = financialConnectionsSession.statusDetails;
        financialConnectionsSession.getClass();
        str.getClass();
        str2.getClass();
        return new FinancialConnectionsSession(str, str2, financialConnectionsAccountList, financialConnectionsAccountList2, z, paymentAccount, str3, str4, manualEntry, status, statusDetails);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FinancialConnectionsSession)) {
            return false;
        }
        FinancialConnectionsSession financialConnectionsSession = (FinancialConnectionsSession) obj;
        return Intrinsics.areEqual(this.clientSecret, financialConnectionsSession.clientSecret) && Intrinsics.areEqual(this.id, financialConnectionsSession.id) && Intrinsics.areEqual(this.accountsOld, financialConnectionsSession.accountsOld) && Intrinsics.areEqual(this.accountsNew, financialConnectionsSession.accountsNew) && this.livemode == financialConnectionsSession.livemode && Intrinsics.areEqual(this.paymentAccount, financialConnectionsSession.paymentAccount) && Intrinsics.areEqual(this.returnUrl, financialConnectionsSession.returnUrl) && Intrinsics.areEqual(this.bankAccountToken, financialConnectionsSession.bankAccountToken) && Intrinsics.areEqual(this.manualEntry, financialConnectionsSession.manualEntry) && this.status == financialConnectionsSession.status && Intrinsics.areEqual(this.statusDetails, financialConnectionsSession.statusDetails);
    }

    public final FinancialConnectionsAccountList getAccounts() {
        FinancialConnectionsAccountList financialConnectionsAccountList = this.accountsNew;
        if (financialConnectionsAccountList != null) {
            return financialConnectionsAccountList;
        }
        FinancialConnectionsAccountList financialConnectionsAccountList2 = this.accountsOld;
        financialConnectionsAccountList2.getClass();
        return financialConnectionsAccountList2;
    }

    public final Token getParsedToken() {
        String str = this.bankAccountToken;
        if (str != null) {
            return TokenJsonParser.parse(new JSONObject(str));
        }
        return null;
    }

    public final int hashCode() {
        int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.clientSecret.hashCode() * 31, 31, this.id);
        FinancialConnectionsAccountList financialConnectionsAccountList = this.accountsOld;
        int hashCode = (m + (financialConnectionsAccountList == null ? 0 : financialConnectionsAccountList.hashCode())) * 31;
        FinancialConnectionsAccountList financialConnectionsAccountList2 = this.accountsNew;
        int m2 = JsonLogicResult$Success$$ExternalSyntheticOutline0.m((hashCode + (financialConnectionsAccountList2 == null ? 0 : financialConnectionsAccountList2.hashCode())) * 31, 31, this.livemode);
        PaymentAccount paymentAccount = this.paymentAccount;
        int hashCode2 = (m2 + (paymentAccount == null ? 0 : paymentAccount.hashCode())) * 31;
        String str = this.returnUrl;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.bankAccountToken;
        int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        ManualEntry manualEntry = this.manualEntry;
        int hashCode5 = (hashCode4 + (manualEntry == null ? 0 : manualEntry.mode.hashCode())) * 31;
        Status status = this.status;
        int hashCode6 = (hashCode5 + (status == null ? 0 : status.hashCode())) * 31;
        StatusDetails statusDetails = this.statusDetails;
        return hashCode6 + (statusDetails != null ? statusDetails.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("FinancialConnectionsSession(clientSecret=", this.clientSecret, ", id=", this.id, ", accountsOld=");
        m.append(this.accountsOld);
        m.append(", accountsNew=");
        m.append(this.accountsNew);
        m.append(", livemode=");
        m.append(this.livemode);
        m.append(", paymentAccount=");
        m.append(this.paymentAccount);
        m.append(", returnUrl=");
        Boxes$$ExternalSyntheticOutline1.m(m, this.returnUrl, ", bankAccountToken=", this.bankAccountToken, ", manualEntry=");
        m.append(this.manualEntry);
        m.append(", status=");
        m.append(this.status);
        m.append(", statusDetails=");
        m.append(this.statusDetails);
        m.append(")");
        return m.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this.clientSecret);
        parcel.writeString(this.id);
        FinancialConnectionsAccountList financialConnectionsAccountList = this.accountsOld;
        if (financialConnectionsAccountList == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            financialConnectionsAccountList.writeToParcel(parcel, i);
        }
        FinancialConnectionsAccountList financialConnectionsAccountList2 = this.accountsNew;
        if (financialConnectionsAccountList2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            financialConnectionsAccountList2.writeToParcel(parcel, i);
        }
        parcel.writeInt(this.livemode ? 1 : 0);
        parcel.writeParcelable(this.paymentAccount, i);
        parcel.writeString(this.returnUrl);
        parcel.writeString(this.bankAccountToken);
        ManualEntry manualEntry = this.manualEntry;
        if (manualEntry == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            manualEntry.writeToParcel(parcel, i);
        }
        Status status = this.status;
        if (status == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(status.name());
        }
        StatusDetails statusDetails = this.statusDetails;
        if (statusDetails == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            statusDetails.writeToParcel(parcel, i);
        }
    }

    @Serializable
    public final class StatusDetails implements Parcelable {
        public final Cancelled cancelled;
        public static final Companion Companion = new Companion();
        public static final Parcelable.Creator<StatusDetails> CREATOR = new Cta.Creator(22);

        @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"com/stripe/android/financialconnections/model/FinancialConnectionsSession$StatusDetails$Companion", "", "Lkotlinx/serialization/KSerializer;", "Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession$StatusDetails;", "serializer", "()Lkotlinx/serialization/KSerializer;", "financial-connections-core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public final class Companion {
            public final KSerializer serializer() {
                return FinancialConnectionsSession$StatusDetails$$serializer.INSTANCE;
            }
        }

        public /* synthetic */ StatusDetails(int i, Cancelled cancelled) {
            if ((i & 1) == 0) {
                this.cancelled = null;
            } else {
                this.cancelled = cancelled;
            }
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof StatusDetails) && Intrinsics.areEqual(this.cancelled, ((StatusDetails) obj).cancelled);
        }

        public final int hashCode() {
            Cancelled cancelled = this.cancelled;
            if (cancelled == null) {
                return 0;
            }
            return cancelled.reason.hashCode();
        }

        public final String toString() {
            return "StatusDetails(cancelled=" + this.cancelled + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            Cancelled cancelled = this.cancelled;
            if (cancelled == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                cancelled.writeToParcel(parcel, i);
            }
        }

        public StatusDetails(Cancelled cancelled) {
            this.cancelled = cancelled;
        }

        @Serializable
        public final class Cancelled implements Parcelable {
            public final Reason reason;
            public static final Companion Companion = new Companion();
            public static final Parcelable.Creator<Cancelled> CREATOR = new Cta.Creator(21);

            @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"com/stripe/android/financialconnections/model/FinancialConnectionsSession$StatusDetails$Cancelled$Companion", "", "Lkotlinx/serialization/KSerializer;", "Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession$StatusDetails$Cancelled;", "serializer", "()Lkotlinx/serialization/KSerializer;", "financial-connections-core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
            public final class Companion {
                public final KSerializer serializer() {
                    return FinancialConnectionsSession$StatusDetails$Cancelled$$serializer.INSTANCE;
                }
            }

            /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
            /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
            @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\f\b\u0087\u0081\u0002\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u000b\nB\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\fj\u0002\b\rj\u0002\b\u000e¨\u0006\u000f"}, d2 = {"com/stripe/android/financialconnections/model/FinancialConnectionsSession$StatusDetails$Cancelled$Reason", "", "Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession$StatusDetails$Cancelled$Reason;", "", "value", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Ljava/lang/String;", "getValue", "()Ljava/lang/String;", "Companion", "Serializer", "CUSTOM_MANUAL_ENTRY", "OTHER", "UNKNOWN", "financial-connections-core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
            @Serializable(with = Serializer.class)
            public final class Reason {
                private static final /* synthetic */ EnumEntries $ENTRIES;
                private static final /* synthetic */ Reason[] $VALUES;

                /* renamed from: Companion, reason: from kotlin metadata */
                public static final Companion INSTANCE;
                private final String value;

                @SerialName("custom_manual_entry")
                public static final Reason CUSTOM_MANUAL_ENTRY = new Reason("CUSTOM_MANUAL_ENTRY", 0, "custom_manual_entry");

                @SerialName("other")
                public static final Reason OTHER = new Reason("OTHER", 1, "other");

                @SerialName("unknown")
                public static final Reason UNKNOWN = new Reason("UNKNOWN", 2, "unknown");

                @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession$StatusDetails$Cancelled$Reason$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession$StatusDetails$Cancelled$Reason;", "serializer", "()Lkotlinx/serialization/KSerializer;", "financial-connections-core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
                public static final class Companion {
                    public final KSerializer serializer() {
                        return Serializer.INSTANCE;
                    }
                }

                public final class Serializer extends EnumIgnoreUnknownSerializer {
                    public static final Serializer INSTANCE = new Serializer((Enum[]) Reason.getEntries().toArray(new Reason[0]), Reason.UNKNOWN);
                }

                private static final /* synthetic */ Reason[] $values() {
                    return new Reason[]{CUSTOM_MANUAL_ENTRY, OTHER, UNKNOWN};
                }

                static {
                    Reason[] $values = $values();
                    $VALUES = $values;
                    $ENTRIES = Tags.enumEntries($values);
                    INSTANCE = new Companion();
                }

                private Reason(String str, int i, String str2) {
                    this.value = str2;
                }

                public static EnumEntries getEntries() {
                    return $ENTRIES;
                }

                public static Reason valueOf(String str) {
                    return (Reason) Enum.valueOf(Reason.class, str);
                }

                public static Reason[] values() {
                    return (Reason[]) $VALUES.clone();
                }

                public final String getValue() {
                    return this.value;
                }
            }

            public /* synthetic */ Cancelled(int i, Reason reason) {
                if (1 == (i & 1)) {
                    this.reason = reason;
                } else {
                    TuplesKt.throwMissingFieldException(i, 1, FinancialConnectionsSession$StatusDetails$Cancelled$$serializer.INSTANCE.getDescriptor());
                    throw null;
                }
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Cancelled) && this.reason == ((Cancelled) obj).reason;
            }

            public final int hashCode() {
                return this.reason.hashCode();
            }

            public final String toString() {
                return "Cancelled(reason=" + this.reason + ")";
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i) {
                parcel.getClass();
                parcel.writeString(this.reason.name());
            }

            public Cancelled(Reason reason) {
                reason.getClass();
                this.reason = reason;
            }
        }
    }

    public FinancialConnectionsSession(String str, String str2, FinancialConnectionsAccountList financialConnectionsAccountList, FinancialConnectionsAccountList financialConnectionsAccountList2, boolean z, PaymentAccount paymentAccount, String str3, String str4, ManualEntry manualEntry, Status status, StatusDetails statusDetails) {
        str.getClass();
        str2.getClass();
        this.clientSecret = str;
        this.id = str2;
        this.accountsOld = financialConnectionsAccountList;
        this.accountsNew = financialConnectionsAccountList2;
        this.livemode = z;
        this.paymentAccount = paymentAccount;
        this.returnUrl = str3;
        this.bankAccountToken = str4;
        this.manualEntry = manualEntry;
        this.status = status;
        this.statusDetails = statusDetails;
    }
}
