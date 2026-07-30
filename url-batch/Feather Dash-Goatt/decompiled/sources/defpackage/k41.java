package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class k41 extends t0 {
    public static final Parcelable.Creator<k41> CREATOR = new g2(18);
    public final int d;
    public final boolean e;
    public final boolean g;
    public final int h;
    public final int i;

    public k41(int i, boolean z, boolean z2, int i2, int i3) {
        this.d = i;
        this.e = z;
        this.g = z2;
        this.h = i2;
        this.i = i3;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int P = y90.P(parcel, 20293);
        y90.R(parcel, 1, 4);
        parcel.writeInt(this.d);
        y90.R(parcel, 2, 4);
        parcel.writeInt(this.e ? 1 : 0);
        y90.R(parcel, 3, 4);
        parcel.writeInt(this.g ? 1 : 0);
        y90.R(parcel, 4, 4);
        parcel.writeInt(this.h);
        y90.R(parcel, 5, 4);
        parcel.writeInt(this.i);
        y90.Q(parcel, P);
    }
}
