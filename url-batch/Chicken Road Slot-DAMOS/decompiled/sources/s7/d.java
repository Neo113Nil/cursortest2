package s7;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class d extends d7.a {
    public static final Parcelable.Creator<d> CREATOR = new c7.p(12);

    /* renamed from: d, reason: collision with root package name */
    public final long f8566d;

    /* renamed from: e, reason: collision with root package name */
    public final int f8567e;

    /* renamed from: i, reason: collision with root package name */
    public final long f8568i;

    public d(int i3, long j, long j3) {
        this.f8566d = j;
        this.f8567e = i3;
        this.f8568i = j3;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i3) {
        int Z = cf.c.Z(parcel, 20293);
        cf.c.Y(parcel, 1, 8);
        parcel.writeLong(this.f8566d);
        cf.c.Y(parcel, 2, 4);
        parcel.writeInt(this.f8567e);
        cf.c.Y(parcel, 3, 8);
        parcel.writeLong(this.f8568i);
        cf.c.a0(parcel, Z);
    }
}
