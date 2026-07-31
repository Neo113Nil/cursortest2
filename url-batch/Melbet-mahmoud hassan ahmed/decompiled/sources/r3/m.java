package r3;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.RecentlyNonNull;

/* loaded from: classes.dex */
public class m extends s3.a {

    @RecentlyNonNull
    public static final Parcelable.Creator<m> CREATOR = new e0();

    /* renamed from: f, reason: collision with root package name */
    private final int f21296f;

    /* renamed from: g, reason: collision with root package name */
    private final int f21297g;

    /* renamed from: h, reason: collision with root package name */
    private final int f21298h;

    /* renamed from: i, reason: collision with root package name */
    private final long f21299i;

    /* renamed from: j, reason: collision with root package name */
    private final long f21300j;

    /* renamed from: k, reason: collision with root package name */
    private final String f21301k;

    /* renamed from: l, reason: collision with root package name */
    private final String f21302l;

    /* renamed from: m, reason: collision with root package name */
    private final int f21303m;

    public m(int i7, int i8, int i9, long j7, long j8, String str, String str2, int i10) {
        this.f21296f = i7;
        this.f21297g = i8;
        this.f21298h = i9;
        this.f21299i = j7;
        this.f21300j = j8;
        this.f21301k = str;
        this.f21302l = str2;
        this.f21303m = i10;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@RecentlyNonNull Parcel parcel, int i7) {
        int a7 = s3.c.a(parcel);
        s3.c.h(parcel, 1, this.f21296f);
        s3.c.h(parcel, 2, this.f21297g);
        s3.c.h(parcel, 3, this.f21298h);
        s3.c.k(parcel, 4, this.f21299i);
        s3.c.k(parcel, 5, this.f21300j);
        s3.c.m(parcel, 6, this.f21301k, false);
        s3.c.m(parcel, 7, this.f21302l, false);
        s3.c.h(parcel, 8, this.f21303m);
        s3.c.b(parcel, a7);
    }
}
