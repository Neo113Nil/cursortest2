package a0;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class h implements Parcelable {
    public static final Parcelable.Creator<h> CREATOR = new g();

    /* renamed from: d, reason: collision with root package name */
    public final int f87d;

    public h(int i) {
        this.f87d = i;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof h) && this.f87d == ((h) obj).f87d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f87d);
    }

    public final String toString() {
        return q.k(new StringBuilder("DefaultLazyKey(index="), this.f87d, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f87d);
    }
}
