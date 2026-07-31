package I;

import U0.C0213d;
import U0.z;
import a.AbstractC0219a;
import android.accounts.Account;
import android.app.PendingIntent;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.versionedparcelable.ParcelImpl;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.Status;
import com.onesignal.inAppMessages.internal.display.impl.a;
import e.C0336a;
import i1.C0421b;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class j implements Parcelable.Creator {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1152a;

    public /* synthetic */ j(int i7) {
        this.f1152a = i7;
    }

    public static void a(U0.e eVar, Parcel parcel, int i7) {
        int O6 = AbstractC0219a.O(parcel, 20293);
        int i8 = eVar.f2517f;
        AbstractC0219a.R(parcel, 1, 4);
        parcel.writeInt(i8);
        int i9 = eVar.f2518g;
        AbstractC0219a.R(parcel, 2, 4);
        parcel.writeInt(i9);
        int i10 = eVar.f2519h;
        AbstractC0219a.R(parcel, 3, 4);
        parcel.writeInt(i10);
        AbstractC0219a.J(parcel, 4, eVar.f2520i);
        IBinder iBinder = eVar.f2521j;
        if (iBinder != null) {
            int O7 = AbstractC0219a.O(parcel, 5);
            parcel.writeStrongBinder(iBinder);
            AbstractC0219a.Q(parcel, O7);
        }
        AbstractC0219a.K(parcel, 6, eVar.f2522k, i7);
        AbstractC0219a.H(parcel, 7, eVar.f2523l);
        AbstractC0219a.I(parcel, 8, eVar.f2524m, i7);
        AbstractC0219a.K(parcel, 10, eVar.f2525n, i7);
        AbstractC0219a.K(parcel, 11, eVar.f2526o, i7);
        boolean z5 = eVar.f2527p;
        AbstractC0219a.R(parcel, 12, 4);
        parcel.writeInt(z5 ? 1 : 0);
        int i11 = eVar.f2528q;
        AbstractC0219a.R(parcel, 13, 4);
        parcel.writeInt(i11);
        boolean z6 = eVar.f2529r;
        AbstractC0219a.R(parcel, 14, 4);
        parcel.writeInt(z6 ? 1 : 0);
        AbstractC0219a.J(parcel, 15, eVar.f2530s);
        AbstractC0219a.Q(parcel, O6);
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int readInt;
        switch (this.f1152a) {
            case 0:
                k kVar = new k(parcel);
                kVar.f1153f = parcel.readInt();
                return kVar;
            case a.b.DRAGGABLE_DIRECTION_DOWN /* 1 */:
                int l02 = A3.c.l0(parcel);
                long j4 = 0;
                int i7 = 0;
                String str = null;
                String str2 = null;
                String str3 = null;
                String str4 = null;
                Uri uri = null;
                String str5 = null;
                String str6 = null;
                ArrayList arrayList = null;
                String str7 = null;
                String str8 = null;
                while (true) {
                    long j7 = j4;
                    while (parcel.dataPosition() < l02) {
                        readInt = parcel.readInt();
                        switch ((char) readInt) {
                            case a.b.DRAGGABLE_DIRECTION_DOWN /* 1 */:
                                i7 = A3.c.Y(parcel, readInt);
                                break;
                            case com.onesignal.core.internal.permissions.h.ONESIGNAL_PERMISSION_REQUEST_CODE /* 2 */:
                                str = A3.c.H(parcel, readInt);
                                break;
                            case 3:
                                str2 = A3.c.H(parcel, readInt);
                                break;
                            case 4:
                                str3 = A3.c.H(parcel, readInt);
                                break;
                            case 5:
                                str4 = A3.c.H(parcel, readInt);
                                break;
                            case 6:
                                uri = (Uri) A3.c.G(parcel, readInt, Uri.CREATOR);
                                break;
                            case 7:
                                str5 = A3.c.H(parcel, readInt);
                                break;
                            case '\b':
                                break;
                            case '\t':
                                str6 = A3.c.H(parcel, readInt);
                                break;
                            case com.onesignal.core.internal.config.e.DEFAULT_NOTIFICATION_LIMIT /* 10 */:
                                Parcelable.Creator<Scope> creator = Scope.CREATOR;
                                int Z3 = A3.c.Z(parcel, readInt);
                                int dataPosition = parcel.dataPosition();
                                if (Z3 != 0) {
                                    ArrayList createTypedArrayList = parcel.createTypedArrayList(creator);
                                    parcel.setDataPosition(dataPosition + Z3);
                                    arrayList = createTypedArrayList;
                                    break;
                                } else {
                                    arrayList = null;
                                    break;
                                }
                            case 11:
                                str7 = A3.c.H(parcel, readInt);
                                break;
                            case '\f':
                                str8 = A3.c.H(parcel, readInt);
                                break;
                            default:
                                A3.c.h0(parcel, readInt);
                                break;
                        }
                    }
                    A3.c.N(parcel, l02);
                    return new GoogleSignInAccount(i7, str, str2, str3, str4, uri, str5, j7, str6, arrayList, str7, str8);
                    A3.c.n0(parcel, readInt, 8);
                    j4 = parcel.readLong();
                    break;
                }
            case com.onesignal.core.internal.permissions.h.ONESIGNAL_PERMISSION_REQUEST_CODE /* 2 */:
                int l03 = A3.c.l0(parcel);
                PendingIntent pendingIntent = null;
                int i8 = 0;
                int i9 = 0;
                String str9 = null;
                while (parcel.dataPosition() < l03) {
                    int readInt2 = parcel.readInt();
                    char c7 = (char) readInt2;
                    if (c7 == 1) {
                        i8 = A3.c.Y(parcel, readInt2);
                    } else if (c7 == 2) {
                        i9 = A3.c.Y(parcel, readInt2);
                    } else if (c7 == 3) {
                        pendingIntent = (PendingIntent) A3.c.G(parcel, readInt2, PendingIntent.CREATOR);
                    } else if (c7 != 4) {
                        A3.c.h0(parcel, readInt2);
                    } else {
                        str9 = A3.c.H(parcel, readInt2);
                    }
                }
                A3.c.N(parcel, l03);
                return new R0.a(i8, i9, pendingIntent, str9);
            case 3:
                int l04 = A3.c.l0(parcel);
                long j8 = -1;
                int i10 = 0;
                String str10 = null;
                while (parcel.dataPosition() < l04) {
                    int readInt3 = parcel.readInt();
                    char c8 = (char) readInt3;
                    if (c8 == 1) {
                        str10 = A3.c.H(parcel, readInt3);
                    } else if (c8 == 2) {
                        i10 = A3.c.Y(parcel, readInt3);
                    } else if (c8 != 3) {
                        A3.c.h0(parcel, readInt3);
                    } else {
                        A3.c.n0(parcel, readInt3, 8);
                        j8 = parcel.readLong();
                    }
                }
                A3.c.N(parcel, l04);
                return new R0.c(j8, str10, i10);
            case 4:
                int l05 = A3.c.l0(parcel);
                String str11 = null;
                int i11 = 0;
                while (parcel.dataPosition() < l05) {
                    int readInt4 = parcel.readInt();
                    char c9 = (char) readInt4;
                    if (c9 == 1) {
                        i11 = A3.c.Y(parcel, readInt4);
                    } else if (c9 != 2) {
                        A3.c.h0(parcel, readInt4);
                    } else {
                        str11 = A3.c.H(parcel, readInt4);
                    }
                }
                A3.c.N(parcel, l05);
                return new Scope(str11, i11);
            case 5:
                int l06 = A3.c.l0(parcel);
                String str12 = null;
                R0.a aVar = null;
                int i12 = 0;
                PendingIntent pendingIntent2 = null;
                while (parcel.dataPosition() < l06) {
                    int readInt5 = parcel.readInt();
                    char c10 = (char) readInt5;
                    if (c10 == 1) {
                        i12 = A3.c.Y(parcel, readInt5);
                    } else if (c10 == 2) {
                        str12 = A3.c.H(parcel, readInt5);
                    } else if (c10 == 3) {
                        pendingIntent2 = (PendingIntent) A3.c.G(parcel, readInt5, PendingIntent.CREATOR);
                    } else if (c10 != 4) {
                        A3.c.h0(parcel, readInt5);
                    } else {
                        aVar = (R0.a) A3.c.G(parcel, readInt5, R0.a.CREATOR);
                    }
                }
                A3.c.N(parcel, l06);
                return new Status(i12, str12, pendingIntent2, aVar);
            case 6:
                int l07 = A3.c.l0(parcel);
                int i13 = 0;
                while (true) {
                    ArrayList arrayList2 = null;
                    while (parcel.dataPosition() < l07) {
                        int readInt6 = parcel.readInt();
                        char c11 = (char) readInt6;
                        if (c11 == 1) {
                            i13 = A3.c.Y(parcel, readInt6);
                        } else if (c11 != 2) {
                            A3.c.h0(parcel, readInt6);
                        } else {
                            Parcelable.Creator<U0.g> creator2 = U0.g.CREATOR;
                            int Z6 = A3.c.Z(parcel, readInt6);
                            int dataPosition2 = parcel.dataPosition();
                            if (Z6 == 0) {
                                break;
                            }
                            arrayList2 = parcel.createTypedArrayList(creator2);
                            parcel.setDataPosition(dataPosition2 + Z6);
                        }
                    }
                    A3.c.N(parcel, l07);
                    return new U0.j(i13, arrayList2);
                    break;
                }
            case 7:
                int l08 = A3.c.l0(parcel);
                int i14 = 0;
                int i15 = 0;
                int i16 = 0;
                int i17 = 0;
                long j9 = 0;
                long j10 = 0;
                String str13 = null;
                String str14 = null;
                int i18 = -1;
                while (parcel.dataPosition() < l08) {
                    int readInt7 = parcel.readInt();
                    switch ((char) readInt7) {
                        case a.b.DRAGGABLE_DIRECTION_DOWN /* 1 */:
                            i14 = A3.c.Y(parcel, readInt7);
                            break;
                        case com.onesignal.core.internal.permissions.h.ONESIGNAL_PERMISSION_REQUEST_CODE /* 2 */:
                            i15 = A3.c.Y(parcel, readInt7);
                            break;
                        case 3:
                            i16 = A3.c.Y(parcel, readInt7);
                            break;
                        case 4:
                            A3.c.n0(parcel, readInt7, 8);
                            j9 = parcel.readLong();
                            break;
                        case 5:
                            A3.c.n0(parcel, readInt7, 8);
                            j10 = parcel.readLong();
                            break;
                        case 6:
                            str13 = A3.c.H(parcel, readInt7);
                            break;
                        case 7:
                            str14 = A3.c.H(parcel, readInt7);
                            break;
                        case '\b':
                            i17 = A3.c.Y(parcel, readInt7);
                            break;
                        case '\t':
                            i18 = A3.c.Y(parcel, readInt7);
                            break;
                        default:
                            A3.c.h0(parcel, readInt7);
                            break;
                    }
                }
                A3.c.N(parcel, l08);
                return new U0.g(i14, i15, i16, j9, j10, str13, str14, i17, i18);
            case 8:
                int l09 = A3.c.l0(parcel);
                int i19 = 0;
                Account account = null;
                GoogleSignInAccount googleSignInAccount = null;
                int i20 = 0;
                while (parcel.dataPosition() < l09) {
                    int readInt8 = parcel.readInt();
                    char c12 = (char) readInt8;
                    if (c12 == 1) {
                        i19 = A3.c.Y(parcel, readInt8);
                    } else if (c12 == 2) {
                        account = (Account) A3.c.G(parcel, readInt8, Account.CREATOR);
                    } else if (c12 == 3) {
                        i20 = A3.c.Y(parcel, readInt8);
                    } else if (c12 != 4) {
                        A3.c.h0(parcel, readInt8);
                    } else {
                        googleSignInAccount = (GoogleSignInAccount) A3.c.G(parcel, readInt8, GoogleSignInAccount.CREATOR);
                    }
                }
                A3.c.N(parcel, l09);
                return new U0.o(i19, account, i20, googleSignInAccount);
            case 9:
                int l010 = A3.c.l0(parcel);
                int i21 = 0;
                boolean z5 = false;
                boolean z6 = false;
                IBinder iBinder = null;
                R0.a aVar2 = null;
                while (parcel.dataPosition() < l010) {
                    int readInt9 = parcel.readInt();
                    char c13 = (char) readInt9;
                    if (c13 == 1) {
                        i21 = A3.c.Y(parcel, readInt9);
                    } else if (c13 == 2) {
                        int Z7 = A3.c.Z(parcel, readInt9);
                        int dataPosition3 = parcel.dataPosition();
                        if (Z7 == 0) {
                            iBinder = null;
                        } else {
                            iBinder = parcel.readStrongBinder();
                            parcel.setDataPosition(dataPosition3 + Z7);
                        }
                    } else if (c13 == 3) {
                        aVar2 = (R0.a) A3.c.G(parcel, readInt9, R0.a.CREATOR);
                    } else if (c13 == 4) {
                        z5 = A3.c.X(parcel, readInt9);
                    } else if (c13 != 5) {
                        A3.c.h0(parcel, readInt9);
                    } else {
                        z6 = A3.c.X(parcel, readInt9);
                    }
                }
                A3.c.N(parcel, l010);
                return new U0.p(i21, iBinder, aVar2, z5, z6);
            case com.onesignal.core.internal.config.e.DEFAULT_NOTIFICATION_LIMIT /* 10 */:
                int l011 = A3.c.l0(parcel);
                int i22 = 0;
                boolean z7 = false;
                boolean z8 = false;
                int i23 = 0;
                int i24 = 0;
                while (parcel.dataPosition() < l011) {
                    int readInt10 = parcel.readInt();
                    char c14 = (char) readInt10;
                    if (c14 == 1) {
                        i22 = A3.c.Y(parcel, readInt10);
                    } else if (c14 == 2) {
                        z7 = A3.c.X(parcel, readInt10);
                    } else if (c14 == 3) {
                        z8 = A3.c.X(parcel, readInt10);
                    } else if (c14 == 4) {
                        i23 = A3.c.Y(parcel, readInt10);
                    } else if (c14 != 5) {
                        A3.c.h0(parcel, readInt10);
                    } else {
                        i24 = A3.c.Y(parcel, readInt10);
                    }
                }
                A3.c.N(parcel, l011);
                return new U0.i(i22, z7, z8, i23, i24);
            case 11:
                int l012 = A3.c.l0(parcel);
                Bundle bundle = null;
                C0213d c0213d = null;
                int i25 = 0;
                R0.c[] cVarArr = null;
                while (parcel.dataPosition() < l012) {
                    int readInt11 = parcel.readInt();
                    char c15 = (char) readInt11;
                    if (c15 == 1) {
                        bundle = A3.c.F(parcel, readInt11);
                    } else if (c15 == 2) {
                        cVarArr = (R0.c[]) A3.c.I(parcel, readInt11, R0.c.CREATOR);
                    } else if (c15 == 3) {
                        i25 = A3.c.Y(parcel, readInt11);
                    } else if (c15 != 4) {
                        A3.c.h0(parcel, readInt11);
                    } else {
                        c0213d = (C0213d) A3.c.G(parcel, readInt11, C0213d.CREATOR);
                    }
                }
                A3.c.N(parcel, l012);
                z zVar = new z();
                zVar.f2591f = bundle;
                zVar.f2592g = cVarArr;
                zVar.f2593h = i25;
                zVar.f2594i = c0213d;
                return zVar;
            case 12:
                int l013 = A3.c.l0(parcel);
                U0.i iVar = null;
                int[] iArr = null;
                int[] iArr2 = null;
                boolean z9 = false;
                boolean z10 = false;
                int i26 = 0;
                while (parcel.dataPosition() < l013) {
                    int readInt12 = parcel.readInt();
                    switch ((char) readInt12) {
                        case a.b.DRAGGABLE_DIRECTION_DOWN /* 1 */:
                            iVar = (U0.i) A3.c.G(parcel, readInt12, U0.i.CREATOR);
                            break;
                        case com.onesignal.core.internal.permissions.h.ONESIGNAL_PERMISSION_REQUEST_CODE /* 2 */:
                            z9 = A3.c.X(parcel, readInt12);
                            break;
                        case 3:
                            z10 = A3.c.X(parcel, readInt12);
                            break;
                        case 4:
                            int Z8 = A3.c.Z(parcel, readInt12);
                            int dataPosition4 = parcel.dataPosition();
                            if (Z8 != 0) {
                                iArr = parcel.createIntArray();
                                parcel.setDataPosition(dataPosition4 + Z8);
                                break;
                            } else {
                                iArr = null;
                                break;
                            }
                        case 5:
                            i26 = A3.c.Y(parcel, readInt12);
                            break;
                        case 6:
                            int Z9 = A3.c.Z(parcel, readInt12);
                            int dataPosition5 = parcel.dataPosition();
                            if (Z9 != 0) {
                                iArr2 = parcel.createIntArray();
                                parcel.setDataPosition(dataPosition5 + Z9);
                                break;
                            } else {
                                iArr2 = null;
                                break;
                            }
                        default:
                            A3.c.h0(parcel, readInt12);
                            break;
                    }
                }
                A3.c.N(parcel, l013);
                return new C0213d(iVar, z9, z10, iArr, i26, iArr2);
            case 13:
                int l014 = A3.c.l0(parcel);
                Bundle bundle2 = new Bundle();
                Scope[] scopeArr = U0.e.f2515t;
                String str15 = null;
                IBinder iBinder2 = null;
                Account account2 = null;
                String str16 = null;
                int i27 = 0;
                int i28 = 0;
                int i29 = 0;
                boolean z11 = false;
                int i30 = 0;
                boolean z12 = false;
                R0.c[] cVarArr2 = U0.e.f2516u;
                R0.c[] cVarArr3 = cVarArr2;
                while (parcel.dataPosition() < l014) {
                    int readInt13 = parcel.readInt();
                    switch ((char) readInt13) {
                        case a.b.DRAGGABLE_DIRECTION_DOWN /* 1 */:
                            i27 = A3.c.Y(parcel, readInt13);
                            break;
                        case com.onesignal.core.internal.permissions.h.ONESIGNAL_PERMISSION_REQUEST_CODE /* 2 */:
                            i28 = A3.c.Y(parcel, readInt13);
                            break;
                        case 3:
                            i29 = A3.c.Y(parcel, readInt13);
                            break;
                        case 4:
                            str15 = A3.c.H(parcel, readInt13);
                            break;
                        case 5:
                            int Z10 = A3.c.Z(parcel, readInt13);
                            int dataPosition6 = parcel.dataPosition();
                            if (Z10 != 0) {
                                IBinder readStrongBinder = parcel.readStrongBinder();
                                parcel.setDataPosition(dataPosition6 + Z10);
                                iBinder2 = readStrongBinder;
                                break;
                            } else {
                                iBinder2 = null;
                                break;
                            }
                        case 6:
                            scopeArr = (Scope[]) A3.c.I(parcel, readInt13, Scope.CREATOR);
                            break;
                        case 7:
                            bundle2 = A3.c.F(parcel, readInt13);
                            break;
                        case '\b':
                            account2 = (Account) A3.c.G(parcel, readInt13, Account.CREATOR);
                            break;
                        case '\t':
                        default:
                            A3.c.h0(parcel, readInt13);
                            break;
                        case com.onesignal.core.internal.config.e.DEFAULT_NOTIFICATION_LIMIT /* 10 */:
                            cVarArr2 = (R0.c[]) A3.c.I(parcel, readInt13, R0.c.CREATOR);
                            break;
                        case 11:
                            cVarArr3 = (R0.c[]) A3.c.I(parcel, readInt13, R0.c.CREATOR);
                            break;
                        case '\f':
                            z11 = A3.c.X(parcel, readInt13);
                            break;
                        case '\r':
                            i30 = A3.c.Y(parcel, readInt13);
                            break;
                        case 14:
                            z12 = A3.c.X(parcel, readInt13);
                            break;
                        case 15:
                            str16 = A3.c.H(parcel, readInt13);
                            break;
                    }
                }
                A3.c.N(parcel, l014);
                return new U0.e(i27, i28, i29, str15, iBinder2, scopeArr, bundle2, account2, cVarArr2, cVarArr3, z11, i30, z12, str16);
            case 14:
                return new ParcelImpl(parcel);
            case 15:
                return new C0336a(parcel);
            case 16:
                int l015 = A3.c.l0(parcel);
                int i31 = 0;
                Intent intent = null;
                int i32 = 0;
                while (parcel.dataPosition() < l015) {
                    int readInt14 = parcel.readInt();
                    char c16 = (char) readInt14;
                    if (c16 == 1) {
                        i31 = A3.c.Y(parcel, readInt14);
                    } else if (c16 == 2) {
                        i32 = A3.c.Y(parcel, readInt14);
                    } else if (c16 != 3) {
                        A3.c.h0(parcel, readInt14);
                    } else {
                        intent = (Intent) A3.c.G(parcel, readInt14, Intent.CREATOR);
                    }
                }
                A3.c.N(parcel, l015);
                return new C0421b(i31, i32, intent);
            case 17:
                int l016 = A3.c.l0(parcel);
                ArrayList<String> arrayList3 = null;
                String str17 = null;
                while (parcel.dataPosition() < l016) {
                    int readInt15 = parcel.readInt();
                    char c17 = (char) readInt15;
                    if (c17 == 1) {
                        int Z11 = A3.c.Z(parcel, readInt15);
                        int dataPosition7 = parcel.dataPosition();
                        if (Z11 == 0) {
                            arrayList3 = null;
                        } else {
                            ArrayList<String> createStringArrayList = parcel.createStringArrayList();
                            parcel.setDataPosition(dataPosition7 + Z11);
                            arrayList3 = createStringArrayList;
                        }
                    } else if (c17 != 2) {
                        A3.c.h0(parcel, readInt15);
                    } else {
                        str17 = A3.c.H(parcel, readInt15);
                    }
                }
                A3.c.N(parcel, l016);
                return new i1.f(str17, arrayList3);
            default:
                int l017 = A3.c.l0(parcel);
                int i33 = 0;
                R0.a aVar3 = null;
                U0.p pVar = null;
                while (parcel.dataPosition() < l017) {
                    int readInt16 = parcel.readInt();
                    char c18 = (char) readInt16;
                    if (c18 == 1) {
                        i33 = A3.c.Y(parcel, readInt16);
                    } else if (c18 == 2) {
                        aVar3 = (R0.a) A3.c.G(parcel, readInt16, R0.a.CREATOR);
                    } else if (c18 != 3) {
                        A3.c.h0(parcel, readInt16);
                    } else {
                        pVar = (U0.p) A3.c.G(parcel, readInt16, U0.p.CREATOR);
                    }
                }
                A3.c.N(parcel, l017);
                return new i1.g(i33, aVar3, pVar);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i7) {
        switch (this.f1152a) {
            case 0:
                return new k[i7];
            case a.b.DRAGGABLE_DIRECTION_DOWN /* 1 */:
                return new GoogleSignInAccount[i7];
            case com.onesignal.core.internal.permissions.h.ONESIGNAL_PERMISSION_REQUEST_CODE /* 2 */:
                return new R0.a[i7];
            case 3:
                return new R0.c[i7];
            case 4:
                return new Scope[i7];
            case 5:
                return new Status[i7];
            case 6:
                return new U0.j[i7];
            case 7:
                return new U0.g[i7];
            case 8:
                return new U0.o[i7];
            case 9:
                return new U0.p[i7];
            case com.onesignal.core.internal.config.e.DEFAULT_NOTIFICATION_LIMIT /* 10 */:
                return new U0.i[i7];
            case 11:
                return new z[i7];
            case 12:
                return new C0213d[i7];
            case 13:
                return new U0.e[i7];
            case 14:
                return new ParcelImpl[i7];
            case 15:
                return new C0336a[i7];
            case 16:
                return new C0421b[i7];
            case 17:
                return new i1.f[i7];
            default:
                return new i1.g[i7];
        }
    }
}
