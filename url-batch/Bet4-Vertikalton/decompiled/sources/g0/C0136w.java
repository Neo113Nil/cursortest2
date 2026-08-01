package g0;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: g0.w, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0136w implements Parcelable {
    public static final Parcelable.Creator<C0136w> CREATOR = new Q.k(10);

    /* renamed from: a, reason: collision with root package name */
    public int f2494a;

    /* renamed from: b, reason: collision with root package name */
    public int f2495b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f2496c;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f2494a);
        parcel.writeInt(this.f2495b);
        parcel.writeInt(this.f2496c ? 1 : 0);
    }
}
