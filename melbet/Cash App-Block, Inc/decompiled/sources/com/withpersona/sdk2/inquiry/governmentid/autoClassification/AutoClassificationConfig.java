package com.withpersona.sdk2.inquiry.governmentid.autoClassification;

import android.os.Parcel;
import android.os.Parcelable;
import com.withpersona.sdk2.inquiry.governmentid.IdConfig;
import com.withpersona.sdk2.inquiry.governmentid.RawExtraction;

/* loaded from: classes9.dex */
public final class AutoClassificationConfig implements Parcelable {
    public static final Parcelable.Creator<AutoClassificationConfig> CREATOR = new RawExtraction.Creator(11);
    public final boolean extractTextFromImage;
    public final IdConfig.IdSideConfig idSideConfig;
    public final boolean isEnabled;

    public AutoClassificationConfig(boolean z, boolean z2, IdConfig.IdSideConfig idSideConfig) {
        idSideConfig.getClass();
        this.isEnabled = z;
        this.extractTextFromImage = z2;
        this.idSideConfig = idSideConfig;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeInt(this.isEnabled ? 1 : 0);
        parcel.writeInt(this.extractTextFromImage ? 1 : 0);
        this.idSideConfig.writeToParcel(parcel, i);
    }
}
