package defpackage;

import android.accounts.Account;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import com.google.android.gms.googlehelp.trails.TrailsInteraction;
import j$.time.Instant;
import java.util.ArrayList;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ctk implements Parcelable.Creator {
    private final /* synthetic */ int a;

    public ctk(int i) {
        this.a = i;
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        long j = 0;
        String str = "";
        int i = 0;
        String str2 = null;
        Account account = null;
        String str3 = null;
        cyv cyvVar = null;
        Bundle bundle = null;
        String str4 = null;
        Uri uri = null;
        ParcelFileDescriptor parcelFileDescriptor = null;
        Uri uri2 = null;
        Uri uri3 = null;
        byte[] bArr = null;
        String str5 = null;
        switch (this.a) {
            case 0:
                int R = oy.R(parcel);
                String str6 = null;
                String str7 = null;
                String str8 = null;
                String str9 = null;
                String str10 = null;
                Bundle bundle2 = null;
                while (parcel.dataPosition() < R) {
                    int readInt = parcel.readInt();
                    switch ((char) readInt) {
                        case 2:
                            str6 = oy.Z(parcel, readInt);
                            break;
                        case 3:
                            str7 = oy.Z(parcel, readInt);
                            break;
                        case 4:
                            str8 = oy.Z(parcel, readInt);
                            break;
                        case 5:
                            str9 = oy.Z(parcel, readInt);
                            break;
                        case 6:
                            str10 = oy.Z(parcel, readInt);
                            break;
                        case 7:
                            bundle2 = oy.T(parcel, readInt);
                            break;
                        default:
                            oy.ae(parcel, readInt);
                            break;
                    }
                }
                oy.ad(parcel, R);
                return new ctj(str6, str7, str8, str9, str10, bundle2);
            case 1:
                int R2 = oy.R(parcel);
                while (parcel.dataPosition() < R2) {
                    int readInt2 = parcel.readInt();
                    char c = (char) readInt2;
                    if (c == 1) {
                        str2 = oy.Z(parcel, readInt2);
                    } else if (c == 2) {
                        j = oy.S(parcel, readInt2);
                    } else if (c != 3) {
                        oy.ae(parcel, readInt2);
                    } else {
                        str = oy.Z(parcel, readInt2);
                    }
                }
                oy.ad(parcel, R2);
                return new TrailsInteraction(str2, j, str);
            case 2:
                int R3 = oy.R(parcel);
                int i2 = -1;
                while (parcel.dataPosition() < R3) {
                    int readInt3 = parcel.readInt();
                    if (((char) readInt3) != 1) {
                        oy.ae(parcel, readInt3);
                    } else {
                        i2 = oy.P(parcel, readInt3);
                    }
                }
                oy.ad(parcel, R3);
                return new cxe(i2);
            case 3:
                int R4 = oy.R(parcel);
                while (parcel.dataPosition() < R4) {
                    int readInt4 = parcel.readInt();
                    char c2 = (char) readInt4;
                    if (c2 == 1) {
                        str5 = oy.Z(parcel, readInt4);
                    } else if (c2 != 2) {
                        oy.ae(parcel, readInt4);
                    } else {
                        j = oy.S(parcel, readInt4);
                    }
                }
                oy.ad(parcel, R4);
                return new cxf(str5, j);
            case 4:
                int R5 = oy.R(parcel);
                while (parcel.dataPosition() < R5) {
                    oy.ae(parcel, parcel.readInt());
                }
                oy.ad(parcel, R5);
                return new cxi();
            case 5:
                int R6 = oy.R(parcel);
                long epochMilli = Instant.now().toEpochMilli();
                int i3 = 0;
                byte[] bArr2 = null;
                cxi cxiVar = null;
                while (parcel.dataPosition() < R6) {
                    int readInt5 = parcel.readInt();
                    char c3 = (char) readInt5;
                    if (c3 == 1) {
                        i3 = oy.P(parcel, readInt5);
                    } else if (c3 == 2) {
                        bArr2 = oy.ag(parcel, readInt5);
                    } else if (c3 == 3) {
                        cxiVar = (cxi) oy.V(parcel, readInt5, cxi.CREATOR);
                    } else if (c3 != 4) {
                        oy.ae(parcel, readInt5);
                    } else {
                        epochMilli = oy.S(parcel, readInt5);
                    }
                }
                oy.ad(parcel, R6);
                return new cxn(i3, bArr2, cxiVar, epochMilli);
            case 6:
                int R7 = oy.R(parcel);
                while (parcel.dataPosition() < R7) {
                    int readInt6 = parcel.readInt();
                    if (((char) readInt6) != 1) {
                        oy.ae(parcel, readInt6);
                    } else {
                        bArr = oy.ag(parcel, readInt6);
                    }
                }
                oy.ad(parcel, R7);
                return new cxo(bArr);
            case 7:
                int R8 = oy.R(parcel);
                while (parcel.dataPosition() < R8) {
                    int readInt7 = parcel.readInt();
                    if (((char) readInt7) != 1) {
                        oy.ae(parcel, readInt7);
                    } else {
                        uri3 = (Uri) oy.V(parcel, readInt7, Uri.CREATOR);
                    }
                }
                oy.ad(parcel, R8);
                return new cxp(uri3);
            case 8:
                int R9 = oy.R(parcel);
                while (parcel.dataPosition() < R9) {
                    int readInt8 = parcel.readInt();
                    char c4 = (char) readInt8;
                    if (c4 == 1) {
                        uri2 = (Uri) oy.V(parcel, readInt8, Uri.CREATOR);
                    } else if (c4 != 2) {
                        oy.ae(parcel, readInt8);
                    } else {
                        i = oy.P(parcel, readInt8);
                    }
                }
                oy.ad(parcel, R9);
                return new cya(uri2, i);
            case 9:
                int R10 = oy.R(parcel);
                while (parcel.dataPosition() < R10) {
                    int readInt9 = parcel.readInt();
                    if (((char) readInt9) != 1) {
                        oy.ae(parcel, readInt9);
                    } else {
                        parcelFileDescriptor = (ParcelFileDescriptor) oy.V(parcel, readInt9, ParcelFileDescriptor.CREATOR);
                    }
                }
                oy.ad(parcel, R10);
                return new cyb(parcelFileDescriptor);
            case 10:
                int R11 = oy.R(parcel);
                Uri uri4 = null;
                while (parcel.dataPosition() < R11) {
                    int readInt10 = parcel.readInt();
                    char c5 = (char) readInt10;
                    if (c5 == 1) {
                        uri = (Uri) oy.V(parcel, readInt10, Uri.CREATOR);
                    } else if (c5 != 2) {
                        oy.ae(parcel, readInt10);
                    } else {
                        uri4 = (Uri) oy.V(parcel, readInt10, Uri.CREATOR);
                    }
                }
                oy.ad(parcel, R11);
                return new cyc(uri, uri4);
            case 11:
                int R12 = oy.R(parcel);
                int i4 = 0;
                String str11 = null;
                while (parcel.dataPosition() < R12) {
                    int readInt11 = parcel.readInt();
                    char c6 = (char) readInt11;
                    if (c6 == 1) {
                        str4 = oy.Z(parcel, readInt11);
                    } else if (c6 == 2) {
                        str11 = oy.Z(parcel, readInt11);
                    } else if (c6 == 3) {
                        i = oy.P(parcel, readInt11);
                    } else if (c6 != 4) {
                        oy.ae(parcel, readInt11);
                    } else {
                        i4 = oy.P(parcel, readInt11);
                    }
                }
                oy.ad(parcel, R12);
                return new cyu(str4, str11, i, i4);
            case UrlRequest.Status.SENDING_REQUEST /* 12 */:
                int R13 = oy.R(parcel);
                String str12 = "";
                boolean z = false;
                boolean z2 = false;
                boolean z3 = false;
                ArrayList arrayList = null;
                ArrayList arrayList2 = null;
                ArrayList arrayList3 = null;
                while (parcel.dataPosition() < R13) {
                    int readInt12 = parcel.readInt();
                    switch ((char) readInt12) {
                        case 1:
                            z = oy.af(parcel, readInt12);
                            break;
                        case 2:
                            z2 = oy.af(parcel, readInt12);
                            break;
                        case 3:
                            arrayList = oy.ac(parcel, readInt12, Account.CREATOR);
                            break;
                        case 4:
                            arrayList2 = oy.ac(parcel, readInt12, Account.CREATOR);
                            break;
                        case 5:
                            str12 = oy.Z(parcel, readInt12);
                            break;
                        case 6:
                            z3 = oy.af(parcel, readInt12);
                            break;
                        case 7:
                            arrayList3 = oy.ac(parcel, readInt12, Account.CREATOR);
                            break;
                        default:
                            oy.ae(parcel, readInt12);
                            break;
                    }
                }
                oy.ad(parcel, R13);
                return new cyv(z, z2, arrayList, arrayList2, str12, z3, arrayList3);
            case UrlRequest.Status.WAITING_FOR_RESPONSE /* 13 */:
                int R14 = oy.R(parcel);
                boolean z4 = false;
                boolean z5 = false;
                boolean z6 = false;
                boolean z7 = false;
                boolean z8 = false;
                boolean z9 = false;
                Account account2 = null;
                String str13 = null;
                ArrayList arrayList4 = null;
                while (parcel.dataPosition() < R14) {
                    int readInt13 = parcel.readInt();
                    switch ((char) readInt13) {
                        case 1:
                            z4 = oy.af(parcel, readInt13);
                            break;
                        case 2:
                            z5 = oy.af(parcel, readInt13);
                            break;
                        case 3:
                            z6 = oy.af(parcel, readInt13);
                            break;
                        case 4:
                            account2 = (Account) oy.V(parcel, readInt13, Account.CREATOR);
                            break;
                        case 5:
                            z7 = oy.af(parcel, readInt13);
                            break;
                        case 6:
                            z8 = oy.af(parcel, readInt13);
                            break;
                        case 7:
                            str13 = oy.Z(parcel, readInt13);
                            break;
                        case '\b':
                            arrayList4 = oy.ac(parcel, readInt13, Account.CREATOR);
                            break;
                        case '\t':
                            z9 = oy.af(parcel, readInt13);
                            break;
                        default:
                            oy.ae(parcel, readInt13);
                            break;
                    }
                }
                oy.ad(parcel, R14);
                return new cyw(z4, z5, z6, account2, z7, z8, str13, arrayList4, z9);
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                int R15 = oy.R(parcel);
                while (parcel.dataPosition() < R15) {
                    int readInt14 = parcel.readInt();
                    char c7 = (char) readInt14;
                    if (c7 == 1) {
                        i = oy.P(parcel, readInt14);
                    } else if (c7 != 2) {
                        oy.ae(parcel, readInt14);
                    } else {
                        bundle = oy.T(parcel, readInt14);
                    }
                }
                oy.ad(parcel, R15);
                return new cyx(i, bundle);
            case 15:
                int R16 = oy.R(parcel);
                cyx cyxVar = null;
                cyw cywVar = null;
                while (parcel.dataPosition() < R16) {
                    int readInt15 = parcel.readInt();
                    char c8 = (char) readInt15;
                    if (c8 == 1) {
                        cyvVar = (cyv) oy.V(parcel, readInt15, cyv.CREATOR);
                    } else if (c8 == 2) {
                        cyxVar = (cyx) oy.V(parcel, readInt15, cyx.CREATOR);
                    } else if (c8 != 3) {
                        oy.ae(parcel, readInt15);
                    } else {
                        cywVar = (cyw) oy.V(parcel, readInt15, cyw.CREATOR);
                    }
                }
                oy.ad(parcel, R16);
                return new cyy(cyvVar, cyxVar, cywVar);
            case 16:
                int R17 = oy.R(parcel);
                int[] iArr = null;
                String[] strArr = null;
                while (parcel.dataPosition() < R17) {
                    int readInt16 = parcel.readInt();
                    char c9 = (char) readInt16;
                    if (c9 == 1) {
                        str3 = oy.Z(parcel, readInt16);
                    } else if (c9 == 2) {
                        iArr = oy.ah(parcel, readInt16);
                    } else if (c9 == 4) {
                        i = oy.P(parcel, readInt16);
                    } else if (c9 != 5) {
                        oy.ae(parcel, readInt16);
                    } else {
                        strArr = oy.aj(parcel, readInt16);
                    }
                }
                oy.ad(parcel, R17);
                return new czn(str3, iArr, i, strArr);
            case 17:
                int R18 = oy.R(parcel);
                int i5 = 0;
                while (parcel.dataPosition() < R18) {
                    int readInt17 = parcel.readInt();
                    char c10 = (char) readInt17;
                    if (c10 == 2) {
                        i = oy.P(parcel, readInt17);
                    } else if (c10 != 3) {
                        oy.ae(parcel, readInt17);
                    } else {
                        i5 = oy.P(parcel, readInt17);
                    }
                }
                oy.ad(parcel, R18);
                return new czo(i, i5);
            case 18:
                int R19 = oy.R(parcel);
                int i6 = 0;
                int i7 = 0;
                int i8 = 0;
                while (parcel.dataPosition() < R19) {
                    int readInt18 = parcel.readInt();
                    char c11 = (char) readInt18;
                    if (c11 == 1) {
                        i = oy.P(parcel, readInt18);
                    } else if (c11 == 2) {
                        i6 = oy.P(parcel, readInt18);
                    } else if (c11 == 3) {
                        i7 = oy.P(parcel, readInt18);
                    } else if (c11 != 4) {
                        oy.ae(parcel, readInt18);
                    } else {
                        i8 = oy.P(parcel, readInt18);
                    }
                }
                oy.ad(parcel, R19);
                return new czp(i, i6, i7, i8);
            case 19:
                int R20 = oy.R(parcel);
                int i9 = 0;
                int i10 = 0;
                boolean z10 = false;
                String str14 = null;
                String str15 = null;
                while (parcel.dataPosition() < R20) {
                    int readInt19 = parcel.readInt();
                    char c12 = (char) readInt19;
                    if (c12 == 1) {
                        str14 = oy.Z(parcel, readInt19);
                    } else if (c12 == 2) {
                        str15 = oy.Z(parcel, readInt19);
                    } else if (c12 == 3) {
                        i9 = oy.P(parcel, readInt19);
                    } else if (c12 == 4) {
                        i10 = oy.P(parcel, readInt19);
                    } else if (c12 != 5) {
                        oy.ae(parcel, readInt19);
                    } else {
                        z10 = oy.af(parcel, readInt19);
                    }
                }
                oy.ad(parcel, R20);
                return new czq(str14, str15, i9, i10, z10);
            default:
                int R21 = oy.R(parcel);
                while (parcel.dataPosition() < R21) {
                    int readInt20 = parcel.readInt();
                    char c13 = (char) readInt20;
                    if (c13 == 1) {
                        i = oy.P(parcel, readInt20);
                    } else if (c13 != 2) {
                        oy.ae(parcel, readInt20);
                    } else {
                        account = (Account) oy.V(parcel, readInt20, Account.CREATOR);
                    }
                }
                oy.ad(parcel, R21);
                return new czr(i, account);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        switch (this.a) {
            case 0:
                return new ctj[i];
            case 1:
                return new TrailsInteraction[i];
            case 2:
                return new cxe[i];
            case 3:
                return new cxf[i];
            case 4:
                return new cxi[i];
            case 5:
                return new cxn[i];
            case 6:
                return new cxo[i];
            case 7:
                return new cxp[i];
            case 8:
                return new cya[i];
            case 9:
                return new cyb[i];
            case 10:
                return new cyc[i];
            case 11:
                return new cyu[i];
            case UrlRequest.Status.SENDING_REQUEST /* 12 */:
                return new cyv[i];
            case UrlRequest.Status.WAITING_FOR_RESPONSE /* 13 */:
                return new cyw[i];
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                return new cyx[i];
            case 15:
                return new cyy[i];
            case 16:
                return new czn[i];
            case 17:
                return new czo[i];
            case 18:
                return new czp[i];
            case 19:
                return new czq[i];
            default:
                return new czr[i];
        }
    }
}
