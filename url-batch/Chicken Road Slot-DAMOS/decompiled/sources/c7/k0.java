package c7;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class k0 extends d7.a {
    public static final Parcelable.Creator<k0> CREATOR = new p(6);

    /* renamed from: d, reason: collision with root package name */
    public Bundle f1935d;

    /* renamed from: e, reason: collision with root package name */
    public z6.d[] f1936e;

    /* renamed from: i, reason: collision with root package name */
    public int f1937i;

    /* renamed from: r, reason: collision with root package name */
    public g f1938r;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i3) {
        int Z = cf.c.Z(parcel, 20293);
        cf.c.P(parcel, 1, this.f1935d);
        cf.c.W(parcel, 2, this.f1936e, i3);
        int i10 = this.f1937i;
        cf.c.Y(parcel, 3, 4);
        parcel.writeInt(i10);
        cf.c.U(parcel, 4, this.f1938r, i3);
        cf.c.a0(parcel, Z);
    }
}
