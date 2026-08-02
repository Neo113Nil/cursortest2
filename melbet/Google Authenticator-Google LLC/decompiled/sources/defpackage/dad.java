package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.people.cpg.cpgex.CpgExDataContents;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class dad implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int R = oy.R(parcel);
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        String str7 = null;
        String str8 = null;
        String str9 = null;
        String str10 = null;
        String str11 = null;
        String str12 = null;
        String str13 = null;
        String str14 = null;
        String str15 = null;
        String str16 = null;
        Long l = null;
        boolean z = false;
        boolean z2 = false;
        while (parcel.dataPosition() < R) {
            int readInt = parcel.readInt();
            switch ((char) readInt) {
                case 2:
                    str = oy.Z(parcel, readInt);
                    break;
                case 3:
                    str2 = oy.Z(parcel, readInt);
                    break;
                case 4:
                    str3 = oy.Z(parcel, readInt);
                    break;
                case 5:
                    str4 = oy.Z(parcel, readInt);
                    break;
                case 6:
                    str5 = oy.Z(parcel, readInt);
                    break;
                case 7:
                    str6 = oy.Z(parcel, readInt);
                    break;
                case '\b':
                    str7 = oy.Z(parcel, readInt);
                    break;
                case '\t':
                    str8 = oy.Z(parcel, readInt);
                    break;
                case '\n':
                    str9 = oy.Z(parcel, readInt);
                    break;
                case 11:
                    str10 = oy.Z(parcel, readInt);
                    break;
                case UrlRequest.Status.SENDING_REQUEST /* 12 */:
                    str11 = oy.Z(parcel, readInt);
                    break;
                case UrlRequest.Status.WAITING_FOR_RESPONSE /* 13 */:
                    str12 = oy.Z(parcel, readInt);
                    break;
                case UrlRequest.Status.READING_RESPONSE /* 14 */:
                    str13 = oy.Z(parcel, readInt);
                    break;
                case 15:
                    str14 = oy.Z(parcel, readInt);
                    break;
                case 16:
                    str15 = oy.Z(parcel, readInt);
                    break;
                case 17:
                    str16 = oy.Z(parcel, readInt);
                    break;
                case 18:
                    z = oy.af(parcel, readInt);
                    break;
                case 19:
                    z2 = oy.af(parcel, readInt);
                    break;
                case 20:
                    l = oy.Y(parcel, readInt);
                    break;
                default:
                    oy.ae(parcel, readInt);
                    break;
            }
        }
        oy.ad(parcel, R);
        return new CpgExDataContents(str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, str12, str13, str14, str15, str16, z, z2, l);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new CpgExDataContents[i];
    }
}
