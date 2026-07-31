package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.huawei.hms.adapter.internal.AvailableCode;
import io.appmetrica.analytics.impl.C3139z9;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class zzs implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int validateObjectHeader = SafeParcelReader.validateObjectHeader(parcel);
        boolean z4 = false;
        int i4 = 0;
        boolean z5 = false;
        boolean z6 = false;
        int i5 = 0;
        int i6 = 0;
        long j4 = 0;
        long j5 = 0;
        long j6 = 0;
        long j7 = 0;
        long j8 = 0;
        long j9 = 0;
        long j10 = 0;
        String str = "";
        String str2 = str;
        String str3 = str2;
        String str4 = str3;
        String str5 = null;
        String str6 = null;
        String str7 = null;
        String str8 = null;
        String str9 = null;
        String str10 = null;
        String str11 = null;
        Boolean bool = null;
        ArrayList<String> arrayList = null;
        String str12 = null;
        String str13 = null;
        String str14 = null;
        int i7 = 100;
        boolean z7 = true;
        boolean z8 = true;
        long j11 = -2147483648L;
        while (parcel.dataPosition() < validateObjectHeader) {
            int readHeader = SafeParcelReader.readHeader(parcel);
            switch (SafeParcelReader.getFieldId(readHeader)) {
                case 2:
                    str5 = SafeParcelReader.createString(parcel, readHeader);
                    break;
                case 3:
                    str6 = SafeParcelReader.createString(parcel, readHeader);
                    break;
                case 4:
                    str7 = SafeParcelReader.createString(parcel, readHeader);
                    break;
                case 5:
                    str8 = SafeParcelReader.createString(parcel, readHeader);
                    break;
                case 6:
                    j4 = SafeParcelReader.readLong(parcel, readHeader);
                    break;
                case 7:
                    j5 = SafeParcelReader.readLong(parcel, readHeader);
                    break;
                case 8:
                    str9 = SafeParcelReader.createString(parcel, readHeader);
                    break;
                case 9:
                    z7 = SafeParcelReader.readBoolean(parcel, readHeader);
                    break;
                case 10:
                    z4 = SafeParcelReader.readBoolean(parcel, readHeader);
                    break;
                case 11:
                    j11 = SafeParcelReader.readLong(parcel, readHeader);
                    break;
                case 12:
                    str10 = SafeParcelReader.createString(parcel, readHeader);
                    break;
                case 13:
                case 17:
                case 20:
                case 33:
                default:
                    SafeParcelReader.skipUnknownField(parcel, readHeader);
                    break;
                case 14:
                    j6 = SafeParcelReader.readLong(parcel, readHeader);
                    break;
                case 15:
                    i4 = SafeParcelReader.readInt(parcel, readHeader);
                    break;
                case 16:
                    z8 = SafeParcelReader.readBoolean(parcel, readHeader);
                    break;
                case 18:
                    z5 = SafeParcelReader.readBoolean(parcel, readHeader);
                    break;
                case 19:
                    str11 = SafeParcelReader.createString(parcel, readHeader);
                    break;
                case 21:
                    bool = SafeParcelReader.readBooleanObject(parcel, readHeader);
                    break;
                case 22:
                    j7 = SafeParcelReader.readLong(parcel, readHeader);
                    break;
                case ConnectionResult.API_DISABLED /* 23 */:
                    arrayList = SafeParcelReader.createStringList(parcel, readHeader);
                    break;
                case 24:
                    str12 = SafeParcelReader.createString(parcel, readHeader);
                    break;
                case 25:
                    str = SafeParcelReader.createString(parcel, readHeader);
                    break;
                case 26:
                    str2 = SafeParcelReader.createString(parcel, readHeader);
                    break;
                case 27:
                    str13 = SafeParcelReader.createString(parcel, readHeader);
                    break;
                case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                    z6 = SafeParcelReader.readBoolean(parcel, readHeader);
                    break;
                case 29:
                    j8 = SafeParcelReader.readLong(parcel, readHeader);
                    break;
                case AvailableCode.USER_ALREADY_KNOWS_SERVICE_UNAVAILABLE /* 30 */:
                    i7 = SafeParcelReader.readInt(parcel, readHeader);
                    break;
                case AvailableCode.CURRENT_SHOWING_SERVICE_UNAVAILABLE /* 31 */:
                    str3 = SafeParcelReader.createString(parcel, readHeader);
                    break;
                case 32:
                    i5 = SafeParcelReader.readInt(parcel, readHeader);
                    break;
                case 34:
                    j9 = SafeParcelReader.readLong(parcel, readHeader);
                    break;
                case C3139z9.f40333J /* 35 */:
                    str14 = SafeParcelReader.createString(parcel, readHeader);
                    break;
                case 36:
                    str4 = SafeParcelReader.createString(parcel, readHeader);
                    break;
                case 37:
                    j10 = SafeParcelReader.readLong(parcel, readHeader);
                    break;
                case C3139z9.f40334K /* 38 */:
                    i6 = SafeParcelReader.readInt(parcel, readHeader);
                    break;
            }
        }
        SafeParcelReader.ensureAtEnd(parcel, validateObjectHeader);
        return new zzr(str5, str6, str7, str8, j4, j5, str9, z7, z4, j11, str10, j6, i4, z8, z5, str11, bool, j7, arrayList, str12, str, str2, str13, z6, j8, i7, str3, i5, j9, str14, str4, j10, i6);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i4) {
        return new zzr[i4];
    }
}
