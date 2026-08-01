package X;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class F implements Parcelable {
    public static final Parcelable.Creator<F> CREATOR = new Q.k(3);

    /* renamed from: a, reason: collision with root package name */
    public String f796a;

    /* renamed from: b, reason: collision with root package name */
    public int f797b;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f796a);
        parcel.writeInt(this.f797b);
    }
}
