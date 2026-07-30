package com.google.android.gms.fitness.data;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* loaded from: classes3.dex */
public final class zzz implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int validateObjectHeader = SafeParcelReader.validateObjectHeader(parcel);
        long j8 = 0;
        long j9 = 0;
        long j10 = 0;
        Value[] valueArr = null;
        int i8 = 0;
        int i9 = 0;
        while (parcel.dataPosition() < validateObjectHeader) {
            int readHeader = SafeParcelReader.readHeader(parcel);
            switch (SafeParcelReader.getFieldId(readHeader)) {
                case 1:
                    j8 = SafeParcelReader.readLong(parcel, readHeader);
                    break;
                case 2:
                    j9 = SafeParcelReader.readLong(parcel, readHeader);
                    break;
                case 3:
                    valueArr = (Value[]) SafeParcelReader.createTypedArray(parcel, readHeader, Value.CREATOR);
                    break;
                case 4:
                    i8 = SafeParcelReader.readInt(parcel, readHeader);
                    break;
                case 5:
                    i9 = SafeParcelReader.readInt(parcel, readHeader);
                    break;
                case 6:
                    j10 = SafeParcelReader.readLong(parcel, readHeader);
                    break;
                default:
                    SafeParcelReader.skipUnknownField(parcel, readHeader);
                    break;
            }
        }
        SafeParcelReader.ensureAtEnd(parcel, validateObjectHeader);
        return new RawDataPoint(j8, j9, valueArr, i8, i9, j10);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i8) {
        return new RawDataPoint[i8];
    }
}
