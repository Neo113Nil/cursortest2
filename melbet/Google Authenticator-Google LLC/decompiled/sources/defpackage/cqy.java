package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class cqy extends cri {
    public static final Parcelable.Creator CREATOR = new cqc(2);
    public final int a;
    public final int b;
    public final int c;
    public final long d;
    public final long e;
    public final String f;
    public final String g;
    public final int h;
    public final int i;

    public cqy(int i, int i2, int i3, long j, long j2, String str, String str2, int i4, int i5) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = j;
        this.e = j2;
        this.f = str;
        this.g = str2;
        this.h = i4;
        this.i = i5;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int i2 = this.a;
        int q = oy.q(parcel, 20293);
        oy.v(parcel, 1, i2);
        oy.v(parcel, 2, this.b);
        oy.v(parcel, 3, this.c);
        oy.w(parcel, 4, this.d);
        oy.w(parcel, 5, this.e);
        oy.I(parcel, 6, this.f);
        oy.I(parcel, 7, this.g);
        oy.v(parcel, 8, this.h);
        oy.v(parcel, 9, this.i);
        oy.r(parcel, q);
    }
}
