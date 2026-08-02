package c1;

import N0.n;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class e extends O0.a {
    public static final Parcelable.Creator<e> CREATOR = new android.support.v4.media.session.b(5);

    /* renamed from: a, reason: collision with root package name */
    public final int f2625a;

    /* renamed from: b, reason: collision with root package name */
    public final K0.b f2626b;

    /* renamed from: c, reason: collision with root package name */
    public final n f2627c;

    public e(int i3, K0.b bVar, n nVar) {
        this.f2625a = i3;
        this.f2626b = bVar;
        this.f2627c = nVar;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i3) {
        int S2 = C2.b.S(parcel, 20293);
        C2.b.U(parcel, 1, 4);
        parcel.writeInt(this.f2625a);
        C2.b.N(parcel, 2, this.f2626b, i3);
        C2.b.N(parcel, 3, this.f2627c, i3);
        C2.b.T(parcel, S2);
    }
}
