package defpackage;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class as1 extends t0 {
    public static final Parcelable.Creator<as1> CREATOR = new g2(9);
    public final int d;
    public final int e;
    public final Intent g;

    public as1(int i, int i2, Intent intent) {
        this.d = i;
        this.e = i2;
        this.g = intent;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int P = y90.P(parcel, 20293);
        y90.R(parcel, 1, 4);
        parcel.writeInt(this.d);
        y90.R(parcel, 2, 4);
        parcel.writeInt(this.e);
        y90.L(parcel, 3, this.g, i);
        y90.Q(parcel, P);
    }
}
