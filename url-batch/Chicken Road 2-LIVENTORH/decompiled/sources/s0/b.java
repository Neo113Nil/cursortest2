package s0;

import a0.g;
import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-fb2637cf2a71147074b02d847622f707cfc12821f1b81d08e7915f8e7b9519ab */
/* loaded from: classes.dex */
public abstract class b implements Parcelable {

    /* renamed from: f, reason: collision with root package name */
    public final Parcelable f3175f;

    /* renamed from: g, reason: collision with root package name */
    public static final a f3174g = new a();
    public static final Parcelable.Creator<b> CREATOR = new g(8);

    public b() {
        this.f3175f = null;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f3175f, i);
    }

    public b(Parcelable parcelable) {
        if (parcelable != null) {
            this.f3175f = parcelable == f3174g ? null : parcelable;
            return;
        }
        throw new IllegalArgumentException("superState must not be null");
    }

    public b(Parcel parcel, ClassLoader classLoader) {
        Parcelable readParcelable = parcel.readParcelable(classLoader);
        this.f3175f = readParcelable == null ? f3174g : readParcelable;
    }
}
