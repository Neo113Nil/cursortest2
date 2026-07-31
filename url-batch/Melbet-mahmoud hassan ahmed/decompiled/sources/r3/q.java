package r3;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.RecentlyNonNull;

/* loaded from: classes.dex */
public class q extends s3.a {

    @RecentlyNonNull
    public static final Parcelable.Creator<q> CREATOR = new o0();

    /* renamed from: f, reason: collision with root package name */
    private final int f21314f;

    /* renamed from: g, reason: collision with root package name */
    private final boolean f21315g;

    /* renamed from: h, reason: collision with root package name */
    private final boolean f21316h;

    /* renamed from: i, reason: collision with root package name */
    private final int f21317i;

    /* renamed from: j, reason: collision with root package name */
    private final int f21318j;

    public q(int i7, boolean z6, boolean z7, int i8, int i9) {
        this.f21314f = i7;
        this.f21315g = z6;
        this.f21316h = z7;
        this.f21317i = i8;
        this.f21318j = i9;
    }

    public int c() {
        return this.f21317i;
    }

    public int g() {
        return this.f21318j;
    }

    public boolean h() {
        return this.f21315g;
    }

    public boolean i() {
        return this.f21316h;
    }

    public int j() {
        return this.f21314f;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@RecentlyNonNull Parcel parcel, int i7) {
        int a7 = s3.c.a(parcel);
        s3.c.h(parcel, 1, j());
        s3.c.c(parcel, 2, h());
        s3.c.c(parcel, 3, i());
        s3.c.h(parcel, 4, c());
        s3.c.h(parcel, 5, g());
        s3.c.b(parcel, a7);
    }
}
