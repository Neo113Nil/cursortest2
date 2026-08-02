package com.withpersona.sdk2.inquiry.shared.inquiry_session;

import android.os.Parcel;
import android.os.Parcelable;
import com.withpersona.sdk2.inquiry.selfie.PoseConfigs;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;

/* loaded from: classes9.dex */
public final class InquirySessionConfig implements Parcelable {
    public static final Parcelable.Creator<InquirySessionConfig> CREATOR = new PoseConfigs.Creator(28);
    public static final InquirySessionConfig Default = new InquirySessionConfig(GpsCollectionRequirement.NONE, GpsPrecisionRequirement.PRECISE, false);
    public final GpsCollectionRequirement gpsCollectionRequirement;
    public final GpsPrecisionRequirement gpsPrecisionRequirement;
    public final boolean usePlayIntegrity;

    public InquirySessionConfig(GpsCollectionRequirement gpsCollectionRequirement, GpsPrecisionRequirement gpsPrecisionRequirement, boolean z) {
        gpsCollectionRequirement.getClass();
        gpsPrecisionRequirement.getClass();
        this.gpsCollectionRequirement = gpsCollectionRequirement;
        this.gpsPrecisionRequirement = gpsPrecisionRequirement;
        this.usePlayIntegrity = z;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InquirySessionConfig)) {
            return false;
        }
        InquirySessionConfig inquirySessionConfig = (InquirySessionConfig) obj;
        return this.gpsCollectionRequirement == inquirySessionConfig.gpsCollectionRequirement && this.gpsPrecisionRequirement == inquirySessionConfig.gpsPrecisionRequirement && this.usePlayIntegrity == inquirySessionConfig.usePlayIntegrity;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.usePlayIntegrity) + ((this.gpsPrecisionRequirement.hashCode() + (this.gpsCollectionRequirement.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("InquirySessionConfig(gpsCollectionRequirement=");
        sb.append(this.gpsCollectionRequirement);
        sb.append(", gpsPrecisionRequirement=");
        sb.append(this.gpsPrecisionRequirement);
        sb.append(", usePlayIntegrity=");
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(sb, this.usePlayIntegrity, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        this.gpsCollectionRequirement.writeToParcel(parcel, i);
        this.gpsPrecisionRequirement.writeToParcel(parcel, i);
        parcel.writeInt(this.usePlayIntegrity ? 1 : 0);
    }
}
