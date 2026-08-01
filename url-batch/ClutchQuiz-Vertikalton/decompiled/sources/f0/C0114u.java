package f0;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: f0.u, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0114u implements Parcelable {
    public static final Parcelable.Creator<C0114u> CREATOR = new C0.b(11);

    /* renamed from: a, reason: collision with root package name */
    public int f2348a;

    /* renamed from: b, reason: collision with root package name */
    public int f2349b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f2350c;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f2348a);
        parcel.writeInt(this.f2349b);
        parcel.writeInt(this.f2350c ? 1 : 0);
    }
}
