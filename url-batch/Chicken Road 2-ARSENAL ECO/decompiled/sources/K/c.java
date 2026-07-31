package K;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public abstract class c implements Parcelable {

    /* renamed from: f, reason: collision with root package name */
    public final Parcelable f1342f;

    /* renamed from: g, reason: collision with root package name */
    public static final a f1341g = new a();
    public static final Parcelable.Creator<c> CREATOR = new b(0);

    public c() {
        this.f1342f = null;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i7) {
        parcel.writeParcelable(this.f1342f, i7);
    }

    public c(Parcelable parcelable) {
        if (parcelable != null) {
            this.f1342f = parcelable == f1341g ? null : parcelable;
            return;
        }
        throw new IllegalArgumentException("superState must not be null");
    }

    public c(Parcel parcel, ClassLoader classLoader) {
        Parcelable readParcelable = parcel.readParcelable(classLoader);
        this.f1342f = readParcelable == null ? f1341g : readParcelable;
    }
}
