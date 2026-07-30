package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class vx extends t0 {
    public static final Parcelable.Creator<vx> CREATOR = new g2(22);
    public final String d;
    public final int e;
    public final long g;

    public vx() {
        this.d = "CLIENT_TELEMETRY";
        this.g = 1L;
        this.e = -1;
    }

    public final long a() {
        long j = this.g;
        return j == -1 ? this.e : j;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof vx) {
            vx vxVar = (vx) obj;
            String str = vxVar.d;
            String str2 = this.d;
            if (((str2 != null && str2.equals(str)) || (str2 == null && str == null)) && a() == vxVar.a()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.d, Long.valueOf(a())});
    }

    public final String toString() {
        yw ywVar = new yw(this);
        ywVar.g(this.d, "name");
        ywVar.g(Long.valueOf(a()), "version");
        return ywVar.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int P = y90.P(parcel, 20293);
        y90.M(parcel, 1, this.d);
        y90.R(parcel, 2, 4);
        parcel.writeInt(this.e);
        long a = a();
        y90.R(parcel, 3, 8);
        parcel.writeLong(a);
        y90.Q(parcel, P);
    }

    public vx(int i, long j, String str) {
        this.d = str;
        this.e = i;
        this.g = j;
    }
}
