package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* loaded from: classes.dex */
public final class zzaj implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int validateObjectHeader = SafeParcelReader.validateObjectHeader(parcel);
        String str = null;
        String str2 = null;
        zzqb zzqbVar = null;
        String str3 = null;
        zzbh zzbhVar = null;
        zzbh zzbhVar2 = null;
        zzbh zzbhVar3 = null;
        long j4 = 0;
        long j5 = 0;
        long j6 = 0;
        boolean z4 = false;
        while (parcel.dataPosition() < validateObjectHeader) {
            int readHeader = SafeParcelReader.readHeader(parcel);
            switch (SafeParcelReader.getFieldId(readHeader)) {
                case 2:
                    str = SafeParcelReader.createString(parcel, readHeader);
                    break;
                case 3:
                    str2 = SafeParcelReader.createString(parcel, readHeader);
                    break;
                case 4:
                    zzqbVar = (zzqb) SafeParcelReader.createParcelable(parcel, readHeader, zzqb.CREATOR);
                    break;
                case 5:
                    j4 = SafeParcelReader.readLong(parcel, readHeader);
                    break;
                case 6:
                    z4 = SafeParcelReader.readBoolean(parcel, readHeader);
                    break;
                case 7:
                    str3 = SafeParcelReader.createString(parcel, readHeader);
                    break;
                case 8:
                    zzbhVar = (zzbh) SafeParcelReader.createParcelable(parcel, readHeader, zzbh.CREATOR);
                    break;
                case 9:
                    j5 = SafeParcelReader.readLong(parcel, readHeader);
                    break;
                case 10:
                    zzbhVar2 = (zzbh) SafeParcelReader.createParcelable(parcel, readHeader, zzbh.CREATOR);
                    break;
                case 11:
                    j6 = SafeParcelReader.readLong(parcel, readHeader);
                    break;
                case 12:
                    zzbhVar3 = (zzbh) SafeParcelReader.createParcelable(parcel, readHeader, zzbh.CREATOR);
                    break;
                default:
                    SafeParcelReader.skipUnknownField(parcel, readHeader);
                    break;
            }
        }
        SafeParcelReader.ensureAtEnd(parcel, validateObjectHeader);
        return new zzai(str, str2, zzqbVar, j4, z4, str3, zzbhVar, j5, zzbhVar2, j6, zzbhVar3);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i4) {
        return new zzai[i4];
    }
}
