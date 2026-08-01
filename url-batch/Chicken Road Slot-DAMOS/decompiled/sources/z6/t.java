package z6;

import android.os.Parcel;
import android.os.Parcelable;
import x3.c0;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class t extends d7.a {
    public static final Parcelable.Creator<t> CREATOR = new y6.m(3);

    /* renamed from: d, reason: collision with root package name */
    public final boolean f10908d;

    /* renamed from: e, reason: collision with root package name */
    public final String f10909e;

    /* renamed from: i, reason: collision with root package name */
    public final int f10910i;

    /* renamed from: r, reason: collision with root package name */
    public final int f10911r;

    /* renamed from: s, reason: collision with root package name */
    public final long f10912s;

    public t(int i3, int i10, long j, String str, boolean z10) {
        this.f10908d = z10;
        this.f10909e = str;
        this.f10910i = c0.c(i3) - 1;
        this.f10911r = m.b(i10) - 1;
        this.f10912s = j;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i3) {
        int Z = cf.c.Z(parcel, 20293);
        cf.c.Y(parcel, 1, 4);
        parcel.writeInt(this.f10908d ? 1 : 0);
        cf.c.V(parcel, 2, this.f10909e);
        cf.c.Y(parcel, 3, 4);
        parcel.writeInt(this.f10910i);
        cf.c.Y(parcel, 4, 4);
        parcel.writeInt(this.f10911r);
        cf.c.Y(parcel, 5, 8);
        parcel.writeLong(this.f10912s);
        cf.c.a0(parcel, Z);
    }
}
