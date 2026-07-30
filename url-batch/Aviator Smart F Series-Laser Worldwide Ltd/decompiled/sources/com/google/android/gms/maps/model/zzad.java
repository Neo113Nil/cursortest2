package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* loaded from: classes3.dex */
public final class zzad implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int validateObjectHeader = SafeParcelReader.validateObjectHeader(parcel);
        StampStyle stampStyle = null;
        float f8 = 0.0f;
        int i8 = 0;
        int i9 = 0;
        boolean z7 = false;
        while (parcel.dataPosition() < validateObjectHeader) {
            int readHeader = SafeParcelReader.readHeader(parcel);
            int fieldId = SafeParcelReader.getFieldId(readHeader);
            if (fieldId == 2) {
                f8 = SafeParcelReader.readFloat(parcel, readHeader);
            } else if (fieldId == 3) {
                i8 = SafeParcelReader.readInt(parcel, readHeader);
            } else if (fieldId == 4) {
                i9 = SafeParcelReader.readInt(parcel, readHeader);
            } else if (fieldId == 5) {
                z7 = SafeParcelReader.readBoolean(parcel, readHeader);
            } else if (fieldId != 6) {
                SafeParcelReader.skipUnknownField(parcel, readHeader);
            } else {
                stampStyle = (StampStyle) SafeParcelReader.createParcelable(parcel, readHeader, StampStyle.CREATOR);
            }
        }
        SafeParcelReader.ensureAtEnd(parcel, validateObjectHeader);
        return new StrokeStyle(f8, i8, i9, z7, stampStyle);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i8) {
        return new StrokeStyle[i8];
    }
}
