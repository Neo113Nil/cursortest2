package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class cly extends cri {
    public static final Parcelable.Creator CREATOR = new ckq(8);
    public final boolean a;
    public final String b;
    public final int c;
    public final int d;
    public final long e;

    public cly(boolean z, String str, int i, int i2, long j) {
        this.a = z;
        this.b = str;
        this.c = ow.n(i) - 1;
        this.d = ow.o(i2) - 1;
        this.e = j;
    }

    public final int a() {
        return ow.n(this.c);
    }

    public final void b() {
        ow.o(this.d);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        boolean z = this.a;
        int q = oy.q(parcel, 20293);
        oy.s(parcel, 1, z);
        oy.I(parcel, 2, this.b);
        oy.v(parcel, 3, this.c);
        oy.v(parcel, 4, this.d);
        oy.w(parcel, 5, this.e);
        oy.r(parcel, q);
    }
}
