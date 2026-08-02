package com.withpersona.sdk2.inquiry.governmentid.network;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import com.withpersona.sdk2.inquiry.governmentid.RawExtraction;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes9.dex */
public final class AutocaptureState implements Parcelable {
    public static final Parcelable.Creator<AutocaptureState> CREATOR = new RawExtraction.Creator(21);
    public final List previousFramesMetadata;

    public AutocaptureState(List list) {
        list.getClass();
        this.previousFramesMetadata = list;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof AutocaptureState) && Intrinsics.areEqual(this.previousFramesMetadata, ((AutocaptureState) obj).previousFramesMetadata);
    }

    public final int hashCode() {
        return this.previousFramesMetadata.hashCode();
    }

    public final String toString() {
        return CameraState$Type$EnumUnboxingLocalUtility.m("AutocaptureState(previousFramesMetadata=", ")", this.previousFramesMetadata);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        Iterator m = CameraState$Type$EnumUnboxingLocalUtility.m(this.previousFramesMetadata, parcel);
        while (m.hasNext()) {
            parcel.writeParcelable((Parcelable) m.next(), i);
        }
    }
}
