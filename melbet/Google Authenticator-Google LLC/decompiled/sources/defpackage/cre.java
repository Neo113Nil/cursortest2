package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class cre extends cri {
    public static final Parcelable.Creator CREATOR = new cqc(5);
    public final int a;
    public final boolean b;
    public final boolean c;
    public final int d;
    public final int e;

    public cre(int i, boolean z, boolean z2, int i2, int i3) {
        this.a = i;
        this.b = z;
        this.c = z2;
        this.d = i2;
        this.e = i3;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int i2 = this.a;
        int q = oy.q(parcel, 20293);
        oy.v(parcel, 1, i2);
        oy.s(parcel, 2, this.b);
        oy.s(parcel, 3, this.c);
        oy.v(parcel, 4, this.d);
        oy.v(parcel, 5, this.e);
        oy.r(parcel, q);
    }
}
