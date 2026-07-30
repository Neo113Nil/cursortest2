package q2;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class a1 extends P2.a {
    public static final Parcelable.Creator<a1> CREATOR = new C4894i0(7);

    /* renamed from: n, reason: collision with root package name */
    public final boolean f39995n;

    /* renamed from: u, reason: collision with root package name */
    public final boolean f39996u;

    /* renamed from: v, reason: collision with root package name */
    public final boolean f39997v;

    public a1(k2.w wVar) {
        this(wVar.f38739a, wVar.f38740b, wVar.f38741c);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int B8 = S0.f.B(parcel, 20293);
        S0.f.A(parcel, 2, 4);
        parcel.writeInt(this.f39995n ? 1 : 0);
        S0.f.A(parcel, 3, 4);
        parcel.writeInt(this.f39996u ? 1 : 0);
        S0.f.A(parcel, 4, 4);
        parcel.writeInt(this.f39997v ? 1 : 0);
        S0.f.C(parcel, B8);
    }

    public a1(boolean z8, boolean z9, boolean z10) {
        this.f39995n = z8;
        this.f39996u = z9;
        this.f39997v = z10;
    }
}
