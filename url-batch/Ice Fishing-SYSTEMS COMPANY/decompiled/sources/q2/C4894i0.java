package q2;

import android.location.Location;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* renamed from: q2.i0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4894i0 implements Parcelable.Creator {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f40077a;

    public /* synthetic */ C4894i0(int i) {
        this.f40077a = i;
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.f40077a) {
            case 0:
                int F8 = K3.b.F(parcel);
                String str = null;
                String str2 = null;
                while (parcel.dataPosition() < F8) {
                    int readInt = parcel.readInt();
                    char c4 = (char) readInt;
                    if (c4 == 1) {
                        str = K3.b.i(parcel, readInt);
                    } else if (c4 != 2) {
                        K3.b.C(parcel, readInt);
                    } else {
                        str2 = K3.b.i(parcel, readInt);
                    }
                }
                K3.b.m(parcel, F8);
                return new O(str, str2);
            case 1:
                int F9 = K3.b.F(parcel);
                int i = 0;
                while (parcel.dataPosition() < F9) {
                    int readInt2 = parcel.readInt();
                    if (((char) readInt2) != 2) {
                        K3.b.C(parcel, readInt2);
                    } else {
                        i = K3.b.v(parcel, readInt2);
                    }
                }
                K3.b.m(parcel, F9);
                return new D0(i);
            case 2:
                int F10 = K3.b.F(parcel);
                String str3 = null;
                String str4 = null;
                C4927z0 c4927z0 = null;
                IBinder iBinder = null;
                int i4 = 0;
                while (parcel.dataPosition() < F10) {
                    int readInt3 = parcel.readInt();
                    char c9 = (char) readInt3;
                    if (c9 == 1) {
                        i4 = K3.b.v(parcel, readInt3);
                    } else if (c9 == 2) {
                        str3 = K3.b.i(parcel, readInt3);
                    } else if (c9 == 3) {
                        str4 = K3.b.i(parcel, readInt3);
                    } else if (c9 == 4) {
                        c4927z0 = (C4927z0) K3.b.h(parcel, readInt3, C4927z0.CREATOR);
                    } else if (c9 != 5) {
                        K3.b.C(parcel, readInt3);
                    } else {
                        iBinder = K3.b.u(parcel, readInt3);
                    }
                }
                K3.b.m(parcel, F10);
                return new C4927z0(i4, str3, str4, c4927z0, iBinder);
            case 3:
                int F11 = K3.b.F(parcel);
                String str5 = null;
                int i9 = 0;
                int i10 = 0;
                while (parcel.dataPosition() < F11) {
                    int readInt4 = parcel.readInt();
                    char c10 = (char) readInt4;
                    if (c10 == 1) {
                        i9 = K3.b.v(parcel, readInt4);
                    } else if (c10 == 2) {
                        i10 = K3.b.v(parcel, readInt4);
                    } else if (c10 != 3) {
                        K3.b.C(parcel, readInt4);
                    } else {
                        str5 = K3.b.i(parcel, readInt4);
                    }
                }
                K3.b.m(parcel, F11);
                return new M0(i9, i10, str5);
            case 4:
                int F12 = K3.b.F(parcel);
                int i11 = 0;
                int i12 = 0;
                boolean z8 = false;
                String str6 = null;
                d1 d1Var = null;
                while (parcel.dataPosition() < F12) {
                    int readInt5 = parcel.readInt();
                    char c11 = (char) readInt5;
                    if (c11 == 1) {
                        str6 = K3.b.i(parcel, readInt5);
                    } else if (c11 == 2) {
                        i11 = K3.b.v(parcel, readInt5);
                    } else if (c11 == 3) {
                        d1Var = (d1) K3.b.h(parcel, readInt5, d1.CREATOR);
                    } else if (c11 == 4) {
                        i12 = K3.b.v(parcel, readInt5);
                    } else if (c11 != 5) {
                        K3.b.C(parcel, readInt5);
                    } else {
                        z8 = K3.b.t(parcel, readInt5);
                    }
                }
                K3.b.m(parcel, F12);
                return new W0(str6, i11, d1Var, i12, z8);
            case 5:
                int F13 = K3.b.F(parcel);
                int i13 = 0;
                int i14 = 0;
                while (parcel.dataPosition() < F13) {
                    int readInt6 = parcel.readInt();
                    char c12 = (char) readInt6;
                    if (c12 == 1) {
                        i13 = K3.b.v(parcel, readInt6);
                    } else if (c12 != 2) {
                        K3.b.C(parcel, readInt6);
                    } else {
                        i14 = K3.b.v(parcel, readInt6);
                    }
                }
                K3.b.m(parcel, F13);
                return new X0(i13, i14);
            case 6:
                int F14 = K3.b.F(parcel);
                String str7 = null;
                while (parcel.dataPosition() < F14) {
                    int readInt7 = parcel.readInt();
                    if (((char) readInt7) != 15) {
                        K3.b.C(parcel, readInt7);
                    } else {
                        str7 = K3.b.i(parcel, readInt7);
                    }
                }
                K3.b.m(parcel, F14);
                return new Y0(str7);
            case 7:
                int F15 = K3.b.F(parcel);
                boolean z9 = false;
                boolean z10 = false;
                boolean z11 = false;
                while (parcel.dataPosition() < F15) {
                    int readInt8 = parcel.readInt();
                    char c13 = (char) readInt8;
                    if (c13 == 2) {
                        z9 = K3.b.t(parcel, readInt8);
                    } else if (c13 == 3) {
                        z10 = K3.b.t(parcel, readInt8);
                    } else if (c13 != 4) {
                        K3.b.C(parcel, readInt8);
                    } else {
                        z11 = K3.b.t(parcel, readInt8);
                    }
                }
                K3.b.m(parcel, F15);
                return new a1(z9, z10, z11);
            case 8:
                int F16 = K3.b.F(parcel);
                int i15 = 0;
                int i16 = 0;
                boolean z12 = false;
                int i17 = 0;
                boolean z13 = false;
                boolean z14 = false;
                int i18 = 0;
                int i19 = 0;
                int i20 = 0;
                int i21 = 0;
                long j9 = 0;
                long j10 = 0;
                long j11 = 0;
                Bundle bundle = null;
                ArrayList arrayList = null;
                String str8 = null;
                Y0 y02 = null;
                Location location = null;
                String str9 = null;
                Bundle bundle2 = null;
                Bundle bundle3 = null;
                ArrayList arrayList2 = null;
                String str10 = null;
                String str11 = null;
                O o9 = null;
                String str12 = null;
                ArrayList arrayList3 = null;
                String str13 = null;
                while (parcel.dataPosition() < F16) {
                    int readInt9 = parcel.readInt();
                    switch ((char) readInt9) {
                        case 1:
                            i15 = K3.b.v(parcel, readInt9);
                            break;
                        case 2:
                            j9 = K3.b.w(parcel, readInt9);
                            break;
                        case 3:
                            bundle = K3.b.f(parcel, readInt9);
                            break;
                        case 4:
                            i16 = K3.b.v(parcel, readInt9);
                            break;
                        case 5:
                            arrayList = K3.b.k(parcel, readInt9);
                            break;
                        case 6:
                            z12 = K3.b.t(parcel, readInt9);
                            break;
                        case 7:
                            i17 = K3.b.v(parcel, readInt9);
                            break;
                        case '\b':
                            z13 = K3.b.t(parcel, readInt9);
                            break;
                        case '\t':
                            str8 = K3.b.i(parcel, readInt9);
                            break;
                        case '\n':
                            y02 = (Y0) K3.b.h(parcel, readInt9, Y0.CREATOR);
                            break;
                        case 11:
                            location = (Location) K3.b.h(parcel, readInt9, Location.CREATOR);
                            break;
                        case '\f':
                            str9 = K3.b.i(parcel, readInt9);
                            break;
                        case '\r':
                            bundle2 = K3.b.f(parcel, readInt9);
                            break;
                        case 14:
                            bundle3 = K3.b.f(parcel, readInt9);
                            break;
                        case 15:
                            arrayList2 = K3.b.k(parcel, readInt9);
                            break;
                        case 16:
                            str10 = K3.b.i(parcel, readInt9);
                            break;
                        case 17:
                            str11 = K3.b.i(parcel, readInt9);
                            break;
                        case 18:
                            z14 = K3.b.t(parcel, readInt9);
                            break;
                        case 19:
                            o9 = (O) K3.b.h(parcel, readInt9, O.CREATOR);
                            break;
                        case 20:
                            i18 = K3.b.v(parcel, readInt9);
                            break;
                        case 21:
                            str12 = K3.b.i(parcel, readInt9);
                            break;
                        case 22:
                            arrayList3 = K3.b.k(parcel, readInt9);
                            break;
                        case 23:
                            i19 = K3.b.v(parcel, readInt9);
                            break;
                        case 24:
                            str13 = K3.b.i(parcel, readInt9);
                            break;
                        case 25:
                            i20 = K3.b.v(parcel, readInt9);
                            break;
                        case 26:
                            j10 = K3.b.w(parcel, readInt9);
                            break;
                        case 27:
                            j11 = K3.b.w(parcel, readInt9);
                            break;
                        case 28:
                            i21 = K3.b.v(parcel, readInt9);
                            break;
                        default:
                            K3.b.C(parcel, readInt9);
                            break;
                    }
                }
                K3.b.m(parcel, F16);
                return new d1(i15, j9, bundle, i16, arrayList, z12, i17, z13, str8, y02, location, str9, bundle2, bundle3, arrayList2, str10, str11, z14, o9, i18, str12, arrayList3, i19, str13, i20, j10, j11, i21);
            case 9:
                int F17 = K3.b.F(parcel);
                int i22 = 0;
                int i23 = 0;
                boolean z15 = false;
                int i24 = 0;
                int i25 = 0;
                boolean z16 = false;
                boolean z17 = false;
                boolean z18 = false;
                boolean z19 = false;
                boolean z20 = false;
                boolean z21 = false;
                boolean z22 = false;
                boolean z23 = false;
                boolean z24 = false;
                String str14 = null;
                g1[] g1VarArr = null;
                while (parcel.dataPosition() < F17) {
                    int readInt10 = parcel.readInt();
                    switch ((char) readInt10) {
                        case 2:
                            str14 = K3.b.i(parcel, readInt10);
                            break;
                        case 3:
                            i22 = K3.b.v(parcel, readInt10);
                            break;
                        case 4:
                            i23 = K3.b.v(parcel, readInt10);
                            break;
                        case 5:
                            z15 = K3.b.t(parcel, readInt10);
                            break;
                        case 6:
                            i24 = K3.b.v(parcel, readInt10);
                            break;
                        case 7:
                            i25 = K3.b.v(parcel, readInt10);
                            break;
                        case '\b':
                            g1VarArr = (g1[]) K3.b.l(parcel, readInt10, g1.CREATOR);
                            break;
                        case '\t':
                            z16 = K3.b.t(parcel, readInt10);
                            break;
                        case '\n':
                            z17 = K3.b.t(parcel, readInt10);
                            break;
                        case 11:
                            z18 = K3.b.t(parcel, readInt10);
                            break;
                        case '\f':
                            z19 = K3.b.t(parcel, readInt10);
                            break;
                        case '\r':
                            z20 = K3.b.t(parcel, readInt10);
                            break;
                        case 14:
                            z21 = K3.b.t(parcel, readInt10);
                            break;
                        case 15:
                            z22 = K3.b.t(parcel, readInt10);
                            break;
                        case 16:
                            z23 = K3.b.t(parcel, readInt10);
                            break;
                        case 17:
                            z24 = K3.b.t(parcel, readInt10);
                            break;
                        default:
                            K3.b.C(parcel, readInt10);
                            break;
                    }
                }
                K3.b.m(parcel, F17);
                return new g1(str14, i22, i23, z15, i24, i25, g1VarArr, z16, z17, z18, z19, z20, z21, z22, z23, z24);
            case 10:
                int F18 = K3.b.F(parcel);
                long j12 = 0;
                String str15 = null;
                int i26 = 0;
                int i27 = 0;
                while (parcel.dataPosition() < F18) {
                    int readInt11 = parcel.readInt();
                    char c14 = (char) readInt11;
                    if (c14 == 1) {
                        i26 = K3.b.v(parcel, readInt11);
                    } else if (c14 == 2) {
                        i27 = K3.b.v(parcel, readInt11);
                    } else if (c14 == 3) {
                        str15 = K3.b.i(parcel, readInt11);
                    } else if (c14 != 4) {
                        K3.b.C(parcel, readInt11);
                    } else {
                        j12 = K3.b.w(parcel, readInt11);
                    }
                }
                K3.b.m(parcel, F18);
                return new h1(i26, i27, str15, j12);
            case 11:
                int F19 = K3.b.F(parcel);
                String str16 = null;
                C4927z0 c4927z02 = null;
                Bundle bundle4 = null;
                String str17 = null;
                String str18 = null;
                String str19 = null;
                String str20 = null;
                long j13 = 0;
                while (parcel.dataPosition() < F19) {
                    int readInt12 = parcel.readInt();
                    switch ((char) readInt12) {
                        case 1:
                            str16 = K3.b.i(parcel, readInt12);
                            break;
                        case 2:
                            j13 = K3.b.w(parcel, readInt12);
                            break;
                        case 3:
                            c4927z02 = (C4927z0) K3.b.h(parcel, readInt12, C4927z0.CREATOR);
                            break;
                        case 4:
                            bundle4 = K3.b.f(parcel, readInt12);
                            break;
                        case 5:
                            str17 = K3.b.i(parcel, readInt12);
                            break;
                        case 6:
                            str18 = K3.b.i(parcel, readInt12);
                            break;
                        case 7:
                            str19 = K3.b.i(parcel, readInt12);
                            break;
                        case '\b':
                            str20 = K3.b.i(parcel, readInt12);
                            break;
                        default:
                            K3.b.C(parcel, readInt12);
                            break;
                    }
                }
                K3.b.m(parcel, F19);
                return new i1(str16, j13, c4927z02, bundle4, str17, str18, str19, str20);
            default:
                int F20 = K3.b.F(parcel);
                int i28 = 0;
                while (parcel.dataPosition() < F20) {
                    int readInt13 = parcel.readInt();
                    if (((char) readInt13) != 2) {
                        K3.b.C(parcel, readInt13);
                    } else {
                        i28 = K3.b.v(parcel, readInt13);
                    }
                }
                K3.b.m(parcel, F20);
                return new j1(i28);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        switch (this.f40077a) {
            case 0:
                return new O[i];
            case 1:
                return new D0[i];
            case 2:
                return new C4927z0[i];
            case 3:
                return new M0[i];
            case 4:
                return new W0[i];
            case 5:
                return new X0[i];
            case 6:
                return new Y0[i];
            case 7:
                return new a1[i];
            case 8:
                return new d1[i];
            case 9:
                return new g1[i];
            case 10:
                return new h1[i];
            case 11:
                return new i1[i];
            default:
                return new j1[i];
        }
    }
}
