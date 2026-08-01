package R;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public abstract class b implements Parcelable {

    /* renamed from: a, reason: collision with root package name */
    public final Parcelable f675a;

    /* renamed from: b, reason: collision with root package name */
    public static final a f674b = new a();
    public static final Parcelable.Creator<b> CREATOR = new B0.b(3);

    public b() {
        this.f675a = null;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f675a, i);
    }

    public b(Parcelable parcelable) {
        if (parcelable != null) {
            this.f675a = parcelable == f674b ? null : parcelable;
            return;
        }
        throw new IllegalArgumentException("superState must not be null");
    }

    public b(Parcel parcel, ClassLoader classLoader) {
        Parcelable readParcelable = parcel.readParcelable(classLoader);
        this.f675a = readParcelable == null ? f674b : readParcelable;
    }
}
