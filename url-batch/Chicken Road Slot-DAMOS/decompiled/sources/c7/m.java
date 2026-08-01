package c7;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class m extends d7.a {
    public static final Parcelable.Creator<m> CREATOR = new p(5);

    /* renamed from: d, reason: collision with root package name */
    public final int f1945d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f1946e;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f1947i;

    /* renamed from: r, reason: collision with root package name */
    public final int f1948r;

    /* renamed from: s, reason: collision with root package name */
    public final int f1949s;

    public m(int i3, boolean z10, boolean z11, int i10, int i11) {
        this.f1945d = i3;
        this.f1946e = z10;
        this.f1947i = z11;
        this.f1948r = i10;
        this.f1949s = i11;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i3) {
        int Z = cf.c.Z(parcel, 20293);
        cf.c.Y(parcel, 1, 4);
        parcel.writeInt(this.f1945d);
        cf.c.Y(parcel, 2, 4);
        parcel.writeInt(this.f1946e ? 1 : 0);
        cf.c.Y(parcel, 3, 4);
        parcel.writeInt(this.f1947i ? 1 : 0);
        cf.c.Y(parcel, 4, 4);
        parcel.writeInt(this.f1948r);
        cf.c.Y(parcel, 5, 4);
        parcel.writeInt(this.f1949s);
        cf.c.a0(parcel, Z);
    }
}
