package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-555d5e190d9a27a9a8404de93c25a29c9fbe11559b3463c92c68ce527c1de619 */
/* loaded from: classes.dex */
public abstract class f implements Parcelable {
    public final Parcelable f;
    public static final d g = new d();
    public static final Parcelable.Creator<f> CREATOR = new e(0);

    public f(Parcelable parcelable) {
        if (parcelable != null) {
            this.f = parcelable == g ? null : parcelable;
        } else {
            s9.k("superState must not be null");
            throw null;
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f, i);
    }

    public f() {
        this.f = null;
    }

    public f(Parcel parcel, ClassLoader classLoader) {
        Parcelable readParcelable = parcel.readParcelable(classLoader);
        this.f = readParcelable == null ? g : readParcelable;
    }
}
