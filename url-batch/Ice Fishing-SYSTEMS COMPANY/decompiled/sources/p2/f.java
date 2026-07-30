package p2;

import android.os.Parcel;
import android.os.Parcelable;
import f3.C4509h;

/* loaded from: classes.dex */
public final class f extends P2.a {
    public static final Parcelable.Creator<f> CREATOR = new C4509h(4);

    /* renamed from: A, reason: collision with root package name */
    public final boolean f39781A;

    /* renamed from: B, reason: collision with root package name */
    public final boolean f39782B;

    /* renamed from: n, reason: collision with root package name */
    public final boolean f39783n;

    /* renamed from: u, reason: collision with root package name */
    public final boolean f39784u;

    /* renamed from: v, reason: collision with root package name */
    public final String f39785v;

    /* renamed from: w, reason: collision with root package name */
    public final boolean f39786w;

    /* renamed from: x, reason: collision with root package name */
    public final float f39787x;

    /* renamed from: y, reason: collision with root package name */
    public final int f39788y;

    /* renamed from: z, reason: collision with root package name */
    public final boolean f39789z;

    public f(boolean z8, boolean z9, String str, boolean z10, float f6, int i, boolean z11, boolean z12, boolean z13) {
        this.f39783n = z8;
        this.f39784u = z9;
        this.f39785v = str;
        this.f39786w = z10;
        this.f39787x = f6;
        this.f39788y = i;
        this.f39789z = z11;
        this.f39781A = z12;
        this.f39782B = z13;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int B8 = S0.f.B(parcel, 20293);
        S0.f.A(parcel, 2, 4);
        parcel.writeInt(this.f39783n ? 1 : 0);
        S0.f.A(parcel, 3, 4);
        parcel.writeInt(this.f39784u ? 1 : 0);
        S0.f.u(parcel, 4, this.f39785v);
        S0.f.A(parcel, 5, 4);
        parcel.writeInt(this.f39786w ? 1 : 0);
        S0.f.A(parcel, 6, 4);
        parcel.writeFloat(this.f39787x);
        S0.f.A(parcel, 7, 4);
        parcel.writeInt(this.f39788y);
        S0.f.A(parcel, 8, 4);
        parcel.writeInt(this.f39789z ? 1 : 0);
        S0.f.A(parcel, 9, 4);
        parcel.writeInt(this.f39781A ? 1 : 0);
        S0.f.A(parcel, 10, 4);
        parcel.writeInt(this.f39782B ? 1 : 0);
        S0.f.C(parcel, B8);
    }

    public f(boolean z8, boolean z9, boolean z10, float f6, boolean z11, boolean z12, boolean z13) {
        this(z8, z9, null, z10, f6, -1, z11, z12, z13);
    }
}
