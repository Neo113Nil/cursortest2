package com.stripe.android.financialconnections;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.navigation.NavAction$$ExternalSyntheticOutline0;
import com.google.android.libraries.places.api.model.zzco;
import com.stripe.android.financialconnections.ElementsSessionContext;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes8.dex */
public final class FinancialConnectionsSheetForTokenResult$Failed extends zzco {
    public static final Parcelable.Creator<FinancialConnectionsSheetForTokenResult$Failed> CREATOR = new ElementsSessionContext.Creator(8);
    public final Throwable error;

    public FinancialConnectionsSheetForTokenResult$Failed(Throwable th) {
        th.getClass();
        this.error = th;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof FinancialConnectionsSheetForTokenResult$Failed) && Intrinsics.areEqual(this.error, ((FinancialConnectionsSheetForTokenResult$Failed) obj).error);
    }

    public final int hashCode() {
        return this.error.hashCode();
    }

    public final String toString() {
        return NavAction$$ExternalSyntheticOutline0.m("Failed(error=", ")", this.error);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeSerializable(this.error);
    }
}
