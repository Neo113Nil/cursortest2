package a3;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.ads.b53;
import com.google.android.gms.internal.ads.cv;
import com.google.android.gms.internal.ads.dt2;

/* loaded from: classes.dex */
public final class f0 extends s3.a {
    public static final Parcelable.Creator<f0> CREATOR = new g0();

    /* renamed from: f, reason: collision with root package name */
    public final String f62f;

    /* renamed from: g, reason: collision with root package name */
    public final int f63g;

    f0(String str, int i7) {
        this.f62f = str == null ? "" : str;
        this.f63g = i7;
    }

    public static f0 c(Throwable th) {
        cv a7 = dt2.a(th);
        return new f0(b53.d(th.getMessage()) ? a7.f3955g : th.getMessage(), a7.f3954f);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int a7 = s3.c.a(parcel);
        s3.c.m(parcel, 1, this.f62f, false);
        s3.c.h(parcel, 2, this.f63g);
        s3.c.b(parcel, a7);
    }
}
