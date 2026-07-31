package r3;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class v0 extends s3.a {
    public static final Parcelable.Creator<v0> CREATOR = new w0();

    /* renamed from: f, reason: collision with root package name */
    Bundle f21334f;

    /* renamed from: g, reason: collision with root package name */
    o3.d[] f21335g;

    /* renamed from: h, reason: collision with root package name */
    int f21336h;

    /* renamed from: i, reason: collision with root package name */
    e f21337i;

    public v0() {
    }

    v0(Bundle bundle, o3.d[] dVarArr, int i7, e eVar) {
        this.f21334f = bundle;
        this.f21335g = dVarArr;
        this.f21336h = i7;
        this.f21337i = eVar;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int a7 = s3.c.a(parcel);
        s3.c.d(parcel, 1, this.f21334f, false);
        s3.c.p(parcel, 2, this.f21335g, i7, false);
        s3.c.h(parcel, 3, this.f21336h);
        s3.c.l(parcel, 4, this.f21337i, i7, false);
        s3.c.b(parcel, a7);
    }
}
