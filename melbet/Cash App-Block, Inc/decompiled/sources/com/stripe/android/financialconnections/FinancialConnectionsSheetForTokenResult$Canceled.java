package com.stripe.android.financialconnections;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.libraries.places.api.model.zzco;
import com.stripe.android.financialconnections.ElementsSessionContext;

/* loaded from: classes8.dex */
public final class FinancialConnectionsSheetForTokenResult$Canceled extends zzco {
    public static final FinancialConnectionsSheetForTokenResult$Canceled INSTANCE = new FinancialConnectionsSheetForTokenResult$Canceled();
    public static final Parcelable.Creator<FinancialConnectionsSheetForTokenResult$Canceled> CREATOR = new ElementsSessionContext.Creator(6);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof FinancialConnectionsSheetForTokenResult$Canceled);
    }

    public final int hashCode() {
        return -890158026;
    }

    public final String toString() {
        return "Canceled";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeInt(1);
    }
}
