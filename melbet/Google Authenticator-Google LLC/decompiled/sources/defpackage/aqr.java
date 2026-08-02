package defpackage;

import android.net.Network;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.versionedparcelable.ParcelImpl;
import com.google.android.gms.auth.TokenData;
import com.google.android.gms.auth.aang.ErrorDetails;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.Scope;
import java.util.ArrayList;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aqr implements Parcelable.Creator {
    private final /* synthetic */ int a;

    public aqr(int i) {
        this.a = i;
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        boolean z = false;
        int i = 0;
        boolean z2 = false;
        cid cidVar = null;
        ArrayList arrayList = null;
        Long l = null;
        cid cidVar2 = null;
        String str = null;
        String str2 = null;
        ArrayList arrayList2 = null;
        cid cidVar3 = null;
        chv chvVar = null;
        switch (this.a) {
            case 0:
                return new ParcelImpl(parcel);
            case 1:
                return new anz(parcel);
            case 2:
                int R = oy.R(parcel);
                long j = 0;
                int i2 = 0;
                boolean z3 = false;
                String str3 = null;
                String str4 = null;
                String str5 = null;
                String str6 = null;
                Integer num = null;
                String str7 = null;
                String str8 = null;
                Long l2 = null;
                while (parcel.dataPosition() < R) {
                    int readInt = parcel.readInt();
                    switch ((char) readInt) {
                        case 1:
                            str3 = oy.Z(parcel, readInt);
                            break;
                        case 2:
                            str4 = oy.Z(parcel, readInt);
                            break;
                        case 3:
                            str5 = oy.Z(parcel, readInt);
                            break;
                        case 4:
                            str6 = oy.Z(parcel, readInt);
                            break;
                        case 5:
                            num = oy.X(parcel, readInt);
                            break;
                        case 6:
                            str7 = oy.Z(parcel, readInt);
                            break;
                        case 7:
                            str8 = oy.Z(parcel, readInt);
                            break;
                        case '\b':
                            i2 = oy.P(parcel, readInt);
                            break;
                        case '\t':
                            j = oy.S(parcel, readInt);
                            break;
                        case '\n':
                            z3 = oy.af(parcel, readInt);
                            break;
                        case 11:
                            l2 = oy.Y(parcel, readInt);
                            break;
                        default:
                            oy.ae(parcel, readInt);
                            break;
                    }
                }
                oy.ad(parcel, R);
                return new bpc(str3, str4, str5, str6, num, str7, str8, i2, j, z3, l2);
            case 3:
                int R2 = oy.R(parcel);
                int i3 = 0;
                int i4 = 0;
                String str9 = null;
                byte[][] bArr = null;
                byte[] bArr2 = null;
                byte[] bArr3 = null;
                while (parcel.dataPosition() < R2) {
                    int readInt2 = parcel.readInt();
                    switch ((char) readInt2) {
                        case 1:
                            i3 = oy.P(parcel, readInt2);
                            break;
                        case 2:
                            i4 = oy.P(parcel, readInt2);
                            break;
                        case 3:
                            str9 = oy.Z(parcel, readInt2);
                            break;
                        case 4:
                            bArr = oy.ak(parcel, readInt2);
                            break;
                        case 5:
                            bArr2 = oy.ag(parcel, readInt2);
                            break;
                        case 6:
                            bArr3 = oy.ag(parcel, readInt2);
                            break;
                        default:
                            oy.ae(parcel, readInt2);
                            break;
                    }
                }
                oy.ad(parcel, R2);
                return new chd(i3, i4, str9, bArr, bArr2, bArr3);
            case 4:
                int R3 = oy.R(parcel);
                int i5 = 0;
                boolean z4 = false;
                boolean z5 = false;
                String str10 = null;
                Long l3 = null;
                ArrayList arrayList3 = null;
                String str11 = null;
                while (parcel.dataPosition() < R3) {
                    int readInt3 = parcel.readInt();
                    switch ((char) readInt3) {
                        case 1:
                            i5 = oy.P(parcel, readInt3);
                            break;
                        case 2:
                            str10 = oy.Z(parcel, readInt3);
                            break;
                        case 3:
                            l3 = oy.Y(parcel, readInt3);
                            break;
                        case 4:
                            z4 = oy.af(parcel, readInt3);
                            break;
                        case 5:
                            z5 = oy.af(parcel, readInt3);
                            break;
                        case 6:
                            arrayList3 = oy.ab(parcel, readInt3);
                            break;
                        case 7:
                            str11 = oy.Z(parcel, readInt3);
                            break;
                        default:
                            oy.ae(parcel, readInt3);
                            break;
                    }
                }
                oy.ad(parcel, R3);
                return new TokenData(i5, str10, l3, z4, z5, arrayList3, str11);
            case 5:
                int R4 = oy.R(parcel);
                boolean z6 = false;
                while (parcel.dataPosition() < R4) {
                    int readInt4 = parcel.readInt();
                    char c = (char) readInt4;
                    if (c == 1) {
                        z = oy.af(parcel, readInt4);
                    } else if (c != 2) {
                        oy.ae(parcel, readInt4);
                    } else {
                        z6 = oy.af(parcel, readInt4);
                    }
                }
                oy.ad(parcel, R4);
                return new chv(z, z6);
            case 6:
                int R5 = oy.R(parcel);
                chv chvVar2 = null;
                while (parcel.dataPosition() < R5) {
                    int readInt5 = parcel.readInt();
                    char c2 = (char) readInt5;
                    if (c2 == 1) {
                        cidVar = (cid) oy.V(parcel, readInt5, cid.CREATOR);
                    } else if (c2 != 2) {
                        oy.ae(parcel, readInt5);
                    } else {
                        chvVar2 = (chv) oy.V(parcel, readInt5, chv.CREATOR);
                    }
                }
                oy.ad(parcel, R5);
                return new chs(cidVar, chvVar2);
            case 7:
                int R6 = oy.R(parcel);
                chu chuVar = null;
                while (parcel.dataPosition() < R6) {
                    int readInt6 = parcel.readInt();
                    char c3 = (char) readInt6;
                    if (c3 == 1) {
                        chvVar = (chv) oy.V(parcel, readInt6, chv.CREATOR);
                    } else if (c3 != 2) {
                        oy.ae(parcel, readInt6);
                    } else {
                        chuVar = (chu) oy.V(parcel, readInt6, chu.CREATOR);
                    }
                }
                oy.ad(parcel, R6);
                return new cht(chvVar, chuVar);
            case 8:
                int R7 = oy.R(parcel);
                String str12 = null;
                String str13 = null;
                String str14 = null;
                String str15 = null;
                byte[] bArr4 = null;
                while (parcel.dataPosition() < R7) {
                    int readInt7 = parcel.readInt();
                    char c4 = (char) readInt7;
                    if (c4 == 1) {
                        str12 = oy.Z(parcel, readInt7);
                    } else if (c4 == 3) {
                        str13 = oy.Z(parcel, readInt7);
                    } else if (c4 == 4) {
                        str14 = oy.Z(parcel, readInt7);
                    } else if (c4 == 5) {
                        str15 = oy.Z(parcel, readInt7);
                    } else if (c4 != 6) {
                        oy.ae(parcel, readInt7);
                    } else {
                        bArr4 = oy.ag(parcel, readInt7);
                    }
                }
                oy.ad(parcel, R7);
                return new chu(str12, str13, str14, str15, bArr4);
            case 9:
                int R8 = oy.R(parcel);
                boolean z7 = false;
                while (parcel.dataPosition() < R8) {
                    int readInt8 = parcel.readInt();
                    char c5 = (char) readInt8;
                    if (c5 == 1) {
                        z2 = oy.af(parcel, readInt8);
                    } else if (c5 != 2) {
                        oy.ae(parcel, readInt8);
                    } else {
                        z7 = oy.af(parcel, readInt8);
                    }
                }
                oy.ad(parcel, R8);
                return new ErrorDetails(z2, z7);
            case 10:
                int R9 = oy.R(parcel);
                String str16 = null;
                while (parcel.dataPosition() < R9) {
                    int readInt9 = parcel.readInt();
                    char c6 = (char) readInt9;
                    if (c6 == 1) {
                        cidVar3 = (cid) oy.V(parcel, readInt9, cid.CREATOR);
                    } else if (c6 != 2) {
                        oy.ae(parcel, readInt9);
                    } else {
                        str16 = oy.Z(parcel, readInt9);
                    }
                }
                oy.ad(parcel, R9);
                return new chx(cidVar3, str16);
            case 11:
                int R10 = oy.R(parcel);
                boolean z8 = false;
                boolean z9 = false;
                String str17 = null;
                ArrayList arrayList4 = null;
                ArrayList arrayList5 = null;
                while (parcel.dataPosition() < R10) {
                    int readInt10 = parcel.readInt();
                    char c7 = (char) readInt10;
                    if (c7 == 1) {
                        str17 = oy.Z(parcel, readInt10);
                    } else if (c7 == 2) {
                        arrayList4 = oy.ab(parcel, readInt10);
                    } else if (c7 == 3) {
                        arrayList5 = oy.ab(parcel, readInt10);
                    } else if (c7 == 4) {
                        z8 = oy.af(parcel, readInt10);
                    } else if (c7 != 5) {
                        oy.ae(parcel, readInt10);
                    } else {
                        z9 = oy.af(parcel, readInt10);
                    }
                }
                oy.ad(parcel, R10);
                return new chy(str17, arrayList4, arrayList5, z8, z9);
            case UrlRequest.Status.SENDING_REQUEST /* 12 */:
                int R11 = oy.R(parcel);
                ArrayList arrayList6 = null;
                while (parcel.dataPosition() < R11) {
                    int readInt11 = parcel.readInt();
                    char c8 = (char) readInt11;
                    if (c8 == 1) {
                        arrayList2 = oy.ac(parcel, readInt11, cid.CREATOR);
                    } else if (c8 != 2) {
                        oy.ae(parcel, readInt11);
                    } else {
                        arrayList6 = oy.ac(parcel, readInt11, chs.CREATOR);
                    }
                }
                oy.ad(parcel, R11);
                return new chz(arrayList2, arrayList6);
            case UrlRequest.Status.WAITING_FOR_RESPONSE /* 13 */:
                int R12 = oy.R(parcel);
                int i6 = 0;
                boolean z10 = false;
                boolean z11 = false;
                boolean z12 = false;
                int i7 = 0;
                cid cidVar4 = null;
                String str18 = null;
                ArrayList arrayList7 = null;
                ArrayList arrayList8 = null;
                ArrayList arrayList9 = null;
                ArrayList arrayList10 = null;
                String str19 = null;
                byte[] bArr5 = null;
                String str20 = null;
                Network network = null;
                while (parcel.dataPosition() < R12) {
                    int readInt12 = parcel.readInt();
                    switch ((char) readInt12) {
                        case 1:
                            cidVar4 = (cid) oy.V(parcel, readInt12, cid.CREATOR);
                            break;
                        case 2:
                            str18 = oy.Z(parcel, readInt12);
                            break;
                        case 3:
                            arrayList7 = oy.ab(parcel, readInt12);
                            break;
                        case 4:
                            arrayList8 = oy.ab(parcel, readInt12);
                            break;
                        case 5:
                            arrayList9 = oy.ab(parcel, readInt12);
                            break;
                        case 6:
                            arrayList10 = oy.ab(parcel, readInt12);
                            break;
                        case 7:
                            i6 = oy.P(parcel, readInt12);
                            break;
                        case '\b':
                            str19 = oy.Z(parcel, readInt12);
                            break;
                        case '\t':
                            z10 = oy.af(parcel, readInt12);
                            break;
                        case '\n':
                            bArr5 = oy.ag(parcel, readInt12);
                            break;
                        case 11:
                            str20 = oy.Z(parcel, readInt12);
                            break;
                        case UrlRequest.Status.SENDING_REQUEST /* 12 */:
                            z11 = oy.af(parcel, readInt12);
                            break;
                        case UrlRequest.Status.WAITING_FOR_RESPONSE /* 13 */:
                            network = (Network) oy.V(parcel, readInt12, Network.CREATOR);
                            break;
                        case UrlRequest.Status.READING_RESPONSE /* 14 */:
                            z12 = oy.af(parcel, readInt12);
                            break;
                        case 15:
                            i7 = oy.P(parcel, readInt12);
                            break;
                        default:
                            oy.ae(parcel, readInt12);
                            break;
                    }
                }
                oy.ad(parcel, R12);
                return new cib(cidVar4, str18, arrayList7, arrayList8, arrayList9, arrayList10, i6, str19, z10, bArr5, str20, z11, network, z12, i7);
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                int R13 = oy.R(parcel);
                cif cifVar = null;
                while (parcel.dataPosition() < R13) {
                    int readInt13 = parcel.readInt();
                    char c9 = (char) readInt13;
                    if (c9 == 1) {
                        str2 = oy.Z(parcel, readInt13);
                    } else if (c9 != 2) {
                        oy.ae(parcel, readInt13);
                    } else {
                        cifVar = (cif) oy.V(parcel, readInt13, cif.CREATOR);
                    }
                }
                oy.ad(parcel, R13);
                return new cic(str2, cifVar);
            case 15:
                int R14 = oy.R(parcel);
                String str21 = null;
                String str22 = null;
                while (parcel.dataPosition() < R14) {
                    int readInt14 = parcel.readInt();
                    char c10 = (char) readInt14;
                    if (c10 == 1) {
                        str = oy.Z(parcel, readInt14);
                    } else if (c10 == 2) {
                        str21 = oy.Z(parcel, readInt14);
                    } else if (c10 != 3) {
                        oy.ae(parcel, readInt14);
                    } else {
                        str22 = oy.Z(parcel, readInt14);
                    }
                }
                oy.ad(parcel, R14);
                return new cid(str, str21, str22);
            case 16:
                int R15 = oy.R(parcel);
                ArrayList arrayList11 = null;
                while (parcel.dataPosition() < R15) {
                    int readInt15 = parcel.readInt();
                    char c11 = (char) readInt15;
                    if (c11 == 1) {
                        cidVar2 = (cid) oy.V(parcel, readInt15, cid.CREATOR);
                    } else if (c11 != 2) {
                        oy.ae(parcel, readInt15);
                    } else {
                        arrayList11 = oy.ab(parcel, readInt15);
                    }
                }
                oy.ad(parcel, R15);
                return new cie(cidVar2, arrayList11);
            case 17:
                int R16 = oy.R(parcel);
                ArrayList arrayList12 = null;
                while (parcel.dataPosition() < R16) {
                    int readInt16 = parcel.readInt();
                    char c12 = (char) readInt16;
                    if (c12 == 1) {
                        l = oy.Y(parcel, readInt16);
                    } else if (c12 != 2) {
                        oy.ae(parcel, readInt16);
                    } else {
                        arrayList12 = oy.ab(parcel, readInt16);
                    }
                }
                oy.ad(parcel, R16);
                return new cif(l, arrayList12);
            case 18:
                int R17 = oy.R(parcel);
                long j2 = 0;
                String str23 = null;
                String str24 = null;
                String str25 = null;
                String str26 = null;
                Uri uri = null;
                String str27 = null;
                String str28 = null;
                ArrayList arrayList13 = null;
                String str29 = null;
                String str30 = null;
                while (parcel.dataPosition() < R17) {
                    int readInt17 = parcel.readInt();
                    switch ((char) readInt17) {
                        case 2:
                            str23 = oy.Z(parcel, readInt17);
                            break;
                        case 3:
                            str24 = oy.Z(parcel, readInt17);
                            break;
                        case 4:
                            str25 = oy.Z(parcel, readInt17);
                            break;
                        case 5:
                            str26 = oy.Z(parcel, readInt17);
                            break;
                        case 6:
                            uri = (Uri) oy.V(parcel, readInt17, Uri.CREATOR);
                            break;
                        case 7:
                            str27 = oy.Z(parcel, readInt17);
                            break;
                        case '\b':
                            j2 = oy.S(parcel, readInt17);
                            break;
                        case '\t':
                            str28 = oy.Z(parcel, readInt17);
                            break;
                        case '\n':
                            arrayList13 = oy.ac(parcel, readInt17, Scope.CREATOR);
                            break;
                        case 11:
                            str29 = oy.Z(parcel, readInt17);
                            break;
                        case UrlRequest.Status.SENDING_REQUEST /* 12 */:
                            str30 = oy.Z(parcel, readInt17);
                            break;
                        default:
                            oy.ae(parcel, readInt17);
                            break;
                    }
                }
                oy.ad(parcel, R17);
                return new GoogleSignInAccount(str23, str24, str25, str26, uri, str27, j2, str28, arrayList13, str29, str30);
            case 19:
                int R18 = oy.R(parcel);
                while (parcel.dataPosition() < R18) {
                    int readInt18 = parcel.readInt();
                    if (((char) readInt18) != 1) {
                        oy.ae(parcel, readInt18);
                    } else {
                        arrayList = oy.ac(parcel, readInt18, ckn.CREATOR);
                    }
                }
                oy.ad(parcel, R18);
                return new ckd(arrayList);
            default:
                int R19 = oy.R(parcel);
                int i8 = 0;
                int i9 = 0;
                while (parcel.dataPosition() < R19) {
                    int readInt19 = parcel.readInt();
                    char c13 = (char) readInt19;
                    if (c13 == 1) {
                        i = oy.P(parcel, readInt19);
                    } else if (c13 == 2) {
                        i8 = oy.P(parcel, readInt19);
                    } else if (c13 != 3) {
                        oy.ae(parcel, readInt19);
                    } else {
                        i9 = oy.P(parcel, readInt19);
                    }
                }
                oy.ad(parcel, R19);
                return new ckj(i, i8, i9);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        switch (this.a) {
            case 0:
                return new ParcelImpl[i];
            case 1:
                return new anz[i];
            case 2:
                return new bpc[i];
            case 3:
                return new chd[i];
            case 4:
                return new TokenData[i];
            case 5:
                return new chv[i];
            case 6:
                return new chs[i];
            case 7:
                return new cht[i];
            case 8:
                return new chu[i];
            case 9:
                return new ErrorDetails[i];
            case 10:
                return new chx[i];
            case 11:
                return new chy[i];
            case UrlRequest.Status.SENDING_REQUEST /* 12 */:
                return new chz[i];
            case UrlRequest.Status.WAITING_FOR_RESPONSE /* 13 */:
                return new cib[i];
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                return new cic[i];
            case 15:
                return new cid[i];
            case 16:
                return new cie[i];
            case 17:
                return new cif[i];
            case 18:
                return new GoogleSignInAccount[i];
            case 19:
                return new ckd[i];
            default:
                return new ckj[i];
        }
    }
}
