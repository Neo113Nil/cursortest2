package defpackage;

import android.os.Parcel;
import j$.util.Objects;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class cts extends cri {
    public static final ctt CREATOR = new ctt(0);
    public final ctu a;
    public final byte[] b;

    public cts(ctu ctuVar, byte[] bArr) {
        ctuVar.getClass();
        this.a = ctuVar;
        bArr.getClass();
        this.b = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            cts ctsVar = (cts) obj;
            if (this.a.equals(ctsVar.a) && Arrays.equals(this.b, ctsVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (Objects.hash(this.a) * 31) + Arrays.hashCode(this.b);
    }

    public final String toString() {
        byte[] bArr = this.b;
        String obj = this.a.toString();
        String arrays = Arrays.toString(bArr);
        if (arrays.length() > 20) {
            arrays = String.valueOf(arrays.substring(0, 17)).concat("...");
        }
        return "ServiceDump{serviceDumpRequest=" + obj + ", dumpOutput=\"" + String.format(arrays, new Object[0]) + "\"}";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int q = oy.q(parcel, 20293);
        oy.H(parcel, 2, this.a, i);
        oy.A(parcel, 3, this.b);
        oy.r(parcel, q);
    }
}
