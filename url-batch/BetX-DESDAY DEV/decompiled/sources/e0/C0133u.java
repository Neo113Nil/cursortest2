package e0;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: e0.u, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0133u implements Parcelable {
    public static final Parcelable.Creator<C0133u> CREATOR = new Q.k(11);

    /* renamed from: a, reason: collision with root package name */
    public int f2350a;

    /* renamed from: b, reason: collision with root package name */
    public int f2351b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f2352c;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f2350a);
        parcel.writeInt(this.f2351b);
        parcel.writeInt(this.f2352c ? 1 : 0);
    }
}
