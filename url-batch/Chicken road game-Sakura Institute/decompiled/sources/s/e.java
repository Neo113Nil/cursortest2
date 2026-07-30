package s;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class e implements Parcelable {
    public static final Parcelable.Creator<e> CREATOR = new d();

    /* renamed from: f, reason: collision with root package name */
    public final int f7998f;

    public e(int i7) {
        this.f7998f = i7;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof e) && this.f7998f == ((e) obj).f7998f;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f7998f);
    }

    public final String toString() {
        return a0.m.l(new StringBuilder("DefaultLazyKey(index="), this.f7998f, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        parcel.writeInt(this.f7998f);
    }
}
