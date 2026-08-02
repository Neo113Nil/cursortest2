package com.withpersona.sdk2.inquiry.governmentid;

import android.os.Parcel;
import android.os.Parcelable;
import com.withpersona.sdk2.inquiry.governmentid.Frame;
import com.withpersona.sdk2.inquiry.governmentid.autoClassification.AutoClassificationConfig;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes9.dex */
public interface CaptureConfig extends Parcelable {

    public final class AutoClassifyConfig implements CaptureConfig {
        public static final Parcelable.Creator<AutoClassifyConfig> CREATOR = new Frame.Creator(8);
        public final AutoClassificationConfig config;

        public AutoClassifyConfig(AutoClassificationConfig autoClassificationConfig) {
            autoClassificationConfig.getClass();
            this.config = autoClassificationConfig;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof AutoClassifyConfig) && Intrinsics.areEqual(this.config, ((AutoClassifyConfig) obj).config);
        }

        public final int hashCode() {
            return this.config.hashCode();
        }

        public final String toString() {
            return "AutoClassifyConfig(config=" + this.config + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            this.config.writeToParcel(parcel, i);
        }
    }

    public final class IdCaptureConfig implements CaptureConfig {
        public static final Parcelable.Creator<IdCaptureConfig> CREATOR = new Frame.Creator(9);
        public final IdConfig id;

        public IdCaptureConfig(IdConfig idConfig) {
            idConfig.getClass();
            this.id = idConfig;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof IdCaptureConfig) && Intrinsics.areEqual(this.id, ((IdCaptureConfig) obj).id);
        }

        public final int hashCode() {
            return this.id.hashCode();
        }

        public final String toString() {
            return "IdCaptureConfig(id=" + this.id + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            this.id.writeToParcel(parcel, i);
        }
    }
}
