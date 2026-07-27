package E1;

import a.AbstractC0169a;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import p1.AbstractC1380a;

/* loaded from: classes.dex */
public final class g extends AbstractC1380a {
    public static final Parcelable.Creator<g> CREATOR = new B1.c(5);

    /* renamed from: a, reason: collision with root package name */
    public final int f647a;

    /* renamed from: b, reason: collision with root package name */
    public final int f648b;

    /* renamed from: c, reason: collision with root package name */
    public final long f649c;

    /* renamed from: d, reason: collision with root package name */
    public final long f650d;

    public g(int i2, int i3, long j2, long j6) {
        this.f647a = i2;
        this.f648b = i3;
        this.f649c = j2;
        this.f650d = j6;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof g) {
            g gVar = (g) obj;
            if (this.f647a == gVar.f647a && this.f648b == gVar.f648b && this.f649c == gVar.f649c && this.f650d == gVar.f650d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f648b), Integer.valueOf(this.f647a), Long.valueOf(this.f650d), Long.valueOf(this.f649c)});
    }

    public final String toString() {
        return "NetworkLocationStatus: Wifi status: " + this.f647a + " Cell status: " + this.f648b + " elapsed time NS: " + this.f650d + " system time ms: " + this.f649c;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        int R5 = AbstractC0169a.R(parcel, 20293);
        AbstractC0169a.T(parcel, 1, 4);
        parcel.writeInt(this.f647a);
        AbstractC0169a.T(parcel, 2, 4);
        parcel.writeInt(this.f648b);
        AbstractC0169a.T(parcel, 3, 8);
        parcel.writeLong(this.f649c);
        AbstractC0169a.T(parcel, 4, 8);
        parcel.writeLong(this.f650d);
        AbstractC0169a.S(parcel, R5);
    }
}
