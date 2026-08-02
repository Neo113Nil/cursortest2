package com.stripe.android.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.android.volley.Request$Priority$EnumUnboxingLocalUtility;
import com.stripe.android.core.model.StripeModel;
import com.stripe.android.model.Token;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes8.dex */
public final class UpdateAvailableIncentives implements StripeModel {
    public static final Parcelable.Creator<UpdateAvailableIncentives> CREATOR = new Token.Creator(3);
    public final ArrayList data;

    public UpdateAvailableIncentives(ArrayList arrayList) {
        this.data = arrayList;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof UpdateAvailableIncentives) && this.data.equals(((UpdateAvailableIncentives) obj).data);
    }

    public final int hashCode() {
        return this.data.hashCode();
    }

    public final String toString() {
        return Request$Priority$EnumUnboxingLocalUtility.m("UpdateAvailableIncentives(data=", ")", this.data);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        ArrayList arrayList = this.data;
        parcel.writeInt(arrayList.size());
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((LinkConsumerIncentive) it.next()).writeToParcel(parcel, i);
        }
    }
}
