package p0;

import a2.c;
import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-72a2021f0a77848162657eed404f056d03742612a99b9acca4b8f3bd8ed17555 */
/* loaded from: classes.dex */
public abstract class b implements Parcelable {

    /* renamed from: f, reason: collision with root package name */
    public final Parcelable f3016f;
    public static final a g = new a();
    public static final Parcelable.Creator<b> CREATOR = new c(5);

    public b() {
        this.f3016f = null;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i4) {
        parcel.writeParcelable(this.f3016f, i4);
    }

    public b(Parcelable parcelable) {
        if (parcelable != null) {
            this.f3016f = parcelable == g ? null : parcelable;
            return;
        }
        throw new IllegalArgumentException("superState must not be null");
    }

    public b(Parcel parcel, ClassLoader classLoader) {
        Parcelable readParcelable = parcel.readParcelable(classLoader);
        this.f3016f = readParcelable == null ? g : readParcelable;
    }
}
