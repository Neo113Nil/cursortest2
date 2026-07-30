package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.WorkSource;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* loaded from: classes3.dex */
public final class zzaf implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int validateObjectHeader = SafeParcelReader.validateObjectHeader(parcel);
        WorkSource workSource = new WorkSource();
        com.google.android.gms.internal.location.zze zzeVar = null;
        long j8 = -1;
        long j9 = Long.MAX_VALUE;
        long j10 = Long.MAX_VALUE;
        long j11 = 0;
        long j12 = 600000;
        long j13 = 3600000;
        int i8 = 102;
        int i9 = Integer.MAX_VALUE;
        float f8 = 0.0f;
        boolean z7 = false;
        int i10 = 0;
        int i11 = 0;
        boolean z8 = false;
        while (parcel.dataPosition() < validateObjectHeader) {
            int readHeader = SafeParcelReader.readHeader(parcel);
            switch (SafeParcelReader.getFieldId(readHeader)) {
                case 1:
                    i8 = SafeParcelReader.readInt(parcel, readHeader);
                    break;
                case 2:
                    j13 = SafeParcelReader.readLong(parcel, readHeader);
                    break;
                case 3:
                    j12 = SafeParcelReader.readLong(parcel, readHeader);
                    break;
                case 4:
                case 14:
                default:
                    SafeParcelReader.skipUnknownField(parcel, readHeader);
                    break;
                case 5:
                    j9 = SafeParcelReader.readLong(parcel, readHeader);
                    break;
                case 6:
                    i9 = SafeParcelReader.readInt(parcel, readHeader);
                    break;
                case 7:
                    f8 = SafeParcelReader.readFloat(parcel, readHeader);
                    break;
                case 8:
                    j11 = SafeParcelReader.readLong(parcel, readHeader);
                    break;
                case 9:
                    z7 = SafeParcelReader.readBoolean(parcel, readHeader);
                    break;
                case 10:
                    j10 = SafeParcelReader.readLong(parcel, readHeader);
                    break;
                case 11:
                    j8 = SafeParcelReader.readLong(parcel, readHeader);
                    break;
                case 12:
                    i10 = SafeParcelReader.readInt(parcel, readHeader);
                    break;
                case 13:
                    i11 = SafeParcelReader.readInt(parcel, readHeader);
                    break;
                case 15:
                    z8 = SafeParcelReader.readBoolean(parcel, readHeader);
                    break;
                case 16:
                    workSource = (WorkSource) SafeParcelReader.createParcelable(parcel, readHeader, WorkSource.CREATOR);
                    break;
                case 17:
                    zzeVar = (com.google.android.gms.internal.location.zze) SafeParcelReader.createParcelable(parcel, readHeader, com.google.android.gms.internal.location.zze.CREATOR);
                    break;
            }
        }
        SafeParcelReader.ensureAtEnd(parcel, validateObjectHeader);
        return new LocationRequest(i8, j13, j12, j11, j9, j10, i9, f8, z7, j8, i10, i11, z8, workSource, zzeVar);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i8) {
        return new LocationRequest[i8];
    }
}
