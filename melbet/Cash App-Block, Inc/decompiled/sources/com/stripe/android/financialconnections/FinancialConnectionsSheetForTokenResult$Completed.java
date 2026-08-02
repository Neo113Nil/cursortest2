package com.stripe.android.financialconnections;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.libraries.places.api.model.zzco;
import com.stripe.android.financialconnections.ElementsSessionContext;
import com.stripe.android.financialconnections.model.FinancialConnectionsSession;
import com.stripe.android.model.Token;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes8.dex */
public final class FinancialConnectionsSheetForTokenResult$Completed extends zzco {
    public static final Parcelable.Creator<FinancialConnectionsSheetForTokenResult$Completed> CREATOR = new ElementsSessionContext.Creator(7);
    public final FinancialConnectionsSession financialConnectionsSession;
    public final Token token;

    public FinancialConnectionsSheetForTokenResult$Completed(FinancialConnectionsSession financialConnectionsSession, Token token) {
        financialConnectionsSession.getClass();
        token.getClass();
        this.financialConnectionsSession = financialConnectionsSession;
        this.token = token;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FinancialConnectionsSheetForTokenResult$Completed)) {
            return false;
        }
        FinancialConnectionsSheetForTokenResult$Completed financialConnectionsSheetForTokenResult$Completed = (FinancialConnectionsSheetForTokenResult$Completed) obj;
        return Intrinsics.areEqual(this.financialConnectionsSession, financialConnectionsSheetForTokenResult$Completed.financialConnectionsSession) && Intrinsics.areEqual(this.token, financialConnectionsSheetForTokenResult$Completed.token);
    }

    public final int hashCode() {
        return this.token.hashCode() + (this.financialConnectionsSession.hashCode() * 31);
    }

    public final String toString() {
        return "Completed(financialConnectionsSession=" + this.financialConnectionsSession + ", token=" + this.token + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        this.financialConnectionsSession.writeToParcel(parcel, i);
        parcel.writeParcelable(this.token, i);
    }
}
