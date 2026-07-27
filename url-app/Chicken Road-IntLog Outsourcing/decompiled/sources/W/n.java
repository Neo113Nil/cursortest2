package W;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class n implements Parcelable {
    public static final Parcelable.Creator<n> CREATOR = new B1.c(10);

    /* renamed from: a, reason: collision with root package name */
    public int f3358a;

    /* renamed from: b, reason: collision with root package name */
    public int f3359b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f3360c;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        parcel.writeInt(this.f3358a);
        parcel.writeInt(this.f3359b);
        parcel.writeInt(this.f3360c ? 1 : 0);
    }
}
