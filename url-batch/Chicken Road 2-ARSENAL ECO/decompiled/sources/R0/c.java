package R0;

import a.AbstractC0219a;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import u0.C0675e;

/* loaded from: classes.dex */
public final class c extends V0.a {
    public static final Parcelable.Creator<c> CREATOR = new I.j(3);

    /* renamed from: f, reason: collision with root package name */
    public final String f2059f;

    /* renamed from: g, reason: collision with root package name */
    public final int f2060g;

    /* renamed from: h, reason: collision with root package name */
    public final long f2061h;

    public c() {
        this.f2059f = "CLIENT_TELEMETRY";
        this.f2061h = 1L;
        this.f2060g = -1;
    }

    public final long a() {
        long j4 = this.f2061h;
        return j4 == -1 ? this.f2060g : j4;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof c) {
            c cVar = (c) obj;
            String str = this.f2059f;
            if (((str != null && str.equals(cVar.f2059f)) || (str == null && cVar.f2059f == null)) && a() == cVar.a()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f2059f, Long.valueOf(a())});
    }

    public final String toString() {
        C0675e c0675e = new C0675e(this);
        c0675e.b(this.f2059f, "name");
        c0675e.b(Long.valueOf(a()), "version");
        return c0675e.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int O6 = AbstractC0219a.O(parcel, 20293);
        AbstractC0219a.J(parcel, 1, this.f2059f);
        AbstractC0219a.R(parcel, 2, 4);
        parcel.writeInt(this.f2060g);
        long a7 = a();
        AbstractC0219a.R(parcel, 3, 8);
        parcel.writeLong(a7);
        AbstractC0219a.Q(parcel, O6);
    }

    public c(long j4, String str, int i7) {
        this.f2059f = str;
        this.f2060g = i7;
        this.f2061h = j4;
    }
}
