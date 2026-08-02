package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class dao extends cri {
    public static final Parcelable.Creator CREATOR = new ctv(10);
    public final int a;
    public final String b;
    public final long c;

    public dao(int i, String str, long j) {
        this.a = i;
        this.b = str;
        this.c = j;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int i2 = this.a;
        int q = oy.q(parcel, 20293);
        oy.v(parcel, 2, i2);
        oy.I(parcel, 3, this.b);
        oy.w(parcel, 4, this.c);
        oy.r(parcel, q);
    }
}
