package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jep extends cri {
    public static final Parcelable.Creator CREATOR = new dtk(20);
    public final double a;
    public final double b;

    public jep(double d, double d2) {
        this.a = d;
        this.b = d2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        double d = this.a;
        int q = oy.q(parcel, 20293);
        oy.t(parcel, 1, d);
        oy.t(parcel, 2, this.b);
        oy.r(parcel, q);
    }
}
