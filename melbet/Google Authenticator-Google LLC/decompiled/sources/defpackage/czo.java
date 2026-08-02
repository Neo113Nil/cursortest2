package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class czo extends cri {
    public static final Parcelable.Creator CREATOR = new ctk(17);
    public final int a;
    public final int b;

    public czo(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int i2 = this.a;
        int q = oy.q(parcel, 20293);
        oy.v(parcel, 2, i2);
        oy.v(parcel, 3, this.b);
        oy.r(parcel, q);
    }
}
