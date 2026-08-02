package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class dbn extends cri implements Comparable {
    public static final Parcelable.Creator CREATOR = new dbh(4);
    public final String a;
    public final long b;
    public final boolean c;
    public final double d;
    public final String e;
    public final byte[] f;
    public final int g;
    public final int h;
    public final int i;

    public dbn(String str, long j, boolean z, double d, String str2, byte[] bArr, int i, int i2, int i3) {
        this.a = str;
        this.b = j;
        this.c = z;
        this.d = d;
        this.e = str2;
        this.f = bArr;
        this.g = i;
        this.h = i2;
        this.i = i3;
    }

    private static int b(int i, int i2) {
        if (i < i2) {
            return -1;
        }
        return i != i2 ? 1 : 0;
    }

    final void a(StringBuilder sb) {
        sb.append("Flag(");
        String str = this.a;
        sb.append(str);
        sb.append(", ");
        int i = this.g;
        if (i == 1) {
            sb.append(this.b);
        } else if (i == 2) {
            sb.append(this.c);
        } else if (i == 3) {
            sb.append(this.d);
        } else if (i == 4) {
            sb.append("'");
            String str2 = this.e;
            oy.at(str2);
            sb.append(str2);
            sb.append("'");
        } else {
            if (i != 5) {
                throw new AssertionError("Invalid type: " + str + ", " + i);
            }
            sb.append("'");
            byte[] bArr = this.f;
            oy.at(bArr);
            sb.append(Base64.encodeToString(bArr, 3));
            sb.append("'");
        }
        sb.append(", ");
        sb.append(i);
        sb.append(", ");
        sb.append(this.h);
        sb.append(", ");
        sb.append(this.i);
        sb.append(")");
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        dbn dbnVar = (dbn) obj;
        int compareTo = this.a.compareTo(dbnVar.a);
        if (compareTo != 0) {
            return compareTo;
        }
        int i = this.g;
        int b = b(i, dbnVar.g);
        if (b != 0) {
            return b;
        }
        int i2 = 0;
        if (i == 1) {
            long j = this.b;
            long j2 = dbnVar.b;
            if (j < j2) {
                return -1;
            }
            return j == j2 ? 0 : 1;
        }
        if (i == 2) {
            boolean z = this.c;
            if (z == dbnVar.c) {
                return 0;
            }
            return z ? 1 : -1;
        }
        if (i == 3) {
            return Double.compare(this.d, dbnVar.d);
        }
        if (i == 4) {
            String str = this.e;
            String str2 = dbnVar.e;
            if (str == str2) {
                return 0;
            }
            if (str == null) {
                return -1;
            }
            if (str2 == null) {
                return 1;
            }
            return str.compareTo(str2);
        }
        if (i != 5) {
            throw new AssertionError(a.Y(i, "Invalid enum value: "));
        }
        byte[] bArr = this.f;
        byte[] bArr2 = dbnVar.f;
        if (bArr == bArr2) {
            return 0;
        }
        if (bArr == null) {
            return -1;
        }
        if (bArr2 == null) {
            return 1;
        }
        while (true) {
            int length = bArr2.length;
            int length2 = bArr.length;
            if (i2 >= Math.min(length2, length)) {
                return b(length2, length);
            }
            int i3 = bArr[i2] - bArr2[i2];
            if (i3 != 0) {
                return i3;
            }
            i2++;
        }
    }

    public final boolean equals(Object obj) {
        int i;
        if (obj instanceof dbn) {
            dbn dbnVar = (dbn) obj;
            if (dih.y(this.a, dbnVar.a) && (i = this.g) == dbnVar.g && this.h == dbnVar.h && this.i == dbnVar.i) {
                if (i == 1) {
                    return this.b == dbnVar.b;
                }
                if (i == 2) {
                    return this.c == dbnVar.c;
                }
                if (i == 3) {
                    return this.d == dbnVar.d;
                }
                if (i == 4) {
                    return dih.y(this.e, dbnVar.e);
                }
                if (i == 5) {
                    return Arrays.equals(this.f, dbnVar.f);
                }
                throw new AssertionError(a.Y(i, "Invalid enum value: "));
            }
        }
        return false;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        a(sb);
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int q = oy.q(parcel, 20293);
        String str = this.a;
        if (!dbh.b(str)) {
            oy.I(parcel, 2, str);
        }
        long j = this.b;
        if (j != 0) {
            oy.w(parcel, 3, j);
        }
        if (this.c) {
            oy.s(parcel, 4, true);
        }
        double d = this.d;
        if (d != 0.0d) {
            oy.t(parcel, 5, d);
        }
        String str2 = this.e;
        if (!dbh.b(str2)) {
            oy.I(parcel, 6, str2);
        }
        byte[] bArr = this.f;
        if (!dbh.b(bArr)) {
            oy.A(parcel, 7, bArr);
        }
        int i2 = this.g;
        if (!dbh.a(i2)) {
            oy.v(parcel, 8, i2);
        }
        int i3 = this.h;
        if (!dbh.a(i3)) {
            oy.v(parcel, 9, i3);
        }
        int i4 = this.i;
        if (!dbh.a(i4)) {
            oy.v(parcel, 10, i4);
        }
        oy.r(parcel, q);
    }
}
