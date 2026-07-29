package com.google.android.gms.games.video;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* loaded from: classes.dex */
public final class zzb implements Parcelable.Creator<VideoConfiguration> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ VideoConfiguration createFromParcel(Parcel parcel) {
        int validateObjectHeader = SafeParcelReader.validateObjectHeader(parcel);
        int i = 0;
        int i2 = 0;
        boolean z = false;
        while (parcel.dataPosition() < validateObjectHeader) {
            int readHeader = SafeParcelReader.readHeader(parcel);
            int fieldId = SafeParcelReader.getFieldId(readHeader);
            if (fieldId != 7) {
                switch (fieldId) {
                    case 1:
                        i = SafeParcelReader.readInt(parcel, readHeader);
                        break;
                    case 2:
                        i2 = SafeParcelReader.readInt(parcel, readHeader);
                        break;
                    default:
                        SafeParcelReader.skipUnknownField(parcel, readHeader);
                        break;
                }
            } else {
                z = SafeParcelReader.readBoolean(parcel, readHeader);
            }
        }
        SafeParcelReader.ensureAtEnd(parcel, validateObjectHeader);
        return new VideoConfiguration(i, i2, z);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ VideoConfiguration[] newArray(int i) {
        return new VideoConfiguration[i];
    }
}
