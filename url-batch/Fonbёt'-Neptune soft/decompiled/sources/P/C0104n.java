package P;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: P.n, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0104n implements Parcelable {
    public static final Parcelable.Creator<C0104n> CREATOR = new F.k(1);

    /* renamed from: a, reason: collision with root package name */
    public int f937a;

    /* renamed from: b, reason: collision with root package name */
    public int f938b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f939c;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        parcel.writeInt(this.f937a);
        parcel.writeInt(this.f938b);
        parcel.writeInt(this.f939c ? 1 : 0);
    }
}
