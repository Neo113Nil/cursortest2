package E;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public abstract class c implements Parcelable {

    /* renamed from: e, reason: collision with root package name */
    public final Parcelable f209e;

    /* renamed from: f, reason: collision with root package name */
    public static final a f208f = new a();
    public static final Parcelable.Creator<c> CREATOR = new b(0);

    public c() {
        this.f209e = null;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeParcelable(this.f209e, i2);
    }

    public c(Parcelable parcelable) {
        if (parcelable != null) {
            this.f209e = parcelable == f208f ? null : parcelable;
            return;
        }
        throw new IllegalArgumentException("superState must not be null");
    }

    public c(Parcel parcel, ClassLoader classLoader) {
        Parcelable readParcelable = parcel.readParcelable(classLoader);
        this.f209e = readParcelable == null ? f208f : readParcelable;
    }
}
