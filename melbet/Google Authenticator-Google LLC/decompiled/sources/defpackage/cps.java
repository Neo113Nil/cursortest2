package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class cps extends cri {
    public static final Parcelable.Creator CREATOR = new ckq(17);
    public final int a;
    public final String b;
    public final int c;

    public cps(int i, String str, int i2) {
        this.a = i;
        this.b = str;
        this.c = i2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int i2 = this.a;
        int q = oy.q(parcel, 20293);
        oy.v(parcel, 1, i2);
        oy.I(parcel, 2, this.b);
        oy.v(parcel, 3, this.c);
        oy.r(parcel, q);
    }
}
