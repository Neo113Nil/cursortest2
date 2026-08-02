package N0;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class x extends O0.a {
    public static final Parcelable.Creator<x> CREATOR = new H.h(12);

    /* renamed from: a, reason: collision with root package name */
    public Bundle f1066a;

    /* renamed from: b, reason: collision with root package name */
    public K0.d[] f1067b;

    /* renamed from: c, reason: collision with root package name */
    public int f1068c;

    /* renamed from: d, reason: collision with root package name */
    public C0064c f1069d;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i3) {
        int S2 = C2.b.S(parcel, 20293);
        Bundle bundle = this.f1066a;
        if (bundle != null) {
            int S3 = C2.b.S(parcel, 1);
            parcel.writeBundle(bundle);
            C2.b.T(parcel, S3);
        }
        C2.b.P(parcel, 2, this.f1067b, i3);
        C2.b.U(parcel, 3, 4);
        parcel.writeInt(this.f1068c);
        C2.b.N(parcel, 4, this.f1069d, i3);
        C2.b.T(parcel, S2);
    }
}
