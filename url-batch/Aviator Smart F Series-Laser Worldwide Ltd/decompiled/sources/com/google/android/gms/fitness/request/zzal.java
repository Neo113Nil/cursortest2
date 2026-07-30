package com.google.android.gms.fitness.request;

import android.app.PendingIntent;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.fitness.data.DataSource;
import com.google.android.gms.fitness.data.DataType;

/* loaded from: classes3.dex */
public final class zzal implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int validateObjectHeader = SafeParcelReader.validateObjectHeader(parcel);
        DataSource dataSource = null;
        DataType dataType = null;
        IBinder iBinder = null;
        PendingIntent pendingIntent = null;
        IBinder iBinder2 = null;
        long j8 = 0;
        long j9 = 0;
        long j10 = 0;
        long j11 = 0;
        int i8 = 0;
        while (parcel.dataPosition() < validateObjectHeader) {
            int readHeader = SafeParcelReader.readHeader(parcel);
            switch (SafeParcelReader.getFieldId(readHeader)) {
                case 1:
                    dataSource = (DataSource) SafeParcelReader.createParcelable(parcel, readHeader, DataSource.CREATOR);
                    break;
                case 2:
                    dataType = (DataType) SafeParcelReader.createParcelable(parcel, readHeader, DataType.CREATOR);
                    break;
                case 3:
                    iBinder = SafeParcelReader.readIBinder(parcel, readHeader);
                    break;
                case 4:
                case 5:
                case 11:
                default:
                    SafeParcelReader.skipUnknownField(parcel, readHeader);
                    break;
                case 6:
                    j8 = SafeParcelReader.readLong(parcel, readHeader);
                    break;
                case 7:
                    j9 = SafeParcelReader.readLong(parcel, readHeader);
                    break;
                case 8:
                    pendingIntent = (PendingIntent) SafeParcelReader.createParcelable(parcel, readHeader, PendingIntent.CREATOR);
                    break;
                case 9:
                    j10 = SafeParcelReader.readLong(parcel, readHeader);
                    break;
                case 10:
                    i8 = SafeParcelReader.readInt(parcel, readHeader);
                    break;
                case 12:
                    j11 = SafeParcelReader.readLong(parcel, readHeader);
                    break;
                case 13:
                    iBinder2 = SafeParcelReader.readIBinder(parcel, readHeader);
                    break;
            }
        }
        SafeParcelReader.ensureAtEnd(parcel, validateObjectHeader);
        return new zzak(dataSource, dataType, iBinder, j8, j9, pendingIntent, j10, i8, j11, iBinder2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i8) {
        return new zzak[i8];
    }
}
