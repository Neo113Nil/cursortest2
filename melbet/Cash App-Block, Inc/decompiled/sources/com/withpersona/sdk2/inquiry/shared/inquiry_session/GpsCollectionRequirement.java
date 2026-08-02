package com.withpersona.sdk2.inquiry.shared.inquiry_session;

import android.os.Parcel;
import android.os.Parcelable;
import com.withpersona.sdk2.inquiry.selfie.PoseConfigs;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes9.dex */
public final class GpsCollectionRequirement implements Parcelable {
    public static final /* synthetic */ GpsCollectionRequirement[] $VALUES;
    public static final Parcelable.Creator<GpsCollectionRequirement> CREATOR;
    public static final GpsCollectionRequirement NONE;
    public static final GpsCollectionRequirement OPTIONAL;
    public static final GpsCollectionRequirement REQUIRED;

    static {
        GpsCollectionRequirement gpsCollectionRequirement = new GpsCollectionRequirement("REQUIRED", 0);
        REQUIRED = gpsCollectionRequirement;
        GpsCollectionRequirement gpsCollectionRequirement2 = new GpsCollectionRequirement("OPTIONAL", 1);
        OPTIONAL = gpsCollectionRequirement2;
        GpsCollectionRequirement gpsCollectionRequirement3 = new GpsCollectionRequirement("NONE", 2);
        NONE = gpsCollectionRequirement3;
        $VALUES = new GpsCollectionRequirement[]{gpsCollectionRequirement, gpsCollectionRequirement2, gpsCollectionRequirement3};
        CREATOR = new PoseConfigs.Creator(26);
    }

    public static GpsCollectionRequirement valueOf(String str) {
        return (GpsCollectionRequirement) Enum.valueOf(GpsCollectionRequirement.class, str);
    }

    public static GpsCollectionRequirement[] values() {
        return (GpsCollectionRequirement[]) $VALUES.clone();
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
