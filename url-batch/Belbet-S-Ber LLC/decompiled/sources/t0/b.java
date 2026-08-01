package t0;

import a0.h;
import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-cbdb90155a17acee3f5e5c838b1038a1056cff151b1a2a170c159711c8afb558 */
/* loaded from: classes.dex */
public abstract class b implements Parcelable {

    /* renamed from: f, reason: collision with root package name */
    public final Parcelable f3386f;

    /* renamed from: g, reason: collision with root package name */
    public static final a f3385g = new a();
    public static final Parcelable.Creator<b> CREATOR = new h(7);

    public b() {
        this.f3386f = null;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f3386f, i);
    }

    public b(Parcelable parcelable) {
        if (parcelable != null) {
            this.f3386f = parcelable == f3385g ? null : parcelable;
            return;
        }
        throw new IllegalArgumentException("superState must not be null");
    }

    public b(Parcel parcel, ClassLoader classLoader) {
        Parcelable readParcelable = parcel.readParcelable(classLoader);
        this.f3386f = readParcelable == null ? f3385g : readParcelable;
    }
}
