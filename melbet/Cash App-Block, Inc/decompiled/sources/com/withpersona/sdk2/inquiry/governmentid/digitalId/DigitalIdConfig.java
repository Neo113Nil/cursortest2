package com.withpersona.sdk2.inquiry.governmentid.digitalId;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.navigation.NavAction$$ExternalSyntheticOutline0;
import bo.app.re$$ExternalSyntheticOutline0;
import com.withpersona.sdk2.inquiry.governmentid.RawExtraction;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes9.dex */
public final class DigitalIdConfig implements Parcelable {
    public static final Parcelable.Creator<DigitalIdConfig> CREATOR = new RawExtraction.Creator(12);
    public final ArrayList digitalIdRequests;
    public final String fieldKeyMobileDriversLicense;
    public final String merchantId;
    public final String nonce;

    public DigitalIdConfig(String str, String str2, String str3, ArrayList arrayList) {
        re$$ExternalSyntheticOutline0.m1432m(str, str2, str3);
        this.merchantId = str;
        this.nonce = str2;
        this.fieldKeyMobileDriversLicense = str3;
        this.digitalIdRequests = arrayList;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this.merchantId);
        parcel.writeString(this.nonce);
        parcel.writeString(this.fieldKeyMobileDriversLicense);
        Iterator m = NavAction$$ExternalSyntheticOutline0.m(this.digitalIdRequests, parcel);
        while (m.hasNext()) {
            ((DigitalIdRequest) m.next()).writeToParcel(parcel, i);
        }
    }
}
