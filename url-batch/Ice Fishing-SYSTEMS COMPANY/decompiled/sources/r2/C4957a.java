package r2;

import S0.f;
import android.os.Parcel;
import android.os.Parcelable;
import f3.C4509h;

/* renamed from: r2.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4957a extends P2.a {
    public static final Parcelable.Creator<C4957a> CREATOR = new C4509h(6);

    /* renamed from: n, reason: collision with root package name */
    public final String f40278n;

    /* renamed from: u, reason: collision with root package name */
    public final String f40279u;

    /* renamed from: v, reason: collision with root package name */
    public final String f40280v;

    public C4957a(String str, String str2, String str3) {
        this.f40278n = str;
        this.f40279u = str2;
        this.f40280v = str3;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int B8 = f.B(parcel, 20293);
        f.u(parcel, 1, this.f40278n);
        f.u(parcel, 2, this.f40279u);
        f.u(parcel, 3, this.f40280v);
        f.C(parcel, B8);
    }
}
