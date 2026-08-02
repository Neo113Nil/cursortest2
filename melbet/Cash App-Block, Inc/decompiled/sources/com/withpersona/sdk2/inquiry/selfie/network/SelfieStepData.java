package com.withpersona.sdk2.inquiry.selfie.network;

import android.os.Parcel;
import android.os.Parcelable;
import com.withpersona.sdk2.inquiry.selfie.PoseConfigs;
import com.withpersona.sdk2.inquiry.selfie.Selfie;
import com.withpersona.sdk2.inquiry.shared.data_collection.StepData;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes9.dex */
public final class SelfieStepData implements StepData {
    public static final Parcelable.Creator<SelfieStepData> CREATOR = new PoseConfigs.Creator(23);
    public final Selfie centerCapture;
    public final Selfie leftCapture;
    public final Selfie rightCapture;
    public final String stepName;

    public SelfieStepData(String str, Selfie selfie, Selfie selfie2, Selfie selfie3) {
        str.getClass();
        this.stepName = str;
        this.centerCapture = selfie;
        this.leftCapture = selfie2;
        this.rightCapture = selfie3;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SelfieStepData)) {
            return false;
        }
        SelfieStepData selfieStepData = (SelfieStepData) obj;
        return Intrinsics.areEqual(this.stepName, selfieStepData.stepName) && Intrinsics.areEqual(this.centerCapture, selfieStepData.centerCapture) && Intrinsics.areEqual(this.leftCapture, selfieStepData.leftCapture) && Intrinsics.areEqual(this.rightCapture, selfieStepData.rightCapture);
    }

    public final int hashCode() {
        int hashCode = this.stepName.hashCode() * 31;
        Selfie selfie = this.centerCapture;
        int hashCode2 = (hashCode + (selfie == null ? 0 : selfie.hashCode())) * 31;
        Selfie selfie2 = this.leftCapture;
        int hashCode3 = (hashCode2 + (selfie2 == null ? 0 : selfie2.hashCode())) * 31;
        Selfie selfie3 = this.rightCapture;
        return hashCode3 + (selfie3 != null ? selfie3.hashCode() : 0);
    }

    public final String toString() {
        return "SelfieStepData(stepName=" + this.stepName + ", centerCapture=" + this.centerCapture + ", leftCapture=" + this.leftCapture + ", rightCapture=" + this.rightCapture + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this.stepName);
        parcel.writeParcelable(this.centerCapture, i);
        parcel.writeParcelable(this.leftCapture, i);
        parcel.writeParcelable(this.rightCapture, i);
    }
}
