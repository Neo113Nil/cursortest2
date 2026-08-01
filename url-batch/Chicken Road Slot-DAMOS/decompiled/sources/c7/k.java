package c7;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class k extends d7.a {
    public static final Parcelable.Creator<k> CREATOR = new p(2);

    /* renamed from: d, reason: collision with root package name */
    public final int f1926d;

    /* renamed from: e, reason: collision with root package name */
    public final int f1927e;

    /* renamed from: i, reason: collision with root package name */
    public final int f1928i;

    /* renamed from: r, reason: collision with root package name */
    public final long f1929r;

    /* renamed from: s, reason: collision with root package name */
    public final long f1930s;

    /* renamed from: t, reason: collision with root package name */
    public final String f1931t;

    /* renamed from: u, reason: collision with root package name */
    public final String f1932u;

    /* renamed from: v, reason: collision with root package name */
    public final int f1933v;

    /* renamed from: w, reason: collision with root package name */
    public final int f1934w;

    public k(int i3, int i10, int i11, long j, long j3, String str, String str2, int i12, int i13) {
        this.f1926d = i3;
        this.f1927e = i10;
        this.f1928i = i11;
        this.f1929r = j;
        this.f1930s = j3;
        this.f1931t = str;
        this.f1932u = str2;
        this.f1933v = i12;
        this.f1934w = i13;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i3) {
        int Z = cf.c.Z(parcel, 20293);
        cf.c.Y(parcel, 1, 4);
        parcel.writeInt(this.f1926d);
        cf.c.Y(parcel, 2, 4);
        parcel.writeInt(this.f1927e);
        cf.c.Y(parcel, 3, 4);
        parcel.writeInt(this.f1928i);
        cf.c.Y(parcel, 4, 8);
        parcel.writeLong(this.f1929r);
        cf.c.Y(parcel, 5, 8);
        parcel.writeLong(this.f1930s);
        cf.c.V(parcel, 6, this.f1931t);
        cf.c.V(parcel, 7, this.f1932u);
        cf.c.Y(parcel, 8, 4);
        parcel.writeInt(this.f1933v);
        cf.c.Y(parcel, 9, 4);
        parcel.writeInt(this.f1934w);
        cf.c.a0(parcel, Z);
    }
}
