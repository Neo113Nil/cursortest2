package u;

import H2.AbstractC0080b;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: u.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0938f implements Parcelable {
    public static final Parcelable.Creator<C0938f> CREATOR = new C0937e();

    /* renamed from: d, reason: collision with root package name */
    public final int f8064d;

    public C0938f(int i3) {
        this.f8064d = i3;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C0938f) && this.f8064d == ((C0938f) obj).f8064d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f8064d);
    }

    public final String toString() {
        return AbstractC0080b.k(new StringBuilder("DefaultLazyKey(index="), this.f8064d, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i3) {
        parcel.writeInt(this.f8064d);
    }
}
