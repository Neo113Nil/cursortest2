package T;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class O implements Comparable, Parcelable {
    public static final Parcelable.Creator<O> CREATOR = new C0092j(2);

    /* renamed from: a, reason: collision with root package name */
    public final int f2678a;

    /* renamed from: b, reason: collision with root package name */
    public final int f2679b;

    /* renamed from: c, reason: collision with root package name */
    public final int f2680c;

    static {
        W.J.G(0);
        W.J.G(1);
        W.J.G(2);
    }

    public O() {
        this.f2678a = -1;
        this.f2679b = -1;
        this.f2680c = -1;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        O o = (O) obj;
        int i4 = this.f2678a - o.f2678a;
        if (i4 != 0) {
            return i4;
        }
        int i5 = this.f2679b - o.f2679b;
        return i5 == 0 ? this.f2680c - o.f2680c : i5;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && O.class == obj.getClass()) {
            O o = (O) obj;
            if (this.f2678a == o.f2678a && this.f2679b == o.f2679b && this.f2680c == o.f2680c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((this.f2678a * 31) + this.f2679b) * 31) + this.f2680c;
    }

    public final String toString() {
        return this.f2678a + "." + this.f2679b + "." + this.f2680c;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i4) {
        parcel.writeInt(this.f2678a);
        parcel.writeInt(this.f2679b);
        parcel.writeInt(this.f2680c);
    }

    public O(Parcel parcel) {
        this.f2678a = parcel.readInt();
        this.f2679b = parcel.readInt();
        this.f2680c = parcel.readInt();
    }
}
