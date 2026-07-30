package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* loaded from: classes3.dex */
public final class zzm implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int validateObjectHeader = SafeParcelReader.validateObjectHeader(parcel);
        long j8 = 0;
        float[] fArr = null;
        float f8 = 0.0f;
        float f9 = 0.0f;
        byte b8 = 0;
        float f10 = 0.0f;
        float f11 = 0.0f;
        while (parcel.dataPosition() < validateObjectHeader) {
            int readHeader = SafeParcelReader.readHeader(parcel);
            int fieldId = SafeParcelReader.getFieldId(readHeader);
            if (fieldId != 1) {
                switch (fieldId) {
                    case 4:
                        f8 = SafeParcelReader.readFloat(parcel, readHeader);
                        break;
                    case 5:
                        f9 = SafeParcelReader.readFloat(parcel, readHeader);
                        break;
                    case 6:
                        j8 = SafeParcelReader.readLong(parcel, readHeader);
                        break;
                    case 7:
                        b8 = SafeParcelReader.readByte(parcel, readHeader);
                        break;
                    case 8:
                        f10 = SafeParcelReader.readFloat(parcel, readHeader);
                        break;
                    case 9:
                        f11 = SafeParcelReader.readFloat(parcel, readHeader);
                        break;
                    default:
                        SafeParcelReader.skipUnknownField(parcel, readHeader);
                        break;
                }
            } else {
                fArr = SafeParcelReader.createFloatArray(parcel, readHeader);
            }
        }
        SafeParcelReader.ensureAtEnd(parcel, validateObjectHeader);
        return new DeviceOrientation(fArr, f8, f9, j8, b8, f10, f11);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i8) {
        return new DeviceOrientation[i8];
    }
}
