package com.withpersona.sdk2.inquiry.internal;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.navigation.NavAction$$ExternalSyntheticOutline0;
import com.withpersona.sdk2.inquiry.nfc.MrzKey;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes9.dex */
public final class InquiryFieldsMap implements Parcelable {
    public static final Parcelable.Creator<InquiryFieldsMap> CREATOR = new MrzKey.Creator(2);
    public final Map fields;

    public InquiryFieldsMap(Map map) {
        map.getClass();
        this.fields = map;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        Iterator m = NavAction$$ExternalSyntheticOutline0.m(this.fields, parcel);
        while (m.hasNext()) {
            Map.Entry entry = (Map.Entry) m.next();
            parcel.writeString((String) entry.getKey());
            parcel.writeParcelable((Parcelable) entry.getValue(), i);
        }
    }
}
