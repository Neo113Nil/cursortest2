package Y;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class F implements Parcelable {
    public static final Parcelable.Creator<F> CREATOR = new F0.b(4);

    /* renamed from: a, reason: collision with root package name */
    public String f1286a;

    /* renamed from: b, reason: collision with root package name */
    public int f1287b;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f1286a);
        parcel.writeInt(this.f1287b);
    }
}
