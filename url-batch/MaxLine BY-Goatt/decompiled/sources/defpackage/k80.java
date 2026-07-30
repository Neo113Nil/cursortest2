package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class k80 implements Parcelable {
    public static final Parcelable.Creator<k80> CREATOR = new s3(4);
    public final int m;

    public k80(int i) {
        this.m = i;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof k80) && this.m == ((k80) obj).m;
    }

    public final int hashCode() {
        return Integer.hashCode(this.m);
    }

    public final String toString() {
        return q40.o(new StringBuilder("DefaultLazyKey(index="), this.m, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.m);
    }
}
