package h0;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: h0.v, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0139v implements Parcelable {
    public static final Parcelable.Creator<C0139v> CREATOR = new R.k(10);

    /* renamed from: a, reason: collision with root package name */
    public int f2622a;

    /* renamed from: b, reason: collision with root package name */
    public int f2623b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f2624c;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f2622a);
        parcel.writeInt(this.f2623b);
        parcel.writeInt(this.f2624c ? 1 : 0);
    }
}
