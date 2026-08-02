package com.withpersona.sdk2.inquiry.governmentid.digitalId;

import android.os.Parcel;
import android.os.Parcelable;
import com.withpersona.sdk2.inquiry.governmentid.RawExtraction;
import com.withpersona.sdk2.inquiry.governmentid.network.IdClass;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes9.dex */
public final class DigitalIdRequest implements Parcelable {
    public static final Parcelable.Creator<DigitalIdRequest> CREATOR = new RawExtraction.Creator(13);
    public final LinkedHashMap elementToStoreLength;
    public final IdClass idType;
    public final String minAge;

    public DigitalIdRequest(IdClass idClass, String str, LinkedHashMap linkedHashMap) {
        idClass.getClass();
        str.getClass();
        this.idType = idClass;
        this.minAge = str;
        this.elementToStoreLength = linkedHashMap;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this.idType.name());
        parcel.writeString(this.minAge);
        LinkedHashMap linkedHashMap = this.elementToStoreLength;
        parcel.writeInt(linkedHashMap.size());
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            parcel.writeString((String) entry.getKey());
            parcel.writeInt(((Number) entry.getValue()).intValue());
        }
    }
}
