package com.withpersona.sdk2.inquiry.integration;

import android.os.Parcel;
import android.os.Parcelable;
import com.withpersona.sdk2.inquiry.governmentid.RawExtraction;

/* loaded from: classes9.dex */
public final class IntegrationWorkflow$PendingAction$OpenBrowser implements Parcelable {
    public static final IntegrationWorkflow$PendingAction$OpenBrowser INSTANCE = new IntegrationWorkflow$PendingAction$OpenBrowser();
    public static final Parcelable.Creator<IntegrationWorkflow$PendingAction$OpenBrowser> CREATOR = new RawExtraction.Creator(28);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof IntegrationWorkflow$PendingAction$OpenBrowser);
    }

    public final int hashCode() {
        return 2035883520;
    }

    public final String toString() {
        return "OpenBrowser";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeInt(1);
    }
}
