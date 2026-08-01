package c7;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class g extends d7.a {
    public static final Parcelable.Creator<g> CREATOR = new p(7);

    /* renamed from: d, reason: collision with root package name */
    public final m f1903d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f1904e;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f1905i;

    /* renamed from: r, reason: collision with root package name */
    public final int[] f1906r;

    /* renamed from: s, reason: collision with root package name */
    public final int f1907s;

    /* renamed from: t, reason: collision with root package name */
    public final int[] f1908t;

    public g(m mVar, boolean z10, boolean z11, int[] iArr, int i3, int[] iArr2) {
        this.f1903d = mVar;
        this.f1904e = z10;
        this.f1905i = z11;
        this.f1906r = iArr;
        this.f1907s = i3;
        this.f1908t = iArr2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i3) {
        int Z = cf.c.Z(parcel, 20293);
        cf.c.U(parcel, 1, this.f1903d, i3);
        cf.c.Y(parcel, 2, 4);
        parcel.writeInt(this.f1904e ? 1 : 0);
        cf.c.Y(parcel, 3, 4);
        parcel.writeInt(this.f1905i ? 1 : 0);
        cf.c.T(parcel, 4, this.f1906r);
        cf.c.Y(parcel, 5, 4);
        parcel.writeInt(this.f1907s);
        cf.c.T(parcel, 6, this.f1908t);
        cf.c.a0(parcel, Z);
    }
}
