package com.google.android.gms.internal.ads;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import com.anythink.core.common.d.j;
import com.anythink.expressad.foundation.h.p;
import java.util.ArrayList;
import u2.C5107a;

/* loaded from: classes2.dex */
public final class S8 implements Parcelable.Creator {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f27510a;

    public /* synthetic */ S8(int i) {
        this.f27510a = i;
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.f27510a) {
            case 0:
                int F8 = K3.b.F(parcel);
                boolean z8 = false;
                boolean z9 = false;
                boolean z10 = false;
                long j9 = 0;
                ParcelFileDescriptor parcelFileDescriptor = null;
                while (parcel.dataPosition() < F8) {
                    int readInt = parcel.readInt();
                    char c4 = (char) readInt;
                    if (c4 == 2) {
                        parcelFileDescriptor = (ParcelFileDescriptor) K3.b.h(parcel, readInt, ParcelFileDescriptor.CREATOR);
                    } else if (c4 == 3) {
                        z8 = K3.b.t(parcel, readInt);
                    } else if (c4 == 4) {
                        z9 = K3.b.t(parcel, readInt);
                    } else if (c4 == 5) {
                        j9 = K3.b.w(parcel, readInt);
                    } else if (c4 != 6) {
                        K3.b.C(parcel, readInt);
                    } else {
                        z10 = K3.b.t(parcel, readInt);
                    }
                }
                K3.b.m(parcel, F8);
                return new R8(parcelFileDescriptor, z8, z9, j9, z10);
            case 1:
                int F9 = K3.b.F(parcel);
                boolean z11 = false;
                int i = 0;
                String str = null;
                String str2 = null;
                String str3 = null;
                String str4 = null;
                Bundle bundle = null;
                String str5 = null;
                long j10 = 0;
                long j11 = 0;
                while (parcel.dataPosition() < F9) {
                    int readInt2 = parcel.readInt();
                    switch ((char) readInt2) {
                        case 2:
                            str = K3.b.i(parcel, readInt2);
                            break;
                        case 3:
                            j10 = K3.b.w(parcel, readInt2);
                            break;
                        case 4:
                            str2 = K3.b.i(parcel, readInt2);
                            break;
                        case 5:
                            str3 = K3.b.i(parcel, readInt2);
                            break;
                        case 6:
                            str4 = K3.b.i(parcel, readInt2);
                            break;
                        case 7:
                            bundle = K3.b.f(parcel, readInt2);
                            break;
                        case '\b':
                            z11 = K3.b.t(parcel, readInt2);
                            break;
                        case '\t':
                            j11 = K3.b.w(parcel, readInt2);
                            break;
                        case '\n':
                            str5 = K3.b.i(parcel, readInt2);
                            break;
                        case 11:
                            i = K3.b.v(parcel, readInt2);
                            break;
                        default:
                            K3.b.C(parcel, readInt2);
                            break;
                    }
                }
                K3.b.m(parcel, F9);
                return new U8(str, j10, str2, str3, str4, bundle, z11, j11, str5, i);
            case 2:
                int F10 = K3.b.F(parcel);
                int i4 = 0;
                boolean z12 = false;
                int i9 = 0;
                boolean z13 = false;
                int i10 = 0;
                boolean z14 = false;
                int i11 = 0;
                int i12 = 0;
                boolean z15 = false;
                int i13 = 0;
                q2.a1 a1Var = null;
                while (parcel.dataPosition() < F10) {
                    int readInt3 = parcel.readInt();
                    switch ((char) readInt3) {
                        case 1:
                            i4 = K3.b.v(parcel, readInt3);
                            break;
                        case 2:
                            z12 = K3.b.t(parcel, readInt3);
                            break;
                        case 3:
                            i9 = K3.b.v(parcel, readInt3);
                            break;
                        case 4:
                            z13 = K3.b.t(parcel, readInt3);
                            break;
                        case 5:
                            i10 = K3.b.v(parcel, readInt3);
                            break;
                        case 6:
                            a1Var = (q2.a1) K3.b.h(parcel, readInt3, q2.a1.CREATOR);
                            break;
                        case 7:
                            z14 = K3.b.t(parcel, readInt3);
                            break;
                        case '\b':
                            i11 = K3.b.v(parcel, readInt3);
                            break;
                        case '\t':
                            i12 = K3.b.v(parcel, readInt3);
                            break;
                        case '\n':
                            z15 = K3.b.t(parcel, readInt3);
                            break;
                        case 11:
                            i13 = K3.b.v(parcel, readInt3);
                            break;
                        default:
                            K3.b.C(parcel, readInt3);
                            break;
                    }
                }
                K3.b.m(parcel, F10);
                return new C3261gb(i4, z12, i9, z13, i10, a1Var, z14, i11, i12, z15, i13);
            case 3:
                int F11 = K3.b.F(parcel);
                String str6 = null;
                String[] strArr = null;
                String[] strArr2 = null;
                while (parcel.dataPosition() < F11) {
                    int readInt4 = parcel.readInt();
                    char c9 = (char) readInt4;
                    if (c9 == 1) {
                        str6 = K3.b.i(parcel, readInt4);
                    } else if (c9 == 2) {
                        strArr = K3.b.j(parcel, readInt4);
                    } else if (c9 != 3) {
                        K3.b.C(parcel, readInt4);
                    } else {
                        strArr2 = K3.b.j(parcel, readInt4);
                    }
                }
                K3.b.m(parcel, F11);
                return new C3692oc(str6, strArr, strArr2);
            case 4:
                int F12 = K3.b.F(parcel);
                long j12 = 0;
                boolean z16 = false;
                int i14 = 0;
                boolean z17 = false;
                String str7 = null;
                byte[] bArr = null;
                String[] strArr3 = null;
                String[] strArr4 = null;
                while (parcel.dataPosition() < F12) {
                    int readInt5 = parcel.readInt();
                    switch ((char) readInt5) {
                        case 1:
                            z16 = K3.b.t(parcel, readInt5);
                            break;
                        case 2:
                            str7 = K3.b.i(parcel, readInt5);
                            break;
                        case 3:
                            i14 = K3.b.v(parcel, readInt5);
                            break;
                        case 4:
                            bArr = K3.b.g(parcel, readInt5);
                            break;
                        case 5:
                            strArr3 = K3.b.j(parcel, readInt5);
                            break;
                        case 6:
                            strArr4 = K3.b.j(parcel, readInt5);
                            break;
                        case 7:
                            z17 = K3.b.t(parcel, readInt5);
                            break;
                        case '\b':
                            j12 = K3.b.w(parcel, readInt5);
                            break;
                        default:
                            K3.b.C(parcel, readInt5);
                            break;
                    }
                }
                K3.b.m(parcel, F12);
                return new C3746pc(z16, str7, i14, bArr, strArr3, strArr4, z17, j12);
            case 5:
                int F13 = K3.b.F(parcel);
                String str8 = null;
                boolean z18 = false;
                int i15 = 0;
                String str9 = null;
                while (parcel.dataPosition() < F13) {
                    int readInt6 = parcel.readInt();
                    char c10 = (char) readInt6;
                    if (c10 == 1) {
                        str8 = K3.b.i(parcel, readInt6);
                    } else if (c10 == 2) {
                        z18 = K3.b.t(parcel, readInt6);
                    } else if (c10 == 3) {
                        i15 = K3.b.v(parcel, readInt6);
                    } else if (c10 != 4) {
                        K3.b.C(parcel, readInt6);
                    } else {
                        str9 = K3.b.i(parcel, readInt6);
                    }
                }
                K3.b.m(parcel, F13);
                return new C4015uc(str8, i15, str9, z18);
            case 6:
                int F14 = K3.b.F(parcel);
                String str10 = null;
                Bundle bundle2 = null;
                while (parcel.dataPosition() < F14) {
                    int readInt7 = parcel.readInt();
                    char c11 = (char) readInt7;
                    if (c11 == 1) {
                        str10 = K3.b.i(parcel, readInt7);
                    } else if (c11 != 2) {
                        K3.b.C(parcel, readInt7);
                    } else {
                        bundle2 = K3.b.f(parcel, readInt7);
                    }
                }
                K3.b.m(parcel, F14);
                return new C4285zc(str10, bundle2);
            case 7:
                int F15 = K3.b.F(parcel);
                int i16 = 0;
                int i17 = 0;
                String str11 = null;
                int i18 = 0;
                while (parcel.dataPosition() < F15) {
                    int readInt8 = parcel.readInt();
                    char c12 = (char) readInt8;
                    if (c12 == 1) {
                        i18 = K3.b.v(parcel, readInt8);
                    } else if (c12 == 2) {
                        str11 = K3.b.i(parcel, readInt8);
                    } else if (c12 == 3) {
                        i17 = K3.b.v(parcel, readInt8);
                    } else if (c12 != 1000) {
                        K3.b.C(parcel, readInt8);
                    } else {
                        i16 = K3.b.v(parcel, readInt8);
                    }
                }
                K3.b.m(parcel, F15);
                return new C2464Ac(i16, str11, i18, i17);
            case 8:
                int F16 = K3.b.F(parcel);
                int i19 = 0;
                int i20 = 0;
                int i21 = 0;
                while (parcel.dataPosition() < F16) {
                    int readInt9 = parcel.readInt();
                    char c13 = (char) readInt9;
                    if (c13 == 1) {
                        i19 = K3.b.v(parcel, readInt9);
                    } else if (c13 == 2) {
                        i20 = K3.b.v(parcel, readInt9);
                    } else if (c13 != 3) {
                        K3.b.C(parcel, readInt9);
                    } else {
                        i21 = K3.b.v(parcel, readInt9);
                    }
                }
                K3.b.m(parcel, F16);
                return new C2754Rd(i19, i20, i21);
            case 9:
                int F17 = K3.b.F(parcel);
                IBinder iBinder = null;
                IBinder iBinder2 = null;
                while (parcel.dataPosition() < F17) {
                    int readInt10 = parcel.readInt();
                    char c14 = (char) readInt10;
                    if (c14 == 1) {
                        iBinder = K3.b.u(parcel, readInt10);
                    } else if (c14 != 2) {
                        K3.b.C(parcel, readInt10);
                    } else {
                        iBinder2 = K3.b.u(parcel, readInt10);
                    }
                }
                K3.b.m(parcel, F17);
                return new C4179xe(iBinder, iBinder2);
            case 10:
                int F18 = K3.b.F(parcel);
                float f6 = 0.0f;
                float f9 = 0.0f;
                long j13 = 0;
                long j14 = 0;
                int i22 = 0;
                Bundle bundle3 = null;
                q2.d1 d1Var = null;
                q2.g1 g1Var = null;
                String str12 = null;
                ApplicationInfo applicationInfo = null;
                PackageInfo packageInfo = null;
                String str13 = null;
                String str14 = null;
                String str15 = null;
                C5107a c5107a = null;
                Bundle bundle4 = null;
                int i23 = 0;
                ArrayList arrayList = null;
                Bundle bundle5 = null;
                boolean z19 = false;
                int i24 = 0;
                int i25 = 0;
                String str16 = null;
                String str17 = null;
                ArrayList arrayList2 = null;
                String str18 = null;
                C3261gb c3261gb = null;
                ArrayList arrayList3 = null;
                String str19 = null;
                boolean z20 = false;
                int i26 = 0;
                int i27 = 0;
                boolean z21 = false;
                String str20 = null;
                String str21 = null;
                boolean z22 = false;
                int i28 = 0;
                Bundle bundle6 = null;
                String str22 = null;
                q2.D0 d02 = null;
                boolean z23 = false;
                Bundle bundle7 = null;
                String str23 = null;
                String str24 = null;
                String str25 = null;
                boolean z24 = false;
                ArrayList arrayList4 = null;
                String str26 = null;
                ArrayList arrayList5 = null;
                int i29 = 0;
                boolean z25 = false;
                boolean z26 = false;
                boolean z27 = false;
                ArrayList arrayList6 = null;
                String str27 = null;
                C2464Ac c2464Ac = null;
                String str28 = null;
                Bundle bundle8 = null;
                while (parcel.dataPosition() < F18) {
                    int readInt11 = parcel.readInt();
                    switch ((char) readInt11) {
                        case 1:
                            i22 = K3.b.v(parcel, readInt11);
                            break;
                        case 2:
                            bundle3 = K3.b.f(parcel, readInt11);
                            break;
                        case 3:
                            d1Var = (q2.d1) K3.b.h(parcel, readInt11, q2.d1.CREATOR);
                            break;
                        case 4:
                            g1Var = (q2.g1) K3.b.h(parcel, readInt11, q2.g1.CREATOR);
                            break;
                        case 5:
                            str12 = K3.b.i(parcel, readInt11);
                            break;
                        case 6:
                            applicationInfo = (ApplicationInfo) K3.b.h(parcel, readInt11, ApplicationInfo.CREATOR);
                            break;
                        case 7:
                            packageInfo = (PackageInfo) K3.b.h(parcel, readInt11, PackageInfo.CREATOR);
                            break;
                        case '\b':
                            str13 = K3.b.i(parcel, readInt11);
                            break;
                        case '\t':
                            str14 = K3.b.i(parcel, readInt11);
                            break;
                        case '\n':
                            str15 = K3.b.i(parcel, readInt11);
                            break;
                        case 11:
                            c5107a = (C5107a) K3.b.h(parcel, readInt11, C5107a.CREATOR);
                            break;
                        case '\f':
                            bundle4 = K3.b.f(parcel, readInt11);
                            break;
                        case '\r':
                            i23 = K3.b.v(parcel, readInt11);
                            break;
                        case 14:
                            arrayList = K3.b.k(parcel, readInt11);
                            break;
                        case 15:
                            bundle5 = K3.b.f(parcel, readInt11);
                            break;
                        case 16:
                            z19 = K3.b.t(parcel, readInt11);
                            break;
                        case 17:
                        case 22:
                        case 23:
                        case 24:
                        case ' ':
                        case com.anythink.basead.b.b.j.f5963M /* 38 */:
                        case '>':
                        default:
                            K3.b.C(parcel, readInt11);
                            break;
                        case 18:
                            i24 = K3.b.v(parcel, readInt11);
                            break;
                        case 19:
                            i25 = K3.b.v(parcel, readInt11);
                            break;
                        case 20:
                            K3.b.H(parcel, readInt11, 4);
                            f6 = parcel.readFloat();
                            break;
                        case 21:
                            str16 = K3.b.i(parcel, readInt11);
                            break;
                        case 25:
                            j13 = K3.b.w(parcel, readInt11);
                            break;
                        case 26:
                            str17 = K3.b.i(parcel, readInt11);
                            break;
                        case 27:
                            arrayList2 = K3.b.k(parcel, readInt11);
                            break;
                        case 28:
                            str18 = K3.b.i(parcel, readInt11);
                            break;
                        case 29:
                            c3261gb = (C3261gb) K3.b.h(parcel, readInt11, C3261gb.CREATOR);
                            break;
                        case 30:
                            arrayList3 = K3.b.k(parcel, readInt11);
                            break;
                        case 31:
                            j14 = K3.b.w(parcel, readInt11);
                            break;
                        case '!':
                            str19 = K3.b.i(parcel, readInt11);
                            break;
                        case '\"':
                            K3.b.H(parcel, readInt11, 4);
                            f9 = parcel.readFloat();
                            break;
                        case '#':
                            i26 = K3.b.v(parcel, readInt11);
                            break;
                        case '$':
                            i27 = K3.b.v(parcel, readInt11);
                            break;
                        case '%':
                            z21 = K3.b.t(parcel, readInt11);
                            break;
                        case '\'':
                            str20 = K3.b.i(parcel, readInt11);
                            break;
                        case com.anythink.basead.b.b.j.f5965O /* 40 */:
                            z20 = K3.b.t(parcel, readInt11);
                            break;
                        case ')':
                            str21 = K3.b.i(parcel, readInt11);
                            break;
                        case '*':
                            z22 = K3.b.t(parcel, readInt11);
                            break;
                        case com.anythink.basead.b.b.j.f5968R /* 43 */:
                            i28 = K3.b.v(parcel, readInt11);
                            break;
                        case com.anythink.basead.b.b.j.f5969S /* 44 */:
                            bundle6 = K3.b.f(parcel, readInt11);
                            break;
                        case com.anythink.basead.b.b.j.f5970T /* 45 */:
                            str22 = K3.b.i(parcel, readInt11);
                            break;
                        case '.':
                            d02 = (q2.D0) K3.b.h(parcel, readInt11, q2.D0.CREATOR);
                            break;
                        case '/':
                            z23 = K3.b.t(parcel, readInt11);
                            break;
                        case com.anythink.basead.b.b.j.f5973W /* 48 */:
                            bundle7 = K3.b.f(parcel, readInt11);
                            break;
                        case com.anythink.basead.b.b.j.f5974X /* 49 */:
                            str23 = K3.b.i(parcel, readInt11);
                            break;
                        case '2':
                            str24 = K3.b.i(parcel, readInt11);
                            break;
                        case '3':
                            str25 = K3.b.i(parcel, readInt11);
                            break;
                        case '4':
                            z24 = K3.b.t(parcel, readInt11);
                            break;
                        case com.anythink.core.common.n.a.i.f14980d /* 53 */:
                            int x3 = K3.b.x(parcel, readInt11);
                            int dataPosition = parcel.dataPosition();
                            if (x3 == 0) {
                                arrayList4 = null;
                                break;
                            } else {
                                ArrayList arrayList7 = new ArrayList();
                                int readInt12 = parcel.readInt();
                                for (int i30 = 0; i30 < readInt12; i30++) {
                                    arrayList7.add(Integer.valueOf(parcel.readInt()));
                                }
                                parcel.setDataPosition(dataPosition + x3);
                                arrayList4 = arrayList7;
                                break;
                            }
                        case '6':
                            str26 = K3.b.i(parcel, readInt11);
                            break;
                        case '7':
                            arrayList5 = K3.b.k(parcel, readInt11);
                            break;
                        case p.a.f19837e /* 56 */:
                            i29 = K3.b.v(parcel, readInt11);
                            break;
                        case '9':
                            z25 = K3.b.t(parcel, readInt11);
                            break;
                        case ':':
                            z26 = K3.b.t(parcel, readInt11);
                            break;
                        case j.v.f12748n /* 59 */:
                            z27 = K3.b.t(parcel, readInt11);
                            break;
                        case '<':
                            arrayList6 = K3.b.k(parcel, readInt11);
                            break;
                        case '=':
                            str27 = K3.b.i(parcel, readInt11);
                            break;
                        case '?':
                            c2464Ac = (C2464Ac) K3.b.h(parcel, readInt11, C2464Ac.CREATOR);
                            break;
                        case '@':
                            str28 = K3.b.i(parcel, readInt11);
                            break;
                        case j.v.f12733G /* 65 */:
                            bundle8 = K3.b.f(parcel, readInt11);
                            break;
                    }
                }
                K3.b.m(parcel, F18);
                return new C2500Ce(i22, bundle3, d1Var, g1Var, str12, applicationInfo, packageInfo, str13, str14, str15, c5107a, bundle4, i23, arrayList, bundle5, z19, i24, i25, f6, str16, j13, str17, arrayList2, str18, c3261gb, arrayList3, j14, str19, f9, z20, i26, i27, z21, str20, str21, z22, i28, bundle6, str22, d02, z23, bundle7, str23, str24, str25, z24, arrayList4, str26, arrayList5, i29, z25, z26, z27, arrayList6, str27, c2464Ac, str28, bundle8);
            case 11:
                int F19 = K3.b.F(parcel);
                ArrayList arrayList8 = null;
                boolean z28 = false;
                while (parcel.dataPosition() < F19) {
                    int readInt13 = parcel.readInt();
                    char c15 = (char) readInt13;
                    if (c15 == 2) {
                        z28 = K3.b.t(parcel, readInt13);
                    } else if (c15 != 3) {
                        K3.b.C(parcel, readInt13);
                    } else {
                        arrayList8 = K3.b.k(parcel, readInt13);
                    }
                }
                K3.b.m(parcel, F19);
                return new C2517De(z28, arrayList8);
            case 12:
                int F20 = K3.b.F(parcel);
                String str29 = null;
                while (parcel.dataPosition() < F20) {
                    int readInt14 = parcel.readInt();
                    if (((char) readInt14) != 1) {
                        K3.b.C(parcel, readInt14);
                    } else {
                        str29 = K3.b.i(parcel, readInt14);
                    }
                }
                K3.b.m(parcel, F20);
                return new C2534Ee(str29);
            case 13:
                int F21 = K3.b.F(parcel);
                Bundle bundle9 = null;
                C5107a c5107a2 = null;
                ApplicationInfo applicationInfo2 = null;
                String str30 = null;
                ArrayList arrayList9 = null;
                PackageInfo packageInfo2 = null;
                String str31 = null;
                String str32 = null;
                C4087vu c4087vu = null;
                String str33 = null;
                Bundle bundle10 = null;
                boolean z29 = false;
                boolean z30 = false;
                while (parcel.dataPosition() < F21) {
                    int readInt15 = parcel.readInt();
                    switch ((char) readInt15) {
                        case 1:
                            bundle9 = K3.b.f(parcel, readInt15);
                            break;
                        case 2:
                            c5107a2 = (C5107a) K3.b.h(parcel, readInt15, C5107a.CREATOR);
                            break;
                        case 3:
                            applicationInfo2 = (ApplicationInfo) K3.b.h(parcel, readInt15, ApplicationInfo.CREATOR);
                            break;
                        case 4:
                            str30 = K3.b.i(parcel, readInt15);
                            break;
                        case 5:
                            arrayList9 = K3.b.k(parcel, readInt15);
                            break;
                        case 6:
                            packageInfo2 = (PackageInfo) K3.b.h(parcel, readInt15, PackageInfo.CREATOR);
                            break;
                        case 7:
                            str31 = K3.b.i(parcel, readInt15);
                            break;
                        case '\b':
                        default:
                            K3.b.C(parcel, readInt15);
                            break;
                        case '\t':
                            str32 = K3.b.i(parcel, readInt15);
                            break;
                        case '\n':
                            c4087vu = (C4087vu) K3.b.h(parcel, readInt15, C4087vu.CREATOR);
                            break;
                        case 11:
                            str33 = K3.b.i(parcel, readInt15);
                            break;
                        case '\f':
                            z29 = K3.b.t(parcel, readInt15);
                            break;
                        case '\r':
                            z30 = K3.b.t(parcel, readInt15);
                            break;
                        case 14:
                            bundle10 = K3.b.f(parcel, readInt15);
                            break;
                    }
                }
                K3.b.m(parcel, F21);
                return new C2687Ne(bundle9, c5107a2, applicationInfo2, str30, arrayList9, packageInfo2, str31, str32, c4087vu, str33, z29, z30, bundle10);
            case 14:
                int F22 = K3.b.F(parcel);
                q2.d1 d1Var2 = null;
                String str34 = null;
                while (parcel.dataPosition() < F22) {
                    int readInt16 = parcel.readInt();
                    char c16 = (char) readInt16;
                    if (c16 == 2) {
                        d1Var2 = (q2.d1) K3.b.h(parcel, readInt16, q2.d1.CREATOR);
                    } else if (c16 != 3) {
                        K3.b.C(parcel, readInt16);
                    } else {
                        str34 = K3.b.i(parcel, readInt16);
                    }
                }
                K3.b.m(parcel, F22);
                return new C2840We(str34, d1Var2);
            case 15:
                int F23 = K3.b.F(parcel);
                int i31 = 0;
                String str35 = null;
                while (parcel.dataPosition() < F23) {
                    int readInt17 = parcel.readInt();
                    char c17 = (char) readInt17;
                    if (c17 == 2) {
                        str35 = K3.b.i(parcel, readInt17);
                    } else if (c17 != 3) {
                        K3.b.C(parcel, readInt17);
                    } else {
                        i31 = K3.b.v(parcel, readInt17);
                    }
                }
                K3.b.m(parcel, F23);
                return new C2938af(str35, i31);
            case 16:
                int F24 = K3.b.F(parcel);
                String str36 = null;
                String str37 = null;
                while (parcel.dataPosition() < F24) {
                    int readInt18 = parcel.readInt();
                    char c18 = (char) readInt18;
                    if (c18 == 1) {
                        str36 = K3.b.i(parcel, readInt18);
                    } else if (c18 != 2) {
                        K3.b.C(parcel, readInt18);
                    } else {
                        str37 = K3.b.i(parcel, readInt18);
                    }
                }
                K3.b.m(parcel, F24);
                return new C3856rf(str36, str37);
            case 17:
                int F25 = K3.b.F(parcel);
                String str38 = null;
                String str39 = null;
                ArrayList arrayList10 = null;
                ArrayList arrayList11 = null;
                boolean z31 = false;
                boolean z32 = false;
                boolean z33 = false;
                boolean z34 = false;
                while (parcel.dataPosition() < F25) {
                    int readInt19 = parcel.readInt();
                    switch ((char) readInt19) {
                        case 2:
                            str38 = K3.b.i(parcel, readInt19);
                            break;
                        case 3:
                            str39 = K3.b.i(parcel, readInt19);
                            break;
                        case 4:
                            z31 = K3.b.t(parcel, readInt19);
                            break;
                        case 5:
                            z32 = K3.b.t(parcel, readInt19);
                            break;
                        case 6:
                            arrayList10 = K3.b.k(parcel, readInt19);
                            break;
                        case 7:
                            z33 = K3.b.t(parcel, readInt19);
                            break;
                        case '\b':
                            z34 = K3.b.t(parcel, readInt19);
                            break;
                        case '\t':
                            arrayList11 = K3.b.k(parcel, readInt19);
                            break;
                        default:
                            K3.b.C(parcel, readInt19);
                            break;
                    }
                }
                K3.b.m(parcel, F25);
                return new C4126wf(str38, str39, z31, z32, arrayList10, z33, z34, arrayList11);
            case 18:
                int F26 = K3.b.F(parcel);
                String str40 = null;
                String str41 = null;
                q2.g1 g1Var2 = null;
                q2.d1 d1Var3 = null;
                while (parcel.dataPosition() < F26) {
                    int readInt20 = parcel.readInt();
                    char c19 = (char) readInt20;
                    if (c19 == 1) {
                        str40 = K3.b.i(parcel, readInt20);
                    } else if (c19 == 2) {
                        str41 = K3.b.i(parcel, readInt20);
                    } else if (c19 == 3) {
                        g1Var2 = (q2.g1) K3.b.h(parcel, readInt20, q2.g1.CREATOR);
                    } else if (c19 != 4) {
                        K3.b.C(parcel, readInt20);
                    } else {
                        d1Var3 = (q2.d1) K3.b.h(parcel, readInt20, q2.d1.CREATOR);
                    }
                }
                K3.b.m(parcel, F26);
                return new C2790Tf(str40, str41, g1Var2, d1Var3);
            case 19:
                int F27 = K3.b.F(parcel);
                int i32 = 0;
                int i33 = 0;
                int i34 = 0;
                int i35 = 0;
                int i36 = 0;
                int i37 = 0;
                String str42 = null;
                while (parcel.dataPosition() < F27) {
                    int readInt21 = parcel.readInt();
                    switch ((char) readInt21) {
                        case 1:
                            i32 = K3.b.v(parcel, readInt21);
                            break;
                        case 2:
                            i33 = K3.b.v(parcel, readInt21);
                            break;
                        case 3:
                            i34 = K3.b.v(parcel, readInt21);
                            break;
                        case 4:
                            i35 = K3.b.v(parcel, readInt21);
                            break;
                        case 5:
                            str42 = K3.b.i(parcel, readInt21);
                            break;
                        case 6:
                            i36 = K3.b.v(parcel, readInt21);
                            break;
                        case 7:
                            i37 = K3.b.v(parcel, readInt21);
                            break;
                        default:
                            K3.b.C(parcel, readInt21);
                            break;
                    }
                }
                K3.b.m(parcel, F27);
                return new C4087vu(i32, i33, i34, i35, str42, i36, i37);
            case 20:
                int F28 = K3.b.F(parcel);
                byte[] bArr2 = null;
                int i38 = 0;
                while (parcel.dataPosition() < F28) {
                    int readInt22 = parcel.readInt();
                    char c20 = (char) readInt22;
                    if (c20 == 1) {
                        i38 = K3.b.v(parcel, readInt22);
                    } else if (c20 != 2) {
                        K3.b.C(parcel, readInt22);
                    } else {
                        bArr2 = K3.b.g(parcel, readInt22);
                    }
                }
                K3.b.m(parcel, F28);
                return new Qw(i38, bArr2);
            case 21:
                int F29 = K3.b.F(parcel);
                String str43 = null;
                int i39 = 0;
                String str44 = null;
                while (parcel.dataPosition() < F29) {
                    int readInt23 = parcel.readInt();
                    char c21 = (char) readInt23;
                    if (c21 == 1) {
                        i39 = K3.b.v(parcel, readInt23);
                    } else if (c21 == 2) {
                        str43 = K3.b.i(parcel, readInt23);
                    } else if (c21 != 3) {
                        K3.b.C(parcel, readInt23);
                    } else {
                        str44 = K3.b.i(parcel, readInt23);
                    }
                }
                K3.b.m(parcel, F29);
                return new Sw(i39, str43, str44);
            case 22:
                int F30 = K3.b.F(parcel);
                byte[] bArr3 = null;
                int i40 = 0;
                while (parcel.dataPosition() < F30) {
                    int readInt24 = parcel.readInt();
                    char c22 = (char) readInt24;
                    if (c22 == 1) {
                        i40 = K3.b.v(parcel, readInt24);
                    } else if (c22 != 2) {
                        K3.b.C(parcel, readInt24);
                    } else {
                        bArr3 = K3.b.g(parcel, readInt24);
                    }
                }
                K3.b.m(parcel, F30);
                return new Tw(i40, bArr3);
            case 23:
                int F31 = K3.b.F(parcel);
                String str45 = null;
                String str46 = null;
                int i41 = 0;
                int i42 = 0;
                int i43 = 0;
                while (parcel.dataPosition() < F31) {
                    int readInt25 = parcel.readInt();
                    char c23 = (char) readInt25;
                    if (c23 == 1) {
                        i41 = K3.b.v(parcel, readInt25);
                    } else if (c23 == 2) {
                        i42 = K3.b.v(parcel, readInt25);
                    } else if (c23 == 3) {
                        str45 = K3.b.i(parcel, readInt25);
                    } else if (c23 == 4) {
                        str46 = K3.b.i(parcel, readInt25);
                    } else if (c23 != 5) {
                        K3.b.C(parcel, readInt25);
                    } else {
                        i43 = K3.b.v(parcel, readInt25);
                    }
                }
                K3.b.m(parcel, F31);
                return new Xw(i41, i42, i43, str45, str46);
            case 24:
                int F32 = K3.b.F(parcel);
                int i44 = 0;
                byte[] bArr4 = null;
                int i45 = 0;
                while (parcel.dataPosition() < F32) {
                    int readInt26 = parcel.readInt();
                    char c24 = (char) readInt26;
                    if (c24 == 1) {
                        i44 = K3.b.v(parcel, readInt26);
                    } else if (c24 == 2) {
                        bArr4 = K3.b.g(parcel, readInt26);
                    } else if (c24 != 3) {
                        K3.b.C(parcel, readInt26);
                    } else {
                        i45 = K3.b.v(parcel, readInt26);
                    }
                }
                K3.b.m(parcel, F32);
                return new Yw(bArr4, i44, i45);
            case 25:
                return new RO(parcel);
            default:
                return new NO(parcel);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        switch (this.f27510a) {
            case 0:
                return new R8[i];
            case 1:
                return new U8[i];
            case 2:
                return new C3261gb[i];
            case 3:
                return new C3692oc[i];
            case 4:
                return new C3746pc[i];
            case 5:
                return new C4015uc[i];
            case 6:
                return new C4285zc[i];
            case 7:
                return new C2464Ac[i];
            case 8:
                return new C2754Rd[i];
            case 9:
                return new C4179xe[i];
            case 10:
                return new C2500Ce[i];
            case 11:
                return new C2517De[i];
            case 12:
                return new C2534Ee[i];
            case 13:
                return new C2687Ne[i];
            case 14:
                return new C2840We[i];
            case 15:
                return new C2938af[i];
            case 16:
                return new C3856rf[i];
            case 17:
                return new C4126wf[i];
            case 18:
                return new C2790Tf[i];
            case 19:
                return new C4087vu[i];
            case 20:
                return new Qw[i];
            case 21:
                return new Sw[i];
            case 22:
                return new Tw[i];
            case 23:
                return new Xw[i];
            case 24:
                return new Yw[i];
            case 25:
                return new RO[i];
            default:
                return new NO[i];
        }
    }
}
