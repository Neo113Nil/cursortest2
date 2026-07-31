package t;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: t.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0978f implements Parcelable {
    public static final Parcelable.Creator<C0978f> CREATOR = new C0977e();

    /* renamed from: d, reason: collision with root package name */
    public final int f8475d;

    public C0978f(int i3) {
        this.f8475d = i3;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C0978f) && this.f8475d == ((C0978f) obj).f8475d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f8475d);
    }

    public final String toString() {
        return A.k.j(new StringBuilder("DefaultLazyKey(index="), this.f8475d, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i3) {
        parcel.writeInt(this.f8475d);
    }
}
