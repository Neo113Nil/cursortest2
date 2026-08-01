package v3;

import android.os.Parcel;
import android.os.Parcelable;
import b1.v;
import te.a1;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public abstract class b implements Parcelable {

    /* renamed from: d, reason: collision with root package name */
    public final Parcelable f9953d;

    /* renamed from: e, reason: collision with root package name */
    public static final a f9952e = new a();
    public static final Parcelable.Creator<b> CREATOR = new v(2);

    public b(Parcelable parcelable) {
        if (parcelable != null) {
            this.f9953d = parcelable == f9952e ? null : parcelable;
        } else {
            a1.e("superState must not be null");
            throw null;
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i3) {
        parcel.writeParcelable(this.f9953d, i3);
    }

    public b() {
        this.f9953d = null;
    }

    public b(Parcel parcel, ClassLoader classLoader) {
        Parcelable readParcelable = parcel.readParcelable(classLoader);
        this.f9953d = readParcelable == null ? f9952e : readParcelable;
    }
}
