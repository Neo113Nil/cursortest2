package q2;

import H.h;
import O3.l;
import android.os.Parcel;
import android.os.Parcelable;
import e2.AbstractC0408a;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class c extends AbstractC0408a {
    public static final Parcelable.Creator<c> CREATOR = new h(28);

    /* renamed from: a, reason: collision with root package name */
    public final int f15088a;

    /* renamed from: b, reason: collision with root package name */
    public final int f15089b;

    /* renamed from: c, reason: collision with root package name */
    public final long f15090c;

    /* renamed from: d, reason: collision with root package name */
    public final long f15091d;

    public c(int i4, int i5, long j4, long j5) {
        this.f15088a = i4;
        this.f15089b = i5;
        this.f15090c = j4;
        this.f15091d = j5;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof c) {
            c cVar = (c) obj;
            if (this.f15088a == cVar.f15088a && this.f15089b == cVar.f15089b && this.f15090c == cVar.f15090c && this.f15091d == cVar.f15091d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f15089b), Integer.valueOf(this.f15088a), Long.valueOf(this.f15091d), Long.valueOf(this.f15090c)});
    }

    public final String toString() {
        return "NetworkLocationStatus: Wifi status: " + this.f15088a + " Cell status: " + this.f15089b + " elapsed time NS: " + this.f15091d + " system time ms: " + this.f15090c;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i4) {
        int D3 = l.D(parcel, 20293);
        l.G(parcel, 1, 4);
        parcel.writeInt(this.f15088a);
        l.G(parcel, 2, 4);
        parcel.writeInt(this.f15089b);
        l.G(parcel, 3, 8);
        parcel.writeLong(this.f15090c);
        l.G(parcel, 4, 8);
        parcel.writeLong(this.f15091d);
        l.F(parcel, D3);
    }
}
