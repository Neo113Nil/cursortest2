package defpackage;

import android.accounts.Account;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.people.contactssync.model.DeviceContactsSyncSetting;
import com.google.android.gms.people.contactssync.model.TetheredContactsSyncRequest;
import com.google.android.gms.people.contactssync.model.TetheredSyncStatus;
import com.google.android.gms.people.cpg.CpgDocument;
import com.google.android.gms.people.cpg.actionpreferences.RawContactActionPreference;
import com.google.android.gms.people.cpg.callingcard.CallingCardIdentifier;
import com.google.android.gms.people.cpg.callingcard.CallingCardRequestStatus;
import com.google.android.gms.people.cpg.callingcard.GetCallingCardResponse;
import com.google.android.gms.people.cpg.callingcard.v2.Identifier;
import java.util.ArrayList;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ctt implements Parcelable.Creator {
    private final /* synthetic */ int a;

    public ctt(int i) {
        this.a = i;
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        long j = 0;
        float f = 0.0f;
        int i = 0;
        ctu ctuVar = null;
        CallingCardRequestStatus callingCardRequestStatus = null;
        Long l = null;
        String str = null;
        CallingCardRequestStatus callingCardRequestStatus2 = null;
        czx czxVar = null;
        String str2 = null;
        czw czwVar = null;
        String str3 = null;
        String str4 = null;
        Account account = null;
        switch (this.a) {
            case 0:
                int R = oy.R(parcel);
                byte[] bArr = null;
                while (parcel.dataPosition() < R) {
                    int readInt = parcel.readInt();
                    char c = (char) readInt;
                    if (c == 2) {
                        ctuVar = (ctu) oy.V(parcel, readInt, ctu.CREATOR);
                    } else if (c != 3) {
                        oy.ae(parcel, readInt);
                    } else {
                        bArr = oy.ag(parcel, readInt);
                    }
                }
                oy.ad(parcel, R);
                return new cts(ctuVar, bArr);
            case 1:
                int R2 = oy.R(parcel);
                while (parcel.dataPosition() < R2) {
                    int readInt2 = parcel.readInt();
                    char c2 = (char) readInt2;
                    if (c2 == 1) {
                        i = oy.P(parcel, readInt2);
                    } else if (c2 != 2) {
                        oy.ae(parcel, readInt2);
                    } else {
                        account = (Account) oy.V(parcel, readInt2, Account.CREATOR);
                    }
                }
                oy.ad(parcel, R2);
                return new DeviceContactsSyncSetting(i, account);
            case 2:
                int R3 = oy.R(parcel);
                long j2 = 0;
                int i2 = 0;
                int i3 = 0;
                int i4 = 0;
                int i5 = 0;
                int i6 = 0;
                int i7 = 0;
                int i8 = 0;
                String str5 = null;
                while (parcel.dataPosition() < R3) {
                    int readInt3 = parcel.readInt();
                    switch ((char) readInt3) {
                        case 2:
                            i2 = oy.P(parcel, readInt3);
                            break;
                        case 3:
                            str5 = oy.Z(parcel, readInt3);
                            break;
                        case 4:
                            j2 = oy.S(parcel, readInt3);
                            break;
                        case 5:
                            i3 = oy.P(parcel, readInt3);
                            break;
                        case 6:
                            i4 = oy.P(parcel, readInt3);
                            break;
                        case 7:
                            i5 = oy.P(parcel, readInt3);
                            break;
                        case '\b':
                            i6 = oy.P(parcel, readInt3);
                            break;
                        case '\t':
                            i7 = oy.P(parcel, readInt3);
                            break;
                        case '\n':
                            i8 = oy.P(parcel, readInt3);
                            break;
                        default:
                            oy.ae(parcel, readInt3);
                            break;
                    }
                }
                oy.ad(parcel, R3);
                return new czs(i2, str5, j2, i3, i4, i5, i6, i7, i8);
            case 3:
                int R4 = oy.R(parcel);
                czp czpVar = null;
                while (parcel.dataPosition() < R4) {
                    int readInt4 = parcel.readInt();
                    char c3 = (char) readInt4;
                    if (c3 == 1) {
                        i = oy.P(parcel, readInt4);
                    } else if (c3 == 2) {
                        str4 = oy.Z(parcel, readInt4);
                    } else if (c3 != 3) {
                        oy.ae(parcel, readInt4);
                    } else {
                        czpVar = (czp) oy.V(parcel, readInt4, czp.CREATOR);
                    }
                }
                oy.ad(parcel, R4);
                return new czt(i, str4, czpVar);
            case 4:
                int R5 = oy.R(parcel);
                while (parcel.dataPosition() < R5) {
                    oy.ae(parcel, parcel.readInt());
                }
                oy.ad(parcel, R5);
                return new czu();
            case 5:
                int R6 = oy.R(parcel);
                boolean z = false;
                while (parcel.dataPosition() < R6) {
                    int readInt5 = parcel.readInt();
                    char c4 = (char) readInt5;
                    if (c4 == 2) {
                        i = oy.P(parcel, readInt5);
                    } else if (c4 != 3) {
                        oy.ae(parcel, readInt5);
                    } else {
                        z = oy.af(parcel, readInt5);
                    }
                }
                oy.ad(parcel, R6);
                return new TetheredContactsSyncRequest(i, z);
            case 6:
                int R7 = oy.R(parcel);
                while (parcel.dataPosition() < R7) {
                    int readInt6 = parcel.readInt();
                    char c5 = (char) readInt6;
                    if (c5 == 2) {
                        i = oy.P(parcel, readInt6);
                    } else if (c5 != 3) {
                        oy.ae(parcel, readInt6);
                    } else {
                        str3 = oy.Z(parcel, readInt6);
                    }
                }
                oy.ad(parcel, R7);
                return new TetheredSyncStatus(i, str3);
            case 7:
                int R8 = oy.R(parcel);
                long j3 = 0;
                int i9 = 0;
                int i10 = 0;
                int i11 = 0;
                String str6 = null;
                String str7 = null;
                String str8 = null;
                while (parcel.dataPosition() < R8) {
                    int readInt7 = parcel.readInt();
                    switch ((char) readInt7) {
                        case 1:
                            str6 = oy.Z(parcel, readInt7);
                            break;
                        case 2:
                            i9 = oy.P(parcel, readInt7);
                            break;
                        case 3:
                            i10 = oy.P(parcel, readInt7);
                            break;
                        case 4:
                            str7 = oy.Z(parcel, readInt7);
                            break;
                        case 5:
                            str8 = oy.Z(parcel, readInt7);
                            break;
                        case 6:
                            i11 = oy.P(parcel, readInt7);
                            break;
                        case 7:
                            j3 = oy.S(parcel, readInt7);
                            break;
                        default:
                            oy.ae(parcel, readInt7);
                            break;
                    }
                }
                oy.ad(parcel, R8);
                return new czv(str6, i9, i10, str7, str8, i11, j3);
            case 8:
                int R9 = oy.R(parcel);
                czv czvVar = null;
                while (parcel.dataPosition() < R9) {
                    int readInt8 = parcel.readInt();
                    char c6 = (char) readInt8;
                    if (c6 == 1) {
                        i = oy.P(parcel, readInt8);
                    } else if (c6 == 2) {
                        czwVar = (czw) oy.V(parcel, readInt8, czw.CREATOR);
                    } else if (c6 != 3) {
                        oy.ae(parcel, readInt8);
                    } else {
                        czvVar = (czv) oy.V(parcel, readInt8, czv.CREATOR);
                    }
                }
                oy.ad(parcel, R9);
                return new CpgDocument(i, czwVar, czvVar);
            case 9:
                int R10 = oy.R(parcel);
                ArrayList arrayList = null;
                while (parcel.dataPosition() < R10) {
                    int readInt9 = parcel.readInt();
                    char c7 = (char) readInt9;
                    if (c7 == 1) {
                        str2 = oy.Z(parcel, readInt9);
                    } else if (c7 == 2) {
                        arrayList = oy.aa(parcel, readInt9);
                    } else if (c7 != 3) {
                        oy.ae(parcel, readInt9);
                    } else {
                        j = oy.S(parcel, readInt9);
                    }
                }
                oy.ad(parcel, R10);
                return new czw(str2, arrayList, j);
            case 10:
                int R11 = oy.R(parcel);
                long j4 = 0;
                long j5 = 0;
                int i12 = 0;
                int i13 = 0;
                String str9 = null;
                String str10 = null;
                String str11 = null;
                String str12 = null;
                while (parcel.dataPosition() < R11) {
                    int readInt10 = parcel.readInt();
                    switch ((char) readInt10) {
                        case 1:
                            j4 = oy.S(parcel, readInt10);
                            break;
                        case 2:
                            i12 = oy.P(parcel, readInt10);
                            break;
                        case 3:
                            str9 = oy.Z(parcel, readInt10);
                            break;
                        case 4:
                            i13 = oy.P(parcel, readInt10);
                            break;
                        case 5:
                            str10 = oy.Z(parcel, readInt10);
                            break;
                        case 6:
                            str11 = oy.Z(parcel, readInt10);
                            break;
                        case 7:
                            str12 = oy.Z(parcel, readInt10);
                            break;
                        case '\b':
                            j5 = oy.S(parcel, readInt10);
                            break;
                        default:
                            oy.ae(parcel, readInt10);
                            break;
                    }
                }
                oy.ad(parcel, R11);
                return new RawContactActionPreference(j4, i12, str9, i13, str10, str11, str12, j5);
            case 11:
                int R12 = oy.R(parcel);
                float f2 = 0.0f;
                float f3 = 0.0f;
                float f4 = 0.0f;
                float f5 = 0.0f;
                float f6 = 0.0f;
                float f7 = 0.0f;
                float f8 = 0.0f;
                int i14 = 0;
                int i15 = 0;
                while (parcel.dataPosition() < R12) {
                    int readInt11 = parcel.readInt();
                    switch ((char) readInt11) {
                        case 1:
                            f2 = oy.O(parcel, readInt11);
                            break;
                        case 2:
                            f3 = oy.O(parcel, readInt11);
                            break;
                        case 3:
                            f4 = oy.O(parcel, readInt11);
                            break;
                        case 4:
                            f5 = oy.O(parcel, readInt11);
                            break;
                        case 5:
                            f6 = oy.O(parcel, readInt11);
                            break;
                        case 6:
                            f7 = oy.O(parcel, readInt11);
                            break;
                        case 7:
                            i14 = oy.P(parcel, readInt11);
                            break;
                        case '\b':
                            i15 = oy.P(parcel, readInt11);
                            break;
                        case '\t':
                            f8 = oy.O(parcel, readInt11);
                            break;
                        default:
                            oy.ae(parcel, readInt11);
                            break;
                    }
                }
                oy.ad(parcel, R12);
                return new czx(f2, f3, f4, f5, f6, f7, i14, i15, f8);
            case UrlRequest.Status.SENDING_REQUEST /* 12 */:
                int R13 = oy.R(parcel);
                float f9 = 0.0f;
                float f10 = 0.0f;
                while (parcel.dataPosition() < R13) {
                    int readInt12 = parcel.readInt();
                    char c8 = (char) readInt12;
                    if (c8 == 1) {
                        f = oy.O(parcel, readInt12);
                    } else if (c8 == 2) {
                        f9 = oy.O(parcel, readInt12);
                    } else if (c8 != 3) {
                        oy.ae(parcel, readInt12);
                    } else {
                        f10 = oy.O(parcel, readInt12);
                    }
                }
                oy.ad(parcel, R13);
                return new czy(f, f9, f10);
            case UrlRequest.Status.WAITING_FOR_RESPONSE /* 13 */:
                int R14 = oy.R(parcel);
                while (parcel.dataPosition() < R14) {
                    int readInt13 = parcel.readInt();
                    if (((char) readInt13) != 1) {
                        oy.ae(parcel, readInt13);
                    } else {
                        j = oy.S(parcel, readInt13);
                    }
                }
                oy.ad(parcel, R14);
                return new CallingCardIdentifier(j);
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                int R15 = oy.R(parcel);
                czy czyVar = null;
                while (parcel.dataPosition() < R15) {
                    int readInt14 = parcel.readInt();
                    char c9 = (char) readInt14;
                    if (c9 == 1) {
                        czxVar = (czx) oy.V(parcel, readInt14, czx.CREATOR);
                    } else if (c9 != 2) {
                        oy.ae(parcel, readInt14);
                    } else {
                        czyVar = (czy) oy.V(parcel, readInt14, czy.CREATOR);
                    }
                }
                oy.ad(parcel, R15);
                return new czz(czxVar, czyVar);
            case 15:
                int R16 = oy.R(parcel);
                while (parcel.dataPosition() < R16) {
                    int readInt15 = parcel.readInt();
                    if (((char) readInt15) != 1) {
                        oy.ae(parcel, readInt15);
                    } else {
                        i = oy.P(parcel, readInt15);
                    }
                }
                oy.ad(parcel, R16);
                return new CallingCardRequestStatus(i);
            case 16:
                int R17 = oy.R(parcel);
                CallingCardIdentifier callingCardIdentifier = null;
                while (parcel.dataPosition() < R17) {
                    int readInt16 = parcel.readInt();
                    char c10 = (char) readInt16;
                    if (c10 == 1) {
                        callingCardRequestStatus2 = (CallingCardRequestStatus) oy.V(parcel, readInt16, CallingCardRequestStatus.CREATOR);
                    } else if (c10 != 2) {
                        oy.ae(parcel, readInt16);
                    } else {
                        callingCardIdentifier = (CallingCardIdentifier) oy.V(parcel, readInt16, CallingCardIdentifier.CREATOR);
                    }
                }
                oy.ad(parcel, R17);
                return new daa(callingCardRequestStatus2, callingCardIdentifier);
            case 17:
                int R18 = oy.R(parcel);
                int i16 = 0;
                CallingCardRequestStatus callingCardRequestStatus3 = null;
                Uri uri = null;
                String str13 = null;
                czz czzVar = null;
                while (parcel.dataPosition() < R18) {
                    int readInt17 = parcel.readInt();
                    char c11 = (char) readInt17;
                    if (c11 == 1) {
                        callingCardRequestStatus3 = (CallingCardRequestStatus) oy.V(parcel, readInt17, CallingCardRequestStatus.CREATOR);
                    } else if (c11 == 2) {
                        i16 = oy.P(parcel, readInt17);
                    } else if (c11 == 3) {
                        uri = (Uri) oy.V(parcel, readInt17, Uri.CREATOR);
                    } else if (c11 == 4) {
                        str13 = oy.Z(parcel, readInt17);
                    } else if (c11 != 5) {
                        oy.ae(parcel, readInt17);
                    } else {
                        czzVar = (czz) oy.V(parcel, readInt17, czz.CREATOR);
                    }
                }
                oy.ad(parcel, R18);
                return new GetCallingCardResponse(callingCardRequestStatus3, i16, uri, str13, czzVar);
            case 18:
                int R19 = oy.R(parcel);
                String str14 = null;
                String str15 = null;
                while (parcel.dataPosition() < R19) {
                    int readInt18 = parcel.readInt();
                    char c12 = (char) readInt18;
                    if (c12 == 1) {
                        str = oy.Z(parcel, readInt18);
                    } else if (c12 == 2) {
                        str14 = oy.Z(parcel, readInt18);
                    } else if (c12 != 3) {
                        oy.ae(parcel, readInt18);
                    } else {
                        str15 = oy.Z(parcel, readInt18);
                    }
                }
                oy.ad(parcel, R19);
                return new dab(str, str14, str15);
            case 19:
                int R20 = oy.R(parcel);
                String str16 = null;
                dab dabVar = null;
                while (parcel.dataPosition() < R20) {
                    int readInt19 = parcel.readInt();
                    char c13 = (char) readInt19;
                    if (c13 == 1) {
                        i = oy.P(parcel, readInt19);
                    } else if (c13 == 2) {
                        l = oy.Y(parcel, readInt19);
                    } else if (c13 == 3) {
                        str16 = oy.Z(parcel, readInt19);
                    } else if (c13 != 4) {
                        oy.ae(parcel, readInt19);
                    } else {
                        dabVar = (dab) oy.V(parcel, readInt19, dab.CREATOR);
                    }
                }
                oy.ad(parcel, R20);
                return new Identifier(i, l, str16, dabVar);
            default:
                int R21 = oy.R(parcel);
                Identifier identifier = null;
                while (parcel.dataPosition() < R21) {
                    int readInt20 = parcel.readInt();
                    char c14 = (char) readInt20;
                    if (c14 == 1) {
                        callingCardRequestStatus = (CallingCardRequestStatus) oy.V(parcel, readInt20, CallingCardRequestStatus.CREATOR);
                    } else if (c14 != 2) {
                        oy.ae(parcel, readInt20);
                    } else {
                        identifier = (Identifier) oy.V(parcel, readInt20, Identifier.CREATOR);
                    }
                }
                oy.ad(parcel, R21);
                return new dac(callingCardRequestStatus, identifier);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        switch (this.a) {
            case 0:
                return new cts[i];
            case 1:
                return new DeviceContactsSyncSetting[i];
            case 2:
                return new czs[i];
            case 3:
                return new czt[i];
            case 4:
                return new czu[i];
            case 5:
                return new TetheredContactsSyncRequest[i];
            case 6:
                return new TetheredSyncStatus[i];
            case 7:
                return new czv[i];
            case 8:
                return new CpgDocument[i];
            case 9:
                return new czw[i];
            case 10:
                return new RawContactActionPreference[i];
            case 11:
                return new czx[i];
            case UrlRequest.Status.SENDING_REQUEST /* 12 */:
                return new czy[i];
            case UrlRequest.Status.WAITING_FOR_RESPONSE /* 13 */:
                return new CallingCardIdentifier[i];
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                return new czz[i];
            case 15:
                return new CallingCardRequestStatus[i];
            case 16:
                return new daa[i];
            case 17:
                return new GetCallingCardResponse[i];
            case 18:
                return new dab[i];
            case 19:
                return new Identifier[i];
            default:
                return new dac[i];
        }
    }
}
