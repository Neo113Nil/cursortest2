package N;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public abstract class c implements Parcelable {

    /* renamed from: d, reason: collision with root package name */
    public final Parcelable f1776d;

    /* renamed from: e, reason: collision with root package name */
    public static final a f1775e = new a();
    public static final Parcelable.Creator<c> CREATOR = new b(0);

    public c() {
        this.f1776d = null;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeParcelable(this.f1776d, i2);
    }

    public c(Parcelable parcelable) {
        if (parcelable != null) {
            this.f1776d = parcelable == f1775e ? null : parcelable;
            return;
        }
        throw new IllegalArgumentException("superState must not be null");
    }

    public c(Parcel parcel, ClassLoader classLoader) {
        Parcelable readParcelable = parcel.readParcelable(classLoader);
        this.f1776d = readParcelable == null ? f1775e : readParcelable;
    }
}
