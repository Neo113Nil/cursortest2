package com.withpersona.sdk2.inquiry.permissions;

import android.os.Parcel;
import android.os.Parcelable;
import com.withpersona.sdk2.inquiry.selfie.PoseConfig;

/* loaded from: classes9.dex */
public final class DeviceFeatureState implements Parcelable {
    public static final Parcelable.Creator<DeviceFeatureState> CREATOR = new PoseConfig.Creator(5);
    public final Feature feature;
    public final FeatureRequestResult result;

    public DeviceFeatureState(Feature feature, FeatureRequestResult featureRequestResult) {
        feature.getClass();
        featureRequestResult.getClass();
        this.feature = feature;
        this.result = featureRequestResult;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DeviceFeatureState)) {
            return false;
        }
        DeviceFeatureState deviceFeatureState = (DeviceFeatureState) obj;
        return this.feature == deviceFeatureState.feature && this.result == deviceFeatureState.result;
    }

    public final int hashCode() {
        return this.result.hashCode() + (this.feature.hashCode() * 31);
    }

    public final String toString() {
        return "DeviceFeatureState(feature=" + this.feature + ", result=" + this.result + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this.feature.name());
        parcel.writeString(this.result.name());
    }
}
