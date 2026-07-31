package com.google.android.gms.auth.api.accounttransfer;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import java.util.ArrayList;
import java.util.HashSet;

/* loaded from: classes.dex */
public final class zzp implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int validateObjectHeader = SafeParcelReader.validateObjectHeader(parcel);
        HashSet hashSet = new HashSet();
        int i4 = 0;
        ArrayList arrayList = null;
        zzs zzsVar = null;
        int i5 = 0;
        while (parcel.dataPosition() < validateObjectHeader) {
            int readHeader = SafeParcelReader.readHeader(parcel);
            int fieldId = SafeParcelReader.getFieldId(readHeader);
            if (fieldId == 1) {
                int readInt = SafeParcelReader.readInt(parcel, readHeader);
                hashSet.add(1);
                i5 = readInt;
            } else if (fieldId == 2) {
                ArrayList createTypedList = SafeParcelReader.createTypedList(parcel, readHeader, zzu.CREATOR);
                hashSet.add(2);
                arrayList = createTypedList;
            } else if (fieldId == 3) {
                int readInt2 = SafeParcelReader.readInt(parcel, readHeader);
                hashSet.add(3);
                i4 = readInt2;
            } else if (fieldId != 4) {
                SafeParcelReader.skipUnknownField(parcel, readHeader);
            } else {
                zzs zzsVar2 = (zzs) SafeParcelReader.createParcelable(parcel, readHeader, zzs.CREATOR);
                hashSet.add(4);
                zzsVar = zzsVar2;
            }
        }
        if (parcel.dataPosition() == validateObjectHeader) {
            return new zzo(hashSet, i5, arrayList, i4, zzsVar);
        }
        throw new SafeParcelReader.ParseException("Overread allowed size end=" + validateObjectHeader, parcel);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i4) {
        return new zzo[i4];
    }
}
