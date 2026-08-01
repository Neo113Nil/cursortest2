package f0;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: f0.u, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0109u implements Parcelable {
    public static final Parcelable.Creator<C0109u> CREATOR = new Q.k(10);

    /* renamed from: a, reason: collision with root package name */
    public int f2231a;

    /* renamed from: b, reason: collision with root package name */
    public int f2232b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f2233c;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f2231a);
        parcel.writeInt(this.f2232b);
        parcel.writeInt(this.f2233c ? 1 : 0);
    }
}
