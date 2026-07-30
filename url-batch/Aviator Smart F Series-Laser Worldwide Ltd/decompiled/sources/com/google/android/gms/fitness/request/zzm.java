package com.google.android.gms.fitness.request;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.fitness.data.DataSource;
import com.google.android.gms.fitness.data.DataType;
import java.util.ArrayList;

/* loaded from: classes3.dex */
public final class zzm implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int validateObjectHeader = SafeParcelReader.validateObjectHeader(parcel);
        ArrayList arrayList = null;
        ArrayList arrayList2 = null;
        ArrayList arrayList3 = null;
        ArrayList arrayList4 = null;
        DataSource dataSource = null;
        IBinder iBinder = null;
        ArrayList<Long> arrayList5 = null;
        ArrayList<Long> arrayList6 = null;
        long j8 = 0;
        long j9 = 0;
        long j10 = 0;
        int i8 = 0;
        int i9 = 0;
        boolean z7 = false;
        boolean z8 = false;
        while (parcel.dataPosition() < validateObjectHeader) {
            int readHeader = SafeParcelReader.readHeader(parcel);
            switch (SafeParcelReader.getFieldId(readHeader)) {
                case 1:
                    arrayList = SafeParcelReader.createTypedList(parcel, readHeader, DataType.CREATOR);
                    break;
                case 2:
                    arrayList2 = SafeParcelReader.createTypedList(parcel, readHeader, DataSource.CREATOR);
                    break;
                case 3:
                    j8 = SafeParcelReader.readLong(parcel, readHeader);
                    break;
                case 4:
                    j9 = SafeParcelReader.readLong(parcel, readHeader);
                    break;
                case 5:
                    arrayList3 = SafeParcelReader.createTypedList(parcel, readHeader, DataType.CREATOR);
                    break;
                case 6:
                    arrayList4 = SafeParcelReader.createTypedList(parcel, readHeader, DataSource.CREATOR);
                    break;
                case 7:
                    i8 = SafeParcelReader.readInt(parcel, readHeader);
                    break;
                case 8:
                    j10 = SafeParcelReader.readLong(parcel, readHeader);
                    break;
                case 9:
                    dataSource = (DataSource) SafeParcelReader.createParcelable(parcel, readHeader, DataSource.CREATOR);
                    break;
                case 10:
                    i9 = SafeParcelReader.readInt(parcel, readHeader);
                    break;
                case 11:
                case 15:
                case 16:
                case 17:
                default:
                    SafeParcelReader.skipUnknownField(parcel, readHeader);
                    break;
                case 12:
                    z7 = SafeParcelReader.readBoolean(parcel, readHeader);
                    break;
                case 13:
                    z8 = SafeParcelReader.readBoolean(parcel, readHeader);
                    break;
                case 14:
                    iBinder = SafeParcelReader.readIBinder(parcel, readHeader);
                    break;
                case 18:
                    arrayList5 = SafeParcelReader.createLongList(parcel, readHeader);
                    break;
                case 19:
                    arrayList6 = SafeParcelReader.createLongList(parcel, readHeader);
                    break;
            }
        }
        SafeParcelReader.ensureAtEnd(parcel, validateObjectHeader);
        return new DataReadRequest(arrayList, arrayList2, j8, j9, arrayList3, arrayList4, i8, j10, dataSource, i9, z7, z8, iBinder, arrayList5, arrayList6);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i8) {
        return new DataReadRequest[i8];
    }
}
