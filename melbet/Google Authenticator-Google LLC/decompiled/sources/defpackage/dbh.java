package defpackage;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class dbh implements Parcelable.Creator {
    private final /* synthetic */ int a;

    public dbh(int i) {
        this.a = i;
    }

    public static boolean a(int i) {
        return i == 0;
    }

    public static boolean b(Object obj) {
        return obj == null;
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int i = 0;
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        boolean z4 = false;
        dbn[] dbnVarArr = null;
        ArrayList arrayList = null;
        clg clgVar = null;
        crb crbVar = null;
        ArrayList arrayList2 = null;
        Intent intent = null;
        String str = null;
        byte[] bArr = null;
        ArrayList arrayList3 = null;
        String str2 = null;
        byte[] bArr2 = null;
        switch (this.a) {
            case 0:
                int R = oy.R(parcel);
                long j = 0;
                boolean z5 = false;
                String str3 = null;
                String str4 = null;
                dbf[] dbfVarArr = null;
                byte[] bArr3 = null;
                while (parcel.dataPosition() < R) {
                    int readInt = parcel.readInt();
                    switch ((char) readInt) {
                        case 2:
                            str3 = oy.Z(parcel, readInt);
                            break;
                        case 3:
                            str4 = oy.Z(parcel, readInt);
                            break;
                        case 4:
                            dbfVarArr = (dbf[]) oy.ai(parcel, readInt, dbf.CREATOR);
                            break;
                        case 5:
                            z5 = oy.af(parcel, readInt);
                            break;
                        case 6:
                            bArr3 = oy.ag(parcel, readInt);
                            break;
                        case 7:
                            j = oy.S(parcel, readInt);
                            break;
                        default:
                            oy.ae(parcel, readInt);
                            break;
                    }
                }
                oy.ad(parcel, R);
                return new dbg(str3, str4, dbfVarArr, z5, bArr3, j);
            case 1:
                int R2 = oy.R(parcel);
                String[] strArr = null;
                while (parcel.dataPosition() < R2) {
                    int readInt2 = parcel.readInt();
                    char c = (char) readInt2;
                    if (c == 2) {
                        i = oy.P(parcel, readInt2);
                    } else if (c == 3) {
                        dbnVarArr = (dbn[]) oy.ai(parcel, readInt2, dbn.CREATOR);
                    } else if (c != 4) {
                        oy.ae(parcel, readInt2);
                    } else {
                        strArr = oy.aj(parcel, readInt2);
                    }
                }
                oy.ad(parcel, R2);
                return new dbf(i, dbnVarArr, strArr);
            case 2:
                int R3 = oy.R(parcel);
                while (parcel.dataPosition() < R3) {
                    int readInt3 = parcel.readInt();
                    if (((char) readInt3) != 2) {
                        oy.ae(parcel, readInt3);
                    } else {
                        bArr2 = oy.ag(parcel, readInt3);
                    }
                }
                oy.ad(parcel, R3);
                return new dbi(bArr2);
            case 3:
                int R4 = oy.R(parcel);
                String str5 = null;
                byte[] bArr4 = null;
                byte[][] bArr5 = null;
                byte[][] bArr6 = null;
                byte[][] bArr7 = null;
                byte[][] bArr8 = null;
                int[] iArr = null;
                byte[][] bArr9 = null;
                int[] iArr2 = null;
                byte[][] bArr10 = null;
                while (parcel.dataPosition() < R4) {
                    int readInt4 = parcel.readInt();
                    switch ((char) readInt4) {
                        case 2:
                            str5 = oy.Z(parcel, readInt4);
                            break;
                        case 3:
                            bArr4 = oy.ag(parcel, readInt4);
                            break;
                        case 4:
                            bArr5 = oy.ak(parcel, readInt4);
                            break;
                        case 5:
                            bArr6 = oy.ak(parcel, readInt4);
                            break;
                        case 6:
                            bArr7 = oy.ak(parcel, readInt4);
                            break;
                        case 7:
                            bArr8 = oy.ak(parcel, readInt4);
                            break;
                        case '\b':
                            iArr = oy.ah(parcel, readInt4);
                            break;
                        case '\t':
                            bArr9 = oy.ak(parcel, readInt4);
                            break;
                        case '\n':
                            iArr2 = oy.ah(parcel, readInt4);
                            break;
                        case 11:
                            bArr10 = oy.ak(parcel, readInt4);
                            break;
                        default:
                            oy.ae(parcel, readInt4);
                            break;
                    }
                }
                oy.ad(parcel, R4);
                return new dbl(str5, bArr4, bArr5, bArr6, bArr7, bArr8, iArr, bArr9, iArr2, bArr10);
            case 4:
                int R5 = oy.R(parcel);
                long j2 = 0;
                double d = 0.0d;
                boolean z6 = false;
                int i6 = 0;
                int i7 = 0;
                int i8 = 0;
                String str6 = null;
                String str7 = null;
                byte[] bArr11 = null;
                while (parcel.dataPosition() < R5) {
                    int readInt5 = parcel.readInt();
                    switch ((char) readInt5) {
                        case 2:
                            str6 = oy.Z(parcel, readInt5);
                            break;
                        case 3:
                            j2 = oy.S(parcel, readInt5);
                            break;
                        case 4:
                            z6 = oy.af(parcel, readInt5);
                            break;
                        case 5:
                            d = oy.N(parcel, readInt5);
                            break;
                        case 6:
                            str7 = oy.Z(parcel, readInt5);
                            break;
                        case 7:
                            bArr11 = oy.ag(parcel, readInt5);
                            break;
                        case '\b':
                            i6 = oy.P(parcel, readInt5);
                            break;
                        case '\t':
                            i7 = oy.P(parcel, readInt5);
                            break;
                        case '\n':
                            i8 = oy.P(parcel, readInt5);
                            break;
                        default:
                            oy.ae(parcel, readInt5);
                            break;
                    }
                }
                oy.ad(parcel, R5);
                return new dbn(str6, j2, z6, d, str7, bArr11, i6, i7, i8);
            case 5:
                int R6 = oy.R(parcel);
                String str8 = null;
                dbn dbnVar = null;
                while (parcel.dataPosition() < R6) {
                    int readInt6 = parcel.readInt();
                    char c2 = (char) readInt6;
                    if (c2 == 2) {
                        str2 = oy.Z(parcel, readInt6);
                    } else if (c2 == 3) {
                        str8 = oy.Z(parcel, readInt6);
                    } else if (c2 == 4) {
                        dbnVar = (dbn) oy.V(parcel, readInt6, dbn.CREATOR);
                    } else if (c2 != 5) {
                        oy.ae(parcel, readInt6);
                    } else {
                        z4 = oy.af(parcel, readInt6);
                    }
                }
                oy.ad(parcel, R6);
                return new dbo(str2, str8, dbnVar, z4);
            case 6:
                int R7 = oy.R(parcel);
                while (parcel.dataPosition() < R7) {
                    int readInt7 = parcel.readInt();
                    if (((char) readInt7) != 2) {
                        oy.ae(parcel, readInt7);
                    } else {
                        arrayList3 = oy.ac(parcel, readInt7, dbo.CREATOR);
                    }
                }
                oy.ad(parcel, R7);
                return new dbp(arrayList3);
            case 7:
                int R8 = oy.R(parcel);
                int i9 = 0;
                while (parcel.dataPosition() < R8) {
                    int readInt8 = parcel.readInt();
                    char c3 = (char) readInt8;
                    if (c3 == 1) {
                        i5 = oy.P(parcel, readInt8);
                    } else if (c3 != 2) {
                        oy.ae(parcel, readInt8);
                    } else {
                        i9 = oy.P(parcel, readInt8);
                    }
                }
                oy.ad(parcel, R8);
                return new dbq(i5, i9);
            case 8:
                int R9 = oy.R(parcel);
                int i10 = 0;
                boolean z7 = false;
                int i11 = 0;
                int i12 = 0;
                String str9 = null;
                String[] strArr2 = null;
                byte[] bArr12 = null;
                int[] iArr3 = null;
                String str10 = null;
                byte[] bArr13 = null;
                while (parcel.dataPosition() < R9) {
                    int readInt9 = parcel.readInt();
                    switch ((char) readInt9) {
                        case 1:
                            str9 = oy.Z(parcel, readInt9);
                            break;
                        case 2:
                            i10 = oy.P(parcel, readInt9);
                            break;
                        case 3:
                            strArr2 = oy.aj(parcel, readInt9);
                            break;
                        case 4:
                            bArr12 = oy.ag(parcel, readInt9);
                            break;
                        case 5:
                            z7 = oy.af(parcel, readInt9);
                            break;
                        case 6:
                            iArr3 = oy.ah(parcel, readInt9);
                            break;
                        case 7:
                            str10 = oy.Z(parcel, readInt9);
                            break;
                        case '\b':
                            bArr13 = oy.ag(parcel, readInt9);
                            break;
                        case '\t':
                            i11 = oy.P(parcel, readInt9);
                            break;
                        case '\n':
                            i12 = oy.P(parcel, readInt9);
                            break;
                        default:
                            oy.ae(parcel, readInt9);
                            break;
                    }
                }
                oy.ad(parcel, R9);
                return new dbx(str9, i10, strArr2, bArr12, z7, iArr3, str10, bArr13, i11, i12);
            case 9:
                int R10 = oy.R(parcel);
                while (parcel.dataPosition() < R10) {
                    int readInt10 = parcel.readInt();
                    if (((char) readInt10) != 1) {
                        oy.ae(parcel, readInt10);
                    } else {
                        bArr = oy.ag(parcel, readInt10);
                    }
                }
                oy.ad(parcel, R10);
                return new dcc(bArr);
            case 10:
                int R11 = oy.R(parcel);
                while (parcel.dataPosition() < R11) {
                    int readInt11 = parcel.readInt();
                    if (((char) readInt11) != 2) {
                        oy.ae(parcel, readInt11);
                    } else {
                        str = oy.Z(parcel, readInt11);
                    }
                }
                oy.ad(parcel, R11);
                return new dch(str);
            case 11:
                return new dci(parcel);
            case UrlRequest.Status.SENDING_REQUEST /* 12 */:
                int R12 = oy.R(parcel);
                int i13 = 0;
                while (parcel.dataPosition() < R12) {
                    int readInt12 = parcel.readInt();
                    char c4 = (char) readInt12;
                    if (c4 == 1) {
                        i4 = oy.P(parcel, readInt12);
                    } else if (c4 == 2) {
                        i13 = oy.P(parcel, readInt12);
                    } else if (c4 != 3) {
                        oy.ae(parcel, readInt12);
                    } else {
                        intent = (Intent) oy.V(parcel, readInt12, Intent.CREATOR);
                    }
                }
                oy.ad(parcel, R12);
                return new dcq(i4, i13, intent);
            case UrlRequest.Status.WAITING_FOR_RESPONSE /* 13 */:
                int R13 = oy.R(parcel);
                String str11 = null;
                while (parcel.dataPosition() < R13) {
                    int readInt13 = parcel.readInt();
                    char c5 = (char) readInt13;
                    if (c5 == 1) {
                        arrayList2 = oy.ab(parcel, readInt13);
                    } else if (c5 != 2) {
                        oy.ae(parcel, readInt13);
                    } else {
                        str11 = oy.Z(parcel, readInt13);
                    }
                }
                oy.ad(parcel, R13);
                return new dct(arrayList2, str11);
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                int R14 = oy.R(parcel);
                while (parcel.dataPosition() < R14) {
                    int readInt14 = parcel.readInt();
                    char c6 = (char) readInt14;
                    if (c6 == 1) {
                        i3 = oy.P(parcel, readInt14);
                    } else if (c6 != 2) {
                        oy.ae(parcel, readInt14);
                    } else {
                        crbVar = (crb) oy.V(parcel, readInt14, crb.CREATOR);
                    }
                }
                oy.ad(parcel, R14);
                return new dcv(i3, crbVar);
            case 15:
                int R15 = oy.R(parcel);
                crc crcVar = null;
                while (parcel.dataPosition() < R15) {
                    int readInt15 = parcel.readInt();
                    char c7 = (char) readInt15;
                    if (c7 == 1) {
                        i2 = oy.P(parcel, readInt15);
                    } else if (c7 == 2) {
                        clgVar = (clg) oy.V(parcel, readInt15, clg.CREATOR);
                    } else if (c7 != 3) {
                        oy.ae(parcel, readInt15);
                    } else {
                        crcVar = (crc) oy.V(parcel, readInt15, crc.CREATOR);
                    }
                }
                oy.ad(parcel, R15);
                return new dcw(i2, clgVar, crcVar);
            case 16:
                int R16 = oy.R(parcel);
                String str12 = null;
                byte[] bArr14 = null;
                ArrayList arrayList4 = null;
                while (parcel.dataPosition() < R16) {
                    int readInt16 = parcel.readInt();
                    char c8 = (char) readInt16;
                    if (c8 == 1) {
                        str12 = oy.Z(parcel, readInt16);
                    } else if (c8 == 2) {
                        bArr14 = oy.ag(parcel, readInt16);
                    } else if (c8 != 3) {
                        oy.ae(parcel, readInt16);
                    } else {
                        int Q = oy.Q(parcel, readInt16);
                        int dataPosition = parcel.dataPosition();
                        if (Q == 0) {
                            arrayList4 = null;
                        } else {
                            ArrayList arrayList5 = new ArrayList();
                            int readInt17 = parcel.readInt();
                            for (int i14 = 0; i14 < readInt17; i14++) {
                                arrayList5.add(Integer.valueOf(parcel.readInt()));
                            }
                            parcel.setDataPosition(dataPosition + Q);
                            arrayList4 = arrayList5;
                        }
                    }
                }
                oy.ad(parcel, R16);
                return new ddo(str12, bArr14, arrayList4);
            case 17:
                int R17 = oy.R(parcel);
                boolean z8 = false;
                while (parcel.dataPosition() < R17) {
                    int readInt18 = parcel.readInt();
                    char c9 = (char) readInt18;
                    if (c9 == 1) {
                        arrayList = oy.ac(parcel, readInt18, ddo.CREATOR);
                    } else if (c9 == 2) {
                        z3 = oy.af(parcel, readInt18);
                    } else if (c9 != 3) {
                        oy.ae(parcel, readInt18);
                    } else {
                        z8 = oy.af(parcel, readInt18);
                    }
                }
                oy.ad(parcel, R17);
                return new ddp(arrayList, z3, z8);
            case 18:
                int R18 = oy.R(parcel);
                int i15 = 0;
                while (parcel.dataPosition() < R18) {
                    int readInt19 = parcel.readInt();
                    char c10 = (char) readInt19;
                    if (c10 == 2) {
                        z2 = oy.af(parcel, readInt19);
                    } else if (c10 != 3) {
                        oy.ae(parcel, readInt19);
                    } else {
                        i15 = oy.P(parcel, readInt19);
                    }
                }
                oy.ad(parcel, R18);
                return new ddq(z2, i15);
            case 19:
                int R19 = oy.R(parcel);
                boolean z9 = false;
                int i16 = 0;
                while (parcel.dataPosition() < R19) {
                    int readInt20 = parcel.readInt();
                    char c11 = (char) readInt20;
                    if (c11 == 2) {
                        z = oy.af(parcel, readInt20);
                    } else if (c11 == 3) {
                        z9 = oy.af(parcel, readInt20);
                    } else if (c11 != 4) {
                        oy.ae(parcel, readInt20);
                    } else {
                        i16 = oy.P(parcel, readInt20);
                    }
                }
                oy.ad(parcel, R19);
                return new ddx(z, z9, i16);
            default:
                int R20 = oy.R(parcel);
                int i17 = 0;
                boolean z10 = false;
                int i18 = 0;
                boolean z11 = false;
                ArrayList arrayList6 = null;
                String str13 = null;
                while (parcel.dataPosition() < R20) {
                    int readInt21 = parcel.readInt();
                    switch ((char) readInt21) {
                        case 2:
                            i17 = oy.P(parcel, readInt21);
                            break;
                        case 3:
                            z10 = oy.af(parcel, readInt21);
                            break;
                        case 4:
                            arrayList6 = oy.ab(parcel, readInt21);
                            break;
                        case 5:
                            i18 = oy.P(parcel, readInt21);
                            break;
                        case 6:
                            str13 = oy.Z(parcel, readInt21);
                            break;
                        case 7:
                            z11 = oy.af(parcel, readInt21);
                            break;
                        default:
                            oy.ae(parcel, readInt21);
                            break;
                    }
                }
                oy.ad(parcel, R20);
                return new ded(i17, z10, arrayList6, i18, str13, z11);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        switch (this.a) {
            case 0:
                return new dbg[i];
            case 1:
                return new dbf[i];
            case 2:
                return new dbi[i];
            case 3:
                return new dbl[i];
            case 4:
                return new dbn[i];
            case 5:
                return new dbo[i];
            case 6:
                return new dbp[i];
            case 7:
                return new dbq[i];
            case 8:
                return new dbx[i];
            case 9:
                return new dcc[i];
            case 10:
                return new dch[i];
            case 11:
                return new dci[i];
            case UrlRequest.Status.SENDING_REQUEST /* 12 */:
                return new dcq[i];
            case UrlRequest.Status.WAITING_FOR_RESPONSE /* 13 */:
                return new dct[i];
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                return new dcv[i];
            case 15:
                return new dcw[i];
            case 16:
                return new ddo[i];
            case 17:
                return new ddp[i];
            case 18:
                return new ddq[i];
            case 19:
                return new ddx[i];
            default:
                return new ded[i];
        }
    }
}
