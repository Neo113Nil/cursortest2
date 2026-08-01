package s7;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class x3 extends d7.a {
    public static final Parcelable.Creator<x3> CREATOR = new c7.p(17);

    /* renamed from: d, reason: collision with root package name */
    public final String f9104d;

    /* renamed from: e, reason: collision with root package name */
    public final long f9105e;

    /* renamed from: i, reason: collision with root package name */
    public final int f9106i;

    public x3(int i3, long j, String str) {
        this.f9104d = str;
        this.f9105e = j;
        this.f9106i = i3;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i3) {
        int Z = cf.c.Z(parcel, 20293);
        cf.c.V(parcel, 1, this.f9104d);
        cf.c.Y(parcel, 2, 8);
        parcel.writeLong(this.f9105e);
        cf.c.Y(parcel, 3, 4);
        parcel.writeInt(this.f9106i);
        cf.c.a0(parcel, Z);
    }
}
