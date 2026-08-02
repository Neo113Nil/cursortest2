package com.stripe.android.payments.bankaccount.navigation;

import android.os.Parcel;
import android.os.Parcelable;
import bo.app.re$$ExternalSyntheticOutline0;
import com.stripe.android.core.model.StripeModel;
import com.stripe.android.financialconnections.model.FinancialConnectionsSession;
import com.stripe.android.model.PaymentMethod;
import com.stripe.android.model.StripeIntent;
import com.stripe.android.model.Token;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes8.dex */
public final class CollectBankAccountResponseInternal implements StripeModel {
    public static final Parcelable.Creator<CollectBankAccountResponseInternal> CREATOR = new Token.Creator(22);
    public final InstantDebitsData instantDebitsData;
    public final StripeIntent intent;
    public final USBankAccountData usBankAccountData;

    public final class InstantDebitsData implements StripeModel {
        public static final Parcelable.Creator<InstantDebitsData> CREATOR = new Token.Creator(23);
        public final String bankName;
        public final boolean eligibleForIncentive;
        public final String last4;
        public final PaymentMethod paymentMethod;

        public InstantDebitsData(PaymentMethod paymentMethod, String str, String str2, boolean z) {
            paymentMethod.getClass();
            this.paymentMethod = paymentMethod;
            this.last4 = str;
            this.bankName = str2;
            this.eligibleForIncentive = z;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof InstantDebitsData)) {
                return false;
            }
            InstantDebitsData instantDebitsData = (InstantDebitsData) obj;
            return Intrinsics.areEqual(this.paymentMethod, instantDebitsData.paymentMethod) && Intrinsics.areEqual(this.last4, instantDebitsData.last4) && Intrinsics.areEqual(this.bankName, instantDebitsData.bankName) && this.eligibleForIncentive == instantDebitsData.eligibleForIncentive;
        }

        public final int hashCode() {
            int hashCode = this.paymentMethod.hashCode() * 31;
            String str = this.last4;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.bankName;
            return Boolean.hashCode(this.eligibleForIncentive) + ((hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("InstantDebitsData(paymentMethod=");
            sb.append(this.paymentMethod);
            sb.append(", last4=");
            sb.append(this.last4);
            sb.append(", bankName=");
            return re$$ExternalSyntheticOutline0.m(sb, this.bankName, ", eligibleForIncentive=", this.eligibleForIncentive, ")");
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            this.paymentMethod.writeToParcel(parcel, i);
            parcel.writeString(this.last4);
            parcel.writeString(this.bankName);
            parcel.writeInt(this.eligibleForIncentive ? 1 : 0);
        }
    }

    public final class USBankAccountData implements StripeModel {
        public static final Parcelable.Creator<USBankAccountData> CREATOR = new Token.Creator(24);
        public final FinancialConnectionsSession financialConnectionsSession;

        public USBankAccountData(FinancialConnectionsSession financialConnectionsSession) {
            financialConnectionsSession.getClass();
            this.financialConnectionsSession = financialConnectionsSession;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof USBankAccountData) && Intrinsics.areEqual(this.financialConnectionsSession, ((USBankAccountData) obj).financialConnectionsSession);
        }

        public final int hashCode() {
            return this.financialConnectionsSession.hashCode();
        }

        public final String toString() {
            return "USBankAccountData(financialConnectionsSession=" + this.financialConnectionsSession + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeParcelable(this.financialConnectionsSession, i);
        }
    }

    public CollectBankAccountResponseInternal(StripeIntent stripeIntent, USBankAccountData uSBankAccountData, InstantDebitsData instantDebitsData) {
        this.intent = stripeIntent;
        this.usBankAccountData = uSBankAccountData;
        this.instantDebitsData = instantDebitsData;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CollectBankAccountResponseInternal)) {
            return false;
        }
        CollectBankAccountResponseInternal collectBankAccountResponseInternal = (CollectBankAccountResponseInternal) obj;
        return Intrinsics.areEqual(this.intent, collectBankAccountResponseInternal.intent) && Intrinsics.areEqual(this.usBankAccountData, collectBankAccountResponseInternal.usBankAccountData) && Intrinsics.areEqual(this.instantDebitsData, collectBankAccountResponseInternal.instantDebitsData);
    }

    public final int hashCode() {
        StripeIntent stripeIntent = this.intent;
        int hashCode = (stripeIntent == null ? 0 : stripeIntent.hashCode()) * 31;
        USBankAccountData uSBankAccountData = this.usBankAccountData;
        int hashCode2 = (hashCode + (uSBankAccountData == null ? 0 : uSBankAccountData.financialConnectionsSession.hashCode())) * 31;
        InstantDebitsData instantDebitsData = this.instantDebitsData;
        return hashCode2 + (instantDebitsData != null ? instantDebitsData.hashCode() : 0);
    }

    public final String toString() {
        return "CollectBankAccountResponseInternal(intent=" + this.intent + ", usBankAccountData=" + this.usBankAccountData + ", instantDebitsData=" + this.instantDebitsData + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeParcelable(this.intent, i);
        USBankAccountData uSBankAccountData = this.usBankAccountData;
        if (uSBankAccountData == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeParcelable(uSBankAccountData.financialConnectionsSession, i);
        }
        InstantDebitsData instantDebitsData = this.instantDebitsData;
        if (instantDebitsData == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            instantDebitsData.writeToParcel(parcel, i);
        }
    }
}
