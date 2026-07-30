package com.google.android.gms.internal.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* loaded from: classes3.dex */
public final class zzeg implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int validateObjectHeader = SafeParcelReader.validateObjectHeader(parcel);
        long j8 = 0;
        double d8 = 0.0d;
        double d9 = 0.0d;
        String str = null;
        int i8 = 0;
        short s7 = 0;
        float f8 = 0.0f;
        int i9 = 0;
        int i10 = -1;
        while (parcel.dataPosition() < validateObjectHeader) {
            int readHeader = SafeParcelReader.readHeader(parcel);
            switch (SafeParcelReader.getFieldId(readHeader)) {
                case 1:
                    str = SafeParcelReader.createString(parcel, readHeader);
                    break;
                case 2:
                    j8 = SafeParcelReader.readLong(parcel, readHeader);
                    break;
                case 3:
                    s7 = SafeParcelReader.readShort(parcel, readHeader);
                    break;
                case 4:
                    d8 = SafeParcelReader.readDouble(parcel, readHeader);
                    break;
                case 5:
                    d9 = SafeParcelReader.readDouble(parcel, readHeader);
                    break;
                case 6:
                    f8 = SafeParcelReader.readFloat(parcel, readHeader);
                    break;
                case 7:
                    i8 = SafeParcelReader.readInt(parcel, readHeader);
                    break;
                case 8:
                    i9 = SafeParcelReader.readInt(parcel, readHeader);
                    break;
                case 9:
                    i10 = SafeParcelReader.readInt(parcel, readHeader);
                    break;
                default:
                    SafeParcelReader.skipUnknownField(parcel, readHeader);
                    break;
            }
        }
        SafeParcelReader.ensureAtEnd(parcel, validateObjectHeader);
        return new zzef(str, i8, s7, d8, d9, f8, j8, i9, i10);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i8) {
        return new zzef[i8];
    }
}
