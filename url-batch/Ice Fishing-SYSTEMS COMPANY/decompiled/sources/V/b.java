package V;

import B.g;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public abstract class b implements Parcelable {

    /* renamed from: n, reason: collision with root package name */
    public final Parcelable f3318n;

    /* renamed from: u, reason: collision with root package name */
    public static final a f3317u = new a();
    public static final Parcelable.Creator<b> CREATOR = new g(4);

    public b() {
        this.f3318n = null;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f3318n, i);
    }

    public b(Parcelable parcelable) {
        if (parcelable != null) {
            this.f3318n = parcelable == f3317u ? null : parcelable;
            return;
        }
        throw new IllegalArgumentException("superState must not be null");
    }

    public b(Parcel parcel, ClassLoader classLoader) {
        Parcelable readParcelable = parcel.readParcelable(classLoader);
        this.f3318n = readParcelable == null ? f3317u : readParcelable;
    }
}
