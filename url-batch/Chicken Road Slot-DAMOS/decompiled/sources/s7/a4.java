package s7;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class a4 extends d7.a {
    public static final Parcelable.Creator<a4> CREATOR = new c7.p(18);

    /* renamed from: d, reason: collision with root package name */
    public final long f8504d;

    /* renamed from: e, reason: collision with root package name */
    public byte[] f8505e;

    /* renamed from: i, reason: collision with root package name */
    public final String f8506i;

    /* renamed from: r, reason: collision with root package name */
    public final Bundle f8507r;

    /* renamed from: s, reason: collision with root package name */
    public final int f8508s;

    /* renamed from: t, reason: collision with root package name */
    public final long f8509t;

    /* renamed from: u, reason: collision with root package name */
    public String f8510u;

    public a4(long j, byte[] bArr, String str, Bundle bundle, int i3, long j3, String str2) {
        this.f8504d = j;
        this.f8505e = bArr;
        this.f8506i = str;
        this.f8507r = bundle;
        this.f8508s = i3;
        this.f8509t = j3;
        this.f8510u = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i3) {
        int Z = cf.c.Z(parcel, 20293);
        cf.c.Y(parcel, 1, 8);
        parcel.writeLong(this.f8504d);
        cf.c.Q(parcel, 2, this.f8505e);
        cf.c.V(parcel, 3, this.f8506i);
        cf.c.P(parcel, 4, this.f8507r);
        cf.c.Y(parcel, 5, 4);
        parcel.writeInt(this.f8508s);
        cf.c.Y(parcel, 6, 8);
        parcel.writeLong(this.f8509t);
        cf.c.V(parcel, 7, this.f8510u);
        cf.c.a0(parcel, Z);
    }
}
