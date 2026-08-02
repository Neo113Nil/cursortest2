package J;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public abstract class c implements Parcelable {

    /* renamed from: a, reason: collision with root package name */
    public final Parcelable f1142a;

    /* renamed from: b, reason: collision with root package name */
    public static final a f1141b = new a();
    public static final Parcelable.Creator<c> CREATOR = new b(0);

    public c() {
        this.f1142a = null;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i4) {
        parcel.writeParcelable(this.f1142a, i4);
    }

    public c(Parcelable parcelable) {
        if (parcelable != null) {
            this.f1142a = parcelable == f1141b ? null : parcelable;
            return;
        }
        throw new IllegalArgumentException("superState must not be null");
    }

    public c(Parcel parcel, ClassLoader classLoader) {
        Parcelable readParcelable = parcel.readParcelable(classLoader);
        this.f1142a = readParcelable == null ? f1141b : readParcelable;
    }
}
