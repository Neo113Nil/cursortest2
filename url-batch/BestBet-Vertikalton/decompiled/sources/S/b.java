package S;

import C0.g;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public abstract class b implements Parcelable {

    /* renamed from: a, reason: collision with root package name */
    public final Parcelable f986a;

    /* renamed from: b, reason: collision with root package name */
    public static final a f985b = new a();
    public static final Parcelable.Creator<b> CREATOR = new g(3);

    public b() {
        this.f986a = null;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f986a, i);
    }

    public b(Parcelable parcelable) {
        if (parcelable != null) {
            this.f986a = parcelable == f985b ? null : parcelable;
            return;
        }
        throw new IllegalArgumentException("superState must not be null");
    }

    public b(Parcel parcel, ClassLoader classLoader) {
        Parcelable readParcelable = parcel.readParcelable(classLoader);
        this.f986a = readParcelable == null ? f985b : readParcelable;
    }
}
