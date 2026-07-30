package j4;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class d extends n4.a {
    public static final Parcelable.Creator<d> CREATOR = new d4.a(4);

    /* renamed from: f, reason: collision with root package name */
    public final String f5009f;

    /* renamed from: g, reason: collision with root package name */
    public final int f5010g;

    /* renamed from: h, reason: collision with root package name */
    public final long f5011h;

    public d() {
        this.f5009f = "CLIENT_TELEMETRY";
        this.f5011h = 1L;
        this.f5010g = -1;
    }

    public final long a() {
        long j8 = this.f5011h;
        return j8 == -1 ? this.f5010g : j8;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof d) {
            d dVar = (d) obj;
            String str = dVar.f5009f;
            String str2 = this.f5009f;
            if (((str2 != null && str2.equals(str)) || (str2 == null && str == null)) && a() == dVar.a()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f5009f, Long.valueOf(a())});
    }

    public final String toString() {
        androidx.room.c cVar = new androidx.room.c(this);
        cVar.l(this.f5009f, "name");
        cVar.l(Long.valueOf(a()), "version");
        return cVar.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int R = a8.m.R(parcel, 20293);
        a8.m.P(parcel, 1, this.f5009f);
        a8.m.T(parcel, 2, 4);
        parcel.writeInt(this.f5010g);
        long a3 = a();
        a8.m.T(parcel, 3, 8);
        parcel.writeLong(a3);
        a8.m.S(parcel, R);
    }

    public d(int i7, long j8, String str) {
        this.f5009f = str;
        this.f5010g = i7;
        this.f5011h = j8;
    }
}
