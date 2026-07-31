package o3;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.RecentlyNonNull;
import r3.n;

/* loaded from: classes.dex */
public class d extends s3.a {

    @RecentlyNonNull
    public static final Parcelable.Creator<d> CREATOR = new q();

    /* renamed from: f, reason: collision with root package name */
    private final String f19850f;

    /* renamed from: g, reason: collision with root package name */
    @Deprecated
    private final int f19851g;

    /* renamed from: h, reason: collision with root package name */
    private final long f19852h;

    public d(@RecentlyNonNull String str, int i7, long j7) {
        this.f19850f = str;
        this.f19851g = i7;
        this.f19852h = j7;
    }

    public d(@RecentlyNonNull String str, long j7) {
        this.f19850f = str;
        this.f19852h = j7;
        this.f19851g = -1;
    }

    @RecentlyNonNull
    public String c() {
        return this.f19850f;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof d) {
            d dVar = (d) obj;
            if (((c() != null && c().equals(dVar.c())) || (c() == null && dVar.c() == null)) && g() == dVar.g()) {
                return true;
            }
        }
        return false;
    }

    public long g() {
        long j7 = this.f19852h;
        return j7 == -1 ? this.f19851g : j7;
    }

    public final int hashCode() {
        return r3.n.b(c(), Long.valueOf(g()));
    }

    @RecentlyNonNull
    public final String toString() {
        n.a c7 = r3.n.c(this);
        c7.a("name", c());
        c7.a("version", Long.valueOf(g()));
        return c7.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@RecentlyNonNull Parcel parcel, int i7) {
        int a7 = s3.c.a(parcel);
        s3.c.m(parcel, 1, c(), false);
        s3.c.h(parcel, 2, this.f19851g);
        s3.c.k(parcel, 3, g());
        s3.c.b(parcel, a7);
    }
}
