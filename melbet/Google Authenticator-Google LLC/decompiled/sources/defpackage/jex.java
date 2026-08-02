package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.protobuf.contrib.android.ProtoParsers$InternalDontUse;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jex implements Parcelable.Creator {
    private final /* synthetic */ int a;

    public jex(int i) {
        this.a = i;
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int i = this.a;
        int i2 = 0;
        String str = null;
        if (i == 0) {
            int R = oy.R(parcel);
            while (parcel.dataPosition() < R) {
                int readInt = parcel.readInt();
                char c = (char) readInt;
                if (c == 1) {
                    i2 = oy.P(parcel, readInt);
                } else if (c != 2) {
                    oy.ae(parcel, readInt);
                } else {
                    str = oy.Z(parcel, readInt);
                }
            }
            oy.ad(parcel, R);
            return new jer(i2, str);
        }
        if (i == 1) {
            int R2 = oy.R(parcel);
            String str2 = null;
            String str3 = null;
            String str4 = null;
            String str5 = null;
            String str6 = null;
            String str7 = null;
            String str8 = null;
            while (parcel.dataPosition() < R2) {
                int readInt2 = parcel.readInt();
                switch ((char) readInt2) {
                    case 1:
                        str2 = oy.Z(parcel, readInt2);
                        break;
                    case 2:
                        str3 = oy.Z(parcel, readInt2);
                        break;
                    case 3:
                        str4 = oy.Z(parcel, readInt2);
                        break;
                    case 4:
                        str5 = oy.Z(parcel, readInt2);
                        break;
                    case 5:
                        str6 = oy.Z(parcel, readInt2);
                        break;
                    case 6:
                        str7 = oy.Z(parcel, readInt2);
                        break;
                    case 7:
                        str8 = oy.Z(parcel, readInt2);
                        break;
                    default:
                        oy.ae(parcel, readInt2);
                        break;
                }
            }
            oy.ad(parcel, R2);
            return new jeq(str2, str3, str4, str5, str6, str7, str8);
        }
        if (i == 2) {
            int R3 = oy.R(parcel);
            String str9 = null;
            while (parcel.dataPosition() < R3) {
                int readInt3 = parcel.readInt();
                char c2 = (char) readInt3;
                if (c2 == 1) {
                    str = oy.Z(parcel, readInt3);
                } else if (c2 != 2) {
                    oy.ae(parcel, readInt3);
                } else {
                    str9 = oy.Z(parcel, readInt3);
                }
            }
            oy.ad(parcel, R3);
            return new jes(str, str9);
        }
        if (i == 3) {
            int R4 = oy.R(parcel);
            String str10 = null;
            while (parcel.dataPosition() < R4) {
                int readInt4 = parcel.readInt();
                char c3 = (char) readInt4;
                if (c3 == 1) {
                    str = oy.Z(parcel, readInt4);
                } else if (c3 != 2) {
                    oy.ae(parcel, readInt4);
                } else {
                    str10 = oy.Z(parcel, readInt4);
                }
            }
            oy.ad(parcel, R4);
            return new jet(str, str10);
        }
        if (i != 4) {
            byte[] bArr = new byte[parcel.readInt()];
            parcel.readByteArray(bArr);
            return new ProtoParsers$InternalDontUse(bArr, null);
        }
        int R5 = oy.R(parcel);
        String str11 = null;
        while (parcel.dataPosition() < R5) {
            int readInt5 = parcel.readInt();
            char c4 = (char) readInt5;
            if (c4 == 1) {
                str = oy.Z(parcel, readInt5);
            } else if (c4 == 2) {
                str11 = oy.Z(parcel, readInt5);
            } else if (c4 != 3) {
                oy.ae(parcel, readInt5);
            } else {
                i2 = oy.P(parcel, readInt5);
            }
        }
        oy.ad(parcel, R5);
        return new jeu(str, str11, i2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        int i2 = this.a;
        return i2 != 0 ? i2 != 1 ? i2 != 2 ? i2 != 3 ? i2 != 4 ? new ProtoParsers$InternalDontUse[i] : new jeu[i] : new jet[i] : new jes[i] : new jeq[i] : new jer[i];
    }
}
