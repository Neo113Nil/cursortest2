package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jek extends cri {
    public static final Parcelable.Creator CREATOR = new dtk(15);
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public final boolean g;
    public final String h;

    public jek(int i, int i2, int i3, int i4, int i5, int i6, boolean z, String str) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
        this.e = i5;
        this.f = i6;
        this.g = z;
        this.h = str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int i2 = this.a;
        int q = oy.q(parcel, 20293);
        oy.v(parcel, 1, i2);
        oy.v(parcel, 2, this.b);
        oy.v(parcel, 3, this.c);
        oy.v(parcel, 4, this.d);
        oy.v(parcel, 5, this.e);
        oy.v(parcel, 6, this.f);
        oy.s(parcel, 7, this.g);
        oy.I(parcel, 8, this.h);
        oy.r(parcel, q);
    }
}
