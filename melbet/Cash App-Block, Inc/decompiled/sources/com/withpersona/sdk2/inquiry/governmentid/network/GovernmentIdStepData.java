package com.withpersona.sdk2.inquiry.governmentid.network;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import com.withpersona.sdk2.inquiry.governmentid.RawExtraction;
import com.withpersona.sdk2.inquiry.shared.data_collection.StepData;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes9.dex */
public final class GovernmentIdStepData implements StepData {
    public static final Parcelable.Creator<GovernmentIdStepData> CREATOR = new RawExtraction.Creator(23);
    public final List ids;
    public final String stepName;

    public GovernmentIdStepData(String str, List list) {
        str.getClass();
        list.getClass();
        this.stepName = str;
        this.ids = list;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this.stepName);
        Iterator m = CameraState$Type$EnumUnboxingLocalUtility.m(this.ids, parcel);
        while (m.hasNext()) {
            parcel.writeParcelable((Parcelable) m.next(), i);
        }
    }
}
