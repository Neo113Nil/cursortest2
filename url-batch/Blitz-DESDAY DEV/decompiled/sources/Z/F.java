package Z;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class F implements Parcelable {
    public static final Parcelable.Creator<F> CREATOR = new S.k(3);

    /* renamed from: a, reason: collision with root package name */
    public String f1016a;

    /* renamed from: b, reason: collision with root package name */
    public int f1017b;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f1016a);
        parcel.writeInt(this.f1017b);
    }
}
