package defpackage;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class dtk implements Parcelable.Creator {
    private final /* synthetic */ int a;

    public dtk(int i) {
        this.a = i;
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int i = 0;
        String[] strArr = null;
        String str = null;
        switch (this.a) {
            case 0:
                parcel.getClass();
                return new dtl(parcel.readString());
            case 1:
                return new dnf(parcel);
            case 2:
                parcel.getClass();
                return new dtn((dtm) parcel.readParcelable(dtn.class.getClassLoader()), (jiv) jiv.c.get(parcel.readInt()));
            case 3:
                parcel.getClass();
                return new dty(parcel.readString());
            case 4:
                parcel.getClass();
                parcel.readInt();
                return dul.a;
            case 5:
                parcel.getClass();
                return new dux(parcel.readInt(), parcel.readInt() != 0);
            case 6:
                return new exn(parcel);
            case 7:
                return new fgr(parcel);
            case 8:
                return frv.a(parcel.readInt());
            case 9:
                return new frx(parcel);
            case 10:
                return new fry(parcel);
            case 11:
                return new fue(parcel.readInt() == 1, parcel.readInt() == 1, (Intent) parcel.readParcelable(getClass().getClassLoader()));
            case UrlRequest.Status.SENDING_REQUEST /* 12 */:
                return new gbp(parcel);
            case UrlRequest.Status.WAITING_FOR_RESPONSE /* 13 */:
                return new gwv();
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                int R = oy.R(parcel);
                while (parcel.dataPosition() < R) {
                    int readInt = parcel.readInt();
                    char c = (char) readInt;
                    if (c == 1) {
                        i = oy.P(parcel, readInt);
                    } else if (c != 2) {
                        oy.ae(parcel, readInt);
                    } else {
                        strArr = oy.aj(parcel, readInt);
                    }
                }
                oy.ad(parcel, R);
                return new jej(i, strArr);
            case 15:
                int R2 = oy.R(parcel);
                int i2 = 0;
                int i3 = 0;
                int i4 = 0;
                int i5 = 0;
                int i6 = 0;
                int i7 = 0;
                boolean z = false;
                String str2 = null;
                while (parcel.dataPosition() < R2) {
                    int readInt2 = parcel.readInt();
                    switch ((char) readInt2) {
                        case 1:
                            i2 = oy.P(parcel, readInt2);
                            break;
                        case 2:
                            i3 = oy.P(parcel, readInt2);
                            break;
                        case 3:
                            i4 = oy.P(parcel, readInt2);
                            break;
                        case 4:
                            i5 = oy.P(parcel, readInt2);
                            break;
                        case 5:
                            i6 = oy.P(parcel, readInt2);
                            break;
                        case 6:
                            i7 = oy.P(parcel, readInt2);
                            break;
                        case 7:
                            z = oy.af(parcel, readInt2);
                            break;
                        case '\b':
                            str2 = oy.Z(parcel, readInt2);
                            break;
                        default:
                            oy.ae(parcel, readInt2);
                            break;
                    }
                }
                oy.ad(parcel, R2);
                return new jek(i2, i3, i4, i5, i6, i7, z, str2);
            case 16:
                int R3 = oy.R(parcel);
                String str3 = null;
                String str4 = null;
                String str5 = null;
                String str6 = null;
                String str7 = null;
                jek jekVar = null;
                jek jekVar2 = null;
                while (parcel.dataPosition() < R3) {
                    int readInt3 = parcel.readInt();
                    switch ((char) readInt3) {
                        case 1:
                            str3 = oy.Z(parcel, readInt3);
                            break;
                        case 2:
                            str4 = oy.Z(parcel, readInt3);
                            break;
                        case 3:
                            str5 = oy.Z(parcel, readInt3);
                            break;
                        case 4:
                            str6 = oy.Z(parcel, readInt3);
                            break;
                        case 5:
                            str7 = oy.Z(parcel, readInt3);
                            break;
                        case 6:
                            jekVar = (jek) oy.V(parcel, readInt3, jek.CREATOR);
                            break;
                        case 7:
                            jekVar2 = (jek) oy.V(parcel, readInt3, jek.CREATOR);
                            break;
                        default:
                            oy.ae(parcel, readInt3);
                            break;
                    }
                }
                oy.ad(parcel, R3);
                return new jel(str3, str4, str5, str6, str7, jekVar, jekVar2);
            case 17:
                int R4 = oy.R(parcel);
                jeq jeqVar = null;
                String str8 = null;
                String str9 = null;
                jer[] jerVarArr = null;
                jeo[] jeoVarArr = null;
                String[] strArr2 = null;
                jej[] jejVarArr = null;
                while (parcel.dataPosition() < R4) {
                    int readInt4 = parcel.readInt();
                    switch ((char) readInt4) {
                        case 1:
                            jeqVar = (jeq) oy.V(parcel, readInt4, jeq.CREATOR);
                            break;
                        case 2:
                            str8 = oy.Z(parcel, readInt4);
                            break;
                        case 3:
                            str9 = oy.Z(parcel, readInt4);
                            break;
                        case 4:
                            jerVarArr = (jer[]) oy.ai(parcel, readInt4, jer.CREATOR);
                            break;
                        case 5:
                            jeoVarArr = (jeo[]) oy.ai(parcel, readInt4, jeo.CREATOR);
                            break;
                        case 6:
                            strArr2 = oy.aj(parcel, readInt4);
                            break;
                        case 7:
                            jejVarArr = (jej[]) oy.ai(parcel, readInt4, jej.CREATOR);
                            break;
                        default:
                            oy.ae(parcel, readInt4);
                            break;
                    }
                }
                oy.ad(parcel, R4);
                return new jem(jeqVar, str8, str9, jerVarArr, jeoVarArr, strArr2, jejVarArr);
            case 18:
                int R5 = oy.R(parcel);
                String str10 = null;
                String str11 = null;
                String str12 = null;
                String str13 = null;
                String str14 = null;
                String str15 = null;
                String str16 = null;
                String str17 = null;
                String str18 = null;
                String str19 = null;
                String str20 = null;
                String str21 = null;
                String str22 = null;
                String str23 = null;
                while (parcel.dataPosition() < R5) {
                    int readInt5 = parcel.readInt();
                    switch ((char) readInt5) {
                        case 1:
                            str10 = oy.Z(parcel, readInt5);
                            break;
                        case 2:
                            str11 = oy.Z(parcel, readInt5);
                            break;
                        case 3:
                            str12 = oy.Z(parcel, readInt5);
                            break;
                        case 4:
                            str13 = oy.Z(parcel, readInt5);
                            break;
                        case 5:
                            str14 = oy.Z(parcel, readInt5);
                            break;
                        case 6:
                            str15 = oy.Z(parcel, readInt5);
                            break;
                        case 7:
                            str16 = oy.Z(parcel, readInt5);
                            break;
                        case '\b':
                            str17 = oy.Z(parcel, readInt5);
                            break;
                        case '\t':
                            str18 = oy.Z(parcel, readInt5);
                            break;
                        case '\n':
                            str19 = oy.Z(parcel, readInt5);
                            break;
                        case 11:
                            str20 = oy.Z(parcel, readInt5);
                            break;
                        case UrlRequest.Status.SENDING_REQUEST /* 12 */:
                            str21 = oy.Z(parcel, readInt5);
                            break;
                        case UrlRequest.Status.WAITING_FOR_RESPONSE /* 13 */:
                            str22 = oy.Z(parcel, readInt5);
                            break;
                        case UrlRequest.Status.READING_RESPONSE /* 14 */:
                            str23 = oy.Z(parcel, readInt5);
                            break;
                        default:
                            oy.ae(parcel, readInt5);
                            break;
                    }
                }
                oy.ad(parcel, R5);
                return new jen(str10, str11, str12, str13, str14, str15, str16, str17, str18, str19, str20, str21, str22, str23);
            case 19:
                int R6 = oy.R(parcel);
                String str24 = null;
                String str25 = null;
                while (parcel.dataPosition() < R6) {
                    int readInt6 = parcel.readInt();
                    char c2 = (char) readInt6;
                    if (c2 == 1) {
                        i = oy.P(parcel, readInt6);
                    } else if (c2 == 2) {
                        str = oy.Z(parcel, readInt6);
                    } else if (c2 == 3) {
                        str24 = oy.Z(parcel, readInt6);
                    } else if (c2 != 4) {
                        oy.ae(parcel, readInt6);
                    } else {
                        str25 = oy.Z(parcel, readInt6);
                    }
                }
                oy.ad(parcel, R6);
                return new jeo(i, str, str24, str25);
            default:
                int R7 = oy.R(parcel);
                double d = 0.0d;
                double d2 = 0.0d;
                while (parcel.dataPosition() < R7) {
                    int readInt7 = parcel.readInt();
                    char c3 = (char) readInt7;
                    if (c3 == 1) {
                        d = oy.N(parcel, readInt7);
                    } else if (c3 != 2) {
                        oy.ae(parcel, readInt7);
                    } else {
                        d2 = oy.N(parcel, readInt7);
                    }
                }
                oy.ad(parcel, R7);
                return new jep(d, d2);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        switch (this.a) {
            case 0:
                return new dtl[i];
            case 1:
                return new dnf[i];
            case 2:
                return new dtn[i];
            case 3:
                return new dty[i];
            case 4:
                return new dul[i];
            case 5:
                return new dux[i];
            case 6:
                return new exn[i];
            case 7:
                return new fgr[i];
            case 8:
                return new frv[i];
            case 9:
                return new frx[i];
            case 10:
                return new fry[i];
            case 11:
                return new fue[i];
            case UrlRequest.Status.SENDING_REQUEST /* 12 */:
                return new gbp[i];
            case UrlRequest.Status.WAITING_FOR_RESPONSE /* 13 */:
                return new gwv[i];
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                return new jej[i];
            case 15:
                return new jek[i];
            case 16:
                return new jel[i];
            case 17:
                return new jem[i];
            case 18:
                return new jen[i];
            case 19:
                return new jeo[i];
            default:
                return new jep[i];
        }
    }
}
