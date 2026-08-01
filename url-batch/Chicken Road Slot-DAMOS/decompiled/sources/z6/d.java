package z6;

import android.os.Parcel;
import android.os.Parcelable;
import c7.c0;
import java.util.Arrays;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class d extends d7.a {
    public static final Parcelable.Creator<d> CREATOR = new y6.m(2);

    /* renamed from: d, reason: collision with root package name */
    public final String f10874d;

    /* renamed from: e, reason: collision with root package name */
    public final int f10875e;

    /* renamed from: i, reason: collision with root package name */
    public final long f10876i;

    /* renamed from: r, reason: collision with root package name */
    public final boolean f10877r;

    public d(String str, int i3, long j, boolean z10) {
        this.f10874d = str;
        this.f10875e = i3;
        this.f10876i = j;
        this.f10877r = z10;
    }

    public final long b() {
        long j = this.f10876i;
        return j == -1 ? this.f10875e : j;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof d) {
            d dVar = (d) obj;
            if (c0.k(this.f10874d, dVar.f10874d) && b() == dVar.b() && this.f10877r == dVar.f10877r) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f10874d, Long.valueOf(b()), Boolean.valueOf(this.f10877r)});
    }

    public final String toString() {
        c6.e eVar = new c6.e(this);
        eVar.e(this.f10874d, "name");
        eVar.e(Long.valueOf(b()), "version");
        eVar.e(Boolean.valueOf(this.f10877r), "is_fully_rolled_out");
        return eVar.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i3) {
        int Z = cf.c.Z(parcel, 20293);
        cf.c.V(parcel, 1, this.f10874d);
        cf.c.Y(parcel, 2, 4);
        parcel.writeInt(this.f10875e);
        long b10 = b();
        cf.c.Y(parcel, 3, 8);
        parcel.writeLong(b10);
        cf.c.Y(parcel, 4, 4);
        parcel.writeInt(this.f10877r ? 1 : 0);
        cf.c.a0(parcel, Z);
    }

    public d(String str) {
        this(str, -1, 1L, false);
    }
}
