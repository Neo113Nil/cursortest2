package h0;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: h0.u, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0133u implements Parcelable {
    public static final Parcelable.Creator<C0133u> CREATOR = new S.k(10);

    /* renamed from: a, reason: collision with root package name */
    public int f2590a;

    /* renamed from: b, reason: collision with root package name */
    public int f2591b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f2592c;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f2590a);
        parcel.writeInt(this.f2591b);
        parcel.writeInt(this.f2592c ? 1 : 0);
    }
}
