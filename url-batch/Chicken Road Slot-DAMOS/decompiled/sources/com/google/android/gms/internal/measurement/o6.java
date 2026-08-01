package com.google.android.gms.internal.measurement;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.appsflyer.attribution.RequestError;
import java.util.ArrayList;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class o6 implements Parcelable.Creator {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2636a;

    public /* synthetic */ o6(int i3) {
        this.f2636a = i3;
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.f2636a) {
            case 0:
                int g02 = c6.f.g0(parcel);
                Bundle bundle = null;
                String str = null;
                boolean z10 = false;
                long j = 0;
                long j3 = 0;
                while (parcel.dataPosition() < g02) {
                    int readInt = parcel.readInt();
                    char c10 = (char) readInt;
                    if (c10 == 1) {
                        j = c6.f.Y(parcel, readInt);
                    } else if (c10 == 2) {
                        j3 = c6.f.Y(parcel, readInt);
                    } else if (c10 == 3) {
                        z10 = c6.f.V(parcel, readInt);
                    } else if (c10 == 7) {
                        bundle = c6.f.s(parcel, readInt);
                    } else if (c10 != '\b') {
                        c6.f.c0(parcel, readInt);
                    } else {
                        str = c6.f.x(parcel, readInt);
                    }
                }
                c6.f.A(parcel, g02);
                return new n6(j, j3, z10, bundle, str);
            case 1:
                int g03 = c6.f.g0(parcel);
                String str2 = null;
                int i3 = 0;
                Intent intent = null;
                while (parcel.dataPosition() < g03) {
                    int readInt2 = parcel.readInt();
                    char c11 = (char) readInt2;
                    if (c11 == 1) {
                        i3 = c6.f.X(parcel, readInt2);
                    } else if (c11 == 2) {
                        str2 = c6.f.x(parcel, readInt2);
                    } else if (c11 != 3) {
                        c6.f.c0(parcel, readInt2);
                    } else {
                        intent = (Intent) c6.f.w(parcel, readInt2, Intent.CREATOR);
                    }
                }
                c6.f.A(parcel, g03);
                return new p6(i3, str2, intent);
            case 2:
                int g04 = c6.f.g0(parcel);
                int i10 = 0;
                w9[] w9VarArr = null;
                String[] strArr = null;
                while (parcel.dataPosition() < g04) {
                    int readInt3 = parcel.readInt();
                    char c12 = (char) readInt3;
                    if (c12 == 2) {
                        i10 = c6.f.X(parcel, readInt3);
                    } else if (c12 == 3) {
                        w9VarArr = (w9[]) c6.f.y(parcel, readInt3, w9.CREATOR);
                    } else if (c12 != 4) {
                        c6.f.c0(parcel, readInt3);
                    } else {
                        int Z = c6.f.Z(parcel, readInt3);
                        int dataPosition = parcel.dataPosition();
                        if (Z == 0) {
                            strArr = null;
                        } else {
                            String[] createStringArray = parcel.createStringArray();
                            parcel.setDataPosition(dataPosition + Z);
                            strArr = createStringArray;
                        }
                    }
                }
                c6.f.A(parcel, g04);
                return new s9(i10, w9VarArr, strArr);
            case a4.j.INTEGER_FIELD_NUMBER /* 3 */:
                int g05 = c6.f.g0(parcel);
                long j10 = 0;
                String str3 = null;
                String str4 = null;
                s9[] s9VarArr = null;
                byte[] bArr = null;
                boolean z11 = false;
                while (parcel.dataPosition() < g05) {
                    int readInt4 = parcel.readInt();
                    switch ((char) readInt4) {
                        case 2:
                            str3 = c6.f.x(parcel, readInt4);
                            break;
                        case a4.j.INTEGER_FIELD_NUMBER /* 3 */:
                            str4 = c6.f.x(parcel, readInt4);
                            break;
                        case a4.j.LONG_FIELD_NUMBER /* 4 */:
                            s9VarArr = (s9[]) c6.f.y(parcel, readInt4, s9.CREATOR);
                            break;
                        case a4.j.STRING_FIELD_NUMBER /* 5 */:
                            z11 = c6.f.V(parcel, readInt4);
                            break;
                        case a4.j.STRING_SET_FIELD_NUMBER /* 6 */:
                            bArr = c6.f.t(parcel, readInt4);
                            break;
                        case a4.j.DOUBLE_FIELD_NUMBER /* 7 */:
                            j10 = c6.f.Y(parcel, readInt4);
                            break;
                        default:
                            c6.f.c0(parcel, readInt4);
                            break;
                    }
                }
                c6.f.A(parcel, g05);
                return new t9(str3, str4, s9VarArr, z11, bArr, j10);
            case a4.j.LONG_FIELD_NUMBER /* 4 */:
                int g06 = c6.f.g0(parcel);
                byte[] bArr2 = null;
                while (parcel.dataPosition() < g06) {
                    int readInt5 = parcel.readInt();
                    if (((char) readInt5) != 2) {
                        c6.f.c0(parcel, readInt5);
                    } else {
                        bArr2 = c6.f.t(parcel, readInt5);
                    }
                }
                c6.f.A(parcel, g06);
                return new u9(bArr2);
            case a4.j.STRING_FIELD_NUMBER /* 5 */:
                int g07 = c6.f.g0(parcel);
                String str5 = null;
                byte[] bArr3 = null;
                byte[][] bArr4 = null;
                byte[][] bArr5 = null;
                byte[][] bArr6 = null;
                byte[][] bArr7 = null;
                int[] iArr = null;
                byte[][] bArr8 = null;
                int[] iArr2 = null;
                byte[][] bArr9 = null;
                while (parcel.dataPosition() < g07) {
                    int readInt6 = parcel.readInt();
                    switch ((char) readInt6) {
                        case 2:
                            str5 = c6.f.x(parcel, readInt6);
                            break;
                        case a4.j.INTEGER_FIELD_NUMBER /* 3 */:
                            bArr3 = c6.f.t(parcel, readInt6);
                            break;
                        case a4.j.LONG_FIELD_NUMBER /* 4 */:
                            bArr4 = c6.f.u(parcel, readInt6);
                            break;
                        case a4.j.STRING_FIELD_NUMBER /* 5 */:
                            bArr5 = c6.f.u(parcel, readInt6);
                            break;
                        case a4.j.STRING_SET_FIELD_NUMBER /* 6 */:
                            bArr6 = c6.f.u(parcel, readInt6);
                            break;
                        case a4.j.DOUBLE_FIELD_NUMBER /* 7 */:
                            bArr7 = c6.f.u(parcel, readInt6);
                            break;
                        case a4.j.BYTES_FIELD_NUMBER /* 8 */:
                            iArr = c6.f.v(parcel, readInt6);
                            break;
                        case '\t':
                            bArr8 = c6.f.u(parcel, readInt6);
                            break;
                        case '\n':
                            iArr2 = c6.f.v(parcel, readInt6);
                            break;
                        case RequestError.STOP_TRACKING /* 11 */:
                            bArr9 = c6.f.u(parcel, readInt6);
                            break;
                        default:
                            c6.f.c0(parcel, readInt6);
                            break;
                    }
                }
                c6.f.A(parcel, g07);
                return new v9(str5, bArr3, bArr4, bArr5, bArr6, bArr7, iArr, bArr8, iArr2, bArr9);
            case a4.j.STRING_SET_FIELD_NUMBER /* 6 */:
                int g08 = c6.f.g0(parcel);
                boolean z12 = false;
                int i11 = 0;
                int i12 = 0;
                int i13 = 0;
                String str6 = null;
                String str7 = null;
                byte[] bArr10 = null;
                double d10 = 0.0d;
                long j11 = 0;
                while (parcel.dataPosition() < g08) {
                    int readInt7 = parcel.readInt();
                    switch ((char) readInt7) {
                        case 2:
                            str6 = c6.f.x(parcel, readInt7);
                            break;
                        case a4.j.INTEGER_FIELD_NUMBER /* 3 */:
                            j11 = c6.f.Y(parcel, readInt7);
                            break;
                        case a4.j.LONG_FIELD_NUMBER /* 4 */:
                            z12 = c6.f.V(parcel, readInt7);
                            break;
                        case a4.j.STRING_FIELD_NUMBER /* 5 */:
                            c6.f.i0(parcel, readInt7, 8);
                            d10 = parcel.readDouble();
                            break;
                        case a4.j.STRING_SET_FIELD_NUMBER /* 6 */:
                            str7 = c6.f.x(parcel, readInt7);
                            break;
                        case a4.j.DOUBLE_FIELD_NUMBER /* 7 */:
                            bArr10 = c6.f.t(parcel, readInt7);
                            break;
                        case a4.j.BYTES_FIELD_NUMBER /* 8 */:
                            i11 = c6.f.X(parcel, readInt7);
                            break;
                        case '\t':
                            i12 = c6.f.X(parcel, readInt7);
                            break;
                        case '\n':
                            i13 = c6.f.X(parcel, readInt7);
                            break;
                        default:
                            c6.f.c0(parcel, readInt7);
                            break;
                    }
                }
                c6.f.A(parcel, g08);
                return new w9(str6, j11, z12, d10, str7, bArr10, i11, i12, i13);
            case a4.j.DOUBLE_FIELD_NUMBER /* 7 */:
                int g09 = c6.f.g0(parcel);
                boolean z13 = false;
                String str8 = null;
                String str9 = null;
                w9 w9Var = null;
                while (parcel.dataPosition() < g09) {
                    int readInt8 = parcel.readInt();
                    char c13 = (char) readInt8;
                    if (c13 == 2) {
                        str8 = c6.f.x(parcel, readInt8);
                    } else if (c13 == 3) {
                        str9 = c6.f.x(parcel, readInt8);
                    } else if (c13 == 4) {
                        w9Var = (w9) c6.f.w(parcel, readInt8, w9.CREATOR);
                    } else if (c13 != 5) {
                        c6.f.c0(parcel, readInt8);
                    } else {
                        z13 = c6.f.V(parcel, readInt8);
                    }
                }
                c6.f.A(parcel, g09);
                return new x9(str8, str9, w9Var, z13);
            case a4.j.BYTES_FIELD_NUMBER /* 8 */:
                int g010 = c6.f.g0(parcel);
                ArrayList arrayList = null;
                while (parcel.dataPosition() < g010) {
                    int readInt9 = parcel.readInt();
                    if (((char) readInt9) != 2) {
                        c6.f.c0(parcel, readInt9);
                    } else {
                        arrayList = c6.f.z(parcel, readInt9, x9.CREATOR);
                    }
                }
                c6.f.A(parcel, g010);
                return new y9(arrayList);
            default:
                int g011 = c6.f.g0(parcel);
                int i14 = 0;
                int i15 = 0;
                while (parcel.dataPosition() < g011) {
                    int readInt10 = parcel.readInt();
                    char c14 = (char) readInt10;
                    if (c14 == 1) {
                        i14 = c6.f.X(parcel, readInt10);
                    } else if (c14 != 2) {
                        c6.f.c0(parcel, readInt10);
                    } else {
                        i15 = c6.f.X(parcel, readInt10);
                    }
                }
                c6.f.A(parcel, g011);
                return new z9(i14, i15);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i3) {
        switch (this.f2636a) {
            case 0:
                return new n6[i3];
            case 1:
                return new p6[i3];
            case 2:
                return new s9[i3];
            case a4.j.INTEGER_FIELD_NUMBER /* 3 */:
                return new t9[i3];
            case a4.j.LONG_FIELD_NUMBER /* 4 */:
                return new u9[i3];
            case a4.j.STRING_FIELD_NUMBER /* 5 */:
                return new v9[i3];
            case a4.j.STRING_SET_FIELD_NUMBER /* 6 */:
                return new w9[i3];
            case a4.j.DOUBLE_FIELD_NUMBER /* 7 */:
                return new x9[i3];
            case a4.j.BYTES_FIELD_NUMBER /* 8 */:
                return new y9[i3];
            default:
                return new z9[i3];
        }
    }
}
