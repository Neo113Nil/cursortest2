package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* loaded from: classes3.dex */
public final class zzab implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int validateObjectHeader = SafeParcelReader.validateObjectHeader(parcel);
        zzal[] zzalVarArr = null;
        long j8 = 0;
        int i8 = 1000;
        int i9 = 1;
        int i10 = 1;
        boolean z7 = false;
        while (parcel.dataPosition() < validateObjectHeader) {
            int readHeader = SafeParcelReader.readHeader(parcel);
            switch (SafeParcelReader.getFieldId(readHeader)) {
                case 1:
                    i9 = SafeParcelReader.readInt(parcel, readHeader);
                    break;
                case 2:
                    i10 = SafeParcelReader.readInt(parcel, readHeader);
                    break;
                case 3:
                    j8 = SafeParcelReader.readLong(parcel, readHeader);
                    break;
                case 4:
                    i8 = SafeParcelReader.readInt(parcel, readHeader);
                    break;
                case 5:
                    zzalVarArr = (zzal[]) SafeParcelReader.createTypedArray(parcel, readHeader, zzal.CREATOR);
                    break;
                case 6:
                    z7 = SafeParcelReader.readBoolean(parcel, readHeader);
                    break;
                default:
                    SafeParcelReader.skipUnknownField(parcel, readHeader);
                    break;
            }
        }
        SafeParcelReader.ensureAtEnd(parcel, validateObjectHeader);
        return new LocationAvailability(i8, i9, i10, j8, zzalVarArr, z7);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i8) {
        return new LocationAvailability[i8];
    }
}
