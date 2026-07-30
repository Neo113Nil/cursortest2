package f3;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: f3.b, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4503b extends P2.a {
    public static final Parcelable.Creator<C4503b> CREATOR = new F0.a(28);

    /* renamed from: n, reason: collision with root package name */
    public final int f37701n;

    /* renamed from: u, reason: collision with root package name */
    public final int f37702u;

    /* renamed from: v, reason: collision with root package name */
    public final Intent f37703v;

    public C4503b(int i, int i4, Intent intent) {
        this.f37701n = i;
        this.f37702u = i4;
        this.f37703v = intent;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int B8 = S0.f.B(parcel, 20293);
        S0.f.A(parcel, 1, 4);
        parcel.writeInt(this.f37701n);
        S0.f.A(parcel, 2, 4);
        parcel.writeInt(this.f37702u);
        S0.f.t(parcel, 3, this.f37703v, i);
        S0.f.C(parcel, B8);
    }
}
