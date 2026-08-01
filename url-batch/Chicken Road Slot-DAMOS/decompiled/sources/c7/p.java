package c7;

import android.accounts.Account;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.versionedparcelable.ParcelImpl;
import com.appsflyer.attribution.RequestError;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.Scope;
import java.util.ArrayList;
import s7.a4;
import s7.b4;
import s7.c4;
import s7.m4;
import s7.r4;
import s7.x3;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class p implements Parcelable.Creator {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1969a;

    public /* synthetic */ p(int i3) {
        this.f1969a = i3;
    }

    public static void a(h hVar, Parcel parcel, int i3) {
        int Z = cf.c.Z(parcel, 20293);
        int i10 = hVar.f1911d;
        cf.c.Y(parcel, 1, 4);
        parcel.writeInt(i10);
        int i11 = hVar.f1912e;
        cf.c.Y(parcel, 2, 4);
        parcel.writeInt(i11);
        int i12 = hVar.f1913i;
        cf.c.Y(parcel, 3, 4);
        parcel.writeInt(i12);
        cf.c.V(parcel, 4, hVar.f1914r);
        cf.c.S(parcel, 5, hVar.f1915s);
        cf.c.W(parcel, 6, hVar.f1916t, i3);
        cf.c.P(parcel, 7, hVar.f1917u);
        cf.c.U(parcel, 8, hVar.f1918v, i3);
        cf.c.W(parcel, 10, hVar.f1919w, i3);
        cf.c.W(parcel, 11, hVar.f1920x, i3);
        boolean z10 = hVar.f1921y;
        cf.c.Y(parcel, 12, 4);
        parcel.writeInt(z10 ? 1 : 0);
        int i13 = hVar.f1922z;
        cf.c.Y(parcel, 13, 4);
        parcel.writeInt(i13);
        boolean z11 = hVar.A;
        cf.c.Y(parcel, 14, 4);
        parcel.writeInt(z11 ? 1 : 0);
        cf.c.V(parcel, 15, hVar.B);
        cf.c.a0(parcel, Z);
    }

    public static void b(s7.u uVar, Parcel parcel, int i3) {
        String str = uVar.f9035d;
        int Z = cf.c.Z(parcel, 20293);
        cf.c.V(parcel, 2, str);
        cf.c.U(parcel, 3, uVar.f9036e, i3);
        cf.c.V(parcel, 4, uVar.f9037i);
        long j = uVar.f9038r;
        cf.c.Y(parcel, 5, 8);
        parcel.writeLong(j);
        long j3 = uVar.f9039s;
        cf.c.Y(parcel, 6, 8);
        parcel.writeLong(j3);
        cf.c.a0(parcel, Z);
    }

    public static void c(m4 m4Var, Parcel parcel) {
        int i3 = m4Var.f8851d;
        int Z = cf.c.Z(parcel, 20293);
        cf.c.Y(parcel, 1, 4);
        parcel.writeInt(i3);
        cf.c.V(parcel, 2, m4Var.f8852e);
        long j = m4Var.f8853i;
        cf.c.Y(parcel, 3, 8);
        parcel.writeLong(j);
        Long l10 = m4Var.f8854r;
        if (l10 != null) {
            cf.c.Y(parcel, 4, 8);
            parcel.writeLong(l10.longValue());
        }
        cf.c.V(parcel, 6, m4Var.f8855s);
        cf.c.V(parcel, 7, m4Var.f8856t);
        Double d10 = m4Var.f8857u;
        if (d10 != null) {
            cf.c.Y(parcel, 8, 8);
            parcel.writeDouble(d10.doubleValue());
        }
        cf.c.a0(parcel, Z);
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.f1969a) {
            case 0:
                int g02 = c6.f.g0(parcel);
                ArrayList arrayList = null;
                int i3 = 0;
                while (parcel.dataPosition() < g02) {
                    int readInt = parcel.readInt();
                    char c10 = (char) readInt;
                    if (c10 == 1) {
                        i3 = c6.f.X(parcel, readInt);
                    } else if (c10 != 2) {
                        c6.f.c0(parcel, readInt);
                    } else {
                        arrayList = c6.f.z(parcel, readInt, k.CREATOR);
                    }
                }
                c6.f.A(parcel, g02);
                return new n(i3, arrayList);
            case 1:
                int g03 = c6.f.g0(parcel);
                int i10 = 0;
                int i11 = 0;
                boolean z10 = false;
                long j = 0;
                String str = null;
                while (parcel.dataPosition() < g03) {
                    int readInt2 = parcel.readInt();
                    char c11 = (char) readInt2;
                    if (c11 == 1) {
                        i10 = c6.f.X(parcel, readInt2);
                    } else if (c11 == 2) {
                        str = c6.f.x(parcel, readInt2);
                    } else if (c11 == 3) {
                        j = c6.f.Y(parcel, readInt2);
                    } else if (c11 == 4) {
                        i11 = c6.f.X(parcel, readInt2);
                    } else if (c11 != 5) {
                        c6.f.c0(parcel, readInt2);
                    } else {
                        z10 = c6.f.V(parcel, readInt2);
                    }
                }
                c6.f.A(parcel, g03);
                return new q(i10, i11, j, str, z10);
            case 2:
                int g04 = c6.f.g0(parcel);
                int i12 = -1;
                int i13 = 0;
                int i14 = 0;
                int i15 = 0;
                int i16 = 0;
                String str2 = null;
                String str3 = null;
                long j3 = 0;
                long j10 = 0;
                while (parcel.dataPosition() < g04) {
                    int readInt3 = parcel.readInt();
                    switch ((char) readInt3) {
                        case 1:
                            i13 = c6.f.X(parcel, readInt3);
                            break;
                        case 2:
                            i14 = c6.f.X(parcel, readInt3);
                            break;
                        case a4.j.INTEGER_FIELD_NUMBER /* 3 */:
                            i15 = c6.f.X(parcel, readInt3);
                            break;
                        case a4.j.LONG_FIELD_NUMBER /* 4 */:
                            j3 = c6.f.Y(parcel, readInt3);
                            break;
                        case a4.j.STRING_FIELD_NUMBER /* 5 */:
                            j10 = c6.f.Y(parcel, readInt3);
                            break;
                        case a4.j.STRING_SET_FIELD_NUMBER /* 6 */:
                            str2 = c6.f.x(parcel, readInt3);
                            break;
                        case a4.j.DOUBLE_FIELD_NUMBER /* 7 */:
                            str3 = c6.f.x(parcel, readInt3);
                            break;
                        case a4.j.BYTES_FIELD_NUMBER /* 8 */:
                            i16 = c6.f.X(parcel, readInt3);
                            break;
                        case '\t':
                            i12 = c6.f.X(parcel, readInt3);
                            break;
                        default:
                            c6.f.c0(parcel, readInt3);
                            break;
                    }
                }
                c6.f.A(parcel, g04);
                return new k(i13, i14, i15, j3, j10, str2, str3, i16, i12);
            case a4.j.INTEGER_FIELD_NUMBER /* 3 */:
                int g05 = c6.f.g0(parcel);
                Account account = null;
                int i17 = 0;
                int i18 = 0;
                GoogleSignInAccount googleSignInAccount = null;
                while (parcel.dataPosition() < g05) {
                    int readInt4 = parcel.readInt();
                    char c12 = (char) readInt4;
                    if (c12 == 1) {
                        i17 = c6.f.X(parcel, readInt4);
                    } else if (c12 == 2) {
                        account = (Account) c6.f.w(parcel, readInt4, Account.CREATOR);
                    } else if (c12 == 3) {
                        i18 = c6.f.X(parcel, readInt4);
                    } else if (c12 != 4) {
                        c6.f.c0(parcel, readInt4);
                    } else {
                        googleSignInAccount = (GoogleSignInAccount) c6.f.w(parcel, readInt4, GoogleSignInAccount.CREATOR);
                    }
                }
                c6.f.A(parcel, g05);
                return new v(i17, account, i18, googleSignInAccount);
            case a4.j.LONG_FIELD_NUMBER /* 4 */:
                int g06 = c6.f.g0(parcel);
                int i19 = 0;
                boolean z11 = false;
                boolean z12 = false;
                IBinder iBinder = null;
                z6.b bVar = null;
                while (parcel.dataPosition() < g06) {
                    int readInt5 = parcel.readInt();
                    char c13 = (char) readInt5;
                    if (c13 == 1) {
                        i19 = c6.f.X(parcel, readInt5);
                    } else if (c13 == 2) {
                        iBinder = c6.f.W(parcel, readInt5);
                    } else if (c13 == 3) {
                        bVar = (z6.b) c6.f.w(parcel, readInt5, z6.b.CREATOR);
                    } else if (c13 == 4) {
                        z11 = c6.f.V(parcel, readInt5);
                    } else if (c13 != 5) {
                        c6.f.c0(parcel, readInt5);
                    } else {
                        z12 = c6.f.V(parcel, readInt5);
                    }
                }
                c6.f.A(parcel, g06);
                return new w(i19, iBinder, bVar, z11, z12);
            case a4.j.STRING_FIELD_NUMBER /* 5 */:
                int g07 = c6.f.g0(parcel);
                int i20 = 0;
                boolean z13 = false;
                boolean z14 = false;
                int i21 = 0;
                int i22 = 0;
                while (parcel.dataPosition() < g07) {
                    int readInt6 = parcel.readInt();
                    char c14 = (char) readInt6;
                    if (c14 == 1) {
                        i20 = c6.f.X(parcel, readInt6);
                    } else if (c14 == 2) {
                        z13 = c6.f.V(parcel, readInt6);
                    } else if (c14 == 3) {
                        z14 = c6.f.V(parcel, readInt6);
                    } else if (c14 == 4) {
                        i21 = c6.f.X(parcel, readInt6);
                    } else if (c14 != 5) {
                        c6.f.c0(parcel, readInt6);
                    } else {
                        i22 = c6.f.X(parcel, readInt6);
                    }
                }
                c6.f.A(parcel, g07);
                return new m(i20, z13, z14, i21, i22);
            case a4.j.STRING_SET_FIELD_NUMBER /* 6 */:
                int g08 = c6.f.g0(parcel);
                Bundle bundle = null;
                g gVar = null;
                int i23 = 0;
                z6.d[] dVarArr = null;
                while (parcel.dataPosition() < g08) {
                    int readInt7 = parcel.readInt();
                    char c15 = (char) readInt7;
                    if (c15 == 1) {
                        bundle = c6.f.s(parcel, readInt7);
                    } else if (c15 == 2) {
                        dVarArr = (z6.d[]) c6.f.y(parcel, readInt7, z6.d.CREATOR);
                    } else if (c15 == 3) {
                        i23 = c6.f.X(parcel, readInt7);
                    } else if (c15 != 4) {
                        c6.f.c0(parcel, readInt7);
                    } else {
                        gVar = (g) c6.f.w(parcel, readInt7, g.CREATOR);
                    }
                }
                c6.f.A(parcel, g08);
                k0 k0Var = new k0();
                k0Var.f1935d = bundle;
                k0Var.f1936e = dVarArr;
                k0Var.f1937i = i23;
                k0Var.f1938r = gVar;
                return k0Var;
            case a4.j.DOUBLE_FIELD_NUMBER /* 7 */:
                int g09 = c6.f.g0(parcel);
                m mVar = null;
                int[] iArr = null;
                int[] iArr2 = null;
                boolean z15 = false;
                boolean z16 = false;
                int i24 = 0;
                while (parcel.dataPosition() < g09) {
                    int readInt8 = parcel.readInt();
                    switch ((char) readInt8) {
                        case 1:
                            mVar = (m) c6.f.w(parcel, readInt8, m.CREATOR);
                            break;
                        case 2:
                            z15 = c6.f.V(parcel, readInt8);
                            break;
                        case a4.j.INTEGER_FIELD_NUMBER /* 3 */:
                            z16 = c6.f.V(parcel, readInt8);
                            break;
                        case a4.j.LONG_FIELD_NUMBER /* 4 */:
                            iArr = c6.f.v(parcel, readInt8);
                            break;
                        case a4.j.STRING_FIELD_NUMBER /* 5 */:
                            i24 = c6.f.X(parcel, readInt8);
                            break;
                        case a4.j.STRING_SET_FIELD_NUMBER /* 6 */:
                            iArr2 = c6.f.v(parcel, readInt8);
                            break;
                        default:
                            c6.f.c0(parcel, readInt8);
                            break;
                    }
                }
                c6.f.A(parcel, g09);
                return new g(mVar, z15, z16, iArr, i24, iArr2);
            case a4.j.BYTES_FIELD_NUMBER /* 8 */:
                int g010 = c6.f.g0(parcel);
                Bundle bundle2 = new Bundle();
                Scope[] scopeArr = h.C;
                String str4 = null;
                IBinder iBinder2 = null;
                Account account2 = null;
                String str5 = null;
                int i25 = 0;
                int i26 = 0;
                int i27 = 0;
                boolean z17 = false;
                int i28 = 0;
                boolean z18 = false;
                z6.d[] dVarArr2 = h.D;
                z6.d[] dVarArr3 = dVarArr2;
                while (parcel.dataPosition() < g010) {
                    int readInt9 = parcel.readInt();
                    switch ((char) readInt9) {
                        case 1:
                            i25 = c6.f.X(parcel, readInt9);
                            break;
                        case 2:
                            i26 = c6.f.X(parcel, readInt9);
                            break;
                        case a4.j.INTEGER_FIELD_NUMBER /* 3 */:
                            i27 = c6.f.X(parcel, readInt9);
                            break;
                        case a4.j.LONG_FIELD_NUMBER /* 4 */:
                            str4 = c6.f.x(parcel, readInt9);
                            break;
                        case a4.j.STRING_FIELD_NUMBER /* 5 */:
                            iBinder2 = c6.f.W(parcel, readInt9);
                            break;
                        case a4.j.STRING_SET_FIELD_NUMBER /* 6 */:
                            scopeArr = (Scope[]) c6.f.y(parcel, readInt9, Scope.CREATOR);
                            break;
                        case a4.j.DOUBLE_FIELD_NUMBER /* 7 */:
                            bundle2 = c6.f.s(parcel, readInt9);
                            break;
                        case a4.j.BYTES_FIELD_NUMBER /* 8 */:
                            account2 = (Account) c6.f.w(parcel, readInt9, Account.CREATOR);
                            break;
                        case '\t':
                        default:
                            c6.f.c0(parcel, readInt9);
                            break;
                        case '\n':
                            dVarArr2 = (z6.d[]) c6.f.y(parcel, readInt9, z6.d.CREATOR);
                            break;
                        case RequestError.STOP_TRACKING /* 11 */:
                            dVarArr3 = (z6.d[]) c6.f.y(parcel, readInt9, z6.d.CREATOR);
                            break;
                        case '\f':
                            z17 = c6.f.V(parcel, readInt9);
                            break;
                        case '\r':
                            i28 = c6.f.X(parcel, readInt9);
                            break;
                        case 14:
                            z18 = c6.f.V(parcel, readInt9);
                            break;
                        case 15:
                            str5 = c6.f.x(parcel, readInt9);
                            break;
                    }
                }
                c6.f.A(parcel, g010);
                return new h(i25, i26, i27, str4, iBinder2, scopeArr, bundle2, account2, dVarArr2, dVarArr3, z17, i28, z18, str5);
            case 9:
                int g011 = c6.f.g0(parcel);
                Bundle bundle3 = null;
                while (parcel.dataPosition() < g011) {
                    int readInt10 = parcel.readInt();
                    if (((char) readInt10) != 2) {
                        c6.f.c0(parcel, readInt10);
                    } else {
                        bundle3 = c6.f.s(parcel, readInt10);
                    }
                }
                c6.f.A(parcel, g011);
                return new com.google.firebase.messaging.u(bundle3);
            case 10:
                parcel.getClass();
                return new h.a(parcel.readInt(), parcel.readInt() == 0 ? null : (Intent) Intent.CREATOR.createFromParcel(parcel));
            case RequestError.STOP_TRACKING /* 11 */:
                return new ParcelImpl(parcel);
            case 12:
                int g012 = c6.f.g0(parcel);
                long j11 = 0;
                long j12 = 0;
                int i29 = 0;
                while (parcel.dataPosition() < g012) {
                    int readInt11 = parcel.readInt();
                    char c16 = (char) readInt11;
                    if (c16 == 1) {
                        j11 = c6.f.Y(parcel, readInt11);
                    } else if (c16 == 2) {
                        i29 = c6.f.X(parcel, readInt11);
                    } else if (c16 != 3) {
                        c6.f.c0(parcel, readInt11);
                    } else {
                        j12 = c6.f.Y(parcel, readInt11);
                    }
                }
                c6.f.A(parcel, g012);
                return new s7.d(i29, j11, j12);
            case 13:
                int g013 = c6.f.g0(parcel);
                String str6 = null;
                String str7 = null;
                m4 m4Var = null;
                String str8 = null;
                s7.u uVar = null;
                s7.u uVar2 = null;
                s7.u uVar3 = null;
                long j13 = 0;
                long j14 = 0;
                long j15 = 0;
                boolean z19 = false;
                while (parcel.dataPosition() < g013) {
                    int readInt12 = parcel.readInt();
                    switch ((char) readInt12) {
                        case 2:
                            str6 = c6.f.x(parcel, readInt12);
                            break;
                        case a4.j.INTEGER_FIELD_NUMBER /* 3 */:
                            str7 = c6.f.x(parcel, readInt12);
                            break;
                        case a4.j.LONG_FIELD_NUMBER /* 4 */:
                            m4Var = (m4) c6.f.w(parcel, readInt12, m4.CREATOR);
                            break;
                        case a4.j.STRING_FIELD_NUMBER /* 5 */:
                            j13 = c6.f.Y(parcel, readInt12);
                            break;
                        case a4.j.STRING_SET_FIELD_NUMBER /* 6 */:
                            z19 = c6.f.V(parcel, readInt12);
                            break;
                        case a4.j.DOUBLE_FIELD_NUMBER /* 7 */:
                            str8 = c6.f.x(parcel, readInt12);
                            break;
                        case a4.j.BYTES_FIELD_NUMBER /* 8 */:
                            uVar = (s7.u) c6.f.w(parcel, readInt12, s7.u.CREATOR);
                            break;
                        case '\t':
                            j14 = c6.f.Y(parcel, readInt12);
                            break;
                        case '\n':
                            uVar2 = (s7.u) c6.f.w(parcel, readInt12, s7.u.CREATOR);
                            break;
                        case RequestError.STOP_TRACKING /* 11 */:
                            j15 = c6.f.Y(parcel, readInt12);
                            break;
                        case '\f':
                            uVar3 = (s7.u) c6.f.w(parcel, readInt12, s7.u.CREATOR);
                            break;
                        default:
                            c6.f.c0(parcel, readInt12);
                            break;
                    }
                }
                c6.f.A(parcel, g013);
                return new s7.e(str6, str7, m4Var, j13, z19, str8, uVar, j14, uVar2, j15, uVar3);
            case 14:
                int g014 = c6.f.g0(parcel);
                Bundle bundle4 = null;
                while (parcel.dataPosition() < g014) {
                    int readInt13 = parcel.readInt();
                    if (((char) readInt13) != 1) {
                        c6.f.c0(parcel, readInt13);
                    } else {
                        bundle4 = c6.f.s(parcel, readInt13);
                    }
                }
                c6.f.A(parcel, g014);
                return new s7.i(bundle4);
            case 15:
                int g015 = c6.f.g0(parcel);
                Bundle bundle5 = null;
                while (parcel.dataPosition() < g015) {
                    int readInt14 = parcel.readInt();
                    if (((char) readInt14) != 2) {
                        c6.f.c0(parcel, readInt14);
                    } else {
                        bundle5 = c6.f.s(parcel, readInt14);
                    }
                }
                c6.f.A(parcel, g015);
                return new s7.t(bundle5);
            case 16:
                int g016 = c6.f.g0(parcel);
                long j16 = 0;
                long j17 = 0;
                String str9 = null;
                s7.t tVar = null;
                String str10 = null;
                while (parcel.dataPosition() < g016) {
                    int readInt15 = parcel.readInt();
                    char c17 = (char) readInt15;
                    if (c17 == 2) {
                        str9 = c6.f.x(parcel, readInt15);
                    } else if (c17 == 3) {
                        tVar = (s7.t) c6.f.w(parcel, readInt15, s7.t.CREATOR);
                    } else if (c17 == 4) {
                        str10 = c6.f.x(parcel, readInt15);
                    } else if (c17 == 5) {
                        j16 = c6.f.Y(parcel, readInt15);
                    } else if (c17 != 6) {
                        c6.f.c0(parcel, readInt15);
                    } else {
                        j17 = c6.f.Y(parcel, readInt15);
                    }
                }
                c6.f.A(parcel, g016);
                return new s7.u(str9, tVar, str10, j16, j17);
            case 17:
                int g017 = c6.f.g0(parcel);
                int i30 = 0;
                long j18 = 0;
                String str11 = null;
                while (parcel.dataPosition() < g017) {
                    int readInt16 = parcel.readInt();
                    char c18 = (char) readInt16;
                    if (c18 == 1) {
                        str11 = c6.f.x(parcel, readInt16);
                    } else if (c18 == 2) {
                        j18 = c6.f.Y(parcel, readInt16);
                    } else if (c18 != 3) {
                        c6.f.c0(parcel, readInt16);
                    } else {
                        i30 = c6.f.X(parcel, readInt16);
                    }
                }
                c6.f.A(parcel, g017);
                return new x3(i30, j18, str11);
            case 18:
                int g018 = c6.f.g0(parcel);
                byte[] bArr = null;
                String str12 = null;
                Bundle bundle6 = null;
                String str13 = null;
                long j19 = 0;
                long j20 = 0;
                int i31 = 0;
                while (parcel.dataPosition() < g018) {
                    int readInt17 = parcel.readInt();
                    switch ((char) readInt17) {
                        case 1:
                            j19 = c6.f.Y(parcel, readInt17);
                            break;
                        case 2:
                            bArr = c6.f.t(parcel, readInt17);
                            break;
                        case a4.j.INTEGER_FIELD_NUMBER /* 3 */:
                            str12 = c6.f.x(parcel, readInt17);
                            break;
                        case a4.j.LONG_FIELD_NUMBER /* 4 */:
                            bundle6 = c6.f.s(parcel, readInt17);
                            break;
                        case a4.j.STRING_FIELD_NUMBER /* 5 */:
                            i31 = c6.f.X(parcel, readInt17);
                            break;
                        case a4.j.STRING_SET_FIELD_NUMBER /* 6 */:
                            j20 = c6.f.Y(parcel, readInt17);
                            break;
                        case a4.j.DOUBLE_FIELD_NUMBER /* 7 */:
                            str13 = c6.f.x(parcel, readInt17);
                            break;
                        default:
                            c6.f.c0(parcel, readInt17);
                            break;
                    }
                }
                c6.f.A(parcel, g018);
                return new a4(j19, bArr, str12, bundle6, i31, j20, str13);
            case 19:
                int g019 = c6.f.g0(parcel);
                while (true) {
                    ArrayList arrayList2 = null;
                    while (parcel.dataPosition() < g019) {
                        int readInt18 = parcel.readInt();
                        if (((char) readInt18) != 1) {
                            c6.f.c0(parcel, readInt18);
                        } else {
                            int Z = c6.f.Z(parcel, readInt18);
                            int dataPosition = parcel.dataPosition();
                            if (Z == 0) {
                                break;
                            }
                            ArrayList arrayList3 = new ArrayList();
                            int readInt19 = parcel.readInt();
                            for (int i32 = 0; i32 < readInt19; i32++) {
                                arrayList3.add(Integer.valueOf(parcel.readInt()));
                            }
                            parcel.setDataPosition(dataPosition + Z);
                            arrayList2 = arrayList3;
                        }
                    }
                    c6.f.A(parcel, g019);
                    return new b4(arrayList2);
                    break;
                }
            case 20:
                int g020 = c6.f.g0(parcel);
                ArrayList arrayList4 = null;
                while (parcel.dataPosition() < g020) {
                    int readInt20 = parcel.readInt();
                    if (((char) readInt20) != 1) {
                        c6.f.c0(parcel, readInt20);
                    } else {
                        arrayList4 = c6.f.z(parcel, readInt20, a4.CREATOR);
                    }
                }
                c6.f.A(parcel, g020);
                return new c4(arrayList4);
            case 21:
                int g021 = c6.f.g0(parcel);
                String str14 = null;
                Long l10 = null;
                Float f3 = null;
                String str15 = null;
                String str16 = null;
                Double d10 = null;
                long j21 = 0;
                int i33 = 0;
                while (parcel.dataPosition() < g021) {
                    int readInt21 = parcel.readInt();
                    switch ((char) readInt21) {
                        case 1:
                            i33 = c6.f.X(parcel, readInt21);
                            break;
                        case 2:
                            str14 = c6.f.x(parcel, readInt21);
                            break;
                        case a4.j.INTEGER_FIELD_NUMBER /* 3 */:
                            j21 = c6.f.Y(parcel, readInt21);
                            break;
                        case a4.j.LONG_FIELD_NUMBER /* 4 */:
                            int Z2 = c6.f.Z(parcel, readInt21);
                            if (Z2 == 0) {
                                l10 = null;
                                break;
                            } else {
                                c6.f.k0(parcel, Z2, 8);
                                l10 = Long.valueOf(parcel.readLong());
                                break;
                            }
                        case a4.j.STRING_FIELD_NUMBER /* 5 */:
                            int Z3 = c6.f.Z(parcel, readInt21);
                            if (Z3 == 0) {
                                f3 = null;
                                break;
                            } else {
                                c6.f.k0(parcel, Z3, 4);
                                f3 = Float.valueOf(parcel.readFloat());
                                break;
                            }
                        case a4.j.STRING_SET_FIELD_NUMBER /* 6 */:
                            str15 = c6.f.x(parcel, readInt21);
                            break;
                        case a4.j.DOUBLE_FIELD_NUMBER /* 7 */:
                            str16 = c6.f.x(parcel, readInt21);
                            break;
                        case a4.j.BYTES_FIELD_NUMBER /* 8 */:
                            int Z4 = c6.f.Z(parcel, readInt21);
                            if (Z4 == 0) {
                                d10 = null;
                                break;
                            } else {
                                c6.f.k0(parcel, Z4, 8);
                                d10 = Double.valueOf(parcel.readDouble());
                                break;
                            }
                        default:
                            c6.f.c0(parcel, readInt21);
                            break;
                    }
                }
                c6.f.A(parcel, g021);
                return new m4(i33, str14, j21, l10, f3, str15, str16, d10);
            case 22:
                int g022 = c6.f.g0(parcel);
                long j22 = 0;
                long j23 = 0;
                long j24 = 0;
                long j25 = 0;
                long j26 = 0;
                long j27 = 0;
                long j28 = 0;
                long j29 = 0;
                boolean z20 = false;
                int i34 = 0;
                boolean z21 = false;
                boolean z22 = false;
                int i35 = 0;
                int i36 = 0;
                String str17 = "";
                String str18 = str17;
                String str19 = str18;
                String str20 = str19;
                String str21 = null;
                String str22 = null;
                String str23 = null;
                String str24 = null;
                String str25 = null;
                String str26 = null;
                Boolean bool = null;
                ArrayList<String> arrayList5 = null;
                String str27 = null;
                String str28 = null;
                int i37 = 100;
                boolean z23 = true;
                boolean z24 = true;
                long j30 = -2147483648L;
                while (parcel.dataPosition() < g022) {
                    int readInt22 = parcel.readInt();
                    switch ((char) readInt22) {
                        case 2:
                            str21 = c6.f.x(parcel, readInt22);
                            break;
                        case a4.j.INTEGER_FIELD_NUMBER /* 3 */:
                            str22 = c6.f.x(parcel, readInt22);
                            break;
                        case a4.j.LONG_FIELD_NUMBER /* 4 */:
                            str23 = c6.f.x(parcel, readInt22);
                            break;
                        case a4.j.STRING_FIELD_NUMBER /* 5 */:
                            str24 = c6.f.x(parcel, readInt22);
                            break;
                        case a4.j.STRING_SET_FIELD_NUMBER /* 6 */:
                            j22 = c6.f.Y(parcel, readInt22);
                            break;
                        case a4.j.DOUBLE_FIELD_NUMBER /* 7 */:
                            j23 = c6.f.Y(parcel, readInt22);
                            break;
                        case a4.j.BYTES_FIELD_NUMBER /* 8 */:
                            str25 = c6.f.x(parcel, readInt22);
                            break;
                        case '\t':
                            z23 = c6.f.V(parcel, readInt22);
                            break;
                        case '\n':
                            z20 = c6.f.V(parcel, readInt22);
                            break;
                        case RequestError.STOP_TRACKING /* 11 */:
                            j30 = c6.f.Y(parcel, readInt22);
                            break;
                        case '\f':
                            str26 = c6.f.x(parcel, readInt22);
                            break;
                        case '\r':
                        case 17:
                        case 19:
                        case 20:
                        case 24:
                        case '!':
                        default:
                            c6.f.c0(parcel, readInt22);
                            break;
                        case 14:
                            j24 = c6.f.Y(parcel, readInt22);
                            break;
                        case 15:
                            i34 = c6.f.X(parcel, readInt22);
                            break;
                        case 16:
                            z24 = c6.f.V(parcel, readInt22);
                            break;
                        case 18:
                            z21 = c6.f.V(parcel, readInt22);
                            break;
                        case 21:
                            int Z5 = c6.f.Z(parcel, readInt22);
                            if (Z5 == 0) {
                                bool = null;
                                break;
                            } else {
                                c6.f.k0(parcel, Z5, 4);
                                bool = Boolean.valueOf(parcel.readInt() != 0);
                                break;
                            }
                        case 22:
                            j25 = c6.f.Y(parcel, readInt22);
                            break;
                        case 23:
                            int Z6 = c6.f.Z(parcel, readInt22);
                            int dataPosition2 = parcel.dataPosition();
                            if (Z6 == 0) {
                                arrayList5 = null;
                                break;
                            } else {
                                ArrayList<String> createStringArrayList = parcel.createStringArrayList();
                                parcel.setDataPosition(dataPosition2 + Z6);
                                arrayList5 = createStringArrayList;
                                break;
                            }
                        case 25:
                            str17 = c6.f.x(parcel, readInt22);
                            break;
                        case 26:
                            str18 = c6.f.x(parcel, readInt22);
                            break;
                        case 27:
                            str27 = c6.f.x(parcel, readInt22);
                            break;
                        case 28:
                            z22 = c6.f.V(parcel, readInt22);
                            break;
                        case 29:
                            j26 = c6.f.Y(parcel, readInt22);
                            break;
                        case 30:
                            i37 = c6.f.X(parcel, readInt22);
                            break;
                        case 31:
                            str19 = c6.f.x(parcel, readInt22);
                            break;
                        case ' ':
                            i35 = c6.f.X(parcel, readInt22);
                            break;
                        case '\"':
                            j27 = c6.f.Y(parcel, readInt22);
                            break;
                        case '#':
                            str28 = c6.f.x(parcel, readInt22);
                            break;
                        case '$':
                            str20 = c6.f.x(parcel, readInt22);
                            break;
                        case '%':
                            j28 = c6.f.Y(parcel, readInt22);
                            break;
                        case '&':
                            i36 = c6.f.X(parcel, readInt22);
                            break;
                        case '\'':
                            j29 = c6.f.Y(parcel, readInt22);
                            break;
                    }
                }
                c6.f.A(parcel, g022);
                return new r4(str21, str22, str23, str24, j22, j23, str25, z23, z20, j30, str26, j24, i34, z24, z21, bool, j25, arrayList5, str17, str18, str27, z22, j26, i37, str19, i35, j27, str28, str20, j28, i36, j29);
            case 23:
                t3.g gVar2 = new t3.g(parcel);
                gVar2.f9273d = parcel.readInt();
                return gVar2;
            case 24:
                int g023 = c6.f.g0(parcel);
                Intent intent = null;
                int i38 = 0;
                int i39 = 0;
                while (parcel.dataPosition() < g023) {
                    int readInt23 = parcel.readInt();
                    char c19 = (char) readInt23;
                    if (c19 == 1) {
                        i38 = c6.f.X(parcel, readInt23);
                    } else if (c19 == 2) {
                        i39 = c6.f.X(parcel, readInt23);
                    } else if (c19 != 3) {
                        c6.f.c0(parcel, readInt23);
                    } else {
                        intent = (Intent) c6.f.w(parcel, readInt23, Intent.CREATOR);
                    }
                }
                c6.f.A(parcel, g023);
                return new u7.b(i38, i39, intent);
            case 25:
                int g024 = c6.f.g0(parcel);
                ArrayList<String> arrayList6 = null;
                String str29 = null;
                while (parcel.dataPosition() < g024) {
                    int readInt24 = parcel.readInt();
                    char c20 = (char) readInt24;
                    if (c20 == 1) {
                        int Z7 = c6.f.Z(parcel, readInt24);
                        int dataPosition3 = parcel.dataPosition();
                        if (Z7 == 0) {
                            arrayList6 = null;
                        } else {
                            ArrayList<String> createStringArrayList2 = parcel.createStringArrayList();
                            parcel.setDataPosition(dataPosition3 + Z7);
                            arrayList6 = createStringArrayList2;
                        }
                    } else if (c20 != 2) {
                        c6.f.c0(parcel, readInt24);
                    } else {
                        str29 = c6.f.x(parcel, readInt24);
                    }
                }
                c6.f.A(parcel, g024);
                return new u7.d(str29, arrayList6);
            case 26:
                int g025 = c6.f.g0(parcel);
                z6.b bVar2 = null;
                int i40 = 0;
                w wVar = null;
                while (parcel.dataPosition() < g025) {
                    int readInt25 = parcel.readInt();
                    char c21 = (char) readInt25;
                    if (c21 == 1) {
                        i40 = c6.f.X(parcel, readInt25);
                    } else if (c21 == 2) {
                        bVar2 = (z6.b) c6.f.w(parcel, readInt25, z6.b.CREATOR);
                    } else if (c21 != 3) {
                        c6.f.c0(parcel, readInt25);
                    } else {
                        wVar = (w) c6.f.w(parcel, readInt25, w.CREATOR);
                    }
                }
                c6.f.A(parcel, g025);
                return new u7.e(i40, bVar2, wVar);
            case 27:
                int g026 = c6.f.g0(parcel);
                String str30 = null;
                String str31 = null;
                String str32 = null;
                String str33 = null;
                Uri uri = null;
                String str34 = null;
                String str35 = null;
                ArrayList arrayList7 = null;
                String str36 = null;
                String str37 = null;
                long j31 = 0;
                while (parcel.dataPosition() < g026) {
                    int readInt26 = parcel.readInt();
                    switch ((char) readInt26) {
                        case 2:
                            str30 = c6.f.x(parcel, readInt26);
                            break;
                        case a4.j.INTEGER_FIELD_NUMBER /* 3 */:
                            str31 = c6.f.x(parcel, readInt26);
                            break;
                        case a4.j.LONG_FIELD_NUMBER /* 4 */:
                            str32 = c6.f.x(parcel, readInt26);
                            break;
                        case a4.j.STRING_FIELD_NUMBER /* 5 */:
                            str33 = c6.f.x(parcel, readInt26);
                            break;
                        case a4.j.STRING_SET_FIELD_NUMBER /* 6 */:
                            uri = (Uri) c6.f.w(parcel, readInt26, Uri.CREATOR);
                            break;
                        case a4.j.DOUBLE_FIELD_NUMBER /* 7 */:
                            str34 = c6.f.x(parcel, readInt26);
                            break;
                        case a4.j.BYTES_FIELD_NUMBER /* 8 */:
                            j31 = c6.f.Y(parcel, readInt26);
                            break;
                        case '\t':
                            str35 = c6.f.x(parcel, readInt26);
                            break;
                        case '\n':
                            arrayList7 = c6.f.z(parcel, readInt26, Scope.CREATOR);
                            break;
                        case RequestError.STOP_TRACKING /* 11 */:
                            str36 = c6.f.x(parcel, readInt26);
                            break;
                        case '\f':
                            str37 = c6.f.x(parcel, readInt26);
                            break;
                        default:
                            c6.f.c0(parcel, readInt26);
                            break;
                    }
                }
                c6.f.A(parcel, g026);
                return new GoogleSignInAccount(str30, str31, str32, str33, uri, str34, j31, str35, arrayList7, str36, str37);
            case 28:
                int g027 = c6.f.g0(parcel);
                Intent intent2 = null;
                while (parcel.dataPosition() < g027) {
                    int readInt27 = parcel.readInt();
                    if (((char) readInt27) != 1) {
                        c6.f.c0(parcel, readInt27);
                    } else {
                        intent2 = (Intent) c6.f.w(parcel, readInt27, Intent.CREATOR);
                    }
                }
                c6.f.A(parcel, g027);
                return new y6.a(intent2);
            default:
                return new y6.f(parcel.readStrongBinder());
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i3) {
        switch (this.f1969a) {
            case 0:
                return new n[i3];
            case 1:
                return new q[i3];
            case 2:
                return new k[i3];
            case a4.j.INTEGER_FIELD_NUMBER /* 3 */:
                return new v[i3];
            case a4.j.LONG_FIELD_NUMBER /* 4 */:
                return new w[i3];
            case a4.j.STRING_FIELD_NUMBER /* 5 */:
                return new m[i3];
            case a4.j.STRING_SET_FIELD_NUMBER /* 6 */:
                return new k0[i3];
            case a4.j.DOUBLE_FIELD_NUMBER /* 7 */:
                return new g[i3];
            case a4.j.BYTES_FIELD_NUMBER /* 8 */:
                return new h[i3];
            case 9:
                return new com.google.firebase.messaging.u[i3];
            case 10:
                return new h.a[i3];
            case RequestError.STOP_TRACKING /* 11 */:
                return new ParcelImpl[i3];
            case 12:
                return new s7.d[i3];
            case 13:
                return new s7.e[i3];
            case 14:
                return new s7.i[i3];
            case 15:
                return new s7.t[i3];
            case 16:
                return new s7.u[i3];
            case 17:
                return new x3[i3];
            case 18:
                return new a4[i3];
            case 19:
                return new b4[i3];
            case 20:
                return new c4[i3];
            case 21:
                return new m4[i3];
            case 22:
                return new r4[i3];
            case 23:
                return new t3.g[i3];
            case 24:
                return new u7.b[i3];
            case 25:
                return new u7.d[i3];
            case 26:
                return new u7.e[i3];
            case 27:
                return new GoogleSignInAccount[i3];
            case 28:
                return new y6.a[i3];
            default:
                return new y6.f[i3];
        }
    }
}
