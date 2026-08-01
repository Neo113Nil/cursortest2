package c7;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class q extends d7.a {
    public static final Parcelable.Creator<q> CREATOR = new p(1);

    /* renamed from: d, reason: collision with root package name */
    public final int f1973d;

    /* renamed from: e, reason: collision with root package name */
    public final String f1974e;

    /* renamed from: i, reason: collision with root package name */
    public final long f1975i;

    /* renamed from: r, reason: collision with root package name */
    public final int f1976r;

    /* renamed from: s, reason: collision with root package name */
    public final boolean f1977s;

    public q(int i3, int i10, long j, String str, boolean z10) {
        this.f1973d = i3;
        this.f1974e = str;
        this.f1975i = j;
        this.f1976r = i10;
        this.f1977s = z10;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i3) {
        int Z = cf.c.Z(parcel, 20293);
        cf.c.Y(parcel, 1, 4);
        parcel.writeInt(this.f1973d);
        cf.c.V(parcel, 2, this.f1974e);
        cf.c.Y(parcel, 3, 8);
        parcel.writeLong(this.f1975i);
        cf.c.Y(parcel, 4, 4);
        parcel.writeInt(this.f1976r);
        cf.c.Y(parcel, 5, 4);
        parcel.writeInt(this.f1977s ? 1 : 0);
        cf.c.a0(parcel, Z);
    }
}
