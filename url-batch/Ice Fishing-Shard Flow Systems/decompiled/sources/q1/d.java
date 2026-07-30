package q1;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import t1.u;
import u1.AbstractC0943a;
import z1.AbstractC1053a;

/* loaded from: classes.dex */
public final class d extends AbstractC0943a {
    public static final Parcelable.Creator<d> CREATOR = new I1.c(22);

    /* renamed from: d, reason: collision with root package name */
    public final String f7318d;

    /* renamed from: e, reason: collision with root package name */
    public final int f7319e;

    /* renamed from: i, reason: collision with root package name */
    public final long f7320i;

    /* renamed from: l, reason: collision with root package name */
    public final boolean f7321l;

    public d(String str, int i2, long j, boolean z7) {
        this.f7318d = str;
        this.f7319e = i2;
        this.f7320i = j;
        this.f7321l = z7;
    }

    public final long a() {
        long j = this.f7320i;
        return j == -1 ? this.f7319e : j;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof d) {
            d dVar = (d) obj;
            if (u.i(this.f7318d, dVar.f7318d) && a() == dVar.a() && this.f7321l == dVar.f7321l) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f7318d, Long.valueOf(a()), Boolean.valueOf(this.f7321l)});
    }

    public final String toString() {
        P0.e eVar = new P0.e(this);
        eVar.l(this.f7318d, "name");
        eVar.l(Long.valueOf(a()), "version");
        eVar.l(Boolean.valueOf(this.f7321l), "is_fully_rolled_out");
        return eVar.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        int Q = AbstractC1053a.Q(parcel, 20293);
        AbstractC1053a.K(parcel, 1, this.f7318d);
        AbstractC1053a.P(parcel, 2, 4);
        parcel.writeInt(this.f7319e);
        long a7 = a();
        AbstractC1053a.P(parcel, 3, 8);
        parcel.writeLong(a7);
        AbstractC1053a.P(parcel, 4, 4);
        parcel.writeInt(this.f7321l ? 1 : 0);
        AbstractC1053a.S(parcel, Q);
    }

    public d(String str) {
        this(str, -1, 1L, false);
    }
}
