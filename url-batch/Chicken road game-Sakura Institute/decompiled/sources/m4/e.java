package m4;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class e extends n4.a {
    public static final Parcelable.Creator<e> CREATOR = new d4.a(8);

    /* renamed from: f, reason: collision with root package name */
    public final int f6355f;

    /* renamed from: g, reason: collision with root package name */
    public final int f6356g;

    /* renamed from: h, reason: collision with root package name */
    public final int f6357h;

    /* renamed from: i, reason: collision with root package name */
    public final long f6358i;

    /* renamed from: j, reason: collision with root package name */
    public final long f6359j;

    /* renamed from: k, reason: collision with root package name */
    public final String f6360k;

    /* renamed from: l, reason: collision with root package name */
    public final String f6361l;

    /* renamed from: m, reason: collision with root package name */
    public final int f6362m;

    /* renamed from: n, reason: collision with root package name */
    public final int f6363n;

    public e(int i7, int i8, int i9, long j8, long j9, String str, String str2, int i10, int i11) {
        this.f6355f = i7;
        this.f6356g = i8;
        this.f6357h = i9;
        this.f6358i = j8;
        this.f6359j = j9;
        this.f6360k = str;
        this.f6361l = str2;
        this.f6362m = i10;
        this.f6363n = i11;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int R = a8.m.R(parcel, 20293);
        a8.m.T(parcel, 1, 4);
        parcel.writeInt(this.f6355f);
        a8.m.T(parcel, 2, 4);
        parcel.writeInt(this.f6356g);
        a8.m.T(parcel, 3, 4);
        parcel.writeInt(this.f6357h);
        a8.m.T(parcel, 4, 8);
        parcel.writeLong(this.f6358i);
        a8.m.T(parcel, 5, 8);
        parcel.writeLong(this.f6359j);
        a8.m.P(parcel, 6, this.f6360k);
        a8.m.P(parcel, 7, this.f6361l);
        a8.m.T(parcel, 8, 4);
        parcel.writeInt(this.f6362m);
        a8.m.T(parcel, 9, 4);
        parcel.writeInt(this.f6363n);
        a8.m.S(parcel, R);
    }
}
