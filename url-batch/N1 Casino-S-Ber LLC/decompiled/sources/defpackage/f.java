package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-f21f5e89e3d3d92eca33bfe12a7775f49cadfb54340e756eb509706243ac6f5c */
/* loaded from: classes.dex */
public abstract class f implements Parcelable {
    public final Parcelable f;
    public static final d g = new d();
    public static final Parcelable.Creator<f> CREATOR = new e(0);

    public f(Parcelable parcelable) {
        if (parcelable != null) {
            this.f = parcelable == g ? null : parcelable;
        } else {
            t8.k("superState must not be null");
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
