package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class gm extends t0 {
    public static final Parcelable.Creator<gm> CREATOR = new g2(24);
    public final k41 d;
    public final boolean e;
    public final boolean g;
    public final int[] h;
    public final int i;
    public final int[] j;

    public gm(k41 k41Var, boolean z, boolean z2, int[] iArr, int i, int[] iArr2) {
        this.d = k41Var;
        this.e = z;
        this.g = z2;
        this.h = iArr;
        this.i = i;
        this.j = iArr2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int P = y90.P(parcel, 20293);
        y90.L(parcel, 1, this.d, i);
        y90.R(parcel, 2, 4);
        parcel.writeInt(this.e ? 1 : 0);
        y90.R(parcel, 3, 4);
        parcel.writeInt(this.g ? 1 : 0);
        int[] iArr = this.h;
        if (iArr != null) {
            int P2 = y90.P(parcel, 4);
            parcel.writeIntArray(iArr);
            y90.Q(parcel, P2);
        }
        y90.R(parcel, 5, 4);
        parcel.writeInt(this.i);
        int[] iArr2 = this.j;
        if (iArr2 != null) {
            int P3 = y90.P(parcel, 6);
            parcel.writeIntArray(iArr2);
            y90.Q(parcel, P3);
        }
        y90.Q(parcel, P);
    }
}
