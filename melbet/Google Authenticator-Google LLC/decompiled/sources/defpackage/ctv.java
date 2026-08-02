package defpackage;

import android.database.MatrixCursor;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.people.cpg.cpgex.Account;
import com.google.android.gms.people.cpg.cpgex.Cp2Identifier;
import com.google.android.gms.people.cpg.cpgex.CpgExDataContents;
import com.google.android.gms.people.cpg.cpgex.CpgExDataOperationResult;
import com.google.android.gms.people.cpg.cpgex.CpgExDataViewResult;
import com.google.android.gms.people.cpg.cpgex.CpgExRequestStatus;
import com.google.android.gms.people.cpg.cpgex.GetCpgExDataViewByIdentifierResponse;
import com.google.android.gms.people.cpg.cpgex.Identifier;
import com.google.android.gms.people.cpg.cpgex.MutateCpgExDataResponse;
import java.util.ArrayList;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ctv implements Parcelable.Creator {
    private final /* synthetic */ int a;

    public ctv(int i) {
        this.a = i;
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        long j = 0;
        int i = 0;
        String str = null;
        String str2 = null;
        dba dbaVar = null;
        dba dbaVar2 = null;
        Boolean bool = null;
        dba dbaVar3 = null;
        Integer num = null;
        dba dbaVar4 = null;
        String str3 = null;
        MatrixCursor matrixCursor = null;
        CpgExRequestStatus cpgExRequestStatus = null;
        Account account = null;
        CpgExRequestStatus cpgExRequestStatus2 = null;
        CpgExRequestStatus cpgExRequestStatus3 = null;
        CpgExRequestStatus cpgExRequestStatus4 = null;
        String str4 = null;
        switch (this.a) {
            case 0:
                int R = oy.R(parcel);
                int i2 = 0;
                boolean z = false;
                String str5 = null;
                String str6 = null;
                String[] strArr = null;
                while (parcel.dataPosition() < R) {
                    int readInt = parcel.readInt();
                    char c = (char) readInt;
                    if (c == 2) {
                        str5 = oy.Z(parcel, readInt);
                    } else if (c == 3) {
                        strArr = oy.aj(parcel, readInt);
                    } else if (c == 4) {
                        i2 = oy.P(parcel, readInt);
                    } else if (c == 5) {
                        z = oy.af(parcel, readInt);
                    } else if (c != 6) {
                        oy.ae(parcel, readInt);
                    } else {
                        str6 = oy.Z(parcel, readInt);
                    }
                }
                oy.ad(parcel, R);
                return new ctu(str5, str6, strArr, i2, z);
            case 1:
                int R2 = oy.R(parcel);
                String str7 = null;
                String str8 = null;
                while (parcel.dataPosition() < R2) {
                    int readInt2 = parcel.readInt();
                    char c2 = (char) readInt2;
                    if (c2 == 1) {
                        str = oy.Z(parcel, readInt2);
                    } else if (c2 == 2) {
                        str7 = oy.Z(parcel, readInt2);
                    } else if (c2 != 3) {
                        oy.ae(parcel, readInt2);
                    } else {
                        str8 = oy.Z(parcel, readInt2);
                    }
                }
                oy.ad(parcel, R2);
                return new Account(str, str7, str8);
            case 2:
                int R3 = oy.R(parcel);
                while (parcel.dataPosition() < R3) {
                    int readInt3 = parcel.readInt();
                    char c3 = (char) readInt3;
                    if (c3 == 1) {
                        j = oy.S(parcel, readInt3);
                    } else if (c3 != 2) {
                        oy.ae(parcel, readInt3);
                    } else {
                        str4 = oy.Z(parcel, readInt3);
                    }
                }
                oy.ad(parcel, R3);
                return new Cp2Identifier(j, str4);
            case 3:
                int R4 = oy.R(parcel);
                Long l = null;
                Long l2 = null;
                while (parcel.dataPosition() < R4) {
                    int readInt4 = parcel.readInt();
                    char c4 = (char) readInt4;
                    if (c4 == 1) {
                        cpgExRequestStatus4 = (CpgExRequestStatus) oy.V(parcel, readInt4, CpgExRequestStatus.CREATOR);
                    } else if (c4 == 2) {
                        l = oy.Y(parcel, readInt4);
                    } else if (c4 != 3) {
                        oy.ae(parcel, readInt4);
                    } else {
                        l2 = oy.Y(parcel, readInt4);
                    }
                }
                oy.ad(parcel, R4);
                return new CpgExDataOperationResult(cpgExRequestStatus4, l, l2);
            case 4:
                int R5 = oy.R(parcel);
                Identifier identifier = null;
                CpgExDataContents cpgExDataContents = null;
                while (parcel.dataPosition() < R5) {
                    int readInt5 = parcel.readInt();
                    char c5 = (char) readInt5;
                    if (c5 == 1) {
                        cpgExRequestStatus3 = (CpgExRequestStatus) oy.V(parcel, readInt5, CpgExRequestStatus.CREATOR);
                    } else if (c5 == 2) {
                        identifier = (Identifier) oy.V(parcel, readInt5, Identifier.CREATOR);
                    } else if (c5 != 3) {
                        oy.ae(parcel, readInt5);
                    } else {
                        cpgExDataContents = (CpgExDataContents) oy.V(parcel, readInt5, CpgExDataContents.CREATOR);
                    }
                }
                oy.ad(parcel, R5);
                return new CpgExDataViewResult(cpgExRequestStatus3, identifier, cpgExDataContents);
            case 5:
                int R6 = oy.R(parcel);
                while (parcel.dataPosition() < R6) {
                    int readInt6 = parcel.readInt();
                    if (((char) readInt6) != 1) {
                        oy.ae(parcel, readInt6);
                    } else {
                        i = oy.P(parcel, readInt6);
                    }
                }
                oy.ad(parcel, R6);
                return new CpgExRequestStatus(i);
            case 6:
                int R7 = oy.R(parcel);
                ArrayList arrayList = null;
                while (parcel.dataPosition() < R7) {
                    int readInt7 = parcel.readInt();
                    char c6 = (char) readInt7;
                    if (c6 == 1) {
                        cpgExRequestStatus2 = (CpgExRequestStatus) oy.V(parcel, readInt7, CpgExRequestStatus.CREATOR);
                    } else if (c6 != 2) {
                        oy.ae(parcel, readInt7);
                    } else {
                        arrayList = oy.ac(parcel, readInt7, CpgExDataViewResult.CREATOR);
                    }
                }
                oy.ad(parcel, R7);
                return new GetCpgExDataViewByIdentifierResponse(cpgExRequestStatus2, arrayList);
            case 7:
                int R8 = oy.R(parcel);
                Long l3 = null;
                Long l4 = null;
                Cp2Identifier cp2Identifier = null;
                while (parcel.dataPosition() < R8) {
                    int readInt8 = parcel.readInt();
                    char c7 = (char) readInt8;
                    if (c7 == 1) {
                        account = (Account) oy.V(parcel, readInt8, Account.CREATOR);
                    } else if (c7 == 2) {
                        l3 = oy.Y(parcel, readInt8);
                    } else if (c7 == 3) {
                        l4 = oy.Y(parcel, readInt8);
                    } else if (c7 != 4) {
                        oy.ae(parcel, readInt8);
                    } else {
                        cp2Identifier = (Cp2Identifier) oy.V(parcel, readInt8, Cp2Identifier.CREATOR);
                    }
                }
                oy.ad(parcel, R8);
                return new Identifier(account, l3, l4, cp2Identifier);
            case 8:
                int R9 = oy.R(parcel);
                ArrayList arrayList2 = null;
                while (parcel.dataPosition() < R9) {
                    int readInt9 = parcel.readInt();
                    char c8 = (char) readInt9;
                    if (c8 == 1) {
                        cpgExRequestStatus = (CpgExRequestStatus) oy.V(parcel, readInt9, CpgExRequestStatus.CREATOR);
                    } else if (c8 != 2) {
                        oy.ae(parcel, readInt9);
                    } else {
                        arrayList2 = oy.ac(parcel, readInt9, CpgExDataOperationResult.CREATOR);
                    }
                }
                oy.ad(parcel, R9);
                return new MutateCpgExDataResponse(cpgExRequestStatus, arrayList2);
            case 9:
                int readInt10 = parcel.readInt();
                String[] strArr2 = new String[readInt10];
                parcel.readStringArray(strArr2);
                int readInt11 = parcel.readInt();
                MatrixCursor matrixCursor2 = new MatrixCursor(strArr2);
                if (readInt10 != 0 || readInt11 != 0) {
                    while (i < readInt11) {
                        matrixCursor2.addRow(parcel.readArray(Object.class.getClassLoader()));
                        i++;
                    }
                    matrixCursor = matrixCursor2;
                }
                return new dag(matrixCursor);
            case 10:
                int R10 = oy.R(parcel);
                while (parcel.dataPosition() < R10) {
                    int readInt12 = parcel.readInt();
                    char c9 = (char) readInt12;
                    if (c9 == 2) {
                        i = oy.P(parcel, readInt12);
                    } else if (c9 == 3) {
                        str3 = oy.Z(parcel, readInt12);
                    } else if (c9 != 4) {
                        oy.ae(parcel, readInt12);
                    } else {
                        j = oy.S(parcel, readInt12);
                    }
                }
                oy.ad(parcel, R10);
                return new dao(i, str3, j);
            case 11:
                int R11 = oy.R(parcel);
                String str9 = null;
                Long l5 = null;
                ArrayList arrayList3 = null;
                String str10 = null;
                Long l6 = null;
                Long l7 = null;
                daw dawVar = null;
                while (parcel.dataPosition() < R11) {
                    int readInt13 = parcel.readInt();
                    switch ((char) readInt13) {
                        case 2:
                            str9 = oy.Z(parcel, readInt13);
                            break;
                        case 3:
                            arrayList3 = oy.ac(parcel, readInt13, dbd.CREATOR);
                            break;
                        case 4:
                            str10 = oy.Z(parcel, readInt13);
                            break;
                        case 5:
                            l6 = oy.Y(parcel, readInt13);
                            break;
                        case 6:
                            l7 = oy.Y(parcel, readInt13);
                            break;
                        case 7:
                            l5 = oy.Y(parcel, readInt13);
                            break;
                        case '\b':
                            dawVar = (daw) oy.V(parcel, readInt13, daw.CREATOR);
                            break;
                        default:
                            oy.ae(parcel, readInt13);
                            break;
                    }
                }
                oy.ad(parcel, R11);
                return new dau(str9, l5, arrayList3, str10, l6, l7, dawVar);
            case UrlRequest.Status.SENDING_REQUEST /* 12 */:
                int R12 = oy.R(parcel);
                Long l8 = null;
                while (parcel.dataPosition() < R12) {
                    int readInt14 = parcel.readInt();
                    char c10 = (char) readInt14;
                    if (c10 == 2) {
                        dbaVar4 = (dba) oy.V(parcel, readInt14, dba.CREATOR);
                    } else if (c10 != 3) {
                        oy.ae(parcel, readInt14);
                    } else {
                        l8 = oy.Y(parcel, readInt14);
                    }
                }
                oy.ad(parcel, R12);
                return new dav(dbaVar4, l8);
            case UrlRequest.Status.WAITING_FOR_RESPONSE /* 13 */:
                int R13 = oy.R(parcel);
                while (parcel.dataPosition() < R13) {
                    int readInt15 = parcel.readInt();
                    if (((char) readInt15) != 2) {
                        oy.ae(parcel, readInt15);
                    } else {
                        num = oy.X(parcel, readInt15);
                    }
                }
                oy.ad(parcel, R13);
                return new daw(num);
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                int R14 = oy.R(parcel);
                String str11 = null;
                while (parcel.dataPosition() < R14) {
                    int readInt16 = parcel.readInt();
                    char c11 = (char) readInt16;
                    if (c11 == 2) {
                        dbaVar3 = (dba) oy.V(parcel, readInt16, dba.CREATOR);
                    } else if (c11 != 3) {
                        oy.ae(parcel, readInt16);
                    } else {
                        str11 = oy.Z(parcel, readInt16);
                    }
                }
                oy.ad(parcel, R14);
                return new dax(dbaVar3, str11);
            case 15:
                int R15 = oy.R(parcel);
                dba dbaVar5 = null;
                String str12 = null;
                String str13 = null;
                String str14 = null;
                String str15 = null;
                String str16 = null;
                String str17 = null;
                while (parcel.dataPosition() < R15) {
                    int readInt17 = parcel.readInt();
                    char c12 = (char) readInt17;
                    if (c12 != 17) {
                        switch (c12) {
                            case 2:
                                dbaVar5 = (dba) oy.V(parcel, readInt17, dba.CREATOR);
                                break;
                            case 3:
                                str12 = oy.Z(parcel, readInt17);
                                break;
                            case 4:
                                str17 = oy.Z(parcel, readInt17);
                                break;
                            case 5:
                                str14 = oy.Z(parcel, readInt17);
                                break;
                            case 6:
                                str15 = oy.Z(parcel, readInt17);
                                break;
                            case 7:
                                str16 = oy.Z(parcel, readInt17);
                                break;
                            default:
                                oy.ae(parcel, readInt17);
                                break;
                        }
                    } else {
                        str13 = oy.Z(parcel, readInt17);
                    }
                }
                oy.ad(parcel, R15);
                return new day(dbaVar5, str12, str13, str14, str15, str16, str17);
            case 16:
                int R16 = oy.R(parcel);
                String str18 = null;
                ArrayList arrayList4 = null;
                ArrayList arrayList5 = null;
                ArrayList arrayList6 = null;
                ArrayList arrayList7 = null;
                ArrayList arrayList8 = null;
                ArrayList arrayList9 = null;
                while (parcel.dataPosition() < R16) {
                    int readInt18 = parcel.readInt();
                    char c13 = (char) readInt18;
                    if (c13 == 2) {
                        str18 = oy.Z(parcel, readInt18);
                    } else if (c13 == '\t') {
                        arrayList8 = oy.ac(parcel, readInt18, dav.CREATOR);
                    } else if (c13 == 11) {
                        arrayList6 = oy.ac(parcel, readInt18, dax.CREATOR);
                    } else if (c13 == '\r') {
                        arrayList7 = oy.ac(parcel, readInt18, dbb.CREATOR);
                    } else if (c13 == 148) {
                        arrayList9 = oy.ac(parcel, readInt18, dbc.CREATOR);
                    } else if (c13 == 4) {
                        arrayList4 = oy.ac(parcel, readInt18, day.CREATOR);
                    } else if (c13 != 5) {
                        oy.ae(parcel, readInt18);
                    } else {
                        arrayList5 = oy.ac(parcel, readInt18, dbc.CREATOR);
                    }
                }
                oy.ad(parcel, R16);
                return new daz(str18, arrayList4, arrayList5, arrayList6, arrayList7, arrayList8, arrayList9);
            case 17:
                int R17 = oy.R(parcel);
                int i3 = 3;
                while (parcel.dataPosition() < R17) {
                    int readInt19 = parcel.readInt();
                    char c14 = (char) readInt19;
                    if (c14 == 3) {
                        i3 = oy.X(parcel, readInt19);
                    } else if (c14 != 4) {
                        oy.ae(parcel, readInt19);
                    } else {
                        bool = oy.W(parcel, readInt19);
                    }
                }
                oy.ad(parcel, R17);
                return new dba(i3, bool);
            case 18:
                int R18 = oy.R(parcel);
                String str19 = null;
                String str20 = null;
                while (parcel.dataPosition() < R18) {
                    int readInt20 = parcel.readInt();
                    char c15 = (char) readInt20;
                    if (c15 == 2) {
                        dbaVar2 = (dba) oy.V(parcel, readInt20, dba.CREATOR);
                    } else if (c15 == 3) {
                        str19 = oy.Z(parcel, readInt20);
                    } else if (c15 != 4) {
                        oy.ae(parcel, readInt20);
                    } else {
                        str20 = oy.Z(parcel, readInt20);
                    }
                }
                oy.ad(parcel, R18);
                return new dbb(dbaVar2, str19, str20);
            case 19:
                int R19 = oy.R(parcel);
                String str21 = null;
                while (parcel.dataPosition() < R19) {
                    int readInt21 = parcel.readInt();
                    char c16 = (char) readInt21;
                    if (c16 == 2) {
                        dbaVar = (dba) oy.V(parcel, readInt21, dba.CREATOR);
                    } else if (c16 != 3) {
                        oy.ae(parcel, readInt21);
                    } else {
                        str21 = oy.Z(parcel, readInt21);
                    }
                }
                oy.ad(parcel, R19);
                return new dbc(dbaVar, str21);
            default:
                int R20 = oy.R(parcel);
                Integer num2 = null;
                Integer num3 = null;
                while (parcel.dataPosition() < R20) {
                    int readInt22 = parcel.readInt();
                    char c17 = (char) readInt22;
                    if (c17 == 2) {
                        str2 = oy.Z(parcel, readInt22);
                    } else if (c17 == 3) {
                        num2 = oy.X(parcel, readInt22);
                    } else if (c17 != 4) {
                        oy.ae(parcel, readInt22);
                    } else {
                        num3 = oy.X(parcel, readInt22);
                    }
                }
                oy.ad(parcel, R20);
                return new dbd(str2, num2, num3);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        switch (this.a) {
            case 0:
                return new ctu[i];
            case 1:
                return new Account[i];
            case 2:
                return new Cp2Identifier[i];
            case 3:
                return new CpgExDataOperationResult[i];
            case 4:
                return new CpgExDataViewResult[i];
            case 5:
                return new CpgExRequestStatus[i];
            case 6:
                return new GetCpgExDataViewByIdentifierResponse[i];
            case 7:
                return new Identifier[i];
            case 8:
                return new MutateCpgExDataResponse[i];
            case 9:
                return new dag[i];
            case 10:
                return new dao[i];
            case 11:
                return new dau[i];
            case UrlRequest.Status.SENDING_REQUEST /* 12 */:
                return new dav[i];
            case UrlRequest.Status.WAITING_FOR_RESPONSE /* 13 */:
                return new daw[i];
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                return new dax[i];
            case 15:
                return new day[i];
            case 16:
                return new daz[i];
            case 17:
                return new dba[i];
            case 18:
                return new dbb[i];
            case 19:
                return new dbc[i];
            default:
                return new dbd[i];
        }
    }
}
