package O2;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: O2.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0374k extends P2.a {
    public static final Parcelable.Creator<C0374k> CREATOR = new F0.a(8);

    /* renamed from: A, reason: collision with root package name */
    public final int f2432A;

    /* renamed from: B, reason: collision with root package name */
    public final int f2433B;

    /* renamed from: n, reason: collision with root package name */
    public final int f2434n;

    /* renamed from: u, reason: collision with root package name */
    public final int f2435u;

    /* renamed from: v, reason: collision with root package name */
    public final int f2436v;

    /* renamed from: w, reason: collision with root package name */
    public final long f2437w;

    /* renamed from: x, reason: collision with root package name */
    public final long f2438x;

    /* renamed from: y, reason: collision with root package name */
    public final String f2439y;

    /* renamed from: z, reason: collision with root package name */
    public final String f2440z;

    public C0374k(int i, int i4, int i9, long j9, long j10, String str, String str2, int i10, int i11) {
        this.f2434n = i;
        this.f2435u = i4;
        this.f2436v = i9;
        this.f2437w = j9;
        this.f2438x = j10;
        this.f2439y = str;
        this.f2440z = str2;
        this.f2432A = i10;
        this.f2433B = i11;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int B8 = S0.f.B(parcel, 20293);
        S0.f.A(parcel, 1, 4);
        parcel.writeInt(this.f2434n);
        S0.f.A(parcel, 2, 4);
        parcel.writeInt(this.f2435u);
        S0.f.A(parcel, 3, 4);
        parcel.writeInt(this.f2436v);
        S0.f.A(parcel, 4, 8);
        parcel.writeLong(this.f2437w);
        S0.f.A(parcel, 5, 8);
        parcel.writeLong(this.f2438x);
        S0.f.u(parcel, 6, this.f2439y);
        S0.f.u(parcel, 7, this.f2440z);
        S0.f.A(parcel, 8, 4);
        parcel.writeInt(this.f2432A);
        S0.f.A(parcel, 9, 4);
        parcel.writeInt(this.f2433B);
        S0.f.C(parcel, B8);
    }
}
