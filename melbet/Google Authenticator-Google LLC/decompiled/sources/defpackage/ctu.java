package defpackage;

import android.os.Parcel;
import j$.util.Objects;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ctu extends cri {
    public static final ctv CREATOR = new ctv(0);
    final String a;
    final String b;
    final String[] c;
    final int d;
    final boolean e;

    public ctu(String str, String str2, String[] strArr, int i, boolean z) {
        str.getClass();
        this.a = str;
        this.b = str2 != null ? str2 : str;
        this.c = strArr;
        if (i != 2 && i != 1) {
            throw new IllegalArgumentException(a.Y(i, "Unknown expected output format="));
        }
        this.d = i;
        this.e = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            ctu ctuVar = (ctu) obj;
            if (this.e == ctuVar.e && this.d == ctuVar.d && this.a.equals(ctuVar.a) && this.b.equals(ctuVar.b) && Arrays.equals(this.c, ctuVar.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (Objects.hash(this.a, this.b, Boolean.valueOf(this.e), Integer.valueOf(this.d)) * 31) + Arrays.hashCode(this.c);
    }

    public final String toString() {
        return "ServiceDumpRequest{serviceDumpId='" + this.a + "',serviceName='" + this.b + "', dumpsysFlags=" + Arrays.toString(this.c) + ", expectedOutputFormat=" + this.d + ", showOutputToUser=" + this.e + "}";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int q = oy.q(parcel, 20293);
        oy.I(parcel, 2, this.a);
        oy.J(parcel, 3, this.c);
        oy.v(parcel, 4, this.d);
        oy.s(parcel, 5, this.e);
        oy.I(parcel, 6, this.b);
        oy.r(parcel, q);
    }
}
