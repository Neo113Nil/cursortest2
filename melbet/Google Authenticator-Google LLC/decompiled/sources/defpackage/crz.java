package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class crz extends cri {
    public static final Parcelable.Creator CREATOR = new cqc(9);
    public final int a;
    public final boolean b;

    public crz(int i, boolean z) {
        this.a = i;
        this.b = z;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int i2 = this.a;
        int q = oy.q(parcel, 20293);
        oy.v(parcel, 1, i2);
        oy.s(parcel, 2, this.b);
        oy.r(parcel, q);
    }
}
