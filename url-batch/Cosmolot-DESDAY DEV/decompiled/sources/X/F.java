package X;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class F implements Parcelable {
    public static final Parcelable.Creator<F> CREATOR = new Q.k(3);

    /* renamed from: a, reason: collision with root package name */
    public String f790a;

    /* renamed from: b, reason: collision with root package name */
    public int f791b;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f790a);
        parcel.writeInt(this.f791b);
    }
}
