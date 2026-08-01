package f0;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: f0.u, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0106u implements Parcelable {
    public static final Parcelable.Creator<C0106u> CREATOR = new A0.b(11);

    /* renamed from: a, reason: collision with root package name */
    public int f2274a;

    /* renamed from: b, reason: collision with root package name */
    public int f2275b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f2276c;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f2274a);
        parcel.writeInt(this.f2275b);
        parcel.writeInt(this.f2276c ? 1 : 0);
    }
}
