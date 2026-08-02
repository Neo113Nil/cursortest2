package a2;

import android.os.Parcel;
import android.os.Parcelable;
import d2.C0389g;
import e2.AbstractC0408a;
import java.util.Arrays;

/* renamed from: a2.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0164d extends AbstractC0408a {
    public static final Parcelable.Creator<C0164d> CREATOR = new H.h(4);

    /* renamed from: a, reason: collision with root package name */
    public final String f4271a;

    /* renamed from: b, reason: collision with root package name */
    public final int f4272b;

    /* renamed from: c, reason: collision with root package name */
    public final long f4273c;

    public C0164d(String str) {
        this.f4271a = str;
        this.f4273c = 1L;
        this.f4272b = -1;
    }

    public final long a() {
        long j4 = this.f4273c;
        return j4 == -1 ? this.f4272b : j4;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C0164d) {
            C0164d c0164d = (C0164d) obj;
            String str = this.f4271a;
            if (((str != null && str.equals(c0164d.f4271a)) || (str == null && c0164d.f4271a == null)) && a() == c0164d.a()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f4271a, Long.valueOf(a())});
    }

    public final String toString() {
        C0389g c0389g = new C0389g(this);
        c0389g.C(this.f4271a, "name");
        c0389g.C(Long.valueOf(a()), "version");
        return c0389g.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i4) {
        int D3 = O3.l.D(parcel, 20293);
        O3.l.A(parcel, 1, this.f4271a);
        O3.l.G(parcel, 2, 4);
        parcel.writeInt(this.f4272b);
        long a3 = a();
        O3.l.G(parcel, 3, 8);
        parcel.writeLong(a3);
        O3.l.F(parcel, D3);
    }

    public C0164d(String str, int i4, long j4) {
        this.f4271a = str;
        this.f4272b = i4;
        this.f4273c = j4;
    }
}
