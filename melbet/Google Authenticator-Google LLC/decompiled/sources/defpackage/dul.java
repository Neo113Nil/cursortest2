package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class dul implements dtm {
    public static final dul a = new dul();
    public static final Parcelable.Creator CREATOR = new dtk(4);

    private dul() {
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dul)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return -962738605;
    }

    public final String toString() {
        return "NoOpOnResult";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeInt(1);
    }
}
