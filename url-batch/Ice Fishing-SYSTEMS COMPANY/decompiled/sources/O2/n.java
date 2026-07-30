package O2;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* loaded from: classes.dex */
public final class n extends P2.a {
    public static final Parcelable.Creator<n> CREATOR = new F0.a(7);

    /* renamed from: n, reason: collision with root package name */
    public final int f2449n;

    /* renamed from: u, reason: collision with root package name */
    public List f2450u;

    public n(int i, List list) {
        this.f2449n = i;
        this.f2450u = list;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int B8 = S0.f.B(parcel, 20293);
        S0.f.A(parcel, 1, 4);
        parcel.writeInt(this.f2449n);
        S0.f.y(parcel, 2, this.f2450u);
        S0.f.C(parcel, B8);
    }
}
