package com.withpersona.sdk2.inquiry.selfie;

import android.os.Parcel;
import android.os.Parcelable;
import com.withpersona.sdk2.inquiry.selfie.PoseConfigs;

/* loaded from: classes9.dex */
public interface SelfieType extends Parcelable {

    public final class CenterOnly implements SelfieType {
        public static final CenterOnly INSTANCE = new CenterOnly();
        public static final Parcelable.Creator<CenterOnly> CREATOR = new PoseConfigs.Creator(19);

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof CenterOnly);
        }

        public final int hashCode() {
            return -1563560561;
        }

        public final String toString() {
            return "CenterOnly";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeInt(1);
        }
    }

    public final class ConfigurablePoses implements SelfieType {
        public static final ConfigurablePoses INSTANCE = new ConfigurablePoses();
        public static final Parcelable.Creator<ConfigurablePoses> CREATOR = new PoseConfigs.Creator(20);

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof ConfigurablePoses);
        }

        public final int hashCode() {
            return -1488281957;
        }

        public final String toString() {
            return "ConfigurablePoses";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeInt(1);
        }
    }

    public final class ThreePhotos implements SelfieType {
        public static final ThreePhotos INSTANCE = new ThreePhotos();
        public static final Parcelable.Creator<ThreePhotos> CREATOR = new PoseConfigs.Creator(21);

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof ThreePhotos);
        }

        public final int hashCode() {
            return 2033787281;
        }

        public final String toString() {
            return "ThreePhotos";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeInt(1);
        }
    }
}
