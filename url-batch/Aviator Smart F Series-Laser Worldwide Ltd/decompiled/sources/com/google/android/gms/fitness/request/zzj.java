package com.google.android.gms.fitness.request;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.fitness.data.DataSource;
import com.google.android.gms.fitness.data.DataType;
import com.google.android.gms.fitness.data.Session;
import java.util.ArrayList;

/* loaded from: classes3.dex */
public final class zzj implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int validateObjectHeader = SafeParcelReader.validateObjectHeader(parcel);
        long j8 = 0;
        long j9 = 0;
        ArrayList arrayList = null;
        ArrayList arrayList2 = null;
        ArrayList arrayList3 = null;
        IBinder iBinder = null;
        boolean z7 = false;
        boolean z8 = false;
        boolean z9 = false;
        boolean z10 = false;
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
                    arrayList = SafeParcelReader.createTypedList(parcel, readHeader, DataSource.CREATOR);
                    break;
                case 4:
                    arrayList2 = SafeParcelReader.createTypedList(parcel, readHeader, DataType.CREATOR);
                    break;
                case 5:
                    arrayList3 = SafeParcelReader.createTypedList(parcel, readHeader, Session.CREATOR);
                    break;
                case 6:
                    z7 = SafeParcelReader.readBoolean(parcel, readHeader);
                    break;
                case 7:
                    z8 = SafeParcelReader.readBoolean(parcel, readHeader);
                    break;
                case 8:
                    iBinder = SafeParcelReader.readIBinder(parcel, readHeader);
                    break;
                case 9:
                default:
                    SafeParcelReader.skipUnknownField(parcel, readHeader);
                    break;
                case 10:
                    z9 = SafeParcelReader.readBoolean(parcel, readHeader);
                    break;
                case 11:
                    z10 = SafeParcelReader.readBoolean(parcel, readHeader);
                    break;
            }
        }
        SafeParcelReader.ensureAtEnd(parcel, validateObjectHeader);
        return new DataDeleteRequest(j8, j9, arrayList, arrayList2, arrayList3, z7, z8, z9, z10, iBinder);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i8) {
        return new DataDeleteRequest[i8];
    }
}
