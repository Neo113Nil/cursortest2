package E1;

import a.AbstractC0345a;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import y.t;

/* loaded from: classes.dex */
public final class d extends I1.a {
    public static final Parcelable.Creator<d> CREATOR = new l(1);

    /* renamed from: d, reason: collision with root package name */
    public final String f2284d;

    /* renamed from: e, reason: collision with root package name */
    public final int f2285e;

    /* renamed from: i, reason: collision with root package name */
    public final long f2286i;

    public d() {
        this.f2284d = "CLIENT_TELEMETRY";
        this.f2286i = 1L;
        this.f2285e = -1;
    }

    public final long a() {
        long j4 = this.f2286i;
        return j4 == -1 ? this.f2285e : j4;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof d) {
            d dVar = (d) obj;
            String str = this.f2284d;
            if (((str != null && str.equals(dVar.f2284d)) || (str == null && dVar.f2284d == null)) && a() == dVar.a()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f2284d, Long.valueOf(a())});
    }

    public final String toString() {
        t tVar = new t(this);
        tVar.h(this.f2284d, "name");
        tVar.h(Long.valueOf(a()), "version");
        return tVar.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        int N3 = AbstractC0345a.N(parcel, 20293);
        AbstractC0345a.L(parcel, 1, this.f2284d);
        AbstractC0345a.P(parcel, 2, 4);
        parcel.writeInt(this.f2285e);
        long a4 = a();
        AbstractC0345a.P(parcel, 3, 8);
        parcel.writeLong(a4);
        AbstractC0345a.O(parcel, N3);
    }

    public d(int i2, long j4, String str) {
        this.f2284d = str;
        this.f2285e = i2;
        this.f2286i = j4;
    }
}
