package com.stripe.android.payments.bankaccount.navigation;

import android.os.Parcel;
import android.os.Parcelable;
import com.stripe.android.core.model.StripeModel;
import com.stripe.android.financialconnections.model.FinancialConnectionsSession;
import com.stripe.android.model.StripeIntent;
import com.stripe.android.model.Token;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes8.dex */
public final class CollectBankAccountResponse implements StripeModel {
    public static final Parcelable.Creator<CollectBankAccountResponse> CREATOR = new Token.Creator(21);
    public final FinancialConnectionsSession financialConnectionsSession;
    public final StripeIntent intent;

    public CollectBankAccountResponse(StripeIntent stripeIntent, FinancialConnectionsSession financialConnectionsSession) {
        stripeIntent.getClass();
        financialConnectionsSession.getClass();
        this.intent = stripeIntent;
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
        if (!(obj instanceof CollectBankAccountResponse)) {
            return false;
        }
        CollectBankAccountResponse collectBankAccountResponse = (CollectBankAccountResponse) obj;
        return Intrinsics.areEqual(this.intent, collectBankAccountResponse.intent) && Intrinsics.areEqual(this.financialConnectionsSession, collectBankAccountResponse.financialConnectionsSession);
    }

    public final int hashCode() {
        return this.financialConnectionsSession.hashCode() + (this.intent.hashCode() * 31);
    }

    public final String toString() {
        return "CollectBankAccountResponse(intent=" + this.intent + ", financialConnectionsSession=" + this.financialConnectionsSession + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeParcelable(this.intent, i);
        parcel.writeParcelable(this.financialConnectionsSession, i);
    }
}
