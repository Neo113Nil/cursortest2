package s;

import A.AbstractC0017m;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: s.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1101e implements Parcelable {
    public static final Parcelable.Creator<C1101e> CREATOR = new C1100d();

    /* renamed from: d, reason: collision with root package name */
    public final int f9927d;

    public C1101e(int i2) {
        this.f9927d = i2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1101e) && this.f9927d == ((C1101e) obj).f9927d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f9927d);
    }

    public final String toString() {
        return AbstractC0017m.l(new StringBuilder("DefaultLazyKey(index="), this.f9927d, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        parcel.writeInt(this.f9927d);
    }
}
