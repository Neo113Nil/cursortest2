package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class cpp extends cri {
    public static final Parcelable.Creator CREATOR = new ckq(16);
    public final int a;
    public final String b;
    public final long c;
    public final int d;
    public final boolean e;

    public cpp(int i, String str, long j, int i2, boolean z) {
        this.a = i;
        this.b = str;
        this.c = j;
        this.d = i2;
        this.e = z;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int i2 = this.a;
        int q = oy.q(parcel, 20293);
        oy.v(parcel, 1, i2);
        oy.I(parcel, 2, this.b);
        oy.w(parcel, 3, this.c);
        oy.v(parcel, 4, this.d);
        oy.s(parcel, 5, this.e);
        oy.r(parcel, q);
    }
}
