package q2;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class i1 extends P2.a {
    public static final Parcelable.Creator<i1> CREATOR = new C4894i0(11);

    /* renamed from: A, reason: collision with root package name */
    public final String f40078A;

    /* renamed from: n, reason: collision with root package name */
    public final String f40079n;

    /* renamed from: u, reason: collision with root package name */
    public long f40080u;

    /* renamed from: v, reason: collision with root package name */
    public C4927z0 f40081v;

    /* renamed from: w, reason: collision with root package name */
    public final Bundle f40082w;

    /* renamed from: x, reason: collision with root package name */
    public final String f40083x;

    /* renamed from: y, reason: collision with root package name */
    public final String f40084y;

    /* renamed from: z, reason: collision with root package name */
    public final String f40085z;

    public i1(String str, long j9, C4927z0 c4927z0, Bundle bundle, String str2, String str3, String str4, String str5) {
        this.f40079n = str;
        this.f40080u = j9;
        this.f40081v = c4927z0;
        this.f40082w = bundle;
        this.f40083x = str2;
        this.f40084y = str3;
        this.f40085z = str4;
        this.f40078A = str5;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int B8 = S0.f.B(parcel, 20293);
        S0.f.u(parcel, 1, this.f40079n);
        long j9 = this.f40080u;
        S0.f.A(parcel, 2, 8);
        parcel.writeLong(j9);
        S0.f.t(parcel, 3, this.f40081v, i);
        S0.f.q(parcel, 4, this.f40082w);
        S0.f.u(parcel, 5, this.f40083x);
        S0.f.u(parcel, 6, this.f40084y);
        S0.f.u(parcel, 7, this.f40085z);
        S0.f.u(parcel, 8, this.f40078A);
        S0.f.C(parcel, B8);
    }
}
