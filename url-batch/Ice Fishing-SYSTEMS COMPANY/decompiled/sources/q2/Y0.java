package q2;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class Y0 extends P2.a {
    public static final Parcelable.Creator<Y0> CREATOR = new C4894i0(6);

    /* renamed from: n, reason: collision with root package name */
    public final String f39993n;

    public Y0(String str) {
        this.f39993n = str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int B8 = S0.f.B(parcel, 20293);
        S0.f.u(parcel, 15, this.f39993n);
        S0.f.C(parcel, B8);
    }
}
