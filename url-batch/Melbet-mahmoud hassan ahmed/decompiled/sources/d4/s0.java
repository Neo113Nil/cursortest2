package d4;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class s0 extends s3.a {
    public static final Parcelable.Creator<s0> CREATOR = new b();

    /* renamed from: f, reason: collision with root package name */
    public final long f15716f;

    /* renamed from: g, reason: collision with root package name */
    public final long f15717g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f15718h;

    /* renamed from: i, reason: collision with root package name */
    public final String f15719i;

    /* renamed from: j, reason: collision with root package name */
    public final String f15720j;

    /* renamed from: k, reason: collision with root package name */
    public final String f15721k;

    /* renamed from: l, reason: collision with root package name */
    public final Bundle f15722l;

    /* renamed from: m, reason: collision with root package name */
    public final String f15723m;

    public s0(long j7, long j8, boolean z6, String str, String str2, String str3, Bundle bundle, String str4) {
        this.f15716f = j7;
        this.f15717g = j8;
        this.f15718h = z6;
        this.f15719i = str;
        this.f15720j = str2;
        this.f15721k = str3;
        this.f15722l = bundle;
        this.f15723m = str4;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int a7 = s3.c.a(parcel);
        s3.c.k(parcel, 1, this.f15716f);
        s3.c.k(parcel, 2, this.f15717g);
        s3.c.c(parcel, 3, this.f15718h);
        s3.c.m(parcel, 4, this.f15719i, false);
        s3.c.m(parcel, 5, this.f15720j, false);
        s3.c.m(parcel, 6, this.f15721k, false);
        s3.c.d(parcel, 7, this.f15722l, false);
        s3.c.m(parcel, 8, this.f15723m, false);
        s3.c.b(parcel, a7);
    }
}
