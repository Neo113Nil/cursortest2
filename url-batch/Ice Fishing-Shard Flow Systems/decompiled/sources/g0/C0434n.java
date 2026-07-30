package g0;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: g0.n, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0434n implements Parcelable {
    public static final Parcelable.Creator<C0434n> CREATOR = new I1.c(13);

    /* renamed from: d, reason: collision with root package name */
    public int f4953d;

    /* renamed from: e, reason: collision with root package name */
    public int f4954e;

    /* renamed from: i, reason: collision with root package name */
    public boolean f4955i;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        parcel.writeInt(this.f4953d);
        parcel.writeInt(this.f4954e);
        parcel.writeInt(this.f4955i ? 1 : 0);
    }
}
