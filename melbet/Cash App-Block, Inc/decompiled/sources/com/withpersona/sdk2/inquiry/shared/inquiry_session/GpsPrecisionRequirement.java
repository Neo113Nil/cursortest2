package com.withpersona.sdk2.inquiry.shared.inquiry_session;

import android.os.Parcel;
import android.os.Parcelable;
import com.withpersona.sdk2.inquiry.selfie.PoseConfigs;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes9.dex */
public final class GpsPrecisionRequirement implements Parcelable {
    public static final /* synthetic */ GpsPrecisionRequirement[] $VALUES;
    public static final Parcelable.Creator<GpsPrecisionRequirement> CREATOR;
    public static final GpsPrecisionRequirement PRECISE;
    public static final GpsPrecisionRequirement ROUGH;

    static {
        GpsPrecisionRequirement gpsPrecisionRequirement = new GpsPrecisionRequirement("ROUGH", 0);
        ROUGH = gpsPrecisionRequirement;
        GpsPrecisionRequirement gpsPrecisionRequirement2 = new GpsPrecisionRequirement("PRECISE", 1);
        PRECISE = gpsPrecisionRequirement2;
        $VALUES = new GpsPrecisionRequirement[]{gpsPrecisionRequirement, gpsPrecisionRequirement2};
        CREATOR = new PoseConfigs.Creator(27);
    }

    public static GpsPrecisionRequirement valueOf(String str) {
        return (GpsPrecisionRequirement) Enum.valueOf(GpsPrecisionRequirement.class, str);
    }

    public static GpsPrecisionRequirement[] values() {
        return (GpsPrecisionRequirement[]) $VALUES.clone();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(name());
    }
}
