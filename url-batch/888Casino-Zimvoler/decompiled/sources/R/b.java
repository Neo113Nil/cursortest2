package R;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public abstract class b implements Parcelable {

    /* renamed from: a, reason: collision with root package name */
    public final Parcelable f669a;

    /* renamed from: b, reason: collision with root package name */
    public static final a f668b = new a();
    public static final Parcelable.Creator<b> CREATOR = new B0.b(3);

    public b() {
        this.f669a = null;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f669a, i);
    }

    public b(Parcelable parcelable) {
        if (parcelable != null) {
            this.f669a = parcelable == f668b ? null : parcelable;
            return;
        }
        throw new IllegalArgumentException("superState must not be null");
    }

    public b(Parcel parcel, ClassLoader classLoader) {
        Parcelable readParcelable = parcel.readParcelable(classLoader);
        this.f669a = readParcelable == null ? f668b : readParcelable;
    }
}
