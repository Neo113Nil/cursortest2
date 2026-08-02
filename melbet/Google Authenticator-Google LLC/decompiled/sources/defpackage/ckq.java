package defpackage;

import android.app.PendingIntent;
import android.database.CursorWindow;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.BitmapTeleporter;
import com.google.android.gms.common.data.DataHolder;
import java.util.ArrayList;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ckq implements Parcelable.Creator {
    public static final ckq a = new ckq(10);
    private final /* synthetic */ int b;

    public ckq(int i) {
        this.b = i;
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        long j = 0;
        String str = null;
        ArrayList arrayList = null;
        String str2 = null;
        ParcelFileDescriptor parcelFileDescriptor = null;
        String str3 = null;
        String str4 = null;
        cmp cmpVar = null;
        String str5 = null;
        boolean z = false;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        boolean z2 = false;
        boolean z3 = false;
        boolean z4 = false;
        int i6 = 0;
        switch (this.b) {
            case 0:
                int R = oy.R(parcel);
                while (parcel.dataPosition() < R) {
                    int readInt = parcel.readInt();
                    if (((char) readInt) != 1) {
                        oy.ae(parcel, readInt);
                    } else {
                        z = oy.af(parcel, readInt);
                    }
                }
                oy.ad(parcel, R);
                return new ckp(z);
            case 1:
                int R2 = oy.R(parcel);
                int i7 = 0;
                while (parcel.dataPosition() < R2) {
                    int readInt2 = parcel.readInt();
                    char c = (char) readInt2;
                    if (c == 1) {
                        str = oy.Z(parcel, readInt2);
                    } else if (c == 2) {
                        i6 = oy.P(parcel, readInt2);
                    } else if (c != 3) {
                        oy.ae(parcel, readInt2);
                    } else {
                        i7 = oy.P(parcel, readInt2);
                    }
                }
                oy.ad(parcel, R2);
                return new ckn(str, i6, i7);
            case 2:
                int R3 = oy.R(parcel);
                boolean z5 = true;
                String str6 = null;
                String str7 = null;
                String str8 = null;
                Integer num = null;
                int i8 = 0;
                int i9 = 0;
                boolean z6 = false;
                int i10 = 0;
                boolean z7 = false;
                int i11 = 0;
                while (parcel.dataPosition() < R3) {
                    int readInt3 = parcel.readInt();
                    switch ((char) readInt3) {
                        case 2:
                            str6 = oy.Z(parcel, readInt3);
                            break;
                        case 3:
                            i8 = oy.P(parcel, readInt3);
                            break;
                        case 4:
                            i9 = oy.P(parcel, readInt3);
                            break;
                        case 5:
                            str7 = oy.Z(parcel, readInt3);
                            break;
                        case 6:
                        default:
                            oy.ae(parcel, readInt3);
                            break;
                        case 7:
                            z5 = oy.af(parcel, readInt3);
                            break;
                        case '\b':
                            str8 = oy.Z(parcel, readInt3);
                            break;
                        case '\t':
                            z6 = oy.af(parcel, readInt3);
                            break;
                        case '\n':
                            i10 = oy.P(parcel, readInt3);
                            break;
                        case 11:
                            num = oy.X(parcel, readInt3);
                            break;
                        case UrlRequest.Status.SENDING_REQUEST /* 12 */:
                            z7 = oy.af(parcel, readInt3);
                            break;
                        case UrlRequest.Status.WAITING_FOR_RESPONSE /* 13 */:
                            i11 = oy.P(parcel, readInt3);
                            break;
                    }
                }
                oy.ad(parcel, R3);
                return new ckr(str6, i8, i9, str7, z5, str8, z6, i10, num, z7, i11);
            case 3:
                int R4 = oy.R(parcel);
                double d = 0.0d;
                String str9 = null;
                int i12 = 0;
                int i13 = 0;
                int i14 = 0;
                while (parcel.dataPosition() < R4) {
                    int readInt4 = parcel.readInt();
                    char c2 = (char) readInt4;
                    if (c2 == 1) {
                        i12 = oy.P(parcel, readInt4);
                    } else if (c2 == 2) {
                        d = oy.N(parcel, readInt4);
                    } else if (c2 == 3) {
                        i13 = oy.P(parcel, readInt4);
                    } else if (c2 == 4) {
                        i14 = oy.P(parcel, readInt4);
                    } else if (c2 != 5) {
                        oy.ae(parcel, readInt4);
                    } else {
                        str9 = oy.Z(parcel, readInt4);
                    }
                }
                oy.ad(parcel, R4);
                return new clc(i12, d, i13, i14, str9);
            case 4:
                int R5 = oy.R(parcel);
                while (parcel.dataPosition() < R5) {
                    int readInt5 = parcel.readInt();
                    char c3 = (char) readInt5;
                    if (c3 == 1) {
                        z4 = oy.af(parcel, readInt5);
                    } else if (c3 != 2) {
                        oy.ae(parcel, readInt5);
                    } else {
                        j = oy.S(parcel, readInt5);
                    }
                }
                oy.ad(parcel, R5);
                return new cld(z4, j);
            case 5:
                int R6 = oy.R(parcel);
                PendingIntent pendingIntent = null;
                String str10 = null;
                Integer num2 = null;
                int i15 = 0;
                int i16 = 0;
                while (parcel.dataPosition() < R6) {
                    int readInt6 = parcel.readInt();
                    char c4 = (char) readInt6;
                    if (c4 == 1) {
                        i15 = oy.P(parcel, readInt6);
                    } else if (c4 == 2) {
                        i16 = oy.P(parcel, readInt6);
                    } else if (c4 == 3) {
                        pendingIntent = (PendingIntent) oy.V(parcel, readInt6, PendingIntent.CREATOR);
                    } else if (c4 == 4) {
                        str10 = oy.Z(parcel, readInt6);
                    } else if (c4 != 5) {
                        oy.ae(parcel, readInt6);
                    } else {
                        num2 = oy.X(parcel, readInt6);
                    }
                }
                oy.ad(parcel, R6);
                return new clg(i15, i16, pendingIntent, str10, num2);
            case 6:
                int R7 = oy.R(parcel);
                long j2 = -1;
                String str11 = null;
                int i17 = 0;
                boolean z8 = false;
                while (parcel.dataPosition() < R7) {
                    int readInt7 = parcel.readInt();
                    char c5 = (char) readInt7;
                    if (c5 == 1) {
                        str11 = oy.Z(parcel, readInt7);
                    } else if (c5 == 2) {
                        i17 = oy.P(parcel, readInt7);
                    } else if (c5 == 3) {
                        j2 = oy.S(parcel, readInt7);
                    } else if (c5 != 4) {
                        oy.ae(parcel, readInt7);
                    } else {
                        z8 = oy.af(parcel, readInt7);
                    }
                }
                oy.ad(parcel, R7);
                return new cli(str11, i17, j2, z8);
            case 7:
                int R8 = oy.R(parcel);
                String str12 = null;
                IBinder iBinder = null;
                boolean z9 = false;
                boolean z10 = false;
                boolean z11 = false;
                boolean z12 = false;
                boolean z13 = false;
                while (parcel.dataPosition() < R8) {
                    int readInt8 = parcel.readInt();
                    switch ((char) readInt8) {
                        case 1:
                            str12 = oy.Z(parcel, readInt8);
                            break;
                        case 2:
                            z9 = oy.af(parcel, readInt8);
                            break;
                        case 3:
                            z10 = oy.af(parcel, readInt8);
                            break;
                        case 4:
                            iBinder = oy.U(parcel, readInt8);
                            break;
                        case 5:
                            z11 = oy.af(parcel, readInt8);
                            break;
                        case 6:
                            z12 = oy.af(parcel, readInt8);
                            break;
                        case 7:
                        default:
                            oy.ae(parcel, readInt8);
                            break;
                        case '\b':
                            z13 = oy.af(parcel, readInt8);
                            break;
                    }
                }
                oy.ad(parcel, R8);
                return new clx(str12, z9, z10, iBinder, z11, z12, z13);
            case 8:
                int R9 = oy.R(parcel);
                long j3 = -1;
                String str13 = null;
                boolean z14 = false;
                int i18 = 0;
                int i19 = 0;
                while (parcel.dataPosition() < R9) {
                    int readInt9 = parcel.readInt();
                    char c6 = (char) readInt9;
                    if (c6 == 1) {
                        z14 = oy.af(parcel, readInt9);
                    } else if (c6 == 2) {
                        str13 = oy.Z(parcel, readInt9);
                    } else if (c6 == 3) {
                        i18 = oy.P(parcel, readInt9);
                    } else if (c6 == 4) {
                        i19 = oy.P(parcel, readInt9);
                    } else if (c6 != 5) {
                        oy.ae(parcel, readInt9);
                    } else {
                        j3 = oy.S(parcel, readInt9);
                    }
                }
                oy.ad(parcel, R9);
                return new cly(z14, str13, i18, i19, j3);
            case 9:
                int R10 = oy.R(parcel);
                IBinder iBinder2 = null;
                boolean z15 = false;
                while (parcel.dataPosition() < R10) {
                    int readInt10 = parcel.readInt();
                    char c7 = (char) readInt10;
                    if (c7 == 1) {
                        str5 = oy.Z(parcel, readInt10);
                    } else if (c7 == 2) {
                        iBinder2 = oy.U(parcel, readInt10);
                    } else if (c7 == 3) {
                        z3 = oy.af(parcel, readInt10);
                    } else if (c7 != 4) {
                        oy.ae(parcel, readInt10);
                    } else {
                        z15 = oy.af(parcel, readInt10);
                    }
                }
                oy.ad(parcel, R10);
                return new clz(str5, iBinder2, z3, z15);
            case 10:
                int dataPosition = parcel.dataPosition();
                if (parcel.readInt() != -204102970) {
                    parcel.setDataPosition(dataPosition - 4);
                    return cmn.a;
                }
                int R11 = oy.R(parcel);
                while (parcel.dataPosition() < R11) {
                    int readInt11 = parcel.readInt();
                    char c8 = (char) readInt11;
                    if (c8 == 1) {
                        cmpVar = (cmp) oy.V(parcel, readInt11, cmp.CREATOR);
                    } else if (c8 != 2) {
                        oy.ae(parcel, readInt11);
                    } else {
                        z2 = oy.af(parcel, readInt11);
                    }
                }
                oy.ad(parcel, R11);
                return new cmn(cmpVar, z2);
            case 11:
                int R12 = oy.R(parcel);
                boolean z16 = true;
                int i20 = 0;
                int i21 = 0;
                while (parcel.dataPosition() < R12) {
                    int readInt12 = parcel.readInt();
                    char c9 = (char) readInt12;
                    if (c9 == 1) {
                        i5 = oy.P(parcel, readInt12);
                    } else if (c9 == 2) {
                        i20 = oy.P(parcel, readInt12);
                    } else if (c9 == 3) {
                        i21 = oy.P(parcel, readInt12);
                    } else if (c9 != 4) {
                        oy.ae(parcel, readInt12);
                    } else {
                        z16 = oy.af(parcel, readInt12);
                    }
                }
                oy.ad(parcel, R12);
                return new cmp(i5, i20, i21, z16);
            case UrlRequest.Status.SENDING_REQUEST /* 12 */:
                int R13 = oy.R(parcel);
                while (parcel.dataPosition() < R13) {
                    int readInt13 = parcel.readInt();
                    char c10 = (char) readInt13;
                    if (c10 == 1) {
                        i4 = oy.P(parcel, readInt13);
                    } else if (c10 != 2) {
                        oy.ae(parcel, readInt13);
                    } else {
                        str4 = oy.Z(parcel, readInt13);
                    }
                }
                oy.ad(parcel, R13);
                return new Scope(i4, str4);
            case UrlRequest.Status.WAITING_FOR_RESPONSE /* 13 */:
                int R14 = oy.R(parcel);
                PendingIntent pendingIntent2 = null;
                clg clgVar = null;
                while (parcel.dataPosition() < R14) {
                    int readInt14 = parcel.readInt();
                    char c11 = (char) readInt14;
                    if (c11 == 1) {
                        i3 = oy.P(parcel, readInt14);
                    } else if (c11 == 2) {
                        str3 = oy.Z(parcel, readInt14);
                    } else if (c11 == 3) {
                        pendingIntent2 = (PendingIntent) oy.V(parcel, readInt14, PendingIntent.CREATOR);
                    } else if (c11 != 4) {
                        oy.ae(parcel, readInt14);
                    } else {
                        clgVar = (clg) oy.V(parcel, readInt14, clg.CREATOR);
                    }
                }
                oy.ad(parcel, R14);
                return new Status(i3, str3, pendingIntent2, clgVar);
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                int R15 = oy.R(parcel);
                int i22 = 0;
                while (parcel.dataPosition() < R15) {
                    int readInt15 = parcel.readInt();
                    char c12 = (char) readInt15;
                    if (c12 == 1) {
                        i2 = oy.P(parcel, readInt15);
                    } else if (c12 == 2) {
                        parcelFileDescriptor = (ParcelFileDescriptor) oy.V(parcel, readInt15, ParcelFileDescriptor.CREATOR);
                    } else if (c12 != 3) {
                        oy.ae(parcel, readInt15);
                    } else {
                        i22 = oy.P(parcel, readInt15);
                    }
                }
                oy.ad(parcel, R15);
                return new BitmapTeleporter(i2, parcelFileDescriptor, i22);
            case 15:
                int R16 = oy.R(parcel);
                String[] strArr = null;
                CursorWindow[] cursorWindowArr = null;
                Bundle bundle = null;
                int i23 = 0;
                int i24 = 0;
                while (parcel.dataPosition() < R16) {
                    int readInt16 = parcel.readInt();
                    char c13 = (char) readInt16;
                    if (c13 == 1) {
                        strArr = oy.aj(parcel, readInt16);
                    } else if (c13 == 2) {
                        cursorWindowArr = (CursorWindow[]) oy.ai(parcel, readInt16, CursorWindow.CREATOR);
                    } else if (c13 == 3) {
                        i24 = oy.P(parcel, readInt16);
                    } else if (c13 == 4) {
                        bundle = oy.T(parcel, readInt16);
                    } else if (c13 != 1000) {
                        oy.ae(parcel, readInt16);
                    } else {
                        i23 = oy.P(parcel, readInt16);
                    }
                }
                oy.ad(parcel, R16);
                DataHolder dataHolder = new DataHolder(i23, strArr, cursorWindowArr, i24, bundle);
                dataHolder.c = new Bundle();
                int i25 = 0;
                while (true) {
                    String[] strArr2 = dataHolder.b;
                    if (i25 >= strArr2.length) {
                        CursorWindow[] cursorWindowArr2 = dataHolder.d;
                        dataHolder.g = new int[cursorWindowArr2.length];
                        int i26 = 0;
                        for (int i27 = 0; i27 < cursorWindowArr2.length; i27++) {
                            dataHolder.g[i27] = i26;
                            i26 += cursorWindowArr2[i27].getNumRows() - (i26 - cursorWindowArr2[i27].getStartPosition());
                        }
                        dataHolder.h = i26;
                        return dataHolder;
                    }
                    dataHolder.c.putInt(strArr2[i25], i25);
                    i25++;
                }
            case 16:
                int R17 = oy.R(parcel);
                long j4 = 0;
                String str14 = null;
                int i28 = 0;
                int i29 = 0;
                boolean z17 = false;
                while (parcel.dataPosition() < R17) {
                    int readInt17 = parcel.readInt();
                    char c14 = (char) readInt17;
                    if (c14 == 1) {
                        i28 = oy.P(parcel, readInt17);
                    } else if (c14 == 2) {
                        str14 = oy.Z(parcel, readInt17);
                    } else if (c14 == 3) {
                        j4 = oy.S(parcel, readInt17);
                    } else if (c14 == 4) {
                        i29 = oy.P(parcel, readInt17);
                    } else if (c14 != 5) {
                        oy.ae(parcel, readInt17);
                    } else {
                        z17 = oy.af(parcel, readInt17);
                    }
                }
                oy.ad(parcel, R17);
                return new cpp(i28, str14, j4, i29, z17);
            case 17:
                int R18 = oy.R(parcel);
                int i30 = 0;
                while (parcel.dataPosition() < R18) {
                    int readInt18 = parcel.readInt();
                    char c15 = (char) readInt18;
                    if (c15 == 1) {
                        i = oy.P(parcel, readInt18);
                    } else if (c15 == 2) {
                        str2 = oy.Z(parcel, readInt18);
                    } else if (c15 != 3) {
                        oy.ae(parcel, readInt18);
                    } else {
                        i30 = oy.P(parcel, readInt18);
                    }
                }
                oy.ad(parcel, R18);
                return new cps(i, str2, i30);
            case 18:
                int R19 = oy.R(parcel);
                while (parcel.dataPosition() < R19) {
                    int readInt19 = parcel.readInt();
                    if (((char) readInt19) != 1) {
                        oy.ae(parcel, readInt19);
                    } else {
                        arrayList = oy.ac(parcel, readInt19, cps.CREATOR);
                    }
                }
                oy.ad(parcel, R19);
                return new cpt(arrayList);
            case 19:
                int R20 = oy.R(parcel);
                Bundle bundle2 = null;
                cli[] cliVarArr = null;
                cpw cpwVar = null;
                cpx cpxVar = null;
                int i31 = 0;
                while (parcel.dataPosition() < R20) {
                    int readInt20 = parcel.readInt();
                    char c16 = (char) readInt20;
                    if (c16 == 1) {
                        bundle2 = oy.T(parcel, readInt20);
                    } else if (c16 == 2) {
                        cliVarArr = (cli[]) oy.ai(parcel, readInt20, cli.CREATOR);
                    } else if (c16 == 3) {
                        i31 = oy.P(parcel, readInt20);
                    } else if (c16 == 4) {
                        cpwVar = (cpw) oy.V(parcel, readInt20, cpw.CREATOR);
                    } else if (c16 != 5) {
                        oy.ae(parcel, readInt20);
                    } else {
                        cpxVar = (cpx) oy.V(parcel, readInt20, cpx.CREATOR);
                    }
                }
                oy.ad(parcel, R20);
                return new cpv(bundle2, cliVarArr, i31, cpwVar, cpxVar);
            default:
                int R21 = oy.R(parcel);
                cre creVar = null;
                int[] iArr = null;
                int[] iArr2 = null;
                boolean z18 = false;
                boolean z19 = false;
                int i32 = 0;
                while (parcel.dataPosition() < R21) {
                    int readInt21 = parcel.readInt();
                    switch ((char) readInt21) {
                        case 1:
                            creVar = (cre) oy.V(parcel, readInt21, cre.CREATOR);
                            break;
                        case 2:
                            z18 = oy.af(parcel, readInt21);
                            break;
                        case 3:
                            z19 = oy.af(parcel, readInt21);
                            break;
                        case 4:
                            iArr = oy.ah(parcel, readInt21);
                            break;
                        case 5:
                            i32 = oy.P(parcel, readInt21);
                            break;
                        case 6:
                            iArr2 = oy.ah(parcel, readInt21);
                            break;
                        default:
                            oy.ae(parcel, readInt21);
                            break;
                    }
                }
                oy.ad(parcel, R21);
                return new cpw(creVar, z18, z19, iArr, i32, iArr2);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        switch (this.b) {
            case 0:
                return new ckp[i];
            case 1:
                return new ckn[i];
            case 2:
                return new ckr[i];
            case 3:
                return new clc[i];
            case 4:
                return new cld[i];
            case 5:
                return new clg[i];
            case 6:
                return new cli[i];
            case 7:
                return new clx[i];
            case 8:
                return new cly[i];
            case 9:
                return new clz[i];
            case 10:
                return new cmn[i];
            case 11:
                return new cmp[i];
            case UrlRequest.Status.SENDING_REQUEST /* 12 */:
                return new Scope[i];
            case UrlRequest.Status.WAITING_FOR_RESPONSE /* 13 */:
                return new Status[i];
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                return new BitmapTeleporter[i];
            case 15:
                return new DataHolder[i];
            case 16:
                return new cpp[i];
            case 17:
                return new cps[i];
            case 18:
                return new cpt[i];
            case 19:
                return new cpv[i];
            default:
                return new cpw[i];
        }
    }
}
