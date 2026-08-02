package K0;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class d extends O0.a {
    public static final Parcelable.Creator<d> CREATOR = new H.h(4);

    /* renamed from: a, reason: collision with root package name */
    public final String f842a;

    /* renamed from: b, reason: collision with root package name */
    public final int f843b;

    /* renamed from: c, reason: collision with root package name */
    public final long f844c;

    public d(String str) {
        this.f842a = str;
        this.f844c = 1L;
        this.f843b = -1;
    }

    public final long a() {
        long j3 = this.f844c;
        return j3 == -1 ? this.f843b : j3;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof d) {
            d dVar = (d) obj;
            String str = this.f842a;
            if (((str != null && str.equals(dVar.f842a)) || (str == null && dVar.f842a == null)) && a() == dVar.a()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f842a, Long.valueOf(a())});
    }

    public final String toString() {
        V0.e eVar = new V0.e(this);
        eVar.u(this.f842a, "name");
        eVar.u(Long.valueOf(a()), "version");
        return eVar.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i3) {
        int S2 = C2.b.S(parcel, 20293);
        C2.b.O(parcel, 1, this.f842a);
        C2.b.U(parcel, 2, 4);
        parcel.writeInt(this.f843b);
        long a3 = a();
        C2.b.U(parcel, 3, 8);
        parcel.writeLong(a3);
        C2.b.T(parcel, S2);
    }

    public d(String str, int i3, long j3) {
        this.f842a = str;
        this.f843b = i3;
        this.f844c = j3;
    }
}
