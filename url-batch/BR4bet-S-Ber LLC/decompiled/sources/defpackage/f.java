package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-de38bb36dc2361356cb83b4c675dbcd2450924cecdb12a3272c608759c381a50 */
/* loaded from: classes.dex */
public abstract class f implements Parcelable {
    public final Parcelable f;
    public static final d g = new d();
    public static final Parcelable.Creator<f> CREATOR = new e(0);

    public f(Parcelable parcelable) {
        if (parcelable != null) {
            this.f = parcelable == g ? null : parcelable;
        } else {
            g9.i("superState must not be null");
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
