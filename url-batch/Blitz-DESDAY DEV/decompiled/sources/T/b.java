package T;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public abstract class b implements Parcelable {

    /* renamed from: a, reason: collision with root package name */
    public final Parcelable f802a;

    /* renamed from: b, reason: collision with root package name */
    public static final a f801b = new a();
    public static final Parcelable.Creator<b> CREATOR = new F0.b(3);

    public b() {
        this.f802a = null;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f802a, i);
    }

    public b(Parcelable parcelable) {
        if (parcelable != null) {
            this.f802a = parcelable == f801b ? null : parcelable;
            return;
        }
        throw new IllegalArgumentException("superState must not be null");
    }

    public b(Parcel parcel, ClassLoader classLoader) {
        Parcelable readParcelable = parcel.readParcelable(classLoader);
        this.f802a = readParcelable == null ? f801b : readParcelable;
    }
}
