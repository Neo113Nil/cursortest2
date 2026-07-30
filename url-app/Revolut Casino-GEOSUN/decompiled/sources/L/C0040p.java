package L;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: L.p, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0040p implements Parcelable {
    public static final Parcelable.Creator<C0040p> CREATOR = new A.l(1);

    /* renamed from: a, reason: collision with root package name */
    public int f585a;

    /* renamed from: b, reason: collision with root package name */
    public int f586b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f587c;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        parcel.writeInt(this.f585a);
        parcel.writeInt(this.f586b);
        parcel.writeInt(this.f587c ? 1 : 0);
    }
}
