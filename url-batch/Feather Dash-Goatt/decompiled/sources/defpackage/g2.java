package defpackage;

import android.accounts.Account;
import android.app.PendingIntent;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.versionedparcelable.ParcelImpl;
import com.android.installreferrer.api.InstallReferrerClient;
import com.appsflyer.attribution.RequestError;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.Status;
import java.util.ArrayList;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class g2 implements Parcelable.Creator {
    public final /* synthetic */ int a;

    public /* synthetic */ g2(int i) {
        this.a = i;
    }

    public static void a(r40 r40Var, Parcel parcel, int i) {
        int P = y90.P(parcel, 20293);
        int i2 = r40Var.d;
        y90.R(parcel, 1, 4);
        parcel.writeInt(i2);
        int i3 = r40Var.e;
        y90.R(parcel, 2, 4);
        parcel.writeInt(i3);
        int i4 = r40Var.g;
        y90.R(parcel, 3, 4);
        parcel.writeInt(i4);
        y90.M(parcel, 4, r40Var.h);
        IBinder iBinder = r40Var.i;
        if (iBinder != null) {
            int P2 = y90.P(parcel, 5);
            parcel.writeStrongBinder(iBinder);
            y90.Q(parcel, P2);
        }
        y90.N(parcel, 6, r40Var.j, i);
        y90.K(parcel, 7, r40Var.k);
        y90.L(parcel, 8, r40Var.l, i);
        y90.N(parcel, 10, r40Var.m, i);
        y90.N(parcel, 11, r40Var.n, i);
        boolean z = r40Var.o;
        y90.R(parcel, 12, 4);
        parcel.writeInt(z ? 1 : 0);
        int i5 = r40Var.p;
        y90.R(parcel, 13, 4);
        parcel.writeInt(i5);
        boolean z2 = r40Var.q;
        y90.R(parcel, 14, 4);
        parcel.writeInt(z2 ? 1 : 0);
        y90.M(parcel, 15, r40Var.r);
        y90.Q(parcel, P);
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int i = 0;
        Bundle bundle = null;
        Bundle bundle2 = null;
        String str = null;
        String str2 = null;
        PendingIntent pendingIntent = null;
        String str3 = null;
        Intent intent = null;
        Account account = null;
        fm fmVar = null;
        Intent intent2 = null;
        switch (this.a) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                return new h2(parcel);
            case 1:
                return new gq(parcel.readInt());
            case 2:
                parcel.getClass();
                return new fa0(parcel);
            case 3:
                return new ParcelImpl(parcel);
            case 4:
                return new wu0(parcel.readFloat());
            case ry0.STRING_FIELD_NUMBER /* 5 */:
                return new xu0(parcel.readInt());
            case ry0.STRING_SET_FIELD_NUMBER /* 6 */:
                return new yu0(parcel.readLong());
            case ry0.DOUBLE_FIELD_NUMBER /* 7 */:
                int F = t90.F(parcel);
                while (parcel.dataPosition() < F) {
                    int readInt = parcel.readInt();
                    if (((char) readInt) != 2) {
                        t90.E(parcel, readInt);
                    } else {
                        bundle = t90.h(parcel, readInt);
                    }
                }
                t90.m(parcel, F);
                return new o21(bundle);
            case ry0.BYTES_FIELD_NUMBER /* 8 */:
                int F2 = t90.F(parcel);
                while (true) {
                    ArrayList arrayList = null;
                    while (parcel.dataPosition() < F2) {
                        int readInt2 = parcel.readInt();
                        char c = (char) readInt2;
                        if (c == 1) {
                            i = t90.z(parcel, readInt2);
                        } else if (c != 2) {
                            t90.E(parcel, readInt2);
                        } else {
                            Parcelable.Creator<ul0> creator = ul0.CREATOR;
                            int A = t90.A(parcel, readInt2);
                            int dataPosition = parcel.dataPosition();
                            if (A == 0) {
                                break;
                            }
                            arrayList = parcel.createTypedArrayList(creator);
                            parcel.setDataPosition(dataPosition + A);
                        }
                    }
                    t90.m(parcel, F2);
                    return new rg1(i, arrayList);
                    break;
                }
            case 9:
                int F3 = t90.F(parcel);
                int i2 = 0;
                while (parcel.dataPosition() < F3) {
                    int readInt3 = parcel.readInt();
                    char c2 = (char) readInt3;
                    if (c2 == 1) {
                        i = t90.z(parcel, readInt3);
                    } else if (c2 == 2) {
                        i2 = t90.z(parcel, readInt3);
                    } else if (c2 != 3) {
                        t90.E(parcel, readInt3);
                    } else {
                        intent2 = (Intent) t90.i(parcel, readInt3, Intent.CREATOR);
                    }
                }
                t90.m(parcel, F3);
                return new as1(i, i2, intent2);
            case RequestError.EVENT_TIMEOUT /* 10 */:
                int F4 = t90.F(parcel);
                long j = 0;
                int i3 = 0;
                String str4 = null;
                String str5 = null;
                String str6 = null;
                String str7 = null;
                Uri uri = null;
                String str8 = null;
                String str9 = null;
                ArrayList arrayList2 = null;
                String str10 = null;
                String str11 = null;
                while (parcel.dataPosition() < F4) {
                    int readInt4 = parcel.readInt();
                    switch ((char) readInt4) {
                        case 1:
                            i3 = t90.z(parcel, readInt4);
                            break;
                        case 2:
                            str4 = t90.j(parcel, readInt4);
                            break;
                        case 3:
                            str5 = t90.j(parcel, readInt4);
                            break;
                        case 4:
                            str6 = t90.j(parcel, readInt4);
                            break;
                        case ry0.STRING_FIELD_NUMBER /* 5 */:
                            str7 = t90.j(parcel, readInt4);
                            break;
                        case ry0.STRING_SET_FIELD_NUMBER /* 6 */:
                            uri = (Uri) t90.i(parcel, readInt4, Uri.CREATOR);
                            break;
                        case ry0.DOUBLE_FIELD_NUMBER /* 7 */:
                            str8 = t90.j(parcel, readInt4);
                            break;
                        case ry0.BYTES_FIELD_NUMBER /* 8 */:
                            t90.G(parcel, readInt4, 8);
                            j = parcel.readLong();
                            break;
                        case '\t':
                            str9 = t90.j(parcel, readInt4);
                            break;
                        case RequestError.EVENT_TIMEOUT /* 10 */:
                            Parcelable.Creator<Scope> creator2 = Scope.CREATOR;
                            int A2 = t90.A(parcel, readInt4);
                            int dataPosition2 = parcel.dataPosition();
                            if (A2 != 0) {
                                ArrayList createTypedArrayList = parcel.createTypedArrayList(creator2);
                                parcel.setDataPosition(dataPosition2 + A2);
                                arrayList2 = createTypedArrayList;
                                break;
                            } else {
                                arrayList2 = null;
                                break;
                            }
                        case RequestError.STOP_TRACKING /* 11 */:
                            str10 = t90.j(parcel, readInt4);
                            break;
                        case '\f':
                            str11 = t90.j(parcel, readInt4);
                            break;
                        default:
                            t90.E(parcel, readInt4);
                            break;
                    }
                }
                t90.m(parcel, F4);
                return new GoogleSignInAccount(i3, str4, str5, str6, str7, uri, str8, j, str9, arrayList2, str10, str11);
            case RequestError.STOP_TRACKING /* 11 */:
                int F5 = t90.F(parcel);
                ArrayList<String> arrayList3 = null;
                String str12 = null;
                while (parcel.dataPosition() < F5) {
                    int readInt5 = parcel.readInt();
                    char c3 = (char) readInt5;
                    if (c3 == 1) {
                        int A3 = t90.A(parcel, readInt5);
                        int dataPosition3 = parcel.dataPosition();
                        if (A3 == 0) {
                            arrayList3 = null;
                        } else {
                            ArrayList<String> createStringArrayList = parcel.createStringArrayList();
                            parcel.setDataPosition(dataPosition3 + A3);
                            arrayList3 = createStringArrayList;
                        }
                    } else if (c3 != 2) {
                        t90.E(parcel, readInt5);
                    } else {
                        str12 = t90.j(parcel, readInt5);
                    }
                }
                t90.m(parcel, F5);
                return new ws1(str12, arrayList3);
            case 12:
                int F6 = t90.F(parcel);
                ht1 ht1Var = null;
                while (parcel.dataPosition() < F6) {
                    int readInt6 = parcel.readInt();
                    char c4 = (char) readInt6;
                    if (c4 == 1) {
                        i = t90.z(parcel, readInt6);
                    } else if (c4 == 2) {
                        fmVar = (fm) t90.i(parcel, readInt6, fm.CREATOR);
                    } else if (c4 != 3) {
                        t90.E(parcel, readInt6);
                    } else {
                        ht1Var = (ht1) t90.i(parcel, readInt6, ht1.CREATOR);
                    }
                }
                t90.m(parcel, F6);
                return new at1(i, fmVar, ht1Var);
            case 13:
                int F7 = t90.F(parcel);
                long j2 = 0;
                long j3 = 0;
                int i4 = -1;
                int i5 = 0;
                int i6 = 0;
                int i7 = 0;
                int i8 = 0;
                String str13 = null;
                String str14 = null;
                while (parcel.dataPosition() < F7) {
                    int readInt7 = parcel.readInt();
                    switch ((char) readInt7) {
                        case 1:
                            i5 = t90.z(parcel, readInt7);
                            break;
                        case 2:
                            i6 = t90.z(parcel, readInt7);
                            break;
                        case 3:
                            i7 = t90.z(parcel, readInt7);
                            break;
                        case 4:
                            t90.G(parcel, readInt7, 8);
                            j2 = parcel.readLong();
                            break;
                        case ry0.STRING_FIELD_NUMBER /* 5 */:
                            t90.G(parcel, readInt7, 8);
                            j3 = parcel.readLong();
                            break;
                        case ry0.STRING_SET_FIELD_NUMBER /* 6 */:
                            str13 = t90.j(parcel, readInt7);
                            break;
                        case ry0.DOUBLE_FIELD_NUMBER /* 7 */:
                            str14 = t90.j(parcel, readInt7);
                            break;
                        case ry0.BYTES_FIELD_NUMBER /* 8 */:
                            i8 = t90.z(parcel, readInt7);
                            break;
                        case '\t':
                            i4 = t90.z(parcel, readInt7);
                            break;
                        default:
                            t90.E(parcel, readInt7);
                            break;
                    }
                }
                t90.m(parcel, F7);
                return new ul0(i5, i6, i7, j2, j3, str13, str14, i8, i4);
            case 14:
                int F8 = t90.F(parcel);
                int i9 = 0;
                GoogleSignInAccount googleSignInAccount = null;
                while (parcel.dataPosition() < F8) {
                    int readInt8 = parcel.readInt();
                    char c5 = (char) readInt8;
                    if (c5 == 1) {
                        i = t90.z(parcel, readInt8);
                    } else if (c5 == 2) {
                        account = (Account) t90.i(parcel, readInt8, Account.CREATOR);
                    } else if (c5 == 3) {
                        i9 = t90.z(parcel, readInt8);
                    } else if (c5 != 4) {
                        t90.E(parcel, readInt8);
                    } else {
                        googleSignInAccount = (GoogleSignInAccount) t90.i(parcel, readInt8, GoogleSignInAccount.CREATOR);
                    }
                }
                t90.m(parcel, F8);
                return new ft1(i, account, i9, googleSignInAccount);
            case 15:
                int F9 = t90.F(parcel);
                int i10 = 0;
                boolean z = false;
                boolean z2 = false;
                IBinder iBinder = null;
                fm fmVar2 = null;
                while (parcel.dataPosition() < F9) {
                    int readInt9 = parcel.readInt();
                    char c6 = (char) readInt9;
                    if (c6 == 1) {
                        i10 = t90.z(parcel, readInt9);
                    } else if (c6 == 2) {
                        int A4 = t90.A(parcel, readInt9);
                        int dataPosition4 = parcel.dataPosition();
                        if (A4 == 0) {
                            iBinder = null;
                        } else {
                            IBinder readStrongBinder = parcel.readStrongBinder();
                            parcel.setDataPosition(dataPosition4 + A4);
                            iBinder = readStrongBinder;
                        }
                    } else if (c6 == 3) {
                        fmVar2 = (fm) t90.i(parcel, readInt9, fm.CREATOR);
                    } else if (c6 == 4) {
                        z = t90.y(parcel, readInt9);
                    } else if (c6 != 5) {
                        t90.E(parcel, readInt9);
                    } else {
                        z2 = t90.y(parcel, readInt9);
                    }
                }
                t90.m(parcel, F9);
                return new ht1(i10, iBinder, fmVar2, z, z2);
            case 16:
                int F10 = t90.F(parcel);
                while (parcel.dataPosition() < F10) {
                    int readInt10 = parcel.readInt();
                    if (((char) readInt10) != 1) {
                        t90.E(parcel, readInt10);
                    } else {
                        intent = (Intent) t90.i(parcel, readInt10, Intent.CREATOR);
                    }
                }
                t90.m(parcel, F10);
                return new qh(intent);
            case 17:
                int F11 = t90.F(parcel);
                while (parcel.dataPosition() < F11) {
                    int readInt11 = parcel.readInt();
                    char c7 = (char) readInt11;
                    if (c7 == 1) {
                        i = t90.z(parcel, readInt11);
                    } else if (c7 != 2) {
                        t90.E(parcel, readInt11);
                    } else {
                        str3 = t90.j(parcel, readInt11);
                    }
                }
                t90.m(parcel, F11);
                return new Scope(i, str3);
            case 18:
                int F12 = t90.F(parcel);
                int i11 = 0;
                boolean z3 = false;
                boolean z4 = false;
                int i12 = 0;
                int i13 = 0;
                while (parcel.dataPosition() < F12) {
                    int readInt12 = parcel.readInt();
                    char c8 = (char) readInt12;
                    if (c8 == 1) {
                        i11 = t90.z(parcel, readInt12);
                    } else if (c8 == 2) {
                        z3 = t90.y(parcel, readInt12);
                    } else if (c8 == 3) {
                        z4 = t90.y(parcel, readInt12);
                    } else if (c8 == 4) {
                        i12 = t90.z(parcel, readInt12);
                    } else if (c8 != 5) {
                        t90.E(parcel, readInt12);
                    } else {
                        i13 = t90.z(parcel, readInt12);
                    }
                }
                t90.m(parcel, F12);
                return new k41(i11, z3, z4, i12, i13);
            case 19:
                return new wt1(parcel.readStrongBinder());
            case 20:
                int F13 = t90.F(parcel);
                int i14 = 0;
                String str15 = null;
                while (parcel.dataPosition() < F13) {
                    int readInt13 = parcel.readInt();
                    char c9 = (char) readInt13;
                    if (c9 == 1) {
                        i = t90.z(parcel, readInt13);
                    } else if (c9 == 2) {
                        i14 = t90.z(parcel, readInt13);
                    } else if (c9 == 3) {
                        pendingIntent = (PendingIntent) t90.i(parcel, readInt13, PendingIntent.CREATOR);
                    } else if (c9 != 4) {
                        t90.E(parcel, readInt13);
                    } else {
                        str15 = t90.j(parcel, readInt13);
                    }
                }
                t90.m(parcel, F13);
                return new fm(i, i14, pendingIntent, str15);
            case 21:
                int F14 = t90.F(parcel);
                PendingIntent pendingIntent2 = null;
                fm fmVar3 = null;
                while (parcel.dataPosition() < F14) {
                    int readInt14 = parcel.readInt();
                    char c10 = (char) readInt14;
                    if (c10 == 1) {
                        i = t90.z(parcel, readInt14);
                    } else if (c10 == 2) {
                        str2 = t90.j(parcel, readInt14);
                    } else if (c10 == 3) {
                        pendingIntent2 = (PendingIntent) t90.i(parcel, readInt14, PendingIntent.CREATOR);
                    } else if (c10 != 4) {
                        t90.E(parcel, readInt14);
                    } else {
                        fmVar3 = (fm) t90.i(parcel, readInt14, fm.CREATOR);
                    }
                }
                t90.m(parcel, F14);
                return new Status(i, str2, pendingIntent2, fmVar3);
            case 22:
                int F15 = t90.F(parcel);
                long j4 = -1;
                while (parcel.dataPosition() < F15) {
                    int readInt15 = parcel.readInt();
                    char c11 = (char) readInt15;
                    if (c11 == 1) {
                        str = t90.j(parcel, readInt15);
                    } else if (c11 == 2) {
                        i = t90.z(parcel, readInt15);
                    } else if (c11 != 3) {
                        t90.E(parcel, readInt15);
                    } else {
                        t90.G(parcel, readInt15, 8);
                        j4 = parcel.readLong();
                    }
                }
                t90.m(parcel, F15);
                return new vx(i, j4, str);
            case 23:
                int F16 = t90.F(parcel);
                vx[] vxVarArr = null;
                gm gmVar = null;
                while (parcel.dataPosition() < F16) {
                    int readInt16 = parcel.readInt();
                    char c12 = (char) readInt16;
                    if (c12 == 1) {
                        bundle2 = t90.h(parcel, readInt16);
                    } else if (c12 == 2) {
                        vxVarArr = (vx[]) t90.k(parcel, readInt16, vx.CREATOR);
                    } else if (c12 == 3) {
                        i = t90.z(parcel, readInt16);
                    } else if (c12 != 4) {
                        t90.E(parcel, readInt16);
                    } else {
                        gmVar = (gm) t90.i(parcel, readInt16, gm.CREATOR);
                    }
                }
                t90.m(parcel, F16);
                nu1 nu1Var = new nu1();
                nu1Var.d = bundle2;
                nu1Var.e = vxVarArr;
                nu1Var.g = i;
                nu1Var.h = gmVar;
                return nu1Var;
            case 24:
                int F17 = t90.F(parcel);
                boolean z5 = false;
                boolean z6 = false;
                int i15 = 0;
                k41 k41Var = null;
                int[] iArr = null;
                int[] iArr2 = null;
                while (parcel.dataPosition() < F17) {
                    int readInt17 = parcel.readInt();
                    switch ((char) readInt17) {
                        case 1:
                            k41Var = (k41) t90.i(parcel, readInt17, k41.CREATOR);
                            break;
                        case 2:
                            z5 = t90.y(parcel, readInt17);
                            break;
                        case 3:
                            z6 = t90.y(parcel, readInt17);
                            break;
                        case 4:
                            int A5 = t90.A(parcel, readInt17);
                            int dataPosition5 = parcel.dataPosition();
                            if (A5 != 0) {
                                int[] createIntArray = parcel.createIntArray();
                                parcel.setDataPosition(dataPosition5 + A5);
                                iArr = createIntArray;
                                break;
                            } else {
                                iArr = null;
                                break;
                            }
                        case ry0.STRING_FIELD_NUMBER /* 5 */:
                            i15 = t90.z(parcel, readInt17);
                            break;
                        case ry0.STRING_SET_FIELD_NUMBER /* 6 */:
                            int A6 = t90.A(parcel, readInt17);
                            int dataPosition6 = parcel.dataPosition();
                            if (A6 != 0) {
                                int[] createIntArray2 = parcel.createIntArray();
                                parcel.setDataPosition(dataPosition6 + A6);
                                iArr2 = createIntArray2;
                                break;
                            } else {
                                iArr2 = null;
                                break;
                            }
                        default:
                            t90.E(parcel, readInt17);
                            break;
                    }
                }
                t90.m(parcel, F17);
                return new gm(k41Var, z5, z6, iArr, i15, iArr2);
            default:
                int F18 = t90.F(parcel);
                Bundle bundle3 = new Bundle();
                Scope[] scopeArr = r40.s;
                vx[] vxVarArr2 = r40.t;
                vx[] vxVarArr3 = vxVarArr2;
                int i16 = 0;
                int i17 = 0;
                int i18 = 0;
                boolean z7 = false;
                int i19 = 0;
                boolean z8 = false;
                String str16 = null;
                IBinder iBinder2 = null;
                Account account2 = null;
                String str17 = null;
                while (parcel.dataPosition() < F18) {
                    int readInt18 = parcel.readInt();
                    switch ((char) readInt18) {
                        case 1:
                            i16 = t90.z(parcel, readInt18);
                            break;
                        case 2:
                            i17 = t90.z(parcel, readInt18);
                            break;
                        case 3:
                            i18 = t90.z(parcel, readInt18);
                            break;
                        case 4:
                            str16 = t90.j(parcel, readInt18);
                            break;
                        case ry0.STRING_FIELD_NUMBER /* 5 */:
                            int A7 = t90.A(parcel, readInt18);
                            int dataPosition7 = parcel.dataPosition();
                            if (A7 != 0) {
                                IBinder readStrongBinder2 = parcel.readStrongBinder();
                                parcel.setDataPosition(dataPosition7 + A7);
                                iBinder2 = readStrongBinder2;
                                break;
                            } else {
                                iBinder2 = null;
                                break;
                            }
                        case ry0.STRING_SET_FIELD_NUMBER /* 6 */:
                            scopeArr = (Scope[]) t90.k(parcel, readInt18, Scope.CREATOR);
                            break;
                        case ry0.DOUBLE_FIELD_NUMBER /* 7 */:
                            bundle3 = t90.h(parcel, readInt18);
                            break;
                        case ry0.BYTES_FIELD_NUMBER /* 8 */:
                            account2 = (Account) t90.i(parcel, readInt18, Account.CREATOR);
                            break;
                        case '\t':
                        default:
                            t90.E(parcel, readInt18);
                            break;
                        case RequestError.EVENT_TIMEOUT /* 10 */:
                            vxVarArr2 = (vx[]) t90.k(parcel, readInt18, vx.CREATOR);
                            break;
                        case RequestError.STOP_TRACKING /* 11 */:
                            vxVarArr3 = (vx[]) t90.k(parcel, readInt18, vx.CREATOR);
                            break;
                        case '\f':
                            z7 = t90.y(parcel, readInt18);
                            break;
                        case '\r':
                            i19 = t90.z(parcel, readInt18);
                            break;
                        case 14:
                            z8 = t90.y(parcel, readInt18);
                            break;
                        case 15:
                            str17 = t90.j(parcel, readInt18);
                            break;
                    }
                }
                t90.m(parcel, F18);
                return new r40(i16, i17, i18, str16, iBinder2, scopeArr, bundle3, account2, vxVarArr2, vxVarArr3, z7, i19, z8, str17);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        switch (this.a) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                return new h2[i];
            case 1:
                return new gq[i];
            case 2:
                return new fa0[i];
            case 3:
                return new ParcelImpl[i];
            case 4:
                return new wu0[i];
            case ry0.STRING_FIELD_NUMBER /* 5 */:
                return new xu0[i];
            case ry0.STRING_SET_FIELD_NUMBER /* 6 */:
                return new yu0[i];
            case ry0.DOUBLE_FIELD_NUMBER /* 7 */:
                return new o21[i];
            case ry0.BYTES_FIELD_NUMBER /* 8 */:
                return new rg1[i];
            case 9:
                return new as1[i];
            case RequestError.EVENT_TIMEOUT /* 10 */:
                return new GoogleSignInAccount[i];
            case RequestError.STOP_TRACKING /* 11 */:
                return new ws1[i];
            case 12:
                return new at1[i];
            case 13:
                return new ul0[i];
            case 14:
                return new ft1[i];
            case 15:
                return new ht1[i];
            case 16:
                return new qh[i];
            case 17:
                return new Scope[i];
            case 18:
                return new k41[i];
            case 19:
                return new wt1[i];
            case 20:
                return new fm[i];
            case 21:
                return new Status[i];
            case 22:
                return new vx[i];
            case 23:
                return new nu1[i];
            case 24:
                return new gm[i];
            default:
                return new r40[i];
        }
    }
}
