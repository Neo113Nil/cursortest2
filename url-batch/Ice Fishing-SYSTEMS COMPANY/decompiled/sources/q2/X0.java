package q2;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class X0 extends P2.a {
    public static final Parcelable.Creator<X0> CREATOR = new C4894i0(5);

    /* renamed from: n, reason: collision with root package name */
    public final int f39991n;

    /* renamed from: u, reason: collision with root package name */
    public final int f39992u;

    public X0(int i, int i4) {
        this.f39991n = i;
        this.f39992u = i4;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int B8 = S0.f.B(parcel, 20293);
        S0.f.A(parcel, 1, 4);
        parcel.writeInt(this.f39991n);
        S0.f.A(parcel, 2, 4);
        parcel.writeInt(this.f39992u);
        S0.f.C(parcel, B8);
    }

    public X0(k2.r rVar) {
        this.f39991n = rVar.f38727a;
        this.f39992u = -1;
    }
}
