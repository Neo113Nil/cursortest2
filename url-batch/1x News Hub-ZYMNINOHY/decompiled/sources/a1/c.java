package a1;

import H.h;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class c extends O0.a {
    public static final Parcelable.Creator<c> CREATOR = new h(22);

    /* renamed from: a, reason: collision with root package name */
    public final int f1924a;

    /* renamed from: b, reason: collision with root package name */
    public final int f1925b;

    /* renamed from: c, reason: collision with root package name */
    public final long f1926c;

    /* renamed from: d, reason: collision with root package name */
    public final long f1927d;

    public c(int i3, int i4, long j3, long j4) {
        this.f1924a = i3;
        this.f1925b = i4;
        this.f1926c = j3;
        this.f1927d = j4;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof c) {
            c cVar = (c) obj;
            if (this.f1924a == cVar.f1924a && this.f1925b == cVar.f1925b && this.f1926c == cVar.f1926c && this.f1927d == cVar.f1927d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f1925b), Integer.valueOf(this.f1924a), Long.valueOf(this.f1927d), Long.valueOf(this.f1926c)});
    }

    public final String toString() {
        return "NetworkLocationStatus: Wifi status: " + this.f1924a + " Cell status: " + this.f1925b + " elapsed time NS: " + this.f1927d + " system time ms: " + this.f1926c;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i3) {
        int S2 = C2.b.S(parcel, 20293);
        C2.b.U(parcel, 1, 4);
        parcel.writeInt(this.f1924a);
        C2.b.U(parcel, 2, 4);
        parcel.writeInt(this.f1925b);
        C2.b.U(parcel, 3, 8);
        parcel.writeLong(this.f1926c);
        C2.b.U(parcel, 4, 8);
        parcel.writeLong(this.f1927d);
        C2.b.T(parcel, S2);
    }
}
