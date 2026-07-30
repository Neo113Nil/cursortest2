package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public abstract class s implements Parcelable {
    public final Parcelable m;
    public static final r n = new r();
    public static final Parcelable.Creator<s> CREATOR = new kz1(1);

    public s(Parcelable parcelable) {
        if (parcelable != null) {
            this.m = parcelable == n ? null : parcelable;
        } else {
            lh.e("superState must not be null");
            throw null;
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.m, i);
    }

    public s() {
        this.m = null;
    }

    public s(Parcel parcel, ClassLoader classLoader) {
        Parcelable readParcelable = parcel.readParcelable(classLoader);
        this.m = readParcelable == null ? n : readParcelable;
    }
}
