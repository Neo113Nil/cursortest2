package y6;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import z6.t;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class m implements Parcelable.Creator {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10663a;

    public /* synthetic */ m(int i3) {
        this.f10663a = i3;
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.f10663a) {
            case 0:
                int g02 = c6.f.g0(parcel);
                String str = null;
                String str2 = null;
                String str3 = null;
                String str4 = null;
                String str5 = null;
                String str6 = null;
                int i3 = 0;
                while (parcel.dataPosition() < g02) {
                    int readInt = parcel.readInt();
                    switch ((char) readInt) {
                        case 1:
                            str = c6.f.x(parcel, readInt);
                            break;
                        case 2:
                            str2 = c6.f.x(parcel, readInt);
                            break;
                        case a4.j.INTEGER_FIELD_NUMBER /* 3 */:
                            str3 = c6.f.x(parcel, readInt);
                            break;
                        case a4.j.LONG_FIELD_NUMBER /* 4 */:
                            str4 = c6.f.x(parcel, readInt);
                            break;
                        case a4.j.STRING_FIELD_NUMBER /* 5 */:
                            str5 = c6.f.x(parcel, readInt);
                            break;
                        case a4.j.STRING_SET_FIELD_NUMBER /* 6 */:
                            i3 = c6.f.X(parcel, readInt);
                            break;
                        case a4.j.DOUBLE_FIELD_NUMBER /* 7 */:
                            str6 = c6.f.x(parcel, readInt);
                            break;
                        default:
                            c6.f.c0(parcel, readInt);
                            break;
                    }
                }
                c6.f.A(parcel, g02);
                return new b(str, str2, str3, str4, str5, i3, str6);
            case 1:
                int g03 = c6.f.g0(parcel);
                PendingIntent pendingIntent = null;
                String str7 = null;
                Integer num = null;
                int i10 = 0;
                int i11 = 0;
                while (parcel.dataPosition() < g03) {
                    int readInt2 = parcel.readInt();
                    char c10 = (char) readInt2;
                    if (c10 == 1) {
                        i10 = c6.f.X(parcel, readInt2);
                    } else if (c10 == 2) {
                        i11 = c6.f.X(parcel, readInt2);
                    } else if (c10 == 3) {
                        pendingIntent = (PendingIntent) c6.f.w(parcel, readInt2, PendingIntent.CREATOR);
                    } else if (c10 == 4) {
                        str7 = c6.f.x(parcel, readInt2);
                    } else if (c10 != 5) {
                        c6.f.c0(parcel, readInt2);
                    } else {
                        int Z = c6.f.Z(parcel, readInt2);
                        if (Z == 0) {
                            num = null;
                        } else {
                            c6.f.k0(parcel, Z, 4);
                            num = Integer.valueOf(parcel.readInt());
                        }
                    }
                }
                c6.f.A(parcel, g03);
                return new z6.b(i10, i11, pendingIntent, str7, num);
            case 2:
                int g04 = c6.f.g0(parcel);
                int i12 = 0;
                boolean z10 = false;
                long j = -1;
                String str8 = null;
                while (parcel.dataPosition() < g04) {
                    int readInt3 = parcel.readInt();
                    char c11 = (char) readInt3;
                    if (c11 == 1) {
                        str8 = c6.f.x(parcel, readInt3);
                    } else if (c11 == 2) {
                        i12 = c6.f.X(parcel, readInt3);
                    } else if (c11 == 3) {
                        j = c6.f.Y(parcel, readInt3);
                    } else if (c11 != 4) {
                        c6.f.c0(parcel, readInt3);
                    } else {
                        z10 = c6.f.V(parcel, readInt3);
                    }
                }
                c6.f.A(parcel, g04);
                return new z6.d(str8, i12, j, z10);
            default:
                int g05 = c6.f.g0(parcel);
                long j3 = -1;
                int i13 = 0;
                int i14 = 0;
                boolean z11 = false;
                String str9 = null;
                while (parcel.dataPosition() < g05) {
                    int readInt4 = parcel.readInt();
                    char c12 = (char) readInt4;
                    if (c12 == 1) {
                        z11 = c6.f.V(parcel, readInt4);
                    } else if (c12 == 2) {
                        str9 = c6.f.x(parcel, readInt4);
                    } else if (c12 == 3) {
                        i13 = c6.f.X(parcel, readInt4);
                    } else if (c12 == 4) {
                        i14 = c6.f.X(parcel, readInt4);
                    } else if (c12 != 5) {
                        c6.f.c0(parcel, readInt4);
                    } else {
                        j3 = c6.f.Y(parcel, readInt4);
                    }
                }
                c6.f.A(parcel, g05);
                return new t(i13, i14, j3, str9, z11);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i3) {
        switch (this.f10663a) {
            case 0:
                return new b[i3];
            case 1:
                return new z6.b[i3];
            case 2:
                return new z6.d[i3];
            default:
                return new t[i3];
        }
    }
}
