package H2;

import S0.f;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class c extends P2.a {
    public static final Parcelable.Creator<c> CREATOR = new F0.a(1);

    /* renamed from: n, reason: collision with root package name */
    public final String f1210n;

    /* renamed from: u, reason: collision with root package name */
    public final int f1211u;

    public c(String str, int i) {
        this.f1210n = str;
        this.f1211u = i;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int B8 = f.B(parcel, 20293);
        f.u(parcel, 1, this.f1210n);
        f.A(parcel, 2, 4);
        parcel.writeInt(this.f1211u);
        f.C(parcel, B8);
    }
}
