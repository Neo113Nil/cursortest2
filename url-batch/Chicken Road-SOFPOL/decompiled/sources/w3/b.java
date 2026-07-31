package w3;

import android.os.Parcel;
import android.os.Parcelable;
import w0.o;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public abstract class b implements Parcelable {

    /* renamed from: d, reason: collision with root package name */
    public final Parcelable f7877d;

    /* renamed from: e, reason: collision with root package name */
    public static final a f7876e = new a();
    public static final Parcelable.Creator<b> CREATOR = new o(6);

    public b() {
        this.f7877d = null;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f7877d, i);
    }

    public b(Parcelable parcelable) {
        if (parcelable != null) {
            this.f7877d = parcelable == f7876e ? null : parcelable;
            return;
        }
        throw new IllegalArgumentException("superState must not be null");
    }

    public b(Parcel parcel, ClassLoader classLoader) {
        Parcelable readParcelable = parcel.readParcelable(classLoader);
        this.f7877d = readParcelable == null ? f7876e : readParcelable;
    }
}
