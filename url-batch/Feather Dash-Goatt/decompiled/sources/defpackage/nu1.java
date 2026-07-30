package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class nu1 extends t0 {
    public static final Parcelable.Creator<nu1> CREATOR = new g2(23);
    public Bundle d;
    public vx[] e;
    public int g;
    public gm h;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int P = y90.P(parcel, 20293);
        y90.K(parcel, 1, this.d);
        y90.N(parcel, 2, this.e, i);
        int i2 = this.g;
        y90.R(parcel, 3, 4);
        parcel.writeInt(i2);
        y90.L(parcel, 4, this.h, i);
        y90.Q(parcel, P);
    }
}
